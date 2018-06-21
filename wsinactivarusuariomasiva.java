/*
               File: WSInactivarUsuarioMasiva
        Description: WSInactivar Usuario Masiva
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:11.84
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wsinactivarusuariomasiva extends GXProcedure
{
   public wsinactivarusuariomasiva( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wsinactivarusuariomasiva.class ), "" );
   }

   public wsinactivarusuariomasiva( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String[] aP0 )
   {
      wsinactivarusuariomasiva.this.AV17Usuario = aP0[0];
      this.aP0 = aP0;
      wsinactivarusuariomasiva.this.AV11Estado = aP1[0];
      this.aP1 = aP1;
      wsinactivarusuariomasiva.this.aP1 = new String[] {""};
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
      wsinactivarusuariomasiva.this.AV17Usuario = aP0[0];
      this.aP0 = aP0;
      wsinactivarusuariomasiva.this.AV11Estado = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Programa = "activacionMasiva" ;
      AV11Estado = "" ;
      GXv_char1[0] = AV18Host ;
      GXv_char2[0] = AV20URL ;
      GXv_int3[0] = AV19Puerto ;
      new com.orions2.parametrosservicios(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      wsinactivarusuariomasiva.this.AV18Host = GXv_char1[0] ;
      wsinactivarusuariomasiva.this.AV20URL = GXv_char2[0] ;
      wsinactivarusuariomasiva.this.AV19Puerto = GXv_int3[0] ;
      AV12HttpClient.setHost( AV18Host );
      AV12HttpClient.setPort( AV19Puerto );
      AV12HttpClient.setBaseURL( AV20URL );
      GXt_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem4 = AV10DatosSDT ;
      GXv_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem5[0] = GXt_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem4 ;
      new com.orions2.dpinactivausuariomasiva(remoteHandle, context).execute( GXv_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem5) ;
      GXt_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem4 = GXv_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem5[0] ;
      AV10DatosSDT = GXt_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem4 ;
      AV8body = AV10DatosSDT.toJSonString(false) ;
      AV12HttpClient.addHeader("Content-type", "application/json");
      AV12HttpClient.addString(AV8body);
      AV12HttpClient.execute("POST", AV14Programa);
      AV13lvc = AV12HttpClient.getString() ;
      if ( AV12HttpClient.getStatusCode() == 201 )
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
      wsinactivarusuariomasiva.this.AV9cons_Numero = GXv_int6[0] ;
      /*
         INSERT RECORD ON TABLE SEG_CONTROL_WEBSERVICES

      */
      A15Control_Id = AV9cons_Numero ;
      A193Control_IdUsuario = 999999999999L ;
      A190Control_Body = AV8body ;
      A192Control_Estado = AV11Estado ;
      A187Control_FechaHora = GXutil.now( ) ;
      A191Control_Lvc = AV13lvc ;
      A189Control_Programa = AV14Programa ;
      A188Control_Usuario = AV17Usuario ;
      /* Using cursor P00282 */
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
      this.aP0[0] = wsinactivarusuariomasiva.this.AV17Usuario;
      this.aP1[0] = wsinactivarusuariomasiva.this.AV11Estado;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "wsinactivarusuariomasiva");
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
      AV18Host = "" ;
      GXv_char1 = new String [1] ;
      AV20URL = "" ;
      GXv_int3 = new short [1] ;
      AV12HttpClient = new com.genexus.internet.HttpClient();
      AV10DatosSDT = new GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>(com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem.class, "SDTInactivarUsuarios.SDTInactivarUsuariosItem", "ACBSENA", remoteHandle);
      GXt_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem4 = new GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem>(com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem.class, "SDTInactivarUsuarios.SDTInactivarUsuariosItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem5 = new GXBaseCollection [1] ;
      AV8body = "" ;
      AV13lvc = "" ;
      GXv_char2 = new String [1] ;
      GXv_int6 = new long [1] ;
      A190Control_Body = "" ;
      A192Control_Estado = "" ;
      A187Control_FechaHora = GXutil.resetTime( GXutil.nullDate() );
      A191Control_Lvc = "" ;
      A189Control_Programa = "" ;
      A188Control_Usuario = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wsinactivarusuariomasiva__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV19Puerto ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int GX_INS23 ;
   private long AV9cons_Numero ;
   private long GXv_int6[] ;
   private long A15Control_Id ;
   private long A193Control_IdUsuario ;
   private String AV11Estado ;
   private String AV14Programa ;
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
   private String AV17Usuario ;
   private String AV18Host ;
   private String AV20URL ;
   private String A188Control_Usuario ;
   private com.genexus.internet.HttpClient AV12HttpClient ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem> AV10DatosSDT ;
   private GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem> GXt_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem4 ;
   private GXBaseCollection<com.orions2.SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem> GXv_objcol_SdtSDTInactivarUsuarios_SDTInactivarUsuariosItem5[] ;
}

final  class wsinactivarusuariomasiva__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00282", "INSERT INTO SEG_CONTROL_WEBSERVICES(Control_Id, Control_FechaHora, Control_IdUsuario, Control_Usuario, Control_Programa, Control_Body, Control_Lvc, Control_Estado, Control_CodUsuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_CONTROL_WEBSERVICES")
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

