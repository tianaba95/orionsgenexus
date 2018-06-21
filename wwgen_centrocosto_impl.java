/*
               File: wwgen_centrocosto_impl
        Description: Work With Centro de costo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:45.73
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

public final  class wwgen_centrocosto_impl extends GXDataArea
{
   public wwgen_centrocosto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwgen_centrocosto_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwgen_centrocosto_impl.class ));
   }

   public wwgen_centrocosto_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCent_estado = new HTMLChoice();
      cmbCent_Estado = new HTMLChoice();
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
            nRC_GXsfl_69 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_69_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_69_idx = httpContext.GetNextPar( ) ;
            AV19Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_69_Refreshing);
            AV20Delete = httpContext.GetNextPar( ) ;
            edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_69_Refreshing);
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
            AV14Cent_Codigo = httpContext.GetNextPar( ) ;
            AV15Cent_Descripcion = httpContext.GetNextPar( ) ;
            AV16Regi_Cod = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV17Regi_Descripcion = httpContext.GetNextPar( ) ;
            AV18Cent_Estado = httpContext.GetNextPar( ) ;
            AV19Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_69_Refreshing);
            AV20Delete = httpContext.GetNextPar( ) ;
            edtavDelete_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_69_Refreshing);
            AV21ADVANCED_LABEL_TEMPLATE = httpContext.GetNextPar( ) ;
            AV24Pgmname = httpContext.GetNextPar( ) ;
            A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14Cent_Codigo, AV15Cent_Descripcion, AV16Regi_Cod, AV17Regi_Descripcion, AV18Cent_Estado, AV19Update, AV20Delete, AV21ADVANCED_LABEL_TEMPLATE, AV24Pgmname, A1Cent_Id) ;
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
      pa0A2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start0A2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414174587");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwgen_centrocosto") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENT_CODIGO", AV14Cent_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENT_DESCRIPCION", AV15Cent_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vREGI_COD", GXutil.ltrim( localUtil.ntoc( AV16Regi_Cod, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vREGI_DESCRIPCION", AV17Regi_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCENT_ESTADO", GXutil.rtrim( AV18Cent_Estado));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_69", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_69, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vADVANCED_LABEL_TEMPLATE", GXutil.rtrim( AV21ADVANCED_LABEL_TEMPLATE));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV24Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vDELETE_Tooltiptext", GXutil.rtrim( edtavDelete_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FILTERSCONTAINER_Class", GXutil.rtrim( divFilterscontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divCent_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_CODFILTERCONTAINER_Class", GXutil.rtrim( divRegi_codfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divRegi_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ESTADOFILTERCONTAINER_Class", GXutil.rtrim( divCent_estadofiltercontainer_Class));
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
         we0A2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt0A2( ) ;
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
      return formatLink("com.orions2.wwgen_centrocosto")  ;
   }

   public String getPgmname( )
   {
      return "WWGEN_CENTROCOSTO" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Centro de costo" ;
   }

   public void wb0A0( )
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", bttBtntoggle_Caption, bttBtntoggle_Jsonclick, 7, "Otros Filtros", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e110a1_client"+"'", TempTags, "", 2, "HLP_WWGEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Centros de costo", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWGEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 69, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWGEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-sm-pull-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCent_codigo_Internalname, "Cent_Codigo", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCent_codigo_Internalname, AV14Cent_Codigo, GXutil.rtrim( localUtil.format( AV14Cent_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Código del Centro de Costo", edtavCent_codigo_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavCent_codigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWGEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCent_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCent_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcent_descripcionfilter_Internalname, lblLblcent_descripcionfilter_Caption, "", "", lblLblcent_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e120a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWGEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCent_descripcion_Internalname, "Cent_Descripcion", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCent_descripcion_Internalname, AV15Cent_Descripcion, GXutil.rtrim( localUtil.format( AV15Cent_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCent_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavCent_descripcion_Visible, edtavCent_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWGEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divRegi_codfiltercontainer_Internalname, 1, 0, "px", 0, "px", divRegi_codfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblregi_codfilter_Internalname, lblLblregi_codfilter_Caption, "", "", lblLblregi_codfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e130a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWGEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavRegi_cod_Internalname, "Regi_Cod", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavRegi_cod_Internalname, GXutil.ltrim( localUtil.ntoc( AV16Regi_Cod, (byte)(4), (byte)(0), ",", "")), ((edtavRegi_cod_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Regi_Cod), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV16Regi_Cod), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRegi_cod_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavRegi_cod_Visible, edtavRegi_cod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WWGEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblregi_descripcionfilter_Internalname, lblLblregi_descripcionfilter_Caption, "", "", lblLblregi_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e140a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWGEN_CENTROCOSTO.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavRegi_descripcion_Internalname, AV17Regi_Descripcion, GXutil.rtrim( localUtil.format( AV17Regi_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRegi_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavRegi_descripcion_Visible, edtavRegi_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWGEN_CENTROCOSTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCent_estadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divCent_estadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcent_estadofilter_Internalname, lblLblcent_estadofilter_Caption, "", "", lblLblcent_estadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e150a1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWGEN_CENTROCOSTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCent_estado.getInternalname(), "Cent_Estado", "col-sm-3 FilterComboAttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_69_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCent_estado, cmbavCent_estado.getInternalname(), GXutil.rtrim( AV18Cent_Estado), 1, cmbavCent_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavCent_estado.getVisible(), cmbavCent_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "FilterComboAttribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "", true, "HLP_WWGEN_CENTROCOSTO.htm");
         cmbavCent_estado.setValue( GXutil.rtrim( AV18Cent_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCent_estado.getInternalname(), "Values", cmbavCent_estado.ToJavascriptSource(), true);
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"69\">") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id C.C") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cód C.C") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Nit C.C") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción C.C") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Et Ct") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Entidad ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripcion 2") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificador Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código de la Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Regional") ;
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código del País") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripción del País") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo ") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Dir.Centro de formación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Resolucion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripcion Larga") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Dependencia SIIF") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Creación Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Creación Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Usuario Modifica Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Modifica Centro de Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Auxiliar") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A3Cent_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A120Cent_Nit, (byte)(12), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A4Cent_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A117Cent_EtCt, (byte)(2), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A118Cent_TpoMay);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A121Cent_Descripcion2);
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
            GridColumn.AddObjectProperty("Value", A9Pais_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A11Pais_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A122Cent_Consecutivo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A123Cent_Direccion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A124Cent_Resolucion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A125Cent_DescripcionLarga);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A126Cent_NroDependenciaSIIF, (byte)(10), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A113Cent_UsuarioCrea);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A114Cent_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A115Cent_UsuarioModifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A116Cent_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A119Cent_Auxiliar, (byte)(8), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A526Cent_ConsePlaca, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A683Cent_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV19Update));
            GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavUpdate_Link));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV20Delete));
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
      if ( wbEnd == 69 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_69 = (short)(nGXsfl_69_idx-1) ;
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

   public void start0A2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Centro de costo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0A0( ) ;
   }

   public void ws0A2( )
   {
      start0A2( ) ;
      evt0A2( ) ;
   }

   public void evt0A2( )
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
                           e160A2 ();
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
                           nGXsfl_69_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_69_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_69_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_692( ) ;
                           A1Cent_Id = localUtil.ctol( httpContext.cgiGet( edtCent_Id_Internalname), ",", ".") ;
                           A3Cent_Codigo = httpContext.cgiGet( edtCent_Codigo_Internalname) ;
                           A120Cent_Nit = localUtil.ctol( httpContext.cgiGet( edtCent_Nit_Internalname), ",", ".") ;
                           A4Cent_Descripcion = httpContext.cgiGet( edtCent_Descripcion_Internalname) ;
                           A117Cent_EtCt = (byte)(localUtil.ctol( httpContext.cgiGet( edtCent_EtCt_Internalname), ",", ".")) ;
                           A118Cent_TpoMay = httpContext.cgiGet( edtCent_TpoMay_Internalname) ;
                           A121Cent_Descripcion2 = httpContext.cgiGet( edtCent_Descripcion2_Internalname) ;
                           A2Regi_Id = localUtil.ctol( httpContext.cgiGet( edtRegi_Id_Internalname), ",", ".") ;
                           A12Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRegi_Cod_Internalname), ",", ".")) ;
                           A13Regi_Descripcion = httpContext.cgiGet( edtRegi_Descripcion_Internalname) ;
                           A5Ciud_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtCiud_Codigo_Internalname), ",", ".")) ;
                           A7Ciud_Descripcion = GXutil.upper( httpContext.cgiGet( edtCiud_Descripcion_Internalname)) ;
                           A6Dept_Codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDept_Codigo_Internalname), ",", ".")) ;
                           A10Dept_Descripcion = GXutil.upper( httpContext.cgiGet( edtDept_Descripcion_Internalname)) ;
                           A9Pais_Codigo = httpContext.cgiGet( edtPais_Codigo_Internalname) ;
                           A11Pais_Descripcion = GXutil.upper( httpContext.cgiGet( edtPais_Descripcion_Internalname)) ;
                           A122Cent_Consecutivo = httpContext.cgiGet( edtCent_Consecutivo_Internalname) ;
                           A123Cent_Direccion = httpContext.cgiGet( edtCent_Direccion_Internalname) ;
                           A124Cent_Resolucion = httpContext.cgiGet( edtCent_Resolucion_Internalname) ;
                           A125Cent_DescripcionLarga = httpContext.cgiGet( edtCent_DescripcionLarga_Internalname) ;
                           A126Cent_NroDependenciaSIIF = localUtil.ctol( httpContext.cgiGet( edtCent_NroDependenciaSIIF_Internalname), ",", ".") ;
                           A113Cent_UsuarioCrea = GXutil.upper( httpContext.cgiGet( edtCent_UsuarioCrea_Internalname)) ;
                           A114Cent_FechaCrea = localUtil.ctot( httpContext.cgiGet( edtCent_FechaCrea_Internalname), 0) ;
                           A115Cent_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtCent_UsuarioModifica_Internalname)) ;
                           A116Cent_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtCent_FechaModifica_Internalname), 0) ;
                           A119Cent_Auxiliar = (int)(localUtil.ctol( httpContext.cgiGet( edtCent_Auxiliar_Internalname), ",", ".")) ;
                           A526Cent_ConsePlaca = localUtil.ctol( httpContext.cgiGet( edtCent_ConsePlaca_Internalname), ",", ".") ;
                           cmbCent_Estado.setName( cmbCent_Estado.getInternalname() );
                           cmbCent_Estado.setValue( httpContext.cgiGet( cmbCent_Estado.getInternalname()) );
                           A683Cent_Estado = httpContext.cgiGet( cmbCent_Estado.getInternalname()) ;
                           n683Cent_Estado = false ;
                           AV19Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Update)==0) ? AV25Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Update))), !bGXsfl_69_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Update), true);
                           AV20Delete = httpContext.cgiGet( edtavDelete_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV20Delete)==0) ? AV26Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV20Delete))), !bGXsfl_69_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV20Delete), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e170A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e180A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e190A2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cent_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENT_CODIGO"), AV14Cent_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cent_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENT_DESCRIPCION"), AV15Cent_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Regi_cod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vREGI_COD"), ",", ".") != AV16Regi_Cod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Regi_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vREGI_DESCRIPCION"), AV17Regi_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cent_estado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENT_ESTADO"), AV18Cent_Estado) != 0 )
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

   public void we0A2( )
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

   public void pa0A2( )
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
         cmbavCent_estado.setName( "vCENT_ESTADO" );
         cmbavCent_estado.setWebtags( "" );
         cmbavCent_estado.addItem("", "(Todos)", (short)(0));
         cmbavCent_estado.addItem("A", "Activo", (short)(0));
         cmbavCent_estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbavCent_estado.getItemCount() > 0 )
         {
            AV18Cent_Estado = cmbavCent_estado.getValidValue(AV18Cent_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Cent_Estado", AV18Cent_Estado);
         }
         GXCCtl = "CENT_ESTADO_" + sGXsfl_69_idx ;
         cmbCent_Estado.setName( GXCCtl );
         cmbCent_Estado.setWebtags( "" );
         cmbCent_Estado.addItem("A", "Activo", (short)(0));
         cmbCent_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbCent_Estado.getItemCount() > 0 )
         {
            A683Cent_Estado = cmbCent_Estado.getValidValue(A683Cent_Estado) ;
            n683Cent_Estado = false ;
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
            GX_FocusControl = edtavCent_codigo_Internalname ;
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
      subsflControlProps_692( ) ;
      while ( nGXsfl_69_idx <= nRC_GXsfl_69 )
      {
         sendrow_692( ) ;
         nGXsfl_69_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_69_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_69_idx+1)) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_69_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV14Cent_Codigo ,
                                 String AV15Cent_Descripcion ,
                                 short AV16Regi_Cod ,
                                 String AV17Regi_Descripcion ,
                                 String AV18Cent_Estado ,
                                 String AV19Update ,
                                 String AV20Delete ,
                                 String AV21ADVANCED_LABEL_TEMPLATE ,
                                 String AV24Pgmname ,
                                 long A1Cent_Id )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf0A2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ID", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A3Cent_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CODIGO", A3Cent_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_NIT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A120Cent_Nit), "ZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_NIT", GXutil.ltrim( localUtil.ntoc( A120Cent_Nit, (byte)(12), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4Cent_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_DESCRIPCION", A4Cent_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ETCT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A117Cent_EtCt), "Z9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ETCT", GXutil.ltrim( localUtil.ntoc( A117Cent_EtCt, (byte)(2), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_TPOMAY", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A118Cent_TpoMay, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_TPOMAY", A118Cent_TpoMay);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_DESCRIPCION2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A121Cent_Descripcion2, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_DESCRIPCION2", A121Cent_Descripcion2);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_REGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_ID", GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A122Cent_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CONSECUTIVO", A122Cent_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_DIRECCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A123Cent_Direccion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_DIRECCION", A123Cent_Direccion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_RESOLUCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A124Cent_Resolucion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_RESOLUCION", A124Cent_Resolucion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_DESCRIPCIONLARGA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A125Cent_DescripcionLarga, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_DESCRIPCIONLARGA", A125Cent_DescripcionLarga);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_NRODEPENDENCIASIIF", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A126Cent_NroDependenciaSIIF), "ZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_NRODEPENDENCIASIIF", GXutil.ltrim( localUtil.ntoc( A126Cent_NroDependenciaSIIF, (byte)(10), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_USUARIOCREA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A113Cent_UsuarioCrea, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_USUARIOCREA", A113Cent_UsuarioCrea);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_FECHACREA", getSecureSignedToken( "", localUtil.format( A114Cent_FechaCrea, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_FECHACREA", localUtil.ttoc( A114Cent_FechaCrea, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_USUARIOMODIFICA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A115Cent_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_USUARIOMODIFICA", A115Cent_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_FECHAMODIFICA", getSecureSignedToken( "", localUtil.format( A116Cent_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_FECHAMODIFICA", localUtil.ttoc( A116Cent_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_AUXILIAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A119Cent_Auxiliar), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_AUXILIAR", GXutil.ltrim( localUtil.ntoc( A119Cent_Auxiliar, (byte)(8), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_CONSEPLACA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A526Cent_ConsePlaca), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CONSEPLACA", GXutil.ltrim( localUtil.ntoc( A526Cent_ConsePlaca, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A683Cent_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ESTADO", GXutil.rtrim( A683Cent_Estado));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavCent_estado.getItemCount() > 0 )
      {
         AV18Cent_Estado = cmbavCent_estado.getValidValue(AV18Cent_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Cent_Estado", AV18Cent_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0A2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV24Pgmname = "WWGEN_CENTROCOSTO" ;
      Gx_err = (short)(0) ;
   }

   public void rf0A2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(69) ;
      /* Execute user event: Refresh */
      e180A2 ();
      nGXsfl_69_idx = (short)(1) ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_69_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_692( ) ;
      bGXsfl_69_Refreshing = true ;
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
         subsflControlProps_692( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV14Cent_Codigo ,
                                              new Short(AV16Regi_Cod) ,
                                              AV18Cent_Estado ,
                                              A3Cent_Codigo ,
                                              new Short(A12Regi_Cod) ,
                                              A683Cent_Estado ,
                                              AV15Cent_Descripcion ,
                                              A4Cent_Descripcion ,
                                              AV17Regi_Descripcion ,
                                              A13Regi_Descripcion } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING
                                              }
         } ) ;
         lV14Cent_Codigo = GXutil.concat( GXutil.rtrim( AV14Cent_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Cent_Codigo", AV14Cent_Codigo);
         lV18Cent_Estado = GXutil.padr( GXutil.rtrim( AV18Cent_Estado), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Cent_Estado", AV18Cent_Estado);
         /* Using cursor H000A2 */
         pr_default.execute(0, new Object[] {lV14Cent_Codigo, new Short(AV16Regi_Cod), lV18Cent_Estado});
         nGXsfl_69_idx = (short)(1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_69_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_692( ) ;
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
         {
            A683Cent_Estado = H000A2_A683Cent_Estado[0] ;
            n683Cent_Estado = H000A2_n683Cent_Estado[0] ;
            A526Cent_ConsePlaca = H000A2_A526Cent_ConsePlaca[0] ;
            A119Cent_Auxiliar = H000A2_A119Cent_Auxiliar[0] ;
            A116Cent_FechaModifica = H000A2_A116Cent_FechaModifica[0] ;
            A115Cent_UsuarioModifica = H000A2_A115Cent_UsuarioModifica[0] ;
            A114Cent_FechaCrea = H000A2_A114Cent_FechaCrea[0] ;
            A113Cent_UsuarioCrea = H000A2_A113Cent_UsuarioCrea[0] ;
            A126Cent_NroDependenciaSIIF = H000A2_A126Cent_NroDependenciaSIIF[0] ;
            A125Cent_DescripcionLarga = H000A2_A125Cent_DescripcionLarga[0] ;
            A124Cent_Resolucion = H000A2_A124Cent_Resolucion[0] ;
            A123Cent_Direccion = H000A2_A123Cent_Direccion[0] ;
            A122Cent_Consecutivo = H000A2_A122Cent_Consecutivo[0] ;
            A11Pais_Descripcion = H000A2_A11Pais_Descripcion[0] ;
            A9Pais_Codigo = H000A2_A9Pais_Codigo[0] ;
            A10Dept_Descripcion = H000A2_A10Dept_Descripcion[0] ;
            A6Dept_Codigo = H000A2_A6Dept_Codigo[0] ;
            A7Ciud_Descripcion = H000A2_A7Ciud_Descripcion[0] ;
            A5Ciud_Codigo = H000A2_A5Ciud_Codigo[0] ;
            A13Regi_Descripcion = H000A2_A13Regi_Descripcion[0] ;
            A12Regi_Cod = H000A2_A12Regi_Cod[0] ;
            A2Regi_Id = H000A2_A2Regi_Id[0] ;
            A121Cent_Descripcion2 = H000A2_A121Cent_Descripcion2[0] ;
            A118Cent_TpoMay = H000A2_A118Cent_TpoMay[0] ;
            A117Cent_EtCt = H000A2_A117Cent_EtCt[0] ;
            A4Cent_Descripcion = H000A2_A4Cent_Descripcion[0] ;
            A120Cent_Nit = H000A2_A120Cent_Nit[0] ;
            A3Cent_Codigo = H000A2_A3Cent_Codigo[0] ;
            A1Cent_Id = H000A2_A1Cent_Id[0] ;
            A5Ciud_Codigo = H000A2_A5Ciud_Codigo[0] ;
            A13Regi_Descripcion = H000A2_A13Regi_Descripcion[0] ;
            A12Regi_Cod = H000A2_A12Regi_Cod[0] ;
            A6Dept_Codigo = H000A2_A6Dept_Codigo[0] ;
            A7Ciud_Descripcion = H000A2_A7Ciud_Descripcion[0] ;
            A9Pais_Codigo = H000A2_A9Pais_Codigo[0] ;
            A10Dept_Descripcion = H000A2_A10Dept_Descripcion[0] ;
            A11Pais_Descripcion = H000A2_A11Pais_Descripcion[0] ;
            if ( (GXutil.strcmp("", AV15Cent_Descripcion)==0) || ( GXutil.like( GXutil.upper( A4Cent_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV15Cent_Descripcion), "") , 254 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV17Regi_Descripcion)==0) || ( GXutil.like( GXutil.upper( A13Regi_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV17Regi_Descripcion), "") , 254 , "%"),  ' ' ) ) )
               {
                  e190A2 ();
               }
            }
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(69) ;
         wb0A0( ) ;
      }
      bGXsfl_69_Refreshing = true ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Cent_Codigo, AV15Cent_Descripcion, AV16Regi_Cod, AV17Regi_Descripcion, AV18Cent_Estado, AV19Update, AV20Delete, AV21ADVANCED_LABEL_TEMPLATE, AV24Pgmname, A1Cent_Id) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Cent_Codigo, AV15Cent_Descripcion, AV16Regi_Cod, AV17Regi_Descripcion, AV18Cent_Estado, AV19Update, AV20Delete, AV21ADVANCED_LABEL_TEMPLATE, AV24Pgmname, A1Cent_Id) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Cent_Codigo, AV15Cent_Descripcion, AV16Regi_Cod, AV17Regi_Descripcion, AV18Cent_Estado, AV19Update, AV20Delete, AV21ADVANCED_LABEL_TEMPLATE, AV24Pgmname, A1Cent_Id) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Cent_Codigo, AV15Cent_Descripcion, AV16Regi_Cod, AV17Regi_Descripcion, AV18Cent_Estado, AV19Update, AV20Delete, AV21ADVANCED_LABEL_TEMPLATE, AV24Pgmname, A1Cent_Id) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Cent_Codigo, AV15Cent_Descripcion, AV16Regi_Cod, AV17Regi_Descripcion, AV18Cent_Estado, AV19Update, AV20Delete, AV21ADVANCED_LABEL_TEMPLATE, AV24Pgmname, A1Cent_Id) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup0A0( )
   {
      /* Before Start, stand alone formulas. */
      AV24Pgmname = "WWGEN_CENTROCOSTO" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e170A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14Cent_Codigo = httpContext.cgiGet( edtavCent_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Cent_Codigo", AV14Cent_Codigo);
         AV15Cent_Descripcion = httpContext.cgiGet( edtavCent_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Cent_Descripcion", AV15Cent_Descripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRegi_cod_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRegi_cod_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vREGI_COD");
            GX_FocusControl = edtavRegi_cod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16Regi_Cod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Regi_Cod", GXutil.ltrim( GXutil.str( AV16Regi_Cod, 4, 0)));
         }
         else
         {
            AV16Regi_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtavRegi_cod_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Regi_Cod", GXutil.ltrim( GXutil.str( AV16Regi_Cod, 4, 0)));
         }
         AV17Regi_Descripcion = httpContext.cgiGet( edtavRegi_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Regi_Descripcion", AV17Regi_Descripcion);
         cmbavCent_estado.setName( cmbavCent_estado.getInternalname() );
         cmbavCent_estado.setValue( httpContext.cgiGet( cmbavCent_estado.getInternalname()) );
         AV18Cent_Estado = httpContext.cgiGet( cmbavCent_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Cent_Estado", AV18Cent_Estado);
         /* Read saved values. */
         nRC_GXsfl_69 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_69"), ",", ".")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENT_CODIGO"), AV14Cent_Codigo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENT_DESCRIPCION"), AV15Cent_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vREGI_COD"), ",", ".") != AV16Regi_Cod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vREGI_DESCRIPCION"), AV17Regi_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCENT_ESTADO"), AV18Cent_Estado) != 0 )
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
      e170A2 ();
      if (returnInSub) return;
   }

   public void e170A2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV24Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV24Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      divGridcell_Class = "WWGridCellExpanded" ;
      httpContext.ajax_rsp_assign_prop("", false, divGridcell_Internalname, "Class", divGridcell_Class, true);
      AV19Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Update)==0) ? AV25Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Update))), !bGXsfl_69_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Update), true);
      AV25Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Update)==0) ? AV25Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Update))), !bGXsfl_69_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Update), true);
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_69_Refreshing);
      AV20Delete = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV20Delete)==0) ? AV26Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV20Delete))), !bGXsfl_69_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV20Delete), true);
      AV26Delete_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Bitmap", ((GXutil.strcmp("", AV20Delete)==0) ? AV26Delete_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV20Delete))), !bGXsfl_69_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV20Delete), true);
      edtavDelete_Tooltiptext = "Eliminar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Tooltiptext", edtavDelete_Tooltiptext, !bGXsfl_69_Refreshing);
      AV18Cent_Estado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Cent_Estado", AV18Cent_Estado);
      Form.setCaption( "Centros de costo" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV21ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ADVANCED_LABEL_TEMPLATE", AV21ADVANCED_LABEL_TEMPLATE);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
   }

   public void e180A2( )
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
      if ( (GXutil.strcmp("", AV15Cent_Descripcion)==0) )
      {
         lblLblcent_descripcionfilter_Caption = "Descripción C.C." ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcent_descripcionfilter_Internalname, "Caption", lblLblcent_descripcionfilter_Caption, true);
      }
      else
      {
         lblLblcent_descripcionfilter_Caption = GXutil.format( AV21ADVANCED_LABEL_TEMPLATE, "Descripción C.C.", AV15Cent_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcent_descripcionfilter_Internalname, "Caption", lblLblcent_descripcionfilter_Caption, true);
      }
      if ( (0==AV16Regi_Cod) )
      {
         lblLblregi_codfilter_Caption = "Código Regional" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblregi_codfilter_Internalname, "Caption", lblLblregi_codfilter_Caption, true);
      }
      else
      {
         lblLblregi_codfilter_Caption = GXutil.format( AV21ADVANCED_LABEL_TEMPLATE, "Código Regional", GXutil.ltrim( GXutil.str( AV16Regi_Cod, 4, 0)), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblregi_codfilter_Internalname, "Caption", lblLblregi_codfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV17Regi_Descripcion)==0) )
      {
         lblLblregi_descripcionfilter_Caption = "Descripción Regional" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblregi_descripcionfilter_Internalname, "Caption", lblLblregi_descripcionfilter_Caption, true);
      }
      else
      {
         lblLblregi_descripcionfilter_Caption = GXutil.format( AV21ADVANCED_LABEL_TEMPLATE, "Descripción Regional", AV17Regi_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblregi_descripcionfilter_Internalname, "Caption", lblLblregi_descripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV18Cent_Estado)==0) )
      {
         lblLblcent_estadofilter_Caption = "Estado" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcent_estadofilter_Internalname, "Caption", lblLblcent_estadofilter_Caption, true);
      }
      else
      {
         lblLblcent_estadofilter_Caption = GXutil.format( AV21ADVANCED_LABEL_TEMPLATE, "Estado", AV18Cent_Estado, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcent_estadofilter_Internalname, "Caption", lblLblcent_estadofilter_Caption, true);
      }
   }

   private void e190A2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.gen_centrocosto") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0))) ;
      edtavDelete_Link = formatLink("com.orions2.gen_centrocosto") + "?" + GXutil.URLEncode(GXutil.rtrim("DLT")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A1Cent_Id,11,0))) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(69) ;
      }
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
      {
         sendrow_692( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_69_Refreshing )
      {
         httpContext.doAjaxLoad(69, GridRow);
      }
   }

   public void e160A2( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.gen_centrocosto") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV8HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV9GridState.fromxml(AV7Session.getValue(AV24Pgmname+"GridState"), null, null);
         if ( AV9GridState.getgxTv_SdtGridState_Filtervalues().size() >= 5 )
         {
            AV14Cent_Codigo = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Cent_Codigo", AV14Cent_Codigo);
            AV15Cent_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+2)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Cent_Descripcion", AV15Cent_Descripcion);
            AV16Regi_Cod = (short)(GXutil.lval( ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+3)).getgxTv_SdtGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Regi_Cod", GXutil.ltrim( GXutil.str( AV16Regi_Cod, 4, 0)));
            AV17Regi_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+4)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Regi_Descripcion", AV17Regi_Descripcion);
            AV18Cent_Estado = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+5)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Cent_Estado", AV18Cent_Estado);
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
      AV9GridState.fromxml(AV7Session.getValue(AV24Pgmname+"GridState"), null, null);
      AV9GridState.setgxTv_SdtGridState_Currentpage( (short)(subgrid_currentpage( )) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().clear();
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV14Cent_Codigo );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV15Cent_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( GXutil.str( AV16Regi_Cod, 4, 0) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV17Regi_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV18Cent_Estado );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV7Session.setValue(AV24Pgmname+"GridState", AV9GridState.toxml(false, true, "GridState", "ACBSENA"));
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV12TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV24Pgmname );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV8HTTPRequest.getScriptName()+"?"+AV8HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "GEN_CENTROCOSTO" );
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
      pa0A2( ) ;
      ws0A2( ) ;
      we0A2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414174812");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wwgen_centrocosto.js", "?201861414174812");
      /* End function include_jscripts */
   }

   public void subsflControlProps_692( )
   {
      edtCent_Id_Internalname = "CENT_ID_"+sGXsfl_69_idx ;
      edtCent_Codigo_Internalname = "CENT_CODIGO_"+sGXsfl_69_idx ;
      edtCent_Nit_Internalname = "CENT_NIT_"+sGXsfl_69_idx ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION_"+sGXsfl_69_idx ;
      edtCent_EtCt_Internalname = "CENT_ETCT_"+sGXsfl_69_idx ;
      edtCent_TpoMay_Internalname = "CENT_TPOMAY_"+sGXsfl_69_idx ;
      edtCent_Descripcion2_Internalname = "CENT_DESCRIPCION2_"+sGXsfl_69_idx ;
      edtRegi_Id_Internalname = "REGI_ID_"+sGXsfl_69_idx ;
      edtRegi_Cod_Internalname = "REGI_COD_"+sGXsfl_69_idx ;
      edtRegi_Descripcion_Internalname = "REGI_DESCRIPCION_"+sGXsfl_69_idx ;
      edtCiud_Codigo_Internalname = "CIUD_CODIGO_"+sGXsfl_69_idx ;
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION_"+sGXsfl_69_idx ;
      edtDept_Codigo_Internalname = "DEPT_CODIGO_"+sGXsfl_69_idx ;
      edtDept_Descripcion_Internalname = "DEPT_DESCRIPCION_"+sGXsfl_69_idx ;
      edtPais_Codigo_Internalname = "PAIS_CODIGO_"+sGXsfl_69_idx ;
      edtPais_Descripcion_Internalname = "PAIS_DESCRIPCION_"+sGXsfl_69_idx ;
      edtCent_Consecutivo_Internalname = "CENT_CONSECUTIVO_"+sGXsfl_69_idx ;
      edtCent_Direccion_Internalname = "CENT_DIRECCION_"+sGXsfl_69_idx ;
      edtCent_Resolucion_Internalname = "CENT_RESOLUCION_"+sGXsfl_69_idx ;
      edtCent_DescripcionLarga_Internalname = "CENT_DESCRIPCIONLARGA_"+sGXsfl_69_idx ;
      edtCent_NroDependenciaSIIF_Internalname = "CENT_NRODEPENDENCIASIIF_"+sGXsfl_69_idx ;
      edtCent_UsuarioCrea_Internalname = "CENT_USUARIOCREA_"+sGXsfl_69_idx ;
      edtCent_FechaCrea_Internalname = "CENT_FECHACREA_"+sGXsfl_69_idx ;
      edtCent_UsuarioModifica_Internalname = "CENT_USUARIOMODIFICA_"+sGXsfl_69_idx ;
      edtCent_FechaModifica_Internalname = "CENT_FECHAMODIFICA_"+sGXsfl_69_idx ;
      edtCent_Auxiliar_Internalname = "CENT_AUXILIAR_"+sGXsfl_69_idx ;
      edtCent_ConsePlaca_Internalname = "CENT_CONSEPLACA_"+sGXsfl_69_idx ;
      cmbCent_Estado.setInternalname( "CENT_ESTADO_"+sGXsfl_69_idx );
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_69_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_69_idx ;
   }

   public void subsflControlProps_fel_692( )
   {
      edtCent_Id_Internalname = "CENT_ID_"+sGXsfl_69_fel_idx ;
      edtCent_Codigo_Internalname = "CENT_CODIGO_"+sGXsfl_69_fel_idx ;
      edtCent_Nit_Internalname = "CENT_NIT_"+sGXsfl_69_fel_idx ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION_"+sGXsfl_69_fel_idx ;
      edtCent_EtCt_Internalname = "CENT_ETCT_"+sGXsfl_69_fel_idx ;
      edtCent_TpoMay_Internalname = "CENT_TPOMAY_"+sGXsfl_69_fel_idx ;
      edtCent_Descripcion2_Internalname = "CENT_DESCRIPCION2_"+sGXsfl_69_fel_idx ;
      edtRegi_Id_Internalname = "REGI_ID_"+sGXsfl_69_fel_idx ;
      edtRegi_Cod_Internalname = "REGI_COD_"+sGXsfl_69_fel_idx ;
      edtRegi_Descripcion_Internalname = "REGI_DESCRIPCION_"+sGXsfl_69_fel_idx ;
      edtCiud_Codigo_Internalname = "CIUD_CODIGO_"+sGXsfl_69_fel_idx ;
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION_"+sGXsfl_69_fel_idx ;
      edtDept_Codigo_Internalname = "DEPT_CODIGO_"+sGXsfl_69_fel_idx ;
      edtDept_Descripcion_Internalname = "DEPT_DESCRIPCION_"+sGXsfl_69_fel_idx ;
      edtPais_Codigo_Internalname = "PAIS_CODIGO_"+sGXsfl_69_fel_idx ;
      edtPais_Descripcion_Internalname = "PAIS_DESCRIPCION_"+sGXsfl_69_fel_idx ;
      edtCent_Consecutivo_Internalname = "CENT_CONSECUTIVO_"+sGXsfl_69_fel_idx ;
      edtCent_Direccion_Internalname = "CENT_DIRECCION_"+sGXsfl_69_fel_idx ;
      edtCent_Resolucion_Internalname = "CENT_RESOLUCION_"+sGXsfl_69_fel_idx ;
      edtCent_DescripcionLarga_Internalname = "CENT_DESCRIPCIONLARGA_"+sGXsfl_69_fel_idx ;
      edtCent_NroDependenciaSIIF_Internalname = "CENT_NRODEPENDENCIASIIF_"+sGXsfl_69_fel_idx ;
      edtCent_UsuarioCrea_Internalname = "CENT_USUARIOCREA_"+sGXsfl_69_fel_idx ;
      edtCent_FechaCrea_Internalname = "CENT_FECHACREA_"+sGXsfl_69_fel_idx ;
      edtCent_UsuarioModifica_Internalname = "CENT_USUARIOMODIFICA_"+sGXsfl_69_fel_idx ;
      edtCent_FechaModifica_Internalname = "CENT_FECHAMODIFICA_"+sGXsfl_69_fel_idx ;
      edtCent_Auxiliar_Internalname = "CENT_AUXILIAR_"+sGXsfl_69_fel_idx ;
      edtCent_ConsePlaca_Internalname = "CENT_CONSEPLACA_"+sGXsfl_69_fel_idx ;
      cmbCent_Estado.setInternalname( "CENT_ESTADO_"+sGXsfl_69_fel_idx );
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_69_fel_idx ;
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_69_fel_idx ;
   }

   public void sendrow_692( )
   {
      subsflControlProps_692( ) ;
      wb0A0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_69_idx <= subgrid_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_69_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_69_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Codigo_Internalname,A3Cent_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Nit_Internalname,GXutil.ltrim( localUtil.ntoc( A120Cent_Nit, (byte)(12), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A120Cent_Nit), "ZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Nit_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(12),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Descripcion_Internalname,A4Cent_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_EtCt_Internalname,GXutil.ltrim( localUtil.ntoc( A117Cent_EtCt, (byte)(2), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A117Cent_EtCt), "Z9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_EtCt_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_TpoMay_Internalname,A118Cent_TpoMay,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_TpoMay_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Descripcion2_Internalname,A121Cent_Descripcion2,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Descripcion2_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Cod_Internalname,GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A12Regi_Cod), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Cod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRegi_Descripcion_Internalname,A13Regi_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRegi_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCiud_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A5Ciud_Codigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A5Ciud_Codigo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCiud_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCiud_Descripcion_Internalname,A7Ciud_Descripcion,GXutil.rtrim( localUtil.format( A7Ciud_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCiud_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDept_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A6Dept_Codigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A6Dept_Codigo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDept_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDept_Descripcion_Internalname,A10Dept_Descripcion,GXutil.rtrim( localUtil.format( A10Dept_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDept_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPais_Codigo_Internalname,A9Pais_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPais_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPais_Descripcion_Internalname,A11Pais_Descripcion,GXutil.rtrim( localUtil.format( A11Pais_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPais_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Consecutivo_Internalname,A122Cent_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(5),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Direccion_Internalname,A123Cent_Direccion,"","","'"+""+"'"+",false,"+"'"+""+"'","http://maps.google.com/maps?q="+PrivateUtilities.encodeURL( A123Cent_Direccion),"_blank","","",edtCent_Direccion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1024),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"GeneXus\\Address","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Resolucion_Internalname,A124Cent_Resolucion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Resolucion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_DescripcionLarga_Internalname,A125Cent_DescripcionLarga,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_DescripcionLarga_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_NroDependenciaSIIF_Internalname,GXutil.ltrim( localUtil.ntoc( A126Cent_NroDependenciaSIIF, (byte)(10), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A126Cent_NroDependenciaSIIF), "ZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_NroDependenciaSIIF_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_UsuarioCrea_Internalname,A113Cent_UsuarioCrea,GXutil.rtrim( localUtil.format( A113Cent_UsuarioCrea, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_UsuarioCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_FechaCrea_Internalname,localUtil.ttoc( A114Cent_FechaCrea, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A114Cent_FechaCrea, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_FechaCrea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_UsuarioModifica_Internalname,A115Cent_UsuarioModifica,GXutil.rtrim( localUtil.format( A115Cent_UsuarioModifica, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_FechaModifica_Internalname,localUtil.ttoc( A116Cent_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A116Cent_FechaModifica, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_Auxiliar_Internalname,GXutil.ltrim( localUtil.ntoc( A119Cent_Auxiliar, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A119Cent_Auxiliar), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_Auxiliar_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCent_ConsePlaca_Internalname,GXutil.ltrim( localUtil.ntoc( A526Cent_ConsePlaca, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A526Cent_ConsePlaca), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCent_ConsePlaca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(69),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_69_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "CENT_ESTADO_" + sGXsfl_69_idx ;
            cmbCent_Estado.setName( GXCCtl );
            cmbCent_Estado.setWebtags( "" );
            cmbCent_Estado.addItem("A", "Activo", (short)(0));
            cmbCent_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbCent_Estado.getItemCount() > 0 )
            {
               A683Cent_Estado = cmbCent_Estado.getValidValue(A683Cent_Estado) ;
               n683Cent_Estado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCent_Estado,cmbCent_Estado.getInternalname(),GXutil.rtrim( A683Cent_Estado),new Integer(1),cmbCent_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbCent_Estado.setValue( GXutil.rtrim( A683Cent_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCent_Estado.getInternalname(), "Values", cmbCent_Estado.ToJavascriptSource(), !bGXsfl_69_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV19Update_IsBlob = (boolean)(((GXutil.strcmp("", AV19Update)==0)&&(GXutil.strcmp("", AV25Update_GXI)==0))||!(GXutil.strcmp("", AV19Update)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV19Update)==0) ? AV25Update_GXI : httpContext.getResourceRelative(AV19Update)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,sImgUrl,edtavUpdate_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavUpdate_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV19Update_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "DeleteAttribute" ;
         StyleString = "" ;
         AV20Delete_IsBlob = (boolean)(((GXutil.strcmp("", AV20Delete)==0)&&(GXutil.strcmp("", AV26Delete_GXI)==0))||!(GXutil.strcmp("", AV20Delete)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV20Delete)==0) ? AV26Delete_GXI : httpContext.getResourceRelative(AV20Delete)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,sImgUrl,edtavDelete_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavDelete_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV20Delete_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ID"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, localUtil.format( DecimalUtil.doubleToDec(A1Cent_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_CODIGO"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, GXutil.rtrim( localUtil.format( A3Cent_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_NIT"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, localUtil.format( DecimalUtil.doubleToDec(A120Cent_Nit), "ZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_DESCRIPCION"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, GXutil.rtrim( localUtil.format( A4Cent_Descripcion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ETCT"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, localUtil.format( DecimalUtil.doubleToDec(A117Cent_EtCt), "Z9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_TPOMAY"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, GXutil.rtrim( localUtil.format( A118Cent_TpoMay, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_DESCRIPCION2"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, GXutil.rtrim( localUtil.format( A121Cent_Descripcion2, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_REGI_ID"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, localUtil.format( DecimalUtil.doubleToDec(A2Regi_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_CONSECUTIVO"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, GXutil.rtrim( localUtil.format( A122Cent_Consecutivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_DIRECCION"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, GXutil.rtrim( localUtil.format( A123Cent_Direccion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_RESOLUCION"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, GXutil.rtrim( localUtil.format( A124Cent_Resolucion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_DESCRIPCIONLARGA"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, GXutil.rtrim( localUtil.format( A125Cent_DescripcionLarga, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_NRODEPENDENCIASIIF"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, localUtil.format( DecimalUtil.doubleToDec(A126Cent_NroDependenciaSIIF), "ZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_USUARIOCREA"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, GXutil.rtrim( localUtil.format( A113Cent_UsuarioCrea, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_FECHACREA"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, localUtil.format( A114Cent_FechaCrea, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_USUARIOMODIFICA"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, GXutil.rtrim( localUtil.format( A115Cent_UsuarioModifica, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_FECHAMODIFICA"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, localUtil.format( A116Cent_FechaModifica, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_AUXILIAR"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, localUtil.format( DecimalUtil.doubleToDec(A119Cent_Auxiliar), "ZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_CONSEPLACA"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, localUtil.format( DecimalUtil.doubleToDec(A526Cent_ConsePlaca), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CENT_ESTADO"+"_"+sGXsfl_69_idx, getSecureSignedToken( sGXsfl_69_idx, GXutil.rtrim( localUtil.format( A683Cent_Estado, ""))));
         GridContainer.AddRow(GridRow);
         nGXsfl_69_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_69_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_69_idx+1)) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_69_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_692( ) ;
      }
      /* End function sendrow_692 */
   }

   public void init_default_properties( )
   {
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      lblTitletext_Internalname = "TITLETEXT" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      edtavCent_codigo_Internalname = "vCENT_CODIGO" ;
      divTabletop_Internalname = "TABLETOP" ;
      lblLblcent_descripcionfilter_Internalname = "LBLCENT_DESCRIPCIONFILTER" ;
      edtavCent_descripcion_Internalname = "vCENT_DESCRIPCION" ;
      divCent_descripcionfiltercontainer_Internalname = "CENT_DESCRIPCIONFILTERCONTAINER" ;
      lblLblregi_codfilter_Internalname = "LBLREGI_CODFILTER" ;
      edtavRegi_cod_Internalname = "vREGI_COD" ;
      divRegi_codfiltercontainer_Internalname = "REGI_CODFILTERCONTAINER" ;
      lblLblregi_descripcionfilter_Internalname = "LBLREGI_DESCRIPCIONFILTER" ;
      edtavRegi_descripcion_Internalname = "vREGI_DESCRIPCION" ;
      divRegi_descripcionfiltercontainer_Internalname = "REGI_DESCRIPCIONFILTERCONTAINER" ;
      lblLblcent_estadofilter_Internalname = "LBLCENT_ESTADOFILTER" ;
      cmbavCent_estado.setInternalname( "vCENT_ESTADO" );
      divCent_estadofiltercontainer_Internalname = "CENT_ESTADOFILTERCONTAINER" ;
      divFilterscontainer_Internalname = "FILTERSCONTAINER" ;
      edtCent_Id_Internalname = "CENT_ID" ;
      edtCent_Codigo_Internalname = "CENT_CODIGO" ;
      edtCent_Nit_Internalname = "CENT_NIT" ;
      edtCent_Descripcion_Internalname = "CENT_DESCRIPCION" ;
      edtCent_EtCt_Internalname = "CENT_ETCT" ;
      edtCent_TpoMay_Internalname = "CENT_TPOMAY" ;
      edtCent_Descripcion2_Internalname = "CENT_DESCRIPCION2" ;
      edtRegi_Id_Internalname = "REGI_ID" ;
      edtRegi_Cod_Internalname = "REGI_COD" ;
      edtRegi_Descripcion_Internalname = "REGI_DESCRIPCION" ;
      edtCiud_Codigo_Internalname = "CIUD_CODIGO" ;
      edtCiud_Descripcion_Internalname = "CIUD_DESCRIPCION" ;
      edtDept_Codigo_Internalname = "DEPT_CODIGO" ;
      edtDept_Descripcion_Internalname = "DEPT_DESCRIPCION" ;
      edtPais_Codigo_Internalname = "PAIS_CODIGO" ;
      edtPais_Descripcion_Internalname = "PAIS_DESCRIPCION" ;
      edtCent_Consecutivo_Internalname = "CENT_CONSECUTIVO" ;
      edtCent_Direccion_Internalname = "CENT_DIRECCION" ;
      edtCent_Resolucion_Internalname = "CENT_RESOLUCION" ;
      edtCent_DescripcionLarga_Internalname = "CENT_DESCRIPCIONLARGA" ;
      edtCent_NroDependenciaSIIF_Internalname = "CENT_NRODEPENDENCIASIIF" ;
      edtCent_UsuarioCrea_Internalname = "CENT_USUARIOCREA" ;
      edtCent_FechaCrea_Internalname = "CENT_FECHACREA" ;
      edtCent_UsuarioModifica_Internalname = "CENT_USUARIOMODIFICA" ;
      edtCent_FechaModifica_Internalname = "CENT_FECHAMODIFICA" ;
      edtCent_Auxiliar_Internalname = "CENT_AUXILIAR" ;
      edtCent_ConsePlaca_Internalname = "CENT_CONSEPLACA" ;
      cmbCent_Estado.setInternalname( "CENT_ESTADO" );
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
      cmbCent_Estado.setJsonclick( "" );
      edtCent_ConsePlaca_Jsonclick = "" ;
      edtCent_Auxiliar_Jsonclick = "" ;
      edtCent_FechaModifica_Jsonclick = "" ;
      edtCent_UsuarioModifica_Jsonclick = "" ;
      edtCent_FechaCrea_Jsonclick = "" ;
      edtCent_UsuarioCrea_Jsonclick = "" ;
      edtCent_NroDependenciaSIIF_Jsonclick = "" ;
      edtCent_DescripcionLarga_Jsonclick = "" ;
      edtCent_Resolucion_Jsonclick = "" ;
      edtCent_Direccion_Jsonclick = "" ;
      edtCent_Consecutivo_Jsonclick = "" ;
      edtPais_Descripcion_Jsonclick = "" ;
      edtPais_Codigo_Jsonclick = "" ;
      edtDept_Descripcion_Jsonclick = "" ;
      edtDept_Codigo_Jsonclick = "" ;
      edtCiud_Descripcion_Jsonclick = "" ;
      edtCiud_Codigo_Jsonclick = "" ;
      edtRegi_Descripcion_Jsonclick = "" ;
      edtRegi_Cod_Jsonclick = "" ;
      edtRegi_Id_Jsonclick = "" ;
      edtCent_Descripcion2_Jsonclick = "" ;
      edtCent_TpoMay_Jsonclick = "" ;
      edtCent_EtCt_Jsonclick = "" ;
      edtCent_Descripcion_Jsonclick = "" ;
      edtCent_Nit_Jsonclick = "" ;
      edtCent_Codigo_Jsonclick = "" ;
      edtCent_Id_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDelete_Link = "" ;
      edtavUpdate_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divGridcell_Class = "col-xs-12 col-sm-9 col-md-10 WWGridCell" ;
      cmbavCent_estado.setJsonclick( "" );
      cmbavCent_estado.setEnabled( 1 );
      cmbavCent_estado.setVisible( 1 );
      lblLblcent_estadofilter_Caption = "Estado" ;
      edtavRegi_descripcion_Jsonclick = "" ;
      edtavRegi_descripcion_Enabled = 1 ;
      edtavRegi_descripcion_Visible = 1 ;
      lblLblregi_descripcionfilter_Caption = "Descripción Regional" ;
      edtavRegi_cod_Jsonclick = "" ;
      edtavRegi_cod_Enabled = 1 ;
      edtavRegi_cod_Visible = 1 ;
      lblLblregi_codfilter_Caption = "Código de la Regional" ;
      edtavCent_descripcion_Jsonclick = "" ;
      edtavCent_descripcion_Enabled = 1 ;
      edtavCent_descripcion_Visible = 1 ;
      lblLblcent_descripcionfilter_Caption = "Descripción Centro de Costo" ;
      edtavCent_codigo_Jsonclick = "" ;
      edtavCent_codigo_Enabled = 1 ;
      bttBtntoggle_Class = "HideFiltersButton" ;
      bttBtntoggle_Caption = "Otros Filtros" ;
      divCent_estadofiltercontainer_Class = "AdvancedContainerItem" ;
      divRegi_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divRegi_codfiltercontainer_Class = "AdvancedContainerItem" ;
      divCent_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divFilterscontainer_Class = "AdvancedContainer" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Centro de costo" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV19Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV20Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV21ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV17Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'cmbavCent_estado'},{av:'AV18Cent_Estado',fld:'vCENT_ESTADO',pic:'',nv:''},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLblcent_descripcionfilter_Caption',ctrl:'LBLCENT_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblregi_codfilter_Caption',ctrl:'LBLREGI_CODFILTER',prop:'Caption'},{av:'lblLblregi_descripcionfilter_Caption',ctrl:'LBLREGI_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcent_estadofilter_Caption',ctrl:'LBLCENT_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("'TOGGLE'","{handler:'e110A1',iparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'}],oparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Caption'},{av:'divGridcell_Class',ctrl:'GRIDCELL',prop:'Class'}]}");
      setEventMetadata("LBLCENT_DESCRIPCIONFILTER.CLICK","{handler:'e120A1',iparms:[{av:'divCent_descripcionfiltercontainer_Class',ctrl:'CENT_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCent_descripcionfiltercontainer_Class',ctrl:'CENT_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCent_descripcion_Visible',ctrl:'vCENT_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLREGI_CODFILTER.CLICK","{handler:'e130A1',iparms:[{av:'divRegi_codfiltercontainer_Class',ctrl:'REGI_CODFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRegi_codfiltercontainer_Class',ctrl:'REGI_CODFILTERCONTAINER',prop:'Class'},{av:'edtavRegi_cod_Visible',ctrl:'vREGI_COD',prop:'Visible'}]}");
      setEventMetadata("LBLREGI_DESCRIPCIONFILTER.CLICK","{handler:'e140A1',iparms:[{av:'divRegi_descripcionfiltercontainer_Class',ctrl:'REGI_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divRegi_descripcionfiltercontainer_Class',ctrl:'REGI_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavRegi_descripcion_Visible',ctrl:'vREGI_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLCENT_ESTADOFILTER.CLICK","{handler:'e150A1',iparms:[{av:'divCent_estadofiltercontainer_Class',ctrl:'CENT_ESTADOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCent_estadofiltercontainer_Class',ctrl:'CENT_ESTADOFILTERCONTAINER',prop:'Class'},{av:'cmbavCent_estado'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e190A2',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'},{av:'edtavDelete_Link',ctrl:'vDELETE',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e160A2',iparms:[{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV19Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV20Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV21ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV17Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'cmbavCent_estado'},{av:'AV18Cent_Estado',fld:'vCENT_ESTADO',pic:'',nv:''},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLblcent_descripcionfilter_Caption',ctrl:'LBLCENT_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblregi_codfilter_Caption',ctrl:'LBLREGI_CODFILTER',prop:'Caption'},{av:'lblLblregi_descripcionfilter_Caption',ctrl:'LBLREGI_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcent_estadofilter_Caption',ctrl:'LBLCENT_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV19Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV20Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV21ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV17Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'cmbavCent_estado'},{av:'AV18Cent_Estado',fld:'vCENT_ESTADO',pic:'',nv:''},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLblcent_descripcionfilter_Caption',ctrl:'LBLCENT_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblregi_codfilter_Caption',ctrl:'LBLREGI_CODFILTER',prop:'Caption'},{av:'lblLblregi_descripcionfilter_Caption',ctrl:'LBLREGI_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcent_estadofilter_Caption',ctrl:'LBLCENT_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV19Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV20Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV21ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV17Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'cmbavCent_estado'},{av:'AV18Cent_Estado',fld:'vCENT_ESTADO',pic:'',nv:''},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLblcent_descripcionfilter_Caption',ctrl:'LBLCENT_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblregi_codfilter_Caption',ctrl:'LBLREGI_CODFILTER',prop:'Caption'},{av:'lblLblregi_descripcionfilter_Caption',ctrl:'LBLREGI_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcent_estadofilter_Caption',ctrl:'LBLCENT_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV19Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'AV20Delete',fld:'vDELETE',pic:'',nv:''},{av:'edtavDelete_Tooltiptext',ctrl:'vDELETE',prop:'Tooltiptext'},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Cent_Descripcion',fld:'vCENT_DESCRIPCION',pic:'',nv:''},{av:'AV21ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV17Regi_Descripcion',fld:'vREGI_DESCRIPCION',pic:'',nv:''},{av:'cmbavCent_estado'},{av:'AV18Cent_Estado',fld:'vCENT_ESTADO',pic:'',nv:''},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLblcent_descripcionfilter_Caption',ctrl:'LBLCENT_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblregi_codfilter_Caption',ctrl:'LBLREGI_CODFILTER',prop:'Caption'},{av:'lblLblregi_descripcionfilter_Caption',ctrl:'LBLREGI_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcent_estadofilter_Caption',ctrl:'LBLCENT_ESTADOFILTER',prop:'Caption'}]}");
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
      AV19Update = "" ;
      AV20Delete = "" ;
      AV14Cent_Codigo = "" ;
      AV15Cent_Descripcion = "" ;
      AV17Regi_Descripcion = "" ;
      AV18Cent_Estado = "" ;
      AV21ADVANCED_LABEL_TEMPLATE = "" ;
      AV24Pgmname = "" ;
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
      lblLblcent_descripcionfilter_Jsonclick = "" ;
      lblLblregi_codfilter_Jsonclick = "" ;
      lblLblregi_descripcionfilter_Jsonclick = "" ;
      lblLblcent_estadofilter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      A118Cent_TpoMay = "" ;
      A121Cent_Descripcion2 = "" ;
      A13Regi_Descripcion = "" ;
      A7Ciud_Descripcion = "" ;
      A10Dept_Descripcion = "" ;
      A9Pais_Codigo = "" ;
      A11Pais_Descripcion = "" ;
      A122Cent_Consecutivo = "" ;
      A123Cent_Direccion = "" ;
      A124Cent_Resolucion = "" ;
      A125Cent_DescripcionLarga = "" ;
      A113Cent_UsuarioCrea = "" ;
      A114Cent_FechaCrea = GXutil.resetTime( GXutil.nullDate() );
      A115Cent_UsuarioModifica = "" ;
      A116Cent_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      A683Cent_Estado = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV25Update_GXI = "" ;
      AV26Delete_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV14Cent_Codigo = "" ;
      lV18Cent_Estado = "" ;
      H000A2_A683Cent_Estado = new String[] {""} ;
      H000A2_n683Cent_Estado = new boolean[] {false} ;
      H000A2_A526Cent_ConsePlaca = new long[1] ;
      H000A2_A119Cent_Auxiliar = new int[1] ;
      H000A2_A116Cent_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H000A2_A115Cent_UsuarioModifica = new String[] {""} ;
      H000A2_A114Cent_FechaCrea = new java.util.Date[] {GXutil.nullDate()} ;
      H000A2_A113Cent_UsuarioCrea = new String[] {""} ;
      H000A2_A126Cent_NroDependenciaSIIF = new long[1] ;
      H000A2_A125Cent_DescripcionLarga = new String[] {""} ;
      H000A2_A124Cent_Resolucion = new String[] {""} ;
      H000A2_A123Cent_Direccion = new String[] {""} ;
      H000A2_A122Cent_Consecutivo = new String[] {""} ;
      H000A2_A11Pais_Descripcion = new String[] {""} ;
      H000A2_A9Pais_Codigo = new String[] {""} ;
      H000A2_A10Dept_Descripcion = new String[] {""} ;
      H000A2_A6Dept_Codigo = new short[1] ;
      H000A2_A7Ciud_Descripcion = new String[] {""} ;
      H000A2_A5Ciud_Codigo = new short[1] ;
      H000A2_A13Regi_Descripcion = new String[] {""} ;
      H000A2_A12Regi_Cod = new short[1] ;
      H000A2_A2Regi_Id = new long[1] ;
      H000A2_A121Cent_Descripcion2 = new String[] {""} ;
      H000A2_A118Cent_TpoMay = new String[] {""} ;
      H000A2_A117Cent_EtCt = new byte[1] ;
      H000A2_A4Cent_Descripcion = new String[] {""} ;
      H000A2_A120Cent_Nit = new long[1] ;
      H000A2_A3Cent_Codigo = new String[] {""} ;
      H000A2_A1Cent_Id = new long[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwgen_centrocosto__default(),
         new Object[] {
             new Object[] {
            H000A2_A683Cent_Estado, H000A2_n683Cent_Estado, H000A2_A526Cent_ConsePlaca, H000A2_A119Cent_Auxiliar, H000A2_A116Cent_FechaModifica, H000A2_A115Cent_UsuarioModifica, H000A2_A114Cent_FechaCrea, H000A2_A113Cent_UsuarioCrea, H000A2_A126Cent_NroDependenciaSIIF, H000A2_A125Cent_DescripcionLarga,
            H000A2_A124Cent_Resolucion, H000A2_A123Cent_Direccion, H000A2_A122Cent_Consecutivo, H000A2_A11Pais_Descripcion, H000A2_A9Pais_Codigo, H000A2_A10Dept_Descripcion, H000A2_A6Dept_Codigo, H000A2_A7Ciud_Descripcion, H000A2_A5Ciud_Codigo, H000A2_A13Regi_Descripcion,
            H000A2_A12Regi_Cod, H000A2_A2Regi_Id, H000A2_A121Cent_Descripcion2, H000A2_A118Cent_TpoMay, H000A2_A117Cent_EtCt, H000A2_A4Cent_Descripcion, H000A2_A120Cent_Nit, H000A2_A3Cent_Codigo, H000A2_A1Cent_Id
            }
         }
      );
      AV24Pgmname = "WWGEN_CENTROCOSTO" ;
      /* GeneXus formulas. */
      AV24Pgmname = "WWGEN_CENTROCOSTO" ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID_nEOF ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte A117Cent_EtCt ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private short nRC_GXsfl_69 ;
   private short nGXsfl_69_idx=1 ;
   private short AV16Regi_Cod ;
   private short wbEnd ;
   private short wbStart ;
   private short A12Regi_Cod ;
   private short A5Ciud_Codigo ;
   private short A6Dept_Codigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int edtavCent_codigo_Enabled ;
   private int edtavCent_descripcion_Visible ;
   private int edtavCent_descripcion_Enabled ;
   private int edtavRegi_cod_Enabled ;
   private int edtavRegi_cod_Visible ;
   private int edtavRegi_descripcion_Visible ;
   private int edtavRegi_descripcion_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int A119Cent_Auxiliar ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int AV11GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long A1Cent_Id ;
   private long GRID_nFirstRecordOnPage ;
   private long A120Cent_Nit ;
   private long A2Regi_Id ;
   private long A126Cent_NroDependenciaSIIF ;
   private long A526Cent_ConsePlaca ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String edtavUpdate_Tooltiptext ;
   private String edtavDelete_Tooltiptext ;
   private String divFilterscontainer_Class ;
   private String divCent_descripcionfiltercontainer_Class ;
   private String divRegi_codfiltercontainer_Class ;
   private String divRegi_descripcionfiltercontainer_Class ;
   private String divCent_estadofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_69_idx="0001" ;
   private String edtavUpdate_Internalname ;
   private String edtavDelete_Internalname ;
   private String AV18Cent_Estado ;
   private String AV21ADVANCED_LABEL_TEMPLATE ;
   private String AV24Pgmname ;
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
   private String edtavCent_codigo_Internalname ;
   private String edtavCent_codigo_Jsonclick ;
   private String divFilterscontainer_Internalname ;
   private String divCent_descripcionfiltercontainer_Internalname ;
   private String lblLblcent_descripcionfilter_Internalname ;
   private String lblLblcent_descripcionfilter_Caption ;
   private String lblLblcent_descripcionfilter_Jsonclick ;
   private String edtavCent_descripcion_Internalname ;
   private String edtavCent_descripcion_Jsonclick ;
   private String divRegi_codfiltercontainer_Internalname ;
   private String lblLblregi_codfilter_Internalname ;
   private String lblLblregi_codfilter_Caption ;
   private String lblLblregi_codfilter_Jsonclick ;
   private String edtavRegi_cod_Internalname ;
   private String edtavRegi_cod_Jsonclick ;
   private String divRegi_descripcionfiltercontainer_Internalname ;
   private String lblLblregi_descripcionfilter_Internalname ;
   private String lblLblregi_descripcionfilter_Caption ;
   private String lblLblregi_descripcionfilter_Jsonclick ;
   private String edtavRegi_descripcion_Internalname ;
   private String edtavRegi_descripcion_Jsonclick ;
   private String divCent_estadofiltercontainer_Internalname ;
   private String lblLblcent_estadofilter_Internalname ;
   private String lblLblcent_estadofilter_Caption ;
   private String lblLblcent_estadofilter_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridcell_Class ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String A683Cent_Estado ;
   private String edtavUpdate_Link ;
   private String edtavDelete_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtCent_Id_Internalname ;
   private String edtCent_Codigo_Internalname ;
   private String edtCent_Nit_Internalname ;
   private String edtCent_Descripcion_Internalname ;
   private String edtCent_EtCt_Internalname ;
   private String edtCent_TpoMay_Internalname ;
   private String edtCent_Descripcion2_Internalname ;
   private String edtRegi_Id_Internalname ;
   private String edtRegi_Cod_Internalname ;
   private String edtRegi_Descripcion_Internalname ;
   private String edtCiud_Codigo_Internalname ;
   private String edtCiud_Descripcion_Internalname ;
   private String edtDept_Codigo_Internalname ;
   private String edtDept_Descripcion_Internalname ;
   private String edtPais_Codigo_Internalname ;
   private String edtPais_Descripcion_Internalname ;
   private String edtCent_Consecutivo_Internalname ;
   private String edtCent_Direccion_Internalname ;
   private String edtCent_Resolucion_Internalname ;
   private String edtCent_DescripcionLarga_Internalname ;
   private String edtCent_NroDependenciaSIIF_Internalname ;
   private String edtCent_UsuarioCrea_Internalname ;
   private String edtCent_FechaCrea_Internalname ;
   private String edtCent_UsuarioModifica_Internalname ;
   private String edtCent_FechaModifica_Internalname ;
   private String edtCent_Auxiliar_Internalname ;
   private String edtCent_ConsePlaca_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV18Cent_Estado ;
   private String sGXsfl_69_fel_idx="0001" ;
   private String ROClassString ;
   private String edtCent_Id_Jsonclick ;
   private String edtCent_Codigo_Jsonclick ;
   private String edtCent_Nit_Jsonclick ;
   private String edtCent_Descripcion_Jsonclick ;
   private String edtCent_EtCt_Jsonclick ;
   private String edtCent_TpoMay_Jsonclick ;
   private String edtCent_Descripcion2_Jsonclick ;
   private String edtRegi_Id_Jsonclick ;
   private String edtRegi_Cod_Jsonclick ;
   private String edtRegi_Descripcion_Jsonclick ;
   private String edtCiud_Codigo_Jsonclick ;
   private String edtCiud_Descripcion_Jsonclick ;
   private String edtDept_Codigo_Jsonclick ;
   private String edtDept_Descripcion_Jsonclick ;
   private String edtPais_Codigo_Jsonclick ;
   private String edtPais_Descripcion_Jsonclick ;
   private String edtCent_Consecutivo_Jsonclick ;
   private String edtCent_Direccion_Jsonclick ;
   private String edtCent_Resolucion_Jsonclick ;
   private String edtCent_DescripcionLarga_Jsonclick ;
   private String edtCent_NroDependenciaSIIF_Jsonclick ;
   private String edtCent_UsuarioCrea_Jsonclick ;
   private String edtCent_FechaCrea_Jsonclick ;
   private String edtCent_UsuarioModifica_Jsonclick ;
   private String edtCent_FechaModifica_Jsonclick ;
   private String edtCent_Auxiliar_Jsonclick ;
   private String edtCent_ConsePlaca_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A114Cent_FechaCrea ;
   private java.util.Date A116Cent_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_69_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n683Cent_Estado ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV19Update_IsBlob ;
   private boolean AV20Delete_IsBlob ;
   private String AV14Cent_Codigo ;
   private String AV15Cent_Descripcion ;
   private String AV17Regi_Descripcion ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String A118Cent_TpoMay ;
   private String A121Cent_Descripcion2 ;
   private String A13Regi_Descripcion ;
   private String A7Ciud_Descripcion ;
   private String A10Dept_Descripcion ;
   private String A9Pais_Codigo ;
   private String A11Pais_Descripcion ;
   private String A122Cent_Consecutivo ;
   private String A123Cent_Direccion ;
   private String A124Cent_Resolucion ;
   private String A125Cent_DescripcionLarga ;
   private String A113Cent_UsuarioCrea ;
   private String A115Cent_UsuarioModifica ;
   private String AV25Update_GXI ;
   private String AV26Delete_GXI ;
   private String lV14Cent_Codigo ;
   private String AV19Update ;
   private String AV20Delete ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private HTMLChoice cmbavCent_estado ;
   private HTMLChoice cmbCent_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H000A2_A683Cent_Estado ;
   private boolean[] H000A2_n683Cent_Estado ;
   private long[] H000A2_A526Cent_ConsePlaca ;
   private int[] H000A2_A119Cent_Auxiliar ;
   private java.util.Date[] H000A2_A116Cent_FechaModifica ;
   private String[] H000A2_A115Cent_UsuarioModifica ;
   private java.util.Date[] H000A2_A114Cent_FechaCrea ;
   private String[] H000A2_A113Cent_UsuarioCrea ;
   private long[] H000A2_A126Cent_NroDependenciaSIIF ;
   private String[] H000A2_A125Cent_DescripcionLarga ;
   private String[] H000A2_A124Cent_Resolucion ;
   private String[] H000A2_A123Cent_Direccion ;
   private String[] H000A2_A122Cent_Consecutivo ;
   private String[] H000A2_A11Pais_Descripcion ;
   private String[] H000A2_A9Pais_Codigo ;
   private String[] H000A2_A10Dept_Descripcion ;
   private short[] H000A2_A6Dept_Codigo ;
   private String[] H000A2_A7Ciud_Descripcion ;
   private short[] H000A2_A5Ciud_Codigo ;
   private String[] H000A2_A13Regi_Descripcion ;
   private short[] H000A2_A12Regi_Cod ;
   private long[] H000A2_A2Regi_Id ;
   private String[] H000A2_A121Cent_Descripcion2 ;
   private String[] H000A2_A118Cent_TpoMay ;
   private byte[] H000A2_A117Cent_EtCt ;
   private String[] H000A2_A4Cent_Descripcion ;
   private long[] H000A2_A120Cent_Nit ;
   private String[] H000A2_A3Cent_Codigo ;
   private long[] H000A2_A1Cent_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwgen_centrocosto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H000A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV14Cent_Codigo ,
                                          short AV16Regi_Cod ,
                                          String AV18Cent_Estado ,
                                          String A3Cent_Codigo ,
                                          short A12Regi_Cod ,
                                          String A683Cent_Estado ,
                                          String AV15Cent_Descripcion ,
                                          String A4Cent_Descripcion ,
                                          String AV17Regi_Descripcion ,
                                          String A13Regi_Descripcion )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [3] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      scmdbuf = "SELECT T1.Cent_Estado, T1.Cent_ConsePlaca, T1.Cent_Auxiliar, T1.Cent_FechaModifica," ;
      scmdbuf = scmdbuf + " T1.Cent_UsuarioModifica, T1.Cent_FechaCrea, T1.Cent_UsuarioCrea, T1.Cent_NroDependenciaSIIF," ;
      scmdbuf = scmdbuf + " T1.Cent_DescripcionLarga, T1.Cent_Resolucion, T1.Cent_Direccion, T1.Cent_Consecutivo," ;
      scmdbuf = scmdbuf + " T5.Pais_Descripcion, T4.Pais_Codigo, T4.Dept_Descripcion, T3.Dept_Codigo, T3.Ciud_Descripcion," ;
      scmdbuf = scmdbuf + " T2.Ciud_Codigo, T2.Regi_Descripcion, T2.Regi_Cod, T1.Regi_Id, T1.Cent_Descripcion2," ;
      scmdbuf = scmdbuf + " T1.Cent_TpoMay, T1.Cent_EtCt, T1.Cent_Descripcion, T1.Cent_Nit, T1.Cent_Codigo," ;
      scmdbuf = scmdbuf + " T1.Cent_Id FROM ((((GEN_CENTROCOSTO T1 INNER JOIN GEN_REGIONAL T2 ON T2.Regi_Id" ;
      scmdbuf = scmdbuf + " = T1.Regi_Id) INNER JOIN GEN_CIUDAD T3 ON T3.Ciud_Codigo = T2.Ciud_Codigo) INNER" ;
      scmdbuf = scmdbuf + " JOIN GEN_DEPARTAMENTO T4 ON T4.Dept_Codigo = T3.Dept_Codigo) INNER JOIN GEN_PAIS" ;
      scmdbuf = scmdbuf + " T5 ON T5.Pais_Codigo = T4.Pais_Codigo)" ;
      if ( ! (GXutil.strcmp("", AV14Cent_Codigo)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Cent_Codigo like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Cent_Codigo like ?)" ;
         }
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (0==AV16Regi_Cod) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T2.Regi_Cod = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T2.Regi_Cod = ?)" ;
         }
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18Cent_Estado)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Cent_Estado like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Cent_Estado like ?)" ;
         }
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY T1.Cent_Descripcion" ;
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
                  return conditional_H000A2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H000A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[8])[0] = rslt.getLong(8) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(15) ;
               ((short[]) buf[16])[0] = rslt.getShort(16) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(17) ;
               ((short[]) buf[18])[0] = rslt.getShort(18) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(19) ;
               ((short[]) buf[20])[0] = rslt.getShort(20) ;
               ((long[]) buf[21])[0] = rslt.getLong(21) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(22) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(23) ;
               ((byte[]) buf[24])[0] = rslt.getByte(24) ;
               ((String[]) buf[25])[0] = rslt.getVarchar(25) ;
               ((long[]) buf[26])[0] = rslt.getLong(26) ;
               ((String[]) buf[27])[0] = rslt.getVarchar(27) ;
               ((long[]) buf[28])[0] = rslt.getLong(28) ;
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
                  stmt.setVarchar(sIdx, (String)parms[3], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[4]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 1);
               }
               return;
      }
   }

}

