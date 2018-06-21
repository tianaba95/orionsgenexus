/*
               File: BorrarCargue
        Description: Borrar Cargue
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:7.54
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class borrarcargue extends GXProcedure
{
   public borrarcargue( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( borrarcargue.class ), "" );
   }

   public borrarcargue( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( long aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( long aP0 )
   {
      borrarcargue.this.AV8Tran_Id = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P001W2 */
      pr_default.execute(0, new Object[] {new Long(AV8Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_ENTRADA") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P001W3 */
      pr_default.execute(1, new Object[] {new Long(AV8Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("MAS_CARGUE_ATRIBUTOS") ;
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "borrarcargue");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.borrarcargue__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV8Tran_Id ;
   private IDataStoreProvider pr_default ;
}

final  class borrarcargue__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P001W2", "DELETE FROM MAS_CARGUE_ENTRADA  WHERE NROTRANSACCION = ?", GX_NOMASK + GX_MASKLOOPLOCK, "MAS_CARGUE_ENTRADA")
         ,new UpdateCursor("P001W3", "DELETE FROM MAS_CARGUE_ATRIBUTOS  WHERE NUMEROTRN = ?", GX_NOMASK + GX_MASKLOOPLOCK, "MAS_CARGUE_ATRIBUTOS")
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
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

