/*
               File: BuscaTranEntrada
        Description: Busca Tran Entrada
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:15.24
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class buscatranentrada extends GXProcedure
{
   public buscatranentrada( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( buscatranentrada.class ), "" );
   }

   public buscatranentrada( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( String[] aP0 ,
                           long[] aP1 )
   {
      buscatranentrada.this.AV8Placa = aP0[0];
      this.aP0 = aP0;
      buscatranentrada.this.AV17Tran_IdEntrada = aP1[0];
      this.aP1 = aP1;
      buscatranentrada.this.AV9TDet_Consecutivo = aP2[0];
      this.aP2 = aP2;
      buscatranentrada.this.aP2 = new long[] {0};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        long[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             long[] aP2 )
   {
      buscatranentrada.this.AV8Placa = aP0[0];
      this.aP0 = aP0;
      buscatranentrada.this.AV17Tran_IdEntrada = aP1[0];
      this.aP1 = aP1;
      buscatranentrada.this.AV9TDet_Consecutivo = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Tran_IdEntrada = 0 ;
      /* Using cursor P002R2 */
      pr_default.execute(0, new Object[] {AV8Placa});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A490TDet_PlacaNumero = P002R2_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P002R2_n490TDet_PlacaNumero[0] ;
         A46Tran_Id = P002R2_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P002R2_A69TDet_Consecutivo[0] ;
         AV10Tran_Id = A46Tran_Id ;
         AV9TDet_Consecutivo = A69TDet_Consecutivo ;
         /* Execute user subroutine: 'VALIDA TRANSACCION' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(AV11Tran_IndE_S, "E") == 0 )
         {
            AV17Tran_IdEntrada = AV10Tran_Id ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'VALIDA TRANSACCION' Routine */
      /* Using cursor P002R3 */
      pr_default.execute(1, new Object[] {new Long(AV10Tran_Id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A46Tran_Id = P002R3_A46Tran_Id[0] ;
         A481Tran_IndE_S = P002R3_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = P002R3_n481Tran_IndE_S[0] ;
         AV11Tran_IndE_S = A481Tran_IndE_S ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = buscatranentrada.this.AV8Placa;
      this.aP1[0] = buscatranentrada.this.AV17Tran_IdEntrada;
      this.aP2[0] = buscatranentrada.this.AV9TDet_Consecutivo;
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
      P002R2_A490TDet_PlacaNumero = new String[] {""} ;
      P002R2_n490TDet_PlacaNumero = new boolean[] {false} ;
      P002R2_A46Tran_Id = new long[1] ;
      P002R2_A69TDet_Consecutivo = new long[1] ;
      A490TDet_PlacaNumero = "" ;
      AV11Tran_IndE_S = "" ;
      P002R3_A46Tran_Id = new long[1] ;
      P002R3_A481Tran_IndE_S = new String[] {""} ;
      P002R3_n481Tran_IndE_S = new boolean[] {false} ;
      A481Tran_IndE_S = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.buscatranentrada__default(),
         new Object[] {
             new Object[] {
            P002R2_A490TDet_PlacaNumero, P002R2_n490TDet_PlacaNumero, P002R2_A46Tran_Id, P002R2_A69TDet_Consecutivo
            }
            , new Object[] {
            P002R3_A46Tran_Id, P002R3_A481Tran_IndE_S, P002R3_n481Tran_IndE_S
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV17Tran_IdEntrada ;
   private long AV9TDet_Consecutivo ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long AV10Tran_Id ;
   private String scmdbuf ;
   private boolean n490TDet_PlacaNumero ;
   private boolean returnInSub ;
   private boolean n481Tran_IndE_S ;
   private String AV8Placa ;
   private String A490TDet_PlacaNumero ;
   private String AV11Tran_IndE_S ;
   private String A481Tran_IndE_S ;
   private String[] aP0 ;
   private long[] aP1 ;
   private long[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P002R2_A490TDet_PlacaNumero ;
   private boolean[] P002R2_n490TDet_PlacaNumero ;
   private long[] P002R2_A46Tran_Id ;
   private long[] P002R2_A69TDet_Consecutivo ;
   private long[] P002R3_A46Tran_Id ;
   private String[] P002R3_A481Tran_IndE_S ;
   private boolean[] P002R3_n481Tran_IndE_S ;
}

final  class buscatranentrada__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002R2", "SELECT TDet_PlacaNumero, Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE TDet_PlacaNumero = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002R3", "SELECT Tran_Id, Tran_IndE_S FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

