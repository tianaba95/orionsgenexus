/*
               File: wwalm_tipo_novedad_impl
        Description: Work With Tipo de Novedad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:25.4
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

public final  class wwalm_tipo_novedad_impl extends GXDataArea
{
   public wwalm_tipo_novedad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_tipo_novedad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_tipo_novedad_impl.class ));
   }

   public wwalm_tipo_novedad_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTnov_tipo = new HTMLChoice();
      cmbTNov_Tipo = new HTMLChoice();
      cmbTNov_IngresoMasivo = new HTMLChoice();
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
            AV14TNov_Descripcion = httpContext.GetNextPar( ) ;
            AV15TNov_Tipo = httpContext.GetNextPar( ) ;
            AV16TNov_Codigo = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV17Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_49_Refreshing);
            AV18ADVANCED_LABEL_TEMPLATE = httpContext.GetNextPar( ) ;
            AV21Pgmname = httpContext.GetNextPar( ) ;
            A104TNov_Codigo = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14TNov_Descripcion, AV15TNov_Tipo, AV16TNov_Codigo, AV17Update, AV18ADVANCED_LABEL_TEMPLATE, AV21Pgmname, A104TNov_Codigo) ;
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
      pa3E2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start3E2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141419259");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_tipo_novedad") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTNOV_DESCRIPCION", AV14TNov_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTNOV_TIPO", AV15TNov_Tipo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTNOV_CODIGO", GXutil.ltrim( localUtil.ntoc( AV16TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_49", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_49, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vADVANCED_LABEL_TEMPLATE", GXutil.rtrim( AV18ADVANCED_LABEL_TEMPLATE));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV21Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FILTERSCONTAINER_Class", GXutil.rtrim( divFilterscontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_TIPOFILTERCONTAINER_Class", GXutil.rtrim( divTnov_tipofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divTnov_codigofiltercontainer_Class));
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
         we3E2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt3E2( ) ;
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
      return formatLink("com.orions2.wwalm_tipo_novedad")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_TIPO_NOVEDAD" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Tipo de Novedad" ;
   }

   public void wb3E0( )
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", bttBtntoggle_Caption, bttBtntoggle_Jsonclick, 7, "Ocultar Filtros", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e113e1_client"+"'", TempTags, "", 2, "HLP_WWALM_TIPO_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Tipo de Novedades", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_TIPO_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWALM_TIPO_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-sm-pull-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTnov_descripcion_Internalname, "TNov_Descripcion", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         ClassString = "FilterSearchAttribute" ;
         StyleString = "" ;
         ClassString = "FilterSearchAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavTnov_descripcion_Internalname, AV14TNov_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", (short)(0), 1, edtavTnov_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "Descripción ", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WWALM_TIPO_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTnov_tipofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTnov_tipofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltnov_tipofilter_Internalname, lblLbltnov_tipofilter_Caption, "", "", lblLbltnov_tipofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e123e1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_TIPO_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavTnov_tipo.getInternalname(), "TNov_Tipo", "col-sm-3 FilterComboAttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTnov_tipo, cmbavTnov_tipo.getInternalname(), GXutil.rtrim( AV15TNov_Tipo), 1, cmbavTnov_tipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavTnov_tipo.getVisible(), cmbavTnov_tipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "FilterComboAttribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "", true, "HLP_WWALM_TIPO_NOVEDAD.htm");
         cmbavTnov_tipo.setValue( GXutil.rtrim( AV15TNov_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTnov_tipo.getInternalname(), "Values", cmbavTnov_tipo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTnov_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTnov_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltnov_codigofilter_Internalname, lblLbltnov_codigofilter_Caption, "", "", lblLbltnov_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e133e1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_TIPO_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTnov_codigo_Internalname, "TNov_Codigo", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTnov_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( AV16TNov_Codigo, (byte)(6), (byte)(0), ",", "")), ((edtavTnov_codigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16TNov_Codigo), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV16TNov_Codigo), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTnov_codigo_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTnov_codigo_Visible, edtavTnov_codigo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WWALM_TIPO_NOVEDAD.htm");
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Número de cambios") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Masivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nombre del Campo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Procedimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Usuario que Crea") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Creación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Usuario que modifica") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Modificación") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A769TNov_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A770TNov_Tipo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A771TNov_Nro_Cambios, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A813TNov_IngresoMasivo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A774TNov_Nombre_Campo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A772TNov_Procedimiento);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A773TNov_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A775TNov_UsuarioCrea);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A776TNov_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A777TNov_UsuarioModifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A778TNov_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
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

   public void start3E2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Tipo de Novedad", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup3E0( ) ;
   }

   public void ws3E2( )
   {
      start3E2( ) ;
      evt3E2( ) ;
   }

   public void evt3E2( )
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
                           e143E2 ();
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
                           A104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( edtTNov_Codigo_Internalname), ",", ".")) ;
                           A769TNov_Descripcion = httpContext.cgiGet( edtTNov_Descripcion_Internalname) ;
                           n769TNov_Descripcion = false ;
                           cmbTNov_Tipo.setName( cmbTNov_Tipo.getInternalname() );
                           cmbTNov_Tipo.setValue( httpContext.cgiGet( cmbTNov_Tipo.getInternalname()) );
                           A770TNov_Tipo = httpContext.cgiGet( cmbTNov_Tipo.getInternalname()) ;
                           n770TNov_Tipo = false ;
                           A771TNov_Nro_Cambios = (short)(localUtil.ctol( httpContext.cgiGet( edtTNov_Nro_Cambios_Internalname), ",", ".")) ;
                           n771TNov_Nro_Cambios = false ;
                           cmbTNov_IngresoMasivo.setName( cmbTNov_IngresoMasivo.getInternalname() );
                           cmbTNov_IngresoMasivo.setValue( httpContext.cgiGet( cmbTNov_IngresoMasivo.getInternalname()) );
                           A813TNov_IngresoMasivo = httpContext.cgiGet( cmbTNov_IngresoMasivo.getInternalname()) ;
                           n813TNov_IngresoMasivo = false ;
                           A774TNov_Nombre_Campo = httpContext.cgiGet( edtTNov_Nombre_Campo_Internalname) ;
                           n774TNov_Nombre_Campo = false ;
                           A772TNov_Procedimiento = httpContext.cgiGet( edtTNov_Procedimiento_Internalname) ;
                           n772TNov_Procedimiento = false ;
                           cmbTNov_Estado.setName( cmbTNov_Estado.getInternalname() );
                           cmbTNov_Estado.setValue( httpContext.cgiGet( cmbTNov_Estado.getInternalname()) );
                           A773TNov_Estado = httpContext.cgiGet( cmbTNov_Estado.getInternalname()) ;
                           n773TNov_Estado = false ;
                           A775TNov_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtTNov_UsuarioCrea_Internalname)) ;
                           n775TNov_UsuarioCrea = false ;
                           A776TNov_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtTNov_FechaCrea_Internalname), 0) ;
                           n776TNov_FechaCrea = false ;
                           A777TNov_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtTNov_UsuarioModifica_Internalname)) ;
                           n777TNov_UsuarioModifica = false ;
                           A778TNov_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtTNov_FechaModifica_Internalname), 0) ;
                           n778TNov_FechaModifica = false ;
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
                                 e153E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e163E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e173E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Tnov_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTNOV_DESCRIPCION"), AV14TNov_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tnov_tipo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTNOV_TIPO"), AV15TNov_Tipo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tnov_codigo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTNOV_CODIGO"), ",", ".") != AV16TNov_Codigo )
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

   public void we3E2( )
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

   public void pa3E2( )
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
         cmbavTnov_tipo.setName( "vTNOV_TIPO" );
         cmbavTnov_tipo.setWebtags( "" );
         cmbavTnov_tipo.addItem("", "Todas", (short)(0));
         cmbavTnov_tipo.addItem("T", "Transacción", (short)(0));
         cmbavTnov_tipo.addItem("P", "Consecutivo o Placa", (short)(0));
         cmbavTnov_tipo.addItem("D", "Las dos", (short)(0));
         if ( cmbavTnov_tipo.getItemCount() > 0 )
         {
            AV15TNov_Tipo = cmbavTnov_tipo.getValidValue(AV15TNov_Tipo) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TNov_Tipo", AV15TNov_Tipo);
         }
         GXCCtl = "TNOV_TIPO_" + sGXsfl_49_idx ;
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
         GXCCtl = "TNOV_INGRESOMASIVO_" + sGXsfl_49_idx ;
         cmbTNov_IngresoMasivo.setName( GXCCtl );
         cmbTNov_IngresoMasivo.setWebtags( "" );
         cmbTNov_IngresoMasivo.addItem("", "", (short)(0));
         cmbTNov_IngresoMasivo.addItem("SI", "SI", (short)(0));
         cmbTNov_IngresoMasivo.addItem("NO", "NO", (short)(0));
         if ( cmbTNov_IngresoMasivo.getItemCount() > 0 )
         {
            A813TNov_IngresoMasivo = cmbTNov_IngresoMasivo.getValidValue(A813TNov_IngresoMasivo) ;
            n813TNov_IngresoMasivo = false ;
         }
         GXCCtl = "TNOV_ESTADO_" + sGXsfl_49_idx ;
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
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavTnov_descripcion_Internalname ;
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
                                 String AV14TNov_Descripcion ,
                                 String AV15TNov_Tipo ,
                                 int AV16TNov_Codigo ,
                                 String AV17Update ,
                                 String AV18ADVANCED_LABEL_TEMPLATE ,
                                 String AV21Pgmname ,
                                 int A104TNov_Codigo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf3E2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_CODIGO", GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A769TNov_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_DESCRIPCION", A769TNov_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_TIPO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A770TNov_Tipo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_TIPO", A770TNov_Tipo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_NRO_CAMBIOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A771TNov_Nro_Cambios), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_NRO_CAMBIOS", GXutil.ltrim( localUtil.ntoc( A771TNov_Nro_Cambios, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_INGRESOMASIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A813TNov_IngresoMasivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_INGRESOMASIVO", A813TNov_IngresoMasivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_NOMBRE_CAMPO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A774TNov_Nombre_Campo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_NOMBRE_CAMPO", A774TNov_Nombre_Campo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_PROCEDIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A772TNov_Procedimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_PROCEDIMIENTO", A772TNov_Procedimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A773TNov_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_ESTADO", GXutil.rtrim( A773TNov_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_USUARIOCREA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A775TNov_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_USUARIOCREA", A775TNov_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_FECHACREA", getSecureSignedToken( "", localUtil.format( A776TNov_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_FECHACREA", localUtil.ttoc( A776TNov_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_USUARIOMODIFICA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A777TNov_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_USUARIOMODIFICA", A777TNov_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_FECHAMODIFICA", getSecureSignedToken( "", localUtil.format( A778TNov_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_FECHAMODIFICA", localUtil.ttoc( A778TNov_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavTnov_tipo.getItemCount() > 0 )
      {
         AV15TNov_Tipo = cmbavTnov_tipo.getValidValue(AV15TNov_Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15TNov_Tipo", AV15TNov_Tipo);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf3E2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV21Pgmname = "WWALM_TIPO_NOVEDAD" ;
      Gx_err = (short)(0) ;
   }

   public void rf3E2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(49) ;
      /* Execute user event: Refresh */
      e163E2 ();
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
                                              AV15TNov_Tipo ,
                                              new Integer(AV16TNov_Codigo) ,
                                              A770TNov_Tipo ,
                                              new Integer(A104TNov_Codigo) ,
                                              AV14TNov_Descripcion ,
                                              A769TNov_Descripcion } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         } ) ;
         lV15TNov_Tipo = GXutil.concat( GXutil.rtrim( AV15TNov_Tipo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15TNov_Tipo", AV15TNov_Tipo);
         /* Using cursor H003E2 */
         pr_default.execute(0, new Object[] {lV15TNov_Tipo, new Integer(AV16TNov_Codigo)});
         nGXsfl_49_idx = (short)(1) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_49_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_492( ) ;
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
         {
            A778TNov_FechaModifica = H003E2_A778TNov_FechaModifica[0] ;
            n778TNov_FechaModifica = H003E2_n778TNov_FechaModifica[0] ;
            A777TNov_UsuarioModifica = H003E2_A777TNov_UsuarioModifica[0] ;
            n777TNov_UsuarioModifica = H003E2_n777TNov_UsuarioModifica[0] ;
            A776TNov_FechaCrea = H003E2_A776TNov_FechaCrea[0] ;
            n776TNov_FechaCrea = H003E2_n776TNov_FechaCrea[0] ;
            A775TNov_UsuarioCrea = H003E2_A775TNov_UsuarioCrea[0] ;
            n775TNov_UsuarioCrea = H003E2_n775TNov_UsuarioCrea[0] ;
            A773TNov_Estado = H003E2_A773TNov_Estado[0] ;
            n773TNov_Estado = H003E2_n773TNov_Estado[0] ;
            A772TNov_Procedimiento = H003E2_A772TNov_Procedimiento[0] ;
            n772TNov_Procedimiento = H003E2_n772TNov_Procedimiento[0] ;
            A774TNov_Nombre_Campo = H003E2_A774TNov_Nombre_Campo[0] ;
            n774TNov_Nombre_Campo = H003E2_n774TNov_Nombre_Campo[0] ;
            A813TNov_IngresoMasivo = H003E2_A813TNov_IngresoMasivo[0] ;
            n813TNov_IngresoMasivo = H003E2_n813TNov_IngresoMasivo[0] ;
            A771TNov_Nro_Cambios = H003E2_A771TNov_Nro_Cambios[0] ;
            n771TNov_Nro_Cambios = H003E2_n771TNov_Nro_Cambios[0] ;
            A770TNov_Tipo = H003E2_A770TNov_Tipo[0] ;
            n770TNov_Tipo = H003E2_n770TNov_Tipo[0] ;
            A769TNov_Descripcion = H003E2_A769TNov_Descripcion[0] ;
            n769TNov_Descripcion = H003E2_n769TNov_Descripcion[0] ;
            A104TNov_Codigo = H003E2_A104TNov_Codigo[0] ;
            if ( (GXutil.strcmp("", AV14TNov_Descripcion)==0) || ( GXutil.like( GXutil.upper( A769TNov_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV14TNov_Descripcion), "") , 254 , "%"),  ' ' ) ) )
            {
               e173E2 ();
            }
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(49) ;
         wb3E0( ) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14TNov_Descripcion, AV15TNov_Tipo, AV16TNov_Codigo, AV17Update, AV18ADVANCED_LABEL_TEMPLATE, AV21Pgmname, A104TNov_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14TNov_Descripcion, AV15TNov_Tipo, AV16TNov_Codigo, AV17Update, AV18ADVANCED_LABEL_TEMPLATE, AV21Pgmname, A104TNov_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14TNov_Descripcion, AV15TNov_Tipo, AV16TNov_Codigo, AV17Update, AV18ADVANCED_LABEL_TEMPLATE, AV21Pgmname, A104TNov_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14TNov_Descripcion, AV15TNov_Tipo, AV16TNov_Codigo, AV17Update, AV18ADVANCED_LABEL_TEMPLATE, AV21Pgmname, A104TNov_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14TNov_Descripcion, AV15TNov_Tipo, AV16TNov_Codigo, AV17Update, AV18ADVANCED_LABEL_TEMPLATE, AV21Pgmname, A104TNov_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup3E0( )
   {
      /* Before Start, stand alone formulas. */
      AV21Pgmname = "WWALM_TIPO_NOVEDAD" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e153E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14TNov_Descripcion = httpContext.cgiGet( edtavTnov_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14TNov_Descripcion", AV14TNov_Descripcion);
         cmbavTnov_tipo.setName( cmbavTnov_tipo.getInternalname() );
         cmbavTnov_tipo.setValue( httpContext.cgiGet( cmbavTnov_tipo.getInternalname()) );
         AV15TNov_Tipo = httpContext.cgiGet( cmbavTnov_tipo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15TNov_Tipo", AV15TNov_Tipo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTnov_codigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTnov_codigo_Internalname), ",", ".") > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTNOV_CODIGO");
            GX_FocusControl = edtavTnov_codigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16TNov_Codigo = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TNov_Codigo", GXutil.ltrim( GXutil.str( AV16TNov_Codigo, 6, 0)));
         }
         else
         {
            AV16TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( edtavTnov_codigo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TNov_Codigo", GXutil.ltrim( GXutil.str( AV16TNov_Codigo, 6, 0)));
         }
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
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTNOV_DESCRIPCION"), AV14TNov_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTNOV_TIPO"), AV15TNov_Tipo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTNOV_CODIGO"), ",", ".") != AV16TNov_Codigo )
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
      e153E2 ();
      if (returnInSub) return;
   }

   public void e153E2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV21Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV21Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV17Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV17Update)==0) ? AV22Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV17Update))), !bGXsfl_49_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV17Update), true);
      AV22Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV17Update)==0) ? AV22Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV17Update))), !bGXsfl_49_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV17Update), true);
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_49_Refreshing);
      Form.setCaption( "Tipo de Novedades" );
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

   public void e163E2( )
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
      if ( (GXutil.strcmp("", AV15TNov_Tipo)==0) )
      {
         lblLbltnov_tipofilter_Caption = "Tipo de Novedad" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltnov_tipofilter_Internalname, "Caption", lblLbltnov_tipofilter_Caption, true);
      }
      else
      {
         lblLbltnov_tipofilter_Caption = GXutil.format( AV18ADVANCED_LABEL_TEMPLATE, "Tipo de Novedad", AV15TNov_Tipo, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltnov_tipofilter_Internalname, "Caption", lblLbltnov_tipofilter_Caption, true);
      }
      if ( (0==AV16TNov_Codigo) )
      {
         lblLbltnov_codigofilter_Caption = "Código de la Novedad" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltnov_codigofilter_Internalname, "Caption", lblLbltnov_codigofilter_Caption, true);
      }
      else
      {
         lblLbltnov_codigofilter_Caption = GXutil.format( AV18ADVANCED_LABEL_TEMPLATE, "Código de la Novedad", GXutil.ltrim( GXutil.str( AV16TNov_Codigo, 6, 0)), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltnov_codigofilter_Internalname, "Caption", lblLbltnov_codigofilter_Caption, true);
      }
   }

   private void e173E2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_tipo_novedad") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A104TNov_Codigo,6,0))) ;
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

   public void e143E2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_tipo_novedad") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
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
            AV14TNov_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14TNov_Descripcion", AV14TNov_Descripcion);
            AV15TNov_Tipo = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+2)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TNov_Tipo", AV15TNov_Tipo);
            AV16TNov_Codigo = (int)(GXutil.lval( ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+3)).getgxTv_SdtGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TNov_Codigo", GXutil.ltrim( GXutil.str( AV16TNov_Codigo, 6, 0)));
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
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV14TNov_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV15TNov_Tipo );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( GXutil.str( AV16TNov_Codigo, 6, 0) );
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
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "TIPO DE NOVEDAD" );
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
      pa3E2( ) ;
      ws3E2( ) ;
      we3E2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414192611");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wwalm_tipo_novedad.js", "?201861414192611");
      /* End function include_jscripts */
   }

   public void subsflControlProps_492( )
   {
      edtTNov_Codigo_Internalname = "TNOV_CODIGO_"+sGXsfl_49_idx ;
      edtTNov_Descripcion_Internalname = "TNOV_DESCRIPCION_"+sGXsfl_49_idx ;
      cmbTNov_Tipo.setInternalname( "TNOV_TIPO_"+sGXsfl_49_idx );
      edtTNov_Nro_Cambios_Internalname = "TNOV_NRO_CAMBIOS_"+sGXsfl_49_idx ;
      cmbTNov_IngresoMasivo.setInternalname( "TNOV_INGRESOMASIVO_"+sGXsfl_49_idx );
      edtTNov_Nombre_Campo_Internalname = "TNOV_NOMBRE_CAMPO_"+sGXsfl_49_idx ;
      edtTNov_Procedimiento_Internalname = "TNOV_PROCEDIMIENTO_"+sGXsfl_49_idx ;
      cmbTNov_Estado.setInternalname( "TNOV_ESTADO_"+sGXsfl_49_idx );
      edtTNov_UsuarioCrea_Internalname = "TNOV_USUARIOCREA_"+sGXsfl_49_idx ;
      edtTNov_FechaCrea_Internalname = "TNOV_FECHACREA_"+sGXsfl_49_idx ;
      edtTNov_UsuarioModifica_Internalname = "TNOV_USUARIOMODIFICA_"+sGXsfl_49_idx ;
      edtTNov_FechaModifica_Internalname = "TNOV_FECHAMODIFICA_"+sGXsfl_49_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_49_idx ;
   }

   public void subsflControlProps_fel_492( )
   {
      edtTNov_Codigo_Internalname = "TNOV_CODIGO_"+sGXsfl_49_fel_idx ;
      edtTNov_Descripcion_Internalname = "TNOV_DESCRIPCION_"+sGXsfl_49_fel_idx ;
      cmbTNov_Tipo.setInternalname( "TNOV_TIPO_"+sGXsfl_49_fel_idx );
      edtTNov_Nro_Cambios_Internalname = "TNOV_NRO_CAMBIOS_"+sGXsfl_49_fel_idx ;
      cmbTNov_IngresoMasivo.setInternalname( "TNOV_INGRESOMASIVO_"+sGXsfl_49_fel_idx );
      edtTNov_Nombre_Campo_Internalname = "TNOV_NOMBRE_CAMPO_"+sGXsfl_49_fel_idx ;
      edtTNov_Procedimiento_Internalname = "TNOV_PROCEDIMIENTO_"+sGXsfl_49_fel_idx ;
      cmbTNov_Estado.setInternalname( "TNOV_ESTADO_"+sGXsfl_49_fel_idx );
      edtTNov_UsuarioCrea_Internalname = "TNOV_USUARIOCREA_"+sGXsfl_49_fel_idx ;
      edtTNov_FechaCrea_Internalname = "TNOV_FECHACREA_"+sGXsfl_49_fel_idx ;
      edtTNov_UsuarioModifica_Internalname = "TNOV_USUARIOMODIFICA_"+sGXsfl_49_fel_idx ;
      edtTNov_FechaModifica_Internalname = "TNOV_FECHAMODIFICA_"+sGXsfl_49_fel_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_49_fel_idx ;
   }

   public void sendrow_492( )
   {
      subsflControlProps_492( ) ;
      wb3E0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(49),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Codigo","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Descripcion_Internalname,A769TNov_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(49),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_49_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TNOV_TIPO_" + sGXsfl_49_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTNov_Tipo,cmbTNov_Tipo.getInternalname(),GXutil.rtrim( A770TNov_Tipo),new Integer(1),cmbTNov_Tipo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTNov_Tipo.setValue( GXutil.rtrim( A770TNov_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTNov_Tipo.getInternalname(), "Values", cmbTNov_Tipo.ToJavascriptSource(), !bGXsfl_49_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Nro_Cambios_Internalname,GXutil.ltrim( localUtil.ntoc( A771TNov_Nro_Cambios, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A771TNov_Nro_Cambios), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Nro_Cambios_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(49),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_49_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TNOV_INGRESOMASIVO_" + sGXsfl_49_idx ;
            cmbTNov_IngresoMasivo.setName( GXCCtl );
            cmbTNov_IngresoMasivo.setWebtags( "" );
            cmbTNov_IngresoMasivo.addItem("", "", (short)(0));
            cmbTNov_IngresoMasivo.addItem("SI", "SI", (short)(0));
            cmbTNov_IngresoMasivo.addItem("NO", "NO", (short)(0));
            if ( cmbTNov_IngresoMasivo.getItemCount() > 0 )
            {
               A813TNov_IngresoMasivo = cmbTNov_IngresoMasivo.getValidValue(A813TNov_IngresoMasivo) ;
               n813TNov_IngresoMasivo = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTNov_IngresoMasivo,cmbTNov_IngresoMasivo.getInternalname(),GXutil.rtrim( A813TNov_IngresoMasivo),new Integer(1),cmbTNov_IngresoMasivo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTNov_IngresoMasivo.setValue( GXutil.rtrim( A813TNov_IngresoMasivo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTNov_IngresoMasivo.getInternalname(), "Values", cmbTNov_IngresoMasivo.ToJavascriptSource(), !bGXsfl_49_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Nombre_Campo_Internalname,A774TNov_Nombre_Campo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Nombre_Campo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(49),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Procedimiento_Internalname,A772TNov_Procedimiento,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Procedimiento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(60),new Integer(0),new Integer(0),new Integer(49),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_49_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TNOV_ESTADO_" + sGXsfl_49_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTNov_Estado,cmbTNov_Estado.getInternalname(),GXutil.rtrim( A773TNov_Estado),new Integer(1),cmbTNov_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTNov_Estado.setValue( GXutil.rtrim( A773TNov_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTNov_Estado.getInternalname(), "Values", cmbTNov_Estado.ToJavascriptSource(), !bGXsfl_49_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_UsuarioCrea_Internalname,A775TNov_UsuarioCrea,GXutil.rtrim( localUtil.format( A775TNov_UsuarioCrea, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(49),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_FechaCrea_Internalname,localUtil.ttoc( A776TNov_FechaCrea, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A776TNov_FechaCrea, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_FechaCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(49),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_UsuarioModifica_Internalname,A777TNov_UsuarioModifica,GXutil.rtrim( localUtil.format( A777TNov_UsuarioModifica, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(49),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_FechaModifica_Internalname,localUtil.ttoc( A778TNov_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A778TNov_FechaModifica, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(49),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
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
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_CODIGO"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_DESCRIPCION"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, GXutil.rtrim( localUtil.format( A769TNov_Descripcion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_TIPO"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, GXutil.rtrim( localUtil.format( A770TNov_Tipo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_NRO_CAMBIOS"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, localUtil.format( DecimalUtil.doubleToDec(A771TNov_Nro_Cambios), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_INGRESOMASIVO"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, GXutil.rtrim( localUtil.format( A813TNov_IngresoMasivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_NOMBRE_CAMPO"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, GXutil.rtrim( localUtil.format( A774TNov_Nombre_Campo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_PROCEDIMIENTO"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, GXutil.rtrim( localUtil.format( A772TNov_Procedimiento, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_ESTADO"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, GXutil.rtrim( localUtil.format( A773TNov_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_USUARIOCREA"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, GXutil.rtrim( localUtil.format( A775TNov_UsuarioCrea, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_FECHACREA"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, localUtil.format( A776TNov_FechaCrea, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_USUARIOMODIFICA"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, GXutil.rtrim( localUtil.format( A777TNov_UsuarioModifica, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_FECHAMODIFICA"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, localUtil.format( A778TNov_FechaModifica, "99/99/99 99:99")));
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
      edtavTnov_descripcion_Internalname = "vTNOV_DESCRIPCION" ;
      divTabletop_Internalname = "TABLETOP" ;
      lblLbltnov_tipofilter_Internalname = "LBLTNOV_TIPOFILTER" ;
      cmbavTnov_tipo.setInternalname( "vTNOV_TIPO" );
      divTnov_tipofiltercontainer_Internalname = "TNOV_TIPOFILTERCONTAINER" ;
      lblLbltnov_codigofilter_Internalname = "LBLTNOV_CODIGOFILTER" ;
      edtavTnov_codigo_Internalname = "vTNOV_CODIGO" ;
      divTnov_codigofiltercontainer_Internalname = "TNOV_CODIGOFILTERCONTAINER" ;
      divFilterscontainer_Internalname = "FILTERSCONTAINER" ;
      edtTNov_Codigo_Internalname = "TNOV_CODIGO" ;
      edtTNov_Descripcion_Internalname = "TNOV_DESCRIPCION" ;
      cmbTNov_Tipo.setInternalname( "TNOV_TIPO" );
      edtTNov_Nro_Cambios_Internalname = "TNOV_NRO_CAMBIOS" ;
      cmbTNov_IngresoMasivo.setInternalname( "TNOV_INGRESOMASIVO" );
      edtTNov_Nombre_Campo_Internalname = "TNOV_NOMBRE_CAMPO" ;
      edtTNov_Procedimiento_Internalname = "TNOV_PROCEDIMIENTO" ;
      cmbTNov_Estado.setInternalname( "TNOV_ESTADO" );
      edtTNov_UsuarioCrea_Internalname = "TNOV_USUARIOCREA" ;
      edtTNov_FechaCrea_Internalname = "TNOV_FECHACREA" ;
      edtTNov_UsuarioModifica_Internalname = "TNOV_USUARIOMODIFICA" ;
      edtTNov_FechaModifica_Internalname = "TNOV_FECHAMODIFICA" ;
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
      edtTNov_FechaModifica_Jsonclick = "" ;
      edtTNov_UsuarioModifica_Jsonclick = "" ;
      edtTNov_FechaCrea_Jsonclick = "" ;
      edtTNov_UsuarioCrea_Jsonclick = "" ;
      cmbTNov_Estado.setJsonclick( "" );
      edtTNov_Procedimiento_Jsonclick = "" ;
      edtTNov_Nombre_Campo_Jsonclick = "" ;
      cmbTNov_IngresoMasivo.setJsonclick( "" );
      edtTNov_Nro_Cambios_Jsonclick = "" ;
      cmbTNov_Tipo.setJsonclick( "" );
      edtTNov_Descripcion_Jsonclick = "" ;
      edtTNov_Codigo_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavUpdate_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divGridcell_Class = "col-xs-12 col-sm-9 col-md-10 WWGridCell" ;
      edtavTnov_codigo_Jsonclick = "" ;
      edtavTnov_codigo_Enabled = 1 ;
      edtavTnov_codigo_Visible = 1 ;
      lblLbltnov_codigofilter_Caption = "Código de la Novedad" ;
      cmbavTnov_tipo.setJsonclick( "" );
      cmbavTnov_tipo.setEnabled( 1 );
      cmbavTnov_tipo.setVisible( 1 );
      lblLbltnov_tipofilter_Caption = "Tipo de Novedad" ;
      edtavTnov_descripcion_Enabled = 1 ;
      bttBtntoggle_Class = "HideFiltersButton" ;
      bttBtntoggle_Caption = "Ocultar Filtros" ;
      divTnov_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divTnov_tipofiltercontainer_Class = "AdvancedContainerItem" ;
      divFilterscontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Tipo de Novedad" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A104TNov_Codigo',fld:'TNOV_CODIGO',pic:'ZZZZZ9',hsh:true,nv:0},{av:'cmbavTnov_tipo'},{av:'AV15TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV21Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14TNov_Descripcion',fld:'vTNOV_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLbltnov_tipofilter_Caption',ctrl:'LBLTNOV_TIPOFILTER',prop:'Caption'},{av:'lblLbltnov_codigofilter_Caption',ctrl:'LBLTNOV_CODIGOFILTER',prop:'Caption'}]}");
      setEventMetadata("'TOGGLE'","{handler:'e113E1',iparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'}],oparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Caption'},{av:'divGridcell_Class',ctrl:'GRIDCELL',prop:'Class'}]}");
      setEventMetadata("LBLTNOV_TIPOFILTER.CLICK","{handler:'e123E1',iparms:[{av:'divTnov_tipofiltercontainer_Class',ctrl:'TNOV_TIPOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTnov_tipofiltercontainer_Class',ctrl:'TNOV_TIPOFILTERCONTAINER',prop:'Class'},{av:'cmbavTnov_tipo'}]}");
      setEventMetadata("LBLTNOV_CODIGOFILTER.CLICK","{handler:'e133E1',iparms:[{av:'divTnov_codigofiltercontainer_Class',ctrl:'TNOV_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTnov_codigofiltercontainer_Class',ctrl:'TNOV_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavTnov_codigo_Visible',ctrl:'vTNOV_CODIGO',prop:'Visible'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e173E2',iparms:[{av:'A104TNov_Codigo',fld:'TNOV_CODIGO',pic:'ZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e143E2',iparms:[{av:'A104TNov_Codigo',fld:'TNOV_CODIGO',pic:'ZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A104TNov_Codigo',fld:'TNOV_CODIGO',pic:'ZZZZZ9',hsh:true,nv:0},{av:'cmbavTnov_tipo'},{av:'AV15TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV21Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14TNov_Descripcion',fld:'vTNOV_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLbltnov_tipofilter_Caption',ctrl:'LBLTNOV_TIPOFILTER',prop:'Caption'},{av:'lblLbltnov_codigofilter_Caption',ctrl:'LBLTNOV_CODIGOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A104TNov_Codigo',fld:'TNOV_CODIGO',pic:'ZZZZZ9',hsh:true,nv:0},{av:'cmbavTnov_tipo'},{av:'AV15TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV21Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14TNov_Descripcion',fld:'vTNOV_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLbltnov_tipofilter_Caption',ctrl:'LBLTNOV_TIPOFILTER',prop:'Caption'},{av:'lblLbltnov_codigofilter_Caption',ctrl:'LBLTNOV_CODIGOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A104TNov_Codigo',fld:'TNOV_CODIGO',pic:'ZZZZZ9',hsh:true,nv:0},{av:'cmbavTnov_tipo'},{av:'AV15TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV21Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14TNov_Descripcion',fld:'vTNOV_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLbltnov_tipofilter_Caption',ctrl:'LBLTNOV_TIPOFILTER',prop:'Caption'},{av:'lblLbltnov_codigofilter_Caption',ctrl:'LBLTNOV_CODIGOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A104TNov_Codigo',fld:'TNOV_CODIGO',pic:'ZZZZZ9',hsh:true,nv:0},{av:'cmbavTnov_tipo'},{av:'AV15TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV21Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14TNov_Descripcion',fld:'vTNOV_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLbltnov_tipofilter_Caption',ctrl:'LBLTNOV_TIPOFILTER',prop:'Caption'},{av:'lblLbltnov_codigofilter_Caption',ctrl:'LBLTNOV_CODIGOFILTER',prop:'Caption'}]}");
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
      AV14TNov_Descripcion = "" ;
      AV15TNov_Tipo = "" ;
      AV18ADVANCED_LABEL_TEMPLATE = "" ;
      AV21Pgmname = "" ;
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
      lblLbltnov_tipofilter_Jsonclick = "" ;
      lblLbltnov_codigofilter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A769TNov_Descripcion = "" ;
      A770TNov_Tipo = "" ;
      A813TNov_IngresoMasivo = "" ;
      A774TNov_Nombre_Campo = "" ;
      A772TNov_Procedimiento = "" ;
      A773TNov_Estado = "" ;
      A775TNov_UsuarioCrea = "" ;
      A776TNov_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A777TNov_UsuarioModifica = "" ;
      A778TNov_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV22Update_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV15TNov_Tipo = "" ;
      H003E2_A778TNov_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H003E2_n778TNov_FechaModifica = new boolean[] {false} ;
      H003E2_A777TNov_UsuarioModifica = new String[] {""} ;
      H003E2_n777TNov_UsuarioModifica = new boolean[] {false} ;
      H003E2_A776TNov_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H003E2_n776TNov_FechaCrea = new boolean[] {false} ;
      H003E2_A775TNov_UsuarioCrea = new String[] {""} ;
      H003E2_n775TNov_UsuarioCrea = new boolean[] {false} ;
      H003E2_A773TNov_Estado = new String[] {""} ;
      H003E2_n773TNov_Estado = new boolean[] {false} ;
      H003E2_A772TNov_Procedimiento = new String[] {""} ;
      H003E2_n772TNov_Procedimiento = new boolean[] {false} ;
      H003E2_A774TNov_Nombre_Campo = new String[] {""} ;
      H003E2_n774TNov_Nombre_Campo = new boolean[] {false} ;
      H003E2_A813TNov_IngresoMasivo = new String[] {""} ;
      H003E2_n813TNov_IngresoMasivo = new boolean[] {false} ;
      H003E2_A771TNov_Nro_Cambios = new short[1] ;
      H003E2_n771TNov_Nro_Cambios = new boolean[] {false} ;
      H003E2_A770TNov_Tipo = new String[] {""} ;
      H003E2_n770TNov_Tipo = new boolean[] {false} ;
      H003E2_A769TNov_Descripcion = new String[] {""} ;
      H003E2_n769TNov_Descripcion = new boolean[] {false} ;
      H003E2_A104TNov_Codigo = new int[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_tipo_novedad__default(),
         new Object[] {
             new Object[] {
            H003E2_A778TNov_FechaModifica, H003E2_n778TNov_FechaModifica, H003E2_A777TNov_UsuarioModifica, H003E2_n777TNov_UsuarioModifica, H003E2_A776TNov_FechaCrea, H003E2_n776TNov_FechaCrea, H003E2_A775TNov_UsuarioCrea, H003E2_n775TNov_UsuarioCrea, H003E2_A773TNov_Estado, H003E2_n773TNov_Estado,
            H003E2_A772TNov_Procedimiento, H003E2_n772TNov_Procedimiento, H003E2_A774TNov_Nombre_Campo, H003E2_n774TNov_Nombre_Campo, H003E2_A813TNov_IngresoMasivo, H003E2_n813TNov_IngresoMasivo, H003E2_A771TNov_Nro_Cambios, H003E2_n771TNov_Nro_Cambios, H003E2_A770TNov_Tipo, H003E2_n770TNov_Tipo,
            H003E2_A769TNov_Descripcion, H003E2_n769TNov_Descripcion, H003E2_A104TNov_Codigo
            }
         }
      );
      AV21Pgmname = "WWALM_TIPO_NOVEDAD" ;
      /* GeneXus formulas. */
      AV21Pgmname = "WWALM_TIPO_NOVEDAD" ;
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
   private short A771TNov_Nro_Cambios ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int AV16TNov_Codigo ;
   private int A104TNov_Codigo ;
   private int edtavTnov_descripcion_Enabled ;
   private int edtavTnov_codigo_Enabled ;
   private int edtavTnov_codigo_Visible ;
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
   private String divTnov_tipofiltercontainer_Class ;
   private String divTnov_codigofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_49_idx="0001" ;
   private String edtavUpdate_Internalname ;
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
   private String edtavTnov_descripcion_Internalname ;
   private String divFilterscontainer_Internalname ;
   private String divTnov_tipofiltercontainer_Internalname ;
   private String lblLbltnov_tipofilter_Internalname ;
   private String lblLbltnov_tipofilter_Caption ;
   private String lblLbltnov_tipofilter_Jsonclick ;
   private String divTnov_codigofiltercontainer_Internalname ;
   private String lblLbltnov_codigofilter_Internalname ;
   private String lblLbltnov_codigofilter_Caption ;
   private String lblLbltnov_codigofilter_Jsonclick ;
   private String edtavTnov_codigo_Internalname ;
   private String edtavTnov_codigo_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridcell_Class ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String A773TNov_Estado ;
   private String edtavUpdate_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtTNov_Codigo_Internalname ;
   private String edtTNov_Descripcion_Internalname ;
   private String edtTNov_Nro_Cambios_Internalname ;
   private String edtTNov_Nombre_Campo_Internalname ;
   private String edtTNov_Procedimiento_Internalname ;
   private String edtTNov_UsuarioCrea_Internalname ;
   private String edtTNov_FechaCrea_Internalname ;
   private String edtTNov_UsuarioModifica_Internalname ;
   private String edtTNov_FechaModifica_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String sGXsfl_49_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTNov_Codigo_Jsonclick ;
   private String edtTNov_Descripcion_Jsonclick ;
   private String edtTNov_Nro_Cambios_Jsonclick ;
   private String edtTNov_Nombre_Campo_Jsonclick ;
   private String edtTNov_Procedimiento_Jsonclick ;
   private String edtTNov_UsuarioCrea_Jsonclick ;
   private String edtTNov_FechaCrea_Jsonclick ;
   private String edtTNov_UsuarioModifica_Jsonclick ;
   private String edtTNov_FechaModifica_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A776TNov_FechaCrea ;
   private java.util.Date A778TNov_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_49_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n769TNov_Descripcion ;
   private boolean n770TNov_Tipo ;
   private boolean n771TNov_Nro_Cambios ;
   private boolean n813TNov_IngresoMasivo ;
   private boolean n774TNov_Nombre_Campo ;
   private boolean n772TNov_Procedimiento ;
   private boolean n773TNov_Estado ;
   private boolean n775TNov_UsuarioCrea ;
   private boolean n776TNov_FechaCrea ;
   private boolean n777TNov_UsuarioModifica ;
   private boolean n778TNov_FechaModifica ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV17Update_IsBlob ;
   private String AV14TNov_Descripcion ;
   private String AV15TNov_Tipo ;
   private String A769TNov_Descripcion ;
   private String A770TNov_Tipo ;
   private String A813TNov_IngresoMasivo ;
   private String A774TNov_Nombre_Campo ;
   private String A772TNov_Procedimiento ;
   private String A775TNov_UsuarioCrea ;
   private String A777TNov_UsuarioModifica ;
   private String AV22Update_GXI ;
   private String lV15TNov_Tipo ;
   private String AV17Update ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private HTMLChoice cmbavTnov_tipo ;
   private HTMLChoice cmbTNov_Tipo ;
   private HTMLChoice cmbTNov_IngresoMasivo ;
   private HTMLChoice cmbTNov_Estado ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H003E2_A778TNov_FechaModifica ;
   private boolean[] H003E2_n778TNov_FechaModifica ;
   private String[] H003E2_A777TNov_UsuarioModifica ;
   private boolean[] H003E2_n777TNov_UsuarioModifica ;
   private java.util.Date[] H003E2_A776TNov_FechaCrea ;
   private boolean[] H003E2_n776TNov_FechaCrea ;
   private String[] H003E2_A775TNov_UsuarioCrea ;
   private boolean[] H003E2_n775TNov_UsuarioCrea ;
   private String[] H003E2_A773TNov_Estado ;
   private boolean[] H003E2_n773TNov_Estado ;
   private String[] H003E2_A772TNov_Procedimiento ;
   private boolean[] H003E2_n772TNov_Procedimiento ;
   private String[] H003E2_A774TNov_Nombre_Campo ;
   private boolean[] H003E2_n774TNov_Nombre_Campo ;
   private String[] H003E2_A813TNov_IngresoMasivo ;
   private boolean[] H003E2_n813TNov_IngresoMasivo ;
   private short[] H003E2_A771TNov_Nro_Cambios ;
   private boolean[] H003E2_n771TNov_Nro_Cambios ;
   private String[] H003E2_A770TNov_Tipo ;
   private boolean[] H003E2_n770TNov_Tipo ;
   private String[] H003E2_A769TNov_Descripcion ;
   private boolean[] H003E2_n769TNov_Descripcion ;
   private int[] H003E2_A104TNov_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwalm_tipo_novedad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H003E2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV15TNov_Tipo ,
                                          int AV16TNov_Codigo ,
                                          String A770TNov_Tipo ,
                                          int A104TNov_Codigo ,
                                          String AV14TNov_Descripcion ,
                                          String A769TNov_Descripcion )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [2] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      scmdbuf = "SELECT TNov_FechaModifica, TNov_UsuarioModifica, TNov_FechaCrea, TNov_UsuarioCrea," ;
      scmdbuf = scmdbuf + " TNov_Estado, TNov_Procedimiento, TNov_Nombre_Campo, TNov_IngresoMasivo, TNov_Nro_Cambios," ;
      scmdbuf = scmdbuf + " TNov_Tipo, TNov_Descripcion, TNov_Codigo FROM ALM_TIPO_NOVEDAD" ;
      if ( ! (GXutil.strcmp("", AV15TNov_Tipo)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (TNov_Tipo like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (TNov_Tipo like ?)" ;
         }
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (0==AV16TNov_Codigo) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (TNov_Codigo >= ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (TNov_Codigo >= ?)" ;
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
      scmdbuf = scmdbuf + " ORDER BY TNov_Descripcion" ;
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
                  return conditional_H003E2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H003E2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
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
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(12) ;
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
                  stmt.setVarchar(sIdx, (String)parms[2], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[3]).intValue());
               }
               return;
      }
   }

}

