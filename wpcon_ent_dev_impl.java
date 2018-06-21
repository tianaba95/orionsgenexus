/*
               File: wpcon_ent_dev_impl
        Description: Entrada elementos devolutivo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:18:43.6
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

public final  class wpcon_ent_dev_impl extends GXDataArea
{
   public wpcon_ent_dev_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpcon_ent_dev_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpcon_ent_dev_impl.class ));
   }

   public wpcon_ent_dev_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTipoentrada = new HTMLChoice();
      cmbavCat_bien = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_104 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_104_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_104_idx = httpContext.GetNextPar( ) ;
            AV31Eliminar = httpContext.GetNextPar( ) ;
            AV11Atributos = httpContext.GetNextPar( ) ;
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
            subGrid1_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV31Eliminar = httpContext.GetNextPar( ) ;
            AV11Atributos = httpContext.GetNextPar( ) ;
            AV42OPC = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV95Tran_TipoEntra = httpContext.GetNextPar( ) ;
            AV57SWDeTr = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV94Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            A48Tran_CentroCostoId = GXutil.lval( httpContext.GetNextPar( )) ;
            A527Tran_TipoEntra = httpContext.GetNextPar( ) ;
            n527Tran_TipoEntra = false ;
            A499Tran_CodTipoElemento = GXutil.lval( httpContext.GetNextPar( )) ;
            n499Tran_CodTipoElemento = false ;
            A483Tran_ValorTransaccion = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n483Tran_ValorTransaccion = false ;
            A49Tran_CodigoMovimiento = httpContext.GetNextPar( ) ;
            A513Tran_ConsecutivoCC = GXutil.lval( httpContext.GetNextPar( )) ;
            n513Tran_ConsecutivoCC = false ;
            A55Tran_FechaRegistro = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
            A56Tran_IdCuentadanteResponsabili = GXutil.lval( httpContext.GetNextPar( )) ;
            n56Tran_IdCuentadanteResponsabili = false ;
            A719Tran_TransaccResponsabilidad = GXutil.lval( httpContext.GetNextPar( )) ;
            n719Tran_TransaccResponsabilidad = false ;
            A720Tran_FechaResponsabilidad = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            n720Tran_FechaResponsabilidad = false ;
            A758Tran_TablaResponsabilidad = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            n758Tran_TablaResponsabilidad = false ;
            A69TDet_Consecutivo = GXutil.lval( httpContext.GetNextPar( )) ;
            AV87TipoEntrada = httpContext.GetNextPar( ) ;
            A525TDet_Atributos = httpContext.GetNextPar( ) ;
            A487TDet_Cantidad = GXutil.lval( httpContext.GetNextPar( )) ;
            A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
            A489TDet_ValorTotal = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A488TDet_ValorUnitario = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A490TDet_PlacaNumero = httpContext.GetNextPar( ) ;
            n490TDet_PlacaNumero = false ;
            A491TDet_PlacaPadre = httpContext.GetNextPar( ) ;
            n491TDet_PlacaPadre = false ;
            A505TDet_EsPadre = httpContext.GetNextPar( ) ;
            A298Cata_Descripcion = httpContext.GetNextPar( ) ;
            A653TDet_Valor_Presente = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n653TDet_Valor_Presente = false ;
            A657TDet_Otros_Costos = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n657TDet_Otros_Costos = false ;
            A658TDet_Agrupado = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            n658TDet_Agrupado = false ;
            A817TDet_PlacaRecuperada = httpContext.GetNextPar( ) ;
            n817TDet_PlacaRecuperada = false ;
            AV71SWRatificar = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV31Eliminar, AV11Atributos, AV42OPC, AV95Tran_TipoEntra, AV57SWDeTr, A46Tran_Id, AV94Tran_Id, A48Tran_CentroCostoId, A527Tran_TipoEntra, A499Tran_CodTipoElemento, A483Tran_ValorTransaccion, A49Tran_CodigoMovimiento, A513Tran_ConsecutivoCC, A55Tran_FechaRegistro, A56Tran_IdCuentadanteResponsabili, A719Tran_TransaccResponsabilidad, A720Tran_FechaResponsabilidad, A758Tran_TablaResponsabilidad, A69TDet_Consecutivo, AV87TipoEntrada, A525TDet_Atributos, A487TDet_Cantidad, A66Elem_Consecutivo, A489TDet_ValorTotal, A488TDet_ValorUnitario, A490TDet_PlacaNumero, A491TDet_PlacaPadre, A505TDet_EsPadre, A298Cata_Descripcion, A653TDet_Valor_Presente, A657TDet_Otros_Costos, A658TDet_Agrupado, A817TDet_PlacaRecuperada, AV71SWRatificar) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "WPCON_ENT_DEV" ;
            forbiddenHiddens = forbiddenHiddens + localUtil.format( AV96Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99") ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
            GXutil.writeLogln("wpcon_ent_dev:[SendSecurityCheck]"+forbiddenHiddens);
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV94Tran_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94Tran_Id", GXutil.ltrim( GXutil.str( AV94Tran_Id, 11, 0)));
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
      pa1V2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1V2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414184354");
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
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wpcon_ent_dev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV94Tran_Id,11,0)))+"\">") ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" style=\"display:none\">") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_104", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_104, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vOPC", GXutil.ltrim( localUtil.ntoc( AV42OPC, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_TIPOENTRA", GXutil.rtrim( AV95Tran_TipoEntra));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWDETR", GXutil.ltrim( localUtil.ntoc( AV57SWDeTr, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV94Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( A48Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_TIPOENTRA", GXutil.rtrim( A527Tran_TipoEntra));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODTIPOELEMENTO", GXutil.ltrim( localUtil.ntoc( A499Tran_CodTipoElemento, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_VALORTRANSACCION", GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODIGOMOVIMIENTO", A49Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CONSECUTIVOCC", GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_FECHAREGISTRO", localUtil.ttoc( A55Tran_FechaRegistro, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_IDCUENTADANTERESPONSABILI", GXutil.ltrim( localUtil.ntoc( A56Tran_IdCuentadanteResponsabili, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_TRANSACCRESPONSABILIDAD", GXutil.ltrim( localUtil.ntoc( A719Tran_TransaccResponsabilidad, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_FECHARESPONSABILIDAD", localUtil.dtoc( A720Tran_FechaResponsabilidad, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_TABLARESPONSABILIDAD", GXutil.ltrim( localUtil.ntoc( A758Tran_TablaResponsabilidad, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_ATRIBUTOS", A525TDet_Atributos);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CANTIDAD", GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORTOTAL", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORUNITARIO", GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACANUMERO", A490TDet_PlacaNumero);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACAPADRE", A491TDet_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_ESPADRE", A505TDet_EsPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCION", A298Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALOR_PRESENTE", GXutil.ltrim( localUtil.ntoc( A653TDet_Valor_Presente, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_OTROS_COSTOS", GXutil.ltrim( localUtil.ntoc( A657TDet_Otros_Costos, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_AGRUPADO", GXutil.ltrim( localUtil.ntoc( A658TDet_Agrupado, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACARECUPERADA", A817TDet_PlacaRecuperada);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWRATIFICAR", GXutil.ltrim( localUtil.ntoc( AV71SWRatificar, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERROR", GXutil.ltrim( localUtil.ntoc( AV62SWError, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vPRESPUESTA", AV47pRespuesta);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTIP_CODIGO", AV86TIP_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSEG_CODIGO", AV56SEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vFAM_CODIGO", AV33FAM_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCLAS_CODIGO", AV21Clas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCATA_CODIGO", AV16Cata_Codigo);
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vSWERROPADREHIJO", AV61SWErroPadreHijo);
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vSWERROPADRE", AV60SWErroPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWERRORPADRE", GXutil.ltrim( localUtil.ntoc( AV63SWErrorPadre, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CODIGOMOVIMIENTO", AV90Tran_CodigoMovimiento);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CENTROCOSTOID", GXutil.ltrim( localUtil.ntoc( AV89Tran_CentroCostoId, (byte)(11), (byte)(0), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTDETALLETRN", AV54SDTDetalleTrn);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTDETALLETRN", AV54SDTDetalleTrn);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCTDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( AV29cTDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vOBSERVACIONES", AV41Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTDET_PLACAPADRE", AV49pTDet_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( AV48pTDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CODTIPOELEMENTO", GXutil.ltrim( localUtil.ntoc( AV91Tran_CodTipoElemento, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_DESCRIPCION", A557Elem_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIP_CODIGO", A74TIP_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "SEG_CODIGO", A75SEG_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FAM_CODIGO", A35FAM_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CLAS_CODIGO", A34Clas_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_CODIGO", A37Cata_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vC", GXutil.ltrim( localUtil.ntoc( AV13C, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDCUENTADANTERESPONSABILIDAD", GXutil.ltrim( localUtil.ntoc( AV6Tran_IdCuentadanteResponsabilidad, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWELIMINAR", GXutil.ltrim( localUtil.ntoc( AV59SWEliminar, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSWNUEVOGRUPO", GXutil.ltrim( localUtil.ntoc( AV68SWNuevoGrupo, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUSUARIO", AV97Usuario);
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vSWPEDREGRUPO", AV70SWPedreGrupo);
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vSWHIJOGRUPO", AV65SWHijoGrupo);
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vSWHIJOGRUPODESAGRUPADO", AV67SWHijoGrupoDesagrupado);
      com.orions2.GxWebStd.gx_boolean_hidden_field( httpContext, "vSWHIJOGRUPOAGRUPADO", AV66SWHijoGrupoAgrupado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vVALOR", GXutil.ltrim( localUtil.ntoc( AV98valor, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_TRANSACCRESPONSABILIDAD", GXutil.ltrim( localUtil.ntoc( AV8Tran_TransaccResponsabilidad, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_FECHARESPONSABILIDAD", localUtil.dtoc( AV5Tran_FechaResponsabilidad, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_TABLARESPONSABILIDAD", GXutil.ltrim( localUtil.ntoc( AV7Tran_TablaResponsabilidad, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPOBSERVACIONES", AV46pObservaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPCATA_DESCRIPCION", AV44PCata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "WPCON_ENT_DEV" ;
      forbiddenHiddens = forbiddenHiddens + localUtil.format( AV96Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99") ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("wpcon_ent_dev:[SendSecurityCheck]"+forbiddenHiddens);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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
         we1V2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1V2( ) ;
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
      return formatLink("com.orions2.wpcon_ent_dev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV94Tran_Id,11,0))) ;
   }

   public String getPgmname( )
   {
      return "WPCON_ENT_DEV" ;
   }

   public String getPgmdesc( )
   {
      return "Entrada elementos devolutivo" ;
   }

   public void wb1V0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-10 col-lg-offset-1", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Entrada elementos devolutivo", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, (short)(0), "HLP_WPCON_ENT_DEV.htm");
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
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-10 col-lg-offset-1", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "min-height:10px;", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_consecutivocc_Internalname, "Numero Transacción", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_consecutivocc_Internalname, GXutil.ltrim( localUtil.ntoc( AV92Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtavTran_consecutivocc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV92Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV92Tran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_consecutivocc_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_consecutivocc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_fecharegistro_Internalname, "Fecha de Registro", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavTran_fecharegistro_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_fecharegistro_Internalname, localUtil.ttoc( AV93Tran_FechaRegistro, 10, 8, 0, 3, "/", ":", " "), localUtil.format( AV93Tran_FechaRegistro, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'spa',false,0);"+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_fecharegistro_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_fecharegistro_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavTran_fecharegistro_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavTran_fecharegistro_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPCON_ENT_DEV.htm");
         httpContext.writeTextNL( "</div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavTipoentrada.getInternalname(), "Tipo Entrada", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipoentrada, cmbavTipoentrada.getInternalname(), GXutil.rtrim( AV87TipoEntrada), 1, cmbavTipoentrada.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavTipoentrada.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "", true, "HLP_WPCON_ENT_DEV.htm");
         cmbavTipoentrada.setValue( GXutil.rtrim( AV87TipoEntrada) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipoentrada.getInternalname(), "Values", cmbavTipoentrada.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, cmbavCat_bien.getInternalname(), "Categoria Bien", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         /* ComboBox */
         com.orions2.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCat_bien, cmbavCat_bien.getInternalname(), GXutil.rtrim( AV15Cat_Bien), 1, cmbavCat_bien.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavCat_bien.getVisible(), cmbavCat_bien.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "", true, "HLP_WPCON_ENT_DEV.htm");
         cmbavCat_bien.setValue( GXutil.rtrim( AV15Cat_Bien) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCat_bien.getInternalname(), "Values", cmbavCat_bien.ToJavascriptSource(), true);
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttNuevogrupo_Internalname, "gx.evt.setGridEvt("+GXutil.str( 104, 3, 0)+","+"null"+");", "Cerrar Grupo", bttNuevogrupo_Jsonclick, 5, "Cerrar Grupo", "", StyleString, ClassString, bttNuevogrupo_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'NUEVOGRUPO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-6 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_consecutivo_Internalname, "Consecutivo", "col-sm-3 col-lg-6 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV19cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV19cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCelem_consecutivo_Enabled, 0, "text", "", 12, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgImage1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'BUSCARELEMENTO\\'."+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcata_descripcion_Internalname, "Bien", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCcata_descripcion_Internalname, AV18cCata_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,42);\"", (short)(0), 1, edtavCcata_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-10 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_descripcion_Internalname, "Descripción", "col-sm-3 col-lg-2 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCelem_descripcion_Internalname, AV20cElem_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", (short)(0), 1, edtavCelem_descripcion_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "2000", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImageplaca_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgImageplaca_Visible, 1, "Seleccionar Placa", "Seleccionar Placa", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImageplaca_Jsonclick, "'"+""+"'"+",false,"+"'"+"e111v1_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPlacarecuperada_Internalname, "Placa Recuperada", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPlacarecuperada_Internalname, AV45PlacaRecuperada, GXutil.rtrim( localUtil.format( AV45PlacaRecuperada, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPlacarecuperada_Jsonclick, 0, "Attribute", "", "", "", edtavPlacarecuperada_Visible, edtavPlacarecuperada_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCantidad_Internalname, "*Cantidad", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCantidad_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Cantidad, (byte)(10), (byte)(0), ",", "")), ((edtavCantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14Cantidad), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV14Cantidad), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCantidad_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCantidad_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavValorunitario_Internalname, "*Valor Unitario", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavValorunitario_Internalname, GXutil.ltrim( localUtil.ntoc( AV99ValorUnitario, (byte)(22), (byte)(2), ",", "")), ((edtavValorunitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV99ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV99ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValorunitario_Jsonclick, 0, "Attribute", "", "", "", 1, edtavValorunitario_Enabled, 0, "text", "", 22, "chr", 1, "row", 22, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCosto_adquisicion_Internalname, "Costo Adquisición", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCosto_adquisicion_Internalname, GXutil.ltrim( localUtil.ntoc( AV26Costo_Adquisicion, (byte)(24), (byte)(2), ",", "")), ((edtavCosto_adquisicion_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV26Costo_Adquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV26Costo_Adquisicion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCosto_adquisicion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCosto_adquisicion_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavOtros_costos_Internalname, "Otros Costos", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavOtros_costos_Internalname, GXutil.ltrim( localUtil.ntoc( AV43Otros_Costos, (byte)(24), (byte)(2), ",", "")), ((edtavOtros_costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV43Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV43Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOtros_costos_Jsonclick, 0, "Attribute", "", "", "", 1, edtavOtros_costos_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavVf_Internalname, "Valor Futuro", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavVf_Internalname, GXutil.ltrim( localUtil.ntoc( AV100VF, (byte)(24), (byte)(2), ",", "")), ((edtavVf_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV100VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV100VF, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVf_Jsonclick, 0, "Attribute", "", "", "", 1, edtavVf_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavI_Internalname, "Taza Anual (%)", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavI_Internalname, GXutil.ltrim( localUtil.ntoc( AV37I, (byte)(3), (byte)(0), ",", "")), ((edtavI_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37I), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV37I), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "5", edtavI_Jsonclick, 0, "Attribute", "", "", "", 1, edtavI_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavN_Internalname, "N (Años)", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavN_Internalname, GXutil.ltrim( localUtil.ntoc( AV40N, (byte)(4), (byte)(0), ",", "")), ((edtavN_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40N), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV40N), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavN_Jsonclick, 0, "Attribute", "", "", "", 1, edtavN_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCosto_desmantelamiento_Internalname, "Valor Presente", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCosto_desmantelamiento_Internalname, GXutil.ltrim( localUtil.ntoc( AV27Costo_Desmantelamiento, (byte)(24), (byte)(2), ",", "")), ((edtavCosto_desmantelamiento_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV27Costo_Desmantelamiento, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV27Costo_Desmantelamiento, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCosto_desmantelamiento_Jsonclick, 0, "Attribute", "", "", "", 1, edtavCosto_desmantelamiento_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTotal_costos_Internalname, "Total Costo Unitario", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTotal_costos_Internalname, GXutil.ltrim( localUtil.ntoc( AV88Total_Costos, (byte)(24), (byte)(2), ",", "")), ((edtavTotal_costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV88Total_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV88Total_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotal_costos_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTotal_costos_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Valor", "right", false, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 104, 3, 0)+","+"null"+");", "Agregar Bien", bttButton1_Jsonclick, 5, "Agregar Bien", "", StyleString, ClassString, bttButton1_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'AGREGARBIEN\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 col-lg-8 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_valortransaccion_Internalname, "Valor Transaccion", "col-sm-3 col-lg-4 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_104_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_valortransaccion_Internalname, GXutil.ltrim( localUtil.ntoc( AV96Tran_ValorTransaccion, (byte)(24), (byte)(2), ",", "")), ((edtavTran_valortransaccion_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV96Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV96Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_valortransaccion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_valortransaccion_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "Right", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblTitleatributos_Internalname, "Lista de Bienes", "", "", lblTitleatributos_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SubTitle", 0, "", 1, 1, (short)(0), "HLP_WPCON_ENT_DEV.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"104\">") ;
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
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo Item") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Número Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Cantidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Unitario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Otros Costos") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Presente") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Total") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Bien es Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Numero Grupo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Placa Recuperada") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"UpdateAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DeleteAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV76TDet_Consecutivo, (byte)(18), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV30Elem_Consecutivo);
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavElem_consecutivo_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavElem_consecutivo_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavElem_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV17Cata_Descripcion);
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavCata_descripcion_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavCata_descripcion_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCata_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV80TDet_PlacaNumero);
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTdet_placanumero_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavTdet_placanumero_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_placanumero_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV81TDet_PlacaPadre);
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTdet_placapadre_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavTdet_placapadre_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_placapadre_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV74TDet_Cantidad, (byte)(10), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTdet_cantidad_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavTdet_cantidad_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_cantidad_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV85TDet_ValorUnitario, (byte)(22), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTdet_valorunitario_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavTdet_valorunitario_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_valorunitario_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV79TDet_Otros_Costos, (byte)(24), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTdet_otros_costos_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavTdet_otros_costos_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_otros_costos_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV82TDet_Valor_Presente, (byte)(24), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTdet_valor_presente_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavTdet_valor_presente_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_valor_presente_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV84TDet_ValorTotal, (byte)(22), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTdet_valortotal_Forecolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Fontbold", GXutil.ltrim( localUtil.ntoc( edtavTdet_valortotal_Fontbold, (byte)(1), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_valortotal_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV77TDet_EsPadre);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_espadre_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV72TDet_Agrupado, (byte)(4), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_agrupado_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV103TDet_PlacaRecuperada);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_placarecuperada_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV11Atributos));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAtributos_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV31Eliminar));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminar_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 104 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_104 = (short)(nGXsfl_104_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
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
         com.orions2.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 104, 3, 0)+","+"null"+");", "RATIFICAR", bttButton2_Jsonclick, 5, "RATIFICAR", "", StyleString, ClassString, bttButton2_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'RATIFICAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton3_Internalname, "gx.evt.setGridEvt("+GXutil.str( 104, 3, 0)+","+"null"+");", bttButton3_Caption, bttButton3_Jsonclick, 7, "CANCELAR", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121v1_client"+"'", TempTags, "", 2, "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* User Defined Control */
         httpContext.writeText( "<div class=\"gx_usercontrol\" id=\""+"ALERTIFY1Container"+"\"></div>") ;
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblUrl_Internalname, lblUrl_Caption, "", "", lblUrl_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", lblUrl_Visible, 1, (short)(1), "HLP_WPCON_ENT_DEV.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1V2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Entrada elementos devolutivo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1V0( ) ;
   }

   public void ws1V2( )
   {
      start1V2( ) ;
      evt1V2( ) ;
   }

   public void evt1V2( )
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
                           e131V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VTIPOENTRADA.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'AGREGARBIEN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'AgregarBien' */
                           e151V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCELEM_CONSECUTIVO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VI.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e181V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCANTIDAD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e191V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'NUEVOGRUPO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'NuevoGrupo' */
                           e201V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'RATIFICAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RATIFICAR' */
                           e211V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'BUSCARELEMENTO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'BuscarElemento' */
                           e221V2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "'ATRIBUTOS'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "'ATRIBUTOS'") == 0 ) )
                        {
                           nGXsfl_104_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_104_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_104_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_1042( ) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_consecutivo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_consecutivo_Internalname), ",", ".") > 999999999999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_CONSECUTIVO");
                              GX_FocusControl = edtavTdet_consecutivo_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV76TDet_Consecutivo = 0 ;
                           }
                           else
                           {
                              AV76TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( edtavTdet_consecutivo_Internalname), ",", ".") ;
                           }
                           AV30Elem_Consecutivo = httpContext.cgiGet( edtavElem_consecutivo_Internalname) ;
                           AV17Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCata_descripcion_Internalname)) ;
                           AV80TDet_PlacaNumero = httpContext.cgiGet( edtavTdet_placanumero_Internalname) ;
                           AV81TDet_PlacaPadre = httpContext.cgiGet( edtavTdet_placapadre_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_cantidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_cantidad_Internalname), ",", ".") > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_CANTIDAD");
                              GX_FocusControl = edtavTdet_cantidad_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV74TDet_Cantidad = 0 ;
                           }
                           else
                           {
                              AV74TDet_Cantidad = localUtil.ctol( httpContext.cgiGet( edtavTdet_cantidad_Internalname), ",", ".") ;
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTdet_valorunitario_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTdet_valorunitario_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_VALORUNITARIO");
                              GX_FocusControl = edtavTdet_valorunitario_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV85TDet_ValorUnitario = DecimalUtil.ZERO ;
                           }
                           else
                           {
                              AV85TDet_ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtavTdet_valorunitario_Internalname)) ;
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTdet_otros_costos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTdet_otros_costos_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_OTROS_COSTOS");
                              GX_FocusControl = edtavTdet_otros_costos_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV79TDet_Otros_Costos = DecimalUtil.ZERO ;
                           }
                           else
                           {
                              AV79TDet_Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtavTdet_otros_costos_Internalname)) ;
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTdet_valor_presente_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTdet_valor_presente_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_VALOR_PRESENTE");
                              GX_FocusControl = edtavTdet_valor_presente_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV82TDet_Valor_Presente = DecimalUtil.ZERO ;
                           }
                           else
                           {
                              AV82TDet_Valor_Presente = localUtil.ctond( httpContext.cgiGet( edtavTdet_valor_presente_Internalname)) ;
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTdet_valortotal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTdet_valortotal_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_VALORTOTAL");
                              GX_FocusControl = edtavTdet_valortotal_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV84TDet_ValorTotal = DecimalUtil.ZERO ;
                           }
                           else
                           {
                              AV84TDet_ValorTotal = localUtil.ctond( httpContext.cgiGet( edtavTdet_valortotal_Internalname)) ;
                           }
                           AV77TDet_EsPadre = httpContext.cgiGet( edtavTdet_espadre_Internalname) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_agrupado_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_agrupado_Internalname), ",", ".") > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_AGRUPADO");
                              GX_FocusControl = edtavTdet_agrupado_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV72TDet_Agrupado = (short)(0) ;
                           }
                           else
                           {
                              AV72TDet_Agrupado = (short)(localUtil.ctol( httpContext.cgiGet( edtavTdet_agrupado_Internalname), ",", ".")) ;
                           }
                           AV103TDet_PlacaRecuperada = httpContext.cgiGet( edtavTdet_placarecuperada_Internalname) ;
                           AV11Atributos = httpContext.cgiGet( edtavAtributos_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "Bitmap", ((GXutil.strcmp("", AV11Atributos)==0) ? AV107Atributos_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV11Atributos))), !bGXsfl_104_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV11Atributos), true);
                           AV31Eliminar = httpContext.cgiGet( edtavEliminar_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Bitmap", ((GXutil.strcmp("", AV31Eliminar)==0) ? AV106Eliminar_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV31Eliminar))), !bGXsfl_104_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV31Eliminar), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e231V2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e241V2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e251V2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'ATRIBUTOS'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Atributos' */
                                 e261V2 ();
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

   public void we1V2( )
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

   public void pa1V2( )
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
         cmbavTipoentrada.setName( "vTIPOENTRADA" );
         cmbavTipoentrada.setWebtags( "" );
         cmbavTipoentrada.addItem("", "SELECCIONAR", (short)(0));
         cmbavTipoentrada.addItem("UEUP", "UN ELEMENTO UN PADRE", (short)(0));
         cmbavTipoentrada.addItem("NEUP", "N ELEMENTOS UN PADRE", (short)(0));
         cmbavTipoentrada.addItem("ELSP", "ELEMENTOS SIN PADRE", (short)(0));
         if ( cmbavTipoentrada.getItemCount() > 0 )
         {
            AV87TipoEntrada = cmbavTipoentrada.getValidValue(AV87TipoEntrada) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TipoEntrada", AV87TipoEntrada);
         }
         cmbavCat_bien.setName( "vCAT_BIEN" );
         cmbavCat_bien.setWebtags( "" );
         if ( cmbavCat_bien.getItemCount() > 0 )
         {
            AV15Cat_Bien = cmbavCat_bien.getValidValue(AV15Cat_Bien) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Cat_Bien", AV15Cat_Bien);
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

   public void gxnrgrid1_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1042( ) ;
      while ( nGXsfl_104_idx <= nRC_GXsfl_104 )
      {
         sendrow_1042( ) ;
         nGXsfl_104_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_104_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_104_idx+1)) ;
         sGXsfl_104_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_104_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1042( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV31Eliminar ,
                                  String AV11Atributos ,
                                  short AV42OPC ,
                                  String AV95Tran_TipoEntra ,
                                  short AV57SWDeTr ,
                                  long A46Tran_Id ,
                                  long AV94Tran_Id ,
                                  long A48Tran_CentroCostoId ,
                                  String A527Tran_TipoEntra ,
                                  long A499Tran_CodTipoElemento ,
                                  java.math.BigDecimal A483Tran_ValorTransaccion ,
                                  String A49Tran_CodigoMovimiento ,
                                  long A513Tran_ConsecutivoCC ,
                                  java.util.Date A55Tran_FechaRegistro ,
                                  long A56Tran_IdCuentadanteResponsabili ,
                                  long A719Tran_TransaccResponsabilidad ,
                                  java.util.Date A720Tran_FechaResponsabilidad ,
                                  short A758Tran_TablaResponsabilidad ,
                                  long A69TDet_Consecutivo ,
                                  String AV87TipoEntrada ,
                                  String A525TDet_Atributos ,
                                  long A487TDet_Cantidad ,
                                  String A66Elem_Consecutivo ,
                                  java.math.BigDecimal A489TDet_ValorTotal ,
                                  java.math.BigDecimal A488TDet_ValorUnitario ,
                                  String A490TDet_PlacaNumero ,
                                  String A491TDet_PlacaPadre ,
                                  String A505TDet_EsPadre ,
                                  String A298Cata_Descripcion ,
                                  java.math.BigDecimal A653TDet_Valor_Presente ,
                                  java.math.BigDecimal A657TDet_Otros_Costos ,
                                  short A658TDet_Agrupado ,
                                  String A817TDet_PlacaRecuperada ,
                                  short AV71SWRatificar )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf1V2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavTipoentrada.getItemCount() > 0 )
      {
         AV87TipoEntrada = cmbavTipoentrada.getValidValue(AV87TipoEntrada) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87TipoEntrada", AV87TipoEntrada);
      }
      if ( cmbavCat_bien.getItemCount() > 0 )
      {
         AV15Cat_Bien = cmbavCat_bien.getValidValue(AV15Cat_Bien) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Cat_Bien", AV15Cat_Bien);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1V2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_consecutivocc_Enabled, 5, 0)), true);
      edtavTran_fecharegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_fecharegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_fecharegistro_Enabled, 5, 0)), true);
      edtavCcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcata_descripcion_Enabled, 5, 0)), true);
      edtavCelem_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCelem_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCelem_descripcion_Enabled, 5, 0)), true);
      edtavPlacarecuperada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlacarecuperada_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPlacarecuperada_Enabled, 5, 0)), true);
      edtavCosto_adquisicion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCosto_adquisicion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCosto_adquisicion_Enabled, 5, 0)), true);
      edtavCosto_desmantelamiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCosto_desmantelamiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCosto_desmantelamiento_Enabled, 5, 0)), true);
      edtavTotal_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotal_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTotal_costos_Enabled, 5, 0)), true);
      edtavTran_valortransaccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_valortransaccion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_valortransaccion_Enabled, 5, 0)), true);
      edtavTdet_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_consecutivo_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavElem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavElem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavElem_consecutivo_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavCata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_placanumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placanumero_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placanumero_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_placapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placapadre_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_cantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_cantidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_cantidad_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_valorunitario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valorunitario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valorunitario_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_otros_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_otros_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_otros_costos_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_valor_presente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valor_presente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valor_presente_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_valortotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valortotal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valortotal_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_espadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_espadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_espadre_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_agrupado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_agrupado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_agrupado_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_placarecuperada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placarecuperada_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placarecuperada_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
   }

   public void rf1V2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(104) ;
      /* Execute user event: Refresh */
      e251V2 ();
      nGXsfl_104_idx = (short)(1) ;
      sGXsfl_104_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_104_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_1042( ) ;
      bGXsfl_104_Refreshing = true ;
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
         subsflControlProps_1042( ) ;
         e241V2 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_104_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e241V2 ();
         }
         wbEnd = (short)(104) ;
         wb1V0( ) ;
      }
      bGXsfl_104_Refreshing = true ;
   }

   public int subgrid1_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_recordsperpage( )))+1) ;
   }

   public int subgrid1_recordcount( )
   {
      return -1 ;
   }

   public int subgrid1_recordsperpage( )
   {
      if ( subGrid1_Rows > 0 )
      {
         return subGrid1_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid1_currentpage( )
   {
      return -1 ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV31Eliminar, AV11Atributos, AV42OPC, AV95Tran_TipoEntra, AV57SWDeTr, A46Tran_Id, AV94Tran_Id, A48Tran_CentroCostoId, A527Tran_TipoEntra, A499Tran_CodTipoElemento, A483Tran_ValorTransaccion, A49Tran_CodigoMovimiento, A513Tran_ConsecutivoCC, A55Tran_FechaRegistro, A56Tran_IdCuentadanteResponsabili, A719Tran_TransaccResponsabilidad, A720Tran_FechaResponsabilidad, A758Tran_TablaResponsabilidad, A69TDet_Consecutivo, AV87TipoEntrada, A525TDet_Atributos, A487TDet_Cantidad, A66Elem_Consecutivo, A489TDet_ValorTotal, A488TDet_ValorUnitario, A490TDet_PlacaNumero, A491TDet_PlacaPadre, A505TDet_EsPadre, A298Cata_Descripcion, A653TDet_Valor_Presente, A657TDet_Otros_Costos, A658TDet_Agrupado, A817TDet_PlacaRecuperada, AV71SWRatificar) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_recordsperpage( )) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV31Eliminar, AV11Atributos, AV42OPC, AV95Tran_TipoEntra, AV57SWDeTr, A46Tran_Id, AV94Tran_Id, A48Tran_CentroCostoId, A527Tran_TipoEntra, A499Tran_CodTipoElemento, A483Tran_ValorTransaccion, A49Tran_CodigoMovimiento, A513Tran_ConsecutivoCC, A55Tran_FechaRegistro, A56Tran_IdCuentadanteResponsabili, A719Tran_TransaccResponsabilidad, A720Tran_FechaResponsabilidad, A758Tran_TablaResponsabilidad, A69TDet_Consecutivo, AV87TipoEntrada, A525TDet_Atributos, A487TDet_Cantidad, A66Elem_Consecutivo, A489TDet_ValorTotal, A488TDet_ValorUnitario, A490TDet_PlacaNumero, A491TDet_PlacaPadre, A505TDet_EsPadre, A298Cata_Descripcion, A653TDet_Valor_Presente, A657TDet_Otros_Costos, A658TDet_Agrupado, A817TDet_PlacaRecuperada, AV71SWRatificar) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV31Eliminar, AV11Atributos, AV42OPC, AV95Tran_TipoEntra, AV57SWDeTr, A46Tran_Id, AV94Tran_Id, A48Tran_CentroCostoId, A527Tran_TipoEntra, A499Tran_CodTipoElemento, A483Tran_ValorTransaccion, A49Tran_CodigoMovimiento, A513Tran_ConsecutivoCC, A55Tran_FechaRegistro, A56Tran_IdCuentadanteResponsabili, A719Tran_TransaccResponsabilidad, A720Tran_FechaResponsabilidad, A758Tran_TablaResponsabilidad, A69TDet_Consecutivo, AV87TipoEntrada, A525TDet_Atributos, A487TDet_Cantidad, A66Elem_Consecutivo, A489TDet_ValorTotal, A488TDet_ValorUnitario, A490TDet_PlacaNumero, A491TDet_PlacaPadre, A505TDet_EsPadre, A298Cata_Descripcion, A653TDet_Valor_Presente, A657TDet_Otros_Costos, A658TDet_Agrupado, A817TDet_PlacaRecuperada, AV71SWRatificar) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV31Eliminar, AV11Atributos, AV42OPC, AV95Tran_TipoEntra, AV57SWDeTr, A46Tran_Id, AV94Tran_Id, A48Tran_CentroCostoId, A527Tran_TipoEntra, A499Tran_CodTipoElemento, A483Tran_ValorTransaccion, A49Tran_CodigoMovimiento, A513Tran_ConsecutivoCC, A55Tran_FechaRegistro, A56Tran_IdCuentadanteResponsabili, A719Tran_TransaccResponsabilidad, A720Tran_FechaResponsabilidad, A758Tran_TablaResponsabilidad, A69TDet_Consecutivo, AV87TipoEntrada, A525TDet_Atributos, A487TDet_Cantidad, A66Elem_Consecutivo, A489TDet_ValorTotal, A488TDet_ValorUnitario, A490TDet_PlacaNumero, A491TDet_PlacaPadre, A505TDet_EsPadre, A298Cata_Descripcion, A653TDet_Valor_Presente, A657TDet_Otros_Costos, A658TDet_Agrupado, A817TDet_PlacaRecuperada, AV71SWRatificar) ;
      }
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV31Eliminar, AV11Atributos, AV42OPC, AV95Tran_TipoEntra, AV57SWDeTr, A46Tran_Id, AV94Tran_Id, A48Tran_CentroCostoId, A527Tran_TipoEntra, A499Tran_CodTipoElemento, A483Tran_ValorTransaccion, A49Tran_CodigoMovimiento, A513Tran_ConsecutivoCC, A55Tran_FechaRegistro, A56Tran_IdCuentadanteResponsabili, A719Tran_TransaccResponsabilidad, A720Tran_FechaResponsabilidad, A758Tran_TablaResponsabilidad, A69TDet_Consecutivo, AV87TipoEntrada, A525TDet_Atributos, A487TDet_Cantidad, A66Elem_Consecutivo, A489TDet_ValorTotal, A488TDet_ValorUnitario, A490TDet_PlacaNumero, A491TDet_PlacaPadre, A505TDet_EsPadre, A298Cata_Descripcion, A653TDet_Valor_Presente, A657TDet_Otros_Costos, A658TDet_Agrupado, A817TDet_PlacaRecuperada, AV71SWRatificar) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup1V0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavTran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_consecutivocc_Enabled, 5, 0)), true);
      edtavTran_fecharegistro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_fecharegistro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_fecharegistro_Enabled, 5, 0)), true);
      edtavCcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcata_descripcion_Enabled, 5, 0)), true);
      edtavCelem_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCelem_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCelem_descripcion_Enabled, 5, 0)), true);
      edtavPlacarecuperada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlacarecuperada_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPlacarecuperada_Enabled, 5, 0)), true);
      edtavCosto_adquisicion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCosto_adquisicion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCosto_adquisicion_Enabled, 5, 0)), true);
      edtavCosto_desmantelamiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCosto_desmantelamiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCosto_desmantelamiento_Enabled, 5, 0)), true);
      edtavTotal_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotal_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTotal_costos_Enabled, 5, 0)), true);
      edtavTran_valortransaccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_valortransaccion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_valortransaccion_Enabled, 5, 0)), true);
      edtavTdet_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_consecutivo_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavElem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavElem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavElem_consecutivo_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavCata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_placanumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placanumero_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placanumero_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_placapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placapadre_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_cantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_cantidad_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_cantidad_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_valorunitario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valorunitario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valorunitario_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_otros_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_otros_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_otros_costos_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_valor_presente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valor_presente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valor_presente_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_valortotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valortotal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valortotal_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_espadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_espadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_espadre_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_agrupado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_agrupado_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_agrupado_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      edtavTdet_placarecuperada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placarecuperada_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placarecuperada_Enabled, 5, 0)), !bGXsfl_104_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e231V2 ();
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
            AV92Tran_ConsecutivoCC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV92Tran_ConsecutivoCC, 18, 0)));
         }
         else
         {
            AV92Tran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV92Tran_ConsecutivoCC, 18, 0)));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavTran_fecharegistro_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vTRAN_FECHAREGISTRO");
            GX_FocusControl = edtavTran_fecharegistro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV93Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV93Tran_FechaRegistro", localUtil.ttoc( AV93Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            AV93Tran_FechaRegistro = localUtil.ctot( httpContext.cgiGet( edtavTran_fecharegistro_Internalname), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93Tran_FechaRegistro", localUtil.ttoc( AV93Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         }
         cmbavTipoentrada.setName( cmbavTipoentrada.getInternalname() );
         cmbavTipoentrada.setValue( httpContext.cgiGet( cmbavTipoentrada.getInternalname()) );
         AV87TipoEntrada = httpContext.cgiGet( cmbavTipoentrada.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87TipoEntrada", AV87TipoEntrada);
         cmbavCat_bien.setName( cmbavCat_bien.getInternalname() );
         cmbavCat_bien.setValue( httpContext.cgiGet( cmbavCat_bien.getInternalname()) );
         AV15Cat_Bien = httpContext.cgiGet( cmbavCat_bien.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Cat_Bien", AV15Cat_Bien);
         AV19cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19cElem_Consecutivo", AV19cElem_Consecutivo);
         AV18cCata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCcata_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18cCata_Descripcion", AV18cCata_Descripcion);
         AV20cElem_Descripcion = httpContext.cgiGet( edtavCelem_descripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20cElem_Descripcion", AV20cElem_Descripcion);
         AV45PlacaRecuperada = httpContext.cgiGet( edtavPlacarecuperada_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45PlacaRecuperada", AV45PlacaRecuperada);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCantidad_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCantidad_Internalname), ",", ".") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDAD");
            GX_FocusControl = edtavCantidad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Cantidad = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Cantidad", GXutil.ltrim( GXutil.str( AV14Cantidad, 10, 0)));
         }
         else
         {
            AV14Cantidad = localUtil.ctol( httpContext.cgiGet( edtavCantidad_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Cantidad", GXutil.ltrim( GXutil.str( AV14Cantidad, 10, 0)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavValorunitario_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValorunitario_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALORUNITARIO");
            GX_FocusControl = edtavValorunitario_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV99ValorUnitario = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99ValorUnitario", GXutil.ltrim( GXutil.str( AV99ValorUnitario, 18, 2)));
         }
         else
         {
            AV99ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtavValorunitario_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99ValorUnitario", GXutil.ltrim( GXutil.str( AV99ValorUnitario, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCosto_adquisicion_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCosto_adquisicion_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTO_ADQUISICION");
            GX_FocusControl = edtavCosto_adquisicion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26Costo_Adquisicion = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Costo_Adquisicion", GXutil.ltrim( GXutil.str( AV26Costo_Adquisicion, 18, 2)));
         }
         else
         {
            AV26Costo_Adquisicion = localUtil.ctond( httpContext.cgiGet( edtavCosto_adquisicion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Costo_Adquisicion", GXutil.ltrim( GXutil.str( AV26Costo_Adquisicion, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavOtros_costos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavOtros_costos_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOTROS_COSTOS");
            GX_FocusControl = edtavOtros_costos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV43Otros_Costos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43Otros_Costos", GXutil.ltrim( GXutil.str( AV43Otros_Costos, 18, 2)));
         }
         else
         {
            AV43Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtavOtros_costos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43Otros_Costos", GXutil.ltrim( GXutil.str( AV43Otros_Costos, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavVf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavVf_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVF");
            GX_FocusControl = edtavVf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV100VF = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100VF", GXutil.ltrim( GXutil.str( AV100VF, 18, 2)));
         }
         else
         {
            AV100VF = localUtil.ctond( httpContext.cgiGet( edtavVf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100VF", GXutil.ltrim( GXutil.str( AV100VF, 18, 2)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavI_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavI_Internalname), ",", ".") > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vI");
            GX_FocusControl = edtavI_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37I = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37I", GXutil.ltrim( GXutil.str( AV37I, 3, 0)));
         }
         else
         {
            AV37I = (short)(localUtil.ctol( httpContext.cgiGet( edtavI_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37I", GXutil.ltrim( GXutil.str( AV37I, 3, 0)));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavN_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavN_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vN");
            GX_FocusControl = edtavN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40N = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40N", GXutil.ltrim( GXutil.str( AV40N, 4, 0)));
         }
         else
         {
            AV40N = (short)(localUtil.ctol( httpContext.cgiGet( edtavN_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40N", GXutil.ltrim( GXutil.str( AV40N, 4, 0)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCosto_desmantelamiento_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCosto_desmantelamiento_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTO_DESMANTELAMIENTO");
            GX_FocusControl = edtavCosto_desmantelamiento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27Costo_Desmantelamiento = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Costo_Desmantelamiento", GXutil.ltrim( GXutil.str( AV27Costo_Desmantelamiento, 18, 2)));
         }
         else
         {
            AV27Costo_Desmantelamiento = localUtil.ctond( httpContext.cgiGet( edtavCosto_desmantelamiento_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Costo_Desmantelamiento", GXutil.ltrim( GXutil.str( AV27Costo_Desmantelamiento, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotal_costos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotal_costos_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTAL_COSTOS");
            GX_FocusControl = edtavTotal_costos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV88Total_Costos = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Total_Costos", GXutil.ltrim( GXutil.str( AV88Total_Costos, 18, 2)));
         }
         else
         {
            AV88Total_Costos = localUtil.ctond( httpContext.cgiGet( edtavTotal_costos_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Total_Costos", GXutil.ltrim( GXutil.str( AV88Total_Costos, 18, 2)));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTran_valortransaccion_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTran_valortransaccion_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRAN_VALORTRANSACCION");
            GX_FocusControl = edtavTran_valortransaccion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV96Tran_ValorTransaccion = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV96Tran_ValorTransaccion, 18, 2)));
         }
         else
         {
            AV96Tran_ValorTransaccion = localUtil.ctond( httpContext.cgiGet( edtavTran_valortransaccion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV96Tran_ValorTransaccion, 18, 2)));
         }
         /* Read saved values. */
         nRC_GXsfl_104 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_104"), ",", ".")) ;
         AV7Tran_TablaResponsabilidad = (short)(localUtil.ctol( httpContext.cgiGet( "vTRAN_TABLARESPONSABILIDAD"), ",", ".")) ;
         AV5Tran_FechaResponsabilidad = localUtil.ctod( httpContext.cgiGet( "vTRAN_FECHARESPONSABILIDAD"), 0) ;
         AV8Tran_TransaccResponsabilidad = localUtil.ctol( httpContext.cgiGet( "vTRAN_TRANSACCRESPONSABILIDAD"), ",", ".") ;
         AV6Tran_IdCuentadanteResponsabilidad = localUtil.ctol( httpContext.cgiGet( "vTRAN_IDCUENTADANTERESPONSABILIDAD"), ",", ".") ;
         AV46pObservaciones = httpContext.cgiGet( "vPOBSERVACIONES") ;
         AV44PCata_Descripcion = httpContext.cgiGet( "vPCATA_DESCRIPCION") ;
         AV59SWEliminar = (short)(localUtil.ctol( httpContext.cgiGet( "vSWELIMINAR"), ",", ".")) ;
         AV71SWRatificar = (short)(localUtil.ctol( httpContext.cgiGet( "vSWRATIFICAR"), ",", ".")) ;
         AV68SWNuevoGrupo = (short)(localUtil.ctol( httpContext.cgiGet( "vSWNUEVOGRUPO"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), ",", ".")) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = "hsh" + "WPCON_ENT_DEV" ;
         AV96Tran_ValorTransaccion = localUtil.ctond( httpContext.cgiGet( edtavTran_valortransaccion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV96Tran_ValorTransaccion, 18, 2)));
         forbiddenHiddens = forbiddenHiddens + localUtil.format( AV96Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99") ;
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("wpcon_ent_dev:[SecurityCheckFailed]"+forbiddenHiddens);
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e231V2 ();
      if (returnInSub) return;
   }

   public void e231V2( )
   {
      /* Start Routine */
      lblUrl_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblUrl_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblUrl_Visible, 5, 0)), true);
      subGrid1_Rows = 8 ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV59SWEliminar = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59SWEliminar", GXutil.ltrim( GXutil.str( AV59SWEliminar, 4, 0)));
      AV71SWRatificar = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71SWRatificar", GXutil.ltrim( GXutil.str( AV71SWRatificar, 4, 0)));
      AV68SWNuevoGrupo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68SWNuevoGrupo", GXutil.ltrim( GXutil.str( AV68SWNuevoGrupo, 4, 0)));
      AV42OPC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
      AV31Eliminar = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Bitmap", ((GXutil.strcmp("", AV31Eliminar)==0) ? AV106Eliminar_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV31Eliminar))), !bGXsfl_104_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV31Eliminar), true);
      AV106Eliminar_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Bitmap", ((GXutil.strcmp("", AV31Eliminar)==0) ? AV106Eliminar_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV31Eliminar))), !bGXsfl_104_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV31Eliminar), true);
      AV11Atributos = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "Bitmap", ((GXutil.strcmp("", AV11Atributos)==0) ? AV107Atributos_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV11Atributos))), !bGXsfl_104_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV11Atributos), true);
      AV107Atributos_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "Bitmap", ((GXutil.strcmp("", AV11Atributos)==0) ? AV107Atributos_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV11Atributos))), !bGXsfl_104_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV11Atributos), true);
      AV97Usuario = AV101websession.getValue("Usuario") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97Usuario", AV97Usuario);
      AV96Tran_ValorTransaccion = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV96Tran_ValorTransaccion, 18, 2)));
      imgImageplaca_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgImageplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImageplaca_Visible, 5, 0)), true);
      edtavPlacarecuperada_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlacarecuperada_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPlacarecuperada_Visible, 5, 0)), true);
      /* Execute user subroutine: 'DATOSGENERALES' */
      S112 ();
      if (returnInSub) return;
      if ( (0==AV6Tran_IdCuentadanteResponsabilidad) )
      {
         imgImageplaca_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImageplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImageplaca_Visible, 5, 0)), true);
         edtavPlacarecuperada_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavPlacarecuperada_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPlacarecuperada_Visible, 5, 0)), true);
      }
      else
      {
         imgImageplaca_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgImageplaca_Internalname, "Visible", GXutil.ltrim( GXutil.str( imgImageplaca_Visible, 5, 0)), true);
         edtavPlacarecuperada_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavPlacarecuperada_Internalname, "Visible", GXutil.ltrim( GXutil.str( edtavPlacarecuperada_Visible, 5, 0)), true);
      }
   }

   private void e241V2( )
   {
      /* Grid1_Load Routine */
      AV42OPC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
      AV31Eliminar = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      AV106Eliminar_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      AV11Atributos = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      AV107Atributos_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      /* Using cursor H001V2 */
      pr_default.execute(0, new Object[] {new Long(AV94Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A37Cata_Codigo = H001V2_A37Cata_Codigo[0] ;
         A46Tran_Id = H001V2_A46Tran_Id[0] ;
         A487TDet_Cantidad = H001V2_A487TDet_Cantidad[0] ;
         A66Elem_Consecutivo = H001V2_A66Elem_Consecutivo[0] ;
         A489TDet_ValorTotal = H001V2_A489TDet_ValorTotal[0] ;
         A488TDet_ValorUnitario = H001V2_A488TDet_ValorUnitario[0] ;
         A490TDet_PlacaNumero = H001V2_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = H001V2_n490TDet_PlacaNumero[0] ;
         A491TDet_PlacaPadre = H001V2_A491TDet_PlacaPadre[0] ;
         n491TDet_PlacaPadre = H001V2_n491TDet_PlacaPadre[0] ;
         A505TDet_EsPadre = H001V2_A505TDet_EsPadre[0] ;
         A525TDet_Atributos = H001V2_A525TDet_Atributos[0] ;
         A298Cata_Descripcion = H001V2_A298Cata_Descripcion[0] ;
         A653TDet_Valor_Presente = H001V2_A653TDet_Valor_Presente[0] ;
         n653TDet_Valor_Presente = H001V2_n653TDet_Valor_Presente[0] ;
         A657TDet_Otros_Costos = H001V2_A657TDet_Otros_Costos[0] ;
         n657TDet_Otros_Costos = H001V2_n657TDet_Otros_Costos[0] ;
         A658TDet_Agrupado = H001V2_A658TDet_Agrupado[0] ;
         n658TDet_Agrupado = H001V2_n658TDet_Agrupado[0] ;
         A817TDet_PlacaRecuperada = H001V2_A817TDet_PlacaRecuperada[0] ;
         n817TDet_PlacaRecuperada = H001V2_n817TDet_PlacaRecuperada[0] ;
         A69TDet_Consecutivo = H001V2_A69TDet_Consecutivo[0] ;
         A37Cata_Codigo = H001V2_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H001V2_A298Cata_Descripcion[0] ;
         AV74TDet_Cantidad = A487TDet_Cantidad ;
         AV30Elem_Consecutivo = A66Elem_Consecutivo ;
         AV76TDet_Consecutivo = A69TDet_Consecutivo ;
         AV84TDet_ValorTotal = A489TDet_ValorTotal ;
         AV85TDet_ValorUnitario = A488TDet_ValorUnitario ;
         AV80TDet_PlacaNumero = A490TDet_PlacaNumero ;
         AV81TDet_PlacaPadre = A491TDet_PlacaPadre ;
         AV77TDet_EsPadre = A505TDet_EsPadre ;
         AV73TDet_Atributos = A525TDet_Atributos ;
         AV17Cata_Descripcion = A298Cata_Descripcion ;
         AV82TDet_Valor_Presente = A653TDet_Valor_Presente ;
         AV79TDet_Otros_Costos = A657TDet_Otros_Costos ;
         AV72TDet_Agrupado = A658TDet_Agrupado ;
         AV103TDet_PlacaRecuperada = A817TDet_PlacaRecuperada ;
         edtavTdet_valorunitario_Fontbold = (byte)(1) ;
         edtavTdet_placanumero_Fontbold = (byte)(1) ;
         edtavElem_consecutivo_Fontbold = (byte)(1) ;
         edtavTdet_placapadre_Fontbold = (byte)(1) ;
         edtavTdet_cantidad_Fontbold = (byte)(1) ;
         edtavCata_descripcion_Fontbold = (byte)(1) ;
         edtavTdet_valor_presente_Fontbold = (byte)(1) ;
         edtavTdet_otros_costos_Fontbold = (byte)(1) ;
         edtavTdet_valortotal_Fontbold = (byte)(1) ;
         if ( ( GXutil.strcmp(AV77TDet_EsPadre, "NO") == 0 ) && ( AV72TDet_Agrupado == 1 ) )
         {
            edtavEliminar_Enabled = 0 ;
         }
         else
         {
            edtavEliminar_Enabled = 1 ;
         }
         if ( AV71SWRatificar == 1 )
         {
            edtavAtributos_Enabled = 0 ;
            edtavEliminar_Enabled = 0 ;
         }
         if ( GXutil.strcmp(AV73TDet_Atributos, "SI") == 0 )
         {
            edtavTdet_placanumero_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavElem_consecutivo_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavTdet_placapadre_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavTdet_cantidad_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavTdet_valorunitario_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavCata_descripcion_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavTdet_valor_presente_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavTdet_otros_costos_Forecolor = GXutil.getColor( 0, 128, 0) ;
            edtavTdet_valortotal_Forecolor = GXutil.getColor( 0, 128, 0) ;
         }
         else
         {
            edtavTdet_placanumero_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavElem_consecutivo_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavTdet_placapadre_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavTdet_cantidad_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavTdet_valorunitario_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavCata_descripcion_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavTdet_valor_presente_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavTdet_otros_costos_Forecolor = GXutil.getColor( 204, 0, 0) ;
            edtavTdet_valortotal_Forecolor = GXutil.getColor( 204, 0, 0) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(104) ;
         }
         if ( ( subGrid1_Islastpage == 1 ) || ( subGrid1_Rows == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
         {
            sendrow_1042( ) ;
            GRID1_nEOF = (byte)(1) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid1_Islastpage == 1 ) && ( ((int)((GRID1_nCurrentRecord) % (subgrid1_recordsperpage( )))) == 0 ) )
            {
               GRID1_nFirstRecordOnPage = GRID1_nCurrentRecord ;
            }
         }
         if ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) )
         {
            GRID1_nEOF = (byte)(0) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_104_Refreshing )
         {
            httpContext.doAjaxLoad(104, Grid1Row);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void e141V2( )
   {
      /* Tipoentrada_Isvalid Routine */
      /* Execute user subroutine: 'INICIARCATEGORIA' */
      S122 ();
      if (returnInSub) return;
      cmbavCat_bien.setValue( GXutil.rtrim( AV15Cat_Bien) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCat_bien.getInternalname(), "Values", cmbavCat_bien.ToJavascriptSource(), true);
   }

   public void e151V2( )
   {
      /* 'AgregarBien' Routine */
      /* Execute user subroutine: 'VALIDAR' */
      S132 ();
      if (returnInSub) return;
      if ( AV62SWError == 0 )
      {
         if ( GXutil.strcmp(AV87TipoEntrada, "UEUP") == 0 )
         {
            /* Execute user subroutine: 'AGREGARBIENUEUP' */
            S142 ();
            if (returnInSub) return;
         }
         else if ( GXutil.strcmp(AV87TipoEntrada, "NEUP") == 0 )
         {
            /* Execute user subroutine: 'AGREGARBIENNEUP' */
            S152 ();
            if (returnInSub) return;
         }
         else if ( GXutil.strcmp(AV87TipoEntrada, "ELSP") == 0 )
         {
            /* Execute user subroutine: 'VALIDARBIENADMINISTRACION' */
            S162 ();
            if (returnInSub) return;
            if ( AV47pRespuesta )
            {
               /* Execute user subroutine: 'AGREGARBIENELSP' */
               S172 ();
               if (returnInSub) return;
               /* Execute user subroutine: 'BORRARDATOS' */
               S182 ();
               if (returnInSub) return;
               AV42OPC = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
               httpContext.doAjaxRefresh();
            }
            else
            {
               Alertify1_Type = "error" ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
               Alertify1_Textmessage = "Error.. El bien no cumple con el valor mínimo para el ingreso" ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
               this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            }
         }
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54SDTDetalleTrn", AV54SDTDetalleTrn);
      cmbavTipoentrada.setValue( GXutil.rtrim( AV87TipoEntrada) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTipoentrada.getInternalname(), "Values", cmbavTipoentrada.ToJavascriptSource(), true);
      cmbavCat_bien.setValue( GXutil.rtrim( AV15Cat_Bien) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCat_bien.getInternalname(), "Values", cmbavCat_bien.ToJavascriptSource(), true);
   }

   public void e161V2( )
   {
      /* Celem_consecutivo_Isvalid Routine */
      if ( GXutil.strcmp(AV19cElem_Consecutivo, "") != 0 )
      {
         /* Execute user subroutine: 'BUSCAELEMENTO' */
         S192 ();
         if (returnInSub) return;
      }
   }

   public void e221V2( )
   {
      /* 'BuscarElemento' Routine */
      httpContext.popup(formatLink("com.orions2.gxelemconsu") + "?" + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.rtrim("")) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV91Tran_CodTipoElemento,18,0))), new Object[] {"AV19cElem_Consecutivo","AV20cElem_Descripcion","AV18cCata_Descripcion","AV86TIP_Codigo","AV56SEG_Codigo","AV33FAM_Codigo","AV21Clas_Codigo","AV16Cata_Codigo",});
   }

   public void e171V2( )
   {
      /* I_Isvalid Routine */
      if ( AV14Cantidad > 0 )
      {
         if ( ( DecimalUtil.compareTo(AV100VF, DecimalUtil.ZERO) != 0 ) && ( AV37I != 0 ) && ( AV40N != 0 ) )
         {
            /* Execute user subroutine: 'CALCULARDESMANTELAMIENTO' */
            S202 ();
            if (returnInSub) return;
            AV88Total_Costos = AV26Costo_Adquisicion.add(AV43Otros_Costos.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN)).add(AV27Costo_Desmantelamiento.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Total_Costos", GXutil.ltrim( GXutil.str( AV88Total_Costos, 18, 2)));
         }
         else
         {
            AV27Costo_Desmantelamiento = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Costo_Desmantelamiento", GXutil.ltrim( GXutil.str( AV27Costo_Desmantelamiento, 18, 2)));
            AV88Total_Costos = AV26Costo_Adquisicion.add(AV43Otros_Costos.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN)).add(AV27Costo_Desmantelamiento) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Total_Costos", GXutil.ltrim( GXutil.str( AV88Total_Costos, 18, 2)));
         }
      }
      else
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "ERROR... La cantidad debe ser mayor a cero." ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
   }

   public void e181V2( )
   {
      /* N_Isvalid Routine */
      if ( AV14Cantidad > 0 )
      {
         if ( ( DecimalUtil.compareTo(AV100VF, DecimalUtil.ZERO) != 0 ) && ( AV37I != 0 ) && ( AV40N != 0 ) )
         {
            /* Execute user subroutine: 'CALCULARDESMANTELAMIENTO' */
            S202 ();
            if (returnInSub) return;
            AV88Total_Costos = AV26Costo_Adquisicion.add(AV43Otros_Costos.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN)).add(AV27Costo_Desmantelamiento.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Total_Costos", GXutil.ltrim( GXutil.str( AV88Total_Costos, 18, 2)));
         }
         else
         {
            AV27Costo_Desmantelamiento = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Costo_Desmantelamiento", GXutil.ltrim( GXutil.str( AV27Costo_Desmantelamiento, 18, 2)));
            AV88Total_Costos = AV26Costo_Adquisicion.add(AV43Otros_Costos.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN)).add(AV27Costo_Desmantelamiento) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Total_Costos", GXutil.ltrim( GXutil.str( AV88Total_Costos, 18, 2)));
         }
      }
      else
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "ERROR... La cantidad debe ser mayor a cero." ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
   }

   public void e191V2( )
   {
      /* Cantidad_Isvalid Routine */
      if ( AV14Cantidad > 0 )
      {
         if ( ( AV6Tran_IdCuentadanteResponsabilidad != 0 ) && ( AV14Cantidad > 1 ) )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "ERROR... La cantidad no puedes ser mayor a 1 para una reposición." ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
         else
         {
            AV26Costo_Adquisicion = AV99ValorUnitario ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Costo_Adquisicion", GXutil.ltrim( GXutil.str( AV26Costo_Adquisicion, 18, 2)));
            AV88Total_Costos = AV26Costo_Adquisicion.add(AV43Otros_Costos.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN)).add(AV27Costo_Desmantelamiento.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Total_Costos", GXutil.ltrim( GXutil.str( AV88Total_Costos, 18, 2)));
         }
      }
      else
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "ERROR... La cantidad debe ser mayor a cero." ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      if ( ( AV6Tran_IdCuentadanteResponsabilidad != 0 ) && ( GXutil.strcmp(AV45PlacaRecuperada, "") == 0 ) )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "ERROR... Debe seleccionar la placa que se está recuperando" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
   }

   public void e251V2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      if ( AV42OPC == 1 )
      {
         httpContext.doAjaxRefresh();
         AV42OPC = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
         /* Execute user subroutine: 'DATOSGENERALES' */
         S112 ();
         if (returnInSub) return;
      }
      cmbavTipoentrada.setValue( GXutil.rtrim( AV87TipoEntrada) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTipoentrada.getInternalname(), "Values", cmbavTipoentrada.ToJavascriptSource(), true);
      cmbavCat_bien.setValue( GXutil.rtrim( AV15Cat_Bien) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCat_bien.getInternalname(), "Values", cmbavCat_bien.ToJavascriptSource(), true);
   }

   public void e261V2( )
   {
      /* 'Atributos' Routine */
      AV42OPC = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
      httpContext.popup(formatLink("com.orions2.wpatributosdev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV94Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV76TDet_Consecutivo,18,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV30Elem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim("UDP")), new Object[] {"AV94Tran_Id",});
      httpContext.doAjaxRefresh();
   }

   public void e131V2( )
   {
      /* Alertify1_Ok Routine */
      AV42OPC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
      if ( AV59SWEliminar > 0 )
      {
         if ( AV59SWEliminar == 1 )
         {
            GXv_int1[0] = AV94Tran_Id ;
            GXv_int2[0] = 0 ;
            GXv_int3[0] = AV72TDet_Agrupado ;
            GXv_char4[0] = AV103TDet_PlacaRecuperada ;
            new com.orions2.entradevoelimi(remoteHandle, context).execute( AV59SWEliminar, GXv_int1, "", GXv_int2, GXv_int3, GXv_char4) ;
            wpcon_ent_dev_impl.this.AV94Tran_Id = GXv_int1[0] ;
            wpcon_ent_dev_impl.this.AV72TDet_Agrupado = GXv_int3[0] ;
            wpcon_ent_dev_impl.this.AV103TDet_PlacaRecuperada = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59SWEliminar", GXutil.ltrim( GXutil.str( AV59SWEliminar, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV94Tran_Id", GXutil.ltrim( GXutil.str( AV94Tran_Id, 11, 0)));
         }
         else if ( AV59SWEliminar == 2 )
         {
            GXv_int2[0] = AV94Tran_Id ;
            GXv_int1[0] = 0 ;
            GXv_int3[0] = AV72TDet_Agrupado ;
            GXv_char4[0] = AV103TDet_PlacaRecuperada ;
            new com.orions2.entradevoelimi(remoteHandle, context).execute( AV59SWEliminar, GXv_int2, AV30Elem_Consecutivo, GXv_int1, GXv_int3, GXv_char4) ;
            wpcon_ent_dev_impl.this.AV94Tran_Id = GXv_int2[0] ;
            wpcon_ent_dev_impl.this.AV72TDet_Agrupado = GXv_int3[0] ;
            wpcon_ent_dev_impl.this.AV103TDet_PlacaRecuperada = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59SWEliminar", GXutil.ltrim( GXutil.str( AV59SWEliminar, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV94Tran_Id", GXutil.ltrim( GXutil.str( AV94Tran_Id, 11, 0)));
         }
         else if ( AV59SWEliminar == 3 )
         {
            GXv_int2[0] = AV94Tran_Id ;
            GXv_int1[0] = 0 ;
            GXv_int3[0] = (short)(0) ;
            GXv_char4[0] = AV103TDet_PlacaRecuperada ;
            new com.orions2.entradevoelimi(remoteHandle, context).execute( AV59SWEliminar, GXv_int2, "", GXv_int1, GXv_int3, GXv_char4) ;
            wpcon_ent_dev_impl.this.AV94Tran_Id = GXv_int2[0] ;
            wpcon_ent_dev_impl.this.AV103TDet_PlacaRecuperada = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59SWEliminar", GXutil.ltrim( GXutil.str( AV59SWEliminar, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV94Tran_Id", GXutil.ltrim( GXutil.str( AV94Tran_Id, 11, 0)));
         }
         else if ( AV59SWEliminar == 4 )
         {
            GXv_int2[0] = AV94Tran_Id ;
            GXv_int1[0] = AV76TDet_Consecutivo ;
            GXv_int3[0] = (short)(0) ;
            GXv_char4[0] = AV103TDet_PlacaRecuperada ;
            new com.orions2.entradevoelimi(remoteHandle, context).execute( AV59SWEliminar, GXv_int2, AV30Elem_Consecutivo, GXv_int1, GXv_int3, GXv_char4) ;
            wpcon_ent_dev_impl.this.AV94Tran_Id = GXv_int2[0] ;
            wpcon_ent_dev_impl.this.AV76TDet_Consecutivo = GXv_int1[0] ;
            wpcon_ent_dev_impl.this.AV103TDet_PlacaRecuperada = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59SWEliminar", GXutil.ltrim( GXutil.str( AV59SWEliminar, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV94Tran_Id", GXutil.ltrim( GXutil.str( AV94Tran_Id, 11, 0)));
         }
         else if ( AV59SWEliminar == 5 )
         {
            GXv_int2[0] = AV94Tran_Id ;
            GXv_int1[0] = AV76TDet_Consecutivo ;
            GXv_int3[0] = (short)(0) ;
            GXv_char4[0] = AV103TDet_PlacaRecuperada ;
            new com.orions2.entradevoelimi(remoteHandle, context).execute( AV59SWEliminar, GXv_int2, AV30Elem_Consecutivo, GXv_int1, GXv_int3, GXv_char4) ;
            wpcon_ent_dev_impl.this.AV94Tran_Id = GXv_int2[0] ;
            wpcon_ent_dev_impl.this.AV76TDet_Consecutivo = GXv_int1[0] ;
            wpcon_ent_dev_impl.this.AV103TDet_PlacaRecuperada = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59SWEliminar", GXutil.ltrim( GXutil.str( AV59SWEliminar, 4, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV94Tran_Id", GXutil.ltrim( GXutil.str( AV94Tran_Id, 11, 0)));
         }
      }
      if ( AV68SWNuevoGrupo == 1 )
      {
         GXv_int2[0] = AV94Tran_Id ;
         new com.orions2.pnuegruentdev(remoteHandle, context).execute( GXv_int2) ;
         wpcon_ent_dev_impl.this.AV94Tran_Id = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94Tran_Id", GXutil.ltrim( GXutil.str( AV94Tran_Id, 11, 0)));
         Alertify1_Type = "success" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Los elementos fueron agrupados con éxito" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      if ( AV71SWRatificar == 1 )
      {
         AV50Respuesta = "0" ;
         GXv_int2[0] = AV94Tran_Id ;
         GXv_char4[0] = "RAT" ;
         GXv_char5[0] = "" ;
         GXv_char6[0] = AV97Usuario ;
         new com.orions2.pratifientdev(remoteHandle, context).execute( GXv_int2, GXv_char4, GXv_char5, GXv_char6) ;
         wpcon_ent_dev_impl.this.AV94Tran_Id = GXv_int2[0] ;
         wpcon_ent_dev_impl.this.AV97Usuario = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94Tran_Id", GXutil.ltrim( GXutil.str( AV94Tran_Id, 11, 0)));
         httpContext.ajax_rsp_assign_attri("", false, "AV97Usuario", AV97Usuario);
         GXv_int2[0] = AV94Tran_Id ;
         new com.orions2.wscorreotraspaso(remoteHandle, context).execute( GXv_int2) ;
         wpcon_ent_dev_impl.this.AV94Tran_Id = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94Tran_Id", GXutil.ltrim( GXutil.str( AV94Tran_Id, 11, 0)));
         AV9URL = formatLink("com.orions2.aptrascuen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV94Tran_Id,11,0))) ;
         AV102WindowsId = (short)(GXutil.random( )*100000) ;
         lblUrl_Caption = "<script language=\"JavaScript\">window.open(\""+GXutil.trim( AV9URL)+"\",\""+GXutil.trim( GXutil.str( AV102WindowsId, 10, 0))+"\",\"target=_top,top=10,left=10,width=600,height=500,scrollbars=yes,menubar=no,toolbar=no,resizable=yes,directories=no\");</script>" ;
         httpContext.ajax_rsp_assign_prop("", false, lblUrl_Internalname, "Caption", lblUrl_Caption, true);
         bttButton1_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttButton1_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton1_Visible, 5, 0)), true);
         bttButton2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttButton2_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton2_Visible, 5, 0)), true);
         bttButton3_Caption = "Salir" ;
         httpContext.ajax_rsp_assign_prop("", false, bttButton3_Internalname, "Caption", bttButton3_Caption, true);
      }
      AV42OPC = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
      httpContext.doAjaxRefresh();
   }

   public void e201V2( )
   {
      /* 'NuevoGrupo' Routine */
      AV68SWNuevoGrupo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68SWNuevoGrupo", GXutil.ltrim( GXutil.str( AV68SWNuevoGrupo, 4, 0)));
      AV71SWRatificar = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71SWRatificar", GXutil.ltrim( GXutil.str( AV71SWRatificar, 4, 0)));
      /* Execute user subroutine: 'VALIDARPADREGRUPO' */
      S232 ();
      if (returnInSub) return;
      if ( AV70SWPedreGrupo )
      {
         /* Execute user subroutine: 'VALIDARHIJOSGRUPO' */
         S242 ();
         if (returnInSub) return;
         if ( AV65SWHijoGrupo )
         {
            AV68SWNuevoGrupo = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68SWNuevoGrupo", GXutil.ltrim( GXutil.str( AV68SWNuevoGrupo, 4, 0)));
            Alertify1_Type = "confirm" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "¿Ya finalizó el registro de todos los elementos del grupo?" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
         else
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "ERROR... No se han registrado elementos tipo Hijo en este grupo.." ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
      }
      else
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "ERROR... No se han registrado elementos tipo Padre en este grupo.." ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
   }

   public void e211V2( )
   {
      /* 'RATIFICAR' Routine */
      AV64SWErrorRati = (short)(0) ;
      AV98valor = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98valor", GXutil.ltrim( GXutil.str( AV98valor, 18, 2)));
      AV68SWNuevoGrupo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68SWNuevoGrupo", GXutil.ltrim( GXutil.str( AV68SWNuevoGrupo, 4, 0)));
      AV59SWEliminar = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59SWEliminar", GXutil.ltrim( GXutil.str( AV59SWEliminar, 4, 0)));
      AV71SWRatificar = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71SWRatificar", GXutil.ltrim( GXutil.str( AV71SWRatificar, 4, 0)));
      /* Execute user subroutine: 'VALIDARRATIFICACION' */
      S252 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV87TipoEntrada, "UEUP") == 0 )
      {
         /* Execute user subroutine: 'VALIDARHIJOSGRUPODESAGRUPADOS' */
         S262 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'VALIDARHIJOSGRUPOAGRUPADOS' */
         S272 ();
         if (returnInSub) return;
         if ( ! AV67SWHijoGrupoDesagrupado )
         {
            AV64SWErrorRati = (short)(2) ;
         }
         if ( ! AV66SWHijoGrupoAgrupado )
         {
            AV64SWErrorRati = (short)(5) ;
         }
      }
      if ( GXutil.strcmp(AV87TipoEntrada, "NEUP") == 0 )
      {
         /* Execute user subroutine: 'VALIDARHIJOSGRUPODESAGRUPADOS' */
         S262 ();
         if (returnInSub) return;
         if ( ! AV67SWHijoGrupoDesagrupado )
         {
            AV64SWErrorRati = (short)(2) ;
         }
      }
      if ( AV64SWErrorRati == 2 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Error. No se registraron elementos tipo hijo" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else if ( AV64SWErrorRati == 1 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Error. Existen elementos con sus atributos en blanco" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else if ( AV64SWErrorRati == 0 )
      {
         Alertify1_Type = "confirm" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Está seguro de ratificar esta transacción por valor total de $"+localUtil.format( AV98valor, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")+" " ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else if ( AV64SWErrorRati == 4 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Error. No se han registrado elementos" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else if ( AV64SWErrorRati == 5 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Error. No se ha realizado el cierre del grupo" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
   }

   public void S232( )
   {
      /* 'VALIDARPADREGRUPO' Routine */
      AV70SWPedreGrupo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70SWPedreGrupo", AV70SWPedreGrupo);
      /* Using cursor H001V3 */
      pr_default.execute(1, new Object[] {new Long(AV94Tran_Id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A658TDet_Agrupado = H001V3_A658TDet_Agrupado[0] ;
         n658TDet_Agrupado = H001V3_n658TDet_Agrupado[0] ;
         A505TDet_EsPadre = H001V3_A505TDet_EsPadre[0] ;
         A46Tran_Id = H001V3_A46Tran_Id[0] ;
         AV70SWPedreGrupo = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70SWPedreGrupo", AV70SWPedreGrupo);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S272( )
   {
      /* 'VALIDARHIJOSGRUPOAGRUPADOS' Routine */
      AV66SWHijoGrupoAgrupado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66SWHijoGrupoAgrupado", AV66SWHijoGrupoAgrupado);
      AV69SWPadres = false ;
      /* Using cursor H001V4 */
      pr_default.execute(2, new Object[] {new Long(AV94Tran_Id)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A658TDet_Agrupado = H001V4_A658TDet_Agrupado[0] ;
         n658TDet_Agrupado = H001V4_n658TDet_Agrupado[0] ;
         A505TDet_EsPadre = H001V4_A505TDet_EsPadre[0] ;
         A46Tran_Id = H001V4_A46Tran_Id[0] ;
         AV69SWPadres = true ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV69SWPadres )
      {
         /* Using cursor H001V5 */
         pr_default.execute(3, new Object[] {new Long(AV94Tran_Id)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A658TDet_Agrupado = H001V5_A658TDet_Agrupado[0] ;
            n658TDet_Agrupado = H001V5_n658TDet_Agrupado[0] ;
            A505TDet_EsPadre = H001V5_A505TDet_EsPadre[0] ;
            A46Tran_Id = H001V5_A46Tran_Id[0] ;
            AV66SWHijoGrupoAgrupado = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66SWHijoGrupoAgrupado", AV66SWHijoGrupoAgrupado);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
   }

   public void S262( )
   {
      /* 'VALIDARHIJOSGRUPODESAGRUPADOS' Routine */
      AV67SWHijoGrupoDesagrupado = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67SWHijoGrupoDesagrupado", AV67SWHijoGrupoDesagrupado);
      AV69SWPadres = false ;
      AV112GXLvl398 = (byte)(0) ;
      /* Using cursor H001V6 */
      pr_default.execute(4, new Object[] {new Long(AV94Tran_Id)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A658TDet_Agrupado = H001V6_A658TDet_Agrupado[0] ;
         n658TDet_Agrupado = H001V6_n658TDet_Agrupado[0] ;
         A505TDet_EsPadre = H001V6_A505TDet_EsPadre[0] ;
         A46Tran_Id = H001V6_A46Tran_Id[0] ;
         AV112GXLvl398 = (byte)(1) ;
         AV69SWPadres = true ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV112GXLvl398 == 0 )
      {
         AV67SWHijoGrupoDesagrupado = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67SWHijoGrupoDesagrupado", AV67SWHijoGrupoDesagrupado);
      }
      if ( AV69SWPadres )
      {
         /* Using cursor H001V7 */
         pr_default.execute(5, new Object[] {new Long(AV94Tran_Id)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A658TDet_Agrupado = H001V7_A658TDet_Agrupado[0] ;
            n658TDet_Agrupado = H001V7_n658TDet_Agrupado[0] ;
            A505TDet_EsPadre = H001V7_A505TDet_EsPadre[0] ;
            A46Tran_Id = H001V7_A46Tran_Id[0] ;
            AV67SWHijoGrupoDesagrupado = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67SWHijoGrupoDesagrupado", AV67SWHijoGrupoDesagrupado);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
   }

   public void S242( )
   {
      /* 'VALIDARHIJOSGRUPO' Routine */
      AV65SWHijoGrupo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65SWHijoGrupo", AV65SWHijoGrupo);
      /* Using cursor H001V8 */
      pr_default.execute(6, new Object[] {new Long(AV94Tran_Id)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A658TDet_Agrupado = H001V8_A658TDet_Agrupado[0] ;
         n658TDet_Agrupado = H001V8_n658TDet_Agrupado[0] ;
         A505TDet_EsPadre = H001V8_A505TDet_EsPadre[0] ;
         A46Tran_Id = H001V8_A46Tran_Id[0] ;
         AV65SWHijoGrupo = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65SWHijoGrupo", AV65SWHijoGrupo);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S112( )
   {
      /* 'DATOSGENERALES' Routine */
      /* Execute user subroutine: 'DATOSTRANSACCION' */
      S282 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'DATOSTRANSACCIONDETALLE' */
      S292 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV95Tran_TipoEntra, "") == 0 )
      {
         cmbavTipoentrada.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipoentrada.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavTipoentrada.getEnabled(), 5, 0)), true);
      }
      else
      {
         if ( AV57SWDeTr == 0 )
         {
            cmbavTipoentrada.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavTipoentrada.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavTipoentrada.getEnabled(), 5, 0)), true);
         }
         else
         {
            AV87TipoEntrada = AV95Tran_TipoEntra ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TipoEntrada", AV87TipoEntrada);
            cmbavTipoentrada.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, cmbavTipoentrada.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavTipoentrada.getEnabled(), 5, 0)), true);
         }
      }
      /* Execute user subroutine: 'INICIARCATEGORIA' */
      S122 ();
      if (returnInSub) return;
   }

   public void S282( )
   {
      /* 'DATOSTRANSACCION' Routine */
      /* Using cursor H001V9 */
      pr_default.execute(7, new Object[] {new Long(AV94Tran_Id)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A46Tran_Id = H001V9_A46Tran_Id[0] ;
         A48Tran_CentroCostoId = H001V9_A48Tran_CentroCostoId[0] ;
         A527Tran_TipoEntra = H001V9_A527Tran_TipoEntra[0] ;
         n527Tran_TipoEntra = H001V9_n527Tran_TipoEntra[0] ;
         A499Tran_CodTipoElemento = H001V9_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = H001V9_n499Tran_CodTipoElemento[0] ;
         A483Tran_ValorTransaccion = H001V9_A483Tran_ValorTransaccion[0] ;
         n483Tran_ValorTransaccion = H001V9_n483Tran_ValorTransaccion[0] ;
         A49Tran_CodigoMovimiento = H001V9_A49Tran_CodigoMovimiento[0] ;
         A513Tran_ConsecutivoCC = H001V9_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = H001V9_n513Tran_ConsecutivoCC[0] ;
         A55Tran_FechaRegistro = H001V9_A55Tran_FechaRegistro[0] ;
         A56Tran_IdCuentadanteResponsabili = H001V9_A56Tran_IdCuentadanteResponsabili[0] ;
         n56Tran_IdCuentadanteResponsabili = H001V9_n56Tran_IdCuentadanteResponsabili[0] ;
         A719Tran_TransaccResponsabilidad = H001V9_A719Tran_TransaccResponsabilidad[0] ;
         n719Tran_TransaccResponsabilidad = H001V9_n719Tran_TransaccResponsabilidad[0] ;
         A720Tran_FechaResponsabilidad = H001V9_A720Tran_FechaResponsabilidad[0] ;
         n720Tran_FechaResponsabilidad = H001V9_n720Tran_FechaResponsabilidad[0] ;
         A758Tran_TablaResponsabilidad = H001V9_A758Tran_TablaResponsabilidad[0] ;
         n758Tran_TablaResponsabilidad = H001V9_n758Tran_TablaResponsabilidad[0] ;
         A499Tran_CodTipoElemento = H001V9_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = H001V9_n499Tran_CodTipoElemento[0] ;
         AV89Tran_CentroCostoId = A48Tran_CentroCostoId ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV89Tran_CentroCostoId, 11, 0)));
         AV95Tran_TipoEntra = A527Tran_TipoEntra ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Tran_TipoEntra", AV95Tran_TipoEntra);
         AV91Tran_CodTipoElemento = A499Tran_CodTipoElemento ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91Tran_CodTipoElemento", GXutil.ltrim( GXutil.str( AV91Tran_CodTipoElemento, 18, 0)));
         AV96Tran_ValorTransaccion = A483Tran_ValorTransaccion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV96Tran_ValorTransaccion, 18, 2)));
         AV90Tran_CodigoMovimiento = A49Tran_CodigoMovimiento ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90Tran_CodigoMovimiento", AV90Tran_CodigoMovimiento);
         AV92Tran_ConsecutivoCC = A513Tran_ConsecutivoCC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV92Tran_ConsecutivoCC, 18, 0)));
         AV93Tran_FechaRegistro = A55Tran_FechaRegistro ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Tran_FechaRegistro", localUtil.ttoc( AV93Tran_FechaRegistro, 8, 5, 0, 3, "/", ":", " "));
         AV6Tran_IdCuentadanteResponsabilidad = A56Tran_IdCuentadanteResponsabili ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Tran_IdCuentadanteResponsabilidad", GXutil.ltrim( GXutil.str( AV6Tran_IdCuentadanteResponsabilidad, 18, 0)));
         AV8Tran_TransaccResponsabilidad = A719Tran_TransaccResponsabilidad ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Tran_TransaccResponsabilidad", GXutil.ltrim( GXutil.str( AV8Tran_TransaccResponsabilidad, 11, 0)));
         AV5Tran_FechaResponsabilidad = A720Tran_FechaResponsabilidad ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Tran_FechaResponsabilidad", localUtil.format(AV5Tran_FechaResponsabilidad, "99/99/99"));
         AV7Tran_TablaResponsabilidad = A758Tran_TablaResponsabilidad ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Tran_TablaResponsabilidad", GXutil.ltrim( GXutil.str( AV7Tran_TablaResponsabilidad, 4, 0)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S292( )
   {
      /* 'DATOSTRANSACCIONDETALLE' Routine */
      AV57SWDeTr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57SWDeTr", GXutil.ltrim( GXutil.str( AV57SWDeTr, 4, 0)));
      /* Using cursor H001V10 */
      pr_default.execute(8, new Object[] {new Long(AV94Tran_Id)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A46Tran_Id = H001V10_A46Tran_Id[0] ;
         A69TDet_Consecutivo = H001V10_A69TDet_Consecutivo[0] ;
         AV57SWDeTr = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57SWDeTr", GXutil.ltrim( GXutil.str( AV57SWDeTr, 4, 0)));
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S122( )
   {
      /* 'INICIARCATEGORIA' Routine */
      if ( GXutil.strcmp(AV87TipoEntrada, "UEUP") == 0 )
      {
         cmbavCat_bien.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCat_bien.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavCat_bien.getVisible(), 5, 0)), true);
         bttNuevogrupo_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttNuevogrupo_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttNuevogrupo_Visible, 5, 0)), true);
         cmbavCat_bien.removeAllItems();
         cmbavCat_bien.addItem("SI", "PADRE", (short)(1));
         cmbavCat_bien.addItem("NO", "HIJO", (short)(2));
         cmbavCat_bien.addItem("NA", "INDEPENDIENTE", (short)(3));
      }
      else if ( GXutil.strcmp(AV87TipoEntrada, "NEUP") == 0 )
      {
         cmbavCat_bien.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCat_bien.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavCat_bien.getVisible(), 5, 0)), true);
         bttNuevogrupo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttNuevogrupo_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttNuevogrupo_Visible, 5, 0)), true);
         cmbavCat_bien.removeAllItems();
         cmbavCat_bien.addItem("SI", "PADRE", (short)(1));
         cmbavCat_bien.addItem("NO", "HIJO", (short)(2));
      }
      else if ( GXutil.strcmp(AV87TipoEntrada, "ELSP") == 0 )
      {
         cmbavCat_bien.setVisible( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCat_bien.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavCat_bien.getVisible(), 5, 0)), true);
         bttNuevogrupo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttNuevogrupo_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttNuevogrupo_Visible, 5, 0)), true);
         cmbavCat_bien.removeAllItems();
         cmbavCat_bien.addItem("NA", "NO APLICA", (short)(1));
      }
      else if ( GXutil.strcmp(AV87TipoEntrada, "") == 0 )
      {
         cmbavCat_bien.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCat_bien.getInternalname(), "Visible", GXutil.ltrim( GXutil.str( cmbavCat_bien.getVisible(), 5, 0)), true);
         bttNuevogrupo_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttNuevogrupo_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttNuevogrupo_Visible, 5, 0)), true);
         cmbavCat_bien.removeAllItems();
         cmbavCat_bien.addItem("SE", "SELECCIONAR", (short)(1));
      }
   }

   public void S202( )
   {
      /* 'CALCULARDESMANTELAMIENTO' Routine */
      AV10A = DecimalUtil.doubleToDec(1+(AV37I/ (double) (100))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40N", GXutil.ltrim( GXutil.str( AV40N, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV100VF", GXutil.ltrim( GXutil.str( AV100VF, 18, 2)));
      /* User Code */
       java.math.BigDecimal a = AV10A;
      /* User Code */
       double _b 	= AV40N;
      /* User Code */
       double _a 	= a.doubleValue();
      /* User Code */
       double _c 	= java.lang.Math.pow(_a,_b);
      /* User Code */
       AV13C 	=  new java.math.BigDecimal(_c);
      httpContext.ajax_rsp_assign_attri("", false, "AV13C", GXutil.ltrim( GXutil.str( AV13C, 18, 2)));
      AV27Costo_Desmantelamiento = AV100VF.divide(AV13C, 18, java.math.BigDecimal.ROUND_DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Costo_Desmantelamiento", GXutil.ltrim( GXutil.str( AV27Costo_Desmantelamiento, 18, 2)));
   }

   public void S132( )
   {
      /* 'VALIDAR' Routine */
      AV62SWError = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62SWError", GXutil.ltrim( GXutil.str( AV62SWError, 4, 0)));
      if ( (GXutil.strcmp("", AV87TipoEntrada)==0) )
      {
         AV62SWError = (short)(5) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62SWError", GXutil.ltrim( GXutil.str( AV62SWError, 4, 0)));
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "ERROR.. Debe seleccionar el Tipo de Entrada." ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else
      {
         if ( ( GXutil.strcmp(AV86TIP_Codigo, "") == 0 ) || ( GXutil.strcmp(AV56SEG_Codigo, "") == 0 ) || ( GXutil.strcmp(AV33FAM_Codigo, "") == 0 ) || ( GXutil.strcmp(AV21Clas_Codigo, "") == 0 ) || ( GXutil.strcmp(AV16Cata_Codigo, "") == 0 ) || ( AV14Cantidad == 0 ) || ( AV14Cantidad <= 0 ) || ( DecimalUtil.compareTo(AV99ValorUnitario, DecimalUtil.ZERO) == 0 ) )
         {
            AV62SWError = (short)(5) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62SWError", GXutil.ltrim( GXutil.str( AV62SWError, 4, 0)));
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "ERROR.. Los campos con (*) son obligatorios." ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
      }
   }

   public void S302( )
   {
      /* 'CONSULTAELEMETOPADREUEUP' Routine */
      AV61SWErroPadreHijo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61SWErroPadreHijo", AV61SWErroPadreHijo);
      /* Using cursor H001V11 */
      pr_default.execute(9, new Object[] {new Long(AV94Tran_Id), AV19cElem_Consecutivo});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A658TDet_Agrupado = H001V11_A658TDet_Agrupado[0] ;
         n658TDet_Agrupado = H001V11_n658TDet_Agrupado[0] ;
         A505TDet_EsPadre = H001V11_A505TDet_EsPadre[0] ;
         A66Elem_Consecutivo = H001V11_A66Elem_Consecutivo[0] ;
         A46Tran_Id = H001V11_A46Tran_Id[0] ;
         A69TDet_Consecutivo = H001V11_A69TDet_Consecutivo[0] ;
         AV61SWErroPadreHijo = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61SWErroPadreHijo", AV61SWErroPadreHijo);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void S142( )
   {
      /* 'AGREGARBIENUEUP' Routine */
      if ( GXutil.strcmp(AV15Cat_Bien, "SI") == 0 )
      {
         /* Execute user subroutine: 'CONSULTAELEMETOPADREUEUP' */
         S302 ();
         if (returnInSub) return;
         if ( ! AV61SWErroPadreHijo )
         {
            /* Execute user subroutine: 'VALIDARBIENADMINISTRACION' */
            S162 ();
            if (returnInSub) return;
            if ( AV47pRespuesta )
            {
               /* Execute user subroutine: 'AGREGARPADREUEUP' */
               S312 ();
               if (returnInSub) return;
               /* Execute user subroutine: 'BORRARDATOS' */
               S182 ();
               if (returnInSub) return;
               AV42OPC = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
               httpContext.doAjaxRefresh();
            }
            else
            {
               Alertify1_Type = "error" ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
               Alertify1_Textmessage = "Error.. El bien no cumple con el valor mínimo para el ingreso" ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
               this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            }
         }
         else
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "ERROR.. Ya existe el registro de un elemento tipo Padre." ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
      }
      else if ( GXutil.strcmp(AV15Cat_Bien, "NO") == 0 )
      {
         /* Execute user subroutine: 'BUSCARPADRENEUP' */
         S322 ();
         if (returnInSub) return;
         if ( AV60SWErroPadre )
         {
            /* Execute user subroutine: 'CONSULTAELEMETOPADREUEUP' */
            S302 ();
            if (returnInSub) return;
            if ( ! AV61SWErroPadreHijo )
            {
               /* Execute user subroutine: 'VALIDARCANTIDADPADRESUEUP' */
               S332 ();
               if (returnInSub) return;
               if ( AV63SWErrorPadre == 1 )
               {
                  Alertify1_Type = "error" ;
                  httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
                  Alertify1_Textmessage = "ERROR. La cantidad de Hijos debe ser igual a la cantidad de Padres" ;
                  httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
                  this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
               }
               else
               {
                  /* Execute user subroutine: 'AGREGARHIJOUEUP' */
                  S342 ();
                  if (returnInSub) return;
                  /* Execute user subroutine: 'BORRARDATOS' */
                  S182 ();
                  if (returnInSub) return;
                  AV42OPC = (short)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
                  httpContext.doAjaxRefresh();
               }
            }
            else
            {
               Alertify1_Type = "error" ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
               Alertify1_Textmessage = "ERROR.. Ya existe el registro de este elemento tipo Padre" ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
               this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            }
         }
         else
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "ERROR.. No existe el registro de elementos tipo Padre." ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
      }
      else if ( GXutil.strcmp(AV15Cat_Bien, "NA") == 0 )
      {
         /* Execute user subroutine: 'VALIDARBIENADMINISTRACION' */
         S162 ();
         if (returnInSub) return;
         if ( AV47pRespuesta )
         {
            /* Execute user subroutine: 'AGREGARINDEPENDIENTEUEUP' */
            S352 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'BORRARDATOS' */
            S182 ();
            if (returnInSub) return;
            AV42OPC = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
            httpContext.doAjaxRefresh();
         }
         else
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Error.. El bien no cumple con el valor mínimo para el ingreso" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
      }
   }

   public void S312( )
   {
      /* 'AGREGARPADREUEUP' Routine */
      AV38Index = (short)(1) ;
      while ( AV38Index <= AV14Cantidad )
      {
         GXv_char6[0] = "PLACA" ;
         GXv_int2[0] = AV89Tran_CentroCostoId ;
         GXv_char5[0] = AV23Cons_Numero ;
         new com.orions2.cons_tran_pla(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_char5) ;
         wpcon_ent_dev_impl.this.AV89Tran_CentroCostoId = GXv_int2[0] ;
         wpcon_ent_dev_impl.this.AV23Cons_Numero = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV89Tran_CentroCostoId, 11, 0)));
         /* Execute user subroutine: 'CONSULTAULTIMOCONSE' */
         S362 ();
         if (returnInSub) return;
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tran_id( AV94Tran_Id );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_consecutivo( (long)(AV29cTDet_Consecutivo+1) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Elem_consecutivo( AV19cElem_Consecutivo );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_cantidad( 1 );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valorunitario( AV99ValorUnitario );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valortotal( AV88Total_Costos );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placanumero( GXutil.trim( AV23Cons_Numero) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( "" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_espadre( "SI" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_atributos( "NO" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_presente( AV27Costo_Desmantelamiento.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_futuro( AV100VF );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_taza( AV37I );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_plazo_n( (byte)(AV40N) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_otros_costos( AV43Otros_Costos.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_agrupado( (short)(0) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada( AV45PlacaRecuperada );
         GXv_SdtSDTDetalleTrn7[0] = AV54SDTDetalleTrn;
         GXv_char6[0] = AV87TipoEntrada ;
         new com.orions2.pentradevo(remoteHandle, context).execute( GXv_SdtSDTDetalleTrn7, GXv_char6) ;
         AV54SDTDetalleTrn = GXv_SdtSDTDetalleTrn7[0] ;
         wpcon_ent_dev_impl.this.AV87TipoEntrada = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87TipoEntrada", AV87TipoEntrada);
         AV38Index = (short)(AV38Index+1) ;
      }
      AV42OPC = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
      httpContext.popup(formatLink("com.orions2.wpatributosdev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV94Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV19cElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim("INS")), new Object[] {"AV94Tran_Id",});
   }

   public void S352( )
   {
      /* 'AGREGARINDEPENDIENTEUEUP' Routine */
      AV38Index = (short)(1) ;
      while ( AV38Index <= AV14Cantidad )
      {
         GXv_char6[0] = "PLACA" ;
         GXv_int2[0] = AV89Tran_CentroCostoId ;
         GXv_char5[0] = AV23Cons_Numero ;
         new com.orions2.cons_tran_pla(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_char5) ;
         wpcon_ent_dev_impl.this.AV89Tran_CentroCostoId = GXv_int2[0] ;
         wpcon_ent_dev_impl.this.AV23Cons_Numero = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV89Tran_CentroCostoId, 11, 0)));
         /* Execute user subroutine: 'CONSULTAULTIMOCONSE' */
         S362 ();
         if (returnInSub) return;
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tran_id( AV94Tran_Id );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_consecutivo( (long)(AV29cTDet_Consecutivo+1) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Elem_consecutivo( AV19cElem_Consecutivo );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_cantidad( 1 );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valorunitario( AV99ValorUnitario );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valortotal( AV88Total_Costos );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placanumero( GXutil.trim( AV23Cons_Numero) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( "" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_espadre( "NA" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_atributos( "NO" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_presente( AV27Costo_Desmantelamiento.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_futuro( AV100VF );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_taza( AV37I );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_plazo_n( (byte)(AV40N) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_otros_costos( AV43Otros_Costos.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_agrupado( (short)(-1) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada( AV45PlacaRecuperada );
         GXv_SdtSDTDetalleTrn7[0] = AV54SDTDetalleTrn;
         GXv_char6[0] = AV87TipoEntrada ;
         new com.orions2.pentradevo(remoteHandle, context).execute( GXv_SdtSDTDetalleTrn7, GXv_char6) ;
         AV54SDTDetalleTrn = GXv_SdtSDTDetalleTrn7[0] ;
         wpcon_ent_dev_impl.this.AV87TipoEntrada = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87TipoEntrada", AV87TipoEntrada);
         AV38Index = (short)(AV38Index+1) ;
      }
      AV42OPC = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
      httpContext.popup(formatLink("com.orions2.wpatributosdev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV94Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV19cElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim("INS")), new Object[] {"AV94Tran_Id",});
   }

   public void S342( )
   {
      /* 'AGREGARHIJOUEUP' Routine */
      AV48pTDet_Consecutivo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48pTDet_Consecutivo", GXutil.ltrim( GXutil.str( AV48pTDet_Consecutivo, 18, 0)));
      AV38Index = (short)(1) ;
      while ( AV38Index <= AV14Cantidad )
      {
         GXv_char6[0] = "PLACA" ;
         GXv_int2[0] = AV89Tran_CentroCostoId ;
         GXv_char5[0] = AV23Cons_Numero ;
         new com.orions2.cons_tran_pla(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_char5) ;
         wpcon_ent_dev_impl.this.AV89Tran_CentroCostoId = GXv_int2[0] ;
         wpcon_ent_dev_impl.this.AV23Cons_Numero = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV89Tran_CentroCostoId, 11, 0)));
         /* Execute user subroutine: 'CONSULTAULTIMOCONSE' */
         S362 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'BUSCARPLACAPADREUEUP' */
         S372 ();
         if (returnInSub) return;
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tran_id( AV94Tran_Id );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_consecutivo( (long)(AV29cTDet_Consecutivo+1) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Elem_consecutivo( AV19cElem_Consecutivo );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_cantidad( 1 );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valorunitario( AV99ValorUnitario );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valortotal( AV88Total_Costos );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placanumero( GXutil.trim( AV23Cons_Numero) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( GXutil.trim( AV49pTDet_PlacaPadre) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_espadre( "NO" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_atributos( "NO" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_presente( AV27Costo_Desmantelamiento.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_futuro( AV100VF );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_taza( AV37I );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_plazo_n( (byte)(AV40N) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_otros_costos( AV43Otros_Costos.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_agrupado( (short)(0) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada( AV45PlacaRecuperada );
         GXv_SdtSDTDetalleTrn7[0] = AV54SDTDetalleTrn;
         GXv_char6[0] = AV87TipoEntrada ;
         new com.orions2.pentradevo(remoteHandle, context).execute( GXv_SdtSDTDetalleTrn7, GXv_char6) ;
         AV54SDTDetalleTrn = GXv_SdtSDTDetalleTrn7[0] ;
         wpcon_ent_dev_impl.this.AV87TipoEntrada = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87TipoEntrada", AV87TipoEntrada);
         AV38Index = (short)(AV38Index+1) ;
      }
      AV42OPC = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
      httpContext.popup(formatLink("com.orions2.wpatributosdev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV94Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV19cElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim("INS")), new Object[] {"AV94Tran_Id",});
   }

   public void S372( )
   {
      /* 'BUSCARPLACAPADREUEUP' Routine */
      /* Using cursor H001V12 */
      pr_default.execute(10, new Object[] {new Long(AV94Tran_Id), new Long(AV48pTDet_Consecutivo)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A69TDet_Consecutivo = H001V12_A69TDet_Consecutivo[0] ;
         A658TDet_Agrupado = H001V12_A658TDet_Agrupado[0] ;
         n658TDet_Agrupado = H001V12_n658TDet_Agrupado[0] ;
         A505TDet_EsPadre = H001V12_A505TDet_EsPadre[0] ;
         A46Tran_Id = H001V12_A46Tran_Id[0] ;
         A490TDet_PlacaNumero = H001V12_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = H001V12_n490TDet_PlacaNumero[0] ;
         AV49pTDet_PlacaPadre = A490TDet_PlacaNumero ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49pTDet_PlacaPadre", AV49pTDet_PlacaPadre);
         AV48pTDet_Consecutivo = A69TDet_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48pTDet_Consecutivo", GXutil.ltrim( GXutil.str( AV48pTDet_Consecutivo, 18, 0)));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S332( )
   {
      /* 'VALIDARCANTIDADPADRESUEUP' Routine */
      AV63SWErrorPadre = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63SWErrorPadre", GXutil.ltrim( GXutil.str( AV63SWErrorPadre, 4, 0)));
      AV25ContadorPadres = (short)(0) ;
      /* Optimized group. */
      /* Using cursor H001V13 */
      pr_default.execute(11, new Object[] {new Long(AV94Tran_Id)});
      cV25ContadorPadres = H001V13_AV25ContadorPadres[0] ;
      pr_default.close(11);
      AV25ContadorPadres = (short)(AV25ContadorPadres+cV25ContadorPadres*1) ;
      /* End optimized group. */
      if ( AV25ContadorPadres != AV14Cantidad )
      {
         AV63SWErrorPadre = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63SWErrorPadre", GXutil.ltrim( GXutil.str( AV63SWErrorPadre, 4, 0)));
      }
   }

   public void S152( )
   {
      /* 'AGREGARBIENNEUP' Routine */
      if ( GXutil.strcmp(AV15Cat_Bien, "SI") == 0 )
      {
         if ( AV14Cantidad > 1 )
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "ERROR.. La cantidad debe ser igual a 1." ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
         else
         {
            /* Execute user subroutine: 'BUSCARPADRENEUP' */
            S322 ();
            if (returnInSub) return;
            if ( AV60SWErroPadre )
            {
               Alertify1_Type = "error" ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
               Alertify1_Textmessage = "ERROR.. Ya existe el registro de un elemento tipo Padre." ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
               this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            }
            else
            {
               /* Execute user subroutine: 'VALIDARBIENADMINISTRACION' */
               S162 ();
               if (returnInSub) return;
               if ( AV47pRespuesta )
               {
                  /* Execute user subroutine: 'AGREGARPADRENEUP' */
                  S382 ();
                  if (returnInSub) return;
                  /* Execute user subroutine: 'BORRARDATOS' */
                  S182 ();
                  if (returnInSub) return;
                  AV42OPC = (short)(1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
                  httpContext.doAjaxRefresh();
               }
               else
               {
                  Alertify1_Type = "error" ;
                  httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
                  Alertify1_Textmessage = "Error.. El bien no cumple con el valor mínimo para el ingreso" ;
                  httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
                  this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
               }
            }
         }
      }
      else if ( GXutil.strcmp(AV15Cat_Bien, "NO") == 0 )
      {
         /* Execute user subroutine: 'BUSCARPADRENEUP' */
         S322 ();
         if (returnInSub) return;
         if ( AV60SWErroPadre )
         {
            /* Execute user subroutine: 'CONSULTAELEMETOPADRE' */
            S392 ();
            if (returnInSub) return;
            if ( AV61SWErroPadreHijo )
            {
               Alertify1_Type = "error" ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
               Alertify1_Textmessage = "ERROR.. Ya existe un registro de este elemento como tipo Padre." ;
               httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
               this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
            }
            else
            {
               /* Execute user subroutine: 'AGREGARHIJONEUP' */
               S402 ();
               if (returnInSub) return;
               /* Execute user subroutine: 'BORRARDATOS' */
               S182 ();
               if (returnInSub) return;
               AV42OPC = (short)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
               httpContext.doAjaxRefresh();
            }
         }
         else
         {
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "ERROR.. No existe el registro de un elemento tipo Padre." ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
      }
   }

   public void S322( )
   {
      /* 'BUSCARPADRENEUP' Routine */
      AV60SWErroPadre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60SWErroPadre", AV60SWErroPadre);
      /* Using cursor H001V14 */
      pr_default.execute(12, new Object[] {new Long(AV94Tran_Id)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A505TDet_EsPadre = H001V14_A505TDet_EsPadre[0] ;
         A46Tran_Id = H001V14_A46Tran_Id[0] ;
         AV60SWErroPadre = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60SWErroPadre", AV60SWErroPadre);
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S382( )
   {
      /* 'AGREGARPADRENEUP' Routine */
      GXv_char6[0] = "PLACA" ;
      GXv_int2[0] = AV89Tran_CentroCostoId ;
      GXv_char5[0] = AV23Cons_Numero ;
      new com.orions2.cons_tran_pla(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_char5) ;
      wpcon_ent_dev_impl.this.AV89Tran_CentroCostoId = GXv_int2[0] ;
      wpcon_ent_dev_impl.this.AV23Cons_Numero = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV89Tran_CentroCostoId, 11, 0)));
      /* Execute user subroutine: 'CONSULTAULTIMOCONSE' */
      S362 ();
      if (returnInSub) return;
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tran_id( AV94Tran_Id );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_consecutivo( (long)(AV29cTDet_Consecutivo+1) );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Elem_consecutivo( AV19cElem_Consecutivo );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_cantidad( AV14Cantidad );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valorunitario( AV99ValorUnitario );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valortotal( AV88Total_Costos );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placanumero( GXutil.trim( AV23Cons_Numero) );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( "" );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_espadre( "SI" );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_atributos( "NO" );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_presente( AV27Costo_Desmantelamiento.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_futuro( AV100VF );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_taza( AV37I );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_plazo_n( (byte)(AV40N) );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_otros_costos( AV43Otros_Costos.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_agrupado( (short)(-1) );
      AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada( AV45PlacaRecuperada );
      GXv_SdtSDTDetalleTrn7[0] = AV54SDTDetalleTrn;
      GXv_char6[0] = AV87TipoEntrada ;
      new com.orions2.pentradevo(remoteHandle, context).execute( GXv_SdtSDTDetalleTrn7, GXv_char6) ;
      AV54SDTDetalleTrn = GXv_SdtSDTDetalleTrn7[0] ;
      wpcon_ent_dev_impl.this.AV87TipoEntrada = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TipoEntrada", AV87TipoEntrada);
      AV42OPC = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
      httpContext.popup(formatLink("com.orions2.wpatributosdev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV94Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV19cElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim("INS")), new Object[] {"AV94Tran_Id",});
   }

   public void S212( )
   {
      /* 'ELIMINARBIENUEUP' Routine */
      if ( GXutil.strcmp(AV77TDet_EsPadre, "SI") == 0 )
      {
         AV59SWEliminar = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59SWEliminar", GXutil.ltrim( GXutil.str( AV59SWEliminar, 4, 0)));
         Alertify1_Type = "confirm" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Este bien es de tipo Padre, se borrarán todos los registros asociados. ¿Desea continuar?" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else if ( GXutil.strcmp(AV77TDet_EsPadre, "NO") == 0 )
      {
         AV59SWEliminar = (short)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59SWEliminar", GXutil.ltrim( GXutil.str( AV59SWEliminar, 4, 0)));
         Alertify1_Type = "confirm" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Este bien es de tipo hijo, Se borrarán todos los registros de este bien. ¿Desea continuar?" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else if ( GXutil.strcmp(AV77TDet_EsPadre, "NA") == 0 )
      {
         AV59SWEliminar = (short)(4) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59SWEliminar", GXutil.ltrim( GXutil.str( AV59SWEliminar, 4, 0)));
         Alertify1_Type = "confirm" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "¿Está seguro de eliminar este bien de la lista?" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
   }

   public void S222( )
   {
      /* 'ELIMINARBIENNEUP' Routine */
      if ( GXutil.strcmp(AV77TDet_EsPadre, "SI") == 0 )
      {
         AV59SWEliminar = (short)(3) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59SWEliminar", GXutil.ltrim( GXutil.str( AV59SWEliminar, 4, 0)));
         Alertify1_Type = "confirm" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Este bien es de tipo Padre, se borrarán todos los registros. ¿Desea continuar?" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
      else
      {
         AV59SWEliminar = (short)(4) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59SWEliminar", GXutil.ltrim( GXutil.str( AV59SWEliminar, 4, 0)));
         Alertify1_Type = "confirm" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "¿Está seguro de eliminar este bien de la lista?" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
      }
   }

   public void S182( )
   {
      /* 'BORRARDATOS' Routine */
      AV15Cat_Bien = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Cat_Bien", AV15Cat_Bien);
      AV19cElem_Consecutivo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19cElem_Consecutivo", AV19cElem_Consecutivo);
      AV18cCata_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18cCata_Descripcion", AV18cCata_Descripcion);
      AV20cElem_Descripcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20cElem_Descripcion", AV20cElem_Descripcion);
      AV14Cantidad = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Cantidad", GXutil.ltrim( GXutil.str( AV14Cantidad, 10, 0)));
      AV99ValorUnitario = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99ValorUnitario", GXutil.ltrim( GXutil.str( AV99ValorUnitario, 18, 2)));
      AV41Observaciones = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Observaciones", AV41Observaciones);
      AV88Total_Costos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Total_Costos", GXutil.ltrim( GXutil.str( AV88Total_Costos, 18, 2)));
      AV26Costo_Adquisicion = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Costo_Adquisicion", GXutil.ltrim( GXutil.str( AV26Costo_Adquisicion, 18, 2)));
      AV43Otros_Costos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Otros_Costos", GXutil.ltrim( GXutil.str( AV43Otros_Costos, 18, 2)));
      AV27Costo_Desmantelamiento = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Costo_Desmantelamiento", GXutil.ltrim( GXutil.str( AV27Costo_Desmantelamiento, 18, 2)));
      AV100VF = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100VF", GXutil.ltrim( GXutil.str( AV100VF, 18, 2)));
      AV37I = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37I", GXutil.ltrim( GXutil.str( AV37I, 3, 0)));
      AV40N = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40N", GXutil.ltrim( GXutil.str( AV40N, 4, 0)));
      cmbavTipoentrada.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTipoentrada.getInternalname(), "Enabled", GXutil.ltrim( GXutil.str( cmbavTipoentrada.getEnabled(), 5, 0)), true);
      AV45PlacaRecuperada = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45PlacaRecuperada", AV45PlacaRecuperada);
   }

   public void S192( )
   {
      /* 'BUSCAELEMENTO' Routine */
      /* Using cursor H001V15 */
      pr_default.execute(13, new Object[] {AV19cElem_Consecutivo, new Long(AV91Tran_CodTipoElemento)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A33Tipo_Codigo = H001V15_A33Tipo_Codigo[0] ;
         A66Elem_Consecutivo = H001V15_A66Elem_Consecutivo[0] ;
         A557Elem_Descripcion = H001V15_A557Elem_Descripcion[0] ;
         A74TIP_Codigo = H001V15_A74TIP_Codigo[0] ;
         A75SEG_Codigo = H001V15_A75SEG_Codigo[0] ;
         A298Cata_Descripcion = H001V15_A298Cata_Descripcion[0] ;
         A35FAM_Codigo = H001V15_A35FAM_Codigo[0] ;
         A34Clas_Codigo = H001V15_A34Clas_Codigo[0] ;
         A37Cata_Codigo = H001V15_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H001V15_A298Cata_Descripcion[0] ;
         A34Clas_Codigo = H001V15_A34Clas_Codigo[0] ;
         A35FAM_Codigo = H001V15_A35FAM_Codigo[0] ;
         A75SEG_Codigo = H001V15_A75SEG_Codigo[0] ;
         A74TIP_Codigo = H001V15_A74TIP_Codigo[0] ;
         AV20cElem_Descripcion = A557Elem_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20cElem_Descripcion", AV20cElem_Descripcion);
         AV86TIP_Codigo = A74TIP_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86TIP_Codigo", AV86TIP_Codigo);
         AV56SEG_Codigo = A75SEG_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56SEG_Codigo", AV56SEG_Codigo);
         AV18cCata_Descripcion = A298Cata_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18cCata_Descripcion", AV18cCata_Descripcion);
         AV33FAM_Codigo = A35FAM_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33FAM_Codigo", AV33FAM_Codigo);
         AV21Clas_Codigo = A34Clas_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Clas_Codigo", AV21Clas_Codigo);
         AV16Cata_Codigo = A37Cata_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Cata_Codigo", AV16Cata_Codigo);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S402( )
   {
      /* 'AGREGARHIJONEUP' Routine */
      AV38Index = (short)(1) ;
      while ( AV38Index <= AV14Cantidad )
      {
         GXv_char6[0] = "PLACA" ;
         GXv_int2[0] = AV89Tran_CentroCostoId ;
         GXv_char5[0] = AV23Cons_Numero ;
         new com.orions2.cons_tran_pla(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_char5) ;
         wpcon_ent_dev_impl.this.AV89Tran_CentroCostoId = GXv_int2[0] ;
         wpcon_ent_dev_impl.this.AV23Cons_Numero = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV89Tran_CentroCostoId, 11, 0)));
         /* Execute user subroutine: 'CONSULTAULTIMOCONSE' */
         S362 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'BUSCARPLACAPADRENEUP' */
         S412 ();
         if (returnInSub) return;
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tran_id( AV94Tran_Id );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_consecutivo( (long)(AV29cTDet_Consecutivo+1) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Elem_consecutivo( AV19cElem_Consecutivo );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_cantidad( 1 );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valorunitario( AV99ValorUnitario );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valortotal( AV88Total_Costos );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placanumero( GXutil.trim( AV23Cons_Numero) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( GXutil.trim( AV49pTDet_PlacaPadre) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_espadre( "NO" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_atributos( "NO" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_presente( AV27Costo_Desmantelamiento.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_futuro( AV100VF );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_taza( AV37I );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_plazo_n( (byte)(AV40N) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_otros_costos( AV43Otros_Costos.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_agrupado( (short)(-1) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada( AV45PlacaRecuperada );
         GXv_SdtSDTDetalleTrn7[0] = AV54SDTDetalleTrn;
         GXv_char6[0] = AV87TipoEntrada ;
         new com.orions2.pentradevo(remoteHandle, context).execute( GXv_SdtSDTDetalleTrn7, GXv_char6) ;
         AV54SDTDetalleTrn = GXv_SdtSDTDetalleTrn7[0] ;
         wpcon_ent_dev_impl.this.AV87TipoEntrada = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87TipoEntrada", AV87TipoEntrada);
         AV38Index = (short)(AV38Index+1) ;
      }
      AV42OPC = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
      httpContext.popup(formatLink("com.orions2.wpatributosdev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV94Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV19cElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim("INS")), new Object[] {"AV94Tran_Id",});
   }

   public void S362( )
   {
      /* 'CONSULTAULTIMOCONSE' Routine */
      /* Using cursor H001V16 */
      pr_default.execute(14, new Object[] {new Long(AV94Tran_Id)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A46Tran_Id = H001V16_A46Tran_Id[0] ;
         A69TDet_Consecutivo = H001V16_A69TDet_Consecutivo[0] ;
         AV29cTDet_Consecutivo = A69TDet_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29cTDet_Consecutivo", GXutil.ltrim( GXutil.str( AV29cTDet_Consecutivo, 18, 0)));
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public void S392( )
   {
      /* 'CONSULTAELEMETOPADRE' Routine */
      AV61SWErroPadreHijo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61SWErroPadreHijo", AV61SWErroPadreHijo);
      /* Using cursor H001V17 */
      pr_default.execute(15, new Object[] {new Long(AV94Tran_Id), AV19cElem_Consecutivo});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A505TDet_EsPadre = H001V17_A505TDet_EsPadre[0] ;
         A46Tran_Id = H001V17_A46Tran_Id[0] ;
         A66Elem_Consecutivo = H001V17_A66Elem_Consecutivo[0] ;
         A69TDet_Consecutivo = H001V17_A69TDet_Consecutivo[0] ;
         AV61SWErroPadreHijo = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61SWErroPadreHijo", AV61SWErroPadreHijo);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(15);
      }
      pr_default.close(15);
   }

   public void S412( )
   {
      /* 'BUSCARPLACAPADRENEUP' Routine */
      /* Using cursor H001V18 */
      pr_default.execute(16, new Object[] {new Long(AV94Tran_Id)});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A505TDet_EsPadre = H001V18_A505TDet_EsPadre[0] ;
         A46Tran_Id = H001V18_A46Tran_Id[0] ;
         A490TDet_PlacaNumero = H001V18_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = H001V18_n490TDet_PlacaNumero[0] ;
         A69TDet_Consecutivo = H001V18_A69TDet_Consecutivo[0] ;
         AV49pTDet_PlacaPadre = A490TDet_PlacaNumero ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49pTDet_PlacaPadre", AV49pTDet_PlacaPadre);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(16);
      }
      pr_default.close(16);
   }

   public void S162( )
   {
      /* 'VALIDARBIENADMINISTRACION' Routine */
      GXv_boolean8[0] = AV47pRespuesta ;
      new com.orions2.pcal_bien_adm(remoteHandle, context).execute( AV90Tran_CodigoMovimiento, AV88Total_Costos, GXv_boolean8) ;
      wpcon_ent_dev_impl.this.AV47pRespuesta = GXv_boolean8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Tran_CodigoMovimiento", AV90Tran_CodigoMovimiento);
      httpContext.ajax_rsp_assign_attri("", false, "AV88Total_Costos", GXutil.ltrim( GXutil.str( AV88Total_Costos, 18, 2)));
      httpContext.ajax_rsp_assign_attri("", false, "AV47pRespuesta", AV47pRespuesta);
   }

   public void S172( )
   {
      /* 'AGREGARBIENELSP' Routine */
      AV38Index = (short)(1) ;
      while ( AV38Index <= AV14Cantidad )
      {
         GXv_char6[0] = "PLACA" ;
         GXv_int2[0] = AV89Tran_CentroCostoId ;
         GXv_char5[0] = AV23Cons_Numero ;
         new com.orions2.cons_tran_pla(remoteHandle, context).execute( GXv_char6, GXv_int2, GXv_char5) ;
         wpcon_ent_dev_impl.this.AV89Tran_CentroCostoId = GXv_int2[0] ;
         wpcon_ent_dev_impl.this.AV23Cons_Numero = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89Tran_CentroCostoId", GXutil.ltrim( GXutil.str( AV89Tran_CentroCostoId, 11, 0)));
         /* Execute user subroutine: 'CONSULTAULTIMOCONSE' */
         S362 ();
         if (returnInSub) return;
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tran_id( AV94Tran_Id );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_consecutivo( (long)(AV29cTDet_Consecutivo+1) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Elem_consecutivo( AV19cElem_Consecutivo );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_cantidad( 1 );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valorunitario( AV99ValorUnitario );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valortotal( AV88Total_Costos );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placanumero( GXutil.trim( AV23Cons_Numero) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placapadre( "" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_espadre( "NA" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_atributos( "NO" );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_presente( AV27Costo_Desmantelamiento.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_valor_futuro( AV100VF );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_taza( AV37I );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_plazo_n( (byte)(AV40N) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_otros_costos( AV43Otros_Costos.divide(DecimalUtil.doubleToDec(AV14Cantidad), 18, java.math.BigDecimal.ROUND_DOWN) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_agrupado( (short)(-1) );
         AV54SDTDetalleTrn.setgxTv_SdtSDTDetalleTrn_Tdet_placarecuperada( AV45PlacaRecuperada );
         GXv_SdtSDTDetalleTrn7[0] = AV54SDTDetalleTrn;
         GXv_char6[0] = AV87TipoEntrada ;
         new com.orions2.pentradevo(remoteHandle, context).execute( GXv_SdtSDTDetalleTrn7, GXv_char6) ;
         AV54SDTDetalleTrn = GXv_SdtSDTDetalleTrn7[0] ;
         wpcon_ent_dev_impl.this.AV87TipoEntrada = GXv_char6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87TipoEntrada", AV87TipoEntrada);
         AV38Index = (short)(AV38Index+1) ;
      }
      httpContext.popup(formatLink("com.orions2.wpatributosdev") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV94Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(0,9,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV19cElem_Consecutivo)) + "," + GXutil.URLEncode(GXutil.rtrim("INS")), new Object[] {"AV94Tran_Id",});
      AV42OPC = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42OPC", GXutil.ltrim( GXutil.str( AV42OPC, 4, 0)));
      httpContext.doAjaxRefresh();
   }

   public void S252( )
   {
      /* 'VALIDARRATIFICACION' Routine */
      AV125GXLvl959 = (byte)(0) ;
      /* Using cursor H001V19 */
      pr_default.execute(17, new Object[] {new Long(AV94Tran_Id)});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A46Tran_Id = H001V19_A46Tran_Id[0] ;
         A489TDet_ValorTotal = H001V19_A489TDet_ValorTotal[0] ;
         A525TDet_Atributos = H001V19_A525TDet_Atributos[0] ;
         AV125GXLvl959 = (byte)(1) ;
         AV98valor = AV98valor.add(A489TDet_ValorTotal) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98valor", GXutil.ltrim( GXutil.str( AV98valor, 18, 2)));
         if ( GXutil.strcmp(A525TDet_Atributos, "NO") == 0 )
         {
            AV64SWErrorRati = (short)(1) ;
         }
         pr_default.readNext(17);
      }
      pr_default.close(17);
      if ( AV125GXLvl959 == 0 )
      {
         AV64SWErrorRati = (short)(4) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV94Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Tran_Id", GXutil.ltrim( GXutil.str( AV94Tran_Id, 11, 0)));
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
      pa1V2( ) ;
      ws1V2( ) ;
      we1V2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141418514");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
         httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
         httpContext.AddJavascriptSource("wpcon_ent_dev.js", "?20186141418514");
         httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
         httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
         httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
         httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_1042( )
   {
      edtavTdet_consecutivo_Internalname = "vTDET_CONSECUTIVO_"+sGXsfl_104_idx ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO_"+sGXsfl_104_idx ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION_"+sGXsfl_104_idx ;
      edtavTdet_placanumero_Internalname = "vTDET_PLACANUMERO_"+sGXsfl_104_idx ;
      edtavTdet_placapadre_Internalname = "vTDET_PLACAPADRE_"+sGXsfl_104_idx ;
      edtavTdet_cantidad_Internalname = "vTDET_CANTIDAD_"+sGXsfl_104_idx ;
      edtavTdet_valorunitario_Internalname = "vTDET_VALORUNITARIO_"+sGXsfl_104_idx ;
      edtavTdet_otros_costos_Internalname = "vTDET_OTROS_COSTOS_"+sGXsfl_104_idx ;
      edtavTdet_valor_presente_Internalname = "vTDET_VALOR_PRESENTE_"+sGXsfl_104_idx ;
      edtavTdet_valortotal_Internalname = "vTDET_VALORTOTAL_"+sGXsfl_104_idx ;
      edtavTdet_espadre_Internalname = "vTDET_ESPADRE_"+sGXsfl_104_idx ;
      edtavTdet_agrupado_Internalname = "vTDET_AGRUPADO_"+sGXsfl_104_idx ;
      edtavTdet_placarecuperada_Internalname = "vTDET_PLACARECUPERADA_"+sGXsfl_104_idx ;
      edtavAtributos_Internalname = "vATRIBUTOS_"+sGXsfl_104_idx ;
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_104_idx ;
   }

   public void subsflControlProps_fel_1042( )
   {
      edtavTdet_consecutivo_Internalname = "vTDET_CONSECUTIVO_"+sGXsfl_104_fel_idx ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO_"+sGXsfl_104_fel_idx ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION_"+sGXsfl_104_fel_idx ;
      edtavTdet_placanumero_Internalname = "vTDET_PLACANUMERO_"+sGXsfl_104_fel_idx ;
      edtavTdet_placapadre_Internalname = "vTDET_PLACAPADRE_"+sGXsfl_104_fel_idx ;
      edtavTdet_cantidad_Internalname = "vTDET_CANTIDAD_"+sGXsfl_104_fel_idx ;
      edtavTdet_valorunitario_Internalname = "vTDET_VALORUNITARIO_"+sGXsfl_104_fel_idx ;
      edtavTdet_otros_costos_Internalname = "vTDET_OTROS_COSTOS_"+sGXsfl_104_fel_idx ;
      edtavTdet_valor_presente_Internalname = "vTDET_VALOR_PRESENTE_"+sGXsfl_104_fel_idx ;
      edtavTdet_valortotal_Internalname = "vTDET_VALORTOTAL_"+sGXsfl_104_fel_idx ;
      edtavTdet_espadre_Internalname = "vTDET_ESPADRE_"+sGXsfl_104_fel_idx ;
      edtavTdet_agrupado_Internalname = "vTDET_AGRUPADO_"+sGXsfl_104_fel_idx ;
      edtavTdet_placarecuperada_Internalname = "vTDET_PLACARECUPERADA_"+sGXsfl_104_fel_idx ;
      edtavAtributos_Internalname = "vATRIBUTOS_"+sGXsfl_104_fel_idx ;
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_104_fel_idx ;
   }

   public void sendrow_1042( )
   {
      subsflControlProps_1042( ) ;
      wb1V0( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_104_idx <= subgrid1_recordsperpage( ) * 1 ) )
      {
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
            if ( ((int)((nGXsfl_104_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_104_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_consecutivo_Enabled!=0)&&(edtavTdet_consecutivo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 105,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_consecutivo_Internalname,GXutil.ltrim( localUtil.ntoc( AV76TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")),((edtavTdet_consecutivo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV76TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV76TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")),TempTags+((edtavTdet_consecutivo_Enabled!=0)&&(edtavTdet_consecutivo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_consecutivo_Enabled!=0)&&(edtavTdet_consecutivo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,105);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(0),new Integer(edtavTdet_consecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavElem_consecutivo_Enabled!=0)&&(edtavElem_consecutivo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 106,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavElem_consecutivo_Internalname,AV30Elem_Consecutivo,"",TempTags+((edtavElem_consecutivo_Enabled!=0)&&(edtavElem_consecutivo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavElem_consecutivo_Enabled!=0)&&(edtavElem_consecutivo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,106);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavElem_consecutivo_Jsonclick,new Integer(0),"Attribute",((edtavElem_consecutivo_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavElem_consecutivo_Forecolor)+";",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavElem_consecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCata_descripcion_Enabled!=0)&&(edtavCata_descripcion_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 107,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCata_descripcion_Internalname,AV17Cata_Descripcion,GXutil.rtrim( localUtil.format( AV17Cata_Descripcion, "@!")),TempTags+((edtavCata_descripcion_Enabled!=0)&&(edtavCata_descripcion_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCata_descripcion_Enabled!=0)&&(edtavCata_descripcion_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,107);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCata_descripcion_Jsonclick,new Integer(0),"Attribute",((edtavCata_descripcion_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavCata_descripcion_Forecolor)+";",ROClassString,"WWColumn WWOptionalColumn",new Integer(-1),new Integer(edtavCata_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_placanumero_Enabled!=0)&&(edtavTdet_placanumero_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 108,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_placanumero_Internalname,AV80TDet_PlacaNumero,"",TempTags+((edtavTdet_placanumero_Enabled!=0)&&(edtavTdet_placanumero_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_placanumero_Enabled!=0)&&(edtavTdet_placanumero_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,108);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_placanumero_Jsonclick,new Integer(0),"Attribute",((edtavTdet_placanumero_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavTdet_placanumero_Forecolor)+";",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavTdet_placanumero_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_placapadre_Enabled!=0)&&(edtavTdet_placapadre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 109,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_placapadre_Internalname,AV81TDet_PlacaPadre,"",TempTags+((edtavTdet_placapadre_Enabled!=0)&&(edtavTdet_placapadre_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_placapadre_Enabled!=0)&&(edtavTdet_placapadre_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,109);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_placapadre_Jsonclick,new Integer(0),"Attribute",((edtavTdet_placapadre_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavTdet_placapadre_Forecolor)+";",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavTdet_placapadre_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_cantidad_Enabled!=0)&&(edtavTdet_cantidad_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 110,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_cantidad_Internalname,GXutil.ltrim( localUtil.ntoc( AV74TDet_Cantidad, (byte)(10), (byte)(0), ",", "")),((edtavTdet_cantidad_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV74TDet_Cantidad), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV74TDet_Cantidad), "ZZZZZZZZZ9")),TempTags+((edtavTdet_cantidad_Enabled!=0)&&(edtavTdet_cantidad_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_cantidad_Enabled!=0)&&(edtavTdet_cantidad_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,110);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_cantidad_Jsonclick,new Integer(0),"Attribute",((edtavTdet_cantidad_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavTdet_cantidad_Forecolor)+";",ROClassString,"",new Integer(0),new Integer(edtavTdet_cantidad_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_valorunitario_Enabled!=0)&&(edtavTdet_valorunitario_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 111,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_valorunitario_Internalname,GXutil.ltrim( localUtil.ntoc( AV85TDet_ValorUnitario, (byte)(22), (byte)(2), ",", "")),((edtavTdet_valorunitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV85TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV85TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+((edtavTdet_valorunitario_Enabled!=0)&&(edtavTdet_valorunitario_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_valorunitario_Enabled!=0)&&(edtavTdet_valorunitario_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,111);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_valorunitario_Jsonclick,new Integer(0),"Attribute",((edtavTdet_valorunitario_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavTdet_valorunitario_Forecolor)+";",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavTdet_valorunitario_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_otros_costos_Enabled!=0)&&(edtavTdet_otros_costos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_otros_costos_Internalname,GXutil.ltrim( localUtil.ntoc( AV79TDet_Otros_Costos, (byte)(24), (byte)(2), ",", "")),((edtavTdet_otros_costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV79TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV79TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+((edtavTdet_otros_costos_Enabled!=0)&&(edtavTdet_otros_costos_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_otros_costos_Enabled!=0)&&(edtavTdet_otros_costos_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,112);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_otros_costos_Jsonclick,new Integer(0),"Attribute",((edtavTdet_otros_costos_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavTdet_otros_costos_Forecolor)+";",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavTdet_otros_costos_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_valor_presente_Enabled!=0)&&(edtavTdet_valor_presente_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 113,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_valor_presente_Internalname,GXutil.ltrim( localUtil.ntoc( AV82TDet_Valor_Presente, (byte)(24), (byte)(2), ",", "")),((edtavTdet_valor_presente_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV82TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV82TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+((edtavTdet_valor_presente_Enabled!=0)&&(edtavTdet_valor_presente_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_valor_presente_Enabled!=0)&&(edtavTdet_valor_presente_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,113);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_valor_presente_Jsonclick,new Integer(0),"Attribute",((edtavTdet_valor_presente_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavTdet_valor_presente_Forecolor)+";",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavTdet_valor_presente_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_valortotal_Enabled!=0)&&(edtavTdet_valortotal_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 114,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_valortotal_Internalname,GXutil.ltrim( localUtil.ntoc( AV84TDet_ValorTotal, (byte)(22), (byte)(2), ",", "")),((edtavTdet_valortotal_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV84TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV84TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+((edtavTdet_valortotal_Enabled!=0)&&(edtavTdet_valortotal_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_valortotal_Enabled!=0)&&(edtavTdet_valortotal_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,114);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_valortotal_Jsonclick,new Integer(0),"Attribute",((edtavTdet_valortotal_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( edtavTdet_valortotal_Forecolor)+";",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavTdet_valortotal_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_espadre_Enabled!=0)&&(edtavTdet_espadre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 115,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_espadre_Internalname,AV77TDet_EsPadre,"",TempTags+((edtavTdet_espadre_Enabled!=0)&&(edtavTdet_espadre_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_espadre_Enabled!=0)&&(edtavTdet_espadre_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,115);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_espadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavTdet_espadre_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_agrupado_Enabled!=0)&&(edtavTdet_agrupado_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 116,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_agrupado_Internalname,GXutil.ltrim( localUtil.ntoc( AV72TDet_Agrupado, (byte)(4), (byte)(0), ",", "")),((edtavTdet_agrupado_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV72TDet_Agrupado), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV72TDet_Agrupado), "ZZZ9")),TempTags+((edtavTdet_agrupado_Enabled!=0)&&(edtavTdet_agrupado_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_agrupado_Enabled!=0)&&(edtavTdet_agrupado_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,116);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_agrupado_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavTdet_agrupado_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(4),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdet_placarecuperada_Enabled!=0)&&(edtavTdet_placarecuperada_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 117,'',false,'"+sGXsfl_104_idx+"',104)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_placarecuperada_Internalname,AV103TDet_PlacaRecuperada,"",TempTags+((edtavTdet_placarecuperada_Enabled!=0)&&(edtavTdet_placarecuperada_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_placarecuperada_Enabled!=0)&&(edtavTdet_placarecuperada_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,117);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_placarecuperada_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavTdet_placarecuperada_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(104),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavAtributos_Enabled!=0)&&(edtavAtributos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 118,'',false,'',104)\"" : " ") ;
         ClassString = "UpdateAttribute" ;
         StyleString = "" ;
         AV11Atributos_IsBlob = (boolean)(((GXutil.strcmp("", AV11Atributos)==0)&&(GXutil.strcmp("", AV107Atributos_GXI)==0))||!(GXutil.strcmp("", AV11Atributos)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV11Atributos)==0) ? AV107Atributos_GXI : httpContext.getResourceRelative(AV11Atributos)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavAtributos_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(edtavAtributos_Enabled),"","Atributos",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(5),edtavAtributos_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'ATRIBUTOS\\'."+sGXsfl_104_idx+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV11Atributos_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavEliminar_Enabled!=0)&&(edtavEliminar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 119,'',false,'',104)\"" : " ") ;
         ClassString = "DeleteAttribute" ;
         StyleString = "" ;
         AV31Eliminar_IsBlob = (boolean)(((GXutil.strcmp("", AV31Eliminar)==0)&&(GXutil.strcmp("", AV106Eliminar_GXI)==0))||!(GXutil.strcmp("", AV31Eliminar)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV31Eliminar)==0) ? AV106Eliminar_GXI : httpContext.getResourceRelative(AV31Eliminar)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavEliminar_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(edtavEliminar_Enabled),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(7),edtavEliminar_Jsonclick,"'"+""+"'"+",false,"+"'"+"e271v2_client"+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV31Eliminar_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_104_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_104_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_104_idx+1)) ;
         sGXsfl_104_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_104_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_1042( ) ;
      }
      /* End function sendrow_1042 */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      edtavTran_consecutivocc_Internalname = "vTRAN_CONSECUTIVOCC" ;
      edtavTran_fecharegistro_Internalname = "vTRAN_FECHAREGISTRO" ;
      cmbavTipoentrada.setInternalname( "vTIPOENTRADA" );
      cmbavCat_bien.setInternalname( "vCAT_BIEN" );
      bttNuevogrupo_Internalname = "NUEVOGRUPO" ;
      edtavCelem_consecutivo_Internalname = "vCELEM_CONSECUTIVO" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavCcata_descripcion_Internalname = "vCCATA_DESCRIPCION" ;
      edtavCelem_descripcion_Internalname = "vCELEM_DESCRIPCION" ;
      imgImageplaca_Internalname = "IMAGEPLACA" ;
      edtavPlacarecuperada_Internalname = "vPLACARECUPERADA" ;
      edtavCantidad_Internalname = "vCANTIDAD" ;
      edtavValorunitario_Internalname = "vVALORUNITARIO" ;
      edtavCosto_adquisicion_Internalname = "vCOSTO_ADQUISICION" ;
      edtavOtros_costos_Internalname = "vOTROS_COSTOS" ;
      edtavVf_Internalname = "vVF" ;
      edtavI_Internalname = "vI" ;
      edtavN_Internalname = "vN" ;
      edtavCosto_desmantelamiento_Internalname = "vCOSTO_DESMANTELAMIENTO" ;
      edtavTotal_costos_Internalname = "vTOTAL_COSTOS" ;
      bttButton1_Internalname = "BUTTON1" ;
      edtavTran_valortransaccion_Internalname = "vTRAN_VALORTRANSACCION" ;
      lblTitleatributos_Internalname = "TITLEATRIBUTOS" ;
      edtavTdet_consecutivo_Internalname = "vTDET_CONSECUTIVO" ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO" ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION" ;
      edtavTdet_placanumero_Internalname = "vTDET_PLACANUMERO" ;
      edtavTdet_placapadre_Internalname = "vTDET_PLACAPADRE" ;
      edtavTdet_cantidad_Internalname = "vTDET_CANTIDAD" ;
      edtavTdet_valorunitario_Internalname = "vTDET_VALORUNITARIO" ;
      edtavTdet_otros_costos_Internalname = "vTDET_OTROS_COSTOS" ;
      edtavTdet_valor_presente_Internalname = "vTDET_VALOR_PRESENTE" ;
      edtavTdet_valortotal_Internalname = "vTDET_VALORTOTAL" ;
      edtavTdet_espadre_Internalname = "vTDET_ESPADRE" ;
      edtavTdet_agrupado_Internalname = "vTDET_AGRUPADO" ;
      edtavTdet_placarecuperada_Internalname = "vTDET_PLACARECUPERADA" ;
      edtavAtributos_Internalname = "vATRIBUTOS" ;
      edtavEliminar_Internalname = "vELIMINAR" ;
      divTable2_Internalname = "TABLE2" ;
      bttButton2_Internalname = "BUTTON2" ;
      bttButton3_Internalname = "BUTTON3" ;
      Alertify1_Internalname = "ALERTIFY1" ;
      lblUrl_Internalname = "URL" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
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
      edtavEliminar_Jsonclick = "" ;
      edtavEliminar_Visible = -1 ;
      edtavAtributos_Jsonclick = "" ;
      edtavAtributos_Visible = -1 ;
      edtavTdet_placarecuperada_Jsonclick = "" ;
      edtavTdet_placarecuperada_Visible = 0 ;
      edtavTdet_agrupado_Jsonclick = "" ;
      edtavTdet_agrupado_Visible = 0 ;
      edtavTdet_espadre_Jsonclick = "" ;
      edtavTdet_espadre_Visible = 0 ;
      edtavTdet_valortotal_Jsonclick = "" ;
      edtavTdet_valortotal_Visible = -1 ;
      edtavTdet_valor_presente_Jsonclick = "" ;
      edtavTdet_valor_presente_Visible = -1 ;
      edtavTdet_otros_costos_Jsonclick = "" ;
      edtavTdet_otros_costos_Visible = -1 ;
      edtavTdet_valorunitario_Jsonclick = "" ;
      edtavTdet_valorunitario_Visible = -1 ;
      edtavTdet_cantidad_Jsonclick = "" ;
      edtavTdet_cantidad_Visible = 0 ;
      edtavTdet_placapadre_Jsonclick = "" ;
      edtavTdet_placapadre_Visible = -1 ;
      edtavTdet_placanumero_Jsonclick = "" ;
      edtavTdet_placanumero_Visible = -1 ;
      edtavCata_descripcion_Jsonclick = "" ;
      edtavCata_descripcion_Visible = -1 ;
      edtavElem_consecutivo_Jsonclick = "" ;
      edtavElem_consecutivo_Visible = -1 ;
      edtavTdet_consecutivo_Jsonclick = "" ;
      edtavTdet_consecutivo_Visible = 0 ;
      lblUrl_Caption = "" ;
      lblUrl_Visible = 1 ;
      bttButton3_Caption = "CANCELAR" ;
      bttButton2_Visible = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavTdet_valortotal_Fontbold = (byte)(0) ;
      edtavTdet_valortotal_Forecolor = (int)(0xFFFFFF) ;
      edtavTdet_valor_presente_Fontbold = (byte)(0) ;
      edtavTdet_valor_presente_Forecolor = (int)(0xFFFFFF) ;
      edtavTdet_otros_costos_Fontbold = (byte)(0) ;
      edtavTdet_otros_costos_Forecolor = (int)(0xFFFFFF) ;
      edtavTdet_valorunitario_Fontbold = (byte)(0) ;
      edtavTdet_valorunitario_Forecolor = (int)(0xFFFFFF) ;
      edtavTdet_cantidad_Fontbold = (byte)(0) ;
      edtavTdet_cantidad_Forecolor = (int)(0xFFFFFF) ;
      edtavTdet_placapadre_Fontbold = (byte)(0) ;
      edtavTdet_placapadre_Forecolor = (int)(0xFFFFFF) ;
      edtavTdet_placanumero_Fontbold = (byte)(0) ;
      edtavTdet_placanumero_Forecolor = (int)(0xFFFFFF) ;
      edtavCata_descripcion_Fontbold = (byte)(0) ;
      edtavCata_descripcion_Forecolor = (int)(0xFFFFFF) ;
      edtavElem_consecutivo_Fontbold = (byte)(0) ;
      edtavElem_consecutivo_Forecolor = (int)(0xFFFFFF) ;
      edtavEliminar_Enabled = 1 ;
      edtavAtributos_Enabled = 1 ;
      edtavTdet_placarecuperada_Enabled = 1 ;
      edtavTdet_agrupado_Enabled = 1 ;
      edtavTdet_espadre_Enabled = 1 ;
      edtavTdet_valortotal_Enabled = 1 ;
      edtavTdet_valor_presente_Enabled = 1 ;
      edtavTdet_otros_costos_Enabled = 1 ;
      edtavTdet_valorunitario_Enabled = 1 ;
      edtavTdet_cantidad_Enabled = 1 ;
      edtavTdet_placapadre_Enabled = 1 ;
      edtavTdet_placanumero_Enabled = 1 ;
      edtavCata_descripcion_Enabled = 1 ;
      edtavElem_consecutivo_Enabled = 1 ;
      edtavTdet_consecutivo_Enabled = 1 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavTran_valortransaccion_Jsonclick = "" ;
      edtavTran_valortransaccion_Enabled = 1 ;
      bttButton1_Visible = 1 ;
      edtavTotal_costos_Jsonclick = "" ;
      edtavTotal_costos_Enabled = 1 ;
      edtavCosto_desmantelamiento_Jsonclick = "" ;
      edtavCosto_desmantelamiento_Enabled = 1 ;
      edtavN_Jsonclick = "" ;
      edtavN_Enabled = 1 ;
      edtavI_Jsonclick = "" ;
      edtavI_Enabled = 1 ;
      edtavVf_Jsonclick = "" ;
      edtavVf_Enabled = 1 ;
      edtavOtros_costos_Jsonclick = "" ;
      edtavOtros_costos_Enabled = 1 ;
      edtavCosto_adquisicion_Jsonclick = "" ;
      edtavCosto_adquisicion_Enabled = 1 ;
      edtavValorunitario_Jsonclick = "" ;
      edtavValorunitario_Enabled = 1 ;
      edtavCantidad_Jsonclick = "" ;
      edtavCantidad_Enabled = 1 ;
      edtavPlacarecuperada_Jsonclick = "" ;
      edtavPlacarecuperada_Enabled = 1 ;
      edtavPlacarecuperada_Visible = 1 ;
      imgImageplaca_Visible = 1 ;
      edtavCelem_descripcion_Enabled = 1 ;
      edtavCcata_descripcion_Enabled = 1 ;
      edtavCelem_consecutivo_Jsonclick = "" ;
      edtavCelem_consecutivo_Enabled = 1 ;
      bttNuevogrupo_Visible = 1 ;
      cmbavCat_bien.setJsonclick( "" );
      cmbavCat_bien.setEnabled( 1 );
      cmbavCat_bien.setVisible( 1 );
      cmbavTipoentrada.setJsonclick( "" );
      cmbavTipoentrada.setEnabled( 1 );
      edtavTran_fecharegistro_Jsonclick = "" ;
      edtavTran_fecharegistro_Enabled = 1 ;
      edtavTran_consecutivocc_Jsonclick = "" ;
      edtavTran_consecutivocc_Enabled = 1 ;
      Alertify1_Textcancel = "Cancelar" ;
      Alertify1_Textok = "Confirmar" ;
      Alertify1_Textmessage = "Click now!!!" ;
      Alertify1_Type = "alert" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Entrada elementos devolutivo" );
      subGrid1_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV31Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV11Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A658TDet_Agrupado',fld:'TDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'A817TDet_PlacaRecuperada',fld:'TDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV71SWRatificar',fld:'vSWRATIFICAR',pic:'ZZZ9',nv:0},{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A527Tran_TipoEntra',fld:'TRAN_TIPOENTRA',pic:'',nv:''},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A49Tran_CodigoMovimiento',fld:'TRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A55Tran_FechaRegistro',fld:'TRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'A56Tran_IdCuentadanteResponsabili',fld:'TRAN_IDCUENTADANTERESPONSABILI',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A719Tran_TransaccResponsabilidad',fld:'TRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'A720Tran_FechaResponsabilidad',fld:'TRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'A758Tran_TablaResponsabilidad',fld:'TRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''}],oparms:[{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''},{av:'AV89Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV91Tran_CodTipoElemento',fld:'vTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV96Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV90Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV92Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV93Tran_FechaRegistro',fld:'vTRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'AV6Tran_IdCuentadanteResponsabilidad',fld:'vTRAN_IDCUENTADANTERESPONSABILIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8Tran_TransaccResponsabilidad',fld:'vTRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV5Tran_FechaResponsabilidad',fld:'vTRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'AV7Tran_TablaResponsabilidad',fld:'vTRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'cmbavCat_bien'},{ctrl:'NUEVOGRUPO',prop:'Visible'},{av:'AV15Cat_Bien',fld:'vCAT_BIEN',pic:'',nv:''}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e241V2',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A658TDet_Agrupado',fld:'TDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'A817TDet_PlacaRecuperada',fld:'TDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV71SWRatificar',fld:'vSWRATIFICAR',pic:'ZZZ9',nv:0}],oparms:[{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'AV31Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV11Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV74TDet_Cantidad',fld:'vTDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV30Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV76TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV84TDet_ValorTotal',fld:'vTDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV85TDet_ValorUnitario',fld:'vTDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV80TDet_PlacaNumero',fld:'vTDET_PLACANUMERO',pic:'',nv:''},{av:'AV81TDet_PlacaPadre',fld:'vTDET_PLACAPADRE',pic:'',nv:''},{av:'AV77TDet_EsPadre',fld:'vTDET_ESPADRE',pic:'',nv:''},{av:'AV17Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV82TDet_Valor_Presente',fld:'vTDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV79TDet_Otros_Costos',fld:'vTDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV72TDet_Agrupado',fld:'vTDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'AV103TDet_PlacaRecuperada',fld:'vTDET_PLACARECUPERADA',pic:'',nv:''},{av:'edtavTdet_valorunitario_Fontbold',ctrl:'vTDET_VALORUNITARIO',prop:'Fontbold'},{av:'edtavTdet_placanumero_Fontbold',ctrl:'vTDET_PLACANUMERO',prop:'Fontbold'},{av:'edtavElem_consecutivo_Fontbold',ctrl:'vELEM_CONSECUTIVO',prop:'Fontbold'},{av:'edtavTdet_placapadre_Fontbold',ctrl:'vTDET_PLACAPADRE',prop:'Fontbold'},{av:'edtavTdet_cantidad_Fontbold',ctrl:'vTDET_CANTIDAD',prop:'Fontbold'},{av:'edtavCata_descripcion_Fontbold',ctrl:'vCATA_DESCRIPCION',prop:'Fontbold'},{av:'edtavTdet_valor_presente_Fontbold',ctrl:'vTDET_VALOR_PRESENTE',prop:'Fontbold'},{av:'edtavTdet_otros_costos_Fontbold',ctrl:'vTDET_OTROS_COSTOS',prop:'Fontbold'},{av:'edtavTdet_valortotal_Fontbold',ctrl:'vTDET_VALORTOTAL',prop:'Fontbold'},{av:'edtavEliminar_Enabled',ctrl:'vELIMINAR',prop:'Enabled'},{av:'edtavAtributos_Enabled',ctrl:'vATRIBUTOS',prop:'Enabled'},{av:'edtavTdet_placanumero_Forecolor',ctrl:'vTDET_PLACANUMERO',prop:'Forecolor'},{av:'edtavElem_consecutivo_Forecolor',ctrl:'vELEM_CONSECUTIVO',prop:'Forecolor'},{av:'edtavTdet_placapadre_Forecolor',ctrl:'vTDET_PLACAPADRE',prop:'Forecolor'},{av:'edtavTdet_cantidad_Forecolor',ctrl:'vTDET_CANTIDAD',prop:'Forecolor'},{av:'edtavTdet_valorunitario_Forecolor',ctrl:'vTDET_VALORUNITARIO',prop:'Forecolor'},{av:'edtavCata_descripcion_Forecolor',ctrl:'vCATA_DESCRIPCION',prop:'Forecolor'},{av:'edtavTdet_valor_presente_Forecolor',ctrl:'vTDET_VALOR_PRESENTE',prop:'Forecolor'},{av:'edtavTdet_otros_costos_Forecolor',ctrl:'vTDET_OTROS_COSTOS',prop:'Forecolor'},{av:'edtavTdet_valortotal_Forecolor',ctrl:'vTDET_VALORTOTAL',prop:'Forecolor'}]}");
      setEventMetadata("VTIPOENTRADA.ISVALID","{handler:'e141V2',iparms:[{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''}],oparms:[{av:'cmbavCat_bien'},{ctrl:'NUEVOGRUPO',prop:'Visible'},{av:'AV15Cat_Bien',fld:'vCAT_BIEN',pic:'',nv:''}]}");
      setEventMetadata("'AGREGARBIEN'","{handler:'e151V2',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV31Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV11Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A527Tran_TipoEntra',fld:'TRAN_TIPOENTRA',pic:'',nv:''},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A49Tran_CodigoMovimiento',fld:'TRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A55Tran_FechaRegistro',fld:'TRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'A56Tran_IdCuentadanteResponsabili',fld:'TRAN_IDCUENTADANTERESPONSABILI',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A719Tran_TransaccResponsabilidad',fld:'TRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'A720Tran_FechaResponsabilidad',fld:'TRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'A758Tran_TablaResponsabilidad',fld:'TRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A658TDet_Agrupado',fld:'TDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'A817TDet_PlacaRecuperada',fld:'TDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV71SWRatificar',fld:'vSWRATIFICAR',pic:'ZZZ9',nv:0},{av:'AV62SWError',fld:'vSWERROR',pic:'ZZZ9',nv:0},{av:'AV47pRespuesta',fld:'vPRESPUESTA',pic:'',nv:false},{av:'AV86TIP_Codigo',fld:'vTIP_CODIGO',pic:'',nv:''},{av:'AV56SEG_Codigo',fld:'vSEG_CODIGO',pic:'',nv:''},{av:'AV33FAM_Codigo',fld:'vFAM_CODIGO',pic:'',nv:''},{av:'AV21Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',nv:''},{av:'AV16Cata_Codigo',fld:'vCATA_CODIGO',pic:'',nv:''},{av:'AV14Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV99ValorUnitario',fld:'vVALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'cmbavCat_bien'},{av:'AV15Cat_Bien',fld:'vCAT_BIEN',pic:'',nv:''},{av:'AV61SWErroPadreHijo',fld:'vSWERROPADREHIJO',pic:'',nv:false},{av:'AV60SWErroPadre',fld:'vSWERROPADRE',pic:'',nv:false},{av:'AV63SWErrorPadre',fld:'vSWERRORPADRE',pic:'ZZZ9',nv:0},{av:'AV90Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV88Total_Costos',fld:'vTOTAL_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV89Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV54SDTDetalleTrn',fld:'vSDTDETALLETRN',pic:'',nv:null},{av:'AV29cTDet_Consecutivo',fld:'vCTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV19cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV81TDet_PlacaPadre',fld:'vTDET_PLACAPADRE',pic:'',nv:''},{av:'AV27Costo_Desmantelamiento',fld:'vCOSTO_DESMANTELAMIENTO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV100VF',fld:'vVF',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV37I',fld:'vI',pic:'ZZ9',nv:0},{av:'AV40N',fld:'vN',pic:'ZZZ9',nv:0},{av:'AV43Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV45PlacaRecuperada',fld:'vPLACARECUPERADA',pic:'',nv:''},{av:'AV76TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV18cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV20cElem_Descripcion',fld:'vCELEM_DESCRIPCION',pic:'',nv:''},{av:'AV41Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV26Costo_Adquisicion',fld:'vCOSTO_ADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV49pTDet_PlacaPadre',fld:'vPTDET_PLACAPADRE',pic:'',nv:''},{av:'AV48pTDet_Consecutivo',fld:'vPTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV62SWError',fld:'vSWERROR',pic:'ZZZ9',nv:0},{av:'AV47pRespuesta',fld:'vPRESPUESTA',pic:'',nv:false},{av:'AV89Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV54SDTDetalleTrn',fld:'vSDTDETALLETRN',pic:'',nv:null},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'cmbavCat_bien'},{av:'AV15Cat_Bien',fld:'vCAT_BIEN',pic:'',nv:''},{av:'AV19cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV18cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV20cElem_Descripcion',fld:'vCELEM_DESCRIPCION',pic:'',nv:''},{av:'AV14Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV99ValorUnitario',fld:'vVALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV41Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV88Total_Costos',fld:'vTOTAL_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV26Costo_Adquisicion',fld:'vCOSTO_ADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV43Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV27Costo_Desmantelamiento',fld:'vCOSTO_DESMANTELAMIENTO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV100VF',fld:'vVF',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV37I',fld:'vI',pic:'ZZ9',nv:0},{av:'AV40N',fld:'vN',pic:'ZZZ9',nv:0},{av:'AV45PlacaRecuperada',fld:'vPLACARECUPERADA',pic:'',nv:''},{av:'AV61SWErroPadreHijo',fld:'vSWERROPADREHIJO',pic:'',nv:false},{av:'AV60SWErroPadre',fld:'vSWERROPADRE',pic:'',nv:false},{av:'AV63SWErrorPadre',fld:'vSWERRORPADRE',pic:'ZZZ9',nv:0},{av:'AV48pTDet_Consecutivo',fld:'vPTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV29cTDet_Consecutivo',fld:'vCTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV49pTDet_PlacaPadre',fld:'vPTDET_PLACAPADRE',pic:'',nv:''}]}");
      setEventMetadata("VCELEM_CONSECUTIVO.ISVALID","{handler:'e161V2',iparms:[{av:'AV19cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV91Tran_CodTipoElemento',fld:'vTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A557Elem_Descripcion',fld:'ELEM_DESCRIPCION',pic:'',nv:''},{av:'A74TIP_Codigo',fld:'TIP_CODIGO',pic:'',nv:''},{av:'A75SEG_Codigo',fld:'SEG_CODIGO',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A35FAM_Codigo',fld:'FAM_CODIGO',pic:'',nv:''},{av:'A34Clas_Codigo',fld:'CLAS_CODIGO',pic:'',nv:''},{av:'A37Cata_Codigo',fld:'CATA_CODIGO',pic:'',nv:''}],oparms:[{av:'AV20cElem_Descripcion',fld:'vCELEM_DESCRIPCION',pic:'',nv:''},{av:'AV86TIP_Codigo',fld:'vTIP_CODIGO',pic:'',nv:''},{av:'AV56SEG_Codigo',fld:'vSEG_CODIGO',pic:'',nv:''},{av:'AV18cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV33FAM_Codigo',fld:'vFAM_CODIGO',pic:'',nv:''},{av:'AV21Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',nv:''},{av:'AV16Cata_Codigo',fld:'vCATA_CODIGO',pic:'',nv:''}]}");
      setEventMetadata("'BUSCARELEMENTO'","{handler:'e221V2',iparms:[{av:'AV91Tran_CodTipoElemento',fld:'vTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV16Cata_Codigo',fld:'vCATA_CODIGO',pic:'',nv:''},{av:'AV21Clas_Codigo',fld:'vCLAS_CODIGO',pic:'',nv:''},{av:'AV33FAM_Codigo',fld:'vFAM_CODIGO',pic:'',nv:''},{av:'AV56SEG_Codigo',fld:'vSEG_CODIGO',pic:'',nv:''},{av:'AV86TIP_Codigo',fld:'vTIP_CODIGO',pic:'',nv:''},{av:'AV18cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV20cElem_Descripcion',fld:'vCELEM_DESCRIPCION',pic:'',nv:''},{av:'AV19cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''}]}");
      setEventMetadata("VI.ISVALID","{handler:'e171V2',iparms:[{av:'AV14Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV100VF',fld:'vVF',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV37I',fld:'vI',pic:'ZZ9',nv:0},{av:'AV40N',fld:'vN',pic:'ZZZ9',nv:0},{av:'AV26Costo_Adquisicion',fld:'vCOSTO_ADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV43Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV27Costo_Desmantelamiento',fld:'vCOSTO_DESMANTELAMIENTO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV13C',fld:'vC',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}],oparms:[{av:'AV27Costo_Desmantelamiento',fld:'vCOSTO_DESMANTELAMIENTO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV88Total_Costos',fld:'vTOTAL_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV40N',fld:'vN',pic:'ZZZ9',nv:0},{av:'AV100VF',fld:'vVF',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV13C',fld:'vC',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}]}");
      setEventMetadata("VN.ISVALID","{handler:'e181V2',iparms:[{av:'AV14Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV100VF',fld:'vVF',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV37I',fld:'vI',pic:'ZZ9',nv:0},{av:'AV40N',fld:'vN',pic:'ZZZ9',nv:0},{av:'AV26Costo_Adquisicion',fld:'vCOSTO_ADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV43Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV27Costo_Desmantelamiento',fld:'vCOSTO_DESMANTELAMIENTO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV13C',fld:'vC',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}],oparms:[{av:'AV27Costo_Desmantelamiento',fld:'vCOSTO_DESMANTELAMIENTO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV88Total_Costos',fld:'vTOTAL_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV40N',fld:'vN',pic:'ZZZ9',nv:0},{av:'AV100VF',fld:'vVF',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV13C',fld:'vC',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}]}");
      setEventMetadata("VCANTIDAD.ISVALID","{handler:'e191V2',iparms:[{av:'AV14Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'AV6Tran_IdCuentadanteResponsabilidad',fld:'vTRAN_IDCUENTADANTERESPONSABILIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV99ValorUnitario',fld:'vVALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV43Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV27Costo_Desmantelamiento',fld:'vCOSTO_DESMANTELAMIENTO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV45PlacaRecuperada',fld:'vPLACARECUPERADA',pic:'',nv:''}],oparms:[{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV26Costo_Adquisicion',fld:'vCOSTO_ADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV88Total_Costos',fld:'vTOTAL_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}]}");
      setEventMetadata("'ATRIBUTOS'","{handler:'e261V2',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV31Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV11Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A527Tran_TipoEntra',fld:'TRAN_TIPOENTRA',pic:'',nv:''},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A49Tran_CodigoMovimiento',fld:'TRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A55Tran_FechaRegistro',fld:'TRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'A56Tran_IdCuentadanteResponsabili',fld:'TRAN_IDCUENTADANTERESPONSABILI',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A719Tran_TransaccResponsabilidad',fld:'TRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'A720Tran_FechaResponsabilidad',fld:'TRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'A758Tran_TablaResponsabilidad',fld:'TRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A658TDet_Agrupado',fld:'TDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'A817TDet_PlacaRecuperada',fld:'TDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV71SWRatificar',fld:'vSWRATIFICAR',pic:'ZZZ9',nv:0},{av:'AV76TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV30Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''}],oparms:[{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'ELIMINAR'","{handler:'e271V2',iparms:[{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''},{av:'AV77TDet_EsPadre',fld:'vTDET_ESPADRE',pic:'',nv:''}],oparms:[{av:'AV68SWNuevoGrupo',fld:'vSWNUEVOGRUPO',pic:'ZZZ9',nv:0},{av:'AV71SWRatificar',fld:'vSWRATIFICAR',pic:'ZZZ9',nv:0},{av:'AV59SWEliminar',fld:'vSWELIMINAR',pic:'ZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'}]}");
      setEventMetadata("ALERTIFY1.OK","{handler:'e131V2',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV31Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV11Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A527Tran_TipoEntra',fld:'TRAN_TIPOENTRA',pic:'',nv:''},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A49Tran_CodigoMovimiento',fld:'TRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A55Tran_FechaRegistro',fld:'TRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'A56Tran_IdCuentadanteResponsabili',fld:'TRAN_IDCUENTADANTERESPONSABILI',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A719Tran_TransaccResponsabilidad',fld:'TRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'A720Tran_FechaResponsabilidad',fld:'TRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'A758Tran_TablaResponsabilidad',fld:'TRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A658TDet_Agrupado',fld:'TDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'A817TDet_PlacaRecuperada',fld:'TDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV71SWRatificar',fld:'vSWRATIFICAR',pic:'ZZZ9',nv:0},{av:'AV59SWEliminar',fld:'vSWELIMINAR',pic:'ZZZ9',nv:0},{av:'AV30Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV76TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV72TDet_Agrupado',fld:'vTDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'AV103TDet_PlacaRecuperada',fld:'vTDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV68SWNuevoGrupo',fld:'vSWNUEVOGRUPO',pic:'ZZZ9',nv:0},{av:'AV97Usuario',fld:'vUSUARIO',pic:'@!',nv:''}],oparms:[{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'AV103TDet_PlacaRecuperada',fld:'vTDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV72TDet_Agrupado',fld:'vTDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'AV76TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV97Usuario',fld:'vUSUARIO',pic:'@!',nv:''},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'lblUrl_Caption',ctrl:'URL',prop:'Caption'},{ctrl:'BUTTON1',prop:'Visible'},{ctrl:'BUTTON2',prop:'Visible'},{ctrl:'BUTTON3',prop:'Caption'}]}");
      setEventMetadata("'NUEVOGRUPO'","{handler:'e201V2',iparms:[{av:'AV70SWPedreGrupo',fld:'vSWPEDREGRUPO',pic:'',nv:false},{av:'AV65SWHijoGrupo',fld:'vSWHIJOGRUPO',pic:'',nv:false},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A658TDet_Agrupado',fld:'TDET_AGRUPADO',pic:'ZZZ9',nv:0}],oparms:[{av:'AV68SWNuevoGrupo',fld:'vSWNUEVOGRUPO',pic:'ZZZ9',nv:0},{av:'AV71SWRatificar',fld:'vSWRATIFICAR',pic:'ZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV70SWPedreGrupo',fld:'vSWPEDREGRUPO',pic:'',nv:false},{av:'AV65SWHijoGrupo',fld:'vSWHIJOGRUPO',pic:'',nv:false}]}");
      setEventMetadata("'RATIFICAR'","{handler:'e211V2',iparms:[{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''},{av:'AV67SWHijoGrupoDesagrupado',fld:'vSWHIJOGRUPODESAGRUPADO',pic:'',nv:false},{av:'AV66SWHijoGrupoAgrupado',fld:'vSWHIJOGRUPOAGRUPADO',pic:'',nv:false},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV98valor',fld:'vVALOR',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A658TDet_Agrupado',fld:'TDET_AGRUPADO',pic:'ZZZ9',nv:0}],oparms:[{av:'AV98valor',fld:'vVALOR',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV68SWNuevoGrupo',fld:'vSWNUEVOGRUPO',pic:'ZZZ9',nv:0},{av:'AV59SWEliminar',fld:'vSWELIMINAR',pic:'ZZZ9',nv:0},{av:'AV71SWRatificar',fld:'vSWRATIFICAR',pic:'ZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV67SWHijoGrupoDesagrupado',fld:'vSWHIJOGRUPODESAGRUPADO',pic:'',nv:false},{av:'AV66SWHijoGrupoAgrupado',fld:'vSWHIJOGRUPOAGRUPADO',pic:'',nv:false}]}");
      setEventMetadata("'CANCELAR'","{handler:'e121V1',iparms:[],oparms:[]}");
      setEventMetadata("'PLACAS'","{handler:'e111V1',iparms:[{av:'AV6Tran_IdCuentadanteResponsabilidad',fld:'vTRAN_IDCUENTADANTERESPONSABILIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8Tran_TransaccResponsabilidad',fld:'vTRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV5Tran_FechaResponsabilidad',fld:'vTRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'AV7Tran_TablaResponsabilidad',fld:'vTRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0}],oparms:[{av:'AV45PlacaRecuperada',fld:'vPLACARECUPERADA',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV31Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV11Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A658TDet_Agrupado',fld:'TDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'A817TDet_PlacaRecuperada',fld:'TDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV71SWRatificar',fld:'vSWRATIFICAR',pic:'ZZZ9',nv:0},{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A527Tran_TipoEntra',fld:'TRAN_TIPOENTRA',pic:'',nv:''},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A49Tran_CodigoMovimiento',fld:'TRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A55Tran_FechaRegistro',fld:'TRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'A56Tran_IdCuentadanteResponsabili',fld:'TRAN_IDCUENTADANTERESPONSABILI',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A719Tran_TransaccResponsabilidad',fld:'TRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'A720Tran_FechaResponsabilidad',fld:'TRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'A758Tran_TablaResponsabilidad',fld:'TRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''}],oparms:[{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''},{av:'AV89Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV91Tran_CodTipoElemento',fld:'vTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV96Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV90Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV92Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV93Tran_FechaRegistro',fld:'vTRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'AV6Tran_IdCuentadanteResponsabilidad',fld:'vTRAN_IDCUENTADANTERESPONSABILIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8Tran_TransaccResponsabilidad',fld:'vTRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV5Tran_FechaResponsabilidad',fld:'vTRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'AV7Tran_TablaResponsabilidad',fld:'vTRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'cmbavCat_bien'},{ctrl:'NUEVOGRUPO',prop:'Visible'},{av:'AV15Cat_Bien',fld:'vCAT_BIEN',pic:'',nv:''}]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV31Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV11Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A658TDet_Agrupado',fld:'TDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'A817TDet_PlacaRecuperada',fld:'TDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV71SWRatificar',fld:'vSWRATIFICAR',pic:'ZZZ9',nv:0},{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A527Tran_TipoEntra',fld:'TRAN_TIPOENTRA',pic:'',nv:''},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A49Tran_CodigoMovimiento',fld:'TRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A55Tran_FechaRegistro',fld:'TRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'A56Tran_IdCuentadanteResponsabili',fld:'TRAN_IDCUENTADANTERESPONSABILI',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A719Tran_TransaccResponsabilidad',fld:'TRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'A720Tran_FechaResponsabilidad',fld:'TRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'A758Tran_TablaResponsabilidad',fld:'TRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''}],oparms:[{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''},{av:'AV89Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV91Tran_CodTipoElemento',fld:'vTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV96Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV90Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV92Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV93Tran_FechaRegistro',fld:'vTRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'AV6Tran_IdCuentadanteResponsabilidad',fld:'vTRAN_IDCUENTADANTERESPONSABILIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8Tran_TransaccResponsabilidad',fld:'vTRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV5Tran_FechaResponsabilidad',fld:'vTRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'AV7Tran_TablaResponsabilidad',fld:'vTRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'cmbavCat_bien'},{ctrl:'NUEVOGRUPO',prop:'Visible'},{av:'AV15Cat_Bien',fld:'vCAT_BIEN',pic:'',nv:''}]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV31Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV11Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A658TDet_Agrupado',fld:'TDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'A817TDet_PlacaRecuperada',fld:'TDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV71SWRatificar',fld:'vSWRATIFICAR',pic:'ZZZ9',nv:0},{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A527Tran_TipoEntra',fld:'TRAN_TIPOENTRA',pic:'',nv:''},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A49Tran_CodigoMovimiento',fld:'TRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A55Tran_FechaRegistro',fld:'TRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'A56Tran_IdCuentadanteResponsabili',fld:'TRAN_IDCUENTADANTERESPONSABILI',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A719Tran_TransaccResponsabilidad',fld:'TRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'A720Tran_FechaResponsabilidad',fld:'TRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'A758Tran_TablaResponsabilidad',fld:'TRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''}],oparms:[{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''},{av:'AV89Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV91Tran_CodTipoElemento',fld:'vTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV96Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV90Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV92Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV93Tran_FechaRegistro',fld:'vTRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'AV6Tran_IdCuentadanteResponsabilidad',fld:'vTRAN_IDCUENTADANTERESPONSABILIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8Tran_TransaccResponsabilidad',fld:'vTRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV5Tran_FechaResponsabilidad',fld:'vTRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'AV7Tran_TablaResponsabilidad',fld:'vTRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'cmbavCat_bien'},{ctrl:'NUEVOGRUPO',prop:'Visible'},{av:'AV15Cat_Bien',fld:'vCAT_BIEN',pic:'',nv:''}]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV31Eliminar',fld:'vELIMINAR',pic:'',nv:''},{av:'AV11Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'A525TDet_Atributos',fld:'TDET_ATRIBUTOS',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A658TDet_Agrupado',fld:'TDET_AGRUPADO',pic:'ZZZ9',nv:0},{av:'A817TDet_PlacaRecuperada',fld:'TDET_PLACARECUPERADA',pic:'',nv:''},{av:'AV71SWRatificar',fld:'vSWRATIFICAR',pic:'ZZZ9',nv:0},{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV94Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A48Tran_CentroCostoId',fld:'TRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A527Tran_TipoEntra',fld:'TRAN_TIPOENTRA',pic:'',nv:''},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A49Tran_CodigoMovimiento',fld:'TRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A55Tran_FechaRegistro',fld:'TRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'A56Tran_IdCuentadanteResponsabili',fld:'TRAN_IDCUENTADANTERESPONSABILI',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A719Tran_TransaccResponsabilidad',fld:'TRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'A720Tran_FechaResponsabilidad',fld:'TRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'A758Tran_TablaResponsabilidad',fld:'TRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''}],oparms:[{av:'AV42OPC',fld:'vOPC',pic:'ZZZ9',nv:0},{av:'cmbavTipoentrada'},{av:'AV87TipoEntrada',fld:'vTIPOENTRADA',pic:'',nv:''},{av:'AV89Tran_CentroCostoId',fld:'vTRAN_CENTROCOSTOID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV95Tran_TipoEntra',fld:'vTRAN_TIPOENTRA',pic:'',nv:''},{av:'AV91Tran_CodTipoElemento',fld:'vTRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV96Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV90Tran_CodigoMovimiento',fld:'vTRAN_CODIGOMOVIMIENTO',pic:'',nv:''},{av:'AV92Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV93Tran_FechaRegistro',fld:'vTRAN_FECHAREGISTRO',pic:'99/99/99 99:99',nv:''},{av:'AV6Tran_IdCuentadanteResponsabilidad',fld:'vTRAN_IDCUENTADANTERESPONSABILIDAD',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8Tran_TransaccResponsabilidad',fld:'vTRAN_TRANSACCRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV5Tran_FechaResponsabilidad',fld:'vTRAN_FECHARESPONSABILIDAD',pic:'',nv:''},{av:'AV7Tran_TablaResponsabilidad',fld:'vTRAN_TABLARESPONSABILIDAD',pic:'ZZZ9',nv:0},{av:'AV57SWDeTr',fld:'vSWDETR',pic:'ZZZ9',nv:0},{av:'cmbavCat_bien'},{ctrl:'NUEVOGRUPO',prop:'Visible'},{av:'AV15Cat_Bien',fld:'vCAT_BIEN',pic:'',nv:''}]}");
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
      AV31Eliminar = "" ;
      AV11Atributos = "" ;
      AV95Tran_TipoEntra = "" ;
      A527Tran_TipoEntra = "" ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      A49Tran_CodigoMovimiento = "" ;
      A55Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      A720Tran_FechaResponsabilidad = GXutil.nullDate() ;
      AV87TipoEntrada = "" ;
      A525TDet_Atributos = "" ;
      A66Elem_Consecutivo = "" ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      A505TDet_EsPadre = "" ;
      A298Cata_Descripcion = "" ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      A817TDet_PlacaRecuperada = "" ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      AV96Tran_ValorTransaccion = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV86TIP_Codigo = "" ;
      AV56SEG_Codigo = "" ;
      AV33FAM_Codigo = "" ;
      AV21Clas_Codigo = "" ;
      AV16Cata_Codigo = "" ;
      AV90Tran_CodigoMovimiento = "" ;
      AV54SDTDetalleTrn = new com.orions2.SdtSDTDetalleTrn(remoteHandle, context);
      AV41Observaciones = "" ;
      AV49pTDet_PlacaPadre = "" ;
      A557Elem_Descripcion = "" ;
      A74TIP_Codigo = "" ;
      A75SEG_Codigo = "" ;
      A35FAM_Codigo = "" ;
      A34Clas_Codigo = "" ;
      A37Cata_Codigo = "" ;
      AV13C = DecimalUtil.ZERO ;
      AV97Usuario = "" ;
      AV98valor = DecimalUtil.ZERO ;
      AV5Tran_FechaResponsabilidad = GXutil.nullDate() ;
      AV46pObservaciones = "" ;
      AV44PCata_Descripcion = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      AV93Tran_FechaRegistro = GXutil.resetTime( GXutil.nullDate() );
      AV15Cat_Bien = "" ;
      bttNuevogrupo_Jsonclick = "" ;
      AV19cElem_Consecutivo = "" ;
      sImgUrl = "" ;
      imgImage1_Jsonclick = "" ;
      AV18cCata_Descripcion = "" ;
      AV20cElem_Descripcion = "" ;
      imgImageplaca_Jsonclick = "" ;
      AV45PlacaRecuperada = "" ;
      AV99ValorUnitario = DecimalUtil.ZERO ;
      AV26Costo_Adquisicion = DecimalUtil.ZERO ;
      AV43Otros_Costos = DecimalUtil.ZERO ;
      AV100VF = DecimalUtil.ZERO ;
      AV27Costo_Desmantelamiento = DecimalUtil.ZERO ;
      AV88Total_Costos = DecimalUtil.ZERO ;
      bttButton1_Jsonclick = "" ;
      lblTitleatributos_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV30Elem_Consecutivo = "" ;
      AV17Cata_Descripcion = "" ;
      AV80TDet_PlacaNumero = "" ;
      AV81TDet_PlacaPadre = "" ;
      AV85TDet_ValorUnitario = DecimalUtil.ZERO ;
      AV79TDet_Otros_Costos = DecimalUtil.ZERO ;
      AV82TDet_Valor_Presente = DecimalUtil.ZERO ;
      AV84TDet_ValorTotal = DecimalUtil.ZERO ;
      AV77TDet_EsPadre = "" ;
      AV103TDet_PlacaRecuperada = "" ;
      bttButton2_Jsonclick = "" ;
      bttButton3_Jsonclick = "" ;
      lblUrl_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV107Atributos_GXI = "" ;
      AV106Eliminar_GXI = "" ;
      hsh = "" ;
      AV101websession = httpContext.getWebSession();
      scmdbuf = "" ;
      H001V2_A37Cata_Codigo = new String[] {""} ;
      H001V2_A46Tran_Id = new long[1] ;
      H001V2_A487TDet_Cantidad = new long[1] ;
      H001V2_A66Elem_Consecutivo = new String[] {""} ;
      H001V2_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001V2_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001V2_A490TDet_PlacaNumero = new String[] {""} ;
      H001V2_n490TDet_PlacaNumero = new boolean[] {false} ;
      H001V2_A491TDet_PlacaPadre = new String[] {""} ;
      H001V2_n491TDet_PlacaPadre = new boolean[] {false} ;
      H001V2_A505TDet_EsPadre = new String[] {""} ;
      H001V2_A525TDet_Atributos = new String[] {""} ;
      H001V2_A298Cata_Descripcion = new String[] {""} ;
      H001V2_A653TDet_Valor_Presente = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001V2_n653TDet_Valor_Presente = new boolean[] {false} ;
      H001V2_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001V2_n657TDet_Otros_Costos = new boolean[] {false} ;
      H001V2_A658TDet_Agrupado = new short[1] ;
      H001V2_n658TDet_Agrupado = new boolean[] {false} ;
      H001V2_A817TDet_PlacaRecuperada = new String[] {""} ;
      H001V2_n817TDet_PlacaRecuperada = new boolean[] {false} ;
      H001V2_A69TDet_Consecutivo = new long[1] ;
      AV73TDet_Atributos = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      GXv_int1 = new long [1] ;
      GXv_int3 = new short [1] ;
      AV50Respuesta = "" ;
      GXv_char4 = new String [1] ;
      AV9URL = "" ;
      H001V3_A69TDet_Consecutivo = new long[1] ;
      H001V3_A658TDet_Agrupado = new short[1] ;
      H001V3_n658TDet_Agrupado = new boolean[] {false} ;
      H001V3_A505TDet_EsPadre = new String[] {""} ;
      H001V3_A46Tran_Id = new long[1] ;
      H001V4_A69TDet_Consecutivo = new long[1] ;
      H001V4_A658TDet_Agrupado = new short[1] ;
      H001V4_n658TDet_Agrupado = new boolean[] {false} ;
      H001V4_A505TDet_EsPadre = new String[] {""} ;
      H001V4_A46Tran_Id = new long[1] ;
      H001V5_A69TDet_Consecutivo = new long[1] ;
      H001V5_A658TDet_Agrupado = new short[1] ;
      H001V5_n658TDet_Agrupado = new boolean[] {false} ;
      H001V5_A505TDet_EsPadre = new String[] {""} ;
      H001V5_A46Tran_Id = new long[1] ;
      H001V6_A69TDet_Consecutivo = new long[1] ;
      H001V6_A658TDet_Agrupado = new short[1] ;
      H001V6_n658TDet_Agrupado = new boolean[] {false} ;
      H001V6_A505TDet_EsPadre = new String[] {""} ;
      H001V6_A46Tran_Id = new long[1] ;
      H001V7_A69TDet_Consecutivo = new long[1] ;
      H001V7_A658TDet_Agrupado = new short[1] ;
      H001V7_n658TDet_Agrupado = new boolean[] {false} ;
      H001V7_A505TDet_EsPadre = new String[] {""} ;
      H001V7_A46Tran_Id = new long[1] ;
      H001V8_A69TDet_Consecutivo = new long[1] ;
      H001V8_A658TDet_Agrupado = new short[1] ;
      H001V8_n658TDet_Agrupado = new boolean[] {false} ;
      H001V8_A505TDet_EsPadre = new String[] {""} ;
      H001V8_A46Tran_Id = new long[1] ;
      H001V9_A46Tran_Id = new long[1] ;
      H001V9_A48Tran_CentroCostoId = new long[1] ;
      H001V9_A527Tran_TipoEntra = new String[] {""} ;
      H001V9_n527Tran_TipoEntra = new boolean[] {false} ;
      H001V9_A499Tran_CodTipoElemento = new long[1] ;
      H001V9_n499Tran_CodTipoElemento = new boolean[] {false} ;
      H001V9_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001V9_n483Tran_ValorTransaccion = new boolean[] {false} ;
      H001V9_A49Tran_CodigoMovimiento = new String[] {""} ;
      H001V9_A513Tran_ConsecutivoCC = new long[1] ;
      H001V9_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      H001V9_A55Tran_FechaRegistro = new java.util.Date[] {GXutil.nullDate()} ;
      H001V9_A56Tran_IdCuentadanteResponsabili = new long[1] ;
      H001V9_n56Tran_IdCuentadanteResponsabili = new boolean[] {false} ;
      H001V9_A719Tran_TransaccResponsabilidad = new long[1] ;
      H001V9_n719Tran_TransaccResponsabilidad = new boolean[] {false} ;
      H001V9_A720Tran_FechaResponsabilidad = new java.util.Date[] {GXutil.nullDate()} ;
      H001V9_n720Tran_FechaResponsabilidad = new boolean[] {false} ;
      H001V9_A758Tran_TablaResponsabilidad = new short[1] ;
      H001V9_n758Tran_TablaResponsabilidad = new boolean[] {false} ;
      H001V10_A46Tran_Id = new long[1] ;
      H001V10_A69TDet_Consecutivo = new long[1] ;
      AV10A = DecimalUtil.ZERO ;
      H001V11_A658TDet_Agrupado = new short[1] ;
      H001V11_n658TDet_Agrupado = new boolean[] {false} ;
      H001V11_A505TDet_EsPadre = new String[] {""} ;
      H001V11_A66Elem_Consecutivo = new String[] {""} ;
      H001V11_A46Tran_Id = new long[1] ;
      H001V11_A69TDet_Consecutivo = new long[1] ;
      AV23Cons_Numero = "" ;
      H001V12_A69TDet_Consecutivo = new long[1] ;
      H001V12_A658TDet_Agrupado = new short[1] ;
      H001V12_n658TDet_Agrupado = new boolean[] {false} ;
      H001V12_A505TDet_EsPadre = new String[] {""} ;
      H001V12_A46Tran_Id = new long[1] ;
      H001V12_A490TDet_PlacaNumero = new String[] {""} ;
      H001V12_n490TDet_PlacaNumero = new boolean[] {false} ;
      H001V13_AV25ContadorPadres = new short[1] ;
      H001V14_A69TDet_Consecutivo = new long[1] ;
      H001V14_A505TDet_EsPadre = new String[] {""} ;
      H001V14_A46Tran_Id = new long[1] ;
      H001V15_A33Tipo_Codigo = new long[1] ;
      H001V15_A66Elem_Consecutivo = new String[] {""} ;
      H001V15_A557Elem_Descripcion = new String[] {""} ;
      H001V15_A74TIP_Codigo = new String[] {""} ;
      H001V15_A75SEG_Codigo = new String[] {""} ;
      H001V15_A298Cata_Descripcion = new String[] {""} ;
      H001V15_A35FAM_Codigo = new String[] {""} ;
      H001V15_A34Clas_Codigo = new String[] {""} ;
      H001V15_A37Cata_Codigo = new String[] {""} ;
      H001V16_A46Tran_Id = new long[1] ;
      H001V16_A69TDet_Consecutivo = new long[1] ;
      H001V17_A505TDet_EsPadre = new String[] {""} ;
      H001V17_A46Tran_Id = new long[1] ;
      H001V17_A66Elem_Consecutivo = new String[] {""} ;
      H001V17_A69TDet_Consecutivo = new long[1] ;
      H001V18_A505TDet_EsPadre = new String[] {""} ;
      H001V18_A46Tran_Id = new long[1] ;
      H001V18_A490TDet_PlacaNumero = new String[] {""} ;
      H001V18_n490TDet_PlacaNumero = new boolean[] {false} ;
      H001V18_A69TDet_Consecutivo = new long[1] ;
      GXv_boolean8 = new boolean [1] ;
      GXv_int2 = new long [1] ;
      GXv_char5 = new String [1] ;
      GXv_SdtSDTDetalleTrn7 = new com.orions2.SdtSDTDetalleTrn [1] ;
      GXv_char6 = new String [1] ;
      H001V19_A69TDet_Consecutivo = new long[1] ;
      H001V19_A46Tran_Id = new long[1] ;
      H001V19_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H001V19_A525TDet_Atributos = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wpcon_ent_dev__default(),
         new Object[] {
             new Object[] {
            H001V2_A37Cata_Codigo, H001V2_A46Tran_Id, H001V2_A487TDet_Cantidad, H001V2_A66Elem_Consecutivo, H001V2_A489TDet_ValorTotal, H001V2_A488TDet_ValorUnitario, H001V2_A490TDet_PlacaNumero, H001V2_n490TDet_PlacaNumero, H001V2_A491TDet_PlacaPadre, H001V2_n491TDet_PlacaPadre,
            H001V2_A505TDet_EsPadre, H001V2_A525TDet_Atributos, H001V2_A298Cata_Descripcion, H001V2_A653TDet_Valor_Presente, H001V2_n653TDet_Valor_Presente, H001V2_A657TDet_Otros_Costos, H001V2_n657TDet_Otros_Costos, H001V2_A658TDet_Agrupado, H001V2_n658TDet_Agrupado, H001V2_A817TDet_PlacaRecuperada,
            H001V2_n817TDet_PlacaRecuperada, H001V2_A69TDet_Consecutivo
            }
            , new Object[] {
            H001V3_A69TDet_Consecutivo, H001V3_A658TDet_Agrupado, H001V3_n658TDet_Agrupado, H001V3_A505TDet_EsPadre, H001V3_A46Tran_Id
            }
            , new Object[] {
            H001V4_A69TDet_Consecutivo, H001V4_A658TDet_Agrupado, H001V4_n658TDet_Agrupado, H001V4_A505TDet_EsPadre, H001V4_A46Tran_Id
            }
            , new Object[] {
            H001V5_A69TDet_Consecutivo, H001V5_A658TDet_Agrupado, H001V5_n658TDet_Agrupado, H001V5_A505TDet_EsPadre, H001V5_A46Tran_Id
            }
            , new Object[] {
            H001V6_A69TDet_Consecutivo, H001V6_A658TDet_Agrupado, H001V6_n658TDet_Agrupado, H001V6_A505TDet_EsPadre, H001V6_A46Tran_Id
            }
            , new Object[] {
            H001V7_A69TDet_Consecutivo, H001V7_A658TDet_Agrupado, H001V7_n658TDet_Agrupado, H001V7_A505TDet_EsPadre, H001V7_A46Tran_Id
            }
            , new Object[] {
            H001V8_A69TDet_Consecutivo, H001V8_A658TDet_Agrupado, H001V8_n658TDet_Agrupado, H001V8_A505TDet_EsPadre, H001V8_A46Tran_Id
            }
            , new Object[] {
            H001V9_A46Tran_Id, H001V9_A48Tran_CentroCostoId, H001V9_A527Tran_TipoEntra, H001V9_n527Tran_TipoEntra, H001V9_A499Tran_CodTipoElemento, H001V9_n499Tran_CodTipoElemento, H001V9_A483Tran_ValorTransaccion, H001V9_n483Tran_ValorTransaccion, H001V9_A49Tran_CodigoMovimiento, H001V9_A513Tran_ConsecutivoCC,
            H001V9_n513Tran_ConsecutivoCC, H001V9_A55Tran_FechaRegistro, H001V9_A56Tran_IdCuentadanteResponsabili, H001V9_n56Tran_IdCuentadanteResponsabili, H001V9_A719Tran_TransaccResponsabilidad, H001V9_n719Tran_TransaccResponsabilidad, H001V9_A720Tran_FechaResponsabilidad, H001V9_n720Tran_FechaResponsabilidad, H001V9_A758Tran_TablaResponsabilidad, H001V9_n758Tran_TablaResponsabilidad
            }
            , new Object[] {
            H001V10_A46Tran_Id, H001V10_A69TDet_Consecutivo
            }
            , new Object[] {
            H001V11_A658TDet_Agrupado, H001V11_n658TDet_Agrupado, H001V11_A505TDet_EsPadre, H001V11_A66Elem_Consecutivo, H001V11_A46Tran_Id, H001V11_A69TDet_Consecutivo
            }
            , new Object[] {
            H001V12_A69TDet_Consecutivo, H001V12_A658TDet_Agrupado, H001V12_n658TDet_Agrupado, H001V12_A505TDet_EsPadre, H001V12_A46Tran_Id, H001V12_A490TDet_PlacaNumero, H001V12_n490TDet_PlacaNumero
            }
            , new Object[] {
            H001V13_AV25ContadorPadres
            }
            , new Object[] {
            H001V14_A69TDet_Consecutivo, H001V14_A505TDet_EsPadre, H001V14_A46Tran_Id
            }
            , new Object[] {
            H001V15_A33Tipo_Codigo, H001V15_A66Elem_Consecutivo, H001V15_A557Elem_Descripcion, H001V15_A74TIP_Codigo, H001V15_A75SEG_Codigo, H001V15_A298Cata_Descripcion, H001V15_A35FAM_Codigo, H001V15_A34Clas_Codigo, H001V15_A37Cata_Codigo
            }
            , new Object[] {
            H001V16_A46Tran_Id, H001V16_A69TDet_Consecutivo
            }
            , new Object[] {
            H001V17_A505TDet_EsPadre, H001V17_A46Tran_Id, H001V17_A66Elem_Consecutivo, H001V17_A69TDet_Consecutivo
            }
            , new Object[] {
            H001V18_A505TDet_EsPadre, H001V18_A46Tran_Id, H001V18_A490TDet_PlacaNumero, H001V18_n490TDet_PlacaNumero, H001V18_A69TDet_Consecutivo
            }
            , new Object[] {
            H001V19_A69TDet_Consecutivo, H001V19_A46Tran_Id, H001V19_A489TDet_ValorTotal, H001V19_A525TDet_Atributos
            }
         }
      );
      AV47pRespuesta = false ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTran_consecutivocc_Enabled = 0 ;
      edtavTran_fecharegistro_Enabled = 0 ;
      edtavCcata_descripcion_Enabled = 0 ;
      edtavCelem_descripcion_Enabled = 0 ;
      edtavPlacarecuperada_Enabled = 0 ;
      edtavCosto_adquisicion_Enabled = 0 ;
      edtavCosto_desmantelamiento_Enabled = 0 ;
      edtavTotal_costos_Enabled = 0 ;
      edtavTran_valortransaccion_Enabled = 0 ;
      edtavTdet_consecutivo_Enabled = 0 ;
      edtavElem_consecutivo_Enabled = 0 ;
      edtavCata_descripcion_Enabled = 0 ;
      edtavTdet_placanumero_Enabled = 0 ;
      edtavTdet_placapadre_Enabled = 0 ;
      edtavTdet_cantidad_Enabled = 0 ;
      edtavTdet_valorunitario_Enabled = 0 ;
      edtavTdet_otros_costos_Enabled = 0 ;
      edtavTdet_valor_presente_Enabled = 0 ;
      edtavTdet_valortotal_Enabled = 0 ;
      edtavTdet_espadre_Enabled = 0 ;
      edtavTdet_agrupado_Enabled = 0 ;
      edtavTdet_placarecuperada_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte edtavElem_consecutivo_Fontbold ;
   private byte edtavCata_descripcion_Fontbold ;
   private byte edtavTdet_placanumero_Fontbold ;
   private byte edtavTdet_placapadre_Fontbold ;
   private byte edtavTdet_cantidad_Fontbold ;
   private byte edtavTdet_valorunitario_Fontbold ;
   private byte edtavTdet_otros_costos_Fontbold ;
   private byte edtavTdet_valor_presente_Fontbold ;
   private byte edtavTdet_valortotal_Fontbold ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte AV112GXLvl398 ;
   private byte AV125GXLvl959 ;
   private byte subGrid1_Backstyle ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_104 ;
   private short nGXsfl_104_idx=1 ;
   private short AV42OPC ;
   private short AV57SWDeTr ;
   private short A758Tran_TablaResponsabilidad ;
   private short A658TDet_Agrupado ;
   private short AV71SWRatificar ;
   private short AV62SWError ;
   private short AV63SWErrorPadre ;
   private short AV59SWEliminar ;
   private short AV68SWNuevoGrupo ;
   private short AV7Tran_TablaResponsabilidad ;
   private short wbEnd ;
   private short wbStart ;
   private short AV37I ;
   private short AV40N ;
   private short AV72TDet_Agrupado ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int3[] ;
   private short AV102WindowsId ;
   private short AV64SWErrorRati ;
   private short AV38Index ;
   private short AV25ContadorPadres ;
   private short cV25ContadorPadres ;
   private int subGrid1_Rows ;
   private int edtavTran_consecutivocc_Enabled ;
   private int edtavTran_fecharegistro_Enabled ;
   private int bttNuevogrupo_Visible ;
   private int edtavCelem_consecutivo_Enabled ;
   private int edtavCcata_descripcion_Enabled ;
   private int edtavCelem_descripcion_Enabled ;
   private int imgImageplaca_Visible ;
   private int edtavPlacarecuperada_Visible ;
   private int edtavPlacarecuperada_Enabled ;
   private int edtavCantidad_Enabled ;
   private int edtavValorunitario_Enabled ;
   private int edtavCosto_adquisicion_Enabled ;
   private int edtavOtros_costos_Enabled ;
   private int edtavVf_Enabled ;
   private int edtavI_Enabled ;
   private int edtavN_Enabled ;
   private int edtavCosto_desmantelamiento_Enabled ;
   private int edtavTotal_costos_Enabled ;
   private int bttButton1_Visible ;
   private int edtavTran_valortransaccion_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavTdet_consecutivo_Enabled ;
   private int edtavElem_consecutivo_Forecolor ;
   private int edtavElem_consecutivo_Enabled ;
   private int edtavCata_descripcion_Forecolor ;
   private int edtavCata_descripcion_Enabled ;
   private int edtavTdet_placanumero_Forecolor ;
   private int edtavTdet_placanumero_Enabled ;
   private int edtavTdet_placapadre_Forecolor ;
   private int edtavTdet_placapadre_Enabled ;
   private int edtavTdet_cantidad_Forecolor ;
   private int edtavTdet_cantidad_Enabled ;
   private int edtavTdet_valorunitario_Forecolor ;
   private int edtavTdet_valorunitario_Enabled ;
   private int edtavTdet_otros_costos_Forecolor ;
   private int edtavTdet_otros_costos_Enabled ;
   private int edtavTdet_valor_presente_Forecolor ;
   private int edtavTdet_valor_presente_Enabled ;
   private int edtavTdet_valortotal_Forecolor ;
   private int edtavTdet_valortotal_Enabled ;
   private int edtavTdet_espadre_Enabled ;
   private int edtavTdet_agrupado_Enabled ;
   private int edtavTdet_placarecuperada_Enabled ;
   private int edtavAtributos_Enabled ;
   private int edtavEliminar_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int bttButton2_Visible ;
   private int lblUrl_Visible ;
   private int subGrid1_Islastpage ;
   private int GRID1_nGridOutOfScope ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavTdet_consecutivo_Visible ;
   private int edtavElem_consecutivo_Visible ;
   private int edtavCata_descripcion_Visible ;
   private int edtavTdet_placanumero_Visible ;
   private int edtavTdet_placapadre_Visible ;
   private int edtavTdet_cantidad_Visible ;
   private int edtavTdet_valorunitario_Visible ;
   private int edtavTdet_otros_costos_Visible ;
   private int edtavTdet_valor_presente_Visible ;
   private int edtavTdet_valortotal_Visible ;
   private int edtavTdet_espadre_Visible ;
   private int edtavTdet_agrupado_Visible ;
   private int edtavTdet_placarecuperada_Visible ;
   private int edtavAtributos_Visible ;
   private int edtavEliminar_Visible ;
   private long wcpOAV94Tran_Id ;
   private long A46Tran_Id ;
   private long AV94Tran_Id ;
   private long A48Tran_CentroCostoId ;
   private long A499Tran_CodTipoElemento ;
   private long A513Tran_ConsecutivoCC ;
   private long A56Tran_IdCuentadanteResponsabili ;
   private long A719Tran_TransaccResponsabilidad ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long GRID1_nFirstRecordOnPage ;
   private long AV89Tran_CentroCostoId ;
   private long AV29cTDet_Consecutivo ;
   private long AV48pTDet_Consecutivo ;
   private long A33Tipo_Codigo ;
   private long AV91Tran_CodTipoElemento ;
   private long AV6Tran_IdCuentadanteResponsabilidad ;
   private long AV8Tran_TransaccResponsabilidad ;
   private long AV92Tran_ConsecutivoCC ;
   private long AV14Cantidad ;
   private long AV76TDet_Consecutivo ;
   private long AV74TDet_Cantidad ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long GXv_int1[] ;
   private long GXv_int2[] ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private java.math.BigDecimal AV96Tran_ValorTransaccion ;
   private java.math.BigDecimal AV13C ;
   private java.math.BigDecimal AV98valor ;
   private java.math.BigDecimal AV99ValorUnitario ;
   private java.math.BigDecimal AV26Costo_Adquisicion ;
   private java.math.BigDecimal AV43Otros_Costos ;
   private java.math.BigDecimal AV100VF ;
   private java.math.BigDecimal AV27Costo_Desmantelamiento ;
   private java.math.BigDecimal AV88Total_Costos ;
   private java.math.BigDecimal AV85TDet_ValorUnitario ;
   private java.math.BigDecimal AV79TDet_Otros_Costos ;
   private java.math.BigDecimal AV82TDet_Valor_Presente ;
   private java.math.BigDecimal AV84TDet_ValorTotal ;
   private java.math.BigDecimal AV10A ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_104_idx="0001" ;
   private String AV95Tran_TipoEntra ;
   private String A527Tran_TipoEntra ;
   private String AV87TipoEntrada ;
   private String GXKey ;
   private String forbiddenHiddens ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
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
   private String divFormcontainer_Internalname ;
   private String edtavTran_consecutivocc_Internalname ;
   private String TempTags ;
   private String edtavTran_consecutivocc_Jsonclick ;
   private String edtavTran_fecharegistro_Internalname ;
   private String edtavTran_fecharegistro_Jsonclick ;
   private String AV15Cat_Bien ;
   private String bttNuevogrupo_Internalname ;
   private String bttNuevogrupo_Jsonclick ;
   private String edtavCelem_consecutivo_Internalname ;
   private String edtavCelem_consecutivo_Jsonclick ;
   private String sImgUrl ;
   private String imgImage1_Internalname ;
   private String imgImage1_Jsonclick ;
   private String edtavCcata_descripcion_Internalname ;
   private String edtavCelem_descripcion_Internalname ;
   private String imgImageplaca_Internalname ;
   private String imgImageplaca_Jsonclick ;
   private String edtavPlacarecuperada_Internalname ;
   private String edtavPlacarecuperada_Jsonclick ;
   private String edtavCantidad_Internalname ;
   private String edtavCantidad_Jsonclick ;
   private String edtavValorunitario_Internalname ;
   private String edtavValorunitario_Jsonclick ;
   private String edtavCosto_adquisicion_Internalname ;
   private String edtavCosto_adquisicion_Jsonclick ;
   private String edtavOtros_costos_Internalname ;
   private String edtavOtros_costos_Jsonclick ;
   private String edtavVf_Internalname ;
   private String edtavVf_Jsonclick ;
   private String edtavI_Internalname ;
   private String edtavI_Jsonclick ;
   private String edtavN_Internalname ;
   private String edtavN_Jsonclick ;
   private String edtavCosto_desmantelamiento_Internalname ;
   private String edtavCosto_desmantelamiento_Jsonclick ;
   private String edtavTotal_costos_Internalname ;
   private String edtavTotal_costos_Jsonclick ;
   private String bttButton1_Internalname ;
   private String bttButton1_Jsonclick ;
   private String edtavTran_valortransaccion_Internalname ;
   private String edtavTran_valortransaccion_Jsonclick ;
   private String divTable2_Internalname ;
   private String lblTitleatributos_Internalname ;
   private String lblTitleatributos_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String bttButton2_Internalname ;
   private String bttButton2_Jsonclick ;
   private String bttButton3_Internalname ;
   private String bttButton3_Caption ;
   private String bttButton3_Jsonclick ;
   private String lblUrl_Internalname ;
   private String lblUrl_Caption ;
   private String lblUrl_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTdet_consecutivo_Internalname ;
   private String edtavElem_consecutivo_Internalname ;
   private String edtavCata_descripcion_Internalname ;
   private String edtavTdet_placanumero_Internalname ;
   private String edtavTdet_placapadre_Internalname ;
   private String edtavTdet_cantidad_Internalname ;
   private String edtavTdet_valorunitario_Internalname ;
   private String edtavTdet_otros_costos_Internalname ;
   private String edtavTdet_valor_presente_Internalname ;
   private String edtavTdet_valortotal_Internalname ;
   private String edtavTdet_espadre_Internalname ;
   private String edtavTdet_agrupado_Internalname ;
   private String edtavTdet_placarecuperada_Internalname ;
   private String edtavAtributos_Internalname ;
   private String edtavEliminar_Internalname ;
   private String hsh ;
   private String scmdbuf ;
   private String Alertify1_Internalname ;
   private String AV50Respuesta ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String sGXsfl_104_fel_idx="0001" ;
   private String ROClassString ;
   private String edtavTdet_consecutivo_Jsonclick ;
   private String edtavElem_consecutivo_Jsonclick ;
   private String edtavCata_descripcion_Jsonclick ;
   private String edtavTdet_placanumero_Jsonclick ;
   private String edtavTdet_placapadre_Jsonclick ;
   private String edtavTdet_cantidad_Jsonclick ;
   private String edtavTdet_valorunitario_Jsonclick ;
   private String edtavTdet_otros_costos_Jsonclick ;
   private String edtavTdet_valor_presente_Jsonclick ;
   private String edtavTdet_valortotal_Jsonclick ;
   private String edtavTdet_espadre_Jsonclick ;
   private String edtavTdet_agrupado_Jsonclick ;
   private String edtavTdet_placarecuperada_Jsonclick ;
   private String edtavAtributos_Jsonclick ;
   private String edtavEliminar_Jsonclick ;
   private java.util.Date A55Tran_FechaRegistro ;
   private java.util.Date AV93Tran_FechaRegistro ;
   private java.util.Date A720Tran_FechaResponsabilidad ;
   private java.util.Date AV5Tran_FechaResponsabilidad ;
   private boolean entryPointCalled ;
   private boolean n527Tran_TipoEntra ;
   private boolean n499Tran_CodTipoElemento ;
   private boolean n483Tran_ValorTransaccion ;
   private boolean n513Tran_ConsecutivoCC ;
   private boolean n56Tran_IdCuentadanteResponsabili ;
   private boolean n719Tran_TransaccResponsabilidad ;
   private boolean n720Tran_FechaResponsabilidad ;
   private boolean n758Tran_TablaResponsabilidad ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n653TDet_Valor_Presente ;
   private boolean n657TDet_Otros_Costos ;
   private boolean n658TDet_Agrupado ;
   private boolean n817TDet_PlacaRecuperada ;
   private boolean toggleJsOutput ;
   private boolean AV47pRespuesta ;
   private boolean AV61SWErroPadreHijo ;
   private boolean AV60SWErroPadre ;
   private boolean AV70SWPedreGrupo ;
   private boolean AV65SWHijoGrupo ;
   private boolean AV67SWHijoGrupoDesagrupado ;
   private boolean AV66SWHijoGrupoAgrupado ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_104_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV69SWPadres ;
   private boolean GXv_boolean8[] ;
   private boolean AV11Atributos_IsBlob ;
   private boolean AV31Eliminar_IsBlob ;
   private String A49Tran_CodigoMovimiento ;
   private String A525TDet_Atributos ;
   private String A66Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private String A505TDet_EsPadre ;
   private String A298Cata_Descripcion ;
   private String A817TDet_PlacaRecuperada ;
   private String AV86TIP_Codigo ;
   private String AV56SEG_Codigo ;
   private String AV33FAM_Codigo ;
   private String AV21Clas_Codigo ;
   private String AV16Cata_Codigo ;
   private String AV90Tran_CodigoMovimiento ;
   private String AV41Observaciones ;
   private String AV49pTDet_PlacaPadre ;
   private String A557Elem_Descripcion ;
   private String A74TIP_Codigo ;
   private String A75SEG_Codigo ;
   private String A35FAM_Codigo ;
   private String A34Clas_Codigo ;
   private String A37Cata_Codigo ;
   private String AV97Usuario ;
   private String AV46pObservaciones ;
   private String AV44PCata_Descripcion ;
   private String AV19cElem_Consecutivo ;
   private String AV18cCata_Descripcion ;
   private String AV20cElem_Descripcion ;
   private String AV45PlacaRecuperada ;
   private String AV30Elem_Consecutivo ;
   private String AV17Cata_Descripcion ;
   private String AV80TDet_PlacaNumero ;
   private String AV81TDet_PlacaPadre ;
   private String AV77TDet_EsPadre ;
   private String AV103TDet_PlacaRecuperada ;
   private String AV107Atributos_GXI ;
   private String AV106Eliminar_GXI ;
   private String AV73TDet_Atributos ;
   private String AV9URL ;
   private String AV23Cons_Numero ;
   private String AV31Eliminar ;
   private String AV11Atributos ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV101websession ;
   private HTMLChoice cmbavTipoentrada ;
   private HTMLChoice cmbavCat_bien ;
   private IDataStoreProvider pr_default ;
   private String[] H001V2_A37Cata_Codigo ;
   private long[] H001V2_A46Tran_Id ;
   private long[] H001V2_A487TDet_Cantidad ;
   private String[] H001V2_A66Elem_Consecutivo ;
   private java.math.BigDecimal[] H001V2_A489TDet_ValorTotal ;
   private java.math.BigDecimal[] H001V2_A488TDet_ValorUnitario ;
   private String[] H001V2_A490TDet_PlacaNumero ;
   private boolean[] H001V2_n490TDet_PlacaNumero ;
   private String[] H001V2_A491TDet_PlacaPadre ;
   private boolean[] H001V2_n491TDet_PlacaPadre ;
   private String[] H001V2_A505TDet_EsPadre ;
   private String[] H001V2_A525TDet_Atributos ;
   private String[] H001V2_A298Cata_Descripcion ;
   private java.math.BigDecimal[] H001V2_A653TDet_Valor_Presente ;
   private boolean[] H001V2_n653TDet_Valor_Presente ;
   private java.math.BigDecimal[] H001V2_A657TDet_Otros_Costos ;
   private boolean[] H001V2_n657TDet_Otros_Costos ;
   private short[] H001V2_A658TDet_Agrupado ;
   private boolean[] H001V2_n658TDet_Agrupado ;
   private String[] H001V2_A817TDet_PlacaRecuperada ;
   private boolean[] H001V2_n817TDet_PlacaRecuperada ;
   private long[] H001V2_A69TDet_Consecutivo ;
   private long[] H001V3_A69TDet_Consecutivo ;
   private short[] H001V3_A658TDet_Agrupado ;
   private boolean[] H001V3_n658TDet_Agrupado ;
   private String[] H001V3_A505TDet_EsPadre ;
   private long[] H001V3_A46Tran_Id ;
   private long[] H001V4_A69TDet_Consecutivo ;
   private short[] H001V4_A658TDet_Agrupado ;
   private boolean[] H001V4_n658TDet_Agrupado ;
   private String[] H001V4_A505TDet_EsPadre ;
   private long[] H001V4_A46Tran_Id ;
   private long[] H001V5_A69TDet_Consecutivo ;
   private short[] H001V5_A658TDet_Agrupado ;
   private boolean[] H001V5_n658TDet_Agrupado ;
   private String[] H001V5_A505TDet_EsPadre ;
   private long[] H001V5_A46Tran_Id ;
   private long[] H001V6_A69TDet_Consecutivo ;
   private short[] H001V6_A658TDet_Agrupado ;
   private boolean[] H001V6_n658TDet_Agrupado ;
   private String[] H001V6_A505TDet_EsPadre ;
   private long[] H001V6_A46Tran_Id ;
   private long[] H001V7_A69TDet_Consecutivo ;
   private short[] H001V7_A658TDet_Agrupado ;
   private boolean[] H001V7_n658TDet_Agrupado ;
   private String[] H001V7_A505TDet_EsPadre ;
   private long[] H001V7_A46Tran_Id ;
   private long[] H001V8_A69TDet_Consecutivo ;
   private short[] H001V8_A658TDet_Agrupado ;
   private boolean[] H001V8_n658TDet_Agrupado ;
   private String[] H001V8_A505TDet_EsPadre ;
   private long[] H001V8_A46Tran_Id ;
   private long[] H001V9_A46Tran_Id ;
   private long[] H001V9_A48Tran_CentroCostoId ;
   private String[] H001V9_A527Tran_TipoEntra ;
   private boolean[] H001V9_n527Tran_TipoEntra ;
   private long[] H001V9_A499Tran_CodTipoElemento ;
   private boolean[] H001V9_n499Tran_CodTipoElemento ;
   private java.math.BigDecimal[] H001V9_A483Tran_ValorTransaccion ;
   private boolean[] H001V9_n483Tran_ValorTransaccion ;
   private String[] H001V9_A49Tran_CodigoMovimiento ;
   private long[] H001V9_A513Tran_ConsecutivoCC ;
   private boolean[] H001V9_n513Tran_ConsecutivoCC ;
   private java.util.Date[] H001V9_A55Tran_FechaRegistro ;
   private long[] H001V9_A56Tran_IdCuentadanteResponsabili ;
   private boolean[] H001V9_n56Tran_IdCuentadanteResponsabili ;
   private long[] H001V9_A719Tran_TransaccResponsabilidad ;
   private boolean[] H001V9_n719Tran_TransaccResponsabilidad ;
   private java.util.Date[] H001V9_A720Tran_FechaResponsabilidad ;
   private boolean[] H001V9_n720Tran_FechaResponsabilidad ;
   private short[] H001V9_A758Tran_TablaResponsabilidad ;
   private boolean[] H001V9_n758Tran_TablaResponsabilidad ;
   private long[] H001V10_A46Tran_Id ;
   private long[] H001V10_A69TDet_Consecutivo ;
   private short[] H001V11_A658TDet_Agrupado ;
   private boolean[] H001V11_n658TDet_Agrupado ;
   private String[] H001V11_A505TDet_EsPadre ;
   private String[] H001V11_A66Elem_Consecutivo ;
   private long[] H001V11_A46Tran_Id ;
   private long[] H001V11_A69TDet_Consecutivo ;
   private long[] H001V12_A69TDet_Consecutivo ;
   private short[] H001V12_A658TDet_Agrupado ;
   private boolean[] H001V12_n658TDet_Agrupado ;
   private String[] H001V12_A505TDet_EsPadre ;
   private long[] H001V12_A46Tran_Id ;
   private String[] H001V12_A490TDet_PlacaNumero ;
   private boolean[] H001V12_n490TDet_PlacaNumero ;
   private short[] H001V13_AV25ContadorPadres ;
   private long[] H001V14_A69TDet_Consecutivo ;
   private String[] H001V14_A505TDet_EsPadre ;
   private long[] H001V14_A46Tran_Id ;
   private long[] H001V15_A33Tipo_Codigo ;
   private String[] H001V15_A66Elem_Consecutivo ;
   private String[] H001V15_A557Elem_Descripcion ;
   private String[] H001V15_A74TIP_Codigo ;
   private String[] H001V15_A75SEG_Codigo ;
   private String[] H001V15_A298Cata_Descripcion ;
   private String[] H001V15_A35FAM_Codigo ;
   private String[] H001V15_A34Clas_Codigo ;
   private String[] H001V15_A37Cata_Codigo ;
   private long[] H001V16_A46Tran_Id ;
   private long[] H001V16_A69TDet_Consecutivo ;
   private String[] H001V17_A505TDet_EsPadre ;
   private long[] H001V17_A46Tran_Id ;
   private String[] H001V17_A66Elem_Consecutivo ;
   private long[] H001V17_A69TDet_Consecutivo ;
   private String[] H001V18_A505TDet_EsPadre ;
   private long[] H001V18_A46Tran_Id ;
   private String[] H001V18_A490TDet_PlacaNumero ;
   private boolean[] H001V18_n490TDet_PlacaNumero ;
   private long[] H001V18_A69TDet_Consecutivo ;
   private long[] H001V19_A69TDet_Consecutivo ;
   private long[] H001V19_A46Tran_Id ;
   private java.math.BigDecimal[] H001V19_A489TDet_ValorTotal ;
   private String[] H001V19_A525TDet_Atributos ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.orions2.SdtSDTDetalleTrn AV54SDTDetalleTrn ;
   private com.orions2.SdtSDTDetalleTrn GXv_SdtSDTDetalleTrn7[] ;
}

final  class wpcon_ent_dev__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H001V2", "SELECT T2.Cata_Codigo, T1.Tran_Id, T1.TDet_Cantidad, T1.Elem_Consecutivo, T1.TDet_ValorTotal, T1.TDet_ValorUnitario, T1.TDet_PlacaNumero, T1.TDet_PlacaPadre, T1.TDet_EsPadre, T1.TDet_Atributos, T3.Cata_Descripcion, T1.TDet_Valor_Presente, T1.TDet_Otros_Costos, T1.TDet_Agrupado, T1.TDet_PlacaRecuperada, T1.TDet_Consecutivo FROM ((ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001V3", "SELECT * FROM (SELECT TDet_Consecutivo, TDet_Agrupado, TDet_EsPadre, Tran_Id FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (TDet_EsPadre = 'SI') AND (TDet_Agrupado = 0) ORDER BY Tran_Id) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V4", "SELECT * FROM (SELECT TDet_Consecutivo, TDet_Agrupado, TDet_EsPadre, Tran_Id FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (TDet_EsPadre = 'SI') AND (TDet_Agrupado = 1) ORDER BY Tran_Id) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V5", "SELECT * FROM (SELECT TDet_Consecutivo, TDet_Agrupado, TDet_EsPadre, Tran_Id FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (TDet_EsPadre = 'NO') AND (TDet_Agrupado = 1) ORDER BY Tran_Id) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V6", "SELECT * FROM (SELECT TDet_Consecutivo, TDet_Agrupado, TDet_EsPadre, Tran_Id FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (TDet_EsPadre = 'SI') AND (TDet_Agrupado = 0) ORDER BY Tran_Id) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V7", "SELECT * FROM (SELECT TDet_Consecutivo, TDet_Agrupado, TDet_EsPadre, Tran_Id FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (TDet_EsPadre = 'NO') AND (TDet_Agrupado = 0) ORDER BY Tran_Id) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V8", "SELECT * FROM (SELECT TDet_Consecutivo, TDet_Agrupado, TDet_EsPadre, Tran_Id FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (TDet_EsPadre = 'NO') AND (TDet_Agrupado = 0) ORDER BY Tran_Id) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V9", "SELECT T1.Tran_Id, T1.Tran_CentroCostoId, T1.Tran_TipoEntra, T2.Tipo_Codigo AS Tran_CodTipoElemento, T1.Tran_ValorTransaccion, T1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T1.Tran_ConsecutivoCC, T1.Tran_FechaRegistro, T1.Tran_IdCuentadanteResponsabili, T1.Tran_TransaccResponsabilidad, T1.Tran_FechaResponsabilidad, T1.Tran_TablaResponsabilidad FROM (ALM_TRANSACCION T1 INNER JOIN ALM_TIPO_MOVIMIENTO T2 ON T2.Tpmo_Codigo = T1.Tran_CodigoMovimiento) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V10", "SELECT Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001V11", "SELECT * FROM (SELECT TDet_Agrupado, TDet_EsPadre, Elem_Consecutivo, Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (Elem_Consecutivo = ?) AND (TDet_EsPadre = 'SI') AND (TDet_Agrupado = 0) ORDER BY Tran_Id, TDet_Consecutivo) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V12", "SELECT * FROM (SELECT TDet_Consecutivo, TDet_Agrupado, TDet_EsPadre, Tran_Id, TDet_PlacaNumero FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ? and TDet_Consecutivo > ?) AND (TDet_EsPadre = 'SI') AND (TDet_Agrupado = 0) ORDER BY Tran_Id, TDet_Consecutivo) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V13", "SELECT COUNT(*) FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (TDet_EsPadre = 'SI') AND (TDet_Agrupado = 0) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new ForEachCursor("H001V14", "SELECT TDet_Consecutivo, TDet_EsPadre, Tran_Id FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (TDet_EsPadre = 'SI') ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001V15", "SELECT T1.Tipo_Codigo, T1.Elem_Consecutivo, T1.Elem_Descripcion, T5.TIP_Codigo, T4.SEG_Codigo, T2.Cata_Descripcion, T3.FAM_Codigo, T2.Clas_Codigo, T1.Cata_Codigo FROM ((((ALM_ELEMENTO T1 INNER JOIN ALM_CATALOGO T2 ON T2.Cata_Codigo = T1.Cata_Codigo) INNER JOIN ALM_CLASE T3 ON T3.Clas_Codigo = T2.Clas_Codigo) INNER JOIN ALM_CAT_FAM T4 ON T4.FAM_Codigo = T3.FAM_Codigo) INNER JOIN ALM_CAT_SEG T5 ON T5.SEG_Codigo = T4.SEG_Codigo) WHERE (T1.Elem_Consecutivo = ?) AND (T1.Tipo_Codigo = ?) ORDER BY T1.Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V16", "SELECT Tran_Id, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H001V17", "SELECT * FROM (SELECT TDet_EsPadre, Tran_Id, Elem_Consecutivo, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (Elem_Consecutivo = ?) AND (TDet_EsPadre = 'SI') ORDER BY Tran_Id, TDet_Consecutivo) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V18", "SELECT * FROM (SELECT TDet_EsPadre, Tran_Id, TDet_PlacaNumero, TDet_Consecutivo FROM ALM_DETALLE_TRANSACCION WHERE (Tran_Id = ?) AND (TDet_EsPadre = 'SI') ORDER BY Tran_Id, TDet_Consecutivo) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H001V19", "SELECT TDet_Consecutivo, Tran_Id, TDet_ValorTotal, TDet_Atributos FROM ALM_DETALLE_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2) ;
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[12])[0] = rslt.getVarchar(11) ;
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(16) ;
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getString(3, 4) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[9])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 9);
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 15 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 9);
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

