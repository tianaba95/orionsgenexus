/*
               File: selinvenconsumo_impl
        Description: Seleccionar Inventario de Consumo
             Author: GeneXus Java Generator version 15_0_4-113785
       Generated on: June 14, 2018 14:21:6.13
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

public final  class selinvenconsumo_impl extends GXDataArea
{
   public selinvenconsumo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public selinvenconsumo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( selinvenconsumo_impl.class ));
   }

   public selinvenconsumo_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
         {
            nRC_GXsfl_67 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            nGXsfl_67_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            sGXsfl_67_idx = httpContext.GetNextPar( ) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxnrgrid2_newrow( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid2") == 0 )
         {
            subGrid2_Rows = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxgrgrid2_refresh( subGrid2_Rows) ;
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
            AV10Regi_Id = GXutil.lval( gxfirstwebparm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Regi_Id", GXutil.ltrim( GXutil.str( AV10Regi_Id, 11, 0)));
            httpContext.ajax_rsp_assign_attri("", false, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Regi_Id), "ZZZZZZZZZZ9")));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV20cCent_Id = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20cCent_Id", GXutil.ltrim( GXutil.str( AV20cCent_Id, 11, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20cCent_Id), "ZZZZZZZZZZ9")));
               AV17cAlma_Modulo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17cAlma_Modulo", AV17cAlma_Modulo);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17cAlma_Modulo, ""))));
               AV16cAlma_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16cAlma_Codigo", AV16cAlma_Codigo);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16cAlma_Codigo, ""))));
               AV18cBode_Codigo = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18cBode_Codigo", AV18cBode_Codigo);
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCBODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18cBode_Codigo, ""))));
               AV47Tran_Salida = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47Tran_Salida", GXutil.ltrim( GXutil.str( AV47Tran_Salida, 11, 0)));
               AV49Tipo_Codigo = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49Tipo_Codigo", GXutil.ltrim( GXutil.str( AV49Tipo_Codigo, 18, 0)));
               httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
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
      pa6G2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start6G2( ) ;
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
      httpContext.AddJavascriptSource("gxcfg.js", "?20186141421642");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.orions2.selinvenconsumo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20cCent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV17cAlma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16cAlma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV18cBode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV47Tran_Salida,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV49Tipo_Codigo,18,0)))+"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtinvenconsumo", AV44SDTInvenConsumo);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtinvenconsumo", AV44SDTInvenConsumo);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_67", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_67, (byte)(4), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "REGIONAL", GXutil.ltrim( localUtil.ntoc( A91Regional, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CENTRO_ID", GXutil.ltrim( localUtil.ntoc( A92Centro_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_MODULO", A27Alma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALMA_CODIGO", A28Alma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BODE_CODIGO", A31Bode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ELEM_CONSECUTIVO", A66Elem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRANS_FECHARATIFICACION", localUtil.ttoc( A709Trans_FechaRatificacion, 10, 8, 0, 0, "/", ":", " "));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vREGI_ID", GXutil.ltrim( localUtil.ntoc( AV10Regi_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCCENT_ID", GXutil.ltrim( localUtil.ntoc( AV20cCent_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCALMA_MODULO", AV17cAlma_Modulo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCALMA_CODIGO", AV16cAlma_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCBODE_CODIGO", AV18cBode_Codigo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CANTIDAD_DIPONIBLE", GXutil.ltrim( localUtil.ntoc( A618Cantidad_Diponible, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRANS_ID", GXutil.ltrim( localUtil.ntoc( A93Trans_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "NUM_LINEA", GXutil.ltrim( localUtil.ntoc( A94Num_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "CATA_DESCRIPCION", A298Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "VALOR_UNITARIO", GXutil.ltrim( localUtil.ntoc( A620Valor_Unitario, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "OTROS_COSTOS", GXutil.ltrim( localUtil.ntoc( A621Otros_Costos, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "COSTO_TOTAL", GXutil.ltrim( localUtil.ntoc( A622Costo_Total, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vOBSERVACIONES", AV35Observaciones);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_CONSECUTIVOCC", GXutil.ltrim( localUtil.ntoc( AV55Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMARCA", AV33Marca);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_ID", GXutil.ltrim( localUtil.ntoc( A46Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_ID", GXutil.ltrim( localUtil.ntoc( AV11Tran_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_CONSECUTIVO", GXutil.ltrim( localUtil.ntoc( A69TDet_Consecutivo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vNUM_LINEA", GXutil.ltrim( localUtil.ntoc( AV8Num_Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_LISTID", GXutil.ltrim( localUtil.ntoc( A70TDet_ListId, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TDET_VALORATRIBUTO", A494TDet_ValorAtributo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSERIAL", AV46Serial);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vMODELO", AV34Modelo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRAN_CONSECUTIVOCC", GXutil.ltrim( localUtil.ntoc( A513Tran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPTIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( AV50pTipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vPELEM_CONSECUTIVO", AV41pElem_Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( A33Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCATA_DESCRIPCION", AV6Cata_Descripcion);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCANTIDAD_DIPONIBLE", GXutil.ltrim( localUtil.ntoc( AV5Cantidad_Diponible, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vFECHA", localUtil.dtoc( AV31Fecha, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUNIMED_COD", GXutil.ltrim( localUtil.ntoc( AV12UNIMED_COD, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vUNIMED_DES", AV13UNIMED_DES);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vVALOR_UNITARIO", GXutil.ltrim( localUtil.ntoc( AV14Valor_Unitario, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vOTROS_COSTOS", GXutil.ltrim( localUtil.ntoc( AV9Otros_Costos, (byte)(18), (byte)(2), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCOSTO_TOTAL", GXutil.ltrim( localUtil.ntoc( AV7Costo_Total, (byte)(18), (byte)(2), ",", "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTINVENCONSUMO", AV44SDTInvenConsumo);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTINVENCONSUMO", AV44SDTInvenConsumo);
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "UNIMED_COD", GXutil.ltrim( localUtil.ntoc( A77UNIMED_COD, (byte)(6), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "UNIMED_DES", A496UNIMED_DES);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRAN_SALIDA", GXutil.ltrim( localUtil.ntoc( AV47Tran_Salida, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vCONSECUTIVO", AV26Consecutivo);
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vVALIDAFECHA", localUtil.dtoc( AV48ValidaFecha, 0, "/"));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTRANS_ID", GXutil.ltrim( localUtil.ntoc( AV51Trans_Id, (byte)(11), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vLINEA", GXutil.ltrim( localUtil.ntoc( AV52Linea, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vSOLICITADA", GXutil.ltrim( localUtil.ntoc( AV54Solicitada, (byte)(8), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "vTIPO_CODIGO", GXutil.ltrim( localUtil.ntoc( AV49Tipo_Codigo, (byte)(18), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ",", "")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20cCent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17cAlma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16cAlma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCBODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18cBode_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Regi_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20cCent_Id), "ZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17cAlma_Modulo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16cAlma_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCBODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18cBode_Codigo, ""))));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Type", GXutil.rtrim( Alertify1_Type));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textmessage", GXutil.rtrim( Alertify1_Textmessage));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textok", GXutil.rtrim( Alertify1_Textok));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ALERTIFY1_Textcancel", GXutil.rtrim( Alertify1_Textcancel));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "ADVANCEDCONTAINER_Class", GXutil.rtrim( divAdvancedcontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "BTNTOGGLE_Class", GXutil.rtrim( bttBtntoggle_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVC_CODIGOCATALOGOFILTERCONTAINER_Class", GXutil.rtrim( divInvc_codigocatalogofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "INVC_DESCRIPCIONCATALOGOFILTERCONTAINER_Class", GXutil.rtrim( divInvc_descripcioncatalogofiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "FECHAFILTERCONTAINER_Class", GXutil.rtrim( divFechafiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "TRANSACCIONFILTERCONTAINER_Class", GXutil.rtrim( divTransaccionfiltercontainer_Class));
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "OBSERVACIONESFILTERCONTAINER_Class", GXutil.rtrim( divObservacionesfiltercontainer_Class));
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
         we6G2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt6G2( ) ;
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
      return formatLink("com.orions2.selinvenconsumo") + "?" + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV10Regi_Id,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV20cCent_Id,11,0))) + "," + GXutil.URLEncode(GXutil.rtrim(AV17cAlma_Modulo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV16cAlma_Codigo)) + "," + GXutil.URLEncode(GXutil.rtrim(AV18cBode_Codigo)) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV47Tran_Salida,11,0))) + "," + GXutil.URLEncode(GXutil.ltrim(GXutil.str(AV49Tipo_Codigo,18,0))) ;
   }

   public String getPgmname( )
   {
      return "SelInvenConsumo" ;
   }

   public String getPgmdesc( )
   {
      return "Seleccionar Inventario de Consumo" ;
   }

   public void wb6G0( )
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvc_codigocatalogofiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvc_codigocatalogofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvc_codigocatalogofilter_Internalname, "Consecutivo", "", "", lblLblinvc_codigocatalogofilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e116g1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelInvenConsumo.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_67_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCelem_consecutivo_Internalname, AV23cElem_Consecutivo, GXutil.rtrim( localUtil.format( AV23cElem_Consecutivo, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCelem_consecutivo_Jsonclick, 0, "Attribute", "", "", "", edtavCelem_consecutivo_Visible, edtavCelem_consecutivo_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "HLP_SelInvenConsumo.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divInvc_descripcioncatalogofiltercontainer_Internalname, 1, 0, "px", 0, "px", divInvc_descripcioncatalogofiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblinvc_descripcionfilter_Internalname, "Descripción del bien", "", "", lblLblinvc_descripcionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e126g1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelInvenConsumo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCcata_descripcion_Internalname, "Descripción del bien", "col-sm-3 AttributeLabel", 0, true);
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_67_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCcata_descripcion_Internalname, AV19cCata_Descripcion, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,26);\"", (short)(0), edtavCcata_descripcion_Visible, edtavCcata_descripcion_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_SelInvenConsumo.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divFechafiltercontainer_Internalname, 1, 0, "px", 0, "px", divFechafiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblfechafilter_Internalname, "Fecha de adquisición", "", "", lblLblfechafilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e136g1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelInvenConsumo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtran_fecharatificacion_Internalname, "Fecha Ratificacion", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_67_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCtran_fecharatificacion_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtran_fecharatificacion_Internalname, localUtil.format(AV28cTran_Fecharatificacion, "99/99/9999"), localUtil.format( AV28cTran_Fecharatificacion, "99/99/9999"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'DMY',0,24,'spa',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtran_fecharatificacion_Jsonclick, 0, "Attribute", "", "", "", edtavCtran_fecharatificacion_Visible, edtavCtran_fecharatificacion_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_SelInvenConsumo.htm");
         com.orions2.GxWebStd.gx_bitmap( httpContext, edtavCtran_fecharatificacion_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavCtran_fecharatificacion_Visible==0)||(edtavCtran_fecharatificacion_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "", "HLP_SelInvenConsumo.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divTransaccionfiltercontainer_Internalname, 1, 0, "px", 0, "px", divTransaccionfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLbltransaccionfilter_Internalname, "Transacción", "", "", lblLbltransaccionfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e146g1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelInvenConsumo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         com.orions2.GxWebStd.gx_label_element( httpContext, edtavCtran_consecutivocc_Internalname, "Consecutivo por Movimiento", "col-sm-3 AttributeLabel", 0, true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_67_idx + "',0)\"" ;
         com.orions2.GxWebStd.gx_single_line_edit( httpContext, edtavCtran_consecutivocc_Internalname, GXutil.ltrim( localUtil.ntoc( AV27cTran_ConsecutivoCC, (byte)(18), (byte)(0), ",", "")), ((edtavCtran_consecutivocc_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27cTran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(AV27cTran_ConsecutivoCC), "ZZZZZZZZZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCtran_consecutivocc_Jsonclick, 0, "Attribute", "", "", "", edtavCtran_consecutivocc_Visible, edtavCtran_consecutivocc_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "HLP_SelInvenConsumo.htm");
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
         com.orions2.GxWebStd.gx_div_start( httpContext, divObservacionesfiltercontainer_Internalname, 1, 0, "px", 0, "px", divObservacionesfiltercontainer_Class, "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         com.orions2.GxWebStd.gx_label_ctrl( httpContext, lblLblobservacionesfilter_Internalname, "Observaciones", "", "", lblLblobservacionesfilter_Jsonclick, "'"+""+"'"+",false,"+"'"+"e156g1_client"+"'", "", "WWAdvancedLabel WWFilterLabel", 7, "", 1, 1, (short)(1), "HLP_SelInvenConsumo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_67_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_html_textarea( httpContext, edtavCobservaciones_Internalname, AV25cObservaciones, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", (short)(0), edtavCobservaciones_Visible, edtavCobservaciones_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_SelInvenConsumo.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = bttBtntoggle_Class ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtntoggle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", "|||", bttBtntoggle_Jsonclick, 7, "|||", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e166g1_client"+"'", TempTags, "", 2, "HLP_SelInvenConsumo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid2Container.SetWrapped(nGXWrapped);
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<div id=\""+"Grid2Container"+"DivS\" data-gxgridid=\"67\">") ;
            sStyleString = "" ;
            com.orions2.GxWebStd.gx_table_start( httpContext, subGrid2_Internalname, subGrid2_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", 0);
            /* Subfile titles */
            httpContext.writeText( "<tr") ;
            httpContext.writeTextNL( ">") ;
            if ( subGrid2_Backcolorstyle == 0 )
            {
               subGrid2_Titlebackstyle = (byte)(0) ;
               if ( GXutil.len( subGrid2_Class) > 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Title" ;
               }
            }
            else
            {
               subGrid2_Titlebackstyle = (byte)(1) ;
               if ( subGrid2_Backcolorstyle == 1 )
               {
                  subGrid2_Titlebackcolor = subGrid2_Allbackcolor ;
                  if ( GXutil.len( subGrid2_Class) > 0 )
                  {
                     subGrid2_Linesclass = subGrid2_Class+"UniformTitle" ;
                  }
               }
               else
               {
                  if ( GXutil.len( subGrid2_Class) > 0 )
                  {
                     subGrid2_Linesclass = subGrid2_Class+"Title" ;
                  }
               }
            }
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Trans.") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Fecha") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Consec.") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Bien") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 100, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Observaciones") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Marca") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Modelo") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrim( GXutil.str( 60, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Unidad") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "V.Unitario") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Otros Costos") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Total") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Disponible") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrim( GXutil.str( 80, 4, 0))+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
            httpContext.writeValue( "Solicitada") ;
            httpContext.writeTextNL( "</th>") ;
            httpContext.writeTextNL( "</tr>") ;
            Grid2Container.AddObjectProperty("GridName", "Grid2");
         }
         else
         {
            Grid2Container.AddObjectProperty("GridName", "Grid2");
            Grid2Container.AddObjectProperty("Class", "WorkWith");
            Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("CmpContext", "");
            Grid2Container.AddObjectProperty("InMasterPage", "false");
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtltran_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlfecha_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlelem_consecutivo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcata_descripcion_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlobservaciones_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlmarca_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlmodelo_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlunidadmedida_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlvalor_unitario_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlotros_costos_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcosto_total_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlcantidaddisponible_Enabled, (byte)(5), (byte)(0), ".", "")));
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
            Grid2Container.AddColumnProperties(Grid2Column);
            Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
            Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
         }
      }
      if ( wbEnd == 67 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_67 = (short)(nGXsfl_67_idx-1) ;
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid2Container.AddObjectProperty("GRID2_nEOF", GRID2_nEOF);
            Grid2Container.AddObjectProperty("GRID2_nFirstRecordOnPage", GRID2_nFirstRecordOnPage);
            AV58GXV1 = nGXsfl_67_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid2Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid2", Grid2Container);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData", Grid2Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V", Grid2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V"+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "BtnAdd" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttAgregar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", "Agregar bienes", bttAgregar_Jsonclick, 5, "Agregar bienes", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'AGREGAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SelInvenConsumo.htm");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         com.orions2.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         com.orions2.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 67, 2, 0)+","+"null"+");", "Cancelar", bttBtn_cancel_Jsonclick, 1, "Cancelar", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SelInvenConsumo.htm");
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
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         com.orions2.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start6G2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 15_0_4-113785", (short)(0)) ;
         Form.getMeta().addItem("description", "Seleccionar Inventario de Consumo", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup6G0( ) ;
   }

   public void ws6G2( )
   {
      start6G2( ) ;
      evt6G2( ) ;
   }

   public void evt6G2( )
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
                        else if ( GXutil.strcmp(sEvt, "VCELEM_CONSECUTIVO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e176G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCCATA_DESCRIPCION.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e186G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCTRAN_FECHARATIFICACION.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e196G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCTRAN_CONSECUTIVOCC.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e206G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCOBSERVACIONES.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e216G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'AGREGAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Agregar' */
                           e226G2 ();
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID2PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID2PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid2_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid2_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid2_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid2_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID2.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_67_idx = (short)(GXutil.lval( sEvtType)) ;
                           sGXsfl_67_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_67_idx, 4, 0)), (short)(4), "0") ;
                           subsflControlProps_672( ) ;
                           AV58GXV1 = (short)(nGXsfl_67_idx+GRID2_nFirstRecordOnPage) ;
                           if ( ( AV44SDTInvenConsumo.size() >= AV58GXV1 ) && ( AV58GXV1 > 0 ) )
                           {
                              AV44SDTInvenConsumo.currentItem( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)) );
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
                                 e236G2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID2.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e246G2 ();
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

   public void we6G2( )
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

   public void pa6G2( )
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

   public void gxnrgrid2_newrow( )
   {
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_672( ) ;
      while ( nGXsfl_67_idx <= nRC_GXsfl_67 )
      {
         sendrow_672( ) ;
         nGXsfl_67_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_67_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_67_idx+1)) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_67_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_672( ) ;
      }
      httpContext.GX_webresponse.addString(Grid2Container.ToJavascriptSource());
      /* End function gxnrGrid2_newrow */
   }

   public void gxgrgrid2_refresh( int subGrid2_Rows )
   {
      initialize_formulas( ) ;
      com.orions2.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subGrid2_Rows = subGrid2_Rows ;
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_Rows", GXutil.ltrim( localUtil.ntoc( subGrid2_Rows, (byte)(6), (byte)(0), ".", "")));
      GRID2_nCurrentRecord = 0 ;
      rf6G2( ) ;
      /* End function gxgrGrid2_refresh */
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
      rf6G2( ) ;
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtltran_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltran_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltran_consecutivo_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlfecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlfecha_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlfecha_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlelem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlelem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlelem_consecutivo_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcata_descripcion_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlobservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlobservaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlobservaciones_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlmarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlmarca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlmarca_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlmodelo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlmodelo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlmodelo_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlunidadmedida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlunidadmedida_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlunidadmedida_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlvalor_unitario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalor_unitario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlvalor_unitario_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlotros_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlotros_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlotros_costos_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlcosto_total_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcosto_total_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcosto_total_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlcantidaddisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcantidaddisponible_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcantidaddisponible_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
   }

   public void rf6G2( )
   {
      initialize_formulas( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid2Container.ClearRows();
      }
      wbStart = (short)(67) ;
      nGXsfl_67_idx = (short)(1) ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_67_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_672( ) ;
      bGXsfl_67_Refreshing = true ;
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Container.AddObjectProperty("Class", "WorkWith");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.setPageSize( subgrid2_recordsperpage( ) );
      fix_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_672( ) ;
         e246G2 ();
         if ( ( GRID2_nCurrentRecord > 0 ) && ( GRID2_nGridOutOfScope == 0 ) && ( nGXsfl_67_idx == 1 ) )
         {
            GRID2_nCurrentRecord = 0 ;
            GRID2_nGridOutOfScope = 1 ;
            subgrid2_firstpage( ) ;
            e246G2 ();
         }
         wbEnd = (short)(67) ;
         wb6G0( ) ;
      }
      bGXsfl_67_Refreshing = true ;
   }

   public int subgrid2_pagecount( )
   {
      GRID2_nRecordCount = subgrid2_recordcount( ) ;
      if ( ((int)((GRID2_nRecordCount) % (subgrid2_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID2_nRecordCount/ (double) (subgrid2_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID2_nRecordCount/ (double) (subgrid2_recordsperpage( )))+1) ;
   }

   public int subgrid2_recordcount( )
   {
      return AV44SDTInvenConsumo.size() ;
   }

   public int subgrid2_recordsperpage( )
   {
      return 8*1 ;
   }

   public int subgrid2_currentpage( )
   {
      return (int)(GXutil.Int( GRID2_nFirstRecordOnPage/ (double) (subgrid2_recordsperpage( )))+1) ;
   }

   public short subgrid2_firstpage( )
   {
      GRID2_nFirstRecordOnPage = 0 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid2_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid2_nextpage( )
   {
      GRID2_nRecordCount = subgrid2_recordcount( ) ;
      if ( ( GRID2_nRecordCount >= subgrid2_recordsperpage( ) ) && ( GRID2_nEOF == 0 ) )
      {
         GRID2_nFirstRecordOnPage = (long)(GRID2_nFirstRecordOnPage+subgrid2_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid2_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("GRID2_nFirstRecordOnPage", GRID2_nFirstRecordOnPage);
      return (short)(((GRID2_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid2_previouspage( )
   {
      if ( GRID2_nFirstRecordOnPage >= subgrid2_recordsperpage( ) )
      {
         GRID2_nFirstRecordOnPage = (long)(GRID2_nFirstRecordOnPage-subgrid2_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid2_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public short subgrid2_lastpage( )
   {
      GRID2_nRecordCount = subgrid2_recordcount( ) ;
      if ( GRID2_nRecordCount > subgrid2_recordsperpage( ) )
      {
         if ( ((int)((GRID2_nRecordCount) % (subgrid2_recordsperpage( )))) == 0 )
         {
            GRID2_nFirstRecordOnPage = (long)(GRID2_nRecordCount-subgrid2_recordsperpage( )) ;
         }
         else
         {
            GRID2_nFirstRecordOnPage = (long)(GRID2_nRecordCount-((int)((GRID2_nRecordCount) % (subgrid2_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid2_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return (short)(0) ;
   }

   public int subgrid2_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID2_nFirstRecordOnPage = (long)(subgrid2_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid2_refresh( subGrid2_Rows) ;
      }
      com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      return 0 ;
   }

   public void strup6G0( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      edtavCtltran_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtltran_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtltran_consecutivo_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlfecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlfecha_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlfecha_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlelem_consecutivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlelem_consecutivo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlelem_consecutivo_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlcata_descripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcata_descripcion_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcata_descripcion_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlobservaciones_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlobservaciones_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlobservaciones_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlmarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlmarca_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlmarca_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlmodelo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlmodelo_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlmodelo_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlunidadmedida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlunidadmedida_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlunidadmedida_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlvalor_unitario_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlvalor_unitario_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlvalor_unitario_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlotros_costos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlotros_costos_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlotros_costos_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlcosto_total_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcosto_total_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcosto_total_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      edtavCtlcantidaddisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCtlcantidaddisponible_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtavCtlcantidaddisponible_Enabled, 5, 0)), !bGXsfl_67_Refreshing);
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e236G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtinvenconsumo"), AV44SDTInvenConsumo);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTINVENCONSUMO"), AV44SDTInvenConsumo);
         /* Read variables values. */
         AV23cElem_Consecutivo = httpContext.cgiGet( edtavCelem_consecutivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23cElem_Consecutivo", AV23cElem_Consecutivo);
         AV19cCata_Descripcion = GXutil.upper( httpContext.cgiGet( edtavCcata_descripcion_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19cCata_Descripcion", AV19cCata_Descripcion);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCtran_fecharatificacion_Internalname), (byte)(0), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCTRAN_FECHARATIFICACION");
            GX_FocusControl = edtavCtran_fecharatificacion_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28cTran_Fecharatificacion = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28cTran_Fecharatificacion", localUtil.format(AV28cTran_Fecharatificacion, "99/99/9999"));
         }
         else
         {
            AV28cTran_Fecharatificacion = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavCtran_fecharatificacion_Internalname), 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28cTran_Fecharatificacion", localUtil.format(AV28cTran_Fecharatificacion, "99/99/9999"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_consecutivocc_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCtran_consecutivocc_Internalname), ",", ".") > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCTRAN_CONSECUTIVOCC");
            GX_FocusControl = edtavCtran_consecutivocc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27cTran_ConsecutivoCC = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27cTran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV27cTran_ConsecutivoCC, 18, 0)));
         }
         else
         {
            AV27cTran_ConsecutivoCC = localUtil.ctol( httpContext.cgiGet( edtavCtran_consecutivocc_Internalname), ",", ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27cTran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV27cTran_ConsecutivoCC, 18, 0)));
         }
         AV25cObservaciones = httpContext.cgiGet( edtavCobservaciones_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25cObservaciones", AV25cObservaciones);
         /* Read saved values. */
         nRC_GXsfl_67 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_67"), ",", ".")) ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID2_nFirstRecordOnPage"), ",", ".") ;
         GRID2_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID2_nEOF"), ",", ".")) ;
         Alertify1_Type = httpContext.cgiGet( "ALERTIFY1_Type") ;
         Alertify1_Textmessage = httpContext.cgiGet( "ALERTIFY1_Textmessage") ;
         Alertify1_Textok = httpContext.cgiGet( "ALERTIFY1_Textok") ;
         Alertify1_Textcancel = httpContext.cgiGet( "ALERTIFY1_Textcancel") ;
         nRC_GXsfl_67 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_67"), ",", ".")) ;
         nGXsfl_67_fel_idx = (short)(0) ;
         while ( nGXsfl_67_fel_idx < nRC_GXsfl_67 )
         {
            nGXsfl_67_fel_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_67_fel_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_67_fel_idx+1)) ;
            sGXsfl_67_fel_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_67_fel_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_fel_672( ) ;
            AV58GXV1 = (short)(nGXsfl_67_fel_idx+GRID2_nFirstRecordOnPage) ;
            if ( ( AV44SDTInvenConsumo.size() >= AV58GXV1 ) && ( AV58GXV1 > 0 ) )
            {
               AV44SDTInvenConsumo.currentItem( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)) );
            }
         }
         if ( nGXsfl_67_fel_idx == 0 )
         {
            nGXsfl_67_idx = (short)(1) ;
            sGXsfl_67_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_67_idx, 4, 0)), (short)(4), "0") ;
            subsflControlProps_672( ) ;
         }
         nGXsfl_67_fel_idx = (short)(1) ;
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
      e236G2 ();
      if (returnInSub) return;
   }

   public void e236G2( )
   {
      /* Start Routine */
      AV15ADVANCED_LABEL_TEMPLATE = "%1 <strong>%2</strong>" ;
      AV29DescAtri = context.getHttpContext().getImagePath( "850ff938-3238-4401-bbf0-b6d9fa315c1b", "", context.getHttpContext().getTheme( )) ;
      AV72Descatri_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "850ff938-3238-4401-bbf0-b6d9fa315c1b", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      AV38Patern = "/[0-9]/" ;
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'LOAD' Routine */
      AV44SDTInvenConsumo.clear();
      gx_BV67 = true ;
      /* Using cursor H006G2 */
      pr_default.execute(0, new Object[] {new Long(AV10Regi_Id), new Long(AV20cCent_Id), AV17cAlma_Modulo, AV16cAlma_Codigo, AV18cBode_Codigo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A37Cata_Codigo = H006G2_A37Cata_Codigo[0] ;
         A91Regional = H006G2_A91Regional[0] ;
         A92Centro_Id = H006G2_A92Centro_Id[0] ;
         A27Alma_Modulo = H006G2_A27Alma_Modulo[0] ;
         A28Alma_Codigo = H006G2_A28Alma_Codigo[0] ;
         A31Bode_Codigo = H006G2_A31Bode_Codigo[0] ;
         A618Cantidad_Diponible = H006G2_A618Cantidad_Diponible[0] ;
         n618Cantidad_Diponible = H006G2_n618Cantidad_Diponible[0] ;
         A93Trans_Id = H006G2_A93Trans_Id[0] ;
         A94Num_Linea = H006G2_A94Num_Linea[0] ;
         A298Cata_Descripcion = H006G2_A298Cata_Descripcion[0] ;
         A620Valor_Unitario = H006G2_A620Valor_Unitario[0] ;
         A621Otros_Costos = H006G2_A621Otros_Costos[0] ;
         n621Otros_Costos = H006G2_n621Otros_Costos[0] ;
         A622Costo_Total = H006G2_A622Costo_Total[0] ;
         A709Trans_FechaRatificacion = H006G2_A709Trans_FechaRatificacion[0] ;
         n709Trans_FechaRatificacion = H006G2_n709Trans_FechaRatificacion[0] ;
         A66Elem_Consecutivo = H006G2_A66Elem_Consecutivo[0] ;
         A709Trans_FechaRatificacion = H006G2_A709Trans_FechaRatificacion[0] ;
         n709Trans_FechaRatificacion = H006G2_n709Trans_FechaRatificacion[0] ;
         A37Cata_Codigo = H006G2_A37Cata_Codigo[0] ;
         A298Cata_Descripcion = H006G2_A298Cata_Descripcion[0] ;
         AV41pElem_Consecutivo = A66Elem_Consecutivo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41pElem_Consecutivo", AV41pElem_Consecutivo);
         AV11Tran_Id = A93Trans_Id ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Tran_Id", GXutil.ltrim( GXutil.str( AV11Tran_Id, 11, 0)));
         AV8Num_Linea = A94Num_Linea ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Num_Linea", GXutil.ltrim( GXutil.str( AV8Num_Linea, 8, 0)));
         AV6Cata_Descripcion = A298Cata_Descripcion ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Cata_Descripcion", AV6Cata_Descripcion);
         AV5Cantidad_Diponible = A618Cantidad_Diponible ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Cantidad_Diponible", GXutil.ltrim( GXutil.str( AV5Cantidad_Diponible, 8, 0)));
         AV31Fecha = GXutil.resetTime(A709Trans_FechaRatificacion) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Fecha", localUtil.format(AV31Fecha, "99/99/9999"));
         AV14Valor_Unitario = A620Valor_Unitario ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Valor_Unitario", GXutil.ltrim( GXutil.str( AV14Valor_Unitario, 18, 2)));
         AV9Otros_Costos = A621Otros_Costos ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Otros_Costos", GXutil.ltrim( GXutil.str( AV9Otros_Costos, 18, 2)));
         AV7Costo_Total = A622Costo_Total ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Costo_Total", GXutil.ltrim( GXutil.str( AV7Costo_Total, 18, 2)));
         /* Execute user subroutine: 'ATRIBUTOS' */
         S143 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'ELEMENTO' */
         S153 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && (0==AV27cTran_ConsecutivoCC) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            /* Execute user subroutine: 'CARGA SDT' */
            S163 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && (0==AV27cTran_ConsecutivoCC) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && (0==AV27cTran_ConsecutivoCC) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && (0==AV27cTran_ConsecutivoCC) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && ( AV27cTran_ConsecutivoCC != 0 ) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && (0==AV27cTran_ConsecutivoCC) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && (0==AV27cTran_ConsecutivoCC) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && (0==AV27cTran_ConsecutivoCC) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && ( AV27cTran_ConsecutivoCC != 0 ) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && (0==AV27cTran_ConsecutivoCC) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && (0==AV27cTran_ConsecutivoCC) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && ( AV27cTran_ConsecutivoCC != 0 ) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && (0==AV27cTran_ConsecutivoCC) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && ( AV27cTran_ConsecutivoCC != 0 ) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && (0==AV27cTran_ConsecutivoCC) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && ( AV27cTran_ConsecutivoCC != 0 ) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && (0==AV27cTran_ConsecutivoCC) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && ( AV27cTran_ConsecutivoCC != 0 ) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && (0==AV27cTran_ConsecutivoCC) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && ( AV27cTran_ConsecutivoCC != 0 ) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && (0==AV27cTran_ConsecutivoCC) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && ( AV27cTran_ConsecutivoCC != 0 ) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && ( AV27cTran_ConsecutivoCC != 0 ) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && ( AV27cTran_ConsecutivoCC != 0 ) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && ( AV27cTran_ConsecutivoCC != 0 ) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && (0==AV27cTran_ConsecutivoCC) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && ( AV27cTran_ConsecutivoCC != 0 ) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && ( AV27cTran_ConsecutivoCC != 0 ) && (GXutil.strcmp("", AV25cObservaciones)==0) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && (GXutil.strcmp("", AV19cCata_Descripcion)==0) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && ( AV27cTran_ConsecutivoCC != 0 ) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && ( AV27cTran_ConsecutivoCC != 0 ) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && (0==AV27cTran_ConsecutivoCC) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( (GXutil.strcmp("", AV23cElem_Consecutivo)==0) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && !( GXutil.dateCompare(AV28cTran_Fecharatificacion, GXutil.nullDate()) ) && ( AV27cTran_ConsecutivoCC != 0 ) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && (( A709Trans_FechaRatificacion.after( AV28cTran_Fecharatificacion ) ) || ( GXutil.dateCompare(A709Trans_FechaRatificacion, AV28cTran_Fecharatificacion) )) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else if ( ( GXutil.strcmp(AV23cElem_Consecutivo, "") != 0 ) && ( GXutil.strcmp(AV19cCata_Descripcion, "") != 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV28cTran_Fecharatificacion) && ( AV27cTran_ConsecutivoCC != 0 ) && ( GXutil.strcmp(AV25cObservaciones, "") != 0 ) )
         {
            if ( ( GXutil.strcmp(A66Elem_Consecutivo, AV23cElem_Consecutivo) == 0 ) && GXutil.like( GXutil.upper( A298Cata_Descripcion) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV19cCata_Descripcion), "") , 254 , "%"),  ' ' ) && ( AV55Tran_ConsecutivoCC == AV27cTran_ConsecutivoCC ) && GXutil.like( GXutil.upper( AV35Observaciones) , GXutil.padr( GXutil.concat( "%", GXutil.upper( AV25cObservaciones), "") , 254 , "%"),  ' ' ) )
            {
               /* Execute user subroutine: 'CARGA SDT' */
               S163 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void e176G2( )
   {
      AV58GXV1 = (short)(nGXsfl_67_idx+GRID2_nFirstRecordOnPage) ;
      if ( AV44SDTInvenConsumo.size() >= AV58GXV1 )
      {
         AV44SDTInvenConsumo.currentItem( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)) );
      }
      /* Celem_consecutivo_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SDTInvenConsumo", AV44SDTInvenConsumo);
      nGXsfl_67_bak_idx = nGXsfl_67_idx ;
      gxgrgrid2_refresh( subGrid2_Rows) ;
      nGXsfl_67_idx = nGXsfl_67_bak_idx ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_67_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_672( ) ;
   }

   public void e186G2( )
   {
      AV58GXV1 = (short)(nGXsfl_67_idx+GRID2_nFirstRecordOnPage) ;
      if ( AV44SDTInvenConsumo.size() >= AV58GXV1 )
      {
         AV44SDTInvenConsumo.currentItem( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)) );
      }
      /* Ccata_descripcion_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SDTInvenConsumo", AV44SDTInvenConsumo);
      nGXsfl_67_bak_idx = nGXsfl_67_idx ;
      gxgrgrid2_refresh( subGrid2_Rows) ;
      nGXsfl_67_idx = nGXsfl_67_bak_idx ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_67_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_672( ) ;
   }

   public void e196G2( )
   {
      AV58GXV1 = (short)(nGXsfl_67_idx+GRID2_nFirstRecordOnPage) ;
      if ( AV44SDTInvenConsumo.size() >= AV58GXV1 )
      {
         AV44SDTInvenConsumo.currentItem( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)) );
      }
      /* Ctran_fecharatificacion_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SDTInvenConsumo", AV44SDTInvenConsumo);
      nGXsfl_67_bak_idx = nGXsfl_67_idx ;
      gxgrgrid2_refresh( subGrid2_Rows) ;
      nGXsfl_67_idx = nGXsfl_67_bak_idx ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_67_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_672( ) ;
   }

   public void e206G2( )
   {
      AV58GXV1 = (short)(nGXsfl_67_idx+GRID2_nFirstRecordOnPage) ;
      if ( AV44SDTInvenConsumo.size() >= AV58GXV1 )
      {
         AV44SDTInvenConsumo.currentItem( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)) );
      }
      /* Ctran_consecutivocc_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SDTInvenConsumo", AV44SDTInvenConsumo);
      nGXsfl_67_bak_idx = nGXsfl_67_idx ;
      gxgrgrid2_refresh( subGrid2_Rows) ;
      nGXsfl_67_idx = nGXsfl_67_bak_idx ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_67_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_672( ) ;
   }

   public void e216G2( )
   {
      AV58GXV1 = (short)(nGXsfl_67_idx+GRID2_nFirstRecordOnPage) ;
      if ( AV44SDTInvenConsumo.size() >= AV58GXV1 )
      {
         AV44SDTInvenConsumo.currentItem( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)) );
      }
      /* Cobservaciones_Isvalid Routine */
      /* Execute user subroutine: 'LOAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SDTInvenConsumo", AV44SDTInvenConsumo);
      nGXsfl_67_bak_idx = nGXsfl_67_idx ;
      gxgrgrid2_refresh( subGrid2_Rows) ;
      nGXsfl_67_idx = nGXsfl_67_bak_idx ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_67_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_672( ) ;
   }

   public void S163( )
   {
      /* 'CARGA SDT' Routine */
      AV45SDTInvenConsumoItem = (com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)new com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem(remoteHandle, context);
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Regional( AV10Regi_Id );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Centro_id( AV20cCent_Id );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_modulo( AV17cAlma_Modulo );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Alma_codigo( AV16cAlma_Codigo );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Bode_codigo( AV18cBode_Codigo );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id( AV11Tran_Id );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo( AV41pElem_Consecutivo );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea( AV8Num_Linea );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion( AV6Cata_Descripcion );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible( AV5Cantidad_Diponible );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion( AV31Fecha );
      /* Execute user subroutine: 'BUSCACLASE' */
      S172 ();
      if (returnInSub) return;
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_cod( AV12UNIMED_COD );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des( AV13UNIMED_DES );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones( AV35Observaciones );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca( AV33Marca );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo( AV34Modelo );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Serial( AV46Serial );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario( AV14Valor_Unitario );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos( AV9Otros_Costos );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total( AV7Costo_Total );
      AV45SDTInvenConsumoItem.setgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo( AV55Tran_ConsecutivoCC );
      AV44SDTInvenConsumo.add(AV45SDTInvenConsumoItem, 0);
      gx_BV67 = true ;
   }

   public void S172( )
   {
      /* 'BUSCACLASE' Routine */
      /* Using cursor H006G3 */
      pr_default.execute(1, new Object[] {AV41pElem_Consecutivo});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A66Elem_Consecutivo = H006G3_A66Elem_Consecutivo[0] ;
         A77UNIMED_COD = H006G3_A77UNIMED_COD[0] ;
         A496UNIMED_DES = H006G3_A496UNIMED_DES[0] ;
         A496UNIMED_DES = H006G3_A496UNIMED_DES[0] ;
         AV12UNIMED_COD = A77UNIMED_COD ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12UNIMED_COD", GXutil.ltrim( GXutil.str( AV12UNIMED_COD, 6, 0)));
         AV13UNIMED_DES = A496UNIMED_DES ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13UNIMED_DES", AV13UNIMED_DES);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S143( )
   {
      /* 'ATRIBUTOS' Routine */
      AV33Marca = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Marca", AV33Marca);
      /* Using cursor H006G4 */
      pr_default.execute(2, new Object[] {new Long(AV11Tran_Id), new Integer(AV8Num_Linea)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A70TDet_ListId = H006G4_A70TDet_ListId[0] ;
         A69TDet_Consecutivo = H006G4_A69TDet_Consecutivo[0] ;
         A46Tran_Id = H006G4_A46Tran_Id[0] ;
         A494TDet_ValorAtributo = H006G4_A494TDet_ValorAtributo[0] ;
         AV33Marca = A494TDet_ValorAtributo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Marca", AV33Marca);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      AV46Serial = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Serial", AV46Serial);
      /* Using cursor H006G5 */
      pr_default.execute(3, new Object[] {new Long(AV11Tran_Id), new Integer(AV8Num_Linea)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A70TDet_ListId = H006G5_A70TDet_ListId[0] ;
         A69TDet_Consecutivo = H006G5_A69TDet_Consecutivo[0] ;
         A46Tran_Id = H006G5_A46Tran_Id[0] ;
         A494TDet_ValorAtributo = H006G5_A494TDet_ValorAtributo[0] ;
         AV46Serial = A494TDet_ValorAtributo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Serial", AV46Serial);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      AV34Modelo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Modelo", AV34Modelo);
      /* Using cursor H006G6 */
      pr_default.execute(4, new Object[] {new Long(AV11Tran_Id), new Integer(AV8Num_Linea)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A70TDet_ListId = H006G6_A70TDet_ListId[0] ;
         A69TDet_Consecutivo = H006G6_A69TDet_Consecutivo[0] ;
         A46Tran_Id = H006G6_A46Tran_Id[0] ;
         A494TDet_ValorAtributo = H006G6_A494TDet_ValorAtributo[0] ;
         AV34Modelo = A494TDet_ValorAtributo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Modelo", AV34Modelo);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      AV35Observaciones = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Observaciones", AV35Observaciones);
      /* Using cursor H006G7 */
      pr_default.execute(5, new Object[] {new Long(AV11Tran_Id), new Integer(AV8Num_Linea)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A70TDet_ListId = H006G7_A70TDet_ListId[0] ;
         A69TDet_Consecutivo = H006G7_A69TDet_Consecutivo[0] ;
         A46Tran_Id = H006G7_A46Tran_Id[0] ;
         A494TDet_ValorAtributo = H006G7_A494TDet_ValorAtributo[0] ;
         AV35Observaciones = A494TDet_ValorAtributo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Observaciones", AV35Observaciones);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      AV55Tran_ConsecutivoCC = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV55Tran_ConsecutivoCC, 18, 0)));
      /* Using cursor H006G8 */
      pr_default.execute(6, new Object[] {new Long(AV11Tran_Id)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A46Tran_Id = H006G8_A46Tran_Id[0] ;
         A513Tran_ConsecutivoCC = H006G8_A513Tran_ConsecutivoCC[0] ;
         n513Tran_ConsecutivoCC = H006G8_n513Tran_ConsecutivoCC[0] ;
         AV55Tran_ConsecutivoCC = A513Tran_ConsecutivoCC ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55Tran_ConsecutivoCC", GXutil.ltrim( GXutil.str( AV55Tran_ConsecutivoCC, 18, 0)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void e226G2( )
   {
      AV58GXV1 = (short)(nGXsfl_67_idx+GRID2_nFirstRecordOnPage) ;
      if ( AV44SDTInvenConsumo.size() >= AV58GXV1 )
      {
         AV44SDTInvenConsumo.currentItem( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)) );
      }
      /* 'Agregar' Routine */
      AV30Error = "N" ;
      AV80GXV2 = 1 ;
      while ( AV80GXV2 <= AV44SDTInvenConsumo.size() )
      {
         AV45SDTInvenConsumoItem = (com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV80GXV2));
         if ( AV45SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada() > 0 )
         {
            AV26Consecutivo = AV45SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Consecutivo", AV26Consecutivo);
            AV48ValidaFecha = AV45SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48ValidaFecha", localUtil.format(AV48ValidaFecha, "99/99/99"));
            AV51Trans_Id = AV45SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Trans_id() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51Trans_Id", GXutil.ltrim( GXutil.str( AV51Trans_Id, 11, 0)));
            AV52Linea = AV45SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Num_linea() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Linea", GXutil.ltrim( GXutil.str( AV52Linea, 8, 0)));
            AV54Solicitada = AV45SDTInvenConsumoItem.getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54Solicitada", GXutil.ltrim( GXutil.str( AV54Solicitada, 8, 0)));
            /* Execute user subroutine: 'VALIDA MAS ANTIGUO' */
            S122 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'VALIDA DISPONIBLE' */
            S132 ();
            if (returnInSub) return;
         }
         AV80GXV2 = (int)(AV80GXV2+1) ;
      }
      if ( GXutil.strcmp(AV30Error, "N") == 0 )
      {
         GXv_int1[0] = AV47Tran_Salida ;
         GXv_objcol_SdtSDTInvenConsumo_SDTInvenConsumoItem2[0] = AV44SDTInvenConsumo ;
         new com.orions2.psalidaconsumo(remoteHandle, context).execute( GXv_int1, GXv_objcol_SdtSDTInvenConsumo_SDTInvenConsumoItem2) ;
         selinvenconsumo_impl.this.AV47Tran_Salida = GXv_int1[0] ;
         AV44SDTInvenConsumo = GXv_objcol_SdtSDTInvenConsumo_SDTInvenConsumoItem2[0] ;
         gx_BV67 = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Tran_Salida", GXutil.ltrim( GXutil.str( AV47Tran_Salida, 11, 0)));
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44SDTInvenConsumo", AV44SDTInvenConsumo);
      nGXsfl_67_bak_idx = nGXsfl_67_idx ;
      gxgrgrid2_refresh( subGrid2_Rows) ;
      nGXsfl_67_idx = nGXsfl_67_bak_idx ;
      sGXsfl_67_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_67_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_672( ) ;
   }

   public void S122( )
   {
      /* 'VALIDA MAS ANTIGUO' Routine */
      /* Using cursor H006G9 */
      pr_default.execute(7, new Object[] {new Long(AV10Regi_Id), new Long(AV20cCent_Id), AV17cAlma_Modulo, AV16cAlma_Codigo, AV18cBode_Codigo, AV26Consecutivo});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A93Trans_Id = H006G9_A93Trans_Id[0] ;
         A91Regional = H006G9_A91Regional[0] ;
         A92Centro_Id = H006G9_A92Centro_Id[0] ;
         A27Alma_Modulo = H006G9_A27Alma_Modulo[0] ;
         A28Alma_Codigo = H006G9_A28Alma_Codigo[0] ;
         A31Bode_Codigo = H006G9_A31Bode_Codigo[0] ;
         A66Elem_Consecutivo = H006G9_A66Elem_Consecutivo[0] ;
         A618Cantidad_Diponible = H006G9_A618Cantidad_Diponible[0] ;
         n618Cantidad_Diponible = H006G9_n618Cantidad_Diponible[0] ;
         A709Trans_FechaRatificacion = H006G9_A709Trans_FechaRatificacion[0] ;
         n709Trans_FechaRatificacion = H006G9_n709Trans_FechaRatificacion[0] ;
         A709Trans_FechaRatificacion = H006G9_A709Trans_FechaRatificacion[0] ;
         n709Trans_FechaRatificacion = H006G9_n709Trans_FechaRatificacion[0] ;
         if ( GXutil.resetTime( A709Trans_FechaRatificacion).before( AV48ValidaFecha ) )
         {
            AV30Error = "S" ;
            Alertify1_Type = "error" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
            Alertify1_Textmessage = "Hay unidades disponibles del Consecutivo "+AV26Consecutivo+" con fecha mas antigua" ;
            httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
            this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S132( )
   {
      /* 'VALIDA DISPONIBLE' Routine */
      AV53DisponibleTRN = 0 ;
      /* Using cursor H006G10 */
      pr_default.execute(8, new Object[] {new Long(AV10Regi_Id), new Long(AV20cCent_Id), AV17cAlma_Modulo, AV16cAlma_Codigo, AV18cBode_Codigo, new Long(AV51Trans_Id), AV26Consecutivo, new Integer(AV52Linea)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A94Num_Linea = H006G10_A94Num_Linea[0] ;
         A66Elem_Consecutivo = H006G10_A66Elem_Consecutivo[0] ;
         A93Trans_Id = H006G10_A93Trans_Id[0] ;
         A31Bode_Codigo = H006G10_A31Bode_Codigo[0] ;
         A28Alma_Codigo = H006G10_A28Alma_Codigo[0] ;
         A27Alma_Modulo = H006G10_A27Alma_Modulo[0] ;
         A92Centro_Id = H006G10_A92Centro_Id[0] ;
         A91Regional = H006G10_A91Regional[0] ;
         A618Cantidad_Diponible = H006G10_A618Cantidad_Diponible[0] ;
         n618Cantidad_Diponible = H006G10_n618Cantidad_Diponible[0] ;
         AV53DisponibleTRN = A618Cantidad_Diponible ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      if ( AV54Solicitada > AV53DisponibleTRN )
      {
         Alertify1_Type = "error" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "Type", Alertify1_Type);
         Alertify1_Textmessage = "La cantidad solicitada del consecutivo "+AV26Consecutivo+" es mayor a la cantidad disponible actual" ;
         httpContext.ajax_rsp_assign_uc_prop("", false, Alertify1_Internalname, "TextMessage", Alertify1_Textmessage);
         this.executeUsercontrolMethod("", false, "ALERTIFY1Container", "Message", "", new Object[] {});
         AV30Error = "S" ;
         /* Execute user subroutine: 'LOAD' */
         S112 ();
         if (returnInSub) return;
      }
   }

   public void S153( )
   {
      /* 'ELEMENTO' Routine */
      AV50pTipo_Codigo = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50pTipo_Codigo", GXutil.ltrim( GXutil.str( AV50pTipo_Codigo, 18, 0)));
      /* Using cursor H006G11 */
      pr_default.execute(9, new Object[] {AV41pElem_Consecutivo});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A66Elem_Consecutivo = H006G11_A66Elem_Consecutivo[0] ;
         A33Tipo_Codigo = H006G11_A33Tipo_Codigo[0] ;
         AV50pTipo_Codigo = A33Tipo_Codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50pTipo_Codigo", GXutil.ltrim( GXutil.str( AV50pTipo_Codigo, 18, 0)));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   private void e246G2( )
   {
      /* Grid2_Load Routine */
      AV58GXV1 = (short)(1) ;
      while ( AV58GXV1 <= AV44SDTInvenConsumo.size() )
      {
         AV44SDTInvenConsumo.currentItem( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(67) ;
         }
         if ( ( subGrid2_Islastpage == 1 ) || ( 8 == 0 ) || ( ( GRID2_nCurrentRecord >= GRID2_nFirstRecordOnPage ) && ( GRID2_nCurrentRecord < GRID2_nFirstRecordOnPage + subgrid2_recordsperpage( ) ) ) )
         {
            sendrow_672( ) ;
            GRID2_nEOF = (byte)(0) ;
            com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID2_nCurrentRecord + 1 >= subgrid2_recordcount( ) )
            {
               GRID2_nEOF = (byte)(1) ;
               com.orions2.GxWebStd.gx_hidden_field( httpContext, "GRID2_nEOF", GXutil.ltrim( localUtil.ntoc( GRID2_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID2_nCurrentRecord = (long)(GRID2_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_67_Refreshing )
         {
            httpContext.doAjaxLoad(67, Grid2Row);
         }
         AV58GXV1 = (short)(AV58GXV1+1) ;
      }
   }

   public void setparameters( Object[] obj )
   {
      AV10Regi_Id = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Regi_Id", GXutil.ltrim( GXutil.str( AV10Regi_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vREGI_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Regi_Id), "ZZZZZZZZZZ9")));
      AV20cCent_Id = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20cCent_Id", GXutil.ltrim( GXutil.str( AV20cCent_Id, 11, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCCENT_ID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20cCent_Id), "ZZZZZZZZZZ9")));
      AV17cAlma_Modulo = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17cAlma_Modulo", AV17cAlma_Modulo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCALMA_MODULO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17cAlma_Modulo, ""))));
      AV16cAlma_Codigo = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16cAlma_Codigo", AV16cAlma_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCALMA_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16cAlma_Codigo, ""))));
      AV18cBode_Codigo = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18cBode_Codigo", AV18cBode_Codigo);
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vCBODE_CODIGO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18cBode_Codigo, ""))));
      AV47Tran_Salida = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Tran_Salida", GXutil.ltrim( GXutil.str( AV47Tran_Salida, 11, 0)));
      AV49Tipo_Codigo = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Tipo_Codigo", GXutil.ltrim( GXutil.str( AV49Tipo_Codigo, 18, 0)));
      httpContext.ajax_rsp_assign_attri("", false, "gxhash_vTIPO_CODIGO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49Tipo_Codigo), "ZZZZZZZZZZZZZZZZZ9")));
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
      pa6G2( ) ;
      ws6G2( ) ;
      we6G2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20186141421917");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.spa.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 113785));
      httpContext.AddJavascriptSource("selinvenconsumo.js", "?20186141421917");
      httpContext.AddJavascriptSource("Shared/jquery/jquery-1.9.0.js", "");
      httpContext.AddJavascriptSource("Alertify/js/alertify.min.js", "");
      httpContext.AddJavascriptSource("Alertify/GlobalAlerts.js", "");
      httpContext.AddJavascriptSource("Alertify/AlertifyRender.js", "");
      /* End function include_jscripts */
   }

   public void subsflControlProps_672( )
   {
      edtavCtltran_consecutivo_Internalname = "CTLTRAN_CONSECUTIVO_"+sGXsfl_67_idx ;
      edtavCtlfecha_Internalname = "CTLFECHA_"+sGXsfl_67_idx ;
      edtavCtlelem_consecutivo_Internalname = "CTLELEM_CONSECUTIVO_"+sGXsfl_67_idx ;
      edtavCtlcata_descripcion_Internalname = "CTLCATA_DESCRIPCION_"+sGXsfl_67_idx ;
      edtavCtlobservaciones_Internalname = "CTLOBSERVACIONES_"+sGXsfl_67_idx ;
      edtavCtlmarca_Internalname = "CTLMARCA_"+sGXsfl_67_idx ;
      edtavCtlmodelo_Internalname = "CTLMODELO_"+sGXsfl_67_idx ;
      edtavCtlunidadmedida_Internalname = "CTLUNIDADMEDIDA_"+sGXsfl_67_idx ;
      edtavCtlvalor_unitario_Internalname = "CTLVALOR_UNITARIO_"+sGXsfl_67_idx ;
      edtavCtlotros_costos_Internalname = "CTLOTROS_COSTOS_"+sGXsfl_67_idx ;
      edtavCtlcosto_total_Internalname = "CTLCOSTO_TOTAL_"+sGXsfl_67_idx ;
      edtavCtlcantidaddisponible_Internalname = "CTLCANTIDADDISPONIBLE_"+sGXsfl_67_idx ;
      edtavCtlcantidad_solicitada_Internalname = "CTLCANTIDAD_SOLICITADA_"+sGXsfl_67_idx ;
   }

   public void subsflControlProps_fel_672( )
   {
      edtavCtltran_consecutivo_Internalname = "CTLTRAN_CONSECUTIVO_"+sGXsfl_67_fel_idx ;
      edtavCtlfecha_Internalname = "CTLFECHA_"+sGXsfl_67_fel_idx ;
      edtavCtlelem_consecutivo_Internalname = "CTLELEM_CONSECUTIVO_"+sGXsfl_67_fel_idx ;
      edtavCtlcata_descripcion_Internalname = "CTLCATA_DESCRIPCION_"+sGXsfl_67_fel_idx ;
      edtavCtlobservaciones_Internalname = "CTLOBSERVACIONES_"+sGXsfl_67_fel_idx ;
      edtavCtlmarca_Internalname = "CTLMARCA_"+sGXsfl_67_fel_idx ;
      edtavCtlmodelo_Internalname = "CTLMODELO_"+sGXsfl_67_fel_idx ;
      edtavCtlunidadmedida_Internalname = "CTLUNIDADMEDIDA_"+sGXsfl_67_fel_idx ;
      edtavCtlvalor_unitario_Internalname = "CTLVALOR_UNITARIO_"+sGXsfl_67_fel_idx ;
      edtavCtlotros_costos_Internalname = "CTLOTROS_COSTOS_"+sGXsfl_67_fel_idx ;
      edtavCtlcosto_total_Internalname = "CTLCOSTO_TOTAL_"+sGXsfl_67_fel_idx ;
      edtavCtlcantidaddisponible_Internalname = "CTLCANTIDADDISPONIBLE_"+sGXsfl_67_fel_idx ;
      edtavCtlcantidad_solicitada_Internalname = "CTLCANTIDAD_SOLICITADA_"+sGXsfl_67_fel_idx ;
   }

   public void sendrow_672( )
   {
      subsflControlProps_672( ) ;
      wb6G0( ) ;
      if ( ( 8 * 1 == 0 ) || ( nGXsfl_67_idx <= subgrid2_recordsperpage( ) * 1 ) )
      {
         Grid2Row = GXWebRow.GetNew(context,Grid2Container) ;
         if ( subGrid2_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid2_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
         else if ( subGrid2_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid2_Backstyle = (byte)(0) ;
            subGrid2_Backcolor = subGrid2_Allbackcolor ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
            }
         }
         else if ( subGrid2_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid2_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
            subGrid2_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid2_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid2_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_67_idx) % (2))) == 0 )
            {
               subGrid2_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Even" ;
               }
            }
            else
            {
               subGrid2_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
               {
                  subGrid2_Linesclass = subGrid2_Class+"Odd" ;
               }
            }
         }
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_67_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtltran_consecutivo_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo(), (byte)(18), (byte)(0), ",", "")),((edtavCtltran_consecutivo_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo()), "ZZZZZZZZZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo()), "ZZZZZZZZZZZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtltran_consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtltran_consecutivo_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(18),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlfecha_Internalname,localUtil.format(((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion(), "99/99/9999"),localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion(), "99/99/9999"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlfecha_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlfecha_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlelem_consecutivo_Internalname,((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlelem_consecutivo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlelem_consecutivo_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(9),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcata_descripcion_Internalname,((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion(),GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcata_descripcion_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlcata_descripcion_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlobservaciones_Internalname,((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlobservaciones_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlobservaciones_Enabled),new Integer(0),"text","",new Integer(100),"px",new Integer(17),"px",new Integer(500),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlmarca_Internalname,((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlmarca_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlmarca_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlmodelo_Internalname,((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlmodelo_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlmodelo_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(50),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlunidadmedida_Internalname,((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des(),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlunidadmedida_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlunidadmedida_Enabled),new Integer(0),"text","",new Integer(60),"px",new Integer(17),"px",new Integer(200),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left",new Boolean(true)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlvalor_unitario_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario(), (byte)(24), (byte)(2), ",", "")),((edtavCtlvalor_unitario_Enabled!=0) ? GXutil.ltrim( localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario(), "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario(), "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlvalor_unitario_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlvalor_unitario_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlotros_costos_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos(), (byte)(24), (byte)(2), ",", "")),((edtavCtlotros_costos_Enabled!=0) ? GXutil.ltrim( localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos(), "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos(), "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlotros_costos_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlotros_costos_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcosto_total_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total(), (byte)(24), (byte)(2), ",", "")),((edtavCtlcosto_total_Enabled!=0) ? GXutil.ltrim( localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total(), "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")) : localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total(), "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcosto_total_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlcosto_total_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(24),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcantidaddisponible_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible(), (byte)(8), (byte)(0), ",", "")),((edtavCtlcantidaddisponible_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible()), "ZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible()), "ZZZZZZZ9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcantidaddisponible_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(edtavCtlcantidaddisponible_Enabled),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         /* Subfile cell */
         if ( Grid2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCtlcantidad_solicitada_Enabled!=0)&&(edtavCtlcantidad_solicitada_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_67_idx+"',67)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlcantidad_solicitada_Internalname,GXutil.ltrim( localUtil.ntoc( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada(), (byte)(8), (byte)(0), ",", "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_solicitada()), "ZZZZZZZZ")),TempTags+((edtavCtlcantidad_solicitada_Enabled!=0)&&(edtavCtlcantidad_solicitada_Visible!=0) ? " onchange=\"gx.evt.onchange(this)\" " : " ")+((edtavCtlcantidad_solicitada_Enabled!=0)&&(edtavCtlcantidad_solicitada_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,80);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCtlcantidad_solicitada_Jsonclick,new Integer(0),"Attribute","",ROClassString,"WWColumn",new Integer(-1),new Integer(1),new Integer(0),"text","",new Integer(80),"px",new Integer(17),"px",new Integer(8),new Integer(0),new Integer(0),new Integer(67),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"","right",new Boolean(false)});
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLTRAN_CONSECUTIVO"+"_"+sGXsfl_67_idx, getSecureSignedToken( sGXsfl_67_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_consecutivo()), "ZZZZZZZZZZZZZZZZZ9")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLFECHA"+"_"+sGXsfl_67_idx, getSecureSignedToken( sGXsfl_67_idx, ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Tran_fecharatificacion()));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLELEM_CONSECUTIVO"+"_"+sGXsfl_67_idx, getSecureSignedToken( sGXsfl_67_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Elem_consecutivo(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCATA_DESCRIPCION"+"_"+sGXsfl_67_idx, getSecureSignedToken( sGXsfl_67_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cata_descripcion(), "@!"))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLOBSERVACIONES"+"_"+sGXsfl_67_idx, getSecureSignedToken( sGXsfl_67_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Observaciones(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLMARCA"+"_"+sGXsfl_67_idx, getSecureSignedToken( sGXsfl_67_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Marca(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLMODELO"+"_"+sGXsfl_67_idx, getSecureSignedToken( sGXsfl_67_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Modelo(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLUNIDADMEDIDA"+"_"+sGXsfl_67_idx, getSecureSignedToken( sGXsfl_67_idx, GXutil.rtrim( localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Unimed_des(), ""))));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLVALOR_UNITARIO"+"_"+sGXsfl_67_idx, getSecureSignedToken( sGXsfl_67_idx, localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Valor_unitario(), "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLOTROS_COSTOS"+"_"+sGXsfl_67_idx, getSecureSignedToken( sGXsfl_67_idx, localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Otros_costos(), "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCOSTO_TOTAL"+"_"+sGXsfl_67_idx, getSecureSignedToken( sGXsfl_67_idx, localUtil.format( ((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Costo_total(), "$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99")));
         com.orions2.GxWebStd.gx_hidden_field( httpContext, "gxhash_CTLCANTIDADDISPONIBLE"+"_"+sGXsfl_67_idx, getSecureSignedToken( sGXsfl_67_idx, localUtil.format( DecimalUtil.doubleToDec(((com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem)AV44SDTInvenConsumo.elementAt(-1+AV58GXV1)).getgxTv_SdtSDTInvenConsumo_SDTInvenConsumoItem_Cantidad_diponible()), "ZZZZZZZ9")));
         Grid2Container.AddRow(Grid2Row);
         nGXsfl_67_idx = (short)(((subGrid2_Islastpage==1)&&(nGXsfl_67_idx+1>subgrid2_recordsperpage( )) ? 1 : nGXsfl_67_idx+1)) ;
         sGXsfl_67_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_67_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_672( ) ;
      }
      /* End function sendrow_672 */
   }

   public void init_default_properties( )
   {
      lblLblinvc_codigocatalogofilter_Internalname = "LBLINVC_CODIGOCATALOGOFILTER" ;
      edtavCelem_consecutivo_Internalname = "vCELEM_CONSECUTIVO" ;
      divInvc_codigocatalogofiltercontainer_Internalname = "INVC_CODIGOCATALOGOFILTERCONTAINER" ;
      lblLblinvc_descripcionfilter_Internalname = "LBLINVC_DESCRIPCIONFILTER" ;
      edtavCcata_descripcion_Internalname = "vCCATA_DESCRIPCION" ;
      divInvc_descripcioncatalogofiltercontainer_Internalname = "INVC_DESCRIPCIONCATALOGOFILTERCONTAINER" ;
      lblLblfechafilter_Internalname = "LBLFECHAFILTER" ;
      edtavCtran_fecharatificacion_Internalname = "vCTRAN_FECHARATIFICACION" ;
      divFechafiltercontainer_Internalname = "FECHAFILTERCONTAINER" ;
      lblLbltransaccionfilter_Internalname = "LBLTRANSACCIONFILTER" ;
      edtavCtran_consecutivocc_Internalname = "vCTRAN_CONSECUTIVOCC" ;
      divTransaccionfiltercontainer_Internalname = "TRANSACCIONFILTERCONTAINER" ;
      lblLblobservacionesfilter_Internalname = "LBLOBSERVACIONESFILTER" ;
      edtavCobservaciones_Internalname = "vCOBSERVACIONES" ;
      divObservacionesfiltercontainer_Internalname = "OBSERVACIONESFILTERCONTAINER" ;
      divAdvancedcontainer_Internalname = "ADVANCEDCONTAINER" ;
      bttBtntoggle_Internalname = "BTNTOGGLE" ;
      edtavCtltran_consecutivo_Internalname = "CTLTRAN_CONSECUTIVO" ;
      edtavCtlfecha_Internalname = "CTLFECHA" ;
      edtavCtlelem_consecutivo_Internalname = "CTLELEM_CONSECUTIVO" ;
      edtavCtlcata_descripcion_Internalname = "CTLCATA_DESCRIPCION" ;
      edtavCtlobservaciones_Internalname = "CTLOBSERVACIONES" ;
      edtavCtlmarca_Internalname = "CTLMARCA" ;
      edtavCtlmodelo_Internalname = "CTLMODELO" ;
      edtavCtlunidadmedida_Internalname = "CTLUNIDADMEDIDA" ;
      edtavCtlvalor_unitario_Internalname = "CTLVALOR_UNITARIO" ;
      edtavCtlotros_costos_Internalname = "CTLOTROS_COSTOS" ;
      edtavCtlcosto_total_Internalname = "CTLCOSTO_TOTAL" ;
      edtavCtlcantidaddisponible_Internalname = "CTLCANTIDADDISPONIBLE" ;
      edtavCtlcantidad_solicitada_Internalname = "CTLCANTIDAD_SOLICITADA" ;
      divTable1_Internalname = "TABLE1" ;
      bttAgregar_Internalname = "AGREGAR" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      divGridtable_Internalname = "GRIDTABLE" ;
      Alertify1_Internalname = "ALERTIFY1" ;
      divMain_Internalname = "MAIN" ;
      Form.setInternalname( "FORM" );
      subGrid2_Internalname = "GRID2" ;
   }

   public void initialize_properties( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavCtlcantidad_solicitada_Jsonclick = "" ;
      edtavCtlcantidad_solicitada_Visible = -1 ;
      edtavCtlcantidad_solicitada_Enabled = 1 ;
      edtavCtlcantidaddisponible_Jsonclick = "" ;
      edtavCtlcosto_total_Jsonclick = "" ;
      edtavCtlotros_costos_Jsonclick = "" ;
      edtavCtlvalor_unitario_Jsonclick = "" ;
      edtavCtlunidadmedida_Jsonclick = "" ;
      edtavCtlmodelo_Jsonclick = "" ;
      edtavCtlmarca_Jsonclick = "" ;
      edtavCtlobservaciones_Jsonclick = "" ;
      edtavCtlcata_descripcion_Jsonclick = "" ;
      edtavCtlelem_consecutivo_Jsonclick = "" ;
      edtavCtlfecha_Jsonclick = "" ;
      edtavCtltran_consecutivo_Jsonclick = "" ;
      edtavCtlcantidaddisponible_Enabled = -1 ;
      edtavCtlcosto_total_Enabled = -1 ;
      edtavCtlotros_costos_Enabled = -1 ;
      edtavCtlvalor_unitario_Enabled = -1 ;
      edtavCtlunidadmedida_Enabled = -1 ;
      edtavCtlmodelo_Enabled = -1 ;
      edtavCtlmarca_Enabled = -1 ;
      edtavCtlobservaciones_Enabled = -1 ;
      edtavCtlcata_descripcion_Enabled = -1 ;
      edtavCtlelem_consecutivo_Enabled = -1 ;
      edtavCtlfecha_Enabled = -1 ;
      edtavCtltran_consecutivo_Enabled = -1 ;
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      edtavCtlcantidaddisponible_Enabled = 0 ;
      edtavCtlcosto_total_Enabled = 0 ;
      edtavCtlotros_costos_Enabled = 0 ;
      edtavCtlvalor_unitario_Enabled = 0 ;
      edtavCtlunidadmedida_Enabled = 0 ;
      edtavCtlmodelo_Enabled = 0 ;
      edtavCtlmarca_Enabled = 0 ;
      edtavCtlobservaciones_Enabled = 0 ;
      edtavCtlcata_descripcion_Enabled = 0 ;
      edtavCtlelem_consecutivo_Enabled = 0 ;
      edtavCtlfecha_Enabled = 0 ;
      edtavCtltran_consecutivo_Enabled = 0 ;
      subGrid2_Class = "WorkWith" ;
      subGrid2_Backcolorstyle = (byte)(0) ;
      edtavCobservaciones_Enabled = 1 ;
      edtavCobservaciones_Visible = 1 ;
      edtavCtran_consecutivocc_Jsonclick = "" ;
      edtavCtran_consecutivocc_Enabled = 1 ;
      edtavCtran_consecutivocc_Visible = 1 ;
      edtavCtran_fecharatificacion_Jsonclick = "" ;
      edtavCtran_fecharatificacion_Enabled = 1 ;
      edtavCtran_fecharatificacion_Visible = 1 ;
      edtavCcata_descripcion_Enabled = 1 ;
      edtavCcata_descripcion_Visible = 1 ;
      edtavCelem_consecutivo_Jsonclick = "" ;
      edtavCelem_consecutivo_Enabled = 1 ;
      edtavCelem_consecutivo_Visible = 1 ;
      divObservacionesfiltercontainer_Class = "AdvancedContainerItem" ;
      divTransaccionfiltercontainer_Class = "AdvancedContainerItem" ;
      divFechafiltercontainer_Class = "AdvancedContainerItem" ;
      divInvc_descripcioncatalogofiltercontainer_Class = "AdvancedContainerItem" ;
      divInvc_codigocatalogofiltercontainer_Class = "AdvancedContainerItem" ;
      bttBtntoggle_Class = "BtnToggle" ;
      divAdvancedcontainer_Class = "AdvancedContainerVisible" ;
      Alertify1_Textcancel = "Cancelar" ;
      Alertify1_Textok = "Confirmar" ;
      Alertify1_Textmessage = "" ;
      Alertify1_Type = "error" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Seleccionar Inventario de Consumo" );
      subGrid2_Rows = 8 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'subGrid2_Rows',nv:0}],oparms:[]}");
      setEventMetadata("'TOGGLE'","{handler:'e166G1',iparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}],oparms:[{av:'divAdvancedcontainer_Class',ctrl:'ADVANCEDCONTAINER',prop:'Class'},{ctrl:'BTNTOGGLE',prop:'Class'}]}");
      setEventMetadata("LBLINVC_CODIGOCATALOGOFILTER.CLICK","{handler:'e116G1',iparms:[{av:'divInvc_codigocatalogofiltercontainer_Class',ctrl:'INVC_CODIGOCATALOGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvc_codigocatalogofiltercontainer_Class',ctrl:'INVC_CODIGOCATALOGOFILTERCONTAINER',prop:'Class'},{av:'edtavCelem_consecutivo_Visible',ctrl:'vCELEM_CONSECUTIVO',prop:'Visible'}]}");
      setEventMetadata("LBLINVC_DESCRIPCIONFILTER.CLICK","{handler:'e126G1',iparms:[{av:'divInvc_descripcioncatalogofiltercontainer_Class',ctrl:'INVC_DESCRIPCIONCATALOGOFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divInvc_descripcioncatalogofiltercontainer_Class',ctrl:'INVC_DESCRIPCIONCATALOGOFILTERCONTAINER',prop:'Class'},{av:'edtavCcata_descripcion_Visible',ctrl:'vCCATA_DESCRIPCION',prop:'Visible'}]}");
      setEventMetadata("LBLFECHAFILTER.CLICK","{handler:'e136G1',iparms:[{av:'divFechafiltercontainer_Class',ctrl:'FECHAFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divFechafiltercontainer_Class',ctrl:'FECHAFILTERCONTAINER',prop:'Class'},{av:'edtavCtran_fecharatificacion_Visible',ctrl:'vCTRAN_FECHARATIFICACION',prop:'Visible'}]}");
      setEventMetadata("LBLTRANSACCIONFILTER.CLICK","{handler:'e146G1',iparms:[{av:'divTransaccionfiltercontainer_Class',ctrl:'TRANSACCIONFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divTransaccionfiltercontainer_Class',ctrl:'TRANSACCIONFILTERCONTAINER',prop:'Class'},{av:'edtavCtran_consecutivocc_Visible',ctrl:'vCTRAN_CONSECUTIVOCC',prop:'Visible'}]}");
      setEventMetadata("LBLOBSERVACIONESFILTER.CLICK","{handler:'e156G1',iparms:[{av:'divObservacionesfiltercontainer_Class',ctrl:'OBSERVACIONESFILTERCONTAINER',prop:'Class'}],oparms:[{av:'divObservacionesfiltercontainer_Class',ctrl:'OBSERVACIONESFILTERCONTAINER',prop:'Class'},{av:'edtavCobservaciones_Visible',ctrl:'vCOBSERVACIONES',prop:'Visible'}]}");
      setEventMetadata("VCELEM_CONSECUTIVO.ISVALID","{handler:'e176G2',iparms:[{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A709Trans_FechaRatificacion',fld:'TRANS_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''},{av:'AV10Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV20cCent_Id',fld:'vCCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV17cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV16cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV18cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A618Cantidad_Diponible',fld:'CANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A620Valor_Unitario',fld:'VALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A621Otros_Costos',fld:'OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A622Costo_Total',fld:'COSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV35Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV55Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV25cObservaciones',fld:'vCOBSERVACIONES',pic:'',nv:''},{av:'AV27cTran_ConsecutivoCC',fld:'vCTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV28cTran_Fecharatificacion',fld:'vCTRAN_FECHARATIFICACION',pic:'',nv:''},{av:'AV19cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV23cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV33Marca',fld:'vMARCA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'A70TDet_ListId',fld:'TDET_LISTID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A494TDet_ValorAtributo',fld:'TDET_VALORATRIBUTO',pic:'',nv:''},{av:'AV46Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV34Modelo',fld:'vMODELO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50pTipo_Codigo',fld:'vPTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV5Cantidad_Diponible',fld:'vCANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV31Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV12UNIMED_COD',fld:'vUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'AV13UNIMED_DES',fld:'vUNIMED_DES',pic:'',nv:''},{av:'AV14Valor_Unitario',fld:'vVALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV9Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV7Costo_Total',fld:'vCOSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'A77UNIMED_COD',fld:'UNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'A496UNIMED_DES',fld:'UNIMED_DES',pic:'',nv:''},{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0}],oparms:[{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'AV41pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV11Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV5Cantidad_Diponible',fld:'vCANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV31Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV14Valor_Unitario',fld:'vVALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV9Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV7Costo_Total',fld:'vCOSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV33Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV46Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV34Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV55Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50pTipo_Codigo',fld:'vPTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12UNIMED_COD',fld:'vUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'AV13UNIMED_DES',fld:'vUNIMED_DES',pic:'',nv:''}]}");
      setEventMetadata("VCCATA_DESCRIPCION.ISVALID","{handler:'e186G2',iparms:[{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A709Trans_FechaRatificacion',fld:'TRANS_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''},{av:'AV10Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV20cCent_Id',fld:'vCCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV17cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV16cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV18cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A618Cantidad_Diponible',fld:'CANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A620Valor_Unitario',fld:'VALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A621Otros_Costos',fld:'OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A622Costo_Total',fld:'COSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV35Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV55Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV25cObservaciones',fld:'vCOBSERVACIONES',pic:'',nv:''},{av:'AV27cTran_ConsecutivoCC',fld:'vCTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV28cTran_Fecharatificacion',fld:'vCTRAN_FECHARATIFICACION',pic:'',nv:''},{av:'AV19cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV23cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV33Marca',fld:'vMARCA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'A70TDet_ListId',fld:'TDET_LISTID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A494TDet_ValorAtributo',fld:'TDET_VALORATRIBUTO',pic:'',nv:''},{av:'AV46Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV34Modelo',fld:'vMODELO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50pTipo_Codigo',fld:'vPTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV5Cantidad_Diponible',fld:'vCANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV31Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV12UNIMED_COD',fld:'vUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'AV13UNIMED_DES',fld:'vUNIMED_DES',pic:'',nv:''},{av:'AV14Valor_Unitario',fld:'vVALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV9Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV7Costo_Total',fld:'vCOSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'A77UNIMED_COD',fld:'UNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'A496UNIMED_DES',fld:'UNIMED_DES',pic:'',nv:''},{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0}],oparms:[{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'AV41pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV11Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV5Cantidad_Diponible',fld:'vCANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV31Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV14Valor_Unitario',fld:'vVALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV9Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV7Costo_Total',fld:'vCOSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV33Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV46Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV34Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV55Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50pTipo_Codigo',fld:'vPTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12UNIMED_COD',fld:'vUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'AV13UNIMED_DES',fld:'vUNIMED_DES',pic:'',nv:''}]}");
      setEventMetadata("VCTRAN_FECHARATIFICACION.ISVALID","{handler:'e196G2',iparms:[{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A709Trans_FechaRatificacion',fld:'TRANS_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''},{av:'AV10Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV20cCent_Id',fld:'vCCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV17cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV16cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV18cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A618Cantidad_Diponible',fld:'CANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A620Valor_Unitario',fld:'VALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A621Otros_Costos',fld:'OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A622Costo_Total',fld:'COSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV35Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV55Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV25cObservaciones',fld:'vCOBSERVACIONES',pic:'',nv:''},{av:'AV27cTran_ConsecutivoCC',fld:'vCTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV28cTran_Fecharatificacion',fld:'vCTRAN_FECHARATIFICACION',pic:'',nv:''},{av:'AV19cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV23cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV33Marca',fld:'vMARCA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'A70TDet_ListId',fld:'TDET_LISTID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A494TDet_ValorAtributo',fld:'TDET_VALORATRIBUTO',pic:'',nv:''},{av:'AV46Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV34Modelo',fld:'vMODELO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50pTipo_Codigo',fld:'vPTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV5Cantidad_Diponible',fld:'vCANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV31Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV12UNIMED_COD',fld:'vUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'AV13UNIMED_DES',fld:'vUNIMED_DES',pic:'',nv:''},{av:'AV14Valor_Unitario',fld:'vVALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV9Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV7Costo_Total',fld:'vCOSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'A77UNIMED_COD',fld:'UNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'A496UNIMED_DES',fld:'UNIMED_DES',pic:'',nv:''},{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0}],oparms:[{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'AV41pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV11Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV5Cantidad_Diponible',fld:'vCANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV31Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV14Valor_Unitario',fld:'vVALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV9Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV7Costo_Total',fld:'vCOSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV33Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV46Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV34Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV55Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50pTipo_Codigo',fld:'vPTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12UNIMED_COD',fld:'vUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'AV13UNIMED_DES',fld:'vUNIMED_DES',pic:'',nv:''}]}");
      setEventMetadata("VCTRAN_CONSECUTIVOCC.ISVALID","{handler:'e206G2',iparms:[{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A709Trans_FechaRatificacion',fld:'TRANS_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''},{av:'AV10Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV20cCent_Id',fld:'vCCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV17cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV16cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV18cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A618Cantidad_Diponible',fld:'CANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A620Valor_Unitario',fld:'VALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A621Otros_Costos',fld:'OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A622Costo_Total',fld:'COSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV35Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV55Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV25cObservaciones',fld:'vCOBSERVACIONES',pic:'',nv:''},{av:'AV27cTran_ConsecutivoCC',fld:'vCTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV28cTran_Fecharatificacion',fld:'vCTRAN_FECHARATIFICACION',pic:'',nv:''},{av:'AV19cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV23cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV33Marca',fld:'vMARCA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'A70TDet_ListId',fld:'TDET_LISTID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A494TDet_ValorAtributo',fld:'TDET_VALORATRIBUTO',pic:'',nv:''},{av:'AV46Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV34Modelo',fld:'vMODELO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50pTipo_Codigo',fld:'vPTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV5Cantidad_Diponible',fld:'vCANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV31Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV12UNIMED_COD',fld:'vUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'AV13UNIMED_DES',fld:'vUNIMED_DES',pic:'',nv:''},{av:'AV14Valor_Unitario',fld:'vVALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV9Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV7Costo_Total',fld:'vCOSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'A77UNIMED_COD',fld:'UNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'A496UNIMED_DES',fld:'UNIMED_DES',pic:'',nv:''},{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0}],oparms:[{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'AV41pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV11Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV5Cantidad_Diponible',fld:'vCANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV31Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV14Valor_Unitario',fld:'vVALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV9Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV7Costo_Total',fld:'vCOSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV33Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV46Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV34Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV55Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50pTipo_Codigo',fld:'vPTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12UNIMED_COD',fld:'vUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'AV13UNIMED_DES',fld:'vUNIMED_DES',pic:'',nv:''}]}");
      setEventMetadata("VCOBSERVACIONES.ISVALID","{handler:'e216G2',iparms:[{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A709Trans_FechaRatificacion',fld:'TRANS_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''},{av:'AV10Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV20cCent_Id',fld:'vCCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV17cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV16cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV18cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',hsh:true,nv:''},{av:'A618Cantidad_Diponible',fld:'CANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A620Valor_Unitario',fld:'VALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A621Otros_Costos',fld:'OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A622Costo_Total',fld:'COSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV35Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV55Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV25cObservaciones',fld:'vCOBSERVACIONES',pic:'',nv:''},{av:'AV27cTran_ConsecutivoCC',fld:'vCTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV28cTran_Fecharatificacion',fld:'vCTRAN_FECHARATIFICACION',pic:'',nv:''},{av:'AV19cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV23cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV33Marca',fld:'vMARCA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'A70TDet_ListId',fld:'TDET_LISTID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A494TDet_ValorAtributo',fld:'TDET_VALORATRIBUTO',pic:'',nv:''},{av:'AV46Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV34Modelo',fld:'vMODELO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50pTipo_Codigo',fld:'vPTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV5Cantidad_Diponible',fld:'vCANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV31Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV12UNIMED_COD',fld:'vUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'AV13UNIMED_DES',fld:'vUNIMED_DES',pic:'',nv:''},{av:'AV14Valor_Unitario',fld:'vVALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV9Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV7Costo_Total',fld:'vCOSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'A77UNIMED_COD',fld:'UNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'A496UNIMED_DES',fld:'UNIMED_DES',pic:'',nv:''},{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0}],oparms:[{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'AV41pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV11Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV5Cantidad_Diponible',fld:'vCANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV31Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV14Valor_Unitario',fld:'vVALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV9Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV7Costo_Total',fld:'vCOSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV33Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV46Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV34Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV55Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50pTipo_Codigo',fld:'vPTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12UNIMED_COD',fld:'vUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'AV13UNIMED_DES',fld:'vUNIMED_DES',pic:'',nv:''}]}");
      setEventMetadata("'AGREGAR'","{handler:'e226G2',iparms:[{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'AV47Tran_Salida',fld:'vTRAN_SALIDA',pic:'ZZZZZZZZZZ9',nv:0},{av:'A91Regional',fld:'REGIONAL',pic:'ZZZZZZZZZZ9',nv:0},{av:'A92Centro_Id',fld:'CENTRO_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A27Alma_Modulo',fld:'ALMA_MODULO',pic:'',nv:''},{av:'A28Alma_Codigo',fld:'ALMA_CODIGO',pic:'',nv:''},{av:'A31Bode_Codigo',fld:'BODE_CODIGO',pic:'',nv:''},{av:'A66Elem_Consecutivo',fld:'ELEM_CONSECUTIVO',pic:'',nv:''},{av:'A709Trans_FechaRatificacion',fld:'TRANS_FECHARATIFICACION',pic:'99/99/9999 99:99',nv:''},{av:'AV10Regi_Id',fld:'vREGI_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV20cCent_Id',fld:'vCCENT_ID',pic:'ZZZZZZZZZZ9',hsh:true,nv:0},{av:'AV17cAlma_Modulo',fld:'vCALMA_MODULO',pic:'',hsh:true,nv:''},{av:'AV16cAlma_Codigo',fld:'vCALMA_CODIGO',pic:'',hsh:true,nv:''},{av:'AV18cBode_Codigo',fld:'vCBODE_CODIGO',pic:'',hsh:true,nv:''},{av:'AV26Consecutivo',fld:'vCONSECUTIVO',pic:'',nv:''},{av:'A618Cantidad_Diponible',fld:'CANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV48ValidaFecha',fld:'vVALIDAFECHA',pic:'',nv:''},{av:'A93Trans_Id',fld:'TRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A94Num_Linea',fld:'NUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV51Trans_Id',fld:'vTRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV52Linea',fld:'vLINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV54Solicitada',fld:'vSOLICITADA',pic:'ZZZZZZZ9',nv:0},{av:'A298Cata_Descripcion',fld:'CATA_DESCRIPCION',pic:'@!',nv:''},{av:'A620Valor_Unitario',fld:'VALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A621Otros_Costos',fld:'OTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A622Costo_Total',fld:'COSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV35Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV55Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV25cObservaciones',fld:'vCOBSERVACIONES',pic:'',nv:''},{av:'AV27cTran_ConsecutivoCC',fld:'vCTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV28cTran_Fecharatificacion',fld:'vCTRAN_FECHARATIFICACION',pic:'',nv:''},{av:'AV19cCata_Descripcion',fld:'vCCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV23cElem_Consecutivo',fld:'vCELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV33Marca',fld:'vMARCA',pic:'',nv:''},{av:'A46Tran_Id',fld:'TRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV11Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A69TDet_Consecutivo',fld:'TDET_CONSECUTIVO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV8Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'A70TDet_ListId',fld:'TDET_LISTID',pic:'ZZZZZZZZZZ9',nv:0},{av:'A494TDet_ValorAtributo',fld:'TDET_VALORATRIBUTO',pic:'',nv:''},{av:'AV46Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV34Modelo',fld:'vMODELO',pic:'',nv:''},{av:'A513Tran_ConsecutivoCC',fld:'TRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50pTipo_Codigo',fld:'vPTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV41pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'A33Tipo_Codigo',fld:'TIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV5Cantidad_Diponible',fld:'vCANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV31Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV12UNIMED_COD',fld:'vUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'AV13UNIMED_DES',fld:'vUNIMED_DES',pic:'',nv:''},{av:'AV14Valor_Unitario',fld:'vVALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV9Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV7Costo_Total',fld:'vCOSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'A77UNIMED_COD',fld:'UNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'A496UNIMED_DES',fld:'UNIMED_DES',pic:'',nv:''},{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0}],oparms:[{av:'AV26Consecutivo',fld:'vCONSECUTIVO',pic:'',nv:''},{av:'AV48ValidaFecha',fld:'vVALIDAFECHA',pic:'',nv:''},{av:'AV51Trans_Id',fld:'vTRANS_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV52Linea',fld:'vLINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV54Solicitada',fld:'vSOLICITADA',pic:'ZZZZZZZ9',nv:0},{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null},{av:'AV47Tran_Salida',fld:'vTRAN_SALIDA',pic:'ZZZZZZZZZZ9',nv:0},{av:'Alertify1_Type',ctrl:'ALERTIFY1',prop:'Type'},{av:'Alertify1_Textmessage',ctrl:'ALERTIFY1',prop:'TextMessage'},{av:'AV41pElem_Consecutivo',fld:'vPELEM_CONSECUTIVO',pic:'',nv:''},{av:'AV11Tran_Id',fld:'vTRAN_ID',pic:'ZZZZZZZZZZ9',nv:0},{av:'AV8Num_Linea',fld:'vNUM_LINEA',pic:'ZZZZZZZ9',nv:0},{av:'AV6Cata_Descripcion',fld:'vCATA_DESCRIPCION',pic:'@!',nv:''},{av:'AV5Cantidad_Diponible',fld:'vCANTIDAD_DIPONIBLE',pic:'ZZZZZZZ9',nv:0},{av:'AV31Fecha',fld:'vFECHA',pic:'',nv:''},{av:'AV14Valor_Unitario',fld:'vVALOR_UNITARIO',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV9Otros_Costos',fld:'vOTROS_COSTOS',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV7Costo_Total',fld:'vCOSTO_TOTAL',pic:'$ ZZZ,ZZZ,ZZZ,ZZZ,ZZ9.99',nv:0.0},{av:'AV33Marca',fld:'vMARCA',pic:'',nv:''},{av:'AV46Serial',fld:'vSERIAL',pic:'',nv:''},{av:'AV34Modelo',fld:'vMODELO',pic:'',nv:''},{av:'AV35Observaciones',fld:'vOBSERVACIONES',pic:'',nv:''},{av:'AV55Tran_ConsecutivoCC',fld:'vTRAN_CONSECUTIVOCC',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV50pTipo_Codigo',fld:'vPTIPO_CODIGO',pic:'ZZZZZZZZZZZZZZZZZ9',nv:0},{av:'AV12UNIMED_COD',fld:'vUNIMED_COD',pic:'ZZZZZ9',nv:0},{av:'AV13UNIMED_DES',fld:'vUNIMED_DES',pic:'',nv:''}]}");
      setEventMetadata("GRID2_FIRSTPAGE","{handler:'subgrid2_firstpage',iparms:[{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0},{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID2_PREVPAGE","{handler:'subgrid2_previouspage',iparms:[{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0},{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID2_NEXTPAGE","{handler:'subgrid2_nextpage',iparms:[{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0},{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null}],oparms:[]}");
      setEventMetadata("GRID2_LASTPAGE","{handler:'subgrid2_lastpage',iparms:[{av:'GRID2_nFirstRecordOnPage',nv:0},{av:'GRID2_nEOF',nv:0},{av:'subGrid2_Rows',nv:0},{av:'AV44SDTInvenConsumo',fld:'vSDTINVENCONSUMO',grid:67,pic:'',nv:null}],oparms:[]}");
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
      wcpOAV17cAlma_Modulo = "" ;
      wcpOAV16cAlma_Codigo = "" ;
      wcpOAV18cBode_Codigo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      AV17cAlma_Modulo = "" ;
      AV16cAlma_Codigo = "" ;
      AV18cBode_Codigo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV44SDTInvenConsumo = new GXBaseCollection<com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem>(com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem.class, "SDTInvenConsumo.SDTInvenConsumoItem", "ACBSENA", remoteHandle);
      A27Alma_Modulo = "" ;
      A28Alma_Codigo = "" ;
      A31Bode_Codigo = "" ;
      A66Elem_Consecutivo = "" ;
      A709Trans_FechaRatificacion = GXutil.resetTime( GXutil.nullDate() );
      A298Cata_Descripcion = "" ;
      A620Valor_Unitario = DecimalUtil.ZERO ;
      A621Otros_Costos = DecimalUtil.ZERO ;
      A622Costo_Total = DecimalUtil.ZERO ;
      AV35Observaciones = "" ;
      AV33Marca = "" ;
      A494TDet_ValorAtributo = "" ;
      AV46Serial = "" ;
      AV34Modelo = "" ;
      AV41pElem_Consecutivo = "" ;
      AV6Cata_Descripcion = "" ;
      AV31Fecha = GXutil.nullDate() ;
      AV13UNIMED_DES = "" ;
      AV14Valor_Unitario = DecimalUtil.ZERO ;
      AV9Otros_Costos = DecimalUtil.ZERO ;
      AV7Costo_Total = DecimalUtil.ZERO ;
      A496UNIMED_DES = "" ;
      AV26Consecutivo = "" ;
      AV48ValidaFecha = GXutil.nullDate() ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      lblLblinvc_codigocatalogofilter_Jsonclick = "" ;
      TempTags = "" ;
      AV23cElem_Consecutivo = "" ;
      lblLblinvc_descripcionfilter_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV19cCata_Descripcion = "" ;
      lblLblfechafilter_Jsonclick = "" ;
      AV28cTran_Fecharatificacion = GXutil.nullDate() ;
      lblLbltransaccionfilter_Jsonclick = "" ;
      lblLblobservacionesfilter_Jsonclick = "" ;
      AV25cObservaciones = "" ;
      bttBtntoggle_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      subGrid2_Linesclass = "" ;
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      bttAgregar_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15ADVANCED_LABEL_TEMPLATE = "" ;
      AV29DescAtri = "" ;
      AV72Descatri_GXI = "" ;
      AV38Patern = "" ;
      scmdbuf = "" ;
      H006G2_A37Cata_Codigo = new String[] {""} ;
      H006G2_A91Regional = new long[1] ;
      H006G2_A92Centro_Id = new long[1] ;
      H006G2_A27Alma_Modulo = new String[] {""} ;
      H006G2_A28Alma_Codigo = new String[] {""} ;
      H006G2_A31Bode_Codigo = new String[] {""} ;
      H006G2_A618Cantidad_Diponible = new int[1] ;
      H006G2_n618Cantidad_Diponible = new boolean[] {false} ;
      H006G2_A93Trans_Id = new long[1] ;
      H006G2_A94Num_Linea = new int[1] ;
      H006G2_A298Cata_Descripcion = new String[] {""} ;
      H006G2_A620Valor_Unitario = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006G2_A621Otros_Costos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006G2_n621Otros_Costos = new boolean[] {false} ;
      H006G2_A622Costo_Total = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H006G2_A709Trans_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H006G2_n709Trans_FechaRatificacion = new boolean[] {false} ;
      H006G2_A66Elem_Consecutivo = new String[] {""} ;
      A37Cata_Codigo = "" ;
      AV45SDTInvenConsumoItem = new com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem(remoteHandle, context);
      H006G3_A66Elem_Consecutivo = new String[] {""} ;
      H006G3_A77UNIMED_COD = new int[1] ;
      H006G3_A496UNIMED_DES = new String[] {""} ;
      H006G4_A70TDet_ListId = new long[1] ;
      H006G4_A69TDet_Consecutivo = new long[1] ;
      H006G4_A46Tran_Id = new long[1] ;
      H006G4_A494TDet_ValorAtributo = new String[] {""} ;
      H006G5_A70TDet_ListId = new long[1] ;
      H006G5_A69TDet_Consecutivo = new long[1] ;
      H006G5_A46Tran_Id = new long[1] ;
      H006G5_A494TDet_ValorAtributo = new String[] {""} ;
      H006G6_A70TDet_ListId = new long[1] ;
      H006G6_A69TDet_Consecutivo = new long[1] ;
      H006G6_A46Tran_Id = new long[1] ;
      H006G6_A494TDet_ValorAtributo = new String[] {""} ;
      H006G7_A70TDet_ListId = new long[1] ;
      H006G7_A69TDet_Consecutivo = new long[1] ;
      H006G7_A46Tran_Id = new long[1] ;
      H006G7_A494TDet_ValorAtributo = new String[] {""} ;
      H006G8_A46Tran_Id = new long[1] ;
      H006G8_A513Tran_ConsecutivoCC = new long[1] ;
      H006G8_n513Tran_ConsecutivoCC = new boolean[] {false} ;
      AV30Error = "" ;
      GXv_int1 = new long [1] ;
      GXv_objcol_SdtSDTInvenConsumo_SDTInvenConsumoItem2 = new GXBaseCollection [1] ;
      H006G9_A94Num_Linea = new int[1] ;
      H006G9_A93Trans_Id = new long[1] ;
      H006G9_A91Regional = new long[1] ;
      H006G9_A92Centro_Id = new long[1] ;
      H006G9_A27Alma_Modulo = new String[] {""} ;
      H006G9_A28Alma_Codigo = new String[] {""} ;
      H006G9_A31Bode_Codigo = new String[] {""} ;
      H006G9_A66Elem_Consecutivo = new String[] {""} ;
      H006G9_A618Cantidad_Diponible = new int[1] ;
      H006G9_n618Cantidad_Diponible = new boolean[] {false} ;
      H006G9_A709Trans_FechaRatificacion = new java.util.Date[] {GXutil.nullDate()} ;
      H006G9_n709Trans_FechaRatificacion = new boolean[] {false} ;
      H006G10_A94Num_Linea = new int[1] ;
      H006G10_A66Elem_Consecutivo = new String[] {""} ;
      H006G10_A93Trans_Id = new long[1] ;
      H006G10_A31Bode_Codigo = new String[] {""} ;
      H006G10_A28Alma_Codigo = new String[] {""} ;
      H006G10_A27Alma_Modulo = new String[] {""} ;
      H006G10_A92Centro_Id = new long[1] ;
      H006G10_A91Regional = new long[1] ;
      H006G10_A618Cantidad_Diponible = new int[1] ;
      H006G10_n618Cantidad_Diponible = new boolean[] {false} ;
      H006G11_A66Elem_Consecutivo = new String[] {""} ;
      H006G11_A33Tipo_Codigo = new long[1] ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      ROClassString = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new com.orions2.selinvenconsumo__default(),
         new Object[] {
             new Object[] {
            H006G2_A37Cata_Codigo, H006G2_A91Regional, H006G2_A92Centro_Id, H006G2_A27Alma_Modulo, H006G2_A28Alma_Codigo, H006G2_A31Bode_Codigo, H006G2_A618Cantidad_Diponible, H006G2_n618Cantidad_Diponible, H006G2_A93Trans_Id, H006G2_A94Num_Linea,
            H006G2_A298Cata_Descripcion, H006G2_A620Valor_Unitario, H006G2_A621Otros_Costos, H006G2_n621Otros_Costos, H006G2_A622Costo_Total, H006G2_A709Trans_FechaRatificacion, H006G2_n709Trans_FechaRatificacion, H006G2_A66Elem_Consecutivo
            }
            , new Object[] {
            H006G3_A66Elem_Consecutivo, H006G3_A77UNIMED_COD, H006G3_A496UNIMED_DES
            }
            , new Object[] {
            H006G4_A70TDet_ListId, H006G4_A69TDet_Consecutivo, H006G4_A46Tran_Id, H006G4_A494TDet_ValorAtributo
            }
            , new Object[] {
            H006G5_A70TDet_ListId, H006G5_A69TDet_Consecutivo, H006G5_A46Tran_Id, H006G5_A494TDet_ValorAtributo
            }
            , new Object[] {
            H006G6_A70TDet_ListId, H006G6_A69TDet_Consecutivo, H006G6_A46Tran_Id, H006G6_A494TDet_ValorAtributo
            }
            , new Object[] {
            H006G7_A70TDet_ListId, H006G7_A69TDet_Consecutivo, H006G7_A46Tran_Id, H006G7_A494TDet_ValorAtributo
            }
            , new Object[] {
            H006G8_A46Tran_Id, H006G8_A513Tran_ConsecutivoCC, H006G8_n513Tran_ConsecutivoCC
            }
            , new Object[] {
            H006G9_A94Num_Linea, H006G9_A93Trans_Id, H006G9_A91Regional, H006G9_A92Centro_Id, H006G9_A27Alma_Modulo, H006G9_A28Alma_Codigo, H006G9_A31Bode_Codigo, H006G9_A66Elem_Consecutivo, H006G9_A618Cantidad_Diponible, H006G9_n618Cantidad_Diponible,
            H006G9_A709Trans_FechaRatificacion, H006G9_n709Trans_FechaRatificacion
            }
            , new Object[] {
            H006G10_A94Num_Linea, H006G10_A66Elem_Consecutivo, H006G10_A93Trans_Id, H006G10_A31Bode_Codigo, H006G10_A28Alma_Codigo, H006G10_A27Alma_Modulo, H006G10_A92Centro_Id, H006G10_A91Regional, H006G10_A618Cantidad_Diponible, H006G10_n618Cantidad_Diponible
            }
            , new Object[] {
            H006G11_A66Elem_Consecutivo, H006G11_A33Tipo_Codigo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtltran_consecutivo_Enabled = 0 ;
      edtavCtlfecha_Enabled = 0 ;
      edtavCtlelem_consecutivo_Enabled = 0 ;
      edtavCtlcata_descripcion_Enabled = 0 ;
      edtavCtlobservaciones_Enabled = 0 ;
      edtavCtlmarca_Enabled = 0 ;
      edtavCtlmodelo_Enabled = 0 ;
      edtavCtlunidadmedida_Enabled = 0 ;
      edtavCtlvalor_unitario_Enabled = 0 ;
      edtavCtlotros_costos_Enabled = 0 ;
      edtavCtlcosto_total_Enabled = 0 ;
      edtavCtlcantidaddisponible_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte GRID2_nEOF ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Titlebackstyle ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private byte subGrid2_Backstyle ;
   private short nRC_GXsfl_67 ;
   private short nGXsfl_67_idx=1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV58GXV1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short nGXsfl_67_fel_idx=1 ;
   private short nGXsfl_67_bak_idx=1 ;
   private int subGrid2_Rows ;
   private int A618Cantidad_Diponible ;
   private int A94Num_Linea ;
   private int AV8Num_Linea ;
   private int AV5Cantidad_Diponible ;
   private int AV12UNIMED_COD ;
   private int A77UNIMED_COD ;
   private int AV52Linea ;
   private int AV54Solicitada ;
   private int edtavCelem_consecutivo_Visible ;
   private int edtavCelem_consecutivo_Enabled ;
   private int edtavCcata_descripcion_Visible ;
   private int edtavCcata_descripcion_Enabled ;
   private int edtavCtran_fecharatificacion_Visible ;
   private int edtavCtran_fecharatificacion_Enabled ;
   private int edtavCtran_consecutivocc_Enabled ;
   private int edtavCtran_consecutivocc_Visible ;
   private int edtavCobservaciones_Visible ;
   private int edtavCobservaciones_Enabled ;
   private int subGrid2_Titlebackcolor ;
   private int subGrid2_Allbackcolor ;
   private int edtavCtltran_consecutivo_Enabled ;
   private int edtavCtlfecha_Enabled ;
   private int edtavCtlelem_consecutivo_Enabled ;
   private int edtavCtlcata_descripcion_Enabled ;
   private int edtavCtlobservaciones_Enabled ;
   private int edtavCtlmarca_Enabled ;
   private int edtavCtlmodelo_Enabled ;
   private int edtavCtlunidadmedida_Enabled ;
   private int edtavCtlvalor_unitario_Enabled ;
   private int edtavCtlotros_costos_Enabled ;
   private int edtavCtlcosto_total_Enabled ;
   private int edtavCtlcantidaddisponible_Enabled ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int subGrid2_Islastpage ;
   private int GRID2_nGridOutOfScope ;
   private int AV80GXV2 ;
   private int AV53DisponibleTRN ;
   private int idxLst ;
   private int subGrid2_Backcolor ;
   private int edtavCtlcantidad_solicitada_Enabled ;
   private int edtavCtlcantidad_solicitada_Visible ;
   private long wcpOAV10Regi_Id ;
   private long wcpOAV20cCent_Id ;
   private long wcpOAV47Tran_Salida ;
   private long wcpOAV49Tipo_Codigo ;
   private long AV10Regi_Id ;
   private long AV20cCent_Id ;
   private long AV47Tran_Salida ;
   private long AV49Tipo_Codigo ;
   private long GRID2_nFirstRecordOnPage ;
   private long A91Regional ;
   private long A92Centro_Id ;
   private long A93Trans_Id ;
   private long AV55Tran_ConsecutivoCC ;
   private long A46Tran_Id ;
   private long AV11Tran_Id ;
   private long A69TDet_Consecutivo ;
   private long A70TDet_ListId ;
   private long A513Tran_ConsecutivoCC ;
   private long AV50pTipo_Codigo ;
   private long A33Tipo_Codigo ;
   private long AV51Trans_Id ;
   private long AV27cTran_ConsecutivoCC ;
   private long GRID2_nCurrentRecord ;
   private long GRID2_nRecordCount ;
   private long GXv_int1[] ;
   private java.math.BigDecimal A620Valor_Unitario ;
   private java.math.BigDecimal A621Otros_Costos ;
   private java.math.BigDecimal A622Costo_Total ;
   private java.math.BigDecimal AV14Valor_Unitario ;
   private java.math.BigDecimal AV9Otros_Costos ;
   private java.math.BigDecimal AV7Costo_Total ;
   private String divAdvancedcontainer_Class ;
   private String bttBtntoggle_Class ;
   private String divInvc_codigocatalogofiltercontainer_Class ;
   private String divInvc_descripcioncatalogofiltercontainer_Class ;
   private String divFechafiltercontainer_Class ;
   private String divTransaccionfiltercontainer_Class ;
   private String divObservacionesfiltercontainer_Class ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_67_idx="0001" ;
   private String GXKey ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Alertify1_Type ;
   private String Alertify1_Textmessage ;
   private String Alertify1_Textok ;
   private String Alertify1_Textcancel ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMain_Internalname ;
   private String divAdvancedcontainer_Internalname ;
   private String divInvc_codigocatalogofiltercontainer_Internalname ;
   private String lblLblinvc_codigocatalogofilter_Internalname ;
   private String lblLblinvc_codigocatalogofilter_Jsonclick ;
   private String edtavCelem_consecutivo_Internalname ;
   private String TempTags ;
   private String edtavCelem_consecutivo_Jsonclick ;
   private String divInvc_descripcioncatalogofiltercontainer_Internalname ;
   private String lblLblinvc_descripcionfilter_Internalname ;
   private String lblLblinvc_descripcionfilter_Jsonclick ;
   private String edtavCcata_descripcion_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divFechafiltercontainer_Internalname ;
   private String lblLblfechafilter_Internalname ;
   private String lblLblfechafilter_Jsonclick ;
   private String edtavCtran_fecharatificacion_Internalname ;
   private String edtavCtran_fecharatificacion_Jsonclick ;
   private String divTransaccionfiltercontainer_Internalname ;
   private String lblLbltransaccionfilter_Internalname ;
   private String lblLbltransaccionfilter_Jsonclick ;
   private String edtavCtran_consecutivocc_Internalname ;
   private String edtavCtran_consecutivocc_Jsonclick ;
   private String divObservacionesfiltercontainer_Internalname ;
   private String lblLblobservacionesfilter_Internalname ;
   private String lblLblobservacionesfilter_Jsonclick ;
   private String edtavCobservaciones_Internalname ;
   private String divGridtable_Internalname ;
   private String bttBtntoggle_Internalname ;
   private String bttBtntoggle_Jsonclick ;
   private String divTable1_Internalname ;
   private String sStyleString ;
   private String subGrid2_Internalname ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String bttAgregar_Internalname ;
   private String bttAgregar_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCtltran_consecutivo_Internalname ;
   private String edtavCtlfecha_Internalname ;
   private String edtavCtlelem_consecutivo_Internalname ;
   private String edtavCtlcata_descripcion_Internalname ;
   private String edtavCtlobservaciones_Internalname ;
   private String edtavCtlmarca_Internalname ;
   private String edtavCtlmodelo_Internalname ;
   private String edtavCtlunidadmedida_Internalname ;
   private String edtavCtlvalor_unitario_Internalname ;
   private String edtavCtlotros_costos_Internalname ;
   private String edtavCtlcosto_total_Internalname ;
   private String edtavCtlcantidaddisponible_Internalname ;
   private String sGXsfl_67_fel_idx="0001" ;
   private String AV15ADVANCED_LABEL_TEMPLATE ;
   private String scmdbuf ;
   private String AV30Error ;
   private String Alertify1_Internalname ;
   private String edtavCtlcantidad_solicitada_Internalname ;
   private String ROClassString ;
   private String edtavCtltran_consecutivo_Jsonclick ;
   private String edtavCtlfecha_Jsonclick ;
   private String edtavCtlelem_consecutivo_Jsonclick ;
   private String edtavCtlcata_descripcion_Jsonclick ;
   private String edtavCtlobservaciones_Jsonclick ;
   private String edtavCtlmarca_Jsonclick ;
   private String edtavCtlmodelo_Jsonclick ;
   private String edtavCtlunidadmedida_Jsonclick ;
   private String edtavCtlvalor_unitario_Jsonclick ;
   private String edtavCtlotros_costos_Jsonclick ;
   private String edtavCtlcosto_total_Jsonclick ;
   private String edtavCtlcantidaddisponible_Jsonclick ;
   private String edtavCtlcantidad_solicitada_Jsonclick ;
   private java.util.Date A709Trans_FechaRatificacion ;
   private java.util.Date AV31Fecha ;
   private java.util.Date AV48ValidaFecha ;
   private java.util.Date AV28cTran_Fecharatificacion ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_67_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_BV67 ;
   private boolean n618Cantidad_Diponible ;
   private boolean n621Otros_Costos ;
   private boolean n709Trans_FechaRatificacion ;
   private boolean n513Tran_ConsecutivoCC ;
   private String wcpOAV17cAlma_Modulo ;
   private String wcpOAV16cAlma_Codigo ;
   private String wcpOAV18cBode_Codigo ;
   private String AV17cAlma_Modulo ;
   private String AV16cAlma_Codigo ;
   private String AV18cBode_Codigo ;
   private String A27Alma_Modulo ;
   private String A28Alma_Codigo ;
   private String A31Bode_Codigo ;
   private String A66Elem_Consecutivo ;
   private String A298Cata_Descripcion ;
   private String AV35Observaciones ;
   private String AV33Marca ;
   private String A494TDet_ValorAtributo ;
   private String AV46Serial ;
   private String AV34Modelo ;
   private String AV41pElem_Consecutivo ;
   private String AV6Cata_Descripcion ;
   private String AV13UNIMED_DES ;
   private String A496UNIMED_DES ;
   private String AV26Consecutivo ;
   private String AV23cElem_Consecutivo ;
   private String AV19cCata_Descripcion ;
   private String AV25cObservaciones ;
   private String AV72Descatri_GXI ;
   private String AV38Patern ;
   private String A37Cata_Codigo ;
   private String AV29DescAtri ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] H006G2_A37Cata_Codigo ;
   private long[] H006G2_A91Regional ;
   private long[] H006G2_A92Centro_Id ;
   private String[] H006G2_A27Alma_Modulo ;
   private String[] H006G2_A28Alma_Codigo ;
   private String[] H006G2_A31Bode_Codigo ;
   private int[] H006G2_A618Cantidad_Diponible ;
   private boolean[] H006G2_n618Cantidad_Diponible ;
   private long[] H006G2_A93Trans_Id ;
   private int[] H006G2_A94Num_Linea ;
   private String[] H006G2_A298Cata_Descripcion ;
   private java.math.BigDecimal[] H006G2_A620Valor_Unitario ;
   private java.math.BigDecimal[] H006G2_A621Otros_Costos ;
   private boolean[] H006G2_n621Otros_Costos ;
   private java.math.BigDecimal[] H006G2_A622Costo_Total ;
   private java.util.Date[] H006G2_A709Trans_FechaRatificacion ;
   private boolean[] H006G2_n709Trans_FechaRatificacion ;
   private String[] H006G2_A66Elem_Consecutivo ;
   private String[] H006G3_A66Elem_Consecutivo ;
   private int[] H006G3_A77UNIMED_COD ;
   private String[] H006G3_A496UNIMED_DES ;
   private long[] H006G4_A70TDet_ListId ;
   private long[] H006G4_A69TDet_Consecutivo ;
   private long[] H006G4_A46Tran_Id ;
   private String[] H006G4_A494TDet_ValorAtributo ;
   private long[] H006G5_A70TDet_ListId ;
   private long[] H006G5_A69TDet_Consecutivo ;
   private long[] H006G5_A46Tran_Id ;
   private String[] H006G5_A494TDet_ValorAtributo ;
   private long[] H006G6_A70TDet_ListId ;
   private long[] H006G6_A69TDet_Consecutivo ;
   private long[] H006G6_A46Tran_Id ;
   private String[] H006G6_A494TDet_ValorAtributo ;
   private long[] H006G7_A70TDet_ListId ;
   private long[] H006G7_A69TDet_Consecutivo ;
   private long[] H006G7_A46Tran_Id ;
   private String[] H006G7_A494TDet_ValorAtributo ;
   private long[] H006G8_A46Tran_Id ;
   private long[] H006G8_A513Tran_ConsecutivoCC ;
   private boolean[] H006G8_n513Tran_ConsecutivoCC ;
   private int[] H006G9_A94Num_Linea ;
   private long[] H006G9_A93Trans_Id ;
   private long[] H006G9_A91Regional ;
   private long[] H006G9_A92Centro_Id ;
   private String[] H006G9_A27Alma_Modulo ;
   private String[] H006G9_A28Alma_Codigo ;
   private String[] H006G9_A31Bode_Codigo ;
   private String[] H006G9_A66Elem_Consecutivo ;
   private int[] H006G9_A618Cantidad_Diponible ;
   private boolean[] H006G9_n618Cantidad_Diponible ;
   private java.util.Date[] H006G9_A709Trans_FechaRatificacion ;
   private boolean[] H006G9_n709Trans_FechaRatificacion ;
   private int[] H006G10_A94Num_Linea ;
   private String[] H006G10_A66Elem_Consecutivo ;
   private long[] H006G10_A93Trans_Id ;
   private String[] H006G10_A31Bode_Codigo ;
   private String[] H006G10_A28Alma_Codigo ;
   private String[] H006G10_A27Alma_Modulo ;
   private long[] H006G10_A92Centro_Id ;
   private long[] H006G10_A91Regional ;
   private int[] H006G10_A618Cantidad_Diponible ;
   private boolean[] H006G10_n618Cantidad_Diponible ;
   private String[] H006G11_A66Elem_Consecutivo ;
   private long[] H006G11_A33Tipo_Codigo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem> AV44SDTInvenConsumo ;
   private GXBaseCollection<com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem> GXv_objcol_SdtSDTInvenConsumo_SDTInvenConsumoItem2[] ;
   private com.orions2.SdtSDTInvenConsumo_SDTInvenConsumoItem AV45SDTInvenConsumoItem ;
}

final  class selinvenconsumo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H006G2", "SELECT T3.Cata_Codigo, T1.Regional, T1.Centro_Id, T1.Alma_Modulo, T1.Alma_Codigo, T1.Bode_Codigo, T1.Cantidad_Diponible, T1.Trans_Id AS Trans_Id, T1.Num_Linea, T4.Cata_Descripcion, T1.Valor_Unitario, T1.Otros_Costos, T1.Costo_Total, T2.Tran_FechaRatificacion AS Trans_FechaRatificacion, T1.Elem_Consecutivo FROM (((ALM_INV_CON T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Trans_Id) INNER JOIN ALM_ELEMENTO T3 ON T3.Elem_Consecutivo = T1.Elem_Consecutivo) INNER JOIN ALM_CATALOGO T4 ON T4.Cata_Codigo = T3.Cata_Codigo) WHERE (T1.Regional = ? and T1.Centro_Id = ? and T1.Alma_Modulo = ? and T1.Alma_Codigo = ? and T1.Bode_Codigo = ?) AND (T1.Cantidad_Diponible > 0) ORDER BY T1.Regional, T1.Centro_Id, T1.Alma_Modulo, T1.Alma_Codigo, T1.Bode_Codigo, T1.Elem_Consecutivo, T2.Tran_FechaRatificacion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006G3", "SELECT T1.Elem_Consecutivo, T1.UNIMED_COD, T2.UNIMED_DES FROM (ALM_ELEMENTO T1 INNER JOIN ALM_UNIDAD_MEDIDA T2 ON T2.UNIMED_COD = T1.UNIMED_COD) WHERE T1.Elem_Consecutivo = ? ORDER BY T1.Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006G4", "SELECT TDet_ListId, TDet_Consecutivo, Tran_Id, TDet_ValorAtributo FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? and TDet_Consecutivo = ? and TDet_ListId = 1 ORDER BY Tran_Id, TDet_Consecutivo, TDet_ListId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006G5", "SELECT TDet_ListId, TDet_Consecutivo, Tran_Id, TDet_ValorAtributo FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? and TDet_Consecutivo = ? and TDet_ListId = 2 ORDER BY Tran_Id, TDet_Consecutivo, TDet_ListId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006G6", "SELECT TDet_ListId, TDet_Consecutivo, Tran_Id, TDet_ValorAtributo FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? and TDet_Consecutivo = ? and TDet_ListId = 3 ORDER BY Tran_Id, TDet_Consecutivo, TDet_ListId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006G7", "SELECT TDet_ListId, TDet_Consecutivo, Tran_Id, TDet_ValorAtributo FROM ALM_DETALLE_TRANSACCIONATRIBUT WHERE Tran_Id = ? and TDet_Consecutivo = ? and TDet_ListId = 4 ORDER BY Tran_Id, TDet_Consecutivo, TDet_ListId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006G8", "SELECT Tran_Id, Tran_ConsecutivoCC FROM ALM_TRANSACCION WHERE Tran_Id = ? ORDER BY Tran_Id ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006G9", "SELECT T1.Num_Linea, T1.Trans_Id AS Trans_Id, T1.Regional, T1.Centro_Id, T1.Alma_Modulo, T1.Alma_Codigo, T1.Bode_Codigo, T1.Elem_Consecutivo, T1.Cantidad_Diponible, T2.Tran_FechaRatificacion AS Trans_FechaRatificacion FROM (ALM_INV_CON T1 INNER JOIN ALM_TRANSACCION T2 ON T2.Tran_Id = T1.Trans_Id) WHERE (T1.Regional = ? and T1.Centro_Id = ? and T1.Alma_Modulo = ? and T1.Alma_Codigo = ? and T1.Bode_Codigo = ? and T1.Elem_Consecutivo = ?) AND (T1.Cantidad_Diponible > 0) ORDER BY T1.Regional, T1.Centro_Id, T1.Alma_Modulo, T1.Alma_Codigo, T1.Bode_Codigo, T1.Elem_Consecutivo, T2.Tran_FechaRatificacion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("H006G10", "SELECT Num_Linea, Elem_Consecutivo, Trans_Id, Bode_Codigo, Alma_Codigo, Alma_Modulo, Centro_Id, Regional, Cantidad_Diponible FROM ALM_INV_CON WHERE Regional = ? and Centro_Id = ? and Alma_Modulo = ? and Alma_Codigo = ? and Bode_Codigo = ? and Trans_Id = ? and Elem_Consecutivo = ? and Num_Linea = ? ORDER BY Regional, Centro_Id, Alma_Modulo, Alma_Codigo, Bode_Codigo, Trans_Id, Elem_Consecutivo, Num_Linea ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("H006G11", "SELECT Elem_Consecutivo, Tipo_Codigo FROM ALM_ELEMENTO WHERE Elem_Consecutivo = ? ORDER BY Elem_Consecutivo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(8) ;
               ((int[]) buf[9])[0] = rslt.getInt(9) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2) ;
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2) ;
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(15) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((long[]) buf[6])[0] = rslt.getLong(7) ;
               ((long[]) buf[7])[0] = rslt.getLong(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 9);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setVarchar(6, (String)parms[5], 9);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 8);
               stmt.setVarchar(4, (String)parms[3], 2);
               stmt.setVarchar(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setVarchar(7, (String)parms[6], 9);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 9);
               return;
      }
   }

}

