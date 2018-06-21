/*
               File: PSalidaDevMultiple
        Description: PSalida Dev Multiple
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:13.76
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psalidadevmultiple extends GXProcedure
{
   public psalidadevmultiple( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psalidadevmultiple.class ), "" );
   }

   public psalidadevmultiple( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GXBaseCollection<com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem> executeUdp( long[] aP0 )
   {
      psalidadevmultiple.this.AV32Tran_Id = aP0[0];
      this.aP0 = aP0;
      psalidadevmultiple.this.AV27SDTInvDevoSel = aP1[0];
      this.aP1 = aP1;
      psalidadevmultiple.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem>()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long[] aP0 ,
                        GXBaseCollection<com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long[] aP0 ,
                             GXBaseCollection<com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem>[] aP1 )
   {
      psalidadevmultiple.this.AV32Tran_Id = aP0[0];
      this.aP0 = aP0;
      psalidadevmultiple.this.AV27SDTInvDevoSel = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV40GXLvl3 = (byte)(0) ;
      /* Using cursor P002J2 */
      pr_default.execute(0, new Object[] {new Long(AV32Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = P002J2_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P002J2_A69TDet_Consecutivo[0] ;
         AV40GXLvl3 = (byte)(1) ;
         AV16TDet_Consecutivo = A69TDet_Consecutivo ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV40GXLvl3 == 0 )
      {
         AV16TDet_Consecutivo = 1 ;
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV27SDTInvDevoSel.size() )
      {
         AV28SDTInvDevoSelItem = (com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)((com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem)AV27SDTInvDevoSel.elementAt(-1+AV41GXV1));
         AV37Seleccion = AV28SDTInvDevoSelItem.getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_seleccion() ;
         if ( GXutil.strcmp(AV37Seleccion, "1") == 0 )
         {
            AV15Placa = AV28SDTInvDevoSelItem.getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Invd_numeroplaca() ;
            AV10Elem_Consecutivo = AV28SDTInvDevoSelItem.getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Elem_consecutivo() ;
            AV9Costo_Total_Dev = AV28SDTInvDevoSelItem.getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Costo_total_dev() ;
            AV24Observaciones = AV28SDTInvDevoSelItem.getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Observaciones() ;
            AV33Tran_IdEntrada = AV28SDTInvDevoSelItem.getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_entrada() ;
            AV23Nro_Linea = AV28SDTInvDevoSelItem.getgxTv_SdtSDTInvDevoSel_SDTInvDevoSelItem_Tran_nrolinea() ;
            AV16TDet_Consecutivo = (long)(AV16TDet_Consecutivo+1) ;
            /* Execute user subroutine: 'VALIDA INGRESO' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(AV36Existe, "NO") == 0 )
            {
               /* Execute user subroutine: 'INVENTARIO' */
               S121 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Execute user subroutine: 'CREA DETALLE' */
               S131 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Execute user subroutine: 'TRANSACCION ENTRADA' */
               S141 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Execute user subroutine: 'VALIDA PLACAS' */
               S151 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
      /* Execute user subroutine: 'ACTUALIZA CABECERA' */
      S161 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'VALIDA INGRESO' Routine */
      AV36Existe = "NO" ;
      /* Using cursor P002J3 */
      pr_default.execute(1, new Object[] {new Long(AV32Tran_Id), AV15Placa});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A490TDet_PlacaNumero = P002J3_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P002J3_n490TDet_PlacaNumero[0] ;
         A46Tran_Id = P002J3_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P002J3_A69TDet_Consecutivo[0] ;
         AV36Existe = "SI" ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'INVENTARIO' Routine */
      AV8Costo_Desmante = DecimalUtil.ZERO ;
      AV17Variable_I = (short)(0) ;
      AV18Variable_N = (short)(0) ;
      AV19Variable_VF = DecimalUtil.ZERO ;
      AV14Otros_Costos_Dev = DecimalUtil.ZERO ;
      AV13Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      AV12Invd_PlacaPadre = "" ;
      AV26PlacaPadre = "" ;
      AV30TDet_EsPadre = "" ;
      AV20EsPlacaPadre = "" ;
      /* Using cursor P002J4 */
      pr_default.execute(2, new Object[] {AV15Placa});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A67Invd_NumeroPlaca = P002J4_A67Invd_NumeroPlaca[0] ;
         A463Invd_Estado = P002J4_A463Invd_Estado[0] ;
         n463Invd_Estado = P002J4_n463Invd_Estado[0] ;
         A624Costo_Desmante = P002J4_A624Costo_Desmante[0] ;
         n624Costo_Desmante = P002J4_n624Costo_Desmante[0] ;
         A626Variable_I = P002J4_A626Variable_I[0] ;
         n626Variable_I = P002J4_n626Variable_I[0] ;
         A627Variable_N = P002J4_A627Variable_N[0] ;
         n627Variable_N = P002J4_n627Variable_N[0] ;
         A625Variable_VF = P002J4_A625Variable_VF[0] ;
         n625Variable_VF = P002J4_n625Variable_VF[0] ;
         A628Otros_Costos_Dev = P002J4_A628Otros_Costos_Dev[0] ;
         n628Otros_Costos_Dev = P002J4_n628Otros_Costos_Dev[0] ;
         A465Invd_ValorAdquisicion = P002J4_A465Invd_ValorAdquisicion[0] ;
         n465Invd_ValorAdquisicion = P002J4_n465Invd_ValorAdquisicion[0] ;
         A68Invd_PlacaPadre = P002J4_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = P002J4_n68Invd_PlacaPadre[0] ;
         A501Invd_EsPlacaPadre = P002J4_A501Invd_EsPlacaPadre[0] ;
         n501Invd_EsPlacaPadre = P002J4_n501Invd_EsPlacaPadre[0] ;
         A66Elem_Consecutivo = P002J4_A66Elem_Consecutivo[0] ;
         A463Invd_Estado = "P" ;
         n463Invd_Estado = false ;
         AV8Costo_Desmante = A624Costo_Desmante ;
         AV17Variable_I = A626Variable_I ;
         AV18Variable_N = A627Variable_N ;
         AV19Variable_VF = A625Variable_VF ;
         AV14Otros_Costos_Dev = A628Otros_Costos_Dev ;
         AV13Invd_ValorAdquisicion = A465Invd_ValorAdquisicion ;
         AV11Invd_NumeroPlaca = A67Invd_NumeroPlaca ;
         AV12Invd_PlacaPadre = A68Invd_PlacaPadre ;
         AV26PlacaPadre = A68Invd_PlacaPadre ;
         AV30TDet_EsPadre = A501Invd_EsPlacaPadre ;
         AV20EsPlacaPadre = A501Invd_EsPlacaPadre ;
         /* Using cursor P002J5 */
         pr_default.execute(3, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'CREA DETALLE' Routine */
      /*
         INSERT RECORD ON TABLE ALM_DETALLE_TRANSACCION

      */
      A46Tran_Id = AV32Tran_Id ;
      A69TDet_Consecutivo = AV16TDet_Consecutivo ;
      A66Elem_Consecutivo = AV10Elem_Consecutivo ;
      A487TDet_Cantidad = 1 ;
      A488TDet_ValorUnitario = AV13Invd_ValorAdquisicion ;
      A490TDet_PlacaNumero = AV11Invd_NumeroPlaca ;
      n490TDet_PlacaNumero = false ;
      A491TDet_PlacaPadre = AV12Invd_PlacaPadre ;
      n491TDet_PlacaPadre = false ;
      A504TDet_Observaciones = AV24Observaciones ;
      n504TDet_Observaciones = false ;
      A505TDet_EsPadre = AV30TDet_EsPadre ;
      A653TDet_Valor_Presente = AV8Costo_Desmante ;
      n653TDet_Valor_Presente = false ;
      A654TDet_Valor_Futuro = AV19Variable_VF ;
      n654TDet_Valor_Futuro = false ;
      A656TDet_Plazo_N = (byte)(AV18Variable_N) ;
      n656TDet_Plazo_N = false ;
      A655TDet_Taza = AV17Variable_I ;
      n655TDet_Taza = false ;
      A657TDet_Otros_Costos = AV14Otros_Costos_Dev ;
      n657TDet_Otros_Costos = false ;
      A489TDet_ValorTotal = AV9Costo_Total_Dev ;
      /* Using cursor P002J6 */
      pr_default.execute(4, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), A66Elem_Consecutivo, new Long(A487TDet_Cantidad), A488TDet_ValorUnitario, A489TDet_ValorTotal, new Boolean(n490TDet_PlacaNumero), A490TDet_PlacaNumero, new Boolean(n504TDet_Observaciones), A504TDet_Observaciones, new Boolean(n491TDet_PlacaPadre), A491TDet_PlacaPadre, A505TDet_EsPadre, new Boolean(n653TDet_Valor_Presente), A653TDet_Valor_Presente, new Boolean(n654TDet_Valor_Futuro), A654TDet_Valor_Futuro, new Boolean(n655TDet_Taza), new Short(A655TDet_Taza), new Boolean(n656TDet_Plazo_N), new Byte(A656TDet_Plazo_N), new Boolean(n657TDet_Otros_Costos), A657TDet_Otros_Costos});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
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
   }

   public void S141( )
   {
      /* 'TRANSACCION ENTRADA' Routine */
      /*
         INSERT RECORD ON TABLE ALM_DET_TRAN_DATOS_SALIDA

      */
      A46Tran_Id = AV32Tran_Id ;
      A69TDet_Consecutivo = AV16TDet_Consecutivo ;
      A71Tran_Entrada = AV33Tran_IdEntrada ;
      A72Nro_Linea = AV23Nro_Linea ;
      A687Tran_Cantidad = 1 ;
      n687Tran_Cantidad = false ;
      /* Using cursor P002J7 */
      pr_default.execute(5, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A71Tran_Entrada), new Integer(A72Nro_Linea), new Boolean(n687Tran_Cantidad), new Integer(A687Tran_Cantidad)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DET_TRAN_DATOS_SALIDA") ;
      if ( (pr_default.getStatus(5) == 1) )
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
   }

   public void S151( )
   {
      /* 'VALIDA PLACAS' Routine */
      if ( GXutil.strcmp(AV20EsPlacaPadre, "SI") == 0 )
      {
         /* Using cursor P002J8 */
         pr_default.execute(6, new Object[] {AV15Placa});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A68Invd_PlacaPadre = P002J8_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P002J8_n68Invd_PlacaPadre[0] ;
            A67Invd_NumeroPlaca = P002J8_A67Invd_NumeroPlaca[0] ;
            A66Elem_Consecutivo = P002J8_A66Elem_Consecutivo[0] ;
            A501Invd_EsPlacaPadre = P002J8_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = P002J8_n501Invd_EsPlacaPadre[0] ;
            A463Invd_Estado = P002J8_A463Invd_Estado[0] ;
            n463Invd_Estado = P002J8_n463Invd_Estado[0] ;
            A465Invd_ValorAdquisicion = P002J8_A465Invd_ValorAdquisicion[0] ;
            n465Invd_ValorAdquisicion = P002J8_n465Invd_ValorAdquisicion[0] ;
            A624Costo_Desmante = P002J8_A624Costo_Desmante[0] ;
            n624Costo_Desmante = P002J8_n624Costo_Desmante[0] ;
            A626Variable_I = P002J8_A626Variable_I[0] ;
            n626Variable_I = P002J8_n626Variable_I[0] ;
            A627Variable_N = P002J8_A627Variable_N[0] ;
            n627Variable_N = P002J8_n627Variable_N[0] ;
            A625Variable_VF = P002J8_A625Variable_VF[0] ;
            n625Variable_VF = P002J8_n625Variable_VF[0] ;
            A628Otros_Costos_Dev = P002J8_A628Otros_Costos_Dev[0] ;
            n628Otros_Costos_Dev = P002J8_n628Otros_Costos_Dev[0] ;
            A629Costo_Total_Dev = P002J8_A629Costo_Total_Dev[0] ;
            AV16TDet_Consecutivo = (long)(AV16TDet_Consecutivo+1) ;
            AV11Invd_NumeroPlaca = A67Invd_NumeroPlaca ;
            AV12Invd_PlacaPadre = A68Invd_PlacaPadre ;
            AV10Elem_Consecutivo = A66Elem_Consecutivo ;
            AV30TDet_EsPadre = A501Invd_EsPlacaPadre ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            AV13Invd_ValorAdquisicion = A465Invd_ValorAdquisicion ;
            AV8Costo_Desmante = A624Costo_Desmante ;
            AV17Variable_I = A626Variable_I ;
            AV18Variable_N = A627Variable_N ;
            AV19Variable_VF = A625Variable_VF ;
            AV14Otros_Costos_Dev = A628Otros_Costos_Dev ;
            AV9Costo_Total_Dev = A629Costo_Total_Dev ;
            GXv_char1[0] = AV11Invd_NumeroPlaca ;
            GXv_char2[0] = AV21Marca ;
            GXv_char3[0] = AV22Modelo ;
            GXv_char4[0] = AV29Serial ;
            GXv_char5[0] = AV25Observaciones1 ;
            GXv_int6[0] = AV33Tran_IdEntrada ;
            GXv_int7[0] = AV23Nro_Linea ;
            new com.orions2.buscaatributos(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_int6, GXv_int7) ;
            psalidadevmultiple.this.AV11Invd_NumeroPlaca = GXv_char1[0] ;
            psalidadevmultiple.this.AV21Marca = GXv_char2[0] ;
            psalidadevmultiple.this.AV22Modelo = GXv_char3[0] ;
            psalidadevmultiple.this.AV29Serial = GXv_char4[0] ;
            psalidadevmultiple.this.AV25Observaciones1 = GXv_char5[0] ;
            psalidadevmultiple.this.AV33Tran_IdEntrada = GXv_int6[0] ;
            psalidadevmultiple.this.AV23Nro_Linea = GXv_int7[0] ;
            /* Execute user subroutine: 'CREA DETALLE' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
            /* Execute user subroutine: 'TRANSACCION ENTRADA' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               returnInSub = true;
               if (true) return;
            }
            /* Using cursor P002J9 */
            pr_default.execute(7, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
      }
      if ( ! (GXutil.strcmp("", AV26PlacaPadre)==0) )
      {
         /* Using cursor P002J10 */
         pr_default.execute(8, new Object[] {AV26PlacaPadre});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A67Invd_NumeroPlaca = P002J10_A67Invd_NumeroPlaca[0] ;
            A465Invd_ValorAdquisicion = P002J10_A465Invd_ValorAdquisicion[0] ;
            n465Invd_ValorAdquisicion = P002J10_n465Invd_ValorAdquisicion[0] ;
            A68Invd_PlacaPadre = P002J10_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P002J10_n68Invd_PlacaPadre[0] ;
            A66Elem_Consecutivo = P002J10_A66Elem_Consecutivo[0] ;
            A501Invd_EsPlacaPadre = P002J10_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = P002J10_n501Invd_EsPlacaPadre[0] ;
            A463Invd_Estado = P002J10_A463Invd_Estado[0] ;
            n463Invd_Estado = P002J10_n463Invd_Estado[0] ;
            A624Costo_Desmante = P002J10_A624Costo_Desmante[0] ;
            n624Costo_Desmante = P002J10_n624Costo_Desmante[0] ;
            A626Variable_I = P002J10_A626Variable_I[0] ;
            n626Variable_I = P002J10_n626Variable_I[0] ;
            A627Variable_N = P002J10_A627Variable_N[0] ;
            n627Variable_N = P002J10_n627Variable_N[0] ;
            A625Variable_VF = P002J10_A625Variable_VF[0] ;
            n625Variable_VF = P002J10_n625Variable_VF[0] ;
            A628Otros_Costos_Dev = P002J10_A628Otros_Costos_Dev[0] ;
            n628Otros_Costos_Dev = P002J10_n628Otros_Costos_Dev[0] ;
            A629Costo_Total_Dev = P002J10_A629Costo_Total_Dev[0] ;
            AV16TDet_Consecutivo = (long)(AV16TDet_Consecutivo+1) ;
            AV13Invd_ValorAdquisicion = A465Invd_ValorAdquisicion ;
            AV11Invd_NumeroPlaca = A67Invd_NumeroPlaca ;
            AV12Invd_PlacaPadre = A68Invd_PlacaPadre ;
            AV10Elem_Consecutivo = A66Elem_Consecutivo ;
            AV30TDet_EsPadre = A501Invd_EsPlacaPadre ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            AV8Costo_Desmante = A624Costo_Desmante ;
            AV17Variable_I = A626Variable_I ;
            AV18Variable_N = A627Variable_N ;
            AV19Variable_VF = A625Variable_VF ;
            AV14Otros_Costos_Dev = A628Otros_Costos_Dev ;
            AV9Costo_Total_Dev = A629Costo_Total_Dev ;
            GXv_char5[0] = AV11Invd_NumeroPlaca ;
            GXv_char4[0] = AV21Marca ;
            GXv_char3[0] = AV22Modelo ;
            GXv_char2[0] = AV29Serial ;
            GXv_char1[0] = AV25Observaciones1 ;
            GXv_int6[0] = AV33Tran_IdEntrada ;
            GXv_int7[0] = AV23Nro_Linea ;
            new com.orions2.buscaatributos(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2, GXv_char1, GXv_int6, GXv_int7) ;
            psalidadevmultiple.this.AV11Invd_NumeroPlaca = GXv_char5[0] ;
            psalidadevmultiple.this.AV21Marca = GXv_char4[0] ;
            psalidadevmultiple.this.AV22Modelo = GXv_char3[0] ;
            psalidadevmultiple.this.AV29Serial = GXv_char2[0] ;
            psalidadevmultiple.this.AV25Observaciones1 = GXv_char1[0] ;
            psalidadevmultiple.this.AV33Tran_IdEntrada = GXv_int6[0] ;
            psalidadevmultiple.this.AV23Nro_Linea = GXv_int7[0] ;
            /* Execute user subroutine: 'CREA DETALLE' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(8);
               returnInSub = true;
               if (true) return;
            }
            /* Execute user subroutine: 'TRANSACCION ENTRADA' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(8);
               returnInSub = true;
               if (true) return;
            }
            /* Using cursor P002J11 */
            pr_default.execute(9, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
         /* Using cursor P002J12 */
         pr_default.execute(10, new Object[] {AV26PlacaPadre});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A68Invd_PlacaPadre = P002J12_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P002J12_n68Invd_PlacaPadre[0] ;
            A67Invd_NumeroPlaca = P002J12_A67Invd_NumeroPlaca[0] ;
            A465Invd_ValorAdquisicion = P002J12_A465Invd_ValorAdquisicion[0] ;
            n465Invd_ValorAdquisicion = P002J12_n465Invd_ValorAdquisicion[0] ;
            A66Elem_Consecutivo = P002J12_A66Elem_Consecutivo[0] ;
            A501Invd_EsPlacaPadre = P002J12_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = P002J12_n501Invd_EsPlacaPadre[0] ;
            A463Invd_Estado = P002J12_A463Invd_Estado[0] ;
            n463Invd_Estado = P002J12_n463Invd_Estado[0] ;
            A624Costo_Desmante = P002J12_A624Costo_Desmante[0] ;
            n624Costo_Desmante = P002J12_n624Costo_Desmante[0] ;
            A626Variable_I = P002J12_A626Variable_I[0] ;
            n626Variable_I = P002J12_n626Variable_I[0] ;
            A627Variable_N = P002J12_A627Variable_N[0] ;
            n627Variable_N = P002J12_n627Variable_N[0] ;
            A625Variable_VF = P002J12_A625Variable_VF[0] ;
            n625Variable_VF = P002J12_n625Variable_VF[0] ;
            A628Otros_Costos_Dev = P002J12_A628Otros_Costos_Dev[0] ;
            n628Otros_Costos_Dev = P002J12_n628Otros_Costos_Dev[0] ;
            A629Costo_Total_Dev = P002J12_A629Costo_Total_Dev[0] ;
            if ( GXutil.strcmp(A67Invd_NumeroPlaca, AV15Placa) != 0 )
            {
               AV16TDet_Consecutivo = (long)(AV16TDet_Consecutivo+1) ;
               AV13Invd_ValorAdquisicion = A465Invd_ValorAdquisicion ;
               AV11Invd_NumeroPlaca = A67Invd_NumeroPlaca ;
               AV12Invd_PlacaPadre = A68Invd_PlacaPadre ;
               AV10Elem_Consecutivo = A66Elem_Consecutivo ;
               AV30TDet_EsPadre = A501Invd_EsPlacaPadre ;
               A463Invd_Estado = "P" ;
               n463Invd_Estado = false ;
               AV8Costo_Desmante = A624Costo_Desmante ;
               AV17Variable_I = A626Variable_I ;
               AV18Variable_N = A627Variable_N ;
               AV19Variable_VF = A625Variable_VF ;
               AV14Otros_Costos_Dev = A628Otros_Costos_Dev ;
               AV9Costo_Total_Dev = A629Costo_Total_Dev ;
               GXv_char5[0] = AV11Invd_NumeroPlaca ;
               GXv_char4[0] = AV21Marca ;
               GXv_char3[0] = AV22Modelo ;
               GXv_char2[0] = AV29Serial ;
               GXv_char1[0] = AV25Observaciones1 ;
               GXv_int6[0] = AV33Tran_IdEntrada ;
               GXv_int7[0] = AV23Nro_Linea ;
               new com.orions2.buscaatributos(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2, GXv_char1, GXv_int6, GXv_int7) ;
               psalidadevmultiple.this.AV11Invd_NumeroPlaca = GXv_char5[0] ;
               psalidadevmultiple.this.AV21Marca = GXv_char4[0] ;
               psalidadevmultiple.this.AV22Modelo = GXv_char3[0] ;
               psalidadevmultiple.this.AV29Serial = GXv_char2[0] ;
               psalidadevmultiple.this.AV25Observaciones1 = GXv_char1[0] ;
               psalidadevmultiple.this.AV33Tran_IdEntrada = GXv_int6[0] ;
               psalidadevmultiple.this.AV23Nro_Linea = GXv_int7[0] ;
               /* Execute user subroutine: 'CREA DETALLE' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(10);
                  returnInSub = true;
                  if (true) return;
               }
               /* Execute user subroutine: 'TRANSACCION ENTRADA' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(10);
                  returnInSub = true;
                  if (true) return;
               }
            }
            /* Using cursor P002J13 */
            pr_default.execute(11, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            pr_default.readNext(10);
         }
         pr_default.close(10);
      }
   }

   public void S161( )
   {
      /* 'ACTUALIZA CABECERA' Routine */
      /* Optimized group. */
      /* Using cursor P002J14 */
      pr_default.execute(12, new Object[] {new Long(AV32Tran_Id)});
      c489TDet_ValorTotal = P002J14_A489TDet_ValorTotal[0] ;
      pr_default.close(12);
      AV31TDet_ValorTotal = AV31TDet_ValorTotal.add(c489TDet_ValorTotal) ;
      /* End optimized group. */
      /* Optimized UPDATE. */
      /* Using cursor P002J15 */
      pr_default.execute(13, new Object[] {new Boolean(n483Tran_ValorTransaccion), AV31TDet_ValorTotal, new Long(AV32Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "psalidadevmultiple");
   }

   protected void cleanup( )
   {
      this.aP0[0] = psalidadevmultiple.this.AV32Tran_Id;
      this.aP1[0] = psalidadevmultiple.this.AV27SDTInvDevoSel;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "psalidadevmultiple");
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
      P002J2_A46Tran_Id = new long[1] ;
      P002J2_A69TDet_Consecutivo = new long[1] ;
      AV28SDTInvDevoSelItem = new com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem(remoteHandle, context);
      AV37Seleccion = "" ;
      AV15Placa = "" ;
      AV10Elem_Consecutivo = "" ;
      AV9Costo_Total_Dev = DecimalUtil.ZERO ;
      AV24Observaciones = "" ;
      AV36Existe = "" ;
      P002J3_A490TDet_PlacaNumero = new String[] {""} ;
      P002J3_n490TDet_PlacaNumero = new boolean[] {false} ;
      P002J3_A46Tran_Id = new long[1] ;
      P002J3_A69TDet_Consecutivo = new long[1] ;
      A490TDet_PlacaNumero = "" ;
      AV8Costo_Desmante = DecimalUtil.ZERO ;
      AV19Variable_VF = DecimalUtil.ZERO ;
      AV14Otros_Costos_Dev = DecimalUtil.ZERO ;
      AV13Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      AV12Invd_PlacaPadre = "" ;
      AV26PlacaPadre = "" ;
      AV30TDet_EsPadre = "" ;
      AV20EsPlacaPadre = "" ;
      P002J4_A67Invd_NumeroPlaca = new String[] {""} ;
      P002J4_A463Invd_Estado = new String[] {""} ;
      P002J4_n463Invd_Estado = new boolean[] {false} ;
      P002J4_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J4_n624Costo_Desmante = new boolean[] {false} ;
      P002J4_A626Variable_I = new short[1] ;
      P002J4_n626Variable_I = new boolean[] {false} ;
      P002J4_A627Variable_N = new short[1] ;
      P002J4_n627Variable_N = new boolean[] {false} ;
      P002J4_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J4_n625Variable_VF = new boolean[] {false} ;
      P002J4_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J4_n628Otros_Costos_Dev = new boolean[] {false} ;
      P002J4_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J4_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      P002J4_A68Invd_PlacaPadre = new String[] {""} ;
      P002J4_n68Invd_PlacaPadre = new boolean[] {false} ;
      P002J4_A501Invd_EsPlacaPadre = new String[] {""} ;
      P002J4_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P002J4_A66Elem_Consecutivo = new String[] {""} ;
      A67Invd_NumeroPlaca = "" ;
      A463Invd_Estado = "" ;
      A624Costo_Desmante = DecimalUtil.ZERO ;
      A625Variable_VF = DecimalUtil.ZERO ;
      A628Otros_Costos_Dev = DecimalUtil.ZERO ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      A68Invd_PlacaPadre = "" ;
      A501Invd_EsPlacaPadre = "" ;
      A66Elem_Consecutivo = "" ;
      AV11Invd_NumeroPlaca = "" ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A491TDet_PlacaPadre = "" ;
      A504TDet_Observaciones = "" ;
      A505TDet_EsPadre = "" ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P002J8_A68Invd_PlacaPadre = new String[] {""} ;
      P002J8_n68Invd_PlacaPadre = new boolean[] {false} ;
      P002J8_A67Invd_NumeroPlaca = new String[] {""} ;
      P002J8_A66Elem_Consecutivo = new String[] {""} ;
      P002J8_A501Invd_EsPlacaPadre = new String[] {""} ;
      P002J8_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P002J8_A463Invd_Estado = new String[] {""} ;
      P002J8_n463Invd_Estado = new boolean[] {false} ;
      P002J8_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J8_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      P002J8_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J8_n624Costo_Desmante = new boolean[] {false} ;
      P002J8_A626Variable_I = new short[1] ;
      P002J8_n626Variable_I = new boolean[] {false} ;
      P002J8_A627Variable_N = new short[1] ;
      P002J8_n627Variable_N = new boolean[] {false} ;
      P002J8_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J8_n625Variable_VF = new boolean[] {false} ;
      P002J8_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J8_n628Otros_Costos_Dev = new boolean[] {false} ;
      P002J8_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      AV21Marca = "" ;
      AV22Modelo = "" ;
      AV29Serial = "" ;
      AV25Observaciones1 = "" ;
      P002J10_A67Invd_NumeroPlaca = new String[] {""} ;
      P002J10_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J10_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      P002J10_A68Invd_PlacaPadre = new String[] {""} ;
      P002J10_n68Invd_PlacaPadre = new boolean[] {false} ;
      P002J10_A66Elem_Consecutivo = new String[] {""} ;
      P002J10_A501Invd_EsPlacaPadre = new String[] {""} ;
      P002J10_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P002J10_A463Invd_Estado = new String[] {""} ;
      P002J10_n463Invd_Estado = new boolean[] {false} ;
      P002J10_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J10_n624Costo_Desmante = new boolean[] {false} ;
      P002J10_A626Variable_I = new short[1] ;
      P002J10_n626Variable_I = new boolean[] {false} ;
      P002J10_A627Variable_N = new short[1] ;
      P002J10_n627Variable_N = new boolean[] {false} ;
      P002J10_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J10_n625Variable_VF = new boolean[] {false} ;
      P002J10_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J10_n628Otros_Costos_Dev = new boolean[] {false} ;
      P002J10_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J12_A68Invd_PlacaPadre = new String[] {""} ;
      P002J12_n68Invd_PlacaPadre = new boolean[] {false} ;
      P002J12_A67Invd_NumeroPlaca = new String[] {""} ;
      P002J12_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J12_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      P002J12_A66Elem_Consecutivo = new String[] {""} ;
      P002J12_A501Invd_EsPlacaPadre = new String[] {""} ;
      P002J12_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P002J12_A463Invd_Estado = new String[] {""} ;
      P002J12_n463Invd_Estado = new boolean[] {false} ;
      P002J12_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J12_n624Costo_Desmante = new boolean[] {false} ;
      P002J12_A626Variable_I = new short[1] ;
      P002J12_n626Variable_I = new boolean[] {false} ;
      P002J12_A627Variable_N = new short[1] ;
      P002J12_n627Variable_N = new boolean[] {false} ;
      P002J12_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J12_n625Variable_VF = new boolean[] {false} ;
      P002J12_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002J12_n628Otros_Costos_Dev = new boolean[] {false} ;
      P002J12_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_char5 = new String [1] ;
      GXv_char4 = new String [1] ;
      GXv_char3 = new String [1] ;
      GXv_char2 = new String [1] ;
      GXv_char1 = new String [1] ;
      GXv_int6 = new long [1] ;
      GXv_int7 = new int [1] ;
      c489TDet_ValorTotal = DecimalUtil.ZERO ;
      P002J14_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV31TDet_ValorTotal = DecimalUtil.ZERO ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.psalidadevmultiple__default(),
         new Object[] {
             new Object[] {
            P002J2_A46Tran_Id, P002J2_A69TDet_Consecutivo
            }
            , new Object[] {
            P002J3_A490TDet_PlacaNumero, P002J3_n490TDet_PlacaNumero, P002J3_A46Tran_Id, P002J3_A69TDet_Consecutivo
            }
            , new Object[] {
            P002J4_A67Invd_NumeroPlaca, P002J4_A463Invd_Estado, P002J4_n463Invd_Estado, P002J4_A624Costo_Desmante, P002J4_n624Costo_Desmante, P002J4_A626Variable_I, P002J4_n626Variable_I, P002J4_A627Variable_N, P002J4_n627Variable_N, P002J4_A625Variable_VF,
            P002J4_n625Variable_VF, P002J4_A628Otros_Costos_Dev, P002J4_n628Otros_Costos_Dev, P002J4_A465Invd_ValorAdquisicion, P002J4_n465Invd_ValorAdquisicion, P002J4_A68Invd_PlacaPadre, P002J4_n68Invd_PlacaPadre, P002J4_A501Invd_EsPlacaPadre, P002J4_n501Invd_EsPlacaPadre, P002J4_A66Elem_Consecutivo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P002J8_A68Invd_PlacaPadre, P002J8_n68Invd_PlacaPadre, P002J8_A67Invd_NumeroPlaca, P002J8_A66Elem_Consecutivo, P002J8_A501Invd_EsPlacaPadre, P002J8_n501Invd_EsPlacaPadre, P002J8_A463Invd_Estado, P002J8_n463Invd_Estado, P002J8_A465Invd_ValorAdquisicion, P002J8_n465Invd_ValorAdquisicion,
            P002J8_A624Costo_Desmante, P002J8_n624Costo_Desmante, P002J8_A626Variable_I, P002J8_n626Variable_I, P002J8_A627Variable_N, P002J8_n627Variable_N, P002J8_A625Variable_VF, P002J8_n625Variable_VF, P002J8_A628Otros_Costos_Dev, P002J8_n628Otros_Costos_Dev,
            P002J8_A629Costo_Total_Dev
            }
            , new Object[] {
            }
            , new Object[] {
            P002J10_A67Invd_NumeroPlaca, P002J10_A465Invd_ValorAdquisicion, P002J10_n465Invd_ValorAdquisicion, P002J10_A68Invd_PlacaPadre, P002J10_n68Invd_PlacaPadre, P002J10_A66Elem_Consecutivo, P002J10_A501Invd_EsPlacaPadre, P002J10_n501Invd_EsPlacaPadre, P002J10_A463Invd_Estado, P002J10_n463Invd_Estado,
            P002J10_A624Costo_Desmante, P002J10_n624Costo_Desmante, P002J10_A626Variable_I, P002J10_n626Variable_I, P002J10_A627Variable_N, P002J10_n627Variable_N, P002J10_A625Variable_VF, P002J10_n625Variable_VF, P002J10_A628Otros_Costos_Dev, P002J10_n628Otros_Costos_Dev,
            P002J10_A629Costo_Total_Dev
            }
            , new Object[] {
            }
            , new Object[] {
            P002J12_A68Invd_PlacaPadre, P002J12_n68Invd_PlacaPadre, P002J12_A67Invd_NumeroPlaca, P002J12_A465Invd_ValorAdquisicion, P002J12_n465Invd_ValorAdquisicion, P002J12_A66Elem_Consecutivo, P002J12_A501Invd_EsPlacaPadre, P002J12_n501Invd_EsPlacaPadre, P002J12_A463Invd_Estado, P002J12_n463Invd_Estado,
            P002J12_A624Costo_Desmante, P002J12_n624Costo_Desmante, P002J12_A626Variable_I, P002J12_n626Variable_I, P002J12_A627Variable_N, P002J12_n627Variable_N, P002J12_A625Variable_VF, P002J12_n625Variable_VF, P002J12_A628Otros_Costos_Dev, P002J12_n628Otros_Costos_Dev,
            P002J12_A629Costo_Total_Dev
            }
            , new Object[] {
            }
            , new Object[] {
            P002J14_A489TDet_ValorTotal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV40GXLvl3 ;
   private byte A656TDet_Plazo_N ;
   private short AV17Variable_I ;
   private short AV18Variable_N ;
   private short A626Variable_I ;
   private short A627Variable_N ;
   private short A655TDet_Taza ;
   private short Gx_err ;
   private int AV41GXV1 ;
   private int AV23Nro_Linea ;
   private int GX_INS12 ;
   private int GX_INS14 ;
   private int A72Nro_Linea ;
   private int A687Tran_Cantidad ;
   private int GXv_int7[] ;
   private long AV32Tran_Id ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long AV16TDet_Consecutivo ;
   private long AV33Tran_IdEntrada ;
   private long A487TDet_Cantidad ;
   private long A71Tran_Entrada ;
   private long GXv_int6[] ;
   private java.math.BigDecimal AV9Costo_Total_Dev ;
   private java.math.BigDecimal AV8Costo_Desmante ;
   private java.math.BigDecimal AV19Variable_VF ;
   private java.math.BigDecimal AV14Otros_Costos_Dev ;
   private java.math.BigDecimal AV13Invd_ValorAdquisicion ;
   private java.math.BigDecimal A624Costo_Desmante ;
   private java.math.BigDecimal A625Variable_VF ;
   private java.math.BigDecimal A628Otros_Costos_Dev ;
   private java.math.BigDecimal A465Invd_ValorAdquisicion ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal A654TDet_Valor_Futuro ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
   private java.math.BigDecimal c489TDet_ValorTotal ;
   private java.math.BigDecimal AV31TDet_ValorTotal ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private String scmdbuf ;
   private String AV37Seleccion ;
   private String AV36Existe ;
   private String AV20EsPlacaPadre ;
   private String A501Invd_EsPlacaPadre ;
   private String Gx_emsg ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private boolean returnInSub ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n463Invd_Estado ;
   private boolean n624Costo_Desmante ;
   private boolean n626Variable_I ;
   private boolean n627Variable_N ;
   private boolean n625Variable_VF ;
   private boolean n628Otros_Costos_Dev ;
   private boolean n465Invd_ValorAdquisicion ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n504TDet_Observaciones ;
   private boolean n653TDet_Valor_Presente ;
   private boolean n654TDet_Valor_Futuro ;
   private boolean n656TDet_Plazo_N ;
   private boolean n655TDet_Taza ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n687Tran_Cantidad ;
   private boolean n483Tran_ValorTransaccion ;
   private String AV24Observaciones ;
   private String AV15Placa ;
   private String AV10Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String AV12Invd_PlacaPadre ;
   private String AV26PlacaPadre ;
   private String AV30TDet_EsPadre ;
   private String A67Invd_NumeroPlaca ;
   private String A463Invd_Estado ;
   private String A68Invd_PlacaPadre ;
   private String A66Elem_Consecutivo ;
   private String AV11Invd_NumeroPlaca ;
   private String A491TDet_PlacaPadre ;
   private String A504TDet_Observaciones ;
   private String A505TDet_EsPadre ;
   private String AV21Marca ;
   private String AV22Modelo ;
   private String AV29Serial ;
   private String AV25Observaciones1 ;
   private long[] aP0 ;
   private GXBaseCollection<com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P002J2_A46Tran_Id ;
   private long[] P002J2_A69TDet_Consecutivo ;
   private String[] P002J3_A490TDet_PlacaNumero ;
   private boolean[] P002J3_n490TDet_PlacaNumero ;
   private long[] P002J3_A46Tran_Id ;
   private long[] P002J3_A69TDet_Consecutivo ;
   private String[] P002J4_A67Invd_NumeroPlaca ;
   private String[] P002J4_A463Invd_Estado ;
   private boolean[] P002J4_n463Invd_Estado ;
   private java.math.BigDecimal[] P002J4_A624Costo_Desmante ;
   private boolean[] P002J4_n624Costo_Desmante ;
   private short[] P002J4_A626Variable_I ;
   private boolean[] P002J4_n626Variable_I ;
   private short[] P002J4_A627Variable_N ;
   private boolean[] P002J4_n627Variable_N ;
   private java.math.BigDecimal[] P002J4_A625Variable_VF ;
   private boolean[] P002J4_n625Variable_VF ;
   private java.math.BigDecimal[] P002J4_A628Otros_Costos_Dev ;
   private boolean[] P002J4_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] P002J4_A465Invd_ValorAdquisicion ;
   private boolean[] P002J4_n465Invd_ValorAdquisicion ;
   private String[] P002J4_A68Invd_PlacaPadre ;
   private boolean[] P002J4_n68Invd_PlacaPadre ;
   private String[] P002J4_A501Invd_EsPlacaPadre ;
   private boolean[] P002J4_n501Invd_EsPlacaPadre ;
   private String[] P002J4_A66Elem_Consecutivo ;
   private String[] P002J8_A68Invd_PlacaPadre ;
   private boolean[] P002J8_n68Invd_PlacaPadre ;
   private String[] P002J8_A67Invd_NumeroPlaca ;
   private String[] P002J8_A66Elem_Consecutivo ;
   private String[] P002J8_A501Invd_EsPlacaPadre ;
   private boolean[] P002J8_n501Invd_EsPlacaPadre ;
   private String[] P002J8_A463Invd_Estado ;
   private boolean[] P002J8_n463Invd_Estado ;
   private java.math.BigDecimal[] P002J8_A465Invd_ValorAdquisicion ;
   private boolean[] P002J8_n465Invd_ValorAdquisicion ;
   private java.math.BigDecimal[] P002J8_A624Costo_Desmante ;
   private boolean[] P002J8_n624Costo_Desmante ;
   private short[] P002J8_A626Variable_I ;
   private boolean[] P002J8_n626Variable_I ;
   private short[] P002J8_A627Variable_N ;
   private boolean[] P002J8_n627Variable_N ;
   private java.math.BigDecimal[] P002J8_A625Variable_VF ;
   private boolean[] P002J8_n625Variable_VF ;
   private java.math.BigDecimal[] P002J8_A628Otros_Costos_Dev ;
   private boolean[] P002J8_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] P002J8_A629Costo_Total_Dev ;
   private String[] P002J10_A67Invd_NumeroPlaca ;
   private java.math.BigDecimal[] P002J10_A465Invd_ValorAdquisicion ;
   private boolean[] P002J10_n465Invd_ValorAdquisicion ;
   private String[] P002J10_A68Invd_PlacaPadre ;
   private boolean[] P002J10_n68Invd_PlacaPadre ;
   private String[] P002J10_A66Elem_Consecutivo ;
   private String[] P002J10_A501Invd_EsPlacaPadre ;
   private boolean[] P002J10_n501Invd_EsPlacaPadre ;
   private String[] P002J10_A463Invd_Estado ;
   private boolean[] P002J10_n463Invd_Estado ;
   private java.math.BigDecimal[] P002J10_A624Costo_Desmante ;
   private boolean[] P002J10_n624Costo_Desmante ;
   private short[] P002J10_A626Variable_I ;
   private boolean[] P002J10_n626Variable_I ;
   private short[] P002J10_A627Variable_N ;
   private boolean[] P002J10_n627Variable_N ;
   private java.math.BigDecimal[] P002J10_A625Variable_VF ;
   private boolean[] P002J10_n625Variable_VF ;
   private java.math.BigDecimal[] P002J10_A628Otros_Costos_Dev ;
   private boolean[] P002J10_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] P002J10_A629Costo_Total_Dev ;
   private String[] P002J12_A68Invd_PlacaPadre ;
   private boolean[] P002J12_n68Invd_PlacaPadre ;
   private String[] P002J12_A67Invd_NumeroPlaca ;
   private java.math.BigDecimal[] P002J12_A465Invd_ValorAdquisicion ;
   private boolean[] P002J12_n465Invd_ValorAdquisicion ;
   private String[] P002J12_A66Elem_Consecutivo ;
   private String[] P002J12_A501Invd_EsPlacaPadre ;
   private boolean[] P002J12_n501Invd_EsPlacaPadre ;
   private String[] P002J12_A463Invd_Estado ;
   private boolean[] P002J12_n463Invd_Estado ;
   private java.math.BigDecimal[] P002J12_A624Costo_Desmante ;
   private boolean[] P002J12_n624Costo_Desmante ;
   private short[] P002J12_A626Variable_I ;
   private boolean[] P002J12_n626Variable_I ;
   private short[] P002J12_A627Variable_N ;
   private boolean[] P002J12_n627Variable_N ;
   private java.math.BigDecimal[] P002J12_A625Variable_VF ;
   private boolean[] P002J12_n625Variable_VF ;
   private java.math.BigDecimal[] P002J12_A628Otros_Costos_Dev ;
   private boolean[] P002J12_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] P002J12_A629Costo_Total_Dev ;
   private java.math.BigDecimal[] P002J14_A489TDet_ValorTotal ;
   private GXBaseCollection<com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem> AV27SDTInvDevoSel ;
   private com.orions2.SdtSDTInvDevoSel_SDTInvDevoSelItem AV28SDTInvDevoSelItem ;
}

final  class psalidadevmultiple__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002J2", "SELECT * FROM (SELECT Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id DESC, TDet_Consecutivo DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P002J3", "SELECT TDet_PlacaNumero, Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? and TDet_PlacaNumero = ? ORDER BY Tran_Id, TDet_PlacaNumero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P002J4", "SELECT Invd_NumeroPlaca, Invd_Estado, Costo_Desmante, Variable_I, Variable_N, Variable_VF, Otros_Costos_Dev, Invd_ValorAdquisicion, Invd_PlacaPadre, Invd_EsPlacaPadre, Elem_Consecutivo FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P002J5", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new UpdateCursor("P002J6", "INSERT INTO ALM_DETALLE_TRANSACCION(Tran_Id, TDet_Consecutivo, Elem_Consecutivo, TDet_Cantidad, TDet_ValorUnitario, TDet_ValorTotal, TDet_PlacaNumero, TDet_Observaciones, TDet_PlacaPadre, TDet_EsPadre, TDet_Valor_Presente, TDet_Valor_Futuro, TDet_Taza, TDet_Plazo_N, TDet_Otros_Costos, TDet_Atributos, TDet_Agrupado, TDet_PlacaRecuperada) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new UpdateCursor("P002J7", "INSERT INTO ALM_DET_TRAN_DATOS_SALIDA(Tran_Id, TDet_Consecutivo, Tran_Entrada, Nro_Linea, Tran_Cantidad) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DET_TRAN_DATOS_SALIDA")
         ,new ForEachCursor("P002J8", "SELECT Invd_PlacaPadre, Invd_NumeroPlaca, Elem_Consecutivo, Invd_EsPlacaPadre, Invd_Estado, Invd_ValorAdquisicion, Costo_Desmante, Variable_I, Variable_N, Variable_VF, Otros_Costos_Dev, Costo_Total_Dev FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_PlacaPadre = ? ORDER BY Invd_PlacaPadre  FOR UPDATE OF Invd_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P002J9", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P002J10", "SELECT Invd_NumeroPlaca, Invd_ValorAdquisicion, Invd_PlacaPadre, Elem_Consecutivo, Invd_EsPlacaPadre, Invd_Estado, Costo_Desmante, Variable_I, Variable_N, Variable_VF, Otros_Costos_Dev, Costo_Total_Dev FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P002J11", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P002J12", "SELECT Invd_PlacaPadre, Invd_NumeroPlaca, Invd_ValorAdquisicion, Elem_Consecutivo, Invd_EsPlacaPadre, Invd_Estado, Costo_Desmante, Variable_I, Variable_N, Variable_VF, Otros_Costos_Dev, Costo_Total_Dev FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_PlacaPadre = ? ORDER BY Invd_PlacaPadre  FOR UPDATE OF Invd_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P002J13", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P002J14", "SELECT SUM(TDet_ValorTotal) FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P002J15", "UPDATE ALM_TRANSACCION SET Tran_ValorTransaccion=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getString(4, 2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[6])[0] = rslt.getString(5, 2) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[6])[0] = rslt.getString(5, 2) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2) ;
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2) ;
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
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               stmt.setVarchar(2, (String)parms[2], 9, false);
               stmt.setVarchar(3, (String)parms[3], 30, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               stmt.setVarchar(3, (String)parms[2], 9, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[9], 200);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[11], 30);
               }
               stmt.setVarchar(10, (String)parms[12], 2, false);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[20]).byteValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[22], 2);
               }
               return;
            case 5 :
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
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               stmt.setVarchar(2, (String)parms[2], 9, false);
               stmt.setVarchar(3, (String)parms[3], 30, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               stmt.setVarchar(2, (String)parms[2], 9, false);
               stmt.setVarchar(3, (String)parms[3], 30, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               stmt.setVarchar(2, (String)parms[2], 9, false);
               stmt.setVarchar(3, (String)parms[3], 30, false);
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
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

