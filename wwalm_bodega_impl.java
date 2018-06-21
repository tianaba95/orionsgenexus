/*
               File: wwalm_bodega_impl
        Description: Work With Bodega
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:32.8
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

public final  class wwalm_bodega_impl extends GXDataArea
{
   public wwalm_bodega_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_bodega_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_bodega_impl.class ));
   }

   public wwalm_bodega_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavBode_estado = new HTMLChoice();
      cmbBode_Estado = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
         {
            nRC_GXsfl_49 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_49_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_49_idx = httpContext.GetNextPar( ) ;
            AV17Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_49_Refreshing);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
         {
            subGrid_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV14Bode_Descripcion = httpContext.GetNextPar( ) ;
            AV15Bode_Codigo = httpContext.GetNextPar( ) ;
            AV16Bode_Estado = httpContext.GetNextPar( ) ;
            AV17Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_49_Refreshing);
            AV18ADVANCED_LABEL_TEMPLATE = httpContext.GetNextPar( ) ;
            AV21Pgmname = httpContext.GetNextPar( ) ;
            A31Bode_Codigo = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14Bode_Descripcion, AV15Bode_Codigo, AV16Bode_Estado, AV17Update, AV18ADVANCED_LABEL_TEMPLATE, AV21Pgmname, A31Bode_Codigo) ;
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
         MasterPageObj = new com.orions2.rwdmasterpage_impl (remoteHandle, context.copy());
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
      pa3U2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start3U2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414193213");
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
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_bodega") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vBODE_DESCRIPCION", AV14Bode_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vBODE_CODIGO", AV15Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vBODE_ESTADO", GXutil.rtrim( AV16Bode_Estado));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_49", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_49, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vADVANCED_LABEL_TEMPLATE", GXutil.rtrim( AV18ADVANCED_LABEL_TEMPLATE));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV21Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FILTERSCONTAINER_Class", GXutil.rtrim( divFilterscontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divBode_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_ESTADOFILTERCONTAINER_Class", GXutil.rtrim( divBode_estadofiltercontainer_Class));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
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
         we3U2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt3U2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.orions2.wwalm_bodega")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_BODEGA" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Bodega" ;
   }

   public void wb3U0( )
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
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "BodyContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTabletop_Internalname, 1, 0, "px", 0, "px", "TableTopSearch", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2 ToggleCell", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", bttBtntoggle_Caption, bttBtntoggle_Jsonclick, 7, "Otros Filtros", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e113u1_client"+"'", TempTags, "", 2, "HLP_WWALM_BODEGA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Bodegas", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_BODEGA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4 col-sm-5 col-sm-push-3 WWActionsCell", "Right", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWALM_BODEGA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-sm-pull-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavBode_descripcion_Internalname, "Bode_Descripcion", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavBode_descripcion_Internalname, AV14Bode_Descripcion, GXutil.rtrim( localUtil.format( AV14Bode_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Nombre Bodega", edtavBode_descripcion_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavBode_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_BODEGA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-md-2 WWAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divFilterscontainer_Internalname, 1, 0, "px", 0, "px", divFilterscontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divBode_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divBode_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbode_codigofilter_Internalname, lblLblbode_codigofilter_Caption, "", "", lblLblbode_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e123u1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_BODEGA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavBode_codigo_Internalname, "Bode_Codigo", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavBode_codigo_Internalname, AV15Bode_Codigo, GXutil.rtrim( localUtil.format( AV15Bode_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBode_codigo_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavBode_codigo_Visible, edtavBode_codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_BODEGA.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divBode_estadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divBode_estadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblbode_estadofilter_Internalname, lblLblbode_estadofilter_Caption, "", "", lblLblbode_estadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e133u1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_BODEGA.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavBode_estado.getInternalname(), "Bode_Estado", "col-sm-3 FilterComboAttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBode_estado, cmbavBode_estado.getInternalname(), GXutil.rtrim( AV16Bode_Estado), 1, cmbavBode_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavBode_estado.getVisible(), cmbavBode_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "FilterComboAttribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, "HLP_WWALM_BODEGA.htm");
         cmbavBode_estado.setValue( GXutil.rtrim( AV16Bode_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBode_estado.getInternalname(), "Values", cmbavBode_estado.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridcell_Internalname, 1, 0, "px", 0, "px", divGridcell_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "ContainerFluid WWAdvancedContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"49\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid_Backcolorstyle == 0 )
            {
               subGrid_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
            else
            {
               subGrid_Titlebackstyle = (byte)(1) ;
               if ( subGrid_Backcolorstyle == 1 )
               {
                  subGrid_Titlebackcolor = subGrid_Allbackcolor ;
                  if ( GXutil.len( subGrid_Class) > 0 )
                  {
                     subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid_Class) > 0 )
                  {
                     subGrid_Linesclass = subGrid_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nombre Bodega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"UpdateAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            GridContainer.AddObjectProperty("GridName", "Grid");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               GridContainer = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               GridContainer.Clear();
            }
            GridContainer.SetWrapped(nGXWrapped);
            GridContainer.AddObjectProperty("GridName", "Grid");
            GridContainer.AddObjectProperty("Class", "WorkWith");
            GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("CmpContext", "");
            GridContainer.AddObjectProperty("InMasterPage", "false");
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A31Bode_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A251Bode_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A674Bode_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV17Update));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavUpdate_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 49 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_49 = (short)(nGXsfl_49_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
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

   public void start3U2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Bodega", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup3U0( ) ;
   }

   public void ws3U2( )
   {
      start3U2( ) ;
      evt3U2( ) ;
   }

   public void evt3U2( )
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
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e143U2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_49_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_49_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_49_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_492( ) ;
                           A31Bode_Codigo = httpContext.cgiGet( edtBode_Codigo_Internalname) ;
                           A251Bode_Descripcion = GXutil.upper( httpContext.cgiGet( edtBode_Descripcion_Internalname)) ;
                           cmbBode_Estado.setName( cmbBode_Estado.getInternalname() );
                           cmbBode_Estado.setValue( httpContext.cgiGet( cmbBode_Estado.getInternalname()) );
                           A674Bode_Estado = httpContext.cgiGet( cmbBode_Estado.getInternalname()) ;
                           n674Bode_Estado = false ;
                           AV17Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV17Update)==0) ? AV22Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV17Update))), !bGXsfl_49_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV17Update), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e153U2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e163U2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e173U2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Bode_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBODE_DESCRIPCION"), AV14Bode_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bode_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBODE_CODIGO"), AV15Bode_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bode_estado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBODE_ESTADO"), AV16Bode_Estado) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
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

   public void we3U2( )
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

   public void pa3U2( )
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
         cmbavBode_estado.setName( "vBODE_ESTADO" );
         cmbavBode_estado.setWebtags( "" );
         cmbavBode_estado.addItem("", "(Todos)", (short)(0));
         cmbavBode_estado.addItem("A", "Activo", (short)(0));
         cmbavBode_estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbavBode_estado.getItemCount() > 0 )
         {
            AV16Bode_Estado = cmbavBode_estado.getValidValue(AV16Bode_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Bode_Estado", AV16Bode_Estado);
         }
         GXCCtl = "BODE_ESTADO_" + sGXsfl_49_idx ;
         cmbBode_Estado.setName( GXCCtl );
         cmbBode_Estado.setWebtags( "" );
         cmbBode_Estado.addItem("A", "Activo", (short)(0));
         cmbBode_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbBode_Estado.getItemCount() > 0 )
         {
            A674Bode_Estado = cmbBode_Estado.getValidValue(A674Bode_Estado) ;
            n674Bode_Estado = false ;
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavBode_descripcion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_492( ) ;
      while ( nGXsfl_49_idx <= nRC_GXsfl_49 )
      {
         sendrow_492( ) ;
         nGXsfl_49_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_49_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_49_idx+1)) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_49_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_492( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV14Bode_Descripcion ,
                                 String AV15Bode_Codigo ,
                                 String AV16Bode_Estado ,
                                 String AV17Update ,
                                 String AV18ADVANCED_LABEL_TEMPLATE ,
                                 String AV21Pgmname ,
                                 String A31Bode_Codigo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf3U2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A31Bode_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGO", A31Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A251Bode_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_DESCRIPCION", A251Bode_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A674Bode_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_ESTADO", GXutil.rtrim( A674Bode_Estado));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavBode_estado.getItemCount() > 0 )
      {
         AV16Bode_Estado = cmbavBode_estado.getValidValue(AV16Bode_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Bode_Estado", AV16Bode_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf3U2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV21Pgmname = "WWALM_BODEGA" ;
      Gx_err = (short)(0) ;
   }

   public void rf3U2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(49) ;
      /* Execute user event: Refresh */
      e163U2 ();
      nGXsfl_49_idx = (short)(1) ;
      sGXsfl_49_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_49_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_492( ) ;
      bGXsfl_49_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_492( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV15Bode_Codigo ,
                                              AV16Bode_Estado ,
                                              A31Bode_Codigo ,
                                              A674Bode_Estado ,
                                              AV14Bode_Descripcion ,
                                              A251Bode_Descripcion } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV15Bode_Codigo = GXutil.concat( GXutil.rtrim( AV15Bode_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Bode_Codigo", AV15Bode_Codigo);
         lV16Bode_Estado = GXutil.padr( GXutil.rtrim( AV16Bode_Estado), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Bode_Estado", AV16Bode_Estado);
         /* Using cursor H003U2 */
         pr_default.execute(0, new Object[] {lV15Bode_Codigo, lV16Bode_Estado});
         nGXsfl_49_idx = (short)(1) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_49_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_492( ) ;
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
         {
            A674Bode_Estado = H003U2_A674Bode_Estado[0] ;
            n674Bode_Estado = H003U2_n674Bode_Estado[0] ;
            A251Bode_Descripcion = H003U2_A251Bode_Descripcion[0] ;
            A31Bode_Codigo = H003U2_A31Bode_Codigo[0] ;
            if ( (GXutil.strcmp("", AV14Bode_Descripcion)==0) || ( GXutil.like( GXutil.upper( A251Bode_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV14Bode_Descripcion), "") , 254 , "%"),  ' ' ) ) )
            {
               e173U2 ();
            }
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(49) ;
         wb3U0( ) ;
      }
      bGXsfl_49_Refreshing = true ;
   }

   public int subgrid_pagecount( )
   {
      GRID_nRecordCount = subgrid_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_recordsperpage( )))+1) ;
   }

   public int subgrid_recordcount( )
   {
      return -1 ;
   }

   public int subgrid_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_currentpage( )
   {
      return -1 ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Bode_Descripcion, AV15Bode_Codigo, AV16Bode_Estado, AV17Update, AV18ADVANCED_LABEL_TEMPLATE, AV21Pgmname, A31Bode_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_recordsperpage( )) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Bode_Descripcion, AV15Bode_Codigo, AV16Bode_Estado, AV17Update, AV18ADVANCED_LABEL_TEMPLATE, AV21Pgmname, A31Bode_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Bode_Descripcion, AV15Bode_Codigo, AV16Bode_Estado, AV17Update, AV18ADVANCED_LABEL_TEMPLATE, AV21Pgmname, A31Bode_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Bode_Descripcion, AV15Bode_Codigo, AV16Bode_Estado, AV17Update, AV18ADVANCED_LABEL_TEMPLATE, AV21Pgmname, A31Bode_Codigo) ;
      }
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Bode_Descripcion, AV15Bode_Codigo, AV16Bode_Estado, AV17Update, AV18ADVANCED_LABEL_TEMPLATE, AV21Pgmname, A31Bode_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup3U0( )
   {
      /* Before Start, stand alone formulas. */
      AV21Pgmname = "WWALM_BODEGA" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e153U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14Bode_Descripcion = GXutil.upper( httpContext.cgiGet( edtavBode_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Bode_Descripcion", AV14Bode_Descripcion);
         AV15Bode_Codigo = httpContext.cgiGet( edtavBode_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Bode_Codigo", AV15Bode_Codigo);
         cmbavBode_estado.setName( cmbavBode_estado.getInternalname() );
         cmbavBode_estado.setValue( httpContext.cgiGet( cmbavBode_estado.getInternalname()) );
         AV16Bode_Estado = httpContext.cgiGet( cmbavBode_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Bode_Estado", AV16Bode_Estado);
         /* Read saved values. */
         nRC_GXsfl_49 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_49"), ",", ".")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBODE_DESCRIPCION"), AV14Bode_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBODE_CODIGO"), AV15Bode_Codigo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBODE_ESTADO"), AV16Bode_Estado) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
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
      e153U2 ();
      if (returnInSub) return;
   }

   public void e153U2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV21Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV21Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      divGridcell_Class = "WWGridCellExpanded" ;
      httpContext.ajax_rsp_assign_prop("", false, divGridcell_Internalname, "Class", divGridcell_Class, true);
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      divGridcell_Class = "WWGridCellExpanded" ;
      httpContext.ajax_rsp_assign_prop("", false, divGridcell_Internalname, "Class", divGridcell_Class, true);
      AV17Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV17Update)==0) ? AV22Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV17Update))), !bGXsfl_49_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV17Update), true);
      AV22Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV17Update)==0) ? AV22Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV17Update))), !bGXsfl_49_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV17Update), true);
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_49_Refreshing);
      AV16Bode_Estado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Bode_Estado", AV16Bode_Estado);
      Form.setCaption( "Bodegas" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV18ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18ADVANCED_LABEL_TEMPLATE", AV18ADVANCED_LABEL_TEMPLATE);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
   }

   public void e163U2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV15Bode_Codigo)==0) )
      {
         lblLblbode_codigofilter_Caption = "Código Bodega" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblbode_codigofilter_Internalname, "Caption", lblLblbode_codigofilter_Caption, true);
      }
      else
      {
         lblLblbode_codigofilter_Caption = GXutil.format( AV18ADVANCED_LABEL_TEMPLATE, "Código Bodega", AV15Bode_Codigo, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblbode_codigofilter_Internalname, "Caption", lblLblbode_codigofilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV16Bode_Estado)==0) )
      {
         lblLblbode_estadofilter_Caption = "Estado" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblbode_estadofilter_Internalname, "Caption", lblLblbode_estadofilter_Caption, true);
      }
      else
      {
         lblLblbode_estadofilter_Caption = GXutil.format( AV18ADVANCED_LABEL_TEMPLATE, "Estado", AV16Bode_Estado, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblbode_estadofilter_Internalname, "Caption", lblLblbode_estadofilter_Caption, true);
      }
   }

   private void e173U2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_bodega") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.rtrim(A31Bode_Codigo)) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(49) ;
      }
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
      {
         sendrow_492( ) ;
         GRID_nEOF = (byte)(1) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_49_Refreshing )
      {
         httpContext.doAjaxLoad(49, GridRow);
      }
   }

   public void e143U2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_bodega") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.rtrim("")));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV8HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV9GridState.fromxml(AV7Session.getValue(AV21Pgmname+"GridState"), null, null);
         if ( AV9GridState.getgxTv_SdtGridState_Filtervalues().size() >= 3 )
         {
            AV14Bode_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Bode_Descripcion", AV14Bode_Descripcion);
            AV15Bode_Codigo = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+2)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Bode_Codigo", AV15Bode_Codigo);
            AV16Bode_Estado = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+3)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Bode_Estado", AV16Bode_Estado);
         }
         if ( AV9GridState.getgxTv_SdtGridState_Currentpage() > 0 )
         {
            AV11GridPageCount = subgrid_pagecount( ) ;
            if ( ( AV11GridPageCount > 0 ) && ( AV11GridPageCount < AV9GridState.getgxTv_SdtGridState_Currentpage() ) )
            {
               subgrid_gotopage( AV11GridPageCount) ;
            }
            else
            {
               subgrid_gotopage( AV9GridState.getgxTv_SdtGridState_Currentpage()) ;
            }
         }
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      AV9GridState.fromxml(AV7Session.getValue(AV21Pgmname+"GridState"), null, null);
      AV9GridState.setgxTv_SdtGridState_Currentpage( (short)(subgrid_currentpage( )) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().clear();
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV14Bode_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV15Bode_Codigo );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV16Bode_Estado );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV7Session.setValue(AV21Pgmname+"GridState", AV9GridState.toxml(false, true, "GridState", "ACBSENA"));
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV12TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV21Pgmname );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV8HTTPRequest.getScriptName()+"?"+AV8HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "BODEGA" );
      AV7Session.setValue("TrnContext", AV12TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void setparameters( Object[] obj )
   {
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
      pa3U2( ) ;
      ws3U2( ) ;
      we3U2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414193289");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wwalm_bodega.js", "?201861414193289");
      /* End function include_jscripts */
   }

   public void subsflControlProps_492( )
   {
      edtBode_Codigo_Internalname = "BODE_CODIGO_"+sGXsfl_49_idx ;
      edtBode_Descripcion_Internalname = "BODE_DESCRIPCION_"+sGXsfl_49_idx ;
      cmbBode_Estado.setInternalname( "BODE_ESTADO_"+sGXsfl_49_idx );
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_49_idx ;
   }

   public void subsflControlProps_fel_492( )
   {
      edtBode_Codigo_Internalname = "BODE_CODIGO_"+sGXsfl_49_fel_idx ;
      edtBode_Descripcion_Internalname = "BODE_DESCRIPCION_"+sGXsfl_49_fel_idx ;
      cmbBode_Estado.setInternalname( "BODE_ESTADO_"+sGXsfl_49_fel_idx );
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_49_fel_idx ;
   }

   public void sendrow_492( )
   {
      subsflControlProps_492( ) ;
      wb3U0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_49_idx <= subgrid_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_49_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_49_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBode_Codigo_Internalname,A31Bode_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBode_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(49),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBode_Descripcion_Internalname,A251Bode_Descripcion,GXutil.rtrim( localUtil.format( A251Bode_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBode_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(49),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_49_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "BODE_ESTADO_" + sGXsfl_49_idx ;
            cmbBode_Estado.setName( GXCCtl );
            cmbBode_Estado.setWebtags( "" );
            cmbBode_Estado.addItem("A", "Activo", (short)(0));
            cmbBode_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbBode_Estado.getItemCount() > 0 )
            {
               A674Bode_Estado = cmbBode_Estado.getValidValue(A674Bode_Estado) ;
               n674Bode_Estado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbBode_Estado,cmbBode_Estado.getInternalname(),GXutil.rtrim( A674Bode_Estado),new Integer(1),cmbBode_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbBode_Estado.setValue( GXutil.rtrim( A674Bode_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbBode_Estado.getInternalname(), "Values", cmbBode_Estado.ToJavascriptSource(), !bGXsfl_49_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV17Update_IsBlob = (boolean)(((GXutil.strcmp("", AV17Update)==0)&&(GXutil.strcmp("", AV22Update_GXI)==0))||!(GXutil.strcmp("", AV17Update)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV17Update)==0) ? AV22Update_GXI : httpContext.getResourceRelative(AV17Update)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,sImgUrl,edtavUpdate_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavUpdate_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV17Update_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_CODIGO"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, GXutil.rtrim( localUtil.format( A31Bode_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_DESCRIPCION"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, GXutil.rtrim( localUtil.format( A251Bode_Descripcion, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_BODE_ESTADO"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, GXutil.rtrim( localUtil.format( A674Bode_Estado, ""))));
         GridContainer.AddRow(GridRow);
         nGXsfl_49_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_49_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_49_idx+1)) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_49_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_492( ) ;
      }
      /* End function sendrow_492 */
   }

   public void init_default_properties( )
   {
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      lblTitletext_Internalname = "TITLETEXT" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      edtavBode_descripcion_Internalname = "vBODE_DESCRIPCION" ;
      divTabletop_Internalname = "TABLETOP" ;
      lblLblbode_codigofilter_Internalname = "LBLBODE_CODIGOFILTER" ;
      edtavBode_codigo_Internalname = "vBODE_CODIGO" ;
      divBode_codigofiltercontainer_Internalname = "BODE_CODIGOFILTERCONTAINER" ;
      lblLblbode_estadofilter_Internalname = "LBLBODE_ESTADOFILTER" ;
      cmbavBode_estado.setInternalname( "vBODE_ESTADO" );
      divBode_estadofiltercontainer_Internalname = "BODE_ESTADOFILTERCONTAINER" ;
      divFilterscontainer_Internalname = "FILTERSCONTAINER" ;
      edtBode_Codigo_Internalname = "BODE_CODIGO" ;
      edtBode_Descripcion_Internalname = "BODE_DESCRIPCION" ;
      cmbBode_Estado.setInternalname( "BODE_ESTADO" );
      edtavUpdate_Internalname = "vUPDATE" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divGridcell_Internalname = "GRIDCELL" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      cmbBode_Estado.setJsonclick( "" );
      edtBode_Descripcion_Jsonclick = "" ;
      edtBode_Codigo_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavUpdate_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divGridcell_Class = "col-xs-12 col-sm-9 col-md-10 WWGridCell" ;
      cmbavBode_estado.setJsonclick( "" );
      cmbavBode_estado.setEnabled( 1 );
      cmbavBode_estado.setVisible( 1 );
      lblLblbode_estadofilter_Caption = "Estado" ;
      edtavBode_codigo_Jsonclick = "" ;
      edtavBode_codigo_Enabled = 1 ;
      edtavBode_codigo_Visible = 1 ;
      lblLblbode_codigofilter_Caption = "Código Bodega" ;
      edtavBode_descripcion_Jsonclick = "" ;
      edtavBode_descripcion_Enabled = 1 ;
      bttBtntoggle_Class = "HideFiltersButton" ;
      bttBtntoggle_Caption = "Otros Filtros" ;
      divBode_estadofiltercontainer_Class = "AdvancedContainerItem" ;
      divBode_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divFilterscontainer_Class = "AdvancedContainer" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Bodega" );
      subGrid_Rows = 0 ;
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'cmbavBode_estado'},{av:'AV16Bode_Estado',fld:'vBODE_ESTADO',pic:'',nv:''},{av:'AV21Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Bode_Descripcion',fld:'vBODE_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'lblLblbode_codigofilter_Caption',ctrl:'LBLBODE_CODIGOFILTER',prop:'Caption'},{av:'lblLblbode_estadofilter_Caption',ctrl:'LBLBODE_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("'TOGGLE'","{handler:'e113U1',iparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'}],oparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Caption'},{av:'divGridcell_Class',ctrl:'GRIDCELL',prop:'Class'}]}");
      setEventMetadata("LBLBODE_CODIGOFILTER.CLICK","{handler:'e123U1',iparms:[{av:'divBode_codigofiltercontainer_Class',ctrl:'BODE_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBode_codigofiltercontainer_Class',ctrl:'BODE_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavBode_codigo_Visible',ctrl:'vBODE_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLBODE_ESTADOFILTER.CLICK","{handler:'e133U1',iparms:[{av:'divBode_estadofiltercontainer_Class',ctrl:'BODE_ESTADOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divBode_estadofiltercontainer_Class',ctrl:'BODE_ESTADOFILTERCONTAINER',prop:'Class'},{av:'cmbavBode_estado'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e173U2',iparms:[{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e143U2',iparms:[{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'cmbavBode_estado'},{av:'AV16Bode_Estado',fld:'vBODE_ESTADO',pic:'',nv:''},{av:'AV21Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Bode_Descripcion',fld:'vBODE_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'lblLblbode_codigofilter_Caption',ctrl:'LBLBODE_CODIGOFILTER',prop:'Caption'},{av:'lblLblbode_estadofilter_Caption',ctrl:'LBLBODE_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'cmbavBode_estado'},{av:'AV16Bode_Estado',fld:'vBODE_ESTADO',pic:'',nv:''},{av:'AV21Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Bode_Descripcion',fld:'vBODE_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'lblLblbode_codigofilter_Caption',ctrl:'LBLBODE_CODIGOFILTER',prop:'Caption'},{av:'lblLblbode_estadofilter_Caption',ctrl:'LBLBODE_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'cmbavBode_estado'},{av:'AV16Bode_Estado',fld:'vBODE_ESTADO',pic:'',nv:''},{av:'AV21Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Bode_Descripcion',fld:'vBODE_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'lblLblbode_codigofilter_Caption',ctrl:'LBLBODE_CODIGOFILTER',prop:'Caption'},{av:'lblLblbode_estadofilter_Caption',ctrl:'LBLBODE_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'cmbavBode_estado'},{av:'AV16Bode_Estado',fld:'vBODE_ESTADO',pic:'',nv:''},{av:'AV21Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Bode_Descripcion',fld:'vBODE_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'lblLblbode_codigofilter_Caption',ctrl:'LBLBODE_CODIGOFILTER',prop:'Caption'},{av:'lblLblbode_estadofilter_Caption',ctrl:'LBLBODE_ESTADOFILTER',prop:'Caption'}]}");
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
      AV17Update = "" ;
      AV14Bode_Descripcion = "" ;
      AV15Bode_Codigo = "" ;
      AV16Bode_Estado = "" ;
      AV18ADVANCED_LABEL_TEMPLATE = "" ;
      AV21Pgmname = "" ;
      A31Bode_Codigo = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      lblTitletext_Jsonclick = "" ;
      bttBtninsert_Jsonclick = "" ;
      lblLblbode_codigofilter_Jsonclick = "" ;
      lblLblbode_estadofilter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A251Bode_Descripcion = "" ;
      A674Bode_Estado = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV22Update_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV15Bode_Codigo = "" ;
      lV16Bode_Estado = "" ;
      H003U2_A674Bode_Estado = new String[] {""} ;
      H003U2_n674Bode_Estado = new boolean[] {false} ;
      H003U2_A251Bode_Descripcion = new String[] {""} ;
      H003U2_A31Bode_Codigo = new String[] {""} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV8HTTPRequest = httpContext.getHttpRequest();
      AV9GridState = new com.orions2.SdtGridState(remoteHandle, context);
      AV7Session = httpContext.getWebSession();
      AV10GridStateFilterValue = new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV12TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_bodega__default(),
         new Object[] {
             new Object[] {
            H003U2_A674Bode_Estado, H003U2_n674Bode_Estado, H003U2_A251Bode_Descripcion, H003U2_A31Bode_Codigo
            }
         }
      );
      AV21Pgmname = "WWALM_BODEGA" ;
      /* GeneXus formulas. */
      AV21Pgmname = "WWALM_BODEGA" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID_nEOF ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private short nRC_GXsfl_49 ;
   private short nGXsfl_49_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int edtavBode_descripcion_Enabled ;
   private int edtavBode_codigo_Visible ;
   private int edtavBode_codigo_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int AV11GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String edtavUpdate_Tooltiptext ;
   private String divFilterscontainer_Class ;
   private String divBode_codigofiltercontainer_Class ;
   private String divBode_estadofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_49_idx="0001" ;
   private String edtavUpdate_Internalname ;
   private String AV16Bode_Estado ;
   private String AV18ADVANCED_LABEL_TEMPLATE ;
   private String AV21Pgmname ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTabletop_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String bttBtntoggle_Class ;
   private String StyleString ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Caption ;
   private String bttBtntoggle_Jsonclick ;
   private String lblTitletext_Internalname ;
   private String lblTitletext_Jsonclick ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String edtavBode_descripcion_Internalname ;
   private String edtavBode_descripcion_Jsonclick ;
   private String divFilterscontainer_Internalname ;
   private String divBode_codigofiltercontainer_Internalname ;
   private String lblLblbode_codigofilter_Internalname ;
   private String lblLblbode_codigofilter_Caption ;
   private String lblLblbode_codigofilter_Jsonclick ;
   private String edtavBode_codigo_Internalname ;
   private String edtavBode_codigo_Jsonclick ;
   private String divBode_estadofiltercontainer_Internalname ;
   private String lblLblbode_estadofilter_Internalname ;
   private String lblLblbode_estadofilter_Caption ;
   private String lblLblbode_estadofilter_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridcell_Class ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String A674Bode_Estado ;
   private String edtavUpdate_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtBode_Codigo_Internalname ;
   private String edtBode_Descripcion_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV16Bode_Estado ;
   private String sGXsfl_49_fel_idx="0001" ;
   private String ROClassString ;
   private String edtBode_Codigo_Jsonclick ;
   private String edtBode_Descripcion_Jsonclick ;
   private String sImgUrl ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_49_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n674Bode_Estado ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV17Update_IsBlob ;
   private String AV14Bode_Descripcion ;
   private String AV15Bode_Codigo ;
   private String A31Bode_Codigo ;
   private String A251Bode_Descripcion ;
   private String AV22Update_GXI ;
   private String lV15Bode_Codigo ;
   private String AV17Update ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private HTMLChoice cmbavBode_estado ;
   private HTMLChoice cmbBode_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H003U2_A674Bode_Estado ;
   private boolean[] H003U2_n674Bode_Estado ;
   private String[] H003U2_A251Bode_Descripcion ;
   private String[] H003U2_A31Bode_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwalm_bodega__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H003U2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV15Bode_Codigo ,
                                          String AV16Bode_Estado ,
                                          String A31Bode_Codigo ,
                                          String A674Bode_Estado ,
                                          String AV14Bode_Descripcion ,
                                          String A251Bode_Descripcion )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [2] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      scmdbuf = "SELECT Bode_Estado, Bode_Descripcion, Bode_Codigo FROM ALM_BODEGA" ;
      if ( ! (GXutil.strcmp("", AV15Bode_Codigo)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (Bode_Codigo like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (Bode_Codigo like ?)" ;
         }
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16Bode_Estado)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (Bode_Estado like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (Bode_Estado like ?)" ;
         }
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY Bode_Descripcion" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
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
                  return conditional_H003U2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H003U2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
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
                  stmt.setVarchar(sIdx, (String)parms[2], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 1);
               }
               return;
      }
   }

}

