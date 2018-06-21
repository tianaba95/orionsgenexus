/*
               File: wwalm_tipo_movimiento_impl
        Description: Work With Tipo de movimiento
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:35.62
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

public final  class wwalm_tipo_movimiento_impl extends GXDataArea
{
   public wwalm_tipo_movimiento_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_tipo_movimiento_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_tipo_movimiento_impl.class ));
   }

   public wwalm_tipo_movimiento_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTpmo_tipoe_s = new HTMLChoice();
      cmbTpmo_TipoE_S = new HTMLChoice();
      cmbTpmo_Estado = new HTMLChoice();
      cmbTpmo_Modulo = new HTMLChoice();
      cmbTpmo_IngresaAredante = new HTMLChoice();
      cmbTpmo_IngresaCurso = new HTMLChoice();
      cmbTipo_Tipo = new HTMLChoice();
      cmbTpmo_Controlado = new HTMLChoice();
      cmbTpmo_VidaUtil = new HTMLChoice();
      cmbTpmo_CuentaResponsabilidad = new HTMLChoice();
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
            nRC_GXsfl_59 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_59_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_59_idx = httpContext.GetNextPar( ) ;
            AV18Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_59_Refreshing);
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
            AV14Tpmo_Codigo = httpContext.GetNextPar( ) ;
            AV15Tpmo_Descripcion = httpContext.GetNextPar( ) ;
            AV16Tipo_Descripcion = httpContext.GetNextPar( ) ;
            AV17Tpmo_TipoE_S = httpContext.GetNextPar( ) ;
            AV18Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_59_Refreshing);
            AV19ADVANCED_LABEL_TEMPLATE = httpContext.GetNextPar( ) ;
            AV22Pgmname = httpContext.GetNextPar( ) ;
            A38Tpmo_Codigo = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14Tpmo_Codigo, AV15Tpmo_Descripcion, AV16Tipo_Descripcion, AV17Tpmo_TipoE_S, AV18Update, AV19ADVANCED_LABEL_TEMPLATE, AV22Pgmname, A38Tpmo_Codigo) ;
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
      pa462( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start462( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414193572");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_tipo_movimiento") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTPMO_CODIGO", AV14Tpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTPMO_DESCRIPCION", AV15Tpmo_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTIPO_DESCRIPCION", AV16Tipo_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTPMO_TIPOE_S", AV17Tpmo_TipoE_S);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_59", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_59, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vADVANCED_LABEL_TEMPLATE", GXutil.rtrim( AV19ADVANCED_LABEL_TEMPLATE));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV22Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FILTERSCONTAINER_Class", GXutil.rtrim( divFilterscontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divTipo_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_TIPOE_SFILTERCONTAINER_Class", GXutil.rtrim( divTpmo_tipoe_sfiltercontainer_Class));
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
         we462( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt462( ) ;
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
      return formatLink("com.orions2.wwalm_tipo_movimiento")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_TIPO_MOVIMIENTO" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Tipo de movimiento" ;
   }

   public void wb460( )
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 59, 2, 0)+","+"null"+");", bttBtntoggle_Caption, bttBtntoggle_Jsonclick, 7, "Otros Filtros", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11461_client"+"'", TempTags, "", 2, "HLP_WWALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Tipo de movimiento", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_TIPO_MOVIMIENTO.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 59, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-sm-pull-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTpmo_codigo_Internalname, "Tpmo_Codigo", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTpmo_codigo_Internalname, AV14Tpmo_Codigo, GXutil.rtrim( localUtil.format( AV14Tpmo_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Cod Tipo Movimiento", edtavTpmo_codigo_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavTpmo_codigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_TIPO_MOVIMIENTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_descripcionfilter_Internalname, lblLbltpmo_descripcionfilter_Caption, "", "", lblLbltpmo_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12461_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTpmo_descripcion_Internalname, "Tpmo_Descripcion", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTpmo_descripcion_Internalname, AV15Tpmo_Descripcion, GXutil.rtrim( localUtil.format( AV15Tpmo_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTpmo_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTpmo_descripcion_Visible, edtavTpmo_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_TIPO_MOVIMIENTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTipo_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTipo_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltipo_descripcionfilter_Internalname, lblLbltipo_descripcionfilter_Caption, "", "", lblLbltipo_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13461_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTipo_descripcion_Internalname, "Tipo_Descripcion", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTipo_descripcion_Internalname, AV16Tipo_Descripcion, GXutil.rtrim( localUtil.format( AV16Tipo_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipo_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTipo_descripcion_Visible, edtavTipo_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_TIPO_MOVIMIENTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTpmo_tipoe_sfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTpmo_tipoe_sfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltpmo_tipoe_sfilter_Internalname, lblLbltpmo_tipoe_sfilter_Caption, "", "", lblLbltpmo_tipoe_sfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14461_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_TIPO_MOVIMIENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavTpmo_tipoe_s.getInternalname(), "Tpmo_Tipo E_S", "col-sm-3 FilterComboAttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTpmo_tipoe_s, cmbavTpmo_tipoe_s.getInternalname(), GXutil.rtrim( AV17Tpmo_TipoE_S), 1, cmbavTpmo_tipoe_s.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavTpmo_tipoe_s.getVisible(), cmbavTpmo_tipoe_s.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "FilterComboAttribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "", true, "HLP_WWALM_TIPO_MOVIMIENTO.htm");
         cmbavTpmo_tipoe_s.setValue( GXutil.rtrim( AV17Tpmo_TipoE_S) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTpmo_tipoe_s.getInternalname(), "Values", cmbavTpmo_tipoe_s.ToJavascriptSource(), true);
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"59\">") ;
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
            httpContext.writeValue( "Código Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo de movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Codigo Tipo de Elemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo de Elemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Almacén orígen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacen Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Almacén destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacen Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Creación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Creación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Modifica") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Modifica") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Módulo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Ingresa areadante") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Ingresa curso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Transaccion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Consumo controlado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Solicita vida útil") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Responsabilidad") ;
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
            GridColumn.AddObjectProperty("Value", A38Tpmo_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A313Tpmo_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A253Tipo_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A39Tpmo_AlmacenOrigenId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A312Tpmo_AlmacenOrigenDescrip);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A40Tpmo_AlmacenDestinoId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A314Tpmo_AlmacenDestinoDescrip);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A315Tpmo_TipoE_S);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A679Tpmo_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A317Tpmo_UsuarioCrea);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A318Tpmo_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A319Tpmo_UsuarioModifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A320Tpmo_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A316Tpmo_Modulo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A440Tpmo_IngresaAredante);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A441Tpmo_IngresaCurso);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A480Tipo_Tipo));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A595Tpmo_ConsecutivoTrans, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A633Tpmo_Controlado);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A641Tpmo_VidaUtil);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A680Tpmo_CuentaResponsabilidad);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV18Update));
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
      if ( wbEnd == 59 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_59 = (short)(nGXsfl_59_idx-1) ;
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

   public void start462( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Tipo de movimiento", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup460( ) ;
   }

   public void ws462( )
   {
      start462( ) ;
      evt462( ) ;
   }

   public void evt462( )
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
                           e15462 ();
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
                           nGXsfl_59_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_592( ) ;
                           A38Tpmo_Codigo = httpContext.cgiGet( edtTpmo_Codigo_Internalname) ;
                           A313Tpmo_Descripcion = httpContext.cgiGet( edtTpmo_Descripcion_Internalname) ;
                           A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
                           A253Tipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtTipo_Descripcion_Internalname)) ;
                           A39Tpmo_AlmacenOrigenId = localUtil.ctol( httpContext.cgiGet( edtTpmo_AlmacenOrigenId_Internalname), ",", ".") ;
                           A312Tpmo_AlmacenOrigenDescrip = GXutil.upper( httpContext.cgiGet( edtTpmo_AlmacenOrigenDescrip_Internalname)) ;
                           n312Tpmo_AlmacenOrigenDescrip = false ;
                           A40Tpmo_AlmacenDestinoId = localUtil.ctol( httpContext.cgiGet( edtTpmo_AlmacenDestinoId_Internalname), ",", ".") ;
                           A314Tpmo_AlmacenDestinoDescrip = GXutil.upper( httpContext.cgiGet( edtTpmo_AlmacenDestinoDescrip_Internalname)) ;
                           n314Tpmo_AlmacenDestinoDescrip = false ;
                           cmbTpmo_TipoE_S.setName( cmbTpmo_TipoE_S.getInternalname() );
                           cmbTpmo_TipoE_S.setValue( httpContext.cgiGet( cmbTpmo_TipoE_S.getInternalname()) );
                           A315Tpmo_TipoE_S = httpContext.cgiGet( cmbTpmo_TipoE_S.getInternalname()) ;
                           cmbTpmo_Estado.setName( cmbTpmo_Estado.getInternalname() );
                           cmbTpmo_Estado.setValue( httpContext.cgiGet( cmbTpmo_Estado.getInternalname()) );
                           A679Tpmo_Estado = httpContext.cgiGet( cmbTpmo_Estado.getInternalname()) ;
                           n679Tpmo_Estado = false ;
                           A317Tpmo_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtTpmo_UsuarioCrea_Internalname)) ;
                           A318Tpmo_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtTpmo_FechaCrea_Internalname), 0) ;
                           A319Tpmo_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtTpmo_UsuarioModifica_Internalname)) ;
                           n319Tpmo_UsuarioModifica = false ;
                           A320Tpmo_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtTpmo_FechaModifica_Internalname), 0) ;
                           n320Tpmo_FechaModifica = false ;
                           cmbTpmo_Modulo.setName( cmbTpmo_Modulo.getInternalname() );
                           cmbTpmo_Modulo.setValue( httpContext.cgiGet( cmbTpmo_Modulo.getInternalname()) );
                           A316Tpmo_Modulo = httpContext.cgiGet( cmbTpmo_Modulo.getInternalname()) ;
                           cmbTpmo_IngresaAredante.setName( cmbTpmo_IngresaAredante.getInternalname() );
                           cmbTpmo_IngresaAredante.setValue( httpContext.cgiGet( cmbTpmo_IngresaAredante.getInternalname()) );
                           A440Tpmo_IngresaAredante = httpContext.cgiGet( cmbTpmo_IngresaAredante.getInternalname()) ;
                           cmbTpmo_IngresaCurso.setName( cmbTpmo_IngresaCurso.getInternalname() );
                           cmbTpmo_IngresaCurso.setValue( httpContext.cgiGet( cmbTpmo_IngresaCurso.getInternalname()) );
                           A441Tpmo_IngresaCurso = httpContext.cgiGet( cmbTpmo_IngresaCurso.getInternalname()) ;
                           cmbTipo_Tipo.setName( cmbTipo_Tipo.getInternalname() );
                           cmbTipo_Tipo.setValue( httpContext.cgiGet( cmbTipo_Tipo.getInternalname()) );
                           A480Tipo_Tipo = httpContext.cgiGet( cmbTipo_Tipo.getInternalname()) ;
                           A595Tpmo_ConsecutivoTrans = localUtil.ctol( httpContext.cgiGet( edtTpmo_ConsecutivoTrans_Internalname), ",", ".") ;
                           n595Tpmo_ConsecutivoTrans = false ;
                           cmbTpmo_Controlado.setName( cmbTpmo_Controlado.getInternalname() );
                           cmbTpmo_Controlado.setValue( httpContext.cgiGet( cmbTpmo_Controlado.getInternalname()) );
                           A633Tpmo_Controlado = httpContext.cgiGet( cmbTpmo_Controlado.getInternalname()) ;
                           n633Tpmo_Controlado = false ;
                           cmbTpmo_VidaUtil.setName( cmbTpmo_VidaUtil.getInternalname() );
                           cmbTpmo_VidaUtil.setValue( httpContext.cgiGet( cmbTpmo_VidaUtil.getInternalname()) );
                           A641Tpmo_VidaUtil = httpContext.cgiGet( cmbTpmo_VidaUtil.getInternalname()) ;
                           n641Tpmo_VidaUtil = false ;
                           cmbTpmo_CuentaResponsabilidad.setName( cmbTpmo_CuentaResponsabilidad.getInternalname() );
                           cmbTpmo_CuentaResponsabilidad.setValue( httpContext.cgiGet( cmbTpmo_CuentaResponsabilidad.getInternalname()) );
                           A680Tpmo_CuentaResponsabilidad = httpContext.cgiGet( cmbTpmo_CuentaResponsabilidad.getInternalname()) ;
                           n680Tpmo_CuentaResponsabilidad = false ;
                           AV18Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV18Update)==0) ? AV23Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV18Update))), !bGXsfl_59_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV18Update), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e16462 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e17462 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e18462 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Tpmo_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTPMO_CODIGO"), AV14Tpmo_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tpmo_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTPMO_DESCRIPCION"), AV15Tpmo_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tipo_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTIPO_DESCRIPCION"), AV16Tipo_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tpmo_tipoe_s Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTPMO_TIPOE_S"), AV17Tpmo_TipoE_S) != 0 )
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

   public void we462( )
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

   public void pa462( )
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
         cmbavTpmo_tipoe_s.setName( "vTPMO_TIPOE_S" );
         cmbavTpmo_tipoe_s.setWebtags( "" );
         cmbavTpmo_tipoe_s.addItem("", "(Todos)", (short)(0));
         cmbavTpmo_tipoe_s.addItem("E", "ENTRADA", (short)(0));
         cmbavTpmo_tipoe_s.addItem("S", "SALIDA", (short)(0));
         cmbavTpmo_tipoe_s.addItem("T", "TRASPASO", (short)(0));
         cmbavTpmo_tipoe_s.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbavTpmo_tipoe_s.getItemCount() > 0 )
         {
            AV17Tpmo_TipoE_S = cmbavTpmo_tipoe_s.getValidValue(AV17Tpmo_TipoE_S) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Tpmo_TipoE_S", AV17Tpmo_TipoE_S);
         }
         GXCCtl = "TPMO_TIPOE_S_" + sGXsfl_59_idx ;
         cmbTpmo_TipoE_S.setName( GXCCtl );
         cmbTpmo_TipoE_S.setWebtags( "" );
         cmbTpmo_TipoE_S.addItem("E", "ENTRADA", (short)(0));
         cmbTpmo_TipoE_S.addItem("S", "SALIDA", (short)(0));
         cmbTpmo_TipoE_S.addItem("T", "TRASPASO", (short)(0));
         cmbTpmo_TipoE_S.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbTpmo_TipoE_S.getItemCount() > 0 )
         {
            A315Tpmo_TipoE_S = cmbTpmo_TipoE_S.getValidValue(A315Tpmo_TipoE_S) ;
         }
         GXCCtl = "TPMO_ESTADO_" + sGXsfl_59_idx ;
         cmbTpmo_Estado.setName( GXCCtl );
         cmbTpmo_Estado.setWebtags( "" );
         cmbTpmo_Estado.addItem("A", "Activo", (short)(0));
         cmbTpmo_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbTpmo_Estado.getItemCount() > 0 )
         {
            A679Tpmo_Estado = cmbTpmo_Estado.getValidValue(A679Tpmo_Estado) ;
            n679Tpmo_Estado = false ;
         }
         GXCCtl = "TPMO_MODULO_" + sGXsfl_59_idx ;
         cmbTpmo_Modulo.setName( GXCCtl );
         cmbTpmo_Modulo.setWebtags( "" );
         cmbTpmo_Modulo.addItem("", "", (short)(0));
         cmbTpmo_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbTpmo_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbTpmo_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbTpmo_Modulo.getItemCount() > 0 )
         {
            A316Tpmo_Modulo = cmbTpmo_Modulo.getValidValue(A316Tpmo_Modulo) ;
         }
         GXCCtl = "TPMO_INGRESAAREDANTE_" + sGXsfl_59_idx ;
         cmbTpmo_IngresaAredante.setName( GXCCtl );
         cmbTpmo_IngresaAredante.setWebtags( "" );
         cmbTpmo_IngresaAredante.addItem("", "", (short)(0));
         cmbTpmo_IngresaAredante.addItem("SI", "SI", (short)(0));
         cmbTpmo_IngresaAredante.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_IngresaAredante.getItemCount() > 0 )
         {
            A440Tpmo_IngresaAredante = cmbTpmo_IngresaAredante.getValidValue(A440Tpmo_IngresaAredante) ;
         }
         GXCCtl = "TPMO_INGRESACURSO_" + sGXsfl_59_idx ;
         cmbTpmo_IngresaCurso.setName( GXCCtl );
         cmbTpmo_IngresaCurso.setWebtags( "" );
         cmbTpmo_IngresaCurso.addItem("", "", (short)(0));
         cmbTpmo_IngresaCurso.addItem("SI", "SI", (short)(0));
         cmbTpmo_IngresaCurso.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_IngresaCurso.getItemCount() > 0 )
         {
            A441Tpmo_IngresaCurso = cmbTpmo_IngresaCurso.getValidValue(A441Tpmo_IngresaCurso) ;
         }
         GXCCtl = "TIPO_TIPO_" + sGXsfl_59_idx ;
         cmbTipo_Tipo.setName( GXCCtl );
         cmbTipo_Tipo.setWebtags( "" );
         cmbTipo_Tipo.addItem("C", "Consumo", (short)(0));
         cmbTipo_Tipo.addItem("D", "Devolutivo", (short)(0));
         if ( cmbTipo_Tipo.getItemCount() > 0 )
         {
            A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
         }
         GXCCtl = "TPMO_CONTROLADO_" + sGXsfl_59_idx ;
         cmbTpmo_Controlado.setName( GXCCtl );
         cmbTpmo_Controlado.setWebtags( "" );
         cmbTpmo_Controlado.addItem("", "", (short)(0));
         cmbTpmo_Controlado.addItem("SI", "SI", (short)(0));
         cmbTpmo_Controlado.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_Controlado.getItemCount() > 0 )
         {
            A633Tpmo_Controlado = cmbTpmo_Controlado.getValidValue(A633Tpmo_Controlado) ;
            n633Tpmo_Controlado = false ;
         }
         GXCCtl = "TPMO_VIDAUTIL_" + sGXsfl_59_idx ;
         cmbTpmo_VidaUtil.setName( GXCCtl );
         cmbTpmo_VidaUtil.setWebtags( "" );
         cmbTpmo_VidaUtil.addItem("", "", (short)(0));
         cmbTpmo_VidaUtil.addItem("SI", "SI", (short)(0));
         cmbTpmo_VidaUtil.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_VidaUtil.getItemCount() > 0 )
         {
            A641Tpmo_VidaUtil = cmbTpmo_VidaUtil.getValidValue(A641Tpmo_VidaUtil) ;
            n641Tpmo_VidaUtil = false ;
         }
         GXCCtl = "TPMO_CUENTARESPONSABILIDAD_" + sGXsfl_59_idx ;
         cmbTpmo_CuentaResponsabilidad.setName( GXCCtl );
         cmbTpmo_CuentaResponsabilidad.setWebtags( "" );
         cmbTpmo_CuentaResponsabilidad.addItem("", "", (short)(0));
         cmbTpmo_CuentaResponsabilidad.addItem("SI", "SI", (short)(0));
         cmbTpmo_CuentaResponsabilidad.addItem("NO", "NO", (short)(0));
         if ( cmbTpmo_CuentaResponsabilidad.getItemCount() > 0 )
         {
            A680Tpmo_CuentaResponsabilidad = cmbTpmo_CuentaResponsabilidad.getValidValue(A680Tpmo_CuentaResponsabilidad) ;
            n680Tpmo_CuentaResponsabilidad = false ;
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
            GX_FocusControl = edtavTpmo_codigo_Internalname ;
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
      subsflControlProps_592( ) ;
      while ( nGXsfl_59_idx <= nRC_GXsfl_59 )
      {
         sendrow_592( ) ;
         nGXsfl_59_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_59_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_59_idx+1)) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_592( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV14Tpmo_Codigo ,
                                 String AV15Tpmo_Descripcion ,
                                 String AV16Tipo_Descripcion ,
                                 String AV17Tpmo_TipoE_S ,
                                 String AV18Update ,
                                 String AV19ADVANCED_LABEL_TEMPLATE ,
                                 String AV22Pgmname ,
                                 String A38Tpmo_Codigo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf462( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A38Tpmo_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_CODIGO", A38Tpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A313Tpmo_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_DESCRIPCION", A313Tpmo_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_ALMACENORIGENID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A39Tpmo_AlmacenOrigenId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_ALMACENORIGENID", GXutil.ltrim( localUtil.ntoc( A39Tpmo_AlmacenOrigenId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_ALMACENDESTINOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A40Tpmo_AlmacenDestinoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_ALMACENDESTINOID", GXutil.ltrim( localUtil.ntoc( A40Tpmo_AlmacenDestinoId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_TIPOE_S", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A315Tpmo_TipoE_S, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_TIPOE_S", A315Tpmo_TipoE_S);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A679Tpmo_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_ESTADO", GXutil.rtrim( A679Tpmo_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_USUARIOCREA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A317Tpmo_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_USUARIOCREA", A317Tpmo_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_FECHACREA", getSecureSignedToken( "", localUtil.format( A318Tpmo_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_FECHACREA", localUtil.ttoc( A318Tpmo_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_USUARIOMODIFICA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A319Tpmo_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_USUARIOMODIFICA", A319Tpmo_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_FECHAMODIFICA", getSecureSignedToken( "", localUtil.format( A320Tpmo_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_FECHAMODIFICA", localUtil.ttoc( A320Tpmo_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A316Tpmo_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_MODULO", A316Tpmo_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_INGRESAAREDANTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A440Tpmo_IngresaAredante, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_INGRESAAREDANTE", A440Tpmo_IngresaAredante);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_INGRESACURSO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A441Tpmo_IngresaCurso, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_INGRESACURSO", A441Tpmo_IngresaCurso);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CONSECUTIVOTRANS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A595Tpmo_ConsecutivoTrans), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_CONSECUTIVOTRANS", GXutil.ltrim( localUtil.ntoc( A595Tpmo_ConsecutivoTrans, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CONTROLADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A633Tpmo_Controlado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_CONTROLADO", A633Tpmo_Controlado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_VIDAUTIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A641Tpmo_VidaUtil, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_VIDAUTIL", A641Tpmo_VidaUtil);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CUENTARESPONSABILIDAD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A680Tpmo_CuentaResponsabilidad, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_CUENTARESPONSABILIDAD", A680Tpmo_CuentaResponsabilidad);
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavTpmo_tipoe_s.getItemCount() > 0 )
      {
         AV17Tpmo_TipoE_S = cmbavTpmo_tipoe_s.getValidValue(AV17Tpmo_TipoE_S) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Tpmo_TipoE_S", AV17Tpmo_TipoE_S);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf462( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV22Pgmname = "WWALM_TIPO_MOVIMIENTO" ;
      Gx_err = (short)(0) ;
   }

   public void rf462( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(59) ;
      /* Execute user event: Refresh */
      e17462 ();
      nGXsfl_59_idx = (short)(1) ;
      sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_592( ) ;
      bGXsfl_59_Refreshing = true ;
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
         subsflControlProps_592( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV17Tpmo_TipoE_S ,
                                              A315Tpmo_TipoE_S ,
                                              AV15Tpmo_Descripcion ,
                                              A313Tpmo_Descripcion ,
                                              AV14Tpmo_Codigo ,
                                              A38Tpmo_Codigo ,
                                              AV16Tipo_Descripcion ,
                                              A253Tipo_Descripcion } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV17Tpmo_TipoE_S = GXutil.concat( GXutil.rtrim( AV17Tpmo_TipoE_S), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Tpmo_TipoE_S", AV17Tpmo_TipoE_S);
         /* Using cursor H00462 */
         pr_default.execute(0, new Object[] {lV17Tpmo_TipoE_S});
         nGXsfl_59_idx = (short)(1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_592( ) ;
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
         {
            A680Tpmo_CuentaResponsabilidad = H00462_A680Tpmo_CuentaResponsabilidad[0] ;
            n680Tpmo_CuentaResponsabilidad = H00462_n680Tpmo_CuentaResponsabilidad[0] ;
            A641Tpmo_VidaUtil = H00462_A641Tpmo_VidaUtil[0] ;
            n641Tpmo_VidaUtil = H00462_n641Tpmo_VidaUtil[0] ;
            A633Tpmo_Controlado = H00462_A633Tpmo_Controlado[0] ;
            n633Tpmo_Controlado = H00462_n633Tpmo_Controlado[0] ;
            A595Tpmo_ConsecutivoTrans = H00462_A595Tpmo_ConsecutivoTrans[0] ;
            n595Tpmo_ConsecutivoTrans = H00462_n595Tpmo_ConsecutivoTrans[0] ;
            A480Tipo_Tipo = H00462_A480Tipo_Tipo[0] ;
            A441Tpmo_IngresaCurso = H00462_A441Tpmo_IngresaCurso[0] ;
            A440Tpmo_IngresaAredante = H00462_A440Tpmo_IngresaAredante[0] ;
            A316Tpmo_Modulo = H00462_A316Tpmo_Modulo[0] ;
            A320Tpmo_FechaModifica = H00462_A320Tpmo_FechaModifica[0] ;
            n320Tpmo_FechaModifica = H00462_n320Tpmo_FechaModifica[0] ;
            A319Tpmo_UsuarioModifica = H00462_A319Tpmo_UsuarioModifica[0] ;
            n319Tpmo_UsuarioModifica = H00462_n319Tpmo_UsuarioModifica[0] ;
            A318Tpmo_FechaCrea = H00462_A318Tpmo_FechaCrea[0] ;
            A317Tpmo_UsuarioCrea = H00462_A317Tpmo_UsuarioCrea[0] ;
            A679Tpmo_Estado = H00462_A679Tpmo_Estado[0] ;
            n679Tpmo_Estado = H00462_n679Tpmo_Estado[0] ;
            A315Tpmo_TipoE_S = H00462_A315Tpmo_TipoE_S[0] ;
            A314Tpmo_AlmacenDestinoDescrip = H00462_A314Tpmo_AlmacenDestinoDescrip[0] ;
            n314Tpmo_AlmacenDestinoDescrip = H00462_n314Tpmo_AlmacenDestinoDescrip[0] ;
            A40Tpmo_AlmacenDestinoId = H00462_A40Tpmo_AlmacenDestinoId[0] ;
            A312Tpmo_AlmacenOrigenDescrip = H00462_A312Tpmo_AlmacenOrigenDescrip[0] ;
            n312Tpmo_AlmacenOrigenDescrip = H00462_n312Tpmo_AlmacenOrigenDescrip[0] ;
            A39Tpmo_AlmacenOrigenId = H00462_A39Tpmo_AlmacenOrigenId[0] ;
            A253Tipo_Descripcion = H00462_A253Tipo_Descripcion[0] ;
            A33Tipo_Codigo = H00462_A33Tipo_Codigo[0] ;
            A313Tpmo_Descripcion = H00462_A313Tpmo_Descripcion[0] ;
            A38Tpmo_Codigo = H00462_A38Tpmo_Codigo[0] ;
            A314Tpmo_AlmacenDestinoDescrip = H00462_A314Tpmo_AlmacenDestinoDescrip[0] ;
            n314Tpmo_AlmacenDestinoDescrip = H00462_n314Tpmo_AlmacenDestinoDescrip[0] ;
            A312Tpmo_AlmacenOrigenDescrip = H00462_A312Tpmo_AlmacenOrigenDescrip[0] ;
            n312Tpmo_AlmacenOrigenDescrip = H00462_n312Tpmo_AlmacenOrigenDescrip[0] ;
            A480Tipo_Tipo = H00462_A480Tipo_Tipo[0] ;
            A253Tipo_Descripcion = H00462_A253Tipo_Descripcion[0] ;
            if ( (GXutil.strcmp("", AV15Tpmo_Descripcion)==0) || ( GXutil.like( GXutil.upper( A313Tpmo_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV15Tpmo_Descripcion), "") , 254 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV14Tpmo_Codigo)==0) || ( GXutil.like( GXutil.upper( A38Tpmo_Codigo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV14Tpmo_Codigo), "") , 254 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV16Tipo_Descripcion)==0) || ( GXutil.like( GXutil.upper( A253Tipo_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16Tipo_Descripcion), "") , 254 , "%"),  ' ' ) ) )
                  {
                     e18462 ();
                  }
               }
            }
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(59) ;
         wb460( ) ;
      }
      bGXsfl_59_Refreshing = true ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Tpmo_Codigo, AV15Tpmo_Descripcion, AV16Tipo_Descripcion, AV17Tpmo_TipoE_S, AV18Update, AV19ADVANCED_LABEL_TEMPLATE, AV22Pgmname, A38Tpmo_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Tpmo_Codigo, AV15Tpmo_Descripcion, AV16Tipo_Descripcion, AV17Tpmo_TipoE_S, AV18Update, AV19ADVANCED_LABEL_TEMPLATE, AV22Pgmname, A38Tpmo_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Tpmo_Codigo, AV15Tpmo_Descripcion, AV16Tipo_Descripcion, AV17Tpmo_TipoE_S, AV18Update, AV19ADVANCED_LABEL_TEMPLATE, AV22Pgmname, A38Tpmo_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Tpmo_Codigo, AV15Tpmo_Descripcion, AV16Tipo_Descripcion, AV17Tpmo_TipoE_S, AV18Update, AV19ADVANCED_LABEL_TEMPLATE, AV22Pgmname, A38Tpmo_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Tpmo_Codigo, AV15Tpmo_Descripcion, AV16Tipo_Descripcion, AV17Tpmo_TipoE_S, AV18Update, AV19ADVANCED_LABEL_TEMPLATE, AV22Pgmname, A38Tpmo_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup460( )
   {
      /* Before Start, stand alone formulas. */
      AV22Pgmname = "WWALM_TIPO_MOVIMIENTO" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e16462 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14Tpmo_Codigo = httpContext.cgiGet( edtavTpmo_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Tpmo_Codigo", AV14Tpmo_Codigo);
         AV15Tpmo_Descripcion = httpContext.cgiGet( edtavTpmo_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Tpmo_Descripcion", AV15Tpmo_Descripcion);
         AV16Tipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtavTipo_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Tipo_Descripcion", AV16Tipo_Descripcion);
         cmbavTpmo_tipoe_s.setName( cmbavTpmo_tipoe_s.getInternalname() );
         cmbavTpmo_tipoe_s.setValue( httpContext.cgiGet( cmbavTpmo_tipoe_s.getInternalname()) );
         AV17Tpmo_TipoE_S = httpContext.cgiGet( cmbavTpmo_tipoe_s.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Tpmo_TipoE_S", AV17Tpmo_TipoE_S);
         /* Read saved values. */
         nRC_GXsfl_59 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_59"), ",", ".")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTPMO_CODIGO"), AV14Tpmo_Codigo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTPMO_DESCRIPCION"), AV15Tpmo_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTIPO_DESCRIPCION"), AV16Tipo_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTPMO_TIPOE_S"), AV17Tpmo_TipoE_S) != 0 )
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
      e16462 ();
      if (returnInSub) return;
   }

   public void e16462( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV22Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV22Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      divGridcell_Class = "WWGridCellExpanded" ;
      httpContext.ajax_rsp_assign_prop("", false, divGridcell_Internalname, "Class", divGridcell_Class, true);
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV18Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV18Update)==0) ? AV23Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV18Update))), !bGXsfl_59_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV18Update), true);
      AV23Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV18Update)==0) ? AV23Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV18Update))), !bGXsfl_59_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV18Update), true);
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_59_Refreshing);
      AV17Tpmo_TipoE_S = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Tpmo_TipoE_S", AV17Tpmo_TipoE_S);
      Form.setCaption( "Lista tipo de movimientos" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV19ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ADVANCED_LABEL_TEMPLATE", AV19ADVANCED_LABEL_TEMPLATE);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
   }

   public void e17462( )
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
      if ( (GXutil.strcmp("", AV15Tpmo_Descripcion)==0) )
      {
         lblLbltpmo_descripcionfilter_Caption = "Tipo de movimiento" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltpmo_descripcionfilter_Internalname, "Caption", lblLbltpmo_descripcionfilter_Caption, true);
      }
      else
      {
         lblLbltpmo_descripcionfilter_Caption = GXutil.format( AV19ADVANCED_LABEL_TEMPLATE, "Tipo de movimiento", AV15Tpmo_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltpmo_descripcionfilter_Internalname, "Caption", lblLbltpmo_descripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV16Tipo_Descripcion)==0) )
      {
         lblLbltipo_descripcionfilter_Caption = "Tipo de Elemento" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltipo_descripcionfilter_Internalname, "Caption", lblLbltipo_descripcionfilter_Caption, true);
      }
      else
      {
         lblLbltipo_descripcionfilter_Caption = GXutil.format( AV19ADVANCED_LABEL_TEMPLATE, "Tipo de Elemento", AV16Tipo_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltipo_descripcionfilter_Internalname, "Caption", lblLbltipo_descripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV17Tpmo_TipoE_S)==0) )
      {
         lblLbltpmo_tipoe_sfilter_Caption = "Tipo E/S" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltpmo_tipoe_sfilter_Internalname, "Caption", lblLbltpmo_tipoe_sfilter_Caption, true);
      }
      else
      {
         lblLbltpmo_tipoe_sfilter_Caption = GXutil.format( AV19ADVANCED_LABEL_TEMPLATE, "Tipo E/S", AV17Tpmo_TipoE_S, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltpmo_tipoe_sfilter_Internalname, "Caption", lblLbltpmo_tipoe_sfilter_Caption, true);
      }
   }

   private void e18462( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_tipo_movimiento") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.rtrim(A38Tpmo_Codigo)) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(59) ;
      }
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
      {
         sendrow_592( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_59_Refreshing )
      {
         httpContext.doAjaxLoad(59, GridRow);
      }
   }

   public void e15462( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_tipo_movimiento") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.rtrim("")));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV8HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV9GridState.fromxml(AV7Session.getValue(AV22Pgmname+"GridState"), null, null);
         if ( AV9GridState.getgxTv_SdtGridState_Filtervalues().size() >= 4 )
         {
            AV14Tpmo_Codigo = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Tpmo_Codigo", AV14Tpmo_Codigo);
            AV15Tpmo_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+2)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Tpmo_Descripcion", AV15Tpmo_Descripcion);
            AV16Tipo_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+3)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Tipo_Descripcion", AV16Tipo_Descripcion);
            AV17Tpmo_TipoE_S = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+4)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Tpmo_TipoE_S", AV17Tpmo_TipoE_S);
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
      AV9GridState.fromxml(AV7Session.getValue(AV22Pgmname+"GridState"), null, null);
      AV9GridState.setgxTv_SdtGridState_Currentpage( (short)(subgrid_currentpage( )) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().clear();
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV14Tpmo_Codigo );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV15Tpmo_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV16Tipo_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV17Tpmo_TipoE_S );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV7Session.setValue(AV22Pgmname+"GridState", AV9GridState.toxml(false, true, "GridState", "ACBSENA"));
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV12TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV22Pgmname );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV8HTTPRequest.getScriptName()+"?"+AV8HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_TIPO_MOVIMIENTO" );
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
      pa462( ) ;
      ws462( ) ;
      we462( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414193740");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wwalm_tipo_movimiento.js", "?201861414193741");
      /* End function include_jscripts */
   }

   public void subsflControlProps_592( )
   {
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO_"+sGXsfl_59_idx ;
      edtTpmo_Descripcion_Internalname = "TPMO_DESCRIPCION_"+sGXsfl_59_idx ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO_"+sGXsfl_59_idx ;
      edtTipo_Descripcion_Internalname = "TIPO_DESCRIPCION_"+sGXsfl_59_idx ;
      edtTpmo_AlmacenOrigenId_Internalname = "TPMO_ALMACENORIGENID_"+sGXsfl_59_idx ;
      edtTpmo_AlmacenOrigenDescrip_Internalname = "TPMO_ALMACENORIGENDESCRIP_"+sGXsfl_59_idx ;
      edtTpmo_AlmacenDestinoId_Internalname = "TPMO_ALMACENDESTINOID_"+sGXsfl_59_idx ;
      edtTpmo_AlmacenDestinoDescrip_Internalname = "TPMO_ALMACENDESTINODESCRIP_"+sGXsfl_59_idx ;
      cmbTpmo_TipoE_S.setInternalname( "TPMO_TIPOE_S_"+sGXsfl_59_idx );
      cmbTpmo_Estado.setInternalname( "TPMO_ESTADO_"+sGXsfl_59_idx );
      edtTpmo_UsuarioCrea_Internalname = "TPMO_USUARIOCREA_"+sGXsfl_59_idx ;
      edtTpmo_FechaCrea_Internalname = "TPMO_FECHACREA_"+sGXsfl_59_idx ;
      edtTpmo_UsuarioModifica_Internalname = "TPMO_USUARIOMODIFICA_"+sGXsfl_59_idx ;
      edtTpmo_FechaModifica_Internalname = "TPMO_FECHAMODIFICA_"+sGXsfl_59_idx ;
      cmbTpmo_Modulo.setInternalname( "TPMO_MODULO_"+sGXsfl_59_idx );
      cmbTpmo_IngresaAredante.setInternalname( "TPMO_INGRESAAREDANTE_"+sGXsfl_59_idx );
      cmbTpmo_IngresaCurso.setInternalname( "TPMO_INGRESACURSO_"+sGXsfl_59_idx );
      cmbTipo_Tipo.setInternalname( "TIPO_TIPO_"+sGXsfl_59_idx );
      edtTpmo_ConsecutivoTrans_Internalname = "TPMO_CONSECUTIVOTRANS_"+sGXsfl_59_idx ;
      cmbTpmo_Controlado.setInternalname( "TPMO_CONTROLADO_"+sGXsfl_59_idx );
      cmbTpmo_VidaUtil.setInternalname( "TPMO_VIDAUTIL_"+sGXsfl_59_idx );
      cmbTpmo_CuentaResponsabilidad.setInternalname( "TPMO_CUENTARESPONSABILIDAD_"+sGXsfl_59_idx );
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_59_idx ;
   }

   public void subsflControlProps_fel_592( )
   {
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO_"+sGXsfl_59_fel_idx ;
      edtTpmo_Descripcion_Internalname = "TPMO_DESCRIPCION_"+sGXsfl_59_fel_idx ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO_"+sGXsfl_59_fel_idx ;
      edtTipo_Descripcion_Internalname = "TIPO_DESCRIPCION_"+sGXsfl_59_fel_idx ;
      edtTpmo_AlmacenOrigenId_Internalname = "TPMO_ALMACENORIGENID_"+sGXsfl_59_fel_idx ;
      edtTpmo_AlmacenOrigenDescrip_Internalname = "TPMO_ALMACENORIGENDESCRIP_"+sGXsfl_59_fel_idx ;
      edtTpmo_AlmacenDestinoId_Internalname = "TPMO_ALMACENDESTINOID_"+sGXsfl_59_fel_idx ;
      edtTpmo_AlmacenDestinoDescrip_Internalname = "TPMO_ALMACENDESTINODESCRIP_"+sGXsfl_59_fel_idx ;
      cmbTpmo_TipoE_S.setInternalname( "TPMO_TIPOE_S_"+sGXsfl_59_fel_idx );
      cmbTpmo_Estado.setInternalname( "TPMO_ESTADO_"+sGXsfl_59_fel_idx );
      edtTpmo_UsuarioCrea_Internalname = "TPMO_USUARIOCREA_"+sGXsfl_59_fel_idx ;
      edtTpmo_FechaCrea_Internalname = "TPMO_FECHACREA_"+sGXsfl_59_fel_idx ;
      edtTpmo_UsuarioModifica_Internalname = "TPMO_USUARIOMODIFICA_"+sGXsfl_59_fel_idx ;
      edtTpmo_FechaModifica_Internalname = "TPMO_FECHAMODIFICA_"+sGXsfl_59_fel_idx ;
      cmbTpmo_Modulo.setInternalname( "TPMO_MODULO_"+sGXsfl_59_fel_idx );
      cmbTpmo_IngresaAredante.setInternalname( "TPMO_INGRESAAREDANTE_"+sGXsfl_59_fel_idx );
      cmbTpmo_IngresaCurso.setInternalname( "TPMO_INGRESACURSO_"+sGXsfl_59_fel_idx );
      cmbTipo_Tipo.setInternalname( "TIPO_TIPO_"+sGXsfl_59_fel_idx );
      edtTpmo_ConsecutivoTrans_Internalname = "TPMO_CONSECUTIVOTRANS_"+sGXsfl_59_fel_idx ;
      cmbTpmo_Controlado.setInternalname( "TPMO_CONTROLADO_"+sGXsfl_59_fel_idx );
      cmbTpmo_VidaUtil.setInternalname( "TPMO_VIDAUTIL_"+sGXsfl_59_fel_idx );
      cmbTpmo_CuentaResponsabilidad.setInternalname( "TPMO_CUENTARESPONSABILIDAD_"+sGXsfl_59_fel_idx );
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_59_fel_idx ;
   }

   public void sendrow_592( )
   {
      subsflControlProps_592( ) ;
      wb460( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_59_idx <= subgrid_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_59_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_59_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_Codigo_Internalname,A38Tpmo_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_Descripcion_Internalname,A313Tpmo_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipo_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipo_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipo_Descripcion_Internalname,A253Tipo_Descripcion,GXutil.rtrim( localUtil.format( A253Tipo_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipo_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_AlmacenOrigenId_Internalname,GXutil.ltrim( localUtil.ntoc( A39Tpmo_AlmacenOrigenId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A39Tpmo_AlmacenOrigenId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_AlmacenOrigenId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_AlmacenOrigenDescrip_Internalname,A312Tpmo_AlmacenOrigenDescrip,GXutil.rtrim( localUtil.format( A312Tpmo_AlmacenOrigenDescrip, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_AlmacenOrigenDescrip_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_AlmacenDestinoId_Internalname,GXutil.ltrim( localUtil.ntoc( A40Tpmo_AlmacenDestinoId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A40Tpmo_AlmacenDestinoId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_AlmacenDestinoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_AlmacenDestinoDescrip_Internalname,A314Tpmo_AlmacenDestinoDescrip,GXutil.rtrim( localUtil.format( A314Tpmo_AlmacenDestinoDescrip, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_AlmacenDestinoDescrip_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_59_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TPMO_TIPOE_S_" + sGXsfl_59_idx ;
            cmbTpmo_TipoE_S.setName( GXCCtl );
            cmbTpmo_TipoE_S.setWebtags( "" );
            cmbTpmo_TipoE_S.addItem("E", "ENTRADA", (short)(0));
            cmbTpmo_TipoE_S.addItem("S", "SALIDA", (short)(0));
            cmbTpmo_TipoE_S.addItem("T", "TRASPASO", (short)(0));
            cmbTpmo_TipoE_S.addItem("R", "RECUPERACIÓN", (short)(0));
            if ( cmbTpmo_TipoE_S.getItemCount() > 0 )
            {
               A315Tpmo_TipoE_S = cmbTpmo_TipoE_S.getValidValue(A315Tpmo_TipoE_S) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_TipoE_S,cmbTpmo_TipoE_S.getInternalname(),GXutil.rtrim( A315Tpmo_TipoE_S),new Integer(1),cmbTpmo_TipoE_S.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_TipoE_S.setValue( GXutil.rtrim( A315Tpmo_TipoE_S) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_TipoE_S.getInternalname(), "Values", cmbTpmo_TipoE_S.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_59_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TPMO_ESTADO_" + sGXsfl_59_idx ;
            cmbTpmo_Estado.setName( GXCCtl );
            cmbTpmo_Estado.setWebtags( "" );
            cmbTpmo_Estado.addItem("A", "Activo", (short)(0));
            cmbTpmo_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbTpmo_Estado.getItemCount() > 0 )
            {
               A679Tpmo_Estado = cmbTpmo_Estado.getValidValue(A679Tpmo_Estado) ;
               n679Tpmo_Estado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_Estado,cmbTpmo_Estado.getInternalname(),GXutil.rtrim( A679Tpmo_Estado),new Integer(1),cmbTpmo_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_Estado.setValue( GXutil.rtrim( A679Tpmo_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_Estado.getInternalname(), "Values", cmbTpmo_Estado.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_UsuarioCrea_Internalname,A317Tpmo_UsuarioCrea,GXutil.rtrim( localUtil.format( A317Tpmo_UsuarioCrea, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_FechaCrea_Internalname,localUtil.ttoc( A318Tpmo_FechaCrea, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A318Tpmo_FechaCrea, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_FechaCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_UsuarioModifica_Internalname,A319Tpmo_UsuarioModifica,GXutil.rtrim( localUtil.format( A319Tpmo_UsuarioModifica, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_FechaModifica_Internalname,localUtil.ttoc( A320Tpmo_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A320Tpmo_FechaModifica, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_59_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TPMO_MODULO_" + sGXsfl_59_idx ;
            cmbTpmo_Modulo.setName( GXCCtl );
            cmbTpmo_Modulo.setWebtags( "" );
            cmbTpmo_Modulo.addItem("", "", (short)(0));
            cmbTpmo_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            cmbTpmo_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
            cmbTpmo_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
            if ( cmbTpmo_Modulo.getItemCount() > 0 )
            {
               A316Tpmo_Modulo = cmbTpmo_Modulo.getValidValue(A316Tpmo_Modulo) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_Modulo,cmbTpmo_Modulo.getInternalname(),GXutil.rtrim( A316Tpmo_Modulo),new Integer(1),cmbTpmo_Modulo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_Modulo.setValue( GXutil.rtrim( A316Tpmo_Modulo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_Modulo.getInternalname(), "Values", cmbTpmo_Modulo.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_59_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TPMO_INGRESAAREDANTE_" + sGXsfl_59_idx ;
            cmbTpmo_IngresaAredante.setName( GXCCtl );
            cmbTpmo_IngresaAredante.setWebtags( "" );
            cmbTpmo_IngresaAredante.addItem("", "", (short)(0));
            cmbTpmo_IngresaAredante.addItem("SI", "SI", (short)(0));
            cmbTpmo_IngresaAredante.addItem("NO", "NO", (short)(0));
            if ( cmbTpmo_IngresaAredante.getItemCount() > 0 )
            {
               A440Tpmo_IngresaAredante = cmbTpmo_IngresaAredante.getValidValue(A440Tpmo_IngresaAredante) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_IngresaAredante,cmbTpmo_IngresaAredante.getInternalname(),GXutil.rtrim( A440Tpmo_IngresaAredante),new Integer(1),cmbTpmo_IngresaAredante.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_IngresaAredante.setValue( GXutil.rtrim( A440Tpmo_IngresaAredante) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_IngresaAredante.getInternalname(), "Values", cmbTpmo_IngresaAredante.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_59_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TPMO_INGRESACURSO_" + sGXsfl_59_idx ;
            cmbTpmo_IngresaCurso.setName( GXCCtl );
            cmbTpmo_IngresaCurso.setWebtags( "" );
            cmbTpmo_IngresaCurso.addItem("", "", (short)(0));
            cmbTpmo_IngresaCurso.addItem("SI", "SI", (short)(0));
            cmbTpmo_IngresaCurso.addItem("NO", "NO", (short)(0));
            if ( cmbTpmo_IngresaCurso.getItemCount() > 0 )
            {
               A441Tpmo_IngresaCurso = cmbTpmo_IngresaCurso.getValidValue(A441Tpmo_IngresaCurso) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_IngresaCurso,cmbTpmo_IngresaCurso.getInternalname(),GXutil.rtrim( A441Tpmo_IngresaCurso),new Integer(1),cmbTpmo_IngresaCurso.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_IngresaCurso.setValue( GXutil.rtrim( A441Tpmo_IngresaCurso) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_IngresaCurso.getInternalname(), "Values", cmbTpmo_IngresaCurso.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         GXCCtl = "TIPO_TIPO_" + sGXsfl_59_idx ;
         cmbTipo_Tipo.setName( GXCCtl );
         cmbTipo_Tipo.setWebtags( "" );
         cmbTipo_Tipo.addItem("C", "Consumo", (short)(0));
         cmbTipo_Tipo.addItem("D", "Devolutivo", (short)(0));
         if ( cmbTipo_Tipo.getItemCount() > 0 )
         {
            A480Tipo_Tipo = cmbTipo_Tipo.getValidValue(A480Tipo_Tipo) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTipo_Tipo,cmbTipo_Tipo.getInternalname(),GXutil.rtrim( A480Tipo_Tipo),new Integer(1),cmbTipo_Tipo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(0),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTipo_Tipo.setValue( GXutil.rtrim( A480Tipo_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTipo_Tipo.getInternalname(), "Values", cmbTipo_Tipo.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpmo_ConsecutivoTrans_Internalname,GXutil.ltrim( localUtil.ntoc( A595Tpmo_ConsecutivoTrans, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A595Tpmo_ConsecutivoTrans), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpmo_ConsecutivoTrans_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_59_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TPMO_CONTROLADO_" + sGXsfl_59_idx ;
            cmbTpmo_Controlado.setName( GXCCtl );
            cmbTpmo_Controlado.setWebtags( "" );
            cmbTpmo_Controlado.addItem("", "", (short)(0));
            cmbTpmo_Controlado.addItem("SI", "SI", (short)(0));
            cmbTpmo_Controlado.addItem("NO", "NO", (short)(0));
            if ( cmbTpmo_Controlado.getItemCount() > 0 )
            {
               A633Tpmo_Controlado = cmbTpmo_Controlado.getValidValue(A633Tpmo_Controlado) ;
               n633Tpmo_Controlado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_Controlado,cmbTpmo_Controlado.getInternalname(),GXutil.rtrim( A633Tpmo_Controlado),new Integer(1),cmbTpmo_Controlado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_Controlado.setValue( GXutil.rtrim( A633Tpmo_Controlado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_Controlado.getInternalname(), "Values", cmbTpmo_Controlado.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_59_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TPMO_VIDAUTIL_" + sGXsfl_59_idx ;
            cmbTpmo_VidaUtil.setName( GXCCtl );
            cmbTpmo_VidaUtil.setWebtags( "" );
            cmbTpmo_VidaUtil.addItem("", "", (short)(0));
            cmbTpmo_VidaUtil.addItem("SI", "SI", (short)(0));
            cmbTpmo_VidaUtil.addItem("NO", "NO", (short)(0));
            if ( cmbTpmo_VidaUtil.getItemCount() > 0 )
            {
               A641Tpmo_VidaUtil = cmbTpmo_VidaUtil.getValidValue(A641Tpmo_VidaUtil) ;
               n641Tpmo_VidaUtil = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_VidaUtil,cmbTpmo_VidaUtil.getInternalname(),GXutil.rtrim( A641Tpmo_VidaUtil),new Integer(1),cmbTpmo_VidaUtil.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_VidaUtil.setValue( GXutil.rtrim( A641Tpmo_VidaUtil) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_VidaUtil.getInternalname(), "Values", cmbTpmo_VidaUtil.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_59_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TPMO_CUENTARESPONSABILIDAD_" + sGXsfl_59_idx ;
            cmbTpmo_CuentaResponsabilidad.setName( GXCCtl );
            cmbTpmo_CuentaResponsabilidad.setWebtags( "" );
            cmbTpmo_CuentaResponsabilidad.addItem("", "", (short)(0));
            cmbTpmo_CuentaResponsabilidad.addItem("SI", "SI", (short)(0));
            cmbTpmo_CuentaResponsabilidad.addItem("NO", "NO", (short)(0));
            if ( cmbTpmo_CuentaResponsabilidad.getItemCount() > 0 )
            {
               A680Tpmo_CuentaResponsabilidad = cmbTpmo_CuentaResponsabilidad.getValidValue(A680Tpmo_CuentaResponsabilidad) ;
               n680Tpmo_CuentaResponsabilidad = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTpmo_CuentaResponsabilidad,cmbTpmo_CuentaResponsabilidad.getInternalname(),GXutil.rtrim( A680Tpmo_CuentaResponsabilidad),new Integer(1),cmbTpmo_CuentaResponsabilidad.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTpmo_CuentaResponsabilidad.setValue( GXutil.rtrim( A680Tpmo_CuentaResponsabilidad) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTpmo_CuentaResponsabilidad.getInternalname(), "Values", cmbTpmo_CuentaResponsabilidad.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV18Update_IsBlob = (boolean)(((GXutil.strcmp("", AV18Update)==0)&&(GXutil.strcmp("", AV23Update_GXI)==0))||!(GXutil.strcmp("", AV18Update)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV18Update)==0) ? AV23Update_GXI : httpContext.getResourceRelative(AV18Update)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,sImgUrl,edtavUpdate_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavUpdate_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV18Update_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CODIGO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A38Tpmo_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_DESCRIPCION"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A313Tpmo_Descripcion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPO_CODIGO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_ALMACENORIGENID"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( DecimalUtil.doubleToDec(A39Tpmo_AlmacenOrigenId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_ALMACENDESTINOID"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( DecimalUtil.doubleToDec(A40Tpmo_AlmacenDestinoId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_TIPOE_S"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A315Tpmo_TipoE_S, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_ESTADO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A679Tpmo_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_USUARIOCREA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A317Tpmo_UsuarioCrea, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_FECHACREA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( A318Tpmo_FechaCrea, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_USUARIOMODIFICA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A319Tpmo_UsuarioModifica, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_FECHAMODIFICA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( A320Tpmo_FechaModifica, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_MODULO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A316Tpmo_Modulo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_INGRESAAREDANTE"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A440Tpmo_IngresaAredante, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_INGRESACURSO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A441Tpmo_IngresaCurso, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CONSECUTIVOTRANS"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( DecimalUtil.doubleToDec(A595Tpmo_ConsecutivoTrans), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CONTROLADO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A633Tpmo_Controlado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_VIDAUTIL"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A641Tpmo_VidaUtil, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPMO_CUENTARESPONSABILIDAD"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A680Tpmo_CuentaResponsabilidad, ""))));
         GridContainer.AddRow(GridRow);
         nGXsfl_59_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_59_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_59_idx+1)) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_592( ) ;
      }
      /* End function sendrow_592 */
   }

   public void init_default_properties( )
   {
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      lblTitletext_Internalname = "TITLETEXT" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      edtavTpmo_codigo_Internalname = "vTPMO_CODIGO" ;
      divTabletop_Internalname = "TABLETOP" ;
      lblLbltpmo_descripcionfilter_Internalname = "LBLTPMO_DESCRIPCIONFILTER" ;
      edtavTpmo_descripcion_Internalname = "vTPMO_DESCRIPCION" ;
      divTpmo_descripcionfiltercontainer_Internalname = "TPMO_DESCRIPCIONFILTERCONTAINER" ;
      lblLbltipo_descripcionfilter_Internalname = "LBLTIPO_DESCRIPCIONFILTER" ;
      edtavTipo_descripcion_Internalname = "vTIPO_DESCRIPCION" ;
      divTipo_descripcionfiltercontainer_Internalname = "TIPO_DESCRIPCIONFILTERCONTAINER" ;
      lblLbltpmo_tipoe_sfilter_Internalname = "LBLTPMO_TIPOE_SFILTER" ;
      cmbavTpmo_tipoe_s.setInternalname( "vTPMO_TIPOE_S" );
      divTpmo_tipoe_sfiltercontainer_Internalname = "TPMO_TIPOE_SFILTERCONTAINER" ;
      divFilterscontainer_Internalname = "FILTERSCONTAINER" ;
      edtTpmo_Codigo_Internalname = "TPMO_CODIGO" ;
      edtTpmo_Descripcion_Internalname = "TPMO_DESCRIPCION" ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO" ;
      edtTipo_Descripcion_Internalname = "TIPO_DESCRIPCION" ;
      edtTpmo_AlmacenOrigenId_Internalname = "TPMO_ALMACENORIGENID" ;
      edtTpmo_AlmacenOrigenDescrip_Internalname = "TPMO_ALMACENORIGENDESCRIP" ;
      edtTpmo_AlmacenDestinoId_Internalname = "TPMO_ALMACENDESTINOID" ;
      edtTpmo_AlmacenDestinoDescrip_Internalname = "TPMO_ALMACENDESTINODESCRIP" ;
      cmbTpmo_TipoE_S.setInternalname( "TPMO_TIPOE_S" );
      cmbTpmo_Estado.setInternalname( "TPMO_ESTADO" );
      edtTpmo_UsuarioCrea_Internalname = "TPMO_USUARIOCREA" ;
      edtTpmo_FechaCrea_Internalname = "TPMO_FECHACREA" ;
      edtTpmo_UsuarioModifica_Internalname = "TPMO_USUARIOMODIFICA" ;
      edtTpmo_FechaModifica_Internalname = "TPMO_FECHAMODIFICA" ;
      cmbTpmo_Modulo.setInternalname( "TPMO_MODULO" );
      cmbTpmo_IngresaAredante.setInternalname( "TPMO_INGRESAAREDANTE" );
      cmbTpmo_IngresaCurso.setInternalname( "TPMO_INGRESACURSO" );
      cmbTipo_Tipo.setInternalname( "TIPO_TIPO" );
      edtTpmo_ConsecutivoTrans_Internalname = "TPMO_CONSECUTIVOTRANS" ;
      cmbTpmo_Controlado.setInternalname( "TPMO_CONTROLADO" );
      cmbTpmo_VidaUtil.setInternalname( "TPMO_VIDAUTIL" );
      cmbTpmo_CuentaResponsabilidad.setInternalname( "TPMO_CUENTARESPONSABILIDAD" );
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
      cmbTpmo_CuentaResponsabilidad.setJsonclick( "" );
      cmbTpmo_VidaUtil.setJsonclick( "" );
      cmbTpmo_Controlado.setJsonclick( "" );
      edtTpmo_ConsecutivoTrans_Jsonclick = "" ;
      cmbTipo_Tipo.setJsonclick( "" );
      cmbTpmo_IngresaCurso.setJsonclick( "" );
      cmbTpmo_IngresaAredante.setJsonclick( "" );
      cmbTpmo_Modulo.setJsonclick( "" );
      edtTpmo_FechaModifica_Jsonclick = "" ;
      edtTpmo_UsuarioModifica_Jsonclick = "" ;
      edtTpmo_FechaCrea_Jsonclick = "" ;
      edtTpmo_UsuarioCrea_Jsonclick = "" ;
      cmbTpmo_Estado.setJsonclick( "" );
      cmbTpmo_TipoE_S.setJsonclick( "" );
      edtTpmo_AlmacenDestinoDescrip_Jsonclick = "" ;
      edtTpmo_AlmacenDestinoId_Jsonclick = "" ;
      edtTpmo_AlmacenOrigenDescrip_Jsonclick = "" ;
      edtTpmo_AlmacenOrigenId_Jsonclick = "" ;
      edtTipo_Descripcion_Jsonclick = "" ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtTpmo_Descripcion_Jsonclick = "" ;
      edtTpmo_Codigo_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavUpdate_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divGridcell_Class = "col-xs-12 col-sm-9 col-md-10 WWGridCell" ;
      cmbavTpmo_tipoe_s.setJsonclick( "" );
      cmbavTpmo_tipoe_s.setEnabled( 1 );
      cmbavTpmo_tipoe_s.setVisible( 1 );
      lblLbltpmo_tipoe_sfilter_Caption = "Tipo E/S" ;
      edtavTipo_descripcion_Jsonclick = "" ;
      edtavTipo_descripcion_Enabled = 1 ;
      edtavTipo_descripcion_Visible = 1 ;
      lblLbltipo_descripcionfilter_Caption = "Tipo de Elemento" ;
      edtavTpmo_descripcion_Jsonclick = "" ;
      edtavTpmo_descripcion_Enabled = 1 ;
      edtavTpmo_descripcion_Visible = 1 ;
      lblLbltpmo_descripcionfilter_Caption = "Tipo de movimiento" ;
      edtavTpmo_codigo_Jsonclick = "" ;
      edtavTpmo_codigo_Enabled = 1 ;
      bttBtntoggle_Class = "HideFiltersButton" ;
      bttBtntoggle_Caption = "Otros Filtros" ;
      divTpmo_tipoe_sfiltercontainer_Class = "AdvancedContainerItem" ;
      divTipo_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divTpmo_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divFilterscontainer_Class = "AdvancedContainer" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Tipo de movimiento" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Tpmo_Descripcion',fld:'vTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV19ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Tipo_Descripcion',fld:'vTIPO_DESCRIPCION',pic:'@!',nv:''},{av:'cmbavTpmo_tipoe_s'},{av:'AV17Tpmo_TipoE_S',fld:'vTPMO_TIPOE_S',pic:'',nv:''},{av:'AV22Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Tpmo_Codigo',fld:'vTPMO_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLbltpmo_descripcionfilter_Caption',ctrl:'LBLTPMO_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltipo_descripcionfilter_Caption',ctrl:'LBLTIPO_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltpmo_tipoe_sfilter_Caption',ctrl:'LBLTPMO_TIPOE_SFILTER',prop:'Caption'}]}");
      setEventMetadata("'TOGGLE'","{handler:'e11461',iparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'}],oparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Caption'},{av:'divGridcell_Class',ctrl:'GRIDCELL',prop:'Class'}]}");
      setEventMetadata("LBLTPMO_DESCRIPCIONFILTER.CLICK","{handler:'e12461',iparms:[{av:'divTpmo_descripcionfiltercontainer_Class',ctrl:'TPMO_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_descripcionfiltercontainer_Class',ctrl:'TPMO_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavTpmo_descripcion_Visible',ctrl:'vTPMO_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLTIPO_DESCRIPCIONFILTER.CLICK","{handler:'e13461',iparms:[{av:'divTipo_descripcionfiltercontainer_Class',ctrl:'TIPO_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTipo_descripcionfiltercontainer_Class',ctrl:'TIPO_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavTipo_descripcion_Visible',ctrl:'vTIPO_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLTPMO_TIPOE_SFILTER.CLICK","{handler:'e14461',iparms:[{av:'divTpmo_tipoe_sfiltercontainer_Class',ctrl:'TPMO_TIPOE_SFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTpmo_tipoe_sfiltercontainer_Class',ctrl:'TPMO_TIPOE_SFILTERCONTAINER',prop:'Class'},{av:'cmbavTpmo_tipoe_s'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e18462',iparms:[{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e15462',iparms:[{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Tpmo_Descripcion',fld:'vTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV19ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Tipo_Descripcion',fld:'vTIPO_DESCRIPCION',pic:'@!',nv:''},{av:'cmbavTpmo_tipoe_s'},{av:'AV17Tpmo_TipoE_S',fld:'vTPMO_TIPOE_S',pic:'',nv:''},{av:'AV22Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Tpmo_Codigo',fld:'vTPMO_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLbltpmo_descripcionfilter_Caption',ctrl:'LBLTPMO_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltipo_descripcionfilter_Caption',ctrl:'LBLTIPO_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltpmo_tipoe_sfilter_Caption',ctrl:'LBLTPMO_TIPOE_SFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Tpmo_Descripcion',fld:'vTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV19ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Tipo_Descripcion',fld:'vTIPO_DESCRIPCION',pic:'@!',nv:''},{av:'cmbavTpmo_tipoe_s'},{av:'AV17Tpmo_TipoE_S',fld:'vTPMO_TIPOE_S',pic:'',nv:''},{av:'AV22Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Tpmo_Codigo',fld:'vTPMO_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLbltpmo_descripcionfilter_Caption',ctrl:'LBLTPMO_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltipo_descripcionfilter_Caption',ctrl:'LBLTIPO_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltpmo_tipoe_sfilter_Caption',ctrl:'LBLTPMO_TIPOE_SFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Tpmo_Descripcion',fld:'vTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV19ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Tipo_Descripcion',fld:'vTIPO_DESCRIPCION',pic:'@!',nv:''},{av:'cmbavTpmo_tipoe_s'},{av:'AV17Tpmo_TipoE_S',fld:'vTPMO_TIPOE_S',pic:'',nv:''},{av:'AV22Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Tpmo_Codigo',fld:'vTPMO_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLbltpmo_descripcionfilter_Caption',ctrl:'LBLTPMO_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltipo_descripcionfilter_Caption',ctrl:'LBLTIPO_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltpmo_tipoe_sfilter_Caption',ctrl:'LBLTPMO_TIPOE_SFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Tpmo_Descripcion',fld:'vTPMO_DESCRIPCION',pic:'',nv:''},{av:'AV19ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Tipo_Descripcion',fld:'vTIPO_DESCRIPCION',pic:'@!',nv:''},{av:'cmbavTpmo_tipoe_s'},{av:'AV17Tpmo_TipoE_S',fld:'vTPMO_TIPOE_S',pic:'',nv:''},{av:'AV22Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Tpmo_Codigo',fld:'vTPMO_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLbltpmo_descripcionfilter_Caption',ctrl:'LBLTPMO_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltipo_descripcionfilter_Caption',ctrl:'LBLTIPO_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltpmo_tipoe_sfilter_Caption',ctrl:'LBLTPMO_TIPOE_SFILTER',prop:'Caption'}]}");
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
      AV18Update = "" ;
      AV14Tpmo_Codigo = "" ;
      AV15Tpmo_Descripcion = "" ;
      AV16Tipo_Descripcion = "" ;
      AV17Tpmo_TipoE_S = "" ;
      AV19ADVANCED_LABEL_TEMPLATE = "" ;
      AV22Pgmname = "" ;
      A38Tpmo_Codigo = "" ;
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
      lblLbltpmo_descripcionfilter_Jsonclick = "" ;
      lblLbltipo_descripcionfilter_Jsonclick = "" ;
      lblLbltpmo_tipoe_sfilter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A313Tpmo_Descripcion = "" ;
      A253Tipo_Descripcion = "" ;
      A312Tpmo_AlmacenOrigenDescrip = "" ;
      A314Tpmo_AlmacenDestinoDescrip = "" ;
      A315Tpmo_TipoE_S = "" ;
      A679Tpmo_Estado = "" ;
      A317Tpmo_UsuarioCrea = "" ;
      A318Tpmo_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A319Tpmo_UsuarioModifica = "" ;
      A320Tpmo_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A316Tpmo_Modulo = "" ;
      A440Tpmo_IngresaAredante = "" ;
      A441Tpmo_IngresaCurso = "" ;
      A480Tipo_Tipo = "" ;
      A633Tpmo_Controlado = "" ;
      A641Tpmo_VidaUtil = "" ;
      A680Tpmo_CuentaResponsabilidad = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV23Update_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV17Tpmo_TipoE_S = "" ;
      H00462_A680Tpmo_CuentaResponsabilidad = new String[] {""} ;
      H00462_n680Tpmo_CuentaResponsabilidad = new boolean[] {false} ;
      H00462_A641Tpmo_VidaUtil = new String[] {""} ;
      H00462_n641Tpmo_VidaUtil = new boolean[] {false} ;
      H00462_A633Tpmo_Controlado = new String[] {""} ;
      H00462_n633Tpmo_Controlado = new boolean[] {false} ;
      H00462_A595Tpmo_ConsecutivoTrans = new long[1] ;
      H00462_n595Tpmo_ConsecutivoTrans = new boolean[] {false} ;
      H00462_A480Tipo_Tipo = new String[] {""} ;
      H00462_A441Tpmo_IngresaCurso = new String[] {""} ;
      H00462_A440Tpmo_IngresaAredante = new String[] {""} ;
      H00462_A316Tpmo_Modulo = new String[] {""} ;
      H00462_A320Tpmo_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H00462_n320Tpmo_FechaModifica = new boolean[] {false} ;
      H00462_A319Tpmo_UsuarioModifica = new String[] {""} ;
      H00462_n319Tpmo_UsuarioModifica = new boolean[] {false} ;
      H00462_A318Tpmo_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H00462_A317Tpmo_UsuarioCrea = new String[] {""} ;
      H00462_A679Tpmo_Estado = new String[] {""} ;
      H00462_n679Tpmo_Estado = new boolean[] {false} ;
      H00462_A315Tpmo_TipoE_S = new String[] {""} ;
      H00462_A314Tpmo_AlmacenDestinoDescrip = new String[] {""} ;
      H00462_n314Tpmo_AlmacenDestinoDescrip = new boolean[] {false} ;
      H00462_A40Tpmo_AlmacenDestinoId = new long[1] ;
      H00462_A312Tpmo_AlmacenOrigenDescrip = new String[] {""} ;
      H00462_n312Tpmo_AlmacenOrigenDescrip = new boolean[] {false} ;
      H00462_A39Tpmo_AlmacenOrigenId = new long[1] ;
      H00462_A253Tipo_Descripcion = new String[] {""} ;
      H00462_A33Tipo_Codigo = new long[1] ;
      H00462_A313Tpmo_Descripcion = new String[] {""} ;
      H00462_A38Tpmo_Codigo = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_tipo_movimiento__default(),
         new Object[] {
             new Object[] {
            H00462_A680Tpmo_CuentaResponsabilidad, H00462_n680Tpmo_CuentaResponsabilidad, H00462_A641Tpmo_VidaUtil, H00462_n641Tpmo_VidaUtil, H00462_A633Tpmo_Controlado, H00462_n633Tpmo_Controlado, H00462_A595Tpmo_ConsecutivoTrans, H00462_n595Tpmo_ConsecutivoTrans, H00462_A480Tipo_Tipo, H00462_A441Tpmo_IngresaCurso,
            H00462_A440Tpmo_IngresaAredante, H00462_A316Tpmo_Modulo, H00462_A320Tpmo_FechaModifica, H00462_n320Tpmo_FechaModifica, H00462_A319Tpmo_UsuarioModifica, H00462_n319Tpmo_UsuarioModifica, H00462_A318Tpmo_FechaCrea, H00462_A317Tpmo_UsuarioCrea, H00462_A679Tpmo_Estado, H00462_n679Tpmo_Estado,
            H00462_A315Tpmo_TipoE_S, H00462_A314Tpmo_AlmacenDestinoDescrip, H00462_n314Tpmo_AlmacenDestinoDescrip, H00462_A40Tpmo_AlmacenDestinoId, H00462_A312Tpmo_AlmacenOrigenDescrip, H00462_n312Tpmo_AlmacenOrigenDescrip, H00462_A39Tpmo_AlmacenOrigenId, H00462_A253Tipo_Descripcion, H00462_A33Tipo_Codigo, H00462_A313Tpmo_Descripcion,
            H00462_A38Tpmo_Codigo
            }
         }
      );
      AV22Pgmname = "WWALM_TIPO_MOVIMIENTO" ;
      /* GeneXus formulas. */
      AV22Pgmname = "WWALM_TIPO_MOVIMIENTO" ;
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
   private short nRC_GXsfl_59 ;
   private short nGXsfl_59_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int edtavTpmo_codigo_Enabled ;
   private int edtavTpmo_descripcion_Visible ;
   private int edtavTpmo_descripcion_Enabled ;
   private int edtavTipo_descripcion_Visible ;
   private int edtavTipo_descripcion_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int AV11GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A33Tipo_Codigo ;
   private long A39Tpmo_AlmacenOrigenId ;
   private long A40Tpmo_AlmacenDestinoId ;
   private long A595Tpmo_ConsecutivoTrans ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String edtavUpdate_Tooltiptext ;
   private String divFilterscontainer_Class ;
   private String divTpmo_descripcionfiltercontainer_Class ;
   private String divTipo_descripcionfiltercontainer_Class ;
   private String divTpmo_tipoe_sfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_59_idx="0001" ;
   private String edtavUpdate_Internalname ;
   private String AV19ADVANCED_LABEL_TEMPLATE ;
   private String AV22Pgmname ;
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
   private String edtavTpmo_codigo_Internalname ;
   private String edtavTpmo_codigo_Jsonclick ;
   private String divFilterscontainer_Internalname ;
   private String divTpmo_descripcionfiltercontainer_Internalname ;
   private String lblLbltpmo_descripcionfilter_Internalname ;
   private String lblLbltpmo_descripcionfilter_Caption ;
   private String lblLbltpmo_descripcionfilter_Jsonclick ;
   private String edtavTpmo_descripcion_Internalname ;
   private String edtavTpmo_descripcion_Jsonclick ;
   private String divTipo_descripcionfiltercontainer_Internalname ;
   private String lblLbltipo_descripcionfilter_Internalname ;
   private String lblLbltipo_descripcionfilter_Caption ;
   private String lblLbltipo_descripcionfilter_Jsonclick ;
   private String edtavTipo_descripcion_Internalname ;
   private String edtavTipo_descripcion_Jsonclick ;
   private String divTpmo_tipoe_sfiltercontainer_Internalname ;
   private String lblLbltpmo_tipoe_sfilter_Internalname ;
   private String lblLbltpmo_tipoe_sfilter_Caption ;
   private String lblLbltpmo_tipoe_sfilter_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridcell_Class ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String A679Tpmo_Estado ;
   private String A480Tipo_Tipo ;
   private String edtavUpdate_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtTpmo_Codigo_Internalname ;
   private String edtTpmo_Descripcion_Internalname ;
   private String edtTipo_Codigo_Internalname ;
   private String edtTipo_Descripcion_Internalname ;
   private String edtTpmo_AlmacenOrigenId_Internalname ;
   private String edtTpmo_AlmacenOrigenDescrip_Internalname ;
   private String edtTpmo_AlmacenDestinoId_Internalname ;
   private String edtTpmo_AlmacenDestinoDescrip_Internalname ;
   private String edtTpmo_UsuarioCrea_Internalname ;
   private String edtTpmo_FechaCrea_Internalname ;
   private String edtTpmo_UsuarioModifica_Internalname ;
   private String edtTpmo_FechaModifica_Internalname ;
   private String edtTpmo_ConsecutivoTrans_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String sGXsfl_59_fel_idx="0001" ;
   private String ROClassString ;
   private String edtTpmo_Codigo_Jsonclick ;
   private String edtTpmo_Descripcion_Jsonclick ;
   private String edtTipo_Codigo_Jsonclick ;
   private String edtTipo_Descripcion_Jsonclick ;
   private String edtTpmo_AlmacenOrigenId_Jsonclick ;
   private String edtTpmo_AlmacenOrigenDescrip_Jsonclick ;
   private String edtTpmo_AlmacenDestinoId_Jsonclick ;
   private String edtTpmo_AlmacenDestinoDescrip_Jsonclick ;
   private String edtTpmo_UsuarioCrea_Jsonclick ;
   private String edtTpmo_FechaCrea_Jsonclick ;
   private String edtTpmo_UsuarioModifica_Jsonclick ;
   private String edtTpmo_FechaModifica_Jsonclick ;
   private String edtTpmo_ConsecutivoTrans_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A318Tpmo_FechaCrea ;
   private java.util.Date A320Tpmo_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_59_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n312Tpmo_AlmacenOrigenDescrip ;
   private boolean n314Tpmo_AlmacenDestinoDescrip ;
   private boolean n679Tpmo_Estado ;
   private boolean n319Tpmo_UsuarioModifica ;
   private boolean n320Tpmo_FechaModifica ;
   private boolean n595Tpmo_ConsecutivoTrans ;
   private boolean n633Tpmo_Controlado ;
   private boolean n641Tpmo_VidaUtil ;
   private boolean n680Tpmo_CuentaResponsabilidad ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV18Update_IsBlob ;
   private String AV14Tpmo_Codigo ;
   private String AV15Tpmo_Descripcion ;
   private String AV16Tipo_Descripcion ;
   private String AV17Tpmo_TipoE_S ;
   private String A38Tpmo_Codigo ;
   private String A313Tpmo_Descripcion ;
   private String A253Tipo_Descripcion ;
   private String A312Tpmo_AlmacenOrigenDescrip ;
   private String A314Tpmo_AlmacenDestinoDescrip ;
   private String A315Tpmo_TipoE_S ;
   private String A317Tpmo_UsuarioCrea ;
   private String A319Tpmo_UsuarioModifica ;
   private String A316Tpmo_Modulo ;
   private String A440Tpmo_IngresaAredante ;
   private String A441Tpmo_IngresaCurso ;
   private String A633Tpmo_Controlado ;
   private String A641Tpmo_VidaUtil ;
   private String A680Tpmo_CuentaResponsabilidad ;
   private String AV23Update_GXI ;
   private String lV17Tpmo_TipoE_S ;
   private String AV18Update ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private HTMLChoice cmbavTpmo_tipoe_s ;
   private HTMLChoice cmbTpmo_TipoE_S ;
   private HTMLChoice cmbTpmo_Estado ;
   private HTMLChoice cmbTpmo_Modulo ;
   private HTMLChoice cmbTpmo_IngresaAredante ;
   private HTMLChoice cmbTpmo_IngresaCurso ;
   private HTMLChoice cmbTipo_Tipo ;
   private HTMLChoice cmbTpmo_Controlado ;
   private HTMLChoice cmbTpmo_VidaUtil ;
   private HTMLChoice cmbTpmo_CuentaResponsabilidad ;
   private IDataStoreProvider pr_default ;
   private String[] H00462_A680Tpmo_CuentaResponsabilidad ;
   private boolean[] H00462_n680Tpmo_CuentaResponsabilidad ;
   private String[] H00462_A641Tpmo_VidaUtil ;
   private boolean[] H00462_n641Tpmo_VidaUtil ;
   private String[] H00462_A633Tpmo_Controlado ;
   private boolean[] H00462_n633Tpmo_Controlado ;
   private long[] H00462_A595Tpmo_ConsecutivoTrans ;
   private boolean[] H00462_n595Tpmo_ConsecutivoTrans ;
   private String[] H00462_A480Tipo_Tipo ;
   private String[] H00462_A441Tpmo_IngresaCurso ;
   private String[] H00462_A440Tpmo_IngresaAredante ;
   private String[] H00462_A316Tpmo_Modulo ;
   private java.util.Date[] H00462_A320Tpmo_FechaModifica ;
   private boolean[] H00462_n320Tpmo_FechaModifica ;
   private String[] H00462_A319Tpmo_UsuarioModifica ;
   private boolean[] H00462_n319Tpmo_UsuarioModifica ;
   private java.util.Date[] H00462_A318Tpmo_FechaCrea ;
   private String[] H00462_A317Tpmo_UsuarioCrea ;
   private String[] H00462_A679Tpmo_Estado ;
   private boolean[] H00462_n679Tpmo_Estado ;
   private String[] H00462_A315Tpmo_TipoE_S ;
   private String[] H00462_A314Tpmo_AlmacenDestinoDescrip ;
   private boolean[] H00462_n314Tpmo_AlmacenDestinoDescrip ;
   private long[] H00462_A40Tpmo_AlmacenDestinoId ;
   private String[] H00462_A312Tpmo_AlmacenOrigenDescrip ;
   private boolean[] H00462_n312Tpmo_AlmacenOrigenDescrip ;
   private long[] H00462_A39Tpmo_AlmacenOrigenId ;
   private String[] H00462_A253Tipo_Descripcion ;
   private long[] H00462_A33Tipo_Codigo ;
   private String[] H00462_A313Tpmo_Descripcion ;
   private String[] H00462_A38Tpmo_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwalm_tipo_movimiento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00462( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV17Tpmo_TipoE_S ,
                                          String A315Tpmo_TipoE_S ,
                                          String AV15Tpmo_Descripcion ,
                                          String A313Tpmo_Descripcion ,
                                          String AV14Tpmo_Codigo ,
                                          String A38Tpmo_Codigo ,
                                          String AV16Tipo_Descripcion ,
                                          String A253Tipo_Descripcion )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [1] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      scmdbuf = "SELECT T1.Tpmo_CuentaResponsabilidad, T1.Tpmo_VidaUtil, T1.Tpmo_Controlado, T1.Tpmo_ConsecutivoTrans," ;
      scmdbuf = scmdbuf + " T4.Tipo_Tipo, T1.Tpmo_IngresaCurso, T1.Tpmo_IngresaAredante, T1.Tpmo_Modulo, T1.Tpmo_FechaModifica," ;
      scmdbuf = scmdbuf + " T1.Tpmo_UsuarioModifica, T1.Tpmo_FechaCrea, T1.Tpmo_UsuarioCrea, T1.Tpmo_Estado," ;
      scmdbuf = scmdbuf + " T1.Tpmo_TipoE_S, T2.Tpal_Descripcion AS Tpmo_AlmacenDestinoDescrip, T1.Tpmo_AlmacenDestinoId" ;
      scmdbuf = scmdbuf + " AS Tpmo_AlmacenDestinoId, T3.Tpal_Descripcion AS Tpmo_AlmacenOrigenDescrip, T1.Tpmo_AlmacenOrigenId" ;
      scmdbuf = scmdbuf + " AS Tpmo_AlmacenOrigenId, T4.Tipo_Descripcion, T1.Tipo_Codigo, T1.Tpmo_Descripcion," ;
      scmdbuf = scmdbuf + " T1.Tpmo_Codigo FROM (((ALM_TIPO_MOVIMIENTO T1 INNER JOIN ALM_TIPO_ALMACEN T2 ON" ;
      scmdbuf = scmdbuf + " T2.Tpal_Id = T1.Tpmo_AlmacenDestinoId) INNER JOIN ALM_TIPO_ALMACEN T3 ON T3.Tpal_Id" ;
      scmdbuf = scmdbuf + " = T1.Tpmo_AlmacenOrigenId) INNER JOIN ALM_TIPO_ELEMENTO T4 ON T4.Tipo_Codigo = T1.Tipo_Codigo)" ;
      if ( ! (GXutil.strcmp("", AV17Tpmo_TipoE_S)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Tpmo_TipoE_S like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Tpmo_TipoE_S like ?)" ;
         }
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY T1.Tpmo_Descripcion" ;
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
                  return conditional_H00462(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00462", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
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
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[18])[0] = rslt.getString(13, 1) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(16) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((long[]) buf[26])[0] = rslt.getLong(18) ;
               ((String[]) buf[27])[0] = rslt.getVarchar(19) ;
               ((long[]) buf[28])[0] = rslt.getLong(20) ;
               ((String[]) buf[29])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[30])[0] = rslt.getVarchar(22) ;
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
                  stmt.setVarchar(sIdx, (String)parms[1], 1);
               }
               return;
      }
   }

}

