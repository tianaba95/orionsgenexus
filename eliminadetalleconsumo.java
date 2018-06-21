/*
               File: EliminaDetalleConsumo
        Description: Elimina Detalle Consumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:12.17
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class eliminadetalleconsumo extends GXProcedure
{
   public eliminadetalleconsumo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( eliminadetalleconsumo.class ), "" );
   }

   public eliminadetalleconsumo( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( long[] aP0 )
   {
      eliminadetalleconsumo.this.AV21Tran_Id = aP0[0];
      this.aP0 = aP0;
      eliminadetalleconsumo.this.AV16TDet_Consecutivo = aP1[0];
      this.aP1 = aP1;
      eliminadetalleconsumo.this.aP1 = new long[] {0};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long[] aP0 ,
                             long[] aP1 )
   {
      eliminadetalleconsumo.this.AV21Tran_Id = aP0[0];
      this.aP0 = aP0;
      eliminadetalleconsumo.this.AV16TDet_Consecutivo = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV21Tran_Id ;
      GXv_int2[0] = AV14Regi_Id ;
      GXv_int3[0] = AV11Cent_Id ;
      GXv_char4[0] = AV9Alma_Modulo ;
      GXv_char5[0] = AV8Alma_Codigo ;
      GXv_char6[0] = AV10Bode_Codigo ;
      GXv_int7[0] = AV20Tran_ConsecutivoCC ;
      GXv_int8[0] = AV24Tran_IdCuentadanteOrigen ;
      GXv_char9[0] = AV30Tran_DescripcionMovimiento ;
      GXv_char10[0] = AV31Tran_Estado ;
      new com.orions2.datostran(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_int7, GXv_int8, GXv_char9, GXv_char10) ;
      eliminadetalleconsumo.this.AV21Tran_Id = GXv_int1[0] ;
      eliminadetalleconsumo.this.AV14Regi_Id = GXv_int2[0] ;
      eliminadetalleconsumo.this.AV11Cent_Id = GXv_int3[0] ;
      eliminadetalleconsumo.this.AV9Alma_Modulo = GXv_char4[0] ;
      eliminadetalleconsumo.this.AV8Alma_Codigo = GXv_char5[0] ;
      eliminadetalleconsumo.this.AV10Bode_Codigo = GXv_char6[0] ;
      eliminadetalleconsumo.this.AV20Tran_ConsecutivoCC = GXv_int7[0] ;
      eliminadetalleconsumo.this.AV24Tran_IdCuentadanteOrigen = GXv_int8[0] ;
      eliminadetalleconsumo.this.AV30Tran_DescripcionMovimiento = GXv_char9[0] ;
      eliminadetalleconsumo.this.AV31Tran_Estado = GXv_char10[0] ;
      AV12Costo_Total_Dev = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P002B2 */
      pr_default.execute(0, new Object[] {new Long(AV21Tran_Id), new Long(AV16TDet_Consecutivo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A69TDet_Consecutivo = P002B2_A69TDet_Consecutivo[0] ;
         A46Tran_Id = P002B2_A46Tran_Id[0] ;
         A490TDet_PlacaNumero = P002B2_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P002B2_n490TDet_PlacaNumero[0] ;
         A66Elem_Consecutivo = P002B2_A66Elem_Consecutivo[0] ;
         A487TDet_Cantidad = P002B2_A487TDet_Cantidad[0] ;
         A491TDet_PlacaPadre = P002B2_A491TDet_PlacaPadre[0] ;
         n491TDet_PlacaPadre = P002B2_n491TDet_PlacaPadre[0] ;
         A505TDet_EsPadre = P002B2_A505TDet_EsPadre[0] ;
         AV18TDet_PlacaNumero = A490TDet_PlacaNumero ;
         AV22Elem_Consecutivo = A66Elem_Consecutivo ;
         AV15TDet_Cantidad = A487TDet_Cantidad ;
         AV19TDet_PlacaPadre = A491TDet_PlacaPadre ;
         AV17TDet_EsPadre = A505TDet_EsPadre ;
         AV13Invd_NumeroPlaca = A490TDet_PlacaNumero ;
         AV25Consecutivo = (int)(AV16TDet_Consecutivo) ;
         /* Execute user subroutine: 'ACTUALIZA ESTADO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Execute user subroutine: 'ELIMINA' */
      S141 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ACTUALIZA ESTADO' Routine */
      /* Using cursor P002B3 */
      pr_default.execute(1, new Object[] {new Long(AV21Tran_Id), new Long(AV16TDet_Consecutivo)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A69TDet_Consecutivo = P002B3_A69TDet_Consecutivo[0] ;
         A46Tran_Id = P002B3_A46Tran_Id[0] ;
         A71Tran_Entrada = P002B3_A71Tran_Entrada[0] ;
         A72Nro_Linea = P002B3_A72Nro_Linea[0] ;
         A687Tran_Cantidad = P002B3_A687Tran_Cantidad[0] ;
         n687Tran_Cantidad = P002B3_n687Tran_Cantidad[0] ;
         AV26Tran_Entrada = A71Tran_Entrada ;
         AV27Nro_Linea = A72Nro_Linea ;
         AV28Tran_Cantidad = A687Tran_Cantidad ;
         /* Execute user subroutine: 'ACTUALIZA INVENTARIO' */
         S123 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Execute user subroutine: 'ACTUALIZA CABECERA' */
      S131 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'ACTUALIZA CABECERA' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P002B4 */
      pr_default.execute(2, new Object[] {AV12Costo_Total_Dev, new Long(AV21Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
   }

   public void S123( )
   {
      /* 'ACTUALIZA INVENTARIO' Routine */
      /* Using cursor P002B5 */
      pr_default.execute(3, new Object[] {new Long(AV14Regi_Id), new Long(AV11Cent_Id), AV9Alma_Modulo, AV8Alma_Codigo, AV10Bode_Codigo, new Long(AV26Tran_Entrada), AV22Elem_Consecutivo, new Integer(AV27Nro_Linea)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A94Num_Linea = P002B5_A94Num_Linea[0] ;
         A66Elem_Consecutivo = P002B5_A66Elem_Consecutivo[0] ;
         A93Trans_Id = P002B5_A93Trans_Id[0] ;
         A31Bode_Codigo = P002B5_A31Bode_Codigo[0] ;
         A28Alma_Codigo = P002B5_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P002B5_A27Alma_Modulo[0] ;
         A92Centro_Id = P002B5_A92Centro_Id[0] ;
         A91Regional = P002B5_A91Regional[0] ;
         A619Cantidad_Transito = P002B5_A619Cantidad_Transito[0] ;
         n619Cantidad_Transito = P002B5_n619Cantidad_Transito[0] ;
         A618Cantidad_Diponible = P002B5_A618Cantidad_Diponible[0] ;
         n618Cantidad_Diponible = P002B5_n618Cantidad_Diponible[0] ;
         A620Valor_Unitario = P002B5_A620Valor_Unitario[0] ;
         A619Cantidad_Transito = (int)(A619Cantidad_Transito-AV28Tran_Cantidad) ;
         n619Cantidad_Transito = false ;
         A618Cantidad_Diponible = (int)(A618Cantidad_Diponible+AV28Tran_Cantidad) ;
         n618Cantidad_Diponible = false ;
         AV29Costo_Total = (DecimalUtil.doubleToDec(AV28Tran_Cantidad).multiply(A620Valor_Unitario)) ;
         /* Using cursor P002B6 */
         pr_default.execute(4, new Object[] {new Boolean(n619Cantidad_Transito), new Integer(A619Cantidad_Transito), new Boolean(n618Cantidad_Diponible), new Integer(A618Cantidad_Diponible), new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_CON") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV12Costo_Total_Dev = AV12Costo_Total_Dev.add(AV29Costo_Total) ;
   }

   public void S141( )
   {
      /* 'ELIMINA' Routine */
      /* Optimized DELETE. */
      /* Using cursor P002B7 */
      pr_default.execute(5, new Object[] {new Long(AV21Tran_Id), new Long(AV16TDet_Consecutivo)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DET_TRAN_DATOS_SALIDA") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P002B8 */
      pr_default.execute(6, new Object[] {new Long(AV21Tran_Id), new Long(AV16TDet_Consecutivo)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      /* End optimized DELETE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = eliminadetalleconsumo.this.AV21Tran_Id;
      this.aP1[0] = eliminadetalleconsumo.this.AV16TDet_Consecutivo;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "eliminadetalleconsumo");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new long [1] ;
      GXv_int2 = new long [1] ;
      GXv_int3 = new long [1] ;
      AV9Alma_Modulo = "" ;
      GXv_char4 = new String [1] ;
      AV8Alma_Codigo = "" ;
      GXv_char5 = new String [1] ;
      AV10Bode_Codigo = "" ;
      GXv_char6 = new String [1] ;
      GXv_int7 = new long [1] ;
      GXv_int8 = new long [1] ;
      AV30Tran_DescripcionMovimiento = "" ;
      GXv_char9 = new String [1] ;
      AV31Tran_Estado = "" ;
      GXv_char10 = new String [1] ;
      AV12Costo_Total_Dev = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P002B2_A69TDet_Consecutivo = new long[1] ;
      P002B2_A46Tran_Id = new long[1] ;
      P002B2_A490TDet_PlacaNumero = new String[] {""} ;
      P002B2_n490TDet_PlacaNumero = new boolean[] {false} ;
      P002B2_A66Elem_Consecutivo = new String[] {""} ;
      P002B2_A487TDet_Cantidad = new long[1] ;
      P002B2_A491TDet_PlacaPadre = new String[] {""} ;
      P002B2_n491TDet_PlacaPadre = new boolean[] {false} ;
      P002B2_A505TDet_EsPadre = new String[] {""} ;
      A490TDet_PlacaNumero = "" ;
      A66Elem_Consecutivo = "" ;
      A491TDet_PlacaPadre = "" ;
      A505TDet_EsPadre = "" ;
      AV18TDet_PlacaNumero = "" ;
      AV22Elem_Consecutivo = "" ;
      AV19TDet_PlacaPadre = "" ;
      AV17TDet_EsPadre = "" ;
      AV13Invd_NumeroPlaca = "" ;
      P002B3_A69TDet_Consecutivo = new long[1] ;
      P002B3_A46Tran_Id = new long[1] ;
      P002B3_A71Tran_Entrada = new long[1] ;
      P002B3_A72Nro_Linea = new int[1] ;
      P002B3_A687Tran_Cantidad = new int[1] ;
      P002B3_n687Tran_Cantidad = new boolean[] {false} ;
      P002B5_A94Num_Linea = new int[1] ;
      P002B5_A66Elem_Consecutivo = new String[] {""} ;
      P002B5_A93Trans_Id = new long[1] ;
      P002B5_A31Bode_Codigo = new String[] {""} ;
      P002B5_A28Alma_Codigo = new String[] {""} ;
      P002B5_A27Alma_Modulo = new String[] {""} ;
      P002B5_A92Centro_Id = new long[1] ;
      P002B5_A91Regional = new long[1] ;
      P002B5_A619Cantidad_Transito = new int[1] ;
      P002B5_n619Cantidad_Transito = new boolean[] {false} ;
      P002B5_A618Cantidad_Diponible = new int[1] ;
      P002B5_n618Cantidad_Diponible = new boolean[] {false} ;
      P002B5_A620Valor_Unitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A31Bode_Codigo = "" ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A620Valor_Unitario = DecimalUtil.ZERO ;
      AV29Costo_Total = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.eliminadetalleconsumo__default(),
         new Object[] {
             new Object[] {
            P002B2_A69TDet_Consecutivo, P002B2_A46Tran_Id, P002B2_A490TDet_PlacaNumero, P002B2_n490TDet_PlacaNumero, P002B2_A66Elem_Consecutivo, P002B2_A487TDet_Cantidad, P002B2_A491TDet_PlacaPadre, P002B2_n491TDet_PlacaPadre, P002B2_A505TDet_EsPadre
            }
            , new Object[] {
            P002B3_A69TDet_Consecutivo, P002B3_A46Tran_Id, P002B3_A71Tran_Entrada, P002B3_A72Nro_Linea, P002B3_A687Tran_Cantidad, P002B3_n687Tran_Cantidad
            }
            , new Object[] {
            }
            , new Object[] {
            P002B5_A94Num_Linea, P002B5_A66Elem_Consecutivo, P002B5_A93Trans_Id, P002B5_A31Bode_Codigo, P002B5_A28Alma_Codigo, P002B5_A27Alma_Modulo, P002B5_A92Centro_Id, P002B5_A91Regional, P002B5_A619Cantidad_Transito, P002B5_n619Cantidad_Transito,
            P002B5_A618Cantidad_Diponible, P002B5_n618Cantidad_Diponible, P002B5_A620Valor_Unitario
            }
            , new Object[] {
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

   private short Gx_err ;
   private int AV25Consecutivo ;
   private int A72Nro_Linea ;
   private int A687Tran_Cantidad ;
   private int AV27Nro_Linea ;
   private int AV28Tran_Cantidad ;
   private int A94Num_Linea ;
   private int A619Cantidad_Transito ;
   private int A618Cantidad_Diponible ;
   private long AV21Tran_Id ;
   private long AV16TDet_Consecutivo ;
   private long GXv_int1[] ;
   private long AV14Regi_Id ;
   private long GXv_int2[] ;
   private long AV11Cent_Id ;
   private long GXv_int3[] ;
   private long AV20Tran_ConsecutivoCC ;
   private long GXv_int7[] ;
   private long AV24Tran_IdCuentadanteOrigen ;
   private long GXv_int8[] ;
   private long A69TDet_Consecutivo ;
   private long A46Tran_Id ;
   private long A487TDet_Cantidad ;
   private long AV15TDet_Cantidad ;
   private long A71Tran_Entrada ;
   private long AV26Tran_Entrada ;
   private long A93Trans_Id ;
   private long A92Centro_Id ;
   private long A91Regional ;
   private java.math.BigDecimal AV12Costo_Total_Dev ;
   private java.math.BigDecimal A620Valor_Unitario ;
   private java.math.BigDecimal AV29Costo_Total ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char9[] ;
   private String AV31Tran_Estado ;
   private String GXv_char10[] ;
   private String scmdbuf ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean returnInSub ;
   private boolean n687Tran_Cantidad ;
   private boolean n619Cantidad_Transito ;
   private boolean n618Cantidad_Diponible ;
   private String AV9Alma_Modulo ;
   private String AV8Alma_Codigo ;
   private String AV10Bode_Codigo ;
   private String AV30Tran_DescripcionMovimiento ;
   private String A490TDet_PlacaNumero ;
   private String A66Elem_Consecutivo ;
   private String A491TDet_PlacaPadre ;
   private String A505TDet_EsPadre ;
   private String AV18TDet_PlacaNumero ;
   private String AV22Elem_Consecutivo ;
   private String AV19TDet_PlacaPadre ;
   private String AV17TDet_EsPadre ;
   private String AV13Invd_NumeroPlaca ;
   private String A31Bode_Codigo ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private long[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P002B2_A69TDet_Consecutivo ;
   private long[] P002B2_A46Tran_Id ;
   private String[] P002B2_A490TDet_PlacaNumero ;
   private boolean[] P002B2_n490TDet_PlacaNumero ;
   private String[] P002B2_A66Elem_Consecutivo ;
   private long[] P002B2_A487TDet_Cantidad ;
   private String[] P002B2_A491TDet_PlacaPadre ;
   private boolean[] P002B2_n491TDet_PlacaPadre ;
   private String[] P002B2_A505TDet_EsPadre ;
   private long[] P002B3_A69TDet_Consecutivo ;
   private long[] P002B3_A46Tran_Id ;
   private long[] P002B3_A71Tran_Entrada ;
   private int[] P002B3_A72Nro_Linea ;
   private int[] P002B3_A687Tran_Cantidad ;
   private boolean[] P002B3_n687Tran_Cantidad ;
   private int[] P002B5_A94Num_Linea ;
   private String[] P002B5_A66Elem_Consecutivo ;
   private long[] P002B5_A93Trans_Id ;
   private String[] P002B5_A31Bode_Codigo ;
   private String[] P002B5_A28Alma_Codigo ;
   private String[] P002B5_A27Alma_Modulo ;
   private long[] P002B5_A92Centro_Id ;
   private long[] P002B5_A91Regional ;
   private int[] P002B5_A619Cantidad_Transito ;
   private boolean[] P002B5_n619Cantidad_Transito ;
   private int[] P002B5_A618Cantidad_Diponible ;
   private boolean[] P002B5_n618Cantidad_Diponible ;
   private java.math.BigDecimal[] P002B5_A620Valor_Unitario ;
}

final  class eliminadetalleconsumo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002B2", "SELECT TDet_Consecutivo, Tran_Id, TDet_PlacaNumero, Elem_Consecutivo, TDet_Cantidad, TDet_PlacaPadre, TDet_EsPadre FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? and TDet_Consecutivo = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P002B3", "SELECT TDet_Consecutivo, Tran_Id, Tran_Entrada, Nro_Linea, Tran_Cantidad FROM ALM_DET_TRAN_DATOS_SALIDA WHERE Tran_Id = ? and TDet_Consecutivo = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P002B4", "UPDATE ALM_TRANSACCION SET Tran_ValorTransaccion=Tran_ValorTransaccion - ?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
         ,new ForEachCursor("P002B5", "SELECT Num_Linea, Elem_Consecutivo, Trans_Id, Bode_Codigo, Alma_Codigo, Alma_Modulo, Centro_Id, Regional, Cantidad_Transito, Cantidad_Diponible, Valor_Unitario FROM ALM_INV_CON WHERE Regional = ? and Centro_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? and Trans_Id = ? and Elem_Consecutivo = ? and Num_Linea = ? ORDER BY Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea  FOR UPDATE OF Cantidad_Transito, Cantidad_Diponible NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P002B6", "UPDATE ALM_INV_CON SET Cantidad_Transito=?, Cantidad_Diponible=?  WHERE Regional = ? AND Centro_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ? AND Trans_Id = ? AND Elem_Consecutivo = ? AND Num_Linea = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_CON")
         ,new UpdateCursor("P002B7", "DELETE FROM ALM_DET_TRAN_DATOS_SALIDA  WHERE Tran_Id = ? and TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DET_TRAN_DATOS_SALIDA")
         ,new UpdateCursor("P002B8", "DELETE FROM ALM_DETALLE_TRANSACCION  WHERE Tran_Id = ? and TDet_Consecutivo = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2) ;
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
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setLong(3, ((Number) parms[4]).longValue());
               stmt.setLong(4, ((Number) parms[5]).longValue());
               stmt.setVarchar(5, (String)parms[6], 8, false);
               stmt.setVarchar(6, (String)parms[7], 2, false);
               stmt.setVarchar(7, (String)parms[8], 3, false);
               stmt.setLong(8, ((Number) parms[9]).longValue());
               stmt.setVarchar(9, (String)parms[10], 9, false);
               stmt.setInt(10, ((Number) parms[11]).intValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
      }
   }

}

