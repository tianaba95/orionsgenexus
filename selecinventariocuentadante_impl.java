/*
               File: selecinventariocuentadante_impl
        Description: Selecciona Inventario Cuentadante
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:22:21.55
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

public final  class selecinventariocuentadante_impl extends GXDataArea
{
   public selecinventariocuentadante_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public selecinventariocuentadante_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( selecinventariocuentadante_impl.class ));
   }

   public selecinventariocuentadante_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            nRC_GXsfl_94 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_94_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_94_idx = httpContext.GetNextPar( ) ;
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
            AV20cInvd_NumeroPlaca = httpContext.GetNextPar( ) ;
            AV17cInvd_DescripcionDevolutivo = httpContext.GetNextPar( ) ;
            AV13cElem_Consecutivo = httpContext.GetNextPar( ) ;
            AV21cInvd_PlacaPadre = httpContext.GetNextPar( ) ;
            AV18cInvd_FechaAdquisicion = localUtil.parseDateParm( httpContext.GetNextPar( )) ;
            AV9Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV8Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
            AV6Alma_Modulo = httpContext.GetNextPar( ) ;
            AV5Alma_Codigo = httpContext.GetNextPar( ) ;
            AV7Bode_Codigo = httpContext.GetNextPar( ) ;
            AV10Tran_IdCuentadanteOrigen = GXutil.lval( httpContext.GetNextPar( )) ;
            AV41Tipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
            A67Invd_NumeroPlaca = httpContext.GetNextPar( ) ;
            AV29Marca = httpContext.GetNextPar( ) ;
            AV30Modelo = httpContext.GetNextPar( ) ;
            AV37Serial = httpContext.GetNextPar( ) ;
            AV32Observaciones = httpContext.GetNextPar( ) ;
            AV38Tran_IdEntrada = GXutil.lval( httpContext.GetNextPar( )) ;
            AV31Nro_Linea = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV26cSerial = httpContext.GetNextPar( ) ;
            AV25cModelo = httpContext.GetNextPar( ) ;
            AV24cMarca = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid1_refresh( subGrid1_Rows, AV20cInvd_NumeroPlaca, AV17cInvd_DescripcionDevolutivo, AV13cElem_Consecutivo, AV21cInvd_PlacaPadre, AV18cInvd_FechaAdquisicion, AV9Regi_Id, AV8Cent_Id, AV6Alma_Modulo, AV5Alma_Codigo, AV7Bode_Codigo, AV10Tran_IdCuentadanteOrigen, AV41Tipo_Codigo, A67Invd_NumeroPlaca, AV29Marca, AV30Modelo, AV37Serial, AV32Observaciones, AV38Tran_IdEntrada, AV31Nro_Linea, AV26cSerial, AV25cModelo, AV24cMarca) ;
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
            AV34Placa = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Placa", AV34Placa);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV12Cata_Descripcion = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Cata_Descripcion", AV12Cata_Descripcion);
               AV35PlacaPadre = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV35PlacaPadre", AV35PlacaPadre);
               AV27EsPlacaPadre = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27EsPlacaPadre", AV27EsPlacaPadre);
               AV9Regi_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Regi_Id", GXutil.ltrim( GXutil.str( AV9Regi_Id, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Regi_Id), "ZZZZZZZZZZ9")));
               AV8Cent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Cent_Id", GXutil.ltrim( GXutil.str( AV8Cent_Id, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Cent_Id), "ZZZZZZZZZZ9")));
               AV6Alma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Alma_Modulo", AV6Alma_Modulo);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Alma_Modulo, ""))));
               AV5Alma_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Alma_Codigo", AV5Alma_Codigo);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Alma_Codigo, ""))));
               AV7Bode_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Bode_Codigo", AV7Bode_Codigo);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vBODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Bode_Codigo, ""))));
               AV32Observaciones = httpContext.GetNextPar( ) ;
               AV38Tran_IdEntrada = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38Tran_IdEntrada", GXutil.ltrim( GXutil.str( AV38Tran_IdEntrada, 11, 0)));
               AV31Nro_Linea = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31Nro_Linea", GXutil.ltrim( GXutil.str( AV31Nro_Linea, 8, 0)));
               AV10Tran_IdCuentadanteOrigen = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( AV10Tran_IdCuentadanteOrigen, 18, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_IDCUENTADANTEORIGEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")));
               AV41Tipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41Tipo_Codigo", GXutil.ltrim( GXutil.str( AV41Tipo_Codigo, 18, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
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
      pa7R2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start7R2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?201861414222170");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.selecinventariocuentadante") + "?" + GXutil.URLEncode(GXutil.rtrim(AV34Placa)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12Cata_Descripcion)) + "," + GXutil.URLEncode(GXutil.rtrim(AV35PlacaPadre)) + "," + GXutil.URLEncode(GXutil.rtrim(AV27EsPlacaPadre)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV6Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV5Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Bode_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV32Observaciones)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV38Tran_IdEntrada,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV31Nro_Linea,8,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10Tran_IdCuentadanteOrigen,18,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV41Tipo_Codigo,18,0)))+"\">") ;
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
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_NUMEROPLACA", AV20cInvd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_DESCRIPCIONDEVOLUTIVO", AV17cInvd_DescripcionDevolutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCELEM_CONSECUTIVO", AV13cElem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_PLACAPADRE", AV21cInvd_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GXH_vCINVD_FECHAADQUISICION", localUtil.format(AV18cInvd_FechaAdquisicion, "99/99/99"));
      /* Send saved values. */
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_94", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_94, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGI_ID", GXutil.ltrim( localUtil.ntoc( AV9Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCENT_ID", GXutil.ltrim( localUtil.ntoc( AV8Cent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_MODULO", AV6Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vALMA_CODIGO", AV5Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vBODE_CODIGO", AV7Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDCUENTADANTEORIGEN", GXutil.ltrim( localUtil.ntoc( AV10Tran_IdCuentadanteOrigen, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( AV41Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_IDENTRADA", GXutil.ltrim( localUtil.ntoc( AV38Tran_IdEntrada, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNRO_LINEA", GXutil.ltrim( localUtil.ntoc( AV31Nro_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_VALORADQUISICION", GXutil.ltrim( localUtil.ntoc( A465Invd_ValorAdquisicion, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_ESPLACAPADRE", GXutil.rtrim( A501Invd_EsPlacaPadre));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPLACA", AV34Placa);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCATA_DESCRIPCION", AV12Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPLACAPADRE", AV35PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vESPLACAPADRE", GXutil.rtrim( AV27EsPlacaPadre));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CUEN_IDENTIFICACION", GXutil.ltrim( localUtil.ntoc( A43Cuen_Identificacion, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Alma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Alma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Bode_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_IDCUENTADANTEORIGEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Cent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Alma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Alma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Bode_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAN_IDCUENTADANTEORIGEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACAFILTERCONTAINER_Class", GXutil.rtrim( divInvd_numeroplacafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_DESCRIPCIONIDFILTERCONTAINER_Class", GXutil.rtrim( divInvd_descripcionidfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_PLACAPADREFILTERCONTAINER_Class", GXutil.rtrim( divInvd_placapadrefiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVOFILTERCONTAINER_Class", GXutil.rtrim( divElem_consecutivofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_FECHAFILTERCONTAINER_Class", GXutil.rtrim( divInvd_fechafiltercontainer_Class));
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
         we7R2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt7R2( ) ;
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
      return formatLink("com.orions2.selecinventariocuentadante") + "?" + GXutil.URLEncode(GXutil.rtrim(AV34Placa)) + "," + GXutil.URLEncode(GXutil.rtrim(AV12Cata_Descripcion)) + "," + GXutil.URLEncode(GXutil.rtrim(AV35PlacaPadre)) + "," + GXutil.URLEncode(GXutil.rtrim(AV27EsPlacaPadre)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV9Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV8Cent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV6Alma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV5Alma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV7Bode_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV32Observaciones)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV38Tran_IdEntrada,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV31Nro_Linea,8,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10Tran_IdCuentadanteOrigen,18,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV41Tipo_Codigo,18,0))) ;
   }

   public String getPgmname( )
   {
      return "SelecInventarioCuentadante" ;
   }

   public String getPgmdesc( )
   {
      return "Selecciona Inventario Cuentadante" ;
   }

   public void wb7R0( )
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_numeroplacafilter_Internalname, "Número de placa", "", "", lblLblinvd_numeroplacafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e117r1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioCuentadante.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_numeroplaca_Internalname, AV20cInvd_NumeroPlaca, GXutil.rtrim( localUtil.format( AV20cInvd_NumeroPlaca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_numeroplaca_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_numeroplaca_Visible, edtavCinvd_numeroplaca_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInventarioCuentadante.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_descripcionidfilter_Internalname, "Descripción", "", "", lblLblinvd_descripcionidfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e127r1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioCuentadante.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCinvd_descripciondevolutivo_Internalname, AV17cInvd_DescripcionDevolutivo, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", (short)(0), edtavCinvd_descripciondevolutivo_Visible, edtavCinvd_descripciondevolutivo_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_SelecInventarioCuentadante.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblelem_consecutivofilter_Internalname, "Consecutivo", "", "", lblLblelem_consecutivofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e137r1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioCuentadante.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV13cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV13cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtavCelem_consecutivo_Visible, edtavCelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInventarioCuentadante.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_placapadrefiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_placapadrefiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvd_placapadrefilter_Internalname, "Placa Padre", "", "", lblLblinvd_placapadrefilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e147r1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioCuentadante.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_placapadre_Internalname, "Placa Padre", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_placapadre_Internalname, AV21cInvd_PlacaPadre, GXutil.rtrim( localUtil.format( AV21cInvd_PlacaPadre, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_placapadre_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_placapadre_Visible, edtavCinvd_placapadre_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInventarioCuentadante.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_fechafiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_fechafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblfechafilter_Internalname, "Fecha de Adquisición", "", "", lblLblfechafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e157r1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioCuentadante.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCinvd_fechaadquisicion_Internalname, "Fecha Adquisicion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCinvd_fechaadquisicion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCinvd_fechaadquisicion_Internalname, localUtil.format(AV18cInvd_FechaAdquisicion, "99/99/99"), localUtil.format( AV18cInvd_FechaAdquisicion, "99/99/99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCinvd_fechaadquisicion_Jsonclick, 0, "Attribute", "", "", "", edtavCinvd_fechaadquisicion_Visible, edtavCinvd_fechaadquisicion_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "HLP_SelecInventarioCuentadante.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavCinvd_fechaadquisicion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCinvd_fechaadquisicion_Visible==0)||(edtavCinvd_fechaadquisicion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SelecInventarioCuentadante.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvd_marcafiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvd_marcafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmarcafilter_Internalname, "Marca", "", "", lblLblmarcafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e167r1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioCuentadante.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCmarca_Internalname, AV24cMarca, GXutil.rtrim( localUtil.format( AV24cMarca, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCmarca_Jsonclick, 0, "Attribute", "", "", "", edtavCmarca_Visible, edtavCmarca_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInventarioCuentadante.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblmodelofilter_Internalname, "Modelo", "", "", lblLblmodelofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e177r1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioCuentadante.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCmodelo_Internalname, AV25cModelo, GXutil.rtrim( localUtil.format( AV25cModelo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCmodelo_Jsonclick, 0, "Attribute", "", "", "", edtavCmodelo_Visible, edtavCmodelo_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInventarioCuentadante.htm");
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
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblserialfilter_Internalname, "Serial", "", "", lblLblserialfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e187r1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelecInventarioCuentadante.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_94_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCserial_Internalname, AV26cSerial, GXutil.rtrim( localUtil.format( AV26cSerial, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCserial_Jsonclick, 0, "Attribute", "", "", "", edtavCserial_Visible, edtavCserial_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelecInventarioCuentadante.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 94, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e197r1_client"+"'", TempTags, "", 2, "HLP_SelecInventarioCuentadante.htm");
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
            httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"94\">") ;
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
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 85, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consecutivo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Descripción") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 85, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Placa Padre") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Marca") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Modelo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Serial") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 150, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Observaciones") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Costo Total") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"DescriptionAttribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
            httpContext.writeTextNL( "</tr>") ;
            Grid1Container.AddObjectProperty("GridName", "Grid1");
         }
         else
         {
            if ( isAjaxCallMode( ) )
            {
               Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
            }
            else
            {
               Grid1Container.Clear();
            }
            Grid1Container.SetWrapped(nGXWrapped);
            Grid1Container.AddObjectProperty("GridName", "Grid1");
            Grid1Container.AddObjectProperty("Class", "PromptGrid");
            Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("CmpContext", "");
            Grid1Container.AddObjectProperty("InMasterPage", "false");
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", httpContext.convertURL( AV28LinkSelection));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtavLinkselection_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A67Invd_NumeroPlaca);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A66Elem_Consecutivo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A298Cata_Descripcion);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A68Invd_PlacaPadre);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV29Marca);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMarca_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV30Modelo);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavModelo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV37Serial);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSerial_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", AV32Observaciones);
            Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavObservaciones_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(24), (byte)(2), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ".", "")));
            Grid1Column.AddObjectProperty("Link", GXutil.rtrim( edtInvd_RegionalId_Link));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ".", "")));
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A412Invd_ModuloAlmacen);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A413Invd_AlmacenCodigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A414Invd_BodegaCodigo);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid1Column.AddObjectProperty("Value", A463Invd_Estado);
            Grid1Container.AddColumnProperties(Grid1Column);
            Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 94 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_94 = (short)(nGXsfl_94_idx-1) ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 94, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SelecInventarioCuentadante.htm");
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

   public void start7R2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Selecciona Inventario Cuentadante", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup7R0( ) ;
   }

   public void ws7R2( )
   {
      start7R2( ) ;
      evt7R2( ) ;
   }

   public void evt7R2( )
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
                           nGXsfl_94_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_94_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_94_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_942( ) ;
                           AV28LinkSelection = httpContext.cgiGet( edtavLinkselection_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Bitmap", ((GXutil.strcmp("", AV28LinkSelection)==0) ? AV44Linkselection_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV28LinkSelection))), !bGXsfl_94_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV28LinkSelection), true);
                           A67Invd_NumeroPlaca = httpContext.cgiGet( edtInvd_NumeroPlaca_Internalname) ;
                           A66Elem_Consecutivo = httpContext.cgiGet( edtElem_Consecutivo_Internalname) ;
                           A298Cata_Descripcion = GXutil.upper( httpContext.cgiGet( edtCata_Descripcion_Internalname)) ;
                           A68Invd_PlacaPadre = httpContext.cgiGet( edtInvd_PlacaPadre_Internalname) ;
                           n68Invd_PlacaPadre = false ;
                           AV29Marca = httpContext.cgiGet( edtavMarca_Internalname) ;
                           AV30Modelo = httpContext.cgiGet( edtavModelo_Internalname) ;
                           AV37Serial = httpContext.cgiGet( edtavSerial_Internalname) ;
                           A466Invd_FechaAdquisicion = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtInvd_FechaAdquisicion_Internalname), 0)) ;
                           n466Invd_FechaAdquisicion = false ;
                           AV32Observaciones = httpContext.cgiGet( edtavObservaciones_Internalname) ;
                           A629Costo_Total_Dev = localUtil.ctond( httpContext.cgiGet( edtCosto_Total_Dev_Internalname)) ;
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
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e207R2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e217R2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Cinvd_numeroplaca Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_NUMEROPLACA"), AV20cInvd_NumeroPlaca) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvd_descripciondevolutivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_DESCRIPCIONDEVOLUTIVO"), AV17cInvd_DescripcionDevolutivo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Celem_consecutivo Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV13cElem_Consecutivo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvd_placapadre Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_PLACAPADRE"), AV21cInvd_PlacaPadre) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cinvd_fechaadquisicion Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCINVD_FECHAADQUISICION"), 0), AV18cInvd_FechaAdquisicion) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e227R2 ();
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

   public void we7R2( )
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

   public void pa7R2( )
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
         GXCCtl = "INVD_MODULOALMACEN_" + sGXsfl_94_idx ;
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
         GXCCtl = "INVD_ESTADO_" + sGXsfl_94_idx ;
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
      subsflControlProps_942( ) ;
      while ( nGXsfl_94_idx <= nRC_GXsfl_94 )
      {
         sendrow_942( ) ;
         nGXsfl_94_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_94_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_94_idx+1)) ;
         sGXsfl_94_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_94_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_942( ) ;
      }
      httpContext.GX_webresponse.addString(Grid1Container.ToJavascriptSource());
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV20cInvd_NumeroPlaca ,
                                  String AV17cInvd_DescripcionDevolutivo ,
                                  String AV13cElem_Consecutivo ,
                                  String AV21cInvd_PlacaPadre ,
                                  java.util.Date AV18cInvd_FechaAdquisicion ,
                                  long AV9Regi_Id ,
                                  long AV8Cent_Id ,
                                  String AV6Alma_Modulo ,
                                  String AV5Alma_Codigo ,
                                  String AV7Bode_Codigo ,
                                  long AV10Tran_IdCuentadanteOrigen ,
                                  long AV41Tipo_Codigo ,
                                  String A67Invd_NumeroPlaca ,
                                  String AV29Marca ,
                                  String AV30Modelo ,
                                  String AV37Serial ,
                                  String AV32Observaciones ,
                                  long AV38Tran_IdEntrada ,
                                  int AV31Nro_Linea ,
                                  String AV26cSerial ,
                                  String AV25cModelo ,
                                  String AV24cMarca )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid1_Rows = subGrid1_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID1_nCurrentRecord = 0 ;
      rf7R2( ) ;
      /* End function gxgrGrid1_refresh */
   }

   public void send_integrity_hashes( )
   {
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_NUMEROPLACA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A67Invd_NumeroPlaca, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_NUMEROPLACA", A67Invd_NumeroPlaca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_PLACAPADRE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_PLACAPADRE", A68Invd_PlacaPadre);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Marca, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMARCA", AV29Marca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODELO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Modelo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODELO", AV30Modelo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37Serial, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSERIAL", AV37Serial);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_FECHAADQUISICION", getSecureSignedToken( "", A466Invd_FechaAdquisicion));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVD_FECHAADQUISICION", localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOBSERVACIONES", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32Observaciones, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vOBSERVACIONES", AV32Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_COSTO_TOTAL_DEV", getSecureSignedToken( "", localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "COSTO_TOTAL_DEV", GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(18), (byte)(2), ".", "")));
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
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf7R2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMarca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMarca_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      edtavModelo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModelo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavModelo_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      edtavSerial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSerial_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSerial_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      edtavObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObservaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavObservaciones_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
   }

   public void rf7R2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(94) ;
      nGXsfl_94_idx = (short)(1) ;
      sGXsfl_94_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_94_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_942( ) ;
      bGXsfl_94_Refreshing = true ;
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
         subsflControlProps_942( ) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV20cInvd_NumeroPlaca ,
                                              AV21cInvd_PlacaPadre ,
                                              AV13cElem_Consecutivo ,
                                              AV18cInvd_FechaAdquisicion ,
                                              A67Invd_NumeroPlaca ,
                                              A68Invd_PlacaPadre ,
                                              A66Elem_Consecutivo ,
                                              A466Invd_FechaAdquisicion ,
                                              AV17cInvd_DescripcionDevolutivo ,
                                              A298Cata_Descripcion ,
                                              new Long(A33Tipo_Codigo) ,
                                              new Long(AV41Tipo_Codigo) ,
                                              new Long(AV9Regi_Id) ,
                                              new Long(AV8Cent_Id) ,
                                              AV6Alma_Modulo ,
                                              AV5Alma_Codigo ,
                                              AV7Bode_Codigo ,
                                              new Long(AV10Tran_IdCuentadanteOrigen) ,
                                              new Long(A410Invd_RegionalId) ,
                                              new Long(A411Invd_CentroCostoId) ,
                                              A412Invd_ModuloAlmacen ,
                                              A413Invd_AlmacenCodigo ,
                                              A414Invd_BodegaCodigo ,
                                              new Long(A43Cuen_Identificacion) ,
                                              A463Invd_Estado } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                              TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         } ) ;
         lV20cInvd_NumeroPlaca = GXutil.concat( GXutil.rtrim( AV20cInvd_NumeroPlaca), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20cInvd_NumeroPlaca", AV20cInvd_NumeroPlaca);
         lV21cInvd_PlacaPadre = GXutil.concat( GXutil.rtrim( AV21cInvd_PlacaPadre), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21cInvd_PlacaPadre", AV21cInvd_PlacaPadre);
         lV13cElem_Consecutivo = GXutil.concat( GXutil.rtrim( AV13cElem_Consecutivo), "%", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13cElem_Consecutivo", AV13cElem_Consecutivo);
         /* Using cursor H007R2 */
         pr_default.execute(0, new Object[] {new Long(AV9Regi_Id), new Long(AV8Cent_Id), AV6Alma_Modulo, AV5Alma_Codigo, AV7Bode_Codigo, new Long(AV10Tran_IdCuentadanteOrigen), new Long(AV41Tipo_Codigo), lV20cInvd_NumeroPlaca, lV21cInvd_PlacaPadre, lV13cElem_Consecutivo, AV18cInvd_FechaAdquisicion});
         nGXsfl_94_idx = (short)(1) ;
         sGXsfl_94_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_94_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_942( ) ;
         GRID1_nEOF = (byte)(0) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) ) )
         {
            brk7R2 = false ;
            A37Cata_Codigo = H007R2_A37Cata_Codigo[0] ;
            A298Cata_Descripcion = H007R2_A298Cata_Descripcion[0] ;
            A463Invd_Estado = H007R2_A463Invd_Estado[0] ;
            n463Invd_Estado = H007R2_n463Invd_Estado[0] ;
            A410Invd_RegionalId = H007R2_A410Invd_RegionalId[0] ;
            A411Invd_CentroCostoId = H007R2_A411Invd_CentroCostoId[0] ;
            A412Invd_ModuloAlmacen = H007R2_A412Invd_ModuloAlmacen[0] ;
            A413Invd_AlmacenCodigo = H007R2_A413Invd_AlmacenCodigo[0] ;
            A414Invd_BodegaCodigo = H007R2_A414Invd_BodegaCodigo[0] ;
            A68Invd_PlacaPadre = H007R2_A68Invd_PlacaPadre[0] ;
            n68Invd_PlacaPadre = H007R2_n68Invd_PlacaPadre[0] ;
            A66Elem_Consecutivo = H007R2_A66Elem_Consecutivo[0] ;
            A33Tipo_Codigo = H007R2_A33Tipo_Codigo[0] ;
            A466Invd_FechaAdquisicion = H007R2_A466Invd_FechaAdquisicion[0] ;
            n466Invd_FechaAdquisicion = H007R2_n466Invd_FechaAdquisicion[0] ;
            A43Cuen_Identificacion = H007R2_A43Cuen_Identificacion[0] ;
            n43Cuen_Identificacion = H007R2_n43Cuen_Identificacion[0] ;
            A67Invd_NumeroPlaca = H007R2_A67Invd_NumeroPlaca[0] ;
            A465Invd_ValorAdquisicion = H007R2_A465Invd_ValorAdquisicion[0] ;
            n465Invd_ValorAdquisicion = H007R2_n465Invd_ValorAdquisicion[0] ;
            A501Invd_EsPlacaPadre = H007R2_A501Invd_EsPlacaPadre[0] ;
            n501Invd_EsPlacaPadre = H007R2_n501Invd_EsPlacaPadre[0] ;
            A629Costo_Total_Dev = H007R2_A629Costo_Total_Dev[0] ;
            A37Cata_Codigo = H007R2_A37Cata_Codigo[0] ;
            A33Tipo_Codigo = H007R2_A33Tipo_Codigo[0] ;
            A298Cata_Descripcion = H007R2_A298Cata_Descripcion[0] ;
            if ( (GXutil.strcmp("", AV17cInvd_DescripcionDevolutivo)==0) || ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV17cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) ) )
            {
               /* Execute user event: Load */
               e217R2 ();
            }
            if ( ! brk7R2 )
            {
               brk7R2 = true ;
               pr_default.readNext(0);
            }
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         wbEnd = (short)(94) ;
         wb7R0( ) ;
      }
      bGXsfl_94_Refreshing = true ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV20cInvd_NumeroPlaca, AV17cInvd_DescripcionDevolutivo, AV13cElem_Consecutivo, AV21cInvd_PlacaPadre, AV18cInvd_FechaAdquisicion, AV9Regi_Id, AV8Cent_Id, AV6Alma_Modulo, AV5Alma_Codigo, AV7Bode_Codigo, AV10Tran_IdCuentadanteOrigen, AV41Tipo_Codigo, A67Invd_NumeroPlaca, AV29Marca, AV30Modelo, AV37Serial, AV32Observaciones, AV38Tran_IdEntrada, AV31Nro_Linea, AV26cSerial, AV25cModelo, AV24cMarca) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV20cInvd_NumeroPlaca, AV17cInvd_DescripcionDevolutivo, AV13cElem_Consecutivo, AV21cInvd_PlacaPadre, AV18cInvd_FechaAdquisicion, AV9Regi_Id, AV8Cent_Id, AV6Alma_Modulo, AV5Alma_Codigo, AV7Bode_Codigo, AV10Tran_IdCuentadanteOrigen, AV41Tipo_Codigo, A67Invd_NumeroPlaca, AV29Marca, AV30Modelo, AV37Serial, AV32Observaciones, AV38Tran_IdEntrada, AV31Nro_Linea, AV26cSerial, AV25cModelo, AV24cMarca) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV20cInvd_NumeroPlaca, AV17cInvd_DescripcionDevolutivo, AV13cElem_Consecutivo, AV21cInvd_PlacaPadre, AV18cInvd_FechaAdquisicion, AV9Regi_Id, AV8Cent_Id, AV6Alma_Modulo, AV5Alma_Codigo, AV7Bode_Codigo, AV10Tran_IdCuentadanteOrigen, AV41Tipo_Codigo, A67Invd_NumeroPlaca, AV29Marca, AV30Modelo, AV37Serial, AV32Observaciones, AV38Tran_IdEntrada, AV31Nro_Linea, AV26cSerial, AV25cModelo, AV24cMarca) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV20cInvd_NumeroPlaca, AV17cInvd_DescripcionDevolutivo, AV13cElem_Consecutivo, AV21cInvd_PlacaPadre, AV18cInvd_FechaAdquisicion, AV9Regi_Id, AV8Cent_Id, AV6Alma_Modulo, AV5Alma_Codigo, AV7Bode_Codigo, AV10Tran_IdCuentadanteOrigen, AV41Tipo_Codigo, A67Invd_NumeroPlaca, AV29Marca, AV30Modelo, AV37Serial, AV32Observaciones, AV38Tran_IdEntrada, AV31Nro_Linea, AV26cSerial, AV25cModelo, AV24cMarca) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV20cInvd_NumeroPlaca, AV17cInvd_DescripcionDevolutivo, AV13cElem_Consecutivo, AV21cInvd_PlacaPadre, AV18cInvd_FechaAdquisicion, AV9Regi_Id, AV8Cent_Id, AV6Alma_Modulo, AV5Alma_Codigo, AV7Bode_Codigo, AV10Tran_IdCuentadanteOrigen, AV41Tipo_Codigo, A67Invd_NumeroPlaca, AV29Marca, AV30Modelo, AV37Serial, AV32Observaciones, AV38Tran_IdEntrada, AV31Nro_Linea, AV26cSerial, AV25cModelo, AV24cMarca) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup7R0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMarca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavMarca_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      edtavModelo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModelo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavModelo_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      edtavSerial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSerial_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavSerial_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      edtavObservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObservaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavObservaciones_Enabled, 5, 0)), !bGXsfl_94_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e207R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         AV20cInvd_NumeroPlaca = httpContext.cgiGet( edtavCinvd_numeroplaca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20cInvd_NumeroPlaca", AV20cInvd_NumeroPlaca);
         AV17cInvd_DescripcionDevolutivo = httpContext.cgiGet( edtavCinvd_descripciondevolutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17cInvd_DescripcionDevolutivo", AV17cInvd_DescripcionDevolutivo);
         AV13cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13cElem_Consecutivo", AV13cElem_Consecutivo);
         AV21cInvd_PlacaPadre = httpContext.cgiGet( edtavCinvd_placapadre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21cInvd_PlacaPadre", AV21cInvd_PlacaPadre);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCinvd_fechaadquisicion_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCINVD_FECHAADQUISICION");
            GX_FocusControl = edtavCinvd_fechaadquisicion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18cInvd_FechaAdquisicion = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18cInvd_FechaAdquisicion", localUtil.format(AV18cInvd_FechaAdquisicion, "99/99/99"));
         }
         else
         {
            AV18cInvd_FechaAdquisicion = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCinvd_fechaadquisicion_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18cInvd_FechaAdquisicion", localUtil.format(AV18cInvd_FechaAdquisicion, "99/99/99"));
         }
         AV24cMarca = httpContext.cgiGet( edtavCmarca_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24cMarca", AV24cMarca);
         AV25cModelo = httpContext.cgiGet( edtavCmodelo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25cModelo", AV25cModelo);
         AV26cSerial = httpContext.cgiGet( edtavCserial_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26cSerial", AV26cSerial);
         /* Read saved values. */
         nRC_GXsfl_94 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_94"), ",", ".")) ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), ",", ".") ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), ",", ".")) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_NUMEROPLACA"), AV20cInvd_NumeroPlaca) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_DESCRIPCIONDEVOLUTIVO"), AV17cInvd_DescripcionDevolutivo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCELEM_CONSECUTIVO"), AV13cElem_Consecutivo) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCINVD_PLACAPADRE"), AV21cInvd_PlacaPadre) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vCINVD_FECHAADQUISICION"), 0), AV18cInvd_FechaAdquisicion) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
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
      e207R2 ();
      if ( returnInSub )
      {
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e207R2( )
   {
      /* Start Routine */
      Form.setCaption( GXutil.format( "Lista de Selección %1", "Inventario Cuentadante", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      AV11ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
   }

   private void e217R2( )
   {
      /* Load Routine */
      AV28LinkSelection = context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )) ;
      AV44Linkselection_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "3914535b-0c03-44c5-9538-906a99cdd2bc", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      GRID1_nEOF = (byte)(0) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
      while ( ( (pr_default.getStatus(0) != 101) && ( H007R2_A410Invd_RegionalId[0] == A410Invd_RegionalId ) && ( H007R2_A411Invd_CentroCostoId[0] == A411Invd_CentroCostoId ) && ( GXutil.strcmp(H007R2_A412Invd_ModuloAlmacen[0], A412Invd_ModuloAlmacen) == 0 ) && ( GXutil.strcmp(H007R2_A413Invd_AlmacenCodigo[0], A413Invd_AlmacenCodigo) == 0 ) ) && ( ( ( 10 == 0 ) || ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) ) )
      {
         if ( ! ( ( GXutil.strcmp(H007R2_A414Invd_BodegaCodigo[0], A414Invd_BodegaCodigo) == 0 ) && ( H007R2_A43Cuen_Identificacion[0] == A43Cuen_Identificacion ) && ( GXutil.strcmp(H007R2_A463Invd_Estado[0], A463Invd_Estado) == 0 ) && ( GXutil.strcmp(H007R2_A67Invd_NumeroPlaca[0], A67Invd_NumeroPlaca) == 0 ) ) )
         {
            if (true) break;
         }
         brk7R2 = false ;
         A37Cata_Codigo = H007R2_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H007R2_A298Cata_Descripcion[0] ;
         A68Invd_PlacaPadre = H007R2_A68Invd_PlacaPadre[0] ;
         n68Invd_PlacaPadre = H007R2_n68Invd_PlacaPadre[0] ;
         A66Elem_Consecutivo = H007R2_A66Elem_Consecutivo[0] ;
         A33Tipo_Codigo = H007R2_A33Tipo_Codigo[0] ;
         A466Invd_FechaAdquisicion = H007R2_A466Invd_FechaAdquisicion[0] ;
         n466Invd_FechaAdquisicion = H007R2_n466Invd_FechaAdquisicion[0] ;
         A465Invd_ValorAdquisicion = H007R2_A465Invd_ValorAdquisicion[0] ;
         n465Invd_ValorAdquisicion = H007R2_n465Invd_ValorAdquisicion[0] ;
         A501Invd_EsPlacaPadre = H007R2_A501Invd_EsPlacaPadre[0] ;
         n501Invd_EsPlacaPadre = H007R2_n501Invd_EsPlacaPadre[0] ;
         A629Costo_Total_Dev = H007R2_A629Costo_Total_Dev[0] ;
         A37Cata_Codigo = H007R2_A37Cata_Codigo[0] ;
         A33Tipo_Codigo = H007R2_A33Tipo_Codigo[0] ;
         A298Cata_Descripcion = H007R2_A298Cata_Descripcion[0] ;
         if ( (GXutil.strcmp("", AV17cInvd_DescripcionDevolutivo)==0) || ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV17cInvd_DescripcionDevolutivo), "") , 254 , "%"),  ' ' ) ) )
         {
            if ( GXutil.strcmp(A463Invd_Estado, "R") == 0 )
            {
               if ( A410Invd_RegionalId == AV9Regi_Id )
               {
                  if ( A411Invd_CentroCostoId == AV8Cent_Id )
                  {
                     if ( GXutil.strcmp(A412Invd_ModuloAlmacen, AV6Alma_Modulo) == 0 )
                     {
                        if ( GXutil.strcmp(A413Invd_AlmacenCodigo, AV5Alma_Codigo) == 0 )
                        {
                           if ( GXutil.strcmp(A414Invd_BodegaCodigo, AV7Bode_Codigo) == 0 )
                           {
                              if ( A33Tipo_Codigo == AV41Tipo_Codigo )
                              {
                                 if ( A43Cuen_Identificacion == AV10Tran_IdCuentadanteOrigen )
                                 {
                                    AV34Placa = A67Invd_NumeroPlaca ;
                                    httpContext.ajax_rsp_assign_attri("", false, "AV34Placa", AV34Placa);
                                    GXv_char1[0] = AV34Placa ;
                                    GXv_char2[0] = AV29Marca ;
                                    GXv_char3[0] = AV30Modelo ;
                                    GXv_char4[0] = AV37Serial ;
                                    GXv_char5[0] = AV32Observaciones ;
                                    GXv_int6[0] = AV38Tran_IdEntrada ;
                                    GXv_int7[0] = AV31Nro_Linea ;
                                    new com.orions2.buscaatributos(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_int6, GXv_int7) ;
                                    selecinventariocuentadante_impl.this.AV34Placa = GXv_char1[0] ;
                                    selecinventariocuentadante_impl.this.AV29Marca = GXv_char2[0] ;
                                    selecinventariocuentadante_impl.this.AV30Modelo = GXv_char3[0] ;
                                    selecinventariocuentadante_impl.this.AV37Serial = GXv_char4[0] ;
                                    selecinventariocuentadante_impl.this.AV32Observaciones = GXv_char5[0] ;
                                    selecinventariocuentadante_impl.this.AV38Tran_IdEntrada = GXv_int6[0] ;
                                    selecinventariocuentadante_impl.this.AV31Nro_Linea = GXv_int7[0] ;
                                    httpContext.ajax_rsp_assign_attri("", false, "AV34Placa", AV34Placa);
                                    httpContext.ajax_rsp_assign_attri("", false, "AV38Tran_IdEntrada", GXutil.ltrim( GXutil.str( AV38Tran_IdEntrada, 11, 0)));
                                    httpContext.ajax_rsp_assign_attri("", false, "AV31Nro_Linea", GXutil.ltrim( GXutil.str( AV31Nro_Linea, 8, 0)));
                                    if ( (GXutil.strcmp("", AV24cMarca)==0) && (GXutil.strcmp("", AV25cModelo)==0) && (GXutil.strcmp("", AV26cSerial)==0) )
                                    {
                                       if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                                       {
                                          sendrow_942( ) ;
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
                                       if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                                       {
                                          httpContext.doAjaxLoad(94, Grid1Row);
                                       }
                                    }
                                    else if ( GXutil.like( GXutil.upper( AV29Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cMarca), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV25cModelo)==0) && (GXutil.strcmp("", AV26cSerial)==0) )
                                    {
                                       if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                                       {
                                          sendrow_942( ) ;
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
                                       if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                                       {
                                          httpContext.doAjaxLoad(94, Grid1Row);
                                       }
                                    }
                                    else if ( GXutil.like( GXutil.upper( AV29Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV30Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cModelo), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV26cSerial)==0) )
                                    {
                                       if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                                       {
                                          sendrow_942( ) ;
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
                                       if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                                       {
                                          httpContext.doAjaxLoad(94, Grid1Row);
                                       }
                                    }
                                    else if ( GXutil.like( GXutil.upper( AV29Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cMarca), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV25cModelo)==0) && GXutil.like( GXutil.upper( AV37Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV26cSerial), "") , 254 , "%"),  ' ' ) )
                                    {
                                       if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                                       {
                                          sendrow_942( ) ;
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
                                       if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                                       {
                                          httpContext.doAjaxLoad(94, Grid1Row);
                                       }
                                    }
                                    else if ( GXutil.like( GXutil.upper( AV30Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cModelo), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV24cMarca)==0) && (GXutil.strcmp("", AV26cSerial)==0) )
                                    {
                                       if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                                       {
                                          sendrow_942( ) ;
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
                                       if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                                       {
                                          httpContext.doAjaxLoad(94, Grid1Row);
                                       }
                                    }
                                    else if ( GXutil.like( GXutil.upper( AV30Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV29Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cMarca), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV26cSerial)==0) )
                                    {
                                       if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                                       {
                                          sendrow_942( ) ;
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
                                       if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                                       {
                                          httpContext.doAjaxLoad(94, Grid1Row);
                                       }
                                    }
                                    else if ( GXutil.like( GXutil.upper( AV30Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cModelo), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV24cMarca)==0) && GXutil.like( GXutil.upper( AV37Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV26cSerial), "") , 254 , "%"),  ' ' ) )
                                    {
                                       if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                                       {
                                          sendrow_942( ) ;
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
                                       if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                                       {
                                          httpContext.doAjaxLoad(94, Grid1Row);
                                       }
                                    }
                                    else if ( GXutil.like( GXutil.upper( AV37Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV26cSerial), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV25cModelo)==0) && (GXutil.strcmp("", AV24cMarca)==0) )
                                    {
                                       if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                                       {
                                          sendrow_942( ) ;
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
                                       if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                                       {
                                          httpContext.doAjaxLoad(94, Grid1Row);
                                       }
                                    }
                                    else if ( GXutil.like( GXutil.upper( AV37Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV26cSerial), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV30Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cModelo), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV24cMarca)==0) )
                                    {
                                       if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                                       {
                                          sendrow_942( ) ;
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
                                       if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                                       {
                                          httpContext.doAjaxLoad(94, Grid1Row);
                                       }
                                    }
                                    else if ( GXutil.like( GXutil.upper( AV37Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV26cSerial), "") , 254 , "%"),  ' ' ) && (GXutil.strcmp("", AV25cModelo)==0) && GXutil.like( GXutil.upper( AV29Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cMarca), "") , 254 , "%"),  ' ' ) )
                                    {
                                       if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                                       {
                                          sendrow_942( ) ;
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
                                       if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                                       {
                                          httpContext.doAjaxLoad(94, Grid1Row);
                                       }
                                    }
                                    else if ( GXutil.like( GXutil.upper( AV29Marca) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV24cMarca), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV30Modelo) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cModelo), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV37Serial) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV26cSerial), "") , 254 , "%"),  ' ' ) )
                                    {
                                       if ( ( subGrid1_Islastpage == 1 ) || ( 10 == 0 ) || ( ( GRID1_nCurrentRecord >= GRID1_nFirstRecordOnPage ) && ( GRID1_nCurrentRecord < GRID1_nFirstRecordOnPage + subgrid1_recordsperpage( ) ) ) )
                                       {
                                          sendrow_942( ) ;
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
                                       if ( isFullAjaxMode( ) && ! bGXsfl_94_Refreshing )
                                       {
                                          httpContext.doAjaxLoad(94, Grid1Row);
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
         }
         brk7R2 = true ;
         pr_default.readNext(0);
      }
      GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e227R2 ();
      if ( returnInSub )
      {
         pr_default.close(0);
         pr_default.close(0);
         pr_default.close(0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e227R2( )
   {
      /* Enter Routine */
      AV34Placa = A67Invd_NumeroPlaca ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Placa", AV34Placa);
      AV12Cata_Descripcion = A298Cata_Descripcion ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Cata_Descripcion", AV12Cata_Descripcion);
      AV35PlacaPadre = A68Invd_PlacaPadre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35PlacaPadre", AV35PlacaPadre);
      AV39ValorAdquisicion = A465Invd_ValorAdquisicion ;
      AV27EsPlacaPadre = A501Invd_EsPlacaPadre ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27EsPlacaPadre", AV27EsPlacaPadre);
      httpContext.setWebReturnParms(new Object[] {AV34Placa,AV12Cata_Descripcion,AV35PlacaPadre,AV27EsPlacaPadre,AV32Observaciones,new Long(AV38Tran_IdEntrada),new Integer(AV31Nro_Linea)});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(0);
      pr_default.close(0);
      pr_default.close(0);
      returnInSub = true;
      if (true) return;
   }

   public void setparameters( Object[] obj )
   {
      AV34Placa = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Placa", AV34Placa);
      AV12Cata_Descripcion = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Cata_Descripcion", AV12Cata_Descripcion);
      AV35PlacaPadre = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35PlacaPadre", AV35PlacaPadre);
      AV27EsPlacaPadre = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27EsPlacaPadre", AV27EsPlacaPadre);
      AV9Regi_Id = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Regi_Id", GXutil.ltrim( GXutil.str( AV9Regi_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9Regi_Id), "ZZZZZZZZZZ9")));
      AV8Cent_Id = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Cent_Id", GXutil.ltrim( GXutil.str( AV8Cent_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Cent_Id), "ZZZZZZZZZZ9")));
      AV6Alma_Modulo = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Alma_Modulo", AV6Alma_Modulo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Alma_Modulo, ""))));
      AV5Alma_Codigo = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Alma_Codigo", AV5Alma_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Alma_Codigo, ""))));
      AV7Bode_Codigo = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Bode_Codigo", AV7Bode_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vBODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Bode_Codigo, ""))));
      AV32Observaciones = (String)getParm(obj,9) ;
      AV38Tran_IdEntrada = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Tran_IdEntrada", GXutil.ltrim( GXutil.str( AV38Tran_IdEntrada, 11, 0)));
      AV31Nro_Linea = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Nro_Linea", GXutil.ltrim( GXutil.str( AV31Nro_Linea, 8, 0)));
      AV10Tran_IdCuentadanteOrigen = ((Number) GXutil.testNumericType( getParm(obj,12), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Tran_IdCuentadanteOrigen", GXutil.ltrim( GXutil.str( AV10Tran_IdCuentadanteOrigen, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTRAN_IDCUENTADANTEORIGEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Tran_IdCuentadanteOrigen), "ZZZZZZZZZZZZZZZZZ9")));
      AV41Tipo_Codigo = ((Number) GXutil.testNumericType( getParm(obj,13), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Tipo_Codigo", GXutil.ltrim( GXutil.str( AV41Tipo_Codigo, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
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
      pa7R2( ) ;
      ws7R2( ) ;
      we7R2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141422241");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("selecinventariocuentadante.js", "?20186141422243");
      /* End function include_jscripts */
   }

   public void subsflControlProps_942( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_94_idx ;
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA_"+sGXsfl_94_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_94_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_94_idx ;
      edtInvd_PlacaPadre_Internalname = "INVD_PLACAPADRE_"+sGXsfl_94_idx ;
      edtavMarca_Internalname = "vMARCA_"+sGXsfl_94_idx ;
      edtavModelo_Internalname = "vMODELO_"+sGXsfl_94_idx ;
      edtavSerial_Internalname = "vSERIAL_"+sGXsfl_94_idx ;
      edtInvd_FechaAdquisicion_Internalname = "INVD_FECHAADQUISICION_"+sGXsfl_94_idx ;
      edtavObservaciones_Internalname = "vOBSERVACIONES_"+sGXsfl_94_idx ;
      edtCosto_Total_Dev_Internalname = "COSTO_TOTAL_DEV_"+sGXsfl_94_idx ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID_"+sGXsfl_94_idx ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID_"+sGXsfl_94_idx ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN_"+sGXsfl_94_idx );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO_"+sGXsfl_94_idx ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO_"+sGXsfl_94_idx ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO_"+sGXsfl_94_idx );
   }

   public void subsflControlProps_fel_942( )
   {
      edtavLinkselection_Internalname = "vLINKSELECTION_"+sGXsfl_94_fel_idx ;
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA_"+sGXsfl_94_fel_idx ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO_"+sGXsfl_94_fel_idx ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION_"+sGXsfl_94_fel_idx ;
      edtInvd_PlacaPadre_Internalname = "INVD_PLACAPADRE_"+sGXsfl_94_fel_idx ;
      edtavMarca_Internalname = "vMARCA_"+sGXsfl_94_fel_idx ;
      edtavModelo_Internalname = "vMODELO_"+sGXsfl_94_fel_idx ;
      edtavSerial_Internalname = "vSERIAL_"+sGXsfl_94_fel_idx ;
      edtInvd_FechaAdquisicion_Internalname = "INVD_FECHAADQUISICION_"+sGXsfl_94_fel_idx ;
      edtavObservaciones_Internalname = "vOBSERVACIONES_"+sGXsfl_94_fel_idx ;
      edtCosto_Total_Dev_Internalname = "COSTO_TOTAL_DEV_"+sGXsfl_94_fel_idx ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID_"+sGXsfl_94_fel_idx ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID_"+sGXsfl_94_fel_idx ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN_"+sGXsfl_94_fel_idx );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO_"+sGXsfl_94_fel_idx ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO_"+sGXsfl_94_fel_idx ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO_"+sGXsfl_94_fel_idx );
   }

   public void sendrow_942( )
   {
      subsflControlProps_942( ) ;
      wb7R0( ) ;
      if ( ( 10 * 1 == 0 ) || ( nGXsfl_94_idx <= subgrid1_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_94_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_94_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Static Bitmap Variable */
         edtavLinkselection_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( AV34Placa)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( AV12Cata_Descripcion)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( AV35PlacaPadre)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV27EsPlacaPadre))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( AV32Observaciones)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV38Tran_IdEntrada, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV31Nro_Linea, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavLinkselection_Internalname, "Link", edtavLinkselection_Link, !bGXsfl_94_Refreshing);
         ClassString = "SelectionAttribute" ;
         StyleString = "" ;
         AV28LinkSelection_IsBlob = (boolean)(((GXutil.strcmp("", AV28LinkSelection)==0)&&(GXutil.strcmp("", AV44Linkselection_GXI)==0))||!(GXutil.strcmp("", AV28LinkSelection)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV28LinkSelection)==0) ? AV44Linkselection_GXI : httpContext.getResourceRelative(AV28LinkSelection)) ;
         Grid1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavLinkselection_Internalname,sImgUrl,edtavLinkselection_Link,"","",context.getHttpContext().getTheme( ),new Integer(-1),new Integer(1),"","",new Integer(1),new Integer(-1),new Integer(0),"px",new Integer(0),"px",new Integer(0),new Integer(0),new Integer(0),"","",StyleString,ClassString,"WWActionColumn","","","","","",new Integer(1),new Boolean(AV28LinkSelection_IsBlob),new Boolean(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_NumeroPlaca_Internalname,A67Invd_NumeroPlaca,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_NumeroPlaca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtElem_Consecutivo_Internalname,A66Elem_Consecutivo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtElem_Consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(85),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCata_Descripcion_Internalname,A298Cata_Descripcion,GXutil.rtrim( localUtil.format( A298Cata_Descripcion, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCata_Descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_PlacaPadre_Internalname,A68Invd_PlacaPadre,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_PlacaPadre_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(85),"px",new Integer(17),"px",new Integer(30),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMarca_Internalname,AV29Marca,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMarca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavMarca_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavModelo_Internalname,AV30Modelo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavModelo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavModelo_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSerial_Internalname,AV37Serial,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSerial_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavSerial_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(100),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_FechaAdquisicion_Internalname,localUtil.format(A466Invd_FechaAdquisicion, "99/99/99"),localUtil.format( A466Invd_FechaAdquisicion, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_FechaAdquisicion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Fecha","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObservaciones_Internalname,AV32Observaciones,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavObservaciones_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtavObservaciones_Enabled),new Integer(0),"text","",new Integer(150),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCosto_Total_Dev_Internalname,GXutil.ltrim( localUtil.ntoc( A629Costo_Total_Dev, (byte)(24), (byte)(2), ",", "")),localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCosto_Total_Dev_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(0),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Valor","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "DescriptionAttribute" ;
         edtInvd_RegionalId_Link = "javascript:gx.popup.gxReturn(["+"'"+PrivateUtilities.encodeJSConstant( AV34Placa)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( AV12Cata_Descripcion)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( AV35PlacaPadre)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV27EsPlacaPadre))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( AV32Observaciones)+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV38Tran_IdEntrada, (byte)(11), (byte)(0), ",", "")))+"'"+", "+"'"+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV31Nro_Linea, (byte)(8), (byte)(0), ",", "")))+"'"+"]);" ;
         httpContext.ajax_rsp_assign_prop("", false, edtInvd_RegionalId_Internalname, "Link", edtInvd_RegionalId_Link, !bGXsfl_94_Refreshing);
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_RegionalId_Internalname,GXutil.ltrim( localUtil.ntoc( A410Invd_RegionalId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'",edtInvd_RegionalId_Link,"","","",edtInvd_RegionalId_Jsonclick,new Integer(0),"DescriptionAttribute","",ROClassString,"WWColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_CentroCostoId_Internalname,GXutil.ltrim( localUtil.ntoc( A411Invd_CentroCostoId, (byte)(11), (byte)(0), ",", "")),localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_CentroCostoId_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(11),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"Identificador","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_94_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "INVD_MODULOALMACEN_" + sGXsfl_94_idx ;
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
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbInvd_ModuloAlmacen,cmbInvd_ModuloAlmacen.getInternalname(),GXutil.rtrim( A412Invd_ModuloAlmacen),new Integer(1),cmbInvd_ModuloAlmacen.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbInvd_ModuloAlmacen.setValue( GXutil.rtrim( A412Invd_ModuloAlmacen) );
         httpContext.ajax_rsp_assign_prop("", false, cmbInvd_ModuloAlmacen.getInternalname(), "Values", cmbInvd_ModuloAlmacen.ToJavascriptSource(), !bGXsfl_94_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_AlmacenCodigo_Internalname,A413Invd_AlmacenCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_AlmacenCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(2),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInvd_BodegaCodigo_Internalname,A414Invd_BodegaCodigo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInvd_BodegaCodigo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn OptionalColumn",new Integer(0),new Integer(0),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(3),new Integer(0),new Integer(0),new Integer(94),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( nGXsfl_94_idx == 1 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "INVD_ESTADO_" + sGXsfl_94_idx ;
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
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbInvd_Estado,cmbInvd_Estado.getInternalname(),GXutil.rtrim( A463Invd_Estado),new Integer(1),cmbInvd_Estado.getJsonclick(),new Integer(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",new Integer(0),new Integer(0),new Integer(0),new Integer(0),new Integer(0),"px",new Integer(0),"px","","Attribute","WWColumn OptionalColumn","","",new Boolean(true)});
         cmbInvd_Estado.setValue( GXutil.rtrim( A463Invd_Estado) );
         httpContext.ajax_rsp_assign_prop("", false, cmbInvd_Estado.getInternalname(), "Values", cmbInvd_Estado.ToJavascriptSource(), !bGXsfl_94_Refreshing);
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_NUMEROPLACA"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A67Invd_NumeroPlaca, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_ELEM_CONSECUTIVO"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A66Elem_Consecutivo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_PLACAPADRE"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A68Invd_PlacaPadre, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMARCA"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( AV29Marca, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODELO"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( AV30Modelo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSERIAL"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( AV37Serial, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_FECHAADQUISICION"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, A466Invd_FechaAdquisicion));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOBSERVACIONES"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( AV32Observaciones, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_COSTO_TOTAL_DEV"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, localUtil.format( A629Costo_Total_Dev, "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_REGIONALID"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, localUtil.format( DecimalUtil.doubleToDec(A410Invd_RegionalId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_CENTROCOSTOID"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, localUtil.format( DecimalUtil.doubleToDec(A411Invd_CentroCostoId), "ZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_MODULOALMACEN"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A412Invd_ModuloAlmacen, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ALMACENCODIGO"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A413Invd_AlmacenCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_BODEGACODIGO"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A414Invd_BodegaCodigo, ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_INVD_ESTADO"+"_"+sGXsfl_94_idx, getSecureSignedToken( sGXsfl_94_idx, GXutil.rtrim( localUtil.format( A463Invd_Estado, ""))));
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_94_idx = (short)(((subGrid1_Islastpage==1)&&(nGXsfl_94_idx+1>subgrid1_recordsperpage( )) ? 1 : nGXsfl_94_idx+1)) ;
         sGXsfl_94_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_94_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_942( ) ;
      }
      /* End function sendrow_942 */
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
      lblLblinvd_placapadrefilter_Internalname = "LBLINVD_PLACAPADREFILTER" ;
      edtavCinvd_placapadre_Internalname = "vCINVD_PLACAPADRE" ;
      divInvd_placapadrefiltercontainer_Internalname = "INVD_PLACAPADREFILTERCONTAINER" ;
      lblLblfechafilter_Internalname = "LBLFECHAFILTER" ;
      edtavCinvd_fechaadquisicion_Internalname = "vCINVD_FECHAADQUISICION" ;
      divInvd_fechafiltercontainer_Internalname = "INVD_FECHAFILTERCONTAINER" ;
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
      edtInvd_NumeroPlaca_Internalname = "INVD_NUMEROPLACA" ;
      edtElem_Consecutivo_Internalname = "ELEM_CONSECUTIVO" ;
      edtCata_Descripcion_Internalname = "CATA_DESCRIPCION" ;
      edtInvd_PlacaPadre_Internalname = "INVD_PLACAPADRE" ;
      edtavMarca_Internalname = "vMARCA" ;
      edtavModelo_Internalname = "vMODELO" ;
      edtavSerial_Internalname = "vSERIAL" ;
      edtInvd_FechaAdquisicion_Internalname = "INVD_FECHAADQUISICION" ;
      edtavObservaciones_Internalname = "vOBSERVACIONES" ;
      edtCosto_Total_Dev_Internalname = "COSTO_TOTAL_DEV" ;
      edtInvd_RegionalId_Internalname = "INVD_REGIONALID" ;
      edtInvd_CentroCostoId_Internalname = "INVD_CENTROCOSTOID" ;
      cmbInvd_ModuloAlmacen.setInternalname( "INVD_MODULOALMACEN" );
      edtInvd_AlmacenCodigo_Internalname = "INVD_ALMACENCODIGO" ;
      edtInvd_BodegaCodigo_Internalname = "INVD_BODEGACODIGO" ;
      cmbInvd_Estado.setInternalname( "INVD_ESTADO" );
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
      cmbInvd_Estado.setJsonclick( "" );
      edtInvd_BodegaCodigo_Jsonclick = "" ;
      edtInvd_AlmacenCodigo_Jsonclick = "" ;
      cmbInvd_ModuloAlmacen.setJsonclick( "" );
      edtInvd_CentroCostoId_Jsonclick = "" ;
      edtInvd_RegionalId_Jsonclick = "" ;
      edtCosto_Total_Dev_Jsonclick = "" ;
      edtavObservaciones_Jsonclick = "" ;
      edtInvd_FechaAdquisicion_Jsonclick = "" ;
      edtavSerial_Jsonclick = "" ;
      edtavModelo_Jsonclick = "" ;
      edtavMarca_Jsonclick = "" ;
      edtInvd_PlacaPadre_Jsonclick = "" ;
      edtCata_Descripcion_Jsonclick = "" ;
      edtElem_Consecutivo_Jsonclick = "" ;
      edtInvd_NumeroPlaca_Jsonclick = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      edtInvd_RegionalId_Link = "" ;
      edtavLinkselection_Link = "" ;
      edtavObservaciones_Enabled = 0 ;
      edtavSerial_Enabled = 0 ;
      edtavModelo_Enabled = 0 ;
      edtavMarca_Enabled = 0 ;
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
      edtavCinvd_fechaadquisicion_Jsonclick = "" ;
      edtavCinvd_fechaadquisicion_Enabled = 1 ;
      edtavCinvd_fechaadquisicion_Visible = 1 ;
      edtavCinvd_placapadre_Jsonclick = "" ;
      edtavCinvd_placapadre_Enabled = 1 ;
      edtavCinvd_placapadre_Visible = 1 ;
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
      divInvd_fechafiltercontainer_Class = "AdvancedContainerItem" ;
      divElem_consecutivofiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_placapadrefiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_descripcionidfiltercontainer_Class = "AdvancedContainerItem" ;
      divInvd_numeroplacafiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Selecciona Inventario Cuentadante" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV20cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV17cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV13cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV21cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV18cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',hsh:true,nv:''},{av:'AV10Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV29Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV30Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV37Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV32Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV31Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV26cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV25cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV24cMarca',fld:'vCMARCA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e197R1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLINVD_NUMEROPLACAFILTER.CLICK","{handler:'e117R1',iparms:[{av:'divInvd_numeroplacafiltercontainer_Class',ctrl:'INVD_NUMEROPLACAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_numeroplacafiltercontainer_Class',ctrl:'INVD_NUMEROPLACAFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_numeroplaca_Visible',ctrl:'vCINVD_NUMEROPLACA',prop:'Visible'}]}");
      setEventMetadata("LBLINVD_DESCRIPCIONIDFILTER.CLICK","{handler:'e127R1',iparms:[{av:'divInvd_descripcionidfiltercontainer_Class',ctrl:'INVD_DESCRIPCIONIDFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_descripcionidfiltercontainer_Class',ctrl:'INVD_DESCRIPCIONIDFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_descripciondevolutivo_Visible',ctrl:'vCINVD_DESCRIPCIONDEVOLUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLINVD_PLACAPADREFILTER.CLICK","{handler:'e147R1',iparms:[{av:'divInvd_placapadrefiltercontainer_Class',ctrl:'INVD_PLACAPADREFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_placapadrefiltercontainer_Class',ctrl:'INVD_PLACAPADREFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_placapadre_Visible',ctrl:'vCINVD_PLACAPADRE',prop:'Visible'}]}");
      setEventMetadata("LBLELEM_CONSECUTIVOFILTER.CLICK","{handler:'e137R1',iparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divElem_consecutivofiltercontainer_Class',ctrl:'ELEM_CONSECUTIVOFILTERCONTAINER',prop:'Class'},{av:'edtavCelem_consecutivo_Visible',ctrl:'vCELEM_CONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLFECHAFILTER.CLICK","{handler:'e157R1',iparms:[{av:'divInvd_fechafiltercontainer_Class',ctrl:'INVD_FECHAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_fechafiltercontainer_Class',ctrl:'INVD_FECHAFILTERCONTAINER',prop:'Class'},{av:'edtavCinvd_fechaadquisicion_Visible',ctrl:'vCINVD_FECHAADQUISICION',prop:'Visible'}]}");
      setEventMetadata("LBLMARCAFILTER.CLICK","{handler:'e167R1',iparms:[{av:'divInvd_marcafiltercontainer_Class',ctrl:'INVD_MARCAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_marcafiltercontainer_Class',ctrl:'INVD_MARCAFILTERCONTAINER',prop:'Class'},{av:'edtavCmarca_Visible',ctrl:'vCMARCA',prop:'Visible'}]}");
      setEventMetadata("LBLMODELOFILTER.CLICK","{handler:'e177R1',iparms:[{av:'divInvd_modelofiltercontainer_Class',ctrl:'INVD_MODELOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_modelofiltercontainer_Class',ctrl:'INVD_MODELOFILTERCONTAINER',prop:'Class'},{av:'edtavCmodelo_Visible',ctrl:'vCMODELO',prop:'Visible'}]}");
      setEventMetadata("LBLSERIALFILTER.CLICK","{handler:'e187R1',iparms:[{av:'divInvd_serialfiltercontainer_Class',ctrl:'INVD_SERIALFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvd_serialfiltercontainer_Class',ctrl:'INVD_SERIALFILTERCONTAINER',prop:'Class'},{av:'edtavCserial_Visible',ctrl:'vCSERIAL',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e227R2',iparms:[{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A68Invd_PlacaPadre',fld:'INVD_PLACAPADRE',pic:'',hsh:true,nv:''},{av:'A465Invd_ValorAdquisicion',fld:'INVD_VALORADQUISICION',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A501Invd_EsPlacaPadre',fld:'INVD_ESPLACAPADRE',pic:'',nv:''},{av:'AV31Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV32Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''}],oparms:[{av:'AV34Placa',fld:'vPLACA',pic:'',nv:''},{av:'AV12Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV35PlacaPadre',fld:'vPLACAPADRE',pic:'',nv:''},{av:'AV27EsPlacaPadre',fld:'vESPLACAPADRE',pic:'',nv:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV20cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV17cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV13cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV21cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV18cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',hsh:true,nv:''},{av:'AV10Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV29Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV30Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV37Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV32Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV31Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV26cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV25cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV24cMarca',fld:'vCMARCA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV20cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV17cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV13cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV21cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV18cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',hsh:true,nv:''},{av:'AV10Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV29Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV30Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV37Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV32Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV31Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV26cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV25cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV24cMarca',fld:'vCMARCA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV20cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV17cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV13cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV21cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV18cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',hsh:true,nv:''},{av:'AV10Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV29Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV30Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV37Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV32Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV31Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV26cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV25cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV24cMarca',fld:'vCMARCA',pic:'',nv:''}],oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage',nv:0},{av:'GRID1_nEOF',nv:0},{av:'subGrid1_Rows',nv:0},{av:'AV20cInvd_NumeroPlaca',fld:'vCINVD_NUMEROPLACA',pic:'',nv:''},{av:'AV17cInvd_DescripcionDevolutivo',fld:'vCINVD_DESCRIPCIONDEVOLUTIVO',pic:'',nv:''},{av:'AV13cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV21cInvd_PlacaPadre',fld:'vCINVD_PLACAPADRE',pic:'',nv:''},{av:'AV18cInvd_FechaAdquisicion',fld:'vCINVD_FECHAADQUISICION',pic:'',nv:''},{av:'AV9Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV8Cent_Id',fld:'vCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV6Alma_Modulo',fld:'vALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV5Alma_Codigo',fld:'vALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV7Bode_Codigo',fld:'vBODE_CODIGO',pic:'',hsh:true,nv:''},{av:'AV10Tran_IdCuentadanteOrigen',fld:'vTRAN_IDCUENTADANTEORIGEN',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV41Tipo_Codigo',fld:'vTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',hsh:true,nv:0},{av:'A67Invd_NumeroPlaca',fld:'INVD_NUMEROPLACA',pic:'',hsh:true,nv:''},{av:'AV29Marca',fld:'vMARCA',pic:'',hsh:true,nv:''},{av:'AV30Modelo',fld:'vMODELO',pic:'',hsh:true,nv:''},{av:'AV37Serial',fld:'vSERIAL',pic:'',hsh:true,nv:''},{av:'AV32Observaciones',fld:'vOBSERVACIONES',pic:'',hsh:true,nv:''},{av:'AV38Tran_IdEntrada',fld:'vTRAN_IDENTRADA',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV31Nro_Linea',fld:'vNRO_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV26cSerial',fld:'vCSERIAL',pic:'',nv:''},{av:'AV25cModelo',fld:'vCMODELO',pic:'',nv:''},{av:'AV24cMarca',fld:'vCMARCA',pic:'',nv:''}],oparms:[]}");
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
      wcpOAV6Alma_Modulo = "" ;
      wcpOAV5Alma_Codigo = "" ;
      wcpOAV7Bode_Codigo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV20cInvd_NumeroPlaca = "" ;
      AV17cInvd_DescripcionDevolutivo = "" ;
      AV13cElem_Consecutivo = "" ;
      AV21cInvd_PlacaPadre = "" ;
      AV18cInvd_FechaAdquisicion = GXutil.nullDate() ;
      A67Invd_NumeroPlaca = "" ;
      AV29Marca = "" ;
      AV30Modelo = "" ;
      AV37Serial = "" ;
      AV26cSerial = "" ;
      AV25cModelo = "" ;
      AV24cMarca = "" ;
      GXKey = "" ;
      AV34Placa = "" ;
      AV12Cata_Descripcion = "" ;
      AV35PlacaPadre = "" ;
      AV27EsPlacaPadre = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A465Invd_ValorAdquisicion = DecimalUtil.ZERO ;
      A501Invd_EsPlacaPadre = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblinvd_numeroplacafilter_Jsonclick = "" ;
      TempTags = "" ;
      lblLblinvd_descripcionidfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblLblelem_consecutivofilter_Jsonclick = "" ;
      lblLblinvd_placapadrefilter_Jsonclick = "" ;
      lblLblfechafilter_Jsonclick = "" ;
      lblLblmarcafilter_Jsonclick = "" ;
      lblLblmodelofilter_Jsonclick = "" ;
      lblLblserialfilter_Jsonclick = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid1_Linesclass = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV28LinkSelection = "" ;
      A66Elem_Consecutivo = "" ;
      A298Cata_Descripcion = "" ;
      A68Invd_PlacaPadre = "" ;
      A466Invd_FechaAdquisicion = GXutil.nullDate() ;
      A629Costo_Total_Dev = DecimalUtil.ZERO ;
      A412Invd_ModuloAlmacen = "" ;
      A413Invd_AlmacenCodigo = "" ;
      A414Invd_BodegaCodigo = "" ;
      A463Invd_Estado = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV44Linkselection_GXI = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV20cInvd_NumeroPlaca = "" ;
      lV21cInvd_PlacaPadre = "" ;
      lV13cElem_Consecutivo = "" ;
      H007R2_A37Cata_Codigo = new String[] {""} ;
      H007R2_A298Cata_Descripcion = new String[] {""} ;
      H007R2_A463Invd_Estado = new String[] {""} ;
      H007R2_n463Invd_Estado = new boolean[] {false} ;
      H007R2_A410Invd_RegionalId = new long[1] ;
      H007R2_A411Invd_CentroCostoId = new long[1] ;
      H007R2_A412Invd_ModuloAlmacen = new String[] {""} ;
      H007R2_A413Invd_AlmacenCodigo = new String[] {""} ;
      H007R2_A414Invd_BodegaCodigo = new String[] {""} ;
      H007R2_A68Invd_PlacaPadre = new String[] {""} ;
      H007R2_n68Invd_PlacaPadre = new boolean[] {false} ;
      H007R2_A66Elem_Consecutivo = new String[] {""} ;
      H007R2_A33Tipo_Codigo = new long[1] ;
      H007R2_A466Invd_FechaAdquisicion = new java.util.Date[] {GXutil.nullDate()} ;
      H007R2_n466Invd_FechaAdquisicion = new boolean[] {false} ;
      H007R2_A43Cuen_Identificacion = new long[1] ;
      H007R2_n43Cuen_Identificacion = new boolean[] {false} ;
      H007R2_A67Invd_NumeroPlaca = new String[] {""} ;
      H007R2_A465Invd_ValorAdquisicion = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H007R2_n465Invd_ValorAdquisicion = new boolean[] {false} ;
      H007R2_A501Invd_EsPlacaPadre = new String[] {""} ;
      H007R2_n501Invd_EsPlacaPadre = new boolean[] {false} ;
      H007R2_A629Costo_Total_Dev = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A37Cata_Codigo = "" ;
      AV11ADVANCED_LABEL_TEMPLATE = "" ;
      GXv_char1 = new String [1] ;
      GXv_char2 = new String [1] ;
      GXv_char3 = new String [1] ;
      GXv_char4 = new String [1] ;
      GXv_char5 = new String [1] ;
      GXv_int6 = new long [1] ;
      GXv_int7 = new int [1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      AV39ValorAdquisicion = DecimalUtil.ZERO ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sImgUrl = "" ;
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.selecinventariocuentadante__default(),
         new Object[] {
             new Object[] {
            H007R2_A37Cata_Codigo, H007R2_A298Cata_Descripcion, H007R2_A463Invd_Estado, H007R2_n463Invd_Estado, H007R2_A410Invd_RegionalId, H007R2_A411Invd_CentroCostoId, H007R2_A412Invd_ModuloAlmacen, H007R2_A413Invd_AlmacenCodigo, H007R2_A414Invd_BodegaCodigo, H007R2_A68Invd_PlacaPadre,
            H007R2_n68Invd_PlacaPadre, H007R2_A66Elem_Consecutivo, H007R2_A33Tipo_Codigo, H007R2_A466Invd_FechaAdquisicion, H007R2_n466Invd_FechaAdquisicion, H007R2_A43Cuen_Identificacion, H007R2_n43Cuen_Identificacion, H007R2_A67Invd_NumeroPlaca, H007R2_A465Invd_ValorAdquisicion, H007R2_n465Invd_ValorAdquisicion,
            H007R2_A501Invd_EsPlacaPadre, H007R2_n501Invd_EsPlacaPadre, H007R2_A629Costo_Total_Dev
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavMarca_Enabled = 0 ;
      edtavModelo_Enabled = 0 ;
      edtavSerial_Enabled = 0 ;
      edtavObservaciones_Enabled = 0 ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRC_GXsfl_94 ;
   private short nGXsfl_94_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid1_Rows ;
   private int AV31Nro_Linea ;
   private int edtavCinvd_numeroplaca_Visible ;
   private int edtavCinvd_numeroplaca_Enabled ;
   private int edtavCinvd_descripciondevolutivo_Visible ;
   private int edtavCinvd_descripciondevolutivo_Enabled ;
   private int edtavCelem_consecutivo_Visible ;
   private int edtavCelem_consecutivo_Enabled ;
   private int edtavCinvd_placapadre_Visible ;
   private int edtavCinvd_placapadre_Enabled ;
   private int edtavCinvd_fechaadquisicion_Visible ;
   private int edtavCinvd_fechaadquisicion_Enabled ;
   private int edtavCmarca_Visible ;
   private int edtavCmarca_Enabled ;
   private int edtavCmodelo_Visible ;
   private int edtavCmodelo_Enabled ;
   private int edtavCserial_Visible ;
   private int edtavCserial_Enabled ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavMarca_Enabled ;
   private int edtavModelo_Enabled ;
   private int edtavSerial_Enabled ;
   private int edtavObservaciones_Enabled ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid1_Islastpage ;
   private int GXv_int7[] ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private long wcpOAV9Regi_Id ;
   private long wcpOAV8Cent_Id ;
   private long wcpOAV10Tran_IdCuentadanteOrigen ;
   private long wcpOAV41Tipo_Codigo ;
   private long AV9Regi_Id ;
   private long AV8Cent_Id ;
   private long AV10Tran_IdCuentadanteOrigen ;
   private long AV41Tipo_Codigo ;
   private long AV38Tran_IdEntrada ;
   private long GRID1_nFirstRecordOnPage ;
   private long A33Tipo_Codigo ;
   private long A43Cuen_Identificacion ;
   private long A410Invd_RegionalId ;
   private long A411Invd_CentroCostoId ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A465Invd_ValorAdquisicion ;
   private java.math.BigDecimal A629Costo_Total_Dev ;
   private java.math.BigDecimal AV39ValorAdquisicion ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divInvd_numeroplacafiltercontainer_Class ;
   private String divInvd_descripcionidfiltercontainer_Class ;
   private String divInvd_placapadrefiltercontainer_Class ;
   private String divElem_consecutivofiltercontainer_Class ;
   private String divInvd_fechafiltercontainer_Class ;
   private String divInvd_marcafiltercontainer_Class ;
   private String divInvd_modelofiltercontainer_Class ;
   private String divInvd_serialfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_94_idx="0001" ;
   private String GXKey ;
   private String AV27EsPlacaPadre ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A501Invd_EsPlacaPadre ;
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
   private String divInvd_placapadrefiltercontainer_Internalname ;
   private String lblLblinvd_placapadrefilter_Internalname ;
   private String lblLblinvd_placapadrefilter_Jsonclick ;
   private String edtavCinvd_placapadre_Internalname ;
   private String edtavCinvd_placapadre_Jsonclick ;
   private String divInvd_fechafiltercontainer_Internalname ;
   private String lblLblfechafilter_Internalname ;
   private String lblLblfechafilter_Jsonclick ;
   private String edtavCinvd_fechaadquisicion_Internalname ;
   private String edtavCinvd_fechaadquisicion_Jsonclick ;
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
   private String edtInvd_RegionalId_Link ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavLinkselection_Internalname ;
   private String edtInvd_NumeroPlaca_Internalname ;
   private String edtElem_Consecutivo_Internalname ;
   private String edtCata_Descripcion_Internalname ;
   private String edtInvd_PlacaPadre_Internalname ;
   private String edtavMarca_Internalname ;
   private String edtavModelo_Internalname ;
   private String edtavSerial_Internalname ;
   private String edtInvd_FechaAdquisicion_Internalname ;
   private String edtavObservaciones_Internalname ;
   private String edtCosto_Total_Dev_Internalname ;
   private String edtInvd_RegionalId_Internalname ;
   private String edtInvd_CentroCostoId_Internalname ;
   private String edtInvd_AlmacenCodigo_Internalname ;
   private String edtInvd_BodegaCodigo_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String AV11ADVANCED_LABEL_TEMPLATE ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String sGXsfl_94_fel_idx="0001" ;
   private String sImgUrl ;
   private String ROClassString ;
   private String edtInvd_NumeroPlaca_Jsonclick ;
   private String edtElem_Consecutivo_Jsonclick ;
   private String edtCata_Descripcion_Jsonclick ;
   private String edtInvd_PlacaPadre_Jsonclick ;
   private String edtavMarca_Jsonclick ;
   private String edtavModelo_Jsonclick ;
   private String edtavSerial_Jsonclick ;
   private String edtInvd_FechaAdquisicion_Jsonclick ;
   private String edtavObservaciones_Jsonclick ;
   private String edtCosto_Total_Dev_Jsonclick ;
   private String edtInvd_RegionalId_Jsonclick ;
   private String edtInvd_CentroCostoId_Jsonclick ;
   private String edtInvd_AlmacenCodigo_Jsonclick ;
   private String edtInvd_BodegaCodigo_Jsonclick ;
   private java.util.Date AV18cInvd_FechaAdquisicion ;
   private java.util.Date A466Invd_FechaAdquisicion ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_94_Refreshing=false ;
   private boolean n68Invd_PlacaPadre ;
   private boolean n466Invd_FechaAdquisicion ;
   private boolean n463Invd_Estado ;
   private boolean brk7R2 ;
   private boolean n43Cuen_Identificacion ;
   private boolean n465Invd_ValorAdquisicion ;
   private boolean n501Invd_EsPlacaPadre ;
   private boolean returnInSub ;
   private boolean AV28LinkSelection_IsBlob ;
   private String AV17cInvd_DescripcionDevolutivo ;
   private String wcpOAV6Alma_Modulo ;
   private String wcpOAV5Alma_Codigo ;
   private String wcpOAV7Bode_Codigo ;
   private String AV20cInvd_NumeroPlaca ;
   private String AV13cElem_Consecutivo ;
   private String AV21cInvd_PlacaPadre ;
   private String AV6Alma_Modulo ;
   private String AV5Alma_Codigo ;
   private String AV7Bode_Codigo ;
   private String A67Invd_NumeroPlaca ;
   private String AV29Marca ;
   private String AV30Modelo ;
   private String AV37Serial ;
   private String AV32Observaciones ;
   private String AV26cSerial ;
   private String AV25cModelo ;
   private String AV24cMarca ;
   private String AV34Placa ;
   private String AV12Cata_Descripcion ;
   private String AV35PlacaPadre ;
   private String A66Elem_Consecutivo ;
   private String A298Cata_Descripcion ;
   private String A68Invd_PlacaPadre ;
   private String A412Invd_ModuloAlmacen ;
   private String A413Invd_AlmacenCodigo ;
   private String A414Invd_BodegaCodigo ;
   private String A463Invd_Estado ;
   private String AV44Linkselection_GXI ;
   private String lV20cInvd_NumeroPlaca ;
   private String lV21cInvd_PlacaPadre ;
   private String lV13cElem_Consecutivo ;
   private String A37Cata_Codigo ;
   private String AV28LinkSelection ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private HTMLChoice cmbInvd_ModuloAlmacen ;
   private HTMLChoice cmbInvd_Estado ;
   private IDataStoreProvider pr_default ;
   private String[] H007R2_A37Cata_Codigo ;
   private String[] H007R2_A298Cata_Descripcion ;
   private String[] H007R2_A463Invd_Estado ;
   private boolean[] H007R2_n463Invd_Estado ;
   private long[] H007R2_A410Invd_RegionalId ;
   private long[] H007R2_A411Invd_CentroCostoId ;
   private String[] H007R2_A412Invd_ModuloAlmacen ;
   private String[] H007R2_A413Invd_AlmacenCodigo ;
   private String[] H007R2_A414Invd_BodegaCodigo ;
   private String[] H007R2_A68Invd_PlacaPadre ;
   private boolean[] H007R2_n68Invd_PlacaPadre ;
   private String[] H007R2_A66Elem_Consecutivo ;
   private long[] H007R2_A33Tipo_Codigo ;
   private java.util.Date[] H007R2_A466Invd_FechaAdquisicion ;
   private boolean[] H007R2_n466Invd_FechaAdquisicion ;
   private long[] H007R2_A43Cuen_Identificacion ;
   private boolean[] H007R2_n43Cuen_Identificacion ;
   private String[] H007R2_A67Invd_NumeroPlaca ;
   private java.math.BigDecimal[] H007R2_A465Invd_ValorAdquisicion ;
   private boolean[] H007R2_n465Invd_ValorAdquisicion ;
   private String[] H007R2_A501Invd_EsPlacaPadre ;
   private boolean[] H007R2_n501Invd_EsPlacaPadre ;
   private java.math.BigDecimal[] H007R2_A629Costo_Total_Dev ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class selecinventariocuentadante__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H007R2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV20cInvd_NumeroPlaca ,
                                          String AV21cInvd_PlacaPadre ,
                                          String AV13cElem_Consecutivo ,
                                          java.util.Date AV18cInvd_FechaAdquisicion ,
                                          String A67Invd_NumeroPlaca ,
                                          String A68Invd_PlacaPadre ,
                                          String A66Elem_Consecutivo ,
                                          java.util.Date A466Invd_FechaAdquisicion ,
                                          String AV17cInvd_DescripcionDevolutivo ,
                                          String A298Cata_Descripcion ,
                                          long A33Tipo_Codigo ,
                                          long AV41Tipo_Codigo ,
                                          long AV9Regi_Id ,
                                          long AV8Cent_Id ,
                                          String AV6Alma_Modulo ,
                                          String AV5Alma_Codigo ,
                                          String AV7Bode_Codigo ,
                                          long AV10Tran_IdCuentadanteOrigen ,
                                          long A410Invd_RegionalId ,
                                          long A411Invd_CentroCostoId ,
                                          String A412Invd_ModuloAlmacen ,
                                          String A413Invd_AlmacenCodigo ,
                                          String A414Invd_BodegaCodigo ,
                                          long A43Cuen_Identificacion ,
                                          String A463Invd_Estado )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int8 ;
      GXv_int8 = new byte [11] ;
      Object[] GXv_Object9 ;
      GXv_Object9 = new Object [2] ;
      scmdbuf = "SELECT /*+ FIRST_ROWS(11) */ T2.Cata_Codigo, T3.Cata_Descripcion, T1.Invd_Estado," ;
      scmdbuf = scmdbuf + " T1.Invd_RegionalId, T1.Invd_CentroCostoId, T1.Invd_ModuloAlmacen, T1.Invd_AlmacenCodigo," ;
      scmdbuf = scmdbuf + " T1.Invd_BodegaCodigo, T1.Invd_PlacaPadre, T1.Elem_Consecutivo, T2.Tipo_Codigo, T1.Invd_FechaAdquisicion," ;
      scmdbuf = scmdbuf + " T1.Cuen_Identificacion, T1.Invd_NumeroPlaca, T1.Invd_ValorAdquisicion, T1.Invd_EsPlacaPadre," ;
      scmdbuf = scmdbuf + " T1.Costo_Total_Dev FROM ((ALM_INVENTARIO_DEVOLUTIVO T1 INNER JOIN ALM_ELEMENTO T2" ;
      scmdbuf = scmdbuf + " ON T2.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T3 ON T3.Cata_Codigo" ;
      scmdbuf = scmdbuf + " = T2.Cata_Codigo)" ;
      scmdbuf = scmdbuf + " WHERE (T1.Invd_RegionalId = ? and T1.Invd_CentroCostoId = ? and T1.Invd_ModuloAlmacen = ? and T1.Invd_AlmacenCodigo = ? and T1.Invd_BodegaCodigo = ? and T1.Cuen_Identificacion = ? and T1.Invd_Estado = 'R')" ;
      scmdbuf = scmdbuf + " and (T2.Tipo_Codigo = ?)" ;
      if ( ! (GXutil.strcmp("", AV20cInvd_NumeroPlaca)==0) )
      {
         sWhereString = sWhereString + " and (T1.Invd_NumeroPlaca like ?)" ;
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21cInvd_PlacaPadre)==0) )
      {
         sWhereString = sWhereString + " and (T1.Invd_PlacaPadre like ?)" ;
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13cElem_Consecutivo)==0) )
      {
         sWhereString = sWhereString + " and (T1.Elem_Consecutivo like ?)" ;
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV18cInvd_FechaAdquisicion) )
      {
         sWhereString = sWhereString + " and (T1.Invd_FechaAdquisicion = ?)" ;
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY T1.Invd_RegionalId, T1.Invd_CentroCostoId, T1.Invd_ModuloAlmacen, T1.Invd_AlmacenCodigo, T1.Invd_BodegaCodigo, T1.Cuen_Identificacion, T1.Invd_Estado, T1.Invd_NumeroPlaca" ;
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
                  return conditional_H007R2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() , ((Number) dynConstraints[13]).longValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).longValue() , ((Number) dynConstraints[18]).longValue() , ((Number) dynConstraints[19]).longValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).longValue() , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H007R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11,0,false )
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
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(10) ;
               ((long[]) buf[12])[0] = rslt.getLong(11) ;
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(13) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(14) ;
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(15,2) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(16, 2) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,2) ;
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
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[16]).longValue(), 0);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, ((Number) parms[17]).longValue(), 0);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 9);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               return;
      }
   }

}

