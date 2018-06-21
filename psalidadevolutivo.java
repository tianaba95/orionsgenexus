/*
               File: PSalidaDevolutivo
        Description: PSalida Devolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:10:59.87
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psalidadevolutivo extends GXProcedure
{
   public psalidadevolutivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psalidadevolutivo.class ), "" );
   }

   public psalidadevolutivo( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public int executeUdp( long[] aP0 ,
                          String[] aP1 ,
                          String[] aP2 ,
                          java.math.BigDecimal[] aP3 ,
                          String[] aP4 ,
                          String[] aP5 ,
                          long[] aP6 )
   {
      psalidadevolutivo.this.AV17Tran_Id = aP0[0];
      this.aP0 = aP0;
      psalidadevolutivo.this.AV15Placa = aP1[0];
      this.aP1 = aP1;
      psalidadevolutivo.this.AV23PlacaPadre = aP2[0];
      this.aP2 = aP2;
      psalidadevolutivo.this.AV27ValorAdquisicion = aP3[0];
      this.aP3 = aP3;
      psalidadevolutivo.this.AV22Observaciones = aP4[0];
      this.aP4 = aP4;
      psalidadevolutivo.this.AV21EsPlacaPadre = aP5[0];
      this.aP5 = aP5;
      psalidadevolutivo.this.AV25Tran_IdEntrada = aP6[0];
      this.aP6 = aP6;
      psalidadevolutivo.this.AV28Nro_Linea = aP7[0];
      this.aP7 = aP7;
      psalidadevolutivo.this.aP7 = new int[] {0};
      initialize();
      privateExecute();
      return aP7[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        long[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             long[] aP6 ,
                             int[] aP7 )
   {
      psalidadevolutivo.this.AV17Tran_Id = aP0[0];
      this.aP0 = aP0;
      psalidadevolutivo.this.AV15Placa = aP1[0];
      this.aP1 = aP1;
      psalidadevolutivo.this.AV23PlacaPadre = aP2[0];
      this.aP2 = aP2;
      psalidadevolutivo.this.AV27ValorAdquisicion = aP3[0];
      this.aP3 = aP3;
      psalidadevolutivo.this.AV22Observaciones = aP4[0];
      this.aP4 = aP4;
      psalidadevolutivo.this.AV21EsPlacaPadre = aP5[0];
      this.aP5 = aP5;
      psalidadevolutivo.this.AV25Tran_IdEntrada = aP6[0];
      this.aP6 = aP6;
      psalidadevolutivo.this.AV28Nro_Linea = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41GXLvl3 = (byte)(0) ;
      /* Using cursor P00152 */
      pr_default.execute(0, new Object[] {new Long(AV17Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = P00152_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P00152_A69TDet_Consecutivo[0] ;
         AV41GXLvl3 = (byte)(1) ;
         AV16TDet_Consecutivo = (long)(A69TDet_Consecutivo+1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV41GXLvl3 == 0 )
      {
         AV16TDet_Consecutivo = 1 ;
      }
      /* Using cursor P00153 */
      pr_default.execute(1, new Object[] {AV15Placa});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A67Invd_NumeroPlaca = P00153_A67Invd_NumeroPlaca[0] ;
         A66Elem_Consecutivo = P00153_A66Elem_Consecutivo[0] ;
         A463Invd_Estado = P00153_A463Invd_Estado[0] ;
         n463Invd_Estado = P00153_n463Invd_Estado[0] ;
         A624Costo_Desmante = P00153_A624Costo_Desmante[0] ;
         n624Costo_Desmante = P00153_n624Costo_Desmante[0] ;
         A626Variable_I = P00153_A626Variable_I[0] ;
         n626Variable_I = P00153_n626Variable_I[0] ;
         A627Variable_N = P00153_A627Variable_N[0] ;
         n627Variable_N = P00153_n627Variable_N[0] ;
         A625Variable_VF = P00153_A625Variable_VF[0] ;
         n625Variable_VF = P00153_n625Variable_VF[0] ;
         A628Otros_Costos_Dev = P00153_A628Otros_Costos_Dev[0] ;
         n628Otros_Costos_Dev = P00153_n628Otros_Costos_Dev[0] ;
         A629Costo_Total_Dev = P00153_A629Costo_Total_Dev[0] ;
         AV10Elem_Consecutivo = A66Elem_Consecutivo ;
         A463Invd_Estado = "P" ;
         n463Invd_Estado = false ;
         AV8Costo_Desmante = A624Costo_Desmante ;
         AV18Variable_I = A626Variable_I ;
         AV19Variable_N = A627Variable_N ;
         AV20Variable_VF = A625Variable_VF ;
         AV14Otros_Costos_Dev = A628Otros_Costos_Dev ;
         AV9Costo_Total_Dev = A629Costo_Total_Dev ;
         /* Using cursor P00154 */
         pr_default.execute(2, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /*
         INSERT RECORD ON TABLE ALM_DETALLE_TRANSACCION

      */
      A46Tran_Id = AV17Tran_Id ;
      A69TDet_Consecutivo = AV16TDet_Consecutivo ;
      A66Elem_Consecutivo = AV10Elem_Consecutivo ;
      A487TDet_Cantidad = 1 ;
      A488TDet_ValorUnitario = AV27ValorAdquisicion ;
      A490TDet_PlacaNumero = AV15Placa ;
      n490TDet_PlacaNumero = false ;
      A491TDet_PlacaPadre = AV23PlacaPadre ;
      n491TDet_PlacaPadre = false ;
      A504TDet_Observaciones = AV22Observaciones ;
      n504TDet_Observaciones = false ;
      A505TDet_EsPadre = AV21EsPlacaPadre ;
      A653TDet_Valor_Presente = AV8Costo_Desmante ;
      n653TDet_Valor_Presente = false ;
      A654TDet_Valor_Futuro = AV20Variable_VF ;
      n654TDet_Valor_Futuro = false ;
      A656TDet_Plazo_N = (byte)(AV19Variable_N) ;
      n656TDet_Plazo_N = false ;
      A655TDet_Taza = AV18Variable_I ;
      n655TDet_Taza = false ;
      A657TDet_Otros_Costos = AV14Otros_Costos_Dev ;
      n657TDet_Otros_Costos = false ;
      A489TDet_ValorTotal = AV9Costo_Total_Dev ;
      /* Using cursor P00155 */
      pr_default.execute(3, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), A66Elem_Consecutivo, new Long(A487TDet_Cantidad), A488TDet_ValorUnitario, A489TDet_ValorTotal, new Boolean(n490TDet_PlacaNumero), A490TDet_PlacaNumero, new Boolean(n504TDet_Observaciones), A504TDet_Observaciones, new Boolean(n491TDet_PlacaPadre), A491TDet_PlacaPadre, A505TDet_EsPadre, new Boolean(n653TDet_Valor_Presente), A653TDet_Valor_Presente, new Boolean(n654TDet_Valor_Futuro), A654TDet_Valor_Futuro, new Boolean(n655TDet_Taza), new Short(A655TDet_Taza), new Boolean(n656TDet_Plazo_N), new Byte(A656TDet_Plazo_N), new Boolean(n657TDet_Otros_Costos), A657TDet_Otros_Costos});
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
      AV26Valor = AV9Costo_Total_Dev ;
      /* Execute user subroutine: 'TRANSACCION ENTRADA' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV21EsPlacaPadre, "SI") == 0 )
      {
         /* Using cursor P00156 */
         pr_default.execute(4, new Object[] {AV15Placa});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A68Invd_PlacaPadre = P00156_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P00156_n68Invd_PlacaPadre[0] ;
            A67Invd_NumeroPlaca = P00156_A67Invd_NumeroPlaca[0] ;
            A66Elem_Consecutivo = P00156_A66Elem_Consecutivo[0] ;
            A501Invd_EsPlacaPadre = P00156_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = P00156_n501Invd_EsPlacaPadre[0] ;
            A463Invd_Estado = P00156_A463Invd_Estado[0] ;
            n463Invd_Estado = P00156_n463Invd_Estado[0] ;
            A465Invd_ValorAdquisicion = P00156_A465Invd_ValorAdquisicion[0] ;
            n465Invd_ValorAdquisicion = P00156_n465Invd_ValorAdquisicion[0] ;
            A624Costo_Desmante = P00156_A624Costo_Desmante[0] ;
            n624Costo_Desmante = P00156_n624Costo_Desmante[0] ;
            A626Variable_I = P00156_A626Variable_I[0] ;
            n626Variable_I = P00156_n626Variable_I[0] ;
            A627Variable_N = P00156_A627Variable_N[0] ;
            n627Variable_N = P00156_n627Variable_N[0] ;
            A625Variable_VF = P00156_A625Variable_VF[0] ;
            n625Variable_VF = P00156_n625Variable_VF[0] ;
            A628Otros_Costos_Dev = P00156_A628Otros_Costos_Dev[0] ;
            n628Otros_Costos_Dev = P00156_n628Otros_Costos_Dev[0] ;
            A629Costo_Total_Dev = P00156_A629Costo_Total_Dev[0] ;
            AV16TDet_Consecutivo = (long)(AV16TDet_Consecutivo+1) ;
            AV37Invd_NumeroPlaca = A67Invd_NumeroPlaca ;
            AV38Invd_PlacaPadre = A68Invd_PlacaPadre ;
            AV10Elem_Consecutivo = A66Elem_Consecutivo ;
            AV24TDet_EsPadre = A501Invd_EsPlacaPadre ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            AV36Invd_ValorAdquisicion = A465Invd_ValorAdquisicion ;
            AV8Costo_Desmante = A624Costo_Desmante ;
            AV18Variable_I = A626Variable_I ;
            AV19Variable_N = A627Variable_N ;
            AV20Variable_VF = A625Variable_VF ;
            AV14Otros_Costos_Dev = A628Otros_Costos_Dev ;
            AV9Costo_Total_Dev = A629Costo_Total_Dev ;
            GXv_char1[0] = AV37Invd_NumeroPlaca ;
            GXv_char2[0] = AV29Marca ;
            GXv_char3[0] = AV30Modelo ;
            GXv_char4[0] = AV32Serial ;
            GXv_char5[0] = AV31Observaciones1 ;
            GXv_int6[0] = AV25Tran_IdEntrada ;
            GXv_int7[0] = AV28Nro_Linea ;
            new com.orions2.buscaatributos(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_int6, GXv_int7) ;
            psalidadevolutivo.this.AV37Invd_NumeroPlaca = GXv_char1[0] ;
            psalidadevolutivo.this.AV29Marca = GXv_char2[0] ;
            psalidadevolutivo.this.AV30Modelo = GXv_char3[0] ;
            psalidadevolutivo.this.AV32Serial = GXv_char4[0] ;
            psalidadevolutivo.this.AV31Observaciones1 = GXv_char5[0] ;
            psalidadevolutivo.this.AV25Tran_IdEntrada = GXv_int6[0] ;
            psalidadevolutivo.this.AV28Nro_Linea = GXv_int7[0] ;
            /* Execute user subroutine: 'CREA DETALLE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'TRANSACCION ENTRADA' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P00157 */
            pr_default.execute(5, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      if ( ! (GXutil.strcmp("", AV23PlacaPadre)==0) )
      {
         /* Using cursor P00158 */
         pr_default.execute(6, new Object[] {AV23PlacaPadre});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A67Invd_NumeroPlaca = P00158_A67Invd_NumeroPlaca[0] ;
            A465Invd_ValorAdquisicion = P00158_A465Invd_ValorAdquisicion[0] ;
            n465Invd_ValorAdquisicion = P00158_n465Invd_ValorAdquisicion[0] ;
            A68Invd_PlacaPadre = P00158_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P00158_n68Invd_PlacaPadre[0] ;
            A66Elem_Consecutivo = P00158_A66Elem_Consecutivo[0] ;
            A501Invd_EsPlacaPadre = P00158_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = P00158_n501Invd_EsPlacaPadre[0] ;
            A463Invd_Estado = P00158_A463Invd_Estado[0] ;
            n463Invd_Estado = P00158_n463Invd_Estado[0] ;
            A624Costo_Desmante = P00158_A624Costo_Desmante[0] ;
            n624Costo_Desmante = P00158_n624Costo_Desmante[0] ;
            A626Variable_I = P00158_A626Variable_I[0] ;
            n626Variable_I = P00158_n626Variable_I[0] ;
            A627Variable_N = P00158_A627Variable_N[0] ;
            n627Variable_N = P00158_n627Variable_N[0] ;
            A625Variable_VF = P00158_A625Variable_VF[0] ;
            n625Variable_VF = P00158_n625Variable_VF[0] ;
            A628Otros_Costos_Dev = P00158_A628Otros_Costos_Dev[0] ;
            n628Otros_Costos_Dev = P00158_n628Otros_Costos_Dev[0] ;
            A629Costo_Total_Dev = P00158_A629Costo_Total_Dev[0] ;
            AV16TDet_Consecutivo = (long)(AV16TDet_Consecutivo+1) ;
            AV36Invd_ValorAdquisicion = A465Invd_ValorAdquisicion ;
            AV37Invd_NumeroPlaca = A67Invd_NumeroPlaca ;
            AV38Invd_PlacaPadre = A68Invd_PlacaPadre ;
            AV10Elem_Consecutivo = A66Elem_Consecutivo ;
            AV24TDet_EsPadre = A501Invd_EsPlacaPadre ;
            A463Invd_Estado = "P" ;
            n463Invd_Estado = false ;
            AV8Costo_Desmante = A624Costo_Desmante ;
            AV18Variable_I = A626Variable_I ;
            AV19Variable_N = A627Variable_N ;
            AV20Variable_VF = A625Variable_VF ;
            AV14Otros_Costos_Dev = A628Otros_Costos_Dev ;
            AV9Costo_Total_Dev = A629Costo_Total_Dev ;
            GXv_char5[0] = AV37Invd_NumeroPlaca ;
            GXv_char4[0] = AV29Marca ;
            GXv_char3[0] = AV30Modelo ;
            GXv_char2[0] = AV32Serial ;
            GXv_char1[0] = AV31Observaciones1 ;
            GXv_int6[0] = AV25Tran_IdEntrada ;
            GXv_int7[0] = AV28Nro_Linea ;
            new com.orions2.buscaatributos(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2, GXv_char1, GXv_int6, GXv_int7) ;
            psalidadevolutivo.this.AV37Invd_NumeroPlaca = GXv_char5[0] ;
            psalidadevolutivo.this.AV29Marca = GXv_char4[0] ;
            psalidadevolutivo.this.AV30Modelo = GXv_char3[0] ;
            psalidadevolutivo.this.AV32Serial = GXv_char2[0] ;
            psalidadevolutivo.this.AV31Observaciones1 = GXv_char1[0] ;
            psalidadevolutivo.this.AV25Tran_IdEntrada = GXv_int6[0] ;
            psalidadevolutivo.this.AV28Nro_Linea = GXv_int7[0] ;
            /* Execute user subroutine: 'CREA DETALLE' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'TRANSACCION ENTRADA' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P00159 */
            pr_default.execute(7, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
         /* Using cursor P001510 */
         pr_default.execute(8, new Object[] {AV23PlacaPadre});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A68Invd_PlacaPadre = P001510_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = P001510_n68Invd_PlacaPadre[0] ;
            A67Invd_NumeroPlaca = P001510_A67Invd_NumeroPlaca[0] ;
            A465Invd_ValorAdquisicion = P001510_A465Invd_ValorAdquisicion[0] ;
            n465Invd_ValorAdquisicion = P001510_n465Invd_ValorAdquisicion[0] ;
            A66Elem_Consecutivo = P001510_A66Elem_Consecutivo[0] ;
            A501Invd_EsPlacaPadre = P001510_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = P001510_n501Invd_EsPlacaPadre[0] ;
            A463Invd_Estado = P001510_A463Invd_Estado[0] ;
            n463Invd_Estado = P001510_n463Invd_Estado[0] ;
            A624Costo_Desmante = P001510_A624Costo_Desmante[0] ;
            n624Costo_Desmante = P001510_n624Costo_Desmante[0] ;
            A626Variable_I = P001510_A626Variable_I[0] ;
            n626Variable_I = P001510_n626Variable_I[0] ;
            A627Variable_N = P001510_A627Variable_N[0] ;
            n627Variable_N = P001510_n627Variable_N[0] ;
            A625Variable_VF = P001510_A625Variable_VF[0] ;
            n625Variable_VF = P001510_n625Variable_VF[0] ;
            A628Otros_Costos_Dev = P001510_A628Otros_Costos_Dev[0] ;
            n628Otros_Costos_Dev = P001510_n628Otros_Costos_Dev[0] ;
            A629Costo_Total_Dev = P001510_A629Costo_Total_Dev[0] ;
            if ( GXutil.strcmp(A67Invd_NumeroPlaca, AV15Placa) != 0 )
            {
               AV16TDet_Consecutivo = (long)(AV16TDet_Consecutivo+1) ;
               AV36Invd_ValorAdquisicion = A465Invd_ValorAdquisicion ;
               AV37Invd_NumeroPlaca = A67Invd_NumeroPlaca ;
               AV38Invd_PlacaPadre = A68Invd_PlacaPadre ;
               AV10Elem_Consecutivo = A66Elem_Consecutivo ;
               AV24TDet_EsPadre = A501Invd_EsPlacaPadre ;
               A463Invd_Estado = "P" ;
               n463Invd_Estado = false ;
               AV8Costo_Desmante = A624Costo_Desmante ;
               AV18Variable_I = A626Variable_I ;
               AV19Variable_N = A627Variable_N ;
               AV20Variable_VF = A625Variable_VF ;
               AV14Otros_Costos_Dev = A628Otros_Costos_Dev ;
               AV9Costo_Total_Dev = A629Costo_Total_Dev ;
               GXv_char5[0] = AV37Invd_NumeroPlaca ;
               GXv_char4[0] = AV29Marca ;
               GXv_char3[0] = AV30Modelo ;
               GXv_char2[0] = AV32Serial ;
               GXv_char1[0] = AV31Observaciones1 ;
               GXv_int6[0] = AV25Tran_IdEntrada ;
               GXv_int7[0] = AV28Nro_Linea ;
               new com.orions2.buscaatributos(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2, GXv_char1, GXv_int6, GXv_int7) ;
               psalidadevolutivo.this.AV37Invd_NumeroPlaca = GXv_char5[0] ;
               psalidadevolutivo.this.AV29Marca = GXv_char4[0] ;
               psalidadevolutivo.this.AV30Modelo = GXv_char3[0] ;
               psalidadevolutivo.this.AV32Serial = GXv_char2[0] ;
               psalidadevolutivo.this.AV31Observaciones1 = GXv_char1[0] ;
               psalidadevolutivo.this.AV25Tran_IdEntrada = GXv_int6[0] ;
               psalidadevolutivo.this.AV28Nro_Linea = GXv_int7[0] ;
               /* Execute user subroutine: 'CREA DETALLE' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(8);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               /* Execute user subroutine: 'TRANSACCION ENTRADA' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(8);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            /* Using cursor P001511 */
            pr_default.execute(9, new Object[] {new Boolean(n463Invd_Estado), A463Invd_Estado, A66Elem_Consecutivo, A67Invd_NumeroPlaca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
            pr_default.readNext(8);
         }
         pr_default.close(8);
      }
      /* Execute user subroutine: 'ACTUALIZA CABECERA' */
      S121 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CREA DETALLE' Routine */
      /*
         INSERT RECORD ON TABLE ALM_DETALLE_TRANSACCION

      */
      A46Tran_Id = AV17Tran_Id ;
      A69TDet_Consecutivo = AV16TDet_Consecutivo ;
      A66Elem_Consecutivo = AV10Elem_Consecutivo ;
      A487TDet_Cantidad = 1 ;
      A488TDet_ValorUnitario = AV36Invd_ValorAdquisicion ;
      A490TDet_PlacaNumero = AV37Invd_NumeroPlaca ;
      n490TDet_PlacaNumero = false ;
      A491TDet_PlacaPadre = AV38Invd_PlacaPadre ;
      n491TDet_PlacaPadre = false ;
      A504TDet_Observaciones = AV22Observaciones ;
      n504TDet_Observaciones = false ;
      A505TDet_EsPadre = AV24TDet_EsPadre ;
      A653TDet_Valor_Presente = AV8Costo_Desmante ;
      n653TDet_Valor_Presente = false ;
      A654TDet_Valor_Futuro = AV20Variable_VF ;
      n654TDet_Valor_Futuro = false ;
      A656TDet_Plazo_N = (byte)(AV19Variable_N) ;
      n656TDet_Plazo_N = false ;
      A655TDet_Taza = AV18Variable_I ;
      n655TDet_Taza = false ;
      A657TDet_Otros_Costos = AV14Otros_Costos_Dev ;
      n657TDet_Otros_Costos = false ;
      A489TDet_ValorTotal = AV9Costo_Total_Dev ;
      /* Using cursor P001512 */
      pr_default.execute(10, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), A66Elem_Consecutivo, new Long(A487TDet_Cantidad), A488TDet_ValorUnitario, A489TDet_ValorTotal, new Boolean(n490TDet_PlacaNumero), A490TDet_PlacaNumero, new Boolean(n504TDet_Observaciones), A504TDet_Observaciones, new Boolean(n491TDet_PlacaPadre), A491TDet_PlacaPadre, A505TDet_EsPadre, new Boolean(n653TDet_Valor_Presente), A653TDet_Valor_Presente, new Boolean(n654TDet_Valor_Futuro), A654TDet_Valor_Futuro, new Boolean(n655TDet_Taza), new Short(A655TDet_Taza), new Boolean(n656TDet_Plazo_N), new Byte(A656TDet_Plazo_N), new Boolean(n657TDet_Otros_Costos), A657TDet_Otros_Costos});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DETALLE_TRANSACCION") ;
      if ( (pr_default.getStatus(10) == 1) )
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
      AV26Valor = AV26Valor.add(AV9Costo_Total_Dev) ;
   }

   public void S121( )
   {
      /* 'ACTUALIZA CABECERA' Routine */
      /* Optimized group. */
      /* Using cursor P001513 */
      pr_default.execute(11, new Object[] {new Long(AV17Tran_Id)});
      c489TDet_ValorTotal = P001513_A489TDet_ValorTotal[0] ;
      pr_default.close(11);
      AV33TDet_ValorTotal = AV33TDet_ValorTotal.add(c489TDet_ValorTotal) ;
      /* End optimized group. */
      /* Optimized UPDATE. */
      /* Using cursor P001514 */
      pr_default.execute(12, new Object[] {new Boolean(n483Tran_ValorTransaccion), AV33TDet_ValorTotal, new Long(AV17Tran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "psalidadevolutivo");
   }

   public void S131( )
   {
      /* 'TRANSACCION ENTRADA' Routine */
      /*
         INSERT RECORD ON TABLE ALM_DET_TRAN_DATOS_SALIDA

      */
      A46Tran_Id = AV17Tran_Id ;
      A69TDet_Consecutivo = AV16TDet_Consecutivo ;
      A71Tran_Entrada = AV25Tran_IdEntrada ;
      A72Nro_Linea = AV28Nro_Linea ;
      A687Tran_Cantidad = 1 ;
      n687Tran_Cantidad = false ;
      /* Using cursor P001515 */
      pr_default.execute(13, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo), new Long(A71Tran_Entrada), new Integer(A72Nro_Linea), new Boolean(n687Tran_Cantidad), new Integer(A687Tran_Cantidad)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_DET_TRAN_DATOS_SALIDA") ;
      if ( (pr_default.getStatus(13) == 1) )
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

   protected void cleanup( )
   {
      this.aP0[0] = psalidadevolutivo.this.AV17Tran_Id;
      this.aP1[0] = psalidadevolutivo.this.AV15Placa;
      this.aP2[0] = psalidadevolutivo.this.AV23PlacaPadre;
      this.aP3[0] = psalidadevolutivo.this.AV27ValorAdquisicion;
      this.aP4[0] = psalidadevolutivo.this.AV22Observaciones;
      this.aP5[0] = psalidadevolutivo.this.AV21EsPlacaPadre;
      this.aP6[0] = psalidadevolutivo.this.AV25Tran_IdEntrada;
      this.aP7[0] = psalidadevolutivo.this.AV28Nro_Linea;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "psalidadevolutivo");
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
      P00152_A46Tran_Id = new long[1] ;
      P00152_A69TDet_Consecutivo = new long[1] ;
      P00153_A67Invd_NumeroPlaca = new String[] {""} ;
      P00153_A66Elem_Consecutivo = new String[] {""} ;
      P00153_A463Invd_Estado = new String[] {""} ;
      P00153_n463Invd_Estado = new boolean[] {false} ;
      P00153_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00153_n624Costo_Desmante = new boolean[] {false} ;
      P00153_A626Variable_I = new short[1] ;
      P00153_n626Variable_I = new boolean[] {false} ;
      P00153_A627Variable_N = new short[1] ;
      P00153_n627Variable_N = new boolean[] {false} ;
      P00153_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00153_n625Variable_VF = new boolean[] {false} ;
      P00153_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00153_n628Otros_Costos_Dev = new boolean[] {false} ;
      P00153_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A67Invd_NumeroPlaca = "" ;
      A66Elem_Consecutivo = "" ;
      A463Invd_Estado = "" ;
      A624Costo_Desmante = DecimalUtil.ZERO ;
      A625Variable_VF = DecimalUtil.ZERO ;
      A628Otros_Costos_Dev = DecimalUtil.ZERO ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      AV10Elem_Consecutivo = "" ;
      AV8Costo_Desmante = DecimalUtil.ZERO ;
      AV20Variable_VF = DecimalUtil.ZERO ;
      AV14Otros_Costos_Dev = DecimalUtil.ZERO ;
      AV9Costo_Total_Dev = DecimalUtil.ZERO ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      A504TDet_Observaciones = "" ;
      A505TDet_EsPadre = "" ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      AV26Valor = DecimalUtil.ZERO ;
      P00156_A68Invd_PlacaPadre = new String[] {""} ;
      P00156_n68Invd_PlacaPadre = new boolean[] {false} ;
      P00156_A67Invd_NumeroPlaca = new String[] {""} ;
      P00156_A66Elem_Consecutivo = new String[] {""} ;
      P00156_A501Invd_EsPlacaPadre = new String[] {""} ;
      P00156_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P00156_A463Invd_Estado = new String[] {""} ;
      P00156_n463Invd_Estado = new boolean[] {false} ;
      P00156_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00156_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      P00156_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00156_n624Costo_Desmante = new boolean[] {false} ;
      P00156_A626Variable_I = new short[1] ;
      P00156_n626Variable_I = new boolean[] {false} ;
      P00156_A627Variable_N = new short[1] ;
      P00156_n627Variable_N = new boolean[] {false} ;
      P00156_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00156_n625Variable_VF = new boolean[] {false} ;
      P00156_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00156_n628Otros_Costos_Dev = new boolean[] {false} ;
      P00156_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A68Invd_PlacaPadre = "" ;
      A501Invd_EsPlacaPadre = "" ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      AV37Invd_NumeroPlaca = "" ;
      AV38Invd_PlacaPadre = "" ;
      AV24TDet_EsPadre = "" ;
      AV36Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      AV29Marca = "" ;
      AV30Modelo = "" ;
      AV32Serial = "" ;
      AV31Observaciones1 = "" ;
      P00158_A67Invd_NumeroPlaca = new String[] {""} ;
      P00158_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00158_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      P00158_A68Invd_PlacaPadre = new String[] {""} ;
      P00158_n68Invd_PlacaPadre = new boolean[] {false} ;
      P00158_A66Elem_Consecutivo = new String[] {""} ;
      P00158_A501Invd_EsPlacaPadre = new String[] {""} ;
      P00158_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P00158_A463Invd_Estado = new String[] {""} ;
      P00158_n463Invd_Estado = new boolean[] {false} ;
      P00158_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00158_n624Costo_Desmante = new boolean[] {false} ;
      P00158_A626Variable_I = new short[1] ;
      P00158_n626Variable_I = new boolean[] {false} ;
      P00158_A627Variable_N = new short[1] ;
      P00158_n627Variable_N = new boolean[] {false} ;
      P00158_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00158_n625Variable_VF = new boolean[] {false} ;
      P00158_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00158_n628Otros_Costos_Dev = new boolean[] {false} ;
      P00158_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001510_A68Invd_PlacaPadre = new String[] {""} ;
      P001510_n68Invd_PlacaPadre = new boolean[] {false} ;
      P001510_A67Invd_NumeroPlaca = new String[] {""} ;
      P001510_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001510_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      P001510_A66Elem_Consecutivo = new String[] {""} ;
      P001510_A501Invd_EsPlacaPadre = new String[] {""} ;
      P001510_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      P001510_A463Invd_Estado = new String[] {""} ;
      P001510_n463Invd_Estado = new boolean[] {false} ;
      P001510_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001510_n624Costo_Desmante = new boolean[] {false} ;
      P001510_A626Variable_I = new short[1] ;
      P001510_n626Variable_I = new boolean[] {false} ;
      P001510_A627Variable_N = new short[1] ;
      P001510_n627Variable_N = new boolean[] {false} ;
      P001510_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001510_n625Variable_VF = new boolean[] {false} ;
      P001510_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001510_n628Otros_Costos_Dev = new boolean[] {false} ;
      P001510_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXv_char5 = new String [1] ;
      GXv_char4 = new String [1] ;
      GXv_char3 = new String [1] ;
      GXv_char2 = new String [1] ;
      GXv_char1 = new String [1] ;
      GXv_int6 = new long [1] ;
      GXv_int7 = new int [1] ;
      c489TDet_ValorTotal = DecimalUtil.ZERO ;
      P001513_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV33TDet_ValorTotal = DecimalUtil.ZERO ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.psalidadevolutivo__default(),
         new Object[] {
             new Object[] {
            P00152_A46Tran_Id, P00152_A69TDet_Consecutivo
            }
            , new Object[] {
            P00153_A67Invd_NumeroPlaca, P00153_A66Elem_Consecutivo, P00153_A463Invd_Estado, P00153_n463Invd_Estado, P00153_A624Costo_Desmante, P00153_n624Costo_Desmante, P00153_A626Variable_I, P00153_n626Variable_I, P00153_A627Variable_N, P00153_n627Variable_N,
            P00153_A625Variable_VF, P00153_n625Variable_VF, P00153_A628Otros_Costos_Dev, P00153_n628Otros_Costos_Dev, P00153_A629Costo_Total_Dev
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00156_A68Invd_PlacaPadre, P00156_n68Invd_PlacaPadre, P00156_A67Invd_NumeroPlaca, P00156_A66Elem_Consecutivo, P00156_A501Invd_EsPlacaPadre, P00156_n501Invd_EsPlacaPadre, P00156_A463Invd_Estado, P00156_n463Invd_Estado, P00156_A465Invd_ValorAdquisicion, P00156_n465Invd_ValorAdquisicion,
            P00156_A624Costo_Desmante, P00156_n624Costo_Desmante, P00156_A626Variable_I, P00156_n626Variable_I, P00156_A627Variable_N, P00156_n627Variable_N, P00156_A625Variable_VF, P00156_n625Variable_VF, P00156_A628Otros_Costos_Dev, P00156_n628Otros_Costos_Dev,
            P00156_A629Costo_Total_Dev
            }
            , new Object[] {
            }
            , new Object[] {
            P00158_A67Invd_NumeroPlaca, P00158_A465Invd_ValorAdquisicion, P00158_n465Invd_ValorAdquisicion, P00158_A68Invd_PlacaPadre, P00158_n68Invd_PlacaPadre, P00158_A66Elem_Consecutivo, P00158_A501Invd_EsPlacaPadre, P00158_n501Invd_EsPlacaPadre, P00158_A463Invd_Estado, P00158_n463Invd_Estado,
            P00158_A624Costo_Desmante, P00158_n624Costo_Desmante, P00158_A626Variable_I, P00158_n626Variable_I, P00158_A627Variable_N, P00158_n627Variable_N, P00158_A625Variable_VF, P00158_n625Variable_VF, P00158_A628Otros_Costos_Dev, P00158_n628Otros_Costos_Dev,
            P00158_A629Costo_Total_Dev
            }
            , new Object[] {
            }
            , new Object[] {
            P001510_A68Invd_PlacaPadre, P001510_n68Invd_PlacaPadre, P001510_A67Invd_NumeroPlaca, P001510_A465Invd_ValorAdquisicion, P001510_n465Invd_ValorAdquisicion, P001510_A66Elem_Consecutivo, P001510_A501Invd_EsPlacaPadre, P001510_n501Invd_EsPlacaPadre, P001510_A463Invd_Estado, P001510_n463Invd_Estado,
            P001510_A624Costo_Desmante, P001510_n624Costo_Desmante, P001510_A626Variable_I, P001510_n626Variable_I, P001510_A627Variable_N, P001510_n627Variable_N, P001510_A625Variable_VF, P001510_n625Variable_VF, P001510_A628Otros_Costos_Dev, P001510_n628Otros_Costos_Dev,
            P001510_A629Costo_Total_Dev
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P001513_A489TDet_ValorTotal
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

   private byte AV41GXLvl3 ;
   private byte A656TDet_Plazo_N ;
   private short A626Variable_I ;
   private short A627Variable_N ;
   private short AV18Variable_I ;
   private short AV19Variable_N ;
   private short A655TDet_Taza ;
   private short Gx_err ;
   private int AV28Nro_Linea ;
   private int GX_INS12 ;
   private int GXv_int7[] ;
   private int GX_INS14 ;
   private int A72Nro_Linea ;
   private int A687Tran_Cantidad ;
   private long AV17Tran_Id ;
   private long AV25Tran_IdEntrada ;
   private long A46Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long AV16TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long GXv_int6[] ;
   private long A71Tran_Entrada ;
   private java.math.BigDecimal AV27ValorAdquisicion ;
   private java.math.BigDecimal A624Costo_Desmante ;
   private java.math.BigDecimal A625Variable_VF ;
   private java.math.BigDecimal A628Otros_Costos_Dev ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
   private java.math.BigDecimal AV8Costo_Desmante ;
   private java.math.BigDecimal AV20Variable_VF ;
   private java.math.BigDecimal AV14Otros_Costos_Dev ;
   private java.math.BigDecimal AV9Costo_Total_Dev ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal A654TDet_Valor_Futuro ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal AV26Valor ;
   private java.math.BigDecimal A465Invd_ValorAdquisicion ;
   private java.math.BigDecimal AV36Invd_ValorAdquisicion ;
   private java.math.BigDecimal c489TDet_ValorTotal ;
   private java.math.BigDecimal AV33TDet_ValorTotal ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private String AV21EsPlacaPadre ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private String A501Invd_EsPlacaPadre ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private boolean n463Invd_Estado ;
   private boolean n624Costo_Desmante ;
   private boolean n626Variable_I ;
   private boolean n627Variable_N ;
   private boolean n625Variable_VF ;
   private boolean n628Otros_Costos_Dev ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n504TDet_Observaciones ;
   private boolean n653TDet_Valor_Presente ;
   private boolean n654TDet_Valor_Futuro ;
   private boolean n656TDet_Plazo_N ;
   private boolean n655TDet_Taza ;
   private boolean n657TDet_Otros_Costos ;
   private boolean returnInSub ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean n465Invd_ValorAdquisicion ;
   private boolean n483Tran_ValorTransaccion ;
   private boolean n687Tran_Cantidad ;
   private String AV22Observaciones ;
   private String AV15Placa ;
   private String AV23PlacaPadre ;
   private String A67Invd_NumeroPlaca ;
   private String A66Elem_Consecutivo ;
   private String A463Invd_Estado ;
   private String AV10Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private String A504TDet_Observaciones ;
   private String A505TDet_EsPadre ;
   private String A68Invd_PlacaPadre ;
   private String AV37Invd_NumeroPlaca ;
   private String AV38Invd_PlacaPadre ;
   private String AV24TDet_EsPadre ;
   private String AV29Marca ;
   private String AV30Modelo ;
   private String AV32Serial ;
   private String AV31Observaciones1 ;
   private long[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private long[] aP6 ;
   private int[] aP7 ;
   private IDataStoreProvider pr_default ;
   private long[] P00152_A46Tran_Id ;
   private long[] P00152_A69TDet_Consecutivo ;
   private String[] P00153_A67Invd_NumeroPlaca ;
   private String[] P00153_A66Elem_Consecutivo ;
   private String[] P00153_A463Invd_Estado ;
   private boolean[] P00153_n463Invd_Estado ;
   private java.math.BigDecimal[] P00153_A624Costo_Desmante ;
   private boolean[] P00153_n624Costo_Desmante ;
   private short[] P00153_A626Variable_I ;
   private boolean[] P00153_n626Variable_I ;
   private short[] P00153_A627Variable_N ;
   private boolean[] P00153_n627Variable_N ;
   private java.math.BigDecimal[] P00153_A625Variable_VF ;
   private boolean[] P00153_n625Variable_VF ;
   private java.math.BigDecimal[] P00153_A628Otros_Costos_Dev ;
   private boolean[] P00153_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] P00153_A629Costo_Total_Dev ;
   private String[] P00156_A68Invd_PlacaPadre ;
   private boolean[] P00156_n68Invd_PlacaPadre ;
   private String[] P00156_A67Invd_NumeroPlaca ;
   private String[] P00156_A66Elem_Consecutivo ;
   private String[] P00156_A501Invd_EsPlacaPadre ;
   private boolean[] P00156_n501Invd_EsPlacaPadre ;
   private String[] P00156_A463Invd_Estado ;
   private boolean[] P00156_n463Invd_Estado ;
   private java.math.BigDecimal[] P00156_A465Invd_ValorAdquisicion ;
   private boolean[] P00156_n465Invd_ValorAdquisicion ;
   private java.math.BigDecimal[] P00156_A624Costo_Desmante ;
   private boolean[] P00156_n624Costo_Desmante ;
   private short[] P00156_A626Variable_I ;
   private boolean[] P00156_n626Variable_I ;
   private short[] P00156_A627Variable_N ;
   private boolean[] P00156_n627Variable_N ;
   private java.math.BigDecimal[] P00156_A625Variable_VF ;
   private boolean[] P00156_n625Variable_VF ;
   private java.math.BigDecimal[] P00156_A628Otros_Costos_Dev ;
   private boolean[] P00156_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] P00156_A629Costo_Total_Dev ;
   private String[] P00158_A67Invd_NumeroPlaca ;
   private java.math.BigDecimal[] P00158_A465Invd_ValorAdquisicion ;
   private boolean[] P00158_n465Invd_ValorAdquisicion ;
   private String[] P00158_A68Invd_PlacaPadre ;
   private boolean[] P00158_n68Invd_PlacaPadre ;
   private String[] P00158_A66Elem_Consecutivo ;
   private String[] P00158_A501Invd_EsPlacaPadre ;
   private boolean[] P00158_n501Invd_EsPlacaPadre ;
   private String[] P00158_A463Invd_Estado ;
   private boolean[] P00158_n463Invd_Estado ;
   private java.math.BigDecimal[] P00158_A624Costo_Desmante ;
   private boolean[] P00158_n624Costo_Desmante ;
   private short[] P00158_A626Variable_I ;
   private boolean[] P00158_n626Variable_I ;
   private short[] P00158_A627Variable_N ;
   private boolean[] P00158_n627Variable_N ;
   private java.math.BigDecimal[] P00158_A625Variable_VF ;
   private boolean[] P00158_n625Variable_VF ;
   private java.math.BigDecimal[] P00158_A628Otros_Costos_Dev ;
   private boolean[] P00158_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] P00158_A629Costo_Total_Dev ;
   private String[] P001510_A68Invd_PlacaPadre ;
   private boolean[] P001510_n68Invd_PlacaPadre ;
   private String[] P001510_A67Invd_NumeroPlaca ;
   private java.math.BigDecimal[] P001510_A465Invd_ValorAdquisicion ;
   private boolean[] P001510_n465Invd_ValorAdquisicion ;
   private String[] P001510_A66Elem_Consecutivo ;
   private String[] P001510_A501Invd_EsPlacaPadre ;
   private boolean[] P001510_n501Invd_EsPlacaPadre ;
   private String[] P001510_A463Invd_Estado ;
   private boolean[] P001510_n463Invd_Estado ;
   private java.math.BigDecimal[] P001510_A624Costo_Desmante ;
   private boolean[] P001510_n624Costo_Desmante ;
   private short[] P001510_A626Variable_I ;
   private boolean[] P001510_n626Variable_I ;
   private short[] P001510_A627Variable_N ;
   private boolean[] P001510_n627Variable_N ;
   private java.math.BigDecimal[] P001510_A625Variable_VF ;
   private boolean[] P001510_n625Variable_VF ;
   private java.math.BigDecimal[] P001510_A628Otros_Costos_Dev ;
   private boolean[] P001510_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] P001510_A629Costo_Total_Dev ;
   private java.math.BigDecimal[] P001513_A489TDet_ValorTotal ;
}

final  class psalidadevolutivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00152", "SELECT * FROM (SELECT Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id DESC, TDet_Consecutivo DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00153", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_Estado, Costo_Desmante, Variable_I, Variable_N, Variable_VF, Otros_Costos_Dev, Costo_Total_Dev FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P00154", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new UpdateCursor("P00155", "INSERT INTO ALM_DETALLE_TRANSACCION(Tran_Id, TDet_Consecutivo, Elem_Consecutivo, TDet_Cantidad, TDet_ValorUnitario, TDet_ValorTotal, TDet_PlacaNumero, TDet_Observaciones, TDet_PlacaPadre, TDet_EsPadre, TDet_Valor_Presente, TDet_Valor_Futuro, TDet_Taza, TDet_Plazo_N, TDet_Otros_Costos, TDet_Atributos, TDet_Agrupado, TDet_PlacaRecuperada) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new ForEachCursor("P00156", "SELECT Invd_PlacaPadre, Invd_NumeroPlaca, Elem_Consecutivo, Invd_EsPlacaPadre, Invd_Estado, Invd_ValorAdquisicion, Costo_Desmante, Variable_I, Variable_N, Variable_VF, Otros_Costos_Dev, Costo_Total_Dev FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_PlacaPadre = ? ORDER BY Invd_PlacaPadre  FOR UPDATE OF Invd_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P00157", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P00158", "SELECT Invd_NumeroPlaca, Invd_ValorAdquisicion, Invd_PlacaPadre, Elem_Consecutivo, Invd_EsPlacaPadre, Invd_Estado, Costo_Desmante, Variable_I, Variable_N, Variable_VF, Otros_Costos_Dev, Costo_Total_Dev FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca  FOR UPDATE OF Invd_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P00159", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001510", "SELECT Invd_PlacaPadre, Invd_NumeroPlaca, Invd_ValorAdquisicion, Elem_Consecutivo, Invd_EsPlacaPadre, Invd_Estado, Costo_Desmante, Variable_I, Variable_N, Variable_VF, Otros_Costos_Dev, Costo_Total_Dev FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_PlacaPadre = ? ORDER BY Invd_PlacaPadre  FOR UPDATE OF Invd_Estado NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001511", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado=?  WHERE Elem_Consecutivo = ? AND Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new UpdateCursor("P001512", "INSERT INTO ALM_DETALLE_TRANSACCION(Tran_Id, TDet_Consecutivo, Elem_Consecutivo, TDet_Cantidad, TDet_ValorUnitario, TDet_ValorTotal, TDet_PlacaNumero, TDet_Observaciones, TDet_PlacaPadre, TDet_EsPadre, TDet_Valor_Presente, TDet_Valor_Futuro, TDet_Taza, TDet_Plazo_N, TDet_Otros_Costos, TDet_Atributos, TDet_Agrupado, TDet_PlacaRecuperada) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DETALLE_TRANSACCION")
         ,new ForEachCursor("P001513", "SELECT SUM(TDet_ValorTotal) FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P001514", "UPDATE ALM_TRANSACCION SET Tran_ValorTransaccion=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
         ,new UpdateCursor("P001515", "INSERT INTO ALM_DET_TRAN_DATOS_SALIDA(Tran_Id, TDet_Consecutivo, Tran_Entrada, Nro_Linea, Tran_Cantidad) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_DET_TRAN_DATOS_SALIDA")
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2) ;
               return;
            case 4 :
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
            case 6 :
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
            case 8 :
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
            case 11 :
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
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 2 :
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
            case 3 :
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
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 5 :
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
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
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
            case 13 :
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
      }
   }

}

