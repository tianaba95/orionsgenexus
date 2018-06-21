/*
               File: selecinvenresponsabilidad_impl
        Description: Selec Inven Responsabilidad
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:20:46.54
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

public final  class selecinvenresponsabilidad_impl extends GXDataArea
{
   public selecinvenresponsabilidad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public selecinvenresponsabilidad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( selecinvenresponsabilidad_impl.class ));
   }

   public selecinvenresponsabilidad_impl( int remoteHandle ,
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
            nRC_GXsfl_74 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_74_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_74_idx = httpContext.GetNextPar( ) ;
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
            AV38Tabla = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            A101DEVOC_TRAN_ID = GXutil.lval( httpContext.GetNextPar( )) ;
            n101DEVOC_TRAN_ID = false ;
            A103DEVOC_FECHA_MOVIMIENTO = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            n103DEVOC_FECHA_MOVIMIENTO = false ;
            A99DEVOC_ESTADO = httpContext.GetNextPar( ) ;
            n99DEVOC_ESTADO = false ;
            AV41Transaccion = GXutil.lval( httpContext.GetNextPar( )) ;
            AV5Fecha = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            A102DEVOC_CONSECUTIVO = httpContext.GetNextPar( ) ;
            n102DEVOC_CONSECUTIVO = false ;
            A725DEVOC_PLACA = httpContext.GetNextPar( ) ;
            n725DEVOC_PLACA = false ;
            A728DEVOC_MARCA = httpContext.GetNextPar( ) ;
            n728DEVOC_MARCA = false ;
            A730DEVOC_MODELO = httpContext.GetNextPar( ) ;
            n730DEVOC_MODELO = false ;
            A727DEVOC_SERIAL = httpContext.GetNextPar( ) ;
            n727DEVOC_SERIAL = false ;
            A732DEVOC_VALOR_ADQUISICION = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            n732DEVOC_VALOR_ADQUISICION = false ;
            A746DEVOC_DESCRIPCION = httpContext.GetNextPar( ) ;
            n746DEVOC_DESCRIPCION = false ;
            AV45Estado = httpContext.GetNextPar( ) ;
            A46Tran_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            A66Elem_Consecutivo = httpContext.GetNextPar( ) ;
            A490TDet_PlacaNumero = httpContext.GetNextPar( ) ;
            n490TDet_PlacaNumero = false ;
            A489TDet_ValorTotal = DecimalUtil.doubleToDec(GXutil.val( httpContext.GetNextPar( ), ".")) ;
            A298Cata_Descripcion = httpContext.GetNextPar( ) ;
            AV26Marca = httpContext.GetNextPar( ) ;
            AV27Modelo = httpContext.GetNextPar( ) ;
            AV37Serial = httpContext.GetNextPar( ) ;
            AV29Observaciones = httpContext.GetNextPar( ) ;
            AV40Tran_IdEntrada = GXutil.lval( httpContext.GetNextPar( )) ;
            AV28Nro_Linea = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV21Consecutivo = httpContext.GetNextPar( ) ;
            A67Invd_NumeroPlaca = httpContext.GetNextPar( ) ;
            AV32Placa = httpContext.GetNextPar( ) ;
            A463Invd_Estado = httpContext.GetNextPar( ) ;
            n463Invd_Estado = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV38Tabla, A101DEVOC_TRAN_ID, A103DEVOC_FECHA_MOVIMIENTO, A99DEVOC_ESTADO, AV41Transaccion, AV5Fecha, A102DEVOC_CONSECUTIVO, A725DEVOC_PLACA, A728DEVOC_MARCA, A730DEVOC_MODELO, A727DEVOC_SERIAL, A732DEVOC_VALOR_ADQUISICION, A746DEVOC_DESCRIPCION, AV45Estado, A46Tran_Id, A66Elem_Consecutivo, A490TDet_PlacaNumero, A489TDet_ValorTotal, A298Cata_Descripcion, AV26Marca, AV27Modelo, AV37Serial, AV29Observaciones, AV40Tran_IdEntrada, AV28Nro_Linea, AV21Consecutivo, A67Invd_NumeroPlaca, AV32Placa, A463Invd_Estado) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV35pplaca = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35pplaca", AV35pplaca);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV30pCata_Descripcion = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30pCata_Descripcion", AV30pCata_Descripcion);
               AV34pObservaciones = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34pObservaciones", AV34pObservaciones);
               AV23Cuen_Identificacion = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23Cuen_Identificacion", GXutil.ltrim( GXutil.str( AV23Cuen_Identificacion, 18, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
               AV41Transaccion = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41Transaccion", GXutil.ltrim( GXutil.str( AV41Transaccion, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRANSACCION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Transaccion), "ZZZZZZZZZZ9")));
               AV5Fecha = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Fecha", localUtil.format(AV5Fecha, "99/99/99"));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vFECHA", getSecureSignedToken( "", AV5Fecha));
               AV38Tabla = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38Tabla", GXutil.ltrim( GXutil.str( AV38Tabla, 4, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTABLA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38Tabla), "ZZZ9")));
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
         MasterPageObj = new com.orions2.rwdpromptmasterpage_impl (remoteHandle, context.copy());
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
      pa6I2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start6I2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414204663");
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.selecinvenresponsabilidad") + "?" + GXutil.URLEncode(GXutil.rtrim(AV35pplaca)) + "," + GXutil.URLEncode(GXutil.rtrim(AV30pCata_Descripcion)) + "," + GXutil.URLEncode(GXutil.rtrim(AV34pObservaciones)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23Cuen_Identificacion,18,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV41Transaccion,11,0))) + "," + GXutil.URLEncode(GXutil.formatDateParm(AV5Fecha)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV38Tabla,4,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_74", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_74, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTABLA", GXutil.ltrim( localUtil.ntoc( AV38Tabla, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_TRAN_ID", GXutil.ltrim( localUtil.ntoc( A101DEVOC_TRAN_ID, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_FECHA_MOVIMIENTO", localUtil.dtoc( A103DEVOC_FECHA_MOVIMIENTO, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_ESTADO", A99DEVOC_ESTADO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRANSACCION", GXutil.ltrim( localUtil.ntoc( AV41Transaccion, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vFECHA", localUtil.dtoc( AV5Fecha, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_CONSECUTIVO", A102DEVOC_CONSECUTIVO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_PLACA", A725DEVOC_PLACA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_MARCA", A728DEVOC_MARCA);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_MODELO", A730DEVOC_MODELO);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_SERIAL", A727DEVOC_SERIAL);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_VALOR_ADQUISICION", GXutil.ltrim( localUtil.ntoc( A732DEVOC_VALOR_ADQUISICION, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "DEVOC_DESCRIPCION", A746DEVOC_DESCRIPCION);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vESTADO", GXutil.rtrim( AV45Estado));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_PLACANUMERO", A490TDet_PlacaNumero);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORTOTAL", GXutil.ltrim( localUtil.ntoc( A489TDet_ValorTotal, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCION", A298Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDENTRADA", GXutil.ltrim( localUtil.ntoc( AV40Tran_IdEntrada, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNRO_LINEA", GXutil.ltrim( localUtil.ntoc( AV28Nro_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACA", A67Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ESTADO", A463Invd_Estado);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPPLACA", AV35pplaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPCATA_DESCRIPCION", AV30pCata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPOBSERVACIONES", AV34pObservaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( AV23Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRANSACCION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Transaccion), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHA", getSecureSignedToken( "", AV5Fecha));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABLA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38Tabla), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRANSACCION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Transaccion), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHA", getSecureSignedToken( "", AV5Fecha));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTABLA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38Tabla), "ZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACAFILTERCONTAINER_Class", GXutil.rtrim( divInvd_numeroplacafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_DESCRIPCIONIDFILTERCONTAINER_Class", GXutil.rtrim( divInvd_descripcionidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVOFILTERCONTAINER_Class", GXutil.rtrim( divElem_consecutivofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_MARCAFILTERCONTAINER_Class", GXutil.rtrim( divInvd_marcafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_MODELOFILTERCONTAINER_Class", GXutil.rtrim( divInvd_modelofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_SERIALFILTERCONTAINER_Class", GXutil.rtrim( divInvd_serialfiltercontainer_Class));
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", "notset");
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
         we6I2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt6I2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.orions2.selecinvenresponsabilidad") + "?" + GXutil.URLEncode(GXutil.rtrim(AV35pplaca)) + "," + GXutil.URLEncode(GXutil.rtrim(AV30pCata_Descripcion)) + "," + GXutil.URLEncode(GXutil.rtrim(AV34pObservaciones)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV23Cuen_Identificacion,18,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV41Transaccion,11,0))) + "," + GXutil.URLEncode(GXutil.formatDateParm(AV5Fecha)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV38Tabla,4,0))) ;
   }

   public String getPgmname( )
   {
      return "SelecInvenResponsabilidad" ;
   }

   public String getPgmdesc( )
   {
      return "Selec Inven Responsabilidad" ;
   }

   public void wb6I0( )
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
         com.orions2.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divMain_Internalname, 1, 0, "px", 0, "px", "ContainerFluid PromptContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 col-lg-2 PromptAdvancedBarCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divAdvancedcontainer_Internalname, 1, 0, "px", 0, "px", divAdvancedcontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_numeroplacafiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_numeroplacafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_numeroplacafilter_Internalname, "Número de placa", "", "", lblLblinvd_numeroplacafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e116i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInvenResponsabilidad.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_numeroplaca_Internalname, "Numero de Placa", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_numeroplaca_Internalname, AV15cInvd_NumeroPlaca, GXutil.rtrim( localUtil.format( AV15cInvd_NumeroPlaca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_numeroplaca_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_numeroplaca_Visible, edtavCinvd_numeroplaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInvenResponsabilidad.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_descripcionidfiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_descripcionidfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_descripcionidfilter_Internalname, "Descripción", "", "", lblLblinvd_descripcionidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e126i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInvenResponsabilidad.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_descripciondevolutivo_Internalname, "Descripcion Devolutivo", "col-sm-3 AttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCinvd_descripciondevolutivo_Internalname, AV12cInvd_DescripcionDevolutivo, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", (short)(0), edtavCinvd_descripciondevolutivo_Visible, edtavCinvd_descripciondevolutivo_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_SelecInvenResponsabilidad.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divElem_consecutivofiltercontainer_Internalname, 1, 0, "px", 0, "px", divElem_consecutivofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelem_consecutivofilter_Internalname, "Consecutivo", "", "", lblLblelem_consecutivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e136i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInvenResponsabilidad.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCelem_consecutivo_Internalname, "Consecutivo", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV8cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV8cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtavCelem_consecutivo_Visible, edtavCelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInvenResponsabilidad.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmarcafilter_Internalname, "Marca", "", "", lblLblmarcafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e146i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInvenResponsabilidad.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCmarca_Internalname, AV19cMarca, GXutil.rtrim( localUtil.format( AV19cMarca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCmarca_Jsonclick, 0, "Attribute", "", "", "", edtavCmarca_Visible, edtavCmarca_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInvenResponsabilidad.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmodelofilter_Internalname, "Modelo", "", "", lblLblmodelofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e156i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInvenResponsabilidad.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCmodelo_Internalname, AV20cModelo, GXutil.rtrim( localUtil.format( AV20cModelo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCmodelo_Jsonclick, 0, "Attribute", "", "", "", edtavCmodelo_Visible, edtavCmodelo_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInvenResponsabilidad.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblserialfilter_Internalname, "Serial", "", "", lblLblserialfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e166i1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInvenResponsabilidad.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCserial_Internalname, AV22cSerial, GXutil.rtrim( localUtil.format( AV22cSerial, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCserial_Jsonclick, 0, "Attribute", "", "", "", edtavCserial_Visible, edtavCserial_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInvenResponsabilidad.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-10 WWGridCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divGridtable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-sm hidden-md hidden-lg ToggleCell", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e176i1_client"+"'", TempTags, "", 2, "HLP_SelecInvenResponsabilidad.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"74\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "PromptGrid", 0, "", "", 1, 2, sStyleString, "", 0);
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
            httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"SelectionAttribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Observaciones") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
            httpContext.writeValue( "Valor") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "PromptGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV25LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV32Placa);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPlaca_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV21Consecutivo);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConsecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV7Cata_Descripcion);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCata_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV26Marca);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMarca_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV27Modelo);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavModelo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV37Serial);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSerial_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV29Observaciones);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavObservaciones_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42Valor, (byte)(24), (byte)(2), ".", "")));
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValor_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 74 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_74 = (short)(nGXsfl_74_idx-1) ;
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
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SelecInvenResponsabilidad.htm");
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

   public void start6I2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selec Inven Responsabilidad", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup6I0( ) ;
   }

   public void ws6I2( )
   {
      start6I2( ) ;
      evt6I2( ) ;
   }

   public void evt6I2( )
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
                           /* No code required for Cancel button. It is implemented as the Reset button. */
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 4), "LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_74_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_742( ) ;
                           AV25LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV25LinkSelection)==0) ? AV48Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV25LinkSelection))), !bGXsfl_74_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV25LinkSelection), true);
                           AV32Placa = httpContext.cgiGet( edtavPlaca_Internalname) ;
                           AV21Consecutivo = httpContext.cgiGet( edtavConsecutivo_Internalname) ;
                           AV7Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCata_descripcion_Internalname)) ;
                           AV26Marca = httpContext.cgiGet( edtavMarca_Internalname) ;
                           AV27Modelo = httpContext.cgiGet( edtavModelo_Internalname) ;
                           AV37Serial = httpContext.cgiGet( edtavSerial_Internalname) ;
                           AV29Observaciones = httpContext.cgiGet( edtavObservaciones_Internalname) ;
                           AV42Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e186I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e196I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e206I2 ();
                                    }
                                    dynload_actions( ) ;
                                 }
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

   public void we6I2( )
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

   public void pa6I2( )
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
      subsflControlProps_742( ) ;
      while ( nGXsfl_74_idx <= nRC_GXsfl_74 )
      {
         sendrow_742( ) ;
         nGXsfl_74_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_74_idx+1)) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  short AV38Tabla ,
                                  long A101DEVOC_TRAN_ID ,
                                  java.util.Date A103DEVOC_FECHA_MOVIMIENTO ,
                                  String A99DEVOC_ESTADO ,
                                  long AV41Transaccion ,
                                  java.util.Date AV5Fecha ,
                                  String A102DEVOC_CONSECUTIVO ,
                                  String A725DEVOC_PLACA ,
                                  String A728DEVOC_MARCA ,
                                  String A730DEVOC_MODELO ,
                                  String A727DEVOC_SERIAL ,
                                  java.math.BigDecimal A732DEVOC_VALOR_ADQUISICION ,
                                  String A746DEVOC_DESCRIPCION ,
                                  String AV45Estado ,
                                  long A46Tran_Id ,
                                  String A66Elem_Consecutivo ,
                                  String A490TDet_PlacaNumero ,
                                  java.math.BigDecimal A489TDet_ValorTotal ,
                                  String A298Cata_Descripcion ,
                                  String AV26Marca ,
                                  String AV27Modelo ,
                                  String AV37Serial ,
                                  String AV29Observaciones ,
                                  long AV40Tran_IdEntrada ,
                                  int AV28Nro_Linea ,
                                  String AV21Consecutivo ,
                                  String A67Invd_NumeroPlaca ,
                                  String AV32Placa ,
                                  String A463Invd_Estado )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf6I2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLACA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32Placa, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPLACA", AV32Placa);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCONSECUTIVO", AV21Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCATA_DESCRIPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Cata_Descripcion, "@!"))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCATA_DESCRIPCION", AV7Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26Marca, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMARCA", AV26Marca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODELO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Modelo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODELO", AV27Modelo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37Serial, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSERIAL", AV37Serial);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOBSERVACIONES", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Observaciones, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vOBSERVACIONES", AV29Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR", getSecureSignedToken( "", localUtil.format( AV42Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vVALOR", GXutil.ltrim( localUtil.ntoc( AV42Valor, (byte)(18), (byte)(2), ".", "")));
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf6I2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavPlaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPlaca_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavConsecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavConsecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavConsecutivo_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavCata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMarca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMarca_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavModelo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModelo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavModelo_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavSerial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSerial_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSerial_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObservaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavObservaciones_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValor_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
   }

   public void rf6I2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(74) ;
      nGXsfl_74_idx = (short)(1) ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_742( ) ;
      bGXsfl_74_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "PromptGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_742( ) ;
         /* Execute user event: Load */
         e196I2 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_74_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            /* Execute user event: Load */
            e196I2 ();
         }
         wbEnd = (short)(74) ;
         wb6I0( ) ;
      }
      bGXsfl_74_Refreshing = true ;
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
      return 10*1 ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV38Tabla, A101DEVOC_TRAN_ID, A103DEVOC_FECHA_MOVIMIENTO, A99DEVOC_ESTADO, AV41Transaccion, AV5Fecha, A102DEVOC_CONSECUTIVO, A725DEVOC_PLACA, A728DEVOC_MARCA, A730DEVOC_MODELO, A727DEVOC_SERIAL, A732DEVOC_VALOR_ADQUISICION, A746DEVOC_DESCRIPCION, AV45Estado, A46Tran_Id, A66Elem_Consecutivo, A490TDet_PlacaNumero, A489TDet_ValorTotal, A298Cata_Descripcion, AV26Marca, AV27Modelo, AV37Serial, AV29Observaciones, AV40Tran_IdEntrada, AV28Nro_Linea, AV21Consecutivo, A67Invd_NumeroPlaca, AV32Placa, A463Invd_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV38Tabla, A101DEVOC_TRAN_ID, A103DEVOC_FECHA_MOVIMIENTO, A99DEVOC_ESTADO, AV41Transaccion, AV5Fecha, A102DEVOC_CONSECUTIVO, A725DEVOC_PLACA, A728DEVOC_MARCA, A730DEVOC_MODELO, A727DEVOC_SERIAL, A732DEVOC_VALOR_ADQUISICION, A746DEVOC_DESCRIPCION, AV45Estado, A46Tran_Id, A66Elem_Consecutivo, A490TDet_PlacaNumero, A489TDet_ValorTotal, A298Cata_Descripcion, AV26Marca, AV27Modelo, AV37Serial, AV29Observaciones, AV40Tran_IdEntrada, AV28Nro_Linea, AV21Consecutivo, A67Invd_NumeroPlaca, AV32Placa, A463Invd_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV38Tabla, A101DEVOC_TRAN_ID, A103DEVOC_FECHA_MOVIMIENTO, A99DEVOC_ESTADO, AV41Transaccion, AV5Fecha, A102DEVOC_CONSECUTIVO, A725DEVOC_PLACA, A728DEVOC_MARCA, A730DEVOC_MODELO, A727DEVOC_SERIAL, A732DEVOC_VALOR_ADQUISICION, A746DEVOC_DESCRIPCION, AV45Estado, A46Tran_Id, A66Elem_Consecutivo, A490TDet_PlacaNumero, A489TDet_ValorTotal, A298Cata_Descripcion, AV26Marca, AV27Modelo, AV37Serial, AV29Observaciones, AV40Tran_IdEntrada, AV28Nro_Linea, AV21Consecutivo, A67Invd_NumeroPlaca, AV32Placa, A463Invd_Estado) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV38Tabla, A101DEVOC_TRAN_ID, A103DEVOC_FECHA_MOVIMIENTO, A99DEVOC_ESTADO, AV41Transaccion, AV5Fecha, A102DEVOC_CONSECUTIVO, A725DEVOC_PLACA, A728DEVOC_MARCA, A730DEVOC_MODELO, A727DEVOC_SERIAL, A732DEVOC_VALOR_ADQUISICION, A746DEVOC_DESCRIPCION, AV45Estado, A46Tran_Id, A66Elem_Consecutivo, A490TDet_PlacaNumero, A489TDet_ValorTotal, A298Cata_Descripcion, AV26Marca, AV27Modelo, AV37Serial, AV29Observaciones, AV40Tran_IdEntrada, AV28Nro_Linea, AV21Consecutivo, A67Invd_NumeroPlaca, AV32Placa, A463Invd_Estado) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV38Tabla, A101DEVOC_TRAN_ID, A103DEVOC_FECHA_MOVIMIENTO, A99DEVOC_ESTADO, AV41Transaccion, AV5Fecha, A102DEVOC_CONSECUTIVO, A725DEVOC_PLACA, A728DEVOC_MARCA, A730DEVOC_MODELO, A727DEVOC_SERIAL, A732DEVOC_VALOR_ADQUISICION, A746DEVOC_DESCRIPCION, AV45Estado, A46Tran_Id, A66Elem_Consecutivo, A490TDet_PlacaNumero, A489TDet_ValorTotal, A298Cata_Descripcion, AV26Marca, AV27Modelo, AV37Serial, AV29Observaciones, AV40Tran_IdEntrada, AV28Nro_Linea, AV21Consecutivo, A67Invd_NumeroPlaca, AV32Placa, A463Invd_Estado) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup6I0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavPlaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPlaca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavPlaca_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavConsecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavConsecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavConsecutivo_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavCata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCata_descripcion_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMarca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMarca_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavModelo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModelo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavModelo_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavSerial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSerial_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSerial_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObservaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavObservaciones_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavValor_Enabled, 5, 0)), !bGXsfl_74_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e186I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV15cInvd_NumeroPlaca = httpContext.cgiGet( edtavCinvd_numeroplaca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15cInvd_NumeroPlaca", AV15cInvd_NumeroPlaca);
         AV12cInvd_DescripcionDevolutivo = httpContext.cgiGet( edtavCinvd_descripciondevolutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12cInvd_DescripcionDevolutivo", AV12cInvd_DescripcionDevolutivo);
         AV8cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8cElem_Consecutivo", AV8cElem_Consecutivo);
         AV19cMarca = httpContext.cgiGet( edtavCmarca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19cMarca", AV19cMarca);
         AV20cModelo = httpContext.cgiGet( edtavCmodelo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20cModelo", AV20cModelo);
         AV22cSerial = httpContext.cgiGet( edtavCserial_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22cSerial", AV22cSerial);
         /* Read saved values. */
         nRC_GXsfl_74 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_74"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e186I2 ();
      if (returnInSub) return;
   }

   public void e186I2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Inventario Responsabilidad", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV6ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e196I2( )
   {
      /* Load Routine */
      AV25LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV48Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      if ( AV38Tabla == 1 )
      {
         /* Using cursor H006I2 */
         pr_default.execute(0, new Object[] {new Long(AV41Transaccion), AV5Fecha});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A757DEVOC_CATACODIGO = H006I2_A757DEVOC_CATACODIGO[0] ;
            n757DEVOC_CATACODIGO = H006I2_n757DEVOC_CATACODIGO[0] ;
            A99DEVOC_ESTADO = H006I2_A99DEVOC_ESTADO[0] ;
            n99DEVOC_ESTADO = H006I2_n99DEVOC_ESTADO[0] ;
            A103DEVOC_FECHA_MOVIMIENTO = H006I2_A103DEVOC_FECHA_MOVIMIENTO[0] ;
            n103DEVOC_FECHA_MOVIMIENTO = H006I2_n103DEVOC_FECHA_MOVIMIENTO[0] ;
            A101DEVOC_TRAN_ID = H006I2_A101DEVOC_TRAN_ID[0] ;
            n101DEVOC_TRAN_ID = H006I2_n101DEVOC_TRAN_ID[0] ;
            A102DEVOC_CONSECUTIVO = H006I2_A102DEVOC_CONSECUTIVO[0] ;
            n102DEVOC_CONSECUTIVO = H006I2_n102DEVOC_CONSECUTIVO[0] ;
            A725DEVOC_PLACA = H006I2_A725DEVOC_PLACA[0] ;
            n725DEVOC_PLACA = H006I2_n725DEVOC_PLACA[0] ;
            A728DEVOC_MARCA = H006I2_A728DEVOC_MARCA[0] ;
            n728DEVOC_MARCA = H006I2_n728DEVOC_MARCA[0] ;
            A730DEVOC_MODELO = H006I2_A730DEVOC_MODELO[0] ;
            n730DEVOC_MODELO = H006I2_n730DEVOC_MODELO[0] ;
            A727DEVOC_SERIAL = H006I2_A727DEVOC_SERIAL[0] ;
            n727DEVOC_SERIAL = H006I2_n727DEVOC_SERIAL[0] ;
            A732DEVOC_VALOR_ADQUISICION = H006I2_A732DEVOC_VALOR_ADQUISICION[0] ;
            n732DEVOC_VALOR_ADQUISICION = H006I2_n732DEVOC_VALOR_ADQUISICION[0] ;
            A746DEVOC_DESCRIPCION = H006I2_A746DEVOC_DESCRIPCION[0] ;
            n746DEVOC_DESCRIPCION = H006I2_n746DEVOC_DESCRIPCION[0] ;
            A757DEVOC_CATACODIGO = H006I2_A757DEVOC_CATACODIGO[0] ;
            n757DEVOC_CATACODIGO = H006I2_n757DEVOC_CATACODIGO[0] ;
            A746DEVOC_DESCRIPCION = H006I2_A746DEVOC_DESCRIPCION[0] ;
            n746DEVOC_DESCRIPCION = H006I2_n746DEVOC_DESCRIPCION[0] ;
            AV21Consecutivo = A102DEVOC_CONSECUTIVO ;
            AV32Placa = A725DEVOC_PLACA ;
            AV26Marca = A728DEVOC_MARCA ;
            AV27Modelo = A730DEVOC_MODELO ;
            AV37Serial = A727DEVOC_SERIAL ;
            AV42Valor = A732DEVOC_VALOR_ADQUISICION ;
            AV7Cata_Descripcion = A746DEVOC_DESCRIPCION ;
            /* Execute user subroutine: 'VALIDA PLACA' */
            S113 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            if ( GXutil.strcmp(AV45Estado, "R") == 0 )
            {
               if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
               {
                  sendrow_742( ) ;
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
               if ( isFullAjaxMode( ) && ! bGXsfl_74_Refreshing )
               {
                  httpContext.doAjaxLoad(74, Grid1Row);
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else
      {
         /* Using cursor H006I3 */
         pr_default.execute(1, new Object[] {new Long(AV41Transaccion)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A37Cata_Codigo = H006I3_A37Cata_Codigo[0] ;
            A46Tran_Id = H006I3_A46Tran_Id[0] ;
            A66Elem_Consecutivo = H006I3_A66Elem_Consecutivo[0] ;
            A490TDet_PlacaNumero = H006I3_A490TDet_PlacaNumero[0] ;
            n490TDet_PlacaNumero = H006I3_n490TDet_PlacaNumero[0] ;
            A489TDet_ValorTotal = H006I3_A489TDet_ValorTotal[0] ;
            A298Cata_Descripcion = H006I3_A298Cata_Descripcion[0] ;
            A37Cata_Codigo = H006I3_A37Cata_Codigo[0] ;
            A298Cata_Descripcion = H006I3_A298Cata_Descripcion[0] ;
            AV21Consecutivo = A66Elem_Consecutivo ;
            AV32Placa = A490TDet_PlacaNumero ;
            AV42Valor = A489TDet_ValorTotal ;
            AV7Cata_Descripcion = A298Cata_Descripcion ;
            GXv_char1[0] = AV32Placa ;
            GXv_char2[0] = AV26Marca ;
            GXv_char3[0] = AV27Modelo ;
            GXv_char4[0] = AV37Serial ;
            GXv_char5[0] = AV29Observaciones ;
            GXv_int6[0] = AV40Tran_IdEntrada ;
            GXv_int7[0] = AV28Nro_Linea ;
            new com.orions2.buscaatributos(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_int6, GXv_int7) ;
            selecinvenresponsabilidad_impl.this.AV32Placa = GXv_char1[0] ;
            selecinvenresponsabilidad_impl.this.AV26Marca = GXv_char2[0] ;
            selecinvenresponsabilidad_impl.this.AV27Modelo = GXv_char3[0] ;
            selecinvenresponsabilidad_impl.this.AV37Serial = GXv_char4[0] ;
            selecinvenresponsabilidad_impl.this.AV29Observaciones = GXv_char5[0] ;
            selecinvenresponsabilidad_impl.this.AV40Tran_IdEntrada = GXv_int6[0] ;
            selecinvenresponsabilidad_impl.this.AV28Nro_Linea = GXv_int7[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Tran_IdEntrada", GXutil.ltrim( GXutil.str( AV40Tran_IdEntrada, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "AV28Nro_Linea", GXutil.ltrim( GXutil.str( AV28Nro_Linea, 8, 0)));
            /* Execute user subroutine: 'VALIDA PLACA' */
            S113 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            if ( GXutil.strcmp(AV45Estado, "R") == 0 )
            {
               if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
               {
                  sendrow_742( ) ;
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
               if ( isFullAjaxMode( ) && ! bGXsfl_74_Refreshing )
               {
                  httpContext.doAjaxLoad(74, Grid1Row);
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e206I2 ();
      if (returnInSub) return;
   }

   public void e206I2( )
   {
      /* Enter Routine */
      AV35pplaca = AV32Placa ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35pplaca", AV35pplaca);
      AV30pCata_Descripcion = AV7Cata_Descripcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30pCata_Descripcion", AV30pCata_Descripcion);
      AV34pObservaciones = AV29Observaciones ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34pObservaciones", AV34pObservaciones);
      httpContext.setWebReturnParms(new Object[] {AV35pplaca,AV30pCata_Descripcion,AV34pObservaciones});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S113( )
   {
      /* 'VALIDA PLACA' Routine */
      AV45Estado = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Estado", AV45Estado);
      /* Using cursor H006I4 */
      pr_default.execute(2, new Object[] {AV21Consecutivo, AV32Placa});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A67Invd_NumeroPlaca = H006I4_A67Invd_NumeroPlaca[0] ;
         A66Elem_Consecutivo = H006I4_A66Elem_Consecutivo[0] ;
         A463Invd_Estado = H006I4_A463Invd_Estado[0] ;
         n463Invd_Estado = H006I4_n463Invd_Estado[0] ;
         AV45Estado = A463Invd_Estado ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45Estado", AV45Estado);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void setparameters( Object[] obj )
   {
      AV35pplaca = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35pplaca", AV35pplaca);
      AV30pCata_Descripcion = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30pCata_Descripcion", AV30pCata_Descripcion);
      AV34pObservaciones = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34pObservaciones", AV34pObservaciones);
      AV23Cuen_Identificacion = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Cuen_Identificacion", GXutil.ltrim( GXutil.str( AV23Cuen_Identificacion, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCUEN_IDENTIFICACION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Cuen_Identificacion), "ZZZZZZZZZZZZZZZZZ9")));
      AV41Transaccion = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Transaccion", GXutil.ltrim( GXutil.str( AV41Transaccion, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRANSACCION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Transaccion), "ZZZZZZZZZZ9")));
      AV5Fecha = (java.util.Date)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Fecha", localUtil.format(AV5Fecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vFECHA", getSecureSignedToken( "", AV5Fecha));
      AV38Tabla = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Tabla", GXutil.ltrim( GXutil.str( AV38Tabla, 4, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTABLA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38Tabla), "ZZZ9")));
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
      pa6I2( ) ;
      ws6I2( ) ;
      we6I2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141420485");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("selecinvenresponsabilidad.js", "?20186141420485");
      /* End function include_jscripts */
   }

   public void subsflControlProps_742( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_74_idx ;
      edtavPlaca_Internalname = "vPLACA_"+sGXsfl_74_idx ;
      edtavConsecutivo_Internalname = "vCONSECUTIVO_"+sGXsfl_74_idx ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION_"+sGXsfl_74_idx ;
      edtavMarca_Internalname = "vMARCA_"+sGXsfl_74_idx ;
      edtavModelo_Internalname = "vMODELO_"+sGXsfl_74_idx ;
      edtavSerial_Internalname = "vSERIAL_"+sGXsfl_74_idx ;
      edtavObservaciones_Internalname = "vOBSERVACIONES_"+sGXsfl_74_idx ;
      edtavValor_Internalname = "vVALOR_"+sGXsfl_74_idx ;
   }

   public void subsflControlProps_fel_742( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_74_fel_idx ;
      edtavPlaca_Internalname = "vPLACA_"+sGXsfl_74_fel_idx ;
      edtavConsecutivo_Internalname = "vCONSECUTIVO_"+sGXsfl_74_fel_idx ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION_"+sGXsfl_74_fel_idx ;
      edtavMarca_Internalname = "vMARCA_"+sGXsfl_74_fel_idx ;
      edtavModelo_Internalname = "vMODELO_"+sGXsfl_74_fel_idx ;
      edtavSerial_Internalname = "vSERIAL_"+sGXsfl_74_fel_idx ;
      edtavObservaciones_Internalname = "vOBSERVACIONES_"+sGXsfl_74_fel_idx ;
      edtavValor_Internalname = "vVALOR_"+sGXsfl_74_fel_idx ;
   }

   public void sendrow_742( )
   {
      subsflControlProps_742( ) ;
      wb6I0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_74_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_74_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"PromptGrid"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_74_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( AV32Placa)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( AV7Cata_Descripcion)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( AV29Observaciones)+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_74_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV25LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV25LinkSelection)==0)&&(GXutil.strcmp("", AV48Linkselection_GXI)==0))||!(GXutil.strcmp("", AV25LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV25LinkSelection)==0) ? AV48Linkselection_GXI : httpContext.getResourceRelative(AV25LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV25LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPlaca_Internalname,AV32Placa,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPlaca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavPlaca_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"Placa","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConsecutivo_Internalname,AV21Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavConsecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavConsecutivo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCata_descripcion_Internalname,AV7Cata_Descripcion,GXutil.rtrim( localUtil.format( AV7Cata_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCata_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCata_descripcion_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMarca_Internalname,AV26Marca,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMarca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavMarca_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavModelo_Internalname,AV27Modelo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavModelo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavModelo_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSerial_Internalname,AV37Serial,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSerial_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavSerial_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObservaciones_Internalname,AV29Observaciones,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavObservaciones_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavObservaciones_Enabled),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValor_Internalname,GXutil.ltrim( localUtil.ntoc( AV42Valor, (byte)(24), (byte)(2), ",", "")),((edtavValor_Enabled!=0) ? GXutil.ltrim( localUtil.format( AV42Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( AV42Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValor_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(0),new Integer(edtavValor_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(74),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLACA"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( AV32Placa, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSECUTIVO"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( AV21Consecutivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCATA_DESCRIPCION"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( AV7Cata_Descripcion, "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMARCA"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( AV26Marca, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODELO"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( AV27Modelo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIAL"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( AV37Serial, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOBSERVACIONES"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, GXutil.rtrim( localUtil.format( AV29Observaciones, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR"+"_"+sGXsfl_74_idx, getSecureSignedToken( sGXsfl_74_idx, localUtil.format( AV42Valor, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_74_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_74_idx+1)) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_74_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      /* End function sendrow_742 */
   }

   public void init_default_properties( )
   {
      lblLblinvd_numeroplacafilter_Internalname = "LBLINVD_NUMEROPLACAFILTER" ;
      edtavCinvd_numeroplaca_Internalname = "vCINVD_NUMEROPLACA" ;
      divInvd_numeroplacafiltercontainer_Internalname = "INVD_NUMEROPLACAFILTERCONTAINER" ;
      lblLblinvd_descripcionidfilter_Internalname = "LBLINVD_DESCRIPCIONIDFILTER" ;
      edtavCinvd_descripciondevolutivo_Internalname = "vCINVD_DESCRIPCIONDEVOLUTIVO" ;
      divInvd_descripcionidfiltercontainer_Internalname = "INVD_DESCRIPCIONIDFILTERCONTAINER" ;
      lblLblelem_consecutivofilter_Internalname = "LBLELEM_CONSECUTIVOFILTER" ;
      edtavCelem_consecutivo_Internalname = "vCELEM_CONSECUTIVO" ;
      divElem_consecutivofiltercontainer_Internalname = "ELEM_CONSECUTIVOFILTERCONTAINER" ;
      lblLblmarcafilter_Internalname = "LBLMARCAFILTER" ;
      edtavCmarca_Internalname = "vCMARCA" ;
      divInvd_marcafiltercontainer_Internalname = "INVD_MARCAFILTERCONTAINER" ;
      lblLblmodelofilter_Internalname = "LBLMODELOFILTER" ;
      edtavCmodelo_Internalname = "vCMODELO" ;
      divInvd_modelofiltercontainer_Internalname = "INVD_MODELOFILTERCONTAINER" ;
      lblLblserialfilter_Internalname = "LBLSERIALFILTER" ;
      edtavCserial_Internalname = "vCSERIAL" ;
      divInvd_serialfiltercontainer_Internalname = "INVD_SERIALFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavLinkselection_Internalname = "vLINKSELECTION" ;
      edtavPlaca_Internalname = "vPLACA" ;
      edtavConsecutivo_Internalname = "vCONSECUTIVO" ;
      edtavCata_descripcion_Internalname = "vCATA_DESCRIPCION" ;
      edtavMarca_Internalname = "vMARCA" ;
      edtavModelo_Internalname = "vMODELO" ;
      edtavSerial_Internalname = "vSERIAL" ;
      edtavObservaciones_Internalname = "vOBSERVACIONES" ;
      edtavValor_Internalname = "vVALOR" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      divMain_Internalname = "MAIN" ;
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
      edtavValor_Jsonclick = "" ;
      edtavObservaciones_Jsonclick = "" ;
      edtavSerial_Jsonclick = "" ;
      edtavModelo_Jsonclick = "" ;
      edtavMarca_Jsonclick = "" ;
      edtavCata_descripcion_Jsonclick = "" ;
      edtavConsecutivo_Jsonclick = "" ;
      edtavPlaca_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtavLinkselection_Link = "" ;
      edtavValor_Enabled = 0 ;
      edtavObservaciones_Enabled = 0 ;
      edtavSerial_Enabled = 0 ;
      edtavModelo_Enabled = 0 ;
      edtavMarca_Enabled = 0 ;
      edtavCata_descripcion_Enabled = 0 ;
      edtavConsecutivo_Enabled = 0 ;
      edtavPlaca_Enabled = 0 ;
      subGrid1_Class = "PromptGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavCserial_Jsonclick = "" ;
      edtavCserial_Enabled = 1 ;
      edtavCserial_Visible = 1 ;
      edtavCmodelo_Jsonclick = "" ;
      edtavCmodelo_Enabled = 1 ;
      edtavCmodelo_Visible = 1 ;
      edtavCmarca_Jsonclick = "" ;
      edtavCmarca_Enabled = 1 ;
      edtavCmarca_Visible = 1 ;
      edtavCelem_consecutivo_Jsonclick = "" ;
      edtavCelem_consecutivo_Enabled = 1 ;
      edtavCelem_consecutivo_Visible = 1 ;
      edtavCinvd_descripciondevolutivo_Enabled = 1 ;
      edtavCinvd_descripciondevolutivo_Visible = 1 ;
      edtavCinvd_numeroplaca_Jsonclick = "" ;
      edtavCinvd_numeroplaca_Enabled = 1 ;
      edtavCinvd_numeroplaca_Visible = 1 ;
      divInvd_serialfiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_modelofiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_marcafiltercontainer_Class = "AdvancedContainerItem" ;
      divElem_consecutivofiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_descripcionidfiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_numeroplacafiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selec Inven Responsabilidad" );
      subGrid1_Rows = 10 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV38Tabla',fld:'vTABLA',pic:'ZZZ9',hsh:true,nv:0},{av:'A101DEVOC_TRAN_ID',fld:'DEVOC_TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A103DEVOC_FECHA_MOVIMIENTO',fld:'DEVOC_FECHA_MOVIMIENTO',pic:'',nv:''},{av:'A99DEVOC_ESTADO',fld:'DEVOC_ESTADO',pic:'',nv:''},{av:'AV41Transaccion',fld:'vTRANSACCION',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV5Fecha',fld:'vFECHA',pic:'',hsh:true,nv:''},{av:'A102DEVOC_CONSECUTIVO',fld:'DEVOC_CONSECUTIVO',pic:'',nv:''},{av:'A725DEVOC_PLACA',fld:'DEVOC_PLACA',pic:'',nv:''},{av:'A728DEVOC_MARCA',fld:'DEVOC_MARCA',pic:'',nv:''},{av:'A730DEVOC_MODELO',fld:'DEVOC_MODELO',pic:'',nv:''},{av:'A727DEVOC_SERIAL',fld:'DEVOC_SERIAL',pic:'',nv:''},{av:'A732DEVOC_VALOR_ADQUISICION',fld:'DEVOC_VALOR_ADQUISICION',pic:'ZZZZZZZZZZZZZZ9.99',nv:0.0},{av:'A746DEVOC_DESCRIPCION',fld:'DEVOC_DESCRIPCION',pic:'@!',nv:''},{av:'AV45Estado',fld:'vESTADO',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV26Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV27Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV37Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV40Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV28Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV21Consecutivo',fld:'vCONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV32Placa',fld:'vPLACA',pic:'',hsh:true,nv:''},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e176I1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLINVD_NUMEROPLACAFILTER.CLICK","{handler:'e116I1',iparms:[{av:'divInvd_numeroplacafiltercontainer_Class',ctrl:'INVD_NUMEROPLACAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_numeroplacafiltercontainer_Class',ctrl:'INVD_NUMEROPLACAFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_numeroplaca_Visible',ctrl:'vCINVD_NUMEROPLACA',prop:'Visible'}]}");
      setEventMetadata("LBLINVD_DESCRIPCIONIDFILTER.CLICK","{handler:'e126I1',iparms:[{av:'divInvd_descripcionidfiltercontainer_Class',ctrl:'INVD_DESCRIPCIONIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_descripcionidfiltercontainer_Class',ctrl:'INVD_DESCRIPCIONIDFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_descripciondevolutivo_Visible',ctrl:'vCINVD_DESCRIPCIONDEVOLUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLELEM_CONSECUTIVOFILTER.CLICK","{handler:'e136I1',iparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'},{av:'edtavCelem_consecutivo_Visible',ctrl:'vCELEM_CONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLMARCAFILTER.CLICK","{handler:'e146I1',iparms:[{av:'divInvd_marcafiltercontainer_Class',ctrl:'INVD_MARCAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_marcafiltercontainer_Class',ctrl:'INVD_MARCAFILTERCONTAINER',prop:'Class'},{av:'edtavCmarca_Visible',ctrl:'vCMARCA',prop:'Visible'}]}");
      setEventMetadata("LBLMODELOFILTER.CLICK","{handler:'e156I1',iparms:[{av:'divInvd_modelofiltercontainer_Class',ctrl:'INVD_MODELOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_modelofiltercontainer_Class',ctrl:'INVD_MODELOFILTERCONTAINER',prop:'Class'},{av:'edtavCmodelo_Visible',ctrl:'vCMODELO',prop:'Visible'}]}");
      setEventMetadata("LBLSERIALFILTER.CLICK","{handler:'e166I1',iparms:[{av:'divInvd_serialfiltercontainer_Class',ctrl:'INVD_SERIALFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_serialfiltercontainer_Class',ctrl:'INVD_SERIALFILTERCONTAINER',prop:'Class'},{av:'edtavCserial_Visible',ctrl:'vCSERIAL',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e206I2',iparms:[{av:'AV32Placa',fld:'vPLACA',pic:'',hsh:true,nv:''},{av:'AV7Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',hsh:true,nv:''},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''}],oparms:[{av:'AV35pplaca',fld:'vPPLACA',pic:'',nv:''},{av:'AV30pCata_Descripcion',fld:'vPCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV34pObservaciones',fld:'vPOBSERVACIONES',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV38Tabla',fld:'vTABLA',pic:'ZZZ9',hsh:true,nv:0},{av:'A101DEVOC_TRAN_ID',fld:'DEVOC_TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A103DEVOC_FECHA_MOVIMIENTO',fld:'DEVOC_FECHA_MOVIMIENTO',pic:'',nv:''},{av:'A99DEVOC_ESTADO',fld:'DEVOC_ESTADO',pic:'',nv:''},{av:'AV41Transaccion',fld:'vTRANSACCION',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV5Fecha',fld:'vFECHA',pic:'',hsh:true,nv:''},{av:'A102DEVOC_CONSECUTIVO',fld:'DEVOC_CONSECUTIVO',pic:'',nv:''},{av:'A725DEVOC_PLACA',fld:'DEVOC_PLACA',pic:'',nv:''},{av:'A728DEVOC_MARCA',fld:'DEVOC_MARCA',pic:'',nv:''},{av:'A730DEVOC_MODELO',fld:'DEVOC_MODELO',pic:'',nv:''},{av:'A727DEVOC_SERIAL',fld:'DEVOC_SERIAL',pic:'',nv:''},{av:'A732DEVOC_VALOR_ADQUISICION',fld:'DEVOC_VALOR_ADQUISICION',pic:'ZZZZZZZZZZZZZZ9.99',nv:0.0},{av:'A746DEVOC_DESCRIPCION',fld:'DEVOC_DESCRIPCION',pic:'@!',nv:''},{av:'AV45Estado',fld:'vESTADO',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV26Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV27Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV37Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV40Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV28Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV21Consecutivo',fld:'vCONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV32Placa',fld:'vPLACA',pic:'',hsh:true,nv:''},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV38Tabla',fld:'vTABLA',pic:'ZZZ9',hsh:true,nv:0},{av:'A101DEVOC_TRAN_ID',fld:'DEVOC_TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A103DEVOC_FECHA_MOVIMIENTO',fld:'DEVOC_FECHA_MOVIMIENTO',pic:'',nv:''},{av:'A99DEVOC_ESTADO',fld:'DEVOC_ESTADO',pic:'',nv:''},{av:'AV41Transaccion',fld:'vTRANSACCION',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV5Fecha',fld:'vFECHA',pic:'',hsh:true,nv:''},{av:'A102DEVOC_CONSECUTIVO',fld:'DEVOC_CONSECUTIVO',pic:'',nv:''},{av:'A725DEVOC_PLACA',fld:'DEVOC_PLACA',pic:'',nv:''},{av:'A728DEVOC_MARCA',fld:'DEVOC_MARCA',pic:'',nv:''},{av:'A730DEVOC_MODELO',fld:'DEVOC_MODELO',pic:'',nv:''},{av:'A727DEVOC_SERIAL',fld:'DEVOC_SERIAL',pic:'',nv:''},{av:'A732DEVOC_VALOR_ADQUISICION',fld:'DEVOC_VALOR_ADQUISICION',pic:'ZZZZZZZZZZZZZZ9.99',nv:0.0},{av:'A746DEVOC_DESCRIPCION',fld:'DEVOC_DESCRIPCION',pic:'@!',nv:''},{av:'AV45Estado',fld:'vESTADO',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV26Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV27Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV37Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV40Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV28Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV21Consecutivo',fld:'vCONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV32Placa',fld:'vPLACA',pic:'',hsh:true,nv:''},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV38Tabla',fld:'vTABLA',pic:'ZZZ9',hsh:true,nv:0},{av:'A101DEVOC_TRAN_ID',fld:'DEVOC_TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A103DEVOC_FECHA_MOVIMIENTO',fld:'DEVOC_FECHA_MOVIMIENTO',pic:'',nv:''},{av:'A99DEVOC_ESTADO',fld:'DEVOC_ESTADO',pic:'',nv:''},{av:'AV41Transaccion',fld:'vTRANSACCION',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV5Fecha',fld:'vFECHA',pic:'',hsh:true,nv:''},{av:'A102DEVOC_CONSECUTIVO',fld:'DEVOC_CONSECUTIVO',pic:'',nv:''},{av:'A725DEVOC_PLACA',fld:'DEVOC_PLACA',pic:'',nv:''},{av:'A728DEVOC_MARCA',fld:'DEVOC_MARCA',pic:'',nv:''},{av:'A730DEVOC_MODELO',fld:'DEVOC_MODELO',pic:'',nv:''},{av:'A727DEVOC_SERIAL',fld:'DEVOC_SERIAL',pic:'',nv:''},{av:'A732DEVOC_VALOR_ADQUISICION',fld:'DEVOC_VALOR_ADQUISICION',pic:'ZZZZZZZZZZZZZZ9.99',nv:0.0},{av:'A746DEVOC_DESCRIPCION',fld:'DEVOC_DESCRIPCION',pic:'@!',nv:''},{av:'AV45Estado',fld:'vESTADO',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV26Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV27Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV37Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV40Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV28Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV21Consecutivo',fld:'vCONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV32Placa',fld:'vPLACA',pic:'',hsh:true,nv:''},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV38Tabla',fld:'vTABLA',pic:'ZZZ9',hsh:true,nv:0},{av:'A101DEVOC_TRAN_ID',fld:'DEVOC_TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A103DEVOC_FECHA_MOVIMIENTO',fld:'DEVOC_FECHA_MOVIMIENTO',pic:'',nv:''},{av:'A99DEVOC_ESTADO',fld:'DEVOC_ESTADO',pic:'',nv:''},{av:'AV41Transaccion',fld:'vTRANSACCION',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV5Fecha',fld:'vFECHA',pic:'',hsh:true,nv:''},{av:'A102DEVOC_CONSECUTIVO',fld:'DEVOC_CONSECUTIVO',pic:'',nv:''},{av:'A725DEVOC_PLACA',fld:'DEVOC_PLACA',pic:'',nv:''},{av:'A728DEVOC_MARCA',fld:'DEVOC_MARCA',pic:'',nv:''},{av:'A730DEVOC_MODELO',fld:'DEVOC_MODELO',pic:'',nv:''},{av:'A727DEVOC_SERIAL',fld:'DEVOC_SERIAL',pic:'',nv:''},{av:'A732DEVOC_VALOR_ADQUISICION',fld:'DEVOC_VALOR_ADQUISICION',pic:'ZZZZZZZZZZZZZZ9.99',nv:0.0},{av:'A746DEVOC_DESCRIPCION',fld:'DEVOC_DESCRIPCION',pic:'@!',nv:''},{av:'AV45Estado',fld:'vESTADO',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A490TDet_PlacaNumero',fld:'TDET_PLACANUMERO',pic:'',nv:''},{av:'A489TDet_ValorTotal',fld:'TDET_VALORTOTAL',pic:'ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV26Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV27Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV37Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV29Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV40Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV28Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV21Consecutivo',fld:'vCONSECUTIVO',pic:'',hsh:true,nv:''},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',nv:''},{av:'AV32Placa',fld:'vPLACA',pic:'',hsh:true,nv:''},{av:'A463Invd_Estado',fld:'INVD_ESTADO',pic:'',nv:''}],oparms:[]}");
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
      wcpOAV5Fecha = GXutil.nullDate() ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A103DEVOC_FECHA_MOVIMIENTO = GXutil.nullDate() ;
      A99DEVOC_ESTADO = "" ;
      A102DEVOC_CONSECUTIVO = "" ;
      A725DEVOC_PLACA = "" ;
      A728DEVOC_MARCA = "" ;
      A730DEVOC_MODELO = "" ;
      A727DEVOC_SERIAL = "" ;
      A732DEVOC_VALOR_ADQUISICION = DecimalUtil.ZERO ;
      A746DEVOC_DESCRIPCION = "" ;
      AV45Estado = "" ;
      A66Elem_Consecutivo = "" ;
      A490TDet_PlacaNumero = "" ;
      A489TDet_ValorTotal = DecimalUtil.ZERO ;
      A298Cata_Descripcion = "" ;
      AV26Marca = "" ;
      AV27Modelo = "" ;
      AV37Serial = "" ;
      AV29Observaciones = "" ;
      AV21Consecutivo = "" ;
      A67Invd_NumeroPlaca = "" ;
      AV32Placa = "" ;
      A463Invd_Estado = "" ;
      GXKey = "" ;
      AV35pplaca = "" ;
      AV30pCata_Descripcion = "" ;
      AV34pObservaciones = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblinvd_numeroplacafilter_Jsonclick = "" ;
      TempTags = "" ;
      AV15cInvd_NumeroPlaca = "" ;
      lblLblinvd_descripcionidfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV12cInvd_DescripcionDevolutivo = "" ;
      lblLblelem_consecutivofilter_Jsonclick = "" ;
      AV8cElem_Consecutivo = "" ;
      lblLblmarcafilter_Jsonclick = "" ;
      AV19cMarca = "" ;
      lblLblmodelofilter_Jsonclick = "" ;
      AV20cModelo = "" ;
      lblLblserialfilter_Jsonclick = "" ;
      AV22cSerial = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV25LinkSelection = "" ;
      AV7Cata_Descripcion = "" ;
      AV42Valor = DecimalUtil.ZERO ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV48Linkselection_GXI = "" ;
      AV6ADVANCED_LABEL_TEMPLATE = "" ;
      scmdbuf = "" ;
      H006I2_A95DEVOC_ID = new long[1] ;
      H006I2_A757DEVOC_CATACODIGO = new String[] {""} ;
      H006I2_n757DEVOC_CATACODIGO = new boolean[] {false} ;
      H006I2_A99DEVOC_ESTADO = new String[] {""} ;
      H006I2_n99DEVOC_ESTADO = new boolean[] {false} ;
      H006I2_A103DEVOC_FECHA_MOVIMIENTO = new java.util.Date[] {GXutil.nullDate()} ;
      H006I2_n103DEVOC_FECHA_MOVIMIENTO = new boolean[] {false} ;
      H006I2_A101DEVOC_TRAN_ID = new long[1] ;
      H006I2_n101DEVOC_TRAN_ID = new boolean[] {false} ;
      H006I2_A102DEVOC_CONSECUTIVO = new String[] {""} ;
      H006I2_n102DEVOC_CONSECUTIVO = new boolean[] {false} ;
      H006I2_A725DEVOC_PLACA = new String[] {""} ;
      H006I2_n725DEVOC_PLACA = new boolean[] {false} ;
      H006I2_A728DEVOC_MARCA = new String[] {""} ;
      H006I2_n728DEVOC_MARCA = new boolean[] {false} ;
      H006I2_A730DEVOC_MODELO = new String[] {""} ;
      H006I2_n730DEVOC_MODELO = new boolean[] {false} ;
      H006I2_A727DEVOC_SERIAL = new String[] {""} ;
      H006I2_n727DEVOC_SERIAL = new boolean[] {false} ;
      H006I2_A732DEVOC_VALOR_ADQUISICION = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006I2_n732DEVOC_VALOR_ADQUISICION = new boolean[] {false} ;
      H006I2_A746DEVOC_DESCRIPCION = new String[] {""} ;
      H006I2_n746DEVOC_DESCRIPCION = new boolean[] {false} ;
      A757DEVOC_CATACODIGO = "" ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      H006I3_A69TDet_Consecutivo = new long[1] ;
      H006I3_A37Cata_Codigo = new String[] {""} ;
      H006I3_A46Tran_Id = new long[1] ;
      H006I3_A66Elem_Consecutivo = new String[] {""} ;
      H006I3_A490TDet_PlacaNumero = new String[] {""} ;
      H006I3_n490TDet_PlacaNumero = new boolean[] {false} ;
      H006I3_A489TDet_ValorTotal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006I3_A298Cata_Descripcion = new String[] {""} ;
      A37Cata_Codigo = "" ;
      GXv_char1 = new String [1] ;
      GXv_char2 = new String [1] ;
      GXv_char3 = new String [1] ;
      GXv_char4 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_int6 = new long [1] ;
      GXv_int7 = new int [1] ;
      H006I4_A67Invd_NumeroPlaca = new String[] {""} ;
      H006I4_A66Elem_Consecutivo = new String[] {""} ;
      H006I4_A463Invd_Estado = new String[] {""} ;
      H006I4_n463Invd_Estado = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.selecinvenresponsabilidad__default(),
         new Object[] {
             new Object[] {
            H006I2_A95DEVOC_ID, H006I2_A757DEVOC_CATACODIGO, H006I2_n757DEVOC_CATACODIGO, H006I2_A99DEVOC_ESTADO, H006I2_n99DEVOC_ESTADO, H006I2_A103DEVOC_FECHA_MOVIMIENTO, H006I2_n103DEVOC_FECHA_MOVIMIENTO, H006I2_A101DEVOC_TRAN_ID, H006I2_n101DEVOC_TRAN_ID, H006I2_A102DEVOC_CONSECUTIVO,
            H006I2_n102DEVOC_CONSECUTIVO, H006I2_A725DEVOC_PLACA, H006I2_n725DEVOC_PLACA, H006I2_A728DEVOC_MARCA, H006I2_n728DEVOC_MARCA, H006I2_A730DEVOC_MODELO, H006I2_n730DEVOC_MODELO, H006I2_A727DEVOC_SERIAL, H006I2_n727DEVOC_SERIAL, H006I2_A732DEVOC_VALOR_ADQUISICION,
            H006I2_n732DEVOC_VALOR_ADQUISICION, H006I2_A746DEVOC_DESCRIPCION, H006I2_n746DEVOC_DESCRIPCION
            }
            , new Object[] {
            H006I3_A69TDet_Consecutivo, H006I3_A37Cata_Codigo, H006I3_A46Tran_Id, H006I3_A66Elem_Consecutivo, H006I3_A490TDet_PlacaNumero, H006I3_n490TDet_PlacaNumero, H006I3_A489TDet_ValorTotal, H006I3_A298Cata_Descripcion
            }
            , new Object[] {
            H006I4_A67Invd_NumeroPlaca, H006I4_A66Elem_Consecutivo, H006I4_A463Invd_Estado, H006I4_n463Invd_Estado
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavPlaca_Enabled = 0 ;
      edtavConsecutivo_Enabled = 0 ;
      edtavCata_descripcion_Enabled = 0 ;
      edtavMarca_Enabled = 0 ;
      edtavModelo_Enabled = 0 ;
      edtavSerial_Enabled = 0 ;
      edtavObservaciones_Enabled = 0 ;
      edtavValor_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID1_nEOF ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private short wcpOAV38Tabla ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_74 ;
   private short nGXsfl_74_idx=1 ;
   private short AV38Tabla ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int AV28Nro_Linea ;
   private int edtavCinvd_numeroplaca_Visible ;
   private int edtavCinvd_numeroplaca_Enabled ;
   private int edtavCinvd_descripciondevolutivo_Visible ;
   private int edtavCinvd_descripciondevolutivo_Enabled ;
   private int edtavCelem_consecutivo_Visible ;
   private int edtavCelem_consecutivo_Enabled ;
   private int edtavCmarca_Visible ;
   private int edtavCmarca_Enabled ;
   private int edtavCmodelo_Visible ;
   private int edtavCmodelo_Enabled ;
   private int edtavCserial_Visible ;
   private int edtavCserial_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavPlaca_Enabled ;
   private int edtavConsecutivo_Enabled ;
   private int edtavCata_descripcion_Enabled ;
   private int edtavMarca_Enabled ;
   private int edtavModelo_Enabled ;
   private int edtavSerial_Enabled ;
   private int edtavObservaciones_Enabled ;
   private int edtavValor_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GRID1_nGridOutOfScope ;
   private int GXv_int7[] ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long wcpOAV23Cuen_Identificacion ;
   private long wcpOAV41Transaccion ;
   private long A101DEVOC_TRAN_ID ;
   private long AV41Transaccion ;
   private long A46Tran_Id ;
   private long AV40Tran_IdEntrada ;
   private long AV23Cuen_Identificacion ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A732DEVOC_VALOR_ADQUISICION ;
   private java.math.BigDecimal A489TDet_ValorTotal ;
   private java.math.BigDecimal AV42Valor ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divInvd_numeroplacafiltercontainer_Class ;
   private String divInvd_descripcionidfiltercontainer_Class ;
   private String divElem_consecutivofiltercontainer_Class ;
   private String divInvd_marcafiltercontainer_Class ;
   private String divInvd_modelofiltercontainer_Class ;
   private String divInvd_serialfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_74_idx="0001" ;
   private String AV45Estado ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divInvd_numeroplacafiltercontainer_Internalname ;
   private String lblLblinvd_numeroplacafilter_Internalname ;
   private String lblLblinvd_numeroplacafilter_Jsonclick ;
   private String edtavCinvd_numeroplaca_Internalname ;
   private String TempTags ;
   private String edtavCinvd_numeroplaca_Jsonclick ;
   private String divInvd_descripcionidfiltercontainer_Internalname ;
   private String lblLblinvd_descripcionidfilter_Internalname ;
   private String lblLblinvd_descripcionidfilter_Jsonclick ;
   private String edtavCinvd_descripciondevolutivo_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divElem_consecutivofiltercontainer_Internalname ;
   private String lblLblelem_consecutivofilter_Internalname ;
   private String lblLblelem_consecutivofilter_Jsonclick ;
   private String edtavCelem_consecutivo_Internalname ;
   private String edtavCelem_consecutivo_Jsonclick ;
   private String divInvd_marcafiltercontainer_Internalname ;
   private String lblLblmarcafilter_Internalname ;
   private String lblLblmarcafilter_Jsonclick ;
   private String edtavCmarca_Internalname ;
   private String edtavCmarca_Jsonclick ;
   private String divInvd_modelofiltercontainer_Internalname ;
   private String lblLblmodelofilter_Internalname ;
   private String lblLblmodelofilter_Jsonclick ;
   private String edtavCmodelo_Internalname ;
   private String edtavCmodelo_Jsonclick ;
   private String divInvd_serialfiltercontainer_Internalname ;
   private String lblLblserialfilter_Internalname ;
   private String lblLblserialfilter_Jsonclick ;
   private String edtavCserial_Internalname ;
   private String edtavCserial_Jsonclick ;
   private String divGridtable_Internalname ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String edtavLinkselection_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtavPlaca_Internalname ;
   private String edtavConsecutivo_Internalname ;
   private String edtavCata_descripcion_Internalname ;
   private String edtavMarca_Internalname ;
   private String edtavModelo_Internalname ;
   private String edtavSerial_Internalname ;
   private String edtavObservaciones_Internalname ;
   private String edtavValor_Internalname ;
   private String AV6ADVANCED_LABEL_TEMPLATE ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String sGXsfl_74_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtavPlaca_Jsonclick ;
   private String edtavConsecutivo_Jsonclick ;
   private String edtavCata_descripcion_Jsonclick ;
   private String edtavMarca_Jsonclick ;
   private String edtavModelo_Jsonclick ;
   private String edtavSerial_Jsonclick ;
   private String edtavObservaciones_Jsonclick ;
   private String edtavValor_Jsonclick ;
   private java.util.Date wcpOAV5Fecha ;
   private java.util.Date A103DEVOC_FECHA_MOVIMIENTO ;
   private java.util.Date AV5Fecha ;
   private boolean entryPointCalled ;
   private boolean n101DEVOC_TRAN_ID ;
   private boolean n103DEVOC_FECHA_MOVIMIENTO ;
   private boolean n99DEVOC_ESTADO ;
   private boolean n102DEVOC_CONSECUTIVO ;
   private boolean n725DEVOC_PLACA ;
   private boolean n728DEVOC_MARCA ;
   private boolean n730DEVOC_MODELO ;
   private boolean n727DEVOC_SERIAL ;
   private boolean n732DEVOC_VALOR_ADQUISICION ;
   private boolean n746DEVOC_DESCRIPCION ;
   private boolean n490TDet_PlacaNumero ;
   private boolean n463Invd_Estado ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_74_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n757DEVOC_CATACODIGO ;
   private boolean AV25LinkSelection_IsBlob ;
   private String AV12cInvd_DescripcionDevolutivo ;
   private String A99DEVOC_ESTADO ;
   private String A102DEVOC_CONSECUTIVO ;
   private String A725DEVOC_PLACA ;
   private String A728DEVOC_MARCA ;
   private String A730DEVOC_MODELO ;
   private String A727DEVOC_SERIAL ;
   private String A746DEVOC_DESCRIPCION ;
   private String A66Elem_Consecutivo ;
   private String A490TDet_PlacaNumero ;
   private String A298Cata_Descripcion ;
   private String AV26Marca ;
   private String AV27Modelo ;
   private String AV37Serial ;
   private String AV29Observaciones ;
   private String AV21Consecutivo ;
   private String A67Invd_NumeroPlaca ;
   private String AV32Placa ;
   private String A463Invd_Estado ;
   private String AV35pplaca ;
   private String AV30pCata_Descripcion ;
   private String AV34pObservaciones ;
   private String AV15cInvd_NumeroPlaca ;
   private String AV8cElem_Consecutivo ;
   private String AV19cMarca ;
   private String AV20cModelo ;
   private String AV22cSerial ;
   private String AV7Cata_Descripcion ;
   private String AV48Linkselection_GXI ;
   private String A757DEVOC_CATACODIGO ;
   private String A37Cata_Codigo ;
   private String AV25LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private long[] H006I2_A95DEVOC_ID ;
   private String[] H006I2_A757DEVOC_CATACODIGO ;
   private boolean[] H006I2_n757DEVOC_CATACODIGO ;
   private String[] H006I2_A99DEVOC_ESTADO ;
   private boolean[] H006I2_n99DEVOC_ESTADO ;
   private java.util.Date[] H006I2_A103DEVOC_FECHA_MOVIMIENTO ;
   private boolean[] H006I2_n103DEVOC_FECHA_MOVIMIENTO ;
   private long[] H006I2_A101DEVOC_TRAN_ID ;
   private boolean[] H006I2_n101DEVOC_TRAN_ID ;
   private String[] H006I2_A102DEVOC_CONSECUTIVO ;
   private boolean[] H006I2_n102DEVOC_CONSECUTIVO ;
   private String[] H006I2_A725DEVOC_PLACA ;
   private boolean[] H006I2_n725DEVOC_PLACA ;
   private String[] H006I2_A728DEVOC_MARCA ;
   private boolean[] H006I2_n728DEVOC_MARCA ;
   private String[] H006I2_A730DEVOC_MODELO ;
   private boolean[] H006I2_n730DEVOC_MODELO ;
   private String[] H006I2_A727DEVOC_SERIAL ;
   private boolean[] H006I2_n727DEVOC_SERIAL ;
   private java.math.BigDecimal[] H006I2_A732DEVOC_VALOR_ADQUISICION ;
   private boolean[] H006I2_n732DEVOC_VALOR_ADQUISICION ;
   private String[] H006I2_A746DEVOC_DESCRIPCION ;
   private boolean[] H006I2_n746DEVOC_DESCRIPCION ;
   private long[] H006I3_A69TDet_Consecutivo ;
   private String[] H006I3_A37Cata_Codigo ;
   private long[] H006I3_A46Tran_Id ;
   private String[] H006I3_A66Elem_Consecutivo ;
   private String[] H006I3_A490TDet_PlacaNumero ;
   private boolean[] H006I3_n490TDet_PlacaNumero ;
   private java.math.BigDecimal[] H006I3_A489TDet_ValorTotal ;
   private String[] H006I3_A298Cata_Descripcion ;
   private String[] H006I4_A67Invd_NumeroPlaca ;
   private String[] H006I4_A66Elem_Consecutivo ;
   private String[] H006I4_A463Invd_Estado ;
   private boolean[] H006I4_n463Invd_Estado ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class selecinvenresponsabilidad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H006I2", "SELECT T1.DEVOC_ID, T2.Cata_Codigo AS DEVOC_CATACODIGO, T1.DEVOC_ESTADO, T1.DEVOC_FECHA_MOVIMIENTO, T1.DEVOC_TRAN_ID, T1.DEVOC_CONSECUTIVO AS DEVOC_CONSECUTIVO, T1.DEVOC_PLACA, T1.DEVOC_MARCA, T1.DEVOC_MODELO, T1.DEVOC_SERIAL, T1.DEVOC_VALOR_ADQUISICION, T3.Cata_Descripcion AS DEVOC_DESCRIPCION FROM ((ALM_DEVO_HIST T1 LEFT JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.DEVOC_CONSECUTIVO) LEFT JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) WHERE T1.DEVOC_TRAN_ID = ? and T1.DEVOC_FECHA_MOVIMIENTO = ? and T1.DEVOC_ESTADO = 'R' ORDER BY T1.DEVOC_TRAN_ID, T1.DEVOC_FECHA_MOVIMIENTO, T1.DEVOC_ESTADO ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006I3", "SELECT T1.TDet_Consecutivo, T2.Cata_Codigo, T1.Tran_Id, T1.Elem_Consecutivo, T1.TDet_PlacaNumero, T1.TDet_ValorTotal, T3.Cata_Descripcion FROM ((ALM_DETALLE_TRANSACCION T1 INNER JOIN ALM_ELEMENTO T2 ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo = T2.Cata_Codigo) WHERE T1.Tran_Id = ? ORDER BY T1.Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006I4", "SELECT Invd_NumeroPlaca, Elem_Consecutivo, Invd_Estado FROM ALM_INVENTARIO_DEVOLUTIVO WHERE Elem_Consecutivo = ? and Invd_NumeroPlaca = ? ORDER BY Elem_Consecutivo, Invd_NumeroPlaca ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 9);
               stmt.setVarchar(2, (String)parms[1], 30);
               return;
      }
   }

}

