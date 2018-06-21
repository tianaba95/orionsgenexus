/*
               File: gx01b0_impl
        Description: Selection List MAS_CARGUE_SALIDAS
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:56.50
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

public final  class gx01b0_impl extends GXDataArea
{
   public gx01b0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx01b0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx01b0_impl.class ));
   }

   public gx01b0_impl( int remoteHandle ,
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
            nRC_GXsfl_64 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_64_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_64_idx = httpContext.GetNextPar( ) ;
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
            AV6cNUMTRN = GXutil.lval( httpContext.GetNextPar( )) ;
            AV7cID_SALIDA = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cPLACASENA = httpContext.GetNextPar( ) ;
            AV9cCONSECUTIVO = httpContext.GetNextPar( ) ;
            AV10cCANTIDAD = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cNUMTRN, AV7cID_SALIDA, AV8cPLACASENA, AV9cCONSECUTIVO, AV10cCANTIDAD) ;
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
            AV11pNUMTRN = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11pNUMTRN", GXutil.ltrim( GXutil.str( AV11pNUMTRN, 11, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV12pID_SALIDA = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12pID_SALIDA", GXutil.ltrim( GXutil.str( AV12pID_SALIDA, 4, 0)));
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
      pa902( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start902( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414245656");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx01b0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11pNUMTRN,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12pID_SALIDA,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCNUMTRN", GXutil.ltrim( localUtil.ntoc( AV6cNUMTRN, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCID_SALIDA", GXutil.ltrim( localUtil.ntoc( AV7cID_SALIDA, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCPLACASENA", AV8cPLACASENA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCONSECUTIVO", AV9cCONSECUTIVO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCANTIDAD", GXutil.ltrim( localUtil.ntoc( AV10cCANTIDAD, (byte)(4), (byte)(0), ",", "")));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_64", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_64, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPNUMTRN", GXutil.ltrim( localUtil.ntoc( AV11pNUMTRN, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPID_SALIDA", GXutil.ltrim( localUtil.ntoc( AV12pID_SALIDA, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NUMTRNFILTERCONTAINER_Class", GXutil.rtrim( divNumtrnfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ID_SALIDAFILTERCONTAINER_Class", GXutil.rtrim( divId_salidafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PLACASENAFILTERCONTAINER_Class", GXutil.rtrim( divPlacasenafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CONSECUTIVOFILTERCONTAINER_Class", GXutil.rtrim( divConsecutivofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CANTIDADFILTERCONTAINER_Class", GXutil.rtrim( divCantidadfiltercontainer_Class));
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
         we902( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt902( ) ;
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
      return formatLink("com.orions2.gx01b0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11pNUMTRN,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV12pID_SALIDA,4,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx01B0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List MAS_CARGUE_SALIDAS" ;
   }

   public void wb900( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divNumtrnfiltercontainer_Internalname, 1, 0, "px", 0, "px", divNumtrnfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblnumtrnfilter_Internalname, "NUMTRN", "", "", lblLblnumtrnfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11901_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01B0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCnumtrn_Internalname, "NUMTRN", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCnumtrn_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cNUMTRN, (byte)(11), (byte)(0), ",", "")), ((edtavCnumtrn_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cNUMTRN), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cNUMTRN), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCnumtrn_Jsonclick, 0, "Attribute", "", "", "", edtavCnumtrn_Visible, edtavCnumtrn_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01B0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divId_salidafiltercontainer_Internalname, 1, 0, "px", 0, "px", divId_salidafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblid_salidafilter_Internalname, "ID_SALIDA", "", "", lblLblid_salidafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12901_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01B0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCid_salida_Internalname, "ID_SALIDA", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCid_salida_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cID_SALIDA, (byte)(4), (byte)(0), ",", "")), ((edtavCid_salida_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cID_SALIDA), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cID_SALIDA), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCid_salida_Jsonclick, 0, "Attribute", "", "", "", edtavCid_salida_Visible, edtavCid_salida_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01B0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divPlacasenafiltercontainer_Internalname, 1, 0, "px", 0, "px", divPlacasenafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblplacasenafilter_Internalname, "PLACASENA", "", "", lblLblplacasenafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13901_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01B0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCplacasena_Internalname, "PLACASENA", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCplacasena_Internalname, AV8cPLACASENA, GXutil.rtrim( localUtil.format( AV8cPLACASENA, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCplacasena_Jsonclick, 0, "Attribute", "", "", "", edtavCplacasena_Visible, edtavCplacasena_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01B0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divConsecutivofiltercontainer_Internalname, 1, 0, "px", 0, "px", divConsecutivofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblconsecutivofilter_Internalname, "CONSECUTIVO", "", "", lblLblconsecutivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14901_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01B0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCconsecutivo_Internalname, "CONSECUTIVO", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCconsecutivo_Internalname, AV9cCONSECUTIVO, GXutil.rtrim( localUtil.format( AV9cCONSECUTIVO, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCconsecutivo_Jsonclick, 0, "Attribute", "", "", "", edtavCconsecutivo_Visible, edtavCconsecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01B0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCantidadfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCantidadfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcantidadfilter_Internalname, "CANTIDAD", "", "", lblLblcantidadfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15901_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01B0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcantidad_Internalname, "CANTIDAD", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcantidad_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cCANTIDAD, (byte)(4), (byte)(0), ",", "")), ((edtavCcantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cCANTIDAD), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cCANTIDAD), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcantidad_Jsonclick, 0, "Attribute", "", "", "", edtavCcantidad_Visible, edtavCcantidad_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01B0.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e16901_client"+"'", TempTags, "", 2, "HLP_Gx01B0.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"64\">") ;
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
            httpContext.writeValue( "NUMTRN") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "ID_SALIDA") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "PLACASENA") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "CONSECUTIVO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "CANTIDAD") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A78NUMTRN, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A79ID_SALIDA, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A530PLACASENA);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtPLACASENA_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A553CONSECUTIVO);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A554CANTIDAD, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 64 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_64 = (short)(nGXsfl_64_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx01B0.htm");
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

   public void start902( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List MAS_CARGUE_SALIDAS", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup900( ) ;
   }

   public void ws902( )
   {
      start902( ) ;
      evt902( ) ;
   }

   public void evt902( )
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
                           nGXsfl_64_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_64_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_64_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_642( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV16Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_64_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A78NUMTRN = localUtil.ctol( httpContext.cgiGet( edtNUMTRN_Internalname), ",", ".") ;
                           A79ID_SALIDA = (short)(localUtil.ctol( httpContext.cgiGet( edtID_SALIDA_Internalname), ",", ".")) ;
                           A530PLACASENA = httpContext.cgiGet( edtPLACASENA_Internalname) ;
                           n530PLACASENA = false ;
                           A553CONSECUTIVO = httpContext.cgiGet( edtCONSECUTIVO_Internalname) ;
                           n553CONSECUTIVO = false ;
                           A554CANTIDAD = (short)(localUtil.ctol( httpContext.cgiGet( edtCANTIDAD_Internalname), ",", ".")) ;
                           n554CANTIDAD = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e17902 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e18902 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cnumtrn Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCNUMTRN"), ",", ".") != AV6cNUMTRN )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cid_salida Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCID_SALIDA"), ",", ".") != AV7cID_SALIDA )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cplacasena Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPLACASENA"), AV8cPLACASENA) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cconsecutivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCONSECUTIVO"), AV9cCONSECUTIVO) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccantidad Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCANTIDAD"), ",", ".") != AV10cCANTIDAD )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e19902 ();
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

   public void we902( )
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

   public void pa902( )
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
      subsflControlProps_642( ) ;
      while ( nGXsfl_64_idx <= nRC_GXsfl_64 )
      {
         sendrow_642( ) ;
         nGXsfl_64_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_64_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_64_idx+1)) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_64_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  long AV6cNUMTRN ,
                                  short AV7cID_SALIDA ,
                                  String AV8cPLACASENA ,
                                  String AV9cCONSECUTIVO ,
                                  short AV10cCANTIDAD )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf902( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NUMTRN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A78NUMTRN), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NUMTRN", GXutil.ltrim( localUtil.ntoc( A78NUMTRN, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ID_SALIDA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A79ID_SALIDA), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ID_SALIDA", GXutil.ltrim( localUtil.ntoc( A79ID_SALIDA, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_PLACASENA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A530PLACASENA, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "PLACASENA", A530PLACASENA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A553CONSECUTIVO, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CONSECUTIVO", A553CONSECUTIVO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CANTIDAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A554CANTIDAD), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CANTIDAD", GXutil.ltrim( localUtil.ntoc( A554CANTIDAD, (byte)(4), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf902( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf902( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(64) ;
      nGXsfl_64_idx = (short)(1) ;
      sGXsfl_64_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_64_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_642( ) ;
      bGXsfl_64_Refreshing = true ;
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
         subsflControlProps_642( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV8cPLACASENA ,
                                              AV9cCONSECUTIVO ,
                                              new Short(AV10cCANTIDAD) ,
                                              A530PLACASENA ,
                                              A553CONSECUTIVO ,
                                              new Short(A554CANTIDAD) ,
                                              new Long(AV6cNUMTRN) ,
                                              new Short(AV7cID_SALIDA) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.LONG,
                                              TypeConstants.SHORT
                                              }
         } ) ;
         lV8cPLACASENA = GXutil.concat( GXutil.rtrim( AV8cPLACASENA), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cPLACASENA", AV8cPLACASENA);
         lV9cCONSECUTIVO = GXutil.concat( GXutil.rtrim( AV9cCONSECUTIVO), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cCONSECUTIVO", AV9cCONSECUTIVO);
         /* Using cursor H00902 */
         pr_default.execute(0, new Object[] {new Long(AV6cNUMTRN), new Short(AV7cID_SALIDA), lV8cPLACASENA, lV9cCONSECUTIVO, new Short(AV10cCANTIDAD), new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_64_idx = (short)(1) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_64_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_642( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A554CANTIDAD = H00902_A554CANTIDAD[0] ;
            n554CANTIDAD = H00902_n554CANTIDAD[0] ;
            A553CONSECUTIVO = H00902_A553CONSECUTIVO[0] ;
            n553CONSECUTIVO = H00902_n553CONSECUTIVO[0] ;
            A530PLACASENA = H00902_A530PLACASENA[0] ;
            n530PLACASENA = H00902_n530PLACASENA[0] ;
            A79ID_SALIDA = H00902_A79ID_SALIDA[0] ;
            A78NUMTRN = H00902_A78NUMTRN[0] ;
            /* Execute user event: Load */
            e18902 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(64) ;
         wb900( ) ;
      }
      bGXsfl_64_Refreshing = true ;
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
                                           AV8cPLACASENA ,
                                           AV9cCONSECUTIVO ,
                                           new Short(AV10cCANTIDAD) ,
                                           A530PLACASENA ,
                                           A553CONSECUTIVO ,
                                           new Short(A554CANTIDAD) ,
                                           new Long(AV6cNUMTRN) ,
                                           new Short(AV7cID_SALIDA) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.LONG,
                                           TypeConstants.SHORT
                                           }
      } ) ;
      lV8cPLACASENA = GXutil.concat( GXutil.rtrim( AV8cPLACASENA), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cPLACASENA", AV8cPLACASENA);
      lV9cCONSECUTIVO = GXutil.concat( GXutil.rtrim( AV9cCONSECUTIVO), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cCONSECUTIVO", AV9cCONSECUTIVO);
      /* Using cursor H00903 */
      pr_default.execute(1, new Object[] {new Long(AV6cNUMTRN), new Short(AV7cID_SALIDA), lV8cPLACASENA, lV9cCONSECUTIVO, new Short(AV10cCANTIDAD)});
      GRID1_nRecordCount = H00903_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNUMTRN, AV7cID_SALIDA, AV8cPLACASENA, AV9cCONSECUTIVO, AV10cCANTIDAD) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNUMTRN, AV7cID_SALIDA, AV8cPLACASENA, AV9cCONSECUTIVO, AV10cCANTIDAD) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNUMTRN, AV7cID_SALIDA, AV8cPLACASENA, AV9cCONSECUTIVO, AV10cCANTIDAD) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNUMTRN, AV7cID_SALIDA, AV8cPLACASENA, AV9cCONSECUTIVO, AV10cCANTIDAD) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNUMTRN, AV7cID_SALIDA, AV8cPLACASENA, AV9cCONSECUTIVO, AV10cCANTIDAD) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup900( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e17902 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCnumtrn_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCnumtrn_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNUMTRN");
            GX_FocusControl = edtavCnumtrn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cNUMTRN = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cNUMTRN", GXutil.ltrim( GXutil.str( AV6cNUMTRN, 11, 0)));
         }
         else
         {
            AV6cNUMTRN = localUtil.ctol( httpContext.cgiGet( edtavCnumtrn_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cNUMTRN", GXutil.ltrim( GXutil.str( AV6cNUMTRN, 11, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCid_salida_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCid_salida_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCID_SALIDA");
            GX_FocusControl = edtavCid_salida_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cID_SALIDA = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cID_SALIDA", GXutil.ltrim( GXutil.str( AV7cID_SALIDA, 4, 0)));
         }
         else
         {
            AV7cID_SALIDA = (short)(localUtil.ctol( httpContext.cgiGet( edtavCid_salida_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cID_SALIDA", GXutil.ltrim( GXutil.str( AV7cID_SALIDA, 4, 0)));
         }
         AV8cPLACASENA = httpContext.cgiGet( edtavCplacasena_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cPLACASENA", AV8cPLACASENA);
         AV9cCONSECUTIVO = httpContext.cgiGet( edtavCconsecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cCONSECUTIVO", AV9cCONSECUTIVO);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcantidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcantidad_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCANTIDAD");
            GX_FocusControl = edtavCcantidad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cCANTIDAD = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCANTIDAD", GXutil.ltrim( GXutil.str( AV10cCANTIDAD, 4, 0)));
         }
         else
         {
            AV10cCANTIDAD = (short)(localUtil.ctol( httpContext.cgiGet( edtavCcantidad_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCANTIDAD", GXutil.ltrim( GXutil.str( AV10cCANTIDAD, 4, 0)));
         }
         /* Read saved values. */
         nRC_GXsfl_64 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_64"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCNUMTRN"), ",", ".") != AV6cNUMTRN )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCID_SALIDA"), ",", ".") != AV7cID_SALIDA )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCPLACASENA"), AV8cPLACASENA) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCONSECUTIVO"), AV9cCONSECUTIVO) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCANTIDAD"), ",", ".") != AV10cCANTIDAD )
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
      e17902 ();
      if (returnInSub) return;
   }

   public void e17902( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "MAS_CARGUE_SALIDAS", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV13ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e18902( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV16Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_642( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_64_Refreshing )
      {
         httpContext.doAjaxLoad(64, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e19902 ();
      if (returnInSub) return;
   }

   public void e19902( )
   {
      /* Enter Routine */
      AV11pNUMTRN = A78NUMTRN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pNUMTRN", GXutil.ltrim( GXutil.str( AV11pNUMTRN, 11, 0)));
      AV12pID_SALIDA = A79ID_SALIDA ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pID_SALIDA", GXutil.ltrim( GXutil.str( AV12pID_SALIDA, 4, 0)));
      httpContext.setWebReturnParms(new Object[] {new Long(AV11pNUMTRN),new Short(AV12pID_SALIDA)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV11pNUMTRN = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pNUMTRN", GXutil.ltrim( GXutil.str( AV11pNUMTRN, 11, 0)));
      AV12pID_SALIDA = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12pID_SALIDA", GXutil.ltrim( GXutil.str( AV12pID_SALIDA, 4, 0)));
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
      pa902( ) ;
      ws902( ) ;
      we902( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414245748");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx01b0.js", "?201861414245748");
      /* End function include_jscripts */
   }

   public void subsflControlProps_642( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_64_idx ;
      edtNUMTRN_Internalname = "NUMTRN_"+sGXsfl_64_idx ;
      edtID_SALIDA_Internalname = "ID_SALIDA_"+sGXsfl_64_idx ;
      edtPLACASENA_Internalname = "PLACASENA_"+sGXsfl_64_idx ;
      edtCONSECUTIVO_Internalname = "CONSECUTIVO_"+sGXsfl_64_idx ;
      edtCANTIDAD_Internalname = "CANTIDAD_"+sGXsfl_64_idx ;
   }

   public void subsflControlProps_fel_642( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_64_fel_idx ;
      edtNUMTRN_Internalname = "NUMTRN_"+sGXsfl_64_fel_idx ;
      edtID_SALIDA_Internalname = "ID_SALIDA_"+sGXsfl_64_fel_idx ;
      edtPLACASENA_Internalname = "PLACASENA_"+sGXsfl_64_fel_idx ;
      edtCONSECUTIVO_Internalname = "CONSECUTIVO_"+sGXsfl_64_fel_idx ;
      edtCANTIDAD_Internalname = "CANTIDAD_"+sGXsfl_64_fel_idx ;
   }

   public void sendrow_642( )
   {
      subsflControlProps_642( ) ;
      wb900( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_64_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_64_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_64_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A78NUMTRN, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A79ID_SALIDA, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_64_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV16Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV16Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNUMTRN_Internalname,GXutil.ltrim( localUtil.ntoc( A78NUMTRN, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A78NUMTRN), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNUMTRN_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtID_SALIDA_Internalname,GXutil.ltrim( localUtil.ntoc( A79ID_SALIDA, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A79ID_SALIDA), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtID_SALIDA_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtPLACASENA_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A78NUMTRN, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A79ID_SALIDA, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtPLACASENA_Internalname, "Link", edtPLACASENA_Link, !bGXsfl_64_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPLACASENA_Internalname,A530PLACASENA,"","","'"+""+"'"+",false,"+"'"+""+"'",edtPLACASENA_Link,"","","",edtPLACASENA_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Placa","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCONSECUTIVO_Internalname,A553CONSECUTIVO,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCONSECUTIVO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCANTIDAD_Internalname,GXutil.ltrim( localUtil.ntoc( A554CANTIDAD, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A554CANTIDAD), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCANTIDAD_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(64),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NUMTRN"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, localUtil.format( DecimalUtil.doubleToDec(A78NUMTRN), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ID_SALIDA"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, localUtil.format( DecimalUtil.doubleToDec(A79ID_SALIDA), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_PLACASENA"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, GXutil.rtrim( localUtil.format( A530PLACASENA, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CONSECUTIVO"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, GXutil.rtrim( localUtil.format( A553CONSECUTIVO, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CANTIDAD"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, localUtil.format( DecimalUtil.doubleToDec(A554CANTIDAD), "ZZZ9")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_64_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_64_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_64_idx+1)) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_64_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      /* End function sendrow_642 */
   }

   public void init_default_properties( )
   {
      lblLblnumtrnfilter_Internalname = "LBLNUMTRNFILTER" ;
      edtavCnumtrn_Internalname = "vCNUMTRN" ;
      divNumtrnfiltercontainer_Internalname = "NUMTRNFILTERCONTAINER" ;
      lblLblid_salidafilter_Internalname = "LBLID_SALIDAFILTER" ;
      edtavCid_salida_Internalname = "vCID_SALIDA" ;
      divId_salidafiltercontainer_Internalname = "ID_SALIDAFILTERCONTAINER" ;
      lblLblplacasenafilter_Internalname = "LBLPLACASENAFILTER" ;
      edtavCplacasena_Internalname = "vCPLACASENA" ;
      divPlacasenafiltercontainer_Internalname = "PLACASENAFILTERCONTAINER" ;
      lblLblconsecutivofilter_Internalname = "LBLCONSECUTIVOFILTER" ;
      edtavCconsecutivo_Internalname = "vCCONSECUTIVO" ;
      divConsecutivofiltercontainer_Internalname = "CONSECUTIVOFILTERCONTAINER" ;
      lblLblcantidadfilter_Internalname = "LBLCANTIDADFILTER" ;
      edtavCcantidad_Internalname = "vCCANTIDAD" ;
      divCantidadfiltercontainer_Internalname = "CANTIDADFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtNUMTRN_Internalname = "NUMTRN" ;
      edtID_SALIDA_Internalname = "ID_SALIDA" ;
      edtPLACASENA_Internalname = "PLACASENA" ;
      edtCONSECUTIVO_Internalname = "CONSECUTIVO" ;
      edtCANTIDAD_Internalname = "CANTIDAD" ;
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
      edtCANTIDAD_Jsonclick = "" ;
      edtCONSECUTIVO_Jsonclick = "" ;
      edtPLACASENA_Jsonclick = "" ;
      edtID_SALIDA_Jsonclick = "" ;
      edtNUMTRN_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtPLACASENA_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCcantidad_Jsonclick = "" ;
      edtavCcantidad_Enabled = 1 ;
      edtavCcantidad_Visible = 1 ;
      edtavCconsecutivo_Jsonclick = "" ;
      edtavCconsecutivo_Enabled = 1 ;
      edtavCconsecutivo_Visible = 1 ;
      edtavCplacasena_Jsonclick = "" ;
      edtavCplacasena_Enabled = 1 ;
      edtavCplacasena_Visible = 1 ;
      edtavCid_salida_Jsonclick = "" ;
      edtavCid_salida_Enabled = 1 ;
      edtavCid_salida_Visible = 1 ;
      edtavCnumtrn_Jsonclick = "" ;
      edtavCnumtrn_Enabled = 1 ;
      edtavCnumtrn_Visible = 1 ;
      divCantidadfiltercontainer_Class = "AdvancedContainerItem" ;
      divConsecutivofiltercontainer_Class = "AdvancedContainerItem" ;
      divPlacasenafiltercontainer_Class = "AdvancedContainerItem" ;
      divId_salidafiltercontainer_Class = "AdvancedContainerItem" ;
      divNumtrnfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List MAS_CARGUE_SALIDAS" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cNUMTRN',fld:'vCNUMTRN',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cID_SALIDA',fld:'vCID_SALIDA',pic:'ZZZ9',nv:0},{av:'AV8cPLACASENA',fld:'vCPLACASENA',pic:'',nv:''},{av:'AV9cCONSECUTIVO',fld:'vCCONSECUTIVO',pic:'',nv:''},{av:'AV10cCANTIDAD',fld:'vCCANTIDAD',pic:'ZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e16901',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLNUMTRNFILTER.CLICK","{handler:'e11901',iparms:[{av:'divNumtrnfiltercontainer_Class',ctrl:'NUMTRNFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divNumtrnfiltercontainer_Class',ctrl:'NUMTRNFILTERCONTAINER',prop:'Class'},{av:'edtavCnumtrn_Visible',ctrl:'vCNUMTRN',prop:'Visible'}]}");
      setEventMetadata("LBLID_SALIDAFILTER.CLICK","{handler:'e12901',iparms:[{av:'divId_salidafiltercontainer_Class',ctrl:'ID_SALIDAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divId_salidafiltercontainer_Class',ctrl:'ID_SALIDAFILTERCONTAINER',prop:'Class'},{av:'edtavCid_salida_Visible',ctrl:'vCID_SALIDA',prop:'Visible'}]}");
      setEventMetadata("LBLPLACASENAFILTER.CLICK","{handler:'e13901',iparms:[{av:'divPlacasenafiltercontainer_Class',ctrl:'PLACASENAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divPlacasenafiltercontainer_Class',ctrl:'PLACASENAFILTERCONTAINER',prop:'Class'},{av:'edtavCplacasena_Visible',ctrl:'vCPLACASENA',prop:'Visible'}]}");
      setEventMetadata("LBLCONSECUTIVOFILTER.CLICK","{handler:'e14901',iparms:[{av:'divConsecutivofiltercontainer_Class',ctrl:'CONSECUTIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divConsecutivofiltercontainer_Class',ctrl:'CONSECUTIVOFILTERCONTAINER',prop:'Class'},{av:'edtavCconsecutivo_Visible',ctrl:'vCCONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLCANTIDADFILTER.CLICK","{handler:'e15901',iparms:[{av:'divCantidadfiltercontainer_Class',ctrl:'CANTIDADFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCantidadfiltercontainer_Class',ctrl:'CANTIDADFILTERCONTAINER',prop:'Class'},{av:'edtavCcantidad_Visible',ctrl:'vCCANTIDAD',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e19902',iparms:[{av:'A78NUMTRN',fld:'NUMTRN',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A79ID_SALIDA',fld:'ID_SALIDA',pic:'ZZZ9',hsh:true,nv:0}],oparms:[{av:'AV11pNUMTRN',fld:'vPNUMTRN',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12pID_SALIDA',fld:'vPID_SALIDA',pic:'ZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cNUMTRN',fld:'vCNUMTRN',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cID_SALIDA',fld:'vCID_SALIDA',pic:'ZZZ9',nv:0},{av:'AV8cPLACASENA',fld:'vCPLACASENA',pic:'',nv:''},{av:'AV9cCONSECUTIVO',fld:'vCCONSECUTIVO',pic:'',nv:''},{av:'AV10cCANTIDAD',fld:'vCCANTIDAD',pic:'ZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cNUMTRN',fld:'vCNUMTRN',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cID_SALIDA',fld:'vCID_SALIDA',pic:'ZZZ9',nv:0},{av:'AV8cPLACASENA',fld:'vCPLACASENA',pic:'',nv:''},{av:'AV9cCONSECUTIVO',fld:'vCCONSECUTIVO',pic:'',nv:''},{av:'AV10cCANTIDAD',fld:'vCCANTIDAD',pic:'ZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cNUMTRN',fld:'vCNUMTRN',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cID_SALIDA',fld:'vCID_SALIDA',pic:'ZZZ9',nv:0},{av:'AV8cPLACASENA',fld:'vCPLACASENA',pic:'',nv:''},{av:'AV9cCONSECUTIVO',fld:'vCCONSECUTIVO',pic:'',nv:''},{av:'AV10cCANTIDAD',fld:'vCCANTIDAD',pic:'ZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cNUMTRN',fld:'vCNUMTRN',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cID_SALIDA',fld:'vCID_SALIDA',pic:'ZZZ9',nv:0},{av:'AV8cPLACASENA',fld:'vCPLACASENA',pic:'',nv:''},{av:'AV9cCONSECUTIVO',fld:'vCCONSECUTIVO',pic:'',nv:''},{av:'AV10cCANTIDAD',fld:'vCCANTIDAD',pic:'ZZZ9',nv:0}],oparms:[]}");
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
      AV8cPLACASENA = "" ;
      AV9cCONSECUTIVO = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblnumtrnfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblid_salidafilter_Jsonclick = "" ;
      lblLblplacasenafilter_Jsonclick = "" ;
      lblLblconsecutivofilter_Jsonclick = "" ;
      lblLblcantidadfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A530PLACASENA = "" ;
      A553CONSECUTIVO = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV16Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV8cPLACASENA = "" ;
      lV9cCONSECUTIVO = "" ;
      H00902_A554CANTIDAD = new short[1] ;
      H00902_n554CANTIDAD = new boolean[] {false} ;
      H00902_A553CONSECUTIVO = new String[] {""} ;
      H00902_n553CONSECUTIVO = new boolean[] {false} ;
      H00902_A530PLACASENA = new String[] {""} ;
      H00902_n530PLACASENA = new boolean[] {false} ;
      H00902_A79ID_SALIDA = new short[1] ;
      H00902_A78NUMTRN = new long[1] ;
      H00903_AGRID1_nRecordCount = new long[1] ;
      AV13ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx01b0__default(),
         new Object[] {
             new Object[] {
            H00902_A554CANTIDAD, H00902_n554CANTIDAD, H00902_A553CONSECUTIVO, H00902_n553CONSECUTIVO, H00902_A530PLACASENA, H00902_n530PLACASENA, H00902_A79ID_SALIDA, H00902_A78NUMTRN
            }
            , new Object[] {
            H00903_AGRID1_nRecordCount
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
   private short nRC_GXsfl_64 ;
   private short nGXsfl_64_idx=1 ;
   private short AV7cID_SALIDA ;
   private short AV10cCANTIDAD ;
   private short AV12pID_SALIDA ;
   private short wbEnd ;
   private short wbStart ;
   private short A79ID_SALIDA ;
   private short A554CANTIDAD ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCnumtrn_Enabled ;
   private int edtavCnumtrn_Visible ;
   private int edtavCid_salida_Enabled ;
   private int edtavCid_salida_Visible ;
   private int edtavCplacasena_Visible ;
   private int edtavCplacasena_Enabled ;
   private int edtavCconsecutivo_Visible ;
   private int edtavCconsecutivo_Enabled ;
   private int edtavCcantidad_Enabled ;
   private int edtavCcantidad_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV6cNUMTRN ;
   private long AV11pNUMTRN ;
   private long GRID1_nFirstRecordOnPage ;
   private long A78NUMTRN ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divNumtrnfiltercontainer_Class ;
   private String divId_salidafiltercontainer_Class ;
   private String divPlacasenafiltercontainer_Class ;
   private String divConsecutivofiltercontainer_Class ;
   private String divCantidadfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_64_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divNumtrnfiltercontainer_Internalname ;
   private String lblLblnumtrnfilter_Internalname ;
   private String lblLblnumtrnfilter_Jsonclick ;
   private String edtavCnumtrn_Internalname ;
   private String TempTags ;
   private String edtavCnumtrn_Jsonclick ;
   private String divId_salidafiltercontainer_Internalname ;
   private String lblLblid_salidafilter_Internalname ;
   private String lblLblid_salidafilter_Jsonclick ;
   private String edtavCid_salida_Internalname ;
   private String edtavCid_salida_Jsonclick ;
   private String divPlacasenafiltercontainer_Internalname ;
   private String lblLblplacasenafilter_Internalname ;
   private String lblLblplacasenafilter_Jsonclick ;
   private String edtavCplacasena_Internalname ;
   private String edtavCplacasena_Jsonclick ;
   private String divConsecutivofiltercontainer_Internalname ;
   private String lblLblconsecutivofilter_Internalname ;
   private String lblLblconsecutivofilter_Jsonclick ;
   private String edtavCconsecutivo_Internalname ;
   private String edtavCconsecutivo_Jsonclick ;
   private String divCantidadfiltercontainer_Internalname ;
   private String lblLblcantidadfilter_Internalname ;
   private String lblLblcantidadfilter_Jsonclick ;
   private String edtavCcantidad_Internalname ;
   private String edtavCcantidad_Jsonclick ;
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
   private String edtPLACASENA_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtNUMTRN_Internalname ;
   private String edtID_SALIDA_Internalname ;
   private String edtPLACASENA_Internalname ;
   private String edtCONSECUTIVO_Internalname ;
   private String edtCANTIDAD_Internalname ;
   private String scmdbuf ;
   private String AV13ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_64_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtNUMTRN_Jsonclick ;
   private String edtID_SALIDA_Jsonclick ;
   private String edtPLACASENA_Jsonclick ;
   private String edtCONSECUTIVO_Jsonclick ;
   private String edtCANTIDAD_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_64_Refreshing=false ;
   private boolean n530PLACASENA ;
   private boolean n553CONSECUTIVO ;
   private boolean n554CANTIDAD ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV8cPLACASENA ;
   private String AV9cCONSECUTIVO ;
   private String A530PLACASENA ;
   private String A553CONSECUTIVO ;
   private String AV16Linkselection_GXI ;
   private String lV8cPLACASENA ;
   private String lV9cCONSECUTIVO ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private short[] H00902_A554CANTIDAD ;
   private boolean[] H00902_n554CANTIDAD ;
   private String[] H00902_A553CONSECUTIVO ;
   private boolean[] H00902_n553CONSECUTIVO ;
   private String[] H00902_A530PLACASENA ;
   private boolean[] H00902_n530PLACASENA ;
   private short[] H00902_A79ID_SALIDA ;
   private long[] H00902_A78NUMTRN ;
   private long[] H00903_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx01b0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00902( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8cPLACASENA ,
                                          String AV9cCONSECUTIVO ,
                                          short AV10cCANTIDAD ,
                                          String A530PLACASENA ,
                                          String A553CONSECUTIVO ,
                                          short A554CANTIDAD ,
                                          long AV6cNUMTRN ,
                                          short AV7cID_SALIDA )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [8] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      String sSelectString ;
      String sFromString ;
      String sOrderString ;
      sSelectString = " /*+ FIRST_ROWS(11) */ CANTIDAD, CONSECUTIVO, PLACASENA, ID_SALIDA, NUMTRN" ;
      sFromString = " FROM MAS_CARGUE_SALIDAS" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (NUMTRN >= ? and ID_SALIDA >= ?)" ;
      if ( ! (GXutil.strcmp("", AV8cPLACASENA)==0) )
      {
         sWhereString = sWhereString + " and (PLACASENA like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cCONSECUTIVO)==0) )
      {
         sWhereString = sWhereString + " and (CONSECUTIVO like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cCANTIDAD) )
      {
         sWhereString = sWhereString + " and (CANTIDAD >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY NUMTRN, ID_SALIDA" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00903( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8cPLACASENA ,
                                          String AV9cCONSECUTIVO ,
                                          short AV10cCANTIDAD ,
                                          String A530PLACASENA ,
                                          String A553CONSECUTIVO ,
                                          short A554CANTIDAD ,
                                          long AV6cNUMTRN ,
                                          short AV7cID_SALIDA )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [5] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM MAS_CARGUE_SALIDAS" ;
      scmdbuf = scmdbuf + " WHERE (NUMTRN >= ? and ID_SALIDA >= ?)" ;
      if ( ! (GXutil.strcmp("", AV8cPLACASENA)==0) )
      {
         sWhereString = sWhereString + " and (PLACASENA like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cCONSECUTIVO)==0) )
      {
         sWhereString = sWhereString + " and (CONSECUTIVO like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cCANTIDAD) )
      {
         sWhereString = sWhereString + " and (CANTIDAD >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
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
                  return conditional_H00902(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).shortValue() );
            case 1 :
                  return conditional_H00903(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00902", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00903", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4) ;
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
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
                  stmt.setLong(sIdx, ((Number) parms[8]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 9);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[6]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 9);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               return;
      }
   }

}

