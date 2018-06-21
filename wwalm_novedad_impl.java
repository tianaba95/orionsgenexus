/*
               File: wwalm_novedad_impl
        Description: Work With Novedad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 15, 2018 11:8:18.55
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

public final  class wwalm_novedad_impl extends GXDataArea
{
   public wwalm_novedad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_novedad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_novedad_impl.class ));
   }

   public wwalm_novedad_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTnov_tipo = new HTMLChoice();
      cmbavNove_masivo = new HTMLChoice();
      cmbTNov_Tipo = new HTMLChoice();
      cmbNove_Masivo = new HTMLChoice();
      cmbNove_Estado = new HTMLChoice();
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
            nRC_GXsfl_99 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_99_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_99_idx = httpContext.GetNextPar( ) ;
            AV17Display = httpContext.GetNextPar( ) ;
            edtavDisplay_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Tooltiptext", edtavDisplay_Tooltiptext, !bGXsfl_99_Refreshing);
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
            AV15Nove_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
            AV16TNov_Tipo = httpContext.GetNextPar( ) ;
            AV22Nove_Masivo = httpContext.GetNextPar( ) ;
            AV19Nove_FechaRegistro = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            AV20Nove_TranCC = GXutil.lval( httpContext.GetNextPar( )) ;
            AV21Nove_Observaciones = httpContext.GetNextPar( ) ;
            AV23Nove_RespuestaProc = httpContext.GetNextPar( ) ;
            AV17Display = httpContext.GetNextPar( ) ;
            edtavDisplay_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Tooltiptext", edtavDisplay_Tooltiptext, !bGXsfl_99_Refreshing);
            AV18ADVANCED_LABEL_TEMPLATE = httpContext.GetNextPar( ) ;
            AV26Pgmname = httpContext.GetNextPar( ) ;
            A106Nove_Identificador = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14TNov_Descripcion, AV15Nove_Identificador, AV16TNov_Tipo, AV22Nove_Masivo, AV19Nove_FechaRegistro, AV20Nove_TranCC, AV21Nove_Observaciones, AV23Nove_RespuestaProc, AV17Display, AV18ADVANCED_LABEL_TEMPLATE, AV26Pgmname, A106Nove_Identificador) ;
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
      pa282( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start282( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186151181876");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_novedad") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vNOVE_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( AV15Nove_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTNOV_TIPO", AV16TNov_Tipo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vNOVE_MASIVO", AV22Nove_Masivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vNOVE_FECHAREGISTRO", localUtil.format(AV19Nove_FechaRegistro, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vNOVE_TRANCC", GXutil.ltrim( localUtil.ntoc( AV20Nove_TranCC, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vNOVE_OBSERVACIONES", AV21Nove_Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vNOVE_RESPUESTAPROC", AV23Nove_RespuestaProc);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_99", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_99, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vADVANCED_LABEL_TEMPLATE", GXutil.rtrim( AV18ADVANCED_LABEL_TEMPLATE));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV26Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vDISPLAY_Tooltiptext", GXutil.rtrim( edtavDisplay_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FILTERSCONTAINER_Class", GXutil.rtrim( divFilterscontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_IDENTIFICADORFILTERCONTAINER_Class", GXutil.rtrim( divNove_identificadorfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_TIPOFILTERCONTAINER_Class", GXutil.rtrim( divTnov_tipofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_FECHAREGISTROFILTERCONTAINER_Class", GXutil.rtrim( divNove_fecharegistrofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_TRANCCFILTERCONTAINER_Class", GXutil.rtrim( divNove_tranccfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_OBSERVACIONESFILTERCONTAINER_Class", GXutil.rtrim( divNove_observacionesfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_MASIVOFILTERCONTAINER_Class", GXutil.rtrim( divNove_masivofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_RESPUESTAPROCFILTERCONTAINER_Class", GXutil.rtrim( divNove_respuestaprocfiltercontainer_Class));
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
         we282( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt282( ) ;
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
      return formatLink("com.orions2.wwalm_novedad")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_NOVEDAD" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Novedad" ;
   }

   public void wb280( )
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 99, 2, 0)+","+"null"+");", bttBtntoggle_Caption, bttBtntoggle_Jsonclick, 7, "Ocultar filtros", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11281_client"+"'", TempTags, "", 2, "HLP_WWALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Novedades", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 99, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 7, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e12281_client"+"'", TempTags, "", 2, "HLP_WWALM_NOVEDAD.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         ClassString = "FilterSearchAttribute" ;
         StyleString = "" ;
         ClassString = "FilterSearchAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavTnov_descripcion_Internalname, AV14TNov_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", (short)(0), 1, edtavTnov_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "Descripción ", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WWALM_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divNove_identificadorfiltercontainer_Internalname, 1, 0, "px", 0, "px", divNove_identificadorfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblnove_identificadorfilter_Internalname, lblLblnove_identificadorfilter_Caption, "", "", lblLblnove_identificadorfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13281_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_identificador_Internalname, "Nove_Identificador", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_identificador_Internalname, GXutil.ltrim( localUtil.ntoc( AV15Nove_Identificador, (byte)(11), (byte)(0), ",", "")), ((edtavNove_identificador_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15Nove_Identificador), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV15Nove_Identificador), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_identificador_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavNove_identificador_Visible, edtavNove_identificador_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WWALM_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTnov_tipofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTnov_tipofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltnov_tipofilter_Internalname, lblLbltnov_tipofilter_Caption, "", "", lblLbltnov_tipofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14281_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_NOVEDAD.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTnov_tipo, cmbavTnov_tipo.getInternalname(), GXutil.rtrim( AV16TNov_Tipo), 1, cmbavTnov_tipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavTnov_tipo.getVisible(), cmbavTnov_tipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "FilterComboAttribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, "HLP_WWALM_NOVEDAD.htm");
         cmbavTnov_tipo.setValue( GXutil.rtrim( AV16TNov_Tipo) );
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divNove_masivofiltercontainer_Internalname, 1, 0, "px", 0, "px", divNove_masivofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblnove_masivofilter_Internalname, lblLblnove_masivofilter_Caption, "", "", lblLblnove_masivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15281_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavNove_masivo.getInternalname(), "Nove_Masivo", "col-sm-3 FilterComboAttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavNove_masivo, cmbavNove_masivo.getInternalname(), GXutil.rtrim( AV22Nove_Masivo), 1, cmbavNove_masivo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavNove_masivo.getVisible(), cmbavNove_masivo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "FilterComboAttribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "", true, "HLP_WWALM_NOVEDAD.htm");
         cmbavNove_masivo.setValue( GXutil.rtrim( AV22Nove_Masivo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavNove_masivo.getInternalname(), "Values", cmbavNove_masivo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divNove_fecharegistrofiltercontainer_Internalname, 1, 0, "px", 0, "px", divNove_fecharegistrofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblnove_fecharegistrofilter_Internalname, lblLblnove_fecharegistrofilter_Caption, "", "", lblLblnove_fecharegistrofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16281_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_fecharegistro_Internalname, "Nove_Fecha Registro", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavNove_fecharegistro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_fecharegistro_Internalname, localUtil.format(AV19Nove_FechaRegistro, "99/99/99"), localUtil.format( AV19Nove_FechaRegistro, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_fecharegistro_Jsonclick, 0, "FilterComboAttribute", "", "", "", 1, edtavNove_fecharegistro_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_WWALM_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divNove_tranccfiltercontainer_Internalname, 1, 0, "px", 0, "px", divNove_tranccfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblnove_tranccfilter_Internalname, lblLblnove_tranccfilter_Caption, "", "", lblLblnove_tranccfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e17281_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_trancc_Internalname, "Nove_Tran CC", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_trancc_Internalname, GXutil.ltrim( localUtil.ntoc( AV20Nove_TranCC, (byte)(18), (byte)(0), ",", "")), ((edtavNove_trancc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20Nove_TranCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV20Nove_TranCC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_trancc_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavNove_trancc_Visible, edtavNove_trancc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WWALM_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divNove_observacionesfiltercontainer_Internalname, 1, 0, "px", 0, "px", divNove_observacionesfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblnove_observacionesfilter_Internalname, lblLblnove_observacionesfilter_Caption, "", "", lblLblnove_observacionesfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e18281_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_observaciones_Internalname, "Nove_Observaciones", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         ClassString = "FilterComboAttribute" ;
         StyleString = "" ;
         ClassString = "FilterComboAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavNove_observaciones_Internalname, AV21Nove_Observaciones, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", (short)(0), edtavNove_observaciones_Visible, edtavNove_observaciones_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WWALM_NOVEDAD.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divNove_respuestaprocfiltercontainer_Internalname, 1, 0, "px", 0, "px", divNove_respuestaprocfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblnove_respuestaprocfilter_Internalname, lblLblnove_respuestaprocfilter_Caption, "", "", lblLblnove_respuestaprocfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e19281_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_NOVEDAD.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_respuestaproc_Internalname, "Nove_Respuesta Proc", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         ClassString = "FilterComboAttribute" ;
         StyleString = "" ;
         ClassString = "FilterComboAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavNove_respuestaproc_Internalname, AV23Nove_RespuestaProc, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", (short)(0), edtavNove_respuestaproc_Visible, edtavNove_respuestaproc_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WWALM_NOVEDAD.htm");
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"99\">") ;
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
            httpContext.writeValue( "Nro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Transacción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cód Región") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Región") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cód C.C ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cód Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Módulo Orígen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Almacén Orígen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Bodega Orígen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Ced Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Nom Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Ced Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Nom Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código de la Novedad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Novedad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Procedimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Observaciones") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Masivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Image"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Soporte") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Soporte") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "la Novedad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Respuesta") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Nombre del Campo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DisplayAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A106Nove_Identificador, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A780Nove_FechaRegistro, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A781Nove_UsuarioRegistro, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A814Nove_TranCC, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A107Nove_TransId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A782Nove_RegionId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A783Nove_RegionCodigo, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A784Nove_RegionDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A785Nove_CentroId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A786Nove_CentroCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A787Nove_CentroDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A788Nove_CodigoMovimiento);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A789Nove_MovimientoDescrip);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A790Nove_ModuloOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A791Nove_AlmaOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A792Nove_BodeOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A793Nove_CuentadanteIdOrigen, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A794Nove_CuentadanteCedOrigen, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A795Nove_CuentadanteNomOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A796Nove_ModuloDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A797Nove_AlmaDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A798Nove_BodeDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A799Nove_CuentadanteIdDestino, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A800Nove_CuentadanteCedDestino, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A801Nove_CuentadanteNomDestino);
            GridContainer.AddColumnProperties(GridColumn);
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
            GridColumn.AddObjectProperty("Value", A772TNov_Procedimiento);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A802Nove_Observaciones);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A803Nove_Masivo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A804Nove_Soporte);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A805Nove_RutaSoporte);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A765Nove_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A815Nove_RespuestaProc);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A774TNov_Nombre_Campo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV17Display));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavDisplay_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavDisplay_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 99 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_99 = (short)(nGXsfl_99_idx-1) ;
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

   public void start282( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Novedad", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup280( ) ;
   }

   public void ws282( )
   {
      start282( ) ;
      evt282( ) ;
   }

   public void evt282( )
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
                           nGXsfl_99_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_99_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_99_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_992( ) ;
                           A106Nove_Identificador = localUtil.ctol( httpContext.cgiGet( edtNove_Identificador_Internalname), ",", ".") ;
                           A780Nove_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtNove_FechaRegistro_Internalname), 0) ;
                           n780Nove_FechaRegistro = false ;
                           A781Nove_UsuarioRegistro = localUtil.ctol( httpContext.cgiGet( edtNove_UsuarioRegistro_Internalname), ",", ".") ;
                           n781Nove_UsuarioRegistro = false ;
                           A814Nove_TranCC = localUtil.ctol( httpContext.cgiGet( edtNove_TranCC_Internalname), ",", ".") ;
                           n814Nove_TranCC = false ;
                           A107Nove_TransId = localUtil.ctol( httpContext.cgiGet( edtNove_TransId_Internalname), ",", ".") ;
                           n107Nove_TransId = false ;
                           A782Nove_RegionId = localUtil.ctol( httpContext.cgiGet( edtNove_RegionId_Internalname), ",", ".") ;
                           n782Nove_RegionId = false ;
                           A783Nove_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtNove_RegionCodigo_Internalname), ",", ".")) ;
                           n783Nove_RegionCodigo = false ;
                           A784Nove_RegionDescripcion = httpContext.cgiGet( edtNove_RegionDescripcion_Internalname) ;
                           n784Nove_RegionDescripcion = false ;
                           A785Nove_CentroId = localUtil.ctol( httpContext.cgiGet( edtNove_CentroId_Internalname), ",", ".") ;
                           n785Nove_CentroId = false ;
                           A786Nove_CentroCodigo = httpContext.cgiGet( edtNove_CentroCodigo_Internalname) ;
                           n786Nove_CentroCodigo = false ;
                           A787Nove_CentroDescripcion = httpContext.cgiGet( edtNove_CentroDescripcion_Internalname) ;
                           n787Nove_CentroDescripcion = false ;
                           A788Nove_CodigoMovimiento = httpContext.cgiGet( edtNove_CodigoMovimiento_Internalname) ;
                           n788Nove_CodigoMovimiento = false ;
                           A789Nove_MovimientoDescrip = httpContext.cgiGet( edtNove_MovimientoDescrip_Internalname) ;
                           n789Nove_MovimientoDescrip = false ;
                           A790Nove_ModuloOrigen = httpContext.cgiGet( edtNove_ModuloOrigen_Internalname) ;
                           n790Nove_ModuloOrigen = false ;
                           A791Nove_AlmaOrigen = httpContext.cgiGet( edtNove_AlmaOrigen_Internalname) ;
                           n791Nove_AlmaOrigen = false ;
                           A792Nove_BodeOrigen = httpContext.cgiGet( edtNove_BodeOrigen_Internalname) ;
                           n792Nove_BodeOrigen = false ;
                           A793Nove_CuentadanteIdOrigen = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteIdOrigen_Internalname), ",", ".") ;
                           n793Nove_CuentadanteIdOrigen = false ;
                           A794Nove_CuentadanteCedOrigen = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteCedOrigen_Internalname), ",", ".") ;
                           n794Nove_CuentadanteCedOrigen = false ;
                           A795Nove_CuentadanteNomOrigen = GXutil.upper( httpContext.cgiGet( edtNove_CuentadanteNomOrigen_Internalname)) ;
                           n795Nove_CuentadanteNomOrigen = false ;
                           A796Nove_ModuloDestino = httpContext.cgiGet( edtNove_ModuloDestino_Internalname) ;
                           n796Nove_ModuloDestino = false ;
                           A797Nove_AlmaDestino = httpContext.cgiGet( edtNove_AlmaDestino_Internalname) ;
                           n797Nove_AlmaDestino = false ;
                           A798Nove_BodeDestino = httpContext.cgiGet( edtNove_BodeDestino_Internalname) ;
                           n798Nove_BodeDestino = false ;
                           A799Nove_CuentadanteIdDestino = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteIdDestino_Internalname), ",", ".") ;
                           n799Nove_CuentadanteIdDestino = false ;
                           A800Nove_CuentadanteCedDestino = localUtil.ctol( httpContext.cgiGet( edtNove_CuentadanteCedDestino_Internalname), ",", ".") ;
                           n800Nove_CuentadanteCedDestino = false ;
                           A801Nove_CuentadanteNomDestino = GXutil.upper( httpContext.cgiGet( edtNove_CuentadanteNomDestino_Internalname)) ;
                           n801Nove_CuentadanteNomDestino = false ;
                           A104TNov_Codigo = (int)(localUtil.ctol( httpContext.cgiGet( edtTNov_Codigo_Internalname), ",", ".")) ;
                           n104TNov_Codigo = false ;
                           A769TNov_Descripcion = httpContext.cgiGet( edtTNov_Descripcion_Internalname) ;
                           n769TNov_Descripcion = false ;
                           cmbTNov_Tipo.setName( cmbTNov_Tipo.getInternalname() );
                           cmbTNov_Tipo.setValue( httpContext.cgiGet( cmbTNov_Tipo.getInternalname()) );
                           A770TNov_Tipo = httpContext.cgiGet( cmbTNov_Tipo.getInternalname()) ;
                           n770TNov_Tipo = false ;
                           A772TNov_Procedimiento = httpContext.cgiGet( edtTNov_Procedimiento_Internalname) ;
                           n772TNov_Procedimiento = false ;
                           A802Nove_Observaciones = httpContext.cgiGet( edtNove_Observaciones_Internalname) ;
                           n802Nove_Observaciones = false ;
                           cmbNove_Masivo.setName( cmbNove_Masivo.getInternalname() );
                           cmbNove_Masivo.setValue( httpContext.cgiGet( cmbNove_Masivo.getInternalname()) );
                           A803Nove_Masivo = httpContext.cgiGet( cmbNove_Masivo.getInternalname()) ;
                           n803Nove_Masivo = false ;
                           A804Nove_Soporte = httpContext.cgiGet( edtNove_Soporte_Internalname) ;
                           n804Nove_Soporte = false ;
                           httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), !bGXsfl_99_Refreshing);
                           A805Nove_RutaSoporte = httpContext.cgiGet( edtNove_RutaSoporte_Internalname) ;
                           n805Nove_RutaSoporte = false ;
                           cmbNove_Estado.setName( cmbNove_Estado.getInternalname() );
                           cmbNove_Estado.setValue( httpContext.cgiGet( cmbNove_Estado.getInternalname()) );
                           A765Nove_Estado = httpContext.cgiGet( cmbNove_Estado.getInternalname()) ;
                           n765Nove_Estado = false ;
                           A815Nove_RespuestaProc = httpContext.cgiGet( edtNove_RespuestaProc_Internalname) ;
                           n815Nove_RespuestaProc = false ;
                           A774TNov_Nombre_Campo = httpContext.cgiGet( edtTNov_Nombre_Campo_Internalname) ;
                           n774TNov_Nombre_Campo = false ;
                           AV17Display = httpContext.cgiGet( edtavDisplay_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Bitmap", ((GXutil.strcmp("", AV17Display)==0) ? AV27Display_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV17Display))), !bGXsfl_99_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV17Display), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20282 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21282 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22282 ();
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
                                    /* Set Refresh If Nove_identificador Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vNOVE_IDENTIFICADOR"), ",", ".") != AV15Nove_Identificador )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tnov_tipo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTNOV_TIPO"), AV16TNov_Tipo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Nove_masivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vNOVE_MASIVO"), AV22Nove_Masivo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Nove_fecharegistro Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vNOVE_FECHAREGISTRO"), 0), AV19Nove_FechaRegistro) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Nove_trancc Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vNOVE_TRANCC"), ",", ".") != AV20Nove_TranCC )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Nove_observaciones Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vNOVE_OBSERVACIONES"), AV21Nove_Observaciones) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Nove_respuestaproc Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vNOVE_RESPUESTAPROC"), AV23Nove_RespuestaProc) != 0 )
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

   public void we282( )
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

   public void pa282( )
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
         cmbavTnov_tipo.addItem("", "(Todos)", (short)(0));
         cmbavTnov_tipo.addItem("T", "Transacción", (short)(0));
         cmbavTnov_tipo.addItem("P", "Consecutivo o Placa", (short)(0));
         cmbavTnov_tipo.addItem("D", "Las dos", (short)(0));
         if ( cmbavTnov_tipo.getItemCount() > 0 )
         {
            AV16TNov_Tipo = cmbavTnov_tipo.getValidValue(AV16TNov_Tipo) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TNov_Tipo", AV16TNov_Tipo);
         }
         cmbavNove_masivo.setName( "vNOVE_MASIVO" );
         cmbavNove_masivo.setWebtags( "" );
         cmbavNove_masivo.addItem("", "(Todos)", (short)(0));
         cmbavNove_masivo.addItem("SI", "SI", (short)(0));
         cmbavNove_masivo.addItem("NO", "NO", (short)(0));
         if ( cmbavNove_masivo.getItemCount() > 0 )
         {
            AV22Nove_Masivo = cmbavNove_masivo.getValidValue(AV22Nove_Masivo) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Nove_Masivo", AV22Nove_Masivo);
         }
         GXCCtl = "TNOV_TIPO_" + sGXsfl_99_idx ;
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
         GXCCtl = "NOVE_MASIVO_" + sGXsfl_99_idx ;
         cmbNove_Masivo.setName( GXCCtl );
         cmbNove_Masivo.setWebtags( "" );
         cmbNove_Masivo.addItem("", "", (short)(0));
         cmbNove_Masivo.addItem("SI", "SI", (short)(0));
         cmbNove_Masivo.addItem("NO", "NO", (short)(0));
         if ( cmbNove_Masivo.getItemCount() > 0 )
         {
            A803Nove_Masivo = cmbNove_Masivo.getValidValue(A803Nove_Masivo) ;
            n803Nove_Masivo = false ;
         }
         GXCCtl = "NOVE_ESTADO_" + sGXsfl_99_idx ;
         cmbNove_Estado.setName( GXCCtl );
         cmbNove_Estado.setWebtags( "" );
         if ( cmbNove_Estado.getItemCount() > 0 )
         {
            A765Nove_Estado = cmbNove_Estado.getValidValue(A765Nove_Estado) ;
            n765Nove_Estado = false ;
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
      subsflControlProps_992( ) ;
      while ( nGXsfl_99_idx <= nRC_GXsfl_99 )
      {
         sendrow_992( ) ;
         nGXsfl_99_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_99_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_99_idx+1)) ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_99_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_992( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV14TNov_Descripcion ,
                                 long AV15Nove_Identificador ,
                                 String AV16TNov_Tipo ,
                                 String AV22Nove_Masivo ,
                                 java.util.Date AV19Nove_FechaRegistro ,
                                 long AV20Nove_TranCC ,
                                 String AV21Nove_Observaciones ,
                                 String AV23Nove_RespuestaProc ,
                                 String AV17Display ,
                                 String AV18ADVANCED_LABEL_TEMPLATE ,
                                 String AV26Pgmname ,
                                 long A106Nove_Identificador )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf282( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_IDENTIFICADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A106Nove_Identificador), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( A106Nove_Identificador, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_FECHAREGISTRO", getSecureSignedToken( "", localUtil.format( A780Nove_FechaRegistro, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_FECHAREGISTRO", localUtil.ttoc( A780Nove_FechaRegistro, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_USUARIOREGISTRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_USUARIOREGISTRO", GXutil.ltrim( localUtil.ntoc( A781Nove_UsuarioRegistro, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_TRANSID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A107Nove_TransId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_TRANSID", GXutil.ltrim( localUtil.ntoc( A107Nove_TransId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_CODIGO", GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_OBSERVACIONES", getSecureSignedToken( "", A802Nove_Observaciones));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_OBSERVACIONES", A802Nove_Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_MASIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A803Nove_Masivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_MASIVO", A803Nove_Masivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_RUTASOPORTE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A805Nove_RutaSoporte, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_RUTASOPORTE", A805Nove_RutaSoporte);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A765Nove_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_ESTADO", GXutil.rtrim( A765Nove_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_RESPUESTAPROC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A815Nove_RespuestaProc, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NOVE_RESPUESTAPROC", A815Nove_RespuestaProc);
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavTnov_tipo.getItemCount() > 0 )
      {
         AV16TNov_Tipo = cmbavTnov_tipo.getValidValue(AV16TNov_Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16TNov_Tipo", AV16TNov_Tipo);
      }
      if ( cmbavNove_masivo.getItemCount() > 0 )
      {
         AV22Nove_Masivo = cmbavNove_masivo.getValidValue(AV22Nove_Masivo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Nove_Masivo", AV22Nove_Masivo);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf282( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV26Pgmname = "WWALM_NOVEDAD" ;
      Gx_err = (short)(0) ;
   }

   public void rf282( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(99) ;
      /* Execute user event: Refresh */
      e21282 ();
      nGXsfl_99_idx = (short)(1) ;
      sGXsfl_99_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_99_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_992( ) ;
      bGXsfl_99_Refreshing = true ;
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
         subsflControlProps_992( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              new Long(AV15Nove_Identificador) ,
                                              AV16TNov_Tipo ,
                                              new Long(AV20Nove_TranCC) ,
                                              AV22Nove_Masivo ,
                                              new Long(A106Nove_Identificador) ,
                                              A770TNov_Tipo ,
                                              new Long(A814Nove_TranCC) ,
                                              A803Nove_Masivo ,
                                              AV14TNov_Descripcion ,
                                              A769TNov_Descripcion ,
                                              AV19Nove_FechaRegistro ,
                                              A780Nove_FechaRegistro ,
                                              AV21Nove_Observaciones ,
                                              A802Nove_Observaciones ,
                                              AV23Nove_RespuestaProc ,
                                              A815Nove_RespuestaProc ,
                                              A765Nove_Estado } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         } ) ;
         lV16TNov_Tipo = GXutil.concat( GXutil.rtrim( AV16TNov_Tipo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16TNov_Tipo", AV16TNov_Tipo);
         lV22Nove_Masivo = GXutil.concat( GXutil.rtrim( AV22Nove_Masivo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Nove_Masivo", AV22Nove_Masivo);
         /* Using cursor H00282 */
         pr_default.execute(0, new Object[] {new Long(AV15Nove_Identificador), lV16TNov_Tipo, new Long(AV20Nove_TranCC), lV22Nove_Masivo});
         nGXsfl_99_idx = (short)(1) ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_99_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_992( ) ;
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
         {
            A802Nove_Observaciones = H00282_A802Nove_Observaciones[0] ;
            n802Nove_Observaciones = H00282_n802Nove_Observaciones[0] ;
            A774TNov_Nombre_Campo = H00282_A774TNov_Nombre_Campo[0] ;
            n774TNov_Nombre_Campo = H00282_n774TNov_Nombre_Campo[0] ;
            A815Nove_RespuestaProc = H00282_A815Nove_RespuestaProc[0] ;
            n815Nove_RespuestaProc = H00282_n815Nove_RespuestaProc[0] ;
            A765Nove_Estado = H00282_A765Nove_Estado[0] ;
            n765Nove_Estado = H00282_n765Nove_Estado[0] ;
            A805Nove_RutaSoporte = H00282_A805Nove_RutaSoporte[0] ;
            n805Nove_RutaSoporte = H00282_n805Nove_RutaSoporte[0] ;
            A804Nove_Soporte = H00282_A804Nove_Soporte[0] ;
            httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), !bGXsfl_99_Refreshing);
            n804Nove_Soporte = H00282_n804Nove_Soporte[0] ;
            A803Nove_Masivo = H00282_A803Nove_Masivo[0] ;
            n803Nove_Masivo = H00282_n803Nove_Masivo[0] ;
            A772TNov_Procedimiento = H00282_A772TNov_Procedimiento[0] ;
            n772TNov_Procedimiento = H00282_n772TNov_Procedimiento[0] ;
            A770TNov_Tipo = H00282_A770TNov_Tipo[0] ;
            n770TNov_Tipo = H00282_n770TNov_Tipo[0] ;
            A769TNov_Descripcion = H00282_A769TNov_Descripcion[0] ;
            n769TNov_Descripcion = H00282_n769TNov_Descripcion[0] ;
            A104TNov_Codigo = H00282_A104TNov_Codigo[0] ;
            n104TNov_Codigo = H00282_n104TNov_Codigo[0] ;
            A801Nove_CuentadanteNomDestino = H00282_A801Nove_CuentadanteNomDestino[0] ;
            n801Nove_CuentadanteNomDestino = H00282_n801Nove_CuentadanteNomDestino[0] ;
            A800Nove_CuentadanteCedDestino = H00282_A800Nove_CuentadanteCedDestino[0] ;
            n800Nove_CuentadanteCedDestino = H00282_n800Nove_CuentadanteCedDestino[0] ;
            A799Nove_CuentadanteIdDestino = H00282_A799Nove_CuentadanteIdDestino[0] ;
            n799Nove_CuentadanteIdDestino = H00282_n799Nove_CuentadanteIdDestino[0] ;
            A798Nove_BodeDestino = H00282_A798Nove_BodeDestino[0] ;
            n798Nove_BodeDestino = H00282_n798Nove_BodeDestino[0] ;
            A797Nove_AlmaDestino = H00282_A797Nove_AlmaDestino[0] ;
            n797Nove_AlmaDestino = H00282_n797Nove_AlmaDestino[0] ;
            A796Nove_ModuloDestino = H00282_A796Nove_ModuloDestino[0] ;
            n796Nove_ModuloDestino = H00282_n796Nove_ModuloDestino[0] ;
            A795Nove_CuentadanteNomOrigen = H00282_A795Nove_CuentadanteNomOrigen[0] ;
            n795Nove_CuentadanteNomOrigen = H00282_n795Nove_CuentadanteNomOrigen[0] ;
            A794Nove_CuentadanteCedOrigen = H00282_A794Nove_CuentadanteCedOrigen[0] ;
            n794Nove_CuentadanteCedOrigen = H00282_n794Nove_CuentadanteCedOrigen[0] ;
            A793Nove_CuentadanteIdOrigen = H00282_A793Nove_CuentadanteIdOrigen[0] ;
            n793Nove_CuentadanteIdOrigen = H00282_n793Nove_CuentadanteIdOrigen[0] ;
            A792Nove_BodeOrigen = H00282_A792Nove_BodeOrigen[0] ;
            n792Nove_BodeOrigen = H00282_n792Nove_BodeOrigen[0] ;
            A791Nove_AlmaOrigen = H00282_A791Nove_AlmaOrigen[0] ;
            n791Nove_AlmaOrigen = H00282_n791Nove_AlmaOrigen[0] ;
            A790Nove_ModuloOrigen = H00282_A790Nove_ModuloOrigen[0] ;
            n790Nove_ModuloOrigen = H00282_n790Nove_ModuloOrigen[0] ;
            A789Nove_MovimientoDescrip = H00282_A789Nove_MovimientoDescrip[0] ;
            n789Nove_MovimientoDescrip = H00282_n789Nove_MovimientoDescrip[0] ;
            A788Nove_CodigoMovimiento = H00282_A788Nove_CodigoMovimiento[0] ;
            n788Nove_CodigoMovimiento = H00282_n788Nove_CodigoMovimiento[0] ;
            A787Nove_CentroDescripcion = H00282_A787Nove_CentroDescripcion[0] ;
            n787Nove_CentroDescripcion = H00282_n787Nove_CentroDescripcion[0] ;
            A786Nove_CentroCodigo = H00282_A786Nove_CentroCodigo[0] ;
            n786Nove_CentroCodigo = H00282_n786Nove_CentroCodigo[0] ;
            A785Nove_CentroId = H00282_A785Nove_CentroId[0] ;
            n785Nove_CentroId = H00282_n785Nove_CentroId[0] ;
            A784Nove_RegionDescripcion = H00282_A784Nove_RegionDescripcion[0] ;
            n784Nove_RegionDescripcion = H00282_n784Nove_RegionDescripcion[0] ;
            A783Nove_RegionCodigo = H00282_A783Nove_RegionCodigo[0] ;
            n783Nove_RegionCodigo = H00282_n783Nove_RegionCodigo[0] ;
            A782Nove_RegionId = H00282_A782Nove_RegionId[0] ;
            n782Nove_RegionId = H00282_n782Nove_RegionId[0] ;
            A107Nove_TransId = H00282_A107Nove_TransId[0] ;
            n107Nove_TransId = H00282_n107Nove_TransId[0] ;
            A814Nove_TranCC = H00282_A814Nove_TranCC[0] ;
            n814Nove_TranCC = H00282_n814Nove_TranCC[0] ;
            A781Nove_UsuarioRegistro = H00282_A781Nove_UsuarioRegistro[0] ;
            n781Nove_UsuarioRegistro = H00282_n781Nove_UsuarioRegistro[0] ;
            A780Nove_FechaRegistro = H00282_A780Nove_FechaRegistro[0] ;
            n780Nove_FechaRegistro = H00282_n780Nove_FechaRegistro[0] ;
            A106Nove_Identificador = H00282_A106Nove_Identificador[0] ;
            A774TNov_Nombre_Campo = H00282_A774TNov_Nombre_Campo[0] ;
            n774TNov_Nombre_Campo = H00282_n774TNov_Nombre_Campo[0] ;
            A772TNov_Procedimiento = H00282_A772TNov_Procedimiento[0] ;
            n772TNov_Procedimiento = H00282_n772TNov_Procedimiento[0] ;
            A770TNov_Tipo = H00282_A770TNov_Tipo[0] ;
            n770TNov_Tipo = H00282_n770TNov_Tipo[0] ;
            A769TNov_Descripcion = H00282_A769TNov_Descripcion[0] ;
            n769TNov_Descripcion = H00282_n769TNov_Descripcion[0] ;
            A799Nove_CuentadanteIdDestino = H00282_A799Nove_CuentadanteIdDestino[0] ;
            n799Nove_CuentadanteIdDestino = H00282_n799Nove_CuentadanteIdDestino[0] ;
            A798Nove_BodeDestino = H00282_A798Nove_BodeDestino[0] ;
            n798Nove_BodeDestino = H00282_n798Nove_BodeDestino[0] ;
            A797Nove_AlmaDestino = H00282_A797Nove_AlmaDestino[0] ;
            n797Nove_AlmaDestino = H00282_n797Nove_AlmaDestino[0] ;
            A796Nove_ModuloDestino = H00282_A796Nove_ModuloDestino[0] ;
            n796Nove_ModuloDestino = H00282_n796Nove_ModuloDestino[0] ;
            A793Nove_CuentadanteIdOrigen = H00282_A793Nove_CuentadanteIdOrigen[0] ;
            n793Nove_CuentadanteIdOrigen = H00282_n793Nove_CuentadanteIdOrigen[0] ;
            A792Nove_BodeOrigen = H00282_A792Nove_BodeOrigen[0] ;
            n792Nove_BodeOrigen = H00282_n792Nove_BodeOrigen[0] ;
            A791Nove_AlmaOrigen = H00282_A791Nove_AlmaOrigen[0] ;
            n791Nove_AlmaOrigen = H00282_n791Nove_AlmaOrigen[0] ;
            A790Nove_ModuloOrigen = H00282_A790Nove_ModuloOrigen[0] ;
            n790Nove_ModuloOrigen = H00282_n790Nove_ModuloOrigen[0] ;
            A788Nove_CodigoMovimiento = H00282_A788Nove_CodigoMovimiento[0] ;
            n788Nove_CodigoMovimiento = H00282_n788Nove_CodigoMovimiento[0] ;
            A785Nove_CentroId = H00282_A785Nove_CentroId[0] ;
            n785Nove_CentroId = H00282_n785Nove_CentroId[0] ;
            A782Nove_RegionId = H00282_A782Nove_RegionId[0] ;
            n782Nove_RegionId = H00282_n782Nove_RegionId[0] ;
            A814Nove_TranCC = H00282_A814Nove_TranCC[0] ;
            n814Nove_TranCC = H00282_n814Nove_TranCC[0] ;
            A801Nove_CuentadanteNomDestino = H00282_A801Nove_CuentadanteNomDestino[0] ;
            n801Nove_CuentadanteNomDestino = H00282_n801Nove_CuentadanteNomDestino[0] ;
            A800Nove_CuentadanteCedDestino = H00282_A800Nove_CuentadanteCedDestino[0] ;
            n800Nove_CuentadanteCedDestino = H00282_n800Nove_CuentadanteCedDestino[0] ;
            A795Nove_CuentadanteNomOrigen = H00282_A795Nove_CuentadanteNomOrigen[0] ;
            n795Nove_CuentadanteNomOrigen = H00282_n795Nove_CuentadanteNomOrigen[0] ;
            A794Nove_CuentadanteCedOrigen = H00282_A794Nove_CuentadanteCedOrigen[0] ;
            n794Nove_CuentadanteCedOrigen = H00282_n794Nove_CuentadanteCedOrigen[0] ;
            A789Nove_MovimientoDescrip = H00282_A789Nove_MovimientoDescrip[0] ;
            n789Nove_MovimientoDescrip = H00282_n789Nove_MovimientoDescrip[0] ;
            A787Nove_CentroDescripcion = H00282_A787Nove_CentroDescripcion[0] ;
            n787Nove_CentroDescripcion = H00282_n787Nove_CentroDescripcion[0] ;
            A786Nove_CentroCodigo = H00282_A786Nove_CentroCodigo[0] ;
            n786Nove_CentroCodigo = H00282_n786Nove_CentroCodigo[0] ;
            A784Nove_RegionDescripcion = H00282_A784Nove_RegionDescripcion[0] ;
            n784Nove_RegionDescripcion = H00282_n784Nove_RegionDescripcion[0] ;
            A783Nove_RegionCodigo = H00282_A783Nove_RegionCodigo[0] ;
            n783Nove_RegionCodigo = H00282_n783Nove_RegionCodigo[0] ;
            if ( (GXutil.strcmp("", AV14TNov_Descripcion)==0) || ( GXutil.like( GXutil.upper( A769TNov_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV14TNov_Descripcion), "") , 254 , "%"),  ' ' ) ) )
            {
               if ( GXutil.dateCompare(GXutil.nullDate(), AV19Nove_FechaRegistro) || ( GXutil.dateCompare(GXutil.resetTime( A780Nove_FechaRegistro), AV19Nove_FechaRegistro) ) )
               {
                  if ( (GXutil.strcmp("", AV21Nove_Observaciones)==0) || ( GXutil.like( GXutil.upper( A802Nove_Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV21Nove_Observaciones), "") , 254 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV23Nove_RespuestaProc)==0) || ( GXutil.like( GXutil.upper( A815Nove_RespuestaProc) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23Nove_RespuestaProc), "") , 254 , "%"),  ' ' ) ) )
                     {
                        e22282 ();
                     }
                  }
               }
            }
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(99) ;
         wb280( ) ;
      }
      bGXsfl_99_Refreshing = true ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14TNov_Descripcion, AV15Nove_Identificador, AV16TNov_Tipo, AV22Nove_Masivo, AV19Nove_FechaRegistro, AV20Nove_TranCC, AV21Nove_Observaciones, AV23Nove_RespuestaProc, AV17Display, AV18ADVANCED_LABEL_TEMPLATE, AV26Pgmname, A106Nove_Identificador) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14TNov_Descripcion, AV15Nove_Identificador, AV16TNov_Tipo, AV22Nove_Masivo, AV19Nove_FechaRegistro, AV20Nove_TranCC, AV21Nove_Observaciones, AV23Nove_RespuestaProc, AV17Display, AV18ADVANCED_LABEL_TEMPLATE, AV26Pgmname, A106Nove_Identificador) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14TNov_Descripcion, AV15Nove_Identificador, AV16TNov_Tipo, AV22Nove_Masivo, AV19Nove_FechaRegistro, AV20Nove_TranCC, AV21Nove_Observaciones, AV23Nove_RespuestaProc, AV17Display, AV18ADVANCED_LABEL_TEMPLATE, AV26Pgmname, A106Nove_Identificador) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14TNov_Descripcion, AV15Nove_Identificador, AV16TNov_Tipo, AV22Nove_Masivo, AV19Nove_FechaRegistro, AV20Nove_TranCC, AV21Nove_Observaciones, AV23Nove_RespuestaProc, AV17Display, AV18ADVANCED_LABEL_TEMPLATE, AV26Pgmname, A106Nove_Identificador) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14TNov_Descripcion, AV15Nove_Identificador, AV16TNov_Tipo, AV22Nove_Masivo, AV19Nove_FechaRegistro, AV20Nove_TranCC, AV21Nove_Observaciones, AV23Nove_RespuestaProc, AV17Display, AV18ADVANCED_LABEL_TEMPLATE, AV26Pgmname, A106Nove_Identificador) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup280( )
   {
      /* Before Start, stand alone formulas. */
      AV26Pgmname = "WWALM_NOVEDAD" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20282 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14TNov_Descripcion = httpContext.cgiGet( edtavTnov_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14TNov_Descripcion", AV14TNov_Descripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNove_identificador_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNove_identificador_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNOVE_IDENTIFICADOR");
            GX_FocusControl = edtavNove_identificador_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15Nove_Identificador = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Nove_Identificador", GXutil.ltrim( GXutil.str( AV15Nove_Identificador, 11, 0)));
         }
         else
         {
            AV15Nove_Identificador = localUtil.ctol( httpContext.cgiGet( edtavNove_identificador_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Nove_Identificador", GXutil.ltrim( GXutil.str( AV15Nove_Identificador, 11, 0)));
         }
         cmbavTnov_tipo.setName( cmbavTnov_tipo.getInternalname() );
         cmbavTnov_tipo.setValue( httpContext.cgiGet( cmbavTnov_tipo.getInternalname()) );
         AV16TNov_Tipo = httpContext.cgiGet( cmbavTnov_tipo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16TNov_Tipo", AV16TNov_Tipo);
         cmbavNove_masivo.setName( cmbavNove_masivo.getInternalname() );
         cmbavNove_masivo.setValue( httpContext.cgiGet( cmbavNove_masivo.getInternalname()) );
         AV22Nove_Masivo = httpContext.cgiGet( cmbavNove_masivo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Nove_Masivo", AV22Nove_Masivo);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavNove_fecharegistro_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vNOVE_FECHAREGISTRO");
            GX_FocusControl = edtavNove_fecharegistro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19Nove_FechaRegistro = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Nove_FechaRegistro", localUtil.format(AV19Nove_FechaRegistro, "99/99/99"));
         }
         else
         {
            AV19Nove_FechaRegistro = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavNove_fecharegistro_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Nove_FechaRegistro", localUtil.format(AV19Nove_FechaRegistro, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNove_trancc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNove_trancc_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNOVE_TRANCC");
            GX_FocusControl = edtavNove_trancc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20Nove_TranCC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Nove_TranCC", GXutil.ltrim( GXutil.str( AV20Nove_TranCC, 18, 0)));
         }
         else
         {
            AV20Nove_TranCC = localUtil.ctol( httpContext.cgiGet( edtavNove_trancc_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Nove_TranCC", GXutil.ltrim( GXutil.str( AV20Nove_TranCC, 18, 0)));
         }
         AV21Nove_Observaciones = httpContext.cgiGet( edtavNove_observaciones_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Nove_Observaciones", AV21Nove_Observaciones);
         AV23Nove_RespuestaProc = httpContext.cgiGet( edtavNove_respuestaproc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Nove_RespuestaProc", AV23Nove_RespuestaProc);
         /* Read saved values. */
         nRC_GXsfl_99 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_99"), ",", ".")) ;
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
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vNOVE_IDENTIFICADOR"), ",", ".") != AV15Nove_Identificador )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTNOV_TIPO"), AV16TNov_Tipo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vNOVE_MASIVO"), AV22Nove_Masivo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vNOVE_FECHAREGISTRO"), 0), AV19Nove_FechaRegistro) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vNOVE_TRANCC"), ",", ".") != AV20Nove_TranCC )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vNOVE_OBSERVACIONES"), AV21Nove_Observaciones) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vNOVE_RESPUESTAPROC"), AV23Nove_RespuestaProc) != 0 )
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
      e20282 ();
      if (returnInSub) return;
   }

   public void e20282( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV26Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV26Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV17Display = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Bitmap", ((GXutil.strcmp("", AV17Display)==0) ? AV27Display_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV17Display))), !bGXsfl_99_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV17Display), true);
      AV27Display_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Bitmap", ((GXutil.strcmp("", AV17Display)==0) ? AV27Display_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV17Display))), !bGXsfl_99_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV17Display), true);
      edtavDisplay_Tooltiptext = "Consultar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Tooltiptext", edtavDisplay_Tooltiptext, !bGXsfl_99_Refreshing);
      AV16TNov_Tipo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16TNov_Tipo", AV16TNov_Tipo);
      AV22Nove_Masivo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Nove_Masivo", AV22Nove_Masivo);
      Form.setCaption( "Novedades" );
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

   public void e21282( )
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
      if ( (0==AV15Nove_Identificador) )
      {
         lblLblnove_identificadorfilter_Caption = "Identificador Novedad" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblnove_identificadorfilter_Internalname, "Caption", lblLblnove_identificadorfilter_Caption, true);
      }
      else
      {
         lblLblnove_identificadorfilter_Caption = GXutil.format( AV18ADVANCED_LABEL_TEMPLATE, "Identificador Novedad", GXutil.ltrim( GXutil.str( AV15Nove_Identificador, 11, 0)), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblnove_identificadorfilter_Internalname, "Caption", lblLblnove_identificadorfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV16TNov_Tipo)==0) )
      {
         lblLbltnov_tipofilter_Caption = "Tipo de Novedad" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltnov_tipofilter_Internalname, "Caption", lblLbltnov_tipofilter_Caption, true);
      }
      else
      {
         lblLbltnov_tipofilter_Caption = GXutil.format( AV18ADVANCED_LABEL_TEMPLATE, "Tipo de Novedad", AV16TNov_Tipo, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltnov_tipofilter_Internalname, "Caption", lblLbltnov_tipofilter_Caption, true);
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), AV19Nove_FechaRegistro) )
      {
         lblLblnove_fecharegistrofilter_Caption = "Fecha" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblnove_fecharegistrofilter_Internalname, "Caption", lblLblnove_fecharegistrofilter_Caption, true);
      }
      else
      {
         lblLblnove_fecharegistrofilter_Caption = GXutil.format( AV18ADVANCED_LABEL_TEMPLATE, "Fecha", localUtil.dtoc( AV19Nove_FechaRegistro, 0, "-"), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblnove_fecharegistrofilter_Internalname, "Caption", lblLblnove_fecharegistrofilter_Caption, true);
      }
      if ( (0==AV20Nove_TranCC) )
      {
         lblLblnove_tranccfilter_Caption = "Transacción" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblnove_tranccfilter_Internalname, "Caption", lblLblnove_tranccfilter_Caption, true);
      }
      else
      {
         lblLblnove_tranccfilter_Caption = GXutil.format( AV18ADVANCED_LABEL_TEMPLATE, "Transacción", GXutil.ltrim( GXutil.str( AV20Nove_TranCC, 18, 0)), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblnove_tranccfilter_Internalname, "Caption", lblLblnove_tranccfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV21Nove_Observaciones)==0) )
      {
         lblLblnove_observacionesfilter_Caption = "Observaciones" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblnove_observacionesfilter_Internalname, "Caption", lblLblnove_observacionesfilter_Caption, true);
      }
      else
      {
         lblLblnove_observacionesfilter_Caption = GXutil.format( AV18ADVANCED_LABEL_TEMPLATE, "Observaciones", AV21Nove_Observaciones, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblnove_observacionesfilter_Internalname, "Caption", lblLblnove_observacionesfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV22Nove_Masivo)==0) )
      {
         lblLblnove_masivofilter_Caption = "Masivo" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblnove_masivofilter_Internalname, "Caption", lblLblnove_masivofilter_Caption, true);
      }
      else
      {
         lblLblnove_masivofilter_Caption = GXutil.format( AV18ADVANCED_LABEL_TEMPLATE, "Masivo", AV22Nove_Masivo, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblnove_masivofilter_Internalname, "Caption", lblLblnove_masivofilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV23Nove_RespuestaProc)==0) )
      {
         lblLblnove_respuestaprocfilter_Caption = "Respuesta Procedimiento" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblnove_respuestaprocfilter_Internalname, "Caption", lblLblnove_respuestaprocfilter_Caption, true);
      }
      else
      {
         lblLblnove_respuestaprocfilter_Caption = GXutil.format( AV18ADVANCED_LABEL_TEMPLATE, "Respuesta Procedimiento", AV23Nove_RespuestaProc, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblnove_respuestaprocfilter_Internalname, "Caption", lblLblnove_respuestaprocfilter_Caption, true);
      }
   }

   private void e22282( )
   {
      /* Grid_Load Routine */
      edtavDisplay_Link = formatLink("com.orions2.alm_novedad") + "?" + GXutil.URLEncode(GXutil.rtrim("DSP")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A106Nove_Identificador,11,0))) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(99) ;
      }
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
      {
         sendrow_992( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_99_Refreshing )
      {
         httpContext.doAjaxLoad(99, GridRow);
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV8HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV9GridState.fromxml(AV7Session.getValue(AV26Pgmname+"GridState"), null, null);
         if ( AV9GridState.getgxTv_SdtGridState_Filtervalues().size() >= 8 )
         {
            AV14TNov_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14TNov_Descripcion", AV14TNov_Descripcion);
            AV15Nove_Identificador = GXutil.lval( ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+2)).getgxTv_SdtGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Nove_Identificador", GXutil.ltrim( GXutil.str( AV15Nove_Identificador, 11, 0)));
            AV16TNov_Tipo = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+3)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TNov_Tipo", AV16TNov_Tipo);
            AV19Nove_FechaRegistro = localUtil.ctod( ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+4)).getgxTv_SdtGridState_FilterValue_Value(), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Nove_FechaRegistro", localUtil.format(AV19Nove_FechaRegistro, "99/99/99"));
            AV20Nove_TranCC = GXutil.lval( ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+5)).getgxTv_SdtGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Nove_TranCC", GXutil.ltrim( GXutil.str( AV20Nove_TranCC, 18, 0)));
            AV21Nove_Observaciones = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+6)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Nove_Observaciones", AV21Nove_Observaciones);
            AV22Nove_Masivo = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+7)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Nove_Masivo", AV22Nove_Masivo);
            AV23Nove_RespuestaProc = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+8)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Nove_RespuestaProc", AV23Nove_RespuestaProc);
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
      AV9GridState.fromxml(AV7Session.getValue(AV26Pgmname+"GridState"), null, null);
      AV9GridState.setgxTv_SdtGridState_Currentpage( (short)(subgrid_currentpage( )) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().clear();
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV14TNov_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( GXutil.str( AV15Nove_Identificador, 11, 0) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV16TNov_Tipo );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( localUtil.dtoc( AV19Nove_FechaRegistro, 3, "/") );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( GXutil.str( AV20Nove_TranCC, 18, 0) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV21Nove_Observaciones );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV22Nove_Masivo );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV23Nove_RespuestaProc );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV7Session.setValue(AV26Pgmname+"GridState", AV9GridState.toxml(false, true, "GridState", "ACBSENA"));
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV12TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV26Pgmname );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV8HTTPRequest.getScriptName()+"?"+AV8HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "NOVEDAD" );
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
      pa282( ) ;
      ws282( ) ;
      we282( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186151182238");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wwalm_novedad.js", "?20186151182238");
      /* End function include_jscripts */
   }

   public void subsflControlProps_992( )
   {
      edtNove_Identificador_Internalname = "NOVE_IDENTIFICADOR_"+sGXsfl_99_idx ;
      edtNove_FechaRegistro_Internalname = "NOVE_FECHAREGISTRO_"+sGXsfl_99_idx ;
      edtNove_UsuarioRegistro_Internalname = "NOVE_USUARIOREGISTRO_"+sGXsfl_99_idx ;
      edtNove_TranCC_Internalname = "NOVE_TRANCC_"+sGXsfl_99_idx ;
      edtNove_TransId_Internalname = "NOVE_TRANSID_"+sGXsfl_99_idx ;
      edtNove_RegionId_Internalname = "NOVE_REGIONID_"+sGXsfl_99_idx ;
      edtNove_RegionCodigo_Internalname = "NOVE_REGIONCODIGO_"+sGXsfl_99_idx ;
      edtNove_RegionDescripcion_Internalname = "NOVE_REGIONDESCRIPCION_"+sGXsfl_99_idx ;
      edtNove_CentroId_Internalname = "NOVE_CENTROID_"+sGXsfl_99_idx ;
      edtNove_CentroCodigo_Internalname = "NOVE_CENTROCODIGO_"+sGXsfl_99_idx ;
      edtNove_CentroDescripcion_Internalname = "NOVE_CENTRODESCRIPCION_"+sGXsfl_99_idx ;
      edtNove_CodigoMovimiento_Internalname = "NOVE_CODIGOMOVIMIENTO_"+sGXsfl_99_idx ;
      edtNove_MovimientoDescrip_Internalname = "NOVE_MOVIMIENTODESCRIP_"+sGXsfl_99_idx ;
      edtNove_ModuloOrigen_Internalname = "NOVE_MODULOORIGEN_"+sGXsfl_99_idx ;
      edtNove_AlmaOrigen_Internalname = "NOVE_ALMAORIGEN_"+sGXsfl_99_idx ;
      edtNove_BodeOrigen_Internalname = "NOVE_BODEORIGEN_"+sGXsfl_99_idx ;
      edtNove_CuentadanteIdOrigen_Internalname = "NOVE_CUENTADANTEIDORIGEN_"+sGXsfl_99_idx ;
      edtNove_CuentadanteCedOrigen_Internalname = "NOVE_CUENTADANTECEDORIGEN_"+sGXsfl_99_idx ;
      edtNove_CuentadanteNomOrigen_Internalname = "NOVE_CUENTADANTENOMORIGEN_"+sGXsfl_99_idx ;
      edtNove_ModuloDestino_Internalname = "NOVE_MODULODESTINO_"+sGXsfl_99_idx ;
      edtNove_AlmaDestino_Internalname = "NOVE_ALMADESTINO_"+sGXsfl_99_idx ;
      edtNove_BodeDestino_Internalname = "NOVE_BODEDESTINO_"+sGXsfl_99_idx ;
      edtNove_CuentadanteIdDestino_Internalname = "NOVE_CUENTADANTEIDDESTINO_"+sGXsfl_99_idx ;
      edtNove_CuentadanteCedDestino_Internalname = "NOVE_CUENTADANTECEDDESTINO_"+sGXsfl_99_idx ;
      edtNove_CuentadanteNomDestino_Internalname = "NOVE_CUENTADANTENOMDESTINO_"+sGXsfl_99_idx ;
      edtTNov_Codigo_Internalname = "TNOV_CODIGO_"+sGXsfl_99_idx ;
      edtTNov_Descripcion_Internalname = "TNOV_DESCRIPCION_"+sGXsfl_99_idx ;
      cmbTNov_Tipo.setInternalname( "TNOV_TIPO_"+sGXsfl_99_idx );
      edtTNov_Procedimiento_Internalname = "TNOV_PROCEDIMIENTO_"+sGXsfl_99_idx ;
      edtNove_Observaciones_Internalname = "NOVE_OBSERVACIONES_"+sGXsfl_99_idx ;
      cmbNove_Masivo.setInternalname( "NOVE_MASIVO_"+sGXsfl_99_idx );
      edtNove_Soporte_Internalname = "NOVE_SOPORTE_"+sGXsfl_99_idx ;
      edtNove_RutaSoporte_Internalname = "NOVE_RUTASOPORTE_"+sGXsfl_99_idx ;
      cmbNove_Estado.setInternalname( "NOVE_ESTADO_"+sGXsfl_99_idx );
      edtNove_RespuestaProc_Internalname = "NOVE_RESPUESTAPROC_"+sGXsfl_99_idx ;
      edtTNov_Nombre_Campo_Internalname = "TNOV_NOMBRE_CAMPO_"+sGXsfl_99_idx ;
      edtavDisplay_Internalname = "vDISPLAY_"+sGXsfl_99_idx ;
   }

   public void subsflControlProps_fel_992( )
   {
      edtNove_Identificador_Internalname = "NOVE_IDENTIFICADOR_"+sGXsfl_99_fel_idx ;
      edtNove_FechaRegistro_Internalname = "NOVE_FECHAREGISTRO_"+sGXsfl_99_fel_idx ;
      edtNove_UsuarioRegistro_Internalname = "NOVE_USUARIOREGISTRO_"+sGXsfl_99_fel_idx ;
      edtNove_TranCC_Internalname = "NOVE_TRANCC_"+sGXsfl_99_fel_idx ;
      edtNove_TransId_Internalname = "NOVE_TRANSID_"+sGXsfl_99_fel_idx ;
      edtNove_RegionId_Internalname = "NOVE_REGIONID_"+sGXsfl_99_fel_idx ;
      edtNove_RegionCodigo_Internalname = "NOVE_REGIONCODIGO_"+sGXsfl_99_fel_idx ;
      edtNove_RegionDescripcion_Internalname = "NOVE_REGIONDESCRIPCION_"+sGXsfl_99_fel_idx ;
      edtNove_CentroId_Internalname = "NOVE_CENTROID_"+sGXsfl_99_fel_idx ;
      edtNove_CentroCodigo_Internalname = "NOVE_CENTROCODIGO_"+sGXsfl_99_fel_idx ;
      edtNove_CentroDescripcion_Internalname = "NOVE_CENTRODESCRIPCION_"+sGXsfl_99_fel_idx ;
      edtNove_CodigoMovimiento_Internalname = "NOVE_CODIGOMOVIMIENTO_"+sGXsfl_99_fel_idx ;
      edtNove_MovimientoDescrip_Internalname = "NOVE_MOVIMIENTODESCRIP_"+sGXsfl_99_fel_idx ;
      edtNove_ModuloOrigen_Internalname = "NOVE_MODULOORIGEN_"+sGXsfl_99_fel_idx ;
      edtNove_AlmaOrigen_Internalname = "NOVE_ALMAORIGEN_"+sGXsfl_99_fel_idx ;
      edtNove_BodeOrigen_Internalname = "NOVE_BODEORIGEN_"+sGXsfl_99_fel_idx ;
      edtNove_CuentadanteIdOrigen_Internalname = "NOVE_CUENTADANTEIDORIGEN_"+sGXsfl_99_fel_idx ;
      edtNove_CuentadanteCedOrigen_Internalname = "NOVE_CUENTADANTECEDORIGEN_"+sGXsfl_99_fel_idx ;
      edtNove_CuentadanteNomOrigen_Internalname = "NOVE_CUENTADANTENOMORIGEN_"+sGXsfl_99_fel_idx ;
      edtNove_ModuloDestino_Internalname = "NOVE_MODULODESTINO_"+sGXsfl_99_fel_idx ;
      edtNove_AlmaDestino_Internalname = "NOVE_ALMADESTINO_"+sGXsfl_99_fel_idx ;
      edtNove_BodeDestino_Internalname = "NOVE_BODEDESTINO_"+sGXsfl_99_fel_idx ;
      edtNove_CuentadanteIdDestino_Internalname = "NOVE_CUENTADANTEIDDESTINO_"+sGXsfl_99_fel_idx ;
      edtNove_CuentadanteCedDestino_Internalname = "NOVE_CUENTADANTECEDDESTINO_"+sGXsfl_99_fel_idx ;
      edtNove_CuentadanteNomDestino_Internalname = "NOVE_CUENTADANTENOMDESTINO_"+sGXsfl_99_fel_idx ;
      edtTNov_Codigo_Internalname = "TNOV_CODIGO_"+sGXsfl_99_fel_idx ;
      edtTNov_Descripcion_Internalname = "TNOV_DESCRIPCION_"+sGXsfl_99_fel_idx ;
      cmbTNov_Tipo.setInternalname( "TNOV_TIPO_"+sGXsfl_99_fel_idx );
      edtTNov_Procedimiento_Internalname = "TNOV_PROCEDIMIENTO_"+sGXsfl_99_fel_idx ;
      edtNove_Observaciones_Internalname = "NOVE_OBSERVACIONES_"+sGXsfl_99_fel_idx ;
      cmbNove_Masivo.setInternalname( "NOVE_MASIVO_"+sGXsfl_99_fel_idx );
      edtNove_Soporte_Internalname = "NOVE_SOPORTE_"+sGXsfl_99_fel_idx ;
      edtNove_RutaSoporte_Internalname = "NOVE_RUTASOPORTE_"+sGXsfl_99_fel_idx ;
      cmbNove_Estado.setInternalname( "NOVE_ESTADO_"+sGXsfl_99_fel_idx );
      edtNove_RespuestaProc_Internalname = "NOVE_RESPUESTAPROC_"+sGXsfl_99_fel_idx ;
      edtTNov_Nombre_Campo_Internalname = "TNOV_NOMBRE_CAMPO_"+sGXsfl_99_fel_idx ;
      edtavDisplay_Internalname = "vDISPLAY_"+sGXsfl_99_fel_idx ;
   }

   public void sendrow_992( )
   {
      subsflControlProps_992( ) ;
      wb280( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_99_idx <= subgrid_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_99_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_99_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_Identificador_Internalname,GXutil.ltrim( localUtil.ntoc( A106Nove_Identificador, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A106Nove_Identificador), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_Identificador_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_FechaRegistro_Internalname,localUtil.ttoc( A780Nove_FechaRegistro, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A780Nove_FechaRegistro, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_FechaRegistro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_UsuarioRegistro_Internalname,GXutil.ltrim( localUtil.ntoc( A781Nove_UsuarioRegistro, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_UsuarioRegistro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdLargo","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_TranCC_Internalname,GXutil.ltrim( localUtil.ntoc( A814Nove_TranCC, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A814Nove_TranCC), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_TranCC_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_TransId_Internalname,GXutil.ltrim( localUtil.ntoc( A107Nove_TransId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A107Nove_TransId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_TransId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_RegionId_Internalname,GXutil.ltrim( localUtil.ntoc( A782Nove_RegionId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A782Nove_RegionId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_RegionId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_RegionCodigo_Internalname,GXutil.ltrim( localUtil.ntoc( A783Nove_RegionCodigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A783Nove_RegionCodigo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_RegionCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_RegionDescripcion_Internalname,A784Nove_RegionDescripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_RegionDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CentroId_Internalname,GXutil.ltrim( localUtil.ntoc( A785Nove_CentroId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A785Nove_CentroId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_CentroId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CentroCodigo_Internalname,A786Nove_CentroCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_CentroCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CentroDescripcion_Internalname,A787Nove_CentroDescripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_CentroDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CodigoMovimiento_Internalname,A788Nove_CodigoMovimiento,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_CodigoMovimiento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_MovimientoDescrip_Internalname,A789Nove_MovimientoDescrip,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_MovimientoDescrip_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_ModuloOrigen_Internalname,A790Nove_ModuloOrigen,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_ModuloOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Modulo","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_AlmaOrigen_Internalname,A791Nove_AlmaOrigen,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_AlmaOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_BodeOrigen_Internalname,A792Nove_BodeOrigen,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_BodeOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CuentadanteIdOrigen_Internalname,GXutil.ltrim( localUtil.ntoc( A793Nove_CuentadanteIdOrigen, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A793Nove_CuentadanteIdOrigen), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_CuentadanteIdOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CuentadanteCedOrigen_Internalname,GXutil.ltrim( localUtil.ntoc( A794Nove_CuentadanteCedOrigen, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A794Nove_CuentadanteCedOrigen), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_CuentadanteCedOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CuentadanteNomOrigen_Internalname,A795Nove_CuentadanteNomOrigen,GXutil.rtrim( localUtil.format( A795Nove_CuentadanteNomOrigen, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_CuentadanteNomOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_ModuloDestino_Internalname,A796Nove_ModuloDestino,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_ModuloDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Modulo","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_AlmaDestino_Internalname,A797Nove_AlmaDestino,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_AlmaDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_BodeDestino_Internalname,A798Nove_BodeDestino,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_BodeDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CuentadanteIdDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A799Nove_CuentadanteIdDestino, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A799Nove_CuentadanteIdDestino), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_CuentadanteIdDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CuentadanteCedDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A800Nove_CuentadanteCedDestino, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A800Nove_CuentadanteCedDestino), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_CuentadanteCedDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_CuentadanteNomDestino_Internalname,A801Nove_CuentadanteNomDestino,GXutil.rtrim( localUtil.format( A801Nove_CuentadanteNomDestino, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_CuentadanteNomDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Codigo","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Descripcion_Internalname,A769TNov_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "TNOV_TIPO_" + sGXsfl_99_idx ;
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
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTNov_Tipo,cmbTNov_Tipo.getInternalname(),GXutil.rtrim( A770TNov_Tipo),new Integer(1),cmbTNov_Tipo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(1),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn","","",new Boolean(true)});
         cmbTNov_Tipo.setValue( GXutil.rtrim( A770TNov_Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTNov_Tipo.getInternalname(), "Values", cmbTNov_Tipo.ToJavascriptSource(), !bGXsfl_99_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Procedimiento_Internalname,A772TNov_Procedimiento,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Procedimiento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(60),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_Observaciones_Internalname,A802Nove_Observaciones,A802Nove_Observaciones,"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_Observaciones_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2097152),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(0),new Integer(-1),new Boolean(true),"","left",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_99_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "NOVE_MASIVO_" + sGXsfl_99_idx ;
            cmbNove_Masivo.setName( GXCCtl );
            cmbNove_Masivo.setWebtags( "" );
            cmbNove_Masivo.addItem("", "", (short)(0));
            cmbNove_Masivo.addItem("SI", "SI", (short)(0));
            cmbNove_Masivo.addItem("NO", "NO", (short)(0));
            if ( cmbNove_Masivo.getItemCount() > 0 )
            {
               A803Nove_Masivo = cmbNove_Masivo.getValidValue(A803Nove_Masivo) ;
               n803Nove_Masivo = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbNove_Masivo,cmbNove_Masivo.getInternalname(),GXutil.rtrim( A803Nove_Masivo),new Integer(1),cmbNove_Masivo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn","","",new Boolean(true)});
         cmbNove_Masivo.setValue( GXutil.rtrim( A803Nove_Masivo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNove_Masivo.getInternalname(), "Values", cmbNove_Masivo.ToJavascriptSource(), !bGXsfl_99_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         ClassString = "Image" ;
         StyleString = "" ;
         edtNove_Soporte_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "Filetype", edtNove_Soporte_Filetype, !bGXsfl_99_Refreshing);
         if ( ! (GXutil.strcmp("", A804Nove_Soporte)==0) )
         {
            gxblobfileaux.setSource( A804Nove_Soporte );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtNove_Soporte_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtNove_Soporte_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               A804Nove_Soporte = gxblobfileaux.getAbsoluteName() ;
               n804Nove_Soporte = false ;
               httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), !bGXsfl_99_Refreshing);
               edtNove_Soporte_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "Filetype", edtNove_Soporte_Filetype, !bGXsfl_99_Refreshing);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop("", false, edtNove_Soporte_Internalname, "URL", httpContext.getResourceRelative(A804Nove_Soporte), !bGXsfl_99_Refreshing);
         }
         GridRow.AddColumnProperties("blob", 2, isAjaxCallMode( ), new Object[] {edtNove_Soporte_Internalname,GXutil.rtrim( A804Nove_Soporte),httpContext.getResourceRelative(A804Nove_Soporte),((GXutil.strcmp("", edtNove_Soporte_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtNove_Soporte_Filetype)==0) ? A804Nove_Soporte : edtNove_Soporte_Filetype)) : edtNove_Soporte_Contenttype),new Boolean(false),"",edtNove_Soporte_Parameters,new Integer(0),new Integer(0),new Integer(0),"","",new Integer(0),new Integer(-1),new Integer(0),"px",new Integer(60),"px",new Integer(0),new Integer(0),new Integer(0),edtNove_Soporte_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'",StyleString,ClassString,"WWColumn WWOptionalColumn",""+"","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_RutaSoporte_Internalname,A805Nove_RutaSoporte,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_RutaSoporte_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_99_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "NOVE_ESTADO_" + sGXsfl_99_idx ;
            cmbNove_Estado.setName( GXCCtl );
            cmbNove_Estado.setWebtags( "" );
            if ( cmbNove_Estado.getItemCount() > 0 )
            {
               A765Nove_Estado = cmbNove_Estado.getValidValue(A765Nove_Estado) ;
               n765Nove_Estado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbNove_Estado,cmbNove_Estado.getInternalname(),GXutil.rtrim( A765Nove_Estado),new Integer(1),cmbNove_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbNove_Estado.setValue( GXutil.rtrim( A765Nove_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbNove_Estado.getInternalname(), "Values", cmbNove_Estado.ToJavascriptSource(), !bGXsfl_99_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNove_RespuestaProc_Internalname,A815Nove_RespuestaProc,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNove_RespuestaProc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTNov_Nombre_Campo_Internalname,A774TNov_Nombre_Campo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTNov_Nombre_Campo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(99),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "DisplayAttribute" ;
         StyleString = "" ;
         AV17Display_IsBlob = (boolean)(((GXutil.strcmp("", AV17Display)==0)&&(GXutil.strcmp("", AV27Display_GXI)==0))||!(GXutil.strcmp("", AV17Display)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV17Display)==0) ? AV27Display_GXI : httpContext.getResourceRelative(AV17Display)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDisplay_Internalname,sImgUrl,edtavDisplay_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavDisplay_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV17Display_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_IDENTIFICADOR"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, localUtil.format( DecimalUtil.doubleToDec(A106Nove_Identificador), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_FECHAREGISTRO"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, localUtil.format( A780Nove_FechaRegistro, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_USUARIOREGISTRO"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, localUtil.format( DecimalUtil.doubleToDec(A781Nove_UsuarioRegistro), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_TRANSID"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, localUtil.format( DecimalUtil.doubleToDec(A107Nove_TransId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TNOV_CODIGO"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, localUtil.format( DecimalUtil.doubleToDec(A104TNov_Codigo), "ZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_OBSERVACIONES"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, A802Nove_Observaciones));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_MASIVO"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, GXutil.rtrim( localUtil.format( A803Nove_Masivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_RUTASOPORTE"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, GXutil.rtrim( localUtil.format( A805Nove_RutaSoporte, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_ESTADO"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, GXutil.rtrim( localUtil.format( A765Nove_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_NOVE_RESPUESTAPROC"+"_"+sGXsfl_99_idx, getSecureSignedToken( sGXsfl_99_idx, GXutil.rtrim( localUtil.format( A815Nove_RespuestaProc, ""))));
         GridContainer.AddRow(GridRow);
         nGXsfl_99_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_99_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_99_idx+1)) ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_99_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_992( ) ;
      }
      /* End function sendrow_992 */
   }

   public void init_default_properties( )
   {
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      lblTitletext_Internalname = "TITLETEXT" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      edtavTnov_descripcion_Internalname = "vTNOV_DESCRIPCION" ;
      divTabletop_Internalname = "TABLETOP" ;
      lblLblnove_identificadorfilter_Internalname = "LBLNOVE_IDENTIFICADORFILTER" ;
      edtavNove_identificador_Internalname = "vNOVE_IDENTIFICADOR" ;
      divNove_identificadorfiltercontainer_Internalname = "NOVE_IDENTIFICADORFILTERCONTAINER" ;
      lblLbltnov_tipofilter_Internalname = "LBLTNOV_TIPOFILTER" ;
      cmbavTnov_tipo.setInternalname( "vTNOV_TIPO" );
      divTnov_tipofiltercontainer_Internalname = "TNOV_TIPOFILTERCONTAINER" ;
      lblLblnove_masivofilter_Internalname = "LBLNOVE_MASIVOFILTER" ;
      cmbavNove_masivo.setInternalname( "vNOVE_MASIVO" );
      divNove_masivofiltercontainer_Internalname = "NOVE_MASIVOFILTERCONTAINER" ;
      lblLblnove_fecharegistrofilter_Internalname = "LBLNOVE_FECHAREGISTROFILTER" ;
      edtavNove_fecharegistro_Internalname = "vNOVE_FECHAREGISTRO" ;
      divNove_fecharegistrofiltercontainer_Internalname = "NOVE_FECHAREGISTROFILTERCONTAINER" ;
      lblLblnove_tranccfilter_Internalname = "LBLNOVE_TRANCCFILTER" ;
      edtavNove_trancc_Internalname = "vNOVE_TRANCC" ;
      divNove_tranccfiltercontainer_Internalname = "NOVE_TRANCCFILTERCONTAINER" ;
      lblLblnove_observacionesfilter_Internalname = "LBLNOVE_OBSERVACIONESFILTER" ;
      edtavNove_observaciones_Internalname = "vNOVE_OBSERVACIONES" ;
      divNove_observacionesfiltercontainer_Internalname = "NOVE_OBSERVACIONESFILTERCONTAINER" ;
      lblLblnove_respuestaprocfilter_Internalname = "LBLNOVE_RESPUESTAPROCFILTER" ;
      edtavNove_respuestaproc_Internalname = "vNOVE_RESPUESTAPROC" ;
      divNove_respuestaprocfiltercontainer_Internalname = "NOVE_RESPUESTAPROCFILTERCONTAINER" ;
      divFilterscontainer_Internalname = "FILTERSCONTAINER" ;
      edtNove_Identificador_Internalname = "NOVE_IDENTIFICADOR" ;
      edtNove_FechaRegistro_Internalname = "NOVE_FECHAREGISTRO" ;
      edtNove_UsuarioRegistro_Internalname = "NOVE_USUARIOREGISTRO" ;
      edtNove_TranCC_Internalname = "NOVE_TRANCC" ;
      edtNove_TransId_Internalname = "NOVE_TRANSID" ;
      edtNove_RegionId_Internalname = "NOVE_REGIONID" ;
      edtNove_RegionCodigo_Internalname = "NOVE_REGIONCODIGO" ;
      edtNove_RegionDescripcion_Internalname = "NOVE_REGIONDESCRIPCION" ;
      edtNove_CentroId_Internalname = "NOVE_CENTROID" ;
      edtNove_CentroCodigo_Internalname = "NOVE_CENTROCODIGO" ;
      edtNove_CentroDescripcion_Internalname = "NOVE_CENTRODESCRIPCION" ;
      edtNove_CodigoMovimiento_Internalname = "NOVE_CODIGOMOVIMIENTO" ;
      edtNove_MovimientoDescrip_Internalname = "NOVE_MOVIMIENTODESCRIP" ;
      edtNove_ModuloOrigen_Internalname = "NOVE_MODULOORIGEN" ;
      edtNove_AlmaOrigen_Internalname = "NOVE_ALMAORIGEN" ;
      edtNove_BodeOrigen_Internalname = "NOVE_BODEORIGEN" ;
      edtNove_CuentadanteIdOrigen_Internalname = "NOVE_CUENTADANTEIDORIGEN" ;
      edtNove_CuentadanteCedOrigen_Internalname = "NOVE_CUENTADANTECEDORIGEN" ;
      edtNove_CuentadanteNomOrigen_Internalname = "NOVE_CUENTADANTENOMORIGEN" ;
      edtNove_ModuloDestino_Internalname = "NOVE_MODULODESTINO" ;
      edtNove_AlmaDestino_Internalname = "NOVE_ALMADESTINO" ;
      edtNove_BodeDestino_Internalname = "NOVE_BODEDESTINO" ;
      edtNove_CuentadanteIdDestino_Internalname = "NOVE_CUENTADANTEIDDESTINO" ;
      edtNove_CuentadanteCedDestino_Internalname = "NOVE_CUENTADANTECEDDESTINO" ;
      edtNove_CuentadanteNomDestino_Internalname = "NOVE_CUENTADANTENOMDESTINO" ;
      edtTNov_Codigo_Internalname = "TNOV_CODIGO" ;
      edtTNov_Descripcion_Internalname = "TNOV_DESCRIPCION" ;
      cmbTNov_Tipo.setInternalname( "TNOV_TIPO" );
      edtTNov_Procedimiento_Internalname = "TNOV_PROCEDIMIENTO" ;
      edtNove_Observaciones_Internalname = "NOVE_OBSERVACIONES" ;
      cmbNove_Masivo.setInternalname( "NOVE_MASIVO" );
      edtNove_Soporte_Internalname = "NOVE_SOPORTE" ;
      edtNove_RutaSoporte_Internalname = "NOVE_RUTASOPORTE" ;
      cmbNove_Estado.setInternalname( "NOVE_ESTADO" );
      edtNove_RespuestaProc_Internalname = "NOVE_RESPUESTAPROC" ;
      edtTNov_Nombre_Campo_Internalname = "TNOV_NOMBRE_CAMPO" ;
      edtavDisplay_Internalname = "vDISPLAY" ;
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
      edtTNov_Nombre_Campo_Jsonclick = "" ;
      edtNove_RespuestaProc_Jsonclick = "" ;
      cmbNove_Estado.setJsonclick( "" );
      edtNove_RutaSoporte_Jsonclick = "" ;
      edtNove_Soporte_Jsonclick = "" ;
      edtNove_Soporte_Parameters = "" ;
      edtNove_Soporte_Contenttype = "" ;
      edtNove_Soporte_Filetype = "" ;
      cmbNove_Masivo.setJsonclick( "" );
      edtNove_Observaciones_Jsonclick = "" ;
      edtTNov_Procedimiento_Jsonclick = "" ;
      cmbTNov_Tipo.setJsonclick( "" );
      edtTNov_Descripcion_Jsonclick = "" ;
      edtTNov_Codigo_Jsonclick = "" ;
      edtNove_CuentadanteNomDestino_Jsonclick = "" ;
      edtNove_CuentadanteCedDestino_Jsonclick = "" ;
      edtNove_CuentadanteIdDestino_Jsonclick = "" ;
      edtNove_BodeDestino_Jsonclick = "" ;
      edtNove_AlmaDestino_Jsonclick = "" ;
      edtNove_ModuloDestino_Jsonclick = "" ;
      edtNove_CuentadanteNomOrigen_Jsonclick = "" ;
      edtNove_CuentadanteCedOrigen_Jsonclick = "" ;
      edtNove_CuentadanteIdOrigen_Jsonclick = "" ;
      edtNove_BodeOrigen_Jsonclick = "" ;
      edtNove_AlmaOrigen_Jsonclick = "" ;
      edtNove_ModuloOrigen_Jsonclick = "" ;
      edtNove_MovimientoDescrip_Jsonclick = "" ;
      edtNove_CodigoMovimiento_Jsonclick = "" ;
      edtNove_CentroDescripcion_Jsonclick = "" ;
      edtNove_CentroCodigo_Jsonclick = "" ;
      edtNove_CentroId_Jsonclick = "" ;
      edtNove_RegionDescripcion_Jsonclick = "" ;
      edtNove_RegionCodigo_Jsonclick = "" ;
      edtNove_RegionId_Jsonclick = "" ;
      edtNove_TransId_Jsonclick = "" ;
      edtNove_TranCC_Jsonclick = "" ;
      edtNove_UsuarioRegistro_Jsonclick = "" ;
      edtNove_FechaRegistro_Jsonclick = "" ;
      edtNove_Identificador_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDisplay_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divGridcell_Class = "col-xs-12 col-sm-9 col-md-10 WWGridCell" ;
      edtavNove_respuestaproc_Enabled = 1 ;
      edtavNove_respuestaproc_Visible = 1 ;
      lblLblnove_respuestaprocfilter_Caption = "Respuesta Procedimiento" ;
      edtavNove_observaciones_Enabled = 1 ;
      edtavNove_observaciones_Visible = 1 ;
      lblLblnove_observacionesfilter_Caption = "Observaciones" ;
      edtavNove_trancc_Jsonclick = "" ;
      edtavNove_trancc_Enabled = 1 ;
      edtavNove_trancc_Visible = 1 ;
      lblLblnove_tranccfilter_Caption = "Nove_Tran CC" ;
      edtavNove_fecharegistro_Jsonclick = "" ;
      edtavNove_fecharegistro_Enabled = 1 ;
      lblLblnove_fecharegistrofilter_Caption = "Fecha Novedad" ;
      cmbavNove_masivo.setJsonclick( "" );
      cmbavNove_masivo.setEnabled( 1 );
      cmbavNove_masivo.setVisible( 1 );
      lblLblnove_masivofilter_Caption = "Masivo" ;
      cmbavTnov_tipo.setJsonclick( "" );
      cmbavTnov_tipo.setEnabled( 1 );
      cmbavTnov_tipo.setVisible( 1 );
      lblLbltnov_tipofilter_Caption = "Tipo de Novedad" ;
      edtavNove_identificador_Jsonclick = "" ;
      edtavNove_identificador_Enabled = 1 ;
      edtavNove_identificador_Visible = 1 ;
      lblLblnove_identificadorfilter_Caption = "Identificador Novedad" ;
      edtavTnov_descripcion_Enabled = 1 ;
      bttBtntoggle_Class = "HideFiltersButton" ;
      bttBtntoggle_Caption = "Ocultar filtros" ;
      divNove_respuestaprocfiltercontainer_Class = "AdvancedContainerItem" ;
      divNove_masivofiltercontainer_Class = "AdvancedContainerItem" ;
      divNove_observacionesfiltercontainer_Class = "AdvancedContainerItem" ;
      divNove_tranccfiltercontainer_Class = "AdvancedContainerItem" ;
      divNove_fecharegistrofiltercontainer_Class = "AdvancedContainerItem" ;
      divTnov_tipofiltercontainer_Class = "AdvancedContainerItem" ;
      divNove_identificadorfiltercontainer_Class = "AdvancedContainerItem" ;
      divFilterscontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Novedad" );
      subGrid_Rows = 0 ;
      edtavDisplay_Tooltiptext = "Visualizar" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Nove_Identificador',fld:'vNOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'cmbavTnov_tipo'},{av:'AV16TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV19Nove_FechaRegistro',fld:'vNOVE_FECHAREGISTRO',pic:'',nv:''},{av:'AV20Nove_TranCC',fld:'vNOVE_TRANCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Nove_Observaciones',fld:'vNOVE_OBSERVACIONES',pic:'',nv:''},{av:'cmbavNove_masivo'},{av:'AV22Nove_Masivo',fld:'vNOVE_MASIVO',pic:'',nv:''},{av:'AV23Nove_RespuestaProc',fld:'vNOVE_RESPUESTAPROC',pic:'',nv:''},{av:'AV26Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14TNov_Descripcion',fld:'vTNOV_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLblnove_identificadorfilter_Caption',ctrl:'LBLNOVE_IDENTIFICADORFILTER',prop:'Caption'},{av:'lblLbltnov_tipofilter_Caption',ctrl:'LBLTNOV_TIPOFILTER',prop:'Caption'},{av:'lblLblnove_fecharegistrofilter_Caption',ctrl:'LBLNOVE_FECHAREGISTROFILTER',prop:'Caption'},{av:'lblLblnove_tranccfilter_Caption',ctrl:'LBLNOVE_TRANCCFILTER',prop:'Caption'},{av:'lblLblnove_observacionesfilter_Caption',ctrl:'LBLNOVE_OBSERVACIONESFILTER',prop:'Caption'},{av:'lblLblnove_masivofilter_Caption',ctrl:'LBLNOVE_MASIVOFILTER',prop:'Caption'},{av:'lblLblnove_respuestaprocfilter_Caption',ctrl:'LBLNOVE_RESPUESTAPROCFILTER',prop:'Caption'}]}");
      setEventMetadata("'TOGGLE'","{handler:'e11281',iparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'}],oparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Caption'},{av:'divGridcell_Class',ctrl:'GRIDCELL',prop:'Class'}]}");
      setEventMetadata("LBLNOVE_IDENTIFICADORFILTER.CLICK","{handler:'e13281',iparms:[{av:'divNove_identificadorfiltercontainer_Class',ctrl:'NOVE_IDENTIFICADORFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divNove_identificadorfiltercontainer_Class',ctrl:'NOVE_IDENTIFICADORFILTERCONTAINER',prop:'Class'},{av:'edtavNove_identificador_Visible',ctrl:'vNOVE_IDENTIFICADOR',prop:'Visible'}]}");
      setEventMetadata("LBLTNOV_TIPOFILTER.CLICK","{handler:'e14281',iparms:[{av:'divTnov_tipofiltercontainer_Class',ctrl:'TNOV_TIPOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTnov_tipofiltercontainer_Class',ctrl:'TNOV_TIPOFILTERCONTAINER',prop:'Class'},{av:'cmbavTnov_tipo'}]}");
      setEventMetadata("LBLNOVE_FECHAREGISTROFILTER.CLICK","{handler:'e16281',iparms:[{av:'divNove_fecharegistrofiltercontainer_Class',ctrl:'NOVE_FECHAREGISTROFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divNove_fecharegistrofiltercontainer_Class',ctrl:'NOVE_FECHAREGISTROFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLNOVE_TRANCCFILTER.CLICK","{handler:'e17281',iparms:[{av:'divNove_tranccfiltercontainer_Class',ctrl:'NOVE_TRANCCFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divNove_tranccfiltercontainer_Class',ctrl:'NOVE_TRANCCFILTERCONTAINER',prop:'Class'},{av:'edtavNove_trancc_Visible',ctrl:'vNOVE_TRANCC',prop:'Visible'}]}");
      setEventMetadata("LBLNOVE_OBSERVACIONESFILTER.CLICK","{handler:'e18281',iparms:[{av:'divNove_observacionesfiltercontainer_Class',ctrl:'NOVE_OBSERVACIONESFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divNove_observacionesfiltercontainer_Class',ctrl:'NOVE_OBSERVACIONESFILTERCONTAINER',prop:'Class'},{av:'edtavNove_observaciones_Visible',ctrl:'vNOVE_OBSERVACIONES',prop:'Visible'}]}");
      setEventMetadata("LBLNOVE_MASIVOFILTER.CLICK","{handler:'e15281',iparms:[{av:'divNove_masivofiltercontainer_Class',ctrl:'NOVE_MASIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divNove_masivofiltercontainer_Class',ctrl:'NOVE_MASIVOFILTERCONTAINER',prop:'Class'},{av:'cmbavNove_masivo'}]}");
      setEventMetadata("LBLNOVE_RESPUESTAPROCFILTER.CLICK","{handler:'e19281',iparms:[{av:'divNove_respuestaprocfiltercontainer_Class',ctrl:'NOVE_RESPUESTAPROCFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divNove_respuestaprocfiltercontainer_Class',ctrl:'NOVE_RESPUESTAPROCFILTERCONTAINER',prop:'Class'},{av:'edtavNove_respuestaproc_Visible',ctrl:'vNOVE_RESPUESTAPROC',prop:'Visible'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e22282',iparms:[{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavDisplay_Link',ctrl:'vDISPLAY',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e12281',iparms:[],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Nove_Identificador',fld:'vNOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'cmbavTnov_tipo'},{av:'AV16TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV19Nove_FechaRegistro',fld:'vNOVE_FECHAREGISTRO',pic:'',nv:''},{av:'AV20Nove_TranCC',fld:'vNOVE_TRANCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Nove_Observaciones',fld:'vNOVE_OBSERVACIONES',pic:'',nv:''},{av:'cmbavNove_masivo'},{av:'AV22Nove_Masivo',fld:'vNOVE_MASIVO',pic:'',nv:''},{av:'AV23Nove_RespuestaProc',fld:'vNOVE_RESPUESTAPROC',pic:'',nv:''},{av:'AV26Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14TNov_Descripcion',fld:'vTNOV_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLblnove_identificadorfilter_Caption',ctrl:'LBLNOVE_IDENTIFICADORFILTER',prop:'Caption'},{av:'lblLbltnov_tipofilter_Caption',ctrl:'LBLTNOV_TIPOFILTER',prop:'Caption'},{av:'lblLblnove_fecharegistrofilter_Caption',ctrl:'LBLNOVE_FECHAREGISTROFILTER',prop:'Caption'},{av:'lblLblnove_tranccfilter_Caption',ctrl:'LBLNOVE_TRANCCFILTER',prop:'Caption'},{av:'lblLblnove_observacionesfilter_Caption',ctrl:'LBLNOVE_OBSERVACIONESFILTER',prop:'Caption'},{av:'lblLblnove_masivofilter_Caption',ctrl:'LBLNOVE_MASIVOFILTER',prop:'Caption'},{av:'lblLblnove_respuestaprocfilter_Caption',ctrl:'LBLNOVE_RESPUESTAPROCFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Nove_Identificador',fld:'vNOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'cmbavTnov_tipo'},{av:'AV16TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV19Nove_FechaRegistro',fld:'vNOVE_FECHAREGISTRO',pic:'',nv:''},{av:'AV20Nove_TranCC',fld:'vNOVE_TRANCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Nove_Observaciones',fld:'vNOVE_OBSERVACIONES',pic:'',nv:''},{av:'cmbavNove_masivo'},{av:'AV22Nove_Masivo',fld:'vNOVE_MASIVO',pic:'',nv:''},{av:'AV23Nove_RespuestaProc',fld:'vNOVE_RESPUESTAPROC',pic:'',nv:''},{av:'AV26Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14TNov_Descripcion',fld:'vTNOV_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLblnove_identificadorfilter_Caption',ctrl:'LBLNOVE_IDENTIFICADORFILTER',prop:'Caption'},{av:'lblLbltnov_tipofilter_Caption',ctrl:'LBLTNOV_TIPOFILTER',prop:'Caption'},{av:'lblLblnove_fecharegistrofilter_Caption',ctrl:'LBLNOVE_FECHAREGISTROFILTER',prop:'Caption'},{av:'lblLblnove_tranccfilter_Caption',ctrl:'LBLNOVE_TRANCCFILTER',prop:'Caption'},{av:'lblLblnove_observacionesfilter_Caption',ctrl:'LBLNOVE_OBSERVACIONESFILTER',prop:'Caption'},{av:'lblLblnove_masivofilter_Caption',ctrl:'LBLNOVE_MASIVOFILTER',prop:'Caption'},{av:'lblLblnove_respuestaprocfilter_Caption',ctrl:'LBLNOVE_RESPUESTAPROCFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Nove_Identificador',fld:'vNOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'cmbavTnov_tipo'},{av:'AV16TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV19Nove_FechaRegistro',fld:'vNOVE_FECHAREGISTRO',pic:'',nv:''},{av:'AV20Nove_TranCC',fld:'vNOVE_TRANCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Nove_Observaciones',fld:'vNOVE_OBSERVACIONES',pic:'',nv:''},{av:'cmbavNove_masivo'},{av:'AV22Nove_Masivo',fld:'vNOVE_MASIVO',pic:'',nv:''},{av:'AV23Nove_RespuestaProc',fld:'vNOVE_RESPUESTAPROC',pic:'',nv:''},{av:'AV26Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14TNov_Descripcion',fld:'vTNOV_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLblnove_identificadorfilter_Caption',ctrl:'LBLNOVE_IDENTIFICADORFILTER',prop:'Caption'},{av:'lblLbltnov_tipofilter_Caption',ctrl:'LBLTNOV_TIPOFILTER',prop:'Caption'},{av:'lblLblnove_fecharegistrofilter_Caption',ctrl:'LBLNOVE_FECHAREGISTROFILTER',prop:'Caption'},{av:'lblLblnove_tranccfilter_Caption',ctrl:'LBLNOVE_TRANCCFILTER',prop:'Caption'},{av:'lblLblnove_observacionesfilter_Caption',ctrl:'LBLNOVE_OBSERVACIONESFILTER',prop:'Caption'},{av:'lblLblnove_masivofilter_Caption',ctrl:'LBLNOVE_MASIVOFILTER',prop:'Caption'},{av:'lblLblnove_respuestaprocfilter_Caption',ctrl:'LBLNOVE_RESPUESTAPROCFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV17Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A106Nove_Identificador',fld:'NOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Nove_Identificador',fld:'vNOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV18ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'cmbavTnov_tipo'},{av:'AV16TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV19Nove_FechaRegistro',fld:'vNOVE_FECHAREGISTRO',pic:'',nv:''},{av:'AV20Nove_TranCC',fld:'vNOVE_TRANCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Nove_Observaciones',fld:'vNOVE_OBSERVACIONES',pic:'',nv:''},{av:'cmbavNove_masivo'},{av:'AV22Nove_Masivo',fld:'vNOVE_MASIVO',pic:'',nv:''},{av:'AV23Nove_RespuestaProc',fld:'vNOVE_RESPUESTAPROC',pic:'',nv:''},{av:'AV26Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14TNov_Descripcion',fld:'vTNOV_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLblnove_identificadorfilter_Caption',ctrl:'LBLNOVE_IDENTIFICADORFILTER',prop:'Caption'},{av:'lblLbltnov_tipofilter_Caption',ctrl:'LBLTNOV_TIPOFILTER',prop:'Caption'},{av:'lblLblnove_fecharegistrofilter_Caption',ctrl:'LBLNOVE_FECHAREGISTROFILTER',prop:'Caption'},{av:'lblLblnove_tranccfilter_Caption',ctrl:'LBLNOVE_TRANCCFILTER',prop:'Caption'},{av:'lblLblnove_observacionesfilter_Caption',ctrl:'LBLNOVE_OBSERVACIONESFILTER',prop:'Caption'},{av:'lblLblnove_masivofilter_Caption',ctrl:'LBLNOVE_MASIVOFILTER',prop:'Caption'},{av:'lblLblnove_respuestaprocfilter_Caption',ctrl:'LBLNOVE_RESPUESTAPROCFILTER',prop:'Caption'}]}");
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
      AV17Display = "" ;
      AV14TNov_Descripcion = "" ;
      AV16TNov_Tipo = "" ;
      AV22Nove_Masivo = "" ;
      AV19Nove_FechaRegistro = GXutil.nullDate() ;
      AV21Nove_Observaciones = "" ;
      AV23Nove_RespuestaProc = "" ;
      AV18ADVANCED_LABEL_TEMPLATE = "" ;
      AV26Pgmname = "" ;
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
      lblLblnove_identificadorfilter_Jsonclick = "" ;
      lblLbltnov_tipofilter_Jsonclick = "" ;
      lblLblnove_masivofilter_Jsonclick = "" ;
      lblLblnove_fecharegistrofilter_Jsonclick = "" ;
      lblLblnove_tranccfilter_Jsonclick = "" ;
      lblLblnove_observacionesfilter_Jsonclick = "" ;
      lblLblnove_respuestaprocfilter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A780Nove_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A784Nove_RegionDescripcion = "" ;
      A786Nove_CentroCodigo = "" ;
      A787Nove_CentroDescripcion = "" ;
      A788Nove_CodigoMovimiento = "" ;
      A789Nove_MovimientoDescrip = "" ;
      A790Nove_ModuloOrigen = "" ;
      A791Nove_AlmaOrigen = "" ;
      A792Nove_BodeOrigen = "" ;
      A795Nove_CuentadanteNomOrigen = "" ;
      A796Nove_ModuloDestino = "" ;
      A797Nove_AlmaDestino = "" ;
      A798Nove_BodeDestino = "" ;
      A801Nove_CuentadanteNomDestino = "" ;
      A769TNov_Descripcion = "" ;
      A770TNov_Tipo = "" ;
      A772TNov_Procedimiento = "" ;
      A802Nove_Observaciones = "" ;
      A803Nove_Masivo = "" ;
      A804Nove_Soporte = "" ;
      A805Nove_RutaSoporte = "" ;
      A765Nove_Estado = "" ;
      A815Nove_RespuestaProc = "" ;
      A774TNov_Nombre_Campo = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV27Display_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV16TNov_Tipo = "" ;
      lV22Nove_Masivo = "" ;
      H00282_A802Nove_Observaciones = new String[] {""} ;
      H00282_n802Nove_Observaciones = new boolean[] {false} ;
      H00282_A774TNov_Nombre_Campo = new String[] {""} ;
      H00282_n774TNov_Nombre_Campo = new boolean[] {false} ;
      H00282_A815Nove_RespuestaProc = new String[] {""} ;
      H00282_n815Nove_RespuestaProc = new boolean[] {false} ;
      H00282_A765Nove_Estado = new String[] {""} ;
      H00282_n765Nove_Estado = new boolean[] {false} ;
      H00282_A805Nove_RutaSoporte = new String[] {""} ;
      H00282_n805Nove_RutaSoporte = new boolean[] {false} ;
      H00282_A804Nove_Soporte = new String[] {""} ;
      H00282_n804Nove_Soporte = new boolean[] {false} ;
      H00282_A803Nove_Masivo = new String[] {""} ;
      H00282_n803Nove_Masivo = new boolean[] {false} ;
      H00282_A772TNov_Procedimiento = new String[] {""} ;
      H00282_n772TNov_Procedimiento = new boolean[] {false} ;
      H00282_A770TNov_Tipo = new String[] {""} ;
      H00282_n770TNov_Tipo = new boolean[] {false} ;
      H00282_A769TNov_Descripcion = new String[] {""} ;
      H00282_n769TNov_Descripcion = new boolean[] {false} ;
      H00282_A104TNov_Codigo = new int[1] ;
      H00282_n104TNov_Codigo = new boolean[] {false} ;
      H00282_A801Nove_CuentadanteNomDestino = new String[] {""} ;
      H00282_n801Nove_CuentadanteNomDestino = new boolean[] {false} ;
      H00282_A800Nove_CuentadanteCedDestino = new long[1] ;
      H00282_n800Nove_CuentadanteCedDestino = new boolean[] {false} ;
      H00282_A799Nove_CuentadanteIdDestino = new long[1] ;
      H00282_n799Nove_CuentadanteIdDestino = new boolean[] {false} ;
      H00282_A798Nove_BodeDestino = new String[] {""} ;
      H00282_n798Nove_BodeDestino = new boolean[] {false} ;
      H00282_A797Nove_AlmaDestino = new String[] {""} ;
      H00282_n797Nove_AlmaDestino = new boolean[] {false} ;
      H00282_A796Nove_ModuloDestino = new String[] {""} ;
      H00282_n796Nove_ModuloDestino = new boolean[] {false} ;
      H00282_A795Nove_CuentadanteNomOrigen = new String[] {""} ;
      H00282_n795Nove_CuentadanteNomOrigen = new boolean[] {false} ;
      H00282_A794Nove_CuentadanteCedOrigen = new long[1] ;
      H00282_n794Nove_CuentadanteCedOrigen = new boolean[] {false} ;
      H00282_A793Nove_CuentadanteIdOrigen = new long[1] ;
      H00282_n793Nove_CuentadanteIdOrigen = new boolean[] {false} ;
      H00282_A792Nove_BodeOrigen = new String[] {""} ;
      H00282_n792Nove_BodeOrigen = new boolean[] {false} ;
      H00282_A791Nove_AlmaOrigen = new String[] {""} ;
      H00282_n791Nove_AlmaOrigen = new boolean[] {false} ;
      H00282_A790Nove_ModuloOrigen = new String[] {""} ;
      H00282_n790Nove_ModuloOrigen = new boolean[] {false} ;
      H00282_A789Nove_MovimientoDescrip = new String[] {""} ;
      H00282_n789Nove_MovimientoDescrip = new boolean[] {false} ;
      H00282_A788Nove_CodigoMovimiento = new String[] {""} ;
      H00282_n788Nove_CodigoMovimiento = new boolean[] {false} ;
      H00282_A787Nove_CentroDescripcion = new String[] {""} ;
      H00282_n787Nove_CentroDescripcion = new boolean[] {false} ;
      H00282_A786Nove_CentroCodigo = new String[] {""} ;
      H00282_n786Nove_CentroCodigo = new boolean[] {false} ;
      H00282_A785Nove_CentroId = new long[1] ;
      H00282_n785Nove_CentroId = new boolean[] {false} ;
      H00282_A784Nove_RegionDescripcion = new String[] {""} ;
      H00282_n784Nove_RegionDescripcion = new boolean[] {false} ;
      H00282_A783Nove_RegionCodigo = new short[1] ;
      H00282_n783Nove_RegionCodigo = new boolean[] {false} ;
      H00282_A782Nove_RegionId = new long[1] ;
      H00282_n782Nove_RegionId = new boolean[] {false} ;
      H00282_A107Nove_TransId = new long[1] ;
      H00282_n107Nove_TransId = new boolean[] {false} ;
      H00282_A814Nove_TranCC = new long[1] ;
      H00282_n814Nove_TranCC = new boolean[] {false} ;
      H00282_A781Nove_UsuarioRegistro = new long[1] ;
      H00282_n781Nove_UsuarioRegistro = new boolean[] {false} ;
      H00282_A780Nove_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H00282_n780Nove_FechaRegistro = new boolean[] {false} ;
      H00282_A106Nove_Identificador = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV8HTTPRequest = httpContext.getHttpRequest();
      AV9GridState = new com.orions2.SdtGridState(remoteHandle, context);
      AV7Session = httpContext.getWebSession();
      AV10GridStateFilterValue = new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV12TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_novedad__default(),
         new Object[] {
             new Object[] {
            H00282_A802Nove_Observaciones, H00282_n802Nove_Observaciones, H00282_A774TNov_Nombre_Campo, H00282_n774TNov_Nombre_Campo, H00282_A815Nove_RespuestaProc, H00282_n815Nove_RespuestaProc, H00282_A765Nove_Estado, H00282_n765Nove_Estado, H00282_A805Nove_RutaSoporte, H00282_n805Nove_RutaSoporte,
            H00282_A804Nove_Soporte, H00282_n804Nove_Soporte, H00282_A803Nove_Masivo, H00282_n803Nove_Masivo, H00282_A772TNov_Procedimiento, H00282_n772TNov_Procedimiento, H00282_A770TNov_Tipo, H00282_n770TNov_Tipo, H00282_A769TNov_Descripcion, H00282_n769TNov_Descripcion,
            H00282_A104TNov_Codigo, H00282_n104TNov_Codigo, H00282_A801Nove_CuentadanteNomDestino, H00282_n801Nove_CuentadanteNomDestino, H00282_A800Nove_CuentadanteCedDestino, H00282_n800Nove_CuentadanteCedDestino, H00282_A799Nove_CuentadanteIdDestino, H00282_n799Nove_CuentadanteIdDestino, H00282_A798Nove_BodeDestino, H00282_n798Nove_BodeDestino,
            H00282_A797Nove_AlmaDestino, H00282_n797Nove_AlmaDestino, H00282_A796Nove_ModuloDestino, H00282_n796Nove_ModuloDestino, H00282_A795Nove_CuentadanteNomOrigen, H00282_n795Nove_CuentadanteNomOrigen, H00282_A794Nove_CuentadanteCedOrigen, H00282_n794Nove_CuentadanteCedOrigen, H00282_A793Nove_CuentadanteIdOrigen, H00282_n793Nove_CuentadanteIdOrigen,
            H00282_A792Nove_BodeOrigen, H00282_n792Nove_BodeOrigen, H00282_A791Nove_AlmaOrigen, H00282_n791Nove_AlmaOrigen, H00282_A790Nove_ModuloOrigen, H00282_n790Nove_ModuloOrigen, H00282_A789Nove_MovimientoDescrip, H00282_n789Nove_MovimientoDescrip, H00282_A788Nove_CodigoMovimiento, H00282_n788Nove_CodigoMovimiento,
            H00282_A787Nove_CentroDescripcion, H00282_n787Nove_CentroDescripcion, H00282_A786Nove_CentroCodigo, H00282_n786Nove_CentroCodigo, H00282_A785Nove_CentroId, H00282_n785Nove_CentroId, H00282_A784Nove_RegionDescripcion, H00282_n784Nove_RegionDescripcion, H00282_A783Nove_RegionCodigo, H00282_n783Nove_RegionCodigo,
            H00282_A782Nove_RegionId, H00282_n782Nove_RegionId, H00282_A107Nove_TransId, H00282_n107Nove_TransId, H00282_A814Nove_TranCC, H00282_n814Nove_TranCC, H00282_A781Nove_UsuarioRegistro, H00282_n781Nove_UsuarioRegistro, H00282_A780Nove_FechaRegistro, H00282_n780Nove_FechaRegistro,
            H00282_A106Nove_Identificador
            }
         }
      );
      AV26Pgmname = "WWALM_NOVEDAD" ;
      /* GeneXus formulas. */
      AV26Pgmname = "WWALM_NOVEDAD" ;
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
   private short nRC_GXsfl_99 ;
   private short nGXsfl_99_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A783Nove_RegionCodigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int edtavTnov_descripcion_Enabled ;
   private int edtavNove_identificador_Enabled ;
   private int edtavNove_identificador_Visible ;
   private int edtavNove_fecharegistro_Enabled ;
   private int edtavNove_trancc_Enabled ;
   private int edtavNove_trancc_Visible ;
   private int edtavNove_observaciones_Visible ;
   private int edtavNove_observaciones_Enabled ;
   private int edtavNove_respuestaproc_Visible ;
   private int edtavNove_respuestaproc_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int A104TNov_Codigo ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int AV11GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long AV15Nove_Identificador ;
   private long AV20Nove_TranCC ;
   private long A106Nove_Identificador ;
   private long GRID_nFirstRecordOnPage ;
   private long A781Nove_UsuarioRegistro ;
   private long A814Nove_TranCC ;
   private long A107Nove_TransId ;
   private long A782Nove_RegionId ;
   private long A785Nove_CentroId ;
   private long A793Nove_CuentadanteIdOrigen ;
   private long A794Nove_CuentadanteCedOrigen ;
   private long A799Nove_CuentadanteIdDestino ;
   private long A800Nove_CuentadanteCedDestino ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String edtavDisplay_Tooltiptext ;
   private String divFilterscontainer_Class ;
   private String divNove_identificadorfiltercontainer_Class ;
   private String divTnov_tipofiltercontainer_Class ;
   private String divNove_fecharegistrofiltercontainer_Class ;
   private String divNove_tranccfiltercontainer_Class ;
   private String divNove_observacionesfiltercontainer_Class ;
   private String divNove_masivofiltercontainer_Class ;
   private String divNove_respuestaprocfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_99_idx="0001" ;
   private String edtavDisplay_Internalname ;
   private String AV18ADVANCED_LABEL_TEMPLATE ;
   private String AV26Pgmname ;
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
   private String divNove_identificadorfiltercontainer_Internalname ;
   private String lblLblnove_identificadorfilter_Internalname ;
   private String lblLblnove_identificadorfilter_Caption ;
   private String lblLblnove_identificadorfilter_Jsonclick ;
   private String edtavNove_identificador_Internalname ;
   private String edtavNove_identificador_Jsonclick ;
   private String divTnov_tipofiltercontainer_Internalname ;
   private String lblLbltnov_tipofilter_Internalname ;
   private String lblLbltnov_tipofilter_Caption ;
   private String lblLbltnov_tipofilter_Jsonclick ;
   private String divNove_masivofiltercontainer_Internalname ;
   private String lblLblnove_masivofilter_Internalname ;
   private String lblLblnove_masivofilter_Caption ;
   private String lblLblnove_masivofilter_Jsonclick ;
   private String divNove_fecharegistrofiltercontainer_Internalname ;
   private String lblLblnove_fecharegistrofilter_Internalname ;
   private String lblLblnove_fecharegistrofilter_Caption ;
   private String lblLblnove_fecharegistrofilter_Jsonclick ;
   private String edtavNove_fecharegistro_Internalname ;
   private String edtavNove_fecharegistro_Jsonclick ;
   private String divNove_tranccfiltercontainer_Internalname ;
   private String lblLblnove_tranccfilter_Internalname ;
   private String lblLblnove_tranccfilter_Caption ;
   private String lblLblnove_tranccfilter_Jsonclick ;
   private String edtavNove_trancc_Internalname ;
   private String edtavNove_trancc_Jsonclick ;
   private String divNove_observacionesfiltercontainer_Internalname ;
   private String lblLblnove_observacionesfilter_Internalname ;
   private String lblLblnove_observacionesfilter_Caption ;
   private String lblLblnove_observacionesfilter_Jsonclick ;
   private String edtavNove_observaciones_Internalname ;
   private String divNove_respuestaprocfiltercontainer_Internalname ;
   private String lblLblnove_respuestaprocfilter_Internalname ;
   private String lblLblnove_respuestaprocfilter_Caption ;
   private String lblLblnove_respuestaprocfilter_Jsonclick ;
   private String edtavNove_respuestaproc_Internalname ;
   private String divGridcell_Internalname ;
   private String divGridcell_Class ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String A765Nove_Estado ;
   private String edtavDisplay_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtNove_Identificador_Internalname ;
   private String edtNove_FechaRegistro_Internalname ;
   private String edtNove_UsuarioRegistro_Internalname ;
   private String edtNove_TranCC_Internalname ;
   private String edtNove_TransId_Internalname ;
   private String edtNove_RegionId_Internalname ;
   private String edtNove_RegionCodigo_Internalname ;
   private String edtNove_RegionDescripcion_Internalname ;
   private String edtNove_CentroId_Internalname ;
   private String edtNove_CentroCodigo_Internalname ;
   private String edtNove_CentroDescripcion_Internalname ;
   private String edtNove_CodigoMovimiento_Internalname ;
   private String edtNove_MovimientoDescrip_Internalname ;
   private String edtNove_ModuloOrigen_Internalname ;
   private String edtNove_AlmaOrigen_Internalname ;
   private String edtNove_BodeOrigen_Internalname ;
   private String edtNove_CuentadanteIdOrigen_Internalname ;
   private String edtNove_CuentadanteCedOrigen_Internalname ;
   private String edtNove_CuentadanteNomOrigen_Internalname ;
   private String edtNove_ModuloDestino_Internalname ;
   private String edtNove_AlmaDestino_Internalname ;
   private String edtNove_BodeDestino_Internalname ;
   private String edtNove_CuentadanteIdDestino_Internalname ;
   private String edtNove_CuentadanteCedDestino_Internalname ;
   private String edtNove_CuentadanteNomDestino_Internalname ;
   private String edtTNov_Codigo_Internalname ;
   private String edtTNov_Descripcion_Internalname ;
   private String edtTNov_Procedimiento_Internalname ;
   private String edtNove_Observaciones_Internalname ;
   private String edtNove_Soporte_Internalname ;
   private String edtNove_RutaSoporte_Internalname ;
   private String edtNove_RespuestaProc_Internalname ;
   private String edtTNov_Nombre_Campo_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String sGXsfl_99_fel_idx="0001" ;
   private String ROClassString ;
   private String edtNove_Identificador_Jsonclick ;
   private String edtNove_FechaRegistro_Jsonclick ;
   private String edtNove_UsuarioRegistro_Jsonclick ;
   private String edtNove_TranCC_Jsonclick ;
   private String edtNove_TransId_Jsonclick ;
   private String edtNove_RegionId_Jsonclick ;
   private String edtNove_RegionCodigo_Jsonclick ;
   private String edtNove_RegionDescripcion_Jsonclick ;
   private String edtNove_CentroId_Jsonclick ;
   private String edtNove_CentroCodigo_Jsonclick ;
   private String edtNove_CentroDescripcion_Jsonclick ;
   private String edtNove_CodigoMovimiento_Jsonclick ;
   private String edtNove_MovimientoDescrip_Jsonclick ;
   private String edtNove_ModuloOrigen_Jsonclick ;
   private String edtNove_AlmaOrigen_Jsonclick ;
   private String edtNove_BodeOrigen_Jsonclick ;
   private String edtNove_CuentadanteIdOrigen_Jsonclick ;
   private String edtNove_CuentadanteCedOrigen_Jsonclick ;
   private String edtNove_CuentadanteNomOrigen_Jsonclick ;
   private String edtNove_ModuloDestino_Jsonclick ;
   private String edtNove_AlmaDestino_Jsonclick ;
   private String edtNove_BodeDestino_Jsonclick ;
   private String edtNove_CuentadanteIdDestino_Jsonclick ;
   private String edtNove_CuentadanteCedDestino_Jsonclick ;
   private String edtNove_CuentadanteNomDestino_Jsonclick ;
   private String edtTNov_Codigo_Jsonclick ;
   private String edtTNov_Descripcion_Jsonclick ;
   private String edtTNov_Procedimiento_Jsonclick ;
   private String edtNove_Observaciones_Jsonclick ;
   private String edtNove_Soporte_Filetype ;
   private String edtNove_Soporte_Contenttype ;
   private String edtNove_Soporte_Parameters ;
   private String edtNove_Soporte_Jsonclick ;
   private String edtNove_RutaSoporte_Jsonclick ;
   private String edtNove_RespuestaProc_Jsonclick ;
   private String edtTNov_Nombre_Campo_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A780Nove_FechaRegistro ;
   private java.util.Date AV19Nove_FechaRegistro ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_99_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n780Nove_FechaRegistro ;
   private boolean n781Nove_UsuarioRegistro ;
   private boolean n814Nove_TranCC ;
   private boolean n107Nove_TransId ;
   private boolean n782Nove_RegionId ;
   private boolean n783Nove_RegionCodigo ;
   private boolean n784Nove_RegionDescripcion ;
   private boolean n785Nove_CentroId ;
   private boolean n786Nove_CentroCodigo ;
   private boolean n787Nove_CentroDescripcion ;
   private boolean n788Nove_CodigoMovimiento ;
   private boolean n789Nove_MovimientoDescrip ;
   private boolean n790Nove_ModuloOrigen ;
   private boolean n791Nove_AlmaOrigen ;
   private boolean n792Nove_BodeOrigen ;
   private boolean n793Nove_CuentadanteIdOrigen ;
   private boolean n794Nove_CuentadanteCedOrigen ;
   private boolean n795Nove_CuentadanteNomOrigen ;
   private boolean n796Nove_ModuloDestino ;
   private boolean n797Nove_AlmaDestino ;
   private boolean n798Nove_BodeDestino ;
   private boolean n799Nove_CuentadanteIdDestino ;
   private boolean n800Nove_CuentadanteCedDestino ;
   private boolean n801Nove_CuentadanteNomDestino ;
   private boolean n104TNov_Codigo ;
   private boolean n769TNov_Descripcion ;
   private boolean n770TNov_Tipo ;
   private boolean n772TNov_Procedimiento ;
   private boolean n802Nove_Observaciones ;
   private boolean n803Nove_Masivo ;
   private boolean n804Nove_Soporte ;
   private boolean n805Nove_RutaSoporte ;
   private boolean n765Nove_Estado ;
   private boolean n815Nove_RespuestaProc ;
   private boolean n774TNov_Nombre_Campo ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV17Display_IsBlob ;
   private String AV21Nove_Observaciones ;
   private String A802Nove_Observaciones ;
   private String A804Nove_Soporte ;
   private String AV14TNov_Descripcion ;
   private String AV16TNov_Tipo ;
   private String AV22Nove_Masivo ;
   private String AV23Nove_RespuestaProc ;
   private String A784Nove_RegionDescripcion ;
   private String A786Nove_CentroCodigo ;
   private String A787Nove_CentroDescripcion ;
   private String A788Nove_CodigoMovimiento ;
   private String A789Nove_MovimientoDescrip ;
   private String A790Nove_ModuloOrigen ;
   private String A791Nove_AlmaOrigen ;
   private String A792Nove_BodeOrigen ;
   private String A795Nove_CuentadanteNomOrigen ;
   private String A796Nove_ModuloDestino ;
   private String A797Nove_AlmaDestino ;
   private String A798Nove_BodeDestino ;
   private String A801Nove_CuentadanteNomDestino ;
   private String A769TNov_Descripcion ;
   private String A770TNov_Tipo ;
   private String A772TNov_Procedimiento ;
   private String A803Nove_Masivo ;
   private String A805Nove_RutaSoporte ;
   private String A815Nove_RespuestaProc ;
   private String A774TNov_Nombre_Campo ;
   private String AV27Display_GXI ;
   private String lV16TNov_Tipo ;
   private String lV22Nove_Masivo ;
   private String AV17Display ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private HTMLChoice cmbavTnov_tipo ;
   private HTMLChoice cmbavNove_masivo ;
   private HTMLChoice cmbTNov_Tipo ;
   private HTMLChoice cmbNove_Masivo ;
   private HTMLChoice cmbNove_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H00282_A802Nove_Observaciones ;
   private boolean[] H00282_n802Nove_Observaciones ;
   private String[] H00282_A774TNov_Nombre_Campo ;
   private boolean[] H00282_n774TNov_Nombre_Campo ;
   private String[] H00282_A815Nove_RespuestaProc ;
   private boolean[] H00282_n815Nove_RespuestaProc ;
   private String[] H00282_A765Nove_Estado ;
   private boolean[] H00282_n765Nove_Estado ;
   private String[] H00282_A805Nove_RutaSoporte ;
   private boolean[] H00282_n805Nove_RutaSoporte ;
   private String[] H00282_A804Nove_Soporte ;
   private boolean[] H00282_n804Nove_Soporte ;
   private String[] H00282_A803Nove_Masivo ;
   private boolean[] H00282_n803Nove_Masivo ;
   private String[] H00282_A772TNov_Procedimiento ;
   private boolean[] H00282_n772TNov_Procedimiento ;
   private String[] H00282_A770TNov_Tipo ;
   private boolean[] H00282_n770TNov_Tipo ;
   private String[] H00282_A769TNov_Descripcion ;
   private boolean[] H00282_n769TNov_Descripcion ;
   private int[] H00282_A104TNov_Codigo ;
   private boolean[] H00282_n104TNov_Codigo ;
   private String[] H00282_A801Nove_CuentadanteNomDestino ;
   private boolean[] H00282_n801Nove_CuentadanteNomDestino ;
   private long[] H00282_A800Nove_CuentadanteCedDestino ;
   private boolean[] H00282_n800Nove_CuentadanteCedDestino ;
   private long[] H00282_A799Nove_CuentadanteIdDestino ;
   private boolean[] H00282_n799Nove_CuentadanteIdDestino ;
   private String[] H00282_A798Nove_BodeDestino ;
   private boolean[] H00282_n798Nove_BodeDestino ;
   private String[] H00282_A797Nove_AlmaDestino ;
   private boolean[] H00282_n797Nove_AlmaDestino ;
   private String[] H00282_A796Nove_ModuloDestino ;
   private boolean[] H00282_n796Nove_ModuloDestino ;
   private String[] H00282_A795Nove_CuentadanteNomOrigen ;
   private boolean[] H00282_n795Nove_CuentadanteNomOrigen ;
   private long[] H00282_A794Nove_CuentadanteCedOrigen ;
   private boolean[] H00282_n794Nove_CuentadanteCedOrigen ;
   private long[] H00282_A793Nove_CuentadanteIdOrigen ;
   private boolean[] H00282_n793Nove_CuentadanteIdOrigen ;
   private String[] H00282_A792Nove_BodeOrigen ;
   private boolean[] H00282_n792Nove_BodeOrigen ;
   private String[] H00282_A791Nove_AlmaOrigen ;
   private boolean[] H00282_n791Nove_AlmaOrigen ;
   private String[] H00282_A790Nove_ModuloOrigen ;
   private boolean[] H00282_n790Nove_ModuloOrigen ;
   private String[] H00282_A789Nove_MovimientoDescrip ;
   private boolean[] H00282_n789Nove_MovimientoDescrip ;
   private String[] H00282_A788Nove_CodigoMovimiento ;
   private boolean[] H00282_n788Nove_CodigoMovimiento ;
   private String[] H00282_A787Nove_CentroDescripcion ;
   private boolean[] H00282_n787Nove_CentroDescripcion ;
   private String[] H00282_A786Nove_CentroCodigo ;
   private boolean[] H00282_n786Nove_CentroCodigo ;
   private long[] H00282_A785Nove_CentroId ;
   private boolean[] H00282_n785Nove_CentroId ;
   private String[] H00282_A784Nove_RegionDescripcion ;
   private boolean[] H00282_n784Nove_RegionDescripcion ;
   private short[] H00282_A783Nove_RegionCodigo ;
   private boolean[] H00282_n783Nove_RegionCodigo ;
   private long[] H00282_A782Nove_RegionId ;
   private boolean[] H00282_n782Nove_RegionId ;
   private long[] H00282_A107Nove_TransId ;
   private boolean[] H00282_n107Nove_TransId ;
   private long[] H00282_A814Nove_TranCC ;
   private boolean[] H00282_n814Nove_TranCC ;
   private long[] H00282_A781Nove_UsuarioRegistro ;
   private boolean[] H00282_n781Nove_UsuarioRegistro ;
   private java.util.Date[] H00282_A780Nove_FechaRegistro ;
   private boolean[] H00282_n780Nove_FechaRegistro ;
   private long[] H00282_A106Nove_Identificador ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwalm_novedad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00282( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          long AV15Nove_Identificador ,
                                          String AV16TNov_Tipo ,
                                          long AV20Nove_TranCC ,
                                          String AV22Nove_Masivo ,
                                          long A106Nove_Identificador ,
                                          String A770TNov_Tipo ,
                                          long A814Nove_TranCC ,
                                          String A803Nove_Masivo ,
                                          String AV14TNov_Descripcion ,
                                          String A769TNov_Descripcion ,
                                          java.util.Date AV19Nove_FechaRegistro ,
                                          java.util.Date A780Nove_FechaRegistro ,
                                          String AV21Nove_Observaciones ,
                                          String A802Nove_Observaciones ,
                                          String AV23Nove_RespuestaProc ,
                                          String A815Nove_RespuestaProc ,
                                          String A765Nove_Estado )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [4] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      scmdbuf = "SELECT T1.Nove_Observaciones, T2.TNov_Nombre_Campo, T1.Nove_RespuestaProc, T1.Nove_Estado," ;
      scmdbuf = scmdbuf + " T1.Nove_RutaSoporte, T1.Nove_Soporte, T1.Nove_Masivo, T2.TNov_Procedimiento, T2.TNov_Tipo," ;
      scmdbuf = scmdbuf + " T2.TNov_Descripcion, T1.TNov_Codigo, T4.Cuen_Nombre AS Nove_CuentadanteNomDestino," ;
      scmdbuf = scmdbuf + " T4.Cuen_Cedula AS Nove_CuentadanteCedDestino, T3.Tran_IdCuentadanteDestino AS Nove_CuentadanteIdDestino," ;
      scmdbuf = scmdbuf + " T3.Tran_CodBodeDestino AS Nove_BodeDestino, T3.Tran_CodAlmaDestino AS Nove_AlmaDestino," ;
      scmdbuf = scmdbuf + " T3.Tran_ModuloDestino AS Nove_ModuloDestino, T5.Cuen_Nombre AS Nove_CuentadanteNomOrigen," ;
      scmdbuf = scmdbuf + " T5.Cuen_Cedula AS Nove_CuentadanteCedOrigen, T3.Tran_IdCuentadanteOrigen AS Nove_CuentadanteIdOrigen," ;
      scmdbuf = scmdbuf + " T3.Tran_CodBodeOrigen AS Nove_BodeOrigen, T3.Tran_CodAlmaOrigen AS Nove_AlmaOrigen," ;
      scmdbuf = scmdbuf + " T3.Tran_ModuloOrigen AS Nove_ModuloOrigen, T6.Tpmo_Descripcion AS Nove_MovimientoDescrip," ;
      scmdbuf = scmdbuf + " T3.Tran_CodigoMovimiento AS Nove_CodigoMovimiento, T7.Cent_Descripcion AS Nove_CentroDescripcion," ;
      scmdbuf = scmdbuf + " T7.Cent_Codigo AS Nove_CentroCodigo, T3.Tran_CentroCostoId AS Nove_CentroId, T8.Regi_Descripcion" ;
      scmdbuf = scmdbuf + " AS Nove_RegionDescripcion, T8.Regi_Cod AS Nove_RegionCodigo, T3.Tran_RegionId AS" ;
      scmdbuf = scmdbuf + " Nove_RegionId, T1.Nove_TransId AS Nove_TransId, T3.Tran_ConsecutivoCC AS Nove_TranCC," ;
      scmdbuf = scmdbuf + " T1.Nove_UsuarioRegistro, T1.Nove_FechaRegistro, T1.Nove_Identificador FROM (((((((ALM_NOVEDAD" ;
      scmdbuf = scmdbuf + " T1 LEFT JOIN ALM_TIPO_NOVEDAD T2 ON T2.TNov_Codigo = T1.TNov_Codigo) LEFT JOIN ALM_TRANSACCION" ;
      scmdbuf = scmdbuf + " T3 ON T3.Tran_Id = T1.Nove_TransId) LEFT JOIN ALM_CUENTADANTE T4 ON T4.Cuen_Identificacion" ;
      scmdbuf = scmdbuf + " = T3.Tran_IdCuentadanteDestino) LEFT JOIN ALM_CUENTADANTE T5 ON T5.Cuen_Identificacion" ;
      scmdbuf = scmdbuf + " = T3.Tran_IdCuentadanteOrigen) LEFT JOIN ALM_TIPO_MOVIMIENTO T6 ON T6.Tpmo_Codigo" ;
      scmdbuf = scmdbuf + " = T3.Tran_CodigoMovimiento) LEFT JOIN GEN_CENTROCOSTO T7 ON T7.Cent_Id = T3.Tran_CentroCostoId)" ;
      scmdbuf = scmdbuf + " LEFT JOIN GEN_REGIONAL T8 ON T8.Regi_Id = T3.Tran_RegionId)" ;
      scmdbuf = scmdbuf + " WHERE (T1.Nove_Estado <> 'F')" ;
      if ( ! (0==AV15Nove_Identificador) )
      {
         sWhereString = sWhereString + " and (T1.Nove_Identificador = ?)" ;
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16TNov_Tipo)==0) )
      {
         sWhereString = sWhereString + " and (T2.TNov_Tipo like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV20Nove_TranCC) )
      {
         sWhereString = sWhereString + " and (T3.Tran_ConsecutivoCC = ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22Nove_Masivo)==0) )
      {
         sWhereString = sWhereString + " and (T1.Nove_Masivo like ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY T1.Nove_Identificador DESC" ;
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
                  return conditional_H00282(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00282", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getBLOBFile(6, "tmp", "") ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((long[]) buf[26])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((long[]) buf[36])[0] = rslt.getLong(19) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((long[]) buf[38])[0] = rslt.getLong(20) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((long[]) buf[54])[0] = rslt.getLong(28) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((short[]) buf[58])[0] = rslt.getShort(30) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((long[]) buf[60])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((long[]) buf[62])[0] = rslt.getLong(32) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((long[]) buf[64])[0] = rslt.getLong(33) ;
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((long[]) buf[66])[0] = rslt.getLong(34) ;
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[68])[0] = rslt.getGXDateTime(35) ;
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((long[]) buf[70])[0] = rslt.getLong(36) ;
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
                  stmt.setLong(sIdx, ((Number) parms[4]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[6]).longValue(), 0);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 2);
               }
               return;
      }
   }

}

