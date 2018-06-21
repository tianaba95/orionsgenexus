/*
               File: BuscaAtributos
        Description: Busca Atributos
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:0.46
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class buscaatributos extends GXProcedure
{
   public buscaatributos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( buscaatributos.class ), "" );
   }

   public buscaatributos( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          long[] aP5 )
   {
      buscaatributos.this.AV8Placa = aP0[0];
      this.aP0 = aP0;
      buscaatributos.this.AV13Marca = aP1[0];
      this.aP1 = aP1;
      buscaatributos.this.AV14Modelo = aP2[0];
      this.aP2 = aP2;
      buscaatributos.this.AV16Serial = aP3[0];
      this.aP3 = aP3;
      buscaatributos.this.AV15Observaciones = aP4[0];
      this.aP4 = aP4;
      buscaatributos.this.AV17Tran_IdEntrada = aP5[0];
      this.aP5 = aP5;
      buscaatributos.this.AV18Nro_Linea = aP6[0];
      this.aP6 = aP6;
      buscaatributos.this.aP6 = new int[] {0};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        long[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             long[] aP5 ,
                             int[] aP6 )
   {
      buscaatributos.this.AV8Placa = aP0[0];
      this.aP0 = aP0;
      buscaatributos.this.AV13Marca = aP1[0];
      this.aP1 = aP1;
      buscaatributos.this.AV14Modelo = aP2[0];
      this.aP2 = aP2;
      buscaatributos.this.AV16Serial = aP3[0];
      this.aP3 = aP3;
      buscaatributos.this.AV15Observaciones = aP4[0];
      this.aP4 = aP4;
      buscaatributos.this.AV17Tran_IdEntrada = aP5[0];
      this.aP5 = aP5;
      buscaatributos.this.AV18Nro_Linea = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Tran_IdEntrada = 0 ;
      /* Using cursor P00162 */
      pr_default.execute(0, new Object[] {AV8Placa});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A490TDet_PlacaNumero = P00162_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P00162_n490TDet_PlacaNumero[0] ;
         A46Tran_Id = P00162_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P00162_A69TDet_Consecutivo[0] ;
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
            AV18Nro_Linea = (int)(AV9TDet_Consecutivo) ;
            /* Execute user subroutine: 'ATRIBUTOS' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'VALIDA TRANSACCION' Routine */
      /* Using cursor P00163 */
      pr_default.execute(1, new Object[] {new Long(AV10Tran_Id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A416Tran_Observaciones = P00163_A416Tran_Observaciones[0] ;
         n416Tran_Observaciones = P00163_n416Tran_Observaciones[0] ;
         A46Tran_Id = P00163_A46Tran_Id[0] ;
         A481Tran_IndE_S = P00163_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = P00163_n481Tran_IndE_S[0] ;
         AV12Tran_Observaciones = A416Tran_Observaciones ;
         AV11Tran_IndE_S = A481Tran_IndE_S ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'ATRIBUTOS' Routine */
      AV13Marca = "" ;
      /* Using cursor P00164 */
      pr_default.execute(2, new Object[] {new Long(AV10Tran_Id), new Long(AV9TDet_Consecutivo)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A70TDet_ListId = P00164_A70TDet_ListId[0] ;
         A69TDet_Consecutivo = P00164_A69TDet_Consecutivo[0] ;
         A46Tran_Id = P00164_A46Tran_Id[0] ;
         A494TDet_ValorAtributo = P00164_A494TDet_ValorAtributo[0] ;
         AV13Marca = A494TDet_ValorAtributo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      AV16Serial = "" ;
      /* Using cursor P00165 */
      pr_default.execute(3, new Object[] {new Long(AV10Tran_Id), new Long(AV9TDet_Consecutivo)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A70TDet_ListId = P00165_A70TDet_ListId[0] ;
         A69TDet_Consecutivo = P00165_A69TDet_Consecutivo[0] ;
         A46Tran_Id = P00165_A46Tran_Id[0] ;
         A494TDet_ValorAtributo = P00165_A494TDet_ValorAtributo[0] ;
         AV16Serial = A494TDet_ValorAtributo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV14Modelo = "" ;
      /* Using cursor P00166 */
      pr_default.execute(4, new Object[] {new Long(AV10Tran_Id), new Long(AV9TDet_Consecutivo)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A70TDet_ListId = P00166_A70TDet_ListId[0] ;
         A69TDet_Consecutivo = P00166_A69TDet_Consecutivo[0] ;
         A46Tran_Id = P00166_A46Tran_Id[0] ;
         A494TDet_ValorAtributo = P00166_A494TDet_ValorAtributo[0] ;
         AV14Modelo = A494TDet_ValorAtributo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      AV15Observaciones = "" ;
      /* Using cursor P00167 */
      pr_default.execute(5, new Object[] {new Long(AV10Tran_Id), new Long(AV9TDet_Consecutivo)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A70TDet_ListId = P00167_A70TDet_ListId[0] ;
         A69TDet_Consecutivo = P00167_A69TDet_Consecutivo[0] ;
         A46Tran_Id = P00167_A46Tran_Id[0] ;
         A494TDet_ValorAtributo = P00167_A494TDet_ValorAtributo[0] ;
         AV15Observaciones = A494TDet_ValorAtributo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = buscaatributos.this.AV8Placa;
      this.aP1[0] = buscaatributos.this.AV13Marca;
      this.aP2[0] = buscaatributos.this.AV14Modelo;
      this.aP3[0] = buscaatributos.this.AV16Serial;
      this.aP4[0] = buscaatributos.this.AV15Observaciones;
      this.aP5[0] = buscaatributos.this.AV17Tran_IdEntrada;
      this.aP6[0] = buscaatributos.this.AV18Nro_Linea;
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
      P00162_A490TDet_PlacaNumero = new String[] {""} ;
      P00162_n490TDet_PlacaNumero = new boolean[] {false} ;
      P00162_A46Tran_Id = new long[1] ;
      P00162_A69TDet_Consecutivo = new long[1] ;
      A490TDet_PlacaNumero = "" ;
      AV11Tran_IndE_S = "" ;
      P00163_A416Tran_Observaciones = new String[] {""} ;
      P00163_n416Tran_Observaciones = new boolean[] {false} ;
      P00163_A46Tran_Id = new long[1] ;
      P00163_A481Tran_IndE_S = new String[] {""} ;
      P00163_n481Tran_IndE_S = new boolean[] {false} ;
      A416Tran_Observaciones = "" ;
      A481Tran_IndE_S = "" ;
      AV12Tran_Observaciones = "" ;
      P00164_A70TDet_ListId = new long[1] ;
      P00164_A69TDet_Consecutivo = new long[1] ;
      P00164_A46Tran_Id = new long[1] ;
      P00164_A494TDet_ValorAtributo = new String[] {""} ;
      A494TDet_ValorAtributo = "" ;
      P00165_A70TDet_ListId = new long[1] ;
      P00165_A69TDet_Consecutivo = new long[1] ;
      P00165_A46Tran_Id = new long[1] ;
      P00165_A494TDet_ValorAtributo = new String[] {""} ;
      P00166_A70TDet_ListId = new long[1] ;
      P00166_A69TDet_Consecutivo = new long[1] ;
      P00166_A46Tran_Id = new long[1] ;
      P00166_A494TDet_ValorAtributo = new String[] {""} ;
      P00167_A70TDet_ListId = new long[1] ;
      P00167_A69TDet_Consecutivo = new long[1] ;
      P00167_A46Tran_Id = new long[1] ;
      P00167_A494TDet_ValorAtributo = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.buscaatributos__default(),
         new Object[] {
             new Object[] {
            P00162_A490TDet_PlacaNumero, P00162_n490TDet_PlacaNumero, P00162_A46Tran_Id, P00162_A69TDet_Consecutivo
            }
            , new Object[] {
            P00163_A416Tran_Observaciones, P00163_n416Tran_Observaciones, P00163_A46Tran_Id, P00163_A481Tran_IndE_S, P00163_n481Tran_IndE_S
            }
            , new Object[] {
            P00164_A70TDet_ListId, P00164_A69TDet_Consecutivo, P00164_A46Tran_Id, P00164_A494TDet_ValorAtributo
            }
            , new Object[] {
            P00165_A70TDet_ListId, P00165_A69TDet_Consecutivo, P00165_A46Tran_Id, P00165_A494TDet_ValorAtributo
            }
            , new Object[] {
            P00166_A70TDet_ListId, P00166_A69TDet_Consecutivo, P00166_A46Tran_Id, P00166_A494TDet_ValorAtributo
            }
            , new Object[] {
            P00167_A70TDet_ListId, P00167_A69TDet_Consecutivo, P00167_A46Tran_Id, P00167_A494TDet_ValorAtributo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV18Nro_Linea ;
   private long AV17Tran_IdEntrada ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long AV10Tran_Id ;
   private long AV9TDet_Consecutivo ;
   private long A70TDet_ListId ;
   private String scmdbuf ;
   private boolean n490TDet_PlacaNumero ;
   private boolean returnInSub ;
   private boolean n416Tran_Observaciones ;
   private boolean n481Tran_IndE_S ;
   private String A416Tran_Observaciones ;
   private String AV12Tran_Observaciones ;
   private String AV8Placa ;
   private String AV13Marca ;
   private String AV14Modelo ;
   private String AV16Serial ;
   private String AV15Observaciones ;
   private String A490TDet_PlacaNumero ;
   private String AV11Tran_IndE_S ;
   private String A481Tran_IndE_S ;
   private String A494TDet_ValorAtributo ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private long[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00162_A490TDet_PlacaNumero ;
   private boolean[] P00162_n490TDet_PlacaNumero ;
   private long[] P00162_A46Tran_Id ;
   private long[] P00162_A69TDet_Consecutivo ;
   private String[] P00163_A416Tran_Observaciones ;
   private boolean[] P00163_n416Tran_Observaciones ;
   private long[] P00163_A46Tran_Id ;
   private String[] P00163_A481Tran_IndE_S ;
   private boolean[] P00163_n481Tran_IndE_S ;
   private long[] P00164_A70TDet_ListId ;
   private long[] P00164_A69TDet_Consecutivo ;
   private long[] P00164_A46Tran_Id ;
   private String[] P00164_A494TDet_ValorAtributo ;
   private long[] P00165_A70TDet_ListId ;
   private long[] P00165_A69TDet_Consecutivo ;
   private long[] P00165_A46Tran_Id ;
   private String[] P00165_A494TDet_ValorAtributo ;
   private long[] P00166_A70TDet_ListId ;
   private long[] P00166_A69TDet_Consecutivo ;
   private long[] P00166_A46Tran_Id ;
   private String[] P00166_A494TDet_ValorAtributo ;
   private long[] P00167_A70TDet_ListId ;
   private long[] P00167_A69TDet_Consecutivo ;
   private long[] P00167_A46Tran_Id ;
   private String[] P00167_A494TDet_ValorAtributo ;
}

final  class buscaatributos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00162", "SELECT TDet_PlacaNumero, Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE TDet_PlacaNumero = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00163", "SELECT Tran_Observaciones, Tran_Id, Tran_IndE_S FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00164", "SELECT TDet_ListId, TDet_Consecutivo, Tran_Id, TDet_ValorAtributo FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? and TDet_Consecutivo = ? and TDet_ListId = 1 ORDER BY Tran_Id, TDet_Consecutivo, TDet_ListId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00165", "SELECT TDet_ListId, TDet_Consecutivo, Tran_Id, TDet_ValorAtributo FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? and TDet_Consecutivo = ? and TDet_ListId = 2 ORDER BY Tran_Id, TDet_Consecutivo, TDet_ListId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00166", "SELECT TDet_ListId, TDet_Consecutivo, Tran_Id, TDet_ValorAtributo FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? and TDet_Consecutivo = ? and TDet_ListId = 3 ORDER BY Tran_Id, TDet_Consecutivo, TDet_ListId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00167", "SELECT TDet_ListId, TDet_Consecutivo, Tran_Id, TDet_ValorAtributo FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? and TDet_Consecutivo = ? and TDet_ListId = 4 ORDER BY Tran_Id, TDet_Consecutivo, TDet_ListId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
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
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
      }
   }

}

