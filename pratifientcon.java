/*
               File: PRatifiEntCon
        Description: Ratificar Entrada Consumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:1.64
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pratifientcon extends GXProcedure
{
   public pratifientcon( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pratifientcon.class ), "" );
   }

   public pratifientcon( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pratifientcon.this.AV11pTran_Id = aP0[0];
      this.aP0 = aP0;
      pratifientcon.this.AV10Modo = aP1[0];
      this.aP1 = aP1;
      pratifientcon.this.AV12pTran_TipoEntra = aP2[0];
      this.aP2 = aP2;
      pratifientcon.this.AV25Usuario = aP3[0];
      this.aP3 = aP3;
      pratifientcon.this.aP3 = new String[] {""};
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
      pratifientcon.this.AV11pTran_Id = aP0[0];
      this.aP0 = aP0;
      pratifientcon.this.AV10Modo = aP1[0];
      this.aP1 = aP1;
      pratifientcon.this.AV12pTran_TipoEntra = aP2[0];
      this.aP2 = aP2;
      pratifientcon.this.AV25Usuario = aP3[0];
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
      if ( GXutil.strcmp(AV10Modo, "RAT") == 0 )
      {
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
      else if ( GXutil.strcmp(AV10Modo, "ING") == 0 )
      {
         /* Execute user subroutine: 'ACTUALIZATRANSACCION' */
         S151 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'DATOSTRANSACCION' Routine */
      /* Using cursor P00192 */
      pr_default.execute(0, new Object[] {new Long(AV11pTran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A46Tran_Id = P00192_A46Tran_Id[0] ;
         A57Tran_RegionId = P00192_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P00192_n57Tran_RegionId[0] ;
         A421Tran_RegionCodigo = P00192_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P00192_n421Tran_RegionCodigo[0] ;
         A48Tran_CentroCostoId = P00192_A48Tran_CentroCostoId[0] ;
         A419Tran_CentroCostoCodigo = P00192_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P00192_n419Tran_CentroCostoCodigo[0] ;
         A385Tran_ModuloDestino = P00192_A385Tran_ModuloDestino[0] ;
         A111Tran_CodAlmaDestino = P00192_A111Tran_CodAlmaDestino[0] ;
         A387Tran_CodBodeDestino = P00192_A387Tran_CodBodeDestino[0] ;
         A49Tran_CodigoMovimiento = P00192_A49Tran_CodigoMovimiento[0] ;
         A421Tran_RegionCodigo = P00192_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P00192_n421Tran_RegionCodigo[0] ;
         A419Tran_CentroCostoCodigo = P00192_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P00192_n419Tran_CentroCostoCodigo[0] ;
         AV24Tran_RegionId = A57Tran_RegionId ;
         AV23Tran_RegionCodigo = A421Tran_RegionCodigo ;
         AV18Tran_CentroCostoId = A48Tran_CentroCostoId ;
         AV17Tran_CentroCostoCodigo = A419Tran_CentroCostoCodigo ;
         AV22Tran_ModuloDestino = A385Tran_ModuloDestino ;
         AV19Tran_CodAlmaDestino = A111Tran_CodAlmaDestino ;
         AV20Tran_CodBodeDestino = A387Tran_CodBodeDestino ;
         AV21Tran_CodigoMovimiento = A49Tran_CodigoMovimiento ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'DATOSDETALLE' Routine */
      AV26ConsecutivoItem = (short)(0) ;
      /* Using cursor P00193 */
      pr_default.execute(1, new Object[] {new Long(AV11pTran_Id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A46Tran_Id = P00193_A46Tran_Id[0] ;
         A69TDet_Consecutivo = P00193_A69TDet_Consecutivo[0] ;
         A66Elem_Consecutivo = P00193_A66Elem_Consecutivo[0] ;
         A487TDet_Cantidad = P00193_A487TDet_Cantidad[0] ;
         A489TDet_ValorTotal = P00193_A489TDet_ValorTotal[0] ;
         A488TDet_ValorUnitario = P00193_A488TDet_ValorUnitario[0] ;
         A657TDet_Otros_Costos = P00193_A657TDet_Otros_Costos[0] ;
         n657TDet_Otros_Costos = P00193_n657TDet_Otros_Costos[0] ;
         AV26ConsecutivoItem = (short)(AV26ConsecutivoItem+1) ;
         AV28TDet_Consecutivo = A69TDet_Consecutivo ;
         AV9Elem_Consecutivo = A66Elem_Consecutivo ;
         AV14TDet_Cantidad = A487TDet_Cantidad ;
         AV15TDet_ValorTotal = A489TDet_ValorTotal ;
         AV16TDet_ValorUnitario = A488TDet_ValorUnitario ;
         AV27TDet_Otros_Costos = A657TDet_Otros_Costos ;
         /* Execute user subroutine: 'ACTUALIZARINVENTARIO' */
         S163 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'CREARKARDEX' */
         S173 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         if ( AV13SWKardex == 1 )
         {
            /* Execute user subroutine: 'ACTUALIZARKARDEX' */
            S183 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
         }
         /* Execute user subroutine: 'MOVIMIENTOKARDEX' */
         S193 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         if ( AV29SWMoviKardex == 1 )
         {
            /* Execute user subroutine: 'ACTUALIZARMOVIKARDEX' */
            S203 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
         }
         AV14TDet_Cantidad = 0 ;
         AV15TDet_ValorTotal = DecimalUtil.ZERO ;
         AV16TDet_ValorUnitario = DecimalUtil.ZERO ;
         AV27TDet_Otros_Costos = DecimalUtil.ZERO ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S163( )
   {
      /* 'ACTUALIZARINVENTARIO' Routine */
      /* Execute user subroutine: 'CONCATENARATRIBUTOS' */
      S211 ();
      if (returnInSub) return;
      /*
         INSERT RECORD ON TABLE ALM_INV_CON

      */
      A91Regional = AV24Tran_RegionId ;
      A92Centro_Id = AV18Tran_CentroCostoId ;
      A27Alma_Modulo = AV22Tran_ModuloDestino ;
      A28Alma_Codigo = AV19Tran_CodAlmaDestino ;
      A31Bode_Codigo = AV20Tran_CodBodeDestino ;
      A93Trans_Id = AV11pTran_Id ;
      A66Elem_Consecutivo = AV9Elem_Consecutivo ;
      A94Num_Linea = AV26ConsecutivoItem ;
      A618Cantidad_Diponible = (int)(AV14TDet_Cantidad) ;
      n618Cantidad_Diponible = false ;
      A619Cantidad_Transito = 0 ;
      n619Cantidad_Transito = false ;
      A620Valor_Unitario = AV16TDet_ValorUnitario ;
      A621Otros_Costos = AV27TDet_Otros_Costos ;
      n621Otros_Costos = false ;
      A622Costo_Total = AV15TDet_ValorTotal ;
      A623Descrip_Atributos = AV8Descrip_Atributos ;
      n623Descrip_Atributos = false ;
      /* Using cursor P00194 */
      pr_default.execute(2, new Object[] {new Long(A91Regional), new Long(A92Centro_Id), A27Alma_Modulo, A28Alma_Codigo, A31Bode_Codigo, new Long(A93Trans_Id), A66Elem_Consecutivo, new Integer(A94Num_Linea), new Boolean(n618Cantidad_Diponible), new Integer(A618Cantidad_Diponible), new Boolean(n619Cantidad_Transito), new Integer(A619Cantidad_Transito), A620Valor_Unitario, new Boolean(n621Otros_Costos), A621Otros_Costos, A622Costo_Total, new Boolean(n623Descrip_Atributos), A623Descrip_Atributos});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_CON") ;
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
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pratifientcon");
   }

   public void S211( )
   {
      /* 'CONCATENARATRIBUTOS' Routine */
      AV8Descrip_Atributos = "" ;
      /* Using cursor P00195 */
      pr_default.execute(3, new Object[] {new Long(AV11pTran_Id), new Long(AV28TDet_Consecutivo)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A70TDet_ListId = P00195_A70TDet_ListId[0] ;
         A69TDet_Consecutivo = P00195_A69TDet_Consecutivo[0] ;
         A46Tran_Id = P00195_A46Tran_Id[0] ;
         A494TDet_ValorAtributo = P00195_A494TDet_ValorAtributo[0] ;
         A492TDet_ListDescripcion = P00195_A492TDet_ListDescripcion[0] ;
         n492TDet_ListDescripcion = P00195_n492TDet_ListDescripcion[0] ;
         A492TDet_ListDescripcion = P00195_A492TDet_ListDescripcion[0] ;
         n492TDet_ListDescripcion = P00195_n492TDet_ListDescripcion[0] ;
         AV8Descrip_Atributos = AV8Descrip_Atributos + A492TDet_ListDescripcion + ":" + A494TDet_ValorAtributo + "," ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S173( )
   {
      /* 'CREARKARDEX' Routine */
      AV13SWKardex = (short)(0) ;
      /*
         INSERT RECORD ON TABLE ALM_INV_KARDEX

      */
      A85Kard_Regi_Id = AV24Tran_RegionId ;
      A577Kard_Regi_Cod = AV23Tran_RegionCodigo ;
      A86Kard_Cent_Id = AV18Tran_CentroCostoId ;
      A578Kard_Cent_Cod = AV17Tran_CentroCostoCodigo ;
      A87Kard_Alm_Cod = AV19Tran_CodAlmaDestino ;
      A88Kard_Bod_Cod = AV20Tran_CodBodeDestino ;
      A89Kard_Elem_Cons = AV9Elem_Consecutivo ;
      A590Kard_Saldo_Cant = (int)(AV14TDet_Cantidad) ;
      n590Kard_Saldo_Cant = false ;
      A589Kard_Saldo_Valor = AV15TDet_ValorTotal ;
      n589Kard_Saldo_Valor = false ;
      /* Using cursor P00196 */
      pr_default.execute(4, new Object[] {new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons, new Short(A577Kard_Regi_Cod), A578Kard_Cent_Cod, new Boolean(n590Kard_Saldo_Cant), new Integer(A590Kard_Saldo_Cant), new Boolean(n589Kard_Saldo_Valor), A589Kard_Saldo_Valor});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_KARDEX") ;
      if ( (pr_default.getStatus(4) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         AV13SWKardex = (short)(1) ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pratifientcon");
   }

   public void S193( )
   {
      /* 'MOVIMIENTOKARDEX' Routine */
      AV29SWMoviKardex = (short)(0) ;
      /*
         INSERT RECORD ON TABLE KARDEX_MOVIMIENTO

      */
      A85Kard_Regi_Id = AV24Tran_RegionId ;
      A86Kard_Cent_Id = AV18Tran_CentroCostoId ;
      A87Kard_Alm_Cod = AV19Tran_CodAlmaDestino ;
      A88Kard_Bod_Cod = AV20Tran_CodBodeDestino ;
      A89Kard_Elem_Cons = AV9Elem_Consecutivo ;
      A90Mov_Trans = AV11pTran_Id ;
      A579Mov_Tpmp_Codigo = AV21Tran_CodigoMovimiento ;
      A580Mov_Fecha = GXutil.serverDate( context, remoteHandle, "DEFAULT") ;
      A582Mov_Entrada_Cant = (int)(AV14TDet_Cantidad) ;
      n582Mov_Entrada_Cant = false ;
      A583Mov_Entrada_Valor = AV15TDet_ValorTotal ;
      n583Mov_Entrada_Valor = false ;
      /* Using cursor P00197 */
      pr_default.execute(5, new Object[] {new Long(A85Kard_Regi_Id), new Long(A86Kard_Cent_Id), A87Kard_Alm_Cod, A88Kard_Bod_Cod, A89Kard_Elem_Cons, new Long(A90Mov_Trans), A580Mov_Fecha, A579Mov_Tpmp_Codigo, new Boolean(n582Mov_Entrada_Cant), new Integer(A582Mov_Entrada_Cant), new Boolean(n583Mov_Entrada_Valor), A583Mov_Entrada_Valor});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("KARDEX_MOVIMIENTO") ;
      if ( (pr_default.getStatus(5) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         AV29SWMoviKardex = (short)(1) ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pratifientcon");
   }

   public void S183( )
   {
      /* 'ACTUALIZARKARDEX' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P00198 */
      pr_default.execute(6, new Object[] {new Long(AV14TDet_Cantidad), AV15TDet_ValorTotal, new Long(AV24Tran_RegionId), new Long(AV18Tran_CentroCostoId), AV19Tran_CodAlmaDestino, AV20Tran_CodBodeDestino, AV9Elem_Consecutivo});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_KARDEX") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_INV_KARDEX") ;
      /* End optimized UPDATE. */
   }

   public void S203( )
   {
      /* 'ACTUALIZARMOVIKARDEX' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P00199 */
      pr_default.execute(7, new Object[] {new Long(AV14TDet_Cantidad), AV15TDet_ValorTotal, new Long(AV24Tran_RegionId), new Long(AV18Tran_CentroCostoId), AV19Tran_CodAlmaDestino, AV20Tran_CodBodeDestino, AV9Elem_Consecutivo, new Long(AV11pTran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("KARDEX_MOVIMIENTO") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("KARDEX_MOVIMIENTO") ;
      /* End optimized UPDATE. */
   }

   public void S141( )
   {
      /* 'RATIFICATRANSACCION' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P001910 */
      pr_default.execute(8, new Object[] {AV25Usuario, new Long(AV11pTran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pratifientcon");
   }

   public void S151( )
   {
      /* 'ACTUALIZATRANSACCION' Routine */
      /* Optimized UPDATE. */
      /* Using cursor P001911 */
      pr_default.execute(9, new Object[] {new Boolean(n527Tran_TipoEntra), AV12pTran_TipoEntra, new Long(AV11pTran_Id)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
      /* End optimized UPDATE. */
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "pratifientcon");
   }

   protected void cleanup( )
   {
      this.aP0[0] = pratifientcon.this.AV11pTran_Id;
      this.aP1[0] = pratifientcon.this.AV10Modo;
      this.aP2[0] = pratifientcon.this.AV12pTran_TipoEntra;
      this.aP3[0] = pratifientcon.this.AV25Usuario;
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
      P00192_A46Tran_Id = new long[1] ;
      P00192_A57Tran_RegionId = new long[1] ;
      P00192_n57Tran_RegionId = new boolean[] {false} ;
      P00192_A421Tran_RegionCodigo = new short[1] ;
      P00192_n421Tran_RegionCodigo = new boolean[] {false} ;
      P00192_A48Tran_CentroCostoId = new long[1] ;
      P00192_A419Tran_CentroCostoCodigo = new String[] {""} ;
      P00192_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      P00192_A385Tran_ModuloDestino = new String[] {""} ;
      P00192_A111Tran_CodAlmaDestino = new String[] {""} ;
      P00192_A387Tran_CodBodeDestino = new String[] {""} ;
      P00192_A49Tran_CodigoMovimiento = new String[] {""} ;
      A419Tran_CentroCostoCodigo = "" ;
      A385Tran_ModuloDestino = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A49Tran_CodigoMovimiento = "" ;
      AV17Tran_CentroCostoCodigo = "" ;
      AV22Tran_ModuloDestino = "" ;
      AV19Tran_CodAlmaDestino = "" ;
      AV20Tran_CodBodeDestino = "" ;
      AV21Tran_CodigoMovimiento = "" ;
      P00193_A46Tran_Id = new long[1] ;
      P00193_A69TDet_Consecutivo = new long[1] ;
      P00193_A66Elem_Consecutivo = new String[] {""} ;
      P00193_A487TDet_Cantidad = new long[1] ;
      P00193_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00193_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00193_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00193_n657TDet_Otros_Costos = new boolean[] {false} ;
      A66Elem_Consecutivo = "" ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      AV9Elem_Consecutivo = "" ;
      AV15TDet_ValorTotal = DecimalUtil.ZERO ;
      AV16TDet_ValorUnitario = DecimalUtil.ZERO ;
      AV27TDet_Otros_Costos = DecimalUtil.ZERO ;
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      A31Bode_Codigo = "" ;
      A620Valor_Unitario = DecimalUtil.ZERO ;
      A621Otros_Costos = DecimalUtil.ZERO ;
      A622Costo_Total = DecimalUtil.ZERO ;
      A623Descrip_Atributos = "" ;
      AV8Descrip_Atributos = "" ;
      Gx_emsg = "" ;
      P00195_A70TDet_ListId = new long[1] ;
      P00195_A69TDet_Consecutivo = new long[1] ;
      P00195_A46Tran_Id = new long[1] ;
      P00195_A494TDet_ValorAtributo = new String[] {""} ;
      P00195_A492TDet_ListDescripcion = new String[] {""} ;
      P00195_n492TDet_ListDescripcion = new boolean[] {false} ;
      A494TDet_ValorAtributo = "" ;
      A492TDet_ListDescripcion = "" ;
      A578Kard_Cent_Cod = "" ;
      A87Kard_Alm_Cod = "" ;
      A88Kard_Bod_Cod = "" ;
      A89Kard_Elem_Cons = "" ;
      A589Kard_Saldo_Valor = DecimalUtil.ZERO ;
      A579Mov_Tpmp_Codigo = "" ;
      A580Mov_Fecha = GXutil.nullDate() ;
      A583Mov_Entrada_Valor = DecimalUtil.ZERO ;
      A527Tran_TipoEntra = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.pratifientcon__default(),
         new Object[] {
             new Object[] {
            P00192_A46Tran_Id, P00192_A57Tran_RegionId, P00192_n57Tran_RegionId, P00192_A421Tran_RegionCodigo, P00192_n421Tran_RegionCodigo, P00192_A48Tran_CentroCostoId, P00192_A419Tran_CentroCostoCodigo, P00192_n419Tran_CentroCostoCodigo, P00192_A385Tran_ModuloDestino, P00192_A111Tran_CodAlmaDestino,
            P00192_A387Tran_CodBodeDestino, P00192_A49Tran_CodigoMovimiento
            }
            , new Object[] {
            P00193_A46Tran_Id, P00193_A69TDet_Consecutivo, P00193_A66Elem_Consecutivo, P00193_A487TDet_Cantidad, P00193_A489TDet_ValorTotal, P00193_A488TDet_ValorUnitario, P00193_A657TDet_Otros_Costos, P00193_n657TDet_Otros_Costos
            }
            , new Object[] {
            }
            , new Object[] {
            P00195_A70TDet_ListId, P00195_A69TDet_Consecutivo, P00195_A46Tran_Id, P00195_A494TDet_ValorAtributo, P00195_A492TDet_ListDescripcion, P00195_n492TDet_ListDescripcion
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
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A421Tran_RegionCodigo ;
   private short AV23Tran_RegionCodigo ;
   private short AV26ConsecutivoItem ;
   private short AV13SWKardex ;
   private short AV29SWMoviKardex ;
   private short Gx_err ;
   private short A577Kard_Regi_Cod ;
   private int GX_INS15 ;
   private int A94Num_Linea ;
   private int A618Cantidad_Diponible ;
   private int A619Cantidad_Transito ;
   private int GX_INS50 ;
   private int A590Kard_Saldo_Cant ;
   private int GX_INS62 ;
   private int A582Mov_Entrada_Cant ;
   private long AV11pTran_Id ;
   private long A46Tran_Id ;
   private long A57Tran_RegionId ;
   private long A48Tran_CentroCostoId ;
   private long AV24Tran_RegionId ;
   private long AV18Tran_CentroCostoId ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long AV28TDet_Consecutivo ;
   private long AV14TDet_Cantidad ;
   private long A91Regional ;
   private long A92Centro_Id ;
   private long A93Trans_Id ;
   private long A70TDet_ListId ;
   private long A85Kard_Regi_Id ;
   private long A86Kard_Cent_Id ;
   private long A90Mov_Trans ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private java.math.BigDecimal AV15TDet_ValorTotal ;
   private java.math.BigDecimal AV16TDet_ValorUnitario ;
   private java.math.BigDecimal AV27TDet_Otros_Costos ;
   private java.math.BigDecimal A620Valor_Unitario ;
   private java.math.BigDecimal A621Otros_Costos ;
   private java.math.BigDecimal A622Costo_Total ;
   private java.math.BigDecimal A589Kard_Saldo_Valor ;
   private java.math.BigDecimal A583Mov_Entrada_Valor ;
   private String AV10Modo ;
   private String AV12pTran_TipoEntra ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private String A527Tran_TipoEntra ;
   private java.util.Date A580Mov_Fecha ;
   private boolean returnInSub ;
   private boolean n57Tran_RegionId ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n618Cantidad_Diponible ;
   private boolean n619Cantidad_Transito ;
   private boolean n621Otros_Costos ;
   private boolean n623Descrip_Atributos ;
   private boolean n492TDet_ListDescripcion ;
   private boolean n590Kard_Saldo_Cant ;
   private boolean n589Kard_Saldo_Valor ;
   private boolean n582Mov_Entrada_Cant ;
   private boolean n583Mov_Entrada_Valor ;
   private boolean n527Tran_TipoEntra ;
   private String A623Descrip_Atributos ;
   private String AV8Descrip_Atributos ;
   private String AV25Usuario ;
   private String A419Tran_CentroCostoCodigo ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A49Tran_CodigoMovimiento ;
   private String AV17Tran_CentroCostoCodigo ;
   private String AV22Tran_ModuloDestino ;
   private String AV19Tran_CodAlmaDestino ;
   private String AV20Tran_CodBodeDestino ;
   private String AV21Tran_CodigoMovimiento ;
   private String A66Elem_Consecutivo ;
   private String AV9Elem_Consecutivo ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A31Bode_Codigo ;
   private String A494TDet_ValorAtributo ;
   private String A492TDet_ListDescripcion ;
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
   private long[] P00192_A46Tran_Id ;
   private long[] P00192_A57Tran_RegionId ;
   private boolean[] P00192_n57Tran_RegionId ;
   private short[] P00192_A421Tran_RegionCodigo ;
   private boolean[] P00192_n421Tran_RegionCodigo ;
   private long[] P00192_A48Tran_CentroCostoId ;
   private String[] P00192_A419Tran_CentroCostoCodigo ;
   private boolean[] P00192_n419Tran_CentroCostoCodigo ;
   private String[] P00192_A385Tran_ModuloDestino ;
   private String[] P00192_A111Tran_CodAlmaDestino ;
   private String[] P00192_A387Tran_CodBodeDestino ;
   private String[] P00192_A49Tran_CodigoMovimiento ;
   private long[] P00193_A46Tran_Id ;
   private long[] P00193_A69TDet_Consecutivo ;
   private String[] P00193_A66Elem_Consecutivo ;
   private long[] P00193_A487TDet_Cantidad ;
   private java.math.BigDecimal[] P00193_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] P00193_A488TDet_ValorUnitario ;
   private java.math.BigDecimal[] P00193_A657TDet_Otros_Costos ;
   private boolean[] P00193_n657TDet_Otros_Costos ;
   private long[] P00195_A70TDet_ListId ;
   private long[] P00195_A69TDet_Consecutivo ;
   private long[] P00195_A46Tran_Id ;
   private String[] P00195_A494TDet_ValorAtributo ;
   private String[] P00195_A492TDet_ListDescripcion ;
   private boolean[] P00195_n492TDet_ListDescripcion ;
}

final  class pratifientcon__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00192", "SELECT T1.Tran_Id, T1.Tran_RegionId AS Tran_RegionId, T2.Regi_Cod AS Tran_RegionCodigo, T1.Tran_CentroCostoId AS Tran_CentroCostoId, T3.Cent_Codigo AS Tran_CentroCostoCodigo, T1.Tran_ModuloDestino, T1.Tran_CodAlmaDestino, T1.Tran_CodBodeDestino, T1.Tran_CodigoMovimiento FROM ((ALM_TRANSACCION T1 LEFT JOIN GEN_REGIONAL T2 ON T2.Regi_Id = T1.Tran_RegionId) INNER JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = T1.Tran_CentroCostoId) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00193", "SELECT Tran_Id, TDet_Consecutivo, Elem_Consecutivo, TDet_Cantidad, TDet_ValorTotal, TDet_ValorUnitario, TDet_Otros_Costos FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P00194", "INSERT INTO ALM_INV_CON(Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea, Cantidad_Diponible, Cantidad_Transito, Valor_Unitario, Otros_Costos, Costo_Total, Descrip_Atributos) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_CON")
         ,new ForEachCursor("P00195", "SELECT T1.TDet_ListId AS TDet_ListId, T1.TDet_Consecutivo, T1.Tran_Id, T1.TDet_ValorAtributo, T2.List_Descripcion AS TDet_ListDescripcion FROM (ALM_DETALLE_TRANSACCIONATRIBUT T1 INNER JOIN ALM_LISTA_ATRIBUTOS T2 ON T2.List_Id = T1.TDet_ListId) WHERE T1.Tran_Id = ? and T1.TDet_Consecutivo = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P00196", "INSERT INTO ALM_INV_KARDEX(Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons, Kard_Regi_Cod, Kard_Cent_Cod, Kard_Saldo_Cant, Kard_Saldo_Valor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_KARDEX")
         ,new UpdateCursor("P00197", "INSERT INTO KARDEX_MOVIMIENTO(Kard_Regi_Id, Kard_Cent_Id, Kard_Alm_Cod, Kard_Bod_Cod, Kard_Elem_Cons, Mov_Trans, Mov_Fecha, Mov_Tpmp_Codigo, Mov_Entrada_Cant, Mov_Entrada_Valor, Mov_Salida_Cant, Mov_Salida_Valor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "KARDEX_MOVIMIENTO")
         ,new UpdateCursor("P00198", "UPDATE ALM_INV_KARDEX SET Kard_Saldo_Cant=Kard_Saldo_Cant + ?, Kard_Saldo_Valor=Kard_Saldo_Valor + ?  WHERE Kard_Regi_Id = ? and Kard_Cent_Id = ? and Kard_Alm_Cod = ? and Kard_Bod_Cod = ? and Kard_Elem_Cons = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_INV_KARDEX")
         ,new UpdateCursor("P00199", "UPDATE KARDEX_MOVIMIENTO SET Mov_Entrada_Cant=Mov_Entrada_Cant + ?, Mov_Entrada_Valor=Mov_Entrada_Valor + ?  WHERE Kard_Regi_Id = ? and Kard_Cent_Id = ? and Kard_Alm_Cod = ? and Kard_Bod_Cod = ? and Kard_Elem_Cons = ? and Mov_Trans = ?", GX_NOMASK + GX_MASKLOOPLOCK, "KARDEX_MOVIMIENTO")
         ,new UpdateCursor("P001910", "UPDATE ALM_TRANSACCION SET Tran_Estado='R', Tran_FechaRatificacion=(SYSDATE), Tran_UsuarioRatifica=RTRIM(LTRIM(?)), Tran_FechaRegistro=(SYSDATE)  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
         ,new UpdateCursor("P001911", "UPDATE ALM_TRANSACCION SET Tran_TipoEntra=?  WHERE Tran_Id = ?", GX_NOMASK + GX_MASKLOOPLOCK, "ALM_TRANSACCION")
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
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2) ;
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2) ;
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[11]).intValue());
               }
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[12], 2);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[14], 2);
               }
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[15], 2);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(14, (String)parms[17]);
               }
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 4 :
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
            case 5 :
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
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setVarchar(5, (String)parms[4], 2);
               stmt.setVarchar(6, (String)parms[5], 3);
               stmt.setVarchar(7, (String)parms[6], 9);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 30);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               return;
      }
   }

}

