/*
               File: WSInactivarUsuario
        Description: WSInactivar Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:58.18
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wsinactivarusuario extends GXProcedure
{
   public wsinactivarusuario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wsinactivarusuario.class ), "" );
   }

   public wsinactivarusuario( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String[] aP0 ,
                           long[] aP1 )
   {
      wsinactivarusuario.this.AV20Usuario = aP0[0];
      this.aP0 = aP0;
      wsinactivarusuario.this.AV19Usua_Id = aP1[0];
      this.aP1 = aP1;
      wsinactivarusuario.this.AV21Tipo = aP2[0];
      this.aP2 = aP2;
      wsinactivarusuario.this.aP2 = new byte[] {0};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             byte[] aP2 )
   {
      wsinactivarusuario.this.AV20Usuario = aP0[0];
      this.aP0 = aP0;
      wsinactivarusuario.this.AV19Usua_Id = aP1[0];
      this.aP1 = aP1;
      wsinactivarusuario.this.AV21Tipo = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Programa = "activacionMasiva" ;
      AV11Estado = "" ;
      GXv_char1[0] = AV12Host ;
      GXv_char2[0] = AV17URL ;
      GXv_int3[0] = AV16Puerto ;
      new com.orions2.parametrosservicios(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      wsinactivarusuario.this.AV12Host = GXv_char1[0] ;
      wsinactivarusuario.this.AV17URL = GXv_char2[0] ;
      wsinactivarusuario.this.AV16Puerto = GXv_int3[0] ;
      AV13HttpClient.setHost( AV12Host );
      AV13HttpClient.setPort( AV16Puerto );
      AV13HttpClient.setBaseURL( AV17URL );
      GXt_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem4 = AV10DatosSDT ;
      GXv_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem5[0] = GXt_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem4 ;
      new com.orions2.dpinactivausuario(remoteHandle, context).execute( AV19Usua_Id, AV21Tipo, GXv_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem5) ;
      GXt_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem4 = GXv_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem5[0] ;
      AV10DatosSDT = GXt_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem4 ;
      AV8body = AV10DatosSDT.toJSonString(false) ;
      AV13HttpClient.addHeader("Content-type", "application/json");
      AV13HttpClient.addString(AV8body);
      AV13HttpClient.execute("POST", AV15Programa);
      AV14lvc = AV13HttpClient.getString() ;
      if ( AV13HttpClient.getStatusCode() == 201 )
      {
         httpContext.GX_msglist.addItem("Los Usuarios se han desactivado");
         AV11Estado = "K" ;
      }
      else
      {
         httpContext.GX_msglist.addItem("Ha ocurrido un error en el Web Services");
         AV11Estado = "E" ;
      }
      GXv_char2[0] = "CTRWS" ;
      GXv_int6[0] = AV9cons_Numero ;
      new com.orions2.devuelveconsecutivo(remoteHandle, context).execute( GXv_char2, GXv_int6) ;
      wsinactivarusuario.this.AV9cons_Numero = GXv_int6[0] ;
      /*
         INSERT RECORD ON TABLE SEG_CONTROL_WEBSERVICES

      */
      A15Control_Id = AV9cons_Numero ;
      A193Control_IdUsuario = 999999999999L ;
      A190Control_Body = AV8body ;
      A192Control_Estado = AV11Estado ;
      A187Control_FechaHora = GXutil.now( ) ;
      A191Control_Lvc = AV14lvc ;
      A189Control_Programa = AV15Programa ;
      A188Control_Usuario = AV20Usuario ;
      /* Using cursor P000S2 */
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
      this.aP0[0] = wsinactivarusuario.this.AV20Usuario;
      this.aP1[0] = wsinactivarusuario.this.AV19Usua_Id;
      this.aP2[0] = wsinactivarusuario.this.AV21Tipo;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "wsinactivarusuario");
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
      AV11Estado = "" ;
      AV12Host = "" ;
      GXv_char1 = new String [1] ;
      AV17URL = "" ;
      GXv_int3 = new short [1] ;
      AV13HttpClient = new com.genexus.internet.HttpClient();
      AV10DatosSDT = new GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>(com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem.class, "SDTInactivarUsuarios.SDTInactivarUsuariosItem", "ACBSENA", remoteHandle);
      GXt_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem4 = new GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>(com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem.class, "SDTInactivarUsuarios.SDTInactivarUsuariosItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem5 = new GXBaseCollection [1] ;
      AV8body = "" ;
      AV14lvc = "" ;
      GXv_char2 = new String [1] ;
      GXv_int6 = new long [1] ;
      A190Control_Body = "" ;
      A192Control_Estado = "" ;
      A187Control_FechaHora = GXutil.resetTime( GXutil.nullDate() );
      A191Control_Lvc = "" ;
      A189Control_Programa = "" ;
      A188Control_Usuario = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wsinactivarusuario__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21Tipo ;
   private short AV16Puerto ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int GX_INS23 ;
   private long AV19Usua_Id ;
   private long AV9cons_Numero ;
   private long GXv_int6[] ;
   private long A15Control_Id ;
   private long A193Control_IdUsuario ;
   private String AV15Programa ;
   private String AV11Estado ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String A192Control_Estado ;
   private String A189Control_Programa ;
   private String Gx_emsg ;
   private java.util.Date A187Control_FechaHora ;
   private String AV8body ;
   private String AV14lvc ;
   private String A190Control_Body ;
   private String A191Control_Lvc ;
   private String AV20Usuario ;
   private String AV12Host ;
   private String AV17URL ;
   private String A188Control_Usuario ;
   private com.genexus.internet.HttpClient AV13HttpClient ;
   private String[] aP0 ;
   private long[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem> AV10DatosSDT ;
   private GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem> GXt_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem4 ;
   private GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem> GXv_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem5[] ;
}

final  class wsinactivarusuario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P000S2", "INSERT INTO SEG_CONTROL_WEBSERVICES(Control_Id, Control_FechaHora, Control_IdUsuario, Control_Usuario, Control_Programa, Control_Body, Control_Lvc, Control_Estado, Control_CodUsuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_CONTROL_WEBSERVICES")
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

