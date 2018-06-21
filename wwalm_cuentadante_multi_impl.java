/*
               File: wwalm_cuentadante_multi_impl
        Description: Work With ALM_CUENTADANTE_MULTI
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:18:24.72
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

public final  class wwalm_cuentadante_multi_impl extends GXDataArea
{
   public wwalm_cuentadante_multi_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_cuentadante_multi_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_cuentadante_multi_impl.class ));
   }

   public wwalm_cuentadante_multi_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCuen_estado = new HTMLChoice();
      cmbCuen_Estado = new HTMLChoice();
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
            AV14Cuen_Cedula = GXutil.lval( httpContext.GetNextPar( )) ;
            AV15Cuen_Nombre = httpContext.GetNextPar( ) ;
            AV16Regi_Descripcion = httpContext.GetNextPar( ) ;
            AV17Cuen_Estado = httpContext.GetNextPar( ) ;
            AV18Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_59_Refreshing);
            AV19ADVANCED_LABEL_TEMPLATE = httpContext.GetNextPar( ) ;
            AV22Pgmname = httpContext.GetNextPar( ) ;
            A43Cuen_Identificacion = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14Cuen_Cedula, AV15Cuen_Nombre, AV16Regi_Descripcion, AV17Cuen_Estado, AV18Update, AV19ADVANCED_LABEL_TEMPLATE, AV22Pgmname, A43Cuen_Identificacion) ;
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
      pa1J2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1J2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414182484");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_cuentadante_multi") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUEN_CEDULA", GXutil.ltrim( localUtil.ntoc( AV14Cuen_Cedula, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUEN_NOMBRE", AV15Cuen_Nombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vREGI_DESCRIPCION", AV16Regi_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUEN_ESTADO", GXutil.rtrim( AV17Cuen_Estado));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_59", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_59, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vADVANCED_LABEL_TEMPLATE", GXutil.rtrim( AV19ADVANCED_LABEL_TEMPLATE));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV22Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FILTERSCONTAINER_Class", GXutil.rtrim( divFilterscontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_NOMBREFILTERCONTAINER_Class", GXutil.rtrim( divCuen_nombrefiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divRegi_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_ESTADOFILTERCONTAINER_Class", GXutil.rtrim( divCuen_estadofiltercontainer_Class));
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
         we1J2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1J2( ) ;
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
      return formatLink("com.orions2.wwalm_cuentadante_multi")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_CUENTADANTE_MULTI" ;
   }

   public String getPgmdesc( )
   {
      return "Work With ALM_CUENTADANTE_MULTI" ;
   }

   public void wb1J0( )
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 59, 2, 0)+","+"null"+");", bttBtntoggle_Caption, bttBtntoggle_Jsonclick, 7, "Otros Filtros", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111j1_client"+"'", TempTags, "", 2, "HLP_WWALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Cuentadante Multiple", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_CUENTADANTE_MULTI.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 59, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-sm-pull-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCuen_cedula_Internalname, "Cuen_Cedula", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCuen_cedula_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Cuen_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtavCuen_cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV14Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Cuentadante Cedula", edtavCuen_cedula_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavCuen_cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WWALM_CUENTADANTE_MULTI.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCuen_nombrefiltercontainer_Internalname, 1, 0, "px", 0, "px", divCuen_nombrefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcuen_nombrefilter_Internalname, lblLblcuen_nombrefilter_Caption, "", "", lblLblcuen_nombrefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e121j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCuen_nombre_Internalname, "Cuen_Nombre", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCuen_nombre_Internalname, AV15Cuen_Nombre, GXutil.rtrim( localUtil.format( AV15Cuen_Nombre, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuen_nombre_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavCuen_nombre_Visible, edtavCuen_nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_CUENTADANTE_MULTI.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRegi_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRegi_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblregi_descripcionfilter_Internalname, lblLblregi_descripcionfilter_Caption, "", "", lblLblregi_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e131j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavRegi_descripcion_Internalname, "Regi_Descripcion", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavRegi_descripcion_Internalname, AV16Regi_Descripcion, GXutil.rtrim( localUtil.format( AV16Regi_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRegi_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavRegi_descripcion_Visible, edtavRegi_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_CUENTADANTE_MULTI.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCuen_estadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divCuen_estadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcuen_estadofilter_Internalname, lblLblcuen_estadofilter_Caption, "", "", lblLblcuen_estadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e141j1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_CUENTADANTE_MULTI.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCuen_estado.getInternalname(), "Cuen_Estado", "col-sm-3 FilterComboAttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCuen_estado, cmbavCuen_estado.getInternalname(), GXutil.rtrim( AV17Cuen_Estado), 1, cmbavCuen_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavCuen_estado.getVisible(), cmbavCuen_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "FilterComboAttribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "", true, "HLP_WWALM_CUENTADANTE_MULTI.htm");
         cmbavCuen_estado.setValue( GXutil.rtrim( AV17Cuen_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCuen_estado.getInternalname(), "Values", cmbavCuen_estado.ToJavascriptSource(), true);
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "No.  Auxiliar") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cedula") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Dígito Verificación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Nombre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Nombre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Apellido") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Apellido") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nombre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Clase") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Dirección") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Teléfono") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Email") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código Ciudad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Ciudad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código Departamento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Departamento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código del Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código de la Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Regional") ;
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
            httpContext.writeValue( "Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Fecha ") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A326Cuen_DigitoVerificacion, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A331Cuen_PrimerNombre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A332Cuen_SegundoNombre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A329Cuen_PrimerApellido);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A330Cuen_SegundoApellido);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A44Cuen_Nombre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A42Tpte_Codigo));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A321Tpte_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A328Cuen_Clase);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A334Cuen_Direccion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A335Cuen_Telefono);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A336Cuen_Email);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A7Ciud_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A10Dept_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A3Cent_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A4Cent_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A13Regi_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A333Cuen_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A337Cuen_UsuarioCrea);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A338Cuen_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A339Cuen_UsuarioModifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A340Cuen_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
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

   public void start1J2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With ALM_CUENTADANTE_MULTI", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1J0( ) ;
   }

   public void ws1J2( )
   {
      start1J2( ) ;
      evt1J2( ) ;
   }

   public void evt1J2( )
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
                           e151J2 ();
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
                           A43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Internalname), ",", ".") ;
                           A688Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Internalname), ",", ".") ;
                           A326Cuen_DigitoVerificacion = (byte)(localUtil.ctol( httpContext.cgiGet( edtCuen_DigitoVerificacion_Internalname), ",", ".")) ;
                           n326Cuen_DigitoVerificacion = false ;
                           A331Cuen_PrimerNombre = GXutil.upper( httpContext.cgiGet( edtCuen_PrimerNombre_Internalname)) ;
                           n331Cuen_PrimerNombre = false ;
                           A332Cuen_SegundoNombre = GXutil.upper( httpContext.cgiGet( edtCuen_SegundoNombre_Internalname)) ;
                           n332Cuen_SegundoNombre = false ;
                           A329Cuen_PrimerApellido = GXutil.upper( httpContext.cgiGet( edtCuen_PrimerApellido_Internalname)) ;
                           n329Cuen_PrimerApellido = false ;
                           A330Cuen_SegundoApellido = GXutil.upper( httpContext.cgiGet( edtCuen_SegundoApellido_Internalname)) ;
                           n330Cuen_SegundoApellido = false ;
                           A44Cuen_Nombre = GXutil.upper( httpContext.cgiGet( edtCuen_Nombre_Internalname)) ;
                           n44Cuen_Nombre = false ;
                           A42Tpte_Codigo = GXutil.upper( httpContext.cgiGet( edtTpte_Codigo_Internalname)) ;
                           A321Tpte_Descripcion = GXutil.upper( httpContext.cgiGet( edtTpte_Descripcion_Internalname)) ;
                           A328Cuen_Clase = httpContext.cgiGet( edtCuen_Clase_Internalname) ;
                           n328Cuen_Clase = false ;
                           A334Cuen_Direccion = httpContext.cgiGet( edtCuen_Direccion_Internalname) ;
                           n334Cuen_Direccion = false ;
                           A335Cuen_Telefono = httpContext.cgiGet( edtCuen_Telefono_Internalname) ;
                           n335Cuen_Telefono = false ;
                           A336Cuen_Email = httpContext.cgiGet( edtCuen_Email_Internalname) ;
                           n336Cuen_Email = false ;
                           A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".")) ;
                           A7Ciud_Descripcion = GXutil.upper( httpContext.cgiGet( edtCiud_Descripcion_Internalname)) ;
                           A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
                           A10Dept_Descripcion = GXutil.upper( httpContext.cgiGet( edtDept_Descripcion_Internalname)) ;
                           A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
                           A3Cent_Codigo = httpContext.cgiGet( edtCent_Codigo_Internalname) ;
                           A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
                           A2Regi_Id = localUtil.ctol( httpContext.cgiGet( edtRegi_Id_Internalname), ",", ".") ;
                           A12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".")) ;
                           A13Regi_Descripcion = httpContext.cgiGet( edtRegi_Descripcion_Internalname) ;
                           cmbCuen_Estado.setName( cmbCuen_Estado.getInternalname() );
                           cmbCuen_Estado.setValue( httpContext.cgiGet( cmbCuen_Estado.getInternalname()) );
                           A333Cuen_Estado = httpContext.cgiGet( cmbCuen_Estado.getInternalname()) ;
                           n333Cuen_Estado = false ;
                           A337Cuen_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtCuen_UsuarioCrea_Internalname)) ;
                           A338Cuen_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtCuen_FechaCrea_Internalname), 0) ;
                           A339Cuen_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtCuen_UsuarioModifica_Internalname)) ;
                           n339Cuen_UsuarioModifica = false ;
                           A340Cuen_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtCuen_FechaModifica_Internalname), 0) ;
                           n340Cuen_FechaModifica = false ;
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
                                 e161J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181J2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cuen_cedula Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUEN_CEDULA"), ",", ".") != AV14Cuen_Cedula )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuen_nombre Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUEN_NOMBRE"), AV15Cuen_Nombre) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Regi_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vREGI_DESCRIPCION"), AV16Regi_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuen_estado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUEN_ESTADO"), AV17Cuen_Estado) != 0 )
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

   public void we1J2( )
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

   public void pa1J2( )
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
         cmbavCuen_estado.setName( "vCUEN_ESTADO" );
         cmbavCuen_estado.setWebtags( "" );
         cmbavCuen_estado.addItem("", "(Todos)", (short)(0));
         cmbavCuen_estado.addItem("A", "Activo", (short)(0));
         cmbavCuen_estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbavCuen_estado.getItemCount() > 0 )
         {
            AV17Cuen_Estado = cmbavCuen_estado.getValidValue(AV17Cuen_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Cuen_Estado", AV17Cuen_Estado);
         }
         GXCCtl = "CUEN_ESTADO_" + sGXsfl_59_idx ;
         cmbCuen_Estado.setName( GXCCtl );
         cmbCuen_Estado.setWebtags( "" );
         cmbCuen_Estado.addItem("A", "Activo", (short)(0));
         cmbCuen_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbCuen_Estado.getItemCount() > 0 )
         {
            A333Cuen_Estado = cmbCuen_Estado.getValidValue(A333Cuen_Estado) ;
            n333Cuen_Estado = false ;
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
            GX_FocusControl = edtavCuen_cedula_Internalname ;
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
                                 long AV14Cuen_Cedula ,
                                 String AV15Cuen_Nombre ,
                                 String AV16Regi_Descripcion ,
                                 String AV17Cuen_Estado ,
                                 String AV18Update ,
                                 String AV19ADVANCED_LABEL_TEMPLATE ,
                                 String AV22Pgmname ,
                                 long A43Cuen_Identificacion )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf1J2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_CEDULA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_CEDULA", GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_DIGITOVERIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_DIGITOVERIFICACION", GXutil.ltrim( localUtil.ntoc( A326Cuen_DigitoVerificacion, (byte)(1), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_PRIMERNOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A331Cuen_PrimerNombre, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_PRIMERNOMBRE", A331Cuen_PrimerNombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_SEGUNDONOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A332Cuen_SegundoNombre, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_SEGUNDONOMBRE", A332Cuen_SegundoNombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_PRIMERAPELLIDO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A329Cuen_PrimerApellido, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_PRIMERAPELLIDO", A329Cuen_PrimerApellido);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_SEGUNDOAPELLIDO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A330Cuen_SegundoApellido, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_SEGUNDOAPELLIDO", A330Cuen_SegundoApellido);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_NOMBRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_NOMBRE", A44Cuen_Nombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPTE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPTE_CODIGO", GXutil.rtrim( A42Tpte_Codigo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_CLASE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A328Cuen_Clase, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_CLASE", A328Cuen_Clase);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_DIRECCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A334Cuen_Direccion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_DIRECCION", A334Cuen_Direccion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_TELEFONO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A335Cuen_Telefono, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_TELEFONO", A335Cuen_Telefono);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A336Cuen_Email, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_EMAIL", A336Cuen_Email);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ID", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_REGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_ID", GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A333Cuen_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_ESTADO", GXutil.rtrim( A333Cuen_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_USUARIOCREA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A337Cuen_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_USUARIOCREA", A337Cuen_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_FECHACREA", getSecureSignedToken( "", localUtil.format( A338Cuen_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_FECHACREA", localUtil.ttoc( A338Cuen_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_USUARIOMODIFICA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A339Cuen_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_USUARIOMODIFICA", A339Cuen_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_FECHAMODIFICA", getSecureSignedToken( "", localUtil.format( A340Cuen_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_FECHAMODIFICA", localUtil.ttoc( A340Cuen_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCuen_estado.getItemCount() > 0 )
      {
         AV17Cuen_Estado = cmbavCuen_estado.getValidValue(AV17Cuen_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Cuen_Estado", AV17Cuen_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1J2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV22Pgmname = "WWALM_CUENTADANTE_MULTI" ;
      Gx_err = (short)(0) ;
   }

   public void rf1J2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(59) ;
      /* Execute user event: Refresh */
      e171J2 ();
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
                                              new Long(AV14Cuen_Cedula) ,
                                              AV17Cuen_Estado ,
                                              new Long(A688Cuen_Cedula) ,
                                              A333Cuen_Estado ,
                                              AV15Cuen_Nombre ,
                                              A44Cuen_Nombre ,
                                              AV16Regi_Descripcion ,
                                              A13Regi_Descripcion ,
                                              A42Tpte_Codigo } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING
                                              }
         } ) ;
         /* Using cursor H001J2 */
         pr_default.execute(0, new Object[] {new Long(AV14Cuen_Cedula), AV17Cuen_Estado});
         nGXsfl_59_idx = (short)(1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_592( ) ;
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
         {
            A340Cuen_FechaModifica = H001J2_A340Cuen_FechaModifica[0] ;
            n340Cuen_FechaModifica = H001J2_n340Cuen_FechaModifica[0] ;
            A339Cuen_UsuarioModifica = H001J2_A339Cuen_UsuarioModifica[0] ;
            n339Cuen_UsuarioModifica = H001J2_n339Cuen_UsuarioModifica[0] ;
            A338Cuen_FechaCrea = H001J2_A338Cuen_FechaCrea[0] ;
            A337Cuen_UsuarioCrea = H001J2_A337Cuen_UsuarioCrea[0] ;
            A333Cuen_Estado = H001J2_A333Cuen_Estado[0] ;
            n333Cuen_Estado = H001J2_n333Cuen_Estado[0] ;
            A13Regi_Descripcion = H001J2_A13Regi_Descripcion[0] ;
            A12Regi_Cod = H001J2_A12Regi_Cod[0] ;
            A2Regi_Id = H001J2_A2Regi_Id[0] ;
            A4Cent_Descripcion = H001J2_A4Cent_Descripcion[0] ;
            A3Cent_Codigo = H001J2_A3Cent_Codigo[0] ;
            A1Cent_Id = H001J2_A1Cent_Id[0] ;
            A10Dept_Descripcion = H001J2_A10Dept_Descripcion[0] ;
            A6Dept_Codigo = H001J2_A6Dept_Codigo[0] ;
            A7Ciud_Descripcion = H001J2_A7Ciud_Descripcion[0] ;
            A5Ciud_Codigo = H001J2_A5Ciud_Codigo[0] ;
            A336Cuen_Email = H001J2_A336Cuen_Email[0] ;
            n336Cuen_Email = H001J2_n336Cuen_Email[0] ;
            A335Cuen_Telefono = H001J2_A335Cuen_Telefono[0] ;
            n335Cuen_Telefono = H001J2_n335Cuen_Telefono[0] ;
            A334Cuen_Direccion = H001J2_A334Cuen_Direccion[0] ;
            n334Cuen_Direccion = H001J2_n334Cuen_Direccion[0] ;
            A328Cuen_Clase = H001J2_A328Cuen_Clase[0] ;
            n328Cuen_Clase = H001J2_n328Cuen_Clase[0] ;
            A321Tpte_Descripcion = H001J2_A321Tpte_Descripcion[0] ;
            A42Tpte_Codigo = H001J2_A42Tpte_Codigo[0] ;
            A44Cuen_Nombre = H001J2_A44Cuen_Nombre[0] ;
            n44Cuen_Nombre = H001J2_n44Cuen_Nombre[0] ;
            A330Cuen_SegundoApellido = H001J2_A330Cuen_SegundoApellido[0] ;
            n330Cuen_SegundoApellido = H001J2_n330Cuen_SegundoApellido[0] ;
            A329Cuen_PrimerApellido = H001J2_A329Cuen_PrimerApellido[0] ;
            n329Cuen_PrimerApellido = H001J2_n329Cuen_PrimerApellido[0] ;
            A332Cuen_SegundoNombre = H001J2_A332Cuen_SegundoNombre[0] ;
            n332Cuen_SegundoNombre = H001J2_n332Cuen_SegundoNombre[0] ;
            A331Cuen_PrimerNombre = H001J2_A331Cuen_PrimerNombre[0] ;
            n331Cuen_PrimerNombre = H001J2_n331Cuen_PrimerNombre[0] ;
            A326Cuen_DigitoVerificacion = H001J2_A326Cuen_DigitoVerificacion[0] ;
            n326Cuen_DigitoVerificacion = H001J2_n326Cuen_DigitoVerificacion[0] ;
            A688Cuen_Cedula = H001J2_A688Cuen_Cedula[0] ;
            A43Cuen_Identificacion = H001J2_A43Cuen_Identificacion[0] ;
            A13Regi_Descripcion = H001J2_A13Regi_Descripcion[0] ;
            A12Regi_Cod = H001J2_A12Regi_Cod[0] ;
            A5Ciud_Codigo = H001J2_A5Ciud_Codigo[0] ;
            A6Dept_Codigo = H001J2_A6Dept_Codigo[0] ;
            A7Ciud_Descripcion = H001J2_A7Ciud_Descripcion[0] ;
            A10Dept_Descripcion = H001J2_A10Dept_Descripcion[0] ;
            A4Cent_Descripcion = H001J2_A4Cent_Descripcion[0] ;
            A3Cent_Codigo = H001J2_A3Cent_Codigo[0] ;
            A321Tpte_Descripcion = H001J2_A321Tpte_Descripcion[0] ;
            if ( (GXutil.strcmp("", AV15Cuen_Nombre)==0) || ( GXutil.like( GXutil.upper( A44Cuen_Nombre) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV15Cuen_Nombre), "") , 254 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV16Regi_Descripcion)==0) || ( GXutil.like( GXutil.upper( A13Regi_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16Regi_Descripcion), "") , 254 , "%"),  ' ' ) ) )
               {
                  e181J2 ();
               }
            }
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(59) ;
         wb1J0( ) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Cuen_Cedula, AV15Cuen_Nombre, AV16Regi_Descripcion, AV17Cuen_Estado, AV18Update, AV19ADVANCED_LABEL_TEMPLATE, AV22Pgmname, A43Cuen_Identificacion) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Cuen_Cedula, AV15Cuen_Nombre, AV16Regi_Descripcion, AV17Cuen_Estado, AV18Update, AV19ADVANCED_LABEL_TEMPLATE, AV22Pgmname, A43Cuen_Identificacion) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Cuen_Cedula, AV15Cuen_Nombre, AV16Regi_Descripcion, AV17Cuen_Estado, AV18Update, AV19ADVANCED_LABEL_TEMPLATE, AV22Pgmname, A43Cuen_Identificacion) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Cuen_Cedula, AV15Cuen_Nombre, AV16Regi_Descripcion, AV17Cuen_Estado, AV18Update, AV19ADVANCED_LABEL_TEMPLATE, AV22Pgmname, A43Cuen_Identificacion) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Cuen_Cedula, AV15Cuen_Nombre, AV16Regi_Descripcion, AV17Cuen_Estado, AV18Update, AV19ADVANCED_LABEL_TEMPLATE, AV22Pgmname, A43Cuen_Identificacion) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup1J0( )
   {
      /* Before Start, stand alone formulas. */
      AV22Pgmname = "WWALM_CUENTADANTE_MULTI" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_cedula_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_cedula_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUEN_CEDULA");
            GX_FocusControl = edtavCuen_cedula_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Cuen_Cedula = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Cuen_Cedula", GXutil.ltrim( GXutil.str( AV14Cuen_Cedula, 18, 0)));
         }
         else
         {
            AV14Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtavCuen_cedula_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Cuen_Cedula", GXutil.ltrim( GXutil.str( AV14Cuen_Cedula, 18, 0)));
         }
         AV15Cuen_Nombre = GXutil.upper( httpContext.cgiGet( edtavCuen_nombre_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Cuen_Nombre", AV15Cuen_Nombre);
         AV16Regi_Descripcion = httpContext.cgiGet( edtavRegi_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Regi_Descripcion", AV16Regi_Descripcion);
         cmbavCuen_estado.setName( cmbavCuen_estado.getInternalname() );
         cmbavCuen_estado.setValue( httpContext.cgiGet( cmbavCuen_estado.getInternalname()) );
         AV17Cuen_Estado = httpContext.cgiGet( cmbavCuen_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Cuen_Estado", AV17Cuen_Estado);
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
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUEN_CEDULA"), ",", ".") != AV14Cuen_Cedula )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUEN_NOMBRE"), AV15Cuen_Nombre) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vREGI_DESCRIPCION"), AV16Regi_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUEN_ESTADO"), AV17Cuen_Estado) != 0 )
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
      e161J2 ();
      if (returnInSub) return;
   }

   public void e161J2( )
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
      AV17Cuen_Estado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Cuen_Estado", AV17Cuen_Estado);
      Form.setCaption( "Cuentadante Multiple" );
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

   public void e171J2( )
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
      if ( (GXutil.strcmp("", AV15Cuen_Nombre)==0) )
      {
         lblLblcuen_nombrefilter_Caption = "Nombre" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcuen_nombrefilter_Internalname, "Caption", lblLblcuen_nombrefilter_Caption, true);
      }
      else
      {
         lblLblcuen_nombrefilter_Caption = GXutil.format( AV19ADVANCED_LABEL_TEMPLATE, "Nombre", AV15Cuen_Nombre, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcuen_nombrefilter_Internalname, "Caption", lblLblcuen_nombrefilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV16Regi_Descripcion)==0) )
      {
         lblLblregi_descripcionfilter_Caption = "Regional" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblregi_descripcionfilter_Internalname, "Caption", lblLblregi_descripcionfilter_Caption, true);
      }
      else
      {
         lblLblregi_descripcionfilter_Caption = GXutil.format( AV19ADVANCED_LABEL_TEMPLATE, "Regional", AV16Regi_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblregi_descripcionfilter_Internalname, "Caption", lblLblregi_descripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV17Cuen_Estado)==0) )
      {
         lblLblcuen_estadofilter_Caption = "Estado" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcuen_estadofilter_Internalname, "Caption", lblLblcuen_estadofilter_Caption, true);
      }
      else
      {
         lblLblcuen_estadofilter_Caption = GXutil.format( AV19ADVANCED_LABEL_TEMPLATE, "Estado", AV17Cuen_Estado, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcuen_estadofilter_Internalname, "Caption", lblLblcuen_estadofilter_Caption, true);
      }
   }

   private void e181J2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_cuentadante_multi") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A43Cuen_Identificacion,18,0))) ;
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

   public void e151J2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_cuentadante_multi") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
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
            AV14Cuen_Cedula = GXutil.lval( ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Cuen_Cedula", GXutil.ltrim( GXutil.str( AV14Cuen_Cedula, 18, 0)));
            AV15Cuen_Nombre = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+2)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Cuen_Nombre", AV15Cuen_Nombre);
            AV16Regi_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+3)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Regi_Descripcion", AV16Regi_Descripcion);
            AV17Cuen_Estado = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+4)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Cuen_Estado", AV17Cuen_Estado);
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
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( GXutil.str( AV14Cuen_Cedula, 18, 0) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV15Cuen_Nombre );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV16Regi_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV17Cuen_Estado );
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
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_CUENTADANTE_MULTI" );
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
      pa1J2( ) ;
      ws1J2( ) ;
      we1J2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414182675");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wwalm_cuentadante_multi.js", "?201861414182675");
      /* End function include_jscripts */
   }

   public void subsflControlProps_592( )
   {
      edtCuen_Identificacion_Internalname = "CUEN_IDENTIFICACION_"+sGXsfl_59_idx ;
      edtCuen_Cedula_Internalname = "CUEN_CEDULA_"+sGXsfl_59_idx ;
      edtCuen_DigitoVerificacion_Internalname = "CUEN_DIGITOVERIFICACION_"+sGXsfl_59_idx ;
      edtCuen_PrimerNombre_Internalname = "CUEN_PRIMERNOMBRE_"+sGXsfl_59_idx ;
      edtCuen_SegundoNombre_Internalname = "CUEN_SEGUNDONOMBRE_"+sGXsfl_59_idx ;
      edtCuen_PrimerApellido_Internalname = "CUEN_PRIMERAPELLIDO_"+sGXsfl_59_idx ;
      edtCuen_SegundoApellido_Internalname = "CUEN_SEGUNDOAPELLIDO_"+sGXsfl_59_idx ;
      edtCuen_Nombre_Internalname = "CUEN_NOMBRE_"+sGXsfl_59_idx ;
      edtTpte_Codigo_Internalname = "TPTE_CODIGO_"+sGXsfl_59_idx ;
      edtTpte_Descripcion_Internalname = "TPTE_DESCRIPCION_"+sGXsfl_59_idx ;
      edtCuen_Clase_Internalname = "CUEN_CLASE_"+sGXsfl_59_idx ;
      edtCuen_Direccion_Internalname = "CUEN_DIRECCION_"+sGXsfl_59_idx ;
      edtCuen_Telefono_Internalname = "CUEN_TELEFONO_"+sGXsfl_59_idx ;
      edtCuen_Email_Internalname = "CUEN_EMAIL_"+sGXsfl_59_idx ;
      edtCiud_Codigo_Internalname = "CIUD_CODIGO_"+sGXsfl_59_idx ;
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION_"+sGXsfl_59_idx ;
      edtDept_Codigo_Internalname = "DEPT_CODIGO_"+sGXsfl_59_idx ;
      edtDept_Descripcion_Internalname = "DEPT_DESCRIPCION_"+sGXsfl_59_idx ;
      edtCent_Id_Internalname = "CENT_ID_"+sGXsfl_59_idx ;
      edtCent_Codigo_Internalname = "CENT_CODIGO_"+sGXsfl_59_idx ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION_"+sGXsfl_59_idx ;
      edtRegi_Id_Internalname = "REGI_ID_"+sGXsfl_59_idx ;
      edtRegi_Cod_Internalname = "REGI_COD_"+sGXsfl_59_idx ;
      edtRegi_Descripcion_Internalname = "REGI_DESCRIPCION_"+sGXsfl_59_idx ;
      cmbCuen_Estado.setInternalname( "CUEN_ESTADO_"+sGXsfl_59_idx );
      edtCuen_UsuarioCrea_Internalname = "CUEN_USUARIOCREA_"+sGXsfl_59_idx ;
      edtCuen_FechaCrea_Internalname = "CUEN_FECHACREA_"+sGXsfl_59_idx ;
      edtCuen_UsuarioModifica_Internalname = "CUEN_USUARIOMODIFICA_"+sGXsfl_59_idx ;
      edtCuen_FechaModifica_Internalname = "CUEN_FECHAMODIFICA_"+sGXsfl_59_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_59_idx ;
   }

   public void subsflControlProps_fel_592( )
   {
      edtCuen_Identificacion_Internalname = "CUEN_IDENTIFICACION_"+sGXsfl_59_fel_idx ;
      edtCuen_Cedula_Internalname = "CUEN_CEDULA_"+sGXsfl_59_fel_idx ;
      edtCuen_DigitoVerificacion_Internalname = "CUEN_DIGITOVERIFICACION_"+sGXsfl_59_fel_idx ;
      edtCuen_PrimerNombre_Internalname = "CUEN_PRIMERNOMBRE_"+sGXsfl_59_fel_idx ;
      edtCuen_SegundoNombre_Internalname = "CUEN_SEGUNDONOMBRE_"+sGXsfl_59_fel_idx ;
      edtCuen_PrimerApellido_Internalname = "CUEN_PRIMERAPELLIDO_"+sGXsfl_59_fel_idx ;
      edtCuen_SegundoApellido_Internalname = "CUEN_SEGUNDOAPELLIDO_"+sGXsfl_59_fel_idx ;
      edtCuen_Nombre_Internalname = "CUEN_NOMBRE_"+sGXsfl_59_fel_idx ;
      edtTpte_Codigo_Internalname = "TPTE_CODIGO_"+sGXsfl_59_fel_idx ;
      edtTpte_Descripcion_Internalname = "TPTE_DESCRIPCION_"+sGXsfl_59_fel_idx ;
      edtCuen_Clase_Internalname = "CUEN_CLASE_"+sGXsfl_59_fel_idx ;
      edtCuen_Direccion_Internalname = "CUEN_DIRECCION_"+sGXsfl_59_fel_idx ;
      edtCuen_Telefono_Internalname = "CUEN_TELEFONO_"+sGXsfl_59_fel_idx ;
      edtCuen_Email_Internalname = "CUEN_EMAIL_"+sGXsfl_59_fel_idx ;
      edtCiud_Codigo_Internalname = "CIUD_CODIGO_"+sGXsfl_59_fel_idx ;
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION_"+sGXsfl_59_fel_idx ;
      edtDept_Codigo_Internalname = "DEPT_CODIGO_"+sGXsfl_59_fel_idx ;
      edtDept_Descripcion_Internalname = "DEPT_DESCRIPCION_"+sGXsfl_59_fel_idx ;
      edtCent_Id_Internalname = "CENT_ID_"+sGXsfl_59_fel_idx ;
      edtCent_Codigo_Internalname = "CENT_CODIGO_"+sGXsfl_59_fel_idx ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION_"+sGXsfl_59_fel_idx ;
      edtRegi_Id_Internalname = "REGI_ID_"+sGXsfl_59_fel_idx ;
      edtRegi_Cod_Internalname = "REGI_COD_"+sGXsfl_59_fel_idx ;
      edtRegi_Descripcion_Internalname = "REGI_DESCRIPCION_"+sGXsfl_59_fel_idx ;
      cmbCuen_Estado.setInternalname( "CUEN_ESTADO_"+sGXsfl_59_fel_idx );
      edtCuen_UsuarioCrea_Internalname = "CUEN_USUARIOCREA_"+sGXsfl_59_fel_idx ;
      edtCuen_FechaCrea_Internalname = "CUEN_FECHACREA_"+sGXsfl_59_fel_idx ;
      edtCuen_UsuarioModifica_Internalname = "CUEN_USUARIOMODIFICA_"+sGXsfl_59_fel_idx ;
      edtCuen_FechaModifica_Internalname = "CUEN_FECHAMODIFICA_"+sGXsfl_59_fel_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_59_fel_idx ;
   }

   public void sendrow_592( )
   {
      subsflControlProps_592( ) ;
      wb1J0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Identificacion_Internalname,GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Identificacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Cedula_Internalname,GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Cedula_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_DigitoVerificacion_Internalname,GXutil.ltrim( localUtil.ntoc( A326Cuen_DigitoVerificacion, (byte)(1), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_DigitoVerificacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_PrimerNombre_Internalname,A331Cuen_PrimerNombre,GXutil.rtrim( localUtil.format( A331Cuen_PrimerNombre, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_PrimerNombre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_SegundoNombre_Internalname,A332Cuen_SegundoNombre,GXutil.rtrim( localUtil.format( A332Cuen_SegundoNombre, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_SegundoNombre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_PrimerApellido_Internalname,A329Cuen_PrimerApellido,GXutil.rtrim( localUtil.format( A329Cuen_PrimerApellido, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_PrimerApellido_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_SegundoApellido_Internalname,A330Cuen_SegundoApellido,GXutil.rtrim( localUtil.format( A330Cuen_SegundoApellido, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_SegundoApellido_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Nombre_Internalname,A44Cuen_Nombre,GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Nombre_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpte_Codigo_Internalname,GXutil.rtrim( A42Tpte_Codigo),GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpte_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTpte_Descripcion_Internalname,A321Tpte_Descripcion,GXutil.rtrim( localUtil.format( A321Tpte_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTpte_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Clase_Internalname,A328Cuen_Clase,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Clase_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Direccion_Internalname,A334Cuen_Direccion,"","","'"+""+"'"+",false,"+"'"+""+"'","http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A334Cuen_Direccion),"_blank","","",edtCuen_Direccion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1024),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Address","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Telefono_Internalname,A335Cuen_Telefono,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Telefono_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Email_Internalname,A336Cuen_Email,"","","'"+""+"'"+",false,"+"'"+""+"'","mailto:"+A336Cuen_Email,"","","",edtCuen_Email_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"email","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Email","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCiud_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCiud_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCiud_Descripcion_Internalname,A7Ciud_Descripcion,GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCiud_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDept_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDept_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDept_Descripcion_Internalname,A10Dept_Descripcion,GXutil.rtrim( localUtil.format( A10Dept_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDept_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Codigo_Internalname,A3Cent_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Descripcion_Internalname,A4Cent_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Cod_Internalname,GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Descripcion_Internalname,A13Regi_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_59_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CUEN_ESTADO_" + sGXsfl_59_idx ;
            cmbCuen_Estado.setName( GXCCtl );
            cmbCuen_Estado.setWebtags( "" );
            cmbCuen_Estado.addItem("A", "Activo", (short)(0));
            cmbCuen_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbCuen_Estado.getItemCount() > 0 )
            {
               A333Cuen_Estado = cmbCuen_Estado.getValidValue(A333Cuen_Estado) ;
               n333Cuen_Estado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCuen_Estado,cmbCuen_Estado.getInternalname(),GXutil.rtrim( A333Cuen_Estado),new Integer(1),cmbCuen_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbCuen_Estado.setValue( GXutil.rtrim( A333Cuen_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCuen_Estado.getInternalname(), "Values", cmbCuen_Estado.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_UsuarioCrea_Internalname,A337Cuen_UsuarioCrea,GXutil.rtrim( localUtil.format( A337Cuen_UsuarioCrea, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_FechaCrea_Internalname,localUtil.ttoc( A338Cuen_FechaCrea, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A338Cuen_FechaCrea, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_FechaCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_UsuarioModifica_Internalname,A339Cuen_UsuarioModifica,GXutil.rtrim( localUtil.format( A339Cuen_UsuarioModifica, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_FechaModifica_Internalname,localUtil.ttoc( A340Cuen_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A340Cuen_FechaModifica, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
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
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_IDENTIFICACION"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_CEDULA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_DIGITOVERIFICACION"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( DecimalUtil.doubleToDec(A326Cuen_DigitoVerificacion), "9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_PRIMERNOMBRE"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A331Cuen_PrimerNombre, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_SEGUNDONOMBRE"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A332Cuen_SegundoNombre, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_PRIMERAPELLIDO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A329Cuen_PrimerApellido, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_SEGUNDOAPELLIDO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A330Cuen_SegundoApellido, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_NOMBRE"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TPTE_CODIGO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A42Tpte_Codigo, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_CLASE"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A328Cuen_Clase, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_DIRECCION"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A334Cuen_Direccion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_TELEFONO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A335Cuen_Telefono, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_EMAIL"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A336Cuen_Email, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ID"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_REGI_ID"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_ESTADO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A333Cuen_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_USUARIOCREA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A337Cuen_UsuarioCrea, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_FECHACREA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( A338Cuen_FechaCrea, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_USUARIOMODIFICA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A339Cuen_UsuarioModifica, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_FECHAMODIFICA"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( A340Cuen_FechaModifica, "99/99/99 99:99")));
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
      edtavCuen_cedula_Internalname = "vCUEN_CEDULA" ;
      divTabletop_Internalname = "TABLETOP" ;
      lblLblcuen_nombrefilter_Internalname = "LBLCUEN_NOMBREFILTER" ;
      edtavCuen_nombre_Internalname = "vCUEN_NOMBRE" ;
      divCuen_nombrefiltercontainer_Internalname = "CUEN_NOMBREFILTERCONTAINER" ;
      lblLblregi_descripcionfilter_Internalname = "LBLREGI_DESCRIPCIONFILTER" ;
      edtavRegi_descripcion_Internalname = "vREGI_DESCRIPCION" ;
      divRegi_descripcionfiltercontainer_Internalname = "REGI_DESCRIPCIONFILTERCONTAINER" ;
      lblLblcuen_estadofilter_Internalname = "LBLCUEN_ESTADOFILTER" ;
      cmbavCuen_estado.setInternalname( "vCUEN_ESTADO" );
      divCuen_estadofiltercontainer_Internalname = "CUEN_ESTADOFILTERCONTAINER" ;
      divFilterscontainer_Internalname = "FILTERSCONTAINER" ;
      edtCuen_Identificacion_Internalname = "CUEN_IDENTIFICACION" ;
      edtCuen_Cedula_Internalname = "CUEN_CEDULA" ;
      edtCuen_DigitoVerificacion_Internalname = "CUEN_DIGITOVERIFICACION" ;
      edtCuen_PrimerNombre_Internalname = "CUEN_PRIMERNOMBRE" ;
      edtCuen_SegundoNombre_Internalname = "CUEN_SEGUNDONOMBRE" ;
      edtCuen_PrimerApellido_Internalname = "CUEN_PRIMERAPELLIDO" ;
      edtCuen_SegundoApellido_Internalname = "CUEN_SEGUNDOAPELLIDO" ;
      edtCuen_Nombre_Internalname = "CUEN_NOMBRE" ;
      edtTpte_Codigo_Internalname = "TPTE_CODIGO" ;
      edtTpte_Descripcion_Internalname = "TPTE_DESCRIPCION" ;
      edtCuen_Clase_Internalname = "CUEN_CLASE" ;
      edtCuen_Direccion_Internalname = "CUEN_DIRECCION" ;
      edtCuen_Telefono_Internalname = "CUEN_TELEFONO" ;
      edtCuen_Email_Internalname = "CUEN_EMAIL" ;
      edtCiud_Codigo_Internalname = "CIUD_CODIGO" ;
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION" ;
      edtDept_Codigo_Internalname = "DEPT_CODIGO" ;
      edtDept_Descripcion_Internalname = "DEPT_DESCRIPCION" ;
      edtCent_Id_Internalname = "CENT_ID" ;
      edtCent_Codigo_Internalname = "CENT_CODIGO" ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION" ;
      edtRegi_Id_Internalname = "REGI_ID" ;
      edtRegi_Cod_Internalname = "REGI_COD" ;
      edtRegi_Descripcion_Internalname = "REGI_DESCRIPCION" ;
      cmbCuen_Estado.setInternalname( "CUEN_ESTADO" );
      edtCuen_UsuarioCrea_Internalname = "CUEN_USUARIOCREA" ;
      edtCuen_FechaCrea_Internalname = "CUEN_FECHACREA" ;
      edtCuen_UsuarioModifica_Internalname = "CUEN_USUARIOMODIFICA" ;
      edtCuen_FechaModifica_Internalname = "CUEN_FECHAMODIFICA" ;
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
      edtCuen_FechaModifica_Jsonclick = "" ;
      edtCuen_UsuarioModifica_Jsonclick = "" ;
      edtCuen_FechaCrea_Jsonclick = "" ;
      edtCuen_UsuarioCrea_Jsonclick = "" ;
      cmbCuen_Estado.setJsonclick( "" );
      edtRegi_Descripcion_Jsonclick = "" ;
      edtRegi_Cod_Jsonclick = "" ;
      edtRegi_Id_Jsonclick = "" ;
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Id_Jsonclick = "" ;
      edtDept_Descripcion_Jsonclick = "" ;
      edtDept_Codigo_Jsonclick = "" ;
      edtCiud_Descripcion_Jsonclick = "" ;
      edtCiud_Codigo_Jsonclick = "" ;
      edtCuen_Email_Jsonclick = "" ;
      edtCuen_Telefono_Jsonclick = "" ;
      edtCuen_Direccion_Jsonclick = "" ;
      edtCuen_Clase_Jsonclick = "" ;
      edtTpte_Descripcion_Jsonclick = "" ;
      edtTpte_Codigo_Jsonclick = "" ;
      edtCuen_Nombre_Jsonclick = "" ;
      edtCuen_SegundoApellido_Jsonclick = "" ;
      edtCuen_PrimerApellido_Jsonclick = "" ;
      edtCuen_SegundoNombre_Jsonclick = "" ;
      edtCuen_PrimerNombre_Jsonclick = "" ;
      edtCuen_DigitoVerificacion_Jsonclick = "" ;
      edtCuen_Cedula_Jsonclick = "" ;
      edtCuen_Identificacion_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavUpdate_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divGridcell_Class = "col-xs-12 col-sm-9 col-md-10 WWGridCell" ;
      cmbavCuen_estado.setJsonclick( "" );
      cmbavCuen_estado.setEnabled( 1 );
      cmbavCuen_estado.setVisible( 1 );
      lblLblcuen_estadofilter_Caption = "Estado" ;
      edtavRegi_descripcion_Jsonclick = "" ;
      edtavRegi_descripcion_Enabled = 1 ;
      edtavRegi_descripcion_Visible = 1 ;
      lblLblregi_descripcionfilter_Caption = "Regional" ;
      edtavCuen_nombre_Jsonclick = "" ;
      edtavCuen_nombre_Enabled = 1 ;
      edtavCuen_nombre_Visible = 1 ;
      lblLblcuen_nombrefilter_Caption = "Nombre" ;
      edtavCuen_cedula_Jsonclick = "" ;
      edtavCuen_cedula_Enabled = 1 ;
      bttBtntoggle_Class = "HideFiltersButton" ;
      bttBtntoggle_Caption = "Otros Filtros" ;
      divCuen_estadofiltercontainer_Class = "AdvancedContainerItem" ;
      divRegi_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divCuen_nombrefiltercontainer_Class = "AdvancedContainerItem" ;
      divFilterscontainer_Class = "AdvancedContainer" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With ALM_CUENTADANTE_MULTI" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Cuen_Nombre',fld:'vCUEN_NOMBRE',pic:'@!',nv:''},{av:'AV19ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'cmbavCuen_estado'},{av:'AV17Cuen_Estado',fld:'vCUEN_ESTADO',pic:'',nv:''},{av:'AV22Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'lblLblcuen_nombrefilter_Caption',ctrl:'LBLCUEN_NOMBREFILTER',prop:'Caption'},{av:'lblLblregi_descripcionfilter_Caption',ctrl:'LBLREGI_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcuen_estadofilter_Caption',ctrl:'LBLCUEN_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("'TOGGLE'","{handler:'e111J1',iparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'}],oparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Caption'},{av:'divGridcell_Class',ctrl:'GRIDCELL',prop:'Class'}]}");
      setEventMetadata("LBLCUEN_NOMBREFILTER.CLICK","{handler:'e121J1',iparms:[{av:'divCuen_nombrefiltercontainer_Class',ctrl:'CUEN_NOMBREFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCuen_nombrefiltercontainer_Class',ctrl:'CUEN_NOMBREFILTERCONTAINER',prop:'Class'},{av:'edtavCuen_nombre_Visible',ctrl:'vCUEN_NOMBRE',prop:'Visible'}]}");
      setEventMetadata("LBLREGI_DESCRIPCIONFILTER.CLICK","{handler:'e131J1',iparms:[{av:'divRegi_descripcionfiltercontainer_Class',ctrl:'REGI_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRegi_descripcionfiltercontainer_Class',ctrl:'REGI_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavRegi_descripcion_Visible',ctrl:'vREGI_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLCUEN_ESTADOFILTER.CLICK","{handler:'e141J1',iparms:[{av:'divCuen_estadofiltercontainer_Class',ctrl:'CUEN_ESTADOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCuen_estadofiltercontainer_Class',ctrl:'CUEN_ESTADOFILTERCONTAINER',prop:'Class'},{av:'cmbavCuen_estado'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181J2',iparms:[{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e151J2',iparms:[{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Cuen_Nombre',fld:'vCUEN_NOMBRE',pic:'@!',nv:''},{av:'AV19ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'cmbavCuen_estado'},{av:'AV17Cuen_Estado',fld:'vCUEN_ESTADO',pic:'',nv:''},{av:'AV22Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'lblLblcuen_nombrefilter_Caption',ctrl:'LBLCUEN_NOMBREFILTER',prop:'Caption'},{av:'lblLblregi_descripcionfilter_Caption',ctrl:'LBLREGI_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcuen_estadofilter_Caption',ctrl:'LBLCUEN_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Cuen_Nombre',fld:'vCUEN_NOMBRE',pic:'@!',nv:''},{av:'AV19ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'cmbavCuen_estado'},{av:'AV17Cuen_Estado',fld:'vCUEN_ESTADO',pic:'',nv:''},{av:'AV22Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'lblLblcuen_nombrefilter_Caption',ctrl:'LBLCUEN_NOMBREFILTER',prop:'Caption'},{av:'lblLblregi_descripcionfilter_Caption',ctrl:'LBLREGI_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcuen_estadofilter_Caption',ctrl:'LBLCUEN_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Cuen_Nombre',fld:'vCUEN_NOMBRE',pic:'@!',nv:''},{av:'AV19ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'cmbavCuen_estado'},{av:'AV17Cuen_Estado',fld:'vCUEN_ESTADO',pic:'',nv:''},{av:'AV22Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'lblLblcuen_nombrefilter_Caption',ctrl:'LBLCUEN_NOMBREFILTER',prop:'Caption'},{av:'lblLblregi_descripcionfilter_Caption',ctrl:'LBLREGI_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcuen_estadofilter_Caption',ctrl:'LBLCUEN_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Cuen_Nombre',fld:'vCUEN_NOMBRE',pic:'@!',nv:''},{av:'AV19ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'cmbavCuen_estado'},{av:'AV17Cuen_Estado',fld:'vCUEN_ESTADO',pic:'',nv:''},{av:'AV22Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'lblLblcuen_nombrefilter_Caption',ctrl:'LBLCUEN_NOMBREFILTER',prop:'Caption'},{av:'lblLblregi_descripcionfilter_Caption',ctrl:'LBLREGI_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcuen_estadofilter_Caption',ctrl:'LBLCUEN_ESTADOFILTER',prop:'Caption'}]}");
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
      AV15Cuen_Nombre = "" ;
      AV16Regi_Descripcion = "" ;
      AV17Cuen_Estado = "" ;
      AV19ADVANCED_LABEL_TEMPLATE = "" ;
      AV22Pgmname = "" ;
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
      lblLblcuen_nombrefilter_Jsonclick = "" ;
      lblLblregi_descripcionfilter_Jsonclick = "" ;
      lblLblcuen_estadofilter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A331Cuen_PrimerNombre = "" ;
      A332Cuen_SegundoNombre = "" ;
      A329Cuen_PrimerApellido = "" ;
      A330Cuen_SegundoApellido = "" ;
      A44Cuen_Nombre = "" ;
      A42Tpte_Codigo = "" ;
      A321Tpte_Descripcion = "" ;
      A328Cuen_Clase = "" ;
      A334Cuen_Direccion = "" ;
      A335Cuen_Telefono = "" ;
      A336Cuen_Email = "" ;
      A7Ciud_Descripcion = "" ;
      A10Dept_Descripcion = "" ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A13Regi_Descripcion = "" ;
      A333Cuen_Estado = "" ;
      A337Cuen_UsuarioCrea = "" ;
      A338Cuen_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A339Cuen_UsuarioModifica = "" ;
      A340Cuen_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV23Update_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      H001J2_A340Cuen_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H001J2_n340Cuen_FechaModifica = new boolean[] {false} ;
      H001J2_A339Cuen_UsuarioModifica = new String[] {""} ;
      H001J2_n339Cuen_UsuarioModifica = new boolean[] {false} ;
      H001J2_A338Cuen_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H001J2_A337Cuen_UsuarioCrea = new String[] {""} ;
      H001J2_A333Cuen_Estado = new String[] {""} ;
      H001J2_n333Cuen_Estado = new boolean[] {false} ;
      H001J2_A13Regi_Descripcion = new String[] {""} ;
      H001J2_A12Regi_Cod = new short[1] ;
      H001J2_A2Regi_Id = new long[1] ;
      H001J2_A4Cent_Descripcion = new String[] {""} ;
      H001J2_A3Cent_Codigo = new String[] {""} ;
      H001J2_A1Cent_Id = new long[1] ;
      H001J2_A10Dept_Descripcion = new String[] {""} ;
      H001J2_A6Dept_Codigo = new short[1] ;
      H001J2_A7Ciud_Descripcion = new String[] {""} ;
      H001J2_A5Ciud_Codigo = new short[1] ;
      H001J2_A336Cuen_Email = new String[] {""} ;
      H001J2_n336Cuen_Email = new boolean[] {false} ;
      H001J2_A335Cuen_Telefono = new String[] {""} ;
      H001J2_n335Cuen_Telefono = new boolean[] {false} ;
      H001J2_A334Cuen_Direccion = new String[] {""} ;
      H001J2_n334Cuen_Direccion = new boolean[] {false} ;
      H001J2_A328Cuen_Clase = new String[] {""} ;
      H001J2_n328Cuen_Clase = new boolean[] {false} ;
      H001J2_A321Tpte_Descripcion = new String[] {""} ;
      H001J2_A42Tpte_Codigo = new String[] {""} ;
      H001J2_A44Cuen_Nombre = new String[] {""} ;
      H001J2_n44Cuen_Nombre = new boolean[] {false} ;
      H001J2_A330Cuen_SegundoApellido = new String[] {""} ;
      H001J2_n330Cuen_SegundoApellido = new boolean[] {false} ;
      H001J2_A329Cuen_PrimerApellido = new String[] {""} ;
      H001J2_n329Cuen_PrimerApellido = new boolean[] {false} ;
      H001J2_A332Cuen_SegundoNombre = new String[] {""} ;
      H001J2_n332Cuen_SegundoNombre = new boolean[] {false} ;
      H001J2_A331Cuen_PrimerNombre = new String[] {""} ;
      H001J2_n331Cuen_PrimerNombre = new boolean[] {false} ;
      H001J2_A326Cuen_DigitoVerificacion = new byte[1] ;
      H001J2_n326Cuen_DigitoVerificacion = new boolean[] {false} ;
      H001J2_A688Cuen_Cedula = new long[1] ;
      H001J2_A43Cuen_Identificacion = new long[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_cuentadante_multi__default(),
         new Object[] {
             new Object[] {
            H001J2_A340Cuen_FechaModifica, H001J2_n340Cuen_FechaModifica, H001J2_A339Cuen_UsuarioModifica, H001J2_n339Cuen_UsuarioModifica, H001J2_A338Cuen_FechaCrea, H001J2_A337Cuen_UsuarioCrea, H001J2_A333Cuen_Estado, H001J2_n333Cuen_Estado, H001J2_A13Regi_Descripcion, H001J2_A12Regi_Cod,
            H001J2_A2Regi_Id, H001J2_A4Cent_Descripcion, H001J2_A3Cent_Codigo, H001J2_A1Cent_Id, H001J2_A10Dept_Descripcion, H001J2_A6Dept_Codigo, H001J2_A7Ciud_Descripcion, H001J2_A5Ciud_Codigo, H001J2_A336Cuen_Email, H001J2_n336Cuen_Email,
            H001J2_A335Cuen_Telefono, H001J2_n335Cuen_Telefono, H001J2_A334Cuen_Direccion, H001J2_n334Cuen_Direccion, H001J2_A328Cuen_Clase, H001J2_n328Cuen_Clase, H001J2_A321Tpte_Descripcion, H001J2_A42Tpte_Codigo, H001J2_A44Cuen_Nombre, H001J2_n44Cuen_Nombre,
            H001J2_A330Cuen_SegundoApellido, H001J2_n330Cuen_SegundoApellido, H001J2_A329Cuen_PrimerApellido, H001J2_n329Cuen_PrimerApellido, H001J2_A332Cuen_SegundoNombre, H001J2_n332Cuen_SegundoNombre, H001J2_A331Cuen_PrimerNombre, H001J2_n331Cuen_PrimerNombre, H001J2_A326Cuen_DigitoVerificacion, H001J2_n326Cuen_DigitoVerificacion,
            H001J2_A688Cuen_Cedula, H001J2_A43Cuen_Identificacion
            }
         }
      );
      AV22Pgmname = "WWALM_CUENTADANTE_MULTI" ;
      /* GeneXus formulas. */
      AV22Pgmname = "WWALM_CUENTADANTE_MULTI" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID_nEOF ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte A326Cuen_DigitoVerificacion ;
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
   private short A5Ciud_Codigo ;
   private short A6Dept_Codigo ;
   private short A12Regi_Cod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int edtavCuen_cedula_Enabled ;
   private int edtavCuen_nombre_Visible ;
   private int edtavCuen_nombre_Enabled ;
   private int edtavRegi_descripcion_Visible ;
   private int edtavRegi_descripcion_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int AV11GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long AV14Cuen_Cedula ;
   private long A43Cuen_Identificacion ;
   private long GRID_nFirstRecordOnPage ;
   private long A688Cuen_Cedula ;
   private long A1Cent_Id ;
   private long A2Regi_Id ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String edtavUpdate_Tooltiptext ;
   private String divFilterscontainer_Class ;
   private String divCuen_nombrefiltercontainer_Class ;
   private String divRegi_descripcionfiltercontainer_Class ;
   private String divCuen_estadofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_59_idx="0001" ;
   private String edtavUpdate_Internalname ;
   private String AV17Cuen_Estado ;
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
   private String edtavCuen_cedula_Internalname ;
   private String edtavCuen_cedula_Jsonclick ;
   private String divFilterscontainer_Internalname ;
   private String divCuen_nombrefiltercontainer_Internalname ;
   private String lblLblcuen_nombrefilter_Internalname ;
   private String lblLblcuen_nombrefilter_Caption ;
   private String lblLblcuen_nombrefilter_Jsonclick ;
   private String edtavCuen_nombre_Internalname ;
   private String edtavCuen_nombre_Jsonclick ;
   private String divRegi_descripcionfiltercontainer_Internalname ;
   private String lblLblregi_descripcionfilter_Internalname ;
   private String lblLblregi_descripcionfilter_Caption ;
   private String lblLblregi_descripcionfilter_Jsonclick ;
   private String edtavRegi_descripcion_Internalname ;
   private String edtavRegi_descripcion_Jsonclick ;
   private String divCuen_estadofiltercontainer_Internalname ;
   private String lblLblcuen_estadofilter_Internalname ;
   private String lblLblcuen_estadofilter_Caption ;
   private String lblLblcuen_estadofilter_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridcell_Class ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String A42Tpte_Codigo ;
   private String A333Cuen_Estado ;
   private String edtavUpdate_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCuen_Identificacion_Internalname ;
   private String edtCuen_Cedula_Internalname ;
   private String edtCuen_DigitoVerificacion_Internalname ;
   private String edtCuen_PrimerNombre_Internalname ;
   private String edtCuen_SegundoNombre_Internalname ;
   private String edtCuen_PrimerApellido_Internalname ;
   private String edtCuen_SegundoApellido_Internalname ;
   private String edtCuen_Nombre_Internalname ;
   private String edtTpte_Codigo_Internalname ;
   private String edtTpte_Descripcion_Internalname ;
   private String edtCuen_Clase_Internalname ;
   private String edtCuen_Direccion_Internalname ;
   private String edtCuen_Telefono_Internalname ;
   private String edtCuen_Email_Internalname ;
   private String edtCiud_Codigo_Internalname ;
   private String edtCiud_Descripcion_Internalname ;
   private String edtDept_Codigo_Internalname ;
   private String edtDept_Descripcion_Internalname ;
   private String edtCent_Id_Internalname ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Descripcion_Internalname ;
   private String edtRegi_Id_Internalname ;
   private String edtRegi_Cod_Internalname ;
   private String edtRegi_Descripcion_Internalname ;
   private String edtCuen_UsuarioCrea_Internalname ;
   private String edtCuen_FechaCrea_Internalname ;
   private String edtCuen_UsuarioModifica_Internalname ;
   private String edtCuen_FechaModifica_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String sGXsfl_59_fel_idx="0001" ;
   private String ROClassString ;
   private String edtCuen_Identificacion_Jsonclick ;
   private String edtCuen_Cedula_Jsonclick ;
   private String edtCuen_DigitoVerificacion_Jsonclick ;
   private String edtCuen_PrimerNombre_Jsonclick ;
   private String edtCuen_SegundoNombre_Jsonclick ;
   private String edtCuen_PrimerApellido_Jsonclick ;
   private String edtCuen_SegundoApellido_Jsonclick ;
   private String edtCuen_Nombre_Jsonclick ;
   private String edtTpte_Codigo_Jsonclick ;
   private String edtTpte_Descripcion_Jsonclick ;
   private String edtCuen_Clase_Jsonclick ;
   private String edtCuen_Direccion_Jsonclick ;
   private String edtCuen_Telefono_Jsonclick ;
   private String edtCuen_Email_Jsonclick ;
   private String edtCiud_Codigo_Jsonclick ;
   private String edtCiud_Descripcion_Jsonclick ;
   private String edtDept_Codigo_Jsonclick ;
   private String edtDept_Descripcion_Jsonclick ;
   private String edtCent_Id_Jsonclick ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtRegi_Id_Jsonclick ;
   private String edtRegi_Cod_Jsonclick ;
   private String edtRegi_Descripcion_Jsonclick ;
   private String edtCuen_UsuarioCrea_Jsonclick ;
   private String edtCuen_FechaCrea_Jsonclick ;
   private String edtCuen_UsuarioModifica_Jsonclick ;
   private String edtCuen_FechaModifica_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A338Cuen_FechaCrea ;
   private java.util.Date A340Cuen_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_59_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n326Cuen_DigitoVerificacion ;
   private boolean n331Cuen_PrimerNombre ;
   private boolean n332Cuen_SegundoNombre ;
   private boolean n329Cuen_PrimerApellido ;
   private boolean n330Cuen_SegundoApellido ;
   private boolean n44Cuen_Nombre ;
   private boolean n328Cuen_Clase ;
   private boolean n334Cuen_Direccion ;
   private boolean n335Cuen_Telefono ;
   private boolean n336Cuen_Email ;
   private boolean n333Cuen_Estado ;
   private boolean n339Cuen_UsuarioModifica ;
   private boolean n340Cuen_FechaModifica ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV18Update_IsBlob ;
   private String AV15Cuen_Nombre ;
   private String AV16Regi_Descripcion ;
   private String A331Cuen_PrimerNombre ;
   private String A332Cuen_SegundoNombre ;
   private String A329Cuen_PrimerApellido ;
   private String A330Cuen_SegundoApellido ;
   private String A44Cuen_Nombre ;
   private String A321Tpte_Descripcion ;
   private String A328Cuen_Clase ;
   private String A334Cuen_Direccion ;
   private String A335Cuen_Telefono ;
   private String A336Cuen_Email ;
   private String A7Ciud_Descripcion ;
   private String A10Dept_Descripcion ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A13Regi_Descripcion ;
   private String A337Cuen_UsuarioCrea ;
   private String A339Cuen_UsuarioModifica ;
   private String AV23Update_GXI ;
   private String AV18Update ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private HTMLChoice cmbavCuen_estado ;
   private HTMLChoice cmbCuen_Estado ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H001J2_A340Cuen_FechaModifica ;
   private boolean[] H001J2_n340Cuen_FechaModifica ;
   private String[] H001J2_A339Cuen_UsuarioModifica ;
   private boolean[] H001J2_n339Cuen_UsuarioModifica ;
   private java.util.Date[] H001J2_A338Cuen_FechaCrea ;
   private String[] H001J2_A337Cuen_UsuarioCrea ;
   private String[] H001J2_A333Cuen_Estado ;
   private boolean[] H001J2_n333Cuen_Estado ;
   private String[] H001J2_A13Regi_Descripcion ;
   private short[] H001J2_A12Regi_Cod ;
   private long[] H001J2_A2Regi_Id ;
   private String[] H001J2_A4Cent_Descripcion ;
   private String[] H001J2_A3Cent_Codigo ;
   private long[] H001J2_A1Cent_Id ;
   private String[] H001J2_A10Dept_Descripcion ;
   private short[] H001J2_A6Dept_Codigo ;
   private String[] H001J2_A7Ciud_Descripcion ;
   private short[] H001J2_A5Ciud_Codigo ;
   private String[] H001J2_A336Cuen_Email ;
   private boolean[] H001J2_n336Cuen_Email ;
   private String[] H001J2_A335Cuen_Telefono ;
   private boolean[] H001J2_n335Cuen_Telefono ;
   private String[] H001J2_A334Cuen_Direccion ;
   private boolean[] H001J2_n334Cuen_Direccion ;
   private String[] H001J2_A328Cuen_Clase ;
   private boolean[] H001J2_n328Cuen_Clase ;
   private String[] H001J2_A321Tpte_Descripcion ;
   private String[] H001J2_A42Tpte_Codigo ;
   private String[] H001J2_A44Cuen_Nombre ;
   private boolean[] H001J2_n44Cuen_Nombre ;
   private String[] H001J2_A330Cuen_SegundoApellido ;
   private boolean[] H001J2_n330Cuen_SegundoApellido ;
   private String[] H001J2_A329Cuen_PrimerApellido ;
   private boolean[] H001J2_n329Cuen_PrimerApellido ;
   private String[] H001J2_A332Cuen_SegundoNombre ;
   private boolean[] H001J2_n332Cuen_SegundoNombre ;
   private String[] H001J2_A331Cuen_PrimerNombre ;
   private boolean[] H001J2_n331Cuen_PrimerNombre ;
   private byte[] H001J2_A326Cuen_DigitoVerificacion ;
   private boolean[] H001J2_n326Cuen_DigitoVerificacion ;
   private long[] H001J2_A688Cuen_Cedula ;
   private long[] H001J2_A43Cuen_Identificacion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwalm_cuentadante_multi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H001J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          long AV14Cuen_Cedula ,
                                          String AV17Cuen_Estado ,
                                          long A688Cuen_Cedula ,
                                          String A333Cuen_Estado ,
                                          String AV15Cuen_Nombre ,
                                          String A44Cuen_Nombre ,
                                          String AV16Regi_Descripcion ,
                                          String A13Regi_Descripcion ,
                                          String A42Tpte_Codigo )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [2] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      scmdbuf = "SELECT T1.Cuen_FechaModifica, T1.Cuen_UsuarioModifica, T1.Cuen_FechaCrea, T1.Cuen_UsuarioCrea," ;
      scmdbuf = scmdbuf + " T1.Cuen_Estado, T2.Regi_Descripcion, T2.Regi_Cod, T1.Regi_Id, T5.Cent_Descripcion," ;
      scmdbuf = scmdbuf + " T5.Cent_Codigo, T1.Cent_Id, T4.Dept_Descripcion, T3.Dept_Codigo, T3.Ciud_Descripcion," ;
      scmdbuf = scmdbuf + " T2.Ciud_Codigo, T1.Cuen_Email, T1.Cuen_Telefono, T1.Cuen_Direccion, T1.Cuen_Clase," ;
      scmdbuf = scmdbuf + " T6.Tpte_Descripcion, T1.Tpte_Codigo, T1.Cuen_Nombre, T1.Cuen_SegundoApellido, T1.Cuen_PrimerApellido," ;
      scmdbuf = scmdbuf + " T1.Cuen_SegundoNombre, T1.Cuen_PrimerNombre, T1.Cuen_DigitoVerificacion, T1.Cuen_Cedula," ;
      scmdbuf = scmdbuf + " T1.Cuen_Identificacion FROM (((((ALM_CUENTADANTE T1 INNER JOIN GEN_REGIONAL T2 ON" ;
      scmdbuf = scmdbuf + " T2.Regi_Id = T1.Regi_Id) INNER JOIN GEN_CIUDAD T3 ON T3.Ciud_Codigo = T2.Ciud_Codigo)" ;
      scmdbuf = scmdbuf + " INNER JOIN GEN_DEPARTAMENTO T4 ON T4.Dept_Codigo = T3.Dept_Codigo) INNER JOIN GEN_CENTROCOSTO" ;
      scmdbuf = scmdbuf + " T5 ON T5.Cent_Id = T1.Cent_Id) INNER JOIN ALM_TIPO_TERCERO T6 ON T6.Tpte_Codigo" ;
      scmdbuf = scmdbuf + " = T1.Tpte_Codigo)" ;
      scmdbuf = scmdbuf + " WHERE (T1.Tpte_Codigo = 'MU')" ;
      if ( ! (0==AV14Cuen_Cedula) )
      {
         sWhereString = sWhereString + " and (T1.Cuen_Cedula >= ?)" ;
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17Cuen_Estado)==0) )
      {
         sWhereString = sWhereString + " and (T1.Cuen_Estado = ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY T1.Cuen_Nombre" ;
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
                  return conditional_H001J2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
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
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[6])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[9])[0] = rslt.getShort(7) ;
               ((long[]) buf[10])[0] = rslt.getLong(8) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((long[]) buf[13])[0] = rslt.getLong(11) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(12) ;
               ((short[]) buf[15])[0] = rslt.getShort(13) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(14) ;
               ((short[]) buf[17])[0] = rslt.getShort(15) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[27])[0] = rslt.getString(21, 2) ;
               ((String[]) buf[28])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(27) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((long[]) buf[40])[0] = rslt.getLong(28) ;
               ((long[]) buf[41])[0] = rslt.getLong(29) ;
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
                  stmt.setBigDecimal(sIdx, ((Number) parms[2]).longValue(), 0);
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

