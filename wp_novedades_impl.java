/*
               File: wp_novedades_impl
        Description: Novedades
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 18, 2018 14:13:19.0
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

public final  class wp_novedades_impl extends GXDataArea
{
   public wp_novedades_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wp_novedades_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wp_novedades_impl.class ));
   }

   public wp_novedades_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTnov_codigo = new HTMLChoice();
      dynavRegi_id = new HTMLChoice();
      cmbavNove_masivo = new HTMLChoice();
      dynavOrig_identificador = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vREGI_ID") == 0 )
         {
            AV91Usua_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91Usua_Id", GXutil.ltrim( GXutil.str( AV91Usua_Id, 18, 0)));
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdsvvregi_id7Y2( AV91Usua_Id) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"vORIG_IDENTIFICADOR") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxdlvvorig_identificador7Y2( ) ;
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
            nRC_GXsfl_241 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_241_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_241_idx = httpContext.GetNextPar( ) ;
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
      pa7Y2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start7Y2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186181413200");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("calendar-es.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wp_novedades") +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtdetalle", AV99SDTDetalle);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtdetalle", AV99SDTDetalle);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_241", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_241, (byte)(4), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILEUPLOADDATA", AV132FileUploadData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILEUPLOADDATA", AV132FileUploadData);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_CODIGO", GXutil.ltrim( localUtil.ntoc( A104TNov_Codigo, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_NRO_CAMBIOS", GXutil.ltrim( localUtil.ntoc( A771TNov_Nro_Cambios, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_INGRESOMASIVO", A813TNov_IngresoMasivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_NOMBRE_CAMPO", A774TNov_Nombre_Campo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_PROCEDIMIENTO", A772TNov_Procedimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_TIPO", A770TNov_Tipo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TNOV_OBLIGASOPORTE", A839TNov_ObligaSoporte);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPLACAS", AV80Placas);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNOVE_VALORANTIGUO", AV70Nove_ValorAntiguo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNOVE_VALORNUEVO", AV71Nove_ValorNuevo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTNOV_TIPO", AV14TNov_Tipo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTNOV_NOMBRE_CAMPO", AV10TNov_Nombre_Campo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV90Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CENTROCOSTOCODIGO", A419Tran_CentroCostoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CENTROCOSTODESCRIPCION", A420Tran_CentroCostoDescripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODIGOMOVIMIENTO", A49Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_DESCRIPCIONMOVIMIENTO", A381Tran_DescripcionMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_MODULOORIGEN", A110Tran_ModuloOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODALMAORIGEN", A109Tran_CodAlmaOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_FECHARATIFICACION", localUtil.ttoc( A390Tran_FechaRatificacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_FECHAREGISTRO", localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_DESCRIPCION", AV31Alma_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODBODEORIGEN", A112Tran_CodBodeOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vBODE_DESCRIPCION", AV36Bode_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CEDULACUENTADANTEORIGEN", GXutil.ltrim( localUtil.ntoc( A702Tran_CedulaCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CEDULAPROVEEDOR", GXutil.ltrim( localUtil.ntoc( A703Tran_CedulaProveedor, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_NOMBREPROVEEDOR", A575Tran_NombreProveedor);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_NOMBCUENTADANTEORIGEN", A384Tran_NombCuentadanteOrigen);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_MODULODESTINO", A385Tran_ModuloDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODALMADESTINO", A111Tran_CodAlmaDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODBODEDESTINO", A387Tran_CodBodeDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CEDULACUENTADANTEDESTINO", GXutil.ltrim( localUtil.ntoc( A704Tran_CedulaCuentadanteDestino, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_NOMBCUENTADANTEDESTINO", A389Tran_NombCuentadanteDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_IDPROVEEDOR", GXutil.ltrim( localUtil.ntoc( A53Tran_IdProveedor, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_TIPOINGRESO", GXutil.ltrim( localUtil.ntoc( A54Tran_TipoIngreso, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_NOMBREINGRESO", A672Tran_NombreIngreso);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_NUMEROINGRESO", GXutil.rtrim( A514Tran_NumeroIngreso));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_FECHAINGRESO", localUtil.dtoc( A515Tran_FechaIngreso, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_OBSERVACIONES", A416Tran_Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_AREADANTECODIGO", A407Tran_AreadanteCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CURSOCODIGO", A408Tran_CursoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_IDCUENTADANTEDESTINO", GXutil.ltrim( localUtil.ntoc( A52Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENT_ID", GXutil.ltrim( localUtil.ntoc( A1Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_ID", GXutil.ltrim( localUtil.ntoc( AV6Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_MODULO", A27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_MODULO", AV32Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_CODIGO", A28Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_CODIGO", AV30Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_DESCRIPCION", A252Alma_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGO", A31Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vBODE_CODIGO", AV35Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_DESCRIPCION", A251Bode_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTNOV_NRO_CAMBIOS", GXutil.ltrim( localUtil.ntoc( AV11TNov_Nro_Cambios, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPERMITIDO", AV77Permitido);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTNOV_PROCEDIMIENTO", AV12TNov_Procedimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_NOMBREPROVEEDOR", AV26Tran_NombreProveedor);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CEDULAPROVEEDOR", GXutil.ltrim( localUtil.ntoc( AV18Tran_CedulaProveedor, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDPROVEEDOR", GXutil.ltrim( localUtil.ntoc( AV23Tran_IdProveedor, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_NOMBREINGRESO", AV104Tran_NombreIngreso);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_FECHAINGRESO", localUtil.dtoc( AV21Tran_FechaIngreso, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_NUMEROINGRESO", GXutil.rtrim( AV27Tran_NumeroIngreso));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_TIPOINGRESO", GXutil.ltrim( localUtil.ntoc( AV29Tran_TipoIngreso, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_OBSERVACIONES", AV28Tran_Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_AREADANTEDESCRIPCION", AV16Tran_AreadanteDescripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_AREADANTECODIGO", AV15Tran_AreadanteCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CURSODESCRIPCION", AV20Tran_CursoDescripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CURSOCODIGO", AV19Tran_CursoCodigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_NOMBCUENTADANTEDESTINO", AV24Tran_NombCuentadanteDestino);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CEDULACUENTADANTEDESTINO", GXutil.ltrim( localUtil.ntoc( AV17Tran_CedulaCuentadanteDestino, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDCUENTADANTEDESTINO", GXutil.ltrim( localUtil.ntoc( AV22Tran_IdCuentadanteDestino, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINVD_VALORADQUISICION", GXutil.ltrim( localUtil.ntoc( AV48Invd_ValorAdquisicion, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vOTROS_COSTOS_DEV", GXutil.ltrim( localUtil.ntoc( AV75Otros_Costos_Dev, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vVIDA_UTIL_ACTUAL", GXutil.ltrim( localUtil.ntoc( AV97Vida_Util_Actual, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "AREA_CODIGO", A59Area_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "AREA_DESCRIPCION", A452Area_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CURS_CODIGO", A73Curs_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CURS_DESCRIPCION", A424Curs_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vIDE_PROVEEDOR", GXutil.ltrim( localUtil.ntoc( AV47Ide_Proveedor, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCUENTAD_ID", GXutil.ltrim( localUtil.ntoc( AV40Cuentad_Id, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ENTRADA", GXutil.ltrim( localUtil.ntoc( AV102Tran_Entrada, (byte)(11), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTNOVEDADESDETALLE", AV85SDTNovedadesDetalle);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTNOVEDADESDETALLE", AV85SDTNovedadesDetalle);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTDETALLE", AV99SDTDetalle);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTDETALLE", AV99SDTDetalle);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTNOV_OBLIGASOPORTE", AV112TNov_ObligaSoporte);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTNOVEDADES", AV84SDTNovedades);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTNOVEDADES", AV84SDTNovedades);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vERRORES", GXutil.rtrim( AV123Errores));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTERRORMASIVO", AV124SDTErrorMasivo);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTERRORMASIVO", AV124SDTErrorMasivo);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vELEM_CONSECUTIVO", AV7Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNOVE_IDENTIFICADOR", GXutil.ltrim( localUtil.ntoc( AV8Nove_Identificador, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNOVE_RESPUESTAPROC", AV68Nove_RespuestaProc);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNOVE_ESTADO", GXutil.rtrim( AV62Nove_Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_CODIGO", AV5Cent_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vVARIABLE_VF", GXutil.ltrim( localUtil.ntoc( AV96Variable_VF, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vVARIABLE_I", GXutil.ltrim( localUtil.ntoc( AV94Variable_I, (byte)(3), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vVARIABLE_N", GXutil.ltrim( localUtil.ntoc( AV95Variable_N, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACA", A67Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_PLACAPADRE", A68Invd_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCION", A298Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_VALORADQUISICION", GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "OTROS_COSTOS_DEV", GXutil.ltrim( localUtil.ntoc( A628Otros_Costos_Dev, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VARIABLE_VF", GXutil.ltrim( localUtil.ntoc( A625Variable_VF, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VARIABLE_I", GXutil.ltrim( localUtil.ntoc( A626Variable_I, (byte)(3), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VARIABLE_N", GXutil.ltrim( localUtil.ntoc( A627Variable_N, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VIDA_UTIL_ACTUAL", GXutil.ltrim( localUtil.ntoc( A631Vida_Util_Actual, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNUEVADESCRIPCION", AV107NuevaDescripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNUEVOCONSECUTIVO", AV106NuevoConsecutivo);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILEUPLOADDATACOLL", AV134FileUploadDataColl);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILEUPLOADDATACOLL", AV134FileUploadDataColl);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vGXV8", GXutil.ltrim( localUtil.ntoc( AV168GXV8, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUA_ID", GXutil.ltrim( localUtil.ntoc( AV91Usua_Id, (byte)(18), (byte)(0), ",", "")));
      GXCCtlgxBlob = "vARCHIVO" + "_gxBlob" ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, AV110Archivo);
      GXCCtlgxBlob = "vNOVE_SOPORTE" + "_gxBlob" ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, AV69Nove_Soporte);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vARCHIVO_Filename", GXutil.rtrim( edtavArchivo_Filename));
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
         we7Y2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt7Y2( ) ;
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
      return formatLink("com.orions2.wp_novedades")  ;
   }

   public String getPgmname( )
   {
      return "WP_Novedades" ;
   }

   public String getPgmdesc( )
   {
      return "Novedades" ;
   }

   public void wb7Y0( )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Novedades", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavTnov_codigo.getInternalname(), "Tipo de Novedad", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTnov_codigo, cmbavTnov_codigo.getInternalname(), GXutil.trim( GXutil.str( AV89TNov_Codigo, 6, 0)), 1, cmbavTnov_codigo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavTnov_codigo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "", true, "HLP_WP_Novedades.htm");
         cmbavTnov_codigo.setValue( GXutil.trim( GXutil.str( AV89TNov_Codigo, 6, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTnov_codigo.getInternalname(), "Values", cmbavTnov_codigo.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavRegi_id.getInternalname(), "Regional", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavRegi_id, dynavRegi_id.getInternalname(), GXutil.trim( GXutil.str( AV82Regi_Id, 11, 0)), 1, dynavRegi_id.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", dynavRegi_id.getVisible(), dynavRegi_id.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "", true, "HLP_WP_Novedades.htm");
         dynavRegi_id.setValue( GXutil.trim( GXutil.str( AV82Regi_Id, 11, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavRegi_id.getInternalname(), "Values", dynavRegi_id.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage6_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage6_Visible, 1, "Seleccionar Transacción", "Seleccionar Transacción", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage6_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'TRANSACCION\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_consecutivocc_Internalname, "Transacción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_consecutivocc_Internalname, GXutil.ltrim( localUtil.ntoc( AV101Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtavTran_consecutivocc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV101Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV101Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_consecutivocc_Jsonclick, 0, "Attribute", "", "", "", edtavTran_consecutivocc_Visible, edtavTran_consecutivocc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavNove_masivo.getInternalname(), "Cargue Masivo", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavNove_masivo, cmbavNove_masivo.getInternalname(), GXutil.rtrim( AV63Nove_Masivo), 1, cmbavNove_masivo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "vchar", "", cmbavNove_masivo.getVisible(), cmbavNove_masivo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, "HLP_WP_Novedades.htm");
         cmbavNove_masivo.setValue( GXutil.rtrim( AV63Nove_Masivo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavNove_masivo.getInternalname(), "Values", cmbavNove_masivo.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable7_Internalname, divTable7_Visible, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavArchivo_Internalname, "Archivo", "col-sm-3 ImageLabel", 1, true);
         ClassString = "Image" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         edtavArchivo_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavArchivo_Internalname, "Filetype", edtavArchivo_Filetype, true);
         if ( ! (GXutil.strcmp("", AV110Archivo)==0) )
         {
            gxblobfileaux.setSource( AV110Archivo );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavArchivo_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtavArchivo_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               AV110Archivo = gxblobfileaux.getAbsoluteName() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavArchivo_Internalname, "URL", httpContext.getResourceRelative(AV110Archivo), true);
               edtavArchivo_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavArchivo_Internalname, "Filetype", edtavArchivo_Filetype, true);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop("", false, edtavArchivo_Internalname, "URL", httpContext.getResourceRelative(AV110Archivo), true);
         }
         com.orions2.GxWebStd.gx_blob_field( httpContext, edtavArchivo_Internalname, GXutil.rtrim( AV110Archivo), httpContext.getResourceRelative(AV110Archivo), ((GXutil.strcmp("", edtavArchivo_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavArchivo_Filetype)==0) ? AV110Archivo : edtavArchivo_Filetype)) : edtavArchivo_Contenttype), false, "", edtavArchivo_Parameters, 1, edtavArchivo_Enabled, 1, "", "", 0, 0, 250, "px", 60, "px", 0, 0, 0, edtavArchivo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", ""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "", "", "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-sm-offset-1", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         ClassString = "ActionButtons" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttGenerarexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 241, 3, 0)+","+"null"+");", "Generar Excel", bttGenerarexcel_Jsonclick, 5, "Generar Excel", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'GENERAR EXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage5_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage5_Visible, 1, "Seleccionar Placa", "Seleccionar Placa", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage5_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'PLACA\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPlaca_Internalname, "Placa", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPlaca_Internalname, AV78Placa, GXutil.rtrim( localUtil.format( AV78Placa, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPlaca_Jsonclick, 0, "Attribute", "", "", "", edtavPlaca_Visible, edtavPlaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_observaciones_Internalname, "Observaciones", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavNove_observaciones_Internalname, AV67Nove_Observaciones, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", (short)(0), 1, edtavNove_observaciones_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_soporte_Internalname, "Soporte", "col-sm-3 ImageLabel", 1, true);
         ClassString = "Image" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         edtavNove_soporte_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_soporte_Internalname, "Filetype", edtavNove_soporte_Filetype, true);
         if ( ! (GXutil.strcmp("", AV69Nove_Soporte)==0) )
         {
            gxblobfileaux.setSource( AV69Nove_Soporte );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavNove_soporte_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtavNove_soporte_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               AV69Nove_Soporte = gxblobfileaux.getAbsoluteName() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavNove_soporte_Internalname, "URL", httpContext.getResourceRelative(AV69Nove_Soporte), true);
               edtavNove_soporte_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavNove_soporte_Internalname, "Filetype", edtavNove_soporte_Filetype, true);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop("", false, edtavNove_soporte_Internalname, "URL", httpContext.getResourceRelative(AV69Nove_Soporte), true);
         }
         com.orions2.GxWebStd.gx_blob_field( httpContext, edtavNove_soporte_Internalname, GXutil.rtrim( AV69Nove_Soporte), httpContext.getResourceRelative(AV69Nove_Soporte), ((GXutil.strcmp("", edtavNove_soporte_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavNove_soporte_Filetype)==0) ? AV69Nove_Soporte : edtavNove_soporte_Filetype)) : edtavNove_soporte_Contenttype), false, "", edtavNove_soporte_Parameters, 1, edtavNove_soporte_Enabled, 1, "", "", 0, -1, 250, "px", 60, "px", 0, 0, 0, edtavNove_soporte_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", ""+TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "", "", "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"FILEUPLOAD1Container"+"\"></div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttCargararchivo_Internalname, "gx.evt.setGridEvt("+GXutil.str( 241, 3, 0)+","+"null"+");", "cargar archivo", bttCargararchivo_Jsonclick, 7, "cargar archivo", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e117y1_client"+"'", TempTags, "", 2, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable3_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_centrodescripcion_Internalname, "Centro de Costo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_centrodescripcion_Internalname, AV59Nove_CentroDescripcion, GXutil.rtrim( localUtil.format( AV59Nove_CentroDescripcion, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_centrodescripcion_Jsonclick, 0, "Attribute", "", "", "", edtavNove_centrodescripcion_Visible, edtavNove_centrodescripcion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavFecharegistro_Internalname, "Fecha Registro", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFecharegistro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavFecharegistro_Internalname, localUtil.ttoc( AV122FechaRegistro, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV122FechaRegistro, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFecharegistro_Jsonclick, 0, "Attribute", "", "", "", edtavFecharegistro_Visible, edtavFecharegistro_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavFecharegistro_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavFecharegistro_Visible==0)||(edtavFecharegistro_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_movimientodescrip_Internalname, "Movimiento", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_movimientodescrip_Internalname, AV66Nove_MovimientoDescrip, GXutil.rtrim( localUtil.format( AV66Nove_MovimientoDescrip, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_movimientodescrip_Jsonclick, 0, "Attribute", "", "", "", edtavNove_movimientodescrip_Visible, edtavNove_movimientodescrip_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavFechatran_Internalname, "Fecha Ratificación", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechatran_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavFechatran_Internalname, localUtil.ttoc( AV119FechaTran, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV119FechaTran, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechatran_Jsonclick, 0, "Attribute", "", "", "", edtavFechatran_Visible, edtavFechatran_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "FechaHora", "right", false, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavFechatran_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavFechatran_Visible==0)||(edtavFechatran_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WP_Novedades.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "Datos Orígen", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", lblTextblock1_Visible, 1, (short)(0), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCata_descripcion_Internalname, "Descripción del bien", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCata_descripcion_Internalname, AV37Cata_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,88);\"", (short)(0), edtavCata_descripcion_Visible, edtavCata_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_moduloorigen_Internalname, "Módulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_moduloorigen_Internalname, AV65Nove_ModuloOrigen, GXutil.rtrim( localUtil.format( AV65Nove_ModuloOrigen, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_moduloorigen_Jsonclick, 0, "Attribute", "", "", "", edtavNove_moduloorigen_Visible, edtavNove_moduloorigen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_almadescripcionorig_Internalname, "Almacén", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_almadescripcionorig_Internalname, AV54Nove_AlmaDescripcionOrig, GXutil.rtrim( localUtil.format( AV54Nove_AlmaDescripcionOrig, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_almadescripcionorig_Jsonclick, 0, "Attribute", "", "", "", edtavNove_almadescripcionorig_Visible, edtavNove_almadescripcionorig_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_bodedescripcionorig_Internalname, "Bodega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_bodedescripcionorig_Internalname, AV56Nove_BodeDescripcionOrig, GXutil.rtrim( localUtil.format( AV56Nove_BodeDescripcionOrig, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_bodedescripcionorig_Jsonclick, 0, "Attribute", "", "", "", edtavNove_bodedescripcionorig_Visible, edtavNove_bodedescripcionorig_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_cuentadantenomorigen_Internalname, "Cuentadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_cuentadantenomorigen_Internalname, AV61Nove_CuentadanteNomOrigen, GXutil.rtrim( localUtil.format( AV61Nove_CuentadanteNomOrigen, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_cuentadantenomorigen_Jsonclick, 0, "Attribute", "", "", "", edtavNove_cuentadantenomorigen_Visible, edtavNove_cuentadantenomorigen_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, "Datos Destino", "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", lblTextblock2_Visible, 1, (short)(0), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPlacapadre_Internalname, "Placa Padre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPlacapadre_Internalname, AV79PlacaPadre, GXutil.rtrim( localUtil.format( AV79PlacaPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPlacapadre_Jsonclick, 0, "Attribute", "", "", "", edtavPlacapadre_Visible, edtavPlacapadre_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_modulodestino_Internalname, "Módulo", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_modulodestino_Internalname, AV64Nove_ModuloDestino, GXutil.rtrim( localUtil.format( AV64Nove_ModuloDestino, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_modulodestino_Jsonclick, 0, "Attribute", "", "", "", edtavNove_modulodestino_Visible, edtavNove_modulodestino_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_almadescripciondesti_Internalname, "Almacén", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_almadescripciondesti_Internalname, AV53Nove_AlmaDescripcionDesti, GXutil.rtrim( localUtil.format( AV53Nove_AlmaDescripcionDesti, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_almadescripciondesti_Jsonclick, 0, "Attribute", "", "", "", edtavNove_almadescripciondesti_Visible, edtavNove_almadescripciondesti_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_bodedescripciondesti_Internalname, "Bodega", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_bodedescripciondesti_Internalname, AV55Nove_BodeDescripcionDesti, GXutil.rtrim( localUtil.format( AV55Nove_BodeDescripcionDesti, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_bodedescripciondesti_Jsonclick, 0, "Attribute", "", "", "", edtavNove_bodedescripciondesti_Visible, edtavNove_bodedescripciondesti_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Nombres", "left", true, "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNove_cuentadantenomdestino_Internalname, "Cuentadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNove_cuentadantenomdestino_Internalname, AV60Nove_CuentadanteNomDestino, GXutil.rtrim( localUtil.format( AV60Nove_CuentadanteNomDestino, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNove_cuentadantenomdestino_Jsonclick, 0, "Attribute", "", "", "", edtavNove_cuentadantenomdestino_Visible, edtavNove_cuentadantenomdestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable4_Internalname, divTable4_Visible, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, "Valor Actual", "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavDescripcion_antigua_Internalname, AV44Descripcion_Antigua, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", (short)(0), edtavDescripcion_antigua_Visible, edtavDescripcion_antigua_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, "Nuevo Valor", "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage4_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage4_Visible, 1, "Seleccionar", "Seleccionar", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage4_Jsonclick, "'"+""+"'"+",false,"+"'"+"e127y1_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCedula_proveedor_Internalname, "Cedula", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCedula_proveedor_Internalname, GXutil.ltrim( localUtil.ntoc( AV38Cedula_Proveedor, (byte)(18), (byte)(0), ",", "")), ((edtavCedula_proveedor_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38Cedula_Proveedor), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV38Cedula_Proveedor), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCedula_proveedor_Jsonclick, 0, "Attribute", "", "", "", edtavCedula_proveedor_Visible, edtavCedula_proveedor_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNombre_proveedor_Internalname, "Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNombre_proveedor_Internalname, AV52Nombre_Proveedor, GXutil.rtrim( localUtil.format( AV52Nombre_Proveedor, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,153);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNombre_proveedor_Jsonclick, 0, "Attribute", "", "", "", edtavNombre_proveedor_Visible, edtavNombre_proveedor_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNuevo_valor_Internalname, "Nuevo Valor", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavNuevo_valor_Internalname, AV72Nuevo_Valor, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,157);\"", (short)(0), edtavNuevo_valor_Visible, edtavNuevo_valor_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage1_Visible, 1, "Seleccionar Areadante", "Seleccionar Areadante", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage1_Jsonclick, "'"+""+"'"+",false,"+"'"+"e137y1_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavArea_codigo_Internalname, "Areadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavArea_codigo_Internalname, AV33Area_Codigo, GXutil.rtrim( localUtil.format( AV33Area_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,163);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArea_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavArea_codigo_Visible, edtavArea_codigo_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavArea_descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavArea_descripcion_Internalname, AV34Area_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", (short)(0), edtavArea_descripcion_Visible, edtavArea_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage2_Visible, 1, "Seleccionar Curso", "Seleccionar Curso", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage2_Jsonclick, "'"+""+"'"+",false,"+"'"+"e147y1_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCurs_codigo_Internalname, "Curso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCurs_codigo_Internalname, AV42Curs_Codigo, GXutil.rtrim( localUtil.format( AV42Curs_Codigo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,172);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCurs_codigo_Jsonclick, 0, "Attribute", "", "", "", edtavCurs_codigo_Visible, edtavCurs_codigo_Enabled, 0, "text", "", 41, "chr", 1, "row", 41, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCurs_descripcion_Internalname, "Descripción", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 175,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCurs_descripcion_Internalname, AV43Curs_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,175);\"", (short)(0), edtavCurs_descripcion_Visible, edtavCurs_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage3_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImage3_Visible, 1, "Seleccionar Cuentadante", "Seleccionar Cuentadante", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage3_Jsonclick, "'"+""+"'"+",false,"+"'"+"e157y1_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCuentad_cedula_Internalname, "Cuentadante", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCuentad_cedula_Internalname, GXutil.ltrim( localUtil.ntoc( AV39Cuentad_Cedula, (byte)(18), (byte)(0), ",", "")), ((edtavCuentad_cedula_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39Cuentad_Cedula), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV39Cuentad_Cedula), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuentad_cedula_Jsonclick, 0, "Attribute", "", "", "", edtavCuentad_cedula_Visible, edtavCuentad_cedula_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCuentad_nombre_Internalname, "Nombre", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCuentad_nombre_Internalname, AV41Cuentad_Nombre, GXutil.rtrim( localUtil.format( AV41Cuentad_Nombre, "@!")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCuentad_nombre_Jsonclick, 0, "Attribute", "", "", "", edtavCuentad_nombre_Visible, edtavCuentad_nombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavValor_Internalname, "Valor", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavValor_Internalname, GXutil.ltrim( localUtil.ntoc( AV93Valor, (byte)(18), (byte)(2), ",", "")), ((edtavValor_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV93Valor, "ZZZZZZZZZZZZZZ9.99")) : localUtil.format( AV93Valor, "ZZZZZZZZZZZZZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,188);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValor_Jsonclick, 0, "Attribute", "", "", "", edtavValor_Visible, edtavValor_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable6_Internalname, divTable6_Visible, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, "Asociar", "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WP_Novedades.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage7_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar Placa", "Seleccionar Placa", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage7_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'ASOCIAR PLACA\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNuevaplaca_Internalname, "Nueva Placa", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNuevaplaca_Internalname, AV105NuevaPlaca, GXutil.rtrim( localUtil.format( AV105NuevaPlaca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,202);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNuevaplaca_Jsonclick, 0, "Attribute", "", "", "", 1, edtavNuevaplaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
         ClassString = "BtnAdd" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttAgregarplaca_Internalname, "gx.evt.setGridEvt("+GXutil.str( 241, 3, 0)+","+"null"+");", "Agregar Placa", bttAgregarplaca_Jsonclick, 5, "Agregar Placa", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'AGREGAR PLACA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable8_Internalname, divTable8_Visible, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, "Valor Actual", "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, "Nuevo Valor", "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAnt_nombreingreso_Internalname, "Tipo de Ingreso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 218,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAnt_nombreingreso_Internalname, AV117Ant_NombreIngreso, GXutil.rtrim( localUtil.format( AV117Ant_NombreIngreso, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,218);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAnt_nombreingreso_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAnt_nombreingreso_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Descripcion", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, dynavOrig_identificador.getInternalname(), "Tipo de Ingreso", "col-sm-3 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, dynavOrig_identificador, dynavOrig_identificador.getInternalname(), GXutil.trim( GXutil.str( AV74Orig_Identificador, 11, 0)), 1, dynavOrig_identificador.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", dynavOrig_identificador.getVisible(), dynavOrig_identificador.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,221);\"", "", true, "HLP_WP_Novedades.htm");
         dynavOrig_identificador.setValue( GXutil.trim( GXutil.str( AV74Orig_Identificador, 11, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynavOrig_identificador.getInternalname(), "Values", dynavOrig_identificador.ToJavascriptSource(), true);
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAnt_numeroingreso_Internalname, "Número de Ingreso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAnt_numeroingreso_Internalname, GXutil.rtrim( AV115Ant_NumeroIngreso), GXutil.rtrim( localUtil.format( AV115Ant_NumeroIngreso, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,225);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAnt_numeroingreso_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAnt_numeroingreso_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavNew_numeroingreso_Internalname, "Número de Ingreso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 228,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavNew_numeroingreso_Internalname, GXutil.rtrim( AV118New_NumeroIngreso), GXutil.rtrim( localUtil.format( AV118New_NumeroIngreso, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,228);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNew_numeroingreso_Jsonclick, 0, "Attribute", "", "", "", edtavNew_numeroingreso_Visible, edtavNew_numeroingreso_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavAnt_fechaingreso_Internalname, "Fecha de Ingreso", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 232,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAnt_fechaingreso_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavAnt_fechaingreso_Internalname, localUtil.format(AV116Ant_FechaIngreso, "99/99/99"), localUtil.format( AV116Ant_FechaIngreso, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,232);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAnt_fechaingreso_Jsonclick, 0, "Attribute", "", "", "", 1, edtavAnt_fechaingreso_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavAnt_fechaingreso_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAnt_fechaingreso_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WP_Novedades.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavFecha_Internalname, "Fecha", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 235,'',false,'" + sGXsfl_241_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavFecha_Internalname, localUtil.format(AV46Fecha, "99/99/99"), localUtil.format( AV46Fecha, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,235);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFecha_Jsonclick, 0, "Attribute", "", "", "", edtavFecha_Visible, edtavFecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavFecha_Visible==0)||(edtavFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WP_Novedades.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable5_Internalname, divTable5_Visible, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"241\">") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlnro_linea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Nro Linea") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlplaca_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlconsecutivo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlplacapadreactual_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Placa Padre Actual") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlplacapadrenueva_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Placa Padre Nueva") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlcantidadactual_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Cantidad Actual") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlcantidadnueva_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Cantidad Nueva") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlconsecutivoactual_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo actual") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlconsecutivonuevo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo nuevo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlatributoactual_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Atributo Actual") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlatributonuevo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Atributo Nuevo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlvaloractual_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Valor Actual") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 106, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCtlvalornuevo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
            httpContext.writeValue( "Valor Nuevo") ;
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
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlnro_linea_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlnro_linea_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlplaca_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlplaca_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlconsecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlconsecutivo_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtldescripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlplacapadreactual_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlplacapadreactual_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlplacapadrenueva_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlplacapadrenueva_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcantidadactual_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlcantidadactual_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlcantidadnueva_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlconsecutivoactual_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlconsecutivoactual_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlconsecutivonuevo_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlatributoactual_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlatributoactual_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlatributonuevo_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlvaloractual_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlvaloractual_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCtlvalornuevo_Visible, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 241 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_241 = (short)(nGXsfl_241_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV137GXV1 = nGXsfl_241_idx ;
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblUrl_Internalname, lblUrl_Caption, "", "", lblUrl_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(1), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Right", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttConfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 241, 3, 0)+","+"null"+");", "Confirmar", bttConfirmar_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_Novedades.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttCancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 241, 3, 0)+","+"null"+");", "Cancelar", bttCancelar_Jsonclick, 5, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WP_Novedades.htm");
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

   public void start7Y2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Novedades", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup7Y0( ) ;
   }

   public void ws7Y2( )
   {
      start7Y2( ) ;
      evt7Y2( ) ;
   }

   public void evt7Y2( )
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
                           e167Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTNOV_CODIGO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e177Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTRAN_CONSECUTIVOCC.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e187Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VNOVE_OBSERVACIONES.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e197Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Confirmar' */
                           e207Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CANCELAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Cancelar' */
                           e217Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'PLACA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Placa' */
                           e227Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPLACA.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e237Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'TRANSACCION'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Transaccion' */
                           e247Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VNUEVAPLACA.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e257Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'AGREGAR PLACA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Agregar Placa' */
                           e267Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'GENERAR EXCEL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'GENERAR EXCEL' */
                           e277Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ASOCIAR PLACA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Asociar Placa' */
                           e287Y2 ();
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
                           nGXsfl_241_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_241_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_241_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_2412( ) ;
                           AV137GXV1 = nGXsfl_241_idx ;
                           if ( ( AV99SDTDetalle.size() >= AV137GXV1 ) && ( AV137GXV1 > 0 ) )
                           {
                              AV99SDTDetalle.currentItem( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)) );
                           }
                           if ( (GXutil.strcmp("", AV110Archivo)==0) )
                           {
                              GXCCtl = "vARCHIVO_" + sGXsfl_241_idx ;
                              GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
                              AV110Archivo = httpContext.cgiGet( GXCCtlgxBlob) ;
                           }
                           if ( (GXutil.strcmp("", AV69Nove_Soporte)==0) )
                           {
                              GXCCtl = "vNOVE_SOPORTE_" + sGXsfl_241_idx ;
                              GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
                              AV69Nove_Soporte = httpContext.cgiGet( GXCCtlgxBlob) ;
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
                                 e297Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e307Y2 ();
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

   public void we7Y2( )
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

   public void pa7Y2( )
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
         cmbavTnov_codigo.setName( "vTNOV_CODIGO" );
         cmbavTnov_codigo.setWebtags( "" );
         if ( cmbavTnov_codigo.getItemCount() > 0 )
         {
            AV89TNov_Codigo = (int)(GXutil.lval( cmbavTnov_codigo.getValidValue(GXutil.trim( GXutil.str( AV89TNov_Codigo, 6, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TNov_Codigo", GXutil.ltrim( GXutil.str( AV89TNov_Codigo, 6, 0)));
         }
         dynavRegi_id.setName( "vREGI_ID" );
         dynavRegi_id.setWebtags( "" );
         cmbavNove_masivo.setName( "vNOVE_MASIVO" );
         cmbavNove_masivo.setWebtags( "" );
         cmbavNove_masivo.addItem("", "", (short)(0));
         cmbavNove_masivo.addItem("SI", "SI", (short)(0));
         cmbavNove_masivo.addItem("NO", "NO", (short)(0));
         if ( cmbavNove_masivo.getItemCount() > 0 )
         {
            AV63Nove_Masivo = cmbavNove_masivo.getValidValue(AV63Nove_Masivo) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63Nove_Masivo", AV63Nove_Masivo);
         }
         dynavOrig_identificador.setName( "vORIG_IDENTIFICADOR" );
         dynavOrig_identificador.setWebtags( "" );
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = cmbavTnov_codigo.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxdlvvorig_identificador7Y2( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdlvvorig_identificador_data7Y2( ) ;
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

   public void gxvvorig_identificador_html7Y2( )
   {
      long gxdynajaxvalue ;
      gxdlvvorig_identificador_data7Y2( ) ;
      gxdynajaxindex = 1 ;
      dynavOrig_identificador.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex)) ;
         dynavOrig_identificador.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 11, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavOrig_identificador.getItemCount() > 0 )
      {
         AV74Orig_Identificador = GXutil.lval( dynavOrig_identificador.getValidValue(GXutil.trim( GXutil.str( AV74Orig_Identificador, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Orig_Identificador", GXutil.ltrim( GXutil.str( AV74Orig_Identificador, 11, 0)));
      }
   }

   protected void gxdlvvorig_identificador_data7Y2( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor H007Y2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( H007Y2_A41Orig_Identificador[0], (byte)(11), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(H007Y2_A635Orig_Descripcion[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxdsvvregi_id7Y2( long AV91Usua_Id )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "max-age=0");
      }
      httpContext.GX_webresponse.addString("(new Array( new Array(");
      gxdsvvregi_id_data7Y2( AV91Usua_Id) ;
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

   public void gxvvregi_id_html7Y2( long AV91Usua_Id )
   {
      long gxdynajaxvalue ;
      gxdsvvregi_id_data7Y2( AV91Usua_Id) ;
      gxdynajaxindex = 1 ;
      dynavRegi_id.removeAllItems();
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex)) ;
         dynavRegi_id.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 11, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
      if ( dynavRegi_id.getItemCount() > 0 )
      {
         AV82Regi_Id = GXutil.lval( dynavRegi_id.getValidValue(GXutil.trim( GXutil.str( AV82Regi_Id, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82Regi_Id", GXutil.ltrim( GXutil.str( AV82Regi_Id, 11, 0)));
      }
   }

   protected void gxdsvvregi_id_data7Y2( long AV91Usua_Id )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem gxcolitemvREGI_ID ;
      GXv_objcol_SdtSDTRegionalTrn_SDTRegionalTrnItem1[0] = gxcolvREGI_ID ;
      new com.orions2.dpregionaltrn(remoteHandle, context).execute( AV91Usua_Id, GXv_objcol_SdtSDTRegionalTrn_SDTRegionalTrnItem1) ;
      wp_novedades_impl.this.gxcolvREGI_ID = GXv_objcol_SdtSDTRegionalTrn_SDTRegionalTrnItem1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91Usua_Id", GXutil.ltrim( GXutil.str( AV91Usua_Id, 18, 0)));
      gxcolvREGI_ID.sort("Tran_regiondescripcion");
      int gxindex = 1 ;
      while ( gxindex <= gxcolvREGI_ID.size() )
      {
         gxcolitemvREGI_ID = ((com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem)gxcolvREGI_ID.elementAt(-1+gxindex)) ;
         gxdynajaxctrlcodr.add(GXutil.ltrim( GXutil.str( gxcolitemvREGI_ID.getgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regionid(), 11, 0)));
         gxdynajaxctrldescr.add(gxcolitemvREGI_ID.getgxTv_SdtSDTRegionalTrn_SDTRegionalTrnItem_Tran_regiondescripcion());
         gxindex = (int)(gxindex+1) ;
      }
   }

   public void gxnrgrid1_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_2412( ) ;
      while ( nGXsfl_241_idx <= nRC_GXsfl_241 )
      {
         sendrow_2412( ) ;
         nGXsfl_241_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_241_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_241_idx+1)) ;
         sGXsfl_241_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_241_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_2412( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf7Y2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavTnov_codigo.getItemCount() > 0 )
      {
         AV89TNov_Codigo = (int)(GXutil.lval( cmbavTnov_codigo.getValidValue(GXutil.trim( GXutil.str( AV89TNov_Codigo, 6, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89TNov_Codigo", GXutil.ltrim( GXutil.str( AV89TNov_Codigo, 6, 0)));
      }
      if ( dynavRegi_id.getItemCount() > 0 )
      {
         AV82Regi_Id = GXutil.lval( dynavRegi_id.getValidValue(GXutil.trim( GXutil.str( AV82Regi_Id, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82Regi_Id", GXutil.ltrim( GXutil.str( AV82Regi_Id, 11, 0)));
      }
      if ( cmbavNove_masivo.getItemCount() > 0 )
      {
         AV63Nove_Masivo = cmbavNove_masivo.getValidValue(AV63Nove_Masivo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Nove_Masivo", AV63Nove_Masivo);
      }
      if ( dynavOrig_identificador.getItemCount() > 0 )
      {
         AV74Orig_Identificador = GXutil.lval( dynavOrig_identificador.getValidValue(GXutil.trim( GXutil.str( AV74Orig_Identificador, 11, 0)))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Orig_Identificador", GXutil.ltrim( GXutil.str( AV74Orig_Identificador, 11, 0)));
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf7Y2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavNove_centrodescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_centrodescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_centrodescripcion_Enabled, 5, 0)), true);
      edtavFecharegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFecharegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavFecharegistro_Enabled, 5, 0)), true);
      edtavNove_movimientodescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_movimientodescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_movimientodescrip_Enabled, 5, 0)), true);
      edtavFechatran_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFechatran_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavFechatran_Enabled, 5, 0)), true);
      edtavCata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Enabled, 5, 0)), true);
      edtavNove_moduloorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_moduloorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_moduloorigen_Enabled, 5, 0)), true);
      edtavNove_almadescripcionorig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_almadescripcionorig_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_almadescripcionorig_Enabled, 5, 0)), true);
      edtavNove_bodedescripcionorig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_bodedescripcionorig_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_bodedescripcionorig_Enabled, 5, 0)), true);
      edtavNove_cuentadantenomorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_cuentadantenomorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_cuentadantenomorigen_Enabled, 5, 0)), true);
      edtavPlacapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlacapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPlacapadre_Enabled, 5, 0)), true);
      edtavNove_modulodestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_modulodestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_modulodestino_Enabled, 5, 0)), true);
      edtavNove_almadescripciondesti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_almadescripciondesti_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_almadescripciondesti_Enabled, 5, 0)), true);
      edtavNove_bodedescripciondesti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_bodedescripciondesti_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_bodedescripciondesti_Enabled, 5, 0)), true);
      edtavNove_cuentadantenomdestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_cuentadantenomdestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_cuentadantenomdestino_Enabled, 5, 0)), true);
      edtavDescripcion_antigua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDescripcion_antigua_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDescripcion_antigua_Enabled, 5, 0)), true);
      edtavCedula_proveedor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCedula_proveedor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCedula_proveedor_Enabled, 5, 0)), true);
      edtavNombre_proveedor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombre_proveedor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNombre_proveedor_Enabled, 5, 0)), true);
      edtavArea_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_codigo_Enabled, 5, 0)), true);
      edtavArea_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Enabled, 5, 0)), true);
      edtavCurs_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Enabled, 5, 0)), true);
      edtavCurs_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Enabled, 5, 0)), true);
      edtavCuentad_cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuentad_cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuentad_cedula_Enabled, 5, 0)), true);
      edtavCuentad_nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuentad_nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuentad_nombre_Enabled, 5, 0)), true);
      edtavAnt_nombreingreso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnt_nombreingreso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAnt_nombreingreso_Enabled, 5, 0)), true);
      edtavAnt_numeroingreso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnt_numeroingreso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAnt_numeroingreso_Enabled, 5, 0)), true);
      edtavAnt_fechaingreso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnt_fechaingreso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAnt_fechaingreso_Enabled, 5, 0)), true);
      edtavCtlnro_linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnro_linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnro_linea_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlplaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlplaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlplaca_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlconsecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlconsecutivo_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtldescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtldescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtldescripcion_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlplacapadreactual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlplacapadreactual_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlplacapadreactual_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlcantidadactual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcantidadactual_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcantidadactual_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlconsecutivoactual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivoactual_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlconsecutivoactual_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlatributoactual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlatributoactual_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlatributoactual_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlvaloractual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlvaloractual_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlvaloractual_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
   }

   public void rf7Y2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(241) ;
      nGXsfl_241_idx = (short)(1) ;
      sGXsfl_241_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_241_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2412( ) ;
      bGXsfl_241_Refreshing = true ;
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
         subsflControlProps_2412( ) ;
         e307Y2 ();
         wbEnd = (short)(241) ;
         wb7Y0( ) ;
      }
      bGXsfl_241_Refreshing = true ;
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

   public void strup7Y0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavNove_centrodescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_centrodescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_centrodescripcion_Enabled, 5, 0)), true);
      edtavFecharegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFecharegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavFecharegistro_Enabled, 5, 0)), true);
      edtavNove_movimientodescrip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_movimientodescrip_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_movimientodescrip_Enabled, 5, 0)), true);
      edtavFechatran_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFechatran_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavFechatran_Enabled, 5, 0)), true);
      edtavCata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Enabled, 5, 0)), true);
      edtavNove_moduloorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_moduloorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_moduloorigen_Enabled, 5, 0)), true);
      edtavNove_almadescripcionorig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_almadescripcionorig_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_almadescripcionorig_Enabled, 5, 0)), true);
      edtavNove_bodedescripcionorig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_bodedescripcionorig_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_bodedescripcionorig_Enabled, 5, 0)), true);
      edtavNove_cuentadantenomorigen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_cuentadantenomorigen_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_cuentadantenomorigen_Enabled, 5, 0)), true);
      edtavPlacapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlacapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPlacapadre_Enabled, 5, 0)), true);
      edtavNove_modulodestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_modulodestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_modulodestino_Enabled, 5, 0)), true);
      edtavNove_almadescripciondesti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_almadescripciondesti_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_almadescripciondesti_Enabled, 5, 0)), true);
      edtavNove_bodedescripciondesti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_bodedescripciondesti_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_bodedescripciondesti_Enabled, 5, 0)), true);
      edtavNove_cuentadantenomdestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_cuentadantenomdestino_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNove_cuentadantenomdestino_Enabled, 5, 0)), true);
      edtavDescripcion_antigua_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDescripcion_antigua_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavDescripcion_antigua_Enabled, 5, 0)), true);
      edtavCedula_proveedor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCedula_proveedor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCedula_proveedor_Enabled, 5, 0)), true);
      edtavNombre_proveedor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombre_proveedor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavNombre_proveedor_Enabled, 5, 0)), true);
      edtavArea_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_codigo_Enabled, 5, 0)), true);
      edtavArea_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Enabled, 5, 0)), true);
      edtavCurs_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Enabled, 5, 0)), true);
      edtavCurs_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Enabled, 5, 0)), true);
      edtavCuentad_cedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuentad_cedula_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuentad_cedula_Enabled, 5, 0)), true);
      edtavCuentad_nombre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuentad_nombre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCuentad_nombre_Enabled, 5, 0)), true);
      edtavAnt_nombreingreso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnt_nombreingreso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAnt_nombreingreso_Enabled, 5, 0)), true);
      edtavAnt_numeroingreso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnt_numeroingreso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAnt_numeroingreso_Enabled, 5, 0)), true);
      edtavAnt_fechaingreso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnt_fechaingreso_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavAnt_fechaingreso_Enabled, 5, 0)), true);
      edtavCtlnro_linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlnro_linea_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlnro_linea_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlplaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlplaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlplaca_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlconsecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlconsecutivo_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtldescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtldescripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtldescripcion_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlplacapadreactual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlplacapadreactual_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlplacapadreactual_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlcantidadactual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcantidadactual_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcantidadactual_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlconsecutivoactual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivoactual_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlconsecutivoactual_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlatributoactual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlatributoactual_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlatributoactual_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      edtavCtlvaloractual_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlvaloractual_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlvaloractual_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
      gxvvorig_identificador_html7Y2( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e297Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      gxvvregi_id_html7Y2( AV91Usua_Id) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtdetalle"), AV99SDTDetalle);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFILEUPLOADDATA"), AV132FileUploadData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFILEUPLOADDATACOLL"), AV134FileUploadDataColl);
         /* Read variables values. */
         cmbavTnov_codigo.setName( cmbavTnov_codigo.getInternalname() );
         cmbavTnov_codigo.setValue( httpContext.cgiGet( cmbavTnov_codigo.getInternalname()) );
         AV89TNov_Codigo = (int)(GXutil.lval( httpContext.cgiGet( cmbavTnov_codigo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89TNov_Codigo", GXutil.ltrim( GXutil.str( AV89TNov_Codigo, 6, 0)));
         dynavRegi_id.setName( dynavRegi_id.getInternalname() );
         dynavRegi_id.setValue( httpContext.cgiGet( dynavRegi_id.getInternalname()) );
         AV82Regi_Id = GXutil.lval( httpContext.cgiGet( dynavRegi_id.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82Regi_Id", GXutil.ltrim( GXutil.str( AV82Regi_Id, 11, 0)));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRAN_CONSECUTIVOCC");
            GX_FocusControl = edtavTran_consecutivocc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV101Tran_ConsecutivoCC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV101Tran_ConsecutivoCC, 18, 0)));
         }
         else
         {
            AV101Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV101Tran_ConsecutivoCC, 18, 0)));
         }
         cmbavNove_masivo.setName( cmbavNove_masivo.getInternalname() );
         cmbavNove_masivo.setValue( httpContext.cgiGet( cmbavNove_masivo.getInternalname()) );
         AV63Nove_Masivo = httpContext.cgiGet( cmbavNove_masivo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Nove_Masivo", AV63Nove_Masivo);
         AV110Archivo = httpContext.cgiGet( edtavArchivo_Internalname) ;
         AV78Placa = httpContext.cgiGet( edtavPlaca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78Placa", AV78Placa);
         AV67Nove_Observaciones = httpContext.cgiGet( edtavNove_observaciones_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Nove_Observaciones", AV67Nove_Observaciones);
         AV69Nove_Soporte = httpContext.cgiGet( edtavNove_soporte_Internalname) ;
         AV59Nove_CentroDescripcion = httpContext.cgiGet( edtavNove_centrodescripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59Nove_CentroDescripcion", AV59Nove_CentroDescripcion);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFecharegistro_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vFECHAREGISTRO");
            GX_FocusControl = edtavFecharegistro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV122FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV122FechaRegistro", localUtil.ttoc( AV122FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV122FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtavFecharegistro_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122FechaRegistro", localUtil.ttoc( AV122FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         }
         AV66Nove_MovimientoDescrip = httpContext.cgiGet( edtavNove_movimientodescrip_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66Nove_MovimientoDescrip", AV66Nove_MovimientoDescrip);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFechatran_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vFECHATRAN");
            GX_FocusControl = edtavFechatran_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV119FechaTran = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV119FechaTran", localUtil.ttoc( AV119FechaTran, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV119FechaTran = localUtil.ctot( httpContext.cgiGet( edtavFechatran_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119FechaTran", localUtil.ttoc( AV119FechaTran, 8, 5, 0, 3, "/", ":", " "));
         }
         AV37Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCata_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Cata_Descripcion", AV37Cata_Descripcion);
         AV65Nove_ModuloOrigen = httpContext.cgiGet( edtavNove_moduloorigen_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65Nove_ModuloOrigen", AV65Nove_ModuloOrigen);
         AV54Nove_AlmaDescripcionOrig = httpContext.cgiGet( edtavNove_almadescripcionorig_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54Nove_AlmaDescripcionOrig", AV54Nove_AlmaDescripcionOrig);
         AV56Nove_BodeDescripcionOrig = httpContext.cgiGet( edtavNove_bodedescripcionorig_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Nove_BodeDescripcionOrig", AV56Nove_BodeDescripcionOrig);
         AV61Nove_CuentadanteNomOrigen = GXutil.upper( httpContext.cgiGet( edtavNove_cuentadantenomorigen_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Nove_CuentadanteNomOrigen", AV61Nove_CuentadanteNomOrigen);
         AV79PlacaPadre = httpContext.cgiGet( edtavPlacapadre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79PlacaPadre", AV79PlacaPadre);
         AV64Nove_ModuloDestino = httpContext.cgiGet( edtavNove_modulodestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Nove_ModuloDestino", AV64Nove_ModuloDestino);
         AV53Nove_AlmaDescripcionDesti = httpContext.cgiGet( edtavNove_almadescripciondesti_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Nove_AlmaDescripcionDesti", AV53Nove_AlmaDescripcionDesti);
         AV55Nove_BodeDescripcionDesti = httpContext.cgiGet( edtavNove_bodedescripciondesti_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55Nove_BodeDescripcionDesti", AV55Nove_BodeDescripcionDesti);
         AV60Nove_CuentadanteNomDestino = GXutil.upper( httpContext.cgiGet( edtavNove_cuentadantenomdestino_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Nove_CuentadanteNomDestino", AV60Nove_CuentadanteNomDestino);
         AV44Descripcion_Antigua = httpContext.cgiGet( edtavDescripcion_antigua_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44Descripcion_Antigua", AV44Descripcion_Antigua);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCedula_proveedor_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCedula_proveedor_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCEDULA_PROVEEDOR");
            GX_FocusControl = edtavCedula_proveedor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38Cedula_Proveedor = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38Cedula_Proveedor", GXutil.ltrim( GXutil.str( AV38Cedula_Proveedor, 18, 0)));
         }
         else
         {
            AV38Cedula_Proveedor = localUtil.ctol( httpContext.cgiGet( edtavCedula_proveedor_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38Cedula_Proveedor", GXutil.ltrim( GXutil.str( AV38Cedula_Proveedor, 18, 0)));
         }
         AV52Nombre_Proveedor = GXutil.upper( httpContext.cgiGet( edtavNombre_proveedor_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52Nombre_Proveedor", AV52Nombre_Proveedor);
         AV72Nuevo_Valor = httpContext.cgiGet( edtavNuevo_valor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72Nuevo_Valor", AV72Nuevo_Valor);
         AV33Area_Codigo = httpContext.cgiGet( edtavArea_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Area_Codigo", AV33Area_Codigo);
         AV34Area_Descripcion = httpContext.cgiGet( edtavArea_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Area_Descripcion", AV34Area_Descripcion);
         AV42Curs_Codigo = httpContext.cgiGet( edtavCurs_codigo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Curs_Codigo", AV42Curs_Codigo);
         AV43Curs_Descripcion = httpContext.cgiGet( edtavCurs_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43Curs_Descripcion", AV43Curs_Descripcion);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCuentad_cedula_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCuentad_cedula_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUENTAD_CEDULA");
            GX_FocusControl = edtavCuentad_cedula_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39Cuentad_Cedula = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39Cuentad_Cedula", GXutil.ltrim( GXutil.str( AV39Cuentad_Cedula, 18, 0)));
         }
         else
         {
            AV39Cuentad_Cedula = localUtil.ctol( httpContext.cgiGet( edtavCuentad_cedula_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39Cuentad_Cedula", GXutil.ltrim( GXutil.str( AV39Cuentad_Cedula, 18, 0)));
         }
         AV41Cuentad_Nombre = GXutil.upper( httpContext.cgiGet( edtavCuentad_nombre_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41Cuentad_Nombre", AV41Cuentad_Nombre);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
            GX_FocusControl = edtavValor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV93Valor = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93Valor", GXutil.ltrim( GXutil.str( AV93Valor, 18, 2)));
         }
         else
         {
            AV93Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93Valor", GXutil.ltrim( GXutil.str( AV93Valor, 18, 2)));
         }
         AV105NuevaPlaca = httpContext.cgiGet( edtavNuevaplaca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105NuevaPlaca", AV105NuevaPlaca);
         AV117Ant_NombreIngreso = httpContext.cgiGet( edtavAnt_nombreingreso_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV117Ant_NombreIngreso", AV117Ant_NombreIngreso);
         dynavOrig_identificador.setName( dynavOrig_identificador.getInternalname() );
         dynavOrig_identificador.setValue( httpContext.cgiGet( dynavOrig_identificador.getInternalname()) );
         AV74Orig_Identificador = GXutil.lval( httpContext.cgiGet( dynavOrig_identificador.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Orig_Identificador", GXutil.ltrim( GXutil.str( AV74Orig_Identificador, 11, 0)));
         AV115Ant_NumeroIngreso = httpContext.cgiGet( edtavAnt_numeroingreso_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV115Ant_NumeroIngreso", AV115Ant_NumeroIngreso);
         AV118New_NumeroIngreso = httpContext.cgiGet( edtavNew_numeroingreso_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV118New_NumeroIngreso", AV118New_NumeroIngreso);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavAnt_fechaingreso_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vANT_FECHAINGRESO");
            GX_FocusControl = edtavAnt_fechaingreso_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV116Ant_FechaIngreso = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116Ant_FechaIngreso", localUtil.format(AV116Ant_FechaIngreso, "99/99/99"));
         }
         else
         {
            AV116Ant_FechaIngreso = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavAnt_fechaingreso_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116Ant_FechaIngreso", localUtil.format(AV116Ant_FechaIngreso, "99/99/99"));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavFecha_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA");
            GX_FocusControl = edtavFecha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46Fecha = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Fecha", localUtil.format(AV46Fecha, "99/99/99"));
         }
         else
         {
            AV46Fecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFecha_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Fecha", localUtil.format(AV46Fecha, "99/99/99"));
         }
         /* Read saved values. */
         nRC_GXsfl_241 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_241"), ",", ".")) ;
         AV168GXV8 = (int)(localUtil.ctol( httpContext.cgiGet( "vGXV8"), ",", ".")) ;
         AV14TNov_Tipo = httpContext.cgiGet( "vTNOV_TIPO") ;
         AV10TNov_Nombre_Campo = httpContext.cgiGet( "vTNOV_NOMBRE_CAMPO") ;
         AV40Cuentad_Id = localUtil.ctol( httpContext.cgiGet( "vCUENTAD_ID"), ",", ".") ;
         AV5Cent_Codigo = httpContext.cgiGet( "vCENT_CODIGO") ;
         AV47Ide_Proveedor = localUtil.ctol( httpContext.cgiGet( "vIDE_PROVEEDOR"), ",", ".") ;
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
         edtavArchivo_Filename = httpContext.cgiGet( "vARCHIVO_Filename") ;
         nRC_GXsfl_241 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_241"), ",", ".")) ;
         nGXsfl_241_fel_idx = (short)(0) ;
         while ( nGXsfl_241_fel_idx < nRC_GXsfl_241 )
         {
            nGXsfl_241_fel_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_241_fel_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_241_fel_idx+1)) ;
            sGXsfl_241_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_241_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_2412( ) ;
            AV137GXV1 = nGXsfl_241_fel_idx ;
            if ( ( AV99SDTDetalle.size() >= AV137GXV1 ) && ( AV137GXV1 > 0 ) )
            {
               AV99SDTDetalle.currentItem( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)) );
            }
            if ( (GXutil.strcmp("", AV110Archivo)==0) )
            {
               GXCCtl = "vARCHIVO_" + sGXsfl_241_fel_idx ;
               GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
               AV110Archivo = httpContext.cgiGet( GXCCtlgxBlob) ;
            }
            if ( (GXutil.strcmp("", AV69Nove_Soporte)==0) )
            {
               GXCCtl = "vNOVE_SOPORTE_" + sGXsfl_241_fel_idx ;
               GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
               AV69Nove_Soporte = httpContext.cgiGet( GXCCtlgxBlob) ;
            }
         }
         if ( nGXsfl_241_fel_idx == 0 )
         {
            nGXsfl_241_idx = (short)(1) ;
            sGXsfl_241_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_241_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_2412( ) ;
         }
         nGXsfl_241_fel_idx = (short)(1) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         if ( (GXutil.strcmp("", AV110Archivo)==0) )
         {
            GXCCtlgxBlob = "vARCHIVO" + "_gxBlob" ;
            AV110Archivo = httpContext.cgiGet( GXCCtlgxBlob) ;
         }
         if ( (GXutil.strcmp("", AV69Nove_Soporte)==0) )
         {
            GXCCtlgxBlob = "vNOVE_SOPORTE" + "_gxBlob" ;
            AV69Nove_Soporte = httpContext.cgiGet( GXCCtlgxBlob) ;
         }
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
      e297Y2 ();
      if (returnInSub) return;
   }

   public void e297Y2( )
   {
      /* Start Routine */
      AV92Usuario = AV98Websession.getValue("Usuario") ;
      AV91Usua_Id = GXutil.lval( AV98Websession.getValue("UsuarioId")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91Usua_Id", GXutil.ltrim( GXutil.str( AV91Usua_Id, 18, 0)));
      AV37Cata_Descripcion = "." ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Cata_Descripcion", AV37Cata_Descripcion);
      /* Execute user subroutine: 'TIPO_NOVEDAD' */
      S112 ();
      if (returnInSub) return;
      cmbavNove_masivo.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavNove_masivo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavNove_masivo.getVisible(), 5, 0)), true);
      imgImage4_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage4_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage4_Visible, 5, 0)), true);
      edtavCedula_proveedor_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCedula_proveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCedula_proveedor_Visible, 5, 0)), true);
      edtavNombre_proveedor_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombre_proveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNombre_proveedor_Visible, 5, 0)), true);
      dynavOrig_identificador.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavOrig_identificador.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavOrig_identificador.getVisible(), 5, 0)), true);
      edtavNuevo_valor_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevo_valor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevo_valor_Visible, 5, 0)), true);
      edtavFecha_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFecha_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFecha_Visible, 5, 0)), true);
      imgImage1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage1_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage1_Visible, 5, 0)), true);
      edtavArea_codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_codigo_Visible, 5, 0)), true);
      edtavArea_descripcion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Visible, 5, 0)), true);
      imgImage2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage2_Visible, 5, 0)), true);
      edtavCurs_codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Visible, 5, 0)), true);
      edtavCurs_descripcion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Visible, 5, 0)), true);
      imgImage3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage3_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage3_Visible, 5, 0)), true);
      edtavCuentad_cedula_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuentad_cedula_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuentad_cedula_Visible, 5, 0)), true);
      edtavCuentad_nombre_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuentad_nombre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuentad_nombre_Visible, 5, 0)), true);
      edtavValor_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavValor_Visible, 5, 0)), true);
      edtavPlaca_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPlaca_Visible, 5, 0)), true);
      imgImage5_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage5_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage5_Visible, 5, 0)), true);
      divTable4_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable4_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable4_Visible, 5, 0)), true);
      divTable5_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable5_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable5_Visible, 5, 0)), true);
      divTable6_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable6_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable6_Visible, 5, 0)), true);
      divTable7_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable7_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable7_Visible, 5, 0)), true);
      divTable8_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable8_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable8_Visible, 5, 0)), true);
   }

   public void e177Y2( )
   {
      /* Tnov_codigo_Isvalid Routine */
      /* Using cursor H007Y3 */
      pr_default.execute(1, new Object[] {new Integer(AV89TNov_Codigo)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A104TNov_Codigo = H007Y3_A104TNov_Codigo[0] ;
         A771TNov_Nro_Cambios = H007Y3_A771TNov_Nro_Cambios[0] ;
         n771TNov_Nro_Cambios = H007Y3_n771TNov_Nro_Cambios[0] ;
         A813TNov_IngresoMasivo = H007Y3_A813TNov_IngresoMasivo[0] ;
         n813TNov_IngresoMasivo = H007Y3_n813TNov_IngresoMasivo[0] ;
         A774TNov_Nombre_Campo = H007Y3_A774TNov_Nombre_Campo[0] ;
         n774TNov_Nombre_Campo = H007Y3_n774TNov_Nombre_Campo[0] ;
         A772TNov_Procedimiento = H007Y3_A772TNov_Procedimiento[0] ;
         n772TNov_Procedimiento = H007Y3_n772TNov_Procedimiento[0] ;
         A770TNov_Tipo = H007Y3_A770TNov_Tipo[0] ;
         n770TNov_Tipo = H007Y3_n770TNov_Tipo[0] ;
         A839TNov_ObligaSoporte = H007Y3_A839TNov_ObligaSoporte[0] ;
         n839TNov_ObligaSoporte = H007Y3_n839TNov_ObligaSoporte[0] ;
         AV11TNov_Nro_Cambios = A771TNov_Nro_Cambios ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11TNov_Nro_Cambios", GXutil.ltrim( GXutil.str( AV11TNov_Nro_Cambios, 4, 0)));
         AV9TNov_IngresoMasivo = A813TNov_IngresoMasivo ;
         AV10TNov_Nombre_Campo = A774TNov_Nombre_Campo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10TNov_Nombre_Campo", AV10TNov_Nombre_Campo);
         AV12TNov_Procedimiento = A772TNov_Procedimiento ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12TNov_Procedimiento", AV12TNov_Procedimiento);
         AV14TNov_Tipo = A770TNov_Tipo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14TNov_Tipo", AV14TNov_Tipo);
         AV112TNov_ObligaSoporte = A839TNov_ObligaSoporte ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112TNov_ObligaSoporte", AV112TNov_ObligaSoporte);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Execute user subroutine: 'CAMPOS' */
      S122 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV9TNov_IngresoMasivo, "SI") == 0 )
      {
         cmbavNove_masivo.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavNove_masivo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavNove_masivo.getVisible(), 5, 0)), true);
      }
      else
      {
         cmbavNove_masivo.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavNove_masivo.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavNove_masivo.getVisible(), 5, 0)), true);
      }
      AV99SDTDetalle.clear();
      gx_BV241 = true ;
      AV80Placas = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Placas", AV80Placas);
      AV78Placa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78Placa", AV78Placa);
      AV101Tran_ConsecutivoCC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV101Tran_ConsecutivoCC, 18, 0)));
      AV70Nove_ValorAntiguo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Nove_ValorAntiguo", AV70Nove_ValorAntiguo);
      AV71Nove_ValorNuevo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
      AV44Descripcion_Antigua = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Descripcion_Antigua", AV44Descripcion_Antigua);
      AV38Cedula_Proveedor = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Cedula_Proveedor", GXutil.ltrim( GXutil.str( AV38Cedula_Proveedor, 18, 0)));
      AV52Nombre_Proveedor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Nombre_Proveedor", AV52Nombre_Proveedor);
      AV74Orig_Identificador = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Orig_Identificador", GXutil.ltrim( GXutil.str( AV74Orig_Identificador, 11, 0)));
      AV72Nuevo_Valor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Nuevo_Valor", AV72Nuevo_Valor);
      AV46Fecha = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Fecha", localUtil.format(AV46Fecha, "99/99/99"));
      AV33Area_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Area_Codigo", AV33Area_Codigo);
      AV42Curs_Codigo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Curs_Codigo", AV42Curs_Codigo);
      AV39Cuentad_Cedula = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Cuentad_Cedula", GXutil.ltrim( GXutil.str( AV39Cuentad_Cedula, 18, 0)));
      AV93Valor = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Valor", GXutil.ltrim( GXutil.str( AV93Valor, 18, 2)));
      AV67Nove_Observaciones = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Nove_Observaciones", AV67Nove_Observaciones);
      AV110Archivo = "" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArchivo_Internalname, "URL", httpContext.getResourceRelative(AV110Archivo), true);
      AV69Nove_Soporte = "" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNove_soporte_Internalname, "URL", httpContext.getResourceRelative(AV69Nove_Soporte), true);
      divTable7_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable7_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable7_Visible, 5, 0)), true);
      AV63Nove_Masivo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Nove_Masivo", AV63Nove_Masivo);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV99SDTDetalle", AV99SDTDetalle);
      nGXsfl_241_bak_idx = nGXsfl_241_idx ;
      gxgrgrid1_refresh( ) ;
      nGXsfl_241_idx = nGXsfl_241_bak_idx ;
      sGXsfl_241_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_241_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2412( ) ;
      dynavOrig_identificador.setValue( GXutil.trim( GXutil.str( AV74Orig_Identificador, 11, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynavOrig_identificador.getInternalname(), "Values", dynavOrig_identificador.ToJavascriptSource(), true);
      cmbavNove_masivo.setValue( GXutil.rtrim( AV63Nove_Masivo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavNove_masivo.getInternalname(), "Values", cmbavNove_masivo.ToJavascriptSource(), true);
   }

   public void e187Y2( )
   {
      /* Tran_consecutivocc_Isvalid Routine */
      /* Using cursor H007Y4 */
      pr_default.execute(2, new Object[] {new Long(AV90Tran_Id)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A416Tran_Observaciones = H007Y4_A416Tran_Observaciones[0] ;
         n416Tran_Observaciones = H007Y4_n416Tran_Observaciones[0] ;
         A51Tran_IdCuentadanteOrigen = H007Y4_A51Tran_IdCuentadanteOrigen[0] ;
         n51Tran_IdCuentadanteOrigen = H007Y4_n51Tran_IdCuentadanteOrigen[0] ;
         A46Tran_Id = H007Y4_A46Tran_Id[0] ;
         A420Tran_CentroCostoDescripcion = H007Y4_A420Tran_CentroCostoDescripcion[0] ;
         n420Tran_CentroCostoDescripcion = H007Y4_n420Tran_CentroCostoDescripcion[0] ;
         A419Tran_CentroCostoCodigo = H007Y4_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = H007Y4_n419Tran_CentroCostoCodigo[0] ;
         A48Tran_CentroCostoId = H007Y4_A48Tran_CentroCostoId[0] ;
         A381Tran_DescripcionMovimiento = H007Y4_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = H007Y4_n381Tran_DescripcionMovimiento[0] ;
         A49Tran_CodigoMovimiento = H007Y4_A49Tran_CodigoMovimiento[0] ;
         A110Tran_ModuloOrigen = H007Y4_A110Tran_ModuloOrigen[0] ;
         A109Tran_CodAlmaOrigen = H007Y4_A109Tran_CodAlmaOrigen[0] ;
         A390Tran_FechaRatificacion = H007Y4_A390Tran_FechaRatificacion[0] ;
         n390Tran_FechaRatificacion = H007Y4_n390Tran_FechaRatificacion[0] ;
         A55Tran_FechaRegistro = H007Y4_A55Tran_FechaRegistro[0] ;
         A112Tran_CodBodeOrigen = H007Y4_A112Tran_CodBodeOrigen[0] ;
         A702Tran_CedulaCuentadanteOrigen = H007Y4_A702Tran_CedulaCuentadanteOrigen[0] ;
         n702Tran_CedulaCuentadanteOrigen = H007Y4_n702Tran_CedulaCuentadanteOrigen[0] ;
         A575Tran_NombreProveedor = H007Y4_A575Tran_NombreProveedor[0] ;
         n575Tran_NombreProveedor = H007Y4_n575Tran_NombreProveedor[0] ;
         A703Tran_CedulaProveedor = H007Y4_A703Tran_CedulaProveedor[0] ;
         n703Tran_CedulaProveedor = H007Y4_n703Tran_CedulaProveedor[0] ;
         A384Tran_NombCuentadanteOrigen = H007Y4_A384Tran_NombCuentadanteOrigen[0] ;
         n384Tran_NombCuentadanteOrigen = H007Y4_n384Tran_NombCuentadanteOrigen[0] ;
         A385Tran_ModuloDestino = H007Y4_A385Tran_ModuloDestino[0] ;
         A111Tran_CodAlmaDestino = H007Y4_A111Tran_CodAlmaDestino[0] ;
         A387Tran_CodBodeDestino = H007Y4_A387Tran_CodBodeDestino[0] ;
         A389Tran_NombCuentadanteDestino = H007Y4_A389Tran_NombCuentadanteDestino[0] ;
         n389Tran_NombCuentadanteDestino = H007Y4_n389Tran_NombCuentadanteDestino[0] ;
         A704Tran_CedulaCuentadanteDestino = H007Y4_A704Tran_CedulaCuentadanteDestino[0] ;
         n704Tran_CedulaCuentadanteDestino = H007Y4_n704Tran_CedulaCuentadanteDestino[0] ;
         A53Tran_IdProveedor = H007Y4_A53Tran_IdProveedor[0] ;
         n53Tran_IdProveedor = H007Y4_n53Tran_IdProveedor[0] ;
         A54Tran_TipoIngreso = H007Y4_A54Tran_TipoIngreso[0] ;
         n54Tran_TipoIngreso = H007Y4_n54Tran_TipoIngreso[0] ;
         A672Tran_NombreIngreso = H007Y4_A672Tran_NombreIngreso[0] ;
         n672Tran_NombreIngreso = H007Y4_n672Tran_NombreIngreso[0] ;
         A514Tran_NumeroIngreso = H007Y4_A514Tran_NumeroIngreso[0] ;
         n514Tran_NumeroIngreso = H007Y4_n514Tran_NumeroIngreso[0] ;
         A515Tran_FechaIngreso = H007Y4_A515Tran_FechaIngreso[0] ;
         n515Tran_FechaIngreso = H007Y4_n515Tran_FechaIngreso[0] ;
         A407Tran_AreadanteCodigo = H007Y4_A407Tran_AreadanteCodigo[0] ;
         n407Tran_AreadanteCodigo = H007Y4_n407Tran_AreadanteCodigo[0] ;
         A408Tran_CursoCodigo = H007Y4_A408Tran_CursoCodigo[0] ;
         n408Tran_CursoCodigo = H007Y4_n408Tran_CursoCodigo[0] ;
         A52Tran_IdCuentadanteDestino = H007Y4_A52Tran_IdCuentadanteDestino[0] ;
         n52Tran_IdCuentadanteDestino = H007Y4_n52Tran_IdCuentadanteDestino[0] ;
         A702Tran_CedulaCuentadanteOrigen = H007Y4_A702Tran_CedulaCuentadanteOrigen[0] ;
         n702Tran_CedulaCuentadanteOrigen = H007Y4_n702Tran_CedulaCuentadanteOrigen[0] ;
         A384Tran_NombCuentadanteOrigen = H007Y4_A384Tran_NombCuentadanteOrigen[0] ;
         n384Tran_NombCuentadanteOrigen = H007Y4_n384Tran_NombCuentadanteOrigen[0] ;
         A420Tran_CentroCostoDescripcion = H007Y4_A420Tran_CentroCostoDescripcion[0] ;
         n420Tran_CentroCostoDescripcion = H007Y4_n420Tran_CentroCostoDescripcion[0] ;
         A419Tran_CentroCostoCodigo = H007Y4_A419Tran_CentroCostoCodigo[0] ;
         n419Tran_CentroCostoCodigo = H007Y4_n419Tran_CentroCostoCodigo[0] ;
         A381Tran_DescripcionMovimiento = H007Y4_A381Tran_DescripcionMovimiento[0] ;
         n381Tran_DescripcionMovimiento = H007Y4_n381Tran_DescripcionMovimiento[0] ;
         A575Tran_NombreProveedor = H007Y4_A575Tran_NombreProveedor[0] ;
         n575Tran_NombreProveedor = H007Y4_n575Tran_NombreProveedor[0] ;
         A703Tran_CedulaProveedor = H007Y4_A703Tran_CedulaProveedor[0] ;
         n703Tran_CedulaProveedor = H007Y4_n703Tran_CedulaProveedor[0] ;
         A672Tran_NombreIngreso = H007Y4_A672Tran_NombreIngreso[0] ;
         n672Tran_NombreIngreso = H007Y4_n672Tran_NombreIngreso[0] ;
         A389Tran_NombCuentadanteDestino = H007Y4_A389Tran_NombCuentadanteDestino[0] ;
         n389Tran_NombCuentadanteDestino = H007Y4_n389Tran_NombCuentadanteDestino[0] ;
         A704Tran_CedulaCuentadanteDestino = H007Y4_A704Tran_CedulaCuentadanteDestino[0] ;
         n704Tran_CedulaCuentadanteDestino = H007Y4_n704Tran_CedulaCuentadanteDestino[0] ;
         AV59Nove_CentroDescripcion = A419Tran_CentroCostoCodigo + "-" + A420Tran_CentroCostoDescripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59Nove_CentroDescripcion", AV59Nove_CentroDescripcion);
         AV6Cent_Id = A48Tran_CentroCostoId ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Cent_Id", GXutil.ltrim( GXutil.str( AV6Cent_Id, 11, 0)));
         AV5Cent_Codigo = A419Tran_CentroCostoCodigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Cent_Codigo", AV5Cent_Codigo);
         AV66Nove_MovimientoDescrip = A49Tran_CodigoMovimiento + "-" + A381Tran_DescripcionMovimiento ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66Nove_MovimientoDescrip", AV66Nove_MovimientoDescrip);
         AV65Nove_ModuloOrigen = A110Tran_ModuloOrigen ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65Nove_ModuloOrigen", AV65Nove_ModuloOrigen);
         AV32Alma_Modulo = A110Tran_ModuloOrigen ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Alma_Modulo", AV32Alma_Modulo);
         AV30Alma_Codigo = A109Tran_CodAlmaOrigen ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Alma_Codigo", AV30Alma_Codigo);
         AV119FechaTran = A390Tran_FechaRatificacion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV119FechaTran", localUtil.ttoc( AV119FechaTran, 8, 5, 0, 3, "/", ":", " "));
         AV122FechaRegistro = A55Tran_FechaRegistro ;
         httpContext.ajax_rsp_assign_attri("", false, "AV122FechaRegistro", localUtil.ttoc( AV122FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         /* Execute user subroutine: 'ALMACEN' */
         S134 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         AV54Nove_AlmaDescripcionOrig = AV30Alma_Codigo + "-" + AV31Alma_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54Nove_AlmaDescripcionOrig", AV54Nove_AlmaDescripcionOrig);
         AV35Bode_Codigo = A112Tran_CodBodeOrigen ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Bode_Codigo", AV35Bode_Codigo);
         /* Execute user subroutine: 'BODEGA' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         AV56Nove_BodeDescripcionOrig = AV35Bode_Codigo + "-" + AV36Bode_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Nove_BodeDescripcionOrig", AV56Nove_BodeDescripcionOrig);
         if ( (0==A702Tran_CedulaCuentadanteOrigen) )
         {
            AV61Nove_CuentadanteNomOrigen = GXutil.str( A703Tran_CedulaProveedor, 18, 0) + "-" + A575Tran_NombreProveedor ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61Nove_CuentadanteNomOrigen", AV61Nove_CuentadanteNomOrigen);
         }
         else
         {
            AV61Nove_CuentadanteNomOrigen = GXutil.str( A702Tran_CedulaCuentadanteOrigen, 18, 0) + "-" + A384Tran_NombCuentadanteOrigen ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61Nove_CuentadanteNomOrigen", AV61Nove_CuentadanteNomOrigen);
         }
         AV64Nove_ModuloDestino = A385Tran_ModuloDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Nove_ModuloDestino", AV64Nove_ModuloDestino);
         AV32Alma_Modulo = A385Tran_ModuloDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Alma_Modulo", AV32Alma_Modulo);
         AV30Alma_Codigo = A111Tran_CodAlmaDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Alma_Codigo", AV30Alma_Codigo);
         /* Execute user subroutine: 'ALMACEN' */
         S134 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         AV53Nove_AlmaDescripcionDesti = AV30Alma_Codigo + "-" + AV31Alma_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Nove_AlmaDescripcionDesti", AV53Nove_AlmaDescripcionDesti);
         AV35Bode_Codigo = A387Tran_CodBodeDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Bode_Codigo", AV35Bode_Codigo);
         /* Execute user subroutine: 'BODEGA' */
         S144 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         AV55Nove_BodeDescripcionDesti = AV35Bode_Codigo + "-" + AV36Bode_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55Nove_BodeDescripcionDesti", AV55Nove_BodeDescripcionDesti);
         AV60Nove_CuentadanteNomDestino = GXutil.str( A704Tran_CedulaCuentadanteDestino, 18, 0) + "-" + A389Tran_NombCuentadanteDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60Nove_CuentadanteNomDestino", AV60Nove_CuentadanteNomDestino);
         AV18Tran_CedulaProveedor = A703Tran_CedulaProveedor ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Tran_CedulaProveedor", GXutil.ltrim( GXutil.str( AV18Tran_CedulaProveedor, 18, 0)));
         AV26Tran_NombreProveedor = A575Tran_NombreProveedor ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Tran_NombreProveedor", AV26Tran_NombreProveedor);
         AV23Tran_IdProveedor = A53Tran_IdProveedor ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Tran_IdProveedor", GXutil.ltrim( GXutil.str( AV23Tran_IdProveedor, 18, 0)));
         AV29Tran_TipoIngreso = A54Tran_TipoIngreso ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Tran_TipoIngreso", GXutil.ltrim( GXutil.str( AV29Tran_TipoIngreso, 11, 0)));
         AV104Tran_NombreIngreso = A672Tran_NombreIngreso ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104Tran_NombreIngreso", AV104Tran_NombreIngreso);
         AV27Tran_NumeroIngreso = A514Tran_NumeroIngreso ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Tran_NumeroIngreso", AV27Tran_NumeroIngreso);
         AV21Tran_FechaIngreso = A515Tran_FechaIngreso ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Tran_FechaIngreso", localUtil.format(AV21Tran_FechaIngreso, "99/99/99"));
         AV28Tran_Observaciones = A416Tran_Observaciones ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Tran_Observaciones", AV28Tran_Observaciones);
         AV15Tran_AreadanteCodigo = A407Tran_AreadanteCodigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Tran_AreadanteCodigo", AV15Tran_AreadanteCodigo);
         AV19Tran_CursoCodigo = A408Tran_CursoCodigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Tran_CursoCodigo", AV19Tran_CursoCodigo);
         AV22Tran_IdCuentadanteDestino = A52Tran_IdCuentadanteDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22Tran_IdCuentadanteDestino", GXutil.ltrim( GXutil.str( AV22Tran_IdCuentadanteDestino, 18, 0)));
         AV17Tran_CedulaCuentadanteDestino = A704Tran_CedulaCuentadanteDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Tran_CedulaCuentadanteDestino", GXutil.ltrim( GXutil.str( AV17Tran_CedulaCuentadanteDestino, 18, 0)));
         AV24Tran_NombCuentadanteDestino = A389Tran_NombCuentadanteDestino ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Tran_NombCuentadanteDestino", AV24Tran_NombCuentadanteDestino);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void e197Y2( )
   {
      AV137GXV1 = nGXsfl_241_idx ;
      if ( AV99SDTDetalle.size() >= AV137GXV1 )
      {
         AV99SDTDetalle.currentItem( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)) );
      }
      /* Nove_observaciones_Isvalid Routine */
      GXv_int2[0] = AV90Tran_Id ;
      GXv_int3[0] = AV89TNov_Codigo ;
      GXv_int4[0] = AV11TNov_Nro_Cambios ;
      GXv_char5[0] = AV77Permitido ;
      new com.orions2.pvalidanovedad(remoteHandle, context).execute( GXv_int2, GXv_int3, GXv_int4, GXv_char5) ;
      wp_novedades_impl.this.AV90Tran_Id = GXv_int2[0] ;
      wp_novedades_impl.this.AV89TNov_Codigo = GXv_int3[0] ;
      wp_novedades_impl.this.AV11TNov_Nro_Cambios = GXv_int4[0] ;
      wp_novedades_impl.this.AV77Permitido = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Tran_Id", GXutil.ltrim( GXutil.str( AV90Tran_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV89TNov_Codigo", GXutil.ltrim( GXutil.str( AV89TNov_Codigo, 6, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TNov_Nro_Cambios", GXutil.ltrim( GXutil.str( AV11TNov_Nro_Cambios, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV77Permitido", AV77Permitido);
      if ( GXutil.strcmp(AV77Permitido, "SI") == 0 )
      {
         if ( GXutil.strcmp(AV63Nove_Masivo, "SI") != 0 )
         {
            AV81Programa = "'" + GXutil.trim( AV12TNov_Procedimiento) + "'" ;
            edtavDescripcion_antigua_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDescripcion_antigua_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavDescripcion_antigua_Visible, 5, 0)), true);
            if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_IdProveedor") == 0 )
            {
               AV70Nove_ValorAntiguo = GXutil.str( AV23Tran_IdProveedor, 18, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70Nove_ValorAntiguo", AV70Nove_ValorAntiguo);
               AV44Descripcion_Antigua = GXutil.str( AV18Tran_CedulaProveedor, 18, 0) + "-" + AV26Tran_NombreProveedor ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Descripcion_Antigua", AV44Descripcion_Antigua);
               imgImage4_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, imgImage4_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage4_Visible, 5, 0)), true);
               edtavCedula_proveedor_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCedula_proveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCedula_proveedor_Visible, 5, 0)), true);
               edtavNombre_proveedor_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavNombre_proveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNombre_proveedor_Visible, 5, 0)), true);
            }
            else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_TipoIngreso") == 0 )
            {
               divTable8_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, divTable8_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable8_Visible, 5, 0)), true);
               AV70Nove_ValorAntiguo = GXutil.str( AV29Tran_TipoIngreso, 11, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70Nove_ValorAntiguo", AV70Nove_ValorAntiguo);
               AV115Ant_NumeroIngreso = AV27Tran_NumeroIngreso ;
               httpContext.ajax_rsp_assign_attri("", false, "AV115Ant_NumeroIngreso", AV115Ant_NumeroIngreso);
               AV116Ant_FechaIngreso = AV21Tran_FechaIngreso ;
               httpContext.ajax_rsp_assign_attri("", false, "AV116Ant_FechaIngreso", localUtil.format(AV116Ant_FechaIngreso, "99/99/99"));
               AV117Ant_NombreIngreso = AV104Tran_NombreIngreso ;
               httpContext.ajax_rsp_assign_attri("", false, "AV117Ant_NombreIngreso", AV117Ant_NombreIngreso);
               AV74Orig_Identificador = AV29Tran_TipoIngreso ;
               httpContext.ajax_rsp_assign_attri("", false, "AV74Orig_Identificador", GXutil.ltrim( GXutil.str( AV74Orig_Identificador, 11, 0)));
               AV118New_NumeroIngreso = AV27Tran_NumeroIngreso ;
               httpContext.ajax_rsp_assign_attri("", false, "AV118New_NumeroIngreso", AV118New_NumeroIngreso);
               AV46Fecha = AV21Tran_FechaIngreso ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46Fecha", localUtil.format(AV46Fecha, "99/99/99"));
               dynavOrig_identificador.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, dynavOrig_identificador.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavOrig_identificador.getVisible(), 5, 0)), true);
               edtavNew_numeroingreso_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavNew_numeroingreso_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNew_numeroingreso_Visible, 5, 0)), true);
               edtavFecha_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavFecha_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFecha_Visible, 5, 0)), true);
            }
            else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_Observaciones") == 0 )
            {
               AV70Nove_ValorAntiguo = AV28Tran_Observaciones ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70Nove_ValorAntiguo", AV70Nove_ValorAntiguo);
               AV44Descripcion_Antigua = AV28Tran_Observaciones ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Descripcion_Antigua", AV44Descripcion_Antigua);
               edtavNuevo_valor_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavNuevo_valor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevo_valor_Visible, 5, 0)), true);
            }
            else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_AreadanteCodigo") == 0 )
            {
               AV70Nove_ValorAntiguo = AV15Tran_AreadanteCodigo ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70Nove_ValorAntiguo", AV70Nove_ValorAntiguo);
               /* Execute user subroutine: 'DESCRIP_AREADANTE' */
               S152 ();
               if (returnInSub) return;
               AV44Descripcion_Antigua = AV15Tran_AreadanteCodigo + "-" + AV16Tran_AreadanteDescripcion ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Descripcion_Antigua", AV44Descripcion_Antigua);
               imgImage1_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, imgImage1_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage1_Visible, 5, 0)), true);
               edtavArea_codigo_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_codigo_Visible, 5, 0)), true);
               edtavArea_descripcion_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Visible, 5, 0)), true);
            }
            else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_CursoCodigo") == 0 )
            {
               AV70Nove_ValorAntiguo = AV19Tran_CursoCodigo ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70Nove_ValorAntiguo", AV70Nove_ValorAntiguo);
               /* Execute user subroutine: 'DESCRIP_CURSO' */
               S162 ();
               if (returnInSub) return;
               AV44Descripcion_Antigua = AV19Tran_CursoCodigo + "-" + AV20Tran_CursoDescripcion ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Descripcion_Antigua", AV44Descripcion_Antigua);
               imgImage2_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage2_Visible, 5, 0)), true);
               edtavCurs_codigo_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Visible, 5, 0)), true);
               edtavCurs_descripcion_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Visible, 5, 0)), true);
            }
            else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_IdCuentadanteDestino") == 0 )
            {
               AV70Nove_ValorAntiguo = GXutil.str( AV22Tran_IdCuentadanteDestino, 18, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70Nove_ValorAntiguo", AV70Nove_ValorAntiguo);
               AV44Descripcion_Antigua = GXutil.str( AV17Tran_CedulaCuentadanteDestino, 18, 0) + "-" + AV24Tran_NombCuentadanteDestino ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Descripcion_Antigua", AV44Descripcion_Antigua);
               imgImage3_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, imgImage3_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage3_Visible, 5, 0)), true);
               edtavCuentad_cedula_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCuentad_cedula_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuentad_cedula_Visible, 5, 0)), true);
               edtavCuentad_nombre_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCuentad_nombre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuentad_nombre_Visible, 5, 0)), true);
            }
            else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "TDet_ListId") == 0 )
            {
               AV99SDTDetalle.clear();
               gx_BV241 = true ;
               GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 = AV99SDTDetalle ;
               GXv_char5[0] = AV10TNov_Nombre_Campo ;
               GXv_char7[0] = AV78Placa ;
               GXv_int2[0] = AV90Tran_Id ;
               GXv_objcol_SdtSDTDetalle_SDTDetalleItem8[0] = GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 ;
               new com.orions2.pnovedadesdetalle(remoteHandle, context).execute( GXv_char5, GXv_char7, GXv_int2, GXv_objcol_SdtSDTDetalle_SDTDetalleItem8) ;
               wp_novedades_impl.this.AV10TNov_Nombre_Campo = GXv_char5[0] ;
               wp_novedades_impl.this.AV78Placa = GXv_char7[0] ;
               wp_novedades_impl.this.AV90Tran_Id = GXv_int2[0] ;
               GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 = GXv_objcol_SdtSDTDetalle_SDTDetalleItem8[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10TNov_Nombre_Campo", AV10TNov_Nombre_Campo);
               httpContext.ajax_rsp_assign_attri("", false, "AV78Placa", AV78Placa);
               httpContext.ajax_rsp_assign_attri("", false, "AV90Tran_Id", GXutil.ltrim( GXutil.str( AV90Tran_Id, 11, 0)));
               AV99SDTDetalle = GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 ;
               gx_BV241 = true ;
               divTable5_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, divTable5_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable5_Visible, 5, 0)), true);
               edtavCtlcantidadactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlcantidadactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlcantidadactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlcantidadnueva_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlcantidadnueva_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlcantidadnueva_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlconsecutivoactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivoactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlconsecutivoactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlconsecutivonuevo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivonuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlconsecutivonuevo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlplacapadreactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlplacapadreactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlplacapadreactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlplacapadrenueva_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlplacapadrenueva_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlplacapadrenueva_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlplaca_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlplaca_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlconsecutivo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlconsecutivo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlvaloractual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlvaloractual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlvaloractual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlvalornuevo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalornuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlvalornuevo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
            }
            else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Invd_ValorAdquisicion") == 0 )
            {
               AV70Nove_ValorAntiguo = GXutil.str( AV48Invd_ValorAdquisicion, 18, 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70Nove_ValorAntiguo", AV70Nove_ValorAntiguo);
               AV44Descripcion_Antigua = GXutil.str( AV48Invd_ValorAdquisicion, 18, 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Descripcion_Antigua", AV44Descripcion_Antigua);
               edtavValor_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavValor_Visible, 5, 0)), true);
               divTable4_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, divTable4_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable4_Visible, 5, 0)), true);
               divTable5_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, divTable5_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable5_Visible, 5, 0)), true);
            }
            else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Otros_Costos_Dev") == 0 )
            {
               AV70Nove_ValorAntiguo = GXutil.str( AV75Otros_Costos_Dev, 18, 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70Nove_ValorAntiguo", AV70Nove_ValorAntiguo);
               AV44Descripcion_Antigua = GXutil.str( AV75Otros_Costos_Dev, 18, 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Descripcion_Antigua", AV44Descripcion_Antigua);
               edtavValor_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavValor_Visible, 5, 0)), true);
               divTable4_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, divTable4_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable4_Visible, 5, 0)), true);
               divTable5_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, divTable5_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable5_Visible, 5, 0)), true);
            }
            else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Variable_VF") == 0 )
            {
               AV99SDTDetalle.clear();
               gx_BV241 = true ;
               GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 = AV99SDTDetalle ;
               GXv_char7[0] = AV10TNov_Nombre_Campo ;
               GXv_char5[0] = AV78Placa ;
               GXv_int2[0] = AV90Tran_Id ;
               GXv_objcol_SdtSDTDetalle_SDTDetalleItem8[0] = GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 ;
               new com.orions2.pnovedadesdetalle(remoteHandle, context).execute( GXv_char7, GXv_char5, GXv_int2, GXv_objcol_SdtSDTDetalle_SDTDetalleItem8) ;
               wp_novedades_impl.this.AV10TNov_Nombre_Campo = GXv_char7[0] ;
               wp_novedades_impl.this.AV78Placa = GXv_char5[0] ;
               wp_novedades_impl.this.AV90Tran_Id = GXv_int2[0] ;
               GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 = GXv_objcol_SdtSDTDetalle_SDTDetalleItem8[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10TNov_Nombre_Campo", AV10TNov_Nombre_Campo);
               httpContext.ajax_rsp_assign_attri("", false, "AV78Placa", AV78Placa);
               httpContext.ajax_rsp_assign_attri("", false, "AV90Tran_Id", GXutil.ltrim( GXutil.str( AV90Tran_Id, 11, 0)));
               AV99SDTDetalle = GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 ;
               gx_BV241 = true ;
               divTable5_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, divTable5_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable5_Visible, 5, 0)), true);
               edtavCtlcantidadactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlcantidadactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlcantidadactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlcantidadnueva_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlcantidadnueva_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlcantidadnueva_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlconsecutivoactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivoactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlconsecutivoactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlconsecutivonuevo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivonuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlconsecutivonuevo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlplacapadreactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlplacapadreactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlplacapadreactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlplacapadrenueva_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlplacapadrenueva_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlplacapadrenueva_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlplaca_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlplaca_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlconsecutivo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlconsecutivo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlatributoactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlatributoactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlatributoactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlatributonuevo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlatributonuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlatributonuevo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
            }
            else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Vida_Util_Actual") == 0 )
            {
               AV70Nove_ValorAntiguo = GXutil.str( AV97Vida_Util_Actual, 4, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70Nove_ValorAntiguo", AV70Nove_ValorAntiguo);
               AV44Descripcion_Antigua = GXutil.str( AV97Vida_Util_Actual, 4, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV44Descripcion_Antigua", AV44Descripcion_Antigua);
               edtavValor_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavValor_Visible, 5, 0)), true);
               divTable4_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, divTable4_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable4_Visible, 5, 0)), true);
               divTable5_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, divTable5_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable5_Visible, 5, 0)), true);
            }
            else if ( ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Desasociar") == 0 ) || ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Asociar") == 0 ) )
            {
               AV99SDTDetalle.clear();
               gx_BV241 = true ;
               GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 = AV99SDTDetalle ;
               GXv_char7[0] = AV10TNov_Nombre_Campo ;
               GXv_char5[0] = AV78Placa ;
               GXv_int2[0] = AV90Tran_Id ;
               GXv_objcol_SdtSDTDetalle_SDTDetalleItem8[0] = GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 ;
               new com.orions2.pnovedadesdetalle(remoteHandle, context).execute( GXv_char7, GXv_char5, GXv_int2, GXv_objcol_SdtSDTDetalle_SDTDetalleItem8) ;
               wp_novedades_impl.this.AV10TNov_Nombre_Campo = GXv_char7[0] ;
               wp_novedades_impl.this.AV78Placa = GXv_char5[0] ;
               wp_novedades_impl.this.AV90Tran_Id = GXv_int2[0] ;
               GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 = GXv_objcol_SdtSDTDetalle_SDTDetalleItem8[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10TNov_Nombre_Campo", AV10TNov_Nombre_Campo);
               httpContext.ajax_rsp_assign_attri("", false, "AV78Placa", AV78Placa);
               httpContext.ajax_rsp_assign_attri("", false, "AV90Tran_Id", GXutil.ltrim( GXutil.str( AV90Tran_Id, 11, 0)));
               AV99SDTDetalle = GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 ;
               gx_BV241 = true ;
               divTable5_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, divTable5_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable5_Visible, 5, 0)), true);
               edtavCtlcantidadactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlcantidadactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlcantidadactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlcantidadnueva_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlcantidadnueva_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlcantidadnueva_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlconsecutivoactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivoactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlconsecutivoactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlconsecutivonuevo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivonuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlconsecutivonuevo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlnro_linea_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlnro_linea_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlnro_linea_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlatributoactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlatributoactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlatributoactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlatributonuevo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlatributonuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlatributonuevo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlvaloractual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlvaloractual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlvaloractual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlvalornuevo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalornuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlvalornuevo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Asociar") == 0 )
               {
                  edtavCtlplacapadrenueva_Enabled = 0 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavCtlplacapadrenueva_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlplacapadrenueva_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
               }
            }
            else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Elem_consecutivo") == 0 )
            {
               AV99SDTDetalle.clear();
               gx_BV241 = true ;
               GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 = AV99SDTDetalle ;
               GXv_char7[0] = AV10TNov_Nombre_Campo ;
               GXv_char5[0] = AV78Placa ;
               GXv_int2[0] = AV90Tran_Id ;
               GXv_objcol_SdtSDTDetalle_SDTDetalleItem8[0] = GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 ;
               new com.orions2.pnovedadesdetalle(remoteHandle, context).execute( GXv_char7, GXv_char5, GXv_int2, GXv_objcol_SdtSDTDetalle_SDTDetalleItem8) ;
               wp_novedades_impl.this.AV10TNov_Nombre_Campo = GXv_char7[0] ;
               wp_novedades_impl.this.AV78Placa = GXv_char5[0] ;
               wp_novedades_impl.this.AV90Tran_Id = GXv_int2[0] ;
               GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 = GXv_objcol_SdtSDTDetalle_SDTDetalleItem8[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10TNov_Nombre_Campo", AV10TNov_Nombre_Campo);
               httpContext.ajax_rsp_assign_attri("", false, "AV78Placa", AV78Placa);
               httpContext.ajax_rsp_assign_attri("", false, "AV90Tran_Id", GXutil.ltrim( GXutil.str( AV90Tran_Id, 11, 0)));
               AV99SDTDetalle = GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 ;
               gx_BV241 = true ;
               divTable5_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, divTable5_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable5_Visible, 5, 0)), true);
               edtavCtlconsecutivo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlconsecutivo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlcantidadactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlcantidadactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlcantidadactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlcantidadnueva_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlcantidadnueva_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlcantidadnueva_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlplacapadreactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlplacapadreactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlplacapadreactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlplacapadrenueva_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlplacapadrenueva_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlplacapadrenueva_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlplaca_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlplaca_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlatributoactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlatributoactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlatributoactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlatributonuevo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlatributonuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlatributonuevo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlvaloractual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlvaloractual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlvaloractual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlvalornuevo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalornuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlvalornuevo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
            }
            else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "TDet_Cantidad") == 0 )
            {
               AV99SDTDetalle.clear();
               gx_BV241 = true ;
               GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 = AV99SDTDetalle ;
               GXv_char7[0] = AV10TNov_Nombre_Campo ;
               GXv_char5[0] = AV78Placa ;
               GXv_int2[0] = AV90Tran_Id ;
               GXv_objcol_SdtSDTDetalle_SDTDetalleItem8[0] = GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 ;
               new com.orions2.pnovedadesdetalle(remoteHandle, context).execute( GXv_char7, GXv_char5, GXv_int2, GXv_objcol_SdtSDTDetalle_SDTDetalleItem8) ;
               wp_novedades_impl.this.AV10TNov_Nombre_Campo = GXv_char7[0] ;
               wp_novedades_impl.this.AV78Placa = GXv_char5[0] ;
               wp_novedades_impl.this.AV90Tran_Id = GXv_int2[0] ;
               GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 = GXv_objcol_SdtSDTDetalle_SDTDetalleItem8[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10TNov_Nombre_Campo", AV10TNov_Nombre_Campo);
               httpContext.ajax_rsp_assign_attri("", false, "AV78Placa", AV78Placa);
               httpContext.ajax_rsp_assign_attri("", false, "AV90Tran_Id", GXutil.ltrim( GXutil.str( AV90Tran_Id, 11, 0)));
               AV99SDTDetalle = GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 ;
               gx_BV241 = true ;
               divTable5_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, divTable5_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable5_Visible, 5, 0)), true);
               edtavCtlconsecutivoactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivoactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlconsecutivoactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlconsecutivonuevo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlconsecutivonuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlconsecutivonuevo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlplacapadreactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlplacapadreactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlplacapadreactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlplacapadrenueva_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlplacapadrenueva_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlplacapadrenueva_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlatributoactual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlatributoactual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlatributoactual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlatributonuevo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlatributonuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlatributonuevo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlvaloractual_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlvaloractual_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlvaloractual_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               edtavCtlvalornuevo_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalornuevo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlvalornuevo_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               if ( GXutil.strcmp(AV12TNov_Procedimiento, "PRC_CTD_CON") == 0 )
               {
                  edtavCtlplaca_Visible = 0 ;
                  httpContext.ajax_rsp_assign_prop("", false, edtavCtlplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCtlplaca_Visible, 5, 0)), !bGXsfl_241_Refreshing);
               }
            }
         }
         else
         {
         }
      }
      else
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Excede el número de novedades permitidas para esta transacción " ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      cmbavTnov_codigo.setValue( GXutil.trim( GXutil.str( AV89TNov_Codigo, 6, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTnov_codigo.getInternalname(), "Values", cmbavTnov_codigo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV99SDTDetalle", AV99SDTDetalle);
      nGXsfl_241_bak_idx = nGXsfl_241_idx ;
      gxgrgrid1_refresh( ) ;
      nGXsfl_241_idx = nGXsfl_241_bak_idx ;
      sGXsfl_241_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_241_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2412( ) ;
      dynavOrig_identificador.setValue( GXutil.trim( GXutil.str( AV74Orig_Identificador, 11, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynavOrig_identificador.getInternalname(), "Values", dynavOrig_identificador.ToJavascriptSource(), true);
   }

   public void e207Y2( )
   {
      AV137GXV1 = nGXsfl_241_idx ;
      if ( AV99SDTDetalle.size() >= AV137GXV1 )
      {
         AV99SDTDetalle.currentItem( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)) );
      }
      /* 'Confirmar' Routine */
      if ( GXutil.strcmp(AV63Nove_Masivo, "SI") != 0 )
      {
         if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_IdProveedor") == 0 )
         {
            AV71Nove_ValorNuevo = GXutil.str( AV47Ide_Proveedor, 18, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
         }
         else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_TipoIngreso") == 0 )
         {
            AV71Nove_ValorNuevo = GXutil.str( AV74Orig_Identificador, 11, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
            AV86SDTNovedadesDetalleItem = (com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
            AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea( 1 );
            AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn( 1 );
            AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo( AV70Nove_ValorAntiguo );
            AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo( GXutil.str( AV74Orig_Identificador, 11, 0) );
            AV85SDTNovedadesDetalle.add(AV86SDTNovedadesDetalleItem, 0);
            AV86SDTNovedadesDetalleItem = (com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
            AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea( 2 );
            AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn( 2 );
            AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo( AV115Ant_NumeroIngreso );
            AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo( AV118New_NumeroIngreso );
            AV85SDTNovedadesDetalle.add(AV86SDTNovedadesDetalleItem, 0);
            AV86SDTNovedadesDetalleItem = (com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
            AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea( 3 );
            AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn( 3 );
            AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo( localUtil.dtoc( AV116Ant_FechaIngreso, 3, "/") );
            AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo( localUtil.dtoc( AV46Fecha, 3, "/") );
            AV85SDTNovedadesDetalle.add(AV86SDTNovedadesDetalleItem, 0);
         }
         else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_Observaciones") == 0 )
         {
            AV71Nove_ValorNuevo = AV72Nuevo_Valor ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
         }
         else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Anulacion") == 0 )
         {
            AV71Nove_ValorNuevo = "Anulacion" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
         }
         else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_AreadanteCodigo") == 0 )
         {
            AV71Nove_ValorNuevo = AV33Area_Codigo ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
         }
         else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_CursoCodigo") == 0 )
         {
            AV71Nove_ValorNuevo = AV42Curs_Codigo ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
         }
         else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_IdCuentadanteDestino") == 0 )
         {
            AV71Nove_ValorNuevo = GXutil.str( AV40Cuentad_Id, 18, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
         }
         else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Invd_ValorAdquisicion") == 0 )
         {
            AV71Nove_ValorNuevo = GXutil.str( AV93Valor, 18, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
         }
         else if ( ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Otros_Costos_Dev") == 0 ) || ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Vida_Util_Actual") == 0 ) )
         {
            AV71Nove_ValorNuevo = GXutil.str( AV93Valor, 18, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
         }
         else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Variable_VF") == 0 )
         {
            AV49Linea = 1 ;
            AV71Nove_ValorNuevo = AV10TNov_Nombre_Campo ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
            AV154GXV2 = 1 ;
            while ( AV154GXV2 <= AV99SDTDetalle.size() )
            {
               AV100SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV154GXV2));
               AV86SDTNovedadesDetalleItem = (com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea( AV49Linea );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn( AV49Linea );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo( GXutil.str( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual(), 10, 2) );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo( GXutil.str( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo(), 10, 2) );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo() );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa( AV78Placa );
               AV85SDTNovedadesDetalle.add(AV86SDTNovedadesDetalleItem, 0);
               AV49Linea = (int)(AV49Linea+1) ;
               AV154GXV2 = (int)(AV154GXV2+1) ;
            }
         }
         else if ( ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Desasociar") == 0 ) || ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Asociar") == 0 ) )
         {
            AV49Linea = 1 ;
            AV71Nove_ValorNuevo = AV10TNov_Nombre_Campo ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
            AV90Tran_Id = AV102Tran_Entrada ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90Tran_Id", GXutil.ltrim( GXutil.str( AV90Tran_Id, 11, 0)));
            AV155GXV3 = 1 ;
            while ( AV155GXV3 <= AV99SDTDetalle.size() )
            {
               AV100SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV155GXV3));
               AV86SDTNovedadesDetalleItem = (com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea( AV49Linea );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn( AV49Linea );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual() );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva() );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo() );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Placa() );
               AV85SDTNovedadesDetalle.add(AV86SDTNovedadesDetalleItem, 0);
               AV49Linea = (int)(AV49Linea+1) ;
               AV155GXV3 = (int)(AV155GXV3+1) ;
            }
         }
         else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Elem_consecutivo") == 0 )
         {
            AV49Linea = 1 ;
            AV71Nove_ValorNuevo = AV10TNov_Nombre_Campo ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
            AV156GXV4 = 1 ;
            while ( AV156GXV4 <= AV99SDTDetalle.size() )
            {
               AV100SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV156GXV4));
               AV86SDTNovedadesDetalleItem = (com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea( AV49Linea );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea() );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual() );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo() );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual() );
               AV85SDTNovedadesDetalle.add(AV86SDTNovedadesDetalleItem, 0);
               AV49Linea = (int)(AV49Linea+1) ;
               AV156GXV4 = (int)(AV156GXV4+1) ;
            }
         }
         else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "TDet_Cantidad") == 0 )
         {
            AV49Linea = 1 ;
            AV71Nove_ValorNuevo = AV10TNov_Nombre_Campo ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
            AV157GXV5 = 1 ;
            while ( AV157GXV5 <= AV99SDTDetalle.size() )
            {
               AV100SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV157GXV5));
               AV86SDTNovedadesDetalleItem = (com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea( AV49Linea );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea() );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo( GXutil.str( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual(), 10, 0) );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo( GXutil.str( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva(), 10, 0) );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo() );
               AV85SDTNovedadesDetalle.add(AV86SDTNovedadesDetalleItem, 0);
               AV49Linea = (int)(AV49Linea+1) ;
               AV157GXV5 = (int)(AV157GXV5+1) ;
            }
         }
         else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "TDet_ListId") == 0 )
         {
            AV49Linea = 1 ;
            AV71Nove_ValorNuevo = AV10TNov_Nombre_Campo ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
            AV158GXV6 = 1 ;
            while ( AV158GXV6 <= AV99SDTDetalle.size() )
            {
               AV100SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV158GXV6));
               AV86SDTNovedadesDetalleItem = (com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea( AV49Linea );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea() );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual() );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo() );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa( AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Placa() );
               AV85SDTNovedadesDetalle.add(AV86SDTNovedadesDetalleItem, 0);
               AV49Linea = (int)(AV49Linea+1) ;
               AV158GXV6 = (int)(AV158GXV6+1) ;
            }
         }
      }
      else
      {
         AV71Nove_ValorNuevo = "MASIVO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71Nove_ValorNuevo", AV71Nove_ValorNuevo);
      }
      if ( ( GXutil.strcmp(AV63Nove_Masivo, "SI") == 0 ) && ( GXutil.strcmp(AV110Archivo, "") == 0 ) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe seleccionar el archivo excel para el cargue masivo " ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else if ( ( GXutil.strcmp(AV71Nove_ValorNuevo, "") == 0 ) || ( GXutil.strcmp(AV71Nove_ValorNuevo, "0") == 0 ) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe ingresar los nuevos valores para la novedad " ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else if ( ( GXutil.strcmp(AV69Nove_Soporte, "") == 0 ) && ( GXutil.strcmp(AV112TNov_ObligaSoporte, "SI") == 0 ) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe ingresar el documento soporte " ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else
      {
         Alertify1_Type = "confirm" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Está seguro que desea confirmar la novedad ? " ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV85SDTNovedadesDetalle", AV85SDTNovedadesDetalle);
   }

   public void e167Y2( )
   {
      /* Alertify1_Ok Routine */
      AV49Linea = 1 ;
      AV84SDTNovedades.setgxTv_SdtSDTNovedades_Nove_usuarioregistro( AV91Usua_Id );
      AV84SDTNovedades.setgxTv_SdtSDTNovedades_Nove_transid( AV90Tran_Id );
      AV84SDTNovedades.setgxTv_SdtSDTNovedades_Tnov_codigo( AV89TNov_Codigo );
      AV84SDTNovedades.setgxTv_SdtSDTNovedades_Nove_observaciones( AV67Nove_Observaciones );
      AV84SDTNovedades.setgxTv_SdtSDTNovedades_Nove_masivo( AV63Nove_Masivo );
      AV84SDTNovedades.setgxTv_SdtSDTNovedades_Nove_soporte( AV69Nove_Soporte );
      if ( GXutil.strcmp(AV63Nove_Masivo, "SI") == 0 )
      {
         AV111NombreArchivo = edtavArchivo_Filename ;
         if ( GXutil.strSearch( GXutil.trim( AV111NombreArchivo), ".xls", 1) == 0 )
         {
            httpContext.GX_msglist.addItem("La extensión del archivo no es válido");
         }
         else
         {
            GXv_char7[0] = AV110Archivo ;
            GXv_objcol_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem9[0] = AV85SDTNovedadesDetalle ;
            GXv_char5[0] = AV14TNov_Tipo ;
            GXv_int2[0] = AV82Regi_Id ;
            GXv_int10[0] = AV101Tran_ConsecutivoCC ;
            GXv_char11[0] = AV123Errores ;
            GXv_objcol_SdtSDTErrorMasivo_SDTErrorMasivoItem12[0] = AV124SDTErrorMasivo ;
            new com.orions2.pvalidaarchivonov(remoteHandle, context).execute( GXv_char7, GXv_objcol_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem9, GXv_char5, GXv_int2, GXv_int10, GXv_char11, GXv_objcol_SdtSDTErrorMasivo_SDTErrorMasivoItem12) ;
            wp_novedades_impl.this.AV110Archivo = GXv_char7[0] ;
            AV85SDTNovedadesDetalle = GXv_objcol_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem9[0] ;
            wp_novedades_impl.this.AV14TNov_Tipo = GXv_char5[0] ;
            wp_novedades_impl.this.AV82Regi_Id = GXv_int2[0] ;
            wp_novedades_impl.this.AV101Tran_ConsecutivoCC = GXv_int10[0] ;
            wp_novedades_impl.this.AV123Errores = GXv_char11[0] ;
            AV124SDTErrorMasivo = GXv_objcol_SdtSDTErrorMasivo_SDTErrorMasivoItem12[0] ;
            httpContext.ajax_rsp_assign_prop("", false, edtavArchivo_Internalname, "URL", httpContext.getResourceRelative(AV110Archivo), true);
            httpContext.ajax_rsp_assign_attri("", false, "AV14TNov_Tipo", AV14TNov_Tipo);
            httpContext.ajax_rsp_assign_attri("", false, "AV82Regi_Id", GXutil.ltrim( GXutil.str( AV82Regi_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV101Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV101Tran_ConsecutivoCC, 18, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV123Errores", AV123Errores);
            if ( GXutil.strcmp(AV123Errores, "S") == 0 )
            {
               Alertify1_Type = "error" ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
               Alertify1_Textmessage = "Hay errores en el archivo Excel por favor corregirlos" ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
               this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
               AV128url = formatLink("com.orions2.erroresnovedadesmasivo")  ;
               AV127WindowsId = (short)(GXutil.random( )*100000) ;
               lblUrl_Caption = "<script language=\"JavaScript\">window.open(\""+GXutil.trim( AV128url)+"\",\""+GXutil.trim( GXutil.str( AV127WindowsId, 10, 0))+"\",\"target=_top,top=10,left=10,width=600,height=500,scrollbars=yes,menubar=no,toolbar=no,resizable=yes,directories=no\");</script>" ;
               httpContext.ajax_rsp_assign_prop("", false, lblUrl_Internalname, "Caption", lblUrl_Caption, true);
            }
         }
      }
      else
      {
         AV123Errores = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV123Errores", AV123Errores);
         if ( ( GXutil.strcmp(AV14TNov_Tipo, "T") == 0 ) || ( GXutil.strcmp(AV14TNov_Tipo, "P") == 0 ) )
         {
            if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_TipoIngreso") != 0 )
            {
               AV86SDTNovedadesDetalleItem = (com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem)new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_linea( AV49Linea );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_lineatrn( AV49Linea );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valorantiguo( AV70Nove_ValorAntiguo );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_valornuevo( AV71Nove_ValorNuevo );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_consecutivo( AV7Elem_Consecutivo );
               AV86SDTNovedadesDetalleItem.setgxTv_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem_Nove_placa( AV78Placa );
               AV85SDTNovedadesDetalle.add(AV86SDTNovedadesDetalleItem, 0);
            }
         }
      }
      if ( GXutil.strcmp(AV123Errores, "N") == 0 )
      {
         GXv_SdtSDTNovedades13[0] = AV84SDTNovedades;
         GXv_objcol_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem9[0] = AV85SDTNovedadesDetalle ;
         GXv_int10[0] = AV8Nove_Identificador ;
         new com.orions2.pcrea_novedad(remoteHandle, context).execute( GXv_SdtSDTNovedades13, GXv_objcol_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem9, GXv_int10) ;
         AV84SDTNovedades = GXv_SdtSDTNovedades13[0] ;
         AV85SDTNovedadesDetalle = GXv_objcol_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem9[0] ;
         wp_novedades_impl.this.AV8Nove_Identificador = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Nove_Identificador", GXutil.ltrim( GXutil.str( AV8Nove_Identificador, 11, 0)));
         /* Execute user subroutine: 'STORE PROCEDURE' */
         S172 ();
         if (returnInSub) return;
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV84SDTNovedades", AV84SDTNovedades);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV124SDTErrorMasivo", AV124SDTErrorMasivo);
      dynavRegi_id.setValue( GXutil.trim( GXutil.str( AV82Regi_Id, 11, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynavRegi_id.getInternalname(), "Values", dynavRegi_id.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV85SDTNovedadesDetalle", AV85SDTNovedadesDetalle);
   }

   public void e217Y2( )
   {
      /* 'Cancelar' Routine */
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e227Y2( )
   {
      /* 'Placa' Routine */
      if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Desasociar") == 0 )
      {
         httpContext.popup(formatLink("com.orions2.selecplacapadre") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("D")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV82Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV78Placa","","AV82Regi_Id","AV102Tran_Entrada","AV120Nro_Linea",""});
         GX_FocusControl = edtavPlaca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Asociar") == 0 )
      {
         httpContext.popup(formatLink("com.orions2.selecplacapadre") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("A")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV82Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV78Placa","","AV82Regi_Id","AV102Tran_Entrada","AV120Nro_Linea",""});
         GX_FocusControl = edtavPlaca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         httpContext.popup(formatLink("com.orions2.selecplaca") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV82Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")), new Object[] {"AV78Placa","AV82Regi_Id","AV102Tran_Entrada","AV120Nro_Linea"});
         GX_FocusControl = edtavPlaca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      dynavRegi_id.setValue( GXutil.trim( GXutil.str( AV82Regi_Id, 11, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynavRegi_id.getInternalname(), "Values", dynavRegi_id.ToJavascriptSource(), true);
   }

   public void e237Y2( )
   {
      /* Placa_Isvalid Routine */
      AV79PlacaPadre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79PlacaPadre", AV79PlacaPadre);
      AV37Cata_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Cata_Descripcion", AV37Cata_Descripcion);
      AV48Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Invd_ValorAdquisicion", GXutil.ltrim( GXutil.str( AV48Invd_ValorAdquisicion, 18, 2)));
      AV75Otros_Costos_Dev = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Otros_Costos_Dev", GXutil.ltrim( GXutil.str( AV75Otros_Costos_Dev, 18, 2)));
      AV96Variable_VF = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Variable_VF", GXutil.ltrim( GXutil.str( AV96Variable_VF, 18, 2)));
      AV94Variable_I = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Variable_I", GXutil.ltrim( GXutil.str( AV94Variable_I, 3, 0)));
      AV95Variable_N = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Variable_N", GXutil.ltrim( GXutil.str( AV95Variable_N, 4, 0)));
      AV97Vida_Util_Actual = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97Vida_Util_Actual", GXutil.ltrim( GXutil.str( AV97Vida_Util_Actual, 4, 0)));
      /* Using cursor H007Y5 */
      pr_default.execute(3, new Object[] {AV78Placa});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A66Elem_Consecutivo = H007Y5_A66Elem_Consecutivo[0] ;
         A37Cata_Codigo = H007Y5_A37Cata_Codigo[0] ;
         A67Invd_NumeroPlaca = H007Y5_A67Invd_NumeroPlaca[0] ;
         A68Invd_PlacaPadre = H007Y5_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = H007Y5_n68Invd_PlacaPadre[0] ;
         A298Cata_Descripcion = H007Y5_A298Cata_Descripcion[0] ;
         A465Invd_ValorAdquisicion = H007Y5_A465Invd_ValorAdquisicion[0] ;
         n465Invd_ValorAdquisicion = H007Y5_n465Invd_ValorAdquisicion[0] ;
         A628Otros_Costos_Dev = H007Y5_A628Otros_Costos_Dev[0] ;
         n628Otros_Costos_Dev = H007Y5_n628Otros_Costos_Dev[0] ;
         A625Variable_VF = H007Y5_A625Variable_VF[0] ;
         n625Variable_VF = H007Y5_n625Variable_VF[0] ;
         A626Variable_I = H007Y5_A626Variable_I[0] ;
         n626Variable_I = H007Y5_n626Variable_I[0] ;
         A627Variable_N = H007Y5_A627Variable_N[0] ;
         n627Variable_N = H007Y5_n627Variable_N[0] ;
         A631Vida_Util_Actual = H007Y5_A631Vida_Util_Actual[0] ;
         n631Vida_Util_Actual = H007Y5_n631Vida_Util_Actual[0] ;
         A37Cata_Codigo = H007Y5_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H007Y5_A298Cata_Descripcion[0] ;
         AV79PlacaPadre = A68Invd_PlacaPadre ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79PlacaPadre", AV79PlacaPadre);
         AV37Cata_Descripcion = A298Cata_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Cata_Descripcion", AV37Cata_Descripcion);
         AV48Invd_ValorAdquisicion = A465Invd_ValorAdquisicion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Invd_ValorAdquisicion", GXutil.ltrim( GXutil.str( AV48Invd_ValorAdquisicion, 18, 2)));
         AV75Otros_Costos_Dev = A628Otros_Costos_Dev ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Otros_Costos_Dev", GXutil.ltrim( GXutil.str( AV75Otros_Costos_Dev, 18, 2)));
         AV96Variable_VF = A625Variable_VF ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96Variable_VF", GXutil.ltrim( GXutil.str( AV96Variable_VF, 18, 2)));
         AV94Variable_I = A626Variable_I ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94Variable_I", GXutil.ltrim( GXutil.str( AV94Variable_I, 3, 0)));
         AV95Variable_N = A627Variable_N ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Variable_N", GXutil.ltrim( GXutil.str( AV95Variable_N, 4, 0)));
         AV97Vida_Util_Actual = A631Vida_Util_Actual ;
         httpContext.ajax_rsp_assign_attri("", false, "AV97Vida_Util_Actual", GXutil.ltrim( GXutil.str( AV97Vida_Util_Actual, 4, 0)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV99SDTDetalle.clear();
      gx_BV241 = true ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV99SDTDetalle", AV99SDTDetalle);
      nGXsfl_241_bak_idx = nGXsfl_241_idx ;
      gxgrgrid1_refresh( ) ;
      nGXsfl_241_idx = nGXsfl_241_bak_idx ;
      sGXsfl_241_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_241_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2412( ) ;
   }

   public void S172( )
   {
      /* 'STORE PROCEDURE' Routine */
      AV76P_ID = GXutil.str( AV8Nove_Identificador, 11, 0) ;
      if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_IdProveedor") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y6 */
         pr_default.execute(4, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y6_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y6_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y6_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_TipoIngreso") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y7 */
         pr_default.execute(5, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y7_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y7_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y7_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_Observaciones") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y8 */
         pr_default.execute(6, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y8_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y8_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y8_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Anulacion") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y9 */
         pr_default.execute(7, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y9_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y9_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y9_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_AreadanteCodigo") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y10 */
         pr_default.execute(8, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y10_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y10_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y10_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_CursoCodigo") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y11 */
         pr_default.execute(9, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y11_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y11_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y11_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_IdCuentadanteDestino") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y12 */
         pr_default.execute(10, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y12_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y12_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y12_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "TDet_ListId") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y13 */
         pr_default.execute(11, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y13_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y13_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y13_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Invd_ValorAdquisicion") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y14 */
         pr_default.execute(12, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y14_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y14_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y14_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Otros_Costos_Dev") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y15 */
         pr_default.execute(13, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y15_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y15_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y15_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Variable_VF") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y16 */
         pr_default.execute(14, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y16_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y16_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y16_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Vida_Util_Actual") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y17 */
         pr_default.execute(15, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y17_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y17_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y17_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Desasociar") == 0 ) || ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Asociar") == 0 ) )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y18 */
         pr_default.execute(16, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y18_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y18_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y18_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Elem_consecutivo") == 0 )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y19 */
         pr_default.execute(17, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y19_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y19_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y19_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( ( GXutil.strcmp(AV10TNov_Nombre_Campo, "TDet_Cantidad") == 0 ) && ( GXutil.strcmp(AV12TNov_Procedimiento, "PRC_CTD_CON") == 0 ) )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y20 */
         pr_default.execute(18, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y20_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y20_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y20_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      else if ( ( GXutil.strcmp(AV10TNov_Nombre_Campo, "TDet_Cantidad") == 0 ) && ( GXutil.strcmp(AV12TNov_Procedimiento, "PRC_CTD_DEV") == 0 ) )
      {
         P_id_svchar18_0 = AV76P_ID ;
         Nove_estado_svchar1_0 = AV62Nove_Estado ;
         /* Using cursor H007Y21 */
         pr_default.execute(19, new Object[] {P_id_svchar18_0, Nove_estado_svchar1_0, AV68Nove_RespuestaProc});
         P_id_svchar18_0 = H007Y21_AP_id_svchar18_0[0] ;
         Nove_estado_svchar1_0 = H007Y21_ANove_estado_svchar1_0[0] ;
         AV68Nove_RespuestaProc = H007Y21_AV68Nove_RespuestaProc[0] ;
         AV76P_ID = P_id_svchar18_0 ;
         AV62Nove_Estado = Nove_estado_svchar1_0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      }
      GXv_int10[0] = AV8Nove_Identificador ;
      GXv_char11[0] = AV62Nove_Estado ;
      GXv_char7[0] = AV68Nove_RespuestaProc ;
      new com.orions2.pestadonovedad(remoteHandle, context).execute( GXv_int10, GXv_char11, GXv_char7) ;
      wp_novedades_impl.this.AV8Nove_Identificador = GXv_int10[0] ;
      wp_novedades_impl.this.AV62Nove_Estado = GXv_char11[0] ;
      wp_novedades_impl.this.AV68Nove_RespuestaProc = GXv_char7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Nove_Identificador", GXutil.ltrim( GXutil.str( AV8Nove_Identificador, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV62Nove_Estado", AV62Nove_Estado);
      httpContext.ajax_rsp_assign_attri("", false, "AV68Nove_RespuestaProc", AV68Nove_RespuestaProc);
      httpContext.popup(formatLink("com.orions2.wp_respuestaprc") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Nove_Identificador,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV62Nove_Estado)) + "," + GXutil.URLEncode(GXutil.rtrim(AV68Nove_RespuestaProc)), new Object[] {"AV8Nove_Identificador","AV62Nove_Estado","AV68Nove_RespuestaProc"});
   }

   public void S152( )
   {
      /* 'DESCRIP_AREADANTE' Routine */
      AV16Tran_AreadanteDescripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Tran_AreadanteDescripcion", AV16Tran_AreadanteDescripcion);
      /* Using cursor H007Y22 */
      pr_default.execute(20, new Object[] {AV15Tran_AreadanteCodigo});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A59Area_Codigo = H007Y22_A59Area_Codigo[0] ;
         A452Area_Descripcion = H007Y22_A452Area_Descripcion[0] ;
         AV16Tran_AreadanteDescripcion = A452Area_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Tran_AreadanteDescripcion", AV16Tran_AreadanteDescripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(20);
   }

   public void S134( )
   {
      /* 'ALMACEN' Routine */
      AV31Alma_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Alma_Descripcion", AV31Alma_Descripcion);
      /* Using cursor H007Y23 */
      pr_default.execute(21, new Object[] {new Long(AV6Cent_Id), AV32Alma_Modulo, AV30Alma_Codigo});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A28Alma_Codigo = H007Y23_A28Alma_Codigo[0] ;
         A27Alma_Modulo = H007Y23_A27Alma_Modulo[0] ;
         A1Cent_Id = H007Y23_A1Cent_Id[0] ;
         A252Alma_Descripcion = H007Y23_A252Alma_Descripcion[0] ;
         AV31Alma_Descripcion = A252Alma_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Alma_Descripcion", AV31Alma_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(21);
   }

   public void S144( )
   {
      /* 'BODEGA' Routine */
      AV36Bode_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Bode_Descripcion", AV36Bode_Descripcion);
      /* Using cursor H007Y24 */
      pr_default.execute(22, new Object[] {new Long(AV6Cent_Id), AV32Alma_Modulo, AV30Alma_Codigo, AV35Bode_Codigo});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A31Bode_Codigo = H007Y24_A31Bode_Codigo[0] ;
         A28Alma_Codigo = H007Y24_A28Alma_Codigo[0] ;
         A27Alma_Modulo = H007Y24_A27Alma_Modulo[0] ;
         A1Cent_Id = H007Y24_A1Cent_Id[0] ;
         A251Bode_Descripcion = H007Y24_A251Bode_Descripcion[0] ;
         A251Bode_Descripcion = H007Y24_A251Bode_Descripcion[0] ;
         AV36Bode_Descripcion = A251Bode_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Bode_Descripcion", AV36Bode_Descripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(22);
   }

   public void S112( )
   {
      /* 'TIPO_NOVEDAD' Routine */
      cmbavTnov_codigo.removeAllItems();
      /* Using cursor H007Y25 */
      pr_default.execute(23);
      while ( (pr_default.getStatus(23) != 101) )
      {
         A773TNov_Estado = H007Y25_A773TNov_Estado[0] ;
         n773TNov_Estado = H007Y25_n773TNov_Estado[0] ;
         A105TNov_Rol_Id = H007Y25_A105TNov_Rol_Id[0] ;
         A769TNov_Descripcion = H007Y25_A769TNov_Descripcion[0] ;
         n769TNov_Descripcion = H007Y25_n769TNov_Descripcion[0] ;
         A104TNov_Codigo = H007Y25_A104TNov_Codigo[0] ;
         A773TNov_Estado = H007Y25_A773TNov_Estado[0] ;
         n773TNov_Estado = H007Y25_n773TNov_Estado[0] ;
         A769TNov_Descripcion = H007Y25_A769TNov_Descripcion[0] ;
         n769TNov_Descripcion = H007Y25_n769TNov_Descripcion[0] ;
         AV13TNov_Rol_Id = A105TNov_Rol_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13TNov_Rol_Id", GXutil.ltrim( GXutil.str( AV13TNov_Rol_Id, 11, 0)));
         AV83Rol = "N" ;
         /* Using cursor H007Y26 */
         pr_default.execute(24, new Object[] {new Long(AV91Usua_Id), new Long(AV13TNov_Rol_Id)});
         while ( (pr_default.getStatus(24) != 101) )
         {
            A21Rol_Id = H007Y26_A21Rol_Id[0] ;
            A23Usua_Id = H007Y26_A23Usua_Id[0] ;
            AV83Rol = "S" ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(24);
         if ( GXutil.strcmp(AV83Rol, "S") == 0 )
         {
            cmbavTnov_codigo.addItem(GXutil.trim( GXutil.str( A104TNov_Codigo, 6, 0)), A769TNov_Descripcion, (short)(0));
         }
         pr_default.readNext(23);
      }
      pr_default.close(23);
   }

   public void S162( )
   {
      /* 'DESCRIP_CURSO' Routine */
      AV20Tran_CursoDescripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tran_CursoDescripcion", AV20Tran_CursoDescripcion);
      /* Using cursor H007Y27 */
      pr_default.execute(25, new Object[] {AV19Tran_CursoCodigo});
      while ( (pr_default.getStatus(25) != 101) )
      {
         A73Curs_Codigo = H007Y27_A73Curs_Codigo[0] ;
         A424Curs_Descripcion = H007Y27_A424Curs_Descripcion[0] ;
         AV20Tran_CursoDescripcion = A424Curs_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Tran_CursoDescripcion", AV20Tran_CursoDescripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(25);
   }

   public void e247Y2( )
   {
      /* 'Transaccion' Routine */
      AV99SDTDetalle.clear();
      gx_BV241 = true ;
      if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_IdProveedor") == 0 )
      {
         httpContext.popup(formatLink("com.orions2.gxtransaccion") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV82Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("E")), new Object[] {"AV90Tran_Id","AV101Tran_ConsecutivoCC","AV82Regi_Id",""});
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_AreadanteCodigo") == 0 )
      {
         httpContext.popup(formatLink("com.orions2.gxtransaccion") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV82Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("S")), new Object[] {"AV90Tran_Id","AV101Tran_ConsecutivoCC","AV82Regi_Id",""});
      }
      else if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_CursoCodigo") == 0 )
      {
         httpContext.popup(formatLink("com.orions2.gxtransaccion") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV82Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("C")), new Object[] {"AV90Tran_Id","AV101Tran_ConsecutivoCC","AV82Regi_Id",""});
      }
      else
      {
         httpContext.popup(formatLink("com.orions2.gxtransaccion") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV82Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("T")), new Object[] {"AV90Tran_Id","AV101Tran_ConsecutivoCC","AV82Regi_Id",""});
      }
      GX_FocusControl = edtavTran_consecutivocc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV99SDTDetalle", AV99SDTDetalle);
      nGXsfl_241_bak_idx = nGXsfl_241_idx ;
      gxgrgrid1_refresh( ) ;
      nGXsfl_241_idx = nGXsfl_241_bak_idx ;
      sGXsfl_241_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_241_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2412( ) ;
      dynavRegi_id.setValue( GXutil.trim( GXutil.str( AV82Regi_Id, 11, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynavRegi_id.getInternalname(), "Values", dynavRegi_id.ToJavascriptSource(), true);
   }

   public void e287Y2( )
   {
      /* 'Asociar Placa' Routine */
      httpContext.popup(formatLink("com.orions2.selecplacapadre") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("I")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV82Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim(AV78Placa)), new Object[] {"AV105NuevaPlaca","","AV82Regi_Id","AV102Tran_Entrada","AV120Nro_Linea","AV78Placa"});
      GX_FocusControl = edtavNuevaplaca_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      dynavRegi_id.setValue( GXutil.trim( GXutil.str( AV82Regi_Id, 11, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynavRegi_id.getInternalname(), "Values", dynavRegi_id.ToJavascriptSource(), true);
   }

   public void e257Y2( )
   {
      /* Nuevaplaca_Isvalid Routine */
      /* Using cursor H007Y28 */
      pr_default.execute(26, new Object[] {AV105NuevaPlaca});
      while ( (pr_default.getStatus(26) != 101) )
      {
         A37Cata_Codigo = H007Y28_A37Cata_Codigo[0] ;
         A67Invd_NumeroPlaca = H007Y28_A67Invd_NumeroPlaca[0] ;
         A66Elem_Consecutivo = H007Y28_A66Elem_Consecutivo[0] ;
         A298Cata_Descripcion = H007Y28_A298Cata_Descripcion[0] ;
         A37Cata_Codigo = H007Y28_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H007Y28_A298Cata_Descripcion[0] ;
         AV106NuevoConsecutivo = A66Elem_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106NuevoConsecutivo", AV106NuevoConsecutivo);
         AV107NuevaDescripcion = A298Cata_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107NuevaDescripcion", AV107NuevaDescripcion);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(26);
      edtavCtlplacapadrenueva_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlplacapadrenueva_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlplacapadrenueva_Enabled, 5, 0)), !bGXsfl_241_Refreshing);
   }

   public void e267Y2( )
   {
      AV137GXV1 = nGXsfl_241_idx ;
      if ( AV99SDTDetalle.size() >= AV137GXV1 )
      {
         AV99SDTDetalle.currentItem( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)) );
      }
      /* 'Agregar Placa' Routine */
      AV109Existe = "N" ;
      AV167GXV7 = 1 ;
      while ( AV167GXV7 <= AV99SDTDetalle.size() )
      {
         AV100SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV167GXV7));
         if ( GXutil.strcmp(AV105NuevaPlaca, AV100SDTDetalleItem.getgxTv_SdtSDTDetalle_SDTDetalleItem_Placa()) == 0 )
         {
            AV109Existe = "S" ;
         }
         AV167GXV7 = (int)(AV167GXV7+1) ;
      }
      if ( GXutil.strcmp(AV109Existe, "S") == 0 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "La nueva placa ya se encuentra seleccionada" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         AV105NuevaPlaca = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105NuevaPlaca", AV105NuevaPlaca);
      }
      else
      {
         AV100SDTDetalleItem = (com.orions2.SdtSDTDetalle_SDTDetalleItem)new com.orions2.SdtSDTDetalle_SDTDetalleItem(remoteHandle, context);
         AV100SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Placa( AV105NuevaPlaca );
         AV100SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion( AV107NuevaDescripcion );
         AV100SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual( "" );
         AV100SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva( AV78Placa );
         AV100SDTDetalleItem.setgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo( AV106NuevoConsecutivo );
         AV99SDTDetalle.add(AV100SDTDetalleItem, 0);
         gx_BV241 = true ;
         AV105NuevaPlaca = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105NuevaPlaca", AV105NuevaPlaca);
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV99SDTDetalle", AV99SDTDetalle);
      nGXsfl_241_bak_idx = nGXsfl_241_idx ;
      gxgrgrid1_refresh( ) ;
      nGXsfl_241_idx = nGXsfl_241_bak_idx ;
      sGXsfl_241_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_241_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2412( ) ;
   }

   public void S122( )
   {
      /* 'CAMPOS' Routine */
      imgImage4_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage4_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage4_Visible, 5, 0)), true);
      edtavCedula_proveedor_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCedula_proveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCedula_proveedor_Visible, 5, 0)), true);
      edtavNombre_proveedor_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombre_proveedor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNombre_proveedor_Visible, 5, 0)), true);
      dynavOrig_identificador.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynavOrig_identificador.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavOrig_identificador.getVisible(), 5, 0)), true);
      edtavNuevo_valor_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNuevo_valor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNuevo_valor_Visible, 5, 0)), true);
      edtavFecha_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFecha_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFecha_Visible, 5, 0)), true);
      imgImage1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage1_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage1_Visible, 5, 0)), true);
      edtavArea_codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_codigo_Visible, 5, 0)), true);
      edtavArea_descripcion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArea_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavArea_descripcion_Visible, 5, 0)), true);
      imgImage2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage2_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage2_Visible, 5, 0)), true);
      edtavCurs_codigo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_codigo_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_codigo_Visible, 5, 0)), true);
      edtavCurs_descripcion_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCurs_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCurs_descripcion_Visible, 5, 0)), true);
      imgImage3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage3_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage3_Visible, 5, 0)), true);
      edtavCuentad_cedula_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuentad_cedula_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuentad_cedula_Visible, 5, 0)), true);
      edtavCuentad_nombre_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCuentad_nombre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCuentad_nombre_Visible, 5, 0)), true);
      edtavValor_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavValor_Visible, 5, 0)), true);
      edtavPlaca_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPlaca_Visible, 5, 0)), true);
      imgImage5_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImage5_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage5_Visible, 5, 0)), true);
      divTable4_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable4_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable4_Visible, 5, 0)), true);
      divTable5_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable5_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable5_Visible, 5, 0)), true);
      divTable6_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable6_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable6_Visible, 5, 0)), true);
      divTable7_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable7_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable7_Visible, 5, 0)), true);
      divTable8_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTable8_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable8_Visible, 5, 0)), true);
      if ( ( GXutil.strcmp(AV14TNov_Tipo, "T") == 0 ) || ( GXutil.strcmp(AV14TNov_Tipo, "D") == 0 ) )
      {
         edtavTran_consecutivocc_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_consecutivocc_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_consecutivocc_Visible, 5, 0)), true);
         imgImage6_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage6_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage6_Visible, 5, 0)), true);
         dynavRegi_id.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynavRegi_id.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavRegi_id.getVisible(), 5, 0)), true);
         edtavPlaca_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavPlaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPlaca_Visible, 5, 0)), true);
         imgImage5_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage5_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage5_Visible, 5, 0)), true);
         edtavNove_centrodescripcion_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_centrodescripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_centrodescripcion_Visible, 5, 0)), true);
         edtavNove_movimientodescrip_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_movimientodescrip_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_movimientodescrip_Visible, 5, 0)), true);
         lblTextblock1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock1_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTextblock1_Visible, 5, 0)), true);
         edtavFechatran_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavFechatran_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFechatran_Visible, 5, 0)), true);
         edtavFecharegistro_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavFecharegistro_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFecharegistro_Visible, 5, 0)), true);
         edtavNove_moduloorigen_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_moduloorigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_moduloorigen_Visible, 5, 0)), true);
         edtavNove_almadescripcionorig_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_almadescripcionorig_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_almadescripcionorig_Visible, 5, 0)), true);
         edtavNove_bodedescripcionorig_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_bodedescripcionorig_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_bodedescripcionorig_Visible, 5, 0)), true);
         edtavNove_cuentadantenomorigen_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_cuentadantenomorigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_cuentadantenomorigen_Visible, 5, 0)), true);
         lblTextblock2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTextblock2_Visible, 5, 0)), true);
         edtavNove_modulodestino_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_modulodestino_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_modulodestino_Visible, 5, 0)), true);
         edtavNove_almadescripciondesti_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_almadescripciondesti_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_almadescripciondesti_Visible, 5, 0)), true);
         edtavNove_bodedescripciondesti_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_bodedescripciondesti_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_bodedescripciondesti_Visible, 5, 0)), true);
         edtavNove_cuentadantenomdestino_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_cuentadantenomdestino_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_cuentadantenomdestino_Visible, 5, 0)), true);
         edtavCata_descripcion_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Visible, 5, 0)), true);
         edtavPlacapadre_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavPlacapadre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPlacapadre_Visible, 5, 0)), true);
         divTable6_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTable6_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable6_Visible, 5, 0)), true);
         if ( GXutil.strcmp(AV14TNov_Tipo, "T") == 0 )
         {
            divTable4_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, divTable4_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable4_Visible, 5, 0)), true);
            divTable5_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, divTable5_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable5_Visible, 5, 0)), true);
         }
         if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Tran_TipoIngreso") == 0 )
         {
            divTable8_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, divTable8_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable8_Visible, 5, 0)), true);
            divTable4_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, divTable4_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable4_Visible, 5, 0)), true);
         }
      }
      else
      {
         edtavTran_consecutivocc_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTran_consecutivocc_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavTran_consecutivocc_Visible, 5, 0)), true);
         imgImage6_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage6_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage6_Visible, 5, 0)), true);
         dynavRegi_id.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynavRegi_id.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( dynavRegi_id.getVisible(), 5, 0)), true);
         edtavPlaca_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavPlaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPlaca_Visible, 5, 0)), true);
         imgImage5_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImage5_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImage5_Visible, 5, 0)), true);
         edtavNove_centrodescripcion_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_centrodescripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_centrodescripcion_Visible, 5, 0)), true);
         edtavNove_movimientodescrip_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_movimientodescrip_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_movimientodescrip_Visible, 5, 0)), true);
         edtavFechatran_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavFechatran_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFechatran_Visible, 5, 0)), true);
         edtavFecharegistro_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavFecharegistro_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavFecharegistro_Visible, 5, 0)), true);
         lblTextblock1_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock1_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTextblock1_Visible, 5, 0)), true);
         edtavNove_moduloorigen_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_moduloorigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_moduloorigen_Visible, 5, 0)), true);
         edtavNove_almadescripcionorig_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_almadescripcionorig_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_almadescripcionorig_Visible, 5, 0)), true);
         edtavNove_bodedescripcionorig_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_bodedescripcionorig_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_bodedescripcionorig_Visible, 5, 0)), true);
         edtavNove_cuentadantenomorigen_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_cuentadantenomorigen_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_cuentadantenomorigen_Visible, 5, 0)), true);
         lblTextblock2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblock2_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblTextblock2_Visible, 5, 0)), true);
         edtavNove_modulodestino_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_modulodestino_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_modulodestino_Visible, 5, 0)), true);
         edtavNove_almadescripciondesti_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_almadescripciondesti_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_almadescripciondesti_Visible, 5, 0)), true);
         edtavNove_bodedescripciondesti_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_bodedescripciondesti_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_bodedescripciondesti_Visible, 5, 0)), true);
         edtavNove_cuentadantenomdestino_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavNove_cuentadantenomdestino_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavNove_cuentadantenomdestino_Visible, 5, 0)), true);
         edtavCata_descripcion_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Visible, 5, 0)), true);
         edtavPlacapadre_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavPlacapadre_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPlacapadre_Visible, 5, 0)), true);
         AV37Cata_Descripcion = "." ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Cata_Descripcion", AV37Cata_Descripcion);
         AV79PlacaPadre = "." ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79PlacaPadre", AV79PlacaPadre);
         divTable4_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, divTable4_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable4_Visible, 5, 0)), true);
         divTable6_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTable6_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable6_Visible, 5, 0)), true);
      }
      if ( ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Anulacion") == 0 ) || ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Desasociar") == 0 ) || ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Asociar") == 0 ) || ( GXutil.strcmp(AV10TNov_Nombre_Campo, "TDet_ListId") == 0 ) || ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Variable_VF") == 0 ) )
      {
         divTable4_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divTable4_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable4_Visible, 5, 0)), true);
         if ( GXutil.strcmp(AV10TNov_Nombre_Campo, "Asociar") == 0 )
         {
            divTable6_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, divTable6_Internalname, "Visible", GXutil.ltrim( GXutil.str( divTable6_Visible, 5, 0)), true);
         }
      }
   }

   public void e277Y2( )
   {
      /* 'GENERAR EXCEL' Routine */
      GXv_char11[0] = AV114Filename ;
      GXv_char7[0] = AV113ErrorMessage ;
      new com.orions2.export_novedades(remoteHandle, context).execute( GXv_char11, GXv_char7) ;
      wp_novedades_impl.this.AV114Filename = GXv_char11[0] ;
      wp_novedades_impl.this.AV113ErrorMessage = GXv_char7[0] ;
      if ( GXutil.strcmp(AV114Filename, "") != 0 )
      {
         AV114Filename = "../" + AV114Filename ;
         httpContext.wjLoc = formatLink(AV114Filename)  ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV113ErrorMessage);
      }
   }

   private void e307Y2( )
   {
      /* Grid1_Load Routine */
      AV137GXV1 = (short)(1) ;
      while ( AV137GXV1 <= AV99SDTDetalle.size() )
      {
         AV99SDTDetalle.currentItem( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(241) ;
         }
         sendrow_2412( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_241_Refreshing )
         {
            httpContext.doAjaxLoad(241, Grid1Row);
         }
         AV137GXV1 = (short)(AV137GXV1+1) ;
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
      pa7Y2( ) ;
      ws7Y2( ) ;
      we7Y2( ) ;
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
      httpContext.AddStyleSheetFile("FileUpload/fileupload.min.css", "?1014300");
      httpContext.AddStyleSheetFile("Alertify/css/alertify.core.css", "?1126220");
      httpContext.AddStyleSheetFile("Alertify/css/alertify.default.css", "?11295124");
      httpContext.AddStyleSheetFile("calendar-system.css", "?14361167");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861814133776");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("wp_novedades.js", "?201861814133776");
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      /* End function include_jscripts */
   }

   public void subsflControlProps_2412( )
   {
      edtavCtlnro_linea_Internalname = "CTLNRO_LINEA_"+sGXsfl_241_idx ;
      edtavCtlplaca_Internalname = "CTLPLACA_"+sGXsfl_241_idx ;
      edtavCtlconsecutivo_Internalname = "CTLCONSECUTIVO_"+sGXsfl_241_idx ;
      edtavCtldescripcion_Internalname = "CTLDESCRIPCION_"+sGXsfl_241_idx ;
      edtavCtlplacapadreactual_Internalname = "CTLPLACAPADREACTUAL_"+sGXsfl_241_idx ;
      edtavCtlplacapadrenueva_Internalname = "CTLPLACAPADRENUEVA_"+sGXsfl_241_idx ;
      edtavCtlcantidadactual_Internalname = "CTLCANTIDADACTUAL_"+sGXsfl_241_idx ;
      edtavCtlcantidadnueva_Internalname = "CTLCANTIDADNUEVA_"+sGXsfl_241_idx ;
      edtavCtlconsecutivoactual_Internalname = "CTLCONSECUTIVOACTUAL_"+sGXsfl_241_idx ;
      edtavCtlconsecutivonuevo_Internalname = "CTLCONSECUTIVONUEVO_"+sGXsfl_241_idx ;
      edtavCtlatributoactual_Internalname = "CTLATRIBUTOACTUAL_"+sGXsfl_241_idx ;
      edtavCtlatributonuevo_Internalname = "CTLATRIBUTONUEVO_"+sGXsfl_241_idx ;
      edtavCtlvaloractual_Internalname = "CTLVALORACTUAL_"+sGXsfl_241_idx ;
      edtavCtlvalornuevo_Internalname = "CTLVALORNUEVO_"+sGXsfl_241_idx ;
   }

   public void subsflControlProps_fel_2412( )
   {
      edtavCtlnro_linea_Internalname = "CTLNRO_LINEA_"+sGXsfl_241_fel_idx ;
      edtavCtlplaca_Internalname = "CTLPLACA_"+sGXsfl_241_fel_idx ;
      edtavCtlconsecutivo_Internalname = "CTLCONSECUTIVO_"+sGXsfl_241_fel_idx ;
      edtavCtldescripcion_Internalname = "CTLDESCRIPCION_"+sGXsfl_241_fel_idx ;
      edtavCtlplacapadreactual_Internalname = "CTLPLACAPADREACTUAL_"+sGXsfl_241_fel_idx ;
      edtavCtlplacapadrenueva_Internalname = "CTLPLACAPADRENUEVA_"+sGXsfl_241_fel_idx ;
      edtavCtlcantidadactual_Internalname = "CTLCANTIDADACTUAL_"+sGXsfl_241_fel_idx ;
      edtavCtlcantidadnueva_Internalname = "CTLCANTIDADNUEVA_"+sGXsfl_241_fel_idx ;
      edtavCtlconsecutivoactual_Internalname = "CTLCONSECUTIVOACTUAL_"+sGXsfl_241_fel_idx ;
      edtavCtlconsecutivonuevo_Internalname = "CTLCONSECUTIVONUEVO_"+sGXsfl_241_fel_idx ;
      edtavCtlatributoactual_Internalname = "CTLATRIBUTOACTUAL_"+sGXsfl_241_fel_idx ;
      edtavCtlatributonuevo_Internalname = "CTLATRIBUTONUEVO_"+sGXsfl_241_fel_idx ;
      edtavCtlvaloractual_Internalname = "CTLVALORACTUAL_"+sGXsfl_241_fel_idx ;
      edtavCtlvalornuevo_Internalname = "CTLVALORNUEVO_"+sGXsfl_241_fel_idx ;
   }

   public void sendrow_2412( )
   {
      subsflControlProps_2412( ) ;
      wb7Y0( ) ;
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
         if ( ((int)((nGXsfl_241_idx) % (2))) == 0 )
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
         httpContext.writeText( " gxrow=\""+sGXsfl_241_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCtlnro_linea_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlnro_linea_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea(), (byte)(8), (byte)(0), ",", "")),((edtavCtlnro_linea_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea()), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea()), "ZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlnro_linea_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlnro_linea_Visible),new Integer(edtavCtlnro_linea_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCtlplaca_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlplaca_Internalname,((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Placa(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlplaca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlplaca_Visible),new Integer(edtavCtlplaca_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCtlconsecutivo_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlconsecutivo_Internalname,((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlconsecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlconsecutivo_Visible),new Integer(edtavCtlconsecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtldescripcion_Internalname,((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion(),GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtldescripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtldescripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCtlplacapadreactual_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlplacapadreactual_Internalname,((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlplacapadreactual_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlplacapadreactual_Visible),new Integer(edtavCtlplacapadreactual_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCtlplacapadrenueva_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlplacapadrenueva_Enabled!=0)&&(edtavCtlplacapadrenueva_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 247,'',false,'"+sGXsfl_241_idx+"',241)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlplacapadrenueva_Internalname,((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadrenueva(),"",TempTags+((edtavCtlplacapadrenueva_Enabled!=0)&&(edtavCtlplacapadrenueva_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlplacapadrenueva_Enabled!=0)&&(edtavCtlplacapadrenueva_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,247);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlplacapadrenueva_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlplacapadrenueva_Visible),new Integer(edtavCtlplacapadrenueva_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCtlcantidadactual_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcantidadactual_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual(), (byte)(10), (byte)(0), ",", "")),((edtavCtlcantidadactual_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual()), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual()), "ZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcantidadactual_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlcantidadactual_Visible),new Integer(edtavCtlcantidadactual_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCtlcantidadnueva_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlcantidadnueva_Enabled!=0)&&(edtavCtlcantidadnueva_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 249,'',false,'"+sGXsfl_241_idx+"',241)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcantidadnueva_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva(), (byte)(10), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadnueva()), "ZZZZZZZZZ9")),TempTags+((edtavCtlcantidadnueva_Enabled!=0)&&(edtavCtlcantidadnueva_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlcantidadnueva_Enabled!=0)&&(edtavCtlcantidadnueva_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,249);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcantidadnueva_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlcantidadnueva_Visible),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCtlconsecutivoactual_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlconsecutivoactual_Internalname,((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlconsecutivoactual_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlconsecutivoactual_Visible),new Integer(edtavCtlconsecutivoactual_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCtlconsecutivonuevo_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlconsecutivonuevo_Enabled!=0)&&(edtavCtlconsecutivonuevo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 251,'',false,'"+sGXsfl_241_idx+"',241)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlconsecutivonuevo_Internalname,((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivonuevo(),"",TempTags+((edtavCtlconsecutivonuevo_Enabled!=0)&&(edtavCtlconsecutivonuevo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlconsecutivonuevo_Enabled!=0)&&(edtavCtlconsecutivonuevo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,251);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlconsecutivonuevo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlconsecutivonuevo_Visible),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCtlatributoactual_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlatributoactual_Internalname,((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlatributoactual_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlatributoactual_Visible),new Integer(edtavCtlatributoactual_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavCtlatributonuevo_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlatributonuevo_Enabled!=0)&&(edtavCtlatributonuevo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 253,'',false,'"+sGXsfl_241_idx+"',241)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlatributonuevo_Internalname,((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Atributonuevo(),"",TempTags+((edtavCtlatributonuevo_Enabled!=0)&&(edtavCtlatributonuevo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlatributonuevo_Enabled!=0)&&(edtavCtlatributonuevo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,253);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlatributonuevo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlatributonuevo_Visible),new Integer(1),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCtlvaloractual_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlvaloractual_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual(), (byte)(12), (byte)(2), ",", "")),((edtavCtlvaloractual_Enabled!=0) ? GXutil.ltrim( localUtil.format( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual(), "Z,ZZZ,ZZ9.99")) : localUtil.format( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual(), "Z,ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlvaloractual_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlvaloractual_Visible),new Integer(edtavCtlvaloractual_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(12),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCtlvalornuevo_Visible==0) ? "display:none;" : "")+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCtlvalornuevo_Enabled!=0)&&(edtavCtlvalornuevo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 255,'',false,'"+sGXsfl_241_idx+"',241)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlvalornuevo_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo(), (byte)(12), (byte)(2), ",", "")),GXutil.ltrim( localUtil.format( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Valornuevo(), "Z,ZZZ,ZZ9.99")),TempTags+((edtavCtlvalornuevo_Enabled!=0)&&(edtavCtlvalornuevo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlvalornuevo_Enabled!=0)&&(edtavCtlvalornuevo_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,255);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlvalornuevo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(edtavCtlvalornuevo_Visible),new Integer(1),new Integer(0),"text","",new Integer(106),"px",new Integer(17),"px",new Integer(12),new Integer(0),new Integer(0),new Integer(241),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLNRO_LINEA"+"_"+sGXsfl_241_idx, getSecureSignedToken( sGXsfl_241_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Nro_linea()), "ZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLPLACA"+"_"+sGXsfl_241_idx, getSecureSignedToken( sGXsfl_241_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Placa(), ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCONSECUTIVO"+"_"+sGXsfl_241_idx, getSecureSignedToken( sGXsfl_241_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivo(), ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLDESCRIPCION"+"_"+sGXsfl_241_idx, getSecureSignedToken( sGXsfl_241_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Descripcion(), "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLPLACAPADREACTUAL"+"_"+sGXsfl_241_idx, getSecureSignedToken( sGXsfl_241_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Placapadreactual(), ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCANTIDADACTUAL"+"_"+sGXsfl_241_idx, getSecureSignedToken( sGXsfl_241_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Cantidadactual()), "ZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCONSECUTIVOACTUAL"+"_"+sGXsfl_241_idx, getSecureSignedToken( sGXsfl_241_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Consecutivoactual(), ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLATRIBUTOACTUAL"+"_"+sGXsfl_241_idx, getSecureSignedToken( sGXsfl_241_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Atributoactual(), ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLVALORACTUAL"+"_"+sGXsfl_241_idx, getSecureSignedToken( sGXsfl_241_idx, localUtil.format( ((com.orions2.SdtSDTDetalle_SDTDetalleItem)AV99SDTDetalle.elementAt(-1+AV137GXV1)).getgxTv_SdtSDTDetalle_SDTDetalleItem_Valoractual(), "Z,ZZZ,ZZ9.99")));
      GXCCtl = "vARCHIVO_" + sGXsfl_241_idx ;
      GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, AV110Archivo);
      GXCCtl = "vNOVE_SOPORTE_" + sGXsfl_241_idx ;
      GXCCtlgxBlob = GXCCtl + "_gxBlob" ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, AV69Nove_Soporte);
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_241_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_241_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_241_idx+1)) ;
      sGXsfl_241_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_241_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_2412( ) ;
      /* End function sendrow_2412 */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      cmbavTnov_codigo.setInternalname( "vTNOV_CODIGO" );
      dynavRegi_id.setInternalname( "vREGI_ID" );
      imgImage6_Internalname = "IMAGE6" ;
      edtavTran_consecutivocc_Internalname = "vTRAN_CONSECUTIVOCC" ;
      cmbavNove_masivo.setInternalname( "vNOVE_MASIVO" );
      edtavArchivo_Internalname = "vARCHIVO" ;
      bttGenerarexcel_Internalname = "GENERAREXCEL" ;
      divTable7_Internalname = "TABLE7" ;
      imgImage5_Internalname = "IMAGE5" ;
      edtavPlaca_Internalname = "vPLACA" ;
      edtavNove_observaciones_Internalname = "vNOVE_OBSERVACIONES" ;
      edtavNove_soporte_Internalname = "vNOVE_SOPORTE" ;
      Fileupload1_Internalname = "FILEUPLOAD1" ;
      bttCargararchivo_Internalname = "CARGARARCHIVO" ;
      divTable2_Internalname = "TABLE2" ;
      edtavNove_centrodescripcion_Internalname = "vNOVE_CENTRODESCRIPCION" ;
      edtavFecharegistro_Internalname = "vFECHAREGISTRO" ;
      edtavNove_movimientodescrip_Internalname = "vNOVE_MOVIMIENTODESCRIP" ;
      edtavFechatran_Internalname = "vFECHATRAN" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION" ;
      edtavNove_moduloorigen_Internalname = "vNOVE_MODULOORIGEN" ;
      edtavNove_almadescripcionorig_Internalname = "vNOVE_ALMADESCRIPCIONORIG" ;
      edtavNove_bodedescripcionorig_Internalname = "vNOVE_BODEDESCRIPCIONORIG" ;
      edtavNove_cuentadantenomorigen_Internalname = "vNOVE_CUENTADANTENOMORIGEN" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtavPlacapadre_Internalname = "vPLACAPADRE" ;
      edtavNove_modulodestino_Internalname = "vNOVE_MODULODESTINO" ;
      edtavNove_almadescripciondesti_Internalname = "vNOVE_ALMADESCRIPCIONDESTI" ;
      edtavNove_bodedescripciondesti_Internalname = "vNOVE_BODEDESCRIPCIONDESTI" ;
      edtavNove_cuentadantenomdestino_Internalname = "vNOVE_CUENTADANTENOMDESTINO" ;
      divTable3_Internalname = "TABLE3" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtavDescripcion_antigua_Internalname = "vDESCRIPCION_ANTIGUA" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      imgImage4_Internalname = "IMAGE4" ;
      edtavCedula_proveedor_Internalname = "vCEDULA_PROVEEDOR" ;
      edtavNombre_proveedor_Internalname = "vNOMBRE_PROVEEDOR" ;
      edtavNuevo_valor_Internalname = "vNUEVO_VALOR" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavArea_codigo_Internalname = "vAREA_CODIGO" ;
      edtavArea_descripcion_Internalname = "vAREA_DESCRIPCION" ;
      imgImage2_Internalname = "IMAGE2" ;
      edtavCurs_codigo_Internalname = "vCURS_CODIGO" ;
      edtavCurs_descripcion_Internalname = "vCURS_DESCRIPCION" ;
      imgImage3_Internalname = "IMAGE3" ;
      edtavCuentad_cedula_Internalname = "vCUENTAD_CEDULA" ;
      edtavCuentad_nombre_Internalname = "vCUENTAD_NOMBRE" ;
      edtavValor_Internalname = "vVALOR" ;
      divTable4_Internalname = "TABLE4" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      imgImage7_Internalname = "IMAGE7" ;
      edtavNuevaplaca_Internalname = "vNUEVAPLACA" ;
      bttAgregarplaca_Internalname = "AGREGARPLACA" ;
      divTable6_Internalname = "TABLE6" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtavAnt_nombreingreso_Internalname = "vANT_NOMBREINGRESO" ;
      dynavOrig_identificador.setInternalname( "vORIG_IDENTIFICADOR" );
      edtavAnt_numeroingreso_Internalname = "vANT_NUMEROINGRESO" ;
      edtavNew_numeroingreso_Internalname = "vNEW_NUMEROINGRESO" ;
      edtavAnt_fechaingreso_Internalname = "vANT_FECHAINGRESO" ;
      edtavFecha_Internalname = "vFECHA" ;
      divTable8_Internalname = "TABLE8" ;
      edtavCtlnro_linea_Internalname = "CTLNRO_LINEA" ;
      edtavCtlplaca_Internalname = "CTLPLACA" ;
      edtavCtlconsecutivo_Internalname = "CTLCONSECUTIVO" ;
      edtavCtldescripcion_Internalname = "CTLDESCRIPCION" ;
      edtavCtlplacapadreactual_Internalname = "CTLPLACAPADREACTUAL" ;
      edtavCtlplacapadrenueva_Internalname = "CTLPLACAPADRENUEVA" ;
      edtavCtlcantidadactual_Internalname = "CTLCANTIDADACTUAL" ;
      edtavCtlcantidadnueva_Internalname = "CTLCANTIDADNUEVA" ;
      edtavCtlconsecutivoactual_Internalname = "CTLCONSECUTIVOACTUAL" ;
      edtavCtlconsecutivonuevo_Internalname = "CTLCONSECUTIVONUEVO" ;
      edtavCtlatributoactual_Internalname = "CTLATRIBUTOACTUAL" ;
      edtavCtlatributonuevo_Internalname = "CTLATRIBUTONUEVO" ;
      edtavCtlvaloractual_Internalname = "CTLVALORACTUAL" ;
      edtavCtlvalornuevo_Internalname = "CTLVALORNUEVO" ;
      divTable5_Internalname = "TABLE5" ;
      Alertify1_Internalname = "ALERTIFY1" ;
      lblUrl_Internalname = "URL" ;
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
      edtavCtlvalornuevo_Jsonclick = "" ;
      edtavCtlvalornuevo_Enabled = 1 ;
      edtavCtlvaloractual_Jsonclick = "" ;
      edtavCtlatributonuevo_Jsonclick = "" ;
      edtavCtlatributonuevo_Enabled = 1 ;
      edtavCtlatributoactual_Jsonclick = "" ;
      edtavCtlconsecutivonuevo_Jsonclick = "" ;
      edtavCtlconsecutivonuevo_Enabled = 1 ;
      edtavCtlconsecutivoactual_Jsonclick = "" ;
      edtavCtlcantidadnueva_Jsonclick = "" ;
      edtavCtlcantidadnueva_Enabled = 1 ;
      edtavCtlcantidadactual_Jsonclick = "" ;
      edtavCtlplacapadrenueva_Jsonclick = "" ;
      edtavCtlplacapadreactual_Jsonclick = "" ;
      edtavCtldescripcion_Jsonclick = "" ;
      edtavCtlconsecutivo_Jsonclick = "" ;
      edtavCtlplaca_Jsonclick = "" ;
      edtavCtlnro_linea_Jsonclick = "" ;
      edtavCtlplacapadrenueva_Enabled = 1 ;
      edtavCtlnro_linea_Visible = 0 ;
      edtavCtlatributonuevo_Visible = -1 ;
      edtavCtlatributoactual_Visible = -1 ;
      edtavCtlvalornuevo_Visible = -1 ;
      edtavCtlvaloractual_Visible = -1 ;
      edtavCtlconsecutivo_Visible = -1 ;
      edtavCtlplaca_Visible = -1 ;
      edtavCtlplacapadrenueva_Visible = -1 ;
      edtavCtlplacapadreactual_Visible = -1 ;
      edtavCtlconsecutivonuevo_Visible = -1 ;
      edtavCtlconsecutivoactual_Visible = -1 ;
      edtavCtlcantidadnueva_Visible = -1 ;
      edtavCtlcantidadactual_Visible = -1 ;
      edtavCtlvaloractual_Enabled = -1 ;
      edtavCtlatributoactual_Enabled = -1 ;
      edtavCtlconsecutivoactual_Enabled = -1 ;
      edtavCtlcantidadactual_Enabled = -1 ;
      edtavCtlplacapadreactual_Enabled = -1 ;
      edtavCtldescripcion_Enabled = -1 ;
      edtavCtlconsecutivo_Enabled = -1 ;
      edtavCtlplaca_Enabled = -1 ;
      edtavCtlnro_linea_Enabled = -1 ;
      lblUrl_Caption = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavCtlvalornuevo_Visible = -1 ;
      edtavCtlvaloractual_Enabled = 0 ;
      edtavCtlvaloractual_Visible = -1 ;
      edtavCtlatributonuevo_Visible = -1 ;
      edtavCtlatributoactual_Enabled = 0 ;
      edtavCtlatributoactual_Visible = -1 ;
      edtavCtlconsecutivonuevo_Visible = -1 ;
      edtavCtlconsecutivoactual_Enabled = 0 ;
      edtavCtlconsecutivoactual_Visible = -1 ;
      edtavCtlcantidadnueva_Visible = -1 ;
      edtavCtlcantidadactual_Enabled = 0 ;
      edtavCtlcantidadactual_Visible = -1 ;
      edtavCtlplacapadrenueva_Enabled = 1 ;
      edtavCtlplacapadrenueva_Visible = -1 ;
      edtavCtlplacapadreactual_Enabled = 0 ;
      edtavCtlplacapadreactual_Visible = -1 ;
      edtavCtldescripcion_Enabled = 0 ;
      edtavCtlconsecutivo_Enabled = 0 ;
      edtavCtlconsecutivo_Visible = -1 ;
      edtavCtlplaca_Enabled = 0 ;
      edtavCtlplaca_Visible = -1 ;
      edtavCtlnro_linea_Enabled = 0 ;
      edtavCtlnro_linea_Visible = 0 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      divTable5_Visible = 1 ;
      edtavFecha_Jsonclick = "" ;
      edtavFecha_Enabled = 1 ;
      edtavFecha_Visible = 1 ;
      edtavAnt_fechaingreso_Jsonclick = "" ;
      edtavAnt_fechaingreso_Enabled = 1 ;
      edtavNew_numeroingreso_Jsonclick = "" ;
      edtavNew_numeroingreso_Enabled = 1 ;
      edtavNew_numeroingreso_Visible = 1 ;
      edtavAnt_numeroingreso_Jsonclick = "" ;
      edtavAnt_numeroingreso_Enabled = 1 ;
      dynavOrig_identificador.setJsonclick( "" );
      dynavOrig_identificador.setEnabled( 1 );
      dynavOrig_identificador.setVisible( 1 );
      edtavAnt_nombreingreso_Jsonclick = "" ;
      edtavAnt_nombreingreso_Enabled = 1 ;
      divTable8_Visible = 1 ;
      edtavNuevaplaca_Jsonclick = "" ;
      edtavNuevaplaca_Enabled = 1 ;
      divTable6_Visible = 1 ;
      edtavValor_Jsonclick = "" ;
      edtavValor_Enabled = 1 ;
      edtavValor_Visible = 1 ;
      edtavCuentad_nombre_Jsonclick = "" ;
      edtavCuentad_nombre_Enabled = 1 ;
      edtavCuentad_nombre_Visible = 1 ;
      edtavCuentad_cedula_Jsonclick = "" ;
      edtavCuentad_cedula_Enabled = 1 ;
      edtavCuentad_cedula_Visible = 1 ;
      imgImage3_Visible = 1 ;
      edtavCurs_descripcion_Enabled = 1 ;
      edtavCurs_descripcion_Visible = 1 ;
      edtavCurs_codigo_Jsonclick = "" ;
      edtavCurs_codigo_Enabled = 1 ;
      edtavCurs_codigo_Visible = 1 ;
      imgImage2_Visible = 1 ;
      edtavArea_descripcion_Enabled = 1 ;
      edtavArea_descripcion_Visible = 1 ;
      edtavArea_codigo_Jsonclick = "" ;
      edtavArea_codigo_Enabled = 1 ;
      edtavArea_codigo_Visible = 1 ;
      imgImage1_Visible = 1 ;
      edtavNuevo_valor_Enabled = 1 ;
      edtavNuevo_valor_Visible = 1 ;
      edtavNombre_proveedor_Jsonclick = "" ;
      edtavNombre_proveedor_Enabled = 1 ;
      edtavNombre_proveedor_Visible = 1 ;
      edtavCedula_proveedor_Jsonclick = "" ;
      edtavCedula_proveedor_Enabled = 1 ;
      edtavCedula_proveedor_Visible = 1 ;
      imgImage4_Visible = 1 ;
      edtavDescripcion_antigua_Enabled = 1 ;
      edtavDescripcion_antigua_Visible = 1 ;
      divTable4_Visible = 1 ;
      edtavNove_cuentadantenomdestino_Jsonclick = "" ;
      edtavNove_cuentadantenomdestino_Enabled = 1 ;
      edtavNove_cuentadantenomdestino_Visible = 1 ;
      edtavNove_bodedescripciondesti_Jsonclick = "" ;
      edtavNove_bodedescripciondesti_Enabled = 1 ;
      edtavNove_bodedescripciondesti_Visible = 1 ;
      edtavNove_almadescripciondesti_Jsonclick = "" ;
      edtavNove_almadescripciondesti_Enabled = 1 ;
      edtavNove_almadescripciondesti_Visible = 1 ;
      edtavNove_modulodestino_Jsonclick = "" ;
      edtavNove_modulodestino_Enabled = 1 ;
      edtavNove_modulodestino_Visible = 1 ;
      edtavPlacapadre_Jsonclick = "" ;
      edtavPlacapadre_Enabled = 1 ;
      edtavPlacapadre_Visible = 1 ;
      lblTextblock2_Visible = 1 ;
      edtavNove_cuentadantenomorigen_Jsonclick = "" ;
      edtavNove_cuentadantenomorigen_Enabled = 1 ;
      edtavNove_cuentadantenomorigen_Visible = 1 ;
      edtavNove_bodedescripcionorig_Jsonclick = "" ;
      edtavNove_bodedescripcionorig_Enabled = 1 ;
      edtavNove_bodedescripcionorig_Visible = 1 ;
      edtavNove_almadescripcionorig_Jsonclick = "" ;
      edtavNove_almadescripcionorig_Enabled = 1 ;
      edtavNove_almadescripcionorig_Visible = 1 ;
      edtavNove_moduloorigen_Jsonclick = "" ;
      edtavNove_moduloorigen_Enabled = 1 ;
      edtavNove_moduloorigen_Visible = 1 ;
      edtavCata_descripcion_Enabled = 1 ;
      edtavCata_descripcion_Visible = 1 ;
      lblTextblock1_Visible = 1 ;
      edtavFechatran_Jsonclick = "" ;
      edtavFechatran_Enabled = 1 ;
      edtavFechatran_Visible = 1 ;
      edtavNove_movimientodescrip_Jsonclick = "" ;
      edtavNove_movimientodescrip_Enabled = 1 ;
      edtavNove_movimientodescrip_Visible = 1 ;
      edtavFecharegistro_Jsonclick = "" ;
      edtavFecharegistro_Enabled = 1 ;
      edtavFecharegistro_Visible = 1 ;
      edtavNove_centrodescripcion_Jsonclick = "" ;
      edtavNove_centrodescripcion_Enabled = 1 ;
      edtavNove_centrodescripcion_Visible = 1 ;
      edtavNove_soporte_Jsonclick = "" ;
      edtavNove_soporte_Parameters = "" ;
      edtavNove_soporte_Contenttype = "" ;
      edtavNove_soporte_Filetype = "" ;
      edtavNove_soporte_Enabled = 1 ;
      edtavNove_observaciones_Enabled = 1 ;
      edtavPlaca_Jsonclick = "" ;
      edtavPlaca_Enabled = 1 ;
      edtavPlaca_Visible = 1 ;
      imgImage5_Visible = 1 ;
      edtavArchivo_Jsonclick = "" ;
      edtavArchivo_Parameters = "" ;
      edtavArchivo_Contenttype = "" ;
      edtavArchivo_Filetype = "" ;
      edtavArchivo_Enabled = 1 ;
      divTable7_Visible = 1 ;
      cmbavNove_masivo.setJsonclick( "" );
      cmbavNove_masivo.setEnabled( 1 );
      cmbavNove_masivo.setVisible( 1 );
      edtavTran_consecutivocc_Jsonclick = "" ;
      edtavTran_consecutivocc_Enabled = 1 ;
      edtavTran_consecutivocc_Visible = 1 ;
      imgImage6_Visible = 1 ;
      dynavRegi_id.setJsonclick( "" );
      dynavRegi_id.setEnabled( 1 );
      dynavRegi_id.setVisible( 1 );
      cmbavTnov_codigo.setJsonclick( "" );
      cmbavTnov_codigo.setEnabled( 1 );
      edtavArchivo_Filename = "" ;
      Alertify1_Textcancel = "Cancelar" ;
      Alertify1_Textok = "Confirmar" ;
      Alertify1_Textmessage = "" ;
      Alertify1_Type = "log" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Novedades" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV99SDTDetalle',fld:'vSDTDETALLE',grid:241,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("VTNOV_CODIGO.ISVALID","{handler:'e177Y2',iparms:[{av:'A104TNov_Codigo',fld:'TNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'cmbavTnov_codigo'},{av:'AV89TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'A771TNov_Nro_Cambios',fld:'TNOV_NRO_CAMBIOS',pic:'ZZZ9',nv:0},{av:'A813TNov_IngresoMasivo',fld:'TNOV_INGRESOMASIVO',pic:'',nv:''},{av:'A774TNov_Nombre_Campo',fld:'TNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'A772TNov_Procedimiento',fld:'TNOV_PROCEDIMIENTO',pic:'',nv:''},{av:'A770TNov_Tipo',fld:'TNOV_TIPO',pic:'',nv:''},{av:'A839TNov_ObligaSoporte',fld:'TNOV_OBLIGASOPORTE',pic:'',nv:''},{av:'AV80Placas',fld:'vPLACAS',pic:'',nv:''},{av:'AV78Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV101Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV70Nove_ValorAntiguo',fld:'vNOVE_VALORANTIGUO',pic:'',nv:''},{av:'AV71Nove_ValorNuevo',fld:'vNOVE_VALORNUEVO',pic:'',nv:''},{av:'AV44Descripcion_Antigua',fld:'vDESCRIPCION_ANTIGUA',pic:'',nv:''},{av:'AV38Cedula_Proveedor',fld:'vCEDULA_PROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV52Nombre_Proveedor',fld:'vNOMBRE_PROVEEDOR',pic:'@!',nv:''},{av:'dynavOrig_identificador'},{av:'AV74Orig_Identificador',fld:'vORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV72Nuevo_Valor',fld:'vNUEVO_VALOR',pic:'',nv:''},{av:'AV46Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV33Area_Codigo',fld:'vAREA_CODIGO',pic:'',nv:''},{av:'AV42Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''},{av:'AV39Cuentad_Cedula',fld:'vCUENTAD_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV93Valor',fld:'vVALOR',pic:'ZZZZZZZZZZZZZZ9.99',nv:0.0},{av:'AV67Nove_Observaciones',fld:'vNOVE_OBSERVACIONES',pic:'',nv:''},{av:'AV110Archivo',fld:'vARCHIVO',pic:'',nv:''},{av:'AV69Nove_Soporte',fld:'vNOVE_SOPORTE',pic:'',nv:''},{av:'cmbavNove_masivo'},{av:'AV63Nove_Masivo',fld:'vNOVE_MASIVO',pic:'',nv:''},{av:'AV14TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV10TNov_Nombre_Campo',fld:'vTNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'AV99SDTDetalle',fld:'vSDTDETALLE',grid:241,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0}],oparms:[{av:'AV11TNov_Nro_Cambios',fld:'vTNOV_NRO_CAMBIOS',pic:'ZZZ9',nv:0},{av:'AV10TNov_Nombre_Campo',fld:'vTNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'AV12TNov_Procedimiento',fld:'vTNOV_PROCEDIMIENTO',pic:'',nv:''},{av:'AV14TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV112TNov_ObligaSoporte',fld:'vTNOV_OBLIGASOPORTE',pic:'',nv:''},{av:'cmbavNove_masivo'},{av:'AV99SDTDetalle',fld:'vSDTDETALLE',grid:241,pic:'',nv:null},{av:'AV80Placas',fld:'vPLACAS',pic:'',nv:''},{av:'AV78Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV101Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV70Nove_ValorAntiguo',fld:'vNOVE_VALORANTIGUO',pic:'',nv:''},{av:'AV71Nove_ValorNuevo',fld:'vNOVE_VALORNUEVO',pic:'',nv:''},{av:'AV44Descripcion_Antigua',fld:'vDESCRIPCION_ANTIGUA',pic:'',nv:''},{av:'AV38Cedula_Proveedor',fld:'vCEDULA_PROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV52Nombre_Proveedor',fld:'vNOMBRE_PROVEEDOR',pic:'@!',nv:''},{av:'dynavOrig_identificador'},{av:'AV74Orig_Identificador',fld:'vORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV72Nuevo_Valor',fld:'vNUEVO_VALOR',pic:'',nv:''},{av:'AV46Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV33Area_Codigo',fld:'vAREA_CODIGO',pic:'',nv:''},{av:'AV42Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''},{av:'AV39Cuentad_Cedula',fld:'vCUENTAD_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV93Valor',fld:'vVALOR',pic:'ZZZZZZZZZZZZZZ9.99',nv:0.0},{av:'AV67Nove_Observaciones',fld:'vNOVE_OBSERVACIONES',pic:'',nv:''},{av:'AV110Archivo',fld:'vARCHIVO',pic:'',nv:''},{av:'AV69Nove_Soporte',fld:'vNOVE_SOPORTE',pic:'',nv:''},{av:'divTable7_Visible',ctrl:'TABLE7',prop:'Visible'},{av:'AV63Nove_Masivo',fld:'vNOVE_MASIVO',pic:'',nv:''},{av:'imgImage4_Visible',ctrl:'IMAGE4',prop:'Visible'},{av:'edtavCedula_proveedor_Visible',ctrl:'vCEDULA_PROVEEDOR',prop:'Visible'},{av:'edtavNombre_proveedor_Visible',ctrl:'vNOMBRE_PROVEEDOR',prop:'Visible'},{av:'edtavNuevo_valor_Visible',ctrl:'vNUEVO_VALOR',prop:'Visible'},{av:'edtavFecha_Visible',ctrl:'vFECHA',prop:'Visible'},{av:'imgImage1_Visible',ctrl:'IMAGE1',prop:'Visible'},{av:'edtavArea_codigo_Visible',ctrl:'vAREA_CODIGO',prop:'Visible'},{av:'edtavArea_descripcion_Visible',ctrl:'vAREA_DESCRIPCION',prop:'Visible'},{av:'imgImage2_Visible',ctrl:'IMAGE2',prop:'Visible'},{av:'edtavCurs_codigo_Visible',ctrl:'vCURS_CODIGO',prop:'Visible'},{av:'edtavCurs_descripcion_Visible',ctrl:'vCURS_DESCRIPCION',prop:'Visible'},{av:'imgImage3_Visible',ctrl:'IMAGE3',prop:'Visible'},{av:'edtavCuentad_cedula_Visible',ctrl:'vCUENTAD_CEDULA',prop:'Visible'},{av:'edtavCuentad_nombre_Visible',ctrl:'vCUENTAD_NOMBRE',prop:'Visible'},{av:'edtavValor_Visible',ctrl:'vVALOR',prop:'Visible'},{av:'edtavPlaca_Visible',ctrl:'vPLACA',prop:'Visible'},{av:'imgImage5_Visible',ctrl:'IMAGE5',prop:'Visible'},{av:'divTable4_Visible',ctrl:'TABLE4',prop:'Visible'},{av:'divTable5_Visible',ctrl:'TABLE5',prop:'Visible'},{av:'divTable6_Visible',ctrl:'TABLE6',prop:'Visible'},{av:'divTable8_Visible',ctrl:'TABLE8',prop:'Visible'},{av:'AV37Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV79PlacaPadre',fld:'vPLACAPADRE',pic:'',nv:''},{av:'edtavTran_consecutivocc_Visible',ctrl:'vTRAN_CONSECUTIVOCC',prop:'Visible'},{av:'imgImage6_Visible',ctrl:'IMAGE6',prop:'Visible'},{av:'dynavRegi_id'},{av:'edtavNove_centrodescripcion_Visible',ctrl:'vNOVE_CENTRODESCRIPCION',prop:'Visible'},{av:'edtavNove_movimientodescrip_Visible',ctrl:'vNOVE_MOVIMIENTODESCRIP',prop:'Visible'},{av:'lblTextblock1_Visible',ctrl:'TEXTBLOCK1',prop:'Visible'},{av:'edtavFechatran_Visible',ctrl:'vFECHATRAN',prop:'Visible'},{av:'edtavFecharegistro_Visible',ctrl:'vFECHAREGISTRO',prop:'Visible'},{av:'edtavNove_moduloorigen_Visible',ctrl:'vNOVE_MODULOORIGEN',prop:'Visible'},{av:'edtavNove_almadescripcionorig_Visible',ctrl:'vNOVE_ALMADESCRIPCIONORIG',prop:'Visible'},{av:'edtavNove_bodedescripcionorig_Visible',ctrl:'vNOVE_BODEDESCRIPCIONORIG',prop:'Visible'},{av:'edtavNove_cuentadantenomorigen_Visible',ctrl:'vNOVE_CUENTADANTENOMORIGEN',prop:'Visible'},{av:'lblTextblock2_Visible',ctrl:'TEXTBLOCK2',prop:'Visible'},{av:'edtavNove_modulodestino_Visible',ctrl:'vNOVE_MODULODESTINO',prop:'Visible'},{av:'edtavNove_almadescripciondesti_Visible',ctrl:'vNOVE_ALMADESCRIPCIONDESTI',prop:'Visible'},{av:'edtavNove_bodedescripciondesti_Visible',ctrl:'vNOVE_BODEDESCRIPCIONDESTI',prop:'Visible'},{av:'edtavNove_cuentadantenomdestino_Visible',ctrl:'vNOVE_CUENTADANTENOMDESTINO',prop:'Visible'},{av:'edtavCata_descripcion_Visible',ctrl:'vCATA_DESCRIPCION',prop:'Visible'},{av:'edtavPlacapadre_Visible',ctrl:'vPLACAPADRE',prop:'Visible'}]}");
      setEventMetadata("VTRAN_CONSECUTIVOCC.ISVALID","{handler:'e187Y2',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV90Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A419Tran_CentroCostoCodigo',fld:'TRAN_CENTROCOSTOCODIGO',pic:'',nv:''},{av:'A420Tran_CentroCostoDescripcion',fld:'TRAN_CENTROCOSTODESCRIPCION',pic:'',nv:''},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A49Tran_CodigoMovimiento',fld:'TRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'A381Tran_DescripcionMovimiento',fld:'TRAN_DESCRIPCIONMOVIMIENTO',pic:'',nv:''},{av:'A110Tran_ModuloOrigen',fld:'TRAN_MODULOORIGEN',pic:'',nv:''},{av:'A109Tran_CodAlmaOrigen',fld:'TRAN_CODALMAORIGEN',pic:'',nv:''},{av:'A390Tran_FechaRatificacion',fld:'TRAN_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''},{av:'A55Tran_FechaRegistro',fld:'TRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'AV31Alma_Descripcion',fld:'vALMA_DESCRIPCION',pic:'@!',nv:''},{av:'A112Tran_CodBodeOrigen',fld:'TRAN_CODBODEORIGEN',pic:'',nv:''},{av:'AV36Bode_Descripcion',fld:'vBODE_DESCRIPCION',pic:'@!',nv:''},{av:'A702Tran_CedulaCuentadanteOrigen',fld:'TRAN_CEDULACUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A703Tran_CedulaProveedor',fld:'TRAN_CEDULAPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A575Tran_NombreProveedor',fld:'TRAN_NOMBREPROVEEDOR',pic:'@!',nv:''},{av:'A384Tran_NombCuentadanteOrigen',fld:'TRAN_NOMBCUENTADANTEORIGEN',pic:'@!',nv:''},{av:'A385Tran_ModuloDestino',fld:'TRAN_MODULODESTINO',pic:'',nv:''},{av:'A111Tran_CodAlmaDestino',fld:'TRAN_CODALMADESTINO',pic:'',nv:''},{av:'A387Tran_CodBodeDestino',fld:'TRAN_CODBODEDESTINO',pic:'',nv:''},{av:'A704Tran_CedulaCuentadanteDestino',fld:'TRAN_CEDULACUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A389Tran_NombCuentadanteDestino',fld:'TRAN_NOMBCUENTADANTEDESTINO',pic:'@!',nv:''},{av:'A53Tran_IdProveedor',fld:'TRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A54Tran_TipoIngreso',fld:'TRAN_TIPOINGRESO',pic:'ZZZZZZZZZZ9',nv:0},{av:'A672Tran_NombreIngreso',fld:'TRAN_NOMBREINGRESO',pic:'@!',nv:''},{av:'A514Tran_NumeroIngreso',fld:'TRAN_NUMEROINGRESO',pic:'',nv:''},{av:'A515Tran_FechaIngreso',fld:'TRAN_FECHAINGRESO',pic:'',nv:''},{av:'A416Tran_Observaciones',fld:'TRAN_OBSERVACIONES',pic:'',nv:''},{av:'A407Tran_AreadanteCodigo',fld:'TRAN_AREADANTECODIGO',pic:'',nv:''},{av:'A408Tran_CursoCodigo',fld:'TRAN_CURSOCODIGO',pic:'',nv:''},{av:'A52Tran_IdCuentadanteDestino',fld:'TRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A1Cent_Id',fld:'CENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV6Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''},{av:'AV32Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',nv:''},{av:'AV30Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'A252Alma_Descripcion',fld:'ALMA_DESCRIPCION',pic:'@!',nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',nv:''},{av:'AV35Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'A251Bode_Descripcion',fld:'BODE_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'AV59Nove_CentroDescripcion',fld:'vNOVE_CENTRODESCRIPCION',pic:'',nv:''},{av:'AV6Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV5Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''},{av:'AV66Nove_MovimientoDescrip',fld:'vNOVE_MOVIMIENTODESCRIP',pic:'',nv:''},{av:'AV65Nove_ModuloOrigen',fld:'vNOVE_MODULOORIGEN',pic:'',nv:''},{av:'AV32Alma_Modulo',fld:'vALMA_MODULO',pic:'',nv:''},{av:'AV30Alma_Codigo',fld:'vALMA_CODIGO',pic:'',nv:''},{av:'AV119FechaTran',fld:'vFECHATRAN',pic:'99/99/99 99:99',nv:''},{av:'AV122FechaRegistro',fld:'vFECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'AV54Nove_AlmaDescripcionOrig',fld:'vNOVE_ALMADESCRIPCIONORIG',pic:'',nv:''},{av:'AV35Bode_Codigo',fld:'vBODE_CODIGO',pic:'',nv:''},{av:'AV56Nove_BodeDescripcionOrig',fld:'vNOVE_BODEDESCRIPCIONORIG',pic:'',nv:''},{av:'AV61Nove_CuentadanteNomOrigen',fld:'vNOVE_CUENTADANTENOMORIGEN',pic:'@!',nv:''},{av:'AV64Nove_ModuloDestino',fld:'vNOVE_MODULODESTINO',pic:'',nv:''},{av:'AV53Nove_AlmaDescripcionDesti',fld:'vNOVE_ALMADESCRIPCIONDESTI',pic:'',nv:''},{av:'AV55Nove_BodeDescripcionDesti',fld:'vNOVE_BODEDESCRIPCIONDESTI',pic:'',nv:''},{av:'AV60Nove_CuentadanteNomDestino',fld:'vNOVE_CUENTADANTENOMDESTINO',pic:'@!',nv:''},{av:'AV18Tran_CedulaProveedor',fld:'vTRAN_CEDULAPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV26Tran_NombreProveedor',fld:'vTRAN_NOMBREPROVEEDOR',pic:'@!',nv:''},{av:'AV23Tran_IdProveedor',fld:'vTRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV29Tran_TipoIngreso',fld:'vTRAN_TIPOINGRESO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV104Tran_NombreIngreso',fld:'vTRAN_NOMBREINGRESO',pic:'@!',nv:''},{av:'AV27Tran_NumeroIngreso',fld:'vTRAN_NUMEROINGRESO',pic:'',nv:''},{av:'AV21Tran_FechaIngreso',fld:'vTRAN_FECHAINGRESO',pic:'',nv:''},{av:'AV28Tran_Observaciones',fld:'vTRAN_OBSERVACIONES',pic:'',nv:''},{av:'AV15Tran_AreadanteCodigo',fld:'vTRAN_AREADANTECODIGO',pic:'',nv:''},{av:'AV19Tran_CursoCodigo',fld:'vTRAN_CURSOCODIGO',pic:'',nv:''},{av:'AV22Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV17Tran_CedulaCuentadanteDestino',fld:'vTRAN_CEDULACUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV24Tran_NombCuentadanteDestino',fld:'vTRAN_NOMBCUENTADANTEDESTINO',pic:'@!',nv:''},{av:'AV31Alma_Descripcion',fld:'vALMA_DESCRIPCION',pic:'@!',nv:''},{av:'AV36Bode_Descripcion',fld:'vBODE_DESCRIPCION',pic:'@!',nv:''}]}");
      setEventMetadata("VNOVE_OBSERVACIONES.ISVALID","{handler:'e197Y2',iparms:[{av:'AV90Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavTnov_codigo'},{av:'AV89TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV11TNov_Nro_Cambios',fld:'vTNOV_NRO_CAMBIOS',pic:'ZZZ9',nv:0},{av:'AV77Permitido',fld:'vPERMITIDO',pic:'',nv:''},{av:'cmbavNove_masivo'},{av:'AV63Nove_Masivo',fld:'vNOVE_MASIVO',pic:'',nv:''},{av:'AV12TNov_Procedimiento',fld:'vTNOV_PROCEDIMIENTO',pic:'',nv:''},{av:'AV26Tran_NombreProveedor',fld:'vTRAN_NOMBREPROVEEDOR',pic:'@!',nv:''},{av:'AV18Tran_CedulaProveedor',fld:'vTRAN_CEDULAPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV23Tran_IdProveedor',fld:'vTRAN_IDPROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV104Tran_NombreIngreso',fld:'vTRAN_NOMBREINGRESO',pic:'@!',nv:''},{av:'AV21Tran_FechaIngreso',fld:'vTRAN_FECHAINGRESO',pic:'',nv:''},{av:'AV27Tran_NumeroIngreso',fld:'vTRAN_NUMEROINGRESO',pic:'',nv:''},{av:'AV29Tran_TipoIngreso',fld:'vTRAN_TIPOINGRESO',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV28Tran_Observaciones',fld:'vTRAN_OBSERVACIONES',pic:'',nv:''},{av:'AV16Tran_AreadanteDescripcion',fld:'vTRAN_AREADANTEDESCRIPCION',pic:'',nv:''},{av:'AV15Tran_AreadanteCodigo',fld:'vTRAN_AREADANTECODIGO',pic:'',nv:''},{av:'AV20Tran_CursoDescripcion',fld:'vTRAN_CURSODESCRIPCION',pic:'',nv:''},{av:'AV19Tran_CursoCodigo',fld:'vTRAN_CURSOCODIGO',pic:'',nv:''},{av:'AV24Tran_NombCuentadanteDestino',fld:'vTRAN_NOMBCUENTADANTEDESTINO',pic:'@!',nv:''},{av:'AV17Tran_CedulaCuentadanteDestino',fld:'vTRAN_CEDULACUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV22Tran_IdCuentadanteDestino',fld:'vTRAN_IDCUENTADANTEDESTINO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV48Invd_ValorAdquisicion',fld:'vINVD_VALORADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV75Otros_Costos_Dev',fld:'vOTROS_COSTOS_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV97Vida_Util_Actual',fld:'vVIDA_UTIL_ACTUAL',pic:'ZZZ9',nv:0},{av:'AV78Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV10TNov_Nombre_Campo',fld:'vTNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'A59Area_Codigo',fld:'AREA_CODIGO',pic:'',nv:''},{av:'A452Area_Descripcion',fld:'AREA_DESCRIPCION',pic:'',nv:''},{av:'A73Curs_Codigo',fld:'CURS_CODIGO',pic:'',nv:''},{av:'A424Curs_Descripcion',fld:'CURS_DESCRIPCION',pic:'',nv:''},{av:'AV99SDTDetalle',fld:'vSDTDETALLE',grid:241,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0}],oparms:[{av:'AV77Permitido',fld:'vPERMITIDO',pic:'',nv:''},{av:'AV11TNov_Nro_Cambios',fld:'vTNOV_NRO_CAMBIOS',pic:'ZZZ9',nv:0},{av:'cmbavTnov_codigo'},{av:'AV89TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV90Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'edtavDescripcion_antigua_Visible',ctrl:'vDESCRIPCION_ANTIGUA',prop:'Visible'},{av:'AV99SDTDetalle',fld:'vSDTDETALLE',grid:241,pic:'',nv:null},{av:'divTable5_Visible',ctrl:'TABLE5',prop:'Visible'},{ctrl:'CTLCONSECUTIVOACTUAL',prop:'Visible'},{ctrl:'CTLCONSECUTIVONUEVO',prop:'Visible'},{ctrl:'CTLPLACAPADREACTUAL',prop:'Visible'},{ctrl:'CTLPLACAPADRENUEVA',prop:'Visible'},{ctrl:'CTLATRIBUTOACTUAL',prop:'Visible'},{ctrl:'CTLATRIBUTONUEVO',prop:'Visible'},{ctrl:'CTLVALORACTUAL',prop:'Visible'},{ctrl:'CTLVALORNUEVO',prop:'Visible'},{ctrl:'CTLPLACA',prop:'Visible'},{ctrl:'CTLCONSECUTIVO',prop:'Visible'},{ctrl:'CTLCANTIDADACTUAL',prop:'Visible'},{ctrl:'CTLCANTIDADNUEVA',prop:'Visible'},{ctrl:'CTLNRO_LINEA',prop:'Visible'},{ctrl:'CTLPLACAPADRENUEVA',prop:'Enabled'},{av:'AV70Nove_ValorAntiguo',fld:'vNOVE_VALORANTIGUO',pic:'',nv:''},{av:'AV44Descripcion_Antigua',fld:'vDESCRIPCION_ANTIGUA',pic:'',nv:''},{av:'edtavValor_Visible',ctrl:'vVALOR',prop:'Visible'},{av:'divTable4_Visible',ctrl:'TABLE4',prop:'Visible'},{av:'imgImage3_Visible',ctrl:'IMAGE3',prop:'Visible'},{av:'edtavCuentad_cedula_Visible',ctrl:'vCUENTAD_CEDULA',prop:'Visible'},{av:'edtavCuentad_nombre_Visible',ctrl:'vCUENTAD_NOMBRE',prop:'Visible'},{av:'imgImage2_Visible',ctrl:'IMAGE2',prop:'Visible'},{av:'edtavCurs_codigo_Visible',ctrl:'vCURS_CODIGO',prop:'Visible'},{av:'edtavCurs_descripcion_Visible',ctrl:'vCURS_DESCRIPCION',prop:'Visible'},{av:'imgImage1_Visible',ctrl:'IMAGE1',prop:'Visible'},{av:'edtavArea_codigo_Visible',ctrl:'vAREA_CODIGO',prop:'Visible'},{av:'edtavArea_descripcion_Visible',ctrl:'vAREA_DESCRIPCION',prop:'Visible'},{av:'edtavNuevo_valor_Visible',ctrl:'vNUEVO_VALOR',prop:'Visible'},{av:'divTable8_Visible',ctrl:'TABLE8',prop:'Visible'},{av:'AV115Ant_NumeroIngreso',fld:'vANT_NUMEROINGRESO',pic:'',nv:''},{av:'AV116Ant_FechaIngreso',fld:'vANT_FECHAINGRESO',pic:'',nv:''},{av:'AV117Ant_NombreIngreso',fld:'vANT_NOMBREINGRESO',pic:'',nv:''},{av:'dynavOrig_identificador'},{av:'AV74Orig_Identificador',fld:'vORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV118New_NumeroIngreso',fld:'vNEW_NUMEROINGRESO',pic:'',nv:''},{av:'AV46Fecha',fld:'vFECHA',pic:'',nv:''},{av:'edtavNew_numeroingreso_Visible',ctrl:'vNEW_NUMEROINGRESO',prop:'Visible'},{av:'edtavFecha_Visible',ctrl:'vFECHA',prop:'Visible'},{av:'imgImage4_Visible',ctrl:'IMAGE4',prop:'Visible'},{av:'edtavCedula_proveedor_Visible',ctrl:'vCEDULA_PROVEEDOR',prop:'Visible'},{av:'edtavNombre_proveedor_Visible',ctrl:'vNOMBRE_PROVEEDOR',prop:'Visible'},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV16Tran_AreadanteDescripcion',fld:'vTRAN_AREADANTEDESCRIPCION',pic:'',nv:''},{av:'AV20Tran_CursoDescripcion',fld:'vTRAN_CURSODESCRIPCION',pic:'',nv:''}]}");
      setEventMetadata("'CONFIRMAR'","{handler:'e207Y2',iparms:[{av:'cmbavNove_masivo'},{av:'AV63Nove_Masivo',fld:'vNOVE_MASIVO',pic:'',nv:''},{av:'AV47Ide_Proveedor',fld:'vIDE_PROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV46Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV116Ant_FechaIngreso',fld:'vANT_FECHAINGRESO',pic:'',nv:''},{av:'AV118New_NumeroIngreso',fld:'vNEW_NUMEROINGRESO',pic:'',nv:''},{av:'AV115Ant_NumeroIngreso',fld:'vANT_NUMEROINGRESO',pic:'',nv:''},{av:'AV70Nove_ValorAntiguo',fld:'vNOVE_VALORANTIGUO',pic:'',nv:''},{av:'dynavOrig_identificador'},{av:'AV74Orig_Identificador',fld:'vORIG_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV72Nuevo_Valor',fld:'vNUEVO_VALOR',pic:'',nv:''},{av:'AV33Area_Codigo',fld:'vAREA_CODIGO',pic:'',nv:''},{av:'AV42Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''},{av:'AV40Cuentad_Id',fld:'vCUENTAD_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV93Valor',fld:'vVALOR',pic:'ZZZZZZZZZZZZZZ9.99',nv:0.0},{av:'AV78Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV102Tran_Entrada',fld:'vTRAN_ENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV85SDTNovedadesDetalle',fld:'vSDTNOVEDADESDETALLE',pic:'',nv:null},{av:'AV99SDTDetalle',fld:'vSDTDETALLE',grid:241,pic:'',nv:null},{av:'AV10TNov_Nombre_Campo',fld:'vTNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'AV110Archivo',fld:'vARCHIVO',pic:'',nv:''},{av:'AV71Nove_ValorNuevo',fld:'vNOVE_VALORNUEVO',pic:'',nv:''},{av:'AV69Nove_Soporte',fld:'vNOVE_SOPORTE',pic:'',nv:''},{av:'AV112TNov_ObligaSoporte',fld:'vTNOV_OBLIGASOPORTE',pic:'',nv:''}],oparms:[{av:'AV71Nove_ValorNuevo',fld:'vNOVE_VALORNUEVO',pic:'',nv:''},{av:'AV85SDTNovedadesDetalle',fld:'vSDTNOVEDADESDETALLE',pic:'',nv:null},{av:'AV90Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'}]}");
      setEventMetadata("ALERTIFY1.OK","{handler:'e167Y2',iparms:[{av:'AV91Usua_Id',fld:'vUSUA_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV84SDTNovedades',fld:'vSDTNOVEDADES',pic:'',nv:null},{av:'AV90Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavTnov_codigo'},{av:'AV89TNov_Codigo',fld:'vTNOV_CODIGO',pic:'ZZZZZ9',nv:0},{av:'AV67Nove_Observaciones',fld:'vNOVE_OBSERVACIONES',pic:'',nv:''},{av:'cmbavNove_masivo'},{av:'AV63Nove_Masivo',fld:'vNOVE_MASIVO',pic:'',nv:''},{av:'AV69Nove_Soporte',fld:'vNOVE_SOPORTE',pic:'',nv:''},{av:'edtavArchivo_Filename',ctrl:'vARCHIVO',prop:'Filename'},{av:'AV110Archivo',fld:'vARCHIVO',pic:'',nv:''},{av:'AV85SDTNovedadesDetalle',fld:'vSDTNOVEDADESDETALLE',pic:'',nv:null},{av:'AV14TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'dynavRegi_id'},{av:'AV82Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV101Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV123Errores',fld:'vERRORES',pic:'',nv:''},{av:'AV124SDTErrorMasivo',fld:'vSDTERRORMASIVO',pic:'',nv:null},{av:'AV10TNov_Nombre_Campo',fld:'vTNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'AV70Nove_ValorAntiguo',fld:'vNOVE_VALORANTIGUO',pic:'',nv:''},{av:'AV71Nove_ValorNuevo',fld:'vNOVE_VALORNUEVO',pic:'',nv:''},{av:'AV7Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV78Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV8Nove_Identificador',fld:'vNOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV68Nove_RespuestaProc',fld:'vNOVE_RESPUESTAPROC',pic:'',nv:''},{av:'AV62Nove_Estado',fld:'vNOVE_ESTADO',pic:'',nv:''},{av:'AV12TNov_Procedimiento',fld:'vTNOV_PROCEDIMIENTO',pic:'',nv:''}],oparms:[{av:'AV84SDTNovedades',fld:'vSDTNOVEDADES',pic:'',nv:null},{av:'AV124SDTErrorMasivo',fld:'vSDTERRORMASIVO',pic:'',nv:null},{av:'AV123Errores',fld:'vERRORES',pic:'',nv:''},{av:'AV101Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'dynavRegi_id'},{av:'AV82Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14TNov_Tipo',fld:'vTNOV_TIPO',pic:'',nv:''},{av:'AV85SDTNovedadesDetalle',fld:'vSDTNOVEDADESDETALLE',pic:'',nv:null},{av:'AV110Archivo',fld:'vARCHIVO',pic:'',nv:''},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'lblUrl_Caption',ctrl:'URL',prop:'Caption'},{av:'AV8Nove_Identificador',fld:'vNOVE_IDENTIFICADOR',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV68Nove_RespuestaProc',fld:'vNOVE_RESPUESTAPROC',pic:'',nv:''},{av:'AV62Nove_Estado',fld:'vNOVE_ESTADO',pic:'',nv:''}]}");
      setEventMetadata("'CANCELAR'","{handler:'e217Y2',iparms:[],oparms:[]}");
      setEventMetadata("'SELECCIONAR'","{handler:'e127Y1',iparms:[{av:'AV47Ide_Proveedor',fld:'vIDE_PROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV52Nombre_Proveedor',fld:'vNOMBRE_PROVEEDOR',pic:'@!',nv:''},{av:'AV38Cedula_Proveedor',fld:'vCEDULA_PROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV38Cedula_Proveedor',fld:'vCEDULA_PROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV52Nombre_Proveedor',fld:'vNOMBRE_PROVEEDOR',pic:'@!',nv:''},{av:'AV47Ide_Proveedor',fld:'vIDE_PROVEEDOR',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'AREADANTE'","{handler:'e137Y1',iparms:[{av:'AV5Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}],oparms:[{av:'AV34Area_Descripcion',fld:'vAREA_DESCRIPCION',pic:'',nv:''},{av:'AV33Area_Codigo',fld:'vAREA_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("'CURSO'","{handler:'e147Y1',iparms:[{av:'AV5Cent_Codigo',fld:'vCENT_CODIGO',pic:'',nv:''}],oparms:[{av:'AV43Curs_Descripcion',fld:'vCURS_DESCRIPCION',pic:'',nv:''},{av:'AV42Curs_Codigo',fld:'vCURS_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("'CUENTADANTE'","{handler:'e157Y1',iparms:[],oparms:[{av:'AV39Cuentad_Cedula',fld:'vCUENTAD_CEDULA',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41Cuentad_Nombre',fld:'vCUENTAD_NOMBRE',pic:'@!',nv:''},{av:'AV40Cuentad_Id',fld:'vCUENTAD_ID',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'PLACA'","{handler:'e227Y2',iparms:[{av:'AV10TNov_Nombre_Campo',fld:'vTNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'dynavRegi_id'},{av:'AV82Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV78Placa',fld:'vPLACA',pic:'',nv:''}],oparms:[{av:'AV78Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV102Tran_Entrada',fld:'vTRAN_ENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavRegi_id'},{av:'AV82Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("VPLACA.ISVALID","{handler:'e237Y2',iparms:[{av:'AV79PlacaPadre',fld:'vPLACAPADRE',pic:'',nv:''},{av:'AV37Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV48Invd_ValorAdquisicion',fld:'vINVD_VALORADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV75Otros_Costos_Dev',fld:'vOTROS_COSTOS_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV96Variable_VF',fld:'vVARIABLE_VF',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV94Variable_I',fld:'vVARIABLE_I',pic:'ZZ9',nv:0},{av:'AV95Variable_N',fld:'vVARIABLE_N',pic:'ZZZ9',nv:0},{av:'AV97Vida_Util_Actual',fld:'vVIDA_UTIL_ACTUAL',pic:'ZZZ9',nv:0},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV78Placa',fld:'vPLACA',pic:'',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A465Invd_ValorAdquisicion',fld:'INVD_VALORADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A628Otros_Costos_Dev',fld:'OTROS_COSTOS_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A625Variable_VF',fld:'VARIABLE_VF',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A626Variable_I',fld:'VARIABLE_I',pic:'ZZ9',nv:0},{av:'A627Variable_N',fld:'VARIABLE_N',pic:'ZZZ9',nv:0},{av:'A631Vida_Util_Actual',fld:'VIDA_UTIL_ACTUAL',pic:'ZZZ9',nv:0},{av:'AV99SDTDetalle',fld:'vSDTDETALLE',grid:241,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0}],oparms:[{av:'AV79PlacaPadre',fld:'vPLACAPADRE',pic:'',nv:''},{av:'AV37Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV48Invd_ValorAdquisicion',fld:'vINVD_VALORADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV75Otros_Costos_Dev',fld:'vOTROS_COSTOS_DEV',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV96Variable_VF',fld:'vVARIABLE_VF',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV94Variable_I',fld:'vVARIABLE_I',pic:'ZZ9',nv:0},{av:'AV95Variable_N',fld:'vVARIABLE_N',pic:'ZZZ9',nv:0},{av:'AV97Vida_Util_Actual',fld:'vVIDA_UTIL_ACTUAL',pic:'ZZZ9',nv:0},{av:'AV99SDTDetalle',fld:'vSDTDETALLE',grid:241,pic:'',nv:null}]}");
      setEventMetadata("'TRANSACCION'","{handler:'e247Y2',iparms:[{av:'AV10TNov_Nombre_Campo',fld:'vTNOV_NOMBRE_CAMPO',pic:'',nv:''},{av:'dynavRegi_id'},{av:'AV82Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV99SDTDetalle',fld:'vSDTDETALLE',grid:241,pic:'',nv:null},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0}],oparms:[{av:'AV99SDTDetalle',fld:'vSDTDETALLE',grid:241,pic:'',nv:null},{av:'dynavRegi_id'},{av:'AV82Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV101Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV90Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'ASOCIAR PLACA'","{handler:'e287Y2',iparms:[{av:'dynavRegi_id'},{av:'AV82Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV78Placa',fld:'vPLACA',pic:'',nv:''}],oparms:[{av:'AV78Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV102Tran_Entrada',fld:'vTRAN_ENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'dynavRegi_id'},{av:'AV82Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV105NuevaPlaca',fld:'vNUEVAPLACA',pic:'',nv:''}]}");
      setEventMetadata("VNUEVAPLACA.ISVALID","{handler:'e257Y2',iparms:[{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV105NuevaPlaca',fld:'vNUEVAPLACA',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'AV106NuevoConsecutivo',fld:'vNUEVOCONSECUTIVO',pic:'',nv:''},{av:'AV107NuevaDescripcion',fld:'vNUEVADESCRIPCION',pic:'',nv:''},{ctrl:'CTLPLACAPADRENUEVA',prop:'Enabled'}]}");
      setEventMetadata("'AGREGAR PLACA'","{handler:'e267Y2',iparms:[{av:'AV99SDTDetalle',fld:'vSDTDETALLE',grid:241,pic:'',nv:null},{av:'AV105NuevaPlaca',fld:'vNUEVAPLACA',pic:'',nv:''},{av:'AV107NuevaDescripcion',fld:'vNUEVADESCRIPCION',pic:'',nv:''},{av:'AV78Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV106NuevoConsecutivo',fld:'vNUEVOCONSECUTIVO',pic:'',nv:''},{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0}],oparms:[{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV99SDTDetalle',fld:'vSDTDETALLE',grid:241,pic:'',nv:null},{av:'AV105NuevaPlaca',fld:'vNUEVAPLACA',pic:'',nv:''}]}");
      setEventMetadata("'GENERAR EXCEL'","{handler:'e277Y2',iparms:[],oparms:[]}");
      setEventMetadata("'CARGAR ARCHIVO'","{handler:'e117Y1',iparms:[{av:'AV132FileUploadData',fld:'vFILEUPLOADDATA',pic:'',nv:null}],oparms:[]}");
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
      GXKey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV99SDTDetalle = new GXBaseCollection<com.orions2.SdtSDTDetalle_SDTDetalleItem>(com.orions2.SdtSDTDetalle_SDTDetalleItem.class, "SDTDetalle.SDTDetalleItem", "ACBSENA", remoteHandle);
      AV132FileUploadData = new GXBaseCollection<com.orions2.SdtFileUploadData_FileUploadDataItem>(com.orions2.SdtFileUploadData_FileUploadDataItem.class, "FileUploadData.FileUploadDataItem", "ACBSENA", remoteHandle);
      A813TNov_IngresoMasivo = "" ;
      A774TNov_Nombre_Campo = "" ;
      A772TNov_Procedimiento = "" ;
      A770TNov_Tipo = "" ;
      A839TNov_ObligaSoporte = "" ;
      AV80Placas = "" ;
      AV70Nove_ValorAntiguo = "" ;
      AV71Nove_ValorNuevo = "" ;
      AV14TNov_Tipo = "" ;
      AV10TNov_Nombre_Campo = "" ;
      A419Tran_CentroCostoCodigo = "" ;
      A420Tran_CentroCostoDescripcion = "" ;
      A49Tran_CodigoMovimiento = "" ;
      A381Tran_DescripcionMovimiento = "" ;
      A110Tran_ModuloOrigen = "" ;
      A109Tran_CodAlmaOrigen = "" ;
      A390Tran_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      AV31Alma_Descripcion = "" ;
      A112Tran_CodBodeOrigen = "" ;
      AV36Bode_Descripcion = "" ;
      A575Tran_NombreProveedor = "" ;
      A384Tran_NombCuentadanteOrigen = "" ;
      A385Tran_ModuloDestino = "" ;
      A111Tran_CodAlmaDestino = "" ;
      A387Tran_CodBodeDestino = "" ;
      A389Tran_NombCuentadanteDestino = "" ;
      A672Tran_NombreIngreso = "" ;
      A514Tran_NumeroIngreso = "" ;
      A515Tran_FechaIngreso = GXutil.nullDate() ;
      A416Tran_Observaciones = "" ;
      A407Tran_AreadanteCodigo = "" ;
      A408Tran_CursoCodigo = "" ;
      A27Alma_Modulo = "" ;
      AV32Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      AV30Alma_Codigo = "" ;
      A252Alma_Descripcion = "" ;
      A31Bode_Codigo = "" ;
      AV35Bode_Codigo = "" ;
      A251Bode_Descripcion = "" ;
      AV77Permitido = "" ;
      AV12TNov_Procedimiento = "" ;
      AV26Tran_NombreProveedor = "" ;
      AV104Tran_NombreIngreso = "" ;
      AV21Tran_FechaIngreso = GXutil.nullDate() ;
      AV27Tran_NumeroIngreso = "" ;
      AV28Tran_Observaciones = "" ;
      AV16Tran_AreadanteDescripcion = "" ;
      AV15Tran_AreadanteCodigo = "" ;
      AV20Tran_CursoDescripcion = "" ;
      AV19Tran_CursoCodigo = "" ;
      AV24Tran_NombCuentadanteDestino = "" ;
      AV48Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      AV75Otros_Costos_Dev = DecimalUtil.ZERO ;
      A59Area_Codigo = "" ;
      A452Area_Descripcion = "" ;
      A73Curs_Codigo = "" ;
      A424Curs_Descripcion = "" ;
      AV85SDTNovedadesDetalle = new GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem>(com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem.class, "SDTNovedadesDetalle.SDTNovedadesDetalleItem", "ACBSENA", remoteHandle);
      AV112TNov_ObligaSoporte = "" ;
      AV84SDTNovedades = new com.orions2.SdtSDTNovedades(remoteHandle, context);
      AV123Errores = "" ;
      AV124SDTErrorMasivo = new GXBaseCollection<com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem>(com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem.class, "SDTErrorMasivo.SDTErrorMasivoItem", "ACBSENA", remoteHandle);
      AV7Elem_Consecutivo = "" ;
      AV68Nove_RespuestaProc = "" ;
      AV62Nove_Estado = "" ;
      AV5Cent_Codigo = "" ;
      AV96Variable_VF = DecimalUtil.ZERO ;
      A67Invd_NumeroPlaca = "" ;
      A68Invd_PlacaPadre = "" ;
      A298Cata_Descripcion = "" ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      A628Otros_Costos_Dev = DecimalUtil.ZERO ;
      A625Variable_VF = DecimalUtil.ZERO ;
      A66Elem_Consecutivo = "" ;
      AV107NuevaDescripcion = "" ;
      AV106NuevoConsecutivo = "" ;
      AV134FileUploadDataColl = new com.orions2.SdtFileUploadData_FileUploadDataItem(remoteHandle, context);
      GXCCtlgxBlob = "" ;
      AV110Archivo = "" ;
      AV69Nove_Soporte = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      sImgUrl = "" ;
      imgImage6_Jsonclick = "" ;
      AV63Nove_Masivo = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      bttGenerarexcel_Jsonclick = "" ;
      imgImage5_Jsonclick = "" ;
      AV78Placa = "" ;
      AV67Nove_Observaciones = "" ;
      bttCargararchivo_Jsonclick = "" ;
      AV59Nove_CentroDescripcion = "" ;
      AV122FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      AV66Nove_MovimientoDescrip = "" ;
      AV119FechaTran = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock1_Jsonclick = "" ;
      AV37Cata_Descripcion = "" ;
      AV65Nove_ModuloOrigen = "" ;
      AV54Nove_AlmaDescripcionOrig = "" ;
      AV56Nove_BodeDescripcionOrig = "" ;
      AV61Nove_CuentadanteNomOrigen = "" ;
      lblTextblock2_Jsonclick = "" ;
      AV79PlacaPadre = "" ;
      AV64Nove_ModuloDestino = "" ;
      AV53Nove_AlmaDescripcionDesti = "" ;
      AV55Nove_BodeDescripcionDesti = "" ;
      AV60Nove_CuentadanteNomDestino = "" ;
      lblTextblock4_Jsonclick = "" ;
      AV44Descripcion_Antigua = "" ;
      lblTextblock3_Jsonclick = "" ;
      imgImage4_Jsonclick = "" ;
      AV52Nombre_Proveedor = "" ;
      AV72Nuevo_Valor = "" ;
      imgImage1_Jsonclick = "" ;
      AV33Area_Codigo = "" ;
      AV34Area_Descripcion = "" ;
      imgImage2_Jsonclick = "" ;
      AV42Curs_Codigo = "" ;
      AV43Curs_Descripcion = "" ;
      imgImage3_Jsonclick = "" ;
      AV41Cuentad_Nombre = "" ;
      AV93Valor = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      imgImage7_Jsonclick = "" ;
      AV105NuevaPlaca = "" ;
      bttAgregarplaca_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      AV117Ant_NombreIngreso = "" ;
      AV115Ant_NumeroIngreso = "" ;
      AV118New_NumeroIngreso = "" ;
      AV116Ant_FechaIngreso = GXutil.nullDate() ;
      AV46Fecha = GXutil.nullDate() ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      lblUrl_Jsonclick = "" ;
      bttConfirmar_Jsonclick = "" ;
      bttCancelar_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      H007Y2_A41Orig_Identificador = new long[1] ;
      H007Y2_A635Orig_Descripcion = new String[] {""} ;
      H007Y2_n635Orig_Descripcion = new boolean[] {false} ;
      gxcolvREGI_ID = new GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem>(com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem.class, "SDTRegionalTrn.SDTRegionalTrnItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTRegionalTrn_SDTRegionalTrnItem1 = new GXBaseCollection [1] ;
      AV92Usuario = "" ;
      AV98Websession = httpContext.getWebSession();
      H007Y3_A104TNov_Codigo = new int[1] ;
      H007Y3_A771TNov_Nro_Cambios = new short[1] ;
      H007Y3_n771TNov_Nro_Cambios = new boolean[] {false} ;
      H007Y3_A813TNov_IngresoMasivo = new String[] {""} ;
      H007Y3_n813TNov_IngresoMasivo = new boolean[] {false} ;
      H007Y3_A774TNov_Nombre_Campo = new String[] {""} ;
      H007Y3_n774TNov_Nombre_Campo = new boolean[] {false} ;
      H007Y3_A772TNov_Procedimiento = new String[] {""} ;
      H007Y3_n772TNov_Procedimiento = new boolean[] {false} ;
      H007Y3_A770TNov_Tipo = new String[] {""} ;
      H007Y3_n770TNov_Tipo = new boolean[] {false} ;
      H007Y3_A839TNov_ObligaSoporte = new String[] {""} ;
      H007Y3_n839TNov_ObligaSoporte = new boolean[] {false} ;
      AV9TNov_IngresoMasivo = "" ;
      H007Y4_A416Tran_Observaciones = new String[] {""} ;
      H007Y4_n416Tran_Observaciones = new boolean[] {false} ;
      H007Y4_A51Tran_IdCuentadanteOrigen = new long[1] ;
      H007Y4_n51Tran_IdCuentadanteOrigen = new boolean[] {false} ;
      H007Y4_A46Tran_Id = new long[1] ;
      H007Y4_A420Tran_CentroCostoDescripcion = new String[] {""} ;
      H007Y4_n420Tran_CentroCostoDescripcion = new boolean[] {false} ;
      H007Y4_A419Tran_CentroCostoCodigo = new String[] {""} ;
      H007Y4_n419Tran_CentroCostoCodigo = new boolean[] {false} ;
      H007Y4_A48Tran_CentroCostoId = new long[1] ;
      H007Y4_A381Tran_DescripcionMovimiento = new String[] {""} ;
      H007Y4_n381Tran_DescripcionMovimiento = new boolean[] {false} ;
      H007Y4_A49Tran_CodigoMovimiento = new String[] {""} ;
      H007Y4_A110Tran_ModuloOrigen = new String[] {""} ;
      H007Y4_A109Tran_CodAlmaOrigen = new String[] {""} ;
      H007Y4_A390Tran_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H007Y4_n390Tran_FechaRatificacion = new boolean[] {false} ;
      H007Y4_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H007Y4_A112Tran_CodBodeOrigen = new String[] {""} ;
      H007Y4_A702Tran_CedulaCuentadanteOrigen = new long[1] ;
      H007Y4_n702Tran_CedulaCuentadanteOrigen = new boolean[] {false} ;
      H007Y4_A575Tran_NombreProveedor = new String[] {""} ;
      H007Y4_n575Tran_NombreProveedor = new boolean[] {false} ;
      H007Y4_A703Tran_CedulaProveedor = new long[1] ;
      H007Y4_n703Tran_CedulaProveedor = new boolean[] {false} ;
      H007Y4_A384Tran_NombCuentadanteOrigen = new String[] {""} ;
      H007Y4_n384Tran_NombCuentadanteOrigen = new boolean[] {false} ;
      H007Y4_A385Tran_ModuloDestino = new String[] {""} ;
      H007Y4_A111Tran_CodAlmaDestino = new String[] {""} ;
      H007Y4_A387Tran_CodBodeDestino = new String[] {""} ;
      H007Y4_A389Tran_NombCuentadanteDestino = new String[] {""} ;
      H007Y4_n389Tran_NombCuentadanteDestino = new boolean[] {false} ;
      H007Y4_A704Tran_CedulaCuentadanteDestino = new long[1] ;
      H007Y4_n704Tran_CedulaCuentadanteDestino = new boolean[] {false} ;
      H007Y4_A53Tran_IdProveedor = new long[1] ;
      H007Y4_n53Tran_IdProveedor = new boolean[] {false} ;
      H007Y4_A54Tran_TipoIngreso = new long[1] ;
      H007Y4_n54Tran_TipoIngreso = new boolean[] {false} ;
      H007Y4_A672Tran_NombreIngreso = new String[] {""} ;
      H007Y4_n672Tran_NombreIngreso = new boolean[] {false} ;
      H007Y4_A514Tran_NumeroIngreso = new String[] {""} ;
      H007Y4_n514Tran_NumeroIngreso = new boolean[] {false} ;
      H007Y4_A515Tran_FechaIngreso = new java.util.Date[] {GXutil.nullDate()} ;
      H007Y4_n515Tran_FechaIngreso = new boolean[] {false} ;
      H007Y4_A407Tran_AreadanteCodigo = new String[] {""} ;
      H007Y4_n407Tran_AreadanteCodigo = new boolean[] {false} ;
      H007Y4_A408Tran_CursoCodigo = new String[] {""} ;
      H007Y4_n408Tran_CursoCodigo = new boolean[] {false} ;
      H007Y4_A52Tran_IdCuentadanteDestino = new long[1] ;
      H007Y4_n52Tran_IdCuentadanteDestino = new boolean[] {false} ;
      GXv_int3 = new int [1] ;
      GXv_int4 = new short [1] ;
      AV81Programa = "" ;
      GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 = new GXBaseCollection<com.orions2.SdtSDTDetalle_SDTDetalleItem>(com.orions2.SdtSDTDetalle_SDTDetalleItem.class, "SDTDetalle.SDTDetalleItem", "ACBSENA", remoteHandle);
      GXv_objcol_SdtSDTDetalle_SDTDetalleItem8 = new GXBaseCollection [1] ;
      AV86SDTNovedadesDetalleItem = new com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem(remoteHandle, context);
      AV100SDTDetalleItem = new com.orions2.SdtSDTDetalle_SDTDetalleItem(remoteHandle, context);
      AV111NombreArchivo = "" ;
      GXv_char5 = new String [1] ;
      GXv_int2 = new long [1] ;
      GXv_objcol_SdtSDTErrorMasivo_SDTErrorMasivoItem12 = new GXBaseCollection [1] ;
      AV128url = "" ;
      GXv_SdtSDTNovedades13 = new com.orions2.SdtSDTNovedades [1] ;
      GXv_objcol_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem9 = new GXBaseCollection [1] ;
      H007Y5_A66Elem_Consecutivo = new String[] {""} ;
      H007Y5_A37Cata_Codigo = new String[] {""} ;
      H007Y5_A67Invd_NumeroPlaca = new String[] {""} ;
      H007Y5_A68Invd_PlacaPadre = new String[] {""} ;
      H007Y5_n68Invd_PlacaPadre = new boolean[] {false} ;
      H007Y5_A298Cata_Descripcion = new String[] {""} ;
      H007Y5_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007Y5_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      H007Y5_A628Otros_Costos_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007Y5_n628Otros_Costos_Dev = new boolean[] {false} ;
      H007Y5_A625Variable_VF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007Y5_n625Variable_VF = new boolean[] {false} ;
      H007Y5_A626Variable_I = new short[1] ;
      H007Y5_n626Variable_I = new boolean[] {false} ;
      H007Y5_A627Variable_N = new short[1] ;
      H007Y5_n627Variable_N = new boolean[] {false} ;
      H007Y5_A631Vida_Util_Actual = new short[1] ;
      H007Y5_n631Vida_Util_Actual = new boolean[] {false} ;
      A37Cata_Codigo = "" ;
      AV76P_ID = "" ;
      P_id_svchar18_0 = "" ;
      Nove_estado_svchar1_0 = "" ;
      H007Y6_AP_id_svchar18_0 = new String[] {""} ;
      H007Y6_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y6_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y7_AP_id_svchar18_0 = new String[] {""} ;
      H007Y7_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y7_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y8_AP_id_svchar18_0 = new String[] {""} ;
      H007Y8_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y8_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y9_AP_id_svchar18_0 = new String[] {""} ;
      H007Y9_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y9_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y10_AP_id_svchar18_0 = new String[] {""} ;
      H007Y10_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y10_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y11_AP_id_svchar18_0 = new String[] {""} ;
      H007Y11_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y11_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y12_AP_id_svchar18_0 = new String[] {""} ;
      H007Y12_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y12_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y13_AP_id_svchar18_0 = new String[] {""} ;
      H007Y13_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y13_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y14_AP_id_svchar18_0 = new String[] {""} ;
      H007Y14_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y14_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y15_AP_id_svchar18_0 = new String[] {""} ;
      H007Y15_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y15_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y16_AP_id_svchar18_0 = new String[] {""} ;
      H007Y16_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y16_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y17_AP_id_svchar18_0 = new String[] {""} ;
      H007Y17_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y17_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y18_AP_id_svchar18_0 = new String[] {""} ;
      H007Y18_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y18_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y19_AP_id_svchar18_0 = new String[] {""} ;
      H007Y19_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y19_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y20_AP_id_svchar18_0 = new String[] {""} ;
      H007Y20_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y20_AV68Nove_RespuestaProc = new String[] {""} ;
      H007Y21_AP_id_svchar18_0 = new String[] {""} ;
      H007Y21_ANove_estado_svchar1_0 = new String[] {""} ;
      H007Y21_AV68Nove_RespuestaProc = new String[] {""} ;
      GXv_int10 = new long [1] ;
      H007Y22_A59Area_Codigo = new String[] {""} ;
      H007Y22_A452Area_Descripcion = new String[] {""} ;
      H007Y23_A28Alma_Codigo = new String[] {""} ;
      H007Y23_A27Alma_Modulo = new String[] {""} ;
      H007Y23_A1Cent_Id = new long[1] ;
      H007Y23_A252Alma_Descripcion = new String[] {""} ;
      H007Y24_A31Bode_Codigo = new String[] {""} ;
      H007Y24_A28Alma_Codigo = new String[] {""} ;
      H007Y24_A27Alma_Modulo = new String[] {""} ;
      H007Y24_A1Cent_Id = new long[1] ;
      H007Y24_A251Bode_Descripcion = new String[] {""} ;
      H007Y25_A773TNov_Estado = new String[] {""} ;
      H007Y25_n773TNov_Estado = new boolean[] {false} ;
      H007Y25_A105TNov_Rol_Id = new long[1] ;
      H007Y25_A769TNov_Descripcion = new String[] {""} ;
      H007Y25_n769TNov_Descripcion = new boolean[] {false} ;
      H007Y25_A104TNov_Codigo = new int[1] ;
      A773TNov_Estado = "" ;
      A769TNov_Descripcion = "" ;
      AV83Rol = "" ;
      H007Y26_A21Rol_Id = new long[1] ;
      H007Y26_A23Usua_Id = new long[1] ;
      H007Y27_A73Curs_Codigo = new String[] {""} ;
      H007Y27_A424Curs_Descripcion = new String[] {""} ;
      H007Y28_A37Cata_Codigo = new String[] {""} ;
      H007Y28_A67Invd_NumeroPlaca = new String[] {""} ;
      H007Y28_A66Elem_Consecutivo = new String[] {""} ;
      H007Y28_A298Cata_Descripcion = new String[] {""} ;
      AV109Existe = "" ;
      AV114Filename = "" ;
      GXv_char11 = new String [1] ;
      AV113ErrorMessage = "" ;
      GXv_char7 = new String [1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wp_novedades__default(),
         new Object[] {
             new Object[] {
            H007Y2_A41Orig_Identificador, H007Y2_A635Orig_Descripcion, H007Y2_n635Orig_Descripcion
            }
            , new Object[] {
            H007Y3_A104TNov_Codigo, H007Y3_A771TNov_Nro_Cambios, H007Y3_n771TNov_Nro_Cambios, H007Y3_A813TNov_IngresoMasivo, H007Y3_n813TNov_IngresoMasivo, H007Y3_A774TNov_Nombre_Campo, H007Y3_n774TNov_Nombre_Campo, H007Y3_A772TNov_Procedimiento, H007Y3_n772TNov_Procedimiento, H007Y3_A770TNov_Tipo,
            H007Y3_n770TNov_Tipo, H007Y3_A839TNov_ObligaSoporte, H007Y3_n839TNov_ObligaSoporte
            }
            , new Object[] {
            H007Y4_A416Tran_Observaciones, H007Y4_n416Tran_Observaciones, H007Y4_A51Tran_IdCuentadanteOrigen, H007Y4_n51Tran_IdCuentadanteOrigen, H007Y4_A46Tran_Id, H007Y4_A420Tran_CentroCostoDescripcion, H007Y4_n420Tran_CentroCostoDescripcion, H007Y4_A419Tran_CentroCostoCodigo, H007Y4_n419Tran_CentroCostoCodigo, H007Y4_A48Tran_CentroCostoId,
            H007Y4_A381Tran_DescripcionMovimiento, H007Y4_n381Tran_DescripcionMovimiento, H007Y4_A49Tran_CodigoMovimiento, H007Y4_A110Tran_ModuloOrigen, H007Y4_A109Tran_CodAlmaOrigen, H007Y4_A390Tran_FechaRatificacion, H007Y4_n390Tran_FechaRatificacion, H007Y4_A55Tran_FechaRegistro, H007Y4_A112Tran_CodBodeOrigen, H007Y4_A702Tran_CedulaCuentadanteOrigen,
            H007Y4_n702Tran_CedulaCuentadanteOrigen, H007Y4_A575Tran_NombreProveedor, H007Y4_n575Tran_NombreProveedor, H007Y4_A703Tran_CedulaProveedor, H007Y4_n703Tran_CedulaProveedor, H007Y4_A384Tran_NombCuentadanteOrigen, H007Y4_n384Tran_NombCuentadanteOrigen, H007Y4_A385Tran_ModuloDestino, H007Y4_A111Tran_CodAlmaDestino, H007Y4_A387Tran_CodBodeDestino,
            H007Y4_A389Tran_NombCuentadanteDestino, H007Y4_n389Tran_NombCuentadanteDestino, H007Y4_A704Tran_CedulaCuentadanteDestino, H007Y4_n704Tran_CedulaCuentadanteDestino, H007Y4_A53Tran_IdProveedor, H007Y4_n53Tran_IdProveedor, H007Y4_A54Tran_TipoIngreso, H007Y4_n54Tran_TipoIngreso, H007Y4_A672Tran_NombreIngreso, H007Y4_n672Tran_NombreIngreso,
            H007Y4_A514Tran_NumeroIngreso, H007Y4_n514Tran_NumeroIngreso, H007Y4_A515Tran_FechaIngreso, H007Y4_n515Tran_FechaIngreso, H007Y4_A407Tran_AreadanteCodigo, H007Y4_n407Tran_AreadanteCodigo, H007Y4_A408Tran_CursoCodigo, H007Y4_n408Tran_CursoCodigo, H007Y4_A52Tran_IdCuentadanteDestino, H007Y4_n52Tran_IdCuentadanteDestino
            }
            , new Object[] {
            H007Y5_A66Elem_Consecutivo, H007Y5_A37Cata_Codigo, H007Y5_A67Invd_NumeroPlaca, H007Y5_A68Invd_PlacaPadre, H007Y5_n68Invd_PlacaPadre, H007Y5_A298Cata_Descripcion, H007Y5_A465Invd_ValorAdquisicion, H007Y5_n465Invd_ValorAdquisicion, H007Y5_A628Otros_Costos_Dev, H007Y5_n628Otros_Costos_Dev,
            H007Y5_A625Variable_VF, H007Y5_n625Variable_VF, H007Y5_A626Variable_I, H007Y5_n626Variable_I, H007Y5_A627Variable_N, H007Y5_n627Variable_N, H007Y5_A631Vida_Util_Actual, H007Y5_n631Vida_Util_Actual
            }
            , new Object[] {
            H007Y6_AP_id_svchar18_0, H007Y6_ANove_estado_svchar1_0, H007Y6_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y7_AP_id_svchar18_0, H007Y7_ANove_estado_svchar1_0, H007Y7_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y8_AP_id_svchar18_0, H007Y8_ANove_estado_svchar1_0, H007Y8_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y9_AP_id_svchar18_0, H007Y9_ANove_estado_svchar1_0, H007Y9_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y10_AP_id_svchar18_0, H007Y10_ANove_estado_svchar1_0, H007Y10_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y11_AP_id_svchar18_0, H007Y11_ANove_estado_svchar1_0, H007Y11_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y12_AP_id_svchar18_0, H007Y12_ANove_estado_svchar1_0, H007Y12_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y13_AP_id_svchar18_0, H007Y13_ANove_estado_svchar1_0, H007Y13_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y14_AP_id_svchar18_0, H007Y14_ANove_estado_svchar1_0, H007Y14_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y15_AP_id_svchar18_0, H007Y15_ANove_estado_svchar1_0, H007Y15_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y16_AP_id_svchar18_0, H007Y16_ANove_estado_svchar1_0, H007Y16_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y17_AP_id_svchar18_0, H007Y17_ANove_estado_svchar1_0, H007Y17_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y18_AP_id_svchar18_0, H007Y18_ANove_estado_svchar1_0, H007Y18_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y19_AP_id_svchar18_0, H007Y19_ANove_estado_svchar1_0, H007Y19_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y20_AP_id_svchar18_0, H007Y20_ANove_estado_svchar1_0, H007Y20_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y21_AP_id_svchar18_0, H007Y21_ANove_estado_svchar1_0, H007Y21_AV68Nove_RespuestaProc
            }
            , new Object[] {
            H007Y22_A59Area_Codigo, H007Y22_A452Area_Descripcion
            }
            , new Object[] {
            H007Y23_A28Alma_Codigo, H007Y23_A27Alma_Modulo, H007Y23_A1Cent_Id, H007Y23_A252Alma_Descripcion
            }
            , new Object[] {
            H007Y24_A31Bode_Codigo, H007Y24_A28Alma_Codigo, H007Y24_A27Alma_Modulo, H007Y24_A1Cent_Id, H007Y24_A251Bode_Descripcion
            }
            , new Object[] {
            H007Y25_A773TNov_Estado, H007Y25_n773TNov_Estado, H007Y25_A105TNov_Rol_Id, H007Y25_A769TNov_Descripcion, H007Y25_n769TNov_Descripcion, H007Y25_A104TNov_Codigo
            }
            , new Object[] {
            H007Y26_A21Rol_Id, H007Y26_A23Usua_Id
            }
            , new Object[] {
            H007Y27_A73Curs_Codigo, H007Y27_A424Curs_Descripcion
            }
            , new Object[] {
            H007Y28_A37Cata_Codigo, H007Y28_A67Invd_NumeroPlaca, H007Y28_A66Elem_Consecutivo, H007Y28_A298Cata_Descripcion
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavNove_centrodescripcion_Enabled = 0 ;
      edtavFecharegistro_Enabled = 0 ;
      edtavNove_movimientodescrip_Enabled = 0 ;
      edtavFechatran_Enabled = 0 ;
      edtavCata_descripcion_Enabled = 0 ;
      edtavNove_moduloorigen_Enabled = 0 ;
      edtavNove_almadescripcionorig_Enabled = 0 ;
      edtavNove_bodedescripcionorig_Enabled = 0 ;
      edtavNove_cuentadantenomorigen_Enabled = 0 ;
      edtavPlacapadre_Enabled = 0 ;
      edtavNove_modulodestino_Enabled = 0 ;
      edtavNove_almadescripciondesti_Enabled = 0 ;
      edtavNove_bodedescripciondesti_Enabled = 0 ;
      edtavNove_cuentadantenomdestino_Enabled = 0 ;
      edtavDescripcion_antigua_Enabled = 0 ;
      edtavCedula_proveedor_Enabled = 0 ;
      edtavNombre_proveedor_Enabled = 0 ;
      edtavArea_codigo_Enabled = 0 ;
      edtavArea_descripcion_Enabled = 0 ;
      edtavCurs_codigo_Enabled = 0 ;
      edtavCurs_descripcion_Enabled = 0 ;
      edtavCuentad_cedula_Enabled = 0 ;
      edtavCuentad_nombre_Enabled = 0 ;
      edtavAnt_nombreingreso_Enabled = 0 ;
      edtavAnt_numeroingreso_Enabled = 0 ;
      edtavAnt_fechaingreso_Enabled = 0 ;
      edtavCtlnro_linea_Enabled = 0 ;
      edtavCtlplaca_Enabled = 0 ;
      edtavCtlconsecutivo_Enabled = 0 ;
      edtavCtldescripcion_Enabled = 0 ;
      edtavCtlplacapadreactual_Enabled = 0 ;
      edtavCtlcantidadactual_Enabled = 0 ;
      edtavCtlconsecutivoactual_Enabled = 0 ;
      edtavCtlatributoactual_Enabled = 0 ;
      edtavCtlvaloractual_Enabled = 0 ;
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
   private short nRcdExists_12 ;
   private short nIsMod_12 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_241 ;
   private short nGXsfl_241_idx=1 ;
   private short A771TNov_Nro_Cambios ;
   private short AV11TNov_Nro_Cambios ;
   private short AV97Vida_Util_Actual ;
   private short AV94Variable_I ;
   private short AV95Variable_N ;
   private short A626Variable_I ;
   private short A627Variable_N ;
   private short A631Vida_Util_Actual ;
   private short wbEnd ;
   private short wbStart ;
   private short AV137GXV1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_241_fel_idx=1 ;
   private short nGXsfl_241_bak_idx=1 ;
   private short GXv_int4[] ;
   private short AV127WindowsId ;
   private int A104TNov_Codigo ;
   private int AV168GXV8 ;
   private int AV89TNov_Codigo ;
   private int imgImage6_Visible ;
   private int edtavTran_consecutivocc_Enabled ;
   private int edtavTran_consecutivocc_Visible ;
   private int divTable7_Visible ;
   private int edtavArchivo_Enabled ;
   private int imgImage5_Visible ;
   private int edtavPlaca_Visible ;
   private int edtavPlaca_Enabled ;
   private int edtavNove_observaciones_Enabled ;
   private int edtavNove_soporte_Enabled ;
   private int edtavNove_centrodescripcion_Visible ;
   private int edtavNove_centrodescripcion_Enabled ;
   private int edtavFecharegistro_Visible ;
   private int edtavFecharegistro_Enabled ;
   private int edtavNove_movimientodescrip_Visible ;
   private int edtavNove_movimientodescrip_Enabled ;
   private int edtavFechatran_Visible ;
   private int edtavFechatran_Enabled ;
   private int lblTextblock1_Visible ;
   private int edtavCata_descripcion_Visible ;
   private int edtavCata_descripcion_Enabled ;
   private int edtavNove_moduloorigen_Visible ;
   private int edtavNove_moduloorigen_Enabled ;
   private int edtavNove_almadescripcionorig_Visible ;
   private int edtavNove_almadescripcionorig_Enabled ;
   private int edtavNove_bodedescripcionorig_Visible ;
   private int edtavNove_bodedescripcionorig_Enabled ;
   private int edtavNove_cuentadantenomorigen_Visible ;
   private int edtavNove_cuentadantenomorigen_Enabled ;
   private int lblTextblock2_Visible ;
   private int edtavPlacapadre_Visible ;
   private int edtavPlacapadre_Enabled ;
   private int edtavNove_modulodestino_Visible ;
   private int edtavNove_modulodestino_Enabled ;
   private int edtavNove_almadescripciondesti_Visible ;
   private int edtavNove_almadescripciondesti_Enabled ;
   private int edtavNove_bodedescripciondesti_Visible ;
   private int edtavNove_bodedescripciondesti_Enabled ;
   private int edtavNove_cuentadantenomdestino_Visible ;
   private int edtavNove_cuentadantenomdestino_Enabled ;
   private int divTable4_Visible ;
   private int edtavDescripcion_antigua_Visible ;
   private int edtavDescripcion_antigua_Enabled ;
   private int imgImage4_Visible ;
   private int edtavCedula_proveedor_Enabled ;
   private int edtavCedula_proveedor_Visible ;
   private int edtavNombre_proveedor_Visible ;
   private int edtavNombre_proveedor_Enabled ;
   private int edtavNuevo_valor_Visible ;
   private int edtavNuevo_valor_Enabled ;
   private int imgImage1_Visible ;
   private int edtavArea_codigo_Visible ;
   private int edtavArea_codigo_Enabled ;
   private int edtavArea_descripcion_Visible ;
   private int edtavArea_descripcion_Enabled ;
   private int imgImage2_Visible ;
   private int edtavCurs_codigo_Visible ;
   private int edtavCurs_codigo_Enabled ;
   private int edtavCurs_descripcion_Visible ;
   private int edtavCurs_descripcion_Enabled ;
   private int imgImage3_Visible ;
   private int edtavCuentad_cedula_Enabled ;
   private int edtavCuentad_cedula_Visible ;
   private int edtavCuentad_nombre_Visible ;
   private int edtavCuentad_nombre_Enabled ;
   private int edtavValor_Enabled ;
   private int edtavValor_Visible ;
   private int divTable6_Visible ;
   private int edtavNuevaplaca_Enabled ;
   private int divTable8_Visible ;
   private int edtavAnt_nombreingreso_Enabled ;
   private int edtavAnt_numeroingreso_Enabled ;
   private int edtavNew_numeroingreso_Visible ;
   private int edtavNew_numeroingreso_Enabled ;
   private int edtavAnt_fechaingreso_Enabled ;
   private int edtavFecha_Visible ;
   private int edtavFecha_Enabled ;
   private int divTable5_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCtlnro_linea_Visible ;
   private int edtavCtlplaca_Visible ;
   private int edtavCtlconsecutivo_Visible ;
   private int edtavCtlplacapadreactual_Visible ;
   private int edtavCtlplacapadrenueva_Visible ;
   private int edtavCtlcantidadactual_Visible ;
   private int edtavCtlcantidadnueva_Visible ;
   private int edtavCtlconsecutivoactual_Visible ;
   private int edtavCtlconsecutivonuevo_Visible ;
   private int edtavCtlatributoactual_Visible ;
   private int edtavCtlatributonuevo_Visible ;
   private int edtavCtlvaloractual_Visible ;
   private int edtavCtlvalornuevo_Visible ;
   private int edtavCtlnro_linea_Enabled ;
   private int edtavCtlplaca_Enabled ;
   private int edtavCtlconsecutivo_Enabled ;
   private int edtavCtldescripcion_Enabled ;
   private int edtavCtlplacapadreactual_Enabled ;
   private int edtavCtlplacapadrenueva_Enabled ;
   private int edtavCtlcantidadactual_Enabled ;
   private int edtavCtlconsecutivoactual_Enabled ;
   private int edtavCtlatributoactual_Enabled ;
   private int edtavCtlvaloractual_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int subGrid1_Islastpage ;
   private int GXv_int3[] ;
   private int AV49Linea ;
   private int AV154GXV2 ;
   private int AV155GXV3 ;
   private int AV156GXV4 ;
   private int AV157GXV5 ;
   private int AV158GXV6 ;
   private int AV167GXV7 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavCtlcantidadnueva_Enabled ;
   private int edtavCtlconsecutivonuevo_Enabled ;
   private int edtavCtlatributonuevo_Enabled ;
   private int edtavCtlvalornuevo_Enabled ;
   private long AV91Usua_Id ;
   private long A46Tran_Id ;
   private long AV90Tran_Id ;
   private long A48Tran_CentroCostoId ;
   private long A702Tran_CedulaCuentadanteOrigen ;
   private long A703Tran_CedulaProveedor ;
   private long A704Tran_CedulaCuentadanteDestino ;
   private long A53Tran_IdProveedor ;
   private long A54Tran_TipoIngreso ;
   private long A52Tran_IdCuentadanteDestino ;
   private long A1Cent_Id ;
   private long AV6Cent_Id ;
   private long AV18Tran_CedulaProveedor ;
   private long AV23Tran_IdProveedor ;
   private long AV29Tran_TipoIngreso ;
   private long AV17Tran_CedulaCuentadanteDestino ;
   private long AV22Tran_IdCuentadanteDestino ;
   private long AV47Ide_Proveedor ;
   private long AV40Cuentad_Id ;
   private long AV102Tran_Entrada ;
   private long AV8Nove_Identificador ;
   private long AV82Regi_Id ;
   private long AV101Tran_ConsecutivoCC ;
   private long AV38Cedula_Proveedor ;
   private long AV39Cuentad_Cedula ;
   private long AV74Orig_Identificador ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nFirstRecordOnPage ;
   private long A51Tran_IdCuentadanteOrigen ;
   private long GXv_int2[] ;
   private long GXv_int10[] ;
   private long A105TNov_Rol_Id ;
   private long AV13TNov_Rol_Id ;
   private long A21Rol_Id ;
   private long A23Usua_Id ;
   private java.math.BigDecimal AV48Invd_ValorAdquisicion ;
   private java.math.BigDecimal AV75Otros_Costos_Dev ;
   private java.math.BigDecimal AV96Variable_VF ;
   private java.math.BigDecimal A465Invd_ValorAdquisicion ;
   private java.math.BigDecimal A628Otros_Costos_Dev ;
   private java.math.BigDecimal A625Variable_VF ;
   private java.math.BigDecimal AV93Valor ;
   private String edtavArchivo_Filename ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_241_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A514Tran_NumeroIngreso ;
   private String AV27Tran_NumeroIngreso ;
   private String AV123Errores ;
   private String AV62Nove_Estado ;
   private String GXCCtlgxBlob ;
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
   private String divTable2_Internalname ;
   private String TempTags ;
   private String sImgUrl ;
   private String imgImage6_Internalname ;
   private String imgImage6_Jsonclick ;
   private String edtavTran_consecutivocc_Internalname ;
   private String edtavTran_consecutivocc_Jsonclick ;
   private String divTable7_Internalname ;
   private String edtavArchivo_Internalname ;
   private String edtavArchivo_Filetype ;
   private String edtavArchivo_Contenttype ;
   private String edtavArchivo_Parameters ;
   private String edtavArchivo_Jsonclick ;
   private String bttGenerarexcel_Internalname ;
   private String bttGenerarexcel_Jsonclick ;
   private String imgImage5_Internalname ;
   private String imgImage5_Jsonclick ;
   private String edtavPlaca_Internalname ;
   private String edtavPlaca_Jsonclick ;
   private String edtavNove_observaciones_Internalname ;
   private String edtavNove_soporte_Internalname ;
   private String edtavNove_soporte_Filetype ;
   private String edtavNove_soporte_Contenttype ;
   private String edtavNove_soporte_Parameters ;
   private String edtavNove_soporte_Jsonclick ;
   private String bttCargararchivo_Internalname ;
   private String bttCargararchivo_Jsonclick ;
   private String divTable3_Internalname ;
   private String edtavNove_centrodescripcion_Internalname ;
   private String edtavNove_centrodescripcion_Jsonclick ;
   private String edtavFecharegistro_Internalname ;
   private String edtavFecharegistro_Jsonclick ;
   private String edtavNove_movimientodescrip_Internalname ;
   private String edtavNove_movimientodescrip_Jsonclick ;
   private String edtavFechatran_Internalname ;
   private String edtavFechatran_Jsonclick ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String edtavCata_descripcion_Internalname ;
   private String edtavNove_moduloorigen_Internalname ;
   private String edtavNove_moduloorigen_Jsonclick ;
   private String edtavNove_almadescripcionorig_Internalname ;
   private String edtavNove_almadescripcionorig_Jsonclick ;
   private String edtavNove_bodedescripcionorig_Internalname ;
   private String edtavNove_bodedescripcionorig_Jsonclick ;
   private String edtavNove_cuentadantenomorigen_Internalname ;
   private String edtavNove_cuentadantenomorigen_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtavPlacapadre_Internalname ;
   private String edtavPlacapadre_Jsonclick ;
   private String edtavNove_modulodestino_Internalname ;
   private String edtavNove_modulodestino_Jsonclick ;
   private String edtavNove_almadescripciondesti_Internalname ;
   private String edtavNove_almadescripciondesti_Jsonclick ;
   private String edtavNove_bodedescripciondesti_Internalname ;
   private String edtavNove_bodedescripciondesti_Jsonclick ;
   private String edtavNove_cuentadantenomdestino_Internalname ;
   private String edtavNove_cuentadantenomdestino_Jsonclick ;
   private String divTable4_Internalname ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtavDescripcion_antigua_Internalname ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String imgImage4_Internalname ;
   private String imgImage4_Jsonclick ;
   private String edtavCedula_proveedor_Internalname ;
   private String edtavCedula_proveedor_Jsonclick ;
   private String edtavNombre_proveedor_Internalname ;
   private String edtavNombre_proveedor_Jsonclick ;
   private String edtavNuevo_valor_Internalname ;
   private String imgImage1_Internalname ;
   private String imgImage1_Jsonclick ;
   private String edtavArea_codigo_Internalname ;
   private String edtavArea_codigo_Jsonclick ;
   private String edtavArea_descripcion_Internalname ;
   private String imgImage2_Internalname ;
   private String imgImage2_Jsonclick ;
   private String edtavCurs_codigo_Internalname ;
   private String edtavCurs_codigo_Jsonclick ;
   private String edtavCurs_descripcion_Internalname ;
   private String imgImage3_Internalname ;
   private String imgImage3_Jsonclick ;
   private String edtavCuentad_cedula_Internalname ;
   private String edtavCuentad_cedula_Jsonclick ;
   private String edtavCuentad_nombre_Internalname ;
   private String edtavCuentad_nombre_Jsonclick ;
   private String edtavValor_Internalname ;
   private String edtavValor_Jsonclick ;
   private String divTable6_Internalname ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String imgImage7_Internalname ;
   private String imgImage7_Jsonclick ;
   private String edtavNuevaplaca_Internalname ;
   private String edtavNuevaplaca_Jsonclick ;
   private String bttAgregarplaca_Internalname ;
   private String bttAgregarplaca_Jsonclick ;
   private String divTable8_Internalname ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtavAnt_nombreingreso_Internalname ;
   private String edtavAnt_nombreingreso_Jsonclick ;
   private String edtavAnt_numeroingreso_Internalname ;
   private String AV115Ant_NumeroIngreso ;
   private String edtavAnt_numeroingreso_Jsonclick ;
   private String edtavNew_numeroingreso_Internalname ;
   private String AV118New_NumeroIngreso ;
   private String edtavNew_numeroingreso_Jsonclick ;
   private String edtavAnt_fechaingreso_Internalname ;
   private String edtavAnt_fechaingreso_Jsonclick ;
   private String edtavFecha_Internalname ;
   private String edtavFecha_Jsonclick ;
   private String divTable5_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String lblUrl_Internalname ;
   private String lblUrl_Caption ;
   private String lblUrl_Jsonclick ;
   private String bttConfirmar_Internalname ;
   private String bttConfirmar_Jsonclick ;
   private String bttCancelar_Internalname ;
   private String bttCancelar_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String edtavCtlnro_linea_Internalname ;
   private String edtavCtlplaca_Internalname ;
   private String edtavCtlconsecutivo_Internalname ;
   private String edtavCtldescripcion_Internalname ;
   private String edtavCtlplacapadreactual_Internalname ;
   private String edtavCtlcantidadactual_Internalname ;
   private String edtavCtlconsecutivoactual_Internalname ;
   private String edtavCtlatributoactual_Internalname ;
   private String edtavCtlvaloractual_Internalname ;
   private String sGXsfl_241_fel_idx="0001" ;
   private String edtavCtlcantidadnueva_Internalname ;
   private String edtavCtlconsecutivonuevo_Internalname ;
   private String edtavCtlplacapadrenueva_Internalname ;
   private String edtavCtlvalornuevo_Internalname ;
   private String edtavCtlatributonuevo_Internalname ;
   private String Alertify1_Internalname ;
   private String GXv_char5[] ;
   private String A773TNov_Estado ;
   private String AV83Rol ;
   private String AV109Existe ;
   private String GXv_char11[] ;
   private String GXv_char7[] ;
   private String ROClassString ;
   private String edtavCtlnro_linea_Jsonclick ;
   private String edtavCtlplaca_Jsonclick ;
   private String edtavCtlconsecutivo_Jsonclick ;
   private String edtavCtldescripcion_Jsonclick ;
   private String edtavCtlplacapadreactual_Jsonclick ;
   private String edtavCtlplacapadrenueva_Jsonclick ;
   private String edtavCtlcantidadactual_Jsonclick ;
   private String edtavCtlcantidadnueva_Jsonclick ;
   private String edtavCtlconsecutivoactual_Jsonclick ;
   private String edtavCtlconsecutivonuevo_Jsonclick ;
   private String edtavCtlatributoactual_Jsonclick ;
   private String edtavCtlatributonuevo_Jsonclick ;
   private String edtavCtlvaloractual_Jsonclick ;
   private String edtavCtlvalornuevo_Jsonclick ;
   private String Fileupload1_Internalname ;
   private java.util.Date A390Tran_FechaRatificacion ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date AV122FechaRegistro ;
   private java.util.Date AV119FechaTran ;
   private java.util.Date A515Tran_FechaIngreso ;
   private java.util.Date AV21Tran_FechaIngreso ;
   private java.util.Date AV116Ant_FechaIngreso ;
   private java.util.Date AV46Fecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_241_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n771TNov_Nro_Cambios ;
   private boolean n813TNov_IngresoMasivo ;
   private boolean n774TNov_Nombre_Campo ;
   private boolean n772TNov_Procedimiento ;
   private boolean n770TNov_Tipo ;
   private boolean n839TNov_ObligaSoporte ;
   private boolean gx_BV241 ;
   private boolean n416Tran_Observaciones ;
   private boolean n51Tran_IdCuentadanteOrigen ;
   private boolean n420Tran_CentroCostoDescripcion ;
   private boolean n419Tran_CentroCostoCodigo ;
   private boolean n381Tran_DescripcionMovimiento ;
   private boolean n390Tran_FechaRatificacion ;
   private boolean n702Tran_CedulaCuentadanteOrigen ;
   private boolean n575Tran_NombreProveedor ;
   private boolean n703Tran_CedulaProveedor ;
   private boolean n384Tran_NombCuentadanteOrigen ;
   private boolean n389Tran_NombCuentadanteDestino ;
   private boolean n704Tran_CedulaCuentadanteDestino ;
   private boolean n53Tran_IdProveedor ;
   private boolean n54Tran_TipoIngreso ;
   private boolean n672Tran_NombreIngreso ;
   private boolean n514Tran_NumeroIngreso ;
   private boolean n515Tran_FechaIngreso ;
   private boolean n407Tran_AreadanteCodigo ;
   private boolean n408Tran_CursoCodigo ;
   private boolean n52Tran_IdCuentadanteDestino ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n465Invd_ValorAdquisicion ;
   private boolean n628Otros_Costos_Dev ;
   private boolean n625Variable_VF ;
   private boolean n626Variable_I ;
   private boolean n627Variable_N ;
   private boolean n631Vida_Util_Actual ;
   private boolean n773TNov_Estado ;
   private boolean n769TNov_Descripcion ;
   private String AV80Placas ;
   private String A416Tran_Observaciones ;
   private String AV28Tran_Observaciones ;
   private String AV63Nove_Masivo ;
   private String AV67Nove_Observaciones ;
   private String AV110Archivo ;
   private String AV69Nove_Soporte ;
   private String A813TNov_IngresoMasivo ;
   private String A774TNov_Nombre_Campo ;
   private String A772TNov_Procedimiento ;
   private String A770TNov_Tipo ;
   private String A839TNov_ObligaSoporte ;
   private String AV70Nove_ValorAntiguo ;
   private String AV71Nove_ValorNuevo ;
   private String AV14TNov_Tipo ;
   private String AV10TNov_Nombre_Campo ;
   private String A419Tran_CentroCostoCodigo ;
   private String A420Tran_CentroCostoDescripcion ;
   private String A49Tran_CodigoMovimiento ;
   private String A381Tran_DescripcionMovimiento ;
   private String A110Tran_ModuloOrigen ;
   private String A109Tran_CodAlmaOrigen ;
   private String AV31Alma_Descripcion ;
   private String A112Tran_CodBodeOrigen ;
   private String AV36Bode_Descripcion ;
   private String A575Tran_NombreProveedor ;
   private String A384Tran_NombCuentadanteOrigen ;
   private String A385Tran_ModuloDestino ;
   private String A111Tran_CodAlmaDestino ;
   private String A387Tran_CodBodeDestino ;
   private String A389Tran_NombCuentadanteDestino ;
   private String A672Tran_NombreIngreso ;
   private String A407Tran_AreadanteCodigo ;
   private String A408Tran_CursoCodigo ;
   private String A27Alma_Modulo ;
   private String AV32Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String AV30Alma_Codigo ;
   private String A252Alma_Descripcion ;
   private String A31Bode_Codigo ;
   private String AV35Bode_Codigo ;
   private String A251Bode_Descripcion ;
   private String AV77Permitido ;
   private String AV12TNov_Procedimiento ;
   private String AV26Tran_NombreProveedor ;
   private String AV104Tran_NombreIngreso ;
   private String AV16Tran_AreadanteDescripcion ;
   private String AV15Tran_AreadanteCodigo ;
   private String AV20Tran_CursoDescripcion ;
   private String AV19Tran_CursoCodigo ;
   private String AV24Tran_NombCuentadanteDestino ;
   private String A59Area_Codigo ;
   private String A452Area_Descripcion ;
   private String A73Curs_Codigo ;
   private String A424Curs_Descripcion ;
   private String AV112TNov_ObligaSoporte ;
   private String AV7Elem_Consecutivo ;
   private String AV68Nove_RespuestaProc ;
   private String AV5Cent_Codigo ;
   private String A67Invd_NumeroPlaca ;
   private String A68Invd_PlacaPadre ;
   private String A298Cata_Descripcion ;
   private String A66Elem_Consecutivo ;
   private String AV107NuevaDescripcion ;
   private String AV106NuevoConsecutivo ;
   private String AV78Placa ;
   private String AV59Nove_CentroDescripcion ;
   private String AV66Nove_MovimientoDescrip ;
   private String AV37Cata_Descripcion ;
   private String AV65Nove_ModuloOrigen ;
   private String AV54Nove_AlmaDescripcionOrig ;
   private String AV56Nove_BodeDescripcionOrig ;
   private String AV61Nove_CuentadanteNomOrigen ;
   private String AV79PlacaPadre ;
   private String AV64Nove_ModuloDestino ;
   private String AV53Nove_AlmaDescripcionDesti ;
   private String AV55Nove_BodeDescripcionDesti ;
   private String AV60Nove_CuentadanteNomDestino ;
   private String AV44Descripcion_Antigua ;
   private String AV52Nombre_Proveedor ;
   private String AV72Nuevo_Valor ;
   private String AV33Area_Codigo ;
   private String AV34Area_Descripcion ;
   private String AV42Curs_Codigo ;
   private String AV43Curs_Descripcion ;
   private String AV41Cuentad_Nombre ;
   private String AV105NuevaPlaca ;
   private String AV117Ant_NombreIngreso ;
   private String AV92Usuario ;
   private String AV9TNov_IngresoMasivo ;
   private String AV81Programa ;
   private String AV111NombreArchivo ;
   private String AV128url ;
   private String A37Cata_Codigo ;
   private String AV76P_ID ;
   private String P_id_svchar18_0 ;
   private String Nove_estado_svchar1_0 ;
   private String A769TNov_Descripcion ;
   private String AV114Filename ;
   private String AV113ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV98Websession ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem> gxcolvREGI_ID ;
   private HTMLChoice cmbavTnov_codigo ;
   private HTMLChoice dynavRegi_id ;
   private HTMLChoice cmbavNove_masivo ;
   private HTMLChoice dynavOrig_identificador ;
   private IDataStoreProvider pr_default ;
   private long[] H007Y2_A41Orig_Identificador ;
   private String[] H007Y2_A635Orig_Descripcion ;
   private boolean[] H007Y2_n635Orig_Descripcion ;
   private int[] H007Y3_A104TNov_Codigo ;
   private short[] H007Y3_A771TNov_Nro_Cambios ;
   private boolean[] H007Y3_n771TNov_Nro_Cambios ;
   private String[] H007Y3_A813TNov_IngresoMasivo ;
   private boolean[] H007Y3_n813TNov_IngresoMasivo ;
   private String[] H007Y3_A774TNov_Nombre_Campo ;
   private boolean[] H007Y3_n774TNov_Nombre_Campo ;
   private String[] H007Y3_A772TNov_Procedimiento ;
   private boolean[] H007Y3_n772TNov_Procedimiento ;
   private String[] H007Y3_A770TNov_Tipo ;
   private boolean[] H007Y3_n770TNov_Tipo ;
   private String[] H007Y3_A839TNov_ObligaSoporte ;
   private boolean[] H007Y3_n839TNov_ObligaSoporte ;
   private String[] H007Y4_A416Tran_Observaciones ;
   private boolean[] H007Y4_n416Tran_Observaciones ;
   private long[] H007Y4_A51Tran_IdCuentadanteOrigen ;
   private boolean[] H007Y4_n51Tran_IdCuentadanteOrigen ;
   private long[] H007Y4_A46Tran_Id ;
   private String[] H007Y4_A420Tran_CentroCostoDescripcion ;
   private boolean[] H007Y4_n420Tran_CentroCostoDescripcion ;
   private String[] H007Y4_A419Tran_CentroCostoCodigo ;
   private boolean[] H007Y4_n419Tran_CentroCostoCodigo ;
   private long[] H007Y4_A48Tran_CentroCostoId ;
   private String[] H007Y4_A381Tran_DescripcionMovimiento ;
   private boolean[] H007Y4_n381Tran_DescripcionMovimiento ;
   private String[] H007Y4_A49Tran_CodigoMovimiento ;
   private String[] H007Y4_A110Tran_ModuloOrigen ;
   private String[] H007Y4_A109Tran_CodAlmaOrigen ;
   private java.util.Date[] H007Y4_A390Tran_FechaRatificacion ;
   private boolean[] H007Y4_n390Tran_FechaRatificacion ;
   private java.util.Date[] H007Y4_A55Tran_FechaRegistro ;
   private String[] H007Y4_A112Tran_CodBodeOrigen ;
   private long[] H007Y4_A702Tran_CedulaCuentadanteOrigen ;
   private boolean[] H007Y4_n702Tran_CedulaCuentadanteOrigen ;
   private String[] H007Y4_A575Tran_NombreProveedor ;
   private boolean[] H007Y4_n575Tran_NombreProveedor ;
   private long[] H007Y4_A703Tran_CedulaProveedor ;
   private boolean[] H007Y4_n703Tran_CedulaProveedor ;
   private String[] H007Y4_A384Tran_NombCuentadanteOrigen ;
   private boolean[] H007Y4_n384Tran_NombCuentadanteOrigen ;
   private String[] H007Y4_A385Tran_ModuloDestino ;
   private String[] H007Y4_A111Tran_CodAlmaDestino ;
   private String[] H007Y4_A387Tran_CodBodeDestino ;
   private String[] H007Y4_A389Tran_NombCuentadanteDestino ;
   private boolean[] H007Y4_n389Tran_NombCuentadanteDestino ;
   private long[] H007Y4_A704Tran_CedulaCuentadanteDestino ;
   private boolean[] H007Y4_n704Tran_CedulaCuentadanteDestino ;
   private long[] H007Y4_A53Tran_IdProveedor ;
   private boolean[] H007Y4_n53Tran_IdProveedor ;
   private long[] H007Y4_A54Tran_TipoIngreso ;
   private boolean[] H007Y4_n54Tran_TipoIngreso ;
   private String[] H007Y4_A672Tran_NombreIngreso ;
   private boolean[] H007Y4_n672Tran_NombreIngreso ;
   private String[] H007Y4_A514Tran_NumeroIngreso ;
   private boolean[] H007Y4_n514Tran_NumeroIngreso ;
   private java.util.Date[] H007Y4_A515Tran_FechaIngreso ;
   private boolean[] H007Y4_n515Tran_FechaIngreso ;
   private String[] H007Y4_A407Tran_AreadanteCodigo ;
   private boolean[] H007Y4_n407Tran_AreadanteCodigo ;
   private String[] H007Y4_A408Tran_CursoCodigo ;
   private boolean[] H007Y4_n408Tran_CursoCodigo ;
   private long[] H007Y4_A52Tran_IdCuentadanteDestino ;
   private boolean[] H007Y4_n52Tran_IdCuentadanteDestino ;
   private String[] H007Y5_A66Elem_Consecutivo ;
   private String[] H007Y5_A37Cata_Codigo ;
   private String[] H007Y5_A67Invd_NumeroPlaca ;
   private String[] H007Y5_A68Invd_PlacaPadre ;
   private boolean[] H007Y5_n68Invd_PlacaPadre ;
   private String[] H007Y5_A298Cata_Descripcion ;
   private java.math.BigDecimal[] H007Y5_A465Invd_ValorAdquisicion ;
   private boolean[] H007Y5_n465Invd_ValorAdquisicion ;
   private java.math.BigDecimal[] H007Y5_A628Otros_Costos_Dev ;
   private boolean[] H007Y5_n628Otros_Costos_Dev ;
   private java.math.BigDecimal[] H007Y5_A625Variable_VF ;
   private boolean[] H007Y5_n625Variable_VF ;
   private short[] H007Y5_A626Variable_I ;
   private boolean[] H007Y5_n626Variable_I ;
   private short[] H007Y5_A627Variable_N ;
   private boolean[] H007Y5_n627Variable_N ;
   private short[] H007Y5_A631Vida_Util_Actual ;
   private boolean[] H007Y5_n631Vida_Util_Actual ;
   private String[] H007Y6_AP_id_svchar18_0 ;
   private String[] H007Y6_ANove_estado_svchar1_0 ;
   private String[] H007Y6_AV68Nove_RespuestaProc ;
   private String[] H007Y7_AP_id_svchar18_0 ;
   private String[] H007Y7_ANove_estado_svchar1_0 ;
   private String[] H007Y7_AV68Nove_RespuestaProc ;
   private String[] H007Y8_AP_id_svchar18_0 ;
   private String[] H007Y8_ANove_estado_svchar1_0 ;
   private String[] H007Y8_AV68Nove_RespuestaProc ;
   private String[] H007Y9_AP_id_svchar18_0 ;
   private String[] H007Y9_ANove_estado_svchar1_0 ;
   private String[] H007Y9_AV68Nove_RespuestaProc ;
   private String[] H007Y10_AP_id_svchar18_0 ;
   private String[] H007Y10_ANove_estado_svchar1_0 ;
   private String[] H007Y10_AV68Nove_RespuestaProc ;
   private String[] H007Y11_AP_id_svchar18_0 ;
   private String[] H007Y11_ANove_estado_svchar1_0 ;
   private String[] H007Y11_AV68Nove_RespuestaProc ;
   private String[] H007Y12_AP_id_svchar18_0 ;
   private String[] H007Y12_ANove_estado_svchar1_0 ;
   private String[] H007Y12_AV68Nove_RespuestaProc ;
   private String[] H007Y13_AP_id_svchar18_0 ;
   private String[] H007Y13_ANove_estado_svchar1_0 ;
   private String[] H007Y13_AV68Nove_RespuestaProc ;
   private String[] H007Y14_AP_id_svchar18_0 ;
   private String[] H007Y14_ANove_estado_svchar1_0 ;
   private String[] H007Y14_AV68Nove_RespuestaProc ;
   private String[] H007Y15_AP_id_svchar18_0 ;
   private String[] H007Y15_ANove_estado_svchar1_0 ;
   private String[] H007Y15_AV68Nove_RespuestaProc ;
   private String[] H007Y16_AP_id_svchar18_0 ;
   private String[] H007Y16_ANove_estado_svchar1_0 ;
   private String[] H007Y16_AV68Nove_RespuestaProc ;
   private String[] H007Y17_AP_id_svchar18_0 ;
   private String[] H007Y17_ANove_estado_svchar1_0 ;
   private String[] H007Y17_AV68Nove_RespuestaProc ;
   private String[] H007Y18_AP_id_svchar18_0 ;
   private String[] H007Y18_ANove_estado_svchar1_0 ;
   private String[] H007Y18_AV68Nove_RespuestaProc ;
   private String[] H007Y19_AP_id_svchar18_0 ;
   private String[] H007Y19_ANove_estado_svchar1_0 ;
   private String[] H007Y19_AV68Nove_RespuestaProc ;
   private String[] H007Y20_AP_id_svchar18_0 ;
   private String[] H007Y20_ANove_estado_svchar1_0 ;
   private String[] H007Y20_AV68Nove_RespuestaProc ;
   private String[] H007Y21_AP_id_svchar18_0 ;
   private String[] H007Y21_ANove_estado_svchar1_0 ;
   private String[] H007Y21_AV68Nove_RespuestaProc ;
   private String[] H007Y22_A59Area_Codigo ;
   private String[] H007Y22_A452Area_Descripcion ;
   private String[] H007Y23_A28Alma_Codigo ;
   private String[] H007Y23_A27Alma_Modulo ;
   private long[] H007Y23_A1Cent_Id ;
   private String[] H007Y23_A252Alma_Descripcion ;
   private String[] H007Y24_A31Bode_Codigo ;
   private String[] H007Y24_A28Alma_Codigo ;
   private String[] H007Y24_A27Alma_Modulo ;
   private long[] H007Y24_A1Cent_Id ;
   private String[] H007Y24_A251Bode_Descripcion ;
   private String[] H007Y25_A773TNov_Estado ;
   private boolean[] H007Y25_n773TNov_Estado ;
   private long[] H007Y25_A105TNov_Rol_Id ;
   private String[] H007Y25_A769TNov_Descripcion ;
   private boolean[] H007Y25_n769TNov_Descripcion ;
   private int[] H007Y25_A104TNov_Codigo ;
   private long[] H007Y26_A21Rol_Id ;
   private long[] H007Y26_A23Usua_Id ;
   private String[] H007Y27_A73Curs_Codigo ;
   private String[] H007Y27_A424Curs_Descripcion ;
   private String[] H007Y28_A37Cata_Codigo ;
   private String[] H007Y28_A67Invd_NumeroPlaca ;
   private String[] H007Y28_A66Elem_Consecutivo ;
   private String[] H007Y28_A298Cata_Descripcion ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtFileUploadData_FileUploadDataItem> AV132FileUploadData ;
   private GXBaseCollection<com.orions2.SdtSDTDetalle_SDTDetalleItem> AV99SDTDetalle ;
   private GXBaseCollection<com.orions2.SdtSDTDetalle_SDTDetalleItem> GXt_objcol_SdtSDTDetalle_SDTDetalleItem6 ;
   private GXBaseCollection<com.orions2.SdtSDTDetalle_SDTDetalleItem> GXv_objcol_SdtSDTDetalle_SDTDetalleItem8[] ;
   private GXBaseCollection<com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem> AV124SDTErrorMasivo ;
   private GXBaseCollection<com.orions2.SdtSDTErrorMasivo_SDTErrorMasivoItem> GXv_objcol_SdtSDTErrorMasivo_SDTErrorMasivoItem12[] ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem> AV85SDTNovedadesDetalle ;
   private GXBaseCollection<com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem> GXv_objcol_SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem9[] ;
   private GXBaseCollection<com.orions2.SdtSDTRegionalTrn_SDTRegionalTrnItem> GXv_objcol_SdtSDTRegionalTrn_SDTRegionalTrnItem1[] ;
   private com.orions2.SdtFileUploadData_FileUploadDataItem AV134FileUploadDataColl ;
   private com.orions2.SdtSDTDetalle_SDTDetalleItem AV100SDTDetalleItem ;
   private com.orions2.SdtSDTNovedades AV84SDTNovedades ;
   private com.orions2.SdtSDTNovedades GXv_SdtSDTNovedades13[] ;
   private com.orions2.SdtSDTNovedadesDetalle_SDTNovedadesDetalleItem AV86SDTNovedadesDetalleItem ;
}

final  class wp_novedades__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H007Y2", "SELECT Orig_Identificador, Orig_Descripcion FROM ALM_ORIGEN_BIENES WHERE Orig_Descripcion <> 'REPOSICIÓN' ORDER BY Orig_Descripcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0,0,false )
         ,new ForEachCursor("H007Y3", "SELECT TNov_Codigo, TNov_Nro_Cambios, TNov_IngresoMasivo, TNov_Nombre_Campo, TNov_Procedimiento, TNov_Tipo, TNov_ObligaSoporte FROM ALM_TIPO_NOVEDAD WHERE TNov_Codigo = ? ORDER BY TNov_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007Y4", "SELECT T1.Tran_Observaciones, T1.Tran_IdCuentadanteOrigen AS Tran_IdCuentadanteOrigen, T1.Tran_Id, T3.Cent_Descripcion AS Tran_CentroCostoDescripcion, T3.Cent_Codigo AS Tran_CentroCostoCodigo, T1.Tran_CentroCostoId AS Tran_CentroCostoId, T4.Tpmo_Descripcion AS Tran_DescripcionMovimiento, T1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T1.Tran_ModuloOrigen, T1.Tran_CodAlmaOrigen, T1.Tran_FechaRatificacion, T1.Tran_FechaRegistro, T1.Tran_CodBodeOrigen, T2.Cuen_Cedula AS Tran_CedulaCuentadanteOrigen, T5.Cuen_Nombre AS Tran_NombreProveedor, T5.Cuen_Cedula AS Tran_CedulaProveedor, T2.Cuen_Nombre AS Tran_NombCuentadanteOrigen, T1.Tran_ModuloDestino, T1.Tran_CodAlmaDestino, T1.Tran_CodBodeDestino, T7.Cuen_Nombre AS Tran_NombCuentadanteDestino, T7.Cuen_Cedula AS Tran_CedulaCuentadanteDestino, T1.Tran_IdProveedor AS Tran_IdProveedor, T1.Tran_TipoIngreso AS Tran_TipoIngreso, T6.Orig_Descripcion AS Tran_NombreIngreso, T1.Tran_NumeroIngreso, T1.Tran_FechaIngreso, T1.Tran_AreadanteCodigo, T1.Tran_CursoCodigo, T1.Tran_IdCuentadanteDestino AS Tran_IdCuentadanteDestino FROM ((((((ALM_TRANSACCION T1 LEFT JOIN ALM_CUENTADANTE T2 ON T2.Cuen_Identificacion = T1.Tran_IdCuentadanteOrigen) INNER JOIN GEN_CENTROCOSTO T3 ON T3.Cent_Id = T1.Tran_CentroCostoId) INNER JOIN ALM_TIPO_MOVIMIENTO T4 ON T4.Tpmo_Codigo = T1.Tran_CodigoMovimiento) LEFT JOIN ALM_CUENTADANTE T5 ON T5.Cuen_Identificacion = T1.Tran_IdProveedor) LEFT JOIN ALM_ORIGEN_BIENES T6 ON T6.Orig_Identificador = T1.Tran_TipoIngreso) LEFT JOIN ALM_CUENTADANTE T7 ON T7.Cuen_Identificacion = T1.Tran_IdCuentadanteDestino) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007Y5", "SELECT T1.Elem_Consecutivo, T2.Cata_Codigo, T1.Invd_NumeroPlaca, T1.Invd_PlacaPadre, T3.Cata_Descripcion, T1.Invd_ValorAdquisicion, T1.Otros_Costos_Dev, T1.Variable_VF, T1.Variable_I, T1.Variable_N, T1.Vida_Util_Actual FROM ((ALM_INVENTARIO_DEVOLUTIVO T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) WHERE T1.Invd_NumeroPlaca = ? ORDER BY T1.Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new CallCursor("H007Y6", "{CALL PRC_PROVEE ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y7", "{CALL PRC_ORIGE_TIPO ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y8", "{CALL PRC_OBSER ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y9", "{CALL PRC_ANULA ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y10", "{CALL PRC_AREAD ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y11", "{CALL PRC_CURSO ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y12", "{CALL PRC_CUENTADANTE ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y13", "{CALL PRC_ATRIBUTOS ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y14", "{CALL PRC_ORIGEN_VALOR ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y15", "{CALL PRC_OTR_COST ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y16", "{CALL PRC_VLR_FUTURO ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y17", "{CALL PRC_VIDA_UTIL ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y18", "{CALL PRC_PAD_HIJ ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y19", "{CALL PRC_REORDE ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y20", "{CALL PRC_CTD_CON ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new CallCursor("H007Y21", "{CALL PRC_CTD_DEV ( ?, ?, ?)}", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new ForEachCursor("H007Y22", "SELECT Area_Codigo, Area_Descripcion FROM ALM_AREADANTE WHERE Area_Codigo = ? ORDER BY Area_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007Y23", "SELECT Alma_Codigo, Alma_Modulo, Cent_Id, Alma_Descripcion FROM ALM_ALMACEN WHERE Cent_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? ORDER BY Cent_Id, Alma_Modulo, Alma_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007Y24", "SELECT T1.Bode_Codigo, T1.Alma_Codigo, T1.Alma_Modulo, T1.Cent_Id, T2.Bode_Descripcion FROM (ALM_ALMACEN_BODEGAS T1 INNER JOIN ALM_BODEGA T2 ON T2.Bode_Codigo = T1.Bode_Codigo) WHERE T1.Cent_Id = ? and T1.Alma_Modulo = ? and T1.Alma_Codigo = ? and T1.Bode_Codigo = ? ORDER BY T1.Cent_Id, T1.Alma_Modulo, T1.Alma_Codigo, T1.Bode_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007Y25", "SELECT T2.TNov_Estado, T1.TNov_Rol_Id, T2.TNov_Descripcion, T1.TNov_Codigo FROM (ALM_TIPO_NOVEDADROLES T1 INNER JOIN ALM_TIPO_NOVEDAD T2 ON T2.TNov_Codigo = T1.TNov_Codigo) WHERE T2.TNov_Estado = 'A' ORDER BY T1.TNov_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H007Y26", "SELECT Rol_Id, Usua_Id FROM SEG_USUARIO_ROL WHERE Usua_Id = ? and Rol_Id = ? ORDER BY Usua_Id, Rol_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007Y27", "SELECT Curs_Codigo, Curs_Descripcion FROM ALM_CURSOS WHERE Curs_Codigo = ? ORDER BY Curs_Codigo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H007Y28", "SELECT T2.Cata_Codigo, T1.Invd_NumeroPlaca, T1.Elem_Consecutivo, T3.Cata_Descripcion FROM ((ALM_INVENTARIO_DEVOLUTIVO T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) WHERE T1.Invd_NumeroPlaca = ? ORDER BY T1.Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(3) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(12) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((long[]) buf[19])[0] = rslt.getLong(14) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((long[]) buf[23])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(18) ;
               ((String[]) buf[28])[0] = rslt.getVarchar(19) ;
               ((String[]) buf[29])[0] = rslt.getVarchar(20) ;
               ((String[]) buf[30])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((long[]) buf[32])[0] = rslt.getLong(22) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((long[]) buf[34])[0] = rslt.getLong(23) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((long[]) buf[36])[0] = rslt.getLong(24) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(26, 30) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(27) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((long[]) buf[48])[0] = rslt.getLong(30) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4) ;
               return;
            case 24 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
            case 4 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 5 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 6 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 7 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 8 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 9 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 10 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 11 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 12 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 13 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 14 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 15 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 16 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 17 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 18 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 19 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               stmt.setVarchar(1, (String)parms[0], 18);
               stmt.setVarchar(2, (String)parms[1], 1);
               stmt.setVarchar(3, (String)parms[2], 200);
               return;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 21 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               return;
            case 22 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 2);
               stmt.setVarchar(4, (String)parms[3], 3);
               return;
            case 24 :
               stmt.setBigDecimal(1, ((Number) parms[0]).longValue(), 0);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 41);
               return;
            case 26 :
               stmt.setVarchar(1, (String)parms[0], 30);
               return;
      }
   }

}

