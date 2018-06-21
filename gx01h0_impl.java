/*
               File: gx01h0_impl
        Description: Selection List HISTORIAL DEVOLUTIVOS
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:52.35
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

public final  class gx01h0_impl extends GXDataArea
{
   public gx01h0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx01h0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx01h0_impl.class ));
   }

   public gx01h0_impl( int remoteHandle ,
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
            AV6cDEVOC_ID = GXutil.lval( httpContext.GetNextPar( )) ;
            AV7cDEVOC_REGIONAL = GXutil.lval( httpContext.GetNextPar( )) ;
            AV8cDEVOC_TRAN_ID = GXutil.lval( httpContext.GetNextPar( )) ;
            AV9cDEVOC_TIPO_MOVIMIENTO = httpContext.GetNextPar( ) ;
            AV10cDEVOC_CODIGO_MOVIMIENTO = httpContext.GetNextPar( ) ;
            AV11cDEVOC_TRAN_CC = GXutil.lval( httpContext.GetNextPar( )) ;
            AV12cDEVOC_FECHA_MOVIMIENTO = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cDEVOC_ID, AV7cDEVOC_REGIONAL, AV8cDEVOC_TRAN_ID, AV9cDEVOC_TIPO_MOVIMIENTO, AV10cDEVOC_CODIGO_MOVIMIENTO, AV11cDEVOC_TRAN_CC, AV12cDEVOC_FECHA_MOVIMIENTO) ;
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
            AV13pDEVOC_ID = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pDEVOC_ID", GXutil.ltrim( GXutil.str( AV13pDEVOC_ID, 11, 0)));
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
      pa8V2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8V2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414245243");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx01h0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pDEVOC_ID,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDEVOC_ID", GXutil.ltrim( localUtil.ntoc( AV6cDEVOC_ID, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDEVOC_REGIONAL", GXutil.ltrim( localUtil.ntoc( AV7cDEVOC_REGIONAL, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDEVOC_TRAN_ID", GXutil.ltrim( localUtil.ntoc( AV8cDEVOC_TRAN_ID, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDEVOC_TIPO_MOVIMIENTO", AV9cDEVOC_TIPO_MOVIMIENTO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDEVOC_CODIGO_MOVIMIENTO", AV10cDEVOC_CODIGO_MOVIMIENTO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDEVOC_TRAN_CC", GXutil.ltrim( localUtil.ntoc( AV11cDEVOC_TRAN_CC, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCDEVOC_FECHA_MOVIMIENTO", localUtil.format(AV12cDEVOC_FECHA_MOVIMIENTO, "99/99/99"));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPDEVOC_ID", GXutil.ltrim( localUtil.ntoc( AV13pDEVOC_ID, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_IDFILTERCONTAINER_Class", GXutil.rtrim( divDevoc_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_REGIONALFILTERCONTAINER_Class", GXutil.rtrim( divDevoc_regionalfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_TRAN_IDFILTERCONTAINER_Class", GXutil.rtrim( divDevoc_tran_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_TIPO_MOVIMIENTOFILTERCONTAINER_Class", GXutil.rtrim( divDevoc_tipo_movimientofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_CODIGO_MOVIMIENTOFILTERCONTAINER_Class", GXutil.rtrim( divDevoc_codigo_movimientofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_TRAN_CCFILTERCONTAINER_Class", GXutil.rtrim( divDevoc_tran_ccfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_FECHA_MOVIMIENTOFILTERCONTAINER_Class", GXutil.rtrim( divDevoc_fecha_movimientofiltercontainer_Class));
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
         we8V2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8V2( ) ;
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
      return formatLink("com.orions2.gx01h0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pDEVOC_ID,11,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx01H0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List HISTORIAL DEVOLUTIVOS" ;
   }

   public void wb8V0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divDevoc_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divDevoc_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbldevoc_idfilter_Internalname, "HISTORIA ID", "", "", lblLbldevoc_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e118v1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCdevoc_id_Internalname, "HISTORIA ID", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCdevoc_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cDEVOC_ID, (byte)(11), (byte)(0), ",", "")), ((edtavCdevoc_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cDEVOC_ID), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cDEVOC_ID), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCdevoc_id_Jsonclick, 0, "Attribute", "", "", "", edtavCdevoc_id_Visible, edtavCdevoc_id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01H0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divDevoc_regionalfiltercontainer_Internalname, 1, 0, "px", 0, "px", divDevoc_regionalfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbldevoc_regionalfilter_Internalname, "REGIONAL ID", "", "", lblLbldevoc_regionalfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e128v1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCdevoc_regional_Internalname, "REGIONAL ID", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCdevoc_regional_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cDEVOC_REGIONAL, (byte)(11), (byte)(0), ",", "")), ((edtavCdevoc_regional_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cDEVOC_REGIONAL), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cDEVOC_REGIONAL), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCdevoc_regional_Jsonclick, 0, "Attribute", "", "", "", edtavCdevoc_regional_Visible, edtavCdevoc_regional_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01H0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divDevoc_tran_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divDevoc_tran_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbldevoc_tran_idfilter_Internalname, "TRANSANCCIO ID", "", "", lblLbldevoc_tran_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e138v1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCdevoc_tran_id_Internalname, "TRANSANCCIO ID", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCdevoc_tran_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cDEVOC_TRAN_ID, (byte)(11), (byte)(0), ",", "")), ((edtavCdevoc_tran_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cDEVOC_TRAN_ID), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cDEVOC_TRAN_ID), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCdevoc_tran_id_Jsonclick, 0, "Attribute", "", "", "", edtavCdevoc_tran_id_Visible, edtavCdevoc_tran_id_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01H0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divDevoc_tipo_movimientofiltercontainer_Internalname, 1, 0, "px", 0, "px", divDevoc_tipo_movimientofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbldevoc_tipo_movimientofilter_Internalname, "TIPO MOVIMIENTO", "", "", lblLbldevoc_tipo_movimientofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e148v1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCdevoc_tipo_movimiento_Internalname, "TIPO MOVIMIENTO", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCdevoc_tipo_movimiento_Internalname, AV9cDEVOC_TIPO_MOVIMIENTO, GXutil.rtrim( localUtil.format( AV9cDEVOC_TIPO_MOVIMIENTO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCdevoc_tipo_movimiento_Jsonclick, 0, "Attribute", "", "", "", edtavCdevoc_tipo_movimiento_Visible, edtavCdevoc_tipo_movimiento_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01H0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divDevoc_codigo_movimientofiltercontainer_Internalname, 1, 0, "px", 0, "px", divDevoc_codigo_movimientofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbldevoc_codigo_movimientofilter_Internalname, "CODIGO MOVIMIENTO", "", "", lblLbldevoc_codigo_movimientofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e158v1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCdevoc_codigo_movimiento_Internalname, "CODIGO MOVIMIENTO", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCdevoc_codigo_movimiento_Internalname, AV10cDEVOC_CODIGO_MOVIMIENTO, GXutil.rtrim( localUtil.format( AV10cDEVOC_CODIGO_MOVIMIENTO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCdevoc_codigo_movimiento_Jsonclick, 0, "Attribute", "", "", "", edtavCdevoc_codigo_movimiento_Visible, edtavCdevoc_codigo_movimiento_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01H0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divDevoc_tran_ccfiltercontainer_Internalname, 1, 0, "px", 0, "px", divDevoc_tran_ccfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbldevoc_tran_ccfilter_Internalname, "TRANSACCION CONSECUTIVO", "", "", lblLbldevoc_tran_ccfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e168v1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCdevoc_tran_cc_Internalname, "TRANSACCION CONSECUTIVO", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCdevoc_tran_cc_Internalname, GXutil.ltrim( localUtil.ntoc( AV11cDEVOC_TRAN_CC, (byte)(18), (byte)(0), ",", "")), ((edtavCdevoc_tran_cc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11cDEVOC_TRAN_CC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV11cDEVOC_TRAN_CC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCdevoc_tran_cc_Jsonclick, 0, "Attribute", "", "", "", edtavCdevoc_tran_cc_Visible, edtavCdevoc_tran_cc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01H0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divDevoc_fecha_movimientofiltercontainer_Internalname, 1, 0, "px", 0, "px", divDevoc_fecha_movimientofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbldevoc_fecha_movimientofilter_Internalname, "FECHA MOVIMIENTO", "", "", lblLbldevoc_fecha_movimientofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e178v1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01H0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCdevoc_fecha_movimiento_Internalname, "FECHA MOVIMIENTO", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCdevoc_fecha_movimiento_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCdevoc_fecha_movimiento_Internalname, localUtil.format(AV12cDEVOC_FECHA_MOVIMIENTO, "99/99/99"), localUtil.format( AV12cDEVOC_FECHA_MOVIMIENTO, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCdevoc_fecha_movimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCdevoc_fecha_movimiento_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01H0.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e188v1_client"+"'", TempTags, "", 2, "HLP_Gx01H0.htm");
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
            httpContext.writeValue( "ID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "MOVIMIENTO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "MOVIMIENTO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "CONSECUTIVO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "MOVIMIENTO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "RENGLON") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "UTIL") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A95DEVOC_ID, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A96DEVOC_REGIONAL, (byte)(11), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtDEVOC_REGIONAL_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A101DEVOC_TRAN_ID, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A722DEVOC_TIPO_MOVIMIENTO);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A100DEVOC_CODIGO_MOVIMIENTO);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A723DEVOC_TRAN_CC, (byte)(18), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724DEVOC_RENGLON, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A731DEVOC_VIDA_UTIL, (byte)(4), (byte)(0), ".", "")));
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx01H0.htm");
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

   public void start8V2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List HISTORIAL DEVOLUTIVOS", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8V0( ) ;
   }

   public void ws8V2( )
   {
      start8V2( ) ;
      evt8V2( ) ;
   }

   public void evt8V2( )
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
                           A95DEVOC_ID = localUtil.ctol( httpContext.cgiGet( edtDEVOC_ID_Internalname), ",", ".") ;
                           A96DEVOC_REGIONAL = localUtil.ctol( httpContext.cgiGet( edtDEVOC_REGIONAL_Internalname), ",", ".") ;
                           n96DEVOC_REGIONAL = false ;
                           A101DEVOC_TRAN_ID = localUtil.ctol( httpContext.cgiGet( edtDEVOC_TRAN_ID_Internalname), ",", ".") ;
                           n101DEVOC_TRAN_ID = false ;
                           A722DEVOC_TIPO_MOVIMIENTO = httpContext.cgiGet( edtDEVOC_TIPO_MOVIMIENTO_Internalname) ;
                           n722DEVOC_TIPO_MOVIMIENTO = false ;
                           A100DEVOC_CODIGO_MOVIMIENTO = httpContext.cgiGet( edtDEVOC_CODIGO_MOVIMIENTO_Internalname) ;
                           n100DEVOC_CODIGO_MOVIMIENTO = false ;
                           A723DEVOC_TRAN_CC = localUtil.ctol( httpContext.cgiGet( edtDEVOC_TRAN_CC_Internalname), ",", ".") ;
                           n723DEVOC_TRAN_CC = false ;
                           A103DEVOC_FECHA_MOVIMIENTO = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDEVOC_FECHA_MOVIMIENTO_Internalname), 0)) ;
                           n103DEVOC_FECHA_MOVIMIENTO = false ;
                           A724DEVOC_RENGLON = (int)(localUtil.ctol( httpContext.cgiGet( edtDEVOC_RENGLON_Internalname), ",", ".")) ;
                           n724DEVOC_RENGLON = false ;
                           A731DEVOC_VIDA_UTIL = (short)(localUtil.ctol( httpContext.cgiGet( edtDEVOC_VIDA_UTIL_Internalname), ",", ".")) ;
                           n731DEVOC_VIDA_UTIL = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e198V2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e208V2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cdevoc_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDEVOC_ID"), ",", ".") != AV6cDEVOC_ID )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cdevoc_regional Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDEVOC_REGIONAL"), ",", ".") != AV7cDEVOC_REGIONAL )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cdevoc_tran_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDEVOC_TRAN_ID"), ",", ".") != AV8cDEVOC_TRAN_ID )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cdevoc_tipo_movimiento Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCDEVOC_TIPO_MOVIMIENTO"), AV9cDEVOC_TIPO_MOVIMIENTO) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cdevoc_codigo_movimiento Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCDEVOC_CODIGO_MOVIMIENTO"), AV10cDEVOC_CODIGO_MOVIMIENTO) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cdevoc_tran_cc Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDEVOC_TRAN_CC"), ",", ".") != AV11cDEVOC_TRAN_CC )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cdevoc_fecha_movimiento Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCDEVOC_FECHA_MOVIMIENTO"), 0), AV12cDEVOC_FECHA_MOVIMIENTO) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e218V2 ();
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

   public void we8V2( )
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

   public void pa8V2( )
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
                                  long AV6cDEVOC_ID ,
                                  long AV7cDEVOC_REGIONAL ,
                                  long AV8cDEVOC_TRAN_ID ,
                                  String AV9cDEVOC_TIPO_MOVIMIENTO ,
                                  String AV10cDEVOC_CODIGO_MOVIMIENTO ,
                                  long AV11cDEVOC_TRAN_CC ,
                                  java.util.Date AV12cDEVOC_FECHA_MOVIMIENTO )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf8V2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A95DEVOC_ID), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_ID", GXutil.ltrim( localUtil.ntoc( A95DEVOC_ID, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_REGIONAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A96DEVOC_REGIONAL), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_REGIONAL", GXutil.ltrim( localUtil.ntoc( A96DEVOC_REGIONAL, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_TRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A101DEVOC_TRAN_ID), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_TRAN_ID", GXutil.ltrim( localUtil.ntoc( A101DEVOC_TRAN_ID, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_TIPO_MOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A722DEVOC_TIPO_MOVIMIENTO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_TIPO_MOVIMIENTO", A722DEVOC_TIPO_MOVIMIENTO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_CODIGO_MOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A100DEVOC_CODIGO_MOVIMIENTO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_CODIGO_MOVIMIENTO", A100DEVOC_CODIGO_MOVIMIENTO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_TRAN_CC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A723DEVOC_TRAN_CC), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_TRAN_CC", GXutil.ltrim( localUtil.ntoc( A723DEVOC_TRAN_CC, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_FECHA_MOVIMIENTO", getSecureSignedToken( "", A103DEVOC_FECHA_MOVIMIENTO));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_FECHA_MOVIMIENTO", localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_RENGLON", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A724DEVOC_RENGLON), "ZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_RENGLON", GXutil.ltrim( localUtil.ntoc( A724DEVOC_RENGLON, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_VIDA_UTIL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A731DEVOC_VIDA_UTIL), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_VIDA_UTIL", GXutil.ltrim( localUtil.ntoc( A731DEVOC_VIDA_UTIL, (byte)(4), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8V2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf8V2( )
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
                                              new Long(AV7cDEVOC_REGIONAL) ,
                                              new Long(AV8cDEVOC_TRAN_ID) ,
                                              AV9cDEVOC_TIPO_MOVIMIENTO ,
                                              AV10cDEVOC_CODIGO_MOVIMIENTO ,
                                              new Long(AV11cDEVOC_TRAN_CC) ,
                                              AV12cDEVOC_FECHA_MOVIMIENTO ,
                                              new Long(A96DEVOC_REGIONAL) ,
                                              new Long(A101DEVOC_TRAN_ID) ,
                                              A722DEVOC_TIPO_MOVIMIENTO ,
                                              A100DEVOC_CODIGO_MOVIMIENTO ,
                                              new Long(A723DEVOC_TRAN_CC) ,
                                              A103DEVOC_FECHA_MOVIMIENTO ,
                                              new Long(AV6cDEVOC_ID) } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.LONG
                                              }
         } ) ;
         lV9cDEVOC_TIPO_MOVIMIENTO = GXutil.concat( GXutil.rtrim( AV9cDEVOC_TIPO_MOVIMIENTO), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cDEVOC_TIPO_MOVIMIENTO", AV9cDEVOC_TIPO_MOVIMIENTO);
         lV10cDEVOC_CODIGO_MOVIMIENTO = GXutil.concat( GXutil.rtrim( AV10cDEVOC_CODIGO_MOVIMIENTO), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cDEVOC_CODIGO_MOVIMIENTO", AV10cDEVOC_CODIGO_MOVIMIENTO);
         /* Using cursor H008V2 */
         pr_default.execute(0, new Object[] {new Long(AV6cDEVOC_ID), new Long(AV7cDEVOC_REGIONAL), new Long(AV8cDEVOC_TRAN_ID), lV9cDEVOC_TIPO_MOVIMIENTO, lV10cDEVOC_CODIGO_MOVIMIENTO, new Long(AV11cDEVOC_TRAN_CC), AV12cDEVOC_FECHA_MOVIMIENTO, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A731DEVOC_VIDA_UTIL = H008V2_A731DEVOC_VIDA_UTIL[0] ;
            n731DEVOC_VIDA_UTIL = H008V2_n731DEVOC_VIDA_UTIL[0] ;
            A724DEVOC_RENGLON = H008V2_A724DEVOC_RENGLON[0] ;
            n724DEVOC_RENGLON = H008V2_n724DEVOC_RENGLON[0] ;
            A103DEVOC_FECHA_MOVIMIENTO = H008V2_A103DEVOC_FECHA_MOVIMIENTO[0] ;
            n103DEVOC_FECHA_MOVIMIENTO = H008V2_n103DEVOC_FECHA_MOVIMIENTO[0] ;
            A723DEVOC_TRAN_CC = H008V2_A723DEVOC_TRAN_CC[0] ;
            n723DEVOC_TRAN_CC = H008V2_n723DEVOC_TRAN_CC[0] ;
            A100DEVOC_CODIGO_MOVIMIENTO = H008V2_A100DEVOC_CODIGO_MOVIMIENTO[0] ;
            n100DEVOC_CODIGO_MOVIMIENTO = H008V2_n100DEVOC_CODIGO_MOVIMIENTO[0] ;
            A722DEVOC_TIPO_MOVIMIENTO = H008V2_A722DEVOC_TIPO_MOVIMIENTO[0] ;
            n722DEVOC_TIPO_MOVIMIENTO = H008V2_n722DEVOC_TIPO_MOVIMIENTO[0] ;
            A101DEVOC_TRAN_ID = H008V2_A101DEVOC_TRAN_ID[0] ;
            n101DEVOC_TRAN_ID = H008V2_n101DEVOC_TRAN_ID[0] ;
            A96DEVOC_REGIONAL = H008V2_A96DEVOC_REGIONAL[0] ;
            n96DEVOC_REGIONAL = H008V2_n96DEVOC_REGIONAL[0] ;
            A95DEVOC_ID = H008V2_A95DEVOC_ID[0] ;
            /* Execute user event: Load */
            e208V2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb8V0( ) ;
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
                                           new Long(AV7cDEVOC_REGIONAL) ,
                                           new Long(AV8cDEVOC_TRAN_ID) ,
                                           AV9cDEVOC_TIPO_MOVIMIENTO ,
                                           AV10cDEVOC_CODIGO_MOVIMIENTO ,
                                           new Long(AV11cDEVOC_TRAN_CC) ,
                                           AV12cDEVOC_FECHA_MOVIMIENTO ,
                                           new Long(A96DEVOC_REGIONAL) ,
                                           new Long(A101DEVOC_TRAN_ID) ,
                                           A722DEVOC_TIPO_MOVIMIENTO ,
                                           A100DEVOC_CODIGO_MOVIMIENTO ,
                                           new Long(A723DEVOC_TRAN_CC) ,
                                           A103DEVOC_FECHA_MOVIMIENTO ,
                                           new Long(AV6cDEVOC_ID) } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.LONG
                                           }
      } ) ;
      lV9cDEVOC_TIPO_MOVIMIENTO = GXutil.concat( GXutil.rtrim( AV9cDEVOC_TIPO_MOVIMIENTO), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cDEVOC_TIPO_MOVIMIENTO", AV9cDEVOC_TIPO_MOVIMIENTO);
      lV10cDEVOC_CODIGO_MOVIMIENTO = GXutil.concat( GXutil.rtrim( AV10cDEVOC_CODIGO_MOVIMIENTO), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10cDEVOC_CODIGO_MOVIMIENTO", AV10cDEVOC_CODIGO_MOVIMIENTO);
      /* Using cursor H008V3 */
      pr_default.execute(1, new Object[] {new Long(AV6cDEVOC_ID), new Long(AV7cDEVOC_REGIONAL), new Long(AV8cDEVOC_TRAN_ID), lV9cDEVOC_TIPO_MOVIMIENTO, lV10cDEVOC_CODIGO_MOVIMIENTO, new Long(AV11cDEVOC_TRAN_CC), AV12cDEVOC_FECHA_MOVIMIENTO});
      GRID1_nRecordCount = H008V3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cDEVOC_ID, AV7cDEVOC_REGIONAL, AV8cDEVOC_TRAN_ID, AV9cDEVOC_TIPO_MOVIMIENTO, AV10cDEVOC_CODIGO_MOVIMIENTO, AV11cDEVOC_TRAN_CC, AV12cDEVOC_FECHA_MOVIMIENTO) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cDEVOC_ID, AV7cDEVOC_REGIONAL, AV8cDEVOC_TRAN_ID, AV9cDEVOC_TIPO_MOVIMIENTO, AV10cDEVOC_CODIGO_MOVIMIENTO, AV11cDEVOC_TRAN_CC, AV12cDEVOC_FECHA_MOVIMIENTO) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cDEVOC_ID, AV7cDEVOC_REGIONAL, AV8cDEVOC_TRAN_ID, AV9cDEVOC_TIPO_MOVIMIENTO, AV10cDEVOC_CODIGO_MOVIMIENTO, AV11cDEVOC_TRAN_CC, AV12cDEVOC_FECHA_MOVIMIENTO) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cDEVOC_ID, AV7cDEVOC_REGIONAL, AV8cDEVOC_TRAN_ID, AV9cDEVOC_TIPO_MOVIMIENTO, AV10cDEVOC_CODIGO_MOVIMIENTO, AV11cDEVOC_TRAN_CC, AV12cDEVOC_FECHA_MOVIMIENTO) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cDEVOC_ID, AV7cDEVOC_REGIONAL, AV8cDEVOC_TRAN_ID, AV9cDEVOC_TIPO_MOVIMIENTO, AV10cDEVOC_CODIGO_MOVIMIENTO, AV11cDEVOC_TRAN_CC, AV12cDEVOC_FECHA_MOVIMIENTO) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup8V0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e198V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCdevoc_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCdevoc_id_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCDEVOC_ID");
            GX_FocusControl = edtavCdevoc_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cDEVOC_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cDEVOC_ID", GXutil.ltrim( GXutil.str( AV6cDEVOC_ID, 11, 0)));
         }
         else
         {
            AV6cDEVOC_ID = localUtil.ctol( httpContext.cgiGet( edtavCdevoc_id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cDEVOC_ID", GXutil.ltrim( GXutil.str( AV6cDEVOC_ID, 11, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCdevoc_regional_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCdevoc_regional_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCDEVOC_REGIONAL");
            GX_FocusControl = edtavCdevoc_regional_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cDEVOC_REGIONAL = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cDEVOC_REGIONAL", GXutil.ltrim( GXutil.str( AV7cDEVOC_REGIONAL, 11, 0)));
         }
         else
         {
            AV7cDEVOC_REGIONAL = localUtil.ctol( httpContext.cgiGet( edtavCdevoc_regional_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cDEVOC_REGIONAL", GXutil.ltrim( GXutil.str( AV7cDEVOC_REGIONAL, 11, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCdevoc_tran_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCdevoc_tran_id_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCDEVOC_TRAN_ID");
            GX_FocusControl = edtavCdevoc_tran_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cDEVOC_TRAN_ID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cDEVOC_TRAN_ID", GXutil.ltrim( GXutil.str( AV8cDEVOC_TRAN_ID, 11, 0)));
         }
         else
         {
            AV8cDEVOC_TRAN_ID = localUtil.ctol( httpContext.cgiGet( edtavCdevoc_tran_id_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cDEVOC_TRAN_ID", GXutil.ltrim( GXutil.str( AV8cDEVOC_TRAN_ID, 11, 0)));
         }
         AV9cDEVOC_TIPO_MOVIMIENTO = httpContext.cgiGet( edtavCdevoc_tipo_movimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cDEVOC_TIPO_MOVIMIENTO", AV9cDEVOC_TIPO_MOVIMIENTO);
         AV10cDEVOC_CODIGO_MOVIMIENTO = httpContext.cgiGet( edtavCdevoc_codigo_movimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cDEVOC_CODIGO_MOVIMIENTO", AV10cDEVOC_CODIGO_MOVIMIENTO);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCdevoc_tran_cc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCdevoc_tran_cc_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCDEVOC_TRAN_CC");
            GX_FocusControl = edtavCdevoc_tran_cc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cDEVOC_TRAN_CC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cDEVOC_TRAN_CC", GXutil.ltrim( GXutil.str( AV11cDEVOC_TRAN_CC, 18, 0)));
         }
         else
         {
            AV11cDEVOC_TRAN_CC = localUtil.ctol( httpContext.cgiGet( edtavCdevoc_tran_cc_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cDEVOC_TRAN_CC", GXutil.ltrim( GXutil.str( AV11cDEVOC_TRAN_CC, 18, 0)));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCdevoc_fecha_movimiento_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCDEVOC_FECHA_MOVIMIENTO");
            GX_FocusControl = edtavCdevoc_fecha_movimiento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cDEVOC_FECHA_MOVIMIENTO = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cDEVOC_FECHA_MOVIMIENTO", localUtil.format(AV12cDEVOC_FECHA_MOVIMIENTO, "99/99/99"));
         }
         else
         {
            AV12cDEVOC_FECHA_MOVIMIENTO = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCdevoc_fecha_movimiento_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cDEVOC_FECHA_MOVIMIENTO", localUtil.format(AV12cDEVOC_FECHA_MOVIMIENTO, "99/99/99"));
         }
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDEVOC_ID"), ",", ".") != AV6cDEVOC_ID )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDEVOC_REGIONAL"), ",", ".") != AV7cDEVOC_REGIONAL )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDEVOC_TRAN_ID"), ",", ".") != AV8cDEVOC_TRAN_ID )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCDEVOC_TIPO_MOVIMIENTO"), AV9cDEVOC_TIPO_MOVIMIENTO) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCDEVOC_CODIGO_MOVIMIENTO"), AV10cDEVOC_CODIGO_MOVIMIENTO) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCDEVOC_TRAN_CC"), ",", ".") != AV11cDEVOC_TRAN_CC )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCDEVOC_FECHA_MOVIMIENTO"), 0), AV12cDEVOC_FECHA_MOVIMIENTO) ) )
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
      e198V2 ();
      if (returnInSub) return;
   }

   public void e198V2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "HISTORIAL DEVOLUTIVOS", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e208V2( )
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
      e218V2 ();
      if (returnInSub) return;
   }

   public void e218V2( )
   {
      /* Enter Routine */
      AV13pDEVOC_ID = A95DEVOC_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pDEVOC_ID", GXutil.ltrim( GXutil.str( AV13pDEVOC_ID, 11, 0)));
      httpContext.setWebReturnParms(new Object[] {new Long(AV13pDEVOC_ID)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pDEVOC_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pDEVOC_ID", GXutil.ltrim( GXutil.str( AV13pDEVOC_ID, 11, 0)));
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
      pa8V2( ) ;
      ws8V2( ) ;
      we8V2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414245382");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx01h0.js", "?201861414245383");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtDEVOC_ID_Internalname = "DEVOC_ID_"+sGXsfl_84_idx ;
      edtDEVOC_REGIONAL_Internalname = "DEVOC_REGIONAL_"+sGXsfl_84_idx ;
      edtDEVOC_TRAN_ID_Internalname = "DEVOC_TRAN_ID_"+sGXsfl_84_idx ;
      edtDEVOC_TIPO_MOVIMIENTO_Internalname = "DEVOC_TIPO_MOVIMIENTO_"+sGXsfl_84_idx ;
      edtDEVOC_CODIGO_MOVIMIENTO_Internalname = "DEVOC_CODIGO_MOVIMIENTO_"+sGXsfl_84_idx ;
      edtDEVOC_TRAN_CC_Internalname = "DEVOC_TRAN_CC_"+sGXsfl_84_idx ;
      edtDEVOC_FECHA_MOVIMIENTO_Internalname = "DEVOC_FECHA_MOVIMIENTO_"+sGXsfl_84_idx ;
      edtDEVOC_RENGLON_Internalname = "DEVOC_RENGLON_"+sGXsfl_84_idx ;
      edtDEVOC_VIDA_UTIL_Internalname = "DEVOC_VIDA_UTIL_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtDEVOC_ID_Internalname = "DEVOC_ID_"+sGXsfl_84_fel_idx ;
      edtDEVOC_REGIONAL_Internalname = "DEVOC_REGIONAL_"+sGXsfl_84_fel_idx ;
      edtDEVOC_TRAN_ID_Internalname = "DEVOC_TRAN_ID_"+sGXsfl_84_fel_idx ;
      edtDEVOC_TIPO_MOVIMIENTO_Internalname = "DEVOC_TIPO_MOVIMIENTO_"+sGXsfl_84_fel_idx ;
      edtDEVOC_CODIGO_MOVIMIENTO_Internalname = "DEVOC_CODIGO_MOVIMIENTO_"+sGXsfl_84_fel_idx ;
      edtDEVOC_TRAN_CC_Internalname = "DEVOC_TRAN_CC_"+sGXsfl_84_fel_idx ;
      edtDEVOC_FECHA_MOVIMIENTO_Internalname = "DEVOC_FECHA_MOVIMIENTO_"+sGXsfl_84_fel_idx ;
      edtDEVOC_RENGLON_Internalname = "DEVOC_RENGLON_"+sGXsfl_84_fel_idx ;
      edtDEVOC_VIDA_UTIL_Internalname = "DEVOC_VIDA_UTIL_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb8V0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A95DEVOC_ID, (byte)(11), (byte)(0), ",", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A95DEVOC_ID, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A95DEVOC_ID), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtDEVOC_REGIONAL_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A95DEVOC_ID, (byte)(11), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtDEVOC_REGIONAL_Internalname, "Link", edtDEVOC_REGIONAL_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_REGIONAL_Internalname,GXutil.ltrim( localUtil.ntoc( A96DEVOC_REGIONAL, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A96DEVOC_REGIONAL), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtDEVOC_REGIONAL_Link,"","","",edtDEVOC_REGIONAL_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_TRAN_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A101DEVOC_TRAN_ID, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A101DEVOC_TRAN_ID), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_TRAN_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_TIPO_MOVIMIENTO_Internalname,A722DEVOC_TIPO_MOVIMIENTO,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_TIPO_MOVIMIENTO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_CODIGO_MOVIMIENTO_Internalname,A100DEVOC_CODIGO_MOVIMIENTO,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_CODIGO_MOVIMIENTO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_TRAN_CC_Internalname,GXutil.ltrim( localUtil.ntoc( A723DEVOC_TRAN_CC, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A723DEVOC_TRAN_CC), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_TRAN_CC_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_FECHA_MOVIMIENTO_Internalname,localUtil.format(A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"),localUtil.format( A103DEVOC_FECHA_MOVIMIENTO, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_FECHA_MOVIMIENTO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_RENGLON_Internalname,GXutil.ltrim( localUtil.ntoc( A724DEVOC_RENGLON, (byte)(5), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A724DEVOC_RENGLON), "ZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_RENGLON_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(5),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDEVOC_VIDA_UTIL_Internalname,GXutil.ltrim( localUtil.ntoc( A731DEVOC_VIDA_UTIL, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A731DEVOC_VIDA_UTIL), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDEVOC_VIDA_UTIL_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_ID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A95DEVOC_ID), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_REGIONAL"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A96DEVOC_REGIONAL), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_TRAN_ID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A101DEVOC_TRAN_ID), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_TIPO_MOVIMIENTO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A722DEVOC_TIPO_MOVIMIENTO, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_CODIGO_MOVIMIENTO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A100DEVOC_CODIGO_MOVIMIENTO, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_TRAN_CC"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A723DEVOC_TRAN_CC), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_FECHA_MOVIMIENTO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, A103DEVOC_FECHA_MOVIMIENTO));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_RENGLON"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A724DEVOC_RENGLON), "ZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVOC_VIDA_UTIL"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A731DEVOC_VIDA_UTIL), "ZZZ9")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLbldevoc_idfilter_Internalname = "LBLDEVOC_IDFILTER" ;
      edtavCdevoc_id_Internalname = "vCDEVOC_ID" ;
      divDevoc_idfiltercontainer_Internalname = "DEVOC_IDFILTERCONTAINER" ;
      lblLbldevoc_regionalfilter_Internalname = "LBLDEVOC_REGIONALFILTER" ;
      edtavCdevoc_regional_Internalname = "vCDEVOC_REGIONAL" ;
      divDevoc_regionalfiltercontainer_Internalname = "DEVOC_REGIONALFILTERCONTAINER" ;
      lblLbldevoc_tran_idfilter_Internalname = "LBLDEVOC_TRAN_IDFILTER" ;
      edtavCdevoc_tran_id_Internalname = "vCDEVOC_TRAN_ID" ;
      divDevoc_tran_idfiltercontainer_Internalname = "DEVOC_TRAN_IDFILTERCONTAINER" ;
      lblLbldevoc_tipo_movimientofilter_Internalname = "LBLDEVOC_TIPO_MOVIMIENTOFILTER" ;
      edtavCdevoc_tipo_movimiento_Internalname = "vCDEVOC_TIPO_MOVIMIENTO" ;
      divDevoc_tipo_movimientofiltercontainer_Internalname = "DEVOC_TIPO_MOVIMIENTOFILTERCONTAINER" ;
      lblLbldevoc_codigo_movimientofilter_Internalname = "LBLDEVOC_CODIGO_MOVIMIENTOFILTER" ;
      edtavCdevoc_codigo_movimiento_Internalname = "vCDEVOC_CODIGO_MOVIMIENTO" ;
      divDevoc_codigo_movimientofiltercontainer_Internalname = "DEVOC_CODIGO_MOVIMIENTOFILTERCONTAINER" ;
      lblLbldevoc_tran_ccfilter_Internalname = "LBLDEVOC_TRAN_CCFILTER" ;
      edtavCdevoc_tran_cc_Internalname = "vCDEVOC_TRAN_CC" ;
      divDevoc_tran_ccfiltercontainer_Internalname = "DEVOC_TRAN_CCFILTERCONTAINER" ;
      lblLbldevoc_fecha_movimientofilter_Internalname = "LBLDEVOC_FECHA_MOVIMIENTOFILTER" ;
      edtavCdevoc_fecha_movimiento_Internalname = "vCDEVOC_FECHA_MOVIMIENTO" ;
      divDevoc_fecha_movimientofiltercontainer_Internalname = "DEVOC_FECHA_MOVIMIENTOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtDEVOC_ID_Internalname = "DEVOC_ID" ;
      edtDEVOC_REGIONAL_Internalname = "DEVOC_REGIONAL" ;
      edtDEVOC_TRAN_ID_Internalname = "DEVOC_TRAN_ID" ;
      edtDEVOC_TIPO_MOVIMIENTO_Internalname = "DEVOC_TIPO_MOVIMIENTO" ;
      edtDEVOC_CODIGO_MOVIMIENTO_Internalname = "DEVOC_CODIGO_MOVIMIENTO" ;
      edtDEVOC_TRAN_CC_Internalname = "DEVOC_TRAN_CC" ;
      edtDEVOC_FECHA_MOVIMIENTO_Internalname = "DEVOC_FECHA_MOVIMIENTO" ;
      edtDEVOC_RENGLON_Internalname = "DEVOC_RENGLON" ;
      edtDEVOC_VIDA_UTIL_Internalname = "DEVOC_VIDA_UTIL" ;
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
      edtDEVOC_VIDA_UTIL_Jsonclick = "" ;
      edtDEVOC_RENGLON_Jsonclick = "" ;
      edtDEVOC_FECHA_MOVIMIENTO_Jsonclick = "" ;
      edtDEVOC_TRAN_CC_Jsonclick = "" ;
      edtDEVOC_CODIGO_MOVIMIENTO_Jsonclick = "" ;
      edtDEVOC_TIPO_MOVIMIENTO_Jsonclick = "" ;
      edtDEVOC_TRAN_ID_Jsonclick = "" ;
      edtDEVOC_REGIONAL_Jsonclick = "" ;
      edtDEVOC_ID_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtDEVOC_REGIONAL_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCdevoc_fecha_movimiento_Jsonclick = "" ;
      edtavCdevoc_fecha_movimiento_Enabled = 1 ;
      edtavCdevoc_tran_cc_Jsonclick = "" ;
      edtavCdevoc_tran_cc_Enabled = 1 ;
      edtavCdevoc_tran_cc_Visible = 1 ;
      edtavCdevoc_codigo_movimiento_Jsonclick = "" ;
      edtavCdevoc_codigo_movimiento_Enabled = 1 ;
      edtavCdevoc_codigo_movimiento_Visible = 1 ;
      edtavCdevoc_tipo_movimiento_Jsonclick = "" ;
      edtavCdevoc_tipo_movimiento_Enabled = 1 ;
      edtavCdevoc_tipo_movimiento_Visible = 1 ;
      edtavCdevoc_tran_id_Jsonclick = "" ;
      edtavCdevoc_tran_id_Enabled = 1 ;
      edtavCdevoc_tran_id_Visible = 1 ;
      edtavCdevoc_regional_Jsonclick = "" ;
      edtavCdevoc_regional_Enabled = 1 ;
      edtavCdevoc_regional_Visible = 1 ;
      edtavCdevoc_id_Jsonclick = "" ;
      edtavCdevoc_id_Enabled = 1 ;
      edtavCdevoc_id_Visible = 1 ;
      divDevoc_fecha_movimientofiltercontainer_Class = "AdvancedContainerItem" ;
      divDevoc_tran_ccfiltercontainer_Class = "AdvancedContainerItem" ;
      divDevoc_codigo_movimientofiltercontainer_Class = "AdvancedContainerItem" ;
      divDevoc_tipo_movimientofiltercontainer_Class = "AdvancedContainerItem" ;
      divDevoc_tran_idfiltercontainer_Class = "AdvancedContainerItem" ;
      divDevoc_regionalfiltercontainer_Class = "AdvancedContainerItem" ;
      divDevoc_idfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List HISTORIAL DEVOLUTIVOS" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cDEVOC_ID',fld:'vCDEVOC_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cDEVOC_REGIONAL',fld:'vCDEVOC_REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8cDEVOC_TRAN_ID',fld:'vCDEVOC_TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cDEVOC_TIPO_MOVIMIENTO',fld:'vCDEVOC_TIPO_MOVIMIENTO',pic:'',nv:''},{av:'AV10cDEVOC_CODIGO_MOVIMIENTO',fld:'vCDEVOC_CODIGO_MOVIMIENTO',pic:'',nv:''},{av:'AV11cDEVOC_TRAN_CC',fld:'vCDEVOC_TRAN_CC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12cDEVOC_FECHA_MOVIMIENTO',fld:'vCDEVOC_FECHA_MOVIMIENTO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e188V1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLDEVOC_IDFILTER.CLICK","{handler:'e118V1',iparms:[{av:'divDevoc_idfiltercontainer_Class',ctrl:'DEVOC_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDevoc_idfiltercontainer_Class',ctrl:'DEVOC_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCdevoc_id_Visible',ctrl:'vCDEVOC_ID',prop:'Visible'}]}");
      setEventMetadata("LBLDEVOC_REGIONALFILTER.CLICK","{handler:'e128V1',iparms:[{av:'divDevoc_regionalfiltercontainer_Class',ctrl:'DEVOC_REGIONALFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDevoc_regionalfiltercontainer_Class',ctrl:'DEVOC_REGIONALFILTERCONTAINER',prop:'Class'},{av:'edtavCdevoc_regional_Visible',ctrl:'vCDEVOC_REGIONAL',prop:'Visible'}]}");
      setEventMetadata("LBLDEVOC_TRAN_IDFILTER.CLICK","{handler:'e138V1',iparms:[{av:'divDevoc_tran_idfiltercontainer_Class',ctrl:'DEVOC_TRAN_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDevoc_tran_idfiltercontainer_Class',ctrl:'DEVOC_TRAN_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCdevoc_tran_id_Visible',ctrl:'vCDEVOC_TRAN_ID',prop:'Visible'}]}");
      setEventMetadata("LBLDEVOC_TIPO_MOVIMIENTOFILTER.CLICK","{handler:'e148V1',iparms:[{av:'divDevoc_tipo_movimientofiltercontainer_Class',ctrl:'DEVOC_TIPO_MOVIMIENTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDevoc_tipo_movimientofiltercontainer_Class',ctrl:'DEVOC_TIPO_MOVIMIENTOFILTERCONTAINER',prop:'Class'},{av:'edtavCdevoc_tipo_movimiento_Visible',ctrl:'vCDEVOC_TIPO_MOVIMIENTO',prop:'Visible'}]}");
      setEventMetadata("LBLDEVOC_CODIGO_MOVIMIENTOFILTER.CLICK","{handler:'e158V1',iparms:[{av:'divDevoc_codigo_movimientofiltercontainer_Class',ctrl:'DEVOC_CODIGO_MOVIMIENTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDevoc_codigo_movimientofiltercontainer_Class',ctrl:'DEVOC_CODIGO_MOVIMIENTOFILTERCONTAINER',prop:'Class'},{av:'edtavCdevoc_codigo_movimiento_Visible',ctrl:'vCDEVOC_CODIGO_MOVIMIENTO',prop:'Visible'}]}");
      setEventMetadata("LBLDEVOC_TRAN_CCFILTER.CLICK","{handler:'e168V1',iparms:[{av:'divDevoc_tran_ccfiltercontainer_Class',ctrl:'DEVOC_TRAN_CCFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDevoc_tran_ccfiltercontainer_Class',ctrl:'DEVOC_TRAN_CCFILTERCONTAINER',prop:'Class'},{av:'edtavCdevoc_tran_cc_Visible',ctrl:'vCDEVOC_TRAN_CC',prop:'Visible'}]}");
      setEventMetadata("LBLDEVOC_FECHA_MOVIMIENTOFILTER.CLICK","{handler:'e178V1',iparms:[{av:'divDevoc_fecha_movimientofiltercontainer_Class',ctrl:'DEVOC_FECHA_MOVIMIENTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divDevoc_fecha_movimientofiltercontainer_Class',ctrl:'DEVOC_FECHA_MOVIMIENTOFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("ENTER","{handler:'e218V2',iparms:[{av:'A95DEVOC_ID',fld:'DEVOC_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pDEVOC_ID',fld:'vPDEVOC_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cDEVOC_ID',fld:'vCDEVOC_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cDEVOC_REGIONAL',fld:'vCDEVOC_REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8cDEVOC_TRAN_ID',fld:'vCDEVOC_TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cDEVOC_TIPO_MOVIMIENTO',fld:'vCDEVOC_TIPO_MOVIMIENTO',pic:'',nv:''},{av:'AV10cDEVOC_CODIGO_MOVIMIENTO',fld:'vCDEVOC_CODIGO_MOVIMIENTO',pic:'',nv:''},{av:'AV11cDEVOC_TRAN_CC',fld:'vCDEVOC_TRAN_CC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12cDEVOC_FECHA_MOVIMIENTO',fld:'vCDEVOC_FECHA_MOVIMIENTO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cDEVOC_ID',fld:'vCDEVOC_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cDEVOC_REGIONAL',fld:'vCDEVOC_REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8cDEVOC_TRAN_ID',fld:'vCDEVOC_TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cDEVOC_TIPO_MOVIMIENTO',fld:'vCDEVOC_TIPO_MOVIMIENTO',pic:'',nv:''},{av:'AV10cDEVOC_CODIGO_MOVIMIENTO',fld:'vCDEVOC_CODIGO_MOVIMIENTO',pic:'',nv:''},{av:'AV11cDEVOC_TRAN_CC',fld:'vCDEVOC_TRAN_CC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12cDEVOC_FECHA_MOVIMIENTO',fld:'vCDEVOC_FECHA_MOVIMIENTO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cDEVOC_ID',fld:'vCDEVOC_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cDEVOC_REGIONAL',fld:'vCDEVOC_REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8cDEVOC_TRAN_ID',fld:'vCDEVOC_TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cDEVOC_TIPO_MOVIMIENTO',fld:'vCDEVOC_TIPO_MOVIMIENTO',pic:'',nv:''},{av:'AV10cDEVOC_CODIGO_MOVIMIENTO',fld:'vCDEVOC_CODIGO_MOVIMIENTO',pic:'',nv:''},{av:'AV11cDEVOC_TRAN_CC',fld:'vCDEVOC_TRAN_CC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12cDEVOC_FECHA_MOVIMIENTO',fld:'vCDEVOC_FECHA_MOVIMIENTO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cDEVOC_ID',fld:'vCDEVOC_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cDEVOC_REGIONAL',fld:'vCDEVOC_REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8cDEVOC_TRAN_ID',fld:'vCDEVOC_TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cDEVOC_TIPO_MOVIMIENTO',fld:'vCDEVOC_TIPO_MOVIMIENTO',pic:'',nv:''},{av:'AV10cDEVOC_CODIGO_MOVIMIENTO',fld:'vCDEVOC_CODIGO_MOVIMIENTO',pic:'',nv:''},{av:'AV11cDEVOC_TRAN_CC',fld:'vCDEVOC_TRAN_CC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12cDEVOC_FECHA_MOVIMIENTO',fld:'vCDEVOC_FECHA_MOVIMIENTO',pic:'',nv:''}],oparms:[]}");
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
      AV9cDEVOC_TIPO_MOVIMIENTO = "" ;
      AV10cDEVOC_CODIGO_MOVIMIENTO = "" ;
      AV12cDEVOC_FECHA_MOVIMIENTO = GXutil.nullDate() ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLbldevoc_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLbldevoc_regionalfilter_Jsonclick = "" ;
      lblLbldevoc_tran_idfilter_Jsonclick = "" ;
      lblLbldevoc_tipo_movimientofilter_Jsonclick = "" ;
      lblLbldevoc_codigo_movimientofilter_Jsonclick = "" ;
      lblLbldevoc_tran_ccfilter_Jsonclick = "" ;
      lblLbldevoc_fecha_movimientofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A722DEVOC_TIPO_MOVIMIENTO = "" ;
      A100DEVOC_CODIGO_MOVIMIENTO = "" ;
      A103DEVOC_FECHA_MOVIMIENTO = GXutil.nullDate() ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV9cDEVOC_TIPO_MOVIMIENTO = "" ;
      lV10cDEVOC_CODIGO_MOVIMIENTO = "" ;
      H008V2_A731DEVOC_VIDA_UTIL = new short[1] ;
      H008V2_n731DEVOC_VIDA_UTIL = new boolean[] {false} ;
      H008V2_A724DEVOC_RENGLON = new int[1] ;
      H008V2_n724DEVOC_RENGLON = new boolean[] {false} ;
      H008V2_A103DEVOC_FECHA_MOVIMIENTO = new java.util.Date[] {GXutil.nullDate()} ;
      H008V2_n103DEVOC_FECHA_MOVIMIENTO = new boolean[] {false} ;
      H008V2_A723DEVOC_TRAN_CC = new long[1] ;
      H008V2_n723DEVOC_TRAN_CC = new boolean[] {false} ;
      H008V2_A100DEVOC_CODIGO_MOVIMIENTO = new String[] {""} ;
      H008V2_n100DEVOC_CODIGO_MOVIMIENTO = new boolean[] {false} ;
      H008V2_A722DEVOC_TIPO_MOVIMIENTO = new String[] {""} ;
      H008V2_n722DEVOC_TIPO_MOVIMIENTO = new boolean[] {false} ;
      H008V2_A101DEVOC_TRAN_ID = new long[1] ;
      H008V2_n101DEVOC_TRAN_ID = new boolean[] {false} ;
      H008V2_A96DEVOC_REGIONAL = new long[1] ;
      H008V2_n96DEVOC_REGIONAL = new boolean[] {false} ;
      H008V2_A95DEVOC_ID = new long[1] ;
      H008V3_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx01h0__default(),
         new Object[] {
             new Object[] {
            H008V2_A731DEVOC_VIDA_UTIL, H008V2_n731DEVOC_VIDA_UTIL, H008V2_A724DEVOC_RENGLON, H008V2_n724DEVOC_RENGLON, H008V2_A103DEVOC_FECHA_MOVIMIENTO, H008V2_n103DEVOC_FECHA_MOVIMIENTO, H008V2_A723DEVOC_TRAN_CC, H008V2_n723DEVOC_TRAN_CC, H008V2_A100DEVOC_CODIGO_MOVIMIENTO, H008V2_n100DEVOC_CODIGO_MOVIMIENTO,
            H008V2_A722DEVOC_TIPO_MOVIMIENTO, H008V2_n722DEVOC_TIPO_MOVIMIENTO, H008V2_A101DEVOC_TRAN_ID, H008V2_n101DEVOC_TRAN_ID, H008V2_A96DEVOC_REGIONAL, H008V2_n96DEVOC_REGIONAL, H008V2_A95DEVOC_ID
            }
            , new Object[] {
            H008V3_AGRID1_nRecordCount
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
   private short A731DEVOC_VIDA_UTIL ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCdevoc_id_Enabled ;
   private int edtavCdevoc_id_Visible ;
   private int edtavCdevoc_regional_Enabled ;
   private int edtavCdevoc_regional_Visible ;
   private int edtavCdevoc_tran_id_Enabled ;
   private int edtavCdevoc_tran_id_Visible ;
   private int edtavCdevoc_tipo_movimiento_Visible ;
   private int edtavCdevoc_tipo_movimiento_Enabled ;
   private int edtavCdevoc_codigo_movimiento_Visible ;
   private int edtavCdevoc_codigo_movimiento_Enabled ;
   private int edtavCdevoc_tran_cc_Enabled ;
   private int edtavCdevoc_tran_cc_Visible ;
   private int edtavCdevoc_fecha_movimiento_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A724DEVOC_RENGLON ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV6cDEVOC_ID ;
   private long AV7cDEVOC_REGIONAL ;
   private long AV8cDEVOC_TRAN_ID ;
   private long AV11cDEVOC_TRAN_CC ;
   private long AV13pDEVOC_ID ;
   private long GRID1_nFirstRecordOnPage ;
   private long A95DEVOC_ID ;
   private long A96DEVOC_REGIONAL ;
   private long A101DEVOC_TRAN_ID ;
   private long A723DEVOC_TRAN_CC ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divDevoc_idfiltercontainer_Class ;
   private String divDevoc_regionalfiltercontainer_Class ;
   private String divDevoc_tran_idfiltercontainer_Class ;
   private String divDevoc_tipo_movimientofiltercontainer_Class ;
   private String divDevoc_codigo_movimientofiltercontainer_Class ;
   private String divDevoc_tran_ccfiltercontainer_Class ;
   private String divDevoc_fecha_movimientofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_84_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divDevoc_idfiltercontainer_Internalname ;
   private String lblLbldevoc_idfilter_Internalname ;
   private String lblLbldevoc_idfilter_Jsonclick ;
   private String edtavCdevoc_id_Internalname ;
   private String TempTags ;
   private String edtavCdevoc_id_Jsonclick ;
   private String divDevoc_regionalfiltercontainer_Internalname ;
   private String lblLbldevoc_regionalfilter_Internalname ;
   private String lblLbldevoc_regionalfilter_Jsonclick ;
   private String edtavCdevoc_regional_Internalname ;
   private String edtavCdevoc_regional_Jsonclick ;
   private String divDevoc_tran_idfiltercontainer_Internalname ;
   private String lblLbldevoc_tran_idfilter_Internalname ;
   private String lblLbldevoc_tran_idfilter_Jsonclick ;
   private String edtavCdevoc_tran_id_Internalname ;
   private String edtavCdevoc_tran_id_Jsonclick ;
   private String divDevoc_tipo_movimientofiltercontainer_Internalname ;
   private String lblLbldevoc_tipo_movimientofilter_Internalname ;
   private String lblLbldevoc_tipo_movimientofilter_Jsonclick ;
   private String edtavCdevoc_tipo_movimiento_Internalname ;
   private String edtavCdevoc_tipo_movimiento_Jsonclick ;
   private String divDevoc_codigo_movimientofiltercontainer_Internalname ;
   private String lblLbldevoc_codigo_movimientofilter_Internalname ;
   private String lblLbldevoc_codigo_movimientofilter_Jsonclick ;
   private String edtavCdevoc_codigo_movimiento_Internalname ;
   private String edtavCdevoc_codigo_movimiento_Jsonclick ;
   private String divDevoc_tran_ccfiltercontainer_Internalname ;
   private String lblLbldevoc_tran_ccfilter_Internalname ;
   private String lblLbldevoc_tran_ccfilter_Jsonclick ;
   private String edtavCdevoc_tran_cc_Internalname ;
   private String edtavCdevoc_tran_cc_Jsonclick ;
   private String divDevoc_fecha_movimientofiltercontainer_Internalname ;
   private String lblLbldevoc_fecha_movimientofilter_Internalname ;
   private String lblLbldevoc_fecha_movimientofilter_Jsonclick ;
   private String edtavCdevoc_fecha_movimiento_Internalname ;
   private String edtavCdevoc_fecha_movimiento_Jsonclick ;
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
   private String edtDEVOC_REGIONAL_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtDEVOC_ID_Internalname ;
   private String edtDEVOC_REGIONAL_Internalname ;
   private String edtDEVOC_TRAN_ID_Internalname ;
   private String edtDEVOC_TIPO_MOVIMIENTO_Internalname ;
   private String edtDEVOC_CODIGO_MOVIMIENTO_Internalname ;
   private String edtDEVOC_TRAN_CC_Internalname ;
   private String edtDEVOC_FECHA_MOVIMIENTO_Internalname ;
   private String edtDEVOC_RENGLON_Internalname ;
   private String edtDEVOC_VIDA_UTIL_Internalname ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtDEVOC_ID_Jsonclick ;
   private String edtDEVOC_REGIONAL_Jsonclick ;
   private String edtDEVOC_TRAN_ID_Jsonclick ;
   private String edtDEVOC_TIPO_MOVIMIENTO_Jsonclick ;
   private String edtDEVOC_CODIGO_MOVIMIENTO_Jsonclick ;
   private String edtDEVOC_TRAN_CC_Jsonclick ;
   private String edtDEVOC_FECHA_MOVIMIENTO_Jsonclick ;
   private String edtDEVOC_RENGLON_Jsonclick ;
   private String edtDEVOC_VIDA_UTIL_Jsonclick ;
   private java.util.Date AV12cDEVOC_FECHA_MOVIMIENTO ;
   private java.util.Date A103DEVOC_FECHA_MOVIMIENTO ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n96DEVOC_REGIONAL ;
   private boolean n101DEVOC_TRAN_ID ;
   private boolean n722DEVOC_TIPO_MOVIMIENTO ;
   private boolean n100DEVOC_CODIGO_MOVIMIENTO ;
   private boolean n723DEVOC_TRAN_CC ;
   private boolean n103DEVOC_FECHA_MOVIMIENTO ;
   private boolean n724DEVOC_RENGLON ;
   private boolean n731DEVOC_VIDA_UTIL ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV9cDEVOC_TIPO_MOVIMIENTO ;
   private String AV10cDEVOC_CODIGO_MOVIMIENTO ;
   private String A722DEVOC_TIPO_MOVIMIENTO ;
   private String A100DEVOC_CODIGO_MOVIMIENTO ;
   private String AV17Linkselection_GXI ;
   private String lV9cDEVOC_TIPO_MOVIMIENTO ;
   private String lV10cDEVOC_CODIGO_MOVIMIENTO ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private short[] H008V2_A731DEVOC_VIDA_UTIL ;
   private boolean[] H008V2_n731DEVOC_VIDA_UTIL ;
   private int[] H008V2_A724DEVOC_RENGLON ;
   private boolean[] H008V2_n724DEVOC_RENGLON ;
   private java.util.Date[] H008V2_A103DEVOC_FECHA_MOVIMIENTO ;
   private boolean[] H008V2_n103DEVOC_FECHA_MOVIMIENTO ;
   private long[] H008V2_A723DEVOC_TRAN_CC ;
   private boolean[] H008V2_n723DEVOC_TRAN_CC ;
   private String[] H008V2_A100DEVOC_CODIGO_MOVIMIENTO ;
   private boolean[] H008V2_n100DEVOC_CODIGO_MOVIMIENTO ;
   private String[] H008V2_A722DEVOC_TIPO_MOVIMIENTO ;
   private boolean[] H008V2_n722DEVOC_TIPO_MOVIMIENTO ;
   private long[] H008V2_A101DEVOC_TRAN_ID ;
   private boolean[] H008V2_n101DEVOC_TRAN_ID ;
   private long[] H008V2_A96DEVOC_REGIONAL ;
   private boolean[] H008V2_n96DEVOC_REGIONAL ;
   private long[] H008V2_A95DEVOC_ID ;
   private long[] H008V3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx01h0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008V2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          long AV7cDEVOC_REGIONAL ,
                                          long AV8cDEVOC_TRAN_ID ,
                                          String AV9cDEVOC_TIPO_MOVIMIENTO ,
                                          String AV10cDEVOC_CODIGO_MOVIMIENTO ,
                                          long AV11cDEVOC_TRAN_CC ,
                                          java.util.Date AV12cDEVOC_FECHA_MOVIMIENTO ,
                                          long A96DEVOC_REGIONAL ,
                                          long A101DEVOC_TRAN_ID ,
                                          String A722DEVOC_TIPO_MOVIMIENTO ,
                                          String A100DEVOC_CODIGO_MOVIMIENTO ,
                                          long A723DEVOC_TRAN_CC ,
                                          java.util.Date A103DEVOC_FECHA_MOVIMIENTO ,
                                          long AV6cDEVOC_ID )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ DEVOC_VIDA_UTIL, DEVOC_RENGLON, DEVOC_FECHA_MOVIMIENTO, DEVOC_TRAN_CC," ;
      sSelectString = sSelectString + " DEVOC_CODIGO_MOVIMIENTO, DEVOC_TIPO_MOVIMIENTO, DEVOC_TRAN_ID, DEVOC_REGIONAL, DEVOC_ID" ;
      sFromString = " FROM ALM_DEVO_HIST" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (DEVOC_ID >= ?)" ;
      if ( ! (0==AV7cDEVOC_REGIONAL) )
      {
         sWhereString = sWhereString + " and (DEVOC_REGIONAL >= ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cDEVOC_TRAN_ID) )
      {
         sWhereString = sWhereString + " and (DEVOC_TRAN_ID >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cDEVOC_TIPO_MOVIMIENTO)==0) )
      {
         sWhereString = sWhereString + " and (DEVOC_TIPO_MOVIMIENTO like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cDEVOC_CODIGO_MOVIMIENTO)==0) )
      {
         sWhereString = sWhereString + " and (DEVOC_CODIGO_MOVIMIENTO like ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cDEVOC_TRAN_CC) )
      {
         sWhereString = sWhereString + " and (DEVOC_TRAN_CC >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cDEVOC_FECHA_MOVIMIENTO) )
      {
         sWhereString = sWhereString + " and (DEVOC_FECHA_MOVIMIENTO >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY DEVOC_ID" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H008V3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          long AV7cDEVOC_REGIONAL ,
                                          long AV8cDEVOC_TRAN_ID ,
                                          String AV9cDEVOC_TIPO_MOVIMIENTO ,
                                          String AV10cDEVOC_CODIGO_MOVIMIENTO ,
                                          long AV11cDEVOC_TRAN_CC ,
                                          java.util.Date AV12cDEVOC_FECHA_MOVIMIENTO ,
                                          long A96DEVOC_REGIONAL ,
                                          long A101DEVOC_TRAN_ID ,
                                          String A722DEVOC_TIPO_MOVIMIENTO ,
                                          String A100DEVOC_CODIGO_MOVIMIENTO ,
                                          long A723DEVOC_TRAN_CC ,
                                          java.util.Date A103DEVOC_FECHA_MOVIMIENTO ,
                                          long AV6cDEVOC_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_DEVO_HIST" ;
      scmdbuf = scmdbuf + " WHERE (DEVOC_ID >= ?)" ;
      if ( ! (0==AV7cDEVOC_REGIONAL) )
      {
         sWhereString = sWhereString + " and (DEVOC_REGIONAL >= ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (0==AV8cDEVOC_TRAN_ID) )
      {
         sWhereString = sWhereString + " and (DEVOC_TRAN_ID >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cDEVOC_TIPO_MOVIMIENTO)==0) )
      {
         sWhereString = sWhereString + " and (DEVOC_TIPO_MOVIMIENTO like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cDEVOC_CODIGO_MOVIMIENTO)==0) )
      {
         sWhereString = sWhereString + " and (DEVOC_CODIGO_MOVIMIENTO like ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cDEVOC_TRAN_CC) )
      {
         sWhereString = sWhereString + " and (DEVOC_TRAN_CC >= ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV12cDEVOC_FECHA_MOVIMIENTO) )
      {
         sWhereString = sWhereString + " and (DEVOC_FECHA_MOVIMIENTO >= ?)" ;
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
                  return conditional_H008V2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
            case 1 :
                  return conditional_H008V3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008V2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H008V3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
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
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[15]).longValue(), 0);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
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
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[8]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[9]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[12]).longValue(), 0);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
      }
   }

}

