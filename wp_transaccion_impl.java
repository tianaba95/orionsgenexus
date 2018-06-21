/*
               File: wp_transaccion_impl
        Description: Transaccion
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:26.22
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

public final  class wp_transaccion_impl extends GXDataArea
{
   public wp_transaccion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wp_transaccion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wp_transaccion_impl.class ));
   }

   public wp_transaccion_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynavTran_regionid = new HTMLChoice();
      cmbavTran_centrocostoid = new HTMLChoice();
      dynavTran_moduloorigen = new HTMLChoice();
      dynavTran_regioniddestino = new HTMLChoice();
      cmbavTran_centrocostoiddestino = new HTMLChoice();
      cmbavTran_modulodestino = new HTMLChoice();
      dynavTran_tipoingreso = new HTMLChoice();
      cmbavTran_detalle = new HTMLChoice();
      cmbavTran_tipoentra = new HTMLChoice();
      cmbavTran_entidadgobierno = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vTRAN_REGIONID") == 0 )
         {
            AV20IdUsuario = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20IdUsuario", GXutil.ltrim( GXutil.str( AV20IdUsuario, 18, 0)));
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdsvvtran_regionid632( AV20IdUsuario) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vTRAN_MODULOORIGEN") == 0 )
         {
            AV61Tran_CodigoMovimiento = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61Tran_CodigoMovimiento", AV61Tran_CodigoMovimiento);
            AV55Tran_CentroCostoId = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)));
            AV77Tran_RegionId = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77Tran_RegionId", GXutil.ltrim( GXutil.str( AV77Tran_RegionId, 11, 0)));
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdsvvtran_moduloorigen632( AV61Tran_CodigoMovimiento, AV55Tran_CentroCostoId, AV77Tran_RegionId) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vTRAN_REGIONIDDESTINO") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdsvvtran_regioniddestino632( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vTRAN_TIPOINGRESO") == 0 )
         {
            AV61Tran_CodigoMovimiento = httpContext.GetNextPar( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61Tran_CodigoMovimiento", AV61Tran_CodigoMovimiento);
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdsvvtran_tipoingreso632( AV61Tran_CodigoMovimiento) ;
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
            nRC_GXsfl_204 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_204_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_204_idx = httpContext.GetNextPar( ) ;
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
      pa632( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start632( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414202699");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wp_transaccion") +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtdocumentos", AV93SDTDocumentos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtdocumentos", AV93SDTDocumentos);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_204", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_204, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "USUA_ID", GXutil.ltrim( localUtil.ntoc( A23Usua_Id, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGI_ID", GXutil.ltrim( localUtil.ntoc( A2Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ID", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_CODIGO", A3Cent_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_DESCRIPCION", A4Cent_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CODALMAORIGEN", AV58Tran_CodAlmaOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CODBODEORIGEN", AV60Tran_CodBodeOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CODBODEDESTINO", AV59Tran_CodBodeDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CODALMADESTINO", AV57Tran_CodAlmaDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_CODIGO", A38Tpmo_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_INGRESAAREDANTE", A440Tpmo_IngresaAredante);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_INGRESACURSO", A441Tpmo_IngresaCurso);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_TIPOE_S", A315Tpmo_TipoE_S);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_TIPO", GXutil.rtrim( A480Tipo_Tipo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_SOLICITAREGIONDESTINO", A705Tpmo_SolicitaRegionDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_SOLICITACENTRODESTINO", A706Tpmo_SolicitaCentroDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_CUENTARESPONSABILIDAD", A680Tpmo_CuentaResponsabilidad);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_CODIGO", AV10Cent_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vIND_E_S", AV23Ind_E_S);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDCUENTADANTEORIGEN", GXutil.ltrim( localUtil.ntoc( AV66Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDPROVEEDOR", GXutil.ltrim( localUtil.ntoc( AV68Tran_IdProveedor, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWBIEN", GXutil.ltrim( localUtil.ntoc( AV41SWBien, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_REGIONALID", GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_MODULOALMACEN", A412Invd_ModuloAlmacen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ALMACENCODIGO", A413Invd_AlmacenCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_BODEGACODIGO", A414Invd_BodegaCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ESTADO", A463Invd_Estado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( AV53Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDCUENTADANTEDESTINO", GXutil.ltrim( localUtil.ntoc( AV65Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENTROCDESTINO", AV11CentroCDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ORIG_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( A41Orig_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_SOLICITANUMERO", A642Tpmo_SolicitaNumero);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TPMO_SOLICITAFECHA", A643Tpmo_SolicitaFecha);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vIND_TIPO", GXutil.rtrim( AV25Ind_Tipo));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDCUENTADANTERESPONSABILIDAD", GXutil.ltrim( localUtil.ntoc( AV67Tran_IdCuentadanteResponsabilidad, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR", GXutil.ltrim( localUtil.ntoc( AV42SWError, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR1", GXutil.ltrim( localUtil.ntoc( AV43SWError1, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR2", GXutil.ltrim( localUtil.ntoc( AV44SWError2, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR3", GXutil.ltrim( localUtil.ntoc( AV45SWError3, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR4", GXutil.ltrim( localUtil.ntoc( AV46SWError4, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR5", GXutil.ltrim( localUtil.ntoc( AV47SWError5, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR6", GXutil.ltrim( localUtil.ntoc( AV95SWError6, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR7", GXutil.ltrim( localUtil.ntoc( AV96SWError7, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR8", GXutil.ltrim( localUtil.ntoc( AV97SWError8, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR9", GXutil.ltrim( localUtil.ntoc( AV98SWError9, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR10", GXutil.ltrim( localUtil.ntoc( AV99SWError10, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR11", GXutil.ltrim( localUtil.ntoc( AV100SWError11, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTNUEVATRANSACCION", AV36SDTNuevaTransaccion);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTNUEVATRANSACCION", AV36SDTNuevaTransaccion);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGIONDESTINO", AV27RegionDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDRESPONSABILIDAD", GXutil.ltrim( localUtil.ntoc( AV69Tran_IdResponsabilidad, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTABLA", GXutil.ltrim( localUtil.ntoc( AV52Tabla, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV5Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCONSECUTIVOCC", AV12ConsecutivoCC);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vIDUSUARIO", GXutil.ltrim( localUtil.ntoc( AV20IdUsuario, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IMAGE2_Visible", GXutil.ltrim( localUtil.ntoc( imgImage2_Visible, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IMAGE3_Visible", GXutil.ltrim( localUtil.ntoc( imgImage3_Visible, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IMAGE5_Visible", GXutil.ltrim( localUtil.ntoc( imgImage5_Visible, (byte)(5), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "IMAGE6_Visible", GXutil.ltrim( localUtil.ntoc( imgImage6_Visible, (byte)(5), (byte)(0), ".", "")));
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
         we632( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt632( ) ;
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
      return formatLink("com.orions2.wp_transaccion")  ;
   }

   public String getPgmname( )
   {
      return "WP_Transaccion" ;
   }

   public String getPgmdesc( )
   {
      return "Transaccion" ;
   }

   public void wb630( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Transacción", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-10 col-lg-offset-1", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable5_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-1", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavTran_regionid.getInternalname(), "Región", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavTran_regionid, dynavTran_regionid.getInternalname(), GXutil.trim( GXutil.str( AV77Tran_RegionId, 11, 0)), 1, dynavTran_regionid.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, dynavTran_regionid.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "", true, "HLP_WP_Transaccion.htm");
         dynavTran_regionid.setValue( GXutil.trim( GXutil.str( AV77Tran_RegionId, 11, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavTran_regionid.getInternalname(), "Values", dynavTran_regionid.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-1", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-7", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavTran_centrocostoid.getInternalname(), "Centro de costo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTran_centrocostoid, cmbavTran_centrocostoid.getInternalname(), GXutil.trim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)), 1, cmbavTran_centrocostoid.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavTran_centrocostoid.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "", true, "HLP_WP_Transaccion.htm");
         cmbavTran_centrocostoid.setValue( GXutil.trim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTran_centrocostoid.getInternalname(), "Values", cmbavTran_centrocostoid.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage7_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar movimiento", "Seleccionar movimiento", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage7_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'TIPOMOVIMIENTO\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_codigomovimiento_Internalname, "Movimiento", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_codigomovimiento_Internalname, AV61Tran_CodigoMovimiento, GXutil.rtrim( localUtil.format( AV61Tran_CodigoMovimiento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_codigomovimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_codigomovimiento_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_descripcionmovimiento_Internalname, "Descripcion Movimiento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_descripcionmovimiento_Internalname, AV84Tran_DescripcionMovimiento, GXutil.rtrim( localUtil.format( AV84Tran_DescripcionMovimiento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_descripcionmovimiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_descripcionmovimiento_Enabled, 0, "text", "", 60, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable3_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "Datos orígen", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavTran_moduloorigen.getInternalname(), "Módulo", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavTran_moduloorigen, dynavTran_moduloorigen.getInternalname(), GXutil.rtrim( AV71Tran_ModuloOrigen), 1, dynavTran_moduloorigen.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, dynavTran_moduloorigen.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "", true, "HLP_WP_Transaccion.htm");
         dynavTran_moduloorigen.setValue( GXutil.rtrim( AV71Tran_ModuloOrigen) );
         httpContext.ajax_rsp_assign_prop("", false, dynavTran_moduloorigen.getInternalname(), "Values", dynavTran_moduloorigen.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage8_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar almacén orígen", "Seleccionar almacén orígen", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage8_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'ALMAORIGEN\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPtran_codalmaorigen_Internalname, "Almacén", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPtran_codalmaorigen_Internalname, AV87pTran_CodAlmaOrigen, GXutil.rtrim( localUtil.format( AV87pTran_CodAlmaOrigen, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPtran_codalmaorigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtavPtran_codalmaorigen_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlmaorigendescri_Internalname, "Nombre", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlmaorigendescri_Internalname, AV85AlmaOrigenDescri, GXutil.rtrim( localUtil.format( AV85AlmaOrigenDescri, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlmaorigendescri_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAlmaorigendescri_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage9_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar bodega orígen", "Seleccionar bodega orígen", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage9_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BODEGAORIGEN\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPtran_codbodeorigen_Internalname, "Bodega", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPtran_codbodeorigen_Internalname, AV88pTran_CodBodeOrigen, GXutil.rtrim( localUtil.format( AV88pTran_CodBodeOrigen, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPtran_codbodeorigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtavPtran_codbodeorigen_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavBode_descripcionorigen_Internalname, "Bode_Descripcion Origen", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavBode_descripcionorigen_Internalname, AV86Bode_DescripcionOrigen, GXutil.rtrim( localUtil.format( AV86Bode_DescripcionOrigen, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBode_descripcionorigen_Jsonclick, 0, "Attribute", "", "", "", 1, edtavBode_descripcionorigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage4_Visible, 1, "Seleccionar cuentadante", "Seleccionar cuentadante", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage4_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'CUENTADANTEORIGEN\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCuen_cedulaorigen_Internalname, "Cuentadante", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCuen_cedulaorigen_Internalname, GXutil.ltrim( localUtil.ntoc( AV15Cuen_CedulaOrigen, (byte)(18), (byte)(0), ",", "")), ((edtavCuen_cedulaorigen_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15Cuen_CedulaOrigen), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV15Cuen_CedulaOrigen), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuen_cedulaorigen_Jsonclick, 0, "Attribute", "", "", "", edtavCuen_cedulaorigen_Visible, edtavCuen_cedulaorigen_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_nombcuentadanteorigen_Internalname, AV73Tran_NombCuentadanteOrigen, GXutil.rtrim( localUtil.format( AV73Tran_NombCuentadanteOrigen, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_nombcuentadanteorigen_Jsonclick, 0, "Attribute", "", "", "", edtavTran_nombcuentadanteorigen_Visible, edtavTran_nombcuentadanteorigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage1_Visible, 1, "Seleccionar proveedor", "Seleccionar proveedor", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage1_Jsonclick, "'"+""+"'"+",false,"+"'"+"e11631_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCuen_cedula_Internalname, "Proveedor", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCuen_cedula_Internalname, GXutil.ltrim( localUtil.ntoc( AV13Cuen_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtavCuen_cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV13Cuen_Cedula), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuen_cedula_Jsonclick, 0, "Attribute", "", "", "", edtavCuen_cedula_Visible, edtavCuen_cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNombreproveedor_Internalname, "Nombre", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNombreproveedor_Internalname, AV26NombreProveedor, GXutil.rtrim( localUtil.format( AV26NombreProveedor, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNombreproveedor_Jsonclick, 0, "Attribute", "", "", "", edtavNombreproveedor_Visible, edtavNombreproveedor_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_Transaccion.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "Datos destino", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavTran_regioniddestino.getInternalname(), "Región", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavTran_regioniddestino, dynavTran_regioniddestino.getInternalname(), GXutil.trim( GXutil.str( AV78Tran_RegionIdDestino, 11, 0)), 1, dynavTran_regioniddestino.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", dynavTran_regioniddestino.getVisible(), dynavTran_regioniddestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "", true, "HLP_WP_Transaccion.htm");
         dynavTran_regioniddestino.setValue( GXutil.trim( GXutil.str( AV78Tran_RegionIdDestino, 11, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavTran_regioniddestino.getInternalname(), "Values", dynavTran_regioniddestino.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavTran_centrocostoiddestino.getInternalname(), "Centro de Costo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTran_centrocostoiddestino, cmbavTran_centrocostoiddestino.getInternalname(), GXutil.trim( GXutil.str( AV56Tran_CentroCostoIdDestino, 11, 0)), 1, cmbavTran_centrocostoiddestino.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavTran_centrocostoiddestino.getVisible(), cmbavTran_centrocostoiddestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "", true, "HLP_WP_Transaccion.htm");
         cmbavTran_centrocostoiddestino.setValue( GXutil.trim( GXutil.str( AV56Tran_CentroCostoIdDestino, 11, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTran_centrocostoiddestino.getInternalname(), "Values", cmbavTran_centrocostoiddestino.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-1", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavTran_modulodestino.getInternalname(), "Módulo", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTran_modulodestino, cmbavTran_modulodestino.getInternalname(), GXutil.rtrim( AV70Tran_ModuloDestino), 1, cmbavTran_modulodestino.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbavTran_modulodestino.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "", true, "HLP_WP_Transaccion.htm");
         cmbavTran_modulodestino.setValue( GXutil.rtrim( AV70Tran_ModuloDestino) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTran_modulodestino.getInternalname(), "Values", cmbavTran_modulodestino.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage10_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar almacén destino", "Seleccionar almacén destino", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage10_Jsonclick, "'"+""+"'"+",false,"+"'"+"e12631_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPtran_codalmadestino_Internalname, "Almacén", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPtran_codalmadestino_Internalname, AV90pTran_CodAlmaDestino, GXutil.rtrim( localUtil.format( AV90pTran_CodAlmaDestino, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPtran_codalmadestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtavPtran_codalmadestino_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAlma_descripciondestino_Internalname, "Alma_Descripcion Destino", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAlma_descripciondestino_Internalname, AV89Alma_DescripcionDestino, GXutil.rtrim( localUtil.format( AV89Alma_DescripcionDestino, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlma_descripciondestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAlma_descripciondestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage11_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar bodega destino", "Seleccionar bodega destino", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage11_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BODEDESTINO\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPtran_codbodedestino_Internalname, "Bodega", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPtran_codbodedestino_Internalname, AV91pTran_CodBodeDestino, GXutil.rtrim( localUtil.format( AV91pTran_CodBodeDestino, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPtran_codbodedestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtavPtran_codbodedestino_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavBode_descripciondestino_Internalname, "Bode_Descripcion Destino", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavBode_descripciondestino_Internalname, AV92Bode_DescripcionDestino, GXutil.rtrim( localUtil.format( AV92Bode_DescripcionDestino, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBode_descripciondestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtavBode_descripciondestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImagecuentadante_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImagecuentadante_Visible, 1, "Seleccionar cuentadante", "Seleccionar cuentadante", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImagecuentadante_Jsonclick, "'"+""+"'"+",false,"+"'"+"e13631_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCuen_ceduladestino_Internalname, "Cuentadante", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCuen_ceduladestino_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Cuen_CedulaDestino, (byte)(18), (byte)(0), ",", "")), ((edtavCuen_ceduladestino_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14Cuen_CedulaDestino), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV14Cuen_CedulaDestino), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,128);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuen_ceduladestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCuen_ceduladestino_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_nombcuentadantedestino_Internalname, AV72Tran_NombCuentadanteDestino, GXutil.rtrim( localUtil.format( AV72Tran_NombCuentadanteDestino, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_nombcuentadantedestino_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_nombcuentadantedestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable4_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavTran_tipoingreso.getInternalname(), dynavTran_tipoingreso.getCaption(), "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavTran_tipoingreso, dynavTran_tipoingreso.getInternalname(), GXutil.trim( GXutil.str( AV80Tran_TipoIngreso, 11, 0)), 1, dynavTran_tipoingreso.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", dynavTran_tipoingreso.getVisible(), dynavTran_tipoingreso.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,138);\"", "", true, "HLP_WP_Transaccion.htm");
         dynavTran_tipoingreso.setValue( GXutil.trim( GXutil.str( AV80Tran_TipoIngreso, 11, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavTran_tipoingreso.getInternalname(), "Values", dynavTran_tipoingreso.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_numeroingreso_Internalname, "Número", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_numeroingreso_Internalname, GXutil.rtrim( AV75Tran_numeroIngreso), GXutil.rtrim( localUtil.format( AV75Tran_numeroIngreso, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_numeroingreso_Jsonclick, 0, "Attribute", "", "", "", edtavTran_numeroingreso_Visible, edtavTran_numeroingreso_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_fechaingreso_Internalname, "Fecha (DD/MM/AAAA)", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavTran_fechaingreso_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_fechaingreso_Internalname, localUtil.format(AV63Tran_FechaIngreso, "99/99/9999"), localUtil.format( AV63Tran_FechaIngreso, "99/99/9999"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_fechaingreso_Jsonclick, 0, "Attribute", "", "", "", edtavTran_fechaingreso_Visible, edtavTran_fechaingreso_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavTran_fechaingreso_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavTran_fechaingreso_Visible==0)||(edtavTran_fechaingreso_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WP_Transaccion.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavTran_detalle.getInternalname(), "Ingresar el detalle masivo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTran_detalle, cmbavTran_detalle.getInternalname(), GXutil.rtrim( AV62Tran_detalle), 1, cmbavTran_detalle.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavTran_detalle.getVisible(), cmbavTran_detalle.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,148);\"", "", true, "HLP_WP_Transaccion.htm");
         cmbavTran_detalle.setValue( GXutil.rtrim( AV62Tran_detalle) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTran_detalle.getInternalname(), "Values", cmbavTran_detalle.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavTran_tipoentra.getInternalname(), "Tipo de entrada devolutivo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTran_tipoentra, cmbavTran_tipoentra.getInternalname(), GXutil.rtrim( AV79Tran_TipoEntra), 1, cmbavTran_tipoentra.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavTran_tipoentra.getVisible(), cmbavTran_tipoentra.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "", true, "HLP_WP_Transaccion.htm");
         cmbavTran_tipoentra.setValue( GXutil.rtrim( AV79Tran_TipoEntra) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTran_tipoentra.getInternalname(), "Values", cmbavTran_tipoentra.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage2_Visible, 1, "Seleccionar areadante", "Seleccionar areadante", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage2_Jsonclick, "'"+""+"'"+",false,"+"'"+"e14631_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavArea_codigo_Internalname, "Areadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavArea_codigo_Internalname, AV6Area_Codigo, GXutil.rtrim( localUtil.format( AV6Area_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,157);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArea_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavArea_codigo_Visible, edtavArea_codigo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-8", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavArea_descripcion_Internalname, AV7Area_Descripcion, GXutil.rtrim( localUtil.format( AV7Area_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,160);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArea_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavArea_descripcion_Visible, edtavArea_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage3_Visible, 1, "Seleccionar curso", "Seleccionar curso", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage3_Jsonclick, "'"+""+"'"+",false,"+"'"+"e15631_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCurs_codigo_Internalname, "Curso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCurs_codigo_Internalname, AV17Curs_Codigo, GXutil.rtrim( localUtil.format( AV17Curs_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCurs_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCurs_codigo_Visible, edtavCurs_codigo_Enabled, 0, "text", "", 41, "chr", 1, "row", 41, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-8", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCurs_descripcion_Internalname, AV18Curs_Descripcion, GXutil.rtrim( localUtil.format( AV18Curs_Descripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCurs_descripcion_Jsonclick, 0, "Attribute", "", "", "", edtavCurs_descripcion_Visible, edtavCurs_descripcion_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage5_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage5_Visible, 1, "Cuentadante", "Cuentadante", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage5_Jsonclick, "'"+""+"'"+",false,"+"'"+"e16631_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCuen_cedularespons_Internalname, "Cuenta de Responsabilidad", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 175,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCuen_cedularespons_Internalname, GXutil.ltrim( localUtil.ntoc( AV16Cuen_CedulaRespons, (byte)(18), (byte)(0), ",", "")), ((edtavCuen_cedularespons_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16Cuen_CedulaRespons), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV16Cuen_CedulaRespons), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,175);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuen_cedularespons_Jsonclick, 0, "Attribute", "", "", "", edtavCuen_cedularespons_Visible, edtavCuen_cedularespons_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_nombrecuentadanteresponsabilidad_Internalname, AV74Tran_NombreCuentadanteResponsabilidad, GXutil.rtrim( localUtil.format( AV74Tran_NombreCuentadanteResponsabilidad, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,178);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_nombrecuentadanteresponsabilidad_Jsonclick, 0, "Attribute", "", "", "", edtavTran_nombrecuentadanteresponsabilidad_Visible, edtavTran_nombrecuentadanteresponsabilidad_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage6_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage6_Visible, 1, "Transacción", "Transacción", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage6_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'TRANSACCIóN\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_transaccresponsabilidad_Internalname, "Transacción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_transaccresponsabilidad_Internalname, GXutil.ltrim( localUtil.ntoc( AV81Tran_TransaccResponsabilidad, (byte)(11), (byte)(0), ",", "")), ((edtavTran_transaccresponsabilidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV81Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV81Tran_TransaccResponsabilidad), "ZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_transaccresponsabilidad_Jsonclick, 0, "Attribute", "", "", "", edtavTran_transaccresponsabilidad_Visible, edtavTran_transaccresponsabilidad_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_fecharesponsabilidad_Internalname, "Fecha", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavTran_fecharesponsabilidad_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_fecharesponsabilidad_Internalname, localUtil.format(AV64Tran_FechaResponsabilidad, "99/99/9999"), localUtil.format( AV64Tran_FechaResponsabilidad, "99/99/9999"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,187);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_fecharesponsabilidad_Jsonclick, 0, "Attribute", "", "", "", edtavTran_fecharesponsabilidad_Visible, edtavTran_fecharesponsabilidad_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavTran_fecharesponsabilidad_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavTran_fecharesponsabilidad_Visible==0)||(edtavTran_fecharesponsabilidad_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WP_Transaccion.htm");
         httpContext.writeTextNL( "</div>") ;
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
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavTran_entidadgobierno.getInternalname(), "Entidad Gobierno", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTran_entidadgobierno, cmbavTran_entidadgobierno.getInternalname(), GXutil.rtrim( AV101Tran_EntidadGobierno), 1, cmbavTran_entidadgobierno.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "svchar", "", 1, cmbavTran_entidadgobierno.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "", true, "HLP_WP_Transaccion.htm");
         cmbavTran_entidadgobierno.setValue( GXutil.rtrim( AV101Tran_EntidadGobierno) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTran_entidadgobierno.getInternalname(), "Values", cmbavTran_entidadgobierno.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_observaciones_Internalname, "Observaciones", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 195,'',false,'" + sGXsfl_204_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavTran_observaciones_Internalname, AV76Tran_Observaciones, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,195);\"", (short)(0), 1, edtavTran_observaciones_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-8 col-lg-offset-2", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable6_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "Documentos soporte", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 TableCell", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"204\">") ;
            sStyleString = "" ;
            sStyleString = sStyleString + " height: " + GXutil.ltrim( GXutil.str( 8, 10, 0)) + "" + ";" ;
            sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 25, 10, 0)) + "px" + ";" ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 42, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Nro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 310, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Documento") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Archivo") ;
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
            Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid1_Width, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Height", GXutil.ltrim( localUtil.ntoc( subGrid1_Height, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltran_nro_documento_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltran_descrip_documento_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 204 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_204 = (short)(nGXsfl_204_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV104GXV1 = nGXsfl_204_idx ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttConfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 204, 3, 0)+","+"null"+");", "Confirmar", bttConfirmar_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_Transaccion.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttCancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 204, 3, 0)+","+"null"+");", "Cancelar", bttCancelar_Jsonclick, 5, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_Transaccion.htm");
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

   public void start632( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Transaccion", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup630( ) ;
   }

   public void ws632( )
   {
      start632( ) ;
      evt632( ) ;
   }

   public void evt632( )
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
                        else if ( GXutil.strcmp(sEvt, "ALERTIFY1.OK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTRAN_REGIONID.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTRAN_CENTROCOSTOID.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTRAN_DESCRIPCIONMOVIMIENTO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e20632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTRAN_MODULOORIGEN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e21632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'BODEGAORIGEN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'BodegaOrigen' */
                           e22632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBODE_DESCRIPCIONORIGEN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e23632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTRAN_MODULODESTINO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e24632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTRAN_REGIONIDDESTINO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e25632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'BODEDESTINO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'BodeDestino' */
                           e26632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTRAN_TIPOINGRESO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e27632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTRAN_FECHAINGRESO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e28632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTRAN_DETALLE.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e29632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'TRANSACCIóN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Transacción' */
                           e30632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTRAN_OBSERVACIONES.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e31632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Confirmar' */
                           e32632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CANCELAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Cancelar' */
                           e33632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'TIPOMOVIMIENTO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'TipoMovimiento' */
                           e34632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ALMAORIGEN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'AlmaOrigen' */
                           e35632 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CUENTADANTEORIGEN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'CuentadanteOrigen' */
                           e36632 ();
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
                           nGXsfl_204_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_204_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_204_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_2042( ) ;
                           AV104GXV1 = nGXsfl_204_idx ;
                           if ( ( AV93SDTDocumentos.size() >= AV104GXV1 ) && ( AV104GXV1 > 0 ) )
                           {
                              AV93SDTDocumentos.currentItem( ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)) );
                           }
                           if ( (GXutil.strcmp("", ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo())==0) )
                           {
                              GXCCtl = "CTLTRAN_ARCHIVO_" + sGXsfl_204_idx ;
                              GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
                              ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo( httpContext.cgiGet( GXCCtlgxBlob) );
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
                                 e37632 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e38632 ();
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

   public void we632( )
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

   public void pa632( )
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
         dynavTran_regionid.setName( "vTRAN_REGIONID" );
         dynavTran_regionid.setWebtags( "" );
         cmbavTran_centrocostoid.setName( "vTRAN_CENTROCOSTOID" );
         cmbavTran_centrocostoid.setWebtags( "" );
         if ( cmbavTran_centrocostoid.getItemCount() > 0 )
         {
            AV55Tran_CentroCostoId = GXutil.lval( cmbavTran_centrocostoid.getValidValue(GXutil.trim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)));
         }
         dynavTran_moduloorigen.setName( "vTRAN_MODULOORIGEN" );
         dynavTran_moduloorigen.setWebtags( "" );
         dynavTran_regioniddestino.setName( "vTRAN_REGIONIDDESTINO" );
         dynavTran_regioniddestino.setWebtags( "" );
         cmbavTran_centrocostoiddestino.setName( "vTRAN_CENTROCOSTOIDDESTINO" );
         cmbavTran_centrocostoiddestino.setWebtags( "" );
         if ( cmbavTran_centrocostoiddestino.getItemCount() > 0 )
         {
            AV56Tran_CentroCostoIdDestino = GXutil.lval( cmbavTran_centrocostoiddestino.getValidValue(GXutil.trim( GXutil.str( AV56Tran_CentroCostoIdDestino, 11, 0)))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( AV56Tran_CentroCostoIdDestino, 11, 0)));
         }
         cmbavTran_modulodestino.setName( "vTRAN_MODULODESTINO" );
         cmbavTran_modulodestino.setWebtags( "" );
         cmbavTran_modulodestino.addItem("", "", (short)(0));
         cmbavTran_modulodestino.addItem("ACTFI", "ACTIVO FIJO", (short)(0));
         cmbavTran_modulodestino.addItem("INVE", "INVENTARIO", (short)(0));
         cmbavTran_modulodestino.addItem("ALMA", "ALMACEN", (short)(0));
         if ( cmbavTran_modulodestino.getItemCount() > 0 )
         {
            AV70Tran_ModuloDestino = cmbavTran_modulodestino.getValidValue(AV70Tran_ModuloDestino) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70Tran_ModuloDestino", AV70Tran_ModuloDestino);
         }
         dynavTran_tipoingreso.setName( "vTRAN_TIPOINGRESO" );
         dynavTran_tipoingreso.setWebtags( "" );
         cmbavTran_detalle.setName( "vTRAN_DETALLE" );
         cmbavTran_detalle.setWebtags( "" );
         cmbavTran_detalle.addItem("N", "NO", (short)(0));
         cmbavTran_detalle.addItem("S", "SI", (short)(0));
         if ( cmbavTran_detalle.getItemCount() > 0 )
         {
            AV62Tran_detalle = cmbavTran_detalle.getValidValue(AV62Tran_detalle) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62Tran_detalle", AV62Tran_detalle);
         }
         cmbavTran_tipoentra.setName( "vTRAN_TIPOENTRA" );
         cmbavTran_tipoentra.setWebtags( "" );
         cmbavTran_tipoentra.addItem("", "(Ninguno)", (short)(0));
         cmbavTran_tipoentra.addItem("UEUP", "Un elemento Un Padre", (short)(0));
         cmbavTran_tipoentra.addItem("NEUP", "N elementos Un Padre", (short)(0));
         cmbavTran_tipoentra.addItem("ELSP", "Elementos sin Padre", (short)(0));
         if ( cmbavTran_tipoentra.getItemCount() > 0 )
         {
            AV79Tran_TipoEntra = cmbavTran_tipoentra.getValidValue(AV79Tran_TipoEntra) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79Tran_TipoEntra", AV79Tran_TipoEntra);
         }
         cmbavTran_entidadgobierno.setName( "vTRAN_ENTIDADGOBIERNO" );
         cmbavTran_entidadgobierno.setWebtags( "" );
         cmbavTran_entidadgobierno.addItem("", "", (short)(0));
         cmbavTran_entidadgobierno.addItem("SI", "SI", (short)(0));
         cmbavTran_entidadgobierno.addItem("NO", "NO", (short)(0));
         if ( cmbavTran_entidadgobierno.getItemCount() > 0 )
         {
            AV101Tran_EntidadGobierno = cmbavTran_entidadgobierno.getValidValue(AV101Tran_EntidadGobierno) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101Tran_EntidadGobierno", AV101Tran_EntidadGobierno);
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
            GX_FocusControl = dynavTran_regionid.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      gxvvtran_moduloorigen_html632( AV61Tran_CodigoMovimiento, AV55Tran_CentroCostoId, AV77Tran_RegionId) ;
      gxvvtran_moduloorigen_html632( AV61Tran_CodigoMovimiento, AV55Tran_CentroCostoId, AV77Tran_RegionId) ;
      gxvvtran_moduloorigen_html632( AV61Tran_CodigoMovimiento, AV55Tran_CentroCostoId, AV77Tran_RegionId) ;
      gxvvtran_tipoingreso_html632( AV61Tran_CodigoMovimiento) ;
      /* End function dynload_actions */
   }

   public void gxdsvvtran_regionid632( long AV20IdUsuario )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdsvvtran_regionid_data632( AV20IdUsuario) ;
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

   public void gxvvtran_regionid_html632( long AV20IdUsuario )
   {
      long gxdynajaxvalue ;
      gxdsvvtran_regionid_data632( AV20IdUsuario) ;
      gxdynajaxindex = 1 ;
      dynavTran_regionid.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex)) ;
         dynavTran_regionid.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 11, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavTran_regionid.getItemCount() > 0 )
      {
         AV77Tran_RegionId = GXutil.lval( dynavTran_regionid.getValidValue(GXutil.trim( GXutil.str( AV77Tran_RegionId, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77Tran_RegionId", GXutil.ltrim( GXutil.str( AV77Tran_RegionId, 11, 0)));
      }
   }

   protected void gxdsvvtran_regionid_data632( long AV20IdUsuario )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem gxcolitemvTRAN_REGIONID ;
      GXv_objcol_SdtSDTRegionalTrn_SDTRegionalTrnItem1[0] = gxcolvTRAN_REGIONID ;
      new com.orions2.dpregionaltrn(remoteHandle, context).execute( AV20IdUsuario, GXv_objcol_SdtSDTRegionalTrn_SDTRegionalTrnItem1) ;
      wp_transaccion_impl.this.gxcolvTRAN_REGIONID = GXv_objcol_SdtSDTRegionalTrn_SDTRegionalTrnItem1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20IdUsuario", GXutil.ltrim( GXutil.str( AV20IdUsuario, 18, 0)));
      gxcolvTRAN_REGIONID.sort("Tran_regiondescripcion");
      int gxindex = 1 ;
      while ( gxindex <= gxcolvTRAN_REGIONID.size() )
      {
         gxcolitemvTRAN_REGIONID = ((com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem)gxcolvTRAN_REGIONID.elementAt(-1+gxindex)) ;
         gxdynajaxctrlcodr.add(GXutil.ltrim( GXutil.str( gxcolitemvTRAN_REGIONID.getgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid(), 11, 0)));
         gxdynajaxctrldescr.add(gxcolitemvTRAN_REGIONID.getgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion());
         gxindex = (int)(gxindex+1) ;
      }
   }

   public void gxdsvvtran_moduloorigen632( String AV61Tran_CodigoMovimiento ,
                                           long AV55Tran_CentroCostoId ,
                                           long AV77Tran_RegionId )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdsvvtran_moduloorigen_data632( AV61Tran_CodigoMovimiento, AV55Tran_CentroCostoId, AV77Tran_RegionId) ;
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

   public void gxvvtran_moduloorigen_html632( String AV61Tran_CodigoMovimiento ,
                                              long AV55Tran_CentroCostoId ,
                                              long AV77Tran_RegionId )
   {
      String gxdynajaxvalue ;
      gxdsvvtran_moduloorigen_data632( AV61Tran_CodigoMovimiento, AV55Tran_CentroCostoId, AV77Tran_RegionId) ;
      gxdynajaxindex = 1 ;
      dynavTran_moduloorigen.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynavTran_moduloorigen.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavTran_moduloorigen.getItemCount() > 0 )
      {
         AV71Tran_ModuloOrigen = dynavTran_moduloorigen.getValidValue(AV71Tran_ModuloOrigen) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71Tran_ModuloOrigen", AV71Tran_ModuloOrigen);
      }
   }

   protected void gxdsvvtran_moduloorigen_data632( String AV61Tran_CodigoMovimiento ,
                                                   long AV55Tran_CentroCostoId ,
                                                   long AV77Tran_RegionId )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem gxcolitemvTRAN_MODULOORIGEN ;
      GXv_objcol_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem2[0] = gxcolvTRAN_MODULOORIGEN ;
      new com.orions2.dpmoduloorigentrn(remoteHandle, context).execute( AV61Tran_CodigoMovimiento, AV55Tran_CentroCostoId, AV77Tran_RegionId, GXv_objcol_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem2) ;
      wp_transaccion_impl.this.gxcolvTRAN_MODULOORIGEN = GXv_objcol_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Tran_CodigoMovimiento", AV61Tran_CodigoMovimiento);
      httpContext.ajax_rsp_assign_attri("", false, "AV55Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV77Tran_RegionId", GXutil.ltrim( GXutil.str( AV77Tran_RegionId, 11, 0)));
      gxcolvTRAN_MODULOORIGEN.sort("Tran_moduloorigen");
      int gxindex = 1 ;
      while ( gxindex <= gxcolvTRAN_MODULOORIGEN.size() )
      {
         gxcolitemvTRAN_MODULOORIGEN = ((com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem)gxcolvTRAN_MODULOORIGEN.elementAt(-1+gxindex)) ;
         gxdynajaxctrlcodr.add(gxcolitemvTRAN_MODULOORIGEN.getgxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen());
         gxdynajaxctrldescr.add(gxcolitemvTRAN_MODULOORIGEN.getgxTv_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem_Tran_moduloorigen());
         gxindex = (int)(gxindex+1) ;
      }
   }

   public void gxdsvvtran_regioniddestino632( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdsvvtran_regioniddestino_data632( ) ;
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

   public void gxvvtran_regioniddestino_html632( )
   {
      long gxdynajaxvalue ;
      gxdsvvtran_regioniddestino_data632( ) ;
      gxdynajaxindex = 1 ;
      dynavTran_regioniddestino.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex)) ;
         dynavTran_regioniddestino.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 11, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavTran_regioniddestino.getItemCount() > 0 )
      {
         AV78Tran_RegionIdDestino = GXutil.lval( dynavTran_regioniddestino.getValidValue(GXutil.trim( GXutil.str( AV78Tran_RegionIdDestino, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( AV78Tran_RegionIdDestino, 11, 0)));
      }
   }

   protected void gxdsvvtran_regioniddestino_data632( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem gxcolitemvTRAN_REGIONIDDESTINO ;
      GXv_objcol_SdtSDTRegionDestino_SDTRegionDestinoItem3[0] = gxcolvTRAN_REGIONIDDESTINO ;
      new com.orions2.dpregionaldestino(remoteHandle, context).execute( GXv_objcol_SdtSDTRegionDestino_SDTRegionDestinoItem3) ;
      wp_transaccion_impl.this.gxcolvTRAN_REGIONIDDESTINO = GXv_objcol_SdtSDTRegionDestino_SDTRegionDestinoItem3[0] ;
      gxcolvTRAN_REGIONIDDESTINO.sort("Tran_regiondescripciondestino");
      int gxindex = 1 ;
      while ( gxindex <= gxcolvTRAN_REGIONIDDESTINO.size() )
      {
         gxcolitemvTRAN_REGIONIDDESTINO = ((com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem)gxcolvTRAN_REGIONIDDESTINO.elementAt(-1+gxindex)) ;
         gxdynajaxctrlcodr.add(GXutil.ltrim( GXutil.str( gxcolitemvTRAN_REGIONIDDESTINO.getgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regioniddestino(), 11, 0)));
         gxdynajaxctrldescr.add(gxcolitemvTRAN_REGIONIDDESTINO.getgxTv_SdtSDTRegionDestino_SDTRegionDestinoItem_Tran_regiondescripciondestino());
         gxindex = (int)(gxindex+1) ;
      }
   }

   public void gxdsvvtran_tipoingreso632( String AV61Tran_CodigoMovimiento )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdsvvtran_tipoingreso_data632( AV61Tran_CodigoMovimiento) ;
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

   public void gxvvtran_tipoingreso_html632( String AV61Tran_CodigoMovimiento )
   {
      long gxdynajaxvalue ;
      gxdsvvtran_tipoingreso_data632( AV61Tran_CodigoMovimiento) ;
      gxdynajaxindex = 1 ;
      dynavTran_tipoingreso.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex)) ;
         dynavTran_tipoingreso.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 11, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavTran_tipoingreso.getItemCount() > 0 )
      {
         AV80Tran_TipoIngreso = GXutil.lval( dynavTran_tipoingreso.getValidValue(GXutil.trim( GXutil.str( AV80Tran_TipoIngreso, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Tran_TipoIngreso", GXutil.ltrim( GXutil.str( AV80Tran_TipoIngreso, 11, 0)));
      }
   }

   protected void gxdsvvtran_tipoingreso_data632( String AV61Tran_CodigoMovimiento )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem gxcolitemvTRAN_TIPOINGRESO ;
      GXv_objcol_SdtSDTOrigenbienes_SDTOrigenbienesItem4[0] = gxcolvTRAN_TIPOINGRESO ;
      new com.orions2.dporigenbienes(remoteHandle, context).execute( AV61Tran_CodigoMovimiento, GXv_objcol_SdtSDTOrigenbienes_SDTOrigenbienesItem4) ;
      wp_transaccion_impl.this.gxcolvTRAN_TIPOINGRESO = GXv_objcol_SdtSDTOrigenbienes_SDTOrigenbienesItem4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Tran_CodigoMovimiento", AV61Tran_CodigoMovimiento);
      gxcolvTRAN_TIPOINGRESO.sort("Orig_descripcion");
      int gxindex = 1 ;
      while ( gxindex <= gxcolvTRAN_TIPOINGRESO.size() )
      {
         gxcolitemvTRAN_TIPOINGRESO = ((com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem)gxcolvTRAN_TIPOINGRESO.elementAt(-1+gxindex)) ;
         gxdynajaxctrlcodr.add(GXutil.ltrim( GXutil.str( gxcolitemvTRAN_TIPOINGRESO.getgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_identificador(), 11, 0)));
         gxdynajaxctrldescr.add(gxcolitemvTRAN_TIPOINGRESO.getgxTv_SdtSDTOrigenbienes_SDTOrigenbienesItem_Orig_descripcion());
         gxindex = (int)(gxindex+1) ;
      }
   }

   public void gxnrgrid1_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_2042( ) ;
      while ( nGXsfl_204_idx <= nRC_GXsfl_204 )
      {
         sendrow_2042( ) ;
         nGXsfl_204_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_204_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_204_idx+1)) ;
         sGXsfl_204_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_204_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_2042( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf632( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
      if ( dynavTran_regionid.getItemCount() > 0 )
      {
         AV77Tran_RegionId = GXutil.lval( dynavTran_regionid.getValidValue(GXutil.trim( GXutil.str( AV77Tran_RegionId, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77Tran_RegionId", GXutil.ltrim( GXutil.str( AV77Tran_RegionId, 11, 0)));
      }
      if ( cmbavTran_centrocostoid.getItemCount() > 0 )
      {
         AV55Tran_CentroCostoId = GXutil.lval( cmbavTran_centrocostoid.getValidValue(GXutil.trim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)));
      }
      if ( dynavTran_moduloorigen.getItemCount() > 0 )
      {
         AV71Tran_ModuloOrigen = dynavTran_moduloorigen.getValidValue(AV71Tran_ModuloOrigen) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71Tran_ModuloOrigen", AV71Tran_ModuloOrigen);
      }
      if ( dynavTran_regioniddestino.getItemCount() > 0 )
      {
         AV78Tran_RegionIdDestino = GXutil.lval( dynavTran_regioniddestino.getValidValue(GXutil.trim( GXutil.str( AV78Tran_RegionIdDestino, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( AV78Tran_RegionIdDestino, 11, 0)));
      }
      if ( cmbavTran_centrocostoiddestino.getItemCount() > 0 )
      {
         AV56Tran_CentroCostoIdDestino = GXutil.lval( cmbavTran_centrocostoiddestino.getValidValue(GXutil.trim( GXutil.str( AV56Tran_CentroCostoIdDestino, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( AV56Tran_CentroCostoIdDestino, 11, 0)));
      }
      if ( cmbavTran_modulodestino.getItemCount() > 0 )
      {
         AV70Tran_ModuloDestino = cmbavTran_modulodestino.getValidValue(AV70Tran_ModuloDestino) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70Tran_ModuloDestino", AV70Tran_ModuloDestino);
      }
      if ( dynavTran_tipoingreso.getItemCount() > 0 )
      {
         AV80Tran_TipoIngreso = GXutil.lval( dynavTran_tipoingreso.getValidValue(GXutil.trim( GXutil.str( AV80Tran_TipoIngreso, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Tran_TipoIngreso", GXutil.ltrim( GXutil.str( AV80Tran_TipoIngreso, 11, 0)));
      }
      if ( cmbavTran_detalle.getItemCount() > 0 )
      {
         AV62Tran_detalle = cmbavTran_detalle.getValidValue(AV62Tran_detalle) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Tran_detalle", AV62Tran_detalle);
      }
      if ( cmbavTran_tipoentra.getItemCount() > 0 )
      {
         AV79Tran_TipoEntra = cmbavTran_tipoentra.getValidValue(AV79Tran_TipoEntra) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79Tran_TipoEntra", AV79Tran_TipoEntra);
      }
      if ( cmbavTran_entidadgobierno.getItemCount() > 0 )
      {
         AV101Tran_EntidadGobierno = cmbavTran_entidadgobierno.getValidValue(AV101Tran_EntidadGobierno) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV101Tran_EntidadGobierno", AV101Tran_EntidadGobierno);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf632( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavTran_codigomovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_codigomovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_codigomovimiento_Enabled, 5, 0)), true);
      edtavPtran_codalmaorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPtran_codalmaorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPtran_codalmaorigen_Enabled, 5, 0)), true);
      edtavPtran_codbodeorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPtran_codbodeorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPtran_codbodeorigen_Enabled, 5, 0)), true);
      edtavCuen_cedulaorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedulaorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuen_cedulaorigen_Enabled, 5, 0)), true);
      edtavTran_nombcuentadanteorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombcuentadanteorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_nombcuentadanteorigen_Enabled, 5, 0)), true);
      edtavCuen_cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuen_cedula_Enabled, 5, 0)), true);
      edtavNombreproveedor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombreproveedor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNombreproveedor_Enabled, 5, 0)), true);
      edtavPtran_codalmadestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPtran_codalmadestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPtran_codalmadestino_Enabled, 5, 0)), true);
      edtavPtran_codbodedestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPtran_codbodedestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPtran_codbodedestino_Enabled, 5, 0)), true);
      edtavCuen_ceduladestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuen_ceduladestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuen_ceduladestino_Enabled, 5, 0)), true);
      edtavTran_nombcuentadantedestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombcuentadantedestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_nombcuentadantedestino_Enabled, 5, 0)), true);
      edtavArea_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_codigo_Enabled, 5, 0)), true);
      edtavArea_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Enabled, 5, 0)), true);
      edtavCurs_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Enabled, 5, 0)), true);
      edtavCurs_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Enabled, 5, 0)), true);
      edtavCuen_cedularespons_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedularespons_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuen_cedularespons_Enabled, 5, 0)), true);
      edtavTran_nombrecuentadanteresponsabilidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombrecuentadanteresponsabilidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_nombrecuentadanteresponsabilidad_Enabled, 5, 0)), true);
      edtavTran_transaccresponsabilidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_transaccresponsabilidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_transaccresponsabilidad_Enabled, 5, 0)), true);
      edtavTran_fecharesponsabilidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_fecharesponsabilidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_fecharesponsabilidad_Enabled, 5, 0)), true);
      edtavCtltran_nro_documento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltran_nro_documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltran_nro_documento_Enabled, 5, 0)), !bGXsfl_204_Refreshing);
      edtavCtltran_descrip_documento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltran_descrip_documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltran_descrip_documento_Enabled, 5, 0)), !bGXsfl_204_Refreshing);
   }

   public void rf632( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(204) ;
      nGXsfl_204_idx = (short)(1) ;
      sGXsfl_204_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_204_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2042( ) ;
      bGXsfl_204_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGrid1_Width, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Height", GXutil.ltrim( localUtil.ntoc( subGrid1_Height, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_2042( ) ;
         e38632 ();
         wbEnd = (short)(204) ;
         wb630( ) ;
      }
      bGXsfl_204_Refreshing = true ;
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

   public void strup630( )
   {
      /* Before Start, stand alone formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavTran_codigomovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_codigomovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_codigomovimiento_Enabled, 5, 0)), true);
      edtavPtran_codalmaorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPtran_codalmaorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPtran_codalmaorigen_Enabled, 5, 0)), true);
      edtavPtran_codbodeorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPtran_codbodeorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPtran_codbodeorigen_Enabled, 5, 0)), true);
      edtavCuen_cedulaorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedulaorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuen_cedulaorigen_Enabled, 5, 0)), true);
      edtavTran_nombcuentadanteorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombcuentadanteorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_nombcuentadanteorigen_Enabled, 5, 0)), true);
      edtavCuen_cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuen_cedula_Enabled, 5, 0)), true);
      edtavNombreproveedor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombreproveedor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNombreproveedor_Enabled, 5, 0)), true);
      edtavPtran_codalmadestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPtran_codalmadestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPtran_codalmadestino_Enabled, 5, 0)), true);
      edtavPtran_codbodedestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPtran_codbodedestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPtran_codbodedestino_Enabled, 5, 0)), true);
      edtavCuen_ceduladestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuen_ceduladestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuen_ceduladestino_Enabled, 5, 0)), true);
      edtavTran_nombcuentadantedestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombcuentadantedestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_nombcuentadantedestino_Enabled, 5, 0)), true);
      edtavArea_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_codigo_Enabled, 5, 0)), true);
      edtavArea_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Enabled, 5, 0)), true);
      edtavCurs_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Enabled, 5, 0)), true);
      edtavCurs_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Enabled, 5, 0)), true);
      edtavCuen_cedularespons_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedularespons_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuen_cedularespons_Enabled, 5, 0)), true);
      edtavTran_nombrecuentadanteresponsabilidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombrecuentadanteresponsabilidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_nombrecuentadanteresponsabilidad_Enabled, 5, 0)), true);
      edtavTran_transaccresponsabilidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_transaccresponsabilidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_transaccresponsabilidad_Enabled, 5, 0)), true);
      edtavTran_fecharesponsabilidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_fecharesponsabilidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_fecharesponsabilidad_Enabled, 5, 0)), true);
      edtavCtltran_nro_documento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltran_nro_documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltran_nro_documento_Enabled, 5, 0)), !bGXsfl_204_Refreshing);
      edtavCtltran_descrip_documento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltran_descrip_documento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltran_descrip_documento_Enabled, 5, 0)), !bGXsfl_204_Refreshing);
      gxvvtran_regioniddestino_html632( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e37632 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      gxvvtran_regionid_html632( AV20IdUsuario) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtdocumentos"), AV93SDTDocumentos);
         /* Read variables values. */
         dynavTran_regionid.setName( dynavTran_regionid.getInternalname() );
         dynavTran_regionid.setValue( httpContext.cgiGet( dynavTran_regionid.getInternalname()) );
         AV77Tran_RegionId = GXutil.lval( httpContext.cgiGet( dynavTran_regionid.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77Tran_RegionId", GXutil.ltrim( GXutil.str( AV77Tran_RegionId, 11, 0)));
         cmbavTran_centrocostoid.setName( cmbavTran_centrocostoid.getInternalname() );
         cmbavTran_centrocostoid.setValue( httpContext.cgiGet( cmbavTran_centrocostoid.getInternalname()) );
         AV55Tran_CentroCostoId = GXutil.lval( httpContext.cgiGet( cmbavTran_centrocostoid.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)));
         AV61Tran_CodigoMovimiento = httpContext.cgiGet( edtavTran_codigomovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Tran_CodigoMovimiento", AV61Tran_CodigoMovimiento);
         AV84Tran_DescripcionMovimiento = httpContext.cgiGet( edtavTran_descripcionmovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84Tran_DescripcionMovimiento", AV84Tran_DescripcionMovimiento);
         dynavTran_moduloorigen.setName( dynavTran_moduloorigen.getInternalname() );
         dynavTran_moduloorigen.setValue( httpContext.cgiGet( dynavTran_moduloorigen.getInternalname()) );
         AV71Tran_ModuloOrigen = httpContext.cgiGet( dynavTran_moduloorigen.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71Tran_ModuloOrigen", AV71Tran_ModuloOrigen);
         AV87pTran_CodAlmaOrigen = httpContext.cgiGet( edtavPtran_codalmaorigen_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87pTran_CodAlmaOrigen", AV87pTran_CodAlmaOrigen);
         AV85AlmaOrigenDescri = GXutil.upper( httpContext.cgiGet( edtavAlmaorigendescri_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85AlmaOrigenDescri", AV85AlmaOrigenDescri);
         AV88pTran_CodBodeOrigen = httpContext.cgiGet( edtavPtran_codbodeorigen_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88pTran_CodBodeOrigen", AV88pTran_CodBodeOrigen);
         AV86Bode_DescripcionOrigen = GXutil.upper( httpContext.cgiGet( edtavBode_descripcionorigen_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86Bode_DescripcionOrigen", AV86Bode_DescripcionOrigen);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_cedulaorigen_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_cedulaorigen_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUEN_CEDULAORIGEN");
            GX_FocusControl = edtavCuen_cedulaorigen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15Cuen_CedulaOrigen = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Cuen_CedulaOrigen", GXutil.ltrim( GXutil.str( AV15Cuen_CedulaOrigen, 18, 0)));
         }
         else
         {
            AV15Cuen_CedulaOrigen = localUtil.ctol( httpContext.cgiGet( edtavCuen_cedulaorigen_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Cuen_CedulaOrigen", GXutil.ltrim( GXutil.str( AV15Cuen_CedulaOrigen, 18, 0)));
         }
         AV73Tran_NombCuentadanteOrigen = GXutil.upper( httpContext.cgiGet( edtavTran_nombcuentadanteorigen_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73Tran_NombCuentadanteOrigen", AV73Tran_NombCuentadanteOrigen);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_cedula_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_cedula_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUEN_CEDULA");
            GX_FocusControl = edtavCuen_cedula_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13Cuen_Cedula = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Cuen_Cedula", GXutil.ltrim( GXutil.str( AV13Cuen_Cedula, 18, 0)));
         }
         else
         {
            AV13Cuen_Cedula = localUtil.ctol( httpContext.cgiGet( edtavCuen_cedula_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Cuen_Cedula", GXutil.ltrim( GXutil.str( AV13Cuen_Cedula, 18, 0)));
         }
         AV26NombreProveedor = httpContext.cgiGet( edtavNombreproveedor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26NombreProveedor", AV26NombreProveedor);
         dynavTran_regioniddestino.setName( dynavTran_regioniddestino.getInternalname() );
         dynavTran_regioniddestino.setValue( httpContext.cgiGet( dynavTran_regioniddestino.getInternalname()) );
         AV78Tran_RegionIdDestino = GXutil.lval( httpContext.cgiGet( dynavTran_regioniddestino.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78Tran_RegionIdDestino", GXutil.ltrim( GXutil.str( AV78Tran_RegionIdDestino, 11, 0)));
         cmbavTran_centrocostoiddestino.setName( cmbavTran_centrocostoiddestino.getInternalname() );
         cmbavTran_centrocostoiddestino.setValue( httpContext.cgiGet( cmbavTran_centrocostoiddestino.getInternalname()) );
         AV56Tran_CentroCostoIdDestino = GXutil.lval( httpContext.cgiGet( cmbavTran_centrocostoiddestino.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( AV56Tran_CentroCostoIdDestino, 11, 0)));
         cmbavTran_modulodestino.setName( cmbavTran_modulodestino.getInternalname() );
         cmbavTran_modulodestino.setValue( httpContext.cgiGet( cmbavTran_modulodestino.getInternalname()) );
         AV70Tran_ModuloDestino = httpContext.cgiGet( cmbavTran_modulodestino.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70Tran_ModuloDestino", AV70Tran_ModuloDestino);
         AV90pTran_CodAlmaDestino = httpContext.cgiGet( edtavPtran_codalmadestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90pTran_CodAlmaDestino", AV90pTran_CodAlmaDestino);
         AV89Alma_DescripcionDestino = GXutil.upper( httpContext.cgiGet( edtavAlma_descripciondestino_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89Alma_DescripcionDestino", AV89Alma_DescripcionDestino);
         AV91pTran_CodBodeDestino = httpContext.cgiGet( edtavPtran_codbodedestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91pTran_CodBodeDestino", AV91pTran_CodBodeDestino);
         AV92Bode_DescripcionDestino = GXutil.upper( httpContext.cgiGet( edtavBode_descripciondestino_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92Bode_DescripcionDestino", AV92Bode_DescripcionDestino);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_ceduladestino_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_ceduladestino_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUEN_CEDULADESTINO");
            GX_FocusControl = edtavCuen_ceduladestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Cuen_CedulaDestino = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Cuen_CedulaDestino", GXutil.ltrim( GXutil.str( AV14Cuen_CedulaDestino, 18, 0)));
         }
         else
         {
            AV14Cuen_CedulaDestino = localUtil.ctol( httpContext.cgiGet( edtavCuen_ceduladestino_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Cuen_CedulaDestino", GXutil.ltrim( GXutil.str( AV14Cuen_CedulaDestino, 18, 0)));
         }
         AV72Tran_NombCuentadanteDestino = GXutil.upper( httpContext.cgiGet( edtavTran_nombcuentadantedestino_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72Tran_NombCuentadanteDestino", AV72Tran_NombCuentadanteDestino);
         dynavTran_tipoingreso.setName( dynavTran_tipoingreso.getInternalname() );
         dynavTran_tipoingreso.setValue( httpContext.cgiGet( dynavTran_tipoingreso.getInternalname()) );
         AV80Tran_TipoIngreso = GXutil.lval( httpContext.cgiGet( dynavTran_tipoingreso.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Tran_TipoIngreso", GXutil.ltrim( GXutil.str( AV80Tran_TipoIngreso, 11, 0)));
         AV75Tran_numeroIngreso = httpContext.cgiGet( edtavTran_numeroingreso_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Tran_numeroIngreso", AV75Tran_numeroIngreso);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavTran_fechaingreso_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vTRAN_FECHAINGRESO");
            GX_FocusControl = edtavTran_fechaingreso_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63Tran_FechaIngreso = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63Tran_FechaIngreso", localUtil.format(AV63Tran_FechaIngreso, "99/99/9999"));
         }
         else
         {
            AV63Tran_FechaIngreso = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavTran_fechaingreso_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63Tran_FechaIngreso", localUtil.format(AV63Tran_FechaIngreso, "99/99/9999"));
         }
         cmbavTran_detalle.setName( cmbavTran_detalle.getInternalname() );
         cmbavTran_detalle.setValue( httpContext.cgiGet( cmbavTran_detalle.getInternalname()) );
         AV62Tran_detalle = httpContext.cgiGet( cmbavTran_detalle.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Tran_detalle", AV62Tran_detalle);
         cmbavTran_tipoentra.setName( cmbavTran_tipoentra.getInternalname() );
         cmbavTran_tipoentra.setValue( httpContext.cgiGet( cmbavTran_tipoentra.getInternalname()) );
         AV79Tran_TipoEntra = httpContext.cgiGet( cmbavTran_tipoentra.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79Tran_TipoEntra", AV79Tran_TipoEntra);
         AV6Area_Codigo = httpContext.cgiGet( edtavArea_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Area_Codigo", AV6Area_Codigo);
         AV7Area_Descripcion = httpContext.cgiGet( edtavArea_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Area_Descripcion", AV7Area_Descripcion);
         AV17Curs_Codigo = httpContext.cgiGet( edtavCurs_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Curs_Codigo", AV17Curs_Codigo);
         AV18Curs_Descripcion = httpContext.cgiGet( edtavCurs_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Curs_Descripcion", AV18Curs_Descripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_cedularespons_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuen_cedularespons_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUEN_CEDULARESPONS");
            GX_FocusControl = edtavCuen_cedularespons_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16Cuen_CedulaRespons = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Cuen_CedulaRespons", GXutil.ltrim( GXutil.str( AV16Cuen_CedulaRespons, 18, 0)));
         }
         else
         {
            AV16Cuen_CedulaRespons = localUtil.ctol( httpContext.cgiGet( edtavCuen_cedularespons_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Cuen_CedulaRespons", GXutil.ltrim( GXutil.str( AV16Cuen_CedulaRespons, 18, 0)));
         }
         AV74Tran_NombreCuentadanteResponsabilidad = GXutil.upper( httpContext.cgiGet( edtavTran_nombrecuentadanteresponsabilidad_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Tran_NombreCuentadanteResponsabilidad", AV74Tran_NombreCuentadanteResponsabilidad);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_transaccresponsabilidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_transaccresponsabilidad_Internalname), ",", ".") > 99999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRAN_TRANSACCRESPONSABILIDAD");
            GX_FocusControl = edtavTran_transaccresponsabilidad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81Tran_TransaccResponsabilidad = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( AV81Tran_TransaccResponsabilidad, 11, 0)));
         }
         else
         {
            AV81Tran_TransaccResponsabilidad = localUtil.ctol( httpContext.cgiGet( edtavTran_transaccresponsabilidad_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( AV81Tran_TransaccResponsabilidad, 11, 0)));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavTran_fecharesponsabilidad_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vTRAN_FECHARESPONSABILIDAD");
            GX_FocusControl = edtavTran_fecharesponsabilidad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV64Tran_FechaResponsabilidad = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64Tran_FechaResponsabilidad", localUtil.format(AV64Tran_FechaResponsabilidad, "99/99/9999"));
         }
         else
         {
            AV64Tran_FechaResponsabilidad = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavTran_fecharesponsabilidad_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64Tran_FechaResponsabilidad", localUtil.format(AV64Tran_FechaResponsabilidad, "99/99/9999"));
         }
         cmbavTran_entidadgobierno.setName( cmbavTran_entidadgobierno.getInternalname() );
         cmbavTran_entidadgobierno.setValue( httpContext.cgiGet( cmbavTran_entidadgobierno.getInternalname()) );
         AV101Tran_EntidadGobierno = httpContext.cgiGet( cmbavTran_entidadgobierno.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV101Tran_EntidadGobierno", AV101Tran_EntidadGobierno);
         AV76Tran_Observaciones = httpContext.cgiGet( edtavTran_observaciones_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76Tran_Observaciones", AV76Tran_Observaciones);
         /* Read saved values. */
         nRC_GXsfl_204 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_204"), ",", ".")) ;
         AV67Tran_IdCuentadanteResponsabilidad = localUtil.ctol( httpContext.cgiGet( "vTRAN_IDCUENTADANTERESPONSABILIDAD"), ",", ".") ;
         AV98SWError9 = (short)(localUtil.ctol( httpContext.cgiGet( "vSWERROR9"), ",", ".")) ;
         AV10Cent_Codigo = httpContext.cgiGet( "vCENT_CODIGO") ;
         AV45SWError3 = (short)(localUtil.ctol( httpContext.cgiGet( "vSWERROR3"), ",", ".")) ;
         AV46SWError4 = (short)(localUtil.ctol( httpContext.cgiGet( "vSWERROR4"), ",", ".")) ;
         AV42SWError = (short)(localUtil.ctol( httpContext.cgiGet( "vSWERROR"), ",", ".")) ;
         AV57Tran_CodAlmaDestino = httpContext.cgiGet( "vTRAN_CODALMADESTINO") ;
         AV60Tran_CodBodeOrigen = httpContext.cgiGet( "vTRAN_CODBODEORIGEN") ;
         AV58Tran_CodAlmaOrigen = httpContext.cgiGet( "vTRAN_CODALMAORIGEN") ;
         AV97SWError8 = (short)(localUtil.ctol( httpContext.cgiGet( "vSWERROR8"), ",", ".")) ;
         AV65Tran_IdCuentadanteDestino = localUtil.ctol( httpContext.cgiGet( "vTRAN_IDCUENTADANTEDESTINO"), ",", ".") ;
         AV47SWError5 = (short)(localUtil.ctol( httpContext.cgiGet( "vSWERROR5"), ",", ".")) ;
         AV68Tran_IdProveedor = localUtil.ctol( httpContext.cgiGet( "vTRAN_IDPROVEEDOR"), ",", ".") ;
         AV43SWError1 = (short)(localUtil.ctol( httpContext.cgiGet( "vSWERROR1"), ",", ".")) ;
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
         imgImage2_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "IMAGE2_Visible"), ",", ".")) ;
         imgImage3_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "IMAGE3_Visible"), ",", ".")) ;
         imgImage5_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "IMAGE5_Visible"), ",", ".")) ;
         imgImage6_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "IMAGE6_Visible"), ",", ".")) ;
         nRC_GXsfl_204 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_204"), ",", ".")) ;
         nGXsfl_204_fel_idx = (short)(0) ;
         while ( nGXsfl_204_fel_idx < nRC_GXsfl_204 )
         {
            nGXsfl_204_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_204_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_204_fel_idx+1)) ;
            sGXsfl_204_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_204_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_2042( ) ;
            AV104GXV1 = nGXsfl_204_fel_idx ;
            if ( ( AV93SDTDocumentos.size() >= AV104GXV1 ) && ( AV104GXV1 > 0 ) )
            {
               AV93SDTDocumentos.currentItem( ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)) );
            }
            if ( (GXutil.strcmp("", ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo())==0) )
            {
               GXCCtl = "CTLTRAN_ARCHIVO_" + sGXsfl_204_fel_idx ;
               GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
               ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo( httpContext.cgiGet( GXCCtlgxBlob) );
            }
         }
         if ( nGXsfl_204_fel_idx == 0 )
         {
            nGXsfl_204_idx = (short)(1) ;
            sGXsfl_204_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_204_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_2042( ) ;
         }
         nGXsfl_204_fel_idx = (short)(1) ;
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
      e37632 ();
      if (returnInSub) return;
   }

   public void e37632( )
   {
      /* Start Routine */
      AV82Usuario = AV83WebSession.getValue("Usuario") ;
      GXv_int5[0] = AV20IdUsuario ;
      new com.orions2.recuperaidusuario(remoteHandle, context).execute( AV82Usuario, GXv_int5) ;
      wp_transaccion_impl.this.AV20IdUsuario = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20IdUsuario", GXutil.ltrim( GXutil.str( AV20IdUsuario, 18, 0)));
      imgImage1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage1_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage1_Visible, 5, 0)), true);
      dynavTran_tipoingreso.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavTran_tipoingreso.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavTran_tipoingreso.getVisible(), 5, 0)), true);
      edtavTran_fechaingreso_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_fechaingreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_fechaingreso_Visible, 5, 0)), true);
      edtavTran_numeroingreso_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_numeroingreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_numeroingreso_Visible, 5, 0)), true);
      cmbavTran_tipoentra.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTran_tipoentra.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavTran_tipoentra.getVisible(), 5, 0)), true);
      imgImage2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage2_Visible, 5, 0)), true);
      edtavArea_codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_codigo_Visible, 5, 0)), true);
      edtavArea_descripcion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Visible, 5, 0)), true);
      imgImage3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage3_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage3_Visible, 5, 0)), true);
      edtavCurs_codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Visible, 5, 0)), true);
      edtavCurs_descripcion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Visible, 5, 0)), true);
      imgImagecuentadante_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImagecuentadante_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImagecuentadante_Visible, 5, 0)), true);
      AV56Tran_CentroCostoIdDestino = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( AV56Tran_CentroCostoIdDestino, 11, 0)));
      cmbavTran_centrocostoiddestino.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTran_centrocostoiddestino.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavTran_centrocostoiddestino.getVisible(), 5, 0)), true);
      dynavTran_regioniddestino.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavTran_regioniddestino.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavTran_regioniddestino.getVisible(), 5, 0)), true);
      imgImage5_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage5_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage5_Visible, 5, 0)), true);
      edtavCuen_cedularespons_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedularespons_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuen_cedularespons_Visible, 5, 0)), true);
      edtavTran_nombrecuentadanteresponsabilidad_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombrecuentadanteresponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_nombrecuentadanteresponsabilidad_Visible, 5, 0)), true);
      imgImage6_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage6_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage6_Visible, 5, 0)), true);
      edtavTran_transaccresponsabilidad_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_transaccresponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_transaccresponsabilidad_Visible, 5, 0)), true);
      edtavTran_fecharesponsabilidad_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_fecharesponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_fecharesponsabilidad_Visible, 5, 0)), true);
      imgImage4_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage4_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage4_Visible, 5, 0)), true);
      edtavCuen_cedulaorigen_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedulaorigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuen_cedulaorigen_Visible, 5, 0)), true);
      edtavTran_nombcuentadanteorigen_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombcuentadanteorigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_nombcuentadanteorigen_Visible, 5, 0)), true);
   }

   public void e18632( )
   {
      /* Tran_regionid_Isvalid Routine */
      cmbavTran_centrocostoid.removeAllItems();
      AV61Tran_CodigoMovimiento = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Tran_CodigoMovimiento", AV61Tran_CodigoMovimiento);
      AV84Tran_DescripcionMovimiento = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Tran_DescripcionMovimiento", AV84Tran_DescripcionMovimiento);
      /* Using cursor H00632 */
      pr_default.execute(0, new Object[] {new Long(AV20IdUsuario), new Long(AV77Tran_RegionId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2Regi_Id = H00632_A2Regi_Id[0] ;
         A23Usua_Id = H00632_A23Usua_Id[0] ;
         A4Cent_Descripcion = H00632_A4Cent_Descripcion[0] ;
         A3Cent_Codigo = H00632_A3Cent_Codigo[0] ;
         A1Cent_Id = H00632_A1Cent_Id[0] ;
         A2Regi_Id = H00632_A2Regi_Id[0] ;
         A4Cent_Descripcion = H00632_A4Cent_Descripcion[0] ;
         A3Cent_Codigo = H00632_A3Cent_Codigo[0] ;
         cmbavTran_centrocostoid.addItem(GXutil.trim( GXutil.str( A1Cent_Id, 11, 0)), A3Cent_Codigo+"-"+A4Cent_Descripcion, (short)(0));
         AV10Cent_Codigo = A3Cent_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Cent_Codigo", AV10Cent_Codigo);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cmbavTran_centrocostoid.setValue( GXutil.trim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTran_centrocostoid.getInternalname(), "Values", cmbavTran_centrocostoid.ToJavascriptSource(), true);
   }

   public void e19632( )
   {
      /* Tran_centrocostoid_Isvalid Routine */
      AV61Tran_CodigoMovimiento = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Tran_CodigoMovimiento", AV61Tran_CodigoMovimiento);
      AV84Tran_DescripcionMovimiento = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Tran_DescripcionMovimiento", AV84Tran_DescripcionMovimiento);
      AV58Tran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Tran_CodAlmaOrigen", AV58Tran_CodAlmaOrigen);
      AV85AlmaOrigenDescri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85AlmaOrigenDescri", AV85AlmaOrigenDescri);
      AV87pTran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87pTran_CodAlmaOrigen", AV87pTran_CodAlmaOrigen);
      AV60Tran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Tran_CodBodeOrigen", AV60Tran_CodBodeOrigen);
      AV86Bode_DescripcionOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86Bode_DescripcionOrigen", AV86Bode_DescripcionOrigen);
      AV88pTran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88pTran_CodBodeOrigen", AV88pTran_CodBodeOrigen);
      AV59Tran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Tran_CodBodeDestino", AV59Tran_CodBodeDestino);
      AV92Bode_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92Bode_DescripcionDestino", AV92Bode_DescripcionDestino);
      AV91pTran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91pTran_CodBodeDestino", AV91pTran_CodBodeDestino);
      AV57Tran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Tran_CodAlmaDestino", AV57Tran_CodAlmaDestino);
      AV89Alma_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Alma_DescripcionDestino", AV89Alma_DescripcionDestino);
      AV90pTran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90pTran_CodAlmaDestino", AV90pTran_CodAlmaDestino);
      AV60Tran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Tran_CodBodeOrigen", AV60Tran_CodBodeOrigen);
      AV86Bode_DescripcionOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86Bode_DescripcionOrigen", AV86Bode_DescripcionOrigen);
      AV88pTran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88pTran_CodBodeOrigen", AV88pTran_CodBodeOrigen);
      AV58Tran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Tran_CodAlmaOrigen", AV58Tran_CodAlmaOrigen);
      AV85AlmaOrigenDescri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85AlmaOrigenDescri", AV85AlmaOrigenDescri);
      AV87pTran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87pTran_CodAlmaOrigen", AV87pTran_CodAlmaOrigen);
   }

   public void e34632( )
   {
      /* 'TipoMovimiento' Routine */
      httpContext.popup(formatLink("com.orions2.gxmovimientorestric") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV77Tran_RegionId,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV55Tran_CentroCostoId,11,0))), new Object[] {"AV61Tran_CodigoMovimiento","AV84Tran_DescripcionMovimiento",});
   }

   public void e20632( )
   {
      AV104GXV1 = nGXsfl_204_idx ;
      if ( AV93SDTDocumentos.size() >= AV104GXV1 )
      {
         AV93SDTDocumentos.currentItem( ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)) );
      }
      /* Tran_descripcionmovimiento_Isvalid Routine */
      AV58Tran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Tran_CodAlmaOrigen", AV58Tran_CodAlmaOrigen);
      AV85AlmaOrigenDescri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85AlmaOrigenDescri", AV85AlmaOrigenDescri);
      AV87pTran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87pTran_CodAlmaOrigen", AV87pTran_CodAlmaOrigen);
      AV60Tran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Tran_CodBodeOrigen", AV60Tran_CodBodeOrigen);
      AV86Bode_DescripcionOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86Bode_DescripcionOrigen", AV86Bode_DescripcionOrigen);
      AV88pTran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88pTran_CodBodeOrigen", AV88pTran_CodBodeOrigen);
      AV59Tran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Tran_CodBodeDestino", AV59Tran_CodBodeDestino);
      AV92Bode_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92Bode_DescripcionDestino", AV92Bode_DescripcionDestino);
      AV91pTran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91pTran_CodBodeDestino", AV91pTran_CodBodeDestino);
      AV57Tran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Tran_CodAlmaDestino", AV57Tran_CodAlmaDestino);
      AV89Alma_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Alma_DescripcionDestino", AV89Alma_DescripcionDestino);
      AV90pTran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90pTran_CodAlmaDestino", AV90pTran_CodAlmaDestino);
      AV60Tran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Tran_CodBodeOrigen", AV60Tran_CodBodeOrigen);
      AV86Bode_DescripcionOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86Bode_DescripcionOrigen", AV86Bode_DescripcionOrigen);
      AV88pTran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88pTran_CodBodeOrigen", AV88pTran_CodBodeOrigen);
      AV58Tran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Tran_CodAlmaOrigen", AV58Tran_CodAlmaOrigen);
      AV85AlmaOrigenDescri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85AlmaOrigenDescri", AV85AlmaOrigenDescri);
      AV87pTran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87pTran_CodAlmaOrigen", AV87pTran_CodAlmaOrigen);
      /* Using cursor H00634 */
      pr_default.execute(1, new Object[] {AV61Tran_CodigoMovimiento});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A38Tpmo_Codigo = H00634_A38Tpmo_Codigo[0] ;
         A440Tpmo_IngresaAredante = H00634_A440Tpmo_IngresaAredante[0] ;
         A441Tpmo_IngresaCurso = H00634_A441Tpmo_IngresaCurso[0] ;
         A315Tpmo_TipoE_S = H00634_A315Tpmo_TipoE_S[0] ;
         A480Tipo_Tipo = H00634_A480Tipo_Tipo[0] ;
         A33Tipo_Codigo = H00634_A33Tipo_Codigo[0] ;
         A705Tpmo_SolicitaRegionDestino = H00634_A705Tpmo_SolicitaRegionDestino[0] ;
         n705Tpmo_SolicitaRegionDestino = H00634_n705Tpmo_SolicitaRegionDestino[0] ;
         A706Tpmo_SolicitaCentroDestino = H00634_A706Tpmo_SolicitaCentroDestino[0] ;
         n706Tpmo_SolicitaCentroDestino = H00634_n706Tpmo_SolicitaCentroDestino[0] ;
         A680Tpmo_CuentaResponsabilidad = H00634_A680Tpmo_CuentaResponsabilidad[0] ;
         n680Tpmo_CuentaResponsabilidad = H00634_n680Tpmo_CuentaResponsabilidad[0] ;
         A40000GXC1 = H00634_A40000GXC1[0] ;
         n40000GXC1 = H00634_n40000GXC1[0] ;
         A40000GXC1 = H00634_A40000GXC1[0] ;
         n40000GXC1 = H00634_n40000GXC1[0] ;
         A480Tipo_Tipo = H00634_A480Tipo_Tipo[0] ;
         AV21Ind_Areadante = A440Tpmo_IngresaAredante ;
         AV22Ind_Curso = A441Tpmo_IngresaCurso ;
         AV23Ind_E_S = A315Tpmo_TipoE_S ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Ind_E_S", AV23Ind_E_S);
         AV25Ind_Tipo = A480Tipo_Tipo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Ind_Tipo", AV25Ind_Tipo);
         AV53Tipo_Codigo = A33Tipo_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Tipo_Codigo", GXutil.ltrim( GXutil.str( AV53Tipo_Codigo, 18, 0)));
         AV9CantidadOrigen = A40000GXC1 ;
         AV27RegionDestino = A705Tpmo_SolicitaRegionDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27RegionDestino", AV27RegionDestino);
         AV11CentroCDestino = A706Tpmo_SolicitaCentroDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11CentroCDestino", AV11CentroCDestino);
         AV24Ind_Responsabilidad = A680Tpmo_CuentaResponsabilidad ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor H00635 */
      pr_default.execute(2, new Object[] {new Long(AV55Tran_CentroCostoId)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1Cent_Id = H00635_A1Cent_Id[0] ;
         A3Cent_Codigo = H00635_A3Cent_Codigo[0] ;
         AV54Tran_CentroCostoCodigo = A3Cent_Codigo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV9CantidadOrigen > 0 )
      {
         dynavTran_tipoingreso.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynavTran_tipoingreso.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavTran_tipoingreso.getVisible(), 5, 0)), true);
         edtavTran_fechaingreso_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_fechaingreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_fechaingreso_Visible, 5, 0)), true);
         edtavTran_numeroingreso_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_numeroingreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_numeroingreso_Visible, 5, 0)), true);
      }
      else
      {
         dynavTran_tipoingreso.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynavTran_tipoingreso.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavTran_tipoingreso.getVisible(), 5, 0)), true);
         edtavTran_fechaingreso_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_fechaingreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_fechaingreso_Visible, 5, 0)), true);
         edtavTran_numeroingreso_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_numeroingreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_numeroingreso_Visible, 5, 0)), true);
      }
      if ( GXutil.strcmp(AV23Ind_E_S, "E") == 0 )
      {
         imgImage4_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage4_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage4_Visible, 5, 0)), true);
         edtavCuen_cedulaorigen_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedulaorigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuen_cedulaorigen_Visible, 5, 0)), true);
         edtavTran_nombcuentadanteorigen_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombcuentadanteorigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_nombcuentadanteorigen_Visible, 5, 0)), true);
         edtavCuen_cedula_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedula_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuen_cedula_Visible, 5, 0)), true);
         imgImage1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage1_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage1_Visible, 5, 0)), true);
         edtavNombreproveedor_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNombreproveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNombreproveedor_Visible, 5, 0)), true);
         dynavTran_tipoingreso.setCaption( "Tipo de Ingreso" );
         httpContext.ajax_rsp_assign_prop("", false, dynavTran_tipoingreso.getInternalname(), "Caption", dynavTran_tipoingreso.getCaption(), true);
         AV26NombreProveedor = "." ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26NombreProveedor", AV26NombreProveedor);
         AV13Cuen_Cedula = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Cuen_Cedula", GXutil.ltrim( GXutil.str( AV13Cuen_Cedula, 18, 0)));
      }
      else if ( GXutil.strcmp(AV23Ind_E_S, "R") == 0 )
      {
         imgImage4_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage4_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage4_Visible, 5, 0)), true);
         edtavCuen_cedulaorigen_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedulaorigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuen_cedulaorigen_Visible, 5, 0)), true);
         edtavTran_nombcuentadanteorigen_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombcuentadanteorigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_nombcuentadanteorigen_Visible, 5, 0)), true);
         imgImage1_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage1_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage1_Visible, 5, 0)), true);
         edtavCuen_cedula_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedula_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuen_cedula_Visible, 5, 0)), true);
         edtavNombreproveedor_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNombreproveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNombreproveedor_Visible, 5, 0)), true);
         imgImage5_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage5_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage5_Visible, 5, 0)), true);
         edtavCuen_cedularespons_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedularespons_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuen_cedularespons_Visible, 5, 0)), true);
         edtavTran_nombrecuentadanteresponsabilidad_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombrecuentadanteresponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_nombrecuentadanteresponsabilidad_Visible, 5, 0)), true);
         imgImage6_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage6_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage6_Visible, 5, 0)), true);
         edtavTran_transaccresponsabilidad_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_transaccresponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_transaccresponsabilidad_Visible, 5, 0)), true);
         edtavTran_fecharesponsabilidad_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_fecharesponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_fecharesponsabilidad_Visible, 5, 0)), true);
         cmbavTran_detalle.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTran_detalle.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavTran_detalle.getVisible(), 5, 0)), true);
         AV26NombreProveedor = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26NombreProveedor", AV26NombreProveedor);
         AV13Cuen_Cedula = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Cuen_Cedula", GXutil.ltrim( GXutil.str( AV13Cuen_Cedula, 18, 0)));
      }
      else
      {
         imgImage4_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage4_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage4_Visible, 5, 0)), true);
         edtavCuen_cedulaorigen_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedulaorigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuen_cedulaorigen_Visible, 5, 0)), true);
         edtavTran_nombcuentadanteorigen_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombcuentadanteorigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_nombcuentadanteorigen_Visible, 5, 0)), true);
         imgImage1_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage1_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage1_Visible, 5, 0)), true);
         edtavCuen_cedula_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedula_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuen_cedula_Visible, 5, 0)), true);
         edtavNombreproveedor_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNombreproveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNombreproveedor_Visible, 5, 0)), true);
         dynavTran_tipoingreso.setCaption( "Destinaciones de las bajas" );
         httpContext.ajax_rsp_assign_prop("", false, dynavTran_tipoingreso.getInternalname(), "Caption", dynavTran_tipoingreso.getCaption(), true);
         AV26NombreProveedor = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26NombreProveedor", AV26NombreProveedor);
         AV13Cuen_Cedula = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Cuen_Cedula", GXutil.ltrim( GXutil.str( AV13Cuen_Cedula, 18, 0)));
      }
      if ( GXutil.strcmp(AV21Ind_Areadante, "SI") == 0 )
      {
         edtavArea_codigo_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_codigo_Visible, 5, 0)), true);
         edtavArea_descripcion_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Visible, 5, 0)), true);
         imgImage2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage2_Visible, 5, 0)), true);
      }
      else if ( GXutil.strcmp(AV21Ind_Areadante, "NO") == 0 )
      {
         edtavArea_codigo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_codigo_Visible, 5, 0)), true);
         edtavArea_descripcion_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Visible, 5, 0)), true);
         imgImage2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage2_Visible, 5, 0)), true);
      }
      if ( GXutil.strcmp(AV22Ind_Curso, "SI") == 0 )
      {
         edtavCurs_codigo_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Visible, 5, 0)), true);
         edtavCurs_descripcion_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Visible, 5, 0)), true);
         if ( GXutil.strcmp(GXutil.substring( AV10Cent_Codigo, 1, 4), "1010") == 0 )
         {
            AV17Curs_Codigo = "999999" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Curs_Codigo", AV17Curs_Codigo);
            AV18Curs_Descripcion = "NO APLICA CURSO" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Curs_Descripcion", AV18Curs_Descripcion);
         }
         else
         {
            imgImage3_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, imgImage3_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage3_Visible, 5, 0)), true);
         }
      }
      else if ( GXutil.strcmp(AV22Ind_Curso, "NO") == 0 )
      {
         edtavCurs_codigo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Visible, 5, 0)), true);
         edtavCurs_descripcion_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Visible, 5, 0)), true);
         imgImage3_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage3_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage3_Visible, 5, 0)), true);
      }
      if ( GXutil.strcmp(AV27RegionDestino, "SI") == 0 )
      {
         dynavTran_regioniddestino.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynavTran_regioniddestino.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavTran_regioniddestino.getVisible(), 5, 0)), true);
      }
      else if ( GXutil.strcmp(AV27RegionDestino, "NO") == 0 )
      {
         dynavTran_regioniddestino.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynavTran_regioniddestino.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavTran_regioniddestino.getVisible(), 5, 0)), true);
      }
      if ( GXutil.strcmp(AV11CentroCDestino, "SI") == 0 )
      {
         cmbavTran_centrocostoiddestino.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTran_centrocostoiddestino.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavTran_centrocostoiddestino.getVisible(), 5, 0)), true);
         if ( GXutil.strcmp(AV27RegionDestino, "NO") == 0 )
         {
            cmbavTran_centrocostoiddestino.removeAllItems();
            /* Using cursor H00636 */
            pr_default.execute(3, new Object[] {new Long(AV77Tran_RegionId), new Long(AV55Tran_CentroCostoId)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A1Cent_Id = H00636_A1Cent_Id[0] ;
               A2Regi_Id = H00636_A2Regi_Id[0] ;
               A4Cent_Descripcion = H00636_A4Cent_Descripcion[0] ;
               A3Cent_Codigo = H00636_A3Cent_Codigo[0] ;
               cmbavTran_centrocostoiddestino.addItem(GXutil.trim( GXutil.str( A1Cent_Id, 11, 0)), A3Cent_Codigo+"-"+A4Cent_Descripcion, (short)(0));
               pr_default.readNext(3);
            }
            pr_default.close(3);
         }
      }
      else if ( GXutil.strcmp(AV11CentroCDestino, "NO") == 0 )
      {
         cmbavTran_centrocostoiddestino.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTran_centrocostoiddestino.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavTran_centrocostoiddestino.getVisible(), 5, 0)), true);
      }
      GXt_objcol_SdtSDTDocumentos_SDTDocumentosItem6 = AV93SDTDocumentos ;
      GXv_objcol_SdtSDTDocumentos_SDTDocumentosItem7[0] = GXt_objcol_SdtSDTDocumentos_SDTDocumentosItem6 ;
      new com.orions2.dpdocumentos(remoteHandle, context).execute( AV61Tran_CodigoMovimiento, GXv_objcol_SdtSDTDocumentos_SDTDocumentosItem7) ;
      GXt_objcol_SdtSDTDocumentos_SDTDocumentosItem6 = GXv_objcol_SdtSDTDocumentos_SDTDocumentosItem7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Tran_CodigoMovimiento", AV61Tran_CodigoMovimiento);
      AV93SDTDocumentos = GXt_objcol_SdtSDTDocumentos_SDTDocumentosItem6 ;
      gx_BV204 = true ;
      cmbavTran_centrocostoiddestino.setValue( GXutil.trim( GXutil.str( AV56Tran_CentroCostoIdDestino, 11, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTran_centrocostoiddestino.getInternalname(), "Values", cmbavTran_centrocostoiddestino.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV93SDTDocumentos", AV93SDTDocumentos);
      nGXsfl_204_bak_idx = nGXsfl_204_idx ;
      gxgrgrid1_refresh( ) ;
      nGXsfl_204_idx = nGXsfl_204_bak_idx ;
      sGXsfl_204_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_204_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2042( ) ;
   }

   public void e21632( )
   {
      /* Tran_moduloorigen_Isvalid Routine */
      AV58Tran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Tran_CodAlmaOrigen", AV58Tran_CodAlmaOrigen);
      AV85AlmaOrigenDescri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85AlmaOrigenDescri", AV85AlmaOrigenDescri);
      AV87pTran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87pTran_CodAlmaOrigen", AV87pTran_CodAlmaOrigen);
      AV60Tran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Tran_CodBodeOrigen", AV60Tran_CodBodeOrigen);
      AV86Bode_DescripcionOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86Bode_DescripcionOrigen", AV86Bode_DescripcionOrigen);
      AV88pTran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88pTran_CodBodeOrigen", AV88pTran_CodBodeOrigen);
      AV59Tran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Tran_CodBodeDestino", AV59Tran_CodBodeDestino);
      AV92Bode_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92Bode_DescripcionDestino", AV92Bode_DescripcionDestino);
      AV91pTran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91pTran_CodBodeDestino", AV91pTran_CodBodeDestino);
      AV57Tran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Tran_CodAlmaDestino", AV57Tran_CodAlmaDestino);
      AV89Alma_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Alma_DescripcionDestino", AV89Alma_DescripcionDestino);
      AV90pTran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90pTran_CodAlmaDestino", AV90pTran_CodAlmaDestino);
      AV60Tran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Tran_CodBodeOrigen", AV60Tran_CodBodeOrigen);
      AV86Bode_DescripcionOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86Bode_DescripcionOrigen", AV86Bode_DescripcionOrigen);
      AV88pTran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88pTran_CodBodeOrigen", AV88pTran_CodBodeOrigen);
      AV58Tran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Tran_CodAlmaOrigen", AV58Tran_CodAlmaOrigen);
      AV85AlmaOrigenDescri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85AlmaOrigenDescri", AV85AlmaOrigenDescri);
      AV87pTran_CodAlmaOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87pTran_CodAlmaOrigen", AV87pTran_CodAlmaOrigen);
   }

   public void e35632( )
   {
      /* 'AlmaOrigen' Routine */
      AV95SWError6 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95SWError6", GXutil.ltrim( GXutil.str( AV95SWError6, 4, 0)));
      httpContext.popup(formatLink("com.orions2.gxalmaorigen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV77Tran_RegionId,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV55Tran_CentroCostoId,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV61Tran_CodigoMovimiento)) + "," + GXutil.URLEncode(GXutil.rtrim(AV71Tran_ModuloOrigen)) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV58Tran_CodAlmaOrigen","AV85AlmaOrigenDescri","AV87pTran_CodAlmaOrigen"});
   }

   public void e22632( )
   {
      /* 'BodegaOrigen' Routine */
      AV95SWError6 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95SWError6", GXutil.ltrim( GXutil.str( AV95SWError6, 4, 0)));
      AV60Tran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Tran_CodBodeOrigen", AV60Tran_CodBodeOrigen);
      AV86Bode_DescripcionOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86Bode_DescripcionOrigen", AV86Bode_DescripcionOrigen);
      AV88pTran_CodBodeOrigen = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88pTran_CodBodeOrigen", AV88pTran_CodBodeOrigen);
      AV59Tran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Tran_CodBodeDestino", AV59Tran_CodBodeDestino);
      AV92Bode_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92Bode_DescripcionDestino", AV92Bode_DescripcionDestino);
      AV91pTran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91pTran_CodBodeDestino", AV91pTran_CodBodeDestino);
      AV57Tran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Tran_CodAlmaDestino", AV57Tran_CodAlmaDestino);
      AV89Alma_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Alma_DescripcionDestino", AV89Alma_DescripcionDestino);
      AV90pTran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90pTran_CodAlmaDestino", AV90pTran_CodAlmaDestino);
      if ( GXutil.strcmp(AV87pTran_CodAlmaOrigen, "") == 0 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe seleccionar el almacén orígen" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         GX_FocusControl = dynavTran_moduloorigen.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV95SWError6 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95SWError6", GXutil.ltrim( GXutil.str( AV95SWError6, 4, 0)));
      }
      else
      {
         if ( GXutil.strcmp(AV23Ind_E_S, "E") != 0 )
         {
            if ( GXutil.strcmp(AV71Tran_ModuloOrigen, "INVE") == 0 )
            {
               imgImage4_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, imgImage4_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage4_Visible, 5, 0)), true);
            }
            else
            {
               imgImage4_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, imgImage4_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage4_Visible, 5, 0)), true);
               GXv_int5[0] = AV66Tran_IdCuentadanteOrigen ;
               GXv_char8[0] = AV73Tran_NombCuentadanteOrigen ;
               GXv_int9[0] = AV15Cuen_CedulaOrigen ;
               new com.orions2.pbuscacuentadante(remoteHandle, context).execute( AV55Tran_CentroCostoId, AV71Tran_ModuloOrigen, AV58Tran_CodAlmaOrigen, GXv_int5, GXv_char8, GXv_int9) ;
               wp_transaccion_impl.this.AV66Tran_IdCuentadanteOrigen = GXv_int5[0] ;
               wp_transaccion_impl.this.AV73Tran_NombCuentadanteOrigen = GXv_char8[0] ;
               wp_transaccion_impl.this.AV15Cuen_CedulaOrigen = GXv_int9[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV71Tran_ModuloOrigen", AV71Tran_ModuloOrigen);
               httpContext.ajax_rsp_assign_attri("", false, "AV58Tran_CodAlmaOrigen", AV58Tran_CodAlmaOrigen);
               httpContext.ajax_rsp_assign_attri("", false, "AV66Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( AV66Tran_IdCuentadanteOrigen, 18, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV73Tran_NombCuentadanteOrigen", AV73Tran_NombCuentadanteOrigen);
               httpContext.ajax_rsp_assign_attri("", false, "AV15Cuen_CedulaOrigen", GXutil.ltrim( GXutil.str( AV15Cuen_CedulaOrigen, 18, 0)));
            }
         }
         else
         {
            imgImage4_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, imgImage4_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage4_Visible, 5, 0)), true);
            AV66Tran_IdCuentadanteOrigen = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( AV66Tran_IdCuentadanteOrigen, 18, 0)));
         }
         httpContext.popup(formatLink("com.orions2.gxbodegaorigen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV77Tran_RegionId,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV55Tran_CentroCostoId,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV61Tran_CodigoMovimiento)) + "," + GXutil.URLEncode(GXutil.rtrim(AV71Tran_ModuloOrigen)) + "," + GXutil.URLEncode(GXutil.rtrim(AV58Tran_CodAlmaOrigen)) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV58Tran_CodAlmaOrigen","AV60Tran_CodBodeOrigen","AV86Bode_DescripcionOrigen","AV88pTran_CodBodeOrigen"});
      }
   }

   public void e36632( )
   {
      /* 'CuentadanteOrigen' Routine */
      AV43SWError1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43SWError1", GXutil.ltrim( GXutil.str( AV43SWError1, 4, 0)));
      httpContext.popup(formatLink("com.orions2.gxcuentadante") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV66Tran_IdCuentadanteOrigen","AV73Tran_NombCuentadanteOrigen","AV15Cuen_CedulaOrigen"});
   }

   public void e23632( )
   {
      /* Bode_descripcionorigen_Isvalid Routine */
      AV59Tran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Tran_CodBodeDestino", AV59Tran_CodBodeDestino);
      AV92Bode_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92Bode_DescripcionDestino", AV92Bode_DescripcionDestino);
      AV91pTran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91pTran_CodBodeDestino", AV91pTran_CodBodeDestino);
      GXt_objcol_SdtSDTModuloDestino_SDTModuloDestinoItem10 = AV34SDTModuloDestino ;
      GXv_int9[0] = AV77Tran_RegionId ;
      GXv_int5[0] = AV55Tran_CentroCostoId ;
      GXv_char8[0] = AV61Tran_CodigoMovimiento ;
      GXv_char11[0] = AV71Tran_ModuloOrigen ;
      GXv_char12[0] = AV58Tran_CodAlmaOrigen ;
      GXv_char13[0] = AV60Tran_CodBodeOrigen ;
      GXv_objcol_SdtSDTModuloDestino_SDTModuloDestinoItem14[0] = GXt_objcol_SdtSDTModuloDestino_SDTModuloDestinoItem10 ;
      new com.orions2.pmodulo_destino(remoteHandle, context).execute( GXv_int9, GXv_int5, GXv_char8, GXv_char11, GXv_char12, GXv_char13, GXv_objcol_SdtSDTModuloDestino_SDTModuloDestinoItem14) ;
      wp_transaccion_impl.this.AV77Tran_RegionId = GXv_int9[0] ;
      wp_transaccion_impl.this.AV55Tran_CentroCostoId = GXv_int5[0] ;
      wp_transaccion_impl.this.AV61Tran_CodigoMovimiento = GXv_char8[0] ;
      wp_transaccion_impl.this.AV71Tran_ModuloOrigen = GXv_char11[0] ;
      wp_transaccion_impl.this.AV58Tran_CodAlmaOrigen = GXv_char12[0] ;
      wp_transaccion_impl.this.AV60Tran_CodBodeOrigen = GXv_char13[0] ;
      GXt_objcol_SdtSDTModuloDestino_SDTModuloDestinoItem10 = GXv_objcol_SdtSDTModuloDestino_SDTModuloDestinoItem14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77Tran_RegionId", GXutil.ltrim( GXutil.str( AV77Tran_RegionId, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV55Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV61Tran_CodigoMovimiento", AV61Tran_CodigoMovimiento);
      httpContext.ajax_rsp_assign_attri("", false, "AV71Tran_ModuloOrigen", AV71Tran_ModuloOrigen);
      httpContext.ajax_rsp_assign_attri("", false, "AV58Tran_CodAlmaOrigen", AV58Tran_CodAlmaOrigen);
      httpContext.ajax_rsp_assign_attri("", false, "AV60Tran_CodBodeOrigen", AV60Tran_CodBodeOrigen);
      AV34SDTModuloDestino = GXt_objcol_SdtSDTModuloDestino_SDTModuloDestinoItem10 ;
      cmbavTran_modulodestino.removeAllItems();
      AV112GXV2 = 1 ;
      while ( AV112GXV2 <= AV34SDTModuloDestino.size() )
      {
         AV35SDTModuloDestinoItem = (com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem)((com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem)AV34SDTModuloDestino.elementAt(-1+AV112GXV2));
         cmbavTran_modulodestino.addItem(AV35SDTModuloDestinoItem.getgxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo(), AV35SDTModuloDestinoItem.getgxTv_SdtSDTModuloDestino_SDTModuloDestinoItem_Modulo(), (short)(0));
         AV112GXV2 = (int)(AV112GXV2+1) ;
      }
      cmbavTran_modulodestino.setValue( GXutil.rtrim( AV70Tran_ModuloDestino) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTran_modulodestino.getInternalname(), "Values", cmbavTran_modulodestino.ToJavascriptSource(), true);
   }

   public void e24632( )
   {
      /* Tran_modulodestino_Isvalid Routine */
      AV92Bode_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92Bode_DescripcionDestino", AV92Bode_DescripcionDestino);
      AV91pTran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91pTran_CodBodeDestino", AV91pTran_CodBodeDestino);
      AV57Tran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Tran_CodAlmaDestino", AV57Tran_CodAlmaDestino);
      AV89Alma_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Alma_DescripcionDestino", AV89Alma_DescripcionDestino);
      AV90pTran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90pTran_CodAlmaDestino", AV90pTran_CodAlmaDestino);
      AV43SWError1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43SWError1", GXutil.ltrim( GXutil.str( AV43SWError1, 4, 0)));
      AV96SWError7 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96SWError7", GXutil.ltrim( GXutil.str( AV96SWError7, 4, 0)));
      if ( GXutil.strcmp(AV88pTran_CodBodeOrigen, "") == 0 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe seleccionar la bodega orígen" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         GX_FocusControl = edtavAlmaorigendescri_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV96SWError7 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96SWError7", GXutil.ltrim( GXutil.str( AV96SWError7, 4, 0)));
      }
      else
      {
         if ( ( GXutil.strcmp(AV23Ind_E_S, "E") == 0 ) && ( GXutil.strcmp(AV71Tran_ModuloOrigen, "ALMA") == 0 ) && ( (0==AV68Tran_IdProveedor) ) )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Debe seleccionar el proveedor" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = edtavBode_descripcionorigen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            AV43SWError1 = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43SWError1", GXutil.ltrim( GXutil.str( AV43SWError1, 4, 0)));
         }
         if ( ( (0==AV66Tran_IdCuentadanteOrigen) ) && ( GXutil.strcmp(AV23Ind_E_S, "E") != 0 ) )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Debe seleccionar el Cuentadante Orígen" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = edtavBode_descripcionorigen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            AV43SWError1 = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43SWError1", GXutil.ltrim( GXutil.str( AV43SWError1, 4, 0)));
         }
         else
         {
            if ( GXutil.strcmp(AV71Tran_ModuloOrigen, "INVE") == 0 )
            {
               /* Execute user subroutine: 'VALIDARBIENESCUENTADANTE' */
               S112 ();
               if (returnInSub) return;
               if ( AV41SWBien == 0 )
               {
                  Alertify1_Type = "error" ;
                  httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
                  Alertify1_Textmessage = "Este cuentadante no tiene bienes asignados." ;
                  httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
                  this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
                  GX_FocusControl = edtavBode_descripcionorigen_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
                  AV43SWError1 = (short)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV43SWError1", GXutil.ltrim( GXutil.str( AV43SWError1, 4, 0)));
               }
            }
         }
      }
   }

   public void S112( )
   {
      /* 'VALIDARBIENESCUENTADANTE' Routine */
      AV41SWBien = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41SWBien", GXutil.ltrim( GXutil.str( AV41SWBien, 4, 0)));
      /* Using cursor H00637 */
      pr_default.execute(4, new Object[] {new Long(AV77Tran_RegionId), new Long(AV55Tran_CentroCostoId), AV71Tran_ModuloOrigen, AV58Tran_CodAlmaOrigen, AV60Tran_CodBodeOrigen, new Long(AV66Tran_IdCuentadanteOrigen), new Long(AV53Tipo_Codigo)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A66Elem_Consecutivo = H00637_A66Elem_Consecutivo[0] ;
         A43Cuen_Identificacion = H00637_A43Cuen_Identificacion[0] ;
         n43Cuen_Identificacion = H00637_n43Cuen_Identificacion[0] ;
         A33Tipo_Codigo = H00637_A33Tipo_Codigo[0] ;
         A463Invd_Estado = H00637_A463Invd_Estado[0] ;
         n463Invd_Estado = H00637_n463Invd_Estado[0] ;
         A414Invd_BodegaCodigo = H00637_A414Invd_BodegaCodigo[0] ;
         A413Invd_AlmacenCodigo = H00637_A413Invd_AlmacenCodigo[0] ;
         A412Invd_ModuloAlmacen = H00637_A412Invd_ModuloAlmacen[0] ;
         A411Invd_CentroCostoId = H00637_A411Invd_CentroCostoId[0] ;
         A410Invd_RegionalId = H00637_A410Invd_RegionalId[0] ;
         A33Tipo_Codigo = H00637_A33Tipo_Codigo[0] ;
         AV41SWBien = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41SWBien", GXutil.ltrim( GXutil.str( AV41SWBien, 4, 0)));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void e25632( )
   {
      /* Tran_regioniddestino_Isvalid Routine */
      AV92Bode_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92Bode_DescripcionDestino", AV92Bode_DescripcionDestino);
      AV91pTran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91pTran_CodBodeDestino", AV91pTran_CodBodeDestino);
      AV57Tran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Tran_CodAlmaDestino", AV57Tran_CodAlmaDestino);
      AV89Alma_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Alma_DescripcionDestino", AV89Alma_DescripcionDestino);
      AV90pTran_CodAlmaDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90pTran_CodAlmaDestino", AV90pTran_CodAlmaDestino);
      cmbavTran_centrocostoiddestino.removeAllItems();
      /* Using cursor H00638 */
      pr_default.execute(5, new Object[] {new Long(AV78Tran_RegionIdDestino)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A2Regi_Id = H00638_A2Regi_Id[0] ;
         A4Cent_Descripcion = H00638_A4Cent_Descripcion[0] ;
         A3Cent_Codigo = H00638_A3Cent_Codigo[0] ;
         A1Cent_Id = H00638_A1Cent_Id[0] ;
         cmbavTran_centrocostoiddestino.addItem(GXutil.trim( GXutil.str( A1Cent_Id, 11, 0)), A3Cent_Codigo+"-"+A4Cent_Descripcion, (short)(0));
         pr_default.readNext(5);
      }
      pr_default.close(5);
      cmbavTran_centrocostoiddestino.setValue( GXutil.trim( GXutil.str( AV56Tran_CentroCostoIdDestino, 11, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTran_centrocostoiddestino.getInternalname(), "Values", cmbavTran_centrocostoiddestino.ToJavascriptSource(), true);
   }

   public void e26632( )
   {
      /* 'BodeDestino' Routine */
      AV97SWError8 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97SWError8", GXutil.ltrim( GXutil.str( AV97SWError8, 4, 0)));
      AV59Tran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Tran_CodBodeDestino", AV59Tran_CodBodeDestino);
      AV92Bode_DescripcionDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92Bode_DescripcionDestino", AV92Bode_DescripcionDestino);
      AV91pTran_CodBodeDestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91pTran_CodBodeDestino", AV91pTran_CodBodeDestino);
      if ( GXutil.strcmp(AV90pTran_CodAlmaDestino, "") == 0 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe seleccionar el almacén destino" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         GX_FocusControl = cmbavTran_modulodestino.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV97SWError8 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV97SWError8", GXutil.ltrim( GXutil.str( AV97SWError8, 4, 0)));
      }
      else
      {
         if ( GXutil.strcmp(AV70Tran_ModuloDestino, "INVE") == 0 )
         {
            imgImagecuentadante_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, imgImagecuentadante_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImagecuentadante_Visible, 5, 0)), true);
            AV65Tran_IdCuentadanteDestino = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( AV65Tran_IdCuentadanteDestino, 18, 0)));
            AV72Tran_NombCuentadanteDestino = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72Tran_NombCuentadanteDestino", AV72Tran_NombCuentadanteDestino);
            AV14Cuen_CedulaDestino = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Cuen_CedulaDestino", GXutil.ltrim( GXutil.str( AV14Cuen_CedulaDestino, 18, 0)));
         }
         else
         {
            if ( GXutil.strcmp(AV11CentroCDestino, "SI") == 0 )
            {
               GXv_int9[0] = AV65Tran_IdCuentadanteDestino ;
               GXv_char13[0] = AV72Tran_NombCuentadanteDestino ;
               GXv_int5[0] = AV14Cuen_CedulaDestino ;
               new com.orions2.pbuscacuentadante(remoteHandle, context).execute( AV56Tran_CentroCostoIdDestino, AV70Tran_ModuloDestino, AV57Tran_CodAlmaDestino, GXv_int9, GXv_char13, GXv_int5) ;
               wp_transaccion_impl.this.AV65Tran_IdCuentadanteDestino = GXv_int9[0] ;
               wp_transaccion_impl.this.AV72Tran_NombCuentadanteDestino = GXv_char13[0] ;
               wp_transaccion_impl.this.AV14Cuen_CedulaDestino = GXv_int5[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56Tran_CentroCostoIdDestino", GXutil.ltrim( GXutil.str( AV56Tran_CentroCostoIdDestino, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV70Tran_ModuloDestino", AV70Tran_ModuloDestino);
               httpContext.ajax_rsp_assign_attri("", false, "AV57Tran_CodAlmaDestino", AV57Tran_CodAlmaDestino);
               httpContext.ajax_rsp_assign_attri("", false, "AV65Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( AV65Tran_IdCuentadanteDestino, 18, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV72Tran_NombCuentadanteDestino", AV72Tran_NombCuentadanteDestino);
               httpContext.ajax_rsp_assign_attri("", false, "AV14Cuen_CedulaDestino", GXutil.ltrim( GXutil.str( AV14Cuen_CedulaDestino, 18, 0)));
            }
            else
            {
               GXv_int9[0] = AV65Tran_IdCuentadanteDestino ;
               GXv_char13[0] = AV72Tran_NombCuentadanteDestino ;
               GXv_int5[0] = AV14Cuen_CedulaDestino ;
               new com.orions2.pbuscacuentadante(remoteHandle, context).execute( AV55Tran_CentroCostoId, AV70Tran_ModuloDestino, AV57Tran_CodAlmaDestino, GXv_int9, GXv_char13, GXv_int5) ;
               wp_transaccion_impl.this.AV65Tran_IdCuentadanteDestino = GXv_int9[0] ;
               wp_transaccion_impl.this.AV72Tran_NombCuentadanteDestino = GXv_char13[0] ;
               wp_transaccion_impl.this.AV14Cuen_CedulaDestino = GXv_int5[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV55Tran_CentroCostoId, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV70Tran_ModuloDestino", AV70Tran_ModuloDestino);
               httpContext.ajax_rsp_assign_attri("", false, "AV57Tran_CodAlmaDestino", AV57Tran_CodAlmaDestino);
               httpContext.ajax_rsp_assign_attri("", false, "AV65Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( AV65Tran_IdCuentadanteDestino, 18, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "AV72Tran_NombCuentadanteDestino", AV72Tran_NombCuentadanteDestino);
               httpContext.ajax_rsp_assign_attri("", false, "AV14Cuen_CedulaDestino", GXutil.ltrim( GXutil.str( AV14Cuen_CedulaDestino, 18, 0)));
            }
         }
      }
      httpContext.popup(formatLink("com.orions2.gxbodegadestino") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV77Tran_RegionId,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV55Tran_CentroCostoId,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV61Tran_CodigoMovimiento)) + "," + GXutil.URLEncode(GXutil.rtrim(AV71Tran_ModuloOrigen)) + "," + GXutil.URLEncode(GXutil.rtrim(AV58Tran_CodAlmaOrigen)) + "," + GXutil.URLEncode(GXutil.rtrim(AV60Tran_CodBodeOrigen)) + "," + GXutil.URLEncode(GXutil.rtrim(AV70Tran_ModuloDestino)) + "," + GXutil.URLEncode(GXutil.rtrim(AV57Tran_CodAlmaDestino)) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV59Tran_CodBodeDestino","AV92Bode_DescripcionDestino","AV91pTran_CodBodeDestino"});
   }

   public void e27632( )
   {
      /* Tran_tipoingreso_Isvalid Routine */
      /* Using cursor H00639 */
      pr_default.execute(6, new Object[] {AV61Tran_CodigoMovimiento, new Long(AV80Tran_TipoIngreso)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A41Orig_Identificador = H00639_A41Orig_Identificador[0] ;
         A38Tpmo_Codigo = H00639_A38Tpmo_Codigo[0] ;
         A642Tpmo_SolicitaNumero = H00639_A642Tpmo_SolicitaNumero[0] ;
         A643Tpmo_SolicitaFecha = H00639_A643Tpmo_SolicitaFecha[0] ;
         AV40SolicitaNumero = A642Tpmo_SolicitaNumero ;
         AV39SolicitaFecha = A643Tpmo_SolicitaFecha ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      if ( GXutil.strcmp(AV40SolicitaNumero, "SI") == 0 )
      {
         edtavTran_numeroingreso_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_numeroingreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_numeroingreso_Visible, 5, 0)), true);
      }
      else
      {
         edtavTran_numeroingreso_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_numeroingreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_numeroingreso_Visible, 5, 0)), true);
      }
      if ( GXutil.strcmp(AV39SolicitaFecha, "SI") == 0 )
      {
         edtavTran_fechaingreso_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_fechaingreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_fechaingreso_Visible, 5, 0)), true);
      }
      else
      {
         edtavTran_fechaingreso_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_fechaingreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_fechaingreso_Visible, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(AV23Ind_E_S, "E") == 0 ) && ( AV80Tran_TipoIngreso == 7 ) )
      {
         imgImage5_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage5_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage5_Visible, 5, 0)), true);
         edtavCuen_cedularespons_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedularespons_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuen_cedularespons_Visible, 5, 0)), true);
         edtavTran_nombrecuentadanteresponsabilidad_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombrecuentadanteresponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_nombrecuentadanteresponsabilidad_Visible, 5, 0)), true);
         imgImage6_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage6_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage6_Visible, 5, 0)), true);
         edtavTran_transaccresponsabilidad_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_transaccresponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_transaccresponsabilidad_Visible, 5, 0)), true);
         edtavTran_fecharesponsabilidad_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_fecharesponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_fecharesponsabilidad_Visible, 5, 0)), true);
      }
      else
      {
         imgImage5_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage5_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage5_Visible, 5, 0)), true);
         edtavCuen_cedularespons_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCuen_cedularespons_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuen_cedularespons_Visible, 5, 0)), true);
         edtavTran_nombrecuentadanteresponsabilidad_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_nombrecuentadanteresponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_nombrecuentadanteresponsabilidad_Visible, 5, 0)), true);
         imgImage6_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage6_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage6_Visible, 5, 0)), true);
         edtavTran_transaccresponsabilidad_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_transaccresponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_transaccresponsabilidad_Visible, 5, 0)), true);
         edtavTran_fecharesponsabilidad_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_fecharesponsabilidad_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_fecharesponsabilidad_Visible, 5, 0)), true);
      }
   }

   public void e28632( )
   {
      /* Tran_fechaingreso_Isvalid Routine */
      AV44SWError2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44SWError2", GXutil.ltrim( GXutil.str( AV44SWError2, 4, 0)));
      if ( AV63Tran_FechaIngreso.after( Gx_date ) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "La fecha no puede ser mayor a hoy" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         GX_FocusControl = edtavTran_fechaingreso_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV44SWError2 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44SWError2", GXutil.ltrim( GXutil.str( AV44SWError2, 4, 0)));
      }
      else if ( GXutil.dateCompare(AV63Tran_FechaIngreso, GXutil.nullDate()) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe ingresar la fecha" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         GX_FocusControl = edtavTran_fechaingreso_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV44SWError2 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44SWError2", GXutil.ltrim( GXutil.str( AV44SWError2, 4, 0)));
      }
   }

   public void e29632( )
   {
      /* Tran_detalle_Isvalid Routine */
      AV79Tran_TipoEntra = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79Tran_TipoEntra", AV79Tran_TipoEntra);
      if ( ( GXutil.strcmp(AV25Ind_Tipo, "D") == 0 ) && ( GXutil.strcmp(AV23Ind_E_S, "E") == 0 ) )
      {
         if ( GXutil.strcmp(AV62Tran_detalle, "S") == 0 )
         {
            cmbavTran_tipoentra.setVisible( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavTran_tipoentra.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavTran_tipoentra.getVisible(), 5, 0)), true);
         }
         else
         {
            cmbavTran_tipoentra.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavTran_tipoentra.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavTran_tipoentra.getVisible(), 5, 0)), true);
         }
      }
      AV47SWError5 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47SWError5", GXutil.ltrim( GXutil.str( AV47SWError5, 4, 0)));
      if ( (0==AV65Tran_IdCuentadanteDestino) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe seleccionar el Cuentadante Destino" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         GX_FocusControl = edtavBode_descripciondestino_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV47SWError5 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47SWError5", GXutil.ltrim( GXutil.str( AV47SWError5, 4, 0)));
      }
      cmbavTran_tipoentra.setValue( GXutil.rtrim( AV79Tran_TipoEntra) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTran_tipoentra.getInternalname(), "Values", cmbavTran_tipoentra.ToJavascriptSource(), true);
   }

   public void e30632( )
   {
      /* 'Transacción' Routine */
      AV98SWError9 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98SWError9", GXutil.ltrim( GXutil.str( AV98SWError9, 4, 0)));
      if ( AV16Cuen_CedulaRespons == 0 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe seleccionar la cédula del cuentadante para cuenta de responsabilidad" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         AV98SWError9 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98SWError9", GXutil.ltrim( GXutil.str( AV98SWError9, 4, 0)));
         GX_FocusControl = cmbavTran_detalle.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV99SWError10 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99SWError10", GXutil.ltrim( GXutil.str( AV99SWError10, 4, 0)));
         httpContext.popup(formatLink("com.orions2.selcuentaresponsabilidad") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV77Tran_RegionId,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV55Tran_CentroCostoId,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV67Tran_IdCuentadanteResponsabilidad,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV81Tran_TransaccResponsabilidad","AV64Tran_FechaResponsabilidad","AV52Tabla","AV69Tran_IdResponsabilidad"});
      }
   }

   public void e31632( )
   {
      /* Tran_observaciones_Isvalid Routine */
      AV45SWError3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45SWError3", GXutil.ltrim( GXutil.str( AV45SWError3, 4, 0)));
      if ( ( (GXutil.strcmp("", AV6Area_Codigo)==0) ) && ( imgImage2_Visible == ( 1 )) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe seleccionar el Areadante" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         GX_FocusControl = cmbavTran_detalle.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV45SWError3 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45SWError3", GXutil.ltrim( GXutil.str( AV45SWError3, 4, 0)));
      }
      AV46SWError4 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46SWError4", GXutil.ltrim( GXutil.str( AV46SWError4, 4, 0)));
      if ( ( (GXutil.strcmp("", AV17Curs_Codigo)==0) ) && ( imgImage3_Visible == ( 1 )) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe seleccionar el Curso" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         GX_FocusControl = cmbavTran_detalle.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV46SWError4 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46SWError4", GXutil.ltrim( GXutil.str( AV46SWError4, 4, 0)));
      }
      AV98SWError9 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98SWError9", GXutil.ltrim( GXutil.str( AV98SWError9, 4, 0)));
      if ( ( AV16Cuen_CedulaRespons == 0 ) && ( imgImage5_Visible == ( 1 )) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe seleccionar el cuentadante para responsabilidad" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         GX_FocusControl = cmbavTran_detalle.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV98SWError9 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98SWError9", GXutil.ltrim( GXutil.str( AV98SWError9, 4, 0)));
      }
      AV99SWError10 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99SWError10", GXutil.ltrim( GXutil.str( AV99SWError10, 4, 0)));
      if ( ( AV81Tran_TransaccResponsabilidad == 0 ) && ( imgImage6_Visible == ( 1 )) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe seleccionar la transacción de responsabilidad" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         GX_FocusControl = cmbavTran_detalle.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV99SWError10 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99SWError10", GXutil.ltrim( GXutil.str( AV99SWError10, 4, 0)));
      }
      AV100SWError11 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100SWError11", GXutil.ltrim( GXutil.str( AV100SWError11, 4, 0)));
      if ( ( GXutil.strcmp(AV79Tran_TipoEntra, "") == 0 ) && ( GXutil.strcmp(AV62Tran_detalle, "S") == 0 ) && ( GXutil.strcmp(AV25Ind_Tipo, "D") == 0 ) && ( GXutil.strcmp(AV23Ind_E_S, "E") == 0 ) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe seleccionar el tipo de entrada devolutivo" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         GX_FocusControl = cmbavTran_tipoentra.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV100SWError11 = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100SWError11", GXutil.ltrim( GXutil.str( AV100SWError11, 4, 0)));
      }
   }

   public void e32632( )
   {
      /* 'Confirmar' Routine */
      if ( ( AV42SWError == 0 ) && ( AV43SWError1 == 0 ) && ( AV44SWError2 == 0 ) && ( AV45SWError3 == 0 ) && ( AV46SWError4 == 0 ) && ( AV47SWError5 == 0 ) && ( AV95SWError6 == 0 ) && ( AV96SWError7 == 0 ) && ( AV97SWError8 == 0 ) && ( AV98SWError9 == 0 ) && ( AV99SWError10 == 0 ) && ( AV100SWError11 == 0 ) )
      {
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_areadantecodigo( AV6Area_Codigo );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoid( AV55Tran_CentroCostoId );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_codalmadestino( AV57Tran_CodAlmaDestino );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_codalmaorigen( AV58Tran_CodAlmaOrigen );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_codbodedestino( AV59Tran_CodBodeDestino );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_codbodeorigen( AV60Tran_CodBodeOrigen );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_codigomovimiento( AV61Tran_CodigoMovimiento );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_cursocodigo( AV17Curs_Codigo );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_detalle( AV62Tran_detalle );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadantedestino( AV65Tran_IdCuentadanteDestino );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteorigen( AV66Tran_IdCuentadanteOrigen );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_idproveedor( AV68Tran_IdProveedor );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_inde_s( AV23Ind_E_S );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_moduloorigen( AV71Tran_ModuloOrigen );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_modulodestino( AV70Tran_ModuloDestino );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_numeroingreso( AV75Tran_numeroIngreso );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_observaciones( AV76Tran_Observaciones );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_regionid( AV77Tran_RegionId );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_tipoelemento( AV25Ind_Tipo );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_tipoentra( AV79Tran_TipoEntra );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_tipoingreso( AV80Tran_TipoIngreso );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_fechaingreso( AV63Tran_FechaIngreso );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_usuarioid( AV20IdUsuario );
         if ( GXutil.strcmp(AV11CentroCDestino, "SI") == 0 )
         {
            AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino( AV56Tran_CentroCostoIdDestino );
         }
         else
         {
            AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_centrocostoiddestino( AV55Tran_CentroCostoId );
         }
         if ( GXutil.strcmp(AV27RegionDestino, "SI") == 0 )
         {
            AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino( AV78Tran_RegionIdDestino );
         }
         else
         {
            AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_regioniddestino( AV77Tran_RegionId );
         }
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_idcuentadanteresponsabilidad( AV67Tran_IdCuentadanteResponsabilidad );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_transaccresponsabilidad( AV69Tran_IdResponsabilidad );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_fecharesponsabilidad( AV64Tran_FechaResponsabilidad );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_tablaresponsabilidad( AV52Tabla );
         AV36SDTNuevaTransaccion.setgxTv_SdtSDTNuevaTransaccion_Tran_entidadgobierno( AV101Tran_EntidadGobierno );
         GXv_SdtSDTNuevaTransaccion15[0] = AV36SDTNuevaTransaccion;
         GXv_int9[0] = AV5Tran_Id ;
         GXv_char13[0] = AV12ConsecutivoCC ;
         new com.orions2.pcreatransaccion(remoteHandle, context).execute( GXv_SdtSDTNuevaTransaccion15, GXv_int9, GXv_char13) ;
         AV36SDTNuevaTransaccion = GXv_SdtSDTNuevaTransaccion15[0] ;
         wp_transaccion_impl.this.AV5Tran_Id = GXv_int9[0] ;
         wp_transaccion_impl.this.AV12ConsecutivoCC = GXv_char13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Tran_Id", GXutil.ltrim( GXutil.str( AV5Tran_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV12ConsecutivoCC", AV12ConsecutivoCC);
         Alertify1_Type = "alert" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Se ha generado la transacción con el Número "+AV12ConsecutivoCC ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else
      {
         if ( AV42SWError == 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error debe ingresar el número" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = edtavTran_numeroingreso_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else if ( AV43SWError1 == 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error debe seleccionar el cuentadante orígen o el proveedor" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = edtavBode_descripcionorigen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else if ( AV44SWError2 == 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error debe corregir la fecha" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = edtavTran_fechaingreso_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else if ( AV45SWError3 == 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error debe seleccionar el Areadante" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = cmbavTran_detalle.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else if ( AV46SWError4 == 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error debe seleccionar el Curso" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = cmbavTran_detalle.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else if ( AV47SWError5 == 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error debe seleccionar el Cuentadante Destino" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = edtavBode_descripciondestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else if ( AV95SWError6 == 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error debe seleccionar el almacén orígen" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = dynavTran_moduloorigen.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else if ( AV96SWError7 == 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error debe seleccionar la bodega orígen" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = edtavAlmaorigendescri_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else if ( AV97SWError8 == 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error debe seleccionar el almacén destino" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = cmbavTran_modulodestino.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else if ( AV98SWError9 == 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error debe seleccionar el cuentadante para responsabilidad" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = cmbavTran_detalle.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else if ( AV99SWError10 == 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error debe seleccionar la transacción de responsabilidad" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = cmbavTran_detalle.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else if ( AV100SWError11 == 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error debe seleccionar el tipo de entrada devolutivo" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            GX_FocusControl = cmbavTran_tipoentra.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36SDTNuevaTransaccion", AV36SDTNuevaTransaccion);
   }

   public void e17632( )
   {
      /* Alertify1_Ok Routine */
      if ( GXutil.strcmp(AV62Tran_detalle, "S") == 0 )
      {
         callWebObject(formatLink("com.orions2.carguemasivo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV23Ind_E_S)) + "," + GXutil.URLEncode(GXutil.rtrim(AV25Ind_Tipo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV79Tran_TipoEntra)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))));
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.doAjaxRefresh();
      }
      else
      {
         if ( ( GXutil.strcmp(AV23Ind_E_S, "E") == 0 ) && ( GXutil.strcmp(AV25Ind_Tipo, "C") == 0 ) )
         {
            callWebObject(formatLink("com.orions2.wpcon_ent") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Tran_Id,11,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else if ( ( GXutil.strcmp(AV23Ind_E_S, "E") == 0 ) && ( GXutil.strcmp(AV25Ind_Tipo, "D") == 0 ) )
         {
            callWebObject(formatLink("com.orions2.wpcon_ent_dev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Tran_Id,11,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else if ( ( ( GXutil.strcmp(AV23Ind_E_S, "S") == 0 ) || ( GXutil.strcmp(AV23Ind_E_S, "L") == 0 ) ) && ( GXutil.strcmp(AV25Ind_Tipo, "C") == 0 ) )
         {
            callWebObject(formatLink("com.orions2.wpalm_salida_consumo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Tran_Id,11,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else if ( ( ( GXutil.strcmp(AV23Ind_E_S, "S") == 0 ) || ( GXutil.strcmp(AV23Ind_E_S, "L") == 0 ) ) && ( GXutil.strcmp(AV25Ind_Tipo, "D") == 0 ) )
         {
            callWebObject(formatLink("com.orions2.wpalm_salida_devolutivo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Tran_Id,11,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else if ( GXutil.strcmp(AV23Ind_E_S, "T") == 0 )
         {
            callWebObject(formatLink("com.orions2.wpalm_salida_devolutivo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Tran_Id,11,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         else if ( GXutil.strcmp(AV23Ind_E_S, "R") == 0 )
         {
            callWebObject(formatLink("com.orions2.wpalm_recuperacion") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV5Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV16Cuen_CedulaRespons,18,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV69Tran_IdResponsabilidad,11,0))) + "," + GXutil.URLEncode(GXutil.formatDateParm(AV64Tran_FechaResponsabilidad)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV52Tabla,4,0))));
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
   }

   public void e33632( )
   {
      /* 'Cancelar' Routine */
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   private void e38632( )
   {
      /* Grid1_Load Routine */
      AV104GXV1 = (short)(1) ;
      while ( AV104GXV1 <= AV93SDTDocumentos.size() )
      {
         AV93SDTDocumentos.currentItem( ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(204) ;
         }
         sendrow_2042( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_204_Refreshing )
         {
            httpContext.doAjaxLoad(204, Grid1Row);
         }
         AV104GXV1 = (short)(AV104GXV1+1) ;
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
      pa632( ) ;
      ws632( ) ;
      we632( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414203930");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wp_transaccion.js", "?201861414203933");
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      /* End function include_jscripts */
   }

   public void subsflControlProps_2042( )
   {
      edtavCtltran_nro_documento_Internalname = "CTLTRAN_NRO_DOCUMENTO_"+sGXsfl_204_idx ;
      edtavCtltran_descrip_documento_Internalname = "CTLTRAN_DESCRIP_DOCUMENTO_"+sGXsfl_204_idx ;
      edtavCtltran_archivo_Internalname = "CTLTRAN_ARCHIVO_"+sGXsfl_204_idx ;
   }

   public void subsflControlProps_fel_2042( )
   {
      edtavCtltran_nro_documento_Internalname = "CTLTRAN_NRO_DOCUMENTO_"+sGXsfl_204_fel_idx ;
      edtavCtltran_descrip_documento_Internalname = "CTLTRAN_DESCRIP_DOCUMENTO_"+sGXsfl_204_fel_idx ;
      edtavCtltran_archivo_Internalname = "CTLTRAN_ARCHIVO_"+sGXsfl_204_fel_idx ;
   }

   public void sendrow_2042( )
   {
      subsflControlProps_2042( ) ;
      wb630( ) ;
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
         if ( ((int)((nGXsfl_204_idx) % (2))) == 0 )
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
         httpContext.writeText( " gxrow=\""+sGXsfl_204_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltran_nro_documento_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento(), (byte)(4), (byte)(0), ",", "")),((edtavCtltran_nro_documento_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento()), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento()), "ZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltran_nro_documento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(0),new Integer(edtavCtltran_nro_documento_Enabled),new Integer(0),"text","",new Integer(42),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(204),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltran_descrip_documento_Internalname,((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltran_descrip_documento_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtltran_descrip_documento_Enabled),new Integer(0),"text","",new Integer(310),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(204),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      ClassString = "Attribute" ;
      StyleString = "" ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'" + sGXsfl_204_idx + "',204)\"" ;
      edtavCtltran_archivo_Filetype = "tmp" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltran_archivo_Internalname, "Filetype", edtavCtltran_archivo_Filetype, !bGXsfl_204_Refreshing);
      if ( ! (GXutil.strcmp("", ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo())==0) )
      {
         gxblobfileaux.setSource( ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo() );
         if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavCtltran_archivo_Filetype, "tmp") != 0 ) )
         {
            gxblobfileaux.setExt(GXutil.trim( edtavCtltran_archivo_Filetype));
         }
         if ( gxblobfileaux.getErrCode() == 0 )
         {
            ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).setgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo( gxblobfileaux.getAbsoluteName() );
            edtavCtltran_archivo_Filetype = gxblobfileaux.getExtension() ;
            httpContext.ajax_rsp_assign_prop("", false, edtavCtltran_archivo_Internalname, "Filetype", edtavCtltran_archivo_Filetype, !bGXsfl_204_Refreshing);
            gxblobfileaux.setBlobToDelete();
         }
         httpContext.ajax_rsp_assign_prop("", false, edtavCtltran_archivo_Internalname, "URL", httpContext.getResourceRelative(((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo()), !bGXsfl_204_Refreshing);
      }
      Grid1Row.AddColumnProperties("blob", 2, isAjaxCallMode( ), new Object[] {edtavCtltran_archivo_Internalname,GXutil.rtrim( ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo()),httpContext.getResourceRelative(((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo()),((GXutil.strcmp("", edtavCtltran_archivo_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavCtltran_archivo_Filetype)==0) ? ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo() : edtavCtltran_archivo_Filetype)) : edtavCtltran_archivo_Contenttype),new Boolean(false),"",edtavCtltran_archivo_Parameters,new Integer(0),new Integer(1),new Integer(-1),"","",new Integer(0),new Integer(1),new Integer(80),"px",new Integer(17),"px",new Integer(0),new Integer(0),new Integer(0),edtavCtltran_archivo_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'",StyleString,ClassString,"",""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,207);\"","",""});
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLTRAN_NRO_DOCUMENTO"+"_"+sGXsfl_204_idx, getSecureSignedToken( sGXsfl_204_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_nro_documento()), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLTRAN_DESCRIP_DOCUMENTO"+"_"+sGXsfl_204_idx, getSecureSignedToken( sGXsfl_204_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_descrip_documento(), ""))));
      GXCCtl = "CTLTRAN_ARCHIVO_" + sGXsfl_204_idx ;
      GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, ((com.orions2.SdtSDTDocumentos_SDTDocumentosItem)AV93SDTDocumentos.elementAt(-1+AV104GXV1)).getgxTv_SdtSDTDocumentos_SDTDocumentosItem_Tran_archivo());
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_204_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_204_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_204_idx+1)) ;
      sGXsfl_204_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_204_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2042( ) ;
      /* End function sendrow_2042 */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      dynavTran_regionid.setInternalname( "vTRAN_REGIONID" );
      cmbavTran_centrocostoid.setInternalname( "vTRAN_CENTROCOSTOID" );
      imgImage7_Internalname = "IMAGE7" ;
      edtavTran_codigomovimiento_Internalname = "vTRAN_CODIGOMOVIMIENTO" ;
      edtavTran_descripcionmovimiento_Internalname = "vTRAN_DESCRIPCIONMOVIMIENTO" ;
      divTable5_Internalname = "TABLE5" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      dynavTran_moduloorigen.setInternalname( "vTRAN_MODULOORIGEN" );
      imgImage8_Internalname = "IMAGE8" ;
      edtavPtran_codalmaorigen_Internalname = "vPTRAN_CODALMAORIGEN" ;
      edtavAlmaorigendescri_Internalname = "vALMAORIGENDESCRI" ;
      imgImage9_Internalname = "IMAGE9" ;
      edtavPtran_codbodeorigen_Internalname = "vPTRAN_CODBODEORIGEN" ;
      edtavBode_descripcionorigen_Internalname = "vBODE_DESCRIPCIONORIGEN" ;
      imgImage4_Internalname = "IMAGE4" ;
      edtavCuen_cedulaorigen_Internalname = "vCUEN_CEDULAORIGEN" ;
      edtavTran_nombcuentadanteorigen_Internalname = "vTRAN_NOMBCUENTADANTEORIGEN" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavCuen_cedula_Internalname = "vCUEN_CEDULA" ;
      edtavNombreproveedor_Internalname = "vNOMBREPROVEEDOR" ;
      divTable3_Internalname = "TABLE3" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      dynavTran_regioniddestino.setInternalname( "vTRAN_REGIONIDDESTINO" );
      cmbavTran_centrocostoiddestino.setInternalname( "vTRAN_CENTROCOSTOIDDESTINO" );
      cmbavTran_modulodestino.setInternalname( "vTRAN_MODULODESTINO" );
      imgImage10_Internalname = "IMAGE10" ;
      edtavPtran_codalmadestino_Internalname = "vPTRAN_CODALMADESTINO" ;
      edtavAlma_descripciondestino_Internalname = "vALMA_DESCRIPCIONDESTINO" ;
      imgImage11_Internalname = "IMAGE11" ;
      edtavPtran_codbodedestino_Internalname = "vPTRAN_CODBODEDESTINO" ;
      edtavBode_descripciondestino_Internalname = "vBODE_DESCRIPCIONDESTINO" ;
      imgImagecuentadante_Internalname = "IMAGECUENTADANTE" ;
      edtavCuen_ceduladestino_Internalname = "vCUEN_CEDULADESTINO" ;
      edtavTran_nombcuentadantedestino_Internalname = "vTRAN_NOMBCUENTADANTEDESTINO" ;
      divTable2_Internalname = "TABLE2" ;
      dynavTran_tipoingreso.setInternalname( "vTRAN_TIPOINGRESO" );
      edtavTran_numeroingreso_Internalname = "vTRAN_NUMEROINGRESO" ;
      edtavTran_fechaingreso_Internalname = "vTRAN_FECHAINGRESO" ;
      cmbavTran_detalle.setInternalname( "vTRAN_DETALLE" );
      cmbavTran_tipoentra.setInternalname( "vTRAN_TIPOENTRA" );
      imgImage2_Internalname = "IMAGE2" ;
      edtavArea_codigo_Internalname = "vAREA_CODIGO" ;
      edtavArea_descripcion_Internalname = "vAREA_DESCRIPCION" ;
      imgImage3_Internalname = "IMAGE3" ;
      edtavCurs_codigo_Internalname = "vCURS_CODIGO" ;
      edtavCurs_descripcion_Internalname = "vCURS_DESCRIPCION" ;
      imgImage5_Internalname = "IMAGE5" ;
      edtavCuen_cedularespons_Internalname = "vCUEN_CEDULARESPONS" ;
      edtavTran_nombrecuentadanteresponsabilidad_Internalname = "vTRAN_NOMBRECUENTADANTERESPONSABILIDAD" ;
      imgImage6_Internalname = "IMAGE6" ;
      edtavTran_transaccresponsabilidad_Internalname = "vTRAN_TRANSACCRESPONSABILIDAD" ;
      edtavTran_fecharesponsabilidad_Internalname = "vTRAN_FECHARESPONSABILIDAD" ;
      cmbavTran_entidadgobierno.setInternalname( "vTRAN_ENTIDADGOBIERNO" );
      edtavTran_observaciones_Internalname = "vTRAN_OBSERVACIONES" ;
      divTable4_Internalname = "TABLE4" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtavCtltran_nro_documento_Internalname = "CTLTRAN_NRO_DOCUMENTO" ;
      edtavCtltran_descrip_documento_Internalname = "CTLTRAN_DESCRIP_DOCUMENTO" ;
      edtavCtltran_archivo_Internalname = "CTLTRAN_ARCHIVO" ;
      divTable6_Internalname = "TABLE6" ;
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
      edtavCtltran_archivo_Jsonclick = "" ;
      edtavCtltran_archivo_Parameters = "" ;
      edtavCtltran_archivo_Contenttype = "" ;
      edtavCtltran_archivo_Filetype = "" ;
      edtavCtltran_descrip_documento_Jsonclick = "" ;
      edtavCtltran_nro_documento_Jsonclick = "" ;
      edtavCtltran_descrip_documento_Enabled = -1 ;
      edtavCtltran_nro_documento_Enabled = -1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Height = 8 ;
      subGrid1_Width = 25 ;
      edtavCtltran_descrip_documento_Enabled = 0 ;
      edtavCtltran_nro_documento_Enabled = 0 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavTran_observaciones_Enabled = 1 ;
      cmbavTran_entidadgobierno.setJsonclick( "" );
      cmbavTran_entidadgobierno.setEnabled( 1 );
      edtavTran_fecharesponsabilidad_Jsonclick = "" ;
      edtavTran_fecharesponsabilidad_Enabled = 1 ;
      edtavTran_fecharesponsabilidad_Visible = 1 ;
      edtavTran_transaccresponsabilidad_Jsonclick = "" ;
      edtavTran_transaccresponsabilidad_Enabled = 1 ;
      edtavTran_transaccresponsabilidad_Visible = 1 ;
      imgImage6_Visible = 1 ;
      edtavTran_nombrecuentadanteresponsabilidad_Jsonclick = "" ;
      edtavTran_nombrecuentadanteresponsabilidad_Enabled = 1 ;
      edtavTran_nombrecuentadanteresponsabilidad_Visible = 1 ;
      edtavCuen_cedularespons_Jsonclick = "" ;
      edtavCuen_cedularespons_Enabled = 1 ;
      edtavCuen_cedularespons_Visible = 1 ;
      imgImage5_Visible = 1 ;
      edtavCurs_descripcion_Jsonclick = "" ;
      edtavCurs_descripcion_Enabled = 1 ;
      edtavCurs_descripcion_Visible = 1 ;
      edtavCurs_codigo_Jsonclick = "" ;
      edtavCurs_codigo_Enabled = 1 ;
      edtavCurs_codigo_Visible = 1 ;
      imgImage3_Visible = 1 ;
      edtavArea_descripcion_Jsonclick = "" ;
      edtavArea_descripcion_Enabled = 1 ;
      edtavArea_descripcion_Visible = 1 ;
      edtavArea_codigo_Jsonclick = "" ;
      edtavArea_codigo_Enabled = 1 ;
      edtavArea_codigo_Visible = 1 ;
      imgImage2_Visible = 1 ;
      cmbavTran_tipoentra.setJsonclick( "" );
      cmbavTran_tipoentra.setEnabled( 1 );
      cmbavTran_tipoentra.setVisible( 1 );
      cmbavTran_detalle.setJsonclick( "" );
      cmbavTran_detalle.setEnabled( 1 );
      cmbavTran_detalle.setVisible( 1 );
      edtavTran_fechaingreso_Jsonclick = "" ;
      edtavTran_fechaingreso_Enabled = 1 ;
      edtavTran_fechaingreso_Visible = 1 ;
      edtavTran_numeroingreso_Jsonclick = "" ;
      edtavTran_numeroingreso_Enabled = 1 ;
      edtavTran_numeroingreso_Visible = 1 ;
      dynavTran_tipoingreso.setJsonclick( "" );
      dynavTran_tipoingreso.setEnabled( 1 );
      dynavTran_tipoingreso.setVisible( 1 );
      dynavTran_tipoingreso.setCaption( "Tipo de Ingreso" );
      edtavTran_nombcuentadantedestino_Jsonclick = "" ;
      edtavTran_nombcuentadantedestino_Enabled = 1 ;
      edtavCuen_ceduladestino_Jsonclick = "" ;
      edtavCuen_ceduladestino_Enabled = 1 ;
      imgImagecuentadante_Visible = 1 ;
      edtavBode_descripciondestino_Jsonclick = "" ;
      edtavBode_descripciondestino_Enabled = 1 ;
      edtavPtran_codbodedestino_Jsonclick = "" ;
      edtavPtran_codbodedestino_Enabled = 1 ;
      edtavAlma_descripciondestino_Jsonclick = "" ;
      edtavAlma_descripciondestino_Enabled = 1 ;
      edtavPtran_codalmadestino_Jsonclick = "" ;
      edtavPtran_codalmadestino_Enabled = 1 ;
      cmbavTran_modulodestino.setJsonclick( "" );
      cmbavTran_modulodestino.setEnabled( 1 );
      cmbavTran_centrocostoiddestino.setJsonclick( "" );
      cmbavTran_centrocostoiddestino.setEnabled( 1 );
      cmbavTran_centrocostoiddestino.setVisible( 1 );
      dynavTran_regioniddestino.setJsonclick( "" );
      dynavTran_regioniddestino.setEnabled( 1 );
      dynavTran_regioniddestino.setVisible( 1 );
      edtavNombreproveedor_Jsonclick = "" ;
      edtavNombreproveedor_Enabled = 1 ;
      edtavNombreproveedor_Visible = 1 ;
      edtavCuen_cedula_Jsonclick = "" ;
      edtavCuen_cedula_Enabled = 1 ;
      edtavCuen_cedula_Visible = 1 ;
      imgImage1_Visible = 1 ;
      edtavTran_nombcuentadanteorigen_Jsonclick = "" ;
      edtavTran_nombcuentadanteorigen_Enabled = 1 ;
      edtavTran_nombcuentadanteorigen_Visible = 1 ;
      edtavCuen_cedulaorigen_Jsonclick = "" ;
      edtavCuen_cedulaorigen_Enabled = 1 ;
      edtavCuen_cedulaorigen_Visible = 1 ;
      imgImage4_Visible = 1 ;
      edtavBode_descripcionorigen_Jsonclick = "" ;
      edtavBode_descripcionorigen_Enabled = 1 ;
      edtavPtran_codbodeorigen_Jsonclick = "" ;
      edtavPtran_codbodeorigen_Enabled = 1 ;
      edtavAlmaorigendescri_Jsonclick = "" ;
      edtavAlmaorigendescri_Enabled = 1 ;
      edtavPtran_codalmaorigen_Jsonclick = "" ;
      edtavPtran_codalmaorigen_Enabled = 1 ;
      dynavTran_moduloorigen.setJsonclick( "" );
      dynavTran_moduloorigen.setEnabled( 1 );
      edtavTran_descripcionmovimiento_Jsonclick = "" ;
      edtavTran_descripcionmovimiento_Enabled = 1 ;
      edtavTran_codigomovimiento_Jsonclick = "" ;
      edtavTran_codigomovimiento_Enabled = 1 ;
      cmbavTran_centrocostoid.setJsonclick( "" );
      cmbavTran_centrocostoid.setEnabled( 1 );
      dynavTran_regionid.setJsonclick( "" );
      dynavTran_regionid.setEnabled( 1 );
      Alertify1_Textcancel = "Cancelar" ;
      Alertify1_Textok = "Confirmar" ;
      Alertify1_Textmessage = "" ;
      Alertify1_Type = "alert" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Transaccion" );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void validv_Tran_regionid( String GX_Parm1 ,
                                     com.genexus.webpanels.HTMLChoice GX_Parm2 ,
                                     com.genexus.webpanels.HTMLChoice GX_Parm3 ,
                                     com.genexus.webpanels.HTMLChoice GX_Parm4 )
   {
      AV61Tran_CodigoMovimiento = GX_Parm1 ;
      cmbavTran_centrocostoid = GX_Parm2 ;
      AV55Tran_CentroCostoId = GXutil.lval( cmbavTran_centrocostoid.getValue()) ;
      dynavTran_regionid = GX_Parm3 ;
      AV77Tran_RegionId = GXutil.lval( dynavTran_regionid.getValue()) ;
      dynavTran_moduloorigen = GX_Parm4 ;
      AV71Tran_ModuloOrigen = dynavTran_moduloorigen.getValue() ;
      gxvvtran_moduloorigen_html632( AV61Tran_CodigoMovimiento, AV55Tran_CentroCostoId, AV77Tran_RegionId) ;
      dynload_actions( ) ;
      if ( dynavTran_moduloorigen.getItemCount() > 0 )
      {
         AV71Tran_ModuloOrigen = dynavTran_moduloorigen.getValidValue(AV71Tran_ModuloOrigen) ;
      }
      dynavTran_moduloorigen.setValue( AV71Tran_ModuloOrigen );
      isValidOutput.add(dynavTran_moduloorigen);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void validv_Tran_centrocostoid( String GX_Parm1 ,
                                          com.genexus.webpanels.HTMLChoice GX_Parm2 ,
                                          com.genexus.webpanels.HTMLChoice GX_Parm3 ,
                                          com.genexus.webpanels.HTMLChoice GX_Parm4 )
   {
      AV61Tran_CodigoMovimiento = GX_Parm1 ;
      cmbavTran_centrocostoid = GX_Parm2 ;
      AV55Tran_CentroCostoId = GXutil.lval( cmbavTran_centrocostoid.getValue()) ;
      dynavTran_regionid = GX_Parm3 ;
      AV77Tran_RegionId = GXutil.lval( dynavTran_regionid.getValue()) ;
      dynavTran_moduloorigen = GX_Parm4 ;
      AV71Tran_ModuloOrigen = dynavTran_moduloorigen.getValue() ;
      gxvvtran_moduloorigen_html632( AV61Tran_CodigoMovimiento, AV55Tran_CentroCostoId, AV77Tran_RegionId) ;
      dynload_actions( ) ;
      if ( dynavTran_moduloorigen.getItemCount() > 0 )
      {
         AV71Tran_ModuloOrigen = dynavTran_moduloorigen.getValidValue(AV71Tran_ModuloOrigen) ;
      }
      dynavTran_moduloorigen.setValue( AV71Tran_ModuloOrigen );
      isValidOutput.add(dynavTran_moduloorigen);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      isValidOutput.add(httpContext.ajax_rspGetHiddens( ));
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void validv_Tran_codigomovimiento( String GX_Parm1 ,
                                             com.genexus.webpanels.HTMLChoice GX_Parm2 ,
                                             com.genexus.webpanels.HTMLChoice GX_Parm3 ,
                                             com.genexus.webpanels.HTMLChoice GX_Parm4 ,
                                             com.genexus.webpanels.HTMLChoice GX_Parm5 )
   {
      AV61Tran_CodigoMovimiento = GX_Parm1 ;
      cmbavTran_centrocostoid = GX_Parm2 ;
      AV55Tran_CentroCostoId = GXutil.lval( cmbavTran_centrocostoid.getValue()) ;
      dynavTran_regionid = GX_Parm3 ;
      AV77Tran_RegionId = GXutil.lval( dynavTran_regionid.getValue()) ;
      dynavTran_moduloorigen = GX_Parm4 ;
      AV71Tran_ModuloOrigen = dynavTran_moduloorigen.getValue() ;
      dynavTran_tipoingreso = GX_Parm5 ;
      AV80Tran_TipoIngreso = GXutil.lval( dynavTran_tipoingreso.getValue()) ;
      gxvvtran_moduloorigen_html632( AV61Tran_CodigoMovimiento, AV55Tran_CentroCostoId, AV77Tran_RegionId) ;
      gxvvtran_tipoingreso_html632( AV61Tran_CodigoMovimiento) ;
      dynload_actions( ) ;
      if ( dynavTran_moduloorigen.getItemCount() > 0 )
      {
         AV71Tran_ModuloOrigen = dynavTran_moduloorigen.getValidValue(AV71Tran_ModuloOrigen) ;
      }
      dynavTran_moduloorigen.setValue( AV71Tran_ModuloOrigen );
      isValidOutput.add(dynavTran_moduloorigen);
      if ( dynavTran_tipoingreso.getItemCount() > 0 )
      {
         AV80Tran_TipoIngreso = GXutil.lval( dynavTran_tipoingreso.getValidValue(GXutil.trim( GXutil.str( AV80Tran_TipoIngreso, 11, 0)))) ;
      }
      dynavTran_tipoingreso.setValue( GXutil.trim( GXutil.str( AV80Tran_TipoIngreso, 11, 0)) );
      isValidOutput.add(dynavTran_tipoingreso);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV93SDTDocumentos',fld:'vSDTDOCUMENTOS',grid:204,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("VTRAN_REGIONID.ISVALID","{handler:'e18632',iparms:[{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV84Tran_DescripcionMovimiento',fld:'vTRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'A23Usua_Id',fld:'USUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV20IdUsuario',fld:'vIDUSUARIO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavTran_regionid'},{av:'AV77Tran_RegionId',fld:'vTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A3Cent_Codigo',fld:'CENT_CODIGO',pic:'',nv:''},{av:'A4Cent_Descripcion',fld:'CENT_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'cmbavTran_centrocostoid'},{av:'AV55Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV84Tran_DescripcionMovimiento',fld:'vTRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'AV10Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("VTRAN_CENTROCOSTOID.ISVALID","{handler:'e19632',iparms:[{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV84Tran_DescripcionMovimiento',fld:'vTRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV85AlmaOrigenDescri',fld:'vALMAORIGENDESCRI',pic:'@!',nv:''},{av:'AV87pTran_CodAlmaOrigen',fld:'vPTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV86Bode_DescripcionOrigen',fld:'vBODE_DESCRIPCIONORIGEN',pic:'@!',nv:''},{av:'AV88pTran_CodBodeOrigen',fld:'vPTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''}],oparms:[{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV84Tran_DescripcionMovimiento',fld:'vTRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV85AlmaOrigenDescri',fld:'vALMAORIGENDESCRI',pic:'@!',nv:''},{av:'AV87pTran_CodAlmaOrigen',fld:'vPTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV86Bode_DescripcionOrigen',fld:'vBODE_DESCRIPCIONORIGEN',pic:'@!',nv:''},{av:'AV88pTran_CodBodeOrigen',fld:'vPTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''}]}");
      setEventMetadata("'TIPOMOVIMIENTO'","{handler:'e34632',iparms:[{av:'dynavTran_regionid'},{av:'AV77Tran_RegionId',fld:'vTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavTran_centrocostoid'},{av:'AV55Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV84Tran_DescripcionMovimiento',fld:'vTRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''}]}");
      setEventMetadata("VTRAN_DESCRIPCIONMOVIMIENTO.ISVALID","{handler:'e20632',iparms:[{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV85AlmaOrigenDescri',fld:'vALMAORIGENDESCRI',pic:'@!',nv:''},{av:'AV87pTran_CodAlmaOrigen',fld:'vPTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV86Bode_DescripcionOrigen',fld:'vBODE_DESCRIPCIONORIGEN',pic:'@!',nv:''},{av:'AV88pTran_CodBodeOrigen',fld:'vPTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''},{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',nv:''},{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'A440Tpmo_IngresaAredante',fld:'TPMO_INGRESAAREDANTE',pic:'',nv:''},{av:'A441Tpmo_IngresaCurso',fld:'TPMO_INGRESACURSO',pic:'',nv:''},{av:'A315Tpmo_TipoE_S',fld:'TPMO_TIPOE_S',pic:'',nv:''},{av:'A480Tipo_Tipo',fld:'TIPO_TIPO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A705Tpmo_SolicitaRegionDestino',fld:'TPMO_SOLICITAREGIONDESTINO',pic:'',nv:''},{av:'A706Tpmo_SolicitaCentroDestino',fld:'TPMO_SOLICITACENTRODESTINO',pic:'',nv:''},{av:'A680Tpmo_CuentaResponsabilidad',fld:'TPMO_CUENTARESPONSABILIDAD',pic:'',nv:''},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavTran_centrocostoid'},{av:'AV55Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A3Cent_Codigo',fld:'CENT_CODIGO',pic:'',nv:''},{av:'AV13Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV26NombreProveedor',fld:'vNOMBREPROVEEDOR',pic:'',nv:''},{av:'AV10Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavTran_regionid'},{av:'AV77Tran_RegionId',fld:'vTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A4Cent_Descripcion',fld:'CENT_DESCRIPCION',pic:'',nv:''},{av:'AV93SDTDocumentos',fld:'vSDTDOCUMENTOS',grid:204,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0}],oparms:[{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV85AlmaOrigenDescri',fld:'vALMAORIGENDESCRI',pic:'@!',nv:''},{av:'AV87pTran_CodAlmaOrigen',fld:'vPTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV86Bode_DescripcionOrigen',fld:'vBODE_DESCRIPCIONORIGEN',pic:'@!',nv:''},{av:'AV88pTran_CodBodeOrigen',fld:'vPTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV23Ind_E_S',fld:'vIND_E_S',pic:'',nv:''},{av:'AV25Ind_Tipo',fld:'vIND_TIPO',pic:'',nv:''},{av:'AV53Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV27RegionDestino',fld:'vREGIONDESTINO',pic:'',nv:''},{av:'AV11CentroCDestino',fld:'vCENTROCDESTINO',pic:'',nv:''},{av:'dynavTran_tipoingreso'},{av:'edtavTran_fechaingreso_Visible',ctrl:'vTRAN_FECHAINGRESO',prop:'Visible'},{av:'edtavTran_numeroingreso_Visible',ctrl:'vTRAN_NUMEROINGRESO',prop:'Visible'},{av:'imgImage5_Visible',ctrl:'IMAGE5',prop:'Visible'},{av:'edtavCuen_cedularespons_Visible',ctrl:'vCUEN_CEDULARESPONS',prop:'Visible'},{av:'edtavTran_nombrecuentadanteresponsabilidad_Visible',ctrl:'vTRAN_NOMBRECUENTADANTERESPONSABILIDAD',prop:'Visible'},{av:'imgImage6_Visible',ctrl:'IMAGE6',prop:'Visible'},{av:'edtavTran_transaccresponsabilidad_Visible',ctrl:'vTRAN_TRANSACCRESPONSABILIDAD',prop:'Visible'},{av:'edtavTran_fecharesponsabilidad_Visible',ctrl:'vTRAN_FECHARESPONSABILIDAD',prop:'Visible'},{av:'cmbavTran_detalle'},{av:'imgImage4_Visible',ctrl:'IMAGE4',prop:'Visible'},{av:'edtavCuen_cedulaorigen_Visible',ctrl:'vCUEN_CEDULAORIGEN',prop:'Visible'},{av:'edtavTran_nombcuentadanteorigen_Visible',ctrl:'vTRAN_NOMBCUENTADANTEORIGEN',prop:'Visible'},{av:'edtavCuen_cedula_Visible',ctrl:'vCUEN_CEDULA',prop:'Visible'},{av:'imgImage1_Visible',ctrl:'IMAGE1',prop:'Visible'},{av:'edtavNombreproveedor_Visible',ctrl:'vNOMBREPROVEEDOR',prop:'Visible'},{av:'AV26NombreProveedor',fld:'vNOMBREPROVEEDOR',pic:'',nv:''},{av:'AV13Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'edtavArea_codigo_Visible',ctrl:'vAREA_CODIGO',prop:'Visible'},{av:'edtavArea_descripcion_Visible',ctrl:'vAREA_DESCRIPCION',prop:'Visible'},{av:'imgImage2_Visible',ctrl:'IMAGE2',prop:'Visible'},{av:'edtavCurs_codigo_Visible',ctrl:'vCURS_CODIGO',prop:'Visible'},{av:'edtavCurs_descripcion_Visible',ctrl:'vCURS_DESCRIPCION',prop:'Visible'},{av:'AV17Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''},{av:'AV18Curs_Descripcion',fld:'vCURS_DESCRIPCION',pic:'',nv:''},{av:'imgImage3_Visible',ctrl:'IMAGE3',prop:'Visible'},{av:'dynavTran_regioniddestino'},{av:'cmbavTran_centrocostoiddestino'},{av:'AV56Tran_CentroCostoIdDestino',fld:'vTRAN_CENTROCOSTOIDDESTINO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV93SDTDocumentos',fld:'vSDTDOCUMENTOS',grid:204,pic:'',nv:null}]}");
      setEventMetadata("VTRAN_MODULOORIGEN.ISVALID","{handler:'e21632',iparms:[{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV85AlmaOrigenDescri',fld:'vALMAORIGENDESCRI',pic:'@!',nv:''},{av:'AV87pTran_CodAlmaOrigen',fld:'vPTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV86Bode_DescripcionOrigen',fld:'vBODE_DESCRIPCIONORIGEN',pic:'@!',nv:''},{av:'AV88pTran_CodBodeOrigen',fld:'vPTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''}],oparms:[{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV85AlmaOrigenDescri',fld:'vALMAORIGENDESCRI',pic:'@!',nv:''},{av:'AV87pTran_CodAlmaOrigen',fld:'vPTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV86Bode_DescripcionOrigen',fld:'vBODE_DESCRIPCIONORIGEN',pic:'@!',nv:''},{av:'AV88pTran_CodBodeOrigen',fld:'vPTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''}]}");
      setEventMetadata("'ALMAORIGEN'","{handler:'e35632',iparms:[{av:'dynavTran_regionid'},{av:'AV77Tran_RegionId',fld:'vTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavTran_centrocostoid'},{av:'AV55Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'dynavTran_moduloorigen'},{av:'AV71Tran_ModuloOrigen',fld:'vTRAN_MODULOORIGEN',pic:'',nv:''}],oparms:[{av:'AV95SWError6',fld:'vSWERROR6',pic:'ZZZ9',nv:0},{av:'AV87pTran_CodAlmaOrigen',fld:'vPTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV85AlmaOrigenDescri',fld:'vALMAORIGENDESCRI',pic:'@!',nv:''},{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''}]}");
      setEventMetadata("'BODEGAORIGEN'","{handler:'e22632',iparms:[{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV86Bode_DescripcionOrigen',fld:'vBODE_DESCRIPCIONORIGEN',pic:'@!',nv:''},{av:'AV88pTran_CodBodeOrigen',fld:'vPTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV87pTran_CodAlmaOrigen',fld:'vPTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'dynavTran_moduloorigen'},{av:'AV71Tran_ModuloOrigen',fld:'vTRAN_MODULOORIGEN',pic:'',nv:''},{av:'AV23Ind_E_S',fld:'vIND_E_S',pic:'',nv:''},{av:'cmbavTran_centrocostoid'},{av:'AV55Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV66Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'dynavTran_regionid'},{av:'AV77Tran_RegionId',fld:'vTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''}],oparms:[{av:'AV95SWError6',fld:'vSWERROR6',pic:'ZZZ9',nv:0},{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV86Bode_DescripcionOrigen',fld:'vBODE_DESCRIPCIONORIGEN',pic:'@!',nv:''},{av:'AV88pTran_CodBodeOrigen',fld:'vPTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV15Cuen_CedulaOrigen',fld:'vCUEN_CEDULAORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV73Tran_NombCuentadanteOrigen',fld:'vTRAN_NOMBCUENTADANTEORIGEN',pic:'@!',nv:''},{av:'AV66Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'imgImage4_Visible',ctrl:'IMAGE4',prop:'Visible'},{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''}]}");
      setEventMetadata("'CUENTADANTEORIGEN'","{handler:'e36632',iparms:[],oparms:[{av:'AV43SWError1',fld:'vSWERROR1',pic:'ZZZ9',nv:0},{av:'AV15Cuen_CedulaOrigen',fld:'vCUEN_CEDULAORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV73Tran_NombCuentadanteOrigen',fld:'vTRAN_NOMBCUENTADANTEORIGEN',pic:'@!',nv:''},{av:'AV66Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'PROVEEDOR'","{handler:'e11631',iparms:[{av:'AV68Tran_IdProveedor',fld:'vTRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV26NombreProveedor',fld:'vNOMBREPROVEEDOR',pic:'',nv:''},{av:'AV13Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV43SWError1',fld:'vSWERROR1',pic:'ZZZ9',nv:0},{av:'AV13Cuen_Cedula',fld:'vCUEN_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV26NombreProveedor',fld:'vNOMBREPROVEEDOR',pic:'',nv:''},{av:'AV68Tran_IdProveedor',fld:'vTRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VBODE_DESCRIPCIONORIGEN.ISVALID","{handler:'e23632',iparms:[{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'dynavTran_regionid'},{av:'AV77Tran_RegionId',fld:'vTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavTran_centrocostoid'},{av:'AV55Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'dynavTran_moduloorigen'},{av:'AV71Tran_ModuloOrigen',fld:'vTRAN_MODULOORIGEN',pic:'',nv:''},{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''}],oparms:[{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'cmbavTran_modulodestino'},{av:'AV70Tran_ModuloDestino',fld:'vTRAN_MODULODESTINO',pic:'',nv:''}]}");
      setEventMetadata("VTRAN_MODULODESTINO.ISVALID","{handler:'e24632',iparms:[{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV88pTran_CodBodeOrigen',fld:'vPTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV85AlmaOrigenDescri',fld:'vALMAORIGENDESCRI',pic:'@!',nv:''},{av:'AV23Ind_E_S',fld:'vIND_E_S',pic:'',nv:''},{av:'dynavTran_moduloorigen'},{av:'AV71Tran_ModuloOrigen',fld:'vTRAN_MODULOORIGEN',pic:'',nv:''},{av:'AV68Tran_IdProveedor',fld:'vTRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV86Bode_DescripcionOrigen',fld:'vBODE_DESCRIPCIONORIGEN',pic:'@!',nv:''},{av:'AV66Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41SWBien',fld:'vSWBIEN',pic:'ZZZ9',nv:0},{av:'A410Invd_RegionalId',fld:'INVD_REGIONALID',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavTran_regionid'},{av:'AV77Tran_RegionId',fld:'vTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A411Invd_CentroCostoId',fld:'INVD_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavTran_centrocostoid'},{av:'AV55Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A412Invd_ModuloAlmacen',fld:'INVD_MODULOALMACEN',pic:'',nv:''},{av:'A413Invd_AlmacenCodigo',fld:'INVD_ALMACENCODIGO',pic:'',nv:''},{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'A414Invd_BodegaCodigo',fld:'INVD_BODEGACODIGO',pic:'',nv:''},{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV53Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A43Cuen_Identificacion',fld:'CUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV43SWError1',fld:'vSWERROR1',pic:'ZZZ9',nv:0},{av:'AV96SWError7',fld:'vSWERROR7',pic:'ZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV41SWBien',fld:'vSWBIEN',pic:'ZZZ9',nv:0}]}");
      setEventMetadata("'CUENTADANTE'","{handler:'e13631',iparms:[],oparms:[{av:'AV47SWError5',fld:'vSWERROR5',pic:'ZZZ9',nv:0},{av:'AV14Cuen_CedulaDestino',fld:'vCUEN_CEDULADESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV72Tran_NombCuentadanteDestino',fld:'vTRAN_NOMBCUENTADANTEDESTINO',pic:'@!',nv:''},{av:'AV65Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VTRAN_REGIONIDDESTINO.ISVALID","{handler:'e25632',iparms:[{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''},{av:'A2Regi_Id',fld:'REGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavTran_regioniddestino'},{av:'AV78Tran_RegionIdDestino',fld:'vTRAN_REGIONIDDESTINO',pic:'ZZZZZZZZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A3Cent_Codigo',fld:'CENT_CODIGO',pic:'',nv:''},{av:'A4Cent_Descripcion',fld:'CENT_DESCRIPCION',pic:'',nv:''}],oparms:[{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''},{av:'cmbavTran_centrocostoiddestino'},{av:'AV56Tran_CentroCostoIdDestino',fld:'vTRAN_CENTROCOSTOIDDESTINO',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'ALMADESTINO'","{handler:'e12631',iparms:[{av:'dynavTran_regionid'},{av:'AV77Tran_RegionId',fld:'vTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavTran_centrocostoid'},{av:'AV55Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'dynavTran_moduloorigen'},{av:'AV71Tran_ModuloOrigen',fld:'vTRAN_MODULOORIGEN',pic:'',nv:''},{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'cmbavTran_modulodestino'},{av:'AV70Tran_ModuloDestino',fld:'vTRAN_MODULODESTINO',pic:'',nv:''}],oparms:[{av:'AV97SWError8',fld:'vSWERROR8',pic:'ZZZ9',nv:0},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV89Alma_DescripcionDestino',fld:'vALMA_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''}]}");
      setEventMetadata("'BODEDESTINO'","{handler:'e26632',iparms:[{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV90pTran_CodAlmaDestino',fld:'vPTRAN_CODALMADESTINO',pic:'',nv:''},{av:'cmbavTran_modulodestino'},{av:'AV70Tran_ModuloDestino',fld:'vTRAN_MODULODESTINO',pic:'',nv:''},{av:'AV65Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV72Tran_NombCuentadanteDestino',fld:'vTRAN_NOMBCUENTADANTEDESTINO',pic:'@!',nv:''},{av:'AV14Cuen_CedulaDestino',fld:'vCUEN_CEDULADESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11CentroCDestino',fld:'vCENTROCDESTINO',pic:'',nv:''},{av:'cmbavTran_centrocostoiddestino'},{av:'AV56Tran_CentroCostoIdDestino',fld:'vTRAN_CENTROCOSTOIDDESTINO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'cmbavTran_centrocostoid'},{av:'AV55Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavTran_regionid'},{av:'AV77Tran_RegionId',fld:'vTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'dynavTran_moduloorigen'},{av:'AV71Tran_ModuloOrigen',fld:'vTRAN_MODULOORIGEN',pic:'',nv:''},{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''}],oparms:[{av:'AV97SWError8',fld:'vSWERROR8',pic:'ZZZ9',nv:0},{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV91pTran_CodBodeDestino',fld:'vPTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'imgImagecuentadante_Visible',ctrl:'IMAGECUENTADANTE',prop:'Visible'},{av:'AV65Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV72Tran_NombCuentadanteDestino',fld:'vTRAN_NOMBCUENTADANTEDESTINO',pic:'@!',nv:''},{av:'AV14Cuen_CedulaDestino',fld:'vCUEN_CEDULADESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VTRAN_TIPOINGRESO.ISVALID","{handler:'e27632',iparms:[{av:'A38Tpmo_Codigo',fld:'TPMO_CODIGO',pic:'',nv:''},{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'A41Orig_Identificador',fld:'ORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavTran_tipoingreso'},{av:'AV80Tran_TipoIngreso',fld:'vTRAN_TIPOINGRESO',pic:'ZZZZZZZZZZ9',nv:0},{av:'A642Tpmo_SolicitaNumero',fld:'TPMO_SOLICITANUMERO',pic:'',nv:''},{av:'A643Tpmo_SolicitaFecha',fld:'TPMO_SOLICITAFECHA',pic:'',nv:''},{av:'AV23Ind_E_S',fld:'vIND_E_S',pic:'',nv:''}],oparms:[{av:'edtavTran_numeroingreso_Visible',ctrl:'vTRAN_NUMEROINGRESO',prop:'Visible'},{av:'edtavTran_fechaingreso_Visible',ctrl:'vTRAN_FECHAINGRESO',prop:'Visible'},{av:'imgImage5_Visible',ctrl:'IMAGE5',prop:'Visible'},{av:'edtavCuen_cedularespons_Visible',ctrl:'vCUEN_CEDULARESPONS',prop:'Visible'},{av:'edtavTran_nombrecuentadanteresponsabilidad_Visible',ctrl:'vTRAN_NOMBRECUENTADANTERESPONSABILIDAD',prop:'Visible'},{av:'imgImage6_Visible',ctrl:'IMAGE6',prop:'Visible'},{av:'edtavTran_transaccresponsabilidad_Visible',ctrl:'vTRAN_TRANSACCRESPONSABILIDAD',prop:'Visible'},{av:'edtavTran_fecharesponsabilidad_Visible',ctrl:'vTRAN_FECHARESPONSABILIDAD',prop:'Visible'}]}");
      setEventMetadata("VTRAN_FECHAINGRESO.ISVALID","{handler:'e28632',iparms:[{av:'AV63Tran_FechaIngreso',fld:'vTRAN_FECHAINGRESO',pic:'',nv:''},{av:'Gx_date',fld:'vTODAY',pic:'',nv:''}],oparms:[{av:'AV44SWError2',fld:'vSWERROR2',pic:'ZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'}]}");
      setEventMetadata("VTRAN_DETALLE.ISVALID","{handler:'e29632',iparms:[{av:'cmbavTran_tipoentra'},{av:'AV79Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV25Ind_Tipo',fld:'vIND_TIPO',pic:'',nv:''},{av:'AV23Ind_E_S',fld:'vIND_E_S',pic:'',nv:''},{av:'cmbavTran_detalle'},{av:'AV62Tran_detalle',fld:'vTRAN_DETALLE',pic:'',nv:''},{av:'AV65Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''}],oparms:[{av:'cmbavTran_tipoentra'},{av:'AV79Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV47SWError5',fld:'vSWERROR5',pic:'ZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'}]}");
      setEventMetadata("'CURSO'","{handler:'e15631',iparms:[{av:'AV10Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}],oparms:[{av:'AV46SWError4',fld:'vSWERROR4',pic:'ZZZ9',nv:0},{av:'AV18Curs_Descripcion',fld:'vCURS_DESCRIPCION',pic:'',nv:''},{av:'AV17Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("'AREADANTE'","{handler:'e14631',iparms:[{av:'AV10Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}],oparms:[{av:'AV45SWError3',fld:'vSWERROR3',pic:'ZZZ9',nv:0},{av:'AV7Area_Descripcion',fld:'vAREA_DESCRIPCION',pic:'',nv:''},{av:'AV6Area_Codigo',fld:'vAREA_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("'RESPONSABILIDAD'","{handler:'e16631',iparms:[],oparms:[{av:'AV98SWError9',fld:'vSWERROR9',pic:'ZZZ9',nv:0},{av:'AV16Cuen_CedulaRespons',fld:'vCUEN_CEDULARESPONS',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV74Tran_NombreCuentadanteResponsabilidad',fld:'vTRAN_NOMBRECUENTADANTERESPONSABILIDAD',pic:'@!',nv:''},{av:'AV67Tran_IdCuentadanteResponsabilidad',fld:'vTRAN_IDCUENTADANTERESPONSABILIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'TRANSACCIóN'","{handler:'e30632',iparms:[{av:'AV16Cuen_CedulaRespons',fld:'vCUEN_CEDULARESPONS',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'cmbavTran_detalle'},{av:'AV62Tran_detalle',fld:'vTRAN_DETALLE',pic:'',nv:''},{av:'dynavTran_regionid'},{av:'AV77Tran_RegionId',fld:'vTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavTran_centrocostoid'},{av:'AV55Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV67Tran_IdCuentadanteResponsabilidad',fld:'vTRAN_IDCUENTADANTERESPONSABILIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV98SWError9',fld:'vSWERROR9',pic:'ZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV99SWError10',fld:'vSWERROR10',pic:'ZZZ9',nv:0},{av:'AV69Tran_IdResponsabilidad',fld:'vTRAN_IDRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV52Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0},{av:'AV64Tran_FechaResponsabilidad',fld:'vTRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'AV81Tran_TransaccResponsabilidad',fld:'vTRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VTRAN_OBSERVACIONES.ISVALID","{handler:'e31632',iparms:[{av:'AV6Area_Codigo',fld:'vAREA_CODIGO',pic:'',nv:''},{av:'imgImage2_Visible',ctrl:'IMAGE2',prop:'Visible'},{av:'cmbavTran_detalle'},{av:'AV62Tran_detalle',fld:'vTRAN_DETALLE',pic:'',nv:''},{av:'AV17Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''},{av:'imgImage3_Visible',ctrl:'IMAGE3',prop:'Visible'},{av:'AV16Cuen_CedulaRespons',fld:'vCUEN_CEDULARESPONS',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'imgImage5_Visible',ctrl:'IMAGE5',prop:'Visible'},{av:'AV81Tran_TransaccResponsabilidad',fld:'vTRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'imgImage6_Visible',ctrl:'IMAGE6',prop:'Visible'},{av:'cmbavTran_tipoentra'},{av:'AV79Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV25Ind_Tipo',fld:'vIND_TIPO',pic:'',nv:''},{av:'AV23Ind_E_S',fld:'vIND_E_S',pic:'',nv:''}],oparms:[{av:'AV45SWError3',fld:'vSWERROR3',pic:'ZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV46SWError4',fld:'vSWERROR4',pic:'ZZZ9',nv:0},{av:'AV98SWError9',fld:'vSWERROR9',pic:'ZZZ9',nv:0},{av:'AV99SWError10',fld:'vSWERROR10',pic:'ZZZ9',nv:0},{av:'AV100SWError11',fld:'vSWERROR11',pic:'ZZZ9',nv:0}]}");
      setEventMetadata("'CONFIRMAR'","{handler:'e32632',iparms:[{av:'AV42SWError',fld:'vSWERROR',pic:'ZZZ9',nv:0},{av:'AV43SWError1',fld:'vSWERROR1',pic:'ZZZ9',nv:0},{av:'AV44SWError2',fld:'vSWERROR2',pic:'ZZZ9',nv:0},{av:'AV45SWError3',fld:'vSWERROR3',pic:'ZZZ9',nv:0},{av:'AV46SWError4',fld:'vSWERROR4',pic:'ZZZ9',nv:0},{av:'AV47SWError5',fld:'vSWERROR5',pic:'ZZZ9',nv:0},{av:'AV95SWError6',fld:'vSWERROR6',pic:'ZZZ9',nv:0},{av:'AV96SWError7',fld:'vSWERROR7',pic:'ZZZ9',nv:0},{av:'AV97SWError8',fld:'vSWERROR8',pic:'ZZZ9',nv:0},{av:'AV98SWError9',fld:'vSWERROR9',pic:'ZZZ9',nv:0},{av:'AV99SWError10',fld:'vSWERROR10',pic:'ZZZ9',nv:0},{av:'AV100SWError11',fld:'vSWERROR11',pic:'ZZZ9',nv:0},{av:'AV6Area_Codigo',fld:'vAREA_CODIGO',pic:'',nv:''},{av:'AV36SDTNuevaTransaccion',fld:'vSDTNUEVATRANSACCION',pic:'',nv:null},{av:'cmbavTran_centrocostoid'},{av:'AV55Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV57Tran_CodAlmaDestino',fld:'vTRAN_CODALMADESTINO',pic:'',nv:''},{av:'AV58Tran_CodAlmaOrigen',fld:'vTRAN_CODALMAORIGEN',pic:'',nv:''},{av:'AV59Tran_CodBodeDestino',fld:'vTRAN_CODBODEDESTINO',pic:'',nv:''},{av:'AV60Tran_CodBodeOrigen',fld:'vTRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV61Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV17Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''},{av:'cmbavTran_detalle'},{av:'AV62Tran_detalle',fld:'vTRAN_DETALLE',pic:'',nv:''},{av:'AV65Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV66Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV68Tran_IdProveedor',fld:'vTRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV23Ind_E_S',fld:'vIND_E_S',pic:'',nv:''},{av:'dynavTran_moduloorigen'},{av:'AV71Tran_ModuloOrigen',fld:'vTRAN_MODULOORIGEN',pic:'',nv:''},{av:'cmbavTran_modulodestino'},{av:'AV70Tran_ModuloDestino',fld:'vTRAN_MODULODESTINO',pic:'',nv:''},{av:'AV75Tran_numeroIngreso',fld:'vTRAN_NUMEROINGRESO',pic:'',nv:''},{av:'AV76Tran_Observaciones',fld:'vTRAN_OBSERVACIONES',pic:'',nv:''},{av:'dynavTran_regionid'},{av:'AV77Tran_RegionId',fld:'vTRAN_REGIONID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25Ind_Tipo',fld:'vIND_TIPO',pic:'',nv:''},{av:'cmbavTran_tipoentra'},{av:'AV79Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'dynavTran_tipoingreso'},{av:'AV80Tran_TipoIngreso',fld:'vTRAN_TIPOINGRESO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV63Tran_FechaIngreso',fld:'vTRAN_FECHAINGRESO',pic:'',nv:''},{av:'AV20IdUsuario',fld:'vIDUSUARIO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV11CentroCDestino',fld:'vCENTROCDESTINO',pic:'',nv:''},{av:'cmbavTran_centrocostoiddestino'},{av:'AV56Tran_CentroCostoIdDestino',fld:'vTRAN_CENTROCOSTOIDDESTINO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV27RegionDestino',fld:'vREGIONDESTINO',pic:'',nv:''},{av:'dynavTran_regioniddestino'},{av:'AV78Tran_RegionIdDestino',fld:'vTRAN_REGIONIDDESTINO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV67Tran_IdCuentadanteResponsabilidad',fld:'vTRAN_IDCUENTADANTERESPONSABILIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV69Tran_IdResponsabilidad',fld:'vTRAN_IDRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV64Tran_FechaResponsabilidad',fld:'vTRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'AV52Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0},{av:'cmbavTran_entidadgobierno'},{av:'AV101Tran_EntidadGobierno',fld:'vTRAN_ENTIDADGOBIERNO',pic:'',nv:''},{av:'AV5Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV12ConsecutivoCC',fld:'vCONSECUTIVOCC',pic:'',nv:''},{av:'AV86Bode_DescripcionOrigen',fld:'vBODE_DESCRIPCIONORIGEN',pic:'@!',nv:''},{av:'AV92Bode_DescripcionDestino',fld:'vBODE_DESCRIPCIONDESTINO',pic:'@!',nv:''},{av:'AV85AlmaOrigenDescri',fld:'vALMAORIGENDESCRI',pic:'@!',nv:''}],oparms:[{av:'AV36SDTNuevaTransaccion',fld:'vSDTNUEVATRANSACCION',pic:'',nv:null},{av:'AV12ConsecutivoCC',fld:'vCONSECUTIVOCC',pic:'',nv:''},{av:'AV5Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'}]}");
      setEventMetadata("ALERTIFY1.OK","{handler:'e17632',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV93SDTDocumentos',fld:'vSDTDOCUMENTOS',grid:204,pic:'',nv:null},{av:'cmbavTran_detalle'},{av:'AV62Tran_detalle',fld:'vTRAN_DETALLE',pic:'',nv:''},{av:'AV5Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV23Ind_E_S',fld:'vIND_E_S',pic:'',nv:''},{av:'AV25Ind_Tipo',fld:'vIND_TIPO',pic:'',nv:''},{av:'cmbavTran_tipoentra'},{av:'AV79Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV52Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0},{av:'AV64Tran_FechaResponsabilidad',fld:'vTRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'AV69Tran_IdResponsabilidad',fld:'vTRAN_IDRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV16Cuen_CedulaRespons',fld:'vCUEN_CEDULARESPONS',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV52Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0},{av:'AV64Tran_FechaResponsabilidad',fld:'vTRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'AV69Tran_IdResponsabilidad',fld:'vTRAN_IDRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV16Cuen_CedulaRespons',fld:'vCUEN_CEDULARESPONS',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV5Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'CANCELAR'","{handler:'e33632',iparms:[],oparms:[]}");
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
      AV61Tran_CodigoMovimiento = "" ;
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV93SDTDocumentos = new GXBaseCollection<com.orions2.SdtSDTDocumentos_SDTDocumentosItem>(com.orions2.SdtSDTDocumentos_SDTDocumentosItem.class, "SDTDocumentos.SDTDocumentosItem", "ACBSENA", remoteHandle);
      A3Cent_Codigo = "" ;
      A4Cent_Descripcion = "" ;
      AV58Tran_CodAlmaOrigen = "" ;
      AV60Tran_CodBodeOrigen = "" ;
      AV59Tran_CodBodeDestino = "" ;
      AV57Tran_CodAlmaDestino = "" ;
      A38Tpmo_Codigo = "" ;
      A440Tpmo_IngresaAredante = "" ;
      A441Tpmo_IngresaCurso = "" ;
      A315Tpmo_TipoE_S = "" ;
      A480Tipo_Tipo = "" ;
      A705Tpmo_SolicitaRegionDestino = "" ;
      A706Tpmo_SolicitaCentroDestino = "" ;
      A680Tpmo_CuentaResponsabilidad = "" ;
      AV10Cent_Codigo = "" ;
      AV23Ind_E_S = "" ;
      A412Invd_ModuloAlmacen = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A414Invd_BodegaCodigo = "" ;
      A463Invd_Estado = "" ;
      AV11CentroCDestino = "" ;
      A642Tpmo_SolicitaNumero = "" ;
      A643Tpmo_SolicitaFecha = "" ;
      Gx_date = GXutil.nullDate() ;
      AV25Ind_Tipo = "" ;
      AV36SDTNuevaTransaccion = new com.orions2.SdtSDTNuevaTransaccion(remoteHandle, context);
      AV27RegionDestino = "" ;
      AV12ConsecutivoCC = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      sImgUrl = "" ;
      imgImage7_Jsonclick = "" ;
      AV84Tran_DescripcionMovimiento = "" ;
      lblTextblock1_Jsonclick = "" ;
      AV71Tran_ModuloOrigen = "" ;
      imgImage8_Jsonclick = "" ;
      AV87pTran_CodAlmaOrigen = "" ;
      AV85AlmaOrigenDescri = "" ;
      imgImage9_Jsonclick = "" ;
      AV88pTran_CodBodeOrigen = "" ;
      AV86Bode_DescripcionOrigen = "" ;
      imgImage4_Jsonclick = "" ;
      AV73Tran_NombCuentadanteOrigen = "" ;
      imgImage1_Jsonclick = "" ;
      AV26NombreProveedor = "" ;
      lblTextblock2_Jsonclick = "" ;
      AV70Tran_ModuloDestino = "" ;
      imgImage10_Jsonclick = "" ;
      AV90pTran_CodAlmaDestino = "" ;
      AV89Alma_DescripcionDestino = "" ;
      imgImage11_Jsonclick = "" ;
      AV91pTran_CodBodeDestino = "" ;
      AV92Bode_DescripcionDestino = "" ;
      imgImagecuentadante_Jsonclick = "" ;
      AV72Tran_NombCuentadanteDestino = "" ;
      AV75Tran_numeroIngreso = "" ;
      AV63Tran_FechaIngreso = GXutil.nullDate() ;
      AV62Tran_detalle = "" ;
      AV79Tran_TipoEntra = "" ;
      imgImage2_Jsonclick = "" ;
      AV6Area_Codigo = "" ;
      AV7Area_Descripcion = "" ;
      imgImage3_Jsonclick = "" ;
      AV17Curs_Codigo = "" ;
      AV18Curs_Descripcion = "" ;
      imgImage5_Jsonclick = "" ;
      AV74Tran_NombreCuentadanteResponsabilidad = "" ;
      imgImage6_Jsonclick = "" ;
      AV64Tran_FechaResponsabilidad = GXutil.nullDate() ;
      AV101Tran_EntidadGobierno = "" ;
      AV76Tran_Observaciones = "" ;
      lblTextblock3_Jsonclick = "" ;
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
      GXCCtl = "" ;
      GXCCtlgxBlob = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      gxcolvTRAN_REGIONID = new GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem>(com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem.class, "SDTRegionalTrn.SDTRegionalTrnItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTRegionalTrn_SDTRegionalTrnItem1 = new GXBaseCollection [1] ;
      gxcolvTRAN_MODULOORIGEN = new GXBaseCollection<com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem>(com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem.class, "SDTModuloOrigenTrn.SDTModuloOrigenTrnItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem2 = new GXBaseCollection [1] ;
      gxcolvTRAN_REGIONIDDESTINO = new GXBaseCollection<com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem>(com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem.class, "SDTRegionDestino.SDTRegionDestinoItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTRegionDestino_SDTRegionDestinoItem3 = new GXBaseCollection [1] ;
      gxcolvTRAN_TIPOINGRESO = new GXBaseCollection<com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem>(com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem.class, "SDTOrigenbienes.SDTOrigenbienesItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTOrigenbienes_SDTOrigenbienesItem4 = new GXBaseCollection [1] ;
      AV82Usuario = "" ;
      AV83WebSession = httpContext.getWebSession();
      scmdbuf = "" ;
      H00632_A2Regi_Id = new long[1] ;
      H00632_A23Usua_Id = new long[1] ;
      H00632_A4Cent_Descripcion = new String[] {""} ;
      H00632_A3Cent_Codigo = new String[] {""} ;
      H00632_A1Cent_Id = new long[1] ;
      H00634_A38Tpmo_Codigo = new String[] {""} ;
      H00634_A440Tpmo_IngresaAredante = new String[] {""} ;
      H00634_A441Tpmo_IngresaCurso = new String[] {""} ;
      H00634_A315Tpmo_TipoE_S = new String[] {""} ;
      H00634_A480Tipo_Tipo = new String[] {""} ;
      H00634_A33Tipo_Codigo = new long[1] ;
      H00634_A705Tpmo_SolicitaRegionDestino = new String[] {""} ;
      H00634_n705Tpmo_SolicitaRegionDestino = new boolean[] {false} ;
      H00634_A706Tpmo_SolicitaCentroDestino = new String[] {""} ;
      H00634_n706Tpmo_SolicitaCentroDestino = new boolean[] {false} ;
      H00634_A680Tpmo_CuentaResponsabilidad = new String[] {""} ;
      H00634_n680Tpmo_CuentaResponsabilidad = new boolean[] {false} ;
      H00634_A40000GXC1 = new int[1] ;
      H00634_n40000GXC1 = new boolean[] {false} ;
      AV21Ind_Areadante = "" ;
      AV22Ind_Curso = "" ;
      AV24Ind_Responsabilidad = "" ;
      H00635_A1Cent_Id = new long[1] ;
      H00635_A3Cent_Codigo = new String[] {""} ;
      AV54Tran_CentroCostoCodigo = "" ;
      H00636_A1Cent_Id = new long[1] ;
      H00636_A2Regi_Id = new long[1] ;
      H00636_A4Cent_Descripcion = new String[] {""} ;
      H00636_A3Cent_Codigo = new String[] {""} ;
      GXt_objcol_SdtSDTDocumentos_SDTDocumentosItem6 = new GXBaseCollection<com.orions2.SdtSDTDocumentos_SDTDocumentosItem>(com.orions2.SdtSDTDocumentos_SDTDocumentosItem.class, "SDTDocumentos.SDTDocumentosItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTDocumentos_SDTDocumentosItem7 = new GXBaseCollection [1] ;
      AV34SDTModuloDestino = new GXBaseCollection<com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem>(com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem.class, "SDTModuloDestino.SDTModuloDestinoItem", "ACBSENA", remoteHandle);
      GXt_objcol_SdtSDTModuloDestino_SDTModuloDestinoItem10 = new GXBaseCollection<com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem>(com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem.class, "SDTModuloDestino.SDTModuloDestinoItem", "ACBSENA", remoteHandle);
      GXv_char8 = new String [1] ;
      GXv_char11 = new String [1] ;
      GXv_char12 = new String [1] ;
      GXv_objcol_SdtSDTModuloDestino_SDTModuloDestinoItem14 = new GXBaseCollection [1] ;
      AV35SDTModuloDestinoItem = new com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem(remoteHandle, context);
      H00637_A67Invd_NumeroPlaca = new String[] {""} ;
      H00637_A66Elem_Consecutivo = new String[] {""} ;
      H00637_A43Cuen_Identificacion = new long[1] ;
      H00637_n43Cuen_Identificacion = new boolean[] {false} ;
      H00637_A33Tipo_Codigo = new long[1] ;
      H00637_A463Invd_Estado = new String[] {""} ;
      H00637_n463Invd_Estado = new boolean[] {false} ;
      H00637_A414Invd_BodegaCodigo = new String[] {""} ;
      H00637_A413Invd_AlmacenCodigo = new String[] {""} ;
      H00637_A412Invd_ModuloAlmacen = new String[] {""} ;
      H00637_A411Invd_CentroCostoId = new long[1] ;
      H00637_A410Invd_RegionalId = new long[1] ;
      A66Elem_Consecutivo = "" ;
      H00638_A2Regi_Id = new long[1] ;
      H00638_A4Cent_Descripcion = new String[] {""} ;
      H00638_A3Cent_Codigo = new String[] {""} ;
      H00638_A1Cent_Id = new long[1] ;
      GXv_int5 = new long [1] ;
      H00639_A41Orig_Identificador = new long[1] ;
      H00639_A38Tpmo_Codigo = new String[] {""} ;
      H00639_A642Tpmo_SolicitaNumero = new String[] {""} ;
      H00639_A643Tpmo_SolicitaFecha = new String[] {""} ;
      AV40SolicitaNumero = "" ;
      AV39SolicitaFecha = "" ;
      GXv_SdtSDTNuevaTransaccion15 = new com.orions2.SdtSDTNuevaTransaccion [1] ;
      GXv_int9 = new long [1] ;
      GXv_char13 = new String [1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wp_transaccion__default(),
         new Object[] {
             new Object[] {
            H00632_A2Regi_Id, H00632_A23Usua_Id, H00632_A4Cent_Descripcion, H00632_A3Cent_Codigo, H00632_A1Cent_Id
            }
            , new Object[] {
            H00634_A38Tpmo_Codigo, H00634_A440Tpmo_IngresaAredante, H00634_A441Tpmo_IngresaCurso, H00634_A315Tpmo_TipoE_S, H00634_A480Tipo_Tipo, H00634_A33Tipo_Codigo, H00634_A705Tpmo_SolicitaRegionDestino, H00634_n705Tpmo_SolicitaRegionDestino, H00634_A706Tpmo_SolicitaCentroDestino, H00634_n706Tpmo_SolicitaCentroDestino,
            H00634_A680Tpmo_CuentaResponsabilidad, H00634_n680Tpmo_CuentaResponsabilidad, H00634_A40000GXC1, H00634_n40000GXC1
            }
            , new Object[] {
            H00635_A1Cent_Id, H00635_A3Cent_Codigo
            }
            , new Object[] {
            H00636_A1Cent_Id, H00636_A2Regi_Id, H00636_A4Cent_Descripcion, H00636_A3Cent_Codigo
            }
            , new Object[] {
            H00637_A67Invd_NumeroPlaca, H00637_A66Elem_Consecutivo, H00637_A43Cuen_Identificacion, H00637_n43Cuen_Identificacion, H00637_A33Tipo_Codigo, H00637_A463Invd_Estado, H00637_n463Invd_Estado, H00637_A414Invd_BodegaCodigo, H00637_A413Invd_AlmacenCodigo, H00637_A412Invd_ModuloAlmacen,
            H00637_A411Invd_CentroCostoId, H00637_A410Invd_RegionalId
            }
            , new Object[] {
            H00638_A2Regi_Id, H00638_A4Cent_Descripcion, H00638_A3Cent_Codigo, H00638_A1Cent_Id
            }
            , new Object[] {
            H00639_A41Orig_Identificador, H00639_A38Tpmo_Codigo, H00639_A642Tpmo_SolicitaNumero, H00639_A643Tpmo_SolicitaFecha
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavTran_codigomovimiento_Enabled = 0 ;
      edtavPtran_codalmaorigen_Enabled = 0 ;
      edtavPtran_codbodeorigen_Enabled = 0 ;
      edtavCuen_cedulaorigen_Enabled = 0 ;
      edtavTran_nombcuentadanteorigen_Enabled = 0 ;
      edtavCuen_cedula_Enabled = 0 ;
      edtavNombreproveedor_Enabled = 0 ;
      edtavPtran_codalmadestino_Enabled = 0 ;
      edtavPtran_codbodedestino_Enabled = 0 ;
      edtavCuen_ceduladestino_Enabled = 0 ;
      edtavTran_nombcuentadantedestino_Enabled = 0 ;
      edtavArea_codigo_Enabled = 0 ;
      edtavArea_descripcion_Enabled = 0 ;
      edtavCurs_codigo_Enabled = 0 ;
      edtavCurs_descripcion_Enabled = 0 ;
      edtavCuen_cedularespons_Enabled = 0 ;
      edtavTran_nombrecuentadanteresponsabilidad_Enabled = 0 ;
      edtavTran_transaccresponsabilidad_Enabled = 0 ;
      edtavTran_fecharesponsabilidad_Enabled = 0 ;
      edtavCtltran_nro_documento_Enabled = 0 ;
      edtavCtltran_descrip_documento_Enabled = 0 ;
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
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte wbTemp ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_204 ;
   private short nGXsfl_204_idx=1 ;
   private short AV41SWBien ;
   private short AV42SWError ;
   private short AV43SWError1 ;
   private short AV44SWError2 ;
   private short AV45SWError3 ;
   private short AV46SWError4 ;
   private short AV47SWError5 ;
   private short AV95SWError6 ;
   private short AV96SWError7 ;
   private short AV97SWError8 ;
   private short AV98SWError9 ;
   private short AV99SWError10 ;
   private short AV100SWError11 ;
   private short AV52Tabla ;
   private short wbEnd ;
   private short wbStart ;
   private short AV104GXV1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_204_fel_idx=1 ;
   private short nGXsfl_204_bak_idx=1 ;
   private int imgImage2_Visible ;
   private int imgImage3_Visible ;
   private int imgImage5_Visible ;
   private int imgImage6_Visible ;
   private int edtavTran_codigomovimiento_Enabled ;
   private int edtavTran_descripcionmovimiento_Enabled ;
   private int edtavPtran_codalmaorigen_Enabled ;
   private int edtavAlmaorigendescri_Enabled ;
   private int edtavPtran_codbodeorigen_Enabled ;
   private int edtavBode_descripcionorigen_Enabled ;
   private int imgImage4_Visible ;
   private int edtavCuen_cedulaorigen_Enabled ;
   private int edtavCuen_cedulaorigen_Visible ;
   private int edtavTran_nombcuentadanteorigen_Visible ;
   private int edtavTran_nombcuentadanteorigen_Enabled ;
   private int imgImage1_Visible ;
   private int edtavCuen_cedula_Enabled ;
   private int edtavCuen_cedula_Visible ;
   private int edtavNombreproveedor_Visible ;
   private int edtavNombreproveedor_Enabled ;
   private int edtavPtran_codalmadestino_Enabled ;
   private int edtavAlma_descripciondestino_Enabled ;
   private int edtavPtran_codbodedestino_Enabled ;
   private int edtavBode_descripciondestino_Enabled ;
   private int imgImagecuentadante_Visible ;
   private int edtavCuen_ceduladestino_Enabled ;
   private int edtavTran_nombcuentadantedestino_Enabled ;
   private int edtavTran_numeroingreso_Visible ;
   private int edtavTran_numeroingreso_Enabled ;
   private int edtavTran_fechaingreso_Visible ;
   private int edtavTran_fechaingreso_Enabled ;
   private int edtavArea_codigo_Visible ;
   private int edtavArea_codigo_Enabled ;
   private int edtavArea_descripcion_Visible ;
   private int edtavArea_descripcion_Enabled ;
   private int edtavCurs_codigo_Visible ;
   private int edtavCurs_codigo_Enabled ;
   private int edtavCurs_descripcion_Visible ;
   private int edtavCurs_descripcion_Enabled ;
   private int edtavCuen_cedularespons_Enabled ;
   private int edtavCuen_cedularespons_Visible ;
   private int edtavTran_nombrecuentadanteresponsabilidad_Visible ;
   private int edtavTran_nombrecuentadanteresponsabilidad_Enabled ;
   private int edtavTran_transaccresponsabilidad_Enabled ;
   private int edtavTran_transaccresponsabilidad_Visible ;
   private int edtavTran_fecharesponsabilidad_Visible ;
   private int edtavTran_fecharesponsabilidad_Enabled ;
   private int edtavTran_observaciones_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Width ;
   private int subGrid1_Height ;
   private int edtavCtltran_nro_documento_Enabled ;
   private int edtavCtltran_descrip_documento_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int subGrid1_Islastpage ;
   private int A40000GXC1 ;
   private int AV9CantidadOrigen ;
   private int AV112GXV2 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long AV20IdUsuario ;
   private long AV55Tran_CentroCostoId ;
   private long AV77Tran_RegionId ;
   private long A23Usua_Id ;
   private long A2Regi_Id ;
   private long A1Cent_Id ;
   private long A33Tipo_Codigo ;
   private long AV66Tran_IdCuentadanteOrigen ;
   private long AV68Tran_IdProveedor ;
   private long A410Invd_RegionalId ;
   private long A411Invd_CentroCostoId ;
   private long AV53Tipo_Codigo ;
   private long A43Cuen_Identificacion ;
   private long AV65Tran_IdCuentadanteDestino ;
   private long A41Orig_Identificador ;
   private long AV67Tran_IdCuentadanteResponsabilidad ;
   private long AV69Tran_IdResponsabilidad ;
   private long AV5Tran_Id ;
   private long AV15Cuen_CedulaOrigen ;
   private long AV13Cuen_Cedula ;
   private long AV78Tran_RegionIdDestino ;
   private long AV56Tran_CentroCostoIdDestino ;
   private long AV14Cuen_CedulaDestino ;
   private long AV80Tran_TipoIngreso ;
   private long AV16Cuen_CedulaRespons ;
   private long AV81Tran_TransaccResponsabilidad ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nFirstRecordOnPage ;
   private long GXv_int5[] ;
   private long GXv_int9[] ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_204_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A480Tipo_Tipo ;
   private String AV25Ind_Tipo ;
   private String Alertify1_Type ;
   private String Alertify1_Textmessage ;
   private String Alertify1_Textok ;
   private String Alertify1_Textcancel ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTable1_Internalname ;
   private String divTable5_Internalname ;
   private String TempTags ;
   private String sImgUrl ;
   private String imgImage7_Internalname ;
   private String imgImage7_Jsonclick ;
   private String edtavTran_codigomovimiento_Internalname ;
   private String edtavTran_codigomovimiento_Jsonclick ;
   private String edtavTran_descripcionmovimiento_Internalname ;
   private String edtavTran_descripcionmovimiento_Jsonclick ;
   private String divTable3_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String imgImage8_Internalname ;
   private String imgImage8_Jsonclick ;
   private String edtavPtran_codalmaorigen_Internalname ;
   private String edtavPtran_codalmaorigen_Jsonclick ;
   private String edtavAlmaorigendescri_Internalname ;
   private String edtavAlmaorigendescri_Jsonclick ;
   private String imgImage9_Internalname ;
   private String imgImage9_Jsonclick ;
   private String edtavPtran_codbodeorigen_Internalname ;
   private String edtavPtran_codbodeorigen_Jsonclick ;
   private String edtavBode_descripcionorigen_Internalname ;
   private String edtavBode_descripcionorigen_Jsonclick ;
   private String imgImage4_Internalname ;
   private String imgImage4_Jsonclick ;
   private String edtavCuen_cedulaorigen_Internalname ;
   private String edtavCuen_cedulaorigen_Jsonclick ;
   private String edtavTran_nombcuentadanteorigen_Internalname ;
   private String edtavTran_nombcuentadanteorigen_Jsonclick ;
   private String imgImage1_Internalname ;
   private String imgImage1_Jsonclick ;
   private String edtavCuen_cedula_Internalname ;
   private String edtavCuen_cedula_Jsonclick ;
   private String edtavNombreproveedor_Internalname ;
   private String edtavNombreproveedor_Jsonclick ;
   private String divTable2_Internalname ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String imgImage10_Internalname ;
   private String imgImage10_Jsonclick ;
   private String edtavPtran_codalmadestino_Internalname ;
   private String edtavPtran_codalmadestino_Jsonclick ;
   private String edtavAlma_descripciondestino_Internalname ;
   private String edtavAlma_descripciondestino_Jsonclick ;
   private String imgImage11_Internalname ;
   private String imgImage11_Jsonclick ;
   private String edtavPtran_codbodedestino_Internalname ;
   private String edtavPtran_codbodedestino_Jsonclick ;
   private String edtavBode_descripciondestino_Internalname ;
   private String edtavBode_descripciondestino_Jsonclick ;
   private String imgImagecuentadante_Internalname ;
   private String imgImagecuentadante_Jsonclick ;
   private String edtavCuen_ceduladestino_Internalname ;
   private String edtavCuen_ceduladestino_Jsonclick ;
   private String edtavTran_nombcuentadantedestino_Internalname ;
   private String edtavTran_nombcuentadantedestino_Jsonclick ;
   private String divTable4_Internalname ;
   private String edtavTran_numeroingreso_Internalname ;
   private String AV75Tran_numeroIngreso ;
   private String edtavTran_numeroingreso_Jsonclick ;
   private String edtavTran_fechaingreso_Internalname ;
   private String edtavTran_fechaingreso_Jsonclick ;
   private String AV62Tran_detalle ;
   private String AV79Tran_TipoEntra ;
   private String imgImage2_Internalname ;
   private String imgImage2_Jsonclick ;
   private String edtavArea_codigo_Internalname ;
   private String edtavArea_codigo_Jsonclick ;
   private String edtavArea_descripcion_Internalname ;
   private String edtavArea_descripcion_Jsonclick ;
   private String imgImage3_Internalname ;
   private String imgImage3_Jsonclick ;
   private String edtavCurs_codigo_Internalname ;
   private String edtavCurs_codigo_Jsonclick ;
   private String edtavCurs_descripcion_Internalname ;
   private String edtavCurs_descripcion_Jsonclick ;
   private String imgImage5_Internalname ;
   private String imgImage5_Jsonclick ;
   private String edtavCuen_cedularespons_Internalname ;
   private String edtavCuen_cedularespons_Jsonclick ;
   private String edtavTran_nombrecuentadanteresponsabilidad_Internalname ;
   private String edtavTran_nombrecuentadanteresponsabilidad_Jsonclick ;
   private String imgImage6_Internalname ;
   private String imgImage6_Jsonclick ;
   private String edtavTran_transaccresponsabilidad_Internalname ;
   private String edtavTran_transaccresponsabilidad_Jsonclick ;
   private String edtavTran_fecharesponsabilidad_Internalname ;
   private String edtavTran_fecharesponsabilidad_Jsonclick ;
   private String edtavTran_observaciones_Internalname ;
   private String divTable6_Internalname ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
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
   private String GXCCtl ;
   private String GXCCtlgxBlob ;
   private String gxwrpcisep ;
   private String edtavCtltran_nro_documento_Internalname ;
   private String edtavCtltran_descrip_documento_Internalname ;
   private String sGXsfl_204_fel_idx="0001" ;
   private String scmdbuf ;
   private String Alertify1_Internalname ;
   private String GXv_char8[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String edtavCtltran_archivo_Internalname ;
   private String ROClassString ;
   private String edtavCtltran_nro_documento_Jsonclick ;
   private String edtavCtltran_descrip_documento_Jsonclick ;
   private String edtavCtltran_archivo_Filetype ;
   private String edtavCtltran_archivo_Contenttype ;
   private String edtavCtltran_archivo_Parameters ;
   private String edtavCtltran_archivo_Jsonclick ;
   private java.util.Date Gx_date ;
   private java.util.Date AV63Tran_FechaIngreso ;
   private java.util.Date AV64Tran_FechaResponsabilidad ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_204_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n705Tpmo_SolicitaRegionDestino ;
   private boolean n706Tpmo_SolicitaCentroDestino ;
   private boolean n680Tpmo_CuentaResponsabilidad ;
   private boolean n40000GXC1 ;
   private boolean gx_BV204 ;
   private boolean n43Cuen_Identificacion ;
   private boolean n463Invd_Estado ;
   private String AV76Tran_Observaciones ;
   private String AV61Tran_CodigoMovimiento ;
   private String A3Cent_Codigo ;
   private String A4Cent_Descripcion ;
   private String AV58Tran_CodAlmaOrigen ;
   private String AV60Tran_CodBodeOrigen ;
   private String AV59Tran_CodBodeDestino ;
   private String AV57Tran_CodAlmaDestino ;
   private String A38Tpmo_Codigo ;
   private String A440Tpmo_IngresaAredante ;
   private String A441Tpmo_IngresaCurso ;
   private String A315Tpmo_TipoE_S ;
   private String A705Tpmo_SolicitaRegionDestino ;
   private String A706Tpmo_SolicitaCentroDestino ;
   private String A680Tpmo_CuentaResponsabilidad ;
   private String AV10Cent_Codigo ;
   private String AV23Ind_E_S ;
   private String A412Invd_ModuloAlmacen ;
   private String A413Invd_AlmacenCodigo ;
   private String A414Invd_BodegaCodigo ;
   private String A463Invd_Estado ;
   private String AV11CentroCDestino ;
   private String A642Tpmo_SolicitaNumero ;
   private String A643Tpmo_SolicitaFecha ;
   private String AV27RegionDestino ;
   private String AV12ConsecutivoCC ;
   private String AV84Tran_DescripcionMovimiento ;
   private String AV71Tran_ModuloOrigen ;
   private String AV87pTran_CodAlmaOrigen ;
   private String AV85AlmaOrigenDescri ;
   private String AV88pTran_CodBodeOrigen ;
   private String AV86Bode_DescripcionOrigen ;
   private String AV73Tran_NombCuentadanteOrigen ;
   private String AV26NombreProveedor ;
   private String AV70Tran_ModuloDestino ;
   private String AV90pTran_CodAlmaDestino ;
   private String AV89Alma_DescripcionDestino ;
   private String AV91pTran_CodBodeDestino ;
   private String AV92Bode_DescripcionDestino ;
   private String AV72Tran_NombCuentadanteDestino ;
   private String AV6Area_Codigo ;
   private String AV7Area_Descripcion ;
   private String AV17Curs_Codigo ;
   private String AV18Curs_Descripcion ;
   private String AV74Tran_NombreCuentadanteResponsabilidad ;
   private String AV101Tran_EntidadGobierno ;
   private String AV82Usuario ;
   private String AV21Ind_Areadante ;
   private String AV22Ind_Curso ;
   private String AV24Ind_Responsabilidad ;
   private String AV54Tran_CentroCostoCodigo ;
   private String A66Elem_Consecutivo ;
   private String AV40SolicitaNumero ;
   private String AV39SolicitaFecha ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV83WebSession ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private GXBaseCollection<com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem> gxcolvTRAN_TIPOINGRESO ;
   private GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem> gxcolvTRAN_REGIONID ;
   private GXBaseCollection<com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem> gxcolvTRAN_MODULOORIGEN ;
   private GXBaseCollection<com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem> gxcolvTRAN_REGIONIDDESTINO ;
   private HTMLChoice dynavTran_regionid ;
   private HTMLChoice cmbavTran_centrocostoid ;
   private HTMLChoice dynavTran_moduloorigen ;
   private HTMLChoice dynavTran_regioniddestino ;
   private HTMLChoice cmbavTran_centrocostoiddestino ;
   private HTMLChoice cmbavTran_modulodestino ;
   private HTMLChoice dynavTran_tipoingreso ;
   private HTMLChoice cmbavTran_detalle ;
   private HTMLChoice cmbavTran_tipoentra ;
   private HTMLChoice cmbavTran_entidadgobierno ;
   private IDataStoreProvider pr_default ;
   private long[] H00632_A2Regi_Id ;
   private long[] H00632_A23Usua_Id ;
   private String[] H00632_A4Cent_Descripcion ;
   private String[] H00632_A3Cent_Codigo ;
   private long[] H00632_A1Cent_Id ;
   private String[] H00634_A38Tpmo_Codigo ;
   private String[] H00634_A440Tpmo_IngresaAredante ;
   private String[] H00634_A441Tpmo_IngresaCurso ;
   private String[] H00634_A315Tpmo_TipoE_S ;
   private String[] H00634_A480Tipo_Tipo ;
   private long[] H00634_A33Tipo_Codigo ;
   private String[] H00634_A705Tpmo_SolicitaRegionDestino ;
   private boolean[] H00634_n705Tpmo_SolicitaRegionDestino ;
   private String[] H00634_A706Tpmo_SolicitaCentroDestino ;
   private boolean[] H00634_n706Tpmo_SolicitaCentroDestino ;
   private String[] H00634_A680Tpmo_CuentaResponsabilidad ;
   private boolean[] H00634_n680Tpmo_CuentaResponsabilidad ;
   private int[] H00634_A40000GXC1 ;
   private boolean[] H00634_n40000GXC1 ;
   private long[] H00635_A1Cent_Id ;
   private String[] H00635_A3Cent_Codigo ;
   private long[] H00636_A1Cent_Id ;
   private long[] H00636_A2Regi_Id ;
   private String[] H00636_A4Cent_Descripcion ;
   private String[] H00636_A3Cent_Codigo ;
   private String[] H00637_A67Invd_NumeroPlaca ;
   private String[] H00637_A66Elem_Consecutivo ;
   private long[] H00637_A43Cuen_Identificacion ;
   private boolean[] H00637_n43Cuen_Identificacion ;
   private long[] H00637_A33Tipo_Codigo ;
   private String[] H00637_A463Invd_Estado ;
   private boolean[] H00637_n463Invd_Estado ;
   private String[] H00637_A414Invd_BodegaCodigo ;
   private String[] H00637_A413Invd_AlmacenCodigo ;
   private String[] H00637_A412Invd_ModuloAlmacen ;
   private long[] H00637_A411Invd_CentroCostoId ;
   private long[] H00637_A410Invd_RegionalId ;
   private long[] H00638_A2Regi_Id ;
   private String[] H00638_A4Cent_Descripcion ;
   private String[] H00638_A3Cent_Codigo ;
   private long[] H00638_A1Cent_Id ;
   private long[] H00639_A41Orig_Identificador ;
   private String[] H00639_A38Tpmo_Codigo ;
   private String[] H00639_A642Tpmo_SolicitaNumero ;
   private String[] H00639_A643Tpmo_SolicitaFecha ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtSDTDocumentos_SDTDocumentosItem> AV93SDTDocumentos ;
   private GXBaseCollection<com.orions2.SdtSDTDocumentos_SDTDocumentosItem> GXt_objcol_SdtSDTDocumentos_SDTDocumentosItem6 ;
   private GXBaseCollection<com.orions2.SdtSDTDocumentos_SDTDocumentosItem> GXv_objcol_SdtSDTDocumentos_SDTDocumentosItem7[] ;
   private GXBaseCollection<com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem> AV34SDTModuloDestino ;
   private GXBaseCollection<com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem> GXt_objcol_SdtSDTModuloDestino_SDTModuloDestinoItem10 ;
   private GXBaseCollection<com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem> GXv_objcol_SdtSDTModuloDestino_SDTModuloDestinoItem14[] ;
   private GXBaseCollection<com.orions2.SdtSDTOrigenbienes_SDTOrigenbienesItem> GXv_objcol_SdtSDTOrigenbienes_SDTOrigenbienesItem4[] ;
   private GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem> GXv_objcol_SdtSDTRegionalTrn_SDTRegionalTrnItem1[] ;
   private GXBaseCollection<com.orions2.SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem> GXv_objcol_SdtSDTModuloOrigenTrn_SDTModuloOrigenTrnItem2[] ;
   private GXBaseCollection<com.orions2.SdtSDTRegionDestino_SDTRegionDestinoItem> GXv_objcol_SdtSDTRegionDestino_SDTRegionDestinoItem3[] ;
   private com.orions2.SdtSDTModuloDestino_SDTModuloDestinoItem AV35SDTModuloDestinoItem ;
   private com.orions2.SdtSDTNuevaTransaccion AV36SDTNuevaTransaccion ;
   private com.orions2.SdtSDTNuevaTransaccion GXv_SdtSDTNuevaTransaccion15[] ;
}

final  class wp_transaccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00632", "SELECT T2.Regi_Id, T1.Usua_Id, T2.Cent_Descripcion, T2.Cent_Codigo, T1.Cent_Id FROM (SEG_USUARIO_CENTRO T1 INNER JOIN GEN_CENTROCOSTO T2 ON T2.Cent_Id = T1.Cent_Id) WHERE (T1.Usua_Id = ?) AND (T2.Regi_Id = ?) ORDER BY T1.Usua_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00634", "SELECT T1.Tpmo_Codigo, T1.Tpmo_IngresaAredante, T1.Tpmo_IngresaCurso, T1.Tpmo_TipoE_S, T3.Tipo_Tipo, T1.Tipo_Codigo, T1.Tpmo_SolicitaRegionDestino, T1.Tpmo_SolicitaCentroDestino, T1.Tpmo_CuentaResponsabilidad, COALESCE( T2.GXC1, 0) AS GXC1 FROM ((ALM_TIPO_MOVIMIENTO T1 LEFT JOIN (SELECT COUNT(*) AS GXC1, Tpmo_Codigo FROM ALM_TIPO_MOVIMIENTO_ORIGEN GROUP BY Tpmo_Codigo ) T2 ON T2.Tpmo_Codigo = T1.Tpmo_Codigo) INNER JOIN ALM_TIPO_ELEMENTO T3 ON T3.Tipo_Codigo = T1.Tipo_Codigo) WHERE T1.Tpmo_Codigo = ? ORDER BY T1.Tpmo_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00635", "SELECT Cent_Id, Cent_Codigo FROM GEN_CENTROCOSTO WHERE Cent_Id = ? ORDER BY Cent_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00636", "SELECT Cent_Id, Regi_Id, Cent_Descripcion, Cent_Codigo FROM GEN_CENTROCOSTO WHERE (Regi_Id = ?) AND (Cent_Id <> ?) ORDER BY Regi_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00637", "SELECT * FROM (SELECT T1.Invd_NumeroPlaca, T1.Elem_Consecutivo, T1.Cuen_Identificacion, T2.Tipo_Codigo, T1.Invd_Estado, T1.Invd_BodegaCodigo, T1.Invd_AlmacenCodigo, T1.Invd_ModuloAlmacen, T1.Invd_CentroCostoId, T1.Invd_RegionalId FROM (ALM_INVENTARIO_DEVOLUTIVO T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) WHERE (T1.Invd_RegionalId = ? and T1.Invd_CentroCostoId = ? and T1.Invd_ModuloAlmacen = ? and T1.Invd_AlmacenCodigo = ? and T1.Invd_BodegaCodigo = ? and T1.Cuen_Identificacion = ? and T1.Invd_Estado = 'R') AND (T2.Tipo_Codigo = ?) ORDER BY T1.Invd_RegionalId, T1.Invd_CentroCostoId, T1.Invd_ModuloAlmacen, T1.Invd_AlmacenCodigo, T1.Invd_BodegaCodigo, T1.Cuen_Identificacion, T1.Invd_Estado) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H00638", "SELECT Regi_Id, Cent_Descripcion, Cent_Codigo, Cent_Id FROM GEN_CENTROCOSTO WHERE Regi_Id = ? ORDER BY Regi_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H00639", "SELECT Orig_Identificador, Tpmo_Codigo, Tpmo_SolicitaNumero, Tpmo_SolicitaFecha FROM ALM_TIPO_MOVIMIENTO_ORIGEN WHERE Tpmo_Codigo = ? and Orig_Identificador = ? ORDER BY Tpmo_Codigo, Orig_Identificador ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getString(5, 1) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
               ((long[]) buf[10])[0] = rslt.getLong(9) ;
               ((long[]) buf[11])[0] = rslt.getLong(10) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setBigDecimal(6, ((Number) parms[5]).longValue(), 0);
               stmt.setBigDecimal(7, ((Number) parms[6]).longValue(), 0);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

