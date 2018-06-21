/*
               File: sel_elemento_impl
        Description: SEL_ELEMENTO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:22:14.80
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

public final  class sel_elemento_impl extends GXDataArea
{
   public sel_elemento_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public sel_elemento_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( sel_elemento_impl.class ));
   }

   public sel_elemento_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCelem_estado = new HTMLChoice();
      cmbElem_Estado = new HTMLChoice();
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
            AV7cElem_Consecutivo = httpContext.GetNextPar( ) ;
            AV6cCata_Codigo = httpContext.GetNextPar( ) ;
            AV12cUNIMED_COD = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cElem_Estado = httpContext.GetNextPar( ) ;
            AV11cTipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
            AV10cElem_UsuarioCreacion = httpContext.GetNextPar( ) ;
            AV9cElem_FechaCreacion = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV7cElem_Consecutivo, AV6cCata_Codigo, AV12cUNIMED_COD, AV8cElem_Estado, AV11cTipo_Codigo, AV10cElem_UsuarioCreacion, AV9cElem_FechaCreacion) ;
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
            AV14pElem_Consecutivo = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14pElem_Consecutivo", AV14pElem_Consecutivo);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV15pElem_Descripcion = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15pElem_Descripcion", AV15pElem_Descripcion);
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
      pa7P2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start7P2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414221487");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.sel_elemento") + "?" + GXutil.URLEncode(GXutil.rtrim(AV14pElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV15pElem_Descripcion))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCELEM_CONSECUTIVO", AV7cElem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCATA_CODIGO", AV6cCata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUNIMED_COD", GXutil.ltrim( localUtil.ntoc( AV12cUNIMED_COD, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCELEM_ESTADO", GXutil.rtrim( AV8cElem_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( AV11cTipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCELEM_USUARIOCREACION", AV10cElem_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCELEM_FECHACREACION", localUtil.ttoc( AV9cElem_FechaCreacion, 10, 8, 0, 3, "/", ":", " "));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPELEM_CONSECUTIVO", AV14pElem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPELEM_DESCRIPCION", AV15pElem_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVOFILTERCONTAINER_Class", GXutil.rtrim( divElem_consecutivofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divCata_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "UNIMED_CODFILTERCONTAINER_Class", GXutil.rtrim( divUnimed_codfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_ESTADOFILTERCONTAINER_Class", GXutil.rtrim( divElem_estadofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divTipo_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_USUARIOCREACIONFILTERCONTAINER_Class", GXutil.rtrim( divElem_usuariocreacionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_FECHACREACIONFILTERCONTAINER_Class", GXutil.rtrim( divElem_fechacreacionfiltercontainer_Class));
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
         we7P2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt7P2( ) ;
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
      return formatLink("com.orions2.sel_elemento") + "?" + GXutil.URLEncode(GXutil.rtrim(AV14pElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV15pElem_Descripcion)) ;
   }

   public String getPgmname( )
   {
      return "SEL_ELEMENTO" ;
   }

   public String getPgmdesc( )
   {
      return "SEL_ELEMENTO" ;
   }

   public void wb7P0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divElem_consecutivofiltercontainer_Internalname, 1, 0, "px", 0, "px", divElem_consecutivofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelem_consecutivofilter_Internalname, "Consecutivo", "", "", lblLblelem_consecutivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e117p1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SEL_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_consecutivo_Internalname, "Consecutivo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV7cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV7cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtavCelem_consecutivo_Visible, edtavCelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SEL_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCata_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divCata_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcata_codigofilter_Internalname, "Código del Bien", "", "", lblLblcata_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e127p1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SEL_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcata_codigo_Internalname, "Código del Bien", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcata_codigo_Internalname, AV6cCata_Codigo, GXutil.rtrim( localUtil.format( AV6cCata_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcata_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCcata_codigo_Visible, edtavCcata_codigo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SEL_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divUnimed_codfiltercontainer_Internalname, 1, 0, "px", 0, "px", divUnimed_codfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblunimed_codfilter_Internalname, "UNIDAD MEDIDA CODIGO", "", "", lblLblunimed_codfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e137p1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SEL_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCunimed_cod_Internalname, "UNIDAD MEDIDA CODIGO", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCunimed_cod_Internalname, GXutil.ltrim( localUtil.ntoc( AV12cUNIMED_COD, (byte)(6), (byte)(0), ",", "")), ((edtavCunimed_cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12cUNIMED_COD), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV12cUNIMED_COD), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCunimed_cod_Jsonclick, 0, "Attribute", "", "", "", edtavCunimed_cod_Visible, edtavCunimed_cod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_SEL_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divElem_estadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divElem_estadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelem_estadofilter_Internalname, "Estado", "", "", lblLblelem_estadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e147p1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SEL_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCelem_estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCelem_estado, cmbavCelem_estado.getInternalname(), GXutil.rtrim( AV8cElem_Estado), 1, cmbavCelem_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavCelem_estado.getVisible(), cmbavCelem_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "", true, "HLP_SEL_ELEMENTO.htm");
         cmbavCelem_estado.setValue( GXutil.rtrim( AV8cElem_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCelem_estado.getInternalname(), "Values", cmbavCelem_estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTipo_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTipo_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltipo_codigofilter_Internalname, "Codigo Tipo de Elemento", "", "", lblLbltipo_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e157p1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SEL_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtipo_codigo_Internalname, "Codigo Tipo de Elemento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtipo_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( AV11cTipo_Codigo, (byte)(18), (byte)(0), ",", "")), ((edtavCtipo_codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11cTipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV11cTipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtipo_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCtipo_codigo_Visible, edtavCtipo_codigo_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_SEL_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divElem_usuariocreacionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divElem_usuariocreacionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelem_usuariocreacionfilter_Internalname, "Usuario Creacion", "", "", lblLblelem_usuariocreacionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e167p1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SEL_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_usuariocreacion_Internalname, "Usuario Creacion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_usuariocreacion_Internalname, AV10cElem_UsuarioCreacion, GXutil.rtrim( localUtil.format( AV10cElem_UsuarioCreacion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_usuariocreacion_Jsonclick, 0, "Attribute", "", "", "", edtavCelem_usuariocreacion_Visible, edtavCelem_usuariocreacion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SEL_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divElem_fechacreacionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divElem_fechacreacionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelem_fechacreacionfilter_Internalname, "Fecha Creacion", "", "", lblLblelem_fechacreacionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e177p1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SEL_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_fechacreacion_Internalname, "Fecha Creacion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCelem_fechacreacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_fechacreacion_Internalname, localUtil.ttoc( AV9cElem_FechaCreacion, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV9cElem_FechaCreacion, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_fechacreacion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCelem_fechacreacion_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_SEL_ELEMENTO.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e187p1_client"+"'", TempTags, "", 2, "HLP_SEL_ELEMENTO.htm");
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código del Bien") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "UNIDAD MEDIDA CODIGO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Codigo Tipo de Elemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Creacion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Creacion") ;
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
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV13LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A66Elem_Consecutivo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A37Cata_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A557Elem_Descripcion);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A558Elem_Estado));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A570Elem_UsuarioCreacion);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A571Elem_FechaCreacion, 10, 8, 0, 3, "/", ":", " "));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SEL_ELEMENTO.htm");
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

   public void start7P2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "SEL_ELEMENTO", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup7P0( ) ;
   }

   public void ws7P2( )
   {
      start7P2( ) ;
      evt7P2( ) ;
   }

   public void evt7P2( )
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
                           AV13LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV13LinkSelection)==0) ? AV18Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13LinkSelection))), !bGXsfl_84_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13LinkSelection), true);
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A37Cata_Codigo = httpContext.cgiGet( edtCata_Codigo_Internalname) ;
                           A557Elem_Descripcion = httpContext.cgiGet( edtElem_Descripcion_Internalname) ;
                           A77UNIMED_COD = (int)(localUtil.ctol( httpContext.cgiGet( edtUNIMED_COD_Internalname), ",", ".")) ;
                           cmbElem_Estado.setName( cmbElem_Estado.getInternalname() );
                           cmbElem_Estado.setValue( httpContext.cgiGet( cmbElem_Estado.getInternalname()) );
                           A558Elem_Estado = httpContext.cgiGet( cmbElem_Estado.getInternalname()) ;
                           A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
                           A570Elem_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtElem_UsuarioCreacion_Internalname)) ;
                           n570Elem_UsuarioCreacion = false ;
                           A571Elem_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtElem_FechaCreacion_Internalname), 0) ;
                           n571Elem_FechaCreacion = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e197P2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e207P2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Celem_consecutivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV7cElem_Consecutivo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccata_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCATA_CODIGO"), AV6cCata_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cunimed_cod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUNIMED_COD"), ",", ".") != AV12cUNIMED_COD )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Celem_estado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_ESTADO"), AV8cElem_Estado) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctipo_codigo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTIPO_CODIGO"), ",", ".") != AV11cTipo_Codigo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Celem_usuariocreacion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_USUARIOCREACION"), AV10cElem_UsuarioCreacion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Celem_fechacreacion Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCELEM_FECHACREACION"), 0), AV9cElem_FechaCreacion) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e217P2 ();
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

   public void we7P2( )
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

   public void pa7P2( )
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
         cmbavCelem_estado.setName( "vCELEM_ESTADO" );
         cmbavCelem_estado.setWebtags( "" );
         cmbavCelem_estado.addItem("A", "Activo", (short)(0));
         cmbavCelem_estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbavCelem_estado.getItemCount() > 0 )
         {
            AV8cElem_Estado = cmbavCelem_estado.getValidValue(AV8cElem_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cElem_Estado", AV8cElem_Estado);
         }
         GXCCtl = "ELEM_ESTADO_" + sGXsfl_84_idx ;
         cmbElem_Estado.setName( GXCCtl );
         cmbElem_Estado.setWebtags( "" );
         cmbElem_Estado.addItem("A", "Activo", (short)(0));
         cmbElem_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbElem_Estado.getItemCount() > 0 )
         {
            A558Elem_Estado = cmbElem_Estado.getValidValue(A558Elem_Estado) ;
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
                                  String AV7cElem_Consecutivo ,
                                  String AV6cCata_Codigo ,
                                  int AV12cUNIMED_COD ,
                                  String AV8cElem_Estado ,
                                  long AV11cTipo_Codigo ,
                                  String AV10cElem_UsuarioCreacion ,
                                  java.util.Date AV9cElem_FechaCreacion )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf7P2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CATA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A37Cata_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_CODIGO", A37Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A557Elem_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_DESCRIPCION", A557Elem_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_UNIMED_COD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A77UNIMED_COD), "ZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "UNIMED_COD", GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A558Elem_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_ESTADO", GXutil.rtrim( A558Elem_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_USUARIOCREACION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A570Elem_UsuarioCreacion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_USUARIOCREACION", A570Elem_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_FECHACREACION", getSecureSignedToken( "", localUtil.format( A571Elem_FechaCreacion, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_FECHACREACION", localUtil.ttoc( A571Elem_FechaCreacion, 10, 8, 0, 3, "/", ":", " "));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCelem_estado.getItemCount() > 0 )
      {
         AV8cElem_Estado = cmbavCelem_estado.getValidValue(AV8cElem_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cElem_Estado", AV8cElem_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf7P2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf7P2( )
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
                                              AV6cCata_Codigo ,
                                              new Integer(AV12cUNIMED_COD) ,
                                              AV8cElem_Estado ,
                                              new Long(AV11cTipo_Codigo) ,
                                              AV10cElem_UsuarioCreacion ,
                                              AV9cElem_FechaCreacion ,
                                              A37Cata_Codigo ,
                                              new Integer(A77UNIMED_COD) ,
                                              A558Elem_Estado ,
                                              new Long(A33Tipo_Codigo) ,
                                              A570Elem_UsuarioCreacion ,
                                              A571Elem_FechaCreacion ,
                                              A66Elem_Consecutivo ,
                                              AV7cElem_Consecutivo } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.LONG,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV7cElem_Consecutivo = GXutil.concat( GXutil.rtrim( AV7cElem_Consecutivo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cElem_Consecutivo", AV7cElem_Consecutivo);
         lV6cCata_Codigo = GXutil.concat( GXutil.rtrim( AV6cCata_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cCata_Codigo", AV6cCata_Codigo);
         lV8cElem_Estado = GXutil.padr( GXutil.rtrim( AV8cElem_Estado), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cElem_Estado", AV8cElem_Estado);
         lV10cElem_UsuarioCreacion = GXutil.concat( GXutil.rtrim( AV10cElem_UsuarioCreacion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cElem_UsuarioCreacion", AV10cElem_UsuarioCreacion);
         /* Using cursor H007P2 */
         pr_default.execute(0, new Object[] {lV7cElem_Consecutivo, lV6cCata_Codigo, new Integer(AV12cUNIMED_COD), lV8cElem_Estado, new Long(AV11cTipo_Codigo), lV10cElem_UsuarioCreacion, AV9cElem_FechaCreacion, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A571Elem_FechaCreacion = H007P2_A571Elem_FechaCreacion[0] ;
            n571Elem_FechaCreacion = H007P2_n571Elem_FechaCreacion[0] ;
            A570Elem_UsuarioCreacion = H007P2_A570Elem_UsuarioCreacion[0] ;
            n570Elem_UsuarioCreacion = H007P2_n570Elem_UsuarioCreacion[0] ;
            A33Tipo_Codigo = H007P2_A33Tipo_Codigo[0] ;
            A558Elem_Estado = H007P2_A558Elem_Estado[0] ;
            A77UNIMED_COD = H007P2_A77UNIMED_COD[0] ;
            A557Elem_Descripcion = H007P2_A557Elem_Descripcion[0] ;
            A37Cata_Codigo = H007P2_A37Cata_Codigo[0] ;
            A66Elem_Consecutivo = H007P2_A66Elem_Consecutivo[0] ;
            /* Execute user event: Load */
            e207P2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb7P0( ) ;
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
                                           AV6cCata_Codigo ,
                                           new Integer(AV12cUNIMED_COD) ,
                                           AV8cElem_Estado ,
                                           new Long(AV11cTipo_Codigo) ,
                                           AV10cElem_UsuarioCreacion ,
                                           AV9cElem_FechaCreacion ,
                                           A37Cata_Codigo ,
                                           new Integer(A77UNIMED_COD) ,
                                           A558Elem_Estado ,
                                           new Long(A33Tipo_Codigo) ,
                                           A570Elem_UsuarioCreacion ,
                                           A571Elem_FechaCreacion ,
                                           A66Elem_Consecutivo ,
                                           AV7cElem_Consecutivo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV7cElem_Consecutivo = GXutil.concat( GXutil.rtrim( AV7cElem_Consecutivo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cElem_Consecutivo", AV7cElem_Consecutivo);
      lV6cCata_Codigo = GXutil.concat( GXutil.rtrim( AV6cCata_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cCata_Codigo", AV6cCata_Codigo);
      lV8cElem_Estado = GXutil.padr( GXutil.rtrim( AV8cElem_Estado), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cElem_Estado", AV8cElem_Estado);
      lV10cElem_UsuarioCreacion = GXutil.concat( GXutil.rtrim( AV10cElem_UsuarioCreacion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10cElem_UsuarioCreacion", AV10cElem_UsuarioCreacion);
      /* Using cursor H007P3 */
      pr_default.execute(1, new Object[] {lV7cElem_Consecutivo, lV6cCata_Codigo, new Integer(AV12cUNIMED_COD), lV8cElem_Estado, new Long(AV11cTipo_Codigo), lV10cElem_UsuarioCreacion, AV9cElem_FechaCreacion});
      GRID1_nRecordCount = H007P3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV7cElem_Consecutivo, AV6cCata_Codigo, AV12cUNIMED_COD, AV8cElem_Estado, AV11cTipo_Codigo, AV10cElem_UsuarioCreacion, AV9cElem_FechaCreacion) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV7cElem_Consecutivo, AV6cCata_Codigo, AV12cUNIMED_COD, AV8cElem_Estado, AV11cTipo_Codigo, AV10cElem_UsuarioCreacion, AV9cElem_FechaCreacion) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV7cElem_Consecutivo, AV6cCata_Codigo, AV12cUNIMED_COD, AV8cElem_Estado, AV11cTipo_Codigo, AV10cElem_UsuarioCreacion, AV9cElem_FechaCreacion) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV7cElem_Consecutivo, AV6cCata_Codigo, AV12cUNIMED_COD, AV8cElem_Estado, AV11cTipo_Codigo, AV10cElem_UsuarioCreacion, AV9cElem_FechaCreacion) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV7cElem_Consecutivo, AV6cCata_Codigo, AV12cUNIMED_COD, AV8cElem_Estado, AV11cTipo_Codigo, AV10cElem_UsuarioCreacion, AV9cElem_FechaCreacion) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup7P0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e197P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV7cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cElem_Consecutivo", AV7cElem_Consecutivo);
         AV6cCata_Codigo = httpContext.cgiGet( edtavCcata_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cCata_Codigo", AV6cCata_Codigo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCunimed_cod_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCunimed_cod_Internalname), ",", ".") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUNIMED_COD");
            GX_FocusControl = edtavCunimed_cod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cUNIMED_COD = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cUNIMED_COD", GXutil.ltrim( GXutil.str( AV12cUNIMED_COD, 6, 0)));
         }
         else
         {
            AV12cUNIMED_COD = (int)(localUtil.ctol( httpContext.cgiGet( edtavCunimed_cod_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cUNIMED_COD", GXutil.ltrim( GXutil.str( AV12cUNIMED_COD, 6, 0)));
         }
         cmbavCelem_estado.setName( cmbavCelem_estado.getInternalname() );
         cmbavCelem_estado.setValue( httpContext.cgiGet( cmbavCelem_estado.getInternalname()) );
         AV8cElem_Estado = httpContext.cgiGet( cmbavCelem_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cElem_Estado", AV8cElem_Estado);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtipo_codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtipo_codigo_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTIPO_CODIGO");
            GX_FocusControl = edtavCtipo_codigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cTipo_Codigo = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cTipo_Codigo", GXutil.ltrim( GXutil.str( AV11cTipo_Codigo, 18, 0)));
         }
         else
         {
            AV11cTipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtavCtipo_codigo_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cTipo_Codigo", GXutil.ltrim( GXutil.str( AV11cTipo_Codigo, 18, 0)));
         }
         AV10cElem_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtavCelem_usuariocreacion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cElem_UsuarioCreacion", AV10cElem_UsuarioCreacion);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCelem_fechacreacion_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCELEM_FECHACREACION");
            GX_FocusControl = edtavCelem_fechacreacion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cElem_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV9cElem_FechaCreacion", localUtil.ttoc( AV9cElem_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV9cElem_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtavCelem_fechacreacion_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cElem_FechaCreacion", localUtil.ttoc( AV9cElem_FechaCreacion, 8, 5, 0, 3, "/", ":", " "));
         }
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV7cElem_Consecutivo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCATA_CODIGO"), AV6cCata_Codigo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUNIMED_COD"), ",", ".") != AV12cUNIMED_COD )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_ESTADO"), AV8cElem_Estado) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCTIPO_CODIGO"), ",", ".") != AV11cTipo_Codigo )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_USUARIOCREACION"), AV10cElem_UsuarioCreacion) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCELEM_FECHACREACION"), 0), AV9cElem_FechaCreacion) ) )
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
      e197P2 ();
      if (returnInSub) return;
   }

   public void e197P2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Elemento", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV5ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e207P2( )
   {
      /* Load Routine */
      AV13LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV18Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
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
      e217P2 ();
      if (returnInSub) return;
   }

   public void e217P2( )
   {
      /* Enter Routine */
      AV14pElem_Consecutivo = A66Elem_Consecutivo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pElem_Consecutivo", AV14pElem_Consecutivo);
      AV15pElem_Descripcion = A557Elem_Descripcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15pElem_Descripcion", AV15pElem_Descripcion);
      httpContext.setWebReturnParms(new Object[] {AV14pElem_Consecutivo,AV15pElem_Descripcion});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV14pElem_Consecutivo = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pElem_Consecutivo", AV14pElem_Consecutivo);
      AV15pElem_Descripcion = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15pElem_Descripcion", AV15pElem_Descripcion);
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
      pa7P2( ) ;
      ws7P2( ) ;
      we7P2( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414221626");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("sel_elemento.js", "?201861414221626");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_84_idx ;
      edtCata_Codigo_Internalname = "CATA_CODIGO_"+sGXsfl_84_idx ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION_"+sGXsfl_84_idx ;
      edtUNIMED_COD_Internalname = "UNIMED_COD_"+sGXsfl_84_idx ;
      cmbElem_Estado.setInternalname( "ELEM_ESTADO_"+sGXsfl_84_idx );
      edtTipo_Codigo_Internalname = "TIPO_CODIGO_"+sGXsfl_84_idx ;
      edtElem_UsuarioCreacion_Internalname = "ELEM_USUARIOCREACION_"+sGXsfl_84_idx ;
      edtElem_FechaCreacion_Internalname = "ELEM_FECHACREACION_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_84_fel_idx ;
      edtCata_Codigo_Internalname = "CATA_CODIGO_"+sGXsfl_84_fel_idx ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION_"+sGXsfl_84_fel_idx ;
      edtUNIMED_COD_Internalname = "UNIMED_COD_"+sGXsfl_84_fel_idx ;
      cmbElem_Estado.setInternalname( "ELEM_ESTADO_"+sGXsfl_84_fel_idx );
      edtTipo_Codigo_Internalname = "TIPO_CODIGO_"+sGXsfl_84_fel_idx ;
      edtElem_UsuarioCreacion_Internalname = "ELEM_USUARIOCREACION_"+sGXsfl_84_fel_idx ;
      edtElem_FechaCreacion_Internalname = "ELEM_FECHACREACION_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb7P0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A66Elem_Consecutivo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A557Elem_Descripcion)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV13LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV13LinkSelection)==0)&&(GXutil.strcmp("", AV18Linkselection_GXI)==0))||!(GXutil.strcmp("", AV13LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV13LinkSelection)==0) ? AV18Linkselection_GXI : httpContext.getResourceRelative(AV13LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV13LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Codigo_Internalname,A37Cata_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCata_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Descripcion_Internalname,A557Elem_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2000),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUNIMED_COD_Internalname,GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A77UNIMED_COD), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUNIMED_COD_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ELEM_ESTADO_" + sGXsfl_84_idx ;
            cmbElem_Estado.setName( GXCCtl );
            cmbElem_Estado.setWebtags( "" );
            cmbElem_Estado.addItem("A", "Activo", (short)(0));
            cmbElem_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbElem_Estado.getItemCount() > 0 )
            {
               A558Elem_Estado = cmbElem_Estado.getValidValue(A558Elem_Estado) ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbElem_Estado,cmbElem_Estado.getInternalname(),GXutil.rtrim( A558Elem_Estado),new Integer(1),cmbElem_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbElem_Estado.setValue( GXutil.rtrim( A558Elem_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbElem_Estado.getInternalname(), "Values", cmbElem_Estado.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipo_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipo_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_UsuarioCreacion_Internalname,A570Elem_UsuarioCreacion,GXutil.rtrim( localUtil.format( A570Elem_UsuarioCreacion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_UsuarioCreacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_FechaCreacion_Internalname,localUtil.ttoc( A571Elem_FechaCreacion, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A571Elem_FechaCreacion, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_FechaCreacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CATA_CODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A37Cata_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_DESCRIPCION"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A557Elem_Descripcion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_UNIMED_COD"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A77UNIMED_COD), "ZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_ESTADO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A558Elem_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPO_CODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_USUARIOCREACION"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A570Elem_UsuarioCreacion, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_FECHACREACION"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( A571Elem_FechaCreacion, "99/99/99 99:99")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblelem_consecutivofilter_Internalname = "LBLELEM_CONSECUTIVOFILTER" ;
      edtavCelem_consecutivo_Internalname = "vCELEM_CONSECUTIVO" ;
      divElem_consecutivofiltercontainer_Internalname = "ELEM_CONSECUTIVOFILTERCONTAINER" ;
      lblLblcata_codigofilter_Internalname = "LBLCATA_CODIGOFILTER" ;
      edtavCcata_codigo_Internalname = "vCCATA_CODIGO" ;
      divCata_codigofiltercontainer_Internalname = "CATA_CODIGOFILTERCONTAINER" ;
      lblLblunimed_codfilter_Internalname = "LBLUNIMED_CODFILTER" ;
      edtavCunimed_cod_Internalname = "vCUNIMED_COD" ;
      divUnimed_codfiltercontainer_Internalname = "UNIMED_CODFILTERCONTAINER" ;
      lblLblelem_estadofilter_Internalname = "LBLELEM_ESTADOFILTER" ;
      cmbavCelem_estado.setInternalname( "vCELEM_ESTADO" );
      divElem_estadofiltercontainer_Internalname = "ELEM_ESTADOFILTERCONTAINER" ;
      lblLbltipo_codigofilter_Internalname = "LBLTIPO_CODIGOFILTER" ;
      edtavCtipo_codigo_Internalname = "vCTIPO_CODIGO" ;
      divTipo_codigofiltercontainer_Internalname = "TIPO_CODIGOFILTERCONTAINER" ;
      lblLblelem_usuariocreacionfilter_Internalname = "LBLELEM_USUARIOCREACIONFILTER" ;
      edtavCelem_usuariocreacion_Internalname = "vCELEM_USUARIOCREACION" ;
      divElem_usuariocreacionfiltercontainer_Internalname = "ELEM_USUARIOCREACIONFILTERCONTAINER" ;
      lblLblelem_fechacreacionfilter_Internalname = "LBLELEM_FECHACREACIONFILTER" ;
      edtavCelem_fechacreacion_Internalname = "vCELEM_FECHACREACION" ;
      divElem_fechacreacionfiltercontainer_Internalname = "ELEM_FECHACREACIONFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtCata_Codigo_Internalname = "CATA_CODIGO" ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION" ;
      edtUNIMED_COD_Internalname = "UNIMED_COD" ;
      cmbElem_Estado.setInternalname( "ELEM_ESTADO" );
      edtTipo_Codigo_Internalname = "TIPO_CODIGO" ;
      edtElem_UsuarioCreacion_Internalname = "ELEM_USUARIOCREACION" ;
      edtElem_FechaCreacion_Internalname = "ELEM_FECHACREACION" ;
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
      edtElem_FechaCreacion_Jsonclick = "" ;
      edtElem_UsuarioCreacion_Jsonclick = "" ;
      edtTipo_Codigo_Jsonclick = "" ;
      cmbElem_Estado.setJsonclick( "" );
      edtUNIMED_COD_Jsonclick = "" ;
      edtElem_Descripcion_Jsonclick = "" ;
      edtCata_Codigo_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCelem_fechacreacion_Jsonclick = "" ;
      edtavCelem_fechacreacion_Enabled = 1 ;
      edtavCelem_usuariocreacion_Jsonclick = "" ;
      edtavCelem_usuariocreacion_Enabled = 1 ;
      edtavCelem_usuariocreacion_Visible = 1 ;
      edtavCtipo_codigo_Jsonclick = "" ;
      edtavCtipo_codigo_Enabled = 1 ;
      edtavCtipo_codigo_Visible = 1 ;
      cmbavCelem_estado.setJsonclick( "" );
      cmbavCelem_estado.setEnabled( 1 );
      cmbavCelem_estado.setVisible( 1 );
      edtavCunimed_cod_Jsonclick = "" ;
      edtavCunimed_cod_Enabled = 1 ;
      edtavCunimed_cod_Visible = 1 ;
      edtavCcata_codigo_Jsonclick = "" ;
      edtavCcata_codigo_Enabled = 1 ;
      edtavCcata_codigo_Visible = 1 ;
      edtavCelem_consecutivo_Jsonclick = "" ;
      edtavCelem_consecutivo_Enabled = 1 ;
      edtavCelem_consecutivo_Visible = 1 ;
      divElem_fechacreacionfiltercontainer_Class = "AdvancedContainerItem" ;
      divElem_usuariocreacionfiltercontainer_Class = "AdvancedContainerItem" ;
      divTipo_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divElem_estadofiltercontainer_Class = "AdvancedContainerItem" ;
      divUnimed_codfiltercontainer_Class = "AdvancedContainerItem" ;
      divCata_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divElem_consecutivofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "SEL_ELEMENTO" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV7cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV6cCata_Codigo',fld:'vCCATA_CODIGO',pic:'',nv:''},{av:'AV12cUNIMED_COD',fld:'vCUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'cmbavCelem_estado'},{av:'AV8cElem_Estado',fld:'vCELEM_ESTADO',pic:'',nv:''},{av:'AV11cTipo_Codigo',fld:'vCTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV10cElem_UsuarioCreacion',fld:'vCELEM_USUARIOCREACION',pic:'@!',nv:''},{av:'AV9cElem_FechaCreacion',fld:'vCELEM_FECHACREACION',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e187P1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLELEM_CONSECUTIVOFILTER.CLICK","{handler:'e117P1',iparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'},{av:'edtavCelem_consecutivo_Visible',ctrl:'vCELEM_CONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLCATA_CODIGOFILTER.CLICK","{handler:'e127P1',iparms:[{av:'divCata_codigofiltercontainer_Class',ctrl:'CATA_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCata_codigofiltercontainer_Class',ctrl:'CATA_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCcata_codigo_Visible',ctrl:'vCCATA_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLUNIMED_CODFILTER.CLICK","{handler:'e137P1',iparms:[{av:'divUnimed_codfiltercontainer_Class',ctrl:'UNIMED_CODFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divUnimed_codfiltercontainer_Class',ctrl:'UNIMED_CODFILTERCONTAINER',prop:'Class'},{av:'edtavCunimed_cod_Visible',ctrl:'vCUNIMED_COD',prop:'Visible'}]}");
      setEventMetadata("LBLELEM_ESTADOFILTER.CLICK","{handler:'e147P1',iparms:[{av:'divElem_estadofiltercontainer_Class',ctrl:'ELEM_ESTADOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_estadofiltercontainer_Class',ctrl:'ELEM_ESTADOFILTERCONTAINER',prop:'Class'},{av:'cmbavCelem_estado'}]}");
      setEventMetadata("LBLTIPO_CODIGOFILTER.CLICK","{handler:'e157P1',iparms:[{av:'divTipo_codigofiltercontainer_Class',ctrl:'TIPO_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTipo_codigofiltercontainer_Class',ctrl:'TIPO_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCtipo_codigo_Visible',ctrl:'vCTIPO_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLELEM_USUARIOCREACIONFILTER.CLICK","{handler:'e167P1',iparms:[{av:'divElem_usuariocreacionfiltercontainer_Class',ctrl:'ELEM_USUARIOCREACIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_usuariocreacionfiltercontainer_Class',ctrl:'ELEM_USUARIOCREACIONFILTERCONTAINER',prop:'Class'},{av:'edtavCelem_usuariocreacion_Visible',ctrl:'vCELEM_USUARIOCREACION',prop:'Visible'}]}");
      setEventMetadata("LBLELEM_FECHACREACIONFILTER.CLICK","{handler:'e177P1',iparms:[{av:'divElem_fechacreacionfiltercontainer_Class',ctrl:'ELEM_FECHACREACIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_fechacreacionfiltercontainer_Class',ctrl:'ELEM_FECHACREACIONFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("ENTER","{handler:'e217P2',iparms:[{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A557Elem_Descripcion',fld:'ELEM_DESCRIPCION',pic:'',hsh:true,nv:''}],oparms:[{av:'AV14pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV15pElem_Descripcion',fld:'vPELEM_DESCRIPCION',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV7cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV6cCata_Codigo',fld:'vCCATA_CODIGO',pic:'',nv:''},{av:'AV12cUNIMED_COD',fld:'vCUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'cmbavCelem_estado'},{av:'AV8cElem_Estado',fld:'vCELEM_ESTADO',pic:'',nv:''},{av:'AV11cTipo_Codigo',fld:'vCTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV10cElem_UsuarioCreacion',fld:'vCELEM_USUARIOCREACION',pic:'@!',nv:''},{av:'AV9cElem_FechaCreacion',fld:'vCELEM_FECHACREACION',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV7cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV6cCata_Codigo',fld:'vCCATA_CODIGO',pic:'',nv:''},{av:'AV12cUNIMED_COD',fld:'vCUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'cmbavCelem_estado'},{av:'AV8cElem_Estado',fld:'vCELEM_ESTADO',pic:'',nv:''},{av:'AV11cTipo_Codigo',fld:'vCTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV10cElem_UsuarioCreacion',fld:'vCELEM_USUARIOCREACION',pic:'@!',nv:''},{av:'AV9cElem_FechaCreacion',fld:'vCELEM_FECHACREACION',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV7cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV6cCata_Codigo',fld:'vCCATA_CODIGO',pic:'',nv:''},{av:'AV12cUNIMED_COD',fld:'vCUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'cmbavCelem_estado'},{av:'AV8cElem_Estado',fld:'vCELEM_ESTADO',pic:'',nv:''},{av:'AV11cTipo_Codigo',fld:'vCTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV10cElem_UsuarioCreacion',fld:'vCELEM_USUARIOCREACION',pic:'@!',nv:''},{av:'AV9cElem_FechaCreacion',fld:'vCELEM_FECHACREACION',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV7cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV6cCata_Codigo',fld:'vCCATA_CODIGO',pic:'',nv:''},{av:'AV12cUNIMED_COD',fld:'vCUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'cmbavCelem_estado'},{av:'AV8cElem_Estado',fld:'vCELEM_ESTADO',pic:'',nv:''},{av:'AV11cTipo_Codigo',fld:'vCTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV10cElem_UsuarioCreacion',fld:'vCELEM_USUARIOCREACION',pic:'@!',nv:''},{av:'AV9cElem_FechaCreacion',fld:'vCELEM_FECHACREACION',pic:'99/99/99 99:99',nv:''}],oparms:[]}");
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
      AV7cElem_Consecutivo = "" ;
      AV6cCata_Codigo = "" ;
      AV8cElem_Estado = "" ;
      AV10cElem_UsuarioCreacion = "" ;
      AV9cElem_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      GXKey = "" ;
      AV14pElem_Consecutivo = "" ;
      AV15pElem_Descripcion = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblelem_consecutivofilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblcata_codigofilter_Jsonclick = "" ;
      lblLblunimed_codfilter_Jsonclick = "" ;
      lblLblelem_estadofilter_Jsonclick = "" ;
      lblLbltipo_codigofilter_Jsonclick = "" ;
      lblLblelem_usuariocreacionfilter_Jsonclick = "" ;
      lblLblelem_fechacreacionfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV13LinkSelection = "" ;
      A66Elem_Consecutivo = "" ;
      A37Cata_Codigo = "" ;
      A557Elem_Descripcion = "" ;
      A558Elem_Estado = "" ;
      A570Elem_UsuarioCreacion = "" ;
      A571Elem_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV7cElem_Consecutivo = "" ;
      lV6cCata_Codigo = "" ;
      lV8cElem_Estado = "" ;
      lV10cElem_UsuarioCreacion = "" ;
      H007P2_A571Elem_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      H007P2_n571Elem_FechaCreacion = new boolean[] {false} ;
      H007P2_A570Elem_UsuarioCreacion = new String[] {""} ;
      H007P2_n570Elem_UsuarioCreacion = new boolean[] {false} ;
      H007P2_A33Tipo_Codigo = new long[1] ;
      H007P2_A558Elem_Estado = new String[] {""} ;
      H007P2_A77UNIMED_COD = new int[1] ;
      H007P2_A557Elem_Descripcion = new String[] {""} ;
      H007P2_A37Cata_Codigo = new String[] {""} ;
      H007P2_A66Elem_Consecutivo = new String[] {""} ;
      H007P3_AGRID1_nRecordCount = new long[1] ;
      AV5ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.sel_elemento__default(),
         new Object[] {
             new Object[] {
            H007P2_A571Elem_FechaCreacion, H007P2_n571Elem_FechaCreacion, H007P2_A570Elem_UsuarioCreacion, H007P2_n570Elem_UsuarioCreacion, H007P2_A33Tipo_Codigo, H007P2_A558Elem_Estado, H007P2_A77UNIMED_COD, H007P2_A557Elem_Descripcion, H007P2_A37Cata_Codigo, H007P2_A66Elem_Consecutivo
            }
            , new Object[] {
            H007P3_AGRID1_nRecordCount
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
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int AV12cUNIMED_COD ;
   private int edtavCelem_consecutivo_Visible ;
   private int edtavCelem_consecutivo_Enabled ;
   private int edtavCcata_codigo_Visible ;
   private int edtavCcata_codigo_Enabled ;
   private int edtavCunimed_cod_Enabled ;
   private int edtavCunimed_cod_Visible ;
   private int edtavCtipo_codigo_Enabled ;
   private int edtavCtipo_codigo_Visible ;
   private int edtavCelem_usuariocreacion_Visible ;
   private int edtavCelem_usuariocreacion_Enabled ;
   private int edtavCelem_fechacreacion_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A77UNIMED_COD ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV11cTipo_Codigo ;
   private long GRID1_nFirstRecordOnPage ;
   private long A33Tipo_Codigo ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divElem_consecutivofiltercontainer_Class ;
   private String divCata_codigofiltercontainer_Class ;
   private String divUnimed_codfiltercontainer_Class ;
   private String divElem_estadofiltercontainer_Class ;
   private String divTipo_codigofiltercontainer_Class ;
   private String divElem_usuariocreacionfiltercontainer_Class ;
   private String divElem_fechacreacionfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String AV8cElem_Estado ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divElem_consecutivofiltercontainer_Internalname ;
   private String lblLblelem_consecutivofilter_Internalname ;
   private String lblLblelem_consecutivofilter_Jsonclick ;
   private String edtavCelem_consecutivo_Internalname ;
   private String TempTags ;
   private String edtavCelem_consecutivo_Jsonclick ;
   private String divCata_codigofiltercontainer_Internalname ;
   private String lblLblcata_codigofilter_Internalname ;
   private String lblLblcata_codigofilter_Jsonclick ;
   private String edtavCcata_codigo_Internalname ;
   private String edtavCcata_codigo_Jsonclick ;
   private String divUnimed_codfiltercontainer_Internalname ;
   private String lblLblunimed_codfilter_Internalname ;
   private String lblLblunimed_codfilter_Jsonclick ;
   private String edtavCunimed_cod_Internalname ;
   private String edtavCunimed_cod_Jsonclick ;
   private String divElem_estadofiltercontainer_Internalname ;
   private String lblLblelem_estadofilter_Internalname ;
   private String lblLblelem_estadofilter_Jsonclick ;
   private String divTipo_codigofiltercontainer_Internalname ;
   private String lblLbltipo_codigofilter_Internalname ;
   private String lblLbltipo_codigofilter_Jsonclick ;
   private String edtavCtipo_codigo_Internalname ;
   private String edtavCtipo_codigo_Jsonclick ;
   private String divElem_usuariocreacionfiltercontainer_Internalname ;
   private String lblLblelem_usuariocreacionfilter_Internalname ;
   private String lblLblelem_usuariocreacionfilter_Jsonclick ;
   private String edtavCelem_usuariocreacion_Internalname ;
   private String edtavCelem_usuariocreacion_Jsonclick ;
   private String divElem_fechacreacionfiltercontainer_Internalname ;
   private String lblLblelem_fechacreacionfilter_Internalname ;
   private String lblLblelem_fechacreacionfilter_Jsonclick ;
   private String edtavCelem_fechacreacion_Internalname ;
   private String edtavCelem_fechacreacion_Jsonclick ;
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
   private String A558Elem_Estado ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtCata_Codigo_Internalname ;
   private String edtElem_Descripcion_Internalname ;
   private String edtUNIMED_COD_Internalname ;
   private String edtTipo_Codigo_Internalname ;
   private String edtElem_UsuarioCreacion_Internalname ;
   private String edtElem_FechaCreacion_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV8cElem_Estado ;
   private String AV5ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtCata_Codigo_Jsonclick ;
   private String edtElem_Descripcion_Jsonclick ;
   private String edtUNIMED_COD_Jsonclick ;
   private String edtTipo_Codigo_Jsonclick ;
   private String edtElem_UsuarioCreacion_Jsonclick ;
   private String edtElem_FechaCreacion_Jsonclick ;
   private java.util.Date AV9cElem_FechaCreacion ;
   private java.util.Date A571Elem_FechaCreacion ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n570Elem_UsuarioCreacion ;
   private boolean n571Elem_FechaCreacion ;
   private boolean returnInSub ;
   private boolean AV13LinkSelection_IsBlob ;
   private String AV7cElem_Consecutivo ;
   private String AV6cCata_Codigo ;
   private String AV10cElem_UsuarioCreacion ;
   private String AV14pElem_Consecutivo ;
   private String AV15pElem_Descripcion ;
   private String A66Elem_Consecutivo ;
   private String A37Cata_Codigo ;
   private String A557Elem_Descripcion ;
   private String A570Elem_UsuarioCreacion ;
   private String AV18Linkselection_GXI ;
   private String lV7cElem_Consecutivo ;
   private String lV6cCata_Codigo ;
   private String lV10cElem_UsuarioCreacion ;
   private String AV13LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCelem_estado ;
   private HTMLChoice cmbElem_Estado ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H007P2_A571Elem_FechaCreacion ;
   private boolean[] H007P2_n571Elem_FechaCreacion ;
   private String[] H007P2_A570Elem_UsuarioCreacion ;
   private boolean[] H007P2_n570Elem_UsuarioCreacion ;
   private long[] H007P2_A33Tipo_Codigo ;
   private String[] H007P2_A558Elem_Estado ;
   private int[] H007P2_A77UNIMED_COD ;
   private String[] H007P2_A557Elem_Descripcion ;
   private String[] H007P2_A37Cata_Codigo ;
   private String[] H007P2_A66Elem_Consecutivo ;
   private long[] H007P3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class sel_elemento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H007P2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV6cCata_Codigo ,
                                          int AV12cUNIMED_COD ,
                                          String AV8cElem_Estado ,
                                          long AV11cTipo_Codigo ,
                                          String AV10cElem_UsuarioCreacion ,
                                          java.util.Date AV9cElem_FechaCreacion ,
                                          String A37Cata_Codigo ,
                                          int A77UNIMED_COD ,
                                          String A558Elem_Estado ,
                                          long A33Tipo_Codigo ,
                                          String A570Elem_UsuarioCreacion ,
                                          java.util.Date A571Elem_FechaCreacion ,
                                          String A66Elem_Consecutivo ,
                                          String AV7cElem_Consecutivo )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ Elem_FechaCreacion, Elem_UsuarioCreacion, Tipo_Codigo, Elem_Estado," ;
      sSelectString = sSelectString + " UNIMED_COD, Elem_Descripcion, Cata_Codigo, Elem_Consecutivo" ;
      sFromString = " FROM ALM_ELEMENTO" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Elem_Consecutivo like ?)" ;
      if ( ! (GXutil.strcmp("", AV6cCata_Codigo)==0) )
      {
         sWhereString = sWhereString + " and (Cata_Codigo like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV12cUNIMED_COD) )
      {
         sWhereString = sWhereString + " and (UNIMED_COD >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cElem_Estado)==0) )
      {
         sWhereString = sWhereString + " and (Elem_Estado like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV11cTipo_Codigo) )
      {
         sWhereString = sWhereString + " and (Tipo_Codigo >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cElem_UsuarioCreacion)==0) )
      {
         sWhereString = sWhereString + " and (Elem_UsuarioCreacion like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9cElem_FechaCreacion) )
      {
         sWhereString = sWhereString + " and (Elem_FechaCreacion >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Elem_Consecutivo" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H007P3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV6cCata_Codigo ,
                                          int AV12cUNIMED_COD ,
                                          String AV8cElem_Estado ,
                                          long AV11cTipo_Codigo ,
                                          String AV10cElem_UsuarioCreacion ,
                                          java.util.Date AV9cElem_FechaCreacion ,
                                          String A37Cata_Codigo ,
                                          int A77UNIMED_COD ,
                                          String A558Elem_Estado ,
                                          long A33Tipo_Codigo ,
                                          String A570Elem_UsuarioCreacion ,
                                          java.util.Date A571Elem_FechaCreacion ,
                                          String A66Elem_Consecutivo ,
                                          String AV7cElem_Consecutivo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_ELEMENTO" ;
      scmdbuf = scmdbuf + " WHERE (Elem_Consecutivo like ?)" ;
      if ( ! (GXutil.strcmp("", AV6cCata_Codigo)==0) )
      {
         sWhereString = sWhereString + " and (Cata_Codigo like ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV12cUNIMED_COD) )
      {
         sWhereString = sWhereString + " and (UNIMED_COD >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cElem_Estado)==0) )
      {
         sWhereString = sWhereString + " and (Elem_Estado like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV11cTipo_Codigo) )
      {
         sWhereString = sWhereString + " and (Tipo_Codigo >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cElem_UsuarioCreacion)==0) )
      {
         sWhereString = sWhereString + " and (Elem_UsuarioCreacion like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9cElem_FechaCreacion) )
      {
         sWhereString = sWhereString + " and (Elem_FechaCreacion >= ?)" ;
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
                  return conditional_H007P2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_H007P3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).longValue() , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H007P2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H007P3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((String[]) buf[5])[0] = rslt.getString(4, 1) ;
               ((int[]) buf[6])[0] = rslt.getInt(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
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
                  stmt.setVarchar(sIdx, (String)parms[10], 9);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 9);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[14]).longValue(), 0);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[16], false);
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
                  stmt.setVarchar(sIdx, (String)parms[7], 9);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 9);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[11]).longValue(), 0);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               return;
      }
   }

}

