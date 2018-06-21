/*
               File: WSentradaconsumo
        Description: WSentradaconsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:1.30
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wsentradaconsumo extends GXProcedure
{
   public wsentradaconsumo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wsentradaconsumo.class ), "" );
   }

   public wsentradaconsumo( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( )
   {
      wsentradaconsumo.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      wsentradaconsumo.this.aP0 = new long[] {0};
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
      wsentradaconsumo.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Programa = "crearDetalleConsumo" ;
      GXv_char1[0] = AV12Host ;
      GXv_char2[0] = AV19URL ;
      GXv_int3[0] = AV16Puerto ;
      new com.orions2.parametrosservicios(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      wsentradaconsumo.this.AV12Host = GXv_char1[0] ;
      wsentradaconsumo.this.AV19URL = GXv_char2[0] ;
      wsentradaconsumo.this.AV16Puerto = GXv_int3[0] ;
      AV13HttpClient.setHost( AV12Host );
      AV13HttpClient.setPort( AV16Puerto );
      AV13HttpClient.setBaseURL( AV19URL );
      /* Using cursor P001A2 */
      pr_default.execute(0, new Object[] {new Long(AV8Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A48Tran_CentroCostoId = P001A2_A48Tran_CentroCostoId[0] ;
         A46Tran_Id = P001A2_A46Tran_Id[0] ;
         A421Tran_RegionCodigo = P001A2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001A2_n421Tran_RegionCodigo[0] ;
         A57Tran_RegionId = P001A2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P001A2_n57Tran_RegionId[0] ;
         A594Tran_RegionAbrev = P001A2_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P001A2_n594Tran_RegionAbrev[0] ;
         A513Tran_ConsecutivoCC = P001A2_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = P001A2_n513Tran_ConsecutivoCC[0] ;
         A110Tran_ModuloOrigen = P001A2_A110Tran_ModuloOrigen[0] ;
         A55Tran_FechaRegistro = P001A2_A55Tran_FechaRegistro[0] ;
         A390Tran_FechaRatificacion = P001A2_A390Tran_FechaRatificacion[0] ;
         n390Tran_FechaRatificacion = P001A2_n390Tran_FechaRatificacion[0] ;
         A109Tran_CodAlmaOrigen = P001A2_A109Tran_CodAlmaOrigen[0] ;
         A112Tran_CodBodeOrigen = P001A2_A112Tran_CodBodeOrigen[0] ;
         A51Tran_IdCuentadanteOrigen = P001A2_A51Tran_IdCuentadanteOrigen[0] ;
         n51Tran_IdCuentadanteOrigen = P001A2_n51Tran_IdCuentadanteOrigen[0] ;
         A53Tran_IdProveedor = P001A2_A53Tran_IdProveedor[0] ;
         n53Tran_IdProveedor = P001A2_n53Tran_IdProveedor[0] ;
         A58Tran_Estado = P001A2_A58Tran_Estado[0] ;
         n58Tran_Estado = P001A2_n58Tran_Estado[0] ;
         A419Tran_CentroCostoCodigo = P001A2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P001A2_n419Tran_CentroCostoCodigo[0] ;
         A407Tran_AreadanteCodigo = P001A2_A407Tran_AreadanteCodigo[0] ;
         n407Tran_AreadanteCodigo = P001A2_n407Tran_AreadanteCodigo[0] ;
         A408Tran_CursoCodigo = P001A2_A408Tran_CursoCodigo[0] ;
         n408Tran_CursoCodigo = P001A2_n408Tran_CursoCodigo[0] ;
         A419Tran_CentroCostoCodigo = P001A2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P001A2_n419Tran_CentroCostoCodigo[0] ;
         A421Tran_RegionCodigo = P001A2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001A2_n421Tran_RegionCodigo[0] ;
         A594Tran_RegionAbrev = P001A2_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P001A2_n594Tran_RegionAbrev[0] ;
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Tranregioncodigo( A421Tran_RegionCodigo );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Tranregionid( (short)(A57Tran_RegionId) );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Tranregionabrev( A594Tran_RegionAbrev );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Tranid( A46Tran_Id );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Tranconsecutivocc( A513Tran_ConsecutivoCC );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Tranmoduloorigen( A110Tran_ModuloOrigen );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Tranfecharegistro( A55Tran_FechaRegistro );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Tranfecharatificacion( A390Tran_FechaRatificacion );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Trancodalmaorigen( A109Tran_CodAlmaOrigen );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Trancodbodeorigen( A112Tran_CodBodeOrigen );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Tranidcuentadanteorigen( A51Tran_IdCuentadanteOrigen );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Tranidproveedor( A53Tran_IdProveedor );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Tranestado( A58Tran_Estado );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Trancentrocostocodigo( A419Tran_CentroCostoCodigo );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Tranareadantecodigo( A407Tran_AreadanteCodigo );
         AV17SDTDetalleTransaccionConsumo.setgxTv_Sdtsdtentradaconsumo_Trancursocodigo( A408Tran_CursoCodigo );
         /* Using cursor P001A3 */
         pr_default.execute(1, new Object[] {new Long(A46Tran_Id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A69TDet_Consecutivo = P001A3_A69TDet_Consecutivo[0] ;
            A66Elem_Consecutivo = P001A3_A66Elem_Consecutivo[0] ;
            A557Elem_Descripcion = P001A3_A557Elem_Descripcion[0] ;
            A487TDet_Cantidad = P001A3_A487TDet_Cantidad[0] ;
            A489TDet_ValorTotal = P001A3_A489TDet_ValorTotal[0] ;
            A657TDet_Otros_Costos = P001A3_A657TDet_Otros_Costos[0] ;
            n657TDet_Otros_Costos = P001A3_n657TDet_Otros_Costos[0] ;
            A557Elem_Descripcion = P001A3_A557Elem_Descripcion[0] ;
            AV18SDTDetalleTransaccionConsumoItem.setgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetconsecutivo( A69TDet_Consecutivo );
            AV18SDTDetalleTransaccionConsumoItem.setgxTv_Sdtsdtentradaconsumo_detallesitem_Elemconsecutivo( A66Elem_Consecutivo );
            AV18SDTDetalleTransaccionConsumoItem.setgxTv_Sdtsdtentradaconsumo_detallesitem_Elemdescripcion( A557Elem_Descripcion );
            AV18SDTDetalleTransaccionConsumoItem.setgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetcantidad( A487TDet_Cantidad );
            AV18SDTDetalleTransaccionConsumoItem.setgxTv_Sdtsdtentradaconsumo_detallesitem_Tdetvalortotal( A489TDet_ValorTotal );
            AV18SDTDetalleTransaccionConsumoItem.setgxTv_Sdtsdtentradaconsumo_detallesitem_Otroscostos( A657TDet_Otros_Costos );
            /* Using cursor P001A4 */
            pr_default.execute(2, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A70TDet_ListId = P001A4_A70TDet_ListId[0] ;
               A494TDet_ValorAtributo = P001A4_A494TDet_ValorAtributo[0] ;
               A492TDet_ListDescripcion = P001A4_A492TDet_ListDescripcion[0] ;
               n492TDet_ListDescripcion = P001A4_n492TDet_ListDescripcion[0] ;
               A492TDet_ListDescripcion = P001A4_A492TDet_ListDescripcion[0] ;
               n492TDet_ListDescripcion = P001A4_n492TDet_ListDescripcion[0] ;
               if ( A70TDet_ListId == 1 )
               {
                  AV18SDTDetalleTransaccionConsumoItem.setgxTv_Sdtsdtentradaconsumo_detallesitem_Marca( A494TDet_ValorAtributo );
               }
               else if ( A70TDet_ListId == 2 )
               {
                  AV18SDTDetalleTransaccionConsumoItem.setgxTv_Sdtsdtentradaconsumo_detallesitem_Serial( A494TDet_ValorAtributo );
               }
               else if ( A70TDet_ListId == 3 )
               {
                  AV18SDTDetalleTransaccionConsumoItem.setgxTv_Sdtsdtentradaconsumo_detallesitem_Modelo( A494TDet_ValorAtributo );
               }
               else
               {
                  AV22lista.setgxTv_Sdtsdtentradaconsumo_detallesitem_listaItem_Codigolista( A70TDet_ListId );
                  AV22lista.setgxTv_Sdtsdtentradaconsumo_detallesitem_listaItem_Nombrelista( A492TDet_ListDescripcion );
                  AV22lista.setgxTv_Sdtsdtentradaconsumo_detallesitem_listaItem_Valorlista( A494TDet_ValorAtributo );
                  AV18SDTDetalleTransaccionConsumoItem.getgxTv_Sdtsdtentradaconsumo_detallesitem_Lista().add(AV22lista.Clone(), 0);
                  AV22lista = (com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem)new com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem(remoteHandle, context);
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV17SDTDetalleTransaccionConsumo.getgxTv_Sdtsdtentradaconsumo_Detalles().add(AV18SDTDetalleTransaccionConsumoItem.Clone(), 0);
            AV18SDTDetalleTransaccionConsumoItem = (com.orions2.Sdtsdtentradaconsumo_detallesitem)new com.orions2.Sdtsdtentradaconsumo_detallesitem(remoteHandle, context);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV9body = AV17SDTDetalleTransaccionConsumo.toJSonString(false) ;
      AV13HttpClient.addHeader("Content-type", "application/json;charset=UTF-8");
      AV13HttpClient.addString(AV9body);
      AV13HttpClient.execute("POST", AV15Programa);
      AV14lvc = AV13HttpClient.getString() ;
      GXv_char2[0] = "CTRWS" ;
      GXv_int4[0] = AV10cons_Numero ;
      new com.orions2.devuelveconsecutivo(remoteHandle, context).execute( GXv_char2, GXv_int4) ;
      wsentradaconsumo.this.AV10cons_Numero = GXv_int4[0] ;
      /*
         INSERT RECORD ON TABLE SEG_CONTROL_WEBSERVICES

      */
      A15Control_Id = AV10cons_Numero ;
      A193Control_IdUsuario = AV20Usua_Id ;
      A190Control_Body = AV9body ;
      A192Control_Estado = AV11Estado ;
      A187Control_FechaHora = GXutil.now( ) ;
      A191Control_Lvc = AV14lvc ;
      A189Control_Programa = AV15Programa ;
      A188Control_Usuario = AV21Usuario ;
      /* Using cursor P001A5 */
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
      this.aP0[0] = wsentradaconsumo.this.AV8Tran_Id;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "wsentradaconsumo");
      CloseOpenCursors();
      AV13HttpClient.cleanup();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Programa = "" ;
      AV12Host = "" ;
      GXv_char1 = new String [1] ;
      AV19URL = "" ;
      GXv_int3 = new short [1] ;
      AV13HttpClient = new com.genexus.internet.HttpClient();
      scmdbuf = "" ;
      P001A2_A48Tran_CentroCostoId = new long[1] ;
      P001A2_A46Tran_Id = new long[1] ;
      P001A2_A421Tran_RegionCodigo = new short[1] ;
      P001A2_n421Tran_RegionCodigo = new boolean[] {false} ;
      P001A2_A57Tran_RegionId = new long[1] ;
      P001A2_n57Tran_RegionId = new boolean[] {false} ;
      P001A2_A594Tran_RegionAbrev = new String[] {""} ;
      P001A2_n594Tran_RegionAbrev = new boolean[] {false} ;
      P001A2_A513Tran_ConsecutivoCC = new long[1] ;
      P001A2_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      P001A2_A110Tran_ModuloOrigen = new String[] {""} ;
      P001A2_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      P001A2_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      P001A2_n390Tran_FechaRatificacion = new boolean[] {false} ;
      P001A2_A109Tran_CodAlmaOrigen = new String[] {""} ;
      P001A2_A112Tran_CodBodeOrigen = new String[] {""} ;
      P001A2_A51Tran_IdCuentadanteOrigen = new long[1] ;
      P001A2_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      P001A2_A53Tran_IdProveedor = new long[1] ;
      P001A2_n53Tran_IdProveedor = new boolean[] {false} ;
      P001A2_A58Tran_Estado = new String[] {""} ;
      P001A2_n58Tran_Estado = new boolean[] {false} ;
      P001A2_A419Tran_CentroCostoCodigo = new String[] {""} ;
      P001A2_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      P001A2_A407Tran_AreadanteCodigo = new String[] {""} ;
      P001A2_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      P001A2_A408Tran_CursoCodigo = new String[] {""} ;
      P001A2_n408Tran_CursoCodigo = new boolean[] {false} ;
      A594Tran_RegionAbrev = "" ;
      A110Tran_ModuloOrigen = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A58Tran_Estado = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A407Tran_AreadanteCodigo = "" ;
      A408Tran_CursoCodigo = "" ;
      AV17SDTDetalleTransaccionConsumo = new com.orions2.Sdtsdtentradaconsumo(remoteHandle, context);
      P001A3_A46Tran_Id = new long[1] ;
      P001A3_A69TDet_Consecutivo = new long[1] ;
      P001A3_A66Elem_Consecutivo = new String[] {""} ;
      P001A3_A557Elem_Descripcion = new String[] {""} ;
      P001A3_A487TDet_Cantidad = new long[1] ;
      P001A3_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001A3_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001A3_n657TDet_Otros_Costos = new boolean[] {false} ;
      A66Elem_Consecutivo = "" ;
      A557Elem_Descripcion = "" ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      AV18SDTDetalleTransaccionConsumoItem = new com.orions2.Sdtsdtentradaconsumo_detallesitem(remoteHandle, context);
      P001A4_A46Tran_Id = new long[1] ;
      P001A4_A69TDet_Consecutivo = new long[1] ;
      P001A4_A70TDet_ListId = new long[1] ;
      P001A4_A494TDet_ValorAtributo = new String[] {""} ;
      P001A4_A492TDet_ListDescripcion = new String[] {""} ;
      P001A4_n492TDet_ListDescripcion = new boolean[] {false} ;
      A494TDet_ValorAtributo = "" ;
      A492TDet_ListDescripcion = "" ;
      AV22lista = new com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem(remoteHandle, context);
      AV9body = "" ;
      AV14lvc = "" ;
      GXv_char2 = new String [1] ;
      GXv_int4 = new long [1] ;
      A190Control_Body = "" ;
      A192Control_Estado = "" ;
      AV11Estado = "" ;
      A187Control_FechaHora = GXutil.resetTime( GXutil.nullDate() );
      A191Control_Lvc = "" ;
      A189Control_Programa = "" ;
      A188Control_Usuario = "" ;
      AV21Usuario = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wsentradaconsumo__default(),
         new Object[] {
             new Object[] {
            P001A2_A48Tran_CentroCostoId, P001A2_A46Tran_Id, P001A2_A421Tran_RegionCodigo, P001A2_n421Tran_RegionCodigo, P001A2_A57Tran_RegionId, P001A2_n57Tran_RegionId, P001A2_A594Tran_RegionAbrev, P001A2_n594Tran_RegionAbrev, P001A2_A513Tran_ConsecutivoCC, P001A2_n513Tran_ConsecutivoCC,
            P001A2_A110Tran_ModuloOrigen, P001A2_A55Tran_FechaRegistro, P001A2_A390Tran_FechaRatificacion, P001A2_n390Tran_FechaRatificacion, P001A2_A109Tran_CodAlmaOrigen, P001A2_A112Tran_CodBodeOrigen, P001A2_A51Tran_IdCuentadanteOrigen, P001A2_n51Tran_IdCuentadanteOrigen, P001A2_A53Tran_IdProveedor, P001A2_n53Tran_IdProveedor,
            P001A2_A58Tran_Estado, P001A2_n58Tran_Estado, P001A2_A419Tran_CentroCostoCodigo, P001A2_n419Tran_CentroCostoCodigo, P001A2_A407Tran_AreadanteCodigo, P001A2_n407Tran_AreadanteCodigo, P001A2_A408Tran_CursoCodigo, P001A2_n408Tran_CursoCodigo
            }
            , new Object[] {
            P001A3_A46Tran_Id, P001A3_A69TDet_Consecutivo, P001A3_A66Elem_Consecutivo, P001A3_A557Elem_Descripcion, P001A3_A487TDet_Cantidad, P001A3_A489TDet_ValorTotal, P001A3_A657TDet_Otros_Costos, P001A3_n657TDet_Otros_Costos
            }
            , new Object[] {
            P001A4_A46Tran_Id, P001A4_A69TDet_Consecutivo, P001A4_A70TDet_ListId, P001A4_A494TDet_ValorAtributo, P001A4_A492TDet_ListDescripcion, P001A4_n492TDet_ListDescripcion
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16Puerto ;
   private short GXv_int3[] ;
   private short A421Tran_RegionCodigo ;
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
   private long A487TDet_Cantidad ;
   private long A70TDet_ListId ;
   private long AV10cons_Numero ;
   private long GXv_int4[] ;
   private long A15Control_Id ;
   private long A193Control_IdUsuario ;
   private long AV20Usua_Id ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private String AV15Programa ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A58Tran_Estado ;
   private String GXv_char2[] ;
   private String A192Control_Estado ;
   private String AV11Estado ;
   private String A189Control_Programa ;
   private String Gx_emsg ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date A187Control_FechaHora ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n57Tran_RegionId ;
   private boolean n594Tran_RegionAbrev ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n53Tran_IdProveedor ;
   private boolean n58Tran_Estado ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n408Tran_CursoCodigo ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n492TDet_ListDescripcion ;
   private String AV9body ;
   private String AV14lvc ;
   private String A190Control_Body ;
   private String A191Control_Lvc ;
   private String AV12Host ;
   private String AV19URL ;
   private String A594Tran_RegionAbrev ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A419Tran_CentroCostoCodigo ;
   private String A407Tran_AreadanteCodigo ;
   private String A408Tran_CursoCodigo ;
   private String A66Elem_Consecutivo ;
   private String A557Elem_Descripcion ;
   private String A494TDet_ValorAtributo ;
   private String A492TDet_ListDescripcion ;
   private String A188Control_Usuario ;
   private String AV21Usuario ;
   private com.genexus.internet.HttpClient AV13HttpClient ;
   private com.orions2.Sdtsdtentradaconsumo AV17SDTDetalleTransaccionConsumo ;
   private com.orions2.Sdtsdtentradaconsumo_detallesitem AV18SDTDetalleTransaccionConsumoItem ;
   private com.orions2.Sdtsdtentradaconsumo_detallesitem_listaItem AV22lista ;
   private long[] aP0 ;
   private IDataStoreProvider pr_default ;
   private long[] P001A2_A48Tran_CentroCostoId ;
   private long[] P001A2_A46Tran_Id ;
   private short[] P001A2_A421Tran_RegionCodigo ;
   private boolean[] P001A2_n421Tran_RegionCodigo ;
   private long[] P001A2_A57Tran_RegionId ;
   private boolean[] P001A2_n57Tran_RegionId ;
   private String[] P001A2_A594Tran_RegionAbrev ;
   private boolean[] P001A2_n594Tran_RegionAbrev ;
   private long[] P001A2_A513Tran_ConsecutivoCC ;
   private boolean[] P001A2_n513Tran_ConsecutivoCC ;
   private String[] P001A2_A110Tran_ModuloOrigen ;
   private java.util.Date[] P001A2_A55Tran_FechaRegistro ;
   private java.util.Date[] P001A2_A390Tran_FechaRatificacion ;
   private boolean[] P001A2_n390Tran_FechaRatificacion ;
   private String[] P001A2_A109Tran_CodAlmaOrigen ;
   private String[] P001A2_A112Tran_CodBodeOrigen ;
   private long[] P001A2_A51Tran_IdCuentadanteOrigen ;
   private boolean[] P001A2_n51Tran_IdCuentadanteOrigen ;
   private long[] P001A2_A53Tran_IdProveedor ;
   private boolean[] P001A2_n53Tran_IdProveedor ;
   private String[] P001A2_A58Tran_Estado ;
   private boolean[] P001A2_n58Tran_Estado ;
   private String[] P001A2_A419Tran_CentroCostoCodigo ;
   private boolean[] P001A2_n419Tran_CentroCostoCodigo ;
   private String[] P001A2_A407Tran_AreadanteCodigo ;
   private boolean[] P001A2_n407Tran_AreadanteCodigo ;
   private String[] P001A2_A408Tran_CursoCodigo ;
   private boolean[] P001A2_n408Tran_CursoCodigo ;
   private long[] P001A3_A46Tran_Id ;
   private long[] P001A3_A69TDet_Consecutivo ;
   private String[] P001A3_A66Elem_Consecutivo ;
   private String[] P001A3_A557Elem_Descripcion ;
   private long[] P001A3_A487TDet_Cantidad ;
   private java.math.BigDecimal[] P001A3_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] P001A3_A657TDet_Otros_Costos ;
   private boolean[] P001A3_n657TDet_Otros_Costos ;
   private long[] P001A4_A46Tran_Id ;
   private long[] P001A4_A69TDet_Consecutivo ;
   private long[] P001A4_A70TDet_ListId ;
   private String[] P001A4_A494TDet_ValorAtributo ;
   private String[] P001A4_A492TDet_ListDescripcion ;
   private boolean[] P001A4_n492TDet_ListDescripcion ;
}

final  class wsentradaconsumo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001A2", "SELECT T1.Tran_CentroCostoId AS Tran_CentroCostoId, T1.Tran_Id, T3.Regi_Cod AS Tran_RegionCodigo, T1.Tran_RegionId AS Tran_RegionId, T3.Regi_Abrev AS Tran_RegionAbrev, T1.Tran_ConsecutivoCC, T1.Tran_ModuloOrigen, T1.Tran_FechaRegistro, T1.Tran_FechaRatificacion, T1.Tran_CodAlmaOrigen, T1.Tran_CodBodeOrigen, T1.Tran_IdCuentadanteOrigen, T1.Tran_IdProveedor, T1.Tran_Estado, T2.Cent_Codigo AS Tran_CentroCostoCodigo, T1.Tran_AreadanteCodigo, T1.Tran_CursoCodigo FROM ((ALM_TRANSACCION T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Tran_RegionId) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001A3", "SELECT T1.Tran_Id, T1.TDet_Consecutivo, T1.Elem_Consecutivo, T2.Elem_Descripcion, T1.TDet_Cantidad, T1.TDet_ValorTotal, T1.TDet_Otros_Costos FROM (ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001A4", "SELECT T1.Tran_Id, T1.TDet_Consecutivo, T1.TDet_ListId AS TDet_ListId, T1.TDet_ValorAtributo, T2.List_Descripcion AS TDet_ListDescripcion FROM (ALM_DETALLE_TRANSACCIONATRIBUT T1 INNER JOIN ALM_LISTA_ATRIBUTOS T2 ON T2.List_Id = T1.TDet_ListId) WHERE T1.Tran_Id = ? and T1.TDet_Consecutivo = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P001A5", "INSERT INTO SEG_CONTROL_WEBSERVICES(Control_Id, Control_FechaHora, Control_IdUsuario, Control_Usuario, Control_Programa, Control_Body, Control_Lvc, Control_Estado, Control_CodUsuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_CONTROL_WEBSERVICES")
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
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((long[]) buf[16])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 1) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2) ;
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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

