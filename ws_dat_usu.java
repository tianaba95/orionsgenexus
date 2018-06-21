/*
               File: WS_DAT_USU
        Description: WS DATOS USUARIO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:59.21
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ws_dat_usu extends GXProcedure
{
   public ws_dat_usu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ws_dat_usu.class ), "" );
   }

   public ws_dat_usu( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( com.orions2.SdtSDTEditarRol[] aP0 ,
                             long[] aP1 )
   {
      ws_dat_usu.this.AV16SDTEditarRol = aP0[0];
      this.aP0 = aP0;
      ws_dat_usu.this.AV18Usua_Id = aP1[0];
      this.aP1 = aP1;
      ws_dat_usu.this.AV19Usuario = aP2[0];
      this.aP2 = aP2;
      ws_dat_usu.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( com.orions2.SdtSDTEditarRol[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( com.orions2.SdtSDTEditarRol[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      ws_dat_usu.this.AV16SDTEditarRol = aP0[0];
      this.aP0 = aP0;
      ws_dat_usu.this.AV18Usua_Id = aP1[0];
      this.aP1 = aP1;
      ws_dat_usu.this.AV19Usuario = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Usuario = AV20WebSession.getValue("Usuario") ;
      AV18Usua_Id = GXutil.lval( AV20WebSession.getValue("UsuarioId")) ;
      /* Execute user subroutine: 'CARGARPARAMETROS' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LLAMARSERVICIOROL' */
      S121 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CARGARPARAMETROS' Routine */
      GXv_char1[0] = AV11Host ;
      GXv_char2[0] = AV17URL ;
      GXv_int3[0] = AV15Puerto ;
      new com.orions2.parametrosservicios(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      ws_dat_usu.this.AV11Host = GXv_char1[0] ;
      ws_dat_usu.this.AV17URL = GXv_char2[0] ;
      ws_dat_usu.this.AV15Puerto = GXv_int3[0] ;
      AV12HttpClient.setHost( AV11Host );
      AV12HttpClient.setPort( AV15Puerto );
      AV12HttpClient.setBaseURL( AV17URL );
   }

   public void S121( )
   {
      /* 'LLAMARSERVICIOROL' Routine */
      AV8body = AV16SDTEditarRol.toJSonString(false) ;
      AV14Programa = "editarRolesUsuario" ;
      AV12HttpClient.addHeader("Content-type", "application/json;charset=UTF-8");
      AV12HttpClient.addString(AV8body);
      AV12HttpClient.execute("POST", AV14Programa);
      AV13lvc = AV12HttpClient.getString() ;
      if ( AV12HttpClient.getStatusCode() == 201 )
      {
         httpContext.GX_msglist.addItem("Los Datos Fueron Guardados");
         AV10Estado = "K" ;
      }
      else
      {
         httpContext.GX_msglist.addItem("Ha ocurrido un error en el Web Services");
         AV10Estado = "E" ;
      }
      /* Execute user subroutine: 'AUDITORIA' */
      S131 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'AUDITORIA' Routine */
      GXv_char2[0] = "CTRWS" ;
      GXv_int4[0] = AV9cons_Numero ;
      new com.orions2.devuelveconsecutivo(remoteHandle, context).execute( GXv_char2, GXv_int4) ;
      ws_dat_usu.this.AV9cons_Numero = GXv_int4[0] ;
      /*
         INSERT RECORD ON TABLE SEG_CONTROL_WEBSERVICES

      */
      A15Control_Id = AV9cons_Numero ;
      A193Control_IdUsuario = AV18Usua_Id ;
      A190Control_Body = AV8body ;
      A192Control_Estado = AV10Estado ;
      A187Control_FechaHora = GXutil.now( ) ;
      A191Control_Lvc = AV13lvc ;
      A189Control_Programa = AV14Programa ;
      A188Control_Usuario = AV19Usuario ;
      /* Using cursor P00142 */
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
   }

   protected void cleanup( )
   {
      this.aP0[0] = ws_dat_usu.this.AV16SDTEditarRol;
      this.aP1[0] = ws_dat_usu.this.AV18Usua_Id;
      this.aP2[0] = ws_dat_usu.this.AV19Usuario;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "ws_dat_usu");
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
      AV20WebSession = httpContext.getWebSession();
      AV11Host = "" ;
      GXv_char1 = new String [1] ;
      AV17URL = "" ;
      GXv_int3 = new short [1] ;
      AV12HttpClient = new com.genexus.internet.HttpClient();
      AV8body = "" ;
      AV14Programa = "" ;
      AV13lvc = "" ;
      AV10Estado = "" ;
      GXv_char2 = new String [1] ;
      GXv_int4 = new long [1] ;
      A190Control_Body = "" ;
      A192Control_Estado = "" ;
      A187Control_FechaHora = GXutil.resetTime( GXutil.nullDate() );
      A191Control_Lvc = "" ;
      A189Control_Programa = "" ;
      A188Control_Usuario = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.ws_dat_usu__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15Puerto ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int GX_INS23 ;
   private long AV18Usua_Id ;
   private long AV9cons_Numero ;
   private long GXv_int4[] ;
   private long A15Control_Id ;
   private long A193Control_IdUsuario ;
   private String GXv_char1[] ;
   private String AV14Programa ;
   private String AV10Estado ;
   private String GXv_char2[] ;
   private String A192Control_Estado ;
   private String A189Control_Programa ;
   private String Gx_emsg ;
   private java.util.Date A187Control_FechaHora ;
   private boolean returnInSub ;
   private String AV8body ;
   private String AV13lvc ;
   private String A190Control_Body ;
   private String A191Control_Lvc ;
   private String AV19Usuario ;
   private String AV11Host ;
   private String AV17URL ;
   private String A188Control_Usuario ;
   private com.genexus.internet.HttpClient AV12HttpClient ;
   private com.genexus.webpanels.WebSession AV20WebSession ;
   private com.orions2.SdtSDTEditarRol[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private com.orions2.SdtSDTEditarRol AV16SDTEditarRol ;
}

final  class ws_dat_usu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00142", "INSERT INTO SEG_CONTROL_WEBSERVICES(Control_Id, Control_FechaHora, Control_IdUsuario, Control_Usuario, Control_Programa, Control_Body, Control_Lvc, Control_Estado, Control_CodUsuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_CONTROL_WEBSERVICES")
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

