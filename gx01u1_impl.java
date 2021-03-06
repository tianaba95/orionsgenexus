/*
               File: gx01u1_impl
        Description: Selection List REPORTE PARAMETROS
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:25:12.4
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

public final  class gx01u1_impl extends GXDataArea
{
   public gx01u1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx01u1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx01u1_impl.class ));
   }

   public gx01u1_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCrpt_rep_parm_estado = new HTMLChoice();
      cmbRPT_REP_PARM_ESTADO = new HTMLChoice();
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
            nRC_GXsfl_44 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_44_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_44_idx = httpContext.GetNextPar( ) ;
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
            AV6cRPT_PAR_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV7cRPT_REP_PARM_ORDEN = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cRPT_REP_PARM_ESTADO = httpContext.GetNextPar( ) ;
            AV9pRPT_REP_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cRPT_PAR_ID, AV7cRPT_REP_PARM_ORDEN, AV8cRPT_REP_PARM_ESTADO, AV9pRPT_REP_ID) ;
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
            AV9pRPT_REP_ID = (short)(GXutil.lval( gxfirstwebparm)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9pRPT_REP_ID", GXutil.ltrim( GXutil.str( AV9pRPT_REP_ID, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPRPT_REP_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9pRPT_REP_ID), "ZZZ9")));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV10pRPT_PAR_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10pRPT_PAR_ID", GXutil.ltrim( GXutil.str( AV10pRPT_PAR_ID, 4, 0)));
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
      pa9K2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start9K2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141425129");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx01u1") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9pRPT_REP_ID,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10pRPT_PAR_ID,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_PAR_ID", GXutil.ltrim( localUtil.ntoc( AV6cRPT_PAR_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_REP_PARM_ORDEN", GXutil.ltrim( localUtil.ntoc( AV7cRPT_REP_PARM_ORDEN, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCRPT_REP_PARM_ESTADO", GXutil.rtrim( AV8cRPT_REP_PARM_ESTADO));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_44", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_44, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPRPT_REP_ID", GXutil.ltrim( localUtil.ntoc( AV9pRPT_REP_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPRPT_PAR_ID", GXutil.ltrim( localUtil.ntoc( AV10pRPT_PAR_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRPT_REP_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9pRPT_REP_ID), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRPT_REP_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9pRPT_REP_ID), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_PAR_IDFILTERCONTAINER_Class", GXutil.rtrim( divRpt_par_idfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_PARM_ORDENFILTERCONTAINER_Class", GXutil.rtrim( divRpt_rep_parm_ordenfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_PARM_ESTADOFILTERCONTAINER_Class", GXutil.rtrim( divRpt_rep_parm_estadofiltercontainer_Class));
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
         we9K2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt9K2( ) ;
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
      return formatLink("com.orions2.gx01u1") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9pRPT_REP_ID,4,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10pRPT_PAR_ID,4,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx01U1" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List REPORTE PARAMETROS" ;
   }

   public void wb9K0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_par_idfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_par_idfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_par_idfilter_Internalname, "Id Par�metro", "", "", lblLblrpt_par_idfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e119k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01U1.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_par_id_Internalname, "Id Par�metro", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_par_id_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cRPT_PAR_ID, (byte)(4), (byte)(0), ",", "")), ((edtavCrpt_par_id_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cRPT_PAR_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cRPT_PAR_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_par_id_Jsonclick, 0, "Attribute", "", "", "", edtavCrpt_par_id_Visible, edtavCrpt_par_id_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01U1.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_rep_parm_ordenfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_rep_parm_ordenfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_rep_parm_ordenfilter_Internalname, "�rden", "", "", lblLblrpt_rep_parm_ordenfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e129k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01U1.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCrpt_rep_parm_orden_Internalname, "�rden", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCrpt_rep_parm_orden_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cRPT_REP_PARM_ORDEN, (byte)(4), (byte)(0), ",", "")), ((edtavCrpt_rep_parm_orden_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cRPT_REP_PARM_ORDEN), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cRPT_REP_PARM_ORDEN), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCrpt_rep_parm_orden_Jsonclick, 0, "Attribute", "", "", "", edtavCrpt_rep_parm_orden_Visible, edtavCrpt_rep_parm_orden_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01U1.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRpt_rep_parm_estadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divRpt_rep_parm_estadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblrpt_rep_parm_estadofilter_Internalname, "Estado", "", "", lblLblrpt_rep_parm_estadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e139k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01U1.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCrpt_rep_parm_estado.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCrpt_rep_parm_estado, cmbavCrpt_rep_parm_estado.getInternalname(), GXutil.rtrim( AV8cRPT_REP_PARM_ESTADO), 1, cmbavCrpt_rep_parm_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavCrpt_rep_parm_estado.getVisible(), cmbavCrpt_rep_parm_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, "HLP_Gx01U1.htm");
         cmbavCrpt_rep_parm_estado.setValue( GXutil.rtrim( AV8cRPT_REP_PARM_ESTADO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCrpt_rep_parm_estado.getInternalname(), "Values", cmbavCrpt_rep_parm_estado.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e149k1_client"+"'", TempTags, "", 2, "HLP_Gx01U1.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"44\">") ;
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
            httpContext.writeValue( "Id Par�metro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "�rden") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id Reporte") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A852RPT_REP_PARM_ORDEN, (byte)(4), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtRPT_REP_PARM_ORDEN_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A853RPT_REP_PARM_ESTADO));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A843RPT_REP_ID, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 44 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_44 = (short)(nGXsfl_44_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx01U1.htm");
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

   public void start9K2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List REPORTE PARAMETROS", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup9K0( ) ;
   }

   public void ws9K2( )
   {
      start9K2( ) ;
      evt9K2( ) ;
   }

   public void evt9K2( )
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
                           nGXsfl_44_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_44_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_44_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_442( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV14Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_44_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A840RPT_PAR_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtRPT_PAR_ID_Internalname), ",", ".")) ;
                           A852RPT_REP_PARM_ORDEN = (short)(localUtil.ctol( httpContext.cgiGet( edtRPT_REP_PARM_ORDEN_Internalname), ",", ".")) ;
                           n852RPT_REP_PARM_ORDEN = false ;
                           cmbRPT_REP_PARM_ESTADO.setName( cmbRPT_REP_PARM_ESTADO.getInternalname() );
                           cmbRPT_REP_PARM_ESTADO.setValue( httpContext.cgiGet( cmbRPT_REP_PARM_ESTADO.getInternalname()) );
                           A853RPT_REP_PARM_ESTADO = httpContext.cgiGet( cmbRPT_REP_PARM_ESTADO.getInternalname()) ;
                           n853RPT_REP_PARM_ESTADO = false ;
                           A843RPT_REP_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtRPT_REP_ID_Internalname), ",", ".")) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e159K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e169K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Crpt_par_id Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRPT_PAR_ID"), ",", ".") != AV6cRPT_PAR_ID )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_rep_parm_orden Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRPT_REP_PARM_ORDEN"), ",", ".") != AV7cRPT_REP_PARM_ORDEN )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Crpt_rep_parm_estado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_REP_PARM_ESTADO"), AV8cRPT_REP_PARM_ESTADO) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e179K2 ();
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

   public void we9K2( )
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

   public void pa9K2( )
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
         cmbavCrpt_rep_parm_estado.setName( "vCRPT_REP_PARM_ESTADO" );
         cmbavCrpt_rep_parm_estado.setWebtags( "" );
         cmbavCrpt_rep_parm_estado.addItem("A", "Activo", (short)(0));
         cmbavCrpt_rep_parm_estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbavCrpt_rep_parm_estado.getItemCount() > 0 )
         {
            AV8cRPT_REP_PARM_ESTADO = cmbavCrpt_rep_parm_estado.getValidValue(AV8cRPT_REP_PARM_ESTADO) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cRPT_REP_PARM_ESTADO", AV8cRPT_REP_PARM_ESTADO);
         }
         GXCCtl = "RPT_REP_PARM_ESTADO_" + sGXsfl_44_idx ;
         cmbRPT_REP_PARM_ESTADO.setName( GXCCtl );
         cmbRPT_REP_PARM_ESTADO.setWebtags( "" );
         cmbRPT_REP_PARM_ESTADO.addItem("A", "Activo", (short)(0));
         cmbRPT_REP_PARM_ESTADO.addItem("I", "Inactivo", (short)(0));
         if ( cmbRPT_REP_PARM_ESTADO.getItemCount() > 0 )
         {
            A853RPT_REP_PARM_ESTADO = cmbRPT_REP_PARM_ESTADO.getValidValue(A853RPT_REP_PARM_ESTADO) ;
            n853RPT_REP_PARM_ESTADO = false ;
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
      subsflControlProps_442( ) ;
      while ( nGXsfl_44_idx <= nRC_GXsfl_44 )
      {
         sendrow_442( ) ;
         nGXsfl_44_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_44_idx+1)) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_44_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  short AV6cRPT_PAR_ID ,
                                  short AV7cRPT_REP_PARM_ORDEN ,
                                  String AV8cRPT_REP_PARM_ESTADO ,
                                  short AV9pRPT_REP_ID )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf9K2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_PAR_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A840RPT_PAR_ID), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_PAR_ID", GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_PARM_ORDEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A852RPT_REP_PARM_ORDEN), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_PARM_ORDEN", GXutil.ltrim( localUtil.ntoc( A852RPT_REP_PARM_ORDEN, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_PARM_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A853RPT_REP_PARM_ESTADO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_PARM_ESTADO", GXutil.rtrim( A853RPT_REP_PARM_ESTADO));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A843RPT_REP_ID), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_ID", GXutil.ltrim( localUtil.ntoc( A843RPT_REP_ID, (byte)(4), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCrpt_rep_parm_estado.getItemCount() > 0 )
      {
         AV8cRPT_REP_PARM_ESTADO = cmbavCrpt_rep_parm_estado.getValidValue(AV8cRPT_REP_PARM_ESTADO) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cRPT_REP_PARM_ESTADO", AV8cRPT_REP_PARM_ESTADO);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf9K2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf9K2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(44) ;
      nGXsfl_44_idx = (short)(1) ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_44_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_442( ) ;
      bGXsfl_44_Refreshing = true ;
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
         subsflControlProps_442( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              new Short(AV7cRPT_REP_PARM_ORDEN) ,
                                              AV8cRPT_REP_PARM_ESTADO ,
                                              new Short(A852RPT_REP_PARM_ORDEN) ,
                                              A853RPT_REP_PARM_ESTADO ,
                                              new Short(AV9pRPT_REP_ID) ,
                                              new Short(AV6cRPT_PAR_ID) ,
                                              new Short(A843RPT_REP_ID) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT
                                              }
         } ) ;
         lV8cRPT_REP_PARM_ESTADO = GXutil.padr( GXutil.rtrim( AV8cRPT_REP_PARM_ESTADO), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cRPT_REP_PARM_ESTADO", AV8cRPT_REP_PARM_ESTADO);
         /* Using cursor H009K2 */
         pr_default.execute(0, new Object[] {new Short(AV9pRPT_REP_ID), new Short(AV6cRPT_PAR_ID), new Short(AV7cRPT_REP_PARM_ORDEN), lV8cRPT_REP_PARM_ESTADO, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_44_idx = (short)(1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_44_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_442( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A843RPT_REP_ID = H009K2_A843RPT_REP_ID[0] ;
            A853RPT_REP_PARM_ESTADO = H009K2_A853RPT_REP_PARM_ESTADO[0] ;
            n853RPT_REP_PARM_ESTADO = H009K2_n853RPT_REP_PARM_ESTADO[0] ;
            A852RPT_REP_PARM_ORDEN = H009K2_A852RPT_REP_PARM_ORDEN[0] ;
            n852RPT_REP_PARM_ORDEN = H009K2_n852RPT_REP_PARM_ORDEN[0] ;
            A840RPT_PAR_ID = H009K2_A840RPT_PAR_ID[0] ;
            /* Execute user event: Load */
            e169K2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(44) ;
         wb9K0( ) ;
      }
      bGXsfl_44_Refreshing = true ;
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
                                           new Short(AV7cRPT_REP_PARM_ORDEN) ,
                                           AV8cRPT_REP_PARM_ESTADO ,
                                           new Short(A852RPT_REP_PARM_ORDEN) ,
                                           A853RPT_REP_PARM_ESTADO ,
                                           new Short(AV9pRPT_REP_ID) ,
                                           new Short(AV6cRPT_PAR_ID) ,
                                           new Short(A843RPT_REP_ID) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      } ) ;
      lV8cRPT_REP_PARM_ESTADO = GXutil.padr( GXutil.rtrim( AV8cRPT_REP_PARM_ESTADO), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cRPT_REP_PARM_ESTADO", AV8cRPT_REP_PARM_ESTADO);
      /* Using cursor H009K3 */
      pr_default.execute(1, new Object[] {new Short(AV9pRPT_REP_ID), new Short(AV6cRPT_PAR_ID), new Short(AV7cRPT_REP_PARM_ORDEN), lV8cRPT_REP_PARM_ESTADO});
      GRID1_nRecordCount = H009K3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRPT_PAR_ID, AV7cRPT_REP_PARM_ORDEN, AV8cRPT_REP_PARM_ESTADO, AV9pRPT_REP_ID) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRPT_PAR_ID, AV7cRPT_REP_PARM_ORDEN, AV8cRPT_REP_PARM_ESTADO, AV9pRPT_REP_ID) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRPT_PAR_ID, AV7cRPT_REP_PARM_ORDEN, AV8cRPT_REP_PARM_ESTADO, AV9pRPT_REP_ID) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRPT_PAR_ID, AV7cRPT_REP_PARM_ORDEN, AV8cRPT_REP_PARM_ESTADO, AV9pRPT_REP_ID) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cRPT_PAR_ID, AV7cRPT_REP_PARM_ORDEN, AV8cRPT_REP_PARM_ESTADO, AV9pRPT_REP_ID) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup9K0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e159K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCrpt_par_id_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCrpt_par_id_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCRPT_PAR_ID");
            GX_FocusControl = edtavCrpt_par_id_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cRPT_PAR_ID = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cRPT_PAR_ID", GXutil.ltrim( GXutil.str( AV6cRPT_PAR_ID, 4, 0)));
         }
         else
         {
            AV6cRPT_PAR_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtavCrpt_par_id_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cRPT_PAR_ID", GXutil.ltrim( GXutil.str( AV6cRPT_PAR_ID, 4, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCrpt_rep_parm_orden_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCrpt_rep_parm_orden_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCRPT_REP_PARM_ORDEN");
            GX_FocusControl = edtavCrpt_rep_parm_orden_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cRPT_REP_PARM_ORDEN = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cRPT_REP_PARM_ORDEN", GXutil.ltrim( GXutil.str( AV7cRPT_REP_PARM_ORDEN, 4, 0)));
         }
         else
         {
            AV7cRPT_REP_PARM_ORDEN = (short)(localUtil.ctol( httpContext.cgiGet( edtavCrpt_rep_parm_orden_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cRPT_REP_PARM_ORDEN", GXutil.ltrim( GXutil.str( AV7cRPT_REP_PARM_ORDEN, 4, 0)));
         }
         cmbavCrpt_rep_parm_estado.setName( cmbavCrpt_rep_parm_estado.getInternalname() );
         cmbavCrpt_rep_parm_estado.setValue( httpContext.cgiGet( cmbavCrpt_rep_parm_estado.getInternalname()) );
         AV8cRPT_REP_PARM_ESTADO = httpContext.cgiGet( cmbavCrpt_rep_parm_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cRPT_REP_PARM_ESTADO", AV8cRPT_REP_PARM_ESTADO);
         /* Read saved values. */
         nRC_GXsfl_44 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_44"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRPT_PAR_ID"), ",", ".") != AV6cRPT_PAR_ID )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCRPT_REP_PARM_ORDEN"), ",", ".") != AV7cRPT_REP_PARM_ORDEN )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCRPT_REP_PARM_ESTADO"), AV8cRPT_REP_PARM_ESTADO) != 0 )
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
      e159K2 ();
      if (returnInSub) return;
   }

   public void e159K2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selecci�n %1", "REPORTE PARAMETROS", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV11ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e169K2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV14Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_442( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_44_Refreshing )
      {
         httpContext.doAjaxLoad(44, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e179K2 ();
      if (returnInSub) return;
   }

   public void e179K2( )
   {
      /* Enter Routine */
      AV10pRPT_PAR_ID = A840RPT_PAR_ID ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pRPT_PAR_ID", GXutil.ltrim( GXutil.str( AV10pRPT_PAR_ID, 4, 0)));
      httpContext.setWebReturnParms(new Object[] {new Short(AV10pRPT_PAR_ID)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV9pRPT_REP_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9pRPT_REP_ID", GXutil.ltrim( GXutil.str( AV9pRPT_REP_ID, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPRPT_REP_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9pRPT_REP_ID), "ZZZ9")));
      AV10pRPT_PAR_ID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pRPT_PAR_ID", GXutil.ltrim( GXutil.str( AV10pRPT_PAR_ID, 4, 0)));
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
      pa9K2( ) ;
      ws9K2( ) ;
      we9K2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414251268");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx01u1.js", "?201861414251268");
      /* End function include_jscripts */
   }

   public void subsflControlProps_442( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_44_idx ;
      edtRPT_PAR_ID_Internalname = "RPT_PAR_ID_"+sGXsfl_44_idx ;
      edtRPT_REP_PARM_ORDEN_Internalname = "RPT_REP_PARM_ORDEN_"+sGXsfl_44_idx ;
      cmbRPT_REP_PARM_ESTADO.setInternalname( "RPT_REP_PARM_ESTADO_"+sGXsfl_44_idx );
      edtRPT_REP_ID_Internalname = "RPT_REP_ID_"+sGXsfl_44_idx ;
   }

   public void subsflControlProps_fel_442( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_44_fel_idx ;
      edtRPT_PAR_ID_Internalname = "RPT_PAR_ID_"+sGXsfl_44_fel_idx ;
      edtRPT_REP_PARM_ORDEN_Internalname = "RPT_REP_PARM_ORDEN_"+sGXsfl_44_fel_idx ;
      cmbRPT_REP_PARM_ESTADO.setInternalname( "RPT_REP_PARM_ESTADO_"+sGXsfl_44_fel_idx );
      edtRPT_REP_ID_Internalname = "RPT_REP_ID_"+sGXsfl_44_fel_idx ;
   }

   public void sendrow_442( )
   {
      subsflControlProps_442( ) ;
      wb9K0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_44_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_44_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_44_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_44_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV14Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV14Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRPT_PAR_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A840RPT_PAR_ID), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRPT_PAR_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(44),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtRPT_REP_PARM_ORDEN_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtRPT_REP_PARM_ORDEN_Internalname, "Link", edtRPT_REP_PARM_ORDEN_Link, !bGXsfl_44_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRPT_REP_PARM_ORDEN_Internalname,GXutil.ltrim( localUtil.ntoc( A852RPT_REP_PARM_ORDEN, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A852RPT_REP_PARM_ORDEN), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtRPT_REP_PARM_ORDEN_Link,"","","",edtRPT_REP_PARM_ORDEN_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(44),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_44_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RPT_REP_PARM_ESTADO_" + sGXsfl_44_idx ;
            cmbRPT_REP_PARM_ESTADO.setName( GXCCtl );
            cmbRPT_REP_PARM_ESTADO.setWebtags( "" );
            cmbRPT_REP_PARM_ESTADO.addItem("A", "Activo", (short)(0));
            cmbRPT_REP_PARM_ESTADO.addItem("I", "Inactivo", (short)(0));
            if ( cmbRPT_REP_PARM_ESTADO.getItemCount() > 0 )
            {
               A853RPT_REP_PARM_ESTADO = cmbRPT_REP_PARM_ESTADO.getValidValue(A853RPT_REP_PARM_ESTADO) ;
               n853RPT_REP_PARM_ESTADO = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbRPT_REP_PARM_ESTADO,cmbRPT_REP_PARM_ESTADO.getInternalname(),GXutil.rtrim( A853RPT_REP_PARM_ESTADO),new Integer(1),cmbRPT_REP_PARM_ESTADO.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbRPT_REP_PARM_ESTADO.setValue( GXutil.rtrim( A853RPT_REP_PARM_ESTADO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbRPT_REP_PARM_ESTADO.getInternalname(), "Values", cmbRPT_REP_PARM_ESTADO.ToJavascriptSource(), !bGXsfl_44_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRPT_REP_ID_Internalname,GXutil.ltrim( localUtil.ntoc( A843RPT_REP_ID, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A843RPT_REP_ID), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRPT_REP_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(44),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_PAR_ID"+"_"+sGXsfl_44_idx, getSecureSignedToken( sGXsfl_44_idx, localUtil.format( DecimalUtil.doubleToDec(A840RPT_PAR_ID), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_PARM_ORDEN"+"_"+sGXsfl_44_idx, getSecureSignedToken( sGXsfl_44_idx, localUtil.format( DecimalUtil.doubleToDec(A852RPT_REP_PARM_ORDEN), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_PARM_ESTADO"+"_"+sGXsfl_44_idx, getSecureSignedToken( sGXsfl_44_idx, GXutil.rtrim( localUtil.format( A853RPT_REP_PARM_ESTADO, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_RPT_REP_ID"+"_"+sGXsfl_44_idx, getSecureSignedToken( sGXsfl_44_idx, localUtil.format( DecimalUtil.doubleToDec(A843RPT_REP_ID), "ZZZ9")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_44_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_44_idx+1)) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_44_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      /* End function sendrow_442 */
   }

   public void init_default_properties( )
   {
      lblLblrpt_par_idfilter_Internalname = "LBLRPT_PAR_IDFILTER" ;
      edtavCrpt_par_id_Internalname = "vCRPT_PAR_ID" ;
      divRpt_par_idfiltercontainer_Internalname = "RPT_PAR_IDFILTERCONTAINER" ;
      lblLblrpt_rep_parm_ordenfilter_Internalname = "LBLRPT_REP_PARM_ORDENFILTER" ;
      edtavCrpt_rep_parm_orden_Internalname = "vCRPT_REP_PARM_ORDEN" ;
      divRpt_rep_parm_ordenfiltercontainer_Internalname = "RPT_REP_PARM_ORDENFILTERCONTAINER" ;
      lblLblrpt_rep_parm_estadofilter_Internalname = "LBLRPT_REP_PARM_ESTADOFILTER" ;
      cmbavCrpt_rep_parm_estado.setInternalname( "vCRPT_REP_PARM_ESTADO" );
      divRpt_rep_parm_estadofiltercontainer_Internalname = "RPT_REP_PARM_ESTADOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtRPT_PAR_ID_Internalname = "RPT_PAR_ID" ;
      edtRPT_REP_PARM_ORDEN_Internalname = "RPT_REP_PARM_ORDEN" ;
      cmbRPT_REP_PARM_ESTADO.setInternalname( "RPT_REP_PARM_ESTADO" );
      edtRPT_REP_ID_Internalname = "RPT_REP_ID" ;
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
      edtRPT_REP_ID_Jsonclick = "" ;
      cmbRPT_REP_PARM_ESTADO.setJsonclick( "" );
      edtRPT_REP_PARM_ORDEN_Jsonclick = "" ;
      edtRPT_PAR_ID_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtRPT_REP_PARM_ORDEN_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavCrpt_rep_parm_estado.setJsonclick( "" );
      cmbavCrpt_rep_parm_estado.setEnabled( 1 );
      cmbavCrpt_rep_parm_estado.setVisible( 1 );
      edtavCrpt_rep_parm_orden_Jsonclick = "" ;
      edtavCrpt_rep_parm_orden_Enabled = 1 ;
      edtavCrpt_rep_parm_orden_Visible = 1 ;
      edtavCrpt_par_id_Jsonclick = "" ;
      edtavCrpt_par_id_Enabled = 1 ;
      edtavCrpt_par_id_Visible = 1 ;
      divRpt_rep_parm_estadofiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_rep_parm_ordenfiltercontainer_Class = "AdvancedContainerItem" ;
      divRpt_par_idfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List REPORTE PARAMETROS" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRPT_PAR_ID',fld:'vCRPT_PAR_ID',pic:'ZZZ9',nv:0},{av:'AV7cRPT_REP_PARM_ORDEN',fld:'vCRPT_REP_PARM_ORDEN',pic:'ZZZ9',nv:0},{av:'cmbavCrpt_rep_parm_estado'},{av:'AV8cRPT_REP_PARM_ESTADO',fld:'vCRPT_REP_PARM_ESTADO',pic:'',nv:''},{av:'AV9pRPT_REP_ID',fld:'vPRPT_REP_ID',pic:'ZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e149K1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLRPT_PAR_IDFILTER.CLICK","{handler:'e119K1',iparms:[{av:'divRpt_par_idfiltercontainer_Class',ctrl:'RPT_PAR_IDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_par_idfiltercontainer_Class',ctrl:'RPT_PAR_IDFILTERCONTAINER',prop:'Class'},{av:'edtavCrpt_par_id_Visible',ctrl:'vCRPT_PAR_ID',prop:'Visible'}]}");
      setEventMetadata("LBLRPT_REP_PARM_ORDENFILTER.CLICK","{handler:'e129K1',iparms:[{av:'divRpt_rep_parm_ordenfiltercontainer_Class',ctrl:'RPT_REP_PARM_ORDENFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_rep_parm_ordenfiltercontainer_Class',ctrl:'RPT_REP_PARM_ORDENFILTERCONTAINER',prop:'Class'},{av:'edtavCrpt_rep_parm_orden_Visible',ctrl:'vCRPT_REP_PARM_ORDEN',prop:'Visible'}]}");
      setEventMetadata("LBLRPT_REP_PARM_ESTADOFILTER.CLICK","{handler:'e139K1',iparms:[{av:'divRpt_rep_parm_estadofiltercontainer_Class',ctrl:'RPT_REP_PARM_ESTADOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRpt_rep_parm_estadofiltercontainer_Class',ctrl:'RPT_REP_PARM_ESTADOFILTERCONTAINER',prop:'Class'},{av:'cmbavCrpt_rep_parm_estado'}]}");
      setEventMetadata("ENTER","{handler:'e179K2',iparms:[{av:'A840RPT_PAR_ID',fld:'RPT_PAR_ID',pic:'ZZZ9',hsh:true,nv:0}],oparms:[{av:'AV10pRPT_PAR_ID',fld:'vPRPT_PAR_ID',pic:'ZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRPT_PAR_ID',fld:'vCRPT_PAR_ID',pic:'ZZZ9',nv:0},{av:'AV7cRPT_REP_PARM_ORDEN',fld:'vCRPT_REP_PARM_ORDEN',pic:'ZZZ9',nv:0},{av:'cmbavCrpt_rep_parm_estado'},{av:'AV8cRPT_REP_PARM_ESTADO',fld:'vCRPT_REP_PARM_ESTADO',pic:'',nv:''},{av:'AV9pRPT_REP_ID',fld:'vPRPT_REP_ID',pic:'ZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRPT_PAR_ID',fld:'vCRPT_PAR_ID',pic:'ZZZ9',nv:0},{av:'AV7cRPT_REP_PARM_ORDEN',fld:'vCRPT_REP_PARM_ORDEN',pic:'ZZZ9',nv:0},{av:'cmbavCrpt_rep_parm_estado'},{av:'AV8cRPT_REP_PARM_ESTADO',fld:'vCRPT_REP_PARM_ESTADO',pic:'',nv:''},{av:'AV9pRPT_REP_ID',fld:'vPRPT_REP_ID',pic:'ZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRPT_PAR_ID',fld:'vCRPT_PAR_ID',pic:'ZZZ9',nv:0},{av:'AV7cRPT_REP_PARM_ORDEN',fld:'vCRPT_REP_PARM_ORDEN',pic:'ZZZ9',nv:0},{av:'cmbavCrpt_rep_parm_estado'},{av:'AV8cRPT_REP_PARM_ESTADO',fld:'vCRPT_REP_PARM_ESTADO',pic:'',nv:''},{av:'AV9pRPT_REP_ID',fld:'vPRPT_REP_ID',pic:'ZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cRPT_PAR_ID',fld:'vCRPT_PAR_ID',pic:'ZZZ9',nv:0},{av:'AV7cRPT_REP_PARM_ORDEN',fld:'vCRPT_REP_PARM_ORDEN',pic:'ZZZ9',nv:0},{av:'cmbavCrpt_rep_parm_estado'},{av:'AV8cRPT_REP_PARM_ESTADO',fld:'vCRPT_REP_PARM_ESTADO',pic:'',nv:''},{av:'AV9pRPT_REP_ID',fld:'vPRPT_REP_ID',pic:'ZZZ9',hsh:true,nv:0}],oparms:[]}");
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
      AV8cRPT_REP_PARM_ESTADO = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblrpt_par_idfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblrpt_rep_parm_ordenfilter_Jsonclick = "" ;
      lblLblrpt_rep_parm_estadofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A853RPT_REP_PARM_ESTADO = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV14Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV8cRPT_REP_PARM_ESTADO = "" ;
      H009K2_A843RPT_REP_ID = new short[1] ;
      H009K2_A853RPT_REP_PARM_ESTADO = new String[] {""} ;
      H009K2_n853RPT_REP_PARM_ESTADO = new boolean[] {false} ;
      H009K2_A852RPT_REP_PARM_ORDEN = new short[1] ;
      H009K2_n852RPT_REP_PARM_ORDEN = new boolean[] {false} ;
      H009K2_A840RPT_PAR_ID = new short[1] ;
      H009K3_AGRID1_nRecordCount = new long[1] ;
      AV11ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx01u1__default(),
         new Object[] {
             new Object[] {
            H009K2_A843RPT_REP_ID, H009K2_A853RPT_REP_PARM_ESTADO, H009K2_n853RPT_REP_PARM_ESTADO, H009K2_A852RPT_REP_PARM_ORDEN, H009K2_n852RPT_REP_PARM_ORDEN, H009K2_A840RPT_PAR_ID
            }
            , new Object[] {
            H009K3_AGRID1_nRecordCount
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
   private short wcpOAV9pRPT_REP_ID ;
   private short nRC_GXsfl_44 ;
   private short nGXsfl_44_idx=1 ;
   private short AV6cRPT_PAR_ID ;
   private short AV7cRPT_REP_PARM_ORDEN ;
   private short AV9pRPT_REP_ID ;
   private short AV10pRPT_PAR_ID ;
   private short wbEnd ;
   private short wbStart ;
   private short A840RPT_PAR_ID ;
   private short A852RPT_REP_PARM_ORDEN ;
   private short A843RPT_REP_ID ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCrpt_par_id_Enabled ;
   private int edtavCrpt_par_id_Visible ;
   private int edtavCrpt_rep_parm_orden_Enabled ;
   private int edtavCrpt_rep_parm_orden_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
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
   private String divRpt_par_idfiltercontainer_Class ;
   private String divRpt_rep_parm_ordenfiltercontainer_Class ;
   private String divRpt_rep_parm_estadofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_44_idx="0001" ;
   private String AV8cRPT_REP_PARM_ESTADO ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divRpt_par_idfiltercontainer_Internalname ;
   private String lblLblrpt_par_idfilter_Internalname ;
   private String lblLblrpt_par_idfilter_Jsonclick ;
   private String edtavCrpt_par_id_Internalname ;
   private String TempTags ;
   private String edtavCrpt_par_id_Jsonclick ;
   private String divRpt_rep_parm_ordenfiltercontainer_Internalname ;
   private String lblLblrpt_rep_parm_ordenfilter_Internalname ;
   private String lblLblrpt_rep_parm_ordenfilter_Jsonclick ;
   private String edtavCrpt_rep_parm_orden_Internalname ;
   private String edtavCrpt_rep_parm_orden_Jsonclick ;
   private String divRpt_rep_parm_estadofiltercontainer_Internalname ;
   private String lblLblrpt_rep_parm_estadofilter_Internalname ;
   private String lblLblrpt_rep_parm_estadofilter_Jsonclick ;
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
   private String edtRPT_REP_PARM_ORDEN_Link ;
   private String A853RPT_REP_PARM_ESTADO ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtRPT_PAR_ID_Internalname ;
   private String edtRPT_REP_PARM_ORDEN_Internalname ;
   private String edtRPT_REP_ID_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV8cRPT_REP_PARM_ESTADO ;
   private String AV11ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_44_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtRPT_PAR_ID_Jsonclick ;
   private String edtRPT_REP_PARM_ORDEN_Jsonclick ;
   private String edtRPT_REP_ID_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_44_Refreshing=false ;
   private boolean n852RPT_REP_PARM_ORDEN ;
   private boolean n853RPT_REP_PARM_ESTADO ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV14Linkselection_GXI ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCrpt_rep_parm_estado ;
   private HTMLChoice cmbRPT_REP_PARM_ESTADO ;
   private IDataStoreProvider pr_default ;
   private short[] H009K2_A843RPT_REP_ID ;
   private String[] H009K2_A853RPT_REP_PARM_ESTADO ;
   private boolean[] H009K2_n853RPT_REP_PARM_ESTADO ;
   private short[] H009K2_A852RPT_REP_PARM_ORDEN ;
   private boolean[] H009K2_n852RPT_REP_PARM_ORDEN ;
   private short[] H009K2_A840RPT_PAR_ID ;
   private long[] H009K3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx01u1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H009K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          short AV7cRPT_REP_PARM_ORDEN ,
                                          String AV8cRPT_REP_PARM_ESTADO ,
                                          short A852RPT_REP_PARM_ORDEN ,
                                          String A853RPT_REP_PARM_ESTADO ,
                                          short AV9pRPT_REP_ID ,
                                          short AV6cRPT_PAR_ID ,
                                          short A843RPT_REP_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [7] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " /*+ FIRST_ROWS(11) */ RPT_REP_ID, RPT_REP_PARM_ESTADO, RPT_REP_PARM_ORDEN, RPT_PAR_ID" ;
      sFromString = " FROM RPT_REP_PARM" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (RPT_REP_ID = ? and RPT_PAR_ID >= ?)" ;
      if ( ! (0==AV7cRPT_REP_PARM_ORDEN) )
      {
         sWhereString = sWhereString + " and (RPT_REP_PARM_ORDEN >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cRPT_REP_PARM_ESTADO)==0) )
      {
         sWhereString = sWhereString + " and (RPT_REP_PARM_ESTADO like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY RPT_REP_ID, RPT_PAR_ID" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H009K3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          short AV7cRPT_REP_PARM_ORDEN ,
                                          String AV8cRPT_REP_PARM_ESTADO ,
                                          short A852RPT_REP_PARM_ORDEN ,
                                          String A853RPT_REP_PARM_ESTADO ,
                                          short AV9pRPT_REP_ID ,
                                          short AV6cRPT_PAR_ID ,
                                          short A843RPT_REP_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [4] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM RPT_REP_PARM" ;
      scmdbuf = scmdbuf + " WHERE (RPT_REP_ID = ? and RPT_PAR_ID >= ?)" ;
      if ( ! (0==AV7cRPT_REP_PARM_ORDEN) )
      {
         sWhereString = sWhereString + " and (RPT_REP_PARM_ORDEN >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cRPT_REP_PARM_ESTADO)==0) )
      {
         sWhereString = sWhereString + " and (RPT_REP_PARM_ESTADO like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
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
                  return conditional_H009K2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() );
            case 1 :
                  return conditional_H009K3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H009K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H009K3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
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
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[4]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[5]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 1);
               }
               return;
      }
   }

}

