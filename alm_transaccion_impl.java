/*
               File: alm_transaccion_impl
        Description: TRANSACCIÓN
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:13:3.56
       Program type: Callable routine
          Main DBMS: oracle7
*/
package com.orions2 ;
import com.orions2.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class alm_transaccion_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      gxfirstwebparm_bkp = gxfirstwebparm ;
      gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         dyncall( httpContext.GetNextPar( )) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action44") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_44_057( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action45") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_45_057( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action46") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_46_057( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action47") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_47_057( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action48") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_48_057( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel29"+"_"+"vCONSECUTIVOCC") == 0 )
      {
         A48Tran_CentroCostoId = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx29asaconsecutivocc057( A48Tran_CentroCostoId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_50") == 0 )
      {
         A47Tran_UsuarioId = GXutil.lval( httpContext.GetNextPar( )) ;
         n47Tran_UsuarioId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A47Tran_UsuarioId", GXutil.ltrim( GXutil.str( A47Tran_UsuarioId, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_50( A47Tran_UsuarioId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_51") == 0 )
      {
         A48Tran_CentroCostoId = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_51( A48Tran_CentroCostoId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_53") == 0 )
      {
         A57Tran_RegionId = GXutil.lval( httpContext.GetNextPar( )) ;
         n57Tran_RegionId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A57Tran_RegionId", GXutil.ltrim( GXutil.str( A57Tran_RegionId, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_53( A57Tran_RegionId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_55") == 0 )
      {
         A49Tran_CodigoMovimiento = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_55( A49Tran_CodigoMovimiento) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_61") == 0 )
      {
         A499Tran_CodTipoElemento = GXutil.lval( httpContext.GetNextPar( )) ;
         n499Tran_CodTipoElemento = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A499Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( A499Tran_CodTipoElemento, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_61( A499Tran_CodTipoElemento) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_56") == 0 )
      {
         A51Tran_IdCuentadanteOrigen = GXutil.lval( httpContext.GetNextPar( )) ;
         n51Tran_IdCuentadanteOrigen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A51Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( A51Tran_IdCuentadanteOrigen, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_56( A51Tran_IdCuentadanteOrigen) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_57") == 0 )
      {
         A53Tran_IdProveedor = GXutil.lval( httpContext.GetNextPar( )) ;
         n53Tran_IdProveedor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A53Tran_IdProveedor", GXutil.ltrim( GXutil.str( A53Tran_IdProveedor, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_57( A53Tran_IdProveedor) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_58") == 0 )
      {
         A52Tran_IdCuentadanteDestino = GXutil.lval( httpContext.GetNextPar( )) ;
         n52Tran_IdCuentadanteDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A52Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( A52Tran_IdCuentadanteDestino, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_58( A52Tran_IdCuentadanteDestino) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_60") == 0 )
      {
         A54Tran_TipoIngreso = GXutil.lval( httpContext.GetNextPar( )) ;
         n54Tran_TipoIngreso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_60( A54Tran_TipoIngreso) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_52") == 0 )
      {
         A50Tran_CentroCostoIdDestino = GXutil.lval( httpContext.GetNextPar( )) ;
         n50Tran_CentroCostoIdDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A50Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( A50Tran_CentroCostoIdDestino, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_52( A50Tran_CentroCostoIdDestino) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_54") == 0 )
      {
         A518Tran_RegionIdDestino = GXutil.lval( httpContext.GetNextPar( )) ;
         n518Tran_RegionIdDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A518Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( A518Tran_RegionIdDestino, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_54( A518Tran_RegionIdDestino) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_59") == 0 )
      {
         A56Tran_IdCuentadanteResponsabili = GXutil.lval( httpContext.GetNextPar( )) ;
         n56Tran_IdCuentadanteResponsabili = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A56Tran_IdCuentadanteResponsabili", GXutil.ltrim( GXutil.str( A56Tran_IdCuentadanteResponsabili, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_59( A56Tran_IdCuentadanteResponsabili) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_63") == 0 )
      {
         A827Tran_Nro_Documento = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_63( A827Tran_Nro_Documento) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
      {
         httpContext.setAjaxEventMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridalm_transaccion_documentos") == 0 )
      {
         nRC_GXsfl_334 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_334_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_334_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridalm_transaccion_documentos_newrow( ) ;
         return  ;
      }
      else
      {
         if ( ! httpContext.IsValidAjaxCall( false) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = gxfirstwebparm_bkp ;
      }
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV33Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Tran_Id", GXutil.ltrim( GXutil.str( AV33Tran_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Tran_Id), "ZZZZZZZZZZ9")));
         }
      }
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
      }
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      cmbTran_IndAreadante.setName( "TRAN_INDAREADANTE" );
      cmbTran_IndAreadante.setWebtags( "" );
      cmbTran_IndAreadante.addItem("", "", (short)(0));
      cmbTran_IndAreadante.addItem("SI", "SI", (short)(0));
      cmbTran_IndAreadante.addItem("NO", "NO", (short)(0));
      if ( cmbTran_IndAreadante.getItemCount() > 0 )
      {
         A478Tran_IndAreadante = cmbTran_IndAreadante.getValidValue(A478Tran_IndAreadante) ;
         n478Tran_IndAreadante = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
      }
      cmbTran_IndE_S.setName( "TRAN_INDE_S" );
      cmbTran_IndE_S.setWebtags( "" );
      cmbTran_IndE_S.addItem("E", "ENTRADA", (short)(0));
      cmbTran_IndE_S.addItem("S", "SALIDA", (short)(0));
      cmbTran_IndE_S.addItem("T", "TRASPASO", (short)(0));
      cmbTran_IndE_S.addItem("R", "RECUPERACIÓN", (short)(0));
      if ( cmbTran_IndE_S.getItemCount() > 0 )
      {
         A481Tran_IndE_S = cmbTran_IndE_S.getValidValue(A481Tran_IndE_S) ;
         n481Tran_IndE_S = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A481Tran_IndE_S", A481Tran_IndE_S);
      }
      cmbTran_IndCurso.setName( "TRAN_INDCURSO" );
      cmbTran_IndCurso.setWebtags( "" );
      cmbTran_IndCurso.addItem("", "", (short)(0));
      cmbTran_IndCurso.addItem("SI", "SI", (short)(0));
      cmbTran_IndCurso.addItem("NO", "NO", (short)(0));
      if ( cmbTran_IndCurso.getItemCount() > 0 )
      {
         A479Tran_IndCurso = cmbTran_IndCurso.getValidValue(A479Tran_IndCurso) ;
         n479Tran_IndCurso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A479Tran_IndCurso", A479Tran_IndCurso);
      }
      cmbTran_TipoElemento.setName( "TRAN_TIPOELEMENTO" );
      cmbTran_TipoElemento.setWebtags( "" );
      cmbTran_TipoElemento.addItem("C", "Consumo", (short)(0));
      cmbTran_TipoElemento.addItem("D", "Devolutivo", (short)(0));
      if ( cmbTran_TipoElemento.getItemCount() > 0 )
      {
         A482Tran_TipoElemento = cmbTran_TipoElemento.getValidValue(A482Tran_TipoElemento) ;
         n482Tran_TipoElemento = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
      }
      cmbTran_SolicitaCCDestino.setName( "TRAN_SOLICITACCDESTINO" );
      cmbTran_SolicitaCCDestino.setWebtags( "" );
      cmbTran_SolicitaCCDestino.addItem("", "", (short)(0));
      cmbTran_SolicitaCCDestino.addItem("SI", "SI", (short)(0));
      cmbTran_SolicitaCCDestino.addItem("NO", "NO", (short)(0));
      if ( cmbTran_SolicitaCCDestino.getItemCount() > 0 )
      {
         A707Tran_SolicitaCCDestino = cmbTran_SolicitaCCDestino.getValidValue(A707Tran_SolicitaCCDestino) ;
         n707Tran_SolicitaCCDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
      }
      cmbTran_SolicitaRegionDestino.setName( "TRAN_SOLICITAREGIONDESTINO" );
      cmbTran_SolicitaRegionDestino.setWebtags( "" );
      cmbTran_SolicitaRegionDestino.addItem("", "", (short)(0));
      cmbTran_SolicitaRegionDestino.addItem("SI", "SI", (short)(0));
      cmbTran_SolicitaRegionDestino.addItem("NO", "NO", (short)(0));
      if ( cmbTran_SolicitaRegionDestino.getItemCount() > 0 )
      {
         A708Tran_SolicitaRegionDestino = cmbTran_SolicitaRegionDestino.getValidValue(A708Tran_SolicitaRegionDestino) ;
         n708Tran_SolicitaRegionDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
      }
      cmbTran_CuentaResponsabilidad.setName( "TRAN_CUENTARESPONSABILIDAD" );
      cmbTran_CuentaResponsabilidad.setWebtags( "" );
      cmbTran_CuentaResponsabilidad.addItem("", "", (short)(0));
      cmbTran_CuentaResponsabilidad.addItem("SI", "SI", (short)(0));
      cmbTran_CuentaResponsabilidad.addItem("NO", "NO", (short)(0));
      if ( cmbTran_CuentaResponsabilidad.getItemCount() > 0 )
      {
         A754Tran_CuentaResponsabilidad = cmbTran_CuentaResponsabilidad.getValidValue(A754Tran_CuentaResponsabilidad) ;
         n754Tran_CuentaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
      }
      cmbTran_Estado.setName( "TRAN_ESTADO" );
      cmbTran_Estado.setWebtags( "" );
      cmbTran_Estado.addItem("A", "Anulado", (short)(0));
      cmbTran_Estado.addItem("R", "Ratificado", (short)(0));
      cmbTran_Estado.addItem("P", "Pendiente", (short)(0));
      cmbTran_Estado.addItem("I", "Incompleto", (short)(0));
      if ( cmbTran_Estado.getItemCount() > 0 )
      {
         A58Tran_Estado = cmbTran_Estado.getValidValue(A58Tran_Estado) ;
         n58Tran_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A58Tran_Estado", A58Tran_Estado);
      }
      cmbTran_TipoIngreso.setName( "TRAN_TIPOINGRESO" );
      cmbTran_TipoIngreso.setWebtags( "" );
      if ( cmbTran_TipoIngreso.getItemCount() > 0 )
      {
         A54Tran_TipoIngreso = GXutil.lval( cmbTran_TipoIngreso.getValidValue(GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)))) ;
         n54Tran_TipoIngreso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
      }
      cmbTran_TipoEntra.setName( "TRAN_TIPOENTRA" );
      cmbTran_TipoEntra.setWebtags( "" );
      if ( cmbTran_TipoEntra.getItemCount() > 0 )
      {
         A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
         n527Tran_TipoEntra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
      }
      cmbTran_EntidadGobierno.setName( "TRAN_ENTIDADGOBIERNO" );
      cmbTran_EntidadGobierno.setWebtags( "" );
      cmbTran_EntidadGobierno.addItem("", "", (short)(0));
      cmbTran_EntidadGobierno.addItem("SI", "SI", (short)(0));
      cmbTran_EntidadGobierno.addItem("NO", "NO", (short)(0));
      if ( cmbTran_EntidadGobierno.getItemCount() > 0 )
      {
         A859Tran_EntidadGobierno = cmbTran_EntidadGobierno.getValidValue(A859Tran_EntidadGobierno) ;
         n859Tran_EntidadGobierno = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A859Tran_EntidadGobierno", A859Tran_EntidadGobierno);
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "TRANSACCIÓN", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTran_UsuarioId_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_transaccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_transaccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_transaccion_impl.class ));
   }

   public alm_transaccion_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbTran_IndAreadante = new HTMLChoice();
      cmbTran_IndE_S = new HTMLChoice();
      cmbTran_IndCurso = new HTMLChoice();
      cmbTran_TipoElemento = new HTMLChoice();
      cmbTran_SolicitaCCDestino = new HTMLChoice();
      cmbTran_SolicitaRegionDestino = new HTMLChoice();
      cmbTran_CuentaResponsabilidad = new HTMLChoice();
      cmbTran_Estado = new HTMLChoice();
      cmbTran_TipoIngreso = new HTMLChoice();
      cmbTran_TipoEntra = new HTMLChoice();
      cmbTran_EntidadGobierno = new HTMLChoice();
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         MasterPageObj = new com.orions2.rwdmasterpage_impl (remoteHandle, context.copy());
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbTran_IndAreadante.getItemCount() > 0 )
      {
         A478Tran_IndAreadante = cmbTran_IndAreadante.getValidValue(A478Tran_IndAreadante) ;
         n478Tran_IndAreadante = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
      }
      if ( cmbTran_IndE_S.getItemCount() > 0 )
      {
         A481Tran_IndE_S = cmbTran_IndE_S.getValidValue(A481Tran_IndE_S) ;
         n481Tran_IndE_S = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A481Tran_IndE_S", A481Tran_IndE_S);
      }
      if ( cmbTran_IndCurso.getItemCount() > 0 )
      {
         A479Tran_IndCurso = cmbTran_IndCurso.getValidValue(A479Tran_IndCurso) ;
         n479Tran_IndCurso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A479Tran_IndCurso", A479Tran_IndCurso);
      }
      if ( cmbTran_TipoElemento.getItemCount() > 0 )
      {
         A482Tran_TipoElemento = cmbTran_TipoElemento.getValidValue(A482Tran_TipoElemento) ;
         n482Tran_TipoElemento = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
      }
      if ( cmbTran_SolicitaCCDestino.getItemCount() > 0 )
      {
         A707Tran_SolicitaCCDestino = cmbTran_SolicitaCCDestino.getValidValue(A707Tran_SolicitaCCDestino) ;
         n707Tran_SolicitaCCDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
      }
      if ( cmbTran_SolicitaRegionDestino.getItemCount() > 0 )
      {
         A708Tran_SolicitaRegionDestino = cmbTran_SolicitaRegionDestino.getValidValue(A708Tran_SolicitaRegionDestino) ;
         n708Tran_SolicitaRegionDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
      }
      if ( cmbTran_CuentaResponsabilidad.getItemCount() > 0 )
      {
         A754Tran_CuentaResponsabilidad = cmbTran_CuentaResponsabilidad.getValidValue(A754Tran_CuentaResponsabilidad) ;
         n754Tran_CuentaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
      }
      if ( cmbTran_Estado.getItemCount() > 0 )
      {
         A58Tran_Estado = cmbTran_Estado.getValidValue(A58Tran_Estado) ;
         n58Tran_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A58Tran_Estado", A58Tran_Estado);
      }
      if ( cmbTran_TipoIngreso.getItemCount() > 0 )
      {
         A54Tran_TipoIngreso = GXutil.lval( cmbTran_TipoIngreso.getValidValue(GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)))) ;
         n54Tran_TipoIngreso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
      }
      if ( cmbTran_TipoEntra.getItemCount() > 0 )
      {
         A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
         n527Tran_TipoEntra = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
      }
      if ( cmbTran_EntidadGobierno.getItemCount() > 0 )
      {
         A859Tran_EntidadGobierno = cmbTran_EntidadGobierno.getValidValue(A859Tran_EntidadGobierno) ;
         n859Tran_EntidadGobierno = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A859Tran_EntidadGobierno", A859Tran_EntidadGobierno);
      }
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "TRANSACCIÓN", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "BtnFirst" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCellAdvanced", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_Id_Internalname, GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")), ((edtTran_Id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_Id_Jsonclick, 0, "Attribute", "", "", "", edtTran_Id_Visible, edtTran_Id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaRegistro_Internalname, "Fecha de Registro", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaRegistro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaRegistro_Internalname, localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaRegistro_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_FechaRegistro_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaRegistro_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaRegistro_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TRANSACCION.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioId_Internalname, "Id Usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioId_Internalname, GXutil.ltrim( localUtil.ntoc( A47Tran_UsuarioId, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioId_Jsonclick, 0, "Attribute", "", "", "", edtTran_UsuarioId_Visible, edtTran_UsuarioId_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "IdLargo", "right", false, "HLP_ALM_TRANSACCION.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_47_Internalname, sImgUrl, imgprompt_47_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_47_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioCodigo_Internalname, "Cod Usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioCodigo_Internalname, A417Tran_UsuarioCodigo, GXutil.rtrim( localUtil.format( A417Tran_UsuarioCodigo, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioCodigo_Jsonclick, 0, "Attribute", "", "", "", edtTran_UsuarioCodigo_Visible, edtTran_UsuarioCodigo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioNombre_Internalname, "Nombre Usuario", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioNombre_Internalname, A418Tran_UsuarioNombre, GXutil.rtrim( localUtil.format( A418Tran_UsuarioNombre, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioNombre_Jsonclick, 0, "Attribute", "", "", "", edtTran_UsuarioNombre_Visible, edtTran_UsuarioNombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoId_Internalname, "Id C.C", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoId_Internalname, GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoId_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CentroCostoId_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCION.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_48_Internalname, sImgUrl, imgprompt_48_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_48_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoCodigo_Internalname, "Código C.C", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoCodigo_Internalname, A419Tran_CentroCostoCodigo, GXutil.rtrim( localUtil.format( A419Tran_CentroCostoCodigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CentroCostoCodigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoDescripcion_Internalname, "Descripcion C.C", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoDescripcion_Internalname, A420Tran_CentroCostoDescripcion, GXutil.rtrim( localUtil.format( A420Tran_CentroCostoDescripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoDescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CentroCostoDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionId_Internalname, "Id Región", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionId_Internalname, GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ",", "")), ((edtTran_RegionId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionId_Jsonclick, 0, "Attribute", "", "", "", edtTran_RegionId_Visible, edtTran_RegionId_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionCodigo_Internalname, "Código Región", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionCodigo_Internalname, GXutil.ltrim( localUtil.ntoc( A421Tran_RegionCodigo, (byte)(4), (byte)(0), ",", "")), ((edtTran_RegionCodigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A421Tran_RegionCodigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A421Tran_RegionCodigo), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_RegionCodigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionDescripcion_Internalname, "Descripción Regional", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionDescripcion_Internalname, A422Tran_RegionDescripcion, GXutil.rtrim( localUtil.format( A422Tran_RegionDescripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionDescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_RegionDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionAbrev_Internalname, "Abreviatura Región", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionAbrev_Internalname, A594Tran_RegionAbrev, GXutil.rtrim( localUtil.format( A594Tran_RegionAbrev, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionAbrev_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_RegionAbrev_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodigoMovimiento_Internalname, "Cod Movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodigoMovimiento_Internalname, A49Tran_CodigoMovimiento, GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodigoMovimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodigoMovimiento_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_49_Internalname, sImgUrl, imgprompt_49_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_49_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_DescripcionMovimiento_Internalname, "Movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_DescripcionMovimiento_Internalname, A381Tran_DescripcionMovimiento, GXutil.rtrim( localUtil.format( A381Tran_DescripcionMovimiento, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_DescripcionMovimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_DescripcionMovimiento_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_IndAreadante.getInternalname(), "Areadante", "col-sm-3 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_IndAreadante, cmbTran_IndAreadante.getInternalname(), GXutil.rtrim( A478Tran_IndAreadante), 1, cmbTran_IndAreadante.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbTran_IndAreadante.getVisible(), cmbTran_IndAreadante.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_ALM_TRANSACCION.htm");
         cmbTran_IndAreadante.setValue( GXutil.rtrim( A478Tran_IndAreadante) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_IndAreadante.getInternalname(), "Values", cmbTran_IndAreadante.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_IndE_S.getInternalname(), "Entrada/ Salida", "col-sm-3 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_IndE_S, cmbTran_IndE_S.getInternalname(), GXutil.rtrim( A481Tran_IndE_S), 1, cmbTran_IndE_S.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbTran_IndE_S.getVisible(), cmbTran_IndE_S.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_ALM_TRANSACCION.htm");
         cmbTran_IndE_S.setValue( GXutil.rtrim( A481Tran_IndE_S) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_IndE_S.getInternalname(), "Values", cmbTran_IndE_S.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_IndCurso.getInternalname(), "Curso", "col-sm-3 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_IndCurso, cmbTran_IndCurso.getInternalname(), GXutil.rtrim( A479Tran_IndCurso), 1, cmbTran_IndCurso.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbTran_IndCurso.getVisible(), cmbTran_IndCurso.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_ALM_TRANSACCION.htm");
         cmbTran_IndCurso.setValue( GXutil.rtrim( A479Tran_IndCurso) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_IndCurso.getInternalname(), "Values", cmbTran_IndCurso.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodTipoElemento_Internalname, "Elemento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodTipoElemento_Internalname, GXutil.ltrim( localUtil.ntoc( A499Tran_CodTipoElemento, (byte)(18), (byte)(0), ",", "")), ((edtTran_CodTipoElemento_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A499Tran_CodTipoElemento), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A499Tran_CodTipoElemento), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodTipoElemento_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodTipoElemento_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_TipoElemento.getInternalname(), "de Elemento", "col-sm-3 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_TipoElemento, cmbTran_TipoElemento.getInternalname(), GXutil.rtrim( A482Tran_TipoElemento), 1, cmbTran_TipoElemento.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbTran_TipoElemento.getVisible(), cmbTran_TipoElemento.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_ALM_TRANSACCION.htm");
         cmbTran_TipoElemento.setValue( GXutil.rtrim( A482Tran_TipoElemento) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoElemento.getInternalname(), "Values", cmbTran_TipoElemento.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_SolicitaCCDestino.getInternalname(), "CCDestino", "col-sm-3 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_SolicitaCCDestino, cmbTran_SolicitaCCDestino.getInternalname(), GXutil.rtrim( A707Tran_SolicitaCCDestino), 1, cmbTran_SolicitaCCDestino.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_SolicitaCCDestino.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_ALM_TRANSACCION.htm");
         cmbTran_SolicitaCCDestino.setValue( GXutil.rtrim( A707Tran_SolicitaCCDestino) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_SolicitaCCDestino.getInternalname(), "Values", cmbTran_SolicitaCCDestino.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_SolicitaRegionDestino.getInternalname(), "Region Destino", "col-sm-3 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_SolicitaRegionDestino, cmbTran_SolicitaRegionDestino.getInternalname(), GXutil.rtrim( A708Tran_SolicitaRegionDestino), 1, cmbTran_SolicitaRegionDestino.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_SolicitaRegionDestino.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_ALM_TRANSACCION.htm");
         cmbTran_SolicitaRegionDestino.setValue( GXutil.rtrim( A708Tran_SolicitaRegionDestino) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_SolicitaRegionDestino.getInternalname(), "Values", cmbTran_SolicitaRegionDestino.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_CuentaResponsabilidad.getInternalname(), "Responsabilidad", "col-sm-3 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_CuentaResponsabilidad, cmbTran_CuentaResponsabilidad.getInternalname(), GXutil.rtrim( A754Tran_CuentaResponsabilidad), 1, cmbTran_CuentaResponsabilidad.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_CuentaResponsabilidad.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_ALM_TRANSACCION.htm");
         cmbTran_CuentaResponsabilidad.setValue( GXutil.rtrim( A754Tran_CuentaResponsabilidad) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_CuentaResponsabilidad.getInternalname(), "Values", cmbTran_CuentaResponsabilidad.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ModuloOrigen_Internalname, "Modulo Origen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ModuloOrigen_Internalname, A110Tran_ModuloOrigen, GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ModuloOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_ModuloOrigen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Modulo", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodAlmaOrigen_Internalname, "Almacén Origen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodAlmaOrigen_Internalname, A109Tran_CodAlmaOrigen, GXutil.rtrim( localUtil.format( A109Tran_CodAlmaOrigen, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodAlmaOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodAlmaOrigen_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodBodeOrigen_Internalname, "Bodega Origen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodBodeOrigen_Internalname, A112Tran_CodBodeOrigen, GXutil.rtrim( localUtil.format( A112Tran_CodBodeOrigen, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodBodeOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodBodeOrigen_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_IdCuentadanteOrigen_Internalname, "Cuentadante Origen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_IdCuentadanteOrigen_Internalname, GXutil.ltrim( localUtil.ntoc( A51Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_IdCuentadanteOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_IdCuentadanteOrigen_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_51_Internalname, sImgUrl, imgprompt_51_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_51_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombCuentadanteOrigen_Internalname, "Cuentadante Origen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombCuentadanteOrigen_Internalname, A384Tran_NombCuentadanteOrigen, GXutil.rtrim( localUtil.format( A384Tran_NombCuentadanteOrigen, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombCuentadanteOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_NombCuentadanteOrigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaCuentadanteOrigen_Internalname, "Cuentadante Origen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaCuentadanteOrigen_Internalname, GXutil.ltrim( localUtil.ntoc( A702Tran_CedulaCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaCuentadanteOrigen_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A702Tran_CedulaCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A702Tran_CedulaCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaCuentadanteOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CedulaCuentadanteOrigen_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_EmailCuentadanteOrigen_Internalname, "Cuentadante Origen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_EmailCuentadanteOrigen_Internalname, A714Tran_EmailCuentadanteOrigen, GXutil.rtrim( localUtil.format( A714Tran_EmailCuentadanteOrigen, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "mailto:"+A714Tran_EmailCuentadanteOrigen, "", "", "", edtTran_EmailCuentadanteOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_EmailCuentadanteOrigen_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_IdProveedor_Internalname, "Proveedor", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_IdProveedor_Internalname, GXutil.ltrim( localUtil.ntoc( A53Tran_IdProveedor, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A53Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_IdProveedor_Jsonclick, 0, "Attribute", "", "", "", edtTran_IdProveedor_Visible, edtTran_IdProveedor_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_53_Internalname, sImgUrl, imgprompt_53_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_53_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombreProveedor_Internalname, "Proveedor", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombreProveedor_Internalname, A575Tran_NombreProveedor, GXutil.rtrim( localUtil.format( A575Tran_NombreProveedor, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombreProveedor_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_NombreProveedor_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaProveedor_Internalname, "Proveedor", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaProveedor_Internalname, GXutil.ltrim( localUtil.ntoc( A703Tran_CedulaProveedor, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaProveedor_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A703Tran_CedulaProveedor), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A703Tran_CedulaProveedor), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaProveedor_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CedulaProveedor_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ModuloDestino_Internalname, "Modulo Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ModuloDestino_Internalname, A385Tran_ModuloDestino, GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ModuloDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_ModuloDestino_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Modulo", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodAlmaDestino_Internalname, "Almacén Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodAlmaDestino_Internalname, A111Tran_CodAlmaDestino, GXutil.rtrim( localUtil.format( A111Tran_CodAlmaDestino, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,165);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodAlmaDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodAlmaDestino_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CodBodeDestino_Internalname, "Bodega Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CodBodeDestino_Internalname, A387Tran_CodBodeDestino, GXutil.rtrim( localUtil.format( A387Tran_CodBodeDestino, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CodBodeDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CodBodeDestino_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_IdCuentadanteDestino_Internalname, "Cuentadante Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_IdCuentadanteDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A52Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,173);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_IdCuentadanteDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_IdCuentadanteDestino_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_52_Internalname, sImgUrl, imgprompt_52_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_52_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombCuentadanteDestino_Internalname, "Cuentadante Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombCuentadanteDestino_Internalname, A389Tran_NombCuentadanteDestino, GXutil.rtrim( localUtil.format( A389Tran_NombCuentadanteDestino, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombCuentadanteDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_NombCuentadanteDestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaCuentadanteDestino_Internalname, "Cuentadante Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaCuentadanteDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A704Tran_CedulaCuentadanteDestino, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaCuentadanteDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A704Tran_CedulaCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A704Tran_CedulaCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaCuentadanteDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CedulaCuentadanteDestino_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_EmailCuentadanteDestino_Internalname, "Cuentadante Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_EmailCuentadanteDestino_Internalname, A715Tran_EmailCuentadanteDestino, GXutil.rtrim( localUtil.format( A715Tran_EmailCuentadanteDestino, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "mailto:"+A715Tran_EmailCuentadanteDestino, "", "", "", edtTran_EmailCuentadanteDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_EmailCuentadanteDestino_Enabled, 0, "email", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "GeneXus\\Email", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Observaciones_Internalname, "Observaciones", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTran_Observaciones_Internalname, A416Tran_Observaciones, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,189);\"", (short)(0), 1, edtTran_Observaciones_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_AreadanteCodigo_Internalname, "Areadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_AreadanteCodigo_Internalname, A407Tran_AreadanteCodigo, GXutil.rtrim( localUtil.format( A407Tran_AreadanteCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,193);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_AreadanteCodigo_Jsonclick, 0, "Attribute", "", "", "", edtTran_AreadanteCodigo_Visible, edtTran_AreadanteCodigo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CursoCodigo_Internalname, "Curso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CursoCodigo_Internalname, A408Tran_CursoCodigo, GXutil.rtrim( localUtil.format( A408Tran_CursoCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,197);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CursoCodigo_Jsonclick, 0, "Attribute", "", "", "", edtTran_CursoCodigo_Visible, edtTran_CursoCodigo_Enabled, 0, "text", "", 41, "chr", 1, "row", 41, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ValorTransaccion_Internalname, "Transaccion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ValorTransaccion_Internalname, GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(24), (byte)(2), ",", "")), ((edtTran_ValorTransaccion_Enabled!=0) ? GXutil.ltrim( localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ValorTransaccion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_ValorTransaccion_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NumeroLineas_Internalname, "de Lineas", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 205,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NumeroLineas_Internalname, GXutil.ltrim( localUtil.ntoc( A498Tran_NumeroLineas, (byte)(18), (byte)(0), ",", "")), ((edtTran_NumeroLineas_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A498Tran_NumeroLineas), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A498Tran_NumeroLineas), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,205);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NumeroLineas_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_NumeroLineas_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_Estado, cmbTran_Estado.getInternalname(), GXutil.rtrim( A58Tran_Estado), 1, cmbTran_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTran_Estado.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,209);\"", "", true, "HLP_ALM_TRANSACCION.htm");
         cmbTran_Estado.setValue( GXutil.rtrim( A58Tran_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_Estado.getInternalname(), "Values", cmbTran_Estado.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaRatificacion_Internalname, "Ratificacion", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtTran_FechaRatificacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaRatificacion_Internalname, localUtil.ttoc( A390Tran_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaRatificacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_FechaRatificacion_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaRatificacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaRatificacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TRANSACCION.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioRatifica_Internalname, "Ratifica", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 217,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioRatifica_Internalname, A391Tran_UsuarioRatifica, GXutil.rtrim( localUtil.format( A391Tran_UsuarioRatifica, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,217);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioRatifica_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_UsuarioRatifica_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ConsecutivoCC_Internalname, "por Movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_ConsecutivoCC_Internalname, GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtTran_ConsecutivoCC_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_ConsecutivoCC_Jsonclick, 0, "Attribute", "", "", "", edtTran_ConsecutivoCC_Visible, edtTran_ConsecutivoCC_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_TipoIngreso.getInternalname(), "de Ingreso", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_TipoIngreso, cmbTran_TipoIngreso.getInternalname(), GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)), 1, cmbTran_TipoIngreso.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbTran_TipoIngreso.getVisible(), cmbTran_TipoIngreso.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,225);\"", "", true, "HLP_ALM_TRANSACCION.htm");
         cmbTran_TipoIngreso.setValue( GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoIngreso.getInternalname(), "Values", cmbTran_TipoIngreso.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombreIngreso_Internalname, "Ingreso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombreIngreso_Internalname, A672Tran_NombreIngreso, GXutil.rtrim( localUtil.format( A672Tran_NombreIngreso, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombreIngreso_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_NombreIngreso_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Abreviado_Internalname, "Tran_Abreviado", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_Abreviado_Internalname, A756Tran_Abreviado, GXutil.rtrim( localUtil.format( A756Tran_Abreviado, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_Abreviado_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_Abreviado_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NumeroIngreso_Internalname, "de Ingreso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 237,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NumeroIngreso_Internalname, GXutil.rtrim( A514Tran_NumeroIngreso), GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,237);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NumeroIngreso_Jsonclick, 0, "Attribute", "", "", "", edtTran_NumeroIngreso_Visible, edtTran_NumeroIngreso_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaIngreso_Internalname, "de Ingreso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTran_FechaIngreso_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaIngreso_Internalname, localUtil.format(A515Tran_FechaIngreso, "99/99/99"), localUtil.format( A515Tran_FechaIngreso, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaIngreso_Jsonclick, 0, "Attribute", "", "", "", edtTran_FechaIngreso_Visible, edtTran_FechaIngreso_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaIngreso_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtTran_FechaIngreso_Visible==0)||(edtTran_FechaIngreso_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TRANSACCION.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoIdDestino_Internalname, "Costo Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 245,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoIdDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A50Tran_CentroCostoIdDestino, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A50Tran_CentroCostoIdDestino), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,245);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoIdDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CentroCostoIdDestino_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCION.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_50_Internalname, sImgUrl, imgprompt_50_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_50_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoCodigoDestino_Internalname, "Costo Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoCodigoDestino_Internalname, A516Tran_CentroCostoCodigoDestino, GXutil.rtrim( localUtil.format( A516Tran_CentroCostoCodigoDestino, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoCodigoDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CentroCostoCodigoDestino_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CentroCostoDescripcionDes_Internalname, "Costo Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CentroCostoDescripcionDes_Internalname, A517Tran_CentroCostoDescripcionDes, GXutil.rtrim( localUtil.format( A517Tran_CentroCostoDescripcionDes, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CentroCostoDescripcionDes_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CentroCostoDescripcionDes_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionIdDestino_Internalname, "Región Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionIdDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A518Tran_RegionIdDestino, (byte)(11), (byte)(0), ",", "")), ((edtTran_RegionIdDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionIdDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_RegionIdDestino_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionCodigoDestino_Internalname, "Región Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionCodigoDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A519Tran_RegionCodigoDestino, (byte)(4), (byte)(0), ",", "")), ((edtTran_RegionCodigoDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A519Tran_RegionCodigoDestino), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A519Tran_RegionCodigoDestino), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionCodigoDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_RegionCodigoDestino_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionDescripcionDestino_Internalname, "Región Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionDescripcionDestino_Internalname, A520Tran_RegionDescripcionDestino, GXutil.rtrim( localUtil.format( A520Tran_RegionDescripcionDestino, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionDescripcionDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_RegionDescripcionDestino_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_RegionAbrevDestino_Internalname, "Abrev Destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_RegionAbrevDestino_Internalname, A608Tran_RegionAbrevDestino, GXutil.rtrim( localUtil.format( A608Tran_RegionAbrevDestino, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_RegionAbrevDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_RegionAbrevDestino_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_Detalle_Internalname, "Detalle", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 273,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_Detalle_Internalname, GXutil.rtrim( A524Tran_Detalle), GXutil.rtrim( localUtil.format( A524Tran_Detalle, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,273);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_Detalle_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_Detalle_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_TipoEntra.getInternalname(), "entrada devolutivo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 277,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_TipoEntra, cmbTran_TipoEntra.getInternalname(), GXutil.rtrim( A527Tran_TipoEntra), 1, cmbTran_TipoEntra.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbTran_TipoEntra.getVisible(), cmbTran_TipoEntra.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,277);\"", "", true, "HLP_ALM_TRANSACCION.htm");
         cmbTran_TipoEntra.setValue( GXutil.rtrim( A527Tran_TipoEntra) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoEntra.getInternalname(), "Values", cmbTran_TipoEntra.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CantidadPadres_Internalname, "de Padres", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CantidadPadres_Internalname, GXutil.ltrim( localUtil.ntoc( A568Tran_CantidadPadres, (byte)(8), (byte)(0), ",", "")), ((edtTran_CantidadPadres_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,281);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CantidadPadres_Jsonclick, 0, "Attribute", "", "", "", edtTran_CantidadPadres_Visible, edtTran_CantidadPadres_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NumeroGrupo_Internalname, "del Grupo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 285,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NumeroGrupo_Internalname, GXutil.ltrim( localUtil.ntoc( A667Tran_NumeroGrupo, (byte)(4), (byte)(0), ",", "")), ((edtTran_NumeroGrupo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,285);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NumeroGrupo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_NumeroGrupo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_UsuarioEliminaoAnula_Internalname, "o Anula", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 289,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_UsuarioEliminaoAnula_Internalname, A668Tran_UsuarioEliminaoAnula, GXutil.rtrim( localUtil.format( A668Tran_UsuarioEliminaoAnula, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,289);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_UsuarioEliminaoAnula_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_UsuarioEliminaoAnula_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Usuario", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaEliminaoAnula_Internalname, "o Anula", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 293,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTran_FechaEliminaoAnula_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaEliminaoAnula_Internalname, localUtil.ttoc( A669Tran_FechaEliminaoAnula, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A669Tran_FechaEliminaoAnula, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,293);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaEliminaoAnula_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_FechaEliminaoAnula_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaEliminaoAnula_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaEliminaoAnula_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TRANSACCION.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_ObservacionesAnula_Internalname, "la Anulación", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 297,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTran_ObservacionesAnula_Internalname, A670Tran_ObservacionesAnula, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,297);\"", (short)(0), 1, edtTran_ObservacionesAnula_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_IdCuentadanteResponsabili_Internalname, "Cuenta Responsabilidad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_IdCuentadanteResponsabili_Internalname, GXutil.ltrim( localUtil.ntoc( A56Tran_IdCuentadanteResponsabili, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A56Tran_IdCuentadanteResponsabili), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,301);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_IdCuentadanteResponsabili_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_IdCuentadanteResponsabili_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_56_Internalname, sImgUrl, imgprompt_56_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_56_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_CedulaResponsabilidad_Internalname, "Responsabilidad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_CedulaResponsabilidad_Internalname, GXutil.ltrim( localUtil.ntoc( A759Tran_CedulaResponsabilidad, (byte)(18), (byte)(0), ",", "")), ((edtTran_CedulaResponsabilidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A759Tran_CedulaResponsabilidad), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A759Tran_CedulaResponsabilidad), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_CedulaResponsabilidad_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_CedulaResponsabilidad_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_NombreCuentadanteResponsa_Internalname, "Cuentadante Responsabilidad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_NombreCuentadanteResponsa_Internalname, A721Tran_NombreCuentadanteResponsa, GXutil.rtrim( localUtil.format( A721Tran_NombreCuentadanteResponsa, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_NombreCuentadanteResponsa_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_NombreCuentadanteResponsa_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_TransaccResponsabilidad_Internalname, "Cuenta Responsabilidad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 313,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_TransaccResponsabilidad_Internalname, GXutil.ltrim( localUtil.ntoc( A719Tran_TransaccResponsabilidad, (byte)(11), (byte)(0), ",", "")), ((edtTran_TransaccResponsabilidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A719Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,313);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_TransaccResponsabilidad_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_TransaccResponsabilidad_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_FechaResponsabilidad_Internalname, "Cuenta Responsabilidad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 317,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTran_FechaResponsabilidad_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_FechaResponsabilidad_Internalname, localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"), localUtil.format( A720Tran_FechaResponsabilidad, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,317);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_FechaResponsabilidad_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_FechaResponsabilidad_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtTran_FechaResponsabilidad_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTran_FechaResponsabilidad_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_TRANSACCION.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTran_TablaResponsabilidad_Internalname, "Responsabilidad", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTran_TablaResponsabilidad_Internalname, GXutil.ltrim( localUtil.ntoc( A758Tran_TablaResponsabilidad, (byte)(4), (byte)(0), ",", "")), ((edtTran_TablaResponsabilidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A758Tran_TablaResponsabilidad), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A758Tran_TablaResponsabilidad), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,321);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTran_TablaResponsabilidad_Jsonclick, 0, "Attribute", "", "", "", 1, edtTran_TablaResponsabilidad_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTran_EntidadGobierno.getInternalname(), "Gobierno", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 325,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTran_EntidadGobierno, cmbTran_EntidadGobierno.getInternalname(), GXutil.rtrim( A859Tran_EntidadGobierno), 1, cmbTran_EntidadGobierno.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTran_EntidadGobierno.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,325);\"", "", true, "HLP_ALM_TRANSACCION.htm");
         cmbTran_EntidadGobierno.setValue( GXutil.rtrim( A859Tran_EntidadGobierno) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_EntidadGobierno.getInternalname(), "Values", cmbTran_EntidadGobierno.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divDocumentostable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitledocumentos_Internalname, "Documentos", "", "", lblTitledocumentos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridalm_transaccion_documentos( ) ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 344,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 346,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 348,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TRANSACCION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void gxdraw_gridalm_transaccion_documentos( )
   {
      /*  Grid Control  */
      Gridalm_transaccion_documentosContainer.AddObjectProperty("GridName", "Gridalm_transaccion_documentos");
      Gridalm_transaccion_documentosContainer.AddObjectProperty("Class", "Grid");
      Gridalm_transaccion_documentosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridalm_transaccion_documentos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddObjectProperty("CmpContext", "");
      Gridalm_transaccion_documentosContainer.AddObjectProperty("InMasterPage", "false");
      Gridalm_transaccion_documentosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_transaccion_documentosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A827Tran_Nro_Documento, (byte)(4), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Nro_Documento_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddColumnProperties(Gridalm_transaccion_documentosColumn);
      Gridalm_transaccion_documentosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_transaccion_documentosContainer.AddColumnProperties(Gridalm_transaccion_documentosColumn);
      Gridalm_transaccion_documentosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_transaccion_documentosColumn.AddObjectProperty("Value", A828Tran_Descrip_Documento);
      Gridalm_transaccion_documentosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Descrip_Documento_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddColumnProperties(Gridalm_transaccion_documentosColumn);
      Gridalm_transaccion_documentosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_transaccion_documentosColumn.AddObjectProperty("Value", A829Tran_Prefijo_Documento);
      Gridalm_transaccion_documentosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Prefijo_Documento_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddColumnProperties(Gridalm_transaccion_documentosColumn);
      Gridalm_transaccion_documentosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_transaccion_documentosColumn.AddObjectProperty("Value", A830Tran_Archivo);
      Gridalm_transaccion_documentosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Archivo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddColumnProperties(Gridalm_transaccion_documentosColumn);
      Gridalm_transaccion_documentosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_transaccion_documentosColumn.AddObjectProperty("Value", A831Tran_Ruta_Archivo);
      Gridalm_transaccion_documentosColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Ruta_Archivo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddColumnProperties(Gridalm_transaccion_documentosColumn);
      Gridalm_transaccion_documentosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridalm_transaccion_documentos_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridalm_transaccion_documentos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridalm_transaccion_documentos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridalm_transaccion_documentos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridalm_transaccion_documentos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridalm_transaccion_documentosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridalm_transaccion_documentos_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_334_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount61 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_61 = (short)(1) ;
            scanStart0561( ) ;
            while ( RcdFound61 != 0 )
            {
               init_level_properties61( ) ;
               getByPrimaryKey0561( ) ;
               addRow0561( ) ;
               scanNext0561( ) ;
            }
            scanEnd0561( ) ;
            nBlankRcdCount61 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0561( ) ;
         standaloneModal0561( ) ;
         sMode61 = Gx_mode ;
         while ( nGXsfl_334_idx < nRC_GXsfl_334 )
         {
            bGXsfl_334_Refreshing = true ;
            readRow0561( ) ;
            edtTran_Nro_Documento_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_NRO_DOCUMENTO_"+sGXsfl_334_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTran_Nro_Documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Nro_Documento_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
            edtTran_Descrip_Documento_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_DESCRIP_DOCUMENTO_"+sGXsfl_334_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTran_Descrip_Documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Descrip_Documento_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
            edtTran_Prefijo_Documento_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_PREFIJO_DOCUMENTO_"+sGXsfl_334_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTran_Prefijo_Documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Prefijo_Documento_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
            edtTran_Archivo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_ARCHIVO_"+sGXsfl_334_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTran_Archivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Archivo_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
            edtTran_Ruta_Archivo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_RUTA_ARCHIVO_"+sGXsfl_334_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTran_Ruta_Archivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Ruta_Archivo_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
            imgprompt_47_Link = httpContext.cgiGet( "PROMPT_827_"+sGXsfl_334_idx+"Link") ;
            if ( ( nRcdExists_61 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal0561( ) ;
            }
            sendRow0561( ) ;
            bGXsfl_334_Refreshing = false ;
         }
         Gx_mode = sMode61 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount61 = (short)(5) ;
         nRcdExists_61 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0561( ) ;
            while ( RcdFound61 != 0 )
            {
               sGXsfl_334_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_334_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_33461( ) ;
               init_level_properties61( ) ;
               standaloneNotModal0561( ) ;
               getByPrimaryKey0561( ) ;
               standaloneModal0561( ) ;
               addRow0561( ) ;
               scanNext0561( ) ;
            }
            scanEnd0561( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode61 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_334_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_334_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_33461( ) ;
         initAll0561( ) ;
         init_level_properties61( ) ;
         standaloneNotModal0561( ) ;
         standaloneModal0561( ) ;
         nRcdExists_61 = (short)(0) ;
         nIsMod_61 = (short)(0) ;
         nRcdDeleted_61 = (short)(0) ;
         nBlankRcdCount61 = (short)(nBlankRcdUsr61+nBlankRcdCount61) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount61 > 0 )
         {
            addRow0561( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTran_Nro_Documento_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount61 = (short)(nBlankRcdCount61-1) ;
         }
         Gx_mode = sMode61 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridalm_transaccion_documentosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridalm_transaccion_documentos", Gridalm_transaccion_documentosContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_transaccion_documentosContainerData", Gridalm_transaccion_documentosContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_transaccion_documentosContainerData"+"V", Gridalm_transaccion_documentosContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridalm_transaccion_documentosContainerData"+"V"+"\" value='"+Gridalm_transaccion_documentosContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11052 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A46Tran_Id = localUtil.ctol( httpContext.cgiGet( edtTran_Id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
            A55Tran_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRegistro_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_UsuarioId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_UsuarioId_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_USUARIOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_UsuarioId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A47Tran_UsuarioId = 0 ;
               n47Tran_UsuarioId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A47Tran_UsuarioId", GXutil.ltrim( GXutil.str( A47Tran_UsuarioId, 18, 0)));
            }
            else
            {
               A47Tran_UsuarioId = localUtil.ctol( httpContext.cgiGet( edtTran_UsuarioId_Internalname), ",", ".") ;
               n47Tran_UsuarioId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A47Tran_UsuarioId", GXutil.ltrim( GXutil.str( A47Tran_UsuarioId, 18, 0)));
            }
            n47Tran_UsuarioId = ((0==A47Tran_UsuarioId) ? true : false) ;
            A417Tran_UsuarioCodigo = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioCodigo_Internalname)) ;
            n417Tran_UsuarioCodigo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
            A418Tran_UsuarioNombre = httpContext.cgiGet( edtTran_UsuarioNombre_Internalname) ;
            n418Tran_UsuarioNombre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A418Tran_UsuarioNombre", A418Tran_UsuarioNombre);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoId_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_CENTROCOSTOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_CentroCostoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A48Tran_CentroCostoId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
            }
            else
            {
               A48Tran_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoId_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
            }
            A419Tran_CentroCostoCodigo = httpContext.cgiGet( edtTran_CentroCostoCodigo_Internalname) ;
            n419Tran_CentroCostoCodigo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
            A420Tran_CentroCostoDescripcion = httpContext.cgiGet( edtTran_CentroCostoDescripcion_Internalname) ;
            n420Tran_CentroCostoDescripcion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
            A57Tran_RegionId = localUtil.ctol( httpContext.cgiGet( edtTran_RegionId_Internalname), ",", ".") ;
            n57Tran_RegionId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A57Tran_RegionId", GXutil.ltrim( GXutil.str( A57Tran_RegionId, 11, 0)));
            A421Tran_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_RegionCodigo_Internalname), ",", ".")) ;
            n421Tran_RegionCodigo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
            A422Tran_RegionDescripcion = httpContext.cgiGet( edtTran_RegionDescripcion_Internalname) ;
            n422Tran_RegionDescripcion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
            A594Tran_RegionAbrev = httpContext.cgiGet( edtTran_RegionAbrev_Internalname) ;
            n594Tran_RegionAbrev = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A594Tran_RegionAbrev", A594Tran_RegionAbrev);
            A49Tran_CodigoMovimiento = httpContext.cgiGet( edtTran_CodigoMovimiento_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
            A381Tran_DescripcionMovimiento = httpContext.cgiGet( edtTran_DescripcionMovimiento_Internalname) ;
            n381Tran_DescripcionMovimiento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
            cmbTran_IndAreadante.setName( cmbTran_IndAreadante.getInternalname() );
            cmbTran_IndAreadante.setValue( httpContext.cgiGet( cmbTran_IndAreadante.getInternalname()) );
            A478Tran_IndAreadante = httpContext.cgiGet( cmbTran_IndAreadante.getInternalname()) ;
            n478Tran_IndAreadante = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
            cmbTran_IndE_S.setName( cmbTran_IndE_S.getInternalname() );
            cmbTran_IndE_S.setValue( httpContext.cgiGet( cmbTran_IndE_S.getInternalname()) );
            A481Tran_IndE_S = httpContext.cgiGet( cmbTran_IndE_S.getInternalname()) ;
            n481Tran_IndE_S = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A481Tran_IndE_S", A481Tran_IndE_S);
            cmbTran_IndCurso.setName( cmbTran_IndCurso.getInternalname() );
            cmbTran_IndCurso.setValue( httpContext.cgiGet( cmbTran_IndCurso.getInternalname()) );
            A479Tran_IndCurso = httpContext.cgiGet( cmbTran_IndCurso.getInternalname()) ;
            n479Tran_IndCurso = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A479Tran_IndCurso", A479Tran_IndCurso);
            A499Tran_CodTipoElemento = localUtil.ctol( httpContext.cgiGet( edtTran_CodTipoElemento_Internalname), ",", ".") ;
            n499Tran_CodTipoElemento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A499Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( A499Tran_CodTipoElemento, 18, 0)));
            cmbTran_TipoElemento.setName( cmbTran_TipoElemento.getInternalname() );
            cmbTran_TipoElemento.setValue( httpContext.cgiGet( cmbTran_TipoElemento.getInternalname()) );
            A482Tran_TipoElemento = httpContext.cgiGet( cmbTran_TipoElemento.getInternalname()) ;
            n482Tran_TipoElemento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
            cmbTran_SolicitaCCDestino.setName( cmbTran_SolicitaCCDestino.getInternalname() );
            cmbTran_SolicitaCCDestino.setValue( httpContext.cgiGet( cmbTran_SolicitaCCDestino.getInternalname()) );
            A707Tran_SolicitaCCDestino = httpContext.cgiGet( cmbTran_SolicitaCCDestino.getInternalname()) ;
            n707Tran_SolicitaCCDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
            cmbTran_SolicitaRegionDestino.setName( cmbTran_SolicitaRegionDestino.getInternalname() );
            cmbTran_SolicitaRegionDestino.setValue( httpContext.cgiGet( cmbTran_SolicitaRegionDestino.getInternalname()) );
            A708Tran_SolicitaRegionDestino = httpContext.cgiGet( cmbTran_SolicitaRegionDestino.getInternalname()) ;
            n708Tran_SolicitaRegionDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
            cmbTran_CuentaResponsabilidad.setName( cmbTran_CuentaResponsabilidad.getInternalname() );
            cmbTran_CuentaResponsabilidad.setValue( httpContext.cgiGet( cmbTran_CuentaResponsabilidad.getInternalname()) );
            A754Tran_CuentaResponsabilidad = httpContext.cgiGet( cmbTran_CuentaResponsabilidad.getInternalname()) ;
            n754Tran_CuentaResponsabilidad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
            A110Tran_ModuloOrigen = httpContext.cgiGet( edtTran_ModuloOrigen_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
            A109Tran_CodAlmaOrigen = httpContext.cgiGet( edtTran_CodAlmaOrigen_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A109Tran_CodAlmaOrigen", A109Tran_CodAlmaOrigen);
            A112Tran_CodBodeOrigen = httpContext.cgiGet( edtTran_CodBodeOrigen_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A112Tran_CodBodeOrigen", A112Tran_CodBodeOrigen);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteOrigen_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteOrigen_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_IDCUENTADANTEORIGEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_IdCuentadanteOrigen_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A51Tran_IdCuentadanteOrigen = 0 ;
               n51Tran_IdCuentadanteOrigen = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A51Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( A51Tran_IdCuentadanteOrigen, 18, 0)));
            }
            else
            {
               A51Tran_IdCuentadanteOrigen = localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteOrigen_Internalname), ",", ".") ;
               n51Tran_IdCuentadanteOrigen = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A51Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( A51Tran_IdCuentadanteOrigen, 18, 0)));
            }
            n51Tran_IdCuentadanteOrigen = ((0==A51Tran_IdCuentadanteOrigen) ? true : false) ;
            A384Tran_NombCuentadanteOrigen = GXutil.upper( httpContext.cgiGet( edtTran_NombCuentadanteOrigen_Internalname)) ;
            n384Tran_NombCuentadanteOrigen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
            A702Tran_CedulaCuentadanteOrigen = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaCuentadanteOrigen_Internalname), ",", ".") ;
            n702Tran_CedulaCuentadanteOrigen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
            A714Tran_EmailCuentadanteOrigen = httpContext.cgiGet( edtTran_EmailCuentadanteOrigen_Internalname) ;
            n714Tran_EmailCuentadanteOrigen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A714Tran_EmailCuentadanteOrigen", A714Tran_EmailCuentadanteOrigen);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_IdProveedor_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_IdProveedor_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_IDPROVEEDOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_IdProveedor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A53Tran_IdProveedor = 0 ;
               n53Tran_IdProveedor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A53Tran_IdProveedor", GXutil.ltrim( GXutil.str( A53Tran_IdProveedor, 18, 0)));
            }
            else
            {
               A53Tran_IdProveedor = localUtil.ctol( httpContext.cgiGet( edtTran_IdProveedor_Internalname), ",", ".") ;
               n53Tran_IdProveedor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A53Tran_IdProveedor", GXutil.ltrim( GXutil.str( A53Tran_IdProveedor, 18, 0)));
            }
            n53Tran_IdProveedor = ((0==A53Tran_IdProveedor) ? true : false) ;
            A575Tran_NombreProveedor = GXutil.upper( httpContext.cgiGet( edtTran_NombreProveedor_Internalname)) ;
            n575Tran_NombreProveedor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
            A703Tran_CedulaProveedor = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaProveedor_Internalname), ",", ".") ;
            n703Tran_CedulaProveedor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
            A385Tran_ModuloDestino = httpContext.cgiGet( edtTran_ModuloDestino_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
            A111Tran_CodAlmaDestino = httpContext.cgiGet( edtTran_CodAlmaDestino_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A111Tran_CodAlmaDestino", A111Tran_CodAlmaDestino);
            A387Tran_CodBodeDestino = httpContext.cgiGet( edtTran_CodBodeDestino_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A387Tran_CodBodeDestino", A387Tran_CodBodeDestino);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteDestino_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteDestino_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_IDCUENTADANTEDESTINO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_IdCuentadanteDestino_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A52Tran_IdCuentadanteDestino = 0 ;
               n52Tran_IdCuentadanteDestino = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A52Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( A52Tran_IdCuentadanteDestino, 18, 0)));
            }
            else
            {
               A52Tran_IdCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteDestino_Internalname), ",", ".") ;
               n52Tran_IdCuentadanteDestino = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A52Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( A52Tran_IdCuentadanteDestino, 18, 0)));
            }
            n52Tran_IdCuentadanteDestino = ((0==A52Tran_IdCuentadanteDestino) ? true : false) ;
            A389Tran_NombCuentadanteDestino = GXutil.upper( httpContext.cgiGet( edtTran_NombCuentadanteDestino_Internalname)) ;
            n389Tran_NombCuentadanteDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
            A704Tran_CedulaCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaCuentadanteDestino_Internalname), ",", ".") ;
            n704Tran_CedulaCuentadanteDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
            A715Tran_EmailCuentadanteDestino = httpContext.cgiGet( edtTran_EmailCuentadanteDestino_Internalname) ;
            n715Tran_EmailCuentadanteDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A715Tran_EmailCuentadanteDestino", A715Tran_EmailCuentadanteDestino);
            A416Tran_Observaciones = httpContext.cgiGet( edtTran_Observaciones_Internalname) ;
            n416Tran_Observaciones = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A416Tran_Observaciones", A416Tran_Observaciones);
            n416Tran_Observaciones = ((GXutil.strcmp("", A416Tran_Observaciones)==0) ? true : false) ;
            A407Tran_AreadanteCodigo = httpContext.cgiGet( edtTran_AreadanteCodigo_Internalname) ;
            n407Tran_AreadanteCodigo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407Tran_AreadanteCodigo", A407Tran_AreadanteCodigo);
            n407Tran_AreadanteCodigo = ((GXutil.strcmp("", A407Tran_AreadanteCodigo)==0) ? true : false) ;
            A408Tran_CursoCodigo = httpContext.cgiGet( edtTran_CursoCodigo_Internalname) ;
            n408Tran_CursoCodigo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A408Tran_CursoCodigo", A408Tran_CursoCodigo);
            n408Tran_CursoCodigo = ((GXutil.strcmp("", A408Tran_CursoCodigo)==0) ? true : false) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTran_ValorTransaccion_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTran_ValorTransaccion_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_VALORTRANSACCION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_ValorTransaccion_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
               n483Tran_ValorTransaccion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A483Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( A483Tran_ValorTransaccion, 18, 2)));
            }
            else
            {
               A483Tran_ValorTransaccion = localUtil.ctond( httpContext.cgiGet( edtTran_ValorTransaccion_Internalname)) ;
               n483Tran_ValorTransaccion = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A483Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( A483Tran_ValorTransaccion, 18, 2)));
            }
            n483Tran_ValorTransaccion = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A483Tran_ValorTransaccion)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_NumeroLineas_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_NumeroLineas_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_NUMEROLINEAS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_NumeroLineas_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A498Tran_NumeroLineas = 0 ;
               n498Tran_NumeroLineas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A498Tran_NumeroLineas", GXutil.ltrim( GXutil.str( A498Tran_NumeroLineas, 18, 0)));
            }
            else
            {
               A498Tran_NumeroLineas = localUtil.ctol( httpContext.cgiGet( edtTran_NumeroLineas_Internalname), ",", ".") ;
               n498Tran_NumeroLineas = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A498Tran_NumeroLineas", GXutil.ltrim( GXutil.str( A498Tran_NumeroLineas, 18, 0)));
            }
            n498Tran_NumeroLineas = ((0==A498Tran_NumeroLineas) ? true : false) ;
            cmbTran_Estado.setName( cmbTran_Estado.getInternalname() );
            cmbTran_Estado.setValue( httpContext.cgiGet( cmbTran_Estado.getInternalname()) );
            A58Tran_Estado = httpContext.cgiGet( cmbTran_Estado.getInternalname()) ;
            n58Tran_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A58Tran_Estado", A58Tran_Estado);
            n58Tran_Estado = ((GXutil.strcmp("", A58Tran_Estado)==0) ? true : false) ;
            A390Tran_FechaRatificacion = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRatificacion_Internalname)) ;
            n390Tran_FechaRatificacion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A390Tran_FechaRatificacion", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHARATIFICACION", getSecureSignedToken( "", localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
            A391Tran_UsuarioRatifica = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioRatifica_Internalname)) ;
            n391Tran_UsuarioRatifica = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A391Tran_UsuarioRatifica", A391Tran_UsuarioRatifica);
            n391Tran_UsuarioRatifica = ((GXutil.strcmp("", A391Tran_UsuarioRatifica)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_ConsecutivoCC_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_ConsecutivoCC_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_CONSECUTIVOCC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_ConsecutivoCC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A513Tran_ConsecutivoCC = 0 ;
               n513Tran_ConsecutivoCC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
            }
            else
            {
               A513Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtTran_ConsecutivoCC_Internalname), ",", ".") ;
               n513Tran_ConsecutivoCC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
            }
            n513Tran_ConsecutivoCC = ((0==A513Tran_ConsecutivoCC) ? true : false) ;
            cmbTran_TipoIngreso.setName( cmbTran_TipoIngreso.getInternalname() );
            cmbTran_TipoIngreso.setValue( httpContext.cgiGet( cmbTran_TipoIngreso.getInternalname()) );
            A54Tran_TipoIngreso = GXutil.lval( httpContext.cgiGet( cmbTran_TipoIngreso.getInternalname())) ;
            n54Tran_TipoIngreso = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
            n54Tran_TipoIngreso = ((0==A54Tran_TipoIngreso) ? true : false) ;
            A672Tran_NombreIngreso = GXutil.upper( httpContext.cgiGet( edtTran_NombreIngreso_Internalname)) ;
            n672Tran_NombreIngreso = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
            A756Tran_Abreviado = httpContext.cgiGet( edtTran_Abreviado_Internalname) ;
            n756Tran_Abreviado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A756Tran_Abreviado", A756Tran_Abreviado);
            A514Tran_NumeroIngreso = httpContext.cgiGet( edtTran_NumeroIngreso_Internalname) ;
            n514Tran_NumeroIngreso = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A514Tran_NumeroIngreso", A514Tran_NumeroIngreso);
            n514Tran_NumeroIngreso = ((GXutil.strcmp("", A514Tran_NumeroIngreso)==0) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtTran_FechaIngreso_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "TRAN_FECHAINGRESO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_FechaIngreso_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A515Tran_FechaIngreso = GXutil.nullDate() ;
               n515Tran_FechaIngreso = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
            }
            else
            {
               A515Tran_FechaIngreso = localUtil.ctod( httpContext.cgiGet( edtTran_FechaIngreso_Internalname), 3) ;
               n515Tran_FechaIngreso = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
            }
            n515Tran_FechaIngreso = (GXutil.dateCompare(GXutil.nullDate(), A515Tran_FechaIngreso) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoIdDestino_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoIdDestino_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_CENTROCOSTOIDDESTINO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_CentroCostoIdDestino_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A50Tran_CentroCostoIdDestino = 0 ;
               n50Tran_CentroCostoIdDestino = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A50Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( A50Tran_CentroCostoIdDestino, 11, 0)));
            }
            else
            {
               A50Tran_CentroCostoIdDestino = localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoIdDestino_Internalname), ",", ".") ;
               n50Tran_CentroCostoIdDestino = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A50Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( A50Tran_CentroCostoIdDestino, 11, 0)));
            }
            n50Tran_CentroCostoIdDestino = ((0==A50Tran_CentroCostoIdDestino) ? true : false) ;
            A516Tran_CentroCostoCodigoDestino = httpContext.cgiGet( edtTran_CentroCostoCodigoDestino_Internalname) ;
            n516Tran_CentroCostoCodigoDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A516Tran_CentroCostoCodigoDestino", A516Tran_CentroCostoCodigoDestino);
            A517Tran_CentroCostoDescripcionDes = httpContext.cgiGet( edtTran_CentroCostoDescripcionDes_Internalname) ;
            n517Tran_CentroCostoDescripcionDes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A517Tran_CentroCostoDescripcionDes", A517Tran_CentroCostoDescripcionDes);
            A518Tran_RegionIdDestino = localUtil.ctol( httpContext.cgiGet( edtTran_RegionIdDestino_Internalname), ",", ".") ;
            n518Tran_RegionIdDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A518Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( A518Tran_RegionIdDestino, 11, 0)));
            A519Tran_RegionCodigoDestino = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_RegionCodigoDestino_Internalname), ",", ".")) ;
            n519Tran_RegionCodigoDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A519Tran_RegionCodigoDestino", GXutil.ltrim( GXutil.str( A519Tran_RegionCodigoDestino, 4, 0)));
            A520Tran_RegionDescripcionDestino = httpContext.cgiGet( edtTran_RegionDescripcionDestino_Internalname) ;
            n520Tran_RegionDescripcionDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A520Tran_RegionDescripcionDestino", A520Tran_RegionDescripcionDestino);
            A608Tran_RegionAbrevDestino = httpContext.cgiGet( edtTran_RegionAbrevDestino_Internalname) ;
            n608Tran_RegionAbrevDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A608Tran_RegionAbrevDestino", A608Tran_RegionAbrevDestino);
            A524Tran_Detalle = httpContext.cgiGet( edtTran_Detalle_Internalname) ;
            n524Tran_Detalle = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A524Tran_Detalle", A524Tran_Detalle);
            n524Tran_Detalle = ((GXutil.strcmp("", A524Tran_Detalle)==0) ? true : false) ;
            cmbTran_TipoEntra.setName( cmbTran_TipoEntra.getInternalname() );
            cmbTran_TipoEntra.setValue( httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) );
            A527Tran_TipoEntra = httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) ;
            n527Tran_TipoEntra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
            n527Tran_TipoEntra = ((GXutil.strcmp("", A527Tran_TipoEntra)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_CantidadPadres_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_CantidadPadres_Internalname), ",", ".") > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_CANTIDADPADRES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_CantidadPadres_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A568Tran_CantidadPadres = 0 ;
               n568Tran_CantidadPadres = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A568Tran_CantidadPadres", GXutil.ltrim( GXutil.str( A568Tran_CantidadPadres, 8, 0)));
            }
            else
            {
               A568Tran_CantidadPadres = (int)(localUtil.ctol( httpContext.cgiGet( edtTran_CantidadPadres_Internalname), ",", ".")) ;
               n568Tran_CantidadPadres = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A568Tran_CantidadPadres", GXutil.ltrim( GXutil.str( A568Tran_CantidadPadres, 8, 0)));
            }
            n568Tran_CantidadPadres = ((0==A568Tran_CantidadPadres) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_NumeroGrupo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_NumeroGrupo_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_NUMEROGRUPO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_NumeroGrupo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A667Tran_NumeroGrupo = (short)(0) ;
               n667Tran_NumeroGrupo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A667Tran_NumeroGrupo", GXutil.ltrim( GXutil.str( A667Tran_NumeroGrupo, 4, 0)));
            }
            else
            {
               A667Tran_NumeroGrupo = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_NumeroGrupo_Internalname), ",", ".")) ;
               n667Tran_NumeroGrupo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A667Tran_NumeroGrupo", GXutil.ltrim( GXutil.str( A667Tran_NumeroGrupo, 4, 0)));
            }
            n667Tran_NumeroGrupo = ((0==A667Tran_NumeroGrupo) ? true : false) ;
            A668Tran_UsuarioEliminaoAnula = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioEliminaoAnula_Internalname)) ;
            n668Tran_UsuarioEliminaoAnula = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A668Tran_UsuarioEliminaoAnula", A668Tran_UsuarioEliminaoAnula);
            n668Tran_UsuarioEliminaoAnula = ((GXutil.strcmp("", A668Tran_UsuarioEliminaoAnula)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTran_FechaEliminaoAnula_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TRAN_FECHAELIMINAOANULA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_FechaEliminaoAnula_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A669Tran_FechaEliminaoAnula = GXutil.resetTime( GXutil.nullDate() );
               n669Tran_FechaEliminaoAnula = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A669Tran_FechaEliminaoAnula", localUtil.ttoc( A669Tran_FechaEliminaoAnula, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A669Tran_FechaEliminaoAnula = localUtil.ctot( httpContext.cgiGet( edtTran_FechaEliminaoAnula_Internalname)) ;
               n669Tran_FechaEliminaoAnula = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A669Tran_FechaEliminaoAnula", localUtil.ttoc( A669Tran_FechaEliminaoAnula, 8, 5, 0, 3, "/", ":", " "));
            }
            n669Tran_FechaEliminaoAnula = (GXutil.dateCompare(GXutil.nullDate(), A669Tran_FechaEliminaoAnula) ? true : false) ;
            A670Tran_ObservacionesAnula = httpContext.cgiGet( edtTran_ObservacionesAnula_Internalname) ;
            n670Tran_ObservacionesAnula = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A670Tran_ObservacionesAnula", A670Tran_ObservacionesAnula);
            n670Tran_ObservacionesAnula = ((GXutil.strcmp("", A670Tran_ObservacionesAnula)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteResponsabili_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteResponsabili_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_IDCUENTADANTERESPONSABILI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_IdCuentadanteResponsabili_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A56Tran_IdCuentadanteResponsabili = 0 ;
               n56Tran_IdCuentadanteResponsabili = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A56Tran_IdCuentadanteResponsabili", GXutil.ltrim( GXutil.str( A56Tran_IdCuentadanteResponsabili, 18, 0)));
            }
            else
            {
               A56Tran_IdCuentadanteResponsabili = localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteResponsabili_Internalname), ",", ".") ;
               n56Tran_IdCuentadanteResponsabili = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A56Tran_IdCuentadanteResponsabili", GXutil.ltrim( GXutil.str( A56Tran_IdCuentadanteResponsabili, 18, 0)));
            }
            n56Tran_IdCuentadanteResponsabili = ((0==A56Tran_IdCuentadanteResponsabili) ? true : false) ;
            A759Tran_CedulaResponsabilidad = localUtil.ctol( httpContext.cgiGet( edtTran_CedulaResponsabilidad_Internalname), ",", ".") ;
            n759Tran_CedulaResponsabilidad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
            A721Tran_NombreCuentadanteResponsa = GXutil.upper( httpContext.cgiGet( edtTran_NombreCuentadanteResponsa_Internalname)) ;
            n721Tran_NombreCuentadanteResponsa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_TransaccResponsabilidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_TransaccResponsabilidad_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_TRANSACCRESPONSABILIDAD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_TransaccResponsabilidad_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A719Tran_TransaccResponsabilidad = 0 ;
               n719Tran_TransaccResponsabilidad = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( A719Tran_TransaccResponsabilidad, 11, 0)));
            }
            else
            {
               A719Tran_TransaccResponsabilidad = localUtil.ctol( httpContext.cgiGet( edtTran_TransaccResponsabilidad_Internalname), ",", ".") ;
               n719Tran_TransaccResponsabilidad = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( A719Tran_TransaccResponsabilidad, 11, 0)));
            }
            n719Tran_TransaccResponsabilidad = ((0==A719Tran_TransaccResponsabilidad) ? true : false) ;
            if ( localUtil.vcdate( httpContext.cgiGet( edtTran_FechaResponsabilidad_Internalname), (byte)(3)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "TRAN_FECHARESPONSABILIDAD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_FechaResponsabilidad_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A720Tran_FechaResponsabilidad = GXutil.nullDate() ;
               n720Tran_FechaResponsabilidad = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A720Tran_FechaResponsabilidad", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
            }
            else
            {
               A720Tran_FechaResponsabilidad = localUtil.ctod( httpContext.cgiGet( edtTran_FechaResponsabilidad_Internalname), 3) ;
               n720Tran_FechaResponsabilidad = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A720Tran_FechaResponsabilidad", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
            }
            n720Tran_FechaResponsabilidad = (GXutil.dateCompare(GXutil.nullDate(), A720Tran_FechaResponsabilidad) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_TablaResponsabilidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_TablaResponsabilidad_Internalname), ",", ".") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRAN_TABLARESPONSABILIDAD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_TablaResponsabilidad_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A758Tran_TablaResponsabilidad = (short)(0) ;
               n758Tran_TablaResponsabilidad = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A758Tran_TablaResponsabilidad", GXutil.ltrim( GXutil.str( A758Tran_TablaResponsabilidad, 4, 0)));
            }
            else
            {
               A758Tran_TablaResponsabilidad = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_TablaResponsabilidad_Internalname), ",", ".")) ;
               n758Tran_TablaResponsabilidad = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A758Tran_TablaResponsabilidad", GXutil.ltrim( GXutil.str( A758Tran_TablaResponsabilidad, 4, 0)));
            }
            n758Tran_TablaResponsabilidad = ((0==A758Tran_TablaResponsabilidad) ? true : false) ;
            cmbTran_EntidadGobierno.setName( cmbTran_EntidadGobierno.getInternalname() );
            cmbTran_EntidadGobierno.setValue( httpContext.cgiGet( cmbTran_EntidadGobierno.getInternalname()) );
            A859Tran_EntidadGobierno = httpContext.cgiGet( cmbTran_EntidadGobierno.getInternalname()) ;
            n859Tran_EntidadGobierno = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A859Tran_EntidadGobierno", A859Tran_EntidadGobierno);
            n859Tran_EntidadGobierno = ((GXutil.strcmp("", A859Tran_EntidadGobierno)==0) ? true : false) ;
            /* Read saved values. */
            Z46Tran_Id = localUtil.ctol( httpContext.cgiGet( "Z46Tran_Id"), ",", ".") ;
            Z55Tran_FechaRegistro = localUtil.ctot( httpContext.cgiGet( "Z55Tran_FechaRegistro"), 0) ;
            Z58Tran_Estado = httpContext.cgiGet( "Z58Tran_Estado") ;
            n58Tran_Estado = ((GXutil.strcmp("", A58Tran_Estado)==0) ? true : false) ;
            Z110Tran_ModuloOrigen = httpContext.cgiGet( "Z110Tran_ModuloOrigen") ;
            Z109Tran_CodAlmaOrigen = httpContext.cgiGet( "Z109Tran_CodAlmaOrigen") ;
            Z112Tran_CodBodeOrigen = httpContext.cgiGet( "Z112Tran_CodBodeOrigen") ;
            Z385Tran_ModuloDestino = httpContext.cgiGet( "Z385Tran_ModuloDestino") ;
            Z111Tran_CodAlmaDestino = httpContext.cgiGet( "Z111Tran_CodAlmaDestino") ;
            Z387Tran_CodBodeDestino = httpContext.cgiGet( "Z387Tran_CodBodeDestino") ;
            Z407Tran_AreadanteCodigo = httpContext.cgiGet( "Z407Tran_AreadanteCodigo") ;
            n407Tran_AreadanteCodigo = ((GXutil.strcmp("", A407Tran_AreadanteCodigo)==0) ? true : false) ;
            Z408Tran_CursoCodigo = httpContext.cgiGet( "Z408Tran_CursoCodigo") ;
            n408Tran_CursoCodigo = ((GXutil.strcmp("", A408Tran_CursoCodigo)==0) ? true : false) ;
            Z483Tran_ValorTransaccion = localUtil.ctond( httpContext.cgiGet( "Z483Tran_ValorTransaccion")) ;
            n483Tran_ValorTransaccion = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A483Tran_ValorTransaccion)==0) ? true : false) ;
            Z498Tran_NumeroLineas = localUtil.ctol( httpContext.cgiGet( "Z498Tran_NumeroLineas"), ",", ".") ;
            n498Tran_NumeroLineas = ((0==A498Tran_NumeroLineas) ? true : false) ;
            Z390Tran_FechaRatificacion = localUtil.ctot( httpContext.cgiGet( "Z390Tran_FechaRatificacion"), 0) ;
            n390Tran_FechaRatificacion = (GXutil.dateCompare(GXutil.nullDate(), A390Tran_FechaRatificacion) ? true : false) ;
            Z391Tran_UsuarioRatifica = httpContext.cgiGet( "Z391Tran_UsuarioRatifica") ;
            n391Tran_UsuarioRatifica = ((GXutil.strcmp("", A391Tran_UsuarioRatifica)==0) ? true : false) ;
            Z513Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( "Z513Tran_ConsecutivoCC"), ",", ".") ;
            n513Tran_ConsecutivoCC = ((0==A513Tran_ConsecutivoCC) ? true : false) ;
            Z514Tran_NumeroIngreso = httpContext.cgiGet( "Z514Tran_NumeroIngreso") ;
            n514Tran_NumeroIngreso = ((GXutil.strcmp("", A514Tran_NumeroIngreso)==0) ? true : false) ;
            Z515Tran_FechaIngreso = localUtil.ctod( httpContext.cgiGet( "Z515Tran_FechaIngreso"), 0) ;
            n515Tran_FechaIngreso = (GXutil.dateCompare(GXutil.nullDate(), A515Tran_FechaIngreso) ? true : false) ;
            Z524Tran_Detalle = httpContext.cgiGet( "Z524Tran_Detalle") ;
            n524Tran_Detalle = ((GXutil.strcmp("", A524Tran_Detalle)==0) ? true : false) ;
            Z527Tran_TipoEntra = httpContext.cgiGet( "Z527Tran_TipoEntra") ;
            n527Tran_TipoEntra = ((GXutil.strcmp("", A527Tran_TipoEntra)==0) ? true : false) ;
            Z568Tran_CantidadPadres = (int)(localUtil.ctol( httpContext.cgiGet( "Z568Tran_CantidadPadres"), ",", ".")) ;
            n568Tran_CantidadPadres = ((0==A568Tran_CantidadPadres) ? true : false) ;
            Z667Tran_NumeroGrupo = (short)(localUtil.ctol( httpContext.cgiGet( "Z667Tran_NumeroGrupo"), ",", ".")) ;
            n667Tran_NumeroGrupo = ((0==A667Tran_NumeroGrupo) ? true : false) ;
            Z668Tran_UsuarioEliminaoAnula = httpContext.cgiGet( "Z668Tran_UsuarioEliminaoAnula") ;
            n668Tran_UsuarioEliminaoAnula = ((GXutil.strcmp("", A668Tran_UsuarioEliminaoAnula)==0) ? true : false) ;
            Z669Tran_FechaEliminaoAnula = localUtil.ctot( httpContext.cgiGet( "Z669Tran_FechaEliminaoAnula"), 0) ;
            n669Tran_FechaEliminaoAnula = (GXutil.dateCompare(GXutil.nullDate(), A669Tran_FechaEliminaoAnula) ? true : false) ;
            Z670Tran_ObservacionesAnula = httpContext.cgiGet( "Z670Tran_ObservacionesAnula") ;
            n670Tran_ObservacionesAnula = ((GXutil.strcmp("", A670Tran_ObservacionesAnula)==0) ? true : false) ;
            Z719Tran_TransaccResponsabilidad = localUtil.ctol( httpContext.cgiGet( "Z719Tran_TransaccResponsabilidad"), ",", ".") ;
            n719Tran_TransaccResponsabilidad = ((0==A719Tran_TransaccResponsabilidad) ? true : false) ;
            Z720Tran_FechaResponsabilidad = localUtil.ctod( httpContext.cgiGet( "Z720Tran_FechaResponsabilidad"), 0) ;
            n720Tran_FechaResponsabilidad = (GXutil.dateCompare(GXutil.nullDate(), A720Tran_FechaResponsabilidad) ? true : false) ;
            Z758Tran_TablaResponsabilidad = (short)(localUtil.ctol( httpContext.cgiGet( "Z758Tran_TablaResponsabilidad"), ",", ".")) ;
            n758Tran_TablaResponsabilidad = ((0==A758Tran_TablaResponsabilidad) ? true : false) ;
            Z859Tran_EntidadGobierno = httpContext.cgiGet( "Z859Tran_EntidadGobierno") ;
            n859Tran_EntidadGobierno = ((GXutil.strcmp("", A859Tran_EntidadGobierno)==0) ? true : false) ;
            Z47Tran_UsuarioId = localUtil.ctol( httpContext.cgiGet( "Z47Tran_UsuarioId"), ",", ".") ;
            n47Tran_UsuarioId = ((0==A47Tran_UsuarioId) ? true : false) ;
            Z48Tran_CentroCostoId = localUtil.ctol( httpContext.cgiGet( "Z48Tran_CentroCostoId"), ",", ".") ;
            Z50Tran_CentroCostoIdDestino = localUtil.ctol( httpContext.cgiGet( "Z50Tran_CentroCostoIdDestino"), ",", ".") ;
            n50Tran_CentroCostoIdDestino = ((0==A50Tran_CentroCostoIdDestino) ? true : false) ;
            Z49Tran_CodigoMovimiento = httpContext.cgiGet( "Z49Tran_CodigoMovimiento") ;
            Z51Tran_IdCuentadanteOrigen = localUtil.ctol( httpContext.cgiGet( "Z51Tran_IdCuentadanteOrigen"), ",", ".") ;
            n51Tran_IdCuentadanteOrigen = ((0==A51Tran_IdCuentadanteOrigen) ? true : false) ;
            Z53Tran_IdProveedor = localUtil.ctol( httpContext.cgiGet( "Z53Tran_IdProveedor"), ",", ".") ;
            n53Tran_IdProveedor = ((0==A53Tran_IdProveedor) ? true : false) ;
            Z52Tran_IdCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( "Z52Tran_IdCuentadanteDestino"), ",", ".") ;
            n52Tran_IdCuentadanteDestino = ((0==A52Tran_IdCuentadanteDestino) ? true : false) ;
            Z56Tran_IdCuentadanteResponsabili = localUtil.ctol( httpContext.cgiGet( "Z56Tran_IdCuentadanteResponsabili"), ",", ".") ;
            n56Tran_IdCuentadanteResponsabili = ((0==A56Tran_IdCuentadanteResponsabili) ? true : false) ;
            Z54Tran_TipoIngreso = localUtil.ctol( httpContext.cgiGet( "Z54Tran_TipoIngreso"), ",", ".") ;
            n54Tran_TipoIngreso = ((0==A54Tran_TipoIngreso) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_334 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_334"), ",", ".")) ;
            N47Tran_UsuarioId = localUtil.ctol( httpContext.cgiGet( "N47Tran_UsuarioId"), ",", ".") ;
            n47Tran_UsuarioId = ((0==A47Tran_UsuarioId) ? true : false) ;
            N48Tran_CentroCostoId = localUtil.ctol( httpContext.cgiGet( "N48Tran_CentroCostoId"), ",", ".") ;
            N49Tran_CodigoMovimiento = httpContext.cgiGet( "N49Tran_CodigoMovimiento") ;
            N51Tran_IdCuentadanteOrigen = localUtil.ctol( httpContext.cgiGet( "N51Tran_IdCuentadanteOrigen"), ",", ".") ;
            n51Tran_IdCuentadanteOrigen = ((0==A51Tran_IdCuentadanteOrigen) ? true : false) ;
            N53Tran_IdProveedor = localUtil.ctol( httpContext.cgiGet( "N53Tran_IdProveedor"), ",", ".") ;
            n53Tran_IdProveedor = ((0==A53Tran_IdProveedor) ? true : false) ;
            N52Tran_IdCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( "N52Tran_IdCuentadanteDestino"), ",", ".") ;
            n52Tran_IdCuentadanteDestino = ((0==A52Tran_IdCuentadanteDestino) ? true : false) ;
            N54Tran_TipoIngreso = localUtil.ctol( httpContext.cgiGet( "N54Tran_TipoIngreso"), ",", ".") ;
            n54Tran_TipoIngreso = ((0==A54Tran_TipoIngreso) ? true : false) ;
            N50Tran_CentroCostoIdDestino = localUtil.ctol( httpContext.cgiGet( "N50Tran_CentroCostoIdDestino"), ",", ".") ;
            n50Tran_CentroCostoIdDestino = ((0==A50Tran_CentroCostoIdDestino) ? true : false) ;
            N56Tran_IdCuentadanteResponsabili = localUtil.ctol( httpContext.cgiGet( "N56Tran_IdCuentadanteResponsabili"), ",", ".") ;
            n56Tran_IdCuentadanteResponsabili = ((0==A56Tran_IdCuentadanteResponsabili) ? true : false) ;
            AV7Tran_CodigoMovimiento = httpContext.cgiGet( "vTRAN_CODIGOMOVIMIENTO") ;
            AV33Tran_Id = localUtil.ctol( httpContext.cgiGet( "vTRAN_ID"), ",", ".") ;
            AV26Insert_Tran_UsuarioId = localUtil.ctol( httpContext.cgiGet( "vINSERT_TRAN_USUARIOID"), ",", ".") ;
            AV15IdUsuario = localUtil.ctol( httpContext.cgiGet( "vIDUSUARIO"), ",", ".") ;
            AV19Insert_Tran_CentroCostoId = localUtil.ctol( httpContext.cgiGet( "vINSERT_TRAN_CENTROCOSTOID"), ",", ".") ;
            AV21Insert_Tran_CodigoMovimiento = httpContext.cgiGet( "vINSERT_TRAN_CODIGOMOVIMIENTO") ;
            AV24Insert_Tran_IdCuentadanteOrigen = localUtil.ctol( httpContext.cgiGet( "vINSERT_TRAN_IDCUENTADANTEORIGEN"), ",", ".") ;
            AV25Insert_Tran_IdProveedor = localUtil.ctol( httpContext.cgiGet( "vINSERT_TRAN_IDPROVEEDOR"), ",", ".") ;
            AV23Insert_Tran_IdCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( "vINSERT_TRAN_IDCUENTADANTEDESTINO"), ",", ".") ;
            AV44Insert_Tran_TipoIngreso = localUtil.ctol( httpContext.cgiGet( "vINSERT_TRAN_TIPOINGRESO"), ",", ".") ;
            AV20Insert_Tran_CentroCostoIdDestino = localUtil.ctol( httpContext.cgiGet( "vINSERT_TRAN_CENTROCOSTOIDDESTINO"), ",", ".") ;
            AV45Insert_Tran_IdCuentadanteResponsabilidad = localUtil.ctol( httpContext.cgiGet( "vINSERT_TRAN_IDCUENTADANTERESPONSABILIDAD"), ",", ".") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), ",", ".")) ;
            AV11ConsecutivoCC = httpContext.cgiGet( "vCONSECUTIVOCC") ;
            AV47Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_TRANSACCION" ;
            A390Tran_FechaRatificacion = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRatificacion_Internalname)) ;
            n390Tran_FechaRatificacion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A390Tran_FechaRatificacion", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHARATIFICACION", getSecureSignedToken( "", localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
            forbiddenHiddens = forbiddenHiddens + localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99") ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A46Tran_Id != Z46Tran_Id ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_transaccion:[SecurityCheckFailed]"+forbiddenHiddens);
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
               {
                  sMode7 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode7 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound7 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_050( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TRAN_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTran_Id_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
         sEvt = httpContext.cgiGet( "_EventName") ;
         EvtGridId = httpContext.cgiGet( "_EventGridId") ;
         EvtRowId = httpContext.cgiGet( "_EventRowId") ;
         if ( GXutil.len( sEvt) > 0 )
         {
            sEvtType = GXutil.left( sEvt, 1) ;
            sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
            if ( GXutil.strcmp(sEvtType, "M") != 0 )
            {
               if ( GXutil.strcmp(sEvtType, "E") == 0 )
               {
                  sEvtType = GXutil.right( sEvt, 1) ;
                  if ( GXutil.strcmp(sEvtType, ".") == 0 )
                  {
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e11052 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12052 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "TRAN_CODBODEDESTINO.ISVALID") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e13052 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( GXutil.strcmp(Gx_mode, "DSP") != 0 )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                  }
                  else
                  {
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: After Trn */
         e12052 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll057( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_first_Visible, 5, 0)), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_previous_Visible, 5, 0)), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_next_Visible, 5, 0)), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_last_Visible, 5, 0)), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_select_Visible, 5, 0)), true);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_delete_Visible, 5, 0)), true);
         if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttBtn_enter_Visible, 5, 0)), true);
         }
         disableAttributes057( ) ;
      }
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void confirm_050( )
   {
      beforeValidate057( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls057( ) ;
         }
         else
         {
            checkExtendedTable057( ) ;
            closeExtendedTableCursors057( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode7 = Gx_mode ;
         confirm_0561( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode7 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
         }
         /* Restore parent mode. */
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
   }

   public void confirm_0561( )
   {
      nGXsfl_334_idx = (short)(0) ;
      while ( nGXsfl_334_idx < nRC_GXsfl_334 )
      {
         readRow0561( ) ;
         if ( ( nRcdExists_61 != 0 ) || ( nIsMod_61 != 0 ) )
         {
            getKey0561( ) ;
            if ( ( nRcdExists_61 == 0 ) && ( nRcdDeleted_61 == 0 ) )
            {
               if ( RcdFound61 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate0561( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0561( ) ;
                     closeExtendedTableCursors0561( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TRAN_NRO_DOCUMENTO_" + sGXsfl_334_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTran_Nro_Documento_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound61 != 0 )
               {
                  if ( nRcdDeleted_61 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey0561( ) ;
                     load0561( ) ;
                     beforeValidate0561( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0561( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_61 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate0561( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0561( ) ;
                           closeExtendedTableCursors0561( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_61 == 0 )
                  {
                     GXCCtl = "TRAN_NRO_DOCUMENTO_" + sGXsfl_334_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTran_Nro_Documento_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTran_Nro_Documento_Internalname, GXutil.ltrim( localUtil.ntoc( A827Tran_Nro_Documento, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtTran_Descrip_Documento_Internalname, A828Tran_Descrip_Documento) ;
         httpContext.changePostValue( edtTran_Prefijo_Documento_Internalname, A829Tran_Prefijo_Documento) ;
         httpContext.changePostValue( edtTran_Archivo_Internalname, A830Tran_Archivo) ;
         httpContext.changePostValue( edtTran_Ruta_Archivo_Internalname, A831Tran_Ruta_Archivo) ;
         httpContext.changePostValue( "ZT_"+"Z827Tran_Nro_Documento_"+sGXsfl_334_idx, GXutil.ltrim( localUtil.ntoc( Z827Tran_Nro_Documento, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z831Tran_Ruta_Archivo_"+sGXsfl_334_idx, Z831Tran_Ruta_Archivo) ;
         httpContext.changePostValue( "nRcdDeleted_61_"+sGXsfl_334_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_61, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_61_"+sGXsfl_334_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_61, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_61_"+sGXsfl_334_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_61, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_61 != 0 )
         {
            httpContext.changePostValue( "TRAN_NRO_DOCUMENTO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Nro_Documento_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRAN_DESCRIP_DOCUMENTO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Descrip_Documento_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRAN_PREFIJO_DOCUMENTO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Prefijo_Documento_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRAN_ARCHIVO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Archivo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRAN_RUTA_ARCHIVO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Ruta_Archivo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption050( )
   {
   }

   public void e11052( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV47Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV47Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV37TrnContext.fromxml(AV40WebSession.getValue("TrnContext"), null, null);
      AV26Insert_Tran_UsuarioId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Insert_Tran_UsuarioId", GXutil.ltrim( GXutil.str( AV26Insert_Tran_UsuarioId, 18, 0)));
      AV19Insert_Tran_CentroCostoId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Insert_Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV19Insert_Tran_CentroCostoId, 11, 0)));
      AV21Insert_Tran_CodigoMovimiento = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Insert_Tran_CodigoMovimiento", AV21Insert_Tran_CodigoMovimiento);
      AV24Insert_Tran_IdCuentadanteOrigen = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Insert_Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( AV24Insert_Tran_IdCuentadanteOrigen, 18, 0)));
      AV25Insert_Tran_IdProveedor = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Insert_Tran_IdProveedor", GXutil.ltrim( GXutil.str( AV25Insert_Tran_IdProveedor, 18, 0)));
      AV23Insert_Tran_IdCuentadanteDestino = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Insert_Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( AV23Insert_Tran_IdCuentadanteDestino, 18, 0)));
      AV44Insert_Tran_TipoIngreso = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Insert_Tran_TipoIngreso", GXutil.ltrim( GXutil.str( AV44Insert_Tran_TipoIngreso, 11, 0)));
      AV20Insert_Tran_CentroCostoIdDestino = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Insert_Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( AV20Insert_Tran_CentroCostoIdDestino, 11, 0)));
      AV45Insert_Tran_IdCuentadanteResponsabilidad = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Insert_Tran_IdCuentadanteResponsabilidad", GXutil.ltrim( GXutil.str( AV45Insert_Tran_IdCuentadanteResponsabilidad, 18, 0)));
      if ( ( GXutil.strcmp(AV37TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV47Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV48GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48GXV1", GXutil.ltrim( GXutil.str( AV48GXV1, 8, 0)));
         while ( AV48GXV1 <= AV37TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV38TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV37TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV48GXV1));
            if ( GXutil.strcmp(AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tran_UsuarioId") == 0 )
            {
               AV26Insert_Tran_UsuarioId = GXutil.lval( AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26Insert_Tran_UsuarioId", GXutil.ltrim( GXutil.str( AV26Insert_Tran_UsuarioId, 18, 0)));
            }
            else if ( GXutil.strcmp(AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tran_CentroCostoId") == 0 )
            {
               AV19Insert_Tran_CentroCostoId = GXutil.lval( AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Insert_Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV19Insert_Tran_CentroCostoId, 11, 0)));
            }
            else if ( GXutil.strcmp(AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tran_CodigoMovimiento") == 0 )
            {
               AV21Insert_Tran_CodigoMovimiento = AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21Insert_Tran_CodigoMovimiento", AV21Insert_Tran_CodigoMovimiento);
            }
            else if ( GXutil.strcmp(AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tran_IdCuentadanteOrigen") == 0 )
            {
               AV24Insert_Tran_IdCuentadanteOrigen = GXutil.lval( AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Insert_Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( AV24Insert_Tran_IdCuentadanteOrigen, 18, 0)));
            }
            else if ( GXutil.strcmp(AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tran_IdProveedor") == 0 )
            {
               AV25Insert_Tran_IdProveedor = GXutil.lval( AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Insert_Tran_IdProveedor", GXutil.ltrim( GXutil.str( AV25Insert_Tran_IdProveedor, 18, 0)));
            }
            else if ( GXutil.strcmp(AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tran_IdCuentadanteDestino") == 0 )
            {
               AV23Insert_Tran_IdCuentadanteDestino = GXutil.lval( AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23Insert_Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( AV23Insert_Tran_IdCuentadanteDestino, 18, 0)));
            }
            else if ( GXutil.strcmp(AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tran_TipoIngreso") == 0 )
            {
               AV44Insert_Tran_TipoIngreso = GXutil.lval( AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Insert_Tran_TipoIngreso", GXutil.ltrim( GXutil.str( AV44Insert_Tran_TipoIngreso, 11, 0)));
            }
            else if ( GXutil.strcmp(AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tran_CentroCostoIdDestino") == 0 )
            {
               AV20Insert_Tran_CentroCostoIdDestino = GXutil.lval( AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20Insert_Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( AV20Insert_Tran_CentroCostoIdDestino, 11, 0)));
            }
            else if ( GXutil.strcmp(AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tran_IdCuentadanteResponsabilidad") == 0 )
            {
               AV45Insert_Tran_IdCuentadanteResponsabilidad = GXutil.lval( AV38TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45Insert_Tran_IdCuentadanteResponsabilidad", GXutil.ltrim( GXutil.str( AV45Insert_Tran_IdCuentadanteResponsabilidad, 18, 0)));
            }
            AV48GXV1 = (int)(AV48GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48GXV1", GXutil.ltrim( GXutil.str( AV48GXV1, 8, 0)));
         }
      }
      AV39Usuario = AV40WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Usuario", AV39Usuario);
      GXv_int1[0] = AV15IdUsuario ;
      new com.orions2.recuperaidusuario(remoteHandle, context).execute( AV39Usuario, GXv_int1) ;
      alm_transaccion_impl.this.AV15IdUsuario = GXv_int1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Usuario", AV39Usuario);
      httpContext.ajax_rsp_assign_attri("", false, "AV15IdUsuario", GXutil.ltrim( GXutil.str( AV15IdUsuario, 18, 0)));
      edtTran_UsuarioId_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_UsuarioId_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_UsuarioId_Visible, 5, 0)), true);
      edtTran_UsuarioCodigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_UsuarioCodigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_UsuarioCodigo_Visible, 5, 0)), true);
      edtTran_UsuarioNombre_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_UsuarioNombre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_UsuarioNombre_Visible, 5, 0)), true);
      cmbTran_IndAreadante.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_IndAreadante.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbTran_IndAreadante.getVisible(), 5, 0)), true);
      cmbTran_IndCurso.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_IndCurso.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbTran_IndCurso.getVisible(), 5, 0)), true);
      cmbTran_TipoEntra.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoEntra.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbTran_TipoEntra.getVisible(), 5, 0)), true);
      edtTran_CantidadPadres_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CantidadPadres_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_CantidadPadres_Visible, 5, 0)), true);
      edtTran_IdProveedor_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_IdProveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_IdProveedor_Visible, 5, 0)), true);
      edtTran_Id_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Id_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_Id_Visible, 5, 0)), true);
      edtTran_RegionId_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_RegionId_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_RegionId_Visible, 5, 0)), true);
      cmbTran_IndE_S.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_IndE_S.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbTran_IndE_S.getVisible(), 5, 0)), true);
      cmbTran_TipoElemento.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoElemento.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbTran_TipoElemento.getVisible(), 5, 0)), true);
      AV42Pattern = "\\b(\\d{1,2})/(\\d{1,2})/(\\d{2,4})\\b" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Pattern", AV42Pattern);
   }

   public void e12052( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV37TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_transaccion") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(16);
      pr_default.close(15);
      pr_default.close(14);
      pr_default.close(13);
      pr_default.close(12);
      pr_default.close(11);
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e13052( )
   {
      /* Tran_CodBodeDestino_Isvalid Routine */
      GXv_int1[0] = A48Tran_CentroCostoId ;
      GXv_char2[0] = A385Tran_ModuloDestino ;
      GXv_char3[0] = A111Tran_CodAlmaDestino ;
      GXv_char4[0] = AV14ExisteCuentadanteDestino ;
      new com.orions2.verificacuentadante(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_char3, GXv_char4) ;
      alm_transaccion_impl.this.A48Tran_CentroCostoId = GXv_int1[0] ;
      alm_transaccion_impl.this.A385Tran_ModuloDestino = GXv_char2[0] ;
      alm_transaccion_impl.this.A111Tran_CodAlmaDestino = GXv_char3[0] ;
      alm_transaccion_impl.this.AV14ExisteCuentadanteDestino = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
      httpContext.ajax_rsp_assign_attri("", false, "A111Tran_CodAlmaDestino", A111Tran_CodAlmaDestino);
      httpContext.ajax_rsp_assign_attri("", false, "AV14ExisteCuentadanteDestino", AV14ExisteCuentadanteDestino);
      if ( GXutil.strcmp(AV14ExisteCuentadanteDestino, "S") == 0 )
      {
         edtTran_IdCuentadanteDestino_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_IdCuentadanteDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdCuentadanteDestino_Enabled, 5, 0)), true);
      }
      else
      {
         edtTran_IdCuentadanteDestino_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_IdCuentadanteDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdCuentadanteDestino_Enabled, 5, 0)), true);
      }
   }

   public void zm057( int GX_JID )
   {
      if ( ( GX_JID == 49 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z55Tran_FechaRegistro = T00056_A55Tran_FechaRegistro[0] ;
            Z58Tran_Estado = T00056_A58Tran_Estado[0] ;
            Z110Tran_ModuloOrigen = T00056_A110Tran_ModuloOrigen[0] ;
            Z109Tran_CodAlmaOrigen = T00056_A109Tran_CodAlmaOrigen[0] ;
            Z112Tran_CodBodeOrigen = T00056_A112Tran_CodBodeOrigen[0] ;
            Z385Tran_ModuloDestino = T00056_A385Tran_ModuloDestino[0] ;
            Z111Tran_CodAlmaDestino = T00056_A111Tran_CodAlmaDestino[0] ;
            Z387Tran_CodBodeDestino = T00056_A387Tran_CodBodeDestino[0] ;
            Z407Tran_AreadanteCodigo = T00056_A407Tran_AreadanteCodigo[0] ;
            Z408Tran_CursoCodigo = T00056_A408Tran_CursoCodigo[0] ;
            Z483Tran_ValorTransaccion = T00056_A483Tran_ValorTransaccion[0] ;
            Z498Tran_NumeroLineas = T00056_A498Tran_NumeroLineas[0] ;
            Z390Tran_FechaRatificacion = T00056_A390Tran_FechaRatificacion[0] ;
            Z391Tran_UsuarioRatifica = T00056_A391Tran_UsuarioRatifica[0] ;
            Z513Tran_ConsecutivoCC = T00056_A513Tran_ConsecutivoCC[0] ;
            Z514Tran_NumeroIngreso = T00056_A514Tran_NumeroIngreso[0] ;
            Z515Tran_FechaIngreso = T00056_A515Tran_FechaIngreso[0] ;
            Z524Tran_Detalle = T00056_A524Tran_Detalle[0] ;
            Z527Tran_TipoEntra = T00056_A527Tran_TipoEntra[0] ;
            Z568Tran_CantidadPadres = T00056_A568Tran_CantidadPadres[0] ;
            Z667Tran_NumeroGrupo = T00056_A667Tran_NumeroGrupo[0] ;
            Z668Tran_UsuarioEliminaoAnula = T00056_A668Tran_UsuarioEliminaoAnula[0] ;
            Z669Tran_FechaEliminaoAnula = T00056_A669Tran_FechaEliminaoAnula[0] ;
            Z670Tran_ObservacionesAnula = T00056_A670Tran_ObservacionesAnula[0] ;
            Z719Tran_TransaccResponsabilidad = T00056_A719Tran_TransaccResponsabilidad[0] ;
            Z720Tran_FechaResponsabilidad = T00056_A720Tran_FechaResponsabilidad[0] ;
            Z758Tran_TablaResponsabilidad = T00056_A758Tran_TablaResponsabilidad[0] ;
            Z859Tran_EntidadGobierno = T00056_A859Tran_EntidadGobierno[0] ;
            Z47Tran_UsuarioId = T00056_A47Tran_UsuarioId[0] ;
            Z48Tran_CentroCostoId = T00056_A48Tran_CentroCostoId[0] ;
            Z50Tran_CentroCostoIdDestino = T00056_A50Tran_CentroCostoIdDestino[0] ;
            Z49Tran_CodigoMovimiento = T00056_A49Tran_CodigoMovimiento[0] ;
            Z51Tran_IdCuentadanteOrigen = T00056_A51Tran_IdCuentadanteOrigen[0] ;
            Z53Tran_IdProveedor = T00056_A53Tran_IdProveedor[0] ;
            Z52Tran_IdCuentadanteDestino = T00056_A52Tran_IdCuentadanteDestino[0] ;
            Z56Tran_IdCuentadanteResponsabili = T00056_A56Tran_IdCuentadanteResponsabili[0] ;
            Z54Tran_TipoIngreso = T00056_A54Tran_TipoIngreso[0] ;
         }
         else
         {
            Z55Tran_FechaRegistro = A55Tran_FechaRegistro ;
            Z58Tran_Estado = A58Tran_Estado ;
            Z110Tran_ModuloOrigen = A110Tran_ModuloOrigen ;
            Z109Tran_CodAlmaOrigen = A109Tran_CodAlmaOrigen ;
            Z112Tran_CodBodeOrigen = A112Tran_CodBodeOrigen ;
            Z385Tran_ModuloDestino = A385Tran_ModuloDestino ;
            Z111Tran_CodAlmaDestino = A111Tran_CodAlmaDestino ;
            Z387Tran_CodBodeDestino = A387Tran_CodBodeDestino ;
            Z407Tran_AreadanteCodigo = A407Tran_AreadanteCodigo ;
            Z408Tran_CursoCodigo = A408Tran_CursoCodigo ;
            Z483Tran_ValorTransaccion = A483Tran_ValorTransaccion ;
            Z498Tran_NumeroLineas = A498Tran_NumeroLineas ;
            Z390Tran_FechaRatificacion = A390Tran_FechaRatificacion ;
            Z391Tran_UsuarioRatifica = A391Tran_UsuarioRatifica ;
            Z513Tran_ConsecutivoCC = A513Tran_ConsecutivoCC ;
            Z514Tran_NumeroIngreso = A514Tran_NumeroIngreso ;
            Z515Tran_FechaIngreso = A515Tran_FechaIngreso ;
            Z524Tran_Detalle = A524Tran_Detalle ;
            Z527Tran_TipoEntra = A527Tran_TipoEntra ;
            Z568Tran_CantidadPadres = A568Tran_CantidadPadres ;
            Z667Tran_NumeroGrupo = A667Tran_NumeroGrupo ;
            Z668Tran_UsuarioEliminaoAnula = A668Tran_UsuarioEliminaoAnula ;
            Z669Tran_FechaEliminaoAnula = A669Tran_FechaEliminaoAnula ;
            Z670Tran_ObservacionesAnula = A670Tran_ObservacionesAnula ;
            Z719Tran_TransaccResponsabilidad = A719Tran_TransaccResponsabilidad ;
            Z720Tran_FechaResponsabilidad = A720Tran_FechaResponsabilidad ;
            Z758Tran_TablaResponsabilidad = A758Tran_TablaResponsabilidad ;
            Z859Tran_EntidadGobierno = A859Tran_EntidadGobierno ;
            Z47Tran_UsuarioId = A47Tran_UsuarioId ;
            Z48Tran_CentroCostoId = A48Tran_CentroCostoId ;
            Z50Tran_CentroCostoIdDestino = A50Tran_CentroCostoIdDestino ;
            Z49Tran_CodigoMovimiento = A49Tran_CodigoMovimiento ;
            Z51Tran_IdCuentadanteOrigen = A51Tran_IdCuentadanteOrigen ;
            Z53Tran_IdProveedor = A53Tran_IdProveedor ;
            Z52Tran_IdCuentadanteDestino = A52Tran_IdCuentadanteDestino ;
            Z56Tran_IdCuentadanteResponsabili = A56Tran_IdCuentadanteResponsabili ;
            Z54Tran_TipoIngreso = A54Tran_TipoIngreso ;
         }
      }
      if ( GX_JID == -49 )
      {
         Z46Tran_Id = A46Tran_Id ;
         Z55Tran_FechaRegistro = A55Tran_FechaRegistro ;
         Z58Tran_Estado = A58Tran_Estado ;
         Z57Tran_RegionId = A57Tran_RegionId ;
         Z481Tran_IndE_S = A481Tran_IndE_S ;
         Z482Tran_TipoElemento = A482Tran_TipoElemento ;
         Z110Tran_ModuloOrigen = A110Tran_ModuloOrigen ;
         Z109Tran_CodAlmaOrigen = A109Tran_CodAlmaOrigen ;
         Z112Tran_CodBodeOrigen = A112Tran_CodBodeOrigen ;
         Z385Tran_ModuloDestino = A385Tran_ModuloDestino ;
         Z111Tran_CodAlmaDestino = A111Tran_CodAlmaDestino ;
         Z387Tran_CodBodeDestino = A387Tran_CodBodeDestino ;
         Z416Tran_Observaciones = A416Tran_Observaciones ;
         Z407Tran_AreadanteCodigo = A407Tran_AreadanteCodigo ;
         Z408Tran_CursoCodigo = A408Tran_CursoCodigo ;
         Z483Tran_ValorTransaccion = A483Tran_ValorTransaccion ;
         Z498Tran_NumeroLineas = A498Tran_NumeroLineas ;
         Z390Tran_FechaRatificacion = A390Tran_FechaRatificacion ;
         Z391Tran_UsuarioRatifica = A391Tran_UsuarioRatifica ;
         Z513Tran_ConsecutivoCC = A513Tran_ConsecutivoCC ;
         Z514Tran_NumeroIngreso = A514Tran_NumeroIngreso ;
         Z515Tran_FechaIngreso = A515Tran_FechaIngreso ;
         Z518Tran_RegionIdDestino = A518Tran_RegionIdDestino ;
         Z524Tran_Detalle = A524Tran_Detalle ;
         Z527Tran_TipoEntra = A527Tran_TipoEntra ;
         Z568Tran_CantidadPadres = A568Tran_CantidadPadres ;
         Z667Tran_NumeroGrupo = A667Tran_NumeroGrupo ;
         Z668Tran_UsuarioEliminaoAnula = A668Tran_UsuarioEliminaoAnula ;
         Z669Tran_FechaEliminaoAnula = A669Tran_FechaEliminaoAnula ;
         Z670Tran_ObservacionesAnula = A670Tran_ObservacionesAnula ;
         Z719Tran_TransaccResponsabilidad = A719Tran_TransaccResponsabilidad ;
         Z720Tran_FechaResponsabilidad = A720Tran_FechaResponsabilidad ;
         Z758Tran_TablaResponsabilidad = A758Tran_TablaResponsabilidad ;
         Z859Tran_EntidadGobierno = A859Tran_EntidadGobierno ;
         Z47Tran_UsuarioId = A47Tran_UsuarioId ;
         Z48Tran_CentroCostoId = A48Tran_CentroCostoId ;
         Z50Tran_CentroCostoIdDestino = A50Tran_CentroCostoIdDestino ;
         Z49Tran_CodigoMovimiento = A49Tran_CodigoMovimiento ;
         Z51Tran_IdCuentadanteOrigen = A51Tran_IdCuentadanteOrigen ;
         Z53Tran_IdProveedor = A53Tran_IdProveedor ;
         Z52Tran_IdCuentadanteDestino = A52Tran_IdCuentadanteDestino ;
         Z56Tran_IdCuentadanteResponsabili = A56Tran_IdCuentadanteResponsabili ;
         Z54Tran_TipoIngreso = A54Tran_TipoIngreso ;
         Z417Tran_UsuarioCodigo = A417Tran_UsuarioCodigo ;
         Z418Tran_UsuarioNombre = A418Tran_UsuarioNombre ;
         Z419Tran_CentroCostoCodigo = A419Tran_CentroCostoCodigo ;
         Z420Tran_CentroCostoDescripcion = A420Tran_CentroCostoDescripcion ;
         Z421Tran_RegionCodigo = A421Tran_RegionCodigo ;
         Z422Tran_RegionDescripcion = A422Tran_RegionDescripcion ;
         Z594Tran_RegionAbrev = A594Tran_RegionAbrev ;
         Z381Tran_DescripcionMovimiento = A381Tran_DescripcionMovimiento ;
         Z478Tran_IndAreadante = A478Tran_IndAreadante ;
         Z479Tran_IndCurso = A479Tran_IndCurso ;
         Z707Tran_SolicitaCCDestino = A707Tran_SolicitaCCDestino ;
         Z708Tran_SolicitaRegionDestino = A708Tran_SolicitaRegionDestino ;
         Z754Tran_CuentaResponsabilidad = A754Tran_CuentaResponsabilidad ;
         Z499Tran_CodTipoElemento = A499Tran_CodTipoElemento ;
         Z384Tran_NombCuentadanteOrigen = A384Tran_NombCuentadanteOrigen ;
         Z702Tran_CedulaCuentadanteOrigen = A702Tran_CedulaCuentadanteOrigen ;
         Z714Tran_EmailCuentadanteOrigen = A714Tran_EmailCuentadanteOrigen ;
         Z575Tran_NombreProveedor = A575Tran_NombreProveedor ;
         Z703Tran_CedulaProveedor = A703Tran_CedulaProveedor ;
         Z389Tran_NombCuentadanteDestino = A389Tran_NombCuentadanteDestino ;
         Z704Tran_CedulaCuentadanteDestino = A704Tran_CedulaCuentadanteDestino ;
         Z715Tran_EmailCuentadanteDestino = A715Tran_EmailCuentadanteDestino ;
         Z672Tran_NombreIngreso = A672Tran_NombreIngreso ;
         Z756Tran_Abreviado = A756Tran_Abreviado ;
         Z516Tran_CentroCostoCodigoDestino = A516Tran_CentroCostoCodigoDestino ;
         Z517Tran_CentroCostoDescripcionDes = A517Tran_CentroCostoDescripcionDes ;
         Z519Tran_RegionCodigoDestino = A519Tran_RegionCodigoDestino ;
         Z520Tran_RegionDescripcionDestino = A520Tran_RegionDescripcionDestino ;
         Z608Tran_RegionAbrevDestino = A608Tran_RegionAbrevDestino ;
         Z759Tran_CedulaResponsabilidad = A759Tran_CedulaResponsabilidad ;
         Z721Tran_NombreCuentadanteResponsa = A721Tran_NombreCuentadanteResponsa ;
      }
   }

   public void standaloneNotModal( )
   {
      edtTran_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Id_Enabled, 5, 0)), true);
      edtTran_FechaRegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaRegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_FechaRegistro_Enabled, 5, 0)), true);
      edtTran_FechaRatificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaRatificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_FechaRatificacion_Enabled, 5, 0)), true);
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         edtTran_ConsecutivoCC_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_ConsecutivoCC_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtTran_ConsecutivoCC_Visible, 5, 0)), true);
      }
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      imgprompt_47_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0050"+"',["+"{Ctrl:gx.dom.el('"+"TRAN_USUARIOID"+"'), id:'"+"TRAN_USUARIOID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_48_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0010"+"',["+"{Ctrl:gx.dom.el('"+"TRAN_CENTROCOSTOID"+"'), id:'"+"TRAN_CENTROCOSTOID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_49_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00v0"+"',["+"{Ctrl:gx.dom.el('"+"TRAN_CODIGOMOVIMIENTO"+"'), id:'"+"TRAN_CODIGOMOVIMIENTO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_51_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00a0"+"',["+"{Ctrl:gx.dom.el('"+"TRAN_IDCUENTADANTEORIGEN"+"'), id:'"+"TRAN_IDCUENTADANTEORIGEN"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_53_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00a0"+"',["+"{Ctrl:gx.dom.el('"+"TRAN_IDPROVEEDOR"+"'), id:'"+"TRAN_IDPROVEEDOR"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_52_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00a0"+"',["+"{Ctrl:gx.dom.el('"+"TRAN_IDCUENTADANTEDESTINO"+"'), id:'"+"TRAN_IDCUENTADANTEDESTINO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_50_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0010"+"',["+"{Ctrl:gx.dom.el('"+"TRAN_CENTROCOSTOIDDESTINO"+"'), id:'"+"TRAN_CENTROCOSTOIDDESTINO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_56_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00a0"+"',["+"{Ctrl:gx.dom.el('"+"TRAN_IDCUENTADANTERESPONSABILI"+"'), id:'"+"TRAN_IDCUENTADANTERESPONSABILI"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      edtTran_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Id_Enabled, 5, 0)), true);
      edtTran_FechaRegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaRegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_FechaRegistro_Enabled, 5, 0)), true);
      edtTran_FechaRatificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaRatificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_FechaRatificacion_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV33Tran_Id) )
      {
         A46Tran_Id = AV33Tran_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV26Insert_Tran_UsuarioId) )
      {
         edtTran_UsuarioId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_UsuarioId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_UsuarioId_Enabled, 5, 0)), true);
      }
      else
      {
         edtTran_UsuarioId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_UsuarioId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_UsuarioId_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV19Insert_Tran_CentroCostoId) )
      {
         edtTran_CentroCostoId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_CentroCostoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CentroCostoId_Enabled, 5, 0)), true);
      }
      else
      {
         edtTran_CentroCostoId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_CentroCostoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CentroCostoId_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV21Insert_Tran_CodigoMovimiento)==0) )
      {
         edtTran_CodigoMovimiento_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_CodigoMovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CodigoMovimiento_Enabled, 5, 0)), true);
      }
      else
      {
         edtTran_CodigoMovimiento_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_CodigoMovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CodigoMovimiento_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV24Insert_Tran_IdCuentadanteOrigen) )
      {
         edtTran_IdCuentadanteOrigen_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_IdCuentadanteOrigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdCuentadanteOrigen_Enabled, 5, 0)), true);
      }
      else
      {
         edtTran_IdCuentadanteOrigen_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_IdCuentadanteOrigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdCuentadanteOrigen_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV25Insert_Tran_IdProveedor) )
      {
         edtTran_IdProveedor_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_IdProveedor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdProveedor_Enabled, 5, 0)), true);
      }
      else
      {
         edtTran_IdProveedor_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_IdProveedor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdProveedor_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV23Insert_Tran_IdCuentadanteDestino) )
      {
         edtTran_IdCuentadanteDestino_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_IdCuentadanteDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdCuentadanteDestino_Enabled, 5, 0)), true);
      }
      else
      {
         edtTran_IdCuentadanteDestino_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_IdCuentadanteDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdCuentadanteDestino_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV44Insert_Tran_TipoIngreso) )
      {
         cmbTran_TipoIngreso.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoIngreso.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_TipoIngreso.getEnabled(), 5, 0)), true);
      }
      else
      {
         cmbTran_TipoIngreso.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoIngreso.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_TipoIngreso.getEnabled(), 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV20Insert_Tran_CentroCostoIdDestino) )
      {
         edtTran_CentroCostoIdDestino_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_CentroCostoIdDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CentroCostoIdDestino_Enabled, 5, 0)), true);
      }
      else
      {
         edtTran_CentroCostoIdDestino_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_CentroCostoIdDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CentroCostoIdDestino_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV45Insert_Tran_IdCuentadanteResponsabilidad) )
      {
         edtTran_IdCuentadanteResponsabili_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_IdCuentadanteResponsabili_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdCuentadanteResponsabili_Enabled, 5, 0)), true);
      }
      else
      {
         edtTran_IdCuentadanteResponsabili_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_IdCuentadanteResponsabili_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdCuentadanteResponsabili_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV45Insert_Tran_IdCuentadanteResponsabilidad) )
      {
         A56Tran_IdCuentadanteResponsabili = AV45Insert_Tran_IdCuentadanteResponsabilidad ;
         n56Tran_IdCuentadanteResponsabili = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A56Tran_IdCuentadanteResponsabili", GXutil.ltrim( GXutil.str( A56Tran_IdCuentadanteResponsabili, 18, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV20Insert_Tran_CentroCostoIdDestino) )
      {
         A50Tran_CentroCostoIdDestino = AV20Insert_Tran_CentroCostoIdDestino ;
         n50Tran_CentroCostoIdDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A50Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( A50Tran_CentroCostoIdDestino, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV44Insert_Tran_TipoIngreso) )
      {
         A54Tran_TipoIngreso = AV44Insert_Tran_TipoIngreso ;
         n54Tran_TipoIngreso = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV23Insert_Tran_IdCuentadanteDestino) )
      {
         A52Tran_IdCuentadanteDestino = AV23Insert_Tran_IdCuentadanteDestino ;
         n52Tran_IdCuentadanteDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A52Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( A52Tran_IdCuentadanteDestino, 18, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV25Insert_Tran_IdProveedor) )
      {
         A53Tran_IdProveedor = AV25Insert_Tran_IdProveedor ;
         n53Tran_IdProveedor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A53Tran_IdProveedor", GXutil.ltrim( GXutil.str( A53Tran_IdProveedor, 18, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV24Insert_Tran_IdCuentadanteOrigen) )
      {
         A51Tran_IdCuentadanteOrigen = AV24Insert_Tran_IdCuentadanteOrigen ;
         n51Tran_IdCuentadanteOrigen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A51Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( A51Tran_IdCuentadanteOrigen, 18, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV21Insert_Tran_CodigoMovimiento)==0) )
      {
         A49Tran_CodigoMovimiento = AV21Insert_Tran_CodigoMovimiento ;
         httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV19Insert_Tran_CentroCostoId) )
      {
         A48Tran_CentroCostoId = AV19Insert_Tran_CentroCostoId ;
         httpContext.ajax_rsp_assign_attri("", false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV26Insert_Tran_UsuarioId) )
      {
         A47Tran_UsuarioId = AV26Insert_Tran_UsuarioId ;
         n47Tran_UsuarioId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A47Tran_UsuarioId", GXutil.ltrim( GXutil.str( A47Tran_UsuarioId, 18, 0)));
      }
      else
      {
         A47Tran_UsuarioId = AV15IdUsuario ;
         n47Tran_UsuarioId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A47Tran_UsuarioId", GXutil.ltrim( GXutil.str( A47Tran_UsuarioId, 18, 0)));
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_enter_Enabled, 5, 0)), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_enter_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  && GXutil.dateCompare(GXutil.nullDate(), A55Tran_FechaRegistro) && ( Gx_BScreen == 0 ) )
      {
         A55Tran_FechaRegistro = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV47Pgmname = "ALM_TRANSACCION" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
         /* Using cursor T000516 */
         pr_default.execute(14, new Object[] {new Boolean(n56Tran_IdCuentadanteResponsabili), new Long(A56Tran_IdCuentadanteResponsabili)});
         A759Tran_CedulaResponsabilidad = T000516_A759Tran_CedulaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
         n759Tran_CedulaResponsabilidad = T000516_n759Tran_CedulaResponsabilidad[0] ;
         A721Tran_NombreCuentadanteResponsa = T000516_A721Tran_NombreCuentadanteResponsa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
         n721Tran_NombreCuentadanteResponsa = T000516_n721Tran_NombreCuentadanteResponsa[0] ;
         pr_default.close(14);
         /* Using cursor T00059 */
         pr_default.execute(7, new Object[] {new Boolean(n50Tran_CentroCostoIdDestino), new Long(A50Tran_CentroCostoIdDestino)});
         A516Tran_CentroCostoCodigoDestino = T00059_A516Tran_CentroCostoCodigoDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A516Tran_CentroCostoCodigoDestino", A516Tran_CentroCostoCodigoDestino);
         n516Tran_CentroCostoCodigoDestino = T00059_n516Tran_CentroCostoCodigoDestino[0] ;
         A517Tran_CentroCostoDescripcionDes = T00059_A517Tran_CentroCostoDescripcionDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A517Tran_CentroCostoDescripcionDes", A517Tran_CentroCostoDescripcionDes);
         n517Tran_CentroCostoDescripcionDes = T00059_n517Tran_CentroCostoDescripcionDes[0] ;
         A518Tran_RegionIdDestino = T00059_A518Tran_RegionIdDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A518Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( A518Tran_RegionIdDestino, 11, 0)));
         n518Tran_RegionIdDestino = T00059_n518Tran_RegionIdDestino[0] ;
         pr_default.close(7);
         /* Using cursor T000511 */
         pr_default.execute(9, new Object[] {new Boolean(n518Tran_RegionIdDestino), new Long(A518Tran_RegionIdDestino)});
         A519Tran_RegionCodigoDestino = T000511_A519Tran_RegionCodigoDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A519Tran_RegionCodigoDestino", GXutil.ltrim( GXutil.str( A519Tran_RegionCodigoDestino, 4, 0)));
         n519Tran_RegionCodigoDestino = T000511_n519Tran_RegionCodigoDestino[0] ;
         A520Tran_RegionDescripcionDestino = T000511_A520Tran_RegionDescripcionDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A520Tran_RegionDescripcionDestino", A520Tran_RegionDescripcionDestino);
         n520Tran_RegionDescripcionDestino = T000511_n520Tran_RegionDescripcionDestino[0] ;
         A608Tran_RegionAbrevDestino = T000511_A608Tran_RegionAbrevDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A608Tran_RegionAbrevDestino", A608Tran_RegionAbrevDestino);
         n608Tran_RegionAbrevDestino = T000511_n608Tran_RegionAbrevDestino[0] ;
         pr_default.close(9);
         /* Using cursor T000517 */
         pr_default.execute(15, new Object[] {new Boolean(n54Tran_TipoIngreso), new Long(A54Tran_TipoIngreso)});
         A672Tran_NombreIngreso = T000517_A672Tran_NombreIngreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
         n672Tran_NombreIngreso = T000517_n672Tran_NombreIngreso[0] ;
         A756Tran_Abreviado = T000517_A756Tran_Abreviado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A756Tran_Abreviado", A756Tran_Abreviado);
         n756Tran_Abreviado = T000517_n756Tran_Abreviado[0] ;
         pr_default.close(15);
         /* Using cursor T000515 */
         pr_default.execute(13, new Object[] {new Boolean(n52Tran_IdCuentadanteDestino), new Long(A52Tran_IdCuentadanteDestino)});
         A389Tran_NombCuentadanteDestino = T000515_A389Tran_NombCuentadanteDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
         n389Tran_NombCuentadanteDestino = T000515_n389Tran_NombCuentadanteDestino[0] ;
         A704Tran_CedulaCuentadanteDestino = T000515_A704Tran_CedulaCuentadanteDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
         n704Tran_CedulaCuentadanteDestino = T000515_n704Tran_CedulaCuentadanteDestino[0] ;
         A715Tran_EmailCuentadanteDestino = T000515_A715Tran_EmailCuentadanteDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A715Tran_EmailCuentadanteDestino", A715Tran_EmailCuentadanteDestino);
         n715Tran_EmailCuentadanteDestino = T000515_n715Tran_EmailCuentadanteDestino[0] ;
         pr_default.close(13);
         /* Using cursor T000514 */
         pr_default.execute(12, new Object[] {new Boolean(n53Tran_IdProveedor), new Long(A53Tran_IdProveedor)});
         A575Tran_NombreProveedor = T000514_A575Tran_NombreProveedor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
         n575Tran_NombreProveedor = T000514_n575Tran_NombreProveedor[0] ;
         A703Tran_CedulaProveedor = T000514_A703Tran_CedulaProveedor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
         n703Tran_CedulaProveedor = T000514_n703Tran_CedulaProveedor[0] ;
         pr_default.close(12);
         /* Using cursor T000513 */
         pr_default.execute(11, new Object[] {new Boolean(n51Tran_IdCuentadanteOrigen), new Long(A51Tran_IdCuentadanteOrigen)});
         A384Tran_NombCuentadanteOrigen = T000513_A384Tran_NombCuentadanteOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
         n384Tran_NombCuentadanteOrigen = T000513_n384Tran_NombCuentadanteOrigen[0] ;
         A702Tran_CedulaCuentadanteOrigen = T000513_A702Tran_CedulaCuentadanteOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
         n702Tran_CedulaCuentadanteOrigen = T000513_n702Tran_CedulaCuentadanteOrigen[0] ;
         A714Tran_EmailCuentadanteOrigen = T000513_A714Tran_EmailCuentadanteOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A714Tran_EmailCuentadanteOrigen", A714Tran_EmailCuentadanteOrigen);
         n714Tran_EmailCuentadanteOrigen = T000513_n714Tran_EmailCuentadanteOrigen[0] ;
         pr_default.close(11);
         /* Using cursor T000512 */
         pr_default.execute(10, new Object[] {A49Tran_CodigoMovimiento});
         A381Tran_DescripcionMovimiento = T000512_A381Tran_DescripcionMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
         n381Tran_DescripcionMovimiento = T000512_n381Tran_DescripcionMovimiento[0] ;
         A478Tran_IndAreadante = T000512_A478Tran_IndAreadante[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
         n478Tran_IndAreadante = T000512_n478Tran_IndAreadante[0] ;
         A481Tran_IndE_S = T000512_A481Tran_IndE_S[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A481Tran_IndE_S", A481Tran_IndE_S);
         n481Tran_IndE_S = T000512_n481Tran_IndE_S[0] ;
         A479Tran_IndCurso = T000512_A479Tran_IndCurso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479Tran_IndCurso", A479Tran_IndCurso);
         n479Tran_IndCurso = T000512_n479Tran_IndCurso[0] ;
         A707Tran_SolicitaCCDestino = T000512_A707Tran_SolicitaCCDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
         n707Tran_SolicitaCCDestino = T000512_n707Tran_SolicitaCCDestino[0] ;
         A708Tran_SolicitaRegionDestino = T000512_A708Tran_SolicitaRegionDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
         n708Tran_SolicitaRegionDestino = T000512_n708Tran_SolicitaRegionDestino[0] ;
         A754Tran_CuentaResponsabilidad = T000512_A754Tran_CuentaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
         n754Tran_CuentaResponsabilidad = T000512_n754Tran_CuentaResponsabilidad[0] ;
         A499Tran_CodTipoElemento = T000512_A499Tran_CodTipoElemento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A499Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( A499Tran_CodTipoElemento, 18, 0)));
         n499Tran_CodTipoElemento = T000512_n499Tran_CodTipoElemento[0] ;
         pr_default.close(10);
         /* Using cursor T000518 */
         pr_default.execute(16, new Object[] {new Boolean(n499Tran_CodTipoElemento), new Long(A499Tran_CodTipoElemento)});
         A482Tran_TipoElemento = T000518_A482Tran_TipoElemento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
         n482Tran_TipoElemento = T000518_n482Tran_TipoElemento[0] ;
         pr_default.close(16);
         /* Using cursor T00058 */
         pr_default.execute(6, new Object[] {new Long(A48Tran_CentroCostoId)});
         A419Tran_CentroCostoCodigo = T00058_A419Tran_CentroCostoCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
         n419Tran_CentroCostoCodigo = T00058_n419Tran_CentroCostoCodigo[0] ;
         A420Tran_CentroCostoDescripcion = T00058_A420Tran_CentroCostoDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
         n420Tran_CentroCostoDescripcion = T00058_n420Tran_CentroCostoDescripcion[0] ;
         A57Tran_RegionId = T00058_A57Tran_RegionId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57Tran_RegionId", GXutil.ltrim( GXutil.str( A57Tran_RegionId, 11, 0)));
         n57Tran_RegionId = T00058_n57Tran_RegionId[0] ;
         pr_default.close(6);
         /* Using cursor T000510 */
         pr_default.execute(8, new Object[] {new Boolean(n57Tran_RegionId), new Long(A57Tran_RegionId)});
         A421Tran_RegionCodigo = T000510_A421Tran_RegionCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
         n421Tran_RegionCodigo = T000510_n421Tran_RegionCodigo[0] ;
         A422Tran_RegionDescripcion = T000510_A422Tran_RegionDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
         n422Tran_RegionDescripcion = T000510_n422Tran_RegionDescripcion[0] ;
         A594Tran_RegionAbrev = T000510_A594Tran_RegionAbrev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A594Tran_RegionAbrev", A594Tran_RegionAbrev);
         n594Tran_RegionAbrev = T000510_n594Tran_RegionAbrev[0] ;
         pr_default.close(8);
         /* Using cursor T00057 */
         pr_default.execute(5, new Object[] {new Boolean(n47Tran_UsuarioId), new Long(A47Tran_UsuarioId)});
         A417Tran_UsuarioCodigo = T00057_A417Tran_UsuarioCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
         n417Tran_UsuarioCodigo = T00057_n417Tran_UsuarioCodigo[0] ;
         A418Tran_UsuarioNombre = T00057_A418Tran_UsuarioNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A418Tran_UsuarioNombre", A418Tran_UsuarioNombre);
         n418Tran_UsuarioNombre = T00057_n418Tran_UsuarioNombre[0] ;
         pr_default.close(5);
      }
   }

   public void load057( )
   {
      /* Using cursor T000519 */
      pr_default.execute(17, new Object[] {new Long(A46Tran_Id)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A416Tran_Observaciones = T000519_A416Tran_Observaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A416Tran_Observaciones", A416Tran_Observaciones);
         n416Tran_Observaciones = T000519_n416Tran_Observaciones[0] ;
         A55Tran_FechaRegistro = T000519_A55Tran_FechaRegistro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         A58Tran_Estado = T000519_A58Tran_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58Tran_Estado", A58Tran_Estado);
         n58Tran_Estado = T000519_n58Tran_Estado[0] ;
         A417Tran_UsuarioCodigo = T000519_A417Tran_UsuarioCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
         n417Tran_UsuarioCodigo = T000519_n417Tran_UsuarioCodigo[0] ;
         A418Tran_UsuarioNombre = T000519_A418Tran_UsuarioNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A418Tran_UsuarioNombre", A418Tran_UsuarioNombre);
         n418Tran_UsuarioNombre = T000519_n418Tran_UsuarioNombre[0] ;
         A419Tran_CentroCostoCodigo = T000519_A419Tran_CentroCostoCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
         n419Tran_CentroCostoCodigo = T000519_n419Tran_CentroCostoCodigo[0] ;
         A420Tran_CentroCostoDescripcion = T000519_A420Tran_CentroCostoDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
         n420Tran_CentroCostoDescripcion = T000519_n420Tran_CentroCostoDescripcion[0] ;
         A57Tran_RegionId = T000519_A57Tran_RegionId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57Tran_RegionId", GXutil.ltrim( GXutil.str( A57Tran_RegionId, 11, 0)));
         n57Tran_RegionId = T000519_n57Tran_RegionId[0] ;
         A421Tran_RegionCodigo = T000519_A421Tran_RegionCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
         n421Tran_RegionCodigo = T000519_n421Tran_RegionCodigo[0] ;
         A422Tran_RegionDescripcion = T000519_A422Tran_RegionDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
         n422Tran_RegionDescripcion = T000519_n422Tran_RegionDescripcion[0] ;
         A594Tran_RegionAbrev = T000519_A594Tran_RegionAbrev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A594Tran_RegionAbrev", A594Tran_RegionAbrev);
         n594Tran_RegionAbrev = T000519_n594Tran_RegionAbrev[0] ;
         A381Tran_DescripcionMovimiento = T000519_A381Tran_DescripcionMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
         n381Tran_DescripcionMovimiento = T000519_n381Tran_DescripcionMovimiento[0] ;
         A478Tran_IndAreadante = T000519_A478Tran_IndAreadante[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
         n478Tran_IndAreadante = T000519_n478Tran_IndAreadante[0] ;
         A481Tran_IndE_S = T000519_A481Tran_IndE_S[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A481Tran_IndE_S", A481Tran_IndE_S);
         n481Tran_IndE_S = T000519_n481Tran_IndE_S[0] ;
         A479Tran_IndCurso = T000519_A479Tran_IndCurso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479Tran_IndCurso", A479Tran_IndCurso);
         n479Tran_IndCurso = T000519_n479Tran_IndCurso[0] ;
         A482Tran_TipoElemento = T000519_A482Tran_TipoElemento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
         n482Tran_TipoElemento = T000519_n482Tran_TipoElemento[0] ;
         A707Tran_SolicitaCCDestino = T000519_A707Tran_SolicitaCCDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
         n707Tran_SolicitaCCDestino = T000519_n707Tran_SolicitaCCDestino[0] ;
         A708Tran_SolicitaRegionDestino = T000519_A708Tran_SolicitaRegionDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
         n708Tran_SolicitaRegionDestino = T000519_n708Tran_SolicitaRegionDestino[0] ;
         A754Tran_CuentaResponsabilidad = T000519_A754Tran_CuentaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
         n754Tran_CuentaResponsabilidad = T000519_n754Tran_CuentaResponsabilidad[0] ;
         A110Tran_ModuloOrigen = T000519_A110Tran_ModuloOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
         A109Tran_CodAlmaOrigen = T000519_A109Tran_CodAlmaOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109Tran_CodAlmaOrigen", A109Tran_CodAlmaOrigen);
         A112Tran_CodBodeOrigen = T000519_A112Tran_CodBodeOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112Tran_CodBodeOrigen", A112Tran_CodBodeOrigen);
         A384Tran_NombCuentadanteOrigen = T000519_A384Tran_NombCuentadanteOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
         n384Tran_NombCuentadanteOrigen = T000519_n384Tran_NombCuentadanteOrigen[0] ;
         A702Tran_CedulaCuentadanteOrigen = T000519_A702Tran_CedulaCuentadanteOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
         n702Tran_CedulaCuentadanteOrigen = T000519_n702Tran_CedulaCuentadanteOrigen[0] ;
         A714Tran_EmailCuentadanteOrigen = T000519_A714Tran_EmailCuentadanteOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A714Tran_EmailCuentadanteOrigen", A714Tran_EmailCuentadanteOrigen);
         n714Tran_EmailCuentadanteOrigen = T000519_n714Tran_EmailCuentadanteOrigen[0] ;
         A575Tran_NombreProveedor = T000519_A575Tran_NombreProveedor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
         n575Tran_NombreProveedor = T000519_n575Tran_NombreProveedor[0] ;
         A703Tran_CedulaProveedor = T000519_A703Tran_CedulaProveedor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
         n703Tran_CedulaProveedor = T000519_n703Tran_CedulaProveedor[0] ;
         A385Tran_ModuloDestino = T000519_A385Tran_ModuloDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
         A111Tran_CodAlmaDestino = T000519_A111Tran_CodAlmaDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111Tran_CodAlmaDestino", A111Tran_CodAlmaDestino);
         A387Tran_CodBodeDestino = T000519_A387Tran_CodBodeDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387Tran_CodBodeDestino", A387Tran_CodBodeDestino);
         A389Tran_NombCuentadanteDestino = T000519_A389Tran_NombCuentadanteDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
         n389Tran_NombCuentadanteDestino = T000519_n389Tran_NombCuentadanteDestino[0] ;
         A704Tran_CedulaCuentadanteDestino = T000519_A704Tran_CedulaCuentadanteDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
         n704Tran_CedulaCuentadanteDestino = T000519_n704Tran_CedulaCuentadanteDestino[0] ;
         A715Tran_EmailCuentadanteDestino = T000519_A715Tran_EmailCuentadanteDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A715Tran_EmailCuentadanteDestino", A715Tran_EmailCuentadanteDestino);
         n715Tran_EmailCuentadanteDestino = T000519_n715Tran_EmailCuentadanteDestino[0] ;
         A407Tran_AreadanteCodigo = T000519_A407Tran_AreadanteCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407Tran_AreadanteCodigo", A407Tran_AreadanteCodigo);
         n407Tran_AreadanteCodigo = T000519_n407Tran_AreadanteCodigo[0] ;
         A408Tran_CursoCodigo = T000519_A408Tran_CursoCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A408Tran_CursoCodigo", A408Tran_CursoCodigo);
         n408Tran_CursoCodigo = T000519_n408Tran_CursoCodigo[0] ;
         A483Tran_ValorTransaccion = T000519_A483Tran_ValorTransaccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( A483Tran_ValorTransaccion, 18, 2)));
         n483Tran_ValorTransaccion = T000519_n483Tran_ValorTransaccion[0] ;
         A498Tran_NumeroLineas = T000519_A498Tran_NumeroLineas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A498Tran_NumeroLineas", GXutil.ltrim( GXutil.str( A498Tran_NumeroLineas, 18, 0)));
         n498Tran_NumeroLineas = T000519_n498Tran_NumeroLineas[0] ;
         A390Tran_FechaRatificacion = T000519_A390Tran_FechaRatificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A390Tran_FechaRatificacion", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHARATIFICACION", getSecureSignedToken( "", localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
         n390Tran_FechaRatificacion = T000519_n390Tran_FechaRatificacion[0] ;
         A391Tran_UsuarioRatifica = T000519_A391Tran_UsuarioRatifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A391Tran_UsuarioRatifica", A391Tran_UsuarioRatifica);
         n391Tran_UsuarioRatifica = T000519_n391Tran_UsuarioRatifica[0] ;
         A513Tran_ConsecutivoCC = T000519_A513Tran_ConsecutivoCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
         n513Tran_ConsecutivoCC = T000519_n513Tran_ConsecutivoCC[0] ;
         A672Tran_NombreIngreso = T000519_A672Tran_NombreIngreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
         n672Tran_NombreIngreso = T000519_n672Tran_NombreIngreso[0] ;
         A756Tran_Abreviado = T000519_A756Tran_Abreviado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A756Tran_Abreviado", A756Tran_Abreviado);
         n756Tran_Abreviado = T000519_n756Tran_Abreviado[0] ;
         A514Tran_NumeroIngreso = T000519_A514Tran_NumeroIngreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A514Tran_NumeroIngreso", A514Tran_NumeroIngreso);
         n514Tran_NumeroIngreso = T000519_n514Tran_NumeroIngreso[0] ;
         A515Tran_FechaIngreso = T000519_A515Tran_FechaIngreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
         n515Tran_FechaIngreso = T000519_n515Tran_FechaIngreso[0] ;
         A516Tran_CentroCostoCodigoDestino = T000519_A516Tran_CentroCostoCodigoDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A516Tran_CentroCostoCodigoDestino", A516Tran_CentroCostoCodigoDestino);
         n516Tran_CentroCostoCodigoDestino = T000519_n516Tran_CentroCostoCodigoDestino[0] ;
         A517Tran_CentroCostoDescripcionDes = T000519_A517Tran_CentroCostoDescripcionDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A517Tran_CentroCostoDescripcionDes", A517Tran_CentroCostoDescripcionDes);
         n517Tran_CentroCostoDescripcionDes = T000519_n517Tran_CentroCostoDescripcionDes[0] ;
         A518Tran_RegionIdDestino = T000519_A518Tran_RegionIdDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A518Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( A518Tran_RegionIdDestino, 11, 0)));
         n518Tran_RegionIdDestino = T000519_n518Tran_RegionIdDestino[0] ;
         A519Tran_RegionCodigoDestino = T000519_A519Tran_RegionCodigoDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A519Tran_RegionCodigoDestino", GXutil.ltrim( GXutil.str( A519Tran_RegionCodigoDestino, 4, 0)));
         n519Tran_RegionCodigoDestino = T000519_n519Tran_RegionCodigoDestino[0] ;
         A520Tran_RegionDescripcionDestino = T000519_A520Tran_RegionDescripcionDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A520Tran_RegionDescripcionDestino", A520Tran_RegionDescripcionDestino);
         n520Tran_RegionDescripcionDestino = T000519_n520Tran_RegionDescripcionDestino[0] ;
         A608Tran_RegionAbrevDestino = T000519_A608Tran_RegionAbrevDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A608Tran_RegionAbrevDestino", A608Tran_RegionAbrevDestino);
         n608Tran_RegionAbrevDestino = T000519_n608Tran_RegionAbrevDestino[0] ;
         A524Tran_Detalle = T000519_A524Tran_Detalle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A524Tran_Detalle", A524Tran_Detalle);
         n524Tran_Detalle = T000519_n524Tran_Detalle[0] ;
         A527Tran_TipoEntra = T000519_A527Tran_TipoEntra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
         n527Tran_TipoEntra = T000519_n527Tran_TipoEntra[0] ;
         A568Tran_CantidadPadres = T000519_A568Tran_CantidadPadres[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A568Tran_CantidadPadres", GXutil.ltrim( GXutil.str( A568Tran_CantidadPadres, 8, 0)));
         n568Tran_CantidadPadres = T000519_n568Tran_CantidadPadres[0] ;
         A667Tran_NumeroGrupo = T000519_A667Tran_NumeroGrupo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A667Tran_NumeroGrupo", GXutil.ltrim( GXutil.str( A667Tran_NumeroGrupo, 4, 0)));
         n667Tran_NumeroGrupo = T000519_n667Tran_NumeroGrupo[0] ;
         A668Tran_UsuarioEliminaoAnula = T000519_A668Tran_UsuarioEliminaoAnula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A668Tran_UsuarioEliminaoAnula", A668Tran_UsuarioEliminaoAnula);
         n668Tran_UsuarioEliminaoAnula = T000519_n668Tran_UsuarioEliminaoAnula[0] ;
         A669Tran_FechaEliminaoAnula = T000519_A669Tran_FechaEliminaoAnula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669Tran_FechaEliminaoAnula", localUtil.ttoc( A669Tran_FechaEliminaoAnula, 8, 5, 0, 3, "/", ":", " "));
         n669Tran_FechaEliminaoAnula = T000519_n669Tran_FechaEliminaoAnula[0] ;
         A670Tran_ObservacionesAnula = T000519_A670Tran_ObservacionesAnula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A670Tran_ObservacionesAnula", A670Tran_ObservacionesAnula);
         n670Tran_ObservacionesAnula = T000519_n670Tran_ObservacionesAnula[0] ;
         A759Tran_CedulaResponsabilidad = T000519_A759Tran_CedulaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
         n759Tran_CedulaResponsabilidad = T000519_n759Tran_CedulaResponsabilidad[0] ;
         A721Tran_NombreCuentadanteResponsa = T000519_A721Tran_NombreCuentadanteResponsa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
         n721Tran_NombreCuentadanteResponsa = T000519_n721Tran_NombreCuentadanteResponsa[0] ;
         A719Tran_TransaccResponsabilidad = T000519_A719Tran_TransaccResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( A719Tran_TransaccResponsabilidad, 11, 0)));
         n719Tran_TransaccResponsabilidad = T000519_n719Tran_TransaccResponsabilidad[0] ;
         A720Tran_FechaResponsabilidad = T000519_A720Tran_FechaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A720Tran_FechaResponsabilidad", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
         n720Tran_FechaResponsabilidad = T000519_n720Tran_FechaResponsabilidad[0] ;
         A758Tran_TablaResponsabilidad = T000519_A758Tran_TablaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758Tran_TablaResponsabilidad", GXutil.ltrim( GXutil.str( A758Tran_TablaResponsabilidad, 4, 0)));
         n758Tran_TablaResponsabilidad = T000519_n758Tran_TablaResponsabilidad[0] ;
         A859Tran_EntidadGobierno = T000519_A859Tran_EntidadGobierno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859Tran_EntidadGobierno", A859Tran_EntidadGobierno);
         n859Tran_EntidadGobierno = T000519_n859Tran_EntidadGobierno[0] ;
         A47Tran_UsuarioId = T000519_A47Tran_UsuarioId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47Tran_UsuarioId", GXutil.ltrim( GXutil.str( A47Tran_UsuarioId, 18, 0)));
         n47Tran_UsuarioId = T000519_n47Tran_UsuarioId[0] ;
         A48Tran_CentroCostoId = T000519_A48Tran_CentroCostoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
         A50Tran_CentroCostoIdDestino = T000519_A50Tran_CentroCostoIdDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( A50Tran_CentroCostoIdDestino, 11, 0)));
         n50Tran_CentroCostoIdDestino = T000519_n50Tran_CentroCostoIdDestino[0] ;
         A49Tran_CodigoMovimiento = T000519_A49Tran_CodigoMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
         A51Tran_IdCuentadanteOrigen = T000519_A51Tran_IdCuentadanteOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( A51Tran_IdCuentadanteOrigen, 18, 0)));
         n51Tran_IdCuentadanteOrigen = T000519_n51Tran_IdCuentadanteOrigen[0] ;
         A53Tran_IdProveedor = T000519_A53Tran_IdProveedor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53Tran_IdProveedor", GXutil.ltrim( GXutil.str( A53Tran_IdProveedor, 18, 0)));
         n53Tran_IdProveedor = T000519_n53Tran_IdProveedor[0] ;
         A52Tran_IdCuentadanteDestino = T000519_A52Tran_IdCuentadanteDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( A52Tran_IdCuentadanteDestino, 18, 0)));
         n52Tran_IdCuentadanteDestino = T000519_n52Tran_IdCuentadanteDestino[0] ;
         A56Tran_IdCuentadanteResponsabili = T000519_A56Tran_IdCuentadanteResponsabili[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56Tran_IdCuentadanteResponsabili", GXutil.ltrim( GXutil.str( A56Tran_IdCuentadanteResponsabili, 18, 0)));
         n56Tran_IdCuentadanteResponsabili = T000519_n56Tran_IdCuentadanteResponsabili[0] ;
         A54Tran_TipoIngreso = T000519_A54Tran_TipoIngreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
         n54Tran_TipoIngreso = T000519_n54Tran_TipoIngreso[0] ;
         A499Tran_CodTipoElemento = T000519_A499Tran_CodTipoElemento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A499Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( A499Tran_CodTipoElemento, 18, 0)));
         n499Tran_CodTipoElemento = T000519_n499Tran_CodTipoElemento[0] ;
         zm057( -49) ;
      }
      pr_default.close(17);
      onLoadActions057( ) ;
   }

   public void onLoadActions057( )
   {
      AV47Pgmname = "ALM_TRANSACCION" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
      /* Using cursor T000518 */
      pr_default.execute(16, new Object[] {new Boolean(n499Tran_CodTipoElemento), new Long(A499Tran_CodTipoElemento)});
      A482Tran_TipoElemento = T000518_A482Tran_TipoElemento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
      n482Tran_TipoElemento = T000518_n482Tran_TipoElemento[0] ;
      pr_default.close(16);
   }

   public void checkExtendedTable057( )
   {
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      AV47Pgmname = "ALM_TRANSACCION" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
      /* Using cursor T00057 */
      pr_default.execute(5, new Object[] {new Boolean(n47Tran_UsuarioId), new Long(A47Tran_UsuarioId)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (0==A47Tran_UsuarioId) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Usuario Transaccion'.", "ForeignKeyNotFound", 1, "TRAN_USUARIOID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_UsuarioId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A417Tran_UsuarioCodigo = T00057_A417Tran_UsuarioCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
      n417Tran_UsuarioCodigo = T00057_n417Tran_UsuarioCodigo[0] ;
      A418Tran_UsuarioNombre = T00057_A418Tran_UsuarioNombre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A418Tran_UsuarioNombre", A418Tran_UsuarioNombre);
      n418Tran_UsuarioNombre = T00057_n418Tran_UsuarioNombre[0] ;
      pr_default.close(5);
      /* Using cursor T00058 */
      pr_default.execute(6, new Object[] {new Long(A48Tran_CentroCostoId)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Centro Costo Transaccion'.", "ForeignKeyNotFound", 1, "TRAN_CENTROCOSTOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_CentroCostoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A419Tran_CentroCostoCodigo = T00058_A419Tran_CentroCostoCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
      n419Tran_CentroCostoCodigo = T00058_n419Tran_CentroCostoCodigo[0] ;
      A420Tran_CentroCostoDescripcion = T00058_A420Tran_CentroCostoDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
      n420Tran_CentroCostoDescripcion = T00058_n420Tran_CentroCostoDescripcion[0] ;
      A57Tran_RegionId = T00058_A57Tran_RegionId[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A57Tran_RegionId", GXutil.ltrim( GXutil.str( A57Tran_RegionId, 11, 0)));
      n57Tran_RegionId = T00058_n57Tran_RegionId[0] ;
      pr_default.close(6);
      /* Using cursor T000510 */
      pr_default.execute(8, new Object[] {new Boolean(n57Tran_RegionId), new Long(A57Tran_RegionId)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (0==A57Tran_RegionId) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Centro Costo Transaccion'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A421Tran_RegionCodigo = T000510_A421Tran_RegionCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
      n421Tran_RegionCodigo = T000510_n421Tran_RegionCodigo[0] ;
      A422Tran_RegionDescripcion = T000510_A422Tran_RegionDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
      n422Tran_RegionDescripcion = T000510_n422Tran_RegionDescripcion[0] ;
      A594Tran_RegionAbrev = T000510_A594Tran_RegionAbrev[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A594Tran_RegionAbrev", A594Tran_RegionAbrev);
      n594Tran_RegionAbrev = T000510_n594Tran_RegionAbrev[0] ;
      pr_default.close(8);
      /* Using cursor T000512 */
      pr_default.execute(10, new Object[] {A49Tran_CodigoMovimiento});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo Movimiento Trn'.", "ForeignKeyNotFound", 1, "TRAN_CODIGOMOVIMIENTO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_CodigoMovimiento_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A381Tran_DescripcionMovimiento = T000512_A381Tran_DescripcionMovimiento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
      n381Tran_DescripcionMovimiento = T000512_n381Tran_DescripcionMovimiento[0] ;
      A478Tran_IndAreadante = T000512_A478Tran_IndAreadante[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
      n478Tran_IndAreadante = T000512_n478Tran_IndAreadante[0] ;
      A481Tran_IndE_S = T000512_A481Tran_IndE_S[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A481Tran_IndE_S", A481Tran_IndE_S);
      n481Tran_IndE_S = T000512_n481Tran_IndE_S[0] ;
      A479Tran_IndCurso = T000512_A479Tran_IndCurso[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A479Tran_IndCurso", A479Tran_IndCurso);
      n479Tran_IndCurso = T000512_n479Tran_IndCurso[0] ;
      A707Tran_SolicitaCCDestino = T000512_A707Tran_SolicitaCCDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
      n707Tran_SolicitaCCDestino = T000512_n707Tran_SolicitaCCDestino[0] ;
      A708Tran_SolicitaRegionDestino = T000512_A708Tran_SolicitaRegionDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
      n708Tran_SolicitaRegionDestino = T000512_n708Tran_SolicitaRegionDestino[0] ;
      A754Tran_CuentaResponsabilidad = T000512_A754Tran_CuentaResponsabilidad[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
      n754Tran_CuentaResponsabilidad = T000512_n754Tran_CuentaResponsabilidad[0] ;
      A499Tran_CodTipoElemento = T000512_A499Tran_CodTipoElemento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A499Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( A499Tran_CodTipoElemento, 18, 0)));
      n499Tran_CodTipoElemento = T000512_n499Tran_CodTipoElemento[0] ;
      pr_default.close(10);
      if ( ( GXutil.strcmp(A514Tran_NumeroIngreso, "") == 0 ) && ( GXutil.strcmp(A481Tran_IndE_S, "E") == 0 ) )
      {
         httpContext.GX_msglist.addItem("Error, debe Ingresar el número del tipo de ingreso", 1, "TRAN_NUMEROINGRESO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_NumeroIngreso_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.dateCompare(A515Tran_FechaIngreso, GXutil.nullDate()) && ( GXutil.strcmp(A481Tran_IndE_S, "E") == 0 ) )
      {
         httpContext.GX_msglist.addItem("Error debe ingresar la fecha del tipo de ingreso", 1, "TRAN_FECHAINGRESO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_FechaIngreso_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T000518 */
      pr_default.execute(16, new Object[] {new Boolean(n499Tran_CodTipoElemento), new Long(A499Tran_CodTipoElemento)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo Movimiento Trn'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A482Tran_TipoElemento = T000518_A482Tran_TipoElemento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
      n482Tran_TipoElemento = T000518_n482Tran_TipoElemento[0] ;
      pr_default.close(16);
      if ( ( GXutil.strcmp(A482Tran_TipoElemento, "D") == 0 ) && ( GXutil.strcmp(A524Tran_Detalle, "M") == 0 ) && ( GXutil.strcmp(A481Tran_IndE_S, "E") == 0 ) && ( GXutil.strcmp(A527Tran_TipoEntra, "") == 0 ) )
      {
         httpContext.GX_msglist.addItem("Error debe seleccionar el tipo de cargue devolutivo", 1, "TRAN_DETALLE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Detalle_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( GXutil.strcmp(A482Tran_TipoElemento, "D") == 0 ) && ( GXutil.strcmp(A524Tran_Detalle, "M") == 0 ) && ( A568Tran_CantidadPadres == 0 ) && ( GXutil.strcmp(A481Tran_IndE_S, "E") == 0 ) && ( GXutil.strcmp(A527Tran_TipoEntra, "UEUP") == 0 ) )
      {
         httpContext.GX_msglist.addItem("Error debe ingresar la cantidad de registros padre que vienen en el archivo", 1, "TRAN_DETALLE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Detalle_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T000513 */
      pr_default.execute(11, new Object[] {new Boolean(n51Tran_IdCuentadanteOrigen), new Long(A51Tran_IdCuentadanteOrigen)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (0==A51Tran_IdCuentadanteOrigen) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Cuentadante Origen'.", "ForeignKeyNotFound", 1, "TRAN_IDCUENTADANTEORIGEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_IdCuentadanteOrigen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A384Tran_NombCuentadanteOrigen = T000513_A384Tran_NombCuentadanteOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
      n384Tran_NombCuentadanteOrigen = T000513_n384Tran_NombCuentadanteOrigen[0] ;
      A702Tran_CedulaCuentadanteOrigen = T000513_A702Tran_CedulaCuentadanteOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
      n702Tran_CedulaCuentadanteOrigen = T000513_n702Tran_CedulaCuentadanteOrigen[0] ;
      A714Tran_EmailCuentadanteOrigen = T000513_A714Tran_EmailCuentadanteOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A714Tran_EmailCuentadanteOrigen", A714Tran_EmailCuentadanteOrigen);
      n714Tran_EmailCuentadanteOrigen = T000513_n714Tran_EmailCuentadanteOrigen[0] ;
      pr_default.close(11);
      /* Using cursor T000514 */
      pr_default.execute(12, new Object[] {new Boolean(n53Tran_IdProveedor), new Long(A53Tran_IdProveedor)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (0==A53Tran_IdProveedor) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Proveedor'.", "ForeignKeyNotFound", 1, "TRAN_IDPROVEEDOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_IdProveedor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A575Tran_NombreProveedor = T000514_A575Tran_NombreProveedor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
      n575Tran_NombreProveedor = T000514_n575Tran_NombreProveedor[0] ;
      A703Tran_CedulaProveedor = T000514_A703Tran_CedulaProveedor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
      n703Tran_CedulaProveedor = T000514_n703Tran_CedulaProveedor[0] ;
      pr_default.close(12);
      /* Using cursor T000515 */
      pr_default.execute(13, new Object[] {new Boolean(n52Tran_IdCuentadanteDestino), new Long(A52Tran_IdCuentadanteDestino)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (0==A52Tran_IdCuentadanteDestino) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Cuentadante Destino'.", "ForeignKeyNotFound", 1, "TRAN_IDCUENTADANTEDESTINO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_IdCuentadanteDestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A389Tran_NombCuentadanteDestino = T000515_A389Tran_NombCuentadanteDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
      n389Tran_NombCuentadanteDestino = T000515_n389Tran_NombCuentadanteDestino[0] ;
      A704Tran_CedulaCuentadanteDestino = T000515_A704Tran_CedulaCuentadanteDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
      n704Tran_CedulaCuentadanteDestino = T000515_n704Tran_CedulaCuentadanteDestino[0] ;
      A715Tran_EmailCuentadanteDestino = T000515_A715Tran_EmailCuentadanteDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A715Tran_EmailCuentadanteDestino", A715Tran_EmailCuentadanteDestino);
      n715Tran_EmailCuentadanteDestino = T000515_n715Tran_EmailCuentadanteDestino[0] ;
      pr_default.close(13);
      /* Using cursor T000517 */
      pr_default.execute(15, new Object[] {new Boolean(n54Tran_TipoIngreso), new Long(A54Tran_TipoIngreso)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (0==A54Tran_TipoIngreso) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Tipo de Ingreso'.", "ForeignKeyNotFound", 1, "TRAN_TIPOINGRESO");
            AnyError = (short)(1) ;
            GX_FocusControl = cmbTran_TipoIngreso.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A672Tran_NombreIngreso = T000517_A672Tran_NombreIngreso[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
      n672Tran_NombreIngreso = T000517_n672Tran_NombreIngreso[0] ;
      A756Tran_Abreviado = T000517_A756Tran_Abreviado[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A756Tran_Abreviado", A756Tran_Abreviado);
      n756Tran_Abreviado = T000517_n756Tran_Abreviado[0] ;
      pr_default.close(15);
      /* Using cursor T00059 */
      pr_default.execute(7, new Object[] {new Boolean(n50Tran_CentroCostoIdDestino), new Long(A50Tran_CentroCostoIdDestino)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (0==A50Tran_CentroCostoIdDestino) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Centro Costo Destino Trn'.", "ForeignKeyNotFound", 1, "TRAN_CENTROCOSTOIDDESTINO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_CentroCostoIdDestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A516Tran_CentroCostoCodigoDestino = T00059_A516Tran_CentroCostoCodigoDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A516Tran_CentroCostoCodigoDestino", A516Tran_CentroCostoCodigoDestino);
      n516Tran_CentroCostoCodigoDestino = T00059_n516Tran_CentroCostoCodigoDestino[0] ;
      A517Tran_CentroCostoDescripcionDes = T00059_A517Tran_CentroCostoDescripcionDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A517Tran_CentroCostoDescripcionDes", A517Tran_CentroCostoDescripcionDes);
      n517Tran_CentroCostoDescripcionDes = T00059_n517Tran_CentroCostoDescripcionDes[0] ;
      A518Tran_RegionIdDestino = T00059_A518Tran_RegionIdDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A518Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( A518Tran_RegionIdDestino, 11, 0)));
      n518Tran_RegionIdDestino = T00059_n518Tran_RegionIdDestino[0] ;
      pr_default.close(7);
      /* Using cursor T000511 */
      pr_default.execute(9, new Object[] {new Boolean(n518Tran_RegionIdDestino), new Long(A518Tran_RegionIdDestino)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (0==A518Tran_RegionIdDestino) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Centro Costo Destino Trn'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A519Tran_RegionCodigoDestino = T000511_A519Tran_RegionCodigoDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A519Tran_RegionCodigoDestino", GXutil.ltrim( GXutil.str( A519Tran_RegionCodigoDestino, 4, 0)));
      n519Tran_RegionCodigoDestino = T000511_n519Tran_RegionCodigoDestino[0] ;
      A520Tran_RegionDescripcionDestino = T000511_A520Tran_RegionDescripcionDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A520Tran_RegionDescripcionDestino", A520Tran_RegionDescripcionDestino);
      n520Tran_RegionDescripcionDestino = T000511_n520Tran_RegionDescripcionDestino[0] ;
      A608Tran_RegionAbrevDestino = T000511_A608Tran_RegionAbrevDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A608Tran_RegionAbrevDestino", A608Tran_RegionAbrevDestino);
      n608Tran_RegionAbrevDestino = T000511_n608Tran_RegionAbrevDestino[0] ;
      pr_default.close(9);
      /* Using cursor T000516 */
      pr_default.execute(14, new Object[] {new Boolean(n56Tran_IdCuentadanteResponsabili), new Long(A56Tran_IdCuentadanteResponsabili)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (0==A56Tran_IdCuentadanteResponsabili) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Cuentadante Responsabilidad'.", "ForeignKeyNotFound", 1, "TRAN_IDCUENTADANTERESPONSABILI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_IdCuentadanteResponsabili_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A759Tran_CedulaResponsabilidad = T000516_A759Tran_CedulaResponsabilidad[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
      n759Tran_CedulaResponsabilidad = T000516_n759Tran_CedulaResponsabilidad[0] ;
      A721Tran_NombreCuentadanteResponsa = T000516_A721Tran_NombreCuentadanteResponsa[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
      n721Tran_NombreCuentadanteResponsa = T000516_n721Tran_NombreCuentadanteResponsa[0] ;
      pr_default.close(14);
   }

   public void closeExtendedTableCursors057( )
   {
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(8);
      pr_default.close(10);
      pr_default.close(16);
      pr_default.close(11);
      pr_default.close(12);
      pr_default.close(13);
      pr_default.close(15);
      pr_default.close(7);
      pr_default.close(9);
      pr_default.close(14);
   }

   public void enableDisable( )
   {
   }

   public void gxload_50( long A47Tran_UsuarioId )
   {
      /* Using cursor T000520 */
      pr_default.execute(18, new Object[] {new Boolean(n47Tran_UsuarioId), new Long(A47Tran_UsuarioId)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (0==A47Tran_UsuarioId) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Usuario Transaccion'.", "ForeignKeyNotFound", 1, "TRAN_USUARIOID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_UsuarioId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A417Tran_UsuarioCodigo = T000520_A417Tran_UsuarioCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
      n417Tran_UsuarioCodigo = T000520_n417Tran_UsuarioCodigo[0] ;
      A418Tran_UsuarioNombre = T000520_A418Tran_UsuarioNombre[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A418Tran_UsuarioNombre", A418Tran_UsuarioNombre);
      n418Tran_UsuarioNombre = T000520_n418Tran_UsuarioNombre[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A417Tran_UsuarioCodigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A418Tran_UsuarioNombre)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(18);
   }

   public void gxload_51( long A48Tran_CentroCostoId )
   {
      /* Using cursor T000521 */
      pr_default.execute(19, new Object[] {new Long(A48Tran_CentroCostoId)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Centro Costo Transaccion'.", "ForeignKeyNotFound", 1, "TRAN_CENTROCOSTOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_CentroCostoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A419Tran_CentroCostoCodigo = T000521_A419Tran_CentroCostoCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
      n419Tran_CentroCostoCodigo = T000521_n419Tran_CentroCostoCodigo[0] ;
      A420Tran_CentroCostoDescripcion = T000521_A420Tran_CentroCostoDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
      n420Tran_CentroCostoDescripcion = T000521_n420Tran_CentroCostoDescripcion[0] ;
      A57Tran_RegionId = T000521_A57Tran_RegionId[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A57Tran_RegionId", GXutil.ltrim( GXutil.str( A57Tran_RegionId, 11, 0)));
      n57Tran_RegionId = T000521_n57Tran_RegionId[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A419Tran_CentroCostoCodigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A420Tran_CentroCostoDescripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(19);
   }

   public void gxload_53( long A57Tran_RegionId )
   {
      /* Using cursor T000522 */
      pr_default.execute(20, new Object[] {new Boolean(n57Tran_RegionId), new Long(A57Tran_RegionId)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         if ( ! ( (0==A57Tran_RegionId) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Centro Costo Transaccion'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A421Tran_RegionCodigo = T000522_A421Tran_RegionCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
      n421Tran_RegionCodigo = T000522_n421Tran_RegionCodigo[0] ;
      A422Tran_RegionDescripcion = T000522_A422Tran_RegionDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
      n422Tran_RegionDescripcion = T000522_n422Tran_RegionDescripcion[0] ;
      A594Tran_RegionAbrev = T000522_A594Tran_RegionAbrev[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A594Tran_RegionAbrev", A594Tran_RegionAbrev);
      n594Tran_RegionAbrev = T000522_n594Tran_RegionAbrev[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A421Tran_RegionCodigo, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A422Tran_RegionDescripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A594Tran_RegionAbrev)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(20);
   }

   public void gxload_55( String A49Tran_CodigoMovimiento )
   {
      /* Using cursor T000523 */
      pr_default.execute(21, new Object[] {A49Tran_CodigoMovimiento});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo Movimiento Trn'.", "ForeignKeyNotFound", 1, "TRAN_CODIGOMOVIMIENTO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_CodigoMovimiento_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A381Tran_DescripcionMovimiento = T000523_A381Tran_DescripcionMovimiento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
      n381Tran_DescripcionMovimiento = T000523_n381Tran_DescripcionMovimiento[0] ;
      A478Tran_IndAreadante = T000523_A478Tran_IndAreadante[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
      n478Tran_IndAreadante = T000523_n478Tran_IndAreadante[0] ;
      A481Tran_IndE_S = T000523_A481Tran_IndE_S[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A481Tran_IndE_S", A481Tran_IndE_S);
      n481Tran_IndE_S = T000523_n481Tran_IndE_S[0] ;
      A479Tran_IndCurso = T000523_A479Tran_IndCurso[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A479Tran_IndCurso", A479Tran_IndCurso);
      n479Tran_IndCurso = T000523_n479Tran_IndCurso[0] ;
      A707Tran_SolicitaCCDestino = T000523_A707Tran_SolicitaCCDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
      n707Tran_SolicitaCCDestino = T000523_n707Tran_SolicitaCCDestino[0] ;
      A708Tran_SolicitaRegionDestino = T000523_A708Tran_SolicitaRegionDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
      n708Tran_SolicitaRegionDestino = T000523_n708Tran_SolicitaRegionDestino[0] ;
      A754Tran_CuentaResponsabilidad = T000523_A754Tran_CuentaResponsabilidad[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
      n754Tran_CuentaResponsabilidad = T000523_n754Tran_CuentaResponsabilidad[0] ;
      A499Tran_CodTipoElemento = T000523_A499Tran_CodTipoElemento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A499Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( A499Tran_CodTipoElemento, 18, 0)));
      n499Tran_CodTipoElemento = T000523_n499Tran_CodTipoElemento[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A381Tran_DescripcionMovimiento)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A478Tran_IndAreadante)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A481Tran_IndE_S)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A479Tran_IndCurso)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A707Tran_SolicitaCCDestino)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A708Tran_SolicitaRegionDestino)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A754Tran_CuentaResponsabilidad)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A499Tran_CodTipoElemento, (byte)(18), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(21);
   }

   public void gxload_61( long A499Tran_CodTipoElemento )
   {
      /* Using cursor T000524 */
      pr_default.execute(22, new Object[] {new Boolean(n499Tran_CodTipoElemento), new Long(A499Tran_CodTipoElemento)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo Movimiento Trn'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A482Tran_TipoElemento = T000524_A482Tran_TipoElemento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
      n482Tran_TipoElemento = T000524_n482Tran_TipoElemento[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A482Tran_TipoElemento))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(22);
   }

   public void gxload_56( long A51Tran_IdCuentadanteOrigen )
   {
      /* Using cursor T000525 */
      pr_default.execute(23, new Object[] {new Boolean(n51Tran_IdCuentadanteOrigen), new Long(A51Tran_IdCuentadanteOrigen)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         if ( ! ( (0==A51Tran_IdCuentadanteOrigen) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Cuentadante Origen'.", "ForeignKeyNotFound", 1, "TRAN_IDCUENTADANTEORIGEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_IdCuentadanteOrigen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A384Tran_NombCuentadanteOrigen = T000525_A384Tran_NombCuentadanteOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
      n384Tran_NombCuentadanteOrigen = T000525_n384Tran_NombCuentadanteOrigen[0] ;
      A702Tran_CedulaCuentadanteOrigen = T000525_A702Tran_CedulaCuentadanteOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
      n702Tran_CedulaCuentadanteOrigen = T000525_n702Tran_CedulaCuentadanteOrigen[0] ;
      A714Tran_EmailCuentadanteOrigen = T000525_A714Tran_EmailCuentadanteOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A714Tran_EmailCuentadanteOrigen", A714Tran_EmailCuentadanteOrigen);
      n714Tran_EmailCuentadanteOrigen = T000525_n714Tran_EmailCuentadanteOrigen[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A384Tran_NombCuentadanteOrigen)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A702Tran_CedulaCuentadanteOrigen, (byte)(18), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A714Tran_EmailCuentadanteOrigen)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(23);
   }

   public void gxload_57( long A53Tran_IdProveedor )
   {
      /* Using cursor T000526 */
      pr_default.execute(24, new Object[] {new Boolean(n53Tran_IdProveedor), new Long(A53Tran_IdProveedor)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (0==A53Tran_IdProveedor) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Proveedor'.", "ForeignKeyNotFound", 1, "TRAN_IDPROVEEDOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_IdProveedor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A575Tran_NombreProveedor = T000526_A575Tran_NombreProveedor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
      n575Tran_NombreProveedor = T000526_n575Tran_NombreProveedor[0] ;
      A703Tran_CedulaProveedor = T000526_A703Tran_CedulaProveedor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
      n703Tran_CedulaProveedor = T000526_n703Tran_CedulaProveedor[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A575Tran_NombreProveedor)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A703Tran_CedulaProveedor, (byte)(18), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(24);
   }

   public void gxload_58( long A52Tran_IdCuentadanteDestino )
   {
      /* Using cursor T000527 */
      pr_default.execute(25, new Object[] {new Boolean(n52Tran_IdCuentadanteDestino), new Long(A52Tran_IdCuentadanteDestino)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         if ( ! ( (0==A52Tran_IdCuentadanteDestino) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Cuentadante Destino'.", "ForeignKeyNotFound", 1, "TRAN_IDCUENTADANTEDESTINO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_IdCuentadanteDestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A389Tran_NombCuentadanteDestino = T000527_A389Tran_NombCuentadanteDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
      n389Tran_NombCuentadanteDestino = T000527_n389Tran_NombCuentadanteDestino[0] ;
      A704Tran_CedulaCuentadanteDestino = T000527_A704Tran_CedulaCuentadanteDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
      n704Tran_CedulaCuentadanteDestino = T000527_n704Tran_CedulaCuentadanteDestino[0] ;
      A715Tran_EmailCuentadanteDestino = T000527_A715Tran_EmailCuentadanteDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A715Tran_EmailCuentadanteDestino", A715Tran_EmailCuentadanteDestino);
      n715Tran_EmailCuentadanteDestino = T000527_n715Tran_EmailCuentadanteDestino[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A389Tran_NombCuentadanteDestino)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704Tran_CedulaCuentadanteDestino, (byte)(18), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A715Tran_EmailCuentadanteDestino)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(25);
   }

   public void gxload_60( long A54Tran_TipoIngreso )
   {
      /* Using cursor T000528 */
      pr_default.execute(26, new Object[] {new Boolean(n54Tran_TipoIngreso), new Long(A54Tran_TipoIngreso)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         if ( ! ( (0==A54Tran_TipoIngreso) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Tipo de Ingreso'.", "ForeignKeyNotFound", 1, "TRAN_TIPOINGRESO");
            AnyError = (short)(1) ;
            GX_FocusControl = cmbTran_TipoIngreso.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A672Tran_NombreIngreso = T000528_A672Tran_NombreIngreso[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
      n672Tran_NombreIngreso = T000528_n672Tran_NombreIngreso[0] ;
      A756Tran_Abreviado = T000528_A756Tran_Abreviado[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A756Tran_Abreviado", A756Tran_Abreviado);
      n756Tran_Abreviado = T000528_n756Tran_Abreviado[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A672Tran_NombreIngreso)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A756Tran_Abreviado)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(26);
   }

   public void gxload_52( long A50Tran_CentroCostoIdDestino )
   {
      /* Using cursor T000529 */
      pr_default.execute(27, new Object[] {new Boolean(n50Tran_CentroCostoIdDestino), new Long(A50Tran_CentroCostoIdDestino)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         if ( ! ( (0==A50Tran_CentroCostoIdDestino) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Centro Costo Destino Trn'.", "ForeignKeyNotFound", 1, "TRAN_CENTROCOSTOIDDESTINO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_CentroCostoIdDestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A516Tran_CentroCostoCodigoDestino = T000529_A516Tran_CentroCostoCodigoDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A516Tran_CentroCostoCodigoDestino", A516Tran_CentroCostoCodigoDestino);
      n516Tran_CentroCostoCodigoDestino = T000529_n516Tran_CentroCostoCodigoDestino[0] ;
      A517Tran_CentroCostoDescripcionDes = T000529_A517Tran_CentroCostoDescripcionDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A517Tran_CentroCostoDescripcionDes", A517Tran_CentroCostoDescripcionDes);
      n517Tran_CentroCostoDescripcionDes = T000529_n517Tran_CentroCostoDescripcionDes[0] ;
      A518Tran_RegionIdDestino = T000529_A518Tran_RegionIdDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A518Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( A518Tran_RegionIdDestino, 11, 0)));
      n518Tran_RegionIdDestino = T000529_n518Tran_RegionIdDestino[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A516Tran_CentroCostoCodigoDestino)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A517Tran_CentroCostoDescripcionDes)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A518Tran_RegionIdDestino, (byte)(11), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(27);
   }

   public void gxload_54( long A518Tran_RegionIdDestino )
   {
      /* Using cursor T000530 */
      pr_default.execute(28, new Object[] {new Boolean(n518Tran_RegionIdDestino), new Long(A518Tran_RegionIdDestino)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         if ( ! ( (0==A518Tran_RegionIdDestino) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Centro Costo Destino Trn'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A519Tran_RegionCodigoDestino = T000530_A519Tran_RegionCodigoDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A519Tran_RegionCodigoDestino", GXutil.ltrim( GXutil.str( A519Tran_RegionCodigoDestino, 4, 0)));
      n519Tran_RegionCodigoDestino = T000530_n519Tran_RegionCodigoDestino[0] ;
      A520Tran_RegionDescripcionDestino = T000530_A520Tran_RegionDescripcionDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A520Tran_RegionDescripcionDestino", A520Tran_RegionDescripcionDestino);
      n520Tran_RegionDescripcionDestino = T000530_n520Tran_RegionDescripcionDestino[0] ;
      A608Tran_RegionAbrevDestino = T000530_A608Tran_RegionAbrevDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A608Tran_RegionAbrevDestino", A608Tran_RegionAbrevDestino);
      n608Tran_RegionAbrevDestino = T000530_n608Tran_RegionAbrevDestino[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A519Tran_RegionCodigoDestino, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A520Tran_RegionDescripcionDestino)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A608Tran_RegionAbrevDestino)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(28);
   }

   public void gxload_59( long A56Tran_IdCuentadanteResponsabili )
   {
      /* Using cursor T000531 */
      pr_default.execute(29, new Object[] {new Boolean(n56Tran_IdCuentadanteResponsabili), new Long(A56Tran_IdCuentadanteResponsabili)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         if ( ! ( (0==A56Tran_IdCuentadanteResponsabili) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Cuentadante Responsabilidad'.", "ForeignKeyNotFound", 1, "TRAN_IDCUENTADANTERESPONSABILI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_IdCuentadanteResponsabili_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A759Tran_CedulaResponsabilidad = T000531_A759Tran_CedulaResponsabilidad[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
      n759Tran_CedulaResponsabilidad = T000531_n759Tran_CedulaResponsabilidad[0] ;
      A721Tran_NombreCuentadanteResponsa = T000531_A721Tran_NombreCuentadanteResponsa[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
      n721Tran_NombreCuentadanteResponsa = T000531_n721Tran_NombreCuentadanteResponsa[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A759Tran_CedulaResponsabilidad, (byte)(18), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A721Tran_NombreCuentadanteResponsa)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(29);
   }

   public void getKey057( )
   {
      /* Using cursor T000532 */
      pr_default.execute(30, new Object[] {new Long(A46Tran_Id)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(30);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00056 */
      pr_default.execute(4, new Object[] {new Long(A46Tran_Id)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm057( 49) ;
         RcdFound7 = (short)(1) ;
         A416Tran_Observaciones = T00056_A416Tran_Observaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A416Tran_Observaciones", A416Tran_Observaciones);
         n416Tran_Observaciones = T00056_n416Tran_Observaciones[0] ;
         A46Tran_Id = T00056_A46Tran_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
         A55Tran_FechaRegistro = T00056_A55Tran_FechaRegistro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         A58Tran_Estado = T00056_A58Tran_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58Tran_Estado", A58Tran_Estado);
         n58Tran_Estado = T00056_n58Tran_Estado[0] ;
         A110Tran_ModuloOrigen = T00056_A110Tran_ModuloOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
         A109Tran_CodAlmaOrigen = T00056_A109Tran_CodAlmaOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109Tran_CodAlmaOrigen", A109Tran_CodAlmaOrigen);
         A112Tran_CodBodeOrigen = T00056_A112Tran_CodBodeOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112Tran_CodBodeOrigen", A112Tran_CodBodeOrigen);
         A385Tran_ModuloDestino = T00056_A385Tran_ModuloDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
         A111Tran_CodAlmaDestino = T00056_A111Tran_CodAlmaDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A111Tran_CodAlmaDestino", A111Tran_CodAlmaDestino);
         A387Tran_CodBodeDestino = T00056_A387Tran_CodBodeDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387Tran_CodBodeDestino", A387Tran_CodBodeDestino);
         A407Tran_AreadanteCodigo = T00056_A407Tran_AreadanteCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407Tran_AreadanteCodigo", A407Tran_AreadanteCodigo);
         n407Tran_AreadanteCodigo = T00056_n407Tran_AreadanteCodigo[0] ;
         A408Tran_CursoCodigo = T00056_A408Tran_CursoCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A408Tran_CursoCodigo", A408Tran_CursoCodigo);
         n408Tran_CursoCodigo = T00056_n408Tran_CursoCodigo[0] ;
         A483Tran_ValorTransaccion = T00056_A483Tran_ValorTransaccion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( A483Tran_ValorTransaccion, 18, 2)));
         n483Tran_ValorTransaccion = T00056_n483Tran_ValorTransaccion[0] ;
         A498Tran_NumeroLineas = T00056_A498Tran_NumeroLineas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A498Tran_NumeroLineas", GXutil.ltrim( GXutil.str( A498Tran_NumeroLineas, 18, 0)));
         n498Tran_NumeroLineas = T00056_n498Tran_NumeroLineas[0] ;
         A390Tran_FechaRatificacion = T00056_A390Tran_FechaRatificacion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A390Tran_FechaRatificacion", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHARATIFICACION", getSecureSignedToken( "", localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
         n390Tran_FechaRatificacion = T00056_n390Tran_FechaRatificacion[0] ;
         A391Tran_UsuarioRatifica = T00056_A391Tran_UsuarioRatifica[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A391Tran_UsuarioRatifica", A391Tran_UsuarioRatifica);
         n391Tran_UsuarioRatifica = T00056_n391Tran_UsuarioRatifica[0] ;
         A513Tran_ConsecutivoCC = T00056_A513Tran_ConsecutivoCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
         n513Tran_ConsecutivoCC = T00056_n513Tran_ConsecutivoCC[0] ;
         A514Tran_NumeroIngreso = T00056_A514Tran_NumeroIngreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A514Tran_NumeroIngreso", A514Tran_NumeroIngreso);
         n514Tran_NumeroIngreso = T00056_n514Tran_NumeroIngreso[0] ;
         A515Tran_FechaIngreso = T00056_A515Tran_FechaIngreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
         n515Tran_FechaIngreso = T00056_n515Tran_FechaIngreso[0] ;
         A524Tran_Detalle = T00056_A524Tran_Detalle[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A524Tran_Detalle", A524Tran_Detalle);
         n524Tran_Detalle = T00056_n524Tran_Detalle[0] ;
         A527Tran_TipoEntra = T00056_A527Tran_TipoEntra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
         n527Tran_TipoEntra = T00056_n527Tran_TipoEntra[0] ;
         A568Tran_CantidadPadres = T00056_A568Tran_CantidadPadres[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A568Tran_CantidadPadres", GXutil.ltrim( GXutil.str( A568Tran_CantidadPadres, 8, 0)));
         n568Tran_CantidadPadres = T00056_n568Tran_CantidadPadres[0] ;
         A667Tran_NumeroGrupo = T00056_A667Tran_NumeroGrupo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A667Tran_NumeroGrupo", GXutil.ltrim( GXutil.str( A667Tran_NumeroGrupo, 4, 0)));
         n667Tran_NumeroGrupo = T00056_n667Tran_NumeroGrupo[0] ;
         A668Tran_UsuarioEliminaoAnula = T00056_A668Tran_UsuarioEliminaoAnula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A668Tran_UsuarioEliminaoAnula", A668Tran_UsuarioEliminaoAnula);
         n668Tran_UsuarioEliminaoAnula = T00056_n668Tran_UsuarioEliminaoAnula[0] ;
         A669Tran_FechaEliminaoAnula = T00056_A669Tran_FechaEliminaoAnula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669Tran_FechaEliminaoAnula", localUtil.ttoc( A669Tran_FechaEliminaoAnula, 8, 5, 0, 3, "/", ":", " "));
         n669Tran_FechaEliminaoAnula = T00056_n669Tran_FechaEliminaoAnula[0] ;
         A670Tran_ObservacionesAnula = T00056_A670Tran_ObservacionesAnula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A670Tran_ObservacionesAnula", A670Tran_ObservacionesAnula);
         n670Tran_ObservacionesAnula = T00056_n670Tran_ObservacionesAnula[0] ;
         A719Tran_TransaccResponsabilidad = T00056_A719Tran_TransaccResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( A719Tran_TransaccResponsabilidad, 11, 0)));
         n719Tran_TransaccResponsabilidad = T00056_n719Tran_TransaccResponsabilidad[0] ;
         A720Tran_FechaResponsabilidad = T00056_A720Tran_FechaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A720Tran_FechaResponsabilidad", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
         n720Tran_FechaResponsabilidad = T00056_n720Tran_FechaResponsabilidad[0] ;
         A758Tran_TablaResponsabilidad = T00056_A758Tran_TablaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758Tran_TablaResponsabilidad", GXutil.ltrim( GXutil.str( A758Tran_TablaResponsabilidad, 4, 0)));
         n758Tran_TablaResponsabilidad = T00056_n758Tran_TablaResponsabilidad[0] ;
         A859Tran_EntidadGobierno = T00056_A859Tran_EntidadGobierno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859Tran_EntidadGobierno", A859Tran_EntidadGobierno);
         n859Tran_EntidadGobierno = T00056_n859Tran_EntidadGobierno[0] ;
         A47Tran_UsuarioId = T00056_A47Tran_UsuarioId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47Tran_UsuarioId", GXutil.ltrim( GXutil.str( A47Tran_UsuarioId, 18, 0)));
         n47Tran_UsuarioId = T00056_n47Tran_UsuarioId[0] ;
         A48Tran_CentroCostoId = T00056_A48Tran_CentroCostoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
         A50Tran_CentroCostoIdDestino = T00056_A50Tran_CentroCostoIdDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( A50Tran_CentroCostoIdDestino, 11, 0)));
         n50Tran_CentroCostoIdDestino = T00056_n50Tran_CentroCostoIdDestino[0] ;
         A49Tran_CodigoMovimiento = T00056_A49Tran_CodigoMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
         A51Tran_IdCuentadanteOrigen = T00056_A51Tran_IdCuentadanteOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A51Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( A51Tran_IdCuentadanteOrigen, 18, 0)));
         n51Tran_IdCuentadanteOrigen = T00056_n51Tran_IdCuentadanteOrigen[0] ;
         A53Tran_IdProveedor = T00056_A53Tran_IdProveedor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53Tran_IdProveedor", GXutil.ltrim( GXutil.str( A53Tran_IdProveedor, 18, 0)));
         n53Tran_IdProveedor = T00056_n53Tran_IdProveedor[0] ;
         A52Tran_IdCuentadanteDestino = T00056_A52Tran_IdCuentadanteDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( A52Tran_IdCuentadanteDestino, 18, 0)));
         n52Tran_IdCuentadanteDestino = T00056_n52Tran_IdCuentadanteDestino[0] ;
         A56Tran_IdCuentadanteResponsabili = T00056_A56Tran_IdCuentadanteResponsabili[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56Tran_IdCuentadanteResponsabili", GXutil.ltrim( GXutil.str( A56Tran_IdCuentadanteResponsabili, 18, 0)));
         n56Tran_IdCuentadanteResponsabili = T00056_n56Tran_IdCuentadanteResponsabili[0] ;
         A54Tran_TipoIngreso = T00056_A54Tran_TipoIngreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
         n54Tran_TipoIngreso = T00056_n54Tran_TipoIngreso[0] ;
         Z46Tran_Id = A46Tran_Id ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load057( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKey057( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKey057( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey057( ) ;
      if ( RcdFound7 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T000533 */
      pr_default.execute(31, new Object[] {new Long(A46Tran_Id)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         while ( (pr_default.getStatus(31) != 101) && ( ( T000533_A46Tran_Id[0] < A46Tran_Id ) ) )
         {
            pr_default.readNext(31);
         }
         if ( (pr_default.getStatus(31) != 101) && ( ( T000533_A46Tran_Id[0] > A46Tran_Id ) ) )
         {
            A46Tran_Id = T000533_A46Tran_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(31);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T000534 */
      pr_default.execute(32, new Object[] {new Long(A46Tran_Id)});
      if ( (pr_default.getStatus(32) != 101) )
      {
         while ( (pr_default.getStatus(32) != 101) && ( ( T000534_A46Tran_Id[0] > A46Tran_Id ) ) )
         {
            pr_default.readNext(32);
         }
         if ( (pr_default.getStatus(32) != 101) && ( ( T000534_A46Tran_Id[0] < A46Tran_Id ) ) )
         {
            A46Tran_Id = T000534_A46Tran_Id[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(32);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey057( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTran_UsuarioId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert057( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( A46Tran_Id != Z46Tran_Id )
            {
               A46Tran_Id = Z46Tran_Id ;
               httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TRAN_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTran_Id_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTran_UsuarioId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update057( ) ;
               GX_FocusControl = edtTran_UsuarioId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A46Tran_Id != Z46Tran_Id )
            {
               /* Insert record */
               GX_FocusControl = edtTran_UsuarioId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert057( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TRAN_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTran_Id_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTran_UsuarioId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert057( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( A46Tran_Id != Z46Tran_Id )
      {
         A46Tran_Id = Z46Tran_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TRAN_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Id_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTran_UsuarioId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency057( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00055 */
         pr_default.execute(3, new Object[] {new Long(A46Tran_Id)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TRANSACCION"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || !( GXutil.dateCompare(Z55Tran_FechaRegistro, T00055_A55Tran_FechaRegistro[0]) ) || ( GXutil.strcmp(Z58Tran_Estado, T00055_A58Tran_Estado[0]) != 0 ) || ( GXutil.strcmp(Z110Tran_ModuloOrigen, T00055_A110Tran_ModuloOrigen[0]) != 0 ) || ( GXutil.strcmp(Z109Tran_CodAlmaOrigen, T00055_A109Tran_CodAlmaOrigen[0]) != 0 ) || ( GXutil.strcmp(Z112Tran_CodBodeOrigen, T00055_A112Tran_CodBodeOrigen[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z385Tran_ModuloDestino, T00055_A385Tran_ModuloDestino[0]) != 0 ) || ( GXutil.strcmp(Z111Tran_CodAlmaDestino, T00055_A111Tran_CodAlmaDestino[0]) != 0 ) || ( GXutil.strcmp(Z387Tran_CodBodeDestino, T00055_A387Tran_CodBodeDestino[0]) != 0 ) || ( GXutil.strcmp(Z407Tran_AreadanteCodigo, T00055_A407Tran_AreadanteCodigo[0]) != 0 ) || ( GXutil.strcmp(Z408Tran_CursoCodigo, T00055_A408Tran_CursoCodigo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z483Tran_ValorTransaccion, T00055_A483Tran_ValorTransaccion[0]) != 0 ) || ( Z498Tran_NumeroLineas != T00055_A498Tran_NumeroLineas[0] ) || !( GXutil.dateCompare(Z390Tran_FechaRatificacion, T00055_A390Tran_FechaRatificacion[0]) ) || ( GXutil.strcmp(Z391Tran_UsuarioRatifica, T00055_A391Tran_UsuarioRatifica[0]) != 0 ) || ( Z513Tran_ConsecutivoCC != T00055_A513Tran_ConsecutivoCC[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z514Tran_NumeroIngreso, T00055_A514Tran_NumeroIngreso[0]) != 0 ) || !( GXutil.dateCompare(Z515Tran_FechaIngreso, T00055_A515Tran_FechaIngreso[0]) ) || ( GXutil.strcmp(Z524Tran_Detalle, T00055_A524Tran_Detalle[0]) != 0 ) || ( GXutil.strcmp(Z527Tran_TipoEntra, T00055_A527Tran_TipoEntra[0]) != 0 ) || ( Z568Tran_CantidadPadres != T00055_A568Tran_CantidadPadres[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z667Tran_NumeroGrupo != T00055_A667Tran_NumeroGrupo[0] ) || ( GXutil.strcmp(Z668Tran_UsuarioEliminaoAnula, T00055_A668Tran_UsuarioEliminaoAnula[0]) != 0 ) || !( GXutil.dateCompare(Z669Tran_FechaEliminaoAnula, T00055_A669Tran_FechaEliminaoAnula[0]) ) || ( GXutil.strcmp(Z670Tran_ObservacionesAnula, T00055_A670Tran_ObservacionesAnula[0]) != 0 ) || ( Z719Tran_TransaccResponsabilidad != T00055_A719Tran_TransaccResponsabilidad[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z720Tran_FechaResponsabilidad, T00055_A720Tran_FechaResponsabilidad[0]) ) || ( Z758Tran_TablaResponsabilidad != T00055_A758Tran_TablaResponsabilidad[0] ) || ( GXutil.strcmp(Z859Tran_EntidadGobierno, T00055_A859Tran_EntidadGobierno[0]) != 0 ) || ( Z47Tran_UsuarioId != T00055_A47Tran_UsuarioId[0] ) || ( Z48Tran_CentroCostoId != T00055_A48Tran_CentroCostoId[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z50Tran_CentroCostoIdDestino != T00055_A50Tran_CentroCostoIdDestino[0] ) || ( GXutil.strcmp(Z49Tran_CodigoMovimiento, T00055_A49Tran_CodigoMovimiento[0]) != 0 ) || ( Z51Tran_IdCuentadanteOrigen != T00055_A51Tran_IdCuentadanteOrigen[0] ) || ( Z53Tran_IdProveedor != T00055_A53Tran_IdProveedor[0] ) || ( Z52Tran_IdCuentadanteDestino != T00055_A52Tran_IdCuentadanteDestino[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z56Tran_IdCuentadanteResponsabili != T00055_A56Tran_IdCuentadanteResponsabili[0] ) || ( Z54Tran_TipoIngreso != T00055_A54Tran_TipoIngreso[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_TRANSACCION"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert057( )
   {
      beforeValidate057( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable057( ) ;
      }
      if ( AnyError == 0 )
      {
         zm057( 0) ;
         checkOptimisticConcurrency057( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm057( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert057( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000535 */
                  pr_default.execute(33, new Object[] {new Boolean(n57Tran_RegionId), new Long(A57Tran_RegionId), new Boolean(n481Tran_IndE_S), A481Tran_IndE_S, new Boolean(n482Tran_TipoElemento), A482Tran_TipoElemento, new Boolean(n518Tran_RegionIdDestino), new Long(A518Tran_RegionIdDestino), A55Tran_FechaRegistro, new Boolean(n58Tran_Estado), A58Tran_Estado, A110Tran_ModuloOrigen, A109Tran_CodAlmaOrigen, A112Tran_CodBodeOrigen, A385Tran_ModuloDestino, A111Tran_CodAlmaDestino, A387Tran_CodBodeDestino, new Boolean(n416Tran_Observaciones), A416Tran_Observaciones, new Boolean(n407Tran_AreadanteCodigo), A407Tran_AreadanteCodigo, new Boolean(n408Tran_CursoCodigo), A408Tran_CursoCodigo, new Boolean(n483Tran_ValorTransaccion), A483Tran_ValorTransaccion, new Boolean(n498Tran_NumeroLineas), new Long(A498Tran_NumeroLineas), new Boolean(n390Tran_FechaRatificacion), A390Tran_FechaRatificacion, new Boolean(n391Tran_UsuarioRatifica), A391Tran_UsuarioRatifica, new Boolean(n513Tran_ConsecutivoCC), new Long(A513Tran_ConsecutivoCC), new Boolean(n514Tran_NumeroIngreso), A514Tran_NumeroIngreso, new Boolean(n515Tran_FechaIngreso), A515Tran_FechaIngreso, new Boolean(n524Tran_Detalle), A524Tran_Detalle, new Boolean(n527Tran_TipoEntra), A527Tran_TipoEntra, new Boolean(n568Tran_CantidadPadres), new Integer(A568Tran_CantidadPadres), new Boolean(n667Tran_NumeroGrupo), new Short(A667Tran_NumeroGrupo), new Boolean(n668Tran_UsuarioEliminaoAnula), A668Tran_UsuarioEliminaoAnula, new Boolean(n669Tran_FechaEliminaoAnula), A669Tran_FechaEliminaoAnula, new Boolean(n670Tran_ObservacionesAnula), A670Tran_ObservacionesAnula, new Boolean(n719Tran_TransaccResponsabilidad), new Long(A719Tran_TransaccResponsabilidad), new Boolean(n720Tran_FechaResponsabilidad), A720Tran_FechaResponsabilidad, new Boolean(n758Tran_TablaResponsabilidad), new Short(A758Tran_TablaResponsabilidad), new Boolean(n859Tran_EntidadGobierno), A859Tran_EntidadGobierno, new Boolean(n47Tran_UsuarioId), new Long(A47Tran_UsuarioId), new Long(A48Tran_CentroCostoId), new Boolean(n50Tran_CentroCostoIdDestino), new Long(A50Tran_CentroCostoIdDestino), A49Tran_CodigoMovimiento, new Boolean(n51Tran_IdCuentadanteOrigen), new Long(A51Tran_IdCuentadanteOrigen), new Boolean(n53Tran_IdProveedor), new Long(A53Tran_IdProveedor), new Boolean(n52Tran_IdCuentadanteDestino), new Long(A52Tran_IdCuentadanteDestino), new Boolean(n56Tran_IdCuentadanteResponsabili), new Long(A56Tran_IdCuentadanteResponsabili), new Boolean(n54Tran_TipoIngreso), new Long(A54Tran_TipoIngreso)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000536 */
                  pr_default.execute(34);
                  A46Tran_Id = T000536_A46Tran_Id[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
                  pr_default.close(34);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel057( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption050( ) ;
                        }
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load057( ) ;
         }
         endLevel057( ) ;
      }
      closeExtendedTableCursors057( ) ;
   }

   public void update057( )
   {
      beforeValidate057( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable057( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency057( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm057( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate057( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000537 */
                  pr_default.execute(35, new Object[] {new Boolean(n57Tran_RegionId), new Long(A57Tran_RegionId), new Boolean(n481Tran_IndE_S), A481Tran_IndE_S, new Boolean(n482Tran_TipoElemento), A482Tran_TipoElemento, new Boolean(n518Tran_RegionIdDestino), new Long(A518Tran_RegionIdDestino), A55Tran_FechaRegistro, new Boolean(n58Tran_Estado), A58Tran_Estado, A110Tran_ModuloOrigen, A109Tran_CodAlmaOrigen, A112Tran_CodBodeOrigen, A385Tran_ModuloDestino, A111Tran_CodAlmaDestino, A387Tran_CodBodeDestino, new Boolean(n416Tran_Observaciones), A416Tran_Observaciones, new Boolean(n407Tran_AreadanteCodigo), A407Tran_AreadanteCodigo, new Boolean(n408Tran_CursoCodigo), A408Tran_CursoCodigo, new Boolean(n483Tran_ValorTransaccion), A483Tran_ValorTransaccion, new Boolean(n498Tran_NumeroLineas), new Long(A498Tran_NumeroLineas), new Boolean(n390Tran_FechaRatificacion), A390Tran_FechaRatificacion, new Boolean(n391Tran_UsuarioRatifica), A391Tran_UsuarioRatifica, new Boolean(n513Tran_ConsecutivoCC), new Long(A513Tran_ConsecutivoCC), new Boolean(n514Tran_NumeroIngreso), A514Tran_NumeroIngreso, new Boolean(n515Tran_FechaIngreso), A515Tran_FechaIngreso, new Boolean(n524Tran_Detalle), A524Tran_Detalle, new Boolean(n527Tran_TipoEntra), A527Tran_TipoEntra, new Boolean(n568Tran_CantidadPadres), new Integer(A568Tran_CantidadPadres), new Boolean(n667Tran_NumeroGrupo), new Short(A667Tran_NumeroGrupo), new Boolean(n668Tran_UsuarioEliminaoAnula), A668Tran_UsuarioEliminaoAnula, new Boolean(n669Tran_FechaEliminaoAnula), A669Tran_FechaEliminaoAnula, new Boolean(n670Tran_ObservacionesAnula), A670Tran_ObservacionesAnula, new Boolean(n719Tran_TransaccResponsabilidad), new Long(A719Tran_TransaccResponsabilidad), new Boolean(n720Tran_FechaResponsabilidad), A720Tran_FechaResponsabilidad, new Boolean(n758Tran_TablaResponsabilidad), new Short(A758Tran_TablaResponsabilidad), new Boolean(n859Tran_EntidadGobierno), A859Tran_EntidadGobierno, new Boolean(n47Tran_UsuarioId), new Long(A47Tran_UsuarioId), new Long(A48Tran_CentroCostoId), new Boolean(n50Tran_CentroCostoIdDestino), new Long(A50Tran_CentroCostoIdDestino), A49Tran_CodigoMovimiento, new Boolean(n51Tran_IdCuentadanteOrigen), new Long(A51Tran_IdCuentadanteOrigen), new Boolean(n53Tran_IdProveedor), new Long(A53Tran_IdProveedor), new Boolean(n52Tran_IdCuentadanteDestino), new Long(A52Tran_IdCuentadanteDestino), new Boolean(n56Tran_IdCuentadanteResponsabili), new Long(A56Tran_IdCuentadanteResponsabili), new Boolean(n54Tran_TipoIngreso), new Long(A54Tran_TipoIngreso), new Long(A46Tran_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
                  if ( (pr_default.getStatus(35) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TRANSACCION"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate057( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel057( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
                           }
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel057( ) ;
      }
      closeExtendedTableCursors057( ) ;
   }

   public void deferredUpdate057( )
   {
   }

   public void delete( )
   {
      beforeValidate057( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency057( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls057( ) ;
         afterConfirm057( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete057( ) ;
            if ( AnyError == 0 )
            {
               scanStart0561( ) ;
               while ( RcdFound61 != 0 )
               {
                  getByPrimaryKey0561( ) ;
                  delete0561( ) ;
                  scanNext0561( ) ;
               }
               scanEnd0561( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000538 */
                  pr_default.execute(36, new Object[] {new Long(A46Tran_Id)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
                           }
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
      }
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel057( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls057( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV47Pgmname = "ALM_TRANSACCION" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
         /* Using cursor T000539 */
         pr_default.execute(37, new Object[] {new Boolean(n47Tran_UsuarioId), new Long(A47Tran_UsuarioId)});
         A417Tran_UsuarioCodigo = T000539_A417Tran_UsuarioCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
         n417Tran_UsuarioCodigo = T000539_n417Tran_UsuarioCodigo[0] ;
         A418Tran_UsuarioNombre = T000539_A418Tran_UsuarioNombre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A418Tran_UsuarioNombre", A418Tran_UsuarioNombre);
         n418Tran_UsuarioNombre = T000539_n418Tran_UsuarioNombre[0] ;
         pr_default.close(37);
         /* Using cursor T000540 */
         pr_default.execute(38, new Object[] {new Long(A48Tran_CentroCostoId)});
         A419Tran_CentroCostoCodigo = T000540_A419Tran_CentroCostoCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
         n419Tran_CentroCostoCodigo = T000540_n419Tran_CentroCostoCodigo[0] ;
         A420Tran_CentroCostoDescripcion = T000540_A420Tran_CentroCostoDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
         n420Tran_CentroCostoDescripcion = T000540_n420Tran_CentroCostoDescripcion[0] ;
         A57Tran_RegionId = T000540_A57Tran_RegionId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57Tran_RegionId", GXutil.ltrim( GXutil.str( A57Tran_RegionId, 11, 0)));
         n57Tran_RegionId = T000540_n57Tran_RegionId[0] ;
         pr_default.close(38);
         /* Using cursor T000541 */
         pr_default.execute(39, new Object[] {new Boolean(n57Tran_RegionId), new Long(A57Tran_RegionId)});
         A421Tran_RegionCodigo = T000541_A421Tran_RegionCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
         n421Tran_RegionCodigo = T000541_n421Tran_RegionCodigo[0] ;
         A422Tran_RegionDescripcion = T000541_A422Tran_RegionDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
         n422Tran_RegionDescripcion = T000541_n422Tran_RegionDescripcion[0] ;
         A594Tran_RegionAbrev = T000541_A594Tran_RegionAbrev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A594Tran_RegionAbrev", A594Tran_RegionAbrev);
         n594Tran_RegionAbrev = T000541_n594Tran_RegionAbrev[0] ;
         pr_default.close(39);
         /* Using cursor T000542 */
         pr_default.execute(40, new Object[] {A49Tran_CodigoMovimiento});
         A381Tran_DescripcionMovimiento = T000542_A381Tran_DescripcionMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
         n381Tran_DescripcionMovimiento = T000542_n381Tran_DescripcionMovimiento[0] ;
         A478Tran_IndAreadante = T000542_A478Tran_IndAreadante[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
         n478Tran_IndAreadante = T000542_n478Tran_IndAreadante[0] ;
         A481Tran_IndE_S = T000542_A481Tran_IndE_S[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A481Tran_IndE_S", A481Tran_IndE_S);
         n481Tran_IndE_S = T000542_n481Tran_IndE_S[0] ;
         A479Tran_IndCurso = T000542_A479Tran_IndCurso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479Tran_IndCurso", A479Tran_IndCurso);
         n479Tran_IndCurso = T000542_n479Tran_IndCurso[0] ;
         A707Tran_SolicitaCCDestino = T000542_A707Tran_SolicitaCCDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
         n707Tran_SolicitaCCDestino = T000542_n707Tran_SolicitaCCDestino[0] ;
         A708Tran_SolicitaRegionDestino = T000542_A708Tran_SolicitaRegionDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
         n708Tran_SolicitaRegionDestino = T000542_n708Tran_SolicitaRegionDestino[0] ;
         A754Tran_CuentaResponsabilidad = T000542_A754Tran_CuentaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
         n754Tran_CuentaResponsabilidad = T000542_n754Tran_CuentaResponsabilidad[0] ;
         A499Tran_CodTipoElemento = T000542_A499Tran_CodTipoElemento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A499Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( A499Tran_CodTipoElemento, 18, 0)));
         n499Tran_CodTipoElemento = T000542_n499Tran_CodTipoElemento[0] ;
         pr_default.close(40);
         /* Using cursor T000543 */
         pr_default.execute(41, new Object[] {new Boolean(n499Tran_CodTipoElemento), new Long(A499Tran_CodTipoElemento)});
         A482Tran_TipoElemento = T000543_A482Tran_TipoElemento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
         n482Tran_TipoElemento = T000543_n482Tran_TipoElemento[0] ;
         pr_default.close(41);
         /* Using cursor T000544 */
         pr_default.execute(42, new Object[] {new Boolean(n51Tran_IdCuentadanteOrigen), new Long(A51Tran_IdCuentadanteOrigen)});
         A384Tran_NombCuentadanteOrigen = T000544_A384Tran_NombCuentadanteOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
         n384Tran_NombCuentadanteOrigen = T000544_n384Tran_NombCuentadanteOrigen[0] ;
         A702Tran_CedulaCuentadanteOrigen = T000544_A702Tran_CedulaCuentadanteOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
         n702Tran_CedulaCuentadanteOrigen = T000544_n702Tran_CedulaCuentadanteOrigen[0] ;
         A714Tran_EmailCuentadanteOrigen = T000544_A714Tran_EmailCuentadanteOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A714Tran_EmailCuentadanteOrigen", A714Tran_EmailCuentadanteOrigen);
         n714Tran_EmailCuentadanteOrigen = T000544_n714Tran_EmailCuentadanteOrigen[0] ;
         pr_default.close(42);
         /* Using cursor T000545 */
         pr_default.execute(43, new Object[] {new Boolean(n53Tran_IdProveedor), new Long(A53Tran_IdProveedor)});
         A575Tran_NombreProveedor = T000545_A575Tran_NombreProveedor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
         n575Tran_NombreProveedor = T000545_n575Tran_NombreProveedor[0] ;
         A703Tran_CedulaProveedor = T000545_A703Tran_CedulaProveedor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
         n703Tran_CedulaProveedor = T000545_n703Tran_CedulaProveedor[0] ;
         pr_default.close(43);
         /* Using cursor T000546 */
         pr_default.execute(44, new Object[] {new Boolean(n52Tran_IdCuentadanteDestino), new Long(A52Tran_IdCuentadanteDestino)});
         A389Tran_NombCuentadanteDestino = T000546_A389Tran_NombCuentadanteDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
         n389Tran_NombCuentadanteDestino = T000546_n389Tran_NombCuentadanteDestino[0] ;
         A704Tran_CedulaCuentadanteDestino = T000546_A704Tran_CedulaCuentadanteDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
         n704Tran_CedulaCuentadanteDestino = T000546_n704Tran_CedulaCuentadanteDestino[0] ;
         A715Tran_EmailCuentadanteDestino = T000546_A715Tran_EmailCuentadanteDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A715Tran_EmailCuentadanteDestino", A715Tran_EmailCuentadanteDestino);
         n715Tran_EmailCuentadanteDestino = T000546_n715Tran_EmailCuentadanteDestino[0] ;
         pr_default.close(44);
         /* Using cursor T000547 */
         pr_default.execute(45, new Object[] {new Boolean(n54Tran_TipoIngreso), new Long(A54Tran_TipoIngreso)});
         A672Tran_NombreIngreso = T000547_A672Tran_NombreIngreso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
         n672Tran_NombreIngreso = T000547_n672Tran_NombreIngreso[0] ;
         A756Tran_Abreviado = T000547_A756Tran_Abreviado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A756Tran_Abreviado", A756Tran_Abreviado);
         n756Tran_Abreviado = T000547_n756Tran_Abreviado[0] ;
         pr_default.close(45);
         /* Using cursor T000548 */
         pr_default.execute(46, new Object[] {new Boolean(n50Tran_CentroCostoIdDestino), new Long(A50Tran_CentroCostoIdDestino)});
         A516Tran_CentroCostoCodigoDestino = T000548_A516Tran_CentroCostoCodigoDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A516Tran_CentroCostoCodigoDestino", A516Tran_CentroCostoCodigoDestino);
         n516Tran_CentroCostoCodigoDestino = T000548_n516Tran_CentroCostoCodigoDestino[0] ;
         A517Tran_CentroCostoDescripcionDes = T000548_A517Tran_CentroCostoDescripcionDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A517Tran_CentroCostoDescripcionDes", A517Tran_CentroCostoDescripcionDes);
         n517Tran_CentroCostoDescripcionDes = T000548_n517Tran_CentroCostoDescripcionDes[0] ;
         A518Tran_RegionIdDestino = T000548_A518Tran_RegionIdDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A518Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( A518Tran_RegionIdDestino, 11, 0)));
         n518Tran_RegionIdDestino = T000548_n518Tran_RegionIdDestino[0] ;
         pr_default.close(46);
         /* Using cursor T000549 */
         pr_default.execute(47, new Object[] {new Boolean(n518Tran_RegionIdDestino), new Long(A518Tran_RegionIdDestino)});
         A519Tran_RegionCodigoDestino = T000549_A519Tran_RegionCodigoDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A519Tran_RegionCodigoDestino", GXutil.ltrim( GXutil.str( A519Tran_RegionCodigoDestino, 4, 0)));
         n519Tran_RegionCodigoDestino = T000549_n519Tran_RegionCodigoDestino[0] ;
         A520Tran_RegionDescripcionDestino = T000549_A520Tran_RegionDescripcionDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A520Tran_RegionDescripcionDestino", A520Tran_RegionDescripcionDestino);
         n520Tran_RegionDescripcionDestino = T000549_n520Tran_RegionDescripcionDestino[0] ;
         A608Tran_RegionAbrevDestino = T000549_A608Tran_RegionAbrevDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A608Tran_RegionAbrevDestino", A608Tran_RegionAbrevDestino);
         n608Tran_RegionAbrevDestino = T000549_n608Tran_RegionAbrevDestino[0] ;
         pr_default.close(47);
         /* Using cursor T000550 */
         pr_default.execute(48, new Object[] {new Boolean(n56Tran_IdCuentadanteResponsabili), new Long(A56Tran_IdCuentadanteResponsabili)});
         A759Tran_CedulaResponsabilidad = T000550_A759Tran_CedulaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
         n759Tran_CedulaResponsabilidad = T000550_n759Tran_CedulaResponsabilidad[0] ;
         A721Tran_NombreCuentadanteResponsa = T000550_A721Tran_NombreCuentadanteResponsa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
         n721Tran_NombreCuentadanteResponsa = T000550_n721Tran_NombreCuentadanteResponsa[0] ;
         pr_default.close(48);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000551 */
         pr_default.execute(49, new Object[] {new Long(A46Tran_Id)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"Novedad"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T000552 */
         pr_default.execute(50, new Object[] {new Long(A46Tran_Id)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALMACEN INVENTARIO CONSUMO"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T000553 */
         pr_default.execute(51, new Object[] {new Long(A46Tran_Id)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"DETALLE TRANSACCIÓN"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
      }
   }

   public void processNestedLevel0561( )
   {
      nGXsfl_334_idx = (short)(0) ;
      while ( nGXsfl_334_idx < nRC_GXsfl_334 )
      {
         readRow0561( ) ;
         if ( ( nRcdExists_61 != 0 ) || ( nIsMod_61 != 0 ) )
         {
            standaloneNotModal0561( ) ;
            getKey0561( ) ;
            if ( ( nRcdExists_61 == 0 ) && ( nRcdDeleted_61 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert0561( ) ;
            }
            else
            {
               if ( RcdFound61 != 0 )
               {
                  if ( ( nRcdDeleted_61 != 0 ) && ( nRcdExists_61 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete0561( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_61 != 0 ) && ( nRcdExists_61 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update0561( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_61 == 0 )
                  {
                     GXCCtl = "TRAN_NRO_DOCUMENTO_" + sGXsfl_334_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTran_Nro_Documento_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTran_Nro_Documento_Internalname, GXutil.ltrim( localUtil.ntoc( A827Tran_Nro_Documento, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtTran_Descrip_Documento_Internalname, A828Tran_Descrip_Documento) ;
         httpContext.changePostValue( edtTran_Prefijo_Documento_Internalname, A829Tran_Prefijo_Documento) ;
         httpContext.changePostValue( edtTran_Archivo_Internalname, A830Tran_Archivo) ;
         httpContext.changePostValue( edtTran_Ruta_Archivo_Internalname, A831Tran_Ruta_Archivo) ;
         httpContext.changePostValue( "ZT_"+"Z827Tran_Nro_Documento_"+sGXsfl_334_idx, GXutil.ltrim( localUtil.ntoc( Z827Tran_Nro_Documento, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z831Tran_Ruta_Archivo_"+sGXsfl_334_idx, Z831Tran_Ruta_Archivo) ;
         httpContext.changePostValue( "nRcdDeleted_61_"+sGXsfl_334_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_61, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_61_"+sGXsfl_334_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_61, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_61_"+sGXsfl_334_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_61, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_61 != 0 )
         {
            httpContext.changePostValue( "TRAN_NRO_DOCUMENTO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Nro_Documento_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRAN_DESCRIP_DOCUMENTO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Descrip_Documento_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRAN_PREFIJO_DOCUMENTO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Prefijo_Documento_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRAN_ARCHIVO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Archivo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TRAN_RUTA_ARCHIVO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Ruta_Archivo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0561( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_61 = (short)(0) ;
      nIsMod_61 = (short)(0) ;
      nRcdDeleted_61 = (short)(0) ;
   }

   public void processLevel057( )
   {
      /* Save parent mode. */
      sMode7 = Gx_mode ;
      processNestedLevel0561( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      /* ' Update level parameters */
   }

   public void endLevel057( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete057( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_transaccion");
         if ( AnyError == 0 )
         {
            confirmValues050( ) ;
         }
         /* After transaction rules */
         if ( ( GXutil.strcmp(A481Tran_IndE_S, "A") == 0 ) && ( GXutil.strcmp(A49Tran_CodigoMovimiento, "999") == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  || ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  ) )
         {
            httpContext.wjLoc = formatLink("com.orions2.wpalm_asociar_placas") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
         }
         if ( ( GXutil.strcmp(A481Tran_IndE_S, "E") == 0 ) && ( GXutil.strcmp(A482Tran_TipoElemento, "C") == 0 ) && ( GXutil.strcmp(A524Tran_Detalle, "D") == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  || ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  ) )
         {
            httpContext.wjLoc = formatLink("com.orions2.wpcon_ent") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
         }
         if ( ( GXutil.strcmp(A481Tran_IndE_S, "S") == 0 ) && ( GXutil.strcmp(A482Tran_TipoElemento, "C") == 0 ) && ( GXutil.strcmp(A524Tran_Detalle, "D") == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  || ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  ) )
         {
            httpContext.wjLoc = formatLink("com.orions2.wpalm_salida_consumo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
         }
         if ( ( GXutil.strcmp(A481Tran_IndE_S, "E") == 0 ) && ( GXutil.strcmp(A482Tran_TipoElemento, "D") == 0 ) && ( GXutil.strcmp(A524Tran_Detalle, "D") == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  || ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  ) )
         {
            httpContext.wjLoc = formatLink("com.orions2.wpcon_ent_dev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
         }
         if ( ( GXutil.strcmp(A481Tran_IndE_S, "S") == 0 ) && ( GXutil.strcmp(A482Tran_TipoElemento, "D") == 0 ) && ( GXutil.strcmp(A524Tran_Detalle, "D") == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  || ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  ) )
         {
            httpContext.wjLoc = formatLink("com.orions2.wpalm_salida_devolutivo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
         }
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_transaccion");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart057( )
   {
      /* Scan By routine */
      /* Using cursor T000554 */
      pr_default.execute(52);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(52) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A46Tran_Id = T000554_A46Tran_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext057( )
   {
      /* Scan next routine */
      pr_default.readNext(52);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(52) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A46Tran_Id = T000554_A46Tran_Id[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
      }
   }

   public void scanEnd057( )
   {
      pr_default.close(52);
   }

   public void afterConfirm057( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
      {
         A55Tran_FechaRegistro = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( true /* After */ )
      {
         A58Tran_Estado = "I" ;
         n58Tran_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A58Tran_Estado", A58Tran_Estado);
      }
      if ( true /* After */ && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         GXt_char5 = AV11ConsecutivoCC ;
         GXv_char4[0] = "TRANS" ;
         GXv_int1[0] = A48Tran_CentroCostoId ;
         GXv_char3[0] = GXt_char5 ;
         new com.orions2.cons_tran_pla(remoteHandle, context).execute( GXv_char4, GXv_int1, GXv_char3) ;
         alm_transaccion_impl.this.A48Tran_CentroCostoId = GXv_int1[0] ;
         alm_transaccion_impl.this.GXt_char5 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
         AV11ConsecutivoCC = GXt_char5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11ConsecutivoCC", AV11ConsecutivoCC);
      }
      if ( true /* After */ && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         A513Tran_ConsecutivoCC = GXutil.lval( AV11ConsecutivoCC) ;
         n513Tran_ConsecutivoCC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
      }
   }

   public void beforeInsert057( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate057( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete057( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete057( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate057( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes057( )
   {
      edtTran_Id_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Id_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Id_Enabled, 5, 0)), true);
      edtTran_FechaRegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaRegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_FechaRegistro_Enabled, 5, 0)), true);
      edtTran_UsuarioId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_UsuarioId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_UsuarioId_Enabled, 5, 0)), true);
      edtTran_UsuarioCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_UsuarioCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_UsuarioCodigo_Enabled, 5, 0)), true);
      edtTran_UsuarioNombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_UsuarioNombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_UsuarioNombre_Enabled, 5, 0)), true);
      edtTran_CentroCostoId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CentroCostoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CentroCostoId_Enabled, 5, 0)), true);
      edtTran_CentroCostoCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CentroCostoCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CentroCostoCodigo_Enabled, 5, 0)), true);
      edtTran_CentroCostoDescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CentroCostoDescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CentroCostoDescripcion_Enabled, 5, 0)), true);
      edtTran_RegionId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_RegionId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_RegionId_Enabled, 5, 0)), true);
      edtTran_RegionCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_RegionCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_RegionCodigo_Enabled, 5, 0)), true);
      edtTran_RegionDescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_RegionDescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_RegionDescripcion_Enabled, 5, 0)), true);
      edtTran_RegionAbrev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_RegionAbrev_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_RegionAbrev_Enabled, 5, 0)), true);
      edtTran_CodigoMovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CodigoMovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CodigoMovimiento_Enabled, 5, 0)), true);
      edtTran_DescripcionMovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_DescripcionMovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_DescripcionMovimiento_Enabled, 5, 0)), true);
      cmbTran_IndAreadante.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_IndAreadante.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_IndAreadante.getEnabled(), 5, 0)), true);
      cmbTran_IndE_S.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_IndE_S.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_IndE_S.getEnabled(), 5, 0)), true);
      cmbTran_IndCurso.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_IndCurso.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_IndCurso.getEnabled(), 5, 0)), true);
      edtTran_CodTipoElemento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CodTipoElemento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CodTipoElemento_Enabled, 5, 0)), true);
      cmbTran_TipoElemento.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoElemento.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_TipoElemento.getEnabled(), 5, 0)), true);
      cmbTran_SolicitaCCDestino.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_SolicitaCCDestino.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_SolicitaCCDestino.getEnabled(), 5, 0)), true);
      cmbTran_SolicitaRegionDestino.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_SolicitaRegionDestino.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_SolicitaRegionDestino.getEnabled(), 5, 0)), true);
      cmbTran_CuentaResponsabilidad.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_CuentaResponsabilidad.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_CuentaResponsabilidad.getEnabled(), 5, 0)), true);
      edtTran_ModuloOrigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_ModuloOrigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_ModuloOrigen_Enabled, 5, 0)), true);
      edtTran_CodAlmaOrigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CodAlmaOrigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CodAlmaOrigen_Enabled, 5, 0)), true);
      edtTran_CodBodeOrigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CodBodeOrigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CodBodeOrigen_Enabled, 5, 0)), true);
      edtTran_IdCuentadanteOrigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_IdCuentadanteOrigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdCuentadanteOrigen_Enabled, 5, 0)), true);
      edtTran_NombCuentadanteOrigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_NombCuentadanteOrigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_NombCuentadanteOrigen_Enabled, 5, 0)), true);
      edtTran_CedulaCuentadanteOrigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CedulaCuentadanteOrigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CedulaCuentadanteOrigen_Enabled, 5, 0)), true);
      edtTran_EmailCuentadanteOrigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_EmailCuentadanteOrigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_EmailCuentadanteOrigen_Enabled, 5, 0)), true);
      edtTran_IdProveedor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_IdProveedor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdProveedor_Enabled, 5, 0)), true);
      edtTran_NombreProveedor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_NombreProveedor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_NombreProveedor_Enabled, 5, 0)), true);
      edtTran_CedulaProveedor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CedulaProveedor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CedulaProveedor_Enabled, 5, 0)), true);
      edtTran_ModuloDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_ModuloDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_ModuloDestino_Enabled, 5, 0)), true);
      edtTran_CodAlmaDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CodAlmaDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CodAlmaDestino_Enabled, 5, 0)), true);
      edtTran_CodBodeDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CodBodeDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CodBodeDestino_Enabled, 5, 0)), true);
      edtTran_IdCuentadanteDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_IdCuentadanteDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdCuentadanteDestino_Enabled, 5, 0)), true);
      edtTran_NombCuentadanteDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_NombCuentadanteDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_NombCuentadanteDestino_Enabled, 5, 0)), true);
      edtTran_CedulaCuentadanteDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CedulaCuentadanteDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CedulaCuentadanteDestino_Enabled, 5, 0)), true);
      edtTran_EmailCuentadanteDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_EmailCuentadanteDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_EmailCuentadanteDestino_Enabled, 5, 0)), true);
      edtTran_Observaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Observaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Observaciones_Enabled, 5, 0)), true);
      edtTran_AreadanteCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_AreadanteCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_AreadanteCodigo_Enabled, 5, 0)), true);
      edtTran_CursoCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CursoCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CursoCodigo_Enabled, 5, 0)), true);
      edtTran_ValorTransaccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_ValorTransaccion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_ValorTransaccion_Enabled, 5, 0)), true);
      edtTran_NumeroLineas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_NumeroLineas_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_NumeroLineas_Enabled, 5, 0)), true);
      cmbTran_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_Estado.getEnabled(), 5, 0)), true);
      edtTran_FechaRatificacion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaRatificacion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_FechaRatificacion_Enabled, 5, 0)), true);
      edtTran_UsuarioRatifica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_UsuarioRatifica_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_UsuarioRatifica_Enabled, 5, 0)), true);
      edtTran_ConsecutivoCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_ConsecutivoCC_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_ConsecutivoCC_Enabled, 5, 0)), true);
      cmbTran_TipoIngreso.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoIngreso.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_TipoIngreso.getEnabled(), 5, 0)), true);
      edtTran_NombreIngreso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_NombreIngreso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_NombreIngreso_Enabled, 5, 0)), true);
      edtTran_Abreviado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Abreviado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Abreviado_Enabled, 5, 0)), true);
      edtTran_NumeroIngreso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_NumeroIngreso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_NumeroIngreso_Enabled, 5, 0)), true);
      edtTran_FechaIngreso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaIngreso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_FechaIngreso_Enabled, 5, 0)), true);
      edtTran_CentroCostoIdDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CentroCostoIdDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CentroCostoIdDestino_Enabled, 5, 0)), true);
      edtTran_CentroCostoCodigoDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CentroCostoCodigoDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CentroCostoCodigoDestino_Enabled, 5, 0)), true);
      edtTran_CentroCostoDescripcionDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CentroCostoDescripcionDes_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CentroCostoDescripcionDes_Enabled, 5, 0)), true);
      edtTran_RegionIdDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_RegionIdDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_RegionIdDestino_Enabled, 5, 0)), true);
      edtTran_RegionCodigoDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_RegionCodigoDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_RegionCodigoDestino_Enabled, 5, 0)), true);
      edtTran_RegionDescripcionDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_RegionDescripcionDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_RegionDescripcionDestino_Enabled, 5, 0)), true);
      edtTran_RegionAbrevDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_RegionAbrevDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_RegionAbrevDestino_Enabled, 5, 0)), true);
      edtTran_Detalle_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Detalle_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Detalle_Enabled, 5, 0)), true);
      cmbTran_TipoEntra.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoEntra.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_TipoEntra.getEnabled(), 5, 0)), true);
      edtTran_CantidadPadres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CantidadPadres_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CantidadPadres_Enabled, 5, 0)), true);
      edtTran_NumeroGrupo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_NumeroGrupo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_NumeroGrupo_Enabled, 5, 0)), true);
      edtTran_UsuarioEliminaoAnula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_UsuarioEliminaoAnula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_UsuarioEliminaoAnula_Enabled, 5, 0)), true);
      edtTran_FechaEliminaoAnula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaEliminaoAnula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_FechaEliminaoAnula_Enabled, 5, 0)), true);
      edtTran_ObservacionesAnula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_ObservacionesAnula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_ObservacionesAnula_Enabled, 5, 0)), true);
      edtTran_IdCuentadanteResponsabili_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_IdCuentadanteResponsabili_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_IdCuentadanteResponsabili_Enabled, 5, 0)), true);
      edtTran_CedulaResponsabilidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_CedulaResponsabilidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_CedulaResponsabilidad_Enabled, 5, 0)), true);
      edtTran_NombreCuentadanteResponsa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_NombreCuentadanteResponsa_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_NombreCuentadanteResponsa_Enabled, 5, 0)), true);
      edtTran_TransaccResponsabilidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_TransaccResponsabilidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_TransaccResponsabilidad_Enabled, 5, 0)), true);
      edtTran_FechaResponsabilidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_FechaResponsabilidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_FechaResponsabilidad_Enabled, 5, 0)), true);
      edtTran_TablaResponsabilidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_TablaResponsabilidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_TablaResponsabilidad_Enabled, 5, 0)), true);
      cmbTran_EntidadGobierno.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTran_EntidadGobierno.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTran_EntidadGobierno.getEnabled(), 5, 0)), true);
   }

   public void zm0561( int GX_JID )
   {
      if ( ( GX_JID == 62 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z831Tran_Ruta_Archivo = T00053_A831Tran_Ruta_Archivo[0] ;
         }
         else
         {
            Z831Tran_Ruta_Archivo = A831Tran_Ruta_Archivo ;
         }
      }
      if ( GX_JID == -62 )
      {
         Z46Tran_Id = A46Tran_Id ;
         Z830Tran_Archivo = A830Tran_Archivo ;
         Z831Tran_Ruta_Archivo = A831Tran_Ruta_Archivo ;
         Z827Tran_Nro_Documento = A827Tran_Nro_Documento ;
         Z828Tran_Descrip_Documento = A828Tran_Descrip_Documento ;
         Z829Tran_Prefijo_Documento = A829Tran_Prefijo_Documento ;
      }
   }

   public void standaloneNotModal0561( )
   {
   }

   public void standaloneModal0561( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTran_Nro_Documento_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_Nro_Documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Nro_Documento_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
      }
      else
      {
         edtTran_Nro_Documento_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_Nro_Documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Nro_Documento_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
      }
   }

   public void load0561( )
   {
      /* Using cursor T000555 */
      pr_default.execute(53, new Object[] {new Long(A46Tran_Id), new Short(A827Tran_Nro_Documento)});
      if ( (pr_default.getStatus(53) != 101) )
      {
         RcdFound61 = (short)(1) ;
         A828Tran_Descrip_Documento = T000555_A828Tran_Descrip_Documento[0] ;
         n828Tran_Descrip_Documento = T000555_n828Tran_Descrip_Documento[0] ;
         A829Tran_Prefijo_Documento = T000555_A829Tran_Prefijo_Documento[0] ;
         n829Tran_Prefijo_Documento = T000555_n829Tran_Prefijo_Documento[0] ;
         A830Tran_Archivo = T000555_A830Tran_Archivo[0] ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_Archivo_Internalname, "URL", httpContext.getResourceRelative(A830Tran_Archivo), !bGXsfl_334_Refreshing);
         n830Tran_Archivo = T000555_n830Tran_Archivo[0] ;
         A831Tran_Ruta_Archivo = T000555_A831Tran_Ruta_Archivo[0] ;
         n831Tran_Ruta_Archivo = T000555_n831Tran_Ruta_Archivo[0] ;
         zm0561( -62) ;
      }
      pr_default.close(53);
      onLoadActions0561( ) ;
   }

   public void onLoadActions0561( )
   {
   }

   public void checkExtendedTable0561( )
   {
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal0561( ) ;
      /* Using cursor T00054 */
      pr_default.execute(2, new Object[] {new Short(A827Tran_Nro_Documento)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "TRAN_NRO_DOCUMENTO_" + sGXsfl_334_idx ;
         httpContext.GX_msglist.addItem("No existe 'Tran_Documentos'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Nro_Documento_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A828Tran_Descrip_Documento = T00054_A828Tran_Descrip_Documento[0] ;
      n828Tran_Descrip_Documento = T00054_n828Tran_Descrip_Documento[0] ;
      A829Tran_Prefijo_Documento = T00054_A829Tran_Prefijo_Documento[0] ;
      n829Tran_Prefijo_Documento = T00054_n829Tran_Prefijo_Documento[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors0561( )
   {
      pr_default.close(2);
   }

   public void enableDisable0561( )
   {
   }

   public void gxload_63( short A827Tran_Nro_Documento )
   {
      /* Using cursor T000556 */
      pr_default.execute(54, new Object[] {new Short(A827Tran_Nro_Documento)});
      if ( (pr_default.getStatus(54) == 101) )
      {
         GXCCtl = "TRAN_NRO_DOCUMENTO_" + sGXsfl_334_idx ;
         httpContext.GX_msglist.addItem("No existe 'Tran_Documentos'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Nro_Documento_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A828Tran_Descrip_Documento = T000556_A828Tran_Descrip_Documento[0] ;
      n828Tran_Descrip_Documento = T000556_n828Tran_Descrip_Documento[0] ;
      A829Tran_Prefijo_Documento = T000556_A829Tran_Prefijo_Documento[0] ;
      n829Tran_Prefijo_Documento = T000556_n829Tran_Prefijo_Documento[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A828Tran_Descrip_Documento)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A829Tran_Prefijo_Documento)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(54) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(54);
   }

   public void getKey0561( )
   {
      /* Using cursor T000557 */
      pr_default.execute(55, new Object[] {new Long(A46Tran_Id), new Short(A827Tran_Nro_Documento)});
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound61 = (short)(1) ;
      }
      else
      {
         RcdFound61 = (short)(0) ;
      }
      pr_default.close(55);
   }

   public void getByPrimaryKey0561( )
   {
      /* Using cursor T00053 */
      pr_default.execute(1, new Object[] {new Long(A46Tran_Id), new Short(A827Tran_Nro_Documento)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0561( 62) ;
         RcdFound61 = (short)(1) ;
         initializeNonKey0561( ) ;
         A830Tran_Archivo = T00053_A830Tran_Archivo[0] ;
         httpContext.ajax_rsp_assign_prop("", false, edtTran_Archivo_Internalname, "URL", httpContext.getResourceRelative(A830Tran_Archivo), !bGXsfl_334_Refreshing);
         n830Tran_Archivo = T00053_n830Tran_Archivo[0] ;
         A831Tran_Ruta_Archivo = T00053_A831Tran_Ruta_Archivo[0] ;
         n831Tran_Ruta_Archivo = T00053_n831Tran_Ruta_Archivo[0] ;
         A827Tran_Nro_Documento = T00053_A827Tran_Nro_Documento[0] ;
         Z46Tran_Id = A46Tran_Id ;
         Z827Tran_Nro_Documento = A827Tran_Nro_Documento ;
         sMode61 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0561( ) ;
         Gx_mode = sMode61 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound61 = (short)(0) ;
         initializeNonKey0561( ) ;
         sMode61 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal0561( ) ;
         Gx_mode = sMode61 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0561( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0561( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00052 */
         pr_default.execute(0, new Object[] {new Long(A46Tran_Id), new Short(A827Tran_Nro_Documento)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TRANSACCION_DOCUM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z831Tran_Ruta_Archivo, T00052_A831Tran_Ruta_Archivo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_TRANSACCION_DOCUM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0561( )
   {
      beforeValidate0561( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0561( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0561( 0) ;
         checkOptimisticConcurrency0561( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0561( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0561( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000558 */
                  pr_default.execute(56, new Object[] {new Long(A46Tran_Id), new Boolean(n830Tran_Archivo), A830Tran_Archivo, new Boolean(n831Tran_Ruta_Archivo), A831Tran_Ruta_Archivo, new Short(A827Tran_Nro_Documento)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION_DOCUM") ;
                  if ( (pr_default.getStatus(56) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load0561( ) ;
         }
         endLevel0561( ) ;
      }
      closeExtendedTableCursors0561( ) ;
   }

   public void update0561( )
   {
      beforeValidate0561( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0561( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0561( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0561( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0561( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000559 */
                  pr_default.execute(57, new Object[] {new Boolean(n831Tran_Ruta_Archivo), A831Tran_Ruta_Archivo, new Long(A46Tran_Id), new Short(A827Tran_Nro_Documento)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION_DOCUM") ;
                  if ( (pr_default.getStatus(57) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TRANSACCION_DOCUM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0561( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0561( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel0561( ) ;
      }
      closeExtendedTableCursors0561( ) ;
   }

   public void deferredUpdate0561( )
   {
      if ( AnyError == 0 )
      {
         /* Using cursor T000560 */
         pr_default.execute(58, new Object[] {new Boolean(n830Tran_Archivo), A830Tran_Archivo, new Long(A46Tran_Id), new Short(A827Tran_Nro_Documento)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION_DOCUM") ;
      }
   }

   public void delete0561( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate0561( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0561( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0561( ) ;
         afterConfirm0561( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0561( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000561 */
               pr_default.execute(59, new Object[] {new Long(A46Tran_Id), new Short(A827Tran_Nro_Documento)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TRANSACCION_DOCUM") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode61 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0561( ) ;
      Gx_mode = sMode61 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0561( )
   {
      standaloneModal0561( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000562 */
         pr_default.execute(60, new Object[] {new Short(A827Tran_Nro_Documento)});
         A828Tran_Descrip_Documento = T000562_A828Tran_Descrip_Documento[0] ;
         n828Tran_Descrip_Documento = T000562_n828Tran_Descrip_Documento[0] ;
         A829Tran_Prefijo_Documento = T000562_A829Tran_Prefijo_Documento[0] ;
         n829Tran_Prefijo_Documento = T000562_n829Tran_Prefijo_Documento[0] ;
         pr_default.close(60);
      }
   }

   public void endLevel0561( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0561( )
   {
      /* Scan By routine */
      /* Using cursor T000563 */
      pr_default.execute(61, new Object[] {new Long(A46Tran_Id)});
      RcdFound61 = (short)(0) ;
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound61 = (short)(1) ;
         A827Tran_Nro_Documento = T000563_A827Tran_Nro_Documento[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0561( )
   {
      /* Scan next routine */
      pr_default.readNext(61);
      RcdFound61 = (short)(0) ;
      if ( (pr_default.getStatus(61) != 101) )
      {
         RcdFound61 = (short)(1) ;
         A827Tran_Nro_Documento = T000563_A827Tran_Nro_Documento[0] ;
      }
   }

   public void scanEnd0561( )
   {
      pr_default.close(61);
   }

   public void afterConfirm0561( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0561( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0561( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0561( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0561( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0561( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0561( )
   {
      edtTran_Nro_Documento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Nro_Documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Nro_Documento_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
      edtTran_Descrip_Documento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Descrip_Documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Descrip_Documento_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
      edtTran_Prefijo_Documento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Prefijo_Documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Prefijo_Documento_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
      edtTran_Archivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Archivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Archivo_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
      edtTran_Ruta_Archivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Ruta_Archivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Ruta_Archivo_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
   }

   public void subsflControlProps_33461( )
   {
      edtTran_Nro_Documento_Internalname = "TRAN_NRO_DOCUMENTO_"+sGXsfl_334_idx ;
      imgprompt_827_Internalname = "PROMPT_827_"+sGXsfl_334_idx ;
      edtTran_Descrip_Documento_Internalname = "TRAN_DESCRIP_DOCUMENTO_"+sGXsfl_334_idx ;
      edtTran_Prefijo_Documento_Internalname = "TRAN_PREFIJO_DOCUMENTO_"+sGXsfl_334_idx ;
      edtTran_Archivo_Internalname = "TRAN_ARCHIVO_"+sGXsfl_334_idx ;
      edtTran_Ruta_Archivo_Internalname = "TRAN_RUTA_ARCHIVO_"+sGXsfl_334_idx ;
   }

   public void subsflControlProps_fel_33461( )
   {
      edtTran_Nro_Documento_Internalname = "TRAN_NRO_DOCUMENTO_"+sGXsfl_334_fel_idx ;
      imgprompt_827_Internalname = "PROMPT_827_"+sGXsfl_334_fel_idx ;
      edtTran_Descrip_Documento_Internalname = "TRAN_DESCRIP_DOCUMENTO_"+sGXsfl_334_fel_idx ;
      edtTran_Prefijo_Documento_Internalname = "TRAN_PREFIJO_DOCUMENTO_"+sGXsfl_334_fel_idx ;
      edtTran_Archivo_Internalname = "TRAN_ARCHIVO_"+sGXsfl_334_fel_idx ;
      edtTran_Ruta_Archivo_Internalname = "TRAN_RUTA_ARCHIVO_"+sGXsfl_334_fel_idx ;
   }

   public void addRow0561( )
   {
      nGXsfl_334_idx = (short)(nGXsfl_334_idx+1) ;
      sGXsfl_334_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_334_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_33461( ) ;
      sendRow0561( ) ;
   }

   public void sendRow0561( )
   {
      Gridalm_transaccion_documentosRow = GXWebRow.GetNew(context) ;
      if ( subGridalm_transaccion_documentos_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridalm_transaccion_documentos_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridalm_transaccion_documentos_Class, "") != 0 )
         {
            subGridalm_transaccion_documentos_Linesclass = subGridalm_transaccion_documentos_Class+"Odd" ;
         }
      }
      else if ( subGridalm_transaccion_documentos_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridalm_transaccion_documentos_Backstyle = (byte)(0) ;
         subGridalm_transaccion_documentos_Backcolor = subGridalm_transaccion_documentos_Allbackcolor ;
         if ( GXutil.strcmp(subGridalm_transaccion_documentos_Class, "") != 0 )
         {
            subGridalm_transaccion_documentos_Linesclass = subGridalm_transaccion_documentos_Class+"Uniform" ;
         }
      }
      else if ( subGridalm_transaccion_documentos_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridalm_transaccion_documentos_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridalm_transaccion_documentos_Class, "") != 0 )
         {
            subGridalm_transaccion_documentos_Linesclass = subGridalm_transaccion_documentos_Class+"Odd" ;
         }
         subGridalm_transaccion_documentos_Backcolor = (int)(0x0) ;
      }
      else if ( subGridalm_transaccion_documentos_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridalm_transaccion_documentos_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_334_idx) % (2))) == 0 )
         {
            subGridalm_transaccion_documentos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_transaccion_documentos_Class, "") != 0 )
            {
               subGridalm_transaccion_documentos_Linesclass = subGridalm_transaccion_documentos_Class+"Even" ;
            }
         }
         else
         {
            subGridalm_transaccion_documentos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_transaccion_documentos_Class, "") != 0 )
            {
               subGridalm_transaccion_documentos_Linesclass = subGridalm_transaccion_documentos_Class+"Odd" ;
            }
         }
      }
      imgprompt_827_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx01n0"+"',["+"{Ctrl:gx.dom.el('"+"TRAN_NRO_DOCUMENTO_"+sGXsfl_334_idx+"'), id:'"+"TRAN_NRO_DOCUMENTO_"+sGXsfl_334_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_61_"+sGXsfl_334_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx01p1"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"TRAN_ID"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"TRAN_ID"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"TRAN_NRO_DOCUMENTO_"',3),t(+,5),t(sGXsfl_334_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"TRAN_NRO_DOCUMENTO_"',3),t(+,5),t(sGXsfl_334_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_61_"',3),t(+,5),t(sGXsfl_334_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_46,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_61_" + sGXsfl_334_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 335,'',false,'" + sGXsfl_334_idx + "',334)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_transaccion_documentosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Nro_Documento_Internalname,GXutil.ltrim( localUtil.ntoc( A827Tran_Nro_Documento, (byte)(4), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A827Tran_Nro_Documento), "ZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,335);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_Nro_Documento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTran_Nro_Documento_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(334),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridalm_transaccion_documentosRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_827_Internalname,sImgUrl,imgprompt_827_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_827_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_transaccion_documentosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Descrip_Documento_Internalname,A828Tran_Descrip_Documento,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_Descrip_Documento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTran_Descrip_Documento_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(334),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_transaccion_documentosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Prefijo_Documento_Internalname,A829Tran_Prefijo_Documento,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_Prefijo_Documento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTran_Prefijo_Documento_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(334),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      /* Subfile cell */
      ClassString = "Image" ;
      StyleString = "" ;
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_61_" + sGXsfl_334_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 338,'',false,'" + sGXsfl_334_idx + "',334)\"" ;
      edtTran_Archivo_Filetype = "tmp" ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Archivo_Internalname, "Filetype", edtTran_Archivo_Filetype, !bGXsfl_334_Refreshing);
      if ( ! (GXutil.strcmp("", A830Tran_Archivo)==0) )
      {
         gxblobfileaux.setSource( A830Tran_Archivo );
         if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtTran_Archivo_Filetype, "tmp") != 0 ) )
         {
            gxblobfileaux.setExt(GXutil.trim( edtTran_Archivo_Filetype));
         }
         if ( gxblobfileaux.getErrCode() == 0 )
         {
            A830Tran_Archivo = gxblobfileaux.getAbsoluteName() ;
            n830Tran_Archivo = false ;
            httpContext.ajax_rsp_assign_prop("", false, edtTran_Archivo_Internalname, "URL", httpContext.getResourceRelative(A830Tran_Archivo), !bGXsfl_334_Refreshing);
            edtTran_Archivo_Filetype = gxblobfileaux.getExtension() ;
            httpContext.ajax_rsp_assign_prop("", false, edtTran_Archivo_Internalname, "Filetype", edtTran_Archivo_Filetype, !bGXsfl_334_Refreshing);
            gxblobfileaux.setBlobToDelete();
         }
         httpContext.ajax_rsp_assign_prop("", false, edtTran_Archivo_Internalname, "URL", httpContext.getResourceRelative(A830Tran_Archivo), !bGXsfl_334_Refreshing);
      }
      Gridalm_transaccion_documentosRow.AddColumnProperties("blob", 2, isAjaxCallMode( ), new Object[] {edtTran_Archivo_Internalname,GXutil.rtrim( A830Tran_Archivo),httpContext.getResourceRelative(A830Tran_Archivo),((GXutil.strcmp("", edtTran_Archivo_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtTran_Archivo_Filetype)==0) ? A830Tran_Archivo : edtTran_Archivo_Filetype)) : edtTran_Archivo_Contenttype),new Boolean(false),"",edtTran_Archivo_Parameters,new Integer(0),new Integer(edtTran_Archivo_Enabled),new Integer(-1),"","",new Integer(0),new Integer(-1),new Integer(0),"px",new Integer(60),"px",new Integer(0),new Integer(0),new Integer(0),edtTran_Archivo_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'",StyleString,ClassString,"",""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,338);\"","",""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_61_" + sGXsfl_334_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 339,'',false,'" + sGXsfl_334_idx + "',334)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_transaccion_documentosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Ruta_Archivo_Internalname,A831Tran_Ruta_Archivo,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,339);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_Ruta_Archivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTran_Ruta_Archivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(334),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      httpContext.ajax_sending_grid_row(Gridalm_transaccion_documentosRow);
      GXCCtl = "Z827Tran_Nro_Documento_" + sGXsfl_334_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z827Tran_Nro_Documento, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "Z831Tran_Ruta_Archivo_" + sGXsfl_334_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z831Tran_Ruta_Archivo);
      GXCCtl = "nRcdDeleted_61_" + sGXsfl_334_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_61, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_61_" + sGXsfl_334_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_61, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_61_" + sGXsfl_334_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_61, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_334_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_334_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV37TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV37TrnContext);
      }
      GXCCtl = "vEXISTECUENTADANTEDESTINO_" + sGXsfl_334_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV14ExisteCuentadanteDestino));
      GXCCtl = "vTRAN_ID_" + sGXsfl_334_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV33Tran_Id, (byte)(11), (byte)(0), ",", "")));
      GXCCtl = "TRAN_ARCHIVO_" + sGXsfl_334_idx ;
      GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, A830Tran_Archivo);
      GXCCtl = "TRAN_ARCHIVO_Filename_" + sGXsfl_334_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( edtTran_Archivo_Filename));
      GXCCtl = "TRAN_ARCHIVO_Filetype_" + sGXsfl_334_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( edtTran_Archivo_Filetype));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_NRO_DOCUMENTO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Nro_Documento_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_DESCRIP_DOCUMENTO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Descrip_Documento_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_PREFIJO_DOCUMENTO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Prefijo_Documento_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ARCHIVO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Archivo_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_RUTA_ARCHIVO_"+sGXsfl_334_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTran_Ruta_Archivo_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_827_"+sGXsfl_334_idx+"Link", GXutil.rtrim( imgprompt_827_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridalm_transaccion_documentosContainer.AddRow(Gridalm_transaccion_documentosRow);
   }

   public void readRow0561( )
   {
      nGXsfl_334_idx = (short)(nGXsfl_334_idx+1) ;
      sGXsfl_334_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_334_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_33461( ) ;
      edtTran_Nro_Documento_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_NRO_DOCUMENTO_"+sGXsfl_334_idx+"Enabled"), ",", ".")) ;
      edtTran_Descrip_Documento_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_DESCRIP_DOCUMENTO_"+sGXsfl_334_idx+"Enabled"), ",", ".")) ;
      edtTran_Prefijo_Documento_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_PREFIJO_DOCUMENTO_"+sGXsfl_334_idx+"Enabled"), ",", ".")) ;
      edtTran_Archivo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_ARCHIVO_"+sGXsfl_334_idx+"Enabled"), ",", ".")) ;
      edtTran_Ruta_Archivo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TRAN_RUTA_ARCHIVO_"+sGXsfl_334_idx+"Enabled"), ",", ".")) ;
      imgprompt_47_Link = httpContext.cgiGet( "PROMPT_827_"+sGXsfl_334_idx+"Link") ;
      GXCCtl = "TRAN_ARCHIVO_Filename_" + sGXsfl_334_idx ;
      edtTran_Archivo_Filename = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "TRAN_ARCHIVO_Filetype_" + sGXsfl_334_idx ;
      edtTran_Archivo_Filetype = httpContext.cgiGet( GXCCtl) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTran_Nro_Documento_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTran_Nro_Documento_Internalname), ",", ".") > 9999 ) ) )
      {
         GXCCtl = "TRAN_NRO_DOCUMENTO_" + sGXsfl_334_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Nro_Documento_Internalname ;
         wbErr = true ;
         A827Tran_Nro_Documento = (short)(0) ;
      }
      else
      {
         A827Tran_Nro_Documento = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_Nro_Documento_Internalname), ",", ".")) ;
      }
      A828Tran_Descrip_Documento = httpContext.cgiGet( edtTran_Descrip_Documento_Internalname) ;
      n828Tran_Descrip_Documento = false ;
      A829Tran_Prefijo_Documento = httpContext.cgiGet( edtTran_Prefijo_Documento_Internalname) ;
      n829Tran_Prefijo_Documento = false ;
      A830Tran_Archivo = httpContext.cgiGet( edtTran_Archivo_Internalname) ;
      n830Tran_Archivo = false ;
      n830Tran_Archivo = ((GXutil.strcmp("", A830Tran_Archivo)==0) ? true : false) ;
      A831Tran_Ruta_Archivo = httpContext.cgiGet( edtTran_Ruta_Archivo_Internalname) ;
      n831Tran_Ruta_Archivo = false ;
      n831Tran_Ruta_Archivo = ((GXutil.strcmp("", A831Tran_Ruta_Archivo)==0) ? true : false) ;
      GXCCtl = "Z827Tran_Nro_Documento_" + sGXsfl_334_idx ;
      Z827Tran_Nro_Documento = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "Z831Tran_Ruta_Archivo_" + sGXsfl_334_idx ;
      Z831Tran_Ruta_Archivo = httpContext.cgiGet( GXCCtl) ;
      n831Tran_Ruta_Archivo = ((GXutil.strcmp("", A831Tran_Ruta_Archivo)==0) ? true : false) ;
      GXCCtl = "nRcdDeleted_61_" + sGXsfl_334_idx ;
      nRcdDeleted_61 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_61_" + sGXsfl_334_idx ;
      nRcdExists_61 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_61_" + sGXsfl_334_idx ;
      nIsMod_61 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      if ( ( nRcdDeleted_61 == 0 ) && ( nIsMod_61 == 1 ) && ! (GXutil.strcmp("", A830Tran_Archivo)==0) )
      {
         edtTran_Archivo_Filename = httpContext.cgiGetFileName( edtTran_Archivo_Internalname) ;
         edtTran_Archivo_Filetype = httpContext.cgiGetFileType( edtTran_Archivo_Internalname) ;
      }
      if ( (GXutil.strcmp("", A830Tran_Archivo)==0) )
      {
         GXCCtl = "TRAN_ARCHIVO_" + sGXsfl_334_idx ;
         GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
         A830Tran_Archivo = httpContext.cgiGet( GXCCtlgxBlob) ;
         n830Tran_Archivo = false ;
      }
   }

   public void assign_properties_default( )
   {
      defedtTran_Nro_Documento_Enabled = edtTran_Nro_Documento_Enabled ;
   }

   public void confirmValues050( )
   {
      nGXsfl_334_idx = (short)(0) ;
      sGXsfl_334_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_334_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_33461( ) ;
      while ( nGXsfl_334_idx < nRC_GXsfl_334 )
      {
         nGXsfl_334_idx = (short)(nGXsfl_334_idx+1) ;
         sGXsfl_334_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_334_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_33461( ) ;
         httpContext.changePostValue( "Z827Tran_Nro_Documento_"+sGXsfl_334_idx, httpContext.cgiGet( "ZT_"+"Z827Tran_Nro_Documento_"+sGXsfl_334_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z827Tran_Nro_Documento_"+sGXsfl_334_idx) ;
         httpContext.changePostValue( "Z831Tran_Ruta_Archivo_"+sGXsfl_334_idx, httpContext.cgiGet( "ZT_"+"Z831Tran_Ruta_Archivo_"+sGXsfl_334_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z831Tran_Ruta_Archivo_"+sGXsfl_334_idx) ;
      }
   }

   public void renderHtmlHeaders( )
   {
      com.orions2.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      MasterPageObj.master_styles();
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414132375");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_transaccion") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV33Tran_Id,11,0)))+"\">") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z46Tran_Id", GXutil.ltrim( localUtil.ntoc( Z46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z55Tran_FechaRegistro", localUtil.ttoc( Z55Tran_FechaRegistro, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z58Tran_Estado", GXutil.rtrim( Z58Tran_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z110Tran_ModuloOrigen", Z110Tran_ModuloOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z109Tran_CodAlmaOrigen", Z109Tran_CodAlmaOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z112Tran_CodBodeOrigen", Z112Tran_CodBodeOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z385Tran_ModuloDestino", Z385Tran_ModuloDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z111Tran_CodAlmaDestino", Z111Tran_CodAlmaDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z387Tran_CodBodeDestino", Z387Tran_CodBodeDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z407Tran_AreadanteCodigo", Z407Tran_AreadanteCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z408Tran_CursoCodigo", Z408Tran_CursoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z483Tran_ValorTransaccion", GXutil.ltrim( localUtil.ntoc( Z483Tran_ValorTransaccion, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z498Tran_NumeroLineas", GXutil.ltrim( localUtil.ntoc( Z498Tran_NumeroLineas, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z390Tran_FechaRatificacion", localUtil.ttoc( Z390Tran_FechaRatificacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z391Tran_UsuarioRatifica", Z391Tran_UsuarioRatifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z513Tran_ConsecutivoCC", GXutil.ltrim( localUtil.ntoc( Z513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z514Tran_NumeroIngreso", GXutil.rtrim( Z514Tran_NumeroIngreso));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z515Tran_FechaIngreso", localUtil.dtoc( Z515Tran_FechaIngreso, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z524Tran_Detalle", GXutil.rtrim( Z524Tran_Detalle));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z527Tran_TipoEntra", GXutil.rtrim( Z527Tran_TipoEntra));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z568Tran_CantidadPadres", GXutil.ltrim( localUtil.ntoc( Z568Tran_CantidadPadres, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z667Tran_NumeroGrupo", GXutil.ltrim( localUtil.ntoc( Z667Tran_NumeroGrupo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z668Tran_UsuarioEliminaoAnula", Z668Tran_UsuarioEliminaoAnula);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z669Tran_FechaEliminaoAnula", localUtil.ttoc( Z669Tran_FechaEliminaoAnula, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z670Tran_ObservacionesAnula", Z670Tran_ObservacionesAnula);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z719Tran_TransaccResponsabilidad", GXutil.ltrim( localUtil.ntoc( Z719Tran_TransaccResponsabilidad, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z720Tran_FechaResponsabilidad", localUtil.dtoc( Z720Tran_FechaResponsabilidad, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z758Tran_TablaResponsabilidad", GXutil.ltrim( localUtil.ntoc( Z758Tran_TablaResponsabilidad, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z859Tran_EntidadGobierno", Z859Tran_EntidadGobierno);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z47Tran_UsuarioId", GXutil.ltrim( localUtil.ntoc( Z47Tran_UsuarioId, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z48Tran_CentroCostoId", GXutil.ltrim( localUtil.ntoc( Z48Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z50Tran_CentroCostoIdDestino", GXutil.ltrim( localUtil.ntoc( Z50Tran_CentroCostoIdDestino, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z49Tran_CodigoMovimiento", Z49Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z51Tran_IdCuentadanteOrigen", GXutil.ltrim( localUtil.ntoc( Z51Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z53Tran_IdProveedor", GXutil.ltrim( localUtil.ntoc( Z53Tran_IdProveedor, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z52Tran_IdCuentadanteDestino", GXutil.ltrim( localUtil.ntoc( Z52Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z56Tran_IdCuentadanteResponsabili", GXutil.ltrim( localUtil.ntoc( Z56Tran_IdCuentadanteResponsabili, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z54Tran_TipoIngreso", GXutil.ltrim( localUtil.ntoc( Z54Tran_TipoIngreso, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_334", GXutil.ltrim( localUtil.ntoc( nGXsfl_334_idx, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N47Tran_UsuarioId", GXutil.ltrim( localUtil.ntoc( A47Tran_UsuarioId, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N48Tran_CentroCostoId", GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N51Tran_IdCuentadanteOrigen", GXutil.ltrim( localUtil.ntoc( A51Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N53Tran_IdProveedor", GXutil.ltrim( localUtil.ntoc( A53Tran_IdProveedor, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N52Tran_IdCuentadanteDestino", GXutil.ltrim( localUtil.ntoc( A52Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N54Tran_TipoIngreso", GXutil.ltrim( localUtil.ntoc( A54Tran_TipoIngreso, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N50Tran_CentroCostoIdDestino", GXutil.ltrim( localUtil.ntoc( A50Tran_CentroCostoIdDestino, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N56Tran_IdCuentadanteResponsabili", GXutil.ltrim( localUtil.ntoc( A56Tran_IdCuentadanteResponsabili, (byte)(18), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV37TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV37TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vEXISTECUENTADANTEDESTINO", GXutil.rtrim( AV14ExisteCuentadanteDestino));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CODIGOMOVIMIENTO", AV7Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV33Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRAN_USUARIOID", GXutil.ltrim( localUtil.ntoc( AV26Insert_Tran_UsuarioId, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vIDUSUARIO", GXutil.ltrim( localUtil.ntoc( AV15IdUsuario, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRAN_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( AV19Insert_Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRAN_CODIGOMOVIMIENTO", AV21Insert_Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRAN_IDCUENTADANTEORIGEN", GXutil.ltrim( localUtil.ntoc( AV24Insert_Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRAN_IDPROVEEDOR", GXutil.ltrim( localUtil.ntoc( AV25Insert_Tran_IdProveedor, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRAN_IDCUENTADANTEDESTINO", GXutil.ltrim( localUtil.ntoc( AV23Insert_Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRAN_TIPOINGRESO", GXutil.ltrim( localUtil.ntoc( AV44Insert_Tran_TipoIngreso, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRAN_CENTROCOSTOIDDESTINO", GXutil.ltrim( localUtil.ntoc( AV20Insert_Tran_CentroCostoIdDestino, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRAN_IDCUENTADANTERESPONSABILIDAD", GXutil.ltrim( localUtil.ntoc( AV45Insert_Tran_IdCuentadanteResponsabilidad, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCONSECUTIVOCC", AV11ConsecutivoCC);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV47Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHARATIFICACION", getSecureSignedToken( "", localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33Tran_Id), "ZZZZZZZZZZ9")));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_TRANSACCION" ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99") ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_transaccion:[SendSecurityCheck]"+forbiddenHiddens);
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.writeTextNL( "</form>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
   }

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      com.orions2.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.orions2.alm_transaccion") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV33Tran_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_TRANSACCION" ;
   }

   public String getPgmdesc( )
   {
      return "TRANSACCIÓN" ;
   }

   public void initializeNonKey057( )
   {
      A47Tran_UsuarioId = 0 ;
      n47Tran_UsuarioId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A47Tran_UsuarioId", GXutil.ltrim( GXutil.str( A47Tran_UsuarioId, 18, 0)));
      n47Tran_UsuarioId = ((0==A47Tran_UsuarioId) ? true : false) ;
      A48Tran_CentroCostoId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
      A49Tran_CodigoMovimiento = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A49Tran_CodigoMovimiento", A49Tran_CodigoMovimiento);
      A51Tran_IdCuentadanteOrigen = 0 ;
      n51Tran_IdCuentadanteOrigen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A51Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( A51Tran_IdCuentadanteOrigen, 18, 0)));
      n51Tran_IdCuentadanteOrigen = ((0==A51Tran_IdCuentadanteOrigen) ? true : false) ;
      A53Tran_IdProveedor = 0 ;
      n53Tran_IdProveedor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A53Tran_IdProveedor", GXutil.ltrim( GXutil.str( A53Tran_IdProveedor, 18, 0)));
      n53Tran_IdProveedor = ((0==A53Tran_IdProveedor) ? true : false) ;
      A52Tran_IdCuentadanteDestino = 0 ;
      n52Tran_IdCuentadanteDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A52Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( A52Tran_IdCuentadanteDestino, 18, 0)));
      n52Tran_IdCuentadanteDestino = ((0==A52Tran_IdCuentadanteDestino) ? true : false) ;
      A54Tran_TipoIngreso = 0 ;
      n54Tran_TipoIngreso = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
      n54Tran_TipoIngreso = ((0==A54Tran_TipoIngreso) ? true : false) ;
      A50Tran_CentroCostoIdDestino = 0 ;
      n50Tran_CentroCostoIdDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A50Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( A50Tran_CentroCostoIdDestino, 11, 0)));
      n50Tran_CentroCostoIdDestino = ((0==A50Tran_CentroCostoIdDestino) ? true : false) ;
      A56Tran_IdCuentadanteResponsabili = 0 ;
      n56Tran_IdCuentadanteResponsabili = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A56Tran_IdCuentadanteResponsabili", GXutil.ltrim( GXutil.str( A56Tran_IdCuentadanteResponsabili, 18, 0)));
      n56Tran_IdCuentadanteResponsabili = ((0==A56Tran_IdCuentadanteResponsabili) ? true : false) ;
      A58Tran_Estado = "" ;
      n58Tran_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A58Tran_Estado", A58Tran_Estado);
      n58Tran_Estado = ((GXutil.strcmp("", A58Tran_Estado)==0) ? true : false) ;
      AV11ConsecutivoCC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ConsecutivoCC", AV11ConsecutivoCC);
      A417Tran_UsuarioCodigo = "" ;
      n417Tran_UsuarioCodigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A417Tran_UsuarioCodigo", A417Tran_UsuarioCodigo);
      A418Tran_UsuarioNombre = "" ;
      n418Tran_UsuarioNombre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A418Tran_UsuarioNombre", A418Tran_UsuarioNombre);
      A419Tran_CentroCostoCodigo = "" ;
      n419Tran_CentroCostoCodigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A419Tran_CentroCostoCodigo", A419Tran_CentroCostoCodigo);
      A420Tran_CentroCostoDescripcion = "" ;
      n420Tran_CentroCostoDescripcion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A420Tran_CentroCostoDescripcion", A420Tran_CentroCostoDescripcion);
      A57Tran_RegionId = 0 ;
      n57Tran_RegionId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A57Tran_RegionId", GXutil.ltrim( GXutil.str( A57Tran_RegionId, 11, 0)));
      A421Tran_RegionCodigo = (short)(0) ;
      n421Tran_RegionCodigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A421Tran_RegionCodigo", GXutil.ltrim( GXutil.str( A421Tran_RegionCodigo, 4, 0)));
      A422Tran_RegionDescripcion = "" ;
      n422Tran_RegionDescripcion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A422Tran_RegionDescripcion", A422Tran_RegionDescripcion);
      A594Tran_RegionAbrev = "" ;
      n594Tran_RegionAbrev = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A594Tran_RegionAbrev", A594Tran_RegionAbrev);
      A381Tran_DescripcionMovimiento = "" ;
      n381Tran_DescripcionMovimiento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A381Tran_DescripcionMovimiento", A381Tran_DescripcionMovimiento);
      A478Tran_IndAreadante = "" ;
      n478Tran_IndAreadante = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
      A481Tran_IndE_S = "" ;
      n481Tran_IndE_S = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A481Tran_IndE_S", A481Tran_IndE_S);
      A479Tran_IndCurso = "" ;
      n479Tran_IndCurso = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A479Tran_IndCurso", A479Tran_IndCurso);
      A499Tran_CodTipoElemento = 0 ;
      n499Tran_CodTipoElemento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A499Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( A499Tran_CodTipoElemento, 18, 0)));
      A482Tran_TipoElemento = "" ;
      n482Tran_TipoElemento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
      A707Tran_SolicitaCCDestino = "" ;
      n707Tran_SolicitaCCDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
      A708Tran_SolicitaRegionDestino = "" ;
      n708Tran_SolicitaRegionDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
      A754Tran_CuentaResponsabilidad = "" ;
      n754Tran_CuentaResponsabilidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
      A110Tran_ModuloOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A110Tran_ModuloOrigen", A110Tran_ModuloOrigen);
      A109Tran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A109Tran_CodAlmaOrigen", A109Tran_CodAlmaOrigen);
      A112Tran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A112Tran_CodBodeOrigen", A112Tran_CodBodeOrigen);
      A384Tran_NombCuentadanteOrigen = "" ;
      n384Tran_NombCuentadanteOrigen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A384Tran_NombCuentadanteOrigen", A384Tran_NombCuentadanteOrigen);
      A702Tran_CedulaCuentadanteOrigen = 0 ;
      n702Tran_CedulaCuentadanteOrigen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A702Tran_CedulaCuentadanteOrigen", GXutil.ltrim( GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0)));
      A714Tran_EmailCuentadanteOrigen = "" ;
      n714Tran_EmailCuentadanteOrigen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A714Tran_EmailCuentadanteOrigen", A714Tran_EmailCuentadanteOrigen);
      A575Tran_NombreProveedor = "" ;
      n575Tran_NombreProveedor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A575Tran_NombreProveedor", A575Tran_NombreProveedor);
      A703Tran_CedulaProveedor = 0 ;
      n703Tran_CedulaProveedor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A703Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( A703Tran_CedulaProveedor, 18, 0)));
      A385Tran_ModuloDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A385Tran_ModuloDestino", A385Tran_ModuloDestino);
      A111Tran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A111Tran_CodAlmaDestino", A111Tran_CodAlmaDestino);
      A387Tran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A387Tran_CodBodeDestino", A387Tran_CodBodeDestino);
      A389Tran_NombCuentadanteDestino = "" ;
      n389Tran_NombCuentadanteDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A389Tran_NombCuentadanteDestino", A389Tran_NombCuentadanteDestino);
      A704Tran_CedulaCuentadanteDestino = 0 ;
      n704Tran_CedulaCuentadanteDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A704Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0)));
      A715Tran_EmailCuentadanteDestino = "" ;
      n715Tran_EmailCuentadanteDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A715Tran_EmailCuentadanteDestino", A715Tran_EmailCuentadanteDestino);
      A416Tran_Observaciones = "" ;
      n416Tran_Observaciones = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A416Tran_Observaciones", A416Tran_Observaciones);
      n416Tran_Observaciones = ((GXutil.strcmp("", A416Tran_Observaciones)==0) ? true : false) ;
      A407Tran_AreadanteCodigo = "" ;
      n407Tran_AreadanteCodigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407Tran_AreadanteCodigo", A407Tran_AreadanteCodigo);
      n407Tran_AreadanteCodigo = ((GXutil.strcmp("", A407Tran_AreadanteCodigo)==0) ? true : false) ;
      A408Tran_CursoCodigo = "" ;
      n408Tran_CursoCodigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A408Tran_CursoCodigo", A408Tran_CursoCodigo);
      n408Tran_CursoCodigo = ((GXutil.strcmp("", A408Tran_CursoCodigo)==0) ? true : false) ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      n483Tran_ValorTransaccion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A483Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( A483Tran_ValorTransaccion, 18, 2)));
      n483Tran_ValorTransaccion = ((DecimalUtil.compareTo(DecimalUtil.ZERO, A483Tran_ValorTransaccion)==0) ? true : false) ;
      A498Tran_NumeroLineas = 0 ;
      n498Tran_NumeroLineas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A498Tran_NumeroLineas", GXutil.ltrim( GXutil.str( A498Tran_NumeroLineas, 18, 0)));
      n498Tran_NumeroLineas = ((0==A498Tran_NumeroLineas) ? true : false) ;
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      n390Tran_FechaRatificacion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A390Tran_FechaRatificacion", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 5, 0, 3, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_TRAN_FECHARATIFICACION", getSecureSignedToken( "", localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
      n390Tran_FechaRatificacion = (GXutil.dateCompare(GXutil.nullDate(), A390Tran_FechaRatificacion) ? true : false) ;
      A391Tran_UsuarioRatifica = "" ;
      n391Tran_UsuarioRatifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A391Tran_UsuarioRatifica", A391Tran_UsuarioRatifica);
      n391Tran_UsuarioRatifica = ((GXutil.strcmp("", A391Tran_UsuarioRatifica)==0) ? true : false) ;
      A513Tran_ConsecutivoCC = 0 ;
      n513Tran_ConsecutivoCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A513Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( A513Tran_ConsecutivoCC, 18, 0)));
      n513Tran_ConsecutivoCC = ((0==A513Tran_ConsecutivoCC) ? true : false) ;
      A672Tran_NombreIngreso = "" ;
      n672Tran_NombreIngreso = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A672Tran_NombreIngreso", A672Tran_NombreIngreso);
      A756Tran_Abreviado = "" ;
      n756Tran_Abreviado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A756Tran_Abreviado", A756Tran_Abreviado);
      A514Tran_NumeroIngreso = "" ;
      n514Tran_NumeroIngreso = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A514Tran_NumeroIngreso", A514Tran_NumeroIngreso);
      n514Tran_NumeroIngreso = ((GXutil.strcmp("", A514Tran_NumeroIngreso)==0) ? true : false) ;
      A515Tran_FechaIngreso = GXutil.nullDate() ;
      n515Tran_FechaIngreso = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A515Tran_FechaIngreso", localUtil.format(A515Tran_FechaIngreso, "99/99/99"));
      n515Tran_FechaIngreso = (GXutil.dateCompare(GXutil.nullDate(), A515Tran_FechaIngreso) ? true : false) ;
      A516Tran_CentroCostoCodigoDestino = "" ;
      n516Tran_CentroCostoCodigoDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A516Tran_CentroCostoCodigoDestino", A516Tran_CentroCostoCodigoDestino);
      A517Tran_CentroCostoDescripcionDes = "" ;
      n517Tran_CentroCostoDescripcionDes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A517Tran_CentroCostoDescripcionDes", A517Tran_CentroCostoDescripcionDes);
      A518Tran_RegionIdDestino = 0 ;
      n518Tran_RegionIdDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A518Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( A518Tran_RegionIdDestino, 11, 0)));
      A519Tran_RegionCodigoDestino = (short)(0) ;
      n519Tran_RegionCodigoDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A519Tran_RegionCodigoDestino", GXutil.ltrim( GXutil.str( A519Tran_RegionCodigoDestino, 4, 0)));
      A520Tran_RegionDescripcionDestino = "" ;
      n520Tran_RegionDescripcionDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A520Tran_RegionDescripcionDestino", A520Tran_RegionDescripcionDestino);
      A608Tran_RegionAbrevDestino = "" ;
      n608Tran_RegionAbrevDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A608Tran_RegionAbrevDestino", A608Tran_RegionAbrevDestino);
      A524Tran_Detalle = "" ;
      n524Tran_Detalle = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A524Tran_Detalle", A524Tran_Detalle);
      n524Tran_Detalle = ((GXutil.strcmp("", A524Tran_Detalle)==0) ? true : false) ;
      A527Tran_TipoEntra = "" ;
      n527Tran_TipoEntra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
      n527Tran_TipoEntra = ((GXutil.strcmp("", A527Tran_TipoEntra)==0) ? true : false) ;
      A568Tran_CantidadPadres = 0 ;
      n568Tran_CantidadPadres = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A568Tran_CantidadPadres", GXutil.ltrim( GXutil.str( A568Tran_CantidadPadres, 8, 0)));
      n568Tran_CantidadPadres = ((0==A568Tran_CantidadPadres) ? true : false) ;
      A667Tran_NumeroGrupo = (short)(0) ;
      n667Tran_NumeroGrupo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A667Tran_NumeroGrupo", GXutil.ltrim( GXutil.str( A667Tran_NumeroGrupo, 4, 0)));
      n667Tran_NumeroGrupo = ((0==A667Tran_NumeroGrupo) ? true : false) ;
      A668Tran_UsuarioEliminaoAnula = "" ;
      n668Tran_UsuarioEliminaoAnula = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A668Tran_UsuarioEliminaoAnula", A668Tran_UsuarioEliminaoAnula);
      n668Tran_UsuarioEliminaoAnula = ((GXutil.strcmp("", A668Tran_UsuarioEliminaoAnula)==0) ? true : false) ;
      A669Tran_FechaEliminaoAnula = GXutil.resetTime( GXutil.nullDate() );
      n669Tran_FechaEliminaoAnula = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A669Tran_FechaEliminaoAnula", localUtil.ttoc( A669Tran_FechaEliminaoAnula, 8, 5, 0, 3, "/", ":", " "));
      n669Tran_FechaEliminaoAnula = (GXutil.dateCompare(GXutil.nullDate(), A669Tran_FechaEliminaoAnula) ? true : false) ;
      A670Tran_ObservacionesAnula = "" ;
      n670Tran_ObservacionesAnula = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A670Tran_ObservacionesAnula", A670Tran_ObservacionesAnula);
      n670Tran_ObservacionesAnula = ((GXutil.strcmp("", A670Tran_ObservacionesAnula)==0) ? true : false) ;
      A759Tran_CedulaResponsabilidad = 0 ;
      n759Tran_CedulaResponsabilidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A759Tran_CedulaResponsabilidad", GXutil.ltrim( GXutil.str( A759Tran_CedulaResponsabilidad, 18, 0)));
      A721Tran_NombreCuentadanteResponsa = "" ;
      n721Tran_NombreCuentadanteResponsa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A721Tran_NombreCuentadanteResponsa", A721Tran_NombreCuentadanteResponsa);
      A719Tran_TransaccResponsabilidad = 0 ;
      n719Tran_TransaccResponsabilidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( A719Tran_TransaccResponsabilidad, 11, 0)));
      n719Tran_TransaccResponsabilidad = ((0==A719Tran_TransaccResponsabilidad) ? true : false) ;
      A720Tran_FechaResponsabilidad = GXutil.nullDate() ;
      n720Tran_FechaResponsabilidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A720Tran_FechaResponsabilidad", localUtil.format(A720Tran_FechaResponsabilidad, "99/99/99"));
      n720Tran_FechaResponsabilidad = (GXutil.dateCompare(GXutil.nullDate(), A720Tran_FechaResponsabilidad) ? true : false) ;
      A758Tran_TablaResponsabilidad = (short)(0) ;
      n758Tran_TablaResponsabilidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A758Tran_TablaResponsabilidad", GXutil.ltrim( GXutil.str( A758Tran_TablaResponsabilidad, 4, 0)));
      n758Tran_TablaResponsabilidad = ((0==A758Tran_TablaResponsabilidad) ? true : false) ;
      A859Tran_EntidadGobierno = "" ;
      n859Tran_EntidadGobierno = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A859Tran_EntidadGobierno", A859Tran_EntidadGobierno);
      n859Tran_EntidadGobierno = ((GXutil.strcmp("", A859Tran_EntidadGobierno)==0) ? true : false) ;
      A55Tran_FechaRegistro = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
      Z55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      Z58Tran_Estado = "" ;
      Z110Tran_ModuloOrigen = "" ;
      Z109Tran_CodAlmaOrigen = "" ;
      Z112Tran_CodBodeOrigen = "" ;
      Z385Tran_ModuloDestino = "" ;
      Z111Tran_CodAlmaDestino = "" ;
      Z387Tran_CodBodeDestino = "" ;
      Z407Tran_AreadanteCodigo = "" ;
      Z408Tran_CursoCodigo = "" ;
      Z483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      Z498Tran_NumeroLineas = 0 ;
      Z390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      Z391Tran_UsuarioRatifica = "" ;
      Z513Tran_ConsecutivoCC = 0 ;
      Z514Tran_NumeroIngreso = "" ;
      Z515Tran_FechaIngreso = GXutil.nullDate() ;
      Z524Tran_Detalle = "" ;
      Z527Tran_TipoEntra = "" ;
      Z568Tran_CantidadPadres = 0 ;
      Z667Tran_NumeroGrupo = (short)(0) ;
      Z668Tran_UsuarioEliminaoAnula = "" ;
      Z669Tran_FechaEliminaoAnula = GXutil.resetTime( GXutil.nullDate() );
      Z670Tran_ObservacionesAnula = "" ;
      Z719Tran_TransaccResponsabilidad = 0 ;
      Z720Tran_FechaResponsabilidad = GXutil.nullDate() ;
      Z758Tran_TablaResponsabilidad = (short)(0) ;
      Z859Tran_EntidadGobierno = "" ;
      Z47Tran_UsuarioId = 0 ;
      Z48Tran_CentroCostoId = 0 ;
      Z50Tran_CentroCostoIdDestino = 0 ;
      Z49Tran_CodigoMovimiento = "" ;
      Z51Tran_IdCuentadanteOrigen = 0 ;
      Z53Tran_IdProveedor = 0 ;
      Z52Tran_IdCuentadanteDestino = 0 ;
      Z56Tran_IdCuentadanteResponsabili = 0 ;
      Z54Tran_TipoIngreso = 0 ;
   }

   public void initAll057( )
   {
      A46Tran_Id = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A46Tran_Id", GXutil.ltrim( GXutil.str( A46Tran_Id, 11, 0)));
      initializeNonKey057( ) ;
   }

   public void standaloneModalInsert( )
   {
      A55Tran_FechaRegistro = i55Tran_FechaRegistro ;
      httpContext.ajax_rsp_assign_attri("", false, "A55Tran_FechaRegistro", localUtil.ttoc( A55Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
   }

   public void initializeNonKey0561( )
   {
      A828Tran_Descrip_Documento = "" ;
      n828Tran_Descrip_Documento = false ;
      A829Tran_Prefijo_Documento = "" ;
      n829Tran_Prefijo_Documento = false ;
      A830Tran_Archivo = "" ;
      n830Tran_Archivo = false ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Archivo_Internalname, "URL", httpContext.getResourceRelative(A830Tran_Archivo), !bGXsfl_334_Refreshing);
      A831Tran_Ruta_Archivo = "" ;
      n831Tran_Ruta_Archivo = false ;
      Z831Tran_Ruta_Archivo = "" ;
   }

   public void initAll0561( )
   {
      A827Tran_Nro_Documento = (short)(0) ;
      initializeNonKey0561( ) ;
   }

   public void standaloneModalInsert0561( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414132465");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_transaccion.js", "?201861414132466");
      /* End function include_jscripts */
   }

   public void init_level_properties61( )
   {
      edtTran_Nro_Documento_Enabled = defedtTran_Nro_Documento_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTran_Nro_Documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTran_Nro_Documento_Enabled, 5, 0)), !bGXsfl_334_Refreshing);
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtTran_Id_Internalname = "TRAN_ID" ;
      edtTran_FechaRegistro_Internalname = "TRAN_FECHAREGISTRO" ;
      edtTran_UsuarioId_Internalname = "TRAN_USUARIOID" ;
      edtTran_UsuarioCodigo_Internalname = "TRAN_USUARIOCODIGO" ;
      edtTran_UsuarioNombre_Internalname = "TRAN_USUARIONOMBRE" ;
      edtTran_CentroCostoId_Internalname = "TRAN_CENTROCOSTOID" ;
      edtTran_CentroCostoCodigo_Internalname = "TRAN_CENTROCOSTOCODIGO" ;
      edtTran_CentroCostoDescripcion_Internalname = "TRAN_CENTROCOSTODESCRIPCION" ;
      edtTran_RegionId_Internalname = "TRAN_REGIONID" ;
      edtTran_RegionCodigo_Internalname = "TRAN_REGIONCODIGO" ;
      edtTran_RegionDescripcion_Internalname = "TRAN_REGIONDESCRIPCION" ;
      edtTran_RegionAbrev_Internalname = "TRAN_REGIONABREV" ;
      edtTran_CodigoMovimiento_Internalname = "TRAN_CODIGOMOVIMIENTO" ;
      edtTran_DescripcionMovimiento_Internalname = "TRAN_DESCRIPCIONMOVIMIENTO" ;
      cmbTran_IndAreadante.setInternalname( "TRAN_INDAREADANTE" );
      cmbTran_IndE_S.setInternalname( "TRAN_INDE_S" );
      cmbTran_IndCurso.setInternalname( "TRAN_INDCURSO" );
      edtTran_CodTipoElemento_Internalname = "TRAN_CODTIPOELEMENTO" ;
      cmbTran_TipoElemento.setInternalname( "TRAN_TIPOELEMENTO" );
      cmbTran_SolicitaCCDestino.setInternalname( "TRAN_SOLICITACCDESTINO" );
      cmbTran_SolicitaRegionDestino.setInternalname( "TRAN_SOLICITAREGIONDESTINO" );
      cmbTran_CuentaResponsabilidad.setInternalname( "TRAN_CUENTARESPONSABILIDAD" );
      edtTran_ModuloOrigen_Internalname = "TRAN_MODULOORIGEN" ;
      edtTran_CodAlmaOrigen_Internalname = "TRAN_CODALMAORIGEN" ;
      edtTran_CodBodeOrigen_Internalname = "TRAN_CODBODEORIGEN" ;
      edtTran_IdCuentadanteOrigen_Internalname = "TRAN_IDCUENTADANTEORIGEN" ;
      edtTran_NombCuentadanteOrigen_Internalname = "TRAN_NOMBCUENTADANTEORIGEN" ;
      edtTran_CedulaCuentadanteOrigen_Internalname = "TRAN_CEDULACUENTADANTEORIGEN" ;
      edtTran_EmailCuentadanteOrigen_Internalname = "TRAN_EMAILCUENTADANTEORIGEN" ;
      edtTran_IdProveedor_Internalname = "TRAN_IDPROVEEDOR" ;
      edtTran_NombreProveedor_Internalname = "TRAN_NOMBREPROVEEDOR" ;
      edtTran_CedulaProveedor_Internalname = "TRAN_CEDULAPROVEEDOR" ;
      edtTran_ModuloDestino_Internalname = "TRAN_MODULODESTINO" ;
      edtTran_CodAlmaDestino_Internalname = "TRAN_CODALMADESTINO" ;
      edtTran_CodBodeDestino_Internalname = "TRAN_CODBODEDESTINO" ;
      edtTran_IdCuentadanteDestino_Internalname = "TRAN_IDCUENTADANTEDESTINO" ;
      edtTran_NombCuentadanteDestino_Internalname = "TRAN_NOMBCUENTADANTEDESTINO" ;
      edtTran_CedulaCuentadanteDestino_Internalname = "TRAN_CEDULACUENTADANTEDESTINO" ;
      edtTran_EmailCuentadanteDestino_Internalname = "TRAN_EMAILCUENTADANTEDESTINO" ;
      edtTran_Observaciones_Internalname = "TRAN_OBSERVACIONES" ;
      edtTran_AreadanteCodigo_Internalname = "TRAN_AREADANTECODIGO" ;
      edtTran_CursoCodigo_Internalname = "TRAN_CURSOCODIGO" ;
      edtTran_ValorTransaccion_Internalname = "TRAN_VALORTRANSACCION" ;
      edtTran_NumeroLineas_Internalname = "TRAN_NUMEROLINEAS" ;
      cmbTran_Estado.setInternalname( "TRAN_ESTADO" );
      edtTran_FechaRatificacion_Internalname = "TRAN_FECHARATIFICACION" ;
      edtTran_UsuarioRatifica_Internalname = "TRAN_USUARIORATIFICA" ;
      edtTran_ConsecutivoCC_Internalname = "TRAN_CONSECUTIVOCC" ;
      cmbTran_TipoIngreso.setInternalname( "TRAN_TIPOINGRESO" );
      edtTran_NombreIngreso_Internalname = "TRAN_NOMBREINGRESO" ;
      edtTran_Abreviado_Internalname = "TRAN_ABREVIADO" ;
      edtTran_NumeroIngreso_Internalname = "TRAN_NUMEROINGRESO" ;
      edtTran_FechaIngreso_Internalname = "TRAN_FECHAINGRESO" ;
      edtTran_CentroCostoIdDestino_Internalname = "TRAN_CENTROCOSTOIDDESTINO" ;
      edtTran_CentroCostoCodigoDestino_Internalname = "TRAN_CENTROCOSTOCODIGODESTINO" ;
      edtTran_CentroCostoDescripcionDes_Internalname = "TRAN_CENTROCOSTODESCRIPCIONDES" ;
      edtTran_RegionIdDestino_Internalname = "TRAN_REGIONIDDESTINO" ;
      edtTran_RegionCodigoDestino_Internalname = "TRAN_REGIONCODIGODESTINO" ;
      edtTran_RegionDescripcionDestino_Internalname = "TRAN_REGIONDESCRIPCIONDESTINO" ;
      edtTran_RegionAbrevDestino_Internalname = "TRAN_REGIONABREVDESTINO" ;
      edtTran_Detalle_Internalname = "TRAN_DETALLE" ;
      cmbTran_TipoEntra.setInternalname( "TRAN_TIPOENTRA" );
      edtTran_CantidadPadres_Internalname = "TRAN_CANTIDADPADRES" ;
      edtTran_NumeroGrupo_Internalname = "TRAN_NUMEROGRUPO" ;
      edtTran_UsuarioEliminaoAnula_Internalname = "TRAN_USUARIOELIMINAOANULA" ;
      edtTran_FechaEliminaoAnula_Internalname = "TRAN_FECHAELIMINAOANULA" ;
      edtTran_ObservacionesAnula_Internalname = "TRAN_OBSERVACIONESANULA" ;
      edtTran_IdCuentadanteResponsabili_Internalname = "TRAN_IDCUENTADANTERESPONSABILI" ;
      edtTran_CedulaResponsabilidad_Internalname = "TRAN_CEDULARESPONSABILIDAD" ;
      edtTran_NombreCuentadanteResponsa_Internalname = "TRAN_NOMBRECUENTADANTERESPONSA" ;
      edtTran_TransaccResponsabilidad_Internalname = "TRAN_TRANSACCRESPONSABILIDAD" ;
      edtTran_FechaResponsabilidad_Internalname = "TRAN_FECHARESPONSABILIDAD" ;
      edtTran_TablaResponsabilidad_Internalname = "TRAN_TABLARESPONSABILIDAD" ;
      cmbTran_EntidadGobierno.setInternalname( "TRAN_ENTIDADGOBIERNO" );
      lblTitledocumentos_Internalname = "TITLEDOCUMENTOS" ;
      edtTran_Nro_Documento_Internalname = "TRAN_NRO_DOCUMENTO" ;
      edtTran_Descrip_Documento_Internalname = "TRAN_DESCRIP_DOCUMENTO" ;
      edtTran_Prefijo_Documento_Internalname = "TRAN_PREFIJO_DOCUMENTO" ;
      edtTran_Archivo_Internalname = "TRAN_ARCHIVO" ;
      edtTran_Ruta_Archivo_Internalname = "TRAN_RUTA_ARCHIVO" ;
      divDocumentostable_Internalname = "DOCUMENTOSTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_47_Internalname = "PROMPT_47" ;
      imgprompt_48_Internalname = "PROMPT_48" ;
      imgprompt_49_Internalname = "PROMPT_49" ;
      imgprompt_51_Internalname = "PROMPT_51" ;
      imgprompt_53_Internalname = "PROMPT_53" ;
      imgprompt_52_Internalname = "PROMPT_52" ;
      imgprompt_50_Internalname = "PROMPT_50" ;
      imgprompt_56_Internalname = "PROMPT_56" ;
      imgprompt_827_Internalname = "PROMPT_827" ;
      subGridalm_transaccion_documentos_Internalname = "GRIDALM_TRANSACCION_DOCUMENTOS" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "TRANSACCIÓN" );
      edtTran_Archivo_Filename = "" ;
      edtTran_Ruta_Archivo_Jsonclick = "" ;
      edtTran_Archivo_Jsonclick = "" ;
      edtTran_Archivo_Parameters = "" ;
      edtTran_Archivo_Contenttype = "" ;
      edtTran_Archivo_Filetype = "" ;
      edtTran_Prefijo_Documento_Jsonclick = "" ;
      edtTran_Descrip_Documento_Jsonclick = "" ;
      imgprompt_827_Visible = 1 ;
      imgprompt_827_Link = "" ;
      imgprompt_47_Visible = 1 ;
      edtTran_Nro_Documento_Jsonclick = "" ;
      subGridalm_transaccion_documentos_Class = "Grid" ;
      subGridalm_transaccion_documentos_Backcolorstyle = (byte)(0) ;
      subGridalm_transaccion_documentos_Allowcollapsing = (byte)(0) ;
      subGridalm_transaccion_documentos_Allowselection = (byte)(0) ;
      edtTran_Ruta_Archivo_Enabled = 1 ;
      edtTran_Archivo_Enabled = 1 ;
      edtTran_Prefijo_Documento_Enabled = 0 ;
      edtTran_Descrip_Documento_Enabled = 0 ;
      edtTran_Nro_Documento_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbTran_EntidadGobierno.setJsonclick( "" );
      cmbTran_EntidadGobierno.setEnabled( 1 );
      edtTran_TablaResponsabilidad_Jsonclick = "" ;
      edtTran_TablaResponsabilidad_Enabled = 1 ;
      edtTran_FechaResponsabilidad_Jsonclick = "" ;
      edtTran_FechaResponsabilidad_Enabled = 1 ;
      edtTran_TransaccResponsabilidad_Jsonclick = "" ;
      edtTran_TransaccResponsabilidad_Enabled = 1 ;
      edtTran_NombreCuentadanteResponsa_Jsonclick = "" ;
      edtTran_NombreCuentadanteResponsa_Enabled = 0 ;
      edtTran_CedulaResponsabilidad_Jsonclick = "" ;
      edtTran_CedulaResponsabilidad_Enabled = 0 ;
      imgprompt_56_Visible = 1 ;
      imgprompt_56_Link = "" ;
      edtTran_IdCuentadanteResponsabili_Jsonclick = "" ;
      edtTran_IdCuentadanteResponsabili_Enabled = 1 ;
      edtTran_ObservacionesAnula_Enabled = 1 ;
      edtTran_FechaEliminaoAnula_Jsonclick = "" ;
      edtTran_FechaEliminaoAnula_Enabled = 1 ;
      edtTran_UsuarioEliminaoAnula_Jsonclick = "" ;
      edtTran_UsuarioEliminaoAnula_Enabled = 1 ;
      edtTran_NumeroGrupo_Jsonclick = "" ;
      edtTran_NumeroGrupo_Enabled = 1 ;
      edtTran_CantidadPadres_Jsonclick = "" ;
      edtTran_CantidadPadres_Enabled = 1 ;
      edtTran_CantidadPadres_Visible = 1 ;
      cmbTran_TipoEntra.setJsonclick( "" );
      cmbTran_TipoEntra.setEnabled( 1 );
      cmbTran_TipoEntra.setVisible( 1 );
      edtTran_Detalle_Jsonclick = "" ;
      edtTran_Detalle_Enabled = 1 ;
      edtTran_RegionAbrevDestino_Jsonclick = "" ;
      edtTran_RegionAbrevDestino_Enabled = 0 ;
      edtTran_RegionDescripcionDestino_Jsonclick = "" ;
      edtTran_RegionDescripcionDestino_Enabled = 0 ;
      edtTran_RegionCodigoDestino_Jsonclick = "" ;
      edtTran_RegionCodigoDestino_Enabled = 0 ;
      edtTran_RegionIdDestino_Jsonclick = "" ;
      edtTran_RegionIdDestino_Enabled = 0 ;
      edtTran_CentroCostoDescripcionDes_Jsonclick = "" ;
      edtTran_CentroCostoDescripcionDes_Enabled = 0 ;
      edtTran_CentroCostoCodigoDestino_Jsonclick = "" ;
      edtTran_CentroCostoCodigoDestino_Enabled = 0 ;
      imgprompt_50_Visible = 1 ;
      imgprompt_50_Link = "" ;
      edtTran_CentroCostoIdDestino_Jsonclick = "" ;
      edtTran_CentroCostoIdDestino_Enabled = 1 ;
      edtTran_FechaIngreso_Jsonclick = "" ;
      edtTran_FechaIngreso_Enabled = 1 ;
      edtTran_FechaIngreso_Visible = 1 ;
      edtTran_NumeroIngreso_Jsonclick = "" ;
      edtTran_NumeroIngreso_Enabled = 1 ;
      edtTran_NumeroIngreso_Visible = 1 ;
      edtTran_Abreviado_Jsonclick = "" ;
      edtTran_Abreviado_Enabled = 0 ;
      edtTran_NombreIngreso_Jsonclick = "" ;
      edtTran_NombreIngreso_Enabled = 0 ;
      cmbTran_TipoIngreso.setJsonclick( "" );
      cmbTran_TipoIngreso.setEnabled( 1 );
      cmbTran_TipoIngreso.setVisible( 1 );
      edtTran_ConsecutivoCC_Jsonclick = "" ;
      edtTran_ConsecutivoCC_Enabled = 1 ;
      edtTran_ConsecutivoCC_Visible = 1 ;
      edtTran_UsuarioRatifica_Jsonclick = "" ;
      edtTran_UsuarioRatifica_Enabled = 1 ;
      edtTran_FechaRatificacion_Jsonclick = "" ;
      edtTran_FechaRatificacion_Enabled = 0 ;
      cmbTran_Estado.setJsonclick( "" );
      cmbTran_Estado.setEnabled( 1 );
      edtTran_NumeroLineas_Jsonclick = "" ;
      edtTran_NumeroLineas_Enabled = 1 ;
      edtTran_ValorTransaccion_Jsonclick = "" ;
      edtTran_ValorTransaccion_Enabled = 1 ;
      edtTran_CursoCodigo_Jsonclick = "" ;
      edtTran_CursoCodigo_Enabled = 1 ;
      edtTran_CursoCodigo_Visible = 1 ;
      edtTran_AreadanteCodigo_Jsonclick = "" ;
      edtTran_AreadanteCodigo_Enabled = 1 ;
      edtTran_AreadanteCodigo_Visible = 1 ;
      edtTran_Observaciones_Enabled = 1 ;
      edtTran_EmailCuentadanteDestino_Jsonclick = "" ;
      edtTran_EmailCuentadanteDestino_Enabled = 0 ;
      edtTran_CedulaCuentadanteDestino_Jsonclick = "" ;
      edtTran_CedulaCuentadanteDestino_Enabled = 0 ;
      edtTran_NombCuentadanteDestino_Jsonclick = "" ;
      edtTran_NombCuentadanteDestino_Enabled = 0 ;
      imgprompt_52_Visible = 1 ;
      imgprompt_52_Link = "" ;
      edtTran_IdCuentadanteDestino_Jsonclick = "" ;
      edtTran_IdCuentadanteDestino_Enabled = 1 ;
      edtTran_CodBodeDestino_Jsonclick = "" ;
      edtTran_CodBodeDestino_Enabled = 1 ;
      edtTran_CodAlmaDestino_Jsonclick = "" ;
      edtTran_CodAlmaDestino_Enabled = 1 ;
      edtTran_ModuloDestino_Jsonclick = "" ;
      edtTran_ModuloDestino_Enabled = 1 ;
      edtTran_CedulaProveedor_Jsonclick = "" ;
      edtTran_CedulaProveedor_Enabled = 0 ;
      edtTran_NombreProveedor_Jsonclick = "" ;
      edtTran_NombreProveedor_Enabled = 0 ;
      imgprompt_53_Link = "" ;
      edtTran_IdProveedor_Jsonclick = "" ;
      edtTran_IdProveedor_Enabled = 1 ;
      edtTran_IdProveedor_Visible = 1 ;
      edtTran_EmailCuentadanteOrigen_Jsonclick = "" ;
      edtTran_EmailCuentadanteOrigen_Enabled = 0 ;
      edtTran_CedulaCuentadanteOrigen_Jsonclick = "" ;
      edtTran_CedulaCuentadanteOrigen_Enabled = 0 ;
      edtTran_NombCuentadanteOrigen_Jsonclick = "" ;
      edtTran_NombCuentadanteOrigen_Enabled = 0 ;
      imgprompt_51_Visible = 1 ;
      imgprompt_51_Link = "" ;
      edtTran_IdCuentadanteOrigen_Jsonclick = "" ;
      edtTran_IdCuentadanteOrigen_Enabled = 1 ;
      edtTran_CodBodeOrigen_Jsonclick = "" ;
      edtTran_CodBodeOrigen_Enabled = 1 ;
      edtTran_CodAlmaOrigen_Jsonclick = "" ;
      edtTran_CodAlmaOrigen_Enabled = 1 ;
      edtTran_ModuloOrigen_Jsonclick = "" ;
      edtTran_ModuloOrigen_Enabled = 1 ;
      cmbTran_CuentaResponsabilidad.setJsonclick( "" );
      cmbTran_CuentaResponsabilidad.setEnabled( 0 );
      cmbTran_SolicitaRegionDestino.setJsonclick( "" );
      cmbTran_SolicitaRegionDestino.setEnabled( 0 );
      cmbTran_SolicitaCCDestino.setJsonclick( "" );
      cmbTran_SolicitaCCDestino.setEnabled( 0 );
      cmbTran_TipoElemento.setJsonclick( "" );
      cmbTran_TipoElemento.setEnabled( 0 );
      cmbTran_TipoElemento.setVisible( 1 );
      edtTran_CodTipoElemento_Jsonclick = "" ;
      edtTran_CodTipoElemento_Enabled = 0 ;
      cmbTran_IndCurso.setJsonclick( "" );
      cmbTran_IndCurso.setEnabled( 0 );
      cmbTran_IndCurso.setVisible( 1 );
      cmbTran_IndE_S.setJsonclick( "" );
      cmbTran_IndE_S.setEnabled( 0 );
      cmbTran_IndE_S.setVisible( 1 );
      cmbTran_IndAreadante.setJsonclick( "" );
      cmbTran_IndAreadante.setEnabled( 0 );
      cmbTran_IndAreadante.setVisible( 1 );
      edtTran_DescripcionMovimiento_Jsonclick = "" ;
      edtTran_DescripcionMovimiento_Enabled = 0 ;
      imgprompt_49_Visible = 1 ;
      imgprompt_49_Link = "" ;
      edtTran_CodigoMovimiento_Jsonclick = "" ;
      edtTran_CodigoMovimiento_Enabled = 1 ;
      edtTran_RegionAbrev_Jsonclick = "" ;
      edtTran_RegionAbrev_Enabled = 0 ;
      edtTran_RegionDescripcion_Jsonclick = "" ;
      edtTran_RegionDescripcion_Enabled = 0 ;
      edtTran_RegionCodigo_Jsonclick = "" ;
      edtTran_RegionCodigo_Enabled = 0 ;
      edtTran_RegionId_Jsonclick = "" ;
      edtTran_RegionId_Enabled = 0 ;
      edtTran_RegionId_Visible = 1 ;
      edtTran_CentroCostoDescripcion_Jsonclick = "" ;
      edtTran_CentroCostoDescripcion_Enabled = 0 ;
      edtTran_CentroCostoCodigo_Jsonclick = "" ;
      edtTran_CentroCostoCodigo_Enabled = 0 ;
      imgprompt_48_Visible = 1 ;
      imgprompt_48_Link = "" ;
      edtTran_CentroCostoId_Jsonclick = "" ;
      edtTran_CentroCostoId_Enabled = 1 ;
      edtTran_UsuarioNombre_Jsonclick = "" ;
      edtTran_UsuarioNombre_Enabled = 0 ;
      edtTran_UsuarioNombre_Visible = 1 ;
      edtTran_UsuarioCodigo_Jsonclick = "" ;
      edtTran_UsuarioCodigo_Enabled = 0 ;
      edtTran_UsuarioCodigo_Visible = 1 ;
      imgprompt_47_Link = "" ;
      edtTran_UsuarioId_Jsonclick = "" ;
      edtTran_UsuarioId_Enabled = 1 ;
      edtTran_UsuarioId_Visible = 1 ;
      edtTran_FechaRegistro_Jsonclick = "" ;
      edtTran_FechaRegistro_Enabled = 0 ;
      edtTran_Id_Jsonclick = "" ;
      edtTran_Id_Enabled = 0 ;
      edtTran_Id_Visible = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      imgprompt_53_Visible = 1 ;
      imgprompt_47_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx29asaconsecutivocc057( long A48Tran_CentroCostoId )
   {
      if ( true /* After */ && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         GXt_char5 = AV11ConsecutivoCC ;
         GXv_char4[0] = "TRANS" ;
         GXv_int1[0] = A48Tran_CentroCostoId ;
         GXv_char3[0] = GXt_char5 ;
         new com.orions2.cons_tran_pla(remoteHandle, context).execute( GXv_char4, GXv_int1, GXv_char3) ;
         alm_transaccion_impl.this.A48Tran_CentroCostoId = GXv_int1[0] ;
         alm_transaccion_impl.this.GXt_char5 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48Tran_CentroCostoId", GXutil.ltrim( GXutil.str( A48Tran_CentroCostoId, 11, 0)));
         AV11ConsecutivoCC = GXt_char5 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11ConsecutivoCC", AV11ConsecutivoCC);
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( AV11ConsecutivoCC)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_44_057( )
   {
      if ( ( GXutil.strcmp(A481Tran_IndE_S, "E") == 0 ) && ( GXutil.strcmp(A482Tran_TipoElemento, "C") == 0 ) && ( GXutil.strcmp(A524Tran_Detalle, "D") == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  || ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  ) )
      {
         httpContext.wjLoc = formatLink("com.orions2.wpcon_ent") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_45_057( )
   {
      if ( ( GXutil.strcmp(A481Tran_IndE_S, "S") == 0 ) && ( GXutil.strcmp(A482Tran_TipoElemento, "C") == 0 ) && ( GXutil.strcmp(A524Tran_Detalle, "D") == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  || ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  ) )
      {
         httpContext.wjLoc = formatLink("com.orions2.wpalm_salida_consumo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_46_057( )
   {
      if ( ( GXutil.strcmp(A481Tran_IndE_S, "E") == 0 ) && ( GXutil.strcmp(A482Tran_TipoElemento, "D") == 0 ) && ( GXutil.strcmp(A524Tran_Detalle, "D") == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  || ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  ) )
      {
         httpContext.wjLoc = formatLink("com.orions2.wpcon_ent_dev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_47_057( )
   {
      if ( ( GXutil.strcmp(A481Tran_IndE_S, "S") == 0 ) && ( GXutil.strcmp(A482Tran_TipoElemento, "D") == 0 ) && ( GXutil.strcmp(A524Tran_Detalle, "D") == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  || ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  ) )
      {
         httpContext.wjLoc = formatLink("com.orions2.wpalm_salida_devolutivo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_48_057( )
   {
      if ( ( GXutil.strcmp(A481Tran_IndE_S, "A") == 0 ) && ( GXutil.strcmp(A49Tran_CodigoMovimiento, "999") == 0 ) && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  || ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  ) )
      {
         httpContext.wjLoc = formatLink("com.orions2.wpalm_asociar_placas") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))) ;
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gxnrgridalm_transaccion_documentos_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_33461( ) ;
      while ( nGXsfl_334_idx <= nRC_GXsfl_334 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0561( ) ;
         standaloneModal0561( ) ;
         cmbTran_IndAreadante.setName( "TRAN_INDAREADANTE" );
         cmbTran_IndAreadante.setWebtags( "" );
         cmbTran_IndAreadante.addItem("", "", (short)(0));
         cmbTran_IndAreadante.addItem("SI", "SI", (short)(0));
         cmbTran_IndAreadante.addItem("NO", "NO", (short)(0));
         if ( cmbTran_IndAreadante.getItemCount() > 0 )
         {
            A478Tran_IndAreadante = cmbTran_IndAreadante.getValidValue(A478Tran_IndAreadante) ;
            n478Tran_IndAreadante = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A478Tran_IndAreadante", A478Tran_IndAreadante);
         }
         cmbTran_IndE_S.setName( "TRAN_INDE_S" );
         cmbTran_IndE_S.setWebtags( "" );
         cmbTran_IndE_S.addItem("E", "ENTRADA", (short)(0));
         cmbTran_IndE_S.addItem("S", "SALIDA", (short)(0));
         cmbTran_IndE_S.addItem("T", "TRASPASO", (short)(0));
         cmbTran_IndE_S.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbTran_IndE_S.getItemCount() > 0 )
         {
            A481Tran_IndE_S = cmbTran_IndE_S.getValidValue(A481Tran_IndE_S) ;
            n481Tran_IndE_S = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A481Tran_IndE_S", A481Tran_IndE_S);
         }
         cmbTran_IndCurso.setName( "TRAN_INDCURSO" );
         cmbTran_IndCurso.setWebtags( "" );
         cmbTran_IndCurso.addItem("", "", (short)(0));
         cmbTran_IndCurso.addItem("SI", "SI", (short)(0));
         cmbTran_IndCurso.addItem("NO", "NO", (short)(0));
         if ( cmbTran_IndCurso.getItemCount() > 0 )
         {
            A479Tran_IndCurso = cmbTran_IndCurso.getValidValue(A479Tran_IndCurso) ;
            n479Tran_IndCurso = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A479Tran_IndCurso", A479Tran_IndCurso);
         }
         cmbTran_TipoElemento.setName( "TRAN_TIPOELEMENTO" );
         cmbTran_TipoElemento.setWebtags( "" );
         cmbTran_TipoElemento.addItem("C", "Consumo", (short)(0));
         cmbTran_TipoElemento.addItem("D", "Devolutivo", (short)(0));
         if ( cmbTran_TipoElemento.getItemCount() > 0 )
         {
            A482Tran_TipoElemento = cmbTran_TipoElemento.getValidValue(A482Tran_TipoElemento) ;
            n482Tran_TipoElemento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A482Tran_TipoElemento", A482Tran_TipoElemento);
         }
         cmbTran_SolicitaCCDestino.setName( "TRAN_SOLICITACCDESTINO" );
         cmbTran_SolicitaCCDestino.setWebtags( "" );
         cmbTran_SolicitaCCDestino.addItem("", "", (short)(0));
         cmbTran_SolicitaCCDestino.addItem("SI", "SI", (short)(0));
         cmbTran_SolicitaCCDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTran_SolicitaCCDestino.getItemCount() > 0 )
         {
            A707Tran_SolicitaCCDestino = cmbTran_SolicitaCCDestino.getValidValue(A707Tran_SolicitaCCDestino) ;
            n707Tran_SolicitaCCDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A707Tran_SolicitaCCDestino", A707Tran_SolicitaCCDestino);
         }
         cmbTran_SolicitaRegionDestino.setName( "TRAN_SOLICITAREGIONDESTINO" );
         cmbTran_SolicitaRegionDestino.setWebtags( "" );
         cmbTran_SolicitaRegionDestino.addItem("", "", (short)(0));
         cmbTran_SolicitaRegionDestino.addItem("SI", "SI", (short)(0));
         cmbTran_SolicitaRegionDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTran_SolicitaRegionDestino.getItemCount() > 0 )
         {
            A708Tran_SolicitaRegionDestino = cmbTran_SolicitaRegionDestino.getValidValue(A708Tran_SolicitaRegionDestino) ;
            n708Tran_SolicitaRegionDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A708Tran_SolicitaRegionDestino", A708Tran_SolicitaRegionDestino);
         }
         cmbTran_CuentaResponsabilidad.setName( "TRAN_CUENTARESPONSABILIDAD" );
         cmbTran_CuentaResponsabilidad.setWebtags( "" );
         cmbTran_CuentaResponsabilidad.addItem("", "", (short)(0));
         cmbTran_CuentaResponsabilidad.addItem("SI", "SI", (short)(0));
         cmbTran_CuentaResponsabilidad.addItem("NO", "NO", (short)(0));
         if ( cmbTran_CuentaResponsabilidad.getItemCount() > 0 )
         {
            A754Tran_CuentaResponsabilidad = cmbTran_CuentaResponsabilidad.getValidValue(A754Tran_CuentaResponsabilidad) ;
            n754Tran_CuentaResponsabilidad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A754Tran_CuentaResponsabilidad", A754Tran_CuentaResponsabilidad);
         }
         cmbTran_Estado.setName( "TRAN_ESTADO" );
         cmbTran_Estado.setWebtags( "" );
         cmbTran_Estado.addItem("A", "Anulado", (short)(0));
         cmbTran_Estado.addItem("R", "Ratificado", (short)(0));
         cmbTran_Estado.addItem("P", "Pendiente", (short)(0));
         cmbTran_Estado.addItem("I", "Incompleto", (short)(0));
         if ( cmbTran_Estado.getItemCount() > 0 )
         {
            A58Tran_Estado = cmbTran_Estado.getValidValue(A58Tran_Estado) ;
            n58Tran_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A58Tran_Estado", A58Tran_Estado);
         }
         cmbTran_TipoIngreso.setName( "TRAN_TIPOINGRESO" );
         cmbTran_TipoIngreso.setWebtags( "" );
         if ( cmbTran_TipoIngreso.getItemCount() > 0 )
         {
            A54Tran_TipoIngreso = GXutil.lval( cmbTran_TipoIngreso.getValidValue(GXutil.trim( GXutil.str( A54Tran_TipoIngreso, 11, 0)))) ;
            n54Tran_TipoIngreso = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A54Tran_TipoIngreso", GXutil.ltrim( GXutil.str( A54Tran_TipoIngreso, 11, 0)));
         }
         cmbTran_TipoEntra.setName( "TRAN_TIPOENTRA" );
         cmbTran_TipoEntra.setWebtags( "" );
         if ( cmbTran_TipoEntra.getItemCount() > 0 )
         {
            A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
            n527Tran_TipoEntra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A527Tran_TipoEntra", A527Tran_TipoEntra);
         }
         cmbTran_EntidadGobierno.setName( "TRAN_ENTIDADGOBIERNO" );
         cmbTran_EntidadGobierno.setWebtags( "" );
         cmbTran_EntidadGobierno.addItem("", "", (short)(0));
         cmbTran_EntidadGobierno.addItem("SI", "SI", (short)(0));
         cmbTran_EntidadGobierno.addItem("NO", "NO", (short)(0));
         if ( cmbTran_EntidadGobierno.getItemCount() > 0 )
         {
            A859Tran_EntidadGobierno = cmbTran_EntidadGobierno.getValidValue(A859Tran_EntidadGobierno) ;
            n859Tran_EntidadGobierno = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A859Tran_EntidadGobierno", A859Tran_EntidadGobierno);
         }
         dynload_actions( ) ;
         sendRow0561( ) ;
         nGXsfl_334_idx = (short)(nGXsfl_334_idx+1) ;
         sGXsfl_334_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_334_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_33461( ) ;
      }
      httpContext.GX_webresponse.addString(Gridalm_transaccion_documentosContainer.ToJavascriptSource());
      /* End function gxnrGridalm_transaccion_documentos_newrow */
   }

   public void valid_Tran_usuarioid( long GX_Parm1 ,
                                     String GX_Parm2 ,
                                     String GX_Parm3 )
   {
      A47Tran_UsuarioId = GX_Parm1 ;
      n47Tran_UsuarioId = false ;
      A417Tran_UsuarioCodigo = GX_Parm2 ;
      n417Tran_UsuarioCodigo = false ;
      A418Tran_UsuarioNombre = GX_Parm3 ;
      n418Tran_UsuarioNombre = false ;
      /* Using cursor T000539 */
      pr_default.execute(37, new Object[] {new Boolean(n47Tran_UsuarioId), new Long(A47Tran_UsuarioId)});
      if ( (pr_default.getStatus(37) == 101) )
      {
         if ( ! ( (0==A47Tran_UsuarioId) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Usuario Transaccion'.", "ForeignKeyNotFound", 1, "TRAN_USUARIOID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_UsuarioId_Internalname ;
         }
      }
      A417Tran_UsuarioCodigo = T000539_A417Tran_UsuarioCodigo[0] ;
      n417Tran_UsuarioCodigo = T000539_n417Tran_UsuarioCodigo[0] ;
      A418Tran_UsuarioNombre = T000539_A418Tran_UsuarioNombre[0] ;
      n418Tran_UsuarioNombre = T000539_n418Tran_UsuarioNombre[0] ;
      pr_default.close(37);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A417Tran_UsuarioCodigo = "" ;
         n417Tran_UsuarioCodigo = false ;
         A418Tran_UsuarioNombre = "" ;
         n418Tran_UsuarioNombre = false ;
      }
      isValidOutput.add(A417Tran_UsuarioCodigo);
      isValidOutput.add(A418Tran_UsuarioNombre);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tran_centrocostoid( long GX_Parm1 ,
                                         long GX_Parm2 ,
                                         String GX_Parm3 ,
                                         String GX_Parm4 ,
                                         short GX_Parm5 ,
                                         String GX_Parm6 ,
                                         String GX_Parm7 )
   {
      A48Tran_CentroCostoId = GX_Parm1 ;
      A57Tran_RegionId = GX_Parm2 ;
      n57Tran_RegionId = false ;
      A419Tran_CentroCostoCodigo = GX_Parm3 ;
      n419Tran_CentroCostoCodigo = false ;
      A420Tran_CentroCostoDescripcion = GX_Parm4 ;
      n420Tran_CentroCostoDescripcion = false ;
      A421Tran_RegionCodigo = GX_Parm5 ;
      n421Tran_RegionCodigo = false ;
      A422Tran_RegionDescripcion = GX_Parm6 ;
      n422Tran_RegionDescripcion = false ;
      A594Tran_RegionAbrev = GX_Parm7 ;
      n594Tran_RegionAbrev = false ;
      /* Using cursor T000540 */
      pr_default.execute(38, new Object[] {new Long(A48Tran_CentroCostoId)});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Centro Costo Transaccion'.", "ForeignKeyNotFound", 1, "TRAN_CENTROCOSTOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_CentroCostoId_Internalname ;
      }
      A419Tran_CentroCostoCodigo = T000540_A419Tran_CentroCostoCodigo[0] ;
      n419Tran_CentroCostoCodigo = T000540_n419Tran_CentroCostoCodigo[0] ;
      A420Tran_CentroCostoDescripcion = T000540_A420Tran_CentroCostoDescripcion[0] ;
      n420Tran_CentroCostoDescripcion = T000540_n420Tran_CentroCostoDescripcion[0] ;
      A57Tran_RegionId = T000540_A57Tran_RegionId[0] ;
      n57Tran_RegionId = T000540_n57Tran_RegionId[0] ;
      pr_default.close(38);
      /* Using cursor T000541 */
      pr_default.execute(39, new Object[] {new Boolean(n57Tran_RegionId), new Long(A57Tran_RegionId)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         if ( ! ( (0==A57Tran_RegionId) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Centro Costo Transaccion'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A421Tran_RegionCodigo = T000541_A421Tran_RegionCodigo[0] ;
      n421Tran_RegionCodigo = T000541_n421Tran_RegionCodigo[0] ;
      A422Tran_RegionDescripcion = T000541_A422Tran_RegionDescripcion[0] ;
      n422Tran_RegionDescripcion = T000541_n422Tran_RegionDescripcion[0] ;
      A594Tran_RegionAbrev = T000541_A594Tran_RegionAbrev[0] ;
      n594Tran_RegionAbrev = T000541_n594Tran_RegionAbrev[0] ;
      pr_default.close(39);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A419Tran_CentroCostoCodigo = "" ;
         n419Tran_CentroCostoCodigo = false ;
         A420Tran_CentroCostoDescripcion = "" ;
         n420Tran_CentroCostoDescripcion = false ;
         A57Tran_RegionId = 0 ;
         n57Tran_RegionId = false ;
         A421Tran_RegionCodigo = (short)(0) ;
         n421Tran_RegionCodigo = false ;
         A422Tran_RegionDescripcion = "" ;
         n422Tran_RegionDescripcion = false ;
         A594Tran_RegionAbrev = "" ;
         n594Tran_RegionAbrev = false ;
      }
      isValidOutput.add(A419Tran_CentroCostoCodigo);
      isValidOutput.add(A420Tran_CentroCostoDescripcion);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A421Tran_RegionCodigo, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A422Tran_RegionDescripcion);
      isValidOutput.add(A594Tran_RegionAbrev);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tran_codigomovimiento( String GX_Parm1 ,
                                            long GX_Parm2 ,
                                            String GX_Parm3 ,
                                            com.genexus.webpanels.HTMLChoice GX_Parm4 ,
                                            com.genexus.webpanels.HTMLChoice GX_Parm5 ,
                                            com.genexus.webpanels.HTMLChoice GX_Parm6 ,
                                            com.genexus.webpanels.HTMLChoice GX_Parm7 ,
                                            com.genexus.webpanels.HTMLChoice GX_Parm8 ,
                                            com.genexus.webpanels.HTMLChoice GX_Parm9 ,
                                            com.genexus.webpanels.HTMLChoice GX_Parm10 )
   {
      A49Tran_CodigoMovimiento = GX_Parm1 ;
      A499Tran_CodTipoElemento = GX_Parm2 ;
      n499Tran_CodTipoElemento = false ;
      A381Tran_DescripcionMovimiento = GX_Parm3 ;
      n381Tran_DescripcionMovimiento = false ;
      cmbTran_IndAreadante = GX_Parm4 ;
      A478Tran_IndAreadante = cmbTran_IndAreadante.getValue() ;
      n478Tran_IndAreadante = false ;
      cmbTran_IndAreadante.setValue( A478Tran_IndAreadante );
      cmbTran_IndE_S = GX_Parm5 ;
      A481Tran_IndE_S = cmbTran_IndE_S.getValue() ;
      n481Tran_IndE_S = false ;
      cmbTran_IndE_S.setValue( A481Tran_IndE_S );
      cmbTran_IndCurso = GX_Parm6 ;
      A479Tran_IndCurso = cmbTran_IndCurso.getValue() ;
      n479Tran_IndCurso = false ;
      cmbTran_IndCurso.setValue( A479Tran_IndCurso );
      cmbTran_SolicitaCCDestino = GX_Parm7 ;
      A707Tran_SolicitaCCDestino = cmbTran_SolicitaCCDestino.getValue() ;
      n707Tran_SolicitaCCDestino = false ;
      cmbTran_SolicitaCCDestino.setValue( A707Tran_SolicitaCCDestino );
      cmbTran_SolicitaRegionDestino = GX_Parm8 ;
      A708Tran_SolicitaRegionDestino = cmbTran_SolicitaRegionDestino.getValue() ;
      n708Tran_SolicitaRegionDestino = false ;
      cmbTran_SolicitaRegionDestino.setValue( A708Tran_SolicitaRegionDestino );
      cmbTran_CuentaResponsabilidad = GX_Parm9 ;
      A754Tran_CuentaResponsabilidad = cmbTran_CuentaResponsabilidad.getValue() ;
      n754Tran_CuentaResponsabilidad = false ;
      cmbTran_CuentaResponsabilidad.setValue( A754Tran_CuentaResponsabilidad );
      cmbTran_TipoElemento = GX_Parm10 ;
      A482Tran_TipoElemento = cmbTran_TipoElemento.getValue() ;
      n482Tran_TipoElemento = false ;
      cmbTran_TipoElemento.setValue( A482Tran_TipoElemento );
      /* Using cursor T000542 */
      pr_default.execute(40, new Object[] {A49Tran_CodigoMovimiento});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo Movimiento Trn'.", "ForeignKeyNotFound", 1, "TRAN_CODIGOMOVIMIENTO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_CodigoMovimiento_Internalname ;
      }
      A381Tran_DescripcionMovimiento = T000542_A381Tran_DescripcionMovimiento[0] ;
      n381Tran_DescripcionMovimiento = T000542_n381Tran_DescripcionMovimiento[0] ;
      A478Tran_IndAreadante = T000542_A478Tran_IndAreadante[0] ;
      cmbTran_IndAreadante.setValue( A478Tran_IndAreadante );
      n478Tran_IndAreadante = T000542_n478Tran_IndAreadante[0] ;
      A481Tran_IndE_S = T000542_A481Tran_IndE_S[0] ;
      cmbTran_IndE_S.setValue( A481Tran_IndE_S );
      n481Tran_IndE_S = T000542_n481Tran_IndE_S[0] ;
      A479Tran_IndCurso = T000542_A479Tran_IndCurso[0] ;
      cmbTran_IndCurso.setValue( A479Tran_IndCurso );
      n479Tran_IndCurso = T000542_n479Tran_IndCurso[0] ;
      A707Tran_SolicitaCCDestino = T000542_A707Tran_SolicitaCCDestino[0] ;
      cmbTran_SolicitaCCDestino.setValue( A707Tran_SolicitaCCDestino );
      n707Tran_SolicitaCCDestino = T000542_n707Tran_SolicitaCCDestino[0] ;
      A708Tran_SolicitaRegionDestino = T000542_A708Tran_SolicitaRegionDestino[0] ;
      cmbTran_SolicitaRegionDestino.setValue( A708Tran_SolicitaRegionDestino );
      n708Tran_SolicitaRegionDestino = T000542_n708Tran_SolicitaRegionDestino[0] ;
      A754Tran_CuentaResponsabilidad = T000542_A754Tran_CuentaResponsabilidad[0] ;
      cmbTran_CuentaResponsabilidad.setValue( A754Tran_CuentaResponsabilidad );
      n754Tran_CuentaResponsabilidad = T000542_n754Tran_CuentaResponsabilidad[0] ;
      A499Tran_CodTipoElemento = T000542_A499Tran_CodTipoElemento[0] ;
      n499Tran_CodTipoElemento = T000542_n499Tran_CodTipoElemento[0] ;
      pr_default.close(40);
      /* Using cursor T000543 */
      pr_default.execute(41, new Object[] {new Boolean(n499Tran_CodTipoElemento), new Long(A499Tran_CodTipoElemento)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo Movimiento Trn'.", "ForeignKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      A482Tran_TipoElemento = T000543_A482Tran_TipoElemento[0] ;
      cmbTran_TipoElemento.setValue( A482Tran_TipoElemento );
      n482Tran_TipoElemento = T000543_n482Tran_TipoElemento[0] ;
      pr_default.close(41);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A381Tran_DescripcionMovimiento = "" ;
         n381Tran_DescripcionMovimiento = false ;
         A478Tran_IndAreadante = "" ;
         n478Tran_IndAreadante = false ;
         cmbTran_IndAreadante.setValue( A478Tran_IndAreadante );
         A481Tran_IndE_S = "" ;
         n481Tran_IndE_S = false ;
         cmbTran_IndE_S.setValue( A481Tran_IndE_S );
         A479Tran_IndCurso = "" ;
         n479Tran_IndCurso = false ;
         cmbTran_IndCurso.setValue( A479Tran_IndCurso );
         A707Tran_SolicitaCCDestino = "" ;
         n707Tran_SolicitaCCDestino = false ;
         cmbTran_SolicitaCCDestino.setValue( A707Tran_SolicitaCCDestino );
         A708Tran_SolicitaRegionDestino = "" ;
         n708Tran_SolicitaRegionDestino = false ;
         cmbTran_SolicitaRegionDestino.setValue( A708Tran_SolicitaRegionDestino );
         A754Tran_CuentaResponsabilidad = "" ;
         n754Tran_CuentaResponsabilidad = false ;
         cmbTran_CuentaResponsabilidad.setValue( A754Tran_CuentaResponsabilidad );
         A499Tran_CodTipoElemento = 0 ;
         n499Tran_CodTipoElemento = false ;
         A482Tran_TipoElemento = "" ;
         n482Tran_TipoElemento = false ;
         cmbTran_TipoElemento.setValue( A482Tran_TipoElemento );
      }
      isValidOutput.add(A381Tran_DescripcionMovimiento);
      cmbTran_IndAreadante.setValue( A478Tran_IndAreadante );
      isValidOutput.add(cmbTran_IndAreadante);
      cmbTran_IndE_S.setValue( A481Tran_IndE_S );
      isValidOutput.add(cmbTran_IndE_S);
      cmbTran_IndCurso.setValue( A479Tran_IndCurso );
      isValidOutput.add(cmbTran_IndCurso);
      cmbTran_SolicitaCCDestino.setValue( A707Tran_SolicitaCCDestino );
      isValidOutput.add(cmbTran_SolicitaCCDestino);
      cmbTran_SolicitaRegionDestino.setValue( A708Tran_SolicitaRegionDestino );
      isValidOutput.add(cmbTran_SolicitaRegionDestino);
      cmbTran_CuentaResponsabilidad.setValue( A754Tran_CuentaResponsabilidad );
      isValidOutput.add(cmbTran_CuentaResponsabilidad);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A499Tran_CodTipoElemento, (byte)(18), (byte)(0), ".", "")));
      cmbTran_TipoElemento.setValue( A482Tran_TipoElemento );
      isValidOutput.add(cmbTran_TipoElemento);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tran_idcuentadanteorigen( long GX_Parm1 ,
                                               String GX_Parm2 ,
                                               long GX_Parm3 ,
                                               String GX_Parm4 )
   {
      A51Tran_IdCuentadanteOrigen = GX_Parm1 ;
      n51Tran_IdCuentadanteOrigen = false ;
      A384Tran_NombCuentadanteOrigen = GX_Parm2 ;
      n384Tran_NombCuentadanteOrigen = false ;
      A702Tran_CedulaCuentadanteOrigen = GX_Parm3 ;
      n702Tran_CedulaCuentadanteOrigen = false ;
      A714Tran_EmailCuentadanteOrigen = GX_Parm4 ;
      n714Tran_EmailCuentadanteOrigen = false ;
      /* Using cursor T000544 */
      pr_default.execute(42, new Object[] {new Boolean(n51Tran_IdCuentadanteOrigen), new Long(A51Tran_IdCuentadanteOrigen)});
      if ( (pr_default.getStatus(42) == 101) )
      {
         if ( ! ( (0==A51Tran_IdCuentadanteOrigen) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Cuentadante Origen'.", "ForeignKeyNotFound", 1, "TRAN_IDCUENTADANTEORIGEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_IdCuentadanteOrigen_Internalname ;
         }
      }
      A384Tran_NombCuentadanteOrigen = T000544_A384Tran_NombCuentadanteOrigen[0] ;
      n384Tran_NombCuentadanteOrigen = T000544_n384Tran_NombCuentadanteOrigen[0] ;
      A702Tran_CedulaCuentadanteOrigen = T000544_A702Tran_CedulaCuentadanteOrigen[0] ;
      n702Tran_CedulaCuentadanteOrigen = T000544_n702Tran_CedulaCuentadanteOrigen[0] ;
      A714Tran_EmailCuentadanteOrigen = T000544_A714Tran_EmailCuentadanteOrigen[0] ;
      n714Tran_EmailCuentadanteOrigen = T000544_n714Tran_EmailCuentadanteOrigen[0] ;
      pr_default.close(42);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A384Tran_NombCuentadanteOrigen = "" ;
         n384Tran_NombCuentadanteOrigen = false ;
         A702Tran_CedulaCuentadanteOrigen = 0 ;
         n702Tran_CedulaCuentadanteOrigen = false ;
         A714Tran_EmailCuentadanteOrigen = "" ;
         n714Tran_EmailCuentadanteOrigen = false ;
      }
      isValidOutput.add(A384Tran_NombCuentadanteOrigen);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A702Tran_CedulaCuentadanteOrigen, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(A714Tran_EmailCuentadanteOrigen);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tran_idproveedor( long GX_Parm1 ,
                                       String GX_Parm2 ,
                                       long GX_Parm3 )
   {
      A53Tran_IdProveedor = GX_Parm1 ;
      n53Tran_IdProveedor = false ;
      A575Tran_NombreProveedor = GX_Parm2 ;
      n575Tran_NombreProveedor = false ;
      A703Tran_CedulaProveedor = GX_Parm3 ;
      n703Tran_CedulaProveedor = false ;
      /* Using cursor T000545 */
      pr_default.execute(43, new Object[] {new Boolean(n53Tran_IdProveedor), new Long(A53Tran_IdProveedor)});
      if ( (pr_default.getStatus(43) == 101) )
      {
         if ( ! ( (0==A53Tran_IdProveedor) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Proveedor'.", "ForeignKeyNotFound", 1, "TRAN_IDPROVEEDOR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_IdProveedor_Internalname ;
         }
      }
      A575Tran_NombreProveedor = T000545_A575Tran_NombreProveedor[0] ;
      n575Tran_NombreProveedor = T000545_n575Tran_NombreProveedor[0] ;
      A703Tran_CedulaProveedor = T000545_A703Tran_CedulaProveedor[0] ;
      n703Tran_CedulaProveedor = T000545_n703Tran_CedulaProveedor[0] ;
      pr_default.close(43);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A575Tran_NombreProveedor = "" ;
         n575Tran_NombreProveedor = false ;
         A703Tran_CedulaProveedor = 0 ;
         n703Tran_CedulaProveedor = false ;
      }
      isValidOutput.add(A575Tran_NombreProveedor);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A703Tran_CedulaProveedor, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tran_idcuentadantedestino( long GX_Parm1 ,
                                                String GX_Parm2 ,
                                                long GX_Parm3 ,
                                                String GX_Parm4 )
   {
      A52Tran_IdCuentadanteDestino = GX_Parm1 ;
      n52Tran_IdCuentadanteDestino = false ;
      A389Tran_NombCuentadanteDestino = GX_Parm2 ;
      n389Tran_NombCuentadanteDestino = false ;
      A704Tran_CedulaCuentadanteDestino = GX_Parm3 ;
      n704Tran_CedulaCuentadanteDestino = false ;
      A715Tran_EmailCuentadanteDestino = GX_Parm4 ;
      n715Tran_EmailCuentadanteDestino = false ;
      /* Using cursor T000546 */
      pr_default.execute(44, new Object[] {new Boolean(n52Tran_IdCuentadanteDestino), new Long(A52Tran_IdCuentadanteDestino)});
      if ( (pr_default.getStatus(44) == 101) )
      {
         if ( ! ( (0==A52Tran_IdCuentadanteDestino) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Cuentadante Destino'.", "ForeignKeyNotFound", 1, "TRAN_IDCUENTADANTEDESTINO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_IdCuentadanteDestino_Internalname ;
         }
      }
      A389Tran_NombCuentadanteDestino = T000546_A389Tran_NombCuentadanteDestino[0] ;
      n389Tran_NombCuentadanteDestino = T000546_n389Tran_NombCuentadanteDestino[0] ;
      A704Tran_CedulaCuentadanteDestino = T000546_A704Tran_CedulaCuentadanteDestino[0] ;
      n704Tran_CedulaCuentadanteDestino = T000546_n704Tran_CedulaCuentadanteDestino[0] ;
      A715Tran_EmailCuentadanteDestino = T000546_A715Tran_EmailCuentadanteDestino[0] ;
      n715Tran_EmailCuentadanteDestino = T000546_n715Tran_EmailCuentadanteDestino[0] ;
      pr_default.close(44);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A389Tran_NombCuentadanteDestino = "" ;
         n389Tran_NombCuentadanteDestino = false ;
         A704Tran_CedulaCuentadanteDestino = 0 ;
         n704Tran_CedulaCuentadanteDestino = false ;
         A715Tran_EmailCuentadanteDestino = "" ;
         n715Tran_EmailCuentadanteDestino = false ;
      }
      isValidOutput.add(A389Tran_NombCuentadanteDestino);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A704Tran_CedulaCuentadanteDestino, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(A715Tran_EmailCuentadanteDestino);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tran_tipoingreso( com.genexus.webpanels.HTMLChoice GX_Parm1 ,
                                       String GX_Parm2 ,
                                       String GX_Parm3 )
   {
      cmbTran_TipoIngreso = GX_Parm1 ;
      A54Tran_TipoIngreso = GXutil.lval( cmbTran_TipoIngreso.getValue()) ;
      n54Tran_TipoIngreso = false ;
      A672Tran_NombreIngreso = GX_Parm2 ;
      n672Tran_NombreIngreso = false ;
      A756Tran_Abreviado = GX_Parm3 ;
      n756Tran_Abreviado = false ;
      /* Using cursor T000547 */
      pr_default.execute(45, new Object[] {new Boolean(n54Tran_TipoIngreso), new Long(A54Tran_TipoIngreso)});
      if ( (pr_default.getStatus(45) == 101) )
      {
         if ( ! ( (0==A54Tran_TipoIngreso) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Tipo de Ingreso'.", "ForeignKeyNotFound", 1, "TRAN_TIPOINGRESO");
            AnyError = (short)(1) ;
            GX_FocusControl = cmbTran_TipoIngreso.getInternalname() ;
         }
      }
      A672Tran_NombreIngreso = T000547_A672Tran_NombreIngreso[0] ;
      n672Tran_NombreIngreso = T000547_n672Tran_NombreIngreso[0] ;
      A756Tran_Abreviado = T000547_A756Tran_Abreviado[0] ;
      n756Tran_Abreviado = T000547_n756Tran_Abreviado[0] ;
      pr_default.close(45);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A672Tran_NombreIngreso = "" ;
         n672Tran_NombreIngreso = false ;
         A756Tran_Abreviado = "" ;
         n756Tran_Abreviado = false ;
      }
      isValidOutput.add(A672Tran_NombreIngreso);
      isValidOutput.add(A756Tran_Abreviado);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tran_centrocostoiddestino( long GX_Parm1 ,
                                                long GX_Parm2 ,
                                                String GX_Parm3 ,
                                                String GX_Parm4 ,
                                                short GX_Parm5 ,
                                                String GX_Parm6 ,
                                                String GX_Parm7 )
   {
      A50Tran_CentroCostoIdDestino = GX_Parm1 ;
      n50Tran_CentroCostoIdDestino = false ;
      A518Tran_RegionIdDestino = GX_Parm2 ;
      n518Tran_RegionIdDestino = false ;
      A516Tran_CentroCostoCodigoDestino = GX_Parm3 ;
      n516Tran_CentroCostoCodigoDestino = false ;
      A517Tran_CentroCostoDescripcionDes = GX_Parm4 ;
      n517Tran_CentroCostoDescripcionDes = false ;
      A519Tran_RegionCodigoDestino = GX_Parm5 ;
      n519Tran_RegionCodigoDestino = false ;
      A520Tran_RegionDescripcionDestino = GX_Parm6 ;
      n520Tran_RegionDescripcionDestino = false ;
      A608Tran_RegionAbrevDestino = GX_Parm7 ;
      n608Tran_RegionAbrevDestino = false ;
      /* Using cursor T000548 */
      pr_default.execute(46, new Object[] {new Boolean(n50Tran_CentroCostoIdDestino), new Long(A50Tran_CentroCostoIdDestino)});
      if ( (pr_default.getStatus(46) == 101) )
      {
         if ( ! ( (0==A50Tran_CentroCostoIdDestino) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Centro Costo Destino Trn'.", "ForeignKeyNotFound", 1, "TRAN_CENTROCOSTOIDDESTINO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_CentroCostoIdDestino_Internalname ;
         }
      }
      A516Tran_CentroCostoCodigoDestino = T000548_A516Tran_CentroCostoCodigoDestino[0] ;
      n516Tran_CentroCostoCodigoDestino = T000548_n516Tran_CentroCostoCodigoDestino[0] ;
      A517Tran_CentroCostoDescripcionDes = T000548_A517Tran_CentroCostoDescripcionDes[0] ;
      n517Tran_CentroCostoDescripcionDes = T000548_n517Tran_CentroCostoDescripcionDes[0] ;
      A518Tran_RegionIdDestino = T000548_A518Tran_RegionIdDestino[0] ;
      n518Tran_RegionIdDestino = T000548_n518Tran_RegionIdDestino[0] ;
      pr_default.close(46);
      /* Using cursor T000549 */
      pr_default.execute(47, new Object[] {new Boolean(n518Tran_RegionIdDestino), new Long(A518Tran_RegionIdDestino)});
      if ( (pr_default.getStatus(47) == 101) )
      {
         if ( ! ( (0==A518Tran_RegionIdDestino) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Centro Costo Destino Trn'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A519Tran_RegionCodigoDestino = T000549_A519Tran_RegionCodigoDestino[0] ;
      n519Tran_RegionCodigoDestino = T000549_n519Tran_RegionCodigoDestino[0] ;
      A520Tran_RegionDescripcionDestino = T000549_A520Tran_RegionDescripcionDestino[0] ;
      n520Tran_RegionDescripcionDestino = T000549_n520Tran_RegionDescripcionDestino[0] ;
      A608Tran_RegionAbrevDestino = T000549_A608Tran_RegionAbrevDestino[0] ;
      n608Tran_RegionAbrevDestino = T000549_n608Tran_RegionAbrevDestino[0] ;
      pr_default.close(47);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A516Tran_CentroCostoCodigoDestino = "" ;
         n516Tran_CentroCostoCodigoDestino = false ;
         A517Tran_CentroCostoDescripcionDes = "" ;
         n517Tran_CentroCostoDescripcionDes = false ;
         A518Tran_RegionIdDestino = 0 ;
         n518Tran_RegionIdDestino = false ;
         A519Tran_RegionCodigoDestino = (short)(0) ;
         n519Tran_RegionCodigoDestino = false ;
         A520Tran_RegionDescripcionDestino = "" ;
         n520Tran_RegionDescripcionDestino = false ;
         A608Tran_RegionAbrevDestino = "" ;
         n608Tran_RegionAbrevDestino = false ;
      }
      isValidOutput.add(A516Tran_CentroCostoCodigoDestino);
      isValidOutput.add(A517Tran_CentroCostoDescripcionDes);
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A518Tran_RegionIdDestino, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A519Tran_RegionCodigoDestino, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(A520Tran_RegionDescripcionDestino);
      isValidOutput.add(A608Tran_RegionAbrevDestino);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tran_idcuentadanteresponsabili( long GX_Parm1 ,
                                                     long GX_Parm2 ,
                                                     String GX_Parm3 )
   {
      A56Tran_IdCuentadanteResponsabili = GX_Parm1 ;
      n56Tran_IdCuentadanteResponsabili = false ;
      A759Tran_CedulaResponsabilidad = GX_Parm2 ;
      n759Tran_CedulaResponsabilidad = false ;
      A721Tran_NombreCuentadanteResponsa = GX_Parm3 ;
      n721Tran_NombreCuentadanteResponsa = false ;
      /* Using cursor T000550 */
      pr_default.execute(48, new Object[] {new Boolean(n56Tran_IdCuentadanteResponsabili), new Long(A56Tran_IdCuentadanteResponsabili)});
      if ( (pr_default.getStatus(48) == 101) )
      {
         if ( ! ( (0==A56Tran_IdCuentadanteResponsabili) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Cuentadante Responsabilidad'.", "ForeignKeyNotFound", 1, "TRAN_IDCUENTADANTERESPONSABILI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTran_IdCuentadanteResponsabili_Internalname ;
         }
      }
      A759Tran_CedulaResponsabilidad = T000550_A759Tran_CedulaResponsabilidad[0] ;
      n759Tran_CedulaResponsabilidad = T000550_n759Tran_CedulaResponsabilidad[0] ;
      A721Tran_NombreCuentadanteResponsa = T000550_A721Tran_NombreCuentadanteResponsa[0] ;
      n721Tran_NombreCuentadanteResponsa = T000550_n721Tran_NombreCuentadanteResponsa[0] ;
      pr_default.close(48);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A759Tran_CedulaResponsabilidad = 0 ;
         n759Tran_CedulaResponsabilidad = false ;
         A721Tran_NombreCuentadanteResponsa = "" ;
         n721Tran_NombreCuentadanteResponsa = false ;
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A759Tran_CedulaResponsabilidad, (byte)(18), (byte)(0), ".", "")));
      isValidOutput.add(A721Tran_NombreCuentadanteResponsa);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tran_nro_documento( short GX_Parm1 ,
                                         String GX_Parm2 ,
                                         String GX_Parm3 )
   {
      A827Tran_Nro_Documento = GX_Parm1 ;
      A828Tran_Descrip_Documento = GX_Parm2 ;
      n828Tran_Descrip_Documento = false ;
      A829Tran_Prefijo_Documento = GX_Parm3 ;
      n829Tran_Prefijo_Documento = false ;
      /* Using cursor T000562 */
      pr_default.execute(60, new Object[] {new Short(A827Tran_Nro_Documento)});
      if ( (pr_default.getStatus(60) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tran_Documentos'.", "ForeignKeyNotFound", 1, "TRAN_NRO_DOCUMENTO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTran_Nro_Documento_Internalname ;
      }
      A828Tran_Descrip_Documento = T000562_A828Tran_Descrip_Documento[0] ;
      n828Tran_Descrip_Documento = T000562_n828Tran_Descrip_Documento[0] ;
      A829Tran_Prefijo_Documento = T000562_A829Tran_Prefijo_Documento[0] ;
      n829Tran_Prefijo_Documento = T000562_n829Tran_Prefijo_Documento[0] ;
      pr_default.close(60);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A828Tran_Descrip_Documento = "" ;
         n828Tran_Descrip_Documento = false ;
         A829Tran_Prefijo_Documento = "" ;
         n829Tran_Prefijo_Documento = false ;
      }
      isValidOutput.add(A828Tran_Descrip_Documento);
      isValidOutput.add(A829Tran_Prefijo_Documento);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV33Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12052',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV37TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
      setEventMetadata("TRAN_CODBODEDESTINO.ISVALID","{handler:'e13052',iparms:[{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A385Tran_ModuloDestino',fld:'TRAN_MODULODESTINO',pic:'',nv:''},{av:'A111Tran_CodAlmaDestino',fld:'TRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV14ExisteCuentadanteDestino',fld:'vEXISTECUENTADANTEDESTINO',pic:'',nv:''}],oparms:[{av:'AV14ExisteCuentadanteDestino',fld:'vEXISTECUENTADANTEDESTINO',pic:'',nv:''},{av:'A111Tran_CodAlmaDestino',fld:'TRAN_CODALMADESTINO',pic:'',nv:''},{av:'A385Tran_ModuloDestino',fld:'TRAN_MODULODESTINO',pic:'',nv:''},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'edtTran_IdCuentadanteDestino_Enabled',ctrl:'TRAN_IDCUENTADANTEDESTINO',prop:'Enabled'}]}");
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(60);
      pr_default.close(37);
      pr_default.close(38);
      pr_default.close(46);
      pr_default.close(39);
      pr_default.close(47);
      pr_default.close(40);
      pr_default.close(42);
      pr_default.close(43);
      pr_default.close(44);
      pr_default.close(48);
      pr_default.close(45);
      pr_default.close(41);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      Z58Tran_Estado = "" ;
      Z110Tran_ModuloOrigen = "" ;
      Z109Tran_CodAlmaOrigen = "" ;
      Z112Tran_CodBodeOrigen = "" ;
      Z385Tran_ModuloDestino = "" ;
      Z111Tran_CodAlmaDestino = "" ;
      Z387Tran_CodBodeDestino = "" ;
      Z407Tran_AreadanteCodigo = "" ;
      Z408Tran_CursoCodigo = "" ;
      Z483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      Z390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      Z391Tran_UsuarioRatifica = "" ;
      Z514Tran_NumeroIngreso = "" ;
      Z515Tran_FechaIngreso = GXutil.nullDate() ;
      Z524Tran_Detalle = "" ;
      Z527Tran_TipoEntra = "" ;
      Z668Tran_UsuarioEliminaoAnula = "" ;
      Z669Tran_FechaEliminaoAnula = GXutil.resetTime( GXutil.nullDate() );
      Z670Tran_ObservacionesAnula = "" ;
      Z720Tran_FechaResponsabilidad = GXutil.nullDate() ;
      Z859Tran_EntidadGobierno = "" ;
      Z49Tran_CodigoMovimiento = "" ;
      N49Tran_CodigoMovimiento = "" ;
      Z831Tran_Ruta_Archivo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A49Tran_CodigoMovimiento = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      A478Tran_IndAreadante = "" ;
      A481Tran_IndE_S = "" ;
      A479Tran_IndCurso = "" ;
      A482Tran_TipoElemento = "" ;
      A707Tran_SolicitaCCDestino = "" ;
      A708Tran_SolicitaRegionDestino = "" ;
      A754Tran_CuentaResponsabilidad = "" ;
      A58Tran_Estado = "" ;
      A527Tran_TipoEntra = "" ;
      A859Tran_EntidadGobierno = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      sImgUrl = "" ;
      A417Tran_UsuarioCodigo = "" ;
      A418Tran_UsuarioNombre = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A420Tran_CentroCostoDescripcion = "" ;
      A422Tran_RegionDescripcion = "" ;
      A594Tran_RegionAbrev = "" ;
      A381Tran_DescripcionMovimiento = "" ;
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A384Tran_NombCuentadanteOrigen = "" ;
      A714Tran_EmailCuentadanteOrigen = "" ;
      A575Tran_NombreProveedor = "" ;
      A385Tran_ModuloDestino = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A389Tran_NombCuentadanteDestino = "" ;
      A715Tran_EmailCuentadanteDestino = "" ;
      A416Tran_Observaciones = "" ;
      A407Tran_AreadanteCodigo = "" ;
      A408Tran_CursoCodigo = "" ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A391Tran_UsuarioRatifica = "" ;
      A672Tran_NombreIngreso = "" ;
      A756Tran_Abreviado = "" ;
      A514Tran_NumeroIngreso = "" ;
      A515Tran_FechaIngreso = GXutil.nullDate() ;
      A516Tran_CentroCostoCodigoDestino = "" ;
      A517Tran_CentroCostoDescripcionDes = "" ;
      A520Tran_RegionDescripcionDestino = "" ;
      A608Tran_RegionAbrevDestino = "" ;
      A524Tran_Detalle = "" ;
      A668Tran_UsuarioEliminaoAnula = "" ;
      A669Tran_FechaEliminaoAnula = GXutil.resetTime( GXutil.nullDate() );
      A670Tran_ObservacionesAnula = "" ;
      A721Tran_NombreCuentadanteResponsa = "" ;
      A720Tran_FechaResponsabilidad = GXutil.nullDate() ;
      lblTitledocumentos_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridalm_transaccion_documentosContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridalm_transaccion_documentosColumn = new com.genexus.webpanels.GXWebColumn();
      A828Tran_Descrip_Documento = "" ;
      A829Tran_Prefijo_Documento = "" ;
      A830Tran_Archivo = "" ;
      A831Tran_Ruta_Archivo = "" ;
      sMode61 = "" ;
      sStyleString = "" ;
      AV7Tran_CodigoMovimiento = "" ;
      AV21Insert_Tran_CodigoMovimiento = "" ;
      AV11ConsecutivoCC = "" ;
      AV47Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode7 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      AV37TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV40WebSession = httpContext.getWebSession();
      AV38TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      AV39Usuario = "" ;
      AV42Pattern = "" ;
      GXv_char2 = new String [1] ;
      AV14ExisteCuentadanteDestino = "" ;
      Z481Tran_IndE_S = "" ;
      Z482Tran_TipoElemento = "" ;
      Z416Tran_Observaciones = "" ;
      Z417Tran_UsuarioCodigo = "" ;
      Z418Tran_UsuarioNombre = "" ;
      Z419Tran_CentroCostoCodigo = "" ;
      Z420Tran_CentroCostoDescripcion = "" ;
      Z422Tran_RegionDescripcion = "" ;
      Z594Tran_RegionAbrev = "" ;
      Z381Tran_DescripcionMovimiento = "" ;
      Z478Tran_IndAreadante = "" ;
      Z479Tran_IndCurso = "" ;
      Z707Tran_SolicitaCCDestino = "" ;
      Z708Tran_SolicitaRegionDestino = "" ;
      Z754Tran_CuentaResponsabilidad = "" ;
      Z384Tran_NombCuentadanteOrigen = "" ;
      Z714Tran_EmailCuentadanteOrigen = "" ;
      Z575Tran_NombreProveedor = "" ;
      Z389Tran_NombCuentadanteDestino = "" ;
      Z715Tran_EmailCuentadanteDestino = "" ;
      Z672Tran_NombreIngreso = "" ;
      Z756Tran_Abreviado = "" ;
      Z516Tran_CentroCostoCodigoDestino = "" ;
      Z517Tran_CentroCostoDescripcionDes = "" ;
      Z520Tran_RegionDescripcionDestino = "" ;
      Z608Tran_RegionAbrevDestino = "" ;
      Z721Tran_NombreCuentadanteResponsa = "" ;
      T000516_A759Tran_CedulaResponsabilidad = new long[1] ;
      T000516_n759Tran_CedulaResponsabilidad = new boolean[] {false} ;
      T000516_A721Tran_NombreCuentadanteResponsa = new String[] {""} ;
      T000516_n721Tran_NombreCuentadanteResponsa = new boolean[] {false} ;
      T00059_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      T00059_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      T00059_A517Tran_CentroCostoDescripcionDes = new String[] {""} ;
      T00059_n517Tran_CentroCostoDescripcionDes = new boolean[] {false} ;
      T00059_A518Tran_RegionIdDestino = new long[1] ;
      T00059_n518Tran_RegionIdDestino = new boolean[] {false} ;
      T000511_A519Tran_RegionCodigoDestino = new short[1] ;
      T000511_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      T000511_A520Tran_RegionDescripcionDestino = new String[] {""} ;
      T000511_n520Tran_RegionDescripcionDestino = new boolean[] {false} ;
      T000511_A608Tran_RegionAbrevDestino = new String[] {""} ;
      T000511_n608Tran_RegionAbrevDestino = new boolean[] {false} ;
      T000517_A672Tran_NombreIngreso = new String[] {""} ;
      T000517_n672Tran_NombreIngreso = new boolean[] {false} ;
      T000517_A756Tran_Abreviado = new String[] {""} ;
      T000517_n756Tran_Abreviado = new boolean[] {false} ;
      T000515_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      T000515_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      T000515_A704Tran_CedulaCuentadanteDestino = new long[1] ;
      T000515_n704Tran_CedulaCuentadanteDestino = new boolean[] {false} ;
      T000515_A715Tran_EmailCuentadanteDestino = new String[] {""} ;
      T000515_n715Tran_EmailCuentadanteDestino = new boolean[] {false} ;
      T000514_A575Tran_NombreProveedor = new String[] {""} ;
      T000514_n575Tran_NombreProveedor = new boolean[] {false} ;
      T000514_A703Tran_CedulaProveedor = new long[1] ;
      T000514_n703Tran_CedulaProveedor = new boolean[] {false} ;
      T000513_A384Tran_NombCuentadanteOrigen = new String[] {""} ;
      T000513_n384Tran_NombCuentadanteOrigen = new boolean[] {false} ;
      T000513_A702Tran_CedulaCuentadanteOrigen = new long[1] ;
      T000513_n702Tran_CedulaCuentadanteOrigen = new boolean[] {false} ;
      T000513_A714Tran_EmailCuentadanteOrigen = new String[] {""} ;
      T000513_n714Tran_EmailCuentadanteOrigen = new boolean[] {false} ;
      T000512_A381Tran_DescripcionMovimiento = new String[] {""} ;
      T000512_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      T000512_A478Tran_IndAreadante = new String[] {""} ;
      T000512_n478Tran_IndAreadante = new boolean[] {false} ;
      T000512_A481Tran_IndE_S = new String[] {""} ;
      T000512_n481Tran_IndE_S = new boolean[] {false} ;
      T000512_A479Tran_IndCurso = new String[] {""} ;
      T000512_n479Tran_IndCurso = new boolean[] {false} ;
      T000512_A707Tran_SolicitaCCDestino = new String[] {""} ;
      T000512_n707Tran_SolicitaCCDestino = new boolean[] {false} ;
      T000512_A708Tran_SolicitaRegionDestino = new String[] {""} ;
      T000512_n708Tran_SolicitaRegionDestino = new boolean[] {false} ;
      T000512_A754Tran_CuentaResponsabilidad = new String[] {""} ;
      T000512_n754Tran_CuentaResponsabilidad = new boolean[] {false} ;
      T000512_A499Tran_CodTipoElemento = new long[1] ;
      T000512_n499Tran_CodTipoElemento = new boolean[] {false} ;
      T000518_A482Tran_TipoElemento = new String[] {""} ;
      T000518_n482Tran_TipoElemento = new boolean[] {false} ;
      T00058_A419Tran_CentroCostoCodigo = new String[] {""} ;
      T00058_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      T00058_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      T00058_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      T00058_A57Tran_RegionId = new long[1] ;
      T00058_n57Tran_RegionId = new boolean[] {false} ;
      T000510_A421Tran_RegionCodigo = new short[1] ;
      T000510_n421Tran_RegionCodigo = new boolean[] {false} ;
      T000510_A422Tran_RegionDescripcion = new String[] {""} ;
      T000510_n422Tran_RegionDescripcion = new boolean[] {false} ;
      T000510_A594Tran_RegionAbrev = new String[] {""} ;
      T000510_n594Tran_RegionAbrev = new boolean[] {false} ;
      T00057_A417Tran_UsuarioCodigo = new String[] {""} ;
      T00057_n417Tran_UsuarioCodigo = new boolean[] {false} ;
      T00057_A418Tran_UsuarioNombre = new String[] {""} ;
      T00057_n418Tran_UsuarioNombre = new boolean[] {false} ;
      T000519_A416Tran_Observaciones = new String[] {""} ;
      T000519_n416Tran_Observaciones = new boolean[] {false} ;
      T000519_A46Tran_Id = new long[1] ;
      T000519_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      T000519_A58Tran_Estado = new String[] {""} ;
      T000519_n58Tran_Estado = new boolean[] {false} ;
      T000519_A417Tran_UsuarioCodigo = new String[] {""} ;
      T000519_n417Tran_UsuarioCodigo = new boolean[] {false} ;
      T000519_A418Tran_UsuarioNombre = new String[] {""} ;
      T000519_n418Tran_UsuarioNombre = new boolean[] {false} ;
      T000519_A419Tran_CentroCostoCodigo = new String[] {""} ;
      T000519_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      T000519_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      T000519_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      T000519_A57Tran_RegionId = new long[1] ;
      T000519_n57Tran_RegionId = new boolean[] {false} ;
      T000519_A421Tran_RegionCodigo = new short[1] ;
      T000519_n421Tran_RegionCodigo = new boolean[] {false} ;
      T000519_A422Tran_RegionDescripcion = new String[] {""} ;
      T000519_n422Tran_RegionDescripcion = new boolean[] {false} ;
      T000519_A594Tran_RegionAbrev = new String[] {""} ;
      T000519_n594Tran_RegionAbrev = new boolean[] {false} ;
      T000519_A381Tran_DescripcionMovimiento = new String[] {""} ;
      T000519_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      T000519_A478Tran_IndAreadante = new String[] {""} ;
      T000519_n478Tran_IndAreadante = new boolean[] {false} ;
      T000519_A481Tran_IndE_S = new String[] {""} ;
      T000519_n481Tran_IndE_S = new boolean[] {false} ;
      T000519_A479Tran_IndCurso = new String[] {""} ;
      T000519_n479Tran_IndCurso = new boolean[] {false} ;
      T000519_A482Tran_TipoElemento = new String[] {""} ;
      T000519_n482Tran_TipoElemento = new boolean[] {false} ;
      T000519_A707Tran_SolicitaCCDestino = new String[] {""} ;
      T000519_n707Tran_SolicitaCCDestino = new boolean[] {false} ;
      T000519_A708Tran_SolicitaRegionDestino = new String[] {""} ;
      T000519_n708Tran_SolicitaRegionDestino = new boolean[] {false} ;
      T000519_A754Tran_CuentaResponsabilidad = new String[] {""} ;
      T000519_n754Tran_CuentaResponsabilidad = new boolean[] {false} ;
      T000519_A110Tran_ModuloOrigen = new String[] {""} ;
      T000519_A109Tran_CodAlmaOrigen = new String[] {""} ;
      T000519_A112Tran_CodBodeOrigen = new String[] {""} ;
      T000519_A384Tran_NombCuentadanteOrigen = new String[] {""} ;
      T000519_n384Tran_NombCuentadanteOrigen = new boolean[] {false} ;
      T000519_A702Tran_CedulaCuentadanteOrigen = new long[1] ;
      T000519_n702Tran_CedulaCuentadanteOrigen = new boolean[] {false} ;
      T000519_A714Tran_EmailCuentadanteOrigen = new String[] {""} ;
      T000519_n714Tran_EmailCuentadanteOrigen = new boolean[] {false} ;
      T000519_A575Tran_NombreProveedor = new String[] {""} ;
      T000519_n575Tran_NombreProveedor = new boolean[] {false} ;
      T000519_A703Tran_CedulaProveedor = new long[1] ;
      T000519_n703Tran_CedulaProveedor = new boolean[] {false} ;
      T000519_A385Tran_ModuloDestino = new String[] {""} ;
      T000519_A111Tran_CodAlmaDestino = new String[] {""} ;
      T000519_A387Tran_CodBodeDestino = new String[] {""} ;
      T000519_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      T000519_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      T000519_A704Tran_CedulaCuentadanteDestino = new long[1] ;
      T000519_n704Tran_CedulaCuentadanteDestino = new boolean[] {false} ;
      T000519_A715Tran_EmailCuentadanteDestino = new String[] {""} ;
      T000519_n715Tran_EmailCuentadanteDestino = new boolean[] {false} ;
      T000519_A407Tran_AreadanteCodigo = new String[] {""} ;
      T000519_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      T000519_A408Tran_CursoCodigo = new String[] {""} ;
      T000519_n408Tran_CursoCodigo = new boolean[] {false} ;
      T000519_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000519_n483Tran_ValorTransaccion = new boolean[] {false} ;
      T000519_A498Tran_NumeroLineas = new long[1] ;
      T000519_n498Tran_NumeroLineas = new boolean[] {false} ;
      T000519_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T000519_n390Tran_FechaRatificacion = new boolean[] {false} ;
      T000519_A391Tran_UsuarioRatifica = new String[] {""} ;
      T000519_n391Tran_UsuarioRatifica = new boolean[] {false} ;
      T000519_A513Tran_ConsecutivoCC = new long[1] ;
      T000519_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      T000519_A672Tran_NombreIngreso = new String[] {""} ;
      T000519_n672Tran_NombreIngreso = new boolean[] {false} ;
      T000519_A756Tran_Abreviado = new String[] {""} ;
      T000519_n756Tran_Abreviado = new boolean[] {false} ;
      T000519_A514Tran_NumeroIngreso = new String[] {""} ;
      T000519_n514Tran_NumeroIngreso = new boolean[] {false} ;
      T000519_A515Tran_FechaIngreso = new java.util.Date[] {GXutil.nullDate()} ;
      T000519_n515Tran_FechaIngreso = new boolean[] {false} ;
      T000519_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      T000519_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      T000519_A517Tran_CentroCostoDescripcionDes = new String[] {""} ;
      T000519_n517Tran_CentroCostoDescripcionDes = new boolean[] {false} ;
      T000519_A518Tran_RegionIdDestino = new long[1] ;
      T000519_n518Tran_RegionIdDestino = new boolean[] {false} ;
      T000519_A519Tran_RegionCodigoDestino = new short[1] ;
      T000519_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      T000519_A520Tran_RegionDescripcionDestino = new String[] {""} ;
      T000519_n520Tran_RegionDescripcionDestino = new boolean[] {false} ;
      T000519_A608Tran_RegionAbrevDestino = new String[] {""} ;
      T000519_n608Tran_RegionAbrevDestino = new boolean[] {false} ;
      T000519_A524Tran_Detalle = new String[] {""} ;
      T000519_n524Tran_Detalle = new boolean[] {false} ;
      T000519_A527Tran_TipoEntra = new String[] {""} ;
      T000519_n527Tran_TipoEntra = new boolean[] {false} ;
      T000519_A568Tran_CantidadPadres = new int[1] ;
      T000519_n568Tran_CantidadPadres = new boolean[] {false} ;
      T000519_A667Tran_NumeroGrupo = new short[1] ;
      T000519_n667Tran_NumeroGrupo = new boolean[] {false} ;
      T000519_A668Tran_UsuarioEliminaoAnula = new String[] {""} ;
      T000519_n668Tran_UsuarioEliminaoAnula = new boolean[] {false} ;
      T000519_A669Tran_FechaEliminaoAnula = new java.util.Date[] {GXutil.nullDate()} ;
      T000519_n669Tran_FechaEliminaoAnula = new boolean[] {false} ;
      T000519_A670Tran_ObservacionesAnula = new String[] {""} ;
      T000519_n670Tran_ObservacionesAnula = new boolean[] {false} ;
      T000519_A759Tran_CedulaResponsabilidad = new long[1] ;
      T000519_n759Tran_CedulaResponsabilidad = new boolean[] {false} ;
      T000519_A721Tran_NombreCuentadanteResponsa = new String[] {""} ;
      T000519_n721Tran_NombreCuentadanteResponsa = new boolean[] {false} ;
      T000519_A719Tran_TransaccResponsabilidad = new long[1] ;
      T000519_n719Tran_TransaccResponsabilidad = new boolean[] {false} ;
      T000519_A720Tran_FechaResponsabilidad = new java.util.Date[] {GXutil.nullDate()} ;
      T000519_n720Tran_FechaResponsabilidad = new boolean[] {false} ;
      T000519_A758Tran_TablaResponsabilidad = new short[1] ;
      T000519_n758Tran_TablaResponsabilidad = new boolean[] {false} ;
      T000519_A859Tran_EntidadGobierno = new String[] {""} ;
      T000519_n859Tran_EntidadGobierno = new boolean[] {false} ;
      T000519_A47Tran_UsuarioId = new long[1] ;
      T000519_n47Tran_UsuarioId = new boolean[] {false} ;
      T000519_A48Tran_CentroCostoId = new long[1] ;
      T000519_A50Tran_CentroCostoIdDestino = new long[1] ;
      T000519_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      T000519_A49Tran_CodigoMovimiento = new String[] {""} ;
      T000519_A51Tran_IdCuentadanteOrigen = new long[1] ;
      T000519_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      T000519_A53Tran_IdProveedor = new long[1] ;
      T000519_n53Tran_IdProveedor = new boolean[] {false} ;
      T000519_A52Tran_IdCuentadanteDestino = new long[1] ;
      T000519_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      T000519_A56Tran_IdCuentadanteResponsabili = new long[1] ;
      T000519_n56Tran_IdCuentadanteResponsabili = new boolean[] {false} ;
      T000519_A54Tran_TipoIngreso = new long[1] ;
      T000519_n54Tran_TipoIngreso = new boolean[] {false} ;
      T000519_A499Tran_CodTipoElemento = new long[1] ;
      T000519_n499Tran_CodTipoElemento = new boolean[] {false} ;
      T000520_A417Tran_UsuarioCodigo = new String[] {""} ;
      T000520_n417Tran_UsuarioCodigo = new boolean[] {false} ;
      T000520_A418Tran_UsuarioNombre = new String[] {""} ;
      T000520_n418Tran_UsuarioNombre = new boolean[] {false} ;
      T000521_A419Tran_CentroCostoCodigo = new String[] {""} ;
      T000521_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      T000521_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      T000521_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      T000521_A57Tran_RegionId = new long[1] ;
      T000521_n57Tran_RegionId = new boolean[] {false} ;
      T000522_A421Tran_RegionCodigo = new short[1] ;
      T000522_n421Tran_RegionCodigo = new boolean[] {false} ;
      T000522_A422Tran_RegionDescripcion = new String[] {""} ;
      T000522_n422Tran_RegionDescripcion = new boolean[] {false} ;
      T000522_A594Tran_RegionAbrev = new String[] {""} ;
      T000522_n594Tran_RegionAbrev = new boolean[] {false} ;
      T000523_A381Tran_DescripcionMovimiento = new String[] {""} ;
      T000523_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      T000523_A478Tran_IndAreadante = new String[] {""} ;
      T000523_n478Tran_IndAreadante = new boolean[] {false} ;
      T000523_A481Tran_IndE_S = new String[] {""} ;
      T000523_n481Tran_IndE_S = new boolean[] {false} ;
      T000523_A479Tran_IndCurso = new String[] {""} ;
      T000523_n479Tran_IndCurso = new boolean[] {false} ;
      T000523_A707Tran_SolicitaCCDestino = new String[] {""} ;
      T000523_n707Tran_SolicitaCCDestino = new boolean[] {false} ;
      T000523_A708Tran_SolicitaRegionDestino = new String[] {""} ;
      T000523_n708Tran_SolicitaRegionDestino = new boolean[] {false} ;
      T000523_A754Tran_CuentaResponsabilidad = new String[] {""} ;
      T000523_n754Tran_CuentaResponsabilidad = new boolean[] {false} ;
      T000523_A499Tran_CodTipoElemento = new long[1] ;
      T000523_n499Tran_CodTipoElemento = new boolean[] {false} ;
      T000524_A482Tran_TipoElemento = new String[] {""} ;
      T000524_n482Tran_TipoElemento = new boolean[] {false} ;
      T000525_A384Tran_NombCuentadanteOrigen = new String[] {""} ;
      T000525_n384Tran_NombCuentadanteOrigen = new boolean[] {false} ;
      T000525_A702Tran_CedulaCuentadanteOrigen = new long[1] ;
      T000525_n702Tran_CedulaCuentadanteOrigen = new boolean[] {false} ;
      T000525_A714Tran_EmailCuentadanteOrigen = new String[] {""} ;
      T000525_n714Tran_EmailCuentadanteOrigen = new boolean[] {false} ;
      T000526_A575Tran_NombreProveedor = new String[] {""} ;
      T000526_n575Tran_NombreProveedor = new boolean[] {false} ;
      T000526_A703Tran_CedulaProveedor = new long[1] ;
      T000526_n703Tran_CedulaProveedor = new boolean[] {false} ;
      T000527_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      T000527_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      T000527_A704Tran_CedulaCuentadanteDestino = new long[1] ;
      T000527_n704Tran_CedulaCuentadanteDestino = new boolean[] {false} ;
      T000527_A715Tran_EmailCuentadanteDestino = new String[] {""} ;
      T000527_n715Tran_EmailCuentadanteDestino = new boolean[] {false} ;
      T000528_A672Tran_NombreIngreso = new String[] {""} ;
      T000528_n672Tran_NombreIngreso = new boolean[] {false} ;
      T000528_A756Tran_Abreviado = new String[] {""} ;
      T000528_n756Tran_Abreviado = new boolean[] {false} ;
      T000529_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      T000529_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      T000529_A517Tran_CentroCostoDescripcionDes = new String[] {""} ;
      T000529_n517Tran_CentroCostoDescripcionDes = new boolean[] {false} ;
      T000529_A518Tran_RegionIdDestino = new long[1] ;
      T000529_n518Tran_RegionIdDestino = new boolean[] {false} ;
      T000530_A519Tran_RegionCodigoDestino = new short[1] ;
      T000530_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      T000530_A520Tran_RegionDescripcionDestino = new String[] {""} ;
      T000530_n520Tran_RegionDescripcionDestino = new boolean[] {false} ;
      T000530_A608Tran_RegionAbrevDestino = new String[] {""} ;
      T000530_n608Tran_RegionAbrevDestino = new boolean[] {false} ;
      T000531_A759Tran_CedulaResponsabilidad = new long[1] ;
      T000531_n759Tran_CedulaResponsabilidad = new boolean[] {false} ;
      T000531_A721Tran_NombreCuentadanteResponsa = new String[] {""} ;
      T000531_n721Tran_NombreCuentadanteResponsa = new boolean[] {false} ;
      T000532_A46Tran_Id = new long[1] ;
      T00056_A416Tran_Observaciones = new String[] {""} ;
      T00056_n416Tran_Observaciones = new boolean[] {false} ;
      T00056_A46Tran_Id = new long[1] ;
      T00056_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      T00056_A58Tran_Estado = new String[] {""} ;
      T00056_n58Tran_Estado = new boolean[] {false} ;
      T00056_A110Tran_ModuloOrigen = new String[] {""} ;
      T00056_A109Tran_CodAlmaOrigen = new String[] {""} ;
      T00056_A112Tran_CodBodeOrigen = new String[] {""} ;
      T00056_A385Tran_ModuloDestino = new String[] {""} ;
      T00056_A111Tran_CodAlmaDestino = new String[] {""} ;
      T00056_A387Tran_CodBodeDestino = new String[] {""} ;
      T00056_A407Tran_AreadanteCodigo = new String[] {""} ;
      T00056_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      T00056_A408Tran_CursoCodigo = new String[] {""} ;
      T00056_n408Tran_CursoCodigo = new boolean[] {false} ;
      T00056_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00056_n483Tran_ValorTransaccion = new boolean[] {false} ;
      T00056_A498Tran_NumeroLineas = new long[1] ;
      T00056_n498Tran_NumeroLineas = new boolean[] {false} ;
      T00056_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00056_n390Tran_FechaRatificacion = new boolean[] {false} ;
      T00056_A391Tran_UsuarioRatifica = new String[] {""} ;
      T00056_n391Tran_UsuarioRatifica = new boolean[] {false} ;
      T00056_A513Tran_ConsecutivoCC = new long[1] ;
      T00056_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      T00056_A514Tran_NumeroIngreso = new String[] {""} ;
      T00056_n514Tran_NumeroIngreso = new boolean[] {false} ;
      T00056_A515Tran_FechaIngreso = new java.util.Date[] {GXutil.nullDate()} ;
      T00056_n515Tran_FechaIngreso = new boolean[] {false} ;
      T00056_A524Tran_Detalle = new String[] {""} ;
      T00056_n524Tran_Detalle = new boolean[] {false} ;
      T00056_A527Tran_TipoEntra = new String[] {""} ;
      T00056_n527Tran_TipoEntra = new boolean[] {false} ;
      T00056_A568Tran_CantidadPadres = new int[1] ;
      T00056_n568Tran_CantidadPadres = new boolean[] {false} ;
      T00056_A667Tran_NumeroGrupo = new short[1] ;
      T00056_n667Tran_NumeroGrupo = new boolean[] {false} ;
      T00056_A668Tran_UsuarioEliminaoAnula = new String[] {""} ;
      T00056_n668Tran_UsuarioEliminaoAnula = new boolean[] {false} ;
      T00056_A669Tran_FechaEliminaoAnula = new java.util.Date[] {GXutil.nullDate()} ;
      T00056_n669Tran_FechaEliminaoAnula = new boolean[] {false} ;
      T00056_A670Tran_ObservacionesAnula = new String[] {""} ;
      T00056_n670Tran_ObservacionesAnula = new boolean[] {false} ;
      T00056_A719Tran_TransaccResponsabilidad = new long[1] ;
      T00056_n719Tran_TransaccResponsabilidad = new boolean[] {false} ;
      T00056_A720Tran_FechaResponsabilidad = new java.util.Date[] {GXutil.nullDate()} ;
      T00056_n720Tran_FechaResponsabilidad = new boolean[] {false} ;
      T00056_A758Tran_TablaResponsabilidad = new short[1] ;
      T00056_n758Tran_TablaResponsabilidad = new boolean[] {false} ;
      T00056_A859Tran_EntidadGobierno = new String[] {""} ;
      T00056_n859Tran_EntidadGobierno = new boolean[] {false} ;
      T00056_A47Tran_UsuarioId = new long[1] ;
      T00056_n47Tran_UsuarioId = new boolean[] {false} ;
      T00056_A48Tran_CentroCostoId = new long[1] ;
      T00056_A50Tran_CentroCostoIdDestino = new long[1] ;
      T00056_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      T00056_A49Tran_CodigoMovimiento = new String[] {""} ;
      T00056_A51Tran_IdCuentadanteOrigen = new long[1] ;
      T00056_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      T00056_A53Tran_IdProveedor = new long[1] ;
      T00056_n53Tran_IdProveedor = new boolean[] {false} ;
      T00056_A52Tran_IdCuentadanteDestino = new long[1] ;
      T00056_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      T00056_A56Tran_IdCuentadanteResponsabili = new long[1] ;
      T00056_n56Tran_IdCuentadanteResponsabili = new boolean[] {false} ;
      T00056_A54Tran_TipoIngreso = new long[1] ;
      T00056_n54Tran_TipoIngreso = new boolean[] {false} ;
      T00056_A57Tran_RegionId = new long[1] ;
      T00056_n57Tran_RegionId = new boolean[] {false} ;
      T00056_A481Tran_IndE_S = new String[] {""} ;
      T00056_n481Tran_IndE_S = new boolean[] {false} ;
      T00056_A482Tran_TipoElemento = new String[] {""} ;
      T00056_n482Tran_TipoElemento = new boolean[] {false} ;
      T00056_A518Tran_RegionIdDestino = new long[1] ;
      T00056_n518Tran_RegionIdDestino = new boolean[] {false} ;
      T000533_A46Tran_Id = new long[1] ;
      T000534_A46Tran_Id = new long[1] ;
      T00055_A416Tran_Observaciones = new String[] {""} ;
      T00055_n416Tran_Observaciones = new boolean[] {false} ;
      T00055_A46Tran_Id = new long[1] ;
      T00055_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      T00055_A58Tran_Estado = new String[] {""} ;
      T00055_n58Tran_Estado = new boolean[] {false} ;
      T00055_A110Tran_ModuloOrigen = new String[] {""} ;
      T00055_A109Tran_CodAlmaOrigen = new String[] {""} ;
      T00055_A112Tran_CodBodeOrigen = new String[] {""} ;
      T00055_A385Tran_ModuloDestino = new String[] {""} ;
      T00055_A111Tran_CodAlmaDestino = new String[] {""} ;
      T00055_A387Tran_CodBodeDestino = new String[] {""} ;
      T00055_A407Tran_AreadanteCodigo = new String[] {""} ;
      T00055_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      T00055_A408Tran_CursoCodigo = new String[] {""} ;
      T00055_n408Tran_CursoCodigo = new boolean[] {false} ;
      T00055_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00055_n483Tran_ValorTransaccion = new boolean[] {false} ;
      T00055_A498Tran_NumeroLineas = new long[1] ;
      T00055_n498Tran_NumeroLineas = new boolean[] {false} ;
      T00055_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      T00055_n390Tran_FechaRatificacion = new boolean[] {false} ;
      T00055_A391Tran_UsuarioRatifica = new String[] {""} ;
      T00055_n391Tran_UsuarioRatifica = new boolean[] {false} ;
      T00055_A513Tran_ConsecutivoCC = new long[1] ;
      T00055_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      T00055_A514Tran_NumeroIngreso = new String[] {""} ;
      T00055_n514Tran_NumeroIngreso = new boolean[] {false} ;
      T00055_A515Tran_FechaIngreso = new java.util.Date[] {GXutil.nullDate()} ;
      T00055_n515Tran_FechaIngreso = new boolean[] {false} ;
      T00055_A524Tran_Detalle = new String[] {""} ;
      T00055_n524Tran_Detalle = new boolean[] {false} ;
      T00055_A527Tran_TipoEntra = new String[] {""} ;
      T00055_n527Tran_TipoEntra = new boolean[] {false} ;
      T00055_A568Tran_CantidadPadres = new int[1] ;
      T00055_n568Tran_CantidadPadres = new boolean[] {false} ;
      T00055_A667Tran_NumeroGrupo = new short[1] ;
      T00055_n667Tran_NumeroGrupo = new boolean[] {false} ;
      T00055_A668Tran_UsuarioEliminaoAnula = new String[] {""} ;
      T00055_n668Tran_UsuarioEliminaoAnula = new boolean[] {false} ;
      T00055_A669Tran_FechaEliminaoAnula = new java.util.Date[] {GXutil.nullDate()} ;
      T00055_n669Tran_FechaEliminaoAnula = new boolean[] {false} ;
      T00055_A670Tran_ObservacionesAnula = new String[] {""} ;
      T00055_n670Tran_ObservacionesAnula = new boolean[] {false} ;
      T00055_A719Tran_TransaccResponsabilidad = new long[1] ;
      T00055_n719Tran_TransaccResponsabilidad = new boolean[] {false} ;
      T00055_A720Tran_FechaResponsabilidad = new java.util.Date[] {GXutil.nullDate()} ;
      T00055_n720Tran_FechaResponsabilidad = new boolean[] {false} ;
      T00055_A758Tran_TablaResponsabilidad = new short[1] ;
      T00055_n758Tran_TablaResponsabilidad = new boolean[] {false} ;
      T00055_A859Tran_EntidadGobierno = new String[] {""} ;
      T00055_n859Tran_EntidadGobierno = new boolean[] {false} ;
      T00055_A47Tran_UsuarioId = new long[1] ;
      T00055_n47Tran_UsuarioId = new boolean[] {false} ;
      T00055_A48Tran_CentroCostoId = new long[1] ;
      T00055_A50Tran_CentroCostoIdDestino = new long[1] ;
      T00055_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      T00055_A49Tran_CodigoMovimiento = new String[] {""} ;
      T00055_A51Tran_IdCuentadanteOrigen = new long[1] ;
      T00055_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      T00055_A53Tran_IdProveedor = new long[1] ;
      T00055_n53Tran_IdProveedor = new boolean[] {false} ;
      T00055_A52Tran_IdCuentadanteDestino = new long[1] ;
      T00055_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      T00055_A56Tran_IdCuentadanteResponsabili = new long[1] ;
      T00055_n56Tran_IdCuentadanteResponsabili = new boolean[] {false} ;
      T00055_A54Tran_TipoIngreso = new long[1] ;
      T00055_n54Tran_TipoIngreso = new boolean[] {false} ;
      T00055_A57Tran_RegionId = new long[1] ;
      T00055_n57Tran_RegionId = new boolean[] {false} ;
      T00055_A481Tran_IndE_S = new String[] {""} ;
      T00055_n481Tran_IndE_S = new boolean[] {false} ;
      T00055_A482Tran_TipoElemento = new String[] {""} ;
      T00055_n482Tran_TipoElemento = new boolean[] {false} ;
      T00055_A518Tran_RegionIdDestino = new long[1] ;
      T00055_n518Tran_RegionIdDestino = new boolean[] {false} ;
      T000536_A46Tran_Id = new long[1] ;
      T000539_A417Tran_UsuarioCodigo = new String[] {""} ;
      T000539_n417Tran_UsuarioCodigo = new boolean[] {false} ;
      T000539_A418Tran_UsuarioNombre = new String[] {""} ;
      T000539_n418Tran_UsuarioNombre = new boolean[] {false} ;
      T000540_A419Tran_CentroCostoCodigo = new String[] {""} ;
      T000540_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      T000540_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      T000540_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      T000540_A57Tran_RegionId = new long[1] ;
      T000540_n57Tran_RegionId = new boolean[] {false} ;
      T000541_A421Tran_RegionCodigo = new short[1] ;
      T000541_n421Tran_RegionCodigo = new boolean[] {false} ;
      T000541_A422Tran_RegionDescripcion = new String[] {""} ;
      T000541_n422Tran_RegionDescripcion = new boolean[] {false} ;
      T000541_A594Tran_RegionAbrev = new String[] {""} ;
      T000541_n594Tran_RegionAbrev = new boolean[] {false} ;
      T000542_A381Tran_DescripcionMovimiento = new String[] {""} ;
      T000542_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      T000542_A478Tran_IndAreadante = new String[] {""} ;
      T000542_n478Tran_IndAreadante = new boolean[] {false} ;
      T000542_A481Tran_IndE_S = new String[] {""} ;
      T000542_n481Tran_IndE_S = new boolean[] {false} ;
      T000542_A479Tran_IndCurso = new String[] {""} ;
      T000542_n479Tran_IndCurso = new boolean[] {false} ;
      T000542_A707Tran_SolicitaCCDestino = new String[] {""} ;
      T000542_n707Tran_SolicitaCCDestino = new boolean[] {false} ;
      T000542_A708Tran_SolicitaRegionDestino = new String[] {""} ;
      T000542_n708Tran_SolicitaRegionDestino = new boolean[] {false} ;
      T000542_A754Tran_CuentaResponsabilidad = new String[] {""} ;
      T000542_n754Tran_CuentaResponsabilidad = new boolean[] {false} ;
      T000542_A499Tran_CodTipoElemento = new long[1] ;
      T000542_n499Tran_CodTipoElemento = new boolean[] {false} ;
      T000543_A482Tran_TipoElemento = new String[] {""} ;
      T000543_n482Tran_TipoElemento = new boolean[] {false} ;
      T000544_A384Tran_NombCuentadanteOrigen = new String[] {""} ;
      T000544_n384Tran_NombCuentadanteOrigen = new boolean[] {false} ;
      T000544_A702Tran_CedulaCuentadanteOrigen = new long[1] ;
      T000544_n702Tran_CedulaCuentadanteOrigen = new boolean[] {false} ;
      T000544_A714Tran_EmailCuentadanteOrigen = new String[] {""} ;
      T000544_n714Tran_EmailCuentadanteOrigen = new boolean[] {false} ;
      T000545_A575Tran_NombreProveedor = new String[] {""} ;
      T000545_n575Tran_NombreProveedor = new boolean[] {false} ;
      T000545_A703Tran_CedulaProveedor = new long[1] ;
      T000545_n703Tran_CedulaProveedor = new boolean[] {false} ;
      T000546_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      T000546_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      T000546_A704Tran_CedulaCuentadanteDestino = new long[1] ;
      T000546_n704Tran_CedulaCuentadanteDestino = new boolean[] {false} ;
      T000546_A715Tran_EmailCuentadanteDestino = new String[] {""} ;
      T000546_n715Tran_EmailCuentadanteDestino = new boolean[] {false} ;
      T000547_A672Tran_NombreIngreso = new String[] {""} ;
      T000547_n672Tran_NombreIngreso = new boolean[] {false} ;
      T000547_A756Tran_Abreviado = new String[] {""} ;
      T000547_n756Tran_Abreviado = new boolean[] {false} ;
      T000548_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      T000548_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      T000548_A517Tran_CentroCostoDescripcionDes = new String[] {""} ;
      T000548_n517Tran_CentroCostoDescripcionDes = new boolean[] {false} ;
      T000548_A518Tran_RegionIdDestino = new long[1] ;
      T000548_n518Tran_RegionIdDestino = new boolean[] {false} ;
      T000549_A519Tran_RegionCodigoDestino = new short[1] ;
      T000549_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      T000549_A520Tran_RegionDescripcionDestino = new String[] {""} ;
      T000549_n520Tran_RegionDescripcionDestino = new boolean[] {false} ;
      T000549_A608Tran_RegionAbrevDestino = new String[] {""} ;
      T000549_n608Tran_RegionAbrevDestino = new boolean[] {false} ;
      T000550_A759Tran_CedulaResponsabilidad = new long[1] ;
      T000550_n759Tran_CedulaResponsabilidad = new boolean[] {false} ;
      T000550_A721Tran_NombreCuentadanteResponsa = new String[] {""} ;
      T000550_n721Tran_NombreCuentadanteResponsa = new boolean[] {false} ;
      T000551_A106Nove_Identificador = new long[1] ;
      T000552_A91Regional = new long[1] ;
      T000552_A92Centro_Id = new long[1] ;
      T000552_A27Alma_Modulo = new String[] {""} ;
      T000552_A28Alma_Codigo = new String[] {""} ;
      T000552_A31Bode_Codigo = new String[] {""} ;
      T000552_A93Trans_Id = new long[1] ;
      T000552_A66Elem_Consecutivo = new String[] {""} ;
      T000552_A94Num_Linea = new int[1] ;
      T000553_A46Tran_Id = new long[1] ;
      T000553_A69TDet_Consecutivo = new long[1] ;
      T000554_A46Tran_Id = new long[1] ;
      Z830Tran_Archivo = "" ;
      Z828Tran_Descrip_Documento = "" ;
      Z829Tran_Prefijo_Documento = "" ;
      T000555_A46Tran_Id = new long[1] ;
      T000555_A828Tran_Descrip_Documento = new String[] {""} ;
      T000555_n828Tran_Descrip_Documento = new boolean[] {false} ;
      T000555_A829Tran_Prefijo_Documento = new String[] {""} ;
      T000555_n829Tran_Prefijo_Documento = new boolean[] {false} ;
      T000555_A830Tran_Archivo = new String[] {""} ;
      T000555_n830Tran_Archivo = new boolean[] {false} ;
      T000555_A831Tran_Ruta_Archivo = new String[] {""} ;
      T000555_n831Tran_Ruta_Archivo = new boolean[] {false} ;
      T000555_A827Tran_Nro_Documento = new short[1] ;
      T00054_A828Tran_Descrip_Documento = new String[] {""} ;
      T00054_n828Tran_Descrip_Documento = new boolean[] {false} ;
      T00054_A829Tran_Prefijo_Documento = new String[] {""} ;
      T00054_n829Tran_Prefijo_Documento = new boolean[] {false} ;
      T000556_A828Tran_Descrip_Documento = new String[] {""} ;
      T000556_n828Tran_Descrip_Documento = new boolean[] {false} ;
      T000556_A829Tran_Prefijo_Documento = new String[] {""} ;
      T000556_n829Tran_Prefijo_Documento = new boolean[] {false} ;
      T000557_A46Tran_Id = new long[1] ;
      T000557_A827Tran_Nro_Documento = new short[1] ;
      T00053_A46Tran_Id = new long[1] ;
      T00053_A830Tran_Archivo = new String[] {""} ;
      T00053_n830Tran_Archivo = new boolean[] {false} ;
      T00053_A831Tran_Ruta_Archivo = new String[] {""} ;
      T00053_n831Tran_Ruta_Archivo = new boolean[] {false} ;
      T00053_A827Tran_Nro_Documento = new short[1] ;
      T00052_A46Tran_Id = new long[1] ;
      T00052_A830Tran_Archivo = new String[] {""} ;
      T00052_n830Tran_Archivo = new boolean[] {false} ;
      T00052_A831Tran_Ruta_Archivo = new String[] {""} ;
      T00052_n831Tran_Ruta_Archivo = new boolean[] {false} ;
      T00052_A827Tran_Nro_Documento = new short[1] ;
      T000562_A828Tran_Descrip_Documento = new String[] {""} ;
      T000562_n828Tran_Descrip_Documento = new boolean[] {false} ;
      T000562_A829Tran_Prefijo_Documento = new String[] {""} ;
      T000562_n829Tran_Prefijo_Documento = new boolean[] {false} ;
      T000563_A46Tran_Id = new long[1] ;
      T000563_A827Tran_Nro_Documento = new short[1] ;
      Gridalm_transaccion_documentosRow = new com.genexus.webpanels.GXWebRow();
      subGridalm_transaccion_documentos_Linesclass = "" ;
      ROClassString = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      GXCCtlgxBlob = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      GXt_char5 = "" ;
      GXv_char4 = new String [1] ;
      GXv_int1 = new long [1] ;
      GXv_char3 = new String [1] ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_transaccion__default(),
         new Object[] {
             new Object[] {
            T00052_A46Tran_Id, T00052_A830Tran_Archivo, T00052_n830Tran_Archivo, T00052_A831Tran_Ruta_Archivo, T00052_n831Tran_Ruta_Archivo, T00052_A827Tran_Nro_Documento
            }
            , new Object[] {
            T00053_A46Tran_Id, T00053_A830Tran_Archivo, T00053_n830Tran_Archivo, T00053_A831Tran_Ruta_Archivo, T00053_n831Tran_Ruta_Archivo, T00053_A827Tran_Nro_Documento
            }
            , new Object[] {
            T00054_A828Tran_Descrip_Documento, T00054_n828Tran_Descrip_Documento, T00054_A829Tran_Prefijo_Documento, T00054_n829Tran_Prefijo_Documento
            }
            , new Object[] {
            T00055_A416Tran_Observaciones, T00055_n416Tran_Observaciones, T00055_A46Tran_Id, T00055_A55Tran_FechaRegistro, T00055_A58Tran_Estado, T00055_n58Tran_Estado, T00055_A110Tran_ModuloOrigen, T00055_A109Tran_CodAlmaOrigen, T00055_A112Tran_CodBodeOrigen, T00055_A385Tran_ModuloDestino,
            T00055_A111Tran_CodAlmaDestino, T00055_A387Tran_CodBodeDestino, T00055_A407Tran_AreadanteCodigo, T00055_n407Tran_AreadanteCodigo, T00055_A408Tran_CursoCodigo, T00055_n408Tran_CursoCodigo, T00055_A483Tran_ValorTransaccion, T00055_n483Tran_ValorTransaccion, T00055_A498Tran_NumeroLineas, T00055_n498Tran_NumeroLineas,
            T00055_A390Tran_FechaRatificacion, T00055_n390Tran_FechaRatificacion, T00055_A391Tran_UsuarioRatifica, T00055_n391Tran_UsuarioRatifica, T00055_A513Tran_ConsecutivoCC, T00055_n513Tran_ConsecutivoCC, T00055_A514Tran_NumeroIngreso, T00055_n514Tran_NumeroIngreso, T00055_A515Tran_FechaIngreso, T00055_n515Tran_FechaIngreso,
            T00055_A524Tran_Detalle, T00055_n524Tran_Detalle, T00055_A527Tran_TipoEntra, T00055_n527Tran_TipoEntra, T00055_A568Tran_CantidadPadres, T00055_n568Tran_CantidadPadres, T00055_A667Tran_NumeroGrupo, T00055_n667Tran_NumeroGrupo, T00055_A668Tran_UsuarioEliminaoAnula, T00055_n668Tran_UsuarioEliminaoAnula,
            T00055_A669Tran_FechaEliminaoAnula, T00055_n669Tran_FechaEliminaoAnula, T00055_A670Tran_ObservacionesAnula, T00055_n670Tran_ObservacionesAnula, T00055_A719Tran_TransaccResponsabilidad, T00055_n719Tran_TransaccResponsabilidad, T00055_A720Tran_FechaResponsabilidad, T00055_n720Tran_FechaResponsabilidad, T00055_A758Tran_TablaResponsabilidad, T00055_n758Tran_TablaResponsabilidad,
            T00055_A859Tran_EntidadGobierno, T00055_n859Tran_EntidadGobierno, T00055_A47Tran_UsuarioId, T00055_n47Tran_UsuarioId, T00055_A48Tran_CentroCostoId, T00055_A50Tran_CentroCostoIdDestino, T00055_n50Tran_CentroCostoIdDestino, T00055_A49Tran_CodigoMovimiento, T00055_A51Tran_IdCuentadanteOrigen, T00055_n51Tran_IdCuentadanteOrigen,
            T00055_A53Tran_IdProveedor, T00055_n53Tran_IdProveedor, T00055_A52Tran_IdCuentadanteDestino, T00055_n52Tran_IdCuentadanteDestino, T00055_A56Tran_IdCuentadanteResponsabili, T00055_n56Tran_IdCuentadanteResponsabili, T00055_A54Tran_TipoIngreso, T00055_n54Tran_TipoIngreso, T00055_A57Tran_RegionId, T00055_n57Tran_RegionId,
            T00055_A481Tran_IndE_S, T00055_n481Tran_IndE_S, T00055_A482Tran_TipoElemento, T00055_A518Tran_RegionIdDestino, T00055_n518Tran_RegionIdDestino
            }
            , new Object[] {
            T00056_A416Tran_Observaciones, T00056_n416Tran_Observaciones, T00056_A46Tran_Id, T00056_A55Tran_FechaRegistro, T00056_A58Tran_Estado, T00056_n58Tran_Estado, T00056_A110Tran_ModuloOrigen, T00056_A109Tran_CodAlmaOrigen, T00056_A112Tran_CodBodeOrigen, T00056_A385Tran_ModuloDestino,
            T00056_A111Tran_CodAlmaDestino, T00056_A387Tran_CodBodeDestino, T00056_A407Tran_AreadanteCodigo, T00056_n407Tran_AreadanteCodigo, T00056_A408Tran_CursoCodigo, T00056_n408Tran_CursoCodigo, T00056_A483Tran_ValorTransaccion, T00056_n483Tran_ValorTransaccion, T00056_A498Tran_NumeroLineas, T00056_n498Tran_NumeroLineas,
            T00056_A390Tran_FechaRatificacion, T00056_n390Tran_FechaRatificacion, T00056_A391Tran_UsuarioRatifica, T00056_n391Tran_UsuarioRatifica, T00056_A513Tran_ConsecutivoCC, T00056_n513Tran_ConsecutivoCC, T00056_A514Tran_NumeroIngreso, T00056_n514Tran_NumeroIngreso, T00056_A515Tran_FechaIngreso, T00056_n515Tran_FechaIngreso,
            T00056_A524Tran_Detalle, T00056_n524Tran_Detalle, T00056_A527Tran_TipoEntra, T00056_n527Tran_TipoEntra, T00056_A568Tran_CantidadPadres, T00056_n568Tran_CantidadPadres, T00056_A667Tran_NumeroGrupo, T00056_n667Tran_NumeroGrupo, T00056_A668Tran_UsuarioEliminaoAnula, T00056_n668Tran_UsuarioEliminaoAnula,
            T00056_A669Tran_FechaEliminaoAnula, T00056_n669Tran_FechaEliminaoAnula, T00056_A670Tran_ObservacionesAnula, T00056_n670Tran_ObservacionesAnula, T00056_A719Tran_TransaccResponsabilidad, T00056_n719Tran_TransaccResponsabilidad, T00056_A720Tran_FechaResponsabilidad, T00056_n720Tran_FechaResponsabilidad, T00056_A758Tran_TablaResponsabilidad, T00056_n758Tran_TablaResponsabilidad,
            T00056_A859Tran_EntidadGobierno, T00056_n859Tran_EntidadGobierno, T00056_A47Tran_UsuarioId, T00056_n47Tran_UsuarioId, T00056_A48Tran_CentroCostoId, T00056_A50Tran_CentroCostoIdDestino, T00056_n50Tran_CentroCostoIdDestino, T00056_A49Tran_CodigoMovimiento, T00056_A51Tran_IdCuentadanteOrigen, T00056_n51Tran_IdCuentadanteOrigen,
            T00056_A53Tran_IdProveedor, T00056_n53Tran_IdProveedor, T00056_A52Tran_IdCuentadanteDestino, T00056_n52Tran_IdCuentadanteDestino, T00056_A56Tran_IdCuentadanteResponsabili, T00056_n56Tran_IdCuentadanteResponsabili, T00056_A54Tran_TipoIngreso, T00056_n54Tran_TipoIngreso, T00056_A57Tran_RegionId, T00056_n57Tran_RegionId,
            T00056_A481Tran_IndE_S, T00056_n481Tran_IndE_S, T00056_A482Tran_TipoElemento, T00056_A518Tran_RegionIdDestino, T00056_n518Tran_RegionIdDestino
            }
            , new Object[] {
            T00057_A417Tran_UsuarioCodigo, T00057_n417Tran_UsuarioCodigo, T00057_A418Tran_UsuarioNombre, T00057_n418Tran_UsuarioNombre
            }
            , new Object[] {
            T00058_A419Tran_CentroCostoCodigo, T00058_n419Tran_CentroCostoCodigo, T00058_A420Tran_CentroCostoDescripcion, T00058_n420Tran_CentroCostoDescripcion, T00058_A57Tran_RegionId, T00058_n57Tran_RegionId
            }
            , new Object[] {
            T00059_A516Tran_CentroCostoCodigoDestino, T00059_n516Tran_CentroCostoCodigoDestino, T00059_A517Tran_CentroCostoDescripcionDes, T00059_n517Tran_CentroCostoDescripcionDes, T00059_A518Tran_RegionIdDestino, T00059_n518Tran_RegionIdDestino
            }
            , new Object[] {
            T000510_A421Tran_RegionCodigo, T000510_n421Tran_RegionCodigo, T000510_A422Tran_RegionDescripcion, T000510_n422Tran_RegionDescripcion, T000510_A594Tran_RegionAbrev, T000510_n594Tran_RegionAbrev
            }
            , new Object[] {
            T000511_A519Tran_RegionCodigoDestino, T000511_n519Tran_RegionCodigoDestino, T000511_A520Tran_RegionDescripcionDestino, T000511_n520Tran_RegionDescripcionDestino, T000511_A608Tran_RegionAbrevDestino, T000511_n608Tran_RegionAbrevDestino
            }
            , new Object[] {
            T000512_A381Tran_DescripcionMovimiento, T000512_n381Tran_DescripcionMovimiento, T000512_A478Tran_IndAreadante, T000512_n478Tran_IndAreadante, T000512_A481Tran_IndE_S, T000512_n481Tran_IndE_S, T000512_A479Tran_IndCurso, T000512_n479Tran_IndCurso, T000512_A707Tran_SolicitaCCDestino, T000512_n707Tran_SolicitaCCDestino,
            T000512_A708Tran_SolicitaRegionDestino, T000512_n708Tran_SolicitaRegionDestino, T000512_A754Tran_CuentaResponsabilidad, T000512_n754Tran_CuentaResponsabilidad, T000512_A499Tran_CodTipoElemento, T000512_n499Tran_CodTipoElemento
            }
            , new Object[] {
            T000513_A384Tran_NombCuentadanteOrigen, T000513_n384Tran_NombCuentadanteOrigen, T000513_A702Tran_CedulaCuentadanteOrigen, T000513_n702Tran_CedulaCuentadanteOrigen, T000513_A714Tran_EmailCuentadanteOrigen, T000513_n714Tran_EmailCuentadanteOrigen
            }
            , new Object[] {
            T000514_A575Tran_NombreProveedor, T000514_n575Tran_NombreProveedor, T000514_A703Tran_CedulaProveedor, T000514_n703Tran_CedulaProveedor
            }
            , new Object[] {
            T000515_A389Tran_NombCuentadanteDestino, T000515_n389Tran_NombCuentadanteDestino, T000515_A704Tran_CedulaCuentadanteDestino, T000515_n704Tran_CedulaCuentadanteDestino, T000515_A715Tran_EmailCuentadanteDestino, T000515_n715Tran_EmailCuentadanteDestino
            }
            , new Object[] {
            T000516_A759Tran_CedulaResponsabilidad, T000516_n759Tran_CedulaResponsabilidad, T000516_A721Tran_NombreCuentadanteResponsa, T000516_n721Tran_NombreCuentadanteResponsa
            }
            , new Object[] {
            T000517_A672Tran_NombreIngreso, T000517_n672Tran_NombreIngreso, T000517_A756Tran_Abreviado, T000517_n756Tran_Abreviado
            }
            , new Object[] {
            T000518_A482Tran_TipoElemento, T000518_n482Tran_TipoElemento
            }
            , new Object[] {
            T000519_A416Tran_Observaciones, T000519_n416Tran_Observaciones, T000519_A46Tran_Id, T000519_A55Tran_FechaRegistro, T000519_A58Tran_Estado, T000519_n58Tran_Estado, T000519_A417Tran_UsuarioCodigo, T000519_n417Tran_UsuarioCodigo, T000519_A418Tran_UsuarioNombre, T000519_n418Tran_UsuarioNombre,
            T000519_A419Tran_CentroCostoCodigo, T000519_n419Tran_CentroCostoCodigo, T000519_A420Tran_CentroCostoDescripcion, T000519_n420Tran_CentroCostoDescripcion, T000519_A57Tran_RegionId, T000519_n57Tran_RegionId, T000519_A421Tran_RegionCodigo, T000519_n421Tran_RegionCodigo, T000519_A422Tran_RegionDescripcion, T000519_n422Tran_RegionDescripcion,
            T000519_A594Tran_RegionAbrev, T000519_n594Tran_RegionAbrev, T000519_A381Tran_DescripcionMovimiento, T000519_n381Tran_DescripcionMovimiento, T000519_A478Tran_IndAreadante, T000519_n478Tran_IndAreadante, T000519_A481Tran_IndE_S, T000519_n481Tran_IndE_S, T000519_A479Tran_IndCurso, T000519_n479Tran_IndCurso,
            T000519_A482Tran_TipoElemento, T000519_A707Tran_SolicitaCCDestino, T000519_n707Tran_SolicitaCCDestino, T000519_A708Tran_SolicitaRegionDestino, T000519_n708Tran_SolicitaRegionDestino, T000519_A754Tran_CuentaResponsabilidad, T000519_n754Tran_CuentaResponsabilidad, T000519_A110Tran_ModuloOrigen, T000519_A109Tran_CodAlmaOrigen, T000519_A112Tran_CodBodeOrigen,
            T000519_A384Tran_NombCuentadanteOrigen, T000519_n384Tran_NombCuentadanteOrigen, T000519_A702Tran_CedulaCuentadanteOrigen, T000519_n702Tran_CedulaCuentadanteOrigen, T000519_A714Tran_EmailCuentadanteOrigen, T000519_n714Tran_EmailCuentadanteOrigen, T000519_A575Tran_NombreProveedor, T000519_n575Tran_NombreProveedor, T000519_A703Tran_CedulaProveedor, T000519_n703Tran_CedulaProveedor,
            T000519_A385Tran_ModuloDestino, T000519_A111Tran_CodAlmaDestino, T000519_A387Tran_CodBodeDestino, T000519_A389Tran_NombCuentadanteDestino, T000519_n389Tran_NombCuentadanteDestino, T000519_A704Tran_CedulaCuentadanteDestino, T000519_n704Tran_CedulaCuentadanteDestino, T000519_A715Tran_EmailCuentadanteDestino, T000519_n715Tran_EmailCuentadanteDestino, T000519_A407Tran_AreadanteCodigo,
            T000519_n407Tran_AreadanteCodigo, T000519_A408Tran_CursoCodigo, T000519_n408Tran_CursoCodigo, T000519_A483Tran_ValorTransaccion, T000519_n483Tran_ValorTransaccion, T000519_A498Tran_NumeroLineas, T000519_n498Tran_NumeroLineas, T000519_A390Tran_FechaRatificacion, T000519_n390Tran_FechaRatificacion, T000519_A391Tran_UsuarioRatifica,
            T000519_n391Tran_UsuarioRatifica, T000519_A513Tran_ConsecutivoCC, T000519_n513Tran_ConsecutivoCC, T000519_A672Tran_NombreIngreso, T000519_n672Tran_NombreIngreso, T000519_A756Tran_Abreviado, T000519_n756Tran_Abreviado, T000519_A514Tran_NumeroIngreso, T000519_n514Tran_NumeroIngreso, T000519_A515Tran_FechaIngreso,
            T000519_n515Tran_FechaIngreso, T000519_A516Tran_CentroCostoCodigoDestino, T000519_n516Tran_CentroCostoCodigoDestino, T000519_A517Tran_CentroCostoDescripcionDes, T000519_n517Tran_CentroCostoDescripcionDes, T000519_A518Tran_RegionIdDestino, T000519_n518Tran_RegionIdDestino, T000519_A519Tran_RegionCodigoDestino, T000519_n519Tran_RegionCodigoDestino, T000519_A520Tran_RegionDescripcionDestino,
            T000519_n520Tran_RegionDescripcionDestino, T000519_A608Tran_RegionAbrevDestino, T000519_n608Tran_RegionAbrevDestino, T000519_A524Tran_Detalle, T000519_n524Tran_Detalle, T000519_A527Tran_TipoEntra, T000519_n527Tran_TipoEntra, T000519_A568Tran_CantidadPadres, T000519_n568Tran_CantidadPadres, T000519_A667Tran_NumeroGrupo,
            T000519_n667Tran_NumeroGrupo, T000519_A668Tran_UsuarioEliminaoAnula, T000519_n668Tran_UsuarioEliminaoAnula, T000519_A669Tran_FechaEliminaoAnula, T000519_n669Tran_FechaEliminaoAnula, T000519_A670Tran_ObservacionesAnula, T000519_n670Tran_ObservacionesAnula, T000519_A759Tran_CedulaResponsabilidad, T000519_n759Tran_CedulaResponsabilidad, T000519_A721Tran_NombreCuentadanteResponsa,
            T000519_n721Tran_NombreCuentadanteResponsa, T000519_A719Tran_TransaccResponsabilidad, T000519_n719Tran_TransaccResponsabilidad, T000519_A720Tran_FechaResponsabilidad, T000519_n720Tran_FechaResponsabilidad, T000519_A758Tran_TablaResponsabilidad, T000519_n758Tran_TablaResponsabilidad, T000519_A859Tran_EntidadGobierno, T000519_n859Tran_EntidadGobierno, T000519_A47Tran_UsuarioId,
            T000519_n47Tran_UsuarioId, T000519_A48Tran_CentroCostoId, T000519_A50Tran_CentroCostoIdDestino, T000519_n50Tran_CentroCostoIdDestino, T000519_A49Tran_CodigoMovimiento, T000519_A51Tran_IdCuentadanteOrigen, T000519_n51Tran_IdCuentadanteOrigen, T000519_A53Tran_IdProveedor, T000519_n53Tran_IdProveedor, T000519_A52Tran_IdCuentadanteDestino,
            T000519_n52Tran_IdCuentadanteDestino, T000519_A56Tran_IdCuentadanteResponsabili, T000519_n56Tran_IdCuentadanteResponsabili, T000519_A54Tran_TipoIngreso, T000519_n54Tran_TipoIngreso, T000519_A499Tran_CodTipoElemento, T000519_n499Tran_CodTipoElemento
            }
            , new Object[] {
            T000520_A417Tran_UsuarioCodigo, T000520_n417Tran_UsuarioCodigo, T000520_A418Tran_UsuarioNombre, T000520_n418Tran_UsuarioNombre
            }
            , new Object[] {
            T000521_A419Tran_CentroCostoCodigo, T000521_n419Tran_CentroCostoCodigo, T000521_A420Tran_CentroCostoDescripcion, T000521_n420Tran_CentroCostoDescripcion, T000521_A57Tran_RegionId, T000521_n57Tran_RegionId
            }
            , new Object[] {
            T000522_A421Tran_RegionCodigo, T000522_n421Tran_RegionCodigo, T000522_A422Tran_RegionDescripcion, T000522_n422Tran_RegionDescripcion, T000522_A594Tran_RegionAbrev, T000522_n594Tran_RegionAbrev
            }
            , new Object[] {
            T000523_A381Tran_DescripcionMovimiento, T000523_n381Tran_DescripcionMovimiento, T000523_A478Tran_IndAreadante, T000523_n478Tran_IndAreadante, T000523_A481Tran_IndE_S, T000523_n481Tran_IndE_S, T000523_A479Tran_IndCurso, T000523_n479Tran_IndCurso, T000523_A707Tran_SolicitaCCDestino, T000523_n707Tran_SolicitaCCDestino,
            T000523_A708Tran_SolicitaRegionDestino, T000523_n708Tran_SolicitaRegionDestino, T000523_A754Tran_CuentaResponsabilidad, T000523_n754Tran_CuentaResponsabilidad, T000523_A499Tran_CodTipoElemento, T000523_n499Tran_CodTipoElemento
            }
            , new Object[] {
            T000524_A482Tran_TipoElemento, T000524_n482Tran_TipoElemento
            }
            , new Object[] {
            T000525_A384Tran_NombCuentadanteOrigen, T000525_n384Tran_NombCuentadanteOrigen, T000525_A702Tran_CedulaCuentadanteOrigen, T000525_n702Tran_CedulaCuentadanteOrigen, T000525_A714Tran_EmailCuentadanteOrigen, T000525_n714Tran_EmailCuentadanteOrigen
            }
            , new Object[] {
            T000526_A575Tran_NombreProveedor, T000526_n575Tran_NombreProveedor, T000526_A703Tran_CedulaProveedor, T000526_n703Tran_CedulaProveedor
            }
            , new Object[] {
            T000527_A389Tran_NombCuentadanteDestino, T000527_n389Tran_NombCuentadanteDestino, T000527_A704Tran_CedulaCuentadanteDestino, T000527_n704Tran_CedulaCuentadanteDestino, T000527_A715Tran_EmailCuentadanteDestino, T000527_n715Tran_EmailCuentadanteDestino
            }
            , new Object[] {
            T000528_A672Tran_NombreIngreso, T000528_n672Tran_NombreIngreso, T000528_A756Tran_Abreviado, T000528_n756Tran_Abreviado
            }
            , new Object[] {
            T000529_A516Tran_CentroCostoCodigoDestino, T000529_n516Tran_CentroCostoCodigoDestino, T000529_A517Tran_CentroCostoDescripcionDes, T000529_n517Tran_CentroCostoDescripcionDes, T000529_A518Tran_RegionIdDestino, T000529_n518Tran_RegionIdDestino
            }
            , new Object[] {
            T000530_A519Tran_RegionCodigoDestino, T000530_n519Tran_RegionCodigoDestino, T000530_A520Tran_RegionDescripcionDestino, T000530_n520Tran_RegionDescripcionDestino, T000530_A608Tran_RegionAbrevDestino, T000530_n608Tran_RegionAbrevDestino
            }
            , new Object[] {
            T000531_A759Tran_CedulaResponsabilidad, T000531_n759Tran_CedulaResponsabilidad, T000531_A721Tran_NombreCuentadanteResponsa, T000531_n721Tran_NombreCuentadanteResponsa
            }
            , new Object[] {
            T000532_A46Tran_Id
            }
            , new Object[] {
            T000533_A46Tran_Id
            }
            , new Object[] {
            T000534_A46Tran_Id
            }
            , new Object[] {
            }
            , new Object[] {
            T000536_A46Tran_Id
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000539_A417Tran_UsuarioCodigo, T000539_n417Tran_UsuarioCodigo, T000539_A418Tran_UsuarioNombre, T000539_n418Tran_UsuarioNombre
            }
            , new Object[] {
            T000540_A419Tran_CentroCostoCodigo, T000540_n419Tran_CentroCostoCodigo, T000540_A420Tran_CentroCostoDescripcion, T000540_n420Tran_CentroCostoDescripcion, T000540_A57Tran_RegionId, T000540_n57Tran_RegionId
            }
            , new Object[] {
            T000541_A421Tran_RegionCodigo, T000541_n421Tran_RegionCodigo, T000541_A422Tran_RegionDescripcion, T000541_n422Tran_RegionDescripcion, T000541_A594Tran_RegionAbrev, T000541_n594Tran_RegionAbrev
            }
            , new Object[] {
            T000542_A381Tran_DescripcionMovimiento, T000542_n381Tran_DescripcionMovimiento, T000542_A478Tran_IndAreadante, T000542_n478Tran_IndAreadante, T000542_A481Tran_IndE_S, T000542_n481Tran_IndE_S, T000542_A479Tran_IndCurso, T000542_n479Tran_IndCurso, T000542_A707Tran_SolicitaCCDestino, T000542_n707Tran_SolicitaCCDestino,
            T000542_A708Tran_SolicitaRegionDestino, T000542_n708Tran_SolicitaRegionDestino, T000542_A754Tran_CuentaResponsabilidad, T000542_n754Tran_CuentaResponsabilidad, T000542_A499Tran_CodTipoElemento, T000542_n499Tran_CodTipoElemento
            }
            , new Object[] {
            T000543_A482Tran_TipoElemento, T000543_n482Tran_TipoElemento
            }
            , new Object[] {
            T000544_A384Tran_NombCuentadanteOrigen, T000544_n384Tran_NombCuentadanteOrigen, T000544_A702Tran_CedulaCuentadanteOrigen, T000544_n702Tran_CedulaCuentadanteOrigen, T000544_A714Tran_EmailCuentadanteOrigen, T000544_n714Tran_EmailCuentadanteOrigen
            }
            , new Object[] {
            T000545_A575Tran_NombreProveedor, T000545_n575Tran_NombreProveedor, T000545_A703Tran_CedulaProveedor, T000545_n703Tran_CedulaProveedor
            }
            , new Object[] {
            T000546_A389Tran_NombCuentadanteDestino, T000546_n389Tran_NombCuentadanteDestino, T000546_A704Tran_CedulaCuentadanteDestino, T000546_n704Tran_CedulaCuentadanteDestino, T000546_A715Tran_EmailCuentadanteDestino, T000546_n715Tran_EmailCuentadanteDestino
            }
            , new Object[] {
            T000547_A672Tran_NombreIngreso, T000547_n672Tran_NombreIngreso, T000547_A756Tran_Abreviado, T000547_n756Tran_Abreviado
            }
            , new Object[] {
            T000548_A516Tran_CentroCostoCodigoDestino, T000548_n516Tran_CentroCostoCodigoDestino, T000548_A517Tran_CentroCostoDescripcionDes, T000548_n517Tran_CentroCostoDescripcionDes, T000548_A518Tran_RegionIdDestino, T000548_n518Tran_RegionIdDestino
            }
            , new Object[] {
            T000549_A519Tran_RegionCodigoDestino, T000549_n519Tran_RegionCodigoDestino, T000549_A520Tran_RegionDescripcionDestino, T000549_n520Tran_RegionDescripcionDestino, T000549_A608Tran_RegionAbrevDestino, T000549_n608Tran_RegionAbrevDestino
            }
            , new Object[] {
            T000550_A759Tran_CedulaResponsabilidad, T000550_n759Tran_CedulaResponsabilidad, T000550_A721Tran_NombreCuentadanteResponsa, T000550_n721Tran_NombreCuentadanteResponsa
            }
            , new Object[] {
            T000551_A106Nove_Identificador
            }
            , new Object[] {
            T000552_A91Regional, T000552_A92Centro_Id, T000552_A27Alma_Modulo, T000552_A28Alma_Codigo, T000552_A31Bode_Codigo, T000552_A93Trans_Id, T000552_A66Elem_Consecutivo, T000552_A94Num_Linea
            }
            , new Object[] {
            T000553_A46Tran_Id, T000553_A69TDet_Consecutivo
            }
            , new Object[] {
            T000554_A46Tran_Id
            }
            , new Object[] {
            T000555_A46Tran_Id, T000555_A828Tran_Descrip_Documento, T000555_n828Tran_Descrip_Documento, T000555_A829Tran_Prefijo_Documento, T000555_n829Tran_Prefijo_Documento, T000555_A830Tran_Archivo, T000555_n830Tran_Archivo, T000555_A831Tran_Ruta_Archivo, T000555_n831Tran_Ruta_Archivo, T000555_A827Tran_Nro_Documento
            }
            , new Object[] {
            T000556_A828Tran_Descrip_Documento, T000556_n828Tran_Descrip_Documento, T000556_A829Tran_Prefijo_Documento, T000556_n829Tran_Prefijo_Documento
            }
            , new Object[] {
            T000557_A46Tran_Id, T000557_A827Tran_Nro_Documento
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
            T000562_A828Tran_Descrip_Documento, T000562_n828Tran_Descrip_Documento, T000562_A829Tran_Prefijo_Documento, T000562_n829Tran_Prefijo_Documento
            }
            , new Object[] {
            T000563_A46Tran_Id, T000563_A827Tran_Nro_Documento
            }
         }
      );
      AV47Pgmname = "ALM_TRANSACCION" ;
      Z55Tran_FechaRegistro = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A55Tran_FechaRegistro = GXutil.serverNow( context, remoteHandle, pr_default) ;
      i55Tran_FechaRegistro = GXutil.serverNow( context, remoteHandle, pr_default) ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte subGridalm_transaccion_documentos_Backcolorstyle ;
   private byte subGridalm_transaccion_documentos_Allowselection ;
   private byte subGridalm_transaccion_documentos_Allowhovering ;
   private byte subGridalm_transaccion_documentos_Allowcollapsing ;
   private byte subGridalm_transaccion_documentos_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridalm_transaccion_documentos_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nIsMod_61 ;
   private short Z667Tran_NumeroGrupo ;
   private short Z758Tran_TablaResponsabilidad ;
   private short nRC_GXsfl_334 ;
   private short nGXsfl_334_idx=1 ;
   private short Z827Tran_Nro_Documento ;
   private short nRcdDeleted_61 ;
   private short nRcdExists_61 ;
   private short A827Tran_Nro_Documento ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A421Tran_RegionCodigo ;
   private short A519Tran_RegionCodigoDestino ;
   private short A667Tran_NumeroGrupo ;
   private short A758Tran_TablaResponsabilidad ;
   private short nBlankRcdCount61 ;
   private short RcdFound61 ;
   private short nBlankRcdUsr61 ;
   private short RcdFound7 ;
   private short Z421Tran_RegionCodigo ;
   private short Z519Tran_RegionCodigoDestino ;
   private int Z568Tran_CantidadPadres ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtTran_Id_Enabled ;
   private int edtTran_Id_Visible ;
   private int edtTran_FechaRegistro_Enabled ;
   private int edtTran_UsuarioId_Visible ;
   private int edtTran_UsuarioId_Enabled ;
   private int imgprompt_47_Visible ;
   private int edtTran_UsuarioCodigo_Visible ;
   private int edtTran_UsuarioCodigo_Enabled ;
   private int edtTran_UsuarioNombre_Visible ;
   private int edtTran_UsuarioNombre_Enabled ;
   private int edtTran_CentroCostoId_Enabled ;
   private int imgprompt_48_Visible ;
   private int edtTran_CentroCostoCodigo_Enabled ;
   private int edtTran_CentroCostoDescripcion_Enabled ;
   private int edtTran_RegionId_Enabled ;
   private int edtTran_RegionId_Visible ;
   private int edtTran_RegionCodigo_Enabled ;
   private int edtTran_RegionDescripcion_Enabled ;
   private int edtTran_RegionAbrev_Enabled ;
   private int edtTran_CodigoMovimiento_Enabled ;
   private int imgprompt_49_Visible ;
   private int edtTran_DescripcionMovimiento_Enabled ;
   private int edtTran_CodTipoElemento_Enabled ;
   private int edtTran_ModuloOrigen_Enabled ;
   private int edtTran_CodAlmaOrigen_Enabled ;
   private int edtTran_CodBodeOrigen_Enabled ;
   private int edtTran_IdCuentadanteOrigen_Enabled ;
   private int imgprompt_51_Visible ;
   private int edtTran_NombCuentadanteOrigen_Enabled ;
   private int edtTran_CedulaCuentadanteOrigen_Enabled ;
   private int edtTran_EmailCuentadanteOrigen_Enabled ;
   private int edtTran_IdProveedor_Visible ;
   private int edtTran_IdProveedor_Enabled ;
   private int imgprompt_53_Visible ;
   private int edtTran_NombreProveedor_Enabled ;
   private int edtTran_CedulaProveedor_Enabled ;
   private int edtTran_ModuloDestino_Enabled ;
   private int edtTran_CodAlmaDestino_Enabled ;
   private int edtTran_CodBodeDestino_Enabled ;
   private int edtTran_IdCuentadanteDestino_Enabled ;
   private int imgprompt_52_Visible ;
   private int edtTran_NombCuentadanteDestino_Enabled ;
   private int edtTran_CedulaCuentadanteDestino_Enabled ;
   private int edtTran_EmailCuentadanteDestino_Enabled ;
   private int edtTran_Observaciones_Enabled ;
   private int edtTran_AreadanteCodigo_Visible ;
   private int edtTran_AreadanteCodigo_Enabled ;
   private int edtTran_CursoCodigo_Visible ;
   private int edtTran_CursoCodigo_Enabled ;
   private int edtTran_ValorTransaccion_Enabled ;
   private int edtTran_NumeroLineas_Enabled ;
   private int edtTran_FechaRatificacion_Enabled ;
   private int edtTran_UsuarioRatifica_Enabled ;
   private int edtTran_ConsecutivoCC_Enabled ;
   private int edtTran_ConsecutivoCC_Visible ;
   private int edtTran_NombreIngreso_Enabled ;
   private int edtTran_Abreviado_Enabled ;
   private int edtTran_NumeroIngreso_Visible ;
   private int edtTran_NumeroIngreso_Enabled ;
   private int edtTran_FechaIngreso_Visible ;
   private int edtTran_FechaIngreso_Enabled ;
   private int edtTran_CentroCostoIdDestino_Enabled ;
   private int imgprompt_50_Visible ;
   private int edtTran_CentroCostoCodigoDestino_Enabled ;
   private int edtTran_CentroCostoDescripcionDes_Enabled ;
   private int edtTran_RegionIdDestino_Enabled ;
   private int edtTran_RegionCodigoDestino_Enabled ;
   private int edtTran_RegionDescripcionDestino_Enabled ;
   private int edtTran_RegionAbrevDestino_Enabled ;
   private int edtTran_Detalle_Enabled ;
   private int A568Tran_CantidadPadres ;
   private int edtTran_CantidadPadres_Enabled ;
   private int edtTran_CantidadPadres_Visible ;
   private int edtTran_NumeroGrupo_Enabled ;
   private int edtTran_UsuarioEliminaoAnula_Enabled ;
   private int edtTran_FechaEliminaoAnula_Enabled ;
   private int edtTran_ObservacionesAnula_Enabled ;
   private int edtTran_IdCuentadanteResponsabili_Enabled ;
   private int imgprompt_56_Visible ;
   private int edtTran_CedulaResponsabilidad_Enabled ;
   private int edtTran_NombreCuentadanteResponsa_Enabled ;
   private int edtTran_TransaccResponsabilidad_Enabled ;
   private int edtTran_FechaResponsabilidad_Enabled ;
   private int edtTran_TablaResponsabilidad_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtTran_Nro_Documento_Enabled ;
   private int edtTran_Descrip_Documento_Enabled ;
   private int edtTran_Prefijo_Documento_Enabled ;
   private int edtTran_Archivo_Enabled ;
   private int edtTran_Ruta_Archivo_Enabled ;
   private int subGridalm_transaccion_documentos_Selectioncolor ;
   private int subGridalm_transaccion_documentos_Hoveringcolor ;
   private int fRowAdded ;
   private int AV48GXV1 ;
   private int GX_JID ;
   private int subGridalm_transaccion_documentos_Backcolor ;
   private int subGridalm_transaccion_documentos_Allbackcolor ;
   private int imgprompt_827_Visible ;
   private int defedtTran_Nro_Documento_Enabled ;
   private int idxLst ;
   private long wcpOAV33Tran_Id ;
   private long Z46Tran_Id ;
   private long Z498Tran_NumeroLineas ;
   private long Z513Tran_ConsecutivoCC ;
   private long Z719Tran_TransaccResponsabilidad ;
   private long Z47Tran_UsuarioId ;
   private long Z48Tran_CentroCostoId ;
   private long Z50Tran_CentroCostoIdDestino ;
   private long Z51Tran_IdCuentadanteOrigen ;
   private long Z53Tran_IdProveedor ;
   private long Z52Tran_IdCuentadanteDestino ;
   private long Z56Tran_IdCuentadanteResponsabili ;
   private long Z54Tran_TipoIngreso ;
   private long N47Tran_UsuarioId ;
   private long N48Tran_CentroCostoId ;
   private long N51Tran_IdCuentadanteOrigen ;
   private long N53Tran_IdProveedor ;
   private long N52Tran_IdCuentadanteDestino ;
   private long N54Tran_TipoIngreso ;
   private long N50Tran_CentroCostoIdDestino ;
   private long N56Tran_IdCuentadanteResponsabili ;
   private long A48Tran_CentroCostoId ;
   private long A47Tran_UsuarioId ;
   private long A57Tran_RegionId ;
   private long A499Tran_CodTipoElemento ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A53Tran_IdProveedor ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A54Tran_TipoIngreso ;
   private long A50Tran_CentroCostoIdDestino ;
   private long A518Tran_RegionIdDestino ;
   private long A56Tran_IdCuentadanteResponsabili ;
   private long AV33Tran_Id ;
   private long A46Tran_Id ;
   private long A702Tran_CedulaCuentadanteOrigen ;
   private long A703Tran_CedulaProveedor ;
   private long A704Tran_CedulaCuentadanteDestino ;
   private long A498Tran_NumeroLineas ;
   private long A513Tran_ConsecutivoCC ;
   private long A759Tran_CedulaResponsabilidad ;
   private long A719Tran_TransaccResponsabilidad ;
   private long AV26Insert_Tran_UsuarioId ;
   private long AV15IdUsuario ;
   private long AV19Insert_Tran_CentroCostoId ;
   private long AV24Insert_Tran_IdCuentadanteOrigen ;
   private long AV25Insert_Tran_IdProveedor ;
   private long AV23Insert_Tran_IdCuentadanteDestino ;
   private long AV44Insert_Tran_TipoIngreso ;
   private long AV20Insert_Tran_CentroCostoIdDestino ;
   private long AV45Insert_Tran_IdCuentadanteResponsabilidad ;
   private long GRIDALM_TRANSACCION_DOCUMENTOS_nFirstRecordOnPage ;
   private long Z57Tran_RegionId ;
   private long Z518Tran_RegionIdDestino ;
   private long Z499Tran_CodTipoElemento ;
   private long Z702Tran_CedulaCuentadanteOrigen ;
   private long Z703Tran_CedulaProveedor ;
   private long Z704Tran_CedulaCuentadanteDestino ;
   private long Z759Tran_CedulaResponsabilidad ;
   private long GXv_int1[] ;
   private java.math.BigDecimal Z483Tran_ValorTransaccion ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private String sPrefix ;
   private String sGXsfl_334_idx="0001" ;
   private String wcpOGx_mode ;
   private String Z58Tran_Estado ;
   private String Z514Tran_NumeroIngreso ;
   private String Z524Tran_Detalle ;
   private String Z527Tran_TipoEntra ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A482Tran_TipoElemento ;
   private String A58Tran_Estado ;
   private String A527Tran_TipoEntra ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTran_UsuarioId_Internalname ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtTran_Id_Internalname ;
   private String edtTran_Id_Jsonclick ;
   private String edtTran_FechaRegistro_Internalname ;
   private String edtTran_FechaRegistro_Jsonclick ;
   private String edtTran_UsuarioId_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_47_Internalname ;
   private String imgprompt_47_Link ;
   private String edtTran_UsuarioCodigo_Internalname ;
   private String edtTran_UsuarioCodigo_Jsonclick ;
   private String edtTran_UsuarioNombre_Internalname ;
   private String edtTran_UsuarioNombre_Jsonclick ;
   private String edtTran_CentroCostoId_Internalname ;
   private String edtTran_CentroCostoId_Jsonclick ;
   private String imgprompt_48_Internalname ;
   private String imgprompt_48_Link ;
   private String edtTran_CentroCostoCodigo_Internalname ;
   private String edtTran_CentroCostoCodigo_Jsonclick ;
   private String edtTran_CentroCostoDescripcion_Internalname ;
   private String edtTran_CentroCostoDescripcion_Jsonclick ;
   private String edtTran_RegionId_Internalname ;
   private String edtTran_RegionId_Jsonclick ;
   private String edtTran_RegionCodigo_Internalname ;
   private String edtTran_RegionCodigo_Jsonclick ;
   private String edtTran_RegionDescripcion_Internalname ;
   private String edtTran_RegionDescripcion_Jsonclick ;
   private String edtTran_RegionAbrev_Internalname ;
   private String edtTran_RegionAbrev_Jsonclick ;
   private String edtTran_CodigoMovimiento_Internalname ;
   private String edtTran_CodigoMovimiento_Jsonclick ;
   private String imgprompt_49_Internalname ;
   private String imgprompt_49_Link ;
   private String edtTran_DescripcionMovimiento_Internalname ;
   private String edtTran_DescripcionMovimiento_Jsonclick ;
   private String edtTran_CodTipoElemento_Internalname ;
   private String edtTran_CodTipoElemento_Jsonclick ;
   private String edtTran_ModuloOrigen_Internalname ;
   private String edtTran_ModuloOrigen_Jsonclick ;
   private String edtTran_CodAlmaOrigen_Internalname ;
   private String edtTran_CodAlmaOrigen_Jsonclick ;
   private String edtTran_CodBodeOrigen_Internalname ;
   private String edtTran_CodBodeOrigen_Jsonclick ;
   private String edtTran_IdCuentadanteOrigen_Internalname ;
   private String edtTran_IdCuentadanteOrigen_Jsonclick ;
   private String imgprompt_51_Internalname ;
   private String imgprompt_51_Link ;
   private String edtTran_NombCuentadanteOrigen_Internalname ;
   private String edtTran_NombCuentadanteOrigen_Jsonclick ;
   private String edtTran_CedulaCuentadanteOrigen_Internalname ;
   private String edtTran_CedulaCuentadanteOrigen_Jsonclick ;
   private String edtTran_EmailCuentadanteOrigen_Internalname ;
   private String edtTran_EmailCuentadanteOrigen_Jsonclick ;
   private String edtTran_IdProveedor_Internalname ;
   private String edtTran_IdProveedor_Jsonclick ;
   private String imgprompt_53_Internalname ;
   private String imgprompt_53_Link ;
   private String edtTran_NombreProveedor_Internalname ;
   private String edtTran_NombreProveedor_Jsonclick ;
   private String edtTran_CedulaProveedor_Internalname ;
   private String edtTran_CedulaProveedor_Jsonclick ;
   private String edtTran_ModuloDestino_Internalname ;
   private String edtTran_ModuloDestino_Jsonclick ;
   private String edtTran_CodAlmaDestino_Internalname ;
   private String edtTran_CodAlmaDestino_Jsonclick ;
   private String edtTran_CodBodeDestino_Internalname ;
   private String edtTran_CodBodeDestino_Jsonclick ;
   private String edtTran_IdCuentadanteDestino_Internalname ;
   private String edtTran_IdCuentadanteDestino_Jsonclick ;
   private String imgprompt_52_Internalname ;
   private String imgprompt_52_Link ;
   private String edtTran_NombCuentadanteDestino_Internalname ;
   private String edtTran_NombCuentadanteDestino_Jsonclick ;
   private String edtTran_CedulaCuentadanteDestino_Internalname ;
   private String edtTran_CedulaCuentadanteDestino_Jsonclick ;
   private String edtTran_EmailCuentadanteDestino_Internalname ;
   private String edtTran_EmailCuentadanteDestino_Jsonclick ;
   private String edtTran_Observaciones_Internalname ;
   private String edtTran_AreadanteCodigo_Internalname ;
   private String edtTran_AreadanteCodigo_Jsonclick ;
   private String edtTran_CursoCodigo_Internalname ;
   private String edtTran_CursoCodigo_Jsonclick ;
   private String edtTran_ValorTransaccion_Internalname ;
   private String edtTran_ValorTransaccion_Jsonclick ;
   private String edtTran_NumeroLineas_Internalname ;
   private String edtTran_NumeroLineas_Jsonclick ;
   private String edtTran_FechaRatificacion_Internalname ;
   private String edtTran_FechaRatificacion_Jsonclick ;
   private String edtTran_UsuarioRatifica_Internalname ;
   private String edtTran_UsuarioRatifica_Jsonclick ;
   private String edtTran_ConsecutivoCC_Internalname ;
   private String edtTran_ConsecutivoCC_Jsonclick ;
   private String edtTran_NombreIngreso_Internalname ;
   private String edtTran_NombreIngreso_Jsonclick ;
   private String edtTran_Abreviado_Internalname ;
   private String edtTran_Abreviado_Jsonclick ;
   private String edtTran_NumeroIngreso_Internalname ;
   private String A514Tran_NumeroIngreso ;
   private String edtTran_NumeroIngreso_Jsonclick ;
   private String edtTran_FechaIngreso_Internalname ;
   private String edtTran_FechaIngreso_Jsonclick ;
   private String edtTran_CentroCostoIdDestino_Internalname ;
   private String edtTran_CentroCostoIdDestino_Jsonclick ;
   private String imgprompt_50_Internalname ;
   private String imgprompt_50_Link ;
   private String edtTran_CentroCostoCodigoDestino_Internalname ;
   private String edtTran_CentroCostoCodigoDestino_Jsonclick ;
   private String edtTran_CentroCostoDescripcionDes_Internalname ;
   private String edtTran_CentroCostoDescripcionDes_Jsonclick ;
   private String edtTran_RegionIdDestino_Internalname ;
   private String edtTran_RegionIdDestino_Jsonclick ;
   private String edtTran_RegionCodigoDestino_Internalname ;
   private String edtTran_RegionCodigoDestino_Jsonclick ;
   private String edtTran_RegionDescripcionDestino_Internalname ;
   private String edtTran_RegionDescripcionDestino_Jsonclick ;
   private String edtTran_RegionAbrevDestino_Internalname ;
   private String edtTran_RegionAbrevDestino_Jsonclick ;
   private String edtTran_Detalle_Internalname ;
   private String A524Tran_Detalle ;
   private String edtTran_Detalle_Jsonclick ;
   private String edtTran_CantidadPadres_Internalname ;
   private String edtTran_CantidadPadres_Jsonclick ;
   private String edtTran_NumeroGrupo_Internalname ;
   private String edtTran_NumeroGrupo_Jsonclick ;
   private String edtTran_UsuarioEliminaoAnula_Internalname ;
   private String edtTran_UsuarioEliminaoAnula_Jsonclick ;
   private String edtTran_FechaEliminaoAnula_Internalname ;
   private String edtTran_FechaEliminaoAnula_Jsonclick ;
   private String edtTran_ObservacionesAnula_Internalname ;
   private String edtTran_IdCuentadanteResponsabili_Internalname ;
   private String edtTran_IdCuentadanteResponsabili_Jsonclick ;
   private String imgprompt_56_Internalname ;
   private String imgprompt_56_Link ;
   private String edtTran_CedulaResponsabilidad_Internalname ;
   private String edtTran_CedulaResponsabilidad_Jsonclick ;
   private String edtTran_NombreCuentadanteResponsa_Internalname ;
   private String edtTran_NombreCuentadanteResponsa_Jsonclick ;
   private String edtTran_TransaccResponsabilidad_Internalname ;
   private String edtTran_TransaccResponsabilidad_Jsonclick ;
   private String edtTran_FechaResponsabilidad_Internalname ;
   private String edtTran_FechaResponsabilidad_Jsonclick ;
   private String edtTran_TablaResponsabilidad_Internalname ;
   private String edtTran_TablaResponsabilidad_Jsonclick ;
   private String divDocumentostable_Internalname ;
   private String lblTitledocumentos_Internalname ;
   private String lblTitledocumentos_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode61 ;
   private String edtTran_Nro_Documento_Internalname ;
   private String edtTran_Descrip_Documento_Internalname ;
   private String edtTran_Prefijo_Documento_Internalname ;
   private String edtTran_Archivo_Internalname ;
   private String edtTran_Ruta_Archivo_Internalname ;
   private String sStyleString ;
   private String AV47Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode7 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String GXv_char2[] ;
   private String AV14ExisteCuentadanteDestino ;
   private String Z482Tran_TipoElemento ;
   private String imgprompt_827_Internalname ;
   private String sGXsfl_334_fel_idx="0001" ;
   private String subGridalm_transaccion_documentos_Class ;
   private String subGridalm_transaccion_documentos_Linesclass ;
   private String imgprompt_827_Link ;
   private String ROClassString ;
   private String edtTran_Nro_Documento_Jsonclick ;
   private String edtTran_Descrip_Documento_Jsonclick ;
   private String edtTran_Prefijo_Documento_Jsonclick ;
   private String edtTran_Archivo_Filetype ;
   private String edtTran_Archivo_Contenttype ;
   private String edtTran_Archivo_Parameters ;
   private String edtTran_Archivo_Jsonclick ;
   private String edtTran_Ruta_Archivo_Jsonclick ;
   private String GXCCtlgxBlob ;
   private String edtTran_Archivo_Filename ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridalm_transaccion_documentos_Internalname ;
   private String GXt_char5 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date Z55Tran_FechaRegistro ;
   private java.util.Date Z390Tran_FechaRatificacion ;
   private java.util.Date Z669Tran_FechaEliminaoAnula ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date A669Tran_FechaEliminaoAnula ;
   private java.util.Date i55Tran_FechaRegistro ;
   private java.util.Date Z515Tran_FechaIngreso ;
   private java.util.Date Z720Tran_FechaResponsabilidad ;
   private java.util.Date A515Tran_FechaIngreso ;
   private java.util.Date A720Tran_FechaResponsabilidad ;
   private boolean entryPointCalled ;
   private boolean n47Tran_UsuarioId ;
   private boolean n57Tran_RegionId ;
   private boolean n499Tran_CodTipoElemento ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n53Tran_IdProveedor ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n54Tran_TipoIngreso ;
   private boolean n50Tran_CentroCostoIdDestino ;
   private boolean n518Tran_RegionIdDestino ;
   private boolean n56Tran_IdCuentadanteResponsabili ;
   private boolean toggleJsOutput ;
   private boolean n478Tran_IndAreadante ;
   private boolean n481Tran_IndE_S ;
   private boolean n479Tran_IndCurso ;
   private boolean n482Tran_TipoElemento ;
   private boolean n707Tran_SolicitaCCDestino ;
   private boolean n708Tran_SolicitaRegionDestino ;
   private boolean n754Tran_CuentaResponsabilidad ;
   private boolean n58Tran_Estado ;
   private boolean n527Tran_TipoEntra ;
   private boolean n859Tran_EntidadGobierno ;
   private boolean wbErr ;
   private boolean bGXsfl_334_Refreshing=false ;
   private boolean n417Tran_UsuarioCodigo ;
   private boolean n418Tran_UsuarioNombre ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n420Tran_CentroCostoDescripcion ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n422Tran_RegionDescripcion ;
   private boolean n594Tran_RegionAbrev ;
   private boolean n381Tran_DescripcionMovimiento ;
   private boolean n384Tran_NombCuentadanteOrigen ;
   private boolean n702Tran_CedulaCuentadanteOrigen ;
   private boolean n714Tran_EmailCuentadanteOrigen ;
   private boolean n575Tran_NombreProveedor ;
   private boolean n703Tran_CedulaProveedor ;
   private boolean n389Tran_NombCuentadanteDestino ;
   private boolean n704Tran_CedulaCuentadanteDestino ;
   private boolean n715Tran_EmailCuentadanteDestino ;
   private boolean n416Tran_Observaciones ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n408Tran_CursoCodigo ;
   private boolean n483Tran_ValorTransaccion ;
   private boolean n498Tran_NumeroLineas ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n391Tran_UsuarioRatifica ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n672Tran_NombreIngreso ;
   private boolean n756Tran_Abreviado ;
   private boolean n514Tran_NumeroIngreso ;
   private boolean n515Tran_FechaIngreso ;
   private boolean n516Tran_CentroCostoCodigoDestino ;
   private boolean n517Tran_CentroCostoDescripcionDes ;
   private boolean n519Tran_RegionCodigoDestino ;
   private boolean n520Tran_RegionDescripcionDestino ;
   private boolean n608Tran_RegionAbrevDestino ;
   private boolean n524Tran_Detalle ;
   private boolean n568Tran_CantidadPadres ;
   private boolean n667Tran_NumeroGrupo ;
   private boolean n668Tran_UsuarioEliminaoAnula ;
   private boolean n669Tran_FechaEliminaoAnula ;
   private boolean n670Tran_ObservacionesAnula ;
   private boolean n759Tran_CedulaResponsabilidad ;
   private boolean n721Tran_NombreCuentadanteResponsa ;
   private boolean n719Tran_TransaccResponsabilidad ;
   private boolean n720Tran_FechaResponsabilidad ;
   private boolean n758Tran_TablaResponsabilidad ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n828Tran_Descrip_Documento ;
   private boolean n829Tran_Prefijo_Documento ;
   private boolean n830Tran_Archivo ;
   private boolean n831Tran_Ruta_Archivo ;
   private String A416Tran_Observaciones ;
   private String Z416Tran_Observaciones ;
   private String A830Tran_Archivo ;
   private String Z830Tran_Archivo ;
   private String Z110Tran_ModuloOrigen ;
   private String Z109Tran_CodAlmaOrigen ;
   private String Z112Tran_CodBodeOrigen ;
   private String Z385Tran_ModuloDestino ;
   private String Z111Tran_CodAlmaDestino ;
   private String Z387Tran_CodBodeDestino ;
   private String Z407Tran_AreadanteCodigo ;
   private String Z408Tran_CursoCodigo ;
   private String Z391Tran_UsuarioRatifica ;
   private String Z668Tran_UsuarioEliminaoAnula ;
   private String Z670Tran_ObservacionesAnula ;
   private String Z859Tran_EntidadGobierno ;
   private String Z49Tran_CodigoMovimiento ;
   private String N49Tran_CodigoMovimiento ;
   private String Z831Tran_Ruta_Archivo ;
   private String A49Tran_CodigoMovimiento ;
   private String A478Tran_IndAreadante ;
   private String A481Tran_IndE_S ;
   private String A479Tran_IndCurso ;
   private String A707Tran_SolicitaCCDestino ;
   private String A708Tran_SolicitaRegionDestino ;
   private String A754Tran_CuentaResponsabilidad ;
   private String A859Tran_EntidadGobierno ;
   private String A417Tran_UsuarioCodigo ;
   private String A418Tran_UsuarioNombre ;
   private String A419Tran_CentroCostoCodigo ;
   private String A420Tran_CentroCostoDescripcion ;
   private String A422Tran_RegionDescripcion ;
   private String A594Tran_RegionAbrev ;
   private String A381Tran_DescripcionMovimiento ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A384Tran_NombCuentadanteOrigen ;
   private String A714Tran_EmailCuentadanteOrigen ;
   private String A575Tran_NombreProveedor ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A389Tran_NombCuentadanteDestino ;
   private String A715Tran_EmailCuentadanteDestino ;
   private String A407Tran_AreadanteCodigo ;
   private String A408Tran_CursoCodigo ;
   private String A391Tran_UsuarioRatifica ;
   private String A672Tran_NombreIngreso ;
   private String A756Tran_Abreviado ;
   private String A516Tran_CentroCostoCodigoDestino ;
   private String A517Tran_CentroCostoDescripcionDes ;
   private String A520Tran_RegionDescripcionDestino ;
   private String A608Tran_RegionAbrevDestino ;
   private String A668Tran_UsuarioEliminaoAnula ;
   private String A670Tran_ObservacionesAnula ;
   private String A721Tran_NombreCuentadanteResponsa ;
   private String A828Tran_Descrip_Documento ;
   private String A829Tran_Prefijo_Documento ;
   private String A831Tran_Ruta_Archivo ;
   private String AV7Tran_CodigoMovimiento ;
   private String AV21Insert_Tran_CodigoMovimiento ;
   private String AV11ConsecutivoCC ;
   private String AV39Usuario ;
   private String AV42Pattern ;
   private String Z481Tran_IndE_S ;
   private String Z417Tran_UsuarioCodigo ;
   private String Z418Tran_UsuarioNombre ;
   private String Z419Tran_CentroCostoCodigo ;
   private String Z420Tran_CentroCostoDescripcion ;
   private String Z422Tran_RegionDescripcion ;
   private String Z594Tran_RegionAbrev ;
   private String Z381Tran_DescripcionMovimiento ;
   private String Z478Tran_IndAreadante ;
   private String Z479Tran_IndCurso ;
   private String Z707Tran_SolicitaCCDestino ;
   private String Z708Tran_SolicitaRegionDestino ;
   private String Z754Tran_CuentaResponsabilidad ;
   private String Z384Tran_NombCuentadanteOrigen ;
   private String Z714Tran_EmailCuentadanteOrigen ;
   private String Z575Tran_NombreProveedor ;
   private String Z389Tran_NombCuentadanteDestino ;
   private String Z715Tran_EmailCuentadanteDestino ;
   private String Z672Tran_NombreIngreso ;
   private String Z756Tran_Abreviado ;
   private String Z516Tran_CentroCostoCodigoDestino ;
   private String Z517Tran_CentroCostoDescripcionDes ;
   private String Z520Tran_RegionDescripcionDestino ;
   private String Z608Tran_RegionAbrevDestino ;
   private String Z721Tran_NombreCuentadanteResponsa ;
   private String Z828Tran_Descrip_Documento ;
   private String Z829Tran_Prefijo_Documento ;
   private com.genexus.webpanels.GXWebGrid Gridalm_transaccion_documentosContainer ;
   private com.genexus.webpanels.GXWebRow Gridalm_transaccion_documentosRow ;
   private com.genexus.webpanels.GXWebColumn Gridalm_transaccion_documentosColumn ;
   private com.genexus.webpanels.WebSession AV40WebSession ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbTran_IndAreadante ;
   private HTMLChoice cmbTran_IndE_S ;
   private HTMLChoice cmbTran_IndCurso ;
   private HTMLChoice cmbTran_TipoElemento ;
   private HTMLChoice cmbTran_SolicitaCCDestino ;
   private HTMLChoice cmbTran_SolicitaRegionDestino ;
   private HTMLChoice cmbTran_CuentaResponsabilidad ;
   private HTMLChoice cmbTran_Estado ;
   private HTMLChoice cmbTran_TipoIngreso ;
   private HTMLChoice cmbTran_TipoEntra ;
   private HTMLChoice cmbTran_EntidadGobierno ;
   private IDataStoreProvider pr_default ;
   private long[] T000516_A759Tran_CedulaResponsabilidad ;
   private boolean[] T000516_n759Tran_CedulaResponsabilidad ;
   private String[] T000516_A721Tran_NombreCuentadanteResponsa ;
   private boolean[] T000516_n721Tran_NombreCuentadanteResponsa ;
   private String[] T00059_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] T00059_n516Tran_CentroCostoCodigoDestino ;
   private String[] T00059_A517Tran_CentroCostoDescripcionDes ;
   private boolean[] T00059_n517Tran_CentroCostoDescripcionDes ;
   private long[] T00059_A518Tran_RegionIdDestino ;
   private boolean[] T00059_n518Tran_RegionIdDestino ;
   private short[] T000511_A519Tran_RegionCodigoDestino ;
   private boolean[] T000511_n519Tran_RegionCodigoDestino ;
   private String[] T000511_A520Tran_RegionDescripcionDestino ;
   private boolean[] T000511_n520Tran_RegionDescripcionDestino ;
   private String[] T000511_A608Tran_RegionAbrevDestino ;
   private boolean[] T000511_n608Tran_RegionAbrevDestino ;
   private String[] T000517_A672Tran_NombreIngreso ;
   private boolean[] T000517_n672Tran_NombreIngreso ;
   private String[] T000517_A756Tran_Abreviado ;
   private boolean[] T000517_n756Tran_Abreviado ;
   private String[] T000515_A389Tran_NombCuentadanteDestino ;
   private boolean[] T000515_n389Tran_NombCuentadanteDestino ;
   private long[] T000515_A704Tran_CedulaCuentadanteDestino ;
   private boolean[] T000515_n704Tran_CedulaCuentadanteDestino ;
   private String[] T000515_A715Tran_EmailCuentadanteDestino ;
   private boolean[] T000515_n715Tran_EmailCuentadanteDestino ;
   private String[] T000514_A575Tran_NombreProveedor ;
   private boolean[] T000514_n575Tran_NombreProveedor ;
   private long[] T000514_A703Tran_CedulaProveedor ;
   private boolean[] T000514_n703Tran_CedulaProveedor ;
   private String[] T000513_A384Tran_NombCuentadanteOrigen ;
   private boolean[] T000513_n384Tran_NombCuentadanteOrigen ;
   private long[] T000513_A702Tran_CedulaCuentadanteOrigen ;
   private boolean[] T000513_n702Tran_CedulaCuentadanteOrigen ;
   private String[] T000513_A714Tran_EmailCuentadanteOrigen ;
   private boolean[] T000513_n714Tran_EmailCuentadanteOrigen ;
   private String[] T000512_A381Tran_DescripcionMovimiento ;
   private boolean[] T000512_n381Tran_DescripcionMovimiento ;
   private String[] T000512_A478Tran_IndAreadante ;
   private boolean[] T000512_n478Tran_IndAreadante ;
   private String[] T000512_A481Tran_IndE_S ;
   private boolean[] T000512_n481Tran_IndE_S ;
   private String[] T000512_A479Tran_IndCurso ;
   private boolean[] T000512_n479Tran_IndCurso ;
   private String[] T000512_A707Tran_SolicitaCCDestino ;
   private boolean[] T000512_n707Tran_SolicitaCCDestino ;
   private String[] T000512_A708Tran_SolicitaRegionDestino ;
   private boolean[] T000512_n708Tran_SolicitaRegionDestino ;
   private String[] T000512_A754Tran_CuentaResponsabilidad ;
   private boolean[] T000512_n754Tran_CuentaResponsabilidad ;
   private long[] T000512_A499Tran_CodTipoElemento ;
   private boolean[] T000512_n499Tran_CodTipoElemento ;
   private String[] T000518_A482Tran_TipoElemento ;
   private boolean[] T000518_n482Tran_TipoElemento ;
   private String[] T00058_A419Tran_CentroCostoCodigo ;
   private boolean[] T00058_n419Tran_CentroCostoCodigo ;
   private String[] T00058_A420Tran_CentroCostoDescripcion ;
   private boolean[] T00058_n420Tran_CentroCostoDescripcion ;
   private long[] T00058_A57Tran_RegionId ;
   private boolean[] T00058_n57Tran_RegionId ;
   private short[] T000510_A421Tran_RegionCodigo ;
   private boolean[] T000510_n421Tran_RegionCodigo ;
   private String[] T000510_A422Tran_RegionDescripcion ;
   private boolean[] T000510_n422Tran_RegionDescripcion ;
   private String[] T000510_A594Tran_RegionAbrev ;
   private boolean[] T000510_n594Tran_RegionAbrev ;
   private String[] T00057_A417Tran_UsuarioCodigo ;
   private boolean[] T00057_n417Tran_UsuarioCodigo ;
   private String[] T00057_A418Tran_UsuarioNombre ;
   private boolean[] T00057_n418Tran_UsuarioNombre ;
   private String[] T000519_A416Tran_Observaciones ;
   private boolean[] T000519_n416Tran_Observaciones ;
   private long[] T000519_A46Tran_Id ;
   private java.util.Date[] T000519_A55Tran_FechaRegistro ;
   private String[] T000519_A58Tran_Estado ;
   private boolean[] T000519_n58Tran_Estado ;
   private String[] T000519_A417Tran_UsuarioCodigo ;
   private boolean[] T000519_n417Tran_UsuarioCodigo ;
   private String[] T000519_A418Tran_UsuarioNombre ;
   private boolean[] T000519_n418Tran_UsuarioNombre ;
   private String[] T000519_A419Tran_CentroCostoCodigo ;
   private boolean[] T000519_n419Tran_CentroCostoCodigo ;
   private String[] T000519_A420Tran_CentroCostoDescripcion ;
   private boolean[] T000519_n420Tran_CentroCostoDescripcion ;
   private long[] T000519_A57Tran_RegionId ;
   private boolean[] T000519_n57Tran_RegionId ;
   private short[] T000519_A421Tran_RegionCodigo ;
   private boolean[] T000519_n421Tran_RegionCodigo ;
   private String[] T000519_A422Tran_RegionDescripcion ;
   private boolean[] T000519_n422Tran_RegionDescripcion ;
   private String[] T000519_A594Tran_RegionAbrev ;
   private boolean[] T000519_n594Tran_RegionAbrev ;
   private String[] T000519_A381Tran_DescripcionMovimiento ;
   private boolean[] T000519_n381Tran_DescripcionMovimiento ;
   private String[] T000519_A478Tran_IndAreadante ;
   private boolean[] T000519_n478Tran_IndAreadante ;
   private String[] T000519_A481Tran_IndE_S ;
   private boolean[] T000519_n481Tran_IndE_S ;
   private String[] T000519_A479Tran_IndCurso ;
   private boolean[] T000519_n479Tran_IndCurso ;
   private String[] T000519_A482Tran_TipoElemento ;
   private boolean[] T000519_n482Tran_TipoElemento ;
   private String[] T000519_A707Tran_SolicitaCCDestino ;
   private boolean[] T000519_n707Tran_SolicitaCCDestino ;
   private String[] T000519_A708Tran_SolicitaRegionDestino ;
   private boolean[] T000519_n708Tran_SolicitaRegionDestino ;
   private String[] T000519_A754Tran_CuentaResponsabilidad ;
   private boolean[] T000519_n754Tran_CuentaResponsabilidad ;
   private String[] T000519_A110Tran_ModuloOrigen ;
   private String[] T000519_A109Tran_CodAlmaOrigen ;
   private String[] T000519_A112Tran_CodBodeOrigen ;
   private String[] T000519_A384Tran_NombCuentadanteOrigen ;
   private boolean[] T000519_n384Tran_NombCuentadanteOrigen ;
   private long[] T000519_A702Tran_CedulaCuentadanteOrigen ;
   private boolean[] T000519_n702Tran_CedulaCuentadanteOrigen ;
   private String[] T000519_A714Tran_EmailCuentadanteOrigen ;
   private boolean[] T000519_n714Tran_EmailCuentadanteOrigen ;
   private String[] T000519_A575Tran_NombreProveedor ;
   private boolean[] T000519_n575Tran_NombreProveedor ;
   private long[] T000519_A703Tran_CedulaProveedor ;
   private boolean[] T000519_n703Tran_CedulaProveedor ;
   private String[] T000519_A385Tran_ModuloDestino ;
   private String[] T000519_A111Tran_CodAlmaDestino ;
   private String[] T000519_A387Tran_CodBodeDestino ;
   private String[] T000519_A389Tran_NombCuentadanteDestino ;
   private boolean[] T000519_n389Tran_NombCuentadanteDestino ;
   private long[] T000519_A704Tran_CedulaCuentadanteDestino ;
   private boolean[] T000519_n704Tran_CedulaCuentadanteDestino ;
   private String[] T000519_A715Tran_EmailCuentadanteDestino ;
   private boolean[] T000519_n715Tran_EmailCuentadanteDestino ;
   private String[] T000519_A407Tran_AreadanteCodigo ;
   private boolean[] T000519_n407Tran_AreadanteCodigo ;
   private String[] T000519_A408Tran_CursoCodigo ;
   private boolean[] T000519_n408Tran_CursoCodigo ;
   private java.math.BigDecimal[] T000519_A483Tran_ValorTransaccion ;
   private boolean[] T000519_n483Tran_ValorTransaccion ;
   private long[] T000519_A498Tran_NumeroLineas ;
   private boolean[] T000519_n498Tran_NumeroLineas ;
   private java.util.Date[] T000519_A390Tran_FechaRatificacion ;
   private boolean[] T000519_n390Tran_FechaRatificacion ;
   private String[] T000519_A391Tran_UsuarioRatifica ;
   private boolean[] T000519_n391Tran_UsuarioRatifica ;
   private long[] T000519_A513Tran_ConsecutivoCC ;
   private boolean[] T000519_n513Tran_ConsecutivoCC ;
   private String[] T000519_A672Tran_NombreIngreso ;
   private boolean[] T000519_n672Tran_NombreIngreso ;
   private String[] T000519_A756Tran_Abreviado ;
   private boolean[] T000519_n756Tran_Abreviado ;
   private String[] T000519_A514Tran_NumeroIngreso ;
   private boolean[] T000519_n514Tran_NumeroIngreso ;
   private java.util.Date[] T000519_A515Tran_FechaIngreso ;
   private boolean[] T000519_n515Tran_FechaIngreso ;
   private String[] T000519_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] T000519_n516Tran_CentroCostoCodigoDestino ;
   private String[] T000519_A517Tran_CentroCostoDescripcionDes ;
   private boolean[] T000519_n517Tran_CentroCostoDescripcionDes ;
   private long[] T000519_A518Tran_RegionIdDestino ;
   private boolean[] T000519_n518Tran_RegionIdDestino ;
   private short[] T000519_A519Tran_RegionCodigoDestino ;
   private boolean[] T000519_n519Tran_RegionCodigoDestino ;
   private String[] T000519_A520Tran_RegionDescripcionDestino ;
   private boolean[] T000519_n520Tran_RegionDescripcionDestino ;
   private String[] T000519_A608Tran_RegionAbrevDestino ;
   private boolean[] T000519_n608Tran_RegionAbrevDestino ;
   private String[] T000519_A524Tran_Detalle ;
   private boolean[] T000519_n524Tran_Detalle ;
   private String[] T000519_A527Tran_TipoEntra ;
   private boolean[] T000519_n527Tran_TipoEntra ;
   private int[] T000519_A568Tran_CantidadPadres ;
   private boolean[] T000519_n568Tran_CantidadPadres ;
   private short[] T000519_A667Tran_NumeroGrupo ;
   private boolean[] T000519_n667Tran_NumeroGrupo ;
   private String[] T000519_A668Tran_UsuarioEliminaoAnula ;
   private boolean[] T000519_n668Tran_UsuarioEliminaoAnula ;
   private java.util.Date[] T000519_A669Tran_FechaEliminaoAnula ;
   private boolean[] T000519_n669Tran_FechaEliminaoAnula ;
   private String[] T000519_A670Tran_ObservacionesAnula ;
   private boolean[] T000519_n670Tran_ObservacionesAnula ;
   private long[] T000519_A759Tran_CedulaResponsabilidad ;
   private boolean[] T000519_n759Tran_CedulaResponsabilidad ;
   private String[] T000519_A721Tran_NombreCuentadanteResponsa ;
   private boolean[] T000519_n721Tran_NombreCuentadanteResponsa ;
   private long[] T000519_A719Tran_TransaccResponsabilidad ;
   private boolean[] T000519_n719Tran_TransaccResponsabilidad ;
   private java.util.Date[] T000519_A720Tran_FechaResponsabilidad ;
   private boolean[] T000519_n720Tran_FechaResponsabilidad ;
   private short[] T000519_A758Tran_TablaResponsabilidad ;
   private boolean[] T000519_n758Tran_TablaResponsabilidad ;
   private String[] T000519_A859Tran_EntidadGobierno ;
   private boolean[] T000519_n859Tran_EntidadGobierno ;
   private long[] T000519_A47Tran_UsuarioId ;
   private boolean[] T000519_n47Tran_UsuarioId ;
   private long[] T000519_A48Tran_CentroCostoId ;
   private long[] T000519_A50Tran_CentroCostoIdDestino ;
   private boolean[] T000519_n50Tran_CentroCostoIdDestino ;
   private String[] T000519_A49Tran_CodigoMovimiento ;
   private long[] T000519_A51Tran_IdCuentadanteOrigen ;
   private boolean[] T000519_n51Tran_IdCuentadanteOrigen ;
   private long[] T000519_A53Tran_IdProveedor ;
   private boolean[] T000519_n53Tran_IdProveedor ;
   private long[] T000519_A52Tran_IdCuentadanteDestino ;
   private boolean[] T000519_n52Tran_IdCuentadanteDestino ;
   private long[] T000519_A56Tran_IdCuentadanteResponsabili ;
   private boolean[] T000519_n56Tran_IdCuentadanteResponsabili ;
   private long[] T000519_A54Tran_TipoIngreso ;
   private boolean[] T000519_n54Tran_TipoIngreso ;
   private long[] T000519_A499Tran_CodTipoElemento ;
   private boolean[] T000519_n499Tran_CodTipoElemento ;
   private String[] T000520_A417Tran_UsuarioCodigo ;
   private boolean[] T000520_n417Tran_UsuarioCodigo ;
   private String[] T000520_A418Tran_UsuarioNombre ;
   private boolean[] T000520_n418Tran_UsuarioNombre ;
   private String[] T000521_A419Tran_CentroCostoCodigo ;
   private boolean[] T000521_n419Tran_CentroCostoCodigo ;
   private String[] T000521_A420Tran_CentroCostoDescripcion ;
   private boolean[] T000521_n420Tran_CentroCostoDescripcion ;
   private long[] T000521_A57Tran_RegionId ;
   private boolean[] T000521_n57Tran_RegionId ;
   private short[] T000522_A421Tran_RegionCodigo ;
   private boolean[] T000522_n421Tran_RegionCodigo ;
   private String[] T000522_A422Tran_RegionDescripcion ;
   private boolean[] T000522_n422Tran_RegionDescripcion ;
   private String[] T000522_A594Tran_RegionAbrev ;
   private boolean[] T000522_n594Tran_RegionAbrev ;
   private String[] T000523_A381Tran_DescripcionMovimiento ;
   private boolean[] T000523_n381Tran_DescripcionMovimiento ;
   private String[] T000523_A478Tran_IndAreadante ;
   private boolean[] T000523_n478Tran_IndAreadante ;
   private String[] T000523_A481Tran_IndE_S ;
   private boolean[] T000523_n481Tran_IndE_S ;
   private String[] T000523_A479Tran_IndCurso ;
   private boolean[] T000523_n479Tran_IndCurso ;
   private String[] T000523_A707Tran_SolicitaCCDestino ;
   private boolean[] T000523_n707Tran_SolicitaCCDestino ;
   private String[] T000523_A708Tran_SolicitaRegionDestino ;
   private boolean[] T000523_n708Tran_SolicitaRegionDestino ;
   private String[] T000523_A754Tran_CuentaResponsabilidad ;
   private boolean[] T000523_n754Tran_CuentaResponsabilidad ;
   private long[] T000523_A499Tran_CodTipoElemento ;
   private boolean[] T000523_n499Tran_CodTipoElemento ;
   private String[] T000524_A482Tran_TipoElemento ;
   private boolean[] T000524_n482Tran_TipoElemento ;
   private String[] T000525_A384Tran_NombCuentadanteOrigen ;
   private boolean[] T000525_n384Tran_NombCuentadanteOrigen ;
   private long[] T000525_A702Tran_CedulaCuentadanteOrigen ;
   private boolean[] T000525_n702Tran_CedulaCuentadanteOrigen ;
   private String[] T000525_A714Tran_EmailCuentadanteOrigen ;
   private boolean[] T000525_n714Tran_EmailCuentadanteOrigen ;
   private String[] T000526_A575Tran_NombreProveedor ;
   private boolean[] T000526_n575Tran_NombreProveedor ;
   private long[] T000526_A703Tran_CedulaProveedor ;
   private boolean[] T000526_n703Tran_CedulaProveedor ;
   private String[] T000527_A389Tran_NombCuentadanteDestino ;
   private boolean[] T000527_n389Tran_NombCuentadanteDestino ;
   private long[] T000527_A704Tran_CedulaCuentadanteDestino ;
   private boolean[] T000527_n704Tran_CedulaCuentadanteDestino ;
   private String[] T000527_A715Tran_EmailCuentadanteDestino ;
   private boolean[] T000527_n715Tran_EmailCuentadanteDestino ;
   private String[] T000528_A672Tran_NombreIngreso ;
   private boolean[] T000528_n672Tran_NombreIngreso ;
   private String[] T000528_A756Tran_Abreviado ;
   private boolean[] T000528_n756Tran_Abreviado ;
   private String[] T000529_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] T000529_n516Tran_CentroCostoCodigoDestino ;
   private String[] T000529_A517Tran_CentroCostoDescripcionDes ;
   private boolean[] T000529_n517Tran_CentroCostoDescripcionDes ;
   private long[] T000529_A518Tran_RegionIdDestino ;
   private boolean[] T000529_n518Tran_RegionIdDestino ;
   private short[] T000530_A519Tran_RegionCodigoDestino ;
   private boolean[] T000530_n519Tran_RegionCodigoDestino ;
   private String[] T000530_A520Tran_RegionDescripcionDestino ;
   private boolean[] T000530_n520Tran_RegionDescripcionDestino ;
   private String[] T000530_A608Tran_RegionAbrevDestino ;
   private boolean[] T000530_n608Tran_RegionAbrevDestino ;
   private long[] T000531_A759Tran_CedulaResponsabilidad ;
   private boolean[] T000531_n759Tran_CedulaResponsabilidad ;
   private String[] T000531_A721Tran_NombreCuentadanteResponsa ;
   private boolean[] T000531_n721Tran_NombreCuentadanteResponsa ;
   private long[] T000532_A46Tran_Id ;
   private String[] T00056_A416Tran_Observaciones ;
   private boolean[] T00056_n416Tran_Observaciones ;
   private long[] T00056_A46Tran_Id ;
   private java.util.Date[] T00056_A55Tran_FechaRegistro ;
   private String[] T00056_A58Tran_Estado ;
   private boolean[] T00056_n58Tran_Estado ;
   private String[] T00056_A110Tran_ModuloOrigen ;
   private String[] T00056_A109Tran_CodAlmaOrigen ;
   private String[] T00056_A112Tran_CodBodeOrigen ;
   private String[] T00056_A385Tran_ModuloDestino ;
   private String[] T00056_A111Tran_CodAlmaDestino ;
   private String[] T00056_A387Tran_CodBodeDestino ;
   private String[] T00056_A407Tran_AreadanteCodigo ;
   private boolean[] T00056_n407Tran_AreadanteCodigo ;
   private String[] T00056_A408Tran_CursoCodigo ;
   private boolean[] T00056_n408Tran_CursoCodigo ;
   private java.math.BigDecimal[] T00056_A483Tran_ValorTransaccion ;
   private boolean[] T00056_n483Tran_ValorTransaccion ;
   private long[] T00056_A498Tran_NumeroLineas ;
   private boolean[] T00056_n498Tran_NumeroLineas ;
   private java.util.Date[] T00056_A390Tran_FechaRatificacion ;
   private boolean[] T00056_n390Tran_FechaRatificacion ;
   private String[] T00056_A391Tran_UsuarioRatifica ;
   private boolean[] T00056_n391Tran_UsuarioRatifica ;
   private long[] T00056_A513Tran_ConsecutivoCC ;
   private boolean[] T00056_n513Tran_ConsecutivoCC ;
   private String[] T00056_A514Tran_NumeroIngreso ;
   private boolean[] T00056_n514Tran_NumeroIngreso ;
   private java.util.Date[] T00056_A515Tran_FechaIngreso ;
   private boolean[] T00056_n515Tran_FechaIngreso ;
   private String[] T00056_A524Tran_Detalle ;
   private boolean[] T00056_n524Tran_Detalle ;
   private String[] T00056_A527Tran_TipoEntra ;
   private boolean[] T00056_n527Tran_TipoEntra ;
   private int[] T00056_A568Tran_CantidadPadres ;
   private boolean[] T00056_n568Tran_CantidadPadres ;
   private short[] T00056_A667Tran_NumeroGrupo ;
   private boolean[] T00056_n667Tran_NumeroGrupo ;
   private String[] T00056_A668Tran_UsuarioEliminaoAnula ;
   private boolean[] T00056_n668Tran_UsuarioEliminaoAnula ;
   private java.util.Date[] T00056_A669Tran_FechaEliminaoAnula ;
   private boolean[] T00056_n669Tran_FechaEliminaoAnula ;
   private String[] T00056_A670Tran_ObservacionesAnula ;
   private boolean[] T00056_n670Tran_ObservacionesAnula ;
   private long[] T00056_A719Tran_TransaccResponsabilidad ;
   private boolean[] T00056_n719Tran_TransaccResponsabilidad ;
   private java.util.Date[] T00056_A720Tran_FechaResponsabilidad ;
   private boolean[] T00056_n720Tran_FechaResponsabilidad ;
   private short[] T00056_A758Tran_TablaResponsabilidad ;
   private boolean[] T00056_n758Tran_TablaResponsabilidad ;
   private String[] T00056_A859Tran_EntidadGobierno ;
   private boolean[] T00056_n859Tran_EntidadGobierno ;
   private long[] T00056_A47Tran_UsuarioId ;
   private boolean[] T00056_n47Tran_UsuarioId ;
   private long[] T00056_A48Tran_CentroCostoId ;
   private long[] T00056_A50Tran_CentroCostoIdDestino ;
   private boolean[] T00056_n50Tran_CentroCostoIdDestino ;
   private String[] T00056_A49Tran_CodigoMovimiento ;
   private long[] T00056_A51Tran_IdCuentadanteOrigen ;
   private boolean[] T00056_n51Tran_IdCuentadanteOrigen ;
   private long[] T00056_A53Tran_IdProveedor ;
   private boolean[] T00056_n53Tran_IdProveedor ;
   private long[] T00056_A52Tran_IdCuentadanteDestino ;
   private boolean[] T00056_n52Tran_IdCuentadanteDestino ;
   private long[] T00056_A56Tran_IdCuentadanteResponsabili ;
   private boolean[] T00056_n56Tran_IdCuentadanteResponsabili ;
   private long[] T00056_A54Tran_TipoIngreso ;
   private boolean[] T00056_n54Tran_TipoIngreso ;
   private long[] T00056_A57Tran_RegionId ;
   private boolean[] T00056_n57Tran_RegionId ;
   private String[] T00056_A481Tran_IndE_S ;
   private boolean[] T00056_n481Tran_IndE_S ;
   private String[] T00056_A482Tran_TipoElemento ;
   private boolean[] T00056_n482Tran_TipoElemento ;
   private long[] T00056_A518Tran_RegionIdDestino ;
   private boolean[] T00056_n518Tran_RegionIdDestino ;
   private long[] T000533_A46Tran_Id ;
   private long[] T000534_A46Tran_Id ;
   private String[] T00055_A416Tran_Observaciones ;
   private boolean[] T00055_n416Tran_Observaciones ;
   private long[] T00055_A46Tran_Id ;
   private java.util.Date[] T00055_A55Tran_FechaRegistro ;
   private String[] T00055_A58Tran_Estado ;
   private boolean[] T00055_n58Tran_Estado ;
   private String[] T00055_A110Tran_ModuloOrigen ;
   private String[] T00055_A109Tran_CodAlmaOrigen ;
   private String[] T00055_A112Tran_CodBodeOrigen ;
   private String[] T00055_A385Tran_ModuloDestino ;
   private String[] T00055_A111Tran_CodAlmaDestino ;
   private String[] T00055_A387Tran_CodBodeDestino ;
   private String[] T00055_A407Tran_AreadanteCodigo ;
   private boolean[] T00055_n407Tran_AreadanteCodigo ;
   private String[] T00055_A408Tran_CursoCodigo ;
   private boolean[] T00055_n408Tran_CursoCodigo ;
   private java.math.BigDecimal[] T00055_A483Tran_ValorTransaccion ;
   private boolean[] T00055_n483Tran_ValorTransaccion ;
   private long[] T00055_A498Tran_NumeroLineas ;
   private boolean[] T00055_n498Tran_NumeroLineas ;
   private java.util.Date[] T00055_A390Tran_FechaRatificacion ;
   private boolean[] T00055_n390Tran_FechaRatificacion ;
   private String[] T00055_A391Tran_UsuarioRatifica ;
   private boolean[] T00055_n391Tran_UsuarioRatifica ;
   private long[] T00055_A513Tran_ConsecutivoCC ;
   private boolean[] T00055_n513Tran_ConsecutivoCC ;
   private String[] T00055_A514Tran_NumeroIngreso ;
   private boolean[] T00055_n514Tran_NumeroIngreso ;
   private java.util.Date[] T00055_A515Tran_FechaIngreso ;
   private boolean[] T00055_n515Tran_FechaIngreso ;
   private String[] T00055_A524Tran_Detalle ;
   private boolean[] T00055_n524Tran_Detalle ;
   private String[] T00055_A527Tran_TipoEntra ;
   private boolean[] T00055_n527Tran_TipoEntra ;
   private int[] T00055_A568Tran_CantidadPadres ;
   private boolean[] T00055_n568Tran_CantidadPadres ;
   private short[] T00055_A667Tran_NumeroGrupo ;
   private boolean[] T00055_n667Tran_NumeroGrupo ;
   private String[] T00055_A668Tran_UsuarioEliminaoAnula ;
   private boolean[] T00055_n668Tran_UsuarioEliminaoAnula ;
   private java.util.Date[] T00055_A669Tran_FechaEliminaoAnula ;
   private boolean[] T00055_n669Tran_FechaEliminaoAnula ;
   private String[] T00055_A670Tran_ObservacionesAnula ;
   private boolean[] T00055_n670Tran_ObservacionesAnula ;
   private long[] T00055_A719Tran_TransaccResponsabilidad ;
   private boolean[] T00055_n719Tran_TransaccResponsabilidad ;
   private java.util.Date[] T00055_A720Tran_FechaResponsabilidad ;
   private boolean[] T00055_n720Tran_FechaResponsabilidad ;
   private short[] T00055_A758Tran_TablaResponsabilidad ;
   private boolean[] T00055_n758Tran_TablaResponsabilidad ;
   private String[] T00055_A859Tran_EntidadGobierno ;
   private boolean[] T00055_n859Tran_EntidadGobierno ;
   private long[] T00055_A47Tran_UsuarioId ;
   private boolean[] T00055_n47Tran_UsuarioId ;
   private long[] T00055_A48Tran_CentroCostoId ;
   private long[] T00055_A50Tran_CentroCostoIdDestino ;
   private boolean[] T00055_n50Tran_CentroCostoIdDestino ;
   private String[] T00055_A49Tran_CodigoMovimiento ;
   private long[] T00055_A51Tran_IdCuentadanteOrigen ;
   private boolean[] T00055_n51Tran_IdCuentadanteOrigen ;
   private long[] T00055_A53Tran_IdProveedor ;
   private boolean[] T00055_n53Tran_IdProveedor ;
   private long[] T00055_A52Tran_IdCuentadanteDestino ;
   private boolean[] T00055_n52Tran_IdCuentadanteDestino ;
   private long[] T00055_A56Tran_IdCuentadanteResponsabili ;
   private boolean[] T00055_n56Tran_IdCuentadanteResponsabili ;
   private long[] T00055_A54Tran_TipoIngreso ;
   private boolean[] T00055_n54Tran_TipoIngreso ;
   private long[] T00055_A57Tran_RegionId ;
   private boolean[] T00055_n57Tran_RegionId ;
   private String[] T00055_A481Tran_IndE_S ;
   private boolean[] T00055_n481Tran_IndE_S ;
   private String[] T00055_A482Tran_TipoElemento ;
   private boolean[] T00055_n482Tran_TipoElemento ;
   private long[] T00055_A518Tran_RegionIdDestino ;
   private boolean[] T00055_n518Tran_RegionIdDestino ;
   private long[] T000536_A46Tran_Id ;
   private String[] T000539_A417Tran_UsuarioCodigo ;
   private boolean[] T000539_n417Tran_UsuarioCodigo ;
   private String[] T000539_A418Tran_UsuarioNombre ;
   private boolean[] T000539_n418Tran_UsuarioNombre ;
   private String[] T000540_A419Tran_CentroCostoCodigo ;
   private boolean[] T000540_n419Tran_CentroCostoCodigo ;
   private String[] T000540_A420Tran_CentroCostoDescripcion ;
   private boolean[] T000540_n420Tran_CentroCostoDescripcion ;
   private long[] T000540_A57Tran_RegionId ;
   private boolean[] T000540_n57Tran_RegionId ;
   private short[] T000541_A421Tran_RegionCodigo ;
   private boolean[] T000541_n421Tran_RegionCodigo ;
   private String[] T000541_A422Tran_RegionDescripcion ;
   private boolean[] T000541_n422Tran_RegionDescripcion ;
   private String[] T000541_A594Tran_RegionAbrev ;
   private boolean[] T000541_n594Tran_RegionAbrev ;
   private String[] T000542_A381Tran_DescripcionMovimiento ;
   private boolean[] T000542_n381Tran_DescripcionMovimiento ;
   private String[] T000542_A478Tran_IndAreadante ;
   private boolean[] T000542_n478Tran_IndAreadante ;
   private String[] T000542_A481Tran_IndE_S ;
   private boolean[] T000542_n481Tran_IndE_S ;
   private String[] T000542_A479Tran_IndCurso ;
   private boolean[] T000542_n479Tran_IndCurso ;
   private String[] T000542_A707Tran_SolicitaCCDestino ;
   private boolean[] T000542_n707Tran_SolicitaCCDestino ;
   private String[] T000542_A708Tran_SolicitaRegionDestino ;
   private boolean[] T000542_n708Tran_SolicitaRegionDestino ;
   private String[] T000542_A754Tran_CuentaResponsabilidad ;
   private boolean[] T000542_n754Tran_CuentaResponsabilidad ;
   private long[] T000542_A499Tran_CodTipoElemento ;
   private boolean[] T000542_n499Tran_CodTipoElemento ;
   private String[] T000543_A482Tran_TipoElemento ;
   private boolean[] T000543_n482Tran_TipoElemento ;
   private String[] T000544_A384Tran_NombCuentadanteOrigen ;
   private boolean[] T000544_n384Tran_NombCuentadanteOrigen ;
   private long[] T000544_A702Tran_CedulaCuentadanteOrigen ;
   private boolean[] T000544_n702Tran_CedulaCuentadanteOrigen ;
   private String[] T000544_A714Tran_EmailCuentadanteOrigen ;
   private boolean[] T000544_n714Tran_EmailCuentadanteOrigen ;
   private String[] T000545_A575Tran_NombreProveedor ;
   private boolean[] T000545_n575Tran_NombreProveedor ;
   private long[] T000545_A703Tran_CedulaProveedor ;
   private boolean[] T000545_n703Tran_CedulaProveedor ;
   private String[] T000546_A389Tran_NombCuentadanteDestino ;
   private boolean[] T000546_n389Tran_NombCuentadanteDestino ;
   private long[] T000546_A704Tran_CedulaCuentadanteDestino ;
   private boolean[] T000546_n704Tran_CedulaCuentadanteDestino ;
   private String[] T000546_A715Tran_EmailCuentadanteDestino ;
   private boolean[] T000546_n715Tran_EmailCuentadanteDestino ;
   private String[] T000547_A672Tran_NombreIngreso ;
   private boolean[] T000547_n672Tran_NombreIngreso ;
   private String[] T000547_A756Tran_Abreviado ;
   private boolean[] T000547_n756Tran_Abreviado ;
   private String[] T000548_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] T000548_n516Tran_CentroCostoCodigoDestino ;
   private String[] T000548_A517Tran_CentroCostoDescripcionDes ;
   private boolean[] T000548_n517Tran_CentroCostoDescripcionDes ;
   private long[] T000548_A518Tran_RegionIdDestino ;
   private boolean[] T000548_n518Tran_RegionIdDestino ;
   private short[] T000549_A519Tran_RegionCodigoDestino ;
   private boolean[] T000549_n519Tran_RegionCodigoDestino ;
   private String[] T000549_A520Tran_RegionDescripcionDestino ;
   private boolean[] T000549_n520Tran_RegionDescripcionDestino ;
   private String[] T000549_A608Tran_RegionAbrevDestino ;
   private boolean[] T000549_n608Tran_RegionAbrevDestino ;
   private long[] T000550_A759Tran_CedulaResponsabilidad ;
   private boolean[] T000550_n759Tran_CedulaResponsabilidad ;
   private String[] T000550_A721Tran_NombreCuentadanteResponsa ;
   private boolean[] T000550_n721Tran_NombreCuentadanteResponsa ;
   private long[] T000551_A106Nove_Identificador ;
   private long[] T000552_A91Regional ;
   private long[] T000552_A92Centro_Id ;
   private String[] T000552_A27Alma_Modulo ;
   private String[] T000552_A28Alma_Codigo ;
   private String[] T000552_A31Bode_Codigo ;
   private long[] T000552_A93Trans_Id ;
   private String[] T000552_A66Elem_Consecutivo ;
   private int[] T000552_A94Num_Linea ;
   private long[] T000553_A46Tran_Id ;
   private long[] T000553_A69TDet_Consecutivo ;
   private long[] T000554_A46Tran_Id ;
   private long[] T000555_A46Tran_Id ;
   private String[] T000555_A828Tran_Descrip_Documento ;
   private boolean[] T000555_n828Tran_Descrip_Documento ;
   private String[] T000555_A829Tran_Prefijo_Documento ;
   private boolean[] T000555_n829Tran_Prefijo_Documento ;
   private String[] T000555_A830Tran_Archivo ;
   private boolean[] T000555_n830Tran_Archivo ;
   private String[] T000555_A831Tran_Ruta_Archivo ;
   private boolean[] T000555_n831Tran_Ruta_Archivo ;
   private short[] T000555_A827Tran_Nro_Documento ;
   private String[] T00054_A828Tran_Descrip_Documento ;
   private boolean[] T00054_n828Tran_Descrip_Documento ;
   private String[] T00054_A829Tran_Prefijo_Documento ;
   private boolean[] T00054_n829Tran_Prefijo_Documento ;
   private String[] T000556_A828Tran_Descrip_Documento ;
   private boolean[] T000556_n828Tran_Descrip_Documento ;
   private String[] T000556_A829Tran_Prefijo_Documento ;
   private boolean[] T000556_n829Tran_Prefijo_Documento ;
   private long[] T000557_A46Tran_Id ;
   private short[] T000557_A827Tran_Nro_Documento ;
   private long[] T00053_A46Tran_Id ;
   private String[] T00053_A830Tran_Archivo ;
   private boolean[] T00053_n830Tran_Archivo ;
   private String[] T00053_A831Tran_Ruta_Archivo ;
   private boolean[] T00053_n831Tran_Ruta_Archivo ;
   private short[] T00053_A827Tran_Nro_Documento ;
   private long[] T00052_A46Tran_Id ;
   private String[] T00052_A830Tran_Archivo ;
   private boolean[] T00052_n830Tran_Archivo ;
   private String[] T00052_A831Tran_Ruta_Archivo ;
   private boolean[] T00052_n831Tran_Ruta_Archivo ;
   private short[] T00052_A827Tran_Nro_Documento ;
   private String[] T000562_A828Tran_Descrip_Documento ;
   private boolean[] T000562_n828Tran_Descrip_Documento ;
   private String[] T000562_A829Tran_Prefijo_Documento ;
   private boolean[] T000562_n829Tran_Prefijo_Documento ;
   private long[] T000563_A46Tran_Id ;
   private short[] T000563_A827Tran_Nro_Documento ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV37TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV38TrnContextAtt ;
}

final  class alm_transaccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00052", "SELECT Tran_Id, Tran_Archivo, Tran_Ruta_Archivo, Tran_Nro_Documento FROM ALM_TRANSACCION_DOCUM WHERE Tran_Id = ? AND Tran_Nro_Documento = ?  FOR UPDATE OF Tran_Archivo, Tran_Ruta_Archivo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00053", "SELECT Tran_Id, Tran_Archivo, Tran_Ruta_Archivo, Tran_Nro_Documento FROM ALM_TRANSACCION_DOCUM WHERE Tran_Id = ? AND Tran_Nro_Documento = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00054", "SELECT Docu_Descripcion AS Tran_Descrip_Documento, Docu_Prefijo AS Tran_Prefijo_Documento FROM ALM_DOCUMENTOS WHERE Docu_Nro = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00055", "SELECT Tran_Observaciones, Tran_Id, Tran_FechaRegistro, Tran_Estado, Tran_ModuloOrigen, Tran_CodAlmaOrigen, Tran_CodBodeOrigen, Tran_ModuloDestino, Tran_CodAlmaDestino, Tran_CodBodeDestino, Tran_AreadanteCodigo, Tran_CursoCodigo, Tran_ValorTransaccion, Tran_NumeroLineas, Tran_FechaRatificacion, Tran_UsuarioRatifica, Tran_ConsecutivoCC, Tran_NumeroIngreso, Tran_FechaIngreso, Tran_Detalle, Tran_TipoEntra, Tran_CantidadPadres, Tran_NumeroGrupo, Tran_UsuarioEliminaoAnula, Tran_FechaEliminaoAnula, Tran_ObservacionesAnula, Tran_TransaccResponsabilidad, Tran_FechaResponsabilidad, Tran_TablaResponsabilidad, Tran_EntidadGobierno, Tran_UsuarioId, Tran_CentroCostoId, Tran_CentroCostoIdDestino, Tran_CodigoMovimiento, Tran_IdCuentadanteOrigen, Tran_IdProveedor, Tran_IdCuentadanteDestino, Tran_IdCuentadanteResponsabili, Tran_TipoIngreso, Tran_RegionId, Tran_IndE_S, Tran_TipoElemento, Tran_RegionIdDestino FROM ALM_TRANSACCION WHERE Tran_Id = ?  FOR UPDATE OF Tran_FechaRegistro, Tran_Estado, Tran_ModuloOrigen, Tran_CodAlmaOrigen, Tran_CodBodeOrigen, Tran_ModuloDestino, Tran_CodAlmaDestino, Tran_CodBodeDestino, Tran_Observaciones, Tran_AreadanteCodigo, Tran_CursoCodigo, Tran_ValorTransaccion, Tran_NumeroLineas, Tran_FechaRatificacion, Tran_UsuarioRatifica, Tran_ConsecutivoCC, Tran_NumeroIngreso, Tran_FechaIngreso, Tran_Detalle, Tran_TipoEntra, Tran_CantidadPadres, Tran_NumeroGrupo, Tran_UsuarioEliminaoAnula, Tran_FechaEliminaoAnula, Tran_ObservacionesAnula, Tran_TransaccResponsabilidad, Tran_FechaResponsabilidad, Tran_TablaResponsabilidad, Tran_EntidadGobierno, Tran_UsuarioId, Tran_CentroCostoId, Tran_CentroCostoIdDestino, Tran_CodigoMovimiento, Tran_IdCuentadanteOrigen, Tran_IdProveedor, Tran_IdCuentadanteDestino, Tran_IdCuentadanteResponsabili, Tran_TipoIngreso, Tran_RegionId, Tran_IndE_S, Tran_TipoElemento, Tran_RegionIdDestino NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00056", "SELECT Tran_Observaciones, Tran_Id, Tran_FechaRegistro, Tran_Estado, Tran_ModuloOrigen, Tran_CodAlmaOrigen, Tran_CodBodeOrigen, Tran_ModuloDestino, Tran_CodAlmaDestino, Tran_CodBodeDestino, Tran_AreadanteCodigo, Tran_CursoCodigo, Tran_ValorTransaccion, Tran_NumeroLineas, Tran_FechaRatificacion, Tran_UsuarioRatifica, Tran_ConsecutivoCC, Tran_NumeroIngreso, Tran_FechaIngreso, Tran_Detalle, Tran_TipoEntra, Tran_CantidadPadres, Tran_NumeroGrupo, Tran_UsuarioEliminaoAnula, Tran_FechaEliminaoAnula, Tran_ObservacionesAnula, Tran_TransaccResponsabilidad, Tran_FechaResponsabilidad, Tran_TablaResponsabilidad, Tran_EntidadGobierno, Tran_UsuarioId, Tran_CentroCostoId, Tran_CentroCostoIdDestino, Tran_CodigoMovimiento, Tran_IdCuentadanteOrigen, Tran_IdProveedor, Tran_IdCuentadanteDestino, Tran_IdCuentadanteResponsabili, Tran_TipoIngreso, Tran_RegionId, Tran_IndE_S, Tran_TipoElemento, Tran_RegionIdDestino FROM ALM_TRANSACCION WHERE Tran_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00057", "SELECT Usua_Codigo AS Tran_UsuarioCodigo, Usua_Nombre AS Tran_UsuarioNombre FROM SEG_USUARIO WHERE Usua_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00058", "SELECT Cent_Codigo AS Tran_CentroCostoCodigo, Cent_Descripcion AS Tran_CentroCostoDescripcion, Regi_Id AS Tran_RegionId FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00059", "SELECT Cent_Codigo AS Tran_CentroCostoCodigoDestino, Cent_Descripcion AS Tran_CentroCostoDescripcionDes, Regi_Id AS Tran_RegionIdDestino FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000510", "SELECT Regi_Cod AS Tran_RegionCodigo, Regi_Descripcion AS Tran_RegionDescripcion, Regi_Abrev AS Tran_RegionAbrev FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000511", "SELECT Regi_Cod AS Tran_RegionCodigoDestino, Regi_Descripcion AS Tran_RegionDescripcionDestino, Regi_Abrev AS Tran_RegionAbrevDestino FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000512", "SELECT Tpmo_Descripcion AS Tran_DescripcionMovimiento, Tpmo_IngresaAredante AS Tran_IndAreadante, Tpmo_TipoE_S AS Tran_IndE_S, Tpmo_IngresaCurso AS Tran_IndCurso, Tpmo_SolicitaCentroDestino AS Tran_SolicitaCCDestino, Tpmo_SolicitaRegionDestino AS Tran_SolicitaRegionDestino, Tpmo_CuentaResponsabilidad AS Tran_CuentaResponsabilidad, Tipo_Codigo AS Tran_CodTipoElemento FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000513", "SELECT Cuen_Nombre AS Tran_NombCuentadanteOrigen, Cuen_Cedula AS Tran_CedulaCuentadanteOrigen, Cuen_Email AS Tran_EmailCuentadanteOrigen FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000514", "SELECT Cuen_Nombre AS Tran_NombreProveedor, Cuen_Cedula AS Tran_CedulaProveedor FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000515", "SELECT Cuen_Nombre AS Tran_NombCuentadanteDestino, Cuen_Cedula AS Tran_CedulaCuentadanteDestino, Cuen_Email AS Tran_EmailCuentadanteDestino FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000516", "SELECT Cuen_Cedula AS Tran_CedulaResponsabilidad, Cuen_Nombre AS Tran_NombreCuentadanteResponsa FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000517", "SELECT Orig_Descripcion AS Tran_NombreIngreso, Orig_Descripcion_Abreviado AS Tran_Abreviado FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000518", "SELECT Tipo_Tipo AS Tran_TipoElemento FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000519", "SELECT /*+ FIRST_ROWS(100) */ TM1.Tran_Observaciones, TM1.Tran_Id, TM1.Tran_FechaRegistro, TM1.Tran_Estado, T2.Usua_Codigo AS Tran_UsuarioCodigo, T2.Usua_Nombre AS Tran_UsuarioNombre, T3.Cent_Codigo AS Tran_CentroCostoCodigo, T3.Cent_Descripcion AS Tran_CentroCostoDescripcion, TM1.Tran_RegionId AS Tran_RegionId, T4.Regi_Cod AS Tran_RegionCodigo, T4.Regi_Descripcion AS Tran_RegionDescripcion, T4.Regi_Abrev AS Tran_RegionAbrev, T5.Tpmo_Descripcion AS Tran_DescripcionMovimiento, T5.Tpmo_IngresaAredante AS Tran_IndAreadante, TM1.Tran_IndE_S AS Tran_IndE_S, T5.Tpmo_IngresaCurso AS Tran_IndCurso, TM1.Tran_TipoElemento AS Tran_TipoElemento, T5.Tpmo_SolicitaCentroDestino AS Tran_SolicitaCCDestino, T5.Tpmo_SolicitaRegionDestino AS Tran_SolicitaRegionDestino, T5.Tpmo_CuentaResponsabilidad AS Tran_CuentaResponsabilidad, TM1.Tran_ModuloOrigen, TM1.Tran_CodAlmaOrigen, TM1.Tran_CodBodeOrigen, T6.Cuen_Nombre AS Tran_NombCuentadanteOrigen, T6.Cuen_Cedula AS Tran_CedulaCuentadanteOrigen, T6.Cuen_Email AS Tran_EmailCuentadanteOrigen, T7.Cuen_Nombre AS Tran_NombreProveedor, T7.Cuen_Cedula AS Tran_CedulaProveedor, TM1.Tran_ModuloDestino, TM1.Tran_CodAlmaDestino, TM1.Tran_CodBodeDestino, T8.Cuen_Nombre AS Tran_NombCuentadanteDestino, T8.Cuen_Cedula AS Tran_CedulaCuentadanteDestino, T8.Cuen_Email AS Tran_EmailCuentadanteDestino, TM1.Tran_AreadanteCodigo, TM1.Tran_CursoCodigo, TM1.Tran_ValorTransaccion, TM1.Tran_NumeroLineas, TM1.Tran_FechaRatificacion, TM1.Tran_UsuarioRatifica, TM1.Tran_ConsecutivoCC, T9.Orig_Descripcion AS Tran_NombreIngreso, T9.Orig_Descripcion_Abreviado AS Tran_Abreviado, TM1.Tran_NumeroIngreso, TM1.Tran_FechaIngreso, T10.Cent_Codigo AS Tran_CentroCostoCodigoDestino, T10.Cent_Descripcion AS Tran_CentroCostoDescripcionDes, TM1.Tran_RegionIdDestino AS Tran_RegionIdDestino, T11.Regi_Cod AS Tran_RegionCodigoDestino, T11.Regi_Descripcion AS Tran_RegionDescripcionDestino, T11.Regi_Abrev AS Tran_RegionAbrevDestino, TM1.Tran_Detalle, TM1.Tran_TipoEntra, TM1.Tran_CantidadPadres, TM1.Tran_NumeroGrupo, TM1.Tran_UsuarioEliminaoAnula, TM1.Tran_FechaEliminaoAnula, TM1.Tran_ObservacionesAnula, T12.Cuen_Cedula AS Tran_CedulaResponsabilidad, T12.Cuen_Nombre AS Tran_NombreCuentadanteResponsa, TM1.Tran_TransaccResponsabilidad, TM1.Tran_FechaResponsabilidad, TM1.Tran_TablaResponsabilidad, TM1.Tran_EntidadGobierno, TM1.Tran_UsuarioId AS Tran_UsuarioId, TM1.Tran_CentroCostoId AS Tran_CentroCostoId, TM1.Tran_CentroCostoIdDestino AS Tran_CentroCostoIdDestino, TM1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, TM1.Tran_IdCuentadanteOrigen AS Tran_IdCuentadanteOrigen, TM1.Tran_IdProveedor AS Tran_IdProveedor, TM1.Tran_IdCuentadanteDestino AS Tran_IdCuentadanteDestino, TM1.Tran_IdCuentadanteResponsabili AS Tran_IdCuentadanteResponsabili, TM1.Tran_TipoIngreso AS Tran_TipoIngreso, T5.Tipo_Codigo AS Tran_CodTipoElemento FROM (((((((((((ALM_TRANSACCION TM1 LEFT JOIN SEG_USUARIO T2 ON T2.Usua_Id = TM1.Tran_UsuarioId) INNER JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = TM1.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL T4 ON T4.Regi_Id = TM1.Tran_RegionId) INNER JOIN ALM_TIPO_MOVIMIENTO T5 ON T5.Tpmo_Codigo = TM1.Tran_CodigoMovimiento) LEFT JOIN ALM_CUENTADANTE T6 ON T6.Cuen_Identificacion = TM1.Tran_IdCuentadanteOrigen) LEFT JOIN ALM_CUENTADANTE T7 ON T7.Cuen_Identificacion = TM1.Tran_IdProveedor) LEFT JOIN ALM_CUENTADANTE T8 ON T8.Cuen_Identificacion = TM1.Tran_IdCuentadanteDestino) LEFT JOIN ALM_ORIGEN_BIENES T9 ON T9.Orig_Identificador = TM1.Tran_TipoIngreso) LEFT JOIN GEN_CENTROCOSTO T10 ON T10.Cent_Id = TM1.Tran_CentroCostoIdDestino) LEFT JOIN GEN_REGIONAL T11 ON T11.Regi_Id = TM1.Tran_RegionIdDestino) LEFT JOIN ALM_CUENTADANTE T12 ON T12.Cuen_Identificacion = TM1.Tran_IdCuentadanteResponsabili) WHERE TM1.Tran_Id = ? ORDER BY TM1.Tran_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000520", "SELECT Usua_Codigo AS Tran_UsuarioCodigo, Usua_Nombre AS Tran_UsuarioNombre FROM SEG_USUARIO WHERE Usua_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000521", "SELECT Cent_Codigo AS Tran_CentroCostoCodigo, Cent_Descripcion AS Tran_CentroCostoDescripcion, Regi_Id AS Tran_RegionId FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000522", "SELECT Regi_Cod AS Tran_RegionCodigo, Regi_Descripcion AS Tran_RegionDescripcion, Regi_Abrev AS Tran_RegionAbrev FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000523", "SELECT Tpmo_Descripcion AS Tran_DescripcionMovimiento, Tpmo_IngresaAredante AS Tran_IndAreadante, Tpmo_TipoE_S AS Tran_IndE_S, Tpmo_IngresaCurso AS Tran_IndCurso, Tpmo_SolicitaCentroDestino AS Tran_SolicitaCCDestino, Tpmo_SolicitaRegionDestino AS Tran_SolicitaRegionDestino, Tpmo_CuentaResponsabilidad AS Tran_CuentaResponsabilidad, Tipo_Codigo AS Tran_CodTipoElemento FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000524", "SELECT Tipo_Tipo AS Tran_TipoElemento FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000525", "SELECT Cuen_Nombre AS Tran_NombCuentadanteOrigen, Cuen_Cedula AS Tran_CedulaCuentadanteOrigen, Cuen_Email AS Tran_EmailCuentadanteOrigen FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000526", "SELECT Cuen_Nombre AS Tran_NombreProveedor, Cuen_Cedula AS Tran_CedulaProveedor FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000527", "SELECT Cuen_Nombre AS Tran_NombCuentadanteDestino, Cuen_Cedula AS Tran_CedulaCuentadanteDestino, Cuen_Email AS Tran_EmailCuentadanteDestino FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000528", "SELECT Orig_Descripcion AS Tran_NombreIngreso, Orig_Descripcion_Abreviado AS Tran_Abreviado FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000529", "SELECT Cent_Codigo AS Tran_CentroCostoCodigoDestino, Cent_Descripcion AS Tran_CentroCostoDescripcionDes, Regi_Id AS Tran_RegionIdDestino FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000530", "SELECT Regi_Cod AS Tran_RegionCodigoDestino, Regi_Descripcion AS Tran_RegionDescripcionDestino, Regi_Abrev AS Tran_RegionAbrevDestino FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000531", "SELECT Cuen_Cedula AS Tran_CedulaResponsabilidad, Cuen_Nombre AS Tran_NombreCuentadanteResponsa FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000532", "SELECT /*+ FIRST_ROWS(1) */ Tran_Id FROM ALM_TRANSACCION WHERE Tran_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000533", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Tran_Id FROM ALM_TRANSACCION WHERE ( Tran_Id > ?) ORDER BY Tran_Id) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000534", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Tran_Id FROM ALM_TRANSACCION WHERE ( Tran_Id < ?) ORDER BY Tran_Id DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000535", "INSERT INTO ALM_TRANSACCION(Tran_RegionId, Tran_IndE_S, Tran_TipoElemento, Tran_RegionIdDestino, Tran_FechaRegistro, Tran_Estado, Tran_ModuloOrigen, Tran_CodAlmaOrigen, Tran_CodBodeOrigen, Tran_ModuloDestino, Tran_CodAlmaDestino, Tran_CodBodeDestino, Tran_Observaciones, Tran_AreadanteCodigo, Tran_CursoCodigo, Tran_ValorTransaccion, Tran_NumeroLineas, Tran_FechaRatificacion, Tran_UsuarioRatifica, Tran_ConsecutivoCC, Tran_NumeroIngreso, Tran_FechaIngreso, Tran_Detalle, Tran_TipoEntra, Tran_CantidadPadres, Tran_NumeroGrupo, Tran_UsuarioEliminaoAnula, Tran_FechaEliminaoAnula, Tran_ObservacionesAnula, Tran_TransaccResponsabilidad, Tran_FechaResponsabilidad, Tran_TablaResponsabilidad, Tran_EntidadGobierno, Tran_UsuarioId, Tran_CentroCostoId, Tran_CentroCostoIdDestino, Tran_CodigoMovimiento, Tran_IdCuentadanteOrigen, Tran_IdProveedor, Tran_IdCuentadanteDestino, Tran_IdCuentadanteResponsabili, Tran_TipoIngreso) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_TRANSACCION")
         ,new ForEachCursor("T000536", "SELECT Tran_Id.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000537", "UPDATE ALM_TRANSACCION SET Tran_RegionId=?, Tran_IndE_S=?, Tran_TipoElemento=?, Tran_RegionIdDestino=?, Tran_FechaRegistro=?, Tran_Estado=?, Tran_ModuloOrigen=?, Tran_CodAlmaOrigen=?, Tran_CodBodeOrigen=?, Tran_ModuloDestino=?, Tran_CodAlmaDestino=?, Tran_CodBodeDestino=?, Tran_Observaciones=?, Tran_AreadanteCodigo=?, Tran_CursoCodigo=?, Tran_ValorTransaccion=?, Tran_NumeroLineas=?, Tran_FechaRatificacion=?, Tran_UsuarioRatifica=?, Tran_ConsecutivoCC=?, Tran_NumeroIngreso=?, Tran_FechaIngreso=?, Tran_Detalle=?, Tran_TipoEntra=?, Tran_CantidadPadres=?, Tran_NumeroGrupo=?, Tran_UsuarioEliminaoAnula=?, Tran_FechaEliminaoAnula=?, Tran_ObservacionesAnula=?, Tran_TransaccResponsabilidad=?, Tran_FechaResponsabilidad=?, Tran_TablaResponsabilidad=?, Tran_EntidadGobierno=?, Tran_UsuarioId=?, Tran_CentroCostoId=?, Tran_CentroCostoIdDestino=?, Tran_CodigoMovimiento=?, Tran_IdCuentadanteOrigen=?, Tran_IdProveedor=?, Tran_IdCuentadanteDestino=?, Tran_IdCuentadanteResponsabili=?, Tran_TipoIngreso=?  WHERE Tran_Id = ?", GX_NOMASK, "ALM_TRANSACCION")
         ,new UpdateCursor("T000538", "DELETE FROM ALM_TRANSACCION  WHERE Tran_Id = ?", GX_NOMASK, "ALM_TRANSACCION")
         ,new ForEachCursor("T000539", "SELECT Usua_Codigo AS Tran_UsuarioCodigo, Usua_Nombre AS Tran_UsuarioNombre FROM SEG_USUARIO WHERE Usua_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000540", "SELECT Cent_Codigo AS Tran_CentroCostoCodigo, Cent_Descripcion AS Tran_CentroCostoDescripcion, Regi_Id AS Tran_RegionId FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000541", "SELECT Regi_Cod AS Tran_RegionCodigo, Regi_Descripcion AS Tran_RegionDescripcion, Regi_Abrev AS Tran_RegionAbrev FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000542", "SELECT Tpmo_Descripcion AS Tran_DescripcionMovimiento, Tpmo_IngresaAredante AS Tran_IndAreadante, Tpmo_TipoE_S AS Tran_IndE_S, Tpmo_IngresaCurso AS Tran_IndCurso, Tpmo_SolicitaCentroDestino AS Tran_SolicitaCCDestino, Tpmo_SolicitaRegionDestino AS Tran_SolicitaRegionDestino, Tpmo_CuentaResponsabilidad AS Tran_CuentaResponsabilidad, Tipo_Codigo AS Tran_CodTipoElemento FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000543", "SELECT Tipo_Tipo AS Tran_TipoElemento FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000544", "SELECT Cuen_Nombre AS Tran_NombCuentadanteOrigen, Cuen_Cedula AS Tran_CedulaCuentadanteOrigen, Cuen_Email AS Tran_EmailCuentadanteOrigen FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000545", "SELECT Cuen_Nombre AS Tran_NombreProveedor, Cuen_Cedula AS Tran_CedulaProveedor FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000546", "SELECT Cuen_Nombre AS Tran_NombCuentadanteDestino, Cuen_Cedula AS Tran_CedulaCuentadanteDestino, Cuen_Email AS Tran_EmailCuentadanteDestino FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000547", "SELECT Orig_Descripcion AS Tran_NombreIngreso, Orig_Descripcion_Abreviado AS Tran_Abreviado FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000548", "SELECT Cent_Codigo AS Tran_CentroCostoCodigoDestino, Cent_Descripcion AS Tran_CentroCostoDescripcionDes, Regi_Id AS Tran_RegionIdDestino FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000549", "SELECT Regi_Cod AS Tran_RegionCodigoDestino, Regi_Descripcion AS Tran_RegionDescripcionDestino, Regi_Abrev AS Tran_RegionAbrevDestino FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000550", "SELECT Cuen_Cedula AS Tran_CedulaResponsabilidad, Cuen_Nombre AS Tran_NombreCuentadanteResponsa FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000551", "SELECT * FROM (SELECT Nove_Identificador FROM ALM_NOVEDAD WHERE Nove_TransId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000552", "SELECT * FROM (SELECT Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea FROM ALM_INV_CON WHERE Trans_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000553", "SELECT * FROM (SELECT Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000554", "SELECT /*+ FIRST_ROWS(100) */ Tran_Id FROM ALM_TRANSACCION ORDER BY Tran_Id ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000555", "SELECT T1.Tran_Id, T2.Docu_Descripcion AS Tran_Descrip_Documento, T2.Docu_Prefijo AS Tran_Prefijo_Documento, T1.Tran_Archivo, T1.Tran_Ruta_Archivo, T1.Tran_Nro_Documento AS Tran_Nro_Documento FROM (ALM_TRANSACCION_DOCUM T1 INNER JOIN ALM_DOCUMENTOS T2 ON T2.Docu_Nro = T1.Tran_Nro_Documento) WHERE T1.Tran_Id = ? and T1.Tran_Nro_Documento = ? ORDER BY T1.Tran_Id, T1.Tran_Nro_Documento ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000556", "SELECT Docu_Descripcion AS Tran_Descrip_Documento, Docu_Prefijo AS Tran_Prefijo_Documento FROM ALM_DOCUMENTOS WHERE Docu_Nro = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000557", "SELECT Tran_Id, Tran_Nro_Documento FROM ALM_TRANSACCION_DOCUM WHERE Tran_Id = ? AND Tran_Nro_Documento = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new BlobUpdateCursor("T000558", "BEGIN INSERT INTO ALM_TRANSACCION_DOCUM(Tran_Id, Tran_Archivo, Tran_Ruta_Archivo, Tran_Nro_Documento) VALUES(?, '0', ?, ?)  RETURNING ROWID INTO ?; END;",
         "SELECT Tran_Archivo FROM ALM_TRANSACCION_DOCUM WHERE ROWID = ? FOR UPDATE", "ins", 3, GX_NOMASK, "ALM_TRANSACCION_DOCUM")
         ,new UpdateCursor("T000559", "UPDATE ALM_TRANSACCION_DOCUM SET Tran_Ruta_Archivo=?  WHERE Tran_Id = ? AND Tran_Nro_Documento = ?", GX_NOMASK, "ALM_TRANSACCION_DOCUM")
         ,new BlobUpdateCursor("T000560", "UPDATE ALM_TRANSACCION_DOCUM SET Tran_Archivo='0'  WHERE Tran_Id = ? AND Tran_Nro_Documento = ?",
         "SELECT Tran_Archivo FROM ALM_TRANSACCION_DOCUM WHERE Tran_Id = ? AND Tran_Nro_Documento = ? FOR UPDATE", "upd", 2, GX_NOMASK, "ALM_TRANSACCION_DOCUM")
         ,new UpdateCursor("T000561", "DELETE FROM ALM_TRANSACCION_DOCUM  WHERE Tran_Id = ? AND Tran_Nro_Documento = ?", GX_NOMASK, "ALM_TRANSACCION_DOCUM")
         ,new ForEachCursor("T000562", "SELECT Docu_Descripcion AS Tran_Descrip_Documento, Docu_Prefijo AS Tran_Prefijo_Documento FROM ALM_DOCUMENTOS WHERE Docu_Nro = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000563", "SELECT Tran_Id, Tran_Nro_Documento FROM ALM_TRANSACCION_DOCUM WHERE Tran_Id = ? ORDER BY Tran_Id, Tran_Nro_Documento ",true, GX_NOMASK, false, this,11,0,false )
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
               ((String[]) buf[1])[0] = rslt.getBLOBFile(2, "tmp", "") ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getBLOBFile(2, "tmp", "") ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[4])[0] = rslt.getString(4, 1) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(17) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 30) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(19) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(20, 1) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(21, 4) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(22) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(23) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(25) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((long[]) buf[44])[0] = rslt.getLong(27) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDate(28) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(29) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((long[]) buf[52])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((long[]) buf[54])[0] = rslt.getLong(32) ;
               ((long[]) buf[55])[0] = rslt.getLong(33) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(34) ;
               ((long[]) buf[58])[0] = rslt.getLong(35) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((long[]) buf[60])[0] = rslt.getLong(36) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((long[]) buf[62])[0] = rslt.getLong(37) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((long[]) buf[64])[0] = rslt.getLong(38) ;
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((long[]) buf[66])[0] = rslt.getLong(39) ;
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((long[]) buf[68])[0] = rslt.getLong(40) ;
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(42, 1) ;
               ((long[]) buf[73])[0] = rslt.getLong(43) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[4])[0] = rslt.getString(4, 1) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(17) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 30) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(19) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(20, 1) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(21, 4) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(22) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(23) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(25) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((long[]) buf[44])[0] = rslt.getLong(27) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDate(28) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(29) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((long[]) buf[52])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((long[]) buf[54])[0] = rslt.getLong(32) ;
               ((long[]) buf[55])[0] = rslt.getLong(33) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(34) ;
               ((long[]) buf[58])[0] = rslt.getLong(35) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((long[]) buf[60])[0] = rslt.getLong(36) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((long[]) buf[62])[0] = rslt.getLong(37) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((long[]) buf[64])[0] = rslt.getLong(38) ;
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((long[]) buf[66])[0] = rslt.getLong(39) ;
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((long[]) buf[68])[0] = rslt.getLong(40) ;
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(42, 1) ;
               ((long[]) buf[73])[0] = rslt.getLong(43) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[4])[0] = rslt.getString(4, 1) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 1) ;
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((String[]) buf[39])[0] = rslt.getVarchar(23) ;
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((long[]) buf[42])[0] = rslt.getLong(25) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((long[]) buf[48])[0] = rslt.getLong(28) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(29) ;
               ((String[]) buf[51])[0] = rslt.getVarchar(30) ;
               ((String[]) buf[52])[0] = rslt.getVarchar(31) ;
               ((String[]) buf[53])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(33) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(37,2) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((long[]) buf[65])[0] = rslt.getLong(38) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[67])[0] = rslt.getGXDateTime(39) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(40) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((long[]) buf[71])[0] = rslt.getLong(41) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(43) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(44, 30) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[79])[0] = rslt.getGXDate(45) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(47) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((long[]) buf[85])[0] = rslt.getLong(48) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((short[]) buf[87])[0] = rslt.getShort(49) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(50) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getVarchar(51) ;
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(52, 1) ;
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(53, 4) ;
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((int[]) buf[97])[0] = rslt.getInt(54) ;
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((short[]) buf[99])[0] = rslt.getShort(55) ;
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getVarchar(56) ;
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[103])[0] = rslt.getGXDateTime(57) ;
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getVarchar(58) ;
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((long[]) buf[107])[0] = rslt.getLong(59) ;
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getVarchar(60) ;
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((long[]) buf[111])[0] = rslt.getLong(61) ;
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[113])[0] = rslt.getGXDate(62) ;
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((short[]) buf[115])[0] = rslt.getShort(63) ;
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((String[]) buf[117])[0] = rslt.getVarchar(64) ;
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((long[]) buf[119])[0] = rslt.getLong(65) ;
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((long[]) buf[121])[0] = rslt.getLong(66) ;
               ((long[]) buf[122])[0] = rslt.getLong(67) ;
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getVarchar(68) ;
               ((long[]) buf[125])[0] = rslt.getLong(69) ;
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((long[]) buf[127])[0] = rslt.getLong(70) ;
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((long[]) buf[129])[0] = rslt.getLong(71) ;
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((long[]) buf[131])[0] = rslt.getLong(72) ;
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((long[]) buf[133])[0] = rslt.getLong(73) ;
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((long[]) buf[135])[0] = rslt.getLong(74) ;
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 20 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 28 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 29 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 31 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 32 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 34 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 39 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 47 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 48 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 49 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 50 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               return;
            case 51 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 52 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 53 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getBLOBFile(4, "tmp", "") ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6) ;
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 55 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 61 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 19 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 28 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 31 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 32 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[7]).longValue());
               }
               stmt.setDateTime(5, (java.util.Date)parms[8], false);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 1);
               }
               stmt.setVarchar(7, (String)parms[11], 8, false);
               stmt.setVarchar(8, (String)parms[12], 2, false);
               stmt.setVarchar(9, (String)parms[13], 3, false);
               stmt.setVarchar(10, (String)parms[14], 8, false);
               stmt.setVarchar(11, (String)parms[15], 2, false);
               stmt.setVarchar(12, (String)parms[16], 3, false);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(13, (String)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[20], 20);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[22], 41);
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
                  stmt.setBigDecimal(17, ((Number) parms[26]).longValue(), 0);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[28], false);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[30], 30);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(20, ((Number) parms[32]).longValue(), 0);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[34], 30);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(22, (java.util.Date)parms[36]);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[38], 1);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[40], 4);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[44]).shortValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[46], 30);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(28, (java.util.Date)parms[48], false);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[50], 300);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(30, ((Number) parms[52]).longValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(31, (java.util.Date)parms[54]);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[56]).shortValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[58], 2);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(34, ((Number) parms[60]).longValue(), 0);
               }
               stmt.setLong(35, ((Number) parms[61]).longValue());
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(36, ((Number) parms[63]).longValue());
               }
               stmt.setVarchar(37, (String)parms[64], 3, false);
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(38, ((Number) parms[66]).longValue(), 0);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(39, ((Number) parms[68]).longValue(), 0);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(40, ((Number) parms[70]).longValue(), 0);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(41, ((Number) parms[72]).longValue(), 0);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(42, ((Number) parms[74]).longValue());
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[7]).longValue());
               }
               stmt.setDateTime(5, (java.util.Date)parms[8], false);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 1);
               }
               stmt.setVarchar(7, (String)parms[11], 8, false);
               stmt.setVarchar(8, (String)parms[12], 2, false);
               stmt.setVarchar(9, (String)parms[13], 3, false);
               stmt.setVarchar(10, (String)parms[14], 8, false);
               stmt.setVarchar(11, (String)parms[15], 2, false);
               stmt.setVarchar(12, (String)parms[16], 3, false);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(13, (String)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[20], 20);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[22], 41);
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
                  stmt.setBigDecimal(17, ((Number) parms[26]).longValue(), 0);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[28], false);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[30], 30);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(20, ((Number) parms[32]).longValue(), 0);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[34], 30);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(22, (java.util.Date)parms[36]);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[38], 1);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[40], 4);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[44]).shortValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[46], 30);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(28, (java.util.Date)parms[48], false);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[50], 300);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(30, ((Number) parms[52]).longValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDate(31, (java.util.Date)parms[54]);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[56]).shortValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[58], 2);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(34, ((Number) parms[60]).longValue(), 0);
               }
               stmt.setLong(35, ((Number) parms[61]).longValue());
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(36, ((Number) parms[63]).longValue());
               }
               stmt.setVarchar(37, (String)parms[64], 3, false);
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(38, ((Number) parms[66]).longValue(), 0);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(39, ((Number) parms[68]).longValue(), 0);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(40, ((Number) parms[70]).longValue(), 0);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(41, ((Number) parms[72]).longValue(), 0);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(42, ((Number) parms[74]).longValue());
               }
               stmt.setLong(43, ((Number) parms[75]).longValue());
               return;
            case 36 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 38 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 40 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 41 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 43 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 44 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 45 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 46 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 47 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 48 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 49 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 50 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 51 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 53 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 54 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 55 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 56 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBLOBFile(1, ((Boolean) parms[1]).booleanValue() ? null : (String)parms[2]);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[4], 200);
               }
               stmt.setShort(3, ((Number) parms[5]).shortValue());
               return;
            case 57 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 200);
               }
               stmt.setLong(2, ((Number) parms[2]).longValue());
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 58 :
               stmt.setBLOBFile(1, ((Boolean) parms[0]).booleanValue() ? null : (String)parms[1]);
               stmt.setLong(1, ((Number) parms[2]).longValue());
               stmt.setShort(2, ((Number) parms[3]).shortValue());
               return;
            case 59 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 61 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 65594 :
               stmt.setLong(1, ((Number) parms[2]).longValue());
               stmt.setShort(2, ((Number) parms[3]).shortValue());
               break;
      }
   }

}

