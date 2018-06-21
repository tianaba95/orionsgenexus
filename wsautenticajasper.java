/*
               File: WSAutenticaJasper
        Description: WSAutentica Jasper
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 13:32:47.88
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wsautenticajasper extends GXProcedure
{
   public wsautenticajasper( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wsautenticajasper.class ), "" );
   }

   public wsautenticajasper( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = AV12Host ;
      GXv_char2[0] = AV17URL ;
      GXv_int3[0] = AV16Puerto ;
      GXv_char4[0] = AV23URLAutentica ;
      new com.orions2.parametrosreportes(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4) ;
      wsautenticajasper.this.AV12Host = GXv_char1[0] ;
      wsautenticajasper.this.AV17URL = GXv_char2[0] ;
      wsautenticajasper.this.AV16Puerto = GXv_int3[0] ;
      wsautenticajasper.this.AV23URLAutentica = GXv_char4[0] ;
      AV13HttpClient.setHost( AV12Host );
      AV13HttpClient.setPort( AV16Puerto );
      AV13HttpClient.setBaseURL( AV23URLAutentica );
      AV13HttpClient.execute("GET", "login?j_username=jasperadmin&j_password=jasperadmin");
      AV14Response = AV13HttpClient.getString() ;
      AV8body = "login?j_username=jasperadmin&j_password=jasperadmin" ;
      AV22httpstatus = (byte)(AV13HttpClient.getStatusCode()) ;
      GXv_char4[0] = "CTRWS" ;
      GXv_int5[0] = AV9cons_Numero ;
      new com.orions2.devuelveconsecutivo(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
      wsautenticajasper.this.AV9cons_Numero = GXv_int5[0] ;
      /*
         INSERT RECORD ON TABLE SEG_CONTROL_WEBSERVICES

      */
      A15Control_Id = AV9cons_Numero ;
      A193Control_IdUsuario = AV18Usua_Id ;
      A190Control_Body = AV8body ;
      A192Control_Estado = AV11Estado ;
      A187Control_FechaHora = GXutil.now( ) ;
      A191Control_Lvc = AV14Response ;
      A189Control_Programa = "AUTENTICA JASPER" ;
      A188Control_Usuario = AV19Usuario ;
      /* Using cursor P002U2 */
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
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "wsautenticajasper");
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
      AV12Host = "" ;
      GXv_char1 = new String [1] ;
      AV17URL = "" ;
      GXv_char2 = new String [1] ;
      GXv_int3 = new short [1] ;
      AV23URLAutentica = "" ;
      AV13HttpClient = new com.genexus.internet.HttpClient();
      AV14Response = "" ;
      AV8body = "" ;
      GXv_char4 = new String [1] ;
      GXv_int5 = new long [1] ;
      A190Control_Body = "" ;
      A192Control_Estado = "" ;
      AV11Estado = "" ;
      A187Control_FechaHora = GXutil.resetTime( GXutil.nullDate() );
      A191Control_Lvc = "" ;
      A189Control_Programa = "" ;
      A188Control_Usuario = "" ;
      AV19Usuario = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wsautenticajasper__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22httpstatus ;
   private short AV16Puerto ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int GX_INS23 ;
   private long AV9cons_Numero ;
   private long GXv_int5[] ;
   private long A15Control_Id ;
   private long A193Control_IdUsuario ;
   private long AV18Usua_Id ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String A192Control_Estado ;
   private String AV11Estado ;
   private String A189Control_Programa ;
   private String Gx_emsg ;
   private java.util.Date A187Control_FechaHora ;
   private String AV14Response ;
   private String AV8body ;
   private String A190Control_Body ;
   private String A191Control_Lvc ;
   private String AV12Host ;
   private String AV17URL ;
   private String AV23URLAutentica ;
   private String A188Control_Usuario ;
   private String AV19Usuario ;
   private com.genexus.internet.HttpClient AV13HttpClient ;
   private IDataStoreProvider pr_default ;
}

final  class wsautenticajasper__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P002U2", "INSERT INTO SEG_CONTROL_WEBSERVICES(Control_Id, Control_FechaHora, Control_IdUsuario, Control_Usuario, Control_Programa, Control_Body, Control_Lvc, Control_Estado, Control_CodUsuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_CONTROL_WEBSERVICES")
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

