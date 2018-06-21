/*
               File: gx01v0_impl
        Description: Selection List RPT_EJECUCION
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:13.12
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

public final  class gx01v0_impl extends GXDataArea
{
   public gx01v0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx01v0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx01v0_impl.class ));
   }

   public gx01v0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCrpt_eje_estado = new HTMLChoice();
      cmbRpt_Eje_Estado = new HTMLChoice();
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
            AV6cRpt_Eje_Id = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cRpt_Eje_Fecha = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            AV8cRpt_Eje_Usuario = httpContext.GetNextPar( ) ;
            AV9cRpt_Eje_Email = httpContext.GetNextPar( ) ;
            AV10cRpt_Eje_ReporteId = httpContext.GetNextPar( ) ;
            AV11cRpt_Eje_RequestId = httpContext.GetNextPar( ) ;
            AV12cRpt_Eje_Estado = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cRpt_Eje_Id, AV7cRpt_Eje_Fecha, AV8cRpt_Eje_Usuario, AV9cRpt_Eje_Email, AV10cRpt_Eje_ReporteId, AV11cRpt_Eje_RequestId, AV12cRpt_Eje_Estado) ;
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
            AV13pRpt_Eje_Id = (int)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pRpt_Eje_Id", GXutil.ltrim( GXutil.str( AV13pRpt_Eje_Id, 8, 0)));
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
      paA02( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startA02( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414251319");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx01v0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pRpt_Eje_Id,8,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_EJE_ID", GXutil.ltrim( localUtil.ntoc( AV6cRpt_Eje_Id, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_EJE_FECHA", localUtil.ttoc( AV7cRpt_Eje_Fecha, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_EJE_USUARIO", AV8cRpt_Eje_Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_EJE_EMAIL", AV9cRpt_Eje_Email);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_EJE_REPORTEID", AV10cRpt_Eje_ReporteId);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_EJE_REQUESTID", AV11cRpt_Eje_RequestId);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_EJE_ESTADO", AV12cRpt_Eje_Estado);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPRPT_EJE_ID", GXutil.ltrim( localUtil.ntoc( AV13pRpt_Eje_Id, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_EJE_IDFILTERCONTAINER_Class", GXutil.rtrim( divRpt_eje_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_EJE_FECHAFILTERCONTAINER_Class", GXutil.rtrim( divRpt_eje_fechafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_EJE_USUARIOFILTERCONTAINER_Class", GXutil.rtrim( divRpt_eje_usuariofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_EJE_EMAILFILTERCONTAINER_Class", GXutil.rtrim( divRpt_eje_emailfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_EJE_REPORTEIDFILTERCONTAINER_Class", GXutil.rtrim( divRpt_eje_reporteidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_EJE_REQUESTIDFILTERCONTAINER_Class", GXutil.rtrim( divRpt_eje_requestidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_EJE_ESTADOFILTERCONTAINER_Class", GXutil.rtrim( divRpt_eje_estadofiltercontainer_Class));
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
         weA02( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtA02( ) ;
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
      return formatLink("com.orions2.gx01v0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pRpt_Eje_Id,8,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx01V0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List RPT_EJECUCION" ;
   }

   public void wbA00( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_eje_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_eje_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_eje_idfilter_Internalname, "Identificador", "", "", lblLblrpt_eje_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11a01_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_eje_id_Internalname, "Identificador", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_eje_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cRpt_Eje_Id, (byte)(8), (byte)(0), ",", "")), ((edtavCrpt_eje_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cRpt_Eje_Id), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cRpt_Eje_Id), "ZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_eje_id_Jsonclick, 0, "Attribute", "", "", "", edtavCrpt_eje_id_Visible, edtavCrpt_eje_id_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01V0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_eje_fechafiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_eje_fechafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_eje_fechafilter_Internalname, "Fecha", "", "", lblLblrpt_eje_fechafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12a01_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_eje_fecha_Internalname, "Fecha", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCrpt_eje_fecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_eje_fecha_Internalname, localUtil.ttoc( AV7cRpt_Eje_Fecha, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV7cRpt_Eje_Fecha, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_eje_fecha_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCrpt_eje_fecha_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01V0.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_eje_usuariofiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_eje_usuariofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_eje_usuariofilter_Internalname, "Usuario", "", "", lblLblrpt_eje_usuariofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13a01_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_eje_usuario_Internalname, "Usuario", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_eje_usuario_Internalname, AV8cRpt_Eje_Usuario, GXutil.rtrim( localUtil.format( AV8cRpt_Eje_Usuario, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_eje_usuario_Jsonclick, 0, "Attribute", "", "", "", edtavCrpt_eje_usuario_Visible, edtavCrpt_eje_usuario_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01V0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_eje_emailfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_eje_emailfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_eje_emailfilter_Internalname, "Email", "", "", lblLblrpt_eje_emailfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14a01_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_eje_email_Internalname, "Email", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_eje_email_Internalname, AV9cRpt_Eje_Email, GXutil.rtrim( localUtil.format( AV9cRpt_Eje_Email, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_eje_email_Jsonclick, 0, "Attribute", "", "", "", edtavCrpt_eje_email_Visible, edtavCrpt_eje_email_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "left", true, "HLP_Gx01V0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_eje_reporteidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_eje_reporteidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_eje_reporteidfilter_Internalname, "Reporte Id", "", "", lblLblrpt_eje_reporteidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15a01_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_eje_reporteid_Internalname, "Reporte Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_eje_reporteid_Internalname, AV10cRpt_Eje_ReporteId, GXutil.rtrim( localUtil.format( AV10cRpt_Eje_ReporteId, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_eje_reporteid_Jsonclick, 0, "Attribute", "", "", "", edtavCrpt_eje_reporteid_Visible, edtavCrpt_eje_reporteid_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01V0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_eje_requestidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_eje_requestidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_eje_requestidfilter_Internalname, "Request Id", "", "", lblLblrpt_eje_requestidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16a01_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_eje_requestid_Internalname, "Request Id", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_eje_requestid_Internalname, AV11cRpt_Eje_RequestId, GXutil.rtrim( localUtil.format( AV11cRpt_Eje_RequestId, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_eje_requestid_Jsonclick, 0, "Attribute", "", "", "", edtavCrpt_eje_requestid_Visible, edtavCrpt_eje_requestid_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01V0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_eje_estadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_eje_estadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_eje_estadofilter_Internalname, "Estado", "", "", lblLblrpt_eje_estadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e17a01_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01V0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCrpt_eje_estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCrpt_eje_estado, cmbavCrpt_eje_estado.getInternalname(), GXutil.rtrim( AV12cRpt_Eje_Estado), 1, cmbavCrpt_eje_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavCrpt_eje_estado.getVisible(), cmbavCrpt_eje_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "", true, "HLP_Gx01V0.htm");
         cmbavCrpt_eje_estado.setValue( GXutil.rtrim( AV12cRpt_Eje_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCrpt_eje_estado.getInternalname(), "Values", cmbavCrpt_eje_estado.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e18a01_client"+"'", TempTags, "", 2, "HLP_Gx01V0.htm");
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
            httpContext.writeValue( "Identificador") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A861Rpt_Eje_Id, (byte)(8), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A862Rpt_Eje_Fecha, 10, 8, 0, 3, "/", ":", " "));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtRpt_Eje_Fecha_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A863Rpt_Eje_Usuario);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A865Rpt_Eje_ReporteId);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A867Rpt_Eje_Estado);
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx01V0.htm");
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

   public void startA02( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List RPT_EJECUCION", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupA00( ) ;
   }

   public void wsA02( )
   {
      startA02( ) ;
      evtA02( ) ;
   }

   public void evtA02( )
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
                           A861Rpt_Eje_Id = (int)(localUtil.ctol( httpContext.cgiGet( edtRpt_Eje_Id_Internalname), ",", ".")) ;
                           A862Rpt_Eje_Fecha = localUtil.ctot( httpContext.cgiGet( edtRpt_Eje_Fecha_Internalname), 0) ;
                           n862Rpt_Eje_Fecha = false ;
                           A863Rpt_Eje_Usuario = GXutil.upper( httpContext.cgiGet( edtRpt_Eje_Usuario_Internalname)) ;
                           n863Rpt_Eje_Usuario = false ;
                           A865Rpt_Eje_ReporteId = httpContext.cgiGet( edtRpt_Eje_ReporteId_Internalname) ;
                           n865Rpt_Eje_ReporteId = false ;
                           cmbRpt_Eje_Estado.setName( cmbRpt_Eje_Estado.getInternalname() );
                           cmbRpt_Eje_Estado.setValue( httpContext.cgiGet( cmbRpt_Eje_Estado.getInternalname()) );
                           A867Rpt_Eje_Estado = httpContext.cgiGet( cmbRpt_Eje_Estado.getInternalname()) ;
                           n867Rpt_Eje_Estado = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19A02 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e20A02 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Crpt_eje_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRPT_EJE_ID"), ",", ".") != AV6cRpt_Eje_Id )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_eje_fecha Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCRPT_EJE_FECHA"), 0), AV7cRpt_Eje_Fecha) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_eje_usuario Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_EJE_USUARIO"), AV8cRpt_Eje_Usuario) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_eje_email Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_EJE_EMAIL"), AV9cRpt_Eje_Email) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_eje_reporteid Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_EJE_REPORTEID"), AV10cRpt_Eje_ReporteId) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_eje_requestid Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_EJE_REQUESTID"), AV11cRpt_Eje_RequestId) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_eje_estado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_EJE_ESTADO"), AV12cRpt_Eje_Estado) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e21A02 ();
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

   public void weA02( )
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

   public void paA02( )
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
         cmbavCrpt_eje_estado.setName( "vCRPT_EJE_ESTADO" );
         cmbavCrpt_eje_estado.setWebtags( "" );
         if ( cmbavCrpt_eje_estado.getItemCount() > 0 )
         {
            AV12cRpt_Eje_Estado = cmbavCrpt_eje_estado.getValidValue(AV12cRpt_Eje_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cRpt_Eje_Estado", AV12cRpt_Eje_Estado);
         }
         GXCCtl = "RPT_EJE_ESTADO_" + sGXsfl_84_idx ;
         cmbRpt_Eje_Estado.setName( GXCCtl );
         cmbRpt_Eje_Estado.setWebtags( "" );
         if ( cmbRpt_Eje_Estado.getItemCount() > 0 )
         {
            A867Rpt_Eje_Estado = cmbRpt_Eje_Estado.getValidValue(A867Rpt_Eje_Estado) ;
            n867Rpt_Eje_Estado = false ;
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
                                  int AV6cRpt_Eje_Id ,
                                  java.util.Date AV7cRpt_Eje_Fecha ,
                                  String AV8cRpt_Eje_Usuario ,
                                  String AV9cRpt_Eje_Email ,
                                  String AV10cRpt_Eje_ReporteId ,
                                  String AV11cRpt_Eje_RequestId ,
                                  String AV12cRpt_Eje_Estado )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rfA02( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_EJE_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A861Rpt_Eje_Id), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_EJE_ID", GXutil.ltrim( localUtil.ntoc( A861Rpt_Eje_Id, (byte)(8), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_EJE_FECHA", getSecureSignedToken( "", localUtil.format( A862Rpt_Eje_Fecha, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_EJE_FECHA", localUtil.ttoc( A862Rpt_Eje_Fecha, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_EJE_USUARIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A863Rpt_Eje_Usuario, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_EJE_USUARIO", A863Rpt_Eje_Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_EJE_REPORTEID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A865Rpt_Eje_ReporteId, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_EJE_REPORTEID", A865Rpt_Eje_ReporteId);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_EJE_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A867Rpt_Eje_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_EJE_ESTADO", A867Rpt_Eje_Estado);
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCrpt_eje_estado.getItemCount() > 0 )
      {
         AV12cRpt_Eje_Estado = cmbavCrpt_eje_estado.getValidValue(AV12cRpt_Eje_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cRpt_Eje_Estado", AV12cRpt_Eje_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfA02( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rfA02( )
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
                                              AV7cRpt_Eje_Fecha ,
                                              AV8cRpt_Eje_Usuario ,
                                              AV9cRpt_Eje_Email ,
                                              AV10cRpt_Eje_ReporteId ,
                                              AV11cRpt_Eje_RequestId ,
                                              AV12cRpt_Eje_Estado ,
                                              A862Rpt_Eje_Fecha ,
                                              A863Rpt_Eje_Usuario ,
                                              A864Rpt_Eje_Email ,
                                              A865Rpt_Eje_ReporteId ,
                                              A866Rpt_Eje_RequestId ,
                                              A867Rpt_Eje_Estado ,
                                              new Integer(AV6cRpt_Eje_Id) } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                              }
         } ) ;
         lV8cRpt_Eje_Usuario = GXutil.concat( GXutil.rtrim( AV8cRpt_Eje_Usuario), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cRpt_Eje_Usuario", AV8cRpt_Eje_Usuario);
         lV9cRpt_Eje_Email = GXutil.concat( GXutil.rtrim( AV9cRpt_Eje_Email), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cRpt_Eje_Email", AV9cRpt_Eje_Email);
         lV10cRpt_Eje_ReporteId = GXutil.concat( GXutil.rtrim( AV10cRpt_Eje_ReporteId), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cRpt_Eje_ReporteId", AV10cRpt_Eje_ReporteId);
         lV11cRpt_Eje_RequestId = GXutil.concat( GXutil.rtrim( AV11cRpt_Eje_RequestId), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cRpt_Eje_RequestId", AV11cRpt_Eje_RequestId);
         lV12cRpt_Eje_Estado = GXutil.concat( GXutil.rtrim( AV12cRpt_Eje_Estado), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cRpt_Eje_Estado", AV12cRpt_Eje_Estado);
         /* Using cursor H00A02 */
         pr_default.execute(0, new Object[] {new Integer(AV6cRpt_Eje_Id), AV7cRpt_Eje_Fecha, lV8cRpt_Eje_Usuario, lV9cRpt_Eje_Email, lV10cRpt_Eje_ReporteId, lV11cRpt_Eje_RequestId, lV12cRpt_Eje_Estado, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A866Rpt_Eje_RequestId = H00A02_A866Rpt_Eje_RequestId[0] ;
            n866Rpt_Eje_RequestId = H00A02_n866Rpt_Eje_RequestId[0] ;
            A864Rpt_Eje_Email = H00A02_A864Rpt_Eje_Email[0] ;
            n864Rpt_Eje_Email = H00A02_n864Rpt_Eje_Email[0] ;
            A867Rpt_Eje_Estado = H00A02_A867Rpt_Eje_Estado[0] ;
            n867Rpt_Eje_Estado = H00A02_n867Rpt_Eje_Estado[0] ;
            A865Rpt_Eje_ReporteId = H00A02_A865Rpt_Eje_ReporteId[0] ;
            n865Rpt_Eje_ReporteId = H00A02_n865Rpt_Eje_ReporteId[0] ;
            A863Rpt_Eje_Usuario = H00A02_A863Rpt_Eje_Usuario[0] ;
            n863Rpt_Eje_Usuario = H00A02_n863Rpt_Eje_Usuario[0] ;
            A862Rpt_Eje_Fecha = H00A02_A862Rpt_Eje_Fecha[0] ;
            n862Rpt_Eje_Fecha = H00A02_n862Rpt_Eje_Fecha[0] ;
            A861Rpt_Eje_Id = H00A02_A861Rpt_Eje_Id[0] ;
            /* Execute user event: Load */
            e20A02 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wbA00( ) ;
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
                                           AV7cRpt_Eje_Fecha ,
                                           AV8cRpt_Eje_Usuario ,
                                           AV9cRpt_Eje_Email ,
                                           AV10cRpt_Eje_ReporteId ,
                                           AV11cRpt_Eje_RequestId ,
                                           AV12cRpt_Eje_Estado ,
                                           A862Rpt_Eje_Fecha ,
                                           A863Rpt_Eje_Usuario ,
                                           A864Rpt_Eje_Email ,
                                           A865Rpt_Eje_ReporteId ,
                                           A866Rpt_Eje_RequestId ,
                                           A867Rpt_Eje_Estado ,
                                           new Integer(AV6cRpt_Eje_Id) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                           }
      } ) ;
      lV8cRpt_Eje_Usuario = GXutil.concat( GXutil.rtrim( AV8cRpt_Eje_Usuario), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cRpt_Eje_Usuario", AV8cRpt_Eje_Usuario);
      lV9cRpt_Eje_Email = GXutil.concat( GXutil.rtrim( AV9cRpt_Eje_Email), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cRpt_Eje_Email", AV9cRpt_Eje_Email);
      lV10cRpt_Eje_ReporteId = GXutil.concat( GXutil.rtrim( AV10cRpt_Eje_ReporteId), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10cRpt_Eje_ReporteId", AV10cRpt_Eje_ReporteId);
      lV11cRpt_Eje_RequestId = GXutil.concat( GXutil.rtrim( AV11cRpt_Eje_RequestId), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cRpt_Eje_RequestId", AV11cRpt_Eje_RequestId);
      lV12cRpt_Eje_Estado = GXutil.concat( GXutil.rtrim( AV12cRpt_Eje_Estado), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cRpt_Eje_Estado", AV12cRpt_Eje_Estado);
      /* Using cursor H00A03 */
      pr_default.execute(1, new Object[] {new Integer(AV6cRpt_Eje_Id), AV7cRpt_Eje_Fecha, lV8cRpt_Eje_Usuario, lV9cRpt_Eje_Email, lV10cRpt_Eje_ReporteId, lV11cRpt_Eje_RequestId, lV12cRpt_Eje_Estado});
      GRID1_nRecordCount = H00A03_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRpt_Eje_Id, AV7cRpt_Eje_Fecha, AV8cRpt_Eje_Usuario, AV9cRpt_Eje_Email, AV10cRpt_Eje_ReporteId, AV11cRpt_Eje_RequestId, AV12cRpt_Eje_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRpt_Eje_Id, AV7cRpt_Eje_Fecha, AV8cRpt_Eje_Usuario, AV9cRpt_Eje_Email, AV10cRpt_Eje_ReporteId, AV11cRpt_Eje_RequestId, AV12cRpt_Eje_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRpt_Eje_Id, AV7cRpt_Eje_Fecha, AV8cRpt_Eje_Usuario, AV9cRpt_Eje_Email, AV10cRpt_Eje_ReporteId, AV11cRpt_Eje_RequestId, AV12cRpt_Eje_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRpt_Eje_Id, AV7cRpt_Eje_Fecha, AV8cRpt_Eje_Usuario, AV9cRpt_Eje_Email, AV10cRpt_Eje_ReporteId, AV11cRpt_Eje_RequestId, AV12cRpt_Eje_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRpt_Eje_Id, AV7cRpt_Eje_Fecha, AV8cRpt_Eje_Usuario, AV9cRpt_Eje_Email, AV10cRpt_Eje_ReporteId, AV11cRpt_Eje_RequestId, AV12cRpt_Eje_Estado) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strupA00( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19A02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCrpt_eje_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCrpt_eje_id_Internalname), ",", ".") > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCRPT_EJE_ID");
            GX_FocusControl = edtavCrpt_eje_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cRpt_Eje_Id = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cRpt_Eje_Id", GXutil.ltrim( GXutil.str( AV6cRpt_Eje_Id, 8, 0)));
         }
         else
         {
            AV6cRpt_Eje_Id = (int)(localUtil.ctol( httpContext.cgiGet( edtavCrpt_eje_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cRpt_Eje_Id", GXutil.ltrim( GXutil.str( AV6cRpt_Eje_Id, 8, 0)));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCrpt_eje_fecha_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vCRPT_EJE_FECHA");
            GX_FocusControl = edtavCrpt_eje_fecha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cRpt_Eje_Fecha = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV7cRpt_Eje_Fecha", localUtil.ttoc( AV7cRpt_Eje_Fecha, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV7cRpt_Eje_Fecha = localUtil.ctot( httpContext.cgiGet( edtavCrpt_eje_fecha_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cRpt_Eje_Fecha", localUtil.ttoc( AV7cRpt_Eje_Fecha, 8, 5, 0, 3, "/", ":", " "));
         }
         AV8cRpt_Eje_Usuario = GXutil.upper( httpContext.cgiGet( edtavCrpt_eje_usuario_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cRpt_Eje_Usuario", AV8cRpt_Eje_Usuario);
         AV9cRpt_Eje_Email = httpContext.cgiGet( edtavCrpt_eje_email_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cRpt_Eje_Email", AV9cRpt_Eje_Email);
         AV10cRpt_Eje_ReporteId = httpContext.cgiGet( edtavCrpt_eje_reporteid_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cRpt_Eje_ReporteId", AV10cRpt_Eje_ReporteId);
         AV11cRpt_Eje_RequestId = httpContext.cgiGet( edtavCrpt_eje_requestid_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cRpt_Eje_RequestId", AV11cRpt_Eje_RequestId);
         cmbavCrpt_eje_estado.setName( cmbavCrpt_eje_estado.getInternalname() );
         cmbavCrpt_eje_estado.setValue( httpContext.cgiGet( cmbavCrpt_eje_estado.getInternalname()) );
         AV12cRpt_Eje_Estado = httpContext.cgiGet( cmbavCrpt_eje_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cRpt_Eje_Estado", AV12cRpt_Eje_Estado);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRPT_EJE_ID"), ",", ".") != AV6cRpt_Eje_Id )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCRPT_EJE_FECHA"), 0), AV7cRpt_Eje_Fecha) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_EJE_USUARIO"), AV8cRpt_Eje_Usuario) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_EJE_EMAIL"), AV9cRpt_Eje_Email) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_EJE_REPORTEID"), AV10cRpt_Eje_ReporteId) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_EJE_REQUESTID"), AV11cRpt_Eje_RequestId) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_EJE_ESTADO"), AV12cRpt_Eje_Estado) != 0 )
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
      e19A02 ();
      if (returnInSub) return;
   }

   public void e19A02( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "RPT_EJECUCION", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV14ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e20A02( )
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
      e21A02 ();
      if (returnInSub) return;
   }

   public void e21A02( )
   {
      /* Enter Routine */
      AV13pRpt_Eje_Id = A861Rpt_Eje_Id ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pRpt_Eje_Id", GXutil.ltrim( GXutil.str( AV13pRpt_Eje_Id, 8, 0)));
      httpContext.setWebReturnParms(new Object[] {new Integer(AV13pRpt_Eje_Id)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pRpt_Eje_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pRpt_Eje_Id", GXutil.ltrim( GXutil.str( AV13pRpt_Eje_Id, 8, 0)));
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
      paA02( ) ;
      wsA02( ) ;
      weA02( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414251450");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx01v0.js", "?201861414251450");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtRpt_Eje_Id_Internalname = "RPT_EJE_ID_"+sGXsfl_84_idx ;
      edtRpt_Eje_Fecha_Internalname = "RPT_EJE_FECHA_"+sGXsfl_84_idx ;
      edtRpt_Eje_Usuario_Internalname = "RPT_EJE_USUARIO_"+sGXsfl_84_idx ;
      edtRpt_Eje_ReporteId_Internalname = "RPT_EJE_REPORTEID_"+sGXsfl_84_idx ;
      cmbRpt_Eje_Estado.setInternalname( "RPT_EJE_ESTADO_"+sGXsfl_84_idx );
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtRpt_Eje_Id_Internalname = "RPT_EJE_ID_"+sGXsfl_84_fel_idx ;
      edtRpt_Eje_Fecha_Internalname = "RPT_EJE_FECHA_"+sGXsfl_84_fel_idx ;
      edtRpt_Eje_Usuario_Internalname = "RPT_EJE_USUARIO_"+sGXsfl_84_fel_idx ;
      edtRpt_Eje_ReporteId_Internalname = "RPT_EJE_REPORTEID_"+sGXsfl_84_fel_idx ;
      cmbRpt_Eje_Estado.setInternalname( "RPT_EJE_ESTADO_"+sGXsfl_84_fel_idx );
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wbA00( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A861Rpt_Eje_Id, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
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
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpt_Eje_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A861Rpt_Eje_Id, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A861Rpt_Eje_Id), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRpt_Eje_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtRpt_Eje_Fecha_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A861Rpt_Eje_Id, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtRpt_Eje_Fecha_Internalname, "Link", edtRpt_Eje_Fecha_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpt_Eje_Fecha_Internalname,localUtil.ttoc( A862Rpt_Eje_Fecha, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A862Rpt_Eje_Fecha, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'",edtRpt_Eje_Fecha_Link,"","","",edtRpt_Eje_Fecha_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpt_Eje_Usuario_Internalname,A863Rpt_Eje_Usuario,GXutil.rtrim( localUtil.format( A863Rpt_Eje_Usuario, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRpt_Eje_Usuario_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRpt_Eje_ReporteId_Internalname,A865Rpt_Eje_ReporteId,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRpt_Eje_ReporteId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RPT_EJE_ESTADO_" + sGXsfl_84_idx ;
            cmbRpt_Eje_Estado.setName( GXCCtl );
            cmbRpt_Eje_Estado.setWebtags( "" );
            if ( cmbRpt_Eje_Estado.getItemCount() > 0 )
            {
               A867Rpt_Eje_Estado = cmbRpt_Eje_Estado.getValidValue(A867Rpt_Eje_Estado) ;
               n867Rpt_Eje_Estado = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbRpt_Eje_Estado,cmbRpt_Eje_Estado.getInternalname(),GXutil.rtrim( A867Rpt_Eje_Estado),new Integer(1),cmbRpt_Eje_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbRpt_Eje_Estado.setValue( GXutil.rtrim( A867Rpt_Eje_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbRpt_Eje_Estado.getInternalname(), "Values", cmbRpt_Eje_Estado.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_EJE_ID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A861Rpt_Eje_Id), "ZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_EJE_FECHA"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( A862Rpt_Eje_Fecha, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_EJE_USUARIO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A863Rpt_Eje_Usuario, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_EJE_REPORTEID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A865Rpt_Eje_ReporteId, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_EJE_ESTADO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A867Rpt_Eje_Estado, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblrpt_eje_idfilter_Internalname = "LBLRPT_EJE_IDFILTER" ;
      edtavCrpt_eje_id_Internalname = "vCRPT_EJE_ID" ;
      divRpt_eje_idfiltercontainer_Internalname = "RPT_EJE_IDFILTERCONTAINER" ;
      lblLblrpt_eje_fechafilter_Internalname = "LBLRPT_EJE_FECHAFILTER" ;
      edtavCrpt_eje_fecha_Internalname = "vCRPT_EJE_FECHA" ;
      divRpt_eje_fechafiltercontainer_Internalname = "RPT_EJE_FECHAFILTERCONTAINER" ;
      lblLblrpt_eje_usuariofilter_Internalname = "LBLRPT_EJE_USUARIOFILTER" ;
      edtavCrpt_eje_usuario_Internalname = "vCRPT_EJE_USUARIO" ;
      divRpt_eje_usuariofiltercontainer_Internalname = "RPT_EJE_USUARIOFILTERCONTAINER" ;
      lblLblrpt_eje_emailfilter_Internalname = "LBLRPT_EJE_EMAILFILTER" ;
      edtavCrpt_eje_email_Internalname = "vCRPT_EJE_EMAIL" ;
      divRpt_eje_emailfiltercontainer_Internalname = "RPT_EJE_EMAILFILTERCONTAINER" ;
      lblLblrpt_eje_reporteidfilter_Internalname = "LBLRPT_EJE_REPORTEIDFILTER" ;
      edtavCrpt_eje_reporteid_Internalname = "vCRPT_EJE_REPORTEID" ;
      divRpt_eje_reporteidfiltercontainer_Internalname = "RPT_EJE_REPORTEIDFILTERCONTAINER" ;
      lblLblrpt_eje_requestidfilter_Internalname = "LBLRPT_EJE_REQUESTIDFILTER" ;
      edtavCrpt_eje_requestid_Internalname = "vCRPT_EJE_REQUESTID" ;
      divRpt_eje_requestidfiltercontainer_Internalname = "RPT_EJE_REQUESTIDFILTERCONTAINER" ;
      lblLblrpt_eje_estadofilter_Internalname = "LBLRPT_EJE_ESTADOFILTER" ;
      cmbavCrpt_eje_estado.setInternalname( "vCRPT_EJE_ESTADO" );
      divRpt_eje_estadofiltercontainer_Internalname = "RPT_EJE_ESTADOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtRpt_Eje_Id_Internalname = "RPT_EJE_ID" ;
      edtRpt_Eje_Fecha_Internalname = "RPT_EJE_FECHA" ;
      edtRpt_Eje_Usuario_Internalname = "RPT_EJE_USUARIO" ;
      edtRpt_Eje_ReporteId_Internalname = "RPT_EJE_REPORTEID" ;
      cmbRpt_Eje_Estado.setInternalname( "RPT_EJE_ESTADO" );
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
      cmbRpt_Eje_Estado.setJsonclick( "" );
      edtRpt_Eje_ReporteId_Jsonclick = "" ;
      edtRpt_Eje_Usuario_Jsonclick = "" ;
      edtRpt_Eje_Fecha_Jsonclick = "" ;
      edtRpt_Eje_Id_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtRpt_Eje_Fecha_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavCrpt_eje_estado.setJsonclick( "" );
      cmbavCrpt_eje_estado.setEnabled( 1 );
      cmbavCrpt_eje_estado.setVisible( 1 );
      edtavCrpt_eje_requestid_Jsonclick = "" ;
      edtavCrpt_eje_requestid_Enabled = 1 ;
      edtavCrpt_eje_requestid_Visible = 1 ;
      edtavCrpt_eje_reporteid_Jsonclick = "" ;
      edtavCrpt_eje_reporteid_Enabled = 1 ;
      edtavCrpt_eje_reporteid_Visible = 1 ;
      edtavCrpt_eje_email_Jsonclick = "" ;
      edtavCrpt_eje_email_Enabled = 1 ;
      edtavCrpt_eje_email_Visible = 1 ;
      edtavCrpt_eje_usuario_Jsonclick = "" ;
      edtavCrpt_eje_usuario_Enabled = 1 ;
      edtavCrpt_eje_usuario_Visible = 1 ;
      edtavCrpt_eje_fecha_Jsonclick = "" ;
      edtavCrpt_eje_fecha_Enabled = 1 ;
      edtavCrpt_eje_id_Jsonclick = "" ;
      edtavCrpt_eje_id_Enabled = 1 ;
      edtavCrpt_eje_id_Visible = 1 ;
      divRpt_eje_estadofiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_eje_requestidfiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_eje_reporteidfiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_eje_emailfiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_eje_usuariofiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_eje_fechafiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_eje_idfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List RPT_EJECUCION" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRpt_Eje_Id',fld:'vCRPT_EJE_ID',pic:'ZZZZZZZ9',nv:0},{av:'AV7cRpt_Eje_Fecha',fld:'vCRPT_EJE_FECHA',pic:'99/99/99 99:99',nv:''},{av:'AV8cRpt_Eje_Usuario',fld:'vCRPT_EJE_USUARIO',pic:'@!',nv:''},{av:'AV9cRpt_Eje_Email',fld:'vCRPT_EJE_EMAIL',pic:'',nv:''},{av:'AV10cRpt_Eje_ReporteId',fld:'vCRPT_EJE_REPORTEID',pic:'',nv:''},{av:'AV11cRpt_Eje_RequestId',fld:'vCRPT_EJE_REQUESTID',pic:'',nv:''},{av:'cmbavCrpt_eje_estado'},{av:'AV12cRpt_Eje_Estado',fld:'vCRPT_EJE_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e18A01',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLRPT_EJE_IDFILTER.CLICK","{handler:'e11A01',iparms:[{av:'divRpt_eje_idfiltercontainer_Class',ctrl:'RPT_EJE_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_eje_idfiltercontainer_Class',ctrl:'RPT_EJE_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCrpt_eje_id_Visible',ctrl:'vCRPT_EJE_ID',prop:'Visible'}]}");
      setEventMetadata("LBLRPT_EJE_FECHAFILTER.CLICK","{handler:'e12A01',iparms:[{av:'divRpt_eje_fechafiltercontainer_Class',ctrl:'RPT_EJE_FECHAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_eje_fechafiltercontainer_Class',ctrl:'RPT_EJE_FECHAFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLRPT_EJE_USUARIOFILTER.CLICK","{handler:'e13A01',iparms:[{av:'divRpt_eje_usuariofiltercontainer_Class',ctrl:'RPT_EJE_USUARIOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_eje_usuariofiltercontainer_Class',ctrl:'RPT_EJE_USUARIOFILTERCONTAINER',prop:'Class'},{av:'edtavCrpt_eje_usuario_Visible',ctrl:'vCRPT_EJE_USUARIO',prop:'Visible'}]}");
      setEventMetadata("LBLRPT_EJE_EMAILFILTER.CLICK","{handler:'e14A01',iparms:[{av:'divRpt_eje_emailfiltercontainer_Class',ctrl:'RPT_EJE_EMAILFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_eje_emailfiltercontainer_Class',ctrl:'RPT_EJE_EMAILFILTERCONTAINER',prop:'Class'},{av:'edtavCrpt_eje_email_Visible',ctrl:'vCRPT_EJE_EMAIL',prop:'Visible'}]}");
      setEventMetadata("LBLRPT_EJE_REPORTEIDFILTER.CLICK","{handler:'e15A01',iparms:[{av:'divRpt_eje_reporteidfiltercontainer_Class',ctrl:'RPT_EJE_REPORTEIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_eje_reporteidfiltercontainer_Class',ctrl:'RPT_EJE_REPORTEIDFILTERCONTAINER',prop:'Class'},{av:'edtavCrpt_eje_reporteid_Visible',ctrl:'vCRPT_EJE_REPORTEID',prop:'Visible'}]}");
      setEventMetadata("LBLRPT_EJE_REQUESTIDFILTER.CLICK","{handler:'e16A01',iparms:[{av:'divRpt_eje_requestidfiltercontainer_Class',ctrl:'RPT_EJE_REQUESTIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_eje_requestidfiltercontainer_Class',ctrl:'RPT_EJE_REQUESTIDFILTERCONTAINER',prop:'Class'},{av:'edtavCrpt_eje_requestid_Visible',ctrl:'vCRPT_EJE_REQUESTID',prop:'Visible'}]}");
      setEventMetadata("LBLRPT_EJE_ESTADOFILTER.CLICK","{handler:'e17A01',iparms:[{av:'divRpt_eje_estadofiltercontainer_Class',ctrl:'RPT_EJE_ESTADOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_eje_estadofiltercontainer_Class',ctrl:'RPT_EJE_ESTADOFILTERCONTAINER',prop:'Class'},{av:'cmbavCrpt_eje_estado'}]}");
      setEventMetadata("ENTER","{handler:'e21A02',iparms:[{av:'A861Rpt_Eje_Id',fld:'RPT_EJE_ID',pic:'ZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pRpt_Eje_Id',fld:'vPRPT_EJE_ID',pic:'ZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRpt_Eje_Id',fld:'vCRPT_EJE_ID',pic:'ZZZZZZZ9',nv:0},{av:'AV7cRpt_Eje_Fecha',fld:'vCRPT_EJE_FECHA',pic:'99/99/99 99:99',nv:''},{av:'AV8cRpt_Eje_Usuario',fld:'vCRPT_EJE_USUARIO',pic:'@!',nv:''},{av:'AV9cRpt_Eje_Email',fld:'vCRPT_EJE_EMAIL',pic:'',nv:''},{av:'AV10cRpt_Eje_ReporteId',fld:'vCRPT_EJE_REPORTEID',pic:'',nv:''},{av:'AV11cRpt_Eje_RequestId',fld:'vCRPT_EJE_REQUESTID',pic:'',nv:''},{av:'cmbavCrpt_eje_estado'},{av:'AV12cRpt_Eje_Estado',fld:'vCRPT_EJE_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRpt_Eje_Id',fld:'vCRPT_EJE_ID',pic:'ZZZZZZZ9',nv:0},{av:'AV7cRpt_Eje_Fecha',fld:'vCRPT_EJE_FECHA',pic:'99/99/99 99:99',nv:''},{av:'AV8cRpt_Eje_Usuario',fld:'vCRPT_EJE_USUARIO',pic:'@!',nv:''},{av:'AV9cRpt_Eje_Email',fld:'vCRPT_EJE_EMAIL',pic:'',nv:''},{av:'AV10cRpt_Eje_ReporteId',fld:'vCRPT_EJE_REPORTEID',pic:'',nv:''},{av:'AV11cRpt_Eje_RequestId',fld:'vCRPT_EJE_REQUESTID',pic:'',nv:''},{av:'cmbavCrpt_eje_estado'},{av:'AV12cRpt_Eje_Estado',fld:'vCRPT_EJE_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRpt_Eje_Id',fld:'vCRPT_EJE_ID',pic:'ZZZZZZZ9',nv:0},{av:'AV7cRpt_Eje_Fecha',fld:'vCRPT_EJE_FECHA',pic:'99/99/99 99:99',nv:''},{av:'AV8cRpt_Eje_Usuario',fld:'vCRPT_EJE_USUARIO',pic:'@!',nv:''},{av:'AV9cRpt_Eje_Email',fld:'vCRPT_EJE_EMAIL',pic:'',nv:''},{av:'AV10cRpt_Eje_ReporteId',fld:'vCRPT_EJE_REPORTEID',pic:'',nv:''},{av:'AV11cRpt_Eje_RequestId',fld:'vCRPT_EJE_REQUESTID',pic:'',nv:''},{av:'cmbavCrpt_eje_estado'},{av:'AV12cRpt_Eje_Estado',fld:'vCRPT_EJE_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRpt_Eje_Id',fld:'vCRPT_EJE_ID',pic:'ZZZZZZZ9',nv:0},{av:'AV7cRpt_Eje_Fecha',fld:'vCRPT_EJE_FECHA',pic:'99/99/99 99:99',nv:''},{av:'AV8cRpt_Eje_Usuario',fld:'vCRPT_EJE_USUARIO',pic:'@!',nv:''},{av:'AV9cRpt_Eje_Email',fld:'vCRPT_EJE_EMAIL',pic:'',nv:''},{av:'AV10cRpt_Eje_ReporteId',fld:'vCRPT_EJE_REPORTEID',pic:'',nv:''},{av:'AV11cRpt_Eje_RequestId',fld:'vCRPT_EJE_REQUESTID',pic:'',nv:''},{av:'cmbavCrpt_eje_estado'},{av:'AV12cRpt_Eje_Estado',fld:'vCRPT_EJE_ESTADO',pic:'',nv:''}],oparms:[]}");
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
      AV7cRpt_Eje_Fecha = GXutil.resetTime( GXutil.nullDate() );
      AV8cRpt_Eje_Usuario = "" ;
      AV9cRpt_Eje_Email = "" ;
      AV10cRpt_Eje_ReporteId = "" ;
      AV11cRpt_Eje_RequestId = "" ;
      AV12cRpt_Eje_Estado = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblrpt_eje_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblrpt_eje_fechafilter_Jsonclick = "" ;
      lblLblrpt_eje_usuariofilter_Jsonclick = "" ;
      lblLblrpt_eje_emailfilter_Jsonclick = "" ;
      lblLblrpt_eje_reporteidfilter_Jsonclick = "" ;
      lblLblrpt_eje_requestidfilter_Jsonclick = "" ;
      lblLblrpt_eje_estadofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A862Rpt_Eje_Fecha = GXutil.resetTime( GXutil.nullDate() );
      A863Rpt_Eje_Usuario = "" ;
      A865Rpt_Eje_ReporteId = "" ;
      A867Rpt_Eje_Estado = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV8cRpt_Eje_Usuario = "" ;
      lV9cRpt_Eje_Email = "" ;
      lV10cRpt_Eje_ReporteId = "" ;
      lV11cRpt_Eje_RequestId = "" ;
      lV12cRpt_Eje_Estado = "" ;
      A864Rpt_Eje_Email = "" ;
      A866Rpt_Eje_RequestId = "" ;
      H00A02_A866Rpt_Eje_RequestId = new String[] {""} ;
      H00A02_n866Rpt_Eje_RequestId = new boolean[] {false} ;
      H00A02_A864Rpt_Eje_Email = new String[] {""} ;
      H00A02_n864Rpt_Eje_Email = new boolean[] {false} ;
      H00A02_A867Rpt_Eje_Estado = new String[] {""} ;
      H00A02_n867Rpt_Eje_Estado = new boolean[] {false} ;
      H00A02_A865Rpt_Eje_ReporteId = new String[] {""} ;
      H00A02_n865Rpt_Eje_ReporteId = new boolean[] {false} ;
      H00A02_A863Rpt_Eje_Usuario = new String[] {""} ;
      H00A02_n863Rpt_Eje_Usuario = new boolean[] {false} ;
      H00A02_A862Rpt_Eje_Fecha = new java.util.Date[] {GXutil.nullDate()} ;
      H00A02_n862Rpt_Eje_Fecha = new boolean[] {false} ;
      H00A02_A861Rpt_Eje_Id = new int[1] ;
      H00A03_AGRID1_nRecordCount = new long[1] ;
      AV14ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx01v0__default(),
         new Object[] {
             new Object[] {
            H00A02_A866Rpt_Eje_RequestId, H00A02_n866Rpt_Eje_RequestId, H00A02_A864Rpt_Eje_Email, H00A02_n864Rpt_Eje_Email, H00A02_A867Rpt_Eje_Estado, H00A02_n867Rpt_Eje_Estado, H00A02_A865Rpt_Eje_ReporteId, H00A02_n865Rpt_Eje_ReporteId, H00A02_A863Rpt_Eje_Usuario, H00A02_n863Rpt_Eje_Usuario,
            H00A02_A862Rpt_Eje_Fecha, H00A02_n862Rpt_Eje_Fecha, H00A02_A861Rpt_Eje_Id
            }
            , new Object[] {
            H00A03_AGRID1_nRecordCount
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
   private int AV6cRpt_Eje_Id ;
   private int AV13pRpt_Eje_Id ;
   private int edtavCrpt_eje_id_Enabled ;
   private int edtavCrpt_eje_id_Visible ;
   private int edtavCrpt_eje_fecha_Enabled ;
   private int edtavCrpt_eje_usuario_Visible ;
   private int edtavCrpt_eje_usuario_Enabled ;
   private int edtavCrpt_eje_email_Visible ;
   private int edtavCrpt_eje_email_Enabled ;
   private int edtavCrpt_eje_reporteid_Visible ;
   private int edtavCrpt_eje_reporteid_Enabled ;
   private int edtavCrpt_eje_requestid_Visible ;
   private int edtavCrpt_eje_requestid_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A861Rpt_Eje_Id ;
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
   private String divRpt_eje_idfiltercontainer_Class ;
   private String divRpt_eje_fechafiltercontainer_Class ;
   private String divRpt_eje_usuariofiltercontainer_Class ;
   private String divRpt_eje_emailfiltercontainer_Class ;
   private String divRpt_eje_reporteidfiltercontainer_Class ;
   private String divRpt_eje_requestidfiltercontainer_Class ;
   private String divRpt_eje_estadofiltercontainer_Class ;
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
   private String divRpt_eje_idfiltercontainer_Internalname ;
   private String lblLblrpt_eje_idfilter_Internalname ;
   private String lblLblrpt_eje_idfilter_Jsonclick ;
   private String edtavCrpt_eje_id_Internalname ;
   private String TempTags ;
   private String edtavCrpt_eje_id_Jsonclick ;
   private String divRpt_eje_fechafiltercontainer_Internalname ;
   private String lblLblrpt_eje_fechafilter_Internalname ;
   private String lblLblrpt_eje_fechafilter_Jsonclick ;
   private String edtavCrpt_eje_fecha_Internalname ;
   private String edtavCrpt_eje_fecha_Jsonclick ;
   private String divRpt_eje_usuariofiltercontainer_Internalname ;
   private String lblLblrpt_eje_usuariofilter_Internalname ;
   private String lblLblrpt_eje_usuariofilter_Jsonclick ;
   private String edtavCrpt_eje_usuario_Internalname ;
   private String edtavCrpt_eje_usuario_Jsonclick ;
   private String divRpt_eje_emailfiltercontainer_Internalname ;
   private String lblLblrpt_eje_emailfilter_Internalname ;
   private String lblLblrpt_eje_emailfilter_Jsonclick ;
   private String edtavCrpt_eje_email_Internalname ;
   private String edtavCrpt_eje_email_Jsonclick ;
   private String divRpt_eje_reporteidfiltercontainer_Internalname ;
   private String lblLblrpt_eje_reporteidfilter_Internalname ;
   private String lblLblrpt_eje_reporteidfilter_Jsonclick ;
   private String edtavCrpt_eje_reporteid_Internalname ;
   private String edtavCrpt_eje_reporteid_Jsonclick ;
   private String divRpt_eje_requestidfiltercontainer_Internalname ;
   private String lblLblrpt_eje_requestidfilter_Internalname ;
   private String lblLblrpt_eje_requestidfilter_Jsonclick ;
   private String edtavCrpt_eje_requestid_Internalname ;
   private String edtavCrpt_eje_requestid_Jsonclick ;
   private String divRpt_eje_estadofiltercontainer_Internalname ;
   private String lblLblrpt_eje_estadofilter_Internalname ;
   private String lblLblrpt_eje_estadofilter_Jsonclick ;
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
   private String edtRpt_Eje_Fecha_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtRpt_Eje_Id_Internalname ;
   private String edtRpt_Eje_Fecha_Internalname ;
   private String edtRpt_Eje_Usuario_Internalname ;
   private String edtRpt_Eje_ReporteId_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV14ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtRpt_Eje_Id_Jsonclick ;
   private String edtRpt_Eje_Fecha_Jsonclick ;
   private String edtRpt_Eje_Usuario_Jsonclick ;
   private String edtRpt_Eje_ReporteId_Jsonclick ;
   private java.util.Date AV7cRpt_Eje_Fecha ;
   private java.util.Date A862Rpt_Eje_Fecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n862Rpt_Eje_Fecha ;
   private boolean n863Rpt_Eje_Usuario ;
   private boolean n865Rpt_Eje_ReporteId ;
   private boolean n867Rpt_Eje_Estado ;
   private boolean n866Rpt_Eje_RequestId ;
   private boolean n864Rpt_Eje_Email ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV8cRpt_Eje_Usuario ;
   private String AV9cRpt_Eje_Email ;
   private String AV10cRpt_Eje_ReporteId ;
   private String AV11cRpt_Eje_RequestId ;
   private String AV12cRpt_Eje_Estado ;
   private String A863Rpt_Eje_Usuario ;
   private String A865Rpt_Eje_ReporteId ;
   private String A867Rpt_Eje_Estado ;
   private String AV17Linkselection_GXI ;
   private String lV8cRpt_Eje_Usuario ;
   private String lV9cRpt_Eje_Email ;
   private String lV10cRpt_Eje_ReporteId ;
   private String lV11cRpt_Eje_RequestId ;
   private String lV12cRpt_Eje_Estado ;
   private String A864Rpt_Eje_Email ;
   private String A866Rpt_Eje_RequestId ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCrpt_eje_estado ;
   private HTMLChoice cmbRpt_Eje_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H00A02_A866Rpt_Eje_RequestId ;
   private boolean[] H00A02_n866Rpt_Eje_RequestId ;
   private String[] H00A02_A864Rpt_Eje_Email ;
   private boolean[] H00A02_n864Rpt_Eje_Email ;
   private String[] H00A02_A867Rpt_Eje_Estado ;
   private boolean[] H00A02_n867Rpt_Eje_Estado ;
   private String[] H00A02_A865Rpt_Eje_ReporteId ;
   private boolean[] H00A02_n865Rpt_Eje_ReporteId ;
   private String[] H00A02_A863Rpt_Eje_Usuario ;
   private boolean[] H00A02_n863Rpt_Eje_Usuario ;
   private java.util.Date[] H00A02_A862Rpt_Eje_Fecha ;
   private boolean[] H00A02_n862Rpt_Eje_Fecha ;
   private int[] H00A02_A861Rpt_Eje_Id ;
   private long[] H00A03_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx01v0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00A02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          java.util.Date AV7cRpt_Eje_Fecha ,
                                          String AV8cRpt_Eje_Usuario ,
                                          String AV9cRpt_Eje_Email ,
                                          String AV10cRpt_Eje_ReporteId ,
                                          String AV11cRpt_Eje_RequestId ,
                                          String AV12cRpt_Eje_Estado ,
                                          java.util.Date A862Rpt_Eje_Fecha ,
                                          String A863Rpt_Eje_Usuario ,
                                          String A864Rpt_Eje_Email ,
                                          String A865Rpt_Eje_ReporteId ,
                                          String A866Rpt_Eje_RequestId ,
                                          String A867Rpt_Eje_Estado ,
                                          int AV6cRpt_Eje_Id )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ Rpt_Eje_RequestId, Rpt_Eje_Email, Rpt_Eje_Estado, Rpt_Eje_ReporteId," ;
      sSelectString = sSelectString + " Rpt_Eje_Usuario, Rpt_Eje_Fecha, Rpt_Eje_Id" ;
      sFromString = " FROM RPT_EJECUCION" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Rpt_Eje_Id >= ?)" ;
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV7cRpt_Eje_Fecha) )
      {
         sWhereString = sWhereString + " and (Rpt_Eje_Fecha >= ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cRpt_Eje_Usuario)==0) )
      {
         sWhereString = sWhereString + " and (Rpt_Eje_Usuario like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cRpt_Eje_Email)==0) )
      {
         sWhereString = sWhereString + " and (Rpt_Eje_Email like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cRpt_Eje_ReporteId)==0) )
      {
         sWhereString = sWhereString + " and (Rpt_Eje_ReporteId like ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cRpt_Eje_RequestId)==0) )
      {
         sWhereString = sWhereString + " and (Rpt_Eje_RequestId like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cRpt_Eje_Estado)==0) )
      {
         sWhereString = sWhereString + " and (Rpt_Eje_Estado like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Rpt_Eje_Id" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00A03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          java.util.Date AV7cRpt_Eje_Fecha ,
                                          String AV8cRpt_Eje_Usuario ,
                                          String AV9cRpt_Eje_Email ,
                                          String AV10cRpt_Eje_ReporteId ,
                                          String AV11cRpt_Eje_RequestId ,
                                          String AV12cRpt_Eje_Estado ,
                                          java.util.Date A862Rpt_Eje_Fecha ,
                                          String A863Rpt_Eje_Usuario ,
                                          String A864Rpt_Eje_Email ,
                                          String A865Rpt_Eje_ReporteId ,
                                          String A866Rpt_Eje_RequestId ,
                                          String A867Rpt_Eje_Estado ,
                                          int AV6cRpt_Eje_Id )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM RPT_EJECUCION" ;
      scmdbuf = scmdbuf + " WHERE (Rpt_Eje_Id >= ?)" ;
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV7cRpt_Eje_Fecha) )
      {
         sWhereString = sWhereString + " and (Rpt_Eje_Fecha >= ?)" ;
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cRpt_Eje_Usuario)==0) )
      {
         sWhereString = sWhereString + " and (Rpt_Eje_Usuario like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cRpt_Eje_Email)==0) )
      {
         sWhereString = sWhereString + " and (Rpt_Eje_Email like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cRpt_Eje_ReporteId)==0) )
      {
         sWhereString = sWhereString + " and (Rpt_Eje_ReporteId like ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cRpt_Eje_RequestId)==0) )
      {
         sWhereString = sWhereString + " and (Rpt_Eje_RequestId like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cRpt_Eje_Estado)==0) )
      {
         sWhereString = sWhereString + " and (Rpt_Eje_Estado like ?)" ;
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
                  return conditional_H00A02(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
            case 1 :
                  return conditional_H00A03(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00A02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00A03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(6) ;
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[11], false);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 50);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 50);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 10);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 50);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 50);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 10);
               }
               return;
      }
   }

}

