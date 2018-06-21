/*
               File: wwalm_restricciones_impl
        Description: Work With Restricciones
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:17:55.61
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

public final  class wwalm_restricciones_impl extends GXDataArea
{
   public wwalm_restricciones_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_restricciones_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_restricciones_impl.class ));
   }

   public wwalm_restricciones_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavMbod_estado = new HTMLChoice();
      cmbMbod_AlmModOrigen = new HTMLChoice();
      cmbMbod_AlmModDestino = new HTMLChoice();
      cmbMbod_Estado = new HTMLChoice();
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
            nRC_GXsfl_89 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_89_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_89_idx = httpContext.GetNextPar( ) ;
            AV21Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_89_Refreshing);
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
            AV14Mbod_TipoMovCodigo = httpContext.GetNextPar( ) ;
            AV15Mbod_TipoMovDescrip = httpContext.GetNextPar( ) ;
            AV16Mbod_RegionCodigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV17Mbod_RegionDescripcion = httpContext.GetNextPar( ) ;
            AV18Mbod_CentCostoCodigo = httpContext.GetNextPar( ) ;
            AV19Mbod_CentroCostoDescrip = httpContext.GetNextPar( ) ;
            AV20Mbod_Estado = httpContext.GetNextPar( ) ;
            AV21Update = httpContext.GetNextPar( ) ;
            edtavUpdate_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_89_Refreshing);
            AV22ADVANCED_LABEL_TEMPLATE = httpContext.GetNextPar( ) ;
            AV25Pgmname = httpContext.GetNextPar( ) ;
            A60Mbod_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV14Mbod_TipoMovCodigo, AV15Mbod_TipoMovDescrip, AV16Mbod_RegionCodigo, AV17Mbod_RegionDescripcion, AV18Mbod_CentCostoCodigo, AV19Mbod_CentroCostoDescrip, AV20Mbod_Estado, AV21Update, AV22ADVANCED_LABEL_TEMPLATE, AV25Pgmname, A60Mbod_Id) ;
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
      pa122( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start122( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414175573");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_restricciones") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vMBOD_TIPOMOVCODIGO", AV14Mbod_TipoMovCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vMBOD_TIPOMOVDESCRIP", AV15Mbod_TipoMovDescrip);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vMBOD_REGIONCODIGO", GXutil.ltrim( localUtil.ntoc( AV16Mbod_RegionCodigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vMBOD_REGIONDESCRIPCION", AV17Mbod_RegionDescripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vMBOD_CENTCOSTOCODIGO", AV18Mbod_CentCostoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vMBOD_CENTROCOSTODESCRIP", AV19Mbod_CentroCostoDescrip);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vMBOD_ESTADO", GXutil.rtrim( AV20Mbod_Estado));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_89", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_89, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vADVANCED_LABEL_TEMPLATE", GXutil.rtrim( AV22ADVANCED_LABEL_TEMPLATE));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV25Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUPDATE_Tooltiptext", GXutil.rtrim( edtavUpdate_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FILTERSCONTAINER_Class", GXutil.rtrim( divFilterscontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_TIPOMOVDESCRIPFILTERCONTAINER_Class", GXutil.rtrim( divMbod_tipomovdescripfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_REGIONCODIGOFILTERCONTAINER_Class", GXutil.rtrim( divMbod_regioncodigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_REGIONDESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divMbod_regiondescripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_CENTCOSTOCODIGOFILTERCONTAINER_Class", GXutil.rtrim( divMbod_centcostocodigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_CENTROCOSTODESCRIPFILTERCONTAINER_Class", GXutil.rtrim( divMbod_centrocostodescripfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_ESTADOFILTERCONTAINER_Class", GXutil.rtrim( divMbod_estadofiltercontainer_Class));
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
         we122( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt122( ) ;
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
      return formatLink("com.orions2.wwalm_restricciones")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_RESTRICCIONES" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Restricciones" ;
   }

   public void wb120( )
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 89, 2, 0)+","+"null"+");", bttBtntoggle_Caption, bttBtntoggle_Jsonclick, 7, "Otros Filtros", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11121_client"+"'", TempTags, "", 2, "HLP_WWALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Restricciones", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 89, 2, 0)+","+"null"+");", "Agregar", bttBtninsert_Jsonclick, 5, "Agregar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-sm-pull-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_tipomovcodigo_Internalname, "Mbod_Tipo Mov Codigo", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_tipomovcodigo_Internalname, AV14Mbod_TipoMovCodigo, GXutil.rtrim( localUtil.format( AV14Mbod_TipoMovCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Código Movimiento", edtavMbod_tipomovcodigo_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavMbod_tipomovcodigo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divMbod_tipomovdescripfiltercontainer_Internalname, 1, 0, "px", 0, "px", divMbod_tipomovdescripfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmbod_tipomovdescripfilter_Internalname, lblLblmbod_tipomovdescripfilter_Caption, "", "", lblLblmbod_tipomovdescripfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_tipomovdescrip_Internalname, "Mbod_Tipo Mov Descrip", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_tipomovdescrip_Internalname, AV15Mbod_TipoMovDescrip, GXutil.rtrim( localUtil.format( AV15Mbod_TipoMovDescrip, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_tipomovdescrip_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavMbod_tipomovdescrip_Visible, edtavMbod_tipomovdescrip_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divMbod_regioncodigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divMbod_regioncodigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmbod_regioncodigofilter_Internalname, lblLblmbod_regioncodigofilter_Caption, "", "", lblLblmbod_regioncodigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_regioncodigo_Internalname, "Mbod_Region Codigo", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_regioncodigo_Internalname, GXutil.ltrim( localUtil.ntoc( AV16Mbod_RegionCodigo, (byte)(4), (byte)(0), ",", "")), ((edtavMbod_regioncodigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Mbod_RegionCodigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV16Mbod_RegionCodigo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_regioncodigo_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavMbod_regioncodigo_Visible, edtavMbod_regioncodigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WWALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divMbod_regiondescripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divMbod_regiondescripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmbod_regiondescripcionfilter_Internalname, lblLblmbod_regiondescripcionfilter_Caption, "", "", lblLblmbod_regiondescripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_regiondescripcion_Internalname, "Mbod_Region Descripcion", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_regiondescripcion_Internalname, AV17Mbod_RegionDescripcion, GXutil.rtrim( localUtil.format( AV17Mbod_RegionDescripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_regiondescripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavMbod_regiondescripcion_Visible, edtavMbod_regiondescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divMbod_centcostocodigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divMbod_centcostocodigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmbod_centcostocodigofilter_Internalname, lblLblmbod_centcostocodigofilter_Caption, "", "", lblLblmbod_centcostocodigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_centcostocodigo_Internalname, "Mbod_Cent Costo Codigo", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_centcostocodigo_Internalname, AV18Mbod_CentCostoCodigo, GXutil.rtrim( localUtil.format( AV18Mbod_CentCostoCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_centcostocodigo_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavMbod_centcostocodigo_Visible, edtavMbod_centcostocodigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divMbod_centrocostodescripfiltercontainer_Internalname, 1, 0, "px", 0, "px", divMbod_centrocostodescripfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmbod_centrocostodescripfilter_Internalname, lblLblmbod_centrocostodescripfilter_Caption, "", "", lblLblmbod_centrocostodescripfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavMbod_centrocostodescrip_Internalname, "Mbod_Centro Costo Descrip", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavMbod_centrocostodescrip_Internalname, AV19Mbod_CentroCostoDescrip, GXutil.rtrim( localUtil.format( AV19Mbod_CentroCostoDescrip, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMbod_centrocostodescrip_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavMbod_centrocostodescrip_Visible, edtavMbod_centrocostodescrip_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_RESTRICCIONES.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divMbod_estadofiltercontainer_Internalname, 1, 0, "px", 0, "px", divMbod_estadofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmbod_estadofilter_Internalname, lblLblmbod_estadofilter_Caption, "", "", lblLblmbod_estadofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e17121_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RESTRICCIONES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavMbod_estado.getInternalname(), "Mbod_Estado", "col-sm-3 FilterComboAttributeLabel", 0, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavMbod_estado, cmbavMbod_estado.getInternalname(), GXutil.rtrim( AV20Mbod_Estado), 1, cmbavMbod_estado.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavMbod_estado.getVisible(), cmbavMbod_estado.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "FilterComboAttribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "", true, "HLP_WWALM_RESTRICCIONES.htm");
         cmbavMbod_estado.setValue( GXutil.rtrim( AV20Mbod_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMbod_estado.getInternalname(), "Values", cmbavMbod_estado.ToJavascriptSource(), true);
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"89\">") ;
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
            httpContext.writeValue( "Identificador") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Tipo Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Elemento Codigo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Elemento Descripcion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Centro costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Costo Id") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Centro Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Centro Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Módulo Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacen Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Bodega Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Módulo Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacen Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Bodega Destino") ;
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
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60Mbod_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A61Mbod_TipoMovCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A428Mbod_TipoMovDescrip);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A431Mbod_TipoElementoCod, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A432Mbod_TipoElementoDesc);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A62Mbod_RegionId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A426Mbod_RegionCodigo, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A427Mbod_RegionDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A63Mbod_CentCostoId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A429Mbod_CentCostoCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A430Mbod_CentroCostoDescrip);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A364Mbod_AlmModOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A342Mbod_AlmOrigenCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A64Mbod_BodOrigenCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A341Mbod_BodOrigenDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A368Mbod_AlmModDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A345Mbod_AlmDestinoCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A65Mbod_BodDestinoCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A347Mbod_BodDestinoDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A434Mbod_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV21Update));
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
      if ( wbEnd == 89 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_89 = (short)(nGXsfl_89_idx-1) ;
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

   public void start122( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Restricciones", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup120( ) ;
   }

   public void ws122( )
   {
      start122( ) ;
      evt122( ) ;
   }

   public void evt122( )
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
                           e18122 ();
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
                           nGXsfl_89_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_89_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_89_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_892( ) ;
                           A60Mbod_Id = localUtil.ctol( httpContext.cgiGet( edtMbod_Id_Internalname), ",", ".") ;
                           A61Mbod_TipoMovCodigo = httpContext.cgiGet( edtMbod_TipoMovCodigo_Internalname) ;
                           A428Mbod_TipoMovDescrip = httpContext.cgiGet( edtMbod_TipoMovDescrip_Internalname) ;
                           n428Mbod_TipoMovDescrip = false ;
                           A431Mbod_TipoElementoCod = localUtil.ctol( httpContext.cgiGet( edtMbod_TipoElementoCod_Internalname), ",", ".") ;
                           n431Mbod_TipoElementoCod = false ;
                           A432Mbod_TipoElementoDesc = GXutil.upper( httpContext.cgiGet( edtMbod_TipoElementoDesc_Internalname)) ;
                           n432Mbod_TipoElementoDesc = false ;
                           A62Mbod_RegionId = localUtil.ctol( httpContext.cgiGet( edtMbod_RegionId_Internalname), ",", ".") ;
                           A426Mbod_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtMbod_RegionCodigo_Internalname), ",", ".")) ;
                           n426Mbod_RegionCodigo = false ;
                           A427Mbod_RegionDescripcion = httpContext.cgiGet( edtMbod_RegionDescripcion_Internalname) ;
                           n427Mbod_RegionDescripcion = false ;
                           A63Mbod_CentCostoId = localUtil.ctol( httpContext.cgiGet( edtMbod_CentCostoId_Internalname), ",", ".") ;
                           A429Mbod_CentCostoCodigo = httpContext.cgiGet( edtMbod_CentCostoCodigo_Internalname) ;
                           n429Mbod_CentCostoCodigo = false ;
                           A430Mbod_CentroCostoDescrip = httpContext.cgiGet( edtMbod_CentroCostoDescrip_Internalname) ;
                           n430Mbod_CentroCostoDescrip = false ;
                           cmbMbod_AlmModOrigen.setName( cmbMbod_AlmModOrigen.getInternalname() );
                           cmbMbod_AlmModOrigen.setValue( httpContext.cgiGet( cmbMbod_AlmModOrigen.getInternalname()) );
                           A364Mbod_AlmModOrigen = httpContext.cgiGet( cmbMbod_AlmModOrigen.getInternalname()) ;
                           A342Mbod_AlmOrigenCodigo = httpContext.cgiGet( edtMbod_AlmOrigenCodigo_Internalname) ;
                           A64Mbod_BodOrigenCodigo = httpContext.cgiGet( edtMbod_BodOrigenCodigo_Internalname) ;
                           A341Mbod_BodOrigenDescripcion = GXutil.upper( httpContext.cgiGet( edtMbod_BodOrigenDescripcion_Internalname)) ;
                           cmbMbod_AlmModDestino.setName( cmbMbod_AlmModDestino.getInternalname() );
                           cmbMbod_AlmModDestino.setValue( httpContext.cgiGet( cmbMbod_AlmModDestino.getInternalname()) );
                           A368Mbod_AlmModDestino = httpContext.cgiGet( cmbMbod_AlmModDestino.getInternalname()) ;
                           A345Mbod_AlmDestinoCodigo = httpContext.cgiGet( edtMbod_AlmDestinoCodigo_Internalname) ;
                           A65Mbod_BodDestinoCodigo = httpContext.cgiGet( edtMbod_BodDestinoCodigo_Internalname) ;
                           A347Mbod_BodDestinoDescripcion = GXutil.upper( httpContext.cgiGet( edtMbod_BodDestinoDescripcion_Internalname)) ;
                           cmbMbod_Estado.setName( cmbMbod_Estado.getInternalname() );
                           cmbMbod_Estado.setValue( httpContext.cgiGet( cmbMbod_Estado.getInternalname()) );
                           A434Mbod_Estado = httpContext.cgiGet( cmbMbod_Estado.getInternalname()) ;
                           AV21Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV21Update)==0) ? AV26Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV21Update))), !bGXsfl_89_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV21Update), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19122 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e20122 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21122 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Mbod_tipomovcodigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMBOD_TIPOMOVCODIGO"), AV14Mbod_TipoMovCodigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Mbod_tipomovdescrip Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMBOD_TIPOMOVDESCRIP"), AV15Mbod_TipoMovDescrip) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Mbod_regioncodigo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vMBOD_REGIONCODIGO"), ",", ".") != AV16Mbod_RegionCodigo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Mbod_regiondescripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMBOD_REGIONDESCRIPCION"), AV17Mbod_RegionDescripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Mbod_centcostocodigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMBOD_CENTCOSTOCODIGO"), AV18Mbod_CentCostoCodigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Mbod_centrocostodescrip Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMBOD_CENTROCOSTODESCRIP"), AV19Mbod_CentroCostoDescrip) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Mbod_estado Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMBOD_ESTADO"), AV20Mbod_Estado) != 0 )
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

   public void we122( )
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

   public void pa122( )
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
         cmbavMbod_estado.setName( "vMBOD_ESTADO" );
         cmbavMbod_estado.setWebtags( "" );
         cmbavMbod_estado.addItem("", "(Todos)", (short)(0));
         cmbavMbod_estado.addItem("A", "Activo", (short)(0));
         cmbavMbod_estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbavMbod_estado.getItemCount() > 0 )
         {
            AV20Mbod_Estado = cmbavMbod_estado.getValidValue(AV20Mbod_Estado) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Mbod_Estado", AV20Mbod_Estado);
         }
         GXCCtl = "MBOD_ALMMODORIGEN_" + sGXsfl_89_idx ;
         cmbMbod_AlmModOrigen.setName( GXCCtl );
         cmbMbod_AlmModOrigen.setWebtags( "" );
         cmbMbod_AlmModOrigen.addItem("ALMA", "ALMACEN", (short)(0));
         cmbMbod_AlmModOrigen.addItem("INVE", "INVENTARIO", (short)(0));
         cmbMbod_AlmModOrigen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbMbod_AlmModOrigen.getItemCount() > 0 )
         {
            A364Mbod_AlmModOrigen = cmbMbod_AlmModOrigen.getValidValue(A364Mbod_AlmModOrigen) ;
         }
         GXCCtl = "MBOD_ALMMODDESTINO_" + sGXsfl_89_idx ;
         cmbMbod_AlmModDestino.setName( GXCCtl );
         cmbMbod_AlmModDestino.setWebtags( "" );
         cmbMbod_AlmModDestino.addItem("ALMA", "ALMACEN", (short)(0));
         cmbMbod_AlmModDestino.addItem("INVE", "INVENTARIO", (short)(0));
         cmbMbod_AlmModDestino.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         if ( cmbMbod_AlmModDestino.getItemCount() > 0 )
         {
            A368Mbod_AlmModDestino = cmbMbod_AlmModDestino.getValidValue(A368Mbod_AlmModDestino) ;
         }
         GXCCtl = "MBOD_ESTADO_" + sGXsfl_89_idx ;
         cmbMbod_Estado.setName( GXCCtl );
         cmbMbod_Estado.setWebtags( "" );
         cmbMbod_Estado.addItem("A", "Activo", (short)(0));
         cmbMbod_Estado.addItem("I", "Inactivo", (short)(0));
         if ( cmbMbod_Estado.getItemCount() > 0 )
         {
            A434Mbod_Estado = cmbMbod_Estado.getValidValue(A434Mbod_Estado) ;
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
            GX_FocusControl = edtavMbod_tipomovcodigo_Internalname ;
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
      subsflControlProps_892( ) ;
      while ( nGXsfl_89_idx <= nRC_GXsfl_89 )
      {
         sendrow_892( ) ;
         nGXsfl_89_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_89_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_89_idx+1)) ;
         sGXsfl_89_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_89_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_892( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV14Mbod_TipoMovCodigo ,
                                 String AV15Mbod_TipoMovDescrip ,
                                 short AV16Mbod_RegionCodigo ,
                                 String AV17Mbod_RegionDescripcion ,
                                 String AV18Mbod_CentCostoCodigo ,
                                 String AV19Mbod_CentroCostoDescrip ,
                                 String AV20Mbod_Estado ,
                                 String AV21Update ,
                                 String AV22ADVANCED_LABEL_TEMPLATE ,
                                 String AV25Pgmname ,
                                 long A60Mbod_Id )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf122( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A60Mbod_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_ID", GXutil.ltrim( localUtil.ntoc( A60Mbod_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_TIPOMOVCODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A61Mbod_TipoMovCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_TIPOMOVCODIGO", A61Mbod_TipoMovCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_REGIONID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A62Mbod_RegionId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_REGIONID", GXutil.ltrim( localUtil.ntoc( A62Mbod_RegionId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_CENTCOSTOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A63Mbod_CentCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_CENTCOSTOID", GXutil.ltrim( localUtil.ntoc( A63Mbod_CentCostoId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_ALMMODORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A364Mbod_AlmModOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_ALMMODORIGEN", A364Mbod_AlmModOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_ALMORIGENCODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A342Mbod_AlmOrigenCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_ALMORIGENCODIGO", A342Mbod_AlmOrigenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_BODORIGENCODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A64Mbod_BodOrigenCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_BODORIGENCODIGO", A64Mbod_BodOrigenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_ALMMODDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A368Mbod_AlmModDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_ALMMODDESTINO", A368Mbod_AlmModDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_ALMDESTINOCODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A345Mbod_AlmDestinoCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_ALMDESTINOCODIGO", A345Mbod_AlmDestinoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_BODDESTINOCODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A65Mbod_BodDestinoCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_BODDESTINOCODIGO", A65Mbod_BodDestinoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A434Mbod_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "MBOD_ESTADO", GXutil.rtrim( A434Mbod_Estado));
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavMbod_estado.getItemCount() > 0 )
      {
         AV20Mbod_Estado = cmbavMbod_estado.getValidValue(AV20Mbod_Estado) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Mbod_Estado", AV20Mbod_Estado);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf122( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV25Pgmname = "WWALM_RESTRICCIONES" ;
      Gx_err = (short)(0) ;
   }

   public void rf122( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(89) ;
      /* Execute user event: Refresh */
      e20122 ();
      nGXsfl_89_idx = (short)(1) ;
      sGXsfl_89_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_89_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_892( ) ;
      bGXsfl_89_Refreshing = true ;
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
         subsflControlProps_892( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV14Mbod_TipoMovCodigo ,
                                              new Short(AV16Mbod_RegionCodigo) ,
                                              AV20Mbod_Estado ,
                                              A61Mbod_TipoMovCodigo ,
                                              new Short(A426Mbod_RegionCodigo) ,
                                              A434Mbod_Estado ,
                                              AV15Mbod_TipoMovDescrip ,
                                              A428Mbod_TipoMovDescrip ,
                                              AV17Mbod_RegionDescripcion ,
                                              A427Mbod_RegionDescripcion ,
                                              AV18Mbod_CentCostoCodigo ,
                                              A429Mbod_CentCostoCodigo ,
                                              AV19Mbod_CentroCostoDescrip ,
                                              A430Mbod_CentroCostoDescrip } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         } ) ;
         lV14Mbod_TipoMovCodigo = GXutil.concat( GXutil.rtrim( AV14Mbod_TipoMovCodigo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Mbod_TipoMovCodigo", AV14Mbod_TipoMovCodigo);
         lV20Mbod_Estado = GXutil.padr( GXutil.rtrim( AV20Mbod_Estado), 1, "%") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Mbod_Estado", AV20Mbod_Estado);
         /* Using cursor H00122 */
         pr_default.execute(0, new Object[] {lV14Mbod_TipoMovCodigo, new Short(AV16Mbod_RegionCodigo), lV20Mbod_Estado});
         nGXsfl_89_idx = (short)(1) ;
         sGXsfl_89_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_89_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_892( ) ;
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
         {
            A434Mbod_Estado = H00122_A434Mbod_Estado[0] ;
            A65Mbod_BodDestinoCodigo = H00122_A65Mbod_BodDestinoCodigo[0] ;
            A345Mbod_AlmDestinoCodigo = H00122_A345Mbod_AlmDestinoCodigo[0] ;
            A368Mbod_AlmModDestino = H00122_A368Mbod_AlmModDestino[0] ;
            A64Mbod_BodOrigenCodigo = H00122_A64Mbod_BodOrigenCodigo[0] ;
            A342Mbod_AlmOrigenCodigo = H00122_A342Mbod_AlmOrigenCodigo[0] ;
            A364Mbod_AlmModOrigen = H00122_A364Mbod_AlmModOrigen[0] ;
            A430Mbod_CentroCostoDescrip = H00122_A430Mbod_CentroCostoDescrip[0] ;
            n430Mbod_CentroCostoDescrip = H00122_n430Mbod_CentroCostoDescrip[0] ;
            A429Mbod_CentCostoCodigo = H00122_A429Mbod_CentCostoCodigo[0] ;
            n429Mbod_CentCostoCodigo = H00122_n429Mbod_CentCostoCodigo[0] ;
            A63Mbod_CentCostoId = H00122_A63Mbod_CentCostoId[0] ;
            A427Mbod_RegionDescripcion = H00122_A427Mbod_RegionDescripcion[0] ;
            n427Mbod_RegionDescripcion = H00122_n427Mbod_RegionDescripcion[0] ;
            A426Mbod_RegionCodigo = H00122_A426Mbod_RegionCodigo[0] ;
            n426Mbod_RegionCodigo = H00122_n426Mbod_RegionCodigo[0] ;
            A62Mbod_RegionId = H00122_A62Mbod_RegionId[0] ;
            A432Mbod_TipoElementoDesc = H00122_A432Mbod_TipoElementoDesc[0] ;
            n432Mbod_TipoElementoDesc = H00122_n432Mbod_TipoElementoDesc[0] ;
            A431Mbod_TipoElementoCod = H00122_A431Mbod_TipoElementoCod[0] ;
            n431Mbod_TipoElementoCod = H00122_n431Mbod_TipoElementoCod[0] ;
            A428Mbod_TipoMovDescrip = H00122_A428Mbod_TipoMovDescrip[0] ;
            n428Mbod_TipoMovDescrip = H00122_n428Mbod_TipoMovDescrip[0] ;
            A61Mbod_TipoMovCodigo = H00122_A61Mbod_TipoMovCodigo[0] ;
            A60Mbod_Id = H00122_A60Mbod_Id[0] ;
            A430Mbod_CentroCostoDescrip = H00122_A430Mbod_CentroCostoDescrip[0] ;
            n430Mbod_CentroCostoDescrip = H00122_n430Mbod_CentroCostoDescrip[0] ;
            A429Mbod_CentCostoCodigo = H00122_A429Mbod_CentCostoCodigo[0] ;
            n429Mbod_CentCostoCodigo = H00122_n429Mbod_CentCostoCodigo[0] ;
            A427Mbod_RegionDescripcion = H00122_A427Mbod_RegionDescripcion[0] ;
            n427Mbod_RegionDescripcion = H00122_n427Mbod_RegionDescripcion[0] ;
            A426Mbod_RegionCodigo = H00122_A426Mbod_RegionCodigo[0] ;
            n426Mbod_RegionCodigo = H00122_n426Mbod_RegionCodigo[0] ;
            A431Mbod_TipoElementoCod = H00122_A431Mbod_TipoElementoCod[0] ;
            n431Mbod_TipoElementoCod = H00122_n431Mbod_TipoElementoCod[0] ;
            A428Mbod_TipoMovDescrip = H00122_A428Mbod_TipoMovDescrip[0] ;
            n428Mbod_TipoMovDescrip = H00122_n428Mbod_TipoMovDescrip[0] ;
            A432Mbod_TipoElementoDesc = H00122_A432Mbod_TipoElementoDesc[0] ;
            n432Mbod_TipoElementoDesc = H00122_n432Mbod_TipoElementoDesc[0] ;
            if ( (GXutil.strcmp("", AV15Mbod_TipoMovDescrip)==0) || ( GXutil.like( GXutil.upper( A428Mbod_TipoMovDescrip) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV15Mbod_TipoMovDescrip), "") , 254 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV17Mbod_RegionDescripcion)==0) || ( GXutil.like( GXutil.upper( A427Mbod_RegionDescripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV17Mbod_RegionDescripcion), "") , 254 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV18Mbod_CentCostoCodigo)==0) || ( GXutil.like( GXutil.upper( A429Mbod_CentCostoCodigo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV18Mbod_CentCostoCodigo), "") , 254 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV19Mbod_CentroCostoDescrip)==0) || ( GXutil.like( GXutil.upper( A430Mbod_CentroCostoDescrip) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19Mbod_CentroCostoDescrip), "") , 254 , "%"),  ' ' ) ) )
                     {
                        /* Using cursor H00123 */
                        pr_default.execute(1, new Object[] {A64Mbod_BodOrigenCodigo});
                        pr_default.close(1);
                        /* Using cursor H00124 */
                        pr_default.execute(2, new Object[] {A65Mbod_BodDestinoCodigo});
                        pr_default.close(2);
                        e21122 ();
                     }
                  }
               }
            }
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         pr_default.close(2);
         wbEnd = (short)(89) ;
         wb120( ) ;
      }
      bGXsfl_89_Refreshing = true ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Mbod_TipoMovCodigo, AV15Mbod_TipoMovDescrip, AV16Mbod_RegionCodigo, AV17Mbod_RegionDescripcion, AV18Mbod_CentCostoCodigo, AV19Mbod_CentroCostoDescrip, AV20Mbod_Estado, AV21Update, AV22ADVANCED_LABEL_TEMPLATE, AV25Pgmname, A60Mbod_Id) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Mbod_TipoMovCodigo, AV15Mbod_TipoMovDescrip, AV16Mbod_RegionCodigo, AV17Mbod_RegionDescripcion, AV18Mbod_CentCostoCodigo, AV19Mbod_CentroCostoDescrip, AV20Mbod_Estado, AV21Update, AV22ADVANCED_LABEL_TEMPLATE, AV25Pgmname, A60Mbod_Id) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Mbod_TipoMovCodigo, AV15Mbod_TipoMovDescrip, AV16Mbod_RegionCodigo, AV17Mbod_RegionDescripcion, AV18Mbod_CentCostoCodigo, AV19Mbod_CentroCostoDescrip, AV20Mbod_Estado, AV21Update, AV22ADVANCED_LABEL_TEMPLATE, AV25Pgmname, A60Mbod_Id) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14Mbod_TipoMovCodigo, AV15Mbod_TipoMovDescrip, AV16Mbod_RegionCodigo, AV17Mbod_RegionDescripcion, AV18Mbod_CentCostoCodigo, AV19Mbod_CentroCostoDescrip, AV20Mbod_Estado, AV21Update, AV22ADVANCED_LABEL_TEMPLATE, AV25Pgmname, A60Mbod_Id) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14Mbod_TipoMovCodigo, AV15Mbod_TipoMovDescrip, AV16Mbod_RegionCodigo, AV17Mbod_RegionDescripcion, AV18Mbod_CentCostoCodigo, AV19Mbod_CentroCostoDescrip, AV20Mbod_Estado, AV21Update, AV22ADVANCED_LABEL_TEMPLATE, AV25Pgmname, A60Mbod_Id) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup120( )
   {
      /* Before Start, stand alone formulas. */
      AV25Pgmname = "WWALM_RESTRICCIONES" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19122 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV14Mbod_TipoMovCodigo = httpContext.cgiGet( edtavMbod_tipomovcodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Mbod_TipoMovCodigo", AV14Mbod_TipoMovCodigo);
         AV15Mbod_TipoMovDescrip = httpContext.cgiGet( edtavMbod_tipomovdescrip_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Mbod_TipoMovDescrip", AV15Mbod_TipoMovDescrip);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMbod_regioncodigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMbod_regioncodigo_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMBOD_REGIONCODIGO");
            GX_FocusControl = edtavMbod_regioncodigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16Mbod_RegionCodigo = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( AV16Mbod_RegionCodigo, 4, 0)));
         }
         else
         {
            AV16Mbod_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtavMbod_regioncodigo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( AV16Mbod_RegionCodigo, 4, 0)));
         }
         AV17Mbod_RegionDescripcion = httpContext.cgiGet( edtavMbod_regiondescripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Mbod_RegionDescripcion", AV17Mbod_RegionDescripcion);
         AV18Mbod_CentCostoCodigo = httpContext.cgiGet( edtavMbod_centcostocodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Mbod_CentCostoCodigo", AV18Mbod_CentCostoCodigo);
         AV19Mbod_CentroCostoDescrip = httpContext.cgiGet( edtavMbod_centrocostodescrip_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Mbod_CentroCostoDescrip", AV19Mbod_CentroCostoDescrip);
         cmbavMbod_estado.setName( cmbavMbod_estado.getInternalname() );
         cmbavMbod_estado.setValue( httpContext.cgiGet( cmbavMbod_estado.getInternalname()) );
         AV20Mbod_Estado = httpContext.cgiGet( cmbavMbod_estado.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Mbod_Estado", AV20Mbod_Estado);
         /* Read saved values. */
         nRC_GXsfl_89 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_89"), ",", ".")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMBOD_TIPOMOVCODIGO"), AV14Mbod_TipoMovCodigo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMBOD_TIPOMOVDESCRIP"), AV15Mbod_TipoMovDescrip) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vMBOD_REGIONCODIGO"), ",", ".") != AV16Mbod_RegionCodigo )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMBOD_REGIONDESCRIPCION"), AV17Mbod_RegionDescripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMBOD_CENTCOSTOCODIGO"), AV18Mbod_CentCostoCodigo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMBOD_CENTROCOSTODESCRIP"), AV19Mbod_CentroCostoDescrip) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMBOD_ESTADO"), AV20Mbod_Estado) != 0 )
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
      e19122 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e19122( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV25Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV25Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      divGridcell_Class = "WWGridCellExpanded" ;
      httpContext.ajax_rsp_assign_prop("", false, divGridcell_Internalname, "Class", divGridcell_Class, true);
      AV21Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV21Update)==0) ? AV26Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV21Update))), !bGXsfl_89_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV21Update), true);
      AV26Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV21Update)==0) ? AV26Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV21Update))), !bGXsfl_89_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV21Update), true);
      edtavUpdate_Tooltiptext = "Modificar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Tooltiptext", edtavUpdate_Tooltiptext, !bGXsfl_89_Refreshing);
      AV20Mbod_Estado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Mbod_Estado", AV20Mbod_Estado);
      Form.setCaption( "Restricciones" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV22ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22ADVANCED_LABEL_TEMPLATE", AV22ADVANCED_LABEL_TEMPLATE);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e20122( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      if ( (GXutil.strcmp("", AV15Mbod_TipoMovDescrip)==0) )
      {
         lblLblmbod_tipomovdescripfilter_Caption = "Tipo Movimiento" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmbod_tipomovdescripfilter_Internalname, "Caption", lblLblmbod_tipomovdescripfilter_Caption, true);
      }
      else
      {
         lblLblmbod_tipomovdescripfilter_Caption = GXutil.format( AV22ADVANCED_LABEL_TEMPLATE, "Tipo Movimiento", AV15Mbod_TipoMovDescrip, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmbod_tipomovdescripfilter_Internalname, "Caption", lblLblmbod_tipomovdescripfilter_Caption, true);
      }
      if ( (0==AV16Mbod_RegionCodigo) )
      {
         lblLblmbod_regioncodigofilter_Caption = "Código Regional" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmbod_regioncodigofilter_Internalname, "Caption", lblLblmbod_regioncodigofilter_Caption, true);
      }
      else
      {
         lblLblmbod_regioncodigofilter_Caption = GXutil.format( AV22ADVANCED_LABEL_TEMPLATE, "Código Regional", GXutil.ltrim( GXutil.str( AV16Mbod_RegionCodigo, 4, 0)), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmbod_regioncodigofilter_Internalname, "Caption", lblLblmbod_regioncodigofilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV17Mbod_RegionDescripcion)==0) )
      {
         lblLblmbod_regiondescripcionfilter_Caption = "Descrip. Regional" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmbod_regiondescripcionfilter_Internalname, "Caption", lblLblmbod_regiondescripcionfilter_Caption, true);
      }
      else
      {
         lblLblmbod_regiondescripcionfilter_Caption = GXutil.format( AV22ADVANCED_LABEL_TEMPLATE, "Descrip. Regional", AV17Mbod_RegionDescripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmbod_regiondescripcionfilter_Internalname, "Caption", lblLblmbod_regiondescripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV18Mbod_CentCostoCodigo)==0) )
      {
         lblLblmbod_centcostocodigofilter_Caption = "Código C.C." ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmbod_centcostocodigofilter_Internalname, "Caption", lblLblmbod_centcostocodigofilter_Caption, true);
      }
      else
      {
         lblLblmbod_centcostocodigofilter_Caption = GXutil.format( AV22ADVANCED_LABEL_TEMPLATE, "Código C.C.", AV18Mbod_CentCostoCodigo, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmbod_centcostocodigofilter_Internalname, "Caption", lblLblmbod_centcostocodigofilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV19Mbod_CentroCostoDescrip)==0) )
      {
         lblLblmbod_centrocostodescripfilter_Caption = "Descrip. C.C." ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmbod_centrocostodescripfilter_Internalname, "Caption", lblLblmbod_centrocostodescripfilter_Caption, true);
      }
      else
      {
         lblLblmbod_centrocostodescripfilter_Caption = GXutil.format( AV22ADVANCED_LABEL_TEMPLATE, "Descrip. C.C.", AV19Mbod_CentroCostoDescrip, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmbod_centrocostodescripfilter_Internalname, "Caption", lblLblmbod_centrocostodescripfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV20Mbod_Estado)==0) )
      {
         lblLblmbod_estadofilter_Caption = "Estado" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmbod_estadofilter_Internalname, "Caption", lblLblmbod_estadofilter_Caption, true);
      }
      else
      {
         lblLblmbod_estadofilter_Caption = GXutil.format( AV22ADVANCED_LABEL_TEMPLATE, "Estado", AV20Mbod_Estado, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmbod_estadofilter_Internalname, "Caption", lblLblmbod_estadofilter_Caption, true);
      }
   }

   private void e21122( )
   {
      /* Grid_Load Routine */
      edtavUpdate_Link = formatLink("com.orions2.wpalm_restricciones") + "?" + GXutil.URLEncode(GXutil.rtrim("UDP")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A60Mbod_Id,11,0))) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(89) ;
      }
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
      {
         sendrow_892( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_89_Refreshing )
      {
         httpContext.doAjaxLoad(89, GridRow);
      }
   }

   public void e18122( )
   {
      /* 'DoInsert' Routine */
      callWebObject(formatLink("com.orions2.wpalm_restricciones") + "?" + GXutil.URLEncode(GXutil.rtrim("INS")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV8HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV9GridState.fromxml(AV7Session.getValue(AV25Pgmname+"GridState"), null, null);
         if ( AV9GridState.getgxTv_SdtGridState_Filtervalues().size() >= 7 )
         {
            AV14Mbod_TipoMovCodigo = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Mbod_TipoMovCodigo", AV14Mbod_TipoMovCodigo);
            AV15Mbod_TipoMovDescrip = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+2)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Mbod_TipoMovDescrip", AV15Mbod_TipoMovDescrip);
            AV16Mbod_RegionCodigo = (short)(GXutil.lval( ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+3)).getgxTv_SdtGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Mbod_RegionCodigo", GXutil.ltrim( GXutil.str( AV16Mbod_RegionCodigo, 4, 0)));
            AV17Mbod_RegionDescripcion = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+4)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Mbod_RegionDescripcion", AV17Mbod_RegionDescripcion);
            AV18Mbod_CentCostoCodigo = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+5)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Mbod_CentCostoCodigo", AV18Mbod_CentCostoCodigo);
            AV19Mbod_CentroCostoDescrip = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+6)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Mbod_CentroCostoDescrip", AV19Mbod_CentroCostoDescrip);
            AV20Mbod_Estado = ((com.orions2.SdtGridState_FilterValue)AV9GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+7)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Mbod_Estado", AV20Mbod_Estado);
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
      AV9GridState.fromxml(AV7Session.getValue(AV25Pgmname+"GridState"), null, null);
      AV9GridState.setgxTv_SdtGridState_Currentpage( (short)(subgrid_currentpage( )) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().clear();
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV14Mbod_TipoMovCodigo );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV15Mbod_TipoMovDescrip );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( GXutil.str( AV16Mbod_RegionCodigo, 4, 0) );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV17Mbod_RegionDescripcion );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV18Mbod_CentCostoCodigo );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV19Mbod_CentroCostoDescrip );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV10GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV10GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV20Mbod_Estado );
      AV9GridState.getgxTv_SdtGridState_Filtervalues().add(AV10GridStateFilterValue, 0);
      AV7Session.setValue(AV25Pgmname+"GridState", AV9GridState.toxml(false, true, "GridState", "ACBSENA"));
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV12TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV25Pgmname );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV12TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV8HTTPRequest.getScriptName()+"?"+AV8HTTPRequest.getQuerystring() );
      AV12TrnContext.setgxTv_SdtTransactionContext_Transactionname( "ALM_RESTRICCIONES" );
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
      pa122( ) ;
      ws122( ) ;
      we122( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141417586");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wwalm_restricciones.js", "?20186141417586");
      /* End function include_jscripts */
   }

   public void subsflControlProps_892( )
   {
      edtMbod_Id_Internalname = "MBOD_ID_"+sGXsfl_89_idx ;
      edtMbod_TipoMovCodigo_Internalname = "MBOD_TIPOMOVCODIGO_"+sGXsfl_89_idx ;
      edtMbod_TipoMovDescrip_Internalname = "MBOD_TIPOMOVDESCRIP_"+sGXsfl_89_idx ;
      edtMbod_TipoElementoCod_Internalname = "MBOD_TIPOELEMENTOCOD_"+sGXsfl_89_idx ;
      edtMbod_TipoElementoDesc_Internalname = "MBOD_TIPOELEMENTODESC_"+sGXsfl_89_idx ;
      edtMbod_RegionId_Internalname = "MBOD_REGIONID_"+sGXsfl_89_idx ;
      edtMbod_RegionCodigo_Internalname = "MBOD_REGIONCODIGO_"+sGXsfl_89_idx ;
      edtMbod_RegionDescripcion_Internalname = "MBOD_REGIONDESCRIPCION_"+sGXsfl_89_idx ;
      edtMbod_CentCostoId_Internalname = "MBOD_CENTCOSTOID_"+sGXsfl_89_idx ;
      edtMbod_CentCostoCodigo_Internalname = "MBOD_CENTCOSTOCODIGO_"+sGXsfl_89_idx ;
      edtMbod_CentroCostoDescrip_Internalname = "MBOD_CENTROCOSTODESCRIP_"+sGXsfl_89_idx ;
      cmbMbod_AlmModOrigen.setInternalname( "MBOD_ALMMODORIGEN_"+sGXsfl_89_idx );
      edtMbod_AlmOrigenCodigo_Internalname = "MBOD_ALMORIGENCODIGO_"+sGXsfl_89_idx ;
      edtMbod_BodOrigenCodigo_Internalname = "MBOD_BODORIGENCODIGO_"+sGXsfl_89_idx ;
      edtMbod_BodOrigenDescripcion_Internalname = "MBOD_BODORIGENDESCRIPCION_"+sGXsfl_89_idx ;
      cmbMbod_AlmModDestino.setInternalname( "MBOD_ALMMODDESTINO_"+sGXsfl_89_idx );
      edtMbod_AlmDestinoCodigo_Internalname = "MBOD_ALMDESTINOCODIGO_"+sGXsfl_89_idx ;
      edtMbod_BodDestinoCodigo_Internalname = "MBOD_BODDESTINOCODIGO_"+sGXsfl_89_idx ;
      edtMbod_BodDestinoDescripcion_Internalname = "MBOD_BODDESTINODESCRIPCION_"+sGXsfl_89_idx ;
      cmbMbod_Estado.setInternalname( "MBOD_ESTADO_"+sGXsfl_89_idx );
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_89_idx ;
   }

   public void subsflControlProps_fel_892( )
   {
      edtMbod_Id_Internalname = "MBOD_ID_"+sGXsfl_89_fel_idx ;
      edtMbod_TipoMovCodigo_Internalname = "MBOD_TIPOMOVCODIGO_"+sGXsfl_89_fel_idx ;
      edtMbod_TipoMovDescrip_Internalname = "MBOD_TIPOMOVDESCRIP_"+sGXsfl_89_fel_idx ;
      edtMbod_TipoElementoCod_Internalname = "MBOD_TIPOELEMENTOCOD_"+sGXsfl_89_fel_idx ;
      edtMbod_TipoElementoDesc_Internalname = "MBOD_TIPOELEMENTODESC_"+sGXsfl_89_fel_idx ;
      edtMbod_RegionId_Internalname = "MBOD_REGIONID_"+sGXsfl_89_fel_idx ;
      edtMbod_RegionCodigo_Internalname = "MBOD_REGIONCODIGO_"+sGXsfl_89_fel_idx ;
      edtMbod_RegionDescripcion_Internalname = "MBOD_REGIONDESCRIPCION_"+sGXsfl_89_fel_idx ;
      edtMbod_CentCostoId_Internalname = "MBOD_CENTCOSTOID_"+sGXsfl_89_fel_idx ;
      edtMbod_CentCostoCodigo_Internalname = "MBOD_CENTCOSTOCODIGO_"+sGXsfl_89_fel_idx ;
      edtMbod_CentroCostoDescrip_Internalname = "MBOD_CENTROCOSTODESCRIP_"+sGXsfl_89_fel_idx ;
      cmbMbod_AlmModOrigen.setInternalname( "MBOD_ALMMODORIGEN_"+sGXsfl_89_fel_idx );
      edtMbod_AlmOrigenCodigo_Internalname = "MBOD_ALMORIGENCODIGO_"+sGXsfl_89_fel_idx ;
      edtMbod_BodOrigenCodigo_Internalname = "MBOD_BODORIGENCODIGO_"+sGXsfl_89_fel_idx ;
      edtMbod_BodOrigenDescripcion_Internalname = "MBOD_BODORIGENDESCRIPCION_"+sGXsfl_89_fel_idx ;
      cmbMbod_AlmModDestino.setInternalname( "MBOD_ALMMODDESTINO_"+sGXsfl_89_fel_idx );
      edtMbod_AlmDestinoCodigo_Internalname = "MBOD_ALMDESTINOCODIGO_"+sGXsfl_89_fel_idx ;
      edtMbod_BodDestinoCodigo_Internalname = "MBOD_BODDESTINOCODIGO_"+sGXsfl_89_fel_idx ;
      edtMbod_BodDestinoDescripcion_Internalname = "MBOD_BODDESTINODESCRIPCION_"+sGXsfl_89_fel_idx ;
      cmbMbod_Estado.setInternalname( "MBOD_ESTADO_"+sGXsfl_89_fel_idx );
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_89_fel_idx ;
   }

   public void sendrow_892( )
   {
      subsflControlProps_892( ) ;
      wb120( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_89_idx <= subgrid_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_89_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_89_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A60Mbod_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A60Mbod_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_TipoMovCodigo_Internalname,A61Mbod_TipoMovCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_TipoMovCodigo_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_TipoMovDescrip_Internalname,A428Mbod_TipoMovDescrip,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_TipoMovDescrip_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_TipoElementoCod_Internalname,GXutil.ltrim( localUtil.ntoc( A431Mbod_TipoElementoCod, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A431Mbod_TipoElementoCod), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_TipoElementoCod_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_TipoElementoDesc_Internalname,A432Mbod_TipoElementoDesc,GXutil.rtrim( localUtil.format( A432Mbod_TipoElementoDesc, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_TipoElementoDesc_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_RegionId_Internalname,GXutil.ltrim( localUtil.ntoc( A62Mbod_RegionId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A62Mbod_RegionId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_RegionId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_RegionCodigo_Internalname,GXutil.ltrim( localUtil.ntoc( A426Mbod_RegionCodigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A426Mbod_RegionCodigo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_RegionCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_RegionDescripcion_Internalname,A427Mbod_RegionDescripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_RegionDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_CentCostoId_Internalname,GXutil.ltrim( localUtil.ntoc( A63Mbod_CentCostoId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A63Mbod_CentCostoId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_CentCostoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_CentCostoCodigo_Internalname,A429Mbod_CentCostoCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_CentCostoCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_CentroCostoDescrip_Internalname,A430Mbod_CentroCostoDescrip,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_CentroCostoDescrip_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_89_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "MBOD_ALMMODORIGEN_" + sGXsfl_89_idx ;
            cmbMbod_AlmModOrigen.setName( GXCCtl );
            cmbMbod_AlmModOrigen.setWebtags( "" );
            cmbMbod_AlmModOrigen.addItem("ALMA", "ALMACEN", (short)(0));
            cmbMbod_AlmModOrigen.addItem("INVE", "INVENTARIO", (short)(0));
            cmbMbod_AlmModOrigen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            if ( cmbMbod_AlmModOrigen.getItemCount() > 0 )
            {
               A364Mbod_AlmModOrigen = cmbMbod_AlmModOrigen.getValidValue(A364Mbod_AlmModOrigen) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMbod_AlmModOrigen,cmbMbod_AlmModOrigen.getInternalname(),GXutil.rtrim( A364Mbod_AlmModOrigen),new Integer(1),cmbMbod_AlmModOrigen.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbMbod_AlmModOrigen.setValue( GXutil.rtrim( A364Mbod_AlmModOrigen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMbod_AlmModOrigen.getInternalname(), "Values", cmbMbod_AlmModOrigen.ToJavascriptSource(), !bGXsfl_89_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_AlmOrigenCodigo_Internalname,A342Mbod_AlmOrigenCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_AlmOrigenCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_BodOrigenCodigo_Internalname,A64Mbod_BodOrigenCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_BodOrigenCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_BodOrigenDescripcion_Internalname,A341Mbod_BodOrigenDescripcion,GXutil.rtrim( localUtil.format( A341Mbod_BodOrigenDescripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_BodOrigenDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_89_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "MBOD_ALMMODDESTINO_" + sGXsfl_89_idx ;
            cmbMbod_AlmModDestino.setName( GXCCtl );
            cmbMbod_AlmModDestino.setWebtags( "" );
            cmbMbod_AlmModDestino.addItem("ALMA", "ALMACEN", (short)(0));
            cmbMbod_AlmModDestino.addItem("INVE", "INVENTARIO", (short)(0));
            cmbMbod_AlmModDestino.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            if ( cmbMbod_AlmModDestino.getItemCount() > 0 )
            {
               A368Mbod_AlmModDestino = cmbMbod_AlmModDestino.getValidValue(A368Mbod_AlmModDestino) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMbod_AlmModDestino,cmbMbod_AlmModDestino.getInternalname(),GXutil.rtrim( A368Mbod_AlmModDestino),new Integer(1),cmbMbod_AlmModDestino.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbMbod_AlmModDestino.setValue( GXutil.rtrim( A368Mbod_AlmModDestino) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMbod_AlmModDestino.getInternalname(), "Values", cmbMbod_AlmModDestino.ToJavascriptSource(), !bGXsfl_89_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_AlmDestinoCodigo_Internalname,A345Mbod_AlmDestinoCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_AlmDestinoCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_BodDestinoCodigo_Internalname,A65Mbod_BodDestinoCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_BodDestinoCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMbod_BodDestinoDescripcion_Internalname,A347Mbod_BodDestinoDescripcion,GXutil.rtrim( localUtil.format( A347Mbod_BodDestinoDescripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMbod_BodDestinoDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(89),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_89_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "MBOD_ESTADO_" + sGXsfl_89_idx ;
            cmbMbod_Estado.setName( GXCCtl );
            cmbMbod_Estado.setWebtags( "" );
            cmbMbod_Estado.addItem("A", "Activo", (short)(0));
            cmbMbod_Estado.addItem("I", "Inactivo", (short)(0));
            if ( cmbMbod_Estado.getItemCount() > 0 )
            {
               A434Mbod_Estado = cmbMbod_Estado.getValidValue(A434Mbod_Estado) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMbod_Estado,cmbMbod_Estado.getInternalname(),GXutil.rtrim( A434Mbod_Estado),new Integer(1),cmbMbod_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbMbod_Estado.setValue( GXutil.rtrim( A434Mbod_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMbod_Estado.getInternalname(), "Values", cmbMbod_Estado.ToJavascriptSource(), !bGXsfl_89_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV21Update_IsBlob = (boolean)(((GXutil.strcmp("", AV21Update)==0)&&(GXutil.strcmp("", AV26Update_GXI)==0))||!(GXutil.strcmp("", AV21Update)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV21Update)==0) ? AV26Update_GXI : httpContext.getResourceRelative(AV21Update)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,sImgUrl,edtavUpdate_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavUpdate_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV21Update_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_ID"+"_"+sGXsfl_89_idx, getSecureSignedToken( sGXsfl_89_idx, localUtil.format( DecimalUtil.doubleToDec(A60Mbod_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_TIPOMOVCODIGO"+"_"+sGXsfl_89_idx, getSecureSignedToken( sGXsfl_89_idx, GXutil.rtrim( localUtil.format( A61Mbod_TipoMovCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_REGIONID"+"_"+sGXsfl_89_idx, getSecureSignedToken( sGXsfl_89_idx, localUtil.format( DecimalUtil.doubleToDec(A62Mbod_RegionId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_CENTCOSTOID"+"_"+sGXsfl_89_idx, getSecureSignedToken( sGXsfl_89_idx, localUtil.format( DecimalUtil.doubleToDec(A63Mbod_CentCostoId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_ALMMODORIGEN"+"_"+sGXsfl_89_idx, getSecureSignedToken( sGXsfl_89_idx, GXutil.rtrim( localUtil.format( A364Mbod_AlmModOrigen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_ALMORIGENCODIGO"+"_"+sGXsfl_89_idx, getSecureSignedToken( sGXsfl_89_idx, GXutil.rtrim( localUtil.format( A342Mbod_AlmOrigenCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_BODORIGENCODIGO"+"_"+sGXsfl_89_idx, getSecureSignedToken( sGXsfl_89_idx, GXutil.rtrim( localUtil.format( A64Mbod_BodOrigenCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_ALMMODDESTINO"+"_"+sGXsfl_89_idx, getSecureSignedToken( sGXsfl_89_idx, GXutil.rtrim( localUtil.format( A368Mbod_AlmModDestino, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_ALMDESTINOCODIGO"+"_"+sGXsfl_89_idx, getSecureSignedToken( sGXsfl_89_idx, GXutil.rtrim( localUtil.format( A345Mbod_AlmDestinoCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_BODDESTINOCODIGO"+"_"+sGXsfl_89_idx, getSecureSignedToken( sGXsfl_89_idx, GXutil.rtrim( localUtil.format( A65Mbod_BodDestinoCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_MBOD_ESTADO"+"_"+sGXsfl_89_idx, getSecureSignedToken( sGXsfl_89_idx, GXutil.rtrim( localUtil.format( A434Mbod_Estado, ""))));
         GridContainer.AddRow(GridRow);
         nGXsfl_89_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_89_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_89_idx+1)) ;
         sGXsfl_89_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_89_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_892( ) ;
      }
      /* End function sendrow_892 */
   }

   public void init_default_properties( )
   {
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      lblTitletext_Internalname = "TITLETEXT" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
      edtavMbod_tipomovcodigo_Internalname = "vMBOD_TIPOMOVCODIGO" ;
      divTabletop_Internalname = "TABLETOP" ;
      lblLblmbod_tipomovdescripfilter_Internalname = "LBLMBOD_TIPOMOVDESCRIPFILTER" ;
      edtavMbod_tipomovdescrip_Internalname = "vMBOD_TIPOMOVDESCRIP" ;
      divMbod_tipomovdescripfiltercontainer_Internalname = "MBOD_TIPOMOVDESCRIPFILTERCONTAINER" ;
      lblLblmbod_regioncodigofilter_Internalname = "LBLMBOD_REGIONCODIGOFILTER" ;
      edtavMbod_regioncodigo_Internalname = "vMBOD_REGIONCODIGO" ;
      divMbod_regioncodigofiltercontainer_Internalname = "MBOD_REGIONCODIGOFILTERCONTAINER" ;
      lblLblmbod_regiondescripcionfilter_Internalname = "LBLMBOD_REGIONDESCRIPCIONFILTER" ;
      edtavMbod_regiondescripcion_Internalname = "vMBOD_REGIONDESCRIPCION" ;
      divMbod_regiondescripcionfiltercontainer_Internalname = "MBOD_REGIONDESCRIPCIONFILTERCONTAINER" ;
      lblLblmbod_centcostocodigofilter_Internalname = "LBLMBOD_CENTCOSTOCODIGOFILTER" ;
      edtavMbod_centcostocodigo_Internalname = "vMBOD_CENTCOSTOCODIGO" ;
      divMbod_centcostocodigofiltercontainer_Internalname = "MBOD_CENTCOSTOCODIGOFILTERCONTAINER" ;
      lblLblmbod_centrocostodescripfilter_Internalname = "LBLMBOD_CENTROCOSTODESCRIPFILTER" ;
      edtavMbod_centrocostodescrip_Internalname = "vMBOD_CENTROCOSTODESCRIP" ;
      divMbod_centrocostodescripfiltercontainer_Internalname = "MBOD_CENTROCOSTODESCRIPFILTERCONTAINER" ;
      lblLblmbod_estadofilter_Internalname = "LBLMBOD_ESTADOFILTER" ;
      cmbavMbod_estado.setInternalname( "vMBOD_ESTADO" );
      divMbod_estadofiltercontainer_Internalname = "MBOD_ESTADOFILTERCONTAINER" ;
      divFilterscontainer_Internalname = "FILTERSCONTAINER" ;
      edtMbod_Id_Internalname = "MBOD_ID" ;
      edtMbod_TipoMovCodigo_Internalname = "MBOD_TIPOMOVCODIGO" ;
      edtMbod_TipoMovDescrip_Internalname = "MBOD_TIPOMOVDESCRIP" ;
      edtMbod_TipoElementoCod_Internalname = "MBOD_TIPOELEMENTOCOD" ;
      edtMbod_TipoElementoDesc_Internalname = "MBOD_TIPOELEMENTODESC" ;
      edtMbod_RegionId_Internalname = "MBOD_REGIONID" ;
      edtMbod_RegionCodigo_Internalname = "MBOD_REGIONCODIGO" ;
      edtMbod_RegionDescripcion_Internalname = "MBOD_REGIONDESCRIPCION" ;
      edtMbod_CentCostoId_Internalname = "MBOD_CENTCOSTOID" ;
      edtMbod_CentCostoCodigo_Internalname = "MBOD_CENTCOSTOCODIGO" ;
      edtMbod_CentroCostoDescrip_Internalname = "MBOD_CENTROCOSTODESCRIP" ;
      cmbMbod_AlmModOrigen.setInternalname( "MBOD_ALMMODORIGEN" );
      edtMbod_AlmOrigenCodigo_Internalname = "MBOD_ALMORIGENCODIGO" ;
      edtMbod_BodOrigenCodigo_Internalname = "MBOD_BODORIGENCODIGO" ;
      edtMbod_BodOrigenDescripcion_Internalname = "MBOD_BODORIGENDESCRIPCION" ;
      cmbMbod_AlmModDestino.setInternalname( "MBOD_ALMMODDESTINO" );
      edtMbod_AlmDestinoCodigo_Internalname = "MBOD_ALMDESTINOCODIGO" ;
      edtMbod_BodDestinoCodigo_Internalname = "MBOD_BODDESTINOCODIGO" ;
      edtMbod_BodDestinoDescripcion_Internalname = "MBOD_BODDESTINODESCRIPCION" ;
      cmbMbod_Estado.setInternalname( "MBOD_ESTADO" );
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
      cmbMbod_Estado.setJsonclick( "" );
      edtMbod_BodDestinoDescripcion_Jsonclick = "" ;
      edtMbod_BodDestinoCodigo_Jsonclick = "" ;
      edtMbod_AlmDestinoCodigo_Jsonclick = "" ;
      cmbMbod_AlmModDestino.setJsonclick( "" );
      edtMbod_BodOrigenDescripcion_Jsonclick = "" ;
      edtMbod_BodOrigenCodigo_Jsonclick = "" ;
      edtMbod_AlmOrigenCodigo_Jsonclick = "" ;
      cmbMbod_AlmModOrigen.setJsonclick( "" );
      edtMbod_CentroCostoDescrip_Jsonclick = "" ;
      edtMbod_CentCostoCodigo_Jsonclick = "" ;
      edtMbod_CentCostoId_Jsonclick = "" ;
      edtMbod_RegionDescripcion_Jsonclick = "" ;
      edtMbod_RegionCodigo_Jsonclick = "" ;
      edtMbod_RegionId_Jsonclick = "" ;
      edtMbod_TipoElementoDesc_Jsonclick = "" ;
      edtMbod_TipoElementoCod_Jsonclick = "" ;
      edtMbod_TipoMovDescrip_Jsonclick = "" ;
      edtMbod_TipoMovCodigo_Jsonclick = "" ;
      edtMbod_Id_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavUpdate_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divGridcell_Class = "col-xs-12 col-sm-9 col-md-10 WWGridCell" ;
      cmbavMbod_estado.setJsonclick( "" );
      cmbavMbod_estado.setEnabled( 1 );
      cmbavMbod_estado.setVisible( 1 );
      lblLblmbod_estadofilter_Caption = "Estado" ;
      edtavMbod_centrocostodescrip_Jsonclick = "" ;
      edtavMbod_centrocostodescrip_Enabled = 1 ;
      edtavMbod_centrocostodescrip_Visible = 1 ;
      lblLblmbod_centrocostodescripfilter_Caption = "Descrip. C.C." ;
      edtavMbod_centcostocodigo_Jsonclick = "" ;
      edtavMbod_centcostocodigo_Enabled = 1 ;
      edtavMbod_centcostocodigo_Visible = 1 ;
      lblLblmbod_centcostocodigofilter_Caption = "Código C.C." ;
      edtavMbod_regiondescripcion_Jsonclick = "" ;
      edtavMbod_regiondescripcion_Enabled = 1 ;
      edtavMbod_regiondescripcion_Visible = 1 ;
      lblLblmbod_regiondescripcionfilter_Caption = "Descrip. Regional" ;
      edtavMbod_regioncodigo_Jsonclick = "" ;
      edtavMbod_regioncodigo_Enabled = 1 ;
      edtavMbod_regioncodigo_Visible = 1 ;
      lblLblmbod_regioncodigofilter_Caption = "Código Regional" ;
      edtavMbod_tipomovdescrip_Jsonclick = "" ;
      edtavMbod_tipomovdescrip_Enabled = 1 ;
      edtavMbod_tipomovdescrip_Visible = 1 ;
      lblLblmbod_tipomovdescripfilter_Caption = "Tipo Movimiento" ;
      edtavMbod_tipomovcodigo_Jsonclick = "" ;
      edtavMbod_tipomovcodigo_Enabled = 1 ;
      bttBtntoggle_Class = "HideFiltersButton" ;
      bttBtntoggle_Caption = "Otros Filtros" ;
      divMbod_estadofiltercontainer_Class = "AdvancedContainerItem" ;
      divMbod_centrocostodescripfiltercontainer_Class = "AdvancedContainerItem" ;
      divMbod_centcostocodigofiltercontainer_Class = "AdvancedContainerItem" ;
      divMbod_regiondescripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divMbod_regioncodigofiltercontainer_Class = "AdvancedContainerItem" ;
      divMbod_tipomovdescripfiltercontainer_Class = "AdvancedContainerItem" ;
      divFilterscontainer_Class = "AdvancedContainer" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Restricciones" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV21Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Mbod_TipoMovDescrip',fld:'vMBOD_TIPOMOVDESCRIP',pic:'',nv:''},{av:'AV22ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV17Mbod_RegionDescripcion',fld:'vMBOD_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'AV19Mbod_CentroCostoDescrip',fld:'vMBOD_CENTROCOSTODESCRIP',pic:'',nv:''},{av:'cmbavMbod_estado'},{av:'AV20Mbod_Estado',fld:'vMBOD_ESTADO',pic:'',nv:''},{av:'AV25Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Mbod_TipoMovCodigo',fld:'vMBOD_TIPOMOVCODIGO',pic:'',nv:''}],oparms:[{av:'lblLblmbod_tipomovdescripfilter_Caption',ctrl:'LBLMBOD_TIPOMOVDESCRIPFILTER',prop:'Caption'},{av:'lblLblmbod_regioncodigofilter_Caption',ctrl:'LBLMBOD_REGIONCODIGOFILTER',prop:'Caption'},{av:'lblLblmbod_regiondescripcionfilter_Caption',ctrl:'LBLMBOD_REGIONDESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblmbod_centcostocodigofilter_Caption',ctrl:'LBLMBOD_CENTCOSTOCODIGOFILTER',prop:'Caption'},{av:'lblLblmbod_centrocostodescripfilter_Caption',ctrl:'LBLMBOD_CENTROCOSTODESCRIPFILTER',prop:'Caption'},{av:'lblLblmbod_estadofilter_Caption',ctrl:'LBLMBOD_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("'TOGGLE'","{handler:'e11121',iparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'}],oparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Caption'},{av:'divGridcell_Class',ctrl:'GRIDCELL',prop:'Class'}]}");
      setEventMetadata("LBLMBOD_TIPOMOVDESCRIPFILTER.CLICK","{handler:'e12121',iparms:[{av:'divMbod_tipomovdescripfiltercontainer_Class',ctrl:'MBOD_TIPOMOVDESCRIPFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divMbod_tipomovdescripfiltercontainer_Class',ctrl:'MBOD_TIPOMOVDESCRIPFILTERCONTAINER',prop:'Class'},{av:'edtavMbod_tipomovdescrip_Visible',ctrl:'vMBOD_TIPOMOVDESCRIP',prop:'Visible'}]}");
      setEventMetadata("LBLMBOD_REGIONCODIGOFILTER.CLICK","{handler:'e13121',iparms:[{av:'divMbod_regioncodigofiltercontainer_Class',ctrl:'MBOD_REGIONCODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divMbod_regioncodigofiltercontainer_Class',ctrl:'MBOD_REGIONCODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavMbod_regioncodigo_Visible',ctrl:'vMBOD_REGIONCODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLMBOD_REGIONDESCRIPCIONFILTER.CLICK","{handler:'e14121',iparms:[{av:'divMbod_regiondescripcionfiltercontainer_Class',ctrl:'MBOD_REGIONDESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divMbod_regiondescripcionfiltercontainer_Class',ctrl:'MBOD_REGIONDESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavMbod_regiondescripcion_Visible',ctrl:'vMBOD_REGIONDESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLMBOD_CENTCOSTOCODIGOFILTER.CLICK","{handler:'e15121',iparms:[{av:'divMbod_centcostocodigofiltercontainer_Class',ctrl:'MBOD_CENTCOSTOCODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divMbod_centcostocodigofiltercontainer_Class',ctrl:'MBOD_CENTCOSTOCODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavMbod_centcostocodigo_Visible',ctrl:'vMBOD_CENTCOSTOCODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLMBOD_CENTROCOSTODESCRIPFILTER.CLICK","{handler:'e16121',iparms:[{av:'divMbod_centrocostodescripfiltercontainer_Class',ctrl:'MBOD_CENTROCOSTODESCRIPFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divMbod_centrocostodescripfiltercontainer_Class',ctrl:'MBOD_CENTROCOSTODESCRIPFILTERCONTAINER',prop:'Class'},{av:'edtavMbod_centrocostodescrip_Visible',ctrl:'vMBOD_CENTROCOSTODESCRIP',prop:'Visible'}]}");
      setEventMetadata("LBLMBOD_ESTADOFILTER.CLICK","{handler:'e17121',iparms:[{av:'divMbod_estadofiltercontainer_Class',ctrl:'MBOD_ESTADOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divMbod_estadofiltercontainer_Class',ctrl:'MBOD_ESTADOFILTERCONTAINER',prop:'Class'},{av:'cmbavMbod_estado'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21122',iparms:[{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'edtavUpdate_Link',ctrl:'vUPDATE',prop:'Link'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e18122',iparms:[{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV21Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Mbod_TipoMovDescrip',fld:'vMBOD_TIPOMOVDESCRIP',pic:'',nv:''},{av:'AV22ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV17Mbod_RegionDescripcion',fld:'vMBOD_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'AV19Mbod_CentroCostoDescrip',fld:'vMBOD_CENTROCOSTODESCRIP',pic:'',nv:''},{av:'cmbavMbod_estado'},{av:'AV20Mbod_Estado',fld:'vMBOD_ESTADO',pic:'',nv:''},{av:'AV25Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Mbod_TipoMovCodigo',fld:'vMBOD_TIPOMOVCODIGO',pic:'',nv:''}],oparms:[{av:'lblLblmbod_tipomovdescripfilter_Caption',ctrl:'LBLMBOD_TIPOMOVDESCRIPFILTER',prop:'Caption'},{av:'lblLblmbod_regioncodigofilter_Caption',ctrl:'LBLMBOD_REGIONCODIGOFILTER',prop:'Caption'},{av:'lblLblmbod_regiondescripcionfilter_Caption',ctrl:'LBLMBOD_REGIONDESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblmbod_centcostocodigofilter_Caption',ctrl:'LBLMBOD_CENTCOSTOCODIGOFILTER',prop:'Caption'},{av:'lblLblmbod_centrocostodescripfilter_Caption',ctrl:'LBLMBOD_CENTROCOSTODESCRIPFILTER',prop:'Caption'},{av:'lblLblmbod_estadofilter_Caption',ctrl:'LBLMBOD_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV21Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Mbod_TipoMovDescrip',fld:'vMBOD_TIPOMOVDESCRIP',pic:'',nv:''},{av:'AV22ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV17Mbod_RegionDescripcion',fld:'vMBOD_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'AV19Mbod_CentroCostoDescrip',fld:'vMBOD_CENTROCOSTODESCRIP',pic:'',nv:''},{av:'cmbavMbod_estado'},{av:'AV20Mbod_Estado',fld:'vMBOD_ESTADO',pic:'',nv:''},{av:'AV25Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Mbod_TipoMovCodigo',fld:'vMBOD_TIPOMOVCODIGO',pic:'',nv:''}],oparms:[{av:'lblLblmbod_tipomovdescripfilter_Caption',ctrl:'LBLMBOD_TIPOMOVDESCRIPFILTER',prop:'Caption'},{av:'lblLblmbod_regioncodigofilter_Caption',ctrl:'LBLMBOD_REGIONCODIGOFILTER',prop:'Caption'},{av:'lblLblmbod_regiondescripcionfilter_Caption',ctrl:'LBLMBOD_REGIONDESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblmbod_centcostocodigofilter_Caption',ctrl:'LBLMBOD_CENTCOSTOCODIGOFILTER',prop:'Caption'},{av:'lblLblmbod_centrocostodescripfilter_Caption',ctrl:'LBLMBOD_CENTROCOSTODESCRIPFILTER',prop:'Caption'},{av:'lblLblmbod_estadofilter_Caption',ctrl:'LBLMBOD_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV21Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Mbod_TipoMovDescrip',fld:'vMBOD_TIPOMOVDESCRIP',pic:'',nv:''},{av:'AV22ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV17Mbod_RegionDescripcion',fld:'vMBOD_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'AV19Mbod_CentroCostoDescrip',fld:'vMBOD_CENTROCOSTODESCRIP',pic:'',nv:''},{av:'cmbavMbod_estado'},{av:'AV20Mbod_Estado',fld:'vMBOD_ESTADO',pic:'',nv:''},{av:'AV25Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Mbod_TipoMovCodigo',fld:'vMBOD_TIPOMOVCODIGO',pic:'',nv:''}],oparms:[{av:'lblLblmbod_tipomovdescripfilter_Caption',ctrl:'LBLMBOD_TIPOMOVDESCRIPFILTER',prop:'Caption'},{av:'lblLblmbod_regioncodigofilter_Caption',ctrl:'LBLMBOD_REGIONCODIGOFILTER',prop:'Caption'},{av:'lblLblmbod_regiondescripcionfilter_Caption',ctrl:'LBLMBOD_REGIONDESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblmbod_centcostocodigofilter_Caption',ctrl:'LBLMBOD_CENTCOSTOCODIGOFILTER',prop:'Caption'},{av:'lblLblmbod_centrocostodescripfilter_Caption',ctrl:'LBLMBOD_CENTROCOSTODESCRIPFILTER',prop:'Caption'},{av:'lblLblmbod_estadofilter_Caption',ctrl:'LBLMBOD_ESTADOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV21Update',fld:'vUPDATE',pic:'',nv:''},{av:'edtavUpdate_Tooltiptext',ctrl:'vUPDATE',prop:'Tooltiptext'},{av:'A60Mbod_Id',fld:'MBOD_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV15Mbod_TipoMovDescrip',fld:'vMBOD_TIPOMOVDESCRIP',pic:'',nv:''},{av:'AV22ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV16Mbod_RegionCodigo',fld:'vMBOD_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV17Mbod_RegionDescripcion',fld:'vMBOD_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV18Mbod_CentCostoCodigo',fld:'vMBOD_CENTCOSTOCODIGO',pic:'',nv:''},{av:'AV19Mbod_CentroCostoDescrip',fld:'vMBOD_CENTROCOSTODESCRIP',pic:'',nv:''},{av:'cmbavMbod_estado'},{av:'AV20Mbod_Estado',fld:'vMBOD_ESTADO',pic:'',nv:''},{av:'AV25Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV14Mbod_TipoMovCodigo',fld:'vMBOD_TIPOMOVCODIGO',pic:'',nv:''}],oparms:[{av:'lblLblmbod_tipomovdescripfilter_Caption',ctrl:'LBLMBOD_TIPOMOVDESCRIPFILTER',prop:'Caption'},{av:'lblLblmbod_regioncodigofilter_Caption',ctrl:'LBLMBOD_REGIONCODIGOFILTER',prop:'Caption'},{av:'lblLblmbod_regiondescripcionfilter_Caption',ctrl:'LBLMBOD_REGIONDESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblmbod_centcostocodigofilter_Caption',ctrl:'LBLMBOD_CENTCOSTOCODIGOFILTER',prop:'Caption'},{av:'lblLblmbod_centrocostodescripfilter_Caption',ctrl:'LBLMBOD_CENTROCOSTODESCRIPFILTER',prop:'Caption'},{av:'lblLblmbod_estadofilter_Caption',ctrl:'LBLMBOD_ESTADOFILTER',prop:'Caption'}]}");
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
      pr_default.close(1);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV21Update = "" ;
      AV14Mbod_TipoMovCodigo = "" ;
      AV15Mbod_TipoMovDescrip = "" ;
      AV17Mbod_RegionDescripcion = "" ;
      AV18Mbod_CentCostoCodigo = "" ;
      AV19Mbod_CentroCostoDescrip = "" ;
      AV20Mbod_Estado = "" ;
      AV22ADVANCED_LABEL_TEMPLATE = "" ;
      AV25Pgmname = "" ;
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
      lblLblmbod_tipomovdescripfilter_Jsonclick = "" ;
      lblLblmbod_regioncodigofilter_Jsonclick = "" ;
      lblLblmbod_regiondescripcionfilter_Jsonclick = "" ;
      lblLblmbod_centcostocodigofilter_Jsonclick = "" ;
      lblLblmbod_centrocostodescripfilter_Jsonclick = "" ;
      lblLblmbod_estadofilter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A61Mbod_TipoMovCodigo = "" ;
      A428Mbod_TipoMovDescrip = "" ;
      A432Mbod_TipoElementoDesc = "" ;
      A427Mbod_RegionDescripcion = "" ;
      A429Mbod_CentCostoCodigo = "" ;
      A430Mbod_CentroCostoDescrip = "" ;
      A364Mbod_AlmModOrigen = "" ;
      A342Mbod_AlmOrigenCodigo = "" ;
      A64Mbod_BodOrigenCodigo = "" ;
      A341Mbod_BodOrigenDescripcion = "" ;
      A368Mbod_AlmModDestino = "" ;
      A345Mbod_AlmDestinoCodigo = "" ;
      A65Mbod_BodDestinoCodigo = "" ;
      A347Mbod_BodDestinoDescripcion = "" ;
      A434Mbod_Estado = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV26Update_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV14Mbod_TipoMovCodigo = "" ;
      lV20Mbod_Estado = "" ;
      H00122_A434Mbod_Estado = new String[] {""} ;
      H00122_A65Mbod_BodDestinoCodigo = new String[] {""} ;
      H00122_A345Mbod_AlmDestinoCodigo = new String[] {""} ;
      H00122_A368Mbod_AlmModDestino = new String[] {""} ;
      H00122_A64Mbod_BodOrigenCodigo = new String[] {""} ;
      H00122_A342Mbod_AlmOrigenCodigo = new String[] {""} ;
      H00122_A364Mbod_AlmModOrigen = new String[] {""} ;
      H00122_A430Mbod_CentroCostoDescrip = new String[] {""} ;
      H00122_n430Mbod_CentroCostoDescrip = new boolean[] {false} ;
      H00122_A429Mbod_CentCostoCodigo = new String[] {""} ;
      H00122_n429Mbod_CentCostoCodigo = new boolean[] {false} ;
      H00122_A63Mbod_CentCostoId = new long[1] ;
      H00122_A427Mbod_RegionDescripcion = new String[] {""} ;
      H00122_n427Mbod_RegionDescripcion = new boolean[] {false} ;
      H00122_A426Mbod_RegionCodigo = new short[1] ;
      H00122_n426Mbod_RegionCodigo = new boolean[] {false} ;
      H00122_A62Mbod_RegionId = new long[1] ;
      H00122_A432Mbod_TipoElementoDesc = new String[] {""} ;
      H00122_n432Mbod_TipoElementoDesc = new boolean[] {false} ;
      H00122_A431Mbod_TipoElementoCod = new long[1] ;
      H00122_n431Mbod_TipoElementoCod = new boolean[] {false} ;
      H00122_A428Mbod_TipoMovDescrip = new String[] {""} ;
      H00122_n428Mbod_TipoMovDescrip = new boolean[] {false} ;
      H00122_A61Mbod_TipoMovCodigo = new String[] {""} ;
      H00122_A60Mbod_Id = new long[1] ;
      H00123_A31Bode_Codigo = new String[] {""} ;
      H00124_A31Bode_Codigo = new String[] {""} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_restricciones__default(),
         new Object[] {
             new Object[] {
            H00122_A434Mbod_Estado, H00122_A65Mbod_BodDestinoCodigo, H00122_A345Mbod_AlmDestinoCodigo, H00122_A368Mbod_AlmModDestino, H00122_A64Mbod_BodOrigenCodigo, H00122_A342Mbod_AlmOrigenCodigo, H00122_A364Mbod_AlmModOrigen, H00122_A430Mbod_CentroCostoDescrip, H00122_n430Mbod_CentroCostoDescrip, H00122_A429Mbod_CentCostoCodigo,
            H00122_n429Mbod_CentCostoCodigo, H00122_A63Mbod_CentCostoId, H00122_A427Mbod_RegionDescripcion, H00122_n427Mbod_RegionDescripcion, H00122_A426Mbod_RegionCodigo, H00122_n426Mbod_RegionCodigo, H00122_A62Mbod_RegionId, H00122_A432Mbod_TipoElementoDesc, H00122_n432Mbod_TipoElementoDesc, H00122_A431Mbod_TipoElementoCod,
            H00122_n431Mbod_TipoElementoCod, H00122_A428Mbod_TipoMovDescrip, H00122_n428Mbod_TipoMovDescrip, H00122_A61Mbod_TipoMovCodigo, H00122_A60Mbod_Id
            }
            , new Object[] {
            H00123_A31Bode_Codigo
            }
            , new Object[] {
            H00124_A31Bode_Codigo
            }
         }
      );
      AV25Pgmname = "WWALM_RESTRICCIONES" ;
      /* GeneXus formulas. */
      AV25Pgmname = "WWALM_RESTRICCIONES" ;
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
   private short nRC_GXsfl_89 ;
   private short nGXsfl_89_idx=1 ;
   private short AV16Mbod_RegionCodigo ;
   private short wbEnd ;
   private short wbStart ;
   private short A426Mbod_RegionCodigo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int edtavMbod_tipomovcodigo_Enabled ;
   private int edtavMbod_tipomovdescrip_Visible ;
   private int edtavMbod_tipomovdescrip_Enabled ;
   private int edtavMbod_regioncodigo_Enabled ;
   private int edtavMbod_regioncodigo_Visible ;
   private int edtavMbod_regiondescripcion_Visible ;
   private int edtavMbod_regiondescripcion_Enabled ;
   private int edtavMbod_centcostocodigo_Visible ;
   private int edtavMbod_centcostocodigo_Enabled ;
   private int edtavMbod_centrocostodescrip_Visible ;
   private int edtavMbod_centrocostodescrip_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int AV11GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long A60Mbod_Id ;
   private long GRID_nFirstRecordOnPage ;
   private long A431Mbod_TipoElementoCod ;
   private long A62Mbod_RegionId ;
   private long A63Mbod_CentCostoId ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String edtavUpdate_Tooltiptext ;
   private String divFilterscontainer_Class ;
   private String divMbod_tipomovdescripfiltercontainer_Class ;
   private String divMbod_regioncodigofiltercontainer_Class ;
   private String divMbod_regiondescripcionfiltercontainer_Class ;
   private String divMbod_centcostocodigofiltercontainer_Class ;
   private String divMbod_centrocostodescripfiltercontainer_Class ;
   private String divMbod_estadofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_89_idx="0001" ;
   private String edtavUpdate_Internalname ;
   private String AV20Mbod_Estado ;
   private String AV22ADVANCED_LABEL_TEMPLATE ;
   private String AV25Pgmname ;
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
   private String edtavMbod_tipomovcodigo_Internalname ;
   private String edtavMbod_tipomovcodigo_Jsonclick ;
   private String divFilterscontainer_Internalname ;
   private String divMbod_tipomovdescripfiltercontainer_Internalname ;
   private String lblLblmbod_tipomovdescripfilter_Internalname ;
   private String lblLblmbod_tipomovdescripfilter_Caption ;
   private String lblLblmbod_tipomovdescripfilter_Jsonclick ;
   private String edtavMbod_tipomovdescrip_Internalname ;
   private String edtavMbod_tipomovdescrip_Jsonclick ;
   private String divMbod_regioncodigofiltercontainer_Internalname ;
   private String lblLblmbod_regioncodigofilter_Internalname ;
   private String lblLblmbod_regioncodigofilter_Caption ;
   private String lblLblmbod_regioncodigofilter_Jsonclick ;
   private String edtavMbod_regioncodigo_Internalname ;
   private String edtavMbod_regioncodigo_Jsonclick ;
   private String divMbod_regiondescripcionfiltercontainer_Internalname ;
   private String lblLblmbod_regiondescripcionfilter_Internalname ;
   private String lblLblmbod_regiondescripcionfilter_Caption ;
   private String lblLblmbod_regiondescripcionfilter_Jsonclick ;
   private String edtavMbod_regiondescripcion_Internalname ;
   private String edtavMbod_regiondescripcion_Jsonclick ;
   private String divMbod_centcostocodigofiltercontainer_Internalname ;
   private String lblLblmbod_centcostocodigofilter_Internalname ;
   private String lblLblmbod_centcostocodigofilter_Caption ;
   private String lblLblmbod_centcostocodigofilter_Jsonclick ;
   private String edtavMbod_centcostocodigo_Internalname ;
   private String edtavMbod_centcostocodigo_Jsonclick ;
   private String divMbod_centrocostodescripfiltercontainer_Internalname ;
   private String lblLblmbod_centrocostodescripfilter_Internalname ;
   private String lblLblmbod_centrocostodescripfilter_Caption ;
   private String lblLblmbod_centrocostodescripfilter_Jsonclick ;
   private String edtavMbod_centrocostodescrip_Internalname ;
   private String edtavMbod_centrocostodescrip_Jsonclick ;
   private String divMbod_estadofiltercontainer_Internalname ;
   private String lblLblmbod_estadofilter_Internalname ;
   private String lblLblmbod_estadofilter_Caption ;
   private String lblLblmbod_estadofilter_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridcell_Class ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String A434Mbod_Estado ;
   private String edtavUpdate_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtMbod_Id_Internalname ;
   private String edtMbod_TipoMovCodigo_Internalname ;
   private String edtMbod_TipoMovDescrip_Internalname ;
   private String edtMbod_TipoElementoCod_Internalname ;
   private String edtMbod_TipoElementoDesc_Internalname ;
   private String edtMbod_RegionId_Internalname ;
   private String edtMbod_RegionCodigo_Internalname ;
   private String edtMbod_RegionDescripcion_Internalname ;
   private String edtMbod_CentCostoId_Internalname ;
   private String edtMbod_CentCostoCodigo_Internalname ;
   private String edtMbod_CentroCostoDescrip_Internalname ;
   private String edtMbod_AlmOrigenCodigo_Internalname ;
   private String edtMbod_BodOrigenCodigo_Internalname ;
   private String edtMbod_BodOrigenDescripcion_Internalname ;
   private String edtMbod_AlmDestinoCodigo_Internalname ;
   private String edtMbod_BodDestinoCodigo_Internalname ;
   private String edtMbod_BodDestinoDescripcion_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV20Mbod_Estado ;
   private String sGXsfl_89_fel_idx="0001" ;
   private String ROClassString ;
   private String edtMbod_Id_Jsonclick ;
   private String edtMbod_TipoMovCodigo_Jsonclick ;
   private String edtMbod_TipoMovDescrip_Jsonclick ;
   private String edtMbod_TipoElementoCod_Jsonclick ;
   private String edtMbod_TipoElementoDesc_Jsonclick ;
   private String edtMbod_RegionId_Jsonclick ;
   private String edtMbod_RegionCodigo_Jsonclick ;
   private String edtMbod_RegionDescripcion_Jsonclick ;
   private String edtMbod_CentCostoId_Jsonclick ;
   private String edtMbod_CentCostoCodigo_Jsonclick ;
   private String edtMbod_CentroCostoDescrip_Jsonclick ;
   private String edtMbod_AlmOrigenCodigo_Jsonclick ;
   private String edtMbod_BodOrigenCodigo_Jsonclick ;
   private String edtMbod_BodOrigenDescripcion_Jsonclick ;
   private String edtMbod_AlmDestinoCodigo_Jsonclick ;
   private String edtMbod_BodDestinoCodigo_Jsonclick ;
   private String edtMbod_BodDestinoDescripcion_Jsonclick ;
   private String sImgUrl ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_89_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n428Mbod_TipoMovDescrip ;
   private boolean n431Mbod_TipoElementoCod ;
   private boolean n432Mbod_TipoElementoDesc ;
   private boolean n426Mbod_RegionCodigo ;
   private boolean n427Mbod_RegionDescripcion ;
   private boolean n429Mbod_CentCostoCodigo ;
   private boolean n430Mbod_CentroCostoDescrip ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV21Update_IsBlob ;
   private String AV14Mbod_TipoMovCodigo ;
   private String AV15Mbod_TipoMovDescrip ;
   private String AV17Mbod_RegionDescripcion ;
   private String AV18Mbod_CentCostoCodigo ;
   private String AV19Mbod_CentroCostoDescrip ;
   private String A61Mbod_TipoMovCodigo ;
   private String A428Mbod_TipoMovDescrip ;
   private String A432Mbod_TipoElementoDesc ;
   private String A427Mbod_RegionDescripcion ;
   private String A429Mbod_CentCostoCodigo ;
   private String A430Mbod_CentroCostoDescrip ;
   private String A364Mbod_AlmModOrigen ;
   private String A342Mbod_AlmOrigenCodigo ;
   private String A64Mbod_BodOrigenCodigo ;
   private String A341Mbod_BodOrigenDescripcion ;
   private String A368Mbod_AlmModDestino ;
   private String A345Mbod_AlmDestinoCodigo ;
   private String A65Mbod_BodDestinoCodigo ;
   private String A347Mbod_BodDestinoDescripcion ;
   private String AV26Update_GXI ;
   private String lV14Mbod_TipoMovCodigo ;
   private String AV21Update ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV8HTTPRequest ;
   private com.genexus.webpanels.WebSession AV7Session ;
   private HTMLChoice cmbavMbod_estado ;
   private HTMLChoice cmbMbod_AlmModOrigen ;
   private HTMLChoice cmbMbod_AlmModDestino ;
   private HTMLChoice cmbMbod_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H00122_A434Mbod_Estado ;
   private String[] H00122_A65Mbod_BodDestinoCodigo ;
   private String[] H00122_A345Mbod_AlmDestinoCodigo ;
   private String[] H00122_A368Mbod_AlmModDestino ;
   private String[] H00122_A64Mbod_BodOrigenCodigo ;
   private String[] H00122_A342Mbod_AlmOrigenCodigo ;
   private String[] H00122_A364Mbod_AlmModOrigen ;
   private String[] H00122_A430Mbod_CentroCostoDescrip ;
   private boolean[] H00122_n430Mbod_CentroCostoDescrip ;
   private String[] H00122_A429Mbod_CentCostoCodigo ;
   private boolean[] H00122_n429Mbod_CentCostoCodigo ;
   private long[] H00122_A63Mbod_CentCostoId ;
   private String[] H00122_A427Mbod_RegionDescripcion ;
   private boolean[] H00122_n427Mbod_RegionDescripcion ;
   private short[] H00122_A426Mbod_RegionCodigo ;
   private boolean[] H00122_n426Mbod_RegionCodigo ;
   private long[] H00122_A62Mbod_RegionId ;
   private String[] H00122_A432Mbod_TipoElementoDesc ;
   private boolean[] H00122_n432Mbod_TipoElementoDesc ;
   private long[] H00122_A431Mbod_TipoElementoCod ;
   private boolean[] H00122_n431Mbod_TipoElementoCod ;
   private String[] H00122_A428Mbod_TipoMovDescrip ;
   private boolean[] H00122_n428Mbod_TipoMovDescrip ;
   private String[] H00122_A61Mbod_TipoMovCodigo ;
   private long[] H00122_A60Mbod_Id ;
   private String[] H00123_A31Bode_Codigo ;
   private String[] H00124_A31Bode_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV9GridState ;
   private com.orions2.SdtGridState_FilterValue AV10GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV12TrnContext ;
}

final  class wwalm_restricciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00122( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV14Mbod_TipoMovCodigo ,
                                          short AV16Mbod_RegionCodigo ,
                                          String AV20Mbod_Estado ,
                                          String A61Mbod_TipoMovCodigo ,
                                          short A426Mbod_RegionCodigo ,
                                          String A434Mbod_Estado ,
                                          String AV15Mbod_TipoMovDescrip ,
                                          String A428Mbod_TipoMovDescrip ,
                                          String AV17Mbod_RegionDescripcion ,
                                          String A427Mbod_RegionDescripcion ,
                                          String AV18Mbod_CentCostoCodigo ,
                                          String A429Mbod_CentCostoCodigo ,
                                          String AV19Mbod_CentroCostoDescrip ,
                                          String A430Mbod_CentroCostoDescrip )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [3] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      scmdbuf = "SELECT T1.Mbod_Estado, T1.Mbod_BodDestinoCodigo, T1.Mbod_AlmDestinoCodigo, T1.Mbod_AlmModDestino," ;
      scmdbuf = scmdbuf + " T1.Mbod_BodOrigenCodigo, T1.Mbod_AlmOrigenCodigo, T1.Mbod_AlmModOrigen, T2.Cent_Descripcion" ;
      scmdbuf = scmdbuf + " AS Mbod_CentroCostoDescrip, T2.Cent_Codigo AS Mbod_CentCostoCodigo, T1.Mbod_CentCostoId" ;
      scmdbuf = scmdbuf + " AS Mbod_CentCostoId, T3.Regi_Descripcion AS Mbod_RegionDescripcion, T3.Regi_Cod" ;
      scmdbuf = scmdbuf + " AS Mbod_RegionCodigo, T1.Mbod_RegionId AS Mbod_RegionId, T5.Tipo_Descripcion AS" ;
      scmdbuf = scmdbuf + " Mbod_TipoElementoDesc, T4.Tipo_Codigo AS Mbod_TipoElementoCod, T4.Tpmo_Descripcion" ;
      scmdbuf = scmdbuf + " AS Mbod_TipoMovDescrip, T1.Mbod_TipoMovCodigo AS Mbod_TipoMovCodigo, T1.Mbod_Id" ;
      scmdbuf = scmdbuf + " FROM ((((ALM_RESTRICCIONES T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Mbod_CentCostoId)" ;
      scmdbuf = scmdbuf + " INNER JOIN GEN_REGIONAL T3 ON T3.Regi_Id = T1.Mbod_RegionId) INNER JOIN ALM_TIPO_MOVIMIENTO" ;
      scmdbuf = scmdbuf + " T4 ON T4.Tpmo_Codigo = T1.Mbod_TipoMovCodigo) LEFT JOIN ALM_TIPO_ELEMENTO T5 ON" ;
      scmdbuf = scmdbuf + " T5.Tipo_Codigo = T4.Tipo_Codigo)" ;
      if ( ! (GXutil.strcmp("", AV14Mbod_TipoMovCodigo)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Mbod_TipoMovCodigo like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Mbod_TipoMovCodigo like ?)" ;
         }
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (0==AV16Mbod_RegionCodigo) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T3.Regi_Cod = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T3.Regi_Cod = ?)" ;
         }
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV20Mbod_Estado)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Mbod_Estado like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Mbod_Estado like ?)" ;
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
      scmdbuf = scmdbuf + " ORDER BY T1.Mbod_TipoMovCodigo" ;
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
                  return conditional_H00122(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00122", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H00123", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H00124", "SELECT Bode_Codigo FROM ALM_BODEGA WHERE Bode_Codigo = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(10) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(13) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((long[]) buf[19])[0] = rslt.getLong(15) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(17) ;
               ((long[]) buf[24])[0] = rslt.getLong(18) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
                  stmt.setVarchar(sIdx, (String)parms[3], 3);
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
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
      }
   }

}

