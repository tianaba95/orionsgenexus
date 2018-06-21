/*
               File: PActualizaEstadoTRN
        Description: PActualiza Estado TRN
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:57.31
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactualizaestadotrn extends GXProcedure
{
   public pactualizaestadotrn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactualizaestadotrn.class ), "" );
   }

   public pactualizaestadotrn( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( )
   {
      pactualizaestadotrn.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      pactualizaestadotrn.this.aP0 = new long[] {0};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( long[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( long[] aP0 )
   {
      pactualizaestadotrn.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P000I2 */
      pr_default.execute(0, new Object[] {new Long(AV8Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactualizaestadotrn.this.AV8Tran_Id;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pactualizaestadotrn");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pactualizaestadotrn__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV8Tran_Id ;
   private long[] aP0 ;
   private IDataStoreProvider pr_default ;
}

final  class pactualizaestadotrn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P000I2", "UPDATE ALM_TRANSACCION SET Tran_Estado='P', Tran_FechaRegistro=(SYSDATE)  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

