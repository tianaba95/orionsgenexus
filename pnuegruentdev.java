/*
               File: PNueGruEntDev
        Description: Nuevo Grupo Entrada Devolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:11.29
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnuegruentdev extends GXProcedure
{
   public pnuegruentdev( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnuegruentdev.class ), "" );
   }

   public pnuegruentdev( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( )
   {
      pnuegruentdev.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      pnuegruentdev.this.aP0 = new long[] {0};
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
      pnuegruentdev.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'NUMEROGRUPO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'AGRUPAR' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'ACTULIZATRANSACCION' */
      S131 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'NUMEROGRUPO' Routine */
      /* Using cursor P00242 */
      pr_default.execute(0, new Object[] {new Long(AV8Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = P00242_A46Tran_Id[0] ;
         A667Tran_NumeroGrupo = P00242_A667Tran_NumeroGrupo[0] ;
         n667Tran_NumeroGrupo = P00242_n667Tran_NumeroGrupo[0] ;
         AV9Tran_NumeroGrupo = A667Tran_NumeroGrupo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV9Tran_NumeroGrupo = (short)(AV9Tran_NumeroGrupo+1) ;
   }

   public void S121( )
   {
      /* 'AGRUPAR' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P00243 */
      pr_default.execute(1, new Object[] {new Boolean(n658TDet_Agrupado), new Short(AV9Tran_NumeroGrupo), new Long(AV8Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      /* End optimized UPDATE. */
   }

   public void S131( )
   {
      /* 'ACTULIZATRANSACCION' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P00244 */
      pr_default.execute(2, new Object[] {new Boolean(n667Tran_NumeroGrupo), new Short(AV9Tran_NumeroGrupo), new Long(AV8Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnuegruentdev.this.AV8Tran_Id;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pnuegruentdev");
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
      P00242_A46Tran_Id = new long[1] ;
      P00242_A667Tran_NumeroGrupo = new short[1] ;
      P00242_n667Tran_NumeroGrupo = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pnuegruentdev__default(),
         new Object[] {
             new Object[] {
            P00242_A46Tran_Id, P00242_A667Tran_NumeroGrupo, P00242_n667Tran_NumeroGrupo
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A667Tran_NumeroGrupo ;
   private short AV9Tran_NumeroGrupo ;
   private short A658TDet_Agrupado ;
   private short Gx_err ;
   private long AV8Tran_Id ;
   private long A46Tran_Id ;
   private String scmdbuf ;
   private boolean returnInSub ;
   private boolean n667Tran_NumeroGrupo ;
   private boolean n658TDet_Agrupado ;
   private long[] aP0 ;
   private IDataStoreProvider pr_default ;
   private long[] P00242_A46Tran_Id ;
   private short[] P00242_A667Tran_NumeroGrupo ;
   private boolean[] P00242_n667Tran_NumeroGrupo ;
}

final  class pnuegruentdev__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00242", "SELECT Tran_Id, Tran_NumeroGrupo FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P00243", "UPDATE ALM_DETALLE_TRANSACCION SET TDet_Agrupado=?  WHERE (Tran_Id = ?) AND (TDet_Agrupado = 0)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new UpdateCursor("P00244", "UPDATE ALM_TRANSACCION SET Tran_NumeroGrupo=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
      }
   }

}

