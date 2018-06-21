/*
               File: wwalm_ratificar_impl
        Description: Ratificar
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:22:36.20
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

public final  class wwalm_ratificar_impl extends GXDataArea
{
   public wwalm_ratificar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwalm_ratificar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwalm_ratificar_impl.class ));
   }

   public wwalm_ratificar_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbTran_Estado = new HTMLChoice();
      cmbTran_IndE_S = new HTMLChoice();
      cmbTran_TipoElemento = new HTMLChoice();
      cmbTran_TipoEntra = new HTMLChoice();
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
            nRC_GXsfl_168 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_168_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_168_idx = httpContext.GetNextPar( ) ;
            AV44Reporte = httpContext.GetNextPar( ) ;
            edtavReporte_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavReporte_Internalname, "Tooltiptext", edtavReporte_Tooltiptext, !bGXsfl_168_Refreshing);
            AV38Update = httpContext.GetNextPar( ) ;
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
            AV27Tran_ConsecutivoCC = GXutil.lval( httpContext.GetNextPar( )) ;
            AV26Tran_CodigoMovimiento = httpContext.GetNextPar( ) ;
            AV29Tran_DescripcionMovimiento = httpContext.GetNextPar( ) ;
            AV43Tran_RegionCodigo = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV42Tran_RegionDescripcion = httpContext.GetNextPar( ) ;
            AV25Tran_CentroCostoCodigo = httpContext.GetNextPar( ) ;
            AV30Tran_FechaRegistro = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            AV34Tran_Observaciones = httpContext.GetNextPar( ) ;
            AV33Tran_NombreIngreso = httpContext.GetNextPar( ) ;
            AV32Tran_IdProveedor = GXutil.lval( httpContext.GetNextPar( )) ;
            AV21Proveedor = httpContext.GetNextPar( ) ;
            AV31Tran_IdCuentadanteDestino = GXutil.lval( httpContext.GetNextPar( )) ;
            AV12Cuentadante = httpContext.GetNextPar( ) ;
            AV24Tran_AreadanteCodigo = httpContext.GetNextPar( ) ;
            AV28Tran_CursoCodigo = httpContext.GetNextPar( ) ;
            AV35Tran_TipoIngreso = GXutil.lval( httpContext.GetNextPar( )) ;
            AV44Reporte = httpContext.GetNextPar( ) ;
            edtavReporte_Tooltiptext = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavReporte_Internalname, "Tooltiptext", edtavReporte_Tooltiptext, !bGXsfl_168_Refreshing);
            AV38Update = httpContext.GetNextPar( ) ;
            AV8ADVANCED_LABEL_TEMPLATE = httpContext.GetNextPar( ) ;
            AV49Pgmname = httpContext.GetNextPar( ) ;
            A50Tran_CentroCostoIdDestino = GXutil.lval( httpContext.GetNextPar( )) ;
            n50Tran_CentroCostoIdDestino = false ;
            A48Tran_CentroCostoId = GXutil.lval( httpContext.GetNextPar( )) ;
            A23Usua_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            A1Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV39Usua_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV5Tran_CentroCostoId = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid_refresh( subGrid_Rows, AV27Tran_ConsecutivoCC, AV26Tran_CodigoMovimiento, AV29Tran_DescripcionMovimiento, AV43Tran_RegionCodigo, AV42Tran_RegionDescripcion, AV25Tran_CentroCostoCodigo, AV30Tran_FechaRegistro, AV34Tran_Observaciones, AV33Tran_NombreIngreso, AV32Tran_IdProveedor, AV21Proveedor, AV31Tran_IdCuentadanteDestino, AV12Cuentadante, AV24Tran_AreadanteCodigo, AV28Tran_CursoCodigo, AV35Tran_TipoIngreso, AV44Reporte, AV38Update, AV8ADVANCED_LABEL_TEMPLATE, AV49Pgmname, A50Tran_CentroCostoIdDestino, A48Tran_CentroCostoId, A23Usua_Id, A1Cent_Id, AV39Usua_Id, AV5Tran_CentroCostoId) ;
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
      pa7T2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start7T2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414223672");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wwalm_ratificar") +"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_CONSECUTIVOCC", GXutil.ltrim( localUtil.ntoc( AV27Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_CODIGOMOVIMIENTO", AV26Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_DESCRIPCIONMOVIMIENTO", AV29Tran_DescripcionMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_REGIONCODIGO", GXutil.ltrim( localUtil.ntoc( AV43Tran_RegionCodigo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_REGIONDESCRIPCION", AV42Tran_RegionDescripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_CENTROCOSTOCODIGO", AV25Tran_CentroCostoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_FECHAREGISTRO", localUtil.format(AV30Tran_FechaRegistro, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_OBSERVACIONES", AV34Tran_Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_NOMBREINGRESO", AV33Tran_NombreIngreso);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_IDPROVEEDOR", GXutil.ltrim( localUtil.ntoc( AV32Tran_IdProveedor, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vPROVEEDOR", AV21Proveedor);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_IDCUENTADANTEDESTINO", GXutil.ltrim( localUtil.ntoc( AV31Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCUENTADANTE", AV12Cuentadante);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_AREADANTECODIGO", AV24Tran_AreadanteCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vTRAN_CURSOCODIGO", AV28Tran_CursoCodigo);
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_168", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_168, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_TIPOINGRESO", GXutil.ltrim( localUtil.ntoc( AV35Tran_TipoIngreso, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vADVANCED_LABEL_TEMPLATE", GXutil.rtrim( AV8ADVANCED_LABEL_TEMPLATE));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV49Pgmname));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_ID", GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ID", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUA_ID", GXutil.ltrim( localUtil.ntoc( AV39Usua_Id, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( AV5Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vWINDOWSID", GXutil.ltrim( localUtil.ntoc( AV46WindowsId, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vURL", AV45url);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Promptplaceholder", GXutil.rtrim( Alertify1_Promptplaceholder));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREPORTE_Tooltiptext", GXutil.rtrim( edtavReporte_Tooltiptext));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FILTERSCONTAINER_Class", GXutil.rtrim( divFilterscontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODIGOMOVIMIENTOFILTERCONTAINER_Class", GXutil.rtrim( divTran_codigomovimientofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_DESCRIPCIONMOVIMIENTOFILTERCONTAINER_Class", GXutil.rtrim( divTran_descripcionmovimientofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_REGIONCODIGOFILTERCONTAINER_Class", GXutil.rtrim( divTran_regioncodigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_REGIONDESCRIPCIONFILTERCONTAINER_Class", GXutil.rtrim( divTran_regiondescripcionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CENTROCOSTOCODIGOFILTERCONTAINER_Class", GXutil.rtrim( divTran_centrocostocodigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_FECHAREGISTROFILTERCONTAINER_Class", GXutil.rtrim( divTran_fecharegistrofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_OBSERVACIONESFILTERCONTAINER_Class", GXutil.rtrim( divTran_observacionesfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_TIPOINGRESOFILTERCONTAINER_Class", GXutil.rtrim( divTran_tipoingresofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_IDPROVEEDORFILTERCONTAINER_Class", GXutil.rtrim( divTran_idproveedorfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_NOMBREPROVEEDORFILTERCONTAINER_Class", GXutil.rtrim( divTran_nombreproveedorfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_IDCUENTADANTEDESTINOFILTERCONTAINER_Class", GXutil.rtrim( divTran_idcuentadantedestinofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_NOMBRECUENTADANTEFILTERCONTAINER_Class", GXutil.rtrim( divTran_nombrecuentadantefiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_AREADANTECODIGOFILTERCONTAINER_Class", GXutil.rtrim( divTran_areadantecodigofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CURSOCODIGOFILTERCONTAINER_Class", GXutil.rtrim( divTran_cursocodigofiltercontainer_Class));
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
         we7T2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt7T2( ) ;
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
      return formatLink("com.orions2.wwalm_ratificar")  ;
   }

   public String getPgmname( )
   {
      return "WWALM_RATIFICAR" ;
   }

   public String getPgmdesc( )
   {
      return "Ratificar" ;
   }

   public void wb7T0( )
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
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 168, 3, 0)+","+"null"+");", bttBtntoggle_Caption, bttBtntoggle_Jsonclick, 7, "Otros Filtros", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e117t1_client"+"'", TempTags, "", 2, "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-2", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitletext_Internalname, "Ratificar", "", "", lblTitletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_consecutivocc_Internalname, "Tran_Consecutivo CC", "col-sm-3 FilterSearchAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_consecutivocc_Internalname, GXutil.ltrim( localUtil.ntoc( AV27Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtavTran_consecutivocc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV27Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,14);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "No. Transaccion", edtavTran_consecutivocc_Jsonclick, 0, "FilterSearchAttribute", "", "", "", 1, edtavTran_consecutivocc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4 col-sm-5 col-md-4 WWActionsCell", "Right", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_codigomovimientofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_codigomovimientofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_codigomovimientofilter_Internalname, lblLbltran_codigomovimientofilter_Caption, "", "", lblLbltran_codigomovimientofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e127t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_codigomovimiento_Internalname, "Tran_Codigo Movimiento", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_codigomovimiento_Internalname, AV26Tran_CodigoMovimiento, GXutil.rtrim( localUtil.format( AV26Tran_CodigoMovimiento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_codigomovimiento_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTran_codigomovimiento_Visible, edtavTran_codigomovimiento_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_descripcionmovimientofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_descripcionmovimientofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_descripcionmovimientofilter_Internalname, lblLbltran_descripcionmovimientofilter_Caption, "", "", lblLbltran_descripcionmovimientofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e137t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_descripcionmovimiento_Internalname, "Tran_Descripcion Movimiento", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_descripcionmovimiento_Internalname, AV29Tran_DescripcionMovimiento, GXutil.rtrim( localUtil.format( AV29Tran_DescripcionMovimiento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_descripcionmovimiento_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTran_descripcionmovimiento_Visible, edtavTran_descripcionmovimiento_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_RATIFICAR.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_regioncodigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_regioncodigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_regioncodigofilter_Internalname, "Código Regional", "", "", lblLbltran_regioncodigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e147t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_regioncodigo_Internalname, "Transacción Código Región", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_regioncodigo_Internalname, GXutil.ltrim( localUtil.ntoc( AV43Tran_RegionCodigo, (byte)(4), (byte)(0), ",", "")), ((edtavTran_regioncodigo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43Tran_RegionCodigo), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV43Tran_RegionCodigo), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_regioncodigo_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTran_regioncodigo_Visible, edtavTran_regioncodigo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WWALM_RATIFICAR.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_regiondescripcionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_regiondescripcionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_regiondescripcionfilter_Internalname, "Nombre Regional", "", "", lblLbltran_regiondescripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e157t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_regiondescripcion_Internalname, "Transacción Descripción Regional", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_regiondescripcion_Internalname, AV42Tran_RegionDescripcion, GXutil.rtrim( localUtil.format( AV42Tran_RegionDescripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_regiondescripcion_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTran_regiondescripcion_Visible, edtavTran_regiondescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_RATIFICAR.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_centrocostocodigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_centrocostocodigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_centrocostocodigofilter_Internalname, "Código C.C.", "", "", lblLbltran_centrocostocodigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e167t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_centrocostocodigo_Internalname, "Transacción Código C.C", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_centrocostocodigo_Internalname, AV25Tran_CentroCostoCodigo, GXutil.rtrim( localUtil.format( AV25Tran_CentroCostoCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_centrocostocodigo_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTran_centrocostocodigo_Visible, edtavTran_centrocostocodigo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_fecharegistrofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_fecharegistrofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_fecharegistrofilter_Internalname, lblLbltran_fecharegistrofilter_Caption, "", "", lblLbltran_fecharegistrofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e177t1_client"+"'", "", "WWAdvancedLabel WWDateFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_fecharegistro_Internalname, "Tran_Fecha Registro", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavTran_fecharegistro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_fecharegistro_Internalname, localUtil.format(AV30Tran_FechaRegistro, "99/99/99"), localUtil.format( AV30Tran_FechaRegistro, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_fecharegistro_Jsonclick, 0, "FilterComboAttribute", "", "", "", 1, edtavTran_fecharegistro_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_WWALM_RATIFICAR.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_observacionesfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_observacionesfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_observacionesfilter_Internalname, lblLbltran_observacionesfilter_Caption, "", "", lblLbltran_observacionesfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e187t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_observaciones_Internalname, "Tran_Observaciones", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         ClassString = "FilterComboAttribute" ;
         StyleString = "" ;
         ClassString = "FilterComboAttribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavTran_observaciones_Internalname, AV34Tran_Observaciones, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", (short)(0), edtavTran_observaciones_Visible, edtavTran_observaciones_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_tipoingresofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_tipoingresofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_tipoingresofilter_Internalname, lblLbltran_tipoingresofilter_Caption, "", "", lblLbltran_tipoingresofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e197t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_nombreingreso_Internalname, "Tran_Nombre Ingreso", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_nombreingreso_Internalname, AV33Tran_NombreIngreso, GXutil.rtrim( localUtil.format( AV33Tran_NombreIngreso, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_nombreingreso_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTran_nombreingreso_Visible, edtavTran_nombreingreso_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_idproveedorfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_idproveedorfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_idproveedorfilter_Internalname, lblLbltran_idproveedorfilter_Caption, "", "", lblLbltran_idproveedorfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e207t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_idproveedor_Internalname, "Tran_Id Proveedor", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_idproveedor_Internalname, GXutil.ltrim( localUtil.ntoc( AV32Tran_IdProveedor, (byte)(18), (byte)(0), ",", "")), ((edtavTran_idproveedor_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV32Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_idproveedor_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTran_idproveedor_Visible, edtavTran_idproveedor_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_nombreproveedorfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_nombreproveedorfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_nombreproveedorfilter_Internalname, lblLbltran_nombreproveedorfilter_Caption, "", "", lblLbltran_nombreproveedorfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e217t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavProveedor_Internalname, "Proveedor", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavProveedor_Internalname, AV21Proveedor, GXutil.rtrim( localUtil.format( AV21Proveedor, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProveedor_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavProveedor_Visible, edtavProveedor_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_idcuentadantedestinofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_idcuentadantedestinofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_idcuentadantedestinofilter_Internalname, lblLbltran_idcuentadantedestinofilter_Caption, "", "", lblLbltran_idcuentadantedestinofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e227t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_idcuentadantedestino_Internalname, "Tran_Id Cuentadante Destino", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_idcuentadantedestino_Internalname, GXutil.ltrim( localUtil.ntoc( AV31Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ",", "")), ((edtavTran_idcuentadantedestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV31Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV31Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_idcuentadantedestino_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTran_idcuentadantedestino_Visible, edtavTran_idcuentadantedestino_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_nombrecuentadantefiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_nombrecuentadantefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_nombrecuentadantefilter_Internalname, lblLbltran_nombrecuentadantefilter_Caption, "", "", lblLbltran_nombrecuentadantefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e237t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCuentadante_Internalname, "Cuentadante", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCuentadante_Internalname, AV12Cuentadante, GXutil.rtrim( localUtil.format( AV12Cuentadante, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuentadante_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavCuentadante_Visible, edtavCuentadante_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_areadantecodigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_areadantecodigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_areadantecodigofilter_Internalname, lblLbltran_areadantecodigofilter_Caption, "", "", lblLbltran_areadantecodigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e247t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_areadantecodigo_Internalname, "Tran_Areadante Codigo", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_areadantecodigo_Internalname, AV24Tran_AreadanteCodigo, GXutil.rtrim( localUtil.format( AV24Tran_AreadanteCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_areadantecodigo_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTran_areadantecodigo_Visible, edtavTran_areadantecodigo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTran_cursocodigofiltercontainer_Internalname, 1, 0, "px", 0, "px", divTran_cursocodigofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltran_cursocodigofilter_Internalname, lblLbltran_cursocodigofilter_Caption, "", "", lblLbltran_cursocodigofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e257t1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 ViewAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_cursocodigo_Internalname, "Tran_Curso Codigo", "col-sm-3 FilterComboAttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'" + sGXsfl_168_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_cursocodigo_Internalname, AV28Tran_CursoCodigo, GXutil.rtrim( localUtil.format( AV28Tran_CursoCodigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_cursocodigo_Jsonclick, 0, "FilterComboAttribute", "", "", "", edtavTran_cursocodigo_Visible, edtavTran_cursocodigo_Enabled, 0, "text", "", 41, "chr", 1, "row", 41, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WWALM_RATIFICAR.htm");
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
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divSection1_Internalname, 1, 0, "px", 0, "px", "Scroll", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"168\">") ;
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
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DisplayAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"UpdateAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 70, 4, 0))+"px"+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 70, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Código") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Movimiento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Regional") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 106, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Centro Costo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 114, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Módulo Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacén Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega Origen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 114, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Módulo Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Almacén Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bodega Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 122, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha Registro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 154, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Nit Proveedor") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Proveedor") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 154, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ced. Cuentadante") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 130, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Observaciones") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 130, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Areadante") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 256, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Curso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 90, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Ingreso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 96, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Estado") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cuentadante Orígen") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Identificador") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Ratificacion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Ratifica") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cod Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Nombre Usuario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id C.C") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripcion C.C") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Id Región") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Código Región") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Entrada/ Salida") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Transaccion") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Elemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "de Elemento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "de Ingreso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "de Ingreso") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Costo Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Costo Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Costo Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Región Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Región Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "entrada devolutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "de Padres") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Abreviatura Región") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Abrev Destino") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Detalle") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "del Grupo") ;
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
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV44Reporte));
            GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavReporte_Tooltiptext));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV38Update));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A49Tran_CodigoMovimiento);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A381Tran_DescripcionMovimiento);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A422Tran_RegionDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A419Tran_CentroCostoCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A110Tran_ModuloOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A109Tran_CodAlmaOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A112Tran_CodBodeOrigen);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A385Tran_ModuloDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A111Tran_CodAlmaDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A387Tran_CodBodeDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A53Tran_IdProveedor, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A575Tran_NombreProveedor);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A389Tran_NombCuentadanteDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A416Tran_Observaciones);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A407Tran_AreadanteCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A408Tran_CursoCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A672Tran_NombreIngreso);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A58Tran_Estado));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A391Tran_UsuarioRatifica);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47Tran_UsuarioId, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A417Tran_UsuarioCodigo);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A418Tran_UsuarioNombre);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A420Tran_CentroCostoDescripcion);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A421Tran_RegionCodigo, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A481Tran_IndE_S);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(24), (byte)(2), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A499Tran_CodTipoElemento, (byte)(18), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A482Tran_TipoElemento));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A514Tran_NumeroIngreso));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A520Tran_RegionDescripcionDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A50Tran_CentroCostoIdDestino, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A516Tran_CentroCostoCodigoDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A517Tran_CentroCostoDescripcionDes);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A518Tran_RegionIdDestino, (byte)(11), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A519Tran_RegionCodigoDestino, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A527Tran_TipoEntra));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A568Tran_CantidadPadres, (byte)(8), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A594Tran_RegionAbrev);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", A608Tran_RegionAbrevDestino);
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.rtrim( A524Tran_Detalle));
            GridContainer.AddColumnProperties(GridColumn);
            GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A667Tran_NumeroGrupo, (byte)(4), (byte)(0), ".", "")));
            GridContainer.AddColumnProperties(GridColumn);
            GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 168 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_168 = (short)(nGXsfl_168_idx-1) ;
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
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWAdvancedBarCell", "left", "top", "", "", "div");
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"ALERTIFY1Container"+"\"></div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblUrl_Internalname, lblUrl_Caption, "", "", lblUrl_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_WWALM_RATIFICAR.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start7T2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Ratificar", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup7T0( ) ;
   }

   public void ws7T2( )
   {
      start7T2( ) ;
      evt7T2( ) ;
   }

   public void evt7T2( )
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "'RATIFICAR'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "'RATIFICAR'") == 0 ) )
                        {
                           nGXsfl_168_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_168_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_168_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_1682( ) ;
                           AV44Reporte = httpContext.cgiGet( edtavReporte_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavReporte_Internalname, "Bitmap", ((GXutil.strcmp("", AV44Reporte)==0) ? AV50Reporte_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV44Reporte))), !bGXsfl_168_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavReporte_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV44Reporte), true);
                           AV38Update = httpContext.cgiGet( edtavUpdate_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV38Update)==0) ? AV51Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV38Update))), !bGXsfl_168_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV38Update), true);
                           A513Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtTran_ConsecutivoCC_Internalname), ",", ".") ;
                           n513Tran_ConsecutivoCC = false ;
                           A49Tran_CodigoMovimiento = httpContext.cgiGet( edtTran_CodigoMovimiento_Internalname) ;
                           A381Tran_DescripcionMovimiento = httpContext.cgiGet( edtTran_DescripcionMovimiento_Internalname) ;
                           n381Tran_DescripcionMovimiento = false ;
                           A422Tran_RegionDescripcion = httpContext.cgiGet( edtTran_RegionDescripcion_Internalname) ;
                           n422Tran_RegionDescripcion = false ;
                           A419Tran_CentroCostoCodigo = httpContext.cgiGet( edtTran_CentroCostoCodigo_Internalname) ;
                           n419Tran_CentroCostoCodigo = false ;
                           A110Tran_ModuloOrigen = httpContext.cgiGet( edtTran_ModuloOrigen_Internalname) ;
                           A109Tran_CodAlmaOrigen = httpContext.cgiGet( edtTran_CodAlmaOrigen_Internalname) ;
                           A112Tran_CodBodeOrigen = httpContext.cgiGet( edtTran_CodBodeOrigen_Internalname) ;
                           A385Tran_ModuloDestino = httpContext.cgiGet( edtTran_ModuloDestino_Internalname) ;
                           A111Tran_CodAlmaDestino = httpContext.cgiGet( edtTran_CodAlmaDestino_Internalname) ;
                           A387Tran_CodBodeDestino = httpContext.cgiGet( edtTran_CodBodeDestino_Internalname) ;
                           A55Tran_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRegistro_Internalname), 0) ;
                           A53Tran_IdProveedor = localUtil.ctol( httpContext.cgiGet( edtTran_IdProveedor_Internalname), ",", ".") ;
                           n53Tran_IdProveedor = false ;
                           A575Tran_NombreProveedor = GXutil.upper( httpContext.cgiGet( edtTran_NombreProveedor_Internalname)) ;
                           n575Tran_NombreProveedor = false ;
                           A52Tran_IdCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteDestino_Internalname), ",", ".") ;
                           n52Tran_IdCuentadanteDestino = false ;
                           A389Tran_NombCuentadanteDestino = GXutil.upper( httpContext.cgiGet( edtTran_NombCuentadanteDestino_Internalname)) ;
                           n389Tran_NombCuentadanteDestino = false ;
                           A416Tran_Observaciones = httpContext.cgiGet( edtTran_Observaciones_Internalname) ;
                           n416Tran_Observaciones = false ;
                           A407Tran_AreadanteCodigo = httpContext.cgiGet( edtTran_AreadanteCodigo_Internalname) ;
                           n407Tran_AreadanteCodigo = false ;
                           A408Tran_CursoCodigo = httpContext.cgiGet( edtTran_CursoCodigo_Internalname) ;
                           n408Tran_CursoCodigo = false ;
                           A672Tran_NombreIngreso = GXutil.upper( httpContext.cgiGet( edtTran_NombreIngreso_Internalname)) ;
                           n672Tran_NombreIngreso = false ;
                           cmbTran_Estado.setName( cmbTran_Estado.getInternalname() );
                           cmbTran_Estado.setValue( httpContext.cgiGet( cmbTran_Estado.getInternalname()) );
                           A58Tran_Estado = httpContext.cgiGet( cmbTran_Estado.getInternalname()) ;
                           n58Tran_Estado = false ;
                           A51Tran_IdCuentadanteOrigen = localUtil.ctol( httpContext.cgiGet( edtTran_IdCuentadanteOrigen_Internalname), ",", ".") ;
                           n51Tran_IdCuentadanteOrigen = false ;
                           A46Tran_Id = localUtil.ctol( httpContext.cgiGet( edtTran_Id_Internalname), ",", ".") ;
                           A390Tran_FechaRatificacion = localUtil.ctot( httpContext.cgiGet( edtTran_FechaRatificacion_Internalname), 0) ;
                           n390Tran_FechaRatificacion = false ;
                           A391Tran_UsuarioRatifica = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioRatifica_Internalname)) ;
                           n391Tran_UsuarioRatifica = false ;
                           A47Tran_UsuarioId = localUtil.ctol( httpContext.cgiGet( edtTran_UsuarioId_Internalname), ",", ".") ;
                           n47Tran_UsuarioId = false ;
                           A417Tran_UsuarioCodigo = GXutil.upper( httpContext.cgiGet( edtTran_UsuarioCodigo_Internalname)) ;
                           n417Tran_UsuarioCodigo = false ;
                           A418Tran_UsuarioNombre = httpContext.cgiGet( edtTran_UsuarioNombre_Internalname) ;
                           n418Tran_UsuarioNombre = false ;
                           A48Tran_CentroCostoId = localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoId_Internalname), ",", ".") ;
                           A420Tran_CentroCostoDescripcion = httpContext.cgiGet( edtTran_CentroCostoDescripcion_Internalname) ;
                           n420Tran_CentroCostoDescripcion = false ;
                           A57Tran_RegionId = localUtil.ctol( httpContext.cgiGet( edtTran_RegionId_Internalname), ",", ".") ;
                           n57Tran_RegionId = false ;
                           A421Tran_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_RegionCodigo_Internalname), ",", ".")) ;
                           n421Tran_RegionCodigo = false ;
                           cmbTran_IndE_S.setName( cmbTran_IndE_S.getInternalname() );
                           cmbTran_IndE_S.setValue( httpContext.cgiGet( cmbTran_IndE_S.getInternalname()) );
                           A481Tran_IndE_S = httpContext.cgiGet( cmbTran_IndE_S.getInternalname()) ;
                           n481Tran_IndE_S = false ;
                           A483Tran_ValorTransaccion = localUtil.ctond( httpContext.cgiGet( edtTran_ValorTransaccion_Internalname)) ;
                           n483Tran_ValorTransaccion = false ;
                           A499Tran_CodTipoElemento = localUtil.ctol( httpContext.cgiGet( edtTran_CodTipoElemento_Internalname), ",", ".") ;
                           n499Tran_CodTipoElemento = false ;
                           cmbTran_TipoElemento.setName( cmbTran_TipoElemento.getInternalname() );
                           cmbTran_TipoElemento.setValue( httpContext.cgiGet( cmbTran_TipoElemento.getInternalname()) );
                           A482Tran_TipoElemento = httpContext.cgiGet( cmbTran_TipoElemento.getInternalname()) ;
                           A514Tran_NumeroIngreso = httpContext.cgiGet( edtTran_NumeroIngreso_Internalname) ;
                           n514Tran_NumeroIngreso = false ;
                           A520Tran_RegionDescripcionDestino = httpContext.cgiGet( edtTran_RegionDescripcionDestino_Internalname) ;
                           n520Tran_RegionDescripcionDestino = false ;
                           A50Tran_CentroCostoIdDestino = localUtil.ctol( httpContext.cgiGet( edtTran_CentroCostoIdDestino_Internalname), ",", ".") ;
                           n50Tran_CentroCostoIdDestino = false ;
                           A516Tran_CentroCostoCodigoDestino = httpContext.cgiGet( edtTran_CentroCostoCodigoDestino_Internalname) ;
                           n516Tran_CentroCostoCodigoDestino = false ;
                           A517Tran_CentroCostoDescripcionDes = httpContext.cgiGet( edtTran_CentroCostoDescripcionDes_Internalname) ;
                           n517Tran_CentroCostoDescripcionDes = false ;
                           A518Tran_RegionIdDestino = localUtil.ctol( httpContext.cgiGet( edtTran_RegionIdDestino_Internalname), ",", ".") ;
                           n518Tran_RegionIdDestino = false ;
                           A519Tran_RegionCodigoDestino = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_RegionCodigoDestino_Internalname), ",", ".")) ;
                           n519Tran_RegionCodigoDestino = false ;
                           cmbTran_TipoEntra.setName( cmbTran_TipoEntra.getInternalname() );
                           cmbTran_TipoEntra.setValue( httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) );
                           A527Tran_TipoEntra = httpContext.cgiGet( cmbTran_TipoEntra.getInternalname()) ;
                           n527Tran_TipoEntra = false ;
                           A568Tran_CantidadPadres = (int)(localUtil.ctol( httpContext.cgiGet( edtTran_CantidadPadres_Internalname), ",", ".")) ;
                           n568Tran_CantidadPadres = false ;
                           A594Tran_RegionAbrev = httpContext.cgiGet( edtTran_RegionAbrev_Internalname) ;
                           n594Tran_RegionAbrev = false ;
                           A608Tran_RegionAbrevDestino = httpContext.cgiGet( edtTran_RegionAbrevDestino_Internalname) ;
                           n608Tran_RegionAbrevDestino = false ;
                           A524Tran_Detalle = httpContext.cgiGet( edtTran_Detalle_Internalname) ;
                           n524Tran_Detalle = false ;
                           A667Tran_NumeroGrupo = (short)(localUtil.ctol( httpContext.cgiGet( edtTran_NumeroGrupo_Internalname), ",", ".")) ;
                           n667Tran_NumeroGrupo = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e267T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e277T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e287T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'RATIFICAR'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Ratificar' */
                                 e297T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Tran_consecutivocc Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTRAN_CONSECUTIVOCC"), ",", ".") != AV27Tran_ConsecutivoCC )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tran_codigomovimiento Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_CODIGOMOVIMIENTO"), AV26Tran_CodigoMovimiento) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tran_descripcionmovimiento Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_DESCRIPCIONMOVIMIENTO"), AV29Tran_DescripcionMovimiento) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tran_regioncodigo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTRAN_REGIONCODIGO"), ",", ".") != AV43Tran_RegionCodigo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tran_regiondescripcion Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_REGIONDESCRIPCION"), AV42Tran_RegionDescripcion) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tran_centrocostocodigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_CENTROCOSTOCODIGO"), AV25Tran_CentroCostoCodigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tran_fecharegistro Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vTRAN_FECHAREGISTRO"), 0), AV30Tran_FechaRegistro) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tran_observaciones Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_OBSERVACIONES"), AV34Tran_Observaciones) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tran_nombreingreso Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_NOMBREINGRESO"), AV33Tran_NombreIngreso) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tran_idproveedor Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTRAN_IDPROVEEDOR"), ",", ".") != AV32Tran_IdProveedor )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Proveedor Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPROVEEDOR"), AV21Proveedor) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tran_idcuentadantedestino Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTRAN_IDCUENTADANTEDESTINO"), ",", ".") != AV31Tran_IdCuentadanteDestino )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cuentadante Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUENTADANTE"), AV12Cuentadante) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tran_areadantecodigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_AREADANTECODIGO"), AV24Tran_AreadanteCodigo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tran_cursocodigo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_CURSOCODIGO"), AV28Tran_CursoCodigo) != 0 )
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

   public void we7T2( )
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

   public void pa7T2( )
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
         GXCCtl = "TRAN_ESTADO_" + sGXsfl_168_idx ;
         cmbTran_Estado.setName( GXCCtl );
         cmbTran_Estado.setWebtags( "" );
         cmbTran_Estado.addItem("A", "Anulado", (short)(0));
         cmbTran_Estado.addItem("R", "Ratificado", (short)(0));
         cmbTran_Estado.addItem("P", "Pendiente", (short)(0));
         cmbTran_Estado.addItem("I", "Incompleto", (short)(0));
         if ( cmbTran_Estado.getItemCount() > 0 )
         {
            A58Tran_Estado = cmbTran_Estado.getValidValue(A58Tran_Estado) ;
            n58Tran_Estado = false ;
         }
         GXCCtl = "TRAN_INDE_S_" + sGXsfl_168_idx ;
         cmbTran_IndE_S.setName( GXCCtl );
         cmbTran_IndE_S.setWebtags( "" );
         cmbTran_IndE_S.addItem("E", "ENTRADA", (short)(0));
         cmbTran_IndE_S.addItem("S", "SALIDA", (short)(0));
         cmbTran_IndE_S.addItem("T", "TRASPASO", (short)(0));
         cmbTran_IndE_S.addItem("R", "RECUPERACIÓN", (short)(0));
         if ( cmbTran_IndE_S.getItemCount() > 0 )
         {
            A481Tran_IndE_S = cmbTran_IndE_S.getValidValue(A481Tran_IndE_S) ;
            n481Tran_IndE_S = false ;
         }
         GXCCtl = "TRAN_TIPOELEMENTO_" + sGXsfl_168_idx ;
         cmbTran_TipoElemento.setName( GXCCtl );
         cmbTran_TipoElemento.setWebtags( "" );
         cmbTran_TipoElemento.addItem("C", "Consumo", (short)(0));
         cmbTran_TipoElemento.addItem("D", "Devolutivo", (short)(0));
         if ( cmbTran_TipoElemento.getItemCount() > 0 )
         {
            A482Tran_TipoElemento = cmbTran_TipoElemento.getValidValue(A482Tran_TipoElemento) ;
         }
         GXCCtl = "TRAN_TIPOENTRA_" + sGXsfl_168_idx ;
         cmbTran_TipoEntra.setName( GXCCtl );
         cmbTran_TipoEntra.setWebtags( "" );
         if ( cmbTran_TipoEntra.getItemCount() > 0 )
         {
            A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
            n527Tran_TipoEntra = false ;
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
            GX_FocusControl = edtavTran_consecutivocc_Internalname ;
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
      subsflControlProps_1682( ) ;
      while ( nGXsfl_168_idx <= nRC_GXsfl_168 )
      {
         sendrow_1682( ) ;
         nGXsfl_168_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_168_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_168_idx+1)) ;
         sGXsfl_168_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_168_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1682( ) ;
      }
      httpContext.GX_webresponse.addString(GridContainer.ToJavascriptSource());
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 long AV27Tran_ConsecutivoCC ,
                                 String AV26Tran_CodigoMovimiento ,
                                 String AV29Tran_DescripcionMovimiento ,
                                 short AV43Tran_RegionCodigo ,
                                 String AV42Tran_RegionDescripcion ,
                                 String AV25Tran_CentroCostoCodigo ,
                                 java.util.Date AV30Tran_FechaRegistro ,
                                 String AV34Tran_Observaciones ,
                                 String AV33Tran_NombreIngreso ,
                                 long AV32Tran_IdProveedor ,
                                 String AV21Proveedor ,
                                 long AV31Tran_IdCuentadanteDestino ,
                                 String AV12Cuentadante ,
                                 String AV24Tran_AreadanteCodigo ,
                                 String AV28Tran_CursoCodigo ,
                                 long AV35Tran_TipoIngreso ,
                                 String AV44Reporte ,
                                 String AV38Update ,
                                 String AV8ADVANCED_LABEL_TEMPLATE ,
                                 String AV49Pgmname ,
                                 long A50Tran_CentroCostoIdDestino ,
                                 long A48Tran_CentroCostoId ,
                                 long A23Usua_Id ,
                                 long A1Cent_Id ,
                                 long AV39Usua_Id ,
                                 long AV5Tran_CentroCostoId )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid_Rows = subGrid_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID_nCurrentRecord = 0 ;
      rf7T2( ) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CONSECUTIVOCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CONSECUTIVOCC", GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODIGOMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODIGOMOVIMIENTO", A49Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_MODULOORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_MODULOORIGEN", A110Tran_ModuloOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODALMAORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A109Tran_CodAlmaOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODALMAORIGEN", A109Tran_CodAlmaOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODBODEORIGEN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A112Tran_CodBodeOrigen, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODBODEORIGEN", A112Tran_CodBodeOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_MODULODESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_MODULODESTINO", A385Tran_ModuloDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODALMADESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A111Tran_CodAlmaDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODALMADESTINO", A111Tran_CodAlmaDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODBODEDESTINO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A387Tran_CodBodeDestino, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODBODEDESTINO", A387Tran_CodBodeDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHAREGISTRO", getSecureSignedToken( "", localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_FECHAREGISTRO", localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_IDPROVEEDOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A53Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_IDPROVEEDOR", GXutil.ltrim( localUtil.ntoc( A53Tran_IdProveedor, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_IDCUENTADANTEDESTINO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A52Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_IDCUENTADANTEDESTINO", GXutil.ltrim( localUtil.ntoc( A52Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_OBSERVACIONES", getSecureSignedToken( "", A416Tran_Observaciones));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_OBSERVACIONES", A416Tran_Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_AREADANTECODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A407Tran_AreadanteCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_AREADANTECODIGO", A407Tran_AreadanteCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CURSOCODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A408Tran_CursoCodigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CURSOCODIGO", A408Tran_CursoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_ESTADO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A58Tran_Estado, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ESTADO", GXutil.rtrim( A58Tran_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_IDCUENTADANTEORIGEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A51Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_IDCUENTADANTEORIGEN", GXutil.ltrim( localUtil.ntoc( A51Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHARATIFICACION", getSecureSignedToken( "", localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_FECHARATIFICACION", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_USUARIORATIFICA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A391Tran_UsuarioRatifica, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_USUARIORATIFICA", A391Tran_UsuarioRatifica);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_USUARIOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_USUARIOID", GXutil.ltrim( localUtil.ntoc( A47Tran_UsuarioId, (byte)(18), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CENTROCOSTOID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_REGIONID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_REGIONID", GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_INDE_S", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A481Tran_IndE_S, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_INDE_S", A481Tran_IndE_S);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_VALORTRANSACCION", getSecureSignedToken( "", localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_VALORTRANSACCION", GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(18), (byte)(2), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_TIPOELEMENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A482Tran_TipoElemento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_TIPOELEMENTO", GXutil.rtrim( A482Tran_TipoElemento));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_NUMEROINGRESO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_NUMEROINGRESO", GXutil.rtrim( A514Tran_NumeroIngreso));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CENTROCOSTOIDDESTINO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A50Tran_CentroCostoIdDestino), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CENTROCOSTOIDDESTINO", GXutil.ltrim( localUtil.ntoc( A50Tran_CentroCostoIdDestino, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_REGIONIDDESTINO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_REGIONIDDESTINO", GXutil.ltrim( localUtil.ntoc( A518Tran_RegionIdDestino, (byte)(11), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_TIPOENTRA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_TIPOENTRA", GXutil.rtrim( A527Tran_TipoEntra));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CANTIDADPADRES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CANTIDADPADRES", GXutil.ltrim( localUtil.ntoc( A568Tran_CantidadPadres, (byte)(8), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_DETALLE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_DETALLE", GXutil.rtrim( A524Tran_Detalle));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_NUMEROGRUPO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_NUMEROGRUPO", GXutil.ltrim( localUtil.ntoc( A667Tran_NumeroGrupo, (byte)(4), (byte)(0), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf7T2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV49Pgmname = "WWALM_RATIFICAR" ;
      Gx_err = (short)(0) ;
   }

   public void rf7T2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(168) ;
      /* Execute user event: Refresh */
      e277T2 ();
      nGXsfl_168_idx = (short)(1) ;
      sGXsfl_168_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_168_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1682( ) ;
      bGXsfl_168_Refreshing = true ;
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
         subsflControlProps_1682( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              new Long(AV27Tran_ConsecutivoCC) ,
                                              AV26Tran_CodigoMovimiento ,
                                              new Short(AV43Tran_RegionCodigo) ,
                                              new Long(AV35Tran_TipoIngreso) ,
                                              new Long(AV32Tran_IdProveedor) ,
                                              new Long(AV31Tran_IdCuentadanteDestino) ,
                                              AV24Tran_AreadanteCodigo ,
                                              AV28Tran_CursoCodigo ,
                                              new Long(A513Tran_ConsecutivoCC) ,
                                              A49Tran_CodigoMovimiento ,
                                              new Short(A421Tran_RegionCodigo) ,
                                              new Long(A54Tran_TipoIngreso) ,
                                              new Long(A53Tran_IdProveedor) ,
                                              new Long(A52Tran_IdCuentadanteDestino) ,
                                              A407Tran_AreadanteCodigo ,
                                              A408Tran_CursoCodigo ,
                                              AV29Tran_DescripcionMovimiento ,
                                              A381Tran_DescripcionMovimiento ,
                                              AV42Tran_RegionDescripcion ,
                                              A422Tran_RegionDescripcion ,
                                              AV25Tran_CentroCostoCodigo ,
                                              A419Tran_CentroCostoCodigo ,
                                              AV30Tran_FechaRegistro ,
                                              A55Tran_FechaRegistro ,
                                              AV34Tran_Observaciones ,
                                              A416Tran_Observaciones ,
                                              AV21Proveedor ,
                                              A575Tran_NombreProveedor ,
                                              AV12Cuentadante ,
                                              A389Tran_NombCuentadanteDestino ,
                                              AV33Tran_NombreIngreso ,
                                              A672Tran_NombreIngreso ,
                                              A58Tran_Estado } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         } ) ;
         lV26Tran_CodigoMovimiento = GXutil.concat( GXutil.rtrim( AV26Tran_CodigoMovimiento), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Tran_CodigoMovimiento", AV26Tran_CodigoMovimiento);
         /* Using cursor H007T2 */
         pr_default.execute(0, new Object[] {new Long(AV27Tran_ConsecutivoCC), lV26Tran_CodigoMovimiento, new Short(AV43Tran_RegionCodigo), new Long(AV35Tran_TipoIngreso), new Long(AV32Tran_IdProveedor), new Long(AV31Tran_IdCuentadanteDestino), AV24Tran_AreadanteCodigo, AV28Tran_CursoCodigo});
         nGXsfl_168_idx = (short)(1) ;
         sGXsfl_168_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_168_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1682( ) ;
         GRID_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
         {
            brk7T2 = false ;
            A416Tran_Observaciones = H007T2_A416Tran_Observaciones[0] ;
            n416Tran_Observaciones = H007T2_n416Tran_Observaciones[0] ;
            A513Tran_ConsecutivoCC = H007T2_A513Tran_ConsecutivoCC[0] ;
            n513Tran_ConsecutivoCC = H007T2_n513Tran_ConsecutivoCC[0] ;
            A49Tran_CodigoMovimiento = H007T2_A49Tran_CodigoMovimiento[0] ;
            A381Tran_DescripcionMovimiento = H007T2_A381Tran_DescripcionMovimiento[0] ;
            n381Tran_DescripcionMovimiento = H007T2_n381Tran_DescripcionMovimiento[0] ;
            A421Tran_RegionCodigo = H007T2_A421Tran_RegionCodigo[0] ;
            n421Tran_RegionCodigo = H007T2_n421Tran_RegionCodigo[0] ;
            A422Tran_RegionDescripcion = H007T2_A422Tran_RegionDescripcion[0] ;
            n422Tran_RegionDescripcion = H007T2_n422Tran_RegionDescripcion[0] ;
            A419Tran_CentroCostoCodigo = H007T2_A419Tran_CentroCostoCodigo[0] ;
            n419Tran_CentroCostoCodigo = H007T2_n419Tran_CentroCostoCodigo[0] ;
            A55Tran_FechaRegistro = H007T2_A55Tran_FechaRegistro[0] ;
            A54Tran_TipoIngreso = H007T2_A54Tran_TipoIngreso[0] ;
            n54Tran_TipoIngreso = H007T2_n54Tran_TipoIngreso[0] ;
            A53Tran_IdProveedor = H007T2_A53Tran_IdProveedor[0] ;
            n53Tran_IdProveedor = H007T2_n53Tran_IdProveedor[0] ;
            A52Tran_IdCuentadanteDestino = H007T2_A52Tran_IdCuentadanteDestino[0] ;
            n52Tran_IdCuentadanteDestino = H007T2_n52Tran_IdCuentadanteDestino[0] ;
            A407Tran_AreadanteCodigo = H007T2_A407Tran_AreadanteCodigo[0] ;
            n407Tran_AreadanteCodigo = H007T2_n407Tran_AreadanteCodigo[0] ;
            A408Tran_CursoCodigo = H007T2_A408Tran_CursoCodigo[0] ;
            n408Tran_CursoCodigo = H007T2_n408Tran_CursoCodigo[0] ;
            A575Tran_NombreProveedor = H007T2_A575Tran_NombreProveedor[0] ;
            n575Tran_NombreProveedor = H007T2_n575Tran_NombreProveedor[0] ;
            A389Tran_NombCuentadanteDestino = H007T2_A389Tran_NombCuentadanteDestino[0] ;
            n389Tran_NombCuentadanteDestino = H007T2_n389Tran_NombCuentadanteDestino[0] ;
            A672Tran_NombreIngreso = H007T2_A672Tran_NombreIngreso[0] ;
            n672Tran_NombreIngreso = H007T2_n672Tran_NombreIngreso[0] ;
            A58Tran_Estado = H007T2_A58Tran_Estado[0] ;
            n58Tran_Estado = H007T2_n58Tran_Estado[0] ;
            A50Tran_CentroCostoIdDestino = H007T2_A50Tran_CentroCostoIdDestino[0] ;
            n50Tran_CentroCostoIdDestino = H007T2_n50Tran_CentroCostoIdDestino[0] ;
            A48Tran_CentroCostoId = H007T2_A48Tran_CentroCostoId[0] ;
            A667Tran_NumeroGrupo = H007T2_A667Tran_NumeroGrupo[0] ;
            n667Tran_NumeroGrupo = H007T2_n667Tran_NumeroGrupo[0] ;
            A524Tran_Detalle = H007T2_A524Tran_Detalle[0] ;
            n524Tran_Detalle = H007T2_n524Tran_Detalle[0] ;
            A608Tran_RegionAbrevDestino = H007T2_A608Tran_RegionAbrevDestino[0] ;
            n608Tran_RegionAbrevDestino = H007T2_n608Tran_RegionAbrevDestino[0] ;
            A594Tran_RegionAbrev = H007T2_A594Tran_RegionAbrev[0] ;
            n594Tran_RegionAbrev = H007T2_n594Tran_RegionAbrev[0] ;
            A568Tran_CantidadPadres = H007T2_A568Tran_CantidadPadres[0] ;
            n568Tran_CantidadPadres = H007T2_n568Tran_CantidadPadres[0] ;
            A527Tran_TipoEntra = H007T2_A527Tran_TipoEntra[0] ;
            n527Tran_TipoEntra = H007T2_n527Tran_TipoEntra[0] ;
            A519Tran_RegionCodigoDestino = H007T2_A519Tran_RegionCodigoDestino[0] ;
            n519Tran_RegionCodigoDestino = H007T2_n519Tran_RegionCodigoDestino[0] ;
            A518Tran_RegionIdDestino = H007T2_A518Tran_RegionIdDestino[0] ;
            n518Tran_RegionIdDestino = H007T2_n518Tran_RegionIdDestino[0] ;
            A517Tran_CentroCostoDescripcionDes = H007T2_A517Tran_CentroCostoDescripcionDes[0] ;
            n517Tran_CentroCostoDescripcionDes = H007T2_n517Tran_CentroCostoDescripcionDes[0] ;
            A516Tran_CentroCostoCodigoDestino = H007T2_A516Tran_CentroCostoCodigoDestino[0] ;
            n516Tran_CentroCostoCodigoDestino = H007T2_n516Tran_CentroCostoCodigoDestino[0] ;
            A520Tran_RegionDescripcionDestino = H007T2_A520Tran_RegionDescripcionDestino[0] ;
            n520Tran_RegionDescripcionDestino = H007T2_n520Tran_RegionDescripcionDestino[0] ;
            A514Tran_NumeroIngreso = H007T2_A514Tran_NumeroIngreso[0] ;
            n514Tran_NumeroIngreso = H007T2_n514Tran_NumeroIngreso[0] ;
            A482Tran_TipoElemento = H007T2_A482Tran_TipoElemento[0] ;
            A499Tran_CodTipoElemento = H007T2_A499Tran_CodTipoElemento[0] ;
            n499Tran_CodTipoElemento = H007T2_n499Tran_CodTipoElemento[0] ;
            A483Tran_ValorTransaccion = H007T2_A483Tran_ValorTransaccion[0] ;
            n483Tran_ValorTransaccion = H007T2_n483Tran_ValorTransaccion[0] ;
            A481Tran_IndE_S = H007T2_A481Tran_IndE_S[0] ;
            n481Tran_IndE_S = H007T2_n481Tran_IndE_S[0] ;
            A57Tran_RegionId = H007T2_A57Tran_RegionId[0] ;
            n57Tran_RegionId = H007T2_n57Tran_RegionId[0] ;
            A420Tran_CentroCostoDescripcion = H007T2_A420Tran_CentroCostoDescripcion[0] ;
            n420Tran_CentroCostoDescripcion = H007T2_n420Tran_CentroCostoDescripcion[0] ;
            A418Tran_UsuarioNombre = H007T2_A418Tran_UsuarioNombre[0] ;
            n418Tran_UsuarioNombre = H007T2_n418Tran_UsuarioNombre[0] ;
            A417Tran_UsuarioCodigo = H007T2_A417Tran_UsuarioCodigo[0] ;
            n417Tran_UsuarioCodigo = H007T2_n417Tran_UsuarioCodigo[0] ;
            A47Tran_UsuarioId = H007T2_A47Tran_UsuarioId[0] ;
            n47Tran_UsuarioId = H007T2_n47Tran_UsuarioId[0] ;
            A391Tran_UsuarioRatifica = H007T2_A391Tran_UsuarioRatifica[0] ;
            n391Tran_UsuarioRatifica = H007T2_n391Tran_UsuarioRatifica[0] ;
            A390Tran_FechaRatificacion = H007T2_A390Tran_FechaRatificacion[0] ;
            n390Tran_FechaRatificacion = H007T2_n390Tran_FechaRatificacion[0] ;
            A46Tran_Id = H007T2_A46Tran_Id[0] ;
            A51Tran_IdCuentadanteOrigen = H007T2_A51Tran_IdCuentadanteOrigen[0] ;
            n51Tran_IdCuentadanteOrigen = H007T2_n51Tran_IdCuentadanteOrigen[0] ;
            A387Tran_CodBodeDestino = H007T2_A387Tran_CodBodeDestino[0] ;
            A111Tran_CodAlmaDestino = H007T2_A111Tran_CodAlmaDestino[0] ;
            A385Tran_ModuloDestino = H007T2_A385Tran_ModuloDestino[0] ;
            A112Tran_CodBodeOrigen = H007T2_A112Tran_CodBodeOrigen[0] ;
            A109Tran_CodAlmaOrigen = H007T2_A109Tran_CodAlmaOrigen[0] ;
            A110Tran_ModuloOrigen = H007T2_A110Tran_ModuloOrigen[0] ;
            A381Tran_DescripcionMovimiento = H007T2_A381Tran_DescripcionMovimiento[0] ;
            n381Tran_DescripcionMovimiento = H007T2_n381Tran_DescripcionMovimiento[0] ;
            A499Tran_CodTipoElemento = H007T2_A499Tran_CodTipoElemento[0] ;
            n499Tran_CodTipoElemento = H007T2_n499Tran_CodTipoElemento[0] ;
            A672Tran_NombreIngreso = H007T2_A672Tran_NombreIngreso[0] ;
            n672Tran_NombreIngreso = H007T2_n672Tran_NombreIngreso[0] ;
            A575Tran_NombreProveedor = H007T2_A575Tran_NombreProveedor[0] ;
            n575Tran_NombreProveedor = H007T2_n575Tran_NombreProveedor[0] ;
            A389Tran_NombCuentadanteDestino = H007T2_A389Tran_NombCuentadanteDestino[0] ;
            n389Tran_NombCuentadanteDestino = H007T2_n389Tran_NombCuentadanteDestino[0] ;
            A517Tran_CentroCostoDescripcionDes = H007T2_A517Tran_CentroCostoDescripcionDes[0] ;
            n517Tran_CentroCostoDescripcionDes = H007T2_n517Tran_CentroCostoDescripcionDes[0] ;
            A516Tran_CentroCostoCodigoDestino = H007T2_A516Tran_CentroCostoCodigoDestino[0] ;
            n516Tran_CentroCostoCodigoDestino = H007T2_n516Tran_CentroCostoCodigoDestino[0] ;
            A419Tran_CentroCostoCodigo = H007T2_A419Tran_CentroCostoCodigo[0] ;
            n419Tran_CentroCostoCodigo = H007T2_n419Tran_CentroCostoCodigo[0] ;
            A420Tran_CentroCostoDescripcion = H007T2_A420Tran_CentroCostoDescripcion[0] ;
            n420Tran_CentroCostoDescripcion = H007T2_n420Tran_CentroCostoDescripcion[0] ;
            A608Tran_RegionAbrevDestino = H007T2_A608Tran_RegionAbrevDestino[0] ;
            n608Tran_RegionAbrevDestino = H007T2_n608Tran_RegionAbrevDestino[0] ;
            A519Tran_RegionCodigoDestino = H007T2_A519Tran_RegionCodigoDestino[0] ;
            n519Tran_RegionCodigoDestino = H007T2_n519Tran_RegionCodigoDestino[0] ;
            A520Tran_RegionDescripcionDestino = H007T2_A520Tran_RegionDescripcionDestino[0] ;
            n520Tran_RegionDescripcionDestino = H007T2_n520Tran_RegionDescripcionDestino[0] ;
            A421Tran_RegionCodigo = H007T2_A421Tran_RegionCodigo[0] ;
            n421Tran_RegionCodigo = H007T2_n421Tran_RegionCodigo[0] ;
            A422Tran_RegionDescripcion = H007T2_A422Tran_RegionDescripcion[0] ;
            n422Tran_RegionDescripcion = H007T2_n422Tran_RegionDescripcion[0] ;
            A594Tran_RegionAbrev = H007T2_A594Tran_RegionAbrev[0] ;
            n594Tran_RegionAbrev = H007T2_n594Tran_RegionAbrev[0] ;
            A418Tran_UsuarioNombre = H007T2_A418Tran_UsuarioNombre[0] ;
            n418Tran_UsuarioNombre = H007T2_n418Tran_UsuarioNombre[0] ;
            A417Tran_UsuarioCodigo = H007T2_A417Tran_UsuarioCodigo[0] ;
            n417Tran_UsuarioCodigo = H007T2_n417Tran_UsuarioCodigo[0] ;
            if ( (GXutil.strcmp("", AV29Tran_DescripcionMovimiento)==0) || ( GXutil.like( GXutil.upper( A381Tran_DescripcionMovimiento) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV29Tran_DescripcionMovimiento), "") , 254 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV42Tran_RegionDescripcion)==0) || ( GXutil.like( GXutil.upper( A422Tran_RegionDescripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV42Tran_RegionDescripcion), "") , 254 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV25Tran_CentroCostoCodigo)==0) || ( GXutil.like( GXutil.upper( A419Tran_CentroCostoCodigo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25Tran_CentroCostoCodigo), "") , 254 , "%"),  ' ' ) ) )
                  {
                     if ( GXutil.dateCompare(GXutil.nullDate(), AV30Tran_FechaRegistro) || ( GXutil.dateCompare(GXutil.resetTime( A55Tran_FechaRegistro), AV30Tran_FechaRegistro) ) )
                     {
                        if ( (GXutil.strcmp("", AV34Tran_Observaciones)==0) || ( GXutil.like( GXutil.upper( A416Tran_Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV34Tran_Observaciones), "") , 254 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV21Proveedor)==0) || ( GXutil.like( GXutil.upper( A575Tran_NombreProveedor) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV21Proveedor), "") , 254 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV12Cuentadante)==0) || ( GXutil.like( GXutil.upper( A389Tran_NombCuentadanteDestino) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV12Cuentadante), "") , 254 , "%"),  ' ' ) ) )
                              {
                                 if ( (GXutil.strcmp("", AV33Tran_NombreIngreso)==0) || ( GXutil.like( GXutil.upper( A672Tran_NombreIngreso) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV33Tran_NombreIngreso), "") , 254 , "%"),  ' ' ) ) )
                                 {
                                    e287T2 ();
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
            if ( ! brk7T2 )
            {
               brk7T2 = true ;
               pr_default.readNext(0);
            }
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         wbEnd = (short)(168) ;
         wb7T0( ) ;
      }
      bGXsfl_168_Refreshing = true ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27Tran_ConsecutivoCC, AV26Tran_CodigoMovimiento, AV29Tran_DescripcionMovimiento, AV43Tran_RegionCodigo, AV42Tran_RegionDescripcion, AV25Tran_CentroCostoCodigo, AV30Tran_FechaRegistro, AV34Tran_Observaciones, AV33Tran_NombreIngreso, AV32Tran_IdProveedor, AV21Proveedor, AV31Tran_IdCuentadanteDestino, AV12Cuentadante, AV24Tran_AreadanteCodigo, AV28Tran_CursoCodigo, AV35Tran_TipoIngreso, AV44Reporte, AV38Update, AV8ADVANCED_LABEL_TEMPLATE, AV49Pgmname, A50Tran_CentroCostoIdDestino, A48Tran_CentroCostoId, A23Usua_Id, A1Cent_Id, AV39Usua_Id, AV5Tran_CentroCostoId) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27Tran_ConsecutivoCC, AV26Tran_CodigoMovimiento, AV29Tran_DescripcionMovimiento, AV43Tran_RegionCodigo, AV42Tran_RegionDescripcion, AV25Tran_CentroCostoCodigo, AV30Tran_FechaRegistro, AV34Tran_Observaciones, AV33Tran_NombreIngreso, AV32Tran_IdProveedor, AV21Proveedor, AV31Tran_IdCuentadanteDestino, AV12Cuentadante, AV24Tran_AreadanteCodigo, AV28Tran_CursoCodigo, AV35Tran_TipoIngreso, AV44Reporte, AV38Update, AV8ADVANCED_LABEL_TEMPLATE, AV49Pgmname, A50Tran_CentroCostoIdDestino, A48Tran_CentroCostoId, A23Usua_Id, A1Cent_Id, AV39Usua_Id, AV5Tran_CentroCostoId) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27Tran_ConsecutivoCC, AV26Tran_CodigoMovimiento, AV29Tran_DescripcionMovimiento, AV43Tran_RegionCodigo, AV42Tran_RegionDescripcion, AV25Tran_CentroCostoCodigo, AV30Tran_FechaRegistro, AV34Tran_Observaciones, AV33Tran_NombreIngreso, AV32Tran_IdProveedor, AV21Proveedor, AV31Tran_IdCuentadanteDestino, AV12Cuentadante, AV24Tran_AreadanteCodigo, AV28Tran_CursoCodigo, AV35Tran_TipoIngreso, AV44Reporte, AV38Update, AV8ADVANCED_LABEL_TEMPLATE, AV49Pgmname, A50Tran_CentroCostoIdDestino, A48Tran_CentroCostoId, A23Usua_Id, A1Cent_Id, AV39Usua_Id, AV5Tran_CentroCostoId) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV27Tran_ConsecutivoCC, AV26Tran_CodigoMovimiento, AV29Tran_DescripcionMovimiento, AV43Tran_RegionCodigo, AV42Tran_RegionDescripcion, AV25Tran_CentroCostoCodigo, AV30Tran_FechaRegistro, AV34Tran_Observaciones, AV33Tran_NombreIngreso, AV32Tran_IdProveedor, AV21Proveedor, AV31Tran_IdCuentadanteDestino, AV12Cuentadante, AV24Tran_AreadanteCodigo, AV28Tran_CursoCodigo, AV35Tran_TipoIngreso, AV44Reporte, AV38Update, AV8ADVANCED_LABEL_TEMPLATE, AV49Pgmname, A50Tran_CentroCostoIdDestino, A48Tran_CentroCostoId, A23Usua_Id, A1Cent_Id, AV39Usua_Id, AV5Tran_CentroCostoId) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27Tran_ConsecutivoCC, AV26Tran_CodigoMovimiento, AV29Tran_DescripcionMovimiento, AV43Tran_RegionCodigo, AV42Tran_RegionDescripcion, AV25Tran_CentroCostoCodigo, AV30Tran_FechaRegistro, AV34Tran_Observaciones, AV33Tran_NombreIngreso, AV32Tran_IdProveedor, AV21Proveedor, AV31Tran_IdCuentadanteDestino, AV12Cuentadante, AV24Tran_AreadanteCodigo, AV28Tran_CursoCodigo, AV35Tran_TipoIngreso, AV44Reporte, AV38Update, AV8ADVANCED_LABEL_TEMPLATE, AV49Pgmname, A50Tran_CentroCostoIdDestino, A48Tran_CentroCostoId, A23Usua_Id, A1Cent_Id, AV39Usua_Id, AV5Tran_CentroCostoId) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup7T0( )
   {
      /* Before Start, stand alone formulas. */
      AV49Pgmname = "WWALM_RATIFICAR" ;
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e267T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRAN_CONSECUTIVOCC");
            GX_FocusControl = edtavTran_consecutivocc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27Tran_ConsecutivoCC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV27Tran_ConsecutivoCC, 18, 0)));
         }
         else
         {
            AV27Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV27Tran_ConsecutivoCC, 18, 0)));
         }
         AV26Tran_CodigoMovimiento = httpContext.cgiGet( edtavTran_codigomovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Tran_CodigoMovimiento", AV26Tran_CodigoMovimiento);
         AV29Tran_DescripcionMovimiento = httpContext.cgiGet( edtavTran_descripcionmovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Tran_DescripcionMovimiento", AV29Tran_DescripcionMovimiento);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_regioncodigo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_regioncodigo_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRAN_REGIONCODIGO");
            GX_FocusControl = edtavTran_regioncodigo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV43Tran_RegionCodigo = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43Tran_RegionCodigo", GXutil.ltrim( GXutil.str( AV43Tran_RegionCodigo, 4, 0)));
         }
         else
         {
            AV43Tran_RegionCodigo = (short)(localUtil.ctol( httpContext.cgiGet( edtavTran_regioncodigo_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43Tran_RegionCodigo", GXutil.ltrim( GXutil.str( AV43Tran_RegionCodigo, 4, 0)));
         }
         AV42Tran_RegionDescripcion = httpContext.cgiGet( edtavTran_regiondescripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Tran_RegionDescripcion", AV42Tran_RegionDescripcion);
         AV25Tran_CentroCostoCodigo = httpContext.cgiGet( edtavTran_centrocostocodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Tran_CentroCostoCodigo", AV25Tran_CentroCostoCodigo);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavTran_fecharegistro_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vTRAN_FECHAREGISTRO");
            GX_FocusControl = edtavTran_fecharegistro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30Tran_FechaRegistro = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Tran_FechaRegistro", localUtil.format(AV30Tran_FechaRegistro, "99/99/99"));
         }
         else
         {
            AV30Tran_FechaRegistro = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavTran_fecharegistro_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Tran_FechaRegistro", localUtil.format(AV30Tran_FechaRegistro, "99/99/99"));
         }
         AV34Tran_Observaciones = httpContext.cgiGet( edtavTran_observaciones_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Tran_Observaciones", AV34Tran_Observaciones);
         AV33Tran_NombreIngreso = GXutil.upper( httpContext.cgiGet( edtavTran_nombreingreso_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Tran_NombreIngreso", AV33Tran_NombreIngreso);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_idproveedor_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_idproveedor_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRAN_IDPROVEEDOR");
            GX_FocusControl = edtavTran_idproveedor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV32Tran_IdProveedor = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Tran_IdProveedor", GXutil.ltrim( GXutil.str( AV32Tran_IdProveedor, 18, 0)));
         }
         else
         {
            AV32Tran_IdProveedor = localUtil.ctol( httpContext.cgiGet( edtavTran_idproveedor_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Tran_IdProveedor", GXutil.ltrim( GXutil.str( AV32Tran_IdProveedor, 18, 0)));
         }
         AV21Proveedor = httpContext.cgiGet( edtavProveedor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Proveedor", AV21Proveedor);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_idcuentadantedestino_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_idcuentadantedestino_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRAN_IDCUENTADANTEDESTINO");
            GX_FocusControl = edtavTran_idcuentadantedestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31Tran_IdCuentadanteDestino = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( AV31Tran_IdCuentadanteDestino, 18, 0)));
         }
         else
         {
            AV31Tran_IdCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( edtavTran_idcuentadantedestino_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( AV31Tran_IdCuentadanteDestino, 18, 0)));
         }
         AV12Cuentadante = httpContext.cgiGet( edtavCuentadante_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Cuentadante", AV12Cuentadante);
         AV24Tran_AreadanteCodigo = httpContext.cgiGet( edtavTran_areadantecodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Tran_AreadanteCodigo", AV24Tran_AreadanteCodigo);
         AV28Tran_CursoCodigo = httpContext.cgiGet( edtavTran_cursocodigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Tran_CursoCodigo", AV28Tran_CursoCodigo);
         /* Read saved values. */
         nRC_GXsfl_168 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_168"), ",", ".")) ;
         AV46WindowsId = (short)(localUtil.ctol( httpContext.cgiGet( "vWINDOWSID"), ",", ".")) ;
         AV45url = httpContext.cgiGet( "vURL") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), ",", ".") ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), ",", ".")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
         Alertify1_Promptplaceholder = httpContext.cgiGet( "ALERTIFY1_Promptplaceholder") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTRAN_CONSECUTIVOCC"), ",", ".") != AV27Tran_ConsecutivoCC )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_CODIGOMOVIMIENTO"), AV26Tran_CodigoMovimiento) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_DESCRIPCIONMOVIMIENTO"), AV29Tran_DescripcionMovimiento) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTRAN_REGIONCODIGO"), ",", ".") != AV43Tran_RegionCodigo )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_REGIONDESCRIPCION"), AV42Tran_RegionDescripcion) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_CENTROCOSTOCODIGO"), AV25Tran_CentroCostoCodigo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vTRAN_FECHAREGISTRO"), 0), AV30Tran_FechaRegistro) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_OBSERVACIONES"), AV34Tran_Observaciones) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_NOMBREINGRESO"), AV33Tran_NombreIngreso) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTRAN_IDPROVEEDOR"), ",", ".") != AV32Tran_IdProveedor )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPROVEEDOR"), AV21Proveedor) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vTRAN_IDCUENTADANTEDESTINO"), ",", ".") != AV31Tran_IdCuentadanteDestino )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCUENTADANTE"), AV12Cuentadante) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_AREADANTECODIGO"), AV24Tran_AreadanteCodigo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTRAN_CURSOCODIGO"), AV28Tran_CursoCodigo) != 0 )
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
      e267T2 ();
      if ( returnInSub )
      {
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e267T2( )
   {
      /* Start Routine */
      if ( ! new com.orions2.isauthorized(remoteHandle, context).executeUdp( AV49Pgmname) )
      {
         callWebObject(formatLink("com.orions2.notauthorized") + "?" + GXutil.URLEncode(GXutil.rtrim(AV49Pgmname)));
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      divGridcell_Class = "WWGridCellExpanded" ;
      httpContext.ajax_rsp_assign_prop("", false, divGridcell_Internalname, "Class", divGridcell_Class, true);
      subGrid_Rows = 10 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV44Reporte = context.getHttpContext().getImagePath( "546fc62f-713c-44a9-b57b-fb633fb105bd", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReporte_Internalname, "Bitmap", ((GXutil.strcmp("", AV44Reporte)==0) ? AV50Reporte_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV44Reporte))), !bGXsfl_168_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavReporte_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV44Reporte), true);
      AV50Reporte_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "546fc62f-713c-44a9-b57b-fb633fb105bd", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReporte_Internalname, "Bitmap", ((GXutil.strcmp("", AV44Reporte)==0) ? AV50Reporte_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV44Reporte))), !bGXsfl_168_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavReporte_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV44Reporte), true);
      edtavReporte_Tooltiptext = "Reporte" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReporte_Internalname, "Tooltiptext", edtavReporte_Tooltiptext, !bGXsfl_168_Refreshing);
      AV38Update = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV38Update)==0) ? AV51Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV38Update))), !bGXsfl_168_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV38Update), true);
      AV51Update_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "Bitmap", ((GXutil.strcmp("", AV38Update)==0) ? AV51Update_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV38Update))), !bGXsfl_168_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavUpdate_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV38Update), true);
      AV35Tran_TipoIngreso = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Tran_TipoIngreso", GXutil.ltrim( GXutil.str( AV35Tran_TipoIngreso, 11, 0)));
      Form.setCaption( "Ratificar" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV8ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8ADVANCED_LABEL_TEMPLATE", AV8ADVANCED_LABEL_TEMPLATE);
      AV40Usuario = AV6websession.getValue("Usuario") ;
      AV39Usua_Id = GXutil.lval( AV6websession.getValue("UsuarioId")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Usua_Id", GXutil.ltrim( GXutil.str( AV39Usua_Id, 18, 0)));
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
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
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e277T2( )
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
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         returnInSub = true;
         if (true) return;
      }
      if ( (GXutil.strcmp("", AV26Tran_CodigoMovimiento)==0) )
      {
         lblLbltran_codigomovimientofilter_Caption = "Código Movimiento" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_codigomovimientofilter_Internalname, "Caption", lblLbltran_codigomovimientofilter_Caption, true);
      }
      else
      {
         lblLbltran_codigomovimientofilter_Caption = GXutil.format( AV8ADVANCED_LABEL_TEMPLATE, "Código Movimiento", AV26Tran_CodigoMovimiento, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_codigomovimientofilter_Internalname, "Caption", lblLbltran_codigomovimientofilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV29Tran_DescripcionMovimiento)==0) )
      {
         lblLbltran_descripcionmovimientofilter_Caption = "Descripción Movimiento" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_descripcionmovimientofilter_Internalname, "Caption", lblLbltran_descripcionmovimientofilter_Caption, true);
      }
      else
      {
         lblLbltran_descripcionmovimientofilter_Caption = GXutil.format( AV8ADVANCED_LABEL_TEMPLATE, "Descripción Movimiento", AV29Tran_DescripcionMovimiento, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_descripcionmovimientofilter_Internalname, "Caption", lblLbltran_descripcionmovimientofilter_Caption, true);
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), AV30Tran_FechaRegistro) )
      {
         lblLbltran_fecharegistrofilter_Caption = "Fecha de Registro" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_fecharegistrofilter_Internalname, "Caption", lblLbltran_fecharegistrofilter_Caption, true);
      }
      else
      {
         lblLbltran_fecharegistrofilter_Caption = GXutil.format( AV8ADVANCED_LABEL_TEMPLATE, "Fecha de Registro", localUtil.dtoc( AV30Tran_FechaRegistro, 0, "-"), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_fecharegistrofilter_Internalname, "Caption", lblLbltran_fecharegistrofilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV34Tran_Observaciones)==0) )
      {
         lblLbltran_observacionesfilter_Caption = "Observaciones" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_observacionesfilter_Internalname, "Caption", lblLbltran_observacionesfilter_Caption, true);
      }
      else
      {
         lblLbltran_observacionesfilter_Caption = GXutil.format( AV8ADVANCED_LABEL_TEMPLATE, "Observaciones", AV34Tran_Observaciones, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_observacionesfilter_Internalname, "Caption", lblLbltran_observacionesfilter_Caption, true);
      }
      if ( (0==AV35Tran_TipoIngreso) )
      {
         lblLbltran_tipoingresofilter_Caption = "Tipo de Ingreso" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_tipoingresofilter_Internalname, "Caption", lblLbltran_tipoingresofilter_Caption, true);
      }
      else
      {
         lblLbltran_tipoingresofilter_Caption = GXutil.format( AV8ADVANCED_LABEL_TEMPLATE, "Tipo de Ingreso", GXutil.ltrim( GXutil.str( AV35Tran_TipoIngreso, 11, 0)), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_tipoingresofilter_Internalname, "Caption", lblLbltran_tipoingresofilter_Caption, true);
      }
      if ( (0==AV32Tran_IdProveedor) )
      {
         lblLbltran_idproveedorfilter_Caption = "Nit Proveedor" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_idproveedorfilter_Internalname, "Caption", lblLbltran_idproveedorfilter_Caption, true);
      }
      else
      {
         lblLbltran_idproveedorfilter_Caption = GXutil.format( AV8ADVANCED_LABEL_TEMPLATE, "Nit Proveedor", GXutil.ltrim( GXutil.str( AV32Tran_IdProveedor, 18, 0)), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_idproveedorfilter_Internalname, "Caption", lblLbltran_idproveedorfilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV21Proveedor)==0) )
      {
         lblLbltran_nombreproveedorfilter_Caption = "Nombre Proveedor" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_nombreproveedorfilter_Internalname, "Caption", lblLbltran_nombreproveedorfilter_Caption, true);
      }
      else
      {
         lblLbltran_nombreproveedorfilter_Caption = GXutil.format( AV8ADVANCED_LABEL_TEMPLATE, "Nombre Proveedor", AV21Proveedor, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_nombreproveedorfilter_Internalname, "Caption", lblLbltran_nombreproveedorfilter_Caption, true);
      }
      if ( (0==AV31Tran_IdCuentadanteDestino) )
      {
         lblLbltran_idcuentadantedestinofilter_Caption = "Cédula Cuentadante" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_idcuentadantedestinofilter_Internalname, "Caption", lblLbltran_idcuentadantedestinofilter_Caption, true);
      }
      else
      {
         lblLbltran_idcuentadantedestinofilter_Caption = GXutil.format( AV8ADVANCED_LABEL_TEMPLATE, "Cédula Cuentadante", GXutil.ltrim( GXutil.str( AV31Tran_IdCuentadanteDestino, 18, 0)), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_idcuentadantedestinofilter_Internalname, "Caption", lblLbltran_idcuentadantedestinofilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV12Cuentadante)==0) )
      {
         lblLbltran_nombrecuentadantefilter_Caption = "Nombre Cuentadante" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_nombrecuentadantefilter_Internalname, "Caption", lblLbltran_nombrecuentadantefilter_Caption, true);
      }
      else
      {
         lblLbltran_nombrecuentadantefilter_Caption = GXutil.format( AV8ADVANCED_LABEL_TEMPLATE, "Nombre Cuentadante", AV12Cuentadante, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_nombrecuentadantefilter_Internalname, "Caption", lblLbltran_nombrecuentadantefilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV24Tran_AreadanteCodigo)==0) )
      {
         lblLbltran_areadantecodigofilter_Caption = "Areadante" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_areadantecodigofilter_Internalname, "Caption", lblLbltran_areadantecodigofilter_Caption, true);
      }
      else
      {
         lblLbltran_areadantecodigofilter_Caption = GXutil.format( AV8ADVANCED_LABEL_TEMPLATE, "Areadante", AV24Tran_AreadanteCodigo, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_areadantecodigofilter_Internalname, "Caption", lblLbltran_areadantecodigofilter_Caption, true);
      }
      if ( (GXutil.strcmp("", AV28Tran_CursoCodigo)==0) )
      {
         lblLbltran_cursocodigofilter_Caption = "Curso" ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_cursocodigofilter_Internalname, "Caption", lblLbltran_cursocodigofilter_Caption, true);
      }
      else
      {
         lblLbltran_cursocodigofilter_Caption = GXutil.format( AV8ADVANCED_LABEL_TEMPLATE, "Curso", AV28Tran_CursoCodigo, "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLbltran_cursocodigofilter_Internalname, "Caption", lblLbltran_cursocodigofilter_Caption, true);
      }
   }

   private void e287T2( )
   {
      /* Grid_Load Routine */
      GRID_nEOF = (byte)(0) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      while ( ( (pr_default.getStatus(0) != 101) && GXutil.dateCompare(H007T2_A55Tran_FechaRegistro[0], A55Tran_FechaRegistro) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) ) )
      {
         brk7T2 = false ;
         A416Tran_Observaciones = H007T2_A416Tran_Observaciones[0] ;
         n416Tran_Observaciones = H007T2_n416Tran_Observaciones[0] ;
         A513Tran_ConsecutivoCC = H007T2_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = H007T2_n513Tran_ConsecutivoCC[0] ;
         A49Tran_CodigoMovimiento = H007T2_A49Tran_CodigoMovimiento[0] ;
         A381Tran_DescripcionMovimiento = H007T2_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = H007T2_n381Tran_DescripcionMovimiento[0] ;
         A421Tran_RegionCodigo = H007T2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = H007T2_n421Tran_RegionCodigo[0] ;
         A422Tran_RegionDescripcion = H007T2_A422Tran_RegionDescripcion[0] ;
         n422Tran_RegionDescripcion = H007T2_n422Tran_RegionDescripcion[0] ;
         A419Tran_CentroCostoCodigo = H007T2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = H007T2_n419Tran_CentroCostoCodigo[0] ;
         A54Tran_TipoIngreso = H007T2_A54Tran_TipoIngreso[0] ;
         n54Tran_TipoIngreso = H007T2_n54Tran_TipoIngreso[0] ;
         A53Tran_IdProveedor = H007T2_A53Tran_IdProveedor[0] ;
         n53Tran_IdProveedor = H007T2_n53Tran_IdProveedor[0] ;
         A52Tran_IdCuentadanteDestino = H007T2_A52Tran_IdCuentadanteDestino[0] ;
         n52Tran_IdCuentadanteDestino = H007T2_n52Tran_IdCuentadanteDestino[0] ;
         A407Tran_AreadanteCodigo = H007T2_A407Tran_AreadanteCodigo[0] ;
         n407Tran_AreadanteCodigo = H007T2_n407Tran_AreadanteCodigo[0] ;
         A408Tran_CursoCodigo = H007T2_A408Tran_CursoCodigo[0] ;
         n408Tran_CursoCodigo = H007T2_n408Tran_CursoCodigo[0] ;
         A575Tran_NombreProveedor = H007T2_A575Tran_NombreProveedor[0] ;
         n575Tran_NombreProveedor = H007T2_n575Tran_NombreProveedor[0] ;
         A389Tran_NombCuentadanteDestino = H007T2_A389Tran_NombCuentadanteDestino[0] ;
         n389Tran_NombCuentadanteDestino = H007T2_n389Tran_NombCuentadanteDestino[0] ;
         A672Tran_NombreIngreso = H007T2_A672Tran_NombreIngreso[0] ;
         n672Tran_NombreIngreso = H007T2_n672Tran_NombreIngreso[0] ;
         A58Tran_Estado = H007T2_A58Tran_Estado[0] ;
         n58Tran_Estado = H007T2_n58Tran_Estado[0] ;
         A50Tran_CentroCostoIdDestino = H007T2_A50Tran_CentroCostoIdDestino[0] ;
         n50Tran_CentroCostoIdDestino = H007T2_n50Tran_CentroCostoIdDestino[0] ;
         A48Tran_CentroCostoId = H007T2_A48Tran_CentroCostoId[0] ;
         A667Tran_NumeroGrupo = H007T2_A667Tran_NumeroGrupo[0] ;
         n667Tran_NumeroGrupo = H007T2_n667Tran_NumeroGrupo[0] ;
         A524Tran_Detalle = H007T2_A524Tran_Detalle[0] ;
         n524Tran_Detalle = H007T2_n524Tran_Detalle[0] ;
         A568Tran_CantidadPadres = H007T2_A568Tran_CantidadPadres[0] ;
         n568Tran_CantidadPadres = H007T2_n568Tran_CantidadPadres[0] ;
         A527Tran_TipoEntra = H007T2_A527Tran_TipoEntra[0] ;
         n527Tran_TipoEntra = H007T2_n527Tran_TipoEntra[0] ;
         A518Tran_RegionIdDestino = H007T2_A518Tran_RegionIdDestino[0] ;
         n518Tran_RegionIdDestino = H007T2_n518Tran_RegionIdDestino[0] ;
         A514Tran_NumeroIngreso = H007T2_A514Tran_NumeroIngreso[0] ;
         n514Tran_NumeroIngreso = H007T2_n514Tran_NumeroIngreso[0] ;
         A482Tran_TipoElemento = H007T2_A482Tran_TipoElemento[0] ;
         A483Tran_ValorTransaccion = H007T2_A483Tran_ValorTransaccion[0] ;
         n483Tran_ValorTransaccion = H007T2_n483Tran_ValorTransaccion[0] ;
         A481Tran_IndE_S = H007T2_A481Tran_IndE_S[0] ;
         n481Tran_IndE_S = H007T2_n481Tran_IndE_S[0] ;
         A57Tran_RegionId = H007T2_A57Tran_RegionId[0] ;
         n57Tran_RegionId = H007T2_n57Tran_RegionId[0] ;
         A47Tran_UsuarioId = H007T2_A47Tran_UsuarioId[0] ;
         n47Tran_UsuarioId = H007T2_n47Tran_UsuarioId[0] ;
         A391Tran_UsuarioRatifica = H007T2_A391Tran_UsuarioRatifica[0] ;
         n391Tran_UsuarioRatifica = H007T2_n391Tran_UsuarioRatifica[0] ;
         A390Tran_FechaRatificacion = H007T2_A390Tran_FechaRatificacion[0] ;
         n390Tran_FechaRatificacion = H007T2_n390Tran_FechaRatificacion[0] ;
         A46Tran_Id = H007T2_A46Tran_Id[0] ;
         A51Tran_IdCuentadanteOrigen = H007T2_A51Tran_IdCuentadanteOrigen[0] ;
         n51Tran_IdCuentadanteOrigen = H007T2_n51Tran_IdCuentadanteOrigen[0] ;
         A387Tran_CodBodeDestino = H007T2_A387Tran_CodBodeDestino[0] ;
         A111Tran_CodAlmaDestino = H007T2_A111Tran_CodAlmaDestino[0] ;
         A385Tran_ModuloDestino = H007T2_A385Tran_ModuloDestino[0] ;
         A112Tran_CodBodeOrigen = H007T2_A112Tran_CodBodeOrigen[0] ;
         A109Tran_CodAlmaOrigen = H007T2_A109Tran_CodAlmaOrigen[0] ;
         A110Tran_ModuloOrigen = H007T2_A110Tran_ModuloOrigen[0] ;
         A381Tran_DescripcionMovimiento = H007T2_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = H007T2_n381Tran_DescripcionMovimiento[0] ;
         A672Tran_NombreIngreso = H007T2_A672Tran_NombreIngreso[0] ;
         n672Tran_NombreIngreso = H007T2_n672Tran_NombreIngreso[0] ;
         A575Tran_NombreProveedor = H007T2_A575Tran_NombreProveedor[0] ;
         n575Tran_NombreProveedor = H007T2_n575Tran_NombreProveedor[0] ;
         A389Tran_NombCuentadanteDestino = H007T2_A389Tran_NombCuentadanteDestino[0] ;
         n389Tran_NombCuentadanteDestino = H007T2_n389Tran_NombCuentadanteDestino[0] ;
         A419Tran_CentroCostoCodigo = H007T2_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = H007T2_n419Tran_CentroCostoCodigo[0] ;
         A421Tran_RegionCodigo = H007T2_A421Tran_RegionCodigo[0] ;
         n421Tran_RegionCodigo = H007T2_n421Tran_RegionCodigo[0] ;
         A422Tran_RegionDescripcion = H007T2_A422Tran_RegionDescripcion[0] ;
         n422Tran_RegionDescripcion = H007T2_n422Tran_RegionDescripcion[0] ;
         if ( (GXutil.strcmp("", AV29Tran_DescripcionMovimiento)==0) || ( GXutil.like( GXutil.upper( A381Tran_DescripcionMovimiento) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV29Tran_DescripcionMovimiento), "") , 254 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV42Tran_RegionDescripcion)==0) || ( GXutil.like( GXutil.upper( A422Tran_RegionDescripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV42Tran_RegionDescripcion), "") , 254 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV25Tran_CentroCostoCodigo)==0) || ( GXutil.like( GXutil.upper( A419Tran_CentroCostoCodigo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25Tran_CentroCostoCodigo), "") , 254 , "%"),  ' ' ) ) )
               {
                  if ( GXutil.dateCompare(GXutil.nullDate(), AV30Tran_FechaRegistro) || ( GXutil.dateCompare(GXutil.resetTime( A55Tran_FechaRegistro), AV30Tran_FechaRegistro) ) )
                  {
                     if ( (GXutil.strcmp("", AV21Proveedor)==0) || ( GXutil.like( GXutil.upper( A575Tran_NombreProveedor) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV21Proveedor), "") , 254 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV12Cuentadante)==0) || ( GXutil.like( GXutil.upper( A389Tran_NombCuentadanteDestino) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV12Cuentadante), "") , 254 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV33Tran_NombreIngreso)==0) || ( GXutil.like( GXutil.upper( A672Tran_NombreIngreso) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV33Tran_NombreIngreso), "") , 254 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV34Tran_Observaciones)==0) || ( GXutil.like( GXutil.upper( A416Tran_Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV34Tran_Observaciones), "") , 254 , "%"),  ' ' ) ) )
                              {
                                 AV5Tran_CentroCostoId = A50Tran_CentroCostoIdDestino ;
                                 httpContext.ajax_rsp_assign_attri("", false, "AV5Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV5Tran_CentroCostoId, 11, 0)));
                                 AV7Acceso = "NO" ;
                                 /* Execute user subroutine: 'ACCESO' */
                                 S143 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    returnInSub = true;
                                    if (true) return;
                                 }
                                 if ( ( GXutil.strcmp(AV7Acceso, "SI") == 0 ) && ( ( A48Tran_CentroCostoId == A50Tran_CentroCostoIdDestino ) ) )
                                 {
                                    /* Load Method */
                                    if ( wbStart != -1 )
                                    {
                                       wbStart = (short)(168) ;
                                    }
                                    if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_recordsperpage( ) ) ) )
                                    {
                                       sendrow_1682( ) ;
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
                                    if ( isFullAjaxMode( ) && ! bGXsfl_168_Refreshing )
                                    {
                                       httpContext.doAjaxLoad(168, GridRow);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         brk7T2 = true ;
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      if ( GXutil.strcmp(AV17HTTPRequest.getMethod(), "GET") == 0 )
      {
         AV15GridState.fromxml(AV22Session.getValue(AV49Pgmname+"GridState"), null, null);
         if ( AV15GridState.getgxTv_SdtGridState_Filtervalues().size() >= 12 )
         {
            AV27Tran_ConsecutivoCC = GXutil.lval( ((com.orions2.SdtGridState_FilterValue)AV15GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+1)).getgxTv_SdtGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV27Tran_ConsecutivoCC, 18, 0)));
            AV26Tran_CodigoMovimiento = ((com.orions2.SdtGridState_FilterValue)AV15GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+2)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Tran_CodigoMovimiento", AV26Tran_CodigoMovimiento);
            AV29Tran_DescripcionMovimiento = ((com.orions2.SdtGridState_FilterValue)AV15GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+3)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Tran_DescripcionMovimiento", AV29Tran_DescripcionMovimiento);
            AV30Tran_FechaRegistro = localUtil.ctod( ((com.orions2.SdtGridState_FilterValue)AV15GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+4)).getgxTv_SdtGridState_FilterValue_Value(), 3) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Tran_FechaRegistro", localUtil.format(AV30Tran_FechaRegistro, "99/99/99"));
            AV34Tran_Observaciones = ((com.orions2.SdtGridState_FilterValue)AV15GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+5)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Tran_Observaciones", AV34Tran_Observaciones);
            AV35Tran_TipoIngreso = GXutil.lval( ((com.orions2.SdtGridState_FilterValue)AV15GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+6)).getgxTv_SdtGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35Tran_TipoIngreso", GXutil.ltrim( GXutil.str( AV35Tran_TipoIngreso, 11, 0)));
            AV32Tran_IdProveedor = GXutil.lval( ((com.orions2.SdtGridState_FilterValue)AV15GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+7)).getgxTv_SdtGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Tran_IdProveedor", GXutil.ltrim( GXutil.str( AV32Tran_IdProveedor, 18, 0)));
            AV21Proveedor = ((com.orions2.SdtGridState_FilterValue)AV15GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+8)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Proveedor", AV21Proveedor);
            AV31Tran_IdCuentadanteDestino = GXutil.lval( ((com.orions2.SdtGridState_FilterValue)AV15GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+9)).getgxTv_SdtGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( AV31Tran_IdCuentadanteDestino, 18, 0)));
            AV12Cuentadante = ((com.orions2.SdtGridState_FilterValue)AV15GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+10)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Cuentadante", AV12Cuentadante);
            AV24Tran_AreadanteCodigo = ((com.orions2.SdtGridState_FilterValue)AV15GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+11)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Tran_AreadanteCodigo", AV24Tran_AreadanteCodigo);
            AV28Tran_CursoCodigo = ((com.orions2.SdtGridState_FilterValue)AV15GridState.getgxTv_SdtGridState_Filtervalues().elementAt(-1+12)).getgxTv_SdtGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Tran_CursoCodigo", AV28Tran_CursoCodigo);
         }
         if ( AV15GridState.getgxTv_SdtGridState_Currentpage() > 0 )
         {
            AV14GridPageCount = subgrid_pagecount( ) ;
            if ( ( AV14GridPageCount > 0 ) && ( AV14GridPageCount < AV15GridState.getgxTv_SdtGridState_Currentpage() ) )
            {
               subgrid_gotopage( AV14GridPageCount) ;
            }
            else
            {
               subgrid_gotopage( AV15GridState.getgxTv_SdtGridState_Currentpage()) ;
            }
         }
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      AV15GridState.fromxml(AV22Session.getValue(AV49Pgmname+"GridState"), null, null);
      AV15GridState.setgxTv_SdtGridState_Currentpage( (short)(subgrid_currentpage( )) );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().clear();
      AV16GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( GXutil.str( AV27Tran_ConsecutivoCC, 18, 0) );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      AV16GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV26Tran_CodigoMovimiento );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      AV16GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV29Tran_DescripcionMovimiento );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      AV16GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( localUtil.dtoc( AV30Tran_FechaRegistro, 3, "/") );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      AV16GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV34Tran_Observaciones );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      AV16GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( GXutil.str( AV35Tran_TipoIngreso, 11, 0) );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      AV16GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( GXutil.str( AV32Tran_IdProveedor, 18, 0) );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      AV16GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV21Proveedor );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      AV16GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( GXutil.str( AV31Tran_IdCuentadanteDestino, 18, 0) );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      AV16GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV12Cuentadante );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      AV16GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV24Tran_AreadanteCodigo );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      AV16GridStateFilterValue = (com.orions2.SdtGridState_FilterValue)new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV16GridStateFilterValue.setgxTv_SdtGridState_FilterValue_Value( AV28Tran_CursoCodigo );
      AV15GridState.getgxTv_SdtGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      AV22Session.setValue(AV49Pgmname+"GridState", AV15GridState.toxml(false, true, "GridState", "ACBSENA"));
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      AV36TrnContext = (com.orions2.SdtTransactionContext)new com.orions2.SdtTransactionContext(remoteHandle, context);
      AV36TrnContext.setgxTv_SdtTransactionContext_Callerobject( AV49Pgmname );
      AV36TrnContext.setgxTv_SdtTransactionContext_Callerondelete( true );
      AV36TrnContext.setgxTv_SdtTransactionContext_Callerurl( AV17HTTPRequest.getScriptName()+"?"+AV17HTTPRequest.getQuerystring() );
      AV36TrnContext.setgxTv_SdtTransactionContext_Transactionname( "Ratificar" );
      AV22Session.setValue("TrnContext", AV36TrnContext.toxml(false, true, "TransactionContext", "ACBSENA"));
   }

   public void S143( )
   {
      /* 'ACCESO' Routine */
      /* Using cursor H007T3 */
      pr_default.execute(1, new Object[] {new Long(AV39Usua_Id), new Long(AV5Tran_CentroCostoId)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1Cent_Id = H007T3_A1Cent_Id[0] ;
         A23Usua_Id = H007T3_A23Usua_Id[0] ;
         AV7Acceso = "SI" ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void e297T2( )
   {
      /* 'Ratificar' Routine */
      callWebObject(formatLink("com.orions2.wpalm_ratificaciontrn") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(A46Tran_Id,11,0))));
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.doAjaxRefresh();
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
      pa7T2( ) ;
      ws7T2( ) ;
      we7T2( ) ;
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
      httpContext.AddStyleSheetFile("Alertify/css/alertify.core.css", "?1126220");
      httpContext.AddStyleSheetFile("Alertify/css/alertify.default.css", "?11295124");
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414224552");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wwalm_ratificar.js", "?201861414224552");
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1682( )
   {
      edtavReporte_Internalname = "vREPORTE_"+sGXsfl_168_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_168_idx ;
      edtTran_ConsecutivoCC_Internalname = "TRAN_CONSECUTIVOCC_"+sGXsfl_168_idx ;
      edtTran_CodigoMovimiento_Internalname = "TRAN_CODIGOMOVIMIENTO_"+sGXsfl_168_idx ;
      edtTran_DescripcionMovimiento_Internalname = "TRAN_DESCRIPCIONMOVIMIENTO_"+sGXsfl_168_idx ;
      edtTran_RegionDescripcion_Internalname = "TRAN_REGIONDESCRIPCION_"+sGXsfl_168_idx ;
      edtTran_CentroCostoCodigo_Internalname = "TRAN_CENTROCOSTOCODIGO_"+sGXsfl_168_idx ;
      edtTran_ModuloOrigen_Internalname = "TRAN_MODULOORIGEN_"+sGXsfl_168_idx ;
      edtTran_CodAlmaOrigen_Internalname = "TRAN_CODALMAORIGEN_"+sGXsfl_168_idx ;
      edtTran_CodBodeOrigen_Internalname = "TRAN_CODBODEORIGEN_"+sGXsfl_168_idx ;
      edtTran_ModuloDestino_Internalname = "TRAN_MODULODESTINO_"+sGXsfl_168_idx ;
      edtTran_CodAlmaDestino_Internalname = "TRAN_CODALMADESTINO_"+sGXsfl_168_idx ;
      edtTran_CodBodeDestino_Internalname = "TRAN_CODBODEDESTINO_"+sGXsfl_168_idx ;
      edtTran_FechaRegistro_Internalname = "TRAN_FECHAREGISTRO_"+sGXsfl_168_idx ;
      edtTran_IdProveedor_Internalname = "TRAN_IDPROVEEDOR_"+sGXsfl_168_idx ;
      edtTran_NombreProveedor_Internalname = "TRAN_NOMBREPROVEEDOR_"+sGXsfl_168_idx ;
      edtTran_IdCuentadanteDestino_Internalname = "TRAN_IDCUENTADANTEDESTINO_"+sGXsfl_168_idx ;
      edtTran_NombCuentadanteDestino_Internalname = "TRAN_NOMBCUENTADANTEDESTINO_"+sGXsfl_168_idx ;
      edtTran_Observaciones_Internalname = "TRAN_OBSERVACIONES_"+sGXsfl_168_idx ;
      edtTran_AreadanteCodigo_Internalname = "TRAN_AREADANTECODIGO_"+sGXsfl_168_idx ;
      edtTran_CursoCodigo_Internalname = "TRAN_CURSOCODIGO_"+sGXsfl_168_idx ;
      edtTran_NombreIngreso_Internalname = "TRAN_NOMBREINGRESO_"+sGXsfl_168_idx ;
      cmbTran_Estado.setInternalname( "TRAN_ESTADO_"+sGXsfl_168_idx );
      edtTran_IdCuentadanteOrigen_Internalname = "TRAN_IDCUENTADANTEORIGEN_"+sGXsfl_168_idx ;
      edtTran_Id_Internalname = "TRAN_ID_"+sGXsfl_168_idx ;
      edtTran_FechaRatificacion_Internalname = "TRAN_FECHARATIFICACION_"+sGXsfl_168_idx ;
      edtTran_UsuarioRatifica_Internalname = "TRAN_USUARIORATIFICA_"+sGXsfl_168_idx ;
      edtTran_UsuarioId_Internalname = "TRAN_USUARIOID_"+sGXsfl_168_idx ;
      edtTran_UsuarioCodigo_Internalname = "TRAN_USUARIOCODIGO_"+sGXsfl_168_idx ;
      edtTran_UsuarioNombre_Internalname = "TRAN_USUARIONOMBRE_"+sGXsfl_168_idx ;
      edtTran_CentroCostoId_Internalname = "TRAN_CENTROCOSTOID_"+sGXsfl_168_idx ;
      edtTran_CentroCostoDescripcion_Internalname = "TRAN_CENTROCOSTODESCRIPCION_"+sGXsfl_168_idx ;
      edtTran_RegionId_Internalname = "TRAN_REGIONID_"+sGXsfl_168_idx ;
      edtTran_RegionCodigo_Internalname = "TRAN_REGIONCODIGO_"+sGXsfl_168_idx ;
      cmbTran_IndE_S.setInternalname( "TRAN_INDE_S_"+sGXsfl_168_idx );
      edtTran_ValorTransaccion_Internalname = "TRAN_VALORTRANSACCION_"+sGXsfl_168_idx ;
      edtTran_CodTipoElemento_Internalname = "TRAN_CODTIPOELEMENTO_"+sGXsfl_168_idx ;
      cmbTran_TipoElemento.setInternalname( "TRAN_TIPOELEMENTO_"+sGXsfl_168_idx );
      edtTran_NumeroIngreso_Internalname = "TRAN_NUMEROINGRESO_"+sGXsfl_168_idx ;
      edtTran_RegionDescripcionDestino_Internalname = "TRAN_REGIONDESCRIPCIONDESTINO_"+sGXsfl_168_idx ;
      edtTran_CentroCostoIdDestino_Internalname = "TRAN_CENTROCOSTOIDDESTINO_"+sGXsfl_168_idx ;
      edtTran_CentroCostoCodigoDestino_Internalname = "TRAN_CENTROCOSTOCODIGODESTINO_"+sGXsfl_168_idx ;
      edtTran_CentroCostoDescripcionDes_Internalname = "TRAN_CENTROCOSTODESCRIPCIONDES_"+sGXsfl_168_idx ;
      edtTran_RegionIdDestino_Internalname = "TRAN_REGIONIDDESTINO_"+sGXsfl_168_idx ;
      edtTran_RegionCodigoDestino_Internalname = "TRAN_REGIONCODIGODESTINO_"+sGXsfl_168_idx ;
      cmbTran_TipoEntra.setInternalname( "TRAN_TIPOENTRA_"+sGXsfl_168_idx );
      edtTran_CantidadPadres_Internalname = "TRAN_CANTIDADPADRES_"+sGXsfl_168_idx ;
      edtTran_RegionAbrev_Internalname = "TRAN_REGIONABREV_"+sGXsfl_168_idx ;
      edtTran_RegionAbrevDestino_Internalname = "TRAN_REGIONABREVDESTINO_"+sGXsfl_168_idx ;
      edtTran_Detalle_Internalname = "TRAN_DETALLE_"+sGXsfl_168_idx ;
      edtTran_NumeroGrupo_Internalname = "TRAN_NUMEROGRUPO_"+sGXsfl_168_idx ;
   }

   public void subsflControlProps_fel_1682( )
   {
      edtavReporte_Internalname = "vREPORTE_"+sGXsfl_168_fel_idx ;
      edtavUpdate_Internalname = "vUPDATE_"+sGXsfl_168_fel_idx ;
      edtTran_ConsecutivoCC_Internalname = "TRAN_CONSECUTIVOCC_"+sGXsfl_168_fel_idx ;
      edtTran_CodigoMovimiento_Internalname = "TRAN_CODIGOMOVIMIENTO_"+sGXsfl_168_fel_idx ;
      edtTran_DescripcionMovimiento_Internalname = "TRAN_DESCRIPCIONMOVIMIENTO_"+sGXsfl_168_fel_idx ;
      edtTran_RegionDescripcion_Internalname = "TRAN_REGIONDESCRIPCION_"+sGXsfl_168_fel_idx ;
      edtTran_CentroCostoCodigo_Internalname = "TRAN_CENTROCOSTOCODIGO_"+sGXsfl_168_fel_idx ;
      edtTran_ModuloOrigen_Internalname = "TRAN_MODULOORIGEN_"+sGXsfl_168_fel_idx ;
      edtTran_CodAlmaOrigen_Internalname = "TRAN_CODALMAORIGEN_"+sGXsfl_168_fel_idx ;
      edtTran_CodBodeOrigen_Internalname = "TRAN_CODBODEORIGEN_"+sGXsfl_168_fel_idx ;
      edtTran_ModuloDestino_Internalname = "TRAN_MODULODESTINO_"+sGXsfl_168_fel_idx ;
      edtTran_CodAlmaDestino_Internalname = "TRAN_CODALMADESTINO_"+sGXsfl_168_fel_idx ;
      edtTran_CodBodeDestino_Internalname = "TRAN_CODBODEDESTINO_"+sGXsfl_168_fel_idx ;
      edtTran_FechaRegistro_Internalname = "TRAN_FECHAREGISTRO_"+sGXsfl_168_fel_idx ;
      edtTran_IdProveedor_Internalname = "TRAN_IDPROVEEDOR_"+sGXsfl_168_fel_idx ;
      edtTran_NombreProveedor_Internalname = "TRAN_NOMBREPROVEEDOR_"+sGXsfl_168_fel_idx ;
      edtTran_IdCuentadanteDestino_Internalname = "TRAN_IDCUENTADANTEDESTINO_"+sGXsfl_168_fel_idx ;
      edtTran_NombCuentadanteDestino_Internalname = "TRAN_NOMBCUENTADANTEDESTINO_"+sGXsfl_168_fel_idx ;
      edtTran_Observaciones_Internalname = "TRAN_OBSERVACIONES_"+sGXsfl_168_fel_idx ;
      edtTran_AreadanteCodigo_Internalname = "TRAN_AREADANTECODIGO_"+sGXsfl_168_fel_idx ;
      edtTran_CursoCodigo_Internalname = "TRAN_CURSOCODIGO_"+sGXsfl_168_fel_idx ;
      edtTran_NombreIngreso_Internalname = "TRAN_NOMBREINGRESO_"+sGXsfl_168_fel_idx ;
      cmbTran_Estado.setInternalname( "TRAN_ESTADO_"+sGXsfl_168_fel_idx );
      edtTran_IdCuentadanteOrigen_Internalname = "TRAN_IDCUENTADANTEORIGEN_"+sGXsfl_168_fel_idx ;
      edtTran_Id_Internalname = "TRAN_ID_"+sGXsfl_168_fel_idx ;
      edtTran_FechaRatificacion_Internalname = "TRAN_FECHARATIFICACION_"+sGXsfl_168_fel_idx ;
      edtTran_UsuarioRatifica_Internalname = "TRAN_USUARIORATIFICA_"+sGXsfl_168_fel_idx ;
      edtTran_UsuarioId_Internalname = "TRAN_USUARIOID_"+sGXsfl_168_fel_idx ;
      edtTran_UsuarioCodigo_Internalname = "TRAN_USUARIOCODIGO_"+sGXsfl_168_fel_idx ;
      edtTran_UsuarioNombre_Internalname = "TRAN_USUARIONOMBRE_"+sGXsfl_168_fel_idx ;
      edtTran_CentroCostoId_Internalname = "TRAN_CENTROCOSTOID_"+sGXsfl_168_fel_idx ;
      edtTran_CentroCostoDescripcion_Internalname = "TRAN_CENTROCOSTODESCRIPCION_"+sGXsfl_168_fel_idx ;
      edtTran_RegionId_Internalname = "TRAN_REGIONID_"+sGXsfl_168_fel_idx ;
      edtTran_RegionCodigo_Internalname = "TRAN_REGIONCODIGO_"+sGXsfl_168_fel_idx ;
      cmbTran_IndE_S.setInternalname( "TRAN_INDE_S_"+sGXsfl_168_fel_idx );
      edtTran_ValorTransaccion_Internalname = "TRAN_VALORTRANSACCION_"+sGXsfl_168_fel_idx ;
      edtTran_CodTipoElemento_Internalname = "TRAN_CODTIPOELEMENTO_"+sGXsfl_168_fel_idx ;
      cmbTran_TipoElemento.setInternalname( "TRAN_TIPOELEMENTO_"+sGXsfl_168_fel_idx );
      edtTran_NumeroIngreso_Internalname = "TRAN_NUMEROINGRESO_"+sGXsfl_168_fel_idx ;
      edtTran_RegionDescripcionDestino_Internalname = "TRAN_REGIONDESCRIPCIONDESTINO_"+sGXsfl_168_fel_idx ;
      edtTran_CentroCostoIdDestino_Internalname = "TRAN_CENTROCOSTOIDDESTINO_"+sGXsfl_168_fel_idx ;
      edtTran_CentroCostoCodigoDestino_Internalname = "TRAN_CENTROCOSTOCODIGODESTINO_"+sGXsfl_168_fel_idx ;
      edtTran_CentroCostoDescripcionDes_Internalname = "TRAN_CENTROCOSTODESCRIPCIONDES_"+sGXsfl_168_fel_idx ;
      edtTran_RegionIdDestino_Internalname = "TRAN_REGIONIDDESTINO_"+sGXsfl_168_fel_idx ;
      edtTran_RegionCodigoDestino_Internalname = "TRAN_REGIONCODIGODESTINO_"+sGXsfl_168_fel_idx ;
      cmbTran_TipoEntra.setInternalname( "TRAN_TIPOENTRA_"+sGXsfl_168_fel_idx );
      edtTran_CantidadPadres_Internalname = "TRAN_CANTIDADPADRES_"+sGXsfl_168_fel_idx ;
      edtTran_RegionAbrev_Internalname = "TRAN_REGIONABREV_"+sGXsfl_168_fel_idx ;
      edtTran_RegionAbrevDestino_Internalname = "TRAN_REGIONABREVDESTINO_"+sGXsfl_168_fel_idx ;
      edtTran_Detalle_Internalname = "TRAN_DETALLE_"+sGXsfl_168_fel_idx ;
      edtTran_NumeroGrupo_Internalname = "TRAN_NUMEROGRUPO_"+sGXsfl_168_fel_idx ;
   }

   public void sendrow_1682( )
   {
      subsflControlProps_1682( ) ;
      wb7T0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_168_idx <= subgrid_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_168_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_168_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavReporte_Enabled!=0)&&(edtavReporte_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 169,'',false,'',168)\"" : " ") ;
         ClassString = "DisplayAttribute" ;
         StyleString = "" ;
         AV44Reporte_IsBlob = (boolean)(((GXutil.strcmp("", AV44Reporte)==0)&&(GXutil.strcmp("", AV50Reporte_GXI)==0))||!(GXutil.strcmp("", AV44Reporte)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV44Reporte)==0) ? AV50Reporte_GXI : httpContext.getResourceRelative(AV44Reporte)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavReporte_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"",edtavReporte_Tooltiptext,new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(7),edtavReporte_Jsonclick,"'"+""+"'"+",false,"+"'"+"e307t2_client"+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV44Reporte_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavUpdate_Enabled!=0)&&(edtavUpdate_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 170,'',false,'',168)\"" : " ") ;
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV38Update_IsBlob = (boolean)(((GXutil.strcmp("", AV38Update)==0)&&(GXutil.strcmp("", AV51Update_GXI)==0))||!(GXutil.strcmp("", AV38Update)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV38Update)==0) ? AV51Update_GXI : httpContext.getResourceRelative(AV38Update)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavUpdate_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(5),edtavUpdate_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'RATIFICAR\\'."+sGXsfl_168_idx+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV38Update_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_ConsecutivoCC_Internalname,GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_ConsecutivoCC_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(70),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CodigoMovimiento_Internalname,A49Tran_CodigoMovimiento,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CodigoMovimiento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(70),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_DescripcionMovimiento_Internalname,A381Tran_DescripcionMovimiento,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_DescripcionMovimiento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionDescripcion_Internalname,A422Tran_RegionDescripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoCodigo_Internalname,A419Tran_CentroCostoCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(106),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_ModuloOrigen_Internalname,A110Tran_ModuloOrigen,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_ModuloOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(114),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Modulo","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CodAlmaOrigen_Internalname,A109Tran_CodAlmaOrigen,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CodAlmaOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CodBodeOrigen_Internalname,A112Tran_CodBodeOrigen,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CodBodeOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_ModuloDestino_Internalname,A385Tran_ModuloDestino,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_ModuloDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(114),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Modulo","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CodAlmaDestino_Internalname,A111Tran_CodAlmaDestino,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CodAlmaDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CodBodeDestino_Internalname,A387Tran_CodBodeDestino,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CodBodeDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_FechaRegistro_Internalname,localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_FechaRegistro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(122),"px",new Integer(17),"px",new Integer(14),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"FechaHora","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_IdProveedor_Internalname,GXutil.ltrim( localUtil.ntoc( A53Tran_IdProveedor, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A53Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_IdProveedor_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(154),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NombreProveedor_Internalname,A575Tran_NombreProveedor,GXutil.rtrim( localUtil.format( A575Tran_NombreProveedor, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_NombreProveedor_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_IdCuentadanteDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A52Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A52Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_IdCuentadanteDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(154),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NombCuentadanteDestino_Internalname,A389Tran_NombCuentadanteDestino,GXutil.rtrim( localUtil.format( A389Tran_NombCuentadanteDestino, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_NombCuentadanteDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(130),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Observaciones_Internalname,A416Tran_Observaciones,A416Tran_Observaciones,"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_Observaciones_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(2097152),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(0),new Integer(-1),new Boolean(true),"","left",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_AreadanteCodigo_Internalname,A407Tran_AreadanteCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_AreadanteCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(130),"px",new Integer(17),"px",new Integer(20),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CursoCodigo_Internalname,A408Tran_CursoCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CursoCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(256),"px",new Integer(17),"px",new Integer(41),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NombreIngreso_Internalname,A672Tran_NombreIngreso,GXutil.rtrim( localUtil.format( A672Tran_NombreIngreso, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_NombreIngreso_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(90),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( nGXsfl_168_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TRAN_ESTADO_" + sGXsfl_168_idx ;
            cmbTran_Estado.setName( GXCCtl );
            cmbTran_Estado.setWebtags( "" );
            cmbTran_Estado.addItem("A", "Anulado", (short)(0));
            cmbTran_Estado.addItem("R", "Ratificado", (short)(0));
            cmbTran_Estado.addItem("P", "Pendiente", (short)(0));
            cmbTran_Estado.addItem("I", "Incompleto", (short)(0));
            if ( cmbTran_Estado.getItemCount() > 0 )
            {
               A58Tran_Estado = cmbTran_Estado.getValidValue(A58Tran_Estado) ;
               n58Tran_Estado = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTran_Estado,cmbTran_Estado.getInternalname(),GXutil.rtrim( A58Tran_Estado),new Integer(1),cmbTran_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(-1),new Integer(0),new Integer(0),new Integer(0),new Integer(96),"px",new Integer(0),"px","","Attribute","WWColumn","","",new Boolean(true)});
         cmbTran_Estado.setValue( GXutil.rtrim( A58Tran_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_Estado.getInternalname(), "Values", cmbTran_Estado.ToJavascriptSource(), !bGXsfl_168_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_IdCuentadanteOrigen_Internalname,GXutil.ltrim( localUtil.ntoc( A51Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A51Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_IdCuentadanteOrigen_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Id_Internalname,GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_Id_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_FechaRatificacion_Internalname,localUtil.ttoc( A390Tran_FechaRatificacion, 10, 8, 0, 3, "/", ":", " "),localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_FechaRatificacion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_UsuarioRatifica_Internalname,A391Tran_UsuarioRatifica,GXutil.rtrim( localUtil.format( A391Tran_UsuarioRatifica, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_UsuarioRatifica_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Usuario","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_UsuarioId_Internalname,GXutil.ltrim( localUtil.ntoc( A47Tran_UsuarioId, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_UsuarioId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"IdLargo","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_UsuarioCodigo_Internalname,A417Tran_UsuarioCodigo,GXutil.rtrim( localUtil.format( A417Tran_UsuarioCodigo, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_UsuarioCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_UsuarioNombre_Internalname,A418Tran_UsuarioNombre,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_UsuarioNombre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Nombres","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoId_Internalname,GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoDescripcion_Internalname,A420Tran_CentroCostoDescripcion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoDescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionId_Internalname,GXutil.ltrim( localUtil.ntoc( A57Tran_RegionId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionCodigo_Internalname,GXutil.ltrim( localUtil.ntoc( A421Tran_RegionCodigo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A421Tran_RegionCodigo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_168_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TRAN_INDE_S_" + sGXsfl_168_idx ;
            cmbTran_IndE_S.setName( GXCCtl );
            cmbTran_IndE_S.setWebtags( "" );
            cmbTran_IndE_S.addItem("E", "ENTRADA", (short)(0));
            cmbTran_IndE_S.addItem("S", "SALIDA", (short)(0));
            cmbTran_IndE_S.addItem("T", "TRASPASO", (short)(0));
            cmbTran_IndE_S.addItem("R", "RECUPERACIÓN", (short)(0));
            if ( cmbTran_IndE_S.getItemCount() > 0 )
            {
               A481Tran_IndE_S = cmbTran_IndE_S.getValidValue(A481Tran_IndE_S) ;
               n481Tran_IndE_S = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTran_IndE_S,cmbTran_IndE_S.getInternalname(),GXutil.rtrim( A481Tran_IndE_S),new Integer(1),cmbTran_IndE_S.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTran_IndE_S.setValue( GXutil.rtrim( A481Tran_IndE_S) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_IndE_S.getInternalname(), "Values", cmbTran_IndE_S.ToJavascriptSource(), !bGXsfl_168_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_ValorTransaccion_Internalname,GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(24), (byte)(2), ",", "")),localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_ValorTransaccion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CodTipoElemento_Internalname,GXutil.ltrim( localUtil.ntoc( A499Tran_CodTipoElemento, (byte)(18), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A499Tran_CodTipoElemento), "ZZZZZZZZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CodTipoElemento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_168_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TRAN_TIPOELEMENTO_" + sGXsfl_168_idx ;
            cmbTran_TipoElemento.setName( GXCCtl );
            cmbTran_TipoElemento.setWebtags( "" );
            cmbTran_TipoElemento.addItem("C", "Consumo", (short)(0));
            cmbTran_TipoElemento.addItem("D", "Devolutivo", (short)(0));
            if ( cmbTran_TipoElemento.getItemCount() > 0 )
            {
               A482Tran_TipoElemento = cmbTran_TipoElemento.getValidValue(A482Tran_TipoElemento) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTran_TipoElemento,cmbTran_TipoElemento.getInternalname(),GXutil.rtrim( A482Tran_TipoElemento),new Integer(1),cmbTran_TipoElemento.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTran_TipoElemento.setValue( GXutil.rtrim( A482Tran_TipoElemento) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoElemento.getInternalname(), "Values", cmbTran_TipoElemento.ToJavascriptSource(), !bGXsfl_168_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NumeroIngreso_Internalname,GXutil.rtrim( A514Tran_NumeroIngreso),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_NumeroIngreso_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionDescripcionDestino_Internalname,A520Tran_RegionDescripcionDestino,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionDescripcionDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoIdDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A50Tran_CentroCostoIdDestino, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A50Tran_CentroCostoIdDestino), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoIdDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoCodigoDestino_Internalname,A516Tran_CentroCostoCodigoDestino,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoCodigoDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(16),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CentroCostoDescripcionDes_Internalname,A517Tran_CentroCostoDescripcionDes,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CentroCostoDescripcionDes_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Descripcion","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionIdDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A518Tran_RegionIdDestino, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionIdDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionCodigoDestino_Internalname,GXutil.ltrim( localUtil.ntoc( A519Tran_RegionCodigoDestino, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A519Tran_RegionCodigoDestino), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionCodigoDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_168_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "TRAN_TIPOENTRA_" + sGXsfl_168_idx ;
            cmbTran_TipoEntra.setName( GXCCtl );
            cmbTran_TipoEntra.setWebtags( "" );
            if ( cmbTran_TipoEntra.getItemCount() > 0 )
            {
               A527Tran_TipoEntra = cmbTran_TipoEntra.getValidValue(A527Tran_TipoEntra) ;
               n527Tran_TipoEntra = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbTran_TipoEntra,cmbTran_TipoEntra.getInternalname(),GXutil.rtrim( A527Tran_TipoEntra),new Integer(1),cmbTran_TipoEntra.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn WWOptionalColumn","","",new Boolean(true)});
         cmbTran_TipoEntra.setValue( GXutil.rtrim( A527Tran_TipoEntra) );
         httpContext.ajax_rsp_assign_prop("", false, cmbTran_TipoEntra.getInternalname(), "Values", cmbTran_TipoEntra.ToJavascriptSource(), !bGXsfl_168_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_CantidadPadres_Internalname,GXutil.ltrim( localUtil.ntoc( A568Tran_CantidadPadres, (byte)(8), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_CantidadPadres_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionAbrev_Internalname,A594Tran_RegionAbrev,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionAbrev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_RegionAbrevDestino_Internalname,A608Tran_RegionAbrevDestino,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_RegionAbrevDestino_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(15),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_Detalle_Internalname,GXutil.rtrim( A524Tran_Detalle),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_Detalle_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTran_NumeroGrupo_Internalname,GXutil.ltrim( localUtil.ntoc( A667Tran_NumeroGrupo, (byte)(4), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTran_NumeroGrupo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn WWOptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(168),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CONSECUTIVOCC"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( DecimalUtil.doubleToDec(A513Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODIGOMOVIMIENTO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A49Tran_CodigoMovimiento, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_MODULOORIGEN"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A110Tran_ModuloOrigen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODALMAORIGEN"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A109Tran_CodAlmaOrigen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODBODEORIGEN"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A112Tran_CodBodeOrigen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_MODULODESTINO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A385Tran_ModuloDestino, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODALMADESTINO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A111Tran_CodAlmaDestino, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CODBODEDESTINO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A387Tran_CodBodeDestino, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHAREGISTRO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( A55Tran_FechaRegistro, "99/99/99 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_IDPROVEEDOR"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( DecimalUtil.doubleToDec(A53Tran_IdProveedor), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_IDCUENTADANTEDESTINO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( DecimalUtil.doubleToDec(A52Tran_IdCuentadanteDestino), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_OBSERVACIONES"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, A416Tran_Observaciones));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_AREADANTECODIGO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A407Tran_AreadanteCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CURSOCODIGO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A408Tran_CursoCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_ESTADO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A58Tran_Estado, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_IDCUENTADANTEORIGEN"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( DecimalUtil.doubleToDec(A51Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_ID"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( DecimalUtil.doubleToDec(A46Tran_Id), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_FECHARATIFICACION"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( A390Tran_FechaRatificacion, "99/99/9999 99:99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_USUARIORATIFICA"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A391Tran_UsuarioRatifica, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_USUARIOID"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( DecimalUtil.doubleToDec(A47Tran_UsuarioId), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CENTROCOSTOID"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( DecimalUtil.doubleToDec(A48Tran_CentroCostoId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_REGIONID"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( DecimalUtil.doubleToDec(A57Tran_RegionId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_INDE_S"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A481Tran_IndE_S, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_VALORTRANSACCION"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( A483Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_TIPOELEMENTO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A482Tran_TipoElemento, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_NUMEROINGRESO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A514Tran_NumeroIngreso, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CENTROCOSTOIDDESTINO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( DecimalUtil.doubleToDec(A50Tran_CentroCostoIdDestino), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_REGIONIDDESTINO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( DecimalUtil.doubleToDec(A518Tran_RegionIdDestino), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_TIPOENTRA"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A527Tran_TipoEntra, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_CANTIDADPADRES"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( DecimalUtil.doubleToDec(A568Tran_CantidadPadres), "ZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_DETALLE"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, GXutil.rtrim( localUtil.format( A524Tran_Detalle, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_TRAN_NUMEROGRUPO"+"_"+sGXsfl_168_idx, getSecureSignedToken( sGXsfl_168_idx, localUtil.format( DecimalUtil.doubleToDec(A667Tran_NumeroGrupo), "ZZZ9")));
         GridContainer.AddRow(GridRow);
         nGXsfl_168_idx = (short)(((subGrid_Islastpage==1)&&(nGXsfl_168_idx+1>subgrid_recordsperpage( )) ? 1 : nGXsfl_168_idx+1)) ;
         sGXsfl_168_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_168_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1682( ) ;
      }
      /* End function sendrow_1682 */
   }

   public void init_default_properties( )
   {
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      lblTitletext_Internalname = "TITLETEXT" ;
      edtavTran_consecutivocc_Internalname = "vTRAN_CONSECUTIVOCC" ;
      divTabletop_Internalname = "TABLETOP" ;
      lblLbltran_codigomovimientofilter_Internalname = "LBLTRAN_CODIGOMOVIMIENTOFILTER" ;
      edtavTran_codigomovimiento_Internalname = "vTRAN_CODIGOMOVIMIENTO" ;
      divTran_codigomovimientofiltercontainer_Internalname = "TRAN_CODIGOMOVIMIENTOFILTERCONTAINER" ;
      lblLbltran_descripcionmovimientofilter_Internalname = "LBLTRAN_DESCRIPCIONMOVIMIENTOFILTER" ;
      edtavTran_descripcionmovimiento_Internalname = "vTRAN_DESCRIPCIONMOVIMIENTO" ;
      divTran_descripcionmovimientofiltercontainer_Internalname = "TRAN_DESCRIPCIONMOVIMIENTOFILTERCONTAINER" ;
      lblLbltran_regioncodigofilter_Internalname = "LBLTRAN_REGIONCODIGOFILTER" ;
      edtavTran_regioncodigo_Internalname = "vTRAN_REGIONCODIGO" ;
      divTran_regioncodigofiltercontainer_Internalname = "TRAN_REGIONCODIGOFILTERCONTAINER" ;
      lblLbltran_regiondescripcionfilter_Internalname = "LBLTRAN_REGIONDESCRIPCIONFILTER" ;
      edtavTran_regiondescripcion_Internalname = "vTRAN_REGIONDESCRIPCION" ;
      divTran_regiondescripcionfiltercontainer_Internalname = "TRAN_REGIONDESCRIPCIONFILTERCONTAINER" ;
      lblLbltran_centrocostocodigofilter_Internalname = "LBLTRAN_CENTROCOSTOCODIGOFILTER" ;
      edtavTran_centrocostocodigo_Internalname = "vTRAN_CENTROCOSTOCODIGO" ;
      divTran_centrocostocodigofiltercontainer_Internalname = "TRAN_CENTROCOSTOCODIGOFILTERCONTAINER" ;
      lblLbltran_fecharegistrofilter_Internalname = "LBLTRAN_FECHAREGISTROFILTER" ;
      edtavTran_fecharegistro_Internalname = "vTRAN_FECHAREGISTRO" ;
      divTran_fecharegistrofiltercontainer_Internalname = "TRAN_FECHAREGISTROFILTERCONTAINER" ;
      lblLbltran_observacionesfilter_Internalname = "LBLTRAN_OBSERVACIONESFILTER" ;
      edtavTran_observaciones_Internalname = "vTRAN_OBSERVACIONES" ;
      divTran_observacionesfiltercontainer_Internalname = "TRAN_OBSERVACIONESFILTERCONTAINER" ;
      lblLbltran_tipoingresofilter_Internalname = "LBLTRAN_TIPOINGRESOFILTER" ;
      edtavTran_nombreingreso_Internalname = "vTRAN_NOMBREINGRESO" ;
      divTran_tipoingresofiltercontainer_Internalname = "TRAN_TIPOINGRESOFILTERCONTAINER" ;
      lblLbltran_idproveedorfilter_Internalname = "LBLTRAN_IDPROVEEDORFILTER" ;
      edtavTran_idproveedor_Internalname = "vTRAN_IDPROVEEDOR" ;
      divTran_idproveedorfiltercontainer_Internalname = "TRAN_IDPROVEEDORFILTERCONTAINER" ;
      lblLbltran_nombreproveedorfilter_Internalname = "LBLTRAN_NOMBREPROVEEDORFILTER" ;
      edtavProveedor_Internalname = "vPROVEEDOR" ;
      divTran_nombreproveedorfiltercontainer_Internalname = "TRAN_NOMBREPROVEEDORFILTERCONTAINER" ;
      lblLbltran_idcuentadantedestinofilter_Internalname = "LBLTRAN_IDCUENTADANTEDESTINOFILTER" ;
      edtavTran_idcuentadantedestino_Internalname = "vTRAN_IDCUENTADANTEDESTINO" ;
      divTran_idcuentadantedestinofiltercontainer_Internalname = "TRAN_IDCUENTADANTEDESTINOFILTERCONTAINER" ;
      lblLbltran_nombrecuentadantefilter_Internalname = "LBLTRAN_NOMBRECUENTADANTEFILTER" ;
      edtavCuentadante_Internalname = "vCUENTADANTE" ;
      divTran_nombrecuentadantefiltercontainer_Internalname = "TRAN_NOMBRECUENTADANTEFILTERCONTAINER" ;
      lblLbltran_areadantecodigofilter_Internalname = "LBLTRAN_AREADANTECODIGOFILTER" ;
      edtavTran_areadantecodigo_Internalname = "vTRAN_AREADANTECODIGO" ;
      divTran_areadantecodigofiltercontainer_Internalname = "TRAN_AREADANTECODIGOFILTERCONTAINER" ;
      lblLbltran_cursocodigofilter_Internalname = "LBLTRAN_CURSOCODIGOFILTER" ;
      edtavTran_cursocodigo_Internalname = "vTRAN_CURSOCODIGO" ;
      divTran_cursocodigofiltercontainer_Internalname = "TRAN_CURSOCODIGOFILTERCONTAINER" ;
      divFilterscontainer_Internalname = "FILTERSCONTAINER" ;
      edtavReporte_Internalname = "vREPORTE" ;
      edtavUpdate_Internalname = "vUPDATE" ;
      edtTran_ConsecutivoCC_Internalname = "TRAN_CONSECUTIVOCC" ;
      edtTran_CodigoMovimiento_Internalname = "TRAN_CODIGOMOVIMIENTO" ;
      edtTran_DescripcionMovimiento_Internalname = "TRAN_DESCRIPCIONMOVIMIENTO" ;
      edtTran_RegionDescripcion_Internalname = "TRAN_REGIONDESCRIPCION" ;
      edtTran_CentroCostoCodigo_Internalname = "TRAN_CENTROCOSTOCODIGO" ;
      edtTran_ModuloOrigen_Internalname = "TRAN_MODULOORIGEN" ;
      edtTran_CodAlmaOrigen_Internalname = "TRAN_CODALMAORIGEN" ;
      edtTran_CodBodeOrigen_Internalname = "TRAN_CODBODEORIGEN" ;
      edtTran_ModuloDestino_Internalname = "TRAN_MODULODESTINO" ;
      edtTran_CodAlmaDestino_Internalname = "TRAN_CODALMADESTINO" ;
      edtTran_CodBodeDestino_Internalname = "TRAN_CODBODEDESTINO" ;
      edtTran_FechaRegistro_Internalname = "TRAN_FECHAREGISTRO" ;
      edtTran_IdProveedor_Internalname = "TRAN_IDPROVEEDOR" ;
      edtTran_NombreProveedor_Internalname = "TRAN_NOMBREPROVEEDOR" ;
      edtTran_IdCuentadanteDestino_Internalname = "TRAN_IDCUENTADANTEDESTINO" ;
      edtTran_NombCuentadanteDestino_Internalname = "TRAN_NOMBCUENTADANTEDESTINO" ;
      edtTran_Observaciones_Internalname = "TRAN_OBSERVACIONES" ;
      edtTran_AreadanteCodigo_Internalname = "TRAN_AREADANTECODIGO" ;
      edtTran_CursoCodigo_Internalname = "TRAN_CURSOCODIGO" ;
      edtTran_NombreIngreso_Internalname = "TRAN_NOMBREINGRESO" ;
      cmbTran_Estado.setInternalname( "TRAN_ESTADO" );
      edtTran_IdCuentadanteOrigen_Internalname = "TRAN_IDCUENTADANTEORIGEN" ;
      edtTran_Id_Internalname = "TRAN_ID" ;
      edtTran_FechaRatificacion_Internalname = "TRAN_FECHARATIFICACION" ;
      edtTran_UsuarioRatifica_Internalname = "TRAN_USUARIORATIFICA" ;
      edtTran_UsuarioId_Internalname = "TRAN_USUARIOID" ;
      edtTran_UsuarioCodigo_Internalname = "TRAN_USUARIOCODIGO" ;
      edtTran_UsuarioNombre_Internalname = "TRAN_USUARIONOMBRE" ;
      edtTran_CentroCostoId_Internalname = "TRAN_CENTROCOSTOID" ;
      edtTran_CentroCostoDescripcion_Internalname = "TRAN_CENTROCOSTODESCRIPCION" ;
      edtTran_RegionId_Internalname = "TRAN_REGIONID" ;
      edtTran_RegionCodigo_Internalname = "TRAN_REGIONCODIGO" ;
      cmbTran_IndE_S.setInternalname( "TRAN_INDE_S" );
      edtTran_ValorTransaccion_Internalname = "TRAN_VALORTRANSACCION" ;
      edtTran_CodTipoElemento_Internalname = "TRAN_CODTIPOELEMENTO" ;
      cmbTran_TipoElemento.setInternalname( "TRAN_TIPOELEMENTO" );
      edtTran_NumeroIngreso_Internalname = "TRAN_NUMEROINGRESO" ;
      edtTran_RegionDescripcionDestino_Internalname = "TRAN_REGIONDESCRIPCIONDESTINO" ;
      edtTran_CentroCostoIdDestino_Internalname = "TRAN_CENTROCOSTOIDDESTINO" ;
      edtTran_CentroCostoCodigoDestino_Internalname = "TRAN_CENTROCOSTOCODIGODESTINO" ;
      edtTran_CentroCostoDescripcionDes_Internalname = "TRAN_CENTROCOSTODESCRIPCIONDES" ;
      edtTran_RegionIdDestino_Internalname = "TRAN_REGIONIDDESTINO" ;
      edtTran_RegionCodigoDestino_Internalname = "TRAN_REGIONCODIGODESTINO" ;
      cmbTran_TipoEntra.setInternalname( "TRAN_TIPOENTRA" );
      edtTran_CantidadPadres_Internalname = "TRAN_CANTIDADPADRES" ;
      edtTran_RegionAbrev_Internalname = "TRAN_REGIONABREV" ;
      edtTran_RegionAbrevDestino_Internalname = "TRAN_REGIONABREVDESTINO" ;
      edtTran_Detalle_Internalname = "TRAN_DETALLE" ;
      edtTran_NumeroGrupo_Internalname = "TRAN_NUMEROGRUPO" ;
      divSection1_Internalname = "SECTION1" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divGridcell_Internalname = "GRIDCELL" ;
      Alertify1_Internalname = "ALERTIFY1" ;
      lblUrl_Internalname = "URL" ;
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
      edtTran_NumeroGrupo_Jsonclick = "" ;
      edtTran_Detalle_Jsonclick = "" ;
      edtTran_RegionAbrevDestino_Jsonclick = "" ;
      edtTran_RegionAbrev_Jsonclick = "" ;
      edtTran_CantidadPadres_Jsonclick = "" ;
      cmbTran_TipoEntra.setJsonclick( "" );
      edtTran_RegionCodigoDestino_Jsonclick = "" ;
      edtTran_RegionIdDestino_Jsonclick = "" ;
      edtTran_CentroCostoDescripcionDes_Jsonclick = "" ;
      edtTran_CentroCostoCodigoDestino_Jsonclick = "" ;
      edtTran_CentroCostoIdDestino_Jsonclick = "" ;
      edtTran_RegionDescripcionDestino_Jsonclick = "" ;
      edtTran_NumeroIngreso_Jsonclick = "" ;
      cmbTran_TipoElemento.setJsonclick( "" );
      edtTran_CodTipoElemento_Jsonclick = "" ;
      edtTran_ValorTransaccion_Jsonclick = "" ;
      cmbTran_IndE_S.setJsonclick( "" );
      edtTran_RegionCodigo_Jsonclick = "" ;
      edtTran_RegionId_Jsonclick = "" ;
      edtTran_CentroCostoDescripcion_Jsonclick = "" ;
      edtTran_CentroCostoId_Jsonclick = "" ;
      edtTran_UsuarioNombre_Jsonclick = "" ;
      edtTran_UsuarioCodigo_Jsonclick = "" ;
      edtTran_UsuarioId_Jsonclick = "" ;
      edtTran_UsuarioRatifica_Jsonclick = "" ;
      edtTran_FechaRatificacion_Jsonclick = "" ;
      edtTran_Id_Jsonclick = "" ;
      edtTran_IdCuentadanteOrigen_Jsonclick = "" ;
      cmbTran_Estado.setJsonclick( "" );
      edtTran_NombreIngreso_Jsonclick = "" ;
      edtTran_CursoCodigo_Jsonclick = "" ;
      edtTran_AreadanteCodigo_Jsonclick = "" ;
      edtTran_Observaciones_Jsonclick = "" ;
      edtTran_NombCuentadanteDestino_Jsonclick = "" ;
      edtTran_IdCuentadanteDestino_Jsonclick = "" ;
      edtTran_NombreProveedor_Jsonclick = "" ;
      edtTran_IdProveedor_Jsonclick = "" ;
      edtTran_FechaRegistro_Jsonclick = "" ;
      edtTran_CodBodeDestino_Jsonclick = "" ;
      edtTran_CodAlmaDestino_Jsonclick = "" ;
      edtTran_ModuloDestino_Jsonclick = "" ;
      edtTran_CodBodeOrigen_Jsonclick = "" ;
      edtTran_CodAlmaOrigen_Jsonclick = "" ;
      edtTran_ModuloOrigen_Jsonclick = "" ;
      edtTran_CentroCostoCodigo_Jsonclick = "" ;
      edtTran_RegionDescripcion_Jsonclick = "" ;
      edtTran_DescripcionMovimiento_Jsonclick = "" ;
      edtTran_CodigoMovimiento_Jsonclick = "" ;
      edtTran_ConsecutivoCC_Jsonclick = "" ;
      edtavUpdate_Jsonclick = "" ;
      edtavUpdate_Visible = -1 ;
      edtavUpdate_Enabled = 1 ;
      edtavReporte_Jsonclick = "" ;
      edtavReporte_Visible = -1 ;
      edtavReporte_Enabled = 1 ;
      lblUrl_Caption = "" ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      divGridcell_Class = "col-xs-12 col-sm-9 col-md-10 WWGridCell" ;
      edtavTran_cursocodigo_Jsonclick = "" ;
      edtavTran_cursocodigo_Enabled = 1 ;
      edtavTran_cursocodigo_Visible = 1 ;
      lblLbltran_cursocodigofilter_Caption = "Curso" ;
      edtavTran_areadantecodigo_Jsonclick = "" ;
      edtavTran_areadantecodigo_Enabled = 1 ;
      edtavTran_areadantecodigo_Visible = 1 ;
      lblLbltran_areadantecodigofilter_Caption = "Areadante" ;
      edtavCuentadante_Jsonclick = "" ;
      edtavCuentadante_Enabled = 1 ;
      edtavCuentadante_Visible = 1 ;
      lblLbltran_nombrecuentadantefilter_Caption = "Nombre Cuentadante" ;
      edtavTran_idcuentadantedestino_Jsonclick = "" ;
      edtavTran_idcuentadantedestino_Enabled = 1 ;
      edtavTran_idcuentadantedestino_Visible = 1 ;
      lblLbltran_idcuentadantedestinofilter_Caption = "Cédula Cuentadante" ;
      edtavProveedor_Jsonclick = "" ;
      edtavProveedor_Enabled = 1 ;
      edtavProveedor_Visible = 1 ;
      lblLbltran_nombreproveedorfilter_Caption = "Nombre Proveedor" ;
      edtavTran_idproveedor_Jsonclick = "" ;
      edtavTran_idproveedor_Enabled = 1 ;
      edtavTran_idproveedor_Visible = 1 ;
      lblLbltran_idproveedorfilter_Caption = "Nit Proveedor" ;
      edtavTran_nombreingreso_Jsonclick = "" ;
      edtavTran_nombreingreso_Enabled = 1 ;
      edtavTran_nombreingreso_Visible = 1 ;
      lblLbltran_tipoingresofilter_Caption = "Tipo de Ingreso" ;
      edtavTran_observaciones_Enabled = 1 ;
      edtavTran_observaciones_Visible = 1 ;
      lblLbltran_observacionesfilter_Caption = "Observaciones" ;
      edtavTran_fecharegistro_Jsonclick = "" ;
      edtavTran_fecharegistro_Enabled = 1 ;
      lblLbltran_fecharegistrofilter_Caption = "Fecha de Registro" ;
      edtavTran_centrocostocodigo_Jsonclick = "" ;
      edtavTran_centrocostocodigo_Enabled = 1 ;
      edtavTran_centrocostocodigo_Visible = 1 ;
      edtavTran_regiondescripcion_Jsonclick = "" ;
      edtavTran_regiondescripcion_Enabled = 1 ;
      edtavTran_regiondescripcion_Visible = 1 ;
      edtavTran_regioncodigo_Jsonclick = "" ;
      edtavTran_regioncodigo_Enabled = 1 ;
      edtavTran_regioncodigo_Visible = 1 ;
      edtavTran_descripcionmovimiento_Jsonclick = "" ;
      edtavTran_descripcionmovimiento_Enabled = 1 ;
      edtavTran_descripcionmovimiento_Visible = 1 ;
      lblLbltran_descripcionmovimientofilter_Caption = "Descripcion Movimiento" ;
      edtavTran_codigomovimiento_Jsonclick = "" ;
      edtavTran_codigomovimiento_Enabled = 1 ;
      edtavTran_codigomovimiento_Visible = 1 ;
      lblLbltran_codigomovimientofilter_Caption = "Código Movimiento" ;
      edtavTran_consecutivocc_Jsonclick = "" ;
      edtavTran_consecutivocc_Enabled = 1 ;
      bttBtntoggle_Class = "HideFiltersButton" ;
      bttBtntoggle_Caption = "Otros Filtros" ;
      divTran_cursocodigofiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_areadantecodigofiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_nombrecuentadantefiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_idcuentadantedestinofiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_nombreproveedorfiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_idproveedorfiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_tipoingresofiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_observacionesfiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_fecharegistrofiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_centrocostocodigofiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_regiondescripcionfiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_regioncodigofiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_descripcionmovimientofiltercontainer_Class = "AdvancedContainerItem" ;
      divTran_codigomovimientofiltercontainer_Class = "AdvancedContainerItem" ;
      divFilterscontainer_Class = "AdvancedContainer" ;
      Alertify1_Promptplaceholder = "" ;
      Alertify1_Textcancel = "Cancelar" ;
      Alertify1_Textok = "Confirmar" ;
      Alertify1_Textmessage = "" ;
      Alertify1_Type = "confirm" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Ratificar" );
      subGrid_Rows = 0 ;
      edtavReporte_Tooltiptext = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV43Tran_RegionCodigo',fld:'vTRAN_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV42Tran_RegionDescripcion',fld:'vTRAN_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV25Tran_CentroCostoCodigo',fld:'vTRAN_CENTROCOSTOCODIGO',pic:'',nv:''},{av:'AV33Tran_NombreIngreso',fld:'vTRAN_NOMBREINGRESO',pic:'@!',nv:''},{av:'AV44Reporte',fld:'vREPORTE',pic:'',nv:''},{av:'edtavReporte_Tooltiptext',ctrl:'vREPORTE',prop:'Tooltiptext'},{av:'AV38Update',fld:'vUPDATE',pic:'',nv:''},{av:'A50Tran_CentroCostoIdDestino',fld:'TRAN_CENTROCOSTOIDDESTINO',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Usua_Id',fld:'vUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV5Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV26Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV8ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV29Tran_DescripcionMovimiento',fld:'vTRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'AV30Tran_FechaRegistro',fld:'vTRAN_FECHAREGISTRO',pic:'',nv:''},{av:'AV34Tran_Observaciones',fld:'vTRAN_OBSERVACIONES',pic:'',nv:''},{av:'AV35Tran_TipoIngreso',fld:'vTRAN_TIPOINGRESO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV32Tran_IdProveedor',fld:'vTRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Proveedor',fld:'vPROVEEDOR',pic:'',nv:''},{av:'AV31Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12Cuentadante',fld:'vCUENTADANTE',pic:'',nv:''},{av:'AV24Tran_AreadanteCodigo',fld:'vTRAN_AREADANTECODIGO',pic:'',nv:''},{av:'AV28Tran_CursoCodigo',fld:'vTRAN_CURSOCODIGO',pic:'',nv:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV27Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'lblLbltran_codigomovimientofilter_Caption',ctrl:'LBLTRAN_CODIGOMOVIMIENTOFILTER',prop:'Caption'},{av:'lblLbltran_descripcionmovimientofilter_Caption',ctrl:'LBLTRAN_DESCRIPCIONMOVIMIENTOFILTER',prop:'Caption'},{av:'lblLbltran_fecharegistrofilter_Caption',ctrl:'LBLTRAN_FECHAREGISTROFILTER',prop:'Caption'},{av:'lblLbltran_observacionesfilter_Caption',ctrl:'LBLTRAN_OBSERVACIONESFILTER',prop:'Caption'},{av:'lblLbltran_tipoingresofilter_Caption',ctrl:'LBLTRAN_TIPOINGRESOFILTER',prop:'Caption'},{av:'lblLbltran_idproveedorfilter_Caption',ctrl:'LBLTRAN_IDPROVEEDORFILTER',prop:'Caption'},{av:'lblLbltran_nombreproveedorfilter_Caption',ctrl:'LBLTRAN_NOMBREPROVEEDORFILTER',prop:'Caption'},{av:'lblLbltran_idcuentadantedestinofilter_Caption',ctrl:'LBLTRAN_IDCUENTADANTEDESTINOFILTER',prop:'Caption'},{av:'lblLbltran_nombrecuentadantefilter_Caption',ctrl:'LBLTRAN_NOMBRECUENTADANTEFILTER',prop:'Caption'},{av:'lblLbltran_areadantecodigofilter_Caption',ctrl:'LBLTRAN_AREADANTECODIGOFILTER',prop:'Caption'},{av:'lblLbltran_cursocodigofilter_Caption',ctrl:'LBLTRAN_CURSOCODIGOFILTER',prop:'Caption'}]}");
      setEventMetadata("'TOGGLE'","{handler:'e117T1',iparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'}],oparms:[{av:'divFilterscontainer_Class',ctrl:'FILTERSCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Caption'},{av:'divGridcell_Class',ctrl:'GRIDCELL',prop:'Class'}]}");
      setEventMetadata("LBLTRAN_CODIGOMOVIMIENTOFILTER.CLICK","{handler:'e127T1',iparms:[{av:'divTran_codigomovimientofiltercontainer_Class',ctrl:'TRAN_CODIGOMOVIMIENTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_codigomovimientofiltercontainer_Class',ctrl:'TRAN_CODIGOMOVIMIENTOFILTERCONTAINER',prop:'Class'},{av:'edtavTran_codigomovimiento_Visible',ctrl:'vTRAN_CODIGOMOVIMIENTO',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_DESCRIPCIONMOVIMIENTOFILTER.CLICK","{handler:'e137T1',iparms:[{av:'divTran_descripcionmovimientofiltercontainer_Class',ctrl:'TRAN_DESCRIPCIONMOVIMIENTOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_descripcionmovimientofiltercontainer_Class',ctrl:'TRAN_DESCRIPCIONMOVIMIENTOFILTERCONTAINER',prop:'Class'},{av:'edtavTran_descripcionmovimiento_Visible',ctrl:'vTRAN_DESCRIPCIONMOVIMIENTO',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_REGIONCODIGOFILTER.CLICK","{handler:'e147T1',iparms:[{av:'divTran_regioncodigofiltercontainer_Class',ctrl:'TRAN_REGIONCODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_regioncodigofiltercontainer_Class',ctrl:'TRAN_REGIONCODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavTran_regioncodigo_Visible',ctrl:'vTRAN_REGIONCODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_REGIONDESCRIPCIONFILTER.CLICK","{handler:'e157T1',iparms:[{av:'divTran_regiondescripcionfiltercontainer_Class',ctrl:'TRAN_REGIONDESCRIPCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_regiondescripcionfiltercontainer_Class',ctrl:'TRAN_REGIONDESCRIPCIONFILTERCONTAINER',prop:'Class'},{av:'edtavTran_regiondescripcion_Visible',ctrl:'vTRAN_REGIONDESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_CENTROCOSTOCODIGOFILTER.CLICK","{handler:'e167T1',iparms:[{av:'divTran_centrocostocodigofiltercontainer_Class',ctrl:'TRAN_CENTROCOSTOCODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_centrocostocodigofiltercontainer_Class',ctrl:'TRAN_CENTROCOSTOCODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavTran_centrocostocodigo_Visible',ctrl:'vTRAN_CENTROCOSTOCODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_FECHAREGISTROFILTER.CLICK","{handler:'e177T1',iparms:[{av:'divTran_fecharegistrofiltercontainer_Class',ctrl:'TRAN_FECHAREGISTROFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_fecharegistrofiltercontainer_Class',ctrl:'TRAN_FECHAREGISTROFILTERCONTAINER',prop:'Class'}]}");
      setEventMetadata("LBLTRAN_OBSERVACIONESFILTER.CLICK","{handler:'e187T1',iparms:[{av:'divTran_observacionesfiltercontainer_Class',ctrl:'TRAN_OBSERVACIONESFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_observacionesfiltercontainer_Class',ctrl:'TRAN_OBSERVACIONESFILTERCONTAINER',prop:'Class'},{av:'edtavTran_observaciones_Visible',ctrl:'vTRAN_OBSERVACIONES',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_TIPOINGRESOFILTER.CLICK","{handler:'e197T1',iparms:[{av:'divTran_tipoingresofiltercontainer_Class',ctrl:'TRAN_TIPOINGRESOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_tipoingresofiltercontainer_Class',ctrl:'TRAN_TIPOINGRESOFILTERCONTAINER',prop:'Class'},{av:'edtavTran_nombreingreso_Visible',ctrl:'vTRAN_NOMBREINGRESO',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_IDPROVEEDORFILTER.CLICK","{handler:'e207T1',iparms:[{av:'divTran_idproveedorfiltercontainer_Class',ctrl:'TRAN_IDPROVEEDORFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_idproveedorfiltercontainer_Class',ctrl:'TRAN_IDPROVEEDORFILTERCONTAINER',prop:'Class'},{av:'edtavTran_idproveedor_Visible',ctrl:'vTRAN_IDPROVEEDOR',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_NOMBREPROVEEDORFILTER.CLICK","{handler:'e217T1',iparms:[{av:'divTran_nombreproveedorfiltercontainer_Class',ctrl:'TRAN_NOMBREPROVEEDORFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_nombreproveedorfiltercontainer_Class',ctrl:'TRAN_NOMBREPROVEEDORFILTERCONTAINER',prop:'Class'},{av:'edtavProveedor_Visible',ctrl:'vPROVEEDOR',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_IDCUENTADANTEDESTINOFILTER.CLICK","{handler:'e227T1',iparms:[{av:'divTran_idcuentadantedestinofiltercontainer_Class',ctrl:'TRAN_IDCUENTADANTEDESTINOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_idcuentadantedestinofiltercontainer_Class',ctrl:'TRAN_IDCUENTADANTEDESTINOFILTERCONTAINER',prop:'Class'},{av:'edtavTran_idcuentadantedestino_Visible',ctrl:'vTRAN_IDCUENTADANTEDESTINO',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_NOMBRECUENTADANTEFILTER.CLICK","{handler:'e237T1',iparms:[{av:'divTran_nombrecuentadantefiltercontainer_Class',ctrl:'TRAN_NOMBRECUENTADANTEFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_nombrecuentadantefiltercontainer_Class',ctrl:'TRAN_NOMBRECUENTADANTEFILTERCONTAINER',prop:'Class'},{av:'edtavCuentadante_Visible',ctrl:'vCUENTADANTE',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_AREADANTECODIGOFILTER.CLICK","{handler:'e247T1',iparms:[{av:'divTran_areadantecodigofiltercontainer_Class',ctrl:'TRAN_AREADANTECODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_areadantecodigofiltercontainer_Class',ctrl:'TRAN_AREADANTECODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavTran_areadantecodigo_Visible',ctrl:'vTRAN_AREADANTECODIGO',prop:'Visible'}]}");
      setEventMetadata("LBLTRAN_CURSOCODIGOFILTER.CLICK","{handler:'e257T1',iparms:[{av:'divTran_cursocodigofiltercontainer_Class',ctrl:'TRAN_CURSOCODIGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTran_cursocodigofiltercontainer_Class',ctrl:'TRAN_CURSOCODIGOFILTERCONTAINER',prop:'Class'},{av:'edtavTran_cursocodigo_Visible',ctrl:'vTRAN_CURSOCODIGO',prop:'Visible'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e287T2',iparms:[{av:'A50Tran_CentroCostoIdDestino',fld:'TRAN_CENTROCOSTOIDDESTINO',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Usua_Id',fld:'vUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV5Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV29Tran_DescripcionMovimiento',fld:'vTRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'AV42Tran_RegionDescripcion',fld:'vTRAN_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV25Tran_CentroCostoCodigo',fld:'vTRAN_CENTROCOSTOCODIGO',pic:'',nv:''},{av:'AV30Tran_FechaRegistro',fld:'vTRAN_FECHAREGISTRO',pic:'',nv:''},{av:'AV34Tran_Observaciones',fld:'vTRAN_OBSERVACIONES',pic:'',nv:''},{av:'AV21Proveedor',fld:'vPROVEEDOR',pic:'',nv:''},{av:'AV12Cuentadante',fld:'vCUENTADANTE',pic:'',nv:''},{av:'AV33Tran_NombreIngreso',fld:'vTRAN_NOMBREINGRESO',pic:'@!',nv:''}],oparms:[{av:'AV5Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'RATIFICAR'","{handler:'e297T2',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV27Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV26Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV29Tran_DescripcionMovimiento',fld:'vTRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'AV43Tran_RegionCodigo',fld:'vTRAN_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV42Tran_RegionDescripcion',fld:'vTRAN_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV25Tran_CentroCostoCodigo',fld:'vTRAN_CENTROCOSTOCODIGO',pic:'',nv:''},{av:'AV30Tran_FechaRegistro',fld:'vTRAN_FECHAREGISTRO',pic:'',nv:''},{av:'AV34Tran_Observaciones',fld:'vTRAN_OBSERVACIONES',pic:'',nv:''},{av:'AV33Tran_NombreIngreso',fld:'vTRAN_NOMBREINGRESO',pic:'@!',nv:''},{av:'AV32Tran_IdProveedor',fld:'vTRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Proveedor',fld:'vPROVEEDOR',pic:'',nv:''},{av:'AV31Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12Cuentadante',fld:'vCUENTADANTE',pic:'',nv:''},{av:'AV24Tran_AreadanteCodigo',fld:'vTRAN_AREADANTECODIGO',pic:'',nv:''},{av:'AV28Tran_CursoCodigo',fld:'vTRAN_CURSOCODIGO',pic:'',nv:''},{av:'AV35Tran_TipoIngreso',fld:'vTRAN_TIPOINGRESO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV44Reporte',fld:'vREPORTE',pic:'',nv:''},{av:'edtavReporte_Tooltiptext',ctrl:'vREPORTE',prop:'Tooltiptext'},{av:'AV38Update',fld:'vUPDATE',pic:'',nv:''},{av:'AV8ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'A50Tran_CentroCostoIdDestino',fld:'TRAN_CENTROCOSTOIDDESTINO',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Usua_Id',fld:'vUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV5Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}]}");
      setEventMetadata("'REPORTE'","{handler:'e307T2',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0}],oparms:[{av:'lblUrl_Caption',ctrl:'URL',prop:'Caption'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV43Tran_RegionCodigo',fld:'vTRAN_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV42Tran_RegionDescripcion',fld:'vTRAN_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV25Tran_CentroCostoCodigo',fld:'vTRAN_CENTROCOSTOCODIGO',pic:'',nv:''},{av:'AV33Tran_NombreIngreso',fld:'vTRAN_NOMBREINGRESO',pic:'@!',nv:''},{av:'AV44Reporte',fld:'vREPORTE',pic:'',nv:''},{av:'edtavReporte_Tooltiptext',ctrl:'vREPORTE',prop:'Tooltiptext'},{av:'AV38Update',fld:'vUPDATE',pic:'',nv:''},{av:'A50Tran_CentroCostoIdDestino',fld:'TRAN_CENTROCOSTOIDDESTINO',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Usua_Id',fld:'vUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV5Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV26Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV8ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV29Tran_DescripcionMovimiento',fld:'vTRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'AV30Tran_FechaRegistro',fld:'vTRAN_FECHAREGISTRO',pic:'',nv:''},{av:'AV34Tran_Observaciones',fld:'vTRAN_OBSERVACIONES',pic:'',nv:''},{av:'AV35Tran_TipoIngreso',fld:'vTRAN_TIPOINGRESO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV32Tran_IdProveedor',fld:'vTRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Proveedor',fld:'vPROVEEDOR',pic:'',nv:''},{av:'AV31Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12Cuentadante',fld:'vCUENTADANTE',pic:'',nv:''},{av:'AV24Tran_AreadanteCodigo',fld:'vTRAN_AREADANTECODIGO',pic:'',nv:''},{av:'AV28Tran_CursoCodigo',fld:'vTRAN_CURSOCODIGO',pic:'',nv:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV27Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'lblLbltran_codigomovimientofilter_Caption',ctrl:'LBLTRAN_CODIGOMOVIMIENTOFILTER',prop:'Caption'},{av:'lblLbltran_descripcionmovimientofilter_Caption',ctrl:'LBLTRAN_DESCRIPCIONMOVIMIENTOFILTER',prop:'Caption'},{av:'lblLbltran_fecharegistrofilter_Caption',ctrl:'LBLTRAN_FECHAREGISTROFILTER',prop:'Caption'},{av:'lblLbltran_observacionesfilter_Caption',ctrl:'LBLTRAN_OBSERVACIONESFILTER',prop:'Caption'},{av:'lblLbltran_tipoingresofilter_Caption',ctrl:'LBLTRAN_TIPOINGRESOFILTER',prop:'Caption'},{av:'lblLbltran_idproveedorfilter_Caption',ctrl:'LBLTRAN_IDPROVEEDORFILTER',prop:'Caption'},{av:'lblLbltran_nombreproveedorfilter_Caption',ctrl:'LBLTRAN_NOMBREPROVEEDORFILTER',prop:'Caption'},{av:'lblLbltran_idcuentadantedestinofilter_Caption',ctrl:'LBLTRAN_IDCUENTADANTEDESTINOFILTER',prop:'Caption'},{av:'lblLbltran_nombrecuentadantefilter_Caption',ctrl:'LBLTRAN_NOMBRECUENTADANTEFILTER',prop:'Caption'},{av:'lblLbltran_areadantecodigofilter_Caption',ctrl:'LBLTRAN_AREADANTECODIGOFILTER',prop:'Caption'},{av:'lblLbltran_cursocodigofilter_Caption',ctrl:'LBLTRAN_CURSOCODIGOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV43Tran_RegionCodigo',fld:'vTRAN_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV42Tran_RegionDescripcion',fld:'vTRAN_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV25Tran_CentroCostoCodigo',fld:'vTRAN_CENTROCOSTOCODIGO',pic:'',nv:''},{av:'AV33Tran_NombreIngreso',fld:'vTRAN_NOMBREINGRESO',pic:'@!',nv:''},{av:'AV44Reporte',fld:'vREPORTE',pic:'',nv:''},{av:'edtavReporte_Tooltiptext',ctrl:'vREPORTE',prop:'Tooltiptext'},{av:'AV38Update',fld:'vUPDATE',pic:'',nv:''},{av:'A50Tran_CentroCostoIdDestino',fld:'TRAN_CENTROCOSTOIDDESTINO',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Usua_Id',fld:'vUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV5Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV26Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV8ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV29Tran_DescripcionMovimiento',fld:'vTRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'AV30Tran_FechaRegistro',fld:'vTRAN_FECHAREGISTRO',pic:'',nv:''},{av:'AV34Tran_Observaciones',fld:'vTRAN_OBSERVACIONES',pic:'',nv:''},{av:'AV35Tran_TipoIngreso',fld:'vTRAN_TIPOINGRESO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV32Tran_IdProveedor',fld:'vTRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Proveedor',fld:'vPROVEEDOR',pic:'',nv:''},{av:'AV31Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12Cuentadante',fld:'vCUENTADANTE',pic:'',nv:''},{av:'AV24Tran_AreadanteCodigo',fld:'vTRAN_AREADANTECODIGO',pic:'',nv:''},{av:'AV28Tran_CursoCodigo',fld:'vTRAN_CURSOCODIGO',pic:'',nv:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV27Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'lblLbltran_codigomovimientofilter_Caption',ctrl:'LBLTRAN_CODIGOMOVIMIENTOFILTER',prop:'Caption'},{av:'lblLbltran_descripcionmovimientofilter_Caption',ctrl:'LBLTRAN_DESCRIPCIONMOVIMIENTOFILTER',prop:'Caption'},{av:'lblLbltran_fecharegistrofilter_Caption',ctrl:'LBLTRAN_FECHAREGISTROFILTER',prop:'Caption'},{av:'lblLbltran_observacionesfilter_Caption',ctrl:'LBLTRAN_OBSERVACIONESFILTER',prop:'Caption'},{av:'lblLbltran_tipoingresofilter_Caption',ctrl:'LBLTRAN_TIPOINGRESOFILTER',prop:'Caption'},{av:'lblLbltran_idproveedorfilter_Caption',ctrl:'LBLTRAN_IDPROVEEDORFILTER',prop:'Caption'},{av:'lblLbltran_nombreproveedorfilter_Caption',ctrl:'LBLTRAN_NOMBREPROVEEDORFILTER',prop:'Caption'},{av:'lblLbltran_idcuentadantedestinofilter_Caption',ctrl:'LBLTRAN_IDCUENTADANTEDESTINOFILTER',prop:'Caption'},{av:'lblLbltran_nombrecuentadantefilter_Caption',ctrl:'LBLTRAN_NOMBRECUENTADANTEFILTER',prop:'Caption'},{av:'lblLbltran_areadantecodigofilter_Caption',ctrl:'LBLTRAN_AREADANTECODIGOFILTER',prop:'Caption'},{av:'lblLbltran_cursocodigofilter_Caption',ctrl:'LBLTRAN_CURSOCODIGOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV43Tran_RegionCodigo',fld:'vTRAN_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV42Tran_RegionDescripcion',fld:'vTRAN_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV25Tran_CentroCostoCodigo',fld:'vTRAN_CENTROCOSTOCODIGO',pic:'',nv:''},{av:'AV33Tran_NombreIngreso',fld:'vTRAN_NOMBREINGRESO',pic:'@!',nv:''},{av:'AV44Reporte',fld:'vREPORTE',pic:'',nv:''},{av:'edtavReporte_Tooltiptext',ctrl:'vREPORTE',prop:'Tooltiptext'},{av:'AV38Update',fld:'vUPDATE',pic:'',nv:''},{av:'A50Tran_CentroCostoIdDestino',fld:'TRAN_CENTROCOSTOIDDESTINO',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Usua_Id',fld:'vUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV5Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV26Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV8ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV29Tran_DescripcionMovimiento',fld:'vTRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'AV30Tran_FechaRegistro',fld:'vTRAN_FECHAREGISTRO',pic:'',nv:''},{av:'AV34Tran_Observaciones',fld:'vTRAN_OBSERVACIONES',pic:'',nv:''},{av:'AV35Tran_TipoIngreso',fld:'vTRAN_TIPOINGRESO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV32Tran_IdProveedor',fld:'vTRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Proveedor',fld:'vPROVEEDOR',pic:'',nv:''},{av:'AV31Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12Cuentadante',fld:'vCUENTADANTE',pic:'',nv:''},{av:'AV24Tran_AreadanteCodigo',fld:'vTRAN_AREADANTECODIGO',pic:'',nv:''},{av:'AV28Tran_CursoCodigo',fld:'vTRAN_CURSOCODIGO',pic:'',nv:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV27Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'lblLbltran_codigomovimientofilter_Caption',ctrl:'LBLTRAN_CODIGOMOVIMIENTOFILTER',prop:'Caption'},{av:'lblLbltran_descripcionmovimientofilter_Caption',ctrl:'LBLTRAN_DESCRIPCIONMOVIMIENTOFILTER',prop:'Caption'},{av:'lblLbltran_fecharegistrofilter_Caption',ctrl:'LBLTRAN_FECHAREGISTROFILTER',prop:'Caption'},{av:'lblLbltran_observacionesfilter_Caption',ctrl:'LBLTRAN_OBSERVACIONESFILTER',prop:'Caption'},{av:'lblLbltran_tipoingresofilter_Caption',ctrl:'LBLTRAN_TIPOINGRESOFILTER',prop:'Caption'},{av:'lblLbltran_idproveedorfilter_Caption',ctrl:'LBLTRAN_IDPROVEEDORFILTER',prop:'Caption'},{av:'lblLbltran_nombreproveedorfilter_Caption',ctrl:'LBLTRAN_NOMBREPROVEEDORFILTER',prop:'Caption'},{av:'lblLbltran_idcuentadantedestinofilter_Caption',ctrl:'LBLTRAN_IDCUENTADANTEDESTINOFILTER',prop:'Caption'},{av:'lblLbltran_nombrecuentadantefilter_Caption',ctrl:'LBLTRAN_NOMBRECUENTADANTEFILTER',prop:'Caption'},{av:'lblLbltran_areadantecodigofilter_Caption',ctrl:'LBLTRAN_AREADANTECODIGOFILTER',prop:'Caption'},{av:'lblLbltran_cursocodigofilter_Caption',ctrl:'LBLTRAN_CURSOCODIGOFILTER',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage',nv:0},{av:'GRID_nEOF',nv:0},{av:'subGrid_Rows',nv:0},{av:'AV43Tran_RegionCodigo',fld:'vTRAN_REGIONCODIGO',pic:'ZZZ9',nv:0},{av:'AV42Tran_RegionDescripcion',fld:'vTRAN_REGIONDESCRIPCION',pic:'',nv:''},{av:'AV25Tran_CentroCostoCodigo',fld:'vTRAN_CENTROCOSTOCODIGO',pic:'',nv:''},{av:'AV33Tran_NombreIngreso',fld:'vTRAN_NOMBREINGRESO',pic:'@!',nv:''},{av:'AV44Reporte',fld:'vREPORTE',pic:'',nv:''},{av:'edtavReporte_Tooltiptext',ctrl:'vREPORTE',prop:'Tooltiptext'},{av:'AV38Update',fld:'vUPDATE',pic:'',nv:''},{av:'A50Tran_CentroCostoIdDestino',fld:'TRAN_CENTROCOSTOIDDESTINO',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV39Usua_Id',fld:'vUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV5Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV26Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV8ADVANCED_LABEL_TEMPLATE',fld:'vADVANCED_LABEL_TEMPLATE',pic:'',nv:''},{av:'AV29Tran_DescripcionMovimiento',fld:'vTRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'AV30Tran_FechaRegistro',fld:'vTRAN_FECHAREGISTRO',pic:'',nv:''},{av:'AV34Tran_Observaciones',fld:'vTRAN_OBSERVACIONES',pic:'',nv:''},{av:'AV35Tran_TipoIngreso',fld:'vTRAN_TIPOINGRESO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV32Tran_IdProveedor',fld:'vTRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Proveedor',fld:'vPROVEEDOR',pic:'',nv:''},{av:'AV31Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12Cuentadante',fld:'vCUENTADANTE',pic:'',nv:''},{av:'AV24Tran_AreadanteCodigo',fld:'vTRAN_AREADANTECODIGO',pic:'',nv:''},{av:'AV28Tran_CursoCodigo',fld:'vTRAN_CURSOCODIGO',pic:'',nv:''},{av:'AV49Pgmname',fld:'vPGMNAME',pic:'',nv:''},{av:'AV27Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'lblLbltran_codigomovimientofilter_Caption',ctrl:'LBLTRAN_CODIGOMOVIMIENTOFILTER',prop:'Caption'},{av:'lblLbltran_descripcionmovimientofilter_Caption',ctrl:'LBLTRAN_DESCRIPCIONMOVIMIENTOFILTER',prop:'Caption'},{av:'lblLbltran_fecharegistrofilter_Caption',ctrl:'LBLTRAN_FECHAREGISTROFILTER',prop:'Caption'},{av:'lblLbltran_observacionesfilter_Caption',ctrl:'LBLTRAN_OBSERVACIONESFILTER',prop:'Caption'},{av:'lblLbltran_tipoingresofilter_Caption',ctrl:'LBLTRAN_TIPOINGRESOFILTER',prop:'Caption'},{av:'lblLbltran_idproveedorfilter_Caption',ctrl:'LBLTRAN_IDPROVEEDORFILTER',prop:'Caption'},{av:'lblLbltran_nombreproveedorfilter_Caption',ctrl:'LBLTRAN_NOMBREPROVEEDORFILTER',prop:'Caption'},{av:'lblLbltran_idcuentadantedestinofilter_Caption',ctrl:'LBLTRAN_IDCUENTADANTEDESTINOFILTER',prop:'Caption'},{av:'lblLbltran_nombrecuentadantefilter_Caption',ctrl:'LBLTRAN_NOMBRECUENTADANTEFILTER',prop:'Caption'},{av:'lblLbltran_areadantecodigofilter_Caption',ctrl:'LBLTRAN_AREADANTECODIGOFILTER',prop:'Caption'},{av:'lblLbltran_cursocodigofilter_Caption',ctrl:'LBLTRAN_CURSOCODIGOFILTER',prop:'Caption'}]}");
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
      AV44Reporte = "" ;
      AV38Update = "" ;
      AV26Tran_CodigoMovimiento = "" ;
      AV29Tran_DescripcionMovimiento = "" ;
      AV42Tran_RegionDescripcion = "" ;
      AV25Tran_CentroCostoCodigo = "" ;
      AV30Tran_FechaRegistro = GXutil.nullDate() ;
      AV34Tran_Observaciones = "" ;
      AV33Tran_NombreIngreso = "" ;
      AV21Proveedor = "" ;
      AV12Cuentadante = "" ;
      AV24Tran_AreadanteCodigo = "" ;
      AV28Tran_CursoCodigo = "" ;
      AV8ADVANCED_LABEL_TEMPLATE = "" ;
      AV49Pgmname = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV45url = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtntoggle_Jsonclick = "" ;
      lblTitletext_Jsonclick = "" ;
      lblLbltran_codigomovimientofilter_Jsonclick = "" ;
      lblLbltran_descripcionmovimientofilter_Jsonclick = "" ;
      lblLbltran_regioncodigofilter_Jsonclick = "" ;
      lblLbltran_regiondescripcionfilter_Jsonclick = "" ;
      lblLbltran_centrocostocodigofilter_Jsonclick = "" ;
      lblLbltran_fecharegistrofilter_Jsonclick = "" ;
      lblLbltran_observacionesfilter_Jsonclick = "" ;
      lblLbltran_tipoingresofilter_Jsonclick = "" ;
      lblLbltran_idproveedorfilter_Jsonclick = "" ;
      lblLbltran_nombreproveedorfilter_Jsonclick = "" ;
      lblLbltran_idcuentadantedestinofilter_Jsonclick = "" ;
      lblLbltran_nombrecuentadantefilter_Jsonclick = "" ;
      lblLbltran_areadantecodigofilter_Jsonclick = "" ;
      lblLbltran_cursocodigofilter_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid_Linesclass = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      A49Tran_CodigoMovimiento = "" ;
      A381Tran_DescripcionMovimiento = "" ;
      A422Tran_RegionDescripcion = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A112Tran_CodBodeOrigen = "" ;
      A385Tran_ModuloDestino = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A575Tran_NombreProveedor = "" ;
      A389Tran_NombCuentadanteDestino = "" ;
      A416Tran_Observaciones = "" ;
      A407Tran_AreadanteCodigo = "" ;
      A408Tran_CursoCodigo = "" ;
      A672Tran_NombreIngreso = "" ;
      A58Tran_Estado = "" ;
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A391Tran_UsuarioRatifica = "" ;
      A417Tran_UsuarioCodigo = "" ;
      A418Tran_UsuarioNombre = "" ;
      A420Tran_CentroCostoDescripcion = "" ;
      A481Tran_IndE_S = "" ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      A482Tran_TipoElemento = "" ;
      A514Tran_NumeroIngreso = "" ;
      A520Tran_RegionDescripcionDestino = "" ;
      A516Tran_CentroCostoCodigoDestino = "" ;
      A517Tran_CentroCostoDescripcionDes = "" ;
      A527Tran_TipoEntra = "" ;
      A594Tran_RegionAbrev = "" ;
      A608Tran_RegionAbrevDestino = "" ;
      A524Tran_Detalle = "" ;
      lblUrl_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV50Reporte_GXI = "" ;
      AV51Update_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV26Tran_CodigoMovimiento = "" ;
      H007T2_A416Tran_Observaciones = new String[] {""} ;
      H007T2_n416Tran_Observaciones = new boolean[] {false} ;
      H007T2_A513Tran_ConsecutivoCC = new long[1] ;
      H007T2_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      H007T2_A49Tran_CodigoMovimiento = new String[] {""} ;
      H007T2_A381Tran_DescripcionMovimiento = new String[] {""} ;
      H007T2_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      H007T2_A421Tran_RegionCodigo = new short[1] ;
      H007T2_n421Tran_RegionCodigo = new boolean[] {false} ;
      H007T2_A422Tran_RegionDescripcion = new String[] {""} ;
      H007T2_n422Tran_RegionDescripcion = new boolean[] {false} ;
      H007T2_A419Tran_CentroCostoCodigo = new String[] {""} ;
      H007T2_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      H007T2_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H007T2_A54Tran_TipoIngreso = new long[1] ;
      H007T2_n54Tran_TipoIngreso = new boolean[] {false} ;
      H007T2_A53Tran_IdProveedor = new long[1] ;
      H007T2_n53Tran_IdProveedor = new boolean[] {false} ;
      H007T2_A52Tran_IdCuentadanteDestino = new long[1] ;
      H007T2_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      H007T2_A407Tran_AreadanteCodigo = new String[] {""} ;
      H007T2_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      H007T2_A408Tran_CursoCodigo = new String[] {""} ;
      H007T2_n408Tran_CursoCodigo = new boolean[] {false} ;
      H007T2_A575Tran_NombreProveedor = new String[] {""} ;
      H007T2_n575Tran_NombreProveedor = new boolean[] {false} ;
      H007T2_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      H007T2_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      H007T2_A672Tran_NombreIngreso = new String[] {""} ;
      H007T2_n672Tran_NombreIngreso = new boolean[] {false} ;
      H007T2_A58Tran_Estado = new String[] {""} ;
      H007T2_n58Tran_Estado = new boolean[] {false} ;
      H007T2_A50Tran_CentroCostoIdDestino = new long[1] ;
      H007T2_n50Tran_CentroCostoIdDestino = new boolean[] {false} ;
      H007T2_A48Tran_CentroCostoId = new long[1] ;
      H007T2_A667Tran_NumeroGrupo = new short[1] ;
      H007T2_n667Tran_NumeroGrupo = new boolean[] {false} ;
      H007T2_A524Tran_Detalle = new String[] {""} ;
      H007T2_n524Tran_Detalle = new boolean[] {false} ;
      H007T2_A608Tran_RegionAbrevDestino = new String[] {""} ;
      H007T2_n608Tran_RegionAbrevDestino = new boolean[] {false} ;
      H007T2_A594Tran_RegionAbrev = new String[] {""} ;
      H007T2_n594Tran_RegionAbrev = new boolean[] {false} ;
      H007T2_A568Tran_CantidadPadres = new int[1] ;
      H007T2_n568Tran_CantidadPadres = new boolean[] {false} ;
      H007T2_A527Tran_TipoEntra = new String[] {""} ;
      H007T2_n527Tran_TipoEntra = new boolean[] {false} ;
      H007T2_A519Tran_RegionCodigoDestino = new short[1] ;
      H007T2_n519Tran_RegionCodigoDestino = new boolean[] {false} ;
      H007T2_A518Tran_RegionIdDestino = new long[1] ;
      H007T2_n518Tran_RegionIdDestino = new boolean[] {false} ;
      H007T2_A517Tran_CentroCostoDescripcionDes = new String[] {""} ;
      H007T2_n517Tran_CentroCostoDescripcionDes = new boolean[] {false} ;
      H007T2_A516Tran_CentroCostoCodigoDestino = new String[] {""} ;
      H007T2_n516Tran_CentroCostoCodigoDestino = new boolean[] {false} ;
      H007T2_A520Tran_RegionDescripcionDestino = new String[] {""} ;
      H007T2_n520Tran_RegionDescripcionDestino = new boolean[] {false} ;
      H007T2_A514Tran_NumeroIngreso = new String[] {""} ;
      H007T2_n514Tran_NumeroIngreso = new boolean[] {false} ;
      H007T2_A482Tran_TipoElemento = new String[] {""} ;
      H007T2_A499Tran_CodTipoElemento = new long[1] ;
      H007T2_n499Tran_CodTipoElemento = new boolean[] {false} ;
      H007T2_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007T2_n483Tran_ValorTransaccion = new boolean[] {false} ;
      H007T2_A481Tran_IndE_S = new String[] {""} ;
      H007T2_n481Tran_IndE_S = new boolean[] {false} ;
      H007T2_A57Tran_RegionId = new long[1] ;
      H007T2_n57Tran_RegionId = new boolean[] {false} ;
      H007T2_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      H007T2_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      H007T2_A418Tran_UsuarioNombre = new String[] {""} ;
      H007T2_n418Tran_UsuarioNombre = new boolean[] {false} ;
      H007T2_A417Tran_UsuarioCodigo = new String[] {""} ;
      H007T2_n417Tran_UsuarioCodigo = new boolean[] {false} ;
      H007T2_A47Tran_UsuarioId = new long[1] ;
      H007T2_n47Tran_UsuarioId = new boolean[] {false} ;
      H007T2_A391Tran_UsuarioRatifica = new String[] {""} ;
      H007T2_n391Tran_UsuarioRatifica = new boolean[] {false} ;
      H007T2_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H007T2_n390Tran_FechaRatificacion = new boolean[] {false} ;
      H007T2_A46Tran_Id = new long[1] ;
      H007T2_A51Tran_IdCuentadanteOrigen = new long[1] ;
      H007T2_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      H007T2_A387Tran_CodBodeDestino = new String[] {""} ;
      H007T2_A111Tran_CodAlmaDestino = new String[] {""} ;
      H007T2_A385Tran_ModuloDestino = new String[] {""} ;
      H007T2_A112Tran_CodBodeOrigen = new String[] {""} ;
      H007T2_A109Tran_CodAlmaOrigen = new String[] {""} ;
      H007T2_A110Tran_ModuloOrigen = new String[] {""} ;
      AV40Usuario = "" ;
      AV6websession = httpContext.getWebSession();
      AV7Acceso = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV17HTTPRequest = httpContext.getHttpRequest();
      AV15GridState = new com.orions2.SdtGridState(remoteHandle, context);
      AV22Session = httpContext.getWebSession();
      AV16GridStateFilterValue = new com.orions2.SdtGridState_FilterValue(remoteHandle, context);
      AV36TrnContext = new com.orions2.SdtTransactionContext(remoteHandle, context);
      H007T3_A1Cent_Id = new long[1] ;
      H007T3_A23Usua_Id = new long[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wwalm_ratificar__default(),
         new Object[] {
             new Object[] {
            H007T2_A416Tran_Observaciones, H007T2_n416Tran_Observaciones, H007T2_A513Tran_ConsecutivoCC, H007T2_n513Tran_ConsecutivoCC, H007T2_A49Tran_CodigoMovimiento, H007T2_A381Tran_DescripcionMovimiento, H007T2_n381Tran_DescripcionMovimiento, H007T2_A421Tran_RegionCodigo, H007T2_n421Tran_RegionCodigo, H007T2_A422Tran_RegionDescripcion,
            H007T2_n422Tran_RegionDescripcion, H007T2_A419Tran_CentroCostoCodigo, H007T2_n419Tran_CentroCostoCodigo, H007T2_A55Tran_FechaRegistro, H007T2_A54Tran_TipoIngreso, H007T2_n54Tran_TipoIngreso, H007T2_A53Tran_IdProveedor, H007T2_n53Tran_IdProveedor, H007T2_A52Tran_IdCuentadanteDestino, H007T2_n52Tran_IdCuentadanteDestino,
            H007T2_A407Tran_AreadanteCodigo, H007T2_n407Tran_AreadanteCodigo, H007T2_A408Tran_CursoCodigo, H007T2_n408Tran_CursoCodigo, H007T2_A575Tran_NombreProveedor, H007T2_n575Tran_NombreProveedor, H007T2_A389Tran_NombCuentadanteDestino, H007T2_n389Tran_NombCuentadanteDestino, H007T2_A672Tran_NombreIngreso, H007T2_n672Tran_NombreIngreso,
            H007T2_A58Tran_Estado, H007T2_n58Tran_Estado, H007T2_A50Tran_CentroCostoIdDestino, H007T2_n50Tran_CentroCostoIdDestino, H007T2_A48Tran_CentroCostoId, H007T2_A667Tran_NumeroGrupo, H007T2_n667Tran_NumeroGrupo, H007T2_A524Tran_Detalle, H007T2_n524Tran_Detalle, H007T2_A608Tran_RegionAbrevDestino,
            H007T2_n608Tran_RegionAbrevDestino, H007T2_A594Tran_RegionAbrev, H007T2_n594Tran_RegionAbrev, H007T2_A568Tran_CantidadPadres, H007T2_n568Tran_CantidadPadres, H007T2_A527Tran_TipoEntra, H007T2_n527Tran_TipoEntra, H007T2_A519Tran_RegionCodigoDestino, H007T2_n519Tran_RegionCodigoDestino, H007T2_A518Tran_RegionIdDestino,
            H007T2_n518Tran_RegionIdDestino, H007T2_A517Tran_CentroCostoDescripcionDes, H007T2_n517Tran_CentroCostoDescripcionDes, H007T2_A516Tran_CentroCostoCodigoDestino, H007T2_n516Tran_CentroCostoCodigoDestino, H007T2_A520Tran_RegionDescripcionDestino, H007T2_n520Tran_RegionDescripcionDestino, H007T2_A514Tran_NumeroIngreso, H007T2_n514Tran_NumeroIngreso, H007T2_A482Tran_TipoElemento,
            H007T2_A499Tran_CodTipoElemento, H007T2_n499Tran_CodTipoElemento, H007T2_A483Tran_ValorTransaccion, H007T2_n483Tran_ValorTransaccion, H007T2_A481Tran_IndE_S, H007T2_n481Tran_IndE_S, H007T2_A57Tran_RegionId, H007T2_n57Tran_RegionId, H007T2_A420Tran_CentroCostoDescripcion, H007T2_n420Tran_CentroCostoDescripcion,
            H007T2_A418Tran_UsuarioNombre, H007T2_n418Tran_UsuarioNombre, H007T2_A417Tran_UsuarioCodigo, H007T2_n417Tran_UsuarioCodigo, H007T2_A47Tran_UsuarioId, H007T2_n47Tran_UsuarioId, H007T2_A391Tran_UsuarioRatifica, H007T2_n391Tran_UsuarioRatifica, H007T2_A390Tran_FechaRatificacion, H007T2_n390Tran_FechaRatificacion,
            H007T2_A46Tran_Id, H007T2_A51Tran_IdCuentadanteOrigen, H007T2_n51Tran_IdCuentadanteOrigen, H007T2_A387Tran_CodBodeDestino, H007T2_A111Tran_CodAlmaDestino, H007T2_A385Tran_ModuloDestino, H007T2_A112Tran_CodBodeOrigen, H007T2_A109Tran_CodAlmaOrigen, H007T2_A110Tran_ModuloOrigen
            }
            , new Object[] {
            H007T3_A1Cent_Id, H007T3_A23Usua_Id
            }
         }
      );
      AV49Pgmname = "WWALM_RATIFICAR" ;
      /* GeneXus formulas. */
      AV49Pgmname = "WWALM_RATIFICAR" ;
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
   private short nRC_GXsfl_168 ;
   private short nGXsfl_168_idx=1 ;
   private short AV43Tran_RegionCodigo ;
   private short AV46WindowsId ;
   private short wbEnd ;
   private short wbStart ;
   private short A421Tran_RegionCodigo ;
   private short A519Tran_RegionCodigoDestino ;
   private short A667Tran_NumeroGrupo ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int edtavTran_consecutivocc_Enabled ;
   private int edtavTran_codigomovimiento_Visible ;
   private int edtavTran_codigomovimiento_Enabled ;
   private int edtavTran_descripcionmovimiento_Visible ;
   private int edtavTran_descripcionmovimiento_Enabled ;
   private int edtavTran_regioncodigo_Enabled ;
   private int edtavTran_regioncodigo_Visible ;
   private int edtavTran_regiondescripcion_Visible ;
   private int edtavTran_regiondescripcion_Enabled ;
   private int edtavTran_centrocostocodigo_Visible ;
   private int edtavTran_centrocostocodigo_Enabled ;
   private int edtavTran_fecharegistro_Enabled ;
   private int edtavTran_observaciones_Visible ;
   private int edtavTran_observaciones_Enabled ;
   private int edtavTran_nombreingreso_Visible ;
   private int edtavTran_nombreingreso_Enabled ;
   private int edtavTran_idproveedor_Enabled ;
   private int edtavTran_idproveedor_Visible ;
   private int edtavProveedor_Visible ;
   private int edtavProveedor_Enabled ;
   private int edtavTran_idcuentadantedestino_Enabled ;
   private int edtavTran_idcuentadantedestino_Visible ;
   private int edtavCuentadante_Visible ;
   private int edtavCuentadante_Enabled ;
   private int edtavTran_areadantecodigo_Visible ;
   private int edtavTran_areadantecodigo_Enabled ;
   private int edtavTran_cursocodigo_Visible ;
   private int edtavTran_cursocodigo_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Allbackcolor ;
   private int A568Tran_CantidadPadres ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int subGrid_Islastpage ;
   private int AV14GridPageCount ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int edtavReporte_Enabled ;
   private int edtavReporte_Visible ;
   private int edtavUpdate_Enabled ;
   private int edtavUpdate_Visible ;
   private long AV27Tran_ConsecutivoCC ;
   private long AV32Tran_IdProveedor ;
   private long AV31Tran_IdCuentadanteDestino ;
   private long AV35Tran_TipoIngreso ;
   private long A50Tran_CentroCostoIdDestino ;
   private long A48Tran_CentroCostoId ;
   private long A23Usua_Id ;
   private long A1Cent_Id ;
   private long AV39Usua_Id ;
   private long AV5Tran_CentroCostoId ;
   private long GRID_nFirstRecordOnPage ;
   private long A513Tran_ConsecutivoCC ;
   private long A53Tran_IdProveedor ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long A46Tran_Id ;
   private long A47Tran_UsuarioId ;
   private long A57Tran_RegionId ;
   private long A499Tran_CodTipoElemento ;
   private long A518Tran_RegionIdDestino ;
   private long GRID_nCurrentRecord ;
   private long A54Tran_TipoIngreso ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private String edtavReporte_Tooltiptext ;
   private String divFilterscontainer_Class ;
   private String divTran_codigomovimientofiltercontainer_Class ;
   private String divTran_descripcionmovimientofiltercontainer_Class ;
   private String divTran_regioncodigofiltercontainer_Class ;
   private String divTran_regiondescripcionfiltercontainer_Class ;
   private String divTran_centrocostocodigofiltercontainer_Class ;
   private String divTran_fecharegistrofiltercontainer_Class ;
   private String divTran_observacionesfiltercontainer_Class ;
   private String divTran_tipoingresofiltercontainer_Class ;
   private String divTran_idproveedorfiltercontainer_Class ;
   private String divTran_nombreproveedorfiltercontainer_Class ;
   private String divTran_idcuentadantedestinofiltercontainer_Class ;
   private String divTran_nombrecuentadantefiltercontainer_Class ;
   private String divTran_areadantecodigofiltercontainer_Class ;
   private String divTran_cursocodigofiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_168_idx="0001" ;
   private String edtavReporte_Internalname ;
   private String AV8ADVANCED_LABEL_TEMPLATE ;
   private String AV49Pgmname ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Alertify1_Type ;
   private String Alertify1_Textmessage ;
   private String Alertify1_Textok ;
   private String Alertify1_Textcancel ;
   private String Alertify1_Promptplaceholder ;
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
   private String edtavTran_consecutivocc_Internalname ;
   private String edtavTran_consecutivocc_Jsonclick ;
   private String divFilterscontainer_Internalname ;
   private String divTran_codigomovimientofiltercontainer_Internalname ;
   private String lblLbltran_codigomovimientofilter_Internalname ;
   private String lblLbltran_codigomovimientofilter_Caption ;
   private String lblLbltran_codigomovimientofilter_Jsonclick ;
   private String edtavTran_codigomovimiento_Internalname ;
   private String edtavTran_codigomovimiento_Jsonclick ;
   private String divTran_descripcionmovimientofiltercontainer_Internalname ;
   private String lblLbltran_descripcionmovimientofilter_Internalname ;
   private String lblLbltran_descripcionmovimientofilter_Caption ;
   private String lblLbltran_descripcionmovimientofilter_Jsonclick ;
   private String edtavTran_descripcionmovimiento_Internalname ;
   private String edtavTran_descripcionmovimiento_Jsonclick ;
   private String divTran_regioncodigofiltercontainer_Internalname ;
   private String lblLbltran_regioncodigofilter_Internalname ;
   private String lblLbltran_regioncodigofilter_Jsonclick ;
   private String edtavTran_regioncodigo_Internalname ;
   private String edtavTran_regioncodigo_Jsonclick ;
   private String divTran_regiondescripcionfiltercontainer_Internalname ;
   private String lblLbltran_regiondescripcionfilter_Internalname ;
   private String lblLbltran_regiondescripcionfilter_Jsonclick ;
   private String edtavTran_regiondescripcion_Internalname ;
   private String edtavTran_regiondescripcion_Jsonclick ;
   private String divTran_centrocostocodigofiltercontainer_Internalname ;
   private String lblLbltran_centrocostocodigofilter_Internalname ;
   private String lblLbltran_centrocostocodigofilter_Jsonclick ;
   private String edtavTran_centrocostocodigo_Internalname ;
   private String edtavTran_centrocostocodigo_Jsonclick ;
   private String divTran_fecharegistrofiltercontainer_Internalname ;
   private String lblLbltran_fecharegistrofilter_Internalname ;
   private String lblLbltran_fecharegistrofilter_Caption ;
   private String lblLbltran_fecharegistrofilter_Jsonclick ;
   private String edtavTran_fecharegistro_Internalname ;
   private String edtavTran_fecharegistro_Jsonclick ;
   private String divTran_observacionesfiltercontainer_Internalname ;
   private String lblLbltran_observacionesfilter_Internalname ;
   private String lblLbltran_observacionesfilter_Caption ;
   private String lblLbltran_observacionesfilter_Jsonclick ;
   private String edtavTran_observaciones_Internalname ;
   private String divTran_tipoingresofiltercontainer_Internalname ;
   private String lblLbltran_tipoingresofilter_Internalname ;
   private String lblLbltran_tipoingresofilter_Caption ;
   private String lblLbltran_tipoingresofilter_Jsonclick ;
   private String edtavTran_nombreingreso_Internalname ;
   private String edtavTran_nombreingreso_Jsonclick ;
   private String divTran_idproveedorfiltercontainer_Internalname ;
   private String lblLbltran_idproveedorfilter_Internalname ;
   private String lblLbltran_idproveedorfilter_Caption ;
   private String lblLbltran_idproveedorfilter_Jsonclick ;
   private String edtavTran_idproveedor_Internalname ;
   private String edtavTran_idproveedor_Jsonclick ;
   private String divTran_nombreproveedorfiltercontainer_Internalname ;
   private String lblLbltran_nombreproveedorfilter_Internalname ;
   private String lblLbltran_nombreproveedorfilter_Caption ;
   private String lblLbltran_nombreproveedorfilter_Jsonclick ;
   private String edtavProveedor_Internalname ;
   private String edtavProveedor_Jsonclick ;
   private String divTran_idcuentadantedestinofiltercontainer_Internalname ;
   private String lblLbltran_idcuentadantedestinofilter_Internalname ;
   private String lblLbltran_idcuentadantedestinofilter_Caption ;
   private String lblLbltran_idcuentadantedestinofilter_Jsonclick ;
   private String edtavTran_idcuentadantedestino_Internalname ;
   private String edtavTran_idcuentadantedestino_Jsonclick ;
   private String divTran_nombrecuentadantefiltercontainer_Internalname ;
   private String lblLbltran_nombrecuentadantefilter_Internalname ;
   private String lblLbltran_nombrecuentadantefilter_Caption ;
   private String lblLbltran_nombrecuentadantefilter_Jsonclick ;
   private String edtavCuentadante_Internalname ;
   private String edtavCuentadante_Jsonclick ;
   private String divTran_areadantecodigofiltercontainer_Internalname ;
   private String lblLbltran_areadantecodigofilter_Internalname ;
   private String lblLbltran_areadantecodigofilter_Caption ;
   private String lblLbltran_areadantecodigofilter_Jsonclick ;
   private String edtavTran_areadantecodigo_Internalname ;
   private String edtavTran_areadantecodigo_Jsonclick ;
   private String divTran_cursocodigofiltercontainer_Internalname ;
   private String lblLbltran_cursocodigofilter_Internalname ;
   private String lblLbltran_cursocodigofilter_Caption ;
   private String lblLbltran_cursocodigofilter_Jsonclick ;
   private String edtavTran_cursocodigo_Internalname ;
   private String edtavTran_cursocodigo_Jsonclick ;
   private String divGridcell_Internalname ;
   private String divGridcell_Class ;
   private String divGridtable_Internalname ;
   private String divSection1_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String A58Tran_Estado ;
   private String A482Tran_TipoElemento ;
   private String A514Tran_NumeroIngreso ;
   private String A527Tran_TipoEntra ;
   private String A524Tran_Detalle ;
   private String lblUrl_Internalname ;
   private String lblUrl_Caption ;
   private String lblUrl_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavUpdate_Internalname ;
   private String edtTran_ConsecutivoCC_Internalname ;
   private String edtTran_CodigoMovimiento_Internalname ;
   private String edtTran_DescripcionMovimiento_Internalname ;
   private String edtTran_RegionDescripcion_Internalname ;
   private String edtTran_CentroCostoCodigo_Internalname ;
   private String edtTran_ModuloOrigen_Internalname ;
   private String edtTran_CodAlmaOrigen_Internalname ;
   private String edtTran_CodBodeOrigen_Internalname ;
   private String edtTran_ModuloDestino_Internalname ;
   private String edtTran_CodAlmaDestino_Internalname ;
   private String edtTran_CodBodeDestino_Internalname ;
   private String edtTran_FechaRegistro_Internalname ;
   private String edtTran_IdProveedor_Internalname ;
   private String edtTran_NombreProveedor_Internalname ;
   private String edtTran_IdCuentadanteDestino_Internalname ;
   private String edtTran_NombCuentadanteDestino_Internalname ;
   private String edtTran_Observaciones_Internalname ;
   private String edtTran_AreadanteCodigo_Internalname ;
   private String edtTran_CursoCodigo_Internalname ;
   private String edtTran_NombreIngreso_Internalname ;
   private String edtTran_IdCuentadanteOrigen_Internalname ;
   private String edtTran_Id_Internalname ;
   private String edtTran_FechaRatificacion_Internalname ;
   private String edtTran_UsuarioRatifica_Internalname ;
   private String edtTran_UsuarioId_Internalname ;
   private String edtTran_UsuarioCodigo_Internalname ;
   private String edtTran_UsuarioNombre_Internalname ;
   private String edtTran_CentroCostoId_Internalname ;
   private String edtTran_CentroCostoDescripcion_Internalname ;
   private String edtTran_RegionId_Internalname ;
   private String edtTran_RegionCodigo_Internalname ;
   private String edtTran_ValorTransaccion_Internalname ;
   private String edtTran_CodTipoElemento_Internalname ;
   private String edtTran_NumeroIngreso_Internalname ;
   private String edtTran_RegionDescripcionDestino_Internalname ;
   private String edtTran_CentroCostoIdDestino_Internalname ;
   private String edtTran_CentroCostoCodigoDestino_Internalname ;
   private String edtTran_CentroCostoDescripcionDes_Internalname ;
   private String edtTran_RegionIdDestino_Internalname ;
   private String edtTran_RegionCodigoDestino_Internalname ;
   private String edtTran_CantidadPadres_Internalname ;
   private String edtTran_RegionAbrev_Internalname ;
   private String edtTran_RegionAbrevDestino_Internalname ;
   private String edtTran_Detalle_Internalname ;
   private String edtTran_NumeroGrupo_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV7Acceso ;
   private String sGXsfl_168_fel_idx="0001" ;
   private String sImgUrl ;
   private String edtavReporte_Jsonclick ;
   private String edtavUpdate_Jsonclick ;
   private String ROClassString ;
   private String edtTran_ConsecutivoCC_Jsonclick ;
   private String edtTran_CodigoMovimiento_Jsonclick ;
   private String edtTran_DescripcionMovimiento_Jsonclick ;
   private String edtTran_RegionDescripcion_Jsonclick ;
   private String edtTran_CentroCostoCodigo_Jsonclick ;
   private String edtTran_ModuloOrigen_Jsonclick ;
   private String edtTran_CodAlmaOrigen_Jsonclick ;
   private String edtTran_CodBodeOrigen_Jsonclick ;
   private String edtTran_ModuloDestino_Jsonclick ;
   private String edtTran_CodAlmaDestino_Jsonclick ;
   private String edtTran_CodBodeDestino_Jsonclick ;
   private String edtTran_FechaRegistro_Jsonclick ;
   private String edtTran_IdProveedor_Jsonclick ;
   private String edtTran_NombreProveedor_Jsonclick ;
   private String edtTran_IdCuentadanteDestino_Jsonclick ;
   private String edtTran_NombCuentadanteDestino_Jsonclick ;
   private String edtTran_Observaciones_Jsonclick ;
   private String edtTran_AreadanteCodigo_Jsonclick ;
   private String edtTran_CursoCodigo_Jsonclick ;
   private String edtTran_NombreIngreso_Jsonclick ;
   private String edtTran_IdCuentadanteOrigen_Jsonclick ;
   private String edtTran_Id_Jsonclick ;
   private String edtTran_FechaRatificacion_Jsonclick ;
   private String edtTran_UsuarioRatifica_Jsonclick ;
   private String edtTran_UsuarioId_Jsonclick ;
   private String edtTran_UsuarioCodigo_Jsonclick ;
   private String edtTran_UsuarioNombre_Jsonclick ;
   private String edtTran_CentroCostoId_Jsonclick ;
   private String edtTran_CentroCostoDescripcion_Jsonclick ;
   private String edtTran_RegionId_Jsonclick ;
   private String edtTran_RegionCodigo_Jsonclick ;
   private String edtTran_ValorTransaccion_Jsonclick ;
   private String edtTran_CodTipoElemento_Jsonclick ;
   private String edtTran_NumeroIngreso_Jsonclick ;
   private String edtTran_RegionDescripcionDestino_Jsonclick ;
   private String edtTran_CentroCostoIdDestino_Jsonclick ;
   private String edtTran_CentroCostoCodigoDestino_Jsonclick ;
   private String edtTran_CentroCostoDescripcionDes_Jsonclick ;
   private String edtTran_RegionIdDestino_Jsonclick ;
   private String edtTran_RegionCodigoDestino_Jsonclick ;
   private String edtTran_CantidadPadres_Jsonclick ;
   private String edtTran_RegionAbrev_Jsonclick ;
   private String edtTran_RegionAbrevDestino_Jsonclick ;
   private String edtTran_Detalle_Jsonclick ;
   private String edtTran_NumeroGrupo_Jsonclick ;
   private String Alertify1_Internalname ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date AV30Tran_FechaRegistro ;
   private boolean entryPointCalled ;
   private boolean bGXsfl_168_Refreshing=false ;
   private boolean n50Tran_CentroCostoIdDestino ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n381Tran_DescripcionMovimiento ;
   private boolean n422Tran_RegionDescripcion ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n53Tran_IdProveedor ;
   private boolean n575Tran_NombreProveedor ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n389Tran_NombCuentadanteDestino ;
   private boolean n416Tran_Observaciones ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n408Tran_CursoCodigo ;
   private boolean n672Tran_NombreIngreso ;
   private boolean n58Tran_Estado ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n391Tran_UsuarioRatifica ;
   private boolean n47Tran_UsuarioId ;
   private boolean n417Tran_UsuarioCodigo ;
   private boolean n418Tran_UsuarioNombre ;
   private boolean n420Tran_CentroCostoDescripcion ;
   private boolean n57Tran_RegionId ;
   private boolean n421Tran_RegionCodigo ;
   private boolean n481Tran_IndE_S ;
   private boolean n483Tran_ValorTransaccion ;
   private boolean n499Tran_CodTipoElemento ;
   private boolean n514Tran_NumeroIngreso ;
   private boolean n520Tran_RegionDescripcionDestino ;
   private boolean n516Tran_CentroCostoCodigoDestino ;
   private boolean n517Tran_CentroCostoDescripcionDes ;
   private boolean n518Tran_RegionIdDestino ;
   private boolean n519Tran_RegionCodigoDestino ;
   private boolean n527Tran_TipoEntra ;
   private boolean n568Tran_CantidadPadres ;
   private boolean n594Tran_RegionAbrev ;
   private boolean n608Tran_RegionAbrevDestino ;
   private boolean n524Tran_Detalle ;
   private boolean n667Tran_NumeroGrupo ;
   private boolean brk7T2 ;
   private boolean n54Tran_TipoIngreso ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV44Reporte_IsBlob ;
   private boolean AV38Update_IsBlob ;
   private String AV34Tran_Observaciones ;
   private String A416Tran_Observaciones ;
   private String AV26Tran_CodigoMovimiento ;
   private String AV29Tran_DescripcionMovimiento ;
   private String AV42Tran_RegionDescripcion ;
   private String AV25Tran_CentroCostoCodigo ;
   private String AV33Tran_NombreIngreso ;
   private String AV21Proveedor ;
   private String AV12Cuentadante ;
   private String AV24Tran_AreadanteCodigo ;
   private String AV28Tran_CursoCodigo ;
   private String AV45url ;
   private String A49Tran_CodigoMovimiento ;
   private String A381Tran_DescripcionMovimiento ;
   private String A422Tran_RegionDescripcion ;
   private String A419Tran_CentroCostoCodigo ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String A112Tran_CodBodeOrigen ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A575Tran_NombreProveedor ;
   private String A389Tran_NombCuentadanteDestino ;
   private String A407Tran_AreadanteCodigo ;
   private String A408Tran_CursoCodigo ;
   private String A672Tran_NombreIngreso ;
   private String A391Tran_UsuarioRatifica ;
   private String A417Tran_UsuarioCodigo ;
   private String A418Tran_UsuarioNombre ;
   private String A420Tran_CentroCostoDescripcion ;
   private String A481Tran_IndE_S ;
   private String A520Tran_RegionDescripcionDestino ;
   private String A516Tran_CentroCostoCodigoDestino ;
   private String A517Tran_CentroCostoDescripcionDes ;
   private String A594Tran_RegionAbrev ;
   private String A608Tran_RegionAbrevDestino ;
   private String AV50Reporte_GXI ;
   private String AV51Update_GXI ;
   private String lV26Tran_CodigoMovimiento ;
   private String AV40Usuario ;
   private String AV44Reporte ;
   private String AV38Update ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV17HTTPRequest ;
   private com.genexus.webpanels.WebSession AV6websession ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private HTMLChoice cmbTran_Estado ;
   private HTMLChoice cmbTran_IndE_S ;
   private HTMLChoice cmbTran_TipoElemento ;
   private HTMLChoice cmbTran_TipoEntra ;
   private IDataStoreProvider pr_default ;
   private String[] H007T2_A416Tran_Observaciones ;
   private boolean[] H007T2_n416Tran_Observaciones ;
   private long[] H007T2_A513Tran_ConsecutivoCC ;
   private boolean[] H007T2_n513Tran_ConsecutivoCC ;
   private String[] H007T2_A49Tran_CodigoMovimiento ;
   private String[] H007T2_A381Tran_DescripcionMovimiento ;
   private boolean[] H007T2_n381Tran_DescripcionMovimiento ;
   private short[] H007T2_A421Tran_RegionCodigo ;
   private boolean[] H007T2_n421Tran_RegionCodigo ;
   private String[] H007T2_A422Tran_RegionDescripcion ;
   private boolean[] H007T2_n422Tran_RegionDescripcion ;
   private String[] H007T2_A419Tran_CentroCostoCodigo ;
   private boolean[] H007T2_n419Tran_CentroCostoCodigo ;
   private java.util.Date[] H007T2_A55Tran_FechaRegistro ;
   private long[] H007T2_A54Tran_TipoIngreso ;
   private boolean[] H007T2_n54Tran_TipoIngreso ;
   private long[] H007T2_A53Tran_IdProveedor ;
   private boolean[] H007T2_n53Tran_IdProveedor ;
   private long[] H007T2_A52Tran_IdCuentadanteDestino ;
   private boolean[] H007T2_n52Tran_IdCuentadanteDestino ;
   private String[] H007T2_A407Tran_AreadanteCodigo ;
   private boolean[] H007T2_n407Tran_AreadanteCodigo ;
   private String[] H007T2_A408Tran_CursoCodigo ;
   private boolean[] H007T2_n408Tran_CursoCodigo ;
   private String[] H007T2_A575Tran_NombreProveedor ;
   private boolean[] H007T2_n575Tran_NombreProveedor ;
   private String[] H007T2_A389Tran_NombCuentadanteDestino ;
   private boolean[] H007T2_n389Tran_NombCuentadanteDestino ;
   private String[] H007T2_A672Tran_NombreIngreso ;
   private boolean[] H007T2_n672Tran_NombreIngreso ;
   private String[] H007T2_A58Tran_Estado ;
   private boolean[] H007T2_n58Tran_Estado ;
   private long[] H007T2_A50Tran_CentroCostoIdDestino ;
   private boolean[] H007T2_n50Tran_CentroCostoIdDestino ;
   private long[] H007T2_A48Tran_CentroCostoId ;
   private short[] H007T2_A667Tran_NumeroGrupo ;
   private boolean[] H007T2_n667Tran_NumeroGrupo ;
   private String[] H007T2_A524Tran_Detalle ;
   private boolean[] H007T2_n524Tran_Detalle ;
   private String[] H007T2_A608Tran_RegionAbrevDestino ;
   private boolean[] H007T2_n608Tran_RegionAbrevDestino ;
   private String[] H007T2_A594Tran_RegionAbrev ;
   private boolean[] H007T2_n594Tran_RegionAbrev ;
   private int[] H007T2_A568Tran_CantidadPadres ;
   private boolean[] H007T2_n568Tran_CantidadPadres ;
   private String[] H007T2_A527Tran_TipoEntra ;
   private boolean[] H007T2_n527Tran_TipoEntra ;
   private short[] H007T2_A519Tran_RegionCodigoDestino ;
   private boolean[] H007T2_n519Tran_RegionCodigoDestino ;
   private long[] H007T2_A518Tran_RegionIdDestino ;
   private boolean[] H007T2_n518Tran_RegionIdDestino ;
   private String[] H007T2_A517Tran_CentroCostoDescripcionDes ;
   private boolean[] H007T2_n517Tran_CentroCostoDescripcionDes ;
   private String[] H007T2_A516Tran_CentroCostoCodigoDestino ;
   private boolean[] H007T2_n516Tran_CentroCostoCodigoDestino ;
   private String[] H007T2_A520Tran_RegionDescripcionDestino ;
   private boolean[] H007T2_n520Tran_RegionDescripcionDestino ;
   private String[] H007T2_A514Tran_NumeroIngreso ;
   private boolean[] H007T2_n514Tran_NumeroIngreso ;
   private String[] H007T2_A482Tran_TipoElemento ;
   private long[] H007T2_A499Tran_CodTipoElemento ;
   private boolean[] H007T2_n499Tran_CodTipoElemento ;
   private java.math.BigDecimal[] H007T2_A483Tran_ValorTransaccion ;
   private boolean[] H007T2_n483Tran_ValorTransaccion ;
   private String[] H007T2_A481Tran_IndE_S ;
   private boolean[] H007T2_n481Tran_IndE_S ;
   private long[] H007T2_A57Tran_RegionId ;
   private boolean[] H007T2_n57Tran_RegionId ;
   private String[] H007T2_A420Tran_CentroCostoDescripcion ;
   private boolean[] H007T2_n420Tran_CentroCostoDescripcion ;
   private String[] H007T2_A418Tran_UsuarioNombre ;
   private boolean[] H007T2_n418Tran_UsuarioNombre ;
   private String[] H007T2_A417Tran_UsuarioCodigo ;
   private boolean[] H007T2_n417Tran_UsuarioCodigo ;
   private long[] H007T2_A47Tran_UsuarioId ;
   private boolean[] H007T2_n47Tran_UsuarioId ;
   private String[] H007T2_A391Tran_UsuarioRatifica ;
   private boolean[] H007T2_n391Tran_UsuarioRatifica ;
   private java.util.Date[] H007T2_A390Tran_FechaRatificacion ;
   private boolean[] H007T2_n390Tran_FechaRatificacion ;
   private long[] H007T2_A46Tran_Id ;
   private long[] H007T2_A51Tran_IdCuentadanteOrigen ;
   private boolean[] H007T2_n51Tran_IdCuentadanteOrigen ;
   private String[] H007T2_A387Tran_CodBodeDestino ;
   private String[] H007T2_A111Tran_CodAlmaDestino ;
   private String[] H007T2_A385Tran_ModuloDestino ;
   private String[] H007T2_A112Tran_CodBodeOrigen ;
   private String[] H007T2_A109Tran_CodAlmaOrigen ;
   private String[] H007T2_A110Tran_ModuloOrigen ;
   private long[] H007T3_A1Cent_Id ;
   private long[] H007T3_A23Usua_Id ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtGridState AV15GridState ;
   private com.orions2.SdtGridState_FilterValue AV16GridStateFilterValue ;
   private com.orions2.SdtTransactionContext AV36TrnContext ;
}

final  class wwalm_ratificar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H007T2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          long AV27Tran_ConsecutivoCC ,
                                          String AV26Tran_CodigoMovimiento ,
                                          short AV43Tran_RegionCodigo ,
                                          long AV35Tran_TipoIngreso ,
                                          long AV32Tran_IdProveedor ,
                                          long AV31Tran_IdCuentadanteDestino ,
                                          String AV24Tran_AreadanteCodigo ,
                                          String AV28Tran_CursoCodigo ,
                                          long A513Tran_ConsecutivoCC ,
                                          String A49Tran_CodigoMovimiento ,
                                          short A421Tran_RegionCodigo ,
                                          long A54Tran_TipoIngreso ,
                                          long A53Tran_IdProveedor ,
                                          long A52Tran_IdCuentadanteDestino ,
                                          String A407Tran_AreadanteCodigo ,
                                          String A408Tran_CursoCodigo ,
                                          String AV29Tran_DescripcionMovimiento ,
                                          String A381Tran_DescripcionMovimiento ,
                                          String AV42Tran_RegionDescripcion ,
                                          String A422Tran_RegionDescripcion ,
                                          String AV25Tran_CentroCostoCodigo ,
                                          String A419Tran_CentroCostoCodigo ,
                                          java.util.Date AV30Tran_FechaRegistro ,
                                          java.util.Date A55Tran_FechaRegistro ,
                                          String AV34Tran_Observaciones ,
                                          String A416Tran_Observaciones ,
                                          String AV21Proveedor ,
                                          String A575Tran_NombreProveedor ,
                                          String AV12Cuentadante ,
                                          String A389Tran_NombCuentadanteDestino ,
                                          String AV33Tran_NombreIngreso ,
                                          String A672Tran_NombreIngreso ,
                                          String A58Tran_Estado )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int1 ;
      GXv_int1 = new byte [8] ;
      Object[] GXv_Object2 ;
      GXv_Object2 = new Object [2] ;
      scmdbuf = "SELECT T1.Tran_Observaciones, T1.Tran_ConsecutivoCC, T1.Tran_CodigoMovimiento AS" ;
      scmdbuf = scmdbuf + " Tran_CodigoMovimiento, T2.Tpmo_Descripcion AS Tran_DescripcionMovimiento, T9.Regi_Cod" ;
      scmdbuf = scmdbuf + " AS Tran_RegionCodigo, T9.Regi_Descripcion AS Tran_RegionDescripcion, T7.Cent_Codigo" ;
      scmdbuf = scmdbuf + " AS Tran_CentroCostoCodigo, T1.Tran_FechaRegistro, T1.Tran_TipoIngreso AS Tran_TipoIngreso," ;
      scmdbuf = scmdbuf + " T1.Tran_IdProveedor AS Tran_IdProveedor, T1.Tran_IdCuentadanteDestino AS Tran_IdCuentadanteDestino," ;
      scmdbuf = scmdbuf + " T1.Tran_AreadanteCodigo, T1.Tran_CursoCodigo, T4.Cuen_Nombre AS Tran_NombreProveedor," ;
      scmdbuf = scmdbuf + " T5.Cuen_Nombre AS Tran_NombCuentadanteDestino, T3.Orig_Descripcion AS Tran_NombreIngreso," ;
      scmdbuf = scmdbuf + " T1.Tran_Estado, T1.Tran_CentroCostoIdDestino AS Tran_CentroCostoIdDestino, T1.Tran_CentroCostoId" ;
      scmdbuf = scmdbuf + " AS Tran_CentroCostoId, T1.Tran_NumeroGrupo, T1.Tran_Detalle, T8.Regi_Abrev AS Tran_RegionAbrevDestino," ;
      scmdbuf = scmdbuf + " T9.Regi_Abrev AS Tran_RegionAbrev, T1.Tran_CantidadPadres, T1.Tran_TipoEntra, T8.Regi_Cod" ;
      scmdbuf = scmdbuf + " AS Tran_RegionCodigoDestino, T1.Tran_RegionIdDestino AS Tran_RegionIdDestino, T6.Cent_Descripcion" ;
      scmdbuf = scmdbuf + " AS Tran_CentroCostoDescripcionDes, T6.Cent_Codigo AS Tran_CentroCostoCodigoDestino," ;
      scmdbuf = scmdbuf + " T8.Regi_Descripcion AS Tran_RegionDescripcionDestino, T1.Tran_NumeroIngreso, T1.Tran_TipoElemento," ;
      scmdbuf = scmdbuf + " T2.Tipo_Codigo AS Tran_CodTipoElemento, T1.Tran_ValorTransaccion, T1.Tran_IndE_S" ;
      scmdbuf = scmdbuf + " AS Tran_IndE_S, T1.Tran_RegionId AS Tran_RegionId, T7.Cent_Descripcion AS Tran_CentroCostoDescripcion," ;
      scmdbuf = scmdbuf + " T10.Usua_Nombre AS Tran_UsuarioNombre, T10.Usua_Codigo AS Tran_UsuarioCodigo, T1.Tran_UsuarioId" ;
      scmdbuf = scmdbuf + " AS Tran_UsuarioId, T1.Tran_UsuarioRatifica, T1.Tran_FechaRatificacion, T1.Tran_Id," ;
      scmdbuf = scmdbuf + " T1.Tran_IdCuentadanteOrigen, T1.Tran_CodBodeDestino, T1.Tran_CodAlmaDestino, T1.Tran_ModuloDestino," ;
      scmdbuf = scmdbuf + " T1.Tran_CodBodeOrigen, T1.Tran_CodAlmaOrigen, T1.Tran_ModuloOrigen FROM (((((((((ALM_TRANSACCION" ;
      scmdbuf = scmdbuf + " T1 INNER JOIN ALM_TIPO_MOVIMIENTO T2 ON T2.Tpmo_Codigo = T1.Tran_CodigoMovimiento)" ;
      scmdbuf = scmdbuf + " LEFT JOIN ALM_ORIGEN_BIENES T3 ON T3.Orig_Identificador = T1.Tran_TipoIngreso) LEFT" ;
      scmdbuf = scmdbuf + " JOIN ALM_CUENTADANTE T4 ON T4.Cuen_Identificacion = T1.Tran_IdProveedor) LEFT JOIN" ;
      scmdbuf = scmdbuf + " ALM_CUENTADANTE T5 ON T5.Cuen_Identificacion = T1.Tran_IdCuentadanteDestino) LEFT" ;
      scmdbuf = scmdbuf + " JOIN GEN_CENTROCOSTO T6 ON T6.Cent_Id = T1.Tran_CentroCostoIdDestino) INNER JOIN" ;
      scmdbuf = scmdbuf + " GEN_CENTROCOSTO T7 ON T7.Cent_Id = T1.Tran_CentroCostoId) LEFT JOIN GEN_REGIONAL" ;
      scmdbuf = scmdbuf + " T8 ON T8.Regi_Id = T1.Tran_RegionIdDestino) LEFT JOIN GEN_REGIONAL T9 ON T9.Regi_Id" ;
      scmdbuf = scmdbuf + " = T1.Tran_RegionId) LEFT JOIN SEG_USUARIO T10 ON T10.Usua_Id = T1.Tran_UsuarioId)" ;
      scmdbuf = scmdbuf + " WHERE (T1.Tran_Estado = 'P')" ;
      if ( ! (0==AV27Tran_ConsecutivoCC) )
      {
         sWhereString = sWhereString + " and (T1.Tran_ConsecutivoCC = ?)" ;
      }
      else
      {
         GXv_int1[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26Tran_CodigoMovimiento)==0) )
      {
         sWhereString = sWhereString + " and (T1.Tran_CodigoMovimiento like ?)" ;
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (0==AV43Tran_RegionCodigo) )
      {
         sWhereString = sWhereString + " and (T9.Regi_Cod = ?)" ;
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (0==AV35Tran_TipoIngreso) )
      {
         sWhereString = sWhereString + " and (T1.Tran_TipoIngreso = ?)" ;
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV32Tran_IdProveedor) )
      {
         sWhereString = sWhereString + " and (T1.Tran_IdProveedor = ?)" ;
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV31Tran_IdCuentadanteDestino) )
      {
         sWhereString = sWhereString + " and (T1.Tran_IdCuentadanteDestino = ?)" ;
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24Tran_AreadanteCodigo)==0) )
      {
         sWhereString = sWhereString + " and (T1.Tran_AreadanteCodigo = ?)" ;
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV28Tran_CursoCodigo)==0) )
      {
         sWhereString = sWhereString + " and (T1.Tran_CursoCodigo = ?)" ;
      }
      else
      {
         GXv_int1[7] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY T1.Tran_FechaRegistro DESC" ;
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
                  return conditional_H007T2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() , ((Number) dynConstraints[13]).longValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H007T2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
         ,new ForEachCursor("H007T3", "SELECT Cent_Id, Usua_Id FROM SEG_USUARIO_CENTRO WHERE Usua_Id = ? and Cent_Id = ? ORDER BY Usua_Id, Cent_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(8) ;
               ((long[]) buf[14])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((long[]) buf[18])[0] = rslt.getLong(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 1) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((long[]) buf[32])[0] = rslt.getLong(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((long[]) buf[34])[0] = rslt.getLong(19) ;
               ((short[]) buf[35])[0] = rslt.getShort(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(25, 4) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((long[]) buf[49])[0] = rslt.getLong(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(31, 30) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(32, 1) ;
               ((long[]) buf[60])[0] = rslt.getLong(33) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(34,2) ;
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((long[]) buf[66])[0] = rslt.getLong(36) ;
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getVarchar(37) ;
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getVarchar(38) ;
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((long[]) buf[74])[0] = rslt.getLong(40) ;
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[78])[0] = rslt.getGXDateTime(42) ;
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((long[]) buf[80])[0] = rslt.getLong(43) ;
               ((long[]) buf[81])[0] = rslt.getLong(44) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(45) ;
               ((String[]) buf[84])[0] = rslt.getVarchar(46) ;
               ((String[]) buf[85])[0] = rslt.getVarchar(47) ;
               ((String[]) buf[86])[0] = rslt.getVarchar(48) ;
               ((String[]) buf[87])[0] = rslt.getVarchar(49) ;
               ((String[]) buf[88])[0] = rslt.getVarchar(50) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
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
                  stmt.setBigDecimal(sIdx, ((Number) parms[8]).longValue(), 0);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[12]).longValue(), 0);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[13]).longValue(), 0);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 41);
               }
               return;
            case 1 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

