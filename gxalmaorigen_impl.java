/*
               File: gxalmaorigen_impl
        Description: Almacen Origen
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:21:44.65
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

public final  class gxalmaorigen_impl extends GXDataArea
{
   public gxalmaorigen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gxalmaorigen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gxalmaorigen_impl.class ));
   }

   public gxalmaorigen_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_34 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_34_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_34_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV6cTpmo_Codigo = httpContext.GetNextPar( ) ;
            AV7cTpmo_Descripcion = httpContext.GetNextPar( ) ;
            httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV27SDTAlma_Origen);
            httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV21SDTTipoMovimiento);
            httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV28SDTAlma_OrigenItem);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cTpmo_Codigo, AV7cTpmo_Descripcion, AV27SDTAlma_Origen, AV21SDTTipoMovimiento, AV28SDTAlma_OrigenItem) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            httpContext.GX_webresponse.addString(httpContext.getJSONResponse( ));
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
            AV23Tran_RegionId = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Tran_RegionId", GXutil.ltrim( GXutil.str( AV23Tran_RegionId, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_REGIONID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Tran_RegionId), "ZZZZZZZZZZ9")));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV24Tran_CentroCostoId = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV24Tran_CentroCostoId, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_CENTROCOSTOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Tran_CentroCostoId), "ZZZZZZZZZZ9")));
               AV25Tran_CodigoMovimiento = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Tran_CodigoMovimiento", AV25Tran_CodigoMovimiento);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_CODIGOMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25Tran_CodigoMovimiento, ""))));
               AV26Tran_ModuloOrigen = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26Tran_ModuloOrigen", AV26Tran_ModuloOrigen);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26Tran_ModuloOrigen, ""))));
               AV34pAlma_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34pAlma_Codigo", AV34pAlma_Codigo);
               AV33pAlma_Descripcion = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33pAlma_Descripcion", AV33pAlma_Descripcion);
               AV34pAlma_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34pAlma_Codigo", AV34pAlma_Codigo);
            }
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj = new com.orions2.rwdpromptmasterpage_impl (remoteHandle, context.copy());
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

   public byte executeStartEvent( )
   {
      pa6W2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start6W2( ) ;
      }
      return gxajaxcallmode ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414214471");
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
      if ( nGXWrapped == 0 )
      {
         bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle = bodyStyle + " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gxalmaorigen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23Tran_RegionId,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV24Tran_CentroCostoId,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV25Tran_CodigoMovimiento)) + "," + GXutil.URLEncode(GXutil.rtrim(AV26Tran_ModuloOrigen)) + "," + GXutil.URLEncode(GXutil.rtrim(AV34pAlma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV33pAlma_Descripcion)) + "," + GXutil.URLEncode(GXutil.rtrim(AV34pAlma_Codigo))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_34", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_34, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTALMA_ORIGEN", AV27SDTAlma_Origen);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTALMA_ORIGEN", AV27SDTAlma_Origen);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTTIPOMOVIMIENTO", AV21SDTTipoMovimiento);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTTIPOMOVIMIENTO", AV21SDTTipoMovimiento);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTALMA_ORIGENITEM", AV28SDTAlma_OrigenItem);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTALMA_ORIGENITEM", AV28SDTAlma_OrigenItem);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_REGIONID", GXutil.ltrim( localUtil.ntoc( AV23Tran_RegionId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( AV24Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CODIGOMOVIMIENTO", AV25Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_MODULOORIGEN", AV26Tran_ModuloOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPALMA_CODIGO", AV34pAlma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPALMA_DESCRIPCION", AV33pAlma_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_REGIONID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Tran_RegionId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_CENTROCOSTOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Tran_CentroCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_CODIGOMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25Tran_CodigoMovimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26Tran_ModuloOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_REGIONID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Tran_RegionId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_CENTROCOSTOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Tran_CentroCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_CODIGOMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25Tran_CodigoMovimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26Tran_ModuloOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_descripcionfiltercontainer_Class));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         com.orions2.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we6W2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt6W2( ) ;
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
      return formatLink("com.orions2.gxalmaorigen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23Tran_RegionId,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV24Tran_CentroCostoId,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV25Tran_CodigoMovimiento)) + "," + GXutil.URLEncode(GXutil.rtrim(AV26Tran_ModuloOrigen)) + "," + GXutil.URLEncode(GXutil.rtrim(AV34pAlma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV33pAlma_Descripcion)) + "," + GXutil.URLEncode(GXutil.rtrim(AV34pAlma_Codigo)) ;
   }

   public String getPgmname( )
   {
      return "GxAlmaOrigen" ;
   }

   public String getPgmdesc( )
   {
      return "Almacen Origen" ;
   }

   public void wb6W0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMain_Internalname, 1, 0, "px", 0, "px", "ContainerFluid PromptContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 PromptAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_codigofilter_Internalname, "Código Almacen", "", "", lblLbltpmo_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e116w1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxAlmaOrigen.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtpmo_codigo_Internalname, "Código Tipo Movimiento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_34_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtpmo_codigo_Internalname, AV6cTpmo_Codigo, GXutil.rtrim( localUtil.format( AV6cTpmo_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtpmo_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCtpmo_codigo_Visible, edtavCtpmo_codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GxAlmaOrigen.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_descripcionfilter_Internalname, "Descripción Almacen", "", "", lblLbltpmo_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e126w1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_GxAlmaOrigen.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtpmo_descripcion_Internalname, "Tipo Movimiento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_34_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtpmo_descripcion_Internalname, AV7cTpmo_Descripcion, GXutil.rtrim( localUtil.format( AV7cTpmo_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtpmo_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCtpmo_descripcion_Visible, edtavCtpmo_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_GxAlmaOrigen.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 WWGridCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e136w1_client"+"'", TempTags, "", 2, "HLP_GxAlmaOrigen.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"34\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "PromptGrid", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid1_Backcolorstyle == 0 )
            {
               subGrid1_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
            else
            {
               subGrid1_Titlebackstyle = (byte)(1) ;
               if ( subGrid1_Backcolorstyle == 1 )
               {
                  subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+""+"\" "+" width="+GXutil.ltrim( GXutil.str( 17, 4, 0))+"px"+" class=\""+"SelectionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código  Almacen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Almacen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "PromptGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV5LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV31Alma_Codigo);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlma_codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV32Alma_Descripcion);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAlma_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavAlma_descripcion_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 34 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_34 = (short)(nGXsfl_34_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GxAlmaOrigen.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start6W2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Almacen Origen", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup6W0( ) ;
   }

   public void ws6W2( )
   {
      start6W2( ) ;
      evt6W2( ) ;
   }

   public void evt6W2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
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
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_34_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_342( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV38Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_34_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           AV31Alma_Codigo = httpContext.cgiGet( edtavAlma_codigo_Internalname) ;
                           AV32Alma_Descripcion = GXutil.upper( httpContext.cgiGet( edtavAlma_descripcion_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e146W2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e156W2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e166W2 ();
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we6W2( )
   {
      if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.orions2.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa6W2( )
   {
      if ( nDonePA == 0 )
      {
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
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_342( ) ;
      while ( nGXsfl_34_idx <= nRC_GXsfl_34 )
      {
         sendrow_342( ) ;
         nGXsfl_34_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_34_idx+1)) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV6cTpmo_Codigo ,
                                  String AV7cTpmo_Descripcion ,
                                  GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem> AV27SDTAlma_Origen ,
                                  GXBaseCollection<com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem> AV21SDTTipoMovimiento ,
                                  com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem AV28SDTAlma_OrigenItem )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf6W2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf6W2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavAlma_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_codigo_Enabled, 5, 0)), !bGXsfl_34_Refreshing);
      edtavAlma_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_descripcion_Enabled, 5, 0)), !bGXsfl_34_Refreshing);
   }

   public void rf6W2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(34) ;
      nGXsfl_34_idx = (short)(1) ;
      sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_342( ) ;
      bGXsfl_34_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "PromptGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_342( ) ;
         e156W2 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_34_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e156W2 ();
         }
         wbEnd = (short)(34) ;
         wb6W0( ) ;
      }
      bGXsfl_34_Refreshing = true ;
   }

   public int subgrid1_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public int subgrid1_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTpmo_Codigo, AV7cTpmo_Descripcion, AV27SDTAlma_Origen, AV21SDTTipoMovimiento, AV28SDTAlma_OrigenItem) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTpmo_Codigo, AV7cTpmo_Descripcion, AV27SDTAlma_Origen, AV21SDTTipoMovimiento, AV28SDTAlma_OrigenItem) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTpmo_Codigo, AV7cTpmo_Descripcion, AV27SDTAlma_Origen, AV21SDTTipoMovimiento, AV28SDTAlma_OrigenItem) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTpmo_Codigo, AV7cTpmo_Descripcion, AV27SDTAlma_Origen, AV21SDTTipoMovimiento, AV28SDTAlma_OrigenItem) ;
      }
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTpmo_Codigo, AV7cTpmo_Descripcion, AV27SDTAlma_Origen, AV21SDTTipoMovimiento, AV28SDTAlma_OrigenItem) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup6W0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavAlma_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_codigo_Enabled, 5, 0)), !bGXsfl_34_Refreshing);
      edtavAlma_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlma_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAlma_descripcion_Enabled, 5, 0)), !bGXsfl_34_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e146W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cTpmo_Codigo = httpContext.cgiGet( edtavCtpmo_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cTpmo_Codigo", AV6cTpmo_Codigo);
         AV7cTpmo_Descripcion = httpContext.cgiGet( edtavCtpmo_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTpmo_Descripcion", AV7cTpmo_Descripcion);
         /* Read saved values. */
         nRC_GXsfl_34 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_34"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e146W2 ();
      if (returnInSub) return;
   }

   public void e146W2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "ALMACEN", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      GXt_objcol_SdtSDTAlma_Origen_SDTAlma_OrigenItem1 = AV27SDTAlma_Origen ;
      GXv_int2[0] = AV23Tran_RegionId ;
      GXv_int3[0] = AV24Tran_CentroCostoId ;
      GXv_char4[0] = AV25Tran_CodigoMovimiento ;
      GXv_char5[0] = AV26Tran_ModuloOrigen ;
      GXv_objcol_SdtSDTAlma_Origen_SDTAlma_OrigenItem6[0] = GXt_objcol_SdtSDTAlma_Origen_SDTAlma_OrigenItem1 ;
      new com.orions2.palma_origen(remoteHandle, context).execute( GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_objcol_SdtSDTAlma_Origen_SDTAlma_OrigenItem6) ;
      gxalmaorigen_impl.this.AV23Tran_RegionId = GXv_int2[0] ;
      gxalmaorigen_impl.this.AV24Tran_CentroCostoId = GXv_int3[0] ;
      gxalmaorigen_impl.this.AV25Tran_CodigoMovimiento = GXv_char4[0] ;
      gxalmaorigen_impl.this.AV26Tran_ModuloOrigen = GXv_char5[0] ;
      GXt_objcol_SdtSDTAlma_Origen_SDTAlma_OrigenItem1 = GXv_objcol_SdtSDTAlma_Origen_SDTAlma_OrigenItem6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Tran_RegionId", GXutil.ltrim( GXutil.str( AV23Tran_RegionId, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_REGIONID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Tran_RegionId), "ZZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV24Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV24Tran_CentroCostoId, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_CENTROCOSTOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Tran_CentroCostoId), "ZZZZZZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV25Tran_CodigoMovimiento", AV25Tran_CodigoMovimiento);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_CODIGOMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25Tran_CodigoMovimiento, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV26Tran_ModuloOrigen", AV26Tran_ModuloOrigen);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26Tran_ModuloOrigen, ""))));
      AV27SDTAlma_Origen = GXt_objcol_SdtSDTAlma_Origen_SDTAlma_OrigenItem1 ;
   }

   private void e156W2( )
   {
      /* Grid1_Load Routine */
      if ( (GXutil.strcmp("", AV6cTpmo_Codigo)==0) && (GXutil.strcmp("", AV7cTpmo_Descripcion)==0) )
      {
         AV37GXV1 = 1 ;
         while ( AV37GXV1 <= AV27SDTAlma_Origen.size() )
         {
            AV28SDTAlma_OrigenItem = (com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem)((com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem)AV27SDTAlma_Origen.elementAt(-1+AV37GXV1));
            AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
            AV38Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
            AV31Alma_Codigo = AV28SDTAlma_OrigenItem.getgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo() ;
            AV32Alma_Descripcion = AV28SDTAlma_OrigenItem.getgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion() ;
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(34) ;
            }
            if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
            {
               sendrow_342( ) ;
               GRID1_nEOF = (byte)(1) ;
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
               if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
               {
                  GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
               }
            }
            if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
            {
               GRID1_nEOF = (byte)(0) ;
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
            GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
            if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
            {
               httpContext.doAjaxLoad(34, Grid1Row);
            }
            AV37GXV1 = (int)(AV37GXV1+1) ;
         }
      }
      else if ( ! (GXutil.strcmp("", AV6cTpmo_Codigo)==0) )
      {
         AV39GXV2 = 1 ;
         while ( AV39GXV2 <= AV21SDTTipoMovimiento.size() )
         {
            AV22SDTTipoMovimientoItem = (com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem)((com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem)AV21SDTTipoMovimiento.elementAt(-1+AV39GXV2));
            if ( GXutil.like( AV28SDTAlma_OrigenItem.getgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo() , GXutil.padr( GXutil.trim( AV6cTpmo_Codigo) , 2 , "%"),  ' ' ) )
            {
               AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
               AV38Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
               AV31Alma_Codigo = AV28SDTAlma_OrigenItem.getgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo() ;
               AV32Alma_Descripcion = AV28SDTAlma_OrigenItem.getgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion() ;
               /* Load Method */
               if ( wbStart != -1 )
               {
                  wbStart = (short)(34) ;
               }
               if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
               {
                  sendrow_342( ) ;
                  GRID1_nEOF = (byte)(1) ;
                  com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                  if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
                  {
                     GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
                  }
               }
               if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
               {
                  GRID1_nEOF = (byte)(0) ;
                  com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
               }
               GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
               if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
               {
                  httpContext.doAjaxLoad(34, Grid1Row);
               }
            }
            AV39GXV2 = (int)(AV39GXV2+1) ;
         }
      }
      else if ( ! (GXutil.strcmp("", AV7cTpmo_Descripcion)==0) )
      {
         AV40GXV3 = 1 ;
         while ( AV40GXV3 <= AV21SDTTipoMovimiento.size() )
         {
            AV22SDTTipoMovimientoItem = (com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem)((com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem)AV21SDTTipoMovimiento.elementAt(-1+AV40GXV3));
            if ( GXutil.like( GXutil.upper( AV28SDTAlma_OrigenItem.getgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion()) , GXutil.padr( GXutil.concat( "%", GXutil.trim( GXutil.upper( AV7cTpmo_Descripcion)), "") , 254 , "%"),  ' ' ) )
            {
               AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
               AV38Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
               AV31Alma_Codigo = AV28SDTAlma_OrigenItem.getgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_codigo() ;
               AV32Alma_Descripcion = AV28SDTAlma_OrigenItem.getgxTv_SdtSDTAlma_Origen_SDTAlma_OrigenItem_Alma_descripcion() ;
               /* Load Method */
               if ( wbStart != -1 )
               {
                  wbStart = (short)(34) ;
               }
               if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
               {
                  sendrow_342( ) ;
                  GRID1_nEOF = (byte)(1) ;
                  com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
                  if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
                  {
                     GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
                  }
               }
               if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
               {
                  GRID1_nEOF = (byte)(0) ;
                  com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
               }
               GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
               if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
               {
                  httpContext.doAjaxLoad(34, Grid1Row);
               }
            }
            AV40GXV3 = (int)(AV40GXV3+1) ;
         }
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28SDTAlma_OrigenItem", AV28SDTAlma_OrigenItem);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e166W2 ();
      if (returnInSub) return;
   }

   public void e166W2( )
   {
      /* Enter Routine */
      AV34pAlma_Codigo = AV31Alma_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34pAlma_Codigo", AV34pAlma_Codigo);
      AV33pAlma_Descripcion = AV32Alma_Descripcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33pAlma_Descripcion", AV33pAlma_Descripcion);
      httpContext.setWebReturnParms(new Object[] {AV34pAlma_Codigo,AV33pAlma_Descripcion,AV34pAlma_Codigo});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV23Tran_RegionId = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Tran_RegionId", GXutil.ltrim( GXutil.str( AV23Tran_RegionId, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_REGIONID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Tran_RegionId), "ZZZZZZZZZZ9")));
      AV24Tran_CentroCostoId = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV24Tran_CentroCostoId, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_CENTROCOSTOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Tran_CentroCostoId), "ZZZZZZZZZZ9")));
      AV25Tran_CodigoMovimiento = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Tran_CodigoMovimiento", AV25Tran_CodigoMovimiento);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_CODIGOMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25Tran_CodigoMovimiento, ""))));
      AV26Tran_ModuloOrigen = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Tran_ModuloOrigen", AV26Tran_ModuloOrigen);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26Tran_ModuloOrigen, ""))));
      AV34pAlma_Codigo = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34pAlma_Codigo", AV34pAlma_Codigo);
      AV33pAlma_Descripcion = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33pAlma_Descripcion", AV33pAlma_Descripcion);
      AV34pAlma_Codigo = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34pAlma_Codigo", AV34pAlma_Codigo);
   }

   public String getresponse( String sGXDynURL )
   {
      httpContext.setDefaultTheme("Carmine");
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa6W2( ) ;
      ws6W2( ) ;
      we6W2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414214521");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxalmaorigen.js", "?201861414214521");
      /* End function include_jscripts */
   }

   public void subsflControlProps_342( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_34_idx ;
      edtavAlma_codigo_Internalname = "vALMA_CODIGO_"+sGXsfl_34_idx ;
      edtavAlma_descripcion_Internalname = "vALMA_DESCRIPCION_"+sGXsfl_34_idx ;
   }

   public void subsflControlProps_fel_342( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_34_fel_idx ;
      edtavAlma_codigo_Internalname = "vALMA_CODIGO_"+sGXsfl_34_fel_idx ;
      edtavAlma_descripcion_Internalname = "vALMA_DESCRIPCION_"+sGXsfl_34_fel_idx ;
   }

   public void sendrow_342( )
   {
      subsflControlProps_342( ) ;
      wb6W0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_34_idx <= subgrid1_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_34_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"PromptGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_34_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavLinkselection_Enabled!=0)&&(edtavLinkselection_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 35,'',false,'',34)\"" : " ") ;
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV38Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV38Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(1),new Integer(17),"px",new Integer(11),"px",new Integer(0),new Integer(0),new Integer(5),edtavLinkselection_Jsonclick,"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_34_idx+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAlma_codigo_Enabled!=0)&&(edtavAlma_codigo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 36,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlma_codigo_Internalname,AV31Alma_Codigo,"",TempTags+((edtavAlma_codigo_Enabled!=0)&&(edtavAlma_codigo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavAlma_codigo_Enabled!=0)&&(edtavAlma_codigo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,36);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAlma_codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavAlma_codigo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAlma_descripcion_Enabled!=0)&&(edtavAlma_descripcion_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 37,'',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         edtavAlma_descripcion_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( AV31Alma_Codigo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( AV32Alma_Descripcion)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( AV31Alma_Codigo)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAlma_descripcion_Internalname, "Link", edtavAlma_descripcion_Link, !bGXsfl_34_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAlma_descripcion_Internalname,AV32Alma_Descripcion,GXutil.rtrim( localUtil.format( AV32Alma_Descripcion, "@!")),TempTags+((edtavAlma_descripcion_Enabled!=0)&&(edtavAlma_descripcion_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavAlma_descripcion_Enabled!=0)&&(edtavAlma_descripcion_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'",edtavAlma_descripcion_Link,"","","",edtavAlma_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavAlma_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(34),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_34_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_34_idx+1)) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_34_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      /* End function sendrow_342 */
   }

   public void init_default_properties( )
   {
      lblLbltpmo_codigofilter_Internalname = "LBLTPMO_CODIGOFILTER" ;
      edtavCtpmo_codigo_Internalname = "vCTPMO_CODIGO" ;
      divTpmo_codigofiltercontainer_Internalname = "TPMO_CODIGOFILTERCONTAINER" ;
      lblLbltpmo_descripcionfilter_Internalname = "LBLTPMO_DESCRIPCIONFILTER" ;
      edtavCtpmo_descripcion_Internalname = "vCTPMO_DESCRIPCION" ;
      divTpmo_descripcionfiltercontainer_Internalname = "TPMO_DESCRIPCIONFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtavAlma_codigo_Internalname = "vALMA_CODIGO" ;
      edtavAlma_descripcion_Internalname = "vALMA_DESCRIPCION" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divMain_Internalname = "MAIN" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavAlma_descripcion_Jsonclick = "" ;
      edtavAlma_descripcion_Visible = -1 ;
      edtavAlma_codigo_Jsonclick = "" ;
      edtavAlma_codigo_Visible = -1 ;
      edtavLinkselection_Jsonclick = "" ;
      edtavLinkselection_Visible = -1 ;
      edtavLinkselection_Enabled = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavAlma_descripcion_Link = "" ;
      edtavLinkselection_Link = "" ;
      edtavAlma_descripcion_Enabled = 1 ;
      edtavAlma_codigo_Enabled = 1 ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCtpmo_descripcion_Jsonclick = "" ;
      edtavCtpmo_descripcion_Enabled = 1 ;
      edtavCtpmo_descripcion_Visible = 1 ;
      edtavCtpmo_codigo_Jsonclick = "" ;
      edtavCtpmo_codigo_Enabled = 1 ;
      edtavCtpmo_codigo_Visible = 1 ;
      divTpmo_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divTpmo_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Almacen Origen" );
      subGrid1_Rows = 10 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTpmo_Codigo',fld:'vCTPMO_CODIGO',pic:'',nv:''},{av:'AV7cTpmo_Descripcion',fld:'vCTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV27SDTAlma_Origen',fld:'vSDTALMA_ORIGEN',pic:'',nv:null},{av:'AV21SDTTipoMovimiento',fld:'vSDTTIPOMOVIMIENTO',pic:'',nv:null},{av:'AV28SDTAlma_OrigenItem',fld:'vSDTALMA_ORIGENITEM',pic:'',nv:null}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e136W1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLTPMO_CODIGOFILTER.CLICK","{handler:'e116W1',iparms:[{av:'divTpmo_codigofiltercontainer_Class',ctrl:'TPMO_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_codigofiltercontainer_Class',ctrl:'TPMO_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCtpmo_codigo_Visible',ctrl:'vCTPMO_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLTPMO_DESCRIPCIONFILTER.CLICK","{handler:'e126W1',iparms:[{av:'divTpmo_descripcionfiltercontainer_Class',ctrl:'TPMO_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_descripcionfiltercontainer_Class',ctrl:'TPMO_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCtpmo_descripcion_Visible',ctrl:'vCTPMO_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e156W2',iparms:[{av:'AV6cTpmo_Codigo',fld:'vCTPMO_CODIGO',pic:'',nv:''},{av:'AV7cTpmo_Descripcion',fld:'vCTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV27SDTAlma_Origen',fld:'vSDTALMA_ORIGEN',pic:'',nv:null},{av:'AV21SDTTipoMovimiento',fld:'vSDTTIPOMOVIMIENTO',pic:'',nv:null},{av:'AV28SDTAlma_OrigenItem',fld:'vSDTALMA_ORIGENITEM',pic:'',nv:null}],oparms:[{av:'AV28SDTAlma_OrigenItem',fld:'vSDTALMA_ORIGENITEM',pic:'',nv:null},{av:'AV5LinkSelection',fld:'vLINKSELECTION',pic:'',nv:''},{av:'AV31Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV32Alma_Descripcion',fld:'vALMA_DESCRIPCION',pic:'@!',nv:''}]}");
      setEventMetadata("ENTER","{handler:'e166W2',iparms:[{av:'AV31Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV32Alma_Descripcion',fld:'vALMA_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'AV34pAlma_Codigo',fld:'vPALMA_CODIGO',pic:'',nv:''},{av:'AV33pAlma_Descripcion',fld:'vPALMA_DESCRIPCION',pic:'@!',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTpmo_Codigo',fld:'vCTPMO_CODIGO',pic:'',nv:''},{av:'AV7cTpmo_Descripcion',fld:'vCTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV27SDTAlma_Origen',fld:'vSDTALMA_ORIGEN',pic:'',nv:null},{av:'AV21SDTTipoMovimiento',fld:'vSDTTIPOMOVIMIENTO',pic:'',nv:null},{av:'AV28SDTAlma_OrigenItem',fld:'vSDTALMA_ORIGENITEM',pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTpmo_Codigo',fld:'vCTPMO_CODIGO',pic:'',nv:''},{av:'AV7cTpmo_Descripcion',fld:'vCTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV27SDTAlma_Origen',fld:'vSDTALMA_ORIGEN',pic:'',nv:null},{av:'AV21SDTTipoMovimiento',fld:'vSDTTIPOMOVIMIENTO',pic:'',nv:null},{av:'AV28SDTAlma_OrigenItem',fld:'vSDTALMA_ORIGENITEM',pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTpmo_Codigo',fld:'vCTPMO_CODIGO',pic:'',nv:''},{av:'AV7cTpmo_Descripcion',fld:'vCTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV27SDTAlma_Origen',fld:'vSDTALMA_ORIGEN',pic:'',nv:null},{av:'AV21SDTTipoMovimiento',fld:'vSDTTIPOMOVIMIENTO',pic:'',nv:null},{av:'AV28SDTAlma_OrigenItem',fld:'vSDTALMA_ORIGENITEM',pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTpmo_Codigo',fld:'vCTPMO_CODIGO',pic:'',nv:''},{av:'AV7cTpmo_Descripcion',fld:'vCTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV27SDTAlma_Origen',fld:'vSDTALMA_ORIGEN',pic:'',nv:null},{av:'AV21SDTTipoMovimiento',fld:'vSDTTIPOMOVIMIENTO',pic:'',nv:null},{av:'AV28SDTAlma_OrigenItem',fld:'vSDTALMA_ORIGENITEM',pic:'',nv:null}],oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV25Tran_CodigoMovimiento = "" ;
      wcpOAV26Tran_ModuloOrigen = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV6cTpmo_Codigo = "" ;
      AV7cTpmo_Descripcion = "" ;
      AV27SDTAlma_Origen = new GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem>(com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem.class, "SDTAlma_Origen.SDTAlma_OrigenItem", "ACBSENA", remoteHandle);
      AV21SDTTipoMovimiento = new GXBaseCollection<com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem>(com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem.class, "SDTTipoMovimiento.SDTTipoMovimientoItem", "ACBSENA", remoteHandle);
      AV28SDTAlma_OrigenItem = new com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem(remoteHandle, context);
      GXKey = "" ;
      AV25Tran_CodigoMovimiento = "" ;
      AV26Tran_ModuloOrigen = "" ;
      AV34pAlma_Codigo = "" ;
      AV33pAlma_Descripcion = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLbltpmo_codigofilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLbltpmo_descripcionfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      AV31Alma_Codigo = "" ;
      AV32Alma_Descripcion = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV38Linkselection_GXI = "" ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      GXt_objcol_SdtSDTAlma_Origen_SDTAlma_OrigenItem1 = new GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem>(com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem.class, "SDTAlma_Origen.SDTAlma_OrigenItem", "ACBSENA", remoteHandle);
      GXv_int2 = new long [1] ;
      GXv_int3 = new long [1] ;
      GXv_char4 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_objcol_SdtSDTAlma_Origen_SDTAlma_OrigenItem6 = new GXBaseCollection [1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      AV22SDTTipoMovimientoItem = new com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavAlma_codigo_Enabled = 0 ;
      edtavAlma_descripcion_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short nRC_GXsfl_34 ;
   private short nGXsfl_34_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCtpmo_codigo_Visible ;
   private int edtavCtpmo_codigo_Enabled ;
   private int edtavCtpmo_descripcion_Visible ;
   private int edtavCtpmo_descripcion_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavAlma_codigo_Enabled ;
   private int edtavAlma_descripcion_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GRID1_nGridOutOfScope ;
   private int AV37GXV1 ;
   private int AV39GXV2 ;
   private int AV40GXV3 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavLinkselection_Enabled ;
   private int edtavLinkselection_Visible ;
   private int edtavAlma_codigo_Visible ;
   private int edtavAlma_descripcion_Visible ;
   private long wcpOAV23Tran_RegionId ;
   private long wcpOAV24Tran_CentroCostoId ;
   private long AV23Tran_RegionId ;
   private long AV24Tran_CentroCostoId ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long GXv_int2[] ;
   private long GXv_int3[] ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divTpmo_codigofiltercontainer_Class ;
   private String divTpmo_descripcionfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_34_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divTpmo_codigofiltercontainer_Internalname ;
   private String lblLbltpmo_codigofilter_Internalname ;
   private String lblLbltpmo_codigofilter_Jsonclick ;
   private String edtavCtpmo_codigo_Internalname ;
   private String TempTags ;
   private String edtavCtpmo_codigo_Jsonclick ;
   private String divTpmo_descripcionfiltercontainer_Internalname ;
   private String lblLbltpmo_descripcionfilter_Internalname ;
   private String lblLbltpmo_descripcionfilter_Jsonclick ;
   private String edtavCtpmo_descripcion_Internalname ;
   private String edtavCtpmo_descripcion_Jsonclick ;
   private String divGridtable_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String edtavAlma_descripcion_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtavAlma_codigo_Internalname ;
   private String edtavAlma_descripcion_Internalname ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String sGXsfl_34_fel_idx="0001" ;
   private String sImgUrl ;
   private String edtavLinkselection_Jsonclick ;
   private String ROClassString ;
   private String edtavAlma_codigo_Jsonclick ;
   private String edtavAlma_descripcion_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_34_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String wcpOAV25Tran_CodigoMovimiento ;
   private String wcpOAV26Tran_ModuloOrigen ;
   private String AV6cTpmo_Codigo ;
   private String AV7cTpmo_Descripcion ;
   private String AV25Tran_CodigoMovimiento ;
   private String AV26Tran_ModuloOrigen ;
   private String AV34pAlma_Codigo ;
   private String AV33pAlma_Descripcion ;
   private String AV31Alma_Codigo ;
   private String AV32Alma_Descripcion ;
   private String AV38Linkselection_GXI ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem> AV21SDTTipoMovimiento ;
   private GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem> AV27SDTAlma_Origen ;
   private GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem> GXt_objcol_SdtSDTAlma_Origen_SDTAlma_OrigenItem1 ;
   private GXBaseCollection<com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem> GXv_objcol_SdtSDTAlma_Origen_SDTAlma_OrigenItem6[] ;
   private com.orions2.SdtSDTTipoMovimiento_SDTTipoMovimientoItem AV22SDTTipoMovimientoItem ;
   private com.orions2.SdtSDTAlma_Origen_SDTAlma_OrigenItem AV28SDTAlma_OrigenItem ;
}

