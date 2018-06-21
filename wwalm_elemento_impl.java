/*
               File: wwalm_elemento_impl
        Description: Work With Elemento
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:40.47
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

public final  class wwalm_elemento_impl extends GXDataArea
{
   public wwalm_elemento_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_elemento_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_elemento_impl.class ));
   }

   public wwalm_elemento_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbElem_Estado = new HTMLChoice();
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
            nRC_GXsfl_75 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_75_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_75_idx = httpContext.GetNextPar( ) ;
            AV20Display = httpContext.GetNextPar( ) ;
            edtavDisplay_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Tooltiptext", edtavDisplay_Tooltiptext, !bGXsfl_75_Refreshing);
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
            AV14Elem_Descripcion = httpContext.GetNextPar( ) ;
            AV15Cata_Descripcion = httpContext.GetNextPar( ) ;
            AV16Clas_Descripcion = httpContext.GetNextPar( ) ;
            AV17FAM_Descripcion = httpContext.GetNextPar( ) ;
            AV18SEG_Descripcion = httpContext.GetNextPar( ) ;
            AV19Tipo_Descripcion = httpContext.GetNextPar( ) ;
            AV20Display = httpContext.GetNextPar( ) ;
            edtavDisplay_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Tooltiptext", edtavDisplay_Tooltiptext, !bGXsfl_75_Refreshing);
            AV21ADVANCED_LABEL_TEMPLATE = httpContext.GetNextPar( ) ;
            AV24Pgmname = httpContext.GetNextPar( ) ;
            A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14Elem_Descripcion, AV15Cata_Descripcion, AV16Clas_Descripcion, AV17FAM_Descripcion, AV18SEG_Descripcion, AV19Tipo_Descripcion, AV20Display, AV21ADVANCED_LABEL_TEMPLATE, AV24Pgmname, A66Elem_Consecutivo) ;
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
      pa4C2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start4C2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414194060");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_elemento") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vELEM_DESCRIPCION", AV14Elem_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCATA_DESCRIPCION", AV15Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLAS_DESCRIPCION", AV16Clas_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vFAM_DESCRIPCION", AV17FAM_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vSEG_DESCRIPCION", AV18SEG_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTIPO_DESCRIPCION", AV19Tipo_Descripcion);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_75", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_75, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vADVANCED_LABEL_TEMPLATE", GXutil.rtrim( AV21ADVANCED_LABEL_TEMPLATE));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV24Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vDISPLAY_Tooltiptext", GXutil.rtrim( edtavDisplay_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FILTERSCONTAINER_Class", GXutil.rtrim( divFilterscontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divCata_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divClas_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FAM_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divFam_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divSeg_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divTipo_descripcionfiltercontainer_Class));
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
         we4C2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt4C2( ) ;
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
      return formatLink("com.orions2.wwalm_elemento")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_ELEMENTO" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Elemento" ;
   }

   public void wb4C0( )
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 75, 2, 0)+","+"null"+");", bttBtntoggle_Caption, bttBtntoggle_Jsonclick, 7, "Hide Filters", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e114c1_client"+"'", TempTags, "", 2, "HLP_WWALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Elementos", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4 col-sm-5 col-sm-push-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavElem_descripcion_Internalname, "Elem_Descripcion", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'" + sGXsfl_75_idx + "',0)\"" ;
         ClassString = "FilterSearchAttribute" ;
         StyleString = "" ;
         ClassString = "FilterSearchAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavElem_descripcion_Internalname, AV14Elem_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,14);\"", (short)(0), 1, edtavElem_descripcion_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, 0, "", "Descripción", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WWALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCata_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCata_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcata_descripcionfilter_Internalname, lblLblcata_descripcionfilter_Caption, "", "", lblLblcata_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e124c1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCata_descripcion_Internalname, "Cata_Descripcion", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_75_idx + "',0)\"" ;
         ClassString = "FilterComboAttribute" ;
         StyleString = "" ;
         ClassString = "FilterComboAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCata_descripcion_Internalname, AV15Cata_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,27);\"", (short)(0), edtavCata_descripcion_Visible, edtavCata_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WWALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divClas_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divClas_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblclas_descripcionfilter_Internalname, lblLblclas_descripcionfilter_Caption, "", "", lblLblclas_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e134c1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavClas_descripcion_Internalname, "Clas_Descripcion", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_75_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavClas_descripcion_Internalname, AV16Clas_Descripcion, GXutil.rtrim( localUtil.format( AV16Clas_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClas_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavClas_descripcion_Visible, edtavClas_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divFam_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divFam_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblfam_descripcionfilter_Internalname, lblLblfam_descripcionfilter_Caption, "", "", lblLblfam_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e144c1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavFam_descripcion_Internalname, "FAM_Descripcion", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_75_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavFam_descripcion_Internalname, AV17FAM_Descripcion, GXutil.rtrim( localUtil.format( AV17FAM_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFam_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavFam_descripcion_Visible, edtavFam_descripcion_Enabled, 0, "text", "", 70, "chr", 1, "row", 70, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divSeg_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divSeg_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblseg_descripcionfilter_Internalname, lblLblseg_descripcionfilter_Caption, "", "", lblLblseg_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e154c1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_ELEMENTO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavSeg_descripcion_Internalname, "SEG_Descripcion", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_75_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavSeg_descripcion_Internalname, AV18SEG_Descripcion, GXutil.rtrim( localUtil.format( AV18SEG_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSeg_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavSeg_descripcion_Visible, edtavSeg_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_ELEMENTO.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltipo_descripcionfilter_Internalname, lblLbltipo_descripcionfilter_Caption, "", "", lblLbltipo_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e164c1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_ELEMENTO.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_75_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTipo_descripcion_Internalname, AV19Tipo_Descripcion, GXutil.rtrim( localUtil.format( AV19Tipo_Descripcion, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipo_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTipo_descripcion_Visible, edtavTipo_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_ELEMENTO.htm");
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"75\">") ;
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
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código del Bien") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción del bien") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código Clase") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Clase") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Familia Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Familia Descripcion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Segmento Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Segmento Descripcion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Descripcion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "UNIDAD MEDIDA CODIGO") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "UNIDAD MEDIDA DESCRIPCION") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Codigo Tipo de Elemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo de Elemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Creacion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Creacion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Modifica") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Modifica") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Vida_Util") ;
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
            GridColumn.AddObjectProperty("Value", A66Elem_Consecutivo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A557Elem_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A37Cata_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A298Cata_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A34Clas_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A291Clas_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A35FAM_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A447FAM_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A75SEG_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A442SEG_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A74TIP_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A435TIP_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A496UNIMED_DES);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A253Tipo_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A558Elem_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A570Elem_UsuarioCreacion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A571Elem_FechaCreacion, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A572Elem_UsuarioModifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A573Elem_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A632Vida_Util, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV20Display));
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
      if ( wbEnd == 75 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_75 = (short)(nGXsfl_75_idx-1) ;
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

   public void start4C2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Elemento", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup4C0( ) ;
   }

   public void ws4C2( )
   {
      start4C2( ) ;
      evt4C2( ) ;
   }

   public void evt4C2( )
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
                           nGXsfl_75_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_75_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_75_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_752( ) ;
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A557Elem_Descripcion = httpContext.cgiGet( edtElem_Descripcion_Internalname) ;
                           A37Cata_Codigo = httpContext.cgiGet( edtCata_Codigo_Internalname) ;
                           A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
                           A34Clas_Codigo = httpContext.cgiGet( edtClas_Codigo_Internalname) ;
                           A291Clas_Descripcion = httpContext.cgiGet( edtClas_Descripcion_Internalname) ;
                           A35FAM_Codigo = httpContext.cgiGet( edtFAM_Codigo_Internalname) ;
                           A447FAM_Descripcion = httpContext.cgiGet( edtFAM_Descripcion_Internalname) ;
                           A75SEG_Codigo = httpContext.cgiGet( edtSEG_Codigo_Internalname) ;
                           A442SEG_Descripcion = httpContext.cgiGet( edtSEG_Descripcion_Internalname) ;
                           A74TIP_Codigo = httpContext.cgiGet( edtTIP_Codigo_Internalname) ;
                           A435TIP_Descripcion = httpContext.cgiGet( edtTIP_Descripcion_Internalname) ;
                           A77UNIMED_COD = (int)(localUtil.ctol( httpContext.cgiGet( edtUNIMED_COD_Internalname), ",", ".")) ;
                           A496UNIMED_DES = httpContext.cgiGet( edtUNIMED_DES_Internalname) ;
                           A33Tipo_Codigo = localUtil.ctol( httpContext.cgiGet( edtTipo_Codigo_Internalname), ",", ".") ;
                           A253Tipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtTipo_Descripcion_Internalname)) ;
                           cmbElem_Estado.setName( cmbElem_Estado.getInternalname() );
                           cmbElem_Estado.setValue( httpContext.cgiGet( cmbElem_Estado.getInternalname()) );
                           A558Elem_Estado = httpContext.cgiGet( cmbElem_Estado.getInternalname()) ;
                           A570Elem_UsuarioCreacion = GXutil.upper( httpContext.cgiGet( edtElem_UsuarioCreacion_Internalname)) ;
                           n570Elem_UsuarioCreacion = false ;
                           A571Elem_FechaCreacion = localUtil.ctot( httpContext.cgiGet( edtElem_FechaCreacion_Internalname), 0) ;
                           n571Elem_FechaCreacion = false ;
                           A572Elem_UsuarioModifica = GXutil.upper( httpContext.cgiGet( edtElem_UsuarioModifica_Internalname)) ;
                           n572Elem_UsuarioModifica = false ;
                           A573Elem_FechaModifica = localUtil.ctot( httpContext.cgiGet( edtElem_FechaModifica_Internalname), 0) ;
                           n573Elem_FechaModifica = false ;
                           A632Vida_Util = (short)(localUtil.ctol( httpContext.cgiGet( edtVida_Util_Internalname), ",", ".")) ;
                           n632Vida_Util = false ;
                           AV20Display = httpContext.cgiGet( edtavDisplay_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Bitmap", ((GXutil.strcmp("", AV20Display)==0) ? AV25Display_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV20Display))), !bGXsfl_75_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV20Display), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e174C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e184C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e194C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Elem_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vELEM_DESCRIPCION"), AV14Elem_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cata_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCATA_DESCRIPCION"), AV15Cata_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clas_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLAS_DESCRIPCION"), AV16Clas_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Fam_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFAM_DESCRIPCION"), AV17FAM_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Seg_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vSEG_DESCRIPCION"), AV18SEG_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tipo_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTIPO_DESCRIPCION"), AV19Tipo_Descripcion) != 0 )
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

   public void we4C2( )
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

   public void pa4C2( )
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
         GXCCtl = "ELEM_ESTADO_" + sGXsfl_75_idx ;
         cmbElem_Estado.setName( GXCCtl );
         cmbElem_Estado.setWebtags( "" );
         cmbElem_Estado.addItem("A", "Activo", (short)(0));
         cmbElem_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbElem_Estado.getItemCount() > 0 )
         {
            A558Elem_Estado = cmbElem_Estado.getValidValue(A558Elem_Estado) ;
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
            GX_FocusControl = edtavElem_descripcion_Internalname ;
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
      subsflControlProps_752( ) ;
      while ( nGXsfl_75_idx <= nRC_GXsfl_75 )
      {
         sendrow_752( ) ;
         nGXsfl_75_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_75_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_75_idx+1)) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_75_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_752( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV14Elem_Descripcion ,
                                 String AV15Cata_Descripcion ,
                                 String AV16Clas_Descripcion ,
                                 String AV17FAM_Descripcion ,
                                 String AV18SEG_Descripcion ,
                                 String AV19Tipo_Descripcion ,
                                 String AV20Display ,
                                 String AV21ADVANCED_LABEL_TEMPLATE ,
                                 String AV24Pgmname ,
                                 String A66Elem_Consecutivo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf4C2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A557Elem_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_DESCRIPCION", A557Elem_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CATA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A37Cata_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_CODIGO", A37Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_UNIMED_COD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A77UNIMED_COD), "ZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "UNIMED_COD", GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A558Elem_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_ESTADO", GXutil.rtrim( A558Elem_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_USUARIOCREACION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A570Elem_UsuarioCreacion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_USUARIOCREACION", A570Elem_UsuarioCreacion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_FECHACREACION", getSecureSignedToken( "", localUtil.format( A571Elem_FechaCreacion, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_FECHACREACION", localUtil.ttoc( A571Elem_FechaCreacion, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_USUARIOMODIFICA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A572Elem_UsuarioModifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_USUARIOMODIFICA", A572Elem_UsuarioModifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_FECHAMODIFICA", getSecureSignedToken( "", localUtil.format( A573Elem_FechaModifica, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_FECHAMODIFICA", localUtil.ttoc( A573Elem_FechaModifica, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VIDA_UTIL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A632Vida_Util), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VIDA_UTIL", GXutil.ltrim( localUtil.ntoc( A632Vida_Util, (byte)(4), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf4C2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV24Pgmname = "WWALM_ELEMENTO" ;
      Gx_err = (short)(0) ;
   }

   public void rf4C2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(75) ;
      /* Execute user event: Refresh */
      e184C2 ();
      nGXsfl_75_idx = (short)(1) ;
      sGXsfl_75_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_75_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_752( ) ;
      bGXsfl_75_Refreshing = true ;
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
         subsflControlProps_752( ) ;
         /* Using cursor H004C2 */
         pr_default.execute(0);
         nGXsfl_75_idx = (short)(1) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_75_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_752( ) ;
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
         {
            A632Vida_Util = H004C2_A632Vida_Util[0] ;
            n632Vida_Util = H004C2_n632Vida_Util[0] ;
            A573Elem_FechaModifica = H004C2_A573Elem_FechaModifica[0] ;
            n573Elem_FechaModifica = H004C2_n573Elem_FechaModifica[0] ;
            A572Elem_UsuarioModifica = H004C2_A572Elem_UsuarioModifica[0] ;
            n572Elem_UsuarioModifica = H004C2_n572Elem_UsuarioModifica[0] ;
            A571Elem_FechaCreacion = H004C2_A571Elem_FechaCreacion[0] ;
            n571Elem_FechaCreacion = H004C2_n571Elem_FechaCreacion[0] ;
            A570Elem_UsuarioCreacion = H004C2_A570Elem_UsuarioCreacion[0] ;
            n570Elem_UsuarioCreacion = H004C2_n570Elem_UsuarioCreacion[0] ;
            A558Elem_Estado = H004C2_A558Elem_Estado[0] ;
            A253Tipo_Descripcion = H004C2_A253Tipo_Descripcion[0] ;
            A33Tipo_Codigo = H004C2_A33Tipo_Codigo[0] ;
            A496UNIMED_DES = H004C2_A496UNIMED_DES[0] ;
            A77UNIMED_COD = H004C2_A77UNIMED_COD[0] ;
            A435TIP_Descripcion = H004C2_A435TIP_Descripcion[0] ;
            A74TIP_Codigo = H004C2_A74TIP_Codigo[0] ;
            A442SEG_Descripcion = H004C2_A442SEG_Descripcion[0] ;
            A75SEG_Codigo = H004C2_A75SEG_Codigo[0] ;
            A447FAM_Descripcion = H004C2_A447FAM_Descripcion[0] ;
            A35FAM_Codigo = H004C2_A35FAM_Codigo[0] ;
            A291Clas_Descripcion = H004C2_A291Clas_Descripcion[0] ;
            A34Clas_Codigo = H004C2_A34Clas_Codigo[0] ;
            A298Cata_Descripcion = H004C2_A298Cata_Descripcion[0] ;
            A37Cata_Codigo = H004C2_A37Cata_Codigo[0] ;
            A557Elem_Descripcion = H004C2_A557Elem_Descripcion[0] ;
            A66Elem_Consecutivo = H004C2_A66Elem_Consecutivo[0] ;
            A253Tipo_Descripcion = H004C2_A253Tipo_Descripcion[0] ;
            A496UNIMED_DES = H004C2_A496UNIMED_DES[0] ;
            A34Clas_Codigo = H004C2_A34Clas_Codigo[0] ;
            A298Cata_Descripcion = H004C2_A298Cata_Descripcion[0] ;
            A35FAM_Codigo = H004C2_A35FAM_Codigo[0] ;
            A291Clas_Descripcion = H004C2_A291Clas_Descripcion[0] ;
            A75SEG_Codigo = H004C2_A75SEG_Codigo[0] ;
            A447FAM_Descripcion = H004C2_A447FAM_Descripcion[0] ;
            A74TIP_Codigo = H004C2_A74TIP_Codigo[0] ;
            A442SEG_Descripcion = H004C2_A442SEG_Descripcion[0] ;
            A435TIP_Descripcion = H004C2_A435TIP_Descripcion[0] ;
            if ( (GXutil.strcmp("", AV14Elem_Descripcion)==0) || ( GXutil.like( GXutil.upper( A557Elem_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV14Elem_Descripcion), "") , 254 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV15Cata_Descripcion)==0) || ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV15Cata_Descripcion), "") , 254 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV16Clas_Descripcion)==0) || ( GXutil.like( GXutil.upper( A291Clas_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV16Clas_Descripcion), "") , 254 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV17FAM_Descripcion)==0) || ( GXutil.like( GXutil.upper( A447FAM_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV17FAM_Descripcion), "") , 254 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV18SEG_Descripcion)==0) || ( GXutil.like( GXutil.upper( A442SEG_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV18SEG_Descripcion), "") , 254 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV19Tipo_Descripcion)==0) || ( GXutil.like( GXutil.upper( A253Tipo_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19Tipo_Descripcion), "") , 254 , "%"),  ' ' ) ) )
                           {
                              e194C2 ();
                           }
                        }
                     }
                  }
               }
            }
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(75) ;
         wb4C0( ) ;
      }
      bGXsfl_75_Refreshing = true ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Elem_Descripcion, AV15Cata_Descripcion, AV16Clas_Descripcion, AV17FAM_Descripcion, AV18SEG_Descripcion, AV19Tipo_Descripcion, AV20Display, AV21ADVANCED_LABEL_TEMPLATE, AV24Pgmname, A66Elem_Consecutivo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Elem_Descripcion, AV15Cata_Descripcion, AV16Clas_Descripcion, AV17FAM_Descripcion, AV18SEG_Descripcion, AV19Tipo_Descripcion, AV20Display, AV21ADVANCED_LABEL_TEMPLATE, AV24Pgmname, A66Elem_Consecutivo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Elem_Descripcion, AV15Cata_Descripcion, AV16Clas_Descripcion, AV17FAM_Descripcion, AV18SEG_Descripcion, AV19Tipo_Descripcion, AV20Display, AV21ADVANCED_LABEL_TEMPLATE, AV24Pgmname, A66Elem_Consecutivo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Elem_Descripcion, AV15Cata_Descripcion, AV16Clas_Descripcion, AV17FAM_Descripcion, AV18SEG_Descripcion, AV19Tipo_Descripcion, AV20Display, AV21ADVANCED_LABEL_TEMPLATE, AV24Pgmname, A66Elem_Consecutivo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Elem_Descripcion, AV15Cata_Descripcion, AV16Clas_Descripcion, AV17FAM_Descripcion, AV18SEG_Descripcion, AV19Tipo_Descripcion, AV20Display, AV21ADVANCED_LABEL_TEMPLATE, AV24Pgmname, A66Elem_Consecutivo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup4C0( )
   {
      /* Before Start, stand alone formulas. */
      AV24Pgmname = "WWALM_ELEMENTO" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e174C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14Elem_Descripcion = httpContext.cgiGet( edtavElem_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Elem_Descripcion", AV14Elem_Descripcion);
         AV15Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCata_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Cata_Descripcion", AV15Cata_Descripcion);
         AV16Clas_Descripcion = httpContext.cgiGet( edtavClas_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Clas_Descripcion", AV16Clas_Descripcion);
         AV17FAM_Descripcion = httpContext.cgiGet( edtavFam_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17FAM_Descripcion", AV17FAM_Descripcion);
         AV18SEG_Descripcion = httpContext.cgiGet( edtavSeg_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18SEG_Descripcion", AV18SEG_Descripcion);
         AV19Tipo_Descripcion = GXutil.upper( httpContext.cgiGet( edtavTipo_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Tipo_Descripcion", AV19Tipo_Descripcion);
         /* Read saved values. */
         nRC_GXsfl_75 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_75"), ",", ".")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vELEM_DESCRIPCION"), AV14Elem_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCATA_DESCRIPCION"), AV15Cata_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLAS_DESCRIPCION"), AV16Clas_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFAM_DESCRIPCION"), AV17FAM_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vSEG_DESCRIPCION"), AV18SEG_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTIPO_DESCRIPCION"), AV19Tipo_Descripcion) != 0 )
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
      e174C2 ();
      if (returnInSub) return;
   }

   public void e174C2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV24Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV24Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV20Display = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Bitmap", ((GXutil.strcmp("", AV20Display)==0) ? AV25Display_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV20Display))), !bGXsfl_75_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV20Display), true);
      AV25Display_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Bitmap", ((GXutil.strcmp("", AV20Display)==0) ? AV25Display_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV20Display))), !bGXsfl_75_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV20Display), true);
      edtavDisplay_Tooltiptext = "Visualizar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Tooltiptext", edtavDisplay_Tooltiptext, !bGXsfl_75_Refreshing);
      Form.setCaption( "Elementos" );
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

   public void e184C2( )
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
      if ( (GXutil.strcmp("", AV15Cata_Descripcion)==0) )
      {
         lblLblcata_descripcionfilter_Caption = "Descripción del bien" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcata_descripcionfilter_Internalname, "Caption", lblLblcata_descripcionfilter_Caption, true);
      }
      else
      {
         lblLblcata_descripcionfilter_Caption = GXutil.format( AV21ADVANCED_LABEL_TEMPLATE, "Descripción del bien", AV15Cata_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcata_descripcionfilter_Internalname, "Caption", lblLblcata_descripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV16Clas_Descripcion)==0) )
      {
         lblLblclas_descripcionfilter_Caption = "Descripción Clase" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblclas_descripcionfilter_Internalname, "Caption", lblLblclas_descripcionfilter_Caption, true);
      }
      else
      {
         lblLblclas_descripcionfilter_Caption = GXutil.format( AV21ADVANCED_LABEL_TEMPLATE, "Descripción Clase", AV16Clas_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblclas_descripcionfilter_Internalname, "Caption", lblLblclas_descripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV17FAM_Descripcion)==0) )
      {
         lblLblfam_descripcionfilter_Caption = "Familia Descripcion" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblfam_descripcionfilter_Internalname, "Caption", lblLblfam_descripcionfilter_Caption, true);
      }
      else
      {
         lblLblfam_descripcionfilter_Caption = GXutil.format( AV21ADVANCED_LABEL_TEMPLATE, "Familia Descripcion", AV17FAM_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblfam_descripcionfilter_Internalname, "Caption", lblLblfam_descripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV18SEG_Descripcion)==0) )
      {
         lblLblseg_descripcionfilter_Caption = "Segmento Descripcion" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblseg_descripcionfilter_Internalname, "Caption", lblLblseg_descripcionfilter_Caption, true);
      }
      else
      {
         lblLblseg_descripcionfilter_Caption = GXutil.format( AV21ADVANCED_LABEL_TEMPLATE, "Segmento Descripcion", AV18SEG_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblseg_descripcionfilter_Internalname, "Caption", lblLblseg_descripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV19Tipo_Descripcion)==0) )
      {
         lblLbltipo_descripcionfilter_Caption = "Tipo de Elemento" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltipo_descripcionfilter_Internalname, "Caption", lblLbltipo_descripcionfilter_Caption, true);
      }
      else
      {
         lblLbltipo_descripcionfilter_Caption = GXutil.format( AV21ADVANCED_LABEL_TEMPLATE, "Tipo de Elemento", AV19Tipo_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltipo_descripcionfilter_Internalname, "Caption", lblLbltipo_descripcionfilter_Caption, true);
      }
   }

   private void e194C2( )
   {
      /* Grid_Load Routine */
      edtavDisplay_Link = formatLink("com.orions2.alm_elemento") + "?" + GXutil.URLEncode(GXutil.rtrim("DSP")) + "," + GXutil.URLEncode(GXutil.rtrim(A66Elem_Consecutivo)) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(75) ;
      }
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
      {
         sendrow_752( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_75_Refreshing )
      {
         httpContext.doAjaxLoad(75, GridRow);
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV8HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV9GridState.fromxml(AV7Session.getValue(AV24Pgmname+"GridState"), null, null);
         if ( AV9GridState.getgxTv_SdtGridState_Filtervalues().size() >= 6 )
         {
            AV14Elem_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Elem_Descripcion", AV14Elem_Descripcion);
            AV15Cata_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+2)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Cata_Descripcion", AV15Cata_Descripcion);
            AV16Clas_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+3)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Clas_Descripcion", AV16Clas_Descripcion);
            AV17FAM_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+4)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17FAM_Descripcion", AV17FAM_Descripcion);
            AV18SEG_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+5)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18SEG_Descripcion", AV18SEG_Descripcion);
            AV19Tipo_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+6)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Tipo_Descripcion", AV19Tipo_Descripcion);
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
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV14Elem_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV15Cata_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV16Clas_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV17FAM_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV18SEG_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV19Tipo_Descripcion );
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
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_ELEMENTO" );
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
      pa4C2( ) ;
      ws4C2( ) ;
      we4C2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414194277");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wwalm_elemento.js", "?201861414194277");
      /* End function include_jscripts */
   }

   public void subsflControlProps_752( )
   {
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_75_idx ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION_"+sGXsfl_75_idx ;
      edtCata_Codigo_Internalname = "CATA_CODIGO_"+sGXsfl_75_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_75_idx ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO_"+sGXsfl_75_idx ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION_"+sGXsfl_75_idx ;
      edtFAM_Codigo_Internalname = "FAM_CODIGO_"+sGXsfl_75_idx ;
      edtFAM_Descripcion_Internalname = "FAM_DESCRIPCION_"+sGXsfl_75_idx ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO_"+sGXsfl_75_idx ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION_"+sGXsfl_75_idx ;
      edtTIP_Codigo_Internalname = "TIP_CODIGO_"+sGXsfl_75_idx ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION_"+sGXsfl_75_idx ;
      edtUNIMED_COD_Internalname = "UNIMED_COD_"+sGXsfl_75_idx ;
      edtUNIMED_DES_Internalname = "UNIMED_DES_"+sGXsfl_75_idx ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO_"+sGXsfl_75_idx ;
      edtTipo_Descripcion_Internalname = "TIPO_DESCRIPCION_"+sGXsfl_75_idx ;
      cmbElem_Estado.setInternalname( "ELEM_ESTADO_"+sGXsfl_75_idx );
      edtElem_UsuarioCreacion_Internalname = "ELEM_USUARIOCREACION_"+sGXsfl_75_idx ;
      edtElem_FechaCreacion_Internalname = "ELEM_FECHACREACION_"+sGXsfl_75_idx ;
      edtElem_UsuarioModifica_Internalname = "ELEM_USUARIOMODIFICA_"+sGXsfl_75_idx ;
      edtElem_FechaModifica_Internalname = "ELEM_FECHAMODIFICA_"+sGXsfl_75_idx ;
      edtVida_Util_Internalname = "VIDA_UTIL_"+sGXsfl_75_idx ;
      edtavDisplay_Internalname = "vDISPLAY_"+sGXsfl_75_idx ;
   }

   public void subsflControlProps_fel_752( )
   {
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_75_fel_idx ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION_"+sGXsfl_75_fel_idx ;
      edtCata_Codigo_Internalname = "CATA_CODIGO_"+sGXsfl_75_fel_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_75_fel_idx ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO_"+sGXsfl_75_fel_idx ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION_"+sGXsfl_75_fel_idx ;
      edtFAM_Codigo_Internalname = "FAM_CODIGO_"+sGXsfl_75_fel_idx ;
      edtFAM_Descripcion_Internalname = "FAM_DESCRIPCION_"+sGXsfl_75_fel_idx ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO_"+sGXsfl_75_fel_idx ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION_"+sGXsfl_75_fel_idx ;
      edtTIP_Codigo_Internalname = "TIP_CODIGO_"+sGXsfl_75_fel_idx ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION_"+sGXsfl_75_fel_idx ;
      edtUNIMED_COD_Internalname = "UNIMED_COD_"+sGXsfl_75_fel_idx ;
      edtUNIMED_DES_Internalname = "UNIMED_DES_"+sGXsfl_75_fel_idx ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO_"+sGXsfl_75_fel_idx ;
      edtTipo_Descripcion_Internalname = "TIPO_DESCRIPCION_"+sGXsfl_75_fel_idx ;
      cmbElem_Estado.setInternalname( "ELEM_ESTADO_"+sGXsfl_75_fel_idx );
      edtElem_UsuarioCreacion_Internalname = "ELEM_USUARIOCREACION_"+sGXsfl_75_fel_idx ;
      edtElem_FechaCreacion_Internalname = "ELEM_FECHACREACION_"+sGXsfl_75_fel_idx ;
      edtElem_UsuarioModifica_Internalname = "ELEM_USUARIOMODIFICA_"+sGXsfl_75_fel_idx ;
      edtElem_FechaModifica_Internalname = "ELEM_FECHAMODIFICA_"+sGXsfl_75_fel_idx ;
      edtVida_Util_Internalname = "VIDA_UTIL_"+sGXsfl_75_fel_idx ;
      edtavDisplay_Internalname = "vDISPLAY_"+sGXsfl_75_fel_idx ;
   }

   public void sendrow_752( )
   {
      subsflControlProps_752( ) ;
      wb4C0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_75_idx <= subgrid_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_75_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_75_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Descripcion_Internalname,A557Elem_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2000),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Codigo_Internalname,A37Cata_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCata_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Descripcion_Internalname,A298Cata_Descripcion,GXutil.rtrim( localUtil.format( A298Cata_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCata_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClas_Codigo_Internalname,A34Clas_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClas_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClas_Descripcion_Internalname,A291Clas_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClas_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(150),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFAM_Codigo_Internalname,A35FAM_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFAM_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(5),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFAM_Descripcion_Internalname,A447FAM_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFAM_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(70),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSEG_Codigo_Internalname,A75SEG_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSEG_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSEG_Descripcion_Internalname,A442SEG_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSEG_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTIP_Codigo_Internalname,A74TIP_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTIP_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTIP_Descripcion_Internalname,A435TIP_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTIP_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUNIMED_COD_Internalname,GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A77UNIMED_COD), "ZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUNIMED_COD_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(6),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUNIMED_DES_Internalname,A496UNIMED_DES,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUNIMED_DES_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipo_Codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipo_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipo_Descripcion_Internalname,A253Tipo_Descripcion,GXutil.rtrim( localUtil.format( A253Tipo_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipo_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_75_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ELEM_ESTADO_" + sGXsfl_75_idx ;
            cmbElem_Estado.setName( GXCCtl );
            cmbElem_Estado.setWebtags( "" );
            cmbElem_Estado.addItem("A", "Activo", (short)(0));
            cmbElem_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbElem_Estado.getItemCount() > 0 )
            {
               A558Elem_Estado = cmbElem_Estado.getValidValue(A558Elem_Estado) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbElem_Estado,cmbElem_Estado.getInternalname(),GXutil.rtrim( A558Elem_Estado),new Integer(1),cmbElem_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbElem_Estado.setValue( GXutil.rtrim( A558Elem_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbElem_Estado.getInternalname(), "Values", cmbElem_Estado.ToJavascriptSource(), !bGXsfl_75_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_UsuarioCreacion_Internalname,A570Elem_UsuarioCreacion,GXutil.rtrim( localUtil.format( A570Elem_UsuarioCreacion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_UsuarioCreacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_FechaCreacion_Internalname,localUtil.ttoc( A571Elem_FechaCreacion, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A571Elem_FechaCreacion, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_FechaCreacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_UsuarioModifica_Internalname,A572Elem_UsuarioModifica,GXutil.rtrim( localUtil.format( A572Elem_UsuarioModifica, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_UsuarioModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_FechaModifica_Internalname,localUtil.ttoc( A573Elem_FechaModifica, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A573Elem_FechaModifica, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_FechaModifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVida_Util_Internalname,GXutil.ltrim( localUtil.ntoc( A632Vida_Util, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A632Vida_Util), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVida_Util_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(75),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "DisplayAttribute" ;
         StyleString = "" ;
         AV20Display_IsBlob = (boolean)(((GXutil.strcmp("", AV20Display)==0)&&(GXutil.strcmp("", AV25Display_GXI)==0))||!(GXutil.strcmp("", AV20Display)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV20Display)==0) ? AV25Display_GXI : httpContext.getResourceRelative(AV20Display)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDisplay_Internalname,sImgUrl,edtavDisplay_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavDisplay_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV20Display_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO"+"_"+sGXsfl_75_idx, getSecureSignedToken( sGXsfl_75_idx, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_DESCRIPCION"+"_"+sGXsfl_75_idx, getSecureSignedToken( sGXsfl_75_idx, GXutil.rtrim( localUtil.format( A557Elem_Descripcion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CATA_CODIGO"+"_"+sGXsfl_75_idx, getSecureSignedToken( sGXsfl_75_idx, GXutil.rtrim( localUtil.format( A37Cata_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_UNIMED_COD"+"_"+sGXsfl_75_idx, getSecureSignedToken( sGXsfl_75_idx, localUtil.format( DecimalUtil.doubleToDec(A77UNIMED_COD), "ZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPO_CODIGO"+"_"+sGXsfl_75_idx, getSecureSignedToken( sGXsfl_75_idx, localUtil.format( DecimalUtil.doubleToDec(A33Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_ESTADO"+"_"+sGXsfl_75_idx, getSecureSignedToken( sGXsfl_75_idx, GXutil.rtrim( localUtil.format( A558Elem_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_USUARIOCREACION"+"_"+sGXsfl_75_idx, getSecureSignedToken( sGXsfl_75_idx, GXutil.rtrim( localUtil.format( A570Elem_UsuarioCreacion, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_FECHACREACION"+"_"+sGXsfl_75_idx, getSecureSignedToken( sGXsfl_75_idx, localUtil.format( A571Elem_FechaCreacion, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_USUARIOMODIFICA"+"_"+sGXsfl_75_idx, getSecureSignedToken( sGXsfl_75_idx, GXutil.rtrim( localUtil.format( A572Elem_UsuarioModifica, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_FECHAMODIFICA"+"_"+sGXsfl_75_idx, getSecureSignedToken( sGXsfl_75_idx, localUtil.format( A573Elem_FechaModifica, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VIDA_UTIL"+"_"+sGXsfl_75_idx, getSecureSignedToken( sGXsfl_75_idx, localUtil.format( DecimalUtil.doubleToDec(A632Vida_Util), "ZZZ9")));
         GridContainer.AddRow(GridRow);
         nGXsfl_75_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_75_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_75_idx+1)) ;
         sGXsfl_75_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_75_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_752( ) ;
      }
      /* End function sendrow_752 */
   }

   public void init_default_properties( )
   {
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      lblTitletext_Internalname = "TITLETEXT" ;
      edtavElem_descripcion_Internalname = "vELEM_DESCRIPCION" ;
      divTabletop_Internalname = "TABLETOP" ;
      lblLblcata_descripcionfilter_Internalname = "LBLCATA_DESCRIPCIONFILTER" ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION" ;
      divCata_descripcionfiltercontainer_Internalname = "CATA_DESCRIPCIONFILTERCONTAINER" ;
      lblLblclas_descripcionfilter_Internalname = "LBLCLAS_DESCRIPCIONFILTER" ;
      edtavClas_descripcion_Internalname = "vCLAS_DESCRIPCION" ;
      divClas_descripcionfiltercontainer_Internalname = "CLAS_DESCRIPCIONFILTERCONTAINER" ;
      lblLblfam_descripcionfilter_Internalname = "LBLFAM_DESCRIPCIONFILTER" ;
      edtavFam_descripcion_Internalname = "vFAM_DESCRIPCION" ;
      divFam_descripcionfiltercontainer_Internalname = "FAM_DESCRIPCIONFILTERCONTAINER" ;
      lblLblseg_descripcionfilter_Internalname = "LBLSEG_DESCRIPCIONFILTER" ;
      edtavSeg_descripcion_Internalname = "vSEG_DESCRIPCION" ;
      divSeg_descripcionfiltercontainer_Internalname = "SEG_DESCRIPCIONFILTERCONTAINER" ;
      lblLbltipo_descripcionfilter_Internalname = "LBLTIPO_DESCRIPCIONFILTER" ;
      edtavTipo_descripcion_Internalname = "vTIPO_DESCRIPCION" ;
      divTipo_descripcionfiltercontainer_Internalname = "TIPO_DESCRIPCIONFILTERCONTAINER" ;
      divFilterscontainer_Internalname = "FILTERSCONTAINER" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtElem_Descripcion_Internalname = "ELEM_DESCRIPCION" ;
      edtCata_Codigo_Internalname = "CATA_CODIGO" ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION" ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO" ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION" ;
      edtFAM_Codigo_Internalname = "FAM_CODIGO" ;
      edtFAM_Descripcion_Internalname = "FAM_DESCRIPCION" ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO" ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION" ;
      edtTIP_Codigo_Internalname = "TIP_CODIGO" ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION" ;
      edtUNIMED_COD_Internalname = "UNIMED_COD" ;
      edtUNIMED_DES_Internalname = "UNIMED_DES" ;
      edtTipo_Codigo_Internalname = "TIPO_CODIGO" ;
      edtTipo_Descripcion_Internalname = "TIPO_DESCRIPCION" ;
      cmbElem_Estado.setInternalname( "ELEM_ESTADO" );
      edtElem_UsuarioCreacion_Internalname = "ELEM_USUARIOCREACION" ;
      edtElem_FechaCreacion_Internalname = "ELEM_FECHACREACION" ;
      edtElem_UsuarioModifica_Internalname = "ELEM_USUARIOMODIFICA" ;
      edtElem_FechaModifica_Internalname = "ELEM_FECHAMODIFICA" ;
      edtVida_Util_Internalname = "VIDA_UTIL" ;
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
      edtVida_Util_Jsonclick = "" ;
      edtElem_FechaModifica_Jsonclick = "" ;
      edtElem_UsuarioModifica_Jsonclick = "" ;
      edtElem_FechaCreacion_Jsonclick = "" ;
      edtElem_UsuarioCreacion_Jsonclick = "" ;
      cmbElem_Estado.setJsonclick( "" );
      edtTipo_Descripcion_Jsonclick = "" ;
      edtTipo_Codigo_Jsonclick = "" ;
      edtUNIMED_DES_Jsonclick = "" ;
      edtUNIMED_COD_Jsonclick = "" ;
      edtTIP_Descripcion_Jsonclick = "" ;
      edtTIP_Codigo_Jsonclick = "" ;
      edtSEG_Descripcion_Jsonclick = "" ;
      edtSEG_Codigo_Jsonclick = "" ;
      edtFAM_Descripcion_Jsonclick = "" ;
      edtFAM_Codigo_Jsonclick = "" ;
      edtClas_Descripcion_Jsonclick = "" ;
      edtClas_Codigo_Jsonclick = "" ;
      edtCata_Descripcion_Jsonclick = "" ;
      edtCata_Codigo_Jsonclick = "" ;
      edtElem_Descripcion_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDisplay_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divGridcell_Class = "col-xs-12 col-sm-9 col-md-10 WWGridCell" ;
      edtavTipo_descripcion_Jsonclick = "" ;
      edtavTipo_descripcion_Enabled = 1 ;
      edtavTipo_descripcion_Visible = 1 ;
      lblLbltipo_descripcionfilter_Caption = "Tipo de Elemento" ;
      edtavSeg_descripcion_Jsonclick = "" ;
      edtavSeg_descripcion_Enabled = 1 ;
      edtavSeg_descripcion_Visible = 1 ;
      lblLblseg_descripcionfilter_Caption = "Segmento Descripcion" ;
      edtavFam_descripcion_Jsonclick = "" ;
      edtavFam_descripcion_Enabled = 1 ;
      edtavFam_descripcion_Visible = 1 ;
      lblLblfam_descripcionfilter_Caption = "Familia Descripcion" ;
      edtavClas_descripcion_Jsonclick = "" ;
      edtavClas_descripcion_Enabled = 1 ;
      edtavClas_descripcion_Visible = 1 ;
      lblLblclas_descripcionfilter_Caption = "Descripción Clase" ;
      edtavCata_descripcion_Enabled = 1 ;
      edtavCata_descripcion_Visible = 1 ;
      lblLblcata_descripcionfilter_Caption = "Descripción del bien" ;
      edtavElem_descripcion_Enabled = 1 ;
      bttBtntoggle_Class = "HideFiltersButton" ;
      bttBtntoggle_Caption = "Hide Filters" ;
      divTipo_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divSeg_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divFam_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divClas_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divCata_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divFilterscontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Elemento" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV20Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'AV15Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV21ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Clas_Descripcion',fld:'vCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV17FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''},{av:'AV18SEG_Descripcion',fld:'vSEG_DESCRIPCION',pic:'',nv:''},{av:'AV19Tipo_Descripcion',fld:'vTIPO_DESCRIPCION',pic:'@!',nv:''},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLblcata_descripcionfilter_Caption',ctrl:'LBLCATA_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblclas_descripcionfilter_Caption',ctrl:'LBLCLAS_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblfam_descripcionfilter_Caption',ctrl:'LBLFAM_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblseg_descripcionfilter_Caption',ctrl:'LBLSEG_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltipo_descripcionfilter_Caption',ctrl:'LBLTIPO_DESCRIPCIONFILTER',prop:'Caption'}]}");
      setEventMetadata("'TOGGLE'","{handler:'e114C1',iparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'}],oparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Caption'},{av:'divGridcell_Class',ctrl:'GRIDCELL',prop:'Class'}]}");
      setEventMetadata("LBLCATA_DESCRIPCIONFILTER.CLICK","{handler:'e124C1',iparms:[{av:'divCata_descripcionfiltercontainer_Class',ctrl:'CATA_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCata_descripcionfiltercontainer_Class',ctrl:'CATA_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCata_descripcion_Visible',ctrl:'vCATA_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLCLAS_DESCRIPCIONFILTER.CLICK","{handler:'e134C1',iparms:[{av:'divClas_descripcionfiltercontainer_Class',ctrl:'CLAS_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divClas_descripcionfiltercontainer_Class',ctrl:'CLAS_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavClas_descripcion_Visible',ctrl:'vCLAS_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLFAM_DESCRIPCIONFILTER.CLICK","{handler:'e144C1',iparms:[{av:'divFam_descripcionfiltercontainer_Class',ctrl:'FAM_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divFam_descripcionfiltercontainer_Class',ctrl:'FAM_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavFam_descripcion_Visible',ctrl:'vFAM_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLSEG_DESCRIPCIONFILTER.CLICK","{handler:'e154C1',iparms:[{av:'divSeg_descripcionfiltercontainer_Class',ctrl:'SEG_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divSeg_descripcionfiltercontainer_Class',ctrl:'SEG_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavSeg_descripcion_Visible',ctrl:'vSEG_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLTIPO_DESCRIPCIONFILTER.CLICK","{handler:'e164C1',iparms:[{av:'divTipo_descripcionfiltercontainer_Class',ctrl:'TIPO_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTipo_descripcionfiltercontainer_Class',ctrl:'TIPO_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavTipo_descripcion_Visible',ctrl:'vTIPO_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e194C2',iparms:[{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''}],oparms:[{av:'edtavDisplay_Link',ctrl:'vDISPLAY',prop:'Link'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV20Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'AV15Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV21ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Clas_Descripcion',fld:'vCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV17FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''},{av:'AV18SEG_Descripcion',fld:'vSEG_DESCRIPCION',pic:'',nv:''},{av:'AV19Tipo_Descripcion',fld:'vTIPO_DESCRIPCION',pic:'@!',nv:''},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLblcata_descripcionfilter_Caption',ctrl:'LBLCATA_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblclas_descripcionfilter_Caption',ctrl:'LBLCLAS_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblfam_descripcionfilter_Caption',ctrl:'LBLFAM_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblseg_descripcionfilter_Caption',ctrl:'LBLSEG_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltipo_descripcionfilter_Caption',ctrl:'LBLTIPO_DESCRIPCIONFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV20Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'AV15Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV21ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Clas_Descripcion',fld:'vCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV17FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''},{av:'AV18SEG_Descripcion',fld:'vSEG_DESCRIPCION',pic:'',nv:''},{av:'AV19Tipo_Descripcion',fld:'vTIPO_DESCRIPCION',pic:'@!',nv:''},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLblcata_descripcionfilter_Caption',ctrl:'LBLCATA_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblclas_descripcionfilter_Caption',ctrl:'LBLCLAS_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblfam_descripcionfilter_Caption',ctrl:'LBLFAM_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblseg_descripcionfilter_Caption',ctrl:'LBLSEG_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltipo_descripcionfilter_Caption',ctrl:'LBLTIPO_DESCRIPCIONFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV20Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'AV15Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV21ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Clas_Descripcion',fld:'vCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV17FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''},{av:'AV18SEG_Descripcion',fld:'vSEG_DESCRIPCION',pic:'',nv:''},{av:'AV19Tipo_Descripcion',fld:'vTIPO_DESCRIPCION',pic:'@!',nv:''},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLblcata_descripcionfilter_Caption',ctrl:'LBLCATA_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblclas_descripcionfilter_Caption',ctrl:'LBLCLAS_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblfam_descripcionfilter_Caption',ctrl:'LBLFAM_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblseg_descripcionfilter_Caption',ctrl:'LBLSEG_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltipo_descripcionfilter_Caption',ctrl:'LBLTIPO_DESCRIPCIONFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV20Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',hsh:true,nv:''},{av:'AV15Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV21ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Clas_Descripcion',fld:'vCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV17FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''},{av:'AV18SEG_Descripcion',fld:'vSEG_DESCRIPCION',pic:'',nv:''},{av:'AV19Tipo_Descripcion',fld:'vTIPO_DESCRIPCION',pic:'@!',nv:''},{av:'AV24Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Elem_Descripcion',fld:'vELEM_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'lblLblcata_descripcionfilter_Caption',ctrl:'LBLCATA_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblclas_descripcionfilter_Caption',ctrl:'LBLCLAS_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblfam_descripcionfilter_Caption',ctrl:'LBLFAM_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblseg_descripcionfilter_Caption',ctrl:'LBLSEG_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltipo_descripcionfilter_Caption',ctrl:'LBLTIPO_DESCRIPCIONFILTER',prop:'Caption'}]}");
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
      AV20Display = "" ;
      AV14Elem_Descripcion = "" ;
      AV15Cata_Descripcion = "" ;
      AV16Clas_Descripcion = "" ;
      AV17FAM_Descripcion = "" ;
      AV18SEG_Descripcion = "" ;
      AV19Tipo_Descripcion = "" ;
      AV21ADVANCED_LABEL_TEMPLATE = "" ;
      AV24Pgmname = "" ;
      A66Elem_Consecutivo = "" ;
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
      lblLblcata_descripcionfilter_Jsonclick = "" ;
      lblLblclas_descripcionfilter_Jsonclick = "" ;
      lblLblfam_descripcionfilter_Jsonclick = "" ;
      lblLblseg_descripcionfilter_Jsonclick = "" ;
      lblLbltipo_descripcionfilter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A557Elem_Descripcion = "" ;
      A37Cata_Codigo = "" ;
      A298Cata_Descripcion = "" ;
      A34Clas_Codigo = "" ;
      A291Clas_Descripcion = "" ;
      A35FAM_Codigo = "" ;
      A447FAM_Descripcion = "" ;
      A75SEG_Codigo = "" ;
      A442SEG_Descripcion = "" ;
      A74TIP_Codigo = "" ;
      A435TIP_Descripcion = "" ;
      A496UNIMED_DES = "" ;
      A253Tipo_Descripcion = "" ;
      A558Elem_Estado = "" ;
      A570Elem_UsuarioCreacion = "" ;
      A571Elem_FechaCreacion = GXutil.resetTime( GXutil.nullDate() );
      A572Elem_UsuarioModifica = "" ;
      A573Elem_FechaModifica = GXutil.resetTime( GXutil.nullDate() );
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV25Display_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      H004C2_A632Vida_Util = new short[1] ;
      H004C2_n632Vida_Util = new boolean[] {false} ;
      H004C2_A573Elem_FechaModifica = new java.util.Date[] {GXutil.nullDate()} ;
      H004C2_n573Elem_FechaModifica = new boolean[] {false} ;
      H004C2_A572Elem_UsuarioModifica = new String[] {""} ;
      H004C2_n572Elem_UsuarioModifica = new boolean[] {false} ;
      H004C2_A571Elem_FechaCreacion = new java.util.Date[] {GXutil.nullDate()} ;
      H004C2_n571Elem_FechaCreacion = new boolean[] {false} ;
      H004C2_A570Elem_UsuarioCreacion = new String[] {""} ;
      H004C2_n570Elem_UsuarioCreacion = new boolean[] {false} ;
      H004C2_A558Elem_Estado = new String[] {""} ;
      H004C2_A253Tipo_Descripcion = new String[] {""} ;
      H004C2_A33Tipo_Codigo = new long[1] ;
      H004C2_A496UNIMED_DES = new String[] {""} ;
      H004C2_A77UNIMED_COD = new int[1] ;
      H004C2_A435TIP_Descripcion = new String[] {""} ;
      H004C2_A74TIP_Codigo = new String[] {""} ;
      H004C2_A442SEG_Descripcion = new String[] {""} ;
      H004C2_A75SEG_Codigo = new String[] {""} ;
      H004C2_A447FAM_Descripcion = new String[] {""} ;
      H004C2_A35FAM_Codigo = new String[] {""} ;
      H004C2_A291Clas_Descripcion = new String[] {""} ;
      H004C2_A34Clas_Codigo = new String[] {""} ;
      H004C2_A298Cata_Descripcion = new String[] {""} ;
      H004C2_A37Cata_Codigo = new String[] {""} ;
      H004C2_A557Elem_Descripcion = new String[] {""} ;
      H004C2_A66Elem_Consecutivo = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_elemento__default(),
         new Object[] {
             new Object[] {
            H004C2_A632Vida_Util, H004C2_n632Vida_Util, H004C2_A573Elem_FechaModifica, H004C2_n573Elem_FechaModifica, H004C2_A572Elem_UsuarioModifica, H004C2_n572Elem_UsuarioModifica, H004C2_A571Elem_FechaCreacion, H004C2_n571Elem_FechaCreacion, H004C2_A570Elem_UsuarioCreacion, H004C2_n570Elem_UsuarioCreacion,
            H004C2_A558Elem_Estado, H004C2_A253Tipo_Descripcion, H004C2_A33Tipo_Codigo, H004C2_A496UNIMED_DES, H004C2_A77UNIMED_COD, H004C2_A435TIP_Descripcion, H004C2_A74TIP_Codigo, H004C2_A442SEG_Descripcion, H004C2_A75SEG_Codigo, H004C2_A447FAM_Descripcion,
            H004C2_A35FAM_Codigo, H004C2_A291Clas_Descripcion, H004C2_A34Clas_Codigo, H004C2_A298Cata_Descripcion, H004C2_A37Cata_Codigo, H004C2_A557Elem_Descripcion, H004C2_A66Elem_Consecutivo
            }
         }
      );
      AV24Pgmname = "WWALM_ELEMENTO" ;
      /* GeneXus formulas. */
      AV24Pgmname = "WWALM_ELEMENTO" ;
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
   private short nRC_GXsfl_75 ;
   private short nGXsfl_75_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A632Vida_Util ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int edtavElem_descripcion_Enabled ;
   private int edtavCata_descripcion_Visible ;
   private int edtavCata_descripcion_Enabled ;
   private int edtavClas_descripcion_Visible ;
   private int edtavClas_descripcion_Enabled ;
   private int edtavFam_descripcion_Visible ;
   private int edtavFam_descripcion_Enabled ;
   private int edtavSeg_descripcion_Visible ;
   private int edtavSeg_descripcion_Enabled ;
   private int edtavTipo_descripcion_Visible ;
   private int edtavTipo_descripcion_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int A77UNIMED_COD ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int AV11GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A33Tipo_Codigo ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String edtavDisplay_Tooltiptext ;
   private String divFilterscontainer_Class ;
   private String divCata_descripcionfiltercontainer_Class ;
   private String divClas_descripcionfiltercontainer_Class ;
   private String divFam_descripcionfiltercontainer_Class ;
   private String divSeg_descripcionfiltercontainer_Class ;
   private String divTipo_descripcionfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_75_idx="0001" ;
   private String edtavDisplay_Internalname ;
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
   private String edtavElem_descripcion_Internalname ;
   private String divFilterscontainer_Internalname ;
   private String divCata_descripcionfiltercontainer_Internalname ;
   private String lblLblcata_descripcionfilter_Internalname ;
   private String lblLblcata_descripcionfilter_Caption ;
   private String lblLblcata_descripcionfilter_Jsonclick ;
   private String edtavCata_descripcion_Internalname ;
   private String divClas_descripcionfiltercontainer_Internalname ;
   private String lblLblclas_descripcionfilter_Internalname ;
   private String lblLblclas_descripcionfilter_Caption ;
   private String lblLblclas_descripcionfilter_Jsonclick ;
   private String edtavClas_descripcion_Internalname ;
   private String edtavClas_descripcion_Jsonclick ;
   private String divFam_descripcionfiltercontainer_Internalname ;
   private String lblLblfam_descripcionfilter_Internalname ;
   private String lblLblfam_descripcionfilter_Caption ;
   private String lblLblfam_descripcionfilter_Jsonclick ;
   private String edtavFam_descripcion_Internalname ;
   private String edtavFam_descripcion_Jsonclick ;
   private String divSeg_descripcionfiltercontainer_Internalname ;
   private String lblLblseg_descripcionfilter_Internalname ;
   private String lblLblseg_descripcionfilter_Caption ;
   private String lblLblseg_descripcionfilter_Jsonclick ;
   private String edtavSeg_descripcion_Internalname ;
   private String edtavSeg_descripcion_Jsonclick ;
   private String divTipo_descripcionfiltercontainer_Internalname ;
   private String lblLbltipo_descripcionfilter_Internalname ;
   private String lblLbltipo_descripcionfilter_Caption ;
   private String lblLbltipo_descripcionfilter_Jsonclick ;
   private String edtavTipo_descripcion_Internalname ;
   private String edtavTipo_descripcion_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridcell_Class ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String A558Elem_Estado ;
   private String edtavDisplay_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtElem_Descripcion_Internalname ;
   private String edtCata_Codigo_Internalname ;
   private String edtCata_Descripcion_Internalname ;
   private String edtClas_Codigo_Internalname ;
   private String edtClas_Descripcion_Internalname ;
   private String edtFAM_Codigo_Internalname ;
   private String edtFAM_Descripcion_Internalname ;
   private String edtSEG_Codigo_Internalname ;
   private String edtSEG_Descripcion_Internalname ;
   private String edtTIP_Codigo_Internalname ;
   private String edtTIP_Descripcion_Internalname ;
   private String edtUNIMED_COD_Internalname ;
   private String edtUNIMED_DES_Internalname ;
   private String edtTipo_Codigo_Internalname ;
   private String edtTipo_Descripcion_Internalname ;
   private String edtElem_UsuarioCreacion_Internalname ;
   private String edtElem_FechaCreacion_Internalname ;
   private String edtElem_UsuarioModifica_Internalname ;
   private String edtElem_FechaModifica_Internalname ;
   private String edtVida_Util_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String sGXsfl_75_fel_idx="0001" ;
   private String ROClassString ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtElem_Descripcion_Jsonclick ;
   private String edtCata_Codigo_Jsonclick ;
   private String edtCata_Descripcion_Jsonclick ;
   private String edtClas_Codigo_Jsonclick ;
   private String edtClas_Descripcion_Jsonclick ;
   private String edtFAM_Codigo_Jsonclick ;
   private String edtFAM_Descripcion_Jsonclick ;
   private String edtSEG_Codigo_Jsonclick ;
   private String edtSEG_Descripcion_Jsonclick ;
   private String edtTIP_Codigo_Jsonclick ;
   private String edtTIP_Descripcion_Jsonclick ;
   private String edtUNIMED_COD_Jsonclick ;
   private String edtUNIMED_DES_Jsonclick ;
   private String edtTipo_Codigo_Jsonclick ;
   private String edtTipo_Descripcion_Jsonclick ;
   private String edtElem_UsuarioCreacion_Jsonclick ;
   private String edtElem_FechaCreacion_Jsonclick ;
   private String edtElem_UsuarioModifica_Jsonclick ;
   private String edtElem_FechaModifica_Jsonclick ;
   private String edtVida_Util_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A571Elem_FechaCreacion ;
   private java.util.Date A573Elem_FechaModifica ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_75_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n570Elem_UsuarioCreacion ;
   private boolean n571Elem_FechaCreacion ;
   private boolean n572Elem_UsuarioModifica ;
   private boolean n573Elem_FechaModifica ;
   private boolean n632Vida_Util ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV20Display_IsBlob ;
   private String AV14Elem_Descripcion ;
   private String AV15Cata_Descripcion ;
   private String AV16Clas_Descripcion ;
   private String AV17FAM_Descripcion ;
   private String AV18SEG_Descripcion ;
   private String AV19Tipo_Descripcion ;
   private String A66Elem_Consecutivo ;
   private String A557Elem_Descripcion ;
   private String A37Cata_Codigo ;
   private String A298Cata_Descripcion ;
   private String A34Clas_Codigo ;
   private String A291Clas_Descripcion ;
   private String A35FAM_Codigo ;
   private String A447FAM_Descripcion ;
   private String A75SEG_Codigo ;
   private String A442SEG_Descripcion ;
   private String A74TIP_Codigo ;
   private String A435TIP_Descripcion ;
   private String A496UNIMED_DES ;
   private String A253Tipo_Descripcion ;
   private String A570Elem_UsuarioCreacion ;
   private String A572Elem_UsuarioModifica ;
   private String AV25Display_GXI ;
   private String AV20Display ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private HTMLChoice cmbElem_Estado ;
   private IDataStoreProvider pr_default ;
   private short[] H004C2_A632Vida_Util ;
   private boolean[] H004C2_n632Vida_Util ;
   private java.util.Date[] H004C2_A573Elem_FechaModifica ;
   private boolean[] H004C2_n573Elem_FechaModifica ;
   private String[] H004C2_A572Elem_UsuarioModifica ;
   private boolean[] H004C2_n572Elem_UsuarioModifica ;
   private java.util.Date[] H004C2_A571Elem_FechaCreacion ;
   private boolean[] H004C2_n571Elem_FechaCreacion ;
   private String[] H004C2_A570Elem_UsuarioCreacion ;
   private boolean[] H004C2_n570Elem_UsuarioCreacion ;
   private String[] H004C2_A558Elem_Estado ;
   private String[] H004C2_A253Tipo_Descripcion ;
   private long[] H004C2_A33Tipo_Codigo ;
   private String[] H004C2_A496UNIMED_DES ;
   private int[] H004C2_A77UNIMED_COD ;
   private String[] H004C2_A435TIP_Descripcion ;
   private String[] H004C2_A74TIP_Codigo ;
   private String[] H004C2_A442SEG_Descripcion ;
   private String[] H004C2_A75SEG_Codigo ;
   private String[] H004C2_A447FAM_Descripcion ;
   private String[] H004C2_A35FAM_Codigo ;
   private String[] H004C2_A291Clas_Descripcion ;
   private String[] H004C2_A34Clas_Codigo ;
   private String[] H004C2_A298Cata_Descripcion ;
   private String[] H004C2_A37Cata_Codigo ;
   private String[] H004C2_A557Elem_Descripcion ;
   private String[] H004C2_A66Elem_Consecutivo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwalm_elemento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H004C2", "SELECT T1.Vida_Util, T1.Elem_FechaModifica, T1.Elem_UsuarioModifica, T1.Elem_FechaCreacion, T1.Elem_UsuarioCreacion, T1.Elem_Estado, T2.Tipo_Descripcion, T1.Tipo_Codigo, T3.UNIMED_DES, T1.UNIMED_COD, T8.TIP_Descripcion, T7.TIP_Codigo, T7.SEG_Descripcion, T6.SEG_Codigo, T6.FAM_Descripcion, T5.FAM_Codigo, T5.Clas_Descripcion, T4.Clas_Codigo, T4.Cata_Descripcion, T1.Cata_Codigo, T1.Elem_Descripcion, T1.Elem_Consecutivo FROM (((((((ALM_ELEMENTO T1 INNER JOIN ALM_TIPO_ELEMENTO T2 ON T2.Tipo_Codigo = T1.Tipo_Codigo) INNER JOIN ALM_UNIDAD_MEDIDA T3 ON T3.UNIMED_COD = T1.UNIMED_COD) INNER JOIN ALM_CATALOGO T4 ON T4.Cata_Codigo = T1.Cata_Codigo) INNER JOIN ALM_CLASE T5 ON T5.Clas_Codigo = T4.Clas_Codigo) INNER JOIN ALM_CAT_FAM T6 ON T6.FAM_Codigo = T5.FAM_Codigo) INNER JOIN ALM_CAT_SEG T7 ON T7.SEG_Codigo = T6.SEG_Codigo) INNER JOIN ALM_CAT_TIP T8 ON T8.TIP_Codigo = T7.TIP_Codigo) ORDER BY T1.Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 1) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((long[]) buf[12])[0] = rslt.getLong(8) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((int[]) buf[14])[0] = rslt.getInt(10) ;
               ((String[]) buf[15])[0] = rslt.getVarchar(11) ;
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(13) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(14) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(15) ;
               ((String[]) buf[20])[0] = rslt.getVarchar(16) ;
               ((String[]) buf[21])[0] = rslt.getVarchar(17) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[23])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[24])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[25])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[26])[0] = rslt.getVarchar(22) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

