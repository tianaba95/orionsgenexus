/*
               File: gx00g0_impl
        Description: Selection List INVENTARIO DEVOLUTIVO
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:24:31.40
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

public final  class gx00g0_impl extends GXDataArea
{
   public gx00g0_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public gx00g0_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gx00g0_impl.class ));
   }

   public gx00g0_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCinvd_moduloalmacen = new HTMLChoice();
      cmbInvd_ModuloAlmacen = new HTMLChoice();
      cmbInvd_Estado = new HTMLChoice();
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
            AV6cElem_Consecutivo = httpContext.GetNextPar( ) ;
            AV7cInvd_NumeroPlaca = httpContext.GetNextPar( ) ;
            AV8cInvd_RegionalId = GXutil.lval( httpContext.GetNextPar( )) ;
            AV9cInvd_CentroCostoId = GXutil.lval( httpContext.GetNextPar( )) ;
            AV10cInvd_ModuloAlmacen = httpContext.GetNextPar( ) ;
            AV11cInvd_AlmacenCodigo = httpContext.GetNextPar( ) ;
            AV12cInvd_BodegaCodigo = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV6cElem_Consecutivo, AV7cInvd_NumeroPlaca, AV8cInvd_RegionalId, AV9cInvd_CentroCostoId, AV10cInvd_ModuloAlmacen, AV11cInvd_AlmacenCodigo, AV12cInvd_BodegaCodigo) ;
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
            AV13pElem_Consecutivo = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13pElem_Consecutivo", AV13pElem_Consecutivo);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14pInvd_NumeroPlaca = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14pInvd_NumeroPlaca", AV14pInvd_NumeroPlaca);
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
      pa8K2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8K2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414243148");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.gx00g0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13pElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14pInvd_NumeroPlaca))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCELEM_CONSECUTIVO", AV6cElem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_NUMEROPLACA", AV7cInvd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_REGIONALID", GXutil.ltrim( localUtil.ntoc( AV8cInvd_RegionalId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( AV9cInvd_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_MODULOALMACEN", AV10cInvd_ModuloAlmacen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_ALMACENCODIGO", AV11cInvd_AlmacenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_BODEGACODIGO", AV12cInvd_BodegaCodigo);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_84", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_84, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPELEM_CONSECUTIVO", AV13pElem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPINVD_NUMEROPLACA", AV14pInvd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVOFILTERCONTAINER_Class", GXutil.rtrim( divElem_consecutivofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACAFILTERCONTAINER_Class", GXutil.rtrim( divInvd_numeroplacafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_REGIONALIDFILTERCONTAINER_Class", GXutil.rtrim( divInvd_regionalidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_CENTROCOSTOIDFILTERCONTAINER_Class", GXutil.rtrim( divInvd_centrocostoidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_MODULOALMACENFILTERCONTAINER_Class", GXutil.rtrim( divInvd_moduloalmacenfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ALMACENCODIGOFILTERCONTAINER_Class", GXutil.rtrim( divInvd_almacencodigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_BODEGACODIGOFILTERCONTAINER_Class", GXutil.rtrim( divInvd_bodegacodigofiltercontainer_Class));
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
         we8K2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8K2( ) ;
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
      return formatLink("com.orions2.gx00g0") + "?" + GXutil.URLEncode(GXutil.rtrim(AV13pElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV14pInvd_NumeroPlaca)) ;
   }

   public String getPgmname( )
   {
      return "Gx00G0" ;
   }

   public String getPgmdesc( )
   {
      return "Selection List INVENTARIO DEVOLUTIVO" ;
   }

   public void wb8K0( )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelem_consecutivofilter_Internalname, "Consecutivo", "", "", lblLblelem_consecutivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e118k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00G0.htm");
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
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV6cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV6cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtavCelem_consecutivo_Visible, edtavCelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00G0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_numeroplacafiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_numeroplacafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_numeroplacafilter_Internalname, "Numero de Placa", "", "", lblLblinvd_numeroplacafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e128k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00G0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_numeroplaca_Internalname, "Numero de Placa", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_numeroplaca_Internalname, AV7cInvd_NumeroPlaca, GXutil.rtrim( localUtil.format( AV7cInvd_NumeroPlaca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_numeroplaca_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_numeroplaca_Visible, edtavCinvd_numeroplaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00G0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_regionalidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_regionalidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_regionalidfilter_Internalname, "Id Regional", "", "", lblLblinvd_regionalidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e138k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00G0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_regionalid_Internalname, "Id Regional", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_regionalid_Internalname, GXutil.ltrim( localUtil.ntoc( AV8cInvd_RegionalId, (byte)(11), (byte)(0), ",", "")), ((edtavCinvd_regionalid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8cInvd_RegionalId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8cInvd_RegionalId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_regionalid_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_regionalid_Visible, edtavCinvd_regionalid_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00G0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_centrocostoidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_centrocostoidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_centrocostoidfilter_Internalname, "Id Centro Costo", "", "", lblLblinvd_centrocostoidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e148k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00G0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_centrocostoid_Internalname, "Id Centro Costo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_centrocostoid_Internalname, GXutil.ltrim( localUtil.ntoc( AV9cInvd_CentroCostoId, (byte)(11), (byte)(0), ",", "")), ((edtavCinvd_centrocostoid_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9cInvd_CentroCostoId), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV9cInvd_CentroCostoId), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_centrocostoid_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_centrocostoid_Visible, edtavCinvd_centrocostoid_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_Gx00G0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_moduloalmacenfiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_moduloalmacenfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_moduloalmacenfilter_Internalname, "Modulo Almacen", "", "", lblLblinvd_moduloalmacenfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e158k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00G0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCinvd_moduloalmacen.getInternalname(), "Modulo Almacen", "col-sm-3 AttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCinvd_moduloalmacen, cmbavCinvd_moduloalmacen.getInternalname(), GXutil.rtrim( AV10cInvd_ModuloAlmacen), 1, cmbavCinvd_moduloalmacen.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavCinvd_moduloalmacen.getVisible(), cmbavCinvd_moduloalmacen.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "", true, "HLP_Gx00G0.htm");
         cmbavCinvd_moduloalmacen.setValue( GXutil.rtrim( AV10cInvd_ModuloAlmacen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCinvd_moduloalmacen.getInternalname(), "Values", cmbavCinvd_moduloalmacen.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_almacencodigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_almacencodigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_almacencodigofilter_Internalname, "Codigo Almacén", "", "", lblLblinvd_almacencodigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e168k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00G0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_almacencodigo_Internalname, "Codigo Almacén", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_almacencodigo_Internalname, AV11cInvd_AlmacenCodigo, GXutil.rtrim( localUtil.format( AV11cInvd_AlmacenCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_almacencodigo_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_almacencodigo_Visible, edtavCinvd_almacencodigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00G0.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_bodegacodigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_bodegacodigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_bodegacodigofilter_Internalname, "Codigo Bodega", "", "", lblLblinvd_bodegacodigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e178k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_Gx00G0.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_bodegacodigo_Internalname, "Codigo Bodega", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_84_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_bodegacodigo_Internalname, AV12cInvd_BodegaCodigo, GXutil.rtrim( localUtil.format( AV12cInvd_BodegaCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_bodegacodigo_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_bodegacodigo_Visible, edtavCinvd_bodegacodigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_Gx00G0.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e188k1_client"+"'", TempTags, "", 2, "HLP_Gx00G0.htm");
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "de Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Centro Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacén") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Interes") ;
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
            Grid1Column.AddObjectProperty("Value", A66Elem_Consecutivo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A67Invd_NumeroPlaca);
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtInvd_NumeroPlaca_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A412Invd_ModuloAlmacen);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A413Invd_AlmacenCodigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A414Invd_BodegaCodigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A463Invd_Estado);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ".", "")));
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 84, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Gx00G0.htm");
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

   public void start8K2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selection List INVENTARIO DEVOLUTIVO", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8K0( ) ;
   }

   public void ws8K2( )
   {
      start8K2( ) ;
      evt8K2( ) ;
   }

   public void evt8K2( )
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
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A67Invd_NumeroPlaca = httpContext.cgiGet( edtInvd_NumeroPlaca_Internalname) ;
                           A410Invd_RegionalId = localUtil.ctol( httpContext.cgiGet( edtInvd_RegionalId_Internalname), ",", ".") ;
                           A411Invd_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtInvd_CentroCostoId_Internalname), ",", ".") ;
                           cmbInvd_ModuloAlmacen.setName( cmbInvd_ModuloAlmacen.getInternalname() );
                           cmbInvd_ModuloAlmacen.setValue( httpContext.cgiGet( cmbInvd_ModuloAlmacen.getInternalname()) );
                           A412Invd_ModuloAlmacen = httpContext.cgiGet( cmbInvd_ModuloAlmacen.getInternalname()) ;
                           A413Invd_AlmacenCodigo = httpContext.cgiGet( edtInvd_AlmacenCodigo_Internalname) ;
                           A414Invd_BodegaCodigo = httpContext.cgiGet( edtInvd_BodegaCodigo_Internalname) ;
                           cmbInvd_Estado.setName( cmbInvd_Estado.getInternalname() );
                           cmbInvd_Estado.setValue( httpContext.cgiGet( cmbInvd_Estado.getInternalname()) );
                           A463Invd_Estado = httpContext.cgiGet( cmbInvd_Estado.getInternalname()) ;
                           n463Invd_Estado = false ;
                           A626Variable_I = (short)(localUtil.ctol( httpContext.cgiGet( edtVariable_I_Internalname), ",", ".")) ;
                           n626Variable_I = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e198K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e208K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Celem_consecutivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV6cElem_Consecutivo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvd_numeroplaca Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_NUMEROPLACA"), AV7cInvd_NumeroPlaca) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvd_regionalid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCINVD_REGIONALID"), ",", ".") != AV8cInvd_RegionalId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvd_centrocostoid Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCINVD_CENTROCOSTOID"), ",", ".") != AV9cInvd_CentroCostoId )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvd_moduloalmacen Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_MODULOALMACEN"), AV10cInvd_ModuloAlmacen) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvd_almacencodigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_ALMACENCODIGO"), AV11cInvd_AlmacenCodigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvd_bodegacodigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_BODEGACODIGO"), AV12cInvd_BodegaCodigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e218K2 ();
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

   public void we8K2( )
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

   public void pa8K2( )
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
         cmbavCinvd_moduloalmacen.setName( "vCINVD_MODULOALMACEN" );
         cmbavCinvd_moduloalmacen.setWebtags( "" );
         cmbavCinvd_moduloalmacen.addItem("", "", (short)(0));
         cmbavCinvd_moduloalmacen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbavCinvd_moduloalmacen.addItem("INVE", "INVENTARIO", (short)(0));
         cmbavCinvd_moduloalmacen.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbavCinvd_moduloalmacen.getItemCount() > 0 )
         {
            AV10cInvd_ModuloAlmacen = cmbavCinvd_moduloalmacen.getValidValue(AV10cInvd_ModuloAlmacen) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10cInvd_ModuloAlmacen", AV10cInvd_ModuloAlmacen);
         }
         GXCCtl = "INVD_MODULOALMACEN_" + sGXsfl_84_idx ;
         cmbInvd_ModuloAlmacen.setName( GXCCtl );
         cmbInvd_ModuloAlmacen.setWebtags( "" );
         cmbInvd_ModuloAlmacen.addItem("", "", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("INVE", "INVENTARIO", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbInvd_ModuloAlmacen.getItemCount() > 0 )
         {
            A412Invd_ModuloAlmacen = cmbInvd_ModuloAlmacen.getValidValue(A412Invd_ModuloAlmacen) ;
         }
         GXCCtl = "INVD_ESTADO_" + sGXsfl_84_idx ;
         cmbInvd_Estado.setName( GXCCtl );
         cmbInvd_Estado.setWebtags( "" );
         cmbInvd_Estado.addItem("R", "Ratificado", (short)(0));
         cmbInvd_Estado.addItem("P", "Pendiente", (short)(0));
         if ( cmbInvd_Estado.getItemCount() > 0 )
         {
            A463Invd_Estado = cmbInvd_Estado.getValidValue(A463Invd_Estado) ;
            n463Invd_Estado = false ;
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
                                  String AV6cElem_Consecutivo ,
                                  String AV7cInvd_NumeroPlaca ,
                                  long AV8cInvd_RegionalId ,
                                  long AV9cInvd_CentroCostoId ,
                                  String AV10cInvd_ModuloAlmacen ,
                                  String AV11cInvd_AlmacenCodigo ,
                                  String AV12cInvd_BodegaCodigo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf8K2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_NUMEROPLACA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A67Invd_NumeroPlaca, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACA", A67Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_REGIONALID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_REGIONALID", GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_CENTROCOSTOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_MODULOALMACEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_MODULOALMACEN", A412Invd_ModuloAlmacen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ALMACENCODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ALMACENCODIGO", A413Invd_AlmacenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_BODEGACODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_BODEGACODIGO", A414Invd_BodegaCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ESTADO", A463Invd_Estado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_I", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VARIABLE_I", GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCinvd_moduloalmacen.getItemCount() > 0 )
      {
         AV10cInvd_ModuloAlmacen = cmbavCinvd_moduloalmacen.getValidValue(AV10cInvd_ModuloAlmacen) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cInvd_ModuloAlmacen", AV10cInvd_ModuloAlmacen);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf8K2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf8K2( )
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
                                              new Long(AV8cInvd_RegionalId) ,
                                              new Long(AV9cInvd_CentroCostoId) ,
                                              AV10cInvd_ModuloAlmacen ,
                                              AV11cInvd_AlmacenCodigo ,
                                              AV12cInvd_BodegaCodigo ,
                                              new Long(A410Invd_RegionalId) ,
                                              new Long(A411Invd_CentroCostoId) ,
                                              A412Invd_ModuloAlmacen ,
                                              A413Invd_AlmacenCodigo ,
                                              A414Invd_BodegaCodigo ,
                                              A66Elem_Consecutivo ,
                                              AV6cElem_Consecutivo ,
                                              A67Invd_NumeroPlaca ,
                                              AV7cInvd_NumeroPlaca } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV6cElem_Consecutivo = GXutil.concat( GXutil.rtrim( AV6cElem_Consecutivo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cElem_Consecutivo", AV6cElem_Consecutivo);
         lV7cInvd_NumeroPlaca = GXutil.concat( GXutil.rtrim( AV7cInvd_NumeroPlaca), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cInvd_NumeroPlaca", AV7cInvd_NumeroPlaca);
         lV10cInvd_ModuloAlmacen = GXutil.concat( GXutil.rtrim( AV10cInvd_ModuloAlmacen), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cInvd_ModuloAlmacen", AV10cInvd_ModuloAlmacen);
         lV11cInvd_AlmacenCodigo = GXutil.concat( GXutil.rtrim( AV11cInvd_AlmacenCodigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cInvd_AlmacenCodigo", AV11cInvd_AlmacenCodigo);
         lV12cInvd_BodegaCodigo = GXutil.concat( GXutil.rtrim( AV12cInvd_BodegaCodigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cInvd_BodegaCodigo", AV12cInvd_BodegaCodigo);
         /* Using cursor H008K2 */
         pr_default.execute(0, new Object[] {lV6cElem_Consecutivo, lV7cInvd_NumeroPlaca, new Long(AV8cInvd_RegionalId), new Long(AV9cInvd_CentroCostoId), lV10cInvd_ModuloAlmacen, lV11cInvd_AlmacenCodigo, lV12cInvd_BodegaCodigo, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_84_idx = (short)(1) ;
         sGXsfl_84_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_84_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_842( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < subgrid1_recordsperpage( ) ) ) ) )
         {
            A626Variable_I = H008K2_A626Variable_I[0] ;
            n626Variable_I = H008K2_n626Variable_I[0] ;
            A463Invd_Estado = H008K2_A463Invd_Estado[0] ;
            n463Invd_Estado = H008K2_n463Invd_Estado[0] ;
            A414Invd_BodegaCodigo = H008K2_A414Invd_BodegaCodigo[0] ;
            A413Invd_AlmacenCodigo = H008K2_A413Invd_AlmacenCodigo[0] ;
            A412Invd_ModuloAlmacen = H008K2_A412Invd_ModuloAlmacen[0] ;
            A411Invd_CentroCostoId = H008K2_A411Invd_CentroCostoId[0] ;
            A410Invd_RegionalId = H008K2_A410Invd_RegionalId[0] ;
            A67Invd_NumeroPlaca = H008K2_A67Invd_NumeroPlaca[0] ;
            A66Elem_Consecutivo = H008K2_A66Elem_Consecutivo[0] ;
            /* Execute user event: Load */
            e208K2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(84) ;
         wb8K0( ) ;
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
                                           new Long(AV8cInvd_RegionalId) ,
                                           new Long(AV9cInvd_CentroCostoId) ,
                                           AV10cInvd_ModuloAlmacen ,
                                           AV11cInvd_AlmacenCodigo ,
                                           AV12cInvd_BodegaCodigo ,
                                           new Long(A410Invd_RegionalId) ,
                                           new Long(A411Invd_CentroCostoId) ,
                                           A412Invd_ModuloAlmacen ,
                                           A413Invd_AlmacenCodigo ,
                                           A414Invd_BodegaCodigo ,
                                           A66Elem_Consecutivo ,
                                           AV6cElem_Consecutivo ,
                                           A67Invd_NumeroPlaca ,
                                           AV7cInvd_NumeroPlaca } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV6cElem_Consecutivo = GXutil.concat( GXutil.rtrim( AV6cElem_Consecutivo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6cElem_Consecutivo", AV6cElem_Consecutivo);
      lV7cInvd_NumeroPlaca = GXutil.concat( GXutil.rtrim( AV7cInvd_NumeroPlaca), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7cInvd_NumeroPlaca", AV7cInvd_NumeroPlaca);
      lV10cInvd_ModuloAlmacen = GXutil.concat( GXutil.rtrim( AV10cInvd_ModuloAlmacen), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10cInvd_ModuloAlmacen", AV10cInvd_ModuloAlmacen);
      lV11cInvd_AlmacenCodigo = GXutil.concat( GXutil.rtrim( AV11cInvd_AlmacenCodigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11cInvd_AlmacenCodigo", AV11cInvd_AlmacenCodigo);
      lV12cInvd_BodegaCodigo = GXutil.concat( GXutil.rtrim( AV12cInvd_BodegaCodigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12cInvd_BodegaCodigo", AV12cInvd_BodegaCodigo);
      /* Using cursor H008K3 */
      pr_default.execute(1, new Object[] {lV6cElem_Consecutivo, lV7cInvd_NumeroPlaca, new Long(AV8cInvd_RegionalId), new Long(AV9cInvd_CentroCostoId), lV10cInvd_ModuloAlmacen, lV11cInvd_AlmacenCodigo, lV12cInvd_BodegaCodigo});
      GRID1_nRecordCount = H008K3_AGRID1_nRecordCount[0] ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cElem_Consecutivo, AV7cInvd_NumeroPlaca, AV8cInvd_RegionalId, AV9cInvd_CentroCostoId, AV10cInvd_ModuloAlmacen, AV11cInvd_AlmacenCodigo, AV12cInvd_BodegaCodigo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cElem_Consecutivo, AV7cInvd_NumeroPlaca, AV8cInvd_RegionalId, AV9cInvd_CentroCostoId, AV10cInvd_ModuloAlmacen, AV11cInvd_AlmacenCodigo, AV12cInvd_BodegaCodigo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cElem_Consecutivo, AV7cInvd_NumeroPlaca, AV8cInvd_RegionalId, AV9cInvd_CentroCostoId, AV10cInvd_ModuloAlmacen, AV11cInvd_AlmacenCodigo, AV12cInvd_BodegaCodigo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cElem_Consecutivo, AV7cInvd_NumeroPlaca, AV8cInvd_RegionalId, AV9cInvd_CentroCostoId, AV10cInvd_ModuloAlmacen, AV11cInvd_AlmacenCodigo, AV12cInvd_BodegaCodigo) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV6cElem_Consecutivo, AV7cInvd_NumeroPlaca, AV8cInvd_RegionalId, AV9cInvd_CentroCostoId, AV10cInvd_ModuloAlmacen, AV11cInvd_AlmacenCodigo, AV12cInvd_BodegaCodigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup8K0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e198K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV6cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6cElem_Consecutivo", AV6cElem_Consecutivo);
         AV7cInvd_NumeroPlaca = httpContext.cgiGet( edtavCinvd_numeroplaca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7cInvd_NumeroPlaca", AV7cInvd_NumeroPlaca);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCinvd_regionalid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCinvd_regionalid_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCINVD_REGIONALID");
            GX_FocusControl = edtavCinvd_regionalid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8cInvd_RegionalId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cInvd_RegionalId", GXutil.ltrim( GXutil.str( AV8cInvd_RegionalId, 11, 0)));
         }
         else
         {
            AV8cInvd_RegionalId = localUtil.ctol( httpContext.cgiGet( edtavCinvd_regionalid_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8cInvd_RegionalId", GXutil.ltrim( GXutil.str( AV8cInvd_RegionalId, 11, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCinvd_centrocostoid_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCinvd_centrocostoid_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCINVD_CENTROCOSTOID");
            GX_FocusControl = edtavCinvd_centrocostoid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9cInvd_CentroCostoId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cInvd_CentroCostoId", GXutil.ltrim( GXutil.str( AV9cInvd_CentroCostoId, 11, 0)));
         }
         else
         {
            AV9cInvd_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtavCinvd_centrocostoid_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9cInvd_CentroCostoId", GXutil.ltrim( GXutil.str( AV9cInvd_CentroCostoId, 11, 0)));
         }
         cmbavCinvd_moduloalmacen.setName( cmbavCinvd_moduloalmacen.getInternalname() );
         cmbavCinvd_moduloalmacen.setValue( httpContext.cgiGet( cmbavCinvd_moduloalmacen.getInternalname()) );
         AV10cInvd_ModuloAlmacen = httpContext.cgiGet( cmbavCinvd_moduloalmacen.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10cInvd_ModuloAlmacen", AV10cInvd_ModuloAlmacen);
         AV11cInvd_AlmacenCodigo = httpContext.cgiGet( edtavCinvd_almacencodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11cInvd_AlmacenCodigo", AV11cInvd_AlmacenCodigo);
         AV12cInvd_BodegaCodigo = httpContext.cgiGet( edtavCinvd_bodegacodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cInvd_BodegaCodigo", AV12cInvd_BodegaCodigo);
         /* Read saved values. */
         nRC_GXsfl_84 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_84"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV6cElem_Consecutivo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_NUMEROPLACA"), AV7cInvd_NumeroPlaca) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCINVD_REGIONALID"), ",", ".") != AV8cInvd_RegionalId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCINVD_CENTROCOSTOID"), ",", ".") != AV9cInvd_CentroCostoId )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_MODULOALMACEN"), AV10cInvd_ModuloAlmacen) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_ALMACENCODIGO"), AV11cInvd_AlmacenCodigo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_BODEGACODIGO"), AV12cInvd_BodegaCodigo) != 0 )
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
      e198K2 ();
      if (returnInSub) return;
   }

   public void e198K2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "INVENTARIO DEVOLUTIVO", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV15ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e208K2( )
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
      e218K2 ();
      if (returnInSub) return;
   }

   public void e218K2( )
   {
      /* Enter Routine */
      AV13pElem_Consecutivo = A66Elem_Consecutivo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pElem_Consecutivo", AV13pElem_Consecutivo);
      AV14pInvd_NumeroPlaca = A67Invd_NumeroPlaca ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pInvd_NumeroPlaca", AV14pInvd_NumeroPlaca);
      httpContext.setWebReturnParms(new Object[] {AV13pElem_Consecutivo,AV14pInvd_NumeroPlaca});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV13pElem_Consecutivo = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13pElem_Consecutivo", AV13pElem_Consecutivo);
      AV14pInvd_NumeroPlaca = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14pInvd_NumeroPlaca", AV14pInvd_NumeroPlaca);
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
      pa8K2( ) ;
      ws8K2( ) ;
      we8K2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414243292");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gx00g0.js", "?201861414243292");
      /* End function include_jscripts */
   }

   public void subsflControlProps_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_84_idx ;
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA_"+sGXsfl_84_idx ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID_"+sGXsfl_84_idx ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID_"+sGXsfl_84_idx ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN_"+sGXsfl_84_idx );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO_"+sGXsfl_84_idx ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO_"+sGXsfl_84_idx ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO_"+sGXsfl_84_idx );
      edtVariable_I_Internalname = "VARIABLE_I_"+sGXsfl_84_idx ;
   }

   public void subsflControlProps_fel_842( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_84_fel_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_84_fel_idx ;
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA_"+sGXsfl_84_fel_idx ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID_"+sGXsfl_84_fel_idx ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID_"+sGXsfl_84_fel_idx ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN_"+sGXsfl_84_fel_idx );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO_"+sGXsfl_84_fel_idx ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO_"+sGXsfl_84_fel_idx ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO_"+sGXsfl_84_fel_idx );
      edtVariable_I_Internalname = "VARIABLE_I_"+sGXsfl_84_fel_idx ;
   }

   public void sendrow_842( )
   {
      subsflControlProps_842( ) ;
      wb8K0( ) ;
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
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A66Elem_Consecutivo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A67Invd_NumeroPlaca)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_84_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV5LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV5LinkSelection)==0)&&(GXutil.strcmp("", AV18Linkselection_GXI)==0))||!(GXutil.strcmp("", AV5LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV5LinkSelection)==0) ? AV18Linkselection_GXI : httpContext.getResourceRelative(AV5LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV5LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtInvd_NumeroPlaca_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( A66Elem_Consecutivo)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( A67Invd_NumeroPlaca)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtInvd_NumeroPlaca_Internalname, "Link", edtInvd_NumeroPlaca_Link, !bGXsfl_84_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_NumeroPlaca_Internalname,A67Invd_NumeroPlaca,"","","'"+""+"'"+",false,"+"'"+""+"'",edtInvd_NumeroPlaca_Link,"","","",edtInvd_NumeroPlaca_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_RegionalId_Internalname,GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_RegionalId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_CentroCostoId_Internalname,GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_CentroCostoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "INVD_MODULOALMACEN_" + sGXsfl_84_idx ;
            cmbInvd_ModuloAlmacen.setName( GXCCtl );
            cmbInvd_ModuloAlmacen.setWebtags( "" );
            cmbInvd_ModuloAlmacen.addItem("", "", (short)(0));
            cmbInvd_ModuloAlmacen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            cmbInvd_ModuloAlmacen.addItem("INVE", "INVENTARIO", (short)(0));
            cmbInvd_ModuloAlmacen.addItem("ALMA", "ALMACEN", (short)(0));
            if ( cmbInvd_ModuloAlmacen.getItemCount() > 0 )
            {
               A412Invd_ModuloAlmacen = cmbInvd_ModuloAlmacen.getValidValue(A412Invd_ModuloAlmacen) ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbInvd_ModuloAlmacen,cmbInvd_ModuloAlmacen.getInternalname(),GXutil.rtrim( A412Invd_ModuloAlmacen),new Integer(1),cmbInvd_ModuloAlmacen.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbInvd_ModuloAlmacen.setValue( GXutil.rtrim( A412Invd_ModuloAlmacen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbInvd_ModuloAlmacen.getInternalname(), "Values", cmbInvd_ModuloAlmacen.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_AlmacenCodigo_Internalname,A413Invd_AlmacenCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_AlmacenCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_BodegaCodigo_Internalname,A414Invd_BodegaCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_BodegaCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_84_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "INVD_ESTADO_" + sGXsfl_84_idx ;
            cmbInvd_Estado.setName( GXCCtl );
            cmbInvd_Estado.setWebtags( "" );
            cmbInvd_Estado.addItem("R", "Ratificado", (short)(0));
            cmbInvd_Estado.addItem("P", "Pendiente", (short)(0));
            if ( cmbInvd_Estado.getItemCount() > 0 )
            {
               A463Invd_Estado = cmbInvd_Estado.getValidValue(A463Invd_Estado) ;
               n463Invd_Estado = false ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbInvd_Estado,cmbInvd_Estado.getInternalname(),GXutil.rtrim( A463Invd_Estado),new Integer(1),cmbInvd_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbInvd_Estado.setValue( GXutil.rtrim( A463Invd_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbInvd_Estado.getInternalname(), "Values", cmbInvd_Estado.ToJavascriptSource(), !bGXsfl_84_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVariable_I_Internalname,GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVariable_I_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(84),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_NUMEROPLACA"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A67Invd_NumeroPlaca, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_REGIONALID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_CENTROCOSTOID"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_MODULOALMACEN"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ALMACENCODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_BODEGACODIGO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ESTADO"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_I"+"_"+sGXsfl_84_idx, getSecureSignedToken( sGXsfl_84_idx, localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")));
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
      lblLblinvd_numeroplacafilter_Internalname = "LBLINVD_NUMEROPLACAFILTER" ;
      edtavCinvd_numeroplaca_Internalname = "vCINVD_NUMEROPLACA" ;
      divInvd_numeroplacafiltercontainer_Internalname = "INVD_NUMEROPLACAFILTERCONTAINER" ;
      lblLblinvd_regionalidfilter_Internalname = "LBLINVD_REGIONALIDFILTER" ;
      edtavCinvd_regionalid_Internalname = "vCINVD_REGIONALID" ;
      divInvd_regionalidfiltercontainer_Internalname = "INVD_REGIONALIDFILTERCONTAINER" ;
      lblLblinvd_centrocostoidfilter_Internalname = "LBLINVD_CENTROCOSTOIDFILTER" ;
      edtavCinvd_centrocostoid_Internalname = "vCINVD_CENTROCOSTOID" ;
      divInvd_centrocostoidfiltercontainer_Internalname = "INVD_CENTROCOSTOIDFILTERCONTAINER" ;
      lblLblinvd_moduloalmacenfilter_Internalname = "LBLINVD_MODULOALMACENFILTER" ;
      cmbavCinvd_moduloalmacen.setInternalname( "vCINVD_MODULOALMACEN" );
      divInvd_moduloalmacenfiltercontainer_Internalname = "INVD_MODULOALMACENFILTERCONTAINER" ;
      lblLblinvd_almacencodigofilter_Internalname = "LBLINVD_ALMACENCODIGOFILTER" ;
      edtavCinvd_almacencodigo_Internalname = "vCINVD_ALMACENCODIGO" ;
      divInvd_almacencodigofiltercontainer_Internalname = "INVD_ALMACENCODIGOFILTERCONTAINER" ;
      lblLblinvd_bodegacodigofilter_Internalname = "LBLINVD_BODEGACODIGOFILTER" ;
      edtavCinvd_bodegacodigo_Internalname = "vCINVD_BODEGACODIGO" ;
      divInvd_bodegacodigofiltercontainer_Internalname = "INVD_BODEGACODIGOFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA" ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID" ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID" ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN" );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO" ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO" ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO" );
      edtVariable_I_Internalname = "VARIABLE_I" ;
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
      edtVariable_I_Jsonclick = "" ;
      cmbInvd_Estado.setJsonclick( "" );
      edtInvd_BodegaCodigo_Jsonclick = "" ;
      edtInvd_AlmacenCodigo_Jsonclick = "" ;
      cmbInvd_ModuloAlmacen.setJsonclick( "" );
      edtInvd_CentroCostoId_Jsonclick = "" ;
      edtInvd_RegionalId_Jsonclick = "" ;
      edtInvd_NumeroPlaca_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtInvd_NumeroPlaca_Link = "" ;
      edtavLinkselection_Link = "" ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCinvd_bodegacodigo_Jsonclick = "" ;
      edtavCinvd_bodegacodigo_Enabled = 1 ;
      edtavCinvd_bodegacodigo_Visible = 1 ;
      edtavCinvd_almacencodigo_Jsonclick = "" ;
      edtavCinvd_almacencodigo_Enabled = 1 ;
      edtavCinvd_almacencodigo_Visible = 1 ;
      cmbavCinvd_moduloalmacen.setJsonclick( "" );
      cmbavCinvd_moduloalmacen.setEnabled( 1 );
      cmbavCinvd_moduloalmacen.setVisible( 1 );
      edtavCinvd_centrocostoid_Jsonclick = "" ;
      edtavCinvd_centrocostoid_Enabled = 1 ;
      edtavCinvd_centrocostoid_Visible = 1 ;
      edtavCinvd_regionalid_Jsonclick = "" ;
      edtavCinvd_regionalid_Enabled = 1 ;
      edtavCinvd_regionalid_Visible = 1 ;
      edtavCinvd_numeroplaca_Jsonclick = "" ;
      edtavCinvd_numeroplaca_Enabled = 1 ;
      edtavCinvd_numeroplaca_Visible = 1 ;
      edtavCelem_consecutivo_Jsonclick = "" ;
      edtavCelem_consecutivo_Enabled = 1 ;
      edtavCelem_consecutivo_Visible = 1 ;
      divInvd_bodegacodigofiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_almacencodigofiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_moduloalmacenfiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_centrocostoidfiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_regionalidfiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_numeroplacafiltercontainer_Class = "AdvancedContainerItem" ;
      divElem_consecutivofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selection List INVENTARIO DEVOLUTIVO" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV7cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV8cInvd_RegionalId',fld:'vCINVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cInvd_CentroCostoId',fld:'vCINVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCinvd_moduloalmacen'},{av:'AV10cInvd_ModuloAlmacen',fld:'vCINVD_MODULOALMACEN',pic:'',nv:''},{av:'AV11cInvd_AlmacenCodigo',fld:'vCINVD_ALMACENCODIGO',pic:'',nv:''},{av:'AV12cInvd_BodegaCodigo',fld:'vCINVD_BODEGACODIGO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e188K1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLELEM_CONSECUTIVOFILTER.CLICK","{handler:'e118K1',iparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'},{av:'edtavCelem_consecutivo_Visible',ctrl:'vCELEM_CONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLINVD_NUMEROPLACAFILTER.CLICK","{handler:'e128K1',iparms:[{av:'divInvd_numeroplacafiltercontainer_Class',ctrl:'INVD_NUMEROPLACAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_numeroplacafiltercontainer_Class',ctrl:'INVD_NUMEROPLACAFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_numeroplaca_Visible',ctrl:'vCINVD_NUMEROPLACA',prop:'Visible'}]}");
      setEventMetadata("LBLINVD_REGIONALIDFILTER.CLICK","{handler:'e138K1',iparms:[{av:'divInvd_regionalidfiltercontainer_Class',ctrl:'INVD_REGIONALIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_regionalidfiltercontainer_Class',ctrl:'INVD_REGIONALIDFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_regionalid_Visible',ctrl:'vCINVD_REGIONALID',prop:'Visible'}]}");
      setEventMetadata("LBLINVD_CENTROCOSTOIDFILTER.CLICK","{handler:'e148K1',iparms:[{av:'divInvd_centrocostoidfiltercontainer_Class',ctrl:'INVD_CENTROCOSTOIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_centrocostoidfiltercontainer_Class',ctrl:'INVD_CENTROCOSTOIDFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_centrocostoid_Visible',ctrl:'vCINVD_CENTROCOSTOID',prop:'Visible'}]}");
      setEventMetadata("LBLINVD_MODULOALMACENFILTER.CLICK","{handler:'e158K1',iparms:[{av:'divInvd_moduloalmacenfiltercontainer_Class',ctrl:'INVD_MODULOALMACENFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_moduloalmacenfiltercontainer_Class',ctrl:'INVD_MODULOALMACENFILTERCONTAINER',prop:'Class'},{av:'cmbavCinvd_moduloalmacen'}]}");
      setEventMetadata("LBLINVD_ALMACENCODIGOFILTER.CLICK","{handler:'e168K1',iparms:[{av:'divInvd_almacencodigofiltercontainer_Class',ctrl:'INVD_ALMACENCODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_almacencodigofiltercontainer_Class',ctrl:'INVD_ALMACENCODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_almacencodigo_Visible',ctrl:'vCINVD_ALMACENCODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLINVD_BODEGACODIGOFILTER.CLICK","{handler:'e178K1',iparms:[{av:'divInvd_bodegacodigofiltercontainer_Class',ctrl:'INVD_BODEGACODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_bodegacodigofiltercontainer_Class',ctrl:'INVD_BODEGACODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_bodegacodigo_Visible',ctrl:'vCINVD_BODEGACODIGO',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e218K2',iparms:[{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''}],oparms:[{av:'AV13pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV14pInvd_NumeroPlaca',fld:'vPINVD_NUMEROPLACA',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV7cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV8cInvd_RegionalId',fld:'vCINVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cInvd_CentroCostoId',fld:'vCINVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCinvd_moduloalmacen'},{av:'AV10cInvd_ModuloAlmacen',fld:'vCINVD_MODULOALMACEN',pic:'',nv:''},{av:'AV11cInvd_AlmacenCodigo',fld:'vCINVD_ALMACENCODIGO',pic:'',nv:''},{av:'AV12cInvd_BodegaCodigo',fld:'vCINVD_BODEGACODIGO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV7cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV8cInvd_RegionalId',fld:'vCINVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cInvd_CentroCostoId',fld:'vCINVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCinvd_moduloalmacen'},{av:'AV10cInvd_ModuloAlmacen',fld:'vCINVD_MODULOALMACEN',pic:'',nv:''},{av:'AV11cInvd_AlmacenCodigo',fld:'vCINVD_ALMACENCODIGO',pic:'',nv:''},{av:'AV12cInvd_BodegaCodigo',fld:'vCINVD_BODEGACODIGO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV7cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV8cInvd_RegionalId',fld:'vCINVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cInvd_CentroCostoId',fld:'vCINVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCinvd_moduloalmacen'},{av:'AV10cInvd_ModuloAlmacen',fld:'vCINVD_MODULOALMACEN',pic:'',nv:''},{av:'AV11cInvd_AlmacenCodigo',fld:'vCINVD_ALMACENCODIGO',pic:'',nv:''},{av:'AV12cInvd_BodegaCodigo',fld:'vCINVD_BODEGACODIGO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV6cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV7cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV8cInvd_RegionalId',fld:'vCINVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV9cInvd_CentroCostoId',fld:'vCINVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCinvd_moduloalmacen'},{av:'AV10cInvd_ModuloAlmacen',fld:'vCINVD_MODULOALMACEN',pic:'',nv:''},{av:'AV11cInvd_AlmacenCodigo',fld:'vCINVD_ALMACENCODIGO',pic:'',nv:''},{av:'AV12cInvd_BodegaCodigo',fld:'vCINVD_BODEGACODIGO',pic:'',nv:''}],oparms:[]}");
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
      AV6cElem_Consecutivo = "" ;
      AV7cInvd_NumeroPlaca = "" ;
      AV10cInvd_ModuloAlmacen = "" ;
      AV11cInvd_AlmacenCodigo = "" ;
      AV12cInvd_BodegaCodigo = "" ;
      GXKey = "" ;
      AV13pElem_Consecutivo = "" ;
      AV14pInvd_NumeroPlaca = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblelem_consecutivofilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblinvd_numeroplacafilter_Jsonclick = "" ;
      lblLblinvd_regionalidfilter_Jsonclick = "" ;
      lblLblinvd_centrocostoidfilter_Jsonclick = "" ;
      lblLblinvd_moduloalmacenfilter_Jsonclick = "" ;
      lblLblinvd_almacencodigofilter_Jsonclick = "" ;
      lblLblinvd_bodegacodigofilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV5LinkSelection = "" ;
      A66Elem_Consecutivo = "" ;
      A67Invd_NumeroPlaca = "" ;
      A412Invd_ModuloAlmacen = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A414Invd_BodegaCodigo = "" ;
      A463Invd_Estado = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV18Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV6cElem_Consecutivo = "" ;
      lV7cInvd_NumeroPlaca = "" ;
      lV10cInvd_ModuloAlmacen = "" ;
      lV11cInvd_AlmacenCodigo = "" ;
      lV12cInvd_BodegaCodigo = "" ;
      H008K2_A626Variable_I = new short[1] ;
      H008K2_n626Variable_I = new boolean[] {false} ;
      H008K2_A463Invd_Estado = new String[] {""} ;
      H008K2_n463Invd_Estado = new boolean[] {false} ;
      H008K2_A414Invd_BodegaCodigo = new String[] {""} ;
      H008K2_A413Invd_AlmacenCodigo = new String[] {""} ;
      H008K2_A412Invd_ModuloAlmacen = new String[] {""} ;
      H008K2_A411Invd_CentroCostoId = new long[1] ;
      H008K2_A410Invd_RegionalId = new long[1] ;
      H008K2_A67Invd_NumeroPlaca = new String[] {""} ;
      H008K2_A66Elem_Consecutivo = new String[] {""} ;
      H008K3_AGRID1_nRecordCount = new long[1] ;
      AV15ADVANCED_LABEL_TEMPLATE = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.gx00g0__default(),
         new Object[] {
             new Object[] {
            H008K2_A626Variable_I, H008K2_n626Variable_I, H008K2_A463Invd_Estado, H008K2_n463Invd_Estado, H008K2_A414Invd_BodegaCodigo, H008K2_A413Invd_AlmacenCodigo, H008K2_A412Invd_ModuloAlmacen, H008K2_A411Invd_CentroCostoId, H008K2_A410Invd_RegionalId, H008K2_A67Invd_NumeroPlaca,
            H008K2_A66Elem_Consecutivo
            }
            , new Object[] {
            H008K3_AGRID1_nRecordCount
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
   private short A626Variable_I ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int edtavCelem_consecutivo_Visible ;
   private int edtavCelem_consecutivo_Enabled ;
   private int edtavCinvd_numeroplaca_Visible ;
   private int edtavCinvd_numeroplaca_Enabled ;
   private int edtavCinvd_regionalid_Enabled ;
   private int edtavCinvd_regionalid_Visible ;
   private int edtavCinvd_centrocostoid_Enabled ;
   private int edtavCinvd_centrocostoid_Visible ;
   private int edtavCinvd_almacencodigo_Visible ;
   private int edtavCinvd_almacencodigo_Enabled ;
   private int edtavCinvd_bodegacodigo_Visible ;
   private int edtavCinvd_bodegacodigo_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV8cInvd_RegionalId ;
   private long AV9cInvd_CentroCostoId ;
   private long GRID1_nFirstRecordOnPage ;
   private long A410Invd_RegionalId ;
   private long A411Invd_CentroCostoId ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divElem_consecutivofiltercontainer_Class ;
   private String divInvd_numeroplacafiltercontainer_Class ;
   private String divInvd_regionalidfiltercontainer_Class ;
   private String divInvd_centrocostoidfiltercontainer_Class ;
   private String divInvd_moduloalmacenfiltercontainer_Class ;
   private String divInvd_almacencodigofiltercontainer_Class ;
   private String divInvd_bodegacodigofiltercontainer_Class ;
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
   private String divElem_consecutivofiltercontainer_Internalname ;
   private String lblLblelem_consecutivofilter_Internalname ;
   private String lblLblelem_consecutivofilter_Jsonclick ;
   private String edtavCelem_consecutivo_Internalname ;
   private String TempTags ;
   private String edtavCelem_consecutivo_Jsonclick ;
   private String divInvd_numeroplacafiltercontainer_Internalname ;
   private String lblLblinvd_numeroplacafilter_Internalname ;
   private String lblLblinvd_numeroplacafilter_Jsonclick ;
   private String edtavCinvd_numeroplaca_Internalname ;
   private String edtavCinvd_numeroplaca_Jsonclick ;
   private String divInvd_regionalidfiltercontainer_Internalname ;
   private String lblLblinvd_regionalidfilter_Internalname ;
   private String lblLblinvd_regionalidfilter_Jsonclick ;
   private String edtavCinvd_regionalid_Internalname ;
   private String edtavCinvd_regionalid_Jsonclick ;
   private String divInvd_centrocostoidfiltercontainer_Internalname ;
   private String lblLblinvd_centrocostoidfilter_Internalname ;
   private String lblLblinvd_centrocostoidfilter_Jsonclick ;
   private String edtavCinvd_centrocostoid_Internalname ;
   private String edtavCinvd_centrocostoid_Jsonclick ;
   private String divInvd_moduloalmacenfiltercontainer_Internalname ;
   private String lblLblinvd_moduloalmacenfilter_Internalname ;
   private String lblLblinvd_moduloalmacenfilter_Jsonclick ;
   private String divInvd_almacencodigofiltercontainer_Internalname ;
   private String lblLblinvd_almacencodigofilter_Internalname ;
   private String lblLblinvd_almacencodigofilter_Jsonclick ;
   private String edtavCinvd_almacencodigo_Internalname ;
   private String edtavCinvd_almacencodigo_Jsonclick ;
   private String divInvd_bodegacodigofiltercontainer_Internalname ;
   private String lblLblinvd_bodegacodigofilter_Internalname ;
   private String lblLblinvd_bodegacodigofilter_Jsonclick ;
   private String edtavCinvd_bodegacodigo_Internalname ;
   private String edtavCinvd_bodegacodigo_Jsonclick ;
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
   private String edtInvd_NumeroPlaca_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtInvd_NumeroPlaca_Internalname ;
   private String edtInvd_RegionalId_Internalname ;
   private String edtInvd_CentroCostoId_Internalname ;
   private String edtInvd_AlmacenCodigo_Internalname ;
   private String edtInvd_BodegaCodigo_Internalname ;
   private String edtVariable_I_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV15ADVANCED_LABEL_TEMPLATE ;
   private String sGXsfl_84_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtInvd_NumeroPlaca_Jsonclick ;
   private String edtInvd_RegionalId_Jsonclick ;
   private String edtInvd_CentroCostoId_Jsonclick ;
   private String edtInvd_AlmacenCodigo_Jsonclick ;
   private String edtInvd_BodegaCodigo_Jsonclick ;
   private String edtVariable_I_Jsonclick ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_84_Refreshing=false ;
   private boolean n463Invd_Estado ;
   private boolean n626Variable_I ;
   private boolean returnInSub ;
   private boolean AV5LinkSelection_IsBlob ;
   private String AV6cElem_Consecutivo ;
   private String AV7cInvd_NumeroPlaca ;
   private String AV10cInvd_ModuloAlmacen ;
   private String AV11cInvd_AlmacenCodigo ;
   private String AV12cInvd_BodegaCodigo ;
   private String AV13pElem_Consecutivo ;
   private String AV14pInvd_NumeroPlaca ;
   private String A66Elem_Consecutivo ;
   private String A67Invd_NumeroPlaca ;
   private String A412Invd_ModuloAlmacen ;
   private String A413Invd_AlmacenCodigo ;
   private String A414Invd_BodegaCodigo ;
   private String A463Invd_Estado ;
   private String AV18Linkselection_GXI ;
   private String lV6cElem_Consecutivo ;
   private String lV7cInvd_NumeroPlaca ;
   private String lV10cInvd_ModuloAlmacen ;
   private String lV11cInvd_AlmacenCodigo ;
   private String lV12cInvd_BodegaCodigo ;
   private String AV5LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbavCinvd_moduloalmacen ;
   private HTMLChoice cmbInvd_ModuloAlmacen ;
   private HTMLChoice cmbInvd_Estado ;
   private IDataStoreProvider pr_default ;
   private short[] H008K2_A626Variable_I ;
   private boolean[] H008K2_n626Variable_I ;
   private String[] H008K2_A463Invd_Estado ;
   private boolean[] H008K2_n463Invd_Estado ;
   private String[] H008K2_A414Invd_BodegaCodigo ;
   private String[] H008K2_A413Invd_AlmacenCodigo ;
   private String[] H008K2_A412Invd_ModuloAlmacen ;
   private long[] H008K2_A411Invd_CentroCostoId ;
   private long[] H008K2_A410Invd_RegionalId ;
   private String[] H008K2_A67Invd_NumeroPlaca ;
   private String[] H008K2_A66Elem_Consecutivo ;
   private long[] H008K3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class gx00g0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          long AV8cInvd_RegionalId ,
                                          long AV9cInvd_CentroCostoId ,
                                          String AV10cInvd_ModuloAlmacen ,
                                          String AV11cInvd_AlmacenCodigo ,
                                          String AV12cInvd_BodegaCodigo ,
                                          long A410Invd_RegionalId ,
                                          long A411Invd_CentroCostoId ,
                                          String A412Invd_ModuloAlmacen ,
                                          String A413Invd_AlmacenCodigo ,
                                          String A414Invd_BodegaCodigo ,
                                          String A66Elem_Consecutivo ,
                                          String AV6cElem_Consecutivo ,
                                          String A67Invd_NumeroPlaca ,
                                          String AV7cInvd_NumeroPlaca )
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
      sSelectString = " /*+ FIRST_ROWS(11) */ Variable_I, Invd_Estado, Invd_BodegaCodigo, Invd_AlmacenCodigo," ;
      sSelectString = sSelectString + " Invd_ModuloAlmacen, Invd_CentroCostoId, Invd_RegionalId, Invd_NumeroPlaca, Elem_Consecutivo" ;
      sFromString = " FROM ALM_INVENTARIO_DEVOLUTIVO" ;
      sOrderString = "" ;
      sWhereString = sWhereString + " WHERE (Elem_Consecutivo like ?)" ;
      sWhereString = sWhereString + " and (Invd_NumeroPlaca like ?)" ;
      if ( ! (0==AV8cInvd_RegionalId) )
      {
         sWhereString = sWhereString + " and (Invd_RegionalId >= ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cInvd_CentroCostoId) )
      {
         sWhereString = sWhereString + " and (Invd_CentroCostoId >= ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cInvd_ModuloAlmacen)==0) )
      {
         sWhereString = sWhereString + " and (Invd_ModuloAlmacen like ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cInvd_AlmacenCodigo)==0) )
      {
         sWhereString = sWhereString + " and (Invd_AlmacenCodigo like ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cInvd_BodegaCodigo)==0) )
      {
         sWhereString = sWhereString + " and (Invd_BodegaCodigo like ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      sOrderString = sOrderString + " ORDER BY Elem_Consecutivo, Invd_NumeroPlaca" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H008K3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          long AV8cInvd_RegionalId ,
                                          long AV9cInvd_CentroCostoId ,
                                          String AV10cInvd_ModuloAlmacen ,
                                          String AV11cInvd_AlmacenCodigo ,
                                          String AV12cInvd_BodegaCodigo ,
                                          long A410Invd_RegionalId ,
                                          long A411Invd_CentroCostoId ,
                                          String A412Invd_ModuloAlmacen ,
                                          String A413Invd_AlmacenCodigo ,
                                          String A414Invd_BodegaCodigo ,
                                          String A66Elem_Consecutivo ,
                                          String AV6cElem_Consecutivo ,
                                          String A67Invd_NumeroPlaca ,
                                          String AV7cInvd_NumeroPlaca )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [7] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM ALM_INVENTARIO_DEVOLUTIVO" ;
      scmdbuf = scmdbuf + " WHERE (Elem_Consecutivo like ?)" ;
      scmdbuf = scmdbuf + " and (Invd_NumeroPlaca like ?)" ;
      if ( ! (0==AV8cInvd_RegionalId) )
      {
         sWhereString = sWhereString + " and (Invd_RegionalId >= ?)" ;
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (0==AV9cInvd_CentroCostoId) )
      {
         sWhereString = sWhereString + " and (Invd_CentroCostoId >= ?)" ;
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10cInvd_ModuloAlmacen)==0) )
      {
         sWhereString = sWhereString + " and (Invd_ModuloAlmacen like ?)" ;
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11cInvd_AlmacenCodigo)==0) )
      {
         sWhereString = sWhereString + " and (Invd_AlmacenCodigo like ?)" ;
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12cInvd_BodegaCodigo)==0) )
      {
         sWhereString = sWhereString + " and (Invd_BodegaCodigo like ?)" ;
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
                  return conditional_H008K2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).longValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_H008K3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).longValue() , ((Number) dynConstraints[6]).longValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H008K3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((long[]) buf[7])[0] = rslt.getLong(6) ;
               ((long[]) buf[8])[0] = rslt.getLong(7) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
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
                  stmt.setVarchar(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[13]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 3);
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
                  stmt.setVarchar(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[9]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 3);
               }
               return;
      }
   }

}

