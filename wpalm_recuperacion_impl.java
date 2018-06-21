/*
               File: wpalm_recuperacion_impl
        Description: Recuperación
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:21:39.46
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

public final  class wpalm_recuperacion_impl extends GXDataArea
{
   public wpalm_recuperacion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpalm_recuperacion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpalm_recuperacion_impl.class ));
   }

   public wpalm_recuperacion_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_43 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_43_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_43_idx = httpContext.GetNextPar( ) ;
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
            AV16Tran_ValorTransaccion = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV14Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            A483Tran_ValorTransaccion = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n483Tran_ValorTransaccion = false ;
            A499Tran_CodTipoElemento = GXutil.lval( httpContext.GetNextPar( )) ;
            n499Tran_CodTipoElemento = false ;
            A69TDet_Consecutivo = GXutil.lval( httpContext.GetNextPar( )) ;
            A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
            A487TDet_Cantidad = GXutil.lval( httpContext.GetNextPar( )) ;
            A488TDet_ValorUnitario = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A489TDet_ValorTotal = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A490TDet_PlacaNumero = httpContext.GetNextPar( ) ;
            n490TDet_PlacaNumero = false ;
            A491TDet_PlacaPadre = httpContext.GetNextPar( ) ;
            n491TDet_PlacaPadre = false ;
            A505TDet_EsPadre = httpContext.GetNextPar( ) ;
            A298Cata_Descripcion = httpContext.GetNextPar( ) ;
            A654TDet_Valor_Futuro = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n654TDet_Valor_Futuro = false ;
            A653TDet_Valor_Presente = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n653TDet_Valor_Presente = false ;
            A656TDet_Plazo_N = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
            n656TDet_Plazo_N = false ;
            A655TDet_Taza = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            n655TDet_Taza = false ;
            A657TDet_Otros_Costos = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n657TDet_Otros_Costos = false ;
            AV55ValorTotal = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            AV60Confirmar = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( AV16Tran_ValorTransaccion, A46Tran_Id, AV14Tran_Id, A483Tran_ValorTransaccion, A499Tran_CodTipoElemento, A69TDet_Consecutivo, A66Elem_Consecutivo, A487TDet_Cantidad, A488TDet_ValorUnitario, A489TDet_ValorTotal, A490TDet_PlacaNumero, A491TDet_PlacaPadre, A505TDet_EsPadre, A298Cata_Descripcion, A654TDet_Valor_Futuro, A653TDet_Valor_Presente, A656TDet_Plazo_N, A655TDet_Taza, A657TDet_Otros_Costos, AV55ValorTotal, AV60Confirmar) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = "hsh" + "WPALM_RECUPERACION" ;
            forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV12Tran_DescripcionMovimiento, "")) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
            GXutil.writeLogln("wpalm_recuperacion:[SendSecurityCheck]"+forbiddenHiddens);
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
            AV14Tran_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV57Cuen_Identificacion = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV57Cuen_Identificacion", GXutil.ltrim( GXutil.str( AV57Cuen_Identificacion, 18, 0)));
               AV50Tran_IdResponsabilidad = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50Tran_IdResponsabilidad", GXutil.ltrim( GXutil.str( AV50Tran_IdResponsabilidad, 11, 0)));
               AV25Fecha = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Fecha", localUtil.format(AV25Fecha, "99/99/99"));
               AV34Tabla = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34Tabla", GXutil.ltrim( GXutil.str( AV34Tabla, 4, 0)));
            }
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
      pa6S2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start6S2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414213957");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.wpalm_recuperacion") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV57Cuen_Identificacion,18,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV50Tran_IdResponsabilidad,11,0))) + "," + GXutil.URLEncode(GXutil.formatDateParm(AV25Fecha)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV34Tabla,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV14Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_VALORTRANSACCION", GXutil.ltrim( localUtil.ntoc( A483Tran_ValorTransaccion, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CODTIPOELEMENTO", GXutil.ltrim( localUtil.ntoc( A499Tran_CodTipoElemento, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CANTIDAD", GXutil.ltrim( localUtil.ntoc( A487TDet_Cantidad, (byte)(10), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORUNITARIO", GXutil.ltrim( localUtil.ntoc( A488TDet_ValorUnitario, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORTOTAL", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACANUMERO", A490TDet_PlacaNumero);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACAPADRE", A491TDet_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_ESPADRE", A505TDet_EsPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCION", A298Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALOR_FUTURO", GXutil.ltrim( localUtil.ntoc( A654TDet_Valor_Futuro, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALOR_PRESENTE", GXutil.ltrim( localUtil.ntoc( A653TDet_Valor_Presente, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLAZO_N", GXutil.ltrim( localUtil.ntoc( A656TDet_Plazo_N, (byte)(2), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_TAZA", GXutil.ltrim( localUtil.ntoc( A655TDet_Taza, (byte)(3), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_OTROS_COSTOS", GXutil.ltrim( localUtil.ntoc( A657TDet_Otros_Costos, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vVALORTOTAL", GXutil.ltrim( localUtil.ntoc( AV55ValorTotal, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCONFIRMAR", GXutil.ltrim( localUtil.ntoc( AV60Confirmar, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( AV57Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDRESPONSABILIDAD", GXutil.ltrim( localUtil.ntoc( AV50Tran_IdResponsabilidad, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vFECHA", localUtil.dtoc( AV25Fecha, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTABLA", GXutil.ltrim( localUtil.ntoc( AV34Tabla, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vINVD_ESTADO", AV26Invd_Estado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPLACAPADRE", AV31PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vVALORADQUISICION", GXutil.ltrim( localUtil.ntoc( AV53ValorAdquisicion, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vESPLACAPADRE", GXutil.rtrim( AV24EsPlacaPadre));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDENTRADA", GXutil.ltrim( localUtil.ntoc( AV49Tran_IdEntrada, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNRO_LINEA", GXutil.ltrim( localUtil.ntoc( AV27Nro_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ENTRADA", GXutil.ltrim( localUtil.ntoc( A71Tran_Entrada, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NRO_LINEA", GXutil.ltrim( localUtil.ntoc( A72Nro_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPOBSERVACIONES", AV32pObservaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPCATA_DESCRIPCION", AV29PCata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_DESCRIPCIONMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Tran_DescripcionMovimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_DESCRIPCIONMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Tran_DescripcionMovimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_DESCRIPCIONMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Tran_DescripcionMovimiento, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = "hsh" + "WPALM_RECUPERACION" ;
      forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV12Tran_DescripcionMovimiento, "")) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "hsh", GXutil.getEncryptedSignature( forbiddenHiddens, GXKey));
      GXutil.writeLogln("wpalm_recuperacion:[SendSecurityCheck]"+forbiddenHiddens);
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
         we6S2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt6S2( ) ;
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
      return formatLink("com.orions2.wpalm_recuperacion") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14Tran_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV57Cuen_Identificacion,18,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV50Tran_IdResponsabilidad,11,0))) + "," + GXutil.URLEncode(GXutil.formatDateParm(AV25Fecha)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV34Tabla,4,0))) ;
   }

   public String getPgmname( )
   {
      return "WPALM_RECUPERACION" ;
   }

   public String getPgmdesc( )
   {
      return "Recuperación" ;
   }

   public void wb6S0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-9 col-lg-offset-1", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_descripcionmovimiento_Internalname, AV12Tran_DescripcionMovimiento, GXutil.rtrim( localUtil.format( AV12Tran_DescripcionMovimiento, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,10);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_descripcionmovimiento_Jsonclick, 0, "BlobContentAttSubTitle", "", "", "", 1, edtavTran_descripcionmovimiento_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_WPALM_RECUPERACION.htm");
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
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-11 col-lg-offset-1", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "min-height:10px;", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_consecutivocc_Internalname, "Número de Transacción", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_consecutivocc_Internalname, GXutil.ltrim( localUtil.ntoc( AV11TRan_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11TRan_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,21);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_consecutivocc_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_consecutivocc_Enabled, 1, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_RECUPERACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-md-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavPlaca_Internalname, "Placa", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavPlaca_Internalname, AV30Placa, GXutil.rtrim( localUtil.format( AV30Placa, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "Número de Placa", edtavPlaca_Jsonclick, 0, "Attribute", "", "", "", 1, edtavPlaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Placa", "left", true, "HLP_WPALM_RECUPERACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "Image" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
         com.orions2.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "Seleccionar Devolutivo", "Seleccionar", 0, 0, 0, "px", 0, "px", 0, 0, 7, imgImage1_Jsonclick, "'"+""+"'"+",false,"+"'"+"e116s1_client"+"'", StyleString, ClassString, "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPALM_RECUPERACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-md-4 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCata_descripcion_Internalname, "Bien", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCata_descripcion_Internalname, AV19Cata_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,30);\"", (short)(0), 1, edtavCata_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPALM_RECUPERACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-5", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavObservaciones_Internalname, "Observaciones", "col-sm-3 AttributeLabel", 1, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavObservaciones_Internalname, AV28Observaciones, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", (short)(0), 1, edtavObservaciones_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WPALM_RECUPERACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttAgregar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", "Agregar", bttAgregar_Jsonclick, 5, "Agregar", "", StyleString, ClassString, bttAgregar_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'AGREGAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPALM_RECUPERACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavTran_valortransaccion_Internalname, "Valor total", "col-sm-3 AttributeLabel", 1, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavTran_valortransaccion_Internalname, GXutil.ltrim( localUtil.ntoc( AV16Tran_ValorTransaccion, (byte)(24), (byte)(2), ",", "")), ((edtavTran_valortransaccion_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV16Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV16Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTran_valortransaccion_Jsonclick, 0, "Attribute", "", "", "", 1, edtavTran_valortransaccion_Enabled, 0, "text", "", 24, "chr", 1, "row", 24, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_WPALM_RECUPERACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"43\">") ;
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
            httpContext.writeValue( "Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Es placa padre?") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Unitario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Otros Costos") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Futuro") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Taza") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Años") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Presente") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Valor Total") ;
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
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV37TDet_Consecutivo, (byte)(18), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV21Elem_Consecutivo);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavElem_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV20cCata_Descripcion);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCcata_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV39TDet_PlacaNumero);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_placanumero_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV38TDet_EsPadre);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_espadre_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV40TDet_PlacaPadre);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_placapadre_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV47TDet_ValorUnitario, (byte)(22), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_valorunitario_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV10TDet_Otros_Costos, (byte)(24), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_otros_costos_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV44TDet_Valor_Futuro, (byte)(24), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_valor_futuro_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42TDet_Taza, (byte)(3), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_taza_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41TDet_Plazo_N, (byte)(2), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_plazo_n_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45TDet_Valor_Presente, (byte)(24), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_valor_presente_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV46TDet_ValorTotal, (byte)(22), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdet_valortotal_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV18Atributos));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAtributos_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV22EliminarItem));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminaritem_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (short)(nGXsfl_43_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", "Confirmar", bttButton1_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttButton1_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'CONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPALM_RECUPERACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttButton2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", bttButton2_Caption, bttButton2_Jsonclick, 7, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e126s1_client"+"'", TempTags, "", 2, "HLP_WPALM_RECUPERACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblUrl_Internalname, lblUrl_Caption, "", "", lblUrl_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", lblUrl_Visible, 1, (short)(1), "HLP_WPALM_RECUPERACION.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start6S2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Recuperación", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup6S0( ) ;
   }

   public void ws6S2( )
   {
      start6S2( ) ;
      evt6S2( ) ;
   }

   public void evt6S2( )
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
                           e136S2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'AGREGAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Agregar' */
                           e146S2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'CONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Confirmar' */
                           e156S2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "'ELIMINAR ITEM'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "'ATRIBUTOS'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "'ATRIBUTOS'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "'ELIMINAR ITEM'") == 0 ) )
                        {
                           nGXsfl_43_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_43_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_consecutivo_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_consecutivo_Internalname), ",", ".") > 999999999999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_CONSECUTIVO");
                              GX_FocusControl = edtavTdet_consecutivo_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV37TDet_Consecutivo = 0 ;
                           }
                           else
                           {
                              AV37TDet_Consecutivo = localUtil.ctol( httpContext.cgiGet( edtavTdet_consecutivo_Internalname), ",", ".") ;
                           }
                           AV21Elem_Consecutivo = httpContext.cgiGet( edtavElem_consecutivo_Internalname) ;
                           AV20cCata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCcata_descripcion_Internalname)) ;
                           AV39TDet_PlacaNumero = httpContext.cgiGet( edtavTdet_placanumero_Internalname) ;
                           AV38TDet_EsPadre = httpContext.cgiGet( edtavTdet_espadre_Internalname) ;
                           AV40TDet_PlacaPadre = httpContext.cgiGet( edtavTdet_placapadre_Internalname) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTdet_valorunitario_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTdet_valorunitario_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_VALORUNITARIO");
                              GX_FocusControl = edtavTdet_valorunitario_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV47TDet_ValorUnitario = DecimalUtil.ZERO ;
                           }
                           else
                           {
                              AV47TDet_ValorUnitario = localUtil.ctond( httpContext.cgiGet( edtavTdet_valorunitario_Internalname)) ;
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTdet_otros_costos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTdet_otros_costos_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_OTROS_COSTOS");
                              GX_FocusControl = edtavTdet_otros_costos_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV10TDet_Otros_Costos = DecimalUtil.ZERO ;
                           }
                           else
                           {
                              AV10TDet_Otros_Costos = localUtil.ctond( httpContext.cgiGet( edtavTdet_otros_costos_Internalname)) ;
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTdet_valor_futuro_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTdet_valor_futuro_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_VALOR_FUTURO");
                              GX_FocusControl = edtavTdet_valor_futuro_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV44TDet_Valor_Futuro = DecimalUtil.ZERO ;
                           }
                           else
                           {
                              AV44TDet_Valor_Futuro = localUtil.ctond( httpContext.cgiGet( edtavTdet_valor_futuro_Internalname)) ;
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_taza_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_taza_Internalname), ",", ".") > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_TAZA");
                              GX_FocusControl = edtavTdet_taza_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV42TDet_Taza = (short)(0) ;
                           }
                           else
                           {
                              AV42TDet_Taza = (short)(localUtil.ctol( httpContext.cgiGet( edtavTdet_taza_Internalname), ",", ".")) ;
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_plazo_n_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTdet_plazo_n_Internalname), ",", ".") > 99 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_PLAZO_N");
                              GX_FocusControl = edtavTdet_plazo_n_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV41TDet_Plazo_N = (byte)(0) ;
                           }
                           else
                           {
                              AV41TDet_Plazo_N = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTdet_plazo_n_Internalname), ",", ".")) ;
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTdet_valor_presente_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTdet_valor_presente_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_VALOR_PRESENTE");
                              GX_FocusControl = edtavTdet_valor_presente_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV45TDet_Valor_Presente = DecimalUtil.ZERO ;
                           }
                           else
                           {
                              AV45TDet_Valor_Presente = localUtil.ctond( httpContext.cgiGet( edtavTdet_valor_presente_Internalname)) ;
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTdet_valortotal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTdet_valortotal_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDET_VALORTOTAL");
                              GX_FocusControl = edtavTdet_valortotal_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV46TDet_ValorTotal = DecimalUtil.ZERO ;
                           }
                           else
                           {
                              AV46TDet_ValorTotal = localUtil.ctond( httpContext.cgiGet( edtavTdet_valortotal_Internalname)) ;
                           }
                           AV18Atributos = httpContext.cgiGet( edtavAtributos_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "Bitmap", ((GXutil.strcmp("", AV18Atributos)==0) ? AV65Atributos_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV18Atributos))), !bGXsfl_43_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavAtributos_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV18Atributos), true);
                           AV22EliminarItem = httpContext.cgiGet( edtavEliminaritem_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavEliminaritem_Internalname, "Bitmap", ((GXutil.strcmp("", AV22EliminarItem)==0) ? AV64Eliminaritem_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV22EliminarItem))), !bGXsfl_43_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavEliminaritem_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV22EliminarItem), true);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e166S2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e176S2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'ELIMINAR ITEM'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Eliminar Item' */
                                 e186S2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'ATRIBUTOS'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Atributos' */
                                 e196S2 ();
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

   public void we6S2( )
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

   public void pa6S2( )
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
            GX_FocusControl = edtavTran_descripcionmovimiento_Internalname ;
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_43_idx+1)) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_43_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( java.math.BigDecimal AV16Tran_ValorTransaccion ,
                                  long A46Tran_Id ,
                                  long AV14Tran_Id ,
                                  java.math.BigDecimal A483Tran_ValorTransaccion ,
                                  long A499Tran_CodTipoElemento ,
                                  long A69TDet_Consecutivo ,
                                  String A66Elem_Consecutivo ,
                                  long A487TDet_Cantidad ,
                                  java.math.BigDecimal A488TDet_ValorUnitario ,
                                  java.math.BigDecimal A489TDet_ValorTotal ,
                                  String A490TDet_PlacaNumero ,
                                  String A491TDet_PlacaPadre ,
                                  String A505TDet_EsPadre ,
                                  String A298Cata_Descripcion ,
                                  java.math.BigDecimal A654TDet_Valor_Futuro ,
                                  java.math.BigDecimal A653TDet_Valor_Presente ,
                                  byte A656TDet_Plazo_N ,
                                  short A655TDet_Taza ,
                                  java.math.BigDecimal A657TDet_Otros_Costos ,
                                  java.math.BigDecimal AV55ValorTotal ,
                                  short AV60Confirmar )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf6S2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf6S2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTran_descripcionmovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_descripcionmovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_descripcionmovimiento_Enabled, 5, 0)), true);
      edtavTran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_consecutivocc_Enabled, 5, 0)), true);
      edtavCata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Enabled, 5, 0)), true);
      edtavObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObservaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavObservaciones_Enabled, 5, 0)), true);
      edtavTran_valortransaccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_valortransaccion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_valortransaccion_Enabled, 5, 0)), true);
      edtavTdet_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_consecutivo_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavElem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavElem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavElem_consecutivo_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavCcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcata_descripcion_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_placanumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placanumero_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placanumero_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_espadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_espadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_espadre_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_placapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placapadre_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_valorunitario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valorunitario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valorunitario_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_otros_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_otros_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_otros_costos_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_valor_futuro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valor_futuro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valor_futuro_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_taza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_taza_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_taza_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_plazo_n_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_plazo_n_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_plazo_n_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_valor_presente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valor_presente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valor_presente_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_valortotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valortotal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valortotal_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
   }

   public void rf6S2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(43) ;
      nGXsfl_43_idx = (short)(1) ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_43_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
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
         subsflControlProps_432( ) ;
         e176S2 ();
         wbEnd = (short)(43) ;
         wb6S0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
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

   public void strup6S0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavTran_descripcionmovimiento_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_descripcionmovimiento_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_descripcionmovimiento_Enabled, 5, 0)), true);
      edtavTran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_consecutivocc_Enabled, 5, 0)), true);
      edtavCata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Enabled, 5, 0)), true);
      edtavObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObservaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavObservaciones_Enabled, 5, 0)), true);
      edtavTran_valortransaccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_valortransaccion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_valortransaccion_Enabled, 5, 0)), true);
      edtavTdet_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_consecutivo_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavElem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavElem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavElem_consecutivo_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavCcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCcata_descripcion_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_placanumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placanumero_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placanumero_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_espadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_espadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_espadre_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_placapadre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_placapadre_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_placapadre_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_valorunitario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valorunitario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valorunitario_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_otros_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_otros_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_otros_costos_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_valor_futuro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valor_futuro_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valor_futuro_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_taza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_taza_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_taza_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_plazo_n_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_plazo_n_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_plazo_n_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_valor_presente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valor_presente_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valor_presente_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      edtavTdet_valortotal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdet_valortotal_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTdet_valortotal_Enabled, 5, 0)), !bGXsfl_43_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e166S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV12Tran_DescripcionMovimiento = httpContext.cgiGet( edtavTran_descripcionmovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Tran_DescripcionMovimiento", AV12Tran_DescripcionMovimiento);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_DESCRIPCIONMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Tran_DescripcionMovimiento, ""))));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRAN_CONSECUTIVOCC");
            GX_FocusControl = edtavTran_consecutivocc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11TRan_ConsecutivoCC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11TRan_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV11TRan_ConsecutivoCC, 18, 0)));
         }
         else
         {
            AV11TRan_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtavTran_consecutivocc_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11TRan_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV11TRan_ConsecutivoCC, 18, 0)));
         }
         AV30Placa = httpContext.cgiGet( edtavPlaca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Placa", AV30Placa);
         AV19Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCata_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Cata_Descripcion", AV19Cata_Descripcion);
         AV28Observaciones = httpContext.cgiGet( edtavObservaciones_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Observaciones", AV28Observaciones);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTran_valortransaccion_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTran_valortransaccion_Internalname)), DecimalUtil.stringToDec("999999999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTRAN_VALORTRANSACCION");
            GX_FocusControl = edtavTran_valortransaccion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16Tran_ValorTransaccion = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV16Tran_ValorTransaccion, 18, 2)));
         }
         else
         {
            AV16Tran_ValorTransaccion = localUtil.ctond( httpContext.cgiGet( edtavTran_valortransaccion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV16Tran_ValorTransaccion, 18, 2)));
         }
         /* Read saved values. */
         nRC_GXsfl_43 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), ",", ".")) ;
         AV26Invd_Estado = httpContext.cgiGet( "vINVD_ESTADO") ;
         AV34Tabla = (short)(localUtil.ctol( httpContext.cgiGet( "vTABLA"), ",", ".")) ;
         AV25Fecha = localUtil.ctod( httpContext.cgiGet( "vFECHA"), 0) ;
         AV50Tran_IdResponsabilidad = localUtil.ctol( httpContext.cgiGet( "vTRAN_IDRESPONSABILIDAD"), ",", ".") ;
         AV57Cuen_Identificacion = localUtil.ctol( httpContext.cgiGet( "vCUEN_IDENTIFICACION"), ",", ".") ;
         AV32pObservaciones = httpContext.cgiGet( "vPOBSERVACIONES") ;
         AV29PCata_Descripcion = httpContext.cgiGet( "vPCATA_DESCRIPCION") ;
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = "hsh" + "WPALM_RECUPERACION" ;
         AV12Tran_DescripcionMovimiento = httpContext.cgiGet( edtavTran_descripcionmovimiento_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Tran_DescripcionMovimiento", AV12Tran_DescripcionMovimiento);
         httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_DESCRIPCIONMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Tran_DescripcionMovimiento, ""))));
         forbiddenHiddens = forbiddenHiddens + GXutil.rtrim( localUtil.format( AV12Tran_DescripcionMovimiento, "")) ;
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens, hsh, GXKey) )
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            GXutil.writeLog("wpalm_recuperacion:[SecurityCheckFailed]"+forbiddenHiddens);
            return  ;
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
      e166S2 ();
      if (returnInSub) return;
   }

   public void e166S2( )
   {
      /* Start Routine */
      lblUrl_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, lblUrl_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblUrl_Visible, 5, 0)), true);
      AV60Confirmar = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Confirmar", GXutil.ltrim( GXutil.str( AV60Confirmar, 4, 0)));
      Form.setCaption( "Inventario Cuenta de Responsabilidad" );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV52Usuario = AV17websession.getValue("Usuario") ;
      edtavTran_consecutivocc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTran_consecutivocc_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavTran_consecutivocc_Enabled, 5, 0)), true);
      GXv_int1[0] = AV14Tran_Id ;
      GXv_int2[0] = AV9Regi_Id ;
      GXv_int3[0] = AV8Cent_Id ;
      GXv_char4[0] = AV6Alma_Modulo ;
      GXv_char5[0] = AV5Alma_Codigo ;
      GXv_char6[0] = AV7Bode_Codigo ;
      GXv_int7[0] = AV11TRan_ConsecutivoCC ;
      GXv_int8[0] = AV15Tran_IdCuentadanteOrigen ;
      GXv_char9[0] = AV12Tran_DescripcionMovimiento ;
      GXv_char10[0] = AV61Tran_Estado ;
      new com.orions2.datostran(remoteHandle, context).execute( GXv_int1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_char6, GXv_int7, GXv_int8, GXv_char9, GXv_char10) ;
      wpalm_recuperacion_impl.this.AV14Tran_Id = GXv_int1[0] ;
      wpalm_recuperacion_impl.this.AV9Regi_Id = GXv_int2[0] ;
      wpalm_recuperacion_impl.this.AV8Cent_Id = GXv_int3[0] ;
      wpalm_recuperacion_impl.this.AV6Alma_Modulo = GXv_char4[0] ;
      wpalm_recuperacion_impl.this.AV5Alma_Codigo = GXv_char5[0] ;
      wpalm_recuperacion_impl.this.AV7Bode_Codigo = GXv_char6[0] ;
      wpalm_recuperacion_impl.this.AV11TRan_ConsecutivoCC = GXv_int7[0] ;
      wpalm_recuperacion_impl.this.AV15Tran_IdCuentadanteOrigen = GXv_int8[0] ;
      wpalm_recuperacion_impl.this.AV12Tran_DescripcionMovimiento = GXv_char9[0] ;
      wpalm_recuperacion_impl.this.AV61Tran_Estado = GXv_char10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV9Regi_Id", GXutil.ltrim( GXutil.str( AV9Regi_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Cent_Id", GXutil.ltrim( GXutil.str( AV8Cent_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV6Alma_Modulo", AV6Alma_Modulo);
      httpContext.ajax_rsp_assign_attri("", false, "AV5Alma_Codigo", AV5Alma_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "AV7Bode_Codigo", AV7Bode_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "AV11TRan_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV11TRan_ConsecutivoCC, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV15Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( AV15Tran_IdCuentadanteOrigen, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "AV12Tran_DescripcionMovimiento", AV12Tran_DescripcionMovimiento);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_DESCRIPCIONMOVIMIENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12Tran_DescripcionMovimiento, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV61Tran_Estado", AV61Tran_Estado);
   }

   public void e146S2( )
   {
      /* 'Agregar' Routine */
      if ( GXutil.strcmp(AV30Placa, "") == 0 )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "Debe seleccionar una placa" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         GX_FocusControl = edtavPlaca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( GXutil.strcmp(AV26Invd_Estado, "R") == 0 )
         {
            GXv_int8[0] = AV14Tran_Id ;
            GXv_char10[0] = AV30Placa ;
            GXv_char9[0] = AV31PlacaPadre ;
            GXv_decimal11[0] = AV53ValorAdquisicion ;
            GXv_char6[0] = AV28Observaciones ;
            GXv_char5[0] = AV24EsPlacaPadre ;
            GXv_int7[0] = AV49Tran_IdEntrada ;
            GXv_int12[0] = AV27Nro_Linea ;
            new com.orions2.psalidadevolutivo(remoteHandle, context).execute( GXv_int8, GXv_char10, GXv_char9, GXv_decimal11, GXv_char6, GXv_char5, GXv_int7, GXv_int12) ;
            wpalm_recuperacion_impl.this.AV14Tran_Id = GXv_int8[0] ;
            wpalm_recuperacion_impl.this.AV30Placa = GXv_char10[0] ;
            wpalm_recuperacion_impl.this.AV31PlacaPadre = GXv_char9[0] ;
            wpalm_recuperacion_impl.this.AV53ValorAdquisicion = GXv_decimal11[0] ;
            wpalm_recuperacion_impl.this.AV28Observaciones = GXv_char6[0] ;
            wpalm_recuperacion_impl.this.AV24EsPlacaPadre = GXv_char5[0] ;
            wpalm_recuperacion_impl.this.AV49Tran_IdEntrada = GXv_int7[0] ;
            wpalm_recuperacion_impl.this.AV27Nro_Linea = GXv_int12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV30Placa", AV30Placa);
            httpContext.ajax_rsp_assign_attri("", false, "AV31PlacaPadre", AV31PlacaPadre);
            httpContext.ajax_rsp_assign_attri("", false, "AV53ValorAdquisicion", GXutil.ltrim( GXutil.str( AV53ValorAdquisicion, 18, 2)));
            httpContext.ajax_rsp_assign_attri("", false, "AV28Observaciones", AV28Observaciones);
            httpContext.ajax_rsp_assign_attri("", false, "AV24EsPlacaPadre", AV24EsPlacaPadre);
            httpContext.ajax_rsp_assign_attri("", false, "AV49Tran_IdEntrada", GXutil.ltrim( GXutil.str( AV49Tran_IdEntrada, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV27Nro_Linea", GXutil.ltrim( GXutil.str( AV27Nro_Linea, 8, 0)));
         }
         gxgrgrid1_refresh( AV16Tran_ValorTransaccion, A46Tran_Id, AV14Tran_Id, A483Tran_ValorTransaccion, A499Tran_CodTipoElemento, A69TDet_Consecutivo, A66Elem_Consecutivo, A487TDet_Cantidad, A488TDet_ValorUnitario, A489TDet_ValorTotal, A490TDet_PlacaNumero, A491TDet_PlacaPadre, A505TDet_EsPadre, A298Cata_Descripcion, A654TDet_Valor_Futuro, A653TDet_Valor_Presente, A656TDet_Plazo_N, A655TDet_Taza, A657TDet_Otros_Costos, AV55ValorTotal, AV60Confirmar) ;
         httpContext.doAjaxRefresh();
         AV30Placa = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Placa", AV30Placa);
         AV19Cata_Descripcion = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Cata_Descripcion", AV19Cata_Descripcion);
         AV28Observaciones = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Observaciones", AV28Observaciones);
      }
   }

   private void e176S2( )
   {
      /* Grid1_Load Routine */
      AV22EliminarItem = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      AV64Eliminaritem_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      AV18Atributos = context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )) ;
      AV65Atributos_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7c63c2b9-483e-4035-b512-febf9186a274", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      AV16Tran_ValorTransaccion = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV16Tran_ValorTransaccion, 18, 2)));
      /* Using cursor H006S2 */
      pr_default.execute(0, new Object[] {new Long(AV14Tran_Id)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A49Tran_CodigoMovimiento = H006S2_A49Tran_CodigoMovimiento[0] ;
         A46Tran_Id = H006S2_A46Tran_Id[0] ;
         A483Tran_ValorTransaccion = H006S2_A483Tran_ValorTransaccion[0] ;
         n483Tran_ValorTransaccion = H006S2_n483Tran_ValorTransaccion[0] ;
         A499Tran_CodTipoElemento = H006S2_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = H006S2_n499Tran_CodTipoElemento[0] ;
         A499Tran_CodTipoElemento = H006S2_A499Tran_CodTipoElemento[0] ;
         n499Tran_CodTipoElemento = H006S2_n499Tran_CodTipoElemento[0] ;
         AV16Tran_ValorTransaccion = A483Tran_ValorTransaccion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV16Tran_ValorTransaccion, 18, 2)));
         AV48Tran_CodTipoElemento = A499Tran_CodTipoElemento ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor H006S3 */
      pr_default.execute(1, new Object[] {new Long(AV14Tran_Id)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A37Cata_Codigo = H006S3_A37Cata_Codigo[0] ;
         A46Tran_Id = H006S3_A46Tran_Id[0] ;
         A66Elem_Consecutivo = H006S3_A66Elem_Consecutivo[0] ;
         A487TDet_Cantidad = H006S3_A487TDet_Cantidad[0] ;
         A488TDet_ValorUnitario = H006S3_A488TDet_ValorUnitario[0] ;
         A489TDet_ValorTotal = H006S3_A489TDet_ValorTotal[0] ;
         A490TDet_PlacaNumero = H006S3_A490TDet_PlacaNumero[0] ;
         n490TDet_PlacaNumero = H006S3_n490TDet_PlacaNumero[0] ;
         A491TDet_PlacaPadre = H006S3_A491TDet_PlacaPadre[0] ;
         n491TDet_PlacaPadre = H006S3_n491TDet_PlacaPadre[0] ;
         A505TDet_EsPadre = H006S3_A505TDet_EsPadre[0] ;
         A298Cata_Descripcion = H006S3_A298Cata_Descripcion[0] ;
         A483Tran_ValorTransaccion = H006S3_A483Tran_ValorTransaccion[0] ;
         n483Tran_ValorTransaccion = H006S3_n483Tran_ValorTransaccion[0] ;
         A654TDet_Valor_Futuro = H006S3_A654TDet_Valor_Futuro[0] ;
         n654TDet_Valor_Futuro = H006S3_n654TDet_Valor_Futuro[0] ;
         A653TDet_Valor_Presente = H006S3_A653TDet_Valor_Presente[0] ;
         n653TDet_Valor_Presente = H006S3_n653TDet_Valor_Presente[0] ;
         A656TDet_Plazo_N = H006S3_A656TDet_Plazo_N[0] ;
         n656TDet_Plazo_N = H006S3_n656TDet_Plazo_N[0] ;
         A655TDet_Taza = H006S3_A655TDet_Taza[0] ;
         n655TDet_Taza = H006S3_n655TDet_Taza[0] ;
         A657TDet_Otros_Costos = H006S3_A657TDet_Otros_Costos[0] ;
         n657TDet_Otros_Costos = H006S3_n657TDet_Otros_Costos[0] ;
         A69TDet_Consecutivo = H006S3_A69TDet_Consecutivo[0] ;
         A483Tran_ValorTransaccion = H006S3_A483Tran_ValorTransaccion[0] ;
         n483Tran_ValorTransaccion = H006S3_n483Tran_ValorTransaccion[0] ;
         A37Cata_Codigo = H006S3_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H006S3_A298Cata_Descripcion[0] ;
         AV37TDet_Consecutivo = A69TDet_Consecutivo ;
         AV21Elem_Consecutivo = A66Elem_Consecutivo ;
         AV35TDet_Cantidad = A487TDet_Cantidad ;
         AV47TDet_ValorUnitario = A488TDet_ValorUnitario ;
         AV46TDet_ValorTotal = A489TDet_ValorTotal ;
         AV39TDet_PlacaNumero = A490TDet_PlacaNumero ;
         AV40TDet_PlacaPadre = A491TDet_PlacaPadre ;
         AV38TDet_EsPadre = A505TDet_EsPadre ;
         AV20cCata_Descripcion = A298Cata_Descripcion ;
         AV16Tran_ValorTransaccion = A483Tran_ValorTransaccion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Tran_ValorTransaccion", GXutil.ltrim( GXutil.str( AV16Tran_ValorTransaccion, 18, 2)));
         AV44TDet_Valor_Futuro = A654TDet_Valor_Futuro ;
         AV45TDet_Valor_Presente = A653TDet_Valor_Presente ;
         AV41TDet_Plazo_N = A656TDet_Plazo_N ;
         AV42TDet_Taza = A655TDet_Taza ;
         AV10TDet_Otros_Costos = A657TDet_Otros_Costos ;
         AV55ValorTotal = AV55ValorTotal.add(AV46TDet_ValorTotal) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ValorTotal", GXutil.ltrim( GXutil.str( AV55ValorTotal, 18, 2)));
         if ( AV60Confirmar == 1 )
         {
            edtavEliminaritem_Enabled = 0 ;
            edtavAtributos_Enabled = 0 ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(43) ;
         }
         sendrow_432( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
         {
            httpContext.doAjaxLoad(43, Grid1Row);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void e186S2( )
   {
      /* 'Eliminar Item' Routine */
      if ( GXutil.strcmp(AV38TDet_EsPadre, "SI") == 0 )
      {
         httpContext.GX_msglist.addItem("Es una placa padre se eliminó también los hijos");
      }
      else if ( ! (GXutil.strcmp("", AV40TDet_PlacaPadre)==0) )
      {
         httpContext.GX_msglist.addItem("Tiene placa padre se eliminó el padre y todos los hijos");
      }
      GXv_int8[0] = AV14Tran_Id ;
      GXv_int7[0] = AV37TDet_Consecutivo ;
      new com.orions2.eliminadetalletrn(remoteHandle, context).execute( GXv_int8, GXv_int7) ;
      wpalm_recuperacion_impl.this.AV14Tran_Id = GXv_int8[0] ;
      wpalm_recuperacion_impl.this.AV37TDet_Consecutivo = GXv_int7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
      gxgrgrid1_refresh( AV16Tran_ValorTransaccion, A46Tran_Id, AV14Tran_Id, A483Tran_ValorTransaccion, A499Tran_CodTipoElemento, A69TDet_Consecutivo, A66Elem_Consecutivo, A487TDet_Cantidad, A488TDet_ValorUnitario, A489TDet_ValorTotal, A490TDet_PlacaNumero, A491TDet_PlacaPadre, A505TDet_EsPadre, A298Cata_Descripcion, A654TDet_Valor_Futuro, A653TDet_Valor_Presente, A656TDet_Plazo_N, A655TDet_Taza, A657TDet_Otros_Costos, AV55ValorTotal, AV60Confirmar) ;
      httpContext.doAjaxRefresh();
   }

   public void e156S2( )
   {
      /* 'Confirmar' Routine */
      Alertify1_Type = "confirm" ;
      httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
      Alertify1_Textmessage = "Esta seguro de confirmar la transacción por valor total de $"+localUtil.format( AV16Tran_ValorTransaccion, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")+" " ;
      httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
      this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
   }

   public void e136S2( )
   {
      /* Alertify1_Ok Routine */
      GXv_int8[0] = AV14Tran_Id ;
      new com.orions2.pactualizaestadotrn(remoteHandle, context).execute( GXv_int8) ;
      wpalm_recuperacion_impl.this.AV14Tran_Id = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
      GXv_int8[0] = AV14Tran_Id ;
      new com.orions2.wscorreotraspaso(remoteHandle, context).execute( GXv_int8) ;
      wpalm_recuperacion_impl.this.AV14Tran_Id = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
      AV58url = formatLink("com.orions2.aptrascuen") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV14Tran_Id,11,0))) ;
      AV59WindowsId = (short)(GXutil.random( )*100000) ;
      lblUrl_Caption = "<script language=\"JavaScript\">window.open(\""+GXutil.trim( AV58url)+"\",\""+GXutil.trim( GXutil.str( AV59WindowsId, 10, 0))+"\",\"target=_top,top=10,left=10,width=600,height=500,scrollbars=yes,menubar=no,toolbar=no,resizable=yes,directories=no\");</script>" ;
      httpContext.ajax_rsp_assign_prop("", false, lblUrl_Internalname, "Caption", lblUrl_Caption, true);
      bttAgregar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttAgregar_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttAgregar_Visible, 5, 0)), true);
      bttButton1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttButton1_Internalname, "Visible", GXutil.ltrim( GXutil.str( bttButton1_Visible, 5, 0)), true);
      bttButton2_Caption = "Salir" ;
      httpContext.ajax_rsp_assign_prop("", false, bttButton2_Internalname, "Caption", bttButton2_Caption, true);
      AV60Confirmar = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Confirmar", GXutil.ltrim( GXutil.str( AV60Confirmar, 4, 0)));
      gxgrgrid1_refresh( AV16Tran_ValorTransaccion, A46Tran_Id, AV14Tran_Id, A483Tran_ValorTransaccion, A499Tran_CodTipoElemento, A69TDet_Consecutivo, A66Elem_Consecutivo, A487TDet_Cantidad, A488TDet_ValorUnitario, A489TDet_ValorTotal, A490TDet_PlacaNumero, A491TDet_PlacaPadre, A505TDet_EsPadre, A298Cata_Descripcion, A654TDet_Valor_Futuro, A653TDet_Valor_Presente, A656TDet_Plazo_N, A655TDet_Taza, A657TDet_Otros_Costos, AV55ValorTotal, AV60Confirmar) ;
      httpContext.doAjaxRefresh();
   }

   public void e196S2( )
   {
      /* 'Atributos' Routine */
      /* Using cursor H006S4 */
      pr_default.execute(2, new Object[] {new Long(AV14Tran_Id), new Long(AV37TDet_Consecutivo)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A69TDet_Consecutivo = H006S4_A69TDet_Consecutivo[0] ;
         A46Tran_Id = H006S4_A46Tran_Id[0] ;
         A71Tran_Entrada = H006S4_A71Tran_Entrada[0] ;
         A72Nro_Linea = H006S4_A72Nro_Linea[0] ;
         AV13Tran_Entrada = A71Tran_Entrada ;
         AV27Nro_Linea = A72Nro_Linea ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Nro_Linea", GXutil.ltrim( GXutil.str( AV27Nro_Linea, 8, 0)));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      httpContext.popup(formatLink("com.orions2.wpatributos") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV13Tran_Entrada,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV27Nro_Linea,8,0))), new Object[] {"AV13Tran_Entrada","AV27Nro_Linea"});
   }

   public void setparameters( Object[] obj )
   {
      AV14Tran_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tran_Id", GXutil.ltrim( GXutil.str( AV14Tran_Id, 11, 0)));
      AV57Cuen_Identificacion = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Cuen_Identificacion", GXutil.ltrim( GXutil.str( AV57Cuen_Identificacion, 18, 0)));
      AV50Tran_IdResponsabilidad = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Tran_IdResponsabilidad", GXutil.ltrim( GXutil.str( AV50Tran_IdResponsabilidad, 11, 0)));
      AV25Fecha = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Fecha", localUtil.format(AV25Fecha, "99/99/99"));
      AV34Tabla = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Tabla", GXutil.ltrim( GXutil.str( AV34Tabla, 4, 0)));
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
      pa6S2( ) ;
      ws6S2( ) ;
      we6S2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?14103086");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?201861414214118");
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
         httpContext.AddJavascriptSource("wpalm_recuperacion.js", "?201861414214118");
         httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
         httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
         httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
         httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtavTdet_consecutivo_Internalname = "vTDET_CONSECUTIVO_"+sGXsfl_43_idx ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO_"+sGXsfl_43_idx ;
      edtavCcata_descripcion_Internalname = "vCCATA_DESCRIPCION_"+sGXsfl_43_idx ;
      edtavTdet_placanumero_Internalname = "vTDET_PLACANUMERO_"+sGXsfl_43_idx ;
      edtavTdet_espadre_Internalname = "vTDET_ESPADRE_"+sGXsfl_43_idx ;
      edtavTdet_placapadre_Internalname = "vTDET_PLACAPADRE_"+sGXsfl_43_idx ;
      edtavTdet_valorunitario_Internalname = "vTDET_VALORUNITARIO_"+sGXsfl_43_idx ;
      edtavTdet_otros_costos_Internalname = "vTDET_OTROS_COSTOS_"+sGXsfl_43_idx ;
      edtavTdet_valor_futuro_Internalname = "vTDET_VALOR_FUTURO_"+sGXsfl_43_idx ;
      edtavTdet_taza_Internalname = "vTDET_TAZA_"+sGXsfl_43_idx ;
      edtavTdet_plazo_n_Internalname = "vTDET_PLAZO_N_"+sGXsfl_43_idx ;
      edtavTdet_valor_presente_Internalname = "vTDET_VALOR_PRESENTE_"+sGXsfl_43_idx ;
      edtavTdet_valortotal_Internalname = "vTDET_VALORTOTAL_"+sGXsfl_43_idx ;
      edtavAtributos_Internalname = "vATRIBUTOS_"+sGXsfl_43_idx ;
      edtavEliminaritem_Internalname = "vELIMINARITEM_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtavTdet_consecutivo_Internalname = "vTDET_CONSECUTIVO_"+sGXsfl_43_fel_idx ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO_"+sGXsfl_43_fel_idx ;
      edtavCcata_descripcion_Internalname = "vCCATA_DESCRIPCION_"+sGXsfl_43_fel_idx ;
      edtavTdet_placanumero_Internalname = "vTDET_PLACANUMERO_"+sGXsfl_43_fel_idx ;
      edtavTdet_espadre_Internalname = "vTDET_ESPADRE_"+sGXsfl_43_fel_idx ;
      edtavTdet_placapadre_Internalname = "vTDET_PLACAPADRE_"+sGXsfl_43_fel_idx ;
      edtavTdet_valorunitario_Internalname = "vTDET_VALORUNITARIO_"+sGXsfl_43_fel_idx ;
      edtavTdet_otros_costos_Internalname = "vTDET_OTROS_COSTOS_"+sGXsfl_43_fel_idx ;
      edtavTdet_valor_futuro_Internalname = "vTDET_VALOR_FUTURO_"+sGXsfl_43_fel_idx ;
      edtavTdet_taza_Internalname = "vTDET_TAZA_"+sGXsfl_43_fel_idx ;
      edtavTdet_plazo_n_Internalname = "vTDET_PLAZO_N_"+sGXsfl_43_fel_idx ;
      edtavTdet_valor_presente_Internalname = "vTDET_VALOR_PRESENTE_"+sGXsfl_43_fel_idx ;
      edtavTdet_valortotal_Internalname = "vTDET_VALORTOTAL_"+sGXsfl_43_fel_idx ;
      edtavAtributos_Internalname = "vATRIBUTOS_"+sGXsfl_43_fel_idx ;
      edtavEliminaritem_Internalname = "vELIMINARITEM_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb6S0( ) ;
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
         if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
         httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
      }
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_consecutivo_Enabled!=0)&&(edtavTdet_consecutivo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_consecutivo_Internalname,GXutil.ltrim( localUtil.ntoc( AV37TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")),((edtavTdet_consecutivo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV37TDet_Consecutivo), "ZZZZZZZZZZZZZZZZZ9")),TempTags+((edtavTdet_consecutivo_Enabled!=0)&&(edtavTdet_consecutivo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_consecutivo_Enabled!=0)&&(edtavTdet_consecutivo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,44);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavTdet_consecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavElem_consecutivo_Enabled!=0)&&(edtavElem_consecutivo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavElem_consecutivo_Internalname,AV21Elem_Consecutivo,"",TempTags+((edtavElem_consecutivo_Enabled!=0)&&(edtavElem_consecutivo_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavElem_consecutivo_Enabled!=0)&&(edtavElem_consecutivo_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,45);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavElem_consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavElem_consecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavCcata_descripcion_Enabled!=0)&&(edtavCcata_descripcion_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCcata_descripcion_Internalname,AV20cCata_Descripcion,GXutil.rtrim( localUtil.format( AV20cCata_Descripcion, "@!")),TempTags+((edtavCcata_descripcion_Enabled!=0)&&(edtavCcata_descripcion_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCcata_descripcion_Enabled!=0)&&(edtavCcata_descripcion_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,46);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCcata_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavCcata_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_placanumero_Enabled!=0)&&(edtavTdet_placanumero_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_placanumero_Internalname,AV39TDet_PlacaNumero,"",TempTags+((edtavTdet_placanumero_Enabled!=0)&&(edtavTdet_placanumero_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_placanumero_Enabled!=0)&&(edtavTdet_placanumero_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_placanumero_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTdet_placanumero_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_espadre_Enabled!=0)&&(edtavTdet_espadre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_espadre_Internalname,AV38TDet_EsPadre,"",TempTags+((edtavTdet_espadre_Enabled!=0)&&(edtavTdet_espadre_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_espadre_Enabled!=0)&&(edtavTdet_espadre_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_espadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(0),new Integer(edtavTdet_espadre_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_placapadre_Enabled!=0)&&(edtavTdet_placapadre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_placapadre_Internalname,AV40TDet_PlacaPadre,"",TempTags+((edtavTdet_placapadre_Enabled!=0)&&(edtavTdet_placapadre_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_placapadre_Enabled!=0)&&(edtavTdet_placapadre_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,49);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_placapadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTdet_placapadre_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_valorunitario_Enabled!=0)&&(edtavTdet_valorunitario_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_valorunitario_Internalname,GXutil.ltrim( localUtil.ntoc( AV47TDet_ValorUnitario, (byte)(22), (byte)(2), ",", "")),((edtavTdet_valorunitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV47TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV47TDet_ValorUnitario, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+((edtavTdet_valorunitario_Enabled!=0)&&(edtavTdet_valorunitario_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_valorunitario_Enabled!=0)&&(edtavTdet_valorunitario_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,50);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_valorunitario_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTdet_valorunitario_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_otros_costos_Enabled!=0)&&(edtavTdet_otros_costos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_otros_costos_Internalname,GXutil.ltrim( localUtil.ntoc( AV10TDet_Otros_Costos, (byte)(24), (byte)(2), ",", "")),((edtavTdet_otros_costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV10TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV10TDet_Otros_Costos, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+((edtavTdet_otros_costos_Enabled!=0)&&(edtavTdet_otros_costos_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_otros_costos_Enabled!=0)&&(edtavTdet_otros_costos_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,51);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_otros_costos_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTdet_otros_costos_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_valor_futuro_Enabled!=0)&&(edtavTdet_valor_futuro_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_valor_futuro_Internalname,GXutil.ltrim( localUtil.ntoc( AV44TDet_Valor_Futuro, (byte)(24), (byte)(2), ",", "")),((edtavTdet_valor_futuro_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV44TDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV44TDet_Valor_Futuro, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+((edtavTdet_valor_futuro_Enabled!=0)&&(edtavTdet_valor_futuro_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_valor_futuro_Enabled!=0)&&(edtavTdet_valor_futuro_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,52);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_valor_futuro_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTdet_valor_futuro_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_taza_Enabled!=0)&&(edtavTdet_taza_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_taza_Internalname,GXutil.ltrim( localUtil.ntoc( AV42TDet_Taza, (byte)(3), (byte)(0), ",", "")),((edtavTdet_taza_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42TDet_Taza), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV42TDet_Taza), "ZZ9")),TempTags+((edtavTdet_taza_Enabled!=0)&&(edtavTdet_taza_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_taza_Enabled!=0)&&(edtavTdet_taza_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,53);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_taza_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTdet_taza_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_plazo_n_Enabled!=0)&&(edtavTdet_plazo_n_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_plazo_n_Internalname,GXutil.ltrim( localUtil.ntoc( AV41TDet_Plazo_N, (byte)(2), (byte)(0), ",", "")),((edtavTdet_plazo_n_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TDet_Plazo_N), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(AV41TDet_Plazo_N), "Z9")),TempTags+((edtavTdet_plazo_n_Enabled!=0)&&(edtavTdet_plazo_n_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_plazo_n_Enabled!=0)&&(edtavTdet_plazo_n_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,54);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_plazo_n_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTdet_plazo_n_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_valor_presente_Enabled!=0)&&(edtavTdet_valor_presente_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_valor_presente_Internalname,GXutil.ltrim( localUtil.ntoc( AV45TDet_Valor_Presente, (byte)(24), (byte)(2), ",", "")),((edtavTdet_valor_presente_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV45TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV45TDet_Valor_Presente, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+((edtavTdet_valor_presente_Enabled!=0)&&(edtavTdet_valor_presente_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_valor_presente_Enabled!=0)&&(edtavTdet_valor_presente_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,55);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_valor_presente_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTdet_valor_presente_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
      }
      /* Single line edit */
      TempTags = " " + ((edtavTdet_valortotal_Enabled!=0)&&(edtavTdet_valortotal_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdet_valortotal_Internalname,GXutil.ltrim( localUtil.ntoc( AV46TDet_ValorTotal, (byte)(22), (byte)(2), ",", "")),((edtavTdet_valortotal_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV46TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV46TDet_ValorTotal, "ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),TempTags+((edtavTdet_valortotal_Enabled!=0)&&(edtavTdet_valortotal_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavTdet_valortotal_Enabled!=0)&&(edtavTdet_valortotal_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, '.',',','2');"+";gx.evt.onblur(this,56);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdet_valortotal_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavTdet_valortotal_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(22),new Integer(0),new Integer(0),new Integer(43),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
      }
      /* Active Bitmap Variable */
      TempTags = " " + ((edtavAtributos_Enabled!=0)&&(edtavAtributos_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'',false,'',43)\"" : " ") ;
      ClassString = "UpdateAttribute" ;
      StyleString = "" ;
      AV18Atributos_IsBlob = (boolean)(((GXutil.strcmp("", AV18Atributos)==0)&&(GXutil.strcmp("", AV65Atributos_GXI)==0))||!(GXutil.strcmp("", AV18Atributos)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV18Atributos)==0) ? AV65Atributos_GXI : httpContext.getResourceRelative(AV18Atributos)) ;
      Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavAtributos_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(edtavAtributos_Enabled),"","Atributos",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(5),edtavAtributos_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'ATRIBUTOS\\'."+sGXsfl_43_idx+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV18Atributos_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
      }
      /* Active Bitmap Variable */
      TempTags = " " + ((edtavEliminaritem_Enabled!=0)&&(edtavEliminaritem_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'',43)\"" : " ") ;
      ClassString = "DeleteAttribute" ;
      StyleString = "" ;
      AV22EliminarItem_IsBlob = (boolean)(((GXutil.strcmp("", AV22EliminarItem)==0)&&(GXutil.strcmp("", AV64Eliminaritem_GXI)==0))||!(GXutil.strcmp("", AV22EliminarItem)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV22EliminarItem)==0) ? AV64Eliminaritem_GXI : httpContext.getResourceRelative(AV22EliminarItem)) ;
      Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavEliminaritem_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(edtavEliminaritem_Enabled),"","Eliminar",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(5),edtavEliminaritem_Jsonclick,"'"+""+"'"+",false,"+"'"+"E\\'ELIMINAR ITEM\\'."+sGXsfl_43_idx+"'",StyleString,ClassString,"WWActionColumn","","",""+TempTags,"","",new Integer(1),new Boolean(AV22EliminarItem_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      Grid1Container.AddRow(Grid1Row);
      nGXsfl_43_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_43_idx+1)) ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_43_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      /* End function sendrow_432 */
   }

   public void init_default_properties( )
   {
      edtavTran_descripcionmovimiento_Internalname = "vTRAN_DESCRIPCIONMOVIMIENTO" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      edtavTran_consecutivocc_Internalname = "vTRAN_CONSECUTIVOCC" ;
      edtavPlaca_Internalname = "vPLACA" ;
      imgImage1_Internalname = "IMAGE1" ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION" ;
      edtavObservaciones_Internalname = "vOBSERVACIONES" ;
      bttAgregar_Internalname = "AGREGAR" ;
      edtavTran_valortransaccion_Internalname = "vTRAN_VALORTRANSACCION" ;
      edtavTdet_consecutivo_Internalname = "vTDET_CONSECUTIVO" ;
      edtavElem_consecutivo_Internalname = "vELEM_CONSECUTIVO" ;
      edtavCcata_descripcion_Internalname = "vCCATA_DESCRIPCION" ;
      edtavTdet_placanumero_Internalname = "vTDET_PLACANUMERO" ;
      edtavTdet_espadre_Internalname = "vTDET_ESPADRE" ;
      edtavTdet_placapadre_Internalname = "vTDET_PLACAPADRE" ;
      edtavTdet_valorunitario_Internalname = "vTDET_VALORUNITARIO" ;
      edtavTdet_otros_costos_Internalname = "vTDET_OTROS_COSTOS" ;
      edtavTdet_valor_futuro_Internalname = "vTDET_VALOR_FUTURO" ;
      edtavTdet_taza_Internalname = "vTDET_TAZA" ;
      edtavTdet_plazo_n_Internalname = "vTDET_PLAZO_N" ;
      edtavTdet_valor_presente_Internalname = "vTDET_VALOR_PRESENTE" ;
      edtavTdet_valortotal_Internalname = "vTDET_VALORTOTAL" ;
      edtavAtributos_Internalname = "vATRIBUTOS" ;
      edtavEliminaritem_Internalname = "vELIMINARITEM" ;
      divTable2_Internalname = "TABLE2" ;
      divTable1_Internalname = "TABLE1" ;
      bttButton1_Internalname = "BUTTON1" ;
      bttButton2_Internalname = "BUTTON2" ;
      Alertify1_Internalname = "ALERTIFY1" ;
      lblUrl_Internalname = "URL" ;
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
      edtavEliminaritem_Jsonclick = "" ;
      edtavEliminaritem_Visible = -1 ;
      edtavAtributos_Jsonclick = "" ;
      edtavAtributos_Visible = -1 ;
      edtavTdet_valortotal_Jsonclick = "" ;
      edtavTdet_valortotal_Visible = -1 ;
      edtavTdet_valor_presente_Jsonclick = "" ;
      edtavTdet_valor_presente_Visible = -1 ;
      edtavTdet_plazo_n_Jsonclick = "" ;
      edtavTdet_plazo_n_Visible = -1 ;
      edtavTdet_taza_Jsonclick = "" ;
      edtavTdet_taza_Visible = -1 ;
      edtavTdet_valor_futuro_Jsonclick = "" ;
      edtavTdet_valor_futuro_Visible = -1 ;
      edtavTdet_otros_costos_Jsonclick = "" ;
      edtavTdet_otros_costos_Visible = -1 ;
      edtavTdet_valorunitario_Jsonclick = "" ;
      edtavTdet_valorunitario_Visible = -1 ;
      edtavTdet_placapadre_Jsonclick = "" ;
      edtavTdet_placapadre_Visible = -1 ;
      edtavTdet_espadre_Jsonclick = "" ;
      edtavTdet_espadre_Visible = 0 ;
      edtavTdet_placanumero_Jsonclick = "" ;
      edtavTdet_placanumero_Visible = -1 ;
      edtavCcata_descripcion_Jsonclick = "" ;
      edtavCcata_descripcion_Visible = -1 ;
      edtavElem_consecutivo_Jsonclick = "" ;
      edtavElem_consecutivo_Visible = -1 ;
      edtavTdet_consecutivo_Jsonclick = "" ;
      edtavTdet_consecutivo_Visible = 0 ;
      lblUrl_Caption = "" ;
      lblUrl_Visible = 1 ;
      bttButton2_Caption = "Cancelar" ;
      bttButton1_Visible = 1 ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavEliminaritem_Enabled = 1 ;
      edtavAtributos_Enabled = 1 ;
      edtavTdet_valortotal_Enabled = 1 ;
      edtavTdet_valor_presente_Enabled = 1 ;
      edtavTdet_plazo_n_Enabled = 1 ;
      edtavTdet_taza_Enabled = 1 ;
      edtavTdet_valor_futuro_Enabled = 1 ;
      edtavTdet_otros_costos_Enabled = 1 ;
      edtavTdet_valorunitario_Enabled = 1 ;
      edtavTdet_placapadre_Enabled = 1 ;
      edtavTdet_espadre_Enabled = 1 ;
      edtavTdet_placanumero_Enabled = 1 ;
      edtavCcata_descripcion_Enabled = 1 ;
      edtavElem_consecutivo_Enabled = 1 ;
      edtavTdet_consecutivo_Enabled = 1 ;
      subGrid1_Class = "WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavTran_valortransaccion_Jsonclick = "" ;
      edtavTran_valortransaccion_Enabled = 1 ;
      bttAgregar_Visible = 1 ;
      edtavObservaciones_Enabled = 1 ;
      edtavCata_descripcion_Enabled = 1 ;
      edtavPlaca_Jsonclick = "" ;
      edtavPlaca_Enabled = 1 ;
      edtavTran_consecutivocc_Jsonclick = "" ;
      edtavTran_consecutivocc_Enabled = 1 ;
      edtavTran_descripcionmovimiento_Jsonclick = "" ;
      edtavTran_descripcionmovimiento_Enabled = 1 ;
      Alertify1_Textcancel = "Cancelar" ;
      Alertify1_Textok = "Confirmar" ;
      Alertify1_Textmessage = "" ;
      Alertify1_Type = "confirm" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Recuperación" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV16Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A654TDet_Valor_Futuro',fld:'TDET_VALOR_FUTURO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A656TDet_Plazo_N',fld:'TDET_PLAZO_N',pic:'Z9',nv:0},{av:'A655TDet_Taza',fld:'TDET_TAZA',pic:'ZZ9',nv:0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV55ValorTotal',fld:'vVALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV60Confirmar',fld:'vCONFIRMAR',pic:'ZZZ9',nv:0}],oparms:[]}");
      setEventMetadata("'BUSCARINVENTARIO'","{handler:'e116S1',iparms:[{av:'AV57Cuen_Identificacion',fld:'vCUEN_IDENTIFICACION',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50Tran_IdResponsabilidad',fld:'vTRAN_IDRESPONSABILIDAD',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV25Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV34Tabla',fld:'vTABLA',pic:'ZZZ9',nv:0}],oparms:[{av:'AV30Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV28Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV19Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV26Invd_Estado',fld:'vINVD_ESTADO',pic:'',nv:''}]}");
      setEventMetadata("'AGREGAR'","{handler:'e146S2',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV16Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A654TDet_Valor_Futuro',fld:'TDET_VALOR_FUTURO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A656TDet_Plazo_N',fld:'TDET_PLAZO_N',pic:'Z9',nv:0},{av:'A655TDet_Taza',fld:'TDET_TAZA',pic:'ZZ9',nv:0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV55ValorTotal',fld:'vVALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV60Confirmar',fld:'vCONFIRMAR',pic:'ZZZ9',nv:0},{av:'AV30Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV26Invd_Estado',fld:'vINVD_ESTADO',pic:'',nv:''},{av:'AV31PlacaPadre',fld:'vPLACAPADRE',pic:'',nv:''},{av:'AV53ValorAdquisicion',fld:'vVALORADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV28Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV24EsPlacaPadre',fld:'vESPLACAPADRE',pic:'',nv:''},{av:'AV49Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV27Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV19Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''}],oparms:[{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV27Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV49Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV24EsPlacaPadre',fld:'vESPLACAPADRE',pic:'',nv:''},{av:'AV28Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV53ValorAdquisicion',fld:'vVALORADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV31PlacaPadre',fld:'vPLACAPADRE',pic:'',nv:''},{av:'AV30Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV19Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''}]}");
      setEventMetadata("GRID1.LOAD","{handler:'e176S2',iparms:[{av:'AV16Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A654TDet_Valor_Futuro',fld:'TDET_VALOR_FUTURO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A656TDet_Plazo_N',fld:'TDET_PLAZO_N',pic:'Z9',nv:0},{av:'A655TDet_Taza',fld:'TDET_TAZA',pic:'ZZ9',nv:0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV55ValorTotal',fld:'vVALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV60Confirmar',fld:'vCONFIRMAR',pic:'ZZZ9',nv:0}],oparms:[{av:'AV22EliminarItem',fld:'vELIMINARITEM',pic:'',nv:''},{av:'AV18Atributos',fld:'vATRIBUTOS',pic:'',nv:''},{av:'AV16Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV37TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV21Elem_Consecutivo',fld:'vELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV47TDet_ValorUnitario',fld:'vTDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV46TDet_ValorTotal',fld:'vTDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV39TDet_PlacaNumero',fld:'vTDET_PLACANUMERO',pic:'',nv:''},{av:'AV40TDet_PlacaPadre',fld:'vTDET_PLACAPADRE',pic:'',nv:''},{av:'AV38TDet_EsPadre',fld:'vTDET_ESPADRE',pic:'',nv:''},{av:'AV20cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV44TDet_Valor_Futuro',fld:'vTDET_VALOR_FUTURO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV45TDet_Valor_Presente',fld:'vTDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV41TDet_Plazo_N',fld:'vTDET_PLAZO_N',pic:'Z9',nv:0},{av:'AV42TDet_Taza',fld:'vTDET_TAZA',pic:'ZZ9',nv:0},{av:'AV10TDet_Otros_Costos',fld:'vTDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV55ValorTotal',fld:'vVALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'edtavEliminaritem_Enabled',ctrl:'vELIMINARITEM',prop:'Enabled'},{av:'edtavAtributos_Enabled',ctrl:'vATRIBUTOS',prop:'Enabled'}]}");
      setEventMetadata("'ELIMINAR ITEM'","{handler:'e186S2',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV16Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A654TDet_Valor_Futuro',fld:'TDET_VALOR_FUTURO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A656TDet_Plazo_N',fld:'TDET_PLAZO_N',pic:'Z9',nv:0},{av:'A655TDet_Taza',fld:'TDET_TAZA',pic:'ZZ9',nv:0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV55ValorTotal',fld:'vVALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV60Confirmar',fld:'vCONFIRMAR',pic:'ZZZ9',nv:0},{av:'AV38TDet_EsPadre',fld:'vTDET_ESPADRE',pic:'',nv:''},{av:'AV40TDet_PlacaPadre',fld:'vTDET_PLACAPADRE',pic:'',nv:''},{av:'AV37TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0}],oparms:[{av:'AV37TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0}]}");
      setEventMetadata("'CONFIRMAR'","{handler:'e156S2',iparms:[{av:'AV16Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0}],oparms:[{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'}]}");
      setEventMetadata("ALERTIFY1.OK","{handler:'e136S2',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'AV16Tran_ValorTransaccion',fld:'vTRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A483Tran_ValorTransaccion',fld:'TRAN_VALORTRANSACCION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A499Tran_CodTipoElemento',fld:'TRAN_CODTIPOELEMENTO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A487TDet_Cantidad',fld:'TDET_CANTIDAD',pic:'ZZZZZZZZZ9',nv:0},{av:'A488TDet_ValorUnitario',fld:'TDET_VALORUNITARIO',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A491TDet_PlacaPadre',fld:'TDET_PLACAPADRE',pic:'',nv:''},{av:'A505TDet_EsPadre',fld:'TDET_ESPADRE',pic:'',nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A654TDet_Valor_Futuro',fld:'TDET_VALOR_FUTURO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A653TDet_Valor_Presente',fld:'TDET_VALOR_PRESENTE',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A656TDet_Plazo_N',fld:'TDET_PLAZO_N',pic:'Z9',nv:0},{av:'A655TDet_Taza',fld:'TDET_TAZA',pic:'ZZ9',nv:0},{av:'A657TDet_Otros_Costos',fld:'TDET_OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV55ValorTotal',fld:'vVALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV60Confirmar',fld:'vCONFIRMAR',pic:'ZZZ9',nv:0}],oparms:[{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'lblUrl_Caption',ctrl:'URL',prop:'Caption'},{ctrl:'AGREGAR',prop:'Visible'},{ctrl:'BUTTON1',prop:'Visible'},{ctrl:'BUTTON2',prop:'Caption'},{av:'AV60Confirmar',fld:'vCONFIRMAR',pic:'ZZZ9',nv:0}]}");
      setEventMetadata("'ATRIBUTOS'","{handler:'e196S2',iparms:[{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV14Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV37TDet_Consecutivo',fld:'vTDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'A71Tran_Entrada',fld:'TRAN_ENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'A72Nro_Linea',fld:'NRO_LINEA',pic:'ZZZZZZZ9',nv:0}],oparms:[{av:'AV27Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0}]}");
      setEventMetadata("'CANCELAR'","{handler:'e126S1',iparms:[],oparms:[]}");
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
      wcpOAV25Fecha = GXutil.nullDate() ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV16Tran_ValorTransaccion = DecimalUtil.ZERO ;
      A483Tran_ValorTransaccion = DecimalUtil.ZERO ;
      A66Elem_Consecutivo = "" ;
      A488TDet_ValorUnitario = DecimalUtil.ZERO ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A490TDet_PlacaNumero = "" ;
      A491TDet_PlacaPadre = "" ;
      A505TDet_EsPadre = "" ;
      A298Cata_Descripcion = "" ;
      A654TDet_Valor_Futuro = DecimalUtil.ZERO ;
      A653TDet_Valor_Presente = DecimalUtil.ZERO ;
      A657TDet_Otros_Costos = DecimalUtil.ZERO ;
      AV55ValorTotal = DecimalUtil.ZERO ;
      GXKey = "" ;
      forbiddenHiddens = "" ;
      AV12Tran_DescripcionMovimiento = "" ;
      AV25Fecha = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV26Invd_Estado = "" ;
      AV31PlacaPadre = "" ;
      AV53ValorAdquisicion = DecimalUtil.ZERO ;
      AV24EsPlacaPadre = "" ;
      AV32pObservaciones = "" ;
      AV29PCata_Descripcion = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV30Placa = "" ;
      sImgUrl = "" ;
      imgImage1_Jsonclick = "" ;
      AV19Cata_Descripcion = "" ;
      AV28Observaciones = "" ;
      bttAgregar_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV21Elem_Consecutivo = "" ;
      AV20cCata_Descripcion = "" ;
      AV39TDet_PlacaNumero = "" ;
      AV38TDet_EsPadre = "" ;
      AV40TDet_PlacaPadre = "" ;
      AV47TDet_ValorUnitario = DecimalUtil.ZERO ;
      AV10TDet_Otros_Costos = DecimalUtil.ZERO ;
      AV44TDet_Valor_Futuro = DecimalUtil.ZERO ;
      AV45TDet_Valor_Presente = DecimalUtil.ZERO ;
      AV46TDet_ValorTotal = DecimalUtil.ZERO ;
      AV18Atributos = "" ;
      AV22EliminarItem = "" ;
      bttButton1_Jsonclick = "" ;
      bttButton2_Jsonclick = "" ;
      lblUrl_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV65Atributos_GXI = "" ;
      AV64Eliminaritem_GXI = "" ;
      hsh = "" ;
      AV52Usuario = "" ;
      AV17websession = httpContext.getWebSession();
      GXv_int1 = new long [1] ;
      GXv_int2 = new long [1] ;
      GXv_int3 = new long [1] ;
      AV6Alma_Modulo = "" ;
      GXv_char4 = new String [1] ;
      AV5Alma_Codigo = "" ;
      AV7Bode_Codigo = "" ;
      AV61Tran_Estado = "" ;
      GXv_char10 = new String [1] ;
      GXv_char9 = new String [1] ;
      GXv_decimal11 = new java.math.BigDecimal [1] ;
      GXv_char6 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_int12 = new int [1] ;
      scmdbuf = "" ;
      H006S2_A49Tran_CodigoMovimiento = new String[] {""} ;
      H006S2_A46Tran_Id = new long[1] ;
      H006S2_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006S2_n483Tran_ValorTransaccion = new boolean[] {false} ;
      H006S2_A499Tran_CodTipoElemento = new long[1] ;
      H006S2_n499Tran_CodTipoElemento = new boolean[] {false} ;
      A49Tran_CodigoMovimiento = "" ;
      H006S3_A37Cata_Codigo = new String[] {""} ;
      H006S3_A46Tran_Id = new long[1] ;
      H006S3_A66Elem_Consecutivo = new String[] {""} ;
      H006S3_A487TDet_Cantidad = new long[1] ;
      H006S3_A488TDet_ValorUnitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006S3_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006S3_A490TDet_PlacaNumero = new String[] {""} ;
      H006S3_n490TDet_PlacaNumero = new boolean[] {false} ;
      H006S3_A491TDet_PlacaPadre = new String[] {""} ;
      H006S3_n491TDet_PlacaPadre = new boolean[] {false} ;
      H006S3_A505TDet_EsPadre = new String[] {""} ;
      H006S3_A298Cata_Descripcion = new String[] {""} ;
      H006S3_A483Tran_ValorTransaccion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006S3_n483Tran_ValorTransaccion = new boolean[] {false} ;
      H006S3_A654TDet_Valor_Futuro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006S3_n654TDet_Valor_Futuro = new boolean[] {false} ;
      H006S3_A653TDet_Valor_Presente = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006S3_n653TDet_Valor_Presente = new boolean[] {false} ;
      H006S3_A656TDet_Plazo_N = new byte[1] ;
      H006S3_n656TDet_Plazo_N = new boolean[] {false} ;
      H006S3_A655TDet_Taza = new short[1] ;
      H006S3_n655TDet_Taza = new boolean[] {false} ;
      H006S3_A657TDet_Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006S3_n657TDet_Otros_Costos = new boolean[] {false} ;
      H006S3_A69TDet_Consecutivo = new long[1] ;
      A37Cata_Codigo = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      GXv_int7 = new long [1] ;
      GXv_int8 = new long [1] ;
      AV58url = "" ;
      H006S4_A69TDet_Consecutivo = new long[1] ;
      H006S4_A46Tran_Id = new long[1] ;
      H006S4_A71Tran_Entrada = new long[1] ;
      H006S4_A72Nro_Linea = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.wpalm_recuperacion__default(),
         new Object[] {
             new Object[] {
            H006S2_A49Tran_CodigoMovimiento, H006S2_A46Tran_Id, H006S2_A483Tran_ValorTransaccion, H006S2_n483Tran_ValorTransaccion, H006S2_A499Tran_CodTipoElemento, H006S2_n499Tran_CodTipoElemento
            }
            , new Object[] {
            H006S3_A37Cata_Codigo, H006S3_A46Tran_Id, H006S3_A66Elem_Consecutivo, H006S3_A487TDet_Cantidad, H006S3_A488TDet_ValorUnitario, H006S3_A489TDet_ValorTotal, H006S3_A490TDet_PlacaNumero, H006S3_n490TDet_PlacaNumero, H006S3_A491TDet_PlacaPadre, H006S3_n491TDet_PlacaPadre,
            H006S3_A505TDet_EsPadre, H006S3_A298Cata_Descripcion, H006S3_A483Tran_ValorTransaccion, H006S3_n483Tran_ValorTransaccion, H006S3_A654TDet_Valor_Futuro, H006S3_n654TDet_Valor_Futuro, H006S3_A653TDet_Valor_Presente, H006S3_n653TDet_Valor_Presente, H006S3_A656TDet_Plazo_N, H006S3_n656TDet_Plazo_N,
            H006S3_A655TDet_Taza, H006S3_n655TDet_Taza, H006S3_A657TDet_Otros_Costos, H006S3_n657TDet_Otros_Costos, H006S3_A69TDet_Consecutivo
            }
            , new Object[] {
            H006S4_A69TDet_Consecutivo, H006S4_A46Tran_Id, H006S4_A71Tran_Entrada, H006S4_A72Nro_Linea
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavTran_descripcionmovimiento_Enabled = 0 ;
      edtavTran_consecutivocc_Enabled = 0 ;
      edtavCata_descripcion_Enabled = 0 ;
      edtavObservaciones_Enabled = 0 ;
      edtavTran_valortransaccion_Enabled = 0 ;
      edtavTdet_consecutivo_Enabled = 0 ;
      edtavElem_consecutivo_Enabled = 0 ;
      edtavCcata_descripcion_Enabled = 0 ;
      edtavTdet_placanumero_Enabled = 0 ;
      edtavTdet_espadre_Enabled = 0 ;
      edtavTdet_placapadre_Enabled = 0 ;
      edtavTdet_valorunitario_Enabled = 0 ;
      edtavTdet_otros_costos_Enabled = 0 ;
      edtavTdet_valor_futuro_Enabled = 0 ;
      edtavTdet_taza_Enabled = 0 ;
      edtavTdet_plazo_n_Enabled = 0 ;
      edtavTdet_valor_presente_Enabled = 0 ;
      edtavTdet_valortotal_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte A656TDet_Plazo_N ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte AV41TDet_Plazo_N ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte subGrid1_Backstyle ;
   private byte GRID1_nEOF ;
   private short wcpOAV34Tabla ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_43 ;
   private short nGXsfl_43_idx=1 ;
   private short A655TDet_Taza ;
   private short AV60Confirmar ;
   private short AV34Tabla ;
   private short wbEnd ;
   private short wbStart ;
   private short AV42TDet_Taza ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV59WindowsId ;
   private int AV27Nro_Linea ;
   private int A72Nro_Linea ;
   private int edtavTran_descripcionmovimiento_Enabled ;
   private int edtavTran_consecutivocc_Enabled ;
   private int edtavPlaca_Enabled ;
   private int edtavCata_descripcion_Enabled ;
   private int edtavObservaciones_Enabled ;
   private int bttAgregar_Visible ;
   private int edtavTran_valortransaccion_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavTdet_consecutivo_Enabled ;
   private int edtavElem_consecutivo_Enabled ;
   private int edtavCcata_descripcion_Enabled ;
   private int edtavTdet_placanumero_Enabled ;
   private int edtavTdet_espadre_Enabled ;
   private int edtavTdet_placapadre_Enabled ;
   private int edtavTdet_valorunitario_Enabled ;
   private int edtavTdet_otros_costos_Enabled ;
   private int edtavTdet_valor_futuro_Enabled ;
   private int edtavTdet_taza_Enabled ;
   private int edtavTdet_plazo_n_Enabled ;
   private int edtavTdet_valor_presente_Enabled ;
   private int edtavTdet_valortotal_Enabled ;
   private int edtavAtributos_Enabled ;
   private int edtavEliminaritem_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int bttButton1_Visible ;
   private int lblUrl_Visible ;
   private int subGrid1_Islastpage ;
   private int GXv_int12[] ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int edtavTdet_consecutivo_Visible ;
   private int edtavElem_consecutivo_Visible ;
   private int edtavCcata_descripcion_Visible ;
   private int edtavTdet_placanumero_Visible ;
   private int edtavTdet_espadre_Visible ;
   private int edtavTdet_placapadre_Visible ;
   private int edtavTdet_valorunitario_Visible ;
   private int edtavTdet_otros_costos_Visible ;
   private int edtavTdet_valor_futuro_Visible ;
   private int edtavTdet_taza_Visible ;
   private int edtavTdet_plazo_n_Visible ;
   private int edtavTdet_valor_presente_Visible ;
   private int edtavTdet_valortotal_Visible ;
   private int edtavAtributos_Visible ;
   private int edtavEliminaritem_Visible ;
   private long wcpOAV14Tran_Id ;
   private long wcpOAV57Cuen_Identificacion ;
   private long wcpOAV50Tran_IdResponsabilidad ;
   private long A46Tran_Id ;
   private long AV14Tran_Id ;
   private long A499Tran_CodTipoElemento ;
   private long A69TDet_Consecutivo ;
   private long A487TDet_Cantidad ;
   private long AV57Cuen_Identificacion ;
   private long AV50Tran_IdResponsabilidad ;
   private long AV49Tran_IdEntrada ;
   private long A71Tran_Entrada ;
   private long AV11TRan_ConsecutivoCC ;
   private long AV37TDet_Consecutivo ;
   private long GRID1_nCurrentRecord ;
   private long GXv_int1[] ;
   private long AV9Regi_Id ;
   private long GXv_int2[] ;
   private long AV8Cent_Id ;
   private long GXv_int3[] ;
   private long AV15Tran_IdCuentadanteOrigen ;
   private long AV48Tran_CodTipoElemento ;
   private long AV35TDet_Cantidad ;
   private long GXv_int7[] ;
   private long GXv_int8[] ;
   private long AV13Tran_Entrada ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal AV16Tran_ValorTransaccion ;
   private java.math.BigDecimal A483Tran_ValorTransaccion ;
   private java.math.BigDecimal A488TDet_ValorUnitario ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal A654TDet_Valor_Futuro ;
   private java.math.BigDecimal A653TDet_Valor_Presente ;
   private java.math.BigDecimal A657TDet_Otros_Costos ;
   private java.math.BigDecimal AV55ValorTotal ;
   private java.math.BigDecimal AV53ValorAdquisicion ;
   private java.math.BigDecimal AV47TDet_ValorUnitario ;
   private java.math.BigDecimal AV10TDet_Otros_Costos ;
   private java.math.BigDecimal AV44TDet_Valor_Futuro ;
   private java.math.BigDecimal AV45TDet_Valor_Presente ;
   private java.math.BigDecimal AV46TDet_ValorTotal ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_43_idx="0001" ;
   private String GXKey ;
   private String forbiddenHiddens ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV24EsPlacaPadre ;
   private String Alertify1_Type ;
   private String Alertify1_Textmessage ;
   private String Alertify1_Textok ;
   private String Alertify1_Textcancel ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String TempTags ;
   private String edtavTran_descripcionmovimiento_Internalname ;
   private String edtavTran_descripcionmovimiento_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTable1_Internalname ;
   private String edtavTran_consecutivocc_Internalname ;
   private String edtavTran_consecutivocc_Jsonclick ;
   private String edtavPlaca_Internalname ;
   private String edtavPlaca_Jsonclick ;
   private String sImgUrl ;
   private String imgImage1_Internalname ;
   private String imgImage1_Jsonclick ;
   private String edtavCata_descripcion_Internalname ;
   private String edtavObservaciones_Internalname ;
   private String bttAgregar_Internalname ;
   private String bttAgregar_Jsonclick ;
   private String edtavTran_valortransaccion_Internalname ;
   private String edtavTran_valortransaccion_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String divTable2_Internalname ;
   private String bttButton1_Internalname ;
   private String bttButton1_Jsonclick ;
   private String bttButton2_Internalname ;
   private String bttButton2_Caption ;
   private String bttButton2_Jsonclick ;
   private String lblUrl_Internalname ;
   private String lblUrl_Caption ;
   private String lblUrl_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTdet_consecutivo_Internalname ;
   private String edtavElem_consecutivo_Internalname ;
   private String edtavCcata_descripcion_Internalname ;
   private String edtavTdet_placanumero_Internalname ;
   private String edtavTdet_espadre_Internalname ;
   private String edtavTdet_placapadre_Internalname ;
   private String edtavTdet_valorunitario_Internalname ;
   private String edtavTdet_otros_costos_Internalname ;
   private String edtavTdet_valor_futuro_Internalname ;
   private String edtavTdet_taza_Internalname ;
   private String edtavTdet_plazo_n_Internalname ;
   private String edtavTdet_valor_presente_Internalname ;
   private String edtavTdet_valortotal_Internalname ;
   private String edtavAtributos_Internalname ;
   private String edtavEliminaritem_Internalname ;
   private String hsh ;
   private String GXv_char4[] ;
   private String AV61Tran_Estado ;
   private String Alertify1_Internalname ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String ROClassString ;
   private String edtavTdet_consecutivo_Jsonclick ;
   private String edtavElem_consecutivo_Jsonclick ;
   private String edtavCcata_descripcion_Jsonclick ;
   private String edtavTdet_placanumero_Jsonclick ;
   private String edtavTdet_espadre_Jsonclick ;
   private String edtavTdet_placapadre_Jsonclick ;
   private String edtavTdet_valorunitario_Jsonclick ;
   private String edtavTdet_otros_costos_Jsonclick ;
   private String edtavTdet_valor_futuro_Jsonclick ;
   private String edtavTdet_taza_Jsonclick ;
   private String edtavTdet_plazo_n_Jsonclick ;
   private String edtavTdet_valor_presente_Jsonclick ;
   private String edtavTdet_valortotal_Jsonclick ;
   private String edtavAtributos_Jsonclick ;
   private String edtavEliminaritem_Jsonclick ;
   private java.util.Date wcpOAV25Fecha ;
   private java.util.Date AV25Fecha ;
   private boolean entryPointCalled ;
   private boolean n483Tran_ValorTransaccion ;
   private boolean n499Tran_CodTipoElemento ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n491TDet_PlacaPadre ;
   private boolean n654TDet_Valor_Futuro ;
   private boolean n653TDet_Valor_Presente ;
   private boolean n656TDet_Plazo_N ;
   private boolean n655TDet_Taza ;
   private boolean n657TDet_Otros_Costos ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean returnInSub ;
   private boolean AV18Atributos_IsBlob ;
   private boolean AV22EliminarItem_IsBlob ;
   private String A66Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String A491TDet_PlacaPadre ;
   private String A505TDet_EsPadre ;
   private String A298Cata_Descripcion ;
   private String AV12Tran_DescripcionMovimiento ;
   private String AV26Invd_Estado ;
   private String AV31PlacaPadre ;
   private String AV32pObservaciones ;
   private String AV29PCata_Descripcion ;
   private String AV30Placa ;
   private String AV19Cata_Descripcion ;
   private String AV28Observaciones ;
   private String AV21Elem_Consecutivo ;
   private String AV20cCata_Descripcion ;
   private String AV39TDet_PlacaNumero ;
   private String AV38TDet_EsPadre ;
   private String AV40TDet_PlacaPadre ;
   private String AV65Atributos_GXI ;
   private String AV64Eliminaritem_GXI ;
   private String AV52Usuario ;
   private String AV6Alma_Modulo ;
   private String AV5Alma_Codigo ;
   private String AV7Bode_Codigo ;
   private String A49Tran_CodigoMovimiento ;
   private String A37Cata_Codigo ;
   private String AV58url ;
   private String AV18Atributos ;
   private String AV22EliminarItem ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV17websession ;
   private IDataStoreProvider pr_default ;
   private String[] H006S2_A49Tran_CodigoMovimiento ;
   private long[] H006S2_A46Tran_Id ;
   private java.math.BigDecimal[] H006S2_A483Tran_ValorTransaccion ;
   private boolean[] H006S2_n483Tran_ValorTransaccion ;
   private long[] H006S2_A499Tran_CodTipoElemento ;
   private boolean[] H006S2_n499Tran_CodTipoElemento ;
   private String[] H006S3_A37Cata_Codigo ;
   private long[] H006S3_A46Tran_Id ;
   private String[] H006S3_A66Elem_Consecutivo ;
   private long[] H006S3_A487TDet_Cantidad ;
   private java.math.BigDecimal[] H006S3_A488TDet_ValorUnitario ;
   private java.math.BigDecimal[] H006S3_A489TDet_ValorTotal ;
   private String[] H006S3_A490TDet_PlacaNumero ;
   private boolean[] H006S3_n490TDet_PlacaNumero ;
   private String[] H006S3_A491TDet_PlacaPadre ;
   private boolean[] H006S3_n491TDet_PlacaPadre ;
   private String[] H006S3_A505TDet_EsPadre ;
   private String[] H006S3_A298Cata_Descripcion ;
   private java.math.BigDecimal[] H006S3_A483Tran_ValorTransaccion ;
   private boolean[] H006S3_n483Tran_ValorTransaccion ;
   private java.math.BigDecimal[] H006S3_A654TDet_Valor_Futuro ;
   private boolean[] H006S3_n654TDet_Valor_Futuro ;
   private java.math.BigDecimal[] H006S3_A653TDet_Valor_Presente ;
   private boolean[] H006S3_n653TDet_Valor_Presente ;
   private byte[] H006S3_A656TDet_Plazo_N ;
   private boolean[] H006S3_n656TDet_Plazo_N ;
   private short[] H006S3_A655TDet_Taza ;
   private boolean[] H006S3_n655TDet_Taza ;
   private java.math.BigDecimal[] H006S3_A657TDet_Otros_Costos ;
   private boolean[] H006S3_n657TDet_Otros_Costos ;
   private long[] H006S3_A69TDet_Consecutivo ;
   private long[] H006S4_A69TDet_Consecutivo ;
   private long[] H006S4_A46Tran_Id ;
   private long[] H006S4_A71Tran_Entrada ;
   private int[] H006S4_A72Nro_Linea ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class wpalm_recuperacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H006S2", "SELECT T1.Tran_CodigoMovimiento AS Tran_CodigoMovimiento, T1.Tran_Id, T1.Tran_ValorTransaccion, T2.Tipo_Codigo AS Tran_CodTipoElemento FROM (ALM_TRANSACCION T1 INNER JOIN ALM_TIPO_MOVIMIENTO T2 ON T2.Tpmo_Codigo = T1.Tran_CodigoMovimiento) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006S3", "SELECT T3.Cata_Codigo, T1.Tran_Id, T1.Elem_Consecutivo, T1.TDet_Cantidad, T1.TDet_ValorUnitario, T1.TDet_ValorTotal, T1.TDet_PlacaNumero, T1.TDet_PlacaPadre, T1.TDet_EsPadre, T4.Cata_Descripcion, T2.Tran_ValorTransaccion, T1.TDet_Valor_Futuro, T1.TDet_Valor_Presente, T1.TDet_Plazo_N, T1.TDet_Taza, T1.TDet_Otros_Costos, T1.TDet_Consecutivo FROM (((ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Tran_Id) INNER JOIN ALM_ELEMENTO T3 ON T3.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T4 ON T4.Cata_Codigo = T3.Cata_Codigo) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id, T1.TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006S4", "SELECT TDet_Consecutivo, Tran_Id, Tran_Entrada, Nro_Linea FROM ALM_DET_TRAN_DATOS_SALIDA WHERE Tran_Id = ? and TDet_Consecutivo = ? ORDER BY Tran_Id, TDet_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2) ;
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(14) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(16,2) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(17) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
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
               stmt.setBigDecimal(2, ((Number) parms[1]).longValue(), 0);
               return;
      }
   }

}

