/*
               File: WSentradadevolutivo
        Description: WSentradadevolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:6.1
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wsentradadevolutivo extends GXProcedure
{
   public wsentradadevolutivo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wsentradadevolutivo.class ), "" );
   }

   public wsentradadevolutivo( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( )
   {
      wsentradadevolutivo.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      wsentradadevolutivo.this.aP0 = new long[] {0};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( long[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( long[] aP0 )
   {
      wsentradadevolutivo.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Programa = "crearDetalleDevolutivo" ;
      GXv_char1[0] = AV13Host ;
      GXv_char2[0] = AV21URL ;
      GXv_int3[0] = AV19Puerto ;
      new com.orions2.parametrosservicios(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      wsentradadevolutivo.this.AV13Host = GXv_char1[0] ;
      wsentradadevolutivo.this.AV21URL = GXv_char2[0] ;
      wsentradadevolutivo.this.AV19Puerto = GXv_int3[0] ;
      AV14HttpClient.setHost( AV13Host );
      AV14HttpClient.setPort( AV19Puerto );
      AV14HttpClient.setBaseURL( AV21URL );
      /* Using cursor P001P2 */
      pr_default.execute(0, new Object[] {new Long(AV8Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A48Tran_CentroCostoId = P001P2_A48Tran_CentroCostoId[0] ;
         A46Tran_Id = P001P2_A46Tran_Id[0] ;
         A421Tran_RegionCodigo = P001P2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001P2_n421Tran_RegionCodigo[0] ;
         A57Tran_RegionId = P001P2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P001P2_n57Tran_RegionId[0] ;
         A594Tran_RegionAbrev = P001P2_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P001P2_n594Tran_RegionAbrev[0] ;
         A513Tran_ConsecutivoCC = P001P2_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = P001P2_n513Tran_ConsecutivoCC[0] ;
         A55Tran_FechaRegistro = P001P2_A55Tran_FechaRegistro[0] ;
         A109Tran_CodAlmaOrigen = P001P2_A109Tran_CodAlmaOrigen[0] ;
         A110Tran_ModuloOrigen = P001P2_A110Tran_ModuloOrigen[0] ;
         A112Tran_CodBodeOrigen = P001P2_A112Tran_CodBodeOrigen[0] ;
         A51Tran_IdCuentadanteOrigen = P001P2_A51Tran_IdCuentadanteOrigen[0] ;
         n51Tran_IdCuentadanteOrigen = P001P2_n51Tran_IdCuentadanteOrigen[0] ;
         A53Tran_IdProveedor = P001P2_A53Tran_IdProveedor[0] ;
         n53Tran_IdProveedor = P001P2_n53Tran_IdProveedor[0] ;
         A390Tran_FechaRatificacion = P001P2_A390Tran_FechaRatificacion[0] ;
         n390Tran_FechaRatificacion = P001P2_n390Tran_FechaRatificacion[0] ;
         A58Tran_Estado = P001P2_A58Tran_Estado[0] ;
         n58Tran_Estado = P001P2_n58Tran_Estado[0] ;
         A419Tran_CentroCostoCodigo = P001P2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P001P2_n419Tran_CentroCostoCodigo[0] ;
         A407Tran_AreadanteCodigo = P001P2_A407Tran_AreadanteCodigo[0] ;
         n407Tran_AreadanteCodigo = P001P2_n407Tran_AreadanteCodigo[0] ;
         A419Tran_CentroCostoCodigo = P001P2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P001P2_n419Tran_CentroCostoCodigo[0] ;
         A421Tran_RegionCodigo = P001P2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001P2_n421Tran_RegionCodigo[0] ;
         A594Tran_RegionAbrev = P001P2_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P001P2_n594Tran_RegionAbrev[0] ;
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Tranregioncodigo( A421Tran_RegionCodigo );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Tranregionid( (short)(A57Tran_RegionId) );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Tranregionabrev( A594Tran_RegionAbrev );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Tranid( A46Tran_Id );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Tranconsecutivocc( A513Tran_ConsecutivoCC );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Tranfecharegistro( A55Tran_FechaRegistro );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Trancodalmaorigen( A109Tran_CodAlmaOrigen );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Tranmoduloorigen( A110Tran_ModuloOrigen );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Trancodbodeorigen( A112Tran_CodBodeOrigen );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Tranidcuentadanteorigen( A51Tran_IdCuentadanteOrigen );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Tranidproveedor( A53Tran_IdProveedor );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Tranfecharatificacion( A390Tran_FechaRatificacion );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Tranestado( A58Tran_Estado );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Trancentrocostocodigo( A419Tran_CentroCostoCodigo );
         AV20SDTAlmTransaccion.setgxTv_Sdtsdtentradadevolutivo_Tranareadantecodigo( A407Tran_AreadanteCodigo );
         AV15i = (short)(0) ;
         /* Using cursor P001P3 */
         pr_default.execute(1, new Object[] {new Long(A46Tran_Id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A69TDet_Consecutivo = P001P3_A69TDet_Consecutivo[0] ;
            A66Elem_Consecutivo = P001P3_A66Elem_Consecutivo[0] ;
            A557Elem_Descripcion = P001P3_A557Elem_Descripcion[0] ;
            A490TDet_PlacaNumero = P001P3_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = P001P3_n490TDet_PlacaNumero[0] ;
            A632Vida_Util = P001P3_A632Vida_Util[0] ;
            n632Vida_Util = P001P3_n632Vida_Util[0] ;
            A491TDet_PlacaPadre = P001P3_A491TDet_PlacaPadre[0] ;
            n491TDet_PlacaPadre = P001P3_n491TDet_PlacaPadre[0] ;
            A489TDet_ValorTotal = P001P3_A489TDet_ValorTotal[0] ;
            A657TDet_Otros_Costos = P001P3_A657TDet_Otros_Costos[0] ;
            n657TDet_Otros_Costos = P001P3_n657TDet_Otros_Costos[0] ;
            A653TDet_Valor_Presente = P001P3_A653TDet_Valor_Presente[0] ;
            n653TDet_Valor_Presente = P001P3_n653TDet_Valor_Presente[0] ;
            A654TDet_Valor_Futuro = P001P3_A654TDet_Valor_Futuro[0] ;
            n654TDet_Valor_Futuro = P001P3_n654TDet_Valor_Futuro[0] ;
            A655TDet_Taza = P001P3_A655TDet_Taza[0] ;
            n655TDet_Taza = P001P3_n655TDet_Taza[0] ;
            A656TDet_Plazo_N = P001P3_A656TDet_Plazo_N[0] ;
            n656TDet_Plazo_N = P001P3_n656TDet_Plazo_N[0] ;
            A557Elem_Descripcion = P001P3_A557Elem_Descripcion[0] ;
            A632Vida_Util = P001P3_A632Vida_Util[0] ;
            n632Vida_Util = P001P3_n632Vida_Util[0] ;
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetconsecutivo( A69TDet_Consecutivo );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Elemconsecutivo( A66Elem_Consecutivo );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Elemdescripcion( A557Elem_Descripcion );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacanumero( A490TDet_PlacaNumero );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Catavidautil( A632Vida_Util );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetplacapadre( A491TDet_PlacaPadre );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tdetvalortotal( A489TDet_ValorTotal );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Otroscostos( A657TDet_Otros_Costos );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Valorpresente( A653TDet_Valor_Presente );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Valorfuturo( A654TDet_Valor_Futuro );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Interes( DecimalUtil.doubleToDec(A655TDet_Taza) );
            AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Tiempo( A656TDet_Plazo_N );
            /* Using cursor P001P4 */
            pr_default.execute(2, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A70TDet_ListId = P001P4_A70TDet_ListId[0] ;
               A494TDet_ValorAtributo = P001P4_A494TDet_ValorAtributo[0] ;
               A492TDet_ListDescripcion = P001P4_A492TDet_ListDescripcion[0] ;
               n492TDet_ListDescripcion = P001P4_n492TDet_ListDescripcion[0] ;
               A492TDet_ListDescripcion = P001P4_A492TDet_ListDescripcion[0] ;
               n492TDet_ListDescripcion = P001P4_n492TDet_ListDescripcion[0] ;
               if ( A70TDet_ListId == 1 )
               {
                  AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Marca( A494TDet_ValorAtributo );
               }
               else if ( A70TDet_ListId == 2 )
               {
                  AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Serial( A494TDet_ValorAtributo );
               }
               else if ( A70TDet_ListId == 3 )
               {
                  AV9AlmDetalleTransaccionItem.setgxTv_Sdtsdtentradadevolutivo_detallesitem_Modelo( A494TDet_ValorAtributo );
               }
               else
               {
                  AV16lista.setgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Codigolista( A70TDet_ListId );
                  AV16lista.setgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Nombrelista( A492TDet_ListDescripcion );
                  AV16lista.setgxTv_Sdtsdtentradadevolutivo_detallesitem_listaItem_Valorlista( A494TDet_ValorAtributo );
                  AV9AlmDetalleTransaccionItem.getgxTv_Sdtsdtentradadevolutivo_detallesitem_Lista().add(AV16lista.Clone(), 0);
                  AV16lista = (com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem)new com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem(remoteHandle, context);
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV20SDTAlmTransaccion.getgxTv_Sdtsdtentradadevolutivo_Detalles().add(AV9AlmDetalleTransaccionItem.Clone(), 0);
            AV9AlmDetalleTransaccionItem = (com.orions2.Sdtsdtentradadevolutivo_detallesitem)new com.orions2.Sdtsdtentradadevolutivo_detallesitem(remoteHandle, context);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV10body = AV20SDTAlmTransaccion.toJSonString(false) ;
      AV14HttpClient.addHeader("Content-type", "application/json;charset=UTF-8");
      AV14HttpClient.addString(AV10body);
      AV14HttpClient.execute("POST", AV18Programa);
      AV17lvc = AV14HttpClient.getString() ;
      GXv_char2[0] = "CTRWS" ;
      GXv_int4[0] = AV11cons_Numero ;
      new com.orions2.devuelveconsecutivo(remoteHandle, context).execute( GXv_char2, GXv_int4) ;
      wsentradadevolutivo.this.AV11cons_Numero = GXv_int4[0] ;
      /*
         INSERT RECORD ON TABLE SEG_CONTROL_WEBSERVICES

      */
      A15Control_Id = AV11cons_Numero ;
      A193Control_IdUsuario = AV22Usua_Id ;
      A190Control_Body = AV10body ;
      A192Control_Estado = AV12Estado ;
      A187Control_FechaHora = GXutil.now( ) ;
      A191Control_Lvc = AV17lvc ;
      A189Control_Programa = AV18Programa ;
      A188Control_Usuario = AV23Usuario ;
      /* Using cursor P001P5 */
      pr_default.execute(3, new Object[] {new Long(A15Control_Id), A187Control_FechaHora, new Long(A193Control_IdUsuario), A188Control_Usuario, A189Control_Programa, A190Control_Body, A191Control_Lvc, A192Control_Estado});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("SEG_CONTROL_WEBSERVICES") ;
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = wsentradadevolutivo.this.AV8Tran_Id;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "wsentradadevolutivo");
      CloseOpenCursors();
      AV14HttpClient.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Programa = "" ;
      AV13Host = "" ;
      GXv_char1 = new String [1] ;
      AV21URL = "" ;
      GXv_int3 = new short [1] ;
      AV14HttpClient = new com.genexus.internet.HttpClient();
      scmdbuf = "" ;
      P001P2_A48Tran_CentroCostoId = new long[1] ;
      P001P2_A46Tran_Id = new long[1] ;
      P001P2_A421Tran_RegionCodigo = new short[1] ;
      P001P2_n421Tran_RegionCodigo = new boolean[] {false} ;
      P001P2_A57Tran_RegionId = new long[1] ;
      P001P2_n57Tran_RegionId = new boolean[] {false} ;
      P001P2_A594Tran_RegionAbrev = new String[] {""} ;
      P001P2_n594Tran_RegionAbrev = new boolean[] {false} ;
      P001P2_A513Tran_ConsecutivoCC = new long[1] ;
      P001P2_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      P001P2_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      P001P2_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P001P2_A110Tran_ModuloOrigen = new String[] {""} ;
      P001P2_A112Tran_CodBodeOrigen = new String[] {""} ;
      P001P2_A51Tran_IdCuentadanteOrigen = new long[1] ;
      P001P2_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      P001P2_A53Tran_IdProveedor = new long[1] ;
      P001P2_n53Tran_IdProveedor = new boolean[] {false} ;
      P001P2_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      P001P2_n390Tran_FechaRatificacion = new boolean[] {false} ;
      P001P2_A58Tran_Estado = new String[] {""} ;
      P001P2_n58Tran_Estado = new boolean[] {false} ;
      P001P2_A419Tran_CentroCostoCodigo = new String[] {""} ;
      P001P2_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      P001P2_A407Tran_AreadanteCodigo = new String[] {""} ;
      P001P2_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      A594Tran_RegionAbrev = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A109Tran_CodAlmaOrigen = "" ;
      A110Tran_ModuloOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A58Tran_Estado = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A407Tran_AreadanteCodigo = "" ;
      AV20SDTAlmTransaccion = new com.orions2.Sdtsdtentradadevolutivo(remoteHandle, context);
      P001P3_A46Tran_Id = new long[1] ;
      P001P3_A69TDet_Consecutivo = new long[1] ;
      P001P3_A66Elem_Consecutivo = new String[] {""} ;
      P001P3_A557Elem_Descripcion = new String[] {""} ;
      P001P3_A490TDet_PlacaNumero = new String[] {""} ;
      P001P3_n490TDet_PlacaNumero = new boolean[] {false} ;
      P001P3_A632Vida_Util = new short[1] ;
      P001P3_n632Vida_Util = new boolean[] {false} ;
      P001P3_A491TDet_PlacaPadre = new String[] {""} ;
      P001P3_n491TDet_PlacaPadre = new boolean[] {false} ;
      P001P3_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P3_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P3_n657TDet_Otros_Costos = new boolean[] {false} ;
      P001P3_A653TDet_Valor_Presente = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P3_n653TDet_Valor_Presente = new boolean[] {false} ;
      P001P3_A654TDet_Valor_Futuro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001P3_n654TDet_Valor_Futuro = new boolean[] {false} ;
      P001P3_A655TDet_Taza = new short[1] ;
      P001P3_n655TDet_Taza = new boolean[] {false} ;
      P001P3_A656TDet_Plazo_N = new byte[1] ;
      P001P3_n656TDet_Plazo_N = new boolean[] {false} ;
      A66Elem_Consecutivo = "" ;
      A557Elem_Descripcion = "" ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      AV9AlmDetalleTransaccionItem = new com.orions2.Sdtsdtentradadevolutivo_detallesitem(remoteHandle, context);
      P001P4_A46Tran_Id = new long[1] ;
      P001P4_A69TDet_Consecutivo = new long[1] ;
      P001P4_A70TDet_ListId = new long[1] ;
      P001P4_A494TDet_ValorAtributo = new String[] {""} ;
      P001P4_A492TDet_ListDescripcion = new String[] {""} ;
      P001P4_n492TDet_ListDescripcion = new boolean[] {false} ;
      A494TDet_ValorAtributo = "" ;
      A492TDet_ListDescripcion = "" ;
      AV16lista = new com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem(remoteHandle, context);
      AV10body = "" ;
      AV17lvc = "" ;
      GXv_char2 = new String [1] ;
      GXv_int4 = new long [1] ;
      A190Control_Body = "" ;
      A192Control_Estado = "" ;
      AV12Estado = "" ;
      A187Control_FechaHora = GXutil.resetTime( GXutil.nullDate() );
      A191Control_Lvc = "" ;
      A189Control_Programa = "" ;
      A188Control_Usuario = "" ;
      AV23Usuario = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wsentradadevolutivo__default(),
         new Object[] {
             new Object[] {
            P001P2_A48Tran_CentroCostoId, P001P2_A46Tran_Id, P001P2_A421Tran_RegionCodigo, P001P2_n421Tran_RegionCodigo, P001P2_A57Tran_RegionId, P001P2_n57Tran_RegionId, P001P2_A594Tran_RegionAbrev, P001P2_n594Tran_RegionAbrev, P001P2_A513Tran_ConsecutivoCC, P001P2_n513Tran_ConsecutivoCC,
            P001P2_A55Tran_FechaRegistro, P001P2_A109Tran_CodAlmaOrigen, P001P2_A110Tran_ModuloOrigen, P001P2_A112Tran_CodBodeOrigen, P001P2_A51Tran_IdCuentadanteOrigen, P001P2_n51Tran_IdCuentadanteOrigen, P001P2_A53Tran_IdProveedor, P001P2_n53Tran_IdProveedor, P001P2_A390Tran_FechaRatificacion, P001P2_n390Tran_FechaRatificacion,
            P001P2_A58Tran_Estado, P001P2_n58Tran_Estado, P001P2_A419Tran_CentroCostoCodigo, P001P2_n419Tran_CentroCostoCodigo, P001P2_A407Tran_AreadanteCodigo, P001P2_n407Tran_AreadanteCodigo
            }
            , new Object[] {
            P001P3_A46Tran_Id, P001P3_A69TDet_Consecutivo, P001P3_A66Elem_Consecutivo, P001P3_A557Elem_Descripcion, P001P3_A490TDet_PlacaNumero, P001P3_n490TDet_PlacaNumero, P001P3_A632Vida_Util, P001P3_n632Vida_Util, P001P3_A491TDet_PlacaPadre, P001P3_n491TDet_PlacaPadre,
            P001P3_A489TDet_ValorTotal, P001P3_A657TDet_Otros_Costos, P001P3_n657TDet_Otros_Costos, P001P3_A653TDet_Valor_Presente, P001P3_n653TDet_Valor_Presente, P001P3_A654TDet_Valor_Futuro, P001P3_n654TDet_Valor_Futuro, P001P3_A655TDet_Taza, P001P3_n655TDet_Taza, P001P3_A656TDet_Plazo_N,
            P001P3_n656TDet_Plazo_N
            }
            , new Object[] {
            P001P4_A46Tran_Id, P001P4_A69TDet_Consecutivo, P001P4_A70TDet_ListId, P001P4_A494TDet_ValorAtributo, P001P4_A492TDet_ListDescripcion, P001P4_n492TDet_ListDescripcion
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A656TDet_Plazo_N ;
   private short AV19Puerto ;
   private short GXv_int3[] ;
   private short A421Tran_RegionCodigo ;
   private short AV15i ;
   private short A632Vida_Util ;
   private short A655TDet_Taza ;
   private short Gx_err ;
   private int GX_INS23 ;
   private long AV8Tran_Id ;
   private long A48Tran_CentroCostoId ;
   private long A46Tran_Id ;
   private long A57Tran_RegionId ;
   private long A513Tran_ConsecutivoCC ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A53Tran_IdProveedor ;
   private long A69TDet_Consecutivo ;
   private long A70TDet_ListId ;
   private long AV11cons_Numero ;
   private long GXv_int4[] ;
   private long A15Control_Id ;
   private long A193Control_IdUsuario ;
   private long AV22Usua_Id ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal A654TDet_Valor_Futuro ;
   private String AV18Programa ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A58Tran_Estado ;
   private String GXv_char2[] ;
   private String A192Control_Estado ;
   private String AV12Estado ;
   private String A189Control_Programa ;
   private String Gx_emsg ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date A187Control_FechaHora ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n57Tran_RegionId ;
   private boolean n594Tran_RegionAbrev ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n53Tran_IdProveedor ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n58Tran_Estado ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n632Vida_Util ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n653TDet_Valor_Presente ;
   private boolean n654TDet_Valor_Futuro ;
   private boolean n655TDet_Taza ;
   private boolean n656TDet_Plazo_N ;
   private boolean n492TDet_ListDescripcion ;
   private String AV10body ;
   private String AV17lvc ;
   private String A190Control_Body ;
   private String A191Control_Lvc ;
   private String AV13Host ;
   private String AV21URL ;
   private String A594Tran_RegionAbrev ;
   private String A109Tran_CodAlmaOrigen ;
   private String A110Tran_ModuloOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A419Tran_CentroCostoCodigo ;
   private String A407Tran_AreadanteCodigo ;
   private String A66Elem_Consecutivo ;
   private String A557Elem_Descripcion ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private String A494TDet_ValorAtributo ;
   private String A492TDet_ListDescripcion ;
   private String A188Control_Usuario ;
   private String AV23Usuario ;
   private com.genexus.internet.HttpClient AV14HttpClient ;
   private com.orions2.Sdtsdtentradadevolutivo AV20SDTAlmTransaccion ;
   private com.orions2.Sdtsdtentradadevolutivo_detallesitem AV9AlmDetalleTransaccionItem ;
   private com.orions2.Sdtsdtentradadevolutivo_detallesitem_listaItem AV16lista ;
   private long[] aP0 ;
   private IDataStoreProvider pr_default ;
   private long[] P001P2_A48Tran_CentroCostoId ;
   private long[] P001P2_A46Tran_Id ;
   private short[] P001P2_A421Tran_RegionCodigo ;
   private boolean[] P001P2_n421Tran_RegionCodigo ;
   private long[] P001P2_A57Tran_RegionId ;
   private boolean[] P001P2_n57Tran_RegionId ;
   private String[] P001P2_A594Tran_RegionAbrev ;
   private boolean[] P001P2_n594Tran_RegionAbrev ;
   private long[] P001P2_A513Tran_ConsecutivoCC ;
   private boolean[] P001P2_n513Tran_ConsecutivoCC ;
   private java.util.Date[] P001P2_A55Tran_FechaRegistro ;
   private String[] P001P2_A109Tran_CodAlmaOrigen ;
   private String[] P001P2_A110Tran_ModuloOrigen ;
   private String[] P001P2_A112Tran_CodBodeOrigen ;
   private long[] P001P2_A51Tran_IdCuentadanteOrigen ;
   private boolean[] P001P2_n51Tran_IdCuentadanteOrigen ;
   private long[] P001P2_A53Tran_IdProveedor ;
   private boolean[] P001P2_n53Tran_IdProveedor ;
   private java.util.Date[] P001P2_A390Tran_FechaRatificacion ;
   private boolean[] P001P2_n390Tran_FechaRatificacion ;
   private String[] P001P2_A58Tran_Estado ;
   private boolean[] P001P2_n58Tran_Estado ;
   private String[] P001P2_A419Tran_CentroCostoCodigo ;
   private boolean[] P001P2_n419Tran_CentroCostoCodigo ;
   private String[] P001P2_A407Tran_AreadanteCodigo ;
   private boolean[] P001P2_n407Tran_AreadanteCodigo ;
   private long[] P001P3_A46Tran_Id ;
   private long[] P001P3_A69TDet_Consecutivo ;
   private String[] P001P3_A66Elem_Consecutivo ;
   private String[] P001P3_A557Elem_Descripcion ;
   private String[] P001P3_A490TDet_PlacaNumero ;
   private boolean[] P001P3_n490TDet_PlacaNumero ;
   private short[] P001P3_A632Vida_Util ;
   private boolean[] P001P3_n632Vida_Util ;
   private String[] P001P3_A491TDet_PlacaPadre ;
   private boolean[] P001P3_n491TDet_PlacaPadre ;
   private java.math.BigDecimal[] P001P3_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] P001P3_A657TDet_Otros_Costos ;
   private boolean[] P001P3_n657TDet_Otros_Costos ;
   private java.math.BigDecimal[] P001P3_A653TDet_Valor_Presente ;
   private boolean[] P001P3_n653TDet_Valor_Presente ;
   private java.math.BigDecimal[] P001P3_A654TDet_Valor_Futuro ;
   private boolean[] P001P3_n654TDet_Valor_Futuro ;
   private short[] P001P3_A655TDet_Taza ;
   private boolean[] P001P3_n655TDet_Taza ;
   private byte[] P001P3_A656TDet_Plazo_N ;
   private boolean[] P001P3_n656TDet_Plazo_N ;
   private long[] P001P4_A46Tran_Id ;
   private long[] P001P4_A69TDet_Consecutivo ;
   private long[] P001P4_A70TDet_ListId ;
   private String[] P001P4_A494TDet_ValorAtributo ;
   private String[] P001P4_A492TDet_ListDescripcion ;
   private boolean[] P001P4_n492TDet_ListDescripcion ;
}

final  class wsentradadevolutivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001P2", "SELECT T1.Tran_CentroCostoId AS Tran_CentroCostoId, T1.Tran_Id, T3.Regi_Cod AS Tran_RegionCodigo, T1.Tran_RegionId AS Tran_RegionId, T3.Regi_Abrev AS Tran_RegionAbrev, T1.Tran_ConsecutivoCC, T1.Tran_FechaRegistro, T1.Tran_CodAlmaOrigen, T1.Tran_ModuloOrigen, T1.Tran_CodBodeOrigen, T1.Tran_IdCuentadanteOrigen, T1.Tran_IdProveedor, T1.Tran_FechaRatificacion, T1.Tran_Estado, T2.Cent_Codigo AS Tran_CentroCostoCodigo, T1.Tran_AreadanteCodigo FROM ((ALM_TRANSACCION T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Tran_RegionId) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001P3", "SELECT T1.Tran_Id, T1.TDet_Consecutivo, T1.Elem_Consecutivo, T2.Elem_Descripcion, T1.TDet_PlacaNumero, T2.Vida_Util, T1.TDet_PlacaPadre, T1.TDet_ValorTotal, T1.TDet_Otros_Costos, T1.TDet_Valor_Presente, T1.TDet_Valor_Futuro, T1.TDet_Taza, T1.TDet_Plazo_N FROM (ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001P4", "SELECT T1.Tran_Id, T1.TDet_Consecutivo, T1.TDet_ListId AS TDet_ListId, T1.TDet_ValorAtributo, T2.List_Descripcion AS TDet_ListDescripcion FROM (ALM_DETALLE_TRANSACCIONATRIBUT T1 INNER JOIN ALM_LISTA_ATRIBUTOS T2 ON T2.List_Id = T1.TDet_ListId) WHERE T1.Tran_Id = ? and T1.TDet_Consecutivo = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P001P5", "INSERT INTO SEG_CONTROL_WEBSERVICES(Control_Id, Control_FechaHora, Control_IdUsuario, Control_Usuario, Control_Programa, Control_Body, Control_Lvc, Control_Estado, Control_CodUsuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_CONTROL_WEBSERVICES")
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
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(7) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(10) ;
               ((long[]) buf[14])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 1) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
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
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 3 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setBigDecimal(3, ((Number) parms[2]).longValue(), 0);
               stmt.setVarchar(4, (String)parms[3], 30, false);
               stmt.setString(5, (String)parms[4], 25);
               stmt.setLongVarchar(6, (String)parms[5], false);
               stmt.setLongVarchar(7, (String)parms[6], false);
               stmt.setString(8, (String)parms[7], 1);
               return;
      }
   }

}

