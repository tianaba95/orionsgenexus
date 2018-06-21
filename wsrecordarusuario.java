/*
               File: WSRecordarUsuario
        Description: WSRecordar Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:3.2
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wsrecordarusuario extends GXProcedure
{
   public wsrecordarusuario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wsrecordarusuario.class ), "" );
   }

   public wsrecordarusuario( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             String[] aP1 )
   {
      wsrecordarusuario.this.AV17usua_Cedula = aP0[0];
      this.aP0 = aP0;
      wsrecordarusuario.this.AV19Usua_Email = aP1[0];
      this.aP1 = aP1;
      wsrecordarusuario.this.AV22Error = aP2[0];
      this.aP2 = aP2;
      wsrecordarusuario.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      wsrecordarusuario.this.AV17usua_Cedula = aP0[0];
      this.aP0 = aP0;
      wsrecordarusuario.this.AV19Usua_Email = aP1[0];
      this.aP1 = aP1;
      wsrecordarusuario.this.AV22Error = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Programa = "recordarUsuario" ;
      AV18Usua_Codigo = "" ;
      AV20Usua_Id = 0 ;
      AV26GXLvl5 = (byte)(0) ;
      /* Using cursor P001I2 */
      pr_default.execute(0, new Object[] {new Long(AV17usua_Cedula), AV19Usua_Email});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A219Usua_Email = P001I2_A219Usua_Email[0] ;
         A26Usua_Cedula = P001I2_A26Usua_Cedula[0] ;
         A24Usua_Codigo = P001I2_A24Usua_Codigo[0] ;
         A23Usua_Id = P001I2_A23Usua_Id[0] ;
         AV26GXLvl5 = (byte)(1) ;
         AV18Usua_Codigo = A24Usua_Codigo ;
         AV20Usua_Id = A23Usua_Id ;
         AV22Error = "N" ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV26GXLvl5 == 0 )
      {
         AV22Error = "S" ;
      }
      if ( GXutil.strcmp(AV22Error, "N") == 0 )
      {
         GXv_char1[0] = AV11Host ;
         GXv_char2[0] = AV16URL ;
         GXv_int3[0] = AV15Puerto ;
         new com.orions2.parametrosservicios(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
         wsrecordarusuario.this.AV11Host = GXv_char1[0] ;
         wsrecordarusuario.this.AV16URL = GXv_char2[0] ;
         wsrecordarusuario.this.AV15Puerto = GXv_int3[0] ;
         AV12HttpClient.setHost( AV11Host );
         AV12HttpClient.setPort( AV15Puerto );
         AV12HttpClient.setBaseURL( AV16URL );
         GXt_SdtSDTRecordarUsuario4 = AV23SDTRecordarUsuario;
         GXv_SdtSDTRecordarUsuario5[0] = GXt_SdtSDTRecordarUsuario4;
         new com.orions2.dprecordarusuario(remoteHandle, context).execute( AV20Usua_Id, GXv_SdtSDTRecordarUsuario5) ;
         GXt_SdtSDTRecordarUsuario4 = GXv_SdtSDTRecordarUsuario5[0] ;
         AV23SDTRecordarUsuario = GXt_SdtSDTRecordarUsuario4;
         AV8body = AV23SDTRecordarUsuario.toJSonString(false) ;
         AV12HttpClient.addHeader("Content-type", "application/json;charset=UTF-8");
         AV12HttpClient.addString(AV8body);
         AV12HttpClient.execute("POST", AV14Programa);
         AV13lvc = AV12HttpClient.getString() ;
         if ( AV12HttpClient.getStatusCode() == 201 )
         {
            httpContext.GX_msglist.addItem("Por favor verifique su correo electrónico");
            AV10Estado = "K" ;
         }
         else
         {
            httpContext.GX_msglist.addItem("Ha ocurrido un error en el Web Services");
            AV10Estado = "E" ;
         }
         GXv_char2[0] = "CTRWS" ;
         GXv_int6[0] = AV9cons_Numero ;
         new com.orions2.devuelveconsecutivo(remoteHandle, context).execute( GXv_char2, GXv_int6) ;
         wsrecordarusuario.this.AV9cons_Numero = GXv_int6[0] ;
         /*
            INSERT RECORD ON TABLE SEG_CONTROL_WEBSERVICES

         */
         A15Control_Id = AV9cons_Numero ;
         A193Control_IdUsuario = AV20Usua_Id ;
         A190Control_Body = AV8body ;
         A192Control_Estado = AV10Estado ;
         A187Control_FechaHora = GXutil.now( ) ;
         A191Control_Lvc = AV13lvc ;
         A189Control_Programa = AV14Programa ;
         A188Control_Usuario = AV21Usuario ;
         /* Using cursor P001I3 */
         pr_default.execute(1, new Object[] {new Long(A15Control_Id), A187Control_FechaHora, new Long(A193Control_IdUsuario), A188Control_Usuario, A189Control_Programa, A190Control_Body, A191Control_Lvc, A192Control_Estado});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_CONTROL_WEBSERVICES") ;
         if ( (pr_default.getStatus(1) == 1) )
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
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = wsrecordarusuario.this.AV17usua_Cedula;
      this.aP1[0] = wsrecordarusuario.this.AV19Usua_Email;
      this.aP2[0] = wsrecordarusuario.this.AV22Error;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "wsrecordarusuario");
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
      AV18Usua_Codigo = "" ;
      scmdbuf = "" ;
      P001I2_A219Usua_Email = new String[] {""} ;
      P001I2_A26Usua_Cedula = new long[1] ;
      P001I2_A24Usua_Codigo = new String[] {""} ;
      P001I2_A23Usua_Id = new long[1] ;
      A219Usua_Email = "" ;
      A24Usua_Codigo = "" ;
      AV11Host = "" ;
      GXv_char1 = new String [1] ;
      AV16URL = "" ;
      GXv_int3 = new short [1] ;
      AV12HttpClient = new com.genexus.internet.HttpClient();
      AV23SDTRecordarUsuario = new com.orions2.SdtSDTRecordarUsuario(remoteHandle, context);
      GXt_SdtSDTRecordarUsuario4 = new com.orions2.SdtSDTRecordarUsuario(remoteHandle, context);
      GXv_SdtSDTRecordarUsuario5 = new com.orions2.SdtSDTRecordarUsuario [1] ;
      AV8body = "" ;
      AV13lvc = "" ;
      AV10Estado = "" ;
      GXv_char2 = new String [1] ;
      GXv_int6 = new long [1] ;
      A190Control_Body = "" ;
      A192Control_Estado = "" ;
      A187Control_FechaHora = GXutil.resetTime( GXutil.nullDate() );
      A191Control_Lvc = "" ;
      A189Control_Programa = "" ;
      A188Control_Usuario = "" ;
      AV21Usuario = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wsrecordarusuario__default(),
         new Object[] {
             new Object[] {
            P001I2_A219Usua_Email, P001I2_A26Usua_Cedula, P001I2_A24Usua_Codigo, P001I2_A23Usua_Id
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26GXLvl5 ;
   private short AV15Puerto ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int GX_INS23 ;
   private long AV17usua_Cedula ;
   private long AV20Usua_Id ;
   private long A26Usua_Cedula ;
   private long A23Usua_Id ;
   private long AV9cons_Numero ;
   private long GXv_int6[] ;
   private long A15Control_Id ;
   private long A193Control_IdUsuario ;
   private String AV22Error ;
   private String AV14Programa ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private String AV10Estado ;
   private String GXv_char2[] ;
   private String A192Control_Estado ;
   private String A189Control_Programa ;
   private String Gx_emsg ;
   private java.util.Date A187Control_FechaHora ;
   private String AV8body ;
   private String AV13lvc ;
   private String A190Control_Body ;
   private String A191Control_Lvc ;
   private String AV19Usua_Email ;
   private String AV18Usua_Codigo ;
   private String A219Usua_Email ;
   private String A24Usua_Codigo ;
   private String AV11Host ;
   private String AV16URL ;
   private String A188Control_Usuario ;
   private String AV21Usuario ;
   private com.genexus.internet.HttpClient AV12HttpClient ;
   private long[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P001I2_A219Usua_Email ;
   private long[] P001I2_A26Usua_Cedula ;
   private String[] P001I2_A24Usua_Codigo ;
   private long[] P001I2_A23Usua_Id ;
   private com.orions2.SdtSDTRecordarUsuario AV23SDTRecordarUsuario ;
   private com.orions2.SdtSDTRecordarUsuario GXt_SdtSDTRecordarUsuario4 ;
   private com.orions2.SdtSDTRecordarUsuario GXv_SdtSDTRecordarUsuario5[] ;
}

final  class wsrecordarusuario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001I2", "SELECT Usua_Email, Usua_Cedula, Usua_Codigo, Usua_Id FROM SEG_USUARIO WHERE Usua_Cedula = ? or Usua_Email = ? ORDER BY Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P001I3", "INSERT INTO SEG_CONTROL_WEBSERVICES(Control_Id, Control_FechaHora, Control_IdUsuario, Control_Usuario, Control_Programa, Control_Body, Control_Lvc, Control_Estado, Control_CodUsuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_CONTROL_WEBSERVICES")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
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
               stmt.setVarchar(2, (String)parms[1], 100);
               return;
            case 1 :
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

