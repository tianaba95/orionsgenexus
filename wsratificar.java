/*
               File: WSRatificar
        Description: WSRatificar
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:6.35
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wsratificar extends GXProcedure
{
   public wsratificar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wsratificar.class ), "" );
   }

   public wsratificar( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( )
   {
      wsratificar.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      wsratificar.this.aP0 = new long[] {0};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( long[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( long[] aP0 )
   {
      wsratificar.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Programa = "ratificarTransaccion" ;
      AV22Usuario = AV23webSession.getValue("Usuario") ;
      AV21Usua_Id = GXutil.lval( AV23webSession.getValue("UsuarioId")) ;
      GXv_char1[0] = AV13Host ;
      GXv_char2[0] = AV20URL ;
      GXv_int3[0] = AV18Puerto ;
      new com.orions2.parametrosservicios(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      wsratificar.this.AV13Host = GXv_char1[0] ;
      wsratificar.this.AV20URL = GXv_char2[0] ;
      wsratificar.this.AV18Puerto = GXv_int3[0] ;
      AV14HttpClient.setHost( AV13Host );
      AV14HttpClient.setPort( AV18Puerto );
      AV14HttpClient.setBaseURL( AV20URL );
      GXt_SdtSDTRatificar4 = AV19SDTRatificar;
      GXv_SdtSDTRatificar5[0] = GXt_SdtSDTRatificar4;
      new com.orions2.dpratificar(remoteHandle, context).execute( AV8Tran_Id, GXv_SdtSDTRatificar5) ;
      GXt_SdtSDTRatificar4 = GXv_SdtSDTRatificar5[0] ;
      AV19SDTRatificar = GXt_SdtSDTRatificar4;
      AV10body = AV19SDTRatificar.toJSonString(false) ;
      AV14HttpClient.addHeader("Content-type", "application/json;charset=UTF-8");
      AV14HttpClient.addString(AV10body);
      AV14HttpClient.execute("POST", AV17Programa);
      AV16lvc = AV14HttpClient.getString() ;
      if ( AV14HttpClient.getStatusCode() == 201 )
      {
         httpContext.GX_msglist.addItem("Los Datos Fueron Guardados");
         AV12Estado = "K" ;
      }
      else
      {
         httpContext.GX_msglist.addItem("Ha ocurrido un error en el Web Services");
         AV12Estado = "E" ;
      }
      GXv_char2[0] = "CTRWS" ;
      GXv_int6[0] = AV11cons_Numero ;
      new com.orions2.devuelveconsecutivo(remoteHandle, context).execute( GXv_char2, GXv_int6) ;
      wsratificar.this.AV11cons_Numero = GXv_int6[0] ;
      /*
         INSERT RECORD ON TABLE SEG_CONTROL_WEBSERVICES

      */
      A15Control_Id = AV11cons_Numero ;
      A193Control_IdUsuario = AV21Usua_Id ;
      A190Control_Body = AV10body ;
      A192Control_Estado = AV12Estado ;
      A187Control_FechaHora = GXutil.now( ) ;
      A191Control_Lvc = AV16lvc ;
      A189Control_Programa = AV17Programa ;
      A188Control_Usuario = AV22Usuario ;
      /* Using cursor P001R2 */
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
      this.aP0[0] = wsratificar.this.AV8Tran_Id;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "wsratificar");
      CloseOpenCursors();
      AV14HttpClient.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Programa = "" ;
      AV22Usuario = "" ;
      AV23webSession = httpContext.getWebSession();
      AV13Host = "" ;
      GXv_char1 = new String [1] ;
      AV20URL = "" ;
      GXv_int3 = new short [1] ;
      AV14HttpClient = new com.genexus.internet.HttpClient();
      AV19SDTRatificar = new com.orions2.SdtSDTRatificar(remoteHandle, context);
      GXt_SdtSDTRatificar4 = new com.orions2.SdtSDTRatificar(remoteHandle, context);
      GXv_SdtSDTRatificar5 = new com.orions2.SdtSDTRatificar [1] ;
      AV10body = "" ;
      AV16lvc = "" ;
      AV12Estado = "" ;
      GXv_char2 = new String [1] ;
      GXv_int6 = new long [1] ;
      A190Control_Body = "" ;
      A192Control_Estado = "" ;
      A187Control_FechaHora = GXutil.resetTime( GXutil.nullDate() );
      A191Control_Lvc = "" ;
      A189Control_Programa = "" ;
      A188Control_Usuario = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wsratificar__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV18Puerto ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int GX_INS23 ;
   private long AV8Tran_Id ;
   private long AV21Usua_Id ;
   private long AV11cons_Numero ;
   private long GXv_int6[] ;
   private long A15Control_Id ;
   private long A193Control_IdUsuario ;
   private String AV17Programa ;
   private String GXv_char1[] ;
   private String AV12Estado ;
   private String GXv_char2[] ;
   private String A192Control_Estado ;
   private String A189Control_Programa ;
   private String Gx_emsg ;
   private java.util.Date A187Control_FechaHora ;
   private String AV10body ;
   private String AV16lvc ;
   private String A190Control_Body ;
   private String A191Control_Lvc ;
   private String AV22Usuario ;
   private String AV13Host ;
   private String AV20URL ;
   private String A188Control_Usuario ;
   private com.genexus.internet.HttpClient AV14HttpClient ;
   private com.genexus.webpanels.WebSession AV23webSession ;
   private long[] aP0 ;
   private IDataStoreProvider pr_default ;
   private com.orions2.SdtSDTRatificar AV19SDTRatificar ;
   private com.orions2.SdtSDTRatificar GXt_SdtSDTRatificar4 ;
   private com.orions2.SdtSDTRatificar GXv_SdtSDTRatificar5[] ;
}

final  class wsratificar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P001R2", "INSERT INTO SEG_CONTROL_WEBSERVICES(Control_Id, Control_FechaHora, Control_IdUsuario, Control_Usuario, Control_Programa, Control_Body, Control_Lvc, Control_Estado, Control_CodUsuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_CONTROL_WEBSERVICES")
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

