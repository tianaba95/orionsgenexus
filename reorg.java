/*
               File: reorg
        Description: Table Manager
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: May 30, 2018 12:5:29.46
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.util.*;

public final  class reorg extends GXProcedure
{
   public reorg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reorg.class ), "" );
   }

   public reorg( int remoteHandle ,
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
      if ( previousCheck() )
      {
         executeReorganization( ) ;
      }
   }

   private void FirstActions( )
   {
      /* Load data into tables. */
   }

   public void ReorganizeRPT_REPORTE( ) throws SQLException
   {
      String cmdBufferCreate = "" ;
      String cmdBuffer = "" ;
      /* Indices for table RPT_REPORTE */
      cmdBuffer = " ALTER TABLE RPT_REPORTE ADD GX_AUX VARCHAR2(50) DEFAULT ' '  ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " ALTER TABLE RPT_REPORTE MODIFY GX_AUX DEFAULT NULL ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " UPDATE RPT_REPORTE SET GX_AUX = SUBSTR(RPT_REP_DESCRIPCION, 1, 50) ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " ALTER TABLE RPT_REPORTE DROP COLUMN RPT_REP_DESCRIPCION ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " ALTER TABLE RPT_REPORTE RENAME COLUMN GX_AUX to RPT_REP_DESCRIPCION ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " ALTER TABLE RPT_REPORTE ADD GX_AUX VARCHAR2(50) DEFAULT ' '  ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " ALTER TABLE RPT_REPORTE MODIFY GX_AUX DEFAULT NULL ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " UPDATE RPT_REPORTE SET GX_AUX = SUBSTR(RPT_REP_NOMBRE, 1, 50) ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " ALTER TABLE RPT_REPORTE DROP COLUMN RPT_REP_NOMBRE ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " ALTER TABLE RPT_REPORTE RENAME COLUMN GX_AUX to RPT_REP_NOMBRE ";
      ExecuteDirectSQL.executeWithThrow(context, remoteHandle, "DEFAULT", cmdBuffer) ;
   }

   private void tablesCount( )
   {
      if ( ! GXReorganization.isResumeMode( ) )
      {
         /* Using cursor P00012 */
         pr_default.execute(0);
         RPT_REPORTECount = P00012_ARPT_REPORTECount[0] ;
         pr_default.close(0);
         GXReorganization.printRecordCount ( "RPT_REPORTE" ,  RPT_REPORTECount );
      }
   }

   private boolean previousCheck( )
   {
      if ( ! GXReorganization.isResumeMode( ) )
      {
         if ( GXutil.dbmsVersion( context, remoteHandle, "DEFAULT") < 1 )
         {
            GXReorganization.setCheckError ( localUtil.getMessages().getMessage("GXM_bad_DBMS_version", new Object[] {"1"}) ) ;
            return false ;
         }
      }
      if ( ! GXReorganization.mustRunCheck( ) )
      {
         return true ;
      }
      sSchemaVar = context.getUserId( "Server", remoteHandle, pr_default) ;
      return true ;
   }

   private boolean ColumnExist( String sTableName ,
                                String sMySchemaName ,
                                String sMyColumnName )
   {
      boolean result ;
      result = false ;
      /* Using cursor P00023 */
      pr_default.execute(1, new Object[] {sTableName, sMySchemaName, sMyColumnName});
      while ( (pr_default.getStatus(1) != 101) )
      {
         tablename = P00023_Atablename[0] ;
         ntablename = P00023_ntablename[0] ;
         schemaname = P00023_Aschemaname[0] ;
         nschemaname = P00023_nschemaname[0] ;
         columnname = P00023_Acolumnname[0] ;
         ncolumnname = P00023_ncolumnname[0] ;
         result = true ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      return result ;
   }

   private void executeOnlyTablesReorganization( )
   {
      callSubmit( "ReorganizeRPT_REPORTE" ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"RPT_REPORTE",""}) ,  1 , new Object[]{ });
   }

   private void executeOnlyRisReorganization( )
   {
   }

   private void executeTablesReorganization( )
   {
      executeOnlyTablesReorganization( ) ;
      executeOnlyRisReorganization( ) ;
      ReorgSubmitThreadPool.startProcess();
   }

   private void setPrecedence( )
   {
      setPrecedencetables( ) ;
      setPrecedenceris( ) ;
   }

   private void setPrecedencetables( )
   {
      GXReorganization.addMsg( 1 ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"RPT_REPORTE",""}) );
      ReorgSubmitThreadPool.addBlock( "ReorganizeRPT_REPORTE" );
   }

   private void setPrecedenceris( )
   {
   }

   private void executeReorganization( )
   {
      if ( ErrCode == 0 )
      {
         tablesCount( ) ;
         if ( ! GXReorganization.getRecordCount( ) )
         {
            FirstActions( ) ;
            setPrecedence( ) ;
            executeTablesReorganization( ) ;
         }
      }
   }

   public void UtilsCleanup( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void submitReorg( int submitId ,
                            Object [] submitParms ) throws SQLException
   {
      UserInformation submitUI = Application.getConnectionManager().createUserInformation(Namespace.getNamespace(context.getNAME_SPACE()));
      switch ( submitId )
      {
            case 1 :
               GXReorganization.replaceMsg( 1 ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"RPT_REPORTE",""})+" STARTED" );
               ReorganizeRPT_REPORTE( ) ;
               GXReorganization.replaceMsg( 1 ,  localUtil.getMessages().getMessage("GXM_fileupdate", new Object[] {"RPT_REPORTE",""})+" ENDED" );
               try { submitUI.disconnect(); } catch(Exception submitExc) { ; }
               break;
      }
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P00012_ARPT_REPORTECount = new int[1] ;
      sSchemaVar = "" ;
      sTableName = "" ;
      sMySchemaName = "" ;
      sMyColumnName = "" ;
      tablename = "" ;
      ntablename = false ;
      schemaname = "" ;
      nschemaname = false ;
      columnname = "" ;
      ncolumnname = false ;
      P00023_Atablename = new String[] {""} ;
      P00023_ntablename = new boolean[] {false} ;
      P00023_Aschemaname = new String[] {""} ;
      P00023_nschemaname = new boolean[] {false} ;
      P00023_Acolumnname = new String[] {""} ;
      P00023_ncolumnname = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.reorg__default(),
         new Object[] {
             new Object[] {
            P00012_ARPT_REPORTECount
            }
            , new Object[] {
            P00023_Atablename, P00023_Aschemaname, P00023_Acolumnname
            }
         }
      );
      /* GeneXus formulas. */
   }

   protected short ErrCode ;
   protected int RPT_REPORTECount ;
   protected String scmdbuf ;
   protected String sSchemaVar ;
   protected String sTableName ;
   protected String sMySchemaName ;
   protected String sMyColumnName ;
   protected boolean ntablename ;
   protected boolean nschemaname ;
   protected boolean ncolumnname ;
   protected String tablename ;
   protected String schemaname ;
   protected String columnname ;
   protected IDataStoreProvider pr_default ;
   protected int[] P00012_ARPT_REPORTECount ;
   protected String[] P00023_Atablename ;
   protected boolean[] P00023_ntablename ;
   protected String[] P00023_Aschemaname ;
   protected boolean[] P00023_nschemaname ;
   protected String[] P00023_Acolumnname ;
   protected boolean[] P00023_ncolumnname ;
}

final  class reorg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00012", "SELECT COUNT(*) FROM RPT_REPORTE ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00023", "SELECT TABLE_NAME, USER, COLUMN_NAME FROM USER_TAB_COLUMNS WHERE (UPPER(TABLE_NAME) = UPPER(?)) AND (UPPER(USER) = UPPER(?)) AND (UPPER(COLUMN_NAME) = UPPER(?)) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
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
               stmt.setString(1, (String)parms[0], 255);
               stmt.setString(2, (String)parms[1], 255);
               stmt.setString(3, (String)parms[2], 255);
               return;
      }
   }

}

