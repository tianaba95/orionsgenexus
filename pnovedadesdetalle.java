/*
               File: PNovedadesDetalle
        Description: PNovedades Detalle
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:13.50
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnovedadesdetalle extends GXProcedure
{
   public pnovedadesdetalle( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnovedadesdetalle.class ), "" );
   }

   public pnovedadesdetalle( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTDetalle_SDTDetalleItem> executeUdp( String[] aP0 ,
                                                                                 String[] aP1 ,
                                                                                 long[] aP2 )
   {
      pnovedadesdetalle.this.AV11TNov_Nombre_Campo = aP0[0];
      this.aP0 = aP0;
      pnovedadesdetalle.this.AV10Placa = aP1[0];
      this.aP1 = aP1;
      pnovedadesdetalle.this.AV12Tran_Id = aP2[0];
      this.aP2 = aP2;
      pnovedadesdetalle.this.AV8SDTDetalle = aP3[0];
      this.aP3 = aP3;
      pnovedadesdetalle.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTDetalle_SDTDetalleItem>()};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        long[] aP2 ,
                        GXBaseCollection<com.orions2.SdtSDTDetalle_SDTDetalleItem>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             long[] aP2 ,
                             GXBaseCollection<com.orions2.SdtSDTDetalle_SDTDetalleItem>[] aP3 )
   {
      pnovedadesdetalle.this.AV11TNov_Nombre_Campo = aP0[0];
      this.aP0 = aP0;
      pnovedadesdetalle.this.AV10Placa = aP1[0];
      this.aP1 = aP1;
      pnovedadesdetalle.this.AV12Tran_Id = aP2[0];
      this.aP2 = aP2;
      pnovedadesdetalle.this.AV8SDTDetalle = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( GXutil.strcmp(AV11TNov_Nombre_Campo, "Desasociar") == 0 ) || ( GXutil.strcmp(AV11TNov_Nombre_Campo, "Asociar") == 0 ) )
      {
         /* Using cursor P002K2 */
         pr_default.execute(0, new Object[] {AV10Placa});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A37Cata_Codigo = P002K2_A37Cata_Codigo[0] ;
            A68Invd_PlacaPadre = P002K2_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P002K2_n68Invd_PlacaPadre[0] ;
            A67Invd_NumeroPlaca = P002K2_A67Invd_NumeroPlaca[0] ;
            A298Cata_Descripcion = P002K2_A298Cata_Descripcion[0] ;
            A66Elem_Consecutivo = P002K2_A66Elem_Consecutivo[0] ;
            A37Cata_Codigo = P002K2_A37Cata_Codigo[0] ;
            A298Cata_Descripcion = P002K2_A298Cata_Descripcion[0] ;
            AV9SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)new com.orions2.SdtSDTDetalle_SDTDetalleItem(remoteHandle, context);
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Placa( A67Invd_NumeroPlaca );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion( A298Cata_Descripcion );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual( A68Invd_PlacaPadre );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva( A68Invd_PlacaPadre );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo( A66Elem_Consecutivo );
            AV8SDTDetalle.add(AV9SDTDetalleItem, 0);
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else if ( ( GXutil.strcmp(AV11TNov_Nombre_Campo, "Elem_consecutivo") == 0 ) || ( GXutil.strcmp(AV11TNov_Nombre_Campo, "TDet_Cantidad") == 0 ) )
      {
         /* Using cursor P002K3 */
         pr_default.execute(1, new Object[] {new Long(AV12Tran_Id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A37Cata_Codigo = P002K3_A37Cata_Codigo[0] ;
            A46Tran_Id = P002K3_A46Tran_Id[0] ;
            A69TDet_Consecutivo = P002K3_A69TDet_Consecutivo[0] ;
            A66Elem_Consecutivo = P002K3_A66Elem_Consecutivo[0] ;
            A298Cata_Descripcion = P002K3_A298Cata_Descripcion[0] ;
            A487TDet_Cantidad = P002K3_A487TDet_Cantidad[0] ;
            A490TDet_PlacaNumero = P002K3_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = P002K3_n490TDet_PlacaNumero[0] ;
            A37Cata_Codigo = P002K3_A37Cata_Codigo[0] ;
            A298Cata_Descripcion = P002K3_A298Cata_Descripcion[0] ;
            AV9SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)new com.orions2.SdtSDTDetalle_SDTDetalleItem(remoteHandle, context);
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea( (int)(A69TDet_Consecutivo) );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual( A66Elem_Consecutivo );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo( A66Elem_Consecutivo );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion( A298Cata_Descripcion );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual( A487TDet_Cantidad );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva( A487TDet_Cantidad );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo( A66Elem_Consecutivo );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Placa( A490TDet_PlacaNumero );
            AV8SDTDetalle.add(AV9SDTDetalleItem, 0);
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      else if ( GXutil.strcmp(AV11TNov_Nombre_Campo, "TDet_ListId") == 0 )
      {
         GXv_char1[0] = AV10Placa ;
         GXv_int2[0] = AV14Tran_IdEntrada ;
         GXv_int3[0] = AV15TDet_Consecutivo ;
         new com.orions2.buscatranentrada(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3) ;
         pnovedadesdetalle.this.AV10Placa = GXv_char1[0] ;
         pnovedadesdetalle.this.AV14Tran_IdEntrada = GXv_int2[0] ;
         pnovedadesdetalle.this.AV15TDet_Consecutivo = GXv_int3[0] ;
         /* Using cursor P002K4 */
         pr_default.execute(2, new Object[] {new Long(AV14Tran_IdEntrada), new Long(AV15TDet_Consecutivo)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A69TDet_Consecutivo = P002K4_A69TDet_Consecutivo[0] ;
            A46Tran_Id = P002K4_A46Tran_Id[0] ;
            A70TDet_ListId = P002K4_A70TDet_ListId[0] ;
            A492TDet_ListDescripcion = P002K4_A492TDet_ListDescripcion[0] ;
            n492TDet_ListDescripcion = P002K4_n492TDet_ListDescripcion[0] ;
            A494TDet_ValorAtributo = P002K4_A494TDet_ValorAtributo[0] ;
            A492TDet_ListDescripcion = P002K4_A492TDet_ListDescripcion[0] ;
            n492TDet_ListDescripcion = P002K4_n492TDet_ListDescripcion[0] ;
            AV9SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)new com.orions2.SdtSDTDetalle_SDTDetalleItem(remoteHandle, context);
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea( (int)(A70TDet_ListId) );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion( A492TDet_ListDescripcion );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual( A494TDet_ValorAtributo );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo( A494TDet_ValorAtributo );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Placa( AV10Placa );
            AV8SDTDetalle.add(AV9SDTDetalleItem, 0);
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      else if ( GXutil.strcmp(AV11TNov_Nombre_Campo, "Variable_VF") == 0 )
      {
         /* Using cursor P002K5 */
         pr_default.execute(3, new Object[] {AV10Placa});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A67Invd_NumeroPlaca = P002K5_A67Invd_NumeroPlaca[0] ;
            A625Variable_VF = P002K5_A625Variable_VF[0] ;
            n625Variable_VF = P002K5_n625Variable_VF[0] ;
            A66Elem_Consecutivo = P002K5_A66Elem_Consecutivo[0] ;
            A626Variable_I = P002K5_A626Variable_I[0] ;
            n626Variable_I = P002K5_n626Variable_I[0] ;
            A627Variable_N = P002K5_A627Variable_N[0] ;
            n627Variable_N = P002K5_n627Variable_N[0] ;
            AV9SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)new com.orions2.SdtSDTDetalle_SDTDetalleItem(remoteHandle, context);
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Placa( A67Invd_NumeroPlaca );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion( "Valor Futuro" );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual( A625Variable_VF );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo( A625Variable_VF );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo( A66Elem_Consecutivo );
            AV8SDTDetalle.add(AV9SDTDetalleItem, 0);
            AV9SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)new com.orions2.SdtSDTDetalle_SDTDetalleItem(remoteHandle, context);
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Placa( A67Invd_NumeroPlaca );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion( "Taza anual(%)" );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual( DecimalUtil.doubleToDec(A626Variable_I) );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo( DecimalUtil.doubleToDec(A626Variable_I) );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo( A66Elem_Consecutivo );
            AV8SDTDetalle.add(AV9SDTDetalleItem, 0);
            AV9SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)new com.orions2.SdtSDTDetalle_SDTDetalleItem(remoteHandle, context);
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Placa( A67Invd_NumeroPlaca );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion( "Años" );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual( DecimalUtil.doubleToDec(A627Variable_N) );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo( DecimalUtil.doubleToDec(A627Variable_N) );
            AV9SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo( A66Elem_Consecutivo );
            AV8SDTDetalle.add(AV9SDTDetalleItem, 0);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnovedadesdetalle.this.AV11TNov_Nombre_Campo;
      this.aP1[0] = pnovedadesdetalle.this.AV10Placa;
      this.aP2[0] = pnovedadesdetalle.this.AV12Tran_Id;
      this.aP3[0] = pnovedadesdetalle.this.AV8SDTDetalle;
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
      P002K2_A37Cata_Codigo = new String[] {""} ;
      P002K2_A68Invd_PlacaPadre = new String[] {""} ;
      P002K2_n68Invd_PlacaPadre = new boolean[] {false} ;
      P002K2_A67Invd_NumeroPlaca = new String[] {""} ;
      P002K2_A298Cata_Descripcion = new String[] {""} ;
      P002K2_A66Elem_Consecutivo = new String[] {""} ;
      A37Cata_Codigo = "" ;
      A68Invd_PlacaPadre = "" ;
      A67Invd_NumeroPlaca = "" ;
      A298Cata_Descripcion = "" ;
      A66Elem_Consecutivo = "" ;
      AV9SDTDetalleItem = new com.orions2.SdtSDTDetalle_SDTDetalleItem(remoteHandle, context);
      P002K3_A37Cata_Codigo = new String[] {""} ;
      P002K3_A46Tran_Id = new long[1] ;
      P002K3_A69TDet_Consecutivo = new long[1] ;
      P002K3_A66Elem_Consecutivo = new String[] {""} ;
      P002K3_A298Cata_Descripcion = new String[] {""} ;
      P002K3_A487TDet_Cantidad = new long[1] ;
      P002K3_A490TDet_PlacaNumero = new String[] {""} ;
      P002K3_n490TDet_PlacaNumero = new boolean[] {false} ;
      A490TDet_PlacaNumero = "" ;
      GXv_char1 = new String [1] ;
      GXv_int2 = new long [1] ;
      GXv_int3 = new long [1] ;
      P002K4_A69TDet_Consecutivo = new long[1] ;
      P002K4_A46Tran_Id = new long[1] ;
      P002K4_A70TDet_ListId = new long[1] ;
      P002K4_A492TDet_ListDescripcion = new String[] {""} ;
      P002K4_n492TDet_ListDescripcion = new boolean[] {false} ;
      P002K4_A494TDet_ValorAtributo = new String[] {""} ;
      A492TDet_ListDescripcion = "" ;
      A494TDet_ValorAtributo = "" ;
      P002K5_A67Invd_NumeroPlaca = new String[] {""} ;
      P002K5_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002K5_n625Variable_VF = new boolean[] {false} ;
      P002K5_A66Elem_Consecutivo = new String[] {""} ;
      P002K5_A626Variable_I = new short[1] ;
      P002K5_n626Variable_I = new boolean[] {false} ;
      P002K5_A627Variable_N = new short[1] ;
      P002K5_n627Variable_N = new boolean[] {false} ;
      A625Variable_VF = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pnovedadesdetalle__default(),
         new Object[] {
             new Object[] {
            P002K2_A37Cata_Codigo, P002K2_A68Invd_PlacaPadre, P002K2_n68Invd_PlacaPadre, P002K2_A67Invd_NumeroPlaca, P002K2_A298Cata_Descripcion, P002K2_A66Elem_Consecutivo
            }
            , new Object[] {
            P002K3_A37Cata_Codigo, P002K3_A46Tran_Id, P002K3_A69TDet_Consecutivo, P002K3_A66Elem_Consecutivo, P002K3_A298Cata_Descripcion, P002K3_A487TDet_Cantidad, P002K3_A490TDet_PlacaNumero, P002K3_n490TDet_PlacaNumero
            }
            , new Object[] {
            P002K4_A69TDet_Consecutivo, P002K4_A46Tran_Id, P002K4_A70TDet_ListId, P002K4_A492TDet_ListDescripcion, P002K4_n492TDet_ListDescripcion, P002K4_A494TDet_ValorAtributo
            }
            , new Object[] {
            P002K5_A67Invd_NumeroPlaca, P002K5_A625Variable_VF, P002K5_n625Variable_VF, P002K5_A66Elem_Consecutivo, P002K5_A626Variable_I, P002K5_n626Variable_I, P002K5_A627Variable_N, P002K5_n627Variable_N
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A626Variable_I ;
   private short A627Variable_N ;
   private short Gx_err ;
   private long AV12Tran_Id ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long AV14Tran_IdEntrada ;
   private long GXv_int2[] ;
   private long AV15TDet_Consecutivo ;
   private long GXv_int3[] ;
   private long A70TDet_ListId ;
   private java.math.BigDecimal A625Variable_VF ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n492TDet_ListDescripcion ;
   private boolean n625Variable_VF ;
   private boolean n626Variable_I ;
   private boolean n627Variable_N ;
   private String AV11TNov_Nombre_Campo ;
   private String AV10Placa ;
   private String A37Cata_Codigo ;
   private String A68Invd_PlacaPadre ;
   private String A67Invd_NumeroPlaca ;
   private String A298Cata_Descripcion ;
   private String A66Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String A492TDet_ListDescripcion ;
   private String A494TDet_ValorAtributo ;
   private String[] aP0 ;
   private String[] aP1 ;
   private long[] aP2 ;
   private GXBaseCollection<com.orions2.SdtSDTDetalle_SDTDetalleItem>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P002K2_A37Cata_Codigo ;
   private String[] P002K2_A68Invd_PlacaPadre ;
   private boolean[] P002K2_n68Invd_PlacaPadre ;
   private String[] P002K2_A67Invd_NumeroPlaca ;
   private String[] P002K2_A298Cata_Descripcion ;
   private String[] P002K2_A66Elem_Consecutivo ;
   private String[] P002K3_A37Cata_Codigo ;
   private long[] P002K3_A46Tran_Id ;
   private long[] P002K3_A69TDet_Consecutivo ;
   private String[] P002K3_A66Elem_Consecutivo ;
   private String[] P002K3_A298Cata_Descripcion ;
   private long[] P002K3_A487TDet_Cantidad ;
   private String[] P002K3_A490TDet_PlacaNumero ;
   private boolean[] P002K3_n490TDet_PlacaNumero ;
   private long[] P002K4_A69TDet_Consecutivo ;
   private long[] P002K4_A46Tran_Id ;
   private long[] P002K4_A70TDet_ListId ;
   private String[] P002K4_A492TDet_ListDescripcion ;
   private boolean[] P002K4_n492TDet_ListDescripcion ;
   private String[] P002K4_A494TDet_ValorAtributo ;
   private String[] P002K5_A67Invd_NumeroPlaca ;
   private java.math.BigDecimal[] P002K5_A625Variable_VF ;
   private boolean[] P002K5_n625Variable_VF ;
   private String[] P002K5_A66Elem_Consecutivo ;
   private short[] P002K5_A626Variable_I ;
   private boolean[] P002K5_n626Variable_I ;
   private short[] P002K5_A627Variable_N ;
   private boolean[] P002K5_n627Variable_N ;
   private GXBaseCollection<com.orions2.SdtSDTDetalle_SDTDetalleItem> AV8SDTDetalle ;
   private com.orions2.SdtSDTDetalle_SDTDetalleItem AV9SDTDetalleItem ;
}

final  class pnovedadesdetalle__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002K2", "SELECT T2.Cata_Codigo, T1.Invd_PlacaPadre, T1.Invd_NumeroPlaca, T3.Cata_Descripcion, T1.Elem_Consecutivo FROM ((ALM_INVENTARIO_DEVOLUTIVO T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) WHERE T1.Invd_PlacaPadre = ? ORDER BY T1.Invd_PlacaPadre ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002K3", "SELECT T2.Cata_Codigo, T1.Tran_Id, T1.TDet_Consecutivo, T1.Elem_Consecutivo, T3.Cata_Descripcion, T1.TDet_Cantidad, T1.TDet_PlacaNumero FROM ((ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002K4", "SELECT T1.TDet_Consecutivo, T1.Tran_Id, T1.TDet_ListId AS TDet_ListId, T2.List_Descripcion AS TDet_ListDescripcion, T1.TDet_ValorAtributo FROM (ALM_DETALLE_TRANSACCIONATRIBUT T1 INNER JOIN ALM_LISTA_ATRIBUTOS T2 ON T2.List_Id = T1.TDet_ListId) WHERE T1.Tran_Id = ? and T1.TDet_Consecutivo = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002K5", "SELECT Invd_NumeroPlaca, Variable_VF, Elem_Consecutivo, Variable_I, Variable_N FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
      }
   }

}

