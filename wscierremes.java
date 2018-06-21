/*
               File: WSCierreMes
        Description: WSCierre Mes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:57.9
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wscierremes extends GXProcedure
{
   public wscierremes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wscierremes.class ), "" );
   }

   public wscierremes( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 )
   {
      wscierremes.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      wscierremes.this.AV22Respuesta = aP1[0];
      this.aP1 = aP1;
      wscierremes.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 )
   {
      wscierremes.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      wscierremes.this.AV22Respuesta = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Programa = "verificarCierre" ;
      AV20Usuario = AV21websession.getValue("Usuario") ;
      AV19Usua_Id = GXutil.lval( AV21websession.getValue("UsuarioId")) ;
      GXv_char1[0] = AV12Host ;
      GXv_char2[0] = AV18URL ;
      GXv_int3[0] = AV16Puerto ;
      new com.orions2.parametrosservicios(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      wscierremes.this.AV12Host = GXv_char1[0] ;
      wscierremes.this.AV18URL = GXv_char2[0] ;
      wscierremes.this.AV16Puerto = GXv_int3[0] ;
      AV13HttpClient.setHost( AV12Host );
      AV13HttpClient.setPort( AV16Puerto );
      AV13HttpClient.setBaseURL( AV18URL );
      GXt_SdtSDTCierreMes4 = AV17SDTCierreMes;
      GXv_SdtSDTCierreMes5[0] = GXt_SdtSDTCierreMes4;
      new com.orions2.dpcierremes(remoteHandle, context).execute( AV8Tran_Id, GXv_SdtSDTCierreMes5) ;
      GXt_SdtSDTCierreMes4 = GXv_SdtSDTCierreMes5[0] ;
      AV17SDTCierreMes = GXt_SdtSDTCierreMes4;
      AV9body = AV17SDTCierreMes.toJSonString(false) ;
      AV13HttpClient.addHeader("Content-type", "application/json;charset=UTF-8");
      AV13HttpClient.addString(AV9body);
      AV13HttpClient.execute("POST", AV15Programa);
      AV14lvc = AV13HttpClient.getString() ;
      AV22Respuesta = GXutil.ltrim( AV14lvc) ;
      if ( AV13HttpClient.getStatusCode() == 201 )
      {
         AV11Estado = "K" ;
      }
      else
      {
         httpContext.GX_msglist.addItem("Ha ocurrido un error en el Web Services");
         AV11Estado = "E" ;
      }
      GXv_char2[0] = "CTRWS" ;
      GXv_int6[0] = AV10cons_Numero ;
      new com.orions2.devuelveconsecutivo(remoteHandle, context).execute( GXv_char2, GXv_int6) ;
      wscierremes.this.AV10cons_Numero = GXv_int6[0] ;
      /*
         INSERT RECORD ON TABLE SEG_CONTROL_WEBSERVICES

      */
      A15Control_Id = AV10cons_Numero ;
      A193Control_IdUsuario = AV19Usua_Id ;
      A190Control_Body = AV9body ;
      A192Control_Estado = AV11Estado ;
      A187Control_FechaHora = GXutil.now( ) ;
      A191Control_Lvc = AV14lvc ;
      A189Control_Programa = AV15Programa ;
      A188Control_Usuario = AV20Usuario ;
      /* Using cursor P000H2 */
      pr_default.execute(0, new Object[] {new Long(A15Control_Id), A187Control_FechaHora, new Long(A193Control_IdUsuario), A188Control_Usuario, A189Control_Programa, A190Control_Body, A191Control_Lvc, A192Control_Estado});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_CONTROL_WEBSERVICES") ;
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = wscierremes.this.AV8Tran_Id;
      this.aP1[0] = wscierremes.this.AV22Respuesta;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "wscierremes");
      CloseOpenCursors();
      AV13HttpClient.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Programa = "" ;
      AV20Usuario = "" ;
      AV21websession = httpContext.getWebSession();
      AV12Host = "" ;
      GXv_char1 = new String [1] ;
      AV18URL = "" ;
      GXv_int3 = new short [1] ;
      AV13HttpClient = new com.genexus.internet.HttpClient();
      AV17SDTCierreMes = new com.orions2.SdtSDTCierreMes(remoteHandle, context);
      GXt_SdtSDTCierreMes4 = new com.orions2.SdtSDTCierreMes(remoteHandle, context);
      GXv_SdtSDTCierreMes5 = new com.orions2.SdtSDTCierreMes [1] ;
      AV9body = "" ;
      AV14lvc = "" ;
      AV11Estado = "" ;
      GXv_char2 = new String [1] ;
      GXv_int6 = new long [1] ;
      A190Control_Body = "" ;
      A192Control_Estado = "" ;
      A187Control_FechaHora = GXutil.resetTime( GXutil.nullDate() );
      A191Control_Lvc = "" ;
      A189Control_Programa = "" ;
      A188Control_Usuario = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wscierremes__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16Puerto ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int GX_INS23 ;
   private long AV8Tran_Id ;
   private long AV19Usua_Id ;
   private long AV10cons_Numero ;
   private long GXv_int6[] ;
   private long A15Control_Id ;
   private long A193Control_IdUsuario ;
   private String AV22Respuesta ;
   private String AV15Programa ;
   private String GXv_char1[] ;
   private String AV11Estado ;
   private String GXv_char2[] ;
   private String A192Control_Estado ;
   private String A189Control_Programa ;
   private String Gx_emsg ;
   private java.util.Date A187Control_FechaHora ;
   private String AV9body ;
   private String AV14lvc ;
   private String A190Control_Body ;
   private String A191Control_Lvc ;
   private String AV20Usuario ;
   private String AV12Host ;
   private String AV18URL ;
   private String A188Control_Usuario ;
   private com.genexus.internet.HttpClient AV13HttpClient ;
   private com.genexus.webpanels.WebSession AV21websession ;
   private long[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private com.orions2.SdtSDTCierreMes AV17SDTCierreMes ;
   private com.orions2.SdtSDTCierreMes GXt_SdtSDTCierreMes4 ;
   private com.orions2.SdtSDTCierreMes GXv_SdtSDTCierreMes5[] ;
}

final  class wscierremes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P000H2", "INSERT INTO SEG_CONTROL_WEBSERVICES(Control_Id, Control_FechaHora, Control_IdUsuario, Control_Usuario, Control_Programa, Control_Body, Control_Lvc, Control_Estado, Control_CodUsuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_CONTROL_WEBSERVICES")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setBigDecimal(3, ((Number) parms[2]).longValue(), 0);
               stmt.setVarchar(4, (String)parms[3], 30, false);
               stmt.setString(5, (String)parms[4], 25);
               stmt.setLongVarchar(6, (String)parms[5], false);
               stmt.setLongVarchar(7, (String)parms[6], false);
               stmt.setString(8, (String)parms[7], 1);
               return;
      }
   }

}

