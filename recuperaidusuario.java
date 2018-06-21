/*
               File: RecuperaIdUsuario
        Description: Recupera Id Usuario
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:57.48
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recuperaidusuario extends GXProcedure
{
   public recuperaidusuario( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuperaidusuario.class ), "" );
   }

   public recuperaidusuario( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( String aP0 )
   {
      recuperaidusuario.this.AV8Usuario = aP0;
      recuperaidusuario.this.aP1 = aP1;
      recuperaidusuario.this.aP1 = new long[] {0};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             long[] aP1 )
   {
      recuperaidusuario.this.AV8Usuario = aP0;
      recuperaidusuario.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Usua_Id = 0 ;
      /* Using cursor P000L2 */
      pr_default.execute(0, new Object[] {AV8Usuario});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A24Usua_Codigo = P000L2_A24Usua_Codigo[0] ;
         A23Usua_Id = P000L2_A23Usua_Id[0] ;
         AV9Usua_Id = A23Usua_Id ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = recuperaidusuario.this.AV9Usua_Id;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P000L2_A24Usua_Codigo = new String[] {""} ;
      P000L2_A23Usua_Id = new long[1] ;
      A24Usua_Codigo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.recuperaidusuario__default(),
         new Object[] {
             new Object[] {
            P000L2_A24Usua_Codigo, P000L2_A23Usua_Id
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV9Usua_Id ;
   private long A23Usua_Id ;
   private String scmdbuf ;
   private String AV8Usuario ;
   private String A24Usua_Codigo ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P000L2_A24Usua_Codigo ;
   private long[] P000L2_A23Usua_Id ;
}

final  class recuperaidusuario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000L2", "SELECT Usua_Codigo, Usua_Id FROM SEG_USUARIO WHERE Usua_Codigo = ? ORDER BY Usua_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
      }
   }

}

