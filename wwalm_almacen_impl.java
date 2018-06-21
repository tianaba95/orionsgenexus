/*
               File: wwalm_almacen_impl
        Description: Work With Almacén
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:50.17
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

public final  class wwalm_almacen_impl extends GXDataArea
{
   public wwalm_almacen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_almacen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_almacen_impl.class ));
   }

   public wwalm_almacen_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlma_Modulo = new HTMLChoice();
      cmbAlma_Estado = new HTMLChoice();
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
            AV19Delete = httpContext.GetNextPar( ) ;
            edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_59_Refreshing);
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
            AV14Alma_Descripcion = httpContext.GetNextPar( ) ;
            AV15Alma_Codigo = httpContext.GetNextPar( ) ;
            AV16Alma_NombreResponsable = httpContext.GetNextPar( ) ;
            AV17Cent_Codigo = httpContext.GetNextPar( ) ;
            AV18Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_59_Refreshing);
            AV19Delete = httpContext.GetNextPar( ) ;
            edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_59_Refreshing);
            AV20ADVANCED_LABEL_TEMPLATE = httpContext.GetNextPar( ) ;
            AV23Pgmname = httpContext.GetNextPar( ) ;
            A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            A27Alma_Modulo = httpContext.GetNextPar( ) ;
            A28Alma_Codigo = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14Alma_Descripcion, AV15Alma_Codigo, AV16Alma_NombreResponsable, AV17Cent_Codigo, AV18Update, AV19Delete, AV20ADVANCED_LABEL_TEMPLATE, AV23Pgmname, A1Cent_Id, A27Alma_Modulo, A28Alma_Codigo) ;
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
      pa0M2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0M2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414175025");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_almacen") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vALMA_DESCRIPCION", AV14Alma_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vALMA_CODIGO", AV15Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vALMA_NOMBRERESPONSABLE", AV16Alma_NombreResponsable);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENT_CODIGO", AV17Cent_Codigo);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_59", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_59, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vADVANCED_LABEL_TEMPLATE", GXutil.rtrim( AV20ADVANCED_LABEL_TEMPLATE));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV23Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vDELETE_Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FILTERSCONTAINER_Class", GXutil.rtrim( divFilterscontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divAlma_codigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_NOMBRERESPONSABLEFILTERCONTAINER_Class", GXutil.rtrim( divAlma_nombreresponsablefiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CODIGOFILTERCONTAINER_Class", GXutil.rtrim( divCent_codigofiltercontainer_Class));
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
         we0M2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0M2( ) ;
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
      return formatLink("com.orions2.wwalm_almacen")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_ALMACEN" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Almacén" ;
   }

   public void wb0M0( )
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 59, 2, 0)+","+"null"+");", bttBtntoggle_Caption, bttBtntoggle_Jsonclick, 7, "Otros Filtros", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e110m1_client"+"'", TempTags, "", 2, "HLP_WWALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Almacenes", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 59, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-sm-pull-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlma_descripcion_Internalname, "Alma_Descripcion", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlma_descripcion_Internalname, AV14Alma_Descripcion, GXutil.rtrim( localUtil.format( AV14Alma_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Descripción Almacén", edtavAlma_descripcion_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavAlma_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divAlma_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divAlma_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblalma_codigofilter_Internalname, lblLblalma_codigofilter_Caption, "", "", lblLblalma_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120m1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlma_codigo_Internalname, "Alma_Codigo", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlma_codigo_Internalname, AV15Alma_Codigo, GXutil.rtrim( localUtil.format( AV15Alma_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlma_codigo_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavAlma_codigo_Visible, edtavAlma_codigo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divAlma_nombreresponsablefiltercontainer_Internalname, 1, 0, "px", 0, "px", divAlma_nombreresponsablefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblalma_nombreresponsablefilter_Internalname, lblLblalma_nombreresponsablefilter_Caption, "", "", lblLblalma_nombreresponsablefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130m1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlma_nombreresponsable_Internalname, "Alma_Nombre Responsable", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlma_nombreresponsable_Internalname, AV16Alma_NombreResponsable, GXutil.rtrim( localUtil.format( AV16Alma_NombreResponsable, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlma_nombreresponsable_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavAlma_nombreresponsable_Visible, edtavAlma_nombreresponsable_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_ALMACEN.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCent_codigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divCent_codigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcent_codigofilter_Internalname, lblLblcent_codigofilter_Caption, "", "", lblLblcent_codigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140m1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_ALMACEN.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCent_codigo_Internalname, "Cent_Codigo", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_59_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCent_codigo_Internalname, AV17Cent_Codigo, GXutil.rtrim( localUtil.format( AV17Cent_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCent_codigo_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavCent_codigo_Visible, edtavCent_codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_ALMACEN.htm");
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
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripciòn") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código C.C.") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Modulo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Dirección") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Telefono") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Responsable") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Responsable") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cedula Responsable") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"UpdateAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DeleteAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
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
            GridColumn.AddObjectProperty("Value", A28Alma_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A252Alma_Descripcion);
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
            GridColumn.AddObjectProperty("Value", A27Alma_Modulo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A259Alma_Direccion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A260Alma_Telefono1, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A30Alma_IdResponsable, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A266Alma_NombreResponsable);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A673Alma_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A265Alma_CedulaResponsable, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV18Update));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavUpdate_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV19Delete));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavDelete_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
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

   public void start0M2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Almacén", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0M0( ) ;
   }

   public void ws0M2( )
   {
      start0M2( ) ;
      evt0M2( ) ;
   }

   public void evt0M2( )
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
                           e150M2 ();
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
                           A28Alma_Codigo = httpContext.cgiGet( edtAlma_Codigo_Internalname) ;
                           A252Alma_Descripcion = GXutil.upper( httpContext.cgiGet( edtAlma_Descripcion_Internalname)) ;
                           A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
                           A3Cent_Codigo = httpContext.cgiGet( edtCent_Codigo_Internalname) ;
                           A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
                           cmbAlma_Modulo.setName( cmbAlma_Modulo.getInternalname() );
                           cmbAlma_Modulo.setValue( httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) );
                           A27Alma_Modulo = httpContext.cgiGet( cmbAlma_Modulo.getInternalname()) ;
                           A259Alma_Direccion = httpContext.cgiGet( edtAlma_Direccion_Internalname) ;
                           n259Alma_Direccion = false ;
                           A260Alma_Telefono1 = localUtil.ctol( httpContext.cgiGet( edtAlma_Telefono1_Internalname), ",", ".") ;
                           n260Alma_Telefono1 = false ;
                           A30Alma_IdResponsable = localUtil.ctol( httpContext.cgiGet( edtAlma_IdResponsable_Internalname), ",", ".") ;
                           A266Alma_NombreResponsable = GXutil.upper( httpContext.cgiGet( edtAlma_NombreResponsable_Internalname)) ;
                           n266Alma_NombreResponsable = false ;
                           cmbAlma_Estado.setName( cmbAlma_Estado.getInternalname() );
                           cmbAlma_Estado.setValue( httpContext.cgiGet( cmbAlma_Estado.getInternalname()) );
                           A673Alma_Estado = httpContext.cgiGet( cmbAlma_Estado.getInternalname()) ;
                           n673Alma_Estado = false ;
                           A265Alma_CedulaResponsable = localUtil.ctol( httpContext.cgiGet( edtAlma_CedulaResponsable_Internalname), ",", ".") ;
                           n265Alma_CedulaResponsable = false ;
                           AV18Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV18Update)==0) ? AV24Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV18Update))), !bGXsfl_59_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV18Update), true);
                           AV19Delete = httpContext.cgiGet( edtavDelete_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Delete)==0) ? AV25Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Delete))), !bGXsfl_59_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Delete), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e160M2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e170M2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e180M2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Alma_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALMA_DESCRIPCION"), AV14Alma_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Alma_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALMA_CODIGO"), AV15Alma_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Alma_nombreresponsable Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALMA_NOMBRERESPONSABLE"), AV16Alma_NombreResponsable) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cent_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENT_CODIGO"), AV17Cent_Codigo) != 0 )
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

   public void we0M2( )
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

   public void pa0M2( )
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
         GXCCtl = "ALMA_MODULO_" + sGXsfl_59_idx ;
         cmbAlma_Modulo.setName( GXCCtl );
         cmbAlma_Modulo.setWebtags( "" );
         cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
         cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbAlma_Modulo.getItemCount() > 0 )
         {
            A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
         }
         GXCCtl = "ALMA_ESTADO_" + sGXsfl_59_idx ;
         cmbAlma_Estado.setName( GXCCtl );
         cmbAlma_Estado.setWebtags( "" );
         cmbAlma_Estado.addItem("A", "Activo", (short)(0));
         cmbAlma_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbAlma_Estado.getItemCount() > 0 )
         {
            A673Alma_Estado = cmbAlma_Estado.getValidValue(A673Alma_Estado) ;
            n673Alma_Estado = false ;
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
            GX_FocusControl = edtavAlma_descripcion_Internalname ;
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
                                 String AV14Alma_Descripcion ,
                                 String AV15Alma_Codigo ,
                                 String AV16Alma_NombreResponsable ,
                                 String AV17Cent_Codigo ,
                                 String AV18Update ,
                                 String AV19Delete ,
                                 String AV20ADVANCED_LABEL_TEMPLATE ,
                                 String AV23Pgmname ,
                                 long A1Cent_Id ,
                                 String A27Alma_Modulo ,
                                 String A28Alma_Codigo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf0M2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A28Alma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_CODIGO", A28Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_DESCRIPCION", A252Alma_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ID", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A27Alma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_MODULO", A27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_DIRECCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A259Alma_Direccion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_DIRECCION", A259Alma_Direccion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_TELEFONO1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_TELEFONO1", GXutil.ltrim( localUtil.ntoc( A260Alma_Telefono1, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_IDRESPONSABLE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A30Alma_IdResponsable), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_IDRESPONSABLE", GXutil.ltrim( localUtil.ntoc( A30Alma_IdResponsable, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A673Alma_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_ESTADO", GXutil.rtrim( A673Alma_Estado));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0M2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV23Pgmname = "WWALM_ALMACEN" ;
      Gx_err = (short)(0) ;
   }

   public void rf0M2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(59) ;
      /* Execute user event: Refresh */
      e170M2 ();
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
                                              AV15Alma_Codigo ,
                                              AV17Cent_Codigo ,
                                              A28Alma_Codigo ,
                                              A3Cent_Codigo ,
                                              AV14Alma_Descripcion ,
                                              A252Alma_Descripcion ,
                                              AV16Alma_NombreResponsable ,
                                              A266Alma_NombreResponsable } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         } ) ;
         lV15Alma_Codigo = GXutil.concat( GXutil.rtrim( AV15Alma_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Alma_Codigo", AV15Alma_Codigo);
         lV17Cent_Codigo = GXutil.concat( GXutil.rtrim( AV17Cent_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Cent_Codigo", AV17Cent_Codigo);
         /* Using cursor H000M2 */
         pr_default.execute(0, new Object[] {lV15Alma_Codigo, lV17Cent_Codigo});
         nGXsfl_59_idx = (short)(1) ;
         sGXsfl_59_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_59_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_592( ) ;
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
         {
            A265Alma_CedulaResponsable = H000M2_A265Alma_CedulaResponsable[0] ;
            n265Alma_CedulaResponsable = H000M2_n265Alma_CedulaResponsable[0] ;
            A673Alma_Estado = H000M2_A673Alma_Estado[0] ;
            n673Alma_Estado = H000M2_n673Alma_Estado[0] ;
            A266Alma_NombreResponsable = H000M2_A266Alma_NombreResponsable[0] ;
            n266Alma_NombreResponsable = H000M2_n266Alma_NombreResponsable[0] ;
            A30Alma_IdResponsable = H000M2_A30Alma_IdResponsable[0] ;
            A260Alma_Telefono1 = H000M2_A260Alma_Telefono1[0] ;
            n260Alma_Telefono1 = H000M2_n260Alma_Telefono1[0] ;
            A259Alma_Direccion = H000M2_A259Alma_Direccion[0] ;
            n259Alma_Direccion = H000M2_n259Alma_Direccion[0] ;
            A27Alma_Modulo = H000M2_A27Alma_Modulo[0] ;
            A4Cent_Descripcion = H000M2_A4Cent_Descripcion[0] ;
            A3Cent_Codigo = H000M2_A3Cent_Codigo[0] ;
            A1Cent_Id = H000M2_A1Cent_Id[0] ;
            A252Alma_Descripcion = H000M2_A252Alma_Descripcion[0] ;
            A28Alma_Codigo = H000M2_A28Alma_Codigo[0] ;
            A265Alma_CedulaResponsable = H000M2_A265Alma_CedulaResponsable[0] ;
            n265Alma_CedulaResponsable = H000M2_n265Alma_CedulaResponsable[0] ;
            A266Alma_NombreResponsable = H000M2_A266Alma_NombreResponsable[0] ;
            n266Alma_NombreResponsable = H000M2_n266Alma_NombreResponsable[0] ;
            A4Cent_Descripcion = H000M2_A4Cent_Descripcion[0] ;
            A3Cent_Codigo = H000M2_A3Cent_Codigo[0] ;
            if ( (GXutil.strcmp("", AV14Alma_Descripcion)==0) || ( GXutil.like( GXutil.upper( A252Alma_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV14Alma_Descripcion), "") , 254 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV16Alma_NombreResponsable)==0) || ( GXutil.like( GXutil.upper( A266Alma_NombreResponsable) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16Alma_NombreResponsable), "") , 254 , "%"),  ' ' ) ) )
               {
                  e180M2 ();
               }
            }
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(59) ;
         wb0M0( ) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Alma_Descripcion, AV15Alma_Codigo, AV16Alma_NombreResponsable, AV17Cent_Codigo, AV18Update, AV19Delete, AV20ADVANCED_LABEL_TEMPLATE, AV23Pgmname, A1Cent_Id, A27Alma_Modulo, A28Alma_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Alma_Descripcion, AV15Alma_Codigo, AV16Alma_NombreResponsable, AV17Cent_Codigo, AV18Update, AV19Delete, AV20ADVANCED_LABEL_TEMPLATE, AV23Pgmname, A1Cent_Id, A27Alma_Modulo, A28Alma_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Alma_Descripcion, AV15Alma_Codigo, AV16Alma_NombreResponsable, AV17Cent_Codigo, AV18Update, AV19Delete, AV20ADVANCED_LABEL_TEMPLATE, AV23Pgmname, A1Cent_Id, A27Alma_Modulo, A28Alma_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Alma_Descripcion, AV15Alma_Codigo, AV16Alma_NombreResponsable, AV17Cent_Codigo, AV18Update, AV19Delete, AV20ADVANCED_LABEL_TEMPLATE, AV23Pgmname, A1Cent_Id, A27Alma_Modulo, A28Alma_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Alma_Descripcion, AV15Alma_Codigo, AV16Alma_NombreResponsable, AV17Cent_Codigo, AV18Update, AV19Delete, AV20ADVANCED_LABEL_TEMPLATE, AV23Pgmname, A1Cent_Id, A27Alma_Modulo, A28Alma_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0M0( )
   {
      /* Before Start, stand alone formulas. */
      AV23Pgmname = "WWALM_ALMACEN" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e160M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14Alma_Descripcion = GXutil.upper( httpContext.cgiGet( edtavAlma_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Alma_Descripcion", AV14Alma_Descripcion);
         AV15Alma_Codigo = httpContext.cgiGet( edtavAlma_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Alma_Codigo", AV15Alma_Codigo);
         AV16Alma_NombreResponsable = GXutil.upper( httpContext.cgiGet( edtavAlma_nombreresponsable_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Alma_NombreResponsable", AV16Alma_NombreResponsable);
         AV17Cent_Codigo = httpContext.cgiGet( edtavCent_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Cent_Codigo", AV17Cent_Codigo);
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
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALMA_DESCRIPCION"), AV14Alma_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALMA_CODIGO"), AV15Alma_Codigo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALMA_NOMBRERESPONSABLE"), AV16Alma_NombreResponsable) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENT_CODIGO"), AV17Cent_Codigo) != 0 )
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
      e160M2 ();
      if (returnInSub) return;
   }

   public void e160M2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV23Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV23Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      divGridcell_Class = "WWGridCellExpanded" ;
      httpContext.ajax_rsp_assign_prop("", false, divGridcell_Internalname, "Class", divGridcell_Class, true);
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      divGridcell_Class = "WWGridCellExpanded" ;
      httpContext.ajax_rsp_assign_prop("", false, divGridcell_Internalname, "Class", divGridcell_Class, true);
      AV18Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV18Update)==0) ? AV24Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV18Update))), !bGXsfl_59_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV18Update), true);
      AV24Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV18Update)==0) ? AV24Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV18Update))), !bGXsfl_59_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV18Update), true);
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_59_Refreshing);
      AV19Delete = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Delete)==0) ? AV25Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Delete))), !bGXsfl_59_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Delete), true);
      AV25Delete_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Delete)==0) ? AV25Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Delete))), !bGXsfl_59_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Delete), true);
      edtavDelete_Tooltiptext = "Eliminar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_59_Refreshing);
      Form.setCaption( "Almacenes" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV20ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ADVANCED_LABEL_TEMPLATE", AV20ADVANCED_LABEL_TEMPLATE);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
   }

   public void e170M2( )
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
      if ( (GXutil.strcmp("", AV15Alma_Codigo)==0) )
      {
         lblLblalma_codigofilter_Caption = "Código Almacén" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblalma_codigofilter_Internalname, "Caption", lblLblalma_codigofilter_Caption, true);
      }
      else
      {
         lblLblalma_codigofilter_Caption = GXutil.format( AV20ADVANCED_LABEL_TEMPLATE, "Código Almacén", AV15Alma_Codigo, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblalma_codigofilter_Internalname, "Caption", lblLblalma_codigofilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV16Alma_NombreResponsable)==0) )
      {
         lblLblalma_nombreresponsablefilter_Caption = "Responsable" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblalma_nombreresponsablefilter_Internalname, "Caption", lblLblalma_nombreresponsablefilter_Caption, true);
      }
      else
      {
         lblLblalma_nombreresponsablefilter_Caption = GXutil.format( AV20ADVANCED_LABEL_TEMPLATE, "Responsable", AV16Alma_NombreResponsable, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblalma_nombreresponsablefilter_Internalname, "Caption", lblLblalma_nombreresponsablefilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV17Cent_Codigo)==0) )
      {
         lblLblcent_codigofilter_Caption = "Centro de Costo" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcent_codigofilter_Internalname, "Caption", lblLblcent_codigofilter_Caption, true);
      }
      else
      {
         lblLblcent_codigofilter_Caption = GXutil.format( AV20ADVANCED_LABEL_TEMPLATE, "Centro de Costo", AV17Cent_Codigo, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcent_codigofilter_Internalname, "Caption", lblLblcent_codigofilter_Caption, true);
      }
   }

   private void e180M2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A27Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(A28Alma_Codigo)) ;
      edtavDelete_Link = formatLink("com.orions2.alm_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(A27Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(A28Alma_Codigo)) ;
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

   public void e150M2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.alm_almacen") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV8HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV9GridState.fromxml(AV7Session.getValue(AV23Pgmname+"GridState"), null, null);
         if ( AV9GridState.getgxTv_SdtGridState_Filtervalues().size() >= 4 )
         {
            AV14Alma_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Alma_Descripcion", AV14Alma_Descripcion);
            AV15Alma_Codigo = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+2)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Alma_Codigo", AV15Alma_Codigo);
            AV16Alma_NombreResponsable = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+3)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Alma_NombreResponsable", AV16Alma_NombreResponsable);
            AV17Cent_Codigo = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+4)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Cent_Codigo", AV17Cent_Codigo);
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
      AV9GridState.fromxml(AV7Session.getValue(AV23Pgmname+"GridState"), null, null);
      AV9GridState.setgxTv_SdtGridState_Currentpage( (short)(subgrid_currentpage( )) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().clear();
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV14Alma_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV15Alma_Codigo );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV16Alma_NombreResponsable );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV17Cent_Codigo );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV7Session.setValue(AV23Pgmname+"GridState", AV9GridState.toxml(false, true, "GridState", "ACBSENA"));
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV12TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV23Pgmname );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV8HTTPRequest.getScriptName()+"?"+AV8HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALMACÉN" );
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
      pa0M2( ) ;
      ws0M2( ) ;
      we0M2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414175149");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wwalm_almacen.js", "?201861414175149");
      /* End function include_jscripts */
   }

   public void subsflControlProps_592( )
   {
      edtAlma_Codigo_Internalname = "ALMA_CODIGO_"+sGXsfl_59_idx ;
      edtAlma_Descripcion_Internalname = "ALMA_DESCRIPCION_"+sGXsfl_59_idx ;
      edtCent_Id_Internalname = "CENT_ID_"+sGXsfl_59_idx ;
      edtCent_Codigo_Internalname = "CENT_CODIGO_"+sGXsfl_59_idx ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION_"+sGXsfl_59_idx ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO_"+sGXsfl_59_idx );
      edtAlma_Direccion_Internalname = "ALMA_DIRECCION_"+sGXsfl_59_idx ;
      edtAlma_Telefono1_Internalname = "ALMA_TELEFONO1_"+sGXsfl_59_idx ;
      edtAlma_IdResponsable_Internalname = "ALMA_IDRESPONSABLE_"+sGXsfl_59_idx ;
      edtAlma_NombreResponsable_Internalname = "ALMA_NOMBRERESPONSABLE_"+sGXsfl_59_idx ;
      cmbAlma_Estado.setInternalname( "ALMA_ESTADO_"+sGXsfl_59_idx );
      edtAlma_CedulaResponsable_Internalname = "ALMA_CEDULARESPONSABLE_"+sGXsfl_59_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_59_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_59_idx ;
   }

   public void subsflControlProps_fel_592( )
   {
      edtAlma_Codigo_Internalname = "ALMA_CODIGO_"+sGXsfl_59_fel_idx ;
      edtAlma_Descripcion_Internalname = "ALMA_DESCRIPCION_"+sGXsfl_59_fel_idx ;
      edtCent_Id_Internalname = "CENT_ID_"+sGXsfl_59_fel_idx ;
      edtCent_Codigo_Internalname = "CENT_CODIGO_"+sGXsfl_59_fel_idx ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION_"+sGXsfl_59_fel_idx ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO_"+sGXsfl_59_fel_idx );
      edtAlma_Direccion_Internalname = "ALMA_DIRECCION_"+sGXsfl_59_fel_idx ;
      edtAlma_Telefono1_Internalname = "ALMA_TELEFONO1_"+sGXsfl_59_fel_idx ;
      edtAlma_IdResponsable_Internalname = "ALMA_IDRESPONSABLE_"+sGXsfl_59_fel_idx ;
      edtAlma_NombreResponsable_Internalname = "ALMA_NOMBRERESPONSABLE_"+sGXsfl_59_fel_idx ;
      cmbAlma_Estado.setInternalname( "ALMA_ESTADO_"+sGXsfl_59_fel_idx );
      edtAlma_CedulaResponsable_Internalname = "ALMA_CEDULARESPONSABLE_"+sGXsfl_59_fel_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_59_fel_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_59_fel_idx ;
   }

   public void sendrow_592( )
   {
      subsflControlProps_592( ) ;
      wb0M0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Codigo_Internalname,A28Alma_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Descripcion_Internalname,A252Alma_Descripcion,GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Codigo_Internalname,A3Cent_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Descripcion_Internalname,A4Cent_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_59_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALMA_MODULO_" + sGXsfl_59_idx ;
            cmbAlma_Modulo.setName( GXCCtl );
            cmbAlma_Modulo.setWebtags( "" );
            cmbAlma_Modulo.addItem("ALMA", "ALMACEN", (short)(0));
            cmbAlma_Modulo.addItem("INVE", "INVENTARIO", (short)(0));
            cmbAlma_Modulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            if ( cmbAlma_Modulo.getItemCount() > 0 )
            {
               A27Alma_Modulo = cmbAlma_Modulo.getValidValue(A27Alma_Modulo) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlma_Modulo,cmbAlma_Modulo.getInternalname(),GXutil.rtrim( A27Alma_Modulo),new Integer(1),cmbAlma_Modulo.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbAlma_Modulo.setValue( GXutil.rtrim( A27Alma_Modulo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Modulo.getInternalname(), "Values", cmbAlma_Modulo.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Direccion_Internalname,A259Alma_Direccion,"","","'"+""+"'"+",false,"+"'"+""+"'","http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A259Alma_Direccion),"_blank","","",edtAlma_Direccion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1024),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Address","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_Telefono1_Internalname,GXutil.ltrim( localUtil.ntoc( A260Alma_Telefono1, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_Telefono1_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_IdResponsable_Internalname,GXutil.ltrim( localUtil.ntoc( A30Alma_IdResponsable, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A30Alma_IdResponsable), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_IdResponsable_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_NombreResponsable_Internalname,A266Alma_NombreResponsable,GXutil.rtrim( localUtil.format( A266Alma_NombreResponsable, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_NombreResponsable_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_59_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALMA_ESTADO_" + sGXsfl_59_idx ;
            cmbAlma_Estado.setName( GXCCtl );
            cmbAlma_Estado.setWebtags( "" );
            cmbAlma_Estado.addItem("A", "Activo", (short)(0));
            cmbAlma_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbAlma_Estado.getItemCount() > 0 )
            {
               A673Alma_Estado = cmbAlma_Estado.getValidValue(A673Alma_Estado) ;
               n673Alma_Estado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlma_Estado,cmbAlma_Estado.getInternalname(),GXutil.rtrim( A673Alma_Estado),new Integer(1),cmbAlma_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbAlma_Estado.setValue( GXutil.rtrim( A673Alma_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlma_Estado.getInternalname(), "Values", cmbAlma_Estado.ToJavascriptSource(), !bGXsfl_59_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlma_CedulaResponsable_Internalname,GXutil.ltrim( localUtil.ntoc( A265Alma_CedulaResponsable, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A265Alma_CedulaResponsable), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlma_CedulaResponsable_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(59),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV18Update_IsBlob = (boolean)(((GXutil.strcmp("", AV18Update)==0)&&(GXutil.strcmp("", AV24Update_GXI)==0))||!(GXutil.strcmp("", AV18Update)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV18Update)==0) ? AV24Update_GXI : httpContext.getResourceRelative(AV18Update)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,sImgUrl,edtavUpdate_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavUpdate_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV18Update_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "DeleteAttribute" ;
         StyleString = "" ;
         AV19Delete_IsBlob = (boolean)(((GXutil.strcmp("", AV19Delete)==0)&&(GXutil.strcmp("", AV25Delete_GXI)==0))||!(GXutil.strcmp("", AV19Delete)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV19Delete)==0) ? AV25Delete_GXI : httpContext.getResourceRelative(AV19Delete)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,sImgUrl,edtavDelete_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavDelete_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV19Delete_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_CODIGO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A28Alma_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_DESCRIPCION"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A252Alma_Descripcion, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ID"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_MODULO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A27Alma_Modulo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_DIRECCION"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A259Alma_Direccion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_TELEFONO1"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( DecimalUtil.doubleToDec(A260Alma_Telefono1), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_IDRESPONSABLE"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, localUtil.format( DecimalUtil.doubleToDec(A30Alma_IdResponsable), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALMA_ESTADO"+"_"+sGXsfl_59_idx, getSecureSignedToken( sGXsfl_59_idx, GXutil.rtrim( localUtil.format( A673Alma_Estado, ""))));
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
      edtavAlma_descripcion_Internalname = "vALMA_DESCRIPCION" ;
      divTabletop_Internalname = "TABLETOP" ;
      lblLblalma_codigofilter_Internalname = "LBLALMA_CODIGOFILTER" ;
      edtavAlma_codigo_Internalname = "vALMA_CODIGO" ;
      divAlma_codigofiltercontainer_Internalname = "ALMA_CODIGOFILTERCONTAINER" ;
      lblLblalma_nombreresponsablefilter_Internalname = "LBLALMA_NOMBRERESPONSABLEFILTER" ;
      edtavAlma_nombreresponsable_Internalname = "vALMA_NOMBRERESPONSABLE" ;
      divAlma_nombreresponsablefiltercontainer_Internalname = "ALMA_NOMBRERESPONSABLEFILTERCONTAINER" ;
      lblLblcent_codigofilter_Internalname = "LBLCENT_CODIGOFILTER" ;
      edtavCent_codigo_Internalname = "vCENT_CODIGO" ;
      divCent_codigofiltercontainer_Internalname = "CENT_CODIGOFILTERCONTAINER" ;
      divFilterscontainer_Internalname = "FILTERSCONTAINER" ;
      edtAlma_Codigo_Internalname = "ALMA_CODIGO" ;
      edtAlma_Descripcion_Internalname = "ALMA_DESCRIPCION" ;
      edtCent_Id_Internalname = "CENT_ID" ;
      edtCent_Codigo_Internalname = "CENT_CODIGO" ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION" ;
      cmbAlma_Modulo.setInternalname( "ALMA_MODULO" );
      edtAlma_Direccion_Internalname = "ALMA_DIRECCION" ;
      edtAlma_Telefono1_Internalname = "ALMA_TELEFONO1" ;
      edtAlma_IdResponsable_Internalname = "ALMA_IDRESPONSABLE" ;
      edtAlma_NombreResponsable_Internalname = "ALMA_NOMBRERESPONSABLE" ;
      cmbAlma_Estado.setInternalname( "ALMA_ESTADO" );
      edtAlma_CedulaResponsable_Internalname = "ALMA_CEDULARESPONSABLE" ;
      edtavUpdate_Internalname = "vUPDATE" ;
      edtavDelete_Internalname = "vDELETE" ;
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
      edtAlma_CedulaResponsable_Jsonclick = "" ;
      cmbAlma_Estado.setJsonclick( "" );
      edtAlma_NombreResponsable_Jsonclick = "" ;
      edtAlma_IdResponsable_Jsonclick = "" ;
      edtAlma_Telefono1_Jsonclick = "" ;
      edtAlma_Direccion_Jsonclick = "" ;
      cmbAlma_Modulo.setJsonclick( "" );
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Id_Jsonclick = "" ;
      edtAlma_Descripcion_Jsonclick = "" ;
      edtAlma_Codigo_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divGridcell_Class = "col-xs-12 col-sm-9 col-md-10 WWGridCell" ;
      edtavCent_codigo_Jsonclick = "" ;
      edtavCent_codigo_Enabled = 1 ;
      edtavCent_codigo_Visible = 1 ;
      lblLblcent_codigofilter_Caption = "Centro de Costo" ;
      edtavAlma_nombreresponsable_Jsonclick = "" ;
      edtavAlma_nombreresponsable_Enabled = 1 ;
      edtavAlma_nombreresponsable_Visible = 1 ;
      lblLblalma_nombreresponsablefilter_Caption = "Responsable" ;
      edtavAlma_codigo_Jsonclick = "" ;
      edtavAlma_codigo_Enabled = 1 ;
      edtavAlma_codigo_Visible = 1 ;
      lblLblalma_codigofilter_Caption = "Código Almacén" ;
      edtavAlma_descripcion_Jsonclick = "" ;
      edtavAlma_descripcion_Enabled = 1 ;
      bttBtntoggle_Class = "HideFiltersButton" ;
      bttBtntoggle_Caption = "Otros Filtros" ;
      divCent_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divAlma_nombreresponsablefiltercontainer_Class = "AdvancedContainerItem" ;
      divAlma_codigofiltercontainer_Class = "AdvancedContainerItem" ;
      divFilterscontainer_Class = "AdvancedContainer" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Almacén" );
      subGrid_Rows = 0 ;
      edtavDelete_Tooltiptext = "Eliminar" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV19Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV20ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Alma_NombreResponsable',fld:'vALMA_NOMBRERESPONSABLE',pic:'@!',nv:''},{av:'AV17Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV23Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Alma_Descripcion',fld:'vALMA_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'lblLblalma_codigofilter_Caption',ctrl:'LBLALMA_CODIGOFILTER',prop:'Caption'},{av:'lblLblalma_nombreresponsablefilter_Caption',ctrl:'LBLALMA_NOMBRERESPONSABLEFILTER',prop:'Caption'},{av:'lblLblcent_codigofilter_Caption',ctrl:'LBLCENT_CODIGOFILTER',prop:'Caption'}]}");
      setEventMetadata("'TOGGLE'","{handler:'e110M1',iparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'}],oparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Caption'},{av:'divGridcell_Class',ctrl:'GRIDCELL',prop:'Class'}]}");
      setEventMetadata("LBLALMA_CODIGOFILTER.CLICK","{handler:'e120M1',iparms:[{av:'divAlma_codigofiltercontainer_Class',ctrl:'ALMA_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divAlma_codigofiltercontainer_Class',ctrl:'ALMA_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavAlma_codigo_Visible',ctrl:'vALMA_CODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLALMA_NOMBRERESPONSABLEFILTER.CLICK","{handler:'e130M1',iparms:[{av:'divAlma_nombreresponsablefiltercontainer_Class',ctrl:'ALMA_NOMBRERESPONSABLEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divAlma_nombreresponsablefiltercontainer_Class',ctrl:'ALMA_NOMBRERESPONSABLEFILTERCONTAINER',prop:'Class'},{av:'edtavAlma_nombreresponsable_Visible',ctrl:'vALMA_NOMBRERESPONSABLE',prop:'Visible'}]}");
      setEventMetadata("LBLCENT_CODIGOFILTER.CLICK","{handler:'e140M1',iparms:[{av:'divCent_codigofiltercontainer_Class',ctrl:'CENT_CODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCent_codigofiltercontainer_Class',ctrl:'CENT_CODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavCent_codigo_Visible',ctrl:'vCENT_CODIGO',prop:'Visible'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e180M2',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e150M2',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV19Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV20ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Alma_NombreResponsable',fld:'vALMA_NOMBRERESPONSABLE',pic:'@!',nv:''},{av:'AV17Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV23Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Alma_Descripcion',fld:'vALMA_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'lblLblalma_codigofilter_Caption',ctrl:'LBLALMA_CODIGOFILTER',prop:'Caption'},{av:'lblLblalma_nombreresponsablefilter_Caption',ctrl:'LBLALMA_NOMBRERESPONSABLEFILTER',prop:'Caption'},{av:'lblLblcent_codigofilter_Caption',ctrl:'LBLCENT_CODIGOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV19Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV20ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Alma_NombreResponsable',fld:'vALMA_NOMBRERESPONSABLE',pic:'@!',nv:''},{av:'AV17Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV23Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Alma_Descripcion',fld:'vALMA_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'lblLblalma_codigofilter_Caption',ctrl:'LBLALMA_CODIGOFILTER',prop:'Caption'},{av:'lblLblalma_nombreresponsablefilter_Caption',ctrl:'LBLALMA_NOMBRERESPONSABLEFILTER',prop:'Caption'},{av:'lblLblcent_codigofilter_Caption',ctrl:'LBLCENT_CODIGOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV19Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV20ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Alma_NombreResponsable',fld:'vALMA_NOMBRERESPONSABLE',pic:'@!',nv:''},{av:'AV17Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV23Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Alma_Descripcion',fld:'vALMA_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'lblLblalma_codigofilter_Caption',ctrl:'LBLALMA_CODIGOFILTER',prop:'Caption'},{av:'lblLblalma_nombreresponsablefilter_Caption',ctrl:'LBLALMA_NOMBRERESPONSABLEFILTER',prop:'Caption'},{av:'lblLblcent_codigofilter_Caption',ctrl:'LBLCENT_CODIGOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV18Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV19Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'cmbAlma_Modulo'},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',hsh:true,nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV20ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Alma_NombreResponsable',fld:'vALMA_NOMBRERESPONSABLE',pic:'@!',nv:''},{av:'AV17Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV23Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Alma_Descripcion',fld:'vALMA_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'lblLblalma_codigofilter_Caption',ctrl:'LBLALMA_CODIGOFILTER',prop:'Caption'},{av:'lblLblalma_nombreresponsablefilter_Caption',ctrl:'LBLALMA_NOMBRERESPONSABLEFILTER',prop:'Caption'},{av:'lblLblcent_codigofilter_Caption',ctrl:'LBLCENT_CODIGOFILTER',prop:'Caption'}]}");
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
      AV19Delete = "" ;
      AV14Alma_Descripcion = "" ;
      AV15Alma_Codigo = "" ;
      AV16Alma_NombreResponsable = "" ;
      AV17Cent_Codigo = "" ;
      AV20ADVANCED_LABEL_TEMPLATE = "" ;
      AV23Pgmname = "" ;
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
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
      lblLblalma_codigofilter_Jsonclick = "" ;
      lblLblalma_nombreresponsablefilter_Jsonclick = "" ;
      lblLblcent_codigofilter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A252Alma_Descripcion = "" ;
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A259Alma_Direccion = "" ;
      A266Alma_NombreResponsable = "" ;
      A673Alma_Estado = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV24Update_GXI = "" ;
      AV25Delete_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV15Alma_Codigo = "" ;
      lV17Cent_Codigo = "" ;
      H000M2_A265Alma_CedulaResponsable = new long[1] ;
      H000M2_n265Alma_CedulaResponsable = new boolean[] {false} ;
      H000M2_A673Alma_Estado = new String[] {""} ;
      H000M2_n673Alma_Estado = new boolean[] {false} ;
      H000M2_A266Alma_NombreResponsable = new String[] {""} ;
      H000M2_n266Alma_NombreResponsable = new boolean[] {false} ;
      H000M2_A30Alma_IdResponsable = new long[1] ;
      H000M2_A260Alma_Telefono1 = new long[1] ;
      H000M2_n260Alma_Telefono1 = new boolean[] {false} ;
      H000M2_A259Alma_Direccion = new String[] {""} ;
      H000M2_n259Alma_Direccion = new boolean[] {false} ;
      H000M2_A27Alma_Modulo = new String[] {""} ;
      H000M2_A4Cent_Descripcion = new String[] {""} ;
      H000M2_A3Cent_Codigo = new String[] {""} ;
      H000M2_A1Cent_Id = new long[1] ;
      H000M2_A252Alma_Descripcion = new String[] {""} ;
      H000M2_A28Alma_Codigo = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_almacen__default(),
         new Object[] {
             new Object[] {
            H000M2_A265Alma_CedulaResponsable, H000M2_n265Alma_CedulaResponsable, H000M2_A673Alma_Estado, H000M2_n673Alma_Estado, H000M2_A266Alma_NombreResponsable, H000M2_n266Alma_NombreResponsable, H000M2_A30Alma_IdResponsable, H000M2_A260Alma_Telefono1, H000M2_n260Alma_Telefono1, H000M2_A259Alma_Direccion,
            H000M2_n259Alma_Direccion, H000M2_A27Alma_Modulo, H000M2_A4Cent_Descripcion, H000M2_A3Cent_Codigo, H000M2_A1Cent_Id, H000M2_A252Alma_Descripcion, H000M2_A28Alma_Codigo
            }
         }
      );
      AV23Pgmname = "WWALM_ALMACEN" ;
      /* GeneXus formulas. */
      AV23Pgmname = "WWALM_ALMACEN" ;
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
   private int edtavAlma_descripcion_Enabled ;
   private int edtavAlma_codigo_Visible ;
   private int edtavAlma_codigo_Enabled ;
   private int edtavAlma_nombreresponsable_Visible ;
   private int edtavAlma_nombreresponsable_Enabled ;
   private int edtavCent_codigo_Visible ;
   private int edtavCent_codigo_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int AV11GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long A1Cent_Id ;
   private long GRID_nFirstRecordOnPage ;
   private long A260Alma_Telefono1 ;
   private long A30Alma_IdResponsable ;
   private long A265Alma_CedulaResponsable ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String edtavUpdate_Tooltiptext ;
   private String edtavDelete_Tooltiptext ;
   private String divFilterscontainer_Class ;
   private String divAlma_codigofiltercontainer_Class ;
   private String divAlma_nombreresponsablefiltercontainer_Class ;
   private String divCent_codigofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_59_idx="0001" ;
   private String edtavUpdate_Internalname ;
   private String edtavDelete_Internalname ;
   private String AV20ADVANCED_LABEL_TEMPLATE ;
   private String AV23Pgmname ;
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
   private String edtavAlma_descripcion_Internalname ;
   private String edtavAlma_descripcion_Jsonclick ;
   private String divFilterscontainer_Internalname ;
   private String divAlma_codigofiltercontainer_Internalname ;
   private String lblLblalma_codigofilter_Internalname ;
   private String lblLblalma_codigofilter_Caption ;
   private String lblLblalma_codigofilter_Jsonclick ;
   private String edtavAlma_codigo_Internalname ;
   private String edtavAlma_codigo_Jsonclick ;
   private String divAlma_nombreresponsablefiltercontainer_Internalname ;
   private String lblLblalma_nombreresponsablefilter_Internalname ;
   private String lblLblalma_nombreresponsablefilter_Caption ;
   private String lblLblalma_nombreresponsablefilter_Jsonclick ;
   private String edtavAlma_nombreresponsable_Internalname ;
   private String edtavAlma_nombreresponsable_Jsonclick ;
   private String divCent_codigofiltercontainer_Internalname ;
   private String lblLblcent_codigofilter_Internalname ;
   private String lblLblcent_codigofilter_Caption ;
   private String lblLblcent_codigofilter_Jsonclick ;
   private String edtavCent_codigo_Internalname ;
   private String edtavCent_codigo_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridcell_Class ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String A673Alma_Estado ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlma_Codigo_Internalname ;
   private String edtAlma_Descripcion_Internalname ;
   private String edtCent_Id_Internalname ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Descripcion_Internalname ;
   private String edtAlma_Direccion_Internalname ;
   private String edtAlma_Telefono1_Internalname ;
   private String edtAlma_IdResponsable_Internalname ;
   private String edtAlma_NombreResponsable_Internalname ;
   private String edtAlma_CedulaResponsable_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String sGXsfl_59_fel_idx="0001" ;
   private String ROClassString ;
   private String edtAlma_Codigo_Jsonclick ;
   private String edtAlma_Descripcion_Jsonclick ;
   private String edtCent_Id_Jsonclick ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtAlma_Direccion_Jsonclick ;
   private String edtAlma_Telefono1_Jsonclick ;
   private String edtAlma_IdResponsable_Jsonclick ;
   private String edtAlma_NombreResponsable_Jsonclick ;
   private String edtAlma_CedulaResponsable_Jsonclick ;
   private String sImgUrl ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_59_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n259Alma_Direccion ;
   private boolean n260Alma_Telefono1 ;
   private boolean n266Alma_NombreResponsable ;
   private boolean n673Alma_Estado ;
   private boolean n265Alma_CedulaResponsable ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV18Update_IsBlob ;
   private boolean AV19Delete_IsBlob ;
   private String AV14Alma_Descripcion ;
   private String AV15Alma_Codigo ;
   private String AV16Alma_NombreResponsable ;
   private String AV17Cent_Codigo ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A252Alma_Descripcion ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A259Alma_Direccion ;
   private String A266Alma_NombreResponsable ;
   private String AV24Update_GXI ;
   private String AV25Delete_GXI ;
   private String lV15Alma_Codigo ;
   private String lV17Cent_Codigo ;
   private String AV18Update ;
   private String AV19Delete ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private HTMLChoice cmbAlma_Modulo ;
   private HTMLChoice cmbAlma_Estado ;
   private IDataStoreProvider pr_default ;
   private long[] H000M2_A265Alma_CedulaResponsable ;
   private boolean[] H000M2_n265Alma_CedulaResponsable ;
   private String[] H000M2_A673Alma_Estado ;
   private boolean[] H000M2_n673Alma_Estado ;
   private String[] H000M2_A266Alma_NombreResponsable ;
   private boolean[] H000M2_n266Alma_NombreResponsable ;
   private long[] H000M2_A30Alma_IdResponsable ;
   private long[] H000M2_A260Alma_Telefono1 ;
   private boolean[] H000M2_n260Alma_Telefono1 ;
   private String[] H000M2_A259Alma_Direccion ;
   private boolean[] H000M2_n259Alma_Direccion ;
   private String[] H000M2_A27Alma_Modulo ;
   private String[] H000M2_A4Cent_Descripcion ;
   private String[] H000M2_A3Cent_Codigo ;
   private long[] H000M2_A1Cent_Id ;
   private String[] H000M2_A252Alma_Descripcion ;
   private String[] H000M2_A28Alma_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwalm_almacen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000M2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV15Alma_Codigo ,
                                          String AV17Cent_Codigo ,
                                          String A28Alma_Codigo ,
                                          String A3Cent_Codigo ,
                                          String AV14Alma_Descripcion ,
                                          String A252Alma_Descripcion ,
                                          String AV16Alma_NombreResponsable ,
                                          String A266Alma_NombreResponsable )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [2] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      scmdbuf = "SELECT T2.Cuen_Cedula AS Alma_CedulaResponsable, T1.Alma_Estado, T2.Cuen_Nombre AS" ;
      scmdbuf = scmdbuf + " Alma_NombreResponsable, T1.Alma_IdResponsable AS Alma_IdResponsable, T1.Alma_Telefono1," ;
      scmdbuf = scmdbuf + " T1.Alma_Direccion, T1.Alma_Modulo, T3.Cent_Descripcion, T3.Cent_Codigo, T1.Cent_Id," ;
      scmdbuf = scmdbuf + " T1.Alma_Descripcion, T1.Alma_Codigo FROM ((ALM_ALMACEN T1 INNER JOIN ALM_CUENTADANTE" ;
      scmdbuf = scmdbuf + " T2 ON T2.Cuen_Identificacion = T1.Alma_IdResponsable) INNER JOIN GEN_CENTROCOSTO" ;
      scmdbuf = scmdbuf + " T3 ON T3.Cent_Id = T1.Cent_Id)" ;
      if ( ! (GXutil.strcmp("", AV15Alma_Codigo)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Alma_Codigo like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Alma_Codigo like ?)" ;
         }
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17Cent_Codigo)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T3.Cent_Codigo like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T3.Cent_Codigo like ?)" ;
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
      scmdbuf = scmdbuf + " ORDER BY T1.Alma_Descripcion" ;
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
                  return conditional_H000M2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000M2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((long[]) buf[6])[0] = rslt.getLong(4) ;
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((long[]) buf[14])[0] = rslt.getLong(10) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
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
                  stmt.setVarchar(sIdx, (String)parms[3], 16);
               }
               return;
      }
   }

}

