/*
               File: wwalm_clase_impl
        Description: Work With Clase
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:44.98
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

public final  class wwalm_clase_impl extends GXDataArea
{
   public wwalm_clase_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_clase_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_clase_impl.class ));
   }

   public wwalm_clase_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
            nRC_GXsfl_65 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_65_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_65_idx = httpContext.GetNextPar( ) ;
            AV19Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_65_Refreshing);
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
            AV14Clas_Codigo = httpContext.GetNextPar( ) ;
            AV15Clas_Descripcion = httpContext.GetNextPar( ) ;
            AV16FAM_Descripcion = httpContext.GetNextPar( ) ;
            AV17SEG_Descripcion = httpContext.GetNextPar( ) ;
            AV18TIP_Descripcion = httpContext.GetNextPar( ) ;
            AV19Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_65_Refreshing);
            AV20ADVANCED_LABEL_TEMPLATE = httpContext.GetNextPar( ) ;
            AV23Pgmname = httpContext.GetNextPar( ) ;
            A34Clas_Codigo = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14Clas_Codigo, AV15Clas_Descripcion, AV16FAM_Descripcion, AV17SEG_Descripcion, AV18TIP_Descripcion, AV19Update, AV20ADVANCED_LABEL_TEMPLATE, AV23Pgmname, A34Clas_Codigo) ;
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
      pa4K2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start4K2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141419456");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_clase") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLAS_CODIGO", AV14Clas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLAS_DESCRIPCION", AV15Clas_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vFAM_DESCRIPCION", AV16FAM_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vSEG_DESCRIPCION", AV17SEG_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTIP_DESCRIPCION", AV18TIP_Descripcion);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_65, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vADVANCED_LABEL_TEMPLATE", GXutil.rtrim( AV20ADVANCED_LABEL_TEMPLATE));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV23Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FILTERSCONTAINER_Class", GXutil.rtrim( divFilterscontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divClas_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FAM_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divFam_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divSeg_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIP_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divTip_descripcionfiltercontainer_Class));
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
         we4K2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt4K2( ) ;
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
      return formatLink("com.orions2.wwalm_clase")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_CLASE" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Clase" ;
   }

   public void wb4K0( )
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 65, 2, 0)+","+"null"+");", bttBtntoggle_Caption, bttBtntoggle_Jsonclick, 7, "Otros Filtros", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e114k1_client"+"'", TempTags, "", 2, "HLP_WWALM_CLASE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Lista de Clases", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_CLASE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4 col-sm-5 col-sm-push-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavClas_codigo_Internalname, "Clas_Codigo", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavClas_codigo_Internalname, AV14Clas_Codigo, GXutil.rtrim( localUtil.format( AV14Clas_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,14);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Código Clase", edtavClas_codigo_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavClas_codigo_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divClas_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divClas_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblclas_descripcionfilter_Internalname, lblLblclas_descripcionfilter_Caption, "", "", lblLblclas_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e124k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_CLASE.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavClas_descripcion_Internalname, AV15Clas_Descripcion, GXutil.rtrim( localUtil.format( AV15Clas_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClas_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavClas_descripcion_Visible, edtavClas_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblfam_descripcionfilter_Internalname, lblLblfam_descripcionfilter_Caption, "", "", lblLblfam_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e134k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_CLASE.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavFam_descripcion_Internalname, AV16FAM_Descripcion, GXutil.rtrim( localUtil.format( AV16FAM_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFam_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavFam_descripcion_Visible, edtavFam_descripcion_Enabled, 0, "text", "", 70, "chr", 1, "row", 70, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblseg_descripcionfilter_Internalname, lblLblseg_descripcionfilter_Caption, "", "", lblLblseg_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e144k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_CLASE.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavSeg_descripcion_Internalname, AV17SEG_Descripcion, GXutil.rtrim( localUtil.format( AV17SEG_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSeg_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavSeg_descripcion_Visible, edtavSeg_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_CLASE.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTip_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTip_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltip_descripcionfilter_Internalname, lblLbltip_descripcionfilter_Caption, "", "", lblLbltip_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e154k1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_CLASE.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTip_descripcion_Internalname, "TIP_Descripcion", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_65_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTip_descripcion_Internalname, AV18TIP_Descripcion, GXutil.rtrim( localUtil.format( AV18TIP_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTip_descripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTip_descripcion_Visible, edtavTip_descripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_CLASE.htm");
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"65\">") ;
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
            httpContext.writeValue( "Clase") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Clase") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Segmento Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Segmento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Familia Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Familia") ;
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
            GridColumn.AddObjectProperty("Value", A34Clas_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A291Clas_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A74TIP_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A435TIP_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A75SEG_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A442SEG_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A35FAM_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A447FAM_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV19Update));
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
      if ( wbEnd == 65 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_65 = (short)(nGXsfl_65_idx-1) ;
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

   public void start4K2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Clase", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup4K0( ) ;
   }

   public void ws4K2( )
   {
      start4K2( ) ;
      evt4K2( ) ;
   }

   public void evt4K2( )
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
                           nGXsfl_65_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_652( ) ;
                           A34Clas_Codigo = httpContext.cgiGet( edtClas_Codigo_Internalname) ;
                           A291Clas_Descripcion = httpContext.cgiGet( edtClas_Descripcion_Internalname) ;
                           A74TIP_Codigo = httpContext.cgiGet( edtTIP_Codigo_Internalname) ;
                           A435TIP_Descripcion = httpContext.cgiGet( edtTIP_Descripcion_Internalname) ;
                           A75SEG_Codigo = httpContext.cgiGet( edtSEG_Codigo_Internalname) ;
                           A442SEG_Descripcion = httpContext.cgiGet( edtSEG_Descripcion_Internalname) ;
                           A35FAM_Codigo = httpContext.cgiGet( edtFAM_Codigo_Internalname) ;
                           A447FAM_Descripcion = httpContext.cgiGet( edtFAM_Descripcion_Internalname) ;
                           AV19Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Update)==0) ? AV24Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Update))), !bGXsfl_65_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Update), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e164K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e174K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e184K2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Clas_codigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLAS_CODIGO"), AV14Clas_Codigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clas_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLAS_DESCRIPCION"), AV15Clas_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Fam_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFAM_DESCRIPCION"), AV16FAM_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Seg_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vSEG_DESCRIPCION"), AV17SEG_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tip_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTIP_DESCRIPCION"), AV18TIP_Descripcion) != 0 )
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

   public void we4K2( )
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

   public void pa4K2( )
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
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavClas_codigo_Internalname ;
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
      subsflControlProps_652( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         sendrow_652( ) ;
         nGXsfl_65_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_65_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_65_idx+1)) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_652( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV14Clas_Codigo ,
                                 String AV15Clas_Descripcion ,
                                 String AV16FAM_Descripcion ,
                                 String AV17SEG_Descripcion ,
                                 String AV18TIP_Descripcion ,
                                 String AV19Update ,
                                 String AV20ADVANCED_LABEL_TEMPLATE ,
                                 String AV23Pgmname ,
                                 String A34Clas_Codigo )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf4K2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLAS_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A34Clas_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_CODIGO", A34Clas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLAS_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A291Clas_Descripcion, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_DESCRIPCION", A291Clas_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_FAM_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A35FAM_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FAM_CODIGO", A35FAM_Codigo);
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf4K2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV23Pgmname = "WWALM_CLASE" ;
      Gx_err = (short)(0) ;
   }

   public void rf4K2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(65) ;
      /* Execute user event: Refresh */
      e174K2 ();
      nGXsfl_65_idx = (short)(1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_652( ) ;
      bGXsfl_65_Refreshing = true ;
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
         subsflControlProps_652( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_recordsperpage( )+1) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV15Clas_Descripcion ,
                                              AV14Clas_Codigo ,
                                              AV16FAM_Descripcion ,
                                              AV17SEG_Descripcion ,
                                              AV18TIP_Descripcion ,
                                              A291Clas_Descripcion ,
                                              A34Clas_Codigo ,
                                              A447FAM_Descripcion ,
                                              A442SEG_Descripcion ,
                                              A435TIP_Descripcion } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         } ) ;
         lV15Clas_Descripcion = GXutil.concat( GXutil.rtrim( AV15Clas_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Clas_Descripcion", AV15Clas_Descripcion);
         lV14Clas_Codigo = GXutil.concat( GXutil.rtrim( AV14Clas_Codigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Clas_Codigo", AV14Clas_Codigo);
         lV16FAM_Descripcion = GXutil.concat( GXutil.rtrim( AV16FAM_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16FAM_Descripcion", AV16FAM_Descripcion);
         lV17SEG_Descripcion = GXutil.concat( GXutil.rtrim( AV17SEG_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17SEG_Descripcion", AV17SEG_Descripcion);
         lV18TIP_Descripcion = GXutil.concat( GXutil.rtrim( AV18TIP_Descripcion), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18TIP_Descripcion", AV18TIP_Descripcion);
         /* Using cursor H004K2 */
         pr_default.execute(0, new Object[] {lV15Clas_Descripcion, lV14Clas_Codigo, lV16FAM_Descripcion, lV17SEG_Descripcion, lV18TIP_Descripcion, new Integer(GXPagingFrom2), new Integer(GXPagingTo2), new Integer(GXPagingTo2)});
         nGXsfl_65_idx = (short)(1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_652( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_recordsperpage( ) ) ) ) )
         {
            A447FAM_Descripcion = H004K2_A447FAM_Descripcion[0] ;
            A35FAM_Codigo = H004K2_A35FAM_Codigo[0] ;
            A442SEG_Descripcion = H004K2_A442SEG_Descripcion[0] ;
            A75SEG_Codigo = H004K2_A75SEG_Codigo[0] ;
            A435TIP_Descripcion = H004K2_A435TIP_Descripcion[0] ;
            A74TIP_Codigo = H004K2_A74TIP_Codigo[0] ;
            A291Clas_Descripcion = H004K2_A291Clas_Descripcion[0] ;
            A34Clas_Codigo = H004K2_A34Clas_Codigo[0] ;
            A447FAM_Descripcion = H004K2_A447FAM_Descripcion[0] ;
            A75SEG_Codigo = H004K2_A75SEG_Codigo[0] ;
            A442SEG_Descripcion = H004K2_A442SEG_Descripcion[0] ;
            A74TIP_Codigo = H004K2_A74TIP_Codigo[0] ;
            A435TIP_Descripcion = H004K2_A435TIP_Descripcion[0] ;
            e184K2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(65) ;
         wb4K0( ) ;
      }
      bGXsfl_65_Refreshing = true ;
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV15Clas_Descripcion ,
                                           AV14Clas_Codigo ,
                                           AV16FAM_Descripcion ,
                                           AV17SEG_Descripcion ,
                                           AV18TIP_Descripcion ,
                                           A291Clas_Descripcion ,
                                           A34Clas_Codigo ,
                                           A447FAM_Descripcion ,
                                           A442SEG_Descripcion ,
                                           A435TIP_Descripcion } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      } ) ;
      lV15Clas_Descripcion = GXutil.concat( GXutil.rtrim( AV15Clas_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Clas_Descripcion", AV15Clas_Descripcion);
      lV14Clas_Codigo = GXutil.concat( GXutil.rtrim( AV14Clas_Codigo), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Clas_Codigo", AV14Clas_Codigo);
      lV16FAM_Descripcion = GXutil.concat( GXutil.rtrim( AV16FAM_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16FAM_Descripcion", AV16FAM_Descripcion);
      lV17SEG_Descripcion = GXutil.concat( GXutil.rtrim( AV17SEG_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17SEG_Descripcion", AV17SEG_Descripcion);
      lV18TIP_Descripcion = GXutil.concat( GXutil.rtrim( AV18TIP_Descripcion), "%", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18TIP_Descripcion", AV18TIP_Descripcion);
      /* Using cursor H004K3 */
      pr_default.execute(1, new Object[] {lV15Clas_Descripcion, lV14Clas_Codigo, lV16FAM_Descripcion, lV17SEG_Descripcion, lV18TIP_Descripcion});
      GRID_nRecordCount = H004K3_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
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
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Clas_Codigo, AV15Clas_Descripcion, AV16FAM_Descripcion, AV17SEG_Descripcion, AV18TIP_Descripcion, AV19Update, AV20ADVANCED_LABEL_TEMPLATE, AV23Pgmname, A34Clas_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      GRID_nRecordCount = subgrid_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Clas_Codigo, AV15Clas_Descripcion, AV16FAM_Descripcion, AV17SEG_Descripcion, AV18TIP_Descripcion, AV19Update, AV20ADVANCED_LABEL_TEMPLATE, AV23Pgmname, A34Clas_Codigo) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Clas_Codigo, AV15Clas_Descripcion, AV16FAM_Descripcion, AV17SEG_Descripcion, AV18TIP_Descripcion, AV19Update, AV20ADVANCED_LABEL_TEMPLATE, AV23Pgmname, A34Clas_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      GRID_nRecordCount = subgrid_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Clas_Codigo, AV15Clas_Descripcion, AV16FAM_Descripcion, AV17SEG_Descripcion, AV18TIP_Descripcion, AV19Update, AV20ADVANCED_LABEL_TEMPLATE, AV23Pgmname, A34Clas_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
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
         gxgrgrid_refresh( subGrid_Rows, AV14Clas_Codigo, AV15Clas_Descripcion, AV16FAM_Descripcion, AV17SEG_Descripcion, AV18TIP_Descripcion, AV19Update, AV20ADVANCED_LABEL_TEMPLATE, AV23Pgmname, A34Clas_Codigo) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup4K0( )
   {
      /* Before Start, stand alone formulas. */
      AV23Pgmname = "WWALM_CLASE" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e164K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14Clas_Codigo = httpContext.cgiGet( edtavClas_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Clas_Codigo", AV14Clas_Codigo);
         AV15Clas_Descripcion = httpContext.cgiGet( edtavClas_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Clas_Descripcion", AV15Clas_Descripcion);
         AV16FAM_Descripcion = httpContext.cgiGet( edtavFam_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16FAM_Descripcion", AV16FAM_Descripcion);
         AV17SEG_Descripcion = httpContext.cgiGet( edtavSeg_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17SEG_Descripcion", AV17SEG_Descripcion);
         AV18TIP_Descripcion = httpContext.cgiGet( edtavTip_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18TIP_Descripcion", AV18TIP_Descripcion);
         /* Read saved values. */
         nRC_GXsfl_65 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), ",", ".")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLAS_CODIGO"), AV14Clas_Codigo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCLAS_DESCRIPCION"), AV15Clas_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFAM_DESCRIPCION"), AV16FAM_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vSEG_DESCRIPCION"), AV17SEG_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTIP_DESCRIPCION"), AV18TIP_Descripcion) != 0 )
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
      e164K2 ();
      if (returnInSub) return;
   }

   public void e164K2( )
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
      AV19Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Update)==0) ? AV24Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Update))), !bGXsfl_65_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Update), true);
      AV24Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV19Update)==0) ? AV24Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV19Update))), !bGXsfl_65_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV19Update), true);
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_65_Refreshing);
      Form.setCaption( "Lista de Clases" );
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

   public void e174K2( )
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
      if ( (GXutil.strcmp("", AV15Clas_Descripcion)==0) )
      {
         lblLblclas_descripcionfilter_Caption = "Clase" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblclas_descripcionfilter_Internalname, "Caption", lblLblclas_descripcionfilter_Caption, true);
      }
      else
      {
         lblLblclas_descripcionfilter_Caption = GXutil.format( AV20ADVANCED_LABEL_TEMPLATE, "Clase", AV15Clas_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblclas_descripcionfilter_Internalname, "Caption", lblLblclas_descripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV16FAM_Descripcion)==0) )
      {
         lblLblfam_descripcionfilter_Caption = "Familia Descripcion" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblfam_descripcionfilter_Internalname, "Caption", lblLblfam_descripcionfilter_Caption, true);
      }
      else
      {
         lblLblfam_descripcionfilter_Caption = GXutil.format( AV20ADVANCED_LABEL_TEMPLATE, "Familia Descripcion", AV16FAM_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblfam_descripcionfilter_Internalname, "Caption", lblLblfam_descripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV17SEG_Descripcion)==0) )
      {
         lblLblseg_descripcionfilter_Caption = "Segmento Descripcion" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblseg_descripcionfilter_Internalname, "Caption", lblLblseg_descripcionfilter_Caption, true);
      }
      else
      {
         lblLblseg_descripcionfilter_Caption = GXutil.format( AV20ADVANCED_LABEL_TEMPLATE, "Segmento Descripcion", AV17SEG_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblseg_descripcionfilter_Internalname, "Caption", lblLblseg_descripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV18TIP_Descripcion)==0) )
      {
         lblLbltip_descripcionfilter_Caption = "Tipo Descripcion" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltip_descripcionfilter_Internalname, "Caption", lblLbltip_descripcionfilter_Caption, true);
      }
      else
      {
         lblLbltip_descripcionfilter_Caption = GXutil.format( AV20ADVANCED_LABEL_TEMPLATE, "Tipo Descripcion", AV18TIP_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltip_descripcionfilter_Internalname, "Caption", lblLbltip_descripcionfilter_Caption, true);
      }
   }

   private void e184K2( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.alm_clase") + "?" + GXutil.URLEncode(GXutil.rtrim("UPD")) + "," + GXutil.URLEncode(GXutil.rtrim(A34Clas_Codigo)) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(65) ;
      }
      sendrow_652( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_65_Refreshing )
      {
         httpContext.doAjaxLoad(65, GridRow);
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV8HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV9GridState.fromxml(AV7Session.getValue(AV23Pgmname+"GridState"), null, null);
         if ( AV9GridState.getgxTv_SdtGridState_Filtervalues().size() >= 5 )
         {
            AV14Clas_Codigo = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Clas_Codigo", AV14Clas_Codigo);
            AV15Clas_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+2)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Clas_Descripcion", AV15Clas_Descripcion);
            AV16FAM_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+3)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16FAM_Descripcion", AV16FAM_Descripcion);
            AV17SEG_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+4)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17SEG_Descripcion", AV17SEG_Descripcion);
            AV18TIP_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+5)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TIP_Descripcion", AV18TIP_Descripcion);
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
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV14Clas_Codigo );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV15Clas_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV16FAM_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV17SEG_Descripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV18TIP_Descripcion );
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
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_CLASE" );
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
      pa4K2( ) ;
      ws4K2( ) ;
      we4K2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414194632");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wwalm_clase.js", "?201861414194632");
      /* End function include_jscripts */
   }

   public void subsflControlProps_652( )
   {
      edtClas_Codigo_Internalname = "CLAS_CODIGO_"+sGXsfl_65_idx ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION_"+sGXsfl_65_idx ;
      edtTIP_Codigo_Internalname = "TIP_CODIGO_"+sGXsfl_65_idx ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION_"+sGXsfl_65_idx ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO_"+sGXsfl_65_idx ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION_"+sGXsfl_65_idx ;
      edtFAM_Codigo_Internalname = "FAM_CODIGO_"+sGXsfl_65_idx ;
      edtFAM_Descripcion_Internalname = "FAM_DESCRIPCION_"+sGXsfl_65_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_652( )
   {
      edtClas_Codigo_Internalname = "CLAS_CODIGO_"+sGXsfl_65_fel_idx ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION_"+sGXsfl_65_fel_idx ;
      edtTIP_Codigo_Internalname = "TIP_CODIGO_"+sGXsfl_65_fel_idx ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION_"+sGXsfl_65_fel_idx ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO_"+sGXsfl_65_fel_idx ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION_"+sGXsfl_65_fel_idx ;
      edtFAM_Codigo_Internalname = "FAM_CODIGO_"+sGXsfl_65_fel_idx ;
      edtFAM_Descripcion_Internalname = "FAM_DESCRIPCION_"+sGXsfl_65_fel_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_65_fel_idx ;
   }

   public void sendrow_652( )
   {
      subsflControlProps_652( ) ;
      wb4K0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_65_idx <= subgrid_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_65_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClas_Codigo_Internalname,A34Clas_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClas_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClas_Descripcion_Internalname,A291Clas_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClas_Descripcion_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(150),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTIP_Codigo_Internalname,A74TIP_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTIP_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTIP_Descripcion_Internalname,A435TIP_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTIP_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSEG_Codigo_Internalname,A75SEG_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSEG_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSEG_Descripcion_Internalname,A442SEG_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSEG_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFAM_Codigo_Internalname,A35FAM_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFAM_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(5),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFAM_Descripcion_Internalname,A447FAM_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFAM_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(70),new Integer(0),new Integer(0),new Integer(65),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV19Update_IsBlob = (boolean)(((GXutil.strcmp("", AV19Update)==0)&&(GXutil.strcmp("", AV24Update_GXI)==0))||!(GXutil.strcmp("", AV19Update)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV19Update)==0) ? AV24Update_GXI : httpContext.getResourceRelative(AV19Update)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,sImgUrl,edtavUpdate_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavUpdate_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV19Update_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLAS_CODIGO"+"_"+sGXsfl_65_idx, getSecureSignedToken( sGXsfl_65_idx, GXutil.rtrim( localUtil.format( A34Clas_Codigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLAS_DESCRIPCION"+"_"+sGXsfl_65_idx, getSecureSignedToken( sGXsfl_65_idx, GXutil.rtrim( localUtil.format( A291Clas_Descripcion, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_FAM_CODIGO"+"_"+sGXsfl_65_idx, getSecureSignedToken( sGXsfl_65_idx, GXutil.rtrim( localUtil.format( A35FAM_Codigo, ""))));
         GridContainer.AddRow(GridRow);
         nGXsfl_65_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_65_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_65_idx+1)) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_65_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_652( ) ;
      }
      /* End function sendrow_652 */
   }

   public void init_default_properties( )
   {
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      lblTitletext_Internalname = "TITLETEXT" ;
      edtavClas_codigo_Internalname = "vCLAS_CODIGO" ;
      divTabletop_Internalname = "TABLETOP" ;
      lblLblclas_descripcionfilter_Internalname = "LBLCLAS_DESCRIPCIONFILTER" ;
      edtavClas_descripcion_Internalname = "vCLAS_DESCRIPCION" ;
      divClas_descripcionfiltercontainer_Internalname = "CLAS_DESCRIPCIONFILTERCONTAINER" ;
      lblLblfam_descripcionfilter_Internalname = "LBLFAM_DESCRIPCIONFILTER" ;
      edtavFam_descripcion_Internalname = "vFAM_DESCRIPCION" ;
      divFam_descripcionfiltercontainer_Internalname = "FAM_DESCRIPCIONFILTERCONTAINER" ;
      lblLblseg_descripcionfilter_Internalname = "LBLSEG_DESCRIPCIONFILTER" ;
      edtavSeg_descripcion_Internalname = "vSEG_DESCRIPCION" ;
      divSeg_descripcionfiltercontainer_Internalname = "SEG_DESCRIPCIONFILTERCONTAINER" ;
      lblLbltip_descripcionfilter_Internalname = "LBLTIP_DESCRIPCIONFILTER" ;
      edtavTip_descripcion_Internalname = "vTIP_DESCRIPCION" ;
      divTip_descripcionfiltercontainer_Internalname = "TIP_DESCRIPCIONFILTERCONTAINER" ;
      divFilterscontainer_Internalname = "FILTERSCONTAINER" ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO" ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION" ;
      edtTIP_Codigo_Internalname = "TIP_CODIGO" ;
      edtTIP_Descripcion_Internalname = "TIP_DESCRIPCION" ;
      edtSEG_Codigo_Internalname = "SEG_CODIGO" ;
      edtSEG_Descripcion_Internalname = "SEG_DESCRIPCION" ;
      edtFAM_Codigo_Internalname = "FAM_CODIGO" ;
      edtFAM_Descripcion_Internalname = "FAM_DESCRIPCION" ;
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
      edtFAM_Descripcion_Jsonclick = "" ;
      edtFAM_Codigo_Jsonclick = "" ;
      edtSEG_Descripcion_Jsonclick = "" ;
      edtSEG_Codigo_Jsonclick = "" ;
      edtTIP_Descripcion_Jsonclick = "" ;
      edtTIP_Codigo_Jsonclick = "" ;
      edtClas_Descripcion_Jsonclick = "" ;
      edtClas_Codigo_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavUpdate_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divGridcell_Class = "col-xs-12 col-sm-9 col-md-10 WWGridCell" ;
      edtavTip_descripcion_Jsonclick = "" ;
      edtavTip_descripcion_Enabled = 1 ;
      edtavTip_descripcion_Visible = 1 ;
      lblLbltip_descripcionfilter_Caption = "Tipo Descripcion" ;
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
      lblLblclas_descripcionfilter_Caption = "Clase" ;
      edtavClas_codigo_Jsonclick = "" ;
      edtavClas_codigo_Enabled = 1 ;
      bttBtntoggle_Class = "HideFiltersButton" ;
      bttBtntoggle_Caption = "Otros Filtros" ;
      divTip_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divSeg_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divFam_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divClas_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divFilterscontainer_Class = "AdvancedContainer" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Clase" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV19Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A34Clas_Codigo',fld:'CLAS_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Clas_Descripcion',fld:'vCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV20ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''},{av:'AV17SEG_Descripcion',fld:'vSEG_DESCRIPCION',pic:'',nv:''},{av:'AV18TIP_Descripcion',fld:'vTIP_DESCRIPCION',pic:'',nv:''},{av:'AV23Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLblclas_descripcionfilter_Caption',ctrl:'LBLCLAS_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblfam_descripcionfilter_Caption',ctrl:'LBLFAM_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblseg_descripcionfilter_Caption',ctrl:'LBLSEG_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltip_descripcionfilter_Caption',ctrl:'LBLTIP_DESCRIPCIONFILTER',prop:'Caption'}]}");
      setEventMetadata("'TOGGLE'","{handler:'e114K1',iparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'}],oparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Caption'},{av:'divGridcell_Class',ctrl:'GRIDCELL',prop:'Class'}]}");
      setEventMetadata("LBLCLAS_DESCRIPCIONFILTER.CLICK","{handler:'e124K1',iparms:[{av:'divClas_descripcionfiltercontainer_Class',ctrl:'CLAS_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divClas_descripcionfiltercontainer_Class',ctrl:'CLAS_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavClas_descripcion_Visible',ctrl:'vCLAS_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLFAM_DESCRIPCIONFILTER.CLICK","{handler:'e134K1',iparms:[{av:'divFam_descripcionfiltercontainer_Class',ctrl:'FAM_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divFam_descripcionfiltercontainer_Class',ctrl:'FAM_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavFam_descripcion_Visible',ctrl:'vFAM_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLSEG_DESCRIPCIONFILTER.CLICK","{handler:'e144K1',iparms:[{av:'divSeg_descripcionfiltercontainer_Class',ctrl:'SEG_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divSeg_descripcionfiltercontainer_Class',ctrl:'SEG_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavSeg_descripcion_Visible',ctrl:'vSEG_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLTIP_DESCRIPCIONFILTER.CLICK","{handler:'e154K1',iparms:[{av:'divTip_descripcionfiltercontainer_Class',ctrl:'TIP_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTip_descripcionfiltercontainer_Class',ctrl:'TIP_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavTip_descripcion_Visible',ctrl:'vTIP_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e184K2',iparms:[{av:'A34Clas_Codigo',fld:'CLAS_CODIGO',pic:'',hsh:true,nv:''}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV19Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A34Clas_Codigo',fld:'CLAS_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Clas_Descripcion',fld:'vCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV20ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''},{av:'AV17SEG_Descripcion',fld:'vSEG_DESCRIPCION',pic:'',nv:''},{av:'AV18TIP_Descripcion',fld:'vTIP_DESCRIPCION',pic:'',nv:''},{av:'AV23Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLblclas_descripcionfilter_Caption',ctrl:'LBLCLAS_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblfam_descripcionfilter_Caption',ctrl:'LBLFAM_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblseg_descripcionfilter_Caption',ctrl:'LBLSEG_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltip_descripcionfilter_Caption',ctrl:'LBLTIP_DESCRIPCIONFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV19Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A34Clas_Codigo',fld:'CLAS_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Clas_Descripcion',fld:'vCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV20ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''},{av:'AV17SEG_Descripcion',fld:'vSEG_DESCRIPCION',pic:'',nv:''},{av:'AV18TIP_Descripcion',fld:'vTIP_DESCRIPCION',pic:'',nv:''},{av:'AV23Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLblclas_descripcionfilter_Caption',ctrl:'LBLCLAS_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblfam_descripcionfilter_Caption',ctrl:'LBLFAM_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblseg_descripcionfilter_Caption',ctrl:'LBLSEG_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltip_descripcionfilter_Caption',ctrl:'LBLTIP_DESCRIPCIONFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV19Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A34Clas_Codigo',fld:'CLAS_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Clas_Descripcion',fld:'vCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV20ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''},{av:'AV17SEG_Descripcion',fld:'vSEG_DESCRIPCION',pic:'',nv:''},{av:'AV18TIP_Descripcion',fld:'vTIP_DESCRIPCION',pic:'',nv:''},{av:'AV23Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLblclas_descripcionfilter_Caption',ctrl:'LBLCLAS_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblfam_descripcionfilter_Caption',ctrl:'LBLFAM_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblseg_descripcionfilter_Caption',ctrl:'LBLSEG_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltip_descripcionfilter_Caption',ctrl:'LBLTIP_DESCRIPCIONFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV19Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A34Clas_Codigo',fld:'CLAS_CODIGO',pic:'',hsh:true,nv:''},{av:'AV15Clas_Descripcion',fld:'vCLAS_DESCRIPCION',pic:'',nv:''},{av:'AV20ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16FAM_Descripcion',fld:'vFAM_DESCRIPCION',pic:'',nv:''},{av:'AV17SEG_Descripcion',fld:'vSEG_DESCRIPCION',pic:'',nv:''},{av:'AV18TIP_Descripcion',fld:'vTIP_DESCRIPCION',pic:'',nv:''},{av:'AV23Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',nv:''}],oparms:[{av:'lblLblclas_descripcionfilter_Caption',ctrl:'LBLCLAS_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblfam_descripcionfilter_Caption',ctrl:'LBLFAM_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblseg_descripcionfilter_Caption',ctrl:'LBLSEG_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLbltip_descripcionfilter_Caption',ctrl:'LBLTIP_DESCRIPCIONFILTER',prop:'Caption'}]}");
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
      AV14Clas_Codigo = "" ;
      AV15Clas_Descripcion = "" ;
      AV16FAM_Descripcion = "" ;
      AV17SEG_Descripcion = "" ;
      AV18TIP_Descripcion = "" ;
      AV20ADVANCED_LABEL_TEMPLATE = "" ;
      AV23Pgmname = "" ;
      A34Clas_Codigo = "" ;
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
      lblLblclas_descripcionfilter_Jsonclick = "" ;
      lblLblfam_descripcionfilter_Jsonclick = "" ;
      lblLblseg_descripcionfilter_Jsonclick = "" ;
      lblLbltip_descripcionfilter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A291Clas_Descripcion = "" ;
      A74TIP_Codigo = "" ;
      A435TIP_Descripcion = "" ;
      A75SEG_Codigo = "" ;
      A442SEG_Descripcion = "" ;
      A35FAM_Codigo = "" ;
      A447FAM_Descripcion = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV24Update_GXI = "" ;
      scmdbuf = "" ;
      lV15Clas_Descripcion = "" ;
      lV14Clas_Codigo = "" ;
      lV16FAM_Descripcion = "" ;
      lV17SEG_Descripcion = "" ;
      lV18TIP_Descripcion = "" ;
      H004K2_A447FAM_Descripcion = new String[] {""} ;
      H004K2_A35FAM_Codigo = new String[] {""} ;
      H004K2_A442SEG_Descripcion = new String[] {""} ;
      H004K2_A75SEG_Codigo = new String[] {""} ;
      H004K2_A435TIP_Descripcion = new String[] {""} ;
      H004K2_A74TIP_Codigo = new String[] {""} ;
      H004K2_A291Clas_Descripcion = new String[] {""} ;
      H004K2_A34Clas_Codigo = new String[] {""} ;
      H004K3_AGRID_nRecordCount = new long[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_clase__default(),
         new Object[] {
             new Object[] {
            H004K2_A447FAM_Descripcion, H004K2_A35FAM_Codigo, H004K2_A442SEG_Descripcion, H004K2_A75SEG_Codigo, H004K2_A435TIP_Descripcion, H004K2_A74TIP_Codigo, H004K2_A291Clas_Descripcion, H004K2_A34Clas_Codigo
            }
            , new Object[] {
            H004K3_AGRID_nRecordCount
            }
         }
      );
      AV23Pgmname = "WWALM_CLASE" ;
      /* GeneXus formulas. */
      AV23Pgmname = "WWALM_CLASE" ;
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
   private short nRC_GXsfl_65 ;
   private short nGXsfl_65_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int edtavClas_codigo_Enabled ;
   private int edtavClas_descripcion_Visible ;
   private int edtavClas_descripcion_Enabled ;
   private int edtavFam_descripcion_Visible ;
   private int edtavFam_descripcion_Enabled ;
   private int edtavSeg_descripcion_Visible ;
   private int edtavSeg_descripcion_Enabled ;
   private int edtavTip_descripcion_Visible ;
   private int edtavTip_descripcion_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV11GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String edtavUpdate_Tooltiptext ;
   private String divFilterscontainer_Class ;
   private String divClas_descripcionfiltercontainer_Class ;
   private String divFam_descripcionfiltercontainer_Class ;
   private String divSeg_descripcionfiltercontainer_Class ;
   private String divTip_descripcionfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_65_idx="0001" ;
   private String edtavUpdate_Internalname ;
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
   private String edtavClas_codigo_Internalname ;
   private String edtavClas_codigo_Jsonclick ;
   private String divFilterscontainer_Internalname ;
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
   private String divTip_descripcionfiltercontainer_Internalname ;
   private String lblLbltip_descripcionfilter_Internalname ;
   private String lblLbltip_descripcionfilter_Caption ;
   private String lblLbltip_descripcionfilter_Jsonclick ;
   private String edtavTip_descripcion_Internalname ;
   private String edtavTip_descripcion_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridcell_Class ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String edtavUpdate_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtClas_Codigo_Internalname ;
   private String edtClas_Descripcion_Internalname ;
   private String edtTIP_Codigo_Internalname ;
   private String edtTIP_Descripcion_Internalname ;
   private String edtSEG_Codigo_Internalname ;
   private String edtSEG_Descripcion_Internalname ;
   private String edtFAM_Codigo_Internalname ;
   private String edtFAM_Descripcion_Internalname ;
   private String scmdbuf ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String ROClassString ;
   private String edtClas_Codigo_Jsonclick ;
   private String edtClas_Descripcion_Jsonclick ;
   private String edtTIP_Codigo_Jsonclick ;
   private String edtTIP_Descripcion_Jsonclick ;
   private String edtSEG_Codigo_Jsonclick ;
   private String edtSEG_Descripcion_Jsonclick ;
   private String edtFAM_Codigo_Jsonclick ;
   private String edtFAM_Descripcion_Jsonclick ;
   private String sImgUrl ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV19Update_IsBlob ;
   private String AV14Clas_Codigo ;
   private String AV15Clas_Descripcion ;
   private String AV16FAM_Descripcion ;
   private String AV17SEG_Descripcion ;
   private String AV18TIP_Descripcion ;
   private String A34Clas_Codigo ;
   private String A291Clas_Descripcion ;
   private String A74TIP_Codigo ;
   private String A435TIP_Descripcion ;
   private String A75SEG_Codigo ;
   private String A442SEG_Descripcion ;
   private String A35FAM_Codigo ;
   private String A447FAM_Descripcion ;
   private String AV24Update_GXI ;
   private String lV15Clas_Descripcion ;
   private String lV14Clas_Codigo ;
   private String lV16FAM_Descripcion ;
   private String lV17SEG_Descripcion ;
   private String lV18TIP_Descripcion ;
   private String AV19Update ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private IDataStoreProvider pr_default ;
   private String[] H004K2_A447FAM_Descripcion ;
   private String[] H004K2_A35FAM_Codigo ;
   private String[] H004K2_A442SEG_Descripcion ;
   private String[] H004K2_A75SEG_Codigo ;
   private String[] H004K2_A435TIP_Descripcion ;
   private String[] H004K2_A74TIP_Codigo ;
   private String[] H004K2_A291Clas_Descripcion ;
   private String[] H004K2_A34Clas_Codigo ;
   private long[] H004K3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwalm_clase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H004K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV15Clas_Descripcion ,
                                          String AV14Clas_Codigo ,
                                          String AV16FAM_Descripcion ,
                                          String AV17SEG_Descripcion ,
                                          String AV18TIP_Descripcion ,
                                          String A291Clas_Descripcion ,
                                          String A34Clas_Codigo ,
                                          String A447FAM_Descripcion ,
                                          String A442SEG_Descripcion ,
                                          String A435TIP_Descripcion )
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
      sSelectString = " T2.FAM_Descripcion, T1.FAM_Codigo, T3.SEG_Descripcion, T2.SEG_Codigo, T4.TIP_Descripcion," ;
      sSelectString = sSelectString + " T3.TIP_Codigo, T1.Clas_Descripcion, T1.Clas_Codigo" ;
      sFromString = " FROM (((ALM_CLASE T1 INNER JOIN ALM_CAT_FAM T2 ON T2.FAM_Codigo = T1.FAM_Codigo)" ;
      sFromString = sFromString + " INNER JOIN ALM_CAT_SEG T3 ON T3.SEG_Codigo = T2.SEG_Codigo) INNER JOIN ALM_CAT_TIP" ;
      sFromString = sFromString + " T4 ON T4.TIP_Codigo = T3.TIP_Codigo)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV15Clas_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Clas_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Clas_Descripcion like ?)" ;
         }
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV14Clas_Codigo)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Clas_Codigo like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Clas_Codigo like ?)" ;
         }
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16FAM_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T2.FAM_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T2.FAM_Descripcion like ?)" ;
         }
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17SEG_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T3.SEG_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T3.SEG_Descripcion like ?)" ;
         }
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18TIP_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T4.TIP_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T4.TIP_Descripcion like ?)" ;
         }
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         sWhereString = " WHERE" + sWhereString ;
      }
      sOrderString = sOrderString + " ORDER BY T1.Clas_Descripcion" ;
      scmdbuf = "SELECT " + sSelectString + sFromString + sWhereString + "" + sOrderString + " OFFSET " + "?" + " ROWS FETCH NEXT (CASE WHEN " + "?" + " > 0 THEN " + "?" + " ELSE 1e9 END) ROWS ONLY" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_H004K3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV15Clas_Descripcion ,
                                          String AV14Clas_Codigo ,
                                          String AV16FAM_Descripcion ,
                                          String AV17SEG_Descripcion ,
                                          String AV18TIP_Descripcion ,
                                          String A291Clas_Descripcion ,
                                          String A34Clas_Codigo ,
                                          String A447FAM_Descripcion ,
                                          String A442SEG_Descripcion ,
                                          String A435TIP_Descripcion )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int3 ;
      GXv_int3 = new byte [5] ;
      Object[] GXv_Object4 ;
      GXv_Object4 = new Object [2] ;
      scmdbuf = "SELECT COUNT(*) FROM (((ALM_CLASE T1 INNER JOIN ALM_CAT_FAM T2 ON T2.FAM_Codigo =" ;
      scmdbuf = scmdbuf + " T1.FAM_Codigo) INNER JOIN ALM_CAT_SEG T3 ON T3.SEG_Codigo = T2.SEG_Codigo) INNER" ;
      scmdbuf = scmdbuf + " JOIN ALM_CAT_TIP T4 ON T4.TIP_Codigo = T3.TIP_Codigo)" ;
      if ( ! (GXutil.strcmp("", AV15Clas_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Clas_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Clas_Descripcion like ?)" ;
         }
      }
      else
      {
         GXv_int3[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV14Clas_Codigo)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Clas_Codigo like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Clas_Codigo like ?)" ;
         }
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16FAM_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T2.FAM_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T2.FAM_Descripcion like ?)" ;
         }
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17SEG_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T3.SEG_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T3.SEG_Descripcion like ?)" ;
         }
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18TIP_Descripcion)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T4.TIP_Descripcion like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T4.TIP_Descripcion like ?)" ;
         }
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
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
                  return conditional_H004K2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_H004K3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H004K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H004K3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
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
                  stmt.setVarchar(sIdx, (String)parms[8], 150);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 7);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 70);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 50);
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
                  stmt.setVarchar(sIdx, (String)parms[5], 150);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 7);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 70);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 50);
               }
               return;
      }
   }

}

