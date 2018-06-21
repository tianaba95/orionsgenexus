/*
               File: gx01i0_impl
        Description: Selection List Tipo de Novedad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:27.98
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

public final  class gx01i0_impl extends GXDataArea
{
   public gx01i0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx01i0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx01i0_impl.class ));
   }

   public gx01i0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCtnov_tipo = new HTMLChoice();
      cmbavCtnov_ingresomasivo = new HTMLChoice();
      cmbavCtnov_estado = new HTMLChoice();
      cmbTNov_Tipo = new HTMLChoice();
      cmbTNov_Estado = new HTMLChoice();
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
            nRC_GXsfl_84 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_84_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_84_idx = httpContext.GetNextPar( ) ;
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
            AV6cTNov_Codigo = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cTNov_Tipo = httpContext.GetNextPar( ) ;
            AV8cTNov_Nro_Cambios = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9cTNov_Procedimiento = httpContext.GetNextPar( ) ;
            AV10cTNov_Nombre_Campo = httpContext.GetNextPar( ) ;
            AV11cTNov_IngresoMasivo = httpContext.GetNextPar( ) ;
            AV12cTNov_Estado = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cTNov_Codigo, AV7cTNov_Tipo, AV8cTNov_Nro_Cambios, AV9cTNov_Procedimiento, AV10cTNov_Nombre_Campo, AV11cTNov_IngresoMasivo, AV12cTNov_Estado) ;
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
            AV13pTNov_Codigo = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pTNov_Codigo", GXutil.ltrim( GXutil.str( AV13pTNov_Codigo, 6, 0)));
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
         MasterPageObj.setDataArea(this,true);
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
      pa8I2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8I2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141424284");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx01i0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pTNov_Codigo,6,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTNOV_CODIGO", GXutil.ltrim( localUtil.ntoc( AV6cTNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTNOV_TIPO", AV7cTNov_Tipo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTNOV_NRO_CAMBIOS", GXutil.ltrim( localUtil.ntoc( AV8cTNov_Nro_Cambios, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTNOV_PROCEDIMIENTO", AV9cTNov_Procedimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTNOV_NOMBRE_CAMPO", AV10cTNov_Nombre_Campo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTNOV_INGRESOMASIVO", AV11cTNov_IngresoMasivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTNOV_ESTADO", GXutil.rtrim( AV12cTNov_Estado));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTNOV_CODIGO", GXutil.ltrim( localUtil.ntoc( AV13pTNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divTnov_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_TIPOFILTERCONTAINER_Class", GXutil.rtrim( divTnov_tipofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_NRO_CAMBIOSFILTERCONTAINER_Class", GXutil.rtrim( divTnov_nro_cambiosfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_PROCEDIMIENTOFILTERCONTAINER_Class", GXutil.rtrim( divTnov_procedimientofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_NOMBRE_CAMPOFILTERCONTAINER_Class", GXutil.rtrim( divTnov_nombre_campofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_INGRESOMASIVOFILTERCONTAINER_Class", GXutil.rtrim( divTnov_ingresomasivofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_ESTADOFILTERCONTAINER_Class", GXutil.rtrim( divTnov_estadofiltercontainer_Class));
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
         we8I2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8I2( ) ;
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
      return formatLink("com.orions2.gx01i0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pTNov_Codigo,6,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx01I0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Tipo de Novedad" ;
   }

   public void wb8I0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTnov_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTnov_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltnov_codigofilter_Internalname, "Código de la Novedad", "", "", lblLbltnov_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e118i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01I0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtnov_codigo_Internalname, "Código de la Novedad", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtnov_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cTNov_Codigo, (byte)(6), (byte)(0), ",", "")), ((edtavCtnov_codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cTNov_Codigo), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cTNov_Codigo), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtnov_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCtnov_codigo_Visible, edtavCtnov_codigo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01I0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTnov_tipofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTnov_tipofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltnov_tipofilter_Internalname, "Tipo de Novedad", "", "", lblLbltnov_tipofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e128i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01I0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCtnov_tipo.getInternalname(), "Tipo de Novedad", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCtnov_tipo, cmbavCtnov_tipo.getInternalname(), GXutil.rtrim( AV7cTNov_Tipo), 1, cmbavCtnov_tipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavCtnov_tipo.getVisible(), cmbavCtnov_tipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "", true, "HLP_Gx01I0.htm");
         cmbavCtnov_tipo.setValue( GXutil.rtrim( AV7cTNov_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtnov_tipo.getInternalname(), "Values", cmbavCtnov_tipo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTnov_nro_cambiosfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTnov_nro_cambiosfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltnov_nro_cambiosfilter_Internalname, "Número de cambios", "", "", lblLbltnov_nro_cambiosfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e138i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01I0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtnov_nro_cambios_Internalname, "Número de cambios", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtnov_nro_cambios_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cTNov_Nro_Cambios, (byte)(4), (byte)(0), ",", "")), ((edtavCtnov_nro_cambios_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cTNov_Nro_Cambios), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cTNov_Nro_Cambios), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtnov_nro_cambios_Jsonclick, 0, "Attribute", "", "", "", edtavCtnov_nro_cambios_Visible, edtavCtnov_nro_cambios_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01I0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTnov_procedimientofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTnov_procedimientofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltnov_procedimientofilter_Internalname, "Procedimiento", "", "", lblLbltnov_procedimientofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e148i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01I0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtnov_procedimiento_Internalname, "Procedimiento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtnov_procedimiento_Internalname, AV9cTNov_Procedimiento, GXutil.rtrim( localUtil.format( AV9cTNov_Procedimiento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtnov_procedimiento_Jsonclick, 0, "Attribute", "", "", "", edtavCtnov_procedimiento_Visible, edtavCtnov_procedimiento_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01I0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTnov_nombre_campofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTnov_nombre_campofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltnov_nombre_campofilter_Internalname, "Nombre del Campo", "", "", lblLbltnov_nombre_campofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e158i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01I0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtnov_nombre_campo_Internalname, "Nombre del Campo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtnov_nombre_campo_Internalname, AV10cTNov_Nombre_Campo, GXutil.rtrim( localUtil.format( AV10cTNov_Nombre_Campo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtnov_nombre_campo_Jsonclick, 0, "Attribute", "", "", "", edtavCtnov_nombre_campo_Visible, edtavCtnov_nombre_campo_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01I0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTnov_ingresomasivofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTnov_ingresomasivofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltnov_ingresomasivofilter_Internalname, "Ingreso Masivo", "", "", lblLbltnov_ingresomasivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e168i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01I0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCtnov_ingresomasivo.getInternalname(), "Ingreso Masivo", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCtnov_ingresomasivo, cmbavCtnov_ingresomasivo.getInternalname(), GXutil.rtrim( AV11cTNov_IngresoMasivo), 1, cmbavCtnov_ingresomasivo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavCtnov_ingresomasivo.getVisible(), cmbavCtnov_ingresomasivo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "", true, "HLP_Gx01I0.htm");
         cmbavCtnov_ingresomasivo.setValue( GXutil.rtrim( AV11cTNov_IngresoMasivo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtnov_ingresomasivo.getInternalname(), "Values", cmbavCtnov_ingresomasivo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTnov_estadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTnov_estadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltnov_estadofilter_Internalname, "Estado", "", "", lblLbltnov_estadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e178i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01I0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCtnov_estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCtnov_estado, cmbavCtnov_estado.getInternalname(), GXutil.rtrim( AV12cTNov_Estado), 1, cmbavCtnov_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavCtnov_estado.getVisible(), cmbavCtnov_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "", true, "HLP_Gx01I0.htm");
         cmbavCtnov_estado.setValue( GXutil.rtrim( AV12cTNov_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtnov_estado.getInternalname(), "Values", cmbavCtnov_estado.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e188i1_client"+"'", TempTags, "", 2, "HLP_Gx01I0.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"84\">") ;
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
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"SelectionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Número de cambios") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Procedimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               Grid1Container.Clear();
            }
            Grid1Container.SetWrapped(nGXWrapped);
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A770TNov_Tipo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A771TNov_Nro_Cambios, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A772TNov_Procedimiento);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A773TNov_Estado));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 84 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_84 = (short)(nGXsfl_84_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx01I0.htm");
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

   public void start8I2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Tipo de Novedad", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8I0( ) ;
   }

   public void ws8I2( )
   {
      start8I2( ) ;
      evt8I2( ) ;
   }

   public void evt8I2( )
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_84_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_842( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_84_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( edtTNov_Codigo_Internalname), ",", ".")) ;
                           cmbTNov_Tipo.setName( cmbTNov_Tipo.getInternalname() );
                           cmbTNov_Tipo.setValue( httpContext.cgiGet( cmbTNov_Tipo.getInternalname()) );
                           A770TNov_Tipo = httpContext.cgiGet( cmbTNov_Tipo.getInternalname()) ;
                           n770TNov_Tipo = false ;
                           A771TNov_Nro_Cambios = (short)(localUtil.ctol( httpContext.cgiGet( edtTNov_Nro_Cambios_Internalname), ",", ".")) ;
                           n771TNov_Nro_Cambios = false ;
                           A772TNov_Procedimiento = httpContext.cgiGet( edtTNov_Procedimiento_Internalname) ;
                           n772TNov_Procedimiento = false ;
                           cmbTNov_Estado.setName( cmbTNov_Estado.getInternalname() );
                           cmbTNov_Estado.setValue( httpContext.cgiGet( cmbTNov_Estado.getInternalname()) );
                           A773TNov_Estado = httpContext.cgiGet( cmbTNov_Estado.getInternalname()) ;
                           n773TNov_Estado = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e198I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e208I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Ctnov_codigo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTNOV_CODIGO"), ",", ".") != AV6cTNov_Codigo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctnov_tipo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTNOV_TIPO"), AV7cTNov_Tipo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctnov_nro_cambios Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTNOV_NRO_CAMBIOS"), ",", ".") != AV8cTNov_Nro_Cambios )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctnov_procedimiento Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTNOV_PROCEDIMIENTO"), AV9cTNov_Procedimiento) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctnov_nombre_campo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTNOV_NOMBRE_CAMPO"), AV10cTNov_Nombre_Campo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctnov_ingresomasivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTNOV_INGRESOMASIVO"), AV11cTNov_IngresoMasivo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctnov_estado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTNOV_ESTADO"), AV12cTNov_Estado) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e218I2 ();
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

   public void we8I2( )
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

   public void pa8I2( )
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
         cmbavCtnov_tipo.setName( "vCTNOV_TIPO" );
         cmbavCtnov_tipo.setWebtags( "" );
         cmbavCtnov_tipo.addItem("T", "Transacción", (short)(0));
         cmbavCtnov_tipo.addItem("P", "Consecutivo o Placa", (short)(0));
         cmbavCtnov_tipo.addItem("D", "Las dos", (short)(0));
         if ( cmbavCtnov_tipo.getItemCount() > 0 )
         {
            AV7cTNov_Tipo = cmbavCtnov_tipo.getValidValue(AV7cTNov_Tipo) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTNov_Tipo", AV7cTNov_Tipo);
         }
         cmbavCtnov_ingresomasivo.setName( "vCTNOV_INGRESOMASIVO" );
         cmbavCtnov_ingresomasivo.setWebtags( "" );
         cmbavCtnov_ingresomasivo.addItem("", "", (short)(0));
         cmbavCtnov_ingresomasivo.addItem("SI", "SI", (short)(0));
         cmbavCtnov_ingresomasivo.addItem("NO", "NO", (short)(0));
         if ( cmbavCtnov_ingresomasivo.getItemCount() > 0 )
         {
            AV11cTNov_IngresoMasivo = cmbavCtnov_ingresomasivo.getValidValue(AV11cTNov_IngresoMasivo) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cTNov_IngresoMasivo", AV11cTNov_IngresoMasivo);
         }
         cmbavCtnov_estado.setName( "vCTNOV_ESTADO" );
         cmbavCtnov_estado.setWebtags( "" );
         cmbavCtnov_estado.addItem("A", "Activo", (short)(0));
         cmbavCtnov_estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbavCtnov_estado.getItemCount() > 0 )
         {
            AV12cTNov_Estado = cmbavCtnov_estado.getValidValue(AV12cTNov_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cTNov_Estado", AV12cTNov_Estado);
         }
         GXCCtl = "TNOV_TIPO_" + sGXsfl_84_idx ;
         cmbTNov_Tipo.setName( GXCCtl );
         cmbTNov_Tipo.setWebtags( "" );
         cmbTNov_Tipo.addItem("T", "Transacción", (short)(0));
         cmbTNov_Tipo.addItem("P", "Consecutivo o Placa", (short)(0));
         cmbTNov_Tipo.addItem("D", "Las dos", (short)(0));
         if ( cmbTNov_Tipo.getItemCount() > 0 )
         {
            A770TNov_Tipo = cmbTNov_Tipo.getValidValue(A770TNov_Tipo) ;
            n770TNov_Tipo = false ;
         }
         GXCCtl = "TNOV_ESTADO_" + sGXsfl_84_idx ;
         cmbTNov_Estado.setName( GXCCtl );
         cmbTNov_Estado.setWebtags( "" );
         cmbTNov_Estado.addItem("A", "Activo", (short)(0));
         cmbTNov_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbTNov_Estado.getItemCount() > 0 )
         {
            A773TNov_Estado = cmbTNov_Estado.getValidValue(A773TNov_Estado) ;
            n773TNov_Estado = false ;
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
      subsflControlProps_842( ) ;
      while ( nGXsfl_84_idx <= nRC_GXsfl_84 )
      {
         sendrow_842( ) ;
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  int AV6cTNov_Codigo ,
                                  String AV7cTNov_Tipo ,
                                  short AV8cTNov_Nro_Cambios ,
                                  String AV9cTNov_Procedimiento ,
                                  String AV10cTNov_Nombre_Campo ,
                                  String AV11cTNov_IngresoMasivo ,
                                  String AV12cTNov_Estado )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf8I2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_CODIGO", GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_TIPO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A770TNov_Tipo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_TIPO", A770TNov_Tipo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_NRO_CAMBIOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A771TNov_Nro_Cambios), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_NRO_CAMBIOS", GXutil.ltrim( localUtil.ntoc( A771TNov_Nro_Cambios, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_PROCEDIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A772TNov_Procedimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_PROCEDIMIENTO", A772TNov_Procedimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A773TNov_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_ESTADO", GXutil.rtrim( A773TNov_Estado));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCtnov_tipo.getItemCount() > 0 )
      {
         AV7cTNov_Tipo = cmbavCtnov_tipo.getValidValue(AV7cTNov_Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTNov_Tipo", AV7cTNov_Tipo);
      }
      if ( cmbavCtnov_ingresomasivo.getItemCount() > 0 )
      {
         AV11cTNov_IngresoMasivo = cmbavCtnov_ingresomasivo.getValidValue(AV11cTNov_IngresoMasivo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTNov_IngresoMasivo", AV11cTNov_IngresoMasivo);
      }
      if ( cmbavCtnov_estado.getItemCount() > 0 )
      {
         AV12cTNov_Estado = cmbavCtnov_estado.getValidValue(AV12cTNov_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTNov_Estado", AV12cTNov_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8I2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf8I2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(84) ;
      nGXsfl_84_idx = (short)(1) ;
      sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_842( ) ;
      bGXsfl_84_Refreshing = true ;
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
         subsflControlProps_842( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV7cTNov_Tipo ,
                                              new Short(AV8cTNov_Nro_Cambios) ,
                                              AV9cTNov_Procedimiento ,
                                              AV10cTNov_Nombre_Campo ,
                                              AV11cTNov_IngresoMasivo ,
                                              AV12cTNov_Estado ,
                                              A770TNov_Tipo ,
                                              new Short(A771TNov_Nro_Cambios) ,
                                              A772TNov_Procedimiento ,
                                              A774TNov_Nombre_Campo ,
                                              A813TNov_IngresoMasivo ,
                                              A773TNov_Estado ,
                                              new Integer(AV6cTNov_Codigo) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                              }
         } ) ;
         lV7cTNov_Tipo = GXutil.concat( GXutil.rtrim( AV7cTNov_Tipo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTNov_Tipo", AV7cTNov_Tipo);
         lV9cTNov_Procedimiento = GXutil.concat( GXutil.rtrim( AV9cTNov_Procedimiento), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cTNov_Procedimiento", AV9cTNov_Procedimiento);
         lV10cTNov_Nombre_Campo = GXutil.concat( GXutil.rtrim( AV10cTNov_Nombre_Campo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cTNov_Nombre_Campo", AV10cTNov_Nombre_Campo);
         lV11cTNov_IngresoMasivo = GXutil.concat( GXutil.rtrim( AV11cTNov_IngresoMasivo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTNov_IngresoMasivo", AV11cTNov_IngresoMasivo);
         lV12cTNov_Estado = GXutil.padr( GXutil.rtrim( AV12cTNov_Estado), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTNov_Estado", AV12cTNov_Estado);
         /* Using cursor H008I2 */
         pr_default.execute(0, new Object[] {new Integer(AV6cTNov_Codigo), lV7cTNov_Tipo, new Short(AV8cTNov_Nro_Cambios), lV9cTNov_Procedimiento, lV10cTNov_Nombre_Campo, lV11cTNov_IngresoMasivo, lV12cTNov_Estado, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A813TNov_IngresoMasivo = H008I2_A813TNov_IngresoMasivo[0] ;
            n813TNov_IngresoMasivo = H008I2_n813TNov_IngresoMasivo[0] ;
            A774TNov_Nombre_Campo = H008I2_A774TNov_Nombre_Campo[0] ;
            n774TNov_Nombre_Campo = H008I2_n774TNov_Nombre_Campo[0] ;
            A773TNov_Estado = H008I2_A773TNov_Estado[0] ;
            n773TNov_Estado = H008I2_n773TNov_Estado[0] ;
            A772TNov_Procedimiento = H008I2_A772TNov_Procedimiento[0] ;
            n772TNov_Procedimiento = H008I2_n772TNov_Procedimiento[0] ;
            A771TNov_Nro_Cambios = H008I2_A771TNov_Nro_Cambios[0] ;
            n771TNov_Nro_Cambios = H008I2_n771TNov_Nro_Cambios[0] ;
            A770TNov_Tipo = H008I2_A770TNov_Tipo[0] ;
            n770TNov_Tipo = H008I2_n770TNov_Tipo[0] ;
            A104TNov_Codigo = H008I2_A104TNov_Codigo[0] ;
            /* Execute user event: Load */
            e208I2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb8I0( ) ;
      }
      bGXsfl_84_Refreshing = true ;
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV7cTNov_Tipo ,
                                           new Short(AV8cTNov_Nro_Cambios) ,
                                           AV9cTNov_Procedimiento ,
                                           AV10cTNov_Nombre_Campo ,
                                           AV11cTNov_IngresoMasivo ,
                                           AV12cTNov_Estado ,
                                           A770TNov_Tipo ,
                                           new Short(A771TNov_Nro_Cambios) ,
                                           A772TNov_Procedimiento ,
                                           A774TNov_Nombre_Campo ,
                                           A813TNov_IngresoMasivo ,
                                           A773TNov_Estado ,
                                           new Integer(AV6cTNov_Codigo) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                           }
      } ) ;
      lV7cTNov_Tipo = GXutil.concat( GXutil.rtrim( AV7cTNov_Tipo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cTNov_Tipo", AV7cTNov_Tipo);
      lV9cTNov_Procedimiento = GXutil.concat( GXutil.rtrim( AV9cTNov_Procedimiento), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cTNov_Procedimiento", AV9cTNov_Procedimiento);
      lV10cTNov_Nombre_Campo = GXutil.concat( GXutil.rtrim( AV10cTNov_Nombre_Campo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10cTNov_Nombre_Campo", AV10cTNov_Nombre_Campo);
      lV11cTNov_IngresoMasivo = GXutil.concat( GXutil.rtrim( AV11cTNov_IngresoMasivo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cTNov_IngresoMasivo", AV11cTNov_IngresoMasivo);
      lV12cTNov_Estado = GXutil.padr( GXutil.rtrim( AV12cTNov_Estado), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cTNov_Estado", AV12cTNov_Estado);
      /* Using cursor H008I3 */
      pr_default.execute(1, new Object[] {new Integer(AV6cTNov_Codigo), lV7cTNov_Tipo, new Short(AV8cTNov_Nro_Cambios), lV9cTNov_Procedimiento, lV10cTNov_Nombre_Campo, lV11cTNov_IngresoMasivo, lV12cTNov_Estado});
      GRID1_nRecordCount = H008I3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
   }

   public int subgrid1_recordsperpage( )
   {
      return 10*1 ;
   }

   public int subgrid1_currentpage( )
   {
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTNov_Codigo, AV7cTNov_Tipo, AV8cTNov_Nro_Cambios, AV9cTNov_Procedimiento, AV10cTNov_Nombre_Campo, AV11cTNov_IngresoMasivo, AV12cTNov_Estado) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTNov_Codigo, AV7cTNov_Tipo, AV8cTNov_Nro_Cambios, AV9cTNov_Procedimiento, AV10cTNov_Nombre_Campo, AV11cTNov_IngresoMasivo, AV12cTNov_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTNov_Codigo, AV7cTNov_Tipo, AV8cTNov_Nro_Cambios, AV9cTNov_Procedimiento, AV10cTNov_Nombre_Campo, AV11cTNov_IngresoMasivo, AV12cTNov_Estado) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTNov_Codigo, AV7cTNov_Tipo, AV8cTNov_Nro_Cambios, AV9cTNov_Procedimiento, AV10cTNov_Nombre_Campo, AV11cTNov_IngresoMasivo, AV12cTNov_Estado) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cTNov_Codigo, AV7cTNov_Tipo, AV8cTNov_Nro_Cambios, AV9cTNov_Procedimiento, AV10cTNov_Nombre_Campo, AV11cTNov_IngresoMasivo, AV12cTNov_Estado) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup8I0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e198I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtnov_codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtnov_codigo_Internalname), ",", ".") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTNOV_CODIGO");
            GX_FocusControl = edtavCtnov_codigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cTNov_Codigo = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTNov_Codigo", GXutil.ltrim( GXutil.str( AV6cTNov_Codigo, 6, 0)));
         }
         else
         {
            AV6cTNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( edtavCtnov_codigo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cTNov_Codigo", GXutil.ltrim( GXutil.str( AV6cTNov_Codigo, 6, 0)));
         }
         cmbavCtnov_tipo.setName( cmbavCtnov_tipo.getInternalname() );
         cmbavCtnov_tipo.setValue( httpContext.cgiGet( cmbavCtnov_tipo.getInternalname()) );
         AV7cTNov_Tipo = httpContext.cgiGet( cmbavCtnov_tipo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTNov_Tipo", AV7cTNov_Tipo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtnov_nro_cambios_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtnov_nro_cambios_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTNOV_NRO_CAMBIOS");
            GX_FocusControl = edtavCtnov_nro_cambios_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cTNov_Nro_Cambios = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cTNov_Nro_Cambios", GXutil.ltrim( GXutil.str( AV8cTNov_Nro_Cambios, 4, 0)));
         }
         else
         {
            AV8cTNov_Nro_Cambios = (short)(localUtil.ctol( httpContext.cgiGet( edtavCtnov_nro_cambios_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cTNov_Nro_Cambios", GXutil.ltrim( GXutil.str( AV8cTNov_Nro_Cambios, 4, 0)));
         }
         AV9cTNov_Procedimiento = httpContext.cgiGet( edtavCtnov_procedimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cTNov_Procedimiento", AV9cTNov_Procedimiento);
         AV10cTNov_Nombre_Campo = httpContext.cgiGet( edtavCtnov_nombre_campo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cTNov_Nombre_Campo", AV10cTNov_Nombre_Campo);
         cmbavCtnov_ingresomasivo.setName( cmbavCtnov_ingresomasivo.getInternalname() );
         cmbavCtnov_ingresomasivo.setValue( httpContext.cgiGet( cmbavCtnov_ingresomasivo.getInternalname()) );
         AV11cTNov_IngresoMasivo = httpContext.cgiGet( cmbavCtnov_ingresomasivo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cTNov_IngresoMasivo", AV11cTNov_IngresoMasivo);
         cmbavCtnov_estado.setName( cmbavCtnov_estado.getInternalname() );
         cmbavCtnov_estado.setValue( httpContext.cgiGet( cmbavCtnov_estado.getInternalname()) );
         AV12cTNov_Estado = httpContext.cgiGet( cmbavCtnov_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cTNov_Estado", AV12cTNov_Estado);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTNOV_CODIGO"), ",", ".") != AV6cTNov_Codigo )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTNOV_TIPO"), AV7cTNov_Tipo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTNOV_NRO_CAMBIOS"), ",", ".") != AV8cTNov_Nro_Cambios )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTNOV_PROCEDIMIENTO"), AV9cTNov_Procedimiento) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTNOV_NOMBRE_CAMPO"), AV10cTNov_Nombre_Campo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTNOV_INGRESOMASIVO"), AV11cTNov_IngresoMasivo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTNOV_ESTADO"), AV12cTNov_Estado) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e198I2 ();
      if (returnInSub) return;
   }

   public void e198I2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Tipo de Novedad", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e208I2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV17Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_842( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_84_Refreshing )
      {
         httpContext.doAjaxLoad(84, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e218I2 ();
      if (returnInSub) return;
   }

   public void e218I2( )
   {
      /* Enter Routine */
      AV13pTNov_Codigo = A104TNov_Codigo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTNov_Codigo", GXutil.ltrim( GXutil.str( AV13pTNov_Codigo, 6, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV13pTNov_Codigo)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pTNov_Codigo = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pTNov_Codigo", GXutil.ltrim( GXutil.str( AV13pTNov_Codigo, 6, 0)));
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
      pa8I2( ) ;
      ws8I2( ) ;
      we8I2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414242934");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx01i0.js", "?201861414242934");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtTNov_Codigo_Internalname = "TNOV_CODIGO_"+sGXsfl_84_idx ;
      cmbTNov_Tipo.setInternalname( "TNOV_TIPO_"+sGXsfl_84_idx );
      edtTNov_Nro_Cambios_Internalname = "TNOV_NRO_CAMBIOS_"+sGXsfl_84_idx ;
      edtTNov_Procedimiento_Internalname = "TNOV_PROCEDIMIENTO_"+sGXsfl_84_idx ;
      cmbTNov_Estado.setInternalname( "TNOV_ESTADO_"+sGXsfl_84_idx );
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtTNov_Codigo_Internalname = "TNOV_CODIGO_"+sGXsfl_84_fel_idx ;
      cmbTNov_Tipo.setInternalname( "TNOV_TIPO_"+sGXsfl_84_fel_idx );
      edtTNov_Nro_Cambios_Internalname = "TNOV_NRO_CAMBIOS_"+sGXsfl_84_fel_idx ;
      edtTNov_Procedimiento_Internalname = "TNOV_PROCEDIMIENTO_"+sGXsfl_84_fel_idx ;
      cmbTNov_Estado.setInternalname( "TNOV_ESTADO_"+sGXsfl_84_fel_idx );
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb8I0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_84_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_84_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_84_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV17Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV17Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Codigo","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TNOV_TIPO_" + sGXsfl_84_idx ;
            cmbTNov_Tipo.setName( GXCCtl );
            cmbTNov_Tipo.setWebtags( "" );
            cmbTNov_Tipo.addItem("T", "Transacción", (short)(0));
            cmbTNov_Tipo.addItem("P", "Consecutivo o Placa", (short)(0));
            cmbTNov_Tipo.addItem("D", "Las dos", (short)(0));
            if ( cmbTNov_Tipo.getItemCount() > 0 )
            {
               A770TNov_Tipo = cmbTNov_Tipo.getValidValue(A770TNov_Tipo) ;
               n770TNov_Tipo = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTNov_Tipo,cmbTNov_Tipo.getInternalname(),GXutil.rtrim( A770TNov_Tipo),new Integer(1),cmbTNov_Tipo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbTNov_Tipo.setValue( GXutil.rtrim( A770TNov_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTNov_Tipo.getInternalname(), "Values", cmbTNov_Tipo.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Nro_Cambios_Internalname,GXutil.ltrim( localUtil.ntoc( A771TNov_Nro_Cambios, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A771TNov_Nro_Cambios), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Nro_Cambios_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Procedimiento_Internalname,A772TNov_Procedimiento,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Procedimiento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(60),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TNOV_ESTADO_" + sGXsfl_84_idx ;
            cmbTNov_Estado.setName( GXCCtl );
            cmbTNov_Estado.setWebtags( "" );
            cmbTNov_Estado.addItem("A", "Activo", (short)(0));
            cmbTNov_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbTNov_Estado.getItemCount() > 0 )
            {
               A773TNov_Estado = cmbTNov_Estado.getValidValue(A773TNov_Estado) ;
               n773TNov_Estado = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTNov_Estado,cmbTNov_Estado.getInternalname(),GXutil.rtrim( A773TNov_Estado),new Integer(1),cmbTNov_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbTNov_Estado.setValue( GXutil.rtrim( A773TNov_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTNov_Estado.getInternalname(), "Values", cmbTNov_Estado.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_CODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_TIPO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A770TNov_Tipo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_NRO_CAMBIOS"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A771TNov_Nro_Cambios), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_PROCEDIMIENTO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A772TNov_Procedimiento, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_ESTADO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A773TNov_Estado, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLbltnov_codigofilter_Internalname = "LBLTNOV_CODIGOFILTER" ;
      edtavCtnov_codigo_Internalname = "vCTNOV_CODIGO" ;
      divTnov_codigofiltercontainer_Internalname = "TNOV_CODIGOFILTERCONTAINER" ;
      lblLbltnov_tipofilter_Internalname = "LBLTNOV_TIPOFILTER" ;
      cmbavCtnov_tipo.setInternalname( "vCTNOV_TIPO" );
      divTnov_tipofiltercontainer_Internalname = "TNOV_TIPOFILTERCONTAINER" ;
      lblLbltnov_nro_cambiosfilter_Internalname = "LBLTNOV_NRO_CAMBIOSFILTER" ;
      edtavCtnov_nro_cambios_Internalname = "vCTNOV_NRO_CAMBIOS" ;
      divTnov_nro_cambiosfiltercontainer_Internalname = "TNOV_NRO_CAMBIOSFILTERCONTAINER" ;
      lblLbltnov_procedimientofilter_Internalname = "LBLTNOV_PROCEDIMIENTOFILTER" ;
      edtavCtnov_procedimiento_Internalname = "vCTNOV_PROCEDIMIENTO" ;
      divTnov_procedimientofiltercontainer_Internalname = "TNOV_PROCEDIMIENTOFILTERCONTAINER" ;
      lblLbltnov_nombre_campofilter_Internalname = "LBLTNOV_NOMBRE_CAMPOFILTER" ;
      edtavCtnov_nombre_campo_Internalname = "vCTNOV_NOMBRE_CAMPO" ;
      divTnov_nombre_campofiltercontainer_Internalname = "TNOV_NOMBRE_CAMPOFILTERCONTAINER" ;
      lblLbltnov_ingresomasivofilter_Internalname = "LBLTNOV_INGRESOMASIVOFILTER" ;
      cmbavCtnov_ingresomasivo.setInternalname( "vCTNOV_INGRESOMASIVO" );
      divTnov_ingresomasivofiltercontainer_Internalname = "TNOV_INGRESOMASIVOFILTERCONTAINER" ;
      lblLbltnov_estadofilter_Internalname = "LBLTNOV_ESTADOFILTER" ;
      cmbavCtnov_estado.setInternalname( "vCTNOV_ESTADO" );
      divTnov_estadofiltercontainer_Internalname = "TNOV_ESTADOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtTNov_Codigo_Internalname = "TNOV_CODIGO" ;
      cmbTNov_Tipo.setInternalname( "TNOV_TIPO" );
      edtTNov_Nro_Cambios_Internalname = "TNOV_NRO_CAMBIOS" ;
      edtTNov_Procedimiento_Internalname = "TNOV_PROCEDIMIENTO" ;
      cmbTNov_Estado.setInternalname( "TNOV_ESTADO" );
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
      cmbTNov_Estado.setJsonclick( "" );
      edtTNov_Procedimiento_Jsonclick = "" ;
      edtTNov_Nro_Cambios_Jsonclick = "" ;
      cmbTNov_Tipo.setJsonclick( "" );
      edtTNov_Codigo_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavCtnov_estado.setJsonclick( "" );
      cmbavCtnov_estado.setEnabled( 1 );
      cmbavCtnov_estado.setVisible( 1 );
      cmbavCtnov_ingresomasivo.setJsonclick( "" );
      cmbavCtnov_ingresomasivo.setEnabled( 1 );
      cmbavCtnov_ingresomasivo.setVisible( 1 );
      edtavCtnov_nombre_campo_Jsonclick = "" ;
      edtavCtnov_nombre_campo_Enabled = 1 ;
      edtavCtnov_nombre_campo_Visible = 1 ;
      edtavCtnov_procedimiento_Jsonclick = "" ;
      edtavCtnov_procedimiento_Enabled = 1 ;
      edtavCtnov_procedimiento_Visible = 1 ;
      edtavCtnov_nro_cambios_Jsonclick = "" ;
      edtavCtnov_nro_cambios_Enabled = 1 ;
      edtavCtnov_nro_cambios_Visible = 1 ;
      cmbavCtnov_tipo.setJsonclick( "" );
      cmbavCtnov_tipo.setEnabled( 1 );
      cmbavCtnov_tipo.setVisible( 1 );
      edtavCtnov_codigo_Jsonclick = "" ;
      edtavCtnov_codigo_Enabled = 1 ;
      edtavCtnov_codigo_Visible = 1 ;
      divTnov_estadofiltercontainer_Class = "AdvancedContainerItem" ;
      divTnov_ingresomasivofiltercontainer_Class = "AdvancedContainerItem" ;
      divTnov_nombre_campofiltercontainer_Class = "AdvancedContainerItem" ;
      divTnov_procedimientofiltercontainer_Class = "AdvancedContainerItem" ;
      divTnov_nro_cambiosfiltercontainer_Class = "AdvancedContainerItem" ;
      divTnov_tipofiltercontainer_Class = "AdvancedContainerItem" ;
      divTnov_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Tipo de Novedad" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTNov_Codigo',fld:'vCTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'cmbavCtnov_tipo'},{av:'AV7cTNov_Tipo',fld:'vCTNOV_TIPO',pic:'',nv:''},{av:'AV8cTNov_Nro_Cambios',fld:'vCTNOV_NRO_CAMBIOS',pic:'ZZZ9',nv:0},{av:'AV9cTNov_Procedimiento',fld:'vCTNOV_PROCEDIMIENTO',pic:'',nv:''},{av:'AV10cTNov_Nombre_Campo',fld:'vCTNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'cmbavCtnov_ingresomasivo'},{av:'AV11cTNov_IngresoMasivo',fld:'vCTNOV_INGRESOMASIVO',pic:'',nv:''},{av:'cmbavCtnov_estado'},{av:'AV12cTNov_Estado',fld:'vCTNOV_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e188I1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLTNOV_CODIGOFILTER.CLICK","{handler:'e118I1',iparms:[{av:'divTnov_codigofiltercontainer_Class',ctrl:'TNOV_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTnov_codigofiltercontainer_Class',ctrl:'TNOV_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCtnov_codigo_Visible',ctrl:'vCTNOV_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLTNOV_TIPOFILTER.CLICK","{handler:'e128I1',iparms:[{av:'divTnov_tipofiltercontainer_Class',ctrl:'TNOV_TIPOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTnov_tipofiltercontainer_Class',ctrl:'TNOV_TIPOFILTERCONTAINER',prop:'Class'},{av:'cmbavCtnov_tipo'}]}");
      setEventMetadata("LBLTNOV_NRO_CAMBIOSFILTER.CLICK","{handler:'e138I1',iparms:[{av:'divTnov_nro_cambiosfiltercontainer_Class',ctrl:'TNOV_NRO_CAMBIOSFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTnov_nro_cambiosfiltercontainer_Class',ctrl:'TNOV_NRO_CAMBIOSFILTERCONTAINER',prop:'Class'},{av:'edtavCtnov_nro_cambios_Visible',ctrl:'vCTNOV_NRO_CAMBIOS',prop:'Visible'}]}");
      setEventMetadata("LBLTNOV_PROCEDIMIENTOFILTER.CLICK","{handler:'e148I1',iparms:[{av:'divTnov_procedimientofiltercontainer_Class',ctrl:'TNOV_PROCEDIMIENTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTnov_procedimientofiltercontainer_Class',ctrl:'TNOV_PROCEDIMIENTOFILTERCONTAINER',prop:'Class'},{av:'edtavCtnov_procedimiento_Visible',ctrl:'vCTNOV_PROCEDIMIENTO',prop:'Visible'}]}");
      setEventMetadata("LBLTNOV_NOMBRE_CAMPOFILTER.CLICK","{handler:'e158I1',iparms:[{av:'divTnov_nombre_campofiltercontainer_Class',ctrl:'TNOV_NOMBRE_CAMPOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTnov_nombre_campofiltercontainer_Class',ctrl:'TNOV_NOMBRE_CAMPOFILTERCONTAINER',prop:'Class'},{av:'edtavCtnov_nombre_campo_Visible',ctrl:'vCTNOV_NOMBRE_CAMPO',prop:'Visible'}]}");
      setEventMetadata("LBLTNOV_INGRESOMASIVOFILTER.CLICK","{handler:'e168I1',iparms:[{av:'divTnov_ingresomasivofiltercontainer_Class',ctrl:'TNOV_INGRESOMASIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTnov_ingresomasivofiltercontainer_Class',ctrl:'TNOV_INGRESOMASIVOFILTERCONTAINER',prop:'Class'},{av:'cmbavCtnov_ingresomasivo'}]}");
      setEventMetadata("LBLTNOV_ESTADOFILTER.CLICK","{handler:'e178I1',iparms:[{av:'divTnov_estadofiltercontainer_Class',ctrl:'TNOV_ESTADOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTnov_estadofiltercontainer_Class',ctrl:'TNOV_ESTADOFILTERCONTAINER',prop:'Class'},{av:'cmbavCtnov_estado'}]}");
      setEventMetadata("ENTER","{handler:'e218I2',iparms:[{av:'A104TNov_Codigo',fld:'TNOV_CODIGO',pic:'ZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pTNov_Codigo',fld:'vPTNOV_CODIGO',pic:'ZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTNov_Codigo',fld:'vCTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'cmbavCtnov_tipo'},{av:'AV7cTNov_Tipo',fld:'vCTNOV_TIPO',pic:'',nv:''},{av:'AV8cTNov_Nro_Cambios',fld:'vCTNOV_NRO_CAMBIOS',pic:'ZZZ9',nv:0},{av:'AV9cTNov_Procedimiento',fld:'vCTNOV_PROCEDIMIENTO',pic:'',nv:''},{av:'AV10cTNov_Nombre_Campo',fld:'vCTNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'cmbavCtnov_ingresomasivo'},{av:'AV11cTNov_IngresoMasivo',fld:'vCTNOV_INGRESOMASIVO',pic:'',nv:''},{av:'cmbavCtnov_estado'},{av:'AV12cTNov_Estado',fld:'vCTNOV_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTNov_Codigo',fld:'vCTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'cmbavCtnov_tipo'},{av:'AV7cTNov_Tipo',fld:'vCTNOV_TIPO',pic:'',nv:''},{av:'AV8cTNov_Nro_Cambios',fld:'vCTNOV_NRO_CAMBIOS',pic:'ZZZ9',nv:0},{av:'AV9cTNov_Procedimiento',fld:'vCTNOV_PROCEDIMIENTO',pic:'',nv:''},{av:'AV10cTNov_Nombre_Campo',fld:'vCTNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'cmbavCtnov_ingresomasivo'},{av:'AV11cTNov_IngresoMasivo',fld:'vCTNOV_INGRESOMASIVO',pic:'',nv:''},{av:'cmbavCtnov_estado'},{av:'AV12cTNov_Estado',fld:'vCTNOV_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTNov_Codigo',fld:'vCTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'cmbavCtnov_tipo'},{av:'AV7cTNov_Tipo',fld:'vCTNOV_TIPO',pic:'',nv:''},{av:'AV8cTNov_Nro_Cambios',fld:'vCTNOV_NRO_CAMBIOS',pic:'ZZZ9',nv:0},{av:'AV9cTNov_Procedimiento',fld:'vCTNOV_PROCEDIMIENTO',pic:'',nv:''},{av:'AV10cTNov_Nombre_Campo',fld:'vCTNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'cmbavCtnov_ingresomasivo'},{av:'AV11cTNov_IngresoMasivo',fld:'vCTNOV_INGRESOMASIVO',pic:'',nv:''},{av:'cmbavCtnov_estado'},{av:'AV12cTNov_Estado',fld:'vCTNOV_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cTNov_Codigo',fld:'vCTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'cmbavCtnov_tipo'},{av:'AV7cTNov_Tipo',fld:'vCTNOV_TIPO',pic:'',nv:''},{av:'AV8cTNov_Nro_Cambios',fld:'vCTNOV_NRO_CAMBIOS',pic:'ZZZ9',nv:0},{av:'AV9cTNov_Procedimiento',fld:'vCTNOV_PROCEDIMIENTO',pic:'',nv:''},{av:'AV10cTNov_Nombre_Campo',fld:'vCTNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'cmbavCtnov_ingresomasivo'},{av:'AV11cTNov_IngresoMasivo',fld:'vCTNOV_INGRESOMASIVO',pic:'',nv:''},{av:'cmbavCtnov_estado'},{av:'AV12cTNov_Estado',fld:'vCTNOV_ESTADO',pic:'',nv:''}],oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7cTNov_Tipo = "" ;
      AV9cTNov_Procedimiento = "" ;
      AV10cTNov_Nombre_Campo = "" ;
      AV11cTNov_IngresoMasivo = "" ;
      AV12cTNov_Estado = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLbltnov_codigofilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLbltnov_tipofilter_Jsonclick = "" ;
      lblLbltnov_nro_cambiosfilter_Jsonclick = "" ;
      lblLbltnov_procedimientofilter_Jsonclick = "" ;
      lblLbltnov_nombre_campofilter_Jsonclick = "" ;
      lblLbltnov_ingresomasivofilter_Jsonclick = "" ;
      lblLbltnov_estadofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A770TNov_Tipo = "" ;
      A772TNov_Procedimiento = "" ;
      A773TNov_Estado = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV7cTNov_Tipo = "" ;
      lV9cTNov_Procedimiento = "" ;
      lV10cTNov_Nombre_Campo = "" ;
      lV11cTNov_IngresoMasivo = "" ;
      lV12cTNov_Estado = "" ;
      A774TNov_Nombre_Campo = "" ;
      A813TNov_IngresoMasivo = "" ;
      H008I2_A813TNov_IngresoMasivo = new String[] {""} ;
      H008I2_n813TNov_IngresoMasivo = new boolean[] {false} ;
      H008I2_A774TNov_Nombre_Campo = new String[] {""} ;
      H008I2_n774TNov_Nombre_Campo = new boolean[] {false} ;
      H008I2_A773TNov_Estado = new String[] {""} ;
      H008I2_n773TNov_Estado = new boolean[] {false} ;
      H008I2_A772TNov_Procedimiento = new String[] {""} ;
      H008I2_n772TNov_Procedimiento = new boolean[] {false} ;
      H008I2_A771TNov_Nro_Cambios = new short[1] ;
      H008I2_n771TNov_Nro_Cambios = new boolean[] {false} ;
      H008I2_A770TNov_Tipo = new String[] {""} ;
      H008I2_n770TNov_Tipo = new boolean[] {false} ;
      H008I2_A104TNov_Codigo = new int[1] ;
      H008I3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx01i0__default(),
         new Object[] {
             new Object[] {
            H008I2_A813TNov_IngresoMasivo, H008I2_n813TNov_IngresoMasivo, H008I2_A774TNov_Nombre_Campo, H008I2_n774TNov_Nombre_Campo, H008I2_A773TNov_Estado, H008I2_n773TNov_Estado, H008I2_A772TNov_Procedimiento, H008I2_n772TNov_Procedimiento, H008I2_A771TNov_Nro_Cambios, H008I2_n771TNov_Nro_Cambios,
            H008I2_A770TNov_Tipo, H008I2_n770TNov_Tipo, H008I2_A104TNov_Codigo
            }
            , new Object[] {
            H008I3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
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
   private short nRC_GXsfl_84 ;
   private short nGXsfl_84_idx=1 ;
   private short AV8cTNov_Nro_Cambios ;
   private short wbEnd ;
   private short wbStart ;
   private short A771TNov_Nro_Cambios ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int AV6cTNov_Codigo ;
   private int AV13pTNov_Codigo ;
   private int edtavCtnov_codigo_Enabled ;
   private int edtavCtnov_codigo_Visible ;
   private int edtavCtnov_nro_cambios_Enabled ;
   private int edtavCtnov_nro_cambios_Visible ;
   private int edtavCtnov_procedimiento_Visible ;
   private int edtavCtnov_procedimiento_Enabled ;
   private int edtavCtnov_nombre_campo_Visible ;
   private int edtavCtnov_nombre_campo_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A104TNov_Codigo ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divTnov_codigofiltercontainer_Class ;
   private String divTnov_tipofiltercontainer_Class ;
   private String divTnov_nro_cambiosfiltercontainer_Class ;
   private String divTnov_procedimientofiltercontainer_Class ;
   private String divTnov_nombre_campofiltercontainer_Class ;
   private String divTnov_ingresomasivofiltercontainer_Class ;
   private String divTnov_estadofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String AV12cTNov_Estado ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divTnov_codigofiltercontainer_Internalname ;
   private String lblLbltnov_codigofilter_Internalname ;
   private String lblLbltnov_codigofilter_Jsonclick ;
   private String edtavCtnov_codigo_Internalname ;
   private String TempTags ;
   private String edtavCtnov_codigo_Jsonclick ;
   private String divTnov_tipofiltercontainer_Internalname ;
   private String lblLbltnov_tipofilter_Internalname ;
   private String lblLbltnov_tipofilter_Jsonclick ;
   private String divTnov_nro_cambiosfiltercontainer_Internalname ;
   private String lblLbltnov_nro_cambiosfilter_Internalname ;
   private String lblLbltnov_nro_cambiosfilter_Jsonclick ;
   private String edtavCtnov_nro_cambios_Internalname ;
   private String edtavCtnov_nro_cambios_Jsonclick ;
   private String divTnov_procedimientofiltercontainer_Internalname ;
   private String lblLbltnov_procedimientofilter_Internalname ;
   private String lblLbltnov_procedimientofilter_Jsonclick ;
   private String edtavCtnov_procedimiento_Internalname ;
   private String edtavCtnov_procedimiento_Jsonclick ;
   private String divTnov_nombre_campofiltercontainer_Internalname ;
   private String lblLbltnov_nombre_campofilter_Internalname ;
   private String lblLbltnov_nombre_campofilter_Jsonclick ;
   private String edtavCtnov_nombre_campo_Internalname ;
   private String edtavCtnov_nombre_campo_Jsonclick ;
   private String divTnov_ingresomasivofiltercontainer_Internalname ;
   private String lblLbltnov_ingresomasivofilter_Internalname ;
   private String lblLbltnov_ingresomasivofilter_Jsonclick ;
   private String divTnov_estadofiltercontainer_Internalname ;
   private String lblLbltnov_estadofilter_Internalname ;
   private String lblLbltnov_estadofilter_Jsonclick ;
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
   private String A773TNov_Estado ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtTNov_Codigo_Internalname ;
   private String edtTNov_Nro_Cambios_Internalname ;
   private String edtTNov_Procedimiento_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV12cTNov_Estado ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtTNov_Codigo_Jsonclick ;
   private String edtTNov_Nro_Cambios_Jsonclick ;
   private String edtTNov_Procedimiento_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n770TNov_Tipo ;
   private boolean n771TNov_Nro_Cambios ;
   private boolean n772TNov_Procedimiento ;
   private boolean n773TNov_Estado ;
   private boolean n813TNov_IngresoMasivo ;
   private boolean n774TNov_Nombre_Campo ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV7cTNov_Tipo ;
   private String AV9cTNov_Procedimiento ;
   private String AV10cTNov_Nombre_Campo ;
   private String AV11cTNov_IngresoMasivo ;
   private String A770TNov_Tipo ;
   private String A772TNov_Procedimiento ;
   private String AV17Linkselection_GXI ;
   private String lV7cTNov_Tipo ;
   private String lV9cTNov_Procedimiento ;
   private String lV10cTNov_Nombre_Campo ;
   private String lV11cTNov_IngresoMasivo ;
   private String A774TNov_Nombre_Campo ;
   private String A813TNov_IngresoMasivo ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCtnov_tipo ;
   private HTMLChoice cmbavCtnov_ingresomasivo ;
   private HTMLChoice cmbavCtnov_estado ;
   private HTMLChoice cmbTNov_Tipo ;
   private HTMLChoice cmbTNov_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H008I2_A813TNov_IngresoMasivo ;
   private boolean[] H008I2_n813TNov_IngresoMasivo ;
   private String[] H008I2_A774TNov_Nombre_Campo ;
   private boolean[] H008I2_n774TNov_Nombre_Campo ;
   private String[] H008I2_A773TNov_Estado ;
   private boolean[] H008I2_n773TNov_Estado ;
   private String[] H008I2_A772TNov_Procedimiento ;
   private boolean[] H008I2_n772TNov_Procedimiento ;
   private short[] H008I2_A771TNov_Nro_Cambios ;
   private boolean[] H008I2_n771TNov_Nro_Cambios ;
   private String[] H008I2_A770TNov_Tipo ;
   private boolean[] H008I2_n770TNov_Tipo ;
   private int[] H008I2_A104TNov_Codigo ;
   private long[] H008I3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx01i0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008I2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cTNov_Tipo ,
                                          short AV8cTNov_Nro_Cambios ,
                                          String AV9cTNov_Procedimiento ,
                                          String AV10cTNov_Nombre_Campo ,
                                          String AV11cTNov_IngresoMasivo ,
                                          String AV12cTNov_Estado ,
                                          String A770TNov_Tipo ,
                                          short A771TNov_Nro_Cambios ,
                                          String A772TNov_Procedimiento ,
                                          String A774TNov_Nombre_Campo ,
                                          String A813TNov_IngresoMasivo ,
                                          String A773TNov_Estado ,
                                          int AV6cTNov_Codigo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [10] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " /*+ FIRST_ROWS(11) */ TNov_IngresoMasivo, TNov_Nombre_Campo, TNov_Estado, TNov_Procedimiento," ;
      sSelectString = sSelectString + " TNov_Nro_Cambios, TNov_Tipo, TNov_Codigo" ;
      sFromString = " FROM ALM_TIPO_NOVEDAD" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (TNov_Codigo >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cTNov_Tipo)==0) )
      {
         sWhereString = sWhereString + " and (TNov_Tipo like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cTNov_Nro_Cambios) )
      {
         sWhereString = sWhereString + " and (TNov_Nro_Cambios >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cTNov_Procedimiento)==0) )
      {
         sWhereString = sWhereString + " and (TNov_Procedimiento like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cTNov_Nombre_Campo)==0) )
      {
         sWhereString = sWhereString + " and (TNov_Nombre_Campo like ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cTNov_IngresoMasivo)==0) )
      {
         sWhereString = sWhereString + " and (TNov_IngresoMasivo like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cTNov_Estado)==0) )
      {
         sWhereString = sWhereString + " and (TNov_Estado like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY TNov_Codigo" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H008I3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cTNov_Tipo ,
                                          short AV8cTNov_Nro_Cambios ,
                                          String AV9cTNov_Procedimiento ,
                                          String AV10cTNov_Nombre_Campo ,
                                          String AV11cTNov_IngresoMasivo ,
                                          String AV12cTNov_Estado ,
                                          String A770TNov_Tipo ,
                                          short A771TNov_Nro_Cambios ,
                                          String A772TNov_Procedimiento ,
                                          String A774TNov_Nombre_Campo ,
                                          String A813TNov_IngresoMasivo ,
                                          String A773TNov_Estado ,
                                          int AV6cTNov_Codigo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_TIPO_NOVEDAD" ;
      scmdbuf = scmdbuf + " WHERE (TNov_Codigo >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cTNov_Tipo)==0) )
      {
         sWhereString = sWhereString + " and (TNov_Tipo like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cTNov_Nro_Cambios) )
      {
         sWhereString = sWhereString + " and (TNov_Nro_Cambios >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cTNov_Procedimiento)==0) )
      {
         sWhereString = sWhereString + " and (TNov_Procedimiento like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cTNov_Nombre_Campo)==0) )
      {
         sWhereString = sWhereString + " and (TNov_Nombre_Campo like ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cTNov_IngresoMasivo)==0) )
      {
         sWhereString = sWhereString + " and (TNov_IngresoMasivo like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cTNov_Estado)==0) )
      {
         sWhereString = sWhereString + " and (TNov_Estado like ?)" ;
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + "" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H008I2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
            case 1 :
                  return conditional_H008I3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008I2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H008I3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(7) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 60);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 50);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 60);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 50);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               return;
      }
   }

}

