/*
               File: RatificarSalida
        Description: Ratificar Salida
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:5.2
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ratificarsalida extends GXProcedure
{
   public ratificarsalida( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ratificarsalida.class ), "" );
   }

   public ratificarsalida( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 )
   {
      ratificarsalida.this.AV17Tran_Id = aP0[0];
      this.aP0 = aP0;
      ratificarsalida.this.AV21Usuario = aP1[0];
      this.aP1 = aP1;
      ratificarsalida.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long[] aP0 ,
                             String[] aP1 )
   {
      ratificarsalida.this.AV17Tran_Id = aP0[0];
      this.aP0 = aP0;
      ratificarsalida.this.AV21Usuario = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001N2 */
      pr_default.execute(0, new Object[] {new Long(AV17Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = P001N2_A46Tran_Id[0] ;
         A57Tran_RegionId = P001N2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P001N2_n57Tran_RegionId[0] ;
         A421Tran_RegionCodigo = P001N2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001N2_n421Tran_RegionCodigo[0] ;
         A48Tran_CentroCostoId = P001N2_A48Tran_CentroCostoId[0] ;
         A419Tran_CentroCostoCodigo = P001N2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P001N2_n419Tran_CentroCostoCodigo[0] ;
         A518Tran_RegionIdDestino = P001N2_A518Tran_RegionIdDestino[0] ;
         n518Tran_RegionIdDestino = P001N2_n518Tran_RegionIdDestino[0] ;
         A519Tran_RegionCodigoDestino = P001N2_A519Tran_RegionCodigoDestino[0] ;
         n519Tran_RegionCodigoDestino = P001N2_n519Tran_RegionCodigoDestino[0] ;
         A50Tran_CentroCostoIdDestino = P001N2_A50Tran_CentroCostoIdDestino[0] ;
         n50Tran_CentroCostoIdDestino = P001N2_n50Tran_CentroCostoIdDestino[0] ;
         A516Tran_CentroCostoCodigoDestino = P001N2_A516Tran_CentroCostoCodigoDestino[0] ;
         n516Tran_CentroCostoCodigoDestino = P001N2_n516Tran_CentroCostoCodigoDestino[0] ;
         A109Tran_CodAlmaOrigen = P001N2_A109Tran_CodAlmaOrigen[0] ;
         A110Tran_ModuloOrigen = P001N2_A110Tran_ModuloOrigen[0] ;
         A112Tran_CodBodeOrigen = P001N2_A112Tran_CodBodeOrigen[0] ;
         A385Tran_ModuloDestino = P001N2_A385Tran_ModuloDestino[0] ;
         A111Tran_CodAlmaDestino = P001N2_A111Tran_CodAlmaDestino[0] ;
         A387Tran_CodBodeDestino = P001N2_A387Tran_CodBodeDestino[0] ;
         A482Tran_TipoElemento = P001N2_A482Tran_TipoElemento[0] ;
         A49Tran_CodigoMovimiento = P001N2_A49Tran_CodigoMovimiento[0] ;
         A52Tran_IdCuentadanteDestino = P001N2_A52Tran_IdCuentadanteDestino[0] ;
         n52Tran_IdCuentadanteDestino = P001N2_n52Tran_IdCuentadanteDestino[0] ;
         A407Tran_AreadanteCodigo = P001N2_A407Tran_AreadanteCodigo[0] ;
         n407Tran_AreadanteCodigo = P001N2_n407Tran_AreadanteCodigo[0] ;
         A421Tran_RegionCodigo = P001N2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001N2_n421Tran_RegionCodigo[0] ;
         A419Tran_CentroCostoCodigo = P001N2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P001N2_n419Tran_CentroCostoCodigo[0] ;
         A519Tran_RegionCodigoDestino = P001N2_A519Tran_RegionCodigoDestino[0] ;
         n519Tran_RegionCodigoDestino = P001N2_n519Tran_RegionCodigoDestino[0] ;
         A516Tran_CentroCostoCodigoDestino = P001N2_A516Tran_CentroCostoCodigoDestino[0] ;
         n516Tran_CentroCostoCodigoDestino = P001N2_n516Tran_CentroCostoCodigoDestino[0] ;
         AV24Tran_RegionId = A57Tran_RegionId ;
         AV25Tran_RegionCodigo = A421Tran_RegionCodigo ;
         AV12Tran_CentroCostoId = A48Tran_CentroCostoId ;
         AV26Tran_CentroCostoCodigo = A419Tran_CentroCostoCodigo ;
         AV37Tran_RegionIdDestino = A518Tran_RegionIdDestino ;
         AV40Tran_RegionCodigoDestino = A519Tran_RegionCodigoDestino ;
         AV38Tran_CentroCostoIdDestino = A50Tran_CentroCostoIdDestino ;
         AV41Tran_CentroCostoCodigoDestino = A516Tran_CentroCostoCodigoDestino ;
         AV14Tran_CodAlmaOrigen = A109Tran_CodAlmaOrigen ;
         AV19Tran_ModuloOrigen = A110Tran_ModuloOrigen ;
         AV16Tran_CodBodeOrigen = A112Tran_CodBodeOrigen ;
         AV18Tran_ModuloDestino = A385Tran_ModuloDestino ;
         AV13Tran_CodAlmaDestino = A111Tran_CodAlmaDestino ;
         AV15Tran_CodBodeDestino = A387Tran_CodBodeDestino ;
         AV20Tran_TipoElemento = A482Tran_TipoElemento ;
         AV27Tran_CodigoMovimiento = A49Tran_CodigoMovimiento ;
         AV28Tran_IdCuentadanteDestino = A52Tran_IdCuentadanteDestino ;
         AV39Tran_AreadanteCodigo = A407Tran_AreadanteCodigo ;
         /* Using cursor P001N3 */
         pr_default.execute(1, new Object[] {new Long(A46Tran_Id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A66Elem_Consecutivo = P001N3_A66Elem_Consecutivo[0] ;
            A69TDet_Consecutivo = P001N3_A69TDet_Consecutivo[0] ;
            A487TDet_Cantidad = P001N3_A487TDet_Cantidad[0] ;
            A490TDet_PlacaNumero = P001N3_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = P001N3_n490TDet_PlacaNumero[0] ;
            A491TDet_PlacaPadre = P001N3_A491TDet_PlacaPadre[0] ;
            n491TDet_PlacaPadre = P001N3_n491TDet_PlacaPadre[0] ;
            A505TDet_EsPadre = P001N3_A505TDet_EsPadre[0] ;
            A488TDet_ValorUnitario = P001N3_A488TDet_ValorUnitario[0] ;
            A489TDet_ValorTotal = P001N3_A489TDet_ValorTotal[0] ;
            AV29Elem_Consecutivo = A66Elem_Consecutivo ;
            AV30TDet_Consecutivo = A69TDet_Consecutivo ;
            AV8TDet_Cantidad = A487TDet_Cantidad ;
            AV10TDet_PlacaNumero = A490TDet_PlacaNumero ;
            AV11TDet_PlacaPadre = A491TDet_PlacaPadre ;
            AV9TDet_EsPadre = A505TDet_EsPadre ;
            AV22TDet_ValorUnitario = A488TDet_ValorUnitario ;
            AV23TDet_ValorTotal = A489TDet_ValorTotal ;
            /* Execute user subroutine: 'MOVIMIENTO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'KARDEX' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P001N4 */
      pr_default.execute(2, new Object[] {new Long(AV17Tran_Id)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxt1N4 = (byte)(0) ;
         A46Tran_Id = P001N4_A46Tran_Id[0] ;
         A58Tran_Estado = P001N4_A58Tran_Estado[0] ;
         n58Tran_Estado = P001N4_n58Tran_Estado[0] ;
         A390Tran_FechaRatificacion = P001N4_A390Tran_FechaRatificacion[0] ;
         n390Tran_FechaRatificacion = P001N4_n390Tran_FechaRatificacion[0] ;
         A391Tran_UsuarioRatifica = P001N4_A391Tran_UsuarioRatifica[0] ;
         n391Tran_UsuarioRatifica = P001N4_n391Tran_UsuarioRatifica[0] ;
         A58Tran_Estado = "R" ;
         n58Tran_Estado = false ;
         A390Tran_FechaRatificacion = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n390Tran_FechaRatificacion = false ;
         A391Tran_UsuarioRatifica = AV21Usuario ;
         n391Tran_UsuarioRatifica = false ;
         gxt1N4 = (byte)(1) ;
         /* Using cursor P001N5 */
         pr_default.execute(3, new Object[] {new Boolean(n58Tran_Estado), A58Tran_Estado, new Boolean(n390Tran_FechaRatificacion), A390Tran_FechaRatificacion, new Boolean(n391Tran_UsuarioRatifica), A391Tran_UsuarioRatifica, new Long(A46Tran_Id)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
         if ( gxt1N4 == 1 )
         {
            Application.commit(context, remoteHandle, "DEFAULT",pr_default, "ratificarsalida");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'MOVIMIENTO' Routine */
      if ( GXutil.strcmp(AV20Tran_TipoElemento, "C") == 0 )
      {
         /* Using cursor P001N6 */
         pr_default.execute(4, new Object[] {new Long(AV17Tran_Id), new Long(AV30TDet_Consecutivo)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A69TDet_Consecutivo = P001N6_A69TDet_Consecutivo[0] ;
            A46Tran_Id = P001N6_A46Tran_Id[0] ;
            A71Tran_Entrada = P001N6_A71Tran_Entrada[0] ;
            A72Nro_Linea = P001N6_A72Nro_Linea[0] ;
            A687Tran_Cantidad = P001N6_A687Tran_Cantidad[0] ;
            n687Tran_Cantidad = P001N6_n687Tran_Cantidad[0] ;
            AV31Tran_Entrada = A71Tran_Entrada ;
            AV32Nro_Linea = A72Nro_Linea ;
            AV33Tran_Cantidad = A687Tran_Cantidad ;
            /* Execute user subroutine: 'CONSUMO' */
            S125 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               returnInSub = true;
               if (true) return;
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      else if ( GXutil.strcmp(AV20Tran_TipoElemento, "D") == 0 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P001N7 */
         pr_default.execute(5, new Object[] {new Long(AV37Tran_RegionIdDestino), new Long(AV38Tran_CentroCostoIdDestino), AV18Tran_ModuloDestino, AV13Tran_CodAlmaDestino, AV15Tran_CodBodeDestino, new Boolean(n43Cuen_Identificacion), new Long(AV28Tran_IdCuentadanteDestino), new Boolean(n711Invd_AreadanteCodigo), AV39Tran_AreadanteCodigo, AV29Elem_Consecutivo, AV10TDet_PlacaNumero});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INVENTARIO_DEVOLUTIVO") ;
         /* End optimized UPDATE. */
      }
   }

   public void S125( )
   {
      /* 'CONSUMO' Routine */
      /* Using cursor P001N8 */
      pr_default.execute(6, new Object[] {new Long(AV24Tran_RegionId), new Long(AV12Tran_CentroCostoId), AV19Tran_ModuloOrigen, AV14Tran_CodAlmaOrigen, AV16Tran_CodBodeOrigen, new Long(AV31Tran_Entrada), AV29Elem_Consecutivo, new Integer(AV32Nro_Linea)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A94Num_Linea = P001N8_A94Num_Linea[0] ;
         A66Elem_Consecutivo = P001N8_A66Elem_Consecutivo[0] ;
         A93Trans_Id = P001N8_A93Trans_Id[0] ;
         A31Bode_Codigo = P001N8_A31Bode_Codigo[0] ;
         A28Alma_Codigo = P001N8_A28Alma_Codigo[0] ;
         A27Alma_Modulo = P001N8_A27Alma_Modulo[0] ;
         A92Centro_Id = P001N8_A92Centro_Id[0] ;
         A91Regional = P001N8_A91Regional[0] ;
         A619Cantidad_Transito = P001N8_A619Cantidad_Transito[0] ;
         n619Cantidad_Transito = P001N8_n619Cantidad_Transito[0] ;
         A620Valor_Unitario = P001N8_A620Valor_Unitario[0] ;
         A622Costo_Total = P001N8_A622Costo_Total[0] ;
         A619Cantidad_Transito = (int)(A619Cantidad_Transito-AV33Tran_Cantidad) ;
         n619Cantidad_Transito = false ;
         AV34Valor_Unitario = A620Valor_Unitario ;
         AV36Costo_Total = A622Costo_Total ;
         /* Using cursor P001N9 */
         pr_default.execute(7, new Object[] {new Boolean(n619Cantidad_Transito), new Integer(A619Cantidad_Transito), new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_CON") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      /*
         INSERT RECORD ON TABLE ALM_INV_CON

      */
      A91Regional = AV37Tran_RegionIdDestino ;
      A92Centro_Id = AV38Tran_CentroCostoIdDestino ;
      A27Alma_Modulo = AV18Tran_ModuloDestino ;
      A28Alma_Codigo = AV13Tran_CodAlmaDestino ;
      A31Bode_Codigo = AV15Tran_CodBodeDestino ;
      A93Trans_Id = AV31Tran_Entrada ;
      A66Elem_Consecutivo = AV29Elem_Consecutivo ;
      A94Num_Linea = AV32Nro_Linea ;
      A618Cantidad_Diponible = AV33Tran_Cantidad ;
      n618Cantidad_Diponible = false ;
      A620Valor_Unitario = AV34Valor_Unitario ;
      A622Costo_Total = AV36Costo_Total ;
      /* Using cursor P001N10 */
      pr_default.execute(8, new Object[] {new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea), new Boolean(n618Cantidad_Diponible), new Integer(A618Cantidad_Diponible), A620Valor_Unitario, A622Costo_Total});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_CON") ;
      if ( (pr_default.getStatus(8) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P001N11 */
         pr_default.execute(9, new Object[] {new Integer(AV33Tran_Cantidad), new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_CON") ;
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_CON") ;
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   public void S131( )
   {
      /* 'KARDEX' Routine */
      AV51GXLvl114 = (byte)(0) ;
      /* Using cursor P001N12 */
      pr_default.execute(10, new Object[] {new Long(AV24Tran_RegionId), new Long(AV12Tran_CentroCostoId), AV14Tran_CodAlmaOrigen, AV16Tran_CodBodeOrigen, AV29Elem_Consecutivo});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A89Kard_Elem_Cons = P001N12_A89Kard_Elem_Cons[0] ;
         A88Kard_Bod_Cod = P001N12_A88Kard_Bod_Cod[0] ;
         A87Kard_Alm_Cod = P001N12_A87Kard_Alm_Cod[0] ;
         A86Kard_Cent_Id = P001N12_A86Kard_Cent_Id[0] ;
         A85Kard_Regi_Id = P001N12_A85Kard_Regi_Id[0] ;
         A590Kard_Saldo_Cant = P001N12_A590Kard_Saldo_Cant[0] ;
         n590Kard_Saldo_Cant = P001N12_n590Kard_Saldo_Cant[0] ;
         A589Kard_Saldo_Valor = P001N12_A589Kard_Saldo_Valor[0] ;
         n589Kard_Saldo_Valor = P001N12_n589Kard_Saldo_Valor[0] ;
         AV51GXLvl114 = (byte)(1) ;
         A590Kard_Saldo_Cant = (int)(A590Kard_Saldo_Cant-AV8TDet_Cantidad) ;
         n590Kard_Saldo_Cant = false ;
         A589Kard_Saldo_Valor = A589Kard_Saldo_Valor.subtract(AV23TDet_ValorTotal) ;
         n589Kard_Saldo_Valor = false ;
         /* Using cursor P001N13 */
         pr_default.execute(11, new Object[] {new Boolean(n590Kard_Saldo_Cant), new Integer(A590Kard_Saldo_Cant), new Boolean(n589Kard_Saldo_Valor), A589Kard_Saldo_Valor, new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_KARDEX") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      if ( AV51GXLvl114 == 0 )
      {
         /*
            INSERT RECORD ON TABLE ALM_INV_KARDEX

         */
         A85Kard_Regi_Id = AV24Tran_RegionId ;
         A577Kard_Regi_Cod = AV25Tran_RegionCodigo ;
         A86Kard_Cent_Id = AV12Tran_CentroCostoId ;
         A578Kard_Cent_Cod = AV26Tran_CentroCostoCodigo ;
         A87Kard_Alm_Cod = AV14Tran_CodAlmaOrigen ;
         A88Kard_Bod_Cod = AV16Tran_CodBodeOrigen ;
         A89Kard_Elem_Cons = AV29Elem_Consecutivo ;
         A590Kard_Saldo_Cant = (int)(AV8TDet_Cantidad) ;
         n590Kard_Saldo_Cant = false ;
         A589Kard_Saldo_Valor = AV23TDet_ValorTotal ;
         n589Kard_Saldo_Valor = false ;
         /* Using cursor P001N14 */
         pr_default.execute(12, new Object[] {new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons, new Short(A577Kard_Regi_Cod), A578Kard_Cent_Cod, new Boolean(n590Kard_Saldo_Cant), new Integer(A590Kard_Saldo_Cant), new Boolean(n589Kard_Saldo_Valor), A589Kard_Saldo_Valor});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_KARDEX") ;
         if ( (pr_default.getStatus(12) == 1) )
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
      /*
         INSERT RECORD ON TABLE KARDEX_MOVIMIENTO

      */
      A85Kard_Regi_Id = AV24Tran_RegionId ;
      A86Kard_Cent_Id = AV12Tran_CentroCostoId ;
      A87Kard_Alm_Cod = AV14Tran_CodAlmaOrigen ;
      A88Kard_Bod_Cod = AV16Tran_CodBodeOrigen ;
      A89Kard_Elem_Cons = AV29Elem_Consecutivo ;
      A90Mov_Trans = AV17Tran_Id ;
      A579Mov_Tpmp_Codigo = AV27Tran_CodigoMovimiento ;
      A580Mov_Fecha = GXutil.serverDate( context, remoteHandle, "DEFAULT") ;
      A584Mov_Salida_Cant = (int)(AV8TDet_Cantidad) ;
      n584Mov_Salida_Cant = false ;
      A585Mov_Salida_Valor = AV23TDet_ValorTotal ;
      n585Mov_Salida_Valor = false ;
      /* Using cursor P001N15 */
      pr_default.execute(13, new Object[] {new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons, new Long(A90Mov_Trans), A580Mov_Fecha, A579Mov_Tpmp_Codigo, new Boolean(n584Mov_Salida_Cant), new Integer(A584Mov_Salida_Cant), new Boolean(n585Mov_Salida_Valor), A585Mov_Salida_Valor});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("KARDEX_MOVIMIENTO") ;
      if ( (pr_default.getStatus(13) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P001N16 */
         pr_default.execute(14, new Object[] {new Long(AV8TDet_Cantidad), AV23TDet_ValorTotal, new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons, new Long(A90Mov_Trans), A580Mov_Fecha});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("KARDEX_MOVIMIENTO") ;
         Application.getSmartCacheProvider(remoteHandle).setUpdated("KARDEX_MOVIMIENTO") ;
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      AV53GXLvl157 = (byte)(0) ;
      /* Using cursor P001N17 */
      pr_default.execute(15, new Object[] {new Long(AV37Tran_RegionIdDestino), new Long(AV38Tran_CentroCostoIdDestino), AV13Tran_CodAlmaDestino, AV15Tran_CodBodeDestino, AV29Elem_Consecutivo});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A89Kard_Elem_Cons = P001N17_A89Kard_Elem_Cons[0] ;
         A88Kard_Bod_Cod = P001N17_A88Kard_Bod_Cod[0] ;
         A87Kard_Alm_Cod = P001N17_A87Kard_Alm_Cod[0] ;
         A86Kard_Cent_Id = P001N17_A86Kard_Cent_Id[0] ;
         A85Kard_Regi_Id = P001N17_A85Kard_Regi_Id[0] ;
         A590Kard_Saldo_Cant = P001N17_A590Kard_Saldo_Cant[0] ;
         n590Kard_Saldo_Cant = P001N17_n590Kard_Saldo_Cant[0] ;
         A589Kard_Saldo_Valor = P001N17_A589Kard_Saldo_Valor[0] ;
         n589Kard_Saldo_Valor = P001N17_n589Kard_Saldo_Valor[0] ;
         AV53GXLvl157 = (byte)(1) ;
         A590Kard_Saldo_Cant = (int)(A590Kard_Saldo_Cant+AV8TDet_Cantidad) ;
         n590Kard_Saldo_Cant = false ;
         A589Kard_Saldo_Valor = A589Kard_Saldo_Valor.add(AV23TDet_ValorTotal) ;
         n589Kard_Saldo_Valor = false ;
         /* Using cursor P001N18 */
         pr_default.execute(16, new Object[] {new Boolean(n590Kard_Saldo_Cant), new Integer(A590Kard_Saldo_Cant), new Boolean(n589Kard_Saldo_Valor), A589Kard_Saldo_Valor, new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_KARDEX") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
      if ( AV53GXLvl157 == 0 )
      {
         /*
            INSERT RECORD ON TABLE ALM_INV_KARDEX

         */
         A85Kard_Regi_Id = AV37Tran_RegionIdDestino ;
         A577Kard_Regi_Cod = AV40Tran_RegionCodigoDestino ;
         A86Kard_Cent_Id = AV38Tran_CentroCostoIdDestino ;
         A578Kard_Cent_Cod = AV41Tran_CentroCostoCodigoDestino ;
         A87Kard_Alm_Cod = AV13Tran_CodAlmaDestino ;
         A88Kard_Bod_Cod = AV15Tran_CodBodeDestino ;
         A89Kard_Elem_Cons = AV29Elem_Consecutivo ;
         A590Kard_Saldo_Cant = (int)(AV8TDet_Cantidad) ;
         n590Kard_Saldo_Cant = false ;
         A589Kard_Saldo_Valor = AV23TDet_ValorTotal ;
         n589Kard_Saldo_Valor = false ;
         /* Using cursor P001N19 */
         pr_default.execute(17, new Object[] {new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons, new Short(A577Kard_Regi_Cod), A578Kard_Cent_Cod, new Boolean(n590Kard_Saldo_Cant), new Integer(A590Kard_Saldo_Cant), new Boolean(n589Kard_Saldo_Valor), A589Kard_Saldo_Valor});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_KARDEX") ;
         if ( (pr_default.getStatus(17) == 1) )
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
      /*
         INSERT RECORD ON TABLE KARDEX_MOVIMIENTO

      */
      A85Kard_Regi_Id = AV37Tran_RegionIdDestino ;
      A86Kard_Cent_Id = AV38Tran_CentroCostoIdDestino ;
      A87Kard_Alm_Cod = AV13Tran_CodAlmaDestino ;
      A88Kard_Bod_Cod = AV15Tran_CodBodeDestino ;
      A89Kard_Elem_Cons = AV29Elem_Consecutivo ;
      A90Mov_Trans = AV17Tran_Id ;
      A579Mov_Tpmp_Codigo = AV27Tran_CodigoMovimiento ;
      A580Mov_Fecha = GXutil.serverDate( context, remoteHandle, "DEFAULT") ;
      A582Mov_Entrada_Cant = (int)(AV8TDet_Cantidad) ;
      n582Mov_Entrada_Cant = false ;
      A583Mov_Entrada_Valor = AV23TDet_ValorTotal ;
      n583Mov_Entrada_Valor = false ;
      /* Using cursor P001N20 */
      pr_default.execute(18, new Object[] {new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons, new Long(A90Mov_Trans), A580Mov_Fecha, A579Mov_Tpmp_Codigo, new Boolean(n582Mov_Entrada_Cant), new Integer(A582Mov_Entrada_Cant), new Boolean(n583Mov_Entrada_Valor), A583Mov_Entrada_Valor});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("KARDEX_MOVIMIENTO") ;
      if ( (pr_default.getStatus(18) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P001N21 */
         pr_default.execute(19, new Object[] {new Long(AV8TDet_Cantidad), AV23TDet_ValorTotal, new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons, new Long(A90Mov_Trans), A580Mov_Fecha});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("KARDEX_MOVIMIENTO") ;
         Application.getSmartCacheProvider(remoteHandle).setUpdated("KARDEX_MOVIMIENTO") ;
         /* End optimized UPDATE. */
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
      this.aP0[0] = ratificarsalida.this.AV17Tran_Id;
      this.aP1[0] = ratificarsalida.this.AV21Usuario;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "ratificarsalida");
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
      P001N2_A46Tran_Id = new long[1] ;
      P001N2_A57Tran_RegionId = new long[1] ;
      P001N2_n57Tran_RegionId = new boolean[] {false} ;
      P001N2_A421Tran_RegionCodigo = new short[1] ;
      P001N2_n421Tran_RegionCodigo = new boolean[] {false} ;
      P001N2_A48Tran_CentroCostoId = new long[1] ;
      P001N2_A419Tran_CentroCostoCodigo = new String[] {""} ;
      P001N2_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      P001N2_A518Tran_RegionIdDestino = new long[1] ;
      P001N2_n518Tran_RegionIdDestino = new boolean[] {false} ;
      P001N2_A519Tran_RegionCodigoDestino = new short[1] ;
      P001N2_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      P001N2_A50Tran_CentroCostoIdDestino = new long[1] ;
      P001N2_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      P001N2_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      P001N2_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      P001N2_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P001N2_A110Tran_ModuloOrigen = new String[] {""} ;
      P001N2_A112Tran_CodBodeOrigen = new String[] {""} ;
      P001N2_A385Tran_ModuloDestino = new String[] {""} ;
      P001N2_A111Tran_CodAlmaDestino = new String[] {""} ;
      P001N2_A387Tran_CodBodeDestino = new String[] {""} ;
      P001N2_A482Tran_TipoElemento = new String[] {""} ;
      P001N2_A49Tran_CodigoMovimiento = new String[] {""} ;
      P001N2_A52Tran_IdCuentadanteDestino = new long[1] ;
      P001N2_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      P001N2_A407Tran_AreadanteCodigo = new String[] {""} ;
      P001N2_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      A419Tran_CentroCostoCodigo = "" ;
      A516Tran_CentroCostoCodigoDestino = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A110Tran_ModuloOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A385Tran_ModuloDestino = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A482Tran_TipoElemento = "" ;
      A49Tran_CodigoMovimiento = "" ;
      A407Tran_AreadanteCodigo = "" ;
      AV26Tran_CentroCostoCodigo = "" ;
      AV41Tran_CentroCostoCodigoDestino = "" ;
      AV14Tran_CodAlmaOrigen = "" ;
      AV19Tran_ModuloOrigen = "" ;
      AV16Tran_CodBodeOrigen = "" ;
      AV18Tran_ModuloDestino = "" ;
      AV13Tran_CodAlmaDestino = "" ;
      AV15Tran_CodBodeDestino = "" ;
      AV20Tran_TipoElemento = "" ;
      AV27Tran_CodigoMovimiento = "" ;
      AV39Tran_AreadanteCodigo = "" ;
      P001N3_A46Tran_Id = new long[1] ;
      P001N3_A66Elem_Consecutivo = new String[] {""} ;
      P001N3_A69TDet_Consecutivo = new long[1] ;
      P001N3_A487TDet_Cantidad = new long[1] ;
      P001N3_A490TDet_PlacaNumero = new String[] {""} ;
      P001N3_n490TDet_PlacaNumero = new boolean[] {false} ;
      P001N3_A491TDet_PlacaPadre = new String[] {""} ;
      P001N3_n491TDet_PlacaPadre = new boolean[] {false} ;
      P001N3_A505TDet_EsPadre = new String[] {""} ;
      P001N3_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N3_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A66Elem_Consecutivo = "" ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      A505TDet_EsPadre = "" ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      AV29Elem_Consecutivo = "" ;
      AV10TDet_PlacaNumero = "" ;
      AV11TDet_PlacaPadre = "" ;
      AV9TDet_EsPadre = "" ;
      AV22TDet_ValorUnitario = DecimalUtil.ZERO ;
      AV23TDet_ValorTotal = DecimalUtil.ZERO ;
      P001N4_A46Tran_Id = new long[1] ;
      P001N4_A58Tran_Estado = new String[] {""} ;
      P001N4_n58Tran_Estado = new boolean[] {false} ;
      P001N4_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      P001N4_n390Tran_FechaRatificacion = new boolean[] {false} ;
      P001N4_A391Tran_UsuarioRatifica = new String[] {""} ;
      P001N4_n391Tran_UsuarioRatifica = new boolean[] {false} ;
      A58Tran_Estado = "" ;
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A391Tran_UsuarioRatifica = "" ;
      P001N6_A69TDet_Consecutivo = new long[1] ;
      P001N6_A46Tran_Id = new long[1] ;
      P001N6_A71Tran_Entrada = new long[1] ;
      P001N6_A72Nro_Linea = new int[1] ;
      P001N6_A687Tran_Cantidad = new int[1] ;
      P001N6_n687Tran_Cantidad = new boolean[] {false} ;
      A412Invd_ModuloAlmacen = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A414Invd_BodegaCodigo = "" ;
      A711Invd_AreadanteCodigo = "" ;
      P001N8_A94Num_Linea = new int[1] ;
      P001N8_A66Elem_Consecutivo = new String[] {""} ;
      P001N8_A93Trans_Id = new long[1] ;
      P001N8_A31Bode_Codigo = new String[] {""} ;
      P001N8_A28Alma_Codigo = new String[] {""} ;
      P001N8_A27Alma_Modulo = new String[] {""} ;
      P001N8_A92Centro_Id = new long[1] ;
      P001N8_A91Regional = new long[1] ;
      P001N8_A619Cantidad_Transito = new int[1] ;
      P001N8_n619Cantidad_Transito = new boolean[] {false} ;
      P001N8_A620Valor_Unitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N8_A622Costo_Total = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A31Bode_Codigo = "" ;
      A28Alma_Codigo = "" ;
      A27Alma_Modulo = "" ;
      A620Valor_Unitario = DecimalUtil.ZERO ;
      A622Costo_Total = DecimalUtil.ZERO ;
      AV34Valor_Unitario = DecimalUtil.ZERO ;
      AV36Costo_Total = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A589Kard_Saldo_Valor = DecimalUtil.ZERO ;
      A583Mov_Entrada_Valor = DecimalUtil.ZERO ;
      A578Kard_Cent_Cod = "" ;
      A87Kard_Alm_Cod = "" ;
      A88Kard_Bod_Cod = "" ;
      A89Kard_Elem_Cons = "" ;
      A579Mov_Tpmp_Codigo = "" ;
      A580Mov_Fecha = GXutil.nullDate() ;
      P001N12_A89Kard_Elem_Cons = new String[] {""} ;
      P001N12_A88Kard_Bod_Cod = new String[] {""} ;
      P001N12_A87Kard_Alm_Cod = new String[] {""} ;
      P001N12_A86Kard_Cent_Id = new long[1] ;
      P001N12_A85Kard_Regi_Id = new long[1] ;
      P001N12_A590Kard_Saldo_Cant = new int[1] ;
      P001N12_n590Kard_Saldo_Cant = new boolean[] {false} ;
      P001N12_A589Kard_Saldo_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N12_n589Kard_Saldo_Valor = new boolean[] {false} ;
      A585Mov_Salida_Valor = DecimalUtil.ZERO ;
      P001N17_A89Kard_Elem_Cons = new String[] {""} ;
      P001N17_A88Kard_Bod_Cod = new String[] {""} ;
      P001N17_A87Kard_Alm_Cod = new String[] {""} ;
      P001N17_A86Kard_Cent_Id = new long[1] ;
      P001N17_A85Kard_Regi_Id = new long[1] ;
      P001N17_A590Kard_Saldo_Cant = new int[1] ;
      P001N17_n590Kard_Saldo_Cant = new boolean[] {false} ;
      P001N17_A589Kard_Saldo_Valor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N17_n589Kard_Saldo_Valor = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.ratificarsalida__default(),
         new Object[] {
             new Object[] {
            P001N2_A46Tran_Id, P001N2_A57Tran_RegionId, P001N2_n57Tran_RegionId, P001N2_A421Tran_RegionCodigo, P001N2_n421Tran_RegionCodigo, P001N2_A48Tran_CentroCostoId, P001N2_A419Tran_CentroCostoCodigo, P001N2_n419Tran_CentroCostoCodigo, P001N2_A518Tran_RegionIdDestino, P001N2_n518Tran_RegionIdDestino,
            P001N2_A519Tran_RegionCodigoDestino, P001N2_n519Tran_RegionCodigoDestino, P001N2_A50Tran_CentroCostoIdDestino, P001N2_n50Tran_CentroCostoIdDestino, P001N2_A516Tran_CentroCostoCodigoDestino, P001N2_n516Tran_CentroCostoCodigoDestino, P001N2_A109Tran_CodAlmaOrigen, P001N2_A110Tran_ModuloOrigen, P001N2_A112Tran_CodBodeOrigen, P001N2_A385Tran_ModuloDestino,
            P001N2_A111Tran_CodAlmaDestino, P001N2_A387Tran_CodBodeDestino, P001N2_A482Tran_TipoElemento, P001N2_A49Tran_CodigoMovimiento, P001N2_A52Tran_IdCuentadanteDestino, P001N2_n52Tran_IdCuentadanteDestino, P001N2_A407Tran_AreadanteCodigo, P001N2_n407Tran_AreadanteCodigo
            }
            , new Object[] {
            P001N3_A46Tran_Id, P001N3_A66Elem_Consecutivo, P001N3_A69TDet_Consecutivo, P001N3_A487TDet_Cantidad, P001N3_A490TDet_PlacaNumero, P001N3_n490TDet_PlacaNumero, P001N3_A491TDet_PlacaPadre, P001N3_n491TDet_PlacaPadre, P001N3_A505TDet_EsPadre, P001N3_A488TDet_ValorUnitario,
            P001N3_A489TDet_ValorTotal
            }
            , new Object[] {
            P001N4_A46Tran_Id, P001N4_A58Tran_Estado, P001N4_n58Tran_Estado, P001N4_A390Tran_FechaRatificacion, P001N4_n390Tran_FechaRatificacion, P001N4_A391Tran_UsuarioRatifica, P001N4_n391Tran_UsuarioRatifica
            }
            , new Object[] {
            }
            , new Object[] {
            P001N6_A69TDet_Consecutivo, P001N6_A46Tran_Id, P001N6_A71Tran_Entrada, P001N6_A72Nro_Linea, P001N6_A687Tran_Cantidad, P001N6_n687Tran_Cantidad
            }
            , new Object[] {
            }
            , new Object[] {
            P001N8_A94Num_Linea, P001N8_A66Elem_Consecutivo, P001N8_A93Trans_Id, P001N8_A31Bode_Codigo, P001N8_A28Alma_Codigo, P001N8_A27Alma_Modulo, P001N8_A92Centro_Id, P001N8_A91Regional, P001N8_A619Cantidad_Transito, P001N8_n619Cantidad_Transito,
            P001N8_A620Valor_Unitario, P001N8_A622Costo_Total
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P001N12_A89Kard_Elem_Cons, P001N12_A88Kard_Bod_Cod, P001N12_A87Kard_Alm_Cod, P001N12_A86Kard_Cent_Id, P001N12_A85Kard_Regi_Id, P001N12_A590Kard_Saldo_Cant, P001N12_n590Kard_Saldo_Cant, P001N12_A589Kard_Saldo_Valor, P001N12_n589Kard_Saldo_Valor
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
            P001N17_A89Kard_Elem_Cons, P001N17_A88Kard_Bod_Cod, P001N17_A87Kard_Alm_Cod, P001N17_A86Kard_Cent_Id, P001N17_A85Kard_Regi_Id, P001N17_A590Kard_Saldo_Cant, P001N17_n590Kard_Saldo_Cant, P001N17_A589Kard_Saldo_Valor, P001N17_n589Kard_Saldo_Valor
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

   private byte gxt1N4 ;
   private byte AV51GXLvl114 ;
   private byte AV53GXLvl157 ;
   private short A421Tran_RegionCodigo ;
   private short A519Tran_RegionCodigoDestino ;
   private short AV25Tran_RegionCodigo ;
   private short AV40Tran_RegionCodigoDestino ;
   private short Gx_err ;
   private short A577Kard_Regi_Cod ;
   private int A72Nro_Linea ;
   private int A687Tran_Cantidad ;
   private int AV32Nro_Linea ;
   private int AV33Tran_Cantidad ;
   private int A94Num_Linea ;
   private int A619Cantidad_Transito ;
   private int GX_INS15 ;
   private int A618Cantidad_Diponible ;
   private int A590Kard_Saldo_Cant ;
   private int A582Mov_Entrada_Cant ;
   private int GX_INS50 ;
   private int GX_INS62 ;
   private int A584Mov_Salida_Cant ;
   private long AV17Tran_Id ;
   private long A46Tran_Id ;
   private long A57Tran_RegionId ;
   private long A48Tran_CentroCostoId ;
   private long A518Tran_RegionIdDestino ;
   private long A50Tran_CentroCostoIdDestino ;
   private long A52Tran_IdCuentadanteDestino ;
   private long AV24Tran_RegionId ;
   private long AV12Tran_CentroCostoId ;
   private long AV37Tran_RegionIdDestino ;
   private long AV38Tran_CentroCostoIdDestino ;
   private long AV28Tran_IdCuentadanteDestino ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long AV30TDet_Consecutivo ;
   private long AV8TDet_Cantidad ;
   private long A71Tran_Entrada ;
   private long AV31Tran_Entrada ;
   private long A410Invd_RegionalId ;
   private long A411Invd_CentroCostoId ;
   private long A43Cuen_Identificacion ;
   private long A93Trans_Id ;
   private long A92Centro_Id ;
   private long A91Regional ;
   private long A85Kard_Regi_Id ;
   private long A86Kard_Cent_Id ;
   private long A90Mov_Trans ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal AV22TDet_ValorUnitario ;
   private java.math.BigDecimal AV23TDet_ValorTotal ;
   private java.math.BigDecimal A620Valor_Unitario ;
   private java.math.BigDecimal A622Costo_Total ;
   private java.math.BigDecimal AV34Valor_Unitario ;
   private java.math.BigDecimal AV36Costo_Total ;
   private java.math.BigDecimal A589Kard_Saldo_Valor ;
   private java.math.BigDecimal A583Mov_Entrada_Valor ;
   private java.math.BigDecimal A585Mov_Salida_Valor ;
   private String scmdbuf ;
   private String A482Tran_TipoElemento ;
   private String AV20Tran_TipoElemento ;
   private String A58Tran_Estado ;
   private String Gx_emsg ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date A580Mov_Fecha ;
   private boolean n57Tran_RegionId ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n518Tran_RegionIdDestino ;
   private boolean n519Tran_RegionCodigoDestino ;
   private boolean n50Tran_CentroCostoIdDestino ;
   private boolean n516Tran_CentroCostoCodigoDestino ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean returnInSub ;
   private boolean n58Tran_Estado ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n391Tran_UsuarioRatifica ;
   private boolean n687Tran_Cantidad ;
   private boolean n43Cuen_Identificacion ;
   private boolean n711Invd_AreadanteCodigo ;
   private boolean n619Cantidad_Transito ;
   private boolean n618Cantidad_Diponible ;
   private boolean n590Kard_Saldo_Cant ;
   private boolean n589Kard_Saldo_Valor ;
   private boolean n584Mov_Salida_Cant ;
   private boolean n585Mov_Salida_Valor ;
   private boolean n582Mov_Entrada_Cant ;
   private boolean n583Mov_Entrada_Valor ;
   private String AV21Usuario ;
   private String A419Tran_CentroCostoCodigo ;
   private String A516Tran_CentroCostoCodigoDestino ;
   private String A109Tran_CodAlmaOrigen ;
   private String A110Tran_ModuloOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A49Tran_CodigoMovimiento ;
   private String A407Tran_AreadanteCodigo ;
   private String AV26Tran_CentroCostoCodigo ;
   private String AV41Tran_CentroCostoCodigoDestino ;
   private String AV14Tran_CodAlmaOrigen ;
   private String AV19Tran_ModuloOrigen ;
   private String AV16Tran_CodBodeOrigen ;
   private String AV18Tran_ModuloDestino ;
   private String AV13Tran_CodAlmaDestino ;
   private String AV15Tran_CodBodeDestino ;
   private String AV27Tran_CodigoMovimiento ;
   private String AV39Tran_AreadanteCodigo ;
   private String A66Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private String A505TDet_EsPadre ;
   private String AV29Elem_Consecutivo ;
   private String AV10TDet_PlacaNumero ;
   private String AV11TDet_PlacaPadre ;
   private String AV9TDet_EsPadre ;
   private String A391Tran_UsuarioRatifica ;
   private String A412Invd_ModuloAlmacen ;
   private String A413Invd_AlmacenCodigo ;
   private String A414Invd_BodegaCodigo ;
   private String A711Invd_AreadanteCodigo ;
   private String A31Bode_Codigo ;
   private String A28Alma_Codigo ;
   private String A27Alma_Modulo ;
   private String A578Kard_Cent_Cod ;
   private String A87Kard_Alm_Cod ;
   private String A88Kard_Bod_Cod ;
   private String A89Kard_Elem_Cons ;
   private String A579Mov_Tpmp_Codigo ;
   private long[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P001N2_A46Tran_Id ;
   private long[] P001N2_A57Tran_RegionId ;
   private boolean[] P001N2_n57Tran_RegionId ;
   private short[] P001N2_A421Tran_RegionCodigo ;
   private boolean[] P001N2_n421Tran_RegionCodigo ;
   private long[] P001N2_A48Tran_CentroCostoId ;
   private String[] P001N2_A419Tran_CentroCostoCodigo ;
   private boolean[] P001N2_n419Tran_CentroCostoCodigo ;
   private long[] P001N2_A518Tran_RegionIdDestino ;
   private boolean[] P001N2_n518Tran_RegionIdDestino ;
   private short[] P001N2_A519Tran_RegionCodigoDestino ;
   private boolean[] P001N2_n519Tran_RegionCodigoDestino ;
   private long[] P001N2_A50Tran_CentroCostoIdDestino ;
   private boolean[] P001N2_n50Tran_CentroCostoIdDestino ;
   private String[] P001N2_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] P001N2_n516Tran_CentroCostoCodigoDestino ;
   private String[] P001N2_A109Tran_CodAlmaOrigen ;
   private String[] P001N2_A110Tran_ModuloOrigen ;
   private String[] P001N2_A112Tran_CodBodeOrigen ;
   private String[] P001N2_A385Tran_ModuloDestino ;
   private String[] P001N2_A111Tran_CodAlmaDestino ;
   private String[] P001N2_A387Tran_CodBodeDestino ;
   private String[] P001N2_A482Tran_TipoElemento ;
   private String[] P001N2_A49Tran_CodigoMovimiento ;
   private long[] P001N2_A52Tran_IdCuentadanteDestino ;
   private boolean[] P001N2_n52Tran_IdCuentadanteDestino ;
   private String[] P001N2_A407Tran_AreadanteCodigo ;
   private boolean[] P001N2_n407Tran_AreadanteCodigo ;
   private long[] P001N3_A46Tran_Id ;
   private String[] P001N3_A66Elem_Consecutivo ;
   private long[] P001N3_A69TDet_Consecutivo ;
   private long[] P001N3_A487TDet_Cantidad ;
   private String[] P001N3_A490TDet_PlacaNumero ;
   private boolean[] P001N3_n490TDet_PlacaNumero ;
   private String[] P001N3_A491TDet_PlacaPadre ;
   private boolean[] P001N3_n491TDet_PlacaPadre ;
   private String[] P001N3_A505TDet_EsPadre ;
   private java.math.BigDecimal[] P001N3_A488TDet_ValorUnitario ;
   private java.math.BigDecimal[] P001N3_A489TDet_ValorTotal ;
   private long[] P001N4_A46Tran_Id ;
   private String[] P001N4_A58Tran_Estado ;
   private boolean[] P001N4_n58Tran_Estado ;
   private java.util.Date[] P001N4_A390Tran_FechaRatificacion ;
   private boolean[] P001N4_n390Tran_FechaRatificacion ;
   private String[] P001N4_A391Tran_UsuarioRatifica ;
   private boolean[] P001N4_n391Tran_UsuarioRatifica ;
   private long[] P001N6_A69TDet_Consecutivo ;
   private long[] P001N6_A46Tran_Id ;
   private long[] P001N6_A71Tran_Entrada ;
   private int[] P001N6_A72Nro_Linea ;
   private int[] P001N6_A687Tran_Cantidad ;
   private boolean[] P001N6_n687Tran_Cantidad ;
   private int[] P001N8_A94Num_Linea ;
   private String[] P001N8_A66Elem_Consecutivo ;
   private long[] P001N8_A93Trans_Id ;
   private String[] P001N8_A31Bode_Codigo ;
   private String[] P001N8_A28Alma_Codigo ;
   private String[] P001N8_A27Alma_Modulo ;
   private long[] P001N8_A92Centro_Id ;
   private long[] P001N8_A91Regional ;
   private int[] P001N8_A619Cantidad_Transito ;
   private boolean[] P001N8_n619Cantidad_Transito ;
   private java.math.BigDecimal[] P001N8_A620Valor_Unitario ;
   private java.math.BigDecimal[] P001N8_A622Costo_Total ;
   private String[] P001N12_A89Kard_Elem_Cons ;
   private String[] P001N12_A88Kard_Bod_Cod ;
   private String[] P001N12_A87Kard_Alm_Cod ;
   private long[] P001N12_A86Kard_Cent_Id ;
   private long[] P001N12_A85Kard_Regi_Id ;
   private int[] P001N12_A590Kard_Saldo_Cant ;
   private boolean[] P001N12_n590Kard_Saldo_Cant ;
   private java.math.BigDecimal[] P001N12_A589Kard_Saldo_Valor ;
   private boolean[] P001N12_n589Kard_Saldo_Valor ;
   private String[] P001N17_A89Kard_Elem_Cons ;
   private String[] P001N17_A88Kard_Bod_Cod ;
   private String[] P001N17_A87Kard_Alm_Cod ;
   private long[] P001N17_A86Kard_Cent_Id ;
   private long[] P001N17_A85Kard_Regi_Id ;
   private int[] P001N17_A590Kard_Saldo_Cant ;
   private boolean[] P001N17_n590Kard_Saldo_Cant ;
   private java.math.BigDecimal[] P001N17_A589Kard_Saldo_Valor ;
   private boolean[] P001N17_n589Kard_Saldo_Valor ;
}

final  class ratificarsalida__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001N2", "SELECT T1.Tran_Id, T1.Tran_RegionId AS Tran_RegionId, T2.Regi_Cod AS Tran_RegionCodigo, T1.Tran_CentroCostoId AS Tran_CentroCostoId, T3.Cent_Codigo AS Tran_CentroCostoCodigo, T1.Tran_RegionIdDestino AS Tran_RegionIdDestino, T4.Regi_Cod AS Tran_RegionCodigoDestino, T1.Tran_CentroCostoIdDestino AS Tran_CentroCostoIdDestino, T5.Cent_Codigo AS Tran_CentroCostoCodigoDestino, T1.Tran_CodAlmaOrigen, T1.Tran_ModuloOrigen, T1.Tran_CodBodeOrigen, T1.Tran_ModuloDestino, T1.Tran_CodAlmaDestino, T1.Tran_CodBodeDestino, T1.Tran_TipoElemento, T1.Tran_CodigoMovimiento, T1.Tran_IdCuentadanteDestino, T1.Tran_AreadanteCodigo FROM ((((ALM_TRANSACCION T1 LEFT JOIN GEN_REGIONAL T2 ON T2.Regi_Id = T1.Tran_RegionId) INNER JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL T4 ON T4.Regi_Id = T1.Tran_RegionIdDestino) LEFT JOIN GEN_CENTROCOSTO T5 ON T5.Cent_Id = T1.Tran_CentroCostoIdDestino) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001N3", "SELECT Tran_Id, Elem_Consecutivo, TDet_Consecutivo, TDet_Cantidad, TDet_PlacaNumero, TDet_PlacaPadre, TDet_EsPadre, TDet_ValorUnitario, TDet_ValorTotal FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001N4", "SELECT Tran_Id, Tran_Estado, Tran_FechaRatificacion, Tran_UsuarioRatifica FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id  FOR UPDATE OF Tran_Estado, Tran_FechaRatificacion, Tran_UsuarioRatifica NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001N5", "UPDATE ALM_TRANSACCION SET Tran_Estado=?, Tran_FechaRatificacion=?, Tran_UsuarioRatifica=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
         ,new ForEachCursor("P001N6", "SELECT TDet_Consecutivo, Tran_Id, Tran_Entrada, Nro_Linea, Tran_Cantidad FROM ALM_DET_TRAN_DATOS_SALIDA WHERE Tran_Id = ? and TDet_Consecutivo = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P001N7", "UPDATE ALM_INVENTARIO_DEVOLUTIVO SET Invd_RegionalId=?, Invd_CentroCostoId=?, Invd_ModuloAlmacen=?, Invd_AlmacenCodigo=?, Invd_BodegaCodigo=?, Invd_Estado='R', Cuen_Identificacion=?, Invd_AreadanteCodigo=?  WHERE Elem_Consecutivo = ? and Invd_NumeroPlaca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INVENTARIO_DEVOLUTIVO")
         ,new ForEachCursor("P001N8", "SELECT Num_Linea, Elem_Consecutivo, Trans_Id, Bode_Codigo, Alma_Codigo, Alma_Modulo, Centro_Id, Regional, Cantidad_Transito, Valor_Unitario, Costo_Total FROM ALM_INV_CON WHERE Regional = ? and Centro_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? and Trans_Id = ? and Elem_Consecutivo = ? and Num_Linea = ? ORDER BY Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea  FOR UPDATE OF Cantidad_Transito NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001N9", "UPDATE ALM_INV_CON SET Cantidad_Transito=?  WHERE Regional = ? AND Centro_Id = ? AND Alma_Modulo = ? AND Alma_Codigo = ? AND Bode_Codigo = ? AND Trans_Id = ? AND Elem_Consecutivo = ? AND Num_Linea = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_CON")
         ,new UpdateCursor("P001N10", "INSERT INTO ALM_INV_CON(Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea, Cantidad_Diponible, Valor_Unitario, Costo_Total, Cantidad_Transito, Otros_Costos, Descrip_Atributos) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_CON")
         ,new UpdateCursor("P001N11", "UPDATE ALM_INV_CON SET Cantidad_Diponible=Cantidad_Diponible + ?  WHERE Regional = ? and Centro_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? and Trans_Id = ? and Elem_Consecutivo = ? and Num_Linea = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_CON")
         ,new ForEachCursor("P001N12", "SELECT Kard_Elem_Cons, Kard_Bod_Cod, Kard_Alm_Cod, Kard_Cent_Id, Kard_Regi_Id, Kard_Saldo_Cant, Kard_Saldo_Valor FROM ALM_INV_KARDEX WHERE Kard_Regi_Id = ? and Kard_Cent_Id = ? and Kard_Alm_Cod = ? and Kard_Bod_Cod = ? and Kard_Elem_Cons = ? ORDER BY Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons  FOR UPDATE OF Kard_Saldo_Cant, Kard_Saldo_Valor NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001N13", "UPDATE ALM_INV_KARDEX SET Kard_Saldo_Cant=?, Kard_Saldo_Valor=?  WHERE Kard_Regi_Id = ? AND Kard_Cent_Id = ? AND Kard_Alm_Cod = ? AND Kard_Bod_Cod = ? AND Kard_Elem_Cons = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_KARDEX")
         ,new UpdateCursor("P001N14", "INSERT INTO ALM_INV_KARDEX(Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons, Kard_Regi_Cod, Kard_Cent_Cod, Kard_Saldo_Cant, Kard_Saldo_Valor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_KARDEX")
         ,new UpdateCursor("P001N15", "INSERT INTO KARDEX_MOVIMIENTO(Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons, Mov_Trans, Mov_Fecha, Mov_Tpmp_Codigo, Mov_Salida_Cant, Mov_Salida_Valor, Mov_Entrada_Cant, Mov_Entrada_Valor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "KARDEX_MOVIMIENTO")
         ,new UpdateCursor("P001N16", "UPDATE KARDEX_MOVIMIENTO SET Mov_Salida_Cant=Mov_Salida_Cant + ?, Mov_Salida_Valor=Mov_Salida_Valor + ?  WHERE Kard_Regi_Id = ? and Kard_Cent_Id = ? and Kard_Alm_Cod = ? and Kard_Bod_Cod = ? and Kard_Elem_Cons = ? and Mov_Trans = ? and Mov_Fecha = ?", GX_NOMASK + GX_MASKLOOPLOCK, "KARDEX_MOVIMIENTO")
         ,new ForEachCursor("P001N17", "SELECT Kard_Elem_Cons, Kard_Bod_Cod, Kard_Alm_Cod, Kard_Cent_Id, Kard_Regi_Id, Kard_Saldo_Cant, Kard_Saldo_Valor FROM ALM_INV_KARDEX WHERE Kard_Regi_Id = ? and Kard_Cent_Id = ? and Kard_Alm_Cod = ? and Kard_Bod_Cod = ? and Kard_Elem_Cons = ? ORDER BY Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons  FOR UPDATE OF Kard_Saldo_Cant, Kard_Saldo_Valor NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P001N18", "UPDATE ALM_INV_KARDEX SET Kard_Saldo_Cant=?, Kard_Saldo_Valor=?  WHERE Kard_Regi_Id = ? AND Kard_Cent_Id = ? AND Kard_Alm_Cod = ? AND Kard_Bod_Cod = ? AND Kard_Elem_Cons = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_KARDEX")
         ,new UpdateCursor("P001N19", "INSERT INTO ALM_INV_KARDEX(Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons, Kard_Regi_Cod, Kard_Cent_Cod, Kard_Saldo_Cant, Kard_Saldo_Valor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_KARDEX")
         ,new UpdateCursor("P001N20", "INSERT INTO KARDEX_MOVIMIENTO(Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons, Mov_Trans, Mov_Fecha, Mov_Tpmp_Codigo, Mov_Entrada_Cant, Mov_Entrada_Valor, Mov_Salida_Cant, Mov_Salida_Valor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "KARDEX_MOVIMIENTO")
         ,new UpdateCursor("P001N21", "UPDATE KARDEX_MOVIMIENTO SET Mov_Entrada_Cant=Mov_Entrada_Cant + ?, Mov_Entrada_Valor=Mov_Entrada_Valor + ?  WHERE Kard_Regi_Id = ? and Kard_Cent_Id = ? and Kard_Alm_Cod = ? and Kard_Bod_Cod = ? and Kard_Elem_Cons = ? and Mov_Trans = ? and Mov_Fecha = ?", GX_NOMASK + GX_MASKLOOPLOCK, "KARDEX_MOVIMIENTO")
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
               ((long[]) buf[8])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((String[]) buf[22])[0] = rslt.getString(16, 1) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(17) ;
               ((long[]) buf[24])[0] = rslt.getLong(18) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2) ;
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 6 :
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
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 30);
               }
               stmt.setLong(4, ((Number) parms[6]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 3, false);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(6, ((Number) parms[6]).longValue(), 0);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[8], 20);
               }
               stmt.setVarchar(8, (String)parms[9], 9);
               stmt.setVarchar(9, (String)parms[10], 30);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setVarchar(4, (String)parms[4], 8, false);
               stmt.setVarchar(5, (String)parms[5], 2, false);
               stmt.setVarchar(6, (String)parms[6], 3, false);
               stmt.setLong(7, ((Number) parms[7]).longValue());
               stmt.setVarchar(8, (String)parms[8], 9, false);
               stmt.setInt(9, ((Number) parms[9]).intValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               stmt.setVarchar(5, (String)parms[4], 3, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[9]).intValue());
               }
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setVarchar(4, (String)parms[3], 8, false);
               stmt.setVarchar(5, (String)parms[4], 2, false);
               stmt.setVarchar(6, (String)parms[5], 3, false);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setVarchar(8, (String)parms[7], 9, false);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 3);
               stmt.setVarchar(5, (String)parms[4], 9);
               return;
            case 11 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setLong(3, ((Number) parms[4]).longValue());
               stmt.setLong(4, ((Number) parms[5]).longValue());
               stmt.setVarchar(5, (String)parms[6], 2, false);
               stmt.setVarchar(6, (String)parms[7], 3, false);
               stmt.setVarchar(7, (String)parms[8], 9, false);
               return;
            case 12 :
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
            case 13 :
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
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setVarchar(5, (String)parms[4], 2, false);
               stmt.setVarchar(6, (String)parms[5], 3, false);
               stmt.setVarchar(7, (String)parms[6], 9, false);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setDate(9, (java.util.Date)parms[8]);
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 3);
               stmt.setVarchar(5, (String)parms[4], 9);
               return;
            case 16 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setLong(3, ((Number) parms[4]).longValue());
               stmt.setLong(4, ((Number) parms[5]).longValue());
               stmt.setVarchar(5, (String)parms[6], 2, false);
               stmt.setVarchar(6, (String)parms[7], 3, false);
               stmt.setVarchar(7, (String)parms[8], 9, false);
               return;
            case 17 :
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
            case 18 :
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
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setVarchar(5, (String)parms[4], 2, false);
               stmt.setVarchar(6, (String)parms[5], 3, false);
               stmt.setVarchar(7, (String)parms[6], 9, false);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setDate(9, (java.util.Date)parms[8]);
               return;
      }
   }

}

