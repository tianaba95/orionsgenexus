/*
               File: Cons_Tran_Pla
        Description: Retorno Consecutivo Tran Pla
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:56.96
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cons_tran_pla extends GXProcedure
{
   public cons_tran_pla( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cons_tran_pla.class ), "" );
   }

   public cons_tran_pla( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String[] aP0 ,
                             long[] aP1 )
   {
      cons_tran_pla.this.AV16TipoConsecutivo = aP0[0];
      this.aP0 = aP0;
      cons_tran_pla.this.AV13pCent_Id = aP1[0];
      this.aP1 = aP1;
      cons_tran_pla.this.aP2 = aP2;
      cons_tran_pla.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             String[] aP2 )
   {
      cons_tran_pla.this.AV16TipoConsecutivo = aP0[0];
      this.aP0 = aP0;
      cons_tran_pla.this.AV13pCent_Id = aP1[0];
      this.aP1 = aP1;
      cons_tran_pla.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'INICIAPROCESO' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIAPROCESO' Routine */
      if ( GXutil.strcmp(AV16TipoConsecutivo, "PLACA") == 0 )
      {
         /* Execute user subroutine: 'CONSECUTIVOPLACA' */
         S121 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV16TipoConsecutivo, "TRANS") == 0 )
      {
         /* Execute user subroutine: 'CONSECUTIVOTRANSACCION' */
         S131 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'CONSECUTIVOPLACA' Routine */
      /* Using cursor P000F2 */
      pr_default.execute(0, new Object[] {new Long(AV13pCent_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1Cent_Id = P000F2_A1Cent_Id[0] ;
         A3Cent_Codigo = P000F2_A3Cent_Codigo[0] ;
         A526Cent_ConsePlaca = P000F2_A526Cent_ConsePlaca[0] ;
         AV12pCent_Codigo = A3Cent_Codigo ;
         AV9pCent_ConsePlaca = (long)(A526Cent_ConsePlaca+1) ;
         A526Cent_ConsePlaca = (long)(A526Cent_ConsePlaca+1) ;
         /* Using cursor P000F3 */
         pr_default.execute(1, new Object[] {new Long(A526Cent_ConsePlaca), new Long(A1Cent_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_CENTROCOSTO") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV8NumeroPlaca = GXutil.trim( AV12pCent_Codigo) + GXutil.trim( GXutil.str( AV9pCent_ConsePlaca, 18, 0)) ;
      AV10Consecutivo = AV8NumeroPlaca ;
   }

   public void S131( )
   {
      /* 'CONSECUTIVOTRANSACCION' Routine */
      /* Using cursor P000F4 */
      pr_default.execute(2, new Object[] {new Long(AV13pCent_Id)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1Cent_Id = P000F4_A1Cent_Id[0] ;
         A2Regi_Id = P000F4_A2Regi_Id[0] ;
         AV15Regi_Id = A2Regi_Id ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P000F5 */
      pr_default.execute(3, new Object[] {new Long(AV15Regi_Id)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2Regi_Id = P000F5_A2Regi_Id[0] ;
         A698Regi_Conse_Tran = P000F5_A698Regi_Conse_Tran[0] ;
         AV14Regi_Conse_Tran = (int)(A698Regi_Conse_Tran+1) ;
         A698Regi_Conse_Tran = (int)(A698Regi_Conse_Tran+1) ;
         /* Using cursor P000F6 */
         pr_default.execute(4, new Object[] {new Integer(A698Regi_Conse_Tran), new Long(A2Regi_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GEN_REGIONAL") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV10Consecutivo = GXutil.trim( GXutil.str( AV14Regi_Conse_Tran, 6, 0)) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = cons_tran_pla.this.AV16TipoConsecutivo;
      this.aP1[0] = cons_tran_pla.this.AV13pCent_Id;
      this.aP2[0] = cons_tran_pla.this.AV10Consecutivo;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "cons_tran_pla");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Consecutivo = "" ;
      scmdbuf = "" ;
      P000F2_A1Cent_Id = new long[1] ;
      P000F2_A3Cent_Codigo = new String[] {""} ;
      P000F2_A526Cent_ConsePlaca = new long[1] ;
      A3Cent_Codigo = "" ;
      AV12pCent_Codigo = "" ;
      AV8NumeroPlaca = "" ;
      P000F4_A1Cent_Id = new long[1] ;
      P000F4_A2Regi_Id = new long[1] ;
      P000F5_A2Regi_Id = new long[1] ;
      P000F5_A698Regi_Conse_Tran = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.cons_tran_pla__default(),
         new Object[] {
             new Object[] {
            P000F2_A1Cent_Id, P000F2_A3Cent_Codigo, P000F2_A526Cent_ConsePlaca
            }
            , new Object[] {
            }
            , new Object[] {
            P000F4_A1Cent_Id, P000F4_A2Regi_Id
            }
            , new Object[] {
            P000F5_A2Regi_Id, P000F5_A698Regi_Conse_Tran
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A698Regi_Conse_Tran ;
   private int AV14Regi_Conse_Tran ;
   private long AV13pCent_Id ;
   private long A1Cent_Id ;
   private long A526Cent_ConsePlaca ;
   private long AV9pCent_ConsePlaca ;
   private long A2Regi_Id ;
   private long AV15Regi_Id ;
   private String AV16TipoConsecutivo ;
   private String scmdbuf ;
   private boolean returnInSub ;
   private String AV10Consecutivo ;
   private String A3Cent_Codigo ;
   private String AV12pCent_Codigo ;
   private String AV8NumeroPlaca ;
   private String[] aP0 ;
   private long[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P000F2_A1Cent_Id ;
   private String[] P000F2_A3Cent_Codigo ;
   private long[] P000F2_A526Cent_ConsePlaca ;
   private long[] P000F4_A1Cent_Id ;
   private long[] P000F4_A2Regi_Id ;
   private long[] P000F5_A2Regi_Id ;
   private int[] P000F5_A698Regi_Conse_Tran ;
}

final  class cons_tran_pla__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000F2", "SELECT Cent_Id, Cent_Codigo, Cent_ConsePlaca FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ORDER BY Cent_Id  FOR UPDATE OF Cent_ConsePlaca NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P000F3", "UPDATE GEN_CENTROCOSTO SET Cent_ConsePlaca=?  WHERE Cent_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "GEN_CENTROCOSTO")
         ,new ForEachCursor("P000F4", "SELECT Cent_Id, Regi_Id FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ORDER BY Cent_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P000F5", "SELECT Regi_Id, Regi_Conse_Tran FROM GEN_REGIONAL WHERE Regi_Id = ? ORDER BY Regi_Id  FOR UPDATE OF Regi_Conse_Tran NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P000F6", "UPDATE GEN_REGIONAL SET Regi_Conse_Tran=?  WHERE Regi_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "GEN_REGIONAL")
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

