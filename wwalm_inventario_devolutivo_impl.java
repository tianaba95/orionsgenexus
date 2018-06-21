/*
               File: wwalm_inventario_devolutivo_impl
        Description: Work With Inventario devolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:19:7.54
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

public final  class wwalm_inventario_devolutivo_impl extends GXDataArea
{
   public wwalm_inventario_devolutivo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_inventario_devolutivo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_inventario_devolutivo_impl.class ));
   }

   public wwalm_inventario_devolutivo_impl( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbInvd_ModuloAlmacen = new HTMLChoice();
      cmbInvd_Estado = new HTMLChoice();
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
            nRC_GXsfl_95 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_95_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_95_idx = httpContext.GetNextPar( ) ;
            AV10Display = httpContext.GetNextPar( ) ;
            edtavDisplay_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Tooltiptext", edtavDisplay_Tooltiptext, !bGXsfl_95_Refreshing);
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
            AV16Invd_NumeroPlaca = httpContext.GetNextPar( ) ;
            AV11Elem_Consecutivo = httpContext.GetNextPar( ) ;
            AV6Cata_Descripcion = httpContext.GetNextPar( ) ;
            AV9Cuen_Nombre = httpContext.GetNextPar( ) ;
            AV8Cuen_Cedula = GXutil.lval( httpContext.GetNextPar( )) ;
            AV10Display = httpContext.GetNextPar( ) ;
            edtavDisplay_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Tooltiptext", edtavDisplay_Tooltiptext, !bGXsfl_95_Refreshing);
            AV5ADVANCED_LABEL_TEMPLATE = httpContext.GetNextPar( ) ;
            AV21cMarca = httpContext.GetNextPar( ) ;
            AV22cModelo = httpContext.GetNextPar( ) ;
            AV23cSerial = httpContext.GetNextPar( ) ;
            AV33Pgmname = httpContext.GetNextPar( ) ;
            A67Invd_NumeroPlaca = httpContext.GetNextPar( ) ;
            AV24Marca = httpContext.GetNextPar( ) ;
            AV25Modelo = httpContext.GetNextPar( ) ;
            AV26Serial = httpContext.GetNextPar( ) ;
            AV29Observaciones = httpContext.GetNextPar( ) ;
            AV30Tran_IdEntrada = GXutil.lval( httpContext.GetNextPar( )) ;
            AV28Nro_Linea = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV16Invd_NumeroPlaca, AV11Elem_Consecutivo, AV6Cata_Descripcion, AV9Cuen_Nombre, AV8Cuen_Cedula, AV10Display, AV5ADVANCED_LABEL_TEMPLATE, AV21cMarca, AV22cModelo, AV23cSerial, AV33Pgmname, A67Invd_NumeroPlaca, AV24Marca, AV25Modelo, AV26Serial, AV29Observaciones, AV30Tran_IdEntrada, AV28Nro_Linea) ;
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
      pa2C2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2C2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141419775");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_inventario_devolutivo") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vINVD_NUMEROPLACA", AV16Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vELEM_CONSECUTIVO", AV11Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCATA_DESCRIPCION", AV6Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUEN_NOMBRE", AV9Cuen_Nombre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUEN_CEDULA", GXutil.ltrim( localUtil.ntoc( AV8Cuen_Cedula, (byte)(18), (byte)(0), ",", "")));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_95", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_95, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vADVANCED_LABEL_TEMPLATE", GXutil.rtrim( AV5ADVANCED_LABEL_TEMPLATE));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vOBSERVACIONES", AV29Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDENTRADA", GXutil.ltrim( localUtil.ntoc( AV30Tran_IdEntrada, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNRO_LINEA", GXutil.ltrim( localUtil.ntoc( AV28Nro_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vDISPLAY_Tooltiptext", GXutil.rtrim( edtavDisplay_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FILTERSCONTAINER_Class", GXutil.rtrim( divFilterscontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CONSECUTIVOFILTERCONTAINER_Class", GXutil.rtrim( divConsecutivofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divCata_descripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_NOMBREFILTERCONTAINER_Class", GXutil.rtrim( divCuen_nombrefiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_CEDULAFILTERCONTAINER_Class", GXutil.rtrim( divCuen_cedulafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_MARCAFILTERCONTAINER_Class", GXutil.rtrim( divInvd_marcafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_MODELOFILTERCONTAINER_Class", GXutil.rtrim( divInvd_modelofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_SERIALFILTERCONTAINER_Class", GXutil.rtrim( divInvd_serialfiltercontainer_Class));
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
         we2C2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2C2( ) ;
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
      return formatLink("com.orions2.wwalm_inventario_devolutivo")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_INVENTARIO_DEVOLUTIVO" ;
   }

   public String getPgmdesc( )
   {
      return "Work With Inventario devolutivo" ;
   }

   public void wb2C0( )
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 95, 2, 0)+","+"null"+");", bttBtntoggle_Caption, bttBtntoggle_Jsonclick, 7, "Ocultar Filtros", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112c1_client"+"'", TempTags, "", 2, "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Consulta Hoja de Vida", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4 col-sm-5 col-sm-push-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavInvd_numeroplaca_Internalname, "Invd_Numero Placa", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'" + sGXsfl_95_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavInvd_numeroplaca_Internalname, AV16Invd_NumeroPlaca, GXutil.rtrim( localUtil.format( AV16Invd_NumeroPlaca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,14);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Número de Placa", edtavInvd_numeroplaca_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavInvd_numeroplaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divConsecutivofiltercontainer_Internalname, 1, 0, "px", 0, "px", divConsecutivofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblconsecutivofilter_Internalname, lblLblconsecutivofilter_Caption, "", "", lblLblconsecutivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e122c1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavElem_consecutivo_Internalname, "Elem_Consecutivo", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_95_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavElem_consecutivo_Internalname, AV11Elem_Consecutivo, GXutil.rtrim( localUtil.format( AV11Elem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavElem_consecutivo_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavElem_consecutivo_Visible, edtavElem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCata_descripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divCata_descripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcata_descripcionfilter_Internalname, lblLblcata_descripcionfilter_Caption, "", "", lblLblcata_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e132c1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_95_idx + "',0)\"" ;
         ClassString = "FilterComboAttribute" ;
         StyleString = "" ;
         ClassString = "FilterComboAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCata_descripcion_Internalname, AV6Cata_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", (short)(0), edtavCata_descripcion_Visible, edtavCata_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCuen_nombrefiltercontainer_Internalname, 1, 0, "px", 0, "px", divCuen_nombrefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcuen_nombrefilter_Internalname, lblLblcuen_nombrefilter_Caption, "", "", lblLblcuen_nombrefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e142c1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_95_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCuen_nombre_Internalname, AV9Cuen_Nombre, GXutil.rtrim( localUtil.format( AV9Cuen_Nombre, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuen_nombre_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavCuen_nombre_Visible, edtavCuen_nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divCuen_cedulafiltercontainer_Internalname, 1, 0, "px", 0, "px", divCuen_cedulafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblcuen_cedulafilter_Internalname, lblLblcuen_cedulafilter_Caption, "", "", lblLblcuen_cedulafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e152c1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCuen_cedula_Internalname, "Cuen_Cedula", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_95_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCuen_cedula_Internalname, GXutil.ltrim( localUtil.ntoc( AV8Cuen_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtavCuen_cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV8Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuen_cedula_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavCuen_cedula_Visible, edtavCuen_cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_marcafiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_marcafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmarcafilter_Internalname, lblLblmarcafilter_Caption, "", "", lblLblmarcafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e162c1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCmarca_Internalname, "Marca", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_95_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCmarca_Internalname, AV21cMarca, GXutil.rtrim( localUtil.format( AV21cMarca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCmarca_Jsonclick, 0, "Attribute", "", "", "", edtavCmarca_Visible, edtavCmarca_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_modelofiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_modelofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmodelofilter_Internalname, lblLblmodelofilter_Caption, "", "", lblLblmodelofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e172c1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCmodelo_Internalname, "Modelo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_95_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCmodelo_Internalname, AV22cModelo, GXutil.rtrim( localUtil.format( AV22cModelo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCmodelo_Jsonclick, 0, "Attribute", "", "", "", edtavCmodelo_Visible, edtavCmodelo_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_serialfiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_serialfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblserialfilter_Internalname, lblLblserialfilter_Caption, "", "", lblLblserialfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e182c1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCserial_Internalname, "Serial", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_95_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCserial_Internalname, AV23cSerial, GXutil.rtrim( localUtil.format( AV23cSerial, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCserial_Jsonclick, 0, "Attribute", "", "", "", edtavCserial_Visible, edtavCserial_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_INVENTARIO_DEVOLUTIVO.htm");
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
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"95\">") ;
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Marca") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Modelo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Serial") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cédula") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Adquisición") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costo Total") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha de Adquisición") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Centro Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Almacen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Almacén") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Bodega") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Servicio") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Placa Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificación") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Desmantelamiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "futuro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Interes") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Tiempo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Costos Devolutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Util Inicial") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Util Actual") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código Clase") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripción Clase") ;
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
            GridColumn.AddObjectProperty("Value", A67Invd_NumeroPlaca);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A66Elem_Consecutivo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A298Cata_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", AV24Marca);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", AV25Modelo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", AV26Serial);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A44Cuen_Nombre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A68Invd_PlacaPadre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A412Invd_ModuloAlmacen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A413Invd_AlmacenCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A414Invd_BodegaCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A463Invd_Estado);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.format(A467Invd_FechaServicio, "99/99/99"));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A501Invd_EsPlacaPadre));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A624Costo_Desmante, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A625Variable_VF, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A627Variable_N, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A628Otros_Costos_Dev, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A630Vida_Util_Inicial, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A631Vida_Util_Actual, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A34Clas_Codigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A291Clas_Descripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV10Display));
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
      if ( wbEnd == 95 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_95 = (short)(nGXsfl_95_idx-1) ;
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

   public void start2C2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Work With Inventario devolutivo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2C0( ) ;
   }

   public void ws2C2( )
   {
      start2C2( ) ;
      evt2C2( ) ;
   }

   public void evt2C2( )
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
                           nGXsfl_95_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_95_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_95_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_952( ) ;
                           A67Invd_NumeroPlaca = httpContext.cgiGet( edtInvd_NumeroPlaca_Internalname) ;
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
                           AV24Marca = httpContext.cgiGet( edtavMarca_Internalname) ;
                           AV25Modelo = httpContext.cgiGet( edtavModelo_Internalname) ;
                           AV26Serial = httpContext.cgiGet( edtavSerial_Internalname) ;
                           A688Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtCuen_Cedula_Internalname), ",", ".") ;
                           A44Cuen_Nombre = GXutil.upper( httpContext.cgiGet( edtCuen_Nombre_Internalname)) ;
                           n44Cuen_Nombre = false ;
                           A68Invd_PlacaPadre = httpContext.cgiGet( edtInvd_PlacaPadre_Internalname) ;
                           n68Invd_PlacaPadre = false ;
                           A465Invd_ValorAdquisicion = localUtil.ctond( httpContext.cgiGet( edtInvd_ValorAdquisicion_Internalname)) ;
                           n465Invd_ValorAdquisicion = false ;
                           A629Costo_Total_Dev = localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Dev_Internalname)) ;
                           A466Invd_FechaAdquisicion = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtInvd_FechaAdquisicion_Internalname), 0)) ;
                           n466Invd_FechaAdquisicion = false ;
                           A410Invd_RegionalId = localUtil.ctol( httpContext.cgiGet( edtInvd_RegionalId_Internalname), ",", ".") ;
                           A411Invd_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtInvd_CentroCostoId_Internalname), ",", ".") ;
                           cmbInvd_ModuloAlmacen.setName( cmbInvd_ModuloAlmacen.getInternalname() );
                           cmbInvd_ModuloAlmacen.setValue( httpContext.cgiGet( cmbInvd_ModuloAlmacen.getInternalname()) );
                           A412Invd_ModuloAlmacen = httpContext.cgiGet( cmbInvd_ModuloAlmacen.getInternalname()) ;
                           A413Invd_AlmacenCodigo = httpContext.cgiGet( edtInvd_AlmacenCodigo_Internalname) ;
                           A414Invd_BodegaCodigo = httpContext.cgiGet( edtInvd_BodegaCodigo_Internalname) ;
                           cmbInvd_Estado.setName( cmbInvd_Estado.getInternalname() );
                           cmbInvd_Estado.setValue( httpContext.cgiGet( cmbInvd_Estado.getInternalname()) );
                           A463Invd_Estado = httpContext.cgiGet( cmbInvd_Estado.getInternalname()) ;
                           n463Invd_Estado = false ;
                           A467Invd_FechaServicio = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtInvd_FechaServicio_Internalname), 0)) ;
                           n467Invd_FechaServicio = false ;
                           A501Invd_EsPlacaPadre = httpContext.cgiGet( edtInvd_EsPlacaPadre_Internalname) ;
                           n501Invd_EsPlacaPadre = false ;
                           A43Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( edtCuen_Identificacion_Internalname), ",", ".") ;
                           n43Cuen_Identificacion = false ;
                           A624Costo_Desmante = localUtil.ctond( httpContext.cgiGet( edtCosto_Desmante_Internalname)) ;
                           n624Costo_Desmante = false ;
                           A625Variable_VF = localUtil.ctond( httpContext.cgiGet( edtVariable_VF_Internalname)) ;
                           n625Variable_VF = false ;
                           A626Variable_I = (short)(localUtil.ctol( httpContext.cgiGet( edtVariable_I_Internalname), ",", ".")) ;
                           n626Variable_I = false ;
                           A627Variable_N = (short)(localUtil.ctol( httpContext.cgiGet( edtVariable_N_Internalname), ",", ".")) ;
                           n627Variable_N = false ;
                           A628Otros_Costos_Dev = localUtil.ctond( httpContext.cgiGet( edtOtros_Costos_Dev_Internalname)) ;
                           n628Otros_Costos_Dev = false ;
                           A630Vida_Util_Inicial = (short)(localUtil.ctol( httpContext.cgiGet( edtVida_Util_Inicial_Internalname), ",", ".")) ;
                           n630Vida_Util_Inicial = false ;
                           A631Vida_Util_Actual = (short)(localUtil.ctol( httpContext.cgiGet( edtVida_Util_Actual_Internalname), ",", ".")) ;
                           n631Vida_Util_Actual = false ;
                           A34Clas_Codigo = httpContext.cgiGet( edtClas_Codigo_Internalname) ;
                           A291Clas_Descripcion = httpContext.cgiGet( edtClas_Descripcion_Internalname) ;
                           AV10Display = httpContext.cgiGet( edtavDisplay_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Bitmap", ((GXutil.strcmp("", AV10Display)==0) ? AV34Display_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV10Display))), !bGXsfl_95_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV10Display), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e192C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e202C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e212C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Invd_numeroplaca Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINVD_NUMEROPLACA"), AV16Invd_NumeroPlaca) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Elem_consecutivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vELEM_CONSECUTIVO"), AV11Elem_Consecutivo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cata_descripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCATA_DESCRIPCION"), AV6Cata_Descripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuen_nombre Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUEN_NOMBRE"), AV9Cuen_Nombre) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuen_cedula Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUEN_CEDULA"), ",", ".") != AV8Cuen_Cedula )
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

   public void we2C2( )
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

   public void pa2C2( )
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
         GXCCtl = "INVD_MODULOALMACEN_" + sGXsfl_95_idx ;
         cmbInvd_ModuloAlmacen.setName( GXCCtl );
         cmbInvd_ModuloAlmacen.setWebtags( "" );
         cmbInvd_ModuloAlmacen.addItem("", "", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("INVE", "INVENTARIO", (short)(0));
         cmbInvd_ModuloAlmacen.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbInvd_ModuloAlmacen.getItemCount() > 0 )
         {
            A412Invd_ModuloAlmacen = cmbInvd_ModuloAlmacen.getValidValue(A412Invd_ModuloAlmacen) ;
         }
         GXCCtl = "INVD_ESTADO_" + sGXsfl_95_idx ;
         cmbInvd_Estado.setName( GXCCtl );
         cmbInvd_Estado.setWebtags( "" );
         cmbInvd_Estado.addItem("R", "Ratificado", (short)(0));
         cmbInvd_Estado.addItem("P", "Pendiente", (short)(0));
         if ( cmbInvd_Estado.getItemCount() > 0 )
         {
            A463Invd_Estado = cmbInvd_Estado.getValidValue(A463Invd_Estado) ;
            n463Invd_Estado = false ;
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
            GX_FocusControl = edtavInvd_numeroplaca_Internalname ;
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
      subsflControlProps_952( ) ;
      while ( nGXsfl_95_idx <= nRC_GXsfl_95 )
      {
         sendrow_952( ) ;
         nGXsfl_95_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_95_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_95_idx+1)) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_95_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_952( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV16Invd_NumeroPlaca ,
                                 String AV11Elem_Consecutivo ,
                                 String AV6Cata_Descripcion ,
                                 String AV9Cuen_Nombre ,
                                 long AV8Cuen_Cedula ,
                                 String AV10Display ,
                                 String AV5ADVANCED_LABEL_TEMPLATE ,
                                 String AV21cMarca ,
                                 String AV22cModelo ,
                                 String AV23cSerial ,
                                 String AV33Pgmname ,
                                 String A67Invd_NumeroPlaca ,
                                 String AV24Marca ,
                                 String AV25Modelo ,
                                 String AV26Serial ,
                                 String AV29Observaciones ,
                                 long AV30Tran_IdEntrada ,
                                 int AV28Nro_Linea )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf2C2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_NUMEROPLACA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A67Invd_NumeroPlaca, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACA", A67Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_PLACAPADRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_PLACAPADRE", A68Invd_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_VALORADQUISICION", getSecureSignedToken( "", localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_VALORADQUISICION", GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_COSTO_TOTAL_DEV", getSecureSignedToken( "", localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "COSTO_TOTAL_DEV", GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_FECHAADQUISICION", getSecureSignedToken( "", A466Invd_FechaAdquisicion));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_FECHAADQUISICION", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_REGIONALID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_REGIONALID", GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_CENTROCOSTOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_MODULOALMACEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_MODULOALMACEN", A412Invd_ModuloAlmacen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ALMACENCODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ALMACENCODIGO", A413Invd_AlmacenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_BODEGACODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_BODEGACODIGO", A414Invd_BodegaCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ESTADO", A463Invd_Estado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_FECHASERVICIO", getSecureSignedToken( "", A467Invd_FechaServicio));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_FECHASERVICIO", localUtil.format(A467Invd_FechaServicio, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ESPLACAPADRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A501Invd_EsPlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ESPLACAPADRE", GXutil.rtrim( A501Invd_EsPlacaPadre));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_COSTO_DESMANTE", getSecureSignedToken( "", localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "COSTO_DESMANTE", GXutil.ltrim( localUtil.ntoc( A624Costo_Desmante, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_VF", getSecureSignedToken( "", localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VARIABLE_VF", GXutil.ltrim( localUtil.ntoc( A625Variable_VF, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_I", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VARIABLE_I", GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_N", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VARIABLE_N", GXutil.ltrim( localUtil.ntoc( A627Variable_N, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_OTROS_COSTOS_DEV", getSecureSignedToken( "", localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "OTROS_COSTOS_DEV", GXutil.ltrim( localUtil.ntoc( A628Otros_Costos_Dev, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VIDA_UTIL_INICIAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VIDA_UTIL_INICIAL", GXutil.ltrim( localUtil.ntoc( A630Vida_Util_Inicial, (byte)(4), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VIDA_UTIL_ACTUAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VIDA_UTIL_ACTUAL", GXutil.ltrim( localUtil.ntoc( A631Vida_Util_Actual, (byte)(4), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2C2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV33Pgmname = "WWALM_INVENTARIO_DEVOLUTIVO" ;
      Gx_err = (short)(0) ;
   }

   public void rf2C2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(95) ;
      /* Execute user event: Refresh */
      e202C2 ();
      nGXsfl_95_idx = (short)(1) ;
      sGXsfl_95_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_95_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_952( ) ;
      bGXsfl_95_Refreshing = true ;
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
         subsflControlProps_952( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV16Invd_NumeroPlaca ,
                                              new Long(AV8Cuen_Cedula) ,
                                              AV11Elem_Consecutivo ,
                                              A67Invd_NumeroPlaca ,
                                              new Long(A688Cuen_Cedula) ,
                                              A66Elem_Consecutivo ,
                                              AV6Cata_Descripcion ,
                                              A298Cata_Descripcion ,
                                              AV9Cuen_Nombre ,
                                              A44Cuen_Nombre } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN
                                              }
         } ) ;
         lV16Invd_NumeroPlaca = GXutil.concat( GXutil.rtrim( AV16Invd_NumeroPlaca), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Invd_NumeroPlaca", AV16Invd_NumeroPlaca);
         lV11Elem_Consecutivo = GXutil.concat( GXutil.rtrim( AV11Elem_Consecutivo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Elem_Consecutivo", AV11Elem_Consecutivo);
         /* Using cursor H002C2 */
         pr_default.execute(0, new Object[] {lV16Invd_NumeroPlaca, new Long(AV8Cuen_Cedula), lV11Elem_Consecutivo});
         nGXsfl_95_idx = (short)(1) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_95_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_952( ) ;
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
         {
            brk2C2 = false ;
            A37Cata_Codigo = H002C2_A37Cata_Codigo[0] ;
            A298Cata_Descripcion = H002C2_A298Cata_Descripcion[0] ;
            A44Cuen_Nombre = H002C2_A44Cuen_Nombre[0] ;
            n44Cuen_Nombre = H002C2_n44Cuen_Nombre[0] ;
            A688Cuen_Cedula = H002C2_A688Cuen_Cedula[0] ;
            A66Elem_Consecutivo = H002C2_A66Elem_Consecutivo[0] ;
            A67Invd_NumeroPlaca = H002C2_A67Invd_NumeroPlaca[0] ;
            A291Clas_Descripcion = H002C2_A291Clas_Descripcion[0] ;
            A34Clas_Codigo = H002C2_A34Clas_Codigo[0] ;
            A631Vida_Util_Actual = H002C2_A631Vida_Util_Actual[0] ;
            n631Vida_Util_Actual = H002C2_n631Vida_Util_Actual[0] ;
            A630Vida_Util_Inicial = H002C2_A630Vida_Util_Inicial[0] ;
            n630Vida_Util_Inicial = H002C2_n630Vida_Util_Inicial[0] ;
            A628Otros_Costos_Dev = H002C2_A628Otros_Costos_Dev[0] ;
            n628Otros_Costos_Dev = H002C2_n628Otros_Costos_Dev[0] ;
            A627Variable_N = H002C2_A627Variable_N[0] ;
            n627Variable_N = H002C2_n627Variable_N[0] ;
            A626Variable_I = H002C2_A626Variable_I[0] ;
            n626Variable_I = H002C2_n626Variable_I[0] ;
            A625Variable_VF = H002C2_A625Variable_VF[0] ;
            n625Variable_VF = H002C2_n625Variable_VF[0] ;
            A624Costo_Desmante = H002C2_A624Costo_Desmante[0] ;
            n624Costo_Desmante = H002C2_n624Costo_Desmante[0] ;
            A43Cuen_Identificacion = H002C2_A43Cuen_Identificacion[0] ;
            n43Cuen_Identificacion = H002C2_n43Cuen_Identificacion[0] ;
            A501Invd_EsPlacaPadre = H002C2_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = H002C2_n501Invd_EsPlacaPadre[0] ;
            A467Invd_FechaServicio = H002C2_A467Invd_FechaServicio[0] ;
            n467Invd_FechaServicio = H002C2_n467Invd_FechaServicio[0] ;
            A463Invd_Estado = H002C2_A463Invd_Estado[0] ;
            n463Invd_Estado = H002C2_n463Invd_Estado[0] ;
            A414Invd_BodegaCodigo = H002C2_A414Invd_BodegaCodigo[0] ;
            A413Invd_AlmacenCodigo = H002C2_A413Invd_AlmacenCodigo[0] ;
            A412Invd_ModuloAlmacen = H002C2_A412Invd_ModuloAlmacen[0] ;
            A411Invd_CentroCostoId = H002C2_A411Invd_CentroCostoId[0] ;
            A410Invd_RegionalId = H002C2_A410Invd_RegionalId[0] ;
            A466Invd_FechaAdquisicion = H002C2_A466Invd_FechaAdquisicion[0] ;
            n466Invd_FechaAdquisicion = H002C2_n466Invd_FechaAdquisicion[0] ;
            A629Costo_Total_Dev = H002C2_A629Costo_Total_Dev[0] ;
            A465Invd_ValorAdquisicion = H002C2_A465Invd_ValorAdquisicion[0] ;
            n465Invd_ValorAdquisicion = H002C2_n465Invd_ValorAdquisicion[0] ;
            A68Invd_PlacaPadre = H002C2_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = H002C2_n68Invd_PlacaPadre[0] ;
            A37Cata_Codigo = H002C2_A37Cata_Codigo[0] ;
            A298Cata_Descripcion = H002C2_A298Cata_Descripcion[0] ;
            A34Clas_Codigo = H002C2_A34Clas_Codigo[0] ;
            A291Clas_Descripcion = H002C2_A291Clas_Descripcion[0] ;
            A44Cuen_Nombre = H002C2_A44Cuen_Nombre[0] ;
            n44Cuen_Nombre = H002C2_n44Cuen_Nombre[0] ;
            A688Cuen_Cedula = H002C2_A688Cuen_Cedula[0] ;
            if ( (GXutil.strcmp("", AV6Cata_Descripcion)==0) || ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV6Cata_Descripcion), "") , 254 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV9Cuen_Nombre)==0) || ( GXutil.like( GXutil.upper( A44Cuen_Nombre) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV9Cuen_Nombre), "") , 254 , "%"),  ' ' ) ) )
               {
                  e212C2 ();
               }
            }
            if ( ! brk2C2 )
            {
               brk2C2 = true ;
               pr_default.readNext(0);
            }
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         wbEnd = (short)(95) ;
         wb2C0( ) ;
      }
      bGXsfl_95_Refreshing = true ;
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
         gxgrgrid_refresh( subGrid_Rows, AV16Invd_NumeroPlaca, AV11Elem_Consecutivo, AV6Cata_Descripcion, AV9Cuen_Nombre, AV8Cuen_Cedula, AV10Display, AV5ADVANCED_LABEL_TEMPLATE, AV21cMarca, AV22cModelo, AV23cSerial, AV33Pgmname, A67Invd_NumeroPlaca, AV24Marca, AV25Modelo, AV26Serial, AV29Observaciones, AV30Tran_IdEntrada, AV28Nro_Linea) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV16Invd_NumeroPlaca, AV11Elem_Consecutivo, AV6Cata_Descripcion, AV9Cuen_Nombre, AV8Cuen_Cedula, AV10Display, AV5ADVANCED_LABEL_TEMPLATE, AV21cMarca, AV22cModelo, AV23cSerial, AV33Pgmname, A67Invd_NumeroPlaca, AV24Marca, AV25Modelo, AV26Serial, AV29Observaciones, AV30Tran_IdEntrada, AV28Nro_Linea) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV16Invd_NumeroPlaca, AV11Elem_Consecutivo, AV6Cata_Descripcion, AV9Cuen_Nombre, AV8Cuen_Cedula, AV10Display, AV5ADVANCED_LABEL_TEMPLATE, AV21cMarca, AV22cModelo, AV23cSerial, AV33Pgmname, A67Invd_NumeroPlaca, AV24Marca, AV25Modelo, AV26Serial, AV29Observaciones, AV30Tran_IdEntrada, AV28Nro_Linea) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV16Invd_NumeroPlaca, AV11Elem_Consecutivo, AV6Cata_Descripcion, AV9Cuen_Nombre, AV8Cuen_Cedula, AV10Display, AV5ADVANCED_LABEL_TEMPLATE, AV21cMarca, AV22cModelo, AV23cSerial, AV33Pgmname, A67Invd_NumeroPlaca, AV24Marca, AV25Modelo, AV26Serial, AV29Observaciones, AV30Tran_IdEntrada, AV28Nro_Linea) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV16Invd_NumeroPlaca, AV11Elem_Consecutivo, AV6Cata_Descripcion, AV9Cuen_Nombre, AV8Cuen_Cedula, AV10Display, AV5ADVANCED_LABEL_TEMPLATE, AV21cMarca, AV22cModelo, AV23cSerial, AV33Pgmname, A67Invd_NumeroPlaca, AV24Marca, AV25Modelo, AV26Serial, AV29Observaciones, AV30Tran_IdEntrada, AV28Nro_Linea) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup2C0( )
   {
      /* Before Start, stand alone formulas. */
      AV33Pgmname = "WWALM_INVENTARIO_DEVOLUTIVO" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e192C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV16Invd_NumeroPlaca = httpContext.cgiGet( edtavInvd_numeroplaca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Invd_NumeroPlaca", AV16Invd_NumeroPlaca);
         AV11Elem_Consecutivo = httpContext.cgiGet( edtavElem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Elem_Consecutivo", AV11Elem_Consecutivo);
         AV6Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCata_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Cata_Descripcion", AV6Cata_Descripcion);
         AV9Cuen_Nombre = GXutil.upper( httpContext.cgiGet( edtavCuen_nombre_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Cuen_Nombre", AV9Cuen_Nombre);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_cedula_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_cedula_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUEN_CEDULA");
            GX_FocusControl = edtavCuen_cedula_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8Cuen_Cedula = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Cuen_Cedula", GXutil.ltrim( GXutil.str( AV8Cuen_Cedula, 18, 0)));
         }
         else
         {
            AV8Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtavCuen_cedula_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Cuen_Cedula", GXutil.ltrim( GXutil.str( AV8Cuen_Cedula, 18, 0)));
         }
         AV21cMarca = httpContext.cgiGet( edtavCmarca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21cMarca", AV21cMarca);
         AV22cModelo = httpContext.cgiGet( edtavCmodelo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22cModelo", AV22cModelo);
         AV23cSerial = httpContext.cgiGet( edtavCserial_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23cSerial", AV23cSerial);
         /* Read saved values. */
         nRC_GXsfl_95 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_95"), ",", ".")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINVD_NUMEROPLACA"), AV16Invd_NumeroPlaca) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vELEM_CONSECUTIVO"), AV11Elem_Consecutivo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCATA_DESCRIPCION"), AV6Cata_Descripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUEN_NOMBRE"), AV9Cuen_Nombre) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCUEN_CEDULA"), ",", ".") != AV8Cuen_Cedula )
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
      e192C2 ();
      if ( returnInSub )
      {
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e192C2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV33Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV33Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV10Display = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Bitmap", ((GXutil.strcmp("", AV10Display)==0) ? AV34Display_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV10Display))), !bGXsfl_95_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV10Display), true);
      AV34Display_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Bitmap", ((GXutil.strcmp("", AV10Display)==0) ? AV34Display_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV10Display))), !bGXsfl_95_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV10Display), true);
      edtavDisplay_Tooltiptext = "Consultar" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisplay_Internalname, "Tooltiptext", edtavDisplay_Tooltiptext, !bGXsfl_95_Refreshing);
      Form.setCaption( "Consulta Hoja de Vida" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV5ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5ADVANCED_LABEL_TEMPLATE", AV5ADVANCED_LABEL_TEMPLATE);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e202C2( )
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
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         returnInSub = true;
         if (true) return;
      }
      if ( (GXutil.strcmp("", AV11Elem_Consecutivo)==0) )
      {
         lblLblconsecutivofilter_Caption = "Consecutivo" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblconsecutivofilter_Internalname, "Caption", lblLblconsecutivofilter_Caption, true);
      }
      else
      {
         lblLblconsecutivofilter_Caption = GXutil.format( AV5ADVANCED_LABEL_TEMPLATE, "Consecutivo", AV6Cata_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblconsecutivofilter_Internalname, "Caption", lblLblconsecutivofilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV6Cata_Descripcion)==0) )
      {
         lblLblcata_descripcionfilter_Caption = "Descripción del bien" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcata_descripcionfilter_Internalname, "Caption", lblLblcata_descripcionfilter_Caption, true);
      }
      else
      {
         lblLblcata_descripcionfilter_Caption = GXutil.format( AV5ADVANCED_LABEL_TEMPLATE, "Descripción del bien", AV6Cata_Descripcion, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcata_descripcionfilter_Internalname, "Caption", lblLblcata_descripcionfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV9Cuen_Nombre)==0) )
      {
         lblLblcuen_nombrefilter_Caption = "Nombre Cuentadante" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcuen_nombrefilter_Internalname, "Caption", lblLblcuen_nombrefilter_Caption, true);
      }
      else
      {
         lblLblcuen_nombrefilter_Caption = GXutil.format( AV5ADVANCED_LABEL_TEMPLATE, "Nombre Cuentadante", AV9Cuen_Nombre, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcuen_nombrefilter_Internalname, "Caption", lblLblcuen_nombrefilter_Caption, true);
      }
      if ( (0==AV8Cuen_Cedula) )
      {
         lblLblcuen_cedulafilter_Caption = "Cédula" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcuen_cedulafilter_Internalname, "Caption", lblLblcuen_cedulafilter_Caption, true);
      }
      else
      {
         lblLblcuen_cedulafilter_Caption = GXutil.format( AV5ADVANCED_LABEL_TEMPLATE, "Cuentadante Cedula", GXutil.ltrim( GXutil.str( AV8Cuen_Cedula, 18, 0)), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblcuen_cedulafilter_Internalname, "Caption", lblLblcuen_cedulafilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV21cMarca)==0) )
      {
         lblLblmarcafilter_Caption = "Marca" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmarcafilter_Internalname, "Caption", lblLblmarcafilter_Caption, true);
      }
      else
      {
         lblLblmarcafilter_Caption = GXutil.format( AV5ADVANCED_LABEL_TEMPLATE, "Marca", AV21cMarca, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmarcafilter_Internalname, "Caption", lblLblmarcafilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV22cModelo)==0) )
      {
         lblLblmodelofilter_Caption = "Modelo" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmodelofilter_Internalname, "Caption", lblLblmodelofilter_Caption, true);
      }
      else
      {
         lblLblmodelofilter_Caption = GXutil.format( AV5ADVANCED_LABEL_TEMPLATE, "Modelo", AV22cModelo, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblmodelofilter_Internalname, "Caption", lblLblmodelofilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV23cSerial)==0) )
      {
         lblLblserialfilter_Caption = "Serial" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblserialfilter_Internalname, "Caption", lblLblserialfilter_Caption, true);
      }
      else
      {
         lblLblserialfilter_Caption = GXutil.format( AV5ADVANCED_LABEL_TEMPLATE, "Serial", AV23cSerial, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLblserialfilter_Internalname, "Caption", lblLblserialfilter_Caption, true);
      }
   }

   private void e212C2( )
   {
      /* Grid_Load Routine */
      edtavDisplay_Link = formatLink("com.orions2.wp_alm_hojavida") + "?" + GXutil.URLEncode(GXutil.rtrim(A67Invd_NumeroPlaca)) ;
      GRID_nEOF = (byte)(0) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      while ( ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(H002C2_A67Invd_NumeroPlaca[0], A67Invd_NumeroPlaca) == 0 ) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
      {
         brk2C2 = false ;
         A37Cata_Codigo = H002C2_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H002C2_A298Cata_Descripcion[0] ;
         A44Cuen_Nombre = H002C2_A44Cuen_Nombre[0] ;
         n44Cuen_Nombre = H002C2_n44Cuen_Nombre[0] ;
         A688Cuen_Cedula = H002C2_A688Cuen_Cedula[0] ;
         A66Elem_Consecutivo = H002C2_A66Elem_Consecutivo[0] ;
         A631Vida_Util_Actual = H002C2_A631Vida_Util_Actual[0] ;
         n631Vida_Util_Actual = H002C2_n631Vida_Util_Actual[0] ;
         A630Vida_Util_Inicial = H002C2_A630Vida_Util_Inicial[0] ;
         n630Vida_Util_Inicial = H002C2_n630Vida_Util_Inicial[0] ;
         A628Otros_Costos_Dev = H002C2_A628Otros_Costos_Dev[0] ;
         n628Otros_Costos_Dev = H002C2_n628Otros_Costos_Dev[0] ;
         A627Variable_N = H002C2_A627Variable_N[0] ;
         n627Variable_N = H002C2_n627Variable_N[0] ;
         A626Variable_I = H002C2_A626Variable_I[0] ;
         n626Variable_I = H002C2_n626Variable_I[0] ;
         A625Variable_VF = H002C2_A625Variable_VF[0] ;
         n625Variable_VF = H002C2_n625Variable_VF[0] ;
         A624Costo_Desmante = H002C2_A624Costo_Desmante[0] ;
         n624Costo_Desmante = H002C2_n624Costo_Desmante[0] ;
         A43Cuen_Identificacion = H002C2_A43Cuen_Identificacion[0] ;
         n43Cuen_Identificacion = H002C2_n43Cuen_Identificacion[0] ;
         A501Invd_EsPlacaPadre = H002C2_A501Invd_EsPlacaPadre[0] ;
         n501Invd_EsPlacaPadre = H002C2_n501Invd_EsPlacaPadre[0] ;
         A467Invd_FechaServicio = H002C2_A467Invd_FechaServicio[0] ;
         n467Invd_FechaServicio = H002C2_n467Invd_FechaServicio[0] ;
         A463Invd_Estado = H002C2_A463Invd_Estado[0] ;
         n463Invd_Estado = H002C2_n463Invd_Estado[0] ;
         A414Invd_BodegaCodigo = H002C2_A414Invd_BodegaCodigo[0] ;
         A413Invd_AlmacenCodigo = H002C2_A413Invd_AlmacenCodigo[0] ;
         A412Invd_ModuloAlmacen = H002C2_A412Invd_ModuloAlmacen[0] ;
         A411Invd_CentroCostoId = H002C2_A411Invd_CentroCostoId[0] ;
         A410Invd_RegionalId = H002C2_A410Invd_RegionalId[0] ;
         A466Invd_FechaAdquisicion = H002C2_A466Invd_FechaAdquisicion[0] ;
         n466Invd_FechaAdquisicion = H002C2_n466Invd_FechaAdquisicion[0] ;
         A629Costo_Total_Dev = H002C2_A629Costo_Total_Dev[0] ;
         A465Invd_ValorAdquisicion = H002C2_A465Invd_ValorAdquisicion[0] ;
         n465Invd_ValorAdquisicion = H002C2_n465Invd_ValorAdquisicion[0] ;
         A68Invd_PlacaPadre = H002C2_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = H002C2_n68Invd_PlacaPadre[0] ;
         A37Cata_Codigo = H002C2_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H002C2_A298Cata_Descripcion[0] ;
         A44Cuen_Nombre = H002C2_A44Cuen_Nombre[0] ;
         n44Cuen_Nombre = H002C2_n44Cuen_Nombre[0] ;
         A688Cuen_Cedula = H002C2_A688Cuen_Cedula[0] ;
         if ( (GXutil.strcmp("", AV6Cata_Descripcion)==0) || ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV6Cata_Descripcion), "") , 254 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV9Cuen_Nombre)==0) || ( GXutil.like( GXutil.upper( A44Cuen_Nombre) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV9Cuen_Nombre), "") , 254 , "%"),  ' ' ) ) )
            {
               AV27Placa = A67Invd_NumeroPlaca ;
               GXv_char1[0] = AV27Placa ;
               GXv_char2[0] = AV24Marca ;
               GXv_char3[0] = AV25Modelo ;
               GXv_char4[0] = AV26Serial ;
               GXv_char5[0] = AV29Observaciones ;
               GXv_int6[0] = AV30Tran_IdEntrada ;
               GXv_int7[0] = AV28Nro_Linea ;
               new com.orions2.buscaatributos(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_int6, GXv_int7) ;
               wwalm_inventario_devolutivo_impl.this.AV27Placa = GXv_char1[0] ;
               wwalm_inventario_devolutivo_impl.this.AV24Marca = GXv_char2[0] ;
               wwalm_inventario_devolutivo_impl.this.AV25Modelo = GXv_char3[0] ;
               wwalm_inventario_devolutivo_impl.this.AV26Serial = GXv_char4[0] ;
               wwalm_inventario_devolutivo_impl.this.AV29Observaciones = GXv_char5[0] ;
               wwalm_inventario_devolutivo_impl.this.AV30Tran_IdEntrada = GXv_int6[0] ;
               wwalm_inventario_devolutivo_impl.this.AV28Nro_Linea = GXv_int7[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29Observaciones", AV29Observaciones);
               httpContext.ajax_rsp_assign_attri("", false, "AV30Tran_IdEntrada", GXutil.ltrim( GXutil.str( AV30Tran_IdEntrada, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV28Nro_Linea", GXutil.ltrim( GXutil.str( AV28Nro_Linea, 8, 0)));
               if ( (GXutil.strcmp("", AV21cMarca)==0) && (GXutil.strcmp("", AV22cModelo)==0) && (GXutil.strcmp("", AV23cSerial)==0) )
               {
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(95) ;
                  }
                  if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
                  {
                     sendrow_952( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_95_Refreshing )
                  {
                     httpContext.doAjaxLoad(95, GridRow);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV24Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV21cMarca), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV22cModelo)==0) && (GXutil.strcmp("", AV23cSerial)==0) )
               {
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(95) ;
                  }
                  if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
                  {
                     sendrow_952( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_95_Refreshing )
                  {
                     httpContext.doAjaxLoad(95, GridRow);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV24Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV21cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV25Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV22cModelo), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV23cSerial)==0) )
               {
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(95) ;
                  }
                  if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
                  {
                     sendrow_952( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_95_Refreshing )
                  {
                     httpContext.doAjaxLoad(95, GridRow);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV24Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV21cMarca), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV22cModelo)==0) && GXutil.like( GXutil.upper( AV26Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cSerial), "") , 254 , "%"),  ' ' ) )
               {
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(95) ;
                  }
                  if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
                  {
                     sendrow_952( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_95_Refreshing )
                  {
                     httpContext.doAjaxLoad(95, GridRow);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV25Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV22cModelo), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV21cMarca)==0) && (GXutil.strcmp("", AV23cSerial)==0) )
               {
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(95) ;
                  }
                  if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
                  {
                     sendrow_952( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_95_Refreshing )
                  {
                     httpContext.doAjaxLoad(95, GridRow);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV25Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV22cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV24Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV21cMarca), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV23cSerial)==0) )
               {
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(95) ;
                  }
                  if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
                  {
                     sendrow_952( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_95_Refreshing )
                  {
                     httpContext.doAjaxLoad(95, GridRow);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV25Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV22cModelo), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV21cMarca)==0) && GXutil.like( GXutil.upper( AV26Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cSerial), "") , 254 , "%"),  ' ' ) )
               {
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(95) ;
                  }
                  if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
                  {
                     sendrow_952( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_95_Refreshing )
                  {
                     httpContext.doAjaxLoad(95, GridRow);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV26Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cSerial), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV22cModelo)==0) && (GXutil.strcmp("", AV21cMarca)==0) )
               {
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(95) ;
                  }
                  if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
                  {
                     sendrow_952( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_95_Refreshing )
                  {
                     httpContext.doAjaxLoad(95, GridRow);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV26Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cSerial), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV25Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV22cModelo), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV21cMarca)==0) )
               {
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(95) ;
                  }
                  if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
                  {
                     sendrow_952( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_95_Refreshing )
                  {
                     httpContext.doAjaxLoad(95, GridRow);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV26Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cSerial), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV22cModelo)==0) && GXutil.like( GXutil.upper( AV24Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV21cMarca), "") , 254 , "%"),  ' ' ) )
               {
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(95) ;
                  }
                  if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
                  {
                     sendrow_952( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_95_Refreshing )
                  {
                     httpContext.doAjaxLoad(95, GridRow);
                  }
               }
               else if ( GXutil.like( GXutil.upper( AV24Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV21cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV25Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV22cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV26Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV23cSerial), "") , 254 , "%"),  ' ' ) )
               {
                  /* Load Method */
                  if ( wbStart != -1 )
                  {
                     wbStart = (short)(95) ;
                  }
                  if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
                  {
                     sendrow_952( ) ;
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
                  if ( isFullAjaxMode( ) && ! bGXsfl_95_Refreshing )
                  {
                     httpContext.doAjaxLoad(95, GridRow);
                  }
               }
            }
         }
         brk2C2 = true ;
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV15HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV13GridState.fromxml(AV18Session.getValue(AV33Pgmname+"GridState"), null, null);
         if ( AV13GridState.getgxTv_SdtGridState_Filtervalues().size() >= 8 )
         {
            AV11Elem_Consecutivo = ((com.orions2.SdtGridState_FilterValue)AV13GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Elem_Consecutivo", AV11Elem_Consecutivo);
            AV16Invd_NumeroPlaca = ((com.orions2.SdtGridState_FilterValue)AV13GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+2)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Invd_NumeroPlaca", AV16Invd_NumeroPlaca);
            AV6Cata_Descripcion = ((com.orions2.SdtGridState_FilterValue)AV13GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+3)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6Cata_Descripcion", AV6Cata_Descripcion);
            AV9Cuen_Nombre = ((com.orions2.SdtGridState_FilterValue)AV13GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+4)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Cuen_Nombre", AV9Cuen_Nombre);
            AV8Cuen_Cedula = GXutil.lval( ((com.orions2.SdtGridState_FilterValue)AV13GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+5)).getgxTv_SdtGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Cuen_Cedula", GXutil.ltrim( GXutil.str( AV8Cuen_Cedula, 18, 0)));
            AV21cMarca = ((com.orions2.SdtGridState_FilterValue)AV13GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+6)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21cMarca", AV21cMarca);
            AV22cModelo = ((com.orions2.SdtGridState_FilterValue)AV13GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+7)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22cModelo", AV22cModelo);
            AV23cSerial = ((com.orions2.SdtGridState_FilterValue)AV13GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+8)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23cSerial", AV23cSerial);
         }
         if ( AV13GridState.getgxTv_SdtGridState_Currentpage() > 0 )
         {
            AV12GridPageCount = subgrid_pagecount( ) ;
            if ( ( AV12GridPageCount > 0 ) && ( AV12GridPageCount < AV13GridState.getgxTv_SdtGridState_Currentpage() ) )
            {
               subgrid_gotopage( AV12GridPageCount) ;
            }
            else
            {
               subgrid_gotopage( AV13GridState.getgxTv_SdtGridState_Currentpage()) ;
            }
         }
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      AV13GridState.fromxml(AV18Session.getValue(AV33Pgmname+"GridState"), null, null);
      AV13GridState.setgxTv_SdtGridState_Currentpage( (short)(subgrid_currentpage( )) );
      AV13GridState.getgxTv_SdtGridState_Filtervalues().clear();
      AV14GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV14GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV11Elem_Consecutivo );
      AV13GridState.getgxTv_SdtGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      AV14GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV14GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV16Invd_NumeroPlaca );
      AV13GridState.getgxTv_SdtGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      AV14GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV14GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV6Cata_Descripcion );
      AV13GridState.getgxTv_SdtGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      AV14GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV14GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV9Cuen_Nombre );
      AV13GridState.getgxTv_SdtGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      AV14GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV14GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( GXutil.str( AV8Cuen_Cedula, 18, 0) );
      AV13GridState.getgxTv_SdtGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      AV14GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV14GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV21cMarca );
      AV13GridState.getgxTv_SdtGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      AV14GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV14GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV22cModelo );
      AV13GridState.getgxTv_SdtGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      AV14GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV14GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV23cSerial );
      AV13GridState.getgxTv_SdtGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      AV18Session.setValue(AV33Pgmname+"GridState", AV13GridState.toxml(false, true, "GridState", "ACBSENA"));
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV19TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV19TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV33Pgmname );
      AV19TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV19TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV15HTTPRequest.getScriptName()+"?"+AV15HTTPRequest.getQuerystring() );
      AV19TrnContext.setgxTv_SdtTransactionContext_Transactionname( "Consulta Hoja de Vida" );
      AV18Session.setValue("TrnContext", AV19TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
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
      pa2C2( ) ;
      ws2C2( ) ;
      we2C2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414191116");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wwalm_inventario_devolutivo.js", "?201861414191116");
      /* End function include_jscripts */
   }

   public void subsflControlProps_952( )
   {
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA_"+sGXsfl_95_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_95_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_95_idx ;
      edtavMarca_Internalname = "vMARCA_"+sGXsfl_95_idx ;
      edtavModelo_Internalname = "vMODELO_"+sGXsfl_95_idx ;
      edtavSerial_Internalname = "vSERIAL_"+sGXsfl_95_idx ;
      edtCuen_Cedula_Internalname = "CUEN_CEDULA_"+sGXsfl_95_idx ;
      edtCuen_Nombre_Internalname = "CUEN_NOMBRE_"+sGXsfl_95_idx ;
      edtInvd_PlacaPadre_Internalname = "INVD_PLACAPADRE_"+sGXsfl_95_idx ;
      edtInvd_ValorAdquisicion_Internalname = "INVD_VALORADQUISICION_"+sGXsfl_95_idx ;
      edtCosto_Total_Dev_Internalname = "COSTO_TOTAL_DEV_"+sGXsfl_95_idx ;
      edtInvd_FechaAdquisicion_Internalname = "INVD_FECHAADQUISICION_"+sGXsfl_95_idx ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID_"+sGXsfl_95_idx ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID_"+sGXsfl_95_idx ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN_"+sGXsfl_95_idx );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO_"+sGXsfl_95_idx ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO_"+sGXsfl_95_idx ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO_"+sGXsfl_95_idx );
      edtInvd_FechaServicio_Internalname = "INVD_FECHASERVICIO_"+sGXsfl_95_idx ;
      edtInvd_EsPlacaPadre_Internalname = "INVD_ESPLACAPADRE_"+sGXsfl_95_idx ;
      edtCuen_Identificacion_Internalname = "CUEN_IDENTIFICACION_"+sGXsfl_95_idx ;
      edtCosto_Desmante_Internalname = "COSTO_DESMANTE_"+sGXsfl_95_idx ;
      edtVariable_VF_Internalname = "VARIABLE_VF_"+sGXsfl_95_idx ;
      edtVariable_I_Internalname = "VARIABLE_I_"+sGXsfl_95_idx ;
      edtVariable_N_Internalname = "VARIABLE_N_"+sGXsfl_95_idx ;
      edtOtros_Costos_Dev_Internalname = "OTROS_COSTOS_DEV_"+sGXsfl_95_idx ;
      edtVida_Util_Inicial_Internalname = "VIDA_UTIL_INICIAL_"+sGXsfl_95_idx ;
      edtVida_Util_Actual_Internalname = "VIDA_UTIL_ACTUAL_"+sGXsfl_95_idx ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO_"+sGXsfl_95_idx ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION_"+sGXsfl_95_idx ;
      edtavDisplay_Internalname = "vDISPLAY_"+sGXsfl_95_idx ;
   }

   public void subsflControlProps_fel_952( )
   {
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA_"+sGXsfl_95_fel_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_95_fel_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_95_fel_idx ;
      edtavMarca_Internalname = "vMARCA_"+sGXsfl_95_fel_idx ;
      edtavModelo_Internalname = "vMODELO_"+sGXsfl_95_fel_idx ;
      edtavSerial_Internalname = "vSERIAL_"+sGXsfl_95_fel_idx ;
      edtCuen_Cedula_Internalname = "CUEN_CEDULA_"+sGXsfl_95_fel_idx ;
      edtCuen_Nombre_Internalname = "CUEN_NOMBRE_"+sGXsfl_95_fel_idx ;
      edtInvd_PlacaPadre_Internalname = "INVD_PLACAPADRE_"+sGXsfl_95_fel_idx ;
      edtInvd_ValorAdquisicion_Internalname = "INVD_VALORADQUISICION_"+sGXsfl_95_fel_idx ;
      edtCosto_Total_Dev_Internalname = "COSTO_TOTAL_DEV_"+sGXsfl_95_fel_idx ;
      edtInvd_FechaAdquisicion_Internalname = "INVD_FECHAADQUISICION_"+sGXsfl_95_fel_idx ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID_"+sGXsfl_95_fel_idx ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID_"+sGXsfl_95_fel_idx ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN_"+sGXsfl_95_fel_idx );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO_"+sGXsfl_95_fel_idx ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO_"+sGXsfl_95_fel_idx ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO_"+sGXsfl_95_fel_idx );
      edtInvd_FechaServicio_Internalname = "INVD_FECHASERVICIO_"+sGXsfl_95_fel_idx ;
      edtInvd_EsPlacaPadre_Internalname = "INVD_ESPLACAPADRE_"+sGXsfl_95_fel_idx ;
      edtCuen_Identificacion_Internalname = "CUEN_IDENTIFICACION_"+sGXsfl_95_fel_idx ;
      edtCosto_Desmante_Internalname = "COSTO_DESMANTE_"+sGXsfl_95_fel_idx ;
      edtVariable_VF_Internalname = "VARIABLE_VF_"+sGXsfl_95_fel_idx ;
      edtVariable_I_Internalname = "VARIABLE_I_"+sGXsfl_95_fel_idx ;
      edtVariable_N_Internalname = "VARIABLE_N_"+sGXsfl_95_fel_idx ;
      edtOtros_Costos_Dev_Internalname = "OTROS_COSTOS_DEV_"+sGXsfl_95_fel_idx ;
      edtVida_Util_Inicial_Internalname = "VIDA_UTIL_INICIAL_"+sGXsfl_95_fel_idx ;
      edtVida_Util_Actual_Internalname = "VIDA_UTIL_ACTUAL_"+sGXsfl_95_fel_idx ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO_"+sGXsfl_95_fel_idx ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION_"+sGXsfl_95_fel_idx ;
      edtavDisplay_Internalname = "vDISPLAY_"+sGXsfl_95_fel_idx ;
   }

   public void sendrow_952( )
   {
      subsflControlProps_952( ) ;
      wb2C0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_95_idx <= subgrid_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_95_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_95_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_NumeroPlaca_Internalname,A67Invd_NumeroPlaca,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_NumeroPlaca_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Descripcion_Internalname,A298Cata_Descripcion,GXutil.rtrim( localUtil.format( A298Cata_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCata_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMarca_Internalname,AV24Marca,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMarca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavModelo_Internalname,AV25Modelo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavModelo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSerial_Internalname,AV26Serial,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSerial_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Cedula_Internalname,GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A688Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Cedula_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Nombre_Internalname,A44Cuen_Nombre,GXutil.rtrim( localUtil.format( A44Cuen_Nombre, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Nombre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_PlacaPadre_Internalname,A68Invd_PlacaPadre,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_PlacaPadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_ValorAdquisicion_Internalname,GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(24), (byte)(2), ",", "")),localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_ValorAdquisicion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCosto_Total_Dev_Internalname,GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(24), (byte)(2), ",", "")),localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCosto_Total_Dev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_FechaAdquisicion_Internalname,localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"),localUtil.format( A466Invd_FechaAdquisicion, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_FechaAdquisicion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Fecha","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_RegionalId_Internalname,GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_RegionalId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_CentroCostoId_Internalname,GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_CentroCostoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_95_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "INVD_MODULOALMACEN_" + sGXsfl_95_idx ;
            cmbInvd_ModuloAlmacen.setName( GXCCtl );
            cmbInvd_ModuloAlmacen.setWebtags( "" );
            cmbInvd_ModuloAlmacen.addItem("", "", (short)(0));
            cmbInvd_ModuloAlmacen.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
            cmbInvd_ModuloAlmacen.addItem("INVE", "INVENTARIO", (short)(0));
            cmbInvd_ModuloAlmacen.addItem("ALMA", "ALMACEN", (short)(0));
            if ( cmbInvd_ModuloAlmacen.getItemCount() > 0 )
            {
               A412Invd_ModuloAlmacen = cmbInvd_ModuloAlmacen.getValidValue(A412Invd_ModuloAlmacen) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbInvd_ModuloAlmacen,cmbInvd_ModuloAlmacen.getInternalname(),GXutil.rtrim( A412Invd_ModuloAlmacen),new Integer(1),cmbInvd_ModuloAlmacen.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbInvd_ModuloAlmacen.setValue( GXutil.rtrim( A412Invd_ModuloAlmacen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbInvd_ModuloAlmacen.getInternalname(), "Values", cmbInvd_ModuloAlmacen.ToJavascriptSource(), !bGXsfl_95_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_AlmacenCodigo_Internalname,A413Invd_AlmacenCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_AlmacenCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_BodegaCodigo_Internalname,A414Invd_BodegaCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_BodegaCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_95_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "INVD_ESTADO_" + sGXsfl_95_idx ;
            cmbInvd_Estado.setName( GXCCtl );
            cmbInvd_Estado.setWebtags( "" );
            cmbInvd_Estado.addItem("R", "Ratificado", (short)(0));
            cmbInvd_Estado.addItem("P", "Pendiente", (short)(0));
            if ( cmbInvd_Estado.getItemCount() > 0 )
            {
               A463Invd_Estado = cmbInvd_Estado.getValidValue(A463Invd_Estado) ;
               n463Invd_Estado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbInvd_Estado,cmbInvd_Estado.getInternalname(),GXutil.rtrim( A463Invd_Estado),new Integer(1),cmbInvd_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbInvd_Estado.setValue( GXutil.rtrim( A463Invd_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbInvd_Estado.getInternalname(), "Values", cmbInvd_Estado.ToJavascriptSource(), !bGXsfl_95_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_FechaServicio_Internalname,localUtil.format(A467Invd_FechaServicio, "99/99/99"),localUtil.format( A467Invd_FechaServicio, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_FechaServicio_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Fecha","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_EsPlacaPadre_Internalname,GXutil.rtrim( A501Invd_EsPlacaPadre),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_EsPlacaPadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCuen_Identificacion_Internalname,GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCuen_Identificacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCosto_Desmante_Internalname,GXutil.ltrim( localUtil.ntoc( A624Costo_Desmante, (byte)(24), (byte)(2), ",", "")),localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCosto_Desmante_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVariable_VF_Internalname,GXutil.ltrim( localUtil.ntoc( A625Variable_VF, (byte)(24), (byte)(2), ",", "")),localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVariable_VF_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVariable_I_Internalname,GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVariable_I_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVariable_N_Internalname,GXutil.ltrim( localUtil.ntoc( A627Variable_N, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVariable_N_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOtros_Costos_Dev_Internalname,GXutil.ltrim( localUtil.ntoc( A628Otros_Costos_Dev, (byte)(24), (byte)(2), ",", "")),localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOtros_Costos_Dev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVida_Util_Inicial_Internalname,GXutil.ltrim( localUtil.ntoc( A630Vida_Util_Inicial, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVida_Util_Inicial_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVida_Util_Actual_Internalname,GXutil.ltrim( localUtil.ntoc( A631Vida_Util_Actual, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVida_Util_Actual_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClas_Codigo_Internalname,A34Clas_Codigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClas_Codigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtClas_Descripcion_Internalname,A291Clas_Descripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtClas_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(150),new Integer(0),new Integer(0),new Integer(95),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         ClassString = "DisplayAttribute" ;
         StyleString = "" ;
         AV10Display_IsBlob = (boolean)(((GXutil.strcmp("", AV10Display)==0)&&(GXutil.strcmp("", AV34Display_GXI)==0))||!(GXutil.strcmp("", AV10Display)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV10Display)==0) ? AV34Display_GXI : httpContext.getResourceRelative(AV10Display)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDisplay_Internalname,sImgUrl,edtavDisplay_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavDisplay_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV10Display_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_NUMEROPLACA"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, GXutil.rtrim( localUtil.format( A67Invd_NumeroPlaca, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_PLACAPADRE"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_VALORADQUISICION"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, localUtil.format( A465Invd_ValorAdquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_COSTO_TOTAL_DEV"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_FECHAADQUISICION"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, A466Invd_FechaAdquisicion));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_REGIONALID"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_CENTROCOSTOID"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_MODULOALMACEN"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ALMACENCODIGO"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_BODEGACODIGO"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ESTADO"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_FECHASERVICIO"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, A467Invd_FechaServicio));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ESPLACAPADRE"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, GXutil.rtrim( localUtil.format( A501Invd_EsPlacaPadre, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CUEN_IDENTIFICACION"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, localUtil.format( DecimalUtil.doubleToDec(A43Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_COSTO_DESMANTE"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, localUtil.format( A624Costo_Desmante, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_VF"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, localUtil.format( A625Variable_VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_I"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, localUtil.format( DecimalUtil.doubleToDec(A626Variable_I), "ZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VARIABLE_N"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, localUtil.format( DecimalUtil.doubleToDec(A627Variable_N), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_OTROS_COSTOS_DEV"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, localUtil.format( A628Otros_Costos_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VIDA_UTIL_INICIAL"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, localUtil.format( DecimalUtil.doubleToDec(A630Vida_Util_Inicial), "ZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_VIDA_UTIL_ACTUAL"+"_"+sGXsfl_95_idx, getSecureSignedToken( sGXsfl_95_idx, localUtil.format( DecimalUtil.doubleToDec(A631Vida_Util_Actual), "ZZZ9")));
         GridContainer.AddRow(GridRow);
         nGXsfl_95_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_95_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_95_idx+1)) ;
         sGXsfl_95_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_95_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_952( ) ;
      }
      /* End function sendrow_952 */
   }

   public void init_default_properties( )
   {
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      lblTitletext_Internalname = "TITLETEXT" ;
      edtavInvd_numeroplaca_Internalname = "vINVD_NUMEROPLACA" ;
      divTabletop_Internalname = "TABLETOP" ;
      lblLblconsecutivofilter_Internalname = "LBLCONSECUTIVOFILTER" ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO" ;
      divConsecutivofiltercontainer_Internalname = "CONSECUTIVOFILTERCONTAINER" ;
      lblLblcata_descripcionfilter_Internalname = "LBLCATA_DESCRIPCIONFILTER" ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION" ;
      divCata_descripcionfiltercontainer_Internalname = "CATA_DESCRIPCIONFILTERCONTAINER" ;
      lblLblcuen_nombrefilter_Internalname = "LBLCUEN_NOMBREFILTER" ;
      edtavCuen_nombre_Internalname = "vCUEN_NOMBRE" ;
      divCuen_nombrefiltercontainer_Internalname = "CUEN_NOMBREFILTERCONTAINER" ;
      lblLblcuen_cedulafilter_Internalname = "LBLCUEN_CEDULAFILTER" ;
      edtavCuen_cedula_Internalname = "vCUEN_CEDULA" ;
      divCuen_cedulafiltercontainer_Internalname = "CUEN_CEDULAFILTERCONTAINER" ;
      lblLblmarcafilter_Internalname = "LBLMARCAFILTER" ;
      edtavCmarca_Internalname = "vCMARCA" ;
      divInvd_marcafiltercontainer_Internalname = "INVD_MARCAFILTERCONTAINER" ;
      lblLblmodelofilter_Internalname = "LBLMODELOFILTER" ;
      edtavCmodelo_Internalname = "vCMODELO" ;
      divInvd_modelofiltercontainer_Internalname = "INVD_MODELOFILTERCONTAINER" ;
      lblLblserialfilter_Internalname = "LBLSERIALFILTER" ;
      edtavCserial_Internalname = "vCSERIAL" ;
      divInvd_serialfiltercontainer_Internalname = "INVD_SERIALFILTERCONTAINER" ;
      divFilterscontainer_Internalname = "FILTERSCONTAINER" ;
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION" ;
      edtavMarca_Internalname = "vMARCA" ;
      edtavModelo_Internalname = "vMODELO" ;
      edtavSerial_Internalname = "vSERIAL" ;
      edtCuen_Cedula_Internalname = "CUEN_CEDULA" ;
      edtCuen_Nombre_Internalname = "CUEN_NOMBRE" ;
      edtInvd_PlacaPadre_Internalname = "INVD_PLACAPADRE" ;
      edtInvd_ValorAdquisicion_Internalname = "INVD_VALORADQUISICION" ;
      edtCosto_Total_Dev_Internalname = "COSTO_TOTAL_DEV" ;
      edtInvd_FechaAdquisicion_Internalname = "INVD_FECHAADQUISICION" ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID" ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID" ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN" );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO" ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO" ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO" );
      edtInvd_FechaServicio_Internalname = "INVD_FECHASERVICIO" ;
      edtInvd_EsPlacaPadre_Internalname = "INVD_ESPLACAPADRE" ;
      edtCuen_Identificacion_Internalname = "CUEN_IDENTIFICACION" ;
      edtCosto_Desmante_Internalname = "COSTO_DESMANTE" ;
      edtVariable_VF_Internalname = "VARIABLE_VF" ;
      edtVariable_I_Internalname = "VARIABLE_I" ;
      edtVariable_N_Internalname = "VARIABLE_N" ;
      edtOtros_Costos_Dev_Internalname = "OTROS_COSTOS_DEV" ;
      edtVida_Util_Inicial_Internalname = "VIDA_UTIL_INICIAL" ;
      edtVida_Util_Actual_Internalname = "VIDA_UTIL_ACTUAL" ;
      edtClas_Codigo_Internalname = "CLAS_CODIGO" ;
      edtClas_Descripcion_Internalname = "CLAS_DESCRIPCION" ;
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
      edtClas_Descripcion_Jsonclick = "" ;
      edtClas_Codigo_Jsonclick = "" ;
      edtVida_Util_Actual_Jsonclick = "" ;
      edtVida_Util_Inicial_Jsonclick = "" ;
      edtOtros_Costos_Dev_Jsonclick = "" ;
      edtVariable_N_Jsonclick = "" ;
      edtVariable_I_Jsonclick = "" ;
      edtVariable_VF_Jsonclick = "" ;
      edtCosto_Desmante_Jsonclick = "" ;
      edtCuen_Identificacion_Jsonclick = "" ;
      edtInvd_EsPlacaPadre_Jsonclick = "" ;
      edtInvd_FechaServicio_Jsonclick = "" ;
      cmbInvd_Estado.setJsonclick( "" );
      edtInvd_BodegaCodigo_Jsonclick = "" ;
      edtInvd_AlmacenCodigo_Jsonclick = "" ;
      cmbInvd_ModuloAlmacen.setJsonclick( "" );
      edtInvd_CentroCostoId_Jsonclick = "" ;
      edtInvd_RegionalId_Jsonclick = "" ;
      edtInvd_FechaAdquisicion_Jsonclick = "" ;
      edtCosto_Total_Dev_Jsonclick = "" ;
      edtInvd_ValorAdquisicion_Jsonclick = "" ;
      edtInvd_PlacaPadre_Jsonclick = "" ;
      edtCuen_Nombre_Jsonclick = "" ;
      edtCuen_Cedula_Jsonclick = "" ;
      edtavSerial_Jsonclick = "" ;
      edtavModelo_Jsonclick = "" ;
      edtavMarca_Jsonclick = "" ;
      edtCata_Descripcion_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtInvd_NumeroPlaca_Jsonclick = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      edtavDisplay_Link = "" ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divGridcell_Class = "col-xs-12 col-sm-9 col-md-10 WWGridCell" ;
      edtavCserial_Jsonclick = "" ;
      edtavCserial_Enabled = 1 ;
      edtavCserial_Visible = 1 ;
      lblLblserialfilter_Caption = "Serial" ;
      edtavCmodelo_Jsonclick = "" ;
      edtavCmodelo_Enabled = 1 ;
      edtavCmodelo_Visible = 1 ;
      lblLblmodelofilter_Caption = "Modelo" ;
      edtavCmarca_Jsonclick = "" ;
      edtavCmarca_Enabled = 1 ;
      edtavCmarca_Visible = 1 ;
      lblLblmarcafilter_Caption = "Marca" ;
      edtavCuen_cedula_Jsonclick = "" ;
      edtavCuen_cedula_Enabled = 1 ;
      edtavCuen_cedula_Visible = 1 ;
      lblLblcuen_cedulafilter_Caption = "Cédula" ;
      edtavCuen_nombre_Jsonclick = "" ;
      edtavCuen_nombre_Enabled = 1 ;
      edtavCuen_nombre_Visible = 1 ;
      lblLblcuen_nombrefilter_Caption = "Nombre Cuentadante" ;
      edtavCata_descripcion_Enabled = 1 ;
      edtavCata_descripcion_Visible = 1 ;
      lblLblcata_descripcionfilter_Caption = "Descripción del bien" ;
      edtavElem_consecutivo_Jsonclick = "" ;
      edtavElem_consecutivo_Enabled = 1 ;
      edtavElem_consecutivo_Visible = 1 ;
      lblLblconsecutivofilter_Caption = "Consecutivo" ;
      edtavInvd_numeroplaca_Jsonclick = "" ;
      edtavInvd_numeroplaca_Enabled = 1 ;
      bttBtntoggle_Class = "HideFiltersButton" ;
      bttBtntoggle_Caption = "Ocultar Filtros" ;
      divInvd_serialfiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_modelofiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_marcafiltercontainer_Class = "AdvancedContainerItem" ;
      divCuen_cedulafiltercontainer_Class = "AdvancedContainerItem" ;
      divCuen_nombrefiltercontainer_Class = "AdvancedContainerItem" ;
      divCata_descripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divConsecutivofiltercontainer_Class = "AdvancedContainerItem" ;
      divFilterscontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Work With Inventario devolutivo" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV10Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV24Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV25Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV26Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV30Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV28Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV11Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV5ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV9Cuen_Nombre',fld:'vCUEN_NOMBRE',pic:'@!',nv:''},{av:'AV8Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV22cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV33Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV16Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''}],oparms:[{av:'lblLblconsecutivofilter_Caption',ctrl:'LBLCONSECUTIVOFILTER',prop:'Caption'},{av:'lblLblcata_descripcionfilter_Caption',ctrl:'LBLCATA_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcuen_nombrefilter_Caption',ctrl:'LBLCUEN_NOMBREFILTER',prop:'Caption'},{av:'lblLblcuen_cedulafilter_Caption',ctrl:'LBLCUEN_CEDULAFILTER',prop:'Caption'},{av:'lblLblmarcafilter_Caption',ctrl:'LBLMARCAFILTER',prop:'Caption'},{av:'lblLblmodelofilter_Caption',ctrl:'LBLMODELOFILTER',prop:'Caption'},{av:'lblLblserialfilter_Caption',ctrl:'LBLSERIALFILTER',prop:'Caption'}]}");
      setEventMetadata("'TOGGLE'","{handler:'e112C1',iparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'}],oparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Caption'},{av:'divGridcell_Class',ctrl:'GRIDCELL',prop:'Class'}]}");
      setEventMetadata("LBLCONSECUTIVOFILTER.CLICK","{handler:'e122C1',iparms:[{av:'divConsecutivofiltercontainer_Class',ctrl:'CONSECUTIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divConsecutivofiltercontainer_Class',ctrl:'CONSECUTIVOFILTERCONTAINER',prop:'Class'},{av:'edtavElem_consecutivo_Visible',ctrl:'vELEM_CONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLCATA_DESCRIPCIONFILTER.CLICK","{handler:'e132C1',iparms:[{av:'divCata_descripcionfiltercontainer_Class',ctrl:'CATA_DESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCata_descripcionfiltercontainer_Class',ctrl:'CATA_DESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCata_descripcion_Visible',ctrl:'vCATA_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLCUEN_NOMBREFILTER.CLICK","{handler:'e142C1',iparms:[{av:'divCuen_nombrefiltercontainer_Class',ctrl:'CUEN_NOMBREFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCuen_nombrefiltercontainer_Class',ctrl:'CUEN_NOMBREFILTERCONTAINER',prop:'Class'},{av:'edtavCuen_nombre_Visible',ctrl:'vCUEN_NOMBRE',prop:'Visible'}]}");
      setEventMetadata("LBLCUEN_CEDULAFILTER.CLICK","{handler:'e152C1',iparms:[{av:'divCuen_cedulafiltercontainer_Class',ctrl:'CUEN_CEDULAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divCuen_cedulafiltercontainer_Class',ctrl:'CUEN_CEDULAFILTERCONTAINER',prop:'Class'},{av:'edtavCuen_cedula_Visible',ctrl:'vCUEN_CEDULA',prop:'Visible'}]}");
      setEventMetadata("LBLMARCAFILTER.CLICK","{handler:'e162C1',iparms:[{av:'divInvd_marcafiltercontainer_Class',ctrl:'INVD_MARCAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_marcafiltercontainer_Class',ctrl:'INVD_MARCAFILTERCONTAINER',prop:'Class'},{av:'edtavCmarca_Visible',ctrl:'vCMARCA',prop:'Visible'}]}");
      setEventMetadata("LBLMODELOFILTER.CLICK","{handler:'e172C1',iparms:[{av:'divInvd_modelofiltercontainer_Class',ctrl:'INVD_MODELOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_modelofiltercontainer_Class',ctrl:'INVD_MODELOFILTERCONTAINER',prop:'Class'},{av:'edtavCmodelo_Visible',ctrl:'vCMODELO',prop:'Visible'}]}");
      setEventMetadata("LBLSERIALFILTER.CLICK","{handler:'e182C1',iparms:[{av:'divInvd_serialfiltercontainer_Class',ctrl:'INVD_SERIALFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_serialfiltercontainer_Class',ctrl:'INVD_SERIALFILTERCONTAINER',prop:'Class'},{av:'edtavCserial_Visible',ctrl:'vCSERIAL',prop:'Visible'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e212C2',iparms:[{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV24Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV25Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV26Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV30Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV28Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV23cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV22cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV21cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV9Cuen_Nombre',fld:'vCUEN_NOMBRE',pic:'@!',nv:''}],oparms:[{av:'edtavDisplay_Link',ctrl:'vDISPLAY',prop:'Link'},{av:'AV28Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV30Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV26Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV25Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV24Marca',fld:'vMARCA',pic:'',nv:''}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV10Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV24Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV25Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV26Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV30Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV28Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV11Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV5ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV9Cuen_Nombre',fld:'vCUEN_NOMBRE',pic:'@!',nv:''},{av:'AV8Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV22cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV33Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV16Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''}],oparms:[{av:'lblLblconsecutivofilter_Caption',ctrl:'LBLCONSECUTIVOFILTER',prop:'Caption'},{av:'lblLblcata_descripcionfilter_Caption',ctrl:'LBLCATA_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcuen_nombrefilter_Caption',ctrl:'LBLCUEN_NOMBREFILTER',prop:'Caption'},{av:'lblLblcuen_cedulafilter_Caption',ctrl:'LBLCUEN_CEDULAFILTER',prop:'Caption'},{av:'lblLblmarcafilter_Caption',ctrl:'LBLMARCAFILTER',prop:'Caption'},{av:'lblLblmodelofilter_Caption',ctrl:'LBLMODELOFILTER',prop:'Caption'},{av:'lblLblserialfilter_Caption',ctrl:'LBLSERIALFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV10Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV24Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV25Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV26Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV30Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV28Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV11Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV5ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV9Cuen_Nombre',fld:'vCUEN_NOMBRE',pic:'@!',nv:''},{av:'AV8Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV22cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV33Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV16Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''}],oparms:[{av:'lblLblconsecutivofilter_Caption',ctrl:'LBLCONSECUTIVOFILTER',prop:'Caption'},{av:'lblLblcata_descripcionfilter_Caption',ctrl:'LBLCATA_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcuen_nombrefilter_Caption',ctrl:'LBLCUEN_NOMBREFILTER',prop:'Caption'},{av:'lblLblcuen_cedulafilter_Caption',ctrl:'LBLCUEN_CEDULAFILTER',prop:'Caption'},{av:'lblLblmarcafilter_Caption',ctrl:'LBLMARCAFILTER',prop:'Caption'},{av:'lblLblmodelofilter_Caption',ctrl:'LBLMODELOFILTER',prop:'Caption'},{av:'lblLblserialfilter_Caption',ctrl:'LBLSERIALFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV10Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV24Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV25Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV26Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV30Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV28Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV11Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV5ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV9Cuen_Nombre',fld:'vCUEN_NOMBRE',pic:'@!',nv:''},{av:'AV8Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV22cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV33Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV16Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''}],oparms:[{av:'lblLblconsecutivofilter_Caption',ctrl:'LBLCONSECUTIVOFILTER',prop:'Caption'},{av:'lblLblcata_descripcionfilter_Caption',ctrl:'LBLCATA_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcuen_nombrefilter_Caption',ctrl:'LBLCUEN_NOMBREFILTER',prop:'Caption'},{av:'lblLblcuen_cedulafilter_Caption',ctrl:'LBLCUEN_CEDULAFILTER',prop:'Caption'},{av:'lblLblmarcafilter_Caption',ctrl:'LBLMARCAFILTER',prop:'Caption'},{av:'lblLblmodelofilter_Caption',ctrl:'LBLMODELOFILTER',prop:'Caption'},{av:'lblLblserialfilter_Caption',ctrl:'LBLSERIALFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV10Display',fld:'vDISPLAY',pic:'',nv:''},{av:'edtavDisplay_Tooltiptext',ctrl:'vDISPLAY',prop:'Tooltiptext'},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV24Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV25Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV26Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV30Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV28Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV11Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV5ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV9Cuen_Nombre',fld:'vCUEN_NOMBRE',pic:'@!',nv:''},{av:'AV8Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21cMarca',fld:'vCMARCA',pic:'',nv:''},{av:'AV22cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV23cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV33Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV16Invd_NumeroPlaca',fld:'vINVD_NUMEROPLACA',pic:'',nv:''}],oparms:[{av:'lblLblconsecutivofilter_Caption',ctrl:'LBLCONSECUTIVOFILTER',prop:'Caption'},{av:'lblLblcata_descripcionfilter_Caption',ctrl:'LBLCATA_DESCRIPCIONFILTER',prop:'Caption'},{av:'lblLblcuen_nombrefilter_Caption',ctrl:'LBLCUEN_NOMBREFILTER',prop:'Caption'},{av:'lblLblcuen_cedulafilter_Caption',ctrl:'LBLCUEN_CEDULAFILTER',prop:'Caption'},{av:'lblLblmarcafilter_Caption',ctrl:'LBLMARCAFILTER',prop:'Caption'},{av:'lblLblmodelofilter_Caption',ctrl:'LBLMODELOFILTER',prop:'Caption'},{av:'lblLblserialfilter_Caption',ctrl:'LBLSERIALFILTER',prop:'Caption'}]}");
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
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV10Display = "" ;
      AV16Invd_NumeroPlaca = "" ;
      AV11Elem_Consecutivo = "" ;
      AV6Cata_Descripcion = "" ;
      AV9Cuen_Nombre = "" ;
      AV5ADVANCED_LABEL_TEMPLATE = "" ;
      AV21cMarca = "" ;
      AV22cModelo = "" ;
      AV23cSerial = "" ;
      AV33Pgmname = "" ;
      A67Invd_NumeroPlaca = "" ;
      AV24Marca = "" ;
      AV25Modelo = "" ;
      AV26Serial = "" ;
      AV29Observaciones = "" ;
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
      lblLblconsecutivofilter_Jsonclick = "" ;
      lblLblcata_descripcionfilter_Jsonclick = "" ;
      lblLblcuen_nombrefilter_Jsonclick = "" ;
      lblLblcuen_cedulafilter_Jsonclick = "" ;
      lblLblmarcafilter_Jsonclick = "" ;
      lblLblmodelofilter_Jsonclick = "" ;
      lblLblserialfilter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A66Elem_Consecutivo = "" ;
      A298Cata_Descripcion = "" ;
      A44Cuen_Nombre = "" ;
      A68Invd_PlacaPadre = "" ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      A466Invd_FechaAdquisicion = GXutil.nullDate() ;
      A412Invd_ModuloAlmacen = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A414Invd_BodegaCodigo = "" ;
      A463Invd_Estado = "" ;
      A467Invd_FechaServicio = GXutil.nullDate() ;
      A501Invd_EsPlacaPadre = "" ;
      A624Costo_Desmante = DecimalUtil.ZERO ;
      A625Variable_VF = DecimalUtil.ZERO ;
      A628Otros_Costos_Dev = DecimalUtil.ZERO ;
      A34Clas_Codigo = "" ;
      A291Clas_Descripcion = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV34Display_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV16Invd_NumeroPlaca = "" ;
      lV11Elem_Consecutivo = "" ;
      H002C2_A37Cata_Codigo = new String[] {""} ;
      H002C2_A298Cata_Descripcion = new String[] {""} ;
      H002C2_A44Cuen_Nombre = new String[] {""} ;
      H002C2_n44Cuen_Nombre = new boolean[] {false} ;
      H002C2_A688Cuen_Cedula = new long[1] ;
      H002C2_A66Elem_Consecutivo = new String[] {""} ;
      H002C2_A67Invd_NumeroPlaca = new String[] {""} ;
      H002C2_A291Clas_Descripcion = new String[] {""} ;
      H002C2_A34Clas_Codigo = new String[] {""} ;
      H002C2_A631Vida_Util_Actual = new short[1] ;
      H002C2_n631Vida_Util_Actual = new boolean[] {false} ;
      H002C2_A630Vida_Util_Inicial = new short[1] ;
      H002C2_n630Vida_Util_Inicial = new boolean[] {false} ;
      H002C2_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002C2_n628Otros_Costos_Dev = new boolean[] {false} ;
      H002C2_A627Variable_N = new short[1] ;
      H002C2_n627Variable_N = new boolean[] {false} ;
      H002C2_A626Variable_I = new short[1] ;
      H002C2_n626Variable_I = new boolean[] {false} ;
      H002C2_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002C2_n625Variable_VF = new boolean[] {false} ;
      H002C2_A624Costo_Desmante = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002C2_n624Costo_Desmante = new boolean[] {false} ;
      H002C2_A43Cuen_Identificacion = new long[1] ;
      H002C2_n43Cuen_Identificacion = new boolean[] {false} ;
      H002C2_A501Invd_EsPlacaPadre = new String[] {""} ;
      H002C2_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      H002C2_A467Invd_FechaServicio = new java.util.Date[] {GXutil.nullDate()} ;
      H002C2_n467Invd_FechaServicio = new boolean[] {false} ;
      H002C2_A463Invd_Estado = new String[] {""} ;
      H002C2_n463Invd_Estado = new boolean[] {false} ;
      H002C2_A414Invd_BodegaCodigo = new String[] {""} ;
      H002C2_A413Invd_AlmacenCodigo = new String[] {""} ;
      H002C2_A412Invd_ModuloAlmacen = new String[] {""} ;
      H002C2_A411Invd_CentroCostoId = new long[1] ;
      H002C2_A410Invd_RegionalId = new long[1] ;
      H002C2_A466Invd_FechaAdquisicion = new java.util.Date[] {GXutil.nullDate()} ;
      H002C2_n466Invd_FechaAdquisicion = new boolean[] {false} ;
      H002C2_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002C2_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H002C2_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      H002C2_A68Invd_PlacaPadre = new String[] {""} ;
      H002C2_n68Invd_PlacaPadre = new boolean[] {false} ;
      A37Cata_Codigo = "" ;
      AV27Placa = "" ;
      GXv_char1 = new String [1] ;
      GXv_char2 = new String [1] ;
      GXv_char3 = new String [1] ;
      GXv_char4 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_int6 = new long [1] ;
      GXv_int7 = new int [1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV15HTTPRequest = httpContext.getHttpRequest();
      AV13GridState = new com.orions2.SdtGridState(remoteHandle, context);
      AV18Session = httpContext.getWebSession();
      AV14GridStateFilterValue = new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV19TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_inventario_devolutivo__default(),
         new Object[] {
             new Object[] {
            H002C2_A37Cata_Codigo, H002C2_A298Cata_Descripcion, H002C2_A44Cuen_Nombre, H002C2_n44Cuen_Nombre, H002C2_A688Cuen_Cedula, H002C2_A66Elem_Consecutivo, H002C2_A67Invd_NumeroPlaca, H002C2_A291Clas_Descripcion, H002C2_A34Clas_Codigo, H002C2_A631Vida_Util_Actual,
            H002C2_n631Vida_Util_Actual, H002C2_A630Vida_Util_Inicial, H002C2_n630Vida_Util_Inicial, H002C2_A628Otros_Costos_Dev, H002C2_n628Otros_Costos_Dev, H002C2_A627Variable_N, H002C2_n627Variable_N, H002C2_A626Variable_I, H002C2_n626Variable_I, H002C2_A625Variable_VF,
            H002C2_n625Variable_VF, H002C2_A624Costo_Desmante, H002C2_n624Costo_Desmante, H002C2_A43Cuen_Identificacion, H002C2_n43Cuen_Identificacion, H002C2_A501Invd_EsPlacaPadre, H002C2_n501Invd_EsPlacaPadre, H002C2_A467Invd_FechaServicio, H002C2_n467Invd_FechaServicio, H002C2_A463Invd_Estado,
            H002C2_n463Invd_Estado, H002C2_A414Invd_BodegaCodigo, H002C2_A413Invd_AlmacenCodigo, H002C2_A412Invd_ModuloAlmacen, H002C2_A411Invd_CentroCostoId, H002C2_A410Invd_RegionalId, H002C2_A466Invd_FechaAdquisicion, H002C2_n466Invd_FechaAdquisicion, H002C2_A629Costo_Total_Dev, H002C2_A465Invd_ValorAdquisicion,
            H002C2_n465Invd_ValorAdquisicion, H002C2_A68Invd_PlacaPadre, H002C2_n68Invd_PlacaPadre
            }
         }
      );
      AV33Pgmname = "WWALM_INVENTARIO_DEVOLUTIVO" ;
      /* GeneXus formulas. */
      AV33Pgmname = "WWALM_INVENTARIO_DEVOLUTIVO" ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_95 ;
   private short nGXsfl_95_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A626Variable_I ;
   private short A627Variable_N ;
   private short A630Vida_Util_Inicial ;
   private short A631Vida_Util_Actual ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int AV28Nro_Linea ;
   private int edtavInvd_numeroplaca_Enabled ;
   private int edtavElem_consecutivo_Visible ;
   private int edtavElem_consecutivo_Enabled ;
   private int edtavCata_descripcion_Visible ;
   private int edtavCata_descripcion_Enabled ;
   private int edtavCuen_nombre_Visible ;
   private int edtavCuen_nombre_Enabled ;
   private int edtavCuen_cedula_Enabled ;
   private int edtavCuen_cedula_Visible ;
   private int edtavCmarca_Visible ;
   private int edtavCmarca_Enabled ;
   private int edtavCmodelo_Visible ;
   private int edtavCmodelo_Enabled ;
   private int edtavCserial_Visible ;
   private int edtavCserial_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int GXv_int7[] ;
   private int AV12GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private long AV8Cuen_Cedula ;
   private long AV30Tran_IdEntrada ;
   private long GRID_nFirstRecordOnPage ;
   private long A688Cuen_Cedula ;
   private long A410Invd_RegionalId ;
   private long A411Invd_CentroCostoId ;
   private long A43Cuen_Identificacion ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A465Invd_ValorAdquisicion ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
   private java.math.BigDecimal A624Costo_Desmante ;
   private java.math.BigDecimal A625Variable_VF ;
   private java.math.BigDecimal A628Otros_Costos_Dev ;
   private String edtavDisplay_Tooltiptext ;
   private String divFilterscontainer_Class ;
   private String divConsecutivofiltercontainer_Class ;
   private String divCata_descripcionfiltercontainer_Class ;
   private String divCuen_nombrefiltercontainer_Class ;
   private String divCuen_cedulafiltercontainer_Class ;
   private String divInvd_marcafiltercontainer_Class ;
   private String divInvd_modelofiltercontainer_Class ;
   private String divInvd_serialfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_95_idx="0001" ;
   private String edtavDisplay_Internalname ;
   private String AV5ADVANCED_LABEL_TEMPLATE ;
   private String AV33Pgmname ;
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
   private String edtavInvd_numeroplaca_Internalname ;
   private String edtavInvd_numeroplaca_Jsonclick ;
   private String divFilterscontainer_Internalname ;
   private String divConsecutivofiltercontainer_Internalname ;
   private String lblLblconsecutivofilter_Internalname ;
   private String lblLblconsecutivofilter_Caption ;
   private String lblLblconsecutivofilter_Jsonclick ;
   private String edtavElem_consecutivo_Internalname ;
   private String edtavElem_consecutivo_Jsonclick ;
   private String divCata_descripcionfiltercontainer_Internalname ;
   private String lblLblcata_descripcionfilter_Internalname ;
   private String lblLblcata_descripcionfilter_Caption ;
   private String lblLblcata_descripcionfilter_Jsonclick ;
   private String edtavCata_descripcion_Internalname ;
   private String divCuen_nombrefiltercontainer_Internalname ;
   private String lblLblcuen_nombrefilter_Internalname ;
   private String lblLblcuen_nombrefilter_Caption ;
   private String lblLblcuen_nombrefilter_Jsonclick ;
   private String edtavCuen_nombre_Internalname ;
   private String edtavCuen_nombre_Jsonclick ;
   private String divCuen_cedulafiltercontainer_Internalname ;
   private String lblLblcuen_cedulafilter_Internalname ;
   private String lblLblcuen_cedulafilter_Caption ;
   private String lblLblcuen_cedulafilter_Jsonclick ;
   private String edtavCuen_cedula_Internalname ;
   private String edtavCuen_cedula_Jsonclick ;
   private String divInvd_marcafiltercontainer_Internalname ;
   private String lblLblmarcafilter_Internalname ;
   private String lblLblmarcafilter_Caption ;
   private String lblLblmarcafilter_Jsonclick ;
   private String edtavCmarca_Internalname ;
   private String edtavCmarca_Jsonclick ;
   private String divInvd_modelofiltercontainer_Internalname ;
   private String lblLblmodelofilter_Internalname ;
   private String lblLblmodelofilter_Caption ;
   private String lblLblmodelofilter_Jsonclick ;
   private String edtavCmodelo_Internalname ;
   private String edtavCmodelo_Jsonclick ;
   private String divInvd_serialfiltercontainer_Internalname ;
   private String lblLblserialfilter_Internalname ;
   private String lblLblserialfilter_Caption ;
   private String lblLblserialfilter_Jsonclick ;
   private String edtavCserial_Internalname ;
   private String edtavCserial_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridcell_Class ;
   private String divGridtable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String A501Invd_EsPlacaPadre ;
   private String edtavDisplay_Link ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtInvd_NumeroPlaca_Internalname ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtCata_Descripcion_Internalname ;
   private String edtavMarca_Internalname ;
   private String edtavModelo_Internalname ;
   private String edtavSerial_Internalname ;
   private String edtCuen_Cedula_Internalname ;
   private String edtCuen_Nombre_Internalname ;
   private String edtInvd_PlacaPadre_Internalname ;
   private String edtInvd_ValorAdquisicion_Internalname ;
   private String edtCosto_Total_Dev_Internalname ;
   private String edtInvd_FechaAdquisicion_Internalname ;
   private String edtInvd_RegionalId_Internalname ;
   private String edtInvd_CentroCostoId_Internalname ;
   private String edtInvd_AlmacenCodigo_Internalname ;
   private String edtInvd_BodegaCodigo_Internalname ;
   private String edtInvd_FechaServicio_Internalname ;
   private String edtInvd_EsPlacaPadre_Internalname ;
   private String edtCuen_Identificacion_Internalname ;
   private String edtCosto_Desmante_Internalname ;
   private String edtVariable_VF_Internalname ;
   private String edtVariable_I_Internalname ;
   private String edtVariable_N_Internalname ;
   private String edtOtros_Costos_Dev_Internalname ;
   private String edtVida_Util_Inicial_Internalname ;
   private String edtVida_Util_Actual_Internalname ;
   private String edtClas_Codigo_Internalname ;
   private String edtClas_Descripcion_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String sGXsfl_95_fel_idx="0001" ;
   private String ROClassString ;
   private String edtInvd_NumeroPlaca_Jsonclick ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtCata_Descripcion_Jsonclick ;
   private String edtavMarca_Jsonclick ;
   private String edtavModelo_Jsonclick ;
   private String edtavSerial_Jsonclick ;
   private String edtCuen_Cedula_Jsonclick ;
   private String edtCuen_Nombre_Jsonclick ;
   private String edtInvd_PlacaPadre_Jsonclick ;
   private String edtInvd_ValorAdquisicion_Jsonclick ;
   private String edtCosto_Total_Dev_Jsonclick ;
   private String edtInvd_FechaAdquisicion_Jsonclick ;
   private String edtInvd_RegionalId_Jsonclick ;
   private String edtInvd_CentroCostoId_Jsonclick ;
   private String edtInvd_AlmacenCodigo_Jsonclick ;
   private String edtInvd_BodegaCodigo_Jsonclick ;
   private String edtInvd_FechaServicio_Jsonclick ;
   private String edtInvd_EsPlacaPadre_Jsonclick ;
   private String edtCuen_Identificacion_Jsonclick ;
   private String edtCosto_Desmante_Jsonclick ;
   private String edtVariable_VF_Jsonclick ;
   private String edtVariable_I_Jsonclick ;
   private String edtVariable_N_Jsonclick ;
   private String edtOtros_Costos_Dev_Jsonclick ;
   private String edtVida_Util_Inicial_Jsonclick ;
   private String edtVida_Util_Actual_Jsonclick ;
   private String edtClas_Codigo_Jsonclick ;
   private String edtClas_Descripcion_Jsonclick ;
   private String sImgUrl ;
   private java.util.Date A466Invd_FechaAdquisicion ;
   private java.util.Date A467Invd_FechaServicio ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_95_Refreshing=false ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n44Cuen_Nombre ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n465Invd_ValorAdquisicion ;
   private boolean n466Invd_FechaAdquisicion ;
   private boolean n463Invd_Estado ;
   private boolean n467Invd_FechaServicio ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean n43Cuen_Identificacion ;
   private boolean n624Costo_Desmante ;
   private boolean n625Variable_VF ;
   private boolean n626Variable_I ;
   private boolean n627Variable_N ;
   private boolean n628Otros_Costos_Dev ;
   private boolean n630Vida_Util_Inicial ;
   private boolean n631Vida_Util_Actual ;
   private boolean brk2C2 ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV10Display_IsBlob ;
   private String AV16Invd_NumeroPlaca ;
   private String AV11Elem_Consecutivo ;
   private String AV6Cata_Descripcion ;
   private String AV9Cuen_Nombre ;
   private String AV21cMarca ;
   private String AV22cModelo ;
   private String AV23cSerial ;
   private String A67Invd_NumeroPlaca ;
   private String AV24Marca ;
   private String AV25Modelo ;
   private String AV26Serial ;
   private String AV29Observaciones ;
   private String A66Elem_Consecutivo ;
   private String A298Cata_Descripcion ;
   private String A44Cuen_Nombre ;
   private String A68Invd_PlacaPadre ;
   private String A412Invd_ModuloAlmacen ;
   private String A413Invd_AlmacenCodigo ;
   private String A414Invd_BodegaCodigo ;
   private String A463Invd_Estado ;
   private String A34Clas_Codigo ;
   private String A291Clas_Descripcion ;
   private String AV34Display_GXI ;
   private String lV16Invd_NumeroPlaca ;
   private String lV11Elem_Consecutivo ;
   private String A37Cata_Codigo ;
   private String AV27Placa ;
   private String AV10Display ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV15HTTPRequest ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private HTMLChoice cmbInvd_ModuloAlmacen ;
   private HTMLChoice cmbInvd_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H002C2_A37Cata_Codigo ;
   private String[] H002C2_A298Cata_Descripcion ;
   private String[] H002C2_A44Cuen_Nombre ;
   private boolean[] H002C2_n44Cuen_Nombre ;
   private long[] H002C2_A688Cuen_Cedula ;
   private String[] H002C2_A66Elem_Consecutivo ;
   private String[] H002C2_A67Invd_NumeroPlaca ;
   private String[] H002C2_A291Clas_Descripcion ;
   private String[] H002C2_A34Clas_Codigo ;
   private short[] H002C2_A631Vida_Util_Actual ;
   private boolean[] H002C2_n631Vida_Util_Actual ;
   private short[] H002C2_A630Vida_Util_Inicial ;
   private boolean[] H002C2_n630Vida_Util_Inicial ;
   private java.math.BigDecimal[] H002C2_A628Otros_Costos_Dev ;
   private boolean[] H002C2_n628Otros_Costos_Dev ;
   private short[] H002C2_A627Variable_N ;
   private boolean[] H002C2_n627Variable_N ;
   private short[] H002C2_A626Variable_I ;
   private boolean[] H002C2_n626Variable_I ;
   private java.math.BigDecimal[] H002C2_A625Variable_VF ;
   private boolean[] H002C2_n625Variable_VF ;
   private java.math.BigDecimal[] H002C2_A624Costo_Desmante ;
   private boolean[] H002C2_n624Costo_Desmante ;
   private long[] H002C2_A43Cuen_Identificacion ;
   private boolean[] H002C2_n43Cuen_Identificacion ;
   private String[] H002C2_A501Invd_EsPlacaPadre ;
   private boolean[] H002C2_n501Invd_EsPlacaPadre ;
   private java.util.Date[] H002C2_A467Invd_FechaServicio ;
   private boolean[] H002C2_n467Invd_FechaServicio ;
   private String[] H002C2_A463Invd_Estado ;
   private boolean[] H002C2_n463Invd_Estado ;
   private String[] H002C2_A414Invd_BodegaCodigo ;
   private String[] H002C2_A413Invd_AlmacenCodigo ;
   private String[] H002C2_A412Invd_ModuloAlmacen ;
   private long[] H002C2_A411Invd_CentroCostoId ;
   private long[] H002C2_A410Invd_RegionalId ;
   private java.util.Date[] H002C2_A466Invd_FechaAdquisicion ;
   private boolean[] H002C2_n466Invd_FechaAdquisicion ;
   private java.math.BigDecimal[] H002C2_A629Costo_Total_Dev ;
   private java.math.BigDecimal[] H002C2_A465Invd_ValorAdquisicion ;
   private boolean[] H002C2_n465Invd_ValorAdquisicion ;
   private String[] H002C2_A68Invd_PlacaPadre ;
   private boolean[] H002C2_n68Invd_PlacaPadre ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV13GridState ;
   private com.orions2.SdtGridState_FilterValue AV14GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV19TrnContext ;
}

final  class wwalm_inventario_devolutivo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H002C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV16Invd_NumeroPlaca ,
                                          long AV8Cuen_Cedula ,
                                          String AV11Elem_Consecutivo ,
                                          String A67Invd_NumeroPlaca ,
                                          long A688Cuen_Cedula ,
                                          String A66Elem_Consecutivo ,
                                          String AV6Cata_Descripcion ,
                                          String A298Cata_Descripcion ,
                                          String AV9Cuen_Nombre ,
                                          String A44Cuen_Nombre )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int8 ;
      GXv_int8 = new byte [3] ;
      Object[] GXv_Object9 ;
      GXv_Object9 = new Object [2] ;
      scmdbuf = "SELECT T2.Cata_Codigo, T3.Cata_Descripcion, T5.Cuen_Nombre, T5.Cuen_Cedula, T1.Elem_Consecutivo," ;
      scmdbuf = scmdbuf + " T1.Invd_NumeroPlaca, T4.Clas_Descripcion, T3.Clas_Codigo, T1.Vida_Util_Actual, T1.Vida_Util_Inicial," ;
      scmdbuf = scmdbuf + " T1.Otros_Costos_Dev, T1.Variable_N, T1.Variable_I, T1.Variable_VF, T1.Costo_Desmante," ;
      scmdbuf = scmdbuf + " T1.Cuen_Identificacion, T1.Invd_EsPlacaPadre, T1.Invd_FechaServicio, T1.Invd_Estado," ;
      scmdbuf = scmdbuf + " T1.Invd_BodegaCodigo, T1.Invd_AlmacenCodigo, T1.Invd_ModuloAlmacen, T1.Invd_CentroCostoId," ;
      scmdbuf = scmdbuf + " T1.Invd_RegionalId, T1.Invd_FechaAdquisicion, T1.Costo_Total_Dev, T1.Invd_ValorAdquisicion," ;
      scmdbuf = scmdbuf + " T1.Invd_PlacaPadre FROM ((((ALM_INVENTARIO_DEVOLUTIVO T1 INNER JOIN ALM_ELEMENTO" ;
      scmdbuf = scmdbuf + " T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo" ;
      scmdbuf = scmdbuf + " = T2.Cata_Codigo) INNER JOIN ALM_CLASE T4 ON T4.Clas_Codigo = T3.Clas_Codigo) LEFT" ;
      scmdbuf = scmdbuf + " JOIN ALM_CUENTADANTE T5 ON T5.Cuen_Identificacion = T1.Cuen_Identificacion)" ;
      if ( ! (GXutil.strcmp("", AV16Invd_NumeroPlaca)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Invd_NumeroPlaca like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Invd_NumeroPlaca like ?)" ;
         }
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV8Cuen_Cedula) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T5.Cuen_Cedula = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T5.Cuen_Cedula = ?)" ;
         }
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11Elem_Consecutivo)==0) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (T1.Elem_Consecutivo like ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (T1.Elem_Consecutivo like ?)" ;
         }
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY T1.Invd_NumeroPlaca" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_H002C2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H002C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((short[]) buf[9])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 2) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(18) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[32])[0] = rslt.getVarchar(21) ;
               ((String[]) buf[33])[0] = rslt.getVarchar(22) ;
               ((long[]) buf[34])[0] = rslt.getLong(23) ;
               ((long[]) buf[35])[0] = rslt.getLong(24) ;
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(25) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(26,2) ;
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(27,2) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[3], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[4]).longValue(), 0);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 9);
               }
               return;
      }
   }

}

