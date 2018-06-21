/*
               File: ALM_DETALLE_TRANSACCIONLoadRedundancy
        Description: Load redundancy in table ALM_DETALLE_TRANSACCION
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: April 10, 2018 17:11:13.34
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class alm_detalle_transaccionloadredundancy extends GXProcedure
{
   public alm_detalle_transaccionloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_detalle_transaccionloadredundancy.class ), "" );
   }

   public alm_detalle_transaccionloadredundancy( int remoteHandle ,
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
      System.out.println( "Loading redundancy in table ALM_DETALLE_TRANSACCION ..." );
      /* Optimized UPDATE. */
      cmdBuffer = " LOCK TABLE ALM_DETALLE_TRANSACCION IN EXCLUSIVE MODE NOWAIT ";
      ExecuteDirectSQL.execute(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      /* Using cursor ALM_DETALL2 */
      pr_default.execute(0);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      /* End optimized UPDATE. */
      System.out.println( "" );
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_detalle_transaccionloadredundancy__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String cmdBuffer ;
   private IDataStoreProvider pr_default ;
}

final  class alm_detalle_transaccionloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("ALM_DETALL2", "UPDATE ALM_DETALLE_TRANSACCION SET TDet_ValorTotal=TDet_Cantidad * CAST(TDet_ValorUnitario AS NUMERIC(28,10)) ", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
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
      }
   }

}

