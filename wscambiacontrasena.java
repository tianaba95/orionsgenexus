/*
               File: WSCambiaContrasena
        Description: WSCambia Contraseña
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:58.77
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wscambiacontrasena extends GXProcedure
{
   public wscambiacontrasena( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wscambiacontrasena.class ), "" );
   }

   public wscambiacontrasena( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String[] aP0 )
   {
      wscambiacontrasena.this.AV16Usuario = aP0[0];
      this.aP0 = aP0;
      wscambiacontrasena.this.AV15Usua_Clave = aP1[0];
      this.aP1 = aP1;
      wscambiacontrasena.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      wscambiacontrasena.this.AV16Usuario = aP0[0];
      this.aP0 = aP0;
      wscambiacontrasena.this.AV15Usua_Clave = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Programa = "cambiarClaveUsuario" ;
      AV11Estado = "" ;
      GXv_char1[0] = AV17Host ;
      GXv_char2[0] = AV18URL ;
      GXv_int3[0] = (short)(DecimalUtil.decToDouble(AV21Puerto)) ;
      new com.orions2.parametrosservicios(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      wscambiacontrasena.this.AV17Host = GXv_char1[0] ;
      wscambiacontrasena.this.AV18URL = GXv_char2[0] ;
      wscambiacontrasena.this.AV21Puerto = DecimalUtil.doubleToDec(GXv_int3[0]) ;
      AV12HttpClient.setHost( AV17Host );
      AV12HttpClient.setPort( (int)(DecimalUtil.decToDouble(AV21Puerto)) );
      AV12HttpClient.setBaseURL( AV18URL );
      GXt_SdtSDTCambiaContrasena4 = AV10DatosSDT;
      GXv_SdtSDTCambiaContrasena5[0] = GXt_SdtSDTCambiaContrasena4;
      new com.orions2.dpcambiacontrasena(remoteHandle, context).execute( AV16Usuario, AV15Usua_Clave, GXv_SdtSDTCambiaContrasena5) ;
      GXt_SdtSDTCambiaContrasena4 = GXv_SdtSDTCambiaContrasena5[0] ;
      AV10DatosSDT = GXt_SdtSDTCambiaContrasena4;
      AV8body = AV10DatosSDT.toJSonString(false) ;
      AV12HttpClient.addHeader("Content-type", "application/json");
      AV12HttpClient.addString(AV8body);
      AV12HttpClient.execute("POST", AV14Programa);
      AV13lvc = AV12HttpClient.getString() ;
      if ( AV12HttpClient.getStatusCode() == 201 )
      {
         AV11Estado = "K" ;
      }
      else
      {
         AV11Estado = "E" ;
      }
      GXv_char2[0] = "CTRWS" ;
      GXv_int6[0] = AV9cons_Numero ;
      new com.orions2.devuelveconsecutivo(remoteHandle, context).execute( GXv_char2, GXv_int6) ;
      wscambiacontrasena.this.AV9cons_Numero = GXv_int6[0] ;
      /*
         INSERT RECORD ON TABLE SEG_CONTROL_WEBSERVICES

      */
      A15Control_Id = AV9cons_Numero ;
      A194Control_CodUsuario = AV16Usuario ;
      A190Control_Body = AV8body ;
      A192Control_Estado = AV11Estado ;
      A187Control_FechaHora = GXutil.now( ) ;
      A191Control_Lvc = AV13lvc ;
      A189Control_Programa = AV14Programa ;
      A188Control_Usuario = AV16Usuario ;
      /* Using cursor P00102 */
      pr_default.execute(0, new Object[] {new Long(A15Control_Id), A187Control_FechaHora, A188Control_Usuario, A189Control_Programa, A190Control_Body, A191Control_Lvc, A192Control_Estado, A194Control_CodUsuario});
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
      this.aP0[0] = wscambiacontrasena.this.AV16Usuario;
      this.aP1[0] = wscambiacontrasena.this.AV15Usua_Clave;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "wscambiacontrasena");
      CloseOpenCursors();
      AV12HttpClient.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14Programa = "" ;
      AV11Estado = "" ;
      AV17Host = "" ;
      GXv_char1 = new String [1] ;
      AV18URL = "" ;
      AV21Puerto = DecimalUtil.ZERO ;
      GXv_int3 = new short [1] ;
      AV12HttpClient = new com.genexus.internet.HttpClient();
      AV10DatosSDT = new com.orions2.SdtSDTCambiaContrasena(remoteHandle, context);
      GXt_SdtSDTCambiaContrasena4 = new com.orions2.SdtSDTCambiaContrasena(remoteHandle, context);
      GXv_SdtSDTCambiaContrasena5 = new com.orions2.SdtSDTCambiaContrasena [1] ;
      AV8body = "" ;
      AV13lvc = "" ;
      GXv_char2 = new String [1] ;
      GXv_int6 = new long [1] ;
      A194Control_CodUsuario = "" ;
      A190Control_Body = "" ;
      A192Control_Estado = "" ;
      A187Control_FechaHora = GXutil.resetTime( GXutil.nullDate() );
      A191Control_Lvc = "" ;
      A189Control_Programa = "" ;
      A188Control_Usuario = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wscambiacontrasena__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short GXv_int3[] ;
   private short Gx_err ;
   private int GX_INS23 ;
   private long AV9cons_Numero ;
   private long GXv_int6[] ;
   private long A15Control_Id ;
   private java.math.BigDecimal AV21Puerto ;
   private String AV14Programa ;
   private String AV11Estado ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String A192Control_Estado ;
   private String A189Control_Programa ;
   private String Gx_emsg ;
   private java.util.Date A187Control_FechaHora ;
   private String AV8body ;
   private String AV13lvc ;
   private String A190Control_Body ;
   private String A191Control_Lvc ;
   private String AV16Usuario ;
   private String AV15Usua_Clave ;
   private String AV17Host ;
   private String AV18URL ;
   private String A194Control_CodUsuario ;
   private String A188Control_Usuario ;
   private com.genexus.internet.HttpClient AV12HttpClient ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private com.orions2.SdtSDTCambiaContrasena AV10DatosSDT ;
   private com.orions2.SdtSDTCambiaContrasena GXt_SdtSDTCambiaContrasena4 ;
   private com.orions2.SdtSDTCambiaContrasena GXv_SdtSDTCambiaContrasena5[] ;
}

final  class wscambiacontrasena__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00102", "INSERT INTO SEG_CONTROL_WEBSERVICES(Control_Id, Control_FechaHora, Control_Usuario, Control_Programa, Control_Body, Control_Lvc, Control_Estado, Control_CodUsuario, Control_IdUsuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_CONTROL_WEBSERVICES")
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
               stmt.setVarchar(3, (String)parms[2], 30, false);
               stmt.setString(4, (String)parms[3], 25);
               stmt.setLongVarchar(5, (String)parms[4], false);
               stmt.setLongVarchar(6, (String)parms[5], false);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setVarchar(8, (String)parms[7], 30, false);
               return;
      }
   }

}

