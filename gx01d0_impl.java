/*
               File: gx01d0_impl
        Description: Selection List  T72
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:59.96
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

public final  class gx01d0_impl extends GXDataArea
{
   public gx01d0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx01d0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx01d0_impl.class ));
   }

   public gx01d0_impl( int remoteHandle ,
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
            AV6cNROTRANSACCION = GXutil.lval( httpContext.GetNextPar( )) ;
            AV7cIDCARMAS = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV8cCONSECUTIVOENTRADA = httpContext.GetNextPar( ) ;
            AV9cCOSTOADQUISICION = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV10cCANTIDADENTRADA = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV11cINDICADORPHI = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV12cVALORFUTURO = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cNROTRANSACCION, AV7cIDCARMAS, AV8cCONSECUTIVOENTRADA, AV9cCOSTOADQUISICION, AV10cCANTIDADENTRADA, AV11cINDICADORPHI, AV12cVALORFUTURO) ;
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
            AV13pNROTRANSACCION = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pNROTRANSACCION", GXutil.ltrim( GXutil.str( AV13pNROTRANSACCION, 11, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14pIDCARMAS = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14pIDCARMAS", GXutil.ltrim( GXutil.str( AV14pIDCARMAS, 4, 0)));
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
      pa912( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start912( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?2018614142504");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx01d0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pNROTRANSACCION,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14pIDCARMAS,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCNROTRANSACCION", GXutil.ltrim( localUtil.ntoc( AV6cNROTRANSACCION, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCIDCARMAS", GXutil.ltrim( localUtil.ntoc( AV7cIDCARMAS, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCONSECUTIVOENTRADA", AV8cCONSECUTIVOENTRADA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCOSTOADQUISICION", GXutil.ltrim( localUtil.ntoc( AV9cCOSTOADQUISICION, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCCANTIDADENTRADA", GXutil.ltrim( localUtil.ntoc( AV10cCANTIDADENTRADA, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINDICADORPHI", GXutil.ltrim( localUtil.ntoc( AV11cINDICADORPHI, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCVALORFUTURO", GXutil.ltrim( localUtil.ntoc( AV12cVALORFUTURO, (byte)(18), (byte)(2), ",", "")));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPNROTRANSACCION", GXutil.ltrim( localUtil.ntoc( AV13pNROTRANSACCION, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPIDCARMAS", GXutil.ltrim( localUtil.ntoc( AV14pIDCARMAS, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NROTRANSACCIONFILTERCONTAINER_Class", GXutil.rtrim( divNrotransaccionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IDCARMASFILTERCONTAINER_Class", GXutil.rtrim( divIdcarmasfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CONSECUTIVOENTRADAFILTERCONTAINER_Class", GXutil.rtrim( divConsecutivoentradafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "COSTOADQUISICIONFILTERCONTAINER_Class", GXutil.rtrim( divCostoadquisicionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CANTIDADENTRADAFILTERCONTAINER_Class", GXutil.rtrim( divCantidadentradafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INDICADORPHIFILTERCONTAINER_Class", GXutil.rtrim( divIndicadorphifiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VALORFUTUROFILTERCONTAINER_Class", GXutil.rtrim( divValorfuturofiltercontainer_Class));
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
         we912( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt912( ) ;
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
      return formatLink("com.orions2.gx01d0") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13pNROTRANSACCION,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14pIDCARMAS,4,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx01D0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List  T72" ;
   }

   public void wb910( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divNrotransaccionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divNrotransaccionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblnrotransaccionfilter_Internalname, "NROTRANSACCION", "", "", lblLblnrotransaccionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11911_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01D0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCnrotransaccion_Internalname, "NROTRANSACCION", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCnrotransaccion_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cNROTRANSACCION, (byte)(11), (byte)(0), ",", "")), ((edtavCnrotransaccion_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cNROTRANSACCION), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cNROTRANSACCION), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCnrotransaccion_Jsonclick, 0, "Attribute", "", "", "", edtavCnrotransaccion_Visible, edtavCnrotransaccion_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01D0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divIdcarmasfiltercontainer_Internalname, 1, 0, "px", 0, "px", divIdcarmasfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblidcarmasfilter_Internalname, "IDCARMAS", "", "", lblLblidcarmasfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12911_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01D0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCidcarmas_Internalname, "IDCARMAS", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCidcarmas_Internalname, GXutil.ltrim( localUtil.ntoc( AV7cIDCARMAS, (byte)(4), (byte)(0), ",", "")), ((edtavCidcarmas_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7cIDCARMAS), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV7cIDCARMAS), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCidcarmas_Jsonclick, 0, "Attribute", "", "", "", edtavCidcarmas_Visible, edtavCidcarmas_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01D0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divConsecutivoentradafiltercontainer_Internalname, 1, 0, "px", 0, "px", divConsecutivoentradafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblconsecutivoentradafilter_Internalname, "CONSECUTIVOENTRADA", "", "", lblLblconsecutivoentradafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13911_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01D0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCconsecutivoentrada_Internalname, "CONSECUTIVOENTRADA", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCconsecutivoentrada_Internalname, AV8cCONSECUTIVOENTRADA, GXutil.rtrim( localUtil.format( AV8cCONSECUTIVOENTRADA, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCconsecutivoentrada_Jsonclick, 0, "Attribute", "", "", "", edtavCconsecutivoentrada_Visible, edtavCconsecutivoentrada_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx01D0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCostoadquisicionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCostoadquisicionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcostoadquisicionfilter_Internalname, "COSTOADQUISICION", "", "", lblLblcostoadquisicionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14911_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01D0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcostoadquisicion_Internalname, "COSTOADQUISICION", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcostoadquisicion_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cCOSTOADQUISICION, (byte)(24), (byte)(2), ",", "")), ((edtavCcostoadquisicion_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV9cCOSTOADQUISICION, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV9cCOSTOADQUISICION, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcostoadquisicion_Jsonclick, 0, "Attribute", "", "", "", edtavCcostoadquisicion_Visible, edtavCcostoadquisicion_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01D0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCantidadentradafiltercontainer_Internalname, 1, 0, "px", 0, "px", divCantidadentradafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcantidadentradafilter_Internalname, "CANTIDADENTRADA", "", "", lblLblcantidadentradafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15911_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01D0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcantidadentrada_Internalname, "CANTIDADENTRADA", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCcantidadentrada_Internalname, GXutil.ltrim( localUtil.ntoc( AV10cCANTIDADENTRADA, (byte)(6), (byte)(0), ",", "")), ((edtavCcantidadentrada_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10cCANTIDADENTRADA), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV10cCANTIDADENTRADA), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcantidadentrada_Jsonclick, 0, "Attribute", "", "", "", edtavCcantidadentrada_Visible, edtavCcantidadentrada_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01D0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divIndicadorphifiltercontainer_Internalname, 1, 0, "px", 0, "px", divIndicadorphifiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblindicadorphifilter_Internalname, "INDICADORPHI", "", "", lblLblindicadorphifilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16911_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01D0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCindicadorphi_Internalname, "INDICADORPHI", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCindicadorphi_Internalname, GXutil.ltrim( localUtil.ntoc( AV11cINDICADORPHI, (byte)(4), (byte)(0), ",", "")), ((edtavCindicadorphi_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11cINDICADORPHI), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV11cINDICADORPHI), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCindicadorphi_Jsonclick, 0, "Attribute", "", "", "", edtavCindicadorphi_Visible, edtavCindicadorphi_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01D0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divValorfuturofiltercontainer_Internalname, 1, 0, "px", 0, "px", divValorfuturofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblvalorfuturofilter_Internalname, "VALORFUTURO", "", "", lblLblvalorfuturofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e17911_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx01D0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCvalorfuturo_Internalname, "VALORFUTURO", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCvalorfuturo_Internalname, GXutil.ltrim( localUtil.ntoc( AV12cVALORFUTURO, (byte)(24), (byte)(2), ",", "")), ((edtavCvalorfuturo_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV12cVALORFUTURO, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV12cVALORFUTURO, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCvalorfuturo_Jsonclick, 0, "Attribute", "", "", "", edtavCvalorfuturo_Visible, edtavCvalorfuturo_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx01D0.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e18911_client"+"'", TempTags, "", 2, "HLP_Gx01D0.htm");
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
            httpContext.writeValue( "NROTRANSACCION") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "IDCARMAS") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "CONSECUTIVOENTRADA") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "COSTOADQUISICION") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "CANTIDADENTRADA") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "INDICADORPHI") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "VALORFUTURO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "TIEMPO") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A83NROTRANSACCION, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A84IDCARMAS, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A537CONSECUTIVOENTRADA);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtCONSECUTIVOENTRADA_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A538COSTOADQUISICION, (byte)(24), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A601CANTIDADENTRADA, (byte)(6), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A686INDICADORPHI, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A645VALORFUTURO, (byte)(24), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A647TIEMPO, (byte)(4), (byte)(0), ".", "")));
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx01D0.htm");
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

   public void start912( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List  T72", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup910( ) ;
   }

   public void ws912( )
   {
      start912( ) ;
      evt912( ) ;
   }

   public void evt912( )
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
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV18Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_84_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A83NROTRANSACCION = localUtil.ctol( httpContext.cgiGet( edtNROTRANSACCION_Internalname), ",", ".") ;
                           A84IDCARMAS = (short)(localUtil.ctol( httpContext.cgiGet( edtIDCARMAS_Internalname), ",", ".")) ;
                           A537CONSECUTIVOENTRADA = httpContext.cgiGet( edtCONSECUTIVOENTRADA_Internalname) ;
                           n537CONSECUTIVOENTRADA = false ;
                           A538COSTOADQUISICION = localUtil.ctond( httpContext.cgiGet( edtCOSTOADQUISICION_Internalname)) ;
                           n538COSTOADQUISICION = false ;
                           A601CANTIDADENTRADA = (int)(localUtil.ctol( httpContext.cgiGet( edtCANTIDADENTRADA_Internalname), ",", ".")) ;
                           n601CANTIDADENTRADA = false ;
                           A686INDICADORPHI = (short)(localUtil.ctol( httpContext.cgiGet( edtINDICADORPHI_Internalname), ",", ".")) ;
                           A645VALORFUTURO = localUtil.ctond( httpContext.cgiGet( edtVALORFUTURO_Internalname)) ;
                           A647TIEMPO = (short)(localUtil.ctol( httpContext.cgiGet( edtTIEMPO_Internalname), ",", ".")) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19912 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e20912 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cnrotransaccion Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCNROTRANSACCION"), ",", ".") != AV6cNROTRANSACCION )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cidcarmas Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCIDCARMAS"), ",", ".") != AV7cIDCARMAS )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cconsecutivoentrada Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCONSECUTIVOENTRADA"), AV8cCONSECUTIVOENTRADA) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccostoadquisicion Changed */
                                    if ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( "GXH_vCCOSTOADQUISICION")), AV9cCOSTOADQUISICION) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ccantidadentrada Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCANTIDADENTRADA"), ",", ".") != AV10cCANTIDADENTRADA )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cindicadorphi Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCINDICADORPHI"), ",", ".") != AV11cINDICADORPHI )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cvalorfuturo Changed */
                                    if ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( "GXH_vCVALORFUTURO")), AV12cVALORFUTURO) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e21912 ();
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

   public void we912( )
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

   public void pa912( )
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
                                  long AV6cNROTRANSACCION ,
                                  short AV7cIDCARMAS ,
                                  String AV8cCONSECUTIVOENTRADA ,
                                  java.math.BigDecimal AV9cCOSTOADQUISICION ,
                                  int AV10cCANTIDADENTRADA ,
                                  short AV11cINDICADORPHI ,
                                  java.math.BigDecimal AV12cVALORFUTURO )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf912( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NROTRANSACCION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A83NROTRANSACCION), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NROTRANSACCION", GXutil.ltrim( localUtil.ntoc( A83NROTRANSACCION, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_IDCARMAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A84IDCARMAS), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IDCARMAS", GXutil.ltrim( localUtil.ntoc( A84IDCARMAS, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CONSECUTIVOENTRADA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A537CONSECUTIVOENTRADA, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CONSECUTIVOENTRADA", A537CONSECUTIVOENTRADA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_COSTOADQUISICION", getSecureSignedToken( "", localUtil.format( A538COSTOADQUISICION, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "COSTOADQUISICION", GXutil.ltrim( localUtil.ntoc( A538COSTOADQUISICION, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CANTIDADENTRADA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A601CANTIDADENTRADA), "ZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CANTIDADENTRADA", GXutil.ltrim( localUtil.ntoc( A601CANTIDADENTRADA, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INDICADORPHI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A686INDICADORPHI), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INDICADORPHI", GXutil.ltrim( localUtil.ntoc( A686INDICADORPHI, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VALORFUTURO", getSecureSignedToken( "", localUtil.format( A645VALORFUTURO, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VALORFUTURO", GXutil.ltrim( localUtil.ntoc( A645VALORFUTURO, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIEMPO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A647TIEMPO), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIEMPO", GXutil.ltrim( localUtil.ntoc( A647TIEMPO, (byte)(4), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf912( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf912( )
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
                                              AV8cCONSECUTIVOENTRADA ,
                                              AV9cCOSTOADQUISICION ,
                                              new Integer(AV10cCANTIDADENTRADA) ,
                                              new Short(AV11cINDICADORPHI) ,
                                              AV12cVALORFUTURO ,
                                              A537CONSECUTIVOENTRADA ,
                                              A538COSTOADQUISICION ,
                                              new Integer(A601CANTIDADENTRADA) ,
                                              new Short(A686INDICADORPHI) ,
                                              A645VALORFUTURO ,
                                              new Long(AV6cNROTRANSACCION) ,
                                              new Short(AV7cIDCARMAS) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.SHORT
                                              }
         } ) ;
         lV8cCONSECUTIVOENTRADA = GXutil.concat( GXutil.rtrim( AV8cCONSECUTIVOENTRADA), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cCONSECUTIVOENTRADA", AV8cCONSECUTIVOENTRADA);
         /* Using cursor H00912 */
         pr_default.execute(0, new Object[] {new Long(AV6cNROTRANSACCION), new Short(AV7cIDCARMAS), lV8cCONSECUTIVOENTRADA, AV9cCOSTOADQUISICION, new Integer(AV10cCANTIDADENTRADA), new Short(AV11cINDICADORPHI), AV12cVALORFUTURO, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A647TIEMPO = H00912_A647TIEMPO[0] ;
            A645VALORFUTURO = H00912_A645VALORFUTURO[0] ;
            A686INDICADORPHI = H00912_A686INDICADORPHI[0] ;
            A601CANTIDADENTRADA = H00912_A601CANTIDADENTRADA[0] ;
            n601CANTIDADENTRADA = H00912_n601CANTIDADENTRADA[0] ;
            A538COSTOADQUISICION = H00912_A538COSTOADQUISICION[0] ;
            n538COSTOADQUISICION = H00912_n538COSTOADQUISICION[0] ;
            A537CONSECUTIVOENTRADA = H00912_A537CONSECUTIVOENTRADA[0] ;
            n537CONSECUTIVOENTRADA = H00912_n537CONSECUTIVOENTRADA[0] ;
            A84IDCARMAS = H00912_A84IDCARMAS[0] ;
            A83NROTRANSACCION = H00912_A83NROTRANSACCION[0] ;
            /* Execute user event: Load */
            e20912 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb910( ) ;
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
                                           AV8cCONSECUTIVOENTRADA ,
                                           AV9cCOSTOADQUISICION ,
                                           new Integer(AV10cCANTIDADENTRADA) ,
                                           new Short(AV11cINDICADORPHI) ,
                                           AV12cVALORFUTURO ,
                                           A537CONSECUTIVOENTRADA ,
                                           A538COSTOADQUISICION ,
                                           new Integer(A601CANTIDADENTRADA) ,
                                           new Short(A686INDICADORPHI) ,
                                           A645VALORFUTURO ,
                                           new Long(AV6cNROTRANSACCION) ,
                                           new Short(AV7cIDCARMAS) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.SHORT
                                           }
      } ) ;
      lV8cCONSECUTIVOENTRADA = GXutil.concat( GXutil.rtrim( AV8cCONSECUTIVOENTRADA), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cCONSECUTIVOENTRADA", AV8cCONSECUTIVOENTRADA);
      /* Using cursor H00913 */
      pr_default.execute(1, new Object[] {new Long(AV6cNROTRANSACCION), new Short(AV7cIDCARMAS), lV8cCONSECUTIVOENTRADA, AV9cCOSTOADQUISICION, new Integer(AV10cCANTIDADENTRADA), new Short(AV11cINDICADORPHI), AV12cVALORFUTURO});
      GRID1_nRecordCount = H00913_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNROTRANSACCION, AV7cIDCARMAS, AV8cCONSECUTIVOENTRADA, AV9cCOSTOADQUISICION, AV10cCANTIDADENTRADA, AV11cINDICADORPHI, AV12cVALORFUTURO) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNROTRANSACCION, AV7cIDCARMAS, AV8cCONSECUTIVOENTRADA, AV9cCOSTOADQUISICION, AV10cCANTIDADENTRADA, AV11cINDICADORPHI, AV12cVALORFUTURO) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNROTRANSACCION, AV7cIDCARMAS, AV8cCONSECUTIVOENTRADA, AV9cCOSTOADQUISICION, AV10cCANTIDADENTRADA, AV11cINDICADORPHI, AV12cVALORFUTURO) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNROTRANSACCION, AV7cIDCARMAS, AV8cCONSECUTIVOENTRADA, AV9cCOSTOADQUISICION, AV10cCANTIDADENTRADA, AV11cINDICADORPHI, AV12cVALORFUTURO) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cNROTRANSACCION, AV7cIDCARMAS, AV8cCONSECUTIVOENTRADA, AV9cCOSTOADQUISICION, AV10cCANTIDADENTRADA, AV11cINDICADORPHI, AV12cVALORFUTURO) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup910( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19912 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCnrotransaccion_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCnrotransaccion_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCNROTRANSACCION");
            GX_FocusControl = edtavCnrotransaccion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cNROTRANSACCION = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cNROTRANSACCION", GXutil.ltrim( GXutil.str( AV6cNROTRANSACCION, 11, 0)));
         }
         else
         {
            AV6cNROTRANSACCION = localUtil.ctol( httpContext.cgiGet( edtavCnrotransaccion_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cNROTRANSACCION", GXutil.ltrim( GXutil.str( AV6cNROTRANSACCION, 11, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCidcarmas_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCidcarmas_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCIDCARMAS");
            GX_FocusControl = edtavCidcarmas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7cIDCARMAS = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cIDCARMAS", GXutil.ltrim( GXutil.str( AV7cIDCARMAS, 4, 0)));
         }
         else
         {
            AV7cIDCARMAS = (short)(localUtil.ctol( httpContext.cgiGet( edtavCidcarmas_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cIDCARMAS", GXutil.ltrim( GXutil.str( AV7cIDCARMAS, 4, 0)));
         }
         AV8cCONSECUTIVOENTRADA = httpContext.cgiGet( edtavCconsecutivoentrada_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cCONSECUTIVOENTRADA", AV8cCONSECUTIVOENTRADA);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCcostoadquisicion_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCcostoadquisicion_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCOSTOADQUISICION");
            GX_FocusControl = edtavCcostoadquisicion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cCOSTOADQUISICION = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cCOSTOADQUISICION", GXutil.ltrim( GXutil.str( AV9cCOSTOADQUISICION, 18, 2)));
         }
         else
         {
            AV9cCOSTOADQUISICION = localUtil.ctond( httpContext.cgiGet( edtavCcostoadquisicion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cCOSTOADQUISICION", GXutil.ltrim( GXutil.str( AV9cCOSTOADQUISICION, 18, 2)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCcantidadentrada_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCcantidadentrada_Internalname), ",", ".") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCANTIDADENTRADA");
            GX_FocusControl = edtavCcantidadentrada_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10cCANTIDADENTRADA = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCANTIDADENTRADA", GXutil.ltrim( GXutil.str( AV10cCANTIDADENTRADA, 6, 0)));
         }
         else
         {
            AV10cCANTIDADENTRADA = (int)(localUtil.ctol( httpContext.cgiGet( edtavCcantidadentrada_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cCANTIDADENTRADA", GXutil.ltrim( GXutil.str( AV10cCANTIDADENTRADA, 6, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCindicadorphi_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCindicadorphi_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCINDICADORPHI");
            GX_FocusControl = edtavCindicadorphi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11cINDICADORPHI = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cINDICADORPHI", GXutil.ltrim( GXutil.str( AV11cINDICADORPHI, 4, 0)));
         }
         else
         {
            AV11cINDICADORPHI = (short)(localUtil.ctol( httpContext.cgiGet( edtavCindicadorphi_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11cINDICADORPHI", GXutil.ltrim( GXutil.str( AV11cINDICADORPHI, 4, 0)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCvalorfuturo_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCvalorfuturo_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCVALORFUTURO");
            GX_FocusControl = edtavCvalorfuturo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12cVALORFUTURO = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cVALORFUTURO", GXutil.ltrim( GXutil.str( AV12cVALORFUTURO, 18, 2)));
         }
         else
         {
            AV12cVALORFUTURO = localUtil.ctond( httpContext.cgiGet( edtavCvalorfuturo_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12cVALORFUTURO", GXutil.ltrim( GXutil.str( AV12cVALORFUTURO, 18, 2)));
         }
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCNROTRANSACCION"), ",", ".") != AV6cNROTRANSACCION )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCIDCARMAS"), ",", ".") != AV7cIDCARMAS )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCCONSECUTIVOENTRADA"), AV8cCONSECUTIVOENTRADA) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( "GXH_vCCOSTOADQUISICION")), AV9cCOSTOADQUISICION) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCCANTIDADENTRADA"), ",", ".") != AV10cCANTIDADENTRADA )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCINDICADORPHI"), ",", ".") != AV11cINDICADORPHI )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( "GXH_vCVALORFUTURO")), AV12cVALORFUTURO) != 0 )
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
      e19912 ();
      if (returnInSub) return;
   }

   public void e19912( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", " T72", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV15ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e20912( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
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
      e21912 ();
      if (returnInSub) return;
   }

   public void e21912( )
   {
      /* Enter Routine */
      AV13pNROTRANSACCION = A83NROTRANSACCION ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pNROTRANSACCION", GXutil.ltrim( GXutil.str( AV13pNROTRANSACCION, 11, 0)));
      AV14pIDCARMAS = A84IDCARMAS ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pIDCARMAS", GXutil.ltrim( GXutil.str( AV14pIDCARMAS, 4, 0)));
      httpContext.setWebReturnParms(new Object[] {new Long(AV13pNROTRANSACCION),new Short(AV14pIDCARMAS)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pNROTRANSACCION = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pNROTRANSACCION", GXutil.ltrim( GXutil.str( AV13pNROTRANSACCION, 11, 0)));
      AV14pIDCARMAS = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pIDCARMAS", GXutil.ltrim( GXutil.str( AV14pIDCARMAS, 4, 0)));
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
      pa912( ) ;
      ws912( ) ;
      we912( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141425143");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx01d0.js", "?20186141425143");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtNROTRANSACCION_Internalname = "NROTRANSACCION_"+sGXsfl_84_idx ;
      edtIDCARMAS_Internalname = "IDCARMAS_"+sGXsfl_84_idx ;
      edtCONSECUTIVOENTRADA_Internalname = "CONSECUTIVOENTRADA_"+sGXsfl_84_idx ;
      edtCOSTOADQUISICION_Internalname = "COSTOADQUISICION_"+sGXsfl_84_idx ;
      edtCANTIDADENTRADA_Internalname = "CANTIDADENTRADA_"+sGXsfl_84_idx ;
      edtINDICADORPHI_Internalname = "INDICADORPHI_"+sGXsfl_84_idx ;
      edtVALORFUTURO_Internalname = "VALORFUTURO_"+sGXsfl_84_idx ;
      edtTIEMPO_Internalname = "TIEMPO_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtNROTRANSACCION_Internalname = "NROTRANSACCION_"+sGXsfl_84_fel_idx ;
      edtIDCARMAS_Internalname = "IDCARMAS_"+sGXsfl_84_fel_idx ;
      edtCONSECUTIVOENTRADA_Internalname = "CONSECUTIVOENTRADA_"+sGXsfl_84_fel_idx ;
      edtCOSTOADQUISICION_Internalname = "COSTOADQUISICION_"+sGXsfl_84_fel_idx ;
      edtCANTIDADENTRADA_Internalname = "CANTIDADENTRADA_"+sGXsfl_84_fel_idx ;
      edtINDICADORPHI_Internalname = "INDICADORPHI_"+sGXsfl_84_fel_idx ;
      edtVALORFUTURO_Internalname = "VALORFUTURO_"+sGXsfl_84_fel_idx ;
      edtTIEMPO_Internalname = "TIEMPO_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb910( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A83NROTRANSACCION, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A84IDCARMAS, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV18Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV18Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNROTRANSACCION_Internalname,GXutil.ltrim( localUtil.ntoc( A83NROTRANSACCION, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A83NROTRANSACCION), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNROTRANSACCION_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIDCARMAS_Internalname,GXutil.ltrim( localUtil.ntoc( A84IDCARMAS, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A84IDCARMAS), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIDCARMAS_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtCONSECUTIVOENTRADA_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A83NROTRANSACCION, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A84IDCARMAS, (byte)(4), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtCONSECUTIVOENTRADA_Internalname, "Link", edtCONSECUTIVOENTRADA_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCONSECUTIVOENTRADA_Internalname,A537CONSECUTIVOENTRADA,"","","'"+""+"'"+",false,"+"'"+""+"'",edtCONSECUTIVOENTRADA_Link,"","","",edtCONSECUTIVOENTRADA_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCOSTOADQUISICION_Internalname,GXutil.ltrim( localUtil.ntoc( A538COSTOADQUISICION, (byte)(24), (byte)(2), ",", "")),localUtil.format( A538COSTOADQUISICION, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCOSTOADQUISICION_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCANTIDADENTRADA_Internalname,GXutil.ltrim( localUtil.ntoc( A601CANTIDADENTRADA, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A601CANTIDADENTRADA), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCANTIDADENTRADA_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtINDICADORPHI_Internalname,GXutil.ltrim( localUtil.ntoc( A686INDICADORPHI, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A686INDICADORPHI), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtINDICADORPHI_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVALORFUTURO_Internalname,GXutil.ltrim( localUtil.ntoc( A645VALORFUTURO, (byte)(24), (byte)(2), ",", "")),localUtil.format( A645VALORFUTURO, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVALORFUTURO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTIEMPO_Internalname,GXutil.ltrim( localUtil.ntoc( A647TIEMPO, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A647TIEMPO), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTIEMPO_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NROTRANSACCION"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A83NROTRANSACCION), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_IDCARMAS"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A84IDCARMAS), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CONSECUTIVOENTRADA"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A537CONSECUTIVOENTRADA, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_COSTOADQUISICION"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( A538COSTOADQUISICION, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CANTIDADENTRADA"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A601CANTIDADENTRADA), "ZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INDICADORPHI"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A686INDICADORPHI), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VALORFUTURO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( A645VALORFUTURO, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIEMPO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A647TIEMPO), "ZZZ9")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_84_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_84_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_84_idx+1)) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
      }
      /* End function sendrow_842 */
   }

   public void init_default_properties( )
   {
      lblLblnrotransaccionfilter_Internalname = "LBLNROTRANSACCIONFILTER" ;
      edtavCnrotransaccion_Internalname = "vCNROTRANSACCION" ;
      divNrotransaccionfiltercontainer_Internalname = "NROTRANSACCIONFILTERCONTAINER" ;
      lblLblidcarmasfilter_Internalname = "LBLIDCARMASFILTER" ;
      edtavCidcarmas_Internalname = "vCIDCARMAS" ;
      divIdcarmasfiltercontainer_Internalname = "IDCARMASFILTERCONTAINER" ;
      lblLblconsecutivoentradafilter_Internalname = "LBLCONSECUTIVOENTRADAFILTER" ;
      edtavCconsecutivoentrada_Internalname = "vCCONSECUTIVOENTRADA" ;
      divConsecutivoentradafiltercontainer_Internalname = "CONSECUTIVOENTRADAFILTERCONTAINER" ;
      lblLblcostoadquisicionfilter_Internalname = "LBLCOSTOADQUISICIONFILTER" ;
      edtavCcostoadquisicion_Internalname = "vCCOSTOADQUISICION" ;
      divCostoadquisicionfiltercontainer_Internalname = "COSTOADQUISICIONFILTERCONTAINER" ;
      lblLblcantidadentradafilter_Internalname = "LBLCANTIDADENTRADAFILTER" ;
      edtavCcantidadentrada_Internalname = "vCCANTIDADENTRADA" ;
      divCantidadentradafiltercontainer_Internalname = "CANTIDADENTRADAFILTERCONTAINER" ;
      lblLblindicadorphifilter_Internalname = "LBLINDICADORPHIFILTER" ;
      edtavCindicadorphi_Internalname = "vCINDICADORPHI" ;
      divIndicadorphifiltercontainer_Internalname = "INDICADORPHIFILTERCONTAINER" ;
      lblLblvalorfuturofilter_Internalname = "LBLVALORFUTUROFILTER" ;
      edtavCvalorfuturo_Internalname = "vCVALORFUTURO" ;
      divValorfuturofiltercontainer_Internalname = "VALORFUTUROFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtNROTRANSACCION_Internalname = "NROTRANSACCION" ;
      edtIDCARMAS_Internalname = "IDCARMAS" ;
      edtCONSECUTIVOENTRADA_Internalname = "CONSECUTIVOENTRADA" ;
      edtCOSTOADQUISICION_Internalname = "COSTOADQUISICION" ;
      edtCANTIDADENTRADA_Internalname = "CANTIDADENTRADA" ;
      edtINDICADORPHI_Internalname = "INDICADORPHI" ;
      edtVALORFUTURO_Internalname = "VALORFUTURO" ;
      edtTIEMPO_Internalname = "TIEMPO" ;
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
      edtTIEMPO_Jsonclick = "" ;
      edtVALORFUTURO_Jsonclick = "" ;
      edtINDICADORPHI_Jsonclick = "" ;
      edtCANTIDADENTRADA_Jsonclick = "" ;
      edtCOSTOADQUISICION_Jsonclick = "" ;
      edtCONSECUTIVOENTRADA_Jsonclick = "" ;
      edtIDCARMAS_Jsonclick = "" ;
      edtNROTRANSACCION_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtCONSECUTIVOENTRADA_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCvalorfuturo_Jsonclick = "" ;
      edtavCvalorfuturo_Enabled = 1 ;
      edtavCvalorfuturo_Visible = 1 ;
      edtavCindicadorphi_Jsonclick = "" ;
      edtavCindicadorphi_Enabled = 1 ;
      edtavCindicadorphi_Visible = 1 ;
      edtavCcantidadentrada_Jsonclick = "" ;
      edtavCcantidadentrada_Enabled = 1 ;
      edtavCcantidadentrada_Visible = 1 ;
      edtavCcostoadquisicion_Jsonclick = "" ;
      edtavCcostoadquisicion_Enabled = 1 ;
      edtavCcostoadquisicion_Visible = 1 ;
      edtavCconsecutivoentrada_Jsonclick = "" ;
      edtavCconsecutivoentrada_Enabled = 1 ;
      edtavCconsecutivoentrada_Visible = 1 ;
      edtavCidcarmas_Jsonclick = "" ;
      edtavCidcarmas_Enabled = 1 ;
      edtavCidcarmas_Visible = 1 ;
      edtavCnrotransaccion_Jsonclick = "" ;
      edtavCnrotransaccion_Enabled = 1 ;
      edtavCnrotransaccion_Visible = 1 ;
      divValorfuturofiltercontainer_Class = "AdvancedContainerItem" ;
      divIndicadorphifiltercontainer_Class = "AdvancedContainerItem" ;
      divCantidadentradafiltercontainer_Class = "AdvancedContainerItem" ;
      divCostoadquisicionfiltercontainer_Class = "AdvancedContainerItem" ;
      divConsecutivoentradafiltercontainer_Class = "AdvancedContainerItem" ;
      divIdcarmasfiltercontainer_Class = "AdvancedContainerItem" ;
      divNrotransaccionfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List  T72" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cNROTRANSACCION',fld:'vCNROTRANSACCION',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cIDCARMAS',fld:'vCIDCARMAS',pic:'ZZZ9',nv:0},{av:'AV8cCONSECUTIVOENTRADA',fld:'vCCONSECUTIVOENTRADA',pic:'',nv:''},{av:'AV9cCOSTOADQUISICION',fld:'vCCOSTOADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV10cCANTIDADENTRADA',fld:'vCCANTIDADENTRADA',pic:'ZZZZZ9',nv:0},{av:'AV11cINDICADORPHI',fld:'vCINDICADORPHI',pic:'ZZZ9',nv:0},{av:'AV12cVALORFUTURO',fld:'vCVALORFUTURO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e18911',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLNROTRANSACCIONFILTER.CLICK","{handler:'e11911',iparms:[{av:'divNrotransaccionfiltercontainer_Class',ctrl:'NROTRANSACCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divNrotransaccionfiltercontainer_Class',ctrl:'NROTRANSACCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCnrotransaccion_Visible',ctrl:'vCNROTRANSACCION',prop:'Visible'}]}");
      setEventMetadata("LBLIDCARMASFILTER.CLICK","{handler:'e12911',iparms:[{av:'divIdcarmasfiltercontainer_Class',ctrl:'IDCARMASFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divIdcarmasfiltercontainer_Class',ctrl:'IDCARMASFILTERCONTAINER',prop:'Class'},{av:'edtavCidcarmas_Visible',ctrl:'vCIDCARMAS',prop:'Visible'}]}");
      setEventMetadata("LBLCONSECUTIVOENTRADAFILTER.CLICK","{handler:'e13911',iparms:[{av:'divConsecutivoentradafiltercontainer_Class',ctrl:'CONSECUTIVOENTRADAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divConsecutivoentradafiltercontainer_Class',ctrl:'CONSECUTIVOENTRADAFILTERCONTAINER',prop:'Class'},{av:'edtavCconsecutivoentrada_Visible',ctrl:'vCCONSECUTIVOENTRADA',prop:'Visible'}]}");
      setEventMetadata("LBLCOSTOADQUISICIONFILTER.CLICK","{handler:'e14911',iparms:[{av:'divCostoadquisicionfiltercontainer_Class',ctrl:'COSTOADQUISICIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCostoadquisicionfiltercontainer_Class',ctrl:'COSTOADQUISICIONFILTERCONTAINER',prop:'Class'},{av:'edtavCcostoadquisicion_Visible',ctrl:'vCCOSTOADQUISICION',prop:'Visible'}]}");
      setEventMetadata("LBLCANTIDADENTRADAFILTER.CLICK","{handler:'e15911',iparms:[{av:'divCantidadentradafiltercontainer_Class',ctrl:'CANTIDADENTRADAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCantidadentradafiltercontainer_Class',ctrl:'CANTIDADENTRADAFILTERCONTAINER',prop:'Class'},{av:'edtavCcantidadentrada_Visible',ctrl:'vCCANTIDADENTRADA',prop:'Visible'}]}");
      setEventMetadata("LBLINDICADORPHIFILTER.CLICK","{handler:'e16911',iparms:[{av:'divIndicadorphifiltercontainer_Class',ctrl:'INDICADORPHIFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divIndicadorphifiltercontainer_Class',ctrl:'INDICADORPHIFILTERCONTAINER',prop:'Class'},{av:'edtavCindicadorphi_Visible',ctrl:'vCINDICADORPHI',prop:'Visible'}]}");
      setEventMetadata("LBLVALORFUTUROFILTER.CLICK","{handler:'e17911',iparms:[{av:'divValorfuturofiltercontainer_Class',ctrl:'VALORFUTUROFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divValorfuturofiltercontainer_Class',ctrl:'VALORFUTUROFILTERCONTAINER',prop:'Class'},{av:'edtavCvalorfuturo_Visible',ctrl:'vCVALORFUTURO',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e21912',iparms:[{av:'A83NROTRANSACCION',fld:'NROTRANSACCION',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A84IDCARMAS',fld:'IDCARMAS',pic:'ZZZ9',hsh:true,nv:0}],oparms:[{av:'AV13pNROTRANSACCION',fld:'vPNROTRANSACCION',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14pIDCARMAS',fld:'vPIDCARMAS',pic:'ZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cNROTRANSACCION',fld:'vCNROTRANSACCION',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cIDCARMAS',fld:'vCIDCARMAS',pic:'ZZZ9',nv:0},{av:'AV8cCONSECUTIVOENTRADA',fld:'vCCONSECUTIVOENTRADA',pic:'',nv:''},{av:'AV9cCOSTOADQUISICION',fld:'vCCOSTOADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV10cCANTIDADENTRADA',fld:'vCCANTIDADENTRADA',pic:'ZZZZZ9',nv:0},{av:'AV11cINDICADORPHI',fld:'vCINDICADORPHI',pic:'ZZZ9',nv:0},{av:'AV12cVALORFUTURO',fld:'vCVALORFUTURO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cNROTRANSACCION',fld:'vCNROTRANSACCION',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cIDCARMAS',fld:'vCIDCARMAS',pic:'ZZZ9',nv:0},{av:'AV8cCONSECUTIVOENTRADA',fld:'vCCONSECUTIVOENTRADA',pic:'',nv:''},{av:'AV9cCOSTOADQUISICION',fld:'vCCOSTOADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV10cCANTIDADENTRADA',fld:'vCCANTIDADENTRADA',pic:'ZZZZZ9',nv:0},{av:'AV11cINDICADORPHI',fld:'vCINDICADORPHI',pic:'ZZZ9',nv:0},{av:'AV12cVALORFUTURO',fld:'vCVALORFUTURO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cNROTRANSACCION',fld:'vCNROTRANSACCION',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cIDCARMAS',fld:'vCIDCARMAS',pic:'ZZZ9',nv:0},{av:'AV8cCONSECUTIVOENTRADA',fld:'vCCONSECUTIVOENTRADA',pic:'',nv:''},{av:'AV9cCOSTOADQUISICION',fld:'vCCOSTOADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV10cCANTIDADENTRADA',fld:'vCCANTIDADENTRADA',pic:'ZZZZZ9',nv:0},{av:'AV11cINDICADORPHI',fld:'vCINDICADORPHI',pic:'ZZZ9',nv:0},{av:'AV12cVALORFUTURO',fld:'vCVALORFUTURO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cNROTRANSACCION',fld:'vCNROTRANSACCION',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV7cIDCARMAS',fld:'vCIDCARMAS',pic:'ZZZ9',nv:0},{av:'AV8cCONSECUTIVOENTRADA',fld:'vCCONSECUTIVOENTRADA',pic:'',nv:''},{av:'AV9cCOSTOADQUISICION',fld:'vCCOSTOADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV10cCANTIDADENTRADA',fld:'vCCANTIDADENTRADA',pic:'ZZZZZ9',nv:0},{av:'AV11cINDICADORPHI',fld:'vCINDICADORPHI',pic:'ZZZ9',nv:0},{av:'AV12cVALORFUTURO',fld:'vCVALORFUTURO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}],oparms:[]}");
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
      AV8cCONSECUTIVOENTRADA = "" ;
      AV9cCOSTOADQUISICION = DecimalUtil.ZERO ;
      AV12cVALORFUTURO = DecimalUtil.ZERO ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblnrotransaccionfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblidcarmasfilter_Jsonclick = "" ;
      lblLblconsecutivoentradafilter_Jsonclick = "" ;
      lblLblcostoadquisicionfilter_Jsonclick = "" ;
      lblLblcantidadentradafilter_Jsonclick = "" ;
      lblLblindicadorphifilter_Jsonclick = "" ;
      lblLblvalorfuturofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A537CONSECUTIVOENTRADA = "" ;
      A538COSTOADQUISICION = DecimalUtil.ZERO ;
      A645VALORFUTURO = DecimalUtil.ZERO ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Linkselection_GXI = "" ;
      scmdbuf = "" ;
      lV8cCONSECUTIVOENTRADA = "" ;
      H00912_A647TIEMPO = new short[1] ;
      H00912_A645VALORFUTURO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00912_A686INDICADORPHI = new short[1] ;
      H00912_A601CANTIDADENTRADA = new int[1] ;
      H00912_n601CANTIDADENTRADA = new boolean[] {false} ;
      H00912_A538COSTOADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00912_n538COSTOADQUISICION = new boolean[] {false} ;
      H00912_A537CONSECUTIVOENTRADA = new String[] {""} ;
      H00912_n537CONSECUTIVOENTRADA = new boolean[] {false} ;
      H00912_A84IDCARMAS = new short[1] ;
      H00912_A83NROTRANSACCION = new long[1] ;
      H00913_AGRID1_nRecordCount = new long[1] ;
      AV15ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx01d0__default(),
         new Object[] {
             new Object[] {
            H00912_A647TIEMPO, H00912_A645VALORFUTURO, H00912_A686INDICADORPHI, H00912_A601CANTIDADENTRADA, H00912_n601CANTIDADENTRADA, H00912_A538COSTOADQUISICION, H00912_n538COSTOADQUISICION, H00912_A537CONSECUTIVOENTRADA, H00912_n537CONSECUTIVOENTRADA, H00912_A84IDCARMAS,
            H00912_A83NROTRANSACCION
            }
            , new Object[] {
            H00913_AGRID1_nRecordCount
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
   private short AV7cIDCARMAS ;
   private short AV11cINDICADORPHI ;
   private short AV14pIDCARMAS ;
   private short wbEnd ;
   private short wbStart ;
   private short A84IDCARMAS ;
   private short A686INDICADORPHI ;
   private short A647TIEMPO ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int AV10cCANTIDADENTRADA ;
   private int edtavCnrotransaccion_Enabled ;
   private int edtavCnrotransaccion_Visible ;
   private int edtavCidcarmas_Enabled ;
   private int edtavCidcarmas_Visible ;
   private int edtavCconsecutivoentrada_Visible ;
   private int edtavCconsecutivoentrada_Enabled ;
   private int edtavCcostoadquisicion_Enabled ;
   private int edtavCcostoadquisicion_Visible ;
   private int edtavCcantidadentrada_Enabled ;
   private int edtavCcantidadentrada_Visible ;
   private int edtavCindicadorphi_Enabled ;
   private int edtavCindicadorphi_Visible ;
   private int edtavCvalorfuturo_Enabled ;
   private int edtavCvalorfuturo_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int A601CANTIDADENTRADA ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV6cNROTRANSACCION ;
   private long AV13pNROTRANSACCION ;
   private long GRID1_nFirstRecordOnPage ;
   private long A83NROTRANSACCION ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private java.math.BigDecimal AV9cCOSTOADQUISICION ;
   private java.math.BigDecimal AV12cVALORFUTURO ;
   private java.math.BigDecimal A538COSTOADQUISICION ;
   private java.math.BigDecimal A645VALORFUTURO ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divNrotransaccionfiltercontainer_Class ;
   private String divIdcarmasfiltercontainer_Class ;
   private String divConsecutivoentradafiltercontainer_Class ;
   private String divCostoadquisicionfiltercontainer_Class ;
   private String divCantidadentradafiltercontainer_Class ;
   private String divIndicadorphifiltercontainer_Class ;
   private String divValorfuturofiltercontainer_Class ;
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
   private String divNrotransaccionfiltercontainer_Internalname ;
   private String lblLblnrotransaccionfilter_Internalname ;
   private String lblLblnrotransaccionfilter_Jsonclick ;
   private String edtavCnrotransaccion_Internalname ;
   private String TempTags ;
   private String edtavCnrotransaccion_Jsonclick ;
   private String divIdcarmasfiltercontainer_Internalname ;
   private String lblLblidcarmasfilter_Internalname ;
   private String lblLblidcarmasfilter_Jsonclick ;
   private String edtavCidcarmas_Internalname ;
   private String edtavCidcarmas_Jsonclick ;
   private String divConsecutivoentradafiltercontainer_Internalname ;
   private String lblLblconsecutivoentradafilter_Internalname ;
   private String lblLblconsecutivoentradafilter_Jsonclick ;
   private String edtavCconsecutivoentrada_Internalname ;
   private String edtavCconsecutivoentrada_Jsonclick ;
   private String divCostoadquisicionfiltercontainer_Internalname ;
   private String lblLblcostoadquisicionfilter_Internalname ;
   private String lblLblcostoadquisicionfilter_Jsonclick ;
   private String edtavCcostoadquisicion_Internalname ;
   private String edtavCcostoadquisicion_Jsonclick ;
   private String divCantidadentradafiltercontainer_Internalname ;
   private String lblLblcantidadentradafilter_Internalname ;
   private String lblLblcantidadentradafilter_Jsonclick ;
   private String edtavCcantidadentrada_Internalname ;
   private String edtavCcantidadentrada_Jsonclick ;
   private String divIndicadorphifiltercontainer_Internalname ;
   private String lblLblindicadorphifilter_Internalname ;
   private String lblLblindicadorphifilter_Jsonclick ;
   private String edtavCindicadorphi_Internalname ;
   private String edtavCindicadorphi_Jsonclick ;
   private String divValorfuturofiltercontainer_Internalname ;
   private String lblLblvalorfuturofilter_Internalname ;
   private String lblLblvalorfuturofilter_Jsonclick ;
   private String edtavCvalorfuturo_Internalname ;
   private String edtavCvalorfuturo_Jsonclick ;
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
   private String edtCONSECUTIVOENTRADA_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtNROTRANSACCION_Internalname ;
   private String edtIDCARMAS_Internalname ;
   private String edtCONSECUTIVOENTRADA_Internalname ;
   private String edtCOSTOADQUISICION_Internalname ;
   private String edtCANTIDADENTRADA_Internalname ;
   private String edtINDICADORPHI_Internalname ;
   private String edtVALORFUTURO_Internalname ;
   private String edtTIEMPO_Internalname ;
   private String scmdbuf ;
   private String AV15ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtNROTRANSACCION_Jsonclick ;
   private String edtIDCARMAS_Jsonclick ;
   private String edtCONSECUTIVOENTRADA_Jsonclick ;
   private String edtCOSTOADQUISICION_Jsonclick ;
   private String edtCANTIDADENTRADA_Jsonclick ;
   private String edtINDICADORPHI_Jsonclick ;
   private String edtVALORFUTURO_Jsonclick ;
   private String edtTIEMPO_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n537CONSECUTIVOENTRADA ;
   private boolean n538COSTOADQUISICION ;
   private boolean n601CANTIDADENTRADA ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV8cCONSECUTIVOENTRADA ;
   private String A537CONSECUTIVOENTRADA ;
   private String AV18Linkselection_GXI ;
   private String lV8cCONSECUTIVOENTRADA ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private short[] H00912_A647TIEMPO ;
   private java.math.BigDecimal[] H00912_A645VALORFUTURO ;
   private short[] H00912_A686INDICADORPHI ;
   private int[] H00912_A601CANTIDADENTRADA ;
   private boolean[] H00912_n601CANTIDADENTRADA ;
   private java.math.BigDecimal[] H00912_A538COSTOADQUISICION ;
   private boolean[] H00912_n538COSTOADQUISICION ;
   private String[] H00912_A537CONSECUTIVOENTRADA ;
   private boolean[] H00912_n537CONSECUTIVOENTRADA ;
   private short[] H00912_A84IDCARMAS ;
   private long[] H00912_A83NROTRANSACCION ;
   private long[] H00913_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx01d0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00912( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8cCONSECUTIVOENTRADA ,
                                          java.math.BigDecimal AV9cCOSTOADQUISICION ,
                                          int AV10cCANTIDADENTRADA ,
                                          short AV11cINDICADORPHI ,
                                          java.math.BigDecimal AV12cVALORFUTURO ,
                                          String A537CONSECUTIVOENTRADA ,
                                          java.math.BigDecimal A538COSTOADQUISICION ,
                                          int A601CANTIDADENTRADA ,
                                          short A686INDICADORPHI ,
                                          java.math.BigDecimal A645VALORFUTURO ,
                                          long AV6cNROTRANSACCION ,
                                          short AV7cIDCARMAS )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ TIEMPO, VALORFUTURO, INDICADORPHI, CANTIDADENTRADA, COSTOADQUISICION," ;
      sSelectString = sSelectString + " CONSECUTIVOENTRADA, IDCARMAS, NROTRANSACCION" ;
      sFromString = " FROM MAS_CARGUE_ENTRADA" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (NROTRANSACCION >= ? and IDCARMAS >= ?)" ;
      if ( ! (GXutil.strcmp("", AV8cCONSECUTIVOENTRADA)==0) )
      {
         sWhereString = sWhereString + " and (CONSECUTIVOENTRADA like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV9cCOSTOADQUISICION)==0) )
      {
         sWhereString = sWhereString + " and (COSTOADQUISICION >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cCANTIDADENTRADA) )
      {
         sWhereString = sWhereString + " and (CANTIDADENTRADA >= ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cINDICADORPHI) )
      {
         sWhereString = sWhereString + " and (INDICADORPHI >= ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV12cVALORFUTURO)==0) )
      {
         sWhereString = sWhereString + " and (VALORFUTURO >= ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY NROTRANSACCION, IDCARMAS" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H00913( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV8cCONSECUTIVOENTRADA ,
                                          java.math.BigDecimal AV9cCOSTOADQUISICION ,
                                          int AV10cCANTIDADENTRADA ,
                                          short AV11cINDICADORPHI ,
                                          java.math.BigDecimal AV12cVALORFUTURO ,
                                          String A537CONSECUTIVOENTRADA ,
                                          java.math.BigDecimal A538COSTOADQUISICION ,
                                          int A601CANTIDADENTRADA ,
                                          short A686INDICADORPHI ,
                                          java.math.BigDecimal A645VALORFUTURO ,
                                          long AV6cNROTRANSACCION ,
                                          short AV7cIDCARMAS )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM MAS_CARGUE_ENTRADA" ;
      scmdbuf = scmdbuf + " WHERE (NROTRANSACCION >= ? and IDCARMAS >= ?)" ;
      if ( ! (GXutil.strcmp("", AV8cCONSECUTIVOENTRADA)==0) )
      {
         sWhereString = sWhereString + " and (CONSECUTIVOENTRADA like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV9cCOSTOADQUISICION)==0) )
      {
         sWhereString = sWhereString + " and (COSTOADQUISICION >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (0==AV10cCANTIDADENTRADA) )
      {
         sWhereString = sWhereString + " and (CANTIDADENTRADA >= ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (0==AV11cINDICADORPHI) )
      {
         sWhereString = sWhereString + " and (INDICADORPHI >= ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV12cVALORFUTURO)==0) )
      {
         sWhereString = sWhereString + " and (VALORFUTURO >= ?)" ;
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
                  return conditional_H00912(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.math.BigDecimal)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).shortValue() , (java.math.BigDecimal)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , ((Number) dynConstraints[11]).shortValue() );
            case 1 :
                  return conditional_H00913(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.math.BigDecimal)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).shortValue() , (java.math.BigDecimal)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , ((Number) dynConstraints[11]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00912", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00913", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7) ;
               ((long[]) buf[10])[0] = rslt.getLong(8) ;
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
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 9);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
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
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 9);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[13], 2);
               }
               return;
      }
   }

}

