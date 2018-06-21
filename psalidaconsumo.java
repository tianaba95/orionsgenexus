/*
               File: PSalidaConsumo
        Description: PSalida Consumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:2.23
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psalidaconsumo extends GXProcedure
{
   public psalidaconsumo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psalidaconsumo.class ), "" );
   }

   public psalidaconsumo( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem> executeUdp( long[] aP0 )
   {
      psalidaconsumo.this.AV12Tran_Id = aP0[0];
      this.aP0 = aP0;
      psalidaconsumo.this.AV22SDTInvenConsumo = aP1[0];
      this.aP1 = aP1;
      psalidaconsumo.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long[] aP0 ,
                        GXBaseCollection<com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long[] aP0 ,
                             GXBaseCollection<com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem>[] aP1 )
   {
      psalidaconsumo.this.AV12Tran_Id = aP0[0];
      this.aP0 = aP0;
      psalidaconsumo.this.AV22SDTInvenConsumo = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Tran_ValorTransaccion = DecimalUtil.doubleToDec(0) ;
      AV30GXLvl5 = (byte)(0) ;
      /* Using cursor P001E2 */
      pr_default.execute(0, new Object[] {new Long(AV12Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = P001E2_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P001E2_A69TDet_Consecutivo[0] ;
         AV30GXLvl5 = (byte)(1) ;
         AV11TDet_Consecutivo = A69TDet_Consecutivo ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV30GXLvl5 == 0 )
      {
         AV11TDet_Consecutivo = 1 ;
      }
      AV31GXV1 = 1 ;
      while ( AV31GXV1 <= AV22SDTInvenConsumo.size() )
      {
         AV23SDTInvenConsumoItem = (com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV22SDTInvenConsumo.elementAt(-1+AV31GXV1));
         AV10Regional = AV23SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional() ;
         AV18Cent_Id = AV23SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id() ;
         AV14Alma_Modulo = AV23SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo() ;
         AV8Alma_Codigo = AV23SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo() ;
         AV15Bode_Codigo = AV23SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo() ;
         AV24Tran_Entrada = AV23SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id() ;
         AV20Elem_Consecutivo = AV23SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo() ;
         AV9Num_Linea = AV23SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea() ;
         AV17Cantidad_Solicitada = AV23SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada() ;
         if ( AV17Cantidad_Solicitada > 0 )
         {
            AV11TDet_Consecutivo = (long)(AV11TDet_Consecutivo+1) ;
            /* Using cursor P001E3 */
            pr_default.execute(1, new Object[] {new Long(AV10Regional), new Long(AV18Cent_Id), AV14Alma_Modulo, AV8Alma_Codigo, AV15Bode_Codigo, new Long(AV24Tran_Entrada), AV20Elem_Consecutivo, new Integer(AV9Num_Linea)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A94Num_Linea = P001E3_A94Num_Linea[0] ;
               A66Elem_Consecutivo = P001E3_A66Elem_Consecutivo[0] ;
               A93Trans_Id = P001E3_A93Trans_Id[0] ;
               A31Bode_Codigo = P001E3_A31Bode_Codigo[0] ;
               A28Alma_Codigo = P001E3_A28Alma_Codigo[0] ;
               A27Alma_Modulo = P001E3_A27Alma_Modulo[0] ;
               A92Centro_Id = P001E3_A92Centro_Id[0] ;
               A91Regional = P001E3_A91Regional[0] ;
               A618Cantidad_Diponible = P001E3_A618Cantidad_Diponible[0] ;
               n618Cantidad_Diponible = P001E3_n618Cantidad_Diponible[0] ;
               A619Cantidad_Transito = P001E3_A619Cantidad_Transito[0] ;
               n619Cantidad_Transito = P001E3_n619Cantidad_Transito[0] ;
               A620Valor_Unitario = P001E3_A620Valor_Unitario[0] ;
               A621Otros_Costos = P001E3_A621Otros_Costos[0] ;
               n621Otros_Costos = P001E3_n621Otros_Costos[0] ;
               A618Cantidad_Diponible = (int)(A618Cantidad_Diponible-AV17Cantidad_Solicitada) ;
               n618Cantidad_Diponible = false ;
               A619Cantidad_Transito = (int)(A619Cantidad_Transito+AV17Cantidad_Solicitada) ;
               n619Cantidad_Transito = false ;
               AV13Valor_Unitario = A620Valor_Unitario ;
               AV26Otros_Costos = A621Otros_Costos ;
               /* Using cursor P001E4 */
               pr_default.execute(2, new Object[] {new Boolean(n618Cantidad_Diponible), new Integer(A618Cantidad_Diponible), new Boolean(n619Cantidad_Transito), new Integer(A619Cantidad_Transito), new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_CON") ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            /*
               INSERT RECORD ON TABLE ALM_DETALLE_TRANSACCION

            */
            A46Tran_Id = AV12Tran_Id ;
            A69TDet_Consecutivo = AV11TDet_Consecutivo ;
            A66Elem_Consecutivo = AV20Elem_Consecutivo ;
            A487TDet_Cantidad = AV17Cantidad_Solicitada ;
            A488TDet_ValorUnitario = AV13Valor_Unitario ;
            A489TDet_ValorTotal = AV13Valor_Unitario.multiply(DecimalUtil.doubleToDec(AV17Cantidad_Solicitada)) ;
            /* Using cursor P001E5 */
            pr_default.execute(3, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), A66Elem_Consecutivo, new Long(A487TDet_Cantidad), A488TDet_ValorUnitario, A489TDet_ValorTotal});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
            if ( (pr_default.getStatus(3) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /*
               INSERT RECORD ON TABLE ALM_DET_TRAN_DATOS_SALIDA

            */
            A46Tran_Id = AV12Tran_Id ;
            A69TDet_Consecutivo = AV11TDet_Consecutivo ;
            A71Tran_Entrada = AV24Tran_Entrada ;
            A72Nro_Linea = AV9Num_Linea ;
            A687Tran_Cantidad = AV17Cantidad_Solicitada ;
            n687Tran_Cantidad = false ;
            /* Using cursor P001E6 */
            pr_default.execute(4, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A71Tran_Entrada), new Integer(A72Nro_Linea), new Boolean(n687Tran_Cantidad), new Integer(A687Tran_Cantidad)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DET_TRAN_DATOS_SALIDA") ;
            if ( (pr_default.getStatus(4) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            AV27Tran_ValorTransaccion = AV27Tran_ValorTransaccion.add((AV13Valor_Unitario.multiply(DecimalUtil.doubleToDec(AV17Cantidad_Solicitada)))) ;
         }
         AV31GXV1 = (int)(AV31GXV1+1) ;
      }
      /* Using cursor P001E7 */
      pr_default.execute(5, new Object[] {new Long(AV12Tran_Id)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         gxt1E6 = (byte)(0) ;
         A46Tran_Id = P001E7_A46Tran_Id[0] ;
         A483Tran_ValorTransaccion = P001E7_A483Tran_ValorTransaccion[0] ;
         n483Tran_ValorTransaccion = P001E7_n483Tran_ValorTransaccion[0] ;
         A483Tran_ValorTransaccion = A483Tran_ValorTransaccion.add(AV27Tran_ValorTransaccion) ;
         n483Tran_ValorTransaccion = false ;
         gxt1E6 = (byte)(1) ;
         /* Using cursor P001E8 */
         pr_default.execute(6, new Object[] {new Boolean(n483Tran_ValorTransaccion), A483Tran_ValorTransaccion, new Long(A46Tran_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
         if ( gxt1E6 == 1 )
         {
            Application.commit(context, remoteHandle, "DEFAULT",pr_default, "psalidaconsumo");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psalidaconsumo.this.AV12Tran_Id;
      this.aP1[0] = psalidaconsumo.this.AV22SDTInvenConsumo;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "psalidaconsumo");
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27Tran_ValorTransaccion = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P001E2_A46Tran_Id = new long[1] ;
      P001E2_A69TDet_Consecutivo = new long[1] ;
      AV23SDTInvenConsumoItem = new com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem(remoteHandle, context);
      AV14Alma_Modulo = "" ;
      AV8Alma_Codigo = "" ;
      AV15Bode_Codigo = "" ;
      AV20Elem_Consecutivo = "" ;
      P001E3_A94Num_Linea = new int[1] ;
      P001E3_A66Elem_Consecutivo = new String[] {""} ;
      P001E3_A93Trans_Id = new long[1] ;
      P001E3_A31Bode_Codigo = new String[] {""} ;
      P001E3_A28Alma_Codigo = new String[] {""} ;
      P001E3_A27Alma_Modulo = new String[] {""} ;
      P001E3_A92Centro_Id = new long[1] ;
      P001E3_A91Regional = new long[1] ;
      P001E3_A618Cantidad_Diponible = new int[1] ;
      P001E3_n618Cantidad_Diponible = new boolean[] {false} ;
      P001E3_A619Cantidad_Transito = new int[1] ;
      P001E3_n619Cantidad_Transito = new boolean[] {false} ;
      P001E3_A620Valor_Unitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001E3_A621Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001E3_n621Otros_Costos = new boolean[] {false} ;
      A66Elem_Consecutivo = "" ;
      A31Bode_Codigo = "" ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A620Valor_Unitario = DecimalUtil.ZERO ;
      A621Otros_Costos = DecimalUtil.ZERO ;
      AV13Valor_Unitario = DecimalUtil.ZERO ;
      AV26Otros_Costos = DecimalUtil.ZERO ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P001E7_A46Tran_Id = new long[1] ;
      P001E7_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001E7_n483Tran_ValorTransaccion = new boolean[] {false} ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.psalidaconsumo__default(),
         new Object[] {
             new Object[] {
            P001E2_A46Tran_Id, P001E2_A69TDet_Consecutivo
            }
            , new Object[] {
            P001E3_A94Num_Linea, P001E3_A66Elem_Consecutivo, P001E3_A93Trans_Id, P001E3_A31Bode_Codigo, P001E3_A28Alma_Codigo, P001E3_A27Alma_Modulo, P001E3_A92Centro_Id, P001E3_A91Regional, P001E3_A618Cantidad_Diponible, P001E3_n618Cantidad_Diponible,
            P001E3_A619Cantidad_Transito, P001E3_n619Cantidad_Transito, P001E3_A620Valor_Unitario, P001E3_A621Otros_Costos, P001E3_n621Otros_Costos
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P001E7_A46Tran_Id, P001E7_A483Tran_ValorTransaccion, P001E7_n483Tran_ValorTransaccion
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30GXLvl5 ;
   private byte gxt1E6 ;
   private short Gx_err ;
   private int AV31GXV1 ;
   private int AV9Num_Linea ;
   private int AV17Cantidad_Solicitada ;
   private int A94Num_Linea ;
   private int A618Cantidad_Diponible ;
   private int A619Cantidad_Transito ;
   private int GX_INS12 ;
   private int GX_INS14 ;
   private int A72Nro_Linea ;
   private int A687Tran_Cantidad ;
   private long AV12Tran_Id ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long AV11TDet_Consecutivo ;
   private long AV10Regional ;
   private long AV18Cent_Id ;
   private long AV24Tran_Entrada ;
   private long A93Trans_Id ;
   private long A92Centro_Id ;
   private long A91Regional ;
   private long A487TDet_Cantidad ;
   private long A71Tran_Entrada ;
   private java.math.BigDecimal AV27Tran_ValorTransaccion ;
   private java.math.BigDecimal A620Valor_Unitario ;
   private java.math.BigDecimal A621Otros_Costos ;
   private java.math.BigDecimal AV13Valor_Unitario ;
   private java.math.BigDecimal AV26Otros_Costos ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private boolean n618Cantidad_Diponible ;
   private boolean n619Cantidad_Transito ;
   private boolean n621Otros_Costos ;
   private boolean n687Tran_Cantidad ;
   private boolean n483Tran_ValorTransaccion ;
   private String AV14Alma_Modulo ;
   private String AV8Alma_Codigo ;
   private String AV15Bode_Codigo ;
   private String AV20Elem_Consecutivo ;
   private String A66Elem_Consecutivo ;
   private String A31Bode_Codigo ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private long[] aP0 ;
   private GXBaseCollection<com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P001E2_A46Tran_Id ;
   private long[] P001E2_A69TDet_Consecutivo ;
   private int[] P001E3_A94Num_Linea ;
   private String[] P001E3_A66Elem_Consecutivo ;
   private long[] P001E3_A93Trans_Id ;
   private String[] P001E3_A31Bode_Codigo ;
   private String[] P001E3_A28Alma_Codigo ;
   private String[] P001E3_A27Alma_Modulo ;
   private long[] P001E3_A92Centro_Id ;
   private long[] P001E3_A91Regional ;
   private int[] P001E3_A618Cantidad_Diponible ;
   private boolean[] P001E3_n618Cantidad_Diponible ;
   private int[] P001E3_A619Cantidad_Transito ;
   private boolean[] P001E3_n619Cantidad_Transito ;
   private java.math.BigDecimal[] P001E3_A620Valor_Unitario ;
   private java.math.BigDecimal[] P001E3_A621Otros_Costos ;
   private boolean[] P001E3_n621Otros_Costos ;
   private long[] P001E7_A46Tran_Id ;
   private java.math.BigDecimal[] P001E7_A483Tran_ValorTransaccion ;
   private boolean[] P001E7_n483Tran_ValorTransaccion ;
   private GXBaseCollection<com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem> AV22SDTInvenConsumo ;
   private com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem AV23SDTInvenConsumoItem ;
}

final  class psalidaconsumo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001E2", "SELECT * FROM (SELECT Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id DESC, TDet_Consecutivo DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001E3", "SELECT Num_Linea, Elem_Consecutivo, Trans_Id, Bode_Codigo, Alma_Codigo, Alma_Modulo, Centro_Id, Regional, Cantidad_Diponible, Cantidad_Transito, Valor_Unitario, Otros_Costos FROM ALM_INV_CON WHERE Regional = ? and Centro_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? and Trans_Id = ? and Elem_Consecutivo = ? and Num_Linea = ? ORDER BY Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea  FOR UPDATE OF Cantidad_Diponible, Cantidad_Transito NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001E4", "UPDATE ALM_INV_CON SET Cantidad_Diponible=?, Cantidad_Transito=?  WHERE Regional = ? AND Centro_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ? AND Trans_Id = ? AND Elem_Consecutivo = ? AND Num_Linea = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_CON")
         ,new UpdateCursor("P001E5", "INSERT INTO ALM_DETALLE_TRANSACCION(Tran_Id, TDet_Consecutivo, Elem_Consecutivo, TDet_Cantidad, TDet_ValorUnitario, TDet_ValorTotal, TDet_PlacaNumero, TDet_Observaciones, TDet_PlacaPadre, TDet_EsPadre, TDet_Atributos, TDet_Valor_Presente, TDet_Valor_Futuro, TDet_Taza, TDet_Plazo_N, TDet_Otros_Costos, TDet_Agrupado, TDet_PlacaRecuperada) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new UpdateCursor("P001E6", "INSERT INTO ALM_DET_TRAN_DATOS_SALIDA(Tran_Id, TDet_Consecutivo, Tran_Entrada, Nro_Linea, Tran_Cantidad) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DET_TRAN_DATOS_SALIDA")
         ,new ForEachCursor("P001E7", "SELECT Tran_Id, Tran_ValorTransaccion FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id  FOR UPDATE OF Tran_ValorTransaccion NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001E8", "UPDATE ALM_TRANSACCION SET Tran_ValorTransaccion=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
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
               return;
            case 1 :
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
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 2 :
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
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setVarchar(3, (String)parms[2], 9, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
      }
   }

}

