/*
               File: gx00w1_impl
        Description: Selection List Movimiento orígen de los bienes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:46.14
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

public final  class gx00w1_impl extends GXDataArea
{
   public gx00w1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00w1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00w1_impl.class ));
   }

   public gx00w1_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCtpmo_solicitanumero = new HTMLChoice();
      cmbavCtpmo_solicitafecha = new HTMLChoice();
      cmbavCtpmo_estadoorigen = new HTMLChoice();
      cmbTpmo_SolicitaNumero = new HTMLChoice();
      cmbTpmo_SolicitaFecha = new HTMLChoice();
      cmbTpmo_EstadoOrigen = new HTMLChoice();
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
            nRC_GXsfl_54 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_54_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_54_idx = httpContext.GetNextPar( ) ;
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
            AV6cOrig_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
            AV7cTpmo_SolicitaNumero = httpContext.GetNextPar( ) ;
            AV8cTpmo_SolicitaFecha = httpContext.GetNextPar( ) ;
            AV9cTpmo_EstadoOrigen = httpContext.GetNextPar( ) ;
            AV10pTpmo_Codigo = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cOrig_Identificador, AV7cTpmo_SolicitaNumero, AV8cTpmo_SolicitaFecha, AV9cTpmo_EstadoOrigen, AV10pTpmo_Codigo) ;
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
            AV10pTpmo_Codigo = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10pTpmo_Codigo", AV10pTpmo_Codigo);
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPTPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10pTpmo_Codigo, ""))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV11pOrig_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11pOrig_Identificador", GXutil.ltrim( GXutil.str( AV11pOrig_Identificador, 11, 0)));
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
      pa8S2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8S2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414244620");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx00w1") + "?" + GXutil.URLEncode(GXutil.rtrim(AV10pTpmo_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11pOrig_Identificador,11,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCORIG_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( AV6cOrig_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTPMO_SOLICITANUMERO", AV7cTpmo_SolicitaNumero);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTPMO_SOLICITAFECHA", AV8cTpmo_SolicitaFecha);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCTPMO_ESTADOORIGEN", GXutil.rtrim( AV9cTpmo_EstadoOrigen));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_54", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_54, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTPMO_CODIGO", AV10pTpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPORIG_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( AV11pOrig_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPTPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10pTpmo_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPTPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10pTpmo_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ORIG_IDENTIFICADORFILTERCONTAINER_Class", GXutil.rtrim( divOrig_identificadorfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_SOLICITANUMEROFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_solicitanumerofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_SOLICITAFECHAFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_solicitafechafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_ESTADOORIGENFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_estadoorigenfiltercontainer_Class));
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
         we8S2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8S2( ) ;
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
      return formatLink("com.orions2.gx00w1") + "?" + GXutil.URLEncode(GXutil.rtrim(AV10pTpmo_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV11pOrig_Identificador,11,0))) ;
   }

   public String getPgmname( )
   {
      return "Gx00W1" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List Movimiento orígen de los bienes" ;
   }

   public void wb8S0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divOrig_identificadorfiltercontainer_Internalname, 1, 0, "px", 0, "px", divOrig_identificadorfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblorig_identificadorfilter_Internalname, "Identificador Orígen", "", "", lblLblorig_identificadorfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e118s1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00W1.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCorig_identificador_Internalname, "Identificador Orígen", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCorig_identificador_Internalname, GXutil.ltrim( localUtil.ntoc( AV6cOrig_Identificador, (byte)(11), (byte)(0), ",", "")), ((edtavCorig_identificador_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6cOrig_Identificador), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV6cOrig_Identificador), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCorig_identificador_Jsonclick, 0, "Attribute", "", "", "", edtavCorig_identificador_Visible, edtavCorig_identificador_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00W1.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_solicitanumerofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_solicitanumerofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_solicitanumerofilter_Internalname, "Solicita Número", "", "", lblLbltpmo_solicitanumerofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e128s1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00W1.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCtpmo_solicitanumero.getInternalname(), "Solicita Número", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCtpmo_solicitanumero, cmbavCtpmo_solicitanumero.getInternalname(), GXutil.rtrim( AV7cTpmo_SolicitaNumero), 1, cmbavCtpmo_solicitanumero.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavCtpmo_solicitanumero.getVisible(), cmbavCtpmo_solicitanumero.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "", true, "HLP_Gx00W1.htm");
         cmbavCtpmo_solicitanumero.setValue( GXutil.rtrim( AV7cTpmo_SolicitaNumero) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtpmo_solicitanumero.getInternalname(), "Values", cmbavCtpmo_solicitanumero.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_solicitafechafiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_solicitafechafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_solicitafechafilter_Internalname, "Solicita Fecha", "", "", lblLbltpmo_solicitafechafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e138s1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00W1.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCtpmo_solicitafecha.getInternalname(), "Solicita Fecha", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCtpmo_solicitafecha, cmbavCtpmo_solicitafecha.getInternalname(), GXutil.rtrim( AV8cTpmo_SolicitaFecha), 1, cmbavCtpmo_solicitafecha.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavCtpmo_solicitafecha.getVisible(), cmbavCtpmo_solicitafecha.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, "HLP_Gx00W1.htm");
         cmbavCtpmo_solicitafecha.setValue( GXutil.rtrim( AV8cTpmo_SolicitaFecha) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtpmo_solicitafecha.getInternalname(), "Values", cmbavCtpmo_solicitafecha.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_estadoorigenfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_estadoorigenfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_estadoorigenfilter_Internalname, "Estado", "", "", lblLbltpmo_estadoorigenfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e148s1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00W1.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCtpmo_estadoorigen.getInternalname(), "Estado", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_54_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCtpmo_estadoorigen, cmbavCtpmo_estadoorigen.getInternalname(), GXutil.rtrim( AV9cTpmo_EstadoOrigen), 1, cmbavCtpmo_estadoorigen.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavCtpmo_estadoorigen.getVisible(), cmbavCtpmo_estadoorigen.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "", true, "HLP_Gx00W1.htm");
         cmbavCtpmo_estadoorigen.setValue( GXutil.rtrim( AV9cTpmo_EstadoOrigen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCtpmo_estadoorigen.getInternalname(), "Values", cmbavCtpmo_estadoorigen.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e158s1_client"+"'", TempTags, "", 2, "HLP_Gx00W1.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"54\">") ;
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
            httpContext.writeValue( "Identificador Orígen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Solicita número") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "solicita fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cod Tipo Movimiento") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A642Tpmo_SolicitaNumero);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( cmbTpmo_SolicitaNumero.getLink()));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A643Tpmo_SolicitaFecha);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A681Tpmo_EstadoOrigen));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A38Tpmo_Codigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 54 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_54 = (short)(nGXsfl_54_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00W1.htm");
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

   public void start8S2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List Movimiento orígen de los bienes", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8S0( ) ;
   }

   public void ws8S2( )
   {
      start8S2( ) ;
      evt8S2( ) ;
   }

   public void evt8S2( )
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
                           nGXsfl_54_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_542( ) ;
                           AV5LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV15Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV5LinkSelection))), !bGXsfl_54_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV5LinkSelection), true);
                           A41Orig_Identificador = localUtil.ctol( httpContext.cgiGet( edtOrig_Identificador_Internalname), ",", ".") ;
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
                           A38Tpmo_Codigo = httpContext.cgiGet( edtTpmo_Codigo_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e168S2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e178S2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Corig_identificador Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCORIG_IDENTIFICADOR"), ",", ".") != AV6cOrig_Identificador )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctpmo_solicitanumero Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_SOLICITANUMERO"), AV7cTpmo_SolicitaNumero) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctpmo_solicitafecha Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_SOLICITAFECHA"), AV8cTpmo_SolicitaFecha) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ctpmo_estadoorigen Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_ESTADOORIGEN"), AV9cTpmo_EstadoOrigen) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e188S2 ();
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

   public void we8S2( )
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

   public void pa8S2( )
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
         cmbavCtpmo_solicitanumero.setName( "vCTPMO_SOLICITANUMERO" );
         cmbavCtpmo_solicitanumero.setWebtags( "" );
         cmbavCtpmo_solicitanumero.addItem("", "", (short)(0));
         cmbavCtpmo_solicitanumero.addItem("SI", "SI", (short)(0));
         cmbavCtpmo_solicitanumero.addItem("NO", "NO", (short)(0));
         if ( cmbavCtpmo_solicitanumero.getItemCount() > 0 )
         {
            AV7cTpmo_SolicitaNumero = cmbavCtpmo_solicitanumero.getValidValue(AV7cTpmo_SolicitaNumero) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7cTpmo_SolicitaNumero", AV7cTpmo_SolicitaNumero);
         }
         cmbavCtpmo_solicitafecha.setName( "vCTPMO_SOLICITAFECHA" );
         cmbavCtpmo_solicitafecha.setWebtags( "" );
         cmbavCtpmo_solicitafecha.addItem("", "", (short)(0));
         cmbavCtpmo_solicitafecha.addItem("SI", "SI", (short)(0));
         cmbavCtpmo_solicitafecha.addItem("NO", "NO", (short)(0));
         if ( cmbavCtpmo_solicitafecha.getItemCount() > 0 )
         {
            AV8cTpmo_SolicitaFecha = cmbavCtpmo_solicitafecha.getValidValue(AV8cTpmo_SolicitaFecha) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cTpmo_SolicitaFecha", AV8cTpmo_SolicitaFecha);
         }
         cmbavCtpmo_estadoorigen.setName( "vCTPMO_ESTADOORIGEN" );
         cmbavCtpmo_estadoorigen.setWebtags( "" );
         cmbavCtpmo_estadoorigen.addItem("A", "Activo", (short)(0));
         cmbavCtpmo_estadoorigen.addItem("I", "Inactivo", (short)(0));
         if ( cmbavCtpmo_estadoorigen.getItemCount() > 0 )
         {
            AV9cTpmo_EstadoOrigen = cmbavCtpmo_estadoorigen.getValidValue(AV9cTpmo_EstadoOrigen) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cTpmo_EstadoOrigen", AV9cTpmo_EstadoOrigen);
         }
         GXCCtl = "TPMO_SOLICITANUMERO_" + sGXsfl_54_idx ;
         cmbTpmo_SolicitaNumero.setName( GXCCtl );
         cmbTpmo_SolicitaNumero.setWebtags( "" );
         cmbTpmo_SolicitaNumero.addItem("", "", (short)(0));
         cmbTpmo_SolicitaNumero.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaNumero.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaNumero.getItemCount() > 0 )
         {
            A642Tpmo_SolicitaNumero = cmbTpmo_SolicitaNumero.getValidValue(A642Tpmo_SolicitaNumero) ;
         }
         GXCCtl = "TPMO_SOLICITAFECHA_" + sGXsfl_54_idx ;
         cmbTpmo_SolicitaFecha.setName( GXCCtl );
         cmbTpmo_SolicitaFecha.setWebtags( "" );
         cmbTpmo_SolicitaFecha.addItem("", "", (short)(0));
         cmbTpmo_SolicitaFecha.addItem("SI", "SI", (short)(0));
         cmbTpmo_SolicitaFecha.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_SolicitaFecha.getItemCount() > 0 )
         {
            A643Tpmo_SolicitaFecha = cmbTpmo_SolicitaFecha.getValidValue(A643Tpmo_SolicitaFecha) ;
         }
         GXCCtl = "TPMO_ESTADOORIGEN_" + sGXsfl_54_idx ;
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
      subsflControlProps_542( ) ;
      while ( nGXsfl_54_idx <= nRC_GXsfl_54 )
      {
         sendrow_542( ) ;
         nGXsfl_54_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_54_idx+1)) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  long AV6cOrig_Identificador ,
                                  String AV7cTpmo_SolicitaNumero ,
                                  String AV8cTpmo_SolicitaFecha ,
                                  String AV9cTpmo_EstadoOrigen ,
                                  String AV10pTpmo_Codigo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf8S2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ORIG_IDENTIFICADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ORIG_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_SOLICITANUMERO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A642Tpmo_SolicitaNumero, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_SOLICITANUMERO", A642Tpmo_SolicitaNumero);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_SOLICITAFECHA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A643Tpmo_SolicitaFecha, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_SOLICITAFECHA", A643Tpmo_SolicitaFecha);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_ESTADOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A681Tpmo_EstadoOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_ESTADOORIGEN", GXutil.rtrim( A681Tpmo_EstadoOrigen));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A38Tpmo_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_CODIGO", A38Tpmo_Codigo);
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCtpmo_solicitanumero.getItemCount() > 0 )
      {
         AV7cTpmo_SolicitaNumero = cmbavCtpmo_solicitanumero.getValidValue(AV7cTpmo_SolicitaNumero) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTpmo_SolicitaNumero", AV7cTpmo_SolicitaNumero);
      }
      if ( cmbavCtpmo_solicitafecha.getItemCount() > 0 )
      {
         AV8cTpmo_SolicitaFecha = cmbavCtpmo_solicitafecha.getValidValue(AV8cTpmo_SolicitaFecha) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cTpmo_SolicitaFecha", AV8cTpmo_SolicitaFecha);
      }
      if ( cmbavCtpmo_estadoorigen.getItemCount() > 0 )
      {
         AV9cTpmo_EstadoOrigen = cmbavCtpmo_estadoorigen.getValidValue(AV9cTpmo_EstadoOrigen) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cTpmo_EstadoOrigen", AV9cTpmo_EstadoOrigen);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8S2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf8S2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(54) ;
      nGXsfl_54_idx = (short)(1) ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_542( ) ;
      bGXsfl_54_Refreshing = true ;
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
         subsflControlProps_542( ) ;
         GXPagingFrom2 = (int)(((10==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((10==0) ? 10000 : subgrid1_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV7cTpmo_SolicitaNumero ,
                                              AV8cTpmo_SolicitaFecha ,
                                              AV9cTpmo_EstadoOrigen ,
                                              A642Tpmo_SolicitaNumero ,
                                              A643Tpmo_SolicitaFecha ,
                                              A681Tpmo_EstadoOrigen ,
                                              AV10pTpmo_Codigo ,
                                              new Long(AV6cOrig_Identificador) ,
                                              A38Tpmo_Codigo } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING
                                              }
         } ) ;
         lV7cTpmo_SolicitaNumero = GXutil.concat( GXutil.rtrim( AV7cTpmo_SolicitaNumero), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTpmo_SolicitaNumero", AV7cTpmo_SolicitaNumero);
         lV8cTpmo_SolicitaFecha = GXutil.concat( GXutil.rtrim( AV8cTpmo_SolicitaFecha), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cTpmo_SolicitaFecha", AV8cTpmo_SolicitaFecha);
         lV9cTpmo_EstadoOrigen = GXutil.padr( GXutil.rtrim( AV9cTpmo_EstadoOrigen), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cTpmo_EstadoOrigen", AV9cTpmo_EstadoOrigen);
         /* Using cursor H008S2 */
         pr_default.execute(0, new Object[] {AV10pTpmo_Codigo, new Long(AV6cOrig_Identificador), lV7cTpmo_SolicitaNumero, lV8cTpmo_SolicitaFecha, lV9cTpmo_EstadoOrigen, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_54_idx = (short)(1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_542( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A38Tpmo_Codigo = H008S2_A38Tpmo_Codigo[0] ;
            A681Tpmo_EstadoOrigen = H008S2_A681Tpmo_EstadoOrigen[0] ;
            n681Tpmo_EstadoOrigen = H008S2_n681Tpmo_EstadoOrigen[0] ;
            A643Tpmo_SolicitaFecha = H008S2_A643Tpmo_SolicitaFecha[0] ;
            A642Tpmo_SolicitaNumero = H008S2_A642Tpmo_SolicitaNumero[0] ;
            A41Orig_Identificador = H008S2_A41Orig_Identificador[0] ;
            /* Execute user event: Load */
            e178S2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(54) ;
         wb8S0( ) ;
      }
      bGXsfl_54_Refreshing = true ;
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
                                           AV7cTpmo_SolicitaNumero ,
                                           AV8cTpmo_SolicitaFecha ,
                                           AV9cTpmo_EstadoOrigen ,
                                           A642Tpmo_SolicitaNumero ,
                                           A643Tpmo_SolicitaFecha ,
                                           A681Tpmo_EstadoOrigen ,
                                           AV10pTpmo_Codigo ,
                                           new Long(AV6cOrig_Identificador) ,
                                           A38Tpmo_Codigo } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING
                                           }
      } ) ;
      lV7cTpmo_SolicitaNumero = GXutil.concat( GXutil.rtrim( AV7cTpmo_SolicitaNumero), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cTpmo_SolicitaNumero", AV7cTpmo_SolicitaNumero);
      lV8cTpmo_SolicitaFecha = GXutil.concat( GXutil.rtrim( AV8cTpmo_SolicitaFecha), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8cTpmo_SolicitaFecha", AV8cTpmo_SolicitaFecha);
      lV9cTpmo_EstadoOrigen = GXutil.padr( GXutil.rtrim( AV9cTpmo_EstadoOrigen), 1, "%") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9cTpmo_EstadoOrigen", AV9cTpmo_EstadoOrigen);
      /* Using cursor H008S3 */
      pr_default.execute(1, new Object[] {AV10pTpmo_Codigo, new Long(AV6cOrig_Identificador), lV7cTpmo_SolicitaNumero, lV8cTpmo_SolicitaFecha, lV9cTpmo_EstadoOrigen});
      GRID1_nRecordCount = H008S3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cOrig_Identificador, AV7cTpmo_SolicitaNumero, AV8cTpmo_SolicitaFecha, AV9cTpmo_EstadoOrigen, AV10pTpmo_Codigo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cOrig_Identificador, AV7cTpmo_SolicitaNumero, AV8cTpmo_SolicitaFecha, AV9cTpmo_EstadoOrigen, AV10pTpmo_Codigo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cOrig_Identificador, AV7cTpmo_SolicitaNumero, AV8cTpmo_SolicitaFecha, AV9cTpmo_EstadoOrigen, AV10pTpmo_Codigo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cOrig_Identificador, AV7cTpmo_SolicitaNumero, AV8cTpmo_SolicitaFecha, AV9cTpmo_EstadoOrigen, AV10pTpmo_Codigo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cOrig_Identificador, AV7cTpmo_SolicitaNumero, AV8cTpmo_SolicitaFecha, AV9cTpmo_EstadoOrigen, AV10pTpmo_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup8S0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e168S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCorig_identificador_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCorig_identificador_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCORIG_IDENTIFICADOR");
            GX_FocusControl = edtavCorig_identificador_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6cOrig_Identificador = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cOrig_Identificador", GXutil.ltrim( GXutil.str( AV6cOrig_Identificador, 11, 0)));
         }
         else
         {
            AV6cOrig_Identificador = localUtil.ctol( httpContext.cgiGet( edtavCorig_identificador_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6cOrig_Identificador", GXutil.ltrim( GXutil.str( AV6cOrig_Identificador, 11, 0)));
         }
         cmbavCtpmo_solicitanumero.setName( cmbavCtpmo_solicitanumero.getInternalname() );
         cmbavCtpmo_solicitanumero.setValue( httpContext.cgiGet( cmbavCtpmo_solicitanumero.getInternalname()) );
         AV7cTpmo_SolicitaNumero = httpContext.cgiGet( cmbavCtpmo_solicitanumero.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cTpmo_SolicitaNumero", AV7cTpmo_SolicitaNumero);
         cmbavCtpmo_solicitafecha.setName( cmbavCtpmo_solicitafecha.getInternalname() );
         cmbavCtpmo_solicitafecha.setValue( httpContext.cgiGet( cmbavCtpmo_solicitafecha.getInternalname()) );
         AV8cTpmo_SolicitaFecha = httpContext.cgiGet( cmbavCtpmo_solicitafecha.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cTpmo_SolicitaFecha", AV8cTpmo_SolicitaFecha);
         cmbavCtpmo_estadoorigen.setName( cmbavCtpmo_estadoorigen.getInternalname() );
         cmbavCtpmo_estadoorigen.setValue( httpContext.cgiGet( cmbavCtpmo_estadoorigen.getInternalname()) );
         AV9cTpmo_EstadoOrigen = httpContext.cgiGet( cmbavCtpmo_estadoorigen.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9cTpmo_EstadoOrigen", AV9cTpmo_EstadoOrigen);
         /* Read saved values. */
         nRC_GXsfl_54 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_54"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCORIG_IDENTIFICADOR"), ",", ".") != AV6cOrig_Identificador )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_SOLICITANUMERO"), AV7cTpmo_SolicitaNumero) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_SOLICITAFECHA"), AV8cTpmo_SolicitaFecha) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCTPMO_ESTADOORIGEN"), AV9cTpmo_EstadoOrigen) != 0 )
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
      e168S2 ();
      if (returnInSub) return;
   }

   public void e168S2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Movimiento orígen de los bienes", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV12ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e178S2( )
   {
      /* Load Routine */
      AV5LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV15Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      sendrow_542( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_54_Refreshing )
      {
         httpContext.doAjaxLoad(54, Grid1Row);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e188S2 ();
      if (returnInSub) return;
   }

   public void e188S2( )
   {
      /* Enter Routine */
      AV11pOrig_Identificador = A41Orig_Identificador ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pOrig_Identificador", GXutil.ltrim( GXutil.str( AV11pOrig_Identificador, 11, 0)));
      httpContext.setWebReturnParms(new Object[] {new Long(AV11pOrig_Identificador)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV10pTpmo_Codigo = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10pTpmo_Codigo", AV10pTpmo_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vPTPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10pTpmo_Codigo, ""))));
      AV11pOrig_Identificador = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11pOrig_Identificador", GXutil.ltrim( GXutil.str( AV11pOrig_Identificador, 11, 0)));
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
      pa8S2( ) ;
      ws8S2( ) ;
      we8S2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414244698");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx00w1.js", "?201861414244699");
      /* End function include_jscripts */
   }

   public void subsflControlProps_542( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_54_idx ;
      edtOrig_Identificador_Internalname = "ORIG_IDENTIFICADOR_"+sGXsfl_54_idx ;
      cmbTpmo_SolicitaNumero.setInternalname( "TPMO_SOLICITANUMERO_"+sGXsfl_54_idx );
      cmbTpmo_SolicitaFecha.setInternalname( "TPMO_SOLICITAFECHA_"+sGXsfl_54_idx );
      cmbTpmo_EstadoOrigen.setInternalname( "TPMO_ESTADOORIGEN_"+sGXsfl_54_idx );
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO_"+sGXsfl_54_idx ;
   }

   public void subsflControlProps_fel_542( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_54_fel_idx ;
      edtOrig_Identificador_Internalname = "ORIG_IDENTIFICADOR_"+sGXsfl_54_fel_idx ;
      cmbTpmo_SolicitaNumero.setInternalname( "TPMO_SOLICITANUMERO_"+sGXsfl_54_fel_idx );
      cmbTpmo_SolicitaFecha.setInternalname( "TPMO_SOLICITAFECHA_"+sGXsfl_54_fel_idx );
      cmbTpmo_EstadoOrigen.setInternalname( "TPMO_ESTADOORIGEN_"+sGXsfl_54_fel_idx );
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO_"+sGXsfl_54_fel_idx ;
   }

   public void sendrow_542( )
   {
      subsflControlProps_542( ) ;
      wb8S0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_54_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_54_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_54_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_54_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV15Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV15Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrig_Identificador_Internalname,GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrig_Identificador_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_54_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TPMO_SOLICITANUMERO_" + sGXsfl_54_idx ;
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
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_SolicitaNumero,cmbTpmo_SolicitaNumero.getInternalname(),GXutil.rtrim( A642Tpmo_SolicitaNumero),new Integer(1),cmbTpmo_SolicitaNumero.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","DescriptionAttribute","WWColumn","","",new Boolean(true)});
         cmbTpmo_SolicitaNumero.setValue( GXutil.rtrim( A642Tpmo_SolicitaNumero) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_SolicitaNumero.getInternalname(), "Values", cmbTpmo_SolicitaNumero.ToJavascriptSource(), !bGXsfl_54_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_54_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TPMO_SOLICITAFECHA_" + sGXsfl_54_idx ;
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
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_SolicitaFecha,cmbTpmo_SolicitaFecha.getInternalname(),GXutil.rtrim( A643Tpmo_SolicitaFecha),new Integer(1),cmbTpmo_SolicitaFecha.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbTpmo_SolicitaFecha.setValue( GXutil.rtrim( A643Tpmo_SolicitaFecha) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_SolicitaFecha.getInternalname(), "Values", cmbTpmo_SolicitaFecha.ToJavascriptSource(), !bGXsfl_54_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_54_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TPMO_ESTADOORIGEN_" + sGXsfl_54_idx ;
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
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_EstadoOrigen,cmbTpmo_EstadoOrigen.getInternalname(),GXutil.rtrim( A681Tpmo_EstadoOrigen),new Integer(1),cmbTpmo_EstadoOrigen.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbTpmo_EstadoOrigen.setValue( GXutil.rtrim( A681Tpmo_EstadoOrigen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_EstadoOrigen.getInternalname(), "Values", cmbTpmo_EstadoOrigen.ToJavascriptSource(), !bGXsfl_54_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_Codigo_Internalname,A38Tpmo_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(54),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ORIG_IDENTIFICADOR"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, localUtil.format( DecimalUtil.doubleToDec(A41Orig_Identificador), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_SOLICITANUMERO"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A642Tpmo_SolicitaNumero, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_SOLICITAFECHA"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A643Tpmo_SolicitaFecha, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_ESTADOORIGEN"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A681Tpmo_EstadoOrigen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CODIGO"+"_"+sGXsfl_54_idx, getSecureSignedToken( sGXsfl_54_idx, GXutil.rtrim( localUtil.format( A38Tpmo_Codigo, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_54_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_54_idx+1)) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_54_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      /* End function sendrow_542 */
   }

   public void init_default_properties( )
   {
      lblLblorig_identificadorfilter_Internalname = "LBLORIG_IDENTIFICADORFILTER" ;
      edtavCorig_identificador_Internalname = "vCORIG_IDENTIFICADOR" ;
      divOrig_identificadorfiltercontainer_Internalname = "ORIG_IDENTIFICADORFILTERCONTAINER" ;
      lblLbltpmo_solicitanumerofilter_Internalname = "LBLTPMO_SOLICITANUMEROFILTER" ;
      cmbavCtpmo_solicitanumero.setInternalname( "vCTPMO_SOLICITANUMERO" );
      divTpmo_solicitanumerofiltercontainer_Internalname = "TPMO_SOLICITANUMEROFILTERCONTAINER" ;
      lblLbltpmo_solicitafechafilter_Internalname = "LBLTPMO_SOLICITAFECHAFILTER" ;
      cmbavCtpmo_solicitafecha.setInternalname( "vCTPMO_SOLICITAFECHA" );
      divTpmo_solicitafechafiltercontainer_Internalname = "TPMO_SOLICITAFECHAFILTERCONTAINER" ;
      lblLbltpmo_estadoorigenfilter_Internalname = "LBLTPMO_ESTADOORIGENFILTER" ;
      cmbavCtpmo_estadoorigen.setInternalname( "vCTPMO_ESTADOORIGEN" );
      divTpmo_estadoorigenfiltercontainer_Internalname = "TPMO_ESTADOORIGENFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtOrig_Identificador_Internalname = "ORIG_IDENTIFICADOR" ;
      cmbTpmo_SolicitaNumero.setInternalname( "TPMO_SOLICITANUMERO" );
      cmbTpmo_SolicitaFecha.setInternalname( "TPMO_SOLICITAFECHA" );
      cmbTpmo_EstadoOrigen.setInternalname( "TPMO_ESTADOORIGEN" );
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO" ;
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
      edtTpmo_Codigo_Jsonclick = "" ;
      cmbTpmo_EstadoOrigen.setJsonclick( "" );
      cmbTpmo_SolicitaFecha.setJsonclick( "" );
      cmbTpmo_SolicitaNumero.setJsonclick( "" );
      edtOrig_Identificador_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      cmbTpmo_SolicitaNumero.setLink( "" );
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      cmbavCtpmo_estadoorigen.setJsonclick( "" );
      cmbavCtpmo_estadoorigen.setEnabled( 1 );
      cmbavCtpmo_estadoorigen.setVisible( 1 );
      cmbavCtpmo_solicitafecha.setJsonclick( "" );
      cmbavCtpmo_solicitafecha.setEnabled( 1 );
      cmbavCtpmo_solicitafecha.setVisible( 1 );
      cmbavCtpmo_solicitanumero.setJsonclick( "" );
      cmbavCtpmo_solicitanumero.setEnabled( 1 );
      cmbavCtpmo_solicitanumero.setVisible( 1 );
      edtavCorig_identificador_Jsonclick = "" ;
      edtavCorig_identificador_Enabled = 1 ;
      edtavCorig_identificador_Visible = 1 ;
      divTpmo_estadoorigenfiltercontainer_Class = "AdvancedContainerItem" ;
      divTpmo_solicitafechafiltercontainer_Class = "AdvancedContainerItem" ;
      divTpmo_solicitanumerofiltercontainer_Class = "AdvancedContainerItem" ;
      divOrig_identificadorfiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List Movimiento orígen de los bienes" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cOrig_Identificador',fld:'vCORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCtpmo_solicitanumero'},{av:'AV7cTpmo_SolicitaNumero',fld:'vCTPMO_SOLICITANUMERO',pic:'',nv:''},{av:'cmbavCtpmo_solicitafecha'},{av:'AV8cTpmo_SolicitaFecha',fld:'vCTPMO_SOLICITAFECHA',pic:'',nv:''},{av:'cmbavCtpmo_estadoorigen'},{av:'AV9cTpmo_EstadoOrigen',fld:'vCTPMO_ESTADOORIGEN',pic:'',nv:''},{av:'AV10pTpmo_Codigo',fld:'vPTPMO_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e158S1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLORIG_IDENTIFICADORFILTER.CLICK","{handler:'e118S1',iparms:[{av:'divOrig_identificadorfiltercontainer_Class',ctrl:'ORIG_IDENTIFICADORFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divOrig_identificadorfiltercontainer_Class',ctrl:'ORIG_IDENTIFICADORFILTERCONTAINER',prop:'Class'},{av:'edtavCorig_identificador_Visible',ctrl:'vCORIG_IDENTIFICADOR',prop:'Visible'}]}");
      setEventMetadata("LBLTPMO_SOLICITANUMEROFILTER.CLICK","{handler:'e128S1',iparms:[{av:'divTpmo_solicitanumerofiltercontainer_Class',ctrl:'TPMO_SOLICITANUMEROFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_solicitanumerofiltercontainer_Class',ctrl:'TPMO_SOLICITANUMEROFILTERCONTAINER',prop:'Class'},{av:'cmbavCtpmo_solicitanumero'}]}");
      setEventMetadata("LBLTPMO_SOLICITAFECHAFILTER.CLICK","{handler:'e138S1',iparms:[{av:'divTpmo_solicitafechafiltercontainer_Class',ctrl:'TPMO_SOLICITAFECHAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_solicitafechafiltercontainer_Class',ctrl:'TPMO_SOLICITAFECHAFILTERCONTAINER',prop:'Class'},{av:'cmbavCtpmo_solicitafecha'}]}");
      setEventMetadata("LBLTPMO_ESTADOORIGENFILTER.CLICK","{handler:'e148S1',iparms:[{av:'divTpmo_estadoorigenfiltercontainer_Class',ctrl:'TPMO_ESTADOORIGENFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_estadoorigenfiltercontainer_Class',ctrl:'TPMO_ESTADOORIGENFILTERCONTAINER',prop:'Class'},{av:'cmbavCtpmo_estadoorigen'}]}");
      setEventMetadata("ENTER","{handler:'e188S2',iparms:[{av:'A41Orig_Identificador',fld:'ORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'AV11pOrig_Identificador',fld:'vPORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cOrig_Identificador',fld:'vCORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCtpmo_solicitanumero'},{av:'AV7cTpmo_SolicitaNumero',fld:'vCTPMO_SOLICITANUMERO',pic:'',nv:''},{av:'cmbavCtpmo_solicitafecha'},{av:'AV8cTpmo_SolicitaFecha',fld:'vCTPMO_SOLICITAFECHA',pic:'',nv:''},{av:'cmbavCtpmo_estadoorigen'},{av:'AV9cTpmo_EstadoOrigen',fld:'vCTPMO_ESTADOORIGEN',pic:'',nv:''},{av:'AV10pTpmo_Codigo',fld:'vPTPMO_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cOrig_Identificador',fld:'vCORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCtpmo_solicitanumero'},{av:'AV7cTpmo_SolicitaNumero',fld:'vCTPMO_SOLICITANUMERO',pic:'',nv:''},{av:'cmbavCtpmo_solicitafecha'},{av:'AV8cTpmo_SolicitaFecha',fld:'vCTPMO_SOLICITAFECHA',pic:'',nv:''},{av:'cmbavCtpmo_estadoorigen'},{av:'AV9cTpmo_EstadoOrigen',fld:'vCTPMO_ESTADOORIGEN',pic:'',nv:''},{av:'AV10pTpmo_Codigo',fld:'vPTPMO_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cOrig_Identificador',fld:'vCORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCtpmo_solicitanumero'},{av:'AV7cTpmo_SolicitaNumero',fld:'vCTPMO_SOLICITANUMERO',pic:'',nv:''},{av:'cmbavCtpmo_solicitafecha'},{av:'AV8cTpmo_SolicitaFecha',fld:'vCTPMO_SOLICITAFECHA',pic:'',nv:''},{av:'cmbavCtpmo_estadoorigen'},{av:'AV9cTpmo_EstadoOrigen',fld:'vCTPMO_ESTADOORIGEN',pic:'',nv:''},{av:'AV10pTpmo_Codigo',fld:'vPTPMO_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cOrig_Identificador',fld:'vCORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCtpmo_solicitanumero'},{av:'AV7cTpmo_SolicitaNumero',fld:'vCTPMO_SOLICITANUMERO',pic:'',nv:''},{av:'cmbavCtpmo_solicitafecha'},{av:'AV8cTpmo_SolicitaFecha',fld:'vCTPMO_SOLICITAFECHA',pic:'',nv:''},{av:'cmbavCtpmo_estadoorigen'},{av:'AV9cTpmo_EstadoOrigen',fld:'vCTPMO_ESTADOORIGEN',pic:'',nv:''},{av:'AV10pTpmo_Codigo',fld:'vPTPMO_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
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
      wcpOAV10pTpmo_Codigo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7cTpmo_SolicitaNumero = "" ;
      AV8cTpmo_SolicitaFecha = "" ;
      AV9cTpmo_EstadoOrigen = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblorig_identificadorfilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLbltpmo_solicitanumerofilter_Jsonclick = "" ;
      lblLbltpmo_solicitafechafilter_Jsonclick = "" ;
      lblLbltpmo_estadoorigenfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A642Tpmo_SolicitaNumero = "" ;
      A643Tpmo_SolicitaFecha = "" ;
      A681Tpmo_EstadoOrigen = "" ;
      A38Tpmo_Codigo = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV7cTpmo_SolicitaNumero = "" ;
      lV8cTpmo_SolicitaFecha = "" ;
      lV9cTpmo_EstadoOrigen = "" ;
      H008S2_A38Tpmo_Codigo = new String[] {""} ;
      H008S2_A681Tpmo_EstadoOrigen = new String[] {""} ;
      H008S2_n681Tpmo_EstadoOrigen = new boolean[] {false} ;
      H008S2_A643Tpmo_SolicitaFecha = new String[] {""} ;
      H008S2_A642Tpmo_SolicitaNumero = new String[] {""} ;
      H008S2_A41Orig_Identificador = new long[1] ;
      H008S3_AGRID1_nRecordCount = new long[1] ;
      AV12ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx00w1__default(),
         new Object[] {
             new Object[] {
            H008S2_A38Tpmo_Codigo, H008S2_A681Tpmo_EstadoOrigen, H008S2_n681Tpmo_EstadoOrigen, H008S2_A643Tpmo_SolicitaFecha, H008S2_A642Tpmo_SolicitaNumero, H008S2_A41Orig_Identificador
            }
            , new Object[] {
            H008S3_AGRID1_nRecordCount
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
   private short nRC_GXsfl_54 ;
   private short nGXsfl_54_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCorig_identificador_Enabled ;
   private int edtavCorig_identificador_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV6cOrig_Identificador ;
   private long AV11pOrig_Identificador ;
   private long GRID1_nFirstRecordOnPage ;
   private long A41Orig_Identificador ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divOrig_identificadorfiltercontainer_Class ;
   private String divTpmo_solicitanumerofiltercontainer_Class ;
   private String divTpmo_solicitafechafiltercontainer_Class ;
   private String divTpmo_estadoorigenfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_54_idx="0001" ;
   private String AV9cTpmo_EstadoOrigen ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divOrig_identificadorfiltercontainer_Internalname ;
   private String lblLblorig_identificadorfilter_Internalname ;
   private String lblLblorig_identificadorfilter_Jsonclick ;
   private String edtavCorig_identificador_Internalname ;
   private String TempTags ;
   private String edtavCorig_identificador_Jsonclick ;
   private String divTpmo_solicitanumerofiltercontainer_Internalname ;
   private String lblLbltpmo_solicitanumerofilter_Internalname ;
   private String lblLbltpmo_solicitanumerofilter_Jsonclick ;
   private String divTpmo_solicitafechafiltercontainer_Internalname ;
   private String lblLbltpmo_solicitafechafilter_Internalname ;
   private String lblLbltpmo_solicitafechafilter_Jsonclick ;
   private String divTpmo_estadoorigenfiltercontainer_Internalname ;
   private String lblLbltpmo_estadoorigenfilter_Internalname ;
   private String lblLbltpmo_estadoorigenfilter_Jsonclick ;
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
   private String A681Tpmo_EstadoOrigen ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtOrig_Identificador_Internalname ;
   private String edtTpmo_Codigo_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV9cTpmo_EstadoOrigen ;
   private String AV12ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_54_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtOrig_Identificador_Jsonclick ;
   private String edtTpmo_Codigo_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_54_Refreshing=false ;
   private boolean n681Tpmo_EstadoOrigen ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String wcpOAV10pTpmo_Codigo ;
   private String AV7cTpmo_SolicitaNumero ;
   private String AV8cTpmo_SolicitaFecha ;
   private String AV10pTpmo_Codigo ;
   private String A642Tpmo_SolicitaNumero ;
   private String A643Tpmo_SolicitaFecha ;
   private String A38Tpmo_Codigo ;
   private String AV15Linkselection_GXI ;
   private String lV7cTpmo_SolicitaNumero ;
   private String lV8cTpmo_SolicitaFecha ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCtpmo_solicitanumero ;
   private HTMLChoice cmbavCtpmo_solicitafecha ;
   private HTMLChoice cmbavCtpmo_estadoorigen ;
   private HTMLChoice cmbTpmo_SolicitaNumero ;
   private HTMLChoice cmbTpmo_SolicitaFecha ;
   private HTMLChoice cmbTpmo_EstadoOrigen ;
   private IDataStoreProvider pr_default ;
   private String[] H008S2_A38Tpmo_Codigo ;
   private String[] H008S2_A681Tpmo_EstadoOrigen ;
   private boolean[] H008S2_n681Tpmo_EstadoOrigen ;
   private String[] H008S2_A643Tpmo_SolicitaFecha ;
   private String[] H008S2_A642Tpmo_SolicitaNumero ;
   private long[] H008S2_A41Orig_Identificador ;
   private long[] H008S3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00w1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cTpmo_SolicitaNumero ,
                                          String AV8cTpmo_SolicitaFecha ,
                                          String AV9cTpmo_EstadoOrigen ,
                                          String A642Tpmo_SolicitaNumero ,
                                          String A643Tpmo_SolicitaFecha ,
                                          String A681Tpmo_EstadoOrigen ,
                                          String AV10pTpmo_Codigo ,
                                          long AV6cOrig_Identificador ,
                                          String A38Tpmo_Codigo )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ Tpmo_Codigo, Tpmo_EstadoOrigen, Tpmo_SolicitaFecha, Tpmo_SolicitaNumero," ;
      sSelectString = sSelectString + " Orig_Identificador" ;
      sFromString = " FROM ALM_TIPO_MOVIMIENTO_ORIGEN" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Tpmo_Codigo = ? and Orig_Identificador >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cTpmo_SolicitaNumero)==0) )
      {
         sWhereString = sWhereString + " and (Tpmo_SolicitaNumero like ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cTpmo_SolicitaFecha)==0) )
      {
         sWhereString = sWhereString + " and (Tpmo_SolicitaFecha like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cTpmo_EstadoOrigen)==0) )
      {
         sWhereString = sWhereString + " and (Tpmo_EstadoOrigen like ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Tpmo_Codigo, Orig_Identificador" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H008S3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV7cTpmo_SolicitaNumero ,
                                          String AV8cTpmo_SolicitaFecha ,
                                          String AV9cTpmo_EstadoOrigen ,
                                          String A642Tpmo_SolicitaNumero ,
                                          String A643Tpmo_SolicitaFecha ,
                                          String A681Tpmo_EstadoOrigen ,
                                          String AV10pTpmo_Codigo ,
                                          long AV6cOrig_Identificador ,
                                          String A38Tpmo_Codigo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [5] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_TIPO_MOVIMIENTO_ORIGEN" ;
      scmdbuf = scmdbuf + " WHERE (Tpmo_Codigo = ? and Orig_Identificador >= ?)" ;
      if ( ! (GXutil.strcmp("", AV7cTpmo_SolicitaNumero)==0) )
      {
         sWhereString = sWhereString + " and (Tpmo_SolicitaNumero like ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8cTpmo_SolicitaFecha)==0) )
      {
         sWhereString = sWhereString + " and (Tpmo_SolicitaFecha like ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9cTpmo_EstadoOrigen)==0) )
      {
         sWhereString = sWhereString + " and (Tpmo_EstadoOrigen like ?)" ;
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
                  return conditional_H008S2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] );
            case 1 :
                  return conditional_H008S3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008S2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H008S3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
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
                  stmt.setVarchar(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[9]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 1);
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
                  stmt.setVarchar(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[6]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               return;
      }
   }

}

