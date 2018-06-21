/*
               File: alm_novedad_impl
        Description: Novedad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:15:14.90
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

public final  class alm_novedad_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action16") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         A785Nove_CentroId = GXutil.lval( httpContext.GetNextPar( )) ;
         n785Nove_CentroId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
         A790Nove_ModuloOrigen = httpContext.GetNextPar( ) ;
         n790Nove_ModuloOrigen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
         A791Nove_AlmaOrigen = httpContext.GetNextPar( ) ;
         n791Nove_AlmaOrigen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A791Nove_AlmaOrigen", A791Nove_AlmaOrigen);
         A792Nove_BodeOrigen = httpContext.GetNextPar( ) ;
         n792Nove_BodeOrigen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A792Nove_BodeOrigen", A792Nove_BodeOrigen);
         AV15Alma_OrigenDescrip = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Alma_OrigenDescrip", AV15Alma_OrigenDescrip);
         AV17Bode_OrigenDescrip = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Bode_OrigenDescrip", AV17Bode_OrigenDescrip);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_16_0C56( Gx_mode, A785Nove_CentroId, A790Nove_ModuloOrigen, A791Nove_AlmaOrigen, A792Nove_BodeOrigen, AV15Alma_OrigenDescrip, AV17Bode_OrigenDescrip) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action17") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         A785Nove_CentroId = GXutil.lval( httpContext.GetNextPar( )) ;
         n785Nove_CentroId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
         A796Nove_ModuloDestino = httpContext.GetNextPar( ) ;
         n796Nove_ModuloDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
         A797Nove_AlmaDestino = httpContext.GetNextPar( ) ;
         n797Nove_AlmaDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A797Nove_AlmaDestino", A797Nove_AlmaDestino);
         A798Nove_BodeDestino = httpContext.GetNextPar( ) ;
         n798Nove_BodeDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A798Nove_BodeDestino", A798Nove_BodeDestino);
         AV16Alma_DestiDescrip = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Alma_DestiDescrip", AV16Alma_DestiDescrip);
         AV18Bode_DestiDescrip = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Bode_DestiDescrip", AV18Bode_DestiDescrip);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_17_0C56( Gx_mode, A785Nove_CentroId, A796Nove_ModuloDestino, A797Nove_AlmaDestino, A798Nove_BodeDestino, AV16Alma_DestiDescrip, AV18Bode_DestiDescrip) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action20") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         A106Nove_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
         A774TNov_Nombre_Campo = httpContext.GetNextPar( ) ;
         n774TNov_Nombre_Campo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
         A811Nove_ValorAntiguo = httpContext.GetNextPar( ) ;
         n811Nove_ValorAntiguo = false ;
         A812Nove_ValorNuevo = httpContext.GetNextPar( ) ;
         n812Nove_ValorNuevo = false ;
         AV19Nove_ValorAntiguo = httpContext.GetNextPar( ) ;
         AV20Nove_ValorNuevo = httpContext.GetNextPar( ) ;
         A770TNov_Tipo = httpContext.GetNextPar( ) ;
         n770TNov_Tipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A770TNov_Tipo", A770TNov_Tipo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_20_0C57( Gx_mode, A106Nove_Identificador, A774TNov_Nombre_Campo, A811Nove_ValorAntiguo, A812Nove_ValorNuevo, AV19Nove_ValorAntiguo, AV20Nove_ValorNuevo, A770TNov_Tipo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A104TNov_Codigo = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         n104TNov_Codigo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A104TNov_Codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A107Nove_TransId = GXutil.lval( httpContext.GetNextPar( )) ;
         n107Nove_TransId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A107Nove_TransId", GXutil.ltrim( GXutil.str( A107Nove_TransId, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A107Nove_TransId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A785Nove_CentroId = GXutil.lval( httpContext.GetNextPar( )) ;
         n785Nove_CentroId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A785Nove_CentroId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A782Nove_RegionId = GXutil.lval( httpContext.GetNextPar( )) ;
         n782Nove_RegionId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A782Nove_RegionId", GXutil.ltrim( GXutil.str( A782Nove_RegionId, 11, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A782Nove_RegionId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
      {
         A788Nove_CodigoMovimiento = httpContext.GetNextPar( ) ;
         n788Nove_CodigoMovimiento = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A788Nove_CodigoMovimiento", A788Nove_CodigoMovimiento);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_26( A788Nove_CodigoMovimiento) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A793Nove_CuentadanteIdOrigen = GXutil.lval( httpContext.GetNextPar( )) ;
         n793Nove_CuentadanteIdOrigen = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A793Nove_CuentadanteIdOrigen", GXutil.ltrim( GXutil.str( A793Nove_CuentadanteIdOrigen, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A793Nove_CuentadanteIdOrigen) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A799Nove_CuentadanteIdDestino = GXutil.lval( httpContext.GetNextPar( )) ;
         n799Nove_CuentadanteIdDestino = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A799Nove_CuentadanteIdDestino", GXutil.ltrim( GXutil.str( A799Nove_CuentadanteIdDestino, 18, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A799Nove_CuentadanteIdDestino) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridalm_novedad_detalle") == 0 )
      {
         nRC_GXsfl_134 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_134_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_134_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridalm_novedad_detalle_newrow( ) ;
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
            AV7Nove_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Nove_Identificador", GXutil.ltrim( GXutil.str( AV7Nove_Identificador, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vNOVE_IDENTIFICADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Nove_Identificador), "ZZZZZZZZZZ9")));
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
      cmbNove_Masivo.setName( "NOVE_MASIVO" );
      cmbNove_Masivo.setWebtags( "" );
      cmbNove_Masivo.addItem("", "", (short)(0));
      cmbNove_Masivo.addItem("SI", "SI", (short)(0));
      cmbNove_Masivo.addItem("NO", "NO", (short)(0));
      if ( cmbNove_Masivo.getItemCount() > 0 )
      {
         A803Nove_Masivo = cmbNove_Masivo.getValidValue(A803Nove_Masivo) ;
         n803Nove_Masivo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A803Nove_Masivo", A803Nove_Masivo);
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
         Form.getMeta().addItem("description", "Novedad", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtNove_FechaRegistro_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public alm_novedad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public alm_novedad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( alm_novedad_impl.class ));
   }

   public alm_novedad_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbNove_Masivo = new HTMLChoice();
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
      if ( cmbNove_Masivo.getItemCount() > 0 )
      {
         A803Nove_Masivo = cmbNove_Masivo.getValidValue(A803Nove_Masivo) ;
         n803Nove_Masivo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A803Nove_Masivo", A803Nove_Masivo);
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Novedad", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "BtnPrevious" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "BtnNext" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "BtnLast" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "BtnSelect" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Seleccionar", bttBtn_select_Jsonclick, 5, "Seleccionar", "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 FormCellAdvanced", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_Identificador_Internalname, "Número ", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_Identificador_Internalname, GXutil.ltrim( localUtil.ntoc( A106Nove_Identificador, (byte)(11), (byte)(0), ",", "")), ((edtNove_Identificador_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A106Nove_Identificador), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A106Nove_Identificador), "ZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_Identificador_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_Identificador_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Identificador", "right", false, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_FechaRegistro_Internalname, "Fecha", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtNove_FechaRegistro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_FechaRegistro_Internalname, localUtil.ttoc( A780Nove_FechaRegistro, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A780Nove_FechaRegistro, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_FechaRegistro_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_FechaRegistro_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtNove_FechaRegistro_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtNove_FechaRegistro_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALM_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtTNov_Descripcion_Internalname, "Tipo de Novedad", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtTNov_Descripcion_Internalname, A769TNov_Descripcion, "", "", (short)(0), 1, edtTNov_Descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTabletransaccion_Internalname, divTabletransaccion_Visible, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_TranCC_Internalname, "Transacción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_TranCC_Internalname, GXutil.ltrim( localUtil.ntoc( A814Nove_TranCC, (byte)(18), (byte)(0), ",", "")), ((edtNove_TranCC_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A814Nove_TranCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A814Nove_TranCC), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_TranCC_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_TranCC_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_RegionCodigo_Internalname, "Región", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_RegionCodigo_Internalname, GXutil.ltrim( localUtil.ntoc( A783Nove_RegionCodigo, (byte)(4), (byte)(0), ",", "")), ((edtNove_RegionCodigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A783Nove_RegionCodigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A783Nove_RegionCodigo), "ZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_RegionCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_RegionCodigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_RegionDescripcion_Internalname, A784Nove_RegionDescripcion, GXutil.rtrim( localUtil.format( A784Nove_RegionDescripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_RegionDescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_RegionDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CentroCodigo_Internalname, "Centro de Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CentroCodigo_Internalname, A786Nove_CentroCodigo, GXutil.rtrim( localUtil.format( A786Nove_CentroCodigo, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CentroCodigo_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_CentroCodigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CentroDescripcion_Internalname, A787Nove_CentroDescripcion, GXutil.rtrim( localUtil.format( A787Nove_CentroDescripcion, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CentroDescripcion_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_CentroDescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CodigoMovimiento_Internalname, "Movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CodigoMovimiento_Internalname, A788Nove_CodigoMovimiento, GXutil.rtrim( localUtil.format( A788Nove_CodigoMovimiento, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CodigoMovimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_CodigoMovimiento_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_MovimientoDescrip_Internalname, A789Nove_MovimientoDescrip, GXutil.rtrim( localUtil.format( A789Nove_MovimientoDescrip, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_MovimientoDescrip_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_MovimientoDescrip_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "Datos Orígen", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_ModuloOrigen_Internalname, "Módulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_ModuloOrigen_Internalname, A790Nove_ModuloOrigen, GXutil.rtrim( localUtil.format( A790Nove_ModuloOrigen, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_ModuloOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_ModuloOrigen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Modulo", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlma_origendescrip_Internalname, "Almacén", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlma_origendescrip_Internalname, AV15Alma_OrigenDescrip, GXutil.rtrim( localUtil.format( AV15Alma_OrigenDescrip, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlma_origendescrip_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAlma_origendescrip_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavBode_origendescrip_Internalname, "Bodega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavBode_origendescrip_Internalname, AV17Bode_OrigenDescrip, GXutil.rtrim( localUtil.format( AV17Bode_OrigenDescrip, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBode_origendescrip_Jsonclick, 0, "Attribute", "", "", "", 1, edtavBode_origendescrip_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CuentadanteCedOrigen_Internalname, "Cuentadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CuentadanteCedOrigen_Internalname, GXutil.ltrim( localUtil.ntoc( A794Nove_CuentadanteCedOrigen, (byte)(18), (byte)(0), ",", "")), ((edtNove_CuentadanteCedOrigen_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A794Nove_CuentadanteCedOrigen), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A794Nove_CuentadanteCedOrigen), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CuentadanteCedOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_CuentadanteCedOrigen_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CuentadanteNomOrigen_Internalname, A795Nove_CuentadanteNomOrigen, GXutil.rtrim( localUtil.format( A795Nove_CuentadanteNomOrigen, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CuentadanteNomOrigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_CuentadanteNomOrigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "Datos Destino", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_ModuloDestino_Internalname, "Módulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_ModuloDestino_Internalname, A796Nove_ModuloDestino, GXutil.rtrim( localUtil.format( A796Nove_ModuloDestino, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_ModuloDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_ModuloDestino_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Modulo", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlma_destidescrip_Internalname, "Almacén", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlma_destidescrip_Internalname, AV16Alma_DestiDescrip, GXutil.rtrim( localUtil.format( AV16Alma_DestiDescrip, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlma_destidescrip_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAlma_destidescrip_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavBode_destidescrip_Internalname, "Bodega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavBode_destidescrip_Internalname, AV18Bode_DestiDescrip, GXutil.rtrim( localUtil.format( AV18Bode_DestiDescrip, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBode_destidescrip_Jsonclick, 0, "Attribute", "", "", "", 1, edtavBode_destidescrip_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_CuentadanteCedDestino_Internalname, "Cuentadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CuentadanteCedDestino_Internalname, GXutil.ltrim( localUtil.ntoc( A800Nove_CuentadanteCedDestino, (byte)(18), (byte)(0), ",", "")), ((edtNove_CuentadanteCedDestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A800Nove_CuentadanteCedDestino), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A800Nove_CuentadanteCedDestino), "ZZZZZZZZZZZZZZZZZ9")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CuentadanteCedDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_CuentadanteCedDestino_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtNove_CuentadanteNomDestino_Internalname, A801Nove_CuentadanteNomDestino, GXutil.rtrim( localUtil.format( A801Nove_CuentadanteNomDestino, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtNove_CuentadanteNomDestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtNove_CuentadanteNomDestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_RespuestaProc_Internalname, "Respuesta Procedimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtNove_RespuestaProc_Internalname, A815Nove_RespuestaProc, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", (short)(0), 1, edtNove_RespuestaProc_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 FormCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbNove_Masivo.getInternalname(), "Masivo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbNove_Masivo, cmbNove_Masivo.getInternalname(), GXutil.rtrim( A803Nove_Masivo), 1, cmbNove_Masivo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbNove_Masivo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"", "", true, "HLP_ALM_NOVEDAD.htm");
         cmbNove_Masivo.setValue( GXutil.rtrim( A803Nove_Masivo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNove_Masivo.getInternalname(), "Values", cmbNove_Masivo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_Observaciones_Internalname, "Observaciones", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtNove_Observaciones_Internalname, A802Nove_Observaciones, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", (short)(0), 1, edtNove_Observaciones_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALM_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtNove_Soporte_Internalname, "Soporte", "col-sm-3 AttributeLabel", 1, true);
         ClassString = "Attribute" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         edtNove_Soporte_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "Filetype", edtNove_Soporte_Filetype, true);
         if ( ! (GXutil.strcmp("", A804Nove_Soporte)==0) )
         {
            gxblobfileaux.setSource( A804Nove_Soporte );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtNove_Soporte_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtNove_Soporte_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               A804Nove_Soporte = gxblobfileaux.getAbsoluteName() ;
               n804Nove_Soporte = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A804Nove_Soporte", A804Nove_Soporte);
               httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), true);
               edtNove_Soporte_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "Filetype", edtNove_Soporte_Filetype, true);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), true);
         }
         com.orions2.GxWebStd.gx_blob_field( httpContext, edtNove_Soporte_Internalname, GXutil.rtrim( A804Nove_Soporte), httpContext.getResourceRelative(A804Nove_Soporte), ((GXutil.strcmp("", edtNove_Soporte_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtNove_Soporte_Filetype)==0) ? A804Nove_Soporte : edtNove_Soporte_Filetype)) : edtNove_Soporte_Contenttype), false, "", edtNove_Soporte_Parameters, 0, edtNove_Soporte_Enabled, 1, "", "", 0, -1, 250, "px", 60, "px", 0, 0, 0, edtNove_Soporte_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", ""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", "", "", "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divDetalletable_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitledetalle_Internalname, "DETALLE", "", "", lblTitledetalle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         gxdraw_gridalm_novedad_detalle( ) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALM_NOVEDAD.htm");
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

   public void gxdraw_gridalm_novedad_detalle( )
   {
      /*  Grid Control  */
      Gridalm_novedad_detalleContainer.AddObjectProperty("GridName", "Gridalm_novedad_detalle");
      Gridalm_novedad_detalleContainer.AddObjectProperty("Class", "WorkWith");
      Gridalm_novedad_detalleContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridalm_novedad_detalle_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddObjectProperty("CmpContext", "");
      Gridalm_novedad_detalleContainer.AddObjectProperty("InMasterPage", "false");
      Gridalm_novedad_detalleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_novedad_detalleColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A108Nove_Linea, (byte)(8), (byte)(0), ".", "")));
      Gridalm_novedad_detalleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_Linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddColumnProperties(Gridalm_novedad_detalleColumn);
      Gridalm_novedad_detalleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_novedad_detalleColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A806Nove_LineaTrn, (byte)(18), (byte)(0), ".", "")));
      Gridalm_novedad_detalleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_LineaTrn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddColumnProperties(Gridalm_novedad_detalleColumn);
      Gridalm_novedad_detalleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_novedad_detalleColumn.AddObjectProperty("Value", A807Nove_Consecutivo);
      Gridalm_novedad_detalleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_Consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNove_Consecutivo_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddColumnProperties(Gridalm_novedad_detalleColumn);
      Gridalm_novedad_detalleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_novedad_detalleColumn.AddObjectProperty("Value", A810Nove_Placa);
      Gridalm_novedad_detalleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_Placa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNove_Placa_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddColumnProperties(Gridalm_novedad_detalleColumn);
      Gridalm_novedad_detalleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_novedad_detalleColumn.AddObjectProperty("Value", A811Nove_ValorAntiguo);
      Gridalm_novedad_detalleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_ValorAntiguo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNove_ValorAntiguo_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddColumnProperties(Gridalm_novedad_detalleColumn);
      Gridalm_novedad_detalleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_novedad_detalleColumn.AddObjectProperty("Value", AV19Nove_ValorAntiguo);
      Gridalm_novedad_detalleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNove_valorantiguo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNove_valorantiguo_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddColumnProperties(Gridalm_novedad_detalleColumn);
      Gridalm_novedad_detalleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_novedad_detalleColumn.AddObjectProperty("Value", A812Nove_ValorNuevo);
      Gridalm_novedad_detalleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_ValorNuevo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtNove_ValorNuevo_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddColumnProperties(Gridalm_novedad_detalleColumn);
      Gridalm_novedad_detalleColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridalm_novedad_detalleColumn.AddObjectProperty("Value", AV20Nove_ValorNuevo);
      Gridalm_novedad_detalleColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNove_valornuevo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNove_valornuevo_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddColumnProperties(Gridalm_novedad_detalleColumn);
      Gridalm_novedad_detalleContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridalm_novedad_detalle_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridalm_novedad_detalle_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridalm_novedad_detalle_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridalm_novedad_detalle_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridalm_novedad_detalle_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridalm_novedad_detalleContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridalm_novedad_detalle_Collapsed, (byte)(1), (byte)(0), ".", "")));
      nGXsfl_134_idx = (short)(0) ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount57 = (short)(5) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            /* Display confirmed (stored) records */
            nRcdExists_57 = (short)(1) ;
            scanStart0C57( ) ;
            while ( RcdFound57 != 0 )
            {
               init_level_properties57( ) ;
               getByPrimaryKey0C57( ) ;
               addRow0C57( ) ;
               scanNext0C57( ) ;
            }
            scanEnd0C57( ) ;
            nBlankRcdCount57 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0C57( ) ;
         standaloneModal0C57( ) ;
         sMode57 = Gx_mode ;
         while ( nGXsfl_134_idx < nRC_GXsfl_134 )
         {
            bGXsfl_134_Refreshing = true ;
            readRow0C57( ) ;
            edtNove_Linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_LINEA_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Linea_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
            edtNove_LineaTrn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_LINEATRN_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_LineaTrn_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_LineaTrn_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
            edtNove_Consecutivo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_CONSECUTIVO_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Consecutivo_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
            edtNove_Consecutivo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_CONSECUTIVO_"+sGXsfl_134_idx+"Visible"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_Consecutivo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_Consecutivo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
            edtNove_Placa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_PLACA_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_Placa_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Placa_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
            edtNove_Placa_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_PLACA_"+sGXsfl_134_idx+"Visible"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_Placa_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_Placa_Visible, 5, 0)), !bGXsfl_134_Refreshing);
            edtNove_ValorAntiguo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorAntiguo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_ValorAntiguo_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
            edtNove_ValorAntiguo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Visible"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorAntiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_ValorAntiguo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
            edtavNove_valorantiguo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavNove_valorantiguo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_valorantiguo_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
            edtavNove_valorantiguo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vNOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Visible"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavNove_valorantiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_valorantiguo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
            edtNove_ValorNuevo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_VALORNUEVO_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorNuevo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_ValorNuevo_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
            edtNove_ValorNuevo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_VALORNUEVO_"+sGXsfl_134_idx+"Visible"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorNuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_ValorNuevo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
            edtavNove_valornuevo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNOVE_VALORNUEVO_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavNove_valornuevo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_valornuevo_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
            edtavNove_valornuevo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vNOVE_VALORNUEVO_"+sGXsfl_134_idx+"Visible"), ",", ".")) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavNove_valornuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_valornuevo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
            if ( ( nRcdExists_57 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               standaloneModal0C57( ) ;
            }
            sendRow0C57( ) ;
            bGXsfl_134_Refreshing = false ;
         }
         Gx_mode = sMode57 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount57 = (short)(5) ;
         nRcdExists_57 = (short)(1) ;
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            scanStart0C57( ) ;
            while ( RcdFound57 != 0 )
            {
               sGXsfl_134_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_134_idx+1, 4, 0)), (short)(4), "0") ;
               subsflControlProps_13457( ) ;
               init_level_properties57( ) ;
               standaloneNotModal0C57( ) ;
               getByPrimaryKey0C57( ) ;
               standaloneModal0C57( ) ;
               addRow0C57( ) ;
               scanNext0C57( ) ;
            }
            scanEnd0C57( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ( GXutil.strcmp(Gx_mode, "DSP") != 0 ) && ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) )
      {
         sMode57 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         sGXsfl_134_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_134_idx+1, 4, 0)), (short)(4), "0") ;
         subsflControlProps_13457( ) ;
         initAll0C57( ) ;
         init_level_properties57( ) ;
         standaloneNotModal0C57( ) ;
         standaloneModal0C57( ) ;
         nRcdExists_57 = (short)(0) ;
         nIsMod_57 = (short)(0) ;
         nRcdDeleted_57 = (short)(0) ;
         nBlankRcdCount57 = (short)(nBlankRcdUsr57+nBlankRcdCount57) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount57 > 0 )
         {
            addRow0C57( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtNove_Consecutivo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount57 = (short)(nBlankRcdCount57-1) ;
         }
         Gx_mode = sMode57 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridalm_novedad_detalleContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridalm_novedad_detalle", Gridalm_novedad_detalleContainer);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_novedad_detalleContainerData", Gridalm_novedad_detalleContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "Gridalm_novedad_detalleContainerData"+"V", Gridalm_novedad_detalleContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridalm_novedad_detalleContainerData"+"V"+"\" value='"+Gridalm_novedad_detalleContainer.GridValuesHidden()+"'/>") ;
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
      e110C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A106Nove_Identificador = localUtil.ctol( httpContext.cgiGet( edtNove_Identificador_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
            if ( localUtil.vcdtime( httpContext.cgiGet( edtNove_FechaRegistro_Internalname), (byte)(3), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "NOVE_FECHAREGISTRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNove_FechaRegistro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A780Nove_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
               n780Nove_FechaRegistro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A780Nove_FechaRegistro", localUtil.ttoc( A780Nove_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
            }
            else
            {
               A780Nove_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtNove_FechaRegistro_Internalname)) ;
               n780Nove_FechaRegistro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A780Nove_FechaRegistro", localUtil.ttoc( A780Nove_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
            }
            n780Nove_FechaRegistro = (GXutil.dateCompare(GXutil.nullDate(), A780Nove_FechaRegistro) ? true : false) ;
            A769TNov_Descripcion = httpContext.cgiGet( edtTNov_Descripcion_Internalname) ;
            n769TNov_Descripcion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A769TNov_Descripcion", A769TNov_Descripcion);
            A814Nove_TranCC = localUtil.ctol( httpContext.cgiGet( edtNove_TranCC_Internalname), ",", ".") ;
            n814Nove_TranCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A814Nove_TranCC", GXutil.ltrim( GXutil.str( A814Nove_TranCC, 18, 0)));
            A783Nove_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtNove_RegionCodigo_Internalname), ",", ".")) ;
            n783Nove_RegionCodigo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A783Nove_RegionCodigo", GXutil.ltrim( GXutil.str( A783Nove_RegionCodigo, 4, 0)));
            A784Nove_RegionDescripcion = httpContext.cgiGet( edtNove_RegionDescripcion_Internalname) ;
            n784Nove_RegionDescripcion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A784Nove_RegionDescripcion", A784Nove_RegionDescripcion);
            A786Nove_CentroCodigo = httpContext.cgiGet( edtNove_CentroCodigo_Internalname) ;
            n786Nove_CentroCodigo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A786Nove_CentroCodigo", A786Nove_CentroCodigo);
            A787Nove_CentroDescripcion = httpContext.cgiGet( edtNove_CentroDescripcion_Internalname) ;
            n787Nove_CentroDescripcion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A787Nove_CentroDescripcion", A787Nove_CentroDescripcion);
            A788Nove_CodigoMovimiento = httpContext.cgiGet( edtNove_CodigoMovimiento_Internalname) ;
            n788Nove_CodigoMovimiento = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A788Nove_CodigoMovimiento", A788Nove_CodigoMovimiento);
            A789Nove_MovimientoDescrip = httpContext.cgiGet( edtNove_MovimientoDescrip_Internalname) ;
            n789Nove_MovimientoDescrip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A789Nove_MovimientoDescrip", A789Nove_MovimientoDescrip);
            A790Nove_ModuloOrigen = httpContext.cgiGet( edtNove_ModuloOrigen_Internalname) ;
            n790Nove_ModuloOrigen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
            AV15Alma_OrigenDescrip = httpContext.cgiGet( edtavAlma_origendescrip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Alma_OrigenDescrip", AV15Alma_OrigenDescrip);
            AV17Bode_OrigenDescrip = httpContext.cgiGet( edtavBode_origendescrip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Bode_OrigenDescrip", AV17Bode_OrigenDescrip);
            A794Nove_CuentadanteCedOrigen = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteCedOrigen_Internalname), ",", ".") ;
            n794Nove_CuentadanteCedOrigen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A794Nove_CuentadanteCedOrigen", GXutil.ltrim( GXutil.str( A794Nove_CuentadanteCedOrigen, 18, 0)));
            A795Nove_CuentadanteNomOrigen = GXutil.upper( httpContext.cgiGet( edtNove_CuentadanteNomOrigen_Internalname)) ;
            n795Nove_CuentadanteNomOrigen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A795Nove_CuentadanteNomOrigen", A795Nove_CuentadanteNomOrigen);
            A796Nove_ModuloDestino = httpContext.cgiGet( edtNove_ModuloDestino_Internalname) ;
            n796Nove_ModuloDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
            AV16Alma_DestiDescrip = httpContext.cgiGet( edtavAlma_destidescrip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Alma_DestiDescrip", AV16Alma_DestiDescrip);
            AV18Bode_DestiDescrip = httpContext.cgiGet( edtavBode_destidescrip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Bode_DestiDescrip", AV18Bode_DestiDescrip);
            A800Nove_CuentadanteCedDestino = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteCedDestino_Internalname), ",", ".") ;
            n800Nove_CuentadanteCedDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A800Nove_CuentadanteCedDestino", GXutil.ltrim( GXutil.str( A800Nove_CuentadanteCedDestino, 18, 0)));
            A801Nove_CuentadanteNomDestino = GXutil.upper( httpContext.cgiGet( edtNove_CuentadanteNomDestino_Internalname)) ;
            n801Nove_CuentadanteNomDestino = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A801Nove_CuentadanteNomDestino", A801Nove_CuentadanteNomDestino);
            A815Nove_RespuestaProc = httpContext.cgiGet( edtNove_RespuestaProc_Internalname) ;
            n815Nove_RespuestaProc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A815Nove_RespuestaProc", A815Nove_RespuestaProc);
            n815Nove_RespuestaProc = ((GXutil.strcmp("", A815Nove_RespuestaProc)==0) ? true : false) ;
            cmbNove_Masivo.setName( cmbNove_Masivo.getInternalname() );
            cmbNove_Masivo.setValue( httpContext.cgiGet( cmbNove_Masivo.getInternalname()) );
            A803Nove_Masivo = httpContext.cgiGet( cmbNove_Masivo.getInternalname()) ;
            n803Nove_Masivo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A803Nove_Masivo", A803Nove_Masivo);
            n803Nove_Masivo = ((GXutil.strcmp("", A803Nove_Masivo)==0) ? true : false) ;
            A802Nove_Observaciones = httpContext.cgiGet( edtNove_Observaciones_Internalname) ;
            n802Nove_Observaciones = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A802Nove_Observaciones", A802Nove_Observaciones);
            n802Nove_Observaciones = ((GXutil.strcmp("", A802Nove_Observaciones)==0) ? true : false) ;
            A804Nove_Soporte = httpContext.cgiGet( edtNove_Soporte_Internalname) ;
            n804Nove_Soporte = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A804Nove_Soporte", A804Nove_Soporte);
            n804Nove_Soporte = ((GXutil.strcmp("", A804Nove_Soporte)==0) ? true : false) ;
            /* Read saved values. */
            Z106Nove_Identificador = localUtil.ctol( httpContext.cgiGet( "Z106Nove_Identificador"), ",", ".") ;
            Z780Nove_FechaRegistro = localUtil.ctot( httpContext.cgiGet( "Z780Nove_FechaRegistro"), 0) ;
            n780Nove_FechaRegistro = (GXutil.dateCompare(GXutil.nullDate(), A780Nove_FechaRegistro) ? true : false) ;
            Z781Nove_UsuarioRegistro = localUtil.ctol( httpContext.cgiGet( "Z781Nove_UsuarioRegistro"), ",", ".") ;
            n781Nove_UsuarioRegistro = ((0==A781Nove_UsuarioRegistro) ? true : false) ;
            Z803Nove_Masivo = httpContext.cgiGet( "Z803Nove_Masivo") ;
            n803Nove_Masivo = ((GXutil.strcmp("", A803Nove_Masivo)==0) ? true : false) ;
            Z805Nove_RutaSoporte = httpContext.cgiGet( "Z805Nove_RutaSoporte") ;
            n805Nove_RutaSoporte = ((GXutil.strcmp("", A805Nove_RutaSoporte)==0) ? true : false) ;
            Z765Nove_Estado = httpContext.cgiGet( "Z765Nove_Estado") ;
            n765Nove_Estado = ((GXutil.strcmp("", A765Nove_Estado)==0) ? true : false) ;
            Z815Nove_RespuestaProc = httpContext.cgiGet( "Z815Nove_RespuestaProc") ;
            n815Nove_RespuestaProc = ((GXutil.strcmp("", A815Nove_RespuestaProc)==0) ? true : false) ;
            Z104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( "Z104TNov_Codigo"), ",", ".")) ;
            n104TNov_Codigo = ((0==A104TNov_Codigo) ? true : false) ;
            Z107Nove_TransId = localUtil.ctol( httpContext.cgiGet( "Z107Nove_TransId"), ",", ".") ;
            n107Nove_TransId = ((0==A107Nove_TransId) ? true : false) ;
            A781Nove_UsuarioRegistro = localUtil.ctol( httpContext.cgiGet( "Z781Nove_UsuarioRegistro"), ",", ".") ;
            n781Nove_UsuarioRegistro = false ;
            n781Nove_UsuarioRegistro = ((0==A781Nove_UsuarioRegistro) ? true : false) ;
            A805Nove_RutaSoporte = httpContext.cgiGet( "Z805Nove_RutaSoporte") ;
            n805Nove_RutaSoporte = false ;
            n805Nove_RutaSoporte = ((GXutil.strcmp("", A805Nove_RutaSoporte)==0) ? true : false) ;
            A765Nove_Estado = httpContext.cgiGet( "Z765Nove_Estado") ;
            n765Nove_Estado = false ;
            n765Nove_Estado = ((GXutil.strcmp("", A765Nove_Estado)==0) ? true : false) ;
            A104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( "Z104TNov_Codigo"), ",", ".")) ;
            n104TNov_Codigo = false ;
            n104TNov_Codigo = ((0==A104TNov_Codigo) ? true : false) ;
            A107Nove_TransId = localUtil.ctol( httpContext.cgiGet( "Z107Nove_TransId"), ",", ".") ;
            n107Nove_TransId = false ;
            n107Nove_TransId = ((0==A107Nove_TransId) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_134 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_134"), ",", ".")) ;
            N107Nove_TransId = localUtil.ctol( httpContext.cgiGet( "N107Nove_TransId"), ",", ".") ;
            n107Nove_TransId = ((0==A107Nove_TransId) ? true : false) ;
            N104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( "N104TNov_Codigo"), ",", ".")) ;
            n104TNov_Codigo = ((0==A104TNov_Codigo) ? true : false) ;
            AV7Nove_Identificador = localUtil.ctol( httpContext.cgiGet( "vNOVE_IDENTIFICADOR"), ",", ".") ;
            AV12Insert_Nove_TransId = localUtil.ctol( httpContext.cgiGet( "vINSERT_NOVE_TRANSID"), ",", ".") ;
            A107Nove_TransId = localUtil.ctol( httpContext.cgiGet( "NOVE_TRANSID"), ",", ".") ;
            n107Nove_TransId = ((0==A107Nove_TransId) ? true : false) ;
            AV13Insert_TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TNOV_CODIGO"), ",", ".")) ;
            A104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( "TNOV_CODIGO"), ",", ".")) ;
            n104TNov_Codigo = ((0==A104TNov_Codigo) ? true : false) ;
            A770TNov_Tipo = httpContext.cgiGet( "TNOV_TIPO") ;
            A774TNov_Nombre_Campo = httpContext.cgiGet( "TNOV_NOMBRE_CAMPO") ;
            A785Nove_CentroId = localUtil.ctol( httpContext.cgiGet( "NOVE_CENTROID"), ",", ".") ;
            A791Nove_AlmaOrigen = httpContext.cgiGet( "NOVE_ALMAORIGEN") ;
            A792Nove_BodeOrigen = httpContext.cgiGet( "NOVE_BODEORIGEN") ;
            A797Nove_AlmaDestino = httpContext.cgiGet( "NOVE_ALMADESTINO") ;
            A798Nove_BodeDestino = httpContext.cgiGet( "NOVE_BODEDESTINO") ;
            A781Nove_UsuarioRegistro = localUtil.ctol( httpContext.cgiGet( "NOVE_USUARIOREGISTRO"), ",", ".") ;
            n781Nove_UsuarioRegistro = ((0==A781Nove_UsuarioRegistro) ? true : false) ;
            A805Nove_RutaSoporte = httpContext.cgiGet( "NOVE_RUTASOPORTE") ;
            n805Nove_RutaSoporte = ((GXutil.strcmp("", A805Nove_RutaSoporte)==0) ? true : false) ;
            A765Nove_Estado = httpContext.cgiGet( "NOVE_ESTADO") ;
            n765Nove_Estado = ((GXutil.strcmp("", A765Nove_Estado)==0) ? true : false) ;
            A772TNov_Procedimiento = httpContext.cgiGet( "TNOV_PROCEDIMIENTO") ;
            n772TNov_Procedimiento = false ;
            A782Nove_RegionId = localUtil.ctol( httpContext.cgiGet( "NOVE_REGIONID"), ",", ".") ;
            A793Nove_CuentadanteIdOrigen = localUtil.ctol( httpContext.cgiGet( "NOVE_CUENTADANTEIDORIGEN"), ",", ".") ;
            A799Nove_CuentadanteIdDestino = localUtil.ctol( httpContext.cgiGet( "NOVE_CUENTADANTEIDDESTINO"), ",", ".") ;
            AV21Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            edtNove_Soporte_Filename = httpContext.cgiGet( "NOVE_SOPORTE_Filename") ;
            edtNove_Soporte_Filetype = httpContext.cgiGet( "NOVE_SOPORTE_Filetype") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            if ( ! (GXutil.strcmp("", A804Nove_Soporte)==0) )
            {
               edtNove_Soporte_Filename = httpContext.cgiGetFileName( edtNove_Soporte_Internalname) ;
               edtNove_Soporte_Filetype = httpContext.cgiGetFileType( edtNove_Soporte_Internalname) ;
            }
            if ( (GXutil.strcmp("", A804Nove_Soporte)==0) )
            {
               GXCCtlgxBlob = "NOVE_SOPORTE" + "_gxBlob" ;
               A804Nove_Soporte = httpContext.cgiGet( GXCCtlgxBlob) ;
               n804Nove_Soporte = false ;
               n804Nove_Soporte = ((GXutil.strcmp("", A804Nove_Soporte)==0) ? true : false) ;
            }
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "ALM_NOVEDAD" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
            forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9") ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A805Nove_RutaSoporte, "")) ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A765Nove_Estado, "")) ;
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A106Nove_Identificador != Z106Nove_Identificador ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
            {
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               GXutil.writeLog("alm_novedad:[SecurityCheckFailed]"+forbiddenHiddens);
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
               A106Nove_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
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
                  sMode56 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  Gx_mode = sMode56 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               }
               standaloneModal( ) ;
               if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound56 == 1 )
                  {
                     if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
                     {
                        /* Confirm record */
                        confirm_0C0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "NOVE_IDENTIFICADOR");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtNove_Identificador_Internalname ;
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
                        e110C2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120C2 ();
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
         e120C2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0C56( ) ;
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
         disableAttributes0C56( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_origendescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_origendescrip_Enabled, 5, 0)), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBode_origendescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBode_origendescrip_Enabled, 5, 0)), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_destidescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_destidescrip_Enabled, 5, 0)), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBode_destidescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBode_destidescrip_Enabled, 5, 0)), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_valorantiguo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_valorantiguo_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_valornuevo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_valornuevo_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
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

   public void confirm_0C0( )
   {
      beforeValidate0C56( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0C56( ) ;
         }
         else
         {
            checkExtendedTable0C56( ) ;
            closeExtendedTableCursors0C56( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode56 = Gx_mode ;
         confirm_0C57( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode56 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
         }
         /* Restore parent mode. */
         Gx_mode = sMode56 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
   }

   public void confirm_0C57( )
   {
      nGXsfl_134_idx = (short)(0) ;
      while ( nGXsfl_134_idx < nRC_GXsfl_134 )
      {
         readRow0C57( ) ;
         if ( ( nRcdExists_57 != 0 ) || ( nIsMod_57 != 0 ) )
         {
            getKey0C57( ) ;
            if ( ( nRcdExists_57 == 0 ) && ( nRcdDeleted_57 == 0 ) )
            {
               if ( RcdFound57 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                  beforeValidate0C57( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0C57( ) ;
                     closeExtendedTableCursors0C57( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound57 != 0 )
               {
                  if ( nRcdDeleted_57 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     getByPrimaryKey0C57( ) ;
                     load0C57( ) ;
                     beforeValidate0C57( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0C57( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_57 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        beforeValidate0C57( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0C57( ) ;
                           closeExtendedTableCursors0C57( ) ;
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
                  if ( nRcdDeleted_57 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtNove_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A108Nove_Linea, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtNove_LineaTrn_Internalname, GXutil.ltrim( localUtil.ntoc( A806Nove_LineaTrn, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtNove_Consecutivo_Internalname, A807Nove_Consecutivo) ;
         httpContext.changePostValue( edtNove_Placa_Internalname, A810Nove_Placa) ;
         httpContext.changePostValue( edtNove_ValorAntiguo_Internalname, A811Nove_ValorAntiguo) ;
         httpContext.changePostValue( edtavNove_valorantiguo_Internalname, AV19Nove_ValorAntiguo) ;
         httpContext.changePostValue( edtNove_ValorNuevo_Internalname, A812Nove_ValorNuevo) ;
         httpContext.changePostValue( edtavNove_valornuevo_Internalname, AV20Nove_ValorNuevo) ;
         httpContext.changePostValue( "ZT_"+"Z108Nove_Linea_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z108Nove_Linea, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z806Nove_LineaTrn_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z806Nove_LineaTrn, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z807Nove_Consecutivo_"+sGXsfl_134_idx, Z807Nove_Consecutivo) ;
         httpContext.changePostValue( "ZT_"+"Z810Nove_Placa_"+sGXsfl_134_idx, Z810Nove_Placa) ;
         httpContext.changePostValue( "ZT_"+"Z811Nove_ValorAntiguo_"+sGXsfl_134_idx, Z811Nove_ValorAntiguo) ;
         httpContext.changePostValue( "ZT_"+"Z812Nove_ValorNuevo_"+sGXsfl_134_idx, Z812Nove_ValorNuevo) ;
         httpContext.changePostValue( "nRcdDeleted_57_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_57, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_57_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_57, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_57_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_57, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_57 != 0 )
         {
            httpContext.changePostValue( "NOVE_LINEA_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_Linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_LINEATRN_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_LineaTrn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_CONSECUTIVO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_Consecutivo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_CONSECUTIVO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtNove_Consecutivo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_PLACA_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_Placa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_PLACA_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtNove_Placa_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_ValorAntiguo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtNove_ValorAntiguo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vNOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavNove_valorantiguo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vNOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavNove_valorantiguo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_VALORNUEVO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_ValorNuevo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_VALORNUEVO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtNove_ValorNuevo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vNOVE_VALORNUEVO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavNove_valornuevo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vNOVE_VALORNUEVO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavNove_valornuevo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0C0( )
   {
   }

   public void e110C2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV21Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV21Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      AV12Insert_Nove_TransId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_Nove_TransId", GXutil.ltrim( GXutil.str( AV12Insert_Nove_TransId, 11, 0)));
      AV13Insert_TNov_Codigo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_TNov_Codigo", GXutil.ltrim( GXutil.str( AV13Insert_TNov_Codigo, 6, 0)));
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtTransactionContext_Transactionname(), AV21Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV22GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22GXV1", GXutil.ltrim( GXutil.str( AV22GXV1, 8, 0)));
         while ( AV22GXV1 <= AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (com.orions2.SdtTransactionContext_Attribute)((com.orions2.SdtTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtTransactionContext_Attributes().elementAt(-1+AV22GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "Nove_TransId") == 0 )
            {
               AV12Insert_Nove_TransId = GXutil.lval( AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_Nove_TransId", GXutil.ltrim( GXutil.str( AV12Insert_Nove_TransId, 11, 0)));
            }
            else if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributename(), "TNov_Codigo") == 0 )
            {
               AV13Insert_TNov_Codigo = (int)(GXutil.lval( AV14TrnContextAtt.getgxTv_SdtTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_TNov_Codigo", GXutil.ltrim( GXutil.str( AV13Insert_TNov_Codigo, 6, 0)));
            }
            AV22GXV1 = (int)(AV22GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22GXV1", GXutil.ltrim( GXutil.str( AV22GXV1, 8, 0)));
         }
      }
      /* Execute user subroutine: 'BODEGAS' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e120C2( )
   {
      /* After Trn Routine */
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("com.orions2.wwalm_novedad") );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'BODEGAS' Routine */
   }

   public void zm0C56( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z780Nove_FechaRegistro = T000C5_A780Nove_FechaRegistro[0] ;
            Z781Nove_UsuarioRegistro = T000C5_A781Nove_UsuarioRegistro[0] ;
            Z803Nove_Masivo = T000C5_A803Nove_Masivo[0] ;
            Z805Nove_RutaSoporte = T000C5_A805Nove_RutaSoporte[0] ;
            Z765Nove_Estado = T000C5_A765Nove_Estado[0] ;
            Z815Nove_RespuestaProc = T000C5_A815Nove_RespuestaProc[0] ;
            Z104TNov_Codigo = T000C5_A104TNov_Codigo[0] ;
            Z107Nove_TransId = T000C5_A107Nove_TransId[0] ;
         }
         else
         {
            Z780Nove_FechaRegistro = A780Nove_FechaRegistro ;
            Z781Nove_UsuarioRegistro = A781Nove_UsuarioRegistro ;
            Z803Nove_Masivo = A803Nove_Masivo ;
            Z805Nove_RutaSoporte = A805Nove_RutaSoporte ;
            Z765Nove_Estado = A765Nove_Estado ;
            Z815Nove_RespuestaProc = A815Nove_RespuestaProc ;
            Z104TNov_Codigo = A104TNov_Codigo ;
            Z107Nove_TransId = A107Nove_TransId ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z106Nove_Identificador = A106Nove_Identificador ;
         Z780Nove_FechaRegistro = A780Nove_FechaRegistro ;
         Z781Nove_UsuarioRegistro = A781Nove_UsuarioRegistro ;
         Z802Nove_Observaciones = A802Nove_Observaciones ;
         Z803Nove_Masivo = A803Nove_Masivo ;
         Z804Nove_Soporte = A804Nove_Soporte ;
         Z805Nove_RutaSoporte = A805Nove_RutaSoporte ;
         Z765Nove_Estado = A765Nove_Estado ;
         Z815Nove_RespuestaProc = A815Nove_RespuestaProc ;
         Z104TNov_Codigo = A104TNov_Codigo ;
         Z107Nove_TransId = A107Nove_TransId ;
         Z769TNov_Descripcion = A769TNov_Descripcion ;
         Z770TNov_Tipo = A770TNov_Tipo ;
         Z772TNov_Procedimiento = A772TNov_Procedimiento ;
         Z774TNov_Nombre_Campo = A774TNov_Nombre_Campo ;
         Z814Nove_TranCC = A814Nove_TranCC ;
         Z790Nove_ModuloOrigen = A790Nove_ModuloOrigen ;
         Z791Nove_AlmaOrigen = A791Nove_AlmaOrigen ;
         Z792Nove_BodeOrigen = A792Nove_BodeOrigen ;
         Z796Nove_ModuloDestino = A796Nove_ModuloDestino ;
         Z797Nove_AlmaDestino = A797Nove_AlmaDestino ;
         Z798Nove_BodeDestino = A798Nove_BodeDestino ;
         Z785Nove_CentroId = A785Nove_CentroId ;
         Z782Nove_RegionId = A782Nove_RegionId ;
         Z788Nove_CodigoMovimiento = A788Nove_CodigoMovimiento ;
         Z793Nove_CuentadanteIdOrigen = A793Nove_CuentadanteIdOrigen ;
         Z799Nove_CuentadanteIdDestino = A799Nove_CuentadanteIdDestino ;
         Z786Nove_CentroCodigo = A786Nove_CentroCodigo ;
         Z787Nove_CentroDescripcion = A787Nove_CentroDescripcion ;
         Z783Nove_RegionCodigo = A783Nove_RegionCodigo ;
         Z784Nove_RegionDescripcion = A784Nove_RegionDescripcion ;
         Z789Nove_MovimientoDescrip = A789Nove_MovimientoDescrip ;
         Z794Nove_CuentadanteCedOrigen = A794Nove_CuentadanteCedOrigen ;
         Z795Nove_CuentadanteNomOrigen = A795Nove_CuentadanteNomOrigen ;
         Z800Nove_CuentadanteCedDestino = A800Nove_CuentadanteCedDestino ;
         Z801Nove_CuentadanteNomDestino = A801Nove_CuentadanteNomDestino ;
      }
   }

   public void standaloneNotModal( )
   {
      edtNove_Identificador_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_Identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Identificador_Enabled, 5, 0)), true);
      edtNove_Identificador_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_Identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Identificador_Enabled, 5, 0)), true);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrim( GXutil.str( bttBtn_delete_Enabled, 5, 0)), true);
      if ( ! (0==AV7Nove_Identificador) )
      {
         A106Nove_Identificador = AV7Nove_Identificador ;
         httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV13Insert_TNov_Codigo) )
      {
         A104TNov_Codigo = AV13Insert_TNov_Codigo ;
         n104TNov_Codigo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_Nove_TransId) )
      {
         A107Nove_TransId = AV12Insert_Nove_TransId ;
         n107Nove_TransId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A107Nove_TransId", GXutil.ltrim( GXutil.str( A107Nove_TransId, 11, 0)));
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
         AV21Pgmname = "ALM_NOVEDAD" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
         /* Using cursor T000C6 */
         pr_default.execute(4, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
         A769TNov_Descripcion = T000C6_A769TNov_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769TNov_Descripcion", A769TNov_Descripcion);
         n769TNov_Descripcion = T000C6_n769TNov_Descripcion[0] ;
         A770TNov_Tipo = T000C6_A770TNov_Tipo[0] ;
         n770TNov_Tipo = T000C6_n770TNov_Tipo[0] ;
         A772TNov_Procedimiento = T000C6_A772TNov_Procedimiento[0] ;
         n772TNov_Procedimiento = T000C6_n772TNov_Procedimiento[0] ;
         A774TNov_Nombre_Campo = T000C6_A774TNov_Nombre_Campo[0] ;
         n774TNov_Nombre_Campo = T000C6_n774TNov_Nombre_Campo[0] ;
         pr_default.close(4);
         if ( GXutil.strcmp(A770TNov_Tipo, "P") == 0 )
         {
            divTabletransaccion_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, divTabletransaccion_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTabletransaccion_Visible, 5, 0)), true);
         }
         else
         {
            if ( GXutil.strcmp(A770TNov_Tipo, "P") != 0 )
            {
               divTabletransaccion_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, divTabletransaccion_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTabletransaccion_Visible, 5, 0)), true);
            }
         }
         if ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 )
         {
            edtNove_Consecutivo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_Consecutivo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_Consecutivo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
         }
         if ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 )
         {
            edtNove_Placa_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_Placa_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_Placa_Visible, 5, 0)), !bGXsfl_134_Refreshing);
         }
         if ( ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") != 0 ) )
         {
            edtNove_ValorAntiguo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorAntiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_ValorAntiguo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
         }
         if ( ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") != 0 ) )
         {
            edtNove_ValorNuevo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorNuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_ValorNuevo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
         }
         if ( ( GXutil.strcmp(A770TNov_Tipo, "T") != 0 ) || ( ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") == 0 ) ) )
         {
            edtavNove_valorantiguo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavNove_valorantiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_valorantiguo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
         }
         if ( ( GXutil.strcmp(A770TNov_Tipo, "T") != 0 ) || ( ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") == 0 ) ) )
         {
            edtavNove_valornuevo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavNove_valornuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_valornuevo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
         }
         /* Using cursor T000C7 */
         pr_default.execute(5, new Object[] {new Boolean(n107Nove_TransId), new Long(A107Nove_TransId)});
         A814Nove_TranCC = T000C7_A814Nove_TranCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A814Nove_TranCC", GXutil.ltrim( GXutil.str( A814Nove_TranCC, 18, 0)));
         n814Nove_TranCC = T000C7_n814Nove_TranCC[0] ;
         A790Nove_ModuloOrigen = T000C7_A790Nove_ModuloOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
         n790Nove_ModuloOrigen = T000C7_n790Nove_ModuloOrigen[0] ;
         A791Nove_AlmaOrigen = T000C7_A791Nove_AlmaOrigen[0] ;
         n791Nove_AlmaOrigen = T000C7_n791Nove_AlmaOrigen[0] ;
         A792Nove_BodeOrigen = T000C7_A792Nove_BodeOrigen[0] ;
         n792Nove_BodeOrigen = T000C7_n792Nove_BodeOrigen[0] ;
         A796Nove_ModuloDestino = T000C7_A796Nove_ModuloDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
         n796Nove_ModuloDestino = T000C7_n796Nove_ModuloDestino[0] ;
         A797Nove_AlmaDestino = T000C7_A797Nove_AlmaDestino[0] ;
         n797Nove_AlmaDestino = T000C7_n797Nove_AlmaDestino[0] ;
         A798Nove_BodeDestino = T000C7_A798Nove_BodeDestino[0] ;
         n798Nove_BodeDestino = T000C7_n798Nove_BodeDestino[0] ;
         A785Nove_CentroId = T000C7_A785Nove_CentroId[0] ;
         n785Nove_CentroId = T000C7_n785Nove_CentroId[0] ;
         A782Nove_RegionId = T000C7_A782Nove_RegionId[0] ;
         n782Nove_RegionId = T000C7_n782Nove_RegionId[0] ;
         A788Nove_CodigoMovimiento = T000C7_A788Nove_CodigoMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A788Nove_CodigoMovimiento", A788Nove_CodigoMovimiento);
         n788Nove_CodigoMovimiento = T000C7_n788Nove_CodigoMovimiento[0] ;
         A793Nove_CuentadanteIdOrigen = T000C7_A793Nove_CuentadanteIdOrigen[0] ;
         n793Nove_CuentadanteIdOrigen = T000C7_n793Nove_CuentadanteIdOrigen[0] ;
         A799Nove_CuentadanteIdDestino = T000C7_A799Nove_CuentadanteIdDestino[0] ;
         n799Nove_CuentadanteIdDestino = T000C7_n799Nove_CuentadanteIdDestino[0] ;
         pr_default.close(5);
         /* Using cursor T000C8 */
         pr_default.execute(6, new Object[] {new Boolean(n785Nove_CentroId), new Long(A785Nove_CentroId)});
         A786Nove_CentroCodigo = T000C8_A786Nove_CentroCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A786Nove_CentroCodigo", A786Nove_CentroCodigo);
         n786Nove_CentroCodigo = T000C8_n786Nove_CentroCodigo[0] ;
         A787Nove_CentroDescripcion = T000C8_A787Nove_CentroDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A787Nove_CentroDescripcion", A787Nove_CentroDescripcion);
         n787Nove_CentroDescripcion = T000C8_n787Nove_CentroDescripcion[0] ;
         pr_default.close(6);
         /* Using cursor T000C9 */
         pr_default.execute(7, new Object[] {new Boolean(n782Nove_RegionId), new Long(A782Nove_RegionId)});
         A783Nove_RegionCodigo = T000C9_A783Nove_RegionCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A783Nove_RegionCodigo", GXutil.ltrim( GXutil.str( A783Nove_RegionCodigo, 4, 0)));
         n783Nove_RegionCodigo = T000C9_n783Nove_RegionCodigo[0] ;
         A784Nove_RegionDescripcion = T000C9_A784Nove_RegionDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A784Nove_RegionDescripcion", A784Nove_RegionDescripcion);
         n784Nove_RegionDescripcion = T000C9_n784Nove_RegionDescripcion[0] ;
         pr_default.close(7);
         /* Using cursor T000C10 */
         pr_default.execute(8, new Object[] {new Boolean(n788Nove_CodigoMovimiento), A788Nove_CodigoMovimiento});
         A789Nove_MovimientoDescrip = T000C10_A789Nove_MovimientoDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A789Nove_MovimientoDescrip", A789Nove_MovimientoDescrip);
         n789Nove_MovimientoDescrip = T000C10_n789Nove_MovimientoDescrip[0] ;
         pr_default.close(8);
         /* Using cursor T000C11 */
         pr_default.execute(9, new Object[] {new Boolean(n793Nove_CuentadanteIdOrigen), new Long(A793Nove_CuentadanteIdOrigen)});
         A794Nove_CuentadanteCedOrigen = T000C11_A794Nove_CuentadanteCedOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794Nove_CuentadanteCedOrigen", GXutil.ltrim( GXutil.str( A794Nove_CuentadanteCedOrigen, 18, 0)));
         n794Nove_CuentadanteCedOrigen = T000C11_n794Nove_CuentadanteCedOrigen[0] ;
         A795Nove_CuentadanteNomOrigen = T000C11_A795Nove_CuentadanteNomOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795Nove_CuentadanteNomOrigen", A795Nove_CuentadanteNomOrigen);
         n795Nove_CuentadanteNomOrigen = T000C11_n795Nove_CuentadanteNomOrigen[0] ;
         pr_default.close(9);
         /* Using cursor T000C12 */
         pr_default.execute(10, new Object[] {new Boolean(n799Nove_CuentadanteIdDestino), new Long(A799Nove_CuentadanteIdDestino)});
         A800Nove_CuentadanteCedDestino = T000C12_A800Nove_CuentadanteCedDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A800Nove_CuentadanteCedDestino", GXutil.ltrim( GXutil.str( A800Nove_CuentadanteCedDestino, 18, 0)));
         n800Nove_CuentadanteCedDestino = T000C12_n800Nove_CuentadanteCedDestino[0] ;
         A801Nove_CuentadanteNomDestino = T000C12_A801Nove_CuentadanteNomDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A801Nove_CuentadanteNomDestino", A801Nove_CuentadanteNomDestino);
         n801Nove_CuentadanteNomDestino = T000C12_n801Nove_CuentadanteNomDestino[0] ;
         pr_default.close(10);
      }
   }

   public void load0C56( )
   {
      /* Using cursor T000C13 */
      pr_default.execute(11, new Object[] {new Long(A106Nove_Identificador)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound56 = (short)(1) ;
         A802Nove_Observaciones = T000C13_A802Nove_Observaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A802Nove_Observaciones", A802Nove_Observaciones);
         n802Nove_Observaciones = T000C13_n802Nove_Observaciones[0] ;
         A780Nove_FechaRegistro = T000C13_A780Nove_FechaRegistro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A780Nove_FechaRegistro", localUtil.ttoc( A780Nove_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         n780Nove_FechaRegistro = T000C13_n780Nove_FechaRegistro[0] ;
         A781Nove_UsuarioRegistro = T000C13_A781Nove_UsuarioRegistro[0] ;
         n781Nove_UsuarioRegistro = T000C13_n781Nove_UsuarioRegistro[0] ;
         A814Nove_TranCC = T000C13_A814Nove_TranCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A814Nove_TranCC", GXutil.ltrim( GXutil.str( A814Nove_TranCC, 18, 0)));
         n814Nove_TranCC = T000C13_n814Nove_TranCC[0] ;
         A783Nove_RegionCodigo = T000C13_A783Nove_RegionCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A783Nove_RegionCodigo", GXutil.ltrim( GXutil.str( A783Nove_RegionCodigo, 4, 0)));
         n783Nove_RegionCodigo = T000C13_n783Nove_RegionCodigo[0] ;
         A784Nove_RegionDescripcion = T000C13_A784Nove_RegionDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A784Nove_RegionDescripcion", A784Nove_RegionDescripcion);
         n784Nove_RegionDescripcion = T000C13_n784Nove_RegionDescripcion[0] ;
         A786Nove_CentroCodigo = T000C13_A786Nove_CentroCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A786Nove_CentroCodigo", A786Nove_CentroCodigo);
         n786Nove_CentroCodigo = T000C13_n786Nove_CentroCodigo[0] ;
         A787Nove_CentroDescripcion = T000C13_A787Nove_CentroDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A787Nove_CentroDescripcion", A787Nove_CentroDescripcion);
         n787Nove_CentroDescripcion = T000C13_n787Nove_CentroDescripcion[0] ;
         A789Nove_MovimientoDescrip = T000C13_A789Nove_MovimientoDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A789Nove_MovimientoDescrip", A789Nove_MovimientoDescrip);
         n789Nove_MovimientoDescrip = T000C13_n789Nove_MovimientoDescrip[0] ;
         A790Nove_ModuloOrigen = T000C13_A790Nove_ModuloOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
         n790Nove_ModuloOrigen = T000C13_n790Nove_ModuloOrigen[0] ;
         A791Nove_AlmaOrigen = T000C13_A791Nove_AlmaOrigen[0] ;
         n791Nove_AlmaOrigen = T000C13_n791Nove_AlmaOrigen[0] ;
         A792Nove_BodeOrigen = T000C13_A792Nove_BodeOrigen[0] ;
         n792Nove_BodeOrigen = T000C13_n792Nove_BodeOrigen[0] ;
         A794Nove_CuentadanteCedOrigen = T000C13_A794Nove_CuentadanteCedOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794Nove_CuentadanteCedOrigen", GXutil.ltrim( GXutil.str( A794Nove_CuentadanteCedOrigen, 18, 0)));
         n794Nove_CuentadanteCedOrigen = T000C13_n794Nove_CuentadanteCedOrigen[0] ;
         A795Nove_CuentadanteNomOrigen = T000C13_A795Nove_CuentadanteNomOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795Nove_CuentadanteNomOrigen", A795Nove_CuentadanteNomOrigen);
         n795Nove_CuentadanteNomOrigen = T000C13_n795Nove_CuentadanteNomOrigen[0] ;
         A796Nove_ModuloDestino = T000C13_A796Nove_ModuloDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
         n796Nove_ModuloDestino = T000C13_n796Nove_ModuloDestino[0] ;
         A797Nove_AlmaDestino = T000C13_A797Nove_AlmaDestino[0] ;
         n797Nove_AlmaDestino = T000C13_n797Nove_AlmaDestino[0] ;
         A798Nove_BodeDestino = T000C13_A798Nove_BodeDestino[0] ;
         n798Nove_BodeDestino = T000C13_n798Nove_BodeDestino[0] ;
         A800Nove_CuentadanteCedDestino = T000C13_A800Nove_CuentadanteCedDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A800Nove_CuentadanteCedDestino", GXutil.ltrim( GXutil.str( A800Nove_CuentadanteCedDestino, 18, 0)));
         n800Nove_CuentadanteCedDestino = T000C13_n800Nove_CuentadanteCedDestino[0] ;
         A801Nove_CuentadanteNomDestino = T000C13_A801Nove_CuentadanteNomDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A801Nove_CuentadanteNomDestino", A801Nove_CuentadanteNomDestino);
         n801Nove_CuentadanteNomDestino = T000C13_n801Nove_CuentadanteNomDestino[0] ;
         A769TNov_Descripcion = T000C13_A769TNov_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769TNov_Descripcion", A769TNov_Descripcion);
         n769TNov_Descripcion = T000C13_n769TNov_Descripcion[0] ;
         A770TNov_Tipo = T000C13_A770TNov_Tipo[0] ;
         n770TNov_Tipo = T000C13_n770TNov_Tipo[0] ;
         A772TNov_Procedimiento = T000C13_A772TNov_Procedimiento[0] ;
         n772TNov_Procedimiento = T000C13_n772TNov_Procedimiento[0] ;
         A774TNov_Nombre_Campo = T000C13_A774TNov_Nombre_Campo[0] ;
         n774TNov_Nombre_Campo = T000C13_n774TNov_Nombre_Campo[0] ;
         A803Nove_Masivo = T000C13_A803Nove_Masivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A803Nove_Masivo", A803Nove_Masivo);
         n803Nove_Masivo = T000C13_n803Nove_Masivo[0] ;
         A804Nove_Soporte = T000C13_A804Nove_Soporte[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A804Nove_Soporte", A804Nove_Soporte);
         httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), true);
         n804Nove_Soporte = T000C13_n804Nove_Soporte[0] ;
         A805Nove_RutaSoporte = T000C13_A805Nove_RutaSoporte[0] ;
         n805Nove_RutaSoporte = T000C13_n805Nove_RutaSoporte[0] ;
         A765Nove_Estado = T000C13_A765Nove_Estado[0] ;
         n765Nove_Estado = T000C13_n765Nove_Estado[0] ;
         A815Nove_RespuestaProc = T000C13_A815Nove_RespuestaProc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A815Nove_RespuestaProc", A815Nove_RespuestaProc);
         n815Nove_RespuestaProc = T000C13_n815Nove_RespuestaProc[0] ;
         A104TNov_Codigo = T000C13_A104TNov_Codigo[0] ;
         n104TNov_Codigo = T000C13_n104TNov_Codigo[0] ;
         A107Nove_TransId = T000C13_A107Nove_TransId[0] ;
         n107Nove_TransId = T000C13_n107Nove_TransId[0] ;
         A785Nove_CentroId = T000C13_A785Nove_CentroId[0] ;
         n785Nove_CentroId = T000C13_n785Nove_CentroId[0] ;
         A782Nove_RegionId = T000C13_A782Nove_RegionId[0] ;
         n782Nove_RegionId = T000C13_n782Nove_RegionId[0] ;
         A788Nove_CodigoMovimiento = T000C13_A788Nove_CodigoMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A788Nove_CodigoMovimiento", A788Nove_CodigoMovimiento);
         n788Nove_CodigoMovimiento = T000C13_n788Nove_CodigoMovimiento[0] ;
         A793Nove_CuentadanteIdOrigen = T000C13_A793Nove_CuentadanteIdOrigen[0] ;
         n793Nove_CuentadanteIdOrigen = T000C13_n793Nove_CuentadanteIdOrigen[0] ;
         A799Nove_CuentadanteIdDestino = T000C13_A799Nove_CuentadanteIdDestino[0] ;
         n799Nove_CuentadanteIdDestino = T000C13_n799Nove_CuentadanteIdDestino[0] ;
         zm0C56( -21) ;
      }
      pr_default.close(11);
      onLoadActions0C56( ) ;
   }

   public void onLoadActions0C56( )
   {
      AV21Pgmname = "ALM_NOVEDAD" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      if ( GXutil.strcmp(A770TNov_Tipo, "P") == 0 )
      {
         divTabletransaccion_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTabletransaccion_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTabletransaccion_Visible, 5, 0)), true);
      }
      else
      {
         if ( GXutil.strcmp(A770TNov_Tipo, "P") != 0 )
         {
            divTabletransaccion_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, divTabletransaccion_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTabletransaccion_Visible, 5, 0)), true);
         }
      }
      if ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 )
      {
         edtNove_Consecutivo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNove_Consecutivo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_Consecutivo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
      }
      if ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 )
      {
         edtNove_Placa_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNove_Placa_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_Placa_Visible, 5, 0)), !bGXsfl_134_Refreshing);
      }
      if ( ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") != 0 ) )
      {
         edtNove_ValorAntiguo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorAntiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_ValorAntiguo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
      }
      if ( ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") != 0 ) )
      {
         edtNove_ValorNuevo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorNuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_ValorNuevo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
      }
      if ( ( GXutil.strcmp(A770TNov_Tipo, "T") != 0 ) || ( ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") == 0 ) ) )
      {
         edtavNove_valorantiguo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_valorantiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_valorantiguo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
      }
      if ( ( GXutil.strcmp(A770TNov_Tipo, "T") != 0 ) || ( ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") == 0 ) ) )
      {
         edtavNove_valornuevo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_valornuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_valornuevo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  )
      {
         GXv_int1[0] = A785Nove_CentroId ;
         GXv_char2[0] = A790Nove_ModuloOrigen ;
         GXv_char3[0] = A791Nove_AlmaOrigen ;
         GXv_char4[0] = A792Nove_BodeOrigen ;
         GXv_char5[0] = AV15Alma_OrigenDescrip ;
         GXv_char6[0] = AV17Bode_OrigenDescrip ;
         new com.orions2.pbodegas(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         alm_novedad_impl.this.A785Nove_CentroId = GXv_int1[0] ;
         alm_novedad_impl.this.A790Nove_ModuloOrigen = GXv_char2[0] ;
         alm_novedad_impl.this.A791Nove_AlmaOrigen = GXv_char3[0] ;
         alm_novedad_impl.this.A792Nove_BodeOrigen = GXv_char4[0] ;
         alm_novedad_impl.this.AV15Alma_OrigenDescrip = GXv_char5[0] ;
         alm_novedad_impl.this.AV17Bode_OrigenDescrip = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "A791Nove_AlmaOrigen", A791Nove_AlmaOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "A792Nove_BodeOrigen", A792Nove_BodeOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "AV15Alma_OrigenDescrip", AV15Alma_OrigenDescrip);
         httpContext.ajax_rsp_assign_attri("", false, "AV17Bode_OrigenDescrip", AV17Bode_OrigenDescrip);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  )
      {
         GXv_int1[0] = A785Nove_CentroId ;
         GXv_char6[0] = A796Nove_ModuloDestino ;
         GXv_char5[0] = A797Nove_AlmaDestino ;
         GXv_char4[0] = A798Nove_BodeDestino ;
         GXv_char3[0] = AV16Alma_DestiDescrip ;
         GXv_char2[0] = AV18Bode_DestiDescrip ;
         new com.orions2.pbodegas(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         alm_novedad_impl.this.A785Nove_CentroId = GXv_int1[0] ;
         alm_novedad_impl.this.A796Nove_ModuloDestino = GXv_char6[0] ;
         alm_novedad_impl.this.A797Nove_AlmaDestino = GXv_char5[0] ;
         alm_novedad_impl.this.A798Nove_BodeDestino = GXv_char4[0] ;
         alm_novedad_impl.this.AV16Alma_DestiDescrip = GXv_char3[0] ;
         alm_novedad_impl.this.AV18Bode_DestiDescrip = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
         httpContext.ajax_rsp_assign_attri("", false, "A797Nove_AlmaDestino", A797Nove_AlmaDestino);
         httpContext.ajax_rsp_assign_attri("", false, "A798Nove_BodeDestino", A798Nove_BodeDestino);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Alma_DestiDescrip", AV16Alma_DestiDescrip);
         httpContext.ajax_rsp_assign_attri("", false, "AV18Bode_DestiDescrip", AV18Bode_DestiDescrip);
      }
   }

   public void checkExtendedTable0C56( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV21Pgmname = "ALM_NOVEDAD" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
      /* Using cursor T000C6 */
      pr_default.execute(4, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (0==A104TNov_Codigo) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Tipo de Novedad'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A769TNov_Descripcion = T000C6_A769TNov_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A769TNov_Descripcion", A769TNov_Descripcion);
      n769TNov_Descripcion = T000C6_n769TNov_Descripcion[0] ;
      A770TNov_Tipo = T000C6_A770TNov_Tipo[0] ;
      n770TNov_Tipo = T000C6_n770TNov_Tipo[0] ;
      A772TNov_Procedimiento = T000C6_A772TNov_Procedimiento[0] ;
      n772TNov_Procedimiento = T000C6_n772TNov_Procedimiento[0] ;
      A774TNov_Nombre_Campo = T000C6_A774TNov_Nombre_Campo[0] ;
      n774TNov_Nombre_Campo = T000C6_n774TNov_Nombre_Campo[0] ;
      pr_default.close(4);
      if ( GXutil.strcmp(A770TNov_Tipo, "P") == 0 )
      {
         divTabletransaccion_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTabletransaccion_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTabletransaccion_Visible, 5, 0)), true);
      }
      else
      {
         if ( GXutil.strcmp(A770TNov_Tipo, "P") != 0 )
         {
            divTabletransaccion_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, divTabletransaccion_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTabletransaccion_Visible, 5, 0)), true);
         }
      }
      if ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 )
      {
         edtNove_Consecutivo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNove_Consecutivo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_Consecutivo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
      }
      if ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 )
      {
         edtNove_Placa_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNove_Placa_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_Placa_Visible, 5, 0)), !bGXsfl_134_Refreshing);
      }
      if ( ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") != 0 ) )
      {
         edtNove_ValorAntiguo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorAntiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_ValorAntiguo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
      }
      if ( ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") != 0 ) )
      {
         edtNove_ValorNuevo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorNuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_ValorNuevo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
      }
      if ( ( GXutil.strcmp(A770TNov_Tipo, "T") != 0 ) || ( ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") == 0 ) ) )
      {
         edtavNove_valorantiguo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_valorantiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_valorantiguo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
      }
      if ( ( GXutil.strcmp(A770TNov_Tipo, "T") != 0 ) || ( ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") == 0 ) ) )
      {
         edtavNove_valornuevo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_valornuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_valornuevo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
      }
      /* Using cursor T000C7 */
      pr_default.execute(5, new Object[] {new Boolean(n107Nove_TransId), new Long(A107Nove_TransId)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (0==A107Nove_TransId) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Transaccion_Novedad'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A814Nove_TranCC = T000C7_A814Nove_TranCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A814Nove_TranCC", GXutil.ltrim( GXutil.str( A814Nove_TranCC, 18, 0)));
      n814Nove_TranCC = T000C7_n814Nove_TranCC[0] ;
      A790Nove_ModuloOrigen = T000C7_A790Nove_ModuloOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
      n790Nove_ModuloOrigen = T000C7_n790Nove_ModuloOrigen[0] ;
      A791Nove_AlmaOrigen = T000C7_A791Nove_AlmaOrigen[0] ;
      n791Nove_AlmaOrigen = T000C7_n791Nove_AlmaOrigen[0] ;
      A792Nove_BodeOrigen = T000C7_A792Nove_BodeOrigen[0] ;
      n792Nove_BodeOrigen = T000C7_n792Nove_BodeOrigen[0] ;
      A796Nove_ModuloDestino = T000C7_A796Nove_ModuloDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
      n796Nove_ModuloDestino = T000C7_n796Nove_ModuloDestino[0] ;
      A797Nove_AlmaDestino = T000C7_A797Nove_AlmaDestino[0] ;
      n797Nove_AlmaDestino = T000C7_n797Nove_AlmaDestino[0] ;
      A798Nove_BodeDestino = T000C7_A798Nove_BodeDestino[0] ;
      n798Nove_BodeDestino = T000C7_n798Nove_BodeDestino[0] ;
      A785Nove_CentroId = T000C7_A785Nove_CentroId[0] ;
      n785Nove_CentroId = T000C7_n785Nove_CentroId[0] ;
      A782Nove_RegionId = T000C7_A782Nove_RegionId[0] ;
      n782Nove_RegionId = T000C7_n782Nove_RegionId[0] ;
      A788Nove_CodigoMovimiento = T000C7_A788Nove_CodigoMovimiento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A788Nove_CodigoMovimiento", A788Nove_CodigoMovimiento);
      n788Nove_CodigoMovimiento = T000C7_n788Nove_CodigoMovimiento[0] ;
      A793Nove_CuentadanteIdOrigen = T000C7_A793Nove_CuentadanteIdOrigen[0] ;
      n793Nove_CuentadanteIdOrigen = T000C7_n793Nove_CuentadanteIdOrigen[0] ;
      A799Nove_CuentadanteIdDestino = T000C7_A799Nove_CuentadanteIdDestino[0] ;
      n799Nove_CuentadanteIdDestino = T000C7_n799Nove_CuentadanteIdDestino[0] ;
      pr_default.close(5);
      /* Using cursor T000C8 */
      pr_default.execute(6, new Object[] {new Boolean(n785Nove_CentroId), new Long(A785Nove_CentroId)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (0==A785Nove_CentroId) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A786Nove_CentroCodigo = T000C8_A786Nove_CentroCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A786Nove_CentroCodigo", A786Nove_CentroCodigo);
      n786Nove_CentroCodigo = T000C8_n786Nove_CentroCodigo[0] ;
      A787Nove_CentroDescripcion = T000C8_A787Nove_CentroDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A787Nove_CentroDescripcion", A787Nove_CentroDescripcion);
      n787Nove_CentroDescripcion = T000C8_n787Nove_CentroDescripcion[0] ;
      pr_default.close(6);
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  )
      {
         GXv_int1[0] = A785Nove_CentroId ;
         GXv_char6[0] = A790Nove_ModuloOrigen ;
         GXv_char5[0] = A791Nove_AlmaOrigen ;
         GXv_char4[0] = A792Nove_BodeOrigen ;
         GXv_char3[0] = AV15Alma_OrigenDescrip ;
         GXv_char2[0] = AV17Bode_OrigenDescrip ;
         new com.orions2.pbodegas(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         alm_novedad_impl.this.A785Nove_CentroId = GXv_int1[0] ;
         alm_novedad_impl.this.A790Nove_ModuloOrigen = GXv_char6[0] ;
         alm_novedad_impl.this.A791Nove_AlmaOrigen = GXv_char5[0] ;
         alm_novedad_impl.this.A792Nove_BodeOrigen = GXv_char4[0] ;
         alm_novedad_impl.this.AV15Alma_OrigenDescrip = GXv_char3[0] ;
         alm_novedad_impl.this.AV17Bode_OrigenDescrip = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "A791Nove_AlmaOrigen", A791Nove_AlmaOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "A792Nove_BodeOrigen", A792Nove_BodeOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "AV15Alma_OrigenDescrip", AV15Alma_OrigenDescrip);
         httpContext.ajax_rsp_assign_attri("", false, "AV17Bode_OrigenDescrip", AV17Bode_OrigenDescrip);
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  )
      {
         GXv_int1[0] = A785Nove_CentroId ;
         GXv_char6[0] = A796Nove_ModuloDestino ;
         GXv_char5[0] = A797Nove_AlmaDestino ;
         GXv_char4[0] = A798Nove_BodeDestino ;
         GXv_char3[0] = AV16Alma_DestiDescrip ;
         GXv_char2[0] = AV18Bode_DestiDescrip ;
         new com.orions2.pbodegas(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         alm_novedad_impl.this.A785Nove_CentroId = GXv_int1[0] ;
         alm_novedad_impl.this.A796Nove_ModuloDestino = GXv_char6[0] ;
         alm_novedad_impl.this.A797Nove_AlmaDestino = GXv_char5[0] ;
         alm_novedad_impl.this.A798Nove_BodeDestino = GXv_char4[0] ;
         alm_novedad_impl.this.AV16Alma_DestiDescrip = GXv_char3[0] ;
         alm_novedad_impl.this.AV18Bode_DestiDescrip = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
         httpContext.ajax_rsp_assign_attri("", false, "A797Nove_AlmaDestino", A797Nove_AlmaDestino);
         httpContext.ajax_rsp_assign_attri("", false, "A798Nove_BodeDestino", A798Nove_BodeDestino);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Alma_DestiDescrip", AV16Alma_DestiDescrip);
         httpContext.ajax_rsp_assign_attri("", false, "AV18Bode_DestiDescrip", AV18Bode_DestiDescrip);
      }
      /* Using cursor T000C9 */
      pr_default.execute(7, new Object[] {new Boolean(n782Nove_RegionId), new Long(A782Nove_RegionId)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (0==A782Nove_RegionId) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A783Nove_RegionCodigo = T000C9_A783Nove_RegionCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A783Nove_RegionCodigo", GXutil.ltrim( GXutil.str( A783Nove_RegionCodigo, 4, 0)));
      n783Nove_RegionCodigo = T000C9_n783Nove_RegionCodigo[0] ;
      A784Nove_RegionDescripcion = T000C9_A784Nove_RegionDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A784Nove_RegionDescripcion", A784Nove_RegionDescripcion);
      n784Nove_RegionDescripcion = T000C9_n784Nove_RegionDescripcion[0] ;
      pr_default.close(7);
      /* Using cursor T000C10 */
      pr_default.execute(8, new Object[] {new Boolean(n788Nove_CodigoMovimiento), A788Nove_CodigoMovimiento});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A788Nove_CodigoMovimiento)==0) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'TIPO DE MOVIMIENTO'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A789Nove_MovimientoDescrip = T000C10_A789Nove_MovimientoDescrip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A789Nove_MovimientoDescrip", A789Nove_MovimientoDescrip);
      n789Nove_MovimientoDescrip = T000C10_n789Nove_MovimientoDescrip[0] ;
      pr_default.close(8);
      /* Using cursor T000C11 */
      pr_default.execute(9, new Object[] {new Boolean(n793Nove_CuentadanteIdOrigen), new Long(A793Nove_CuentadanteIdOrigen)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (0==A793Nove_CuentadanteIdOrigen) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'CUENTADANTE'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A794Nove_CuentadanteCedOrigen = T000C11_A794Nove_CuentadanteCedOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794Nove_CuentadanteCedOrigen", GXutil.ltrim( GXutil.str( A794Nove_CuentadanteCedOrigen, 18, 0)));
      n794Nove_CuentadanteCedOrigen = T000C11_n794Nove_CuentadanteCedOrigen[0] ;
      A795Nove_CuentadanteNomOrigen = T000C11_A795Nove_CuentadanteNomOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A795Nove_CuentadanteNomOrigen", A795Nove_CuentadanteNomOrigen);
      n795Nove_CuentadanteNomOrigen = T000C11_n795Nove_CuentadanteNomOrigen[0] ;
      pr_default.close(9);
      /* Using cursor T000C12 */
      pr_default.execute(10, new Object[] {new Boolean(n799Nove_CuentadanteIdDestino), new Long(A799Nove_CuentadanteIdDestino)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (0==A799Nove_CuentadanteIdDestino) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'CUENTADANTE'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A800Nove_CuentadanteCedDestino = T000C12_A800Nove_CuentadanteCedDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A800Nove_CuentadanteCedDestino", GXutil.ltrim( GXutil.str( A800Nove_CuentadanteCedDestino, 18, 0)));
      n800Nove_CuentadanteCedDestino = T000C12_n800Nove_CuentadanteCedDestino[0] ;
      A801Nove_CuentadanteNomDestino = T000C12_A801Nove_CuentadanteNomDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A801Nove_CuentadanteNomDestino", A801Nove_CuentadanteNomDestino);
      n801Nove_CuentadanteNomDestino = T000C12_n801Nove_CuentadanteNomDestino[0] ;
      pr_default.close(10);
   }

   public void closeExtendedTableCursors0C56( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_22( int A104TNov_Codigo )
   {
      /* Using cursor T000C14 */
      pr_default.execute(12, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (0==A104TNov_Codigo) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Tipo de Novedad'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A769TNov_Descripcion = T000C14_A769TNov_Descripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A769TNov_Descripcion", A769TNov_Descripcion);
      n769TNov_Descripcion = T000C14_n769TNov_Descripcion[0] ;
      A770TNov_Tipo = T000C14_A770TNov_Tipo[0] ;
      n770TNov_Tipo = T000C14_n770TNov_Tipo[0] ;
      A772TNov_Procedimiento = T000C14_A772TNov_Procedimiento[0] ;
      n772TNov_Procedimiento = T000C14_n772TNov_Procedimiento[0] ;
      A774TNov_Nombre_Campo = T000C14_A774TNov_Nombre_Campo[0] ;
      n774TNov_Nombre_Campo = T000C14_n774TNov_Nombre_Campo[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A769TNov_Descripcion)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A770TNov_Tipo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A772TNov_Procedimiento)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A774TNov_Nombre_Campo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(12);
   }

   public void gxload_23( long A107Nove_TransId )
   {
      /* Using cursor T000C15 */
      pr_default.execute(13, new Object[] {new Boolean(n107Nove_TransId), new Long(A107Nove_TransId)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (0==A107Nove_TransId) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'Transaccion_Novedad'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A814Nove_TranCC = T000C15_A814Nove_TranCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A814Nove_TranCC", GXutil.ltrim( GXutil.str( A814Nove_TranCC, 18, 0)));
      n814Nove_TranCC = T000C15_n814Nove_TranCC[0] ;
      A790Nove_ModuloOrigen = T000C15_A790Nove_ModuloOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
      n790Nove_ModuloOrigen = T000C15_n790Nove_ModuloOrigen[0] ;
      A791Nove_AlmaOrigen = T000C15_A791Nove_AlmaOrigen[0] ;
      n791Nove_AlmaOrigen = T000C15_n791Nove_AlmaOrigen[0] ;
      A792Nove_BodeOrigen = T000C15_A792Nove_BodeOrigen[0] ;
      n792Nove_BodeOrigen = T000C15_n792Nove_BodeOrigen[0] ;
      A796Nove_ModuloDestino = T000C15_A796Nove_ModuloDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
      n796Nove_ModuloDestino = T000C15_n796Nove_ModuloDestino[0] ;
      A797Nove_AlmaDestino = T000C15_A797Nove_AlmaDestino[0] ;
      n797Nove_AlmaDestino = T000C15_n797Nove_AlmaDestino[0] ;
      A798Nove_BodeDestino = T000C15_A798Nove_BodeDestino[0] ;
      n798Nove_BodeDestino = T000C15_n798Nove_BodeDestino[0] ;
      A785Nove_CentroId = T000C15_A785Nove_CentroId[0] ;
      n785Nove_CentroId = T000C15_n785Nove_CentroId[0] ;
      A782Nove_RegionId = T000C15_A782Nove_RegionId[0] ;
      n782Nove_RegionId = T000C15_n782Nove_RegionId[0] ;
      A788Nove_CodigoMovimiento = T000C15_A788Nove_CodigoMovimiento[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A788Nove_CodigoMovimiento", A788Nove_CodigoMovimiento);
      n788Nove_CodigoMovimiento = T000C15_n788Nove_CodigoMovimiento[0] ;
      A793Nove_CuentadanteIdOrigen = T000C15_A793Nove_CuentadanteIdOrigen[0] ;
      n793Nove_CuentadanteIdOrigen = T000C15_n793Nove_CuentadanteIdOrigen[0] ;
      A799Nove_CuentadanteIdDestino = T000C15_A799Nove_CuentadanteIdDestino[0] ;
      n799Nove_CuentadanteIdDestino = T000C15_n799Nove_CuentadanteIdDestino[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A814Nove_TranCC, (byte)(18), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A790Nove_ModuloOrigen)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A791Nove_AlmaOrigen)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A792Nove_BodeOrigen)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A796Nove_ModuloDestino)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A797Nove_AlmaDestino)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A798Nove_BodeDestino)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A785Nove_CentroId, (byte)(11), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A782Nove_RegionId, (byte)(11), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A788Nove_CodigoMovimiento)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A793Nove_CuentadanteIdOrigen, (byte)(18), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A799Nove_CuentadanteIdDestino, (byte)(18), (byte)(0), ".", "")))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(13);
   }

   public void gxload_24( long A785Nove_CentroId )
   {
      /* Using cursor T000C16 */
      pr_default.execute(14, new Object[] {new Boolean(n785Nove_CentroId), new Long(A785Nove_CentroId)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (0==A785Nove_CentroId) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'CENTRO DE COSTO'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A786Nove_CentroCodigo = T000C16_A786Nove_CentroCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A786Nove_CentroCodigo", A786Nove_CentroCodigo);
      n786Nove_CentroCodigo = T000C16_n786Nove_CentroCodigo[0] ;
      A787Nove_CentroDescripcion = T000C16_A787Nove_CentroDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A787Nove_CentroDescripcion", A787Nove_CentroDescripcion);
      n787Nove_CentroDescripcion = T000C16_n787Nove_CentroDescripcion[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A786Nove_CentroCodigo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A787Nove_CentroDescripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(14);
   }

   public void gxload_25( long A782Nove_RegionId )
   {
      /* Using cursor T000C17 */
      pr_default.execute(15, new Object[] {new Boolean(n782Nove_RegionId), new Long(A782Nove_RegionId)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (0==A782Nove_RegionId) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'REGIONAL'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A783Nove_RegionCodigo = T000C17_A783Nove_RegionCodigo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A783Nove_RegionCodigo", GXutil.ltrim( GXutil.str( A783Nove_RegionCodigo, 4, 0)));
      n783Nove_RegionCodigo = T000C17_n783Nove_RegionCodigo[0] ;
      A784Nove_RegionDescripcion = T000C17_A784Nove_RegionDescripcion[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A784Nove_RegionDescripcion", A784Nove_RegionDescripcion);
      n784Nove_RegionDescripcion = T000C17_n784Nove_RegionDescripcion[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A783Nove_RegionCodigo, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A784Nove_RegionDescripcion)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(15);
   }

   public void gxload_26( String A788Nove_CodigoMovimiento )
   {
      /* Using cursor T000C18 */
      pr_default.execute(16, new Object[] {new Boolean(n788Nove_CodigoMovimiento), A788Nove_CodigoMovimiento});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A788Nove_CodigoMovimiento)==0) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'TIPO DE MOVIMIENTO'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A789Nove_MovimientoDescrip = T000C18_A789Nove_MovimientoDescrip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A789Nove_MovimientoDescrip", A789Nove_MovimientoDescrip);
      n789Nove_MovimientoDescrip = T000C18_n789Nove_MovimientoDescrip[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( A789Nove_MovimientoDescrip)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(16);
   }

   public void gxload_27( long A793Nove_CuentadanteIdOrigen )
   {
      /* Using cursor T000C19 */
      pr_default.execute(17, new Object[] {new Boolean(n793Nove_CuentadanteIdOrigen), new Long(A793Nove_CuentadanteIdOrigen)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (0==A793Nove_CuentadanteIdOrigen) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'CUENTADANTE'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A794Nove_CuentadanteCedOrigen = T000C19_A794Nove_CuentadanteCedOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794Nove_CuentadanteCedOrigen", GXutil.ltrim( GXutil.str( A794Nove_CuentadanteCedOrigen, 18, 0)));
      n794Nove_CuentadanteCedOrigen = T000C19_n794Nove_CuentadanteCedOrigen[0] ;
      A795Nove_CuentadanteNomOrigen = T000C19_A795Nove_CuentadanteNomOrigen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A795Nove_CuentadanteNomOrigen", A795Nove_CuentadanteNomOrigen);
      n795Nove_CuentadanteNomOrigen = T000C19_n795Nove_CuentadanteNomOrigen[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A794Nove_CuentadanteCedOrigen, (byte)(18), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A795Nove_CuentadanteNomOrigen)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(17);
   }

   public void gxload_28( long A799Nove_CuentadanteIdDestino )
   {
      /* Using cursor T000C20 */
      pr_default.execute(18, new Object[] {new Boolean(n799Nove_CuentadanteIdDestino), new Long(A799Nove_CuentadanteIdDestino)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (0==A799Nove_CuentadanteIdDestino) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'CUENTADANTE'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A800Nove_CuentadanteCedDestino = T000C20_A800Nove_CuentadanteCedDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A800Nove_CuentadanteCedDestino", GXutil.ltrim( GXutil.str( A800Nove_CuentadanteCedDestino, 18, 0)));
      n800Nove_CuentadanteCedDestino = T000C20_n800Nove_CuentadanteCedDestino[0] ;
      A801Nove_CuentadanteNomDestino = T000C20_A801Nove_CuentadanteNomDestino[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A801Nove_CuentadanteNomDestino", A801Nove_CuentadanteNomDestino);
      n801Nove_CuentadanteNomDestino = T000C20_n801Nove_CuentadanteNomDestino[0] ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A800Nove_CuentadanteCedDestino, (byte)(18), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A801Nove_CuentadanteNomDestino)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(18);
   }

   public void getKey0C56( )
   {
      /* Using cursor T000C21 */
      pr_default.execute(19, new Object[] {new Long(A106Nove_Identificador)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound56 = (short)(1) ;
      }
      else
      {
         RcdFound56 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000C5 */
      pr_default.execute(3, new Object[] {new Long(A106Nove_Identificador)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm0C56( 21) ;
         RcdFound56 = (short)(1) ;
         A802Nove_Observaciones = T000C5_A802Nove_Observaciones[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A802Nove_Observaciones", A802Nove_Observaciones);
         n802Nove_Observaciones = T000C5_n802Nove_Observaciones[0] ;
         A106Nove_Identificador = T000C5_A106Nove_Identificador[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
         A780Nove_FechaRegistro = T000C5_A780Nove_FechaRegistro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A780Nove_FechaRegistro", localUtil.ttoc( A780Nove_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         n780Nove_FechaRegistro = T000C5_n780Nove_FechaRegistro[0] ;
         A781Nove_UsuarioRegistro = T000C5_A781Nove_UsuarioRegistro[0] ;
         n781Nove_UsuarioRegistro = T000C5_n781Nove_UsuarioRegistro[0] ;
         A803Nove_Masivo = T000C5_A803Nove_Masivo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A803Nove_Masivo", A803Nove_Masivo);
         n803Nove_Masivo = T000C5_n803Nove_Masivo[0] ;
         A804Nove_Soporte = T000C5_A804Nove_Soporte[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A804Nove_Soporte", A804Nove_Soporte);
         httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), true);
         n804Nove_Soporte = T000C5_n804Nove_Soporte[0] ;
         A805Nove_RutaSoporte = T000C5_A805Nove_RutaSoporte[0] ;
         n805Nove_RutaSoporte = T000C5_n805Nove_RutaSoporte[0] ;
         A765Nove_Estado = T000C5_A765Nove_Estado[0] ;
         n765Nove_Estado = T000C5_n765Nove_Estado[0] ;
         A815Nove_RespuestaProc = T000C5_A815Nove_RespuestaProc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A815Nove_RespuestaProc", A815Nove_RespuestaProc);
         n815Nove_RespuestaProc = T000C5_n815Nove_RespuestaProc[0] ;
         A104TNov_Codigo = T000C5_A104TNov_Codigo[0] ;
         n104TNov_Codigo = T000C5_n104TNov_Codigo[0] ;
         A107Nove_TransId = T000C5_A107Nove_TransId[0] ;
         n107Nove_TransId = T000C5_n107Nove_TransId[0] ;
         Z106Nove_Identificador = A106Nove_Identificador ;
         sMode56 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0C56( ) ;
         if ( AnyError == 1 )
         {
            RcdFound56 = (short)(0) ;
            initializeNonKey0C56( ) ;
         }
         Gx_mode = sMode56 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound56 = (short)(0) ;
         initializeNonKey0C56( ) ;
         sMode56 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal( ) ;
         Gx_mode = sMode56 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey0C56( ) ;
      if ( RcdFound56 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound56 = (short)(0) ;
      /* Using cursor T000C22 */
      pr_default.execute(20, new Object[] {new Long(A106Nove_Identificador)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( T000C22_A106Nove_Identificador[0] < A106Nove_Identificador ) ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( T000C22_A106Nove_Identificador[0] > A106Nove_Identificador ) ) )
         {
            A106Nove_Identificador = T000C22_A106Nove_Identificador[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
            RcdFound56 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void move_previous( )
   {
      RcdFound56 = (short)(0) ;
      /* Using cursor T000C23 */
      pr_default.execute(21, new Object[] {new Long(A106Nove_Identificador)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( T000C23_A106Nove_Identificador[0] > A106Nove_Identificador ) ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( T000C23_A106Nove_Identificador[0] < A106Nove_Identificador ) ) )
         {
            A106Nove_Identificador = T000C23_A106Nove_Identificador[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
            RcdFound56 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0C56( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtNove_FechaRegistro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0C56( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound56 == 1 )
         {
            if ( A106Nove_Identificador != Z106Nove_Identificador )
            {
               A106Nove_Identificador = Z106Nove_Identificador ;
               httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "NOVE_IDENTIFICADOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtNove_Identificador_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtNove_FechaRegistro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update0C56( ) ;
               GX_FocusControl = edtNove_FechaRegistro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A106Nove_Identificador != Z106Nove_Identificador )
            {
               /* Insert record */
               GX_FocusControl = edtNove_FechaRegistro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0C56( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "NOVE_IDENTIFICADOR");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtNove_Identificador_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtNove_FechaRegistro_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0C56( ) ;
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
      if ( A106Nove_Identificador != Z106Nove_Identificador )
      {
         A106Nove_Identificador = Z106Nove_Identificador ;
         httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "NOVE_IDENTIFICADOR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNove_Identificador_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtNove_FechaRegistro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0C56( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000C4 */
         pr_default.execute(2, new Object[] {new Long(A106Nove_Identificador)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_NOVEDAD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || !( GXutil.dateCompare(Z780Nove_FechaRegistro, T000C4_A780Nove_FechaRegistro[0]) ) || ( Z781Nove_UsuarioRegistro != T000C4_A781Nove_UsuarioRegistro[0] ) || ( GXutil.strcmp(Z803Nove_Masivo, T000C4_A803Nove_Masivo[0]) != 0 ) || ( GXutil.strcmp(Z805Nove_RutaSoporte, T000C4_A805Nove_RutaSoporte[0]) != 0 ) || ( GXutil.strcmp(Z765Nove_Estado, T000C4_A765Nove_Estado[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z815Nove_RespuestaProc, T000C4_A815Nove_RespuestaProc[0]) != 0 ) || ( Z104TNov_Codigo != T000C4_A104TNov_Codigo[0] ) || ( Z107Nove_TransId != T000C4_A107Nove_TransId[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_NOVEDAD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0C56( )
   {
      beforeValidate0C56( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C56( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0C56( 0) ;
         checkOptimisticConcurrency0C56( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C56( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0C56( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C24 */
                  pr_default.execute(22, new Object[] {new Boolean(n780Nove_FechaRegistro), A780Nove_FechaRegistro, new Boolean(n781Nove_UsuarioRegistro), new Long(A781Nove_UsuarioRegistro), new Boolean(n802Nove_Observaciones), A802Nove_Observaciones, new Boolean(n803Nove_Masivo), A803Nove_Masivo, new Boolean(n804Nove_Soporte), A804Nove_Soporte, new Boolean(n805Nove_RutaSoporte), A805Nove_RutaSoporte, new Boolean(n765Nove_Estado), A765Nove_Estado, new Boolean(n815Nove_RespuestaProc), A815Nove_RespuestaProc, new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo), new Boolean(n107Nove_TransId), new Long(A107Nove_TransId)});
                  /* Retrieving last key number assigned */
                  /* Using cursor T000C25 */
                  pr_default.execute(23);
                  A106Nove_Identificador = T000C25_A106Nove_Identificador[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
                  pr_default.close(23);
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVEDAD") ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0C56( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), "SuccessfullyAdded", 0, "", true);
                           resetCaption0C0( ) ;
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
            load0C56( ) ;
         }
         endLevel0C56( ) ;
      }
      closeExtendedTableCursors0C56( ) ;
   }

   public void update0C56( )
   {
      beforeValidate0C56( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C56( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C56( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C56( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0C56( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C26 */
                  pr_default.execute(24, new Object[] {new Boolean(n780Nove_FechaRegistro), A780Nove_FechaRegistro, new Boolean(n781Nove_UsuarioRegistro), new Long(A781Nove_UsuarioRegistro), new Boolean(n802Nove_Observaciones), A802Nove_Observaciones, new Boolean(n803Nove_Masivo), A803Nove_Masivo, new Boolean(n805Nove_RutaSoporte), A805Nove_RutaSoporte, new Boolean(n765Nove_Estado), A765Nove_Estado, new Boolean(n815Nove_RespuestaProc), A815Nove_RespuestaProc, new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo), new Boolean(n107Nove_TransId), new Long(A107Nove_TransId), new Long(A106Nove_Identificador)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVEDAD") ;
                  if ( (pr_default.getStatus(24) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_NOVEDAD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0C56( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0C56( ) ;
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
         endLevel0C56( ) ;
      }
      closeExtendedTableCursors0C56( ) ;
   }

   public void deferredUpdate0C56( )
   {
      if ( AnyError == 0 )
      {
         /* Using cursor T000C27 */
         pr_default.execute(25, new Object[] {new Boolean(n804Nove_Soporte), A804Nove_Soporte, new Long(A106Nove_Identificador)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVEDAD") ;
      }
   }

   public void delete( )
   {
      beforeValidate0C56( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C56( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0C56( ) ;
         afterConfirm0C56( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0C56( ) ;
            if ( AnyError == 0 )
            {
               scanStart0C57( ) ;
               while ( RcdFound57 != 0 )
               {
                  getByPrimaryKey0C57( ) ;
                  delete0C57( ) ;
                  scanNext0C57( ) ;
               }
               scanEnd0C57( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C28 */
                  pr_default.execute(26, new Object[] {new Long(A106Nove_Identificador)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVEDAD") ;
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
      sMode56 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0C56( ) ;
      Gx_mode = sMode56 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0C56( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  )
         {
            GXv_int1[0] = A785Nove_CentroId ;
            GXv_char6[0] = A790Nove_ModuloOrigen ;
            GXv_char5[0] = A791Nove_AlmaOrigen ;
            GXv_char4[0] = A792Nove_BodeOrigen ;
            GXv_char3[0] = AV15Alma_OrigenDescrip ;
            GXv_char2[0] = AV17Bode_OrigenDescrip ;
            new com.orions2.pbodegas(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            alm_novedad_impl.this.A785Nove_CentroId = GXv_int1[0] ;
            alm_novedad_impl.this.A790Nove_ModuloOrigen = GXv_char6[0] ;
            alm_novedad_impl.this.A791Nove_AlmaOrigen = GXv_char5[0] ;
            alm_novedad_impl.this.A792Nove_BodeOrigen = GXv_char4[0] ;
            alm_novedad_impl.this.AV15Alma_OrigenDescrip = GXv_char3[0] ;
            alm_novedad_impl.this.AV17Bode_OrigenDescrip = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
            httpContext.ajax_rsp_assign_attri("", false, "A791Nove_AlmaOrigen", A791Nove_AlmaOrigen);
            httpContext.ajax_rsp_assign_attri("", false, "A792Nove_BodeOrigen", A792Nove_BodeOrigen);
            httpContext.ajax_rsp_assign_attri("", false, "AV15Alma_OrigenDescrip", AV15Alma_OrigenDescrip);
            httpContext.ajax_rsp_assign_attri("", false, "AV17Bode_OrigenDescrip", AV17Bode_OrigenDescrip);
         }
         if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  )
         {
            GXv_int1[0] = A785Nove_CentroId ;
            GXv_char6[0] = A796Nove_ModuloDestino ;
            GXv_char5[0] = A797Nove_AlmaDestino ;
            GXv_char4[0] = A798Nove_BodeDestino ;
            GXv_char3[0] = AV16Alma_DestiDescrip ;
            GXv_char2[0] = AV18Bode_DestiDescrip ;
            new com.orions2.pbodegas(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            alm_novedad_impl.this.A785Nove_CentroId = GXv_int1[0] ;
            alm_novedad_impl.this.A796Nove_ModuloDestino = GXv_char6[0] ;
            alm_novedad_impl.this.A797Nove_AlmaDestino = GXv_char5[0] ;
            alm_novedad_impl.this.A798Nove_BodeDestino = GXv_char4[0] ;
            alm_novedad_impl.this.AV16Alma_DestiDescrip = GXv_char3[0] ;
            alm_novedad_impl.this.AV18Bode_DestiDescrip = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
            httpContext.ajax_rsp_assign_attri("", false, "A797Nove_AlmaDestino", A797Nove_AlmaDestino);
            httpContext.ajax_rsp_assign_attri("", false, "A798Nove_BodeDestino", A798Nove_BodeDestino);
            httpContext.ajax_rsp_assign_attri("", false, "AV16Alma_DestiDescrip", AV16Alma_DestiDescrip);
            httpContext.ajax_rsp_assign_attri("", false, "AV18Bode_DestiDescrip", AV18Bode_DestiDescrip);
         }
         AV21Pgmname = "ALM_NOVEDAD" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Pgmname", AV21Pgmname);
         /* Using cursor T000C29 */
         pr_default.execute(27, new Object[] {new Boolean(n104TNov_Codigo), new Integer(A104TNov_Codigo)});
         A769TNov_Descripcion = T000C29_A769TNov_Descripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769TNov_Descripcion", A769TNov_Descripcion);
         n769TNov_Descripcion = T000C29_n769TNov_Descripcion[0] ;
         A770TNov_Tipo = T000C29_A770TNov_Tipo[0] ;
         n770TNov_Tipo = T000C29_n770TNov_Tipo[0] ;
         A772TNov_Procedimiento = T000C29_A772TNov_Procedimiento[0] ;
         n772TNov_Procedimiento = T000C29_n772TNov_Procedimiento[0] ;
         A774TNov_Nombre_Campo = T000C29_A774TNov_Nombre_Campo[0] ;
         n774TNov_Nombre_Campo = T000C29_n774TNov_Nombre_Campo[0] ;
         pr_default.close(27);
         if ( GXutil.strcmp(A770TNov_Tipo, "P") == 0 )
         {
            divTabletransaccion_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, divTabletransaccion_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTabletransaccion_Visible, 5, 0)), true);
         }
         else
         {
            if ( GXutil.strcmp(A770TNov_Tipo, "P") != 0 )
            {
               divTabletransaccion_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, divTabletransaccion_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTabletransaccion_Visible, 5, 0)), true);
            }
         }
         if ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 )
         {
            edtNove_Consecutivo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_Consecutivo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_Consecutivo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
         }
         if ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 )
         {
            edtNove_Placa_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_Placa_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_Placa_Visible, 5, 0)), !bGXsfl_134_Refreshing);
         }
         if ( ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") != 0 ) )
         {
            edtNove_ValorAntiguo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorAntiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_ValorAntiguo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
         }
         if ( ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") != 0 ) && ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") != 0 ) )
         {
            edtNove_ValorNuevo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorNuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtNove_ValorNuevo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
         }
         if ( ( GXutil.strcmp(A770TNov_Tipo, "T") != 0 ) || ( ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") == 0 ) ) )
         {
            edtavNove_valorantiguo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavNove_valorantiguo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_valorantiguo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
         }
         if ( ( GXutil.strcmp(A770TNov_Tipo, "T") != 0 ) || ( ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_NumeroIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_FechaIngreso") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Tran_Observaciones") == 0 ) || ( GXutil.strcmp(A774TNov_Nombre_Campo, "Anulacion") == 0 ) ) )
         {
            edtavNove_valornuevo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavNove_valornuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_valornuevo_Visible, 5, 0)), !bGXsfl_134_Refreshing);
         }
         /* Using cursor T000C30 */
         pr_default.execute(28, new Object[] {new Boolean(n107Nove_TransId), new Long(A107Nove_TransId)});
         A814Nove_TranCC = T000C30_A814Nove_TranCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A814Nove_TranCC", GXutil.ltrim( GXutil.str( A814Nove_TranCC, 18, 0)));
         n814Nove_TranCC = T000C30_n814Nove_TranCC[0] ;
         A790Nove_ModuloOrigen = T000C30_A790Nove_ModuloOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
         n790Nove_ModuloOrigen = T000C30_n790Nove_ModuloOrigen[0] ;
         A791Nove_AlmaOrigen = T000C30_A791Nove_AlmaOrigen[0] ;
         n791Nove_AlmaOrigen = T000C30_n791Nove_AlmaOrigen[0] ;
         A792Nove_BodeOrigen = T000C30_A792Nove_BodeOrigen[0] ;
         n792Nove_BodeOrigen = T000C30_n792Nove_BodeOrigen[0] ;
         A796Nove_ModuloDestino = T000C30_A796Nove_ModuloDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
         n796Nove_ModuloDestino = T000C30_n796Nove_ModuloDestino[0] ;
         A797Nove_AlmaDestino = T000C30_A797Nove_AlmaDestino[0] ;
         n797Nove_AlmaDestino = T000C30_n797Nove_AlmaDestino[0] ;
         A798Nove_BodeDestino = T000C30_A798Nove_BodeDestino[0] ;
         n798Nove_BodeDestino = T000C30_n798Nove_BodeDestino[0] ;
         A785Nove_CentroId = T000C30_A785Nove_CentroId[0] ;
         n785Nove_CentroId = T000C30_n785Nove_CentroId[0] ;
         A782Nove_RegionId = T000C30_A782Nove_RegionId[0] ;
         n782Nove_RegionId = T000C30_n782Nove_RegionId[0] ;
         A788Nove_CodigoMovimiento = T000C30_A788Nove_CodigoMovimiento[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A788Nove_CodigoMovimiento", A788Nove_CodigoMovimiento);
         n788Nove_CodigoMovimiento = T000C30_n788Nove_CodigoMovimiento[0] ;
         A793Nove_CuentadanteIdOrigen = T000C30_A793Nove_CuentadanteIdOrigen[0] ;
         n793Nove_CuentadanteIdOrigen = T000C30_n793Nove_CuentadanteIdOrigen[0] ;
         A799Nove_CuentadanteIdDestino = T000C30_A799Nove_CuentadanteIdDestino[0] ;
         n799Nove_CuentadanteIdDestino = T000C30_n799Nove_CuentadanteIdDestino[0] ;
         pr_default.close(28);
         /* Using cursor T000C31 */
         pr_default.execute(29, new Object[] {new Boolean(n785Nove_CentroId), new Long(A785Nove_CentroId)});
         A786Nove_CentroCodigo = T000C31_A786Nove_CentroCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A786Nove_CentroCodigo", A786Nove_CentroCodigo);
         n786Nove_CentroCodigo = T000C31_n786Nove_CentroCodigo[0] ;
         A787Nove_CentroDescripcion = T000C31_A787Nove_CentroDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A787Nove_CentroDescripcion", A787Nove_CentroDescripcion);
         n787Nove_CentroDescripcion = T000C31_n787Nove_CentroDescripcion[0] ;
         pr_default.close(29);
         /* Using cursor T000C32 */
         pr_default.execute(30, new Object[] {new Boolean(n782Nove_RegionId), new Long(A782Nove_RegionId)});
         A783Nove_RegionCodigo = T000C32_A783Nove_RegionCodigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A783Nove_RegionCodigo", GXutil.ltrim( GXutil.str( A783Nove_RegionCodigo, 4, 0)));
         n783Nove_RegionCodigo = T000C32_n783Nove_RegionCodigo[0] ;
         A784Nove_RegionDescripcion = T000C32_A784Nove_RegionDescripcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A784Nove_RegionDescripcion", A784Nove_RegionDescripcion);
         n784Nove_RegionDescripcion = T000C32_n784Nove_RegionDescripcion[0] ;
         pr_default.close(30);
         /* Using cursor T000C33 */
         pr_default.execute(31, new Object[] {new Boolean(n788Nove_CodigoMovimiento), A788Nove_CodigoMovimiento});
         A789Nove_MovimientoDescrip = T000C33_A789Nove_MovimientoDescrip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A789Nove_MovimientoDescrip", A789Nove_MovimientoDescrip);
         n789Nove_MovimientoDescrip = T000C33_n789Nove_MovimientoDescrip[0] ;
         pr_default.close(31);
         /* Using cursor T000C34 */
         pr_default.execute(32, new Object[] {new Boolean(n793Nove_CuentadanteIdOrigen), new Long(A793Nove_CuentadanteIdOrigen)});
         A794Nove_CuentadanteCedOrigen = T000C34_A794Nove_CuentadanteCedOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794Nove_CuentadanteCedOrigen", GXutil.ltrim( GXutil.str( A794Nove_CuentadanteCedOrigen, 18, 0)));
         n794Nove_CuentadanteCedOrigen = T000C34_n794Nove_CuentadanteCedOrigen[0] ;
         A795Nove_CuentadanteNomOrigen = T000C34_A795Nove_CuentadanteNomOrigen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795Nove_CuentadanteNomOrigen", A795Nove_CuentadanteNomOrigen);
         n795Nove_CuentadanteNomOrigen = T000C34_n795Nove_CuentadanteNomOrigen[0] ;
         pr_default.close(32);
         /* Using cursor T000C35 */
         pr_default.execute(33, new Object[] {new Boolean(n799Nove_CuentadanteIdDestino), new Long(A799Nove_CuentadanteIdDestino)});
         A800Nove_CuentadanteCedDestino = T000C35_A800Nove_CuentadanteCedDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A800Nove_CuentadanteCedDestino", GXutil.ltrim( GXutil.str( A800Nove_CuentadanteCedDestino, 18, 0)));
         n800Nove_CuentadanteCedDestino = T000C35_n800Nove_CuentadanteCedDestino[0] ;
         A801Nove_CuentadanteNomDestino = T000C35_A801Nove_CuentadanteNomDestino[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A801Nove_CuentadanteNomDestino", A801Nove_CuentadanteNomDestino);
         n801Nove_CuentadanteNomDestino = T000C35_n801Nove_CuentadanteNomDestino[0] ;
         pr_default.close(33);
      }
   }

   public void processNestedLevel0C57( )
   {
      nGXsfl_134_idx = (short)(0) ;
      while ( nGXsfl_134_idx < nRC_GXsfl_134 )
      {
         readRow0C57( ) ;
         if ( ( nRcdExists_57 != 0 ) || ( nIsMod_57 != 0 ) )
         {
            standaloneNotModal0C57( ) ;
            getKey0C57( ) ;
            if ( ( nRcdExists_57 == 0 ) && ( nRcdDeleted_57 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
               insert0C57( ) ;
            }
            else
            {
               if ( RcdFound57 != 0 )
               {
                  if ( ( nRcdDeleted_57 != 0 ) && ( nRcdExists_57 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                     delete0C57( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_57 != 0 ) && ( nRcdExists_57 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
                        update0C57( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_57 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtNove_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A108Nove_Linea, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtNove_LineaTrn_Internalname, GXutil.ltrim( localUtil.ntoc( A806Nove_LineaTrn, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( edtNove_Consecutivo_Internalname, A807Nove_Consecutivo) ;
         httpContext.changePostValue( edtNove_Placa_Internalname, A810Nove_Placa) ;
         httpContext.changePostValue( edtNove_ValorAntiguo_Internalname, A811Nove_ValorAntiguo) ;
         httpContext.changePostValue( edtavNove_valorantiguo_Internalname, AV19Nove_ValorAntiguo) ;
         httpContext.changePostValue( edtNove_ValorNuevo_Internalname, A812Nove_ValorNuevo) ;
         httpContext.changePostValue( edtavNove_valornuevo_Internalname, AV20Nove_ValorNuevo) ;
         httpContext.changePostValue( "ZT_"+"Z108Nove_Linea_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z108Nove_Linea, (byte)(8), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z806Nove_LineaTrn_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( Z806Nove_LineaTrn, (byte)(18), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z807Nove_Consecutivo_"+sGXsfl_134_idx, Z807Nove_Consecutivo) ;
         httpContext.changePostValue( "ZT_"+"Z810Nove_Placa_"+sGXsfl_134_idx, Z810Nove_Placa) ;
         httpContext.changePostValue( "ZT_"+"Z811Nove_ValorAntiguo_"+sGXsfl_134_idx, Z811Nove_ValorAntiguo) ;
         httpContext.changePostValue( "ZT_"+"Z812Nove_ValorNuevo_"+sGXsfl_134_idx, Z812Nove_ValorNuevo) ;
         httpContext.changePostValue( "nRcdDeleted_57_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_57, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nRcdExists_57_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_57, (byte)(4), (byte)(0), ",", ""))) ;
         httpContext.changePostValue( "nIsMod_57_"+sGXsfl_134_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_57, (byte)(4), (byte)(0), ",", ""))) ;
         if ( nIsMod_57 != 0 )
         {
            httpContext.changePostValue( "NOVE_LINEA_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_Linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_LINEATRN_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_LineaTrn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_CONSECUTIVO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_Consecutivo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_CONSECUTIVO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtNove_Consecutivo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_PLACA_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_Placa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_PLACA_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtNove_Placa_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_ValorAntiguo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtNove_ValorAntiguo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vNOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavNove_valorantiguo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vNOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavNove_valorantiguo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_VALORNUEVO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_ValorNuevo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NOVE_VALORNUEVO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtNove_ValorNuevo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vNOVE_VALORNUEVO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavNove_valornuevo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "vNOVE_VALORNUEVO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavNove_valornuevo_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0C57( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_57 = (short)(0) ;
      nIsMod_57 = (short)(0) ;
      nRcdDeleted_57 = (short)(0) ;
   }

   public void processLevel0C56( )
   {
      /* Save parent mode. */
      sMode56 = Gx_mode ;
      processNestedLevel0C57( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode56 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      /* ' Update level parameters */
   }

   public void endLevel0C56( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0C56( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT",pr_default, "alm_novedad");
         if ( AnyError == 0 )
         {
            confirmValues0C0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT",pr_default, "alm_novedad");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0C56( )
   {
      /* Scan By routine */
      /* Using cursor T000C36 */
      pr_default.execute(34);
      RcdFound56 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound56 = (short)(1) ;
         A106Nove_Identificador = T000C36_A106Nove_Identificador[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0C56( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound56 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound56 = (short)(1) ;
         A106Nove_Identificador = T000C36_A106Nove_Identificador[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
      }
   }

   public void scanEnd0C56( )
   {
      pr_default.close(34);
   }

   public void afterConfirm0C56( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0C56( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0C56( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0C56( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0C56( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0C56( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0C56( )
   {
      edtNove_Identificador_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_Identificador_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Identificador_Enabled, 5, 0)), true);
      edtNove_FechaRegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_FechaRegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_FechaRegistro_Enabled, 5, 0)), true);
      edtTNov_Descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTNov_Descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTNov_Descripcion_Enabled, 5, 0)), true);
      edtNove_TranCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_TranCC_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_TranCC_Enabled, 5, 0)), true);
      edtNove_RegionCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_RegionCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_RegionCodigo_Enabled, 5, 0)), true);
      edtNove_RegionDescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_RegionDescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_RegionDescripcion_Enabled, 5, 0)), true);
      edtNove_CentroCodigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_CentroCodigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_CentroCodigo_Enabled, 5, 0)), true);
      edtNove_CentroDescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_CentroDescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_CentroDescripcion_Enabled, 5, 0)), true);
      edtNove_CodigoMovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_CodigoMovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_CodigoMovimiento_Enabled, 5, 0)), true);
      edtNove_MovimientoDescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_MovimientoDescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_MovimientoDescrip_Enabled, 5, 0)), true);
      edtNove_ModuloOrigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_ModuloOrigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_ModuloOrigen_Enabled, 5, 0)), true);
      edtavAlma_origendescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_origendescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_origendescrip_Enabled, 5, 0)), true);
      edtavBode_origendescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBode_origendescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBode_origendescrip_Enabled, 5, 0)), true);
      edtNove_CuentadanteCedOrigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_CuentadanteCedOrigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_CuentadanteCedOrigen_Enabled, 5, 0)), true);
      edtNove_CuentadanteNomOrigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_CuentadanteNomOrigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_CuentadanteNomOrigen_Enabled, 5, 0)), true);
      edtNove_ModuloDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_ModuloDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_ModuloDestino_Enabled, 5, 0)), true);
      edtavAlma_destidescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_destidescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_destidescrip_Enabled, 5, 0)), true);
      edtavBode_destidescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBode_destidescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavBode_destidescrip_Enabled, 5, 0)), true);
      edtNove_CuentadanteCedDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_CuentadanteCedDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_CuentadanteCedDestino_Enabled, 5, 0)), true);
      edtNove_CuentadanteNomDestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_CuentadanteNomDestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_CuentadanteNomDestino_Enabled, 5, 0)), true);
      edtNove_RespuestaProc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_RespuestaProc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_RespuestaProc_Enabled, 5, 0)), true);
      cmbNove_Masivo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbNove_Masivo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbNove_Masivo.getEnabled(), 5, 0)), true);
      edtNove_Observaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_Observaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Observaciones_Enabled, 5, 0)), true);
      edtNove_Soporte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Soporte_Enabled, 5, 0)), true);
   }

   public void zm0C57( int GX_JID )
   {
      if ( ( GX_JID == 29 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z806Nove_LineaTrn = T000C3_A806Nove_LineaTrn[0] ;
            Z807Nove_Consecutivo = T000C3_A807Nove_Consecutivo[0] ;
            Z810Nove_Placa = T000C3_A810Nove_Placa[0] ;
            Z811Nove_ValorAntiguo = T000C3_A811Nove_ValorAntiguo[0] ;
            Z812Nove_ValorNuevo = T000C3_A812Nove_ValorNuevo[0] ;
         }
         else
         {
            Z806Nove_LineaTrn = A806Nove_LineaTrn ;
            Z807Nove_Consecutivo = A807Nove_Consecutivo ;
            Z810Nove_Placa = A810Nove_Placa ;
            Z811Nove_ValorAntiguo = A811Nove_ValorAntiguo ;
            Z812Nove_ValorNuevo = A812Nove_ValorNuevo ;
         }
      }
      if ( GX_JID == -29 )
      {
         Z106Nove_Identificador = A106Nove_Identificador ;
         Z108Nove_Linea = A108Nove_Linea ;
         Z806Nove_LineaTrn = A806Nove_LineaTrn ;
         Z807Nove_Consecutivo = A807Nove_Consecutivo ;
         Z810Nove_Placa = A810Nove_Placa ;
         Z811Nove_ValorAntiguo = A811Nove_ValorAntiguo ;
         Z812Nove_ValorNuevo = A812Nove_ValorNuevo ;
      }
   }

   public void standaloneNotModal0C57( )
   {
      edtNove_Linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Linea_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
      edtNove_LineaTrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_LineaTrn_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_LineaTrn_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
   }

   public void standaloneModal0C57( )
   {
   }

   public void load0C57( )
   {
      /* Using cursor T000C37 */
      pr_default.execute(35, new Object[] {new Long(A106Nove_Identificador), new Integer(A108Nove_Linea)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound57 = (short)(1) ;
         A806Nove_LineaTrn = T000C37_A806Nove_LineaTrn[0] ;
         n806Nove_LineaTrn = T000C37_n806Nove_LineaTrn[0] ;
         A807Nove_Consecutivo = T000C37_A807Nove_Consecutivo[0] ;
         A810Nove_Placa = T000C37_A810Nove_Placa[0] ;
         A811Nove_ValorAntiguo = T000C37_A811Nove_ValorAntiguo[0] ;
         n811Nove_ValorAntiguo = T000C37_n811Nove_ValorAntiguo[0] ;
         A812Nove_ValorNuevo = T000C37_A812Nove_ValorNuevo[0] ;
         n812Nove_ValorNuevo = T000C37_n812Nove_ValorNuevo[0] ;
         zm0C57( -29) ;
      }
      pr_default.close(35);
      onLoadActions0C57( ) ;
   }

   public void onLoadActions0C57( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  && ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) )
      {
         GXv_int1[0] = A106Nove_Identificador ;
         GXv_char6[0] = A774TNov_Nombre_Campo ;
         GXv_char5[0] = A811Nove_ValorAntiguo ;
         GXv_char4[0] = A812Nove_ValorNuevo ;
         GXv_char3[0] = AV19Nove_ValorAntiguo ;
         GXv_char2[0] = AV20Nove_ValorNuevo ;
         new com.orions2.pvaloresnove(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         alm_novedad_impl.this.A106Nove_Identificador = GXv_int1[0] ;
         alm_novedad_impl.this.A774TNov_Nombre_Campo = GXv_char6[0] ;
         alm_novedad_impl.this.A811Nove_ValorAntiguo = GXv_char5[0] ;
         alm_novedad_impl.this.A812Nove_ValorNuevo = GXv_char4[0] ;
         alm_novedad_impl.this.AV19Nove_ValorAntiguo = GXv_char3[0] ;
         alm_novedad_impl.this.AV20Nove_ValorNuevo = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
      }
   }

   public void checkExtendedTable0C57( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0C57( ) ;
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  && ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) )
      {
         GXv_int1[0] = A106Nove_Identificador ;
         GXv_char6[0] = A774TNov_Nombre_Campo ;
         GXv_char5[0] = A811Nove_ValorAntiguo ;
         GXv_char4[0] = A812Nove_ValorNuevo ;
         GXv_char3[0] = AV19Nove_ValorAntiguo ;
         GXv_char2[0] = AV20Nove_ValorNuevo ;
         new com.orions2.pvaloresnove(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         alm_novedad_impl.this.A106Nove_Identificador = GXv_int1[0] ;
         alm_novedad_impl.this.A774TNov_Nombre_Campo = GXv_char6[0] ;
         alm_novedad_impl.this.A811Nove_ValorAntiguo = GXv_char5[0] ;
         alm_novedad_impl.this.A812Nove_ValorNuevo = GXv_char4[0] ;
         alm_novedad_impl.this.AV19Nove_ValorAntiguo = GXv_char3[0] ;
         alm_novedad_impl.this.AV20Nove_ValorNuevo = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
      }
   }

   public void closeExtendedTableCursors0C57( )
   {
   }

   public void enableDisable0C57( )
   {
   }

   public void getKey0C57( )
   {
      /* Using cursor T000C38 */
      pr_default.execute(36, new Object[] {new Long(A106Nove_Identificador), new Integer(A108Nove_Linea)});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound57 = (short)(1) ;
      }
      else
      {
         RcdFound57 = (short)(0) ;
      }
      pr_default.close(36);
   }

   public void getByPrimaryKey0C57( )
   {
      /* Using cursor T000C3 */
      pr_default.execute(1, new Object[] {new Long(A106Nove_Identificador), new Integer(A108Nove_Linea)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0C57( 29) ;
         RcdFound57 = (short)(1) ;
         initializeNonKey0C57( ) ;
         A108Nove_Linea = T000C3_A108Nove_Linea[0] ;
         A806Nove_LineaTrn = T000C3_A806Nove_LineaTrn[0] ;
         n806Nove_LineaTrn = T000C3_n806Nove_LineaTrn[0] ;
         A807Nove_Consecutivo = T000C3_A807Nove_Consecutivo[0] ;
         A810Nove_Placa = T000C3_A810Nove_Placa[0] ;
         A811Nove_ValorAntiguo = T000C3_A811Nove_ValorAntiguo[0] ;
         n811Nove_ValorAntiguo = T000C3_n811Nove_ValorAntiguo[0] ;
         A812Nove_ValorNuevo = T000C3_A812Nove_ValorNuevo[0] ;
         n812Nove_ValorNuevo = T000C3_n812Nove_ValorNuevo[0] ;
         Z106Nove_Identificador = A106Nove_Identificador ;
         Z108Nove_Linea = A108Nove_Linea ;
         sMode57 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         load0C57( ) ;
         Gx_mode = sMode57 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      else
      {
         RcdFound57 = (short)(0) ;
         initializeNonKey0C57( ) ;
         sMode57 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
         standaloneModal0C57( ) ;
         Gx_mode = sMode57 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0C57( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0C57( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000C2 */
         pr_default.execute(0, new Object[] {new Long(A106Nove_Identificador), new Integer(A108Nove_Linea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_NOVEDADDETALLE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z806Nove_LineaTrn != T000C2_A806Nove_LineaTrn[0] ) || ( GXutil.strcmp(Z807Nove_Consecutivo, T000C2_A807Nove_Consecutivo[0]) != 0 ) || ( GXutil.strcmp(Z810Nove_Placa, T000C2_A810Nove_Placa[0]) != 0 ) || ( GXutil.strcmp(Z811Nove_ValorAntiguo, T000C2_A811Nove_ValorAntiguo[0]) != 0 ) || ( GXutil.strcmp(Z812Nove_ValorNuevo, T000C2_A812Nove_ValorNuevo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"ALM_NOVEDADDETALLE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0C57( )
   {
      beforeValidate0C57( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C57( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0C57( 0) ;
         checkOptimisticConcurrency0C57( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C57( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0C57( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C39 */
                  pr_default.execute(37, new Object[] {new Long(A106Nove_Identificador), new Integer(A108Nove_Linea), new Boolean(n806Nove_LineaTrn), new Long(A806Nove_LineaTrn), A807Nove_Consecutivo, A810Nove_Placa, new Boolean(n811Nove_ValorAntiguo), A811Nove_ValorAntiguo, new Boolean(n812Nove_ValorNuevo), A812Nove_ValorNuevo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVEDADDETALLE") ;
                  if ( (pr_default.getStatus(37) == 1) )
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
            load0C57( ) ;
         }
         endLevel0C57( ) ;
      }
      closeExtendedTableCursors0C57( ) ;
   }

   public void update0C57( )
   {
      beforeValidate0C57( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C57( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C57( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C57( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0C57( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C40 */
                  pr_default.execute(38, new Object[] {new Boolean(n806Nove_LineaTrn), new Long(A806Nove_LineaTrn), A807Nove_Consecutivo, A810Nove_Placa, new Boolean(n811Nove_ValorAntiguo), A811Nove_ValorAntiguo, new Boolean(n812Nove_ValorNuevo), A812Nove_ValorNuevo, new Long(A106Nove_Identificador), new Integer(A108Nove_Linea)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVEDADDETALLE") ;
                  if ( (pr_default.getStatus(38) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"ALM_NOVEDADDETALLE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0C57( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0C57( ) ;
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
         endLevel0C57( ) ;
      }
      closeExtendedTableCursors0C57( ) ;
   }

   public void deferredUpdate0C57( )
   {
   }

   public void delete0C57( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      beforeValidate0C57( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C57( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0C57( ) ;
         afterConfirm0C57( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0C57( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000C41 */
               pr_default.execute(39, new Object[] {new Long(A106Nove_Identificador), new Integer(A108Nove_Linea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("ALM_NOVEDADDETALLE") ;
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
      sMode57 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      endLevel0C57( ) ;
      Gx_mode = sMode57 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
   }

   public void onDeleteControls0C57( )
   {
      standaloneModal0C57( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  && ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) )
         {
            GXv_int1[0] = A106Nove_Identificador ;
            GXv_char6[0] = A774TNov_Nombre_Campo ;
            GXv_char5[0] = A811Nove_ValorAntiguo ;
            GXv_char4[0] = A812Nove_ValorNuevo ;
            GXv_char3[0] = AV19Nove_ValorAntiguo ;
            GXv_char2[0] = AV20Nove_ValorNuevo ;
            new com.orions2.pvaloresnove(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
            alm_novedad_impl.this.A106Nove_Identificador = GXv_int1[0] ;
            alm_novedad_impl.this.A774TNov_Nombre_Campo = GXv_char6[0] ;
            alm_novedad_impl.this.A811Nove_ValorAntiguo = GXv_char5[0] ;
            alm_novedad_impl.this.A812Nove_ValorNuevo = GXv_char4[0] ;
            alm_novedad_impl.this.AV19Nove_ValorAntiguo = GXv_char3[0] ;
            alm_novedad_impl.this.AV20Nove_ValorNuevo = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
         }
      }
   }

   public void endLevel0C57( )
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

   public void scanStart0C57( )
   {
      /* Scan By routine */
      /* Using cursor T000C42 */
      pr_default.execute(40, new Object[] {new Long(A106Nove_Identificador)});
      RcdFound57 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound57 = (short)(1) ;
         A108Nove_Linea = T000C42_A108Nove_Linea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0C57( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound57 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound57 = (short)(1) ;
         A108Nove_Linea = T000C42_A108Nove_Linea[0] ;
      }
   }

   public void scanEnd0C57( )
   {
      pr_default.close(40);
   }

   public void afterConfirm0C57( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0C57( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0C57( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0C57( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0C57( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0C57( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0C57( )
   {
      edtNove_Linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Linea_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
      edtNove_LineaTrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_LineaTrn_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_LineaTrn_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
      edtNove_Consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_Consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Consecutivo_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
      edtNove_Placa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_Placa_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Placa_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
      edtNove_ValorAntiguo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorAntiguo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_ValorAntiguo_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
      edtavNove_valorantiguo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_valorantiguo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_valorantiguo_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
      edtNove_ValorNuevo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_ValorNuevo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_ValorNuevo_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
      edtavNove_valornuevo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_valornuevo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_valornuevo_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
   }

   public void subsflControlProps_13457( )
   {
      edtNove_Linea_Internalname = "NOVE_LINEA_"+sGXsfl_134_idx ;
      edtNove_LineaTrn_Internalname = "NOVE_LINEATRN_"+sGXsfl_134_idx ;
      edtNove_Consecutivo_Internalname = "NOVE_CONSECUTIVO_"+sGXsfl_134_idx ;
      edtNove_Placa_Internalname = "NOVE_PLACA_"+sGXsfl_134_idx ;
      edtNove_ValorAntiguo_Internalname = "NOVE_VALORANTIGUO_"+sGXsfl_134_idx ;
      edtavNove_valorantiguo_Internalname = "vNOVE_VALORANTIGUO_"+sGXsfl_134_idx ;
      edtNove_ValorNuevo_Internalname = "NOVE_VALORNUEVO_"+sGXsfl_134_idx ;
      edtavNove_valornuevo_Internalname = "vNOVE_VALORNUEVO_"+sGXsfl_134_idx ;
   }

   public void subsflControlProps_fel_13457( )
   {
      edtNove_Linea_Internalname = "NOVE_LINEA_"+sGXsfl_134_fel_idx ;
      edtNove_LineaTrn_Internalname = "NOVE_LINEATRN_"+sGXsfl_134_fel_idx ;
      edtNove_Consecutivo_Internalname = "NOVE_CONSECUTIVO_"+sGXsfl_134_fel_idx ;
      edtNove_Placa_Internalname = "NOVE_PLACA_"+sGXsfl_134_fel_idx ;
      edtNove_ValorAntiguo_Internalname = "NOVE_VALORANTIGUO_"+sGXsfl_134_fel_idx ;
      edtavNove_valorantiguo_Internalname = "vNOVE_VALORANTIGUO_"+sGXsfl_134_fel_idx ;
      edtNove_ValorNuevo_Internalname = "NOVE_VALORNUEVO_"+sGXsfl_134_fel_idx ;
      edtavNove_valornuevo_Internalname = "vNOVE_VALORNUEVO_"+sGXsfl_134_fel_idx ;
   }

   public void addRow0C57( )
   {
      nGXsfl_134_idx = (short)(nGXsfl_134_idx+1) ;
      sGXsfl_134_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_134_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_13457( ) ;
      sendRow0C57( ) ;
   }

   public void sendRow0C57( )
   {
      Gridalm_novedad_detalleRow = GXWebRow.GetNew(context) ;
      if ( subGridalm_novedad_detalle_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridalm_novedad_detalle_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridalm_novedad_detalle_Class, "") != 0 )
         {
            subGridalm_novedad_detalle_Linesclass = subGridalm_novedad_detalle_Class+"Odd" ;
         }
      }
      else if ( subGridalm_novedad_detalle_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridalm_novedad_detalle_Backstyle = (byte)(0) ;
         subGridalm_novedad_detalle_Backcolor = subGridalm_novedad_detalle_Allbackcolor ;
         if ( GXutil.strcmp(subGridalm_novedad_detalle_Class, "") != 0 )
         {
            subGridalm_novedad_detalle_Linesclass = subGridalm_novedad_detalle_Class+"Uniform" ;
         }
      }
      else if ( subGridalm_novedad_detalle_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridalm_novedad_detalle_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridalm_novedad_detalle_Class, "") != 0 )
         {
            subGridalm_novedad_detalle_Linesclass = subGridalm_novedad_detalle_Class+"Odd" ;
         }
         subGridalm_novedad_detalle_Backcolor = (int)(0x0) ;
      }
      else if ( subGridalm_novedad_detalle_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridalm_novedad_detalle_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_134_idx) % (2))) == 0 )
         {
            subGridalm_novedad_detalle_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_novedad_detalle_Class, "") != 0 )
            {
               subGridalm_novedad_detalle_Linesclass = subGridalm_novedad_detalle_Class+"Even" ;
            }
         }
         else
         {
            subGridalm_novedad_detalle_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridalm_novedad_detalle_Class, "") != 0 )
            {
               subGridalm_novedad_detalle_Linesclass = subGridalm_novedad_detalle_Class+"Odd" ;
            }
         }
      }
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('iif(',1),t('Gx_mode',23),t(=,10),t('''DSP''',3),t('OR',9),t('Gx_mode',23),t(=,10),t('''UPD''',3),t(',',7),t('""',3),t(',',7),t('"javascript:"',3),t(+,5),t('"gx.popup.openPrompt(''"',3),t(+,5),t('"com.orions2.gx01l1"',3),t(+,5),t('"'',["',3),t(+,5),t('"''"',3),t(+,5),t('strreplace(',1),t('ltrim(',1),t('ntoc(',1),t(106,2),t(',',7),t(11,3),t(',',7),t(0,3),t(',',7),t('"."',3),t(',',7),t('""',3),t(')',4),t(')',4),t(',',7),t('"''"',3),t(',',7),t('"\''"',3),t(')',4),t(+,5),t('"''"',3),t(+,5),t('","',3),t(+,5),t('"{Ctrl:gx.dom.el(''"',3),t(+,5),t('"NOVE_LINEA_"',3),t(+,5),t(sGXsfl_134_idx,23),t(+,5),t('"''), id:''"',3),t(+,5),t('"NOVE_LINEA_"',3),t(+,5),t(sGXsfl_134_idx,23),t(+,5),t('"''"',3),t(+,5),t('",IOType:''out''}"',3),t(+,5),t('"],"',3),t(+,5),t('"gx.dom.form()."',3),t(+,5),t('"nIsMod_57_"',3),t(+,5),t(sGXsfl_134_idx,23),t(+,5),t('","',3),t(+,5),t('"'''', false"',3),t(+,5),t('","',3),t(+,5),t('"false"',3),t(+,5),t('");"',3),t(')',4) ]
         Target    : [ t(prompt_106,3),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_novedad_detalleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_Linea_Internalname,GXutil.ltrim( localUtil.ntoc( A108Nove_Linea, (byte)(8), (byte)(0), ",", "")),((edtNove_Linea_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A108Nove_Linea), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A108Nove_Linea), "ZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_Linea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(0),new Integer(edtNove_Linea_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(134),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_novedad_detalleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_LineaTrn_Internalname,GXutil.ltrim( localUtil.ntoc( A806Nove_LineaTrn, (byte)(18), (byte)(0), ",", "")),((edtNove_LineaTrn_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A806Nove_LineaTrn), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A806Nove_LineaTrn), "ZZZZZZZZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_LineaTrn_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(0),new Integer(edtNove_LineaTrn_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(134),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_57_" + sGXsfl_134_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 137,'',false,'" + sGXsfl_134_idx + "',134)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_novedad_detalleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_Consecutivo_Internalname,A807Nove_Consecutivo,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,137);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtNove_Consecutivo_Visible),new Integer(edtNove_Consecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(134),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_57_" + sGXsfl_134_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 138,'',false,'" + sGXsfl_134_idx + "',134)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_novedad_detalleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_Placa_Internalname,A810Nove_Placa,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,138);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_Placa_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtNove_Placa_Visible),new Integer(edtNove_Placa_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(134),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_57_" + sGXsfl_134_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_134_idx + "',134)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_novedad_detalleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_ValorAntiguo_Internalname,A811Nove_ValorAntiguo,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_ValorAntiguo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtNove_ValorAntiguo_Visible),new Integer(edtNove_ValorAntiguo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(134),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_novedad_detalleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNove_valorantiguo_Internalname,AV19Nove_ValorAntiguo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavNove_valorantiguo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavNove_valorantiguo_Visible),new Integer(edtavNove_valorantiguo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(134),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_57_" + sGXsfl_134_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_134_idx + "',134)\"" ;
      ROClassString = "Attribute" ;
      Gridalm_novedad_detalleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_ValorNuevo_Internalname,A812Nove_ValorNuevo,"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_ValorNuevo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtNove_ValorNuevo_Visible),new Integer(edtNove_ValorNuevo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(134),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridalm_novedad_detalleRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNove_valornuevo_Internalname,AV20Nove_ValorNuevo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavNove_valornuevo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavNove_valornuevo_Visible),new Integer(edtavNove_valornuevo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(134),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      httpContext.ajax_sending_grid_row(Gridalm_novedad_detalleRow);
      GXCCtl = "Z108Nove_Linea_" + sGXsfl_134_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z108Nove_Linea, (byte)(8), (byte)(0), ",", "")));
      GXCCtl = "Z806Nove_LineaTrn_" + sGXsfl_134_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z806Nove_LineaTrn, (byte)(18), (byte)(0), ",", "")));
      GXCCtl = "Z807Nove_Consecutivo_" + sGXsfl_134_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z807Nove_Consecutivo);
      GXCCtl = "Z810Nove_Placa_" + sGXsfl_134_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z810Nove_Placa);
      GXCCtl = "Z811Nove_ValorAntiguo_" + sGXsfl_134_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z811Nove_ValorAntiguo);
      GXCCtl = "Z812Nove_ValorNuevo_" + sGXsfl_134_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z812Nove_ValorNuevo);
      GXCCtl = "nRcdDeleted_57_" + sGXsfl_134_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_57, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nRcdExists_57_" + sGXsfl_134_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_57, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "nIsMod_57_" + sGXsfl_134_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_57, (byte)(4), (byte)(0), ",", "")));
      GXCCtl = "vMODE_" + sGXsfl_134_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_134_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV10TrnContext);
      }
      GXCCtl = "vNOVE_IDENTIFICADOR_" + sGXsfl_134_idx ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV7Nove_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_LINEA"+"_"+sGXsfl_134_idx, getSecureSignedToken( sGXsfl_134_idx, localUtil.format( DecimalUtil.doubleToDec(A108Nove_Linea), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_LINEATRN"+"_"+sGXsfl_134_idx, getSecureSignedToken( sGXsfl_134_idx, localUtil.format( DecimalUtil.doubleToDec(A806Nove_LineaTrn), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_LINEA_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_Linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_LINEATRN_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_LineaTrn_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_CONSECUTIVO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_Consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_CONSECUTIVO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtNove_Consecutivo_Visible, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_PLACA_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_Placa_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_PLACA_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtNove_Placa_Visible, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_ValorAntiguo_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtNove_ValorAntiguo_Visible, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavNove_valorantiguo_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavNove_valorantiguo_Visible, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_VALORNUEVO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNove_ValorNuevo_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_VALORNUEVO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtNove_ValorNuevo_Visible, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNOVE_VALORNUEVO_"+sGXsfl_134_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavNove_valornuevo_Enabled, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNOVE_VALORNUEVO_"+sGXsfl_134_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtavNove_valornuevo_Visible, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridalm_novedad_detalleContainer.AddRow(Gridalm_novedad_detalleRow);
   }

   public void readRow0C57( )
   {
      nGXsfl_134_idx = (short)(nGXsfl_134_idx+1) ;
      sGXsfl_134_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_134_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_13457( ) ;
      edtNove_Linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_LINEA_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
      edtNove_LineaTrn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_LINEATRN_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
      edtNove_Consecutivo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_CONSECUTIVO_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
      edtNove_Consecutivo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_CONSECUTIVO_"+sGXsfl_134_idx+"Visible"), ",", ".")) ;
      edtNove_Placa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_PLACA_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
      edtNove_Placa_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_PLACA_"+sGXsfl_134_idx+"Visible"), ",", ".")) ;
      edtNove_ValorAntiguo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
      edtNove_ValorAntiguo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Visible"), ",", ".")) ;
      edtavNove_valorantiguo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
      edtavNove_valorantiguo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vNOVE_VALORANTIGUO_"+sGXsfl_134_idx+"Visible"), ",", ".")) ;
      edtNove_ValorNuevo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_VALORNUEVO_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
      edtNove_ValorNuevo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "NOVE_VALORNUEVO_"+sGXsfl_134_idx+"Visible"), ",", ".")) ;
      edtavNove_valornuevo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNOVE_VALORNUEVO_"+sGXsfl_134_idx+"Enabled"), ",", ".")) ;
      edtavNove_valornuevo_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "vNOVE_VALORNUEVO_"+sGXsfl_134_idx+"Visible"), ",", ".")) ;
      A108Nove_Linea = (int)(localUtil.ctol( httpContext.cgiGet( edtNove_Linea_Internalname), ",", ".")) ;
      A806Nove_LineaTrn = localUtil.ctol( httpContext.cgiGet( edtNove_LineaTrn_Internalname), ",", ".") ;
      n806Nove_LineaTrn = false ;
      A807Nove_Consecutivo = httpContext.cgiGet( edtNove_Consecutivo_Internalname) ;
      A810Nove_Placa = httpContext.cgiGet( edtNove_Placa_Internalname) ;
      A811Nove_ValorAntiguo = httpContext.cgiGet( edtNove_ValorAntiguo_Internalname) ;
      n811Nove_ValorAntiguo = false ;
      n811Nove_ValorAntiguo = ((GXutil.strcmp("", A811Nove_ValorAntiguo)==0) ? true : false) ;
      AV19Nove_ValorAntiguo = httpContext.cgiGet( edtavNove_valorantiguo_Internalname) ;
      A812Nove_ValorNuevo = httpContext.cgiGet( edtNove_ValorNuevo_Internalname) ;
      n812Nove_ValorNuevo = false ;
      n812Nove_ValorNuevo = ((GXutil.strcmp("", A812Nove_ValorNuevo)==0) ? true : false) ;
      AV20Nove_ValorNuevo = httpContext.cgiGet( edtavNove_valornuevo_Internalname) ;
      GXCCtl = "Z108Nove_Linea_" + sGXsfl_134_idx ;
      Z108Nove_Linea = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "Z806Nove_LineaTrn_" + sGXsfl_134_idx ;
      Z806Nove_LineaTrn = localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".") ;
      n806Nove_LineaTrn = ((0==A806Nove_LineaTrn) ? true : false) ;
      GXCCtl = "Z807Nove_Consecutivo_" + sGXsfl_134_idx ;
      Z807Nove_Consecutivo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z810Nove_Placa_" + sGXsfl_134_idx ;
      Z810Nove_Placa = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z811Nove_ValorAntiguo_" + sGXsfl_134_idx ;
      Z811Nove_ValorAntiguo = httpContext.cgiGet( GXCCtl) ;
      n811Nove_ValorAntiguo = ((GXutil.strcmp("", A811Nove_ValorAntiguo)==0) ? true : false) ;
      GXCCtl = "Z812Nove_ValorNuevo_" + sGXsfl_134_idx ;
      Z812Nove_ValorNuevo = httpContext.cgiGet( GXCCtl) ;
      n812Nove_ValorNuevo = ((GXutil.strcmp("", A812Nove_ValorNuevo)==0) ? true : false) ;
      GXCCtl = "nRcdDeleted_57_" + sGXsfl_134_idx ;
      nRcdDeleted_57 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nRcdExists_57_" + sGXsfl_134_idx ;
      nRcdExists_57 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
      GXCCtl = "nIsMod_57_" + sGXsfl_134_idx ;
      nIsMod_57 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ",", ".")) ;
   }

   public void assign_properties_default( )
   {
      defedtNove_LineaTrn_Enabled = edtNove_LineaTrn_Enabled ;
      defedtNove_Linea_Enabled = edtNove_Linea_Enabled ;
   }

   public void confirmValues0C0( )
   {
      nGXsfl_134_idx = (short)(0) ;
      sGXsfl_134_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_134_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_13457( ) ;
      while ( nGXsfl_134_idx < nRC_GXsfl_134 )
      {
         nGXsfl_134_idx = (short)(nGXsfl_134_idx+1) ;
         sGXsfl_134_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_134_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_13457( ) ;
         httpContext.changePostValue( "Z108Nove_Linea_"+sGXsfl_134_idx, httpContext.cgiGet( "ZT_"+"Z108Nove_Linea_"+sGXsfl_134_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z108Nove_Linea_"+sGXsfl_134_idx) ;
         httpContext.changePostValue( "Z806Nove_LineaTrn_"+sGXsfl_134_idx, httpContext.cgiGet( "ZT_"+"Z806Nove_LineaTrn_"+sGXsfl_134_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z806Nove_LineaTrn_"+sGXsfl_134_idx) ;
         httpContext.changePostValue( "Z807Nove_Consecutivo_"+sGXsfl_134_idx, httpContext.cgiGet( "ZT_"+"Z807Nove_Consecutivo_"+sGXsfl_134_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z807Nove_Consecutivo_"+sGXsfl_134_idx) ;
         httpContext.changePostValue( "Z810Nove_Placa_"+sGXsfl_134_idx, httpContext.cgiGet( "ZT_"+"Z810Nove_Placa_"+sGXsfl_134_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z810Nove_Placa_"+sGXsfl_134_idx) ;
         httpContext.changePostValue( "Z811Nove_ValorAntiguo_"+sGXsfl_134_idx, httpContext.cgiGet( "ZT_"+"Z811Nove_ValorAntiguo_"+sGXsfl_134_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z811Nove_ValorAntiguo_"+sGXsfl_134_idx) ;
         httpContext.changePostValue( "Z812Nove_ValorNuevo_"+sGXsfl_134_idx, httpContext.cgiGet( "ZT_"+"Z812Nove_ValorNuevo_"+sGXsfl_134_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z812Nove_ValorNuevo_"+sGXsfl_134_idx) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141415223");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.alm_novedad") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Nove_Identificador,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z106Nove_Identificador", GXutil.ltrim( localUtil.ntoc( Z106Nove_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z780Nove_FechaRegistro", localUtil.ttoc( Z780Nove_FechaRegistro, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z781Nove_UsuarioRegistro", GXutil.ltrim( localUtil.ntoc( Z781Nove_UsuarioRegistro, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z803Nove_Masivo", Z803Nove_Masivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z805Nove_RutaSoporte", Z805Nove_RutaSoporte);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z765Nove_Estado", GXutil.rtrim( Z765Nove_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z815Nove_RespuestaProc", Z815Nove_RespuestaProc);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z104TNov_Codigo", GXutil.ltrim( localUtil.ntoc( Z104TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Z107Nove_TransId", GXutil.ltrim( localUtil.ntoc( Z107Nove_TransId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_134", GXutil.ltrim( localUtil.ntoc( nGXsfl_134_idx, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N107Nove_TransId", GXutil.ltrim( localUtil.ntoc( A107Nove_TransId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "N104TNov_Codigo", GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNOVE_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( AV7Nove_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_NOVE_TRANSID", GXutil.ltrim( localUtil.ntoc( AV12Insert_Nove_TransId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_TRANSID", GXutil.ltrim( localUtil.ntoc( A107Nove_TransId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TNOV_CODIGO", GXutil.ltrim( localUtil.ntoc( AV13Insert_TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_CODIGO", GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_TIPO", A770TNov_Tipo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_NOMBRE_CAMPO", A774TNov_Nombre_Campo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_CENTROID", GXutil.ltrim( localUtil.ntoc( A785Nove_CentroId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_ALMAORIGEN", A791Nove_AlmaOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_BODEORIGEN", A792Nove_BodeOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_ALMADESTINO", A797Nove_AlmaDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_BODEDESTINO", A798Nove_BodeDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_USUARIOREGISTRO", GXutil.ltrim( localUtil.ntoc( A781Nove_UsuarioRegistro, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_RUTASOPORTE", A805Nove_RutaSoporte);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_ESTADO", GXutil.rtrim( A765Nove_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_PROCEDIMIENTO", A772TNov_Procedimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_REGIONID", GXutil.ltrim( localUtil.ntoc( A782Nove_RegionId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_CUENTADANTEIDORIGEN", GXutil.ltrim( localUtil.ntoc( A793Nove_CuentadanteIdOrigen, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_CUENTADANTEIDDESTINO", GXutil.ltrim( localUtil.ntoc( A799Nove_CuentadanteIdDestino, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV21Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOVE_IDENTIFICADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7Nove_Identificador), "ZZZZZZZZZZ9")));
      GXCCtlgxBlob = "NOVE_SOPORTE" + "_gxBlob" ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, A804Nove_Soporte);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_SOPORTE_Filename", GXutil.rtrim( edtNove_Soporte_Filename));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_SOPORTE_Filetype", GXutil.rtrim( edtNove_Soporte_Filetype));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "ALM_NOVEDAD" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( Gx_mode, "@!")) ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9") ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A805Nove_RutaSoporte, "")) ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( A765Nove_Estado, "")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("alm_novedad:[SendSecurityCheck]"+forbiddenHiddens);
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
      return formatLink("com.orions2.alm_novedad") + "?" + GXutil.URLEncode(GXutil.rtrim(Gx_mode)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV7Nove_Identificador,11,0))) ;
   }

   public String getPgmname( )
   {
      return "ALM_NOVEDAD" ;
   }

   public String getPgmdesc( )
   {
      return "Novedad" ;
   }

   public void initializeNonKey0C56( )
   {
      A107Nove_TransId = 0 ;
      n107Nove_TransId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A107Nove_TransId", GXutil.ltrim( GXutil.str( A107Nove_TransId, 11, 0)));
      A104TNov_Codigo = 0 ;
      n104TNov_Codigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A104TNov_Codigo", GXutil.ltrim( GXutil.str( A104TNov_Codigo, 6, 0)));
      AV17Bode_OrigenDescrip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Bode_OrigenDescrip", AV17Bode_OrigenDescrip);
      AV15Alma_OrigenDescrip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Alma_OrigenDescrip", AV15Alma_OrigenDescrip);
      AV18Bode_DestiDescrip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Bode_DestiDescrip", AV18Bode_DestiDescrip);
      AV16Alma_DestiDescrip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Alma_DestiDescrip", AV16Alma_DestiDescrip);
      A780Nove_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      n780Nove_FechaRegistro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A780Nove_FechaRegistro", localUtil.ttoc( A780Nove_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
      n780Nove_FechaRegistro = (GXutil.dateCompare(GXutil.nullDate(), A780Nove_FechaRegistro) ? true : false) ;
      A781Nove_UsuarioRegistro = 0 ;
      n781Nove_UsuarioRegistro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A781Nove_UsuarioRegistro", GXutil.ltrim( GXutil.str( A781Nove_UsuarioRegistro, 18, 0)));
      A814Nove_TranCC = 0 ;
      n814Nove_TranCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A814Nove_TranCC", GXutil.ltrim( GXutil.str( A814Nove_TranCC, 18, 0)));
      A782Nove_RegionId = 0 ;
      n782Nove_RegionId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A782Nove_RegionId", GXutil.ltrim( GXutil.str( A782Nove_RegionId, 11, 0)));
      A783Nove_RegionCodigo = (short)(0) ;
      n783Nove_RegionCodigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A783Nove_RegionCodigo", GXutil.ltrim( GXutil.str( A783Nove_RegionCodigo, 4, 0)));
      A784Nove_RegionDescripcion = "" ;
      n784Nove_RegionDescripcion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A784Nove_RegionDescripcion", A784Nove_RegionDescripcion);
      A785Nove_CentroId = 0 ;
      n785Nove_CentroId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
      A786Nove_CentroCodigo = "" ;
      n786Nove_CentroCodigo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A786Nove_CentroCodigo", A786Nove_CentroCodigo);
      A787Nove_CentroDescripcion = "" ;
      n787Nove_CentroDescripcion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A787Nove_CentroDescripcion", A787Nove_CentroDescripcion);
      A788Nove_CodigoMovimiento = "" ;
      n788Nove_CodigoMovimiento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A788Nove_CodigoMovimiento", A788Nove_CodigoMovimiento);
      A789Nove_MovimientoDescrip = "" ;
      n789Nove_MovimientoDescrip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A789Nove_MovimientoDescrip", A789Nove_MovimientoDescrip);
      A790Nove_ModuloOrigen = "" ;
      n790Nove_ModuloOrigen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
      A791Nove_AlmaOrigen = "" ;
      n791Nove_AlmaOrigen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A791Nove_AlmaOrigen", A791Nove_AlmaOrigen);
      A792Nove_BodeOrigen = "" ;
      n792Nove_BodeOrigen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A792Nove_BodeOrigen", A792Nove_BodeOrigen);
      A793Nove_CuentadanteIdOrigen = 0 ;
      n793Nove_CuentadanteIdOrigen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A793Nove_CuentadanteIdOrigen", GXutil.ltrim( GXutil.str( A793Nove_CuentadanteIdOrigen, 18, 0)));
      A794Nove_CuentadanteCedOrigen = 0 ;
      n794Nove_CuentadanteCedOrigen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794Nove_CuentadanteCedOrigen", GXutil.ltrim( GXutil.str( A794Nove_CuentadanteCedOrigen, 18, 0)));
      A795Nove_CuentadanteNomOrigen = "" ;
      n795Nove_CuentadanteNomOrigen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A795Nove_CuentadanteNomOrigen", A795Nove_CuentadanteNomOrigen);
      A796Nove_ModuloDestino = "" ;
      n796Nove_ModuloDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
      A797Nove_AlmaDestino = "" ;
      n797Nove_AlmaDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A797Nove_AlmaDestino", A797Nove_AlmaDestino);
      A798Nove_BodeDestino = "" ;
      n798Nove_BodeDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A798Nove_BodeDestino", A798Nove_BodeDestino);
      A799Nove_CuentadanteIdDestino = 0 ;
      n799Nove_CuentadanteIdDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A799Nove_CuentadanteIdDestino", GXutil.ltrim( GXutil.str( A799Nove_CuentadanteIdDestino, 18, 0)));
      A800Nove_CuentadanteCedDestino = 0 ;
      n800Nove_CuentadanteCedDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A800Nove_CuentadanteCedDestino", GXutil.ltrim( GXutil.str( A800Nove_CuentadanteCedDestino, 18, 0)));
      A801Nove_CuentadanteNomDestino = "" ;
      n801Nove_CuentadanteNomDestino = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A801Nove_CuentadanteNomDestino", A801Nove_CuentadanteNomDestino);
      A769TNov_Descripcion = "" ;
      n769TNov_Descripcion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A769TNov_Descripcion", A769TNov_Descripcion);
      A770TNov_Tipo = "" ;
      n770TNov_Tipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A770TNov_Tipo", A770TNov_Tipo);
      A772TNov_Procedimiento = "" ;
      n772TNov_Procedimiento = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A772TNov_Procedimiento", A772TNov_Procedimiento);
      A774TNov_Nombre_Campo = "" ;
      n774TNov_Nombre_Campo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
      A802Nove_Observaciones = "" ;
      n802Nove_Observaciones = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A802Nove_Observaciones", A802Nove_Observaciones);
      n802Nove_Observaciones = ((GXutil.strcmp("", A802Nove_Observaciones)==0) ? true : false) ;
      A803Nove_Masivo = "" ;
      n803Nove_Masivo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A803Nove_Masivo", A803Nove_Masivo);
      n803Nove_Masivo = ((GXutil.strcmp("", A803Nove_Masivo)==0) ? true : false) ;
      A804Nove_Soporte = "" ;
      n804Nove_Soporte = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A804Nove_Soporte", A804Nove_Soporte);
      httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), true);
      n804Nove_Soporte = ((GXutil.strcmp("", A804Nove_Soporte)==0) ? true : false) ;
      A805Nove_RutaSoporte = "" ;
      n805Nove_RutaSoporte = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A805Nove_RutaSoporte", A805Nove_RutaSoporte);
      A765Nove_Estado = "" ;
      n765Nove_Estado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A765Nove_Estado", A765Nove_Estado);
      A815Nove_RespuestaProc = "" ;
      n815Nove_RespuestaProc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A815Nove_RespuestaProc", A815Nove_RespuestaProc);
      n815Nove_RespuestaProc = ((GXutil.strcmp("", A815Nove_RespuestaProc)==0) ? true : false) ;
      Z780Nove_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      Z781Nove_UsuarioRegistro = 0 ;
      Z803Nove_Masivo = "" ;
      Z805Nove_RutaSoporte = "" ;
      Z765Nove_Estado = "" ;
      Z815Nove_RespuestaProc = "" ;
      Z104TNov_Codigo = 0 ;
      Z107Nove_TransId = 0 ;
   }

   public void initAll0C56( )
   {
      A106Nove_Identificador = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
      initializeNonKey0C56( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0C57( )
   {
      AV20Nove_ValorNuevo = "" ;
      AV19Nove_ValorAntiguo = "" ;
      A806Nove_LineaTrn = 0 ;
      n806Nove_LineaTrn = false ;
      A807Nove_Consecutivo = "" ;
      A810Nove_Placa = "" ;
      A811Nove_ValorAntiguo = "" ;
      n811Nove_ValorAntiguo = false ;
      A812Nove_ValorNuevo = "" ;
      n812Nove_ValorNuevo = false ;
      Z806Nove_LineaTrn = 0 ;
      Z807Nove_Consecutivo = "" ;
      Z810Nove_Placa = "" ;
      Z811Nove_ValorAntiguo = "" ;
      Z812Nove_ValorNuevo = "" ;
   }

   public void initAll0C57( )
   {
      A108Nove_Linea = 0 ;
      initializeNonKey0C57( ) ;
   }

   public void standaloneModalInsert0C57( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414152228");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("alm_novedad.js", "?201861414152228");
      /* End function include_jscripts */
   }

   public void init_level_properties57( )
   {
      edtNove_LineaTrn_Enabled = defedtNove_LineaTrn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_LineaTrn_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_LineaTrn_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
      edtNove_Linea_Enabled = defedtNove_Linea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtNove_Linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtNove_Linea_Enabled, 5, 0)), !bGXsfl_134_Refreshing);
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
      edtNove_Identificador_Internalname = "NOVE_IDENTIFICADOR" ;
      edtNove_FechaRegistro_Internalname = "NOVE_FECHAREGISTRO" ;
      edtTNov_Descripcion_Internalname = "TNOV_DESCRIPCION" ;
      edtNove_TranCC_Internalname = "NOVE_TRANCC" ;
      edtNove_RegionCodigo_Internalname = "NOVE_REGIONCODIGO" ;
      edtNove_RegionDescripcion_Internalname = "NOVE_REGIONDESCRIPCION" ;
      edtNove_CentroCodigo_Internalname = "NOVE_CENTROCODIGO" ;
      edtNove_CentroDescripcion_Internalname = "NOVE_CENTRODESCRIPCION" ;
      edtNove_CodigoMovimiento_Internalname = "NOVE_CODIGOMOVIMIENTO" ;
      edtNove_MovimientoDescrip_Internalname = "NOVE_MOVIMIENTODESCRIP" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtNove_ModuloOrigen_Internalname = "NOVE_MODULOORIGEN" ;
      edtavAlma_origendescrip_Internalname = "vALMA_ORIGENDESCRIP" ;
      edtavBode_origendescrip_Internalname = "vBODE_ORIGENDESCRIP" ;
      edtNove_CuentadanteCedOrigen_Internalname = "NOVE_CUENTADANTECEDORIGEN" ;
      edtNove_CuentadanteNomOrigen_Internalname = "NOVE_CUENTADANTENOMORIGEN" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtNove_ModuloDestino_Internalname = "NOVE_MODULODESTINO" ;
      edtavAlma_destidescrip_Internalname = "vALMA_DESTIDESCRIP" ;
      edtavBode_destidescrip_Internalname = "vBODE_DESTIDESCRIP" ;
      edtNove_CuentadanteCedDestino_Internalname = "NOVE_CUENTADANTECEDDESTINO" ;
      edtNove_CuentadanteNomDestino_Internalname = "NOVE_CUENTADANTENOMDESTINO" ;
      divTabletransaccion_Internalname = "TABLETRANSACCION" ;
      edtNove_RespuestaProc_Internalname = "NOVE_RESPUESTAPROC" ;
      cmbNove_Masivo.setInternalname( "NOVE_MASIVO" );
      edtNove_Observaciones_Internalname = "NOVE_OBSERVACIONES" ;
      edtNove_Soporte_Internalname = "NOVE_SOPORTE" ;
      divTable1_Internalname = "TABLE1" ;
      lblTitledetalle_Internalname = "TITLEDETALLE" ;
      edtNove_Linea_Internalname = "NOVE_LINEA" ;
      edtNove_LineaTrn_Internalname = "NOVE_LINEATRN" ;
      edtNove_Consecutivo_Internalname = "NOVE_CONSECUTIVO" ;
      edtNove_Placa_Internalname = "NOVE_PLACA" ;
      edtNove_ValorAntiguo_Internalname = "NOVE_VALORANTIGUO" ;
      edtavNove_valorantiguo_Internalname = "vNOVE_VALORANTIGUO" ;
      edtNove_ValorNuevo_Internalname = "NOVE_VALORNUEVO" ;
      edtavNove_valornuevo_Internalname = "vNOVE_VALORNUEVO" ;
      divDetalletable_Internalname = "DETALLETABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridalm_novedad_detalle_Internalname = "GRIDALM_NOVEDAD_DETALLE" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtNove_Soporte_Filename = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Novedad" );
      edtavNove_valornuevo_Jsonclick = "" ;
      edtNove_ValorNuevo_Jsonclick = "" ;
      edtavNove_valorantiguo_Jsonclick = "" ;
      edtNove_ValorAntiguo_Jsonclick = "" ;
      edtNove_Placa_Jsonclick = "" ;
      edtNove_Consecutivo_Jsonclick = "" ;
      edtNove_LineaTrn_Jsonclick = "" ;
      edtNove_Linea_Jsonclick = "" ;
      subGridalm_novedad_detalle_Class = "WorkWith" ;
      subGridalm_novedad_detalle_Backcolorstyle = (byte)(0) ;
      subGridalm_novedad_detalle_Allowcollapsing = (byte)(0) ;
      subGridalm_novedad_detalle_Allowselection = (byte)(0) ;
      edtavNove_valornuevo_Visible = -1 ;
      edtavNove_valornuevo_Enabled = 0 ;
      edtNove_ValorNuevo_Visible = -1 ;
      edtNove_ValorNuevo_Enabled = 1 ;
      edtavNove_valorantiguo_Visible = -1 ;
      edtavNove_valorantiguo_Enabled = 0 ;
      edtNove_ValorAntiguo_Visible = -1 ;
      edtNove_ValorAntiguo_Enabled = 1 ;
      edtNove_Placa_Visible = -1 ;
      edtNove_Placa_Enabled = 1 ;
      edtNove_Consecutivo_Visible = -1 ;
      edtNove_Consecutivo_Enabled = 1 ;
      edtNove_LineaTrn_Enabled = 0 ;
      edtNove_Linea_Enabled = 0 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtNove_Soporte_Jsonclick = "" ;
      edtNove_Soporte_Parameters = "" ;
      edtNove_Soporte_Contenttype = "" ;
      edtNove_Soporte_Filetype = "" ;
      edtNove_Soporte_Enabled = 1 ;
      edtNove_Observaciones_Enabled = 1 ;
      cmbNove_Masivo.setJsonclick( "" );
      cmbNove_Masivo.setEnabled( 1 );
      edtNove_RespuestaProc_Enabled = 1 ;
      edtNove_CuentadanteNomDestino_Jsonclick = "" ;
      edtNove_CuentadanteNomDestino_Enabled = 0 ;
      edtNove_CuentadanteCedDestino_Jsonclick = "" ;
      edtNove_CuentadanteCedDestino_Enabled = 0 ;
      edtavBode_destidescrip_Jsonclick = "" ;
      edtavBode_destidescrip_Enabled = 0 ;
      edtavAlma_destidescrip_Jsonclick = "" ;
      edtavAlma_destidescrip_Enabled = 0 ;
      edtNove_ModuloDestino_Jsonclick = "" ;
      edtNove_ModuloDestino_Enabled = 0 ;
      edtNove_CuentadanteNomOrigen_Jsonclick = "" ;
      edtNove_CuentadanteNomOrigen_Enabled = 0 ;
      edtNove_CuentadanteCedOrigen_Jsonclick = "" ;
      edtNove_CuentadanteCedOrigen_Enabled = 0 ;
      edtavBode_origendescrip_Jsonclick = "" ;
      edtavBode_origendescrip_Enabled = 0 ;
      edtavAlma_origendescrip_Jsonclick = "" ;
      edtavAlma_origendescrip_Enabled = 0 ;
      edtNove_ModuloOrigen_Jsonclick = "" ;
      edtNove_ModuloOrigen_Enabled = 0 ;
      edtNove_MovimientoDescrip_Jsonclick = "" ;
      edtNove_MovimientoDescrip_Enabled = 0 ;
      edtNove_CodigoMovimiento_Jsonclick = "" ;
      edtNove_CodigoMovimiento_Enabled = 0 ;
      edtNove_CentroDescripcion_Jsonclick = "" ;
      edtNove_CentroDescripcion_Enabled = 0 ;
      edtNove_CentroCodigo_Jsonclick = "" ;
      edtNove_CentroCodigo_Enabled = 0 ;
      edtNove_RegionDescripcion_Jsonclick = "" ;
      edtNove_RegionDescripcion_Enabled = 0 ;
      edtNove_RegionCodigo_Jsonclick = "" ;
      edtNove_RegionCodigo_Enabled = 0 ;
      edtNove_TranCC_Jsonclick = "" ;
      edtNove_TranCC_Enabled = 0 ;
      divTabletransaccion_Visible = 1 ;
      edtTNov_Descripcion_Enabled = 0 ;
      edtNove_FechaRegistro_Jsonclick = "" ;
      edtNove_FechaRegistro_Enabled = 1 ;
      edtNove_Identificador_Jsonclick = "" ;
      edtNove_Identificador_Enabled = 0 ;
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

   public void xc_16_0C56( String Gx_mode ,
                           long A785Nove_CentroId ,
                           String A790Nove_ModuloOrigen ,
                           String A791Nove_AlmaOrigen ,
                           String A792Nove_BodeOrigen ,
                           String AV15Alma_OrigenDescrip ,
                           String AV17Bode_OrigenDescrip )
   {
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  )
      {
         GXv_int1[0] = A785Nove_CentroId ;
         GXv_char6[0] = A790Nove_ModuloOrigen ;
         GXv_char5[0] = A791Nove_AlmaOrigen ;
         GXv_char4[0] = A792Nove_BodeOrigen ;
         GXv_char3[0] = AV15Alma_OrigenDescrip ;
         GXv_char2[0] = AV17Bode_OrigenDescrip ;
         new com.orions2.pbodegas(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         A785Nove_CentroId = GXv_int1[0] ;
         A790Nove_ModuloOrigen = GXv_char6[0] ;
         A791Nove_AlmaOrigen = GXv_char5[0] ;
         A792Nove_BodeOrigen = GXv_char4[0] ;
         AV15Alma_OrigenDescrip = GXv_char3[0] ;
         AV17Bode_OrigenDescrip = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A790Nove_ModuloOrigen", A790Nove_ModuloOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "A791Nove_AlmaOrigen", A791Nove_AlmaOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "A792Nove_BodeOrigen", A792Nove_BodeOrigen);
         httpContext.ajax_rsp_assign_attri("", false, "AV15Alma_OrigenDescrip", AV15Alma_OrigenDescrip);
         httpContext.ajax_rsp_assign_attri("", false, "AV17Bode_OrigenDescrip", AV17Bode_OrigenDescrip);
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A785Nove_CentroId, (byte)(11), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A790Nove_ModuloOrigen)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A791Nove_AlmaOrigen)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A792Nove_BodeOrigen)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV15Alma_OrigenDescrip)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV17Bode_OrigenDescrip)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_17_0C56( String Gx_mode ,
                           long A785Nove_CentroId ,
                           String A796Nove_ModuloDestino ,
                           String A797Nove_AlmaDestino ,
                           String A798Nove_BodeDestino ,
                           String AV16Alma_DestiDescrip ,
                           String AV18Bode_DestiDescrip )
   {
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  )
      {
         GXv_int1[0] = A785Nove_CentroId ;
         GXv_char6[0] = A796Nove_ModuloDestino ;
         GXv_char5[0] = A797Nove_AlmaDestino ;
         GXv_char4[0] = A798Nove_BodeDestino ;
         GXv_char3[0] = AV16Alma_DestiDescrip ;
         GXv_char2[0] = AV18Bode_DestiDescrip ;
         new com.orions2.pbodegas(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         A785Nove_CentroId = GXv_int1[0] ;
         A796Nove_ModuloDestino = GXv_char6[0] ;
         A797Nove_AlmaDestino = GXv_char5[0] ;
         A798Nove_BodeDestino = GXv_char4[0] ;
         AV16Alma_DestiDescrip = GXv_char3[0] ;
         AV18Bode_DestiDescrip = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A785Nove_CentroId", GXutil.ltrim( GXutil.str( A785Nove_CentroId, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A796Nove_ModuloDestino", A796Nove_ModuloDestino);
         httpContext.ajax_rsp_assign_attri("", false, "A797Nove_AlmaDestino", A797Nove_AlmaDestino);
         httpContext.ajax_rsp_assign_attri("", false, "A798Nove_BodeDestino", A798Nove_BodeDestino);
         httpContext.ajax_rsp_assign_attri("", false, "AV16Alma_DestiDescrip", AV16Alma_DestiDescrip);
         httpContext.ajax_rsp_assign_attri("", false, "AV18Bode_DestiDescrip", AV18Bode_DestiDescrip);
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A785Nove_CentroId, (byte)(11), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A796Nove_ModuloDestino)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A797Nove_AlmaDestino)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A798Nove_BodeDestino)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV16Alma_DestiDescrip)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV18Bode_DestiDescrip)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void xc_20_0C57( String Gx_mode ,
                           long A106Nove_Identificador ,
                           String A774TNov_Nombre_Campo ,
                           String A811Nove_ValorAntiguo ,
                           String A812Nove_ValorNuevo ,
                           String AV19Nove_ValorAntiguo ,
                           String AV20Nove_ValorNuevo ,
                           String A770TNov_Tipo )
   {
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  && ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) )
      {
         GXv_int1[0] = A106Nove_Identificador ;
         GXv_char6[0] = A774TNov_Nombre_Campo ;
         GXv_char5[0] = A811Nove_ValorAntiguo ;
         GXv_char4[0] = A812Nove_ValorNuevo ;
         GXv_char3[0] = AV19Nove_ValorAntiguo ;
         GXv_char2[0] = AV20Nove_ValorNuevo ;
         new com.orions2.pvaloresnove(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         A106Nove_Identificador = GXv_int1[0] ;
         A774TNov_Nombre_Campo = GXv_char6[0] ;
         A811Nove_ValorAntiguo = GXv_char5[0] ;
         A812Nove_ValorNuevo = GXv_char4[0] ;
         AV19Nove_ValorAntiguo = GXv_char3[0] ;
         AV20Nove_ValorNuevo = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A106Nove_Identificador", GXutil.ltrim( GXutil.str( A106Nove_Identificador, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "A774TNov_Nombre_Campo", A774TNov_Nombre_Campo);
      }
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A106Nove_Identificador, (byte)(11), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A774TNov_Nombre_Campo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A811Nove_ValorAntiguo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A812Nove_ValorNuevo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV19Nove_ValorAntiguo)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV20Nove_ValorNuevo)+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gxnrgridalm_novedad_detalle_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      subsflControlProps_13457( ) ;
      while ( nGXsfl_134_idx <= nRC_GXsfl_134 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0C57( ) ;
         standaloneModal0C57( ) ;
         cmbNove_Masivo.setName( "NOVE_MASIVO" );
         cmbNove_Masivo.setWebtags( "" );
         cmbNove_Masivo.addItem("", "", (short)(0));
         cmbNove_Masivo.addItem("SI", "SI", (short)(0));
         cmbNove_Masivo.addItem("NO", "NO", (short)(0));
         if ( cmbNove_Masivo.getItemCount() > 0 )
         {
            A803Nove_Masivo = cmbNove_Masivo.getValidValue(A803Nove_Masivo) ;
            n803Nove_Masivo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A803Nove_Masivo", A803Nove_Masivo);
         }
         dynload_actions( ) ;
         sendRow0C57( ) ;
         nGXsfl_134_idx = (short)(nGXsfl_134_idx+1) ;
         sGXsfl_134_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_134_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_13457( ) ;
      }
      httpContext.GX_webresponse.addString(Gridalm_novedad_detalleContainer.ToJavascriptSource());
      /* End function gxnrGridalm_novedad_detalle_newrow */
   }

   public void valid_Nove_codigomovimiento( String GX_Parm1 ,
                                            String GX_Parm2 )
   {
      A788Nove_CodigoMovimiento = GX_Parm1 ;
      n788Nove_CodigoMovimiento = false ;
      A789Nove_MovimientoDescrip = GX_Parm2 ;
      n789Nove_MovimientoDescrip = false ;
      /* Using cursor T000C33 */
      pr_default.execute(31, new Object[] {new Boolean(n788Nove_CodigoMovimiento), A788Nove_CodigoMovimiento});
      if ( (pr_default.getStatus(31) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A788Nove_CodigoMovimiento)==0) ) )
         {
            httpContext.GX_msglist.addItem("No existe 'TIPO DE MOVIMIENTO'.", "ForeignKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
      }
      A789Nove_MovimientoDescrip = T000C33_A789Nove_MovimientoDescrip[0] ;
      n789Nove_MovimientoDescrip = T000C33_n789Nove_MovimientoDescrip[0] ;
      pr_default.close(31);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A789Nove_MovimientoDescrip = "" ;
         n789Nove_MovimientoDescrip = false ;
      }
      isValidOutput.add(A789Nove_MovimientoDescrip);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Nove_valornuevo( String GX_Parm1 ,
                                      long GX_Parm2 ,
                                      String GX_Parm3 ,
                                      String GX_Parm4 ,
                                      String GX_Parm5 ,
                                      String GX_Parm6 ,
                                      String GX_Parm7 ,
                                      String GX_Parm8 )
   {
      Gx_mode = GX_Parm1 ;
      A106Nove_Identificador = GX_Parm2 ;
      A774TNov_Nombre_Campo = GX_Parm3 ;
      n774TNov_Nombre_Campo = false ;
      A811Nove_ValorAntiguo = GX_Parm4 ;
      n811Nove_ValorAntiguo = false ;
      A812Nove_ValorNuevo = GX_Parm5 ;
      n812Nove_ValorNuevo = false ;
      A770TNov_Tipo = GX_Parm6 ;
      n770TNov_Tipo = false ;
      AV20Nove_ValorNuevo = GX_Parm7 ;
      AV19Nove_ValorAntiguo = GX_Parm8 ;
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 )  || ( GXutil.strcmp(Gx_mode, "DSP") == 0 )  && ( GXutil.strcmp(A770TNov_Tipo, "T") == 0 ) )
      {
         GXv_int1[0] = A106Nove_Identificador ;
         GXv_char6[0] = A774TNov_Nombre_Campo ;
         GXv_char5[0] = A811Nove_ValorAntiguo ;
         GXv_char4[0] = A812Nove_ValorNuevo ;
         GXv_char3[0] = AV19Nove_ValorAntiguo ;
         GXv_char2[0] = AV20Nove_ValorNuevo ;
         new com.orions2.pvaloresnove(remoteHandle, context).execute( GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         alm_novedad_impl.this.A106Nove_Identificador = GXv_int1[0] ;
         A106Nove_Identificador = this.A106Nove_Identificador ;
         alm_novedad_impl.this.A774TNov_Nombre_Campo = GXv_char6[0] ;
         A774TNov_Nombre_Campo = this.A774TNov_Nombre_Campo ;
         alm_novedad_impl.this.A811Nove_ValorAntiguo = GXv_char5[0] ;
         A811Nove_ValorAntiguo = this.A811Nove_ValorAntiguo ;
         alm_novedad_impl.this.A812Nove_ValorNuevo = GXv_char4[0] ;
         A812Nove_ValorNuevo = this.A812Nove_ValorNuevo ;
         alm_novedad_impl.this.AV19Nove_ValorAntiguo = GXv_char3[0] ;
         AV19Nove_ValorAntiguo = this.AV19Nove_ValorAntiguo ;
         alm_novedad_impl.this.AV20Nove_ValorNuevo = GXv_char2[0] ;
         AV20Nove_ValorNuevo = this.AV20Nove_ValorNuevo ;
      }
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
         A774TNov_Nombre_Campo = "" ;
         n774TNov_Nombre_Campo = false ;
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A106Nove_Identificador, (byte)(11), (byte)(0), ".", "")));
      isValidOutput.add(A774TNov_Nombre_Campo);
      isValidOutput.add(A811Nove_ValorAntiguo);
      isValidOutput.add(A812Nove_ValorNuevo);
      isValidOutput.add(AV19Nove_ValorAntiguo);
      isValidOutput.add(AV20Nove_ValorNuevo);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV7Nove_Identificador',fld:'vNOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[],oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120C2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true,nv:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',nv:null}],oparms:[]}");
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
      pr_default.close(27);
      pr_default.close(28);
      pr_default.close(29);
      pr_default.close(30);
      pr_default.close(31);
      pr_default.close(32);
      pr_default.close(33);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      Z780Nove_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      Z803Nove_Masivo = "" ;
      Z805Nove_RutaSoporte = "" ;
      Z765Nove_Estado = "" ;
      Z815Nove_RespuestaProc = "" ;
      Z807Nove_Consecutivo = "" ;
      Z810Nove_Placa = "" ;
      Z811Nove_ValorAntiguo = "" ;
      Z812Nove_ValorNuevo = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A790Nove_ModuloOrigen = "" ;
      A791Nove_AlmaOrigen = "" ;
      A792Nove_BodeOrigen = "" ;
      AV15Alma_OrigenDescrip = "" ;
      AV17Bode_OrigenDescrip = "" ;
      A796Nove_ModuloDestino = "" ;
      A797Nove_AlmaDestino = "" ;
      A798Nove_BodeDestino = "" ;
      AV16Alma_DestiDescrip = "" ;
      AV18Bode_DestiDescrip = "" ;
      A774TNov_Nombre_Campo = "" ;
      A811Nove_ValorAntiguo = "" ;
      A812Nove_ValorNuevo = "" ;
      AV19Nove_ValorAntiguo = "" ;
      AV20Nove_ValorNuevo = "" ;
      A770TNov_Tipo = "" ;
      A788Nove_CodigoMovimiento = "" ;
      GXKey = "" ;
      A803Nove_Masivo = "" ;
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
      A780Nove_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A769TNov_Descripcion = "" ;
      A784Nove_RegionDescripcion = "" ;
      A786Nove_CentroCodigo = "" ;
      A787Nove_CentroDescripcion = "" ;
      A789Nove_MovimientoDescrip = "" ;
      lblTextblock1_Jsonclick = "" ;
      A795Nove_CuentadanteNomOrigen = "" ;
      lblTextblock2_Jsonclick = "" ;
      A801Nove_CuentadanteNomDestino = "" ;
      A815Nove_RespuestaProc = "" ;
      A802Nove_Observaciones = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      A804Nove_Soporte = "" ;
      lblTitledetalle_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridalm_novedad_detalleContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridalm_novedad_detalleColumn = new com.genexus.webpanels.GXWebColumn();
      A807Nove_Consecutivo = "" ;
      A810Nove_Placa = "" ;
      sMode57 = "" ;
      sStyleString = "" ;
      A805Nove_RutaSoporte = "" ;
      A765Nove_Estado = "" ;
      A772TNov_Procedimiento = "" ;
      AV21Pgmname = "" ;
      GXCCtlgxBlob = "" ;
      forbiddenHiddens = "" ;
      hsh = "" ;
      sMode56 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV10TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new com.orions2.SdtTransactionContext_Attribute(remoteHandle, context);
      Z802Nove_Observaciones = "" ;
      Z804Nove_Soporte = "" ;
      Z769TNov_Descripcion = "" ;
      Z770TNov_Tipo = "" ;
      Z772TNov_Procedimiento = "" ;
      Z774TNov_Nombre_Campo = "" ;
      Z790Nove_ModuloOrigen = "" ;
      Z791Nove_AlmaOrigen = "" ;
      Z792Nove_BodeOrigen = "" ;
      Z796Nove_ModuloDestino = "" ;
      Z797Nove_AlmaDestino = "" ;
      Z798Nove_BodeDestino = "" ;
      Z788Nove_CodigoMovimiento = "" ;
      Z786Nove_CentroCodigo = "" ;
      Z787Nove_CentroDescripcion = "" ;
      Z784Nove_RegionDescripcion = "" ;
      Z789Nove_MovimientoDescrip = "" ;
      Z795Nove_CuentadanteNomOrigen = "" ;
      Z801Nove_CuentadanteNomDestino = "" ;
      T000C6_A769TNov_Descripcion = new String[] {""} ;
      T000C6_n769TNov_Descripcion = new boolean[] {false} ;
      T000C6_A770TNov_Tipo = new String[] {""} ;
      T000C6_n770TNov_Tipo = new boolean[] {false} ;
      T000C6_A772TNov_Procedimiento = new String[] {""} ;
      T000C6_n772TNov_Procedimiento = new boolean[] {false} ;
      T000C6_A774TNov_Nombre_Campo = new String[] {""} ;
      T000C6_n774TNov_Nombre_Campo = new boolean[] {false} ;
      T000C7_A814Nove_TranCC = new long[1] ;
      T000C7_n814Nove_TranCC = new boolean[] {false} ;
      T000C7_A790Nove_ModuloOrigen = new String[] {""} ;
      T000C7_n790Nove_ModuloOrigen = new boolean[] {false} ;
      T000C7_A791Nove_AlmaOrigen = new String[] {""} ;
      T000C7_n791Nove_AlmaOrigen = new boolean[] {false} ;
      T000C7_A792Nove_BodeOrigen = new String[] {""} ;
      T000C7_n792Nove_BodeOrigen = new boolean[] {false} ;
      T000C7_A796Nove_ModuloDestino = new String[] {""} ;
      T000C7_n796Nove_ModuloDestino = new boolean[] {false} ;
      T000C7_A797Nove_AlmaDestino = new String[] {""} ;
      T000C7_n797Nove_AlmaDestino = new boolean[] {false} ;
      T000C7_A798Nove_BodeDestino = new String[] {""} ;
      T000C7_n798Nove_BodeDestino = new boolean[] {false} ;
      T000C7_A785Nove_CentroId = new long[1] ;
      T000C7_n785Nove_CentroId = new boolean[] {false} ;
      T000C7_A782Nove_RegionId = new long[1] ;
      T000C7_n782Nove_RegionId = new boolean[] {false} ;
      T000C7_A788Nove_CodigoMovimiento = new String[] {""} ;
      T000C7_n788Nove_CodigoMovimiento = new boolean[] {false} ;
      T000C7_A793Nove_CuentadanteIdOrigen = new long[1] ;
      T000C7_n793Nove_CuentadanteIdOrigen = new boolean[] {false} ;
      T000C7_A799Nove_CuentadanteIdDestino = new long[1] ;
      T000C7_n799Nove_CuentadanteIdDestino = new boolean[] {false} ;
      T000C8_A786Nove_CentroCodigo = new String[] {""} ;
      T000C8_n786Nove_CentroCodigo = new boolean[] {false} ;
      T000C8_A787Nove_CentroDescripcion = new String[] {""} ;
      T000C8_n787Nove_CentroDescripcion = new boolean[] {false} ;
      T000C9_A783Nove_RegionCodigo = new short[1] ;
      T000C9_n783Nove_RegionCodigo = new boolean[] {false} ;
      T000C9_A784Nove_RegionDescripcion = new String[] {""} ;
      T000C9_n784Nove_RegionDescripcion = new boolean[] {false} ;
      T000C10_A789Nove_MovimientoDescrip = new String[] {""} ;
      T000C10_n789Nove_MovimientoDescrip = new boolean[] {false} ;
      T000C11_A794Nove_CuentadanteCedOrigen = new long[1] ;
      T000C11_n794Nove_CuentadanteCedOrigen = new boolean[] {false} ;
      T000C11_A795Nove_CuentadanteNomOrigen = new String[] {""} ;
      T000C11_n795Nove_CuentadanteNomOrigen = new boolean[] {false} ;
      T000C12_A800Nove_CuentadanteCedDestino = new long[1] ;
      T000C12_n800Nove_CuentadanteCedDestino = new boolean[] {false} ;
      T000C12_A801Nove_CuentadanteNomDestino = new String[] {""} ;
      T000C12_n801Nove_CuentadanteNomDestino = new boolean[] {false} ;
      T000C13_A802Nove_Observaciones = new String[] {""} ;
      T000C13_n802Nove_Observaciones = new boolean[] {false} ;
      T000C13_A106Nove_Identificador = new long[1] ;
      T000C13_A780Nove_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      T000C13_n780Nove_FechaRegistro = new boolean[] {false} ;
      T000C13_A781Nove_UsuarioRegistro = new long[1] ;
      T000C13_n781Nove_UsuarioRegistro = new boolean[] {false} ;
      T000C13_A814Nove_TranCC = new long[1] ;
      T000C13_n814Nove_TranCC = new boolean[] {false} ;
      T000C13_A783Nove_RegionCodigo = new short[1] ;
      T000C13_n783Nove_RegionCodigo = new boolean[] {false} ;
      T000C13_A784Nove_RegionDescripcion = new String[] {""} ;
      T000C13_n784Nove_RegionDescripcion = new boolean[] {false} ;
      T000C13_A786Nove_CentroCodigo = new String[] {""} ;
      T000C13_n786Nove_CentroCodigo = new boolean[] {false} ;
      T000C13_A787Nove_CentroDescripcion = new String[] {""} ;
      T000C13_n787Nove_CentroDescripcion = new boolean[] {false} ;
      T000C13_A789Nove_MovimientoDescrip = new String[] {""} ;
      T000C13_n789Nove_MovimientoDescrip = new boolean[] {false} ;
      T000C13_A790Nove_ModuloOrigen = new String[] {""} ;
      T000C13_n790Nove_ModuloOrigen = new boolean[] {false} ;
      T000C13_A791Nove_AlmaOrigen = new String[] {""} ;
      T000C13_n791Nove_AlmaOrigen = new boolean[] {false} ;
      T000C13_A792Nove_BodeOrigen = new String[] {""} ;
      T000C13_n792Nove_BodeOrigen = new boolean[] {false} ;
      T000C13_A794Nove_CuentadanteCedOrigen = new long[1] ;
      T000C13_n794Nove_CuentadanteCedOrigen = new boolean[] {false} ;
      T000C13_A795Nove_CuentadanteNomOrigen = new String[] {""} ;
      T000C13_n795Nove_CuentadanteNomOrigen = new boolean[] {false} ;
      T000C13_A796Nove_ModuloDestino = new String[] {""} ;
      T000C13_n796Nove_ModuloDestino = new boolean[] {false} ;
      T000C13_A797Nove_AlmaDestino = new String[] {""} ;
      T000C13_n797Nove_AlmaDestino = new boolean[] {false} ;
      T000C13_A798Nove_BodeDestino = new String[] {""} ;
      T000C13_n798Nove_BodeDestino = new boolean[] {false} ;
      T000C13_A800Nove_CuentadanteCedDestino = new long[1] ;
      T000C13_n800Nove_CuentadanteCedDestino = new boolean[] {false} ;
      T000C13_A801Nove_CuentadanteNomDestino = new String[] {""} ;
      T000C13_n801Nove_CuentadanteNomDestino = new boolean[] {false} ;
      T000C13_A769TNov_Descripcion = new String[] {""} ;
      T000C13_n769TNov_Descripcion = new boolean[] {false} ;
      T000C13_A770TNov_Tipo = new String[] {""} ;
      T000C13_n770TNov_Tipo = new boolean[] {false} ;
      T000C13_A772TNov_Procedimiento = new String[] {""} ;
      T000C13_n772TNov_Procedimiento = new boolean[] {false} ;
      T000C13_A774TNov_Nombre_Campo = new String[] {""} ;
      T000C13_n774TNov_Nombre_Campo = new boolean[] {false} ;
      T000C13_A803Nove_Masivo = new String[] {""} ;
      T000C13_n803Nove_Masivo = new boolean[] {false} ;
      T000C13_A804Nove_Soporte = new String[] {""} ;
      T000C13_n804Nove_Soporte = new boolean[] {false} ;
      T000C13_A805Nove_RutaSoporte = new String[] {""} ;
      T000C13_n805Nove_RutaSoporte = new boolean[] {false} ;
      T000C13_A765Nove_Estado = new String[] {""} ;
      T000C13_n765Nove_Estado = new boolean[] {false} ;
      T000C13_A815Nove_RespuestaProc = new String[] {""} ;
      T000C13_n815Nove_RespuestaProc = new boolean[] {false} ;
      T000C13_A104TNov_Codigo = new int[1] ;
      T000C13_n104TNov_Codigo = new boolean[] {false} ;
      T000C13_A107Nove_TransId = new long[1] ;
      T000C13_n107Nove_TransId = new boolean[] {false} ;
      T000C13_A785Nove_CentroId = new long[1] ;
      T000C13_n785Nove_CentroId = new boolean[] {false} ;
      T000C13_A782Nove_RegionId = new long[1] ;
      T000C13_n782Nove_RegionId = new boolean[] {false} ;
      T000C13_A788Nove_CodigoMovimiento = new String[] {""} ;
      T000C13_n788Nove_CodigoMovimiento = new boolean[] {false} ;
      T000C13_A793Nove_CuentadanteIdOrigen = new long[1] ;
      T000C13_n793Nove_CuentadanteIdOrigen = new boolean[] {false} ;
      T000C13_A799Nove_CuentadanteIdDestino = new long[1] ;
      T000C13_n799Nove_CuentadanteIdDestino = new boolean[] {false} ;
      T000C14_A769TNov_Descripcion = new String[] {""} ;
      T000C14_n769TNov_Descripcion = new boolean[] {false} ;
      T000C14_A770TNov_Tipo = new String[] {""} ;
      T000C14_n770TNov_Tipo = new boolean[] {false} ;
      T000C14_A772TNov_Procedimiento = new String[] {""} ;
      T000C14_n772TNov_Procedimiento = new boolean[] {false} ;
      T000C14_A774TNov_Nombre_Campo = new String[] {""} ;
      T000C14_n774TNov_Nombre_Campo = new boolean[] {false} ;
      T000C15_A814Nove_TranCC = new long[1] ;
      T000C15_n814Nove_TranCC = new boolean[] {false} ;
      T000C15_A790Nove_ModuloOrigen = new String[] {""} ;
      T000C15_n790Nove_ModuloOrigen = new boolean[] {false} ;
      T000C15_A791Nove_AlmaOrigen = new String[] {""} ;
      T000C15_n791Nove_AlmaOrigen = new boolean[] {false} ;
      T000C15_A792Nove_BodeOrigen = new String[] {""} ;
      T000C15_n792Nove_BodeOrigen = new boolean[] {false} ;
      T000C15_A796Nove_ModuloDestino = new String[] {""} ;
      T000C15_n796Nove_ModuloDestino = new boolean[] {false} ;
      T000C15_A797Nove_AlmaDestino = new String[] {""} ;
      T000C15_n797Nove_AlmaDestino = new boolean[] {false} ;
      T000C15_A798Nove_BodeDestino = new String[] {""} ;
      T000C15_n798Nove_BodeDestino = new boolean[] {false} ;
      T000C15_A785Nove_CentroId = new long[1] ;
      T000C15_n785Nove_CentroId = new boolean[] {false} ;
      T000C15_A782Nove_RegionId = new long[1] ;
      T000C15_n782Nove_RegionId = new boolean[] {false} ;
      T000C15_A788Nove_CodigoMovimiento = new String[] {""} ;
      T000C15_n788Nove_CodigoMovimiento = new boolean[] {false} ;
      T000C15_A793Nove_CuentadanteIdOrigen = new long[1] ;
      T000C15_n793Nove_CuentadanteIdOrigen = new boolean[] {false} ;
      T000C15_A799Nove_CuentadanteIdDestino = new long[1] ;
      T000C15_n799Nove_CuentadanteIdDestino = new boolean[] {false} ;
      T000C16_A786Nove_CentroCodigo = new String[] {""} ;
      T000C16_n786Nove_CentroCodigo = new boolean[] {false} ;
      T000C16_A787Nove_CentroDescripcion = new String[] {""} ;
      T000C16_n787Nove_CentroDescripcion = new boolean[] {false} ;
      T000C17_A783Nove_RegionCodigo = new short[1] ;
      T000C17_n783Nove_RegionCodigo = new boolean[] {false} ;
      T000C17_A784Nove_RegionDescripcion = new String[] {""} ;
      T000C17_n784Nove_RegionDescripcion = new boolean[] {false} ;
      T000C18_A789Nove_MovimientoDescrip = new String[] {""} ;
      T000C18_n789Nove_MovimientoDescrip = new boolean[] {false} ;
      T000C19_A794Nove_CuentadanteCedOrigen = new long[1] ;
      T000C19_n794Nove_CuentadanteCedOrigen = new boolean[] {false} ;
      T000C19_A795Nove_CuentadanteNomOrigen = new String[] {""} ;
      T000C19_n795Nove_CuentadanteNomOrigen = new boolean[] {false} ;
      T000C20_A800Nove_CuentadanteCedDestino = new long[1] ;
      T000C20_n800Nove_CuentadanteCedDestino = new boolean[] {false} ;
      T000C20_A801Nove_CuentadanteNomDestino = new String[] {""} ;
      T000C20_n801Nove_CuentadanteNomDestino = new boolean[] {false} ;
      T000C21_A106Nove_Identificador = new long[1] ;
      T000C5_A802Nove_Observaciones = new String[] {""} ;
      T000C5_n802Nove_Observaciones = new boolean[] {false} ;
      T000C5_A106Nove_Identificador = new long[1] ;
      T000C5_A780Nove_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      T000C5_n780Nove_FechaRegistro = new boolean[] {false} ;
      T000C5_A781Nove_UsuarioRegistro = new long[1] ;
      T000C5_n781Nove_UsuarioRegistro = new boolean[] {false} ;
      T000C5_A803Nove_Masivo = new String[] {""} ;
      T000C5_n803Nove_Masivo = new boolean[] {false} ;
      T000C5_A804Nove_Soporte = new String[] {""} ;
      T000C5_n804Nove_Soporte = new boolean[] {false} ;
      T000C5_A805Nove_RutaSoporte = new String[] {""} ;
      T000C5_n805Nove_RutaSoporte = new boolean[] {false} ;
      T000C5_A765Nove_Estado = new String[] {""} ;
      T000C5_n765Nove_Estado = new boolean[] {false} ;
      T000C5_A815Nove_RespuestaProc = new String[] {""} ;
      T000C5_n815Nove_RespuestaProc = new boolean[] {false} ;
      T000C5_A104TNov_Codigo = new int[1] ;
      T000C5_n104TNov_Codigo = new boolean[] {false} ;
      T000C5_A107Nove_TransId = new long[1] ;
      T000C5_n107Nove_TransId = new boolean[] {false} ;
      T000C22_A106Nove_Identificador = new long[1] ;
      T000C23_A106Nove_Identificador = new long[1] ;
      T000C4_A802Nove_Observaciones = new String[] {""} ;
      T000C4_n802Nove_Observaciones = new boolean[] {false} ;
      T000C4_A106Nove_Identificador = new long[1] ;
      T000C4_A780Nove_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      T000C4_n780Nove_FechaRegistro = new boolean[] {false} ;
      T000C4_A781Nove_UsuarioRegistro = new long[1] ;
      T000C4_n781Nove_UsuarioRegistro = new boolean[] {false} ;
      T000C4_A803Nove_Masivo = new String[] {""} ;
      T000C4_n803Nove_Masivo = new boolean[] {false} ;
      T000C4_A804Nove_Soporte = new String[] {""} ;
      T000C4_n804Nove_Soporte = new boolean[] {false} ;
      T000C4_A805Nove_RutaSoporte = new String[] {""} ;
      T000C4_n805Nove_RutaSoporte = new boolean[] {false} ;
      T000C4_A765Nove_Estado = new String[] {""} ;
      T000C4_n765Nove_Estado = new boolean[] {false} ;
      T000C4_A815Nove_RespuestaProc = new String[] {""} ;
      T000C4_n815Nove_RespuestaProc = new boolean[] {false} ;
      T000C4_A104TNov_Codigo = new int[1] ;
      T000C4_n104TNov_Codigo = new boolean[] {false} ;
      T000C4_A107Nove_TransId = new long[1] ;
      T000C4_n107Nove_TransId = new boolean[] {false} ;
      T000C25_A106Nove_Identificador = new long[1] ;
      T000C29_A769TNov_Descripcion = new String[] {""} ;
      T000C29_n769TNov_Descripcion = new boolean[] {false} ;
      T000C29_A770TNov_Tipo = new String[] {""} ;
      T000C29_n770TNov_Tipo = new boolean[] {false} ;
      T000C29_A772TNov_Procedimiento = new String[] {""} ;
      T000C29_n772TNov_Procedimiento = new boolean[] {false} ;
      T000C29_A774TNov_Nombre_Campo = new String[] {""} ;
      T000C29_n774TNov_Nombre_Campo = new boolean[] {false} ;
      T000C30_A814Nove_TranCC = new long[1] ;
      T000C30_n814Nove_TranCC = new boolean[] {false} ;
      T000C30_A790Nove_ModuloOrigen = new String[] {""} ;
      T000C30_n790Nove_ModuloOrigen = new boolean[] {false} ;
      T000C30_A791Nove_AlmaOrigen = new String[] {""} ;
      T000C30_n791Nove_AlmaOrigen = new boolean[] {false} ;
      T000C30_A792Nove_BodeOrigen = new String[] {""} ;
      T000C30_n792Nove_BodeOrigen = new boolean[] {false} ;
      T000C30_A796Nove_ModuloDestino = new String[] {""} ;
      T000C30_n796Nove_ModuloDestino = new boolean[] {false} ;
      T000C30_A797Nove_AlmaDestino = new String[] {""} ;
      T000C30_n797Nove_AlmaDestino = new boolean[] {false} ;
      T000C30_A798Nove_BodeDestino = new String[] {""} ;
      T000C30_n798Nove_BodeDestino = new boolean[] {false} ;
      T000C30_A785Nove_CentroId = new long[1] ;
      T000C30_n785Nove_CentroId = new boolean[] {false} ;
      T000C30_A782Nove_RegionId = new long[1] ;
      T000C30_n782Nove_RegionId = new boolean[] {false} ;
      T000C30_A788Nove_CodigoMovimiento = new String[] {""} ;
      T000C30_n788Nove_CodigoMovimiento = new boolean[] {false} ;
      T000C30_A793Nove_CuentadanteIdOrigen = new long[1] ;
      T000C30_n793Nove_CuentadanteIdOrigen = new boolean[] {false} ;
      T000C30_A799Nove_CuentadanteIdDestino = new long[1] ;
      T000C30_n799Nove_CuentadanteIdDestino = new boolean[] {false} ;
      T000C31_A786Nove_CentroCodigo = new String[] {""} ;
      T000C31_n786Nove_CentroCodigo = new boolean[] {false} ;
      T000C31_A787Nove_CentroDescripcion = new String[] {""} ;
      T000C31_n787Nove_CentroDescripcion = new boolean[] {false} ;
      T000C32_A783Nove_RegionCodigo = new short[1] ;
      T000C32_n783Nove_RegionCodigo = new boolean[] {false} ;
      T000C32_A784Nove_RegionDescripcion = new String[] {""} ;
      T000C32_n784Nove_RegionDescripcion = new boolean[] {false} ;
      T000C33_A789Nove_MovimientoDescrip = new String[] {""} ;
      T000C33_n789Nove_MovimientoDescrip = new boolean[] {false} ;
      T000C34_A794Nove_CuentadanteCedOrigen = new long[1] ;
      T000C34_n794Nove_CuentadanteCedOrigen = new boolean[] {false} ;
      T000C34_A795Nove_CuentadanteNomOrigen = new String[] {""} ;
      T000C34_n795Nove_CuentadanteNomOrigen = new boolean[] {false} ;
      T000C35_A800Nove_CuentadanteCedDestino = new long[1] ;
      T000C35_n800Nove_CuentadanteCedDestino = new boolean[] {false} ;
      T000C35_A801Nove_CuentadanteNomDestino = new String[] {""} ;
      T000C35_n801Nove_CuentadanteNomDestino = new boolean[] {false} ;
      T000C36_A106Nove_Identificador = new long[1] ;
      T000C37_A106Nove_Identificador = new long[1] ;
      T000C37_A108Nove_Linea = new int[1] ;
      T000C37_A806Nove_LineaTrn = new long[1] ;
      T000C37_n806Nove_LineaTrn = new boolean[] {false} ;
      T000C37_A807Nove_Consecutivo = new String[] {""} ;
      T000C37_A810Nove_Placa = new String[] {""} ;
      T000C37_A811Nove_ValorAntiguo = new String[] {""} ;
      T000C37_n811Nove_ValorAntiguo = new boolean[] {false} ;
      T000C37_A812Nove_ValorNuevo = new String[] {""} ;
      T000C37_n812Nove_ValorNuevo = new boolean[] {false} ;
      T000C38_A106Nove_Identificador = new long[1] ;
      T000C38_A108Nove_Linea = new int[1] ;
      T000C3_A106Nove_Identificador = new long[1] ;
      T000C3_A108Nove_Linea = new int[1] ;
      T000C3_A806Nove_LineaTrn = new long[1] ;
      T000C3_n806Nove_LineaTrn = new boolean[] {false} ;
      T000C3_A807Nove_Consecutivo = new String[] {""} ;
      T000C3_A810Nove_Placa = new String[] {""} ;
      T000C3_A811Nove_ValorAntiguo = new String[] {""} ;
      T000C3_n811Nove_ValorAntiguo = new boolean[] {false} ;
      T000C3_A812Nove_ValorNuevo = new String[] {""} ;
      T000C3_n812Nove_ValorNuevo = new boolean[] {false} ;
      T000C2_A106Nove_Identificador = new long[1] ;
      T000C2_A108Nove_Linea = new int[1] ;
      T000C2_A806Nove_LineaTrn = new long[1] ;
      T000C2_n806Nove_LineaTrn = new boolean[] {false} ;
      T000C2_A807Nove_Consecutivo = new String[] {""} ;
      T000C2_A810Nove_Placa = new String[] {""} ;
      T000C2_A811Nove_ValorAntiguo = new String[] {""} ;
      T000C2_n811Nove_ValorAntiguo = new boolean[] {false} ;
      T000C2_A812Nove_ValorNuevo = new String[] {""} ;
      T000C2_n812Nove_ValorNuevo = new boolean[] {false} ;
      T000C42_A106Nove_Identificador = new long[1] ;
      T000C42_A108Nove_Linea = new int[1] ;
      Gridalm_novedad_detalleRow = new com.genexus.webpanels.GXWebRow();
      subGridalm_novedad_detalle_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      GXv_int1 = new long [1] ;
      GXv_char6 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_char4 = new String [1] ;
      GXv_char3 = new String [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.alm_novedad__default(),
         new Object[] {
             new Object[] {
            T000C2_A106Nove_Identificador, T000C2_A108Nove_Linea, T000C2_A806Nove_LineaTrn, T000C2_n806Nove_LineaTrn, T000C2_A807Nove_Consecutivo, T000C2_A810Nove_Placa, T000C2_A811Nove_ValorAntiguo, T000C2_n811Nove_ValorAntiguo, T000C2_A812Nove_ValorNuevo, T000C2_n812Nove_ValorNuevo
            }
            , new Object[] {
            T000C3_A106Nove_Identificador, T000C3_A108Nove_Linea, T000C3_A806Nove_LineaTrn, T000C3_n806Nove_LineaTrn, T000C3_A807Nove_Consecutivo, T000C3_A810Nove_Placa, T000C3_A811Nove_ValorAntiguo, T000C3_n811Nove_ValorAntiguo, T000C3_A812Nove_ValorNuevo, T000C3_n812Nove_ValorNuevo
            }
            , new Object[] {
            T000C4_A802Nove_Observaciones, T000C4_n802Nove_Observaciones, T000C4_A106Nove_Identificador, T000C4_A780Nove_FechaRegistro, T000C4_n780Nove_FechaRegistro, T000C4_A781Nove_UsuarioRegistro, T000C4_n781Nove_UsuarioRegistro, T000C4_A803Nove_Masivo, T000C4_n803Nove_Masivo, T000C4_A804Nove_Soporte,
            T000C4_n804Nove_Soporte, T000C4_A805Nove_RutaSoporte, T000C4_n805Nove_RutaSoporte, T000C4_A765Nove_Estado, T000C4_n765Nove_Estado, T000C4_A815Nove_RespuestaProc, T000C4_n815Nove_RespuestaProc, T000C4_A104TNov_Codigo, T000C4_n104TNov_Codigo, T000C4_A107Nove_TransId,
            T000C4_n107Nove_TransId
            }
            , new Object[] {
            T000C5_A802Nove_Observaciones, T000C5_n802Nove_Observaciones, T000C5_A106Nove_Identificador, T000C5_A780Nove_FechaRegistro, T000C5_n780Nove_FechaRegistro, T000C5_A781Nove_UsuarioRegistro, T000C5_n781Nove_UsuarioRegistro, T000C5_A803Nove_Masivo, T000C5_n803Nove_Masivo, T000C5_A804Nove_Soporte,
            T000C5_n804Nove_Soporte, T000C5_A805Nove_RutaSoporte, T000C5_n805Nove_RutaSoporte, T000C5_A765Nove_Estado, T000C5_n765Nove_Estado, T000C5_A815Nove_RespuestaProc, T000C5_n815Nove_RespuestaProc, T000C5_A104TNov_Codigo, T000C5_n104TNov_Codigo, T000C5_A107Nove_TransId,
            T000C5_n107Nove_TransId
            }
            , new Object[] {
            T000C6_A769TNov_Descripcion, T000C6_n769TNov_Descripcion, T000C6_A770TNov_Tipo, T000C6_n770TNov_Tipo, T000C6_A772TNov_Procedimiento, T000C6_n772TNov_Procedimiento, T000C6_A774TNov_Nombre_Campo, T000C6_n774TNov_Nombre_Campo
            }
            , new Object[] {
            T000C7_A814Nove_TranCC, T000C7_n814Nove_TranCC, T000C7_A790Nove_ModuloOrigen, T000C7_n790Nove_ModuloOrigen, T000C7_A791Nove_AlmaOrigen, T000C7_n791Nove_AlmaOrigen, T000C7_A792Nove_BodeOrigen, T000C7_n792Nove_BodeOrigen, T000C7_A796Nove_ModuloDestino, T000C7_n796Nove_ModuloDestino,
            T000C7_A797Nove_AlmaDestino, T000C7_n797Nove_AlmaDestino, T000C7_A798Nove_BodeDestino, T000C7_n798Nove_BodeDestino, T000C7_A785Nove_CentroId, T000C7_n785Nove_CentroId, T000C7_A782Nove_RegionId, T000C7_n782Nove_RegionId, T000C7_A788Nove_CodigoMovimiento, T000C7_n788Nove_CodigoMovimiento,
            T000C7_A793Nove_CuentadanteIdOrigen, T000C7_n793Nove_CuentadanteIdOrigen, T000C7_A799Nove_CuentadanteIdDestino, T000C7_n799Nove_CuentadanteIdDestino
            }
            , new Object[] {
            T000C8_A786Nove_CentroCodigo, T000C8_n786Nove_CentroCodigo, T000C8_A787Nove_CentroDescripcion, T000C8_n787Nove_CentroDescripcion
            }
            , new Object[] {
            T000C9_A783Nove_RegionCodigo, T000C9_n783Nove_RegionCodigo, T000C9_A784Nove_RegionDescripcion, T000C9_n784Nove_RegionDescripcion
            }
            , new Object[] {
            T000C10_A789Nove_MovimientoDescrip, T000C10_n789Nove_MovimientoDescrip
            }
            , new Object[] {
            T000C11_A794Nove_CuentadanteCedOrigen, T000C11_n794Nove_CuentadanteCedOrigen, T000C11_A795Nove_CuentadanteNomOrigen, T000C11_n795Nove_CuentadanteNomOrigen
            }
            , new Object[] {
            T000C12_A800Nove_CuentadanteCedDestino, T000C12_n800Nove_CuentadanteCedDestino, T000C12_A801Nove_CuentadanteNomDestino, T000C12_n801Nove_CuentadanteNomDestino
            }
            , new Object[] {
            T000C13_A802Nove_Observaciones, T000C13_n802Nove_Observaciones, T000C13_A106Nove_Identificador, T000C13_A780Nove_FechaRegistro, T000C13_n780Nove_FechaRegistro, T000C13_A781Nove_UsuarioRegistro, T000C13_n781Nove_UsuarioRegistro, T000C13_A814Nove_TranCC, T000C13_n814Nove_TranCC, T000C13_A783Nove_RegionCodigo,
            T000C13_n783Nove_RegionCodigo, T000C13_A784Nove_RegionDescripcion, T000C13_n784Nove_RegionDescripcion, T000C13_A786Nove_CentroCodigo, T000C13_n786Nove_CentroCodigo, T000C13_A787Nove_CentroDescripcion, T000C13_n787Nove_CentroDescripcion, T000C13_A789Nove_MovimientoDescrip, T000C13_n789Nove_MovimientoDescrip, T000C13_A790Nove_ModuloOrigen,
            T000C13_n790Nove_ModuloOrigen, T000C13_A791Nove_AlmaOrigen, T000C13_n791Nove_AlmaOrigen, T000C13_A792Nove_BodeOrigen, T000C13_n792Nove_BodeOrigen, T000C13_A794Nove_CuentadanteCedOrigen, T000C13_n794Nove_CuentadanteCedOrigen, T000C13_A795Nove_CuentadanteNomOrigen, T000C13_n795Nove_CuentadanteNomOrigen, T000C13_A796Nove_ModuloDestino,
            T000C13_n796Nove_ModuloDestino, T000C13_A797Nove_AlmaDestino, T000C13_n797Nove_AlmaDestino, T000C13_A798Nove_BodeDestino, T000C13_n798Nove_BodeDestino, T000C13_A800Nove_CuentadanteCedDestino, T000C13_n800Nove_CuentadanteCedDestino, T000C13_A801Nove_CuentadanteNomDestino, T000C13_n801Nove_CuentadanteNomDestino, T000C13_A769TNov_Descripcion,
            T000C13_n769TNov_Descripcion, T000C13_A770TNov_Tipo, T000C13_n770TNov_Tipo, T000C13_A772TNov_Procedimiento, T000C13_n772TNov_Procedimiento, T000C13_A774TNov_Nombre_Campo, T000C13_n774TNov_Nombre_Campo, T000C13_A803Nove_Masivo, T000C13_n803Nove_Masivo, T000C13_A804Nove_Soporte,
            T000C13_n804Nove_Soporte, T000C13_A805Nove_RutaSoporte, T000C13_n805Nove_RutaSoporte, T000C13_A765Nove_Estado, T000C13_n765Nove_Estado, T000C13_A815Nove_RespuestaProc, T000C13_n815Nove_RespuestaProc, T000C13_A104TNov_Codigo, T000C13_n104TNov_Codigo, T000C13_A107Nove_TransId,
            T000C13_n107Nove_TransId, T000C13_A785Nove_CentroId, T000C13_n785Nove_CentroId, T000C13_A782Nove_RegionId, T000C13_n782Nove_RegionId, T000C13_A788Nove_CodigoMovimiento, T000C13_n788Nove_CodigoMovimiento, T000C13_A793Nove_CuentadanteIdOrigen, T000C13_n793Nove_CuentadanteIdOrigen, T000C13_A799Nove_CuentadanteIdDestino,
            T000C13_n799Nove_CuentadanteIdDestino
            }
            , new Object[] {
            T000C14_A769TNov_Descripcion, T000C14_n769TNov_Descripcion, T000C14_A770TNov_Tipo, T000C14_n770TNov_Tipo, T000C14_A772TNov_Procedimiento, T000C14_n772TNov_Procedimiento, T000C14_A774TNov_Nombre_Campo, T000C14_n774TNov_Nombre_Campo
            }
            , new Object[] {
            T000C15_A814Nove_TranCC, T000C15_n814Nove_TranCC, T000C15_A790Nove_ModuloOrigen, T000C15_n790Nove_ModuloOrigen, T000C15_A791Nove_AlmaOrigen, T000C15_n791Nove_AlmaOrigen, T000C15_A792Nove_BodeOrigen, T000C15_n792Nove_BodeOrigen, T000C15_A796Nove_ModuloDestino, T000C15_n796Nove_ModuloDestino,
            T000C15_A797Nove_AlmaDestino, T000C15_n797Nove_AlmaDestino, T000C15_A798Nove_BodeDestino, T000C15_n798Nove_BodeDestino, T000C15_A785Nove_CentroId, T000C15_n785Nove_CentroId, T000C15_A782Nove_RegionId, T000C15_n782Nove_RegionId, T000C15_A788Nove_CodigoMovimiento, T000C15_n788Nove_CodigoMovimiento,
            T000C15_A793Nove_CuentadanteIdOrigen, T000C15_n793Nove_CuentadanteIdOrigen, T000C15_A799Nove_CuentadanteIdDestino, T000C15_n799Nove_CuentadanteIdDestino
            }
            , new Object[] {
            T000C16_A786Nove_CentroCodigo, T000C16_n786Nove_CentroCodigo, T000C16_A787Nove_CentroDescripcion, T000C16_n787Nove_CentroDescripcion
            }
            , new Object[] {
            T000C17_A783Nove_RegionCodigo, T000C17_n783Nove_RegionCodigo, T000C17_A784Nove_RegionDescripcion, T000C17_n784Nove_RegionDescripcion
            }
            , new Object[] {
            T000C18_A789Nove_MovimientoDescrip, T000C18_n789Nove_MovimientoDescrip
            }
            , new Object[] {
            T000C19_A794Nove_CuentadanteCedOrigen, T000C19_n794Nove_CuentadanteCedOrigen, T000C19_A795Nove_CuentadanteNomOrigen, T000C19_n795Nove_CuentadanteNomOrigen
            }
            , new Object[] {
            T000C20_A800Nove_CuentadanteCedDestino, T000C20_n800Nove_CuentadanteCedDestino, T000C20_A801Nove_CuentadanteNomDestino, T000C20_n801Nove_CuentadanteNomDestino
            }
            , new Object[] {
            T000C21_A106Nove_Identificador
            }
            , new Object[] {
            T000C22_A106Nove_Identificador
            }
            , new Object[] {
            T000C23_A106Nove_Identificador
            }
            , new Object[] {
            }
            , new Object[] {
            T000C25_A106Nove_Identificador
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000C29_A769TNov_Descripcion, T000C29_n769TNov_Descripcion, T000C29_A770TNov_Tipo, T000C29_n770TNov_Tipo, T000C29_A772TNov_Procedimiento, T000C29_n772TNov_Procedimiento, T000C29_A774TNov_Nombre_Campo, T000C29_n774TNov_Nombre_Campo
            }
            , new Object[] {
            T000C30_A814Nove_TranCC, T000C30_n814Nove_TranCC, T000C30_A790Nove_ModuloOrigen, T000C30_n790Nove_ModuloOrigen, T000C30_A791Nove_AlmaOrigen, T000C30_n791Nove_AlmaOrigen, T000C30_A792Nove_BodeOrigen, T000C30_n792Nove_BodeOrigen, T000C30_A796Nove_ModuloDestino, T000C30_n796Nove_ModuloDestino,
            T000C30_A797Nove_AlmaDestino, T000C30_n797Nove_AlmaDestino, T000C30_A798Nove_BodeDestino, T000C30_n798Nove_BodeDestino, T000C30_A785Nove_CentroId, T000C30_n785Nove_CentroId, T000C30_A782Nove_RegionId, T000C30_n782Nove_RegionId, T000C30_A788Nove_CodigoMovimiento, T000C30_n788Nove_CodigoMovimiento,
            T000C30_A793Nove_CuentadanteIdOrigen, T000C30_n793Nove_CuentadanteIdOrigen, T000C30_A799Nove_CuentadanteIdDestino, T000C30_n799Nove_CuentadanteIdDestino
            }
            , new Object[] {
            T000C31_A786Nove_CentroCodigo, T000C31_n786Nove_CentroCodigo, T000C31_A787Nove_CentroDescripcion, T000C31_n787Nove_CentroDescripcion
            }
            , new Object[] {
            T000C32_A783Nove_RegionCodigo, T000C32_n783Nove_RegionCodigo, T000C32_A784Nove_RegionDescripcion, T000C32_n784Nove_RegionDescripcion
            }
            , new Object[] {
            T000C33_A789Nove_MovimientoDescrip, T000C33_n789Nove_MovimientoDescrip
            }
            , new Object[] {
            T000C34_A794Nove_CuentadanteCedOrigen, T000C34_n794Nove_CuentadanteCedOrigen, T000C34_A795Nove_CuentadanteNomOrigen, T000C34_n795Nove_CuentadanteNomOrigen
            }
            , new Object[] {
            T000C35_A800Nove_CuentadanteCedDestino, T000C35_n800Nove_CuentadanteCedDestino, T000C35_A801Nove_CuentadanteNomDestino, T000C35_n801Nove_CuentadanteNomDestino
            }
            , new Object[] {
            T000C36_A106Nove_Identificador
            }
            , new Object[] {
            T000C37_A106Nove_Identificador, T000C37_A108Nove_Linea, T000C37_A806Nove_LineaTrn, T000C37_n806Nove_LineaTrn, T000C37_A807Nove_Consecutivo, T000C37_A810Nove_Placa, T000C37_A811Nove_ValorAntiguo, T000C37_n811Nove_ValorAntiguo, T000C37_A812Nove_ValorNuevo, T000C37_n812Nove_ValorNuevo
            }
            , new Object[] {
            T000C38_A106Nove_Identificador, T000C38_A108Nove_Linea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000C42_A106Nove_Identificador, T000C42_A108Nove_Linea
            }
         }
      );
      AV21Pgmname = "ALM_NOVEDAD" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte subGridalm_novedad_detalle_Backcolorstyle ;
   private byte subGridalm_novedad_detalle_Allowselection ;
   private byte subGridalm_novedad_detalle_Allowhovering ;
   private byte subGridalm_novedad_detalle_Allowcollapsing ;
   private byte subGridalm_novedad_detalle_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridalm_novedad_detalle_Backstyle ;
   private byte gxajaxcallmode ;
   private byte wbTemp ;
   private short nRC_GXsfl_134 ;
   private short nGXsfl_134_idx=1 ;
   private short nRcdDeleted_57 ;
   private short nRcdExists_57 ;
   private short nIsMod_57 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A783Nove_RegionCodigo ;
   private short nBlankRcdCount57 ;
   private short RcdFound57 ;
   private short nBlankRcdUsr57 ;
   private short RcdFound56 ;
   private short Z783Nove_RegionCodigo ;
   private int Z104TNov_Codigo ;
   private int N104TNov_Codigo ;
   private int Z108Nove_Linea ;
   private int A104TNov_Codigo ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtNove_Identificador_Enabled ;
   private int edtNove_FechaRegistro_Enabled ;
   private int edtTNov_Descripcion_Enabled ;
   private int divTabletransaccion_Visible ;
   private int edtNove_TranCC_Enabled ;
   private int edtNove_RegionCodigo_Enabled ;
   private int edtNove_RegionDescripcion_Enabled ;
   private int edtNove_CentroCodigo_Enabled ;
   private int edtNove_CentroDescripcion_Enabled ;
   private int edtNove_CodigoMovimiento_Enabled ;
   private int edtNove_MovimientoDescrip_Enabled ;
   private int edtNove_ModuloOrigen_Enabled ;
   private int edtavAlma_origendescrip_Enabled ;
   private int edtavBode_origendescrip_Enabled ;
   private int edtNove_CuentadanteCedOrigen_Enabled ;
   private int edtNove_CuentadanteNomOrigen_Enabled ;
   private int edtNove_ModuloDestino_Enabled ;
   private int edtavAlma_destidescrip_Enabled ;
   private int edtavBode_destidescrip_Enabled ;
   private int edtNove_CuentadanteCedDestino_Enabled ;
   private int edtNove_CuentadanteNomDestino_Enabled ;
   private int edtNove_RespuestaProc_Enabled ;
   private int edtNove_Observaciones_Enabled ;
   private int edtNove_Soporte_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int A108Nove_Linea ;
   private int edtNove_Linea_Enabled ;
   private int edtNove_LineaTrn_Enabled ;
   private int edtNove_Consecutivo_Enabled ;
   private int edtNove_Consecutivo_Visible ;
   private int edtNove_Placa_Enabled ;
   private int edtNove_Placa_Visible ;
   private int edtNove_ValorAntiguo_Enabled ;
   private int edtNove_ValorAntiguo_Visible ;
   private int edtavNove_valorantiguo_Enabled ;
   private int edtavNove_valorantiguo_Visible ;
   private int edtNove_ValorNuevo_Enabled ;
   private int edtNove_ValorNuevo_Visible ;
   private int edtavNove_valornuevo_Enabled ;
   private int edtavNove_valornuevo_Visible ;
   private int subGridalm_novedad_detalle_Selectioncolor ;
   private int subGridalm_novedad_detalle_Hoveringcolor ;
   private int fRowAdded ;
   private int AV13Insert_TNov_Codigo ;
   private int AV22GXV1 ;
   private int GX_JID ;
   private int subGridalm_novedad_detalle_Backcolor ;
   private int subGridalm_novedad_detalle_Allbackcolor ;
   private int defedtNove_LineaTrn_Enabled ;
   private int defedtNove_Linea_Enabled ;
   private int idxLst ;
   private long wcpOAV7Nove_Identificador ;
   private long Z106Nove_Identificador ;
   private long Z781Nove_UsuarioRegistro ;
   private long Z107Nove_TransId ;
   private long N107Nove_TransId ;
   private long Z806Nove_LineaTrn ;
   private long A785Nove_CentroId ;
   private long A106Nove_Identificador ;
   private long A107Nove_TransId ;
   private long A782Nove_RegionId ;
   private long A793Nove_CuentadanteIdOrigen ;
   private long A799Nove_CuentadanteIdDestino ;
   private long AV7Nove_Identificador ;
   private long A814Nove_TranCC ;
   private long A794Nove_CuentadanteCedOrigen ;
   private long A800Nove_CuentadanteCedDestino ;
   private long A806Nove_LineaTrn ;
   private long A781Nove_UsuarioRegistro ;
   private long AV12Insert_Nove_TransId ;
   private long GRIDALM_NOVEDAD_DETALLE_nFirstRecordOnPage ;
   private long Z814Nove_TranCC ;
   private long Z785Nove_CentroId ;
   private long Z782Nove_RegionId ;
   private long Z793Nove_CuentadanteIdOrigen ;
   private long Z799Nove_CuentadanteIdDestino ;
   private long Z794Nove_CuentadanteCedOrigen ;
   private long Z800Nove_CuentadanteCedDestino ;
   private long GXv_int1[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z765Nove_Estado ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String sGXsfl_134_idx="0001" ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtNove_FechaRegistro_Internalname ;
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
   private String divTable1_Internalname ;
   private String edtNove_Identificador_Internalname ;
   private String edtNove_Identificador_Jsonclick ;
   private String edtNove_FechaRegistro_Jsonclick ;
   private String edtTNov_Descripcion_Internalname ;
   private String divTabletransaccion_Internalname ;
   private String edtNove_TranCC_Internalname ;
   private String edtNove_TranCC_Jsonclick ;
   private String edtNove_RegionCodigo_Internalname ;
   private String edtNove_RegionCodigo_Jsonclick ;
   private String edtNove_RegionDescripcion_Internalname ;
   private String edtNove_RegionDescripcion_Jsonclick ;
   private String edtNove_CentroCodigo_Internalname ;
   private String edtNove_CentroCodigo_Jsonclick ;
   private String edtNove_CentroDescripcion_Internalname ;
   private String edtNove_CentroDescripcion_Jsonclick ;
   private String edtNove_CodigoMovimiento_Internalname ;
   private String edtNove_CodigoMovimiento_Jsonclick ;
   private String edtNove_MovimientoDescrip_Internalname ;
   private String edtNove_MovimientoDescrip_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtNove_ModuloOrigen_Internalname ;
   private String edtNove_ModuloOrigen_Jsonclick ;
   private String edtavAlma_origendescrip_Internalname ;
   private String edtavAlma_origendescrip_Jsonclick ;
   private String edtavBode_origendescrip_Internalname ;
   private String edtavBode_origendescrip_Jsonclick ;
   private String edtNove_CuentadanteCedOrigen_Internalname ;
   private String edtNove_CuentadanteCedOrigen_Jsonclick ;
   private String edtNove_CuentadanteNomOrigen_Internalname ;
   private String edtNove_CuentadanteNomOrigen_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtNove_ModuloDestino_Internalname ;
   private String edtNove_ModuloDestino_Jsonclick ;
   private String edtavAlma_destidescrip_Internalname ;
   private String edtavAlma_destidescrip_Jsonclick ;
   private String edtavBode_destidescrip_Internalname ;
   private String edtavBode_destidescrip_Jsonclick ;
   private String edtNove_CuentadanteCedDestino_Internalname ;
   private String edtNove_CuentadanteCedDestino_Jsonclick ;
   private String edtNove_CuentadanteNomDestino_Internalname ;
   private String edtNove_CuentadanteNomDestino_Jsonclick ;
   private String edtNove_RespuestaProc_Internalname ;
   private String edtNove_Observaciones_Internalname ;
   private String edtNove_Soporte_Internalname ;
   private String edtNove_Soporte_Filetype ;
   private String edtNove_Soporte_Contenttype ;
   private String edtNove_Soporte_Parameters ;
   private String edtNove_Soporte_Jsonclick ;
   private String divDetalletable_Internalname ;
   private String lblTitledetalle_Internalname ;
   private String lblTitledetalle_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode57 ;
   private String edtNove_Linea_Internalname ;
   private String edtNove_LineaTrn_Internalname ;
   private String edtNove_Consecutivo_Internalname ;
   private String edtNove_Placa_Internalname ;
   private String edtNove_ValorAntiguo_Internalname ;
   private String edtavNove_valorantiguo_Internalname ;
   private String edtNove_ValorNuevo_Internalname ;
   private String edtavNove_valornuevo_Internalname ;
   private String sStyleString ;
   private String A765Nove_Estado ;
   private String AV21Pgmname ;
   private String edtNove_Soporte_Filename ;
   private String GXCCtlgxBlob ;
   private String forbiddenHiddens ;
   private String hsh ;
   private String sMode56 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sGXsfl_134_fel_idx="0001" ;
   private String subGridalm_novedad_detalle_Class ;
   private String subGridalm_novedad_detalle_Linesclass ;
   private String ROClassString ;
   private String edtNove_Linea_Jsonclick ;
   private String edtNove_LineaTrn_Jsonclick ;
   private String edtNove_Consecutivo_Jsonclick ;
   private String edtNove_Placa_Jsonclick ;
   private String edtNove_ValorAntiguo_Jsonclick ;
   private String edtavNove_valorantiguo_Jsonclick ;
   private String edtNove_ValorNuevo_Jsonclick ;
   private String edtavNove_valornuevo_Jsonclick ;
   private String GXCCtl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridalm_novedad_detalle_Internalname ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date Z780Nove_FechaRegistro ;
   private java.util.Date A780Nove_FechaRegistro ;
   private boolean entryPointCalled ;
   private boolean n785Nove_CentroId ;
   private boolean n790Nove_ModuloOrigen ;
   private boolean n791Nove_AlmaOrigen ;
   private boolean n792Nove_BodeOrigen ;
   private boolean n796Nove_ModuloDestino ;
   private boolean n797Nove_AlmaDestino ;
   private boolean n798Nove_BodeDestino ;
   private boolean n774TNov_Nombre_Campo ;
   private boolean n811Nove_ValorAntiguo ;
   private boolean n812Nove_ValorNuevo ;
   private boolean n770TNov_Tipo ;
   private boolean n104TNov_Codigo ;
   private boolean n107Nove_TransId ;
   private boolean n782Nove_RegionId ;
   private boolean n788Nove_CodigoMovimiento ;
   private boolean n793Nove_CuentadanteIdOrigen ;
   private boolean n799Nove_CuentadanteIdDestino ;
   private boolean toggleJsOutput ;
   private boolean n803Nove_Masivo ;
   private boolean wbErr ;
   private boolean n804Nove_Soporte ;
   private boolean bGXsfl_134_Refreshing=false ;
   private boolean n780Nove_FechaRegistro ;
   private boolean n769TNov_Descripcion ;
   private boolean n814Nove_TranCC ;
   private boolean n783Nove_RegionCodigo ;
   private boolean n784Nove_RegionDescripcion ;
   private boolean n786Nove_CentroCodigo ;
   private boolean n787Nove_CentroDescripcion ;
   private boolean n789Nove_MovimientoDescrip ;
   private boolean n794Nove_CuentadanteCedOrigen ;
   private boolean n795Nove_CuentadanteNomOrigen ;
   private boolean n800Nove_CuentadanteCedDestino ;
   private boolean n801Nove_CuentadanteNomDestino ;
   private boolean n815Nove_RespuestaProc ;
   private boolean n802Nove_Observaciones ;
   private boolean n781Nove_UsuarioRegistro ;
   private boolean n805Nove_RutaSoporte ;
   private boolean n765Nove_Estado ;
   private boolean n772TNov_Procedimiento ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n806Nove_LineaTrn ;
   private String A802Nove_Observaciones ;
   private String Z802Nove_Observaciones ;
   private String A804Nove_Soporte ;
   private String Z804Nove_Soporte ;
   private String Z803Nove_Masivo ;
   private String Z805Nove_RutaSoporte ;
   private String Z815Nove_RespuestaProc ;
   private String Z807Nove_Consecutivo ;
   private String Z810Nove_Placa ;
   private String Z811Nove_ValorAntiguo ;
   private String Z812Nove_ValorNuevo ;
   private String A790Nove_ModuloOrigen ;
   private String A791Nove_AlmaOrigen ;
   private String A792Nove_BodeOrigen ;
   private String AV15Alma_OrigenDescrip ;
   private String AV17Bode_OrigenDescrip ;
   private String A796Nove_ModuloDestino ;
   private String A797Nove_AlmaDestino ;
   private String A798Nove_BodeDestino ;
   private String AV16Alma_DestiDescrip ;
   private String AV18Bode_DestiDescrip ;
   private String A774TNov_Nombre_Campo ;
   private String A811Nove_ValorAntiguo ;
   private String A812Nove_ValorNuevo ;
   private String AV19Nove_ValorAntiguo ;
   private String AV20Nove_ValorNuevo ;
   private String A770TNov_Tipo ;
   private String A788Nove_CodigoMovimiento ;
   private String A803Nove_Masivo ;
   private String A769TNov_Descripcion ;
   private String A784Nove_RegionDescripcion ;
   private String A786Nove_CentroCodigo ;
   private String A787Nove_CentroDescripcion ;
   private String A789Nove_MovimientoDescrip ;
   private String A795Nove_CuentadanteNomOrigen ;
   private String A801Nove_CuentadanteNomDestino ;
   private String A815Nove_RespuestaProc ;
   private String A807Nove_Consecutivo ;
   private String A810Nove_Placa ;
   private String A805Nove_RutaSoporte ;
   private String A772TNov_Procedimiento ;
   private String Z769TNov_Descripcion ;
   private String Z770TNov_Tipo ;
   private String Z772TNov_Procedimiento ;
   private String Z774TNov_Nombre_Campo ;
   private String Z790Nove_ModuloOrigen ;
   private String Z791Nove_AlmaOrigen ;
   private String Z792Nove_BodeOrigen ;
   private String Z796Nove_ModuloDestino ;
   private String Z797Nove_AlmaDestino ;
   private String Z798Nove_BodeDestino ;
   private String Z788Nove_CodigoMovimiento ;
   private String Z786Nove_CentroCodigo ;
   private String Z787Nove_CentroDescripcion ;
   private String Z784Nove_RegionDescripcion ;
   private String Z789Nove_MovimientoDescrip ;
   private String Z795Nove_CuentadanteNomOrigen ;
   private String Z801Nove_CuentadanteNomDestino ;
   private com.genexus.webpanels.GXWebGrid Gridalm_novedad_detalleContainer ;
   private com.genexus.webpanels.GXWebRow Gridalm_novedad_detalleRow ;
   private com.genexus.webpanels.GXWebColumn Gridalm_novedad_detalleColumn ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice cmbNove_Masivo ;
   private IDataStoreProvider pr_default ;
   private String[] T000C6_A769TNov_Descripcion ;
   private boolean[] T000C6_n769TNov_Descripcion ;
   private String[] T000C6_A770TNov_Tipo ;
   private boolean[] T000C6_n770TNov_Tipo ;
   private String[] T000C6_A772TNov_Procedimiento ;
   private boolean[] T000C6_n772TNov_Procedimiento ;
   private String[] T000C6_A774TNov_Nombre_Campo ;
   private boolean[] T000C6_n774TNov_Nombre_Campo ;
   private long[] T000C7_A814Nove_TranCC ;
   private boolean[] T000C7_n814Nove_TranCC ;
   private String[] T000C7_A790Nove_ModuloOrigen ;
   private boolean[] T000C7_n790Nove_ModuloOrigen ;
   private String[] T000C7_A791Nove_AlmaOrigen ;
   private boolean[] T000C7_n791Nove_AlmaOrigen ;
   private String[] T000C7_A792Nove_BodeOrigen ;
   private boolean[] T000C7_n792Nove_BodeOrigen ;
   private String[] T000C7_A796Nove_ModuloDestino ;
   private boolean[] T000C7_n796Nove_ModuloDestino ;
   private String[] T000C7_A797Nove_AlmaDestino ;
   private boolean[] T000C7_n797Nove_AlmaDestino ;
   private String[] T000C7_A798Nove_BodeDestino ;
   private boolean[] T000C7_n798Nove_BodeDestino ;
   private long[] T000C7_A785Nove_CentroId ;
   private boolean[] T000C7_n785Nove_CentroId ;
   private long[] T000C7_A782Nove_RegionId ;
   private boolean[] T000C7_n782Nove_RegionId ;
   private String[] T000C7_A788Nove_CodigoMovimiento ;
   private boolean[] T000C7_n788Nove_CodigoMovimiento ;
   private long[] T000C7_A793Nove_CuentadanteIdOrigen ;
   private boolean[] T000C7_n793Nove_CuentadanteIdOrigen ;
   private long[] T000C7_A799Nove_CuentadanteIdDestino ;
   private boolean[] T000C7_n799Nove_CuentadanteIdDestino ;
   private String[] T000C8_A786Nove_CentroCodigo ;
   private boolean[] T000C8_n786Nove_CentroCodigo ;
   private String[] T000C8_A787Nove_CentroDescripcion ;
   private boolean[] T000C8_n787Nove_CentroDescripcion ;
   private short[] T000C9_A783Nove_RegionCodigo ;
   private boolean[] T000C9_n783Nove_RegionCodigo ;
   private String[] T000C9_A784Nove_RegionDescripcion ;
   private boolean[] T000C9_n784Nove_RegionDescripcion ;
   private String[] T000C10_A789Nove_MovimientoDescrip ;
   private boolean[] T000C10_n789Nove_MovimientoDescrip ;
   private long[] T000C11_A794Nove_CuentadanteCedOrigen ;
   private boolean[] T000C11_n794Nove_CuentadanteCedOrigen ;
   private String[] T000C11_A795Nove_CuentadanteNomOrigen ;
   private boolean[] T000C11_n795Nove_CuentadanteNomOrigen ;
   private long[] T000C12_A800Nove_CuentadanteCedDestino ;
   private boolean[] T000C12_n800Nove_CuentadanteCedDestino ;
   private String[] T000C12_A801Nove_CuentadanteNomDestino ;
   private boolean[] T000C12_n801Nove_CuentadanteNomDestino ;
   private String[] T000C13_A802Nove_Observaciones ;
   private boolean[] T000C13_n802Nove_Observaciones ;
   private long[] T000C13_A106Nove_Identificador ;
   private java.util.Date[] T000C13_A780Nove_FechaRegistro ;
   private boolean[] T000C13_n780Nove_FechaRegistro ;
   private long[] T000C13_A781Nove_UsuarioRegistro ;
   private boolean[] T000C13_n781Nove_UsuarioRegistro ;
   private long[] T000C13_A814Nove_TranCC ;
   private boolean[] T000C13_n814Nove_TranCC ;
   private short[] T000C13_A783Nove_RegionCodigo ;
   private boolean[] T000C13_n783Nove_RegionCodigo ;
   private String[] T000C13_A784Nove_RegionDescripcion ;
   private boolean[] T000C13_n784Nove_RegionDescripcion ;
   private String[] T000C13_A786Nove_CentroCodigo ;
   private boolean[] T000C13_n786Nove_CentroCodigo ;
   private String[] T000C13_A787Nove_CentroDescripcion ;
   private boolean[] T000C13_n787Nove_CentroDescripcion ;
   private String[] T000C13_A789Nove_MovimientoDescrip ;
   private boolean[] T000C13_n789Nove_MovimientoDescrip ;
   private String[] T000C13_A790Nove_ModuloOrigen ;
   private boolean[] T000C13_n790Nove_ModuloOrigen ;
   private String[] T000C13_A791Nove_AlmaOrigen ;
   private boolean[] T000C13_n791Nove_AlmaOrigen ;
   private String[] T000C13_A792Nove_BodeOrigen ;
   private boolean[] T000C13_n792Nove_BodeOrigen ;
   private long[] T000C13_A794Nove_CuentadanteCedOrigen ;
   private boolean[] T000C13_n794Nove_CuentadanteCedOrigen ;
   private String[] T000C13_A795Nove_CuentadanteNomOrigen ;
   private boolean[] T000C13_n795Nove_CuentadanteNomOrigen ;
   private String[] T000C13_A796Nove_ModuloDestino ;
   private boolean[] T000C13_n796Nove_ModuloDestino ;
   private String[] T000C13_A797Nove_AlmaDestino ;
   private boolean[] T000C13_n797Nove_AlmaDestino ;
   private String[] T000C13_A798Nove_BodeDestino ;
   private boolean[] T000C13_n798Nove_BodeDestino ;
   private long[] T000C13_A800Nove_CuentadanteCedDestino ;
   private boolean[] T000C13_n800Nove_CuentadanteCedDestino ;
   private String[] T000C13_A801Nove_CuentadanteNomDestino ;
   private boolean[] T000C13_n801Nove_CuentadanteNomDestino ;
   private String[] T000C13_A769TNov_Descripcion ;
   private boolean[] T000C13_n769TNov_Descripcion ;
   private String[] T000C13_A770TNov_Tipo ;
   private boolean[] T000C13_n770TNov_Tipo ;
   private String[] T000C13_A772TNov_Procedimiento ;
   private boolean[] T000C13_n772TNov_Procedimiento ;
   private String[] T000C13_A774TNov_Nombre_Campo ;
   private boolean[] T000C13_n774TNov_Nombre_Campo ;
   private String[] T000C13_A803Nove_Masivo ;
   private boolean[] T000C13_n803Nove_Masivo ;
   private String[] T000C13_A804Nove_Soporte ;
   private boolean[] T000C13_n804Nove_Soporte ;
   private String[] T000C13_A805Nove_RutaSoporte ;
   private boolean[] T000C13_n805Nove_RutaSoporte ;
   private String[] T000C13_A765Nove_Estado ;
   private boolean[] T000C13_n765Nove_Estado ;
   private String[] T000C13_A815Nove_RespuestaProc ;
   private boolean[] T000C13_n815Nove_RespuestaProc ;
   private int[] T000C13_A104TNov_Codigo ;
   private boolean[] T000C13_n104TNov_Codigo ;
   private long[] T000C13_A107Nove_TransId ;
   private boolean[] T000C13_n107Nove_TransId ;
   private long[] T000C13_A785Nove_CentroId ;
   private boolean[] T000C13_n785Nove_CentroId ;
   private long[] T000C13_A782Nove_RegionId ;
   private boolean[] T000C13_n782Nove_RegionId ;
   private String[] T000C13_A788Nove_CodigoMovimiento ;
   private boolean[] T000C13_n788Nove_CodigoMovimiento ;
   private long[] T000C13_A793Nove_CuentadanteIdOrigen ;
   private boolean[] T000C13_n793Nove_CuentadanteIdOrigen ;
   private long[] T000C13_A799Nove_CuentadanteIdDestino ;
   private boolean[] T000C13_n799Nove_CuentadanteIdDestino ;
   private String[] T000C14_A769TNov_Descripcion ;
   private boolean[] T000C14_n769TNov_Descripcion ;
   private String[] T000C14_A770TNov_Tipo ;
   private boolean[] T000C14_n770TNov_Tipo ;
   private String[] T000C14_A772TNov_Procedimiento ;
   private boolean[] T000C14_n772TNov_Procedimiento ;
   private String[] T000C14_A774TNov_Nombre_Campo ;
   private boolean[] T000C14_n774TNov_Nombre_Campo ;
   private long[] T000C15_A814Nove_TranCC ;
   private boolean[] T000C15_n814Nove_TranCC ;
   private String[] T000C15_A790Nove_ModuloOrigen ;
   private boolean[] T000C15_n790Nove_ModuloOrigen ;
   private String[] T000C15_A791Nove_AlmaOrigen ;
   private boolean[] T000C15_n791Nove_AlmaOrigen ;
   private String[] T000C15_A792Nove_BodeOrigen ;
   private boolean[] T000C15_n792Nove_BodeOrigen ;
   private String[] T000C15_A796Nove_ModuloDestino ;
   private boolean[] T000C15_n796Nove_ModuloDestino ;
   private String[] T000C15_A797Nove_AlmaDestino ;
   private boolean[] T000C15_n797Nove_AlmaDestino ;
   private String[] T000C15_A798Nove_BodeDestino ;
   private boolean[] T000C15_n798Nove_BodeDestino ;
   private long[] T000C15_A785Nove_CentroId ;
   private boolean[] T000C15_n785Nove_CentroId ;
   private long[] T000C15_A782Nove_RegionId ;
   private boolean[] T000C15_n782Nove_RegionId ;
   private String[] T000C15_A788Nove_CodigoMovimiento ;
   private boolean[] T000C15_n788Nove_CodigoMovimiento ;
   private long[] T000C15_A793Nove_CuentadanteIdOrigen ;
   private boolean[] T000C15_n793Nove_CuentadanteIdOrigen ;
   private long[] T000C15_A799Nove_CuentadanteIdDestino ;
   private boolean[] T000C15_n799Nove_CuentadanteIdDestino ;
   private String[] T000C16_A786Nove_CentroCodigo ;
   private boolean[] T000C16_n786Nove_CentroCodigo ;
   private String[] T000C16_A787Nove_CentroDescripcion ;
   private boolean[] T000C16_n787Nove_CentroDescripcion ;
   private short[] T000C17_A783Nove_RegionCodigo ;
   private boolean[] T000C17_n783Nove_RegionCodigo ;
   private String[] T000C17_A784Nove_RegionDescripcion ;
   private boolean[] T000C17_n784Nove_RegionDescripcion ;
   private String[] T000C18_A789Nove_MovimientoDescrip ;
   private boolean[] T000C18_n789Nove_MovimientoDescrip ;
   private long[] T000C19_A794Nove_CuentadanteCedOrigen ;
   private boolean[] T000C19_n794Nove_CuentadanteCedOrigen ;
   private String[] T000C19_A795Nove_CuentadanteNomOrigen ;
   private boolean[] T000C19_n795Nove_CuentadanteNomOrigen ;
   private long[] T000C20_A800Nove_CuentadanteCedDestino ;
   private boolean[] T000C20_n800Nove_CuentadanteCedDestino ;
   private String[] T000C20_A801Nove_CuentadanteNomDestino ;
   private boolean[] T000C20_n801Nove_CuentadanteNomDestino ;
   private long[] T000C21_A106Nove_Identificador ;
   private String[] T000C5_A802Nove_Observaciones ;
   private boolean[] T000C5_n802Nove_Observaciones ;
   private long[] T000C5_A106Nove_Identificador ;
   private java.util.Date[] T000C5_A780Nove_FechaRegistro ;
   private boolean[] T000C5_n780Nove_FechaRegistro ;
   private long[] T000C5_A781Nove_UsuarioRegistro ;
   private boolean[] T000C5_n781Nove_UsuarioRegistro ;
   private String[] T000C5_A803Nove_Masivo ;
   private boolean[] T000C5_n803Nove_Masivo ;
   private String[] T000C5_A804Nove_Soporte ;
   private boolean[] T000C5_n804Nove_Soporte ;
   private String[] T000C5_A805Nove_RutaSoporte ;
   private boolean[] T000C5_n805Nove_RutaSoporte ;
   private String[] T000C5_A765Nove_Estado ;
   private boolean[] T000C5_n765Nove_Estado ;
   private String[] T000C5_A815Nove_RespuestaProc ;
   private boolean[] T000C5_n815Nove_RespuestaProc ;
   private int[] T000C5_A104TNov_Codigo ;
   private boolean[] T000C5_n104TNov_Codigo ;
   private long[] T000C5_A107Nove_TransId ;
   private boolean[] T000C5_n107Nove_TransId ;
   private long[] T000C22_A106Nove_Identificador ;
   private long[] T000C23_A106Nove_Identificador ;
   private String[] T000C4_A802Nove_Observaciones ;
   private boolean[] T000C4_n802Nove_Observaciones ;
   private long[] T000C4_A106Nove_Identificador ;
   private java.util.Date[] T000C4_A780Nove_FechaRegistro ;
   private boolean[] T000C4_n780Nove_FechaRegistro ;
   private long[] T000C4_A781Nove_UsuarioRegistro ;
   private boolean[] T000C4_n781Nove_UsuarioRegistro ;
   private String[] T000C4_A803Nove_Masivo ;
   private boolean[] T000C4_n803Nove_Masivo ;
   private String[] T000C4_A804Nove_Soporte ;
   private boolean[] T000C4_n804Nove_Soporte ;
   private String[] T000C4_A805Nove_RutaSoporte ;
   private boolean[] T000C4_n805Nove_RutaSoporte ;
   private String[] T000C4_A765Nove_Estado ;
   private boolean[] T000C4_n765Nove_Estado ;
   private String[] T000C4_A815Nove_RespuestaProc ;
   private boolean[] T000C4_n815Nove_RespuestaProc ;
   private int[] T000C4_A104TNov_Codigo ;
   private boolean[] T000C4_n104TNov_Codigo ;
   private long[] T000C4_A107Nove_TransId ;
   private boolean[] T000C4_n107Nove_TransId ;
   private long[] T000C25_A106Nove_Identificador ;
   private String[] T000C29_A769TNov_Descripcion ;
   private boolean[] T000C29_n769TNov_Descripcion ;
   private String[] T000C29_A770TNov_Tipo ;
   private boolean[] T000C29_n770TNov_Tipo ;
   private String[] T000C29_A772TNov_Procedimiento ;
   private boolean[] T000C29_n772TNov_Procedimiento ;
   private String[] T000C29_A774TNov_Nombre_Campo ;
   private boolean[] T000C29_n774TNov_Nombre_Campo ;
   private long[] T000C30_A814Nove_TranCC ;
   private boolean[] T000C30_n814Nove_TranCC ;
   private String[] T000C30_A790Nove_ModuloOrigen ;
   private boolean[] T000C30_n790Nove_ModuloOrigen ;
   private String[] T000C30_A791Nove_AlmaOrigen ;
   private boolean[] T000C30_n791Nove_AlmaOrigen ;
   private String[] T000C30_A792Nove_BodeOrigen ;
   private boolean[] T000C30_n792Nove_BodeOrigen ;
   private String[] T000C30_A796Nove_ModuloDestino ;
   private boolean[] T000C30_n796Nove_ModuloDestino ;
   private String[] T000C30_A797Nove_AlmaDestino ;
   private boolean[] T000C30_n797Nove_AlmaDestino ;
   private String[] T000C30_A798Nove_BodeDestino ;
   private boolean[] T000C30_n798Nove_BodeDestino ;
   private long[] T000C30_A785Nove_CentroId ;
   private boolean[] T000C30_n785Nove_CentroId ;
   private long[] T000C30_A782Nove_RegionId ;
   private boolean[] T000C30_n782Nove_RegionId ;
   private String[] T000C30_A788Nove_CodigoMovimiento ;
   private boolean[] T000C30_n788Nove_CodigoMovimiento ;
   private long[] T000C30_A793Nove_CuentadanteIdOrigen ;
   private boolean[] T000C30_n793Nove_CuentadanteIdOrigen ;
   private long[] T000C30_A799Nove_CuentadanteIdDestino ;
   private boolean[] T000C30_n799Nove_CuentadanteIdDestino ;
   private String[] T000C31_A786Nove_CentroCodigo ;
   private boolean[] T000C31_n786Nove_CentroCodigo ;
   private String[] T000C31_A787Nove_CentroDescripcion ;
   private boolean[] T000C31_n787Nove_CentroDescripcion ;
   private short[] T000C32_A783Nove_RegionCodigo ;
   private boolean[] T000C32_n783Nove_RegionCodigo ;
   private String[] T000C32_A784Nove_RegionDescripcion ;
   private boolean[] T000C32_n784Nove_RegionDescripcion ;
   private String[] T000C33_A789Nove_MovimientoDescrip ;
   private boolean[] T000C33_n789Nove_MovimientoDescrip ;
   private long[] T000C34_A794Nove_CuentadanteCedOrigen ;
   private boolean[] T000C34_n794Nove_CuentadanteCedOrigen ;
   private String[] T000C34_A795Nove_CuentadanteNomOrigen ;
   private boolean[] T000C34_n795Nove_CuentadanteNomOrigen ;
   private long[] T000C35_A800Nove_CuentadanteCedDestino ;
   private boolean[] T000C35_n800Nove_CuentadanteCedDestino ;
   private String[] T000C35_A801Nove_CuentadanteNomDestino ;
   private boolean[] T000C35_n801Nove_CuentadanteNomDestino ;
   private long[] T000C36_A106Nove_Identificador ;
   private long[] T000C37_A106Nove_Identificador ;
   private int[] T000C37_A108Nove_Linea ;
   private long[] T000C37_A806Nove_LineaTrn ;
   private boolean[] T000C37_n806Nove_LineaTrn ;
   private String[] T000C37_A807Nove_Consecutivo ;
   private String[] T000C37_A810Nove_Placa ;
   private String[] T000C37_A811Nove_ValorAntiguo ;
   private boolean[] T000C37_n811Nove_ValorAntiguo ;
   private String[] T000C37_A812Nove_ValorNuevo ;
   private boolean[] T000C37_n812Nove_ValorNuevo ;
   private long[] T000C38_A106Nove_Identificador ;
   private int[] T000C38_A108Nove_Linea ;
   private long[] T000C3_A106Nove_Identificador ;
   private int[] T000C3_A108Nove_Linea ;
   private long[] T000C3_A806Nove_LineaTrn ;
   private boolean[] T000C3_n806Nove_LineaTrn ;
   private String[] T000C3_A807Nove_Consecutivo ;
   private String[] T000C3_A810Nove_Placa ;
   private String[] T000C3_A811Nove_ValorAntiguo ;
   private boolean[] T000C3_n811Nove_ValorAntiguo ;
   private String[] T000C3_A812Nove_ValorNuevo ;
   private boolean[] T000C3_n812Nove_ValorNuevo ;
   private long[] T000C2_A106Nove_Identificador ;
   private int[] T000C2_A108Nove_Linea ;
   private long[] T000C2_A806Nove_LineaTrn ;
   private boolean[] T000C2_n806Nove_LineaTrn ;
   private String[] T000C2_A807Nove_Consecutivo ;
   private String[] T000C2_A810Nove_Placa ;
   private String[] T000C2_A811Nove_ValorAntiguo ;
   private boolean[] T000C2_n811Nove_ValorAntiguo ;
   private String[] T000C2_A812Nove_ValorNuevo ;
   private boolean[] T000C2_n812Nove_ValorNuevo ;
   private long[] T000C42_A106Nove_Identificador ;
   private int[] T000C42_A108Nove_Linea ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtTransactionContext AV10TrnContext ;
   private com.orions2.SdtTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class alm_novedad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000C2", "SELECT Nove_Identificador, Nove_Linea, Nove_LineaTrn, Nove_Consecutivo, Nove_Placa, Nove_ValorAntiguo, Nove_ValorNuevo FROM ALM_NOVEDADDETALLE WHERE Nove_Identificador = ? AND Nove_Linea = ?  FOR UPDATE OF Nove_LineaTrn, Nove_Consecutivo, Nove_Placa, Nove_ValorAntiguo, Nove_ValorNuevo NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C3", "SELECT Nove_Identificador, Nove_Linea, Nove_LineaTrn, Nove_Consecutivo, Nove_Placa, Nove_ValorAntiguo, Nove_ValorNuevo FROM ALM_NOVEDADDETALLE WHERE Nove_Identificador = ? AND Nove_Linea = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C4", "SELECT Nove_Observaciones, Nove_Identificador, Nove_FechaRegistro, Nove_UsuarioRegistro, Nove_Masivo, Nove_Soporte, Nove_RutaSoporte, Nove_Estado, Nove_RespuestaProc, TNov_Codigo, Nove_TransId FROM ALM_NOVEDAD WHERE Nove_Identificador = ?  FOR UPDATE OF Nove_FechaRegistro, Nove_UsuarioRegistro, Nove_Observaciones, Nove_Masivo, Nove_Soporte, Nove_RutaSoporte, Nove_Estado, Nove_RespuestaProc, TNov_Codigo, Nove_TransId NOWAIT",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C5", "SELECT Nove_Observaciones, Nove_Identificador, Nove_FechaRegistro, Nove_UsuarioRegistro, Nove_Masivo, Nove_Soporte, Nove_RutaSoporte, Nove_Estado, Nove_RespuestaProc, TNov_Codigo, Nove_TransId FROM ALM_NOVEDAD WHERE Nove_Identificador = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C6", "SELECT TNov_Descripcion, TNov_Tipo, TNov_Procedimiento, TNov_Nombre_Campo FROM ALM_TIPO_NOVEDAD WHERE TNov_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C7", "SELECT Tran_ConsecutivoCC AS Nove_TranCC, Tran_ModuloOrigen AS Nove_ModuloOrigen, Tran_CodAlmaOrigen AS Nove_AlmaOrigen, Tran_CodBodeOrigen AS Nove_BodeOrigen, Tran_ModuloDestino AS Nove_ModuloDestino, Tran_CodAlmaDestino AS Nove_AlmaDestino, Tran_CodBodeDestino AS Nove_BodeDestino, Tran_CentroCostoId AS Nove_CentroId, Tran_RegionId AS Nove_RegionId, Tran_CodigoMovimiento AS Nove_CodigoMovimiento, Tran_IdCuentadanteOrigen AS Nove_CuentadanteIdOrigen, Tran_IdCuentadanteDestino AS Nove_CuentadanteIdDestino FROM ALM_TRANSACCION WHERE Tran_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C8", "SELECT Cent_Codigo AS Nove_CentroCodigo, Cent_Descripcion AS Nove_CentroDescripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C9", "SELECT Regi_Cod AS Nove_RegionCodigo, Regi_Descripcion AS Nove_RegionDescripcion FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C10", "SELECT Tpmo_Descripcion AS Nove_MovimientoDescrip FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C11", "SELECT Cuen_Cedula AS Nove_CuentadanteCedOrigen, Cuen_Nombre AS Nove_CuentadanteNomOrigen FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C12", "SELECT Cuen_Cedula AS Nove_CuentadanteCedDestino, Cuen_Nombre AS Nove_CuentadanteNomDestino FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C13", "SELECT /*+ FIRST_ROWS(100) */ TM1.Nove_Observaciones, TM1.Nove_Identificador, TM1.Nove_FechaRegistro, TM1.Nove_UsuarioRegistro, T3.Tran_ConsecutivoCC AS Nove_TranCC, T5.Regi_Cod AS Nove_RegionCodigo, T5.Regi_Descripcion AS Nove_RegionDescripcion, T4.Cent_Codigo AS Nove_CentroCodigo, T4.Cent_Descripcion AS Nove_CentroDescripcion, T6.Tpmo_Descripcion AS Nove_MovimientoDescrip, T3.Tran_ModuloOrigen AS Nove_ModuloOrigen, T3.Tran_CodAlmaOrigen AS Nove_AlmaOrigen, T3.Tran_CodBodeOrigen AS Nove_BodeOrigen, T7.Cuen_Cedula AS Nove_CuentadanteCedOrigen, T7.Cuen_Nombre AS Nove_CuentadanteNomOrigen, T3.Tran_ModuloDestino AS Nove_ModuloDestino, T3.Tran_CodAlmaDestino AS Nove_AlmaDestino, T3.Tran_CodBodeDestino AS Nove_BodeDestino, T8.Cuen_Cedula AS Nove_CuentadanteCedDestino, T8.Cuen_Nombre AS Nove_CuentadanteNomDestino, T2.TNov_Descripcion, T2.TNov_Tipo, T2.TNov_Procedimiento, T2.TNov_Nombre_Campo, TM1.Nove_Masivo, TM1.Nove_Soporte, TM1.Nove_RutaSoporte, TM1.Nove_Estado, TM1.Nove_RespuestaProc, TM1.TNov_Codigo, TM1.Nove_TransId AS Nove_TransId, T3.Tran_CentroCostoId AS Nove_CentroId, T3.Tran_RegionId AS Nove_RegionId, T3.Tran_CodigoMovimiento AS Nove_CodigoMovimiento, T3.Tran_IdCuentadanteOrigen AS Nove_CuentadanteIdOrigen, T3.Tran_IdCuentadanteDestino AS Nove_CuentadanteIdDestino FROM (((((((ALM_NOVEDAD TM1 LEFT JOIN ALM_TIPO_NOVEDAD T2 ON T2.TNov_Codigo = TM1.TNov_Codigo) LEFT JOIN ALM_TRANSACCION T3 ON T3.Tran_Id = TM1.Nove_TransId) LEFT JOIN GEN_CENTROCOSTO T4 ON T4.Cent_Id = T3.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL T5 ON T5.Regi_Id = T3.Tran_RegionId) LEFT JOIN ALM_TIPO_MOVIMIENTO T6 ON T6.Tpmo_Codigo = T3.Tran_CodigoMovimiento) LEFT JOIN ALM_CUENTADANTE T7 ON T7.Cuen_Identificacion = T3.Tran_IdCuentadanteOrigen) LEFT JOIN ALM_CUENTADANTE T8 ON T8.Cuen_Identificacion = T3.Tran_IdCuentadanteDestino) WHERE TM1.Nove_Identificador = ? ORDER BY TM1.Nove_Identificador ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000C14", "SELECT TNov_Descripcion, TNov_Tipo, TNov_Procedimiento, TNov_Nombre_Campo FROM ALM_TIPO_NOVEDAD WHERE TNov_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C15", "SELECT Tran_ConsecutivoCC AS Nove_TranCC, Tran_ModuloOrigen AS Nove_ModuloOrigen, Tran_CodAlmaOrigen AS Nove_AlmaOrigen, Tran_CodBodeOrigen AS Nove_BodeOrigen, Tran_ModuloDestino AS Nove_ModuloDestino, Tran_CodAlmaDestino AS Nove_AlmaDestino, Tran_CodBodeDestino AS Nove_BodeDestino, Tran_CentroCostoId AS Nove_CentroId, Tran_RegionId AS Nove_RegionId, Tran_CodigoMovimiento AS Nove_CodigoMovimiento, Tran_IdCuentadanteOrigen AS Nove_CuentadanteIdOrigen, Tran_IdCuentadanteDestino AS Nove_CuentadanteIdDestino FROM ALM_TRANSACCION WHERE Tran_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C16", "SELECT Cent_Codigo AS Nove_CentroCodigo, Cent_Descripcion AS Nove_CentroDescripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C17", "SELECT Regi_Cod AS Nove_RegionCodigo, Regi_Descripcion AS Nove_RegionDescripcion FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C18", "SELECT Tpmo_Descripcion AS Nove_MovimientoDescrip FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C19", "SELECT Cuen_Cedula AS Nove_CuentadanteCedOrigen, Cuen_Nombre AS Nove_CuentadanteNomOrigen FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C20", "SELECT Cuen_Cedula AS Nove_CuentadanteCedDestino, Cuen_Nombre AS Nove_CuentadanteNomDestino FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C21", "SELECT /*+ FIRST_ROWS(1) */ Nove_Identificador FROM ALM_NOVEDAD WHERE Nove_Identificador = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Nove_Identificador FROM ALM_NOVEDAD WHERE ( Nove_Identificador > ?) ORDER BY Nove_Identificador) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000C23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ Nove_Identificador FROM ALM_NOVEDAD WHERE ( Nove_Identificador < ?) ORDER BY Nove_Identificador DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1,0,true )
         ,new BlobUpdateCursor("T000C24", "BEGIN INSERT INTO ALM_NOVEDAD(Nove_FechaRegistro, Nove_UsuarioRegistro, Nove_Observaciones, Nove_Masivo, Nove_Soporte, Nove_RutaSoporte, Nove_Estado, Nove_RespuestaProc, TNov_Codigo, Nove_TransId) VALUES(?, ?, ?, ?, '0', ?, ?, ?, ?, ?)  RETURNING ROWID INTO ?; END;",
         "SELECT Nove_Soporte FROM ALM_NOVEDAD WHERE ROWID = ? FOR UPDATE", "ins", 9, GX_NOMASK, "ALM_NOVEDAD")
         ,new ForEachCursor("T000C25", "SELECT Nove_Identificador.CURRVAL FROM DUAL ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000C26", "UPDATE ALM_NOVEDAD SET Nove_FechaRegistro=?, Nove_UsuarioRegistro=?, Nove_Observaciones=?, Nove_Masivo=?, Nove_RutaSoporte=?, Nove_Estado=?, Nove_RespuestaProc=?, TNov_Codigo=?, Nove_TransId=?  WHERE Nove_Identificador = ?", GX_NOMASK, "ALM_NOVEDAD")
         ,new BlobUpdateCursor("T000C27", "UPDATE ALM_NOVEDAD SET Nove_Soporte='0'  WHERE Nove_Identificador = ?",
         "SELECT Nove_Soporte FROM ALM_NOVEDAD WHERE Nove_Identificador = ? FOR UPDATE", "upd", 1, GX_NOMASK, "ALM_NOVEDAD")
         ,new UpdateCursor("T000C28", "DELETE FROM ALM_NOVEDAD  WHERE Nove_Identificador = ?", GX_NOMASK, "ALM_NOVEDAD")
         ,new ForEachCursor("T000C29", "SELECT TNov_Descripcion, TNov_Tipo, TNov_Procedimiento, TNov_Nombre_Campo FROM ALM_TIPO_NOVEDAD WHERE TNov_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C30", "SELECT Tran_ConsecutivoCC AS Nove_TranCC, Tran_ModuloOrigen AS Nove_ModuloOrigen, Tran_CodAlmaOrigen AS Nove_AlmaOrigen, Tran_CodBodeOrigen AS Nove_BodeOrigen, Tran_ModuloDestino AS Nove_ModuloDestino, Tran_CodAlmaDestino AS Nove_AlmaDestino, Tran_CodBodeDestino AS Nove_BodeDestino, Tran_CentroCostoId AS Nove_CentroId, Tran_RegionId AS Nove_RegionId, Tran_CodigoMovimiento AS Nove_CodigoMovimiento, Tran_IdCuentadanteOrigen AS Nove_CuentadanteIdOrigen, Tran_IdCuentadanteDestino AS Nove_CuentadanteIdDestino FROM ALM_TRANSACCION WHERE Tran_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C31", "SELECT Cent_Codigo AS Nove_CentroCodigo, Cent_Descripcion AS Nove_CentroDescripcion FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C32", "SELECT Regi_Cod AS Nove_RegionCodigo, Regi_Descripcion AS Nove_RegionDescripcion FROM GEN_REGIONAL WHERE Regi_Id = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C33", "SELECT Tpmo_Descripcion AS Nove_MovimientoDescrip FROM ALM_TIPO_MOVIMIENTO WHERE Tpmo_Codigo = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C34", "SELECT Cuen_Cedula AS Nove_CuentadanteCedOrigen, Cuen_Nombre AS Nove_CuentadanteNomOrigen FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C35", "SELECT Cuen_Cedula AS Nove_CuentadanteCedDestino, Cuen_Nombre AS Nove_CuentadanteNomDestino FROM ALM_CUENTADANTE WHERE Cuen_Identificacion = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C36", "SELECT /*+ FIRST_ROWS(100) */ Nove_Identificador FROM ALM_NOVEDAD ORDER BY Nove_Identificador ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000C37", "SELECT Nove_Identificador, Nove_Linea, Nove_LineaTrn, Nove_Consecutivo, Nove_Placa, Nove_ValorAntiguo, Nove_ValorNuevo FROM ALM_NOVEDADDETALLE WHERE Nove_Identificador = ? and Nove_Linea = ? ORDER BY Nove_Identificador, Nove_Linea ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000C38", "SELECT Nove_Identificador, Nove_Linea FROM ALM_NOVEDADDETALLE WHERE Nove_Identificador = ? AND Nove_Linea = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000C39", "INSERT INTO ALM_NOVEDADDETALLE(Nove_Identificador, Nove_Linea, Nove_LineaTrn, Nove_Consecutivo, Nove_Placa, Nove_ValorAntiguo, Nove_ValorNuevo) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "ALM_NOVEDADDETALLE")
         ,new UpdateCursor("T000C40", "UPDATE ALM_NOVEDADDETALLE SET Nove_LineaTrn=?, Nove_Consecutivo=?, Nove_Placa=?, Nove_ValorAntiguo=?, Nove_ValorNuevo=?  WHERE Nove_Identificador = ? AND Nove_Linea = ?", GX_NOMASK, "ALM_NOVEDADDETALLE")
         ,new UpdateCursor("T000C41", "DELETE FROM ALM_NOVEDADDETALLE  WHERE Nove_Identificador = ? AND Nove_Linea = ?", GX_NOMASK, "ALM_NOVEDADDETALLE")
         ,new ForEachCursor("T000C42", "SELECT Nove_Identificador, Nove_Linea FROM ALM_NOVEDADDETALLE WHERE Nove_Identificador = ? ORDER BY Nove_Identificador, Nove_Linea ",true, GX_NOMASK, false, this,11,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getBLOBFile(6, "tmp", "") ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getBLOBFile(6, "tmp", "") ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((long[]) buf[25])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((long[]) buf[35])[0] = rslt.getLong(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getBLOBFile(26, "tmp", "") ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(28, 1) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((int[]) buf[57])[0] = rslt.getInt(30) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((long[]) buf[59])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((long[]) buf[61])[0] = rslt.getLong(32) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((long[]) buf[63])[0] = rslt.getLong(33) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((long[]) buf[67])[0] = rslt.getLong(35) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((long[]) buf[69])[0] = rslt.getLong(36) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 18 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 19 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 20 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 21 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 23 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 28 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((long[]) buf[22])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 33 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 34 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 35 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 36 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               return;
            case 40 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
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
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 3, false);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
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
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 3, false);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 21 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(2, ((Number) parms[3]).longValue(), 0);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(3, (String)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 2);
               }
               stmt.setBLOBFile(1, ((Boolean) parms[8]).booleanValue() ? null : (String)parms[9]);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[11], 200);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[15], 200);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(9, ((Number) parms[19]).longValue());
               }
               return;
            case 24 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(2, ((Number) parms[3]).longValue(), 0);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(3, (String)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 200);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 200);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(9, ((Number) parms[17]).longValue());
               }
               stmt.setLong(10, ((Number) parms[18]).longValue());
               return;
            case 25 :
               stmt.setBLOBFile(1, ((Boolean) parms[0]).booleanValue() ? null : (String)parms[1]);
               stmt.setLong(1, ((Number) parms[2]).longValue());
               return;
            case 26 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 27 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
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
                  stmt.setLong(1, ((Number) parms[1]).longValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               return;
            case 31 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 3, false);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               return;
            case 35 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 36 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 37 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(3, ((Number) parms[3]).longValue(), 0);
               }
               stmt.setVarchar(4, (String)parms[4], 9, false);
               stmt.setVarchar(5, (String)parms[5], 30, false);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 200);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[9], 200);
               }
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setBigDecimal(1, ((Number) parms[1]).longValue(), 0);
               }
               stmt.setVarchar(2, (String)parms[2], 9, false);
               stmt.setVarchar(3, (String)parms[3], 30, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 200);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 200);
               }
               stmt.setLong(6, ((Number) parms[8]).longValue());
               stmt.setInt(7, ((Number) parms[9]).intValue());
               return;
            case 39 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 40 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 65561 :
               stmt.setLong(1, ((Number) parms[2]).longValue());
               break;
      }
   }

}

