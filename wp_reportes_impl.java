/*
               File: wp_reportes_impl
        Description: Reportes
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 10:58:26.72
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

public final  class wp_reportes_impl extends GXDataArea
{
   public wp_reportes_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wp_reportes_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wp_reportes_impl.class ));
   }

   public wp_reportes_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynavRpt_rep_id = new HTMLChoice();
      dynavRegional = new HTMLChoice();
      chkavTodosregional = UIFactory.getCheckbox(this);
      dynavCentro_costo = new HTMLChoice();
      chkavTodoscentros = UIFactory.getCheckbox(this);
      cmbavModulo = new HTMLChoice();
      chkavTodosmodulo = UIFactory.getCheckbox(this);
      dynavAlmacen = new HTMLChoice();
      chkavTodosalmacenes = UIFactory.getCheckbox(this);
      dynavBodega = new HTMLChoice();
      chkavTodosbodegas = UIFactory.getCheckbox(this);
      chkavTodoscuentadante = UIFactory.getCheckbox(this);
      cmbavEstado_inicial = new HTMLChoice();
      cmbavEstado_final = new HTMLChoice();
      dynavMovimiento_inicial = new HTMLChoice();
      dynavMovimiento_final = new HTMLChoice();
      dynavTipo_codigo = new HTMLChoice();
      cmbavFormato = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vRPT_REP_ID") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvrpt_rep_id9L2( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vREGIONAL") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvregional9L2( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vCENTRO_COSTO") == 0 )
         {
            AV6Regional = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6Regional", GXutil.ltrim( GXutil.str( AV6Regional, 11, 0)));
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvcentro_costo9L2( AV6Regional) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vALMACEN") == 0 )
         {
            AV8Centro_Costo = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Centro_Costo", GXutil.ltrim( GXutil.str( AV8Centro_Costo, 11, 0)));
            AV7Modulo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Modulo", AV7Modulo);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvalmacen9L2( AV8Centro_Costo, AV7Modulo) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vBODEGA") == 0 )
         {
            AV8Centro_Costo = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Centro_Costo", GXutil.ltrim( GXutil.str( AV8Centro_Costo, 11, 0)));
            AV7Modulo = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Modulo", AV7Modulo);
            AV9Almacen = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Almacen", AV9Almacen);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvbodega9L2( AV8Centro_Costo, AV7Modulo, AV9Almacen) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_163 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_163_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_163_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid1_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( ) ;
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
      pa9L2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start9L2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186181058276");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wp_reportes") +"\">") ;
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
      /* Send saved values. */
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtsku", AV46SDTSKU);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtsku", AV46SDTSKU);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_163", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_163, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_NOMBRE", A844RPT_REP_NOMBRE);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vRPT_REP_NOMBRE", AV20RPT_REP_NOMBRE);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_ID", GXutil.ltrim( localUtil.ntoc( A843RPT_REP_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_PAR_ESTADO", GXutil.rtrim( A842RPT_PAR_ESTADO));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_PAR_ID", GXutil.ltrim( localUtil.ntoc( A840RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vRPT_PAR_ID", GXutil.ltrim( localUtil.ntoc( AV21RPT_PAR_ID, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "RPT_REP_PARM_ESTADO", GXutil.rtrim( A853RPT_REP_PARM_ESTADO));
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vCOORDINADOR", AV58Coordinador);
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vSW", AV22SW);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGI_COD", GXutil.ltrim( localUtil.ntoc( AV38Regi_Cod, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_ID", GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_COD", GXutil.ltrim( localUtil.ntoc( A12Regi_Cod, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_CODIGO", AV39Cent_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ID", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CODIGO", A3Cent_Codigo);
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vSW_CUENTADANTE", AV26SW_Cuentadante);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_CEDULA", GXutil.ltrim( localUtil.ntoc( A688Cuen_Cedula, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCUEN_CEDULA", GXutil.ltrim( localUtil.ntoc( AV62Cuen_Cedula, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vSW_CONSECUTIVO", AV80SW_Consecutivo);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTSKU", AV46SDTSKU);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTSKU", AV46SDTSKU);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACA", A67Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_CODIGO", A37Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCION", A298Cata_Descripcion);
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vSW_SKU", AV79SW_SKU);
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vSW_FECHAINI", AV77SW_FechaIni);
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vSW_FECHAFIN", AV78SW_FechaFin);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV68Usuario);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
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
         we9L2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt9L2( ) ;
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
      return formatLink("com.orions2.wp_reportes")  ;
   }

   public String getPgmname( )
   {
      return "WP_REPORTES" ;
   }

   public String getPgmdesc( )
   {
      return "Reportes" ;
   }

   public void wb9L0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-8 col-lg-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Generación de Reportes", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_WP_REPORTES.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavRpt_rep_id.getInternalname(), "Seleccione el reporte", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavRpt_rep_id, dynavRpt_rep_id.getInternalname(), GXutil.trim( GXutil.str( AV5RPT_REP_ID, 4, 0)), 1, dynavRpt_rep_id.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynavRpt_rep_id.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,21);\"", "", true, "HLP_WP_REPORTES.htm");
         dynavRpt_rep_id.setValue( GXutil.trim( GXutil.str( AV5RPT_REP_ID, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavRpt_rep_id.getInternalname(), "Values", dynavRpt_rep_id.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "Filtros", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         httpContext.writeText( "<hr/>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-9", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavRegional.getInternalname(), "Regional", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavRegional, dynavRegional.getInternalname(), GXutil.trim( GXutil.str( AV6Regional, 11, 0)), 1, dynavRegional.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", dynavRegional.getVisible(), dynavRegional.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "", true, "HLP_WP_REPORTES.htm");
         dynavRegional.setValue( GXutil.trim( GXutil.str( AV6Regional, 11, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavRegional.getInternalname(), "Values", dynavRegional.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, chkavTodosregional.getInternalname(), "Todos", "col-sm-3 AttributeLabel", 1, true);
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_checkbox_ctrl( httpContext, chkavTodosregional.getInternalname(), GXutil.booltostr( AV24TodosRegional), "", "Todos", chkavTodosregional.getVisible(), chkavTodosregional.getEnabled(), "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(36, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-9", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavCentro_costo.getInternalname(), "Centro de costo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavCentro_costo, dynavCentro_costo.getInternalname(), GXutil.trim( GXutil.str( AV8Centro_Costo, 11, 0)), 1, dynavCentro_costo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", dynavCentro_costo.getVisible(), dynavCentro_costo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "", true, "HLP_WP_REPORTES.htm");
         dynavCentro_costo.setValue( GXutil.trim( GXutil.str( AV8Centro_Costo, 11, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavCentro_costo.getInternalname(), "Values", dynavCentro_costo.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, chkavTodoscentros.getInternalname(), "Todos", "col-sm-3 AttributeLabel", 1, true);
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_checkbox_ctrl( httpContext, chkavTodoscentros.getInternalname(), GXutil.booltostr( AV25TodosCentros), "", "Todos", chkavTodoscentros.getVisible(), chkavTodoscentros.getEnabled(), "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(43, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-9", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavModulo.getInternalname(), "Módulo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavModulo, cmbavModulo.getInternalname(), GXutil.rtrim( AV7Modulo), 1, cmbavModulo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", cmbavModulo.getVisible(), cmbavModulo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "", true, "HLP_WP_REPORTES.htm");
         cmbavModulo.setValue( GXutil.rtrim( AV7Modulo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavModulo.getInternalname(), "Values", cmbavModulo.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, chkavTodosmodulo.getInternalname(), "Todos", "col-sm-3 AttributeLabel", 1, true);
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_checkbox_ctrl( httpContext, chkavTodosmodulo.getInternalname(), GXutil.booltostr( AV70TodosModulo), "", "Todos", chkavTodosmodulo.getVisible(), chkavTodosmodulo.getEnabled(), "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(50, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-9", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavAlmacen.getInternalname(), "Almacén", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavAlmacen, dynavAlmacen.getInternalname(), GXutil.rtrim( AV9Almacen), 1, dynavAlmacen.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", dynavAlmacen.getVisible(), dynavAlmacen.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "", true, "HLP_WP_REPORTES.htm");
         dynavAlmacen.setValue( GXutil.rtrim( AV9Almacen) );
         httpContext.ajax_rsp_assign_prop("", false, dynavAlmacen.getInternalname(), "Values", dynavAlmacen.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, chkavTodosalmacenes.getInternalname(), "Todos", "col-sm-3 AttributeLabel", 1, true);
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_checkbox_ctrl( httpContext, chkavTodosalmacenes.getInternalname(), GXutil.booltostr( AV71TodosAlmacenes), "", "Todos", chkavTodosalmacenes.getVisible(), chkavTodosalmacenes.getEnabled(), "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(57, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-9", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavBodega.getInternalname(), "Bodega", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavBodega, dynavBodega.getInternalname(), GXutil.rtrim( AV19Bodega), 1, dynavBodega.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", dynavBodega.getVisible(), dynavBodega.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "", true, "HLP_WP_REPORTES.htm");
         dynavBodega.setValue( GXutil.rtrim( AV19Bodega) );
         httpContext.ajax_rsp_assign_prop("", false, dynavBodega.getInternalname(), "Values", dynavBodega.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, chkavTodosbodegas.getInternalname(), "Todos", "col-sm-3 AttributeLabel", 1, true);
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_checkbox_ctrl( httpContext, chkavTodosbodegas.getInternalname(), GXutil.booltostr( AV72TodosBodegas), "", "Todos", chkavTodosbodegas.getVisible(), chkavTodosbodegas.getEnabled(), "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(64, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-9", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCedula_Internalname, "Cédula", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCedula_Internalname, GXutil.ltrim( localUtil.ntoc( AV11Cedula, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11Cedula), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCedula_Jsonclick, 0, "Attribute", "", "", "", edtavCedula_Visible, edtavCedula_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, chkavTodoscuentadante.getInternalname(), "Todos", "col-sm-3 AttributeLabel", 1, true);
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_checkbox_ctrl( httpContext, chkavTodoscuentadante.getInternalname(), GXutil.booltostr( AV73TodosCuentadante), "", "Todos", chkavTodoscuentadante.getVisible(), chkavTodoscuentadante.getEnabled(), "true", "", StyleString, ClassString, "", TempTags+" onclick=\"gx.fn.checkboxClick(71, this, 'true', 'false');gx.evt.onchange(this);\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavFecha_inicial_Internalname, "Fecha inicial", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFecha_inicial_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavFecha_inicial_Internalname, localUtil.format(AV12Fecha_Inicial, "99/99/9999"), localUtil.format( AV12Fecha_Inicial, "99/99/9999"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFecha_inicial_Jsonclick, 0, "Attribute", "", "", "", edtavFecha_inicial_Visible, edtavFecha_inicial_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavFecha_inicial_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavFecha_inicial_Visible==0)||(edtavFecha_inicial_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WP_REPORTES.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavFecha_final_Internalname, "Fecha final", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFecha_final_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavFecha_final_Internalname, localUtil.format(AV13Fecha_Final, "99/99/9999"), localUtil.format( AV13Fecha_Final, "99/99/9999"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFecha_final_Jsonclick, 0, "Attribute", "", "", "", edtavFecha_final_Visible, edtavFecha_final_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavFecha_final_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavFecha_final_Visible==0)||(edtavFecha_final_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WP_REPORTES.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavEstado_inicial.getInternalname(), "Estado inicial", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavEstado_inicial, cmbavEstado_inicial.getInternalname(), GXutil.rtrim( AV14Estado_Inicial), 1, cmbavEstado_inicial.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavEstado_inicial.getVisible(), cmbavEstado_inicial.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "", true, "HLP_WP_REPORTES.htm");
         cmbavEstado_inicial.setValue( GXutil.rtrim( AV14Estado_Inicial) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_inicial.getInternalname(), "Values", cmbavEstado_inicial.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavEstado_final.getInternalname(), "Estado final", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavEstado_final, cmbavEstado_final.getInternalname(), GXutil.rtrim( AV15Estado_Final), 1, cmbavEstado_final.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavEstado_final.getVisible(), cmbavEstado_final.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "", true, "HLP_WP_REPORTES.htm");
         cmbavEstado_final.setValue( GXutil.rtrim( AV15Estado_Final) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_final.getInternalname(), "Values", cmbavEstado_final.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavMovimiento_inicial.getInternalname(), "Movimiento inicial", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavMovimiento_inicial, dynavMovimiento_inicial.getInternalname(), GXutil.rtrim( AV16Movimiento_Inicial), 1, dynavMovimiento_inicial.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", dynavMovimiento_inicial.getVisible(), dynavMovimiento_inicial.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "", true, "HLP_WP_REPORTES.htm");
         dynavMovimiento_inicial.setValue( GXutil.rtrim( AV16Movimiento_Inicial) );
         httpContext.ajax_rsp_assign_prop("", false, dynavMovimiento_inicial.getInternalname(), "Values", dynavMovimiento_inicial.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavMovimiento_final.getInternalname(), "Movimiento final", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavMovimiento_final, dynavMovimiento_final.getInternalname(), GXutil.rtrim( AV17Movimiento_Final), 1, dynavMovimiento_final.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", dynavMovimiento_final.getVisible(), dynavMovimiento_final.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,92);\"", "", true, "HLP_WP_REPORTES.htm");
         dynavMovimiento_final.setValue( GXutil.rtrim( AV17Movimiento_Final) );
         httpContext.ajax_rsp_assign_prop("", false, dynavMovimiento_final.getInternalname(), "Values", dynavMovimiento_final.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTrans_consecutivocc_Internalname, "Transacción inicial", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTrans_consecutivocc_Internalname, GXutil.ltrim( localUtil.ntoc( AV27Trans_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtavTrans_consecutivocc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27Trans_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV27Trans_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTrans_consecutivocc_Jsonclick, 0, "Attribute", "", "", "", edtavTrans_consecutivocc_Visible, edtavTrans_consecutivocc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTrans_consecutivoccfin_Internalname, "Transacción final", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTrans_consecutivoccfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV28Trans_ConsecutivoCCFin, (byte)(18), (byte)(0), ",", "")), ((edtavTrans_consecutivoccfin_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28Trans_ConsecutivoCCFin), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV28Trans_ConsecutivoCCFin), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTrans_consecutivoccfin_Jsonclick, 0, "Attribute", "", "", "", edtavTrans_consecutivoccfin_Visible, edtavTrans_consecutivoccfin_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavTipo_codigo.getInternalname(), "Tipo de Elemento", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavTipo_codigo, dynavTipo_codigo.getInternalname(), GXutil.trim( GXutil.str( AV29Tipo_Codigo, 18, 0)), 1, dynavTipo_codigo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", dynavTipo_codigo.getVisible(), dynavTipo_codigo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"", "", true, "HLP_WP_REPORTES.htm");
         dynavTipo_codigo.setValue( GXutil.trim( GXutil.str( AV29Tipo_Codigo, 18, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavTipo_codigo.getInternalname(), "Values", dynavTipo_codigo.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavProveedor_Internalname, "Nit Proveedor", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavProveedor_Internalname, GXutil.ltrim( localUtil.ntoc( AV61Proveedor, (byte)(18), (byte)(0), ",", "")), ((edtavProveedor_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV61Proveedor), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV61Proveedor), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProveedor_Jsonclick, 0, "Attribute", "", "", "", edtavProveedor_Visible, edtavProveedor_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImageareadante_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImageareadante_Visible, 1, "Seleccionar areadante", "Seleccionar areadante", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImageareadante_Jsonclick, "'"+""+"'"+",false,"+"'"+"e119l1_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavArea_codigo_Internalname, "Código Areadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavArea_codigo_Internalname, AV63Area_Codigo, GXutil.rtrim( localUtil.format( AV63Area_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArea_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavArea_codigo_Visible, edtavArea_codigo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavArea_descripcion_Internalname, "Descripción Areadante", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavArea_descripcion_Internalname, AV66Area_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", (short)(0), edtavArea_descripcion_Visible, edtavArea_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImagecurso_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImagecurso_Visible, 1, "Seleccionar curso", "Seleccionar curso", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImagecurso_Jsonclick, "'"+""+"'"+",false,"+"'"+"e129l1_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCurs_codigo_Internalname, "Código del Curso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCurs_codigo_Internalname, AV64Curs_Codigo, GXutil.rtrim( localUtil.format( AV64Curs_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCurs_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCurs_codigo_Visible, edtavCurs_codigo_Enabled, 0, "text", "", 41, "chr", 1, "row", 41, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCurs_descripcion_Internalname, "Descripción del Curso", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCurs_descripcion_Internalname, AV67Curs_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", (short)(0), edtavCurs_descripcion_Visible, edtavCurs_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPlaca_Internalname, "Placa", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPlaca_Internalname, AV74Placa, GXutil.rtrim( localUtil.format( AV74Placa, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPlaca_Jsonclick, 0, "Attribute", "", "", "", edtavPlaca_Visible, edtavPlaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPeriodo_Internalname, "Periodo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPeriodo_Internalname, GXutil.rtrim( AV84Periodo), GXutil.rtrim( localUtil.format( AV84Periodo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPeriodo_Jsonclick, 0, "Attribute", "", "", "", edtavPeriodo_Visible, edtavPeriodo_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavFormato.getInternalname(), "Formato", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavFormato, cmbavFormato.getInternalname(), GXutil.rtrim( AV32Formato), 1, cmbavFormato.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavFormato.getVisible(), cmbavFormato.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,137);\"", "", true, "HLP_WP_REPORTES.htm");
         cmbavFormato.setValue( GXutil.rtrim( AV32Formato) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavFormato.getInternalname(), "Values", cmbavFormato.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable3_Internalname, divTable3_Visible, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "SKU", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         httpContext.writeText( "<hr/>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage7_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar SKU", "Seleccionar SKU", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage7_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'SKU\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPelem_consecutivo_Internalname, "Consecutivo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPelem_consecutivo_Internalname, AV45pElem_Consecutivo, GXutil.rtrim( localUtil.format( AV45pElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavPelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPcata_descripcion_Internalname, "Descripción del bien", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'" + sGXsfl_163_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavPcata_descripcion_Internalname, AV44pCata_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,157);\"", (short)(0), 1, edtavPcata_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttAgregarsku_Internalname, "gx.evt.setGridEvt("+GXutil.str( 163, 3, 0)+","+"null"+");", "Agregar SKU", bttAgregarsku_Jsonclick, 5, "Agregar SKU", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'AGREGAR SKU\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"163\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid1_Backcolorstyle == 0 )
            {
               subGrid1_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
            else
            {
               subGrid1_Titlebackstyle = (byte)(1) ;
               if ( subGrid1_Backcolorstyle == 1 )
               {
                  subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid1_Class) > 0 )
                  {
                     subGrid1_Linesclass = subGrid1_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Descripción del bien") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "WorkWith");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlelem_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcata_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 163 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_163 = (short)(nGXsfl_163_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV91GXV1 = nGXsfl_163_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"ALERTIFY1Container"+"\"></div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Right", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttConfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 163, 3, 0)+","+"null"+");", "Confirmar", bttConfirmar_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_REPORTES.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttCancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 163, 3, 0)+","+"null"+");", "Cancelar", bttCancelar_Jsonclick, 5, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_REPORTES.htm");
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

   public void start9L2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Reportes", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup9L0( ) ;
   }

   public void ws9L2( )
   {
      start9L2( ) ;
      evt9L2( ) ;
   }

   public void evt9L2( )
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
                        else if ( GXutil.strcmp(sEvt, "VRPT_REP_ID.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e139L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VREGIONAL.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e149L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCENTRO_COSTO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e159L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCEDULA.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e169L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROVEEDOR.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e179L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CANCELAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Cancelar' */
                           e189L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'AGREGAR SKU'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Agregar SKU' */
                           e199L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPLACA.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e209L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPERIODO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e219L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPELEM_CONSECUTIVO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e229L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Confirmar' */
                           e239L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'SKU'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'SKU' */
                           e249L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_163_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_1632( ) ;
                           AV91GXV1 = nGXsfl_163_idx ;
                           if ( ( AV46SDTSKU.size() >= AV91GXV1 ) && ( AV91GXV1 > 0 ) )
                           {
                              AV46SDTSKU.currentItem( ((com.orions2.SdtSDTSku_SDTSkuItem)AV46SDTSKU.elementAt(-1+AV91GXV1)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e259L2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e269L2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
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

   public void we9L2( )
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

   public void pa9L2( )
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
         dynavRpt_rep_id.setName( "vRPT_REP_ID" );
         dynavRpt_rep_id.setWebtags( "" );
         dynavRegional.setName( "vREGIONAL" );
         dynavRegional.setWebtags( "" );
         chkavTodosregional.setName( "vTODOSREGIONAL" );
         chkavTodosregional.setWebtags( "" );
         chkavTodosregional.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTodosregional.getInternalname(), "TitleCaption", chkavTodosregional.getCaption(), true);
         chkavTodosregional.setCheckedValue( "false" );
         dynavCentro_costo.setName( "vCENTRO_COSTO" );
         dynavCentro_costo.setWebtags( "" );
         chkavTodoscentros.setName( "vTODOSCENTROS" );
         chkavTodoscentros.setWebtags( "" );
         chkavTodoscentros.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTodoscentros.getInternalname(), "TitleCaption", chkavTodoscentros.getCaption(), true);
         chkavTodoscentros.setCheckedValue( "false" );
         cmbavModulo.setName( "vMODULO" );
         cmbavModulo.setWebtags( "" );
         cmbavModulo.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbavModulo.addItem("INVE", "INVENTARIO", (short)(0));
         cmbavModulo.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbavModulo.getItemCount() > 0 )
         {
            AV7Modulo = cmbavModulo.getValidValue(AV7Modulo) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Modulo", AV7Modulo);
         }
         chkavTodosmodulo.setName( "vTODOSMODULO" );
         chkavTodosmodulo.setWebtags( "" );
         chkavTodosmodulo.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTodosmodulo.getInternalname(), "TitleCaption", chkavTodosmodulo.getCaption(), true);
         chkavTodosmodulo.setCheckedValue( "false" );
         dynavAlmacen.setName( "vALMACEN" );
         dynavAlmacen.setWebtags( "" );
         chkavTodosalmacenes.setName( "vTODOSALMACENES" );
         chkavTodosalmacenes.setWebtags( "" );
         chkavTodosalmacenes.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTodosalmacenes.getInternalname(), "TitleCaption", chkavTodosalmacenes.getCaption(), true);
         chkavTodosalmacenes.setCheckedValue( "false" );
         dynavBodega.setName( "vBODEGA" );
         dynavBodega.setWebtags( "" );
         chkavTodosbodegas.setName( "vTODOSBODEGAS" );
         chkavTodosbodegas.setWebtags( "" );
         chkavTodosbodegas.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTodosbodegas.getInternalname(), "TitleCaption", chkavTodosbodegas.getCaption(), true);
         chkavTodosbodegas.setCheckedValue( "false" );
         chkavTodoscuentadante.setName( "vTODOSCUENTADANTE" );
         chkavTodoscuentadante.setWebtags( "" );
         chkavTodoscuentadante.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTodoscuentadante.getInternalname(), "TitleCaption", chkavTodoscuentadante.getCaption(), true);
         chkavTodoscuentadante.setCheckedValue( "false" );
         cmbavEstado_inicial.setName( "vESTADO_INICIAL" );
         cmbavEstado_inicial.setWebtags( "" );
         cmbavEstado_inicial.addItem("A", "Anulada", (short)(0));
         cmbavEstado_inicial.addItem("E", "Eliminada", (short)(0));
         cmbavEstado_inicial.addItem("I", "Incompleta", (short)(0));
         cmbavEstado_inicial.addItem("P", "Pendiente", (short)(0));
         cmbavEstado_inicial.addItem("R", "Ratificada", (short)(0));
         if ( cmbavEstado_inicial.getItemCount() > 0 )
         {
            AV14Estado_Inicial = cmbavEstado_inicial.getValidValue(AV14Estado_Inicial) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Estado_Inicial", AV14Estado_Inicial);
         }
         cmbavEstado_final.setName( "vESTADO_FINAL" );
         cmbavEstado_final.setWebtags( "" );
         cmbavEstado_final.addItem("A", "Anulada", (short)(0));
         cmbavEstado_final.addItem("E", "Eliminada", (short)(0));
         cmbavEstado_final.addItem("I", "Incompleta", (short)(0));
         cmbavEstado_final.addItem("P", "Pendiente", (short)(0));
         cmbavEstado_final.addItem("R", "Ratificada", (short)(0));
         if ( cmbavEstado_final.getItemCount() > 0 )
         {
            AV15Estado_Final = cmbavEstado_final.getValidValue(AV15Estado_Final) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Estado_Final", AV15Estado_Final);
         }
         dynavMovimiento_inicial.setName( "vMOVIMIENTO_INICIAL" );
         dynavMovimiento_inicial.setWebtags( "" );
         dynavMovimiento_inicial.removeAllItems();
         /* Using cursor H009L2 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            dynavMovimiento_inicial.addItem(H009L2_A38Tpmo_Codigo[0], H009L2_A38Tpmo_Codigo[0], (short)(0));
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( dynavMovimiento_inicial.getItemCount() > 0 )
         {
            AV16Movimiento_Inicial = dynavMovimiento_inicial.getValidValue(AV16Movimiento_Inicial) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Movimiento_Inicial", AV16Movimiento_Inicial);
         }
         dynavMovimiento_final.setName( "vMOVIMIENTO_FINAL" );
         dynavMovimiento_final.setWebtags( "" );
         dynavMovimiento_final.removeAllItems();
         /* Using cursor H009L3 */
         pr_default.execute(1);
         while ( (pr_default.getStatus(1) != 101) )
         {
            dynavMovimiento_final.addItem(H009L3_A38Tpmo_Codigo[0], H009L3_A38Tpmo_Codigo[0], (short)(0));
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( dynavMovimiento_final.getItemCount() > 0 )
         {
            AV17Movimiento_Final = dynavMovimiento_final.getValidValue(AV17Movimiento_Final) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Movimiento_Final", AV17Movimiento_Final);
         }
         dynavTipo_codigo.setName( "vTIPO_CODIGO" );
         dynavTipo_codigo.setWebtags( "" );
         dynavTipo_codigo.removeAllItems();
         /* Using cursor H009L4 */
         pr_default.execute(2);
         while ( (pr_default.getStatus(2) != 101) )
         {
            dynavTipo_codigo.addItem(GXutil.trim( GXutil.str( H009L4_A33Tipo_Codigo[0], 18, 0)), H009L4_A253Tipo_Descripcion[0], (short)(0));
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( dynavTipo_codigo.getItemCount() > 0 )
         {
            AV29Tipo_Codigo = GXutil.lval( dynavTipo_codigo.getValidValue(GXutil.trim( GXutil.str( AV29Tipo_Codigo, 18, 0)))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Tipo_Codigo", GXutil.ltrim( GXutil.str( AV29Tipo_Codigo, 18, 0)));
         }
         cmbavFormato.setName( "vFORMATO" );
         cmbavFormato.setWebtags( "" );
         cmbavFormato.addItem("pdf", "PDF", (short)(0));
         cmbavFormato.addItem("xls", "Plano", (short)(0));
         if ( cmbavFormato.getItemCount() > 0 )
         {
            AV32Formato = cmbavFormato.getValidValue(AV32Formato) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Formato", AV32Formato);
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
            GX_FocusControl = dynavRpt_rep_id.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      gxvvcentro_costo_html9L2( AV6Regional) ;
      gxvvalmacen_html9L2( AV8Centro_Costo, AV7Modulo) ;
      gxvvalmacen_html9L2( AV8Centro_Costo, AV7Modulo) ;
      gxvvbodega_html9L2( AV8Centro_Costo, AV7Modulo, AV9Almacen) ;
      gxvvbodega_html9L2( AV8Centro_Costo, AV7Modulo, AV9Almacen) ;
      gxvvbodega_html9L2( AV8Centro_Costo, AV7Modulo, AV9Almacen) ;
      /* End function dynload_actions */
   }

   public void gxdlvvtipo_codigo9L1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvvtipo_codigo_data9L1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxvvtipo_codigo_html9L1( )
   {
      long gxdynajaxvalue ;
      gxdlvvtipo_codigo_data9L1( ) ;
      gxdynajaxindex = 1 ;
      dynavTipo_codigo.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex)) ;
         dynavTipo_codigo.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 18, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavTipo_codigo.getItemCount() > 0 )
      {
         AV29Tipo_Codigo = GXutil.lval( dynavTipo_codigo.getValidValue(GXutil.trim( GXutil.str( AV29Tipo_Codigo, 18, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Tipo_Codigo", GXutil.ltrim( GXutil.str( AV29Tipo_Codigo, 18, 0)));
      }
   }

   protected void gxdlvvtipo_codigo_data9L1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H009L5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H009L5_A33Tipo_Codigo[0], (byte)(18), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(H009L5_A253Tipo_Descripcion[0]);
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxdlvvmovimiento_final9L1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvvmovimiento_final_data9L1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxvvmovimiento_final_html9L1( )
   {
      String gxdynajaxvalue ;
      gxdlvvmovimiento_final_data9L1( ) ;
      gxdynajaxindex = 1 ;
      dynavMovimiento_final.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavMovimiento_final.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavMovimiento_final.getItemCount() > 0 )
      {
         AV17Movimiento_Final = dynavMovimiento_final.getValidValue(AV17Movimiento_Final) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Movimiento_Final", AV17Movimiento_Final);
      }
   }

   protected void gxdlvvmovimiento_final_data9L1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H009L6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxdynajaxctrlcodr.add(H009L6_A38Tpmo_Codigo[0]);
         gxdynajaxctrldescr.add(H009L6_A38Tpmo_Codigo[0]);
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void gxdlvvmovimiento_inicial9L1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvvmovimiento_inicial_data9L1( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxvvmovimiento_inicial_html9L1( )
   {
      String gxdynajaxvalue ;
      gxdlvvmovimiento_inicial_data9L1( ) ;
      gxdynajaxindex = 1 ;
      dynavMovimiento_inicial.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavMovimiento_inicial.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavMovimiento_inicial.getItemCount() > 0 )
      {
         AV16Movimiento_Inicial = dynavMovimiento_inicial.getValidValue(AV16Movimiento_Inicial) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Movimiento_Inicial", AV16Movimiento_Inicial);
      }
   }

   protected void gxdlvvmovimiento_inicial_data9L1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H009L7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         gxdynajaxctrlcodr.add(H009L7_A38Tpmo_Codigo[0]);
         gxdynajaxctrldescr.add(H009L7_A38Tpmo_Codigo[0]);
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void gxdlvvrpt_rep_id9L2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvvrpt_rep_id_data9L2( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxvvrpt_rep_id_html9L2( )
   {
      short gxdynajaxvalue ;
      gxdlvvrpt_rep_id_data9L2( ) ;
      gxdynajaxindex = 1 ;
      dynavRpt_rep_id.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynavRpt_rep_id.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavRpt_rep_id.getItemCount() > 0 )
      {
         AV5RPT_REP_ID = (short)(GXutil.lval( dynavRpt_rep_id.getValidValue(GXutil.trim( GXutil.str( AV5RPT_REP_ID, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5RPT_REP_ID", GXutil.ltrim( GXutil.str( AV5RPT_REP_ID, 4, 0)));
      }
   }

   protected void gxdlvvrpt_rep_id_data9L2( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add(GXutil.ltrim( GXutil.str( 0, 9, 0)));
      gxdynajaxctrldescr.add("(Ninguno)");
      /* Using cursor H009L8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H009L8_A843RPT_REP_ID[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(H009L8_A845RPT_REP_DESCRIPCION[0]);
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void gxdlvvregional9L2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvvregional_data9L2( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxvvregional_html9L2( )
   {
      long gxdynajaxvalue ;
      gxdlvvregional_data9L2( ) ;
      gxdynajaxindex = 1 ;
      dynavRegional.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex)) ;
         dynavRegional.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 11, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavRegional.getItemCount() > 0 )
      {
         AV6Regional = GXutil.lval( dynavRegional.getValidValue(GXutil.trim( GXutil.str( AV6Regional, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Regional", GXutil.ltrim( GXutil.str( AV6Regional, 11, 0)));
      }
   }

   protected void gxdlvvregional_data9L2( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H009L9 */
      pr_default.execute(7);
      while ( (pr_default.getStatus(7) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H009L9_A2Regi_Id[0], (byte)(11), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(H009L9_A13Regi_Descripcion[0]);
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void gxdlvvcentro_costo9L2( long AV6Regional )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvvcentro_costo_data9L2( AV6Regional) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxvvcentro_costo_html9L2( long AV6Regional )
   {
      long gxdynajaxvalue ;
      gxdlvvcentro_costo_data9L2( AV6Regional) ;
      gxdynajaxindex = 1 ;
      dynavCentro_costo.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex)) ;
         dynavCentro_costo.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 11, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavCentro_costo.getItemCount() > 0 )
      {
         AV8Centro_Costo = GXutil.lval( dynavCentro_costo.getValidValue(GXutil.trim( GXutil.str( AV8Centro_Costo, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Centro_Costo", GXutil.ltrim( GXutil.str( AV8Centro_Costo, 11, 0)));
      }
   }

   protected void gxdlvvcentro_costo_data9L2( long AV6Regional )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H009L10 */
      pr_default.execute(8, new Object[] {new Long(AV6Regional)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H009L10_A1Cent_Id[0], (byte)(11), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(H009L10_A4Cent_Descripcion[0]);
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void gxdlvvalmacen9L2( long AV8Centro_Costo ,
                                 String AV7Modulo )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvvalmacen_data9L2( AV8Centro_Costo, AV7Modulo) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxvvalmacen_html9L2( long AV8Centro_Costo ,
                                    String AV7Modulo )
   {
      String gxdynajaxvalue ;
      gxdlvvalmacen_data9L2( AV8Centro_Costo, AV7Modulo) ;
      gxdynajaxindex = 1 ;
      dynavAlmacen.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavAlmacen.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavAlmacen.getItemCount() > 0 )
      {
         AV9Almacen = dynavAlmacen.getValidValue(AV9Almacen) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Almacen", AV9Almacen);
      }
   }

   protected void gxdlvvalmacen_data9L2( long AV8Centro_Costo ,
                                         String AV7Modulo )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H009L11 */
      pr_default.execute(9, new Object[] {new Long(AV8Centro_Costo), AV7Modulo});
      while ( (pr_default.getStatus(9) != 101) )
      {
         gxdynajaxctrlcodr.add(H009L11_A28Alma_Codigo[0]);
         gxdynajaxctrldescr.add(H009L11_A252Alma_Descripcion[0]);
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void gxdlvvbodega9L2( long AV8Centro_Costo ,
                                String AV7Modulo ,
                                String AV9Almacen )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvvbodega_data9L2( AV8Centro_Costo, AV7Modulo, AV9Almacen) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         httpContext.GX_webresponse.addString(gxwrpcisep+"{c:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",d:\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}");
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      httpContext.GX_webresponse.addString(")");
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         httpContext.GX_webresponse.addString(",101");
      }
      httpContext.GX_webresponse.addString("))");
   }

   public void gxvvbodega_html9L2( long AV8Centro_Costo ,
                                   String AV7Modulo ,
                                   String AV9Almacen )
   {
      String gxdynajaxvalue ;
      gxdlvvbodega_data9L2( AV8Centro_Costo, AV7Modulo, AV9Almacen) ;
      gxdynajaxindex = 1 ;
      dynavBodega.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavBodega.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavBodega.getItemCount() > 0 )
      {
         AV19Bodega = dynavBodega.getValidValue(AV19Bodega) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Bodega", AV19Bodega);
      }
   }

   protected void gxdlvvbodega_data9L2( long AV8Centro_Costo ,
                                        String AV7Modulo ,
                                        String AV9Almacen )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H009L12 */
      pr_default.execute(10, new Object[] {new Long(AV8Centro_Costo), AV7Modulo, AV9Almacen});
      while ( (pr_default.getStatus(10) != 101) )
      {
         gxdynajaxctrlcodr.add(H009L12_A31Bode_Codigo[0]);
         gxdynajaxctrldescr.add(H009L12_A695BBode_Descripcion[0]);
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void gxnrgrid1_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1632( ) ;
      while ( nGXsfl_163_idx <= nRC_GXsfl_163 )
      {
         sendrow_1632( ) ;
         nGXsfl_163_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_163_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_163_idx+1)) ;
         sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1632( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf9L2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
      if ( dynavRpt_rep_id.getItemCount() > 0 )
      {
         AV5RPT_REP_ID = (short)(GXutil.lval( dynavRpt_rep_id.getValidValue(GXutil.trim( GXutil.str( AV5RPT_REP_ID, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5RPT_REP_ID", GXutil.ltrim( GXutil.str( AV5RPT_REP_ID, 4, 0)));
      }
      if ( dynavRegional.getItemCount() > 0 )
      {
         AV6Regional = GXutil.lval( dynavRegional.getValidValue(GXutil.trim( GXutil.str( AV6Regional, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Regional", GXutil.ltrim( GXutil.str( AV6Regional, 11, 0)));
      }
      if ( dynavCentro_costo.getItemCount() > 0 )
      {
         AV8Centro_Costo = GXutil.lval( dynavCentro_costo.getValidValue(GXutil.trim( GXutil.str( AV8Centro_Costo, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Centro_Costo", GXutil.ltrim( GXutil.str( AV8Centro_Costo, 11, 0)));
      }
      if ( cmbavModulo.getItemCount() > 0 )
      {
         AV7Modulo = cmbavModulo.getValidValue(AV7Modulo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Modulo", AV7Modulo);
      }
      if ( dynavAlmacen.getItemCount() > 0 )
      {
         AV9Almacen = dynavAlmacen.getValidValue(AV9Almacen) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Almacen", AV9Almacen);
      }
      if ( dynavBodega.getItemCount() > 0 )
      {
         AV19Bodega = dynavBodega.getValidValue(AV19Bodega) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Bodega", AV19Bodega);
      }
      if ( cmbavEstado_inicial.getItemCount() > 0 )
      {
         AV14Estado_Inicial = cmbavEstado_inicial.getValidValue(AV14Estado_Inicial) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Estado_Inicial", AV14Estado_Inicial);
      }
      if ( cmbavEstado_final.getItemCount() > 0 )
      {
         AV15Estado_Final = cmbavEstado_final.getValidValue(AV15Estado_Final) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Estado_Final", AV15Estado_Final);
      }
      if ( dynavMovimiento_inicial.getItemCount() > 0 )
      {
         AV16Movimiento_Inicial = dynavMovimiento_inicial.getValidValue(AV16Movimiento_Inicial) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Movimiento_Inicial", AV16Movimiento_Inicial);
      }
      if ( dynavMovimiento_final.getItemCount() > 0 )
      {
         AV17Movimiento_Final = dynavMovimiento_final.getValidValue(AV17Movimiento_Final) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Movimiento_Final", AV17Movimiento_Final);
      }
      if ( dynavTipo_codigo.getItemCount() > 0 )
      {
         AV29Tipo_Codigo = GXutil.lval( dynavTipo_codigo.getValidValue(GXutil.trim( GXutil.str( AV29Tipo_Codigo, 18, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Tipo_Codigo", GXutil.ltrim( GXutil.str( AV29Tipo_Codigo, 18, 0)));
      }
      if ( cmbavFormato.getItemCount() > 0 )
      {
         AV32Formato = cmbavFormato.getValidValue(AV32Formato) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Formato", AV32Formato);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf9L2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavArea_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Enabled, 5, 0)), true);
      edtavCurs_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Enabled, 5, 0)), true);
      edtavPcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPcata_descripcion_Enabled, 5, 0)), true);
      edtavCtlelem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlelem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlelem_consecutivo_Enabled, 5, 0)), !bGXsfl_163_Refreshing);
      edtavCtlcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcata_descripcion_Enabled, 5, 0)), !bGXsfl_163_Refreshing);
   }

   public void rf9L2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(163) ;
      nGXsfl_163_idx = (short)(1) ;
      sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1632( ) ;
      bGXsfl_163_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1632( ) ;
         e269L2 ();
         wbEnd = (short)(163) ;
         wb9L0( ) ;
      }
      bGXsfl_163_Refreshing = true ;
   }

   public int subgrid1_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      return -1 ;
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public void strup9L0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavArea_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Enabled, 5, 0)), true);
      edtavCurs_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Enabled, 5, 0)), true);
      edtavPcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPcata_descripcion_Enabled, 5, 0)), true);
      edtavCtlelem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlelem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlelem_consecutivo_Enabled, 5, 0)), !bGXsfl_163_Refreshing);
      edtavCtlcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcata_descripcion_Enabled, 5, 0)), !bGXsfl_163_Refreshing);
      gxvvrpt_rep_id_html9L2( ) ;
      gxvvregional_html9L2( ) ;
      gxvvcentro_costo_html9L2( AV6Regional) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e259L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtsku"), AV46SDTSKU);
         /* Read variables values. */
         dynavRpt_rep_id.setName( dynavRpt_rep_id.getInternalname() );
         dynavRpt_rep_id.setValue( httpContext.cgiGet( dynavRpt_rep_id.getInternalname()) );
         AV5RPT_REP_ID = (short)(GXutil.lval( httpContext.cgiGet( dynavRpt_rep_id.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5RPT_REP_ID", GXutil.ltrim( GXutil.str( AV5RPT_REP_ID, 4, 0)));
         dynavRegional.setName( dynavRegional.getInternalname() );
         dynavRegional.setValue( httpContext.cgiGet( dynavRegional.getInternalname()) );
         AV6Regional = GXutil.lval( httpContext.cgiGet( dynavRegional.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Regional", GXutil.ltrim( GXutil.str( AV6Regional, 11, 0)));
         AV24TodosRegional = GXutil.strtobool( httpContext.cgiGet( chkavTodosregional.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24TodosRegional", AV24TodosRegional);
         dynavCentro_costo.setName( dynavCentro_costo.getInternalname() );
         dynavCentro_costo.setValue( httpContext.cgiGet( dynavCentro_costo.getInternalname()) );
         AV8Centro_Costo = GXutil.lval( httpContext.cgiGet( dynavCentro_costo.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Centro_Costo", GXutil.ltrim( GXutil.str( AV8Centro_Costo, 11, 0)));
         AV25TodosCentros = GXutil.strtobool( httpContext.cgiGet( chkavTodoscentros.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25TodosCentros", AV25TodosCentros);
         cmbavModulo.setName( cmbavModulo.getInternalname() );
         cmbavModulo.setValue( httpContext.cgiGet( cmbavModulo.getInternalname()) );
         AV7Modulo = httpContext.cgiGet( cmbavModulo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Modulo", AV7Modulo);
         AV70TodosModulo = GXutil.strtobool( httpContext.cgiGet( chkavTodosmodulo.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70TodosModulo", AV70TodosModulo);
         dynavAlmacen.setName( dynavAlmacen.getInternalname() );
         dynavAlmacen.setValue( httpContext.cgiGet( dynavAlmacen.getInternalname()) );
         AV9Almacen = httpContext.cgiGet( dynavAlmacen.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Almacen", AV9Almacen);
         AV71TodosAlmacenes = GXutil.strtobool( httpContext.cgiGet( chkavTodosalmacenes.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71TodosAlmacenes", AV71TodosAlmacenes);
         dynavBodega.setName( dynavBodega.getInternalname() );
         dynavBodega.setValue( httpContext.cgiGet( dynavBodega.getInternalname()) );
         AV19Bodega = httpContext.cgiGet( dynavBodega.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Bodega", AV19Bodega);
         AV72TodosBodegas = GXutil.strtobool( httpContext.cgiGet( chkavTodosbodegas.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72TodosBodegas", AV72TodosBodegas);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCedula_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCedula_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCEDULA");
            GX_FocusControl = edtavCedula_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11Cedula = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Cedula", GXutil.ltrim( GXutil.str( AV11Cedula, 18, 0)));
         }
         else
         {
            AV11Cedula = localUtil.ctol( httpContext.cgiGet( edtavCedula_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Cedula", GXutil.ltrim( GXutil.str( AV11Cedula, 18, 0)));
         }
         AV73TodosCuentadante = GXutil.strtobool( httpContext.cgiGet( chkavTodoscuentadante.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73TodosCuentadante", AV73TodosCuentadante);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFecha_inicial_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA_INICIAL");
            GX_FocusControl = edtavFecha_inicial_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12Fecha_Inicial = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Fecha_Inicial", localUtil.format(AV12Fecha_Inicial, "99/99/9999"));
         }
         else
         {
            AV12Fecha_Inicial = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFecha_inicial_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Fecha_Inicial", localUtil.format(AV12Fecha_Inicial, "99/99/9999"));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFecha_final_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA_FINAL");
            GX_FocusControl = edtavFecha_final_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13Fecha_Final = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Fecha_Final", localUtil.format(AV13Fecha_Final, "99/99/9999"));
         }
         else
         {
            AV13Fecha_Final = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFecha_final_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Fecha_Final", localUtil.format(AV13Fecha_Final, "99/99/9999"));
         }
         cmbavEstado_inicial.setName( cmbavEstado_inicial.getInternalname() );
         cmbavEstado_inicial.setValue( httpContext.cgiGet( cmbavEstado_inicial.getInternalname()) );
         AV14Estado_Inicial = httpContext.cgiGet( cmbavEstado_inicial.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Estado_Inicial", AV14Estado_Inicial);
         cmbavEstado_final.setName( cmbavEstado_final.getInternalname() );
         cmbavEstado_final.setValue( httpContext.cgiGet( cmbavEstado_final.getInternalname()) );
         AV15Estado_Final = httpContext.cgiGet( cmbavEstado_final.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Estado_Final", AV15Estado_Final);
         dynavMovimiento_inicial.setName( dynavMovimiento_inicial.getInternalname() );
         dynavMovimiento_inicial.setValue( httpContext.cgiGet( dynavMovimiento_inicial.getInternalname()) );
         AV16Movimiento_Inicial = httpContext.cgiGet( dynavMovimiento_inicial.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Movimiento_Inicial", AV16Movimiento_Inicial);
         dynavMovimiento_final.setName( dynavMovimiento_final.getInternalname() );
         dynavMovimiento_final.setValue( httpContext.cgiGet( dynavMovimiento_final.getInternalname()) );
         AV17Movimiento_Final = httpContext.cgiGet( dynavMovimiento_final.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Movimiento_Final", AV17Movimiento_Final);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTrans_consecutivocc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTrans_consecutivocc_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRANS_CONSECUTIVOCC");
            GX_FocusControl = edtavTrans_consecutivocc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27Trans_ConsecutivoCC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV27Trans_ConsecutivoCC, 18, 0)));
         }
         else
         {
            AV27Trans_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtavTrans_consecutivocc_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV27Trans_ConsecutivoCC, 18, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTrans_consecutivoccfin_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTrans_consecutivoccfin_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRANS_CONSECUTIVOCCFIN");
            GX_FocusControl = edtavTrans_consecutivoccfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28Trans_ConsecutivoCCFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Trans_ConsecutivoCCFin", GXutil.ltrim( GXutil.str( AV28Trans_ConsecutivoCCFin, 18, 0)));
         }
         else
         {
            AV28Trans_ConsecutivoCCFin = localUtil.ctol( httpContext.cgiGet( edtavTrans_consecutivoccfin_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Trans_ConsecutivoCCFin", GXutil.ltrim( GXutil.str( AV28Trans_ConsecutivoCCFin, 18, 0)));
         }
         dynavTipo_codigo.setName( dynavTipo_codigo.getInternalname() );
         dynavTipo_codigo.setValue( httpContext.cgiGet( dynavTipo_codigo.getInternalname()) );
         AV29Tipo_Codigo = GXutil.lval( httpContext.cgiGet( dynavTipo_codigo.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Tipo_Codigo", GXutil.ltrim( GXutil.str( AV29Tipo_Codigo, 18, 0)));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavProveedor_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavProveedor_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROVEEDOR");
            GX_FocusControl = edtavProveedor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV61Proveedor = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61Proveedor", GXutil.ltrim( GXutil.str( AV61Proveedor, 18, 0)));
         }
         else
         {
            AV61Proveedor = localUtil.ctol( httpContext.cgiGet( edtavProveedor_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61Proveedor", GXutil.ltrim( GXutil.str( AV61Proveedor, 18, 0)));
         }
         AV63Area_Codigo = httpContext.cgiGet( edtavArea_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Area_Codigo", AV63Area_Codigo);
         AV66Area_Descripcion = httpContext.cgiGet( edtavArea_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66Area_Descripcion", AV66Area_Descripcion);
         AV64Curs_Codigo = httpContext.cgiGet( edtavCurs_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Curs_Codigo", AV64Curs_Codigo);
         AV67Curs_Descripcion = httpContext.cgiGet( edtavCurs_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Curs_Descripcion", AV67Curs_Descripcion);
         AV74Placa = httpContext.cgiGet( edtavPlaca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Placa", AV74Placa);
         AV84Periodo = httpContext.cgiGet( edtavPeriodo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84Periodo", AV84Periodo);
         cmbavFormato.setName( cmbavFormato.getInternalname() );
         cmbavFormato.setValue( httpContext.cgiGet( cmbavFormato.getInternalname()) );
         AV32Formato = httpContext.cgiGet( cmbavFormato.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Formato", AV32Formato);
         AV45pElem_Consecutivo = httpContext.cgiGet( edtavPelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45pElem_Consecutivo", AV45pElem_Consecutivo);
         AV44pCata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavPcata_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44pCata_Descripcion", AV44pCata_Descripcion);
         /* Read saved values. */
         nRC_GXsfl_163 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_163"), ",", ".")) ;
         AV39Cent_Codigo = httpContext.cgiGet( "vCENT_CODIGO") ;
         Gx_date = localUtil.ctod( httpContext.cgiGet( "vTODAY"), 0) ;
         AV78SW_FechaFin = GXutil.strtobool( httpContext.cgiGet( "vSW_FECHAFIN")) ;
         AV77SW_FechaIni = GXutil.strtobool( httpContext.cgiGet( "vSW_FECHAINI")) ;
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
         nRC_GXsfl_163 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_163"), ",", ".")) ;
         nGXsfl_163_fel_idx = (short)(0) ;
         while ( nGXsfl_163_fel_idx < nRC_GXsfl_163 )
         {
            nGXsfl_163_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_163_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_163_fel_idx+1)) ;
            sGXsfl_163_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_1632( ) ;
            AV91GXV1 = nGXsfl_163_fel_idx ;
            if ( ( AV46SDTSKU.size() >= AV91GXV1 ) && ( AV91GXV1 > 0 ) )
            {
               AV46SDTSKU.currentItem( ((com.orions2.SdtSDTSku_SDTSkuItem)AV46SDTSKU.elementAt(-1+AV91GXV1)) );
            }
         }
         if ( nGXsfl_163_fel_idx == 0 )
         {
            nGXsfl_163_idx = (short)(1) ;
            sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_1632( ) ;
         }
         nGXsfl_163_fel_idx = (short)(1) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e259L2 ();
      if (returnInSub) return;
   }

   public void e259L2( )
   {
      /* Start Routine */
      dynavRegional.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavRegional.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavRegional.getVisible(), 5, 0)), true);
      dynavCentro_costo.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavCentro_costo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavCentro_costo.getVisible(), 5, 0)), true);
      cmbavModulo.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavModulo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavModulo.getVisible(), 5, 0)), true);
      dynavAlmacen.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavAlmacen.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavAlmacen.getVisible(), 5, 0)), true);
      dynavBodega.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavBodega.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavBodega.getVisible(), 5, 0)), true);
      edtavCedula_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCedula_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCedula_Visible, 5, 0)), true);
      edtavFecha_inicial_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFecha_inicial_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFecha_inicial_Visible, 5, 0)), true);
      edtavFecha_final_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFecha_final_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFecha_final_Visible, 5, 0)), true);
      cmbavEstado_inicial.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_inicial.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavEstado_inicial.getVisible(), 5, 0)), true);
      cmbavEstado_final.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_final.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavEstado_final.getVisible(), 5, 0)), true);
      dynavMovimiento_inicial.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavMovimiento_inicial.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavMovimiento_inicial.getVisible(), 5, 0)), true);
      dynavMovimiento_final.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavMovimiento_final.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavMovimiento_final.getVisible(), 5, 0)), true);
      edtavTrans_consecutivocc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrans_consecutivocc_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTrans_consecutivocc_Visible, 5, 0)), true);
      chkavTodoscentros.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavTodoscentros.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodoscentros.getVisible(), 5, 0)), true);
      chkavTodosregional.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavTodosregional.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosregional.getVisible(), 5, 0)), true);
      edtavTrans_consecutivoccfin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrans_consecutivoccfin_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTrans_consecutivoccfin_Visible, 5, 0)), true);
      dynavTipo_codigo.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavTipo_codigo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavTipo_codigo.getVisible(), 5, 0)), true);
      cmbavFormato.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavFormato.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavFormato.getVisible(), 5, 0)), true);
      divTable3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable3_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable3_Visible, 5, 0)), true);
      edtavProveedor_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavProveedor_Visible, 5, 0)), true);
      edtavArea_codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_codigo_Visible, 5, 0)), true);
      edtavCurs_codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Visible, 5, 0)), true);
      edtavPlaca_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPlaca_Visible, 5, 0)), true);
      imgImagecurso_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImagecurso_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImagecurso_Visible, 5, 0)), true);
      imgImageareadante_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImageareadante_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImageareadante_Visible, 5, 0)), true);
      edtavArea_descripcion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Visible, 5, 0)), true);
      edtavCurs_descripcion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Visible, 5, 0)), true);
      chkavTodosalmacenes.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavTodosalmacenes.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosalmacenes.getVisible(), 5, 0)), true);
      chkavTodosbodegas.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavTodosbodegas.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosbodegas.getVisible(), 5, 0)), true);
      chkavTodosmodulo.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavTodosmodulo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosmodulo.getVisible(), 5, 0)), true);
      chkavTodoscuentadante.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavTodoscuentadante.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodoscuentadante.getVisible(), 5, 0)), true);
      edtavPeriodo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPeriodo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPeriodo_Visible, 5, 0)), true);
      AV68Usuario = AV56websession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Usuario", AV68Usuario);
      AV57Usua_Id = GXutil.lval( AV56websession.getValue("UsuarioId")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Usua_Id", GXutil.ltrim( GXutil.str( AV57Usua_Id, 18, 0)));
      /* Execute user subroutine: 'ROL' */
      S112 ();
      if (returnInSub) return;
   }

   public void e139L2( )
   {
      /* Rpt_rep_id_Isvalid Routine */
      AV11Cedula = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Cedula", GXutil.ltrim( GXutil.str( AV11Cedula, 18, 0)));
      AV12Fecha_Inicial = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Fecha_Inicial", localUtil.format(AV12Fecha_Inicial, "99/99/9999"));
      AV13Fecha_Final = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Fecha_Final", localUtil.format(AV13Fecha_Final, "99/99/9999"));
      AV27Trans_ConsecutivoCC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV27Trans_ConsecutivoCC, 18, 0)));
      AV28Trans_ConsecutivoCCFin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Trans_ConsecutivoCCFin", GXutil.ltrim( GXutil.str( AV28Trans_ConsecutivoCCFin, 18, 0)));
      AV61Proveedor = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Proveedor", GXutil.ltrim( GXutil.str( AV61Proveedor, 18, 0)));
      AV63Area_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Area_Codigo", AV63Area_Codigo);
      AV64Curs_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Curs_Codigo", AV64Curs_Codigo);
      AV74Placa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Placa", AV74Placa);
      AV45pElem_Consecutivo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45pElem_Consecutivo", AV45pElem_Consecutivo);
      AV32Formato = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Formato", AV32Formato);
      AV84Periodo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Periodo", AV84Periodo);
      AV46SDTSKU.clear();
      gx_BV163 = true ;
      AV25TodosCentros = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25TodosCentros", AV25TodosCentros);
      AV24TodosRegional = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24TodosRegional", AV24TodosRegional);
      AV71TodosAlmacenes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TodosAlmacenes", AV71TodosAlmacenes);
      AV72TodosBodegas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TodosBodegas", AV72TodosBodegas);
      AV70TodosModulo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TodosModulo", AV70TodosModulo);
      AV73TodosCuentadante = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TodosCuentadante", AV73TodosCuentadante);
      /* Method refresh( not supported for dyncombo controls. */
      dynavRegional.setEnabled( 1 );
      httpContext.ajax_rsp_assign_prop("", false, dynavRegional.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynavRegional.getEnabled(), 5, 0)), true);
      /* Method refresh( not supported for dyncombo controls. */
      dynavCentro_costo.setEnabled( 1 );
      httpContext.ajax_rsp_assign_prop("", false, dynavCentro_costo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynavCentro_costo.getEnabled(), 5, 0)), true);
      cmbavModulo.setEnabled( 1 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavModulo.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavModulo.getEnabled(), 5, 0)), true);
      /* Method refresh( not supported for dyncombo controls. */
      dynavAlmacen.setEnabled( 1 );
      httpContext.ajax_rsp_assign_prop("", false, dynavAlmacen.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynavAlmacen.getEnabled(), 5, 0)), true);
      /* Method refresh( not supported for dyncombo controls. */
      dynavBodega.setEnabled( 1 );
      httpContext.ajax_rsp_assign_prop("", false, dynavBodega.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( dynavBodega.getEnabled(), 5, 0)), true);
      /* Execute user subroutine: 'DATOS_REPORTE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'BUSCA_PARAMETROS_REPORTE' */
      S132 ();
      if (returnInSub) return;
      cmbavFormato.setValue( GXutil.rtrim( AV32Formato) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavFormato.getInternalname(), "Values", cmbavFormato.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46SDTSKU", AV46SDTSKU);
      nGXsfl_163_bak_idx = nGXsfl_163_idx ;
      gxgrgrid1_refresh( ) ;
      nGXsfl_163_idx = nGXsfl_163_bak_idx ;
      sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1632( ) ;
      dynavRegional.setValue( GXutil.trim( GXutil.str( AV6Regional, 11, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynavRegional.getInternalname(), "Values", dynavRegional.ToJavascriptSource(), true);
      dynavCentro_costo.setValue( GXutil.trim( GXutil.str( AV8Centro_Costo, 11, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynavCentro_costo.getInternalname(), "Values", dynavCentro_costo.ToJavascriptSource(), true);
      dynavAlmacen.setValue( GXutil.rtrim( AV9Almacen) );
      httpContext.ajax_rsp_assign_prop("", false, dynavAlmacen.getInternalname(), "Values", dynavAlmacen.ToJavascriptSource(), true);
      dynavBodega.setValue( GXutil.rtrim( AV19Bodega) );
      httpContext.ajax_rsp_assign_prop("", false, dynavBodega.getInternalname(), "Values", dynavBodega.ToJavascriptSource(), true);
      dynavRpt_rep_id.setValue( GXutil.trim( GXutil.str( AV5RPT_REP_ID, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynavRpt_rep_id.getInternalname(), "Values", dynavRpt_rep_id.ToJavascriptSource(), true);
   }

   public void S122( )
   {
      /* 'DATOS_REPORTE' Routine */
      /* Using cursor H009L13 */
      pr_default.execute(11, new Object[] {AV20RPT_REP_NOMBRE});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A844RPT_REP_NOMBRE = H009L13_A844RPT_REP_NOMBRE[0] ;
         n844RPT_REP_NOMBRE = H009L13_n844RPT_REP_NOMBRE[0] ;
         A843RPT_REP_ID = H009L13_A843RPT_REP_ID[0] ;
         AV5RPT_REP_ID = A843RPT_REP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5RPT_REP_ID", GXutil.ltrim( GXutil.str( AV5RPT_REP_ID, 4, 0)));
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S132( )
   {
      /* 'BUSCA_PARAMETROS_REPORTE' Routine */
      /* Using cursor H009L14 */
      pr_default.execute(12);
      while ( (pr_default.getStatus(12) != 101) )
      {
         A842RPT_PAR_ESTADO = H009L14_A842RPT_PAR_ESTADO[0] ;
         n842RPT_PAR_ESTADO = H009L14_n842RPT_PAR_ESTADO[0] ;
         A840RPT_PAR_ID = H009L14_A840RPT_PAR_ID[0] ;
         AV21RPT_PAR_ID = A840RPT_PAR_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21RPT_PAR_ID", GXutil.ltrim( GXutil.str( AV21RPT_PAR_ID, 4, 0)));
         /* Execute user subroutine: 'BUSCAR_REPORTE_PARAMETROS' */
         S224 ();
         if ( returnInSub )
         {
            pr_default.close(12);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'FILTROS' */
         S234 ();
         if ( returnInSub )
         {
            pr_default.close(12);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S224( )
   {
      /* 'BUSCAR_REPORTE_PARAMETROS' Routine */
      AV22SW = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22SW", AV22SW);
      /* Using cursor H009L15 */
      pr_default.execute(13, new Object[] {new Short(AV5RPT_REP_ID), new Short(AV21RPT_PAR_ID)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A853RPT_REP_PARM_ESTADO = H009L15_A853RPT_REP_PARM_ESTADO[0] ;
         n853RPT_REP_PARM_ESTADO = H009L15_n853RPT_REP_PARM_ESTADO[0] ;
         A840RPT_PAR_ID = H009L15_A840RPT_PAR_ID[0] ;
         A843RPT_REP_ID = H009L15_A843RPT_REP_ID[0] ;
         AV22SW = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22SW", AV22SW);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void e149L2( )
   {
      /* Regional_Isvalid Routine */
      AV38Regi_Cod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Regi_Cod", GXutil.ltrim( GXutil.str( AV38Regi_Cod, 4, 0)));
      /* Using cursor H009L16 */
      pr_default.execute(14, new Object[] {new Long(AV6Regional)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A2Regi_Id = H009L16_A2Regi_Id[0] ;
         A12Regi_Cod = H009L16_A12Regi_Cod[0] ;
         AV38Regi_Cod = A12Regi_Cod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38Regi_Cod", GXutil.ltrim( GXutil.str( AV38Regi_Cod, 4, 0)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void e159L2( )
   {
      /* Centro_costo_Isvalid Routine */
      AV39Cent_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Cent_Codigo", AV39Cent_Codigo);
      /* Using cursor H009L17 */
      pr_default.execute(15, new Object[] {new Long(AV8Centro_Costo)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A1Cent_Id = H009L17_A1Cent_Id[0] ;
         A3Cent_Codigo = H009L17_A3Cent_Codigo[0] ;
         AV39Cent_Codigo = A3Cent_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Cent_Codigo", AV39Cent_Codigo);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S234( )
   {
      /* 'FILTROS' Routine */
      if ( AV21RPT_PAR_ID == 1 )
      {
         if ( AV22SW )
         {
            dynavRegional.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, dynavRegional.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavRegional.getVisible(), 5, 0)), true);
            if ( AV58Coordinador )
            {
               chkavTodosregional.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, chkavTodosregional.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosregional.getVisible(), 5, 0)), true);
            }
            else
            {
               chkavTodosregional.setVisible( 0 );
               httpContext.ajax_rsp_assign_prop("", false, chkavTodosregional.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosregional.getVisible(), 5, 0)), true);
            }
         }
         else
         {
            dynavRegional.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynavRegional.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavRegional.getVisible(), 5, 0)), true);
            chkavTodosregional.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkavTodosregional.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosregional.getVisible(), 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 2 )
      {
         if ( AV22SW )
         {
            dynavCentro_costo.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, dynavCentro_costo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavCentro_costo.getVisible(), 5, 0)), true);
            chkavTodoscentros.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, chkavTodoscentros.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodoscentros.getVisible(), 5, 0)), true);
         }
         else
         {
            dynavCentro_costo.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynavCentro_costo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavCentro_costo.getVisible(), 5, 0)), true);
            chkavTodoscentros.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkavTodoscentros.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodoscentros.getVisible(), 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 3 )
      {
         if ( AV22SW )
         {
            cmbavModulo.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavModulo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavModulo.getVisible(), 5, 0)), true);
            chkavTodosmodulo.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, chkavTodosmodulo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosmodulo.getVisible(), 5, 0)), true);
         }
         else
         {
            cmbavModulo.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavModulo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavModulo.getVisible(), 5, 0)), true);
            chkavTodosmodulo.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkavTodosmodulo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosmodulo.getVisible(), 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 4 )
      {
         if ( AV22SW )
         {
            dynavAlmacen.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, dynavAlmacen.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavAlmacen.getVisible(), 5, 0)), true);
            chkavTodosalmacenes.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, chkavTodosalmacenes.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosalmacenes.getVisible(), 5, 0)), true);
         }
         else
         {
            dynavAlmacen.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynavAlmacen.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavAlmacen.getVisible(), 5, 0)), true);
            chkavTodosalmacenes.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkavTodosalmacenes.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosalmacenes.getVisible(), 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 5 )
      {
         if ( AV22SW )
         {
            dynavBodega.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, dynavBodega.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavBodega.getVisible(), 5, 0)), true);
            chkavTodosbodegas.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, chkavTodosbodegas.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosbodegas.getVisible(), 5, 0)), true);
         }
         else
         {
            dynavBodega.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynavBodega.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavBodega.getVisible(), 5, 0)), true);
            chkavTodosbodegas.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkavTodosbodegas.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodosbodegas.getVisible(), 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 6 )
      {
         if ( AV22SW )
         {
            edtavCedula_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavCedula_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCedula_Visible, 5, 0)), true);
            chkavTodoscuentadante.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, chkavTodoscuentadante.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodoscuentadante.getVisible(), 5, 0)), true);
         }
         else
         {
            edtavCedula_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavCedula_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCedula_Visible, 5, 0)), true);
            chkavTodoscuentadante.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkavTodoscuentadante.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( chkavTodoscuentadante.getVisible(), 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 7 )
      {
         if ( AV22SW )
         {
            edtavFecha_inicial_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavFecha_inicial_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFecha_inicial_Visible, 5, 0)), true);
         }
         else
         {
            edtavFecha_inicial_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavFecha_inicial_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFecha_inicial_Visible, 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 8 )
      {
         if ( AV22SW )
         {
            edtavFecha_final_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavFecha_final_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFecha_final_Visible, 5, 0)), true);
         }
         else
         {
            edtavFecha_final_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavFecha_final_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFecha_final_Visible, 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 9 )
      {
         if ( AV22SW )
         {
            cmbavEstado_inicial.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_inicial.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavEstado_inicial.getVisible(), 5, 0)), true);
         }
         else
         {
            cmbavEstado_inicial.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_inicial.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavEstado_inicial.getVisible(), 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 10 )
      {
         if ( AV22SW )
         {
            cmbavEstado_final.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_final.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavEstado_final.getVisible(), 5, 0)), true);
         }
         else
         {
            cmbavEstado_final.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_final.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavEstado_final.getVisible(), 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 11 )
      {
         if ( AV22SW )
         {
            dynavMovimiento_inicial.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, dynavMovimiento_inicial.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavMovimiento_inicial.getVisible(), 5, 0)), true);
         }
         else
         {
            dynavMovimiento_inicial.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynavMovimiento_inicial.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavMovimiento_inicial.getVisible(), 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 12 )
      {
         if ( AV22SW )
         {
            dynavMovimiento_final.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, dynavMovimiento_final.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavMovimiento_final.getVisible(), 5, 0)), true);
         }
         else
         {
            dynavMovimiento_final.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynavMovimiento_final.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavMovimiento_final.getVisible(), 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 13 )
      {
         if ( AV22SW )
         {
            edtavTrans_consecutivocc_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavTrans_consecutivocc_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTrans_consecutivocc_Visible, 5, 0)), true);
         }
         else
         {
            edtavTrans_consecutivocc_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavTrans_consecutivocc_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTrans_consecutivocc_Visible, 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 14 )
      {
         if ( AV22SW )
         {
            edtavTrans_consecutivoccfin_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavTrans_consecutivoccfin_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTrans_consecutivoccfin_Visible, 5, 0)), true);
         }
         else
         {
            edtavTrans_consecutivoccfin_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavTrans_consecutivoccfin_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTrans_consecutivoccfin_Visible, 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 15 )
      {
         if ( AV22SW )
         {
            dynavTipo_codigo.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, dynavTipo_codigo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavTipo_codigo.getVisible(), 5, 0)), true);
         }
         else
         {
            dynavTipo_codigo.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynavTipo_codigo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavTipo_codigo.getVisible(), 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 16 )
      {
         if ( AV22SW )
         {
            divTable3_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, divTable3_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable3_Visible, 5, 0)), true);
         }
         else
         {
            divTable3_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, divTable3_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable3_Visible, 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 17 )
      {
         if ( AV22SW )
         {
            cmbavFormato.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavFormato.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavFormato.getVisible(), 5, 0)), true);
         }
         else
         {
            cmbavFormato.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavFormato.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavFormato.getVisible(), 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 18 )
      {
         if ( AV22SW )
         {
            edtavProveedor_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavProveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavProveedor_Visible, 5, 0)), true);
         }
         else
         {
            edtavProveedor_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavProveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavProveedor_Visible, 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 19 )
      {
         if ( AV22SW )
         {
            edtavArea_codigo_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_codigo_Visible, 5, 0)), true);
            imgImageareadante_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, imgImageareadante_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImageareadante_Visible, 5, 0)), true);
            edtavArea_descripcion_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Visible, 5, 0)), true);
         }
         else
         {
            edtavArea_codigo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_codigo_Visible, 5, 0)), true);
            imgImageareadante_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, imgImageareadante_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImageareadante_Visible, 5, 0)), true);
            edtavArea_descripcion_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Visible, 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 20 )
      {
         if ( AV22SW )
         {
            edtavCurs_codigo_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Visible, 5, 0)), true);
            imgImagecurso_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, imgImagecurso_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImagecurso_Visible, 5, 0)), true);
            edtavCurs_descripcion_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Visible, 5, 0)), true);
         }
         else
         {
            edtavCurs_codigo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Visible, 5, 0)), true);
            imgImagecurso_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, imgImagecurso_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImagecurso_Visible, 5, 0)), true);
            edtavCurs_descripcion_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Visible, 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 21 )
      {
         if ( AV22SW )
         {
            edtavPlaca_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavPlaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPlaca_Visible, 5, 0)), true);
         }
         else
         {
            edtavPlaca_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavPlaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPlaca_Visible, 5, 0)), true);
         }
      }
      else if ( AV21RPT_PAR_ID == 22 )
      {
         if ( AV22SW )
         {
            edtavPeriodo_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavPeriodo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPeriodo_Visible, 5, 0)), true);
         }
         else
         {
            edtavPeriodo_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavPeriodo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPeriodo_Visible, 5, 0)), true);
         }
      }
   }

   public void e169L2( )
   {
      /* Cedula_Isvalid Routine */
      AV23Error = false ;
      if ( AV11Cedula != 0 )
      {
         AV62Cuen_Cedula = AV11Cedula ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Cuen_Cedula", GXutil.ltrim( GXutil.str( AV62Cuen_Cedula, 18, 0)));
         /* Execute user subroutine: 'BUSCAR_CUENTADANTE' */
         S142 ();
         if (returnInSub) return;
         if ( ! AV26SW_Cuentadante )
         {
            AV23Error = true ;
            httpContext.GX_msglist.addItem("Este número de cédula no existe");
         }
      }
   }

   public void S142( )
   {
      /* 'BUSCAR_CUENTADANTE' Routine */
      AV26SW_Cuentadante = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26SW_Cuentadante", AV26SW_Cuentadante);
      /* Using cursor H009L18 */
      pr_default.execute(16, new Object[] {new Long(AV62Cuen_Cedula)});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A688Cuen_Cedula = H009L18_A688Cuen_Cedula[0] ;
         AV26SW_Cuentadante = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26SW_Cuentadante", AV26SW_Cuentadante);
         pr_default.readNext(16);
      }
      pr_default.close(16);
   }

   public void e179L2( )
   {
      /* Proveedor_Isvalid Routine */
      AV23Error = false ;
      if ( AV61Proveedor != 0 )
      {
         AV62Cuen_Cedula = AV61Proveedor ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Cuen_Cedula", GXutil.ltrim( GXutil.str( AV62Cuen_Cedula, 18, 0)));
         /* Execute user subroutine: 'BUSCAR_CUENTADANTE' */
         S142 ();
         if (returnInSub) return;
         if ( ! AV26SW_Cuentadante )
         {
            AV23Error = true ;
            httpContext.GX_msglist.addItem("No existe el Nit del proveedor");
         }
      }
   }

   public void e189L2( )
   {
      /* 'Cancelar' Routine */
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e249L2( )
   {
      /* 'SKU' Routine */
      httpContext.popup(formatLink("com.orions2.selsku") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV45pElem_Consecutivo","AV44pCata_Descripcion"});
   }

   public void e199L2( )
   {
      AV91GXV1 = nGXsfl_163_idx ;
      if ( AV46SDTSKU.size() >= AV91GXV1 )
      {
         AV46SDTSKU.currentItem( ((com.orions2.SdtSDTSku_SDTSkuItem)AV46SDTSKU.elementAt(-1+AV91GXV1)) );
      }
      /* 'Agregar SKU' Routine */
      if ( AV80SW_Consecutivo )
      {
         AV79SW_SKU = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79SW_SKU", AV79SW_SKU);
         AV47SDTSKUItem = (com.orions2.SdtSDTSku_SDTSkuItem)new com.orions2.SdtSDTSku_SDTSkuItem(remoteHandle, context);
         AV47SDTSKUItem.setgxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo( AV45pElem_Consecutivo );
         AV46SDTSKU.add(AV47SDTSKUItem, 0);
         gx_BV163 = true ;
         AV45pElem_Consecutivo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45pElem_Consecutivo", AV45pElem_Consecutivo);
         AV44pCata_Descripcion = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44pCata_Descripcion", AV44pCata_Descripcion);
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46SDTSKU", AV46SDTSKU);
      nGXsfl_163_bak_idx = nGXsfl_163_idx ;
      gxgrgrid1_refresh( ) ;
      nGXsfl_163_idx = nGXsfl_163_bak_idx ;
      sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1632( ) ;
   }

   public void S112( )
   {
      /* 'ROL' Routine */
      AV58Coordinador = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Coordinador", AV58Coordinador);
      /* Using cursor H009L19 */
      pr_default.execute(17, new Object[] {new Long(AV57Usua_Id)});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A21Rol_Id = H009L19_A21Rol_Id[0] ;
         A23Usua_Id = H009L19_A23Usua_Id[0] ;
         AV58Coordinador = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58Coordinador", AV58Coordinador);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
   }

   public void e209L2( )
   {
      /* Placa_Isvalid Routine */
      if ( GXutil.strcmp(AV74Placa, "") == 0 )
      {
         httpContext.GX_msglist.addItem("Debe ingresar la placa");
      }
      else
      {
         AV75SW_Placa = false ;
         /* Using cursor H009L20 */
         pr_default.execute(18, new Object[] {AV74Placa});
         while ( (pr_default.getStatus(18) != 101) )
         {
            A67Invd_NumeroPlaca = H009L20_A67Invd_NumeroPlaca[0] ;
            AV75SW_Placa = true ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(18);
         if ( ! AV75SW_Placa )
         {
            httpContext.GX_msglist.addItem("La placa no existe");
         }
      }
   }

   public void e219L2( )
   {
      /* Periodo_Isvalid Routine */
      /* Execute user subroutine: 'PERIODO' */
      S152 ();
      if (returnInSub) return;
   }

   public void e229L2( )
   {
      /* Pelem_consecutivo_Isvalid Routine */
      AV80SW_Consecutivo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80SW_Consecutivo", AV80SW_Consecutivo);
      AV103GXLvl474 = (byte)(0) ;
      /* Using cursor H009L21 */
      pr_default.execute(19, new Object[] {AV45pElem_Consecutivo});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A37Cata_Codigo = H009L21_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H009L21_A298Cata_Descripcion[0] ;
         AV103GXLvl474 = (byte)(1) ;
         AV44pCata_Descripcion = A298Cata_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44pCata_Descripcion", AV44pCata_Descripcion);
         AV80SW_Consecutivo = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80SW_Consecutivo", AV80SW_Consecutivo);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(19);
      if ( AV103GXLvl474 == 0 )
      {
         httpContext.GX_msglist.addItem("No existe el consecutivo");
         AV45pElem_Consecutivo = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45pElem_Consecutivo", AV45pElem_Consecutivo);
      }
   }

   public void e239L2( )
   {
      AV91GXV1 = nGXsfl_163_idx ;
      if ( AV46SDTSKU.size() >= AV91GXV1 )
      {
         AV46SDTSKU.currentItem( ((com.orions2.SdtSDTSku_SDTSkuItem)AV46SDTSKU.elementAt(-1+AV91GXV1)) );
      }
      /* 'Confirmar' Routine */
      AV82Completo = true ;
      if ( ( AV5RPT_REP_ID == 4 ) || ( AV5RPT_REP_ID == 5 ) || ( AV5RPT_REP_ID == 10 ) || ( AV5RPT_REP_ID == 11 ) )
      {
         /* Execute user subroutine: 'FECHAS' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV5RPT_REP_ID == 8 )
      {
         /* Execute user subroutine: 'FECHAS' */
         S162 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'MOVIMIENTO' */
         S172 ();
         if (returnInSub) return;
         if ( GXutil.strcmp(AV15Estado_Final, AV14Estado_Inicial) < 0 )
         {
            AV82Completo = false ;
            Gx_msg = "El estado final debe ser mayor al estado inicial" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            /* Execute user subroutine: 'MENSAJES' */
            S182 ();
            if (returnInSub) return;
            GX_FocusControl = cmbavEstado_inicial.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( AV5RPT_REP_ID == 6 )
      {
         if ( ! AV79SW_SKU )
         {
            AV82Completo = false ;
            Gx_msg = "Debe ingresar un SKU" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            /* Execute user subroutine: 'MENSAJES' */
            S182 ();
            if (returnInSub) return;
            GX_FocusControl = edtavPelem_consecutivo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( AV5RPT_REP_ID == 7 )
      {
         if ( AV27Trans_ConsecutivoCC == 0 )
         {
            AV82Completo = false ;
            Gx_msg = "Debe ingresar el número de la transacción" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            /* Execute user subroutine: 'MENSAJES' */
            S182 ();
            if (returnInSub) return;
            GX_FocusControl = edtavTrans_consecutivocc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( AV5RPT_REP_ID == 15 )
      {
         if ( GXutil.strcmp(AV74Placa, "") == 0 )
         {
            AV82Completo = false ;
            Gx_msg = "Debe ingresar el número de la placa" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            /* Execute user subroutine: 'MENSAJES' */
            S182 ();
            if (returnInSub) return;
            GX_FocusControl = edtavPlaca_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      else if ( AV5RPT_REP_ID == 9 )
      {
         /* Execute user subroutine: 'ELEMENTO' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV5RPT_REP_ID == 12 )
      {
         /* Execute user subroutine: 'MOVIMIENTO' */
         S172 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'TRANSACCIONES' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( ( AV5RPT_REP_ID == 13 ) || ( AV5RPT_REP_ID == 14 ) )
      {
         /* Execute user subroutine: 'FECHAS' */
         S162 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'ELEMENTO' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( ( AV5RPT_REP_ID >= 16 ) && ( AV5RPT_REP_ID <= 20 ) )
      {
         /* Execute user subroutine: 'PERIODO' */
         S152 ();
         if (returnInSub) return;
      }
      if ( AV82Completo )
      {
         /* Execute user subroutine: 'LLAMA REPORTES' */
         S212 ();
         if (returnInSub) return;
      }
      cmbavFormato.setValue( GXutil.rtrim( AV32Formato) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavFormato.getInternalname(), "Values", cmbavFormato.ToJavascriptSource(), true);
      cmbavModulo.setValue( GXutil.rtrim( AV7Modulo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavModulo.getInternalname(), "Values", cmbavModulo.ToJavascriptSource(), true);
      dynavAlmacen.setValue( GXutil.rtrim( AV9Almacen) );
      httpContext.ajax_rsp_assign_prop("", false, dynavAlmacen.getInternalname(), "Values", dynavAlmacen.ToJavascriptSource(), true);
      dynavBodega.setValue( GXutil.rtrim( AV19Bodega) );
      httpContext.ajax_rsp_assign_prop("", false, dynavBodega.getInternalname(), "Values", dynavBodega.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV46SDTSKU", AV46SDTSKU);
      nGXsfl_163_bak_idx = nGXsfl_163_idx ;
      gxgrgrid1_refresh( ) ;
      nGXsfl_163_idx = nGXsfl_163_bak_idx ;
      sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1632( ) ;
      dynavTipo_codigo.setValue( GXutil.trim( GXutil.str( AV29Tipo_Codigo, 18, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynavTipo_codigo.getInternalname(), "Values", dynavTipo_codigo.ToJavascriptSource(), true);
      dynavMovimiento_final.setValue( GXutil.rtrim( AV17Movimiento_Final) );
      httpContext.ajax_rsp_assign_prop("", false, dynavMovimiento_final.getInternalname(), "Values", dynavMovimiento_final.ToJavascriptSource(), true);
      dynavMovimiento_inicial.setValue( GXutil.rtrim( AV16Movimiento_Inicial) );
      httpContext.ajax_rsp_assign_prop("", false, dynavMovimiento_inicial.getInternalname(), "Values", dynavMovimiento_inicial.ToJavascriptSource(), true);
      cmbavEstado_final.setValue( GXutil.rtrim( AV15Estado_Final) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_final.getInternalname(), "Values", cmbavEstado_final.ToJavascriptSource(), true);
      cmbavEstado_inicial.setValue( GXutil.rtrim( AV14Estado_Inicial) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_inicial.getInternalname(), "Values", cmbavEstado_inicial.ToJavascriptSource(), true);
      dynavRpt_rep_id.setValue( GXutil.trim( GXutil.str( AV5RPT_REP_ID, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynavRpt_rep_id.getInternalname(), "Values", dynavRpt_rep_id.ToJavascriptSource(), true);
   }

   public void S212( )
   {
      /* 'LLAMA REPORTES' Routine */
      new com.orions2.wsautenticajasper(remoteHandle, context).execute( ) ;
      if ( AV24TodosRegional )
      {
         AV69Codigo_Regional = "000" ;
      }
      else
      {
         AV69Codigo_Regional = GXutil.str( AV38Regi_Cod, 4, 0) ;
      }
      if ( AV25TodosCentros )
      {
         AV39Cent_Codigo = "000000" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Cent_Codigo", AV39Cent_Codigo);
      }
      if ( AV5RPT_REP_ID == 9 )
      {
         AV32Formato = "xls" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Formato", AV32Formato);
      }
      if ( AV70TodosModulo )
      {
         AV7Modulo = "000" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Modulo", AV7Modulo);
      }
      if ( AV71TodosAlmacenes )
      {
         AV9Almacen = "000" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Almacen", AV9Almacen);
      }
      if ( AV72TodosBodegas )
      {
         AV19Bodega = "000" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Bodega", AV19Bodega);
      }
      if ( AV73TodosCuentadante )
      {
         AV83CedulaChar = "000" ;
      }
      else
      {
         AV83CedulaChar = GXutil.trim( GXutil.str( AV11Cedula, 18, 0)) ;
      }
      GXv_int1[0] = AV5RPT_REP_ID ;
      GXv_char2[0] = AV69Codigo_Regional ;
      GXv_char3[0] = AV39Cent_Codigo ;
      GXv_char4[0] = AV7Modulo ;
      GXv_char5[0] = AV9Almacen ;
      GXv_char6[0] = AV19Bodega ;
      GXv_char7[0] = AV83CedulaChar ;
      GXv_date8[0] = AV12Fecha_Inicial ;
      GXv_date9[0] = AV13Fecha_Final ;
      GXv_char10[0] = AV14Estado_Inicial ;
      GXv_char11[0] = AV15Estado_Final ;
      GXv_char12[0] = AV16Movimiento_Inicial ;
      GXv_char13[0] = AV17Movimiento_Final ;
      GXv_int14[0] = AV27Trans_ConsecutivoCC ;
      GXv_int15[0] = AV28Trans_ConsecutivoCCFin ;
      GXv_int16[0] = AV29Tipo_Codigo ;
      GXv_int17[0] = AV61Proveedor ;
      GXv_char18[0] = AV63Area_Codigo ;
      GXv_char19[0] = AV64Curs_Codigo ;
      GXv_char20[0] = AV74Placa ;
      GXv_char21[0] = AV32Formato ;
      GXv_objcol_SdtSDTSku_SDTSkuItem22[0] = AV46SDTSKU ;
      GXv_char23[0] = AV68Usuario ;
      GXv_char24[0] = AV84Periodo ;
      new com.orions2.wsllamareporte(remoteHandle, context).execute( GXv_int1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_char6, GXv_char7, GXv_date8, GXv_date9, GXv_char10, GXv_char11, GXv_char12, GXv_char13, GXv_int14, GXv_int15, GXv_int16, GXv_int17, GXv_char18, GXv_char19, GXv_char20, GXv_char21, GXv_objcol_SdtSDTSku_SDTSkuItem22, GXv_char23, GXv_char24) ;
      wp_reportes_impl.this.AV5RPT_REP_ID = GXv_int1[0] ;
      wp_reportes_impl.this.AV69Codigo_Regional = GXv_char2[0] ;
      wp_reportes_impl.this.AV39Cent_Codigo = GXv_char3[0] ;
      wp_reportes_impl.this.AV7Modulo = GXv_char4[0] ;
      wp_reportes_impl.this.AV9Almacen = GXv_char5[0] ;
      wp_reportes_impl.this.AV19Bodega = GXv_char6[0] ;
      wp_reportes_impl.this.AV83CedulaChar = GXv_char7[0] ;
      wp_reportes_impl.this.AV12Fecha_Inicial = GXv_date8[0] ;
      wp_reportes_impl.this.AV13Fecha_Final = GXv_date9[0] ;
      wp_reportes_impl.this.AV14Estado_Inicial = GXv_char10[0] ;
      wp_reportes_impl.this.AV15Estado_Final = GXv_char11[0] ;
      wp_reportes_impl.this.AV16Movimiento_Inicial = GXv_char12[0] ;
      wp_reportes_impl.this.AV17Movimiento_Final = GXv_char13[0] ;
      wp_reportes_impl.this.AV27Trans_ConsecutivoCC = GXv_int14[0] ;
      wp_reportes_impl.this.AV28Trans_ConsecutivoCCFin = GXv_int15[0] ;
      wp_reportes_impl.this.AV29Tipo_Codigo = GXv_int16[0] ;
      wp_reportes_impl.this.AV61Proveedor = GXv_int17[0] ;
      wp_reportes_impl.this.AV63Area_Codigo = GXv_char18[0] ;
      wp_reportes_impl.this.AV64Curs_Codigo = GXv_char19[0] ;
      wp_reportes_impl.this.AV74Placa = GXv_char20[0] ;
      wp_reportes_impl.this.AV32Formato = GXv_char21[0] ;
      AV46SDTSKU = GXv_objcol_SdtSDTSku_SDTSkuItem22[0] ;
      wp_reportes_impl.this.AV68Usuario = GXv_char23[0] ;
      wp_reportes_impl.this.AV84Periodo = GXv_char24[0] ;
      gx_BV163 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5RPT_REP_ID", GXutil.ltrim( GXutil.str( AV5RPT_REP_ID, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV39Cent_Codigo", AV39Cent_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "AV7Modulo", AV7Modulo);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Almacen", AV9Almacen);
      httpContext.ajax_rsp_assign_attri("", false, "AV19Bodega", AV19Bodega);
      httpContext.ajax_rsp_assign_attri("", false, "AV12Fecha_Inicial", localUtil.format(AV12Fecha_Inicial, "99/99/9999"));
      httpContext.ajax_rsp_assign_attri("", false, "AV13Fecha_Final", localUtil.format(AV13Fecha_Final, "99/99/9999"));
      httpContext.ajax_rsp_assign_attri("", false, "AV14Estado_Inicial", AV14Estado_Inicial);
      httpContext.ajax_rsp_assign_attri("", false, "AV15Estado_Final", AV15Estado_Final);
      httpContext.ajax_rsp_assign_attri("", false, "AV16Movimiento_Inicial", AV16Movimiento_Inicial);
      httpContext.ajax_rsp_assign_attri("", false, "AV17Movimiento_Final", AV17Movimiento_Final);
      httpContext.ajax_rsp_assign_attri("", false, "AV27Trans_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV27Trans_ConsecutivoCC, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV28Trans_ConsecutivoCCFin", GXutil.ltrim( GXutil.str( AV28Trans_ConsecutivoCCFin, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV29Tipo_Codigo", GXutil.ltrim( GXutil.str( AV29Tipo_Codigo, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV61Proveedor", GXutil.ltrim( GXutil.str( AV61Proveedor, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV63Area_Codigo", AV63Area_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "AV64Curs_Codigo", AV64Curs_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "AV74Placa", AV74Placa);
      httpContext.ajax_rsp_assign_attri("", false, "AV32Formato", AV32Formato);
      httpContext.ajax_rsp_assign_attri("", false, "AV68Usuario", AV68Usuario);
      httpContext.ajax_rsp_assign_attri("", false, "AV84Periodo", AV84Periodo);
   }

   public void S182( )
   {
      /* 'MENSAJES' Routine */
      Alertify1_Type = "error" ;
      httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
      Alertify1_Textmessage = Gx_msg ;
      httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
      this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
   }

   public void S162( )
   {
      /* 'FECHAS' Routine */
      if ( GXutil.dateCompare(AV12Fecha_Inicial, GXutil.nullDate()) )
      {
         AV82Completo = false ;
         Gx_msg = "Debe ingresar la Fecha Inicial" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         /* Execute user subroutine: 'MENSAJES' */
         S182 ();
         if (returnInSub) return;
         GX_FocusControl = edtavFecha_inicial_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( GXutil.dateCompare(AV13Fecha_Final, GXutil.nullDate()) )
      {
         AV82Completo = false ;
         Gx_msg = "Debe ingresar la Fecha Final" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         /* Execute user subroutine: 'MENSAJES' */
         S182 ();
         if (returnInSub) return;
         GX_FocusControl = edtavFecha_final_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( AV77SW_FechaIni )
      {
         AV82Completo = false ;
         Gx_msg = "La Fecha Inicial no es válida" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         /* Execute user subroutine: 'MENSAJES' */
         S182 ();
         if (returnInSub) return;
         GX_FocusControl = edtavFecha_inicial_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( AV78SW_FechaFin )
      {
         AV82Completo = false ;
         Gx_msg = "La Fecha Final no es válida" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         /* Execute user subroutine: 'MENSAJES' */
         S182 ();
         if (returnInSub) return;
         GX_FocusControl = edtavFecha_final_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
   }

   public void S172( )
   {
      /* 'MOVIMIENTO' Routine */
      if ( GXutil.strcmp(AV17Movimiento_Final, AV16Movimiento_Inicial) < 0 )
      {
         AV82Completo = false ;
         Gx_msg = "El movimiento final debe ser mayor al movimiento inicial" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         /* Execute user subroutine: 'MENSAJES' */
         S182 ();
         if (returnInSub) return;
         GX_FocusControl = dynavMovimiento_inicial.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
   }

   public void S192( )
   {
      /* 'ELEMENTO' Routine */
      if ( AV29Tipo_Codigo == 0 )
      {
         AV82Completo = false ;
         Gx_msg = "Debe seleccionar el tipo de elemento" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         /* Execute user subroutine: 'MENSAJES' */
         S182 ();
         if (returnInSub) return;
         GX_FocusControl = dynavTipo_codigo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
   }

   public void S202( )
   {
      /* 'TRANSACCIONES' Routine */
      if ( AV28Trans_ConsecutivoCCFin < AV27Trans_ConsecutivoCC )
      {
         AV82Completo = false ;
         Gx_msg = "La transacción final debe ser mayor o igual a la inicial" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         /* Execute user subroutine: 'MENSAJES' */
         S182 ();
         if (returnInSub) return;
         GX_FocusControl = edtavTrans_consecutivocc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( AV27Trans_ConsecutivoCC == 0 )
      {
         AV82Completo = false ;
         Gx_msg = "Debe ingresar la transacción inicial" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         /* Execute user subroutine: 'MENSAJES' */
         S182 ();
         if (returnInSub) return;
         GX_FocusControl = edtavTrans_consecutivocc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( AV28Trans_ConsecutivoCCFin == 0 )
      {
         AV82Completo = false ;
         Gx_msg = "Debe ingresar la transacción final" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         /* Execute user subroutine: 'MENSAJES' */
         S182 ();
         if (returnInSub) return;
         GX_FocusControl = edtavTrans_consecutivoccfin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
   }

   public void S152( )
   {
      /* 'PERIODO' Routine */
      AV88SW_Periodo = true ;
      if ( GXutil.strcmp(AV84Periodo, "") == 0 )
      {
         Gx_msg = "Debe ingresar el periodo" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         /* Execute user subroutine: 'MENSAJES' */
         S182 ();
         if (returnInSub) return;
         AV88SW_Periodo = false ;
         AV82Completo = false ;
         GX_FocusControl = edtavPeriodo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV85Anio = (short)(GXutil.lval( GXutil.substring( AV84Periodo, 1, 4))) ;
         AV87Mes = (byte)(GXutil.lval( GXutil.substring( AV84Periodo, 5, 2))) ;
         AV86AnioActual = (short)(GXutil.year( Gx_date)) ;
         if ( ( AV87Mes > 12 ) || ( AV87Mes == 0 ) )
         {
            Gx_msg = "El mes no puede ser mayor a 12 o igual a 0" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            AV88SW_Periodo = false ;
            AV82Completo = false ;
            /* Execute user subroutine: 'MENSAJES' */
            S182 ();
            if (returnInSub) return;
            GX_FocusControl = edtavPeriodo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            AV84Periodo = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84Periodo", AV84Periodo);
         }
         else
         {
            if ( ( AV85Anio > AV86AnioActual ) || ( AV85Anio == 0 ) )
            {
               AV88SW_Periodo = false ;
               Gx_msg = "El año no es válido no puede ser mayor a " + GXutil.str( AV86AnioActual, 4, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
               /* Execute user subroutine: 'MENSAJES' */
               S182 ();
               if (returnInSub) return;
               AV82Completo = false ;
               GX_FocusControl = edtavPeriodo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               AV84Periodo = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV84Periodo", AV84Periodo);
            }
         }
      }
   }

   private void e269L2( )
   {
      /* Grid1_Load Routine */
      AV91GXV1 = (short)(1) ;
      while ( AV91GXV1 <= AV46SDTSKU.size() )
      {
         AV46SDTSKU.currentItem( ((com.orions2.SdtSDTSku_SDTSkuItem)AV46SDTSKU.elementAt(-1+AV91GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(163) ;
         }
         sendrow_1632( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_163_Refreshing )
         {
            httpContext.doAjaxLoad(163, Grid1Row);
         }
         AV91GXV1 = (short)(AV91GXV1+1) ;
      }
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
      pa9L2( ) ;
      ws9L2( ) ;
      we9L2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861810583297");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wp_reportes.js", "?201861810583297");
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      /* End function include_jscripts */
   }

   public void subsflControlProps_1632( )
   {
      edtavCtlelem_consecutivo_Internalname = "CTLELEM_CONSECUTIVO_"+sGXsfl_163_idx ;
      edtavCtlcata_descripcion_Internalname = "CTLCATA_DESCRIPCION_"+sGXsfl_163_idx ;
   }

   public void subsflControlProps_fel_1632( )
   {
      edtavCtlelem_consecutivo_Internalname = "CTLELEM_CONSECUTIVO_"+sGXsfl_163_fel_idx ;
      edtavCtlcata_descripcion_Internalname = "CTLCATA_DESCRIPCION_"+sGXsfl_163_fel_idx ;
   }

   public void sendrow_1632( )
   {
      subsflControlProps_1632( ) ;
      wb9L0( ) ;
      Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
      if ( subGrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         subGrid1_Backcolor = subGrid1_Allbackcolor ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
         subGrid1_Backcolor = (int)(0x0) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_163_idx) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
      }
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr ") ;
         httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
         httpContext.writeText( " gxrow=\""+sGXsfl_163_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlelem_consecutivo_Internalname,((com.orions2.SdtSDTSku_SDTSkuItem)AV46SDTSKU.elementAt(-1+AV91GXV1)).getgxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlelem_consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCtlelem_consecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(163),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcata_descripcion_Internalname,((com.orions2.SdtSDTSku_SDTSkuItem)AV46SDTSKU.elementAt(-1+AV91GXV1)).getgxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion(),GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTSku_SDTSkuItem)AV46SDTSKU.elementAt(-1+AV91GXV1)).getgxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcata_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavCtlcata_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(163),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLELEM_CONSECUTIVO"+"_"+sGXsfl_163_idx, getSecureSignedToken( sGXsfl_163_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTSku_SDTSkuItem)AV46SDTSKU.elementAt(-1+AV91GXV1)).getgxTv_SdtSDTSku_SDTSkuItem_Elem_consecutivo(), ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCATA_DESCRIPCION"+"_"+sGXsfl_163_idx, getSecureSignedToken( sGXsfl_163_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTSku_SDTSkuItem)AV46SDTSKU.elementAt(-1+AV91GXV1)).getgxTv_SdtSDTSku_SDTSkuItem_Cata_descripcion(), "@!"))));
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_163_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_163_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_163_idx+1)) ;
      sGXsfl_163_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_163_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1632( ) ;
      /* End function sendrow_1632 */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      dynavRpt_rep_id.setInternalname( "vRPT_REP_ID" );
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      dynavRegional.setInternalname( "vREGIONAL" );
      chkavTodosregional.setInternalname( "vTODOSREGIONAL" );
      dynavCentro_costo.setInternalname( "vCENTRO_COSTO" );
      chkavTodoscentros.setInternalname( "vTODOSCENTROS" );
      cmbavModulo.setInternalname( "vMODULO" );
      chkavTodosmodulo.setInternalname( "vTODOSMODULO" );
      dynavAlmacen.setInternalname( "vALMACEN" );
      chkavTodosalmacenes.setInternalname( "vTODOSALMACENES" );
      dynavBodega.setInternalname( "vBODEGA" );
      chkavTodosbodegas.setInternalname( "vTODOSBODEGAS" );
      edtavCedula_Internalname = "vCEDULA" ;
      chkavTodoscuentadante.setInternalname( "vTODOSCUENTADANTE" );
      edtavFecha_inicial_Internalname = "vFECHA_INICIAL" ;
      edtavFecha_final_Internalname = "vFECHA_FINAL" ;
      cmbavEstado_inicial.setInternalname( "vESTADO_INICIAL" );
      cmbavEstado_final.setInternalname( "vESTADO_FINAL" );
      dynavMovimiento_inicial.setInternalname( "vMOVIMIENTO_INICIAL" );
      dynavMovimiento_final.setInternalname( "vMOVIMIENTO_FINAL" );
      edtavTrans_consecutivocc_Internalname = "vTRANS_CONSECUTIVOCC" ;
      edtavTrans_consecutivoccfin_Internalname = "vTRANS_CONSECUTIVOCCFIN" ;
      dynavTipo_codigo.setInternalname( "vTIPO_CODIGO" );
      edtavProveedor_Internalname = "vPROVEEDOR" ;
      imgImageareadante_Internalname = "IMAGEAREADANTE" ;
      edtavArea_codigo_Internalname = "vAREA_CODIGO" ;
      edtavArea_descripcion_Internalname = "vAREA_DESCRIPCION" ;
      imgImagecurso_Internalname = "IMAGECURSO" ;
      edtavCurs_codigo_Internalname = "vCURS_CODIGO" ;
      edtavCurs_descripcion_Internalname = "vCURS_DESCRIPCION" ;
      edtavPlaca_Internalname = "vPLACA" ;
      edtavPeriodo_Internalname = "vPERIODO" ;
      cmbavFormato.setInternalname( "vFORMATO" );
      divTable2_Internalname = "TABLE2" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      imgImage7_Internalname = "IMAGE7" ;
      edtavPelem_consecutivo_Internalname = "vPELEM_CONSECUTIVO" ;
      edtavPcata_descripcion_Internalname = "vPCATA_DESCRIPCION" ;
      bttAgregarsku_Internalname = "AGREGARSKU" ;
      edtavCtlelem_consecutivo_Internalname = "CTLELEM_CONSECUTIVO" ;
      edtavCtlcata_descripcion_Internalname = "CTLCATA_DESCRIPCION" ;
      divTable3_Internalname = "TABLE3" ;
      Alertify1_Internalname = "ALERTIFY1" ;
      bttConfirmar_Internalname = "CONFIRMAR" ;
      bttCancelar_Internalname = "CANCELAR" ;
      divTable1_Internalname = "TABLE1" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavCtlcata_descripcion_Jsonclick = "" ;
      edtavCtlelem_consecutivo_Jsonclick = "" ;
      edtavCtlcata_descripcion_Enabled = -1 ;
      edtavCtlelem_consecutivo_Enabled = -1 ;
      chkavTodoscuentadante.setCaption( "Todos" );
      chkavTodosbodegas.setCaption( "Todos" );
      chkavTodosalmacenes.setCaption( "Todos" );
      chkavTodosmodulo.setCaption( "Todos" );
      chkavTodoscentros.setCaption( "Todos" );
      chkavTodosregional.setCaption( "Todos" );
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavCtlcata_descripcion_Enabled = 0 ;
      edtavCtlelem_consecutivo_Enabled = 0 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavPcata_descripcion_Enabled = 1 ;
      edtavPelem_consecutivo_Jsonclick = "" ;
      edtavPelem_consecutivo_Enabled = 1 ;
      divTable3_Visible = 1 ;
      cmbavFormato.setJsonclick( "" );
      cmbavFormato.setEnabled( 1 );
      cmbavFormato.setVisible( 1 );
      edtavPeriodo_Jsonclick = "" ;
      edtavPeriodo_Enabled = 1 ;
      edtavPeriodo_Visible = 1 ;
      edtavPlaca_Jsonclick = "" ;
      edtavPlaca_Enabled = 1 ;
      edtavPlaca_Visible = 1 ;
      edtavCurs_descripcion_Enabled = 1 ;
      edtavCurs_descripcion_Visible = 1 ;
      edtavCurs_codigo_Jsonclick = "" ;
      edtavCurs_codigo_Enabled = 1 ;
      edtavCurs_codigo_Visible = 1 ;
      imgImagecurso_Visible = 1 ;
      edtavArea_descripcion_Enabled = 1 ;
      edtavArea_descripcion_Visible = 1 ;
      edtavArea_codigo_Jsonclick = "" ;
      edtavArea_codigo_Enabled = 1 ;
      edtavArea_codigo_Visible = 1 ;
      imgImageareadante_Visible = 1 ;
      edtavProveedor_Jsonclick = "" ;
      edtavProveedor_Enabled = 1 ;
      edtavProveedor_Visible = 1 ;
      dynavTipo_codigo.setJsonclick( "" );
      dynavTipo_codigo.setEnabled( 1 );
      dynavTipo_codigo.setVisible( 1 );
      edtavTrans_consecutivoccfin_Jsonclick = "" ;
      edtavTrans_consecutivoccfin_Enabled = 1 ;
      edtavTrans_consecutivoccfin_Visible = 1 ;
      edtavTrans_consecutivocc_Jsonclick = "" ;
      edtavTrans_consecutivocc_Enabled = 1 ;
      edtavTrans_consecutivocc_Visible = 1 ;
      dynavMovimiento_final.setJsonclick( "" );
      dynavMovimiento_final.setEnabled( 1 );
      dynavMovimiento_final.setVisible( 1 );
      dynavMovimiento_inicial.setJsonclick( "" );
      dynavMovimiento_inicial.setEnabled( 1 );
      dynavMovimiento_inicial.setVisible( 1 );
      cmbavEstado_final.setJsonclick( "" );
      cmbavEstado_final.setEnabled( 1 );
      cmbavEstado_final.setVisible( 1 );
      cmbavEstado_inicial.setJsonclick( "" );
      cmbavEstado_inicial.setEnabled( 1 );
      cmbavEstado_inicial.setVisible( 1 );
      edtavFecha_final_Jsonclick = "" ;
      edtavFecha_final_Enabled = 1 ;
      edtavFecha_final_Visible = 1 ;
      edtavFecha_inicial_Jsonclick = "" ;
      edtavFecha_inicial_Enabled = 1 ;
      edtavFecha_inicial_Visible = 1 ;
      chkavTodoscuentadante.setEnabled( 1 );
      chkavTodoscuentadante.setVisible( 1 );
      edtavCedula_Jsonclick = "" ;
      edtavCedula_Enabled = 1 ;
      edtavCedula_Visible = 1 ;
      chkavTodosbodegas.setEnabled( 1 );
      chkavTodosbodegas.setVisible( 1 );
      dynavBodega.setJsonclick( "" );
      dynavBodega.setEnabled( 1 );
      dynavBodega.setVisible( 1 );
      chkavTodosalmacenes.setEnabled( 1 );
      chkavTodosalmacenes.setVisible( 1 );
      dynavAlmacen.setJsonclick( "" );
      dynavAlmacen.setEnabled( 1 );
      dynavAlmacen.setVisible( 1 );
      chkavTodosmodulo.setEnabled( 1 );
      chkavTodosmodulo.setVisible( 1 );
      cmbavModulo.setJsonclick( "" );
      cmbavModulo.setEnabled( 1 );
      cmbavModulo.setVisible( 1 );
      chkavTodoscentros.setEnabled( 1 );
      chkavTodoscentros.setVisible( 1 );
      dynavCentro_costo.setJsonclick( "" );
      dynavCentro_costo.setEnabled( 1 );
      dynavCentro_costo.setVisible( 1 );
      chkavTodosregional.setEnabled( 1 );
      chkavTodosregional.setVisible( 1 );
      dynavRegional.setJsonclick( "" );
      dynavRegional.setEnabled( 1 );
      dynavRegional.setVisible( 1 );
      dynavRpt_rep_id.setJsonclick( "" );
      dynavRpt_rep_id.setEnabled( 1 );
      Alertify1_Textcancel = "Cancelar" ;
      Alertify1_Textok = "Confirmar" ;
      Alertify1_Textmessage = "" ;
      Alertify1_Type = "alert" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Reportes" );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void validv_Regional( com.genexus.webpanels.HTMLChoice GX_Parm1 ,
                                com.genexus.webpanels.HTMLChoice GX_Parm2 )
   {
      dynavRegional = GX_Parm1 ;
      AV6Regional = GXutil.lval( dynavRegional.getValue()) ;
      dynavCentro_costo = GX_Parm2 ;
      AV8Centro_Costo = GXutil.lval( dynavCentro_costo.getValue()) ;
      gxvvcentro_costo_html9L2( AV6Regional) ;
      dynload_actions( ) ;
      if ( dynavCentro_costo.getItemCount() > 0 )
      {
         AV8Centro_Costo = GXutil.lval( dynavCentro_costo.getValidValue(GXutil.trim( GXutil.str( AV8Centro_Costo, 11, 0)))) ;
      }
      dynavCentro_costo.setValue( GXutil.trim( GXutil.str( AV8Centro_Costo, 11, 0)) );
      isValidOutput.add(dynavCentro_costo);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void validv_Centro_costo( com.genexus.webpanels.HTMLChoice GX_Parm1 ,
                                    com.genexus.webpanels.HTMLChoice GX_Parm2 ,
                                    com.genexus.webpanels.HTMLChoice GX_Parm3 ,
                                    com.genexus.webpanels.HTMLChoice GX_Parm4 )
   {
      dynavCentro_costo = GX_Parm1 ;
      AV8Centro_Costo = GXutil.lval( dynavCentro_costo.getValue()) ;
      cmbavModulo = GX_Parm2 ;
      AV7Modulo = cmbavModulo.getValue() ;
      dynavAlmacen = GX_Parm3 ;
      AV9Almacen = dynavAlmacen.getValue() ;
      dynavBodega = GX_Parm4 ;
      AV19Bodega = dynavBodega.getValue() ;
      gxvvalmacen_html9L2( AV8Centro_Costo, AV7Modulo) ;
      gxvvbodega_html9L2( AV8Centro_Costo, AV7Modulo, AV9Almacen) ;
      dynload_actions( ) ;
      if ( dynavAlmacen.getItemCount() > 0 )
      {
         AV9Almacen = dynavAlmacen.getValidValue(AV9Almacen) ;
      }
      dynavAlmacen.setValue( AV9Almacen );
      isValidOutput.add(dynavAlmacen);
      if ( dynavBodega.getItemCount() > 0 )
      {
         AV19Bodega = dynavBodega.getValidValue(AV19Bodega) ;
      }
      dynavBodega.setValue( AV19Bodega );
      isValidOutput.add(dynavBodega);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void validv_Modulo( com.genexus.webpanels.HTMLChoice GX_Parm1 ,
                              com.genexus.webpanels.HTMLChoice GX_Parm2 ,
                              com.genexus.webpanels.HTMLChoice GX_Parm3 ,
                              com.genexus.webpanels.HTMLChoice GX_Parm4 )
   {
      dynavCentro_costo = GX_Parm1 ;
      AV8Centro_Costo = GXutil.lval( dynavCentro_costo.getValue()) ;
      cmbavModulo = GX_Parm2 ;
      AV7Modulo = cmbavModulo.getValue() ;
      dynavAlmacen = GX_Parm3 ;
      AV9Almacen = dynavAlmacen.getValue() ;
      dynavBodega = GX_Parm4 ;
      AV19Bodega = dynavBodega.getValue() ;
      gxvvalmacen_html9L2( AV8Centro_Costo, AV7Modulo) ;
      gxvvbodega_html9L2( AV8Centro_Costo, AV7Modulo, AV9Almacen) ;
      dynload_actions( ) ;
      if ( dynavAlmacen.getItemCount() > 0 )
      {
         AV9Almacen = dynavAlmacen.getValidValue(AV9Almacen) ;
      }
      dynavAlmacen.setValue( AV9Almacen );
      isValidOutput.add(dynavAlmacen);
      if ( dynavBodega.getItemCount() > 0 )
      {
         AV19Bodega = dynavBodega.getValidValue(AV19Bodega) ;
      }
      dynavBodega.setValue( AV19Bodega );
      isValidOutput.add(dynavBodega);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void validv_Almacen( com.genexus.webpanels.HTMLChoice GX_Parm1 ,
                               com.genexus.webpanels.HTMLChoice GX_Parm2 ,
                               com.genexus.webpanels.HTMLChoice GX_Parm3 ,
                               com.genexus.webpanels.HTMLChoice GX_Parm4 )
   {
      dynavCentro_costo = GX_Parm1 ;
      AV8Centro_Costo = GXutil.lval( dynavCentro_costo.getValue()) ;
      cmbavModulo = GX_Parm2 ;
      AV7Modulo = cmbavModulo.getValue() ;
      dynavAlmacen = GX_Parm3 ;
      AV9Almacen = dynavAlmacen.getValue() ;
      dynavBodega = GX_Parm4 ;
      AV19Bodega = dynavBodega.getValue() ;
      gxvvbodega_html9L2( AV8Centro_Costo, AV7Modulo, AV9Almacen) ;
      dynload_actions( ) ;
      if ( dynavBodega.getItemCount() > 0 )
      {
         AV19Bodega = dynavBodega.getValidValue(AV19Bodega) ;
      }
      dynavBodega.setValue( AV19Bodega );
      isValidOutput.add(dynavBodega);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV46SDTSKU',fld:'vSDTSKU',grid:163,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("VRPT_REP_ID.ISVALID","{handler:'e139L2',iparms:[{av:'AV11Cedula',fld:'vCEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12Fecha_Inicial',fld:'vFECHA_INICIAL',pic:'',nv:''},{av:'AV13Fecha_Final',fld:'vFECHA_FINAL',pic:'',nv:''},{av:'AV27Trans_ConsecutivoCC',fld:'vTRANS_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV28Trans_ConsecutivoCCFin',fld:'vTRANS_CONSECUTIVOCCFIN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61Proveedor',fld:'vPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV63Area_Codigo',fld:'vAREA_CODIGO',pic:'',nv:''},{av:'AV64Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''},{av:'AV74Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV45pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'cmbavFormato'},{av:'AV32Formato',fld:'vFORMATO',pic:'',nv:''},{av:'AV84Periodo',fld:'vPERIODO',pic:'',nv:''},{av:'dynavRegional'},{av:'AV6Regional',fld:'vREGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavCentro_costo'},{av:'AV8Centro_Costo',fld:'vCENTRO_COSTO',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavAlmacen'},{av:'AV9Almacen',fld:'vALMACEN',pic:'',nv:''},{av:'dynavBodega'},{av:'AV19Bodega',fld:'vBODEGA',pic:'',nv:''},{av:'A844RPT_REP_NOMBRE',fld:'RPT_REP_NOMBRE',pic:'',nv:''},{av:'AV20RPT_REP_NOMBRE',fld:'vRPT_REP_NOMBRE',pic:'',nv:''},{av:'A843RPT_REP_ID',fld:'RPT_REP_ID',pic:'ZZZ9',nv:0},{av:'A842RPT_PAR_ESTADO',fld:'RPT_PAR_ESTADO',pic:'',nv:''},{av:'A840RPT_PAR_ID',fld:'RPT_PAR_ID',pic:'ZZZ9',nv:0},{av:'dynavRpt_rep_id'},{av:'AV5RPT_REP_ID',fld:'vRPT_REP_ID',pic:'ZZZ9',nv:0},{av:'AV21RPT_PAR_ID',fld:'vRPT_PAR_ID',pic:'ZZZ9',nv:0},{av:'A853RPT_REP_PARM_ESTADO',fld:'RPT_REP_PARM_ESTADO',pic:'',nv:''},{av:'AV58Coordinador',fld:'vCOORDINADOR',pic:'',nv:false},{av:'AV22SW',fld:'vSW',pic:'',nv:false},{av:'AV46SDTSKU',fld:'vSDTSKU',grid:163,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0}],oparms:[{av:'AV11Cedula',fld:'vCEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12Fecha_Inicial',fld:'vFECHA_INICIAL',pic:'',nv:''},{av:'AV13Fecha_Final',fld:'vFECHA_FINAL',pic:'',nv:''},{av:'AV27Trans_ConsecutivoCC',fld:'vTRANS_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV28Trans_ConsecutivoCCFin',fld:'vTRANS_CONSECUTIVOCCFIN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV61Proveedor',fld:'vPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV63Area_Codigo',fld:'vAREA_CODIGO',pic:'',nv:''},{av:'AV64Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''},{av:'AV74Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV45pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'cmbavFormato'},{av:'AV32Formato',fld:'vFORMATO',pic:'',nv:''},{av:'AV84Periodo',fld:'vPERIODO',pic:'',nv:''},{av:'AV46SDTSKU',fld:'vSDTSKU',grid:163,pic:'',nv:null},{av:'AV25TodosCentros',fld:'vTODOSCENTROS',pic:'',nv:false},{av:'AV24TodosRegional',fld:'vTODOSREGIONAL',pic:'',nv:false},{av:'AV71TodosAlmacenes',fld:'vTODOSALMACENES',pic:'',nv:false},{av:'AV72TodosBodegas',fld:'vTODOSBODEGAS',pic:'',nv:false},{av:'AV70TodosModulo',fld:'vTODOSMODULO',pic:'',nv:false},{av:'AV73TodosCuentadante',fld:'vTODOSCUENTADANTE',pic:'',nv:false},{av:'dynavRegional'},{av:'AV6Regional',fld:'vREGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavCentro_costo'},{av:'AV8Centro_Costo',fld:'vCENTRO_COSTO',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavModulo'},{av:'dynavAlmacen'},{av:'AV9Almacen',fld:'vALMACEN',pic:'',nv:''},{av:'dynavBodega'},{av:'AV19Bodega',fld:'vBODEGA',pic:'',nv:''},{av:'dynavRpt_rep_id'},{av:'AV5RPT_REP_ID',fld:'vRPT_REP_ID',pic:'ZZZ9',nv:0},{av:'AV21RPT_PAR_ID',fld:'vRPT_PAR_ID',pic:'ZZZ9',nv:0},{av:'AV22SW',fld:'vSW',pic:'',nv:false},{av:'edtavPeriodo_Visible',ctrl:'vPERIODO',prop:'Visible'},{av:'edtavPlaca_Visible',ctrl:'vPLACA',prop:'Visible'},{av:'edtavCurs_codigo_Visible',ctrl:'vCURS_CODIGO',prop:'Visible'},{av:'imgImagecurso_Visible',ctrl:'IMAGECURSO',prop:'Visible'},{av:'edtavCurs_descripcion_Visible',ctrl:'vCURS_DESCRIPCION',prop:'Visible'},{av:'edtavArea_codigo_Visible',ctrl:'vAREA_CODIGO',prop:'Visible'},{av:'imgImageareadante_Visible',ctrl:'IMAGEAREADANTE',prop:'Visible'},{av:'edtavArea_descripcion_Visible',ctrl:'vAREA_DESCRIPCION',prop:'Visible'},{av:'edtavProveedor_Visible',ctrl:'vPROVEEDOR',prop:'Visible'},{av:'divTable3_Visible',ctrl:'TABLE3',prop:'Visible'},{av:'dynavTipo_codigo'},{av:'edtavTrans_consecutivoccfin_Visible',ctrl:'vTRANS_CONSECUTIVOCCFIN',prop:'Visible'},{av:'edtavTrans_consecutivocc_Visible',ctrl:'vTRANS_CONSECUTIVOCC',prop:'Visible'},{av:'dynavMovimiento_final'},{av:'dynavMovimiento_inicial'},{av:'cmbavEstado_final'},{av:'cmbavEstado_inicial'},{av:'edtavFecha_final_Visible',ctrl:'vFECHA_FINAL',prop:'Visible'},{av:'edtavFecha_inicial_Visible',ctrl:'vFECHA_INICIAL',prop:'Visible'},{av:'edtavCedula_Visible',ctrl:'vCEDULA',prop:'Visible'},{av:'chkavTodoscuentadante.getVisible()',ctrl:'vTODOSCUENTADANTE',prop:'Visible'},{av:'chkavTodosbodegas.getVisible()',ctrl:'vTODOSBODEGAS',prop:'Visible'},{av:'chkavTodosalmacenes.getVisible()',ctrl:'vTODOSALMACENES',prop:'Visible'},{av:'chkavTodosmodulo.getVisible()',ctrl:'vTODOSMODULO',prop:'Visible'},{av:'chkavTodoscentros.getVisible()',ctrl:'vTODOSCENTROS',prop:'Visible'},{av:'chkavTodosregional.getVisible()',ctrl:'vTODOSREGIONAL',prop:'Visible'}]}");
      setEventMetadata("VREGIONAL.ISVALID","{handler:'e149L2',iparms:[{av:'AV38Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavRegional'},{av:'AV6Regional',fld:'vREGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'A12Regi_Cod',fld:'REGI_COD',pic:'ZZZ9',nv:0}],oparms:[{av:'AV38Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0}]}");
      setEventMetadata("VCENTRO_COSTO.ISVALID","{handler:'e159L2',iparms:[{av:'AV39Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavCentro_costo'},{av:'AV8Centro_Costo',fld:'vCENTRO_COSTO',pic:'ZZZZZZZZZZ9',nv:0},{av:'A3Cent_Codigo',fld:'CENT_CODIGO',pic:'',nv:''}],oparms:[{av:'AV39Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("VCEDULA.ISVALID","{handler:'e169L2',iparms:[{av:'AV11Cedula',fld:'vCEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV26SW_Cuentadante',fld:'vSW_CUENTADANTE',pic:'',nv:false},{av:'A688Cuen_Cedula',fld:'CUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV62Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV62Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV26SW_Cuentadante',fld:'vSW_CUENTADANTE',pic:'',nv:false}]}");
      setEventMetadata("VPROVEEDOR.ISVALID","{handler:'e179L2',iparms:[{av:'AV61Proveedor',fld:'vPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV26SW_Cuentadante',fld:'vSW_CUENTADANTE',pic:'',nv:false},{av:'A688Cuen_Cedula',fld:'CUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV62Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV62Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV26SW_Cuentadante',fld:'vSW_CUENTADANTE',pic:'',nv:false}]}");
      setEventMetadata("'CANCELAR'","{handler:'e189L2',iparms:[],oparms:[]}");
      setEventMetadata("'SKU'","{handler:'e249L2',iparms:[],oparms:[{av:'AV44pCata_Descripcion',fld:'vPCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV45pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''}]}");
      setEventMetadata("'AGREGAR SKU'","{handler:'e199L2',iparms:[{av:'AV80SW_Consecutivo',fld:'vSW_CONSECUTIVO',pic:'',nv:false},{av:'AV45pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV46SDTSKU',fld:'vSDTSKU',grid:163,pic:'',nv:null},{av:'AV44pCata_Descripcion',fld:'vPCATA_DESCRIPCION',pic:'@!',nv:''},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0}],oparms:[{av:'AV79SW_SKU',fld:'vSW_SKU',pic:'',nv:false},{av:'AV46SDTSKU',fld:'vSDTSKU',grid:163,pic:'',nv:null},{av:'AV45pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV44pCata_Descripcion',fld:'vPCATA_DESCRIPCION',pic:'@!',nv:''}]}");
      setEventMetadata("'AREADANTE'","{handler:'e119L1',iparms:[{av:'AV39Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}],oparms:[{av:'AV66Area_Descripcion',fld:'vAREA_DESCRIPCION',pic:'',nv:''},{av:'AV63Area_Codigo',fld:'vAREA_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("'CURSO'","{handler:'e129L1',iparms:[{av:'AV39Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}],oparms:[{av:'AV67Curs_Descripcion',fld:'vCURS_DESCRIPCION',pic:'',nv:''},{av:'AV64Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("VPLACA.ISVALID","{handler:'e209L2',iparms:[{av:'AV74Placa',fld:'vPLACA',pic:'',nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("VPERIODO.ISVALID","{handler:'e219L2',iparms:[{av:'AV84Periodo',fld:'vPERIODO',pic:'',nv:''},{av:'Gx_date',fld:'vTODAY',pic:'',nv:''},{av:'Gx_msg',fld:'vMSG',pic:'',nv:''}],oparms:[{av:'Gx_msg',fld:'vMSG',pic:'',nv:''},{av:'AV84Periodo',fld:'vPERIODO',pic:'',nv:''},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'}]}");
      setEventMetadata("VPELEM_CONSECUTIVO.ISVALID","{handler:'e229L2',iparms:[{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''},{av:'AV45pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'AV80SW_Consecutivo',fld:'vSW_CONSECUTIVO',pic:'',nv:false},{av:'AV44pCata_Descripcion',fld:'vPCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV45pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''}]}");
      setEventMetadata("'CONFIRMAR'","{handler:'e239L2',iparms:[{av:'cmbavEstado_inicial'},{av:'AV14Estado_Inicial',fld:'vESTADO_INICIAL',pic:'',nv:''},{av:'cmbavEstado_final'},{av:'AV15Estado_Final',fld:'vESTADO_FINAL',pic:'',nv:''},{av:'AV45pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV79SW_SKU',fld:'vSW_SKU',pic:'',nv:false},{av:'AV27Trans_ConsecutivoCC',fld:'vTRANS_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV74Placa',fld:'vPLACA',pic:'',nv:''},{av:'dynavRpt_rep_id'},{av:'AV5RPT_REP_ID',fld:'vRPT_REP_ID',pic:'ZZZ9',nv:0},{av:'AV12Fecha_Inicial',fld:'vFECHA_INICIAL',pic:'',nv:''},{av:'AV13Fecha_Final',fld:'vFECHA_FINAL',pic:'',nv:''},{av:'AV77SW_FechaIni',fld:'vSW_FECHAINI',pic:'',nv:false},{av:'AV78SW_FechaFin',fld:'vSW_FECHAFIN',pic:'',nv:false},{av:'dynavMovimiento_final'},{av:'AV17Movimiento_Final',fld:'vMOVIMIENTO_FINAL',pic:'',nv:''},{av:'dynavMovimiento_inicial'},{av:'AV16Movimiento_Inicial',fld:'vMOVIMIENTO_INICIAL',pic:'',nv:''},{av:'Gx_msg',fld:'vMSG',pic:'',nv:''},{av:'dynavTipo_codigo'},{av:'AV29Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV28Trans_ConsecutivoCCFin',fld:'vTRANS_CONSECUTIVOCCFIN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV84Periodo',fld:'vPERIODO',pic:'',nv:''},{av:'Gx_date',fld:'vTODAY',pic:'',nv:''},{av:'AV24TodosRegional',fld:'vTODOSREGIONAL',pic:'',nv:false},{av:'AV38Regi_Cod',fld:'vREGI_COD',pic:'ZZZ9',nv:0},{av:'AV25TodosCentros',fld:'vTODOSCENTROS',pic:'',nv:false},{av:'AV70TodosModulo',fld:'vTODOSMODULO',pic:'',nv:false},{av:'AV71TodosAlmacenes',fld:'vTODOSALMACENES',pic:'',nv:false},{av:'AV72TodosBodegas',fld:'vTODOSBODEGAS',pic:'',nv:false},{av:'AV73TodosCuentadante',fld:'vTODOSCUENTADANTE',pic:'',nv:false},{av:'AV11Cedula',fld:'vCEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV39Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'cmbavModulo'},{av:'AV7Modulo',fld:'vMODULO',pic:'',nv:''},{av:'dynavAlmacen'},{av:'AV9Almacen',fld:'vALMACEN',pic:'',nv:''},{av:'dynavBodega'},{av:'AV19Bodega',fld:'vBODEGA',pic:'',nv:''},{av:'AV61Proveedor',fld:'vPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV63Area_Codigo',fld:'vAREA_CODIGO',pic:'',nv:''},{av:'AV64Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''},{av:'cmbavFormato'},{av:'AV32Formato',fld:'vFORMATO',pic:'',nv:''},{av:'AV46SDTSKU',fld:'vSDTSKU',grid:163,pic:'',nv:null},{av:'AV68Usuario',fld:'vUSUARIO',pic:'@!',nv:''},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0}],oparms:[{av:'Gx_msg',fld:'vMSG',pic:'',nv:''},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV84Periodo',fld:'vPERIODO',pic:'',nv:''},{av:'AV39Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'cmbavFormato'},{av:'AV32Formato',fld:'vFORMATO',pic:'',nv:''},{av:'cmbavModulo'},{av:'AV7Modulo',fld:'vMODULO',pic:'',nv:''},{av:'dynavAlmacen'},{av:'AV9Almacen',fld:'vALMACEN',pic:'',nv:''},{av:'dynavBodega'},{av:'AV19Bodega',fld:'vBODEGA',pic:'',nv:''},{av:'AV68Usuario',fld:'vUSUARIO',pic:'@!',nv:''},{av:'AV46SDTSKU',fld:'vSDTSKU',grid:163,pic:'',nv:null},{av:'AV74Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV64Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''},{av:'AV63Area_Codigo',fld:'vAREA_CODIGO',pic:'',nv:''},{av:'AV61Proveedor',fld:'vPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'dynavTipo_codigo'},{av:'AV29Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV28Trans_ConsecutivoCCFin',fld:'vTRANS_CONSECUTIVOCCFIN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV27Trans_ConsecutivoCC',fld:'vTRANS_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'dynavMovimiento_final'},{av:'AV17Movimiento_Final',fld:'vMOVIMIENTO_FINAL',pic:'',nv:''},{av:'dynavMovimiento_inicial'},{av:'AV16Movimiento_Inicial',fld:'vMOVIMIENTO_INICIAL',pic:'',nv:''},{av:'cmbavEstado_final'},{av:'AV15Estado_Final',fld:'vESTADO_FINAL',pic:'',nv:''},{av:'cmbavEstado_inicial'},{av:'AV14Estado_Inicial',fld:'vESTADO_INICIAL',pic:'',nv:''},{av:'AV13Fecha_Final',fld:'vFECHA_FINAL',pic:'',nv:''},{av:'AV12Fecha_Inicial',fld:'vFECHA_INICIAL',pic:'',nv:''},{av:'dynavRpt_rep_id'},{av:'AV5RPT_REP_ID',fld:'vRPT_REP_ID',pic:'ZZZ9',nv:0}]}");
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
      AV7Modulo = "" ;
      AV9Almacen = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV46SDTSKU = new GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem>(com.orions2.SdtSDTSku_SDTSkuItem.class, "SDTSku.SDTSkuItem", "ACBSENA", remoteHandle);
      A844RPT_REP_NOMBRE = "" ;
      AV20RPT_REP_NOMBRE = "" ;
      A842RPT_PAR_ESTADO = "" ;
      A853RPT_REP_PARM_ESTADO = "" ;
      AV39Cent_Codigo = "" ;
      A3Cent_Codigo = "" ;
      Gx_date = GXutil.nullDate() ;
      A67Invd_NumeroPlaca = "" ;
      Gx_msg = "" ;
      A37Cata_Codigo = "" ;
      A298Cata_Descripcion = "" ;
      AV68Usuario = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitle_Jsonclick = "" ;
      TempTags = "" ;
      lblTextblock2_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV19Bodega = "" ;
      AV12Fecha_Inicial = GXutil.nullDate() ;
      AV13Fecha_Final = GXutil.nullDate() ;
      AV14Estado_Inicial = "" ;
      AV15Estado_Final = "" ;
      AV16Movimiento_Inicial = "" ;
      AV17Movimiento_Final = "" ;
      sImgUrl = "" ;
      imgImageareadante_Jsonclick = "" ;
      AV63Area_Codigo = "" ;
      AV66Area_Descripcion = "" ;
      imgImagecurso_Jsonclick = "" ;
      AV64Curs_Codigo = "" ;
      AV67Curs_Descripcion = "" ;
      AV74Placa = "" ;
      AV84Periodo = "" ;
      AV32Formato = "" ;
      lblTextblock1_Jsonclick = "" ;
      imgImage7_Jsonclick = "" ;
      AV45pElem_Consecutivo = "" ;
      AV44pCata_Descripcion = "" ;
      bttAgregarsku_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      bttConfirmar_Jsonclick = "" ;
      bttCancelar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      scmdbuf = "" ;
      H009L2_A38Tpmo_Codigo = new String[] {""} ;
      H009L3_A38Tpmo_Codigo = new String[] {""} ;
      H009L4_A33Tipo_Codigo = new long[1] ;
      H009L4_A253Tipo_Descripcion = new String[] {""} ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      H009L5_A33Tipo_Codigo = new long[1] ;
      H009L5_A253Tipo_Descripcion = new String[] {""} ;
      H009L6_A38Tpmo_Codigo = new String[] {""} ;
      H009L7_A38Tpmo_Codigo = new String[] {""} ;
      H009L8_A843RPT_REP_ID = new short[1] ;
      H009L8_A845RPT_REP_DESCRIPCION = new String[] {""} ;
      H009L8_n845RPT_REP_DESCRIPCION = new boolean[] {false} ;
      H009L9_A2Regi_Id = new long[1] ;
      H009L9_A13Regi_Descripcion = new String[] {""} ;
      H009L9_A164Regi_Estado = new String[] {""} ;
      H009L9_A12Regi_Cod = new short[1] ;
      H009L10_A1Cent_Id = new long[1] ;
      H009L10_A4Cent_Descripcion = new String[] {""} ;
      H009L10_A2Regi_Id = new long[1] ;
      H009L10_A683Cent_Estado = new String[] {""} ;
      H009L10_n683Cent_Estado = new boolean[] {false} ;
      H009L11_A28Alma_Codigo = new String[] {""} ;
      H009L11_A252Alma_Descripcion = new String[] {""} ;
      H009L11_A1Cent_Id = new long[1] ;
      H009L11_A27Alma_Modulo = new String[] {""} ;
      H009L11_A673Alma_Estado = new String[] {""} ;
      H009L11_n673Alma_Estado = new boolean[] {false} ;
      H009L12_A31Bode_Codigo = new String[] {""} ;
      H009L12_A695BBode_Descripcion = new String[] {""} ;
      H009L12_A1Cent_Id = new long[1] ;
      H009L12_A27Alma_Modulo = new String[] {""} ;
      H009L12_A28Alma_Codigo = new String[] {""} ;
      H009L12_A696BBode_Estado = new String[] {""} ;
      AV56websession = httpContext.getWebSession();
      H009L13_A844RPT_REP_NOMBRE = new String[] {""} ;
      H009L13_n844RPT_REP_NOMBRE = new boolean[] {false} ;
      H009L13_A843RPT_REP_ID = new short[1] ;
      H009L14_A842RPT_PAR_ESTADO = new String[] {""} ;
      H009L14_n842RPT_PAR_ESTADO = new boolean[] {false} ;
      H009L14_A840RPT_PAR_ID = new short[1] ;
      H009L15_A853RPT_REP_PARM_ESTADO = new String[] {""} ;
      H009L15_n853RPT_REP_PARM_ESTADO = new boolean[] {false} ;
      H009L15_A840RPT_PAR_ID = new short[1] ;
      H009L15_A843RPT_REP_ID = new short[1] ;
      H009L16_A2Regi_Id = new long[1] ;
      H009L16_A12Regi_Cod = new short[1] ;
      H009L17_A1Cent_Id = new long[1] ;
      H009L17_A3Cent_Codigo = new String[] {""} ;
      H009L18_A43Cuen_Identificacion = new long[1] ;
      H009L18_A688Cuen_Cedula = new long[1] ;
      AV47SDTSKUItem = new com.orions2.SdtSDTSku_SDTSkuItem(remoteHandle, context);
      H009L19_A21Rol_Id = new long[1] ;
      H009L19_A23Usua_Id = new long[1] ;
      H009L20_A66Elem_Consecutivo = new String[] {""} ;
      H009L20_A67Invd_NumeroPlaca = new String[] {""} ;
      H009L21_A37Cata_Codigo = new String[] {""} ;
      H009L21_A298Cata_Descripcion = new String[] {""} ;
      AV69Codigo_Regional = "" ;
      AV83CedulaChar = "" ;
      GXv_int1 = new short [1] ;
      GXv_char2 = new String [1] ;
      GXv_char3 = new String [1] ;
      GXv_char4 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_char6 = new String [1] ;
      GXv_char7 = new String [1] ;
      GXv_date8 = new java.util.Date [1] ;
      GXv_date9 = new java.util.Date [1] ;
      GXv_char10 = new String [1] ;
      GXv_char11 = new String [1] ;
      GXv_char12 = new String [1] ;
      GXv_char13 = new String [1] ;
      GXv_int14 = new long [1] ;
      GXv_int15 = new long [1] ;
      GXv_int16 = new long [1] ;
      GXv_int17 = new long [1] ;
      GXv_char18 = new String [1] ;
      GXv_char19 = new String [1] ;
      GXv_char20 = new String [1] ;
      GXv_char21 = new String [1] ;
      GXv_objcol_SdtSDTSku_SDTSkuItem22 = new GXBaseCollection [1] ;
      GXv_char23 = new String [1] ;
      GXv_char24 = new String [1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wp_reportes__default(),
         new Object[] {
             new Object[] {
            H009L2_A38Tpmo_Codigo
            }
            , new Object[] {
            H009L3_A38Tpmo_Codigo
            }
            , new Object[] {
            H009L4_A33Tipo_Codigo, H009L4_A253Tipo_Descripcion
            }
            , new Object[] {
            H009L5_A33Tipo_Codigo, H009L5_A253Tipo_Descripcion
            }
            , new Object[] {
            H009L6_A38Tpmo_Codigo
            }
            , new Object[] {
            H009L7_A38Tpmo_Codigo
            }
            , new Object[] {
            H009L8_A843RPT_REP_ID, H009L8_A845RPT_REP_DESCRIPCION, H009L8_n845RPT_REP_DESCRIPCION
            }
            , new Object[] {
            H009L9_A2Regi_Id, H009L9_A13Regi_Descripcion, H009L9_A164Regi_Estado, H009L9_A12Regi_Cod
            }
            , new Object[] {
            H009L10_A1Cent_Id, H009L10_A4Cent_Descripcion, H009L10_A2Regi_Id, H009L10_A683Cent_Estado, H009L10_n683Cent_Estado
            }
            , new Object[] {
            H009L11_A28Alma_Codigo, H009L11_A252Alma_Descripcion, H009L11_A1Cent_Id, H009L11_A27Alma_Modulo, H009L11_A673Alma_Estado, H009L11_n673Alma_Estado
            }
            , new Object[] {
            H009L12_A31Bode_Codigo, H009L12_A695BBode_Descripcion, H009L12_A1Cent_Id, H009L12_A27Alma_Modulo, H009L12_A28Alma_Codigo, H009L12_A696BBode_Estado
            }
            , new Object[] {
            H009L13_A844RPT_REP_NOMBRE, H009L13_n844RPT_REP_NOMBRE, H009L13_A843RPT_REP_ID
            }
            , new Object[] {
            H009L14_A842RPT_PAR_ESTADO, H009L14_n842RPT_PAR_ESTADO, H009L14_A840RPT_PAR_ID
            }
            , new Object[] {
            H009L15_A853RPT_REP_PARM_ESTADO, H009L15_n853RPT_REP_PARM_ESTADO, H009L15_A840RPT_PAR_ID, H009L15_A843RPT_REP_ID
            }
            , new Object[] {
            H009L16_A2Regi_Id, H009L16_A12Regi_Cod
            }
            , new Object[] {
            H009L17_A1Cent_Id, H009L17_A3Cent_Codigo
            }
            , new Object[] {
            H009L18_A43Cuen_Identificacion, H009L18_A688Cuen_Cedula
            }
            , new Object[] {
            H009L19_A21Rol_Id, H009L19_A23Usua_Id
            }
            , new Object[] {
            H009L20_A66Elem_Consecutivo, H009L20_A67Invd_NumeroPlaca
            }
            , new Object[] {
            H009L21_A37Cata_Codigo, H009L21_A298Cata_Descripcion
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavArea_descripcion_Enabled = 0 ;
      edtavCurs_descripcion_Enabled = 0 ;
      edtavPcata_descripcion_Enabled = 0 ;
      edtavCtlelem_consecutivo_Enabled = 0 ;
      edtavCtlcata_descripcion_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte GRID1_nEOF ;
   private byte AV103GXLvl474 ;
   private byte AV87Mes ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte wbTemp ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRC_GXsfl_163 ;
   private short nGXsfl_163_idx=1 ;
   private short A843RPT_REP_ID ;
   private short A840RPT_PAR_ID ;
   private short AV21RPT_PAR_ID ;
   private short AV38Regi_Cod ;
   private short A12Regi_Cod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV5RPT_REP_ID ;
   private short AV91GXV1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_163_fel_idx=1 ;
   private short nGXsfl_163_bak_idx=1 ;
   private short GXv_int1[] ;
   private short AV85Anio ;
   private short AV86AnioActual ;
   private int edtavCedula_Visible ;
   private int edtavCedula_Enabled ;
   private int edtavFecha_inicial_Visible ;
   private int edtavFecha_inicial_Enabled ;
   private int edtavFecha_final_Visible ;
   private int edtavFecha_final_Enabled ;
   private int edtavTrans_consecutivocc_Enabled ;
   private int edtavTrans_consecutivocc_Visible ;
   private int edtavTrans_consecutivoccfin_Enabled ;
   private int edtavTrans_consecutivoccfin_Visible ;
   private int edtavProveedor_Enabled ;
   private int edtavProveedor_Visible ;
   private int imgImageareadante_Visible ;
   private int edtavArea_codigo_Visible ;
   private int edtavArea_codigo_Enabled ;
   private int edtavArea_descripcion_Visible ;
   private int edtavArea_descripcion_Enabled ;
   private int imgImagecurso_Visible ;
   private int edtavCurs_codigo_Visible ;
   private int edtavCurs_codigo_Enabled ;
   private int edtavCurs_descripcion_Visible ;
   private int edtavCurs_descripcion_Enabled ;
   private int edtavPlaca_Visible ;
   private int edtavPlaca_Enabled ;
   private int edtavPeriodo_Visible ;
   private int edtavPeriodo_Enabled ;
   private int divTable3_Visible ;
   private int edtavPelem_consecutivo_Enabled ;
   private int edtavPcata_descripcion_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCtlelem_consecutivo_Enabled ;
   private int edtavCtlcata_descripcion_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int subGrid1_Islastpage ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV6Regional ;
   private long AV8Centro_Costo ;
   private long A2Regi_Id ;
   private long A1Cent_Id ;
   private long A688Cuen_Cedula ;
   private long AV62Cuen_Cedula ;
   private long AV11Cedula ;
   private long AV27Trans_ConsecutivoCC ;
   private long AV28Trans_ConsecutivoCCFin ;
   private long AV29Tipo_Codigo ;
   private long AV61Proveedor ;
   private long GRID1_nCurrentRecord ;
   private long AV57Usua_Id ;
   private long GRID1_nFirstRecordOnPage ;
   private long A21Rol_Id ;
   private long A23Usua_Id ;
   private long GXv_int14[] ;
   private long GXv_int15[] ;
   private long GXv_int16[] ;
   private long GXv_int17[] ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_163_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A842RPT_PAR_ESTADO ;
   private String A853RPT_REP_PARM_ESTADO ;
   private String Gx_msg ;
   private String Alertify1_Type ;
   private String Alertify1_Textmessage ;
   private String Alertify1_Textok ;
   private String Alertify1_Textcancel ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTable1_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String divTable2_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String edtavCedula_Internalname ;
   private String edtavCedula_Jsonclick ;
   private String edtavFecha_inicial_Internalname ;
   private String edtavFecha_inicial_Jsonclick ;
   private String edtavFecha_final_Internalname ;
   private String edtavFecha_final_Jsonclick ;
   private String AV14Estado_Inicial ;
   private String AV15Estado_Final ;
   private String edtavTrans_consecutivocc_Internalname ;
   private String edtavTrans_consecutivocc_Jsonclick ;
   private String edtavTrans_consecutivoccfin_Internalname ;
   private String edtavTrans_consecutivoccfin_Jsonclick ;
   private String edtavProveedor_Internalname ;
   private String edtavProveedor_Jsonclick ;
   private String sImgUrl ;
   private String imgImageareadante_Internalname ;
   private String imgImageareadante_Jsonclick ;
   private String edtavArea_codigo_Internalname ;
   private String edtavArea_codigo_Jsonclick ;
   private String edtavArea_descripcion_Internalname ;
   private String imgImagecurso_Internalname ;
   private String imgImagecurso_Jsonclick ;
   private String edtavCurs_codigo_Internalname ;
   private String edtavCurs_codigo_Jsonclick ;
   private String edtavCurs_descripcion_Internalname ;
   private String edtavPlaca_Internalname ;
   private String edtavPlaca_Jsonclick ;
   private String edtavPeriodo_Internalname ;
   private String AV84Periodo ;
   private String edtavPeriodo_Jsonclick ;
   private String AV32Formato ;
   private String divTable3_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String imgImage7_Internalname ;
   private String imgImage7_Jsonclick ;
   private String edtavPelem_consecutivo_Internalname ;
   private String edtavPelem_consecutivo_Jsonclick ;
   private String edtavPcata_descripcion_Internalname ;
   private String bttAgregarsku_Internalname ;
   private String bttAgregarsku_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String bttConfirmar_Internalname ;
   private String bttConfirmar_Jsonclick ;
   private String bttCancelar_Internalname ;
   private String bttCancelar_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String gxwrpcisep ;
   private String edtavCtlelem_consecutivo_Internalname ;
   private String edtavCtlcata_descripcion_Internalname ;
   private String sGXsfl_163_fel_idx="0001" ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String GXv_char20[] ;
   private String GXv_char21[] ;
   private String GXv_char23[] ;
   private String GXv_char24[] ;
   private String Alertify1_Internalname ;
   private String ROClassString ;
   private String edtavCtlelem_consecutivo_Jsonclick ;
   private String edtavCtlcata_descripcion_Jsonclick ;
   private java.util.Date Gx_date ;
   private java.util.Date AV12Fecha_Inicial ;
   private java.util.Date AV13Fecha_Final ;
   private java.util.Date GXv_date8[] ;
   private java.util.Date GXv_date9[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV58Coordinador ;
   private boolean AV22SW ;
   private boolean AV26SW_Cuentadante ;
   private boolean AV80SW_Consecutivo ;
   private boolean AV79SW_SKU ;
   private boolean AV77SW_FechaIni ;
   private boolean AV78SW_FechaFin ;
   private boolean wbLoad ;
   private boolean AV24TodosRegional ;
   private boolean AV25TodosCentros ;
   private boolean AV70TodosModulo ;
   private boolean AV71TodosAlmacenes ;
   private boolean AV72TodosBodegas ;
   private boolean AV73TodosCuentadante ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_163_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_BV163 ;
   private boolean n844RPT_REP_NOMBRE ;
   private boolean n842RPT_PAR_ESTADO ;
   private boolean n853RPT_REP_PARM_ESTADO ;
   private boolean AV23Error ;
   private boolean AV75SW_Placa ;
   private boolean AV82Completo ;
   private boolean AV88SW_Periodo ;
   private String AV7Modulo ;
   private String AV9Almacen ;
   private String A844RPT_REP_NOMBRE ;
   private String AV20RPT_REP_NOMBRE ;
   private String AV39Cent_Codigo ;
   private String A3Cent_Codigo ;
   private String A67Invd_NumeroPlaca ;
   private String A37Cata_Codigo ;
   private String A298Cata_Descripcion ;
   private String AV68Usuario ;
   private String AV19Bodega ;
   private String AV16Movimiento_Inicial ;
   private String AV17Movimiento_Final ;
   private String AV63Area_Codigo ;
   private String AV66Area_Descripcion ;
   private String AV64Curs_Codigo ;
   private String AV67Curs_Descripcion ;
   private String AV74Placa ;
   private String AV45pElem_Consecutivo ;
   private String AV44pCata_Descripcion ;
   private String AV69Codigo_Regional ;
   private String AV83CedulaChar ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV56websession ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private HTMLChoice dynavRpt_rep_id ;
   private HTMLChoice dynavRegional ;
   private ICheckbox chkavTodosregional ;
   private HTMLChoice dynavCentro_costo ;
   private ICheckbox chkavTodoscentros ;
   private HTMLChoice cmbavModulo ;
   private ICheckbox chkavTodosmodulo ;
   private HTMLChoice dynavAlmacen ;
   private ICheckbox chkavTodosalmacenes ;
   private HTMLChoice dynavBodega ;
   private ICheckbox chkavTodosbodegas ;
   private ICheckbox chkavTodoscuentadante ;
   private HTMLChoice cmbavEstado_inicial ;
   private HTMLChoice cmbavEstado_final ;
   private HTMLChoice dynavMovimiento_inicial ;
   private HTMLChoice dynavMovimiento_final ;
   private HTMLChoice dynavTipo_codigo ;
   private HTMLChoice cmbavFormato ;
   private IDataStoreProvider pr_default ;
   private String[] H009L2_A38Tpmo_Codigo ;
   private String[] H009L3_A38Tpmo_Codigo ;
   private long[] H009L4_A33Tipo_Codigo ;
   private String[] H009L4_A253Tipo_Descripcion ;
   private long[] H009L5_A33Tipo_Codigo ;
   private String[] H009L5_A253Tipo_Descripcion ;
   private String[] H009L6_A38Tpmo_Codigo ;
   private String[] H009L7_A38Tpmo_Codigo ;
   private short[] H009L8_A843RPT_REP_ID ;
   private String[] H009L8_A845RPT_REP_DESCRIPCION ;
   private boolean[] H009L8_n845RPT_REP_DESCRIPCION ;
   private long[] H009L9_A2Regi_Id ;
   private String[] H009L9_A13Regi_Descripcion ;
   private String[] H009L9_A164Regi_Estado ;
   private short[] H009L9_A12Regi_Cod ;
   private long[] H009L10_A1Cent_Id ;
   private String[] H009L10_A4Cent_Descripcion ;
   private long[] H009L10_A2Regi_Id ;
   private String[] H009L10_A683Cent_Estado ;
   private boolean[] H009L10_n683Cent_Estado ;
   private String[] H009L11_A28Alma_Codigo ;
   private String[] H009L11_A252Alma_Descripcion ;
   private long[] H009L11_A1Cent_Id ;
   private String[] H009L11_A27Alma_Modulo ;
   private String[] H009L11_A673Alma_Estado ;
   private boolean[] H009L11_n673Alma_Estado ;
   private String[] H009L12_A31Bode_Codigo ;
   private String[] H009L12_A695BBode_Descripcion ;
   private long[] H009L12_A1Cent_Id ;
   private String[] H009L12_A27Alma_Modulo ;
   private String[] H009L12_A28Alma_Codigo ;
   private String[] H009L12_A696BBode_Estado ;
   private String[] H009L13_A844RPT_REP_NOMBRE ;
   private boolean[] H009L13_n844RPT_REP_NOMBRE ;
   private short[] H009L13_A843RPT_REP_ID ;
   private String[] H009L14_A842RPT_PAR_ESTADO ;
   private boolean[] H009L14_n842RPT_PAR_ESTADO ;
   private short[] H009L14_A840RPT_PAR_ID ;
   private String[] H009L15_A853RPT_REP_PARM_ESTADO ;
   private boolean[] H009L15_n853RPT_REP_PARM_ESTADO ;
   private short[] H009L15_A840RPT_PAR_ID ;
   private short[] H009L15_A843RPT_REP_ID ;
   private long[] H009L16_A2Regi_Id ;
   private short[] H009L16_A12Regi_Cod ;
   private long[] H009L17_A1Cent_Id ;
   private String[] H009L17_A3Cent_Codigo ;
   private long[] H009L18_A43Cuen_Identificacion ;
   private long[] H009L18_A688Cuen_Cedula ;
   private long[] H009L19_A21Rol_Id ;
   private long[] H009L19_A23Usua_Id ;
   private String[] H009L20_A66Elem_Consecutivo ;
   private String[] H009L20_A67Invd_NumeroPlaca ;
   private String[] H009L21_A37Cata_Codigo ;
   private String[] H009L21_A298Cata_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem> AV46SDTSKU ;
   private GXBaseCollection<com.orions2.SdtSDTSku_SDTSkuItem> GXv_objcol_SdtSDTSku_SDTSkuItem22[] ;
   private com.orions2.SdtSDTSku_SDTSkuItem AV47SDTSKUItem ;
}

final  class wp_reportes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H009L2", "SELECT Tpmo_Codigo FROM ALM_TIPO_MOVIMIENTO ORDER BY Tpmo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H009L3", "SELECT Tpmo_Codigo FROM ALM_TIPO_MOVIMIENTO ORDER BY Tpmo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H009L4", "SELECT Tipo_Codigo, Tipo_Descripcion FROM ALM_TIPO_ELEMENTO ORDER BY Tipo_Descripcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H009L5", "SELECT Tipo_Codigo, Tipo_Descripcion FROM ALM_TIPO_ELEMENTO ORDER BY Tipo_Descripcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H009L6", "SELECT Tpmo_Codigo FROM ALM_TIPO_MOVIMIENTO ORDER BY Tpmo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H009L7", "SELECT Tpmo_Codigo FROM ALM_TIPO_MOVIMIENTO ORDER BY Tpmo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H009L8", "SELECT RPT_REP_ID, RPT_REP_DESCRIPCION FROM RPT_REPORTE ORDER BY RPT_REP_DESCRIPCION ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H009L9", "SELECT Regi_Id, Regi_Descripcion, Regi_Estado, Regi_Cod FROM GEN_REGIONAL WHERE (Regi_Cod <> 0) AND (Regi_Estado = 'A') ORDER BY Regi_Descripcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H009L10", "SELECT Cent_Id, Cent_Descripcion, Regi_Id, Cent_Estado FROM GEN_CENTROCOSTO WHERE (Regi_Id = ?) AND (Cent_Estado = 'A') ORDER BY Cent_Descripcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H009L11", "SELECT Alma_Codigo, Alma_Descripcion, Cent_Id, Alma_Modulo, Alma_Estado FROM ALM_ALMACEN WHERE (Cent_Id = ?) AND (Alma_Modulo = ?) AND (Alma_Estado = 'A') ORDER BY Alma_Descripcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H009L12", "SELECT Bode_Codigo, BBode_Descripcion, Cent_Id, Alma_Modulo, Alma_Codigo, BBode_Estado FROM ALM_ALMACEN_BODEGAS WHERE (Cent_Id = ?) AND (Alma_Modulo = ?) AND (Alma_Codigo = ?) AND (BBode_Estado = 'A') ORDER BY BBode_Descripcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H009L13", "SELECT RPT_REP_NOMBRE, RPT_REP_ID FROM RPT_REPORTE WHERE RTRIM(LTRIM(UPPER(RPT_REP_NOMBRE))) = RTRIM(LTRIM(UPPER(?))) ORDER BY RPT_REP_ID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H009L14", "SELECT RPT_PAR_ESTADO, RPT_PAR_ID FROM RPT_PARAMETROS WHERE RPT_PAR_ESTADO = 'A' ORDER BY RPT_PAR_ID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H009L15", "SELECT RPT_REP_PARM_ESTADO, RPT_PAR_ID, RPT_REP_ID FROM RPT_REP_PARM WHERE (RPT_REP_ID = ? and RPT_PAR_ID = ?) AND (RPT_REP_PARM_ESTADO = 'A') ORDER BY RPT_REP_ID, RPT_PAR_ID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H009L16", "SELECT Regi_Id, Regi_Cod FROM GEN_REGIONAL WHERE Regi_Id = ? ORDER BY Regi_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H009L17", "SELECT Cent_Id, Cent_Codigo FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ORDER BY Cent_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H009L18", "SELECT Cuen_Identificacion, Cuen_Cedula FROM ALM_CUENTADANTE WHERE Cuen_Cedula = ? ORDER BY Cuen_Identificacion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H009L19", "SELECT Rol_Id, Usua_Id FROM SEG_USUARIO_ROL WHERE Usua_Id = ? and Rol_Id = 3 ORDER BY Usua_Id, Rol_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H009L20", "SELECT Elem_Consecutivo, Invd_NumeroPlaca FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Invd_NumeroPlaca = ? ORDER BY Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H009L21", "SELECT Cata_Codigo, Cata_Descripcion FROM ALM_CATALOGO WHERE Cata_Codigo = ? ORDER BY Cata_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 1) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getString(4, 1) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 1) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getString(6, 1) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 15 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 16 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 16 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 17 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 9);
               return;
      }
   }

}

