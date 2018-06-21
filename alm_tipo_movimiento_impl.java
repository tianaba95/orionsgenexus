/*
               File: alm_tipo_movimiento_impl
        Description: Tipo de movimiento
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:16:28.13
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

public final  class alm_tipo_movimiento_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A33Tipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A33Tipo_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A39Tpmo_AlmacenOrigenId = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A39Tpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( A39Tpmo_AlmacenOrigenId, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A39Tpmo_AlmacenOrigenId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A40Tpmo_AlmacenDestinoId = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A40Tpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( A40Tpmo_AlmacenDestinoId, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A40Tpmo_AlmacenDestinoId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A41Orig_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A41Orig_Identificador) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A819Docu_Nro = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A819Docu_Nro) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridalm_tipo_movimiento_tipo_movimiento_origen") == 0 )
      {
         nRC_GXsfl_113 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_113_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_113_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridalm_tipo_movimiento_tipo_movimiento_origen_newrow( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridalm_tipo_movimiento_documento") == 0 )
      {
         nRC_GXsfl_127 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_127_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_127_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridalm_tipo_movimiento_documento_newrow( ) ;
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
            AV15Tpmo_Codigo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Tpmo_Codigo", AV15Tpmo_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Tpmo_Codigo, ""))));
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
      cmbTipo_Tipo.setName( "TIPO_TIPO" );
      cmbTipo_Tipo.setWebtags( "" );
      cmbTipo_Tipo.addItem("C", "Consumo", (short)(0));
      cmbTipo_Tipo.addItem("D", "Devolutivo", (short)(0));
      if ( cmbTipo_Tipo.getItemCount() > 0 )
      {
         A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
      }
      cmbTpmo_TipoE_S.setName( "TPMO_TIPOE_S" );
      cmbTpmo_TipoE_S.setWebtags( "" );
      cmbTpmo_TipoE_S.addItem("E", "ENTRADA", (short)(0));
      cmbTpmo_TipoE_S.addItem("S", "SALIDA", (short)(0));
      cmbTpmo_TipoE_S.addItem("T", "TRASPASO", (short)(0));
      cmbTpmo_TipoE_S.addItem("R", "RECUPERACIÓN", (short)(0));
      if ( cmbTpmo_TipoE_S.getItemCount() > 0 )
      {
         A315Tpmo_TipoE_S = cmbTpmo_TipoE_S.getValidValue(A315Tpmo_TipoE_S) ;
         httpContext.ajax_rsp_assign_attri("", false, "A315Tpmo_TipoE_S", A315Tpmo_TipoE_S);
      }
      cmbTpmo_Modulo.setName( "TPMO_MODULO" );
      cmbTpmo_Modulo.setWebtags( "" );
      cmbTpmo_Modulo.addItem("", "", (short)(0));
      cmbTpmo_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
      cmbTpmo_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
      cmbTpmo_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
      if ( cmbTpmo_Modulo.getItemCount() > 0 )
      {
         A316Tpmo_Modulo = cmbTpmo_Modulo.getValidValue(A316Tpmo_Modulo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A316Tpmo_Modulo", A316Tpmo_Modulo);
      }
      cmbTpmo_IngresaAredante.setName( "TPMO_INGRESAAREDANTE" );
      cmbTpmo_IngresaAredante.setWebtags( "" );
      cmbTpmo_IngresaAredante.addItem("", "", (short)(0));
      cmbTpmo_IngresaAredante.addItem("SI", "SI", (short)(0));
      cmbTpmo_IngresaAredante.addItem("NO", "NO", (short)(0));
      if ( cmbTpmo_IngresaAredante.getItemCount() > 0 )
      {
         A440Tpmo_IngresaAredante = cmbTpmo_IngresaAredante.getValidValue(A440Tpmo_IngresaAredante) ;
         httpContext.ajax_rsp_assign_attri("", false, "A440Tpmo_IngresaAredante", A440Tpmo_IngresaAredante);
      }
      cmbTpmo_IngresaCurso.setName( "TPMO_INGRESACURSO" );
      cmbTpmo_IngresaCurso.setWebtags( "" );
      cmbTpmo_IngresaCurso.addItem("", "", (short)(0));
      cmbTpmo_IngresaCurso.addItem("SI", "SI", (short)(0));
      cmbTpmo_IngresaCurso.addItem("NO", "NO", (short)(0));
      if ( cmbTpmo_IngresaCurso.getItemCount() > 0 )
      {
         A441Tpmo_IngresaCurso = cmbTpmo_IngresaCurso.getValidValue(A441Tpmo_IngresaCurso) ;
         httpContext.ajax_rsp_assign_attri("", false, "A441Tpmo_IngresaCurso", A441Tpmo_IngresaCurso);
      }
      cmbTpmo_Controlado.setName( "TPMO_CONTROLADO" );
      cmbTpmo_Controlado.setWebtags( "" );
      cmbTpmo_Controlado.addItem("", "", (short)(0));
      cmbTpmo_Controlado.addItem("SI", "SI", (short)(0));
      cmbTpmo_Controlado.addItem("NO", "NO", (short)(0));
      if ( cmbTpmo_Controlado.getItemCount() > 0 )
      {
         A633Tpmo_Controlado = cmbTpmo_Controlado.getValidValue(A633Tpmo_Controlado) ;
         n633Tpmo_Controlado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A633Tpmo_Controlado", A633Tpmo_Controlado);
      }
      cmbTpmo_VidaUtil.setName( "TPMO_VIDAUTIL" );
      cmbTpmo_VidaUtil.setWebtags( "" );
      cmbTpmo_VidaUtil.addItem("", "", (short)(0));
      cmbTpmo_VidaUtil.addItem("SI", "SI", (short)(0));
      cmbTpmo_VidaUtil.addItem("NO", "NO", (short)(0));
      if ( cmbTpmo_VidaUtil.getItemCount() > 0 )
      {
         A641Tpmo_VidaUtil = cmbTpmo_VidaUtil.getValidValue(A641Tpmo_VidaUtil) ;
         n641Tpmo_VidaUtil = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A641Tpmo_VidaUtil", A641Tpmo_VidaUtil);
      }
      cmbTpmo_CuentaResponsabilidad.setName( "TPMO_CUENTARESPONSABILIDAD" );
      cmbTpmo_CuentaResponsabilidad.setWebtags( "" );
      cmbTpmo_CuentaResponsabilidad.addItem("", "", (short)(0));
      cmbTpmo_CuentaResponsabilidad.addItem("SI", "SI", (short)(0));
      cmbTpmo_CuentaResponsabilidad.addItem("NO", "NO", (short)(0));
      if ( cmbTpmo_CuentaResponsabilidad.getItemCount() > 0 )
      {
         A680Tpmo_CuentaResponsabilidad = cmbTpmo_CuentaResponsabilidad.getValidValue(A680Tpmo_CuentaResponsabilidad) ;
         n680Tpmo_CuentaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A680Tpmo_CuentaResponsabilidad", A680Tpmo_CuentaResponsabilidad);
      }
      cmbTpmo_SolicitaRegionDestino.setName( "TPMO_SOLICITAREGIONDESTINO" );
      cmbTpmo_SolicitaRegionDestino.setWebtags( "" );
      cmbTpmo_SolicitaRegionDestino.addItem("", "", (short)(0));
      cmbTpmo_SolicitaRegionDestino.addItem("SI", "SI", (short)(0));
      cmbTpmo_SolicitaRegionDestino.addItem("NO", "NO", (short)(0));
      if ( cmbTpmo_SolicitaRegionDestino.getItemCount() > 0 )
      {
         A705Tpmo_SolicitaRegionDestino = cmbTpmo_SolicitaRegionDestino.getValidValue(A705Tpmo_SolicitaRegionDestino) ;
         n705Tpmo_SolicitaRegionDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A705Tpmo_SolicitaRegionDestino", A705Tpmo_SolicitaRegionDestino);
      }
      cmbTpmo_SolicitaCentroDestino.setName( "TPMO_SOLICITACENTRODESTINO" );
      cmbTpmo_SolicitaCentroDestino.setWebtags( "" );
      cmbTpmo_SolicitaCentroDestino.addItem("", "", (short)(0));
      cmbTpmo_SolicitaCentroDestino.addItem("SI", "SI", (short)(0));
      cmbTpmo_SolicitaCentroDestino.addItem("NO", "NO", (short)(0));
      if ( cmbTpmo_SolicitaCentroDestino.getItemCount() > 0 )
      {
         A706Tpmo_SolicitaCentroDestino = cmbTpmo_SolicitaCentroDestino.getValidValue(A706Tpmo_SolicitaCentroDestino) ;
         n706Tpmo_SolicitaCentroDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A706Tpmo_SolicitaCentroDestino", A706Tpmo_SolicitaCentroDestino);
      }
      cmbTpmo_ImprimeOrigen.setName( "TPMO_IMPRIMEORIGEN" );
      cmbTpmo_ImprimeOrigen.setWebtags( "" );
      cmbTpmo_ImprimeOrigen.addItem("", "", (short)(0));
      cmbTpmo_ImprimeOrigen.addItem("SI", "SI", (short)(0));
      cmbTpmo_ImprimeOrigen.addItem("NO", "NO", (short)(0));
      if ( cmbTpmo_ImprimeOrigen.getItemCount() > 0 )
      {
         A716Tpmo_ImprimeOrigen = cmbTpmo_ImprimeOrigen.getValidValue(A716Tpmo_ImprimeOrigen) ;
         n716Tpmo_ImprimeOrigen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A716Tpmo_ImprimeOrigen", A716Tpmo_ImprimeOrigen);
      }
      cmbTpmo_ImprimeDestino.setName( "TPMO_IMPRIMEDESTINO" );
      cmbTpmo_ImprimeDestino.setWebtags( "" );
      cmbTpmo_ImprimeDestino.addItem("", "", (short)(0));
      cmbTpmo_ImprimeDestino.addItem("SI", "SI", (short)(0));
      cmbTpmo_ImprimeDestino.addItem("NO", "NO", (short)(0));
      if ( cmbTpmo_ImprimeDestino.getItemCount() > 0 )
      {
         A717Tpmo_ImprimeDestino = cmbTpmo_ImprimeDestino.getValidValue(A717Tpmo_ImprimeDestino) ;
         n717Tpmo_ImprimeDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A717Tpmo_ImprimeDestino", A717Tpmo_ImprimeDestino);
      }
      cmbTmpo_ImprimeResponsable.setName( "TMPO_IMPRIMERESPONSABLE" );
      cmbTmpo_ImprimeResponsable.setWebtags( "" );
      cmbTmpo_ImprimeResponsable.addItem("", "", (short)(0));
      cmbTmpo_ImprimeResponsable.addItem("SI", "SI", (short)(0));
      cmbTmpo_ImprimeResponsable.addItem("NO", "NO", (short)(0));
      if ( cmbTmpo_ImprimeResponsable.getItemCount() > 0 )
      {
         A718Tmpo_ImprimeResponsable = cmbTmpo_ImprimeResponsable.getValidValue(A718Tmpo_ImprimeResponsable) ;
         n718Tmpo_ImprimeResponsable = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A718Tmpo_ImprimeResponsable", A718Tmpo_ImprimeResponsable);
      }
      cmbTpmo_Estado.setName( "TPMO_ESTADO" );
      cmbTpmo_Estado.setWebtags( "" );
      cmbTpmo_Estado.addItem("A", "Activo", (short)(0));
      cmbTpmo_Estado.addItem("I", "Inactivo", (short)(0));
      if ( cmbTpmo_Estado.getItemCount() > 0 )
      {
         A679Tpmo_Estado = cmbTpmo_Estado.getValidValue(A679Tpmo_Estado) ;
         n679Tpmo_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A679Tpmo_Estado", A679Tpmo_Estado);
      }
      GXCCtl = "TPMO_SOLICITANUMERO_" + sGXsfl_113_idx ;
      cmbTpmo_SolicitaNumero.setName( GXCCtl );
      cmbTpmo_SolicitaNumero.setWebtags( "" );
      cmbTpmo_SolicitaNumero.addItem("", "", (short)(0));
      cmbTpmo_SolicitaNumero.addItem("SI", "SI", (short)(0));
      cmbTpmo_SolicitaNumero.addItem("NO", "NO", (short)(0));
      if ( cmbTpmo_SolicitaNumero.getItemCount() > 0 )
      {
         A642Tpmo_SolicitaNumero = cmbTpmo_SolicitaNumero.getValidValue(A642Tpmo_SolicitaNumero) ;
      }
      GXCCtl = "TPMO_SOLICITAFECHA_" + sGXsfl_113_idx ;
      cmbTpmo_SolicitaFecha.setName( GXCCtl );
      cmbTpmo_SolicitaFecha.setWebtags( "" );
      cmbTpmo_SolicitaFecha.addItem("", "", (short)(0));
      cmbTpmo_SolicitaFecha.addItem("SI", "SI", (short)(0));
      cmbTpmo_SolicitaFecha.addItem("NO", "NO", (short)(0));
      if ( cmbTpmo_SolicitaFecha.getItemCount() > 0 )
      {
         A643Tpmo_SolicitaFecha = cmbTpmo_SolicitaFecha.getValidValue(A643Tpmo_SolicitaFecha) ;
      }
      GXCCtl = "TPMO_ESTADOORIGEN_" + sGXsfl_113_idx ;
      cmbTpmo_EstadoOrigen.setName( GXCCtl );
      cmbTpmo_EstadoOrigen.setWebtags( "" );
      cmbTpmo_EstadoOrigen.addItem("A", "Activo", (short)(0));
      cmbTpmo_EstadoOrigen.addItem("I", "Inactivo", (short)(0));
      if ( cmbTpmo_EstadoOrigen.getItemCount() > 0 )
      {
         A681Tpmo_EstadoOrigen = cmbTpmo_EstadoOrigen.getValidValue(A681Tpmo_EstadoOrigen) ;
         n681Tpmo_EstadoOrigen = false ;
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
         Form.getMeta().addItem("description", "Tipo de movimiento", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTpmo_Codigo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_tipo_movimiento_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_tipo_movimiento_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_tipo_movimiento_impl.class ));
   }

   public alm_tipo_movimiento_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbTipo_Tipo = new HTMLChoice();
      cmbTpmo_TipoE_S = new HTMLChoice();
      cmbTpmo_Modulo = new HTMLChoice();
      cmbTpmo_IngresaAredante = new HTMLChoice();
      cmbTpmo_IngresaCurso = new HTMLChoice();
      cmbTpmo_Controlado = new HTMLChoice();
      cmbTpmo_VidaUtil = new HTMLChoice();
      cmbTpmo_CuentaResponsabilidad = new HTMLChoice();
      cmbTpmo_SolicitaRegionDestino = new HTMLChoice();
      cmbTpmo_SolicitaCentroDestino = new HTMLChoice();
      cmbTpmo_ImprimeOrigen = new HTMLChoice();
      cmbTpmo_ImprimeDestino = new HTMLChoice();
      cmbTmpo_ImprimeResponsable = new HTMLChoice();
      cmbTpmo_Estado = new HTMLChoice();
      cmbTpmo_SolicitaNumero = new HTMLChoice();
      cmbTpmo_SolicitaFecha = new HTMLChoice();
      cmbTpmo_EstadoOrigen = new HTMLChoice();
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
      if ( cmbTipo_Tipo.getItemCount() > 0 )
      {
         A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
      }
      if ( cmbTpmo_TipoE_S.getItemCount() > 0 )
      {
         A315Tpmo_TipoE_S = cmbTpmo_TipoE_S.getValidValue(A315Tpmo_TipoE_S) ;
         httpContext.ajax_rsp_assign_attri("", false, "A315Tpmo_TipoE_S", A315Tpmo_TipoE_S);
      }
      if ( cmbTpmo_Modulo.getItemCount() > 0 )
      {
         A316Tpmo_Modulo = cmbTpmo_Modulo.getValidValue(A316Tpmo_Modulo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A316Tpmo_Modulo", A316Tpmo_Modulo);
      }
      if ( cmbTpmo_IngresaAredante.getItemCount() > 0 )
      {
         A440Tpmo_IngresaAredante = cmbTpmo_IngresaAredante.getValidValue(A440Tpmo_IngresaAredante) ;
         httpContext.ajax_rsp_assign_attri("", false, "A440Tpmo_IngresaAredante", A440Tpmo_IngresaAredante);
      }
      if ( cmbTpmo_IngresaCurso.getItemCount() > 0 )
      {
         A441Tpmo_IngresaCurso = cmbTpmo_IngresaCurso.getValidValue(A441Tpmo_IngresaCurso) ;
         httpContext.ajax_rsp_assign_attri("", false, "A441Tpmo_IngresaCurso", A441Tpmo_IngresaCurso);
      }
      if ( cmbTpmo_Controlado.getItemCount() > 0 )
      {
         A633Tpmo_Controlado = cmbTpmo_Controlado.getValidValue(A633Tpmo_Controlado) ;
         n633Tpmo_Controlado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A633Tpmo_Controlado", A633Tpmo_Controlado);
      }
      if ( cmbTpmo_VidaUtil.getItemCount() > 0 )
      {
         A641Tpmo_VidaUtil = cmbTpmo_VidaUtil.getValidValue(A641Tpmo_VidaUtil) ;
         n641Tpmo_VidaUtil = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A641Tpmo_VidaUtil", A641Tpmo_VidaUtil);
      }
      if ( cmbTpmo_CuentaResponsabilidad.getItemCount() > 0 )
      {
         A680Tpmo_CuentaResponsabilidad = cmbTpmo_CuentaResponsabilidad.getValidValue(A680Tpmo_CuentaResponsabilidad) ;
         n680Tpmo_CuentaResponsabilidad = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A680Tpmo_CuentaResponsabilidad", A680Tpmo_CuentaResponsabilidad);
      }
      if ( cmbTpmo_SolicitaRegionDestino.getItemCount() > 0 )
      {
         A705Tpmo_SolicitaRegionDestino = cmbTpmo_SolicitaRegionDestino.getValidValue(A705Tpmo_SolicitaRegionDestino) ;
         n705Tpmo_SolicitaRegionDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A705Tpmo_SolicitaRegionDestino", A705Tpmo_SolicitaRegionDestino);
      }
      if ( cmbTpmo_SolicitaCentroDestino.getItemCount() > 0 )
      {
         A706Tpmo_SolicitaCentroDestino = cmbTpmo_SolicitaCentroDestino.getValidValue(A706Tpmo_SolicitaCentroDestino) ;
         n706Tpmo_SolicitaCentroDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A706Tpmo_SolicitaCentroDestino", A706Tpmo_SolicitaCentroDestino);
      }
      if ( cmbTpmo_ImprimeOrigen.getItemCount() > 0 )
      {
         A716Tpmo_ImprimeOrigen = cmbTpmo_ImprimeOrigen.getValidValue(A716Tpmo_ImprimeOrigen) ;
         n716Tpmo_ImprimeOrigen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A716Tpmo_ImprimeOrigen", A716Tpmo_ImprimeOrigen);
      }
      if ( cmbTpmo_ImprimeDestino.getItemCount() > 0 )
      {
         A717Tpmo_ImprimeDestino = cmbTpmo_ImprimeDestino.getValidValue(A717Tpmo_ImprimeDestino) ;
         n717Tpmo_ImprimeDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A717Tpmo_ImprimeDestino", A717Tpmo_ImprimeDestino);
      }
      if ( cmbTmpo_ImprimeResponsable.getItemCount() > 0 )
      {
         A718Tmpo_ImprimeResponsable = cmbTmpo_ImprimeResponsable.getValidValue(A718Tmpo_ImprimeResponsable) ;
         n718Tmpo_ImprimeResponsable = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A718Tmpo_ImprimeResponsable", A718Tmpo_ImprimeResponsable);
      }
      if ( cmbTpmo_Estado.getItemCount() > 0 )
      {
         A679Tpmo_Estado = cmbTpmo_Estado.getValidValue(A679Tpmo_Estado) ;
         n679Tpmo_Estado = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A679Tpmo_Estado", A679Tpmo_Estado);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Tipo de movimiento", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_TIPO_MOVIMIENTO.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_TIPO_MOVIMIENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_Codigo_Internalname, "Código", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_Codigo_Internalname, A38Tpmo_Codigo, GXutil.rtrim( localUtil.format( A38Tpmo_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpmo_Codigo_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_Descripcion_Internalname, "Tipo de movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_Descripcion_Internalname, A313Tpmo_Descripcion, GXutil.rtrim( localUtil.format( A313Tpmo_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpmo_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTipo_Codigo_Internalname, "Tipo de elemento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Codigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtTipo_Codigo_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_33_Internalname, sImgUrl, imgprompt_33_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_33_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTipo_Descripcion_Internalname, A253Tipo_Descripcion, GXutil.rtrim( localUtil.format( A253Tipo_Descripcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipo_Descripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtTipo_Descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTipo_Tipo.getInternalname(), "Tipo", "col-sm-3 AttributeLabel", 1, true);
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTipo_Tipo, cmbTipo_Tipo.getInternalname(), GXutil.rtrim( A480Tipo_Tipo), 1, cmbTipo_Tipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTipo_Tipo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTipo_Tipo.setValue( GXutil.rtrim( A480Tipo_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTipo_Tipo.getInternalname(), "Values", cmbTipo_Tipo.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_AlmacenOrigenId_Internalname, "Almacén orígen", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_AlmacenOrigenId_Internalname, GXutil.ltrim( localUtil.ntoc( A39Tpmo_AlmacenOrigenId, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A39Tpmo_AlmacenOrigenId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_AlmacenOrigenId_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpmo_AlmacenOrigenId_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_39_Internalname, sImgUrl, imgprompt_39_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_39_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_AlmacenOrigenDescrip_Internalname, A312Tpmo_AlmacenOrigenDescrip, GXutil.rtrim( localUtil.format( A312Tpmo_AlmacenOrigenDescrip, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_AlmacenOrigenDescrip_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpmo_AlmacenOrigenDescrip_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTpmo_AlmacenDestinoId_Internalname, "Almacén destino", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_AlmacenDestinoId_Internalname, GXutil.ltrim( localUtil.ntoc( A40Tpmo_AlmacenDestinoId, (byte)(11), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A40Tpmo_AlmacenDestinoId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_AlmacenDestinoId_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpmo_AlmacenDestinoId_Enabled, 1, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         /* Static images/pictures */
         ClassString = "gx-prompt Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgprompt_40_Internalname, sImgUrl, imgprompt_40_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_40_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtTpmo_AlmacenDestinoDescrip_Internalname, A314Tpmo_AlmacenDestinoDescrip, GXutil.rtrim( localUtil.format( A314Tpmo_AlmacenDestinoDescrip, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTpmo_AlmacenDestinoDescrip_Jsonclick, 0, "Attribute", "", "", "", 1, edtTpmo_AlmacenDestinoDescrip_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_TipoE_S.getInternalname(), "Tipo E/S", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_TipoE_S, cmbTpmo_TipoE_S.getInternalname(), GXutil.rtrim( A315Tpmo_TipoE_S), 1, cmbTpmo_TipoE_S.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_TipoE_S.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTpmo_TipoE_S.setValue( GXutil.rtrim( A315Tpmo_TipoE_S) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_TipoE_S.getInternalname(), "Values", cmbTpmo_TipoE_S.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_Modulo.getInternalname(), "Módulo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_Modulo, cmbTpmo_Modulo.getInternalname(), GXutil.rtrim( A316Tpmo_Modulo), 1, cmbTpmo_Modulo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_Modulo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTpmo_Modulo.setValue( GXutil.rtrim( A316Tpmo_Modulo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_Modulo.getInternalname(), "Values", cmbTpmo_Modulo.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_IngresaAredante.getInternalname(), "Ingresa areadante", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_IngresaAredante, cmbTpmo_IngresaAredante.getInternalname(), GXutil.rtrim( A440Tpmo_IngresaAredante), 1, cmbTpmo_IngresaAredante.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_IngresaAredante.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTpmo_IngresaAredante.setValue( GXutil.rtrim( A440Tpmo_IngresaAredante) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_IngresaAredante.getInternalname(), "Values", cmbTpmo_IngresaAredante.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_IngresaCurso.getInternalname(), "Ingresa curso", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_IngresaCurso, cmbTpmo_IngresaCurso.getInternalname(), GXutil.rtrim( A441Tpmo_IngresaCurso), 1, cmbTpmo_IngresaCurso.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_IngresaCurso.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTpmo_IngresaCurso.setValue( GXutil.rtrim( A441Tpmo_IngresaCurso) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_IngresaCurso.getInternalname(), "Values", cmbTpmo_IngresaCurso.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_Controlado.getInternalname(), "Bienes en administración", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_Controlado, cmbTpmo_Controlado.getInternalname(), GXutil.rtrim( A633Tpmo_Controlado), 1, cmbTpmo_Controlado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_Controlado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTpmo_Controlado.setValue( GXutil.rtrim( A633Tpmo_Controlado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_Controlado.getInternalname(), "Values", cmbTpmo_Controlado.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_VidaUtil.getInternalname(), "Solicita vida útil", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_VidaUtil, cmbTpmo_VidaUtil.getInternalname(), GXutil.rtrim( A641Tpmo_VidaUtil), 1, cmbTpmo_VidaUtil.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_VidaUtil.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTpmo_VidaUtil.setValue( GXutil.rtrim( A641Tpmo_VidaUtil) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_VidaUtil.getInternalname(), "Values", cmbTpmo_VidaUtil.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_CuentaResponsabilidad.getInternalname(), "Cuenta de responsabilidad", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_CuentaResponsabilidad, cmbTpmo_CuentaResponsabilidad.getInternalname(), GXutil.rtrim( A680Tpmo_CuentaResponsabilidad), 1, cmbTpmo_CuentaResponsabilidad.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_CuentaResponsabilidad.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTpmo_CuentaResponsabilidad.setValue( GXutil.rtrim( A680Tpmo_CuentaResponsabilidad) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_CuentaResponsabilidad.getInternalname(), "Values", cmbTpmo_CuentaResponsabilidad.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_SolicitaRegionDestino.getInternalname(), "Solicita región destino", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_SolicitaRegionDestino, cmbTpmo_SolicitaRegionDestino.getInternalname(), GXutil.rtrim( A705Tpmo_SolicitaRegionDestino), 1, cmbTpmo_SolicitaRegionDestino.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_SolicitaRegionDestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTpmo_SolicitaRegionDestino.setValue( GXutil.rtrim( A705Tpmo_SolicitaRegionDestino) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_SolicitaRegionDestino.getInternalname(), "Values", cmbTpmo_SolicitaRegionDestino.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_SolicitaCentroDestino.getInternalname(), "Solicita centro destino", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_SolicitaCentroDestino, cmbTpmo_SolicitaCentroDestino.getInternalname(), GXutil.rtrim( A706Tpmo_SolicitaCentroDestino), 1, cmbTpmo_SolicitaCentroDestino.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_SolicitaCentroDestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTpmo_SolicitaCentroDestino.setValue( GXutil.rtrim( A706Tpmo_SolicitaCentroDestino) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_SolicitaCentroDestino.getInternalname(), "Values", cmbTpmo_SolicitaCentroDestino.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_ImprimeOrigen.getInternalname(), "Imprime orígen", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_ImprimeOrigen, cmbTpmo_ImprimeOrigen.getInternalname(), GXutil.rtrim( A716Tpmo_ImprimeOrigen), 1, cmbTpmo_ImprimeOrigen.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_ImprimeOrigen.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTpmo_ImprimeOrigen.setValue( GXutil.rtrim( A716Tpmo_ImprimeOrigen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_ImprimeOrigen.getInternalname(), "Values", cmbTpmo_ImprimeOrigen.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_ImprimeDestino.getInternalname(), "Imprime destino", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_ImprimeDestino, cmbTpmo_ImprimeDestino.getInternalname(), GXutil.rtrim( A717Tpmo_ImprimeDestino), 1, cmbTpmo_ImprimeDestino.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTpmo_ImprimeDestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTpmo_ImprimeDestino.setValue( GXutil.rtrim( A717Tpmo_ImprimeDestino) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_ImprimeDestino.getInternalname(), "Values", cmbTpmo_ImprimeDestino.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTmpo_ImprimeResponsable.getInternalname(), "Imprime responsable", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTmpo_ImprimeResponsable, cmbTmpo_ImprimeResponsable.getInternalname(), GXutil.rtrim( A718Tmpo_ImprimeResponsable), 1, cmbTmpo_ImprimeResponsable.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbTmpo_ImprimeResponsable.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTmpo_ImprimeResponsable.setValue( GXutil.rtrim( A718Tmpo_ImprimeResponsable) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTmpo_ImprimeResponsable.getInternalname(), "Values", cmbTmpo_ImprimeResponsable.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbTpmo_Estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbTpmo_Estado, cmbTpmo_Estado.getInternalname(), GXutil.rtrim( A679Tpmo_Estado), 1, cmbTpmo_Estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbTpmo_Estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "", true, "HLP_ALM_TIPO_MOVIMIENTO.htm");
         cmbTpmo_Estado.setValue( GXutil.rtrim( A679Tpmo_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_Estado.getInternalname(), "Values", cmbTpmo_Estado.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTipo_movimiento_origentable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletipo_movimiento_origen_Internalname, "ORÍGEN DE LOS BIENES O DESTINACIONES DE LAS BAJAS", "", "", lblTitletipo_movimiento_origen_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridalm_tipo_movimiento_tipo_movimiento_origen( ) ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 col-lg-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divDocumentotable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitledocumento_Internalname, "DOCUMENTOS", "", "", lblTitledocumento_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridalm_tipo_movimiento_documento( ) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_TIPO_MOVIMIENTO.htm");
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

   public void gxdraw_gridalm_tipo_movimiento_tipo_movimiento_origen( )
   {
      /*  Grid Control  */
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("GridName", "Gridalm_tipo_movimiento_tipo_movimiento_origen");
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("Class", "Grid");
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 3, (byte)(4), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_tipo_movimiento_origen_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("CmpContext", "");
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("InMasterPage", "false");
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrig_Identificador_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddColumnProperties(Gridalm_tipo_movimiento_tipo_movimiento_origenColumn);
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddColumnProperties(Gridalm_tipo_movimiento_tipo_movimiento_origenColumn);
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn.AddObjectProperty("Value", A635Orig_Descripcion);
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOrig_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddColumnProperties(Gridalm_tipo_movimiento_tipo_movimiento_origenColumn);
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn.AddObjectProperty("Value", A642Tpmo_SolicitaNumero);
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbTpmo_SolicitaNumero.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddColumnProperties(Gridalm_tipo_movimiento_tipo_movimiento_origenColumn);
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn.AddObjectProperty("Value", A643Tpmo_SolicitaFecha);
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbTpmo_SolicitaFecha.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddColumnProperties(Gridalm_tipo_movimiento_tipo_movimiento_origenColumn);
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn.AddObjectProperty("Value", GXutil.rtrim( A681Tpmo_EstadoOrigen));
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbTpmo_EstadoOrigen.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddColumnProperties(Gridalm_tipo_movimiento_tipo_movimiento_origenColumn);
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_tipo_movimiento_origen_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_tipo_movimiento_origen_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_tipo_movimiento_origen_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_tipo_movimiento_origen_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_tipo_movimiento_origen_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_tipo_movimiento_origen_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_113_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount32 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_32 = (short)(1) ;
            scanStart0V32( ) ;
            while ( RcdFound32 != 0 )
            {
               init_level_properties32( ) ;
               getByPrimaryKey0V32( ) ;
               addRow0V32( ) ;
               scanNext0V32( ) ;
            }
            scanEnd0V32( ) ;
            nBlankRcdCount32 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0V32( ) ;
         standaloneModal0V32( ) ;
         sMode32 = Gx_mode ;
         while ( nGXsfl_113_idx < nRC_GXsfl_113 )
         {
            bGXsfl_113_Refreshing = true ;
            readRow0V32( ) ;
            edtOrig_Identificador_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORIG_IDENTIFICADOR_"+sGXsfl_113_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrig_Identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOrig_Identificador_Enabled, 5, 0)), !bGXsfl_113_Refreshing);
            edtOrig_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORIG_DESCRIPCION_"+sGXsfl_113_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOrig_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOrig_Descripcion_Enabled, 5, 0)), !bGXsfl_113_Refreshing);
            cmbTpmo_SolicitaNumero.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "TPMO_SOLICITANUMERO_"+sGXsfl_113_idx+"Enabled"), ",", ".")) );
            httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_SolicitaNumero.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_SolicitaNumero.getEnabled(), 5, 0)), !bGXsfl_113_Refreshing);
            cmbTpmo_SolicitaFecha.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "TPMO_SOLICITAFECHA_"+sGXsfl_113_idx+"Enabled"), ",", ".")) );
            httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_SolicitaFecha.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_SolicitaFecha.getEnabled(), 5, 0)), !bGXsfl_113_Refreshing);
            cmbTpmo_EstadoOrigen.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "TPMO_ESTADOORIGEN_"+sGXsfl_113_idx+"Enabled"), ",", ".")) );
            httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_EstadoOrigen.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_EstadoOrigen.getEnabled(), 5, 0)), !bGXsfl_113_Refreshing);
            imgprompt_33_Link = httpContext.cgiGet( "PROMPT_41_"+sGXsfl_113_idx+"Link") ;
            if ( ( nRcdExists_32 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal0V32( ) ;
            }
            sendRow0V32( ) ;
            bGXsfl_113_Refreshing = false ;
         }
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount32 = (short)(5) ;
         nRcdExists_32 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0V32( ) ;
            while ( RcdFound32 != 0 )
            {
               sGXsfl_113_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_113_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_11332( ) ;
               init_level_properties32( ) ;
               standaloneNotModal0V32( ) ;
               getByPrimaryKey0V32( ) ;
               standaloneModal0V32( ) ;
               addRow0V32( ) ;
               scanNext0V32( ) ;
            }
            scanEnd0V32( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode32 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_113_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_113_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_11332( ) ;
         initAll0V32( ) ;
         init_level_properties32( ) ;
         standaloneNotModal0V32( ) ;
         standaloneModal0V32( ) ;
         nRcdExists_32 = (short)(0) ;
         nIsMod_32 = (short)(0) ;
         nRcdDeleted_32 = (short)(0) ;
         nBlankRcdCount32 = (short)(nBlankRcdUsr32+nBlankRcdCount32) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount32 > 0 )
         {
            addRow0V32( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtOrig_Identificador_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount32 = (short)(nBlankRcdCount32-1) ;
         }
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridalm_tipo_movimiento_tipo_movimiento_origenContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridalm_tipo_movimiento_tipo_movimiento_origen", Gridalm_tipo_movimiento_tipo_movimiento_origenContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_tipo_movimiento_tipo_movimiento_origenContainerData", Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_tipo_movimiento_tipo_movimiento_origenContainerData"+"V", Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridalm_tipo_movimiento_tipo_movimiento_origenContainerData"+"V"+"\" value='"+Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridalm_tipo_movimiento_documento( )
   {
      /*  Grid Control  */
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("GridName", "Gridalm_tipo_movimiento_documento");
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("Class", "Grid");
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_documento_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("CmpContext", "");
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("InMasterPage", "false");
      Gridalm_tipo_movimiento_documentoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_movimiento_documentoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A819Docu_Nro, (byte)(4), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_documentoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDocu_Nro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_documentoContainer.AddColumnProperties(Gridalm_tipo_movimiento_documentoColumn);
      Gridalm_tipo_movimiento_documentoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_movimiento_documentoContainer.AddColumnProperties(Gridalm_tipo_movimiento_documentoColumn);
      Gridalm_tipo_movimiento_documentoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_movimiento_documentoColumn.AddObjectProperty("Value", A820Docu_Descripcion);
      Gridalm_tipo_movimiento_documentoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDocu_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_documentoContainer.AddColumnProperties(Gridalm_tipo_movimiento_documentoColumn);
      Gridalm_tipo_movimiento_documentoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_tipo_movimiento_documentoColumn.AddObjectProperty("Value", A821Docu_Prefijo);
      Gridalm_tipo_movimiento_documentoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDocu_Prefijo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_documentoContainer.AddColumnProperties(Gridalm_tipo_movimiento_documentoColumn);
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_documento_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_documento_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_documento_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_documento_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_documento_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridalm_tipo_movimiento_documentoContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridalm_tipo_movimiento_documento_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_127_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount60 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_60 = (short)(1) ;
            scanStart0V60( ) ;
            while ( RcdFound60 != 0 )
            {
               init_level_properties60( ) ;
               getByPrimaryKey0V60( ) ;
               addRow0V60( ) ;
               scanNext0V60( ) ;
            }
            scanEnd0V60( ) ;
            nBlankRcdCount60 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0V60( ) ;
         standaloneModal0V60( ) ;
         sMode60 = Gx_mode ;
         while ( nGXsfl_127_idx < nRC_GXsfl_127 )
         {
            bGXsfl_127_Refreshing = true ;
            readRow0V60( ) ;
            edtDocu_Nro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DOCU_NRO_"+sGXsfl_127_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDocu_Nro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Nro_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
            edtDocu_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DOCU_DESCRIPCION_"+sGXsfl_127_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDocu_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Descripcion_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
            edtDocu_Prefijo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DOCU_PREFIJO_"+sGXsfl_127_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDocu_Prefijo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Prefijo_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
            imgprompt_33_Link = httpContext.cgiGet( "PROMPT_819_"+sGXsfl_127_idx+"Link") ;
            if ( ( nRcdExists_60 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal0V60( ) ;
            }
            sendRow0V60( ) ;
            bGXsfl_127_Refreshing = false ;
         }
         Gx_mode = sMode60 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount60 = (short)(5) ;
         nRcdExists_60 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0V60( ) ;
            while ( RcdFound60 != 0 )
            {
               sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_12760( ) ;
               init_level_properties60( ) ;
               standaloneNotModal0V60( ) ;
               getByPrimaryKey0V60( ) ;
               standaloneModal0V60( ) ;
               addRow0V60( ) ;
               scanNext0V60( ) ;
            }
            scanEnd0V60( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode60 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_12760( ) ;
         initAll0V60( ) ;
         init_level_properties60( ) ;
         standaloneNotModal0V60( ) ;
         standaloneModal0V60( ) ;
         nRcdExists_60 = (short)(0) ;
         nIsMod_60 = (short)(0) ;
         nRcdDeleted_60 = (short)(0) ;
         nBlankRcdCount60 = (short)(nBlankRcdUsr60+nBlankRcdCount60) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount60 > 0 )
         {
            addRow0V60( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtDocu_Nro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount60 = (short)(nBlankRcdCount60-1) ;
         }
         Gx_mode = sMode60 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridalm_tipo_movimiento_documentoContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridalm_tipo_movimiento_documento", Gridalm_tipo_movimiento_documentoContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_tipo_movimiento_documentoContainerData", Gridalm_tipo_movimiento_documentoContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_tipo_movimiento_documentoContainerData"+"V", Gridalm_tipo_movimiento_documentoContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridalm_tipo_movimiento_documentoContainerData"+"V"+"\" value='"+Gridalm_tipo_movimiento_documentoContainer.GridValuesHidden()+"'/>") ;
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
      e110V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A38Tpmo_Codigo = httpContext.cgiGet( edtTpmo_Codigo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
            A313Tpmo_Descripcion = httpContext.cgiGet( edtTpmo_Descripcion_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A313Tpmo_Descripcion", A313Tpmo_Descripcion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPO_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipo_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A33Tipo_Codigo = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
            }
            else
            {
               A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
            }
            A253Tipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtTipo_Descripcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
            cmbTipo_Tipo.setName( cmbTipo_Tipo.getInternalname() );
            cmbTipo_Tipo.setValue( httpContext.cgiGet( cmbTipo_Tipo.getInternalname()) );
            A480Tipo_Tipo = httpContext.cgiGet( cmbTipo_Tipo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTpmo_AlmacenOrigenId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTpmo_AlmacenOrigenId_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TPMO_ALMACENORIGENID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTpmo_AlmacenOrigenId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A39Tpmo_AlmacenOrigenId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A39Tpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( A39Tpmo_AlmacenOrigenId, 11, 0)));
            }
            else
            {
               A39Tpmo_AlmacenOrigenId = localUtil.ctol( httpContext.cgiGet( edtTpmo_AlmacenOrigenId_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A39Tpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( A39Tpmo_AlmacenOrigenId, 11, 0)));
            }
            A312Tpmo_AlmacenOrigenDescrip = GXutil.upper( httpContext.cgiGet( edtTpmo_AlmacenOrigenDescrip_Internalname)) ;
            n312Tpmo_AlmacenOrigenDescrip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A312Tpmo_AlmacenOrigenDescrip", A312Tpmo_AlmacenOrigenDescrip);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTpmo_AlmacenDestinoId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTpmo_AlmacenDestinoId_Internalname), ",", ".") > 99999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TPMO_ALMACENDESTINOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTpmo_AlmacenDestinoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A40Tpmo_AlmacenDestinoId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A40Tpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( A40Tpmo_AlmacenDestinoId, 11, 0)));
            }
            else
            {
               A40Tpmo_AlmacenDestinoId = localUtil.ctol( httpContext.cgiGet( edtTpmo_AlmacenDestinoId_Internalname), ",", ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "A40Tpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( A40Tpmo_AlmacenDestinoId, 11, 0)));
            }
            A314Tpmo_AlmacenDestinoDescrip = GXutil.upper( httpContext.cgiGet( edtTpmo_AlmacenDestinoDescrip_Internalname)) ;
            n314Tpmo_AlmacenDestinoDescrip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A314Tpmo_AlmacenDestinoDescrip", A314Tpmo_AlmacenDestinoDescrip);
            cmbTpmo_TipoE_S.setName( cmbTpmo_TipoE_S.getInternalname() );
            cmbTpmo_TipoE_S.setValue( httpContext.cgiGet( cmbTpmo_TipoE_S.getInternalname()) );
            A315Tpmo_TipoE_S = httpContext.cgiGet( cmbTpmo_TipoE_S.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A315Tpmo_TipoE_S", A315Tpmo_TipoE_S);
            cmbTpmo_Modulo.setName( cmbTpmo_Modulo.getInternalname() );
            cmbTpmo_Modulo.setValue( httpContext.cgiGet( cmbTpmo_Modulo.getInternalname()) );
            A316Tpmo_Modulo = httpContext.cgiGet( cmbTpmo_Modulo.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A316Tpmo_Modulo", A316Tpmo_Modulo);
            cmbTpmo_IngresaAredante.setName( cmbTpmo_IngresaAredante.getInternalname() );
            cmbTpmo_IngresaAredante.setValue( httpContext.cgiGet( cmbTpmo_IngresaAredante.getInternalname()) );
            A440Tpmo_IngresaAredante = httpContext.cgiGet( cmbTpmo_IngresaAredante.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440Tpmo_IngresaAredante", A440Tpmo_IngresaAredante);
            cmbTpmo_IngresaCurso.setName( cmbTpmo_IngresaCurso.getInternalname() );
            cmbTpmo_IngresaCurso.setValue( httpContext.cgiGet( cmbTpmo_IngresaCurso.getInternalname()) );
            A441Tpmo_IngresaCurso = httpContext.cgiGet( cmbTpmo_IngresaCurso.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A441Tpmo_IngresaCurso", A441Tpmo_IngresaCurso);
            cmbTpmo_Controlado.setName( cmbTpmo_Controlado.getInternalname() );
            cmbTpmo_Controlado.setValue( httpContext.cgiGet( cmbTpmo_Controlado.getInternalname()) );
            A633Tpmo_Controlado = httpContext.cgiGet( cmbTpmo_Controlado.getInternalname()) ;
            n633Tpmo_Controlado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A633Tpmo_Controlado", A633Tpmo_Controlado);
            n633Tpmo_Controlado = ((GXutil.strcmp("", A633Tpmo_Controlado)==0) ? true : false) ;
            cmbTpmo_VidaUtil.setName( cmbTpmo_VidaUtil.getInternalname() );
            cmbTpmo_VidaUtil.setValue( httpContext.cgiGet( cmbTpmo_VidaUtil.getInternalname()) );
            A641Tpmo_VidaUtil = httpContext.cgiGet( cmbTpmo_VidaUtil.getInternalname()) ;
            n641Tpmo_VidaUtil = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A641Tpmo_VidaUtil", A641Tpmo_VidaUtil);
            n641Tpmo_VidaUtil = ((GXutil.strcmp("", A641Tpmo_VidaUtil)==0) ? true : false) ;
            cmbTpmo_CuentaResponsabilidad.setName( cmbTpmo_CuentaResponsabilidad.getInternalname() );
            cmbTpmo_CuentaResponsabilidad.setValue( httpContext.cgiGet( cmbTpmo_CuentaResponsabilidad.getInternalname()) );
            A680Tpmo_CuentaResponsabilidad = httpContext.cgiGet( cmbTpmo_CuentaResponsabilidad.getInternalname()) ;
            n680Tpmo_CuentaResponsabilidad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A680Tpmo_CuentaResponsabilidad", A680Tpmo_CuentaResponsabilidad);
            n680Tpmo_CuentaResponsabilidad = ((GXutil.strcmp("", A680Tpmo_CuentaResponsabilidad)==0) ? true : false) ;
            cmbTpmo_SolicitaRegionDestino.setName( cmbTpmo_SolicitaRegionDestino.getInternalname() );
            cmbTpmo_SolicitaRegionDestino.setValue( httpContext.cgiGet( cmbTpmo_SolicitaRegionDestino.getInternalname()) );
            A705Tpmo_SolicitaRegionDestino = httpContext.cgiGet( cmbTpmo_SolicitaRegionDestino.getInternalname()) ;
            n705Tpmo_SolicitaRegionDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A705Tpmo_SolicitaRegionDestino", A705Tpmo_SolicitaRegionDestino);
            n705Tpmo_SolicitaRegionDestino = ((GXutil.strcmp("", A705Tpmo_SolicitaRegionDestino)==0) ? true : false) ;
            cmbTpmo_SolicitaCentroDestino.setName( cmbTpmo_SolicitaCentroDestino.getInternalname() );
            cmbTpmo_SolicitaCentroDestino.setValue( httpContext.cgiGet( cmbTpmo_SolicitaCentroDestino.getInternalname()) );
            A706Tpmo_SolicitaCentroDestino = httpContext.cgiGet( cmbTpmo_SolicitaCentroDestino.getInternalname()) ;
            n706Tpmo_SolicitaCentroDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A706Tpmo_SolicitaCentroDestino", A706Tpmo_SolicitaCentroDestino);
            n706Tpmo_SolicitaCentroDestino = ((GXutil.strcmp("", A706Tpmo_SolicitaCentroDestino)==0) ? true : false) ;
            cmbTpmo_ImprimeOrigen.setName( cmbTpmo_ImprimeOrigen.getInternalname() );
            cmbTpmo_ImprimeOrigen.setValue( httpContext.cgiGet( cmbTpmo_ImprimeOrigen.getInternalname()) );
            A716Tpmo_ImprimeOrigen = httpContext.cgiGet( cmbTpmo_ImprimeOrigen.getInternalname()) ;
            n716Tpmo_ImprimeOrigen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A716Tpmo_ImprimeOrigen", A716Tpmo_ImprimeOrigen);
            n716Tpmo_ImprimeOrigen = ((GXutil.strcmp("", A716Tpmo_ImprimeOrigen)==0) ? true : false) ;
            cmbTpmo_ImprimeDestino.setName( cmbTpmo_ImprimeDestino.getInternalname() );
            cmbTpmo_ImprimeDestino.setValue( httpContext.cgiGet( cmbTpmo_ImprimeDestino.getInternalname()) );
            A717Tpmo_ImprimeDestino = httpContext.cgiGet( cmbTpmo_ImprimeDestino.getInternalname()) ;
            n717Tpmo_ImprimeDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A717Tpmo_ImprimeDestino", A717Tpmo_ImprimeDestino);
            n717Tpmo_ImprimeDestino = ((GXutil.strcmp("", A717Tpmo_ImprimeDestino)==0) ? true : false) ;
            cmbTmpo_ImprimeResponsable.setName( cmbTmpo_ImprimeResponsable.getInternalname() );
            cmbTmpo_ImprimeResponsable.setValue( httpContext.cgiGet( cmbTmpo_ImprimeResponsable.getInternalname()) );
            A718Tmpo_ImprimeResponsable = httpContext.cgiGet( cmbTmpo_ImprimeResponsable.getInternalname()) ;
            n718Tmpo_ImprimeResponsable = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A718Tmpo_ImprimeResponsable", A718Tmpo_ImprimeResponsable);
            n718Tmpo_ImprimeResponsable = ((GXutil.strcmp("", A718Tmpo_ImprimeResponsable)==0) ? true : false) ;
            cmbTpmo_Estado.setName( cmbTpmo_Estado.getInternalname() );
            cmbTpmo_Estado.setValue( httpContext.cgiGet( cmbTpmo_Estado.getInternalname()) );
            A679Tpmo_Estado = httpContext.cgiGet( cmbTpmo_Estado.getInternalname()) ;
            n679Tpmo_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A679Tpmo_Estado", A679Tpmo_Estado);
            n679Tpmo_Estado = ((GXutil.strcmp("", A679Tpmo_Estado)==0) ? true : false) ;
            /* Read saved values. */
            Z38Tpmo_Codigo = httpContext.cgiGet( "Z38Tpmo_Codigo") ;
            Z317Tpmo_UsuarioCrea = httpContext.cgiGet( "Z317Tpmo_UsuarioCrea") ;
            Z318Tpmo_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z318Tpmo_FechaCrea"), 0) ;
            Z319Tpmo_UsuarioModifica = httpContext.cgiGet( "Z319Tpmo_UsuarioModifica") ;
            n319Tpmo_UsuarioModifica = ((GXutil.strcmp("", A319Tpmo_UsuarioModifica)==0) ? true : false) ;
            Z320Tpmo_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z320Tpmo_FechaModifica"), 0) ;
            n320Tpmo_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A320Tpmo_FechaModifica) ? true : false) ;
            Z313Tpmo_Descripcion = httpContext.cgiGet( "Z313Tpmo_Descripcion") ;
            Z315Tpmo_TipoE_S = httpContext.cgiGet( "Z315Tpmo_TipoE_S") ;
            Z316Tpmo_Modulo = httpContext.cgiGet( "Z316Tpmo_Modulo") ;
            Z440Tpmo_IngresaAredante = httpContext.cgiGet( "Z440Tpmo_IngresaAredante") ;
            Z441Tpmo_IngresaCurso = httpContext.cgiGet( "Z441Tpmo_IngresaCurso") ;
            Z595Tpmo_ConsecutivoTrans = localUtil.ctol( httpContext.cgiGet( "Z595Tpmo_ConsecutivoTrans"), ",", ".") ;
            n595Tpmo_ConsecutivoTrans = ((0==A595Tpmo_ConsecutivoTrans) ? true : false) ;
            Z633Tpmo_Controlado = httpContext.cgiGet( "Z633Tpmo_Controlado") ;
            n633Tpmo_Controlado = ((GXutil.strcmp("", A633Tpmo_Controlado)==0) ? true : false) ;
            Z641Tpmo_VidaUtil = httpContext.cgiGet( "Z641Tpmo_VidaUtil") ;
            n641Tpmo_VidaUtil = ((GXutil.strcmp("", A641Tpmo_VidaUtil)==0) ? true : false) ;
            Z679Tpmo_Estado = httpContext.cgiGet( "Z679Tpmo_Estado") ;
            n679Tpmo_Estado = ((GXutil.strcmp("", A679Tpmo_Estado)==0) ? true : false) ;
            Z680Tpmo_CuentaResponsabilidad = httpContext.cgiGet( "Z680Tpmo_CuentaResponsabilidad") ;
            n680Tpmo_CuentaResponsabilidad = ((GXutil.strcmp("", A680Tpmo_CuentaResponsabilidad)==0) ? true : false) ;
            Z705Tpmo_SolicitaRegionDestino = httpContext.cgiGet( "Z705Tpmo_SolicitaRegionDestino") ;
            n705Tpmo_SolicitaRegionDestino = ((GXutil.strcmp("", A705Tpmo_SolicitaRegionDestino)==0) ? true : false) ;
            Z706Tpmo_SolicitaCentroDestino = httpContext.cgiGet( "Z706Tpmo_SolicitaCentroDestino") ;
            n706Tpmo_SolicitaCentroDestino = ((GXutil.strcmp("", A706Tpmo_SolicitaCentroDestino)==0) ? true : false) ;
            Z716Tpmo_ImprimeOrigen = httpContext.cgiGet( "Z716Tpmo_ImprimeOrigen") ;
            n716Tpmo_ImprimeOrigen = ((GXutil.strcmp("", A716Tpmo_ImprimeOrigen)==0) ? true : false) ;
            Z717Tpmo_ImprimeDestino = httpContext.cgiGet( "Z717Tpmo_ImprimeDestino") ;
            n717Tpmo_ImprimeDestino = ((GXutil.strcmp("", A717Tpmo_ImprimeDestino)==0) ? true : false) ;
            Z718Tmpo_ImprimeResponsable = httpContext.cgiGet( "Z718Tmpo_ImprimeResponsable") ;
            n718Tmpo_ImprimeResponsable = ((GXutil.strcmp("", A718Tmpo_ImprimeResponsable)==0) ? true : false) ;
            Z33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( "Z33Tipo_Codigo"), ",", ".") ;
            Z39Tpmo_AlmacenOrigenId = localUtil.ctol( httpContext.cgiGet( "Z39Tpmo_AlmacenOrigenId"), ",", ".") ;
            Z40Tpmo_AlmacenDestinoId = localUtil.ctol( httpContext.cgiGet( "Z40Tpmo_AlmacenDestinoId"), ",", ".") ;
            A317Tpmo_UsuarioCrea = httpContext.cgiGet( "Z317Tpmo_UsuarioCrea") ;
            A318Tpmo_FechaCrea = localUtil.ctot( httpContext.cgiGet( "Z318Tpmo_FechaCrea"), 0) ;
            A319Tpmo_UsuarioModifica = httpContext.cgiGet( "Z319Tpmo_UsuarioModifica") ;
            n319Tpmo_UsuarioModifica = false ;
            n319Tpmo_UsuarioModifica = ((GXutil.strcmp("", A319Tpmo_UsuarioModifica)==0) ? true : false) ;
            A320Tpmo_FechaModifica = localUtil.ctot( httpContext.cgiGet( "Z320Tpmo_FechaModifica"), 0) ;
            n320Tpmo_FechaModifica = false ;
            n320Tpmo_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A320Tpmo_FechaModifica) ? true : false) ;
            A595Tpmo_ConsecutivoTrans = localUtil.ctol( httpContext.cgiGet( "Z595Tpmo_ConsecutivoTrans"), ",", ".") ;
            n595Tpmo_ConsecutivoTrans = false ;
            n595Tpmo_ConsecutivoTrans = ((0==A595Tpmo_ConsecutivoTrans) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_113 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_113"), ",", ".")) ;
            nRC_GXsfl_127 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_127"), ",", ".")) ;
            N33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( "N33Tipo_Codigo"), ",", ".") ;
            N39Tpmo_AlmacenOrigenId = localUtil.ctol( httpContext.cgiGet( "N39Tpmo_AlmacenOrigenId"), ",", ".") ;
            N40Tpmo_AlmacenDestinoId = localUtil.ctol( httpContext.cgiGet( "N40Tpmo_AlmacenDestinoId"), ",", ".") ;
            AV15Tpmo_Codigo = httpContext.cgiGet( "vTPMO_CODIGO") ;
            AV11Insert_Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( "vINSERT_TIPO_CODIGO"), ",", ".") ;
            AV12Insert_Tpmo_AlmacenOrigenId = localUtil.ctol( httpContext.cgiGet( "vINSERT_TPMO_ALMACENORIGENID"), ",", ".") ;
            AV13Insert_Tpmo_AlmacenDestinoId = localUtil.ctol( httpContext.cgiGet( "vINSERT_TPMO_ALMACENDESTINOID"), ",", ".") ;
            AV16Usuario = httpContext.cgiGet( "vUSUARIO") ;
            A317Tpmo_UsuarioCrea = httpContext.cgiGet( "TPMO_USUARIOCREA") ;
            A318Tpmo_FechaCrea = localUtil.ctot( httpContext.cgiGet( "TPMO_FECHACREA"), 0) ;
            A319Tpmo_UsuarioModifica = httpContext.cgiGet( "TPMO_USUARIOMODIFICA") ;
            n319Tpmo_UsuarioModifica = ((GXutil.strcmp("", A319Tpmo_UsuarioModifica)==0) ? true : false) ;
            A320Tpmo_FechaModifica = localUtil.ctot( httpContext.cgiGet( "TPMO_FECHAMODIFICA"), 0) ;
            n320Tpmo_FechaModifica = (GXutil.dateCompare(GXutil.nullDate(), A320Tpmo_FechaModifica) ? true : false) ;
            A595Tpmo_ConsecutivoTrans = localUtil.ctol( httpContext.cgiGet( "TPMO_CONSECUTIVOTRANS"), ",", ".") ;
            n595Tpmo_ConsecutivoTrans = ((0==A595Tpmo_ConsecutivoTrans) ? true : false) ;
            AV18Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_TIPO_MOVIMIENTO" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A595Tpmo_ConsecutivoTrans), "ZZZZZZZZZZZZZZZZZ9") ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A38Tpmo_Codigo, Z38Tpmo_Codigo) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_tipo_movimiento:[SecurityCheckFailed]"+forbiddenHiddens);
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
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
               A38Tpmo_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
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
                  sMode31 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode31 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound31 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0V0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TPMO_CODIGO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTpmo_Codigo_Internalname ;
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
                        e110V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120V2 ();
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
         e120V2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0V31( ) ;
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
         disableAttributes0V31( ) ;
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

   public void confirm_0V0( )
   {
      beforeValidate0V31( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0V31( ) ;
         }
         else
         {
            checkExtendedTable0V31( ) ;
            closeExtendedTableCursors0V31( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode31 = Gx_mode ;
         confirm_0V32( ) ;
         if ( AnyError == 0 )
         {
            confirm_0V60( ) ;
            if ( AnyError == 0 )
            {
               /* Restore parent mode. */
               Gx_mode = sMode31 ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               IsConfirmed = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
            }
         }
         /* Restore parent mode. */
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
   }

   public void confirm_0V60( )
   {
      nGXsfl_127_idx = (short)(0) ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         readRow0V60( ) ;
         if ( ( nRcdExists_60 != 0 ) || ( nIsMod_60 != 0 ) )
         {
            getKey0V60( ) ;
            if ( ( nRcdExists_60 == 0 ) && ( nRcdDeleted_60 == 0 ) )
            {
               if ( RcdFound60 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate0V60( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0V60( ) ;
                     closeExtendedTableCursors0V60( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DOCU_NRO_" + sGXsfl_127_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDocu_Nro_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound60 != 0 )
               {
                  if ( nRcdDeleted_60 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey0V60( ) ;
                     load0V60( ) ;
                     beforeValidate0V60( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0V60( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_60 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate0V60( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0V60( ) ;
                           closeExtendedTableCursors0V60( ) ;
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
                  if ( nRcdDeleted_60 == 0 )
                  {
                     GXCCtl = "DOCU_NRO_" + sGXsfl_127_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDocu_Nro_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDocu_Nro_Internalname, GXutil.ltrim( localUtil.ntoc( A819Docu_Nro, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtDocu_Descripcion_Internalname, A820Docu_Descripcion) ;
         httpContext.changePostValue( edtDocu_Prefijo_Internalname, A821Docu_Prefijo) ;
         httpContext.changePostValue( "ZT_"+"Z819Docu_Nro_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z819Docu_Nro, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_60_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_60, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_60_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_60, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_60_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_60, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_60 != 0 )
         {
            httpContext.changePostValue( "DOCU_NRO_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDocu_Nro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DOCU_DESCRIPCION_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDocu_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DOCU_PREFIJO_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDocu_Prefijo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_0V32( )
   {
      nGXsfl_113_idx = (short)(0) ;
      while ( nGXsfl_113_idx < nRC_GXsfl_113 )
      {
         readRow0V32( ) ;
         if ( ( nRcdExists_32 != 0 ) || ( nIsMod_32 != 0 ) )
         {
            getKey0V32( ) ;
            if ( ( nRcdExists_32 == 0 ) && ( nRcdDeleted_32 == 0 ) )
            {
               if ( RcdFound32 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate0V32( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0V32( ) ;
                     closeExtendedTableCursors0V32( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ORIG_IDENTIFICADOR_" + sGXsfl_113_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOrig_Identificador_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound32 != 0 )
               {
                  if ( nRcdDeleted_32 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey0V32( ) ;
                     load0V32( ) ;
                     beforeValidate0V32( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0V32( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_32 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate0V32( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0V32( ) ;
                           closeExtendedTableCursors0V32( ) ;
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
                  if ( nRcdDeleted_32 == 0 )
                  {
                     GXCCtl = "ORIG_IDENTIFICADOR_" + sGXsfl_113_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOrig_Identificador_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOrig_Identificador_Internalname, GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtOrig_Descripcion_Internalname, A635Orig_Descripcion) ;
         httpContext.changePostValue( cmbTpmo_SolicitaNumero.getInternalname(), A642Tpmo_SolicitaNumero) ;
         httpContext.changePostValue( cmbTpmo_SolicitaFecha.getInternalname(), A643Tpmo_SolicitaFecha) ;
         httpContext.changePostValue( cmbTpmo_EstadoOrigen.getInternalname(), GXutil.rtrim( A681Tpmo_EstadoOrigen)) ;
         httpContext.changePostValue( "ZT_"+"Z41Orig_Identificador_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z41Orig_Identificador, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z642Tpmo_SolicitaNumero_"+sGXsfl_113_idx, Z642Tpmo_SolicitaNumero) ;
         httpContext.changePostValue( "ZT_"+"Z643Tpmo_SolicitaFecha_"+sGXsfl_113_idx, Z643Tpmo_SolicitaFecha) ;
         httpContext.changePostValue( "ZT_"+"Z681Tpmo_EstadoOrigen_"+sGXsfl_113_idx, GXutil.rtrim( Z681Tpmo_EstadoOrigen)) ;
         httpContext.changePostValue( "nRcdDeleted_32_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_32, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_32_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_32, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_32_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_32, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_32 != 0 )
         {
            httpContext.changePostValue( "ORIG_IDENTIFICADOR_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrig_Identificador_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORIG_DESCRIPCION_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrig_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TPMO_SOLICITANUMERO_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTpmo_SolicitaNumero.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TPMO_SOLICITAFECHA_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTpmo_SolicitaFecha.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TPMO_ESTADOORIGEN_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTpmo_EstadoOrigen.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0V0( )
   {
   }

   public void e110V2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV18Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV18Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
      AV11Insert_Tipo_Codigo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Insert_Tipo_Codigo", GXutil.ltrim( GXutil.str( AV11Insert_Tipo_Codigo, 18, 0)));
      AV12Insert_Tpmo_AlmacenOrigenId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_Tpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( AV12Insert_Tpmo_AlmacenOrigenId, 11, 0)));
      AV13Insert_Tpmo_AlmacenDestinoId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_Tpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( AV13Insert_Tpmo_AlmacenDestinoId, 11, 0)));
      if ( ( GXutil.strcmp(AV9TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV18Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV19GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19GXV1", GXutil.ltrim( GXutil.str( AV19GXV1, 8, 0)));
         while ( AV19GXV1 <= AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV9TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV19GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tipo_Codigo") == 0 )
            {
               AV11Insert_Tipo_Codigo = GXutil.lval( AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11Insert_Tipo_Codigo", GXutil.ltrim( GXutil.str( AV11Insert_Tipo_Codigo, 18, 0)));
            }
            else if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tpmo_AlmacenOrigenId") == 0 )
            {
               AV12Insert_Tpmo_AlmacenOrigenId = GXutil.lval( AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_Tpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( AV12Insert_Tpmo_AlmacenOrigenId, 11, 0)));
            }
            else if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Tpmo_AlmacenDestinoId") == 0 )
            {
               AV13Insert_Tpmo_AlmacenDestinoId = GXutil.lval( AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_Tpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( AV13Insert_Tpmo_AlmacenDestinoId, 11, 0)));
            }
            AV19GXV1 = (int)(AV19GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19GXV1", GXutil.ltrim( GXutil.str( AV19GXV1, 8, 0)));
         }
      }
      AV16Usuario = AV10WebSession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Usuario", AV16Usuario);
   }

   public void e120V2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV9TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_tipo_movimiento") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm0V31( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z317Tpmo_UsuarioCrea = T000V9_A317Tpmo_UsuarioCrea[0] ;
            Z318Tpmo_FechaCrea = T000V9_A318Tpmo_FechaCrea[0] ;
            Z319Tpmo_UsuarioModifica = T000V9_A319Tpmo_UsuarioModifica[0] ;
            Z320Tpmo_FechaModifica = T000V9_A320Tpmo_FechaModifica[0] ;
            Z313Tpmo_Descripcion = T000V9_A313Tpmo_Descripcion[0] ;
            Z315Tpmo_TipoE_S = T000V9_A315Tpmo_TipoE_S[0] ;
            Z316Tpmo_Modulo = T000V9_A316Tpmo_Modulo[0] ;
            Z440Tpmo_IngresaAredante = T000V9_A440Tpmo_IngresaAredante[0] ;
            Z441Tpmo_IngresaCurso = T000V9_A441Tpmo_IngresaCurso[0] ;
            Z595Tpmo_ConsecutivoTrans = T000V9_A595Tpmo_ConsecutivoTrans[0] ;
            Z633Tpmo_Controlado = T000V9_A633Tpmo_Controlado[0] ;
            Z641Tpmo_VidaUtil = T000V9_A641Tpmo_VidaUtil[0] ;
            Z679Tpmo_Estado = T000V9_A679Tpmo_Estado[0] ;
            Z680Tpmo_CuentaResponsabilidad = T000V9_A680Tpmo_CuentaResponsabilidad[0] ;
            Z705Tpmo_SolicitaRegionDestino = T000V9_A705Tpmo_SolicitaRegionDestino[0] ;
            Z706Tpmo_SolicitaCentroDestino = T000V9_A706Tpmo_SolicitaCentroDestino[0] ;
            Z716Tpmo_ImprimeOrigen = T000V9_A716Tpmo_ImprimeOrigen[0] ;
            Z717Tpmo_ImprimeDestino = T000V9_A717Tpmo_ImprimeDestino[0] ;
            Z718Tmpo_ImprimeResponsable = T000V9_A718Tmpo_ImprimeResponsable[0] ;
            Z33Tipo_Codigo = T000V9_A33Tipo_Codigo[0] ;
            Z39Tpmo_AlmacenOrigenId = T000V9_A39Tpmo_AlmacenOrigenId[0] ;
            Z40Tpmo_AlmacenDestinoId = T000V9_A40Tpmo_AlmacenDestinoId[0] ;
         }
         else
         {
            Z317Tpmo_UsuarioCrea = A317Tpmo_UsuarioCrea ;
            Z318Tpmo_FechaCrea = A318Tpmo_FechaCrea ;
            Z319Tpmo_UsuarioModifica = A319Tpmo_UsuarioModifica ;
            Z320Tpmo_FechaModifica = A320Tpmo_FechaModifica ;
            Z313Tpmo_Descripcion = A313Tpmo_Descripcion ;
            Z315Tpmo_TipoE_S = A315Tpmo_TipoE_S ;
            Z316Tpmo_Modulo = A316Tpmo_Modulo ;
            Z440Tpmo_IngresaAredante = A440Tpmo_IngresaAredante ;
            Z441Tpmo_IngresaCurso = A441Tpmo_IngresaCurso ;
            Z595Tpmo_ConsecutivoTrans = A595Tpmo_ConsecutivoTrans ;
            Z633Tpmo_Controlado = A633Tpmo_Controlado ;
            Z641Tpmo_VidaUtil = A641Tpmo_VidaUtil ;
            Z679Tpmo_Estado = A679Tpmo_Estado ;
            Z680Tpmo_CuentaResponsabilidad = A680Tpmo_CuentaResponsabilidad ;
            Z705Tpmo_SolicitaRegionDestino = A705Tpmo_SolicitaRegionDestino ;
            Z706Tpmo_SolicitaCentroDestino = A706Tpmo_SolicitaCentroDestino ;
            Z716Tpmo_ImprimeOrigen = A716Tpmo_ImprimeOrigen ;
            Z717Tpmo_ImprimeDestino = A717Tpmo_ImprimeDestino ;
            Z718Tmpo_ImprimeResponsable = A718Tmpo_ImprimeResponsable ;
            Z33Tipo_Codigo = A33Tipo_Codigo ;
            Z39Tpmo_AlmacenOrigenId = A39Tpmo_AlmacenOrigenId ;
            Z40Tpmo_AlmacenDestinoId = A40Tpmo_AlmacenDestinoId ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z38Tpmo_Codigo = A38Tpmo_Codigo ;
         Z317Tpmo_UsuarioCrea = A317Tpmo_UsuarioCrea ;
         Z318Tpmo_FechaCrea = A318Tpmo_FechaCrea ;
         Z319Tpmo_UsuarioModifica = A319Tpmo_UsuarioModifica ;
         Z320Tpmo_FechaModifica = A320Tpmo_FechaModifica ;
         Z313Tpmo_Descripcion = A313Tpmo_Descripcion ;
         Z315Tpmo_TipoE_S = A315Tpmo_TipoE_S ;
         Z316Tpmo_Modulo = A316Tpmo_Modulo ;
         Z440Tpmo_IngresaAredante = A440Tpmo_IngresaAredante ;
         Z441Tpmo_IngresaCurso = A441Tpmo_IngresaCurso ;
         Z595Tpmo_ConsecutivoTrans = A595Tpmo_ConsecutivoTrans ;
         Z633Tpmo_Controlado = A633Tpmo_Controlado ;
         Z641Tpmo_VidaUtil = A641Tpmo_VidaUtil ;
         Z679Tpmo_Estado = A679Tpmo_Estado ;
         Z680Tpmo_CuentaResponsabilidad = A680Tpmo_CuentaResponsabilidad ;
         Z705Tpmo_SolicitaRegionDestino = A705Tpmo_SolicitaRegionDestino ;
         Z706Tpmo_SolicitaCentroDestino = A706Tpmo_SolicitaCentroDestino ;
         Z716Tpmo_ImprimeOrigen = A716Tpmo_ImprimeOrigen ;
         Z717Tpmo_ImprimeDestino = A717Tpmo_ImprimeDestino ;
         Z718Tmpo_ImprimeResponsable = A718Tmpo_ImprimeResponsable ;
         Z33Tipo_Codigo = A33Tipo_Codigo ;
         Z39Tpmo_AlmacenOrigenId = A39Tpmo_AlmacenOrigenId ;
         Z40Tpmo_AlmacenDestinoId = A40Tpmo_AlmacenDestinoId ;
         Z253Tipo_Descripcion = A253Tipo_Descripcion ;
         Z480Tipo_Tipo = A480Tipo_Tipo ;
         Z312Tpmo_AlmacenOrigenDescrip = A312Tpmo_AlmacenOrigenDescrip ;
         Z314Tpmo_AlmacenDestinoDescrip = A314Tpmo_AlmacenDestinoDescrip ;
      }
   }

   public void standaloneNotModal( )
   {
      imgprompt_33_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx00u0"+"',["+"{Ctrl:gx.dom.el('"+"TIPO_CODIGO"+"'), id:'"+"TIPO_CODIGO"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_39_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0110"+"',["+"{Ctrl:gx.dom.el('"+"TPMO_ALMACENORIGENID"+"'), id:'"+"TPMO_ALMACENORIGENID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      imgprompt_40_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx0110"+"',["+"{Ctrl:gx.dom.el('"+"TPMO_ALMACENDESTINOID"+"'), id:'"+"TPMO_ALMACENDESTINOID"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (GXutil.strcmp("", AV15Tpmo_Codigo)==0) )
      {
         A38Tpmo_Codigo = AV15Tpmo_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
      }
      if ( ! (GXutil.strcmp("", AV15Tpmo_Codigo)==0) )
      {
         edtTpmo_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpmo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtTpmo_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpmo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_Codigo_Enabled, 5, 0)), true);
      }
      if ( ! (GXutil.strcmp("", AV15Tpmo_Codigo)==0) )
      {
         edtTpmo_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpmo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_Codigo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV11Insert_Tipo_Codigo) )
      {
         edtTipo_Codigo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Codigo_Enabled, 5, 0)), true);
      }
      else
      {
         edtTipo_Codigo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Codigo_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_Tpmo_AlmacenOrigenId) )
      {
         edtTpmo_AlmacenOrigenId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpmo_AlmacenOrigenId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_AlmacenOrigenId_Enabled, 5, 0)), true);
      }
      else
      {
         edtTpmo_AlmacenOrigenId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpmo_AlmacenOrigenId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_AlmacenOrigenId_Enabled, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_Tpmo_AlmacenDestinoId) )
      {
         edtTpmo_AlmacenDestinoId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpmo_AlmacenDestinoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_AlmacenDestinoId_Enabled, 5, 0)), true);
      }
      else
      {
         edtTpmo_AlmacenDestinoId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTpmo_AlmacenDestinoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_AlmacenDestinoId_Enabled, 5, 0)), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_Tpmo_AlmacenDestinoId) )
      {
         A40Tpmo_AlmacenDestinoId = AV13Insert_Tpmo_AlmacenDestinoId ;
         httpContext.ajax_rsp_assign_attri("", false, "A40Tpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( A40Tpmo_AlmacenDestinoId, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_Tpmo_AlmacenOrigenId) )
      {
         A39Tpmo_AlmacenOrigenId = AV12Insert_Tpmo_AlmacenOrigenId ;
         httpContext.ajax_rsp_assign_attri("", false, "A39Tpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( A39Tpmo_AlmacenOrigenId, 11, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV11Insert_Tipo_Codigo) )
      {
         A33Tipo_Codigo = AV11Insert_Tipo_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV18Pgmname = "ALM_TIPO_MOVIMIENTO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
         /* Using cursor T000V12 */
         pr_default.execute(10, new Object[] {new Long(A40Tpmo_AlmacenDestinoId)});
         A314Tpmo_AlmacenDestinoDescrip = T000V12_A314Tpmo_AlmacenDestinoDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A314Tpmo_AlmacenDestinoDescrip", A314Tpmo_AlmacenDestinoDescrip);
         n314Tpmo_AlmacenDestinoDescrip = T000V12_n314Tpmo_AlmacenDestinoDescrip[0] ;
         pr_default.close(10);
         /* Using cursor T000V11 */
         pr_default.execute(9, new Object[] {new Long(A39Tpmo_AlmacenOrigenId)});
         A312Tpmo_AlmacenOrigenDescrip = T000V11_A312Tpmo_AlmacenOrigenDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A312Tpmo_AlmacenOrigenDescrip", A312Tpmo_AlmacenOrigenDescrip);
         n312Tpmo_AlmacenOrigenDescrip = T000V11_n312Tpmo_AlmacenOrigenDescrip[0] ;
         pr_default.close(9);
         /* Using cursor T000V10 */
         pr_default.execute(8, new Object[] {new Long(A33Tipo_Codigo)});
         A253Tipo_Descripcion = T000V10_A253Tipo_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
         A480Tipo_Tipo = T000V10_A480Tipo_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
         pr_default.close(8);
      }
   }

   public void load0V31( )
   {
      /* Using cursor T000V13 */
      pr_default.execute(11, new Object[] {A38Tpmo_Codigo});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A317Tpmo_UsuarioCrea = T000V13_A317Tpmo_UsuarioCrea[0] ;
         A318Tpmo_FechaCrea = T000V13_A318Tpmo_FechaCrea[0] ;
         A319Tpmo_UsuarioModifica = T000V13_A319Tpmo_UsuarioModifica[0] ;
         n319Tpmo_UsuarioModifica = T000V13_n319Tpmo_UsuarioModifica[0] ;
         A320Tpmo_FechaModifica = T000V13_A320Tpmo_FechaModifica[0] ;
         n320Tpmo_FechaModifica = T000V13_n320Tpmo_FechaModifica[0] ;
         A313Tpmo_Descripcion = T000V13_A313Tpmo_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A313Tpmo_Descripcion", A313Tpmo_Descripcion);
         A253Tipo_Descripcion = T000V13_A253Tipo_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
         A480Tipo_Tipo = T000V13_A480Tipo_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
         A312Tpmo_AlmacenOrigenDescrip = T000V13_A312Tpmo_AlmacenOrigenDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A312Tpmo_AlmacenOrigenDescrip", A312Tpmo_AlmacenOrigenDescrip);
         n312Tpmo_AlmacenOrigenDescrip = T000V13_n312Tpmo_AlmacenOrigenDescrip[0] ;
         A314Tpmo_AlmacenDestinoDescrip = T000V13_A314Tpmo_AlmacenDestinoDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A314Tpmo_AlmacenDestinoDescrip", A314Tpmo_AlmacenDestinoDescrip);
         n314Tpmo_AlmacenDestinoDescrip = T000V13_n314Tpmo_AlmacenDestinoDescrip[0] ;
         A315Tpmo_TipoE_S = T000V13_A315Tpmo_TipoE_S[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A315Tpmo_TipoE_S", A315Tpmo_TipoE_S);
         A316Tpmo_Modulo = T000V13_A316Tpmo_Modulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A316Tpmo_Modulo", A316Tpmo_Modulo);
         A440Tpmo_IngresaAredante = T000V13_A440Tpmo_IngresaAredante[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A440Tpmo_IngresaAredante", A440Tpmo_IngresaAredante);
         A441Tpmo_IngresaCurso = T000V13_A441Tpmo_IngresaCurso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A441Tpmo_IngresaCurso", A441Tpmo_IngresaCurso);
         A595Tpmo_ConsecutivoTrans = T000V13_A595Tpmo_ConsecutivoTrans[0] ;
         n595Tpmo_ConsecutivoTrans = T000V13_n595Tpmo_ConsecutivoTrans[0] ;
         A633Tpmo_Controlado = T000V13_A633Tpmo_Controlado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A633Tpmo_Controlado", A633Tpmo_Controlado);
         n633Tpmo_Controlado = T000V13_n633Tpmo_Controlado[0] ;
         A641Tpmo_VidaUtil = T000V13_A641Tpmo_VidaUtil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A641Tpmo_VidaUtil", A641Tpmo_VidaUtil);
         n641Tpmo_VidaUtil = T000V13_n641Tpmo_VidaUtil[0] ;
         A679Tpmo_Estado = T000V13_A679Tpmo_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A679Tpmo_Estado", A679Tpmo_Estado);
         n679Tpmo_Estado = T000V13_n679Tpmo_Estado[0] ;
         A680Tpmo_CuentaResponsabilidad = T000V13_A680Tpmo_CuentaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A680Tpmo_CuentaResponsabilidad", A680Tpmo_CuentaResponsabilidad);
         n680Tpmo_CuentaResponsabilidad = T000V13_n680Tpmo_CuentaResponsabilidad[0] ;
         A705Tpmo_SolicitaRegionDestino = T000V13_A705Tpmo_SolicitaRegionDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705Tpmo_SolicitaRegionDestino", A705Tpmo_SolicitaRegionDestino);
         n705Tpmo_SolicitaRegionDestino = T000V13_n705Tpmo_SolicitaRegionDestino[0] ;
         A706Tpmo_SolicitaCentroDestino = T000V13_A706Tpmo_SolicitaCentroDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A706Tpmo_SolicitaCentroDestino", A706Tpmo_SolicitaCentroDestino);
         n706Tpmo_SolicitaCentroDestino = T000V13_n706Tpmo_SolicitaCentroDestino[0] ;
         A716Tpmo_ImprimeOrigen = T000V13_A716Tpmo_ImprimeOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A716Tpmo_ImprimeOrigen", A716Tpmo_ImprimeOrigen);
         n716Tpmo_ImprimeOrigen = T000V13_n716Tpmo_ImprimeOrigen[0] ;
         A717Tpmo_ImprimeDestino = T000V13_A717Tpmo_ImprimeDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A717Tpmo_ImprimeDestino", A717Tpmo_ImprimeDestino);
         n717Tpmo_ImprimeDestino = T000V13_n717Tpmo_ImprimeDestino[0] ;
         A718Tmpo_ImprimeResponsable = T000V13_A718Tmpo_ImprimeResponsable[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718Tmpo_ImprimeResponsable", A718Tmpo_ImprimeResponsable);
         n718Tmpo_ImprimeResponsable = T000V13_n718Tmpo_ImprimeResponsable[0] ;
         A33Tipo_Codigo = T000V13_A33Tipo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         A39Tpmo_AlmacenOrigenId = T000V13_A39Tpmo_AlmacenOrigenId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39Tpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( A39Tpmo_AlmacenOrigenId, 11, 0)));
         A40Tpmo_AlmacenDestinoId = T000V13_A40Tpmo_AlmacenDestinoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40Tpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( A40Tpmo_AlmacenDestinoId, 11, 0)));
         zm0V31( -19) ;
      }
      pr_default.close(11);
      onLoadActions0V31( ) ;
   }

   public void onLoadActions0V31( )
   {
      AV18Pgmname = "ALM_TIPO_MOVIMIENTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
   }

   public void checkExtendedTable0V31( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV18Pgmname = "ALM_TIPO_MOVIMIENTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
      /* Using cursor T000V10 */
      pr_default.execute(8, new Object[] {new Long(A33Tipo_Codigo)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE ELEMENTO'.", "ForeignKeyNotFound", 1, "TIPO_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipo_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A253Tipo_Descripcion = T000V10_A253Tipo_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
      A480Tipo_Tipo = T000V10_A480Tipo_Tipo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
      pr_default.close(8);
      /* Using cursor T000V11 */
      pr_default.execute(9, new Object[] {new Long(A39Tpmo_AlmacenOrigenId)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo_Alma_Origen'.", "ForeignKeyNotFound", 1, "TPMO_ALMACENORIGENID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpmo_AlmacenOrigenId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A312Tpmo_AlmacenOrigenDescrip = T000V11_A312Tpmo_AlmacenOrigenDescrip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A312Tpmo_AlmacenOrigenDescrip", A312Tpmo_AlmacenOrigenDescrip);
      n312Tpmo_AlmacenOrigenDescrip = T000V11_n312Tpmo_AlmacenOrigenDescrip[0] ;
      pr_default.close(9);
      /* Using cursor T000V12 */
      pr_default.execute(10, new Object[] {new Long(A40Tpmo_AlmacenDestinoId)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo_Alma_Destino'.", "ForeignKeyNotFound", 1, "TPMO_ALMACENDESTINOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpmo_AlmacenDestinoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A314Tpmo_AlmacenDestinoDescrip = T000V12_A314Tpmo_AlmacenDestinoDescrip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A314Tpmo_AlmacenDestinoDescrip", A314Tpmo_AlmacenDestinoDescrip);
      n314Tpmo_AlmacenDestinoDescrip = T000V12_n314Tpmo_AlmacenDestinoDescrip[0] ;
      pr_default.close(10);
   }

   public void closeExtendedTableCursors0V31( )
   {
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_20( long A33Tipo_Codigo )
   {
      /* Using cursor T000V14 */
      pr_default.execute(12, new Object[] {new Long(A33Tipo_Codigo)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE ELEMENTO'.", "ForeignKeyNotFound", 1, "TIPO_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipo_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A253Tipo_Descripcion = T000V14_A253Tipo_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
      A480Tipo_Tipo = T000V14_A480Tipo_Tipo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A253Tipo_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A480Tipo_Tipo))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(12);
   }

   public void gxload_21( long A39Tpmo_AlmacenOrigenId )
   {
      /* Using cursor T000V15 */
      pr_default.execute(13, new Object[] {new Long(A39Tpmo_AlmacenOrigenId)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo_Alma_Origen'.", "ForeignKeyNotFound", 1, "TPMO_ALMACENORIGENID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpmo_AlmacenOrigenId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A312Tpmo_AlmacenOrigenDescrip = T000V15_A312Tpmo_AlmacenOrigenDescrip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A312Tpmo_AlmacenOrigenDescrip", A312Tpmo_AlmacenOrigenDescrip);
      n312Tpmo_AlmacenOrigenDescrip = T000V15_n312Tpmo_AlmacenOrigenDescrip[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A312Tpmo_AlmacenOrigenDescrip)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(13);
   }

   public void gxload_22( long A40Tpmo_AlmacenDestinoId )
   {
      /* Using cursor T000V16 */
      pr_default.execute(14, new Object[] {new Long(A40Tpmo_AlmacenDestinoId)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo_Alma_Destino'.", "ForeignKeyNotFound", 1, "TPMO_ALMACENDESTINOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpmo_AlmacenDestinoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A314Tpmo_AlmacenDestinoDescrip = T000V16_A314Tpmo_AlmacenDestinoDescrip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A314Tpmo_AlmacenDestinoDescrip", A314Tpmo_AlmacenDestinoDescrip);
      n314Tpmo_AlmacenDestinoDescrip = T000V16_n314Tpmo_AlmacenDestinoDescrip[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A314Tpmo_AlmacenDestinoDescrip)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(14);
   }

   public void getKey0V31( )
   {
      /* Using cursor T000V17 */
      pr_default.execute(15, new Object[] {A38Tpmo_Codigo});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound31 = (short)(1) ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000V9 */
      pr_default.execute(7, new Object[] {A38Tpmo_Codigo});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm0V31( 19) ;
         RcdFound31 = (short)(1) ;
         A38Tpmo_Codigo = T000V9_A38Tpmo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
         A317Tpmo_UsuarioCrea = T000V9_A317Tpmo_UsuarioCrea[0] ;
         A318Tpmo_FechaCrea = T000V9_A318Tpmo_FechaCrea[0] ;
         A319Tpmo_UsuarioModifica = T000V9_A319Tpmo_UsuarioModifica[0] ;
         n319Tpmo_UsuarioModifica = T000V9_n319Tpmo_UsuarioModifica[0] ;
         A320Tpmo_FechaModifica = T000V9_A320Tpmo_FechaModifica[0] ;
         n320Tpmo_FechaModifica = T000V9_n320Tpmo_FechaModifica[0] ;
         A313Tpmo_Descripcion = T000V9_A313Tpmo_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A313Tpmo_Descripcion", A313Tpmo_Descripcion);
         A315Tpmo_TipoE_S = T000V9_A315Tpmo_TipoE_S[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A315Tpmo_TipoE_S", A315Tpmo_TipoE_S);
         A316Tpmo_Modulo = T000V9_A316Tpmo_Modulo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A316Tpmo_Modulo", A316Tpmo_Modulo);
         A440Tpmo_IngresaAredante = T000V9_A440Tpmo_IngresaAredante[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A440Tpmo_IngresaAredante", A440Tpmo_IngresaAredante);
         A441Tpmo_IngresaCurso = T000V9_A441Tpmo_IngresaCurso[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A441Tpmo_IngresaCurso", A441Tpmo_IngresaCurso);
         A595Tpmo_ConsecutivoTrans = T000V9_A595Tpmo_ConsecutivoTrans[0] ;
         n595Tpmo_ConsecutivoTrans = T000V9_n595Tpmo_ConsecutivoTrans[0] ;
         A633Tpmo_Controlado = T000V9_A633Tpmo_Controlado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A633Tpmo_Controlado", A633Tpmo_Controlado);
         n633Tpmo_Controlado = T000V9_n633Tpmo_Controlado[0] ;
         A641Tpmo_VidaUtil = T000V9_A641Tpmo_VidaUtil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A641Tpmo_VidaUtil", A641Tpmo_VidaUtil);
         n641Tpmo_VidaUtil = T000V9_n641Tpmo_VidaUtil[0] ;
         A679Tpmo_Estado = T000V9_A679Tpmo_Estado[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A679Tpmo_Estado", A679Tpmo_Estado);
         n679Tpmo_Estado = T000V9_n679Tpmo_Estado[0] ;
         A680Tpmo_CuentaResponsabilidad = T000V9_A680Tpmo_CuentaResponsabilidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A680Tpmo_CuentaResponsabilidad", A680Tpmo_CuentaResponsabilidad);
         n680Tpmo_CuentaResponsabilidad = T000V9_n680Tpmo_CuentaResponsabilidad[0] ;
         A705Tpmo_SolicitaRegionDestino = T000V9_A705Tpmo_SolicitaRegionDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705Tpmo_SolicitaRegionDestino", A705Tpmo_SolicitaRegionDestino);
         n705Tpmo_SolicitaRegionDestino = T000V9_n705Tpmo_SolicitaRegionDestino[0] ;
         A706Tpmo_SolicitaCentroDestino = T000V9_A706Tpmo_SolicitaCentroDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A706Tpmo_SolicitaCentroDestino", A706Tpmo_SolicitaCentroDestino);
         n706Tpmo_SolicitaCentroDestino = T000V9_n706Tpmo_SolicitaCentroDestino[0] ;
         A716Tpmo_ImprimeOrigen = T000V9_A716Tpmo_ImprimeOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A716Tpmo_ImprimeOrigen", A716Tpmo_ImprimeOrigen);
         n716Tpmo_ImprimeOrigen = T000V9_n716Tpmo_ImprimeOrigen[0] ;
         A717Tpmo_ImprimeDestino = T000V9_A717Tpmo_ImprimeDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A717Tpmo_ImprimeDestino", A717Tpmo_ImprimeDestino);
         n717Tpmo_ImprimeDestino = T000V9_n717Tpmo_ImprimeDestino[0] ;
         A718Tmpo_ImprimeResponsable = T000V9_A718Tmpo_ImprimeResponsable[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718Tmpo_ImprimeResponsable", A718Tmpo_ImprimeResponsable);
         n718Tmpo_ImprimeResponsable = T000V9_n718Tmpo_ImprimeResponsable[0] ;
         A33Tipo_Codigo = T000V9_A33Tipo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
         A39Tpmo_AlmacenOrigenId = T000V9_A39Tpmo_AlmacenOrigenId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39Tpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( A39Tpmo_AlmacenOrigenId, 11, 0)));
         A40Tpmo_AlmacenDestinoId = T000V9_A40Tpmo_AlmacenDestinoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40Tpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( A40Tpmo_AlmacenDestinoId, 11, 0)));
         Z38Tpmo_Codigo = A38Tpmo_Codigo ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0V31( ) ;
         if ( AnyError == 1 )
         {
            RcdFound31 = (short)(0) ;
            initializeNonKey0V31( ) ;
         }
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound31 = (short)(0) ;
         initializeNonKey0V31( ) ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey0V31( ) ;
      if ( RcdFound31 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound31 = (short)(0) ;
      /* Using cursor T000V18 */
      pr_default.execute(16, new Object[] {A38Tpmo_Codigo});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T000V18_A38Tpmo_Codigo[0], A38Tpmo_Codigo) < 0 ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T000V18_A38Tpmo_Codigo[0], A38Tpmo_Codigo) > 0 ) ) )
         {
            A38Tpmo_Codigo = T000V18_A38Tpmo_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound31 = (short)(0) ;
      /* Using cursor T000V19 */
      pr_default.execute(17, new Object[] {A38Tpmo_Codigo});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T000V19_A38Tpmo_Codigo[0], A38Tpmo_Codigo) > 0 ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T000V19_A38Tpmo_Codigo[0], A38Tpmo_Codigo) < 0 ) ) )
         {
            A38Tpmo_Codigo = T000V19_A38Tpmo_Codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0V31( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTpmo_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0V31( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound31 == 1 )
         {
            if ( GXutil.strcmp(A38Tpmo_Codigo, Z38Tpmo_Codigo) != 0 )
            {
               A38Tpmo_Codigo = Z38Tpmo_Codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TPMO_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTpmo_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTpmo_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0V31( ) ;
               GX_FocusControl = edtTpmo_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A38Tpmo_Codigo, Z38Tpmo_Codigo) != 0 )
            {
               /* Insert record */
               GX_FocusControl = edtTpmo_Codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0V31( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TPMO_CODIGO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTpmo_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTpmo_Codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0V31( ) ;
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
      if ( GXutil.strcmp(A38Tpmo_Codigo, Z38Tpmo_Codigo) != 0 )
      {
         A38Tpmo_Codigo = Z38Tpmo_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TPMO_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpmo_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTpmo_Codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0V31( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000V8 */
         pr_default.execute(6, new Object[] {A38Tpmo_Codigo});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_MOVIMIENTO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z317Tpmo_UsuarioCrea, T000V8_A317Tpmo_UsuarioCrea[0]) != 0 ) || !( GXutil.dateCompare(Z318Tpmo_FechaCrea, T000V8_A318Tpmo_FechaCrea[0]) ) || ( GXutil.strcmp(Z319Tpmo_UsuarioModifica, T000V8_A319Tpmo_UsuarioModifica[0]) != 0 ) || !( GXutil.dateCompare(Z320Tpmo_FechaModifica, T000V8_A320Tpmo_FechaModifica[0]) ) || ( GXutil.strcmp(Z313Tpmo_Descripcion, T000V8_A313Tpmo_Descripcion[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z315Tpmo_TipoE_S, T000V8_A315Tpmo_TipoE_S[0]) != 0 ) || ( GXutil.strcmp(Z316Tpmo_Modulo, T000V8_A316Tpmo_Modulo[0]) != 0 ) || ( GXutil.strcmp(Z440Tpmo_IngresaAredante, T000V8_A440Tpmo_IngresaAredante[0]) != 0 ) || ( GXutil.strcmp(Z441Tpmo_IngresaCurso, T000V8_A441Tpmo_IngresaCurso[0]) != 0 ) || ( Z595Tpmo_ConsecutivoTrans != T000V8_A595Tpmo_ConsecutivoTrans[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z633Tpmo_Controlado, T000V8_A633Tpmo_Controlado[0]) != 0 ) || ( GXutil.strcmp(Z641Tpmo_VidaUtil, T000V8_A641Tpmo_VidaUtil[0]) != 0 ) || ( GXutil.strcmp(Z679Tpmo_Estado, T000V8_A679Tpmo_Estado[0]) != 0 ) || ( GXutil.strcmp(Z680Tpmo_CuentaResponsabilidad, T000V8_A680Tpmo_CuentaResponsabilidad[0]) != 0 ) || ( GXutil.strcmp(Z705Tpmo_SolicitaRegionDestino, T000V8_A705Tpmo_SolicitaRegionDestino[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z706Tpmo_SolicitaCentroDestino, T000V8_A706Tpmo_SolicitaCentroDestino[0]) != 0 ) || ( GXutil.strcmp(Z716Tpmo_ImprimeOrigen, T000V8_A716Tpmo_ImprimeOrigen[0]) != 0 ) || ( GXutil.strcmp(Z717Tpmo_ImprimeDestino, T000V8_A717Tpmo_ImprimeDestino[0]) != 0 ) || ( GXutil.strcmp(Z718Tmpo_ImprimeResponsable, T000V8_A718Tmpo_ImprimeResponsable[0]) != 0 ) || ( Z33Tipo_Codigo != T000V8_A33Tipo_Codigo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z39Tpmo_AlmacenOrigenId != T000V8_A39Tpmo_AlmacenOrigenId[0] ) || ( Z40Tpmo_AlmacenDestinoId != T000V8_A40Tpmo_AlmacenDestinoId[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_TIPO_MOVIMIENTO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0V31( )
   {
      beforeValidate0V31( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V31( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0V31( 0) ;
         checkOptimisticConcurrency0V31( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V31( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0V31( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000V20 */
                  pr_default.execute(18, new Object[] {A38Tpmo_Codigo, A317Tpmo_UsuarioCrea, A318Tpmo_FechaCrea, new Boolean(n319Tpmo_UsuarioModifica), A319Tpmo_UsuarioModifica, new Boolean(n320Tpmo_FechaModifica), A320Tpmo_FechaModifica, A313Tpmo_Descripcion, A315Tpmo_TipoE_S, A316Tpmo_Modulo, A440Tpmo_IngresaAredante, A441Tpmo_IngresaCurso, new Boolean(n595Tpmo_ConsecutivoTrans), new Long(A595Tpmo_ConsecutivoTrans), new Boolean(n633Tpmo_Controlado), A633Tpmo_Controlado, new Boolean(n641Tpmo_VidaUtil), A641Tpmo_VidaUtil, new Boolean(n679Tpmo_Estado), A679Tpmo_Estado, new Boolean(n680Tpmo_CuentaResponsabilidad), A680Tpmo_CuentaResponsabilidad, new Boolean(n705Tpmo_SolicitaRegionDestino), A705Tpmo_SolicitaRegionDestino, new Boolean(n706Tpmo_SolicitaCentroDestino), A706Tpmo_SolicitaCentroDestino, new Boolean(n716Tpmo_ImprimeOrigen), A716Tpmo_ImprimeOrigen, new Boolean(n717Tpmo_ImprimeDestino), A717Tpmo_ImprimeDestino, new Boolean(n718Tmpo_ImprimeResponsable), A718Tmpo_ImprimeResponsable, new Long(A33Tipo_Codigo), new Long(A39Tpmo_AlmacenOrigenId), new Long(A40Tpmo_AlmacenDestinoId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_MOVIMIENTO") ;
                  if ( (pr_default.getStatus(18) == 1) )
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
                        processLevel0V31( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption0V0( ) ;
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
            load0V31( ) ;
         }
         endLevel0V31( ) ;
      }
      closeExtendedTableCursors0V31( ) ;
   }

   public void update0V31( )
   {
      beforeValidate0V31( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V31( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V31( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V31( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0V31( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000V21 */
                  pr_default.execute(19, new Object[] {A317Tpmo_UsuarioCrea, A318Tpmo_FechaCrea, new Boolean(n319Tpmo_UsuarioModifica), A319Tpmo_UsuarioModifica, new Boolean(n320Tpmo_FechaModifica), A320Tpmo_FechaModifica, A313Tpmo_Descripcion, A315Tpmo_TipoE_S, A316Tpmo_Modulo, A440Tpmo_IngresaAredante, A441Tpmo_IngresaCurso, new Boolean(n595Tpmo_ConsecutivoTrans), new Long(A595Tpmo_ConsecutivoTrans), new Boolean(n633Tpmo_Controlado), A633Tpmo_Controlado, new Boolean(n641Tpmo_VidaUtil), A641Tpmo_VidaUtil, new Boolean(n679Tpmo_Estado), A679Tpmo_Estado, new Boolean(n680Tpmo_CuentaResponsabilidad), A680Tpmo_CuentaResponsabilidad, new Boolean(n705Tpmo_SolicitaRegionDestino), A705Tpmo_SolicitaRegionDestino, new Boolean(n706Tpmo_SolicitaCentroDestino), A706Tpmo_SolicitaCentroDestino, new Boolean(n716Tpmo_ImprimeOrigen), A716Tpmo_ImprimeOrigen, new Boolean(n717Tpmo_ImprimeDestino), A717Tpmo_ImprimeDestino, new Boolean(n718Tmpo_ImprimeResponsable), A718Tmpo_ImprimeResponsable, new Long(A33Tipo_Codigo), new Long(A39Tpmo_AlmacenOrigenId), new Long(A40Tpmo_AlmacenDestinoId), A38Tpmo_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_MOVIMIENTO") ;
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_MOVIMIENTO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0V31( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0V31( ) ;
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
         endLevel0V31( ) ;
      }
      closeExtendedTableCursors0V31( ) ;
   }

   public void deferredUpdate0V31( )
   {
   }

   public void delete( )
   {
      beforeValidate0V31( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V31( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0V31( ) ;
         afterConfirm0V31( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0V31( ) ;
            if ( AnyError == 0 )
            {
               scanStart0V60( ) ;
               while ( RcdFound60 != 0 )
               {
                  getByPrimaryKey0V60( ) ;
                  delete0V60( ) ;
                  scanNext0V60( ) ;
               }
               scanEnd0V60( ) ;
               scanStart0V32( ) ;
               while ( RcdFound32 != 0 )
               {
                  getByPrimaryKey0V32( ) ;
                  delete0V32( ) ;
                  scanNext0V32( ) ;
               }
               scanEnd0V32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000V22 */
                  pr_default.execute(20, new Object[] {A38Tpmo_Codigo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_MOVIMIENTO") ;
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
      sMode31 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0V31( ) ;
      Gx_mode = sMode31 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0V31( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV18Pgmname = "ALM_TIPO_MOVIMIENTO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
         /* Using cursor T000V23 */
         pr_default.execute(21, new Object[] {new Long(A33Tipo_Codigo)});
         A253Tipo_Descripcion = T000V23_A253Tipo_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
         A480Tipo_Tipo = T000V23_A480Tipo_Tipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
         pr_default.close(21);
         /* Using cursor T000V24 */
         pr_default.execute(22, new Object[] {new Long(A39Tpmo_AlmacenOrigenId)});
         A312Tpmo_AlmacenOrigenDescrip = T000V24_A312Tpmo_AlmacenOrigenDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A312Tpmo_AlmacenOrigenDescrip", A312Tpmo_AlmacenOrigenDescrip);
         n312Tpmo_AlmacenOrigenDescrip = T000V24_n312Tpmo_AlmacenOrigenDescrip[0] ;
         pr_default.close(22);
         /* Using cursor T000V25 */
         pr_default.execute(23, new Object[] {new Long(A40Tpmo_AlmacenDestinoId)});
         A314Tpmo_AlmacenDestinoDescrip = T000V25_A314Tpmo_AlmacenDestinoDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A314Tpmo_AlmacenDestinoDescrip", A314Tpmo_AlmacenDestinoDescrip);
         n314Tpmo_AlmacenDestinoDescrip = T000V25_n314Tpmo_AlmacenDestinoDescrip[0] ;
         pr_default.close(23);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000V26 */
         pr_default.execute(24, new Object[] {A38Tpmo_Codigo});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ALM_RESTRICCIONES"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T000V27 */
         pr_default.execute(25, new Object[] {A38Tpmo_Codigo});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"TRANSACCION"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
      }
   }

   public void processNestedLevel0V32( )
   {
      nGXsfl_113_idx = (short)(0) ;
      while ( nGXsfl_113_idx < nRC_GXsfl_113 )
      {
         readRow0V32( ) ;
         if ( ( nRcdExists_32 != 0 ) || ( nIsMod_32 != 0 ) )
         {
            standaloneNotModal0V32( ) ;
            getKey0V32( ) ;
            if ( ( nRcdExists_32 == 0 ) && ( nRcdDeleted_32 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert0V32( ) ;
            }
            else
            {
               if ( RcdFound32 != 0 )
               {
                  if ( ( nRcdDeleted_32 != 0 ) && ( nRcdExists_32 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete0V32( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_32 != 0 ) && ( nRcdExists_32 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update0V32( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_32 == 0 )
                  {
                     GXCCtl = "ORIG_IDENTIFICADOR_" + sGXsfl_113_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOrig_Identificador_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOrig_Identificador_Internalname, GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtOrig_Descripcion_Internalname, A635Orig_Descripcion) ;
         httpContext.changePostValue( cmbTpmo_SolicitaNumero.getInternalname(), A642Tpmo_SolicitaNumero) ;
         httpContext.changePostValue( cmbTpmo_SolicitaFecha.getInternalname(), A643Tpmo_SolicitaFecha) ;
         httpContext.changePostValue( cmbTpmo_EstadoOrigen.getInternalname(), GXutil.rtrim( A681Tpmo_EstadoOrigen)) ;
         httpContext.changePostValue( "ZT_"+"Z41Orig_Identificador_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( Z41Orig_Identificador, (byte)(11), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z642Tpmo_SolicitaNumero_"+sGXsfl_113_idx, Z642Tpmo_SolicitaNumero) ;
         httpContext.changePostValue( "ZT_"+"Z643Tpmo_SolicitaFecha_"+sGXsfl_113_idx, Z643Tpmo_SolicitaFecha) ;
         httpContext.changePostValue( "ZT_"+"Z681Tpmo_EstadoOrigen_"+sGXsfl_113_idx, GXutil.rtrim( Z681Tpmo_EstadoOrigen)) ;
         httpContext.changePostValue( "nRcdDeleted_32_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_32, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_32_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_32, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_32_"+sGXsfl_113_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_32, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_32 != 0 )
         {
            httpContext.changePostValue( "ORIG_IDENTIFICADOR_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrig_Identificador_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ORIG_DESCRIPCION_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrig_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TPMO_SOLICITANUMERO_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTpmo_SolicitaNumero.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TPMO_SOLICITAFECHA_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTpmo_SolicitaFecha.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TPMO_ESTADOORIGEN_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTpmo_EstadoOrigen.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0V32( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_32 = (short)(0) ;
      nIsMod_32 = (short)(0) ;
      nRcdDeleted_32 = (short)(0) ;
   }

   public void processNestedLevel0V60( )
   {
      nGXsfl_127_idx = (short)(0) ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         readRow0V60( ) ;
         if ( ( nRcdExists_60 != 0 ) || ( nIsMod_60 != 0 ) )
         {
            standaloneNotModal0V60( ) ;
            getKey0V60( ) ;
            if ( ( nRcdExists_60 == 0 ) && ( nRcdDeleted_60 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert0V60( ) ;
            }
            else
            {
               if ( RcdFound60 != 0 )
               {
                  if ( ( nRcdDeleted_60 != 0 ) && ( nRcdExists_60 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete0V60( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_60 != 0 ) && ( nRcdExists_60 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update0V60( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_60 == 0 )
                  {
                     GXCCtl = "DOCU_NRO_" + sGXsfl_127_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDocu_Nro_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDocu_Nro_Internalname, GXutil.ltrim( localUtil.ntoc( A819Docu_Nro, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtDocu_Descripcion_Internalname, A820Docu_Descripcion) ;
         httpContext.changePostValue( edtDocu_Prefijo_Internalname, A821Docu_Prefijo) ;
         httpContext.changePostValue( "ZT_"+"Z819Docu_Nro_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( Z819Docu_Nro, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_60_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_60, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_60_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_60, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_60_"+sGXsfl_127_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_60, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_60 != 0 )
         {
            httpContext.changePostValue( "DOCU_NRO_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDocu_Nro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DOCU_DESCRIPCION_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDocu_Descripcion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DOCU_PREFIJO_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDocu_Prefijo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0V60( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_60 = (short)(0) ;
      nIsMod_60 = (short)(0) ;
      nRcdDeleted_60 = (short)(0) ;
   }

   public void processLevel0V31( )
   {
      /* Save parent mode. */
      sMode31 = Gx_mode ;
      processNestedLevel0V32( ) ;
      processNestedLevel0V60( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode31 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      /* ' Update level parameters */
   }

   public void endLevel0V31( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0V31( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_tipo_movimiento");
         if ( AnyError == 0 )
         {
            confirmValues0V0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_tipo_movimiento");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0V31( )
   {
      /* Scan By routine */
      /* Using cursor T000V28 */
      pr_default.execute(26);
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A38Tpmo_Codigo = T000V28_A38Tpmo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0V31( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A38Tpmo_Codigo = T000V28_A38Tpmo_Codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
      }
   }

   public void scanEnd0V31( )
   {
      pr_default.close(26);
   }

   public void afterConfirm0V31( )
   {
      /* After Confirm Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A318Tpmo_FechaCrea = GXutil.now( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A318Tpmo_FechaCrea", localUtil.ttoc( A318Tpmo_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "UDP") == 0 ) && true /* After */ )
      {
         A320Tpmo_FechaModifica = GXutil.now( ) ;
         n320Tpmo_FechaModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A320Tpmo_FechaModifica", localUtil.ttoc( A320Tpmo_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         A317Tpmo_UsuarioCrea = AV16Usuario ;
         httpContext.ajax_rsp_assign_attri("", false, "A317Tpmo_UsuarioCrea", A317Tpmo_UsuarioCrea);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UDP") == 0 ) && true /* After */ )
      {
         A319Tpmo_UsuarioModifica = AV16Usuario ;
         n319Tpmo_UsuarioModifica = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A319Tpmo_UsuarioModifica", A319Tpmo_UsuarioModifica);
      }
   }

   public void beforeInsert0V31( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0V31( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0V31( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0V31( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0V31( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0V31( )
   {
      edtTpmo_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpmo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_Codigo_Enabled, 5, 0)), true);
      edtTpmo_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpmo_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_Descripcion_Enabled, 5, 0)), true);
      edtTipo_Codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipo_Codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Codigo_Enabled, 5, 0)), true);
      edtTipo_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipo_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTipo_Descripcion_Enabled, 5, 0)), true);
      cmbTipo_Tipo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTipo_Tipo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTipo_Tipo.getEnabled(), 5, 0)), true);
      edtTpmo_AlmacenOrigenId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpmo_AlmacenOrigenId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_AlmacenOrigenId_Enabled, 5, 0)), true);
      edtTpmo_AlmacenOrigenDescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpmo_AlmacenOrigenDescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_AlmacenOrigenDescrip_Enabled, 5, 0)), true);
      edtTpmo_AlmacenDestinoId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpmo_AlmacenDestinoId_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_AlmacenDestinoId_Enabled, 5, 0)), true);
      edtTpmo_AlmacenDestinoDescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTpmo_AlmacenDestinoDescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTpmo_AlmacenDestinoDescrip_Enabled, 5, 0)), true);
      cmbTpmo_TipoE_S.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_TipoE_S.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_TipoE_S.getEnabled(), 5, 0)), true);
      cmbTpmo_Modulo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_Modulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_Modulo.getEnabled(), 5, 0)), true);
      cmbTpmo_IngresaAredante.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_IngresaAredante.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_IngresaAredante.getEnabled(), 5, 0)), true);
      cmbTpmo_IngresaCurso.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_IngresaCurso.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_IngresaCurso.getEnabled(), 5, 0)), true);
      cmbTpmo_Controlado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_Controlado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_Controlado.getEnabled(), 5, 0)), true);
      cmbTpmo_VidaUtil.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_VidaUtil.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_VidaUtil.getEnabled(), 5, 0)), true);
      cmbTpmo_CuentaResponsabilidad.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_CuentaResponsabilidad.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_CuentaResponsabilidad.getEnabled(), 5, 0)), true);
      cmbTpmo_SolicitaRegionDestino.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_SolicitaRegionDestino.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_SolicitaRegionDestino.getEnabled(), 5, 0)), true);
      cmbTpmo_SolicitaCentroDestino.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_SolicitaCentroDestino.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_SolicitaCentroDestino.getEnabled(), 5, 0)), true);
      cmbTpmo_ImprimeOrigen.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_ImprimeOrigen.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_ImprimeOrigen.getEnabled(), 5, 0)), true);
      cmbTpmo_ImprimeDestino.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_ImprimeDestino.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_ImprimeDestino.getEnabled(), 5, 0)), true);
      cmbTmpo_ImprimeResponsable.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTmpo_ImprimeResponsable.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTmpo_ImprimeResponsable.getEnabled(), 5, 0)), true);
      cmbTpmo_Estado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_Estado.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_Estado.getEnabled(), 5, 0)), true);
   }

   public void zm0V32( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z642Tpmo_SolicitaNumero = T000V6_A642Tpmo_SolicitaNumero[0] ;
            Z643Tpmo_SolicitaFecha = T000V6_A643Tpmo_SolicitaFecha[0] ;
            Z681Tpmo_EstadoOrigen = T000V6_A681Tpmo_EstadoOrigen[0] ;
         }
         else
         {
            Z642Tpmo_SolicitaNumero = A642Tpmo_SolicitaNumero ;
            Z643Tpmo_SolicitaFecha = A643Tpmo_SolicitaFecha ;
            Z681Tpmo_EstadoOrigen = A681Tpmo_EstadoOrigen ;
         }
      }
      if ( GX_JID == -23 )
      {
         Z38Tpmo_Codigo = A38Tpmo_Codigo ;
         Z642Tpmo_SolicitaNumero = A642Tpmo_SolicitaNumero ;
         Z643Tpmo_SolicitaFecha = A643Tpmo_SolicitaFecha ;
         Z681Tpmo_EstadoOrigen = A681Tpmo_EstadoOrigen ;
         Z41Orig_Identificador = A41Orig_Identificador ;
         Z635Orig_Descripcion = A635Orig_Descripcion ;
      }
   }

   public void standaloneNotModal0V32( )
   {
   }

   public void standaloneModal0V32( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOrig_Identificador_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOrig_Identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOrig_Identificador_Enabled, 5, 0)), !bGXsfl_113_Refreshing);
      }
      else
      {
         edtOrig_Identificador_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOrig_Identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOrig_Identificador_Enabled, 5, 0)), !bGXsfl_113_Refreshing);
      }
   }

   public void load0V32( )
   {
      /* Using cursor T000V29 */
      pr_default.execute(27, new Object[] {A38Tpmo_Codigo, new Long(A41Orig_Identificador)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A635Orig_Descripcion = T000V29_A635Orig_Descripcion[0] ;
         n635Orig_Descripcion = T000V29_n635Orig_Descripcion[0] ;
         A642Tpmo_SolicitaNumero = T000V29_A642Tpmo_SolicitaNumero[0] ;
         A643Tpmo_SolicitaFecha = T000V29_A643Tpmo_SolicitaFecha[0] ;
         A681Tpmo_EstadoOrigen = T000V29_A681Tpmo_EstadoOrigen[0] ;
         n681Tpmo_EstadoOrigen = T000V29_n681Tpmo_EstadoOrigen[0] ;
         zm0V32( -23) ;
      }
      pr_default.close(27);
      onLoadActions0V32( ) ;
   }

   public void onLoadActions0V32( )
   {
   }

   public void checkExtendedTable0V32( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0V32( ) ;
      /* Using cursor T000V7 */
      pr_default.execute(5, new Object[] {new Long(A41Orig_Identificador)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "ORIG_IDENTIFICADOR_" + sGXsfl_113_idx ;
         httpContext.GX_msglist.addItem("No existe 'Origen de los bienes'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrig_Identificador_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A635Orig_Descripcion = T000V7_A635Orig_Descripcion[0] ;
      n635Orig_Descripcion = T000V7_n635Orig_Descripcion[0] ;
      pr_default.close(5);
   }

   public void closeExtendedTableCursors0V32( )
   {
      pr_default.close(5);
   }

   public void enableDisable0V32( )
   {
   }

   public void gxload_24( long A41Orig_Identificador )
   {
      /* Using cursor T000V30 */
      pr_default.execute(28, new Object[] {new Long(A41Orig_Identificador)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         GXCCtl = "ORIG_IDENTIFICADOR_" + sGXsfl_113_idx ;
         httpContext.GX_msglist.addItem("No existe 'Origen de los bienes'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrig_Identificador_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A635Orig_Descripcion = T000V30_A635Orig_Descripcion[0] ;
      n635Orig_Descripcion = T000V30_n635Orig_Descripcion[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A635Orig_Descripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(28);
   }

   public void getKey0V32( )
   {
      /* Using cursor T000V31 */
      pr_default.execute(29, new Object[] {A38Tpmo_Codigo, new Long(A41Orig_Identificador)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound32 = (short)(1) ;
      }
      else
      {
         RcdFound32 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKey0V32( )
   {
      /* Using cursor T000V6 */
      pr_default.execute(4, new Object[] {A38Tpmo_Codigo, new Long(A41Orig_Identificador)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm0V32( 23) ;
         RcdFound32 = (short)(1) ;
         initializeNonKey0V32( ) ;
         A642Tpmo_SolicitaNumero = T000V6_A642Tpmo_SolicitaNumero[0] ;
         A643Tpmo_SolicitaFecha = T000V6_A643Tpmo_SolicitaFecha[0] ;
         A681Tpmo_EstadoOrigen = T000V6_A681Tpmo_EstadoOrigen[0] ;
         n681Tpmo_EstadoOrigen = T000V6_n681Tpmo_EstadoOrigen[0] ;
         A41Orig_Identificador = T000V6_A41Orig_Identificador[0] ;
         Z38Tpmo_Codigo = A38Tpmo_Codigo ;
         Z41Orig_Identificador = A41Orig_Identificador ;
         sMode32 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0V32( ) ;
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound32 = (short)(0) ;
         initializeNonKey0V32( ) ;
         sMode32 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal0V32( ) ;
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0V32( ) ;
      }
      pr_default.close(4);
   }

   public void checkOptimisticConcurrency0V32( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000V5 */
         pr_default.execute(3, new Object[] {A38Tpmo_Codigo, new Long(A41Orig_Identificador)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_MOVIMIENTO_ORIGEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z642Tpmo_SolicitaNumero, T000V5_A642Tpmo_SolicitaNumero[0]) != 0 ) || ( GXutil.strcmp(Z643Tpmo_SolicitaFecha, T000V5_A643Tpmo_SolicitaFecha[0]) != 0 ) || ( GXutil.strcmp(Z681Tpmo_EstadoOrigen, T000V5_A681Tpmo_EstadoOrigen[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_TIPO_MOVIMIENTO_ORIGEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0V32( )
   {
      beforeValidate0V32( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V32( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0V32( 0) ;
         checkOptimisticConcurrency0V32( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V32( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0V32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000V32 */
                  pr_default.execute(30, new Object[] {A38Tpmo_Codigo, A642Tpmo_SolicitaNumero, A643Tpmo_SolicitaFecha, new Boolean(n681Tpmo_EstadoOrigen), A681Tpmo_EstadoOrigen, new Long(A41Orig_Identificador)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_MOVIMIENTO_ORIGEN") ;
                  if ( (pr_default.getStatus(30) == 1) )
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
            load0V32( ) ;
         }
         endLevel0V32( ) ;
      }
      closeExtendedTableCursors0V32( ) ;
   }

   public void update0V32( )
   {
      beforeValidate0V32( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V32( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V32( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V32( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0V32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000V33 */
                  pr_default.execute(31, new Object[] {A642Tpmo_SolicitaNumero, A643Tpmo_SolicitaFecha, new Boolean(n681Tpmo_EstadoOrigen), A681Tpmo_EstadoOrigen, A38Tpmo_Codigo, new Long(A41Orig_Identificador)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_MOVIMIENTO_ORIGEN") ;
                  if ( (pr_default.getStatus(31) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_MOVIMIENTO_ORIGEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0V32( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0V32( ) ;
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
         endLevel0V32( ) ;
      }
      closeExtendedTableCursors0V32( ) ;
   }

   public void deferredUpdate0V32( )
   {
   }

   public void delete0V32( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate0V32( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V32( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0V32( ) ;
         afterConfirm0V32( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0V32( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000V34 */
               pr_default.execute(32, new Object[] {A38Tpmo_Codigo, new Long(A41Orig_Identificador)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_MOVIMIENTO_ORIGEN") ;
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
      sMode32 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0V32( ) ;
      Gx_mode = sMode32 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0V32( )
   {
      standaloneModal0V32( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000V35 */
         pr_default.execute(33, new Object[] {new Long(A41Orig_Identificador)});
         A635Orig_Descripcion = T000V35_A635Orig_Descripcion[0] ;
         n635Orig_Descripcion = T000V35_n635Orig_Descripcion[0] ;
         pr_default.close(33);
      }
   }

   public void endLevel0V32( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(3);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0V32( )
   {
      /* Scan By routine */
      /* Using cursor T000V36 */
      pr_default.execute(34, new Object[] {A38Tpmo_Codigo});
      RcdFound32 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A41Orig_Identificador = T000V36_A41Orig_Identificador[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0V32( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound32 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A41Orig_Identificador = T000V36_A41Orig_Identificador[0] ;
      }
   }

   public void scanEnd0V32( )
   {
      pr_default.close(34);
   }

   public void afterConfirm0V32( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0V32( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0V32( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0V32( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0V32( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0V32( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0V32( )
   {
      edtOrig_Identificador_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrig_Identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOrig_Identificador_Enabled, 5, 0)), !bGXsfl_113_Refreshing);
      edtOrig_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrig_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOrig_Descripcion_Enabled, 5, 0)), !bGXsfl_113_Refreshing);
      cmbTpmo_SolicitaNumero.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_SolicitaNumero.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_SolicitaNumero.getEnabled(), 5, 0)), !bGXsfl_113_Refreshing);
      cmbTpmo_SolicitaFecha.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_SolicitaFecha.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_SolicitaFecha.getEnabled(), 5, 0)), !bGXsfl_113_Refreshing);
      cmbTpmo_EstadoOrigen.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_EstadoOrigen.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbTpmo_EstadoOrigen.getEnabled(), 5, 0)), !bGXsfl_113_Refreshing);
   }

   public void zm0V60( int GX_JID )
   {
      if ( ( GX_JID == 25 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -25 )
      {
         Z38Tpmo_Codigo = A38Tpmo_Codigo ;
         Z819Docu_Nro = A819Docu_Nro ;
         Z820Docu_Descripcion = A820Docu_Descripcion ;
         Z821Docu_Prefijo = A821Docu_Prefijo ;
      }
   }

   public void standaloneNotModal0V60( )
   {
   }

   public void standaloneModal0V60( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDocu_Nro_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDocu_Nro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Nro_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
      }
      else
      {
         edtDocu_Nro_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDocu_Nro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Nro_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
      }
   }

   public void load0V60( )
   {
      /* Using cursor T000V37 */
      pr_default.execute(35, new Object[] {A38Tpmo_Codigo, new Short(A819Docu_Nro)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound60 = (short)(1) ;
         A820Docu_Descripcion = T000V37_A820Docu_Descripcion[0] ;
         n820Docu_Descripcion = T000V37_n820Docu_Descripcion[0] ;
         A821Docu_Prefijo = T000V37_A821Docu_Prefijo[0] ;
         n821Docu_Prefijo = T000V37_n821Docu_Prefijo[0] ;
         zm0V60( -25) ;
      }
      pr_default.close(35);
      onLoadActions0V60( ) ;
   }

   public void onLoadActions0V60( )
   {
   }

   public void checkExtendedTable0V60( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0V60( ) ;
      /* Using cursor T000V4 */
      pr_default.execute(2, new Object[] {new Short(A819Docu_Nro)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "DOCU_NRO_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem("No existe 'ALM_DOCUMENTOS'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDocu_Nro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A820Docu_Descripcion = T000V4_A820Docu_Descripcion[0] ;
      n820Docu_Descripcion = T000V4_n820Docu_Descripcion[0] ;
      A821Docu_Prefijo = T000V4_A821Docu_Prefijo[0] ;
      n821Docu_Prefijo = T000V4_n821Docu_Prefijo[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors0V60( )
   {
      pr_default.close(2);
   }

   public void enableDisable0V60( )
   {
   }

   public void gxload_26( short A819Docu_Nro )
   {
      /* Using cursor T000V38 */
      pr_default.execute(36, new Object[] {new Short(A819Docu_Nro)});
      if ( (pr_default.getStatus(36) == 101) )
      {
         GXCCtl = "DOCU_NRO_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem("No existe 'ALM_DOCUMENTOS'.", "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDocu_Nro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A820Docu_Descripcion = T000V38_A820Docu_Descripcion[0] ;
      n820Docu_Descripcion = T000V38_n820Docu_Descripcion[0] ;
      A821Docu_Prefijo = T000V38_A821Docu_Prefijo[0] ;
      n821Docu_Prefijo = T000V38_n821Docu_Prefijo[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A820Docu_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A821Docu_Prefijo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(36);
   }

   public void getKey0V60( )
   {
      /* Using cursor T000V39 */
      pr_default.execute(37, new Object[] {A38Tpmo_Codigo, new Short(A819Docu_Nro)});
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound60 = (short)(1) ;
      }
      else
      {
         RcdFound60 = (short)(0) ;
      }
      pr_default.close(37);
   }

   public void getByPrimaryKey0V60( )
   {
      /* Using cursor T000V3 */
      pr_default.execute(1, new Object[] {A38Tpmo_Codigo, new Short(A819Docu_Nro)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0V60( 25) ;
         RcdFound60 = (short)(1) ;
         initializeNonKey0V60( ) ;
         A819Docu_Nro = T000V3_A819Docu_Nro[0] ;
         Z38Tpmo_Codigo = A38Tpmo_Codigo ;
         Z819Docu_Nro = A819Docu_Nro ;
         sMode60 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0V60( ) ;
         Gx_mode = sMode60 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound60 = (short)(0) ;
         initializeNonKey0V60( ) ;
         sMode60 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal0V60( ) ;
         Gx_mode = sMode60 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0V60( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0V60( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000V2 */
         pr_default.execute(0, new Object[] {A38Tpmo_Codigo, new Short(A819Docu_Nro)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_TIPO_MOVIMIENTO_DOCUMENTO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_TIPO_MOVIMIENTO_DOCUMENTO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0V60( )
   {
      beforeValidate0V60( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V60( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0V60( 0) ;
         checkOptimisticConcurrency0V60( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V60( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0V60( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000V40 */
                  pr_default.execute(38, new Object[] {A38Tpmo_Codigo, new Short(A819Docu_Nro)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_MOVIMIENTO_DOCUMENTO") ;
                  if ( (pr_default.getStatus(38) == 1) )
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
            load0V60( ) ;
         }
         endLevel0V60( ) ;
      }
      closeExtendedTableCursors0V60( ) ;
   }

   public void update0V60( )
   {
      beforeValidate0V60( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V60( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V60( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V60( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0V60( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table ALM_TIPO_MOVIMIENTO_DOCUMENTO */
                  deferredUpdate0V60( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0V60( ) ;
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
         endLevel0V60( ) ;
      }
      closeExtendedTableCursors0V60( ) ;
   }

   public void deferredUpdate0V60( )
   {
   }

   public void delete0V60( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate0V60( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V60( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0V60( ) ;
         afterConfirm0V60( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0V60( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000V41 */
               pr_default.execute(39, new Object[] {A38Tpmo_Codigo, new Short(A819Docu_Nro)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_TIPO_MOVIMIENTO_DOCUMENTO") ;
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
      sMode60 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0V60( ) ;
      Gx_mode = sMode60 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0V60( )
   {
      standaloneModal0V60( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000V42 */
         pr_default.execute(40, new Object[] {new Short(A819Docu_Nro)});
         A820Docu_Descripcion = T000V42_A820Docu_Descripcion[0] ;
         n820Docu_Descripcion = T000V42_n820Docu_Descripcion[0] ;
         A821Docu_Prefijo = T000V42_A821Docu_Prefijo[0] ;
         n821Docu_Prefijo = T000V42_n821Docu_Prefijo[0] ;
         pr_default.close(40);
      }
   }

   public void endLevel0V60( )
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

   public void scanStart0V60( )
   {
      /* Scan By routine */
      /* Using cursor T000V43 */
      pr_default.execute(41, new Object[] {A38Tpmo_Codigo});
      RcdFound60 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound60 = (short)(1) ;
         A819Docu_Nro = T000V43_A819Docu_Nro[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0V60( )
   {
      /* Scan next routine */
      pr_default.readNext(41);
      RcdFound60 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound60 = (short)(1) ;
         A819Docu_Nro = T000V43_A819Docu_Nro[0] ;
      }
   }

   public void scanEnd0V60( )
   {
      pr_default.close(41);
   }

   public void afterConfirm0V60( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0V60( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0V60( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0V60( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0V60( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0V60( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0V60( )
   {
      edtDocu_Nro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocu_Nro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Nro_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
      edtDocu_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocu_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Descripcion_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
      edtDocu_Prefijo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocu_Prefijo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Prefijo_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
   }

   public void subsflControlProps_11332( )
   {
      edtOrig_Identificador_Internalname = "ORIG_IDENTIFICADOR_"+sGXsfl_113_idx ;
      imgprompt_41_Internalname = "PROMPT_41_"+sGXsfl_113_idx ;
      edtOrig_Descripcion_Internalname = "ORIG_DESCRIPCION_"+sGXsfl_113_idx ;
      cmbTpmo_SolicitaNumero.setInternalname( "TPMO_SOLICITANUMERO_"+sGXsfl_113_idx );
      cmbTpmo_SolicitaFecha.setInternalname( "TPMO_SOLICITAFECHA_"+sGXsfl_113_idx );
      cmbTpmo_EstadoOrigen.setInternalname( "TPMO_ESTADOORIGEN_"+sGXsfl_113_idx );
   }

   public void subsflControlProps_fel_11332( )
   {
      edtOrig_Identificador_Internalname = "ORIG_IDENTIFICADOR_"+sGXsfl_113_fel_idx ;
      imgprompt_41_Internalname = "PROMPT_41_"+sGXsfl_113_fel_idx ;
      edtOrig_Descripcion_Internalname = "ORIG_DESCRIPCION_"+sGXsfl_113_fel_idx ;
      cmbTpmo_SolicitaNumero.setInternalname( "TPMO_SOLICITANUMERO_"+sGXsfl_113_fel_idx );
      cmbTpmo_SolicitaFecha.setInternalname( "TPMO_SOLICITAFECHA_"+sGXsfl_113_fel_idx );
      cmbTpmo_EstadoOrigen.setInternalname( "TPMO_ESTADOORIGEN_"+sGXsfl_113_fel_idx );
   }

   public void addRow0V32( )
   {
      nGXsfl_113_idx = (short)(nGXsfl_113_idx+1) ;
      sGXsfl_113_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_113_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_11332( ) ;
      sendRow0V32( ) ;
   }

   public void sendRow0V32( )
   {
      Gridalm_tipo_movimiento_tipo_movimiento_origenRow = GXWebRow.GetNew(context) ;
      if ( subGridalm_tipo_movimiento_tipo_movimiento_origen_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridalm_tipo_movimiento_tipo_movimiento_origen_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridalm_tipo_movimiento_tipo_movimiento_origen_Class, "") != 0 )
         {
            subGridalm_tipo_movimiento_tipo_movimiento_origen_Linesclass = subGridalm_tipo_movimiento_tipo_movimiento_origen_Class+"Odd" ;
         }
      }
      else if ( subGridalm_tipo_movimiento_tipo_movimiento_origen_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridalm_tipo_movimiento_tipo_movimiento_origen_Backstyle = (byte)(0) ;
         subGridalm_tipo_movimiento_tipo_movimiento_origen_Backcolor = subGridalm_tipo_movimiento_tipo_movimiento_origen_Allbackcolor ;
         if ( GXutil.strcmp(subGridalm_tipo_movimiento_tipo_movimiento_origen_Class, "") != 0 )
         {
            subGridalm_tipo_movimiento_tipo_movimiento_origen_Linesclass = subGridalm_tipo_movimiento_tipo_movimiento_origen_Class+"Uniform" ;
         }
      }
      else if ( subGridalm_tipo_movimiento_tipo_movimiento_origen_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridalm_tipo_movimiento_tipo_movimiento_origen_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridalm_tipo_movimiento_tipo_movimiento_origen_Class, "") != 0 )
         {
            subGridalm_tipo_movimiento_tipo_movimiento_origen_Linesclass = subGridalm_tipo_movimiento_tipo_movimiento_origen_Class+"Odd" ;
         }
         subGridalm_tipo_movimiento_tipo_movimiento_origen_Backcolor = (int)(0x0) ;
      }
      else if ( subGridalm_tipo_movimiento_tipo_movimiento_origen_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridalm_tipo_movimiento_tipo_movimiento_origen_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_113_idx) % (2))) == 0 )
         {
            subGridalm_tipo_movimiento_tipo_movimiento_origen_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_tipo_movimiento_tipo_movimiento_origen_Class, "") != 0 )
            {
               subGridalm_tipo_movimiento_tipo_movimiento_origen_Linesclass = subGridalm_tipo_movimiento_tipo_movimiento_origen_Class+"Even" ;
            }
         }
         else
         {
            subGridalm_tipo_movimiento_tipo_movimiento_origen_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_tipo_movimiento_tipo_movimiento_origen_Class, "") != 0 )
            {
               subGridalm_tipo_movimiento_tipo_movimiento_origen_Linesclass = subGridalm_tipo_movimiento_tipo_movimiento_origen_Class+"Odd" ;
            }
         }
      }
      imgprompt_41_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gxorigenbien"+"',["+"{Ctrl:gx.dom.el('"+"ORIG_IDENTIFICADOR_"+sGXsfl_113_idx+"'), id:'"+"ORIG_IDENTIFICADOR_"+sGXsfl_113_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_32_"+sGXsfl_113_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx00w1"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"TPMO_CODIGO"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"TPMO_CODIGO"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"ORIG_IDENTIFICADOR_"',3),t(+,5),t(sGXsfl_113_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"ORIG_IDENTIFICADOR_"',3),t(+,5),t(sGXsfl_113_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_32_"',3),t(+,5),t(sGXsfl_113_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_38,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_32_" + sGXsfl_113_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_113_idx + "',113)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_tipo_movimiento_tipo_movimiento_origenRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrig_Identificador_Internalname,GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,114);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrig_Identificador_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtOrig_Identificador_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(113),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridalm_tipo_movimiento_tipo_movimiento_origenRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_41_Internalname,sImgUrl,imgprompt_41_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_41_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_tipo_movimiento_tipo_movimiento_origenRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrig_Descripcion_Internalname,A635Orig_Descripcion,GXutil.rtrim( localUtil.format( A635Orig_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrig_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtOrig_Descripcion_Enabled),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(113),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      /* Subfile cell */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_32_" + sGXsfl_113_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_113_idx + "',113)\"" ;
      if ( ( nGXsfl_113_idx == 1 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "TPMO_SOLICITANUMERO_" + sGXsfl_113_idx ;
         cmbTpmo_SolicitaNumero.setName( GXCCtl );
         cmbTpmo_SolicitaNumero.setWebtags( "" );
         cmbTpmo_SolicitaNumero.addItem("", "", (short)(0));
         cmbTpmo_SolicitaNumero.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaNumero.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaNumero.getItemCount() > 0 )
         {
            A642Tpmo_SolicitaNumero = cmbTpmo_SolicitaNumero.getValidValue(A642Tpmo_SolicitaNumero) ;
         }
      }
      /* ComboBox */
      Gridalm_tipo_movimiento_tipo_movimiento_origenRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_SolicitaNumero,cmbTpmo_SolicitaNumero.getInternalname(),GXutil.rtrim( A642Tpmo_SolicitaNumero),new Integer(1),cmbTpmo_SolicitaNumero.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(cmbTpmo_SolicitaNumero.getEnabled()),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"","",new Boolean(true)});
      cmbTpmo_SolicitaNumero.setValue( GXutil.rtrim( A642Tpmo_SolicitaNumero) );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_SolicitaNumero.getInternalname(), "Values", cmbTpmo_SolicitaNumero.ToJavascriptSource(), !bGXsfl_113_Refreshing);
      /* Subfile cell */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_32_" + sGXsfl_113_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_113_idx + "',113)\"" ;
      if ( ( nGXsfl_113_idx == 1 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "TPMO_SOLICITAFECHA_" + sGXsfl_113_idx ;
         cmbTpmo_SolicitaFecha.setName( GXCCtl );
         cmbTpmo_SolicitaFecha.setWebtags( "" );
         cmbTpmo_SolicitaFecha.addItem("", "", (short)(0));
         cmbTpmo_SolicitaFecha.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaFecha.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaFecha.getItemCount() > 0 )
         {
            A643Tpmo_SolicitaFecha = cmbTpmo_SolicitaFecha.getValidValue(A643Tpmo_SolicitaFecha) ;
         }
      }
      /* ComboBox */
      Gridalm_tipo_movimiento_tipo_movimiento_origenRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_SolicitaFecha,cmbTpmo_SolicitaFecha.getInternalname(),GXutil.rtrim( A643Tpmo_SolicitaFecha),new Integer(1),cmbTpmo_SolicitaFecha.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(cmbTpmo_SolicitaFecha.getEnabled()),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"","",new Boolean(true)});
      cmbTpmo_SolicitaFecha.setValue( GXutil.rtrim( A643Tpmo_SolicitaFecha) );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_SolicitaFecha.getInternalname(), "Values", cmbTpmo_SolicitaFecha.ToJavascriptSource(), !bGXsfl_113_Refreshing);
      /* Subfile cell */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_32_" + sGXsfl_113_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_113_idx + "',113)\"" ;
      if ( ( nGXsfl_113_idx == 1 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "TPMO_ESTADOORIGEN_" + sGXsfl_113_idx ;
         cmbTpmo_EstadoOrigen.setName( GXCCtl );
         cmbTpmo_EstadoOrigen.setWebtags( "" );
         cmbTpmo_EstadoOrigen.addItem("A", "Activo", (short)(0));
         cmbTpmo_EstadoOrigen.addItem("I", "Inactivo", (short)(0));
         if ( cmbTpmo_EstadoOrigen.getItemCount() > 0 )
         {
            A681Tpmo_EstadoOrigen = cmbTpmo_EstadoOrigen.getValidValue(A681Tpmo_EstadoOrigen) ;
            n681Tpmo_EstadoOrigen = false ;
         }
      }
      /* ComboBox */
      Gridalm_tipo_movimiento_tipo_movimiento_origenRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_EstadoOrigen,cmbTpmo_EstadoOrigen.getInternalname(),GXutil.rtrim( A681Tpmo_EstadoOrigen),new Integer(1),cmbTpmo_EstadoOrigen.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(cmbTpmo_EstadoOrigen.getEnabled()),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"","",new Boolean(true)});
      cmbTpmo_EstadoOrigen.setValue( GXutil.rtrim( A681Tpmo_EstadoOrigen) );
      httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_EstadoOrigen.getInternalname(), "Values", cmbTpmo_EstadoOrigen.ToJavascriptSource(), !bGXsfl_113_Refreshing);
      httpContext.ajax_sending_grid_row(Gridalm_tipo_movimiento_tipo_movimiento_origenRow);
      GXCCtl = "Z41Orig_Identificador_" + sGXsfl_113_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z41Orig_Identificador, (byte)(11), (byte)(0), ",", "")));
      GXCCtl = "Z642Tpmo_SolicitaNumero_" + sGXsfl_113_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z642Tpmo_SolicitaNumero);
      GXCCtl = "Z643Tpmo_SolicitaFecha_" + sGXsfl_113_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z643Tpmo_SolicitaFecha);
      GXCCtl = "Z681Tpmo_EstadoOrigen_" + sGXsfl_113_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z681Tpmo_EstadoOrigen));
      GXCCtl = "nRcdDeleted_32_" + sGXsfl_113_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_32, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_32_" + sGXsfl_113_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_32, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_32_" + sGXsfl_113_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_32, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_113_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_113_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV9TrnContext);
      }
      GXCCtl = "vTPMO_CODIGO_" + sGXsfl_113_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV15Tpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ORIG_IDENTIFICADOR_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrig_Identificador_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ORIG_DESCRIPCION_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOrig_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_SOLICITANUMERO_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTpmo_SolicitaNumero.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_SOLICITAFECHA_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTpmo_SolicitaFecha.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_ESTADOORIGEN_"+sGXsfl_113_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbTpmo_EstadoOrigen.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_41_"+sGXsfl_113_idx+"Link", GXutil.rtrim( imgprompt_41_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.AddRow(Gridalm_tipo_movimiento_tipo_movimiento_origenRow);
   }

   public void readRow0V32( )
   {
      nGXsfl_113_idx = (short)(nGXsfl_113_idx+1) ;
      sGXsfl_113_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_113_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_11332( ) ;
      edtOrig_Identificador_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORIG_IDENTIFICADOR_"+sGXsfl_113_idx+"Enabled"), ",", ".")) ;
      edtOrig_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ORIG_DESCRIPCION_"+sGXsfl_113_idx+"Enabled"), ",", ".")) ;
      cmbTpmo_SolicitaNumero.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "TPMO_SOLICITANUMERO_"+sGXsfl_113_idx+"Enabled"), ",", ".")) );
      cmbTpmo_SolicitaFecha.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "TPMO_SOLICITAFECHA_"+sGXsfl_113_idx+"Enabled"), ",", ".")) );
      cmbTpmo_EstadoOrigen.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "TPMO_ESTADOORIGEN_"+sGXsfl_113_idx+"Enabled"), ",", ".")) );
      imgprompt_33_Link = httpContext.cgiGet( "PROMPT_41_"+sGXsfl_113_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOrig_Identificador_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOrig_Identificador_Internalname), ",", ".") > 99999999999L ) ) )
      {
         GXCCtl = "ORIG_IDENTIFICADOR_" + sGXsfl_113_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrig_Identificador_Internalname ;
         wbErr = true ;
         A41Orig_Identificador = 0 ;
      }
      else
      {
         A41Orig_Identificador = localUtil.ctol( httpContext.cgiGet( edtOrig_Identificador_Internalname), ",", ".") ;
      }
      A635Orig_Descripcion = GXutil.upper( httpContext.cgiGet( edtOrig_Descripcion_Internalname)) ;
      n635Orig_Descripcion = false ;
      cmbTpmo_SolicitaNumero.setName( cmbTpmo_SolicitaNumero.getInternalname() );
      cmbTpmo_SolicitaNumero.setValue( httpContext.cgiGet( cmbTpmo_SolicitaNumero.getInternalname()) );
      A642Tpmo_SolicitaNumero = httpContext.cgiGet( cmbTpmo_SolicitaNumero.getInternalname()) ;
      cmbTpmo_SolicitaFecha.setName( cmbTpmo_SolicitaFecha.getInternalname() );
      cmbTpmo_SolicitaFecha.setValue( httpContext.cgiGet( cmbTpmo_SolicitaFecha.getInternalname()) );
      A643Tpmo_SolicitaFecha = httpContext.cgiGet( cmbTpmo_SolicitaFecha.getInternalname()) ;
      cmbTpmo_EstadoOrigen.setName( cmbTpmo_EstadoOrigen.getInternalname() );
      cmbTpmo_EstadoOrigen.setValue( httpContext.cgiGet( cmbTpmo_EstadoOrigen.getInternalname()) );
      A681Tpmo_EstadoOrigen = httpContext.cgiGet( cmbTpmo_EstadoOrigen.getInternalname()) ;
      n681Tpmo_EstadoOrigen = false ;
      n681Tpmo_EstadoOrigen = ((GXutil.strcmp("", A681Tpmo_EstadoOrigen)==0) ? true : false) ;
      GXCCtl = "Z41Orig_Identificador_" + sGXsfl_113_idx ;
      Z41Orig_Identificador = localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".") ;
      GXCCtl = "Z642Tpmo_SolicitaNumero_" + sGXsfl_113_idx ;
      Z642Tpmo_SolicitaNumero = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z643Tpmo_SolicitaFecha_" + sGXsfl_113_idx ;
      Z643Tpmo_SolicitaFecha = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z681Tpmo_EstadoOrigen_" + sGXsfl_113_idx ;
      Z681Tpmo_EstadoOrigen = httpContext.cgiGet( GXCCtl) ;
      n681Tpmo_EstadoOrigen = ((GXutil.strcmp("", A681Tpmo_EstadoOrigen)==0) ? true : false) ;
      GXCCtl = "nRcdDeleted_32_" + sGXsfl_113_idx ;
      nRcdDeleted_32 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_32_" + sGXsfl_113_idx ;
      nRcdExists_32 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_32_" + sGXsfl_113_idx ;
      nIsMod_32 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void subsflControlProps_12760( )
   {
      edtDocu_Nro_Internalname = "DOCU_NRO_"+sGXsfl_127_idx ;
      imgprompt_819_Internalname = "PROMPT_819_"+sGXsfl_127_idx ;
      edtDocu_Descripcion_Internalname = "DOCU_DESCRIPCION_"+sGXsfl_127_idx ;
      edtDocu_Prefijo_Internalname = "DOCU_PREFIJO_"+sGXsfl_127_idx ;
   }

   public void subsflControlProps_fel_12760( )
   {
      edtDocu_Nro_Internalname = "DOCU_NRO_"+sGXsfl_127_fel_idx ;
      imgprompt_819_Internalname = "PROMPT_819_"+sGXsfl_127_fel_idx ;
      edtDocu_Descripcion_Internalname = "DOCU_DESCRIPCION_"+sGXsfl_127_fel_idx ;
      edtDocu_Prefijo_Internalname = "DOCU_PREFIJO_"+sGXsfl_127_fel_idx ;
   }

   public void addRow0V60( )
   {
      nGXsfl_127_idx = (short)(nGXsfl_127_idx+1) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_12760( ) ;
      sendRow0V60( ) ;
   }

   public void sendRow0V60( )
   {
      Gridalm_tipo_movimiento_documentoRow = GXWebRow.GetNew(context) ;
      if ( subGridalm_tipo_movimiento_documento_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridalm_tipo_movimiento_documento_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridalm_tipo_movimiento_documento_Class, "") != 0 )
         {
            subGridalm_tipo_movimiento_documento_Linesclass = subGridalm_tipo_movimiento_documento_Class+"Odd" ;
         }
      }
      else if ( subGridalm_tipo_movimiento_documento_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridalm_tipo_movimiento_documento_Backstyle = (byte)(0) ;
         subGridalm_tipo_movimiento_documento_Backcolor = subGridalm_tipo_movimiento_documento_Allbackcolor ;
         if ( GXutil.strcmp(subGridalm_tipo_movimiento_documento_Class, "") != 0 )
         {
            subGridalm_tipo_movimiento_documento_Linesclass = subGridalm_tipo_movimiento_documento_Class+"Uniform" ;
         }
      }
      else if ( subGridalm_tipo_movimiento_documento_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridalm_tipo_movimiento_documento_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridalm_tipo_movimiento_documento_Class, "") != 0 )
         {
            subGridalm_tipo_movimiento_documento_Linesclass = subGridalm_tipo_movimiento_documento_Class+"Odd" ;
         }
         subGridalm_tipo_movimiento_documento_Backcolor = (int)(0x0) ;
      }
      else if ( subGridalm_tipo_movimiento_documento_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridalm_tipo_movimiento_documento_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_127_idx) % (2))) == 0 )
         {
            subGridalm_tipo_movimiento_documento_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_tipo_movimiento_documento_Class, "") != 0 )
            {
               subGridalm_tipo_movimiento_documento_Linesclass = subGridalm_tipo_movimiento_documento_Class+"Even" ;
            }
         }
         else
         {
            subGridalm_tipo_movimiento_documento_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_tipo_movimiento_documento_Class, "") != 0 )
            {
               subGridalm_tipo_movimiento_documento_Linesclass = subGridalm_tipo_movimiento_documento_Class+"Odd" ;
            }
         }
      }
      imgprompt_819_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0)||(GXutil.strcmp(Gx_mode, "UPD")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"com.orions2.gx01n0"+"',["+"{Ctrl:gx.dom.el('"+"DOCU_NRO_"+sGXsfl_127_idx+"'), id:'"+"DOCU_NRO_"+sGXsfl_127_idx+"'"+",IOType:'out'}"+"],"+"gx.dom.form()."+"nIsMod_60_"+sGXsfl_127_idx+","+"'', false"+","+"false"+");") ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx01o1"',3),t(+,5),t('"'',["',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"TPMO_CODIGO"',3),t(+,5),t('"''), id:''"',3),t(+,5),t('"TPMO_CODIGO"',3),t(+,5),t('"''"',3),t(+,5),t('",IOType:''in'',isKey:true,isLastKey:true}"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"DOCU_NRO_"',3),t(+,5),t(sGXsfl_127_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"DOCU_NRO_"',3),t(+,5),t(sGXsfl_127_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_60_"',3),t(+,5),t(sGXsfl_127_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_38,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_60_" + sGXsfl_127_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_127_idx + "',127)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_tipo_movimiento_documentoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDocu_Nro_Internalname,GXutil.ltrim( localUtil.ntoc( A819Docu_Nro, (byte)(4), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A819Docu_Nro), "ZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,128);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDocu_Nro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtDocu_Nro_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(127),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridalm_tipo_movimiento_documentoRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_819_Internalname,sImgUrl,imgprompt_819_Link,"","",context.getHttpContext().getTheme( ),new Integer(imgprompt_819_Visible),new Integer(1),"","",new Integer(0),new Integer(0),new Integer(0),"",new Integer(0),"",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"","","","","","",new Integer(1),new Boolean(false),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_tipo_movimiento_documentoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDocu_Descripcion_Internalname,A820Docu_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDocu_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtDocu_Descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(127),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_tipo_movimiento_documentoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDocu_Prefijo_Internalname,A821Docu_Prefijo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDocu_Prefijo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtDocu_Prefijo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(127),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
      httpContext.ajax_sending_grid_row(Gridalm_tipo_movimiento_documentoRow);
      GXCCtl = "Z819Docu_Nro_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z819Docu_Nro, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdDeleted_60_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_60, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_60_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_60, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_60_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_60, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_127_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV9TrnContext);
      }
      GXCCtl = "vTPMO_CODIGO_" + sGXsfl_127_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV15Tpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_NRO_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDocu_Nro_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_DESCRIPCION_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDocu_Descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DOCU_PREFIJO_"+sGXsfl_127_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDocu_Prefijo_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PROMPT_819_"+sGXsfl_127_idx+"Link", GXutil.rtrim( imgprompt_819_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridalm_tipo_movimiento_documentoContainer.AddRow(Gridalm_tipo_movimiento_documentoRow);
   }

   public void readRow0V60( )
   {
      nGXsfl_127_idx = (short)(nGXsfl_127_idx+1) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_12760( ) ;
      edtDocu_Nro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DOCU_NRO_"+sGXsfl_127_idx+"Enabled"), ",", ".")) ;
      edtDocu_Descripcion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DOCU_DESCRIPCION_"+sGXsfl_127_idx+"Enabled"), ",", ".")) ;
      edtDocu_Prefijo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DOCU_PREFIJO_"+sGXsfl_127_idx+"Enabled"), ",", ".")) ;
      imgprompt_33_Link = httpContext.cgiGet( "PROMPT_819_"+sGXsfl_127_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDocu_Nro_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDocu_Nro_Internalname), ",", ".") > 9999 ) ) )
      {
         GXCCtl = "DOCU_NRO_" + sGXsfl_127_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDocu_Nro_Internalname ;
         wbErr = true ;
         A819Docu_Nro = (short)(0) ;
      }
      else
      {
         A819Docu_Nro = (short)(localUtil.ctol( httpContext.cgiGet( edtDocu_Nro_Internalname), ",", ".")) ;
      }
      A820Docu_Descripcion = httpContext.cgiGet( edtDocu_Descripcion_Internalname) ;
      n820Docu_Descripcion = false ;
      A821Docu_Prefijo = httpContext.cgiGet( edtDocu_Prefijo_Internalname) ;
      n821Docu_Prefijo = false ;
      GXCCtl = "Z819Docu_Nro_" + sGXsfl_127_idx ;
      Z819Docu_Nro = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdDeleted_60_" + sGXsfl_127_idx ;
      nRcdDeleted_60 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_60_" + sGXsfl_127_idx ;
      nRcdExists_60 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_60_" + sGXsfl_127_idx ;
      nIsMod_60 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defedtDocu_Nro_Enabled = edtDocu_Nro_Enabled ;
      defedtOrig_Identificador_Enabled = edtOrig_Identificador_Enabled ;
   }

   public void confirmValues0V0( )
   {
      nGXsfl_113_idx = (short)(0) ;
      sGXsfl_113_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_113_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_11332( ) ;
      while ( nGXsfl_113_idx < nRC_GXsfl_113 )
      {
         nGXsfl_113_idx = (short)(nGXsfl_113_idx+1) ;
         sGXsfl_113_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_113_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_11332( ) ;
         httpContext.changePostValue( "Z41Orig_Identificador_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z41Orig_Identificador_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z41Orig_Identificador_"+sGXsfl_113_idx) ;
         httpContext.changePostValue( "Z642Tpmo_SolicitaNumero_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z642Tpmo_SolicitaNumero_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z642Tpmo_SolicitaNumero_"+sGXsfl_113_idx) ;
         httpContext.changePostValue( "Z643Tpmo_SolicitaFecha_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z643Tpmo_SolicitaFecha_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z643Tpmo_SolicitaFecha_"+sGXsfl_113_idx) ;
         httpContext.changePostValue( "Z681Tpmo_EstadoOrigen_"+sGXsfl_113_idx, httpContext.cgiGet( "ZT_"+"Z681Tpmo_EstadoOrigen_"+sGXsfl_113_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z681Tpmo_EstadoOrigen_"+sGXsfl_113_idx) ;
      }
      nGXsfl_127_idx = (short)(0) ;
      sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_12760( ) ;
      while ( nGXsfl_127_idx < nRC_GXsfl_127 )
      {
         nGXsfl_127_idx = (short)(nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_12760( ) ;
         httpContext.changePostValue( "Z819Docu_Nro_"+sGXsfl_127_idx, httpContext.cgiGet( "ZT_"+"Z819Docu_Nro_"+sGXsfl_127_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z819Docu_Nro_"+sGXsfl_127_idx) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414163381");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_tipo_movimiento") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV15Tpmo_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z38Tpmo_Codigo", Z38Tpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z317Tpmo_UsuarioCrea", Z317Tpmo_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z318Tpmo_FechaCrea", localUtil.ttoc( Z318Tpmo_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z319Tpmo_UsuarioModifica", Z319Tpmo_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z320Tpmo_FechaModifica", localUtil.ttoc( Z320Tpmo_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z313Tpmo_Descripcion", Z313Tpmo_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z315Tpmo_TipoE_S", Z315Tpmo_TipoE_S);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z316Tpmo_Modulo", Z316Tpmo_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z440Tpmo_IngresaAredante", Z440Tpmo_IngresaAredante);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z441Tpmo_IngresaCurso", Z441Tpmo_IngresaCurso);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z595Tpmo_ConsecutivoTrans", GXutil.ltrim( localUtil.ntoc( Z595Tpmo_ConsecutivoTrans, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z633Tpmo_Controlado", Z633Tpmo_Controlado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z641Tpmo_VidaUtil", Z641Tpmo_VidaUtil);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z679Tpmo_Estado", GXutil.rtrim( Z679Tpmo_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z680Tpmo_CuentaResponsabilidad", Z680Tpmo_CuentaResponsabilidad);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z705Tpmo_SolicitaRegionDestino", Z705Tpmo_SolicitaRegionDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z706Tpmo_SolicitaCentroDestino", Z706Tpmo_SolicitaCentroDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z716Tpmo_ImprimeOrigen", Z716Tpmo_ImprimeOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z717Tpmo_ImprimeDestino", Z717Tpmo_ImprimeDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z718Tmpo_ImprimeResponsable", Z718Tmpo_ImprimeResponsable);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z33Tipo_Codigo", GXutil.ltrim( localUtil.ntoc( Z33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z39Tpmo_AlmacenOrigenId", GXutil.ltrim( localUtil.ntoc( Z39Tpmo_AlmacenOrigenId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z40Tpmo_AlmacenDestinoId", GXutil.ltrim( localUtil.ntoc( Z40Tpmo_AlmacenDestinoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_113", GXutil.ltrim( localUtil.ntoc( nGXsfl_113_idx, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_127", GXutil.ltrim( localUtil.ntoc( nGXsfl_127_idx, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N33Tipo_Codigo", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N39Tpmo_AlmacenOrigenId", GXutil.ltrim( localUtil.ntoc( A39Tpmo_AlmacenOrigenId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N40Tpmo_AlmacenDestinoId", GXutil.ltrim( localUtil.ntoc( A40Tpmo_AlmacenDestinoId, (byte)(11), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV9TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV9TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTPMO_CODIGO", AV15Tpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( AV11Insert_Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TPMO_ALMACENORIGENID", GXutil.ltrim( localUtil.ntoc( AV12Insert_Tpmo_AlmacenOrigenId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TPMO_ALMACENDESTINOID", GXutil.ltrim( localUtil.ntoc( AV13Insert_Tpmo_AlmacenDestinoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV16Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_USUARIOCREA", A317Tpmo_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_FECHACREA", localUtil.ttoc( A318Tpmo_FechaCrea, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_USUARIOMODIFICA", A319Tpmo_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_FECHAMODIFICA", localUtil.ttoc( A320Tpmo_FechaModifica, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_CONSECUTIVOTRANS", GXutil.ltrim( localUtil.ntoc( A595Tpmo_ConsecutivoTrans, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV18Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Tpmo_Codigo, ""))));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_TIPO_MOVIMIENTO" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A595Tpmo_ConsecutivoTrans), "ZZZZZZZZZZZZZZZZZ9") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_tipo_movimiento:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_tipo_movimiento") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.rtrim(AV15Tpmo_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "ALM_TIPO_MOVIMIENTO" ;
   }

   public String getPgmdesc( )
   {
      return "Tipo de movimiento" ;
   }

   public void initializeNonKey0V31( )
   {
      A33Tipo_Codigo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A33Tipo_Codigo", GXutil.ltrim( GXutil.str( A33Tipo_Codigo, 18, 0)));
      A39Tpmo_AlmacenOrigenId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A39Tpmo_AlmacenOrigenId", GXutil.ltrim( GXutil.str( A39Tpmo_AlmacenOrigenId, 11, 0)));
      A40Tpmo_AlmacenDestinoId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A40Tpmo_AlmacenDestinoId", GXutil.ltrim( GXutil.str( A40Tpmo_AlmacenDestinoId, 11, 0)));
      A317Tpmo_UsuarioCrea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A317Tpmo_UsuarioCrea", A317Tpmo_UsuarioCrea);
      A318Tpmo_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A318Tpmo_FechaCrea", localUtil.ttoc( A318Tpmo_FechaCrea, 8, 5, 0, 3, "/", ":", " "));
      A319Tpmo_UsuarioModifica = "" ;
      n319Tpmo_UsuarioModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A319Tpmo_UsuarioModifica", A319Tpmo_UsuarioModifica);
      A320Tpmo_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      n320Tpmo_FechaModifica = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A320Tpmo_FechaModifica", localUtil.ttoc( A320Tpmo_FechaModifica, 8, 5, 0, 3, "/", ":", " "));
      A313Tpmo_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A313Tpmo_Descripcion", A313Tpmo_Descripcion);
      A253Tipo_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A253Tipo_Descripcion", A253Tipo_Descripcion);
      A480Tipo_Tipo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
      A312Tpmo_AlmacenOrigenDescrip = "" ;
      n312Tpmo_AlmacenOrigenDescrip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A312Tpmo_AlmacenOrigenDescrip", A312Tpmo_AlmacenOrigenDescrip);
      A314Tpmo_AlmacenDestinoDescrip = "" ;
      n314Tpmo_AlmacenDestinoDescrip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A314Tpmo_AlmacenDestinoDescrip", A314Tpmo_AlmacenDestinoDescrip);
      A315Tpmo_TipoE_S = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A315Tpmo_TipoE_S", A315Tpmo_TipoE_S);
      A316Tpmo_Modulo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A316Tpmo_Modulo", A316Tpmo_Modulo);
      A440Tpmo_IngresaAredante = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A440Tpmo_IngresaAredante", A440Tpmo_IngresaAredante);
      A441Tpmo_IngresaCurso = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A441Tpmo_IngresaCurso", A441Tpmo_IngresaCurso);
      A595Tpmo_ConsecutivoTrans = 0 ;
      n595Tpmo_ConsecutivoTrans = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A595Tpmo_ConsecutivoTrans", GXutil.ltrim( GXutil.str( A595Tpmo_ConsecutivoTrans, 18, 0)));
      A633Tpmo_Controlado = "" ;
      n633Tpmo_Controlado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A633Tpmo_Controlado", A633Tpmo_Controlado);
      n633Tpmo_Controlado = ((GXutil.strcmp("", A633Tpmo_Controlado)==0) ? true : false) ;
      A641Tpmo_VidaUtil = "" ;
      n641Tpmo_VidaUtil = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A641Tpmo_VidaUtil", A641Tpmo_VidaUtil);
      n641Tpmo_VidaUtil = ((GXutil.strcmp("", A641Tpmo_VidaUtil)==0) ? true : false) ;
      A679Tpmo_Estado = "" ;
      n679Tpmo_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A679Tpmo_Estado", A679Tpmo_Estado);
      n679Tpmo_Estado = ((GXutil.strcmp("", A679Tpmo_Estado)==0) ? true : false) ;
      A680Tpmo_CuentaResponsabilidad = "" ;
      n680Tpmo_CuentaResponsabilidad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A680Tpmo_CuentaResponsabilidad", A680Tpmo_CuentaResponsabilidad);
      n680Tpmo_CuentaResponsabilidad = ((GXutil.strcmp("", A680Tpmo_CuentaResponsabilidad)==0) ? true : false) ;
      A705Tpmo_SolicitaRegionDestino = "" ;
      n705Tpmo_SolicitaRegionDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A705Tpmo_SolicitaRegionDestino", A705Tpmo_SolicitaRegionDestino);
      n705Tpmo_SolicitaRegionDestino = ((GXutil.strcmp("", A705Tpmo_SolicitaRegionDestino)==0) ? true : false) ;
      A706Tpmo_SolicitaCentroDestino = "" ;
      n706Tpmo_SolicitaCentroDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A706Tpmo_SolicitaCentroDestino", A706Tpmo_SolicitaCentroDestino);
      n706Tpmo_SolicitaCentroDestino = ((GXutil.strcmp("", A706Tpmo_SolicitaCentroDestino)==0) ? true : false) ;
      A716Tpmo_ImprimeOrigen = "" ;
      n716Tpmo_ImprimeOrigen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A716Tpmo_ImprimeOrigen", A716Tpmo_ImprimeOrigen);
      n716Tpmo_ImprimeOrigen = ((GXutil.strcmp("", A716Tpmo_ImprimeOrigen)==0) ? true : false) ;
      A717Tpmo_ImprimeDestino = "" ;
      n717Tpmo_ImprimeDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A717Tpmo_ImprimeDestino", A717Tpmo_ImprimeDestino);
      n717Tpmo_ImprimeDestino = ((GXutil.strcmp("", A717Tpmo_ImprimeDestino)==0) ? true : false) ;
      A718Tmpo_ImprimeResponsable = "" ;
      n718Tmpo_ImprimeResponsable = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A718Tmpo_ImprimeResponsable", A718Tmpo_ImprimeResponsable);
      n718Tmpo_ImprimeResponsable = ((GXutil.strcmp("", A718Tmpo_ImprimeResponsable)==0) ? true : false) ;
      Z317Tpmo_UsuarioCrea = "" ;
      Z318Tpmo_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z319Tpmo_UsuarioModifica = "" ;
      Z320Tpmo_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z313Tpmo_Descripcion = "" ;
      Z315Tpmo_TipoE_S = "" ;
      Z316Tpmo_Modulo = "" ;
      Z440Tpmo_IngresaAredante = "" ;
      Z441Tpmo_IngresaCurso = "" ;
      Z595Tpmo_ConsecutivoTrans = 0 ;
      Z633Tpmo_Controlado = "" ;
      Z641Tpmo_VidaUtil = "" ;
      Z679Tpmo_Estado = "" ;
      Z680Tpmo_CuentaResponsabilidad = "" ;
      Z705Tpmo_SolicitaRegionDestino = "" ;
      Z706Tpmo_SolicitaCentroDestino = "" ;
      Z716Tpmo_ImprimeOrigen = "" ;
      Z717Tpmo_ImprimeDestino = "" ;
      Z718Tmpo_ImprimeResponsable = "" ;
      Z33Tipo_Codigo = 0 ;
      Z39Tpmo_AlmacenOrigenId = 0 ;
      Z40Tpmo_AlmacenDestinoId = 0 ;
   }

   public void initAll0V31( )
   {
      A38Tpmo_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A38Tpmo_Codigo", A38Tpmo_Codigo);
      initializeNonKey0V31( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0V32( )
   {
      A635Orig_Descripcion = "" ;
      n635Orig_Descripcion = false ;
      A642Tpmo_SolicitaNumero = "" ;
      A643Tpmo_SolicitaFecha = "" ;
      A681Tpmo_EstadoOrigen = "" ;
      n681Tpmo_EstadoOrigen = false ;
      Z642Tpmo_SolicitaNumero = "" ;
      Z643Tpmo_SolicitaFecha = "" ;
      Z681Tpmo_EstadoOrigen = "" ;
   }

   public void initAll0V32( )
   {
      A41Orig_Identificador = 0 ;
      initializeNonKey0V32( ) ;
   }

   public void standaloneModalInsert0V32( )
   {
   }

   public void initializeNonKey0V60( )
   {
      A820Docu_Descripcion = "" ;
      n820Docu_Descripcion = false ;
      A821Docu_Prefijo = "" ;
      n821Docu_Prefijo = false ;
   }

   public void initAll0V60( )
   {
      A819Docu_Nro = (short)(0) ;
      initializeNonKey0V60( ) ;
   }

   public void standaloneModalInsert0V60( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141416347");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_tipo_movimiento.js", "?20186141416347");
      /* End function include_jscripts */
   }

   public void init_level_properties32( )
   {
      edtOrig_Identificador_Enabled = defedtOrig_Identificador_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOrig_Identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtOrig_Identificador_Enabled, 5, 0)), !bGXsfl_113_Refreshing);
   }

   public void init_level_properties60( )
   {
      edtDocu_Nro_Enabled = defedtDocu_Nro_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDocu_Nro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtDocu_Nro_Enabled, 5, 0)), !bGXsfl_127_Refreshing);
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
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO" ;
      edtTpmo_Descripcion_Internalname = "TPMO_DESCRIPCION" ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO" ;
      edtTipo_Descripcion_Internalname = "TIPO_DESCRIPCION" ;
      cmbTipo_Tipo.setInternalname( "TIPO_TIPO" );
      edtTpmo_AlmacenOrigenId_Internalname = "TPMO_ALMACENORIGENID" ;
      edtTpmo_AlmacenOrigenDescrip_Internalname = "TPMO_ALMACENORIGENDESCRIP" ;
      edtTpmo_AlmacenDestinoId_Internalname = "TPMO_ALMACENDESTINOID" ;
      edtTpmo_AlmacenDestinoDescrip_Internalname = "TPMO_ALMACENDESTINODESCRIP" ;
      cmbTpmo_TipoE_S.setInternalname( "TPMO_TIPOE_S" );
      cmbTpmo_Modulo.setInternalname( "TPMO_MODULO" );
      cmbTpmo_IngresaAredante.setInternalname( "TPMO_INGRESAAREDANTE" );
      cmbTpmo_IngresaCurso.setInternalname( "TPMO_INGRESACURSO" );
      cmbTpmo_Controlado.setInternalname( "TPMO_CONTROLADO" );
      cmbTpmo_VidaUtil.setInternalname( "TPMO_VIDAUTIL" );
      cmbTpmo_CuentaResponsabilidad.setInternalname( "TPMO_CUENTARESPONSABILIDAD" );
      cmbTpmo_SolicitaRegionDestino.setInternalname( "TPMO_SOLICITAREGIONDESTINO" );
      cmbTpmo_SolicitaCentroDestino.setInternalname( "TPMO_SOLICITACENTRODESTINO" );
      cmbTpmo_ImprimeOrigen.setInternalname( "TPMO_IMPRIMEORIGEN" );
      cmbTpmo_ImprimeDestino.setInternalname( "TPMO_IMPRIMEDESTINO" );
      cmbTmpo_ImprimeResponsable.setInternalname( "TMPO_IMPRIMERESPONSABLE" );
      cmbTpmo_Estado.setInternalname( "TPMO_ESTADO" );
      lblTitletipo_movimiento_origen_Internalname = "TITLETIPO_MOVIMIENTO_ORIGEN" ;
      edtOrig_Identificador_Internalname = "ORIG_IDENTIFICADOR" ;
      edtOrig_Descripcion_Internalname = "ORIG_DESCRIPCION" ;
      cmbTpmo_SolicitaNumero.setInternalname( "TPMO_SOLICITANUMERO" );
      cmbTpmo_SolicitaFecha.setInternalname( "TPMO_SOLICITAFECHA" );
      cmbTpmo_EstadoOrigen.setInternalname( "TPMO_ESTADOORIGEN" );
      divTipo_movimiento_origentable_Internalname = "TIPO_MOVIMIENTO_ORIGENTABLE" ;
      lblTitledocumento_Internalname = "TITLEDOCUMENTO" ;
      edtDocu_Nro_Internalname = "DOCU_NRO" ;
      edtDocu_Descripcion_Internalname = "DOCU_DESCRIPCION" ;
      edtDocu_Prefijo_Internalname = "DOCU_PREFIJO" ;
      divDocumentotable_Internalname = "DOCUMENTOTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_33_Internalname = "PROMPT_33" ;
      imgprompt_39_Internalname = "PROMPT_39" ;
      imgprompt_40_Internalname = "PROMPT_40" ;
      imgprompt_41_Internalname = "PROMPT_41" ;
      imgprompt_819_Internalname = "PROMPT_819" ;
      subGridalm_tipo_movimiento_tipo_movimiento_origen_Internalname = "GRIDALM_TIPO_MOVIMIENTO_TIPO_MOVIMIENTO_ORIGEN" ;
      subGridalm_tipo_movimiento_documento_Internalname = "GRIDALM_TIPO_MOVIMIENTO_DOCUMENTO" ;
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
      Form.setCaption( "Tipo de movimiento" );
      edtDocu_Prefijo_Jsonclick = "" ;
      edtDocu_Descripcion_Jsonclick = "" ;
      imgprompt_819_Visible = 1 ;
      imgprompt_819_Link = "" ;
      edtDocu_Nro_Jsonclick = "" ;
      subGridalm_tipo_movimiento_documento_Class = "Grid" ;
      subGridalm_tipo_movimiento_documento_Backcolorstyle = (byte)(0) ;
      cmbTpmo_EstadoOrigen.setJsonclick( "" );
      cmbTpmo_SolicitaFecha.setJsonclick( "" );
      cmbTpmo_SolicitaNumero.setJsonclick( "" );
      edtOrig_Descripcion_Jsonclick = "" ;
      imgprompt_41_Visible = 1 ;
      imgprompt_41_Link = "" ;
      imgprompt_33_Visible = 1 ;
      edtOrig_Identificador_Jsonclick = "" ;
      subGridalm_tipo_movimiento_tipo_movimiento_origen_Class = "Grid" ;
      subGridalm_tipo_movimiento_tipo_movimiento_origen_Backcolorstyle = (byte)(0) ;
      subGridalm_tipo_movimiento_documento_Allowcollapsing = (byte)(0) ;
      subGridalm_tipo_movimiento_documento_Allowselection = (byte)(0) ;
      edtDocu_Prefijo_Enabled = 0 ;
      edtDocu_Descripcion_Enabled = 0 ;
      edtDocu_Nro_Enabled = 1 ;
      subGridalm_tipo_movimiento_tipo_movimiento_origen_Allowcollapsing = (byte)(0) ;
      subGridalm_tipo_movimiento_tipo_movimiento_origen_Allowselection = (byte)(0) ;
      cmbTpmo_EstadoOrigen.setEnabled( 1 );
      cmbTpmo_SolicitaFecha.setEnabled( 1 );
      cmbTpmo_SolicitaNumero.setEnabled( 1 );
      edtOrig_Descripcion_Enabled = 0 ;
      edtOrig_Identificador_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbTpmo_Estado.setJsonclick( "" );
      cmbTpmo_Estado.setEnabled( 1 );
      cmbTmpo_ImprimeResponsable.setJsonclick( "" );
      cmbTmpo_ImprimeResponsable.setEnabled( 1 );
      cmbTpmo_ImprimeDestino.setJsonclick( "" );
      cmbTpmo_ImprimeDestino.setEnabled( 1 );
      cmbTpmo_ImprimeOrigen.setJsonclick( "" );
      cmbTpmo_ImprimeOrigen.setEnabled( 1 );
      cmbTpmo_SolicitaCentroDestino.setJsonclick( "" );
      cmbTpmo_SolicitaCentroDestino.setEnabled( 1 );
      cmbTpmo_SolicitaRegionDestino.setJsonclick( "" );
      cmbTpmo_SolicitaRegionDestino.setEnabled( 1 );
      cmbTpmo_CuentaResponsabilidad.setJsonclick( "" );
      cmbTpmo_CuentaResponsabilidad.setEnabled( 1 );
      cmbTpmo_VidaUtil.setJsonclick( "" );
      cmbTpmo_VidaUtil.setEnabled( 1 );
      cmbTpmo_Controlado.setJsonclick( "" );
      cmbTpmo_Controlado.setEnabled( 1 );
      cmbTpmo_IngresaCurso.setJsonclick( "" );
      cmbTpmo_IngresaCurso.setEnabled( 1 );
      cmbTpmo_IngresaAredante.setJsonclick( "" );
      cmbTpmo_IngresaAredante.setEnabled( 1 );
      cmbTpmo_Modulo.setJsonclick( "" );
      cmbTpmo_Modulo.setEnabled( 1 );
      cmbTpmo_TipoE_S.setJsonclick( "" );
      cmbTpmo_TipoE_S.setEnabled( 1 );
      edtTpmo_AlmacenDestinoDescrip_Jsonclick = "" ;
      edtTpmo_AlmacenDestinoDescrip_Enabled = 0 ;
      imgprompt_40_Visible = 1 ;
      imgprompt_40_Link = "" ;
      edtTpmo_AlmacenDestinoId_Jsonclick = "" ;
      edtTpmo_AlmacenDestinoId_Enabled = 1 ;
      edtTpmo_AlmacenOrigenDescrip_Jsonclick = "" ;
      edtTpmo_AlmacenOrigenDescrip_Enabled = 0 ;
      imgprompt_39_Visible = 1 ;
      imgprompt_39_Link = "" ;
      edtTpmo_AlmacenOrigenId_Jsonclick = "" ;
      edtTpmo_AlmacenOrigenId_Enabled = 1 ;
      cmbTipo_Tipo.setJsonclick( "" );
      cmbTipo_Tipo.setEnabled( 0 );
      edtTipo_Descripcion_Jsonclick = "" ;
      edtTipo_Descripcion_Enabled = 0 ;
      imgprompt_33_Visible = 1 ;
      imgprompt_33_Link = "" ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtTipo_Codigo_Enabled = 1 ;
      edtTpmo_Descripcion_Jsonclick = "" ;
      edtTpmo_Descripcion_Enabled = 1 ;
      edtTpmo_Codigo_Jsonclick = "" ;
      edtTpmo_Codigo_Enabled = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
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

   public void gxnrgridalm_tipo_movimiento_tipo_movimiento_origen_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_11332( ) ;
      while ( nGXsfl_113_idx <= nRC_GXsfl_113 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0V32( ) ;
         standaloneModal0V32( ) ;
         cmbTipo_Tipo.setName( "TIPO_TIPO" );
         cmbTipo_Tipo.setWebtags( "" );
         cmbTipo_Tipo.addItem("C", "Consumo", (short)(0));
         cmbTipo_Tipo.addItem("D", "Devolutivo", (short)(0));
         if ( cmbTipo_Tipo.getItemCount() > 0 )
         {
            A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
            httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
         }
         cmbTpmo_TipoE_S.setName( "TPMO_TIPOE_S" );
         cmbTpmo_TipoE_S.setWebtags( "" );
         cmbTpmo_TipoE_S.addItem("E", "ENTRADA", (short)(0));
         cmbTpmo_TipoE_S.addItem("S", "SALIDA", (short)(0));
         cmbTpmo_TipoE_S.addItem("T", "TRASPASO", (short)(0));
         cmbTpmo_TipoE_S.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbTpmo_TipoE_S.getItemCount() > 0 )
         {
            A315Tpmo_TipoE_S = cmbTpmo_TipoE_S.getValidValue(A315Tpmo_TipoE_S) ;
            httpContext.ajax_rsp_assign_attri("", false, "A315Tpmo_TipoE_S", A315Tpmo_TipoE_S);
         }
         cmbTpmo_Modulo.setName( "TPMO_MODULO" );
         cmbTpmo_Modulo.setWebtags( "" );
         cmbTpmo_Modulo.addItem("", "", (short)(0));
         cmbTpmo_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbTpmo_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbTpmo_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbTpmo_Modulo.getItemCount() > 0 )
         {
            A316Tpmo_Modulo = cmbTpmo_Modulo.getValidValue(A316Tpmo_Modulo) ;
            httpContext.ajax_rsp_assign_attri("", false, "A316Tpmo_Modulo", A316Tpmo_Modulo);
         }
         cmbTpmo_IngresaAredante.setName( "TPMO_INGRESAAREDANTE" );
         cmbTpmo_IngresaAredante.setWebtags( "" );
         cmbTpmo_IngresaAredante.addItem("", "", (short)(0));
         cmbTpmo_IngresaAredante.addItem("SI", "SI", (short)(0));
         cmbTpmo_IngresaAredante.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_IngresaAredante.getItemCount() > 0 )
         {
            A440Tpmo_IngresaAredante = cmbTpmo_IngresaAredante.getValidValue(A440Tpmo_IngresaAredante) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440Tpmo_IngresaAredante", A440Tpmo_IngresaAredante);
         }
         cmbTpmo_IngresaCurso.setName( "TPMO_INGRESACURSO" );
         cmbTpmo_IngresaCurso.setWebtags( "" );
         cmbTpmo_IngresaCurso.addItem("", "", (short)(0));
         cmbTpmo_IngresaCurso.addItem("SI", "SI", (short)(0));
         cmbTpmo_IngresaCurso.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_IngresaCurso.getItemCount() > 0 )
         {
            A441Tpmo_IngresaCurso = cmbTpmo_IngresaCurso.getValidValue(A441Tpmo_IngresaCurso) ;
            httpContext.ajax_rsp_assign_attri("", false, "A441Tpmo_IngresaCurso", A441Tpmo_IngresaCurso);
         }
         cmbTpmo_Controlado.setName( "TPMO_CONTROLADO" );
         cmbTpmo_Controlado.setWebtags( "" );
         cmbTpmo_Controlado.addItem("", "", (short)(0));
         cmbTpmo_Controlado.addItem("SI", "SI", (short)(0));
         cmbTpmo_Controlado.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_Controlado.getItemCount() > 0 )
         {
            A633Tpmo_Controlado = cmbTpmo_Controlado.getValidValue(A633Tpmo_Controlado) ;
            n633Tpmo_Controlado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A633Tpmo_Controlado", A633Tpmo_Controlado);
         }
         cmbTpmo_VidaUtil.setName( "TPMO_VIDAUTIL" );
         cmbTpmo_VidaUtil.setWebtags( "" );
         cmbTpmo_VidaUtil.addItem("", "", (short)(0));
         cmbTpmo_VidaUtil.addItem("SI", "SI", (short)(0));
         cmbTpmo_VidaUtil.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_VidaUtil.getItemCount() > 0 )
         {
            A641Tpmo_VidaUtil = cmbTpmo_VidaUtil.getValidValue(A641Tpmo_VidaUtil) ;
            n641Tpmo_VidaUtil = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A641Tpmo_VidaUtil", A641Tpmo_VidaUtil);
         }
         cmbTpmo_CuentaResponsabilidad.setName( "TPMO_CUENTARESPONSABILIDAD" );
         cmbTpmo_CuentaResponsabilidad.setWebtags( "" );
         cmbTpmo_CuentaResponsabilidad.addItem("", "", (short)(0));
         cmbTpmo_CuentaResponsabilidad.addItem("SI", "SI", (short)(0));
         cmbTpmo_CuentaResponsabilidad.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_CuentaResponsabilidad.getItemCount() > 0 )
         {
            A680Tpmo_CuentaResponsabilidad = cmbTpmo_CuentaResponsabilidad.getValidValue(A680Tpmo_CuentaResponsabilidad) ;
            n680Tpmo_CuentaResponsabilidad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A680Tpmo_CuentaResponsabilidad", A680Tpmo_CuentaResponsabilidad);
         }
         cmbTpmo_SolicitaRegionDestino.setName( "TPMO_SOLICITAREGIONDESTINO" );
         cmbTpmo_SolicitaRegionDestino.setWebtags( "" );
         cmbTpmo_SolicitaRegionDestino.addItem("", "", (short)(0));
         cmbTpmo_SolicitaRegionDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaRegionDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaRegionDestino.getItemCount() > 0 )
         {
            A705Tpmo_SolicitaRegionDestino = cmbTpmo_SolicitaRegionDestino.getValidValue(A705Tpmo_SolicitaRegionDestino) ;
            n705Tpmo_SolicitaRegionDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A705Tpmo_SolicitaRegionDestino", A705Tpmo_SolicitaRegionDestino);
         }
         cmbTpmo_SolicitaCentroDestino.setName( "TPMO_SOLICITACENTRODESTINO" );
         cmbTpmo_SolicitaCentroDestino.setWebtags( "" );
         cmbTpmo_SolicitaCentroDestino.addItem("", "", (short)(0));
         cmbTpmo_SolicitaCentroDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaCentroDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaCentroDestino.getItemCount() > 0 )
         {
            A706Tpmo_SolicitaCentroDestino = cmbTpmo_SolicitaCentroDestino.getValidValue(A706Tpmo_SolicitaCentroDestino) ;
            n706Tpmo_SolicitaCentroDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A706Tpmo_SolicitaCentroDestino", A706Tpmo_SolicitaCentroDestino);
         }
         cmbTpmo_ImprimeOrigen.setName( "TPMO_IMPRIMEORIGEN" );
         cmbTpmo_ImprimeOrigen.setWebtags( "" );
         cmbTpmo_ImprimeOrigen.addItem("", "", (short)(0));
         cmbTpmo_ImprimeOrigen.addItem("SI", "SI", (short)(0));
         cmbTpmo_ImprimeOrigen.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_ImprimeOrigen.getItemCount() > 0 )
         {
            A716Tpmo_ImprimeOrigen = cmbTpmo_ImprimeOrigen.getValidValue(A716Tpmo_ImprimeOrigen) ;
            n716Tpmo_ImprimeOrigen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A716Tpmo_ImprimeOrigen", A716Tpmo_ImprimeOrigen);
         }
         cmbTpmo_ImprimeDestino.setName( "TPMO_IMPRIMEDESTINO" );
         cmbTpmo_ImprimeDestino.setWebtags( "" );
         cmbTpmo_ImprimeDestino.addItem("", "", (short)(0));
         cmbTpmo_ImprimeDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_ImprimeDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_ImprimeDestino.getItemCount() > 0 )
         {
            A717Tpmo_ImprimeDestino = cmbTpmo_ImprimeDestino.getValidValue(A717Tpmo_ImprimeDestino) ;
            n717Tpmo_ImprimeDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A717Tpmo_ImprimeDestino", A717Tpmo_ImprimeDestino);
         }
         cmbTmpo_ImprimeResponsable.setName( "TMPO_IMPRIMERESPONSABLE" );
         cmbTmpo_ImprimeResponsable.setWebtags( "" );
         cmbTmpo_ImprimeResponsable.addItem("", "", (short)(0));
         cmbTmpo_ImprimeResponsable.addItem("SI", "SI", (short)(0));
         cmbTmpo_ImprimeResponsable.addItem("NO", "NO", (short)(0));
         if ( cmbTmpo_ImprimeResponsable.getItemCount() > 0 )
         {
            A718Tmpo_ImprimeResponsable = cmbTmpo_ImprimeResponsable.getValidValue(A718Tmpo_ImprimeResponsable) ;
            n718Tmpo_ImprimeResponsable = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A718Tmpo_ImprimeResponsable", A718Tmpo_ImprimeResponsable);
         }
         cmbTpmo_Estado.setName( "TPMO_ESTADO" );
         cmbTpmo_Estado.setWebtags( "" );
         cmbTpmo_Estado.addItem("A", "Activo", (short)(0));
         cmbTpmo_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbTpmo_Estado.getItemCount() > 0 )
         {
            A679Tpmo_Estado = cmbTpmo_Estado.getValidValue(A679Tpmo_Estado) ;
            n679Tpmo_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A679Tpmo_Estado", A679Tpmo_Estado);
         }
         GXCCtl = "TPMO_SOLICITANUMERO_" + sGXsfl_113_idx ;
         cmbTpmo_SolicitaNumero.setName( GXCCtl );
         cmbTpmo_SolicitaNumero.setWebtags( "" );
         cmbTpmo_SolicitaNumero.addItem("", "", (short)(0));
         cmbTpmo_SolicitaNumero.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaNumero.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaNumero.getItemCount() > 0 )
         {
            A642Tpmo_SolicitaNumero = cmbTpmo_SolicitaNumero.getValidValue(A642Tpmo_SolicitaNumero) ;
         }
         GXCCtl = "TPMO_SOLICITAFECHA_" + sGXsfl_113_idx ;
         cmbTpmo_SolicitaFecha.setName( GXCCtl );
         cmbTpmo_SolicitaFecha.setWebtags( "" );
         cmbTpmo_SolicitaFecha.addItem("", "", (short)(0));
         cmbTpmo_SolicitaFecha.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaFecha.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaFecha.getItemCount() > 0 )
         {
            A643Tpmo_SolicitaFecha = cmbTpmo_SolicitaFecha.getValidValue(A643Tpmo_SolicitaFecha) ;
         }
         GXCCtl = "TPMO_ESTADOORIGEN_" + sGXsfl_113_idx ;
         cmbTpmo_EstadoOrigen.setName( GXCCtl );
         cmbTpmo_EstadoOrigen.setWebtags( "" );
         cmbTpmo_EstadoOrigen.addItem("A", "Activo", (short)(0));
         cmbTpmo_EstadoOrigen.addItem("I", "Inactivo", (short)(0));
         if ( cmbTpmo_EstadoOrigen.getItemCount() > 0 )
         {
            A681Tpmo_EstadoOrigen = cmbTpmo_EstadoOrigen.getValidValue(A681Tpmo_EstadoOrigen) ;
            n681Tpmo_EstadoOrigen = false ;
         }
         dynload_actions( ) ;
         sendRow0V32( ) ;
         nGXsfl_113_idx = (short)(nGXsfl_113_idx+1) ;
         sGXsfl_113_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_113_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_11332( ) ;
      }
      httpContext.GX_webresponse.addString(Gridalm_tipo_movimiento_tipo_movimiento_origenContainer.ToJavascriptSource());
      /* End function gxnrGridalm_tipo_movimiento_tipo_movimiento_origen_newrow */
   }

   public void gxnrgridalm_tipo_movimiento_documento_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_12760( ) ;
      while ( nGXsfl_127_idx <= nRC_GXsfl_127 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0V60( ) ;
         standaloneModal0V60( ) ;
         cmbTipo_Tipo.setName( "TIPO_TIPO" );
         cmbTipo_Tipo.setWebtags( "" );
         cmbTipo_Tipo.addItem("C", "Consumo", (short)(0));
         cmbTipo_Tipo.addItem("D", "Devolutivo", (short)(0));
         if ( cmbTipo_Tipo.getItemCount() > 0 )
         {
            A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
            httpContext.ajax_rsp_assign_attri("", false, "A480Tipo_Tipo", A480Tipo_Tipo);
         }
         cmbTpmo_TipoE_S.setName( "TPMO_TIPOE_S" );
         cmbTpmo_TipoE_S.setWebtags( "" );
         cmbTpmo_TipoE_S.addItem("E", "ENTRADA", (short)(0));
         cmbTpmo_TipoE_S.addItem("S", "SALIDA", (short)(0));
         cmbTpmo_TipoE_S.addItem("T", "TRASPASO", (short)(0));
         cmbTpmo_TipoE_S.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbTpmo_TipoE_S.getItemCount() > 0 )
         {
            A315Tpmo_TipoE_S = cmbTpmo_TipoE_S.getValidValue(A315Tpmo_TipoE_S) ;
            httpContext.ajax_rsp_assign_attri("", false, "A315Tpmo_TipoE_S", A315Tpmo_TipoE_S);
         }
         cmbTpmo_Modulo.setName( "TPMO_MODULO" );
         cmbTpmo_Modulo.setWebtags( "" );
         cmbTpmo_Modulo.addItem("", "", (short)(0));
         cmbTpmo_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbTpmo_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbTpmo_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbTpmo_Modulo.getItemCount() > 0 )
         {
            A316Tpmo_Modulo = cmbTpmo_Modulo.getValidValue(A316Tpmo_Modulo) ;
            httpContext.ajax_rsp_assign_attri("", false, "A316Tpmo_Modulo", A316Tpmo_Modulo);
         }
         cmbTpmo_IngresaAredante.setName( "TPMO_INGRESAAREDANTE" );
         cmbTpmo_IngresaAredante.setWebtags( "" );
         cmbTpmo_IngresaAredante.addItem("", "", (short)(0));
         cmbTpmo_IngresaAredante.addItem("SI", "SI", (short)(0));
         cmbTpmo_IngresaAredante.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_IngresaAredante.getItemCount() > 0 )
         {
            A440Tpmo_IngresaAredante = cmbTpmo_IngresaAredante.getValidValue(A440Tpmo_IngresaAredante) ;
            httpContext.ajax_rsp_assign_attri("", false, "A440Tpmo_IngresaAredante", A440Tpmo_IngresaAredante);
         }
         cmbTpmo_IngresaCurso.setName( "TPMO_INGRESACURSO" );
         cmbTpmo_IngresaCurso.setWebtags( "" );
         cmbTpmo_IngresaCurso.addItem("", "", (short)(0));
         cmbTpmo_IngresaCurso.addItem("SI", "SI", (short)(0));
         cmbTpmo_IngresaCurso.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_IngresaCurso.getItemCount() > 0 )
         {
            A441Tpmo_IngresaCurso = cmbTpmo_IngresaCurso.getValidValue(A441Tpmo_IngresaCurso) ;
            httpContext.ajax_rsp_assign_attri("", false, "A441Tpmo_IngresaCurso", A441Tpmo_IngresaCurso);
         }
         cmbTpmo_Controlado.setName( "TPMO_CONTROLADO" );
         cmbTpmo_Controlado.setWebtags( "" );
         cmbTpmo_Controlado.addItem("", "", (short)(0));
         cmbTpmo_Controlado.addItem("SI", "SI", (short)(0));
         cmbTpmo_Controlado.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_Controlado.getItemCount() > 0 )
         {
            A633Tpmo_Controlado = cmbTpmo_Controlado.getValidValue(A633Tpmo_Controlado) ;
            n633Tpmo_Controlado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A633Tpmo_Controlado", A633Tpmo_Controlado);
         }
         cmbTpmo_VidaUtil.setName( "TPMO_VIDAUTIL" );
         cmbTpmo_VidaUtil.setWebtags( "" );
         cmbTpmo_VidaUtil.addItem("", "", (short)(0));
         cmbTpmo_VidaUtil.addItem("SI", "SI", (short)(0));
         cmbTpmo_VidaUtil.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_VidaUtil.getItemCount() > 0 )
         {
            A641Tpmo_VidaUtil = cmbTpmo_VidaUtil.getValidValue(A641Tpmo_VidaUtil) ;
            n641Tpmo_VidaUtil = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A641Tpmo_VidaUtil", A641Tpmo_VidaUtil);
         }
         cmbTpmo_CuentaResponsabilidad.setName( "TPMO_CUENTARESPONSABILIDAD" );
         cmbTpmo_CuentaResponsabilidad.setWebtags( "" );
         cmbTpmo_CuentaResponsabilidad.addItem("", "", (short)(0));
         cmbTpmo_CuentaResponsabilidad.addItem("SI", "SI", (short)(0));
         cmbTpmo_CuentaResponsabilidad.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_CuentaResponsabilidad.getItemCount() > 0 )
         {
            A680Tpmo_CuentaResponsabilidad = cmbTpmo_CuentaResponsabilidad.getValidValue(A680Tpmo_CuentaResponsabilidad) ;
            n680Tpmo_CuentaResponsabilidad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A680Tpmo_CuentaResponsabilidad", A680Tpmo_CuentaResponsabilidad);
         }
         cmbTpmo_SolicitaRegionDestino.setName( "TPMO_SOLICITAREGIONDESTINO" );
         cmbTpmo_SolicitaRegionDestino.setWebtags( "" );
         cmbTpmo_SolicitaRegionDestino.addItem("", "", (short)(0));
         cmbTpmo_SolicitaRegionDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaRegionDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaRegionDestino.getItemCount() > 0 )
         {
            A705Tpmo_SolicitaRegionDestino = cmbTpmo_SolicitaRegionDestino.getValidValue(A705Tpmo_SolicitaRegionDestino) ;
            n705Tpmo_SolicitaRegionDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A705Tpmo_SolicitaRegionDestino", A705Tpmo_SolicitaRegionDestino);
         }
         cmbTpmo_SolicitaCentroDestino.setName( "TPMO_SOLICITACENTRODESTINO" );
         cmbTpmo_SolicitaCentroDestino.setWebtags( "" );
         cmbTpmo_SolicitaCentroDestino.addItem("", "", (short)(0));
         cmbTpmo_SolicitaCentroDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaCentroDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaCentroDestino.getItemCount() > 0 )
         {
            A706Tpmo_SolicitaCentroDestino = cmbTpmo_SolicitaCentroDestino.getValidValue(A706Tpmo_SolicitaCentroDestino) ;
            n706Tpmo_SolicitaCentroDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A706Tpmo_SolicitaCentroDestino", A706Tpmo_SolicitaCentroDestino);
         }
         cmbTpmo_ImprimeOrigen.setName( "TPMO_IMPRIMEORIGEN" );
         cmbTpmo_ImprimeOrigen.setWebtags( "" );
         cmbTpmo_ImprimeOrigen.addItem("", "", (short)(0));
         cmbTpmo_ImprimeOrigen.addItem("SI", "SI", (short)(0));
         cmbTpmo_ImprimeOrigen.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_ImprimeOrigen.getItemCount() > 0 )
         {
            A716Tpmo_ImprimeOrigen = cmbTpmo_ImprimeOrigen.getValidValue(A716Tpmo_ImprimeOrigen) ;
            n716Tpmo_ImprimeOrigen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A716Tpmo_ImprimeOrigen", A716Tpmo_ImprimeOrigen);
         }
         cmbTpmo_ImprimeDestino.setName( "TPMO_IMPRIMEDESTINO" );
         cmbTpmo_ImprimeDestino.setWebtags( "" );
         cmbTpmo_ImprimeDestino.addItem("", "", (short)(0));
         cmbTpmo_ImprimeDestino.addItem("SI", "SI", (short)(0));
         cmbTpmo_ImprimeDestino.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_ImprimeDestino.getItemCount() > 0 )
         {
            A717Tpmo_ImprimeDestino = cmbTpmo_ImprimeDestino.getValidValue(A717Tpmo_ImprimeDestino) ;
            n717Tpmo_ImprimeDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A717Tpmo_ImprimeDestino", A717Tpmo_ImprimeDestino);
         }
         cmbTmpo_ImprimeResponsable.setName( "TMPO_IMPRIMERESPONSABLE" );
         cmbTmpo_ImprimeResponsable.setWebtags( "" );
         cmbTmpo_ImprimeResponsable.addItem("", "", (short)(0));
         cmbTmpo_ImprimeResponsable.addItem("SI", "SI", (short)(0));
         cmbTmpo_ImprimeResponsable.addItem("NO", "NO", (short)(0));
         if ( cmbTmpo_ImprimeResponsable.getItemCount() > 0 )
         {
            A718Tmpo_ImprimeResponsable = cmbTmpo_ImprimeResponsable.getValidValue(A718Tmpo_ImprimeResponsable) ;
            n718Tmpo_ImprimeResponsable = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A718Tmpo_ImprimeResponsable", A718Tmpo_ImprimeResponsable);
         }
         cmbTpmo_Estado.setName( "TPMO_ESTADO" );
         cmbTpmo_Estado.setWebtags( "" );
         cmbTpmo_Estado.addItem("A", "Activo", (short)(0));
         cmbTpmo_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbTpmo_Estado.getItemCount() > 0 )
         {
            A679Tpmo_Estado = cmbTpmo_Estado.getValidValue(A679Tpmo_Estado) ;
            n679Tpmo_Estado = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A679Tpmo_Estado", A679Tpmo_Estado);
         }
         GXCCtl = "TPMO_SOLICITANUMERO_" + sGXsfl_113_idx ;
         cmbTpmo_SolicitaNumero.setName( GXCCtl );
         cmbTpmo_SolicitaNumero.setWebtags( "" );
         cmbTpmo_SolicitaNumero.addItem("", "", (short)(0));
         cmbTpmo_SolicitaNumero.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaNumero.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaNumero.getItemCount() > 0 )
         {
            A642Tpmo_SolicitaNumero = cmbTpmo_SolicitaNumero.getValidValue(A642Tpmo_SolicitaNumero) ;
         }
         GXCCtl = "TPMO_SOLICITAFECHA_" + sGXsfl_113_idx ;
         cmbTpmo_SolicitaFecha.setName( GXCCtl );
         cmbTpmo_SolicitaFecha.setWebtags( "" );
         cmbTpmo_SolicitaFecha.addItem("", "", (short)(0));
         cmbTpmo_SolicitaFecha.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaFecha.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaFecha.getItemCount() > 0 )
         {
            A643Tpmo_SolicitaFecha = cmbTpmo_SolicitaFecha.getValidValue(A643Tpmo_SolicitaFecha) ;
         }
         GXCCtl = "TPMO_ESTADOORIGEN_" + sGXsfl_113_idx ;
         cmbTpmo_EstadoOrigen.setName( GXCCtl );
         cmbTpmo_EstadoOrigen.setWebtags( "" );
         cmbTpmo_EstadoOrigen.addItem("A", "Activo", (short)(0));
         cmbTpmo_EstadoOrigen.addItem("I", "Inactivo", (short)(0));
         if ( cmbTpmo_EstadoOrigen.getItemCount() > 0 )
         {
            A681Tpmo_EstadoOrigen = cmbTpmo_EstadoOrigen.getValidValue(A681Tpmo_EstadoOrigen) ;
            n681Tpmo_EstadoOrigen = false ;
         }
         dynload_actions( ) ;
         sendRow0V60( ) ;
         nGXsfl_127_idx = (short)(nGXsfl_127_idx+1) ;
         sGXsfl_127_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_127_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_12760( ) ;
      }
      httpContext.GX_webresponse.addString(Gridalm_tipo_movimiento_documentoContainer.ToJavascriptSource());
      /* End function gxnrGridalm_tipo_movimiento_documento_newrow */
   }

   public void valid_Tipo_codigo( long GX_Parm1 ,
                                  String GX_Parm2 ,
                                  com.genexus.webpanels.HTMLChoice GX_Parm3 )
   {
      A33Tipo_Codigo = GX_Parm1 ;
      A253Tipo_Descripcion = GX_Parm2 ;
      cmbTipo_Tipo = GX_Parm3 ;
      A480Tipo_Tipo = cmbTipo_Tipo.getValue() ;
      cmbTipo_Tipo.setValue( A480Tipo_Tipo );
      /* Using cursor T000V23 */
      pr_default.execute(21, new Object[] {new Long(A33Tipo_Codigo)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'TIPO DE ELEMENTO'.", "ForeignKeyNotFound", 1, "TIPO_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipo_Codigo_Internalname ;
      }
      A253Tipo_Descripcion = T000V23_A253Tipo_Descripcion[0] ;
      A480Tipo_Tipo = T000V23_A480Tipo_Tipo[0] ;
      cmbTipo_Tipo.setValue( A480Tipo_Tipo );
      pr_default.close(21);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A253Tipo_Descripcion = "" ;
         A480Tipo_Tipo = "" ;
         cmbTipo_Tipo.setValue( A480Tipo_Tipo );
      }
      isValidOutput.add(A253Tipo_Descripcion);
      cmbTipo_Tipo.setValue( A480Tipo_Tipo );
      isValidOutput.add(cmbTipo_Tipo);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tpmo_almacenorigenid( long GX_Parm1 ,
                                           String GX_Parm2 )
   {
      A39Tpmo_AlmacenOrigenId = GX_Parm1 ;
      A312Tpmo_AlmacenOrigenDescrip = GX_Parm2 ;
      n312Tpmo_AlmacenOrigenDescrip = false ;
      /* Using cursor T000V24 */
      pr_default.execute(22, new Object[] {new Long(A39Tpmo_AlmacenOrigenId)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo_Alma_Origen'.", "ForeignKeyNotFound", 1, "TPMO_ALMACENORIGENID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpmo_AlmacenOrigenId_Internalname ;
      }
      A312Tpmo_AlmacenOrigenDescrip = T000V24_A312Tpmo_AlmacenOrigenDescrip[0] ;
      n312Tpmo_AlmacenOrigenDescrip = T000V24_n312Tpmo_AlmacenOrigenDescrip[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A312Tpmo_AlmacenOrigenDescrip = "" ;
         n312Tpmo_AlmacenOrigenDescrip = false ;
      }
      isValidOutput.add(A312Tpmo_AlmacenOrigenDescrip);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tpmo_almacendestinoid( long GX_Parm1 ,
                                            String GX_Parm2 )
   {
      A40Tpmo_AlmacenDestinoId = GX_Parm1 ;
      A314Tpmo_AlmacenDestinoDescrip = GX_Parm2 ;
      n314Tpmo_AlmacenDestinoDescrip = false ;
      /* Using cursor T000V25 */
      pr_default.execute(23, new Object[] {new Long(A40Tpmo_AlmacenDestinoId)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Tipo_Alma_Destino'.", "ForeignKeyNotFound", 1, "TPMO_ALMACENDESTINOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTpmo_AlmacenDestinoId_Internalname ;
      }
      A314Tpmo_AlmacenDestinoDescrip = T000V25_A314Tpmo_AlmacenDestinoDescrip[0] ;
      n314Tpmo_AlmacenDestinoDescrip = T000V25_n314Tpmo_AlmacenDestinoDescrip[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A314Tpmo_AlmacenDestinoDescrip = "" ;
         n314Tpmo_AlmacenDestinoDescrip = false ;
      }
      isValidOutput.add(A314Tpmo_AlmacenDestinoDescrip);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Orig_identificador( long GX_Parm1 ,
                                         String GX_Parm2 )
   {
      A41Orig_Identificador = GX_Parm1 ;
      A635Orig_Descripcion = GX_Parm2 ;
      n635Orig_Descripcion = false ;
      /* Using cursor T000V35 */
      pr_default.execute(33, new Object[] {new Long(A41Orig_Identificador)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'Origen de los bienes'.", "ForeignKeyNotFound", 1, "ORIG_IDENTIFICADOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOrig_Identificador_Internalname ;
      }
      A635Orig_Descripcion = T000V35_A635Orig_Descripcion[0] ;
      n635Orig_Descripcion = T000V35_n635Orig_Descripcion[0] ;
      pr_default.close(33);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A635Orig_Descripcion = "" ;
         n635Orig_Descripcion = false ;
      }
      isValidOutput.add(A635Orig_Descripcion);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Docu_nro( short GX_Parm1 ,
                               String GX_Parm2 ,
                               String GX_Parm3 )
   {
      A819Docu_Nro = GX_Parm1 ;
      A820Docu_Descripcion = GX_Parm2 ;
      n820Docu_Descripcion = false ;
      A821Docu_Prefijo = GX_Parm3 ;
      n821Docu_Prefijo = false ;
      /* Using cursor T000V42 */
      pr_default.execute(40, new Object[] {new Short(A819Docu_Nro)});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem("No existe 'ALM_DOCUMENTOS'.", "ForeignKeyNotFound", 1, "DOCU_NRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDocu_Nro_Internalname ;
      }
      A820Docu_Descripcion = T000V42_A820Docu_Descripcion[0] ;
      n820Docu_Descripcion = T000V42_n820Docu_Descripcion[0] ;
      A821Docu_Prefijo = T000V42_A821Docu_Prefijo[0] ;
      n821Docu_Prefijo = T000V42_n821Docu_Prefijo[0] ;
      pr_default.close(40);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A820Docu_Descripcion = "" ;
         n820Docu_Descripcion = false ;
         A821Docu_Prefijo = "" ;
         n821Docu_Prefijo = false ;
      }
      isValidOutput.add(A820Docu_Descripcion);
      isValidOutput.add(A821Docu_Prefijo);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV15Tpmo_Codigo',fld:'vTPMO_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120V2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV9TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(40);
      pr_default.close(33);
      pr_default.close(21);
      pr_default.close(22);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV15Tpmo_Codigo = "" ;
      Z38Tpmo_Codigo = "" ;
      Z317Tpmo_UsuarioCrea = "" ;
      Z318Tpmo_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      Z319Tpmo_UsuarioModifica = "" ;
      Z320Tpmo_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      Z313Tpmo_Descripcion = "" ;
      Z315Tpmo_TipoE_S = "" ;
      Z316Tpmo_Modulo = "" ;
      Z440Tpmo_IngresaAredante = "" ;
      Z441Tpmo_IngresaCurso = "" ;
      Z633Tpmo_Controlado = "" ;
      Z641Tpmo_VidaUtil = "" ;
      Z679Tpmo_Estado = "" ;
      Z680Tpmo_CuentaResponsabilidad = "" ;
      Z705Tpmo_SolicitaRegionDestino = "" ;
      Z706Tpmo_SolicitaCentroDestino = "" ;
      Z716Tpmo_ImprimeOrigen = "" ;
      Z717Tpmo_ImprimeDestino = "" ;
      Z718Tmpo_ImprimeResponsable = "" ;
      Z642Tpmo_SolicitaNumero = "" ;
      Z643Tpmo_SolicitaFecha = "" ;
      Z681Tpmo_EstadoOrigen = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV15Tpmo_Codigo = "" ;
      GXKey = "" ;
      A480Tipo_Tipo = "" ;
      A315Tpmo_TipoE_S = "" ;
      A316Tpmo_Modulo = "" ;
      A440Tpmo_IngresaAredante = "" ;
      A441Tpmo_IngresaCurso = "" ;
      A633Tpmo_Controlado = "" ;
      A641Tpmo_VidaUtil = "" ;
      A680Tpmo_CuentaResponsabilidad = "" ;
      A705Tpmo_SolicitaRegionDestino = "" ;
      A706Tpmo_SolicitaCentroDestino = "" ;
      A716Tpmo_ImprimeOrigen = "" ;
      A717Tpmo_ImprimeDestino = "" ;
      A718Tmpo_ImprimeResponsable = "" ;
      A679Tpmo_Estado = "" ;
      GXCCtl = "" ;
      A642Tpmo_SolicitaNumero = "" ;
      A643Tpmo_SolicitaFecha = "" ;
      A681Tpmo_EstadoOrigen = "" ;
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
      A38Tpmo_Codigo = "" ;
      A313Tpmo_Descripcion = "" ;
      sImgUrl = "" ;
      A253Tipo_Descripcion = "" ;
      A312Tpmo_AlmacenOrigenDescrip = "" ;
      A314Tpmo_AlmacenDestinoDescrip = "" ;
      lblTitletipo_movimiento_origen_Jsonclick = "" ;
      lblTitledocumento_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridalm_tipo_movimiento_tipo_movimiento_origenContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridalm_tipo_movimiento_tipo_movimiento_origenColumn = new com.genexus.webpanels.GXWebColumn();
      A635Orig_Descripcion = "" ;
      sMode32 = "" ;
      sStyleString = "" ;
      Gridalm_tipo_movimiento_documentoContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridalm_tipo_movimiento_documentoColumn = new com.genexus.webpanels.GXWebColumn();
      A820Docu_Descripcion = "" ;
      A821Docu_Prefijo = "" ;
      sMode60 = "" ;
      A319Tpmo_UsuarioModifica = "" ;
      A320Tpmo_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A317Tpmo_UsuarioCrea = "" ;
      A318Tpmo_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      AV16Usuario = "" ;
      AV18Pgmname = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode31 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV9TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z253Tipo_Descripcion = "" ;
      Z480Tipo_Tipo = "" ;
      Z312Tpmo_AlmacenOrigenDescrip = "" ;
      Z314Tpmo_AlmacenDestinoDescrip = "" ;
      T000V12_A314Tpmo_AlmacenDestinoDescrip = new String[] {""} ;
      T000V12_n314Tpmo_AlmacenDestinoDescrip = new boolean[] {false} ;
      T000V11_A312Tpmo_AlmacenOrigenDescrip = new String[] {""} ;
      T000V11_n312Tpmo_AlmacenOrigenDescrip = new boolean[] {false} ;
      T000V10_A253Tipo_Descripcion = new String[] {""} ;
      T000V10_A480Tipo_Tipo = new String[] {""} ;
      T000V13_A38Tpmo_Codigo = new String[] {""} ;
      T000V13_A317Tpmo_UsuarioCrea = new String[] {""} ;
      T000V13_A318Tpmo_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000V13_A319Tpmo_UsuarioModifica = new String[] {""} ;
      T000V13_n319Tpmo_UsuarioModifica = new boolean[] {false} ;
      T000V13_A320Tpmo_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000V13_n320Tpmo_FechaModifica = new boolean[] {false} ;
      T000V13_A313Tpmo_Descripcion = new String[] {""} ;
      T000V13_A253Tipo_Descripcion = new String[] {""} ;
      T000V13_A480Tipo_Tipo = new String[] {""} ;
      T000V13_A312Tpmo_AlmacenOrigenDescrip = new String[] {""} ;
      T000V13_n312Tpmo_AlmacenOrigenDescrip = new boolean[] {false} ;
      T000V13_A314Tpmo_AlmacenDestinoDescrip = new String[] {""} ;
      T000V13_n314Tpmo_AlmacenDestinoDescrip = new boolean[] {false} ;
      T000V13_A315Tpmo_TipoE_S = new String[] {""} ;
      T000V13_A316Tpmo_Modulo = new String[] {""} ;
      T000V13_A440Tpmo_IngresaAredante = new String[] {""} ;
      T000V13_A441Tpmo_IngresaCurso = new String[] {""} ;
      T000V13_A595Tpmo_ConsecutivoTrans = new long[1] ;
      T000V13_n595Tpmo_ConsecutivoTrans = new boolean[] {false} ;
      T000V13_A633Tpmo_Controlado = new String[] {""} ;
      T000V13_n633Tpmo_Controlado = new boolean[] {false} ;
      T000V13_A641Tpmo_VidaUtil = new String[] {""} ;
      T000V13_n641Tpmo_VidaUtil = new boolean[] {false} ;
      T000V13_A679Tpmo_Estado = new String[] {""} ;
      T000V13_n679Tpmo_Estado = new boolean[] {false} ;
      T000V13_A680Tpmo_CuentaResponsabilidad = new String[] {""} ;
      T000V13_n680Tpmo_CuentaResponsabilidad = new boolean[] {false} ;
      T000V13_A705Tpmo_SolicitaRegionDestino = new String[] {""} ;
      T000V13_n705Tpmo_SolicitaRegionDestino = new boolean[] {false} ;
      T000V13_A706Tpmo_SolicitaCentroDestino = new String[] {""} ;
      T000V13_n706Tpmo_SolicitaCentroDestino = new boolean[] {false} ;
      T000V13_A716Tpmo_ImprimeOrigen = new String[] {""} ;
      T000V13_n716Tpmo_ImprimeOrigen = new boolean[] {false} ;
      T000V13_A717Tpmo_ImprimeDestino = new String[] {""} ;
      T000V13_n717Tpmo_ImprimeDestino = new boolean[] {false} ;
      T000V13_A718Tmpo_ImprimeResponsable = new String[] {""} ;
      T000V13_n718Tmpo_ImprimeResponsable = new boolean[] {false} ;
      T000V13_A33Tipo_Codigo = new long[1] ;
      T000V13_A39Tpmo_AlmacenOrigenId = new long[1] ;
      T000V13_A40Tpmo_AlmacenDestinoId = new long[1] ;
      T000V14_A253Tipo_Descripcion = new String[] {""} ;
      T000V14_A480Tipo_Tipo = new String[] {""} ;
      T000V15_A312Tpmo_AlmacenOrigenDescrip = new String[] {""} ;
      T000V15_n312Tpmo_AlmacenOrigenDescrip = new boolean[] {false} ;
      T000V16_A314Tpmo_AlmacenDestinoDescrip = new String[] {""} ;
      T000V16_n314Tpmo_AlmacenDestinoDescrip = new boolean[] {false} ;
      T000V17_A38Tpmo_Codigo = new String[] {""} ;
      T000V9_A38Tpmo_Codigo = new String[] {""} ;
      T000V9_A317Tpmo_UsuarioCrea = new String[] {""} ;
      T000V9_A318Tpmo_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000V9_A319Tpmo_UsuarioModifica = new String[] {""} ;
      T000V9_n319Tpmo_UsuarioModifica = new boolean[] {false} ;
      T000V9_A320Tpmo_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000V9_n320Tpmo_FechaModifica = new boolean[] {false} ;
      T000V9_A313Tpmo_Descripcion = new String[] {""} ;
      T000V9_A315Tpmo_TipoE_S = new String[] {""} ;
      T000V9_A316Tpmo_Modulo = new String[] {""} ;
      T000V9_A440Tpmo_IngresaAredante = new String[] {""} ;
      T000V9_A441Tpmo_IngresaCurso = new String[] {""} ;
      T000V9_A595Tpmo_ConsecutivoTrans = new long[1] ;
      T000V9_n595Tpmo_ConsecutivoTrans = new boolean[] {false} ;
      T000V9_A633Tpmo_Controlado = new String[] {""} ;
      T000V9_n633Tpmo_Controlado = new boolean[] {false} ;
      T000V9_A641Tpmo_VidaUtil = new String[] {""} ;
      T000V9_n641Tpmo_VidaUtil = new boolean[] {false} ;
      T000V9_A679Tpmo_Estado = new String[] {""} ;
      T000V9_n679Tpmo_Estado = new boolean[] {false} ;
      T000V9_A680Tpmo_CuentaResponsabilidad = new String[] {""} ;
      T000V9_n680Tpmo_CuentaResponsabilidad = new boolean[] {false} ;
      T000V9_A705Tpmo_SolicitaRegionDestino = new String[] {""} ;
      T000V9_n705Tpmo_SolicitaRegionDestino = new boolean[] {false} ;
      T000V9_A706Tpmo_SolicitaCentroDestino = new String[] {""} ;
      T000V9_n706Tpmo_SolicitaCentroDestino = new boolean[] {false} ;
      T000V9_A716Tpmo_ImprimeOrigen = new String[] {""} ;
      T000V9_n716Tpmo_ImprimeOrigen = new boolean[] {false} ;
      T000V9_A717Tpmo_ImprimeDestino = new String[] {""} ;
      T000V9_n717Tpmo_ImprimeDestino = new boolean[] {false} ;
      T000V9_A718Tmpo_ImprimeResponsable = new String[] {""} ;
      T000V9_n718Tmpo_ImprimeResponsable = new boolean[] {false} ;
      T000V9_A33Tipo_Codigo = new long[1] ;
      T000V9_A39Tpmo_AlmacenOrigenId = new long[1] ;
      T000V9_A40Tpmo_AlmacenDestinoId = new long[1] ;
      T000V18_A38Tpmo_Codigo = new String[] {""} ;
      T000V19_A38Tpmo_Codigo = new String[] {""} ;
      T000V8_A38Tpmo_Codigo = new String[] {""} ;
      T000V8_A317Tpmo_UsuarioCrea = new String[] {""} ;
      T000V8_A318Tpmo_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      T000V8_A319Tpmo_UsuarioModifica = new String[] {""} ;
      T000V8_n319Tpmo_UsuarioModifica = new boolean[] {false} ;
      T000V8_A320Tpmo_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      T000V8_n320Tpmo_FechaModifica = new boolean[] {false} ;
      T000V8_A313Tpmo_Descripcion = new String[] {""} ;
      T000V8_A315Tpmo_TipoE_S = new String[] {""} ;
      T000V8_A316Tpmo_Modulo = new String[] {""} ;
      T000V8_A440Tpmo_IngresaAredante = new String[] {""} ;
      T000V8_A441Tpmo_IngresaCurso = new String[] {""} ;
      T000V8_A595Tpmo_ConsecutivoTrans = new long[1] ;
      T000V8_n595Tpmo_ConsecutivoTrans = new boolean[] {false} ;
      T000V8_A633Tpmo_Controlado = new String[] {""} ;
      T000V8_n633Tpmo_Controlado = new boolean[] {false} ;
      T000V8_A641Tpmo_VidaUtil = new String[] {""} ;
      T000V8_n641Tpmo_VidaUtil = new boolean[] {false} ;
      T000V8_A679Tpmo_Estado = new String[] {""} ;
      T000V8_n679Tpmo_Estado = new boolean[] {false} ;
      T000V8_A680Tpmo_CuentaResponsabilidad = new String[] {""} ;
      T000V8_n680Tpmo_CuentaResponsabilidad = new boolean[] {false} ;
      T000V8_A705Tpmo_SolicitaRegionDestino = new String[] {""} ;
      T000V8_n705Tpmo_SolicitaRegionDestino = new boolean[] {false} ;
      T000V8_A706Tpmo_SolicitaCentroDestino = new String[] {""} ;
      T000V8_n706Tpmo_SolicitaCentroDestino = new boolean[] {false} ;
      T000V8_A716Tpmo_ImprimeOrigen = new String[] {""} ;
      T000V8_n716Tpmo_ImprimeOrigen = new boolean[] {false} ;
      T000V8_A717Tpmo_ImprimeDestino = new String[] {""} ;
      T000V8_n717Tpmo_ImprimeDestino = new boolean[] {false} ;
      T000V8_A718Tmpo_ImprimeResponsable = new String[] {""} ;
      T000V8_n718Tmpo_ImprimeResponsable = new boolean[] {false} ;
      T000V8_A33Tipo_Codigo = new long[1] ;
      T000V8_A39Tpmo_AlmacenOrigenId = new long[1] ;
      T000V8_A40Tpmo_AlmacenDestinoId = new long[1] ;
      T000V23_A253Tipo_Descripcion = new String[] {""} ;
      T000V23_A480Tipo_Tipo = new String[] {""} ;
      T000V24_A312Tpmo_AlmacenOrigenDescrip = new String[] {""} ;
      T000V24_n312Tpmo_AlmacenOrigenDescrip = new boolean[] {false} ;
      T000V25_A314Tpmo_AlmacenDestinoDescrip = new String[] {""} ;
      T000V25_n314Tpmo_AlmacenDestinoDescrip = new boolean[] {false} ;
      T000V26_A60Mbod_Id = new long[1] ;
      T000V27_A46Tran_Id = new long[1] ;
      T000V28_A38Tpmo_Codigo = new String[] {""} ;
      Z635Orig_Descripcion = "" ;
      T000V29_A38Tpmo_Codigo = new String[] {""} ;
      T000V29_A635Orig_Descripcion = new String[] {""} ;
      T000V29_n635Orig_Descripcion = new boolean[] {false} ;
      T000V29_A642Tpmo_SolicitaNumero = new String[] {""} ;
      T000V29_A643Tpmo_SolicitaFecha = new String[] {""} ;
      T000V29_A681Tpmo_EstadoOrigen = new String[] {""} ;
      T000V29_n681Tpmo_EstadoOrigen = new boolean[] {false} ;
      T000V29_A41Orig_Identificador = new long[1] ;
      T000V7_A635Orig_Descripcion = new String[] {""} ;
      T000V7_n635Orig_Descripcion = new boolean[] {false} ;
      T000V30_A635Orig_Descripcion = new String[] {""} ;
      T000V30_n635Orig_Descripcion = new boolean[] {false} ;
      T000V31_A38Tpmo_Codigo = new String[] {""} ;
      T000V31_A41Orig_Identificador = new long[1] ;
      T000V6_A38Tpmo_Codigo = new String[] {""} ;
      T000V6_A642Tpmo_SolicitaNumero = new String[] {""} ;
      T000V6_A643Tpmo_SolicitaFecha = new String[] {""} ;
      T000V6_A681Tpmo_EstadoOrigen = new String[] {""} ;
      T000V6_n681Tpmo_EstadoOrigen = new boolean[] {false} ;
      T000V6_A41Orig_Identificador = new long[1] ;
      T000V5_A38Tpmo_Codigo = new String[] {""} ;
      T000V5_A642Tpmo_SolicitaNumero = new String[] {""} ;
      T000V5_A643Tpmo_SolicitaFecha = new String[] {""} ;
      T000V5_A681Tpmo_EstadoOrigen = new String[] {""} ;
      T000V5_n681Tpmo_EstadoOrigen = new boolean[] {false} ;
      T000V5_A41Orig_Identificador = new long[1] ;
      T000V35_A635Orig_Descripcion = new String[] {""} ;
      T000V35_n635Orig_Descripcion = new boolean[] {false} ;
      T000V36_A38Tpmo_Codigo = new String[] {""} ;
      T000V36_A41Orig_Identificador = new long[1] ;
      Z820Docu_Descripcion = "" ;
      Z821Docu_Prefijo = "" ;
      T000V37_A38Tpmo_Codigo = new String[] {""} ;
      T000V37_A820Docu_Descripcion = new String[] {""} ;
      T000V37_n820Docu_Descripcion = new boolean[] {false} ;
      T000V37_A821Docu_Prefijo = new String[] {""} ;
      T000V37_n821Docu_Prefijo = new boolean[] {false} ;
      T000V37_A819Docu_Nro = new short[1] ;
      T000V4_A820Docu_Descripcion = new String[] {""} ;
      T000V4_n820Docu_Descripcion = new boolean[] {false} ;
      T000V4_A821Docu_Prefijo = new String[] {""} ;
      T000V4_n821Docu_Prefijo = new boolean[] {false} ;
      T000V38_A820Docu_Descripcion = new String[] {""} ;
      T000V38_n820Docu_Descripcion = new boolean[] {false} ;
      T000V38_A821Docu_Prefijo = new String[] {""} ;
      T000V38_n821Docu_Prefijo = new boolean[] {false} ;
      T000V39_A38Tpmo_Codigo = new String[] {""} ;
      T000V39_A819Docu_Nro = new short[1] ;
      T000V3_A38Tpmo_Codigo = new String[] {""} ;
      T000V3_A819Docu_Nro = new short[1] ;
      T000V2_A38Tpmo_Codigo = new String[] {""} ;
      T000V2_A819Docu_Nro = new short[1] ;
      T000V42_A820Docu_Descripcion = new String[] {""} ;
      T000V42_n820Docu_Descripcion = new boolean[] {false} ;
      T000V42_A821Docu_Prefijo = new String[] {""} ;
      T000V42_n821Docu_Prefijo = new boolean[] {false} ;
      T000V43_A38Tpmo_Codigo = new String[] {""} ;
      T000V43_A819Docu_Nro = new short[1] ;
      Gridalm_tipo_movimiento_tipo_movimiento_origenRow = new com.genexus.webpanels.GXWebRow();
      subGridalm_tipo_movimiento_tipo_movimiento_origen_Linesclass = "" ;
      ROClassString = "" ;
      Gridalm_tipo_movimiento_documentoRow = new com.genexus.webpanels.GXWebRow();
      subGridalm_tipo_movimiento_documento_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_tipo_movimiento__default(),
         new Object[] {
             new Object[] {
            T000V2_A38Tpmo_Codigo, T000V2_A819Docu_Nro
            }
            , new Object[] {
            T000V3_A38Tpmo_Codigo, T000V3_A819Docu_Nro
            }
            , new Object[] {
            T000V4_A820Docu_Descripcion, T000V4_n820Docu_Descripcion, T000V4_A821Docu_Prefijo, T000V4_n821Docu_Prefijo
            }
            , new Object[] {
            T000V5_A38Tpmo_Codigo, T000V5_A642Tpmo_SolicitaNumero, T000V5_A643Tpmo_SolicitaFecha, T000V5_A681Tpmo_EstadoOrigen, T000V5_n681Tpmo_EstadoOrigen, T000V5_A41Orig_Identificador
            }
            , new Object[] {
            T000V6_A38Tpmo_Codigo, T000V6_A642Tpmo_SolicitaNumero, T000V6_A643Tpmo_SolicitaFecha, T000V6_A681Tpmo_EstadoOrigen, T000V6_n681Tpmo_EstadoOrigen, T000V6_A41Orig_Identificador
            }
            , new Object[] {
            T000V7_A635Orig_Descripcion, T000V7_n635Orig_Descripcion
            }
            , new Object[] {
            T000V8_A38Tpmo_Codigo, T000V8_A317Tpmo_UsuarioCrea, T000V8_A318Tpmo_FechaCrea, T000V8_A319Tpmo_UsuarioModifica, T000V8_n319Tpmo_UsuarioModifica, T000V8_A320Tpmo_FechaModifica, T000V8_n320Tpmo_FechaModifica, T000V8_A313Tpmo_Descripcion, T000V8_A315Tpmo_TipoE_S, T000V8_A316Tpmo_Modulo,
            T000V8_A440Tpmo_IngresaAredante, T000V8_A441Tpmo_IngresaCurso, T000V8_A595Tpmo_ConsecutivoTrans, T000V8_n595Tpmo_ConsecutivoTrans, T000V8_A633Tpmo_Controlado, T000V8_n633Tpmo_Controlado, T000V8_A641Tpmo_VidaUtil, T000V8_n641Tpmo_VidaUtil, T000V8_A679Tpmo_Estado, T000V8_n679Tpmo_Estado,
            T000V8_A680Tpmo_CuentaResponsabilidad, T000V8_n680Tpmo_CuentaResponsabilidad, T000V8_A705Tpmo_SolicitaRegionDestino, T000V8_n705Tpmo_SolicitaRegionDestino, T000V8_A706Tpmo_SolicitaCentroDestino, T000V8_n706Tpmo_SolicitaCentroDestino, T000V8_A716Tpmo_ImprimeOrigen, T000V8_n716Tpmo_ImprimeOrigen, T000V8_A717Tpmo_ImprimeDestino, T000V8_n717Tpmo_ImprimeDestino,
            T000V8_A718Tmpo_ImprimeResponsable, T000V8_n718Tmpo_ImprimeResponsable, T000V8_A33Tipo_Codigo, T000V8_A39Tpmo_AlmacenOrigenId, T000V8_A40Tpmo_AlmacenDestinoId
            }
            , new Object[] {
            T000V9_A38Tpmo_Codigo, T000V9_A317Tpmo_UsuarioCrea, T000V9_A318Tpmo_FechaCrea, T000V9_A319Tpmo_UsuarioModifica, T000V9_n319Tpmo_UsuarioModifica, T000V9_A320Tpmo_FechaModifica, T000V9_n320Tpmo_FechaModifica, T000V9_A313Tpmo_Descripcion, T000V9_A315Tpmo_TipoE_S, T000V9_A316Tpmo_Modulo,
            T000V9_A440Tpmo_IngresaAredante, T000V9_A441Tpmo_IngresaCurso, T000V9_A595Tpmo_ConsecutivoTrans, T000V9_n595Tpmo_ConsecutivoTrans, T000V9_A633Tpmo_Controlado, T000V9_n633Tpmo_Controlado, T000V9_A641Tpmo_VidaUtil, T000V9_n641Tpmo_VidaUtil, T000V9_A679Tpmo_Estado, T000V9_n679Tpmo_Estado,
            T000V9_A680Tpmo_CuentaResponsabilidad, T000V9_n680Tpmo_CuentaResponsabilidad, T000V9_A705Tpmo_SolicitaRegionDestino, T000V9_n705Tpmo_SolicitaRegionDestino, T000V9_A706Tpmo_SolicitaCentroDestino, T000V9_n706Tpmo_SolicitaCentroDestino, T000V9_A716Tpmo_ImprimeOrigen, T000V9_n716Tpmo_ImprimeOrigen, T000V9_A717Tpmo_ImprimeDestino, T000V9_n717Tpmo_ImprimeDestino,
            T000V9_A718Tmpo_ImprimeResponsable, T000V9_n718Tmpo_ImprimeResponsable, T000V9_A33Tipo_Codigo, T000V9_A39Tpmo_AlmacenOrigenId, T000V9_A40Tpmo_AlmacenDestinoId
            }
            , new Object[] {
            T000V10_A253Tipo_Descripcion, T000V10_A480Tipo_Tipo
            }
            , new Object[] {
            T000V11_A312Tpmo_AlmacenOrigenDescrip, T000V11_n312Tpmo_AlmacenOrigenDescrip
            }
            , new Object[] {
            T000V12_A314Tpmo_AlmacenDestinoDescrip, T000V12_n314Tpmo_AlmacenDestinoDescrip
            }
            , new Object[] {
            T000V13_A38Tpmo_Codigo, T000V13_A317Tpmo_UsuarioCrea, T000V13_A318Tpmo_FechaCrea, T000V13_A319Tpmo_UsuarioModifica, T000V13_n319Tpmo_UsuarioModifica, T000V13_A320Tpmo_FechaModifica, T000V13_n320Tpmo_FechaModifica, T000V13_A313Tpmo_Descripcion, T000V13_A253Tipo_Descripcion, T000V13_A480Tipo_Tipo,
            T000V13_A312Tpmo_AlmacenOrigenDescrip, T000V13_n312Tpmo_AlmacenOrigenDescrip, T000V13_A314Tpmo_AlmacenDestinoDescrip, T000V13_n314Tpmo_AlmacenDestinoDescrip, T000V13_A315Tpmo_TipoE_S, T000V13_A316Tpmo_Modulo, T000V13_A440Tpmo_IngresaAredante, T000V13_A441Tpmo_IngresaCurso, T000V13_A595Tpmo_ConsecutivoTrans, T000V13_n595Tpmo_ConsecutivoTrans,
            T000V13_A633Tpmo_Controlado, T000V13_n633Tpmo_Controlado, T000V13_A641Tpmo_VidaUtil, T000V13_n641Tpmo_VidaUtil, T000V13_A679Tpmo_Estado, T000V13_n679Tpmo_Estado, T000V13_A680Tpmo_CuentaResponsabilidad, T000V13_n680Tpmo_CuentaResponsabilidad, T000V13_A705Tpmo_SolicitaRegionDestino, T000V13_n705Tpmo_SolicitaRegionDestino,
            T000V13_A706Tpmo_SolicitaCentroDestino, T000V13_n706Tpmo_SolicitaCentroDestino, T000V13_A716Tpmo_ImprimeOrigen, T000V13_n716Tpmo_ImprimeOrigen, T000V13_A717Tpmo_ImprimeDestino, T000V13_n717Tpmo_ImprimeDestino, T000V13_A718Tmpo_ImprimeResponsable, T000V13_n718Tmpo_ImprimeResponsable, T000V13_A33Tipo_Codigo, T000V13_A39Tpmo_AlmacenOrigenId,
            T000V13_A40Tpmo_AlmacenDestinoId
            }
            , new Object[] {
            T000V14_A253Tipo_Descripcion, T000V14_A480Tipo_Tipo
            }
            , new Object[] {
            T000V15_A312Tpmo_AlmacenOrigenDescrip, T000V15_n312Tpmo_AlmacenOrigenDescrip
            }
            , new Object[] {
            T000V16_A314Tpmo_AlmacenDestinoDescrip, T000V16_n314Tpmo_AlmacenDestinoDescrip
            }
            , new Object[] {
            T000V17_A38Tpmo_Codigo
            }
            , new Object[] {
            T000V18_A38Tpmo_Codigo
            }
            , new Object[] {
            T000V19_A38Tpmo_Codigo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000V23_A253Tipo_Descripcion, T000V23_A480Tipo_Tipo
            }
            , new Object[] {
            T000V24_A312Tpmo_AlmacenOrigenDescrip, T000V24_n312Tpmo_AlmacenOrigenDescrip
            }
            , new Object[] {
            T000V25_A314Tpmo_AlmacenDestinoDescrip, T000V25_n314Tpmo_AlmacenDestinoDescrip
            }
            , new Object[] {
            T000V26_A60Mbod_Id
            }
            , new Object[] {
            T000V27_A46Tran_Id
            }
            , new Object[] {
            T000V28_A38Tpmo_Codigo
            }
            , new Object[] {
            T000V29_A38Tpmo_Codigo, T000V29_A635Orig_Descripcion, T000V29_n635Orig_Descripcion, T000V29_A642Tpmo_SolicitaNumero, T000V29_A643Tpmo_SolicitaFecha, T000V29_A681Tpmo_EstadoOrigen, T000V29_n681Tpmo_EstadoOrigen, T000V29_A41Orig_Identificador
            }
            , new Object[] {
            T000V30_A635Orig_Descripcion, T000V30_n635Orig_Descripcion
            }
            , new Object[] {
            T000V31_A38Tpmo_Codigo, T000V31_A41Orig_Identificador
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000V35_A635Orig_Descripcion, T000V35_n635Orig_Descripcion
            }
            , new Object[] {
            T000V36_A38Tpmo_Codigo, T000V36_A41Orig_Identificador
            }
            , new Object[] {
            T000V37_A38Tpmo_Codigo, T000V37_A820Docu_Descripcion, T000V37_n820Docu_Descripcion, T000V37_A821Docu_Prefijo, T000V37_n821Docu_Prefijo, T000V37_A819Docu_Nro
            }
            , new Object[] {
            T000V38_A820Docu_Descripcion, T000V38_n820Docu_Descripcion, T000V38_A821Docu_Prefijo, T000V38_n821Docu_Prefijo
            }
            , new Object[] {
            T000V39_A38Tpmo_Codigo, T000V39_A819Docu_Nro
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000V42_A820Docu_Descripcion, T000V42_n820Docu_Descripcion, T000V42_A821Docu_Prefijo, T000V42_n821Docu_Prefijo
            }
            , new Object[] {
            T000V43_A38Tpmo_Codigo, T000V43_A819Docu_Nro
            }
         }
      );
      AV18Pgmname = "ALM_TIPO_MOVIMIENTO" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte subGridalm_tipo_movimiento_tipo_movimiento_origen_Backcolorstyle ;
   private byte subGridalm_tipo_movimiento_tipo_movimiento_origen_Allowselection ;
   private byte subGridalm_tipo_movimiento_tipo_movimiento_origen_Allowhovering ;
   private byte subGridalm_tipo_movimiento_tipo_movimiento_origen_Allowcollapsing ;
   private byte subGridalm_tipo_movimiento_tipo_movimiento_origen_Collapsed ;
   private byte subGridalm_tipo_movimiento_documento_Backcolorstyle ;
   private byte subGridalm_tipo_movimiento_documento_Allowselection ;
   private byte subGridalm_tipo_movimiento_documento_Allowhovering ;
   private byte subGridalm_tipo_movimiento_documento_Allowcollapsing ;
   private byte subGridalm_tipo_movimiento_documento_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridalm_tipo_movimiento_tipo_movimiento_origen_Backstyle ;
   private byte subGridalm_tipo_movimiento_documento_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nIsMod_32 ;
   private short nIsMod_60 ;
   private short nRC_GXsfl_113 ;
   private short nGXsfl_113_idx=1 ;
   private short nRC_GXsfl_127 ;
   private short nGXsfl_127_idx=1 ;
   private short nRcdDeleted_32 ;
   private short nRcdExists_32 ;
   private short Z819Docu_Nro ;
   private short nRcdDeleted_60 ;
   private short nRcdExists_60 ;
   private short A819Docu_Nro ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount32 ;
   private short RcdFound32 ;
   private short nBlankRcdUsr32 ;
   private short nBlankRcdCount60 ;
   private short RcdFound60 ;
   private short nBlankRcdUsr60 ;
   private short RcdFound31 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtTpmo_Codigo_Enabled ;
   private int edtTpmo_Descripcion_Enabled ;
   private int edtTipo_Codigo_Enabled ;
   private int imgprompt_33_Visible ;
   private int edtTipo_Descripcion_Enabled ;
   private int edtTpmo_AlmacenOrigenId_Enabled ;
   private int imgprompt_39_Visible ;
   private int edtTpmo_AlmacenOrigenDescrip_Enabled ;
   private int edtTpmo_AlmacenDestinoId_Enabled ;
   private int imgprompt_40_Visible ;
   private int edtTpmo_AlmacenDestinoDescrip_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtOrig_Identificador_Enabled ;
   private int edtOrig_Descripcion_Enabled ;
   private int subGridalm_tipo_movimiento_tipo_movimiento_origen_Selectioncolor ;
   private int subGridalm_tipo_movimiento_tipo_movimiento_origen_Hoveringcolor ;
   private int fRowAdded ;
   private int edtDocu_Nro_Enabled ;
   private int edtDocu_Descripcion_Enabled ;
   private int edtDocu_Prefijo_Enabled ;
   private int subGridalm_tipo_movimiento_documento_Selectioncolor ;
   private int subGridalm_tipo_movimiento_documento_Hoveringcolor ;
   private int AV19GXV1 ;
   private int GX_JID ;
   private int subGridalm_tipo_movimiento_tipo_movimiento_origen_Backcolor ;
   private int subGridalm_tipo_movimiento_tipo_movimiento_origen_Allbackcolor ;
   private int imgprompt_41_Visible ;
   private int subGridalm_tipo_movimiento_documento_Backcolor ;
   private int subGridalm_tipo_movimiento_documento_Allbackcolor ;
   private int imgprompt_819_Visible ;
   private int defedtDocu_Nro_Enabled ;
   private int defedtOrig_Identificador_Enabled ;
   private int idxLst ;
   private long Z595Tpmo_ConsecutivoTrans ;
   private long Z33Tipo_Codigo ;
   private long Z39Tpmo_AlmacenOrigenId ;
   private long Z40Tpmo_AlmacenDestinoId ;
   private long N33Tipo_Codigo ;
   private long N39Tpmo_AlmacenOrigenId ;
   private long N40Tpmo_AlmacenDestinoId ;
   private long Z41Orig_Identificador ;
   private long A33Tipo_Codigo ;
   private long A39Tpmo_AlmacenOrigenId ;
   private long A40Tpmo_AlmacenDestinoId ;
   private long A41Orig_Identificador ;
   private long A595Tpmo_ConsecutivoTrans ;
   private long AV11Insert_Tipo_Codigo ;
   private long AV12Insert_Tpmo_AlmacenOrigenId ;
   private long AV13Insert_Tpmo_AlmacenDestinoId ;
   private long GRIDALM_TIPO_MOVIMIENTO_TIPO_MOVIMIENTO_ORIGEN_nFirstRecordOnPage ;
   private long GRIDALM_TIPO_MOVIMIENTO_DOCUMENTO_nFirstRecordOnPage ;
   private String sPrefix ;
   private String sGXsfl_113_idx="0001" ;
   private String sGXsfl_127_idx="0001" ;
   private String wcpOGx_mode ;
   private String Z679Tpmo_Estado ;
   private String Z681Tpmo_EstadoOrigen ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String A480Tipo_Tipo ;
   private String A679Tpmo_Estado ;
   private String GXCCtl ;
   private String A681Tpmo_EstadoOrigen ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTpmo_Codigo_Internalname ;
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
   private String edtTpmo_Codigo_Jsonclick ;
   private String edtTpmo_Descripcion_Internalname ;
   private String edtTpmo_Descripcion_Jsonclick ;
   private String edtTipo_Codigo_Internalname ;
   private String edtTipo_Codigo_Jsonclick ;
   private String sImgUrl ;
   private String imgprompt_33_Internalname ;
   private String imgprompt_33_Link ;
   private String edtTipo_Descripcion_Internalname ;
   private String edtTipo_Descripcion_Jsonclick ;
   private String edtTpmo_AlmacenOrigenId_Internalname ;
   private String edtTpmo_AlmacenOrigenId_Jsonclick ;
   private String imgprompt_39_Internalname ;
   private String imgprompt_39_Link ;
   private String edtTpmo_AlmacenOrigenDescrip_Internalname ;
   private String edtTpmo_AlmacenOrigenDescrip_Jsonclick ;
   private String edtTpmo_AlmacenDestinoId_Internalname ;
   private String edtTpmo_AlmacenDestinoId_Jsonclick ;
   private String imgprompt_40_Internalname ;
   private String imgprompt_40_Link ;
   private String edtTpmo_AlmacenDestinoDescrip_Internalname ;
   private String edtTpmo_AlmacenDestinoDescrip_Jsonclick ;
   private String divTipo_movimiento_origentable_Internalname ;
   private String lblTitletipo_movimiento_origen_Internalname ;
   private String lblTitletipo_movimiento_origen_Jsonclick ;
   private String divDocumentotable_Internalname ;
   private String lblTitledocumento_Internalname ;
   private String lblTitledocumento_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode32 ;
   private String edtOrig_Identificador_Internalname ;
   private String edtOrig_Descripcion_Internalname ;
   private String sStyleString ;
   private String sMode60 ;
   private String edtDocu_Nro_Internalname ;
   private String edtDocu_Descripcion_Internalname ;
   private String edtDocu_Prefijo_Internalname ;
   private String AV18Pgmname ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode31 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String Z480Tipo_Tipo ;
   private String imgprompt_41_Internalname ;
   private String sGXsfl_113_fel_idx="0001" ;
   private String subGridalm_tipo_movimiento_tipo_movimiento_origen_Class ;
   private String subGridalm_tipo_movimiento_tipo_movimiento_origen_Linesclass ;
   private String imgprompt_41_Link ;
   private String ROClassString ;
   private String edtOrig_Identificador_Jsonclick ;
   private String edtOrig_Descripcion_Jsonclick ;
   private String imgprompt_819_Internalname ;
   private String sGXsfl_127_fel_idx="0001" ;
   private String subGridalm_tipo_movimiento_documento_Class ;
   private String subGridalm_tipo_movimiento_documento_Linesclass ;
   private String imgprompt_819_Link ;
   private String edtDocu_Nro_Jsonclick ;
   private String edtDocu_Descripcion_Jsonclick ;
   private String edtDocu_Prefijo_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridalm_tipo_movimiento_tipo_movimiento_origen_Internalname ;
   private String subGridalm_tipo_movimiento_documento_Internalname ;
   private java.util.Date Z318Tpmo_FechaCrea ;
   private java.util.Date Z320Tpmo_FechaModifica ;
   private java.util.Date A320Tpmo_FechaModifica ;
   private java.util.Date A318Tpmo_FechaCrea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n633Tpmo_Controlado ;
   private boolean n641Tpmo_VidaUtil ;
   private boolean n680Tpmo_CuentaResponsabilidad ;
   private boolean n705Tpmo_SolicitaRegionDestino ;
   private boolean n706Tpmo_SolicitaCentroDestino ;
   private boolean n716Tpmo_ImprimeOrigen ;
   private boolean n717Tpmo_ImprimeDestino ;
   private boolean n718Tmpo_ImprimeResponsable ;
   private boolean n679Tpmo_Estado ;
   private boolean n681Tpmo_EstadoOrigen ;
   private boolean wbErr ;
   private boolean bGXsfl_113_Refreshing=false ;
   private boolean bGXsfl_127_Refreshing=false ;
   private boolean n312Tpmo_AlmacenOrigenDescrip ;
   private boolean n314Tpmo_AlmacenDestinoDescrip ;
   private boolean n319Tpmo_UsuarioModifica ;
   private boolean n320Tpmo_FechaModifica ;
   private boolean n595Tpmo_ConsecutivoTrans ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n635Orig_Descripcion ;
   private boolean n820Docu_Descripcion ;
   private boolean n821Docu_Prefijo ;
   private String wcpOAV15Tpmo_Codigo ;
   private String Z38Tpmo_Codigo ;
   private String Z317Tpmo_UsuarioCrea ;
   private String Z319Tpmo_UsuarioModifica ;
   private String Z313Tpmo_Descripcion ;
   private String Z315Tpmo_TipoE_S ;
   private String Z316Tpmo_Modulo ;
   private String Z440Tpmo_IngresaAredante ;
   private String Z441Tpmo_IngresaCurso ;
   private String Z633Tpmo_Controlado ;
   private String Z641Tpmo_VidaUtil ;
   private String Z680Tpmo_CuentaResponsabilidad ;
   private String Z705Tpmo_SolicitaRegionDestino ;
   private String Z706Tpmo_SolicitaCentroDestino ;
   private String Z716Tpmo_ImprimeOrigen ;
   private String Z717Tpmo_ImprimeDestino ;
   private String Z718Tmpo_ImprimeResponsable ;
   private String Z642Tpmo_SolicitaNumero ;
   private String Z643Tpmo_SolicitaFecha ;
   private String AV15Tpmo_Codigo ;
   private String A315Tpmo_TipoE_S ;
   private String A316Tpmo_Modulo ;
   private String A440Tpmo_IngresaAredante ;
   private String A441Tpmo_IngresaCurso ;
   private String A633Tpmo_Controlado ;
   private String A641Tpmo_VidaUtil ;
   private String A680Tpmo_CuentaResponsabilidad ;
   private String A705Tpmo_SolicitaRegionDestino ;
   private String A706Tpmo_SolicitaCentroDestino ;
   private String A716Tpmo_ImprimeOrigen ;
   private String A717Tpmo_ImprimeDestino ;
   private String A718Tmpo_ImprimeResponsable ;
   private String A642Tpmo_SolicitaNumero ;
   private String A643Tpmo_SolicitaFecha ;
   private String A38Tpmo_Codigo ;
   private String A313Tpmo_Descripcion ;
   private String A253Tipo_Descripcion ;
   private String A312Tpmo_AlmacenOrigenDescrip ;
   private String A314Tpmo_AlmacenDestinoDescrip ;
   private String A635Orig_Descripcion ;
   private String A820Docu_Descripcion ;
   private String A821Docu_Prefijo ;
   private String A319Tpmo_UsuarioModifica ;
   private String A317Tpmo_UsuarioCrea ;
   private String AV16Usuario ;
   private String Z253Tipo_Descripcion ;
   private String Z312Tpmo_AlmacenOrigenDescrip ;
   private String Z314Tpmo_AlmacenDestinoDescrip ;
   private String Z635Orig_Descripcion ;
   private String Z820Docu_Descripcion ;
   private String Z821Docu_Prefijo ;
   private com.genexus.webpanels.GXWebGrid Gridalm_tipo_movimiento_tipo_movimiento_origenContainer ;
   private com.genexus.webpanels.GXWebGrid Gridalm_tipo_movimiento_documentoContainer ;
   private com.genexus.webpanels.GXWebRow Gridalm_tipo_movimiento_tipo_movimiento_origenRow ;
   private com.genexus.webpanels.GXWebRow Gridalm_tipo_movimiento_documentoRow ;
   private com.genexus.webpanels.GXWebColumn Gridalm_tipo_movimiento_tipo_movimiento_origenColumn ;
   private com.genexus.webpanels.GXWebColumn Gridalm_tipo_movimiento_documentoColumn ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbTipo_Tipo ;
   private HTMLChoice cmbTpmo_TipoE_S ;
   private HTMLChoice cmbTpmo_Modulo ;
   private HTMLChoice cmbTpmo_IngresaAredante ;
   private HTMLChoice cmbTpmo_IngresaCurso ;
   private HTMLChoice cmbTpmo_Controlado ;
   private HTMLChoice cmbTpmo_VidaUtil ;
   private HTMLChoice cmbTpmo_CuentaResponsabilidad ;
   private HTMLChoice cmbTpmo_SolicitaRegionDestino ;
   private HTMLChoice cmbTpmo_SolicitaCentroDestino ;
   private HTMLChoice cmbTpmo_ImprimeOrigen ;
   private HTMLChoice cmbTpmo_ImprimeDestino ;
   private HTMLChoice cmbTmpo_ImprimeResponsable ;
   private HTMLChoice cmbTpmo_Estado ;
   private HTMLChoice cmbTpmo_SolicitaNumero ;
   private HTMLChoice cmbTpmo_SolicitaFecha ;
   private HTMLChoice cmbTpmo_EstadoOrigen ;
   private IDataStoreProvider pr_default ;
   private String[] T000V12_A314Tpmo_AlmacenDestinoDescrip ;
   private boolean[] T000V12_n314Tpmo_AlmacenDestinoDescrip ;
   private String[] T000V11_A312Tpmo_AlmacenOrigenDescrip ;
   private boolean[] T000V11_n312Tpmo_AlmacenOrigenDescrip ;
   private String[] T000V10_A253Tipo_Descripcion ;
   private String[] T000V10_A480Tipo_Tipo ;
   private String[] T000V13_A38Tpmo_Codigo ;
   private String[] T000V13_A317Tpmo_UsuarioCrea ;
   private java.util.Date[] T000V13_A318Tpmo_FechaCrea ;
   private String[] T000V13_A319Tpmo_UsuarioModifica ;
   private boolean[] T000V13_n319Tpmo_UsuarioModifica ;
   private java.util.Date[] T000V13_A320Tpmo_FechaModifica ;
   private boolean[] T000V13_n320Tpmo_FechaModifica ;
   private String[] T000V13_A313Tpmo_Descripcion ;
   private String[] T000V13_A253Tipo_Descripcion ;
   private String[] T000V13_A480Tipo_Tipo ;
   private String[] T000V13_A312Tpmo_AlmacenOrigenDescrip ;
   private boolean[] T000V13_n312Tpmo_AlmacenOrigenDescrip ;
   private String[] T000V13_A314Tpmo_AlmacenDestinoDescrip ;
   private boolean[] T000V13_n314Tpmo_AlmacenDestinoDescrip ;
   private String[] T000V13_A315Tpmo_TipoE_S ;
   private String[] T000V13_A316Tpmo_Modulo ;
   private String[] T000V13_A440Tpmo_IngresaAredante ;
   private String[] T000V13_A441Tpmo_IngresaCurso ;
   private long[] T000V13_A595Tpmo_ConsecutivoTrans ;
   private boolean[] T000V13_n595Tpmo_ConsecutivoTrans ;
   private String[] T000V13_A633Tpmo_Controlado ;
   private boolean[] T000V13_n633Tpmo_Controlado ;
   private String[] T000V13_A641Tpmo_VidaUtil ;
   private boolean[] T000V13_n641Tpmo_VidaUtil ;
   private String[] T000V13_A679Tpmo_Estado ;
   private boolean[] T000V13_n679Tpmo_Estado ;
   private String[] T000V13_A680Tpmo_CuentaResponsabilidad ;
   private boolean[] T000V13_n680Tpmo_CuentaResponsabilidad ;
   private String[] T000V13_A705Tpmo_SolicitaRegionDestino ;
   private boolean[] T000V13_n705Tpmo_SolicitaRegionDestino ;
   private String[] T000V13_A706Tpmo_SolicitaCentroDestino ;
   private boolean[] T000V13_n706Tpmo_SolicitaCentroDestino ;
   private String[] T000V13_A716Tpmo_ImprimeOrigen ;
   private boolean[] T000V13_n716Tpmo_ImprimeOrigen ;
   private String[] T000V13_A717Tpmo_ImprimeDestino ;
   private boolean[] T000V13_n717Tpmo_ImprimeDestino ;
   private String[] T000V13_A718Tmpo_ImprimeResponsable ;
   private boolean[] T000V13_n718Tmpo_ImprimeResponsable ;
   private long[] T000V13_A33Tipo_Codigo ;
   private long[] T000V13_A39Tpmo_AlmacenOrigenId ;
   private long[] T000V13_A40Tpmo_AlmacenDestinoId ;
   private String[] T000V14_A253Tipo_Descripcion ;
   private String[] T000V14_A480Tipo_Tipo ;
   private String[] T000V15_A312Tpmo_AlmacenOrigenDescrip ;
   private boolean[] T000V15_n312Tpmo_AlmacenOrigenDescrip ;
   private String[] T000V16_A314Tpmo_AlmacenDestinoDescrip ;
   private boolean[] T000V16_n314Tpmo_AlmacenDestinoDescrip ;
   private String[] T000V17_A38Tpmo_Codigo ;
   private String[] T000V9_A38Tpmo_Codigo ;
   private String[] T000V9_A317Tpmo_UsuarioCrea ;
   private java.util.Date[] T000V9_A318Tpmo_FechaCrea ;
   private String[] T000V9_A319Tpmo_UsuarioModifica ;
   private boolean[] T000V9_n319Tpmo_UsuarioModifica ;
   private java.util.Date[] T000V9_A320Tpmo_FechaModifica ;
   private boolean[] T000V9_n320Tpmo_FechaModifica ;
   private String[] T000V9_A313Tpmo_Descripcion ;
   private String[] T000V9_A315Tpmo_TipoE_S ;
   private String[] T000V9_A316Tpmo_Modulo ;
   private String[] T000V9_A440Tpmo_IngresaAredante ;
   private String[] T000V9_A441Tpmo_IngresaCurso ;
   private long[] T000V9_A595Tpmo_ConsecutivoTrans ;
   private boolean[] T000V9_n595Tpmo_ConsecutivoTrans ;
   private String[] T000V9_A633Tpmo_Controlado ;
   private boolean[] T000V9_n633Tpmo_Controlado ;
   private String[] T000V9_A641Tpmo_VidaUtil ;
   private boolean[] T000V9_n641Tpmo_VidaUtil ;
   private String[] T000V9_A679Tpmo_Estado ;
   private boolean[] T000V9_n679Tpmo_Estado ;
   private String[] T000V9_A680Tpmo_CuentaResponsabilidad ;
   private boolean[] T000V9_n680Tpmo_CuentaResponsabilidad ;
   private String[] T000V9_A705Tpmo_SolicitaRegionDestino ;
   private boolean[] T000V9_n705Tpmo_SolicitaRegionDestino ;
   private String[] T000V9_A706Tpmo_SolicitaCentroDestino ;
   private boolean[] T000V9_n706Tpmo_SolicitaCentroDestino ;
   private String[] T000V9_A716Tpmo_ImprimeOrigen ;
   private boolean[] T000V9_n716Tpmo_ImprimeOrigen ;
   private String[] T000V9_A717Tpmo_ImprimeDestino ;
   private boolean[] T000V9_n717Tpmo_ImprimeDestino ;
   private String[] T000V9_A718Tmpo_ImprimeResponsable ;
   private boolean[] T000V9_n718Tmpo_ImprimeResponsable ;
   private long[] T000V9_A33Tipo_Codigo ;
   private long[] T000V9_A39Tpmo_AlmacenOrigenId ;
   private long[] T000V9_A40Tpmo_AlmacenDestinoId ;
   private String[] T000V18_A38Tpmo_Codigo ;
   private String[] T000V19_A38Tpmo_Codigo ;
   private String[] T000V8_A38Tpmo_Codigo ;
   private String[] T000V8_A317Tpmo_UsuarioCrea ;
   private java.util.Date[] T000V8_A318Tpmo_FechaCrea ;
   private String[] T000V8_A319Tpmo_UsuarioModifica ;
   private boolean[] T000V8_n319Tpmo_UsuarioModifica ;
   private java.util.Date[] T000V8_A320Tpmo_FechaModifica ;
   private boolean[] T000V8_n320Tpmo_FechaModifica ;
   private String[] T000V8_A313Tpmo_Descripcion ;
   private String[] T000V8_A315Tpmo_TipoE_S ;
   private String[] T000V8_A316Tpmo_Modulo ;
   private String[] T000V8_A440Tpmo_IngresaAredante ;
   private String[] T000V8_A441Tpmo_IngresaCurso ;
   private long[] T000V8_A595Tpmo_ConsecutivoTrans ;
   private boolean[] T000V8_n595Tpmo_ConsecutivoTrans ;
   private String[] T000V8_A633Tpmo_Controlado ;
   private boolean[] T000V8_n633Tpmo_Controlado ;
   private String[] T000V8_A641Tpmo_VidaUtil ;
   private boolean[] T000V8_n641Tpmo_VidaUtil ;
   private String[] T000V8_A679Tpmo_Estado ;
   private boolean[] T000V8_n679Tpmo_Estado ;
   private String[] T000V8_A680Tpmo_CuentaResponsabilidad ;
   private boolean[] T000V8_n680Tpmo_CuentaResponsabilidad ;
   private String[] T000V8_A705Tpmo_SolicitaRegionDestino ;
   private boolean[] T000V8_n705Tpmo_SolicitaRegionDestino ;
   private String[] T000V8_A706Tpmo_SolicitaCentroDestino ;
   private boolean[] T000V8_n706Tpmo_SolicitaCentroDestino ;
   private String[] T000V8_A716Tpmo_ImprimeOrigen ;
   private boolean[] T000V8_n716Tpmo_ImprimeOrigen ;
   private String[] T000V8_A717Tpmo_ImprimeDestino ;
   private boolean[] T000V8_n717Tpmo_ImprimeDestino ;
   private String[] T000V8_A718Tmpo_ImprimeResponsable ;
   private boolean[] T000V8_n718Tmpo_ImprimeResponsable ;
   private long[] T000V8_A33Tipo_Codigo ;
   private long[] T000V8_A39Tpmo_AlmacenOrigenId ;
   private long[] T000V8_A40Tpmo_AlmacenDestinoId ;
   private String[] T000V23_A253Tipo_Descripcion ;
   private String[] T000V23_A480Tipo_Tipo ;
   private String[] T000V24_A312Tpmo_AlmacenOrigenDescrip ;
   private boolean[] T000V24_n312Tpmo_AlmacenOrigenDescrip ;
   private String[] T000V25_A314Tpmo_AlmacenDestinoDescrip ;
   private boolean[] T000V25_n314Tpmo_AlmacenDestinoDescrip ;
   private long[] T000V26_A60Mbod_Id ;
   private long[] T000V27_A46Tran_Id ;
   private String[] T000V28_A38Tpmo_Codigo ;
   private String[] T000V29_A38Tpmo_Codigo ;
   private String[] T000V29_A635Orig_Descripcion ;
   private boolean[] T000V29_n635Orig_Descripcion ;
   private String[] T000V29_A642Tpmo_SolicitaNumero ;
   private String[] T000V29_A643Tpmo_SolicitaFecha ;
   private String[] T000V29_A681Tpmo_EstadoOrigen ;
   private boolean[] T000V29_n681Tpmo_EstadoOrigen ;
   private long[] T000V29_A41Orig_Identificador ;
   private String[] T000V7_A635Orig_Descripcion ;
   private boolean[] T000V7_n635Orig_Descripcion ;
   private String[] T000V30_A635Orig_Descripcion ;
   private boolean[] T000V30_n635Orig_Descripcion ;
   private String[] T000V31_A38Tpmo_Codigo ;
   private long[] T000V31_A41Orig_Identificador ;
   private String[] T000V6_A38Tpmo_Codigo ;
   private String[] T000V6_A642Tpmo_SolicitaNumero ;
   private String[] T000V6_A643Tpmo_SolicitaFecha ;
   private String[] T000V6_A681Tpmo_EstadoOrigen ;
   private boolean[] T000V6_n681Tpmo_EstadoOrigen ;
   private long[] T000V6_A41Orig_Identificador ;
   private String[] T000V5_A38Tpmo_Codigo ;
   private String[] T000V5_A642Tpmo_SolicitaNumero ;
   private String[] T000V5_A643Tpmo_SolicitaFecha ;
   private String[] T000V5_A681Tpmo_EstadoOrigen ;
   private boolean[] T000V5_n681Tpmo_EstadoOrigen ;
   private long[] T000V5_A41Orig_Identificador ;
   private String[] T000V35_A635Orig_Descripcion ;
   private boolean[] T000V35_n635Orig_Descripcion ;
   private String[] T000V36_A38Tpmo_Codigo ;
   private long[] T000V36_A41Orig_Identificador ;
   private String[] T000V37_A38Tpmo_Codigo ;
   private String[] T000V37_A820Docu_Descripcion ;
   private boolean[] T000V37_n820Docu_Descripcion ;
   private String[] T000V37_A821Docu_Prefijo ;
   private boolean[] T000V37_n821Docu_Prefijo ;
   private short[] T000V37_A819Docu_Nro ;
   private String[] T000V4_A820Docu_Descripcion ;
   private boolean[] T000V4_n820Docu_Descripcion ;
   private String[] T000V4_A821Docu_Prefijo ;
   private boolean[] T000V4_n821Docu_Prefijo ;
   private String[] T000V38_A820Docu_Descripcion ;
   private boolean[] T000V38_n820Docu_Descripcion ;
   private String[] T000V38_A821Docu_Prefijo ;
   private boolean[] T000V38_n821Docu_Prefijo ;
   private String[] T000V39_A38Tpmo_Codigo ;
   private short[] T000V39_A819Docu_Nro ;
   private String[] T000V3_A38Tpmo_Codigo ;
   private short[] T000V3_A819Docu_Nro ;
   private String[] T000V2_A38Tpmo_Codigo ;
   private short[] T000V2_A819Docu_Nro ;
   private String[] T000V42_A820Docu_Descripcion ;
   private boolean[] T000V42_n820Docu_Descripcion ;
   private String[] T000V42_A821Docu_Prefijo ;
   private boolean[] T000V42_n821Docu_Prefijo ;
   private String[] T000V43_A38Tpmo_Codigo ;
   private short[] T000V43_A819Docu_Nro ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV9TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class alm_tipo_movimiento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000V2", "SELECT Tpmo_Codigo, Docu_Nro FROM ALM_TIPO_MOVIMIENTO_DOCUMENTO WHERE Tpmo_Codigo = ? AND Docu_Nro = ?  FOR UPDATE OF Tpmo_Codigo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V3", "SELECT Tpmo_Codigo, Docu_Nro FROM ALM_TIPO_MOVIMIENTO_DOCUMENTO WHERE Tpmo_Codigo = ? AND Docu_Nro = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V4", "SELECT Docu_Descripcion, Docu_Prefijo FROM ALM_DOCUMENTOS WHERE Docu_Nro = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V5", "SELECT Tpmo_Codigo, Tpmo_SolicitaNumero, Tpmo_SolicitaFecha, Tpmo_EstadoOrigen, Orig_Identificador FROM ALM_TIPO_MOVIMIENTO_ORIGEN WHERE Tpmo_Codigo = ? AND Orig_Identificador = ?  FOR UPDATE OF Tpmo_SolicitaNumero, Tpmo_SolicitaFecha, Tpmo_EstadoOrigen NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V6", "SELECT Tpmo_Codigo, Tpmo_SolicitaNumero, Tpmo_SolicitaFecha, Tpmo_EstadoOrigen, Orig_Identificador FROM ALM_TIPO_MOVIMIENTO_ORIGEN WHERE Tpmo_Codigo = ? AND Orig_Identificador = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V7", "SELECT Orig_Descripcion FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V8", "SELECT Tpmo_Codigo, Tpmo_UsuarioCrea, Tpmo_FechaCrea, Tpmo_UsuarioModifica, Tpmo_FechaModifica, Tpmo_Descripcion, Tpmo_TipoE_S, Tpmo_Modulo, Tpmo_IngresaAredante, Tpmo_IngresaCurso, Tpmo_ConsecutivoTrans, Tpmo_Controlado, Tpmo_VidaUtil, Tpmo_Estado, Tpmo_CuentaResponsabilidad, Tpmo_SolicitaRegionDestino, Tpmo_SolicitaCentroDestino, Tpmo_ImprimeOrigen, Tpmo_ImprimeDestino, Tmpo_ImprimeResponsable, Tipo_Codigo, Tpmo_AlmacenOrigenId, Tpmo_AlmacenDestinoId FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ?  FOR UPDATE OF Tpmo_UsuarioCrea, Tpmo_FechaCrea, Tpmo_UsuarioModifica, Tpmo_FechaModifica, Tpmo_Descripcion, Tpmo_TipoE_S, Tpmo_Modulo, Tpmo_IngresaAredante, Tpmo_IngresaCurso, Tpmo_ConsecutivoTrans, Tpmo_Controlado, Tpmo_VidaUtil, Tpmo_Estado, Tpmo_CuentaResponsabilidad, Tpmo_SolicitaRegionDestino, Tpmo_SolicitaCentroDestino, Tpmo_ImprimeOrigen, Tpmo_ImprimeDestino, Tmpo_ImprimeResponsable, Tipo_Codigo, Tpmo_AlmacenOrigenId, Tpmo_AlmacenDestinoId NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V9", "SELECT Tpmo_Codigo, Tpmo_UsuarioCrea, Tpmo_FechaCrea, Tpmo_UsuarioModifica, Tpmo_FechaModifica, Tpmo_Descripcion, Tpmo_TipoE_S, Tpmo_Modulo, Tpmo_IngresaAredante, Tpmo_IngresaCurso, Tpmo_ConsecutivoTrans, Tpmo_Controlado, Tpmo_VidaUtil, Tpmo_Estado, Tpmo_CuentaResponsabilidad, Tpmo_SolicitaRegionDestino, Tpmo_SolicitaCentroDestino, Tpmo_ImprimeOrigen, Tpmo_ImprimeDestino, Tmpo_ImprimeResponsable, Tipo_Codigo, Tpmo_AlmacenOrigenId, Tpmo_AlmacenDestinoId FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V10", "SELECT Tipo_Descripcion, Tipo_Tipo FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V11", "SELECT Tpal_Descripcion AS Tpmo_AlmacenOrigenDescrip FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V12", "SELECT Tpal_Descripcion AS Tpmo_AlmacenDestinoDescrip FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V13", "SELECT /*+ FIRST_ROWS(100) */ TM1.Tpmo_Codigo, TM1.Tpmo_UsuarioCrea, TM1.Tpmo_FechaCrea, TM1.Tpmo_UsuarioModifica, TM1.Tpmo_FechaModifica, TM1.Tpmo_Descripcion, T2.Tipo_Descripcion, T2.Tipo_Tipo, T3.Tpal_Descripcion AS Tpmo_AlmacenOrigenDescrip, T4.Tpal_Descripcion AS Tpmo_AlmacenDestinoDescrip, TM1.Tpmo_TipoE_S, TM1.Tpmo_Modulo, TM1.Tpmo_IngresaAredante, TM1.Tpmo_IngresaCurso, TM1.Tpmo_ConsecutivoTrans, TM1.Tpmo_Controlado, TM1.Tpmo_VidaUtil, TM1.Tpmo_Estado, TM1.Tpmo_CuentaResponsabilidad, TM1.Tpmo_SolicitaRegionDestino, TM1.Tpmo_SolicitaCentroDestino, TM1.Tpmo_ImprimeOrigen, TM1.Tpmo_ImprimeDestino, TM1.Tmpo_ImprimeResponsable, TM1.Tipo_Codigo, TM1.Tpmo_AlmacenOrigenId AS Tpmo_AlmacenOrigenId, TM1.Tpmo_AlmacenDestinoId AS Tpmo_AlmacenDestinoId FROM (((ALM_TIPO_MOVIMIENTO TM1 INNER JOIN ALM_TIPO_ELEMENTO T2 ON T2.Tipo_Codigo = TM1.Tipo_Codigo) INNER JOIN ALM_TIPO_ALMACEN T3 ON T3.Tpal_Id = TM1.Tpmo_AlmacenOrigenId) INNER JOIN ALM_TIPO_ALMACEN T4 ON T4.Tpal_Id = TM1.Tpmo_AlmacenDestinoId) WHERE TM1.Tpmo_Codigo = ? ORDER BY TM1.Tpmo_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000V14", "SELECT Tipo_Descripcion, Tipo_Tipo FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V15", "SELECT Tpal_Descripcion AS Tpmo_AlmacenOrigenDescrip FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V16", "SELECT Tpal_Descripcion AS Tpmo_AlmacenDestinoDescrip FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V17", "SELECT /*+ FIRST_ROWS(1) */ Tpmo_Codigo FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Tpmo_Codigo FROM ALM_TIPO_MOVIMIENTO WHERE ( Tpmo_Codigo > ?) ORDER BY Tpmo_Codigo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000V19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Tpmo_Codigo FROM ALM_TIPO_MOVIMIENTO WHERE ( Tpmo_Codigo < ?) ORDER BY Tpmo_Codigo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000V20", "INSERT INTO ALM_TIPO_MOVIMIENTO(Tpmo_Codigo, Tpmo_UsuarioCrea, Tpmo_FechaCrea, Tpmo_UsuarioModifica, Tpmo_FechaModifica, Tpmo_Descripcion, Tpmo_TipoE_S, Tpmo_Modulo, Tpmo_IngresaAredante, Tpmo_IngresaCurso, Tpmo_ConsecutivoTrans, Tpmo_Controlado, Tpmo_VidaUtil, Tpmo_Estado, Tpmo_CuentaResponsabilidad, Tpmo_SolicitaRegionDestino, Tpmo_SolicitaCentroDestino, Tpmo_ImprimeOrigen, Tpmo_ImprimeDestino, Tmpo_ImprimeResponsable, Tipo_Codigo, Tpmo_AlmacenOrigenId, Tpmo_AlmacenDestinoId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_TIPO_MOVIMIENTO")
         ,new UpdateCursor("T000V21", "UPDATE ALM_TIPO_MOVIMIENTO SET Tpmo_UsuarioCrea=?, Tpmo_FechaCrea=?, Tpmo_UsuarioModifica=?, Tpmo_FechaModifica=?, Tpmo_Descripcion=?, Tpmo_TipoE_S=?, Tpmo_Modulo=?, Tpmo_IngresaAredante=?, Tpmo_IngresaCurso=?, Tpmo_ConsecutivoTrans=?, Tpmo_Controlado=?, Tpmo_VidaUtil=?, Tpmo_Estado=?, Tpmo_CuentaResponsabilidad=?, Tpmo_SolicitaRegionDestino=?, Tpmo_SolicitaCentroDestino=?, Tpmo_ImprimeOrigen=?, Tpmo_ImprimeDestino=?, Tmpo_ImprimeResponsable=?, Tipo_Codigo=?, Tpmo_AlmacenOrigenId=?, Tpmo_AlmacenDestinoId=?  WHERE Tpmo_Codigo = ?", GX_NOMASK, "ALM_TIPO_MOVIMIENTO")
         ,new UpdateCursor("T000V22", "DELETE FROM ALM_TIPO_MOVIMIENTO  WHERE Tpmo_Codigo = ?", GX_NOMASK, "ALM_TIPO_MOVIMIENTO")
         ,new ForEachCursor("T000V23", "SELECT Tipo_Descripcion, Tipo_Tipo FROM ALM_TIPO_ELEMENTO WHERE Tipo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V24", "SELECT Tpal_Descripcion AS Tpmo_AlmacenOrigenDescrip FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V25", "SELECT Tpal_Descripcion AS Tpmo_AlmacenDestinoDescrip FROM ALM_TIPO_ALMACEN WHERE Tpal_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V26", "SELECT * FROM (SELECT Mbod_Id FROM ALM_RESTRICCIONES WHERE Mbod_TipoMovCodigo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000V27", "SELECT * FROM (SELECT Tran_Id FROM ALM_TRANSACCION WHERE Tran_CodigoMovimiento = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000V28", "SELECT /*+ FIRST_ROWS(100) */ Tpmo_Codigo FROM ALM_TIPO_MOVIMIENTO ORDER BY Tpmo_Codigo ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000V29", "SELECT T1.Tpmo_Codigo, T2.Orig_Descripcion, T1.Tpmo_SolicitaNumero, T1.Tpmo_SolicitaFecha, T1.Tpmo_EstadoOrigen, T1.Orig_Identificador FROM (ALM_TIPO_MOVIMIENTO_ORIGEN T1 INNER JOIN ALM_ORIGEN_BIENES T2 ON T2.Orig_Identificador = T1.Orig_Identificador) WHERE T1.Tpmo_Codigo = ? and T1.Orig_Identificador = ? ORDER BY T1.Tpmo_Codigo, T1.Orig_Identificador ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000V30", "SELECT Orig_Descripcion FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V31", "SELECT Tpmo_Codigo, Orig_Identificador FROM ALM_TIPO_MOVIMIENTO_ORIGEN WHERE Tpmo_Codigo = ? AND Orig_Identificador = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000V32", "INSERT INTO ALM_TIPO_MOVIMIENTO_ORIGEN(Tpmo_Codigo, Tpmo_SolicitaNumero, Tpmo_SolicitaFecha, Tpmo_EstadoOrigen, Orig_Identificador) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "ALM_TIPO_MOVIMIENTO_ORIGEN")
         ,new UpdateCursor("T000V33", "UPDATE ALM_TIPO_MOVIMIENTO_ORIGEN SET Tpmo_SolicitaNumero=?, Tpmo_SolicitaFecha=?, Tpmo_EstadoOrigen=?  WHERE Tpmo_Codigo = ? AND Orig_Identificador = ?", GX_NOMASK, "ALM_TIPO_MOVIMIENTO_ORIGEN")
         ,new UpdateCursor("T000V34", "DELETE FROM ALM_TIPO_MOVIMIENTO_ORIGEN  WHERE Tpmo_Codigo = ? AND Orig_Identificador = ?", GX_NOMASK, "ALM_TIPO_MOVIMIENTO_ORIGEN")
         ,new ForEachCursor("T000V35", "SELECT Orig_Descripcion FROM ALM_ORIGEN_BIENES WHERE Orig_Identificador = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V36", "SELECT Tpmo_Codigo, Orig_Identificador FROM ALM_TIPO_MOVIMIENTO_ORIGEN WHERE Tpmo_Codigo = ? ORDER BY Tpmo_Codigo, Orig_Identificador ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000V37", "SELECT T1.Tpmo_Codigo, T2.Docu_Descripcion, T2.Docu_Prefijo, T1.Docu_Nro FROM (ALM_TIPO_MOVIMIENTO_DOCUMENTO T1 INNER JOIN ALM_DOCUMENTOS T2 ON T2.Docu_Nro = T1.Docu_Nro) WHERE T1.Tpmo_Codigo = ? and T1.Docu_Nro = ? ORDER BY T1.Tpmo_Codigo, T1.Docu_Nro ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000V38", "SELECT Docu_Descripcion, Docu_Prefijo FROM ALM_DOCUMENTOS WHERE Docu_Nro = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V39", "SELECT Tpmo_Codigo, Docu_Nro FROM ALM_TIPO_MOVIMIENTO_DOCUMENTO WHERE Tpmo_Codigo = ? AND Docu_Nro = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000V40", "INSERT INTO ALM_TIPO_MOVIMIENTO_DOCUMENTO(Tpmo_Codigo, Docu_Nro) VALUES(?, ?)", GX_NOMASK, "ALM_TIPO_MOVIMIENTO_DOCUMENTO")
         ,new UpdateCursor("T000V41", "DELETE FROM ALM_TIPO_MOVIMIENTO_DOCUMENTO  WHERE Tpmo_Codigo = ? AND Docu_Nro = ?", GX_NOMASK, "ALM_TIPO_MOVIMIENTO_DOCUMENTO")
         ,new ForEachCursor("T000V42", "SELECT Docu_Descripcion, Docu_Prefijo FROM ALM_DOCUMENTOS WHERE Docu_Nro = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000V43", "SELECT Tpmo_Codigo, Docu_Nro FROM ALM_TIPO_MOVIMIENTO_DOCUMENTO WHERE Tpmo_Codigo = ? ORDER BY Tpmo_Codigo, Docu_Nro ",true, GX_NOMASK, false, this,11,0,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((long[]) buf[12])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 1) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((long[]) buf[32])[0] = rslt.getLong(21) ;
               ((long[]) buf[33])[0] = rslt.getLong(22) ;
               ((long[]) buf[34])[0] = rslt.getLong(23) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((long[]) buf[12])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 1) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((long[]) buf[32])[0] = rslt.getLong(21) ;
               ((long[]) buf[33])[0] = rslt.getLong(22) ;
               ((long[]) buf[34])[0] = rslt.getLong(23) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[9])[0] = rslt.getString(8, 1) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((long[]) buf[18])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(18, 1) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((long[]) buf[38])[0] = rslt.getLong(25) ;
               ((long[]) buf[39])[0] = rslt.getLong(26) ;
               ((long[]) buf[40])[0] = rslt.getLong(27) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 25 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(6) ;
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 8 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 12 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 30, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[6], false);
               }
               stmt.setVarchar(6, (String)parms[7], 100, false);
               stmt.setVarchar(7, (String)parms[8], 1, false);
               stmt.setVarchar(8, (String)parms[9], 8, false);
               stmt.setVarchar(9, (String)parms[10], 2, false);
               stmt.setVarchar(10, (String)parms[11], 2, false);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(11, ((Number) parms[13]).longValue(), 0);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[31], 2);
               }
               stmt.setBigDecimal(21, ((Number) parms[32]).longValue(), 0);
               stmt.setLong(22, ((Number) parms[33]).longValue());
               stmt.setLong(23, ((Number) parms[34]).longValue());
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 30, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[5], false);
               }
               stmt.setVarchar(5, (String)parms[6], 100, false);
               stmt.setVarchar(6, (String)parms[7], 1, false);
               stmt.setVarchar(7, (String)parms[8], 8, false);
               stmt.setVarchar(8, (String)parms[9], 2, false);
               stmt.setVarchar(9, (String)parms[10], 2, false);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(10, ((Number) parms[12]).longValue(), 0);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[30], 2);
               }
               stmt.setBigDecimal(20, ((Number) parms[31]).longValue(), 0);
               stmt.setLong(21, ((Number) parms[32]).longValue());
               stmt.setLong(22, ((Number) parms[33]).longValue());
               stmt.setVarchar(23, (String)parms[34], 3, false);
               return;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 21 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 22 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 23 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 28 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 29 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 1);
               }
               stmt.setLong(5, ((Number) parms[5]).longValue());
               return;
            case 31 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 1);
               }
               stmt.setVarchar(4, (String)parms[4], 3, false);
               stmt.setLong(5, ((Number) parms[5]).longValue());
               return;
            case 32 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 33 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 34 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
            case 35 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 36 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 37 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 38 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 39 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 40 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 41 :
               stmt.setVarchar(1, (String)parms[0], 3, false);
               return;
      }
   }

}

