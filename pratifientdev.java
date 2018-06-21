/*
               File: PRatifiEntDev
        Description: Ratifica Entrada Devolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:4.50
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pratifientdev extends GXProcedure
{
   public pratifientdev( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pratifientdev.class ), "" );
   }

   public pratifientdev( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pratifientdev.this.AV24pTran_Id = aP0[0];
      this.aP0 = aP0;
      pratifientdev.this.AV25Modo = aP1[0];
      this.aP1 = aP1;
      pratifientdev.this.AV26pTran_TipoEntra = aP2[0];
      this.aP2 = aP2;
      pratifientdev.this.AV27Usuario = aP3[0];
      this.aP3 = aP3;
      pratifientdev.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pratifientdev.this.AV24pTran_Id = aP0[0];
      this.aP0 = aP0;
      pratifientdev.this.AV25Modo = aP1[0];
      this.aP1 = aP1;
      pratifientdev.this.AV26pTran_TipoEntra = aP2[0];
      this.aP2 = aP2;
      pratifientdev.this.AV27Usuario = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'INICIO' */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIO' Routine */
      /* Execute user subroutine: 'DATOSTRANSACCION' */
      S121 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'DATOSDETALLE' */
      S131 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RATIFICATRANSACCION' */
      S141 ();
      if (returnInSub) return;
   }

   public void S121( )
   {
      /* 'DATOSTRANSACCION' Routine */
      /* Using cursor P001O2 */
      pr_default.execute(0, new Object[] {new Long(AV24pTran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = P001O2_A46Tran_Id[0] ;
         A57Tran_RegionId = P001O2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P001O2_n57Tran_RegionId[0] ;
         A421Tran_RegionCodigo = P001O2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001O2_n421Tran_RegionCodigo[0] ;
         A48Tran_CentroCostoId = P001O2_A48Tran_CentroCostoId[0] ;
         A419Tran_CentroCostoCodigo = P001O2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P001O2_n419Tran_CentroCostoCodigo[0] ;
         A385Tran_ModuloDestino = P001O2_A385Tran_ModuloDestino[0] ;
         A111Tran_CodAlmaDestino = P001O2_A111Tran_CodAlmaDestino[0] ;
         A387Tran_CodBodeDestino = P001O2_A387Tran_CodBodeDestino[0] ;
         A49Tran_CodigoMovimiento = P001O2_A49Tran_CodigoMovimiento[0] ;
         A52Tran_IdCuentadanteDestino = P001O2_A52Tran_IdCuentadanteDestino[0] ;
         n52Tran_IdCuentadanteDestino = P001O2_n52Tran_IdCuentadanteDestino[0] ;
         A859Tran_EntidadGobierno = P001O2_A859Tran_EntidadGobierno[0] ;
         n859Tran_EntidadGobierno = P001O2_n859Tran_EntidadGobierno[0] ;
         A421Tran_RegionCodigo = P001O2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001O2_n421Tran_RegionCodigo[0] ;
         A419Tran_CentroCostoCodigo = P001O2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P001O2_n419Tran_CentroCostoCodigo[0] ;
         AV9Tran_RegionId = A57Tran_RegionId ;
         AV8Tran_RegionCodigo = A421Tran_RegionCodigo ;
         AV10Tran_CentroCostoId = A48Tran_CentroCostoId ;
         AV11Tran_CentroCostoCodigo = A419Tran_CentroCostoCodigo ;
         AV12Tran_ModuloDestino = A385Tran_ModuloDestino ;
         AV13Tran_CodAlmaDestino = A111Tran_CodAlmaDestino ;
         AV14Tran_CodBodeDestino = A387Tran_CodBodeDestino ;
         AV15Tran_CodigoMovimiento = A49Tran_CodigoMovimiento ;
         AV28Tran_IdCuentadanteDestino = A52Tran_IdCuentadanteDestino ;
         AV37Tran_EntidadGobierno = A859Tran_EntidadGobierno ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'DATOSDETALLE' Routine */
      /* Using cursor P001O3 */
      pr_default.execute(1, new Object[] {new Long(AV24pTran_Id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A46Tran_Id = P001O3_A46Tran_Id[0] ;
         A66Elem_Consecutivo = P001O3_A66Elem_Consecutivo[0] ;
         A487TDet_Cantidad = P001O3_A487TDet_Cantidad[0] ;
         A489TDet_ValorTotal = P001O3_A489TDet_ValorTotal[0] ;
         A488TDet_ValorUnitario = P001O3_A488TDet_ValorUnitario[0] ;
         A490TDet_PlacaNumero = P001O3_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = P001O3_n490TDet_PlacaNumero[0] ;
         A491TDet_PlacaPadre = P001O3_A491TDet_PlacaPadre[0] ;
         n491TDet_PlacaPadre = P001O3_n491TDet_PlacaPadre[0] ;
         A505TDet_EsPadre = P001O3_A505TDet_EsPadre[0] ;
         A657TDet_Otros_Costos = P001O3_A657TDet_Otros_Costos[0] ;
         n657TDet_Otros_Costos = P001O3_n657TDet_Otros_Costos[0] ;
         A653TDet_Valor_Presente = P001O3_A653TDet_Valor_Presente[0] ;
         n653TDet_Valor_Presente = P001O3_n653TDet_Valor_Presente[0] ;
         A654TDet_Valor_Futuro = P001O3_A654TDet_Valor_Futuro[0] ;
         n654TDet_Valor_Futuro = P001O3_n654TDet_Valor_Futuro[0] ;
         A655TDet_Taza = P001O3_A655TDet_Taza[0] ;
         n655TDet_Taza = P001O3_n655TDet_Taza[0] ;
         A656TDet_Plazo_N = P001O3_A656TDet_Plazo_N[0] ;
         n656TDet_Plazo_N = P001O3_n656TDet_Plazo_N[0] ;
         A817TDet_PlacaRecuperada = P001O3_A817TDet_PlacaRecuperada[0] ;
         n817TDet_PlacaRecuperada = P001O3_n817TDet_PlacaRecuperada[0] ;
         A69TDet_Consecutivo = P001O3_A69TDet_Consecutivo[0] ;
         AV16Elem_Consecutivo = A66Elem_Consecutivo ;
         AV17TDet_Cantidad = A487TDet_Cantidad ;
         AV18TDet_ValorTotal = A489TDet_ValorTotal ;
         AV19TDet_ValorUnitario = A488TDet_ValorUnitario ;
         AV20TDet_PlacaNumero = A490TDet_PlacaNumero ;
         AV21TDet_PlacaPadre = A491TDet_PlacaPadre ;
         AV22TDet_EsPadre = A505TDet_EsPadre ;
         AV30TDet_Otros_Costos = A657TDet_Otros_Costos ;
         AV31TDet_Valor_Presente = A653TDet_Valor_Presente ;
         AV32TDet_Valor_Futuro = A654TDet_Valor_Futuro ;
         AV33TDet_Taza = A655TDet_Taza ;
         AV34TDet_Plazo_N = A656TDet_Plazo_N ;
         AV18TDet_ValorTotal = A489TDet_ValorTotal ;
         AV36TDet_PlacaRecuperada = A817TDet_PlacaRecuperada ;
         /* Execute user subroutine: 'ACTUALIZARINVENTARIO' */
         S153 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'CREARKARDEX' */
         S163 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         if ( AV23SWKardex == 1 )
         {
            /* Execute user subroutine: 'ACTUALIZARKARDEX' */
            S173 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
         }
         /* Execute user subroutine: 'MOVIMIENTOKARDEX' */
         S183 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         if ( AV35SWMoviKardex == 1 )
         {
            /* Execute user subroutine: 'ACTUALIZARMOVIKARDEX' */
            S193 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
         }
         AV17TDet_Cantidad = 0 ;
         AV18TDet_ValorTotal = DecimalUtil.ZERO ;
         AV20TDet_PlacaNumero = "" ;
         AV22TDet_EsPadre = "" ;
         AV21TDet_PlacaPadre = "" ;
         AV19TDet_ValorUnitario = DecimalUtil.ZERO ;
         AV30TDet_Otros_Costos = DecimalUtil.ZERO ;
         AV31TDet_Valor_Presente = DecimalUtil.ZERO ;
         AV32TDet_Valor_Futuro = DecimalUtil.ZERO ;
         AV33TDet_Taza = (short)(0) ;
         AV34TDet_Plazo_N = (byte)(0) ;
         AV18TDet_ValorTotal = DecimalUtil.ZERO ;
         AV36TDet_PlacaRecuperada = "" ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S153( )
   {
      /* 'ACTUALIZARINVENTARIO' Routine */
      /* Execute user subroutine: 'BUSCARVIDAUTIL' */
      S201 ();
      if (returnInSub) return;
      /*
         INSERT RECORD ON TABLE ALM_INVENTARIO_DEVOLUTIVO

      */
      A66Elem_Consecutivo = AV16Elem_Consecutivo ;
      A67Invd_NumeroPlaca = AV20TDet_PlacaNumero ;
      A410Invd_RegionalId = AV9Tran_RegionId ;
      A411Invd_CentroCostoId = AV10Tran_CentroCostoId ;
      A412Invd_ModuloAlmacen = AV12Tran_ModuloDestino ;
      A413Invd_AlmacenCodigo = AV13Tran_CodAlmaDestino ;
      A414Invd_BodegaCodigo = AV14Tran_CodBodeDestino ;
      A463Invd_Estado = "R" ;
      n463Invd_Estado = false ;
      A465Invd_ValorAdquisicion = AV19TDet_ValorUnitario ;
      n465Invd_ValorAdquisicion = false ;
      A466Invd_FechaAdquisicion = GXutil.serverDate( context, remoteHandle, "DEFAULT") ;
      n466Invd_FechaAdquisicion = false ;
      A68Invd_PlacaPadre = AV21TDet_PlacaPadre ;
      n68Invd_PlacaPadre = false ;
      A501Invd_EsPlacaPadre = AV22TDet_EsPadre ;
      n501Invd_EsPlacaPadre = false ;
      A43Cuen_Identificacion = AV28Tran_IdCuentadanteDestino ;
      n43Cuen_Identificacion = false ;
      A628Otros_Costos_Dev = AV30TDet_Otros_Costos ;
      n628Otros_Costos_Dev = false ;
      A624Costo_Desmante = AV31TDet_Valor_Presente ;
      n624Costo_Desmante = false ;
      A625Variable_VF = AV32TDet_Valor_Futuro ;
      n625Variable_VF = false ;
      A626Variable_I = AV33TDet_Taza ;
      n626Variable_I = false ;
      A627Variable_N = AV34TDet_Plazo_N ;
      n627Variable_N = false ;
      A629Costo_Total_Dev = AV18TDet_ValorTotal ;
      A631Vida_Util_Actual = AV29Vida_Util ;
      n631Vida_Util_Actual = false ;
      A630Vida_Util_Inicial = AV29Vida_Util ;
      n630Vida_Util_Inicial = false ;
      A818Invd_PlacaRecuperada = AV36TDet_PlacaRecuperada ;
      n818Invd_PlacaRecuperada = false ;
      A858Invd_EntidadGobierno = AV37Tran_EntidadGobierno ;
      n858Invd_EntidadGobierno = false ;
      /* Using cursor P001O4 */
      pr_default.execute(2, new Object[] {A66Elem_Consecutivo, A67Invd_NumeroPlaca, new Long(A410Invd_RegionalId), new Long(A411Invd_CentroCostoId), A412Invd_ModuloAlmacen, A413Invd_AlmacenCodigo, A414Invd_BodegaCodigo, new Boolean(n463Invd_Estado), A463Invd_Estado, new Boolean(n465Invd_ValorAdquisicion), A465Invd_ValorAdquisicion, new Boolean(n466Invd_FechaAdquisicion), A466Invd_FechaAdquisicion, new Boolean(n68Invd_PlacaPadre), A68Invd_PlacaPadre, new Boolean(n501Invd_EsPlacaPadre), A501Invd_EsPlacaPadre, new Boolean(n43Cuen_Identificacion), new Long(A43Cuen_Identificacion), new Boolean(n628Otros_Costos_Dev), A628Otros_Costos_Dev, new Boolean(n624Costo_Desmante), A624Costo_Desmante, new Boolean(n625Variable_VF), A625Variable_VF, new Boolean(n626Variable_I), new Short(A626Variable_I), new Boolean(n627Variable_N), new Short(A627Variable_N), A629Costo_Total_Dev, new Boolean(n630Vida_Util_Inicial), new Short(A630Vida_Util_Inicial), new Boolean(n631Vida_Util_Actual), new Short(A631Vida_Util_Actual), new Boolean(n818Invd_PlacaRecuperada), A818Invd_PlacaRecuperada, new Boolean(n858Invd_EntidadGobierno), A858Invd_EntidadGobierno});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
      if ( (pr_default.getStatus(2) == 1) )
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
      if ( GXutil.strcmp(AV36TDet_PlacaRecuperada, "") != 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P001O5 */
         pr_default.execute(3, new Object[] {AV36TDet_PlacaRecuperada});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
         /* End optimized UPDATE. */
      }
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pratifientdev");
   }

   public void S201( )
   {
      /* 'BUSCARVIDAUTIL' Routine */
      /* Using cursor P001O6 */
      pr_default.execute(4, new Object[] {AV16Elem_Consecutivo});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A66Elem_Consecutivo = P001O6_A66Elem_Consecutivo[0] ;
         A632Vida_Util = P001O6_A632Vida_Util[0] ;
         n632Vida_Util = P001O6_n632Vida_Util[0] ;
         AV29Vida_Util = A632Vida_Util ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S163( )
   {
      /* 'CREARKARDEX' Routine */
      AV23SWKardex = (short)(0) ;
      /*
         INSERT RECORD ON TABLE ALM_INV_KARDEX

      */
      A85Kard_Regi_Id = AV9Tran_RegionId ;
      A577Kard_Regi_Cod = AV8Tran_RegionCodigo ;
      A86Kard_Cent_Id = AV10Tran_CentroCostoId ;
      A578Kard_Cent_Cod = AV11Tran_CentroCostoCodigo ;
      A87Kard_Alm_Cod = AV13Tran_CodAlmaDestino ;
      A88Kard_Bod_Cod = AV14Tran_CodBodeDestino ;
      A89Kard_Elem_Cons = AV16Elem_Consecutivo ;
      A590Kard_Saldo_Cant = (int)(AV17TDet_Cantidad) ;
      n590Kard_Saldo_Cant = false ;
      A589Kard_Saldo_Valor = AV18TDet_ValorTotal ;
      n589Kard_Saldo_Valor = false ;
      /* Using cursor P001O7 */
      pr_default.execute(5, new Object[] {new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons, new Short(A577Kard_Regi_Cod), A578Kard_Cent_Cod, new Boolean(n590Kard_Saldo_Cant), new Integer(A590Kard_Saldo_Cant), new Boolean(n589Kard_Saldo_Valor), A589Kard_Saldo_Valor});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_KARDEX") ;
      if ( (pr_default.getStatus(5) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         AV23SWKardex = (short)(1) ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pratifientdev");
   }

   public void S173( )
   {
      /* 'ACTUALIZARKARDEX' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P001O8 */
      pr_default.execute(6, new Object[] {new Long(AV17TDet_Cantidad), AV18TDet_ValorTotal, new Long(AV9Tran_RegionId), new Long(AV10Tran_CentroCostoId), AV13Tran_CodAlmaDestino, AV14Tran_CodBodeDestino, AV16Elem_Consecutivo});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_KARDEX") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_KARDEX") ;
      /* End optimized UPDATE. */
   }

   public void S183( )
   {
      /* 'MOVIMIENTOKARDEX' Routine */
      AV35SWMoviKardex = (short)(0) ;
      /*
         INSERT RECORD ON TABLE KARDEX_MOVIMIENTO

      */
      A85Kard_Regi_Id = AV9Tran_RegionId ;
      A86Kard_Cent_Id = AV10Tran_CentroCostoId ;
      A87Kard_Alm_Cod = AV13Tran_CodAlmaDestino ;
      A88Kard_Bod_Cod = AV14Tran_CodBodeDestino ;
      A89Kard_Elem_Cons = AV16Elem_Consecutivo ;
      A90Mov_Trans = AV24pTran_Id ;
      A579Mov_Tpmp_Codigo = AV15Tran_CodigoMovimiento ;
      A580Mov_Fecha = GXutil.serverDate( context, remoteHandle, "DEFAULT") ;
      A582Mov_Entrada_Cant = (int)(AV17TDet_Cantidad) ;
      n582Mov_Entrada_Cant = false ;
      A583Mov_Entrada_Valor = AV18TDet_ValorTotal ;
      n583Mov_Entrada_Valor = false ;
      /* Using cursor P001O9 */
      pr_default.execute(7, new Object[] {new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons, new Long(A90Mov_Trans), A580Mov_Fecha, A579Mov_Tpmp_Codigo, new Boolean(n582Mov_Entrada_Cant), new Integer(A582Mov_Entrada_Cant), new Boolean(n583Mov_Entrada_Valor), A583Mov_Entrada_Valor});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("KARDEX_MOVIMIENTO") ;
      if ( (pr_default.getStatus(7) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         AV35SWMoviKardex = (short)(1) ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pratifientdev");
   }

   public void S193( )
   {
      /* 'ACTUALIZARMOVIKARDEX' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P001O10 */
      pr_default.execute(8, new Object[] {new Long(AV17TDet_Cantidad), AV18TDet_ValorTotal, new Long(AV9Tran_RegionId), new Long(AV10Tran_CentroCostoId), AV13Tran_CodAlmaDestino, AV14Tran_CodBodeDestino, AV16Elem_Consecutivo, new Long(AV24pTran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("KARDEX_MOVIMIENTO") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("KARDEX_MOVIMIENTO") ;
      /* End optimized UPDATE. */
   }

   public void S141( )
   {
      /* 'RATIFICATRANSACCION' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P001O11 */
      pr_default.execute(9, new Object[] {AV27Usuario, new Long(AV24pTran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pratifientdev");
   }

   protected void cleanup( )
   {
      this.aP0[0] = pratifientdev.this.AV24pTran_Id;
      this.aP1[0] = pratifientdev.this.AV25Modo;
      this.aP2[0] = pratifientdev.this.AV26pTran_TipoEntra;
      this.aP3[0] = pratifientdev.this.AV27Usuario;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pratifientdev");
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
      P001O2_A46Tran_Id = new long[1] ;
      P001O2_A57Tran_RegionId = new long[1] ;
      P001O2_n57Tran_RegionId = new boolean[] {false} ;
      P001O2_A421Tran_RegionCodigo = new short[1] ;
      P001O2_n421Tran_RegionCodigo = new boolean[] {false} ;
      P001O2_A48Tran_CentroCostoId = new long[1] ;
      P001O2_A419Tran_CentroCostoCodigo = new String[] {""} ;
      P001O2_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      P001O2_A385Tran_ModuloDestino = new String[] {""} ;
      P001O2_A111Tran_CodAlmaDestino = new String[] {""} ;
      P001O2_A387Tran_CodBodeDestino = new String[] {""} ;
      P001O2_A49Tran_CodigoMovimiento = new String[] {""} ;
      P001O2_A52Tran_IdCuentadanteDestino = new long[1] ;
      P001O2_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      P001O2_A859Tran_EntidadGobierno = new String[] {""} ;
      P001O2_n859Tran_EntidadGobierno = new boolean[] {false} ;
      A419Tran_CentroCostoCodigo = "" ;
      A385Tran_ModuloDestino = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A49Tran_CodigoMovimiento = "" ;
      A859Tran_EntidadGobierno = "" ;
      AV11Tran_CentroCostoCodigo = "" ;
      AV12Tran_ModuloDestino = "" ;
      AV13Tran_CodAlmaDestino = "" ;
      AV14Tran_CodBodeDestino = "" ;
      AV15Tran_CodigoMovimiento = "" ;
      AV37Tran_EntidadGobierno = "" ;
      P001O3_A46Tran_Id = new long[1] ;
      P001O3_A66Elem_Consecutivo = new String[] {""} ;
      P001O3_A487TDet_Cantidad = new long[1] ;
      P001O3_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001O3_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001O3_A490TDet_PlacaNumero = new String[] {""} ;
      P001O3_n490TDet_PlacaNumero = new boolean[] {false} ;
      P001O3_A491TDet_PlacaPadre = new String[] {""} ;
      P001O3_n491TDet_PlacaPadre = new boolean[] {false} ;
      P001O3_A505TDet_EsPadre = new String[] {""} ;
      P001O3_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001O3_n657TDet_Otros_Costos = new boolean[] {false} ;
      P001O3_A653TDet_Valor_Presente = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001O3_n653TDet_Valor_Presente = new boolean[] {false} ;
      P001O3_A654TDet_Valor_Futuro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001O3_n654TDet_Valor_Futuro = new boolean[] {false} ;
      P001O3_A655TDet_Taza = new short[1] ;
      P001O3_n655TDet_Taza = new boolean[] {false} ;
      P001O3_A656TDet_Plazo_N = new byte[1] ;
      P001O3_n656TDet_Plazo_N = new boolean[] {false} ;
      P001O3_A817TDet_PlacaRecuperada = new String[] {""} ;
      P001O3_n817TDet_PlacaRecuperada = new boolean[] {false} ;
      P001O3_A69TDet_Consecutivo = new long[1] ;
      A66Elem_Consecutivo = "" ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      A505TDet_EsPadre = "" ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      A817TDet_PlacaRecuperada = "" ;
      AV16Elem_Consecutivo = "" ;
      AV18TDet_ValorTotal = DecimalUtil.ZERO ;
      AV19TDet_ValorUnitario = DecimalUtil.ZERO ;
      AV20TDet_PlacaNumero = "" ;
      AV21TDet_PlacaPadre = "" ;
      AV22TDet_EsPadre = "" ;
      AV30TDet_Otros_Costos = DecimalUtil.ZERO ;
      AV31TDet_Valor_Presente = DecimalUtil.ZERO ;
      AV32TDet_Valor_Futuro = DecimalUtil.ZERO ;
      AV36TDet_PlacaRecuperada = "" ;
      A67Invd_NumeroPlaca = "" ;
      A412Invd_ModuloAlmacen = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A414Invd_BodegaCodigo = "" ;
      A463Invd_Estado = "" ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      A466Invd_FechaAdquisicion = GXutil.nullDate() ;
      A68Invd_PlacaPadre = "" ;
      A501Invd_EsPlacaPadre = "" ;
      A628Otros_Costos_Dev = DecimalUtil.ZERO ;
      A624Costo_Desmante = DecimalUtil.ZERO ;
      A625Variable_VF = DecimalUtil.ZERO ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      A818Invd_PlacaRecuperada = "" ;
      A858Invd_EntidadGobierno = "" ;
      Gx_emsg = "" ;
      P001O6_A66Elem_Consecutivo = new String[] {""} ;
      P001O6_A632Vida_Util = new short[1] ;
      P001O6_n632Vida_Util = new boolean[] {false} ;
      A578Kard_Cent_Cod = "" ;
      A87Kard_Alm_Cod = "" ;
      A88Kard_Bod_Cod = "" ;
      A89Kard_Elem_Cons = "" ;
      A589Kard_Saldo_Valor = DecimalUtil.ZERO ;
      A579Mov_Tpmp_Codigo = "" ;
      A580Mov_Fecha = GXutil.nullDate() ;
      A583Mov_Entrada_Valor = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pratifientdev__default(),
         new Object[] {
             new Object[] {
            P001O2_A46Tran_Id, P001O2_A57Tran_RegionId, P001O2_n57Tran_RegionId, P001O2_A421Tran_RegionCodigo, P001O2_n421Tran_RegionCodigo, P001O2_A48Tran_CentroCostoId, P001O2_A419Tran_CentroCostoCodigo, P001O2_n419Tran_CentroCostoCodigo, P001O2_A385Tran_ModuloDestino, P001O2_A111Tran_CodAlmaDestino,
            P001O2_A387Tran_CodBodeDestino, P001O2_A49Tran_CodigoMovimiento, P001O2_A52Tran_IdCuentadanteDestino, P001O2_n52Tran_IdCuentadanteDestino, P001O2_A859Tran_EntidadGobierno, P001O2_n859Tran_EntidadGobierno
            }
            , new Object[] {
            P001O3_A46Tran_Id, P001O3_A66Elem_Consecutivo, P001O3_A487TDet_Cantidad, P001O3_A489TDet_ValorTotal, P001O3_A488TDet_ValorUnitario, P001O3_A490TDet_PlacaNumero, P001O3_n490TDet_PlacaNumero, P001O3_A491TDet_PlacaPadre, P001O3_n491TDet_PlacaPadre, P001O3_A505TDet_EsPadre,
            P001O3_A657TDet_Otros_Costos, P001O3_n657TDet_Otros_Costos, P001O3_A653TDet_Valor_Presente, P001O3_n653TDet_Valor_Presente, P001O3_A654TDet_Valor_Futuro, P001O3_n654TDet_Valor_Futuro, P001O3_A655TDet_Taza, P001O3_n655TDet_Taza, P001O3_A656TDet_Plazo_N, P001O3_n656TDet_Plazo_N,
            P001O3_A817TDet_PlacaRecuperada, P001O3_n817TDet_PlacaRecuperada, P001O3_A69TDet_Consecutivo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P001O6_A66Elem_Consecutivo, P001O6_A632Vida_Util, P001O6_n632Vida_Util
            }
            , new Object[] {
            }
            , new Object[] {
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

   private byte A656TDet_Plazo_N ;
   private byte AV34TDet_Plazo_N ;
   private short A421Tran_RegionCodigo ;
   private short AV8Tran_RegionCodigo ;
   private short A655TDet_Taza ;
   private short AV33TDet_Taza ;
   private short AV23SWKardex ;
   private short AV35SWMoviKardex ;
   private short A626Variable_I ;
   private short A627Variable_N ;
   private short A631Vida_Util_Actual ;
   private short AV29Vida_Util ;
   private short A630Vida_Util_Inicial ;
   private short Gx_err ;
   private short A632Vida_Util ;
   private short A577Kard_Regi_Cod ;
   private int GX_INS16 ;
   private int GX_INS50 ;
   private int A590Kard_Saldo_Cant ;
   private int GX_INS62 ;
   private int A582Mov_Entrada_Cant ;
   private long AV24pTran_Id ;
   private long A46Tran_Id ;
   private long A57Tran_RegionId ;
   private long A48Tran_CentroCostoId ;
   private long A52Tran_IdCuentadanteDestino ;
   private long AV9Tran_RegionId ;
   private long AV10Tran_CentroCostoId ;
   private long AV28Tran_IdCuentadanteDestino ;
   private long A487TDet_Cantidad ;
   private long A69TDet_Consecutivo ;
   private long AV17TDet_Cantidad ;
   private long A410Invd_RegionalId ;
   private long A411Invd_CentroCostoId ;
   private long A43Cuen_Identificacion ;
   private long A85Kard_Regi_Id ;
   private long A86Kard_Cent_Id ;
   private long A90Mov_Trans ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal A654TDet_Valor_Futuro ;
   private java.math.BigDecimal AV18TDet_ValorTotal ;
   private java.math.BigDecimal AV19TDet_ValorUnitario ;
   private java.math.BigDecimal AV30TDet_Otros_Costos ;
   private java.math.BigDecimal AV31TDet_Valor_Presente ;
   private java.math.BigDecimal AV32TDet_Valor_Futuro ;
   private java.math.BigDecimal A465Invd_ValorAdquisicion ;
   private java.math.BigDecimal A628Otros_Costos_Dev ;
   private java.math.BigDecimal A624Costo_Desmante ;
   private java.math.BigDecimal A625Variable_VF ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
   private java.math.BigDecimal A589Kard_Saldo_Valor ;
   private java.math.BigDecimal A583Mov_Entrada_Valor ;
   private String AV25Modo ;
   private String AV26pTran_TipoEntra ;
   private String scmdbuf ;
   private String A501Invd_EsPlacaPadre ;
   private String Gx_emsg ;
   private java.util.Date A466Invd_FechaAdquisicion ;
   private java.util.Date A580Mov_Fecha ;
   private boolean returnInSub ;
   private boolean n57Tran_RegionId ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n859Tran_EntidadGobierno ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n653TDet_Valor_Presente ;
   private boolean n654TDet_Valor_Futuro ;
   private boolean n655TDet_Taza ;
   private boolean n656TDet_Plazo_N ;
   private boolean n817TDet_PlacaRecuperada ;
   private boolean n463Invd_Estado ;
   private boolean n465Invd_ValorAdquisicion ;
   private boolean n466Invd_FechaAdquisicion ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean n43Cuen_Identificacion ;
   private boolean n628Otros_Costos_Dev ;
   private boolean n624Costo_Desmante ;
   private boolean n625Variable_VF ;
   private boolean n626Variable_I ;
   private boolean n627Variable_N ;
   private boolean n631Vida_Util_Actual ;
   private boolean n630Vida_Util_Inicial ;
   private boolean n818Invd_PlacaRecuperada ;
   private boolean n858Invd_EntidadGobierno ;
   private boolean n632Vida_Util ;
   private boolean n590Kard_Saldo_Cant ;
   private boolean n589Kard_Saldo_Valor ;
   private boolean n582Mov_Entrada_Cant ;
   private boolean n583Mov_Entrada_Valor ;
   private String AV27Usuario ;
   private String A419Tran_CentroCostoCodigo ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A49Tran_CodigoMovimiento ;
   private String A859Tran_EntidadGobierno ;
   private String AV11Tran_CentroCostoCodigo ;
   private String AV12Tran_ModuloDestino ;
   private String AV13Tran_CodAlmaDestino ;
   private String AV14Tran_CodBodeDestino ;
   private String AV15Tran_CodigoMovimiento ;
   private String AV37Tran_EntidadGobierno ;
   private String A66Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private String A505TDet_EsPadre ;
   private String A817TDet_PlacaRecuperada ;
   private String AV16Elem_Consecutivo ;
   private String AV20TDet_PlacaNumero ;
   private String AV21TDet_PlacaPadre ;
   private String AV22TDet_EsPadre ;
   private String AV36TDet_PlacaRecuperada ;
   private String A67Invd_NumeroPlaca ;
   private String A412Invd_ModuloAlmacen ;
   private String A413Invd_AlmacenCodigo ;
   private String A414Invd_BodegaCodigo ;
   private String A463Invd_Estado ;
   private String A68Invd_PlacaPadre ;
   private String A818Invd_PlacaRecuperada ;
   private String A858Invd_EntidadGobierno ;
   private String A578Kard_Cent_Cod ;
   private String A87Kard_Alm_Cod ;
   private String A88Kard_Bod_Cod ;
   private String A89Kard_Elem_Cons ;
   private String A579Mov_Tpmp_Codigo ;
   private long[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private long[] P001O2_A46Tran_Id ;
   private long[] P001O2_A57Tran_RegionId ;
   private boolean[] P001O2_n57Tran_RegionId ;
   private short[] P001O2_A421Tran_RegionCodigo ;
   private boolean[] P001O2_n421Tran_RegionCodigo ;
   private long[] P001O2_A48Tran_CentroCostoId ;
   private String[] P001O2_A419Tran_CentroCostoCodigo ;
   private boolean[] P001O2_n419Tran_CentroCostoCodigo ;
   private String[] P001O2_A385Tran_ModuloDestino ;
   private String[] P001O2_A111Tran_CodAlmaDestino ;
   private String[] P001O2_A387Tran_CodBodeDestino ;
   private String[] P001O2_A49Tran_CodigoMovimiento ;
   private long[] P001O2_A52Tran_IdCuentadanteDestino ;
   private boolean[] P001O2_n52Tran_IdCuentadanteDestino ;
   private String[] P001O2_A859Tran_EntidadGobierno ;
   private boolean[] P001O2_n859Tran_EntidadGobierno ;
   private long[] P001O3_A46Tran_Id ;
   private String[] P001O3_A66Elem_Consecutivo ;
   private long[] P001O3_A487TDet_Cantidad ;
   private java.math.BigDecimal[] P001O3_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] P001O3_A488TDet_ValorUnitario ;
   private String[] P001O3_A490TDet_PlacaNumero ;
   private boolean[] P001O3_n490TDet_PlacaNumero ;
   private String[] P001O3_A491TDet_PlacaPadre ;
   private boolean[] P001O3_n491TDet_PlacaPadre ;
   private String[] P001O3_A505TDet_EsPadre ;
   private java.math.BigDecimal[] P001O3_A657TDet_Otros_Costos ;
   private boolean[] P001O3_n657TDet_Otros_Costos ;
   private java.math.BigDecimal[] P001O3_A653TDet_Valor_Presente ;
   private boolean[] P001O3_n653TDet_Valor_Presente ;
   private java.math.BigDecimal[] P001O3_A654TDet_Valor_Futuro ;
   private boolean[] P001O3_n654TDet_Valor_Futuro ;
   private short[] P001O3_A655TDet_Taza ;
   private boolean[] P001O3_n655TDet_Taza ;
   private byte[] P001O3_A656TDet_Plazo_N ;
   private boolean[] P001O3_n656TDet_Plazo_N ;
   private String[] P001O3_A817TDet_PlacaRecuperada ;
   private boolean[] P001O3_n817TDet_PlacaRecuperada ;
   private long[] P001O3_A69TDet_Consecutivo ;
   private String[] P001O6_A66Elem_Consecutivo ;
   private short[] P001O6_A632Vida_Util ;
   private boolean[] P001O6_n632Vida_Util ;
}

final  class pratifientdev__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001O2", "SELECT T1.Tran_Id, T1.Tran_RegionId AS Tran_RegionId, T2.Regi_Cod AS Tran_RegionCodigo, T1.Tran_CentroCostoId AS Tran_CentroCostoId, T3.Cent_Codigo AS Tran_CentroCostoCodigo, T1.Tran_ModuloDestino, T1.Tran_CodAlmaDestino, T1.Tran_CodBodeDestino, T1.Tran_CodigoMovimiento, T1.Tran_IdCuentadanteDestino, T1.Tran_EntidadGobierno FROM ((ALM_TRANSACCION T1 LEFT JOIN GEN_REGIONAL T2 ON T2.Regi_Id = T1.Tran_RegionId) INNER JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = T1.Tran_CentroCostoId) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001O3", "SELECT Tran_Id, Elem_Consecutivo, TDet_Cantidad, TDet_ValorTotal, TDet_ValorUnitario, TDet_PlacaNumero, TDet_PlacaPadre, TDet_EsPadre, TDet_Otros_Costos, TDet_Valor_Presente, TDet_Valor_Futuro, TDet_Taza, TDet_Plazo_N, TDet_PlacaRecuperada, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P001O4", "INSERT INTO ALM_INVENTARIO_DEVOLUTIVO(Elem_Consecutivo, Invd_NumeroPlaca, Invd_RegionalId, Invd_CentroCostoId, Invd_ModuloAlmacen, Invd_AlmacenCodigo, Invd_BodegaCodigo, Invd_Estado, Invd_ValorAdquisicion, Invd_FechaAdquisicion, Invd_PlacaPadre, Invd_EsPlacaPadre, Cuen_Identificacion, Otros_Costos_Dev, Costo_Desmante, Variable_VF, Variable_I, Variable_N, Costo_Total_Dev, Vida_Util_Inicial, Vida_Util_Actual, Invd_PlacaRecuperada, Invd_EntidadGobierno, Invd_FechaServicio, Invd_AreadanteCodigo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new UpdateCursor("P001O5", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_Estado='E'  WHERE Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001O6", "SELECT Elem_Consecutivo, Vida_Util FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ORDER BY Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001O7", "INSERT INTO ALM_INV_KARDEX(Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons, Kard_Regi_Cod, Kard_Cent_Cod, Kard_Saldo_Cant, Kard_Saldo_Valor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_KARDEX")
         ,new UpdateCursor("P001O8", "UPDATE ALM_INV_KARDEX SET Kard_Saldo_Cant=Kard_Saldo_Cant + ?, Kard_Saldo_Valor=Kard_Saldo_Valor + ?  WHERE Kard_Regi_Id = ? and Kard_Cent_Id = ? and Kard_Alm_Cod = ? and Kard_Bod_Cod = ? and Kard_Elem_Cons = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_KARDEX")
         ,new UpdateCursor("P001O9", "INSERT INTO KARDEX_MOVIMIENTO(Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons, Mov_Trans, Mov_Fecha, Mov_Tpmp_Codigo, Mov_Entrada_Cant, Mov_Entrada_Valor, Mov_Salida_Cant, Mov_Salida_Valor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "KARDEX_MOVIMIENTO")
         ,new UpdateCursor("P001O10", "UPDATE KARDEX_MOVIMIENTO SET Mov_Entrada_Cant=Mov_Entrada_Cant + ?, Mov_Entrada_Valor=Mov_Entrada_Valor + ?  WHERE Kard_Regi_Id = ? and Kard_Cent_Id = ? and Kard_Alm_Cod = ? and Kard_Bod_Cod = ? and Kard_Elem_Cons = ? and Mov_Trans = ?", GX_NOMASK + GX_MASKLOOPLOCK, "KARDEX_MOVIMIENTO")
         ,new UpdateCursor("P001O11", "UPDATE ALM_TRANSACCION SET Tran_FechaRegistro=(SYSDATE), Tran_Estado='R', Tran_FechaRatificacion=(SYSDATE), Tran_UsuarioRatifica=RTRIM(LTRIM(?))  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((long[]) buf[12])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2) ;
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(15) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 9, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setVarchar(5, (String)parms[4], 8, false);
               stmt.setVarchar(6, (String)parms[5], 2, false);
               stmt.setVarchar(7, (String)parms[6], 3, false);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[14], 30);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(13, ((Number) parms[18]).longValue(), 0);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[28]).shortValue());
               }
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[29], 2);
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[35], 30);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[37], 2);
               }
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 9);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 3, false);
               stmt.setVarchar(5, (String)parms[4], 9, false);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 16, false);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setVarchar(5, (String)parms[4], 2);
               stmt.setVarchar(6, (String)parms[5], 3);
               stmt.setVarchar(7, (String)parms[6], 9);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               stmt.setVarchar(4, (String)parms[3], 3, false);
               stmt.setVarchar(5, (String)parms[4], 9, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setVarchar(8, (String)parms[7], 3, false);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[11], 2);
               }
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setVarchar(5, (String)parms[4], 2);
               stmt.setVarchar(6, (String)parms[5], 3);
               stmt.setVarchar(7, (String)parms[6], 9);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 30);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

