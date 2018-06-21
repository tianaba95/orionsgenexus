/*
               File: RPT_REPORTEConversion
        Description: Conversion for table RPT_REPORTE
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 15, 2018 9:49:52.98
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rpt_reporteconversion extends GXProcedure
{
   public rpt_reporteconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rpt_reporteconversion.class ), "" );
   }

   public rpt_reporteconversion( int remoteHandle ,
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
      cmdBuffer = " ALTER TRIGGER AN$843RPT_REP_ID DISABLE ";
      ExecuteDirectSQL.execute(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      /* Using cursor RPT_REPORT2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A851RPT_REP_ESTADO = RPT_REPORT2_A851RPT_REP_ESTADO[0] ;
         A850RPT_REP_USUARIO_MODIFICA = RPT_REPORT2_A850RPT_REP_USUARIO_MODIFICA[0] ;
         A849RPT_REP_FECHA_MODIFICA = RPT_REPORT2_A849RPT_REP_FECHA_MODIFICA[0] ;
         n849RPT_REP_FECHA_MODIFICA = RPT_REPORT2_n849RPT_REP_FECHA_MODIFICA[0] ;
         A848RPT_REP_USUARIO_CREACION = RPT_REPORT2_A848RPT_REP_USUARIO_CREACION[0] ;
         A847RPT_REP_FECHA_CREACION = RPT_REPORT2_A847RPT_REP_FECHA_CREACION[0] ;
         A846RPT_REP_FORMATO = RPT_REPORT2_A846RPT_REP_FORMATO[0] ;
         A845RPT_REP_DESCRIPCION = RPT_REPORT2_A845RPT_REP_DESCRIPCION[0] ;
         A844RPT_REP_NOMBRE = RPT_REPORT2_A844RPT_REP_NOMBRE[0] ;
         A843RPT_REP_ID = RPT_REPORT2_A843RPT_REP_ID[0] ;
         /*
            INSERT RECORD ON TABLE GXA0065

         */
         AV2RPT_REP_ID = A843RPT_REP_ID ;
         AV3RPT_REP_NOMBRE = A844RPT_REP_NOMBRE ;
         nV3RPT_REP_NOMBRE = false ;
         AV4RPT_REP_DESCRIPCION = A845RPT_REP_DESCRIPCION ;
         nV4RPT_REP_DESCRIPCION = false ;
         AV5RPT_REP_FORMATO = A846RPT_REP_FORMATO ;
         nV5RPT_REP_FORMATO = false ;
         AV6RPT_REP_FECHA_CREACION = GXutil.resetTime( A847RPT_REP_FECHA_CREACION );
         nV6RPT_REP_FECHA_CREACION = false ;
         AV7RPT_REP_USUARIO_CREACION = A848RPT_REP_USUARIO_CREACION ;
         nV7RPT_REP_USUARIO_CREACION = false ;
         if ( RPT_REPORT2_n849RPT_REP_FECHA_MODIFICA[0] )
         {
            AV8RPT_REP_FECHA_MODIFICA = GXutil.resetTime( GXutil.nullDate() );
            nV8RPT_REP_FECHA_MODIFICA = false ;
            nV8RPT_REP_FECHA_MODIFICA = true ;
         }
         else
         {
            AV8RPT_REP_FECHA_MODIFICA = GXutil.resetTime( A849RPT_REP_FECHA_MODIFICA );
            nV8RPT_REP_FECHA_MODIFICA = false ;
         }
         AV9RPT_REP_USUARIO_MODIFICA = A850RPT_REP_USUARIO_MODIFICA ;
         nV9RPT_REP_USUARIO_MODIFICA = false ;
         AV10RPT_REP_ESTADO = A851RPT_REP_ESTADO ;
         nV10RPT_REP_ESTADO = false ;
         /* Using cursor RPT_REPORT3 */
         pr_default.execute(1, new Object[] {new Short(AV2RPT_REP_ID), new Boolean(nV3RPT_REP_NOMBRE), AV3RPT_REP_NOMBRE, new Boolean(nV4RPT_REP_DESCRIPCION), AV4RPT_REP_DESCRIPCION, new Boolean(nV5RPT_REP_FORMATO), AV5RPT_REP_FORMATO, new Boolean(nV6RPT_REP_FECHA_CREACION), AV6RPT_REP_FECHA_CREACION, new Boolean(nV7RPT_REP_USUARIO_CREACION), AV7RPT_REP_USUARIO_CREACION, new Boolean(nV8RPT_REP_FECHA_MODIFICA), AV8RPT_REP_FECHA_MODIFICA, new Boolean(nV9RPT_REP_USUARIO_MODIFICA), AV9RPT_REP_USUARIO_MODIFICA, new Boolean(nV10RPT_REP_ESTADO), AV10RPT_REP_ESTADO});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0065") ;
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cmdBuffer = " ALTER TRIGGER AN$843RPT_REP_ID ENABLE ";
      ExecuteDirectSQL.execute(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      cmdBuffer = "" ;
      scmdbuf = "" ;
      RPT_REPORT2_A851RPT_REP_ESTADO = new String[] {""} ;
      RPT_REPORT2_A850RPT_REP_USUARIO_MODIFICA = new String[] {""} ;
      RPT_REPORT2_A849RPT_REP_FECHA_MODIFICA = new java.util.Date[] {GXutil.nullDate()} ;
      RPT_REPORT2_n849RPT_REP_FECHA_MODIFICA = new boolean[] {false} ;
      RPT_REPORT2_A848RPT_REP_USUARIO_CREACION = new String[] {""} ;
      RPT_REPORT2_A847RPT_REP_FECHA_CREACION = new java.util.Date[] {GXutil.nullDate()} ;
      RPT_REPORT2_A846RPT_REP_FORMATO = new String[] {""} ;
      RPT_REPORT2_A845RPT_REP_DESCRIPCION = new String[] {""} ;
      RPT_REPORT2_A844RPT_REP_NOMBRE = new String[] {""} ;
      RPT_REPORT2_A843RPT_REP_ID = new short[1] ;
      A851RPT_REP_ESTADO = "" ;
      A850RPT_REP_USUARIO_MODIFICA = "" ;
      A849RPT_REP_FECHA_MODIFICA = GXutil.nullDate() ;
      A848RPT_REP_USUARIO_CREACION = "" ;
      A847RPT_REP_FECHA_CREACION = GXutil.nullDate() ;
      A846RPT_REP_FORMATO = "" ;
      A845RPT_REP_DESCRIPCION = "" ;
      A844RPT_REP_NOMBRE = "" ;
      AV3RPT_REP_NOMBRE = "" ;
      AV4RPT_REP_DESCRIPCION = "" ;
      AV5RPT_REP_FORMATO = "" ;
      AV6RPT_REP_FECHA_CREACION = GXutil.resetTime( GXutil.nullDate() );
      AV7RPT_REP_USUARIO_CREACION = "" ;
      AV8RPT_REP_FECHA_MODIFICA = GXutil.resetTime( GXutil.nullDate() );
      AV9RPT_REP_USUARIO_MODIFICA = "" ;
      AV10RPT_REP_ESTADO = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.rpt_reporteconversion__default(),
         new Object[] {
             new Object[] {
            RPT_REPORT2_A851RPT_REP_ESTADO, RPT_REPORT2_A850RPT_REP_USUARIO_MODIFICA, RPT_REPORT2_A849RPT_REP_FECHA_MODIFICA, RPT_REPORT2_n849RPT_REP_FECHA_MODIFICA, RPT_REPORT2_A848RPT_REP_USUARIO_CREACION, RPT_REPORT2_A847RPT_REP_FECHA_CREACION, RPT_REPORT2_A846RPT_REP_FORMATO, RPT_REPORT2_A845RPT_REP_DESCRIPCION, RPT_REPORT2_A844RPT_REP_NOMBRE, RPT_REPORT2_A843RPT_REP_ID
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A843RPT_REP_ID ;
   private short AV2RPT_REP_ID ;
   private short Gx_err ;
   private int GIGXA0065 ;
   private String cmdBuffer ;
   private String scmdbuf ;
   private String A851RPT_REP_ESTADO ;
   private String AV10RPT_REP_ESTADO ;
   private String Gx_emsg ;
   private java.util.Date AV6RPT_REP_FECHA_CREACION ;
   private java.util.Date AV8RPT_REP_FECHA_MODIFICA ;
   private java.util.Date A849RPT_REP_FECHA_MODIFICA ;
   private java.util.Date A847RPT_REP_FECHA_CREACION ;
   private boolean n849RPT_REP_FECHA_MODIFICA ;
   private boolean nV3RPT_REP_NOMBRE ;
   private boolean nV4RPT_REP_DESCRIPCION ;
   private boolean nV5RPT_REP_FORMATO ;
   private boolean nV6RPT_REP_FECHA_CREACION ;
   private boolean nV7RPT_REP_USUARIO_CREACION ;
   private boolean nV8RPT_REP_FECHA_MODIFICA ;
   private boolean nV9RPT_REP_USUARIO_MODIFICA ;
   private boolean nV10RPT_REP_ESTADO ;
   private String A850RPT_REP_USUARIO_MODIFICA ;
   private String A848RPT_REP_USUARIO_CREACION ;
   private String A846RPT_REP_FORMATO ;
   private String A845RPT_REP_DESCRIPCION ;
   private String A844RPT_REP_NOMBRE ;
   private String AV3RPT_REP_NOMBRE ;
   private String AV4RPT_REP_DESCRIPCION ;
   private String AV5RPT_REP_FORMATO ;
   private String AV7RPT_REP_USUARIO_CREACION ;
   private String AV9RPT_REP_USUARIO_MODIFICA ;
   private IDataStoreProvider pr_default ;
   private String[] RPT_REPORT2_A851RPT_REP_ESTADO ;
   private String[] RPT_REPORT2_A850RPT_REP_USUARIO_MODIFICA ;
   private java.util.Date[] RPT_REPORT2_A849RPT_REP_FECHA_MODIFICA ;
   private boolean[] RPT_REPORT2_n849RPT_REP_FECHA_MODIFICA ;
   private String[] RPT_REPORT2_A848RPT_REP_USUARIO_CREACION ;
   private java.util.Date[] RPT_REPORT2_A847RPT_REP_FECHA_CREACION ;
   private String[] RPT_REPORT2_A846RPT_REP_FORMATO ;
   private String[] RPT_REPORT2_A845RPT_REP_DESCRIPCION ;
   private String[] RPT_REPORT2_A844RPT_REP_NOMBRE ;
   private short[] RPT_REPORT2_A843RPT_REP_ID ;
}

final  class rpt_reporteconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("RPT_REPORT2", "SELECT RPT_REP_ESTADO, RPT_REP_USUARIO_MODIFICA, RPT_REP_FECHA_MODIFICA, RPT_REP_USUARIO_CREACION, RPT_REP_FECHA_CREACION, RPT_REP_FORMATO, RPT_REP_DESCRIPCION, RPT_REP_NOMBRE, RPT_REP_ID FROM RPT_REPORTE ORDER BY RPT_REP_ID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("RPT_REPORT3", "INSERT INTO GXA0065(RPT_REP_ID, RPT_REP_NOMBRE, RPT_REP_DESCRIPCION, RPT_REP_FORMATO, RPT_REP_FECHA_CREACION, RPT_REP_USUARIO_CREACION, RPT_REP_FECHA_MODIFICA, RPT_REP_USUARIO_MODIFICA, RPT_REP_ESTADO) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "GXA0065")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((short[]) buf[9])[0] = rslt.getShort(9) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 40);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 50);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 3);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 30);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[12], false);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 30);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 1);
               }
               return;
      }
   }

}

