/*
               File: WSsalidaconsumo
        Description: WSsalidaconsumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:11:7.26
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wssalidaconsumo extends GXProcedure
{
   public wssalidaconsumo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wssalidaconsumo.class ), "" );
   }

   public wssalidaconsumo( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public long executeUdp( )
   {
      wssalidaconsumo.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      wssalidaconsumo.this.aP0 = new long[] {0};
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
      wssalidaconsumo.this.AV8Tran_Id = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Programa = "crearSalida" ;
      GXv_char1[0] = AV12Host ;
      GXv_char2[0] = AV19URL ;
      GXv_int3[0] = AV16Puerto ;
      new com.orions2.parametrosservicios(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      wssalidaconsumo.this.AV12Host = GXv_char1[0] ;
      wssalidaconsumo.this.AV19URL = GXv_char2[0] ;
      wssalidaconsumo.this.AV16Puerto = GXv_int3[0] ;
      AV13HttpClient.setHost( AV12Host );
      AV13HttpClient.setPort( AV16Puerto );
      AV13HttpClient.setBaseURL( AV19URL );
      /* Using cursor P001S2 */
      pr_default.execute(0, new Object[] {new Long(AV8Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A48Tran_CentroCostoId = P001S2_A48Tran_CentroCostoId[0] ;
         A50Tran_CentroCostoIdDestino = P001S2_A50Tran_CentroCostoIdDestino[0] ;
         n50Tran_CentroCostoIdDestino = P001S2_n50Tran_CentroCostoIdDestino[0] ;
         A57Tran_RegionId = P001S2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = P001S2_n57Tran_RegionId[0] ;
         A46Tran_Id = P001S2_A46Tran_Id[0] ;
         A421Tran_RegionCodigo = P001S2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001S2_n421Tran_RegionCodigo[0] ;
         A594Tran_RegionAbrev = P001S2_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P001S2_n594Tran_RegionAbrev[0] ;
         A513Tran_ConsecutivoCC = P001S2_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = P001S2_n513Tran_ConsecutivoCC[0] ;
         A385Tran_ModuloDestino = P001S2_A385Tran_ModuloDestino[0] ;
         A55Tran_FechaRegistro = P001S2_A55Tran_FechaRegistro[0] ;
         A111Tran_CodAlmaDestino = P001S2_A111Tran_CodAlmaDestino[0] ;
         A387Tran_CodBodeDestino = P001S2_A387Tran_CodBodeDestino[0] ;
         A52Tran_IdCuentadanteDestino = P001S2_A52Tran_IdCuentadanteDestino[0] ;
         n52Tran_IdCuentadanteDestino = P001S2_n52Tran_IdCuentadanteDestino[0] ;
         A58Tran_Estado = P001S2_A58Tran_Estado[0] ;
         n58Tran_Estado = P001S2_n58Tran_Estado[0] ;
         A419Tran_CentroCostoCodigo = P001S2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P001S2_n419Tran_CentroCostoCodigo[0] ;
         A516Tran_CentroCostoCodigoDestino = P001S2_A516Tran_CentroCostoCodigoDestino[0] ;
         n516Tran_CentroCostoCodigoDestino = P001S2_n516Tran_CentroCostoCodigoDestino[0] ;
         A408Tran_CursoCodigo = P001S2_A408Tran_CursoCodigo[0] ;
         n408Tran_CursoCodigo = P001S2_n408Tran_CursoCodigo[0] ;
         A407Tran_AreadanteCodigo = P001S2_A407Tran_AreadanteCodigo[0] ;
         n407Tran_AreadanteCodigo = P001S2_n407Tran_AreadanteCodigo[0] ;
         A419Tran_CentroCostoCodigo = P001S2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = P001S2_n419Tran_CentroCostoCodigo[0] ;
         A516Tran_CentroCostoCodigoDestino = P001S2_A516Tran_CentroCostoCodigoDestino[0] ;
         n516Tran_CentroCostoCodigoDestino = P001S2_n516Tran_CentroCostoCodigoDestino[0] ;
         A421Tran_RegionCodigo = P001S2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = P001S2_n421Tran_RegionCodigo[0] ;
         A594Tran_RegionAbrev = P001S2_A594Tran_RegionAbrev[0] ;
         n594Tran_RegionAbrev = P001S2_n594Tran_RegionAbrev[0] ;
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Tranregioncodigo( A421Tran_RegionCodigo );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Tranregionabrev( A594Tran_RegionAbrev );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Tranid( A46Tran_Id );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Tranconsecutivocc( A513Tran_ConsecutivoCC );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Tranmodulodestino( A385Tran_ModuloDestino );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Tranfecharegistro( A55Tran_FechaRegistro );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Trancodalmadestino( A111Tran_CodAlmaDestino );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Trancodbodedestino( A387Tran_CodBodeDestino );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Tranidcuentadantedestino( A52Tran_IdCuentadanteDestino );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Tranestado( A58Tran_Estado );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigo( A419Tran_CentroCostoCodigo );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Trancentrocostocodigodestino( A516Tran_CentroCostoCodigoDestino );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Trancursocodigo( A408Tran_CursoCodigo );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Tranareadantecodigo( A407Tran_AreadanteCodigo );
         AV17SDTDetalleTransaccionSalidaConsumo.setgxTv_Sdtsdtsalidaconsumo_Tipodeelemento( "C" );
         /* Using cursor P001S3 */
         pr_default.execute(1, new Object[] {new Long(A46Tran_Id)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A69TDet_Consecutivo = P001S3_A69TDet_Consecutivo[0] ;
            A66Elem_Consecutivo = P001S3_A66Elem_Consecutivo[0] ;
            A557Elem_Descripcion = P001S3_A557Elem_Descripcion[0] ;
            A487TDet_Cantidad = P001S3_A487TDet_Cantidad[0] ;
            A557Elem_Descripcion = P001S3_A557Elem_Descripcion[0] ;
            AV18SDTDetalleTransaccionSalidaConsumoItem.setgxTv_Sdtsdtsalidaconsumo_detallesitem_Tdetconsecutivo( A69TDet_Consecutivo );
            AV18SDTDetalleTransaccionSalidaConsumoItem.setgxTv_Sdtsdtsalidaconsumo_detallesitem_Elemconsecutivo( A66Elem_Consecutivo );
            AV18SDTDetalleTransaccionSalidaConsumoItem.setgxTv_Sdtsdtsalidaconsumo_detallesitem_Elemdescripcion( A557Elem_Descripcion );
            AV18SDTDetalleTransaccionSalidaConsumoItem.setgxTv_Sdtsdtsalidaconsumo_detallesitem_Tdetcantidad( A487TDet_Cantidad );
            /* Using cursor P001S4 */
            pr_default.execute(2, new Object[] {new Long(A46Tran_Id), new Long(A69TDet_Consecutivo)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A70TDet_ListId = P001S4_A70TDet_ListId[0] ;
               A492TDet_ListDescripcion = P001S4_A492TDet_ListDescripcion[0] ;
               n492TDet_ListDescripcion = P001S4_n492TDet_ListDescripcion[0] ;
               A494TDet_ValorAtributo = P001S4_A494TDet_ValorAtributo[0] ;
               A492TDet_ListDescripcion = P001S4_A492TDet_ListDescripcion[0] ;
               n492TDet_ListDescripcion = P001S4_n492TDet_ListDescripcion[0] ;
               AV22lista.setgxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Codigolista( A70TDet_ListId );
               AV22lista.setgxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Nombrelista( A492TDet_ListDescripcion );
               AV22lista.setgxTv_Sdtsdtsalidaconsumo_detallesitem_listaItem_Valorlista( A494TDet_ValorAtributo );
               AV18SDTDetalleTransaccionSalidaConsumoItem.getgxTv_Sdtsdtsalidaconsumo_detallesitem_Lista().add(AV22lista.Clone(), 0);
               AV22lista = (com.orions2.Sdtsdtsalidaconsumo_detallesitem_listaItem)new com.orions2.Sdtsdtsalidaconsumo_detallesitem_listaItem(remoteHandle, context);
               pr_default.readNext(2);
            }
            pr_default.close(2);
            AV17SDTDetalleTransaccionSalidaConsumo.getgxTv_Sdtsdtsalidaconsumo_Detalles().add(AV18SDTDetalleTransaccionSalidaConsumoItem.Clone(), 0);
            AV18SDTDetalleTransaccionSalidaConsumoItem = (com.orions2.Sdtsdtsalidaconsumo_detallesitem)new com.orions2.Sdtsdtsalidaconsumo_detallesitem(remoteHandle, context);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV9body = AV17SDTDetalleTransaccionSalidaConsumo.toJSonString(false) ;
      AV13HttpClient.addHeader("Content-type", "application/json;charset=UTF-8");
      AV13HttpClient.addString(AV9body);
      AV13HttpClient.execute("POST", AV15Programa);
      AV14lvc = AV13HttpClient.getString() ;
      GXv_char2[0] = "CTRWS" ;
      GXv_int4[0] = AV10cons_Numero ;
      new com.orions2.devuelveconsecutivo(remoteHandle, context).execute( GXv_char2, GXv_int4) ;
      wssalidaconsumo.this.AV10cons_Numero = GXv_int4[0] ;
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
      /* Using cursor P001S5 */
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
      this.aP0[0] = wssalidaconsumo.this.AV8Tran_Id;
      Application.commit(context, remoteHandle, "DEFAULT",pr_default, "wssalidaconsumo");
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
      P001S2_A48Tran_CentroCostoId = new long[1] ;
      P001S2_A50Tran_CentroCostoIdDestino = new long[1] ;
      P001S2_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      P001S2_A57Tran_RegionId = new long[1] ;
      P001S2_n57Tran_RegionId = new boolean[] {false} ;
      P001S2_A46Tran_Id = new long[1] ;
      P001S2_A421Tran_RegionCodigo = new short[1] ;
      P001S2_n421Tran_RegionCodigo = new boolean[] {false} ;
      P001S2_A594Tran_RegionAbrev = new String[] {""} ;
      P001S2_n594Tran_RegionAbrev = new boolean[] {false} ;
      P001S2_A513Tran_ConsecutivoCC = new long[1] ;
      P001S2_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      P001S2_A385Tran_ModuloDestino = new String[] {""} ;
      P001S2_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      P001S2_A111Tran_CodAlmaDestino = new String[] {""} ;
      P001S2_A387Tran_CodBodeDestino = new String[] {""} ;
      P001S2_A52Tran_IdCuentadanteDestino = new long[1] ;
      P001S2_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      P001S2_A58Tran_Estado = new String[] {""} ;
      P001S2_n58Tran_Estado = new boolean[] {false} ;
      P001S2_A419Tran_CentroCostoCodigo = new String[] {""} ;
      P001S2_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      P001S2_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      P001S2_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      P001S2_A408Tran_CursoCodigo = new String[] {""} ;
      P001S2_n408Tran_CursoCodigo = new boolean[] {false} ;
      P001S2_A407Tran_AreadanteCodigo = new String[] {""} ;
      P001S2_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      A594Tran_RegionAbrev = "" ;
      A385Tran_ModuloDestino = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A58Tran_Estado = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A516Tran_CentroCostoCodigoDestino = "" ;
      A408Tran_CursoCodigo = "" ;
      A407Tran_AreadanteCodigo = "" ;
      AV17SDTDetalleTransaccionSalidaConsumo = new com.orions2.Sdtsdtsalidaconsumo(remoteHandle, context);
      P001S3_A46Tran_Id = new long[1] ;
      P001S3_A69TDet_Consecutivo = new long[1] ;
      P001S3_A66Elem_Consecutivo = new String[] {""} ;
      P001S3_A557Elem_Descripcion = new String[] {""} ;
      P001S3_A487TDet_Cantidad = new long[1] ;
      A66Elem_Consecutivo = "" ;
      A557Elem_Descripcion = "" ;
      AV18SDTDetalleTransaccionSalidaConsumoItem = new com.orions2.Sdtsdtsalidaconsumo_detallesitem(remoteHandle, context);
      P001S4_A46Tran_Id = new long[1] ;
      P001S4_A69TDet_Consecutivo = new long[1] ;
      P001S4_A70TDet_ListId = new long[1] ;
      P001S4_A492TDet_ListDescripcion = new String[] {""} ;
      P001S4_n492TDet_ListDescripcion = new boolean[] {false} ;
      P001S4_A494TDet_ValorAtributo = new String[] {""} ;
      A492TDet_ListDescripcion = "" ;
      A494TDet_ValorAtributo = "" ;
      AV22lista = new com.orions2.Sdtsdtsalidaconsumo_detallesitem_listaItem(remoteHandle, context);
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wssalidaconsumo__default(),
         new Object[] {
             new Object[] {
            P001S2_A48Tran_CentroCostoId, P001S2_A50Tran_CentroCostoIdDestino, P001S2_n50Tran_CentroCostoIdDestino, P001S2_A57Tran_RegionId, P001S2_n57Tran_RegionId, P001S2_A46Tran_Id, P001S2_A421Tran_RegionCodigo, P001S2_n421Tran_RegionCodigo, P001S2_A594Tran_RegionAbrev, P001S2_n594Tran_RegionAbrev,
            P001S2_A513Tran_ConsecutivoCC, P001S2_n513Tran_ConsecutivoCC, P001S2_A385Tran_ModuloDestino, P001S2_A55Tran_FechaRegistro, P001S2_A111Tran_CodAlmaDestino, P001S2_A387Tran_CodBodeDestino, P001S2_A52Tran_IdCuentadanteDestino, P001S2_n52Tran_IdCuentadanteDestino, P001S2_A58Tran_Estado, P001S2_n58Tran_Estado,
            P001S2_A419Tran_CentroCostoCodigo, P001S2_n419Tran_CentroCostoCodigo, P001S2_A516Tran_CentroCostoCodigoDestino, P001S2_n516Tran_CentroCostoCodigoDestino, P001S2_A408Tran_CursoCodigo, P001S2_n408Tran_CursoCodigo, P001S2_A407Tran_AreadanteCodigo, P001S2_n407Tran_AreadanteCodigo
            }
            , new Object[] {
            P001S3_A46Tran_Id, P001S3_A69TDet_Consecutivo, P001S3_A66Elem_Consecutivo, P001S3_A557Elem_Descripcion, P001S3_A487TDet_Cantidad
            }
            , new Object[] {
            P001S4_A46Tran_Id, P001S4_A69TDet_Consecutivo, P001S4_A70TDet_ListId, P001S4_A492TDet_ListDescripcion, P001S4_n492TDet_ListDescripcion, P001S4_A494TDet_ValorAtributo
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
   private long A50Tran_CentroCostoIdDestino ;
   private long A57Tran_RegionId ;
   private long A46Tran_Id ;
   private long A513Tran_ConsecutivoCC ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long A70TDet_ListId ;
   private long AV10cons_Numero ;
   private long GXv_int4[] ;
   private long A15Control_Id ;
   private long A193Control_IdUsuario ;
   private long AV20Usua_Id ;
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
   private java.util.Date A187Control_FechaHora ;
   private boolean n50Tran_CentroCostoIdDestino ;
   private boolean n57Tran_RegionId ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n594Tran_RegionAbrev ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n58Tran_Estado ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n516Tran_CentroCostoCodigoDestino ;
   private boolean n408Tran_CursoCodigo ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n492TDet_ListDescripcion ;
   private String AV9body ;
   private String AV14lvc ;
   private String A190Control_Body ;
   private String A191Control_Lvc ;
   private String AV12Host ;
   private String AV19URL ;
   private String A594Tran_RegionAbrev ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A419Tran_CentroCostoCodigo ;
   private String A516Tran_CentroCostoCodigoDestino ;
   private String A408Tran_CursoCodigo ;
   private String A407Tran_AreadanteCodigo ;
   private String A66Elem_Consecutivo ;
   private String A557Elem_Descripcion ;
   private String A492TDet_ListDescripcion ;
   private String A494TDet_ValorAtributo ;
   private String A188Control_Usuario ;
   private String AV21Usuario ;
   private com.genexus.internet.HttpClient AV13HttpClient ;
   private com.orions2.Sdtsdtsalidaconsumo AV17SDTDetalleTransaccionSalidaConsumo ;
   private com.orions2.Sdtsdtsalidaconsumo_detallesitem AV18SDTDetalleTransaccionSalidaConsumoItem ;
   private com.orions2.Sdtsdtsalidaconsumo_detallesitem_listaItem AV22lista ;
   private long[] aP0 ;
   private IDataStoreProvider pr_default ;
   private long[] P001S2_A48Tran_CentroCostoId ;
   private long[] P001S2_A50Tran_CentroCostoIdDestino ;
   private boolean[] P001S2_n50Tran_CentroCostoIdDestino ;
   private long[] P001S2_A57Tran_RegionId ;
   private boolean[] P001S2_n57Tran_RegionId ;
   private long[] P001S2_A46Tran_Id ;
   private short[] P001S2_A421Tran_RegionCodigo ;
   private boolean[] P001S2_n421Tran_RegionCodigo ;
   private String[] P001S2_A594Tran_RegionAbrev ;
   private boolean[] P001S2_n594Tran_RegionAbrev ;
   private long[] P001S2_A513Tran_ConsecutivoCC ;
   private boolean[] P001S2_n513Tran_ConsecutivoCC ;
   private String[] P001S2_A385Tran_ModuloDestino ;
   private java.util.Date[] P001S2_A55Tran_FechaRegistro ;
   private String[] P001S2_A111Tran_CodAlmaDestino ;
   private String[] P001S2_A387Tran_CodBodeDestino ;
   private long[] P001S2_A52Tran_IdCuentadanteDestino ;
   private boolean[] P001S2_n52Tran_IdCuentadanteDestino ;
   private String[] P001S2_A58Tran_Estado ;
   private boolean[] P001S2_n58Tran_Estado ;
   private String[] P001S2_A419Tran_CentroCostoCodigo ;
   private boolean[] P001S2_n419Tran_CentroCostoCodigo ;
   private String[] P001S2_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] P001S2_n516Tran_CentroCostoCodigoDestino ;
   private String[] P001S2_A408Tran_CursoCodigo ;
   private boolean[] P001S2_n408Tran_CursoCodigo ;
   private String[] P001S2_A407Tran_AreadanteCodigo ;
   private boolean[] P001S2_n407Tran_AreadanteCodigo ;
   private long[] P001S3_A46Tran_Id ;
   private long[] P001S3_A69TDet_Consecutivo ;
   private String[] P001S3_A66Elem_Consecutivo ;
   private String[] P001S3_A557Elem_Descripcion ;
   private long[] P001S3_A487TDet_Cantidad ;
   private long[] P001S4_A46Tran_Id ;
   private long[] P001S4_A69TDet_Consecutivo ;
   private long[] P001S4_A70TDet_ListId ;
   private String[] P001S4_A492TDet_ListDescripcion ;
   private boolean[] P001S4_n492TDet_ListDescripcion ;
   private String[] P001S4_A494TDet_ValorAtributo ;
}

final  class wssalidaconsumo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001S2", "SELECT T1.Tran_CentroCostoId AS Tran_CentroCostoId, T1.Tran_CentroCostoIdDestino AS Tran_CentroCostoIdDestino, T1.Tran_RegionId AS Tran_RegionId, T1.Tran_Id, T4.Regi_Cod AS Tran_RegionCodigo, T4.Regi_Abrev AS Tran_RegionAbrev, T1.Tran_ConsecutivoCC, T1.Tran_ModuloDestino, T1.Tran_FechaRegistro, T1.Tran_CodAlmaDestino, T1.Tran_CodBodeDestino, T1.Tran_IdCuentadanteDestino, T1.Tran_Estado, T2.Cent_Codigo AS Tran_CentroCostoCodigo, T3.Cent_Codigo AS Tran_CentroCostoCodigoDestino, T1.Tran_CursoCodigo, T1.Tran_AreadanteCodigo FROM (((ALM_TRANSACCION T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = T1.Tran_CentroCostoIdDestino) LEFT JOIN GEN_REGIONAL T4 ON T4.Regi_Id = T1.Tran_RegionId) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P001S3", "SELECT T1.Tran_Id, T1.TDet_Consecutivo, T1.Elem_Consecutivo, T2.Elem_Descripcion, T1.TDet_Cantidad FROM (ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P001S4", "SELECT T1.Tran_Id, T1.TDet_Consecutivo, T1.TDet_ListId AS TDet_ListId, T2.List_Descripcion AS TDet_ListDescripcion, T1.TDet_ValorAtributo FROM (ALM_DETALLE_TRANSACCIONATRIBUT T1 INNER JOIN ALM_LISTA_ATRIBUTOS T2 ON T2.List_Id = T1.TDet_ListId) WHERE T1.Tran_Id = ? and T1.TDet_Consecutivo = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P001S5", "INSERT INTO SEG_CONTROL_WEBSERVICES(Control_Id, Control_FechaHora, Control_IdUsuario, Control_Usuario, Control_Programa, Control_Body, Control_Lvc, Control_Estado, Control_CodUsuario) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "SEG_CONTROL_WEBSERVICES")
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
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(9) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((long[]) buf[16])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 1) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
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
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
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

